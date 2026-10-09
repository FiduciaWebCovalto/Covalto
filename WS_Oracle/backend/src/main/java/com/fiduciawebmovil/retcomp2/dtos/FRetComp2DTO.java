package com.fiduciawebmovil.retcomp2.dtos;


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
public class FRetComp2DTO {

    private Long frcFolio;

    @Column(length = 30)
    private String frcPagounico;

    @Column(length = 30)
    private String frcNombresw;

    @Column(length = 30)
    private String frcPaissw;

    @Column(length = 30)
    private String frcCiudadsw;

    @Column(length = 80)
    private String frcDomiciliosw;

    @Column(length = 30)
    private String frcTelefono;

    @Column(length = 30)
    private String frcReferencia1;

    @Column(length = 30)
    private String frcReferencia2;

    @Column(length = 30)
    private String frcReferencia3;

    @Column(length = 30)
    private String frcCalle;

    @Column(length = 30)
    private String frcNumext;

    @Column(length = 30)
    private String frcNumint;

    @Column(length = 30)
    private String frcColonia;

    @Column(length = 30)
    private String frcDelegacion;

    @Column(length = 30)
    private String frcCodigopostal;

    @Column(length = 30)
    private String frcEstado;

    @Column
    private String frcCiudad;

  
}
