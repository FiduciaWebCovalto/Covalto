package com.bancomext.domain;

public class FSubcuentaDTO {
    public String fsctNombreSubCuenta;

    public FSubcuenta id;

    @Override
    public String toString() {
        return  this.id.fsctIdSubCuenta+"-"+this.fsctNombreSubCuenta;
    }  

    public void setFsctNombreSubCuenta(String fsctNombreSubCuenta) {
        this.fsctNombreSubCuenta = fsctNombreSubCuenta;
    }

    public String getFsctNombreSubCuenta() {
        return fsctNombreSubCuenta;
    }

    public void setId(FSubcuenta id) {
        this.id = id;
    }

    public FSubcuenta getId() {
        return id;
    }
}
