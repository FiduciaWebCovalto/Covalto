package com.fiduciawebmovil.monedas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;


@Entity
public class Monedas {

    @Id
    private Long monNumPais;

    @Column(nullable = false, updatable = false, length = 50)
    private String monNomMoneda;

    @Column(precision = 4, scale = 0)
    private BigDecimal monAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal monMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal monDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal monAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal monMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal monDiaUltMod;

    @Column(length = 25)
    private String monCveStMoneda;

    @Column(length = 5)
    private String monSigla;

    public String getMonNomMoneda() {
        return monNomMoneda;
    }

    public void setMonNomMoneda(final String monNomMoneda) {
        this.monNomMoneda = monNomMoneda;
    }

    public BigDecimal getMonAnoAltaReg() {
        return monAnoAltaReg;
    }

    public void setMonAnoAltaReg(final BigDecimal monAnoAltaReg) {
        this.monAnoAltaReg = monAnoAltaReg;
    }

    public BigDecimal getMonMesAltaReg() {
        return monMesAltaReg;
    }

    public void setMonMesAltaReg(final BigDecimal monMesAltaReg) {
        this.monMesAltaReg = monMesAltaReg;
    }

    public BigDecimal getMonDiaAltaReg() {
        return monDiaAltaReg;
    }

    public void setMonDiaAltaReg(final BigDecimal monDiaAltaReg) {
        this.monDiaAltaReg = monDiaAltaReg;
    }

    public BigDecimal getMonAnoUltMod() {
        return monAnoUltMod;
    }

    public void setMonAnoUltMod(final BigDecimal monAnoUltMod) {
        this.monAnoUltMod = monAnoUltMod;
    }

    public BigDecimal getMonMesUltMod() {
        return monMesUltMod;
    }

    public void setMonMesUltMod(final BigDecimal monMesUltMod) {
        this.monMesUltMod = monMesUltMod;
    }

    public BigDecimal getMonDiaUltMod() {
        return monDiaUltMod;
    }

    public void setMonDiaUltMod(final BigDecimal monDiaUltMod) {
        this.monDiaUltMod = monDiaUltMod;
    }

    public String getMonCveStMoneda() {
        return monCveStMoneda;
    }

    public void setMonCveStMoneda(final String monCveStMoneda) {
        this.monCveStMoneda = monCveStMoneda;
    }

    public String getMonSigla() {
        return monSigla;
    }

    public void setMonSigla(final String monSigla) {
        this.monSigla = monSigla;
    }

    public Long getMonNumPais() {
        return monNumPais;
    }

    public void setMonNumPais(Long monNumPais) {
        this.monNumPais = monNumPais;
    }

}
