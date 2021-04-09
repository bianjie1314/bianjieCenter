package com.dhd.common.utils;

/**
 * 用户转台
 */
public enum UserStatus {

	NORMAL(1, "正常"),

	DISABLE(2, "禁用");

	private Integer key;

	private String value;

	private UserStatus(Integer key, String value) {
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
		for (UserStatus type : UserStatus.values()) {
			if (type.getKey().equals(key)) {
				return true;
			}
		}
		return false;
	}

	public static String getValue(Integer key) {
		for (UserStatus v : UserStatus.values()) {
			if (v.getKey().equals(key)) {
				return v.getValue();
			}
		}
		return null;
	}
}
