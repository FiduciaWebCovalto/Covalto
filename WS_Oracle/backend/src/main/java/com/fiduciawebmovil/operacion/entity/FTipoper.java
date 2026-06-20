package com.fiduciawebmovil.operacion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;


@Entity
public class FTipoper {

    @Id
    @Column(nullable = false, updatable = false, length = 5)
    private String ftopNumOper;

    @Column
    private Boolean ftopTipoSol;

    @Column
    private Boolean ftopCveNaturaleza;

    @Column(precision = 10, scale = 0)
    private BigDecimal ftopSecCve;

    @Column
    private Boolean ftopPagomul;

    @Column(length = 250)
    private String ftopNombreTipoper;

    @Column(length = 20)
    private String ftopStatus;

    @Column(precision = 10, scale = 0)
    private BigDecimal ftopAtencionDias;

    @Column
    private Boolean ftopActoJuridico;

    @Column
    private Boolean ftopBienes;

    public String getFtopNumOper() {
        return ftopNumOper;
    }

    public void setFtopNumOper(final String ftopNumOper) {
        this.ftopNumOper = ftopNumOper;
    }

    public Boolean getFtopTipoSol() {
        return ftopTipoSol;
    }

    public void setFtopTipoSol(final Boolean ftopTipoSol) {
        this.ftopTipoSol = ftopTipoSol;
    }

    public Boolean getFtopCveNaturaleza() {
        return ftopCveNaturaleza;
    }

    public void setFtopCveNaturaleza(final Boolean ftopCveNaturaleza) {
        this.ftopCveNaturaleza = ftopCveNaturaleza;
    }

    public BigDecimal getFtopSecCve() {
        return ftopSecCve;
    }

    public void setFtopSecCve(final BigDecimal ftopSecCve) {
        this.ftopSecCve = ftopSecCve;
    }

    public Boolean getFtopPagomul() {
        return ftopPagomul;
    }

    public void setFtopPagomul(final Boolean ftopPagomul) {
        this.ftopPagomul = ftopPagomul;
    }

    public String getFtopNombreTipoper() {
        return ftopNombreTipoper;
    }

    public void setFtopNombreTipoper(final String ftopNombreTipoper) {
        this.ftopNombreTipoper = ftopNombreTipoper;
    }

    public String getFtopStatus() {
        return ftopStatus;
    }

    public void setFtopStatus(final String ftopStatus) {
        this.ftopStatus = ftopStatus;
    }

    public BigDecimal getFtopAtencionDias() {
        return ftopAtencionDias;
    }

    public void setFtopAtencionDias(final BigDecimal ftopAtencionDias) {
        this.ftopAtencionDias = ftopAtencionDias;
    }

    public Boolean getFtopActoJuridico() {
        return ftopActoJuridico;
    }

    public void setFtopActoJuridico(final Boolean ftopActoJuridico) {
        this.ftopActoJuridico = ftopActoJuridico;
    }

    public Boolean getFtopBienes() {
        return ftopBienes;
    }

    public void setFtopBienes(final Boolean ftopBienes) {
        this.ftopBienes = ftopBienes;
    }

}
