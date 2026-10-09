package com.fiduciawebmovil.retiro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


@Entity
@Table(name = "f_retiro")
@NoArgsConstructor
public class FRetiro {

    @Id
    private Long fretIdRetiro;

    @Column(precision = 16, scale = 2)
    private BigDecimal fretImpRetiro;

    @Column
    private OffsetDateTime fretFecha;

    @Column(precision = 3, scale = 2)
    private BigDecimal fretMoneda;

    @Column
    private String fretDescripcion;

    @Column
    private OffsetDateTime sesFecha;

    @Column
    private Boolean sesTipo;

    @Column(length = 25)
    private String acuId;

    @Column(precision = 10, scale = 2)
    private BigDecimal fretConcepto;

    @Column(precision = 10, scale = 2)
    private BigDecimal fretTipoLiquidacion;

    @Column(length = 20)
    private String fretStatusRet;

    @Column
    private String fretNomBeneficiario;

    @Column(length = 50)
    private String fretReferenciaCie;

    @Column(length = 100)
    private String fretPaisDomiciliarioSwift;

    @Column(length = 100)
    private String fretCiudadDomiciliarioSwift;

    @Column(length = 100)
    private String fretPlazaDomiciliarioSwift;

    @Column(length = 20)
    private String fretSucursalDomiciliaSwift;

    @Column(length = 100)
    private String fretBancoDomiciliarioSwift;

    @Column(precision = 30, scale = 2)
    private BigDecimal fretCuentaDomiciliarioSwift;

    @Column(length = 50)
    private String fretBranchDomiciliarioSwift;

    @Column(precision = 3, scale = 2)
    private BigDecimal fretMonedaDomiciliarioSwift;

    @Column(precision = 16, scale = 2)
    private BigDecimal fretImporteMeSwift;

    @Column(length = 100)
    private String fretCodigoSaiSwift;

    @Column
    private Boolean fretTipoAbaIbanSwift;

    @Column
    private String fretNomBeneficiSwift;

    @Column(length = 100)
    private String fretPaisBeneficiSwift;

    @Column
    private String fretCiudadBeneficiSwift;

    @Column
    private String fretDimicilioBeneficiSwift;

    @Column(length = 20)
    private String fretTelefonoBeneficiSwift;

    @Column(precision = 16, scale = 2)
    private BigDecimal fretTipoCambioProv;

    @Column(precision = 16, scale = 2)
    private BigDecimal fretTipoCambioFirme;

    @Column(length = 20)
    private String fcbaClabeCba;

    @Column(length = 50)
    private String fretConvenioCie;

    @Column(precision = 10, scale = 2)
    private BigDecimal ffidIdFideicomiso;

    @Column(precision = 12, scale = 2)
    private BigDecimal fretCtaCheques;

    @Column(precision = 12, scale = 2)
    private BigDecimal fretSubcta;

    public Long getFretIdRetiro() {
        return fretIdRetiro;
    }

    public void setFretIdRetiro(final Long fretIdRetiro) {
        this.fretIdRetiro = fretIdRetiro;
    }

    public BigDecimal getFretImpRetiro() {
        return fretImpRetiro;
    }

    public void setFretImpRetiro(final BigDecimal fretImpRetiro) {
        this.fretImpRetiro = fretImpRetiro;
    }

    public OffsetDateTime getFretFecha() {
        return fretFecha;
    }

    public void setFretFecha(final OffsetDateTime fretFecha) {
        this.fretFecha = fretFecha;
    }

    public BigDecimal getFretMoneda() {
        return fretMoneda;
    }

    public void setFretMoneda(final BigDecimal fretMoneda) {
        this.fretMoneda = fretMoneda;
    }

    public String getFretDescripcion() {
        return fretDescripcion;
    }

    public void setFretDescripcion(final String fretDescripcion) {
        this.fretDescripcion = fretDescripcion;
    }

    public OffsetDateTime getSesFecha() {
        return sesFecha;
    }

    public void setSesFecha(final OffsetDateTime sesFecha) {
        this.sesFecha = sesFecha;
    }

    public Boolean getSesTipo() {
        return sesTipo;
    }

    public void setSesTipo(final Boolean sesTipo) {
        this.sesTipo = sesTipo;
    }

    public String getAcuId() {
        return acuId;
    }

    public void setAcuId(final String acuId) {
        this.acuId = acuId;
    }

    public BigDecimal getFretConcepto() {
        return fretConcepto;
    }

    public void setFretConcepto(final BigDecimal fretConcepto) {
        this.fretConcepto = fretConcepto;
    }

    public BigDecimal getFretTipoLiquidacion() {
        return fretTipoLiquidacion;
    }

    public void setFretTipoLiquidacion(final BigDecimal fretTipoLiquidacion) {
        this.fretTipoLiquidacion = fretTipoLiquidacion;
    }

    public String getFretStatusRet() {
        return fretStatusRet;
    }

    public void setFretStatusRet(final String fretStatusRet) {
        this.fretStatusRet = fretStatusRet;
    }

    public String getFretNomBeneficiario() {
        return fretNomBeneficiario;
    }

    public void setFretNomBeneficiario(final String fretNomBeneficiario) {
        this.fretNomBeneficiario = fretNomBeneficiario;
    }

    public String getFretReferenciaCie() {
        return fretReferenciaCie;
    }

    public void setFretReferenciaCie(final String fretReferenciaCie) {
        this.fretReferenciaCie = fretReferenciaCie;
    }

    public String getFretPaisDomiciliarioSwift() {
        return fretPaisDomiciliarioSwift;
    }

    public void setFretPaisDomiciliarioSwift(final String fretPaisDomiciliarioSwift) {
        this.fretPaisDomiciliarioSwift = fretPaisDomiciliarioSwift;
    }

    public String getFretCiudadDomiciliarioSwift() {
        return fretCiudadDomiciliarioSwift;
    }

    public void setFretCiudadDomiciliarioSwift(final String fretCiudadDomiciliarioSwift) {
        this.fretCiudadDomiciliarioSwift = fretCiudadDomiciliarioSwift;
    }

    public String getFretPlazaDomiciliarioSwift() {
        return fretPlazaDomiciliarioSwift;
    }

    public void setFretPlazaDomiciliarioSwift(final String fretPlazaDomiciliarioSwift) {
        this.fretPlazaDomiciliarioSwift = fretPlazaDomiciliarioSwift;
    }

    public String getFretSucursalDomiciliaSwift() {
        return fretSucursalDomiciliaSwift;
    }

    public void setFretSucursalDomiciliaSwift(final String fretSucursalDomiciliaSwift) {
        this.fretSucursalDomiciliaSwift = fretSucursalDomiciliaSwift;
    }

    public String getFretBancoDomiciliarioSwift() {
        return fretBancoDomiciliarioSwift;
    }

    public void setFretBancoDomiciliarioSwift(final String fretBancoDomiciliarioSwift) {
        this.fretBancoDomiciliarioSwift = fretBancoDomiciliarioSwift;
    }

    public BigDecimal getFretCuentaDomiciliarioSwift() {
        return fretCuentaDomiciliarioSwift;
    }

    public void setFretCuentaDomiciliarioSwift(final BigDecimal fretCuentaDomiciliarioSwift) {
        this.fretCuentaDomiciliarioSwift = fretCuentaDomiciliarioSwift;
    }

    public String getFretBranchDomiciliarioSwift() {
        return fretBranchDomiciliarioSwift;
    }

    public void setFretBranchDomiciliarioSwift(final String fretBranchDomiciliarioSwift) {
        this.fretBranchDomiciliarioSwift = fretBranchDomiciliarioSwift;
    }

    public BigDecimal getFretMonedaDomiciliarioSwift() {
        return fretMonedaDomiciliarioSwift;
    }

    public void setFretMonedaDomiciliarioSwift(final BigDecimal fretMonedaDomiciliarioSwift) {
        this.fretMonedaDomiciliarioSwift = fretMonedaDomiciliarioSwift;
    }

    public BigDecimal getFretImporteMeSwift() {
        return fretImporteMeSwift;
    }

    public void setFretImporteMeSwift(final BigDecimal fretImporteMeSwift) {
        this.fretImporteMeSwift = fretImporteMeSwift;
    }

    public String getFretCodigoSaiSwift() {
        return fretCodigoSaiSwift;
    }

    public void setFretCodigoSaiSwift(final String fretCodigoSaiSwift) {
        this.fretCodigoSaiSwift = fretCodigoSaiSwift;
    }

    public Boolean getFretTipoAbaIbanSwift() {
        return fretTipoAbaIbanSwift;
    }

    public void setFretTipoAbaIbanSwift(final Boolean fretTipoAbaIbanSwift) {
        this.fretTipoAbaIbanSwift = fretTipoAbaIbanSwift;
    }

    public String getFretNomBeneficiSwift() {
        return fretNomBeneficiSwift;
    }

    public void setFretNomBeneficiSwift(final String fretNomBeneficiSwift) {
        this.fretNomBeneficiSwift = fretNomBeneficiSwift;
    }

    public String getFretPaisBeneficiSwift() {
        return fretPaisBeneficiSwift;
    }

    public void setFretPaisBeneficiSwift(final String fretPaisBeneficiSwift) {
        this.fretPaisBeneficiSwift = fretPaisBeneficiSwift;
    }

    public String getFretCiudadBeneficiSwift() {
        return fretCiudadBeneficiSwift;
    }

    public void setFretCiudadBeneficiSwift(final String fretCiudadBeneficiSwift) {
        this.fretCiudadBeneficiSwift = fretCiudadBeneficiSwift;
    }

    public String getFretDimicilioBeneficiSwift() {
        return fretDimicilioBeneficiSwift;
    }

    public void setFretDimicilioBeneficiSwift(final String fretDimicilioBeneficiSwift) {
        this.fretDimicilioBeneficiSwift = fretDimicilioBeneficiSwift;
    }

    public String getFretTelefonoBeneficiSwift() {
        return fretTelefonoBeneficiSwift;
    }

    public void setFretTelefonoBeneficiSwift(final String fretTelefonoBeneficiSwift) {
        this.fretTelefonoBeneficiSwift = fretTelefonoBeneficiSwift;
    }

    public BigDecimal getFretTipoCambioProv() {
        return fretTipoCambioProv;
    }

    public void setFretTipoCambioProv(final BigDecimal fretTipoCambioProv) {
        this.fretTipoCambioProv = fretTipoCambioProv;
    }

    public BigDecimal getFretTipoCambioFirme() {
        return fretTipoCambioFirme;
    }

    public void setFretTipoCambioFirme(final BigDecimal fretTipoCambioFirme) {
        this.fretTipoCambioFirme = fretTipoCambioFirme;
    }

    public String getFcbaClabeCba() {
        return fcbaClabeCba;
    }

    public void setFcbaClabeCba(final String fcbaClabeCba) {
        this.fcbaClabeCba = fcbaClabeCba;
    }

    public String getFretConvenioCie() {
        return fretConvenioCie;
    }

    public void setFretConvenioCie(final String fretConvenioCie) {
        this.fretConvenioCie = fretConvenioCie;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return ffidIdFideicomiso;
    }

    public void setFfidIdFideicomiso(final BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFretCtaCheques() {
        return fretCtaCheques;
    }

    public void setFretCtaCheques(final BigDecimal fretCtaCheques) {
        this.fretCtaCheques = fretCtaCheques;
    }

    public BigDecimal getFretSubcta() {
        return fretSubcta;
    }

    public void setFretSubcta(final BigDecimal fretSubcta) {
        this.fretSubcta = fretSubcta;
    }

}
