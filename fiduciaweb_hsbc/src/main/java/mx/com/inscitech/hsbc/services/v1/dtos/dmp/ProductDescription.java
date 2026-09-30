package mx.com.inscitech.hsbc.services.v1.dtos.dmp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductDescription {
    
    private String subProduct;
    private String product;
    private String figure;
    private String acronymBl;
    private String matrixAcronym;
    private String cis;
    private String typePerson;
    private String customerName;
    private String flagTun;
    private String cveSegmentoCis;
    private String cisAnterior;

    @JsonProperty("SEGMENTO")
    private String segmento;

    @JsonProperty("OBJ_FATCA")
    private FatcaData fatcaData;

    @JsonProperty("docs")
    private List<DocumentData> documents;

    @JsonProperty("ASSGIN_OPERATION_TYPE")
    private List<AssginOperationType> assginOperationType;
    
    public ProductDescription() {
        super();
    }

    public ProductDescription(String subProduct, String product, String figure, String acronymBl, String matrixAcronym, String cis, String typePerson, String customerName,
                              String flagTun, String cveSegmentoCis, String cisAnterior, String segmento, FatcaData fatcaData, List<DocumentData> documents,
                              List<AssginOperationType> assginOperationType) {
        this.subProduct = subProduct;
        this.product = product;
        this.figure = figure;
        this.acronymBl = acronymBl;
        this.matrixAcronym = matrixAcronym;
        this.cis = cis;
        this.typePerson = typePerson;
        this.customerName = customerName;
        this.flagTun = flagTun;
        this.cveSegmentoCis = cveSegmentoCis;
        this.cisAnterior = cisAnterior;
        this.segmento = segmento;
        this.fatcaData = fatcaData;
        this.documents = documents;
        this.assginOperationType = assginOperationType;
    }

    public void setSubProduct(String subProduct) {
        this.subProduct = subProduct;
    }

    public String getSubProduct() {
        return subProduct;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public void setAcronymBl(String acronymBl) {
        this.acronymBl = acronymBl;
    }

    public String getAcronymBl() {
        return acronymBl;
    }

    public void setMatrixAcronym(String matrixAcronym) {
        this.matrixAcronym = matrixAcronym;
    }

    public String getMatrixAcronym() {
        return matrixAcronym;
    }

    public void setCis(String cis) {
        this.cis = cis;
    }

    public String getCis() {
        return cis;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public String getTypePerson() {
        return typePerson;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setFlagTun(String flagTun) {
        this.flagTun = flagTun;
    }

    public String getFlagTun() {
        return flagTun;
    }

    public void setCveSegmentoCis(String cveSegmentoCis) {
        this.cveSegmentoCis = cveSegmentoCis;
    }

    public String getCveSegmentoCis() {
        return cveSegmentoCis;
    }

    public void setCisAnterior(String cisAnterior) {
        this.cisAnterior = cisAnterior;
    }

    public String getCisAnterior() {
        return cisAnterior;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setFatcaData(FatcaData fatcaData) {
        this.fatcaData = fatcaData;
    }

    public FatcaData getFatcaData() {
        return fatcaData;
    }

    public void setDocuments(List<DocumentData> documents) {
        this.documents = documents;
    }

    public List<DocumentData> getDocuments() {
        return documents;
    }

    public void setAssginOperationType(List<AssginOperationType> assginOperationType) {
        this.assginOperationType = assginOperationType;
    }

    public List<AssginOperationType> getAssginOperationType() {
        return assginOperationType;
    }
}
