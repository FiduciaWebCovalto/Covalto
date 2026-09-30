package mx.com.inscitech.fiducia.domain;

public class FideicomDTO {
    public String fidCveTipoPer = null;
    public String fidNomFideicom = null;
    public Fideicom id;

    public void setFidCveTipoPer(String fidCveTipoPer) {
        this.fidCveTipoPer = fidCveTipoPer;
    }

    public String getFidCveTipoPer() {
        return fidCveTipoPer;
    }

    public void setFidNomFideicom(String fidNomFideicom) {
        this.fidNomFideicom = fidNomFideicom;
    }

    public String getFidNomFideicom() {
        return fidNomFideicom;
    }

    public void setId(Fideicom id) {
        this.id = id;
    }

    public Fideicom getId() {
        return id;
    }
}
