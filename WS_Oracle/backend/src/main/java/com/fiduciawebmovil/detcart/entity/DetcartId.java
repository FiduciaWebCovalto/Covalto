package com.fiduciawebmovil.detcart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;



@Embeddable
public class DetcartId  implements Serializable{
   
    @Column(nullable = false, updatable = false, length = 25)
    private String decCveTipoHono;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decNumContrato;

    @Column(nullable = false, length = 25)
    private String decCvePersFid;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decNumPersFid;

    @Column(nullable = false, length = 10)
    
    private String decFecCalcHono;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal decNumSecuencial;


            @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetcartId that = (DetcartId) o;
        return Objects.equals(decCveTipoHono, that.decCveTipoHono) &&
         Objects.equals(decNumContrato, that.decNumContrato)&&
         Objects.equals(decCvePersFid, that.decCvePersFid) &&
         Objects.equals(decNumPersFid, that.decNumPersFid)&&
         Objects.equals(decFecCalcHono, that.decFecCalcHono) &&
         Objects.equals(decNumSecuencial, that.decNumSecuencial);
    }

     @Override
    public int hashCode() {
        return Objects.hash(decCveTipoHono, decNumContrato,
            decCvePersFid, decNumPersFid,
            decFecCalcHono, decNumSecuencial
        );
    }

     public DetcartId() {
    }

     public DetcartId(String decCveTipoHono, BigDecimal decNumContrato, String decCvePersFid, BigDecimal decNumPersFid,
            String decFecCalcHono, BigDecimal decNumSecuencial) {
        this.decCveTipoHono = decCveTipoHono;
        this.decNumContrato = decNumContrato;
        this.decCvePersFid = decCvePersFid;
        this.decNumPersFid = decNumPersFid;
        this.decFecCalcHono = decFecCalcHono;
        this.decNumSecuencial = decNumSecuencial;
    }

     public String getDecCveTipoHono() {
         return decCveTipoHono;
     }

     public void setDecCveTipoHono(String decCveTipoHono) {
         this.decCveTipoHono = decCveTipoHono;
     }

     public BigDecimal getDecNumContrato() {
         return decNumContrato;
     }

     public void setDecNumContrato(BigDecimal decNumContrato) {
         this.decNumContrato = decNumContrato;
     }

     public String getDecCvePersFid() {
         return decCvePersFid;
     }

     public void setDecCvePersFid(String decCvePersFid) {
         this.decCvePersFid = decCvePersFid;
     }

     public BigDecimal getDecNumPersFid() {
         return decNumPersFid;
     }

     public void setDecNumPersFid(BigDecimal decNumPersFid) {
         this.decNumPersFid = decNumPersFid;
     }

     public String getDecFecCalcHono() {
         return decFecCalcHono;
     }

     public void setDecFecCalcHono(String decFecCalcHono) {
         this.decFecCalcHono = decFecCalcHono;
     }

     public BigDecimal getDecNumSecuencial() {
         return decNumSecuencial;
     }

     public void setDecNumSecuencial(BigDecimal decNumSecuencial) {
         this.decNumSecuencial = decNumSecuencial;
     }
}
