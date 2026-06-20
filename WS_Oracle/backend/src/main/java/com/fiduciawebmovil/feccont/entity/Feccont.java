package com.fiduciawebmovil.feccont.entity;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Table(name = "feccont")
@Entity
public class Feccont {

    @Id
    @Column(nullable = false, length = 10)
    private String fcoFecha;

    @Column(length = 25)
    private String fcoCveTipoFecha;

    public String getFcoFecha() {
        return fcoFecha;
    }

    public void setFcoFecha(String fcoFecha) {
        this.fcoFecha = fcoFecha;
    }

    @Column(precision = 4, scale = 0)
    private BigDecimal fcoAnoDia;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoMesDia;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoDiaDia;

    @Column(precision = 4, scale = 0)
    private BigDecimal fcoAnoApliConta;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoMesApliConta;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoDiaApliConta;

    @Column(precision = 4, scale = 0)
    private BigDecimal fcoAnoUltCierre;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoMesUltCierre;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoDiaUltCierre;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcoDiasOperAno;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcoDiasOperSist;

    @Column(precision = 4, scale = 0)
    private BigDecimal fcoAnoIniOpers;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoMesIniOpers;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoDiaIniOpers;

    @Column(precision = 4, scale = 0)
    private BigDecimal fcoAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal fcoAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal fcoDiaUltMod;

    @Column(length = 25)
    private String fcoCveStFeccont;

    public String getFcoCveTipoFecha() {
        return fcoCveTipoFecha;
    }

    public void setFcoCveTipoFecha(final String fcoCveTipoFecha) {
        this.fcoCveTipoFecha = fcoCveTipoFecha;
    }

    public BigDecimal getFcoAnoDia() {
        return fcoAnoDia;
    }

    public void setFcoAnoDia(final BigDecimal fcoAnoDia) {
        this.fcoAnoDia = fcoAnoDia;
    }

    public BigDecimal getFcoMesDia() {
        return fcoMesDia;
    }

    public void setFcoMesDia(final BigDecimal fcoMesDia) {
        this.fcoMesDia = fcoMesDia;
    }

    public BigDecimal getFcoDiaDia() {
        return fcoDiaDia;
    }

    public void setFcoDiaDia(final BigDecimal fcoDiaDia) {
        this.fcoDiaDia = fcoDiaDia;
    }

    public BigDecimal getFcoAnoApliConta() {
        return fcoAnoApliConta;
    }

    public void setFcoAnoApliConta(final BigDecimal fcoAnoApliConta) {
        this.fcoAnoApliConta = fcoAnoApliConta;
    }

    public BigDecimal getFcoMesApliConta() {
        return fcoMesApliConta;
    }

    public void setFcoMesApliConta(final BigDecimal fcoMesApliConta) {
        this.fcoMesApliConta = fcoMesApliConta;
    }

    public BigDecimal getFcoDiaApliConta() {
        return fcoDiaApliConta;
    }

    public void setFcoDiaApliConta(final BigDecimal fcoDiaApliConta) {
        this.fcoDiaApliConta = fcoDiaApliConta;
    }

    public BigDecimal getFcoAnoUltCierre() {
        return fcoAnoUltCierre;
    }

    public void setFcoAnoUltCierre(final BigDecimal fcoAnoUltCierre) {
        this.fcoAnoUltCierre = fcoAnoUltCierre;
    }

    public BigDecimal getFcoMesUltCierre() {
        return fcoMesUltCierre;
    }

    public void setFcoMesUltCierre(final BigDecimal fcoMesUltCierre) {
        this.fcoMesUltCierre = fcoMesUltCierre;
    }

    public BigDecimal getFcoDiaUltCierre() {
        return fcoDiaUltCierre;
    }

    public void setFcoDiaUltCierre(final BigDecimal fcoDiaUltCierre) {
        this.fcoDiaUltCierre = fcoDiaUltCierre;
    }

    public BigDecimal getFcoDiasOperAno() {
        return fcoDiasOperAno;
    }

    public void setFcoDiasOperAno(final BigDecimal fcoDiasOperAno) {
        this.fcoDiasOperAno = fcoDiasOperAno;
    }

    public BigDecimal getFcoDiasOperSist() {
        return fcoDiasOperSist;
    }

    public void setFcoDiasOperSist(final BigDecimal fcoDiasOperSist) {
        this.fcoDiasOperSist = fcoDiasOperSist;
    }

    public BigDecimal getFcoAnoIniOpers() {
        return fcoAnoIniOpers;
    }

    public void setFcoAnoIniOpers(final BigDecimal fcoAnoIniOpers) {
        this.fcoAnoIniOpers = fcoAnoIniOpers;
    }

    public BigDecimal getFcoMesIniOpers() {
        return fcoMesIniOpers;
    }

    public void setFcoMesIniOpers(final BigDecimal fcoMesIniOpers) {
        this.fcoMesIniOpers = fcoMesIniOpers;
    }

    public BigDecimal getFcoDiaIniOpers() {
        return fcoDiaIniOpers;
    }

    public void setFcoDiaIniOpers(final BigDecimal fcoDiaIniOpers) {
        this.fcoDiaIniOpers = fcoDiaIniOpers;
    }

    public BigDecimal getFcoAnoAltaReg() {
        return fcoAnoAltaReg;
    }

    public void setFcoAnoAltaReg(final BigDecimal fcoAnoAltaReg) {
        this.fcoAnoAltaReg = fcoAnoAltaReg;
    }

    public BigDecimal getFcoMesAltaReg() {
        return fcoMesAltaReg;
    }

    public void setFcoMesAltaReg(final BigDecimal fcoMesAltaReg) {
        this.fcoMesAltaReg = fcoMesAltaReg;
    }

    public BigDecimal getFcoDiaAltaReg() {
        return fcoDiaAltaReg;
    }

    public void setFcoDiaAltaReg(final BigDecimal fcoDiaAltaReg) {
        this.fcoDiaAltaReg = fcoDiaAltaReg;
    }

    public BigDecimal getFcoAnoUltMod() {
        return fcoAnoUltMod;
    }

    public void setFcoAnoUltMod(final BigDecimal fcoAnoUltMod) {
        this.fcoAnoUltMod = fcoAnoUltMod;
    }

    public BigDecimal getFcoMesUltMod() {
        return fcoMesUltMod;
    }

    public void setFcoMesUltMod(final BigDecimal fcoMesUltMod) {
        this.fcoMesUltMod = fcoMesUltMod;
    }

    public BigDecimal getFcoDiaUltMod() {
        return fcoDiaUltMod;
    }

    public void setFcoDiaUltMod(final BigDecimal fcoDiaUltMod) {
        this.fcoDiaUltMod = fcoDiaUltMod;
    }

    public String getFcoCveStFeccont() {
        return fcoCveStFeccont;
    }

    public void setFcoCveStFeccont(final String fcoCveStFeccont) {
        this.fcoCveStFeccont = fcoCveStFeccont;
    }

}
