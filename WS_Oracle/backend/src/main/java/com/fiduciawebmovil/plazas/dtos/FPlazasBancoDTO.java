package com.fiduciawebmovil.plazas.dtos;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.plazas.entity.FPlazasBancoId;

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
public class FPlazasBancoDTO {
        private FPlazasBancoId id;
private String fplbNombrePlaza;
}
