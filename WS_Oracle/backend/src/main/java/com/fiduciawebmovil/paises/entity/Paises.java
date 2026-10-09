package com.fiduciawebmovil.paises.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;


@Entity
public class Paises {

    @Id
    private Long paiNumPais;

    @Column(length = 50)
    private String paiNomPais;

    @Column(length = 30)
    private String paiAbrPais;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal paiAnoAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal paiMesAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal paiDiaAltaReg;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal paiAnoUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal paiMesUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal paiDiaUltMod;

    @Column(length = 25)
    private String paiCveStPais;

    public Long getPaiNumPais() {
        return paiNumPais;
    }

    public void setPaiNumPais(final Long paiNumPais) {
        this.paiNumPais = paiNumPais;
    }

    public String getPaiNomPais() {
        return paiNomPais;
    }

    public void setPaiNomPais(final String paiNomPais) {
        this.paiNomPais = paiNomPais;
    }

    public String getPaiAbrPais() {
        return paiAbrPais;
    }

    public void setPaiAbrPais(final String paiAbrPais) {
        this.paiAbrPais = paiAbrPais;
    }

    public BigDecimal getPaiAnoAltaReg() {
        return paiAnoAltaReg;
    }

    public void setPaiAnoAltaReg(final BigDecimal paiAnoAltaReg) {
        this.paiAnoAltaReg = paiAnoAltaReg;
    }

    public BigDecimal getPaiMesAltaReg() {
        return paiMesAltaReg;
    }

    public void setPaiMesAltaReg(final BigDecimal paiMesAltaReg) {
        this.paiMesAltaReg = paiMesAltaReg;
    }

    public BigDecimal getPaiDiaAltaReg() {
        return paiDiaAltaReg;
    }

    public void setPaiDiaAltaReg(final BigDecimal paiDiaAltaReg) {
        this.paiDiaAltaReg = paiDiaAltaReg;
    }

    public BigDecimal getPaiAnoUltMod() {
        return paiAnoUltMod;
    }

    public void setPaiAnoUltMod(final BigDecimal paiAnoUltMod) {
        this.paiAnoUltMod = paiAnoUltMod;
    }

    public BigDecimal getPaiMesUltMod() {
        return paiMesUltMod;
    }

    public void setPaiMesUltMod(final BigDecimal paiMesUltMod) {
        this.paiMesUltMod = paiMesUltMod;
    }

    public BigDecimal getPaiDiaUltMod() {
        return paiDiaUltMod;
    }

    public void setPaiDiaUltMod(final BigDecimal paiDiaUltMod) {
        this.paiDiaUltMod = paiDiaUltMod;
    }

    public String getPaiCveStPais() {
        return paiCveStPais;
    }

    public void setPaiCveStPais(final String paiCveStPais) {
        this.paiCveStPais = paiCveStPais;
    }

}
