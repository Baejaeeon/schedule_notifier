package com.osc.notifier.service.serviceImpl;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.osc.notifier.domain.Notification;
import com.osc.notifier.service.GmailService;

@Service
public class GmailServiceImpl implements GmailService {

	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(GmailServiceImpl.class);

	@Autowired
	public JavaMailSender emailSender;

	@Value("${notification.gmail.target}")
	private String target;

	@Override
	public void sendEmail(Notification noti) {
		// TODO Auto-generated method stub
		String subject = "[OSC 문의 알림]";

		// set data
		StringBuffer buffer = new StringBuffer();
		buffer.append("[OSC Notification]").append(System.getProperty("line.separator"))
				.append("company : " + noti.getCompany()).append(System.getProperty("line.separator"))
				.append("name : " + noti.getName()).append(System.getProperty("line.separator"))
				.append("contact : " + noti.getPhone() + " [" + noti.getMail() + "]").append(System.getProperty("line.separator"))
				.append(System.getProperty("line.separator"))
				.append("contents : ").append(System.getProperty("line.separator"))
				.append(noti.getContent());

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(target);
		message.setSubject(subject);
		message.setText(buffer.toString());

		logger.debug("message=[{}]", message);

		// send mail
		emailSender.send(message);
	}
}
