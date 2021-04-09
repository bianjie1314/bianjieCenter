package com.dhd.third.jingdong.utils;

/**
 * 有关服务的地址说明
 * @author linmingxi
 * 2020/12/19
 */
public enum ApiConstant {

    APP_KEY("4bed701350ce0c887b74fef3edb0bbda","AppKey"),
    APP_SECRET("8a5ccc3be401449dbedd251880cdfc03","AppSecret"),
    HTTP_SERVICE("http://api.jd.com/routerjson","正式环境HTTP"),
    HTTPS_SERVICE("https://api.jd.com/routerjson","正式环境HTTPS");

    private String key;
    private String value;

    ApiConstant(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
