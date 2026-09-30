package mx.com.inscitech.clients.domain;

public class BeneficiDTO {
    
    public Benefici id;
    public String benNomBenef;
    
    @Override
    public String toString() {
        return  this.id.benBeneficiario+"-"+this.benNomBenef;
    }

    public void setId(Benefici id) {
        this.id = id;
    }

    public Benefici getId() {
        return id;
    }

    public String getBenNomBenef() {
        return benNomBenef;
    }

    public void setBenNomBenef(final String benNomBenef) {
        this.benNomBenef = benNomBenef;
    }


}
