package com.windchat.im.business.impl;

import com.akaxin.common.command.Command;
import com.akaxin.common.command.CommandResponse;

public interface IRequestService {
	public CommandResponse execute(Command command);
}
