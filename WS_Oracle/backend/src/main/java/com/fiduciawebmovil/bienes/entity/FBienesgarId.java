package com.fiduciawebmovil.bienes.entity;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;

public class FBienesgarId {
        private Long fgrsIdFideicomiso;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal fgrsIdSubcuenta;

    @Column(nullable = false, precision = 10, scale = 0)
    private String forsIdGarantia;

    @Column(nullable = false, precision = 10, scale = 0)
    private String forsCveTipoGarantia;

    @Column(nullable = false, precision = 10, scale = 0)
    private String forsCveTipoBien;

    public FBienesgarId(String forsCveTipoGarantia) {
        this.forsCveTipoGarantia = forsCveTipoGarantia;
    }

    public Long getFgrsIdFideicomiso() {
        return fgrsIdFideicomiso;
    }

    public FBienesgarId(Long fgrsIdFideicomiso, BigDecimal fgrsIdSubcuenta,String forsCveTipoBien) {
        this.fgrsIdFideicomiso = fgrsIdFideicomiso;
        this.fgrsIdSubcuenta = fgrsIdSubcuenta;
        this.forsCveTipoBien = forsCveTipoBien;
    }

    public void setFgrsIdFideicomiso(Long fgrsIdFideicomiso) {
        this.fgrsIdFideicomiso = fgrsIdFideicomiso;
    }

    public BigDecimal getFgrsIdSubcuenta() {
        return fgrsIdSubcuenta;
    }

    public void setFgrsIdSubcuenta(BigDecimal fgrsIdSubcuenta) {
        this.fgrsIdSubcuenta = fgrsIdSubcuenta;
    }

    public String getForsIdGarantia() {
        return forsIdGarantia;
    }

    public void setForsIdGarantia(String forsIdGarantia) {
        this.forsIdGarantia = forsIdGarantia;
    }

    public String getForsCveTipoGarantia() {
        return forsCveTipoGarantia;
    }

    public void setForsCveTipoGarantia(String forsCveTipoGarantia) {
        this.forsCveTipoGarantia = forsCveTipoGarantia;
    }

    public String getForsCveTipoBien() {
        return forsCveTipoBien;
    }

    public void setForsCveTipoBien(String forsCveTipoBien) {
        this.forsCveTipoBien = forsCveTipoBien;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FBienesgarId that = (FBienesgarId) o;
        return Objects.equals(fgrsIdFideicomiso, that.fgrsIdFideicomiso) &&
         Objects.equals(fgrsIdSubcuenta, that.fgrsIdSubcuenta)&&
         Objects.equals(forsIdGarantia, that.forsIdGarantia)&&
         Objects.equals(forsCveTipoGarantia, that.forsCveTipoGarantia)&&
         Objects.equals(forsCveTipoBien, that.forsCveTipoBien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fgrsIdFideicomiso, fgrsIdSubcuenta,
            forsIdGarantia,forsCveTipoGarantia,forsCveTipoBien
        );
    }
}
