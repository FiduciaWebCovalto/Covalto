package mx.com.inscitech.hsbc.services.v1.dtos.dmp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentData {
    
    @JsonProperty("CATEGORY_MANDATORY")
    private String categoryMandatory;

    @JsonProperty("isDocReqRangeDate")
    private String isDocReqRangeDate;

    @JsonProperty("DOC_NAME")
    private String documentName;

    @JsonProperty("CATEGORY_ACRONYM")
    private String categoryAcronym;

    @JsonProperty("ACRONYM_BL")
    private String businessLineAcronym;

    @JsonProperty("CATEGORY_DESCRIPTION")
    private String categoryDescription;

    @JsonProperty("EXPIRATION_TIME")
    private Long expirationTime;

    @JsonProperty("SEGMENTO")
    private String segmento;

    @JsonProperty("FLAG_CUSTOM_CATRY")
    private String flagCustomCatry;

    @JsonProperty("STATUS")
    private String status;

    @JsonProperty("DOCUMENT_ACRONYM")
    private String documentAcronym;

    @JsonProperty("TIPOFIGURA")
    private String tipoFigura;

    @JsonProperty("CVEPRODUCTO")
    private String cveProducto;

    @JsonProperty("MATRIX_ACRONYM")
    private String matrixAcronym;

    @JsonProperty("MAT_CTE_MANDATORY")
    private String mandatoryCategory;

    @JsonProperty("LINEA")
    private String linea;

    @JsonProperty("ID_INTEG_RULE")
    private String integrationRules;

    @JsonProperty("CVESUBPRODUCTO")
    private String cveSubProducto;

    @JsonProperty("MATRIX_DESC")
    private String dmpMatrixName;

    @JsonProperty("CATEGORY_ACRONYM_CTE")
    private String categoryAcronymCTE;

    @JsonProperty("MATRIX_ACRONYM_CTE")
    private String matrixAcronymCTE;

    @JsonProperty("DOCUMENT_MANDATORY_FORCE")
    private Integer mandatoryForce;

    @JsonProperty("BND")
    private Flag flag;
    
    public DocumentData() {
        super();
    }

    public DocumentData(String categoryMandatory, String isDocReqRangeDate, String documentName, String categoryAcronym, String businessLineAcronym, String categoryDescription,
                        Long expirationTime, String segmento, String flagCustomCatry, String status, String documentAcronym, String tipoFigura, String cveProducto,
                        String matrixAcronym, String mandatoryCategory, String linea, String integrationRules, String cveSubProducto, String dmpMatrixName,
                        String categoryAcronymCTE, String matrixAcronymCTE, Integer mandatoryForce, Flag flag) {
        this.categoryMandatory = categoryMandatory;
        this.isDocReqRangeDate = isDocReqRangeDate;
        this.documentName = documentName;
        this.categoryAcronym = categoryAcronym;
        this.businessLineAcronym = businessLineAcronym;
        this.categoryDescription = categoryDescription;
        this.expirationTime = expirationTime;
        this.segmento = segmento;
        this.flagCustomCatry = flagCustomCatry;
        this.status = status;
        this.documentAcronym = documentAcronym;
        this.tipoFigura = tipoFigura;
        this.cveProducto = cveProducto;
        this.matrixAcronym = matrixAcronym;
        this.mandatoryCategory = mandatoryCategory;
        this.linea = linea;
        this.integrationRules = integrationRules;
        this.cveSubProducto = cveSubProducto;
        this.dmpMatrixName = dmpMatrixName;
        this.categoryAcronymCTE = categoryAcronymCTE;
        this.matrixAcronymCTE = matrixAcronymCTE;
        this.mandatoryForce = mandatoryForce;
        this.flag = flag;
    }

    public void setCategoryMandatory(String categoryMandatory) {
        this.categoryMandatory = categoryMandatory;
    }

    public String getCategoryMandatory() {
        return categoryMandatory;
    }

    public void setIsDocReqRangeDate(String isDocReqRangeDate) {
        this.isDocReqRangeDate = isDocReqRangeDate;
    }

    public String getIsDocReqRangeDate() {
        return isDocReqRangeDate;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setCategoryAcronym(String categoryAcronym) {
        this.categoryAcronym = categoryAcronym;
    }

    public String getCategoryAcronym() {
        return categoryAcronym;
    }

    public void setBusinessLineAcronym(String businessLineAcronym) {
        this.businessLineAcronym = businessLineAcronym;
    }

    public String getBusinessLineAcronym() {
        return businessLineAcronym;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setFlagCustomCatry(String flagCustomCatry) {
        this.flagCustomCatry = flagCustomCatry;
    }

    public String getFlagCustomCatry() {
        return flagCustomCatry;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setDocumentAcronym(String documentAcronym) {
        this.documentAcronym = documentAcronym;
    }

    public String getDocumentAcronym() {
        return documentAcronym;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setCveProducto(String cveProducto) {
        this.cveProducto = cveProducto;
    }

    public String getCveProducto() {
        return cveProducto;
    }

    public void setMatrixAcronym(String matrixAcronym) {
        this.matrixAcronym = matrixAcronym;
    }

    public String getMatrixAcronym() {
        return matrixAcronym;
    }

    public void setMandatoryCategory(String mandatoryCategory) {
        this.mandatoryCategory = mandatoryCategory;
    }

    public String getMandatoryCategory() {
        return mandatoryCategory;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getLinea() {
        return linea;
    }

    public void setIntegrationRules(String integrationRules) {
        this.integrationRules = integrationRules;
    }

    public String getIntegrationRules() {
        return integrationRules;
    }

    public void setCveSubProducto(String cveSubProducto) {
        this.cveSubProducto = cveSubProducto;
    }

    public String getCveSubProducto() {
        return cveSubProducto;
    }

    public void setDmpMatrixName(String dmpMatrixName) {
        this.dmpMatrixName = dmpMatrixName;
    }

    public String getDmpMatrixName() {
        return dmpMatrixName;
    }

    public void setCategoryAcronymCTE(String categoryAcronymCTE) {
        this.categoryAcronymCTE = categoryAcronymCTE;
    }

    public String getCategoryAcronymCTE() {
        return categoryAcronymCTE;
    }

    public void setMatrixAcronymCTE(String matrixAcronymCTE) {
        this.matrixAcronymCTE = matrixAcronymCTE;
    }

    public String getMatrixAcronymCTE() {
        return matrixAcronymCTE;
    }

    public void setMandatoryForce(Integer mandatoryForce) {
        this.mandatoryForce = mandatoryForce;
    }

    public Integer getMandatoryForce() {
        return mandatoryForce;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public Flag getFlag() {
        return flag;
    }
}
