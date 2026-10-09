package com.fiduciawebmovil.benefici.dtos;


import java.math.BigDecimal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiduciawebmovil.benefici.entity.BeneficiId;


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
public class BeneficiDTO {

    @EmbeddedId
    private BeneficiId id;

    @Column(precision = 10, scale = 0)
    private BigDecimal benNumPais;

    @Column(precision = 10, scale = 0)
    private BigDecimal benNumSrama;

    @Column(length = 25)
    private String benCveMigratoria;

    @Column
    private Boolean benCveSexo;

    @Column(length = 25)
    private String benCveTipoPer;

    @Column(length = 250)
    private String benNomBenef;

    @Column(length = 15)
    private String benRfc;

    @Column(length = 20)
    private String benFecNac;

    @Column(length = 50)
    private String benNomRepres;

    @Column(length = 50)
    private String benNomNacional;

    @Column(length = 4)
    private String benNumLadaCasa;

    @Column(length = 50)
    private String benNumTelefCasa;

    @Column(length = 4)
    private String benNumLadaOfic;

    @Column(length = 50)
    private String benNumTelefOfic;

    @Column(length = 10)
    private String benNumExtOfic;

    @Column(length = 4)
    private String benNumLadaFax;

    @Column(length = 50)
    private String benNumTelefFax;

    @Column(length = 10)
    private String benNumExtFax;

    @Column(precision = 4, scale = 0)
    private BigDecimal benAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal benMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal benDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal benAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal benMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal benDiaUltMod;

    @Column(length = 25)
    private String benCveStBenefic;

    @Column(length = 20)
    private String benCurp;
}
