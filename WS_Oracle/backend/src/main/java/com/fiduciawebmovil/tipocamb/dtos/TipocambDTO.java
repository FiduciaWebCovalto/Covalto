package com.fiduciawebmovil.tipocamb.dtos;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.fideicom.entity.FideicomId;
import com.fiduciawebmovil.tipocamb.entity.EmbeddableId;
import com.fiduciawebmovil.tipocamb.entity.TipocambId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.validation.constraints.NotBlank;
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
public class TipocambDTO {

    @EmbeddableId
    private TipocambId id;
    @Column(precision = 20, scale = 8)
    private BigDecimal ticImpTipoCamb;

    @Column(precision = 4, scale = 0)
    private BigDecimal ticAnoUltMod;


    @Column(precision = 2, scale = 0)
    private BigDecimal ticMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal ticDiaUltMod;

    @Column(length = 25)
    private String ticCveStTipocam;
}
