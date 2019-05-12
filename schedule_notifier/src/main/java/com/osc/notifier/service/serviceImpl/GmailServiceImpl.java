package com.osc.notifier.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.osc.notifier.domain.Notification;
import com.osc.notifier.service.GmailService;

@Service
public class GmailServiceImpl implements GmailService {

	@Override
	public void sendEmail(Notification noti) {
		// TODO Auto-generated method stub
		System.err.println("gmail test");
	}
}
