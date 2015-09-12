package com.wealoha.weibo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wealoha.weibo.model.RelationResult;

public class WeiboRelationshipServiceTest {
	private static Logger logger;

	private static WeiboRelationshipService relationService;

	@BeforeClass
	public static void init() {
		logger = LoggerFactory.getLogger(WeiboRelationshipServiceTest.class);
		relationService = Weibo.getRelationshipService();
	}

	@Test
	public void test() {
		String accessToken = "2.00M1MgyCmXUOQD28306251900iIpOM";
		long uid = 2728902980l;

		Object object = null;
		object = relationService.getFans(accessToken, uid);

		logger.info("result = {}", object);
	}

	@Test
	public void testBatch() {
		String accessToken = "2.00M1MgyCmXUOQD28306251900iIpOM";
		long uid = 2728902980l;

		RelationResult result = relationService.getFriendsByCursor(accessToken,
				uid, 0, 1);
		int count = 0;
		int nextCursor = result.nextCursor;
		while (nextCursor != 0) {
			logger.info("time={}, nextCursor={}, users.size={}", count++,
					nextCursor, result.users.size());
			result = relationService.getFriendsByCursor(accessToken, uid,
					nextCursor, count);
			nextCursor = result.nextCursor;
		}
	}
}
