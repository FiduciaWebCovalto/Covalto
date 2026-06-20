package com.fiduciawebmovil.cuentasinversion.entity;

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
@Table(name = "f_cuentas_inversion")
@NoArgsConstructor
public class FCuentasInversion {

    @Column(precision = 10, scale = 0)
    private Long fciNumFideicomiso;

   @JsonIgnoreProperties({"users", "handler", "hibernateLazyInitializer"})
    @ManyToMany
    @JoinTable(
        name = "f_cuentas_inversion",
        joinColumns = @JoinColumn(name="fciNumCta"),
        inverseJoinColumns = @JoinColumn(name="fciNumFideicomiso"),
        uniqueConstraints = { @UniqueConstraint(columnNames = {"fciNumCta", "fciNumFideicomiso"})}
    )
    private List<Contrato> contrato;  

    @Id
    @Column
    private String fciNumCta;

    @Column
    private String fciTipoCta;

    @Column
    private String fciTitDeCta;

    @Column
    private String fciIntermediario;

    @Column
    private String fciMoneda;

    @Column
    private String fciPais;

    @Column
    private String fciFeDeAp;

    @Column
    private String fciClabe;

    @Column
    private String fciEstatusFisIsr;

    @Column
    private String fciRfcDeLaCta;

    @Column
    private String fciDomDeLaCta;

    @Column(length = 1255)
    private String fciFormaManejo;

    @Column
    private String fciCtaRel;

    @Column
    private String fciEstatus;

    @Column
    private String fciEstatusHogan;

    @Column
    private String fciNombreCta;

    @Column
    private String fciObservac;

    @Column
    private String fciContratoEnviado;

    @Column
    private String fciUsuario;

    @Column(precision = 10, scale = 0)
    private BigDecimal fciFolio;

    @Column(precision = 24, scale = 6)
    private BigDecimal fciMontoEmbargo;


    public Long getFciNumFideicomiso() {
        return fciNumFideicomiso;
    }

    public void setFciNumFideicomiso(final Long fciNumFideicomiso) {
        this.fciNumFideicomiso = fciNumFideicomiso;
    }

    public String getFciNumCta() {
        return fciNumCta;
    }

    public void setFciNumCta(final String fciNumCta) {
        this.fciNumCta = fciNumCta;
    }

    public String getFciTipoCta() {
        return fciTipoCta;
    }

    public void setFciTipoCta(final String fciTipoCta) {
        this.fciTipoCta = fciTipoCta;
    }

    public String getFciTitDeCta() {
        return fciTitDeCta;
    }

    public void setFciTitDeCta(final String fciTitDeCta) {
        this.fciTitDeCta = fciTitDeCta;
    }

    public String getFciIntermediario() {
        return fciIntermediario;
    }

    public void setFciIntermediario(final String fciIntermediario) {
        this.fciIntermediario = fciIntermediario;
    }

    public String getFciMoneda() {
        return fciMoneda;
    }

    public void setFciMoneda(final String fciMoneda) {
        this.fciMoneda = fciMoneda;
    }

    public String getFciPais() {
        return fciPais;
    }

    public void setFciPais(final String fciPais) {
        this.fciPais = fciPais;
    }

    public String getFciFeDeAp() {
        return fciFeDeAp;
    }

    public void setFciFeDeAp(final String fciFeDeAp) {
        this.fciFeDeAp = fciFeDeAp;
    }

    public String getFciClabe() {
        return fciClabe;
    }

    public void setFciClabe(final String fciClabe) {
        this.fciClabe = fciClabe;
    }

    public String getFciEstatusFisIsr() {
        return fciEstatusFisIsr;
    }

    public void setFciEstatusFisIsr(final String fciEstatusFisIsr) {
        this.fciEstatusFisIsr = fciEstatusFisIsr;
    }

    public String getFciRfcDeLaCta() {
        return fciRfcDeLaCta;
    }

    public void setFciRfcDeLaCta(final String fciRfcDeLaCta) {
        this.fciRfcDeLaCta = fciRfcDeLaCta;
    }

    public String getFciDomDeLaCta() {
        return fciDomDeLaCta;
    }

    public void setFciDomDeLaCta(final String fciDomDeLaCta) {
        this.fciDomDeLaCta = fciDomDeLaCta;
    }

    public String getFciFormaManejo() {
        return fciFormaManejo;
    }

    public void setFciFormaManejo(final String fciFormaManejo) {
        this.fciFormaManejo = fciFormaManejo;
    }

    public String getFciCtaRel() {
        return fciCtaRel;
    }

    public void setFciCtaRel(final String fciCtaRel) {
        this.fciCtaRel = fciCtaRel;
    }

    public String getFciEstatus() {
        return fciEstatus;
    }

    public void setFciEstatus(final String fciEstatus) {
        this.fciEstatus = fciEstatus;
    }

    public String getFciEstatusHogan() {
        return fciEstatusHogan;
    }

    public void setFciEstatusHogan(final String fciEstatusHogan) {
        this.fciEstatusHogan = fciEstatusHogan;
    }

    public String getFciNombreCta() {
        return fciNombreCta;
    }

    public void setFciNombreCta(final String fciNombreCta) {
        this.fciNombreCta = fciNombreCta;
    }

    public String getFciObservac() {
        return fciObservac;
    }

    public void setFciObservac(final String fciObservac) {
        this.fciObservac = fciObservac;
    }

    public String getFciContratoEnviado() {
        return fciContratoEnviado;
    }

    public void setFciContratoEnviado(final String fciContratoEnviado) {
        this.fciContratoEnviado = fciContratoEnviado;
    }

    public String getFciUsuario() {
        return fciUsuario;
    }

    public void setFciUsuario(final String fciUsuario) {
        this.fciUsuario = fciUsuario;
    }

    public BigDecimal getFciFolio() {
        return fciFolio;
    }

    public void setFciFolio(final BigDecimal fciFolio) {
        this.fciFolio = fciFolio;
    }

    public BigDecimal getFciMontoEmbargo() {
        return fciMontoEmbargo;
    }

    public void setFciMontoEmbargo(final BigDecimal fciMontoEmbargo) {
        this.fciMontoEmbargo = fciMontoEmbargo;
    }

}
