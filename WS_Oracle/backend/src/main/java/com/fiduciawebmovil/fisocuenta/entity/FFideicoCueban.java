package com.fiduciawebmovil.fisocuenta.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@Table(name = "f_fideico_cueban")
@NoArgsConstructor
public class FFideicoCueban {

    @EmbeddedId
    private FFideicoCuebanId id;
 @Column
    private String fcbaTitular;
    @Column(length = 25)
    private String ffcbStatus;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaClasTipo;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaNumTipo;

    @Column(precision = 10, scale = 0)
    private BigDecimal fcbaSubCuenta;


    public String getFfcbStatus() {
        return ffcbStatus;
    }

    public void setFfcbStatus(final String ffcbStatus) {
        this.ffcbStatus = ffcbStatus;
    }

    public BigDecimal getFcbaClasTipo() {
        return fcbaClasTipo;
    }

    public void setFcbaClasTipo(final BigDecimal fcbaClasTipo) {
        this.fcbaClasTipo = fcbaClasTipo;
    }

    public BigDecimal getFcbaNumTipo() {
        return fcbaNumTipo;
    }

    public void setFcbaNumTipo(final BigDecimal fcbaNumTipo) {
        this.fcbaNumTipo = fcbaNumTipo;
    }

    public BigDecimal getFcbaSubCuenta() {
        return fcbaSubCuenta;
    }

    public void setFcbaSubCuenta(final BigDecimal fcbaSubCuenta) {
        this.fcbaSubCuenta = fcbaSubCuenta;
    }

    public FFideicoCuebanId getId() {
        return id;
    }

    public void setId(FFideicoCuebanId id) {
        this.id = id;
    }

    public String getFcbaTitular() {
        return fcbaTitular;
    }

    public void setFcbaTitular(String fcbaTitular) {
        this.fcbaTitular = fcbaTitular;
    }

}
