package com.fiduciawebmovil.afidben.dtos;


import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.afidben.entity.AfidbenId;

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
public class AfidbenDTO {
    @EmbeddedId
    private AfidbenId id;

    @Column
    private String afbNomFidben;

    @Column(length = 50)
    private String afbTelFidben;

    @Column(length = 25)
    private String afbCveStFidBen;

    @Column(length = 50)
    private String afbCalleNum;

    @Column(length = 50)
    private String afbNomColonia;

    @Column(length = 50)
    private String afbNomPoblacion;

    @Column(precision = 5, scale = 0)
    private BigDecimal afbCodigoPostal;

    @Column(precision = 2, scale = 0)
    private BigDecimal afbNumEstado;

    @Column(length = 50)
    private String afbNomEstado;

    @Column(precision = 3, scale = 0)
    private BigDecimal afbNumPais;

    @Column(length = 50)
    private String afbNomPais;

    @Column(length = 20)
    private String afbCurp;

    @Column(length = 25)
    private String afbTipoPersona;

    @Column(length = 50)
    private String afbNomMunicipio;

    @Column(precision = 10, scale = 0)
    private BigDecimal afbFolioWf;

    @Column(precision = 10, scale = 0)
    private BigDecimal afbFolioWfPld;

    @Column(precision = 10, scale = 2)
    private BigDecimal afbClifrec;

    @Column
    private String afbFechaAlta;

    @Column
    private String afbFechaModif;

    @Column(length = 50)
    private String afbCis;

    @Column(length = 5)
    private String afbNumOper;
}
