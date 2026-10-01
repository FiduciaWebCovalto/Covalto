package mx.com.inscitech.clients.services.v1.clients.hogan;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.inscitech.fiducia.common.services.LoggingService;

public class HoganRequestManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(HoganRequestManager.class);

    
    private LoggingService logger = LoggingService.getInstance();
    
    private static final String HOGAN_URL = "";
    private static final String INVESMENT_ACCOUNTS_URL = "";
    
    private HoganRequestManager() {
        super();
    }
    
    public static HoganRequestManager getInstance() {
        return new HoganRequestManager();
    }
    
    public Response doPost(Object transaction) throws JsonProcessingException { //TODO: Return Typo
        
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        
        String jsonTransaction = mapper.writeValueAsString(transaction);
        logger.log(this, Thread.currentThread(), LoggingService.INFO, "Hogan Transaction information: "); //+ hitConfig

        Entity<String> requestEntity = Entity.json(jsonTransaction);
        
        Client client = ClientBuilder.newClient();
        
        WebTarget target = client.target(HOGAN_URL);
        WebTarget resourceWebTarget = target.path(INVESMENT_ACCOUNTS_URL);

        Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.APPLICATION_JSON);

        //TODO: Hacer que los headers sean configurables/dinamicos
        Response response = invocationBuilder
            .header("X-HSBC-Locale", "hitConfig.getLocale()")
            .header("X-HSBC-CAM-Level", "hitConfig.getCamLevel()")
            .header("X-HSBC-Channel-Id", "hitConfig.getChannelId()")
            .header("X-HSBC-Chnl-CountryCode", "hitConfig.getChnlCountrycode()")
            .header("X-HSBC-Chnl-Group-Member", "hitConfig.getChnlGroupMember()")
            .header("X-HSBC-IP-Id", "hitConfig.getIpId()")
            .header("X-HSBC-Request-Correlation-Id", "hitConfig.getRequestCorrelationId()")
            .header("X-HSBC-Session-Correlation-Id", "hitConfig.getSessionCorrelationId()")
            .header("X-HSBC-Src-Device-Id", "hitConfig.getSrcDeviceId()")
            .header("X-HSBC-Src-UserAgent", "hitConfig.getSrcUseragent()")
            .header("X-HSBC-User-Id", "hitConfig.getUserId()")
            .header("X-HSBC-client-id", "hitConfig.getClientId()")
            .header("X-HSBC-client-secret", "hitConfig.getClientSecret()")
            .header("X-HSBC-Eim-Id", "hitConfig.getEimId()")
            .post(requestEntity);
        
        return response;
    }
}

/*
String uuid = UUID.randomUUID().toString();
LOGGER.debug("Generated UUID:" + uuid);

X-HSBC-Locale	es_MX	es_MX	es_MX	es_MX	Log
X-HSBC-Chnl-CountryCode	MX	MX	MX	MX	
X-HSBC-Chnl-Group-Member	HBMX	HBMX	HBMX	HBMX	
X-HSBC-User-Id	NTSGBM	NTSGBM	NTSGBM	NTSGBM	
X-HSBC-CAM-Level	NA	NA	NA	NA	
X-HSBC-Channel-Id	"
Backend system to request through the API. In this case ""HOGAN"""	HOGAN	HOGAN	HOGAN	
X-HSBC-Src-Device-Id	"Variable by environment. 
It should be the DNS of the invoking server, get it dynamically"	Example: nts.mx.hsbc	Example: nts.mx.hsbc	Example: nts.mx.hsbc	
					
X-HSBC-Session-Correlation-Id	SC-NTSGBM-NA	SC-NTSGBM-NA	SC-NTSGBM-NA	SC-NTSGBM-NA	
X-HSBC-Src-UserAgent	"Variable by environment.
URL of the Frontend that is consuming the API
the invoking server, get it dynamically"	Example: nts.mx.hsbc	Example: nts.mx.hsbc	Example: nts.mx.hsbc	
					
X-HSBC-Request-Correlation-Id	"Unique identifier for each request. It must have the following structure:

Value of header X-HSBC-User-Id-randomValue
Example: NTSGBM-0eb881c0-7450-11ea-989c-0050568b46fd
Regex pattern:  ""^[a-zA-Z0-9_-]{1,13}-[a-zA-Z0-9-]{10,}$""

For the random value could be use an specific method to generete it in the consumer application.
We propouse generate the random value using the Java function UUID. An example using UUID function wich was tested with jdk 1.7 and 1.8 is attached in this file."	NTSGMB-0eb881c0-7450-11ea-989c-0050568b46fd	NTSGBM-0eb881c0-7450-11ea-989c-0050568b46fd	NTSGBM-0eb881c0-7450-11ea-989c-0050568b46fd	
X-HSBC-IP-Id	"Variable by environment.
It must be the IP of the invoking server, get it dynamically"	Example: 1.1.1.1	Example: 1.1.1.1	Example: 1.1.1.1	White list
					
X-HSBC-client-id	"Variable by environment.
For PRD and DRP environment request passwords before release or during release"	non-mandatory	The value will be send after ambientation in OAT environment	The value will be share before release or during release	Autentication
					
X-HSBC-client-secret	"Variable by environment.
For PRD and DRP environment request passwords before release or during release"	non-mandatory	The value will be send after ambientation in OAT environment	The value will be share before release or during release	
					
X-HSBC-Eim-Id	244036	244036	244036	244036	Log
X-HSBC-Operation-User	Operation user will be send to backend 	Example: 			

 */