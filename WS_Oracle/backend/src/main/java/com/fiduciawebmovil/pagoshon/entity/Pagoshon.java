package com.fiduciawebmovil.pagoshon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Data
@Builder
@Table(name = "pagoshon")
@AllArgsConstructor
@NoArgsConstructor
public class Pagoshon {

    
    @EmbeddedId
    private PagoshonId id;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumPago;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumServicio;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumTramite;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal pagImpPago;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal pagImpIvaHonor;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal pagImpExtemp;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumMoneda;

    @Column(length = 25)
    private String pagDoctoRef;

    @Column(length = 10)
    private String pagFecDoctoRef;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal pagAnoAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal pagMesAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal pagDiaAltaReg;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal pagAnoUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal pagMesUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal pagDiaUltMod;

    @Column(length = 25)
    private String pagCveStPagosho;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagFolioOpera;

    @Column(precision = 16, scale = 2)
    private BigDecimal pagImpTotal;

    public BigDecimal getPagNumPago() {
        return pagNumPago;
    }

    public void setPagNumPago(final BigDecimal pagNumPago) {
        this.pagNumPago = pagNumPago;
    }

    public BigDecimal getPagNumServicio() {
        return pagNumServicio;
    }

    public void setPagNumServicio(final BigDecimal pagNumServicio) {
        this.pagNumServicio = pagNumServicio;
    }

    public BigDecimal getPagNumTramite() {
        return pagNumTramite;
    }

    public void setPagNumTramite(final BigDecimal pagNumTramite) {
        this.pagNumTramite = pagNumTramite;
    }

    public BigDecimal getPagImpPago() {
        return pagImpPago;
    }

    public void setPagImpPago(final BigDecimal pagImpPago) {
        this.pagImpPago = pagImpPago;
    }

    public BigDecimal getPagImpIvaHonor() {
        return pagImpIvaHonor;
    }

    public void setPagImpIvaHonor(final BigDecimal pagImpIvaHonor) {
        this.pagImpIvaHonor = pagImpIvaHonor;
    }

    public BigDecimal getPagImpExtemp() {
        return pagImpExtemp;
    }

    public void setPagImpExtemp(final BigDecimal pagImpExtemp) {
        this.pagImpExtemp = pagImpExtemp;
    }

    public BigDecimal getPagNumMoneda() {
        return pagNumMoneda;
    }

    public void setPagNumMoneda(final BigDecimal pagNumMoneda) {
        this.pagNumMoneda = pagNumMoneda;
    }

    public String getPagDoctoRef() {
        return pagDoctoRef;
    }

    public void setPagDoctoRef(final String pagDoctoRef) {
        this.pagDoctoRef = pagDoctoRef;
    }

    public String getPagFecDoctoRef() {
        return pagFecDoctoRef;
    }

    public void setPagFecDoctoRef(final String pagFecDoctoRef) {
        this.pagFecDoctoRef = pagFecDoctoRef;
    }

    public BigDecimal getPagAnoAltaReg() {
        return pagAnoAltaReg;
    }

    public void setPagAnoAltaReg(final BigDecimal pagAnoAltaReg) {
        this.pagAnoAltaReg = pagAnoAltaReg;
    }

    public BigDecimal getPagMesAltaReg() {
        return pagMesAltaReg;
    }

    public void setPagMesAltaReg(final BigDecimal pagMesAltaReg) {
        this.pagMesAltaReg = pagMesAltaReg;
    }

    public BigDecimal getPagDiaAltaReg() {
        return pagDiaAltaReg;
    }

    public void setPagDiaAltaReg(final BigDecimal pagDiaAltaReg) {
        this.pagDiaAltaReg = pagDiaAltaReg;
    }

    public BigDecimal getPagAnoUltMod() {
        return pagAnoUltMod;
    }

    public void setPagAnoUltMod(final BigDecimal pagAnoUltMod) {
        this.pagAnoUltMod = pagAnoUltMod;
    }

    public BigDecimal getPagMesUltMod() {
        return pagMesUltMod;
    }

    public void setPagMesUltMod(final BigDecimal pagMesUltMod) {
        this.pagMesUltMod = pagMesUltMod;
    }

    public BigDecimal getPagDiaUltMod() {
        return pagDiaUltMod;
    }

    public void setPagDiaUltMod(final BigDecimal pagDiaUltMod) {
        this.pagDiaUltMod = pagDiaUltMod;
    }

    public String getPagCveStPagosho() {
        return pagCveStPagosho;
    }

    public void setPagCveStPagosho(final String pagCveStPagosho) {
        this.pagCveStPagosho = pagCveStPagosho;
    }

    public BigDecimal getPagFolioOpera() {
        return pagFolioOpera;
    }

    public void setPagFolioOpera(final BigDecimal pagFolioOpera) {
        this.pagFolioOpera = pagFolioOpera;
    }

    public BigDecimal getPagImpTotal() {
        return pagImpTotal;
    }

    public void setPagImpTotal(final BigDecimal pagImpTotal) {
        this.pagImpTotal = pagImpTotal;
    }

}
