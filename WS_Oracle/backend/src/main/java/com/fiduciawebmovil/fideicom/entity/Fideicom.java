package com.fiduciawebmovil.fideicom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import com.fiduciawebmovil.contrato.entity.Contrato;
import com.fiduciawebmovil.terceros.entity.TercerosId;


@Entity
@Table(name = "fideicom")
@NoArgsConstructor
public class Fideicom {

    @EmbeddedId
    private FideicomId id;


    @Column(length = 250)
    private String fidNomFideicom;

    private String fidCveTipoPer;

    public String getFidCveTipoPer() {
        return fidCveTipoPer;
    }

    public void setFidCveTipoPer(String fidCveTipoPer) {
        this.fidCveTipoPer = fidCveTipoPer;
    }

    public String getFidNomFideicom() {
        return fidNomFideicom;
    }

    public void setFidNomFideicom(final String fidNomFideicom) {
        this.fidNomFideicom = fidNomFideicom;
    }

    public FideicomId getId() {
        return id;
    }

    public void setId(FideicomId id) {
        this.id = id;
    }



}
