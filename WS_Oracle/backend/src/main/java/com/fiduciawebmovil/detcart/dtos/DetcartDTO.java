package com.fiduciawebmovil.detcart.dtos;


import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.detcart.entity.DetcartId;

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
public class DetcartDTO {
@EmbeddedId
    private DetcartId id;
    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decNumServicio;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decNumTramite;

    @Column(length = 50)
    private String decConceptoHono;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decCvePerPagado;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal decAnoPerDel;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decMesPerDel;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decDiaPerDel;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal decAnoPerAl;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decMesPerAl;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decDiaPerAl;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal decImpRemHonor;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal decRemIvaHonor;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal decRemExtemp;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal decImpOrigHonor;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal decOrigIvaHonor;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal decOrigExtemp;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal decImpPagosEfe;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decNumPagosEfe;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decNumRecordat;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decNumMoneda;

    @Column(length = 25)
    private String decCveCalifHono;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decFolioOpera;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal decAnoAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decMesAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decDiaAltaReg;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal decAnoUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decMesUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal decDiaUltMod;

    @Column(length = 25)
    private String decCveStDetcart;

    @Column(length = 8)
    private String decNumReferencia;
  }
