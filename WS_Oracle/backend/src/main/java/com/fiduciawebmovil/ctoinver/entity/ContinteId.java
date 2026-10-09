package com.fiduciawebmovil.ctoinver.entity;

import jakarta.persistence.*;

import java.io.Serializable;

import  java.util.Objects;


@Embeddable
public class ContinteId implements Serializable{

   
    @Column(nullable = false, updatable = false)
    private Long cprSubContrato;

    @Column(precision = 10, scale = 0)
    private Long cprNumContrato;

    @Column(precision = 10, scale = 0)
    private Long cprEntidadFin;

    @Column(precision = 10, scale = 0)
    private Long cprContratoInter;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContinteId that = (ContinteId) o;
        return Objects.equals(cprSubContrato, that.cprSubContrato) &&
         Objects.equals(cprNumContrato, that.cprNumContrato) &&
          Objects.equals(cprEntidadFin, that.cprEntidadFin) &&
         Objects.equals(cprContratoInter, that.cprContratoInter);
    }



    public Long getCprSubContrato() {
        return cprSubContrato;
    }



    public ContinteId() {
    }



    public ContinteId(Long cprSubContrato, Long cprNumContrato, Long cprEntidadFin, Long cprContratoInter) {
        this.cprSubContrato = cprSubContrato;
        this.cprNumContrato = cprNumContrato;
        this.cprEntidadFin = cprEntidadFin;
        this.cprContratoInter = cprContratoInter;
    }



    public void setCprSubContrato(Long cprSubContrato) {
        this.cprSubContrato = cprSubContrato;
    }



    public Long getCprNumContrato() {
        return cprNumContrato;
    }



    public void setCprNumContrato(Long cprNumContrato) {
        this.cprNumContrato = cprNumContrato;
    }



    public Long getCprEntidadFin() {
        return cprEntidadFin;
    }



    public void setCprEntidadFin(Long cprEntidadFin) {
        this.cprEntidadFin = cprEntidadFin;
    }



    public Long getCprContratoInter() {
        return cprContratoInter;
    }



    public void setCprContratoInter(Long cprContratoInter) {
        this.cprContratoInter = cprContratoInter;
    }



    @Override
    public int hashCode() {
        return Objects.hash(cprSubContrato, cprNumContrato,cprEntidadFin,cprContratoInter);
    }
  
}
