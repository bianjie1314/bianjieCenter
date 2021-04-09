package com.dhd.gateway.filter;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.bianjie.common.response.RespBody;
import com.bianjie.common.response.RespCode;
import com.bianjie.common.utils.SHA;
import com.dhd.common.model.AppRequestModel;
import com.dhd.common.model.AppResponseModel;
import com.dhd.gateway.model.MD5Util;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 第三方调用参数非法检验
 */
@Component
public class IllegalCheckPreFilter extends ZuulFilter {
    private Logger logger = LoggerFactory.getLogger(IllegalCheckPreFilter.class);

    @Value("${app.requestExpire}")
    private Long requestExpire;

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER - 4;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    //需要修正返回的http状态码，目前的设置无效,将setSendZuulResponse设置为false时,即可采用自定义的状态码
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        InputStream in;
        try {
            in = request.getInputStream();
            String method = request.getMethod();
            String interfaceMethod = request.getServletPath();
            //统一返回200
            ctx.setResponseStatusCode(HttpStatus.OK.value());
            logger.info("请求ip={},方法method={},URL={}",request.getRemoteAddr(),method,interfaceMethod);
            if (!"POST".equals(method.toUpperCase())) {
                errorMessage(ctx, AppResponseModel.getInstance(null,new RespBody(RespCode.CODE_10502)));
                return null;
            }
            String reqBody = StreamUtils.copyToString(in, Charset.forName("UTF-8"));
            logger.info("请求参数={}",reqBody);
//            if("GET".equals(request.getMethod())){
//                JSONObject paramJson = new JSONObject();
//                Enumeration<String> enumeration = request.getParameterNames();
//                while (enumeration.hasMoreElements()){
//                    String paramName = enumeration.nextElement();
//                    paramJson.put(paramName,request.getParameter(paramName));
//                }
//                reqBody = paramJson.toJSONString();
//            }else if("POST".equals(request.getMethod())){
//                try {
//                    reqBody = StreamUtils.copyToString(in, Charset.forName("UTF-8"));
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }else {
//                errorMessage(ctx, RespCode.CODE_10502);
//                return null;
//            }

            //打印请求json参数
            if (!StringUtils.isEmpty(reqBody)) {
                String conType = request.getHeader("content-type");
                if (conType.toLowerCase().contains("application/json")) {
                    //默认content-type传json-->application/json
                    Object invokeUserObject;
                    AppRequestModel appRequestModel = JSONObject.parseObject(reqBody, AppRequestModel.class);
                    String  appKey = appRequestModel.getAppKey();
                    String sign = appRequestModel.getSign();
                    Long timestamp = appRequestModel.getTimestamp();
                    //鉴权参数为空判断
                    if (StringUtils.isEmpty(appKey) || StringUtils.isEmpty(sign) || timestamp == null) {
                        errorMessage(ctx, AppResponseModel.getInstance(appRequestModel.getTid(),new RespBody(RespCode.CODE_10502)));
                        return null;
                    } else {
                        long times = Long.valueOf(timestamp.toString());
                        long intervalTime = new Date().getTime() - times;
                        //请求超过指定时间就过期，不允许调用
//                        if (intervalTime < 0 || (intervalTime>0 && intervalTime > (requestExpire * 60 * 1000))) {
//                            logger.error("请求时间戳不通过:param={}",JSONObject.toJSONString(appRequestModel));
//                            errorMessage(ctx, AppResponseModel.getInstance(appRequestModel.getTid(),new RespBody(RespCode.CODE_10502)));
//                            return null;
//                        }
                        //对比签名,用treeMap，定义字段排序
                        TreeMap treeMap = new TreeMap();
                        treeMap.putAll(appRequestModel.getParam());
                        Iterator iterator = treeMap.entrySet().iterator();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(appKey);
                        while (iterator.hasNext()) {
                            Map.Entry entry = (Map.Entry) iterator.next();
                            String key = (String) entry.getKey();
                            String value = (String) entry.getValue();
                            stringBuilder.append(key).append(value);
                        }
                        String localSign = SHA.getSHA(MD5Util.md5(stringBuilder.toString().toUpperCase()).toUpperCase()).toUpperCase();
                        if (!sign.equals(localSign)) {
                            logger.error("签名不合法:param={}",JSONObject.toJSONString(appRequestModel));
                            errorMessage(ctx, AppResponseModel.getInstance(appRequestModel.getTid(),new RespBody(RespCode.CODE_10503)));
                        } else {
                            ctx.setSendZuulResponse(true); //将请求往后转发
                        }
                    }
                } else {
                    logger.error("请求方式不支持:ip={},method={},param={}",request.getRemoteAddr(),method);
                    //不支持的请求类型
                    errorMessage(ctx, AppResponseModel.getInstance(null,new RespBody(RespCode.CODE_10502)));
                    return null;
                }
            }
        } catch (Exception e) {
            logger.error("参数转换流异常error={}", e);
        }
        return null;
    }

    private void errorMessage(RequestContext ctx, AppResponseModel appResponseModel) {
        logger.error("respCode={}", appResponseModel);
        ctx.setResponseStatusCode(HttpStatus.OK.value());
        ctx.getResponse().setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        ctx.setResponseBody(new String(JSONObject.toJSONString(appResponseModel, SerializerFeature.WriteMapNullValue).getBytes(), Charset.forName("utf-8")));
        //将结果立即返回,不再进一步操作
        ctx.setSendZuulResponse(false);
    }
}