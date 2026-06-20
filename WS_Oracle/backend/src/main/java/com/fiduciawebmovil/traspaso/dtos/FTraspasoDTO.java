package com.fiduciawebmovil.traspaso.dtos;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.bitacora.entity.BitacoraId;
import com.fiduciawebmovil.fbitacora.entity.FBitacoraId;
import com.fiduciawebmovil.fbitacorasol.entity.FBitacoraSolId;
import com.fiduciawebmovil.insnovalor.entity.FConinsnomonValorId;
import com.fiduciawebmovil.retinver.entity.FCtoinvRet;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
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
public class FTraspasoDTO {

    private Long ftspIdTraspaso;

    @Column(precision = 16, scale = 2)
    private BigDecimal ftspImporteTraspaso;

    @Column(precision = 11, scale = 2)
    private BigDecimal fcinIdCtoInversionOrigen;

    @Column(precision = 11, scale = 2)
    private BigDecimal fcinIdCtoInversionDestino;

    @Column(length = 25)
    private String ftspStatus;

    @Column(precision = 10, scale = 2)
    private BigDecimal ffidIdFideicomiso;

    @Column(precision = 16, scale = 2)
    private BigDecimal ftspTipoCambioProv;

    @Column(precision = 16, scale = 2)
    private BigDecimal ftspTipoCambioFirme;

    @Column(nullable = false)
    private OffsetDateTime ftspFecha;

    @Column(precision = 10, scale = 2)
    private BigDecimal ftspSubctaDestino;

    @Column(precision = 10, scale = 2)
    private BigDecimal ftspSubctaOrigen;

    @Column(length = 500)
    private String ftspConcepto;
}
