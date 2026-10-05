package mx.com.inscitech.clients.domain;

import java.math.BigDecimal;

public class BitacoraDTO {
    private Long bitAnoTransac;

    
    private BigDecimal bitMesTransac;

    
    private BigDecimal bitDiaTransac;

    
    private BigDecimal bitHoraTransac;

    
    private BigDecimal bitMinTransac;

    
    private BigDecimal bitSegTransac;

    public BitacoraDTO(Long bitAnoTransac, BigDecimal bitMesTransac, BigDecimal bitDiaTransac,
                       BigDecimal bitHoraTransac, BigDecimal bitMinTransac, BigDecimal bitSegTransac,
                       String bitIdTerminal, BigDecimal bitNumUsuario, String bitNomPgm, String bitCveFuncion) {
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

    public void setBitAnoTransac(Long bitAnoTransac) {
        this.bitAnoTransac = bitAnoTransac;
    }

    public Long getBitAnoTransac() {
        return bitAnoTransac;
    }

    public void setBitMesTransac(BigDecimal bitMesTransac) {
        this.bitMesTransac = bitMesTransac;
    }

    public BigDecimal getBitMesTransac() {
        return bitMesTransac;
    }

    public void setBitDiaTransac(BigDecimal bitDiaTransac) {
        this.bitDiaTransac = bitDiaTransac;
    }

    public BigDecimal getBitDiaTransac() {
        return bitDiaTransac;
    }

    public void setBitHoraTransac(BigDecimal bitHoraTransac) {
        this.bitHoraTransac = bitHoraTransac;
    }

    public BigDecimal getBitHoraTransac() {
        return bitHoraTransac;
    }

    public void setBitMinTransac(BigDecimal bitMinTransac) {
        this.bitMinTransac = bitMinTransac;
    }

    public BigDecimal getBitMinTransac() {
        return bitMinTransac;
    }

    public void setBitSegTransac(BigDecimal bitSegTransac) {
        this.bitSegTransac = bitSegTransac;
    }

    public BigDecimal getBitSegTransac() {
        return bitSegTransac;
    }

    public void setBitIdTerminal(String bitIdTerminal) {
        this.bitIdTerminal = bitIdTerminal;
    }

    public String getBitIdTerminal() {
        return bitIdTerminal;
    }

    public void setBitNumUsuario(BigDecimal bitNumUsuario) {
        this.bitNumUsuario = bitNumUsuario;
    }

    public BigDecimal getBitNumUsuario() {
        return bitNumUsuario;
    }

    public void setBitNomPgm(String bitNomPgm) {
        this.bitNomPgm = bitNomPgm;
    }

    public String getBitNomPgm() {
        return bitNomPgm;
    }

    public void setBitCveFuncion(String bitCveFuncion) {
        this.bitCveFuncion = bitCveFuncion;
    }

    public String getBitCveFuncion() {
        return bitCveFuncion;
    }

    private String bitIdTerminal;

    
    private BigDecimal bitNumUsuario;

    
    private String bitNomPgm;

    
    private String bitCveFuncion;
}
