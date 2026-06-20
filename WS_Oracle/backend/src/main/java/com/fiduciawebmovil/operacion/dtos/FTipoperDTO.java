package com.fiduciawebmovil.operacion.dtos;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.contrato.entity.Contrato;

import jakarta.persistence.Column;
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
public class FTipoperDTO{
        private String ftopNumOper;

    @Column
    private Boolean ftopTipoSol;

    @Column
    private Boolean ftopCveNaturaleza;

    @Column(precision = 10, scale = 0)
    private BigDecimal ftopSecCve;

    @Column
    private Boolean ftopPagomul;

    @Column(length = 250)
    private String ftopNombreTipoper;

    @Column(length = 20)
    private String ftopStatus;

    @Column(precision = 10, scale = 0)
    private BigDecimal ftopAtencionDias;

    @Column
    private Boolean ftopActoJuridico;

    @Column
    private Boolean ftopBienes;

}
