package com.windchat.im.connector.codec.parser;

import com.windchat.common.channel.ChannelSession;

import io.netty.util.AttributeKey;

/**
 * bind ChannelSession to channel by AttributeKey
 * 
 * @author Sam{@link an.guoyue254@gmail.com}
 * @since 2018-01-08 16:14:29
 */
public class ChannelConst {

	public static final AttributeKey<ChannelSession> CHANNELSESSION = AttributeKey.valueOf("channelSession");

}
