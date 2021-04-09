package com.bianjie.common.response;


import com.alibaba.fastjson.JSONObject;
import com.bianjie.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RespBodyBuilder {

    protected Logger LOG = LoggerFactory.getLogger(getClass());

    public static String toCommonSuccess() {
        RespBody body = new RespBody();
        return JsonUtil.convertObject2Json(body);
    }

    public static String toSuccessWithObject(Object data) {
        RespBody body = new RespBody(data);
        return JsonUtil.convertObject2Json(body);
    }

    public static String toError(RespCode code) {
        JSONObject error = new JSONObject();
        error.put("errorCode", code.getCode());
        error.put("errorMsg", code.getMsg());
        RespBody respBody = new RespBody(RespCode.CODE_10500, error);
        return JsonUtil.convertObject2Json(respBody);
    }

    public static String toError(int code, String msg) {
        JSONObject error = new JSONObject();
        error.put("errorCode", code);
        error.put("errorMsg", msg);
        RespBody respBody = new RespBody(RespCode.CODE_10500, error);
        return JsonUtil.convertObject2Json(respBody);
    }
}
