package com.fiduciawebmovil.bienes.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Entity
@Table(name = "F_BIENESGAR")
@NoArgsConstructor
public class FBienesgar {

    @EmbeddedId
    private FBienesgarId id;

    @Column(precision = 10, scale = 0)
    private BigDecimal forsInmCsc;

    @Column
    private String forsInmSubmateria;

    @Column
    private String forsInmEstatus;

    @Column
    private String forsInmMoneda;

    @Column(precision = 18, scale = 2)
    private BigDecimal forsInmImporte;

    @Column
    private String forsInmBeneficiario;

    @Column
    private String forsInmUniApodoInm;

    @Column
    private String forsInmCalleAv;

    @Column
    private String forsInmNumExtMza;

    @Column
    private String forsInmNumIntLt;

    @Column
    private String forsInmColonia;

    @Column
    private String forsInmPais;

    @Column
    private String forsInmEstado;

    @Column
    private String forsInmCiudad;

    @Column
    private String forsInmDelMun;

    @Column(precision = 10, scale = 0)
    private BigDecimal forsInmCp;

    @Column(precision = 10, scale = 0)
    private BigDecimal forsInmSuperficie;

    @Column
    private String forsInmSubTipo;

    @Column(length = 10)
    private String forsInmFecValor;

    @Column
    private String forsInmClaveCatas;

    @Column
    private String forsInmCuentaPred;

    @Column(precision = 10, scale = 2)
    private BigDecimal forsInmPenPredial;

    @Column(precision = 10, scale = 2)
    private BigDecimal forsInmEmbargo;

    @Column(precision = 10, scale = 2)
    private BigDecimal forsInmImpTotInm;

    @Column(precision = 10, scale = 0)
    private BigDecimal forsMueCsc;

    @Column
    private String forsMueTipoDoc;

    @Column
    private String forsMueTipoCopia;

    @Column
    private String forsMueNumeroDoc;

    @Column(length = 10)
    private String forsMueFechaExp;

    @Column(length = 10)
    private String forsMueFechaVenc;

    @Column
    private String forsMueMoneda;

    @Column(precision = 18, scale = 2)
    private BigDecimal forsMueValorDoc;

    @Column
    private String forsMueDescDoc;

    @Column
    private String forsMueQuienExpDocu;

    @Column
    private String forsMueFavExpDoc;

    @Column
    private String forsMueEndoso;

    @Column(length = 10)
    private String forsMueFecEndoso;

    @Column(length = 10)
    private String forsMueFecEntrada;

    @Column(length = 10)
    private String forsMueFecSalida;

    @Column
    private String forsMueEstatus;

    @Column(precision = 18, scale = 2)
    private BigDecimal forsMueImpTotMueb;

    @Column(precision = 10, scale = 0)
    private BigDecimal forsDerCsc;

    @Column
    private String forsDerAdministrador;

    @Column(precision = 18, scale = 0)
    private BigDecimal forsDerNoCedito;

    @Column
    private String forsDerNomAcredi;

    @Column(precision = 18, scale = 2)
    private BigDecimal forsDerImporte;

    @Column
    private String forsDerMoneda;

    @Column
    private String forsDerEstatusCred;

    @Column(length = 10)
    private String forsDerFecValor;

    @Column
    private String forsDerDirInmueble;

    @Column
    private String forsDerEstado;

    @Column
    private String forsDerEstatus;

    @Column(precision = 18, scale = 2)
    private BigDecimal forsDerImpTotDer;

    public BigDecimal getForsInmCsc() {
        return forsInmCsc;
    }

    public FBienesgarId getId() {
        return id;
    }

    public void setId(FBienesgarId id) {
        this.id = id;
    }

    public void setForsInmCsc(final BigDecimal forsInmCsc) {
        this.forsInmCsc = forsInmCsc;
    }

    public String getForsInmSubmateria() {
        return forsInmSubmateria;
    }

    public void setForsInmSubmateria(final String forsInmSubmateria) {
        this.forsInmSubmateria = forsInmSubmateria;
    }

    public String getForsInmEstatus() {
        return forsInmEstatus;
    }

    public void setForsInmEstatus(final String forsInmEstatus) {
        this.forsInmEstatus = forsInmEstatus;
    }

    public String getForsInmMoneda() {
        return forsInmMoneda;
    }

    public void setForsInmMoneda(final String forsInmMoneda) {
        this.forsInmMoneda = forsInmMoneda;
    }

    public BigDecimal getForsInmImporte() {
        return forsInmImporte;
    }

    public void setForsInmImporte(final BigDecimal forsInmImporte) {
        this.forsInmImporte = forsInmImporte;
    }

    public String getForsInmBeneficiario() {
        return forsInmBeneficiario;
    }

    public void setForsInmBeneficiario(final String forsInmBeneficiario) {
        this.forsInmBeneficiario = forsInmBeneficiario;
    }

    public String getForsInmUniApodoInm() {
        return forsInmUniApodoInm;
    }

    public void setForsInmUniApodoInm(final String forsInmUniApodoInm) {
        this.forsInmUniApodoInm = forsInmUniApodoInm;
    }

    public String getForsInmCalleAv() {
        return forsInmCalleAv;
    }

    public void setForsInmCalleAv(final String forsInmCalleAv) {
        this.forsInmCalleAv = forsInmCalleAv;
    }

    public String getForsInmNumExtMza() {
        return forsInmNumExtMza;
    }

    public void setForsInmNumExtMza(final String forsInmNumExtMza) {
        this.forsInmNumExtMza = forsInmNumExtMza;
    }

    public String getForsInmNumIntLt() {
        return forsInmNumIntLt;
    }

    public void setForsInmNumIntLt(final String forsInmNumIntLt) {
        this.forsInmNumIntLt = forsInmNumIntLt;
    }

    public String getForsInmColonia() {
        return forsInmColonia;
    }

    public void setForsInmColonia(final String forsInmColonia) {
        this.forsInmColonia = forsInmColonia;
    }

    public String getForsInmPais() {
        return forsInmPais;
    }

    public void setForsInmPais(final String forsInmPais) {
        this.forsInmPais = forsInmPais;
    }

    public String getForsInmEstado() {
        return forsInmEstado;
    }

    public void setForsInmEstado(final String forsInmEstado) {
        this.forsInmEstado = forsInmEstado;
    }

    public String getForsInmCiudad() {
        return forsInmCiudad;
    }

    public void setForsInmCiudad(final String forsInmCiudad) {
        this.forsInmCiudad = forsInmCiudad;
    }

    public String getForsInmDelMun() {
        return forsInmDelMun;
    }

    public void setForsInmDelMun(final String forsInmDelMun) {
        this.forsInmDelMun = forsInmDelMun;
    }

    public BigDecimal getForsInmCp() {
        return forsInmCp;
    }

    public void setForsInmCp(final BigDecimal forsInmCp) {
        this.forsInmCp = forsInmCp;
    }

    public BigDecimal getForsInmSuperficie() {
        return forsInmSuperficie;
    }

    public void setForsInmSuperficie(final BigDecimal forsInmSuperficie) {
        this.forsInmSuperficie = forsInmSuperficie;
    }

    public String getForsInmSubTipo() {
        return forsInmSubTipo;
    }

    public void setForsInmSubTipo(final String forsInmSubTipo) {
        this.forsInmSubTipo = forsInmSubTipo;
    }

    public String getForsInmFecValor() {
        return forsInmFecValor;
    }

    public void setForsInmFecValor(final String forsInmFecValor) {
        this.forsInmFecValor = forsInmFecValor;
    }

    public String getForsInmClaveCatas() {
        return forsInmClaveCatas;
    }

    public void setForsInmClaveCatas(final String forsInmClaveCatas) {
        this.forsInmClaveCatas = forsInmClaveCatas;
    }

    public String getForsInmCuentaPred() {
        return forsInmCuentaPred;
    }

    public void setForsInmCuentaPred(final String forsInmCuentaPred) {
        this.forsInmCuentaPred = forsInmCuentaPred;
    }

    public BigDecimal getForsInmPenPredial() {
        return forsInmPenPredial;
    }

    public void setForsInmPenPredial(final BigDecimal forsInmPenPredial) {
        this.forsInmPenPredial = forsInmPenPredial;
    }

    public BigDecimal getForsInmEmbargo() {
        return forsInmEmbargo;
    }

    public void setForsInmEmbargo(final BigDecimal forsInmEmbargo) {
        this.forsInmEmbargo = forsInmEmbargo;
    }

    public BigDecimal getForsInmImpTotInm() {
        return forsInmImpTotInm;
    }

    public void setForsInmImpTotInm(final BigDecimal forsInmImpTotInm) {
        this.forsInmImpTotInm = forsInmImpTotInm;
    }

    public BigDecimal getForsMueCsc() {
        return forsMueCsc;
    }

    public void setForsMueCsc(final BigDecimal forsMueCsc) {
        this.forsMueCsc = forsMueCsc;
    }

    public String getForsMueTipoDoc() {
        return forsMueTipoDoc;
    }

    public void setForsMueTipoDoc(final String forsMueTipoDoc) {
        this.forsMueTipoDoc = forsMueTipoDoc;
    }

    public String getForsMueTipoCopia() {
        return forsMueTipoCopia;
    }

    public void setForsMueTipoCopia(final String forsMueTipoCopia) {
        this.forsMueTipoCopia = forsMueTipoCopia;
    }

    public String getForsMueNumeroDoc() {
        return forsMueNumeroDoc;
    }

    public void setForsMueNumeroDoc(final String forsMueNumeroDoc) {
        this.forsMueNumeroDoc = forsMueNumeroDoc;
    }

    public String getForsMueFechaExp() {
        return forsMueFechaExp;
    }

    public void setForsMueFechaExp(final String forsMueFechaExp) {
        this.forsMueFechaExp = forsMueFechaExp;
    }

    public String getForsMueFechaVenc() {
        return forsMueFechaVenc;
    }

    public void setForsMueFechaVenc(final String forsMueFechaVenc) {
        this.forsMueFechaVenc = forsMueFechaVenc;
    }

    public String getForsMueMoneda() {
        return forsMueMoneda;
    }

    public void setForsMueMoneda(final String forsMueMoneda) {
        this.forsMueMoneda = forsMueMoneda;
    }

    public BigDecimal getForsMueValorDoc() {
        return forsMueValorDoc;
    }

    public void setForsMueValorDoc(final BigDecimal forsMueValorDoc) {
        this.forsMueValorDoc = forsMueValorDoc;
    }

    public String getForsMueDescDoc() {
        return forsMueDescDoc;
    }

    public void setForsMueDescDoc(final String forsMueDescDoc) {
        this.forsMueDescDoc = forsMueDescDoc;
    }

    public String getForsMueQuienExpDocu() {
        return forsMueQuienExpDocu;
    }

    public void setForsMueQuienExpDocu(final String forsMueQuienExpDocu) {
        this.forsMueQuienExpDocu = forsMueQuienExpDocu;
    }

    public String getForsMueFavExpDoc() {
        return forsMueFavExpDoc;
    }

    public void setForsMueFavExpDoc(final String forsMueFavExpDoc) {
        this.forsMueFavExpDoc = forsMueFavExpDoc;
    }

    public String getForsMueEndoso() {
        return forsMueEndoso;
    }

    public void setForsMueEndoso(final String forsMueEndoso) {
        this.forsMueEndoso = forsMueEndoso;
    }

    public String getForsMueFecEndoso() {
        return forsMueFecEndoso;
    }

    public void setForsMueFecEndoso(final String forsMueFecEndoso) {
        this.forsMueFecEndoso = forsMueFecEndoso;
    }

    public String getForsMueFecEntrada() {
        return forsMueFecEntrada;
    }

    public void setForsMueFecEntrada(final String forsMueFecEntrada) {
        this.forsMueFecEntrada = forsMueFecEntrada;
    }

    public String getForsMueFecSalida() {
        return forsMueFecSalida;
    }

    public void setForsMueFecSalida(final String forsMueFecSalida) {
        this.forsMueFecSalida = forsMueFecSalida;
    }

    public String getForsMueEstatus() {
        return forsMueEstatus;
    }

    public void setForsMueEstatus(final String forsMueEstatus) {
        this.forsMueEstatus = forsMueEstatus;
    }

    public BigDecimal getForsMueImpTotMueb() {
        return forsMueImpTotMueb;
    }

    public void setForsMueImpTotMueb(final BigDecimal forsMueImpTotMueb) {
        this.forsMueImpTotMueb = forsMueImpTotMueb;
    }

    public BigDecimal getForsDerCsc() {
        return forsDerCsc;
    }

    public void setForsDerCsc(final BigDecimal forsDerCsc) {
        this.forsDerCsc = forsDerCsc;
    }

    public String getForsDerAdministrador() {
        return forsDerAdministrador;
    }

    public void setForsDerAdministrador(final String forsDerAdministrador) {
        this.forsDerAdministrador = forsDerAdministrador;
    }

    public BigDecimal getForsDerNoCedito() {
        return forsDerNoCedito;
    }

    public void setForsDerNoCedito(final BigDecimal forsDerNoCedito) {
        this.forsDerNoCedito = forsDerNoCedito;
    }

    public String getForsDerNomAcredi() {
        return forsDerNomAcredi;
    }

    public void setForsDerNomAcredi(final String forsDerNomAcredi) {
        this.forsDerNomAcredi = forsDerNomAcredi;
    }

    public BigDecimal getForsDerImporte() {
        return forsDerImporte;
    }

    public void setForsDerImporte(final BigDecimal forsDerImporte) {
        this.forsDerImporte = forsDerImporte;
    }

    public String getForsDerMoneda() {
        return forsDerMoneda;
    }

    public void setForsDerMoneda(final String forsDerMoneda) {
        this.forsDerMoneda = forsDerMoneda;
    }

    public String getForsDerEstatusCred() {
        return forsDerEstatusCred;
    }

    public void setForsDerEstatusCred(final String forsDerEstatusCred) {
        this.forsDerEstatusCred = forsDerEstatusCred;
    }

    public String getForsDerFecValor() {
        return forsDerFecValor;
    }

    public void setForsDerFecValor(final String forsDerFecValor) {
        this.forsDerFecValor = forsDerFecValor;
    }

    public String getForsDerDirInmueble() {
        return forsDerDirInmueble;
    }

    public void setForsDerDirInmueble(final String forsDerDirInmueble) {
        this.forsDerDirInmueble = forsDerDirInmueble;
    }

    public String getForsDerEstado() {
        return forsDerEstado;
    }

    public void setForsDerEstado(final String forsDerEstado) {
        this.forsDerEstado = forsDerEstado;
    }

    public String getForsDerEstatus() {
        return forsDerEstatus;
    }

    public void setForsDerEstatus(final String forsDerEstatus) {
        this.forsDerEstatus = forsDerEstatus;
    }

    public BigDecimal getForsDerImpTotDer() {
        return forsDerImpTotDer;
    }

    public void setForsDerImpTotDer(final BigDecimal forsDerImpTotDer) {
        this.forsDerImpTotDer = forsDerImpTotDer;
    }

}

