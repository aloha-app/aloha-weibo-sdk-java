package com.wealoha.weibo;

import retrofit.http.GET;
import retrofit.http.Query;

import com.wealoha.weibo.model.RelationResult;

/**
 * Weibo
 * 
 * @author hongwei
 * @createTime Dec 18, 2014 6:54:23 PM
 */
public interface WeiboRelationshipService {

	/**
	 * get user follows
	 * 
	 * @param accessToken
	 * @param userId
	 * @return
	 */
	@GET("/2/friendships/friends.json")
	public RelationResult getFriends(@Query("access_token") String accessToken,
			@Query("uid") long userId);

	@GET("/2/friendships/friends.json")
	public RelationResult getFriendsByCursor(
			@Query("access_token") String accessToken, @Query("uid") long uid,
			@Query("cursor") int intCursor, @Query("count") int count);

	/**
	 * get user's fans
	 * 
	 * @param accessToken
	 * @param userId
	 * @return
	 */
	@GET("/2/friendships/followers.json")
	public Object getFans(@Query("access_token") String accessToken,
			@Query("uid") long userId);

	@GET("/2/friendships/followers.json")
	public RelationResult getFansByCursor(
			@Query("access_token") String accessToken, @Query("uid") long uid,
			@Query("cursor") int intCursor, @Query("count") int count);

}
