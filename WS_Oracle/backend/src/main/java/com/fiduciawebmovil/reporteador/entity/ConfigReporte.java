package com.fiduciawebmovil.reporteador.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "CONFIG_REPORTES")
public class ConfigReporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "NOMBRE_REPORTE")
    private String nombreReporte;
    
    @Column(name = "TABLA_BASE")
    private String tablaBase;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public String getTablaBase() {
        return tablaBase;
    }

    public void setTablaBase(String tablaBase) {
        this.tablaBase = tablaBase;
    }

    public List<ConfigColumna> getColumnas() {
        return columnas;
    }

    public void setColumnas(List<ConfigColumna> columnas) {
        this.columnas = columnas;
    }

    @OneToMany(mappedBy = "configReporte", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ConfigColumna> columnas;
    
    // Getters y Setters
}
