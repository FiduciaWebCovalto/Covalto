package com.bancomext.domain;







import java.math.BigDecimal;



public class FCuentasInversion {

    public Long id;

    
    public BigDecimal fciNumFideicomiso;

    
    public String fciNumCta;

    
    public String fciTipoCta;

    
    public String fciTitDeCta;

    
    public String fciIntermediario;

    
    public String fciMoneda;

    
    public String fciPais;

    
    public String fciFeDeAp;

    
    public String fciClabe;

    
    public String fciEstatusFisIsr;

    
    public String fciRfcDeLaCta;

    
    public String fciDomDeLaCta;

    public String fciFormaManejo;

    
    public String fciCtaRel;

    
    public String fciEstatus;

    
    public String fciEstatusHogan;

    
    public String fciNombreCta;

    
    public String fciObservac;

    
    public String fciContratoEnviado;

    
    public String fciUsuario;

    
    public BigDecimal fciFolio;

    public BigDecimal fciMontoEmbargo;
    
    @Override
    public String toString() {
        return  this.fciNumCta+"-"+this.fciNombreCta+"-"+this.fciMoneda;
    }      

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public BigDecimal getFciNumFideicomiso() {
        return fciNumFideicomiso;
    }

    public void setFciNumFideicomiso(final BigDecimal fciNumFideicomiso) {
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
