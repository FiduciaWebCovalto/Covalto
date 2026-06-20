package mx.com.inscitech.hsbc.services.v1.clients;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.hsbc.services.v1.dtos.peps.RequestCdd;
import mx.com.inscitech.hsbc.services.v1.dtos.peps.ResponseCdd;


public class PepsServiceClient {
    
    private LoggingService logger = LoggingService.getInstance();

    private String pepsBaseUrl = null;
    private String pepsServiceUrl = null;
    private String pepsUsername = null;
    private String pepsPassword = null;

    public PepsServiceClient() {
        super();
    }
    
    private void setConfig() {
        ConfigurationService cfg = ConfigurationService.getInstance();
        this.pepsBaseUrl = cfg.getProperty("989");
        this.pepsServiceUrl = cfg.getProperty("988");
        this.pepsUsername = cfg.getProperty("987");
        this.pepsPassword = cfg.getProperty("986");
        
        if(pepsBaseUrl == null || pepsServiceUrl == null) {
            this.pepsBaseUrl = cfg.getProperty("pepsBaseUrl");
            this.pepsServiceUrl = cfg.getProperty("pepsServiceUrl");
            this.pepsUsername = cfg.getProperty("pepsUsername");
            this.pepsPassword = cfg.getProperty("pepsPassword");            
        }
    }
    
    public List<ResponseCdd> getConsultaPeps(RequestCdd requestData) {
        return getConsultaPeps(Collections.singletonList(requestData));
    }

    public List<ResponseCdd> getConsultaPeps(List<RequestCdd> requestData) {
        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "getConsultaPeps");
        
        if(pepsBaseUrl == null || pepsServiceUrl == null) setConfig();
            
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        Response response;

        try {
            
            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Se consultaran los siguientes registros en PEPS");
            for(RequestCdd cdd : requestData) {
                logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "JSON: " + mapper.writeValueAsString(cdd));
            }

            Entity<String> requestEntity = Entity.json(mapper.writeValueAsString(requestData));

            Client client = ClientBuilder.newClient();

            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Peps Base URL: [" + pepsBaseUrl + "], Service Path: [" + pepsServiceUrl + "]");

            WebTarget target = client.target(pepsBaseUrl);
            WebTarget resourceWebTarget = target.path(pepsServiceUrl);

            Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.APPLICATION_JSON);

            if(pepsUsername != null && pepsPassword != null) {
                
                logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Se realizara autenticacion al invocar peps con el usuario: '" + pepsUsername + "' de password: '" + pepsPassword + "'");
                
                String usernameAndPassword = pepsUsername + ":" + pepsPassword;
                String authorizationHeaderValue = "Basic " + java.util.Base64.getEncoder().encodeToString( usernameAndPassword.getBytes() );
                response = invocationBuilder.header(HttpHeaders.AUTHORIZATION, authorizationHeaderValue).post(requestEntity);
                
            } else {
                
                logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "No se realizara autenticacion por falta de configuracion usuario");
                  
                response = invocationBuilder.post(requestEntity);
            }

            if(response.getStatus() == Response.Status.OK.getStatusCode()) {
                
                logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "PEPS Response Status OK!");
                
                String jsonResponse = response.readEntity(String.class);
                logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "PEPS JSON Response: [" + jsonResponse + "]");
                
                return mapper.readValue(jsonResponse, new TypeReference<List<ResponseCdd>>(){});

            } else {
                logger.log(this, Thread.currentThread(), LoggingService.ERROR, "ERROR! PEPS Response Code: " + response.getStatus());
                return Collections.singletonList(new ResponseCdd("000", "Empty List", "{}"));
            }
            
                        
        } catch(Exception e) {
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Unable to get PEPS info", e);
        }
        
        return Collections.emptyList();
    }    
}
