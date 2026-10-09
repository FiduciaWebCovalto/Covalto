package com.fiduciawebmovil.mensajeria.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;


@Service
@Slf4j
public class MensajeriaServiceImpl implements MensajeriaService {
    @Autowired
    private JavaMailSender mailSender;


    public void sendEmail(String to, String subject, String name) {
        MimeMessage message = mailSender.createMimeMessage();
        
        // true indica que el mensaje es multipart (soporta HTML)
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(message, true, "UTF-8");
            String htmlBody = "<html><body>" +
                            "<h2>¡Hola, " + name + "!</h2>" +
                            "<p>Este es un correo <b>formateado</b> enviado desde Hostinger.</p>" +
                            "<table border='1'><tr><td>Campo</td><td>Valor</td></tr>" +
                            "<tr><td>Estado</td><td>Exitoso</td></tr></table>" +
                            "<br><a href='https://www.trustechcapitalmexico.com'>Visitar sitio</a>" +
                            "</body></html>";

                    helper.setFrom("ventas@trustechcapitalmexico.com");
                    helper.setTo(to);
                    helper.setSubject(subject);
                    helper.setText(htmlBody, true); // 'true' activa HTML

                    mailSender.send(message);            
        } catch (MessagingException e) {
            log.error("Error al enviar correo", e);
        }

        
    }

}









