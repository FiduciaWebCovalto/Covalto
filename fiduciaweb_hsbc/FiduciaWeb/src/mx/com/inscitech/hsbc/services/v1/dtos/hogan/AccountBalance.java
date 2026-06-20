package mx.com.inscitech.hsbc.services.v1.dtos.hogan;


public class AccountBalance {

    private String nombreCortoCuenta;
    private String moneda;
    private String saldoActual;
    private String interesDebitoAcumulado;
    private String iva;
    private String montoLinea;
    private String creditosPendientes;
    private String debitosPendientes;
    private String fondosRestringidos;
    private String creditosExternos;
    private String debitosExternos;
    private String fondosRestringidosExternos;
    private String comisionesPendientesIva;
    private String saldoReal;
    private String fondosRetenidos;
    private String saldoDisponible;
    private String saveLocAvail;
    private String relacionCuentaConexa;

    public AccountBalance() {
        super();
    }

    public AccountBalance(String nombreCortoCuenta, String moneda, String saldoActual, String interesDebitoAcumulado, String iva, String montoLinea, String creditosPendientes,
                          String debitosPendientes, String fondosRestringidos, String creditosExternos, String debitosExternos, String fondosRestringidosExternos,
                          String comisionesPendientesIva, String saldoReal, String fondosRetenidos, String saldoDisponible, String saveLocAvail, String relacionCuentaConexa) {
        this.nombreCortoCuenta = nombreCortoCuenta;
        this.moneda = moneda;
        this.saldoActual = saldoActual;
        this.interesDebitoAcumulado = interesDebitoAcumulado;
        this.iva = iva;
        this.montoLinea = montoLinea;
        this.creditosPendientes = creditosPendientes;
        this.debitosPendientes = debitosPendientes;
        this.fondosRestringidos = fondosRestringidos;
        this.creditosExternos = creditosExternos;
        this.debitosExternos = debitosExternos;
        this.fondosRestringidosExternos = fondosRestringidosExternos;
        this.comisionesPendientesIva = comisionesPendientesIva;
        this.saldoReal = saldoReal;
        this.fondosRetenidos = fondosRetenidos;
        this.saldoDisponible = saldoDisponible;
        this.saveLocAvail = saveLocAvail;
        this.relacionCuentaConexa = relacionCuentaConexa;
    }

    public void setNombreCortoCuenta(String nombreCortoCuenta) {
        this.nombreCortoCuenta = nombreCortoCuenta;
    }

    public String getNombreCortoCuenta() {
        return nombreCortoCuenta;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setSaldoActual(String saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getSaldoActual() {
        return saldoActual;
    }

    public void setInteresDebitoAcumulado(String interesDebitoAcumulado) {
        this.interesDebitoAcumulado = interesDebitoAcumulado;
    }

    public String getInteresDebitoAcumulado() {
        return interesDebitoAcumulado;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getIva() {
        return iva;
    }

    public void setMontoLinea(String montoLinea) {
        this.montoLinea = montoLinea;
    }

    public String getMontoLinea() {
        return montoLinea;
    }

    public void setCreditosPendientes(String creditosPendientes) {
        this.creditosPendientes = creditosPendientes;
    }

    public String getCreditosPendientes() {
        return creditosPendientes;
    }

    public void setDebitosPendientes(String debitosPendientes) {
        this.debitosPendientes = debitosPendientes;
    }

    public String getDebitosPendientes() {
        return debitosPendientes;
    }

    public void setFondosRestringidos(String fondosRestringidos) {
        this.fondosRestringidos = fondosRestringidos;
    }

    public String getFondosRestringidos() {
        return fondosRestringidos;
    }

    public void setCreditosExternos(String creditosExternos) {
        this.creditosExternos = creditosExternos;
    }

    public String getCreditosExternos() {
        return creditosExternos;
    }

    public void setDebitosExternos(String debitosExternos) {
        this.debitosExternos = debitosExternos;
    }

    public String getDebitosExternos() {
        return debitosExternos;
    }

    public void setFondosRestringidosExternos(String fondosRestringidosExternos) {
        this.fondosRestringidosExternos = fondosRestringidosExternos;
    }

    public String getFondosRestringidosExternos() {
        return fondosRestringidosExternos;
    }

    public void setComisionesPendientesIva(String comisionesPendientesIva) {
        this.comisionesPendientesIva = comisionesPendientesIva;
    }

    public String getComisionesPendientesIva() {
        return comisionesPendientesIva;
    }

    public void setSaldoReal(String saldoReal) {
        this.saldoReal = saldoReal;
    }

    public String getSaldoReal() {
        return saldoReal;
    }

    public void setFondosRetenidos(String fondosRetenidos) {
        this.fondosRetenidos = fondosRetenidos;
    }

    public String getFondosRetenidos() {
        return fondosRetenidos;
    }

    public void setSaldoDisponible(String saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public String getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaveLocAvail(String saveLocAvail) {
        this.saveLocAvail = saveLocAvail;
    }

    public String getSaveLocAvail() {
        return saveLocAvail;
    }

    public void setRelacionCuentaConexa(String relacionCuentaConexa) {
        this.relacionCuentaConexa = relacionCuentaConexa;
    }

    public String getRelacionCuentaConexa() {
        return relacionCuentaConexa;
    }
}
