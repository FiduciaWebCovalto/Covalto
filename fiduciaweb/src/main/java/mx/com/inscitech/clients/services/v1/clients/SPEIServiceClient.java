package mx.com.inscitech.clients.services.v1.clients;

import com.ibm.msg.client.jms.JmsConnectionFactory;
import com.ibm.msg.client.jms.JmsFactoryFactory;
import com.ibm.msg.client.wmq.WMQConstants;

import javax.jms.Destination;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.JMSProducer;
import javax.jms.Message;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.clients.services.v1.dtos.spei.SPEIMessage;

public class SPEIServiceClient {
    
    private LoggingService logger = LoggingService.getInstance();
    
    private String host; // Host name or IP address
    private int port; // Listener port for your queue manager
    private String channel; // Channel name
    private String qmanager; // Queue manager name
    private String applicationName; // The application name
    private String appUser; // User name that application uses to connect to MQ
    private String appPassword; // Password that the application uses to connect to MQ
    private String requestQueue; // Queue that the application uses to put and get messages to and from
    private String responseQueue;
    private String messageType;

    public SPEIServiceClient() {
        super();
    }
    
    private void setConfig() {
        ConfigurationService cfg = ConfigurationService.getInstance();

        this.applicationName = cfg.getProperty("985", "fw");
        this.host = cfg.getProperty("984", "localhost");
        this.port = Integer.parseInt(cfg.getProperty("983", "1414"));
        this.channel = cfg.getProperty("982", "fid.web.channel");
        this.qmanager = cfg.getProperty("981", "qmanagerA");
        this.appUser = cfg.getProperty("980", null);
        this.appPassword = cfg.getProperty("979", null);
        this.requestQueue = cfg.getProperty("978", "fw.queue.1");
        this.responseQueue = cfg.getProperty("977", requestQueue);
        this.messageType = cfg.getProperty("976", "Text");

        cfg = null;
    }    
    
    public String sendSPEIRequest(SPEIMessage speiRequest) {
        setConfig();
        
        JMSContext context = null;
        Destination destination = null;
        JMSProducer producer = null;
        JMSConsumer consumer = null;

        try {

            //SPEIMessage speiRequest = config.getSpeiMessage();
            //logger.log(this, Thread.currentThread(), LoggingService.INFO, "sendSPEIRequest. Message: {}", speiRequest.toString());

            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "SPEIServiceClient Configuration:");
            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "host: '" + host + "'");
            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "port: '" + port + "'");
            logger.log(this, Thread.currentThread(), LoggingService.INFO, "channel: '" + channel + "'");
            logger.log(this, Thread.currentThread(), LoggingService.INFO, "qmanager: '" + qmanager + "'");
            logger.log(this, Thread.currentThread(), LoggingService.INFO, "applicationName: '" + applicationName + "'");
            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "appUser: '" + appUser + "'");
            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "appPassword: '" + appPassword + "'");
            logger.log(this, Thread.currentThread(), LoggingService.INFO, "responseQueue: '" + responseQueue + "'");

            // Create a connection factory
            JmsFactoryFactory ff = JmsFactoryFactory.getInstance(WMQConstants.WMQ_PROVIDER);
            JmsConnectionFactory cf = ff.createConnectionFactory();

            // Set the properties
            cf.setStringProperty(WMQConstants.WMQ_HOST_NAME, host);
            cf.setIntProperty(WMQConstants.WMQ_PORT, port);
            cf.setStringProperty(WMQConstants.WMQ_CHANNEL, channel);
            cf.setIntProperty(WMQConstants.WMQ_CONNECTION_MODE, WMQConstants.WMQ_CM_CLIENT);
            cf.setStringProperty(WMQConstants.WMQ_QUEUE_MANAGER, qmanager);
            cf.setStringProperty(WMQConstants.WMQ_APPLICATIONNAME, applicationName);
            cf.setBooleanProperty(WMQConstants.USER_AUTHENTICATION_MQCSP, true);

            if(appUser != null) {
                cf.setStringProperty(WMQConstants.USERID, appUser);
                cf.setStringProperty(WMQConstants.PASSWORD, appPassword);
            } else {
                logger.log(this, Thread.currentThread(), LoggingService.INFO, "No auth data set");
            }

            // Create JMS objects
            context = cf.createContext();
            destination = context.createQueue("queue:///" + responseQueue);

            //context.createBytesMessage()
            //TextMessage message = context.createTextMessage(speiRequest.toString());

            Message message = null;

            switch (this.messageType.toLowerCase()){
                case "bytes":
                    logger.log(this, Thread.currentThread(), LoggingService.INFO, "SPEI message Type: Bytes");
                    message = context.createBytesMessage();
                    break;
                case "map":
                    logger.log(this, Thread.currentThread(), LoggingService.INFO, "SPEI message Type: Map");
                    message = context.createMapMessage();
                    break;
                case "object":
                    logger.log(this, Thread.currentThread(), LoggingService.INFO, "SPEI message Type: Object");
                    message = context.createObjectMessage();
                    break;
                case "stream":
                    logger.log(this, Thread.currentThread(), LoggingService.INFO, "SPEI message Type: Stream");
                    message = context.createStreamMessage();
                    break;
                default:
                    logger.log(this, Thread.currentThread(), LoggingService.INFO, "SPEI message Type: Text");
                    message = context.createTextMessage(speiRequest.toString());
            }

            /*message.setStringProperty("COD-RETORNO", "");
            message.setStringProperty("COD-ERROR", "");
            message.setStringProperty("NUM-CONFIRMA", "");
            message.setStringProperty("MSG-LEYENDA", "");
            message.setStringProperty("SENTIDO", "");
            message.setStringProperty("ORIGEN", "");
            message.setIntProperty("NUM-TRANSACC", 210);
            message.setStringProperty("FEC-EQUIPO", "");
            message.setStringProperty("HRS-EQUIPO", "");
            message.setStringProperty("FEC-MENSAJE", "");
            message.setStringProperty("HRS-MENSAJE", "");
            message.setStringProperty("FEC-OPERACION", "");
            message.setStringProperty("FOL-SERVIDOR", "");*/

            producer = context.createProducer();
            producer.send(destination, message);

            logger.log(this, Thread.currentThread(), LoggingService.INFO, "Message successfully sent!");

            consumer = context.createConsumer(destination); // autoclosable
            String receivedMessage = consumer.receiveBody(String.class, 25000); // in ms or 25 seconds

            logger.log(this, Thread.currentThread(), LoggingService.INFO, "Received message: '" + receivedMessage + "'");

            return "OK";

        } catch (JMSException jmsex) {
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Unable to process request.", jmsex);
        }

        return "No OK";
    }    
}
