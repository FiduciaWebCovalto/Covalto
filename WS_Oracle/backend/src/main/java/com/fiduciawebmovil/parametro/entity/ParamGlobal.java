package com.fiduciawebmovil.parametro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.math.BigDecimal;


@Entity
public class ParamGlobal {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Long paramClave;

    @Column(length = 100)
    private String paramDescripcion;

    @Column(precision = 10, scale = 2)
    private BigDecimal paramValor;

    @Column(length = 1500)
    private String paramValor2;

    public Long getParamClave() {
        return paramClave;
    }

    public void setParamClave(final Long paramClave) {
        this.paramClave = paramClave;
    }

    public String getParamDescripcion() {
        return paramDescripcion;
    }

    public void setParamDescripcion(final String paramDescripcion) {
        this.paramDescripcion = paramDescripcion;
    }

    public BigDecimal getParamValor() {
        return paramValor;
    }

    public void setParamValor(final BigDecimal paramValor) {
        this.paramValor = paramValor;
    }

    public String getParamValor2() {
        return paramValor2;
    }

    public void setParamValor2(final String paramValor2) {
        this.paramValor2 = paramValor2;
    }

}
