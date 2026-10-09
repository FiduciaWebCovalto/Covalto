package com.fiduciawebmovil.benefici.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;



@Entity
@Table(name = "benefici")
@NoArgsConstructor
public class Benefici {

    @EmbeddedId
    private BeneficiId id;

    @Column(precision = 10, scale = 0)
    private BigDecimal benNumPais;

    @Column(precision = 10, scale = 0)
    private BigDecimal benNumSrama;

    @Column(length = 25)
    private String benCveMigratoria;

    @Column
    private Boolean benCveSexo;

    @Column(length = 25)
    private String benCveTipoPer;

    @Column(length = 250)
    private String benNomBenef;

    @Column(length = 15)
    private String benRfc;

    @Column(length = 20)
    private String benFecNac;

    @Column(length = 50)
    private String benNomRepres;

    @Column(length = 50)
    private String benNomNacional;

    @Column(length = 4)
    private String benNumLadaCasa;

    @Column(length = 50)
    private String benNumTelefCasa;

    @Column(length = 4)
    private String benNumLadaOfic;

    @Column(length = 50)
    private String benNumTelefOfic;

    @Column(length = 10)
    private String benNumExtOfic;

    @Column(length = 4)
    private String benNumLadaFax;

    @Column(length = 50)
    private String benNumTelefFax;

    @Column(length = 10)
    private String benNumExtFax;

    @Column(precision = 4, scale = 0)
    private BigDecimal benAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal benMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal benDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal benAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal benMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal benDiaUltMod;

    @Column(length = 25)
    private String benCveStBenefic;

    @Column(length = 20)
    private String benCurp;



    public BigDecimal getBenNumPais() {
        return benNumPais;
    }

    public void setBenNumPais(final BigDecimal benNumPais) {
        this.benNumPais = benNumPais;
    }

    public BigDecimal getBenNumSrama() {
        return benNumSrama;
    }

    public void setBenNumSrama(final BigDecimal benNumSrama) {
        this.benNumSrama = benNumSrama;
    }

    public String getBenCveMigratoria() {
        return benCveMigratoria;
    }

    public BeneficiId getId() {
        return id;
    }

    public void setId(BeneficiId id) {
        this.id = id;
    }

    public void setBenCveMigratoria(final String benCveMigratoria) {
        this.benCveMigratoria = benCveMigratoria;
    }

    public Boolean getBenCveSexo() {
        return benCveSexo;
    }

    public void setBenCveSexo(final Boolean benCveSexo) {
        this.benCveSexo = benCveSexo;
    }

    public String getBenCveTipoPer() {
        return benCveTipoPer;
    }

    public void setBenCveTipoPer(final String benCveTipoPer) {
        this.benCveTipoPer = benCveTipoPer;
    }

    public String getBenNomBenef() {
        return benNomBenef;
    }

    public void setBenNomBenef(final String benNomBenef) {
        this.benNomBenef = benNomBenef;
    }

    public String getBenRfc() {
        return benRfc;
    }

    public void setBenRfc(final String benRfc) {
        this.benRfc = benRfc;
    }

    public String getBenFecNac() {
        return benFecNac;
    }

    public void setBenFecNac(final String benFecNac) {
        this.benFecNac = benFecNac;
    }

    public String getBenNomRepres() {
        return benNomRepres;
    }

    public void setBenNomRepres(final String benNomRepres) {
        this.benNomRepres = benNomRepres;
    }

    public String getBenNomNacional() {
        return benNomNacional;
    }

    public void setBenNomNacional(final String benNomNacional) {
        this.benNomNacional = benNomNacional;
    }

    public String getBenNumLadaCasa() {
        return benNumLadaCasa;
    }

    public void setBenNumLadaCasa(final String benNumLadaCasa) {
        this.benNumLadaCasa = benNumLadaCasa;
    }

    public String getBenNumTelefCasa() {
        return benNumTelefCasa;
    }

    public void setBenNumTelefCasa(final String benNumTelefCasa) {
        this.benNumTelefCasa = benNumTelefCasa;
    }

    public String getBenNumLadaOfic() {
        return benNumLadaOfic;
    }

    public void setBenNumLadaOfic(final String benNumLadaOfic) {
        this.benNumLadaOfic = benNumLadaOfic;
    }

    public String getBenNumTelefOfic() {
        return benNumTelefOfic;
    }

    public void setBenNumTelefOfic(final String benNumTelefOfic) {
        this.benNumTelefOfic = benNumTelefOfic;
    }

    public String getBenNumExtOfic() {
        return benNumExtOfic;
    }

    public void setBenNumExtOfic(final String benNumExtOfic) {
        this.benNumExtOfic = benNumExtOfic;
    }

    public String getBenNumLadaFax() {
        return benNumLadaFax;
    }

    public void setBenNumLadaFax(final String benNumLadaFax) {
        this.benNumLadaFax = benNumLadaFax;
    }

    public String getBenNumTelefFax() {
        return benNumTelefFax;
    }

    public void setBenNumTelefFax(final String benNumTelefFax) {
        this.benNumTelefFax = benNumTelefFax;
    }

    public String getBenNumExtFax() {
        return benNumExtFax;
    }

    public void setBenNumExtFax(final String benNumExtFax) {
        this.benNumExtFax = benNumExtFax;
    }

    public BigDecimal getBenAnoAltaReg() {
        return benAnoAltaReg;
    }

    public void setBenAnoAltaReg(final BigDecimal benAnoAltaReg) {
        this.benAnoAltaReg = benAnoAltaReg;
    }

    public BigDecimal getBenMesAltaReg() {
        return benMesAltaReg;
    }

    public void setBenMesAltaReg(final BigDecimal benMesAltaReg) {
        this.benMesAltaReg = benMesAltaReg;
    }

    public BigDecimal getBenDiaAltaReg() {
        return benDiaAltaReg;
    }

    public void setBenDiaAltaReg(final BigDecimal benDiaAltaReg) {
        this.benDiaAltaReg = benDiaAltaReg;
    }

    public BigDecimal getBenAnoUltMod() {
        return benAnoUltMod;
    }

    public void setBenAnoUltMod(final BigDecimal benAnoUltMod) {
        this.benAnoUltMod = benAnoUltMod;
    }

    public BigDecimal getBenMesUltMod() {
        return benMesUltMod;
    }

    public void setBenMesUltMod(final BigDecimal benMesUltMod) {
        this.benMesUltMod = benMesUltMod;
    }

    public BigDecimal getBenDiaUltMod() {
        return benDiaUltMod;
    }

    public void setBenDiaUltMod(final BigDecimal benDiaUltMod) {
        this.benDiaUltMod = benDiaUltMod;
    }

    public String getBenCveStBenefic() {
        return benCveStBenefic;
    }

    public void setBenCveStBenefic(final String benCveStBenefic) {
        this.benCveStBenefic = benCveStBenefic;
    }

    public String getBenCurp() {
        return benCurp;
    }

    public void setBenCurp(final String benCurp) {
        this.benCurp = benCurp;
    }

}
