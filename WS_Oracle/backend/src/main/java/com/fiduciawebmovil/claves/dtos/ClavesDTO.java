package com.fiduciawebmovil.claves.dtos;


import java.math.BigDecimal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.claves.entity.ClavesId;

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
public class ClavesDTO {
        @EmbeddedId
    private ClavesId id;

    @Column(length = 70)
    private String cveDescClave;

    @Column(precision = 16, scale = 2)
    private Long cveLiminfClave;

    @Column
    private Long cveLimsupClave;

    @Column(length = 70)
    private String cveFormaEmpCve;

    @Column(precision = 4, scale = 0)
    private BigDecimal cveAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal cveMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal cveDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal cveAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal cveMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal cveDiaUltMod;

    @Column(length = 25)
    private String cveCveStClave;

    @Column(length = 50)
    private String cveParam1;

    @Column(length = 50)
    private String cveDescParam1;

    @Column(length = 50)
    private String cveParam2;

    @Column(length = 50)
    private String cveDescParam2;

    @Column(length = 50)
    private String cveParam3;

    @Column(length = 50)
    private String cveDescParam3;

}
