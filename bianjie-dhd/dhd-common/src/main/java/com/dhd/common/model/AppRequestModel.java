package com.dhd.common.model;

import java.util.Map;

/**
 * App请求体
 * @author linmingxi
 * 2021/01/22
 */
public class AppRequestModel {

    //序列号
    private String tid;
    //签名
    private String sign;
    //key
    private String appKey;
    //时间戳
    private Long timestamp;
    //app版本
    private int v;
    //参数
    private Map param;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Map getParam() {
        return param;
    }

    public void setParam(Map param) {
        this.param = param;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
