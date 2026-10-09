package com.fiduciawebmovil.unidades.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "f_unidades")
@NoArgsConstructor
public class FUnidades {
    @EmbeddedId
    private FUnidadesId id;

    public FUnidadesId getId() {
        return id;
    }

    public void setId(FUnidadesId id) {
        this.id = id;
    }

    public FUnidades(FUnidadesId id) {
        this.id = id;
    }

    @Column(length = 50)
    private String funiTipo;

    @Column(length = 25)
    private String funiNiveles;

    @Column(length = 50)
    private String funiCalleNum;

    @Column(length = 50)
    private String funiNomColonia;

    @Column(length = 50)
    private String funiNomPoblacion;

    @Column(length = 10)
    private String funiCodigoPostal;

    @Column(precision = 10, scale = 0)
    private BigDecimal funiNumEstado;

    @Column(precision = 10, scale = 0)
    private BigDecimal funiNumPais;

    @Column(length = 300)
    private String funiColindancias;

    @Column(length = 300)
    private String funiMedidas;

    @Column(length = 10)
    private String funiEstacionamiento1;

    @Column(length = 10)
    private String funiSuperficie1;

    @Column(length = 10)
    private String funiEstacionamiento2;

    @Column(length = 10)
    private String funiSuperficie2;

    @Column(length = 10)
    private String funiEstacionamiento3;

    @Column(length = 10)
    private String funiSuperficie3;

    @Column(length = 10)
    private String funiRoofGarden;

    @Column(length = 10)
    private String funiRoofSuperficie;

    @Column(length = 10)
    private String funiSotano;

    @Column(length = 10)
    private String funiSotanoSuperficie;

    @Column(precision = 16, scale = 4)
    private BigDecimal funiIndiviso;

    @Column(precision = 16, scale = 2)
    private BigDecimal funiPrecio;

    @Column(precision = 16, scale = 2)
    private BigDecimal funiPrecioCatastro;

    @Column(precision = 16, scale = 2)
    private BigDecimal funiUltimoAvaluo;

    @Column
    private LocalDate funiFechaUltimoAvaluo;

    @Column(precision = 10, scale = 0)
    private BigDecimal funiMoneda;

    @Column
    private String funiActo1;

    @Column
    private String funiActo2;

    @Column
    private String funiActo3;

    @Column
    private String funiActo4;

    @Column(precision = 10, scale = 0)
    private BigDecimal funiNotario;

    @Column
    private LocalDate funiFechaReversion;

    @Column(length = 50)
    private String funiLocalidadNota;

    @Column(length = 50)
    private String funiNumEscritura;

    @Column(length = 50)
    private String funiFolioReal;

    @Column
    private LocalDate funiFechaTrasladoDominio;

    @Column(length = 25)
    private String funiStatus;

    @Column(precision = 2, scale = 0)
    private BigDecimal funiCveGrahipo;

    @Column(length = 30)
    private String funiNumHipoteca;

    @Column(length = 80,name = "FUNI_A_FAVOR")
    private String funiAFavor;

    public String getFuniTipo() {
        return funiTipo;
    }

    public void setFuniTipo(final String funiTipo) {
        this.funiTipo = funiTipo;
    }

    public String getFuniNiveles() {
        return funiNiveles;
    }

    public void setFuniNiveles(final String funiNiveles) {
        this.funiNiveles = funiNiveles;
    }

    public String getFuniCalleNum() {
        return funiCalleNum;
    }

    public void setFuniCalleNum(final String funiCalleNum) {
        this.funiCalleNum = funiCalleNum;
    }

    public String getFuniNomColonia() {
        return funiNomColonia;
    }

    public void setFuniNomColonia(final String funiNomColonia) {
        this.funiNomColonia = funiNomColonia;
    }

    public String getFuniNomPoblacion() {
        return funiNomPoblacion;
    }

    public void setFuniNomPoblacion(final String funiNomPoblacion) {
        this.funiNomPoblacion = funiNomPoblacion;
    }

    public String getFuniCodigoPostal() {
        return funiCodigoPostal;
    }

    public void setFuniCodigoPostal(final String funiCodigoPostal) {
        this.funiCodigoPostal = funiCodigoPostal;
    }

    public BigDecimal getFuniNumEstado() {
        return funiNumEstado;
    }

    public void setFuniNumEstado(final BigDecimal funiNumEstado) {
        this.funiNumEstado = funiNumEstado;
    }

    public BigDecimal getFuniNumPais() {
        return funiNumPais;
    }

    public void setFuniNumPais(final BigDecimal funiNumPais) {
        this.funiNumPais = funiNumPais;
    }

    public String getFuniColindancias() {
        return funiColindancias;
    }

    public void setFuniColindancias(final String funiColindancias) {
        this.funiColindancias = funiColindancias;
    }

    public String getFuniMedidas() {
        return funiMedidas;
    }

    public void setFuniMedidas(final String funiMedidas) {
        this.funiMedidas = funiMedidas;
    }

    public String getFuniEstacionamiento1() {
        return funiEstacionamiento1;
    }

    public void setFuniEstacionamiento1(final String funiEstacionamiento1) {
        this.funiEstacionamiento1 = funiEstacionamiento1;
    }

    public String getFuniSuperficie1() {
        return funiSuperficie1;
    }

    public void setFuniSuperficie1(final String funiSuperficie1) {
        this.funiSuperficie1 = funiSuperficie1;
    }

    public String getFuniEstacionamiento2() {
        return funiEstacionamiento2;
    }

    public void setFuniEstacionamiento2(final String funiEstacionamiento2) {
        this.funiEstacionamiento2 = funiEstacionamiento2;
    }

    public String getFuniSuperficie2() {
        return funiSuperficie2;
    }

    public void setFuniSuperficie2(final String funiSuperficie2) {
        this.funiSuperficie2 = funiSuperficie2;
    }

    public String getFuniEstacionamiento3() {
        return funiEstacionamiento3;
    }

    public void setFuniEstacionamiento3(final String funiEstacionamiento3) {
        this.funiEstacionamiento3 = funiEstacionamiento3;
    }

    public String getFuniSuperficie3() {
        return funiSuperficie3;
    }

    public void setFuniSuperficie3(final String funiSuperficie3) {
        this.funiSuperficie3 = funiSuperficie3;
    }

    public String getFuniRoofGarden() {
        return funiRoofGarden;
    }

    public void setFuniRoofGarden(final String funiRoofGarden) {
        this.funiRoofGarden = funiRoofGarden;
    }

    public String getFuniRoofSuperficie() {
        return funiRoofSuperficie;
    }

    public void setFuniRoofSuperficie(final String funiRoofSuperficie) {
        this.funiRoofSuperficie = funiRoofSuperficie;
    }

    public String getFuniSotano() {
        return funiSotano;
    }

    public void setFuniSotano(final String funiSotano) {
        this.funiSotano = funiSotano;
    }

    public String getFuniSotanoSuperficie() {
        return funiSotanoSuperficie;
    }

    public void setFuniSotanoSuperficie(final String funiSotanoSuperficie) {
        this.funiSotanoSuperficie = funiSotanoSuperficie;
    }

    public BigDecimal getFuniIndiviso() {
        return funiIndiviso;
    }

    public void setFuniIndiviso(final BigDecimal funiIndiviso) {
        this.funiIndiviso = funiIndiviso;
    }

    public BigDecimal getFuniPrecio() {
        return funiPrecio;
    }

    public void setFuniPrecio(final BigDecimal funiPrecio) {
        this.funiPrecio = funiPrecio;
    }

    public BigDecimal getFuniPrecioCatastro() {
        return funiPrecioCatastro;
    }

    public void setFuniPrecioCatastro(final BigDecimal funiPrecioCatastro) {
        this.funiPrecioCatastro = funiPrecioCatastro;
    }

    public BigDecimal getFuniUltimoAvaluo() {
        return funiUltimoAvaluo;
    }

    public void setFuniUltimoAvaluo(final BigDecimal funiUltimoAvaluo) {
        this.funiUltimoAvaluo = funiUltimoAvaluo;
    }

    public LocalDate getFuniFechaUltimoAvaluo() {
        return funiFechaUltimoAvaluo;
    }

    public void setFuniFechaUltimoAvaluo(final LocalDate funiFechaUltimoAvaluo) {
        this.funiFechaUltimoAvaluo = funiFechaUltimoAvaluo;
    }

    public BigDecimal getFuniMoneda() {
        return funiMoneda;
    }

    public void setFuniMoneda(final BigDecimal funiMoneda) {
        this.funiMoneda = funiMoneda;
    }

    public String getFuniActo1() {
        return funiActo1;
    }

    public void setFuniActo1(final String funiActo1) {
        this.funiActo1 = funiActo1;
    }

    public String getFuniActo2() {
        return funiActo2;
    }

    public void setFuniActo2(final String funiActo2) {
        this.funiActo2 = funiActo2;
    }

    public String getFuniActo3() {
        return funiActo3;
    }

    public void setFuniActo3(final String funiActo3) {
        this.funiActo3 = funiActo3;
    }

    public String getFuniActo4() {
        return funiActo4;
    }

    public void setFuniActo4(final String funiActo4) {
        this.funiActo4 = funiActo4;
    }

    public BigDecimal getFuniNotario() {
        return funiNotario;
    }

    public void setFuniNotario(final BigDecimal funiNotario) {
        this.funiNotario = funiNotario;
    }

    public LocalDate getFuniFechaReversion() {
        return funiFechaReversion;
    }

    public void setFuniFechaReversion(final LocalDate funiFechaReversion) {
        this.funiFechaReversion = funiFechaReversion;
    }

    public String getFuniLocalidadNota() {
        return funiLocalidadNota;
    }

    public void setFuniLocalidadNota(final String funiLocalidadNota) {
        this.funiLocalidadNota = funiLocalidadNota;
    }

    public String getFuniNumEscritura() {
        return funiNumEscritura;
    }

    public void setFuniNumEscritura(final String funiNumEscritura) {
        this.funiNumEscritura = funiNumEscritura;
    }

    public String getFuniFolioReal() {
        return funiFolioReal;
    }

    public void setFuniFolioReal(final String funiFolioReal) {
        this.funiFolioReal = funiFolioReal;
    }

    public LocalDate getFuniFechaTrasladoDominio() {
        return funiFechaTrasladoDominio;
    }

    public void setFuniFechaTrasladoDominio(final LocalDate funiFechaTrasladoDominio) {
        this.funiFechaTrasladoDominio = funiFechaTrasladoDominio;
    }

    public String getFuniStatus() {
        return funiStatus;
    }

    public void setFuniStatus(final String funiStatus) {
        this.funiStatus = funiStatus;
    }

    public BigDecimal getFuniCveGrahipo() {
        return funiCveGrahipo;
    }

    public void setFuniCveGrahipo(final BigDecimal funiCveGrahipo) {
        this.funiCveGrahipo = funiCveGrahipo;
    }

    public String getFuniNumHipoteca() {
        return funiNumHipoteca;
    }

    public void setFuniNumHipoteca(final String funiNumHipoteca) {
        this.funiNumHipoteca = funiNumHipoteca;
    }

    public String getFuniAFavor() {
        return funiAFavor;
    }

    public void setFuniAFavor(String funiAFavor) {
        this.funiAFavor = funiAFavor;
    }


}
