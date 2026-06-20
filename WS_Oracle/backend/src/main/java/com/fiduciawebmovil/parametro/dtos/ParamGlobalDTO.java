package com.fiduciawebmovil.parametro.dtos;


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

public class ParamGlobalDTO {

    private Long paramClave;

    @Column(length = 100)
    private String paramDescripcion;

    @Column(precision = 10, scale = 2)
    private BigDecimal paramValor;

    @Column(length = 1500)
    private String paramValor2;


}
