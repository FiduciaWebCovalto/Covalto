package com.fiduciawebmovil.terceros.dtos;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.terceros.entity.TercerosId;

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
public class TercerosDTO {
    @EmbeddedId
    private TercerosId id;

    @Column(precision = 10, scale = 0)
    private BigDecimal terNumPais;

    @Column(precision = 10, scale = 0)
    private BigDecimal terNumSrama;

    @Column(length = 25)
    private String terCveMigratoria;

    @Column
    private Boolean terCveSexo;

    @Column(length = 25)
    private String terCveTipoPers;

    @Column(length = 250)
    private String terNomTercero;

    @Column(length = 15)
    private String terRfc;

    @Column(length = 50)
    private String terNomNacional;

    @Column(length = 4)
    private String terNumLadaCasa;

    @Column(length = 20)
    private String terNumTelefCasa;

    @Column(length = 4)
    private String terNumLadaOfic;

    @Column(length = 20)
    private String terNumTelefOfic;

    @Column(length = 10)
    private String terNumExtOfic;

    @Column(length = 4)
    private String terNumLadaFax;

    @Column(length = 20)
    private String terNumTelefFax;

    @Column(length = 10)
    private String terNumExtFax;

    @Column(precision = 4, scale = 0)
    private BigDecimal terAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal terMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal terDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal terAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal terMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal terDiaUltMod;

    @Column(length = 25)
    private String terCveStTercero;

    @Column(length = 20)
    private String terCurp;
}
