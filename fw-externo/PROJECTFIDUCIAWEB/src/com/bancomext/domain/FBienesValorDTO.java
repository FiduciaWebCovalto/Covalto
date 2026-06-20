package com.bancomext.domain;

import java.math.BigDecimal;

public class FBienesValorDTO {
    
    private String ftopNumOper;

    
    private BigDecimal fbvFolio;

    public FBienesValorDTO(String ftopNumOper, BigDecimal fbvFolio, String fbvEdificio) {
        this.ftopNumOper = ftopNumOper;
        this.fbvFolio = fbvFolio;
        this.fbvEdificio = fbvEdificio;
    }

    private String fbvEdificio;

    public String getFtopNumOper() {
        return ftopNumOper;
    }

    public void setFtopNumOper(final String ftopNumOper) {
        this.ftopNumOper = ftopNumOper;
    }

    public BigDecimal getFbvFolio() {
        return fbvFolio;
    }

    public void setFbvFolio(final BigDecimal fbvFolio) {
        this.fbvFolio = fbvFolio;
    }

    public String getFbvEdificio() {
        return fbvEdificio;
    }

    public void setFbvEdificio(final String fbvEdificio) {
        this.fbvEdificio = fbvEdificio;
    }

}
