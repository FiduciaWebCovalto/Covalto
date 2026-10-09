package com.fiduciawebmovil.retiro.dtos;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FRetiroDTO {

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
  
}
