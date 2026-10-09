package com.fiduciawebmovil.usuarios.dtos;


import java.math.BigDecimal;
import java.time.LocalDate;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
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
public class UsuariosDTO {
        private Long usuNumUsuario;

    @Column(length = 50)
    private String usuNomUsuario;

    @Column(length = 50)
    private String usuTipoUsuario;

    @Column(precision = 10, scale = 0)
    private BigDecimal usuNumPuesto;

    @Column(length = 50)
    private String usuNomPuesto;

    @Column(length = 25)
    private String usuPassword;

    @Column(precision = 4, scale = 0)
    private BigDecimal usuAnoAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal usuMesAltaReg;

    @Column(precision = 2, scale = 0)
    private BigDecimal usuDiaAltaReg;

    @Column(precision = 4, scale = 0)
    private BigDecimal usuAnoUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal usuMesUltMod;

    @Column(precision = 2, scale = 0)
    private BigDecimal usuDiaUltMod;

    @Column(length = 25)
    private String usuCveStUsuario;

    @Column(precision = 10, scale = 0)
    private BigDecimal usuNumNivel1;

    @Column(precision = 10, scale = 0)
    private BigDecimal usuNumNivel2;

    @Column(precision = 10, scale = 0)
    private BigDecimal usuNumNivel3;

    @Column(precision = 10, scale = 0)
    private BigDecimal usuNumNivel4;

    @Column(precision = 10, scale = 0)
    private BigDecimal usuNumNivel5;

    @Column(precision = 10, scale = 0)
    private BigDecimal usuCentroLogro;

    @Column(precision = 10, scale = 0)
    private BigDecimal usuCentroCosto;

    @Column(precision = 2, scale = 0)
    private BigDecimal usuPtceGpot;

    @Column
    private LocalDate usuFechaUltAcceso;

    @Column
    private LocalDate usuFechaPassword;

    @Column
    private Boolean usuEstatusSeguridad;

    @Column
    private Boolean usuToken;

    @Column(precision = 16, scale = 2)
    private BigDecimal usuMontoAutorizado;
}
