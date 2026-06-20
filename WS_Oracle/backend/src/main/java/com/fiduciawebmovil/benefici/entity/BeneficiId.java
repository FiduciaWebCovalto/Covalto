package com.fiduciawebmovil.benefici.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import  java.util.Objects;


@Embeddable
public class BeneficiId  implements Serializable {


    public BeneficiId() {
    }

    public BeneficiId(Long benBeneficiario, Long benNumContrato) {
        this.benBeneficiario = benBeneficiario;
        this.benNumContrato = benNumContrato;
    }

    private Long benBeneficiario;
    public Long getBenBeneficiario() {
        return benBeneficiario;
    }

    public void setBenBeneficiario(Long benBeneficiario) {
        this.benBeneficiario = benBeneficiario;
    }

    public Long getBenNumContrato() {
        return benNumContrato;
    }

    public void setBenNumContrato(Long benNumContrato) {
        this.benNumContrato = benNumContrato;
    }

    private Long benNumContrato;


        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeneficiId that = (BeneficiId) o;
        return Objects.equals(benBeneficiario, that.benNumContrato) &&
         Objects.equals(benBeneficiario, that.benNumContrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(benBeneficiario, benNumContrato);
    }


}
