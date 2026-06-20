package com.fiduciawebmovil.notification.services;


import com.fiduciawebmovil.enums.NotificationType;
import com.fiduciawebmovil.notification.dtos.NotificationDTO;
import com.fiduciawebmovil.notification.entity.Notification;
import com.fiduciawebmovil.notification.repo.NotificationRepo;
import com.fiduciawebmovil.usuarios.entity.Usuarios;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.nio.charset.StandardCharsets;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepo notificationRepo;
    private final JavaMailSender mailSender;
    private final TemplateEngine templateEngine;

    @Override
    @Async
    public void sendEmail(NotificationDTO notificationDTO, Usuarios user) {

        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(
                    mimeMessage,
                    MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                    StandardCharsets.UTF_8.name()
            );
            helper.setFrom("ventas@trustechcapitalmexico.com");
            System.out.println("setTo "+notificationDTO.getRecipient());
            System.out.println("notificationDTO "+notificationDTO.getSubject());
            helper.setTo(notificationDTO.getRecipient());
            helper.setSubject(notificationDTO.getSubject());

            System.out.println("getTemplateName "+notificationDTO.getTemplateName());
            System.out.println("getBody "+notificationDTO.getBody());
            // Use template if provided
            if (notificationDTO.getTemplateName() != null) {
                Context context = new Context();
                context.setVariables(notificationDTO.getTemplateVariables());
                String htmlContent = templateEngine.process(notificationDTO.getTemplateName(), context);
                helper.setText(htmlContent, true);
            } else {

                // If No template send text body directly
                helper.setText(notificationDTO.getBody(), true);
            }
            System.out.println("Ants de enviar el correo");
            mailSender.send(mimeMessage);
            log.info("Email sent Out");

            //save to our database table
            Notification notificationToSave = Notification.builder()
                    .recipient(notificationDTO.getRecipient())
                    .subject(notificationDTO.getSubject())
                    .body(notificationDTO.getBody())
                    .type(NotificationType.EMAIL)
                    .user(user)
                    .build();

            notificationRepo.save(notificationToSave);


        } catch (MessagingException e) {
            log.error(e.getMessage());
        }
    }

    @Override
    @Async
    public void sendEmailSolicitud(NotificationDTO notificationDTO) {

        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(
                    mimeMessage,
                    MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                    StandardCharsets.UTF_8.name()
            );
            helper.setFrom("ventas@trustechcapitalmexico.com");
            System.out.println("setTo "+notificationDTO.getRecipient());
            System.out.println("notificationDTO "+notificationDTO.getSubject());
            helper.setTo("ventas@trustechcapitalmexico.com");
            helper.setSubject(notificationDTO.getSubject());

            System.out.println("getTemplateName "+notificationDTO.getTemplateName());
            System.out.println("getBody "+notificationDTO.getBody());
            // Use template if provided
            if (notificationDTO.getTemplateName() != null) {
                Context context = new Context();
                context.setVariables(notificationDTO.getTemplateVariables());
                String htmlContent = templateEngine.process(notificationDTO.getTemplateName(), context);
                helper.setText(htmlContent, true);
            } else {

                // If No template send text body directly
                helper.setText(notificationDTO.getBody(), true);
            }
            System.out.println("Antes de enviar el correo");
            mailSender.send(mimeMessage);
            log.info("Email sent Out");

        } catch (MessagingException e) {
            log.error(e.getMessage());
        }
    }

    @Override
    @Async
    public void sendEmailSolicitudCuenta(NotificationDTO notificationDTO) {

        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(
                    mimeMessage,
                    MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                    StandardCharsets.UTF_8.name()
            );
            helper.setFrom("ventas@trustechcapitalmexico.com");
            System.out.println("setTo "+notificationDTO.getRecipient());
            System.out.println("notificationDTO "+notificationDTO.getSubject());
            helper.setTo("ventas@trustechcapitalmexico.com");
            helper.setSubject(notificationDTO.getSubject());

            System.out.println("getTemplateName "+notificationDTO.getTemplateName());
            System.out.println("getBody "+notificationDTO.getBody());
            // Use template if provided
            if (notificationDTO.getTemplateName() != null) {
                Context context = new Context();
                context.setVariables(notificationDTO.getTemplateVariables());
                String htmlContent = templateEngine.process(notificationDTO.getTemplateName(), context);
                helper.setText(htmlContent, true);
            } else {

                // If No template send text body directly
                helper.setText(notificationDTO.getBody(), true);
            }
            System.out.println("Antes de enviar el correo");
            mailSender.send(mimeMessage);
            log.info("Email sent Out");

        } catch (MessagingException e) {
            log.error(e.getMessage());
        }
    }
}









