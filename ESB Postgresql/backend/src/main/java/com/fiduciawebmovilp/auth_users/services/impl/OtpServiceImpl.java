package com.fiduciawebmovilp.auth_users.services.impl;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.fiduciawebmovilp.auth_users.services.OtpService;
import com.fiduciawebmovilp.notification.dtos.NotificationDTO;
import com.fiduciawebmovilp.notification.services.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class OtpServiceImpl implements OtpService{
      // Almacenamiento temporal en memoria (Usar Redis o BD para entornos distribuidos)
    private final Map<String, String> cacheOtp = new ConcurrentHashMap<>();
    private final NotificationService notificationService;


    @Async
    public void generarYEnviarOtp(String email) {
        // 1. Generar OTP de 6 dígitos
        String otp = String.format("%06d", new Random().nextInt(999999));
        log.debug("OTP generado: {}", otp);
        // 2. Guardar en memoria con tiempo de expiración (ej. 5 minutos)
        cacheOtp.put(email, otp);
        log.debug("OTP almacenado en cache temporal");
        // 4. Enviar
        Map<String, Object> vars = new HashMap<>();
        vars.put("name", email);
        vars.put("otp", otp);

        NotificationDTO notificationDTO = NotificationDTO.builder()
                .recipient(email)
                .subject("Código de Autenticación - Operación Segura")
                .templateName("otp")
                .templateVariables(vars)
                .build();

        notificationService.sendEmailSolicitud(notificationDTO);        
        log.info("OTP enviado a {}: {}", email, otp);
    }

    // Método para validar el OTP ingresado por el usuario
    public boolean validarOtp(String email, String codigoIngresado) {
        String codigoAlmacenado = cacheOtp.get(email);
        return codigoAlmacenado != null && codigoAlmacenado.equals(codigoIngresado);
    }
  
}
