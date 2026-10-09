package com.fiduciawebmovil.subcuenta.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;



@Embeddable
public class FSubcuentaId implements Serializable{

    @Column(precision = 10, scale = 0)
    private Long fsctIdSubCuenta;

    
    @Column(precision = 10, scale = 0)
    private Long fsctIdFideicomiso;


    public Long getFsctIdSubCuenta() {
        return fsctIdSubCuenta;
    }

    public Long getFsctIdFideicomiso() {
        return fsctIdFideicomiso;
    }

    public void setFsctIdFideicomiso(Long fsctIdFideicomiso) {
        this.fsctIdFideicomiso = fsctIdFideicomiso;
    }

    public void setFsctIdSubCuenta(final Long fsctIdSubCuenta) {
        this.fsctIdSubCuenta = fsctIdSubCuenta;
    }


}
