package com.fiduciawebmovilp.notification.services;

import com.fiduciawebmovilp.fusuario.entity.FUsuario;
import com.fiduciawebmovilp.notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO, FUsuario user);
    void sendEmailSolicitud(NotificationDTO notificationDTO);
     void sendEmailSolicitudCuenta(NotificationDTO notificationDTO);
}
