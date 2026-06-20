package mx.com.inscitech.hsbc.services.v1.dtos.dmp;

import java.util.List;

public class UploadRequest {
    
    private String keysRefereces;
    
    private List<DocumentUploadData> docs;
    private List<DocumentUploadData> docsReuso;
    private List<DocumentUploadData> docsForced;
    
    private String promoteCode;
    private String branch;
    private Integer state;
    private String machine;
    private String app;
    private String user;
    private String generetionDate;
    private String initialDateScan;
    private String endDateScan;
    private String channel;
    private String reference;
    private String cis;
    private String cisTUN;
    private String matrixAcronym;
    private String businessLineAcronym;
    private String figure;
    private String numberFigure;
    private String idOperationType;
    private String typePerson;
    private String flagTun;
    private String acronymWt;
    private String product;
    private String subProduct;
    private String matrixAcronymCte;
    private String businessLineAcronymCte;
    private String cisAnterior;
    private String makeTemplates;
    private String createRelations;
    
    public UploadRequest() {
        super();
    }

    public UploadRequest(String keysRefereces, List<DocumentUploadData> docs, List<DocumentUploadData> docsReuso, List<DocumentUploadData> docsForced, String promoteCode,
                         String branch, Integer state, String machine, String app, String user, String generetionDate, String initialDateScan, String endDateScan, String channel,
                         String reference, String cis, String cisTUN, String matrixAcronym, String businessLineAcronym, String figure, String numberFigure, String idOperationType,
                         String typePerson, String flagTun, String acronymWt, String product, String subProduct, String matrixAcronymCte, String businessLineAcronymCte,
                         String cisAnterior, String makeTemplates, String createRelations) {
        this.keysRefereces = keysRefereces;
        this.docs = docs;
        this.docsReuso = docsReuso;
        this.docsForced = docsForced;
        this.promoteCode = promoteCode;
        this.branch = branch;
        this.state = state;
        this.machine = machine;
        this.app = app;
        this.user = user;
        this.generetionDate = generetionDate;
        this.initialDateScan = initialDateScan;
        this.endDateScan = endDateScan;
        this.channel = channel;
        this.reference = reference;
        this.cis = cis;
        this.cisTUN = cisTUN;
        this.matrixAcronym = matrixAcronym;
        this.businessLineAcronym = businessLineAcronym;
        this.figure = figure;
        this.numberFigure = numberFigure;
        this.idOperationType = idOperationType;
        this.typePerson = typePerson;
        this.flagTun = flagTun;
        this.acronymWt = acronymWt;
        this.product = product;
        this.subProduct = subProduct;
        this.matrixAcronymCte = matrixAcronymCte;
        this.businessLineAcronymCte = businessLineAcronymCte;
        this.cisAnterior = cisAnterior;
        this.makeTemplates = makeTemplates;
        this.createRelations = createRelations;
    }

    public void setKeysRefereces(String keysRefereces) {
        this.keysRefereces = keysRefereces;
    }

    public String getKeysRefereces() {
        return keysRefereces;
    }

    public void setDocs(List<DocumentUploadData> docs) {
        this.docs = docs;
    }

    public List<DocumentUploadData> getDocs() {
        return docs;
    }

    public void setDocsReuso(List<DocumentUploadData> docsReuso) {
        this.docsReuso = docsReuso;
    }

    public List<DocumentUploadData> getDocsReuso() {
        return docsReuso;
    }

    public void setDocsForced(List<DocumentUploadData> docsForced) {
        this.docsForced = docsForced;
    }

    public List<DocumentUploadData> getDocsForced() {
        return docsForced;
    }

    public void setPromoteCode(String promoteCode) {
        this.promoteCode = promoteCode;
    }

    public String getPromoteCode() {
        return promoteCode;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getMachine() {
        return machine;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApp() {
        return app;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setGeneretionDate(String generetionDate) {
        this.generetionDate = generetionDate;
    }

    public String getGeneretionDate() {
        return generetionDate;
    }

    public void setInitialDateScan(String initialDateScan) {
        this.initialDateScan = initialDateScan;
    }

    public String getInitialDateScan() {
        return initialDateScan;
    }

    public void setEndDateScan(String endDateScan) {
        this.endDateScan = endDateScan;
    }

    public String getEndDateScan() {
        return endDateScan;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    public void setCis(String cis) {
        this.cis = cis;
    }

    public String getCis() {
        return cis;
    }

    public void setCisTUN(String cisTUN) {
        this.cisTUN = cisTUN;
    }

    public String getCisTUN() {
        return cisTUN;
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

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public void setNumberFigure(String numberFigure) {
        this.numberFigure = numberFigure;
    }

    public String getNumberFigure() {
        return numberFigure;
    }

    public void setIdOperationType(String idOperationType) {
        this.idOperationType = idOperationType;
    }

    public String getIdOperationType() {
        return idOperationType;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public String getTypePerson() {
        return typePerson;
    }

    public void setFlagTun(String flagTun) {
        this.flagTun = flagTun;
    }

    public String getFlagTun() {
        return flagTun;
    }

    public void setAcronymWt(String acronymWt) {
        this.acronymWt = acronymWt;
    }

    public String getAcronymWt() {
        return acronymWt;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setSubProduct(String subProduct) {
        this.subProduct = subProduct;
    }

    public String getSubProduct() {
        return subProduct;
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

    public void setCisAnterior(String cisAnterior) {
        this.cisAnterior = cisAnterior;
    }

    public String getCisAnterior() {
        return cisAnterior;
    }

    public void setMakeTemplates(String makeTemplates) {
        this.makeTemplates = makeTemplates;
    }

    public String getMakeTemplates() {
        return makeTemplates;
    }

    public void setCreateRelations(String createRelations) {
        this.createRelations = createRelations;
    }

    public String getCreateRelations() {
        return createRelations;
    }
}
