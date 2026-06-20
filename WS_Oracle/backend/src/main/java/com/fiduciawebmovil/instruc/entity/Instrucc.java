package com.fiduciawebmovil.instruc.entity;

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
@Table(name = "INSTRUCC")
@NoArgsConstructor
public class Instrucc {

    @Id
    @Column(nullable = false, updatable = false)
    private Long insNumFolioInst;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal insNumContrato;

    @Column(precision = 10, scale = 2)
    private BigDecimal insSubContrato;

    @Column(length = 1000)
    private String insTxtComentario;

    @Column(length = 35)
    private String insCveTipoInstr;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal insNumMiembro;

    @Column(length = 50)
    private String insNomMiembro;

    @Column(nullable = false, precision = 4, scale = 2)
    private BigDecimal insAnoAltaReg;

    @Column(nullable = false, precision = 2, scale = 2)
    private BigDecimal insMesAltaReg;

    @Column(nullable = false, precision = 2, scale = 2)
    private BigDecimal insDiaAltaReg;

    @Column(nullable = false, precision = 4, scale = 2)
    private BigDecimal insAnoUltMod;

    @Column(nullable = false, precision = 2, scale = 2)
    private BigDecimal insMesUltMod;

    @Column(nullable = false, precision = 2, scale = 2)
    private BigDecimal insDiaUltMod;

    @Column(length = 25)
    private String insCveStInstruc;

    @Column(length = 25)
    private String insCveStCont;

    @Column(nullable = true)
    private OffsetDateTime insFechaContable;

     @Column(nullable = true)
    private OffsetDateTime sesFecha;

    @Column
    private Boolean sesTipo;

    @Column(length = 25)
    private String acuId;

    @Column(length = 5)
    private String insNumOper;

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

    public BigDecimal getInsSubContrato() {
        return insSubContrato;
    }

    public void setInsSubContrato(final BigDecimal insSubContrato) {
        this.insSubContrato = insSubContrato;
    }

    public String getInsTxtComentario() {
        return insTxtComentario;
    }

    public void setInsTxtComentario(final String insTxtComentario) {
        this.insTxtComentario = insTxtComentario;
    }

    public String getInsCveTipoInstr() {
        return insCveTipoInstr;
    }

    public void setInsCveTipoInstr(final String insCveTipoInstr) {
        this.insCveTipoInstr = insCveTipoInstr;
    }

    public BigDecimal getInsNumMiembro() {
        return insNumMiembro;
    }

    public void setInsNumMiembro(final BigDecimal insNumMiembro) {
        this.insNumMiembro = insNumMiembro;
    }

    public String getInsNomMiembro() {
        return insNomMiembro;
    }

    public void setInsNomMiembro(final String insNomMiembro) {
        this.insNomMiembro = insNomMiembro;
    }

    public BigDecimal getInsAnoAltaReg() {
        return insAnoAltaReg;
    }

    public void setInsAnoAltaReg(final BigDecimal insAnoAltaReg) {
        this.insAnoAltaReg = insAnoAltaReg;
    }

    public BigDecimal getInsMesAltaReg() {
        return insMesAltaReg;
    }

    public void setInsMesAltaReg(final BigDecimal insMesAltaReg) {
        this.insMesAltaReg = insMesAltaReg;
    }

    public BigDecimal getInsDiaAltaReg() {
        return insDiaAltaReg;
    }

    public void setInsDiaAltaReg(final BigDecimal insDiaAltaReg) {
        this.insDiaAltaReg = insDiaAltaReg;
    }

    public BigDecimal getInsAnoUltMod() {
        return insAnoUltMod;
    }

    public void setInsAnoUltMod(final BigDecimal insAnoUltMod) {
        this.insAnoUltMod = insAnoUltMod;
    }

    public BigDecimal getInsMesUltMod() {
        return insMesUltMod;
    }

    public void setInsMesUltMod(final BigDecimal insMesUltMod) {
        this.insMesUltMod = insMesUltMod;
    }

    public BigDecimal getInsDiaUltMod() {
        return insDiaUltMod;
    }

    public void setInsDiaUltMod(final BigDecimal insDiaUltMod) {
        this.insDiaUltMod = insDiaUltMod;
    }

    public String getInsCveStInstruc() {
        return insCveStInstruc;
    }

    public void setInsCveStInstruc(final String insCveStInstruc) {
        this.insCveStInstruc = insCveStInstruc;
    }

    public String getInsCveStCont() {
        return insCveStCont;
    }

    public void setInsCveStCont(final String insCveStCont) {
        this.insCveStCont = insCveStCont;
    }

    public OffsetDateTime getInsFechaContable() {
        return insFechaContable;
    }

    public void setInsFechaContable(final OffsetDateTime insFechaContable) {
        this.insFechaContable = insFechaContable;
    }

    public OffsetDateTime getSesFecha() {
        return sesFecha;
    }

    public void setSesFecha(final OffsetDateTime sesFecha) {
        this.sesFecha = sesFecha;
    }

    public Boolean getSesTipo() {
        return sesTipo;
    }

    public void setSesTipo(final Boolean sesTipo) {
        this.sesTipo = sesTipo;
    }

    public String getAcuId() {
        return acuId;
    }

    public void setAcuId(final String acuId) {
        this.acuId = acuId;
    }

    public String getInsNumOper() {
        return insNumOper;
    }

    public void setInsNumOper(final String insNumOper) {
        this.insNumOper = insNumOper;
    }

}
