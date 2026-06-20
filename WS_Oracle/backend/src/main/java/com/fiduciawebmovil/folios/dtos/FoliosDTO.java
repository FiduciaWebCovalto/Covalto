package com.fiduciawebmovil.folios.dtos;


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

public class FoliosDTO {

    @Column(precision = 10, scale = 0)
    private Long folTipoFolio;

    @Column(precision = 10, scale = 0)
    private BigDecimal folNumFolio;

    @Column(length = 25)
    private String folCveStFolio;

    @Column(precision = 10, scale = 0)
    private BigDecimal folNumPrueba; 

}
