package mx.com.inscitech.hsbc.services.v1.clients;

import static com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.inscitech.fiducia.common.beans.DocumentUpload;
import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.hsbc.services.v1.dtos.dmp.AssginOperationType;
import mx.com.inscitech.hsbc.services.v1.dtos.dmp.DocumentData;
import mx.com.inscitech.hsbc.services.v1.dtos.dmp.DocumentUploadData;
import mx.com.inscitech.hsbc.services.v1.dtos.dmp.Information;
import mx.com.inscitech.hsbc.services.v1.dtos.dmp.MatrixRequest;
import mx.com.inscitech.hsbc.services.v1.dtos.dmp.MatrixResponse;
import mx.com.inscitech.hsbc.services.v1.dtos.dmp.Product;
import mx.com.inscitech.hsbc.services.v1.dtos.dmp.ProductDescription;
import mx.com.inscitech.hsbc.services.v1.dtos.dmp.UploadRequest;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;

public class DMPServiceClient {

    public static final String MIME_TYPE = "image/jpeg";
    
    private LoggingService logger = LoggingService.getInstance();

    private String matrixURL = "";
    private String matrixPath = "";
    private String productKey = "";
    private String productCode = "";
    private String businessLine = "";
    private String appCode = "";
    private String uploadURL = "";
    private String uploadPath = "";
    
    public enum Porpuse {
        NEW, MANT
    };

    public DMPServiceClient() {
        super();
    }

    private void setConfig() {
        ConfigurationService cfg = ConfigurationService.getInstance();

        this.matrixURL = cfg.getProperty("997");
        this.matrixPath = cfg.getProperty("996");
        this.productKey = cfg.getProperty("995");
        this.productCode = cfg.getProperty("994");
        this.businessLine = cfg.getProperty("993");
        this.appCode = cfg.getProperty("992");
        this.uploadURL = cfg.getProperty("991");
        this.uploadPath = cfg.getProperty("990");
        
        cfg = null;
    }
    
    public List<DocumentUpload> getFisoDocuments(String fisoId, Porpuse porpuse) throws JsonProcessingException {
        List<DocumentUpload> theDocuments = new ArrayList<>();

        String dmpServiceConfig = ConfigurationService.getInstance().getProperty("3");
        if(dmpServiceConfig != null && "true".equals(dmpServiceConfig.toLowerCase())) {
            
            DMPServiceClient dmpClient = new DMPServiceClient();
            MatrixResponse dmpResponse = dmpClient.getDocuments(fisoId, mx.com
                                                                          .inscitech
                                                                          .hsbc
                                                                          .services
                                                                          .v1
                                                                          .clients
                                                                          .DMPServiceClient
                                                                          .Porpuse
                                                                          .MANT);
        
            for(ProductDescription prod : dmpResponse.getProducts()) {
                for(int i = 0; i < prod.getDocuments().size(); i++) {
                    DocumentData doc = prod.getDocuments().get(i);
                    theDocuments.add(new DocumentUpload(i, doc.getMatrixAcronym(), "1".equals(doc.getCategoryMandatory()), doc.getDocumentName(), false, "0"));
                }
            }
                        
        } else {
            //Send fake data
            theDocuments = Arrays.asList(
                new DocumentUpload(0, "0", true, "Identificacion Oficial"), 
                new DocumentUpload(1, "1", true, "Escrituras"), 
                new DocumentUpload(2, "2", false, "Estado de cuenta"), 
                new DocumentUpload(3, "3", false, "Licencia de conducir"), 
                new DocumentUpload(4, "4", true, "Acta de matrimonio/defuncion")
            );        
        }        

        return theDocuments;        
    }

    private MatrixResponse getDocuments(String fisoId, Porpuse porpuse) throws JsonProcessingException { //TODO: Manage exceptions
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MatrixResponse responseDMP = null;

        setConfig();
        
        Product product = new Product(this.productKey, this.productCode);
        Information dmpInformation = new Information(fisoId, this.businessLine, porpuse.name(), product);
        Entity<String> requestEntity = Entity.json(mapper.writeValueAsString(new MatrixRequest(dmpInformation)));

        Client client = ClientBuilder.newClient();

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "DMP Matrix URL: " + this.matrixURL + " Path: " + this.matrixPath);
        
        WebTarget target = client.target(this.matrixURL);
        WebTarget resourceWebTarget = target.path(this.matrixPath);

        Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.post(requestEntity);

        if(response.getStatus() == Response.Status.OK.getStatusCode()) {
            String jsonDocMatrix = response.readEntity(String.class);
            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "DMP JSON Response: {}" + jsonDocMatrix);

            try {
                responseDMP = mapper.readValue(jsonDocMatrix, MatrixResponse.class);
            } catch (Exception e) {
                logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Unable to read DMP Response", e);
            }

        } else {
            try {
                logger.log(this, Thread.currentThread(), LoggingService.WARN, 
                        "DMP Information could not be retrieved. Response code: " + response.getStatus() + 
                        ", Message: " + response.readEntity(String.class));
            } catch (Exception e) {
                logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Unable to read DMP Response", e);
            }
        }

        return responseDMP;
    }

    public boolean uploadDocument(String fisoId, String machine, MatrixResponse matrixData, File fileToUpload) throws IOException {
        boolean success = false;

        //logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "fileToUploadX.exists? " + fileToUploadX.exists() + " fileToUploadX.canRead? " + fileToUploadX.canRead());

        final Client client = ClientBuilder.newBuilder().register(MultiPartFeature.class).build();

        final FileDataBodyPart filePart = new FileDataBodyPart("files", fileToUpload);
        FormDataMultiPart formDataMultiPart = new FormDataMultiPart();

        formDataMultiPart.bodyPart(
            new FormDataBodyPart(
                "jsonObject",
                getUploadRequestJSON(getUploadRequest(fisoId, machine, matrixData, fileToUpload.getName())),
                MediaType.APPLICATION_JSON_TYPE
            )
        );

        final FormDataMultiPart multipart = (FormDataMultiPart) formDataMultiPart.field("files", "files").bodyPart(filePart);

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "DMP Upload URL: " + this.uploadURL + " Path: " + this.uploadPath);
        
        final WebTarget target = client.target(this.uploadURL).path(this.uploadPath);
        final Response response = target.request().post(Entity.entity(multipart, multipart.getMediaType()));

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Status: " + response.getStatus() + ", Response Builder: " + response.accepted());
        
        try {
            logger.log(this, Thread.currentThread(), LoggingService.WARN, 
                    "DMP Information could not be retrieved. Response code: " + response.getStatus() + 
                    ", Message: " + response.readEntity(String.class));
        } catch (Exception e) {
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Unable to read DMP Response", e);
        }

        formDataMultiPart.close();
        multipart.close();

        if(response.getStatus() == 200) {
            success = true;
        }

        return success;
    }

    private String getUploadRequestJSON(UploadRequest uploadRequest) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(Include.NON_NULL);
        return mapper.writeValueAsString(uploadRequest);
    }

    private UploadRequest getUploadRequest(String fisoId, String machine, MatrixResponse matrixData, String documentName) {
        UploadRequest theRequest = null;

        if(matrixData != null) {

            theRequest = new UploadRequest();
            theRequest.setKeysRefereces(null);
            theRequest.setDocs(new ArrayList<>());
            theRequest.setDocsReuso(null);
            theRequest.setDocsForced(null);

            theRequest.setPromoteCode(null); //codigo de promotor, string, no, cat
            theRequest.setBranch(null); //sucursal, string, si, cat
            theRequest.setState(0);
            theRequest.setMachine(machine);
            theRequest.setApp(this.appCode);
            theRequest.setGeneretionDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
            theRequest.setInitialDateScan("");
            theRequest.setEndDateScan("");
            theRequest.setChannel(this.appCode); //???
            theRequest.setReference(fisoId);

            ProductDescription prodRef = matrixData.getProducts().get(0);
            DocumentData docRef = prodRef.getDocuments().get(0);

            if(prodRef.getAssginOperationType() != null) {
                AssginOperationType opRef = prodRef.getAssginOperationType().get(0);
                theRequest.setIdOperationType(""+opRef.getIdOperationType());
                theRequest.setAcronymWt(opRef.getAcronymWt());
            } else {
                logger.log(this, Thread.currentThread(), LoggingService.WARN, "No AssginOperationType (ASSGIN_OPERATION_TYPE) found for document");
            }

            theRequest.setCis(prodRef.getCis());
            theRequest.setCisTUN(prodRef.getCis()); //Cis titular???
            theRequest.setMatrixAcronym(prodRef.getMatrixAcronym());
            theRequest.setBusinessLineAcronym(prodRef.getAcronymBl());
            theRequest.setFigure(prodRef.getFigure());
            theRequest.setNumberFigure("1"); //Consecutivo???
            theRequest.setTypePerson(prodRef.getTypePerson());
            theRequest.setFlagTun(prodRef.getFlagTun());
            theRequest.setProduct(prodRef.getProduct());
            theRequest.setSubProduct(prodRef.getSubProduct());
            theRequest.setMatrixAcronymCte(prodRef.getMatrixAcronym());
            theRequest.setBusinessLineAcronymCte(docRef.getBusinessLineAcronym());
            theRequest.setCisAnterior(null);
            theRequest.setMakeTemplates(null);
            theRequest.setCreateRelations(null);

            //for(ProductDescription product : matrixData.getProducts()) {
            if(matrixData.getProducts() != null && matrixData.getProducts().size() > 0) {
                ProductDescription product = matrixData.getProducts().get(0);
                //DocumentUploadData documentData = new DocumentUploadData();

                //documentData.setAcronym(product.getMatrixAcronym());

                //int docId = 0;
                //for(DocumentData doc : product.getDocuments()) {
                if(product.getDocuments() != null && product.getDocuments().size() > 0) {
                    DocumentData doc = product.getDocuments().get(0);
                    DocumentUploadData docUpload = new DocumentUploadData();

                    docUpload.setIdDoc(1); //docId++
                    docUpload.setAcronym(doc.getBusinessLineAcronym());
                    docUpload.setDescription(doc.getCategoryDescription());
                    docUpload.setRefDocId(documentName); //doc.getDocumentName()
                    docUpload.setMatrixAcronym(doc.getMatrixAcronym());
                    docUpload.setBusinessLineAcronym(doc.getBusinessLineAcronym());
                    docUpload.setMatrixAcronymCte(doc.getMatrixAcronymCTE());
                    docUpload.setBusinessLineAcronymCte(doc.getCategoryAcronymCTE()); //businessLineAcronymCte???
                    docUpload.setMimeType(MIME_TYPE);
                    docUpload.setExpeditionDate(null);
                    docUpload.setIsDocClient(0); //Cliente = 0, Cuenta = 1
                    docUpload.setCategory(doc.getCategoryAcronym());
                    docUpload.setCategoryCte(doc.getCategoryAcronymCTE());
                    docUpload.setMetadata(null);
                    docUpload.setExpeditionDate(null);
                    //docUpload.setReuseFlag(doc.getFlag());

                    //if(docId == 999999) docUpload.setDocumentMandatoryForce(doc.getMandatoryForce()); //TODO: ???

                    theRequest.getDocs().add(docUpload);
                }

                //theRequest.getDocs().add(documentData);
            }

        } else {
            //TODO: Implementar
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Invalid matrix information. It should not be null");
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(Include.NON_NULL);
        
        try {
            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "DMP Upload Request: " + mapper.writeValueAsString(theRequest));
        } catch (JsonProcessingException e) {
            logger.log(this, Thread.currentThread(), LoggingService.WARN, "Unable to stringify upload request", e);
        }

        return theRequest;
    }
}