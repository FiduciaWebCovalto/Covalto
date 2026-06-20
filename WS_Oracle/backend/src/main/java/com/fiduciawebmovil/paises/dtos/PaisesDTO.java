package com.fiduciawebmovil.paises.dtos;


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

public class PaisesDTO {

         private Long paiNumPais;

    @Column(length = 50)
    private String paiNomPais;

    @Column(length = 30)
    private String paiAbrPais;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal paiAnoAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal paiMesAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal paiDiaAltaReg;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal paiAnoUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal paiMesUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal paiDiaUltMod;

    @Column(length = 25)
    private String paiCveStPais;

}
