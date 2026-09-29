package com.bancomext.domain;







import java.math.BigDecimal;



public class FCatmaesFideic {

    public Long id;

    
    public Long fcmaIdPadre;

    
    public Long fcmaIdSecCatma;

    
    public Long ffidIdFideicomiso;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getFcmaIdPadre() {
        return fcmaIdPadre;
    }

    public void setFcmaIdPadre(final Long fcmaIdPadre) {
        this.fcmaIdPadre = fcmaIdPadre;
    }

    public Long getFcmaIdSecCatma() {
        return fcmaIdSecCatma;
    }

    public void setFcmaIdSecCatma(final Long fcmaIdSecCatma) {
        this.fcmaIdSecCatma = fcmaIdSecCatma;
    }

    public Long getFfidIdFideicomiso() {
        return ffidIdFideicomiso;
    }

    public void setFfidIdFideicomiso(final Long ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }
    @Override
    public String toString() {
        return  this.fcmaIdPadre+"-"+this.fcmaIdSecCatma+"-"+ffidIdFideicomiso;
    }
}
