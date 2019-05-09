package com.osc.notifier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osc.notifier.domain.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

	public List<Notification> findByNotification(String notification);

}
