package com.fiduciawebmovil.bienes.entity;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;

public class FAdquirentesId {
        private Long fadqIdFideicomiso;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal fadqIdSubcuenta;

    @Column(nullable = false, length = 50)
    private String fadqIdBien;

    public Long getFadqIdFideicomiso() {
        return fadqIdFideicomiso;
    }

    public void setFadqIdFideicomiso(Long fadqIdFideicomiso) {
        this.fadqIdFideicomiso = fadqIdFideicomiso;
    }

    public BigDecimal getFadqIdSubcuenta() {
        return fadqIdSubcuenta;
    }

    public void setFadqIdSubcuenta(BigDecimal fadqIdSubcuenta) {
        this.fadqIdSubcuenta = fadqIdSubcuenta;
    }

    public String getFadqIdBien() {
        return fadqIdBien;
    }

    public void setFadqIdBien(String fadqIdBien) {
        this.fadqIdBien = fadqIdBien;
    }

    public String getFadqIdEdificio() {
        return fadqIdEdificio;
    }

    public FAdquirentesId() {
    }

    public void setFadqIdEdificio(String fadqIdEdificio) {
        this.fadqIdEdificio = fadqIdEdificio;
    }

    public String getFadqIdDepto() {
        return fadqIdDepto;
    }

    public void setFadqIdDepto(String fadqIdDepto) {
        this.fadqIdDepto = fadqIdDepto;
    }

    @Column(nullable = false, length = 50)
    private String fadqIdEdificio;

    public FAdquirentesId(String fadqIdEdificio) {
        this.fadqIdEdificio = fadqIdEdificio;
    }

    public FAdquirentesId(Long fadqIdFideicomiso, BigDecimal fadqIdSubcuenta, 
        String fadqIdBien, String fadqIdEdificio,
        String fadqIdDepto) {
        this.fadqIdFideicomiso = fadqIdFideicomiso;
        this.fadqIdSubcuenta = fadqIdSubcuenta;
        this.fadqIdBien = fadqIdBien;
        this.fadqIdEdificio = fadqIdEdificio;
        this.fadqIdDepto = fadqIdDepto;
    }

    @Column(nullable = false, length = 50)
    private String fadqIdDepto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FAdquirentesId that = (FAdquirentesId) o;
        return Objects.equals(fadqIdFideicomiso, that.fadqIdFideicomiso) &&
         Objects.equals(fadqIdSubcuenta, that.fadqIdSubcuenta)&&
         Objects.equals(fadqIdBien, that.fadqIdBien)&&
         Objects.equals(fadqIdEdificio, that.fadqIdEdificio)&&
         Objects.equals(fadqIdDepto, that.fadqIdDepto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fadqIdFideicomiso, fadqIdSubcuenta,
            fadqIdBien,fadqIdEdificio,fadqIdDepto
        );
    }    
}
