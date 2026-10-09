package com.fiduciawebmovil.fbitacorasol.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;



@Entity
@Table(name = "f_bitacora_sol")
@NoArgsConstructor
public class FBitacoraSol {

    @EmbeddedId
    private FBitacoraSolId id;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal usuNumUsuario;

   @Column
    private OffsetDateTime fbisFechaIni;

    @Column(nullable = true)
    private OffsetDateTime fbisFechaFin;

    @Column(length = 100)
    private String fbisObservacion;

    @Column(precision = 10, scale = 2)
    
    private BigDecimal fbisFirmaDig;

        public FBitacoraSolId getId() {
        return id;
    }

    public void setId(FBitacoraSolId id) {
        this.id = id;
    }

    public BigDecimal getUsuNumUsuario() {
        return usuNumUsuario;
    }

    public void setUsuNumUsuario(final BigDecimal usuNumUsuario) {
        this.usuNumUsuario = usuNumUsuario;
    }

    public OffsetDateTime getFbisFechaIni() {
        return fbisFechaIni;
    }

    public void setFbisFechaIni(final OffsetDateTime fbisFechaIni) {
        this.fbisFechaIni = fbisFechaIni;
    }

    public OffsetDateTime getFbisFechaFin() {
        return fbisFechaFin;
    }

    public void setFbisFechaFin(final OffsetDateTime fbisFechaFin) {
        this.fbisFechaFin = fbisFechaFin;
    }

    public String getFbisObservacion() {
        return fbisObservacion;
    }

    public void setFbisObservacion(final String fbisObservacion) {
        this.fbisObservacion = fbisObservacion;
    }

    public BigDecimal getFbisFirmaDig() {
        return fbisFirmaDig;
    }

    public void setFbisFirmaDig(final BigDecimal fbisFirmaDig) {
        this.fbisFirmaDig = fbisFirmaDig;
    }

}
