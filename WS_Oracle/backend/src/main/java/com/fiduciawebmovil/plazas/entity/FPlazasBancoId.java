package com.fiduciawebmovil.plazas.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

import  java.util.Objects;


@Embeddable
public class FPlazasBancoId implements Serializable{

   
        public FPlazasBancoId(Long fplbIdBanco, BigDecimal fplbIdPlaza) {
        this.fplbIdBanco = fplbIdBanco;
        this.fplbIdPlaza = fplbIdPlaza;
    }

        public FPlazasBancoId() {
    }

        @Column(precision = 10, scale = 0)
    private Long fplbIdBanco;

    public Long getFplbIdBanco() {
            return fplbIdBanco;
        }

        public void setFplbIdBanco(Long fplbIdBanco) {
            this.fplbIdBanco = fplbIdBanco;
        }

        public BigDecimal getFplbIdPlaza() {
            return fplbIdPlaza;
        }

        public void setFplbIdPlaza(BigDecimal fplbIdPlaza) {
            this.fplbIdPlaza = fplbIdPlaza;
        }

    @Column(precision = 10, scale = 0)
    private BigDecimal fplbIdPlaza;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FPlazasBancoId that = (FPlazasBancoId) o;
        return Objects.equals(fplbIdBanco, that.fplbIdBanco) &&
         Objects.equals(fplbIdPlaza, that.fplbIdPlaza) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fplbIdBanco, fplbIdPlaza);
    }
  
}
