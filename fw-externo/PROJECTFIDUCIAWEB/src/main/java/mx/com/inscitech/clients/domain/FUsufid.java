package mx.com.inscitech.clients.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;






@JsonIgnoreProperties(ignoreUnknown=true)

public class FUsufid {
    
    public Long ctoNumContrato;

    public String ctoNomContrato;

    public Long getCtoNumContrato() {
        return ctoNumContrato;
    }

    public void setCtoNumContrato(final Long ctoNumContrato) {
        this.ctoNumContrato = ctoNumContrato;
    }

    public String getCtoNomContrato() {
        return ctoNomContrato;
    }

    public void setCtoNomContrato(final String ctoNomContrato) {
        this.ctoNomContrato = ctoNomContrato;
    }      
    
    public FUsufid() {
    }

    public FUsufid(Long ctoNumContrato, String ctoNomContrato) {
        this.ctoNumContrato = ctoNumContrato;
        this.ctoNomContrato = ctoNomContrato;
    }    
    
    @Override
    public String toString() {
        return  this.ctoNumContrato+"-"+this.ctoNomContrato;
    }
    

}
