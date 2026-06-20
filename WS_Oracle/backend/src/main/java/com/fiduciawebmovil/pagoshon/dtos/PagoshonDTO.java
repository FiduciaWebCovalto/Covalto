package com.fiduciawebmovil.pagoshon.dtos;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.pagoshon.entity.PagoshonId;
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
public class PagoshonDTO {
       @EmbeddedId
    private PagoshonId id;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumPago;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumServicio;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumTramite;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal pagImpPago;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal pagImpIvaHonor;

    @Column(nullable = false, precision = 16, scale = 2)
    private BigDecimal pagImpExtemp;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumMoneda;

    @Column(length = 25)
    private String pagDoctoRef;

    @Column(length = 10)
    private String pagFecDoctoRef;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal pagAnoAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal pagMesAltaReg;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal pagDiaAltaReg;

    @Column(nullable = false, precision = 4, scale = 0)
    private BigDecimal pagAnoUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal pagMesUltMod;

    @Column(nullable = false, precision = 2, scale = 0)
    private BigDecimal pagDiaUltMod;

    @Column(length = 25)
    private String pagCveStPagosho;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagFolioOpera;

    @Column(precision = 16, scale = 2)
    private BigDecimal pagImpTotal;

}
