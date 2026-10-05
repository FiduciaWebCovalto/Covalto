package mx.com.inscitech.clients.services.v1.clients.hogan;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.clients.services.v1.dtos.hogan.HoganInvestmenTransfer;
import mx.com.inscitech.clients.services.v1.dtos.hogan.HoganTransaction;

public class CheckingAccountsTransferClient {
    
    private LoggingService logger = LoggingService.getInstance();
    
    
    public CheckingAccountsTransferClient() {
        super();
    }
    
    private void setConfig() {
        ConfigurationService cfg = ConfigurationService.getInstance();

        
        cfg = null;
    }

    public void doTransfer() {
        
        setConfig();

        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        Response response;

        try {

            logger.log(this, Thread.currentThread(), LoggingService.INFO, 
                       "Transfer Between Checking Accounts using Monetary transaction - TXN 0099 from Hogan Backend");

            HoganInvestmenTransfer hitConfig = null; //config.getHoganInvestmenTransfer();
            HoganInvestmenTransfer hitChkConfig = null; //config.getHoganCheckingsTransfer();

            HoganTransaction transaction = new HoganTransaction();
            transaction.setDescription(hitChkConfig.getDescription());
            transaction.setDate(hitChkConfig.getDate());
            transaction.setTime(hitChkConfig.getTime());
            transaction.setAmount(hitChkConfig.getAmount());
            transaction.setSourceAccount(hitChkConfig.getSourceAccount());
            transaction.setDestinationAccount(hitChkConfig.getDestinationAccount());

            String jsonTransaction = mapper.writeValueAsString(transaction);
            logger.log(this, Thread.currentThread(), LoggingService.INFO, "Hogan Transaction information: " + hitConfig);

            Entity<String> requestEntity = Entity.json(jsonTransaction);

            Client client = ClientBuilder.newClient();

            logger.log(this, Thread.currentThread(), LoggingService.INFO, "Service Base URL: " + hitConfig.getUrl() + ", Service Path: " + hitConfig.getPath());

            WebTarget target = client.target(hitConfig.getUrl());
            WebTarget resourceWebTarget = target.path(hitConfig.getPath());

            Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.APPLICATION_JSON);

            response = invocationBuilder
                .header("X-HSBC-Locale", hitConfig.getLocale())
                .header("X-HSBC-CAM-Level", hitConfig.getCamLevel())
                .header("X-HSBC-Channel-Id", hitConfig.getChannelId())
                .header("X-HSBC-Chnl-CountryCode", hitConfig.getChnlCountrycode())
                .header("X-HSBC-Chnl-Group-Member", hitConfig.getChnlGroupMember())
                .header("X-HSBC-IP-Id", hitConfig.getIpId())
                .header("X-HSBC-Request-Correlation-Id", hitConfig.getRequestCorrelationId())
                .header("X-HSBC-Session-Correlation-Id", hitConfig.getSessionCorrelationId())
                .header("X-HSBC-Src-Device-Id", hitConfig.getSrcDeviceId())
                .header("X-HSBC-Src-UserAgent", hitConfig.getSrcUseragent())
                .header("X-HSBC-User-Id", hitConfig.getUserId())
                .header("X-HSBC-client-id", hitConfig.getClientId())
                .header("X-HSBC-client-secret", hitConfig.getClientSecret())
                .header("X-HSBC-Eim-Id", hitConfig.getEimId())
                .post(requestEntity);

            if(response.getStatus() == Response.Status.OK.getStatusCode()) {

                logger.log(this, Thread.currentThread(), LoggingService.INFO, "Hogan Response Status OK!");
                logger.log(this, Thread.currentThread(), LoggingService.INFO, "Hogan JSON Response: '" + response.readEntity(String.class) + "'");

            } else {
                logger.log(this, Thread.currentThread(), LoggingService.ERROR, "ERROR! Hogan Response Code: " + response.getStatus());
            }

            } catch (Exception e) {
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "An error occurred making the call to Hogan.", e);
            }
    }    
}
