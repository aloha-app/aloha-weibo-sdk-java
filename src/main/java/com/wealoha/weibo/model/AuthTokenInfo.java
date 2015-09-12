package com.wealoha.weibo.model;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * 
 * @author hongwei
 * @createTime 2015年9月12日 下午1:45:31
 */
public class AuthTokenInfo {

	private final String uid;

	private final String appkey;

	private final String scope;

	private final String createAt;

	private final String expireIn;

	public AuthTokenInfo(String uid, String appkey, String scope, String createAt,
			String expireIn) {
		super();
		this.uid = uid;
		this.appkey = appkey;
		this.scope = scope;
		this.createAt = createAt;
		this.expireIn = expireIn;
	}

	public String getUid() {
		return uid;
	}

	public String getAppkey() {
		new Date().getTime();
		return appkey;
	}

	public String getScope() {
		return scope;
	}

	public String getCreateAt() {
		return createAt;
	}

	public String getExpireIn() {
		return expireIn;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
