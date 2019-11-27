package com.windchat.im.business.api;

import com.windchat.common.command.Command;
import com.windchat.common.command.CommandResponse;

public interface IRequest {

	public CommandResponse process(Command command);

}
