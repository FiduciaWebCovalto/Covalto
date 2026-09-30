package mx.com.inscitech.fiducia.services;

import java.io.File;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;


public class MailService {

    //TODO: Crear los diferentes mecanismos
    //public static final int AUTH_METHODS...

    private LoggingService logger = null;

    private Properties mailConfig = null;
    private String content = null;
    private String subject = null;
    private boolean htmlMessage = true;
    private boolean useAuthenticator = false;

    private HashMap<String, ArrayList<InternetAddress>> recipients = null;
    private HashMap<String, Object> attachments = null;

    private Message message = null;
    private Multipart multipart = null;
    private MimeBodyPart messageBodyPart = null;
    private DataSource source = null;

    private boolean haveRepyTo = false, haveCC = false, haveBCC = false, haveAttachments = false;

    public void finalize() {
        if (recipients != null)
            recipients.clear();
        if (attachments != null)
            attachments.clear();

        recipients = null;
        attachments = null;
    }

    private void init() {
        logger = LoggingService.getNewInstance();
        mailConfig = new Properties();
        recipients = new HashMap<String, ArrayList<InternetAddress>>();
    }

    public MailService() {
        super();
        init();
        ConfigurationService config = ConfigurationService.getInstance();
        mailConfig.putAll(config.getPropertySet("mail."));
    }

    public MailService(HashMap<String, String> cnProperties) {
        super();
        init();
        mailConfig.putAll(cnProperties);
    }

    public void addProperty(String theKey, Object theValue) {
        mailConfig.put(theKey, theValue);
    }

    private boolean addRecipient(String type, String address) {
        boolean result = false;

        if (recipients.get(type) == null)
            recipients.put(type, new ArrayList<InternetAddress>());

        try {
            recipients.get(type).add(new InternetAddress(address));
            //InternetAddress.parse(arg0)
            result = true;
        } catch (AddressException a) {
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Invalid address: " + address, a);
        }

        return result;
    }

    public void addFrom(String mailAddress) {
        addRecipient("FROM", mailAddress);
    }

    public void addTo(String mailAddress) {
        addRecipient("TO", mailAddress);
    }

    public void addCC(String mailAddress) {
        if (haveCC)
            addRecipient("CC", mailAddress);
        else
            haveCC = addRecipient("CC", mailAddress);
    }

    public void addBCC(String mailAddress) {
        if (haveBCC)
            addRecipient("BCC", mailAddress);
        else
            haveBCC = addRecipient("BCC", mailAddress);
    }

    public void addReplyTo(String mailAddress) {
        if (haveRepyTo)
            addRecipient("REPLY", mailAddress);
        else
            haveRepyTo = addRecipient("REPLY", mailAddress);
    }

    public void attachData(String fileName, byte[] data) {
        if (attachments == null)
            attachments = new HashMap<String, Object>();

        attachments.put(fileName, data);

        haveAttachments = true;
    }

    public void attachFile(String fileLocation) {
        if (attachments == null)
            attachments = new HashMap<String, Object>();

        File theFile = new File(fileLocation);
        if (theFile.exists() && theFile.canRead()) {
            attachments.put(theFile.getName(), new File(fileLocation));
            haveAttachments = true;
        }
    }

    private InternetAddress[] getRecipients(String type) {
        ArrayList<InternetAddress> recipientInfo = recipients.get(type);
        return recipientInfo.toArray(new InternetAddress[] { });
    }

    //public void sendMail(subject, from, to, content) {
    public void sendMail() {

        Session serverSession = null;
        String messageType = htmlMessage ? "text/html" : "text/plain";

        byte[] fileData = null;
        Iterator<String> itAttach = null;
        String fileName = null;

        try {

            if (useAuthenticator)
                serverSession = Session.getInstance(mailConfig, getAuthenticator());
            else
                serverSession = Session.getInstance(mailConfig);

            message = new MimeMessage(serverSession);
            message.setFrom(getRecipients("FROM")[0]);
            message.setRecipients(Message.RecipientType.TO, getRecipients("TO"));

            if (haveCC)
                message.setRecipients(Message.RecipientType.CC, getRecipients("CC"));
            if (haveBCC)
                message.setRecipients(Message.RecipientType.BCC, getRecipients("BCC"));
            if (haveRepyTo)
                message.setReplyTo(getRecipients("REPLY"));

            message.setSubject(this.getSubject());
            message.setText(this.getContent());
            message.setSentDate(new Date());

            message.setHeader("X-Mailer", "FiduciaWeb"); //Content-Type, Content-Length, Content-Language, Content-Disposition...

            multipart = new MimeMultipart();

            messageBodyPart = new MimeBodyPart();
            messageBodyPart.setDataHandler(new DataHandler(content, messageType));
            //att.addHeader("Content-Type", "text/plain; charset=UTF-8");
            multipart.addBodyPart(messageBodyPart);

            if (haveAttachments) {

                itAttach = attachments.keySet().iterator();
                while (itAttach.hasNext()) {
                    fileName = itAttach.next();
                    if (attachments.get(fileName) instanceof File) {
                        source = new FileDataSource((File) attachments.get(fileName));
                    } else {
                        fileData = (byte[]) attachments.get(fileName);
                        source = new ByteArrayDataSource(fileData, "application/octet-stream");
                    }

                    messageBodyPart = new MimeBodyPart();
                    messageBodyPart.setDataHandler(new DataHandler(source));
                    messageBodyPart.setFileName(fileName);
                    messageBodyPart.addHeader("Content-Type", "application/octet-stream");
                    messageBodyPart.setDisposition("attachment; filename=" + fileName + ";");
                    //messageBodyPart.setDisposition("attachment; filename=genome.jpeg; modification-date="Wed, 12 Feb 1997 16:29:51 -0500";");
                    //setContentType "application/octet-stream"
                    multipart.addBodyPart(messageBodyPart);
                }

            }

            message.setContent(multipart);

            //Transport transport = session.getTransport("smtp");
            //transport.connect("smtp.mail.yahoo.co.in", "user name", "asdfgh");
            Transport.send(message);

        } catch (MessagingException me) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "", me);

        } catch (Exception e) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "", e);

        } finally {

        }

    }

    private Authenticator getAuthenticator() {
        Authenticator auth = null;

        // TODO: Usar AUTH_METHODS
        String authMethod = "USER/PASSWORD";

        try {

            authMethod = mailConfig.getProperty("AUTH_TYPE");
            if (authMethod == null || "".equals(authMethod.trim()))
                throw new Exception("No authentication type specified!");

            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Autenticator: " + authMethod);

        } catch (Exception e) {

            logger.log(this, Thread.currentThread(), LoggingService.WARN, "An error ocurred getting e-mail authenticator. Using generic User / Password authenticator.", e);
            auth = getUserPasswordAuth();

        } finally {


        }

        return auth;
    }

    private Authenticator getUserPasswordAuth() {
        return new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mailConfig.getProperty("username"), mailConfig.getProperty("password"));
            }
        };
    }

    public void setMailConfig(Properties mailConfig) {
        this.mailConfig = mailConfig;
    }

    public Properties getMailConfig() {
        return mailConfig;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setHtmlMessage(boolean htmlMessage) {
        this.htmlMessage = htmlMessage;
    }

    public boolean isHtmlMessage() {
        return htmlMessage;
    }

    public void setUseAuthenticator(boolean useAuthenticator) {
        this.useAuthenticator = useAuthenticator;
    }

    public boolean isUseAuthenticator() {
        return useAuthenticator;
    }

}
