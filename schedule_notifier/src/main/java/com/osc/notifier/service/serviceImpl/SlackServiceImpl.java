package com.osc.notifier.service.serviceImpl;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.osc.notifier.domain.Notification;
import com.osc.notifier.service.SlackService;

@Service
public class SlackServiceImpl implements SlackService {
	
	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(SlackService.class);
	
	@Value("${notification.slack.webhookUrl}")
	private String webhookUrl;
	
	@Override
	public void sendMessage(Notification noti) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		
		// set data
		StringBuffer buffer = new StringBuffer();
		buffer.append("[OSC Notification]").append(System.getProperty("line.separator"))
		.append("company : " + noti.getCompany()).append(System.getProperty("line.separator"))
		.append("name : " + noti.getName()).append(System.getProperty("line.separator"))
		.append("contact : " + noti.getPhone() + " [" + noti.getMail() + "]").append(System.getProperty("line.separator"))
		.append(System.getProperty("line.separator"))
		.append("contents : ").append(System.getProperty("line.separator"))
		.append(noti.getContent());
		
		String data = "{ \"text\": \"```" + buffer + "```\" }";
		
		//MultiValueMap<String, String> dataMap = new LinkedMultiValueMap<String, String>();
		//dataMap.add("text", da);
		
		//HttpEntity<MultiValueMap<String, String>> req = new HttpEntity<MultiValueMap<String, String>>(dataMap, headers);
		HttpEntity<String> entity = new HttpEntity<String>(data, headers);
		
		logger.debug("entity=[{}]", entity);
		
		 //ResponseEntity<String> result = restTemplate.exchange(webhookUrl, HttpMethod.POST, entity, String.class);
		restTemplate.postForObject(webhookUrl, entity, String.class);
	}
}
