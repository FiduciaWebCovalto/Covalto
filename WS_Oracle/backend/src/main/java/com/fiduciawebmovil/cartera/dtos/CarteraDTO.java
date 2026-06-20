package com.fiduciawebmovil.cartera.dtos;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.cartera.entity.CarteraId;
import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.insnomon.entity.FConinsnomonId;

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
public class CarteraDTO {
    @EmbeddedId
     private CarteraId id;
    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpHonor;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpIvaHonor;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpExtemp;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpHonor30;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpIvaHon30;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpExtem30;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpHonor60;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpIvaHon60;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpExtem60;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpHonor90;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpIvaHon90;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpExtem90;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal carNumRegDet;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpRegDet;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal carNumPagosMes;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpPagosMes;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal carNumPagosFec;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal carImpPagosFec;

    @Column(length = 25)
    private String carCveCalifCart;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal carAnoAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal carMesAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal carDiaAltaReg;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal carAnoUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal carMesUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal carDiaUltMod;

    @Column(length = 25)
    private String carCveStCartera;

    @Column(precision = 22, scale = 2)
    private BigDecimal carEjerAnoCurso;

    @Column(precision = 22, scale = 2)
    private BigDecimal carEjerAnoAnte;
}
