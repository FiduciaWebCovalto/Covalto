package com.fiduciawebmovil.fideicom.entity;

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
public class FideicomId implements Serializable{

   
    private BigDecimal fidFideicomitente;
    private Long fidNumContrato;

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FideicomId that = (FideicomId) o;
        return Objects.equals(fidFideicomitente, that.fidNumContrato) &&
         Objects.equals(fidFideicomitente, that.fidNumContrato);
    }

    public FideicomId(BigDecimal fidFideicomitente, Long fidNumContrato) {
            this.fidFideicomitente = fidFideicomitente;
            this.fidNumContrato = fidNumContrato;
        }

    public FideicomId() {
    }

    public BigDecimal getFidFideicomitente() {
            return fidFideicomitente;
        }

        public void setFidFideicomitente(BigDecimal fidFideicomitente) {
            this.fidFideicomitente = fidFideicomitente;
        }

        public Long getFidNumContrato() {
            return fidNumContrato;
        }

        public void setFidNumContrato(Long fidNumContrato) {
            this.fidNumContrato = fidNumContrato;
        }

    @Override
    public int hashCode() {
        return Objects.hash(fidFideicomitente, fidNumContrato);
    }
  
}
