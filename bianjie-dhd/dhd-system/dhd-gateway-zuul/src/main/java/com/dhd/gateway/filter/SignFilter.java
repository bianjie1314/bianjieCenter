package com.dhd.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;

/**
 * 签名校验
 * @author linmingxi
 * 2020/12/24
 */
//@Component
public class SignFilter extends ZuulFilter {
 
    private static final Logger LOGGER = LoggerFactory.getLogger(SignFilter.class);

    @Value("${appkey}")
    String appkey;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }
 
    /**
     * 自定义的过滤器逻辑，当shouldFilter()返回true时会执行。
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String requestURI = request.getRequestURI();
//        SignUtil.getSign()

        String remoteHost = request.getRemoteHost();
        String method = request.getMethod();
        LOGGER.info("remoteHost:{},method:{},requestURI:{}", remoteHost, method, requestURI);
        return null;
    }
}
