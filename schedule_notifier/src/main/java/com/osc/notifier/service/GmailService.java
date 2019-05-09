package com.osc.notifier.service;

import com.osc.notifier.domain.Notification;

public interface GmailService {

	public void sendEmail(Notification noti);

}
