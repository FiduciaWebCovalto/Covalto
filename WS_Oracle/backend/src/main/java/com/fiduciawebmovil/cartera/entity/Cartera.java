package com.fiduciawebmovil.cartera.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;


@Entity
@Data
@Table(name = "cartera")
public class Cartera {
    @EmbeddedId
    private CarteraId id;
    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpHonor;





    @Column(name = "CAR_IMP_HONOR_30",nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpHonor30;

    public Cartera() {
    }

 

    @Column(name = "CAR_IMP_HONOR_60",nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpHonor60;


    @Column(name = "CAR_IMP_HONOR_90",nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpHonor90;

    @Column(precision = 22, scale = 2)
    private BigDecimal carEjerAnoCurso;

    @Column(precision = 22, scale = 2)
    private BigDecimal carEjerAnoAnte;

    public BigDecimal getCarImpHonor() {
        return carImpHonor;
    }

    public void setCarImpHonor(final BigDecimal carImpHonor) {
        this.carImpHonor = carImpHonor;
    }


    public BigDecimal getCarImpHonor30() {
        return carImpHonor30;
    }

    public void setCarImpHonor30(final BigDecimal carImpHonor30) {
        this.carImpHonor30 = carImpHonor30;
    }


    public BigDecimal getCarImpHonor60() {
        return carImpHonor60;
    }

    public void setCarImpHonor60(final BigDecimal carImpHonor60) {
        this.carImpHonor60 = carImpHonor60;
    }


    public BigDecimal getCarImpHonor90() {
        return carImpHonor90;
    }

    public void setCarImpHonor90(final BigDecimal carImpHonor90) {
        this.carImpHonor90 = carImpHonor90;
    }


    public BigDecimal getCarEjerAnoCurso() {
        return carEjerAnoCurso;
    }

    public void setCarEjerAnoCurso(final BigDecimal carEjerAnoCurso) {
        this.carEjerAnoCurso = carEjerAnoCurso;
    }

    public BigDecimal getCarEjerAnoAnte() {
        return carEjerAnoAnte;
    }

    public void setCarEjerAnoAnte(final BigDecimal carEjerAnoAnte) {
        this.carEjerAnoAnte = carEjerAnoAnte;
    }

}
