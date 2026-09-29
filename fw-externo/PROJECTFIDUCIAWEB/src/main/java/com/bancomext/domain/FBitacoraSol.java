package com.bancomext.domain;







import java.math.BigDecimal;
import java.time.OffsetDateTime;



public class FBitacoraSol {

    public void setId(FBitacoraSolDTO id) {
        this.id = id;
    }

    public FBitacoraSolDTO getId() {
        return id;
    }


    private BigDecimal usuNumUsuario;

    
    private OffsetDateTime fbisFechaIni;

    
    private OffsetDateTime fbisFechaFin;

    private String fbisObservacion;

    
    private BigDecimal fbisFirmaDig;

    public FBitacoraSolDTO id;

    public BigDecimal getUsuNumUsuario() {
        return usuNumUsuario;
    }

    public FBitacoraSol(BigDecimal usuNumUsuario, OffsetDateTime fbisFechaIni, OffsetDateTime fbisFechaFin,
                        String fbisObservacion, BigDecimal fbisFirmaDig, FBitacoraSolDTO id) {
        this.usuNumUsuario = usuNumUsuario;
        this.fbisFechaIni = fbisFechaIni;
        this.fbisFechaFin = fbisFechaFin;
        this.fbisObservacion = fbisObservacion;
        this.fbisFirmaDig = fbisFirmaDig;
        this.id = id;
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
