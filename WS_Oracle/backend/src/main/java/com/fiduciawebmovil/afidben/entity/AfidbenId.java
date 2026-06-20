package com.fiduciawebmovil.afidben.entity;
import jakarta.persistence.*;


import java.io.Serializable;
import java.math.BigDecimal;

import  java.util.Objects;



@Embeddable
public class AfidbenId implements Serializable {
    @Column(nullable = false, length = 25)
    private Long afbAnteproyecto;

    @Column(nullable = false, length = 25)
    private String afbCvePersona;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal afbNumFidben;
 
 
    public AfidbenId(Long afbAnteproyecto, String afbCvePersona, BigDecimal afbNumFidben) {
        this.afbAnteproyecto = afbAnteproyecto;
        this.afbCvePersona = afbCvePersona;
        this.afbNumFidben = afbNumFidben;
    }

    public AfidbenId() {
    }

    public Long getAfbAnteproyecto() {
        return afbAnteproyecto;
    }

    public void setAfbAnteproyecto(Long afbAnteproyecto) {
        this.afbAnteproyecto = afbAnteproyecto;
    }

    public String getAfbCvePersona() {
        return afbCvePersona;
    }

    public void setAfbCvePersona(String afbCvePersona) {
        this.afbCvePersona = afbCvePersona;
    }

    public BigDecimal getAfbNumFidben() {
        return afbNumFidben;
    }

    public void setAfbNumFidben(BigDecimal afbNumFidben) {
        this.afbNumFidben = afbNumFidben;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AfidbenId that = (AfidbenId) o;
        return Objects.equals(afbAnteproyecto, that.afbAnteproyecto) &&
         Objects.equals(afbCvePersona, that.afbCvePersona)&&
         Objects.equals(afbNumFidben, that.afbNumFidben);
    }

    @Override
    public int hashCode() {
        return Objects.hash(afbAnteproyecto, afbCvePersona,afbNumFidben);
    }



}
