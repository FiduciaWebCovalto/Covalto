package com.bancomext.domain;

public class FideicomDTO {
    public String fidNomFideicom;
    public Fideicom id;
    @Override
    public String toString() {
        return  this.id.fidFideicomitente+"-"+this.fidNomFideicom;
    }

    public void setFidNomFideicom(String fidNomFideicom) {
        this.fidNomFideicom = fidNomFideicom;
    }

    public String getFidNomFideicom() {
        return fidNomFideicom;
    }

    public void setId(Fideicom id) {
        this.id = id;
    }

    public Fideicom getId() {
        return id;
    }
}
