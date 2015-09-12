package com.wealoha.weibo.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author hongwei
 * @createTime 2015年9月12日 下午3:41:17
 */
public enum Gender {
	@SerializedName("m")
	Male("m"), //
	@SerializedName("f")
	Female("f");

	private final String value;

	private static Map<String, Gender> valuesMap;

	static {
		valuesMap = new HashMap<String, Gender>();
		for (Gender t : values()) {
			Gender exist = valuesMap.put(t.getValue(), t);
			if (exist != null) {
				throw new IllegalStateException("value冲突: " + exist + " " + t);
			}
		}
		valuesMap = Collections.unmodifiableMap(valuesMap);
	}

	private Gender(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static Gender fromValue(String value) {
		return valuesMap.get(value);
	}
}
