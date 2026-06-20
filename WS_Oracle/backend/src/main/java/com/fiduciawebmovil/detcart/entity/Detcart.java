package com.fiduciawebmovil.detcart.entity;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;


@Entity
@Data
@Table(name = "detcart")
public class Detcart {
    @EmbeddedId
    private DetcartId id;
    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decNumServicio;

    @Column(length = 50)
    private String decConceptoHono;


    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal decAnoPerDel;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decMesPerDel;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decDiaPerDel;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal decAnoPerAl;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decMesPerAl;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decDiaPerAl;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal decImpRemHonor;


    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal decImpOrigHonor;


    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal decImpPagosEfe;


    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decNumMoneda;


    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decFolioOpera;




    public BigDecimal getDecNumServicio() {
        return decNumServicio;
    }

    public void setDecNumServicio(final BigDecimal decNumServicio) {
        this.decNumServicio = decNumServicio;
    }


    public String getDecConceptoHono() {
        return decConceptoHono;
    }

    public void setDecConceptoHono(final String decConceptoHono) {
        this.decConceptoHono = decConceptoHono;
    }


    public BigDecimal getDecAnoPerDel() {
        return decAnoPerDel;
    }

    public void setDecAnoPerDel(final BigDecimal decAnoPerDel) {
        this.decAnoPerDel = decAnoPerDel;
    }

    public BigDecimal getDecMesPerDel() {
        return decMesPerDel;
    }

    public void setDecMesPerDel(final BigDecimal decMesPerDel) {
        this.decMesPerDel = decMesPerDel;
    }

    public BigDecimal getDecDiaPerDel() {
        return decDiaPerDel;
    }

    public void setDecDiaPerDel(final BigDecimal decDiaPerDel) {
        this.decDiaPerDel = decDiaPerDel;
    }

    public BigDecimal getDecAnoPerAl() {
        return decAnoPerAl;
    }

    public void setDecAnoPerAl(final BigDecimal decAnoPerAl) {
        this.decAnoPerAl = decAnoPerAl;
    }

    public BigDecimal getDecMesPerAl() {
        return decMesPerAl;
    }

    public void setDecMesPerAl(final BigDecimal decMesPerAl) {
        this.decMesPerAl = decMesPerAl;
    }

    public BigDecimal getDecDiaPerAl() {
        return decDiaPerAl;
    }

    public void setDecDiaPerAl(final BigDecimal decDiaPerAl) {
        this.decDiaPerAl = decDiaPerAl;
    }

    public BigDecimal getDecImpRemHonor() {
        return decImpRemHonor;
    }

    public void setDecImpRemHonor(final BigDecimal decImpRemHonor) {
        this.decImpRemHonor = decImpRemHonor;
    }


    public BigDecimal getDecImpOrigHonor() {
        return decImpOrigHonor;
    }

    public void setDecImpOrigHonor(final BigDecimal decImpOrigHonor) {
        this.decImpOrigHonor = decImpOrigHonor;
    }


    public BigDecimal getDecImpPagosEfe() {
        return decImpPagosEfe;
    }

    public void setDecImpPagosEfe(final BigDecimal decImpPagosEfe) {
        this.decImpPagosEfe = decImpPagosEfe;
    }

    public BigDecimal getDecNumMoneda() {
        return decNumMoneda;
    }

    public void setDecNumMoneda(final BigDecimal decNumMoneda) {
        this.decNumMoneda = decNumMoneda;
    }


    public BigDecimal getDecFolioOpera() {
        return decFolioOpera;
    }

    public void setDecFolioOpera(final BigDecimal decFolioOpera) {
        this.decFolioOpera = decFolioOpera;
    }


}
