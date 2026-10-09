package com.fiduciawebmovil.cuentasinversion.dtos;


import java.math.BigDecimal;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.contrato.entity.Contrato;

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
public class FCuentasInversionDTO{
    private Long fciNumFideicomiso;
    @Column(precision = 18, scale = 0)
    private BigDecimal fcbaNumeroCtaBan;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaBanco;

    @Column(length = 80)
    private String fcbaPlazaCba;

    @Column(length = 20)
    private String fcbaClabeCba;

    @Column(length = 20)
    private String fcbaRfc;

    @Column
    private String fcbaTitular;

    @Column(length = 30)
    private String fcbaStatus;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaClasTipo;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaNumTipo;

    @Column(precision = 18, scale = 0)
    private BigDecimal fcbaSubCuenta;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaMoneda;

    private List<Contrato> contrato;    


}
