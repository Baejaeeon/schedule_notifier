package com.osc.notifier.service;

import com.osc.notifier.domain.Notification;

public interface SlackService {

	public void sendMessage(Notification noti);

}
