package com.fiduciawebmovil.ctoinver.dtos;


import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.ctoinver.entity.ContinteId;
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
public class ContinteDTO {
@EmbeddedId
    private ContinteId id;

    @Column(length = 50)
    private String cprNomIntermed;

    @Column(length = 50)
    private String cprNomContacto1;

    @Column(length = 4)
    private String cprNumCveLada1;

    @Column(length = 20)
    private String cprNumTelef1;

    @Column(length = 10)
    private String cprNumExt1;

    @Column(length = 50)
    private String cprNomContacto2;

    @Column(length = 4)
    private String cprNumCveLada2;

    @Column(length = 20)
    private String cprNumTelef2;

    @Column(length = 10)
    private String cprNumExt2;

    @Column(length = 25)
    private String cprCveOrigRec;

    @Column(length = 80)
    private String cprCveFormaMan;

    @Column(length = 25)
    private String cprCveFormaLiq;

    @Column(length = 25)
    private String cprCveTipoCta;

    @Column(precision = 10, scale = 0)
    private BigDecimal cprNumBanco;

    @Column(precision = 10, scale = 0)
    private BigDecimal cprNumSucursal;

    @Column(precision = 11, scale = 0)
    private BigDecimal cprNumCuenta;

    @Column(precision = 4, scale = 0)
    private BigDecimal cprAnoApertura;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprMesApertura;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprDiaApertura;

    @Column(precision = 4, scale = 0)
    private BigDecimal cprAnoVencim;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprMesVencim;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprDiaVencim;

    @Column(precision = 4, scale = 0)
    private BigDecimal cprAnoCancela;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprMesCancela;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprDiaCancela;

    @Column(precision = 4, scale = 0)
    private BigDecimal cprAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal cprAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal cprDiaUltMod;

    @Column(length = 25)
    private String cprCveStContint;

    @Column(precision = 10, scale = 0)
    private BigDecimal cprCveIsrExen;

    @Column(precision = 16, scale = 2)
    private BigDecimal cprImpRendimi;

    @Column(precision = 10, scale = 0)
    private BigDecimal cprNumPais;

    @Column(length = 50)
    private String cprClienteUnico;

    @Column(length = 25)
    private String cprCveAreaInst;

}
