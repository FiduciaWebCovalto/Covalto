package com.fiduciawebmovil.cueban.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fiduciawebmovil.contrato.entity.Contrato;


@Entity
@Table(name = "f_cueban")
@NoArgsConstructor
public class FCueban {

    @Column(precision = 18, scale = 0)
    private BigDecimal fcbaNumeroCtaBan;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaBanco;

    @Column(length = 80)
    private String fcbaPlazaCba;

    @Id
    @Column(length = 20)
    private String fcbaClabeCba;


    @Column(length = 20)
    private String fcbaRfc;

    @Column
    private String fcbaTitular;

    @Column(length = 30)
    private String fcbaStatus;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaClasTipo;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaNumTipo;

    @Column(precision = 18, scale = 0)
    private BigDecimal fcbaSubCuenta;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaMoneda;

    public BigDecimal getFcbaNumeroCtaBan() {
        return fcbaNumeroCtaBan;
    }

    public void setFcbaNumeroCtaBan(final BigDecimal fcbaNumeroCtaBan) {
        this.fcbaNumeroCtaBan = fcbaNumeroCtaBan;
    }

    public BigDecimal getFcbaBanco() {
        return fcbaBanco;
    }

    public void setFcbaBanco(final BigDecimal fcbaBanco) {
        this.fcbaBanco = fcbaBanco;
    }

    public String getFcbaPlazaCba() {
        return fcbaPlazaCba;
    }

    public void setFcbaPlazaCba(final String fcbaPlazaCba) {
        this.fcbaPlazaCba = fcbaPlazaCba;
    }

    public String getFcbaClabeCba() {
        return fcbaClabeCba;
    }

    public void setFcbaClabeCba(final String fcbaClabeCba) {
        this.fcbaClabeCba = fcbaClabeCba;
    }

    public String getFcbaRfc() {
        return fcbaRfc;
    }

    public void setFcbaRfc(final String fcbaRfc) {
        this.fcbaRfc = fcbaRfc;
    }

    public String getFcbaTitular() {
        return fcbaTitular;
    }

    public void setFcbaTitular(final String fcbaTitular) {
        this.fcbaTitular = fcbaTitular;
    }

    public String getFcbaStatus() {
        return fcbaStatus;
    }

    public void setFcbaStatus(final String fcbaStatus) {
        this.fcbaStatus = fcbaStatus;
    }

    public BigDecimal getFcbaClasTipo() {
        return fcbaClasTipo;
    }

    public void setFcbaClasTipo(final BigDecimal fcbaClasTipo) {
        this.fcbaClasTipo = fcbaClasTipo;
    }

    public BigDecimal getFcbaNumTipo() {
        return fcbaNumTipo;
    }

    public void setFcbaNumTipo(final BigDecimal fcbaNumTipo) {
        this.fcbaNumTipo = fcbaNumTipo;
    }

    public BigDecimal getFcbaSubCuenta() {
        return fcbaSubCuenta;
    }

    public void setFcbaSubCuenta(final BigDecimal fcbaSubCuenta) {
        this.fcbaSubCuenta = fcbaSubCuenta;
    }

    public BigDecimal getFcbaMoneda() {
        return fcbaMoneda;
    }

    public void setFcbaMoneda(final BigDecimal fcbaMoneda) {
        this.fcbaMoneda = fcbaMoneda;
    }

}
