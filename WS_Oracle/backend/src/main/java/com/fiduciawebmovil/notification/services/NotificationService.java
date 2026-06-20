package com.fiduciawebmovil.notification.services;

import com.fiduciawebmovil.notification.dtos.NotificationDTO;
import com.fiduciawebmovil.usuarios.entity.Usuarios;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO, Usuarios user);
    void sendEmailSolicitud(NotificationDTO notificationDTO);
    void sendEmailSolicitudCuenta(NotificationDTO notificationDTO);
}
