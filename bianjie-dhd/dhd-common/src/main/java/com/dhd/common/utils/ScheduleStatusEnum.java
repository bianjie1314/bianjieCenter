package com.dhd.common.utils;

/**
 * 定时状态
 * @author linmingxi
 * 2021/04/09
 */
public enum ScheduleStatusEnum {

    NORMAL(1,"正常"),
    DISABLED(2,"禁用");


    private Integer key;

    private String value;

    private ScheduleStatusEnum(Integer key, String value) {
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
        for (ScheduleStatusEnum type : ScheduleStatusEnum.values()) {
            if (type.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static String getValue(Integer key) {
        for (ScheduleStatusEnum v : ScheduleStatusEnum.values()) {
            if (v.getKey().equals(key)) {
                return v.getValue();
            }
        }
        return null;
    }

}
