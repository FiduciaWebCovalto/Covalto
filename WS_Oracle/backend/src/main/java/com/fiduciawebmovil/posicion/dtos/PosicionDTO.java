package com.fiduciawebmovil.posicion.dtos;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.fideicom.entity.FideicomId;
import com.fiduciawebmovil.posicion.entity.PosicionId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.validation.constraints.NotBlank;
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
public class PosicionDTO {
    @EmbeddedId
    private PosicionId id;

    @Column(length = 10)
    private String posNomPizarra;

    @Column(length = 7)
    private String posNumSerEmis;

    @Column(precision = 10, scale = 0)
    private BigDecimal posNumCuponVig;

    @Column(length = 36)
    private String posNomCustodio;

    @Column(precision = 10, scale = 0)
    private BigDecimal posNumMoneda;

    @Column(precision = 10, scale = 0)
    private BigDecimal posCveGarantia;

    @Column(precision = 16, scale = 0)
    private BigDecimal posPosicIniPer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posVtasPosicPer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posCpasPosicPer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posPosicIniEjer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posVtasPosEjer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posCpasPosEjer;

    @Column(precision = 16, scale = 0)
    private BigDecimal posPosicActual;

    @Column(precision = 16, scale = 0)
    private BigDecimal posPosicComprom;

    @Column(precision = 16, scale = 2)
    private BigDecimal posCostoHistoric;

    @Column(precision = 4, scale = 0)
    private BigDecimal posAnoUltMovto;

    @Column(precision = 2, scale = 0)
    private BigDecimal posMesUltMovto;

    @Column(precision = 2, scale = 0)
    private BigDecimal posDiaUltMovto;

    @Column(precision = 4, scale = 0)
    private BigDecimal posAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal posMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal posDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal posAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal posMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal posDiaUltMod;

    @Column(length = 25)
    private String posCveStPosicio;

    @Column(precision = 16, scale = 2)
    private BigDecimal posMinusPlus;

}
