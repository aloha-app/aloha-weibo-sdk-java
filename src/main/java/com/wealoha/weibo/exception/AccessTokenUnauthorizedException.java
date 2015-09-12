package com.wealoha.weibo.exception;

/**
 * Access token unauthorized
 * 
 * @author hongwei
 * @createTime 2015年9月12日 下午2:27:20
 */
public class AccessTokenUnauthorizedException extends Exception {

	private static final long serialVersionUID = 2278947716224344244L;

	private final int errorCode;

	public AccessTokenUnauthorizedException(int errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public AccessTokenUnauthorizedException(int errorCode, String message,
			Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public AccessTokenUnauthorizedException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

}
