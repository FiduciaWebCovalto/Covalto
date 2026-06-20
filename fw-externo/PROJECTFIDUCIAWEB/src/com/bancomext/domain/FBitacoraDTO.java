package com.bancomext.domain;

import java.math.BigDecimal;

import java.time.OffsetDateTime;

public class FBitacoraDTO {
    private BigDecimal fbitSecuencialFolio;

    
    private OffsetDateTime fbitFecha;

    private String fusuIdUsuario;
    
    public BigDecimal getFbitSecuencialFolio() {
        return fbitSecuencialFolio;
    }

    public void setFbitSecuencialFolio(final BigDecimal fbitSecuencialFolio) {
        this.fbitSecuencialFolio = fbitSecuencialFolio;
    }

    public OffsetDateTime getFbitFecha() {
        return fbitFecha;
    }

    public FBitacoraDTO(BigDecimal fbitSecuencialFolio, OffsetDateTime fbitFecha, String fusuIdUsuario) {
        this.fbitSecuencialFolio = fbitSecuencialFolio;
        this.fbitFecha = fbitFecha;
        this.fusuIdUsuario = fusuIdUsuario;
    }

    public void setFbitFecha(final OffsetDateTime fbitFecha) {
        this.fbitFecha = fbitFecha;
    }

    public String getFusuIdUsuario() {
        return fusuIdUsuario;
    }

    public void setFusuIdUsuario(final String fusuIdUsuario) {
        this.fusuIdUsuario = fusuIdUsuario;
    }
}
