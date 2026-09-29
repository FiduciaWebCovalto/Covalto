package com.bancomext.domain;

public class TercerosDTO {
    public String terNomTercero;
    public Terceros id;



    public void setId(Terceros id) {
        this.id = id;
    }

    public void setTerNomTercero(String terNomTercero) {
        this.terNomTercero = terNomTercero;
    }

    public String getTerNomTercero() {
        return terNomTercero;
    }

    public Terceros getId() {
        return id;
    }
    @Override
    public String toString() {
        return  this.id.terNumTercero+"-"+terNomTercero;
    }
}
