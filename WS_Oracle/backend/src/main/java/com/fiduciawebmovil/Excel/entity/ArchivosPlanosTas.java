package com.fiduciawebmovil.Excel.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ARCHIVOS_PLANOS_TAS")
public class ArchivosPlanosTas {
    @Column(nullable = false, updatable = false)
    private String arpNomArchivo;
    
    @Id
    @Column(nullable = false, precision = 10, scale = 0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal arpSecuencial;

    @Column(nullable = false, length = 100)
    private String arpDescripcion;

    @Column(length = 1500)
    private String arpFecha;    
}
