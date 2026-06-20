package com.fiduciawebmovil.reporteador.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.List;


@Entity
@Table(name = "CAT_COLUMNAS")
public class ColumnaReporte {
    @Id
    @Column(name = "ID_COLUMNA")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_REPORTE")
    private Reporte reporte;

    @Column(name = "NOMBRE_COLUMNA")
    private String nombreColumna;

    @Column(name = "ALIAS_VISUAL")
    private String aliasVisual;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getEsFiltro() {
        return esFiltro;
    }

    public void setEsFiltro(Boolean esFiltro) {
        this.esFiltro = esFiltro;
    }

    public String getParametroSql() {
        return parametroSql;
    }

    public void setParametroSql(String parametroSql) {
        this.parametroSql = parametroSql;
    }

    @Column(name = "ES_FILTRO")
    private Boolean esFiltro;

    @Column(name = "PARAMETRO_SQL")
    private String parametroSql;
    
    // Getters y Setters
}