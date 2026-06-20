package com.fiduciawebmovil.pagoshon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;



@Embeddable
public class PagoshonId  implements Serializable{
    @Column(nullable = false, updatable = false, length = 25)
    private String pagCveTipoHono;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumContrato;

    @Column(nullable = false, length = 25)
    private String pagCvePersFid;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumPersFid;

    @Column(nullable = false, length = 10)
    private String pagFecCalcHono;

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal pagNumSecuencial;

    @Column(nullable = false, length = 10)
    private String pagFecPago;

            @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PagoshonId that = (PagoshonId) o;
        return Objects.equals(pagCveTipoHono, that.pagCveTipoHono) &&
         Objects.equals(pagNumContrato, that.pagNumContrato)&&
         Objects.equals(pagCvePersFid, that.pagCvePersFid) &&
         Objects.equals(pagNumPersFid, that.pagNumPersFid)&&
         Objects.equals(pagFecCalcHono, that.pagFecCalcHono) &&
         Objects.equals(pagNumSecuencial, that.pagNumSecuencial) &&
         Objects.equals(pagFecPago, that.pagFecPago);
    }

     @Override
    public int hashCode() {
        return Objects.hash(pagCveTipoHono, pagNumContrato,
            pagCvePersFid, pagNumPersFid,pagFecCalcHono, pagNumSecuencial,
            pagFecPago
        );
    }

     public PagoshonId(String pagCveTipoHono, BigDecimal pagNumContrato, String pagCvePersFid, BigDecimal pagNumPersFid,
            String pagFecCalcHono, BigDecimal pagNumSecuencial, String pagFecPago) {
        this.pagCveTipoHono = pagCveTipoHono;
        this.pagNumContrato = pagNumContrato;
        this.pagCvePersFid = pagCvePersFid;
        this.pagNumPersFid = pagNumPersFid;
        this.pagFecCalcHono = pagFecCalcHono;
        this.pagNumSecuencial = pagNumSecuencial;
        this.pagFecPago = pagFecPago;
    }

     public PagoshonId() {
    }

     public String getPagCveTipoHono() {
         return pagCveTipoHono;
     }

     public void setPagCveTipoHono(String pagCveTipoHono) {
         this.pagCveTipoHono = pagCveTipoHono;
     }

     public BigDecimal getPagNumContrato() {
         return pagNumContrato;
     }

     public void setPagNumContrato(BigDecimal pagNumContrato) {
         this.pagNumContrato = pagNumContrato;
     }

     public String getPagCvePersFid() {
         return pagCvePersFid;
     }

     public void setPagCvePersFid(String pagCvePersFid) {
         this.pagCvePersFid = pagCvePersFid;
     }

     public BigDecimal getPagNumPersFid() {
         return pagNumPersFid;
     }

     public void setPagNumPersFid(BigDecimal pagNumPersFid) {
         this.pagNumPersFid = pagNumPersFid;
     }

     public String getPagFecCalcHono() {
         return pagFecCalcHono;
     }

     public void setPagFecCalcHono(String pagFecCalcHono) {
         this.pagFecCalcHono = pagFecCalcHono;
     }

     public BigDecimal getPagNumSecuencial() {
         return pagNumSecuencial;
     }

     public void setPagNumSecuencial(BigDecimal pagNumSecuencial) {
         this.pagNumSecuencial = pagNumSecuencial;
     }

     public String getPagFecPago() {
         return pagFecPago;
     }

     public void setPagFecPago(String pagFecPago) {
         this.pagFecPago = pagFecPago;
     }
}
