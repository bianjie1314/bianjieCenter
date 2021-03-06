package com.bianjie.common.response;


import com.alibaba.fastjson.JSONObject;

public class RespBody {

    private int code;
    private String msg;
    private Object data;

    public RespBody() {
        this(RespCode.CODE_200.getCode(), RespCode.CODE_200.getMsg(), new JSONObject());
    }

    public RespBody(Object data) {
        this(RespCode.CODE_200.getCode(), RespCode.CODE_200.getMsg(), data);
    }

    public RespBody(RespCode code) {
        this(code.getCode(), code.getMsg(), new JSONObject());
    }

    public RespBody(int code,String msg) {
        this(code, msg, new JSONObject());
    }

    public RespBody(RespCode code, Object data) {
        this(code.getCode(), code.getMsg(), data);
    }

    private RespBody(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
