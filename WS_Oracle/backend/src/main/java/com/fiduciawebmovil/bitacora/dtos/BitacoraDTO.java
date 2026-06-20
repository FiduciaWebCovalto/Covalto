package com.fiduciawebmovil.bitacora.dtos;


import java.math.BigDecimal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.bitacora.entity.BitacoraId;


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
public class BitacoraDTO {
@EmbeddedId
    private BitacoraId id;

    @Column
    private String bitDetBitacora;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal bitAnoAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal bitMesAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal bitDiaAltaReg;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal bitAnoUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal bitMesUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal bitDiaUltMod;

    @Column(length = 25)
    private String bitCveStBitacor;

}
