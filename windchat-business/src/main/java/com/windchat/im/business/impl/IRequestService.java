package com.windchat.im.business.impl;

import com.windchat.common.command.Command;
import com.windchat.common.command.CommandResponse;

public interface IRequestService {
	public CommandResponse execute(Command command);
}
