package com.wealoha.weibo;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

import com.wealoha.weibo.exception.AccessTokenUnauthorizedException;
import com.wealoha.weibo.model.AuthTokenInfo;

/**
 * 
 * 
 * @author hongwei
 * @createTime 2015年9月12日 下午12:07:54
 */
public interface WeiboOAuthService {

	/**
	 * 
	 * @param accessToken
	 * @return
	 */
	@FormUrlEncoded
	@POST(value = "/oauth2/get_token_info")
	public AuthTokenInfo getTokenInfo(@Field("access_token") String accessToken)
			throws AccessTokenUnauthorizedException;

}