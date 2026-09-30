package mx.com.inscitech.clients.domain;

import java.math.BigDecimal;

public class FConinsnomonValorDTO {
    private String ftopNumOper;

    
    private BigDecimal convFolio;


    public FConinsnomonValorDTO(String ftopNumOper, BigDecimal convFolio, BigDecimal convIdConcepto) {
        this.ftopNumOper = ftopNumOper;
        this.convFolio = convFolio;
        this.convIdConcepto = convIdConcepto;
    }
    private BigDecimal convIdConcepto;
    
    public String getFtopNumOper() {
        return ftopNumOper;
    }

    public void setFtopNumOper(final String ftopNumOper) {
        this.ftopNumOper = ftopNumOper;
    }

    public BigDecimal getConvFolio() {
        return convFolio;
    }

    public void setConvFolio(final BigDecimal convFolio) {
        this.convFolio = convFolio;
    }

    public BigDecimal getConvIdConcepto() {
        return convIdConcepto;
    }

    public void setConvIdConcepto(final BigDecimal convIdConcepto) {
        this.convIdConcepto = convIdConcepto;
    }

}
