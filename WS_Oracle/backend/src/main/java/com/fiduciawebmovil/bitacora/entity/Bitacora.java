package com.fiduciawebmovil.bitacora.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Table(name = "bitacora")
@NoArgsConstructor
public class Bitacora {

    @EmbeddedId
    private BitacoraId id;

    @Column
    private String bitDetBitacora;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal bitAnoAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal bitMesAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal bitDiaAltaReg;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal bitAnoUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal bitMesUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal bitDiaUltMod;

    @Column(length = 25)
    private String bitCveStBitacor;


    public BitacoraId getId() {
        return id;
    }

    public void setId(BitacoraId id) {
        this.id = id;
    }

    public String getBitDetBitacora() {
        return bitDetBitacora;
    }

    public void setBitDetBitacora(final String bitDetBitacora) {
        this.bitDetBitacora = bitDetBitacora;
    }

    public BigDecimal getBitAnoAltaReg() {
        return bitAnoAltaReg;
    }

    public void setBitAnoAltaReg(final BigDecimal bitAnoAltaReg) {
        this.bitAnoAltaReg = bitAnoAltaReg;
    }

    public BigDecimal getBitMesAltaReg() {
        return bitMesAltaReg;
    }

    public void setBitMesAltaReg(final BigDecimal bitMesAltaReg) {
        this.bitMesAltaReg = bitMesAltaReg;
    }

    public BigDecimal getBitDiaAltaReg() {
        return bitDiaAltaReg;
    }

    public void setBitDiaAltaReg(final BigDecimal bitDiaAltaReg) {
        this.bitDiaAltaReg = bitDiaAltaReg;
    }

    public BigDecimal getBitAnoUltMod() {
        return bitAnoUltMod;
    }

    public void setBitAnoUltMod(final BigDecimal bitAnoUltMod) {
        this.bitAnoUltMod = bitAnoUltMod;
    }

    public BigDecimal getBitMesUltMod() {
        return bitMesUltMod;
    }

    public void setBitMesUltMod(final BigDecimal bitMesUltMod) {
        this.bitMesUltMod = bitMesUltMod;
    }

    public BigDecimal getBitDiaUltMod() {
        return bitDiaUltMod;
    }

    public void setBitDiaUltMod(final BigDecimal bitDiaUltMod) {
        this.bitDiaUltMod = bitDiaUltMod;
    }

    public String getBitCveStBitacor() {
        return bitCveStBitacor;
    }

    public void setBitCveStBitacor(final String bitCveStBitacor) {
        this.bitCveStBitacor = bitCveStBitacor;
    }

}
