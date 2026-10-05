package mx.com.inscitech.fiducia.web.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendMail {
    private static final Logger LOGGER = LoggerFactory.getLogger(SendMail.class);

    private String from;
    private String to;
    private String cc;
    private String subject;
    private String text;
    private String smtpHost;

    public SendMail(String from, String to, String cc, String subject, String text, String smtpHost) {
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.subject = subject;
        this.text = text;
        this.smtpHost = smtpHost;
    }

    public void send() {

        Properties props = new Properties();
        props.put("mail.smtp.host", smtpHost);

        Session mailSession = Session.getDefaultInstance(props);
        Message simpleMessage = new MimeMessage(mailSession);

        InternetAddress fromAddress = null;
        InternetAddress toAddress = null;
        InternetAddress ccAddress = null;

        try {
            fromAddress = new InternetAddress(from);
            toAddress = new InternetAddress(to);
            ccAddress = new InternetAddress(cc);
        } catch (AddressException e) {
            LOGGER.error("Exception: ", e);
        }

        try {
            simpleMessage.setFrom(fromAddress);
            simpleMessage.setRecipient(RecipientType.TO, toAddress);
            simpleMessage.setRecipient(RecipientType.CC, ccAddress);
            simpleMessage.setSubject(subject);
            simpleMessage.setText(text);

            Transport.send(simpleMessage);
            LOGGER.debug("Email enviado");
        } catch (MessagingException e) {
            LOGGER.error("Exception: ", e);
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        String from = "(ERICK ALEJANDRO OMAÑA MINGËR) eominguer@hotmail.com";
        String to = "edu.aya@gmail.com";
        String cc = "eominguer@gmail.com";
        String subject = "Cuenta rechazada";
        String message = "La cuenta rechazada es la numero 1000000";
        String smtpHost = "130.0.24.41";
        SendMail sendMail = new SendMail(from, to, cc, subject, message, smtpHost);
        sendMail.send();
    }
}
