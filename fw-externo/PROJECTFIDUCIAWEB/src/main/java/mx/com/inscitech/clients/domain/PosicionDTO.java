package mx.com.inscitech.clients.domain;

import java.math.BigDecimal;

public class PosicionDTO {
    public BigDecimal posSubContrato;

    
    public BigDecimal posNumEntidFin;


    public void setPosSubContrato(BigDecimal posSubContrato) {
        this.posSubContrato = posSubContrato;
    }

    public BigDecimal getPosSubContrato() {
        return posSubContrato;
    }

    public void setPosNumEntidFin(BigDecimal posNumEntidFin) {
        this.posNumEntidFin = posNumEntidFin;
    }

    public BigDecimal getPosNumEntidFin() {
        return posNumEntidFin;
    }

    public void setPosContratoInter(BigDecimal posContratoInter) {
        this.posContratoInter = posContratoInter;
    }

    public BigDecimal getPosContratoInter() {
        return posContratoInter;
    }

    public void setPosCveTipoMerca(BigDecimal posCveTipoMerca) {
        this.posCveTipoMerca = posCveTipoMerca;
    }

    public BigDecimal getPosCveTipoMerca() {
        return posCveTipoMerca;
    }

    public void setPosNumInstrume(BigDecimal posNumInstrume) {
        this.posNumInstrume = posNumInstrume;
    }

    public BigDecimal getPosNumInstrume() {
        return posNumInstrume;
    }

    public void setPosNumSecEmis(BigDecimal posNumSecEmis) {
        this.posNumSecEmis = posNumSecEmis;
    }

    public BigDecimal getPosNumSecEmis() {
        return posNumSecEmis;
    }
    public BigDecimal posContratoInter;

    
    public BigDecimal posCveTipoMerca;

    
    public BigDecimal posNumInstrume;

    
    public BigDecimal posNumSecEmis;
}
