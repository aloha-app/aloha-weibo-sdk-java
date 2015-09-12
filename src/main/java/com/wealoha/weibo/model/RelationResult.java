package com.wealoha.weibo.model;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * @author hongwei
 * @createTime Dec 18, 2014 6:47:59 PM
 */
public class RelationResult {

	public List<User> users;

	public int nextCursor;

	public int previousCursor;

	public int totalNumber;

	public String errorCode;

	public String error;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
