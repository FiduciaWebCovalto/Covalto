package com.fiduciawebmovil.bienes.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "F_ADQUIRENTES")
@NoArgsConstructor
public class FAdquirentes {

    @EmbeddedId
    private FAdquirentesId id;

    @Column(precision = 10, scale = 0)
    private BigDecimal fadqIdVenta;

    @Column(precision = 10, scale = 0)
    private BigDecimal fadqPeriodo;

    @Column(length = 125)
    private String fadqNombreComprador;

    @Column(precision = 16, scale = 2)
    private BigDecimal fadqValor;

    @Column(precision = 10, scale = 0)
    private BigDecimal fadqMoneda;

    @Column(length = 25)
    private String fadqTipoVenta;

    @Column(length = 25)
    private String fadqTipoPlazo;

    @Column(precision = 10, scale = 0)
    private BigDecimal fadqNumPlazo;

    @Column(precision = 16, scale = 2)
    private BigDecimal fadqEnganche;

    @Column(precision = 16, scale = 2)
    private BigDecimal fadqAbono;

    @Column(precision = 16, scale = 2)
    private BigDecimal fadqSaldo;

    @Column(precision = 10, scale = 0)
    private BigDecimal fadqPagos;

    @Column(precision = 10, scale = 0)
    private BigDecimal fadqNotario;

    @Column(length = 50)
    private String fadqLocalidad;

    @Column(length = 25)
    private String fadqCv;

    @Column(length = 35)
    private String fadqContrato;

    @Column(length = 35)
    private String fadqFolio;

    @Column
    private String fadqRegPub;

    @Column
    private LocalDate fadqFecAlta;

    @Column
    private LocalDate fadqFecMod;

    @Column(length = 25)
    private String fadqStatus;

    @Column
    private String fadqNomComprador;

    @Column(length = 30)
    private String fadqNumEscrcom;

    @Column
    private LocalDate fadqFecEscricom;

    @Column(length = 1000)
    private String fadqExpCatast;

    @Column
    private String fadqPrototipo;

    @Column
    private String fadqNumeroOficial;

    @Column
    private String fadqNotaria;

    @Column
    private String fadqDelegadoFiduciario;


    public BigDecimal getFadqIdVenta() {
        return fadqIdVenta;
    }

    public void setFadqIdVenta(final BigDecimal fadqIdVenta) {
        this.fadqIdVenta = fadqIdVenta;
    }

    public BigDecimal getFadqPeriodo() {
        return fadqPeriodo;
    }

    public void setFadqPeriodo(final BigDecimal fadqPeriodo) {
        this.fadqPeriodo = fadqPeriodo;
    }

    public String getFadqNombreComprador() {
        return fadqNombreComprador;
    }

    public void setFadqNombreComprador(final String fadqNombreComprador) {
        this.fadqNombreComprador = fadqNombreComprador;
    }

    public BigDecimal getFadqValor() {
        return fadqValor;
    }

    public void setFadqValor(final BigDecimal fadqValor) {
        this.fadqValor = fadqValor;
    }

    public BigDecimal getFadqMoneda() {
        return fadqMoneda;
    }

    public void setFadqMoneda(final BigDecimal fadqMoneda) {
        this.fadqMoneda = fadqMoneda;
    }

    public String getFadqTipoVenta() {
        return fadqTipoVenta;
    }

    public void setFadqTipoVenta(final String fadqTipoVenta) {
        this.fadqTipoVenta = fadqTipoVenta;
    }

    public String getFadqTipoPlazo() {
        return fadqTipoPlazo;
    }

    public void setFadqTipoPlazo(final String fadqTipoPlazo) {
        this.fadqTipoPlazo = fadqTipoPlazo;
    }

    public BigDecimal getFadqNumPlazo() {
        return fadqNumPlazo;
    }

    public void setFadqNumPlazo(final BigDecimal fadqNumPlazo) {
        this.fadqNumPlazo = fadqNumPlazo;
    }

    public BigDecimal getFadqEnganche() {
        return fadqEnganche;
    }

    public void setFadqEnganche(final BigDecimal fadqEnganche) {
        this.fadqEnganche = fadqEnganche;
    }

    public BigDecimal getFadqAbono() {
        return fadqAbono;
    }

    public void setFadqAbono(final BigDecimal fadqAbono) {
        this.fadqAbono = fadqAbono;
    }

    public BigDecimal getFadqSaldo() {
        return fadqSaldo;
    }

    public void setFadqSaldo(final BigDecimal fadqSaldo) {
        this.fadqSaldo = fadqSaldo;
    }

    public BigDecimal getFadqPagos() {
        return fadqPagos;
    }

    public void setFadqPagos(final BigDecimal fadqPagos) {
        this.fadqPagos = fadqPagos;
    }

    public BigDecimal getFadqNotario() {
        return fadqNotario;
    }

    public void setFadqNotario(final BigDecimal fadqNotario) {
        this.fadqNotario = fadqNotario;
    }

    public String getFadqLocalidad() {
        return fadqLocalidad;
    }

    public void setFadqLocalidad(final String fadqLocalidad) {
        this.fadqLocalidad = fadqLocalidad;
    }

    public String getFadqCv() {
        return fadqCv;
    }

    public void setFadqCv(final String fadqCv) {
        this.fadqCv = fadqCv;
    }

    public String getFadqContrato() {
        return fadqContrato;
    }

    public void setFadqContrato(final String fadqContrato) {
        this.fadqContrato = fadqContrato;
    }

    public String getFadqFolio() {
        return fadqFolio;
    }

    public void setFadqFolio(final String fadqFolio) {
        this.fadqFolio = fadqFolio;
    }

    public String getFadqRegPub() {
        return fadqRegPub;
    }

    public void setFadqRegPub(final String fadqRegPub) {
        this.fadqRegPub = fadqRegPub;
    }

    public LocalDate getFadqFecAlta() {
        return fadqFecAlta;
    }

    public void setFadqFecAlta(final LocalDate fadqFecAlta) {
        this.fadqFecAlta = fadqFecAlta;
    }

    public LocalDate getFadqFecMod() {
        return fadqFecMod;
    }

    public void setFadqFecMod(final LocalDate fadqFecMod) {
        this.fadqFecMod = fadqFecMod;
    }

    public String getFadqStatus() {
        return fadqStatus;
    }

    public void setFadqStatus(final String fadqStatus) {
        this.fadqStatus = fadqStatus;
    }

    public String getFadqNomComprador() {
        return fadqNomComprador;
    }

    public void setFadqNomComprador(final String fadqNomComprador) {
        this.fadqNomComprador = fadqNomComprador;
    }

    public String getFadqNumEscrcom() {
        return fadqNumEscrcom;
    }

    public void setFadqNumEscrcom(final String fadqNumEscrcom) {
        this.fadqNumEscrcom = fadqNumEscrcom;
    }

    public LocalDate getFadqFecEscricom() {
        return fadqFecEscricom;
    }

    public void setFadqFecEscricom(final LocalDate fadqFecEscricom) {
        this.fadqFecEscricom = fadqFecEscricom;
    }

    public String getFadqExpCatast() {
        return fadqExpCatast;
    }

    public void setFadqExpCatast(final String fadqExpCatast) {
        this.fadqExpCatast = fadqExpCatast;
    }

    public String getFadqPrototipo() {
        return fadqPrototipo;
    }

    public void setFadqPrototipo(final String fadqPrototipo) {
        this.fadqPrototipo = fadqPrototipo;
    }

    public String getFadqNumeroOficial() {
        return fadqNumeroOficial;
    }

    public void setFadqNumeroOficial(final String fadqNumeroOficial) {
        this.fadqNumeroOficial = fadqNumeroOficial;
    }

    public String getFadqNotaria() {
        return fadqNotaria;
    }

    public void setFadqNotaria(final String fadqNotaria) {
        this.fadqNotaria = fadqNotaria;
    }

    public String getFadqDelegadoFiduciario() {
        return fadqDelegadoFiduciario;
    }

    public void setFadqDelegadoFiduciario(final String fadqDelegadoFiduciario) {
        this.fadqDelegadoFiduciario = fadqDelegadoFiduciario;
    }

    public FAdquirentesId getId() {
        return id;
    }

    public void setId(FAdquirentesId id) {
        this.id = id;
    }

}
