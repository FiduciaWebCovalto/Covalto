package mx.com.inscitech.clients.domain;

import java.math.BigDecimal;

public class FBitacoraSolDTO {
    private Long insNumContrato;

    
    private BigDecimal insMumFolioInst;

    private BigDecimal fbisNumEtapa;
    
    public Long getInsNumContrato() {
        return insNumContrato;
    }

    public void setInsNumContrato(final Long insNumContrato) {
        this.insNumContrato = insNumContrato;
    }

    public BigDecimal getInsMumFolioInst() {
        return insMumFolioInst;
    }

    public FBitacoraSolDTO(Long insNumContrato, BigDecimal insMumFolioInst, BigDecimal fbisNumEtapa) {
        this.insNumContrato = insNumContrato;
        this.insMumFolioInst = insMumFolioInst;
        this.fbisNumEtapa = fbisNumEtapa;
    }

    public void setInsMumFolioInst(final BigDecimal insMumFolioInst) {
        this.insMumFolioInst = insMumFolioInst;
    }

    public BigDecimal getFbisNumEtapa() {
        return fbisNumEtapa;
    }

    public void setFbisNumEtapa(final BigDecimal fbisNumEtapa) {
        this.fbisNumEtapa = fbisNumEtapa;
    }
}
