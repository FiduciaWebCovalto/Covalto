package com.fiduciawebmovil.insnomon.dtos;


import java.math.BigDecimal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.insnomon.entity.FConinsnomonId;

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
public class FConinsnomon {
      @EmbeddedId
    private FConinsnomonId id;

    @Column
    private String conpNombre;

    @Column(length = 250)
    private String conpComentario;

    @Column(length = 25)
    private String conpTipoDato;

    @Column(precision = 10, scale = 0)
    private BigDecimal conpBase;

    @Column(length = 250)
    private String conpTabla;

    @Column(length = 25)
    private String conpEstatus;

    @Column(precision = 10, scale = 0)
    private BigDecimal conpPadre;

    @Column
    private Boolean conpObligatorio;

}
