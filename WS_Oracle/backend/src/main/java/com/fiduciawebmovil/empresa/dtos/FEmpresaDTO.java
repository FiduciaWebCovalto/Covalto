package com.fiduciawebmovil.empresa.dtos;


import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class FEmpresaDTO {

    private Long empNumEmpresa;

    @Column(length = 125)
    private String empNomEmpresa;

    @Column(length = 125)
    private String empNomArea;

    @Column(length = 125)
    private String empDireccion;

    @Column(length = 125)
    private String empNomAutoriza;

    @Column(length = 125)
    private String empNomFirma;

    @Column(length = 125)
    private String empIdioma;

    @Column(length = 25)
    private String empEstilo;

    @Column
    private LocalDate empFecCambio;

    @Column(length = 125)
    private String empLlaveEmpresa;

    @Column(length = 125)
    private String empNomAutoriza2;

    @Column(length = 125)
    private String empNomFirma2;

    @Column(length = 1200)
    private String empLeyendaEdosfin;

    @Column(length = 1200)
    private String empLeyendaEdores;

    @Column(precision = 10, scale = 0)
    private BigDecimal empConfirma;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterValores;

    @Column(length = 1200)
    private String empNombreValores;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterConta;

    @Column(length = 1200)
    private String empNombreConta;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterLavado;

    @Column(length = 1200)
    private String empNombreLavado;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterVector;

    @Column(length = 1200)
    private String empNombreVector;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterClientes;

    @Column(length = 1200)
    private String empNombreClientes;

    @Column(precision = 10, scale = 0)
    private BigDecimal empInterCreditos;

    @Column(length = 1200)
    private String empNombreCreditos;

    @Column(precision = 10, scale = 0)
    private BigDecimal empProcedimiento; 

}
