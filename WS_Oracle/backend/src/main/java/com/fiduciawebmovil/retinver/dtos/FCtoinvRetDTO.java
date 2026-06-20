package com.fiduciawebmovil.retinver.dtos;


import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.bitacora.entity.BitacoraId;
import com.fiduciawebmovil.fbitacora.entity.FBitacoraId;
import com.fiduciawebmovil.fbitacorasol.entity.FBitacoraSolId;
import com.fiduciawebmovil.insnovalor.entity.FConinsnomonValorId;
import com.fiduciawebmovil.retinver.entity.FCtoinvRet;
import com.fiduciawebmovil.retinver.entity.FCtoinvRetId;

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
public class FCtoinvRetDTO {

     @EmbeddedId
    private FCtoinvRetId id;

     @Column(name = "FCVR_IMPORTE_X_CTOINV",precision = 16, scale = 2)
    private BigDecimal fcvrImporteXCtoinv;
  
}
