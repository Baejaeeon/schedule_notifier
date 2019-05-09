package com.osc.notifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScheduleNotifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleNotifierApplication.class, args);
	}
}
