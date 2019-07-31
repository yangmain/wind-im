package com.windchat.im.storage.api;

import java.sql.SQLException;
import java.util.List;

import com.windchat.im.storage.bean.ApplyFriendBean;
import com.windchat.im.storage.bean.ApplyUserBean;

public interface IFriendApplyDao {

	boolean saveApply(String siteUserId, String siteFriendId, String applyReason) throws SQLException;

	boolean deleteApply(String siteUserId, String siteFriendId) throws SQLException;

	int getApplyCount(String siteUserId, String siteFriendId) throws SQLException;

	ApplyFriendBean getApplyInfo(String siteUserId, String siteFriendId, boolean isMaster) throws SQLException;

	List<ApplyUserBean> getApplyUsers(String siteUserId) throws SQLException;

	int getApplyCount(String siteUserId) throws SQLException;

}
