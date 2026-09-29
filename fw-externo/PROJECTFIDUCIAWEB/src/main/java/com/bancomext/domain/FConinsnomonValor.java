package com.bancomext.domain;




import java.math.BigDecimal;



public class FConinsnomonValor {


    public FConinsnomonValor(String convValor, FConinsnomonValorDTO id) {
        this.convValor = convValor;
        this.id = id;
    }

    public void setId(FConinsnomonValorDTO id) {
        this.id = id;
    }

    public FConinsnomonValorDTO getId() {
        return id;
    }


    private String convValor;

    public FConinsnomonValorDTO id;
    public String getConvValor() {
        return convValor;
    }

    public void setConvValor(final String convValor) {
        this.convValor = convValor;
    }

}
