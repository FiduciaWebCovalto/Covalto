package com.fiduciawebmovil.password.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Table(name = "F_Ppassword")
@NoArgsConstructor
public class FPpassword {

    @Id
    private Long fpaNumInstitucion;

    @Column(precision = 10, scale = 0)
    private BigDecimal fpaNumFallas;

    @Column(precision = 10, scale = 0)
    private BigDecimal fpaNumCaracteres;

    @Column(precision = 10, scale = 0)
    private BigDecimal fpaNumLetras;

    @Column(precision = 10, scale = 0)
    private BigDecimal fpaNumNumeros;

    @Column(precision = 10, scale = 0)
    private BigDecimal fpaNumHistoria;

    @Column(precision = 10, scale = 0)
    private BigDecimal fpaNumDiasCambio;

    @Column(precision = 10, scale = 0)
    private BigDecimal fpaNumDiasInactivo;

    @Column(precision = 10, scale = 0)
    private BigDecimal fpaNumConecciones;

    @Column(precision = 10, scale = 0)
    private BigDecimal fpaMinDesconeccion;

    @Column(length = 25)
    private String fpaPasswordDfl;

    public Long getFpaNumInstitucion() {
        return fpaNumInstitucion;
    }

    public void setFpaNumInstitucion(final Long fpaNumInstitucion) {
        this.fpaNumInstitucion = fpaNumInstitucion;
    }

    public BigDecimal getFpaNumFallas() {
        return fpaNumFallas;
    }

    public void setFpaNumFallas(final BigDecimal fpaNumFallas) {
        this.fpaNumFallas = fpaNumFallas;
    }

    public BigDecimal getFpaNumCaracteres() {
        return fpaNumCaracteres;
    }

    public void setFpaNumCaracteres(final BigDecimal fpaNumCaracteres) {
        this.fpaNumCaracteres = fpaNumCaracteres;
    }

    public BigDecimal getFpaNumLetras() {
        return fpaNumLetras;
    }

    public void setFpaNumLetras(final BigDecimal fpaNumLetras) {
        this.fpaNumLetras = fpaNumLetras;
    }

    public BigDecimal getFpaNumNumeros() {
        return fpaNumNumeros;
    }

    public void setFpaNumNumeros(final BigDecimal fpaNumNumeros) {
        this.fpaNumNumeros = fpaNumNumeros;
    }

    public BigDecimal getFpaNumHistoria() {
        return fpaNumHistoria;
    }

    public void setFpaNumHistoria(final BigDecimal fpaNumHistoria) {
        this.fpaNumHistoria = fpaNumHistoria;
    }

    public BigDecimal getFpaNumDiasCambio() {
        return fpaNumDiasCambio;
    }

    public void setFpaNumDiasCambio(final BigDecimal fpaNumDiasCambio) {
        this.fpaNumDiasCambio = fpaNumDiasCambio;
    }

    public BigDecimal getFpaNumDiasInactivo() {
        return fpaNumDiasInactivo;
    }

    public void setFpaNumDiasInactivo(final BigDecimal fpaNumDiasInactivo) {
        this.fpaNumDiasInactivo = fpaNumDiasInactivo;
    }

    public BigDecimal getFpaNumConecciones() {
        return fpaNumConecciones;
    }

    public void setFpaNumConecciones(final BigDecimal fpaNumConecciones) {
        this.fpaNumConecciones = fpaNumConecciones;
    }

    public BigDecimal getFpaMinDesconeccion() {
        return fpaMinDesconeccion;
    }

    public void setFpaMinDesconeccion(final BigDecimal fpaMinDesconeccion) {
        this.fpaMinDesconeccion = fpaMinDesconeccion;
    }

    public String getFpaPasswordDfl() {
        return fpaPasswordDfl;
    }

    public void setFpaPasswordDfl(final String fpaPasswordDfl) {
        this.fpaPasswordDfl = fpaPasswordDfl;
    }

}