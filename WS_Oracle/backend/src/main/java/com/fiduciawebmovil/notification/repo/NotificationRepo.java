package com.fiduciawebmovil.notification.repo;

import com.fiduciawebmovil.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NotificationRepo extends JpaRepository<Notification, Long> {
}
