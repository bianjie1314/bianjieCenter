package com.bianjie.common.enums;

/**
 *
 * 号码套餐的状态
 * @author linmingxi
 * 2020/05/19
 **/
public enum PhonePackageStatus {

    ENABLE_1(1,"可用"),
    DISENABLE_2(2,"预约中");

    Integer key;
    String value;

    private PhonePackageStatus(Integer key, String value){
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
        for (PhonePackageStatus type : PhonePackageStatus.values()) {
            if (type.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static Integer getKey(String value) {
        for (PhonePackageStatus v : PhonePackageStatus.values()) {
            if (v.getValue().equals(value)) {
                return v.getKey();
            }
        }
        return null;
    }

    public static String getValue(Integer key) {
        for (PhonePackageStatus v : PhonePackageStatus.values()) {
            if (v.getKey().equals(key)) {
                return v.getValue();
            }
        }
        return null;
    }
}
