package com.bancomext.domain;










import java.math.BigDecimal;



public class Terceros {

    public Long id;

    
    public Long terNumTercero;

    
    public BigDecimal terNumPais;

    
    public BigDecimal terNumSrama;

    
    public String terCveMigratoria;

    
    public Boolean terCveSexo;

    
    public String terCveTipoPers;

    
    public String terRfc;

    
    public String terNomNacional;

    
    public String terNumLadaCasa;

    
    public String terNumTelefCasa;

    
    public String terNumLadaOfic;

    
    public String terNumTelefOfic;

    public String terNumExtOfic;

    
    public String terNumLadaFax;

    
    public String terNumTelefFax;

    public String terNumExtFax;

    
    public BigDecimal terAnoAltaReg;

    
    public BigDecimal terMesAltaReg;

    
    public BigDecimal terDiaAltaReg;

    
    public BigDecimal terAnoUltMod;

    
    public BigDecimal terMesUltMod;

    
    public BigDecimal terDiaUltMod;

    
    public String terCveStTercero;

    
    public String terCurp;


    public Long terNumContrato;

    @Override
    public String toString() {
        return  this.terNumTercero+"";
    }
    
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setTerNumTercero(Long terNumTercero) {
        this.terNumTercero = terNumTercero;
    }

    public Long getTerNumTercero() {
        return terNumTercero;
    }

    public void setTerNumContrato(Long terNumContrato) {
        this.terNumContrato = terNumContrato;
    }

    public Long getTerNumContrato() {
        return terNumContrato;
    }


    public BigDecimal getTerNumPais() {
        return terNumPais;
    }

    public void setTerNumPais(final BigDecimal terNumPais) {
        this.terNumPais = terNumPais;
    }

    public BigDecimal getTerNumSrama() {
        return terNumSrama;
    }

    public void setTerNumSrama(final BigDecimal terNumSrama) {
        this.terNumSrama = terNumSrama;
    }

    public String getTerCveMigratoria() {
        return terCveMigratoria;
    }

    public void setTerCveMigratoria(final String terCveMigratoria) {
        this.terCveMigratoria = terCveMigratoria;
    }

    public Boolean getTerCveSexo() {
        return terCveSexo;
    }

    public void setTerCveSexo(final Boolean terCveSexo) {
        this.terCveSexo = terCveSexo;
    }

    public String getTerCveTipoPers() {
        return terCveTipoPers;
    }

    public void setTerCveTipoPers(final String terCveTipoPers) {
        this.terCveTipoPers = terCveTipoPers;
    }

    public String getTerRfc() {
        return terRfc;
    }

    public void setTerRfc(final String terRfc) {
        this.terRfc = terRfc;
    }

    public String getTerNomNacional() {
        return terNomNacional;
    }

    public void setTerNomNacional(final String terNomNacional) {
        this.terNomNacional = terNomNacional;
    }

    public String getTerNumLadaCasa() {
        return terNumLadaCasa;
    }

    public void setTerNumLadaCasa(final String terNumLadaCasa) {
        this.terNumLadaCasa = terNumLadaCasa;
    }

    public String getTerNumTelefCasa() {
        return terNumTelefCasa;
    }

    public void setTerNumTelefCasa(final String terNumTelefCasa) {
        this.terNumTelefCasa = terNumTelefCasa;
    }

    public String getTerNumLadaOfic() {
        return terNumLadaOfic;
    }

    public void setTerNumLadaOfic(final String terNumLadaOfic) {
        this.terNumLadaOfic = terNumLadaOfic;
    }

    public String getTerNumTelefOfic() {
        return terNumTelefOfic;
    }

    public void setTerNumTelefOfic(final String terNumTelefOfic) {
        this.terNumTelefOfic = terNumTelefOfic;
    }

    public String getTerNumExtOfic() {
        return terNumExtOfic;
    }

    public void setTerNumExtOfic(final String terNumExtOfic) {
        this.terNumExtOfic = terNumExtOfic;
    }

    public String getTerNumLadaFax() {
        return terNumLadaFax;
    }

    public void setTerNumLadaFax(final String terNumLadaFax) {
        this.terNumLadaFax = terNumLadaFax;
    }

    public String getTerNumTelefFax() {
        return terNumTelefFax;
    }

    public void setTerNumTelefFax(final String terNumTelefFax) {
        this.terNumTelefFax = terNumTelefFax;
    }

    public String getTerNumExtFax() {
        return terNumExtFax;
    }

    public void setTerNumExtFax(final String terNumExtFax) {
        this.terNumExtFax = terNumExtFax;
    }

    public BigDecimal getTerAnoAltaReg() {
        return terAnoAltaReg;
    }

    public void setTerAnoAltaReg(final BigDecimal terAnoAltaReg) {
        this.terAnoAltaReg = terAnoAltaReg;
    }

    public BigDecimal getTerMesAltaReg() {
        return terMesAltaReg;
    }

    public void setTerMesAltaReg(final BigDecimal terMesAltaReg) {
        this.terMesAltaReg = terMesAltaReg;
    }

    public BigDecimal getTerDiaAltaReg() {
        return terDiaAltaReg;
    }

    public void setTerDiaAltaReg(final BigDecimal terDiaAltaReg) {
        this.terDiaAltaReg = terDiaAltaReg;
    }

    public BigDecimal getTerAnoUltMod() {
        return terAnoUltMod;
    }

    public void setTerAnoUltMod(final BigDecimal terAnoUltMod) {
        this.terAnoUltMod = terAnoUltMod;
    }

    public BigDecimal getTerMesUltMod() {
        return terMesUltMod;
    }

    public void setTerMesUltMod(final BigDecimal terMesUltMod) {
        this.terMesUltMod = terMesUltMod;
    }

    public BigDecimal getTerDiaUltMod() {
        return terDiaUltMod;
    }

    public void setTerDiaUltMod(final BigDecimal terDiaUltMod) {
        this.terDiaUltMod = terDiaUltMod;
    }

    public String getTerCveStTercero() {
        return terCveStTercero;
    }

    public void setTerCveStTercero(final String terCveStTercero) {
        this.terCveStTercero = terCveStTercero;
    }

    public String getTerCurp() {
        return terCurp;
    }

    public void setTerCurp(final String terCurp) {
        this.terCurp = terCurp;
    }



}
