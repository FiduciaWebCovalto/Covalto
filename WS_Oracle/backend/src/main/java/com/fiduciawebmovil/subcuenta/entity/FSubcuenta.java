package com.fiduciawebmovil.subcuenta.entity;

import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.posicion.entity.PosicionId;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "f_subcuenta")
@NoArgsConstructor
public class FSubcuenta {

    @EmbeddedId
    private FSubcuentaId id;

    @Column(length = 500)
    private String fsctNombreSubCuenta;

    @Column(length = 25)
    private String fsctStatus;


    public String getFsctNombreSubCuenta() {
        return fsctNombreSubCuenta;
    }

    public FSubcuentaId getId() {
        return id;
    }

    public void setId(FSubcuentaId id) {
        this.id = id;
    }

    public void setFsctNombreSubCuenta(final String fsctNombreSubCuenta) {
        this.fsctNombreSubCuenta = fsctNombreSubCuenta;
    }

    public String getFsctStatus() {
        return fsctStatus;
    }

    public void setFsctStatus(final String fsctStatus) {
        this.fsctStatus = fsctStatus;
    }

}
