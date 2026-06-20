package com.fiduciawebmovil.reporteador.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "CAT_REPORTES_COLUMNAS")
public class ReporteColumna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColumna;

    public Long getIdColumna() {
        return idColumna;
    }
    public void setIdColumna(Long idColumna) {
        this.idColumna = idColumna;
    }
    public Reporte getReporte() {
        return reporte;
    }
    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }
    public String getNombreColumna() {
        return nombreColumna;
    }
    public void setNombreColumna(String nombreColumna) {
        this.nombreColumna = nombreColumna;
    }
    public String getAliasVisual() {
        return aliasVisual;
    }
    public void setAliasVisual(String aliasVisual) {
        this.aliasVisual = aliasVisual;
    }
    public String getEsFiltro() {
        return esFiltro;
    }
    public void setEsFiltro(String esFiltro) {
        this.esFiltro = esFiltro;
    }
    public String getTipoFiltro() {
        return tipoFiltro;
    }
    public void setTipoFiltro(String tipoFiltro) {
        this.tipoFiltro = tipoFiltro;
    }
    public int getOrden() {
        return orden;
    }
    public void setOrden(int orden) {
        this.orden = orden;
    }
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_reporte")
    private Reporte reporte;

    private String nombreColumna;
    private String aliasVisual;
    private String esFiltro; // 'Y' o 'N'
    private String tipoFiltro;
    private int orden;

    // Getters y Setters
}