package com.fiduciawebmovil.terceros.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;



@Entity
@Table(name = "terceros")
@NoArgsConstructor
public class Terceros {


    @EmbeddedId
    private TercerosId id;

    @Column(precision = 10, scale = 0)
    private BigDecimal terNumPais;

    @Column(precision = 10, scale = 0)
    private BigDecimal terNumSrama;

    @Column(length = 25)
    private String terCveMigratoria;

    @Column
    private Boolean terCveSexo;

    @Column(length = 25)
    private String terCveTipoPers;

    @Column(length = 250)
    private String terNomTercero;

    @Column(length = 15)
    private String terRfc;

    @Column(length = 50)
    private String terNomNacional;

    @Column(length = 4)
    private String terNumLadaCasa;

    @Column(length = 20)
    private String terNumTelefCasa;

    @Column(length = 4)
    private String terNumLadaOfic;

    @Column(length = 20)
    private String terNumTelefOfic;

    @Column(length = 10)
    private String terNumExtOfic;

    @Column(length = 4)
    private String terNumLadaFax;

    @Column(length = 20)
    private String terNumTelefFax;

    @Column(length = 10)
    private String terNumExtFax;

    @Column(precision = 4, scale = 0)
    private BigDecimal terAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal terMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal terDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal terAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal terMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal terDiaUltMod;

    @Column(length = 25)
    private String terCveStTercero;

    @Column(length = 20)
    private String terCurp;


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

    public String getTerNomTercero() {
        return terNomTercero;
    }

    public void setTerNomTercero(final String terNomTercero) {
        this.terNomTercero = terNomTercero;
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

    public TercerosId getId() {
        return id;
    }

    public void setId(TercerosId id) {
        this.id = id;
    }

    public String getTerCurp() {
        return terCurp;
    }

    public void setTerCurp(final String terCurp) {
        this.terCurp = terCurp;
    }


}
