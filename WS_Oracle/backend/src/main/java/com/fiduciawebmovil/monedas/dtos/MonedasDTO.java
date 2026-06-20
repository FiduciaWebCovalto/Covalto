package com.fiduciawebmovil.monedas.dtos;


import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class MonedasDTO {

        private Long monNumPais;

    @Column(nullable = false, updatable = false, length = 50)
    private String monNomMoneda;

    @Column(precision = 4, scale = 0)
    private BigDecimal monAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal monMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal monDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal monAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal monMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal monDiaUltMod;

    @Column(length = 25)
    private String monCveStMoneda;

    @Column(length = 5)
    private String monSigla;


}
