package com.fiduciawebmovil.insnovalor.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import  java.util.Objects;


@Embeddable
public class FConinsnomonValorId  implements Serializable {

    @Column(nullable = false, updatable = false, length = 5)
    private String ftopNumOper;

    @Column(precision = 10, scale = 2)
    private Long convFolio;

    @Column(nullable = false, precision = 10, scale = 2)
    private Long convIdConcepto;

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FConinsnomonValorId that = (FConinsnomonValorId) o;
        return Objects.equals(ftopNumOper, that.ftopNumOper) &&
         Objects.equals(convFolio, that.convFolio)&&
         Objects.equals(convIdConcepto, that.convIdConcepto);
    }

    public FConinsnomonValorId(String ftopNumOper, Long convFolio, Long convIdConcepto) {
            this.ftopNumOper = ftopNumOper;
            this.convFolio = convFolio;
            this.convIdConcepto = convIdConcepto;
        }

    public FConinsnomonValorId() {
        }

    public String getFtopNumOper() {
            return ftopNumOper;
        }

        public void setFtopNumOper(String ftopNumOper) {
            this.ftopNumOper = ftopNumOper;
        }

        public Long getConvFolio() {
            return convFolio;
        }

        public void setConvFolio(Long convFolio) {
            this.convFolio = convFolio;
        }

        public Long getConvIdConcepto() {
            return convIdConcepto;
        }

        public void setConvIdConcepto(Long convIdConcepto) {
            this.convIdConcepto = convIdConcepto;
        }

    @Override
    public int hashCode() {
        return Objects.hash(ftopNumOper, convFolio,
            convIdConcepto
        );
    }


}
