package com.fiduciawebmovil.traspaso.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


@Entity
@Table(name = "f_traspaso")
@NoArgsConstructor
public class FTraspaso {

    @Id
    private Long ftspIdTraspaso;

    @Column(precision = 16, scale = 2)
    private BigDecimal ftspImporteTraspaso;

    @Column(precision = 11, scale = 2)
    private BigDecimal fcinIdCtoInversionOrigen;

    @Column(precision = 11, scale = 2)
    private BigDecimal fcinIdCtoInversionDestino;

    @Column(length = 25)
    private String ftspStatus;

    @Column(precision = 10, scale = 2)
    private BigDecimal ffidIdFideicomiso;

    @Column(precision = 16, scale = 2)
    private BigDecimal ftspTipoCambioProv;

    @Column(precision = 16, scale = 2)
    private BigDecimal ftspTipoCambioFirme;

    @Column(nullable = false)
    private OffsetDateTime ftspFecha;

    @Column(precision = 10, scale = 2)
    private BigDecimal ftspSubctaDestino;

    @Column(precision = 10, scale = 2)
    private BigDecimal ftspSubctaOrigen;

    @Column(length = 500)
    private String ftspConcepto;

    public Long getFtspIdTraspaso() {
        return ftspIdTraspaso;
    }

    public void setFtspIdTraspaso(final Long ftspIdTraspaso) {
        this.ftspIdTraspaso = ftspIdTraspaso;
    }

    public BigDecimal getFtspImporteTraspaso() {
        return ftspImporteTraspaso;
    }

    public void setFtspImporteTraspaso(final BigDecimal ftspImporteTraspaso) {
        this.ftspImporteTraspaso = ftspImporteTraspaso;
    }

    public BigDecimal getFcinIdCtoInversionOrigen() {
        return fcinIdCtoInversionOrigen;
    }

    public void setFcinIdCtoInversionOrigen(final BigDecimal fcinIdCtoInversionOrigen) {
        this.fcinIdCtoInversionOrigen = fcinIdCtoInversionOrigen;
    }

    public BigDecimal getFcinIdCtoInversionDestino() {
        return fcinIdCtoInversionDestino;
    }

    public void setFcinIdCtoInversionDestino(final BigDecimal fcinIdCtoInversionDestino) {
        this.fcinIdCtoInversionDestino = fcinIdCtoInversionDestino;
    }

    public String getFtspStatus() {
        return ftspStatus;
    }

    public void setFtspStatus(final String ftspStatus) {
        this.ftspStatus = ftspStatus;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return ffidIdFideicomiso;
    }

    public void setFfidIdFideicomiso(final BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFtspTipoCambioProv() {
        return ftspTipoCambioProv;
    }

    public void setFtspTipoCambioProv(final BigDecimal ftspTipoCambioProv) {
        this.ftspTipoCambioProv = ftspTipoCambioProv;
    }

    public BigDecimal getFtspTipoCambioFirme() {
        return ftspTipoCambioFirme;
    }

    public void setFtspTipoCambioFirme(final BigDecimal ftspTipoCambioFirme) {
        this.ftspTipoCambioFirme = ftspTipoCambioFirme;
    }

    public OffsetDateTime getFtspFecha() {
        return ftspFecha;
    }

    public void setFtspFecha(final OffsetDateTime ftspFecha) {
        this.ftspFecha = ftspFecha;
    }

    public BigDecimal getFtspSubctaDestino() {
        return ftspSubctaDestino;
    }

    public void setFtspSubctaDestino(final BigDecimal ftspSubctaDestino) {
        this.ftspSubctaDestino = ftspSubctaDestino;
    }

    public BigDecimal getFtspSubctaOrigen() {
        return ftspSubctaOrigen;
    }

    public void setFtspSubctaOrigen(final BigDecimal ftspSubctaOrigen) {
        this.ftspSubctaOrigen = ftspSubctaOrigen;
    }

    public String getFtspConcepto() {
        return ftspConcepto;
    }

    public void setFtspConcepto(final String ftspConcepto) {
        this.ftspConcepto = ftspConcepto;
    }

}
