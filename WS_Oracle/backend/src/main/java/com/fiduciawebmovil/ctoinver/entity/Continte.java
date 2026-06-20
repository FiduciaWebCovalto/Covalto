package com.fiduciawebmovil.ctoinver.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import java.math.BigDecimal;



@Entity
public class Continte {

    @EmbeddedId
    private ContinteId id;

    @Column(length = 50)
    private String cprNomIntermed;

    @Column(length = 50)
    private String cprNomContacto1;

    @Column(length = 4)
    private String cprNumCveLada1;

    @Column(length = 20)
    private String cprNumTelef1;

    @Column(length = 10)
    private String cprNumExt1;

    @Column(length = 50)
    private String cprNomContacto2;

    @Column(length = 4)
    private String cprNumCveLada2;

    @Column(length = 20)
    private String cprNumTelef2;

    @Column(length = 10)
    private String cprNumExt2;

    @Column(length = 25)
    private String cprCveOrigRec;

    @Column(length = 80)
    private String cprCveFormaMan;

    @Column(length = 25)
    private String cprCveFormaLiq;

    @Column(length = 25)
    private String cprCveTipoCta;

    @Column(precision = 10, scale = 0)
    private BigDecimal cprNumBanco;

    @Column(precision = 10, scale = 0)
    private BigDecimal cprNumSucursal;

    @Column(precision = 11, scale = 0)
    private BigDecimal cprNumCuenta;

    @Column(precision = 4, scale = 0)
    private BigDecimal cprAnoApertura;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprMesApertura;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprDiaApertura;

    @Column(precision = 4, scale = 0)
    private BigDecimal cprAnoVencim;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprMesVencim;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprDiaVencim;

    @Column(precision = 4, scale = 0)
    private BigDecimal cprAnoCancela;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprMesCancela;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprDiaCancela;

    @Column(precision = 4, scale = 0)
    private BigDecimal cprAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal cprAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprDiaUltMod;

    @Column(length = 25)
    private String cprCveStContint;

    @Column(precision = 10, scale = 0)
    private BigDecimal cprCveIsrExen;

    @Column(precision = 16, scale = 2)
    private BigDecimal cprImpRendimi;

    @Column(precision = 10, scale = 0)
    private BigDecimal cprNumPais;

    @Column(length = 50)
    private String cprClienteUnico;

    @Column(length = 25)
    private String cprCveAreaInst;


    public String getCprNomIntermed() {
        return cprNomIntermed;
    }

    public ContinteId getId() {
        return id;
    }

    public void setId(ContinteId id) {
        this.id = id;
    }

    public void setCprNomIntermed(final String cprNomIntermed) {
        this.cprNomIntermed = cprNomIntermed;
    }

    public String getCprNomContacto1() {
        return cprNomContacto1;
    }

    public void setCprNomContacto1(final String cprNomContacto1) {
        this.cprNomContacto1 = cprNomContacto1;
    }

    public String getCprNumCveLada1() {
        return cprNumCveLada1;
    }

    public void setCprNumCveLada1(final String cprNumCveLada1) {
        this.cprNumCveLada1 = cprNumCveLada1;
    }

    public String getCprNumTelef1() {
        return cprNumTelef1;
    }

    public void setCprNumTelef1(final String cprNumTelef1) {
        this.cprNumTelef1 = cprNumTelef1;
    }

    public String getCprNumExt1() {
        return cprNumExt1;
    }

    public void setCprNumExt1(final String cprNumExt1) {
        this.cprNumExt1 = cprNumExt1;
    }

    public String getCprNomContacto2() {
        return cprNomContacto2;
    }

    public void setCprNomContacto2(final String cprNomContacto2) {
        this.cprNomContacto2 = cprNomContacto2;
    }

    public String getCprNumCveLada2() {
        return cprNumCveLada2;
    }

    public void setCprNumCveLada2(final String cprNumCveLada2) {
        this.cprNumCveLada2 = cprNumCveLada2;
    }

    public String getCprNumTelef2() {
        return cprNumTelef2;
    }

    public void setCprNumTelef2(final String cprNumTelef2) {
        this.cprNumTelef2 = cprNumTelef2;
    }

    public String getCprNumExt2() {
        return cprNumExt2;
    }

    public void setCprNumExt2(final String cprNumExt2) {
        this.cprNumExt2 = cprNumExt2;
    }

    public String getCprCveOrigRec() {
        return cprCveOrigRec;
    }

    public void setCprCveOrigRec(final String cprCveOrigRec) {
        this.cprCveOrigRec = cprCveOrigRec;
    }

    public String getCprCveFormaMan() {
        return cprCveFormaMan;
    }

    public void setCprCveFormaMan(final String cprCveFormaMan) {
        this.cprCveFormaMan = cprCveFormaMan;
    }

    public String getCprCveFormaLiq() {
        return cprCveFormaLiq;
    }

    public void setCprCveFormaLiq(final String cprCveFormaLiq) {
        this.cprCveFormaLiq = cprCveFormaLiq;
    }

    public String getCprCveTipoCta() {
        return cprCveTipoCta;
    }

    public void setCprCveTipoCta(final String cprCveTipoCta) {
        this.cprCveTipoCta = cprCveTipoCta;
    }

    public BigDecimal getCprNumBanco() {
        return cprNumBanco;
    }

    public void setCprNumBanco(final BigDecimal cprNumBanco) {
        this.cprNumBanco = cprNumBanco;
    }

    public BigDecimal getCprNumSucursal() {
        return cprNumSucursal;
    }

    public void setCprNumSucursal(final BigDecimal cprNumSucursal) {
        this.cprNumSucursal = cprNumSucursal;
    }

    public BigDecimal getCprNumCuenta() {
        return cprNumCuenta;
    }

    public void setCprNumCuenta(final BigDecimal cprNumCuenta) {
        this.cprNumCuenta = cprNumCuenta;
    }

    public BigDecimal getCprAnoApertura() {
        return cprAnoApertura;
    }

    public void setCprAnoApertura(final BigDecimal cprAnoApertura) {
        this.cprAnoApertura = cprAnoApertura;
    }

    public BigDecimal getCprMesApertura() {
        return cprMesApertura;
    }

    public void setCprMesApertura(final BigDecimal cprMesApertura) {
        this.cprMesApertura = cprMesApertura;
    }

    public BigDecimal getCprDiaApertura() {
        return cprDiaApertura;
    }

    public void setCprDiaApertura(final BigDecimal cprDiaApertura) {
        this.cprDiaApertura = cprDiaApertura;
    }

    public BigDecimal getCprAnoVencim() {
        return cprAnoVencim;
    }

    public void setCprAnoVencim(final BigDecimal cprAnoVencim) {
        this.cprAnoVencim = cprAnoVencim;
    }

    public BigDecimal getCprMesVencim() {
        return cprMesVencim;
    }

    public void setCprMesVencim(final BigDecimal cprMesVencim) {
        this.cprMesVencim = cprMesVencim;
    }

    public BigDecimal getCprDiaVencim() {
        return cprDiaVencim;
    }

    public void setCprDiaVencim(final BigDecimal cprDiaVencim) {
        this.cprDiaVencim = cprDiaVencim;
    }

    public BigDecimal getCprAnoCancela() {
        return cprAnoCancela;
    }

    public void setCprAnoCancela(final BigDecimal cprAnoCancela) {
        this.cprAnoCancela = cprAnoCancela;
    }

    public BigDecimal getCprMesCancela() {
        return cprMesCancela;
    }

    public void setCprMesCancela(final BigDecimal cprMesCancela) {
        this.cprMesCancela = cprMesCancela;
    }

    public BigDecimal getCprDiaCancela() {
        return cprDiaCancela;
    }

    public void setCprDiaCancela(final BigDecimal cprDiaCancela) {
        this.cprDiaCancela = cprDiaCancela;
    }

    public BigDecimal getCprAnoAltaReg() {
        return cprAnoAltaReg;
    }

    public void setCprAnoAltaReg(final BigDecimal cprAnoAltaReg) {
        this.cprAnoAltaReg = cprAnoAltaReg;
    }

    public BigDecimal getCprMesAltaReg() {
        return cprMesAltaReg;
    }

    public void setCprMesAltaReg(final BigDecimal cprMesAltaReg) {
        this.cprMesAltaReg = cprMesAltaReg;
    }

    public BigDecimal getCprDiaAltaReg() {
        return cprDiaAltaReg;
    }

    public void setCprDiaAltaReg(final BigDecimal cprDiaAltaReg) {
        this.cprDiaAltaReg = cprDiaAltaReg;
    }

    public BigDecimal getCprAnoUltMod() {
        return cprAnoUltMod;
    }

    public void setCprAnoUltMod(final BigDecimal cprAnoUltMod) {
        this.cprAnoUltMod = cprAnoUltMod;
    }

    public BigDecimal getCprMesUltMod() {
        return cprMesUltMod;
    }

    public void setCprMesUltMod(final BigDecimal cprMesUltMod) {
        this.cprMesUltMod = cprMesUltMod;
    }

    public BigDecimal getCprDiaUltMod() {
        return cprDiaUltMod;
    }

    public void setCprDiaUltMod(final BigDecimal cprDiaUltMod) {
        this.cprDiaUltMod = cprDiaUltMod;
    }

    public String getCprCveStContint() {
        return cprCveStContint;
    }

    public void setCprCveStContint(final String cprCveStContint) {
        this.cprCveStContint = cprCveStContint;
    }

    public BigDecimal getCprCveIsrExen() {
        return cprCveIsrExen;
    }

    public void setCprCveIsrExen(final BigDecimal cprCveIsrExen) {
        this.cprCveIsrExen = cprCveIsrExen;
    }

    public BigDecimal getCprImpRendimi() {
        return cprImpRendimi;
    }

    public void setCprImpRendimi(final BigDecimal cprImpRendimi) {
        this.cprImpRendimi = cprImpRendimi;
    }

    public BigDecimal getCprNumPais() {
        return cprNumPais;
    }

    public void setCprNumPais(final BigDecimal cprNumPais) {
        this.cprNumPais = cprNumPais;
    }

    public String getCprClienteUnico() {
        return cprClienteUnico;
    }

    public void setCprClienteUnico(final String cprClienteUnico) {
        this.cprClienteUnico = cprClienteUnico;
    }

    public String getCprCveAreaInst() {
        return cprCveAreaInst;
    }

    public void setCprCveAreaInst(final String cprCveAreaInst) {
        this.cprCveAreaInst = cprCveAreaInst;
    }

}
