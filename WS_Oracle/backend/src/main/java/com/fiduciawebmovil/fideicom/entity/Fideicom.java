package com.fiduciawebmovil.fideicom.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;




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
