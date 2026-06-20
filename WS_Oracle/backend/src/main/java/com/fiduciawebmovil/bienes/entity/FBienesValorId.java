package com.fiduciawebmovil.bienes.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import  java.util.Objects;


@Embeddable
public class FBienesValorId  implements Serializable {

    @Column(nullable = false, updatable = false, length = 5)
    private String ftopNumOper;

    @Column(precision = 10, scale = 0)
    private Long fbvFolio;

    public String getFtopNumOper() {
        return ftopNumOper;
    }

    public FBienesValorId() {
    }

    public void setFtopNumOper(String ftopNumOper) {
        this.ftopNumOper = ftopNumOper;
    }

    public FBienesValorId(String ftopNumOper, Long fbvFolio, String fbvEdificio) {
        this.ftopNumOper = ftopNumOper;
        this.fbvFolio = fbvFolio;
        this.fbvEdificio = fbvEdificio;
    }

    public Long getFbvFolio() {
        return fbvFolio;
    }

    public void setFbvFolio(Long fbvFolio) {
        this.fbvFolio = fbvFolio;
    }

    public String getFbvEdificio() {
        return fbvEdificio;
    }

    public void setFbvEdificio(String fbvEdificio) {
        this.fbvEdificio = fbvEdificio;
    }

    @Column(length = 50)
    private String fbvEdificio;

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FBienesValorId that = (FBienesValorId) o;
        return Objects.equals(ftopNumOper, that.ftopNumOper) &&
         Objects.equals(fbvFolio, that.fbvFolio)&&
         Objects.equals(fbvEdificio, that.fbvEdificio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ftopNumOper, fbvFolio,
            fbvFolio
        );
    }


}
