package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mail-service")
@XmlAccessorType(XmlAccessType.FIELD)
public class MailServiceConfig {

    @XmlElement(name = "mailServer", defaultValue = "localhost")
    private String mailServer = "localhost";

    @XmlElement(name = "mailServerPort", defaultValue = "25")
    private String mailServerPort = "25";

    @XmlElement(name = "useAuth", defaultValue = "false")
    private boolean useAuth = false;

    @XmlElement(name = "useTLS", defaultValue = "false")
    private boolean useTLS = false;

    @XmlElement(name = "serverUserName", defaultValue = "")
    private String serverUserName = "";

    @XmlElement(name = "serverPassword", defaultValue = "")
    private String serverPassword = "";

    @XmlElement(name = "sender", defaultValue = "no-reply@actinver.com.mx")
    private String senderAddress = "no-reply@actinver.com.mx";

    @XmlElement(name = "client-email")
    private String clientEmail = "";

    @XmlElement(name = "subject", defaultValue = "Procesos Fiduciarios")
    private String subject = "Procesos Fiduciarios";

    @XmlElement(name = "mail-body", defaultValue = "Socio Liquidador")
    private String mailBody = "Socio Liquidador";

    public MailServiceConfig() {
        super();
    }

    public void setMailServer(String mailServer) {
        this.mailServer = mailServer;
    }

    public String getMailServer() {
        return mailServer;
    }

    public void setMailServerPort(String mailServerPort) {
        this.mailServerPort = mailServerPort;
    }

    public String getMailServerPort() {
        return mailServerPort;
    }

    public void setUseAuth(boolean useAuth) {
        this.useAuth = useAuth;
    }

    public boolean isUseAuth() {
        return useAuth;
    }

    public void setUseTLS(boolean useTLS) {
        this.useTLS = useTLS;
    }

    public boolean isUseTLS() {
        return useTLS;
    }

    public void setServerUserName(String serverUserName) {
        this.serverUserName = serverUserName;
    }

    public String getServerUserName() {
        return serverUserName;
    }

    public void setServerPassword(String serverPassword) {
        this.serverPassword = serverPassword;
    }

    public String getServerPassword() {
        return serverPassword;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }

    public String getMailBody() {
        return mailBody;
    }

}
