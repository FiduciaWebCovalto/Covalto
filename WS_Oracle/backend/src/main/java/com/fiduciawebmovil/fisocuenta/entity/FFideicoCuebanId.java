package com.fiduciawebmovil.fisocuenta.entity;

import jakarta.persistence.*;
import java.io.Serializable;

import  java.util.Objects;


@Embeddable
public class FFideicoCuebanId implements Serializable{

    public FFideicoCuebanId(Long ffidIdFideicomiso, String fcbaClabeCba) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
        this.fcbaClabeCba = fcbaClabeCba;
    }

    @Column(precision = 10, scale = 0)
    private Long ffidIdFideicomiso;
    @Column(nullable = false, updatable = false, length = 20)
    private String fcbaClabeCba;

        public FFideicoCuebanId() {
    }

        public Long getFfidIdFideicomiso() {
        return ffidIdFideicomiso;
    }

    public void setFfidIdFideicomiso(Long ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public String getFcbaClabeCba() {
        return fcbaClabeCba;
    }

    public void setFcbaClabeCba(String fcbaClabeCba) {
        this.fcbaClabeCba = fcbaClabeCba;
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FFideicoCuebanId that = (FFideicoCuebanId) o;
        return Objects.equals(ffidIdFideicomiso, that.ffidIdFideicomiso) &&
         Objects.equals(fcbaClabeCba, that.fcbaClabeCba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ffidIdFideicomiso, fcbaClabeCba);
    }
  
}
