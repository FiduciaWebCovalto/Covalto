package com.fiduciawebmovil.vistas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "VISTA1")
@NoArgsConstructor
public class Vista1 {

    @Id
    private String estado;
    private Long fiso;

    public Long getFiso() {
        return fiso;
    }
    public void setFiso(Long fiso) {
        this.fiso = fiso;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
