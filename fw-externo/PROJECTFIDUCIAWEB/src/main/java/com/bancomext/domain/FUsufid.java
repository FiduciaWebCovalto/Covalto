package com.bancomext.domain;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

import java.util.Objects;

import javax.persistence.GeneratedValue;

@JsonIgnoreProperties(ignoreUnknown=true)

public class FUsufid {
    
    public Long ctoNumContrato;

    public String ctoNomContrato;

    public Long getCtoNumContrato() {
        return ctoNumContrato;
    }

    public void setCtoNumContrato(final Long ctoNumContrato) {
        this.ctoNumContrato = ctoNumContrato;
    }

    public String getCtoNomContrato() {
        return ctoNomContrato;
    }

    public void setCtoNomContrato(final String ctoNomContrato) {
        this.ctoNomContrato = ctoNomContrato;
    }      
    
    public FUsufid() {
    }

    public FUsufid(Long ctoNumContrato, String ctoNomContrato) {
        this.ctoNumContrato = ctoNumContrato;
        this.ctoNomContrato = ctoNomContrato;
    }    
    
    @Override
    public String toString() {
        return  this.ctoNumContrato+"-"+this.ctoNomContrato;
    }
    

}
