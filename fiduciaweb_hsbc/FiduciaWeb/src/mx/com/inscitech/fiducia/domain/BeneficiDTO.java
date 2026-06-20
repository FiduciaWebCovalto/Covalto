package mx.com.inscitech.fiducia.domain;

public class BeneficiDTO {
    public String benNomBenef = null;
    public String benCveTipoPer = null;
    public Benefici id;

    public void setBenNomBenef(String benNomBenef) {
        this.benNomBenef = benNomBenef;
    }

    public String getBenNomBenef() {
        return benNomBenef;
    }

    public void setBenCveTipoPer(String benCveTipoPer) {
        this.benCveTipoPer = benCveTipoPer;
    }

    public String getBenCveTipoPer() {
        return benCveTipoPer;
    }

    public void setId(Benefici id) {
        this.id = id;
    }

    public Benefici getId() {
        return id;
    }
}
