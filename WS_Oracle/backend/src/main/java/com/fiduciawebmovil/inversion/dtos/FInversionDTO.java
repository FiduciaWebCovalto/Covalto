package com.fiduciawebmovil.inversion.dtos;

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
public class FInversionDTO {

    private Long insNumFolioInst;

    @Column(precision = 10, scale = 0)
    private BigDecimal insNumContrato;

    @Column(precision = 10, scale = 0)
    private BigDecimal finTipo;

    @Column(precision = 10, scale = 0)
    private BigDecimal finConcepto;

    @Column
    private String finObservaciones;

    @Column(precision = 16, scale = 2)
    private BigDecimal finImporte;

    @Column
    private String finInstrumento;

    @Column
    private String finTipoInstrumentoOrig;

    @Column
    private String finTipoInstrumentoDest;

    @Column
    private String finCuentaOrigen;

    @Column
    private String finCuentaDestino;

    @Column
    private String finCajonIndeval;

    @Column
    private String finPlazoDias;

    @Column
    private String finInstitucion;

    @Column
    private String finContratoBursatil;

    @Column
    private String finMoneda;

    @Column
    private String finTipoPersona;

    @Column
    private String finBeneficiario;

    @Column
    private String finPizarra;

    @Column
    private String finLiquidez;

    @Column
    private String finPrecioTecho;

    @Column
    private String finPrecioPiso;

    @Column
    private String finPrecioMercado;

  
}
