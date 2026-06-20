package com.bancomext.domain;

public class FFideicoCuebanDTO {
    public FFideicoCueban id;
    public String fcbaTitular;
    @Override
    public String toString() {
        return  this.id.fcbaClabeCba+"";
    }

    public void setFcbaTitular(String fcbaTitular) {
        this.fcbaTitular = fcbaTitular;
    }

    public String getFcbaTitular() {
        return fcbaTitular;
    }

    public void setId(FFideicoCueban id) {
        this.id = id;
    }

    public FFideicoCueban getId() {
        return id;
    }
}
