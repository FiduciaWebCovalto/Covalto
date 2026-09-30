package mx.com.inscitech.clients.services.v1.dtos.dmp;


public class AssginOperationType {
    
    private Long idOperationType;
    private Long idWorkTray;
    private String typePerson;
    private String typeOperAcronym;
    private String typeOperDesc;
    private String acronymWt;
    private String workTrayName;
    private String purpose;
    private String combo;
    private Long prioridad;
    private String documento;
    
    public AssginOperationType() {
        super();
    }

    public AssginOperationType(Long idOperationType, Long idWorkTray, String typePerson, String typeOperAcronym, String typeOperDesc, String acronymWt, String workTrayName,
                               String purpose, String combo, Long prioridad, String documento) {
        this.idOperationType = idOperationType;
        this.idWorkTray = idWorkTray;
        this.typePerson = typePerson;
        this.typeOperAcronym = typeOperAcronym;
        this.typeOperDesc = typeOperDesc;
        this.acronymWt = acronymWt;
        this.workTrayName = workTrayName;
        this.purpose = purpose;
        this.combo = combo;
        this.prioridad = prioridad;
        this.documento = documento;
    }

    public void setIdOperationType(Long idOperationType) {
        this.idOperationType = idOperationType;
    }

    public Long getIdOperationType() {
        return idOperationType;
    }

    public void setIdWorkTray(Long idWorkTray) {
        this.idWorkTray = idWorkTray;
    }

    public Long getIdWorkTray() {
        return idWorkTray;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public String getTypePerson() {
        return typePerson;
    }

    public void setTypeOperAcronym(String typeOperAcronym) {
        this.typeOperAcronym = typeOperAcronym;
    }

    public String getTypeOperAcronym() {
        return typeOperAcronym;
    }

    public void setTypeOperDesc(String typeOperDesc) {
        this.typeOperDesc = typeOperDesc;
    }

    public String getTypeOperDesc() {
        return typeOperDesc;
    }

    public void setAcronymWt(String acronymWt) {
        this.acronymWt = acronymWt;
    }

    public String getAcronymWt() {
        return acronymWt;
    }

    public void setWorkTrayName(String workTrayName) {
        this.workTrayName = workTrayName;
    }

    public String getWorkTrayName() {
        return workTrayName;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public String getCombo() {
        return combo;
    }

    public void setPrioridad(Long prioridad) {
        this.prioridad = prioridad;
    }

    public Long getPrioridad() {
        return prioridad;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }
}
