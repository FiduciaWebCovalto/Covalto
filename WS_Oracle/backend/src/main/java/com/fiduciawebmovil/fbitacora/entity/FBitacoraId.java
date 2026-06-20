package com.fiduciawebmovil.fbitacora.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import  java.util.Objects;


@Embeddable
public class FBitacoraId  implements Serializable {
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal fbitSecuencialFolio;

    @Column
    private OffsetDateTime fbitFecha;

    @Column(nullable = false, length = 20)
    private String fusuIdUsuario;

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FBitacoraId that = (FBitacoraId) o;
        return Objects.equals(fbitSecuencialFolio, that.fbitSecuencialFolio) &&
         Objects.equals(fbitFecha, that.fbitFecha)&&
         Objects.equals(fusuIdUsuario, that.fusuIdUsuario);
    }

    public FBitacoraId() {
        }

    public BigDecimal getFbitSecuencialFolio() {
            return fbitSecuencialFolio;
        }

        public FBitacoraId(BigDecimal fbitSecuencialFolio, OffsetDateTime fbitFecha, String fusuIdUsuario) {
        this.fbitSecuencialFolio = fbitSecuencialFolio;
        this.fbitFecha = fbitFecha;
        this.fusuIdUsuario = fusuIdUsuario;
    }

        public void setFbitSecuencialFolio(BigDecimal fbitSecuencialFolio) {
            this.fbitSecuencialFolio = fbitSecuencialFolio;
        }

        public OffsetDateTime getFbitFecha() {
            return fbitFecha;
        }

        public void setFbitFecha(OffsetDateTime fbitFecha) {
            this.fbitFecha = fbitFecha;
        }

        public String getFusuIdUsuario() {
            return fusuIdUsuario;
        }

        public void setFusuIdUsuario(String fusuIdUsuario) {
            this.fusuIdUsuario = fusuIdUsuario;
        }

    @Override
    public int hashCode() {
        return Objects.hash(fbitSecuencialFolio, fbitFecha,
            fusuIdUsuario
        );
    }


}
