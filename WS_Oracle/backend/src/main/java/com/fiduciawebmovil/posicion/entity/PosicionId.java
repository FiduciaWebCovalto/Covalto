package com.fiduciawebmovil.posicion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.terceros.entity.TercerosId;
import  java.util.Objects;


@Embeddable
public class PosicionId implements Serializable{

   
        @Column(precision = 10, scale = 0)
    private Long posNumContrato;

    @Column(precision = 10, scale = 0)
    private BigDecimal posSubContrato;

    @Column(precision = 10, scale = 0)
    private BigDecimal posNumEntidFin;

    @Column(precision = 10, scale = 0)
    private Long posContratoInter;

    @Column(precision = 10, scale = 0)
    private BigDecimal posCveTipoMerca;

    @Column(precision = 10, scale = 0)
    private BigDecimal posNumInstrume;

    @Column(precision = 10, scale = 0)
    private BigDecimal posNumSecEmis;


        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PosicionId that = (PosicionId) o;
        return Objects.equals(posNumContrato, that.posNumContrato) &&
         Objects.equals(posSubContrato, that.posSubContrato) &&
         Objects.equals(posNumEntidFin, that.posNumEntidFin) &&
         Objects.equals(posContratoInter, that.posContratoInter) &&
         Objects.equals(posCveTipoMerca, that.posCveTipoMerca) &&
         Objects.equals(posNumInstrume, that.posNumInstrume) &&
         Objects.equals(posNumSecEmis, that.posNumSecEmis);
    }


    public Long getPosNumContrato() {
            return posNumContrato;
        }


        public PosicionId(Long posNumContrato, BigDecimal posSubContrato, BigDecimal posNumEntidFin,
            Long posContratoInter, BigDecimal posCveTipoMerca, BigDecimal posNumInstrume,
            BigDecimal posNumSecEmis) {
        this.posNumContrato = posNumContrato;
        this.posSubContrato = posSubContrato;
        this.posNumEntidFin = posNumEntidFin;
        this.posContratoInter = posContratoInter;
        this.posCveTipoMerca = posCveTipoMerca;
        this.posNumInstrume = posNumInstrume;
        this.posNumSecEmis = posNumSecEmis;
    }


        public PosicionId() {
        }


        public void setPosNumContrato(Long posNumContrato) {
            this.posNumContrato = posNumContrato;
        }


        public BigDecimal getPosSubContrato() {
            return posSubContrato;
        }


        public void setPosSubContrato(BigDecimal posSubContrato) {
            this.posSubContrato = posSubContrato;
        }


        public BigDecimal getPosNumEntidFin() {
            return posNumEntidFin;
        }


        public void setPosNumEntidFin(BigDecimal posNumEntidFin) {
            this.posNumEntidFin = posNumEntidFin;
        }


        public Long getPosContratoInter() {
            return posContratoInter;
        }


        public void setPosContratoInter(Long posContratoInter) {
            this.posContratoInter = posContratoInter;
        }


        public BigDecimal getPosCveTipoMerca() {
            return posCveTipoMerca;
        }


        public void setPosCveTipoMerca(BigDecimal posCveTipoMerca) {
            this.posCveTipoMerca = posCveTipoMerca;
        }


        public BigDecimal getPosNumInstrume() {
            return posNumInstrume;
        }


        public void setPosNumInstrume(BigDecimal posNumInstrume) {
            this.posNumInstrume = posNumInstrume;
        }


        public BigDecimal getPosNumSecEmis() {
            return posNumSecEmis;
        }


        public void setPosNumSecEmis(BigDecimal posNumSecEmis) {
            this.posNumSecEmis = posNumSecEmis;
        }


    @Override
    public int hashCode() {
        return Objects.hash(posNumContrato, posSubContrato,
            posNumEntidFin, posContratoInter,
            posCveTipoMerca, posNumInstrume,posNumSecEmis);
    }
  
}
