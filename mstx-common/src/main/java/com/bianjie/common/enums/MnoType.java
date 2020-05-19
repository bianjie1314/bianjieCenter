package com.bianjie.common.enums;

/**
 *
 * 号码有关的状态
 * @author linmingxi
 * 2020/05/19
 **/
public enum MnoType {

    // 中国移动
    CHINA_MOBILE_1(1, "中国移动"),
    // 中国联通
    CHINA_TELECOM_2(2, "中国联通"),
    // 中国电信
    CHINA_UNICOM_3(3, "中国电信"),

    CHINA_RT_4(4, "中国广电"),

    CHINA_ALL_5(5, "全网通");

    Integer key;
    String value;

    private MnoType(Integer key, String value){
        this.key = key;
        this.value = value;
    }


    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static boolean isContain(Integer key) {
        if (key == null) {
            return false;
        }
        for (MnoType type : MnoType.values()) {
            if (type.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static Integer getKey(String value) {
        for (MnoType v : MnoType.values()) {
            if (v.getValue().equals(value)) {
                return v.getKey();
            }
        }
        return null;
    }

    public static String getValue(Integer key) {
        for (MnoType v : MnoType.values()) {
            if (v.getKey().equals(key)) {
                return v.getValue();
            }
        }
        return null;
    }
}
