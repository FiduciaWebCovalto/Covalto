package com.fiduciawebmovil.bienes.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;




@Entity
@Table(name = "f_bienes_valor")
@NoArgsConstructor
public class FBienesValor {

    @EmbeddedId
    private FBienesValorId id;

    public FBienesValorId getId() {
        return id;
    }

    public void setId(FBienesValorId id) {
        this.id = id;
    }
}
