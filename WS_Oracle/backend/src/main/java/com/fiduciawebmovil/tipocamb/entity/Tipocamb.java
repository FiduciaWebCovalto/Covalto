package com.fiduciawebmovil.tipocamb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Table(name = "tipocamb")
@NoArgsConstructor
public class Tipocamb {

    @EmbeddedId
    private TipocambId id;
    @Column(precision = 20, scale = 8)
    private BigDecimal ticImpTipoCamb;

    @Column(precision = 4, scale = 0)
    private BigDecimal ticAnoUltMod;


    @Column(precision = 2, scale = 0)
    private BigDecimal ticMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal ticDiaUltMod;

    @Column(length = 25)
    private String ticCveStTipocam;


    public TipocambId getId() {
        return id;
    }

    public void setId(TipocambId id) {
        this.id = id;
    }

    public BigDecimal getTicImpTipoCamb() {
        return ticImpTipoCamb;
    }

    public void setTicImpTipoCamb(final BigDecimal ticImpTipoCamb) {
        this.ticImpTipoCamb = ticImpTipoCamb;
    }

    public BigDecimal getTicAnoUltMod() {
        return ticAnoUltMod;
    }

    public void setTicAnoUltMod(final BigDecimal ticAnoUltMod) {
        this.ticAnoUltMod = ticAnoUltMod;
    }

    public BigDecimal getTicMesUltMod() {
        return ticMesUltMod;
    }

    public void setTicMesUltMod(final BigDecimal ticMesUltMod) {
        this.ticMesUltMod = ticMesUltMod;
    }

    public BigDecimal getTicDiaUltMod() {
        return ticDiaUltMod;
    }

    public void setTicDiaUltMod(final BigDecimal ticDiaUltMod) {
        this.ticDiaUltMod = ticDiaUltMod;
    }

    public String getTicCveStTipocam() {
        return ticCveStTipocam;
    }

    public void setTicCveStTipocam(final String ticCveStTipocam) {
        this.ticCveStTipocam = ticCveStTipocam;
    }

}
