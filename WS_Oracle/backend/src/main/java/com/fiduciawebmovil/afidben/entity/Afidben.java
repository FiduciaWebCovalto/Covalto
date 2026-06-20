package com.fiduciawebmovil.afidben.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Table(name = "afidben")
@NoArgsConstructor
public class Afidben {

    @EmbeddedId
    private AfidbenId id;

    @Column
    private String afbNomFidben;

    @Column(length = 50)
    private String afbTelFidben;

    @Column(length = 25)
    private String afbCveStFidBen;

    @Column(length = 50)
    private String afbCalleNum;

    @Column(length = 50)
    private String afbNomColonia;

    @Column(length = 50)
    private String afbNomPoblacion;

    @Column(precision = 5, scale = 0)
    private BigDecimal afbCodigoPostal;

    @Column(precision = 2, scale = 0)
    private BigDecimal afbNumEstado;

    @Column(length = 50)
    private String afbNomEstado;

    @Column(precision = 3, scale = 0)
    private BigDecimal afbNumPais;

    @Column(length = 50)
    private String afbNomPais;

    @Column(length = 20)
    private String afbCurp;

    @Column(length = 25)
    private String afbTipoPersona;

    @Column(length = 50)
    private String afbNomMunicipio;

    @Column(precision = 10, scale = 0)
    private BigDecimal afbFolioWf;

    @Column(precision = 10, scale = 0)
    private BigDecimal afbFolioWfPld;

    @Column(precision = 10, scale = 2)
    private BigDecimal afbClifrec;

    @Column
    private String afbFechaAlta;

    @Column
    private String afbFechaModif;

    @Column(length = 50)
    private String afbCis;

    @Column(length = 5)
    private String afbNumOper;


    public String getAfbNomFidben() {
        return afbNomFidben;
    }

    public void setAfbNomFidben(final String afbNomFidben) {
        this.afbNomFidben = afbNomFidben;
    }

    public AfidbenId getId() {
        return id;
    }

    public void setId(AfidbenId id) {
        this.id = id;
    }

    public String getAfbTelFidben() {
        return afbTelFidben;
    }

    public void setAfbTelFidben(final String afbTelFidben) {
        this.afbTelFidben = afbTelFidben;
    }

    public String getAfbCveStFidBen() {
        return afbCveStFidBen;
    }

    public void setAfbCveStFidBen(final String afbCveStFidBen) {
        this.afbCveStFidBen = afbCveStFidBen;
    }

    public String getAfbCalleNum() {
        return afbCalleNum;
    }

    public void setAfbCalleNum(final String afbCalleNum) {
        this.afbCalleNum = afbCalleNum;
    }

    public String getAfbNomColonia() {
        return afbNomColonia;
    }

    public void setAfbNomColonia(final String afbNomColonia) {
        this.afbNomColonia = afbNomColonia;
    }

    public String getAfbNomPoblacion() {
        return afbNomPoblacion;
    }

    public void setAfbNomPoblacion(final String afbNomPoblacion) {
        this.afbNomPoblacion = afbNomPoblacion;
    }

    public BigDecimal getAfbCodigoPostal() {
        return afbCodigoPostal;
    }

    public void setAfbCodigoPostal(final BigDecimal afbCodigoPostal) {
        this.afbCodigoPostal = afbCodigoPostal;
    }

    public BigDecimal getAfbNumEstado() {
        return afbNumEstado;
    }

    public void setAfbNumEstado(final BigDecimal afbNumEstado) {
        this.afbNumEstado = afbNumEstado;
    }

    public String getAfbNomEstado() {
        return afbNomEstado;
    }

    public void setAfbNomEstado(final String afbNomEstado) {
        this.afbNomEstado = afbNomEstado;
    }

    public BigDecimal getAfbNumPais() {
        return afbNumPais;
    }

    public void setAfbNumPais(final BigDecimal afbNumPais) {
        this.afbNumPais = afbNumPais;
    }

    public String getAfbNomPais() {
        return afbNomPais;
    }

    public void setAfbNomPais(final String afbNomPais) {
        this.afbNomPais = afbNomPais;
    }

    public String getAfbCurp() {
        return afbCurp;
    }

    public void setAfbCurp(final String afbCurp) {
        this.afbCurp = afbCurp;
    }

    public String getAfbTipoPersona() {
        return afbTipoPersona;
    }

    public void setAfbTipoPersona(final String afbTipoPersona) {
        this.afbTipoPersona = afbTipoPersona;
    }

    public String getAfbNomMunicipio() {
        return afbNomMunicipio;
    }

    public void setAfbNomMunicipio(final String afbNomMunicipio) {
        this.afbNomMunicipio = afbNomMunicipio;
    }

    public BigDecimal getAfbFolioWf() {
        return afbFolioWf;
    }

    public void setAfbFolioWf(final BigDecimal afbFolioWf) {
        this.afbFolioWf = afbFolioWf;
    }

    public BigDecimal getAfbFolioWfPld() {
        return afbFolioWfPld;
    }

    public void setAfbFolioWfPld(final BigDecimal afbFolioWfPld) {
        this.afbFolioWfPld = afbFolioWfPld;
    }

    public BigDecimal getAfbClifrec() {
        return afbClifrec;
    }

    public void setAfbClifrec(final BigDecimal afbClifrec) {
        this.afbClifrec = afbClifrec;
    }

    public String getAfbFechaAlta() {
        return afbFechaAlta;
    }

    public void setAfbFechaAlta(final String afbFechaAlta) {
        this.afbFechaAlta = afbFechaAlta;
    }

    public String getAfbFechaModif() {
        return afbFechaModif;
    }

    public void setAfbFechaModif(final String afbFechaModif) {
        this.afbFechaModif = afbFechaModif;
    }

    public String getAfbCis() {
        return afbCis;
    }

    public void setAfbCis(final String afbCis) {
        this.afbCis = afbCis;
    }

    public String getAfbNumOper() {
        return afbNumOper;
    }

    public void setAfbNumOper(final String afbNumOper) {
        this.afbNumOper = afbNumOper;
    }

}
