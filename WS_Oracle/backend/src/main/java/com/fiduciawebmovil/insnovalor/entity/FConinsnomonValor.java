package com.fiduciawebmovil.insnovalor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;




@Entity
@Table(name = "F_CONINSNOMON_VALOR")
@NoArgsConstructor
public class FConinsnomonValor {


    @EmbeddedId
    private FConinsnomonValorId id;

    @Column
    private String convValor;


    public String getConvValor() {
        return convValor;
    }

    public FConinsnomonValorId getId() {
        return id;
    }

    public void setId(FConinsnomonValorId id) {
        this.id = id;
    }

    public void setConvValor(final String convValor) {
        this.convValor = convValor;
    }

}
