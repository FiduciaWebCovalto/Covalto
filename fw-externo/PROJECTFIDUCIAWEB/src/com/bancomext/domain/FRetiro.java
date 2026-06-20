package com.bancomext.domain;







import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;



public class FRetiro {


    private Long fretIdRetiro;

    
    private BigDecimal fretImpRetiro;

    
    private OffsetDateTime fretFecha;

    
    private BigDecimal fretMoneda;

    
    private String fretDescripcion;

    
    private OffsetDateTime sesFecha;

    
    private Boolean sesTipo;

    
    private String acuId;

    
    private BigDecimal fretConcepto;

    
    private BigDecimal fretTipoLiquidacion;

    
    private String fretStatusRet;

    
    private String fretNomBeneficiario;

    
    private String fretReferenciaCie;

    
    private String fretPaisDomiciliarioSwift;

    
    private String fretCiudadDomiciliarioSwift;

    
    private String fretPlazaDomiciliarioSwift;

    
    private String fretSucursalDomiciliaSwift;

    
    private String fretBancoDomiciliarioSwift;

    private BigDecimal fretCuentaDomiciliarioSwift;

    
    private String fretBranchDomiciliarioSwift;

    
    private BigDecimal fretMonedaDomiciliarioSwift;

    
    private BigDecimal fretImporteMeSwift;

    
    private String fretCodigoSaiSwift;

    
    private Boolean fretTipoAbaIbanSwift;

    
    private String fretNomBeneficiSwift;

    
    private String fretPaisBeneficiSwift;

    
    private String fretCiudadBeneficiSwift;

    
    private String fretDimicilioBeneficiSwift;

    
    private String fretTelefonoBeneficiSwift;

    
    private BigDecimal fretTipoCambioProv;

    
    private BigDecimal fretTipoCambioFirme;

    
    private String fcbaClabeCba;

    
    private String fretConvenioCie;

    
    private BigDecimal ffidIdFideicomiso;

    
    private BigDecimal fretCtaCheques;

    
    private BigDecimal fretSubcta;

    public FRetiro(Long fretIdRetiro, BigDecimal fretImpRetiro, OffsetDateTime fretFecha, BigDecimal fretMoneda,
                   String fretDescripcion, OffsetDateTime sesFecha, Boolean sesTipo, String acuId, BigDecimal ffidIdFideicomiso,
                   BigDecimal fretConcepto, BigDecimal fretTipoLiquidacion, String fretStatusRet,
                   String fretNomBeneficiario, String fretReferenciaCie, String fretPaisDomiciliarioSwift, String fcbaClabeCba,
                   String fretCiudadDomiciliarioSwift, String fretPlazaDomiciliarioSwift,
                   String fretSucursalDomiciliaSwift, String fretBancoDomiciliarioSwift,
                   BigDecimal fretCuentaDomiciliarioSwift, String fretBranchDomiciliarioSwift,
                   BigDecimal fretMonedaDomiciliarioSwift, BigDecimal fretImporteMeSwift, String fretCodigoSaiSwift,
                   Boolean fretTipoAbaIbanSwift, String fretNomBeneficiSwift, String fretPaisBeneficiSwift,
                   String fretCiudadBeneficiSwift, String fretDimicilioBeneficiSwift, String fretTelefonoBeneficiSwift,
                   BigDecimal fretTipoCambioProv, BigDecimal fretTipoCambioFirme,
                   String fretConvenioCie, BigDecimal fretCtaCheques,
                   BigDecimal fretSubcta) {
        this.fretIdRetiro = fretIdRetiro;
        this.fretImpRetiro = fretImpRetiro;
        this.fretFecha = fretFecha;
        this.fretMoneda = fretMoneda;
        this.fretDescripcion = fretDescripcion;
        this.sesFecha = sesFecha;
        this.sesTipo = sesTipo;
        this.acuId = acuId;
        this.fretConcepto = fretConcepto;
        this.fretTipoLiquidacion = fretTipoLiquidacion;
        this.fretStatusRet = fretStatusRet;
        this.fretNomBeneficiario = fretNomBeneficiario;
        this.fretReferenciaCie = fretReferenciaCie;
        this.fretPaisDomiciliarioSwift = fretPaisDomiciliarioSwift;
        this.fretCiudadDomiciliarioSwift = fretCiudadDomiciliarioSwift;
        this.fretPlazaDomiciliarioSwift = fretPlazaDomiciliarioSwift;
        this.fretSucursalDomiciliaSwift = fretSucursalDomiciliaSwift;
        this.fretBancoDomiciliarioSwift = fretBancoDomiciliarioSwift;
        this.fretCuentaDomiciliarioSwift = fretCuentaDomiciliarioSwift;
        this.fretBranchDomiciliarioSwift = fretBranchDomiciliarioSwift;
        this.fretMonedaDomiciliarioSwift = fretMonedaDomiciliarioSwift;
        this.fretImporteMeSwift = fretImporteMeSwift;
        this.fretCodigoSaiSwift = fretCodigoSaiSwift;
        this.fretTipoAbaIbanSwift = fretTipoAbaIbanSwift;
        this.fretNomBeneficiSwift = fretNomBeneficiSwift;
        this.fretPaisBeneficiSwift = fretPaisBeneficiSwift;
        this.fretCiudadBeneficiSwift = fretCiudadBeneficiSwift;
        this.fretDimicilioBeneficiSwift = fretDimicilioBeneficiSwift;
        this.fretTelefonoBeneficiSwift = fretTelefonoBeneficiSwift;
        this.fretTipoCambioProv = fretTipoCambioProv;
        this.fretTipoCambioFirme = fretTipoCambioFirme;
        this.fcbaClabeCba = fcbaClabeCba;
        this.fretConvenioCie = fretConvenioCie;
        this.ffidIdFideicomiso = ffidIdFideicomiso;
        this.fretCtaCheques = fretCtaCheques;
        this.fretSubcta = fretSubcta;
    }


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
