package mx.com.inscitech.clients.domain;

import java.math.BigDecimal;


public class FTipoper {


    public String ftopNumOper;

    public Boolean ftopTipoSol;

    public Boolean ftopCveNaturaleza;

    public BigDecimal ftopSecCve;

    public Boolean ftopPagomul;

    public String ftopNombreTipoper;

    public String ftopStatus;

    public BigDecimal ftopAtencionDias;

    public Boolean ftopActoJuridico;

    public Boolean ftopBienes;

    @Override
    public String toString() {
        return  this.ftopNumOper+"-"+this.ftopNombreTipoper;
    }  


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
