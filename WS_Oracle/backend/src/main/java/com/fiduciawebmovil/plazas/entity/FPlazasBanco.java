package com.fiduciawebmovil.plazas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Table(name = "f_plazas_banco")
@Entity
public class FPlazasBanco {

    @EmbeddedId
    private FPlazasBancoId id;

    public FPlazasBancoId getId() {
        return id;
    }

    public void setId(FPlazasBancoId id) {
        this.id = id;
    }

    @Column
    private String fplbNombrePlaza;

    public String getFplbNombrePlaza() {
        return fplbNombrePlaza;
    }

    public void setFplbNombrePlaza(final String fplbNombrePlaza) {
        this.fplbNombrePlaza = fplbNombrePlaza;
    }

}
