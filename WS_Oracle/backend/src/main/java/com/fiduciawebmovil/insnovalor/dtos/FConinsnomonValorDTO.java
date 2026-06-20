package com.fiduciawebmovil.insnovalor.dtos;


import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.bitacora.entity.BitacoraId;
import com.fiduciawebmovil.fbitacora.entity.FBitacoraId;
import com.fiduciawebmovil.fbitacorasol.entity.FBitacoraSolId;
import com.fiduciawebmovil.insnovalor.entity.FConinsnomonValorId;

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
public class FConinsnomonValorDTO {

    @EmbeddedId
    private FConinsnomonValorId id;

    @Column
    private String convValor;
  
}
