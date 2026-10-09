package com.fiduciawebmovil.terceros.entity;

import jakarta.persistence.*;

import java.io.Serializable;


import  java.util.Objects;



@Embeddable
public class TercerosId implements Serializable {


    public TercerosId(Long terNumTercero, Long terNumContrato) {
        this.terNumTercero = terNumTercero;
        this.terNumContrato = terNumContrato;
    }

    public TercerosId() {
    }

    private Long terNumTercero;

    private Long terNumContrato;

    public Long getTerNumTercero() {
        return terNumTercero;
    }

    public void setTerNumTercero(Long terNumTercero) {
        this.terNumTercero = terNumTercero;
    }

    public Long getTerNumContrato() {
        return terNumContrato;
    }

    public TercerosId(Long terNumContrato) {
        this.terNumContrato = terNumContrato;
    }

    public void setTerNumContrato(Long terNumContrato) {
        this.terNumContrato = terNumContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TercerosId that = (TercerosId) o;
        return Objects.equals(terNumTercero, that.terNumTercero) &&
         Objects.equals(terNumContrato, that.terNumContrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(terNumTercero, terNumContrato);
    }



}
