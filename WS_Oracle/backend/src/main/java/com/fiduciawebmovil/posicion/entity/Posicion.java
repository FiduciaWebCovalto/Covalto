package com.fiduciawebmovil.posicion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;



@Table(name = "posicion")
@Entity
@NoArgsConstructor
public class Posicion {

    @EmbeddedId
    private PosicionId id;

    @Column(length = 10)
    private String posNomPizarra;

    @Column(length = 7)
    private String posNumSerEmis;

    @Column(precision = 10, scale = 0)
    private BigDecimal posNumCuponVig;

    @Column(length = 36)
    private String posNomCustodio;

    @Column(precision = 10, scale = 0)
    private BigDecimal posNumMoneda;

    @Column(precision = 10, scale = 0)
    private BigDecimal posCveGarantia;

    @Column(precision = 16, scale = 0)
    private BigDecimal posPosicIniPer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posVtasPosicPer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posCpasPosicPer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posPosicIniEjer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posVtasPosEjer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posCpasPosEjer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posPosicActual;

    @Column(precision = 16, scale = 0)
    private BigDecimal posPosicComprom;

    @Column(precision = 16, scale = 2)
    private BigDecimal posCostoHistoric;

    @Column(precision = 4, scale = 0)
    private BigDecimal posAnoUltMovto;

    @Column(precision = 2, scale = 0)
    private BigDecimal posMesUltMovto;

    @Column(precision = 2, scale = 0)
    private BigDecimal posDiaUltMovto;

    @Column(precision = 4, scale = 0)
    private BigDecimal posAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal posMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal posDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal posAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal posMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal posDiaUltMod;

    @Column(length = 25)
    private String posCveStPosicio;

    @Column(precision = 16, scale = 2)
    private BigDecimal posMinusPlus;


    public String getPosNomPizarra() {
        return posNomPizarra;
    }

    public void setPosNomPizarra(final String posNomPizarra) {
        this.posNomPizarra = posNomPizarra;
    }

    public String getPosNumSerEmis() {
        return posNumSerEmis;
    }

    public void setPosNumSerEmis(final String posNumSerEmis) {
        this.posNumSerEmis = posNumSerEmis;
    }

    public BigDecimal getPosNumCuponVig() {
        return posNumCuponVig;
    }

    public void setPosNumCuponVig(final BigDecimal posNumCuponVig) {
        this.posNumCuponVig = posNumCuponVig;
    }

    public String getPosNomCustodio() {
        return posNomCustodio;
    }

    public void setPosNomCustodio(final String posNomCustodio) {
        this.posNomCustodio = posNomCustodio;
    }

    public BigDecimal getPosNumMoneda() {
        return posNumMoneda;
    }

    public void setPosNumMoneda(final BigDecimal posNumMoneda) {
        this.posNumMoneda = posNumMoneda;
    }

    public BigDecimal getPosCveGarantia() {
        return posCveGarantia;
    }

    public void setPosCveGarantia(final BigDecimal posCveGarantia) {
        this.posCveGarantia = posCveGarantia;
    }

    public BigDecimal getPosPosicIniPer() {
        return posPosicIniPer;
    }

    public void setPosPosicIniPer(final BigDecimal posPosicIniPer) {
        this.posPosicIniPer = posPosicIniPer;
    }

    public BigDecimal getPosVtasPosicPer() {
        return posVtasPosicPer;
    }

    public void setPosVtasPosicPer(final BigDecimal posVtasPosicPer) {
        this.posVtasPosicPer = posVtasPosicPer;
    }

    public BigDecimal getPosCpasPosicPer() {
        return posCpasPosicPer;
    }

    public void setPosCpasPosicPer(final BigDecimal posCpasPosicPer) {
        this.posCpasPosicPer = posCpasPosicPer;
    }

    public BigDecimal getPosPosicIniEjer() {
        return posPosicIniEjer;
    }

    public void setPosPosicIniEjer(final BigDecimal posPosicIniEjer) {
        this.posPosicIniEjer = posPosicIniEjer;
    }

    public BigDecimal getPosVtasPosEjer() {
        return posVtasPosEjer;
    }

    public void setPosVtasPosEjer(final BigDecimal posVtasPosEjer) {
        this.posVtasPosEjer = posVtasPosEjer;
    }

    public BigDecimal getPosCpasPosEjer() {
        return posCpasPosEjer;
    }

    public void setPosCpasPosEjer(final BigDecimal posCpasPosEjer) {
        this.posCpasPosEjer = posCpasPosEjer;
    }

    public BigDecimal getPosPosicActual() {
        return posPosicActual;
    }

    public void setPosPosicActual(final BigDecimal posPosicActual) {
        this.posPosicActual = posPosicActual;
    }

    public BigDecimal getPosPosicComprom() {
        return posPosicComprom;
    }

    public void setPosPosicComprom(final BigDecimal posPosicComprom) {
        this.posPosicComprom = posPosicComprom;
    }

    public BigDecimal getPosCostoHistoric() {
        return posCostoHistoric;
    }

    public void setPosCostoHistoric(final BigDecimal posCostoHistoric) {
        this.posCostoHistoric = posCostoHistoric;
    }

    public BigDecimal getPosAnoUltMovto() {
        return posAnoUltMovto;
    }

    public void setPosAnoUltMovto(final BigDecimal posAnoUltMovto) {
        this.posAnoUltMovto = posAnoUltMovto;
    }

    public BigDecimal getPosMesUltMovto() {
        return posMesUltMovto;
    }

    public void setPosMesUltMovto(final BigDecimal posMesUltMovto) {
        this.posMesUltMovto = posMesUltMovto;
    }

    public BigDecimal getPosDiaUltMovto() {
        return posDiaUltMovto;
    }

    public void setPosDiaUltMovto(final BigDecimal posDiaUltMovto) {
        this.posDiaUltMovto = posDiaUltMovto;
    }

    public BigDecimal getPosAnoAltaReg() {
        return posAnoAltaReg;
    }

    public void setPosAnoAltaReg(final BigDecimal posAnoAltaReg) {
        this.posAnoAltaReg = posAnoAltaReg;
    }

    public BigDecimal getPosMesAltaReg() {
        return posMesAltaReg;
    }

    public void setPosMesAltaReg(final BigDecimal posMesAltaReg) {
        this.posMesAltaReg = posMesAltaReg;
    }

    public BigDecimal getPosDiaAltaReg() {
        return posDiaAltaReg;
    }

    public void setPosDiaAltaReg(final BigDecimal posDiaAltaReg) {
        this.posDiaAltaReg = posDiaAltaReg;
    }

    public BigDecimal getPosAnoUltMod() {
        return posAnoUltMod;
    }

    public void setPosAnoUltMod(final BigDecimal posAnoUltMod) {
        this.posAnoUltMod = posAnoUltMod;
    }

    public BigDecimal getPosMesUltMod() {
        return posMesUltMod;
    }

    public void setPosMesUltMod(final BigDecimal posMesUltMod) {
        this.posMesUltMod = posMesUltMod;
    }

    public BigDecimal getPosDiaUltMod() {
        return posDiaUltMod;
    }

    public void setPosDiaUltMod(final BigDecimal posDiaUltMod) {
        this.posDiaUltMod = posDiaUltMod;
    }

    public String getPosCveStPosicio() {
        return posCveStPosicio;
    }

    public void setPosCveStPosicio(final String posCveStPosicio) {
        this.posCveStPosicio = posCveStPosicio;
    }

    public BigDecimal getPosMinusPlus() {
        return posMinusPlus;
    }

    public PosicionId getId() {
        return id;
    }

    public void setId(PosicionId id) {
        this.id = id;
    }

    public void setPosMinusPlus(final BigDecimal posMinusPlus) {
        this.posMinusPlus = posMinusPlus;
    }

}
