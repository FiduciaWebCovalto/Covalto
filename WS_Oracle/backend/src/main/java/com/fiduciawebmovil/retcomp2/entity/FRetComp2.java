package com.fiduciawebmovil.retcomp2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "F_RET_COMP2")
@NoArgsConstructor
public class FRetComp2 {

    @Id
    private Long frcFolio;

    @Column(length = 30)
    private String frcPagounico;

    @Column(length = 30)
    private String frcNombresw;

    @Column(length = 30)
    private String frcPaissw;

    @Column(length = 30)
    private String frcCiudadsw;

    @Column(length = 80)
    private String frcDomiciliosw;

    @Column(length = 30)
    private String frcTelefono;

    @Column(length = 30)
    private String frcReferencia1;

    @Column(length = 30)
    private String frcReferencia2;

    @Column(length = 30)
    private String frcReferencia3;

    @Column(length = 30)
    private String frcCalle;

    @Column(length = 30)
    private String frcNumext;

    @Column(length = 30)
    private String frcNumint;

    @Column(length = 30)
    private String frcColonia;

    @Column(length = 30)
    private String frcDelegacion;

    @Column(length = 30)
    private String frcCodigopostal;

    @Column(length = 30)
    private String frcEstado;

    @Column
    private String frcCiudad;

    public Long getFrcFolio() {
        return frcFolio;
    }

    public void setFrcFolio(final Long frcFolio) {
        this.frcFolio = frcFolio;
    }

    public String getFrcPagounico() {
        return frcPagounico;
    }

    public void setFrcPagounico(final String frcPagounico) {
        this.frcPagounico = frcPagounico;
    }

    public String getFrcNombresw() {
        return frcNombresw;
    }

    public void setFrcNombresw(final String frcNombresw) {
        this.frcNombresw = frcNombresw;
    }

    public String getFrcPaissw() {
        return frcPaissw;
    }

    public void setFrcPaissw(final String frcPaissw) {
        this.frcPaissw = frcPaissw;
    }

    public String getFrcCiudadsw() {
        return frcCiudadsw;
    }

    public void setFrcCiudadsw(final String frcCiudadsw) {
        this.frcCiudadsw = frcCiudadsw;
    }

    public String getFrcDomiciliosw() {
        return frcDomiciliosw;
    }

    public void setFrcDomiciliosw(final String frcDomiciliosw) {
        this.frcDomiciliosw = frcDomiciliosw;
    }

    public String getFrcTelefono() {
        return frcTelefono;
    }

    public void setFrcTelefono(final String frcTelefono) {
        this.frcTelefono = frcTelefono;
    }

    public String getFrcReferencia1() {
        return frcReferencia1;
    }

    public void setFrcReferencia1(final String frcReferencia1) {
        this.frcReferencia1 = frcReferencia1;
    }

    public String getFrcReferencia2() {
        return frcReferencia2;
    }

    public void setFrcReferencia2(final String frcReferencia2) {
        this.frcReferencia2 = frcReferencia2;
    }

    public String getFrcReferencia3() {
        return frcReferencia3;
    }

    public void setFrcReferencia3(final String frcReferencia3) {
        this.frcReferencia3 = frcReferencia3;
    }

    public String getFrcCalle() {
        return frcCalle;
    }

    public void setFrcCalle(final String frcCalle) {
        this.frcCalle = frcCalle;
    }

    public String getFrcNumext() {
        return frcNumext;
    }

    public void setFrcNumext(final String frcNumext) {
        this.frcNumext = frcNumext;
    }

    public String getFrcNumint() {
        return frcNumint;
    }

    public void setFrcNumint(final String frcNumint) {
        this.frcNumint = frcNumint;
    }

    public String getFrcColonia() {
        return frcColonia;
    }

    public void setFrcColonia(final String frcColonia) {
        this.frcColonia = frcColonia;
    }

    public String getFrcDelegacion() {
        return frcDelegacion;
    }

    public void setFrcDelegacion(final String frcDelegacion) {
        this.frcDelegacion = frcDelegacion;
    }

    public String getFrcCodigopostal() {
        return frcCodigopostal;
    }

    public void setFrcCodigopostal(final String frcCodigopostal) {
        this.frcCodigopostal = frcCodigopostal;
    }

    public String getFrcEstado() {
        return frcEstado;
    }

    public void setFrcEstado(final String frcEstado) {
        this.frcEstado = frcEstado;
    }

    public String getFrcCiudad() {
        return frcCiudad;
    }

    public void setFrcCiudad(final String frcCiudad) {
        this.frcCiudad = frcCiudad;
    }

}
