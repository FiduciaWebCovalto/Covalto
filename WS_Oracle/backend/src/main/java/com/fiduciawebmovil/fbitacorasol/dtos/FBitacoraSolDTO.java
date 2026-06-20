package com.fiduciawebmovil.fbitacorasol.dtos;


import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.bitacora.entity.BitacoraId;
import com.fiduciawebmovil.fbitacora.entity.FBitacoraId;
import com.fiduciawebmovil.fbitacorasol.entity.FBitacoraSolId;

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
public class FBitacoraSolDTO {
@EmbeddedId
    private FBitacoraSolId id;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal usuNumUsuario;

    @Column
    private OffsetDateTime fbisFechaIni;

    @Column(nullable = true)
    private OffsetDateTime fbisFechaFin;

    @Column(length = 100)
    private String fbisObservacion;

    @Column(precision = 10, scale = 2)
      private BigDecimal fbisFirmaDig;
  
}
