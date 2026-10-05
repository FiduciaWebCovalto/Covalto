package mx.com.inscitech.clients.services.v1.dtos.dmp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentUploadData {
    
    private Integer idDoc;
    private String acronym;
    private String description;
    private String refDocId;
    private String matrixAcronym;
    private String businessLineAcronym;
    private String matrixAcronymCte;
    private String businessLineAcronymCte;
    private String mimeType;
    private String expirationDate;
    private Integer isDocClient;
    private String category;
    private String categoryCte;
    private String metadata;
    private String expeditionDate;
    private String reuseFlag;
    
    @JsonProperty("DOCUMENT_MANDATORY_FORCE")
    private Integer documentMandatoryForce = 0;
    
    public DocumentUploadData() {
        super();
    }

    public DocumentUploadData(Integer idDoc, String acronym, String description, String refDocId, String matrixAcronym, String businessLineAcronym, String matrixAcronymCte,
                              String businessLineAcronymCte, String mimeType, String expirationDate, Integer isDocClient, String category, String categoryCte, String metadata,
                              String expeditionDate, String reuseFlag, Integer documentMandatoryForce) {
        this.idDoc = idDoc;
        this.acronym = acronym;
        this.description = description;
        this.refDocId = refDocId;
        this.matrixAcronym = matrixAcronym;
        this.businessLineAcronym = businessLineAcronym;
        this.matrixAcronymCte = matrixAcronymCte;
        this.businessLineAcronymCte = businessLineAcronymCte;
        this.mimeType = mimeType;
        this.expirationDate = expirationDate;
        this.isDocClient = isDocClient;
        this.category = category;
        this.categoryCte = categoryCte;
        this.metadata = metadata;
        this.expeditionDate = expeditionDate;
        this.reuseFlag = reuseFlag;
        this.documentMandatoryForce = documentMandatoryForce;
    }

    public void setIdDoc(Integer idDoc) {
        this.idDoc = idDoc;
    }

    public Integer getIdDoc() {
        return idDoc;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setRefDocId(String refDocId) {
        this.refDocId = refDocId;
    }

    public String getRefDocId() {
        return refDocId;
    }

    public void setMatrixAcronym(String matrixAcronym) {
        this.matrixAcronym = matrixAcronym;
    }

    public String getMatrixAcronym() {
        return matrixAcronym;
    }

    public void setBusinessLineAcronym(String businessLineAcronym) {
        this.businessLineAcronym = businessLineAcronym;
    }

    public String getBusinessLineAcronym() {
        return businessLineAcronym;
    }

    public void setMatrixAcronymCte(String matrixAcronymCte) {
        this.matrixAcronymCte = matrixAcronymCte;
    }

    public String getMatrixAcronymCte() {
        return matrixAcronymCte;
    }

    public void setBusinessLineAcronymCte(String businessLineAcronymCte) {
        this.businessLineAcronymCte = businessLineAcronymCte;
    }

    public String getBusinessLineAcronymCte() {
        return businessLineAcronymCte;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setIsDocClient(Integer isDocClient) {
        this.isDocClient = isDocClient;
    }

    public Integer getIsDocClient() {
        return isDocClient;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategoryCte(String categoryCte) {
        this.categoryCte = categoryCte;
    }

    public String getCategoryCte() {
        return categoryCte;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setExpeditionDate(String expeditionDate) {
        this.expeditionDate = expeditionDate;
    }

    public String getExpeditionDate() {
        return expeditionDate;
    }

    public void setReuseFlag(String reuseFlag) {
        this.reuseFlag = reuseFlag;
    }

    public String getReuseFlag() {
        return reuseFlag;
    }

    public void setDocumentMandatoryForce(Integer documentMandatoryForce) {
        this.documentMandatoryForce = documentMandatoryForce;
    }

    public Integer getDocumentMandatoryForce() {
        return documentMandatoryForce;
    }
}
