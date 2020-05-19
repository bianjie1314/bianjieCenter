package com.bianjie.common.enums;

/**
 *
 * 号码有关的状态
 * @author linmingxi
 * 2020/05/19
 **/
public enum PhoneStatus {

    NORMNAL_1(1,"可用"),
    ORDERING_2(2,"预约中"),
    ORDER_FINISHING_3(3,"已售卖");

    Integer key;
    String value;

    private PhoneStatus(Integer key,String value){
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
        for (PhoneStatus type : PhoneStatus.values()) {
            if (type.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static Integer getKey(String value) {
        for (PhoneStatus v : PhoneStatus.values()) {
            if (v.getValue().equals(value)) {
                return v.getKey();
            }
        }
        return null;
    }

    public static String getValue(Integer key) {
        for (PhoneStatus v : PhoneStatus.values()) {
            if (v.getKey().equals(key)) {
                return v.getValue();
            }
        }
        return null;
    }
}
