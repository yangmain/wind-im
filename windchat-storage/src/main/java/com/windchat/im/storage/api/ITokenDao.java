package com.windchat.im.storage.api;

import java.sql.SQLException;

import com.windchat.im.storage.bean.ExpireToken;

public interface ITokenDao {

	boolean addToken(ExpireToken bean) throws SQLException;

	ExpireToken getExpireToken(String token) throws SQLException;

	ExpireToken getExpireTokenByBid(String bid, long time) throws SQLException;

}
