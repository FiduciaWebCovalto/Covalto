package com.fiduciawebmovil.reporteador.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "CAT_REPORTES")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReporte;
    
    public Long getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Long idReporte) {
        this.idReporte = idReporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getQueryBase() {
        return queryBase;
    }

    public void setQueryBase(String queryBase) {
        this.queryBase = queryBase;
    }

    public List<ReporteColumna> getColumnas() {
        return columnas;
    }

    public void setColumnas(List<ReporteColumna> columnas) {
        this.columnas = columnas;
    }

    private String nombre;
    private String descripcion;
    private String queryBase;

    @JsonManagedReference
    @OneToMany(mappedBy = "reporte", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReporteColumna> columnas;

    // Getters y Setters
}