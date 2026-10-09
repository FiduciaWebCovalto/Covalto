package com.fiduciawebmovil.deposito.dtos;

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
public class FDepositoDTO {

    private Long fdpoIdDeposito;

    @Column(precision = 16, scale = 2)
    private BigDecimal fdpoImporteDeposito;

    @Column
    private OffsetDateTime fdepFecha;

    @Column
    private BigDecimal fdpoCbaInstitucion;

    @Column(precision = 3, scale = 2)
    private BigDecimal fdepMoneda;

    @Column(precision = 10, scale = 2)
    private BigDecimal fdpoConceptoDep;

    @Column(precision = 10, scale = 2)
    private BigDecimal fcinIdCtoInversion;

    @Column
    private String fdepDescripcion;

    @Column(length = 25)
    private String fdepStatus;

    @Column(precision = 10, scale = 2)
    private BigDecimal ftpfIdTipoPer;

    @Column(precision = 10, scale = 2)
    private BigDecimal ftpfIdPersona;

    @Column(precision = 10, scale = 2)
    private BigDecimal ffidIdFideicomiso;

    @Column(precision = 16, scale = 2)
    private BigDecimal fdpoTipoCambioProv;

    @Column(precision = 16, scale = 2)
    private BigDecimal fdpoTipoCambioFirme;

    @Column(precision = 12, scale = 2)
    private BigDecimal fdpoCtaCheques;

    @Column(precision = 12, scale = 2)
    private BigDecimal fdpoSubcta;

  
}
