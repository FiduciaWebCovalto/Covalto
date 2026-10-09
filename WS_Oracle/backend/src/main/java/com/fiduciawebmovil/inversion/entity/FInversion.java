package com.fiduciawebmovil.inversion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Table(name = "F_INVERSION")
@NoArgsConstructor
public class FInversion {

    @Id
    private Long insNumFolioInst;

    @Column(precision = 10, scale = 0)
    private BigDecimal insNumContrato;

    @Column(precision = 10, scale = 0)
    private BigDecimal finTipo;

    @Column(precision = 10, scale = 0)
    private BigDecimal finConcepto;

    @Column
    private String finObservaciones;

    @Column(precision = 16, scale = 2)
    private BigDecimal finImporte;

    @Column
    private String finInstrumento;

    @Column
    private String finTipoInstrumentoOrig;

    @Column
    private String finTipoInstrumentoDest;

    @Column
    private String finCuentaOrigen;

    @Column
    private String finCuentaDestino;

    @Column
    private String finCajonIndeval;

    @Column
    private String finPlazoDias;

    @Column
    private String finInstitucion;

    @Column
    private String finContratoBursatil;

    @Column
    private String finMoneda;

    @Column
    private String finTipoPersona;

    @Column
    private String finBeneficiario;

    @Column
    private String finPizarra;

    @Column
    private String finLiquidez;

    @Column
    private String finPrecioTecho;

    @Column
    private String finPrecioPiso;

    @Column
    private String finPrecioMercado;

    public Long getInsNumFolioInst() {
        return insNumFolioInst;
    }

    public void setInsNumFolioInst(final Long insNumFolioInst) {
        this.insNumFolioInst = insNumFolioInst;
    }

    public BigDecimal getInsNumContrato() {
        return insNumContrato;
    }

    public void setInsNumContrato(final BigDecimal insNumContrato) {
        this.insNumContrato = insNumContrato;
    }

    public BigDecimal getFinTipo() {
        return finTipo;
    }

    public void setFinTipo(final BigDecimal finTipo) {
        this.finTipo = finTipo;
    }

    public BigDecimal getFinConcepto() {
        return finConcepto;
    }

    public void setFinConcepto(final BigDecimal finConcepto) {
        this.finConcepto = finConcepto;
    }

    public String getFinObservaciones() {
        return finObservaciones;
    }

    public void setFinObservaciones(final String finObservaciones) {
        this.finObservaciones = finObservaciones;
    }

    public BigDecimal getFinImporte() {
        return finImporte;
    }

    public void setFinImporte(final BigDecimal finImporte) {
        this.finImporte = finImporte;
    }

    public String getFinInstrumento() {
        return finInstrumento;
    }

    public void setFinInstrumento(final String finInstrumento) {
        this.finInstrumento = finInstrumento;
    }

    public String getFinTipoInstrumentoOrig() {
        return finTipoInstrumentoOrig;
    }

    public void setFinTipoInstrumentoOrig(final String finTipoInstrumentoOrig) {
        this.finTipoInstrumentoOrig = finTipoInstrumentoOrig;
    }

    public String getFinTipoInstrumentoDest() {
        return finTipoInstrumentoDest;
    }

    public void setFinTipoInstrumentoDest(final String finTipoInstrumentoDest) {
        this.finTipoInstrumentoDest = finTipoInstrumentoDest;
    }

    public String getFinCuentaOrigen() {
        return finCuentaOrigen;
    }

    public void setFinCuentaOrigen(final String finCuentaOrigen) {
        this.finCuentaOrigen = finCuentaOrigen;
    }

    public String getFinCuentaDestino() {
        return finCuentaDestino;
    }

    public void setFinCuentaDestino(final String finCuentaDestino) {
        this.finCuentaDestino = finCuentaDestino;
    }

    public String getFinCajonIndeval() {
        return finCajonIndeval;
    }

    public void setFinCajonIndeval(final String finCajonIndeval) {
        this.finCajonIndeval = finCajonIndeval;
    }

    public String getFinPlazoDias() {
        return finPlazoDias;
    }

    public void setFinPlazoDias(final String finPlazoDias) {
        this.finPlazoDias = finPlazoDias;
    }

    public String getFinInstitucion() {
        return finInstitucion;
    }

    public void setFinInstitucion(final String finInstitucion) {
        this.finInstitucion = finInstitucion;
    }

    public String getFinContratoBursatil() {
        return finContratoBursatil;
    }

    public void setFinContratoBursatil(final String finContratoBursatil) {
        this.finContratoBursatil = finContratoBursatil;
    }

    public String getFinMoneda() {
        return finMoneda;
    }

    public void setFinMoneda(final String finMoneda) {
        this.finMoneda = finMoneda;
    }

    public String getFinTipoPersona() {
        return finTipoPersona;
    }

    public void setFinTipoPersona(final String finTipoPersona) {
        this.finTipoPersona = finTipoPersona;
    }

    public String getFinBeneficiario() {
        return finBeneficiario;
    }

    public void setFinBeneficiario(final String finBeneficiario) {
        this.finBeneficiario = finBeneficiario;
    }

    public String getFinPizarra() {
        return finPizarra;
    }

    public void setFinPizarra(final String finPizarra) {
        this.finPizarra = finPizarra;
    }

    public String getFinLiquidez() {
        return finLiquidez;
    }

    public void setFinLiquidez(final String finLiquidez) {
        this.finLiquidez = finLiquidez;
    }

    public String getFinPrecioTecho() {
        return finPrecioTecho;
    }

    public void setFinPrecioTecho(final String finPrecioTecho) {
        this.finPrecioTecho = finPrecioTecho;
    }

    public String getFinPrecioPiso() {
        return finPrecioPiso;
    }

    public void setFinPrecioPiso(final String finPrecioPiso) {
        this.finPrecioPiso = finPrecioPiso;
    }

    public String getFinPrecioMercado() {
        return finPrecioMercado;
    }

    public void setFinPrecioMercado(final String finPrecioMercado) {
        this.finPrecioMercado = finPrecioMercado;
    }

}
