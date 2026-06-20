package com.fiduciawebmovil.reporteador.entity;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "CONFIG_COLUMNAS")
public class ConfigColumna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "REPORTES_ID")
    private ConfigReporte configReporte;

    @Column(name = "NOMBRE_COLUMNA")
    private String nombreColumna;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ConfigReporte getConfigReporte() {
        return configReporte;
    }

    public void setConfigReporte(ConfigReporte configReporte) {
        this.configReporte = configReporte;
    }

    public String getNombreColumna() {
        return nombreColumna;
    }

    public void setNombreColumna(String nombreColumna) {
        this.nombreColumna = nombreColumna;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Boolean getEsFiltro() {
        return esFiltro;
    }

    public void setEsFiltro(Boolean esFiltro) {
        this.esFiltro = esFiltro;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    @Column(name = "ETIQUETA")
    private String etiqueta;

    @Column(name = "ES_FILTRO")
    private Boolean esFiltro;

    @Column(name = "ORDEN")
    private Integer orden;

    // Getters y Setters
}