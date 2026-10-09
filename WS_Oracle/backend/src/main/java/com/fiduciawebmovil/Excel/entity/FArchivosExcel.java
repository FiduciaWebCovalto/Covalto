package com.fiduciawebmovil.Excel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;


@Entity
@Table(name = "F_ARCHIVOS_EXCEL")
public class FArchivosExcel {

    
    @Column(nullable = false, updatable = false)
    private Long areTipo;
    
    @Id
    @Column(nullable = false, precision = 10, scale = 0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal areSecuencial;

    @Column(nullable = false, length = 100)
    private String areNomArchivo;

    @Column(length = 1500)
    private String areContenido;

    public Long getAreTipo() {
        return areTipo;
    }

    public void setAreTipo(final Long areTipo) {
        this.areTipo = areTipo;
    }

    public BigDecimal getAreSecuencial() {
        return areSecuencial;
    }

    public void setAreSecuencial(final BigDecimal areSecuencial) {
        this.areSecuencial = areSecuencial;
    }


    public String getAreNomArchivo() {
        return areNomArchivo;
    }

    public void setAreNomArchivo(final String areNomArchivo) {
        this.areNomArchivo = areNomArchivo;
    }

    public String getAreContenido() {
        return areContenido;
    }

    public void setAreContenido(final String areContenido) {
        this.areContenido = areContenido;
    }

}
