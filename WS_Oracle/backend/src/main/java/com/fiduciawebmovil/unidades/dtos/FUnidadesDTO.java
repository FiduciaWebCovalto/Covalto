package com.fiduciawebmovil.unidades.dtos;


import java.math.BigDecimal;
import java.time.LocalDate;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.unidades.entity.FUnidadesId;

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
public class FUnidadesDTO {
      @EmbeddedId
    private FUnidadesId id;

    @Column(length = 50)
    private String funiTipo;

    @Column(length = 25)
    private String funiNiveles;

    @Column(length = 50)
    private String funiCalleNum;

    @Column(length = 50)
    private String funiNomColonia;

    @Column(length = 50)
    private String funiNomPoblacion;

    @Column(length = 10)
    private String funiCodigoPostal;

    @Column(precision = 10, scale = 0)
    private BigDecimal funiNumEstado;

    @Column(precision = 10, scale = 0)
    private BigDecimal funiNumPais;

    @Column(length = 300)
    private String funiColindancias;

    @Column(length = 300)
    private String funiMedidas;

    @Column(length = 10)
    private String funiEstacionamiento1;

    @Column(length = 10)
    private String funiSuperficie1;

    @Column(length = 10)
    private String funiEstacionamiento2;

    @Column(length = 10)
    private String funiSuperficie2;

    @Column(length = 10)
    private String funiEstacionamiento3;

    @Column(length = 10)
    private String funiSuperficie3;

    @Column(length = 10)
    private String funiRoofGarden;

    @Column(length = 10)
    private String funiRoofSuperficie;

    @Column(length = 10)
    private String funiSotano;

    @Column(length = 10)
    private String funiSotanoSuperficie;

    @Column(precision = 16, scale = 4)
    private BigDecimal funiIndiviso;

    @Column(precision = 16, scale = 2)
    private BigDecimal funiPrecio;

    @Column(precision = 16, scale = 2)
    private BigDecimal funiPrecioCatastro;

    @Column(precision = 16, scale = 2)
    private BigDecimal funiUltimoAvaluo;

    @Column
    private LocalDate funiFechaUltimoAvaluo;

    @Column(precision = 10, scale = 0)
    private BigDecimal funiMoneda;

    @Column
    private String funiActo1;

    @Column
    private String funiActo2;

    @Column
    private String funiActo3;

    @Column
    private String funiActo4;

    @Column(precision = 10, scale = 0)
    private BigDecimal funiNotario;

    @Column
    private LocalDate funiFechaReversion;

    @Column(length = 50)
    private String funiLocalidadNota;

    @Column(length = 50)
    private String funiNumEscritura;

    @Column(length = 50)
    private String funiFolioReal;

    @Column
    private LocalDate funiFechaTrasladoDominio;

    @Column(length = 25)
    private String funiStatus;

    @Column(precision = 2, scale = 0)
    private BigDecimal funiCveGrahipo;

    @Column(length = 30)
    private String funiNumHipoteca;



}
