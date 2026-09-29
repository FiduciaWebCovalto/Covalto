package com.bancomext.domain;










import java.math.BigDecimal;



public class Posicion {

    public PosicionDTO id;

    
    public String posNomPizarra;

    
    public String posNumSerEmis;

    
    public BigDecimal posNumCuponVig;

    
    public String posNomCustodio;

    
    public BigDecimal posNumMoneda;

    
    public BigDecimal posCveGarantia;

    
    public BigDecimal posPosicIniPer;

    
    public BigDecimal posVtasPosicPer;

    
    public BigDecimal posCpasPosicPer;

    
    public BigDecimal posPosicIniEjer;

    
    public BigDecimal posVtasPosEjer;

    
    public BigDecimal posCpasPosEjer;

    
    public BigDecimal posPosicActual;

    
    public BigDecimal posPosicComprom;

    
    public BigDecimal posCostoHistoric;

    
    public BigDecimal posAnoUltMovto;

    
    public BigDecimal posMesUltMovto;

    
    public BigDecimal posDiaUltMovto;

    
    public BigDecimal posAnoAltaReg;

    
    public BigDecimal posMesAltaReg;

    
    public BigDecimal posDiaAltaReg;

    
    public BigDecimal posAnoUltMod;

    
    public BigDecimal posMesUltMod;

    
    public BigDecimal posDiaUltMod;

    
    public String posCveStPosicio;

    
    public BigDecimal posMinusPlus;

    public void setId(PosicionDTO id) {
        this.id = id;
    }

    public PosicionDTO getId() {
        return id;
    }

    public Contrato posNumContrato;



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

    public void setPosMinusPlus(final BigDecimal posMinusPlus) {
        this.posMinusPlus = posMinusPlus;
    }

    public Contrato getPosNumContrato() {
        return posNumContrato;
    }

    public void setPosNumContrato(final Contrato posNumContrato) {
        this.posNumContrato = posNumContrato;
    }

}
