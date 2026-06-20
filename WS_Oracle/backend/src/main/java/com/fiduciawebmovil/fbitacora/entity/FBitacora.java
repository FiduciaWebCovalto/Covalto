package com.fiduciawebmovil.fbitacora.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "f_bitacora")
@NoArgsConstructor
public class FBitacora {

    @EmbeddedId
    private FBitacoraId id;

    @Column(nullable = false, updatable = false, length = 500)
    private String fbitDescripcion;


    public String getFbitDescripcion() {
        return fbitDescripcion;
    }

    public void setFbitDescripcion(final String fbitDescripcion) {
        this.fbitDescripcion = fbitDescripcion;
    }

    public FBitacoraId getId() {
        return id;
    }

    public void setId(FBitacoraId id) {
        this.id = id;
    }


}
