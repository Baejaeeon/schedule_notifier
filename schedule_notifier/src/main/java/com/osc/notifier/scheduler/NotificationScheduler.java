package com.osc.notifier.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.osc.notifier.service.GmailService;
import com.osc.notifier.service.NotificationService;
import com.osc.notifier.service.SlackService;

@Component
public class NotificationScheduler {
	
	@Autowired
	NotificationService notificationService;

	// 5분 마다 게시물 확인해서 Slack & Gmail 전송
	@Scheduled(cron = "0 0/5 * * * ?")
	public void notifier() {
		notificationService.sendNotification();
	}
}
