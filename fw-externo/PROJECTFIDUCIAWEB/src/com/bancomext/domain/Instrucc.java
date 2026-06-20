package com.bancomext.domain;







import java.math.BigDecimal;
import java.time.OffsetDateTime;



public class Instrucc {

    public Instrucc(){}
    private Long insNumFolioInst;

    
    private BigDecimal insNumContrato;

    
    private BigDecimal insSubContrato;

    
    private String insTxtComentario;

    private String insCveTipoInstr;

    
    private BigDecimal insNumMiembro;

    
    private String insNomMiembro;

    private BigDecimal insAnoAltaReg;

    
    private BigDecimal insMesAltaReg;

    
    private BigDecimal insDiaAltaReg;

    private BigDecimal insAnoUltMod;

    
    private BigDecimal insMesUltMod;

    
    private BigDecimal insDiaUltMod;

    
    private String insCveStInstruc;

    
    private String insCveStCont;

    
    private OffsetDateTime insFechaContable;

    
    private OffsetDateTime sesFecha;

    
    private Boolean sesTipo;

    
    private String acuId;

    private String insNumOper;

    public Instrucc(Long insNumFolioInst, BigDecimal insNumContrato, BigDecimal insSubContrato, String insTxtComentario,
                    String insCveTipoInstr, BigDecimal insNumMiembro, String insNomMiembro, BigDecimal insAnoAltaReg,
                    BigDecimal insMesAltaReg, BigDecimal insDiaAltaReg, BigDecimal insAnoUltMod,
                    BigDecimal insMesUltMod, BigDecimal insDiaUltMod, String insCveStInstruc, String insCveStCont,
                    OffsetDateTime insFechaContable, OffsetDateTime sesFecha, Boolean sesTipo, String acuId,
                    String insNumOper) {
        this.insNumFolioInst = insNumFolioInst;
        this.insNumContrato = insNumContrato;
        this.insSubContrato = insSubContrato;
        this.insTxtComentario = insTxtComentario;
        this.insCveTipoInstr = insCveTipoInstr;
        this.insNumMiembro = insNumMiembro;
        this.insNomMiembro = insNomMiembro;
        this.insAnoAltaReg = insAnoAltaReg;
        this.insMesAltaReg = insMesAltaReg;
        this.insDiaAltaReg = insDiaAltaReg;
        this.insAnoUltMod = insAnoUltMod;
        this.insMesUltMod = insMesUltMod;
        this.insDiaUltMod = insDiaUltMod;
        this.insCveStInstruc = insCveStInstruc;
        this.insCveStCont = insCveStCont;
        this.insFechaContable = insFechaContable;
        this.sesFecha = sesFecha;
        this.sesTipo = sesTipo;
        this.acuId = acuId;
        this.insNumOper = insNumOper;
    }

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
