package com.wealoha.weibo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wealoha.weibo.exception.AccessTokenUnauthorizedException;
import com.wealoha.weibo.model.AuthTokenInfo;

/**
 * 
 * 
 * @author hongwei
 * @createTime 2015年9月12日 下午1:56:13
 */
public class WeiboOAuthServiceTest {

	@Test
	public void test() {

		Logger logger = LoggerFactory.getLogger(getClass());

		WeiboOAuthService oAuthService = Weibo.getOAuthService();
		AuthTokenInfo object = null;
		try {
			object = oAuthService
					.getTokenInfo("2.0062to6CmXUOQD5bf9b6e624Fh1XDD");
		} catch (AccessTokenUnauthorizedException t) {
			logger.info("token invalid");
		}

		logger.info("result = {}", object);
	}
}
