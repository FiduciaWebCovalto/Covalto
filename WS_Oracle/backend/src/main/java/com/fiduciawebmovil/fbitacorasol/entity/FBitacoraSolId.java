package com.fiduciawebmovil.fbitacorasol.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import  java.util.Objects;


@Embeddable
public class FBitacoraSolId  implements Serializable {

    private Long insNumContrato;

    @Column(nullable = false, precision = 10, scale = 2)
    private Long insMumFolioInst;

    @Column(nullable = false, precision = 2, scale = 2)
    private Long fbisNumEtapa;

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FBitacoraSolId that = (FBitacoraSolId) o;
        return Objects.equals(insNumContrato, that.insNumContrato) &&
         Objects.equals(insMumFolioInst, that.insMumFolioInst)&&
         Objects.equals(fbisNumEtapa, that.fbisNumEtapa);
    }

    public FBitacoraSolId(Long insNumContrato, Long insMumFolioInst, Long fbisNumEtapa) {
            this.insNumContrato = insNumContrato;
            this.insMumFolioInst = insMumFolioInst;
            this.fbisNumEtapa = fbisNumEtapa;
        }

    public FBitacoraSolId() {
        }

    public Long getInsNumContrato() {
            return insNumContrato;
        }

        public void setInsNumContrato(Long insNumContrato) {
            this.insNumContrato = insNumContrato;
        }

        public Long getInsMumFolioInst() {
            return insMumFolioInst;
        }

        public void setInsMumFolioInst(Long insMumFolioInst) {
            this.insMumFolioInst = insMumFolioInst;
        }

        public Long getFbisNumEtapa() {
            return fbisNumEtapa;
        }

        public void setFbisNumEtapa(Long fbisNumEtapa) {
            this.fbisNumEtapa = fbisNumEtapa;
        }

    @Override
    public int hashCode() {
        return Objects.hash(insNumContrato, insMumFolioInst,
            fbisNumEtapa
        );
    }


}
