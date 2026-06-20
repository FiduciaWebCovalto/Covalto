package com.fiduciawebmovil.cartera.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class CarteraId  implements Serializable{
    @Column(nullable = false, length = 25)
    private Long carNumContrato;

    public CarteraId(Long carNumContrato, String carCvePersFid, BigDecimal carNumPersFid, String carCveTipoHono) {
        this.carNumContrato = carNumContrato;
        this.carCvePersFid = carCvePersFid;
        this.carNumPersFid = carNumPersFid;
        this.carCveTipoHono = carCveTipoHono;
    }

    public CarteraId() {
    }

    @Column(nullable = false, length = 25)
    private String carCvePersFid;

    public Long getCarNumContrato() {
        return carNumContrato;
    }

    public void setCarNumContrato(Long carNumContrato) {
        this.carNumContrato = carNumContrato;
    }

    public String getCarCvePersFid() {
        return carCvePersFid;
    }

    public void setCarCvePersFid(String carCvePersFid) {
        this.carCvePersFid = carCvePersFid;
    }

    public BigDecimal getCarNumPersFid() {
        return carNumPersFid;
    }

    public void setCarNumPersFid(BigDecimal carNumPersFid) {
        this.carNumPersFid = carNumPersFid;
    }

    public String getCarCveTipoHono() {
        return carCveTipoHono;
    }

    public void setCarCveTipoHono(String carCveTipoHono) {
        this.carCveTipoHono = carCveTipoHono;
    }

    @Column(nullable = false, precision = 10, scale = 0)
    private BigDecimal carNumPersFid;

    @Column(nullable = false, length = 25)
    private String carCveTipoHono;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarteraId that = (CarteraId) o;
        return Objects.equals(carNumContrato, that.carNumContrato) &&
         Objects.equals(carCvePersFid, that.carCvePersFid)&&
         Objects.equals(carNumPersFid, that.carNumPersFid) &&
         Objects.equals(carCveTipoHono, that.carCveTipoHono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carNumContrato, carCvePersFid,
            carNumPersFid,carCveTipoHono
        );
    }
}
