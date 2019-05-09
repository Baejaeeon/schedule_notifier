package com.osc.notifier.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osc.notifier.domain.Notification;
import com.osc.notifier.repository.NotificationRepository;
import com.osc.notifier.service.NotificationService;

import java.util.*;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;
	
	@Override
	public void sendNotification() {
		// TODO Auto-generated method stub
		Notification notification = new Notification();
		notification.setNotification("Y");
		
		List<Notification> notificationList = notificationRepository.findByNotification(notification.getNotification());
		 
		for (Notification temp : notificationList) {
			System.out.println(temp.toString());
		}
	}
}