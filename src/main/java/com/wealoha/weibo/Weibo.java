package com.wealoha.weibo;

import org.apache.commons.lang3.StringUtils;

import retrofit.ErrorHandler;
import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;
import retrofit.RetrofitError;
import retrofit.converter.GsonConverter;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wealoha.weibo.exception.AccessTokenUnauthorizedException;

/**
 * 
 * @author hongwei
 * @createTime 2015年9月12日 下午12:10:11
 */
public class Weibo {

	// private static Logger logger = LoggerFactory.getLogger(Weibo.class);

	public final static String WEBSITE_URL = "http://wealoha.com/";

	private static RestAdapter restAdapter;

	private static WeiboOAuthService weiboOAuthService;

	private static WeiboRelationshipService weiboRelationshipService;

	static {
		Gson gson = new GsonBuilder() //
				.setFieldNamingPolicy(
						FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES) //
				.create();
		restAdapter = new RestAdapter.Builder() //
				.setEndpoint("https://api.weibo.com") //
				.setConverter(new GsonConverter(gson, "UTF-8")) //
				.setLogLevel(LogLevel.BASIC) //
				.setErrorHandler(new ErrorHandler() {

					public Throwable handleError(RetrofitError cause) {
						if (StringUtils.equals("401 Unauthorized",
								cause.getMessage())) {
							return new AccessTokenUnauthorizedException(401,
									"Unauthorized access token.");
						}

						return cause;
					}
				}).build();

		weiboOAuthService = restAdapter.create(WeiboOAuthService.class);
		weiboRelationshipService = restAdapter
				.create(WeiboRelationshipService.class);
	}

	public static WeiboOAuthService getOAuthService() {
		return weiboOAuthService;
	}

	public static WeiboRelationshipService getRelationshipService() {
		return weiboRelationshipService;
	}
}
