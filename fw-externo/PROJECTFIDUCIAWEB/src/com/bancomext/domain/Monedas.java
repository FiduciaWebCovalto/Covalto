package com.bancomext.domain;




import java.math.BigDecimal;



public class Monedas {

    public Long monNumPais;
    public String monNomMoneda;

    public void setMonNumPais(Long monNumPais) {
        this.monNumPais = monNumPais;
    }

    public Long getMonNumPais() {
        return monNumPais;
    }

    public BigDecimal monAnoAltaReg;

    
    public BigDecimal monMesAltaReg;

    
    public BigDecimal monDiaAltaReg;

    
    public BigDecimal monAnoUltMod;

    
    public BigDecimal monMesUltMod;

    
    public BigDecimal monDiaUltMod;

    
    public String monCveStMoneda;

    public String monSigla;

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
    @Override
    public String toString() {
        return  this.monNumPais+"-"+this.monNomMoneda;
    }
}
