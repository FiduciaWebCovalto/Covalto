package com.fiduciawebmovil.insnomon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;



@Entity
@Data
@Builder
@Table(name = "f_coninsnomon")
@AllArgsConstructor
@NoArgsConstructor
public class FConinsnomon {

    @EmbeddedId
    private FConinsnomonId id;

    @Column
    private String conpNombre;

    @Column(length = 250)
    private String conpComentario;

    @Column(length = 25)
    private String conpTipoDato;

    @Column(precision = 10, scale = 0)
    private BigDecimal conpBase;

    @Column(length = 250)
    private String conpTabla;

    @Column(length = 25)
    private String conpEstatus;

    @Column(precision = 10, scale = 0)
    private BigDecimal conpPadre;

    @Column
    private Boolean conpObligatorio;

    public FConinsnomonId getId() {
        return id;
    }

    public void setId(final FConinsnomonId id) {
        this.id = id;
    }

    public String getConpNombre() {
        return conpNombre;
    }

    public void setConpNombre(final String conpNombre) {
        this.conpNombre = conpNombre;
    }

    public String getConpComentario() {
        return conpComentario;
    }

    public void setConpComentario(final String conpComentario) {
        this.conpComentario = conpComentario;
    }

    public String getConpTipoDato() {
        return conpTipoDato;
    }

    public void setConpTipoDato(final String conpTipoDato) {
        this.conpTipoDato = conpTipoDato;
    }

    public BigDecimal getConpBase() {
        return conpBase;
    }

    public void setConpBase(final BigDecimal conpBase) {
        this.conpBase = conpBase;
    }

    public String getConpTabla() {
        return conpTabla;
    }

    public void setConpTabla(final String conpTabla) {
        this.conpTabla = conpTabla;
    }

    public String getConpEstatus() {
        return conpEstatus;
    }

    public void setConpEstatus(final String conpEstatus) {
        this.conpEstatus = conpEstatus;
    }

    public BigDecimal getConpPadre() {
        return conpPadre;
    }

    public void setConpPadre(final BigDecimal conpPadre) {
        this.conpPadre = conpPadre;
    }

    public Boolean getConpObligatorio() {
        return conpObligatorio;
    }

    public void setConpObligatorio(final Boolean conpObligatorio) {
        this.conpObligatorio = conpObligatorio;
    }

}
