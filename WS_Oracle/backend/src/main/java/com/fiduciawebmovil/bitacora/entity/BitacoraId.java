package com.fiduciawebmovil.bitacora.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import  java.util.Objects;


@Embeddable
public class BitacoraId  implements Serializable {

@Column(nullable = false, updatable = false)
    private Long bitAnoTransac;

    @Column(nullable = false, precision = 2, scale = 0)
    private Long bitMesTransac;

    @Column(nullable = false, precision = 2, scale = 0)
    private Long bitDiaTransac;

    @Column(nullable = false, precision = 10, scale = 0)
    private Long bitHoraTransac;

    @Column(nullable = false, precision = 10, scale = 0)
    private Long bitMinTransac;

    @Column(nullable = false, precision = 10, scale = 0)
    private Long bitSegTransac;

    @Column(nullable = false, length = 17)
    private String bitIdTerminal;

    @Column(nullable = false, precision = 10, scale = 0)
    private Long bitNumUsuario;

    public Long getBitAnoTransac() {
        return bitAnoTransac;
    }

    public BitacoraId(Long bitAnoTransac, Long bitMesTransac, Long bitDiaTransac, Long bitHoraTransac,
            Long bitMinTransac, Long bitSegTransac, String bitIdTerminal, Long bitNumUsuario, String bitNomPgm,
            String bitCveFuncion) {
        this.bitAnoTransac = bitAnoTransac;
        this.bitMesTransac = bitMesTransac;
        this.bitDiaTransac = bitDiaTransac;
        this.bitHoraTransac = bitHoraTransac;
        this.bitMinTransac = bitMinTransac;
        this.bitSegTransac = bitSegTransac;
        this.bitIdTerminal = bitIdTerminal;
        this.bitNumUsuario = bitNumUsuario;
        this.bitNomPgm = bitNomPgm;
        this.bitCveFuncion = bitCveFuncion;
    }

    public BitacoraId() {
    }

    public void setBitAnoTransac(Long bitAnoTransac) {
        this.bitAnoTransac = bitAnoTransac;
    }

    public Long getBitMesTransac() {
        return bitMesTransac;
    }

    public void setBitMesTransac(Long bitMesTransac) {
        this.bitMesTransac = bitMesTransac;
    }

    public Long getBitDiaTransac() {
        return bitDiaTransac;
    }

    public void setBitDiaTransac(Long bitDiaTransac) {
        this.bitDiaTransac = bitDiaTransac;
    }

    public Long getBitHoraTransac() {
        return bitHoraTransac;
    }

    public void setBitHoraTransac(Long bitHoraTransac) {
        this.bitHoraTransac = bitHoraTransac;
    }

    public Long getBitMinTransac() {
        return bitMinTransac;
    }

    public void setBitMinTransac(Long bitMinTransac) {
        this.bitMinTransac = bitMinTransac;
    }

    public Long getBitSegTransac() {
        return bitSegTransac;
    }

    public void setBitSegTransac(Long bitSegTransac) {
        this.bitSegTransac = bitSegTransac;
    }

    public String getBitIdTerminal() {
        return bitIdTerminal;
    }

    public void setBitIdTerminal(String bitIdTerminal) {
        this.bitIdTerminal = bitIdTerminal;
    }

    public Long getBitNumUsuario() {
        return bitNumUsuario;
    }

    public void setBitNumUsuario(Long bitNumUsuario) {
        this.bitNumUsuario = bitNumUsuario;
    }

    public String getBitNomPgm() {
        return bitNomPgm;
    }

    public void setBitNomPgm(String bitNomPgm) {
        this.bitNomPgm = bitNomPgm;
    }

    public String getBitCveFuncion() {
        return bitCveFuncion;
    }

    public void setBitCveFuncion(String bitCveFuncion) {
        this.bitCveFuncion = bitCveFuncion;
    }

    @Column(nullable = false)
    private String bitNomPgm;

    @Column(nullable = false)
    private String bitCveFuncion;

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BitacoraId that = (BitacoraId) o;
        return Objects.equals(bitAnoTransac, that.bitAnoTransac) &&
         Objects.equals(bitMesTransac, that.bitMesTransac)&&
         Objects.equals(bitDiaTransac, that.bitDiaTransac) &&
         Objects.equals(bitHoraTransac, that.bitHoraTransac) &&
         Objects.equals(bitMinTransac, that.bitMinTransac) &&
         Objects.equals(bitSegTransac, that.bitSegTransac)&&
         Objects.equals(bitIdTerminal, that.bitIdTerminal) &&
         Objects.equals(bitNumUsuario, that.bitNumUsuario)&&
         Objects.equals(bitNomPgm, that.bitNomPgm) &&
         Objects.equals(bitCveFuncion, that.bitCveFuncion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bitAnoTransac, bitMesTransac,
            bitDiaTransac, bitHoraTransac,
            bitMinTransac, bitSegTransac,
            bitIdTerminal, bitNumUsuario,
            bitNomPgm, bitCveFuncion
        );
    }


}
