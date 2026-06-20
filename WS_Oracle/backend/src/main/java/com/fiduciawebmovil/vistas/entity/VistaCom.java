package com.fiduciawebmovil.vistas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "VW_COMITE")
@NoArgsConstructor
public class VistaCom {

    @Id
    private Long fiso;
    private String nombre;
    private String finalidad;
    private String fecha;
    public Long getFiso() {
        return fiso;
    }
    public void setFiso(Long fiso) {
        this.fiso = fiso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFinalidad() {
        return finalidad;
    }
    public void setFinalidad(String finalidad) {
        this.finalidad = finalidad;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
