package com.fiduciawebmovil.instcomp.dtos;


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
public class FInstCompDTO {

    private Long insNumFolioInst;

    @Column(length = 50)
    private String ficNumCheque;

    @Column
    private String ficNombreRazonSocial;

    @Column
    private String ficTipoPago;

    @Column
    private String ficConvenioServCie;

    @Column
    private String ficReferencia;

    @Column
    private String ficBeneficiario;

    @Column
    private String ficLineaCaptura;

    @Column
    private String ficRfcContribuyente;

    @Column
    private String ficFechaCump;

    @Column
    private String ficFechaVenc;

    @Column
    private String ficClabeNva;

    @Column
    private String ficTitularNvo;

  
}
