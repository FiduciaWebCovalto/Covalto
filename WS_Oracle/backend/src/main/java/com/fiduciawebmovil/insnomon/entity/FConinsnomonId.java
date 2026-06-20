package com.fiduciawebmovil.insnomon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import java.util.Objects;



@Embeddable
public class FConinsnomonId {
    @Column(nullable = false, updatable = false)
    private String ftopNumOper;

    @Column(precision = 10, scale = 0)
    private BigDecimal conpIdConcepto;

            @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FConinsnomonId that = (FConinsnomonId) o;
        return Objects.equals(ftopNumOper, that.ftopNumOper) &&
         Objects.equals(conpIdConcepto, that.conpIdConcepto);
    }

     public String getFtopNumOper() {
                return ftopNumOper;
            }

            public void setFtopNumOper(String ftopNumOper) {
                this.ftopNumOper = ftopNumOper;
            }

            public BigDecimal getConpIdConcepto() {
                return conpIdConcepto;
            }

            public void setConpIdConcepto(BigDecimal conpIdConcepto) {
                this.conpIdConcepto = conpIdConcepto;
            }

     public FConinsnomonId() {
            }

     public FConinsnomonId(String ftopNumOper, BigDecimal conpIdConcepto) {
        this.ftopNumOper = ftopNumOper;
        this.conpIdConcepto = conpIdConcepto;
    }

     @Override
    public int hashCode() {
        return Objects.hash(ftopNumOper, conpIdConcepto);
    }
}
