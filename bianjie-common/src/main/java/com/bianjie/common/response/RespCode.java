package com.bianjie.common.response;

public enum RespCode {


    CODE_200(200, "success"),
    CODE_10500(10500, "error"),
    CODE_10501(10501, "系统繁忙 ，稍后再试"),
    CODE_10502(10502, "参数不符合规范"),
    CODE_10503(10503, "签名不符合规范"),
    CODE_10504(10504, "请求第三方服务处理失败"),
    CODE_10506(10506, "无权限操作"),
    CODE_10507(10507, "帐号或密码错误"),
    CODE_10508(10508, "帐号非可用状态"),
    CODE_10509(10509, "短信验证码错误或已失效，请重新输入"),
    CODE_10510(10510, "处理失败，请稍后再试");



    private Integer code;

    private String msg;


    RespCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }

}
