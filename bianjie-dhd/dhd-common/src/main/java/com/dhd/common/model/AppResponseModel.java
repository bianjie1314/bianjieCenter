package com.dhd.common.model;

import com.bianjie.common.response.RespBody;

/**
 *
 * App响应体
 * @author linmingxi
 * 2021/01/22
 */
public class AppResponseModel {

    //序列号
    private String tid;
    //签名
    private String sign;
    //时间戳
    private Long timestamp = System.currentTimeMillis();
    //返回结果
    private RespBody resultData;

    private AppResponseModel() {
    }

    private AppResponseModel(RespBody resultData) {
        this.resultData = resultData;
    }

    private AppResponseModel(String tid, String sign, RespBody resultData) {
        this.tid = tid;
        this.sign = sign;
        this.resultData = resultData;
    }

    public static AppResponseModel getInstance(String tid, RespBody respBody){
        return new AppResponseModel(tid,null,respBody);
    }

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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public RespBody getResultData() {
        return resultData;
    }

    public void setResultData(RespBody resultData) {
        this.resultData = resultData;
    }
}
