package com.windchat.im.storage.dao.config;

/**
 * 数据库配置中的KEY
 * 
 * @author Sam{@link an.guoyue254@gmail.com}
 * @since 2018-06-09 12:51:54
 */
public interface JdbcConst {

	String WINDCHAT_EDITION = "windchat.edition";

	String SQLITE_URL = "windchat.sqlite.url";

	// ----------------------MASTER--------------------
	String MYSQL_HOST = "windchat.mysql.host";
	String MYSQL_PORT = "windchat.mysql.port";
	String MYSQL_DB = "windchat.mysql.database";

	String MYSQL_USER_NAME = "windchat.mysql.username";
	String MYSQL_PASSWORD = "windchat.mysql.password";
	String MYSQL_INITIAL_SIZE = "windchat.mysql.initial-size";
	String MYSQL_MAX_SIZE = "windchat.mysql.max-size";
	String MYSQL_MAX_IDLE = "windchat.mysql.max-idle";

	String MYSQL_USE_UNICODE = "windchat.mysql.useUnicode";
	String MYSQL_CHARACTER_ENCODING = "windchat.mysql.characterEncoding";
	String MYSQL_VERIFY_SERVER_CERTIFICATE = "windchat.mysql.verifyServerCertificate";
	String MYSQL_USE_SSL = "windchat.mysql.useSSL";

	// ----------------------SLAVE--------------------
	String MYSQL_SLAVE_HOST = "windchat.mysql.slave.host";
	String MYSQL_SLAVE_PORT = "windchat.mysql.slave.port";
	String MYSQL_SLAVE_DB = "windchat.mysql.slave.database";

	String MYSQL_SLAVE_USER_NAME = "windchat.mysql.slave.username";
	String MYSQL_SLAVE_PASSWORD = "windchat.mysql.slave.password";
	String MYSQL_SLAVE_INITIAL_SIZE = "windchat.mysql.slave.initial-size";
	String MYSQL_SLAVE_MAX_SIZE = "windchat.mysql.slave.max-size";
	String MYSQL_SLAVE_MAX_IDLE = "windchat.mysql.slave.max-idle";

	String MYSQL_SLAVE_USE_UNICODE = "windchat.mysql.slave.useUnicode";
	String MYSQL_SLAVE_CHARACTER_ENCODING = "windchat.mysql.slave.characterEncoding";
	String MYSQL_SLAVE_VERIFY_SERVER_CERTIFICATE = "windchat.mysql.slave.verifyServerCertificate";
	String MYSQL_SLAVE_USE_SSL = "windchat.mysql.slave.useSSL";
}
