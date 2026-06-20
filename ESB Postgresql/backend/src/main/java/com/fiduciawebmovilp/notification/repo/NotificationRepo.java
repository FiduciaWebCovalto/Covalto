package com.fiduciawebmovilp.notification.repo;

import com.fiduciawebmovilp.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NotificationRepo extends JpaRepository<Notification, Long> {
}
