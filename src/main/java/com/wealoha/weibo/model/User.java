package com.wealoha.weibo.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author hongwei
 * @createTime Dec 18, 2014 6:18:04 PM
 * @see <a href="http://open.weibo.com/wiki/2/users/show">Weibo:API:userInfo</a>
 */
public class User {

	private final Long id;
	private final String name;
	private final String screen_name;
	private final String province;
	private final String city;
	private final String location;
	private final String description;
	private final String url;
	private final String profileImageUrl;
	private final String domain;
	@SerializedName("gender")
	private final Gender gender;
	private final int followersCount;
	private final int friendsCount;
	private final int statusesCount;
	private final int favouritesCount;
	private final String createdAt;
	private final boolean allowAllActMsg;
	private final boolean geoEnabled;
	private final boolean verified;
	private final int verifiedType;
	private final String remark;
	private final String statusId;
	private final String ptype;
	private final boolean allowAllComment;
	private final String avatarLarge;
	private final String avatarHd;
	private final String verifiedReason;
	private final String verifiedTrade;
	private final String verifiedReasonUrl;
	private final String verifiedSource;
	private final String verifiedSourceUrl;
	private final boolean followMe;
	private final int onlineStatus;// 1 online,
	private final int biFollowersCount;
	private final String lang;
	private final String star;
	private final String mbtype;
	private final String mbrank;
	private final String block_word;
	private final String blockApp;
	private final String creditScore;
	private final String userAbility;
	private final String urank;

	public User(Long id, String name, String screen_name, String province,
			String city, String location, String description, String url,
			String profileImageUrl, String domain, Gender gender,
			int followersCount, int friendsCount, int statusesCount,
			int favouritesCount, String createdAt, boolean allowAllActMsg,
			boolean geoEnabled, boolean verified, int verifiedType,
			String remark, String statusId, String ptype,
			boolean allowAllComment, String avatarLarge, String avatarHd,
			String verifiedReason, String verifiedTrade,
			String verifiedReasonUrl, String verifiedSource,
			String verifiedSourceUrl, boolean followMe, int onlineStatus,
			int biFollowersCount, String lang, String star, String mbtype,
			String mbrank, String block_word, String blockApp,
			String creditScore, String userAbility, String urank) {
		super();
		this.id = id;
		this.name = name;
		this.screen_name = screen_name;
		this.province = province;
		this.city = city;
		this.location = location;
		this.description = description;
		this.url = url;
		this.profileImageUrl = profileImageUrl;
		this.domain = domain;
		this.gender = gender;
		this.followersCount = followersCount;
		this.friendsCount = friendsCount;
		this.statusesCount = statusesCount;
		this.favouritesCount = favouritesCount;
		this.createdAt = createdAt;
		this.allowAllActMsg = allowAllActMsg;
		this.geoEnabled = geoEnabled;
		this.verified = verified;
		this.verifiedType = verifiedType;
		this.remark = remark;
		this.statusId = statusId;
		this.ptype = ptype;
		this.allowAllComment = allowAllComment;
		this.avatarLarge = avatarLarge;
		this.avatarHd = avatarHd;
		this.verifiedReason = verifiedReason;
		this.verifiedTrade = verifiedTrade;
		this.verifiedReasonUrl = verifiedReasonUrl;
		this.verifiedSource = verifiedSource;
		this.verifiedSourceUrl = verifiedSourceUrl;
		this.followMe = followMe;
		this.onlineStatus = onlineStatus;
		this.biFollowersCount = biFollowersCount;
		this.lang = lang;
		this.star = star;
		this.mbtype = mbtype;
		this.mbrank = mbrank;
		this.block_word = block_word;
		this.blockApp = blockApp;
		this.creditScore = creditScore;
		this.userAbility = userAbility;
		this.urank = urank;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getScreen_name() {
		return screen_name;
	}

	public String getProvince() {
		return province;
	}

	public String getCity() {
		return city;
	}

	public String getLocation() {
		return location;
	}

	public String getDescription() {
		return description;
	}

	public String getUrl() {
		return url;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public String getDomain() {
		return domain;
	}

	public Gender getGender() {
		return gender;
	}

	public int getFollowersCount() {
		return followersCount;
	}

	public int getFriendsCount() {
		return friendsCount;
	}

	public int getStatusesCount() {
		return statusesCount;
	}

	public int getFavouritesCount() {
		return favouritesCount;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public boolean isAllowAllActMsg() {
		return allowAllActMsg;
	}

	public boolean isGeoEnabled() {
		return geoEnabled;
	}

	public boolean isVerified() {
		return verified;
	}

	public int getVerifiedType() {
		return verifiedType;
	}

	public String getRemark() {
		return remark;
	}

	public String getStatusId() {
		return statusId;
	}

	public String getPtype() {
		return ptype;
	}

	public boolean isAllowAllComment() {
		return allowAllComment;
	}

	public String getAvatarLarge() {
		return avatarLarge;
	}

	public String getAvatarHd() {
		return avatarHd;
	}

	public String getVerifiedReason() {
		return verifiedReason;
	}

	public String getVerifiedTrade() {
		return verifiedTrade;
	}

	public String getVerifiedReasonUrl() {
		return verifiedReasonUrl;
	}

	public String getVerifiedSource() {
		return verifiedSource;
	}

	public String getVerifiedSourceUrl() {
		return verifiedSourceUrl;
	}

	public boolean isFollowMe() {
		return followMe;
	}

	public int getOnlineStatus() {
		return onlineStatus;
	}

	public int getBiFollowersCount() {
		return biFollowersCount;
	}

	public String getLang() {
		return lang;
	}

	public String getStar() {
		return star;
	}

	public String getMbtype() {
		return mbtype;
	}

	public String getMbrank() {
		return mbrank;
	}

	public String getBlock_word() {
		return block_word;
	}

	public String getBlockApp() {
		return blockApp;
	}

	public String getCreditScore() {
		return creditScore;
	}

	public String getUserAbility() {
		return userAbility;
	}

	public String getUrank() {
		return urank;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
