package com.fiduciawebmovil.instruc.dtos;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.bitacora.entity.BitacoraId;
import com.fiduciawebmovil.fbitacora.entity.FBitacoraId;
import com.fiduciawebmovil.fbitacorasol.entity.FBitacoraSolId;
import com.fiduciawebmovil.insnovalor.entity.FConinsnomonValorId;
import com.fiduciawebmovil.retinver.entity.FCtoinvRet;

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
public class InstruccDTO {

    @Column(nullable = false, updatable = false)
    private Long insNumFolioInst;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal insNumContrato;

    @Column(precision = 10, scale = 2)
    private BigDecimal insSubContrato;

    @Column(length = 1000)
    private String insTxtComentario;

    @Column(length = 35)
    private String insCveTipoInstr;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal insNumMiembro;

    @Column(length = 50)
    private String insNomMiembro;

    @Column(nullable = false, precision = 4, scale = 2)
    private BigDecimal insAnoAltaReg;

    @Column(nullable = false, precision = 2, scale = 2)
    private BigDecimal insMesAltaReg;

    @Column(nullable = false, precision = 2, scale = 2)
    private BigDecimal insDiaAltaReg;

    @Column(nullable = false, precision = 4, scale = 2)
    private BigDecimal insAnoUltMod;

    @Column(nullable = false, precision = 2, scale = 2)
    private BigDecimal insMesUltMod;

    @Column(nullable = false, precision = 2, scale = 2)
    private BigDecimal insDiaUltMod;

    @Column(length = 25)
    private String insCveStInstruc;

    @Column(length = 25)
    private String insCveStCont;

    @Column(nullable = true)
    private OffsetDateTime insFechaContable;

     @Column(nullable = true)
    private OffsetDateTime sesFecha;

    @Column
    private Boolean sesTipo;

    @Column(length = 25)
    private String acuId;

    @Column(length = 5)
    private String insNumOper;
}
