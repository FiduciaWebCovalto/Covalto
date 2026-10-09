package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_REP_DISTRIB_PK", columns = { "RD_ID_PROGRAMA", "RD_ID_FIDEICOMISO", "RD_ID_EMISION", "RD_ID_PERIODO", "RD_ID_SEC_INTER" }, sequences = { "MANUAL" })
public class FRepDistrib extends DomainObject {

    BigDecimal rdIdPrograma = null;
    BigDecimal rdIdFideicomiso = null;
    BigDecimal rdIdEmision = null;
    BigDecimal rdIdPeriodo = null;
    BigDecimal rdIdSecInter = null;
    String rdNomEmisor = null;
    String rdNomEmision = null;
    String rdNomFideicomiso = null;
    String rdNomFideicomitente = null;
    String rdFechaEmision = null;
    String rdFechaDeterminacion = null;
    String rdFechaInicio = null;
    String rdFechaFin = null;
    String rdFechaPago = null;
    BigDecimal rdTasaUdi = null;
    BigDecimal rdDiasPeriodo = null;
    String rdConceptoCobranzaInicial = null;
    BigDecimal rdImpDepositoInicial = null;
    String rdConceptoCobranza1 = null;
    BigDecimal rdImpDeposito1 = null;
    String rdConceptoCobranza2 = null;
    BigDecimal rdImpDeposito2 = null;
    String rdConceptoCobranza3 = null;
    BigDecimal rdImpDeposito3 = null;
    String rdConceptoIntereses = null;
    BigDecimal rdImpIntereses = null;
    String rdIsr = null;
    BigDecimal rdImpIsr = null;
    String rdConceptoCobranzaTotal = null;
    BigDecimal rdImpDepositoTotal = null;
    BigDecimal rdImpGastosPermitidos = null;
    BigDecimal rdImpHonoFid = null;
    BigDecimal rdImpHonoRepComun = null;
    BigDecimal rdImpHonoBmv = null;
    BigDecimal rdImpHonoCnvb = null;
    BigDecimal rdImpHonoCalif = null;
    BigDecimal rdImpHonoAuditXt = null;
    BigDecimal rdImpHonoAuditXtRe = null;
    BigDecimal rdImpHonoLegales = null;
    BigDecimal rdImpAdministrador = null;
    BigDecimal rdImpHonoPublicaciones = null;
    BigDecimal rdImpOtros = null;
    BigDecimal rdTotGastos = null;
    BigDecimal rdTotDisponible = null;
    String rdPizarra1 = null;
    String rdSerie1 = null;
    BigDecimal rdIntPendientes = null;
    String rdConceptoPagoIntereses = null;
    BigDecimal rdPagoIntereses = null;
    BigDecimal rdAmorPrincipal = null;
    BigDecimal rdAmorCarVen = null;
    BigDecimal rdInterPendPerAnt = null;
    String rdConceptopagoIntInstSub = null;
    BigDecimal rdPagoIntInstSub = null;
    BigDecimal rdAmorAntPrincipal = null;
    BigDecimal rdImportePagar = null;
    BigDecimal rdNumTitulos = null;
    BigDecimal rdValNomInicial = null;
    BigDecimal rdValNomInicialConv = null;
    BigDecimal rdValNomAjustado = null;
    BigDecimal rdValNomAjustadoConv = null;
    BigDecimal rdFactorPorrata = null;
    BigDecimal rdTasaInteres = null;
    BigDecimal rdIntereses = null;
    BigDecimal rdInteresesConv = null;
    BigDecimal rdVanIniEmision = null;
    BigDecimal rdAmortizacion = null;
    BigDecimal rdAmortizacionConv = null;
    BigDecimal rdVanAjustadoEmi = null;
    String rdPizarra2 = null;
    String rdSerie2 = null;
    BigDecimal rdIntPendientes2 = null;
    String rdConceptoPagoIntereses2 = null;
    BigDecimal rdPagoIntereses2 = null;
    BigDecimal rdAmorPrincipal2 = null;
    BigDecimal rdAmorCarVen2 = null;
    BigDecimal rdInterPendPerAnt2 = null;
    String rdConceptopagoIntInstSub2 = null;
    BigDecimal rdPagoIntInstSub2 = null;
    BigDecimal rdAmorAntPrincipal2 = null;
    BigDecimal rdImportePagar2 = null;
    BigDecimal rdNumTitulos2 = null;
    BigDecimal rdValNomInicial2 = null;
    BigDecimal rdValNomInicialConv2 = null;
    BigDecimal rdValNomAjustado2 = null;
    BigDecimal rdValNomAjustadoConv2 = null;
    BigDecimal rdFactorPorrata2 = null;
    BigDecimal rdTasaInteres2 = null;
    BigDecimal rdIntereses2 = null;
    BigDecimal rdInteresesConv2 = null;
    BigDecimal rdVanIniEmision2 = null;
    BigDecimal rdAmortizacion2 = null;
    BigDecimal rdAmortizacionConv2 = null;
    BigDecimal rdVanAjustadoEmi2 = null;
    String rdPizarra3 = null;
    String rdSerie3 = null;
    BigDecimal rdIntPendientes3 = null;
    String rdConceptoPagoIntereses3 = null;
    BigDecimal rdPagoIntereses3 = null;
    BigDecimal rdAmorPrincipal3 = null;
    BigDecimal rdAmorCarVen3 = null;
    BigDecimal rdInterPendPerAnt3 = null;
    String rdConceptopagoIntInstSub3 = null;
    BigDecimal rdPagoIntInstSub3 = null;
    BigDecimal rdAmorAntPrincipal3 = null;
    BigDecimal rdImportePagar3 = null;
    BigDecimal rdNumTitulos3 = null;
    BigDecimal rdValNomInicial3 = null;
    BigDecimal rdValNomInicialConv3 = null;
    BigDecimal rdValNomAjustado3 = null;
    BigDecimal rdValNomAjustadoConv3 = null;
    BigDecimal rdFactorPorrata3 = null;
    BigDecimal rdTasaInteres3 = null;
    BigDecimal rdIntereses3 = null;
    BigDecimal rdInteresesConv3 = null;
    BigDecimal rdVanIniEmision3 = null;
    BigDecimal rdAmortizacion3 = null;
    BigDecimal rdAmortizacionConv3 = null;
    BigDecimal rdVanAjustadoEmi3 = null;
    BigDecimal rdSalFinCartera = null;
    BigDecimal rdNumCreditos = null;
    String rdMorConcpeto1 = null;
    BigDecimal rdMorNumCtas1 = null;
    BigDecimal rdMorPjeCtas1 = null;
    BigDecimal rdMorImporte1 = null;
    String rdMorConcpeto2 = null;
    BigDecimal rdMorNumCtas2 = null;
    BigDecimal rdMorPjeCtas2 = null;
    BigDecimal rdMorImporte2 = null;
    BigDecimal rdNumCreditos3 = null;
    String rdMorConcpeto3 = null;
    BigDecimal rdMorNumCtas3 = null;
    BigDecimal rdMorPjeCtas3 = null;
    BigDecimal rdMorImporte3 = null;
    String rdMorConcpeto4 = null;
    BigDecimal rdMorNumCtas4 = null;
    BigDecimal rdMorPjeCtas4 = null;
    BigDecimal rdMorImporte4 = null;
    BigDecimal rdNumCreditos5 = null;
    String rdMorConcpeto5 = null;
    BigDecimal rdMorNumCtas5 = null;
    BigDecimal rdMorPjeCtas5 = null;
    BigDecimal rdMorImporte5 = null;
    String rdMorConcpeto6 = null;
    BigDecimal rdMorNumCtas6 = null;
    BigDecimal rdMorPjeCtas6 = null;
    BigDecimal rdMorImporte6 = null;
    String rdMorConcpeto7 = null;
    BigDecimal rdMorNumCtas7 = null;
    BigDecimal rdMorPjeCtas7 = null;
    BigDecimal rdMorImporte7 = null;
    BigDecimal rdNumCreditos8 = null;
    String rdMorConcpeto8 = null;
    BigDecimal rdMorNumCtas8 = null;
    BigDecimal rdMorPjeCtas8 = null;
    BigDecimal rdMorImporte8 = null;

    public FRepDistrib() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRdIdPrograma(BigDecimal rdIdPrograma) {
        this.rdIdPrograma = rdIdPrograma;
    }

    public BigDecimal getRdIdPrograma() {
        return this.rdIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRdIdFideicomiso(BigDecimal rdIdFideicomiso) {
        this.rdIdFideicomiso = rdIdFideicomiso;
    }

    public BigDecimal getRdIdFideicomiso() {
        return this.rdIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRdIdEmision(BigDecimal rdIdEmision) {
        this.rdIdEmision = rdIdEmision;
    }

    public BigDecimal getRdIdEmision() {
        return this.rdIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRdIdPeriodo(BigDecimal rdIdPeriodo) {
        this.rdIdPeriodo = rdIdPeriodo;
    }

    public BigDecimal getRdIdPeriodo() {
        return this.rdIdPeriodo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRdIdSecInter(BigDecimal rdIdSecInter) {
        this.rdIdSecInter = rdIdSecInter;
    }

    public BigDecimal getRdIdSecInter() {
        return this.rdIdSecInter;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdNomEmisor(String rdNomEmisor) {
        this.rdNomEmisor = rdNomEmisor;
    }

    public String getRdNomEmisor() {
        return this.rdNomEmisor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdNomEmision(String rdNomEmision) {
        this.rdNomEmision = rdNomEmision;
    }

    public String getRdNomEmision() {
        return this.rdNomEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdNomFideicomiso(String rdNomFideicomiso) {
        this.rdNomFideicomiso = rdNomFideicomiso;
    }

    public String getRdNomFideicomiso() {
        return this.rdNomFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdNomFideicomitente(String rdNomFideicomitente) {
        this.rdNomFideicomitente = rdNomFideicomitente;
    }

    public String getRdNomFideicomitente() {
        return this.rdNomFideicomitente;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRdFechaEmision(String rdFechaEmision) {
        this.rdFechaEmision = rdFechaEmision;
    }

    public String getRdFechaEmision() {
        return this.rdFechaEmision;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRdFechaDeterminacion(String rdFechaDeterminacion) {
        this.rdFechaDeterminacion = rdFechaDeterminacion;
    }

    public String getRdFechaDeterminacion() {
        return this.rdFechaDeterminacion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRdFechaInicio(String rdFechaInicio) {
        this.rdFechaInicio = rdFechaInicio;
    }

    public String getRdFechaInicio() {
        return this.rdFechaInicio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRdFechaFin(String rdFechaFin) {
        this.rdFechaFin = rdFechaFin;
    }

    public String getRdFechaFin() {
        return this.rdFechaFin;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRdFechaPago(String rdFechaPago) {
        this.rdFechaPago = rdFechaPago;
    }

    public String getRdFechaPago() {
        return this.rdFechaPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdTasaUdi(BigDecimal rdTasaUdi) {
        this.rdTasaUdi = rdTasaUdi;
    }

    public BigDecimal getRdTasaUdi() {
        return this.rdTasaUdi;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRdDiasPeriodo(BigDecimal rdDiasPeriodo) {
        this.rdDiasPeriodo = rdDiasPeriodo;
    }

    public BigDecimal getRdDiasPeriodo() {
        return this.rdDiasPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptoCobranzaInicial(String rdConceptoCobranzaInicial) {
        this.rdConceptoCobranzaInicial = rdConceptoCobranzaInicial;
    }

    public String getRdConceptoCobranzaInicial() {
        return this.rdConceptoCobranzaInicial;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpDepositoInicial(BigDecimal rdImpDepositoInicial) {
        this.rdImpDepositoInicial = rdImpDepositoInicial;
    }

    public BigDecimal getRdImpDepositoInicial() {
        return this.rdImpDepositoInicial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptoCobranza1(String rdConceptoCobranza1) {
        this.rdConceptoCobranza1 = rdConceptoCobranza1;
    }

    public String getRdConceptoCobranza1() {
        return this.rdConceptoCobranza1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpDeposito1(BigDecimal rdImpDeposito1) {
        this.rdImpDeposito1 = rdImpDeposito1;
    }

    public BigDecimal getRdImpDeposito1() {
        return this.rdImpDeposito1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptoCobranza2(String rdConceptoCobranza2) {
        this.rdConceptoCobranza2 = rdConceptoCobranza2;
    }

    public String getRdConceptoCobranza2() {
        return this.rdConceptoCobranza2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpDeposito2(BigDecimal rdImpDeposito2) {
        this.rdImpDeposito2 = rdImpDeposito2;
    }

    public BigDecimal getRdImpDeposito2() {
        return this.rdImpDeposito2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptoCobranza3(String rdConceptoCobranza3) {
        this.rdConceptoCobranza3 = rdConceptoCobranza3;
    }

    public String getRdConceptoCobranza3() {
        return this.rdConceptoCobranza3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpDeposito3(BigDecimal rdImpDeposito3) {
        this.rdImpDeposito3 = rdImpDeposito3;
    }

    public BigDecimal getRdImpDeposito3() {
        return this.rdImpDeposito3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptoIntereses(String rdConceptoIntereses) {
        this.rdConceptoIntereses = rdConceptoIntereses;
    }

    public String getRdConceptoIntereses() {
        return this.rdConceptoIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpIntereses(BigDecimal rdImpIntereses) {
        this.rdImpIntereses = rdImpIntereses;
    }

    public BigDecimal getRdImpIntereses() {
        return this.rdImpIntereses;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdIsr(String rdIsr) {
        this.rdIsr = rdIsr;
    }

    public String getRdIsr() {
        return this.rdIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpIsr(BigDecimal rdImpIsr) {
        this.rdImpIsr = rdImpIsr;
    }

    public BigDecimal getRdImpIsr() {
        return this.rdImpIsr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptoCobranzaTotal(String rdConceptoCobranzaTotal) {
        this.rdConceptoCobranzaTotal = rdConceptoCobranzaTotal;
    }

    public String getRdConceptoCobranzaTotal() {
        return this.rdConceptoCobranzaTotal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpDepositoTotal(BigDecimal rdImpDepositoTotal) {
        this.rdImpDepositoTotal = rdImpDepositoTotal;
    }

    public BigDecimal getRdImpDepositoTotal() {
        return this.rdImpDepositoTotal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpGastosPermitidos(BigDecimal rdImpGastosPermitidos) {
        this.rdImpGastosPermitidos = rdImpGastosPermitidos;
    }

    public BigDecimal getRdImpGastosPermitidos() {
        return this.rdImpGastosPermitidos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpHonoFid(BigDecimal rdImpHonoFid) {
        this.rdImpHonoFid = rdImpHonoFid;
    }

    public BigDecimal getRdImpHonoFid() {
        return this.rdImpHonoFid;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpHonoRepComun(BigDecimal rdImpHonoRepComun) {
        this.rdImpHonoRepComun = rdImpHonoRepComun;
    }

    public BigDecimal getRdImpHonoRepComun() {
        return this.rdImpHonoRepComun;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpHonoBmv(BigDecimal rdImpHonoBmv) {
        this.rdImpHonoBmv = rdImpHonoBmv;
    }

    public BigDecimal getRdImpHonoBmv() {
        return this.rdImpHonoBmv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpHonoCnvb(BigDecimal rdImpHonoCnvb) {
        this.rdImpHonoCnvb = rdImpHonoCnvb;
    }

    public BigDecimal getRdImpHonoCnvb() {
        return this.rdImpHonoCnvb;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpHonoCalif(BigDecimal rdImpHonoCalif) {
        this.rdImpHonoCalif = rdImpHonoCalif;
    }

    public BigDecimal getRdImpHonoCalif() {
        return this.rdImpHonoCalif;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpHonoAuditXt(BigDecimal rdImpHonoAuditXt) {
        this.rdImpHonoAuditXt = rdImpHonoAuditXt;
    }

    public BigDecimal getRdImpHonoAuditXt() {
        return this.rdImpHonoAuditXt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpHonoAuditXtRe(BigDecimal rdImpHonoAuditXtRe) {
        this.rdImpHonoAuditXtRe = rdImpHonoAuditXtRe;
    }

    public BigDecimal getRdImpHonoAuditXtRe() {
        return this.rdImpHonoAuditXtRe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpHonoLegales(BigDecimal rdImpHonoLegales) {
        this.rdImpHonoLegales = rdImpHonoLegales;
    }

    public BigDecimal getRdImpHonoLegales() {
        return this.rdImpHonoLegales;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpAdministrador(BigDecimal rdImpAdministrador) {
        this.rdImpAdministrador = rdImpAdministrador;
    }

    public BigDecimal getRdImpAdministrador() {
        return this.rdImpAdministrador;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpHonoPublicaciones(BigDecimal rdImpHonoPublicaciones) {
        this.rdImpHonoPublicaciones = rdImpHonoPublicaciones;
    }

    public BigDecimal getRdImpHonoPublicaciones() {
        return this.rdImpHonoPublicaciones;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImpOtros(BigDecimal rdImpOtros) {
        this.rdImpOtros = rdImpOtros;
    }

    public BigDecimal getRdImpOtros() {
        return this.rdImpOtros;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdTotGastos(BigDecimal rdTotGastos) {
        this.rdTotGastos = rdTotGastos;
    }

    public BigDecimal getRdTotGastos() {
        return this.rdTotGastos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdTotDisponible(BigDecimal rdTotDisponible) {
        this.rdTotDisponible = rdTotDisponible;
    }

    public BigDecimal getRdTotDisponible() {
        return this.rdTotDisponible;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdPizarra1(String rdPizarra1) {
        this.rdPizarra1 = rdPizarra1;
    }

    public String getRdPizarra1() {
        return this.rdPizarra1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdSerie1(String rdSerie1) {
        this.rdSerie1 = rdSerie1;
    }

    public String getRdSerie1() {
        return this.rdSerie1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdIntPendientes(BigDecimal rdIntPendientes) {
        this.rdIntPendientes = rdIntPendientes;
    }

    public BigDecimal getRdIntPendientes() {
        return this.rdIntPendientes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptoPagoIntereses(String rdConceptoPagoIntereses) {
        this.rdConceptoPagoIntereses = rdConceptoPagoIntereses;
    }

    public String getRdConceptoPagoIntereses() {
        return this.rdConceptoPagoIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdPagoIntereses(BigDecimal rdPagoIntereses) {
        this.rdPagoIntereses = rdPagoIntereses;
    }

    public BigDecimal getRdPagoIntereses() {
        return this.rdPagoIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmorPrincipal(BigDecimal rdAmorPrincipal) {
        this.rdAmorPrincipal = rdAmorPrincipal;
    }

    public BigDecimal getRdAmorPrincipal() {
        return this.rdAmorPrincipal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmorCarVen(BigDecimal rdAmorCarVen) {
        this.rdAmorCarVen = rdAmorCarVen;
    }

    public BigDecimal getRdAmorCarVen() {
        return this.rdAmorCarVen;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdInterPendPerAnt(BigDecimal rdInterPendPerAnt) {
        this.rdInterPendPerAnt = rdInterPendPerAnt;
    }

    public BigDecimal getRdInterPendPerAnt() {
        return this.rdInterPendPerAnt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptopagoIntInstSub(String rdConceptopagoIntInstSub) {
        this.rdConceptopagoIntInstSub = rdConceptopagoIntInstSub;
    }

    public String getRdConceptopagoIntInstSub() {
        return this.rdConceptopagoIntInstSub;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdPagoIntInstSub(BigDecimal rdPagoIntInstSub) {
        this.rdPagoIntInstSub = rdPagoIntInstSub;
    }

    public BigDecimal getRdPagoIntInstSub() {
        return this.rdPagoIntInstSub;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmorAntPrincipal(BigDecimal rdAmorAntPrincipal) {
        this.rdAmorAntPrincipal = rdAmorAntPrincipal;
    }

    public BigDecimal getRdAmorAntPrincipal() {
        return this.rdAmorAntPrincipal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImportePagar(BigDecimal rdImportePagar) {
        this.rdImportePagar = rdImportePagar;
    }

    public BigDecimal getRdImportePagar() {
        return this.rdImportePagar;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRdNumTitulos(BigDecimal rdNumTitulos) {
        this.rdNumTitulos = rdNumTitulos;
    }

    public BigDecimal getRdNumTitulos() {
        return this.rdNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomInicial(BigDecimal rdValNomInicial) {
        this.rdValNomInicial = rdValNomInicial;
    }

    public BigDecimal getRdValNomInicial() {
        return this.rdValNomInicial;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomInicialConv(BigDecimal rdValNomInicialConv) {
        this.rdValNomInicialConv = rdValNomInicialConv;
    }

    public BigDecimal getRdValNomInicialConv() {
        return this.rdValNomInicialConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomAjustado(BigDecimal rdValNomAjustado) {
        this.rdValNomAjustado = rdValNomAjustado;
    }

    public BigDecimal getRdValNomAjustado() {
        return this.rdValNomAjustado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomAjustadoConv(BigDecimal rdValNomAjustadoConv) {
        this.rdValNomAjustadoConv = rdValNomAjustadoConv;
    }

    public BigDecimal getRdValNomAjustadoConv() {
        return this.rdValNomAjustadoConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdFactorPorrata(BigDecimal rdFactorPorrata) {
        this.rdFactorPorrata = rdFactorPorrata;
    }

    public BigDecimal getRdFactorPorrata() {
        return this.rdFactorPorrata;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdTasaInteres(BigDecimal rdTasaInteres) {
        this.rdTasaInteres = rdTasaInteres;
    }

    public BigDecimal getRdTasaInteres() {
        return this.rdTasaInteres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdIntereses(BigDecimal rdIntereses) {
        this.rdIntereses = rdIntereses;
    }

    public BigDecimal getRdIntereses() {
        return this.rdIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdInteresesConv(BigDecimal rdInteresesConv) {
        this.rdInteresesConv = rdInteresesConv;
    }

    public BigDecimal getRdInteresesConv() {
        return this.rdInteresesConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdVanIniEmision(BigDecimal rdVanIniEmision) {
        this.rdVanIniEmision = rdVanIniEmision;
    }

    public BigDecimal getRdVanIniEmision() {
        return this.rdVanIniEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmortizacion(BigDecimal rdAmortizacion) {
        this.rdAmortizacion = rdAmortizacion;
    }

    public BigDecimal getRdAmortizacion() {
        return this.rdAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmortizacionConv(BigDecimal rdAmortizacionConv) {
        this.rdAmortizacionConv = rdAmortizacionConv;
    }

    public BigDecimal getRdAmortizacionConv() {
        return this.rdAmortizacionConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdVanAjustadoEmi(BigDecimal rdVanAjustadoEmi) {
        this.rdVanAjustadoEmi = rdVanAjustadoEmi;
    }

    public BigDecimal getRdVanAjustadoEmi() {
        return this.rdVanAjustadoEmi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdPizarra2(String rdPizarra2) {
        this.rdPizarra2 = rdPizarra2;
    }

    public String getRdPizarra2() {
        return this.rdPizarra2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdSerie2(String rdSerie2) {
        this.rdSerie2 = rdSerie2;
    }

    public String getRdSerie2() {
        return this.rdSerie2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdIntPendientes2(BigDecimal rdIntPendientes2) {
        this.rdIntPendientes2 = rdIntPendientes2;
    }

    public BigDecimal getRdIntPendientes2() {
        return this.rdIntPendientes2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptoPagoIntereses2(String rdConceptoPagoIntereses2) {
        this.rdConceptoPagoIntereses2 = rdConceptoPagoIntereses2;
    }

    public String getRdConceptoPagoIntereses2() {
        return this.rdConceptoPagoIntereses2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdPagoIntereses2(BigDecimal rdPagoIntereses2) {
        this.rdPagoIntereses2 = rdPagoIntereses2;
    }

    public BigDecimal getRdPagoIntereses2() {
        return this.rdPagoIntereses2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmorPrincipal2(BigDecimal rdAmorPrincipal2) {
        this.rdAmorPrincipal2 = rdAmorPrincipal2;
    }

    public BigDecimal getRdAmorPrincipal2() {
        return this.rdAmorPrincipal2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmorCarVen2(BigDecimal rdAmorCarVen2) {
        this.rdAmorCarVen2 = rdAmorCarVen2;
    }

    public BigDecimal getRdAmorCarVen2() {
        return this.rdAmorCarVen2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdInterPendPerAnt2(BigDecimal rdInterPendPerAnt2) {
        this.rdInterPendPerAnt2 = rdInterPendPerAnt2;
    }

    public BigDecimal getRdInterPendPerAnt2() {
        return this.rdInterPendPerAnt2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptopagoIntInstSub2(String rdConceptopagoIntInstSub2) {
        this.rdConceptopagoIntInstSub2 = rdConceptopagoIntInstSub2;
    }

    public String getRdConceptopagoIntInstSub2() {
        return this.rdConceptopagoIntInstSub2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdPagoIntInstSub2(BigDecimal rdPagoIntInstSub2) {
        this.rdPagoIntInstSub2 = rdPagoIntInstSub2;
    }

    public BigDecimal getRdPagoIntInstSub2() {
        return this.rdPagoIntInstSub2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmorAntPrincipal2(BigDecimal rdAmorAntPrincipal2) {
        this.rdAmorAntPrincipal2 = rdAmorAntPrincipal2;
    }

    public BigDecimal getRdAmorAntPrincipal2() {
        return this.rdAmorAntPrincipal2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImportePagar2(BigDecimal rdImportePagar2) {
        this.rdImportePagar2 = rdImportePagar2;
    }

    public BigDecimal getRdImportePagar2() {
        return this.rdImportePagar2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRdNumTitulos2(BigDecimal rdNumTitulos2) {
        this.rdNumTitulos2 = rdNumTitulos2;
    }

    public BigDecimal getRdNumTitulos2() {
        return this.rdNumTitulos2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomInicial2(BigDecimal rdValNomInicial2) {
        this.rdValNomInicial2 = rdValNomInicial2;
    }

    public BigDecimal getRdValNomInicial2() {
        return this.rdValNomInicial2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomInicialConv2(BigDecimal rdValNomInicialConv2) {
        this.rdValNomInicialConv2 = rdValNomInicialConv2;
    }

    public BigDecimal getRdValNomInicialConv2() {
        return this.rdValNomInicialConv2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomAjustado2(BigDecimal rdValNomAjustado2) {
        this.rdValNomAjustado2 = rdValNomAjustado2;
    }

    public BigDecimal getRdValNomAjustado2() {
        return this.rdValNomAjustado2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomAjustadoConv2(BigDecimal rdValNomAjustadoConv2) {
        this.rdValNomAjustadoConv2 = rdValNomAjustadoConv2;
    }

    public BigDecimal getRdValNomAjustadoConv2() {
        return this.rdValNomAjustadoConv2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdFactorPorrata2(BigDecimal rdFactorPorrata2) {
        this.rdFactorPorrata2 = rdFactorPorrata2;
    }

    public BigDecimal getRdFactorPorrata2() {
        return this.rdFactorPorrata2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdTasaInteres2(BigDecimal rdTasaInteres2) {
        this.rdTasaInteres2 = rdTasaInteres2;
    }

    public BigDecimal getRdTasaInteres2() {
        return this.rdTasaInteres2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdIntereses2(BigDecimal rdIntereses2) {
        this.rdIntereses2 = rdIntereses2;
    }

    public BigDecimal getRdIntereses2() {
        return this.rdIntereses2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdInteresesConv2(BigDecimal rdInteresesConv2) {
        this.rdInteresesConv2 = rdInteresesConv2;
    }

    public BigDecimal getRdInteresesConv2() {
        return this.rdInteresesConv2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdVanIniEmision2(BigDecimal rdVanIniEmision2) {
        this.rdVanIniEmision2 = rdVanIniEmision2;
    }

    public BigDecimal getRdVanIniEmision2() {
        return this.rdVanIniEmision2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmortizacion2(BigDecimal rdAmortizacion2) {
        this.rdAmortizacion2 = rdAmortizacion2;
    }

    public BigDecimal getRdAmortizacion2() {
        return this.rdAmortizacion2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmortizacionConv2(BigDecimal rdAmortizacionConv2) {
        this.rdAmortizacionConv2 = rdAmortizacionConv2;
    }

    public BigDecimal getRdAmortizacionConv2() {
        return this.rdAmortizacionConv2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdVanAjustadoEmi2(BigDecimal rdVanAjustadoEmi2) {
        this.rdVanAjustadoEmi2 = rdVanAjustadoEmi2;
    }

    public BigDecimal getRdVanAjustadoEmi2() {
        return this.rdVanAjustadoEmi2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdPizarra3(String rdPizarra3) {
        this.rdPizarra3 = rdPizarra3;
    }

    public String getRdPizarra3() {
        return this.rdPizarra3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdSerie3(String rdSerie3) {
        this.rdSerie3 = rdSerie3;
    }

    public String getRdSerie3() {
        return this.rdSerie3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdIntPendientes3(BigDecimal rdIntPendientes3) {
        this.rdIntPendientes3 = rdIntPendientes3;
    }

    public BigDecimal getRdIntPendientes3() {
        return this.rdIntPendientes3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptoPagoIntereses3(String rdConceptoPagoIntereses3) {
        this.rdConceptoPagoIntereses3 = rdConceptoPagoIntereses3;
    }

    public String getRdConceptoPagoIntereses3() {
        return this.rdConceptoPagoIntereses3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdPagoIntereses3(BigDecimal rdPagoIntereses3) {
        this.rdPagoIntereses3 = rdPagoIntereses3;
    }

    public BigDecimal getRdPagoIntereses3() {
        return this.rdPagoIntereses3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmorPrincipal3(BigDecimal rdAmorPrincipal3) {
        this.rdAmorPrincipal3 = rdAmorPrincipal3;
    }

    public BigDecimal getRdAmorPrincipal3() {
        return this.rdAmorPrincipal3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmorCarVen3(BigDecimal rdAmorCarVen3) {
        this.rdAmorCarVen3 = rdAmorCarVen3;
    }

    public BigDecimal getRdAmorCarVen3() {
        return this.rdAmorCarVen3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdInterPendPerAnt3(BigDecimal rdInterPendPerAnt3) {
        this.rdInterPendPerAnt3 = rdInterPendPerAnt3;
    }

    public BigDecimal getRdInterPendPerAnt3() {
        return this.rdInterPendPerAnt3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdConceptopagoIntInstSub3(String rdConceptopagoIntInstSub3) {
        this.rdConceptopagoIntInstSub3 = rdConceptopagoIntInstSub3;
    }

    public String getRdConceptopagoIntInstSub3() {
        return this.rdConceptopagoIntInstSub3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdPagoIntInstSub3(BigDecimal rdPagoIntInstSub3) {
        this.rdPagoIntInstSub3 = rdPagoIntInstSub3;
    }

    public BigDecimal getRdPagoIntInstSub3() {
        return this.rdPagoIntInstSub3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmorAntPrincipal3(BigDecimal rdAmorAntPrincipal3) {
        this.rdAmorAntPrincipal3 = rdAmorAntPrincipal3;
    }

    public BigDecimal getRdAmorAntPrincipal3() {
        return this.rdAmorAntPrincipal3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdImportePagar3(BigDecimal rdImportePagar3) {
        this.rdImportePagar3 = rdImportePagar3;
    }

    public BigDecimal getRdImportePagar3() {
        return this.rdImportePagar3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRdNumTitulos3(BigDecimal rdNumTitulos3) {
        this.rdNumTitulos3 = rdNumTitulos3;
    }

    public BigDecimal getRdNumTitulos3() {
        return this.rdNumTitulos3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomInicial3(BigDecimal rdValNomInicial3) {
        this.rdValNomInicial3 = rdValNomInicial3;
    }

    public BigDecimal getRdValNomInicial3() {
        return this.rdValNomInicial3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomInicialConv3(BigDecimal rdValNomInicialConv3) {
        this.rdValNomInicialConv3 = rdValNomInicialConv3;
    }

    public BigDecimal getRdValNomInicialConv3() {
        return this.rdValNomInicialConv3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomAjustado3(BigDecimal rdValNomAjustado3) {
        this.rdValNomAjustado3 = rdValNomAjustado3;
    }

    public BigDecimal getRdValNomAjustado3() {
        return this.rdValNomAjustado3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdValNomAjustadoConv3(BigDecimal rdValNomAjustadoConv3) {
        this.rdValNomAjustadoConv3 = rdValNomAjustadoConv3;
    }

    public BigDecimal getRdValNomAjustadoConv3() {
        return this.rdValNomAjustadoConv3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdFactorPorrata3(BigDecimal rdFactorPorrata3) {
        this.rdFactorPorrata3 = rdFactorPorrata3;
    }

    public BigDecimal getRdFactorPorrata3() {
        return this.rdFactorPorrata3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdTasaInteres3(BigDecimal rdTasaInteres3) {
        this.rdTasaInteres3 = rdTasaInteres3;
    }

    public BigDecimal getRdTasaInteres3() {
        return this.rdTasaInteres3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdIntereses3(BigDecimal rdIntereses3) {
        this.rdIntereses3 = rdIntereses3;
    }

    public BigDecimal getRdIntereses3() {
        return this.rdIntereses3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdInteresesConv3(BigDecimal rdInteresesConv3) {
        this.rdInteresesConv3 = rdInteresesConv3;
    }

    public BigDecimal getRdInteresesConv3() {
        return this.rdInteresesConv3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdVanIniEmision3(BigDecimal rdVanIniEmision3) {
        this.rdVanIniEmision3 = rdVanIniEmision3;
    }

    public BigDecimal getRdVanIniEmision3() {
        return this.rdVanIniEmision3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmortizacion3(BigDecimal rdAmortizacion3) {
        this.rdAmortizacion3 = rdAmortizacion3;
    }

    public BigDecimal getRdAmortizacion3() {
        return this.rdAmortizacion3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdAmortizacionConv3(BigDecimal rdAmortizacionConv3) {
        this.rdAmortizacionConv3 = rdAmortizacionConv3;
    }

    public BigDecimal getRdAmortizacionConv3() {
        return this.rdAmortizacionConv3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdVanAjustadoEmi3(BigDecimal rdVanAjustadoEmi3) {
        this.rdVanAjustadoEmi3 = rdVanAjustadoEmi3;
    }

    public BigDecimal getRdVanAjustadoEmi3() {
        return this.rdVanAjustadoEmi3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdSalFinCartera(BigDecimal rdSalFinCartera) {
        this.rdSalFinCartera = rdSalFinCartera;
    }

    public BigDecimal getRdSalFinCartera() {
        return this.rdSalFinCartera;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdNumCreditos(BigDecimal rdNumCreditos) {
        this.rdNumCreditos = rdNumCreditos;
    }

    public BigDecimal getRdNumCreditos() {
        return this.rdNumCreditos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdMorConcpeto1(String rdMorConcpeto1) {
        this.rdMorConcpeto1 = rdMorConcpeto1;
    }

    public String getRdMorConcpeto1() {
        return this.rdMorConcpeto1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorNumCtas1(BigDecimal rdMorNumCtas1) {
        this.rdMorNumCtas1 = rdMorNumCtas1;
    }

    public BigDecimal getRdMorNumCtas1() {
        return this.rdMorNumCtas1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdMorPjeCtas1(BigDecimal rdMorPjeCtas1) {
        this.rdMorPjeCtas1 = rdMorPjeCtas1;
    }

    public BigDecimal getRdMorPjeCtas1() {
        return this.rdMorPjeCtas1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorImporte1(BigDecimal rdMorImporte1) {
        this.rdMorImporte1 = rdMorImporte1;
    }

    public BigDecimal getRdMorImporte1() {
        return this.rdMorImporte1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdMorConcpeto2(String rdMorConcpeto2) {
        this.rdMorConcpeto2 = rdMorConcpeto2;
    }

    public String getRdMorConcpeto2() {
        return this.rdMorConcpeto2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorNumCtas2(BigDecimal rdMorNumCtas2) {
        this.rdMorNumCtas2 = rdMorNumCtas2;
    }

    public BigDecimal getRdMorNumCtas2() {
        return this.rdMorNumCtas2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdMorPjeCtas2(BigDecimal rdMorPjeCtas2) {
        this.rdMorPjeCtas2 = rdMorPjeCtas2;
    }

    public BigDecimal getRdMorPjeCtas2() {
        return this.rdMorPjeCtas2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorImporte2(BigDecimal rdMorImporte2) {
        this.rdMorImporte2 = rdMorImporte2;
    }

    public BigDecimal getRdMorImporte2() {
        return this.rdMorImporte2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdNumCreditos3(BigDecimal rdNumCreditos3) {
        this.rdNumCreditos3 = rdNumCreditos3;
    }

    public BigDecimal getRdNumCreditos3() {
        return this.rdNumCreditos3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdMorConcpeto3(String rdMorConcpeto3) {
        this.rdMorConcpeto3 = rdMorConcpeto3;
    }

    public String getRdMorConcpeto3() {
        return this.rdMorConcpeto3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorNumCtas3(BigDecimal rdMorNumCtas3) {
        this.rdMorNumCtas3 = rdMorNumCtas3;
    }

    public BigDecimal getRdMorNumCtas3() {
        return this.rdMorNumCtas3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdMorPjeCtas3(BigDecimal rdMorPjeCtas3) {
        this.rdMorPjeCtas3 = rdMorPjeCtas3;
    }

    public BigDecimal getRdMorPjeCtas3() {
        return this.rdMorPjeCtas3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorImporte3(BigDecimal rdMorImporte3) {
        this.rdMorImporte3 = rdMorImporte3;
    }

    public BigDecimal getRdMorImporte3() {
        return this.rdMorImporte3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdMorConcpeto4(String rdMorConcpeto4) {
        this.rdMorConcpeto4 = rdMorConcpeto4;
    }

    public String getRdMorConcpeto4() {
        return this.rdMorConcpeto4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorNumCtas4(BigDecimal rdMorNumCtas4) {
        this.rdMorNumCtas4 = rdMorNumCtas4;
    }

    public BigDecimal getRdMorNumCtas4() {
        return this.rdMorNumCtas4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdMorPjeCtas4(BigDecimal rdMorPjeCtas4) {
        this.rdMorPjeCtas4 = rdMorPjeCtas4;
    }

    public BigDecimal getRdMorPjeCtas4() {
        return this.rdMorPjeCtas4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorImporte4(BigDecimal rdMorImporte4) {
        this.rdMorImporte4 = rdMorImporte4;
    }

    public BigDecimal getRdMorImporte4() {
        return this.rdMorImporte4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdNumCreditos5(BigDecimal rdNumCreditos5) {
        this.rdNumCreditos5 = rdNumCreditos5;
    }

    public BigDecimal getRdNumCreditos5() {
        return this.rdNumCreditos5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdMorConcpeto5(String rdMorConcpeto5) {
        this.rdMorConcpeto5 = rdMorConcpeto5;
    }

    public String getRdMorConcpeto5() {
        return this.rdMorConcpeto5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorNumCtas5(BigDecimal rdMorNumCtas5) {
        this.rdMorNumCtas5 = rdMorNumCtas5;
    }

    public BigDecimal getRdMorNumCtas5() {
        return this.rdMorNumCtas5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdMorPjeCtas5(BigDecimal rdMorPjeCtas5) {
        this.rdMorPjeCtas5 = rdMorPjeCtas5;
    }

    public BigDecimal getRdMorPjeCtas5() {
        return this.rdMorPjeCtas5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorImporte5(BigDecimal rdMorImporte5) {
        this.rdMorImporte5 = rdMorImporte5;
    }

    public BigDecimal getRdMorImporte5() {
        return this.rdMorImporte5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdMorConcpeto6(String rdMorConcpeto6) {
        this.rdMorConcpeto6 = rdMorConcpeto6;
    }

    public String getRdMorConcpeto6() {
        return this.rdMorConcpeto6;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorNumCtas6(BigDecimal rdMorNumCtas6) {
        this.rdMorNumCtas6 = rdMorNumCtas6;
    }

    public BigDecimal getRdMorNumCtas6() {
        return this.rdMorNumCtas6;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdMorPjeCtas6(BigDecimal rdMorPjeCtas6) {
        this.rdMorPjeCtas6 = rdMorPjeCtas6;
    }

    public BigDecimal getRdMorPjeCtas6() {
        return this.rdMorPjeCtas6;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorImporte6(BigDecimal rdMorImporte6) {
        this.rdMorImporte6 = rdMorImporte6;
    }

    public BigDecimal getRdMorImporte6() {
        return this.rdMorImporte6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdMorConcpeto7(String rdMorConcpeto7) {
        this.rdMorConcpeto7 = rdMorConcpeto7;
    }

    public String getRdMorConcpeto7() {
        return this.rdMorConcpeto7;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorNumCtas7(BigDecimal rdMorNumCtas7) {
        this.rdMorNumCtas7 = rdMorNumCtas7;
    }

    public BigDecimal getRdMorNumCtas7() {
        return this.rdMorNumCtas7;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdMorPjeCtas7(BigDecimal rdMorPjeCtas7) {
        this.rdMorPjeCtas7 = rdMorPjeCtas7;
    }

    public BigDecimal getRdMorPjeCtas7() {
        return this.rdMorPjeCtas7;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorImporte7(BigDecimal rdMorImporte7) {
        this.rdMorImporte7 = rdMorImporte7;
    }

    public BigDecimal getRdMorImporte7() {
        return this.rdMorImporte7;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdNumCreditos8(BigDecimal rdNumCreditos8) {
        this.rdNumCreditos8 = rdNumCreditos8;
    }

    public BigDecimal getRdNumCreditos8() {
        return this.rdNumCreditos8;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRdMorConcpeto8(String rdMorConcpeto8) {
        this.rdMorConcpeto8 = rdMorConcpeto8;
    }

    public String getRdMorConcpeto8() {
        return this.rdMorConcpeto8;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorNumCtas8(BigDecimal rdMorNumCtas8) {
        this.rdMorNumCtas8 = rdMorNumCtas8;
    }

    public BigDecimal getRdMorNumCtas8() {
        return this.rdMorNumCtas8;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setRdMorPjeCtas8(BigDecimal rdMorPjeCtas8) {
        this.rdMorPjeCtas8 = rdMorPjeCtas8;
    }

    public BigDecimal getRdMorPjeCtas8() {
        return this.rdMorPjeCtas8;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRdMorImporte8(BigDecimal rdMorImporte8) {
        this.rdMorImporte8 = rdMorImporte8;
    }

    public BigDecimal getRdMorImporte8() {
        return this.rdMorImporte8;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REP_DISTRIB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRdIdPrograma() != null && this.getRdIdPrograma().longValue() == -999) {
            conditions += " AND RD_ID_PROGRAMA IS NULL";
        } else if (this.getRdIdPrograma() != null) {
            conditions += " AND RD_ID_PROGRAMA = ?";
            values.add(this.getRdIdPrograma());
        }

        if (this.getRdIdFideicomiso() != null && this.getRdIdFideicomiso().longValue() == -999) {
            conditions += " AND RD_ID_FIDEICOMISO IS NULL";
        } else if (this.getRdIdFideicomiso() != null) {
            conditions += " AND RD_ID_FIDEICOMISO = ?";
            values.add(this.getRdIdFideicomiso());
        }

        if (this.getRdIdEmision() != null && this.getRdIdEmision().longValue() == -999) {
            conditions += " AND RD_ID_EMISION IS NULL";
        } else if (this.getRdIdEmision() != null) {
            conditions += " AND RD_ID_EMISION = ?";
            values.add(this.getRdIdEmision());
        }

        if (this.getRdIdPeriodo() != null && this.getRdIdPeriodo().longValue() == -999) {
            conditions += " AND RD_ID_PERIODO IS NULL";
        } else if (this.getRdIdPeriodo() != null) {
            conditions += " AND RD_ID_PERIODO = ?";
            values.add(this.getRdIdPeriodo());
        }

        if (this.getRdIdSecInter() != null && this.getRdIdSecInter().longValue() == -999) {
            conditions += " AND RD_ID_SEC_INTER IS NULL";
        } else if (this.getRdIdSecInter() != null) {
            conditions += " AND RD_ID_SEC_INTER = ?";
            values.add(this.getRdIdSecInter());
        }

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getSelect() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REP_DISTRIB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRdIdPrograma() != null && this.getRdIdPrograma().longValue() == -999) {
            conditions += " AND RD_ID_PROGRAMA IS NULL";
        } else if (this.getRdIdPrograma() != null) {
            conditions += " AND RD_ID_PROGRAMA = ?";
            values.add(this.getRdIdPrograma());
        }

        if (this.getRdIdFideicomiso() != null && this.getRdIdFideicomiso().longValue() == -999) {
            conditions += " AND RD_ID_FIDEICOMISO IS NULL";
        } else if (this.getRdIdFideicomiso() != null) {
            conditions += " AND RD_ID_FIDEICOMISO = ?";
            values.add(this.getRdIdFideicomiso());
        }

        if (this.getRdIdEmision() != null && this.getRdIdEmision().longValue() == -999) {
            conditions += " AND RD_ID_EMISION IS NULL";
        } else if (this.getRdIdEmision() != null) {
            conditions += " AND RD_ID_EMISION = ?";
            values.add(this.getRdIdEmision());
        }

        if (this.getRdIdPeriodo() != null && this.getRdIdPeriodo().longValue() == -999) {
            conditions += " AND RD_ID_PERIODO IS NULL";
        } else if (this.getRdIdPeriodo() != null) {
            conditions += " AND RD_ID_PERIODO = ?";
            values.add(this.getRdIdPeriodo());
        }

        if (this.getRdIdSecInter() != null && this.getRdIdSecInter().longValue() == -999) {
            conditions += " AND RD_ID_SEC_INTER IS NULL";
        } else if (this.getRdIdSecInter() != null) {
            conditions += " AND RD_ID_SEC_INTER = ?";
            values.add(this.getRdIdSecInter());
        }

        if (this.getRdNomEmisor() != null && "null".equals(this.getRdNomEmisor())) {
            conditions += " AND RD_NOM_EMISOR IS NULL";
        } else if (this.getRdNomEmisor() != null) {
            conditions += " AND RD_NOM_EMISOR = ?";
            values.add(this.getRdNomEmisor());
        }

        if (this.getRdNomEmision() != null && "null".equals(this.getRdNomEmision())) {
            conditions += " AND RD_NOM_EMISION IS NULL";
        } else if (this.getRdNomEmision() != null) {
            conditions += " AND RD_NOM_EMISION = ?";
            values.add(this.getRdNomEmision());
        }

        if (this.getRdNomFideicomiso() != null && "null".equals(this.getRdNomFideicomiso())) {
            conditions += " AND RD_NOM_FIDEICOMISO IS NULL";
        } else if (this.getRdNomFideicomiso() != null) {
            conditions += " AND RD_NOM_FIDEICOMISO = ?";
            values.add(this.getRdNomFideicomiso());
        }

        if (this.getRdNomFideicomitente() != null && "null".equals(this.getRdNomFideicomitente())) {
            conditions += " AND RD_NOM_FIDEICOMITENTE IS NULL";
        } else if (this.getRdNomFideicomitente() != null) {
            conditions += " AND RD_NOM_FIDEICOMITENTE = ?";
            values.add(this.getRdNomFideicomitente());
        }

        if (this.getRdFechaEmision() != null && "null".equals(this.getRdFechaEmision())) {
            conditions += " AND RD_FECHA_EMISION IS NULL";
        } else if (this.getRdFechaEmision() != null) {
            conditions += " AND RD_FECHA_EMISION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRdFechaEmision());
        }

        if (this.getRdFechaDeterminacion() != null && "null".equals(this.getRdFechaDeterminacion())) {
            conditions += " AND RD_FECHA_DETERMINACION IS NULL";
        } else if (this.getRdFechaDeterminacion() != null) {
            conditions += " AND RD_FECHA_DETERMINACION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRdFechaDeterminacion());
        }

        if (this.getRdFechaInicio() != null && "null".equals(this.getRdFechaInicio())) {
            conditions += " AND RD_FECHA_INICIO IS NULL";
        } else if (this.getRdFechaInicio() != null) {
            conditions += " AND RD_FECHA_INICIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRdFechaInicio());
        }

        if (this.getRdFechaFin() != null && "null".equals(this.getRdFechaFin())) {
            conditions += " AND RD_FECHA_FIN IS NULL";
        } else if (this.getRdFechaFin() != null) {
            conditions += " AND RD_FECHA_FIN = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRdFechaFin());
        }

        if (this.getRdFechaPago() != null && "null".equals(this.getRdFechaPago())) {
            conditions += " AND RD_FECHA_PAGO IS NULL";
        } else if (this.getRdFechaPago() != null) {
            conditions += " AND RD_FECHA_PAGO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRdFechaPago());
        }

        if (this.getRdTasaUdi() != null && this.getRdTasaUdi().longValue() == -999) {
            conditions += " AND RD_TASA_UDI IS NULL";
        } else if (this.getRdTasaUdi() != null) {
            conditions += " AND RD_TASA_UDI = ?";
            values.add(this.getRdTasaUdi());
        }

        if (this.getRdDiasPeriodo() != null && this.getRdDiasPeriodo().longValue() == -999) {
            conditions += " AND RD_DIAS_PERIODO IS NULL";
        } else if (this.getRdDiasPeriodo() != null) {
            conditions += " AND RD_DIAS_PERIODO = ?";
            values.add(this.getRdDiasPeriodo());
        }

        if (this.getRdConceptoCobranzaInicial() != null && "null".equals(this.getRdConceptoCobranzaInicial())) {
            conditions += " AND RD_CONCEPTO_COBRANZA_INICIAL IS NULL";
        } else if (this.getRdConceptoCobranzaInicial() != null) {
            conditions += " AND RD_CONCEPTO_COBRANZA_INICIAL = ?";
            values.add(this.getRdConceptoCobranzaInicial());
        }

        if (this.getRdImpDepositoInicial() != null && this.getRdImpDepositoInicial().longValue() == -999) {
            conditions += " AND RD_IMP_DEPOSITO_INICIAL IS NULL";
        } else if (this.getRdImpDepositoInicial() != null) {
            conditions += " AND RD_IMP_DEPOSITO_INICIAL = ?";
            values.add(this.getRdImpDepositoInicial());
        }

        if (this.getRdConceptoCobranza1() != null && "null".equals(this.getRdConceptoCobranza1())) {
            conditions += " AND RD_CONCEPTO_COBRANZA_1 IS NULL";
        } else if (this.getRdConceptoCobranza1() != null) {
            conditions += " AND RD_CONCEPTO_COBRANZA_1 = ?";
            values.add(this.getRdConceptoCobranza1());
        }

        if (this.getRdImpDeposito1() != null && this.getRdImpDeposito1().longValue() == -999) {
            conditions += " AND RD_IMP_DEPOSITO_1 IS NULL";
        } else if (this.getRdImpDeposito1() != null) {
            conditions += " AND RD_IMP_DEPOSITO_1 = ?";
            values.add(this.getRdImpDeposito1());
        }

        if (this.getRdConceptoCobranza2() != null && "null".equals(this.getRdConceptoCobranza2())) {
            conditions += " AND RD_CONCEPTO_COBRANZA_2 IS NULL";
        } else if (this.getRdConceptoCobranza2() != null) {
            conditions += " AND RD_CONCEPTO_COBRANZA_2 = ?";
            values.add(this.getRdConceptoCobranza2());
        }

        if (this.getRdImpDeposito2() != null && this.getRdImpDeposito2().longValue() == -999) {
            conditions += " AND RD_IMP_DEPOSITO_2 IS NULL";
        } else if (this.getRdImpDeposito2() != null) {
            conditions += " AND RD_IMP_DEPOSITO_2 = ?";
            values.add(this.getRdImpDeposito2());
        }

        if (this.getRdConceptoCobranza3() != null && "null".equals(this.getRdConceptoCobranza3())) {
            conditions += " AND RD_CONCEPTO_COBRANZA_3 IS NULL";
        } else if (this.getRdConceptoCobranza3() != null) {
            conditions += " AND RD_CONCEPTO_COBRANZA_3 = ?";
            values.add(this.getRdConceptoCobranza3());
        }

        if (this.getRdImpDeposito3() != null && this.getRdImpDeposito3().longValue() == -999) {
            conditions += " AND RD_IMP_DEPOSITO_3 IS NULL";
        } else if (this.getRdImpDeposito3() != null) {
            conditions += " AND RD_IMP_DEPOSITO_3 = ?";
            values.add(this.getRdImpDeposito3());
        }

        if (this.getRdConceptoIntereses() != null && "null".equals(this.getRdConceptoIntereses())) {
            conditions += " AND RD_CONCEPTO_INTERESES IS NULL";
        } else if (this.getRdConceptoIntereses() != null) {
            conditions += " AND RD_CONCEPTO_INTERESES = ?";
            values.add(this.getRdConceptoIntereses());
        }

        if (this.getRdImpIntereses() != null && this.getRdImpIntereses().longValue() == -999) {
            conditions += " AND RD_IMP_INTERESES IS NULL";
        } else if (this.getRdImpIntereses() != null) {
            conditions += " AND RD_IMP_INTERESES = ?";
            values.add(this.getRdImpIntereses());
        }

        if (this.getRdIsr() != null && "null".equals(this.getRdIsr())) {
            conditions += " AND RD_ISR IS NULL";
        } else if (this.getRdIsr() != null) {
            conditions += " AND RD_ISR = ?";
            values.add(this.getRdIsr());
        }

        if (this.getRdImpIsr() != null && this.getRdImpIsr().longValue() == -999) {
            conditions += " AND RD_IMP_ISR IS NULL";
        } else if (this.getRdImpIsr() != null) {
            conditions += " AND RD_IMP_ISR = ?";
            values.add(this.getRdImpIsr());
        }

        if (this.getRdConceptoCobranzaTotal() != null && "null".equals(this.getRdConceptoCobranzaTotal())) {
            conditions += " AND RD_CONCEPTO_COBRANZA_TOTAL IS NULL";
        } else if (this.getRdConceptoCobranzaTotal() != null) {
            conditions += " AND RD_CONCEPTO_COBRANZA_TOTAL = ?";
            values.add(this.getRdConceptoCobranzaTotal());
        }

        if (this.getRdImpDepositoTotal() != null && this.getRdImpDepositoTotal().longValue() == -999) {
            conditions += " AND RD_IMP_DEPOSITO_TOTAL IS NULL";
        } else if (this.getRdImpDepositoTotal() != null) {
            conditions += " AND RD_IMP_DEPOSITO_TOTAL = ?";
            values.add(this.getRdImpDepositoTotal());
        }

        if (this.getRdImpGastosPermitidos() != null && this.getRdImpGastosPermitidos().longValue() == -999) {
            conditions += " AND RD_IMP_GASTOS_PERMITIDOS IS NULL";
        } else if (this.getRdImpGastosPermitidos() != null) {
            conditions += " AND RD_IMP_GASTOS_PERMITIDOS = ?";
            values.add(this.getRdImpGastosPermitidos());
        }

        if (this.getRdImpHonoFid() != null && this.getRdImpHonoFid().longValue() == -999) {
            conditions += " AND RD_IMP_HONO_FID IS NULL";
        } else if (this.getRdImpHonoFid() != null) {
            conditions += " AND RD_IMP_HONO_FID = ?";
            values.add(this.getRdImpHonoFid());
        }

        if (this.getRdImpHonoRepComun() != null && this.getRdImpHonoRepComun().longValue() == -999) {
            conditions += " AND RD_IMP_HONO_REP_COMUN IS NULL";
        } else if (this.getRdImpHonoRepComun() != null) {
            conditions += " AND RD_IMP_HONO_REP_COMUN = ?";
            values.add(this.getRdImpHonoRepComun());
        }

        if (this.getRdImpHonoBmv() != null && this.getRdImpHonoBmv().longValue() == -999) {
            conditions += " AND RD_IMP_HONO_BMV IS NULL";
        } else if (this.getRdImpHonoBmv() != null) {
            conditions += " AND RD_IMP_HONO_BMV = ?";
            values.add(this.getRdImpHonoBmv());
        }

        if (this.getRdImpHonoCnvb() != null && this.getRdImpHonoCnvb().longValue() == -999) {
            conditions += " AND RD_IMP_HONO_CNVB IS NULL";
        } else if (this.getRdImpHonoCnvb() != null) {
            conditions += " AND RD_IMP_HONO_CNVB = ?";
            values.add(this.getRdImpHonoCnvb());
        }

        if (this.getRdImpHonoCalif() != null && this.getRdImpHonoCalif().longValue() == -999) {
            conditions += " AND RD_IMP_HONO_CALIF IS NULL";
        } else if (this.getRdImpHonoCalif() != null) {
            conditions += " AND RD_IMP_HONO_CALIF = ?";
            values.add(this.getRdImpHonoCalif());
        }

        if (this.getRdImpHonoAuditXt() != null && this.getRdImpHonoAuditXt().longValue() == -999) {
            conditions += " AND RD_IMP_HONO_AUDIT_XT IS NULL";
        } else if (this.getRdImpHonoAuditXt() != null) {
            conditions += " AND RD_IMP_HONO_AUDIT_XT = ?";
            values.add(this.getRdImpHonoAuditXt());
        }

        if (this.getRdImpHonoAuditXtRe() != null && this.getRdImpHonoAuditXtRe().longValue() == -999) {
            conditions += " AND RD_IMP_HONO_AUDIT_XT_RE IS NULL";
        } else if (this.getRdImpHonoAuditXtRe() != null) {
            conditions += " AND RD_IMP_HONO_AUDIT_XT_RE = ?";
            values.add(this.getRdImpHonoAuditXtRe());
        }

        if (this.getRdImpHonoLegales() != null && this.getRdImpHonoLegales().longValue() == -999) {
            conditions += " AND RD_IMP_HONO_LEGALES IS NULL";
        } else if (this.getRdImpHonoLegales() != null) {
            conditions += " AND RD_IMP_HONO_LEGALES = ?";
            values.add(this.getRdImpHonoLegales());
        }

        if (this.getRdImpAdministrador() != null && this.getRdImpAdministrador().longValue() == -999) {
            conditions += " AND RD_IMP_ADMINISTRADOR IS NULL";
        } else if (this.getRdImpAdministrador() != null) {
            conditions += " AND RD_IMP_ADMINISTRADOR = ?";
            values.add(this.getRdImpAdministrador());
        }

        if (this.getRdImpHonoPublicaciones() != null && this.getRdImpHonoPublicaciones().longValue() == -999) {
            conditions += " AND RD_IMP_HONO_PUBLICACIONES IS NULL";
        } else if (this.getRdImpHonoPublicaciones() != null) {
            conditions += " AND RD_IMP_HONO_PUBLICACIONES = ?";
            values.add(this.getRdImpHonoPublicaciones());
        }

        if (this.getRdImpOtros() != null && this.getRdImpOtros().longValue() == -999) {
            conditions += " AND RD_IMP_OTROS IS NULL";
        } else if (this.getRdImpOtros() != null) {
            conditions += " AND RD_IMP_OTROS = ?";
            values.add(this.getRdImpOtros());
        }

        if (this.getRdTotGastos() != null && this.getRdTotGastos().longValue() == -999) {
            conditions += " AND RD_TOT_GASTOS IS NULL";
        } else if (this.getRdTotGastos() != null) {
            conditions += " AND RD_TOT_GASTOS = ?";
            values.add(this.getRdTotGastos());
        }

        if (this.getRdTotDisponible() != null && this.getRdTotDisponible().longValue() == -999) {
            conditions += " AND RD_TOT_DISPONIBLE IS NULL";
        } else if (this.getRdTotDisponible() != null) {
            conditions += " AND RD_TOT_DISPONIBLE = ?";
            values.add(this.getRdTotDisponible());
        }

        if (this.getRdPizarra1() != null && "null".equals(this.getRdPizarra1())) {
            conditions += " AND RD_PIZARRA1 IS NULL";
        } else if (this.getRdPizarra1() != null) {
            conditions += " AND RD_PIZARRA1 = ?";
            values.add(this.getRdPizarra1());
        }

        if (this.getRdSerie1() != null && "null".equals(this.getRdSerie1())) {
            conditions += " AND RD_SERIE1 IS NULL";
        } else if (this.getRdSerie1() != null) {
            conditions += " AND RD_SERIE1 = ?";
            values.add(this.getRdSerie1());
        }

        if (this.getRdIntPendientes() != null && this.getRdIntPendientes().longValue() == -999) {
            conditions += " AND RD_INT_PENDIENTES IS NULL";
        } else if (this.getRdIntPendientes() != null) {
            conditions += " AND RD_INT_PENDIENTES = ?";
            values.add(this.getRdIntPendientes());
        }

        if (this.getRdConceptoPagoIntereses() != null && "null".equals(this.getRdConceptoPagoIntereses())) {
            conditions += " AND RD_CONCEPTO_PAGO_INTERESES IS NULL";
        } else if (this.getRdConceptoPagoIntereses() != null) {
            conditions += " AND RD_CONCEPTO_PAGO_INTERESES = ?";
            values.add(this.getRdConceptoPagoIntereses());
        }

        if (this.getRdPagoIntereses() != null && this.getRdPagoIntereses().longValue() == -999) {
            conditions += " AND RD_PAGO_INTERESES IS NULL";
        } else if (this.getRdPagoIntereses() != null) {
            conditions += " AND RD_PAGO_INTERESES = ?";
            values.add(this.getRdPagoIntereses());
        }

        if (this.getRdAmorPrincipal() != null && this.getRdAmorPrincipal().longValue() == -999) {
            conditions += " AND RD_AMOR_PRINCIPAL IS NULL";
        } else if (this.getRdAmorPrincipal() != null) {
            conditions += " AND RD_AMOR_PRINCIPAL = ?";
            values.add(this.getRdAmorPrincipal());
        }

        if (this.getRdAmorCarVen() != null && this.getRdAmorCarVen().longValue() == -999) {
            conditions += " AND RD_AMOR_CAR_VEN IS NULL";
        } else if (this.getRdAmorCarVen() != null) {
            conditions += " AND RD_AMOR_CAR_VEN = ?";
            values.add(this.getRdAmorCarVen());
        }

        if (this.getRdInterPendPerAnt() != null && this.getRdInterPendPerAnt().longValue() == -999) {
            conditions += " AND RD_INTER_PEND_PER_ANT IS NULL";
        } else if (this.getRdInterPendPerAnt() != null) {
            conditions += " AND RD_INTER_PEND_PER_ANT = ?";
            values.add(this.getRdInterPendPerAnt());
        }

        if (this.getRdConceptopagoIntInstSub() != null && "null".equals(this.getRdConceptopagoIntInstSub())) {
            conditions += " AND RD_CONCEPTOPAGO_INT_INST_SUB IS NULL";
        } else if (this.getRdConceptopagoIntInstSub() != null) {
            conditions += " AND RD_CONCEPTOPAGO_INT_INST_SUB = ?";
            values.add(this.getRdConceptopagoIntInstSub());
        }

        if (this.getRdPagoIntInstSub() != null && this.getRdPagoIntInstSub().longValue() == -999) {
            conditions += " AND RD_PAGO_INT_INST_SUB IS NULL";
        } else if (this.getRdPagoIntInstSub() != null) {
            conditions += " AND RD_PAGO_INT_INST_SUB = ?";
            values.add(this.getRdPagoIntInstSub());
        }

        if (this.getRdAmorAntPrincipal() != null && this.getRdAmorAntPrincipal().longValue() == -999) {
            conditions += " AND RD_AMOR_ANT_PRINCIPAL IS NULL";
        } else if (this.getRdAmorAntPrincipal() != null) {
            conditions += " AND RD_AMOR_ANT_PRINCIPAL = ?";
            values.add(this.getRdAmorAntPrincipal());
        }

        if (this.getRdImportePagar() != null && this.getRdImportePagar().longValue() == -999) {
            conditions += " AND RD_IMPORTE_PAGAR IS NULL";
        } else if (this.getRdImportePagar() != null) {
            conditions += " AND RD_IMPORTE_PAGAR = ?";
            values.add(this.getRdImportePagar());
        }

        if (this.getRdNumTitulos() != null && this.getRdNumTitulos().longValue() == -999) {
            conditions += " AND RD_NUM_TITULOS IS NULL";
        } else if (this.getRdNumTitulos() != null) {
            conditions += " AND RD_NUM_TITULOS = ?";
            values.add(this.getRdNumTitulos());
        }

        if (this.getRdValNomInicial() != null && this.getRdValNomInicial().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_INICIAL IS NULL";
        } else if (this.getRdValNomInicial() != null) {
            conditions += " AND RD_VAL_NOM_INICIAL = ?";
            values.add(this.getRdValNomInicial());
        }

        if (this.getRdValNomInicialConv() != null && this.getRdValNomInicialConv().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_INICIAL_CONV IS NULL";
        } else if (this.getRdValNomInicialConv() != null) {
            conditions += " AND RD_VAL_NOM_INICIAL_CONV = ?";
            values.add(this.getRdValNomInicialConv());
        }

        if (this.getRdValNomAjustado() != null && this.getRdValNomAjustado().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_AJUSTADO IS NULL";
        } else if (this.getRdValNomAjustado() != null) {
            conditions += " AND RD_VAL_NOM_AJUSTADO = ?";
            values.add(this.getRdValNomAjustado());
        }

        if (this.getRdValNomAjustadoConv() != null && this.getRdValNomAjustadoConv().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_AJUSTADO_CONV IS NULL";
        } else if (this.getRdValNomAjustadoConv() != null) {
            conditions += " AND RD_VAL_NOM_AJUSTADO_CONV = ?";
            values.add(this.getRdValNomAjustadoConv());
        }

        if (this.getRdFactorPorrata() != null && this.getRdFactorPorrata().longValue() == -999) {
            conditions += " AND RD_FACTOR_PORRATA IS NULL";
        } else if (this.getRdFactorPorrata() != null) {
            conditions += " AND RD_FACTOR_PORRATA = ?";
            values.add(this.getRdFactorPorrata());
        }

        if (this.getRdTasaInteres() != null && this.getRdTasaInteres().longValue() == -999) {
            conditions += " AND RD_TASA_INTERES IS NULL";
        } else if (this.getRdTasaInteres() != null) {
            conditions += " AND RD_TASA_INTERES = ?";
            values.add(this.getRdTasaInteres());
        }

        if (this.getRdIntereses() != null && this.getRdIntereses().longValue() == -999) {
            conditions += " AND RD_INTERESES IS NULL";
        } else if (this.getRdIntereses() != null) {
            conditions += " AND RD_INTERESES = ?";
            values.add(this.getRdIntereses());
        }

        if (this.getRdInteresesConv() != null && this.getRdInteresesConv().longValue() == -999) {
            conditions += " AND RD_INTERESES_CONV IS NULL";
        } else if (this.getRdInteresesConv() != null) {
            conditions += " AND RD_INTERESES_CONV = ?";
            values.add(this.getRdInteresesConv());
        }

        if (this.getRdVanIniEmision() != null && this.getRdVanIniEmision().longValue() == -999) {
            conditions += " AND RD_VAN_INI_EMISION IS NULL";
        } else if (this.getRdVanIniEmision() != null) {
            conditions += " AND RD_VAN_INI_EMISION = ?";
            values.add(this.getRdVanIniEmision());
        }

        if (this.getRdAmortizacion() != null && this.getRdAmortizacion().longValue() == -999) {
            conditions += " AND RD_AMORTIZACION IS NULL";
        } else if (this.getRdAmortizacion() != null) {
            conditions += " AND RD_AMORTIZACION = ?";
            values.add(this.getRdAmortizacion());
        }

        if (this.getRdAmortizacionConv() != null && this.getRdAmortizacionConv().longValue() == -999) {
            conditions += " AND RD_AMORTIZACION_CONV IS NULL";
        } else if (this.getRdAmortizacionConv() != null) {
            conditions += " AND RD_AMORTIZACION_CONV = ?";
            values.add(this.getRdAmortizacionConv());
        }

        if (this.getRdVanAjustadoEmi() != null && this.getRdVanAjustadoEmi().longValue() == -999) {
            conditions += " AND RD_VAN_AJUSTADO_EMI IS NULL";
        } else if (this.getRdVanAjustadoEmi() != null) {
            conditions += " AND RD_VAN_AJUSTADO_EMI = ?";
            values.add(this.getRdVanAjustadoEmi());
        }

        if (this.getRdPizarra2() != null && "null".equals(this.getRdPizarra2())) {
            conditions += " AND RD_PIZARRA2 IS NULL";
        } else if (this.getRdPizarra2() != null) {
            conditions += " AND RD_PIZARRA2 = ?";
            values.add(this.getRdPizarra2());
        }

        if (this.getRdSerie2() != null && "null".equals(this.getRdSerie2())) {
            conditions += " AND RD_SERIE2 IS NULL";
        } else if (this.getRdSerie2() != null) {
            conditions += " AND RD_SERIE2 = ?";
            values.add(this.getRdSerie2());
        }

        if (this.getRdIntPendientes2() != null && this.getRdIntPendientes2().longValue() == -999) {
            conditions += " AND RD_INT_PENDIENTES2 IS NULL";
        } else if (this.getRdIntPendientes2() != null) {
            conditions += " AND RD_INT_PENDIENTES2 = ?";
            values.add(this.getRdIntPendientes2());
        }

        if (this.getRdConceptoPagoIntereses2() != null && "null".equals(this.getRdConceptoPagoIntereses2())) {
            conditions += " AND RD_CONCEPTO_PAGO_INTERESES2 IS NULL";
        } else if (this.getRdConceptoPagoIntereses2() != null) {
            conditions += " AND RD_CONCEPTO_PAGO_INTERESES2 = ?";
            values.add(this.getRdConceptoPagoIntereses2());
        }

        if (this.getRdPagoIntereses2() != null && this.getRdPagoIntereses2().longValue() == -999) {
            conditions += " AND RD_PAGO_INTERESES2 IS NULL";
        } else if (this.getRdPagoIntereses2() != null) {
            conditions += " AND RD_PAGO_INTERESES2 = ?";
            values.add(this.getRdPagoIntereses2());
        }

        if (this.getRdAmorPrincipal2() != null && this.getRdAmorPrincipal2().longValue() == -999) {
            conditions += " AND RD_AMOR_PRINCIPAL2 IS NULL";
        } else if (this.getRdAmorPrincipal2() != null) {
            conditions += " AND RD_AMOR_PRINCIPAL2 = ?";
            values.add(this.getRdAmorPrincipal2());
        }

        if (this.getRdAmorCarVen2() != null && this.getRdAmorCarVen2().longValue() == -999) {
            conditions += " AND RD_AMOR_CAR_VEN2 IS NULL";
        } else if (this.getRdAmorCarVen2() != null) {
            conditions += " AND RD_AMOR_CAR_VEN2 = ?";
            values.add(this.getRdAmorCarVen2());
        }

        if (this.getRdInterPendPerAnt2() != null && this.getRdInterPendPerAnt2().longValue() == -999) {
            conditions += " AND RD_INTER_PEND_PER_ANT2 IS NULL";
        } else if (this.getRdInterPendPerAnt2() != null) {
            conditions += " AND RD_INTER_PEND_PER_ANT2 = ?";
            values.add(this.getRdInterPendPerAnt2());
        }

        if (this.getRdConceptopagoIntInstSub2() != null && "null".equals(this.getRdConceptopagoIntInstSub2())) {
            conditions += " AND RD_CONCEPTOPAGO_INT_INST_SUB2 IS NULL";
        } else if (this.getRdConceptopagoIntInstSub2() != null) {
            conditions += " AND RD_CONCEPTOPAGO_INT_INST_SUB2 = ?";
            values.add(this.getRdConceptopagoIntInstSub2());
        }

        if (this.getRdPagoIntInstSub2() != null && this.getRdPagoIntInstSub2().longValue() == -999) {
            conditions += " AND RD_PAGO_INT_INST_SUB2 IS NULL";
        } else if (this.getRdPagoIntInstSub2() != null) {
            conditions += " AND RD_PAGO_INT_INST_SUB2 = ?";
            values.add(this.getRdPagoIntInstSub2());
        }

        if (this.getRdAmorAntPrincipal2() != null && this.getRdAmorAntPrincipal2().longValue() == -999) {
            conditions += " AND RD_AMOR_ANT_PRINCIPAL2 IS NULL";
        } else if (this.getRdAmorAntPrincipal2() != null) {
            conditions += " AND RD_AMOR_ANT_PRINCIPAL2 = ?";
            values.add(this.getRdAmorAntPrincipal2());
        }

        if (this.getRdImportePagar2() != null && this.getRdImportePagar2().longValue() == -999) {
            conditions += " AND RD_IMPORTE_PAGAR2 IS NULL";
        } else if (this.getRdImportePagar2() != null) {
            conditions += " AND RD_IMPORTE_PAGAR2 = ?";
            values.add(this.getRdImportePagar2());
        }

        if (this.getRdNumTitulos2() != null && this.getRdNumTitulos2().longValue() == -999) {
            conditions += " AND RD_NUM_TITULOS2 IS NULL";
        } else if (this.getRdNumTitulos2() != null) {
            conditions += " AND RD_NUM_TITULOS2 = ?";
            values.add(this.getRdNumTitulos2());
        }

        if (this.getRdValNomInicial2() != null && this.getRdValNomInicial2().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_INICIAL2 IS NULL";
        } else if (this.getRdValNomInicial2() != null) {
            conditions += " AND RD_VAL_NOM_INICIAL2 = ?";
            values.add(this.getRdValNomInicial2());
        }

        if (this.getRdValNomInicialConv2() != null && this.getRdValNomInicialConv2().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_INICIAL_CONV2 IS NULL";
        } else if (this.getRdValNomInicialConv2() != null) {
            conditions += " AND RD_VAL_NOM_INICIAL_CONV2 = ?";
            values.add(this.getRdValNomInicialConv2());
        }

        if (this.getRdValNomAjustado2() != null && this.getRdValNomAjustado2().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_AJUSTADO2 IS NULL";
        } else if (this.getRdValNomAjustado2() != null) {
            conditions += " AND RD_VAL_NOM_AJUSTADO2 = ?";
            values.add(this.getRdValNomAjustado2());
        }

        if (this.getRdValNomAjustadoConv2() != null && this.getRdValNomAjustadoConv2().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_AJUSTADO_CONV2 IS NULL";
        } else if (this.getRdValNomAjustadoConv2() != null) {
            conditions += " AND RD_VAL_NOM_AJUSTADO_CONV2 = ?";
            values.add(this.getRdValNomAjustadoConv2());
        }

        if (this.getRdFactorPorrata2() != null && this.getRdFactorPorrata2().longValue() == -999) {
            conditions += " AND RD_FACTOR_PORRATA2 IS NULL";
        } else if (this.getRdFactorPorrata2() != null) {
            conditions += " AND RD_FACTOR_PORRATA2 = ?";
            values.add(this.getRdFactorPorrata2());
        }

        if (this.getRdTasaInteres2() != null && this.getRdTasaInteres2().longValue() == -999) {
            conditions += " AND RD_TASA_INTERES2 IS NULL";
        } else if (this.getRdTasaInteres2() != null) {
            conditions += " AND RD_TASA_INTERES2 = ?";
            values.add(this.getRdTasaInteres2());
        }

        if (this.getRdIntereses2() != null && this.getRdIntereses2().longValue() == -999) {
            conditions += " AND RD_INTERESES2 IS NULL";
        } else if (this.getRdIntereses2() != null) {
            conditions += " AND RD_INTERESES2 = ?";
            values.add(this.getRdIntereses2());
        }

        if (this.getRdInteresesConv2() != null && this.getRdInteresesConv2().longValue() == -999) {
            conditions += " AND RD_INTERESES_CONV2 IS NULL";
        } else if (this.getRdInteresesConv2() != null) {
            conditions += " AND RD_INTERESES_CONV2 = ?";
            values.add(this.getRdInteresesConv2());
        }

        if (this.getRdVanIniEmision2() != null && this.getRdVanIniEmision2().longValue() == -999) {
            conditions += " AND RD_VAN_INI_EMISION2 IS NULL";
        } else if (this.getRdVanIniEmision2() != null) {
            conditions += " AND RD_VAN_INI_EMISION2 = ?";
            values.add(this.getRdVanIniEmision2());
        }

        if (this.getRdAmortizacion2() != null && this.getRdAmortizacion2().longValue() == -999) {
            conditions += " AND RD_AMORTIZACION2 IS NULL";
        } else if (this.getRdAmortizacion2() != null) {
            conditions += " AND RD_AMORTIZACION2 = ?";
            values.add(this.getRdAmortizacion2());
        }

        if (this.getRdAmortizacionConv2() != null && this.getRdAmortizacionConv2().longValue() == -999) {
            conditions += " AND RD_AMORTIZACION_CONV2 IS NULL";
        } else if (this.getRdAmortizacionConv2() != null) {
            conditions += " AND RD_AMORTIZACION_CONV2 = ?";
            values.add(this.getRdAmortizacionConv2());
        }

        if (this.getRdVanAjustadoEmi2() != null && this.getRdVanAjustadoEmi2().longValue() == -999) {
            conditions += " AND RD_VAN_AJUSTADO_EMI2 IS NULL";
        } else if (this.getRdVanAjustadoEmi2() != null) {
            conditions += " AND RD_VAN_AJUSTADO_EMI2 = ?";
            values.add(this.getRdVanAjustadoEmi2());
        }

        if (this.getRdPizarra3() != null && "null".equals(this.getRdPizarra3())) {
            conditions += " AND RD_PIZARRA3 IS NULL";
        } else if (this.getRdPizarra3() != null) {
            conditions += " AND RD_PIZARRA3 = ?";
            values.add(this.getRdPizarra3());
        }

        if (this.getRdSerie3() != null && "null".equals(this.getRdSerie3())) {
            conditions += " AND RD_SERIE3 IS NULL";
        } else if (this.getRdSerie3() != null) {
            conditions += " AND RD_SERIE3 = ?";
            values.add(this.getRdSerie3());
        }

        if (this.getRdIntPendientes3() != null && this.getRdIntPendientes3().longValue() == -999) {
            conditions += " AND RD_INT_PENDIENTES3 IS NULL";
        } else if (this.getRdIntPendientes3() != null) {
            conditions += " AND RD_INT_PENDIENTES3 = ?";
            values.add(this.getRdIntPendientes3());
        }

        if (this.getRdConceptoPagoIntereses3() != null && "null".equals(this.getRdConceptoPagoIntereses3())) {
            conditions += " AND RD_CONCEPTO_PAGO_INTERESES3 IS NULL";
        } else if (this.getRdConceptoPagoIntereses3() != null) {
            conditions += " AND RD_CONCEPTO_PAGO_INTERESES3 = ?";
            values.add(this.getRdConceptoPagoIntereses3());
        }

        if (this.getRdPagoIntereses3() != null && this.getRdPagoIntereses3().longValue() == -999) {
            conditions += " AND RD_PAGO_INTERESES3 IS NULL";
        } else if (this.getRdPagoIntereses3() != null) {
            conditions += " AND RD_PAGO_INTERESES3 = ?";
            values.add(this.getRdPagoIntereses3());
        }

        if (this.getRdAmorPrincipal3() != null && this.getRdAmorPrincipal3().longValue() == -999) {
            conditions += " AND RD_AMOR_PRINCIPAL3 IS NULL";
        } else if (this.getRdAmorPrincipal3() != null) {
            conditions += " AND RD_AMOR_PRINCIPAL3 = ?";
            values.add(this.getRdAmorPrincipal3());
        }

        if (this.getRdAmorCarVen3() != null && this.getRdAmorCarVen3().longValue() == -999) {
            conditions += " AND RD_AMOR_CAR_VEN3 IS NULL";
        } else if (this.getRdAmorCarVen3() != null) {
            conditions += " AND RD_AMOR_CAR_VEN3 = ?";
            values.add(this.getRdAmorCarVen3());
        }

        if (this.getRdInterPendPerAnt3() != null && this.getRdInterPendPerAnt3().longValue() == -999) {
            conditions += " AND RD_INTER_PEND_PER_ANT3 IS NULL";
        } else if (this.getRdInterPendPerAnt3() != null) {
            conditions += " AND RD_INTER_PEND_PER_ANT3 = ?";
            values.add(this.getRdInterPendPerAnt3());
        }

        if (this.getRdConceptopagoIntInstSub3() != null && "null".equals(this.getRdConceptopagoIntInstSub3())) {
            conditions += " AND RD_CONCEPTOPAGO_INT_INST_SUB3 IS NULL";
        } else if (this.getRdConceptopagoIntInstSub3() != null) {
            conditions += " AND RD_CONCEPTOPAGO_INT_INST_SUB3 = ?";
            values.add(this.getRdConceptopagoIntInstSub3());
        }

        if (this.getRdPagoIntInstSub3() != null && this.getRdPagoIntInstSub3().longValue() == -999) {
            conditions += " AND RD_PAGO_INT_INST_SUB3 IS NULL";
        } else if (this.getRdPagoIntInstSub3() != null) {
            conditions += " AND RD_PAGO_INT_INST_SUB3 = ?";
            values.add(this.getRdPagoIntInstSub3());
        }

        if (this.getRdAmorAntPrincipal3() != null && this.getRdAmorAntPrincipal3().longValue() == -999) {
            conditions += " AND RD_AMOR_ANT_PRINCIPAL3 IS NULL";
        } else if (this.getRdAmorAntPrincipal3() != null) {
            conditions += " AND RD_AMOR_ANT_PRINCIPAL3 = ?";
            values.add(this.getRdAmorAntPrincipal3());
        }

        if (this.getRdImportePagar3() != null && this.getRdImportePagar3().longValue() == -999) {
            conditions += " AND RD_IMPORTE_PAGAR3 IS NULL";
        } else if (this.getRdImportePagar3() != null) {
            conditions += " AND RD_IMPORTE_PAGAR3 = ?";
            values.add(this.getRdImportePagar3());
        }

        if (this.getRdNumTitulos3() != null && this.getRdNumTitulos3().longValue() == -999) {
            conditions += " AND RD_NUM_TITULOS3 IS NULL";
        } else if (this.getRdNumTitulos3() != null) {
            conditions += " AND RD_NUM_TITULOS3 = ?";
            values.add(this.getRdNumTitulos3());
        }

        if (this.getRdValNomInicial3() != null && this.getRdValNomInicial3().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_INICIAL3 IS NULL";
        } else if (this.getRdValNomInicial3() != null) {
            conditions += " AND RD_VAL_NOM_INICIAL3 = ?";
            values.add(this.getRdValNomInicial3());
        }

        if (this.getRdValNomInicialConv3() != null && this.getRdValNomInicialConv3().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_INICIAL_CONV3 IS NULL";
        } else if (this.getRdValNomInicialConv3() != null) {
            conditions += " AND RD_VAL_NOM_INICIAL_CONV3 = ?";
            values.add(this.getRdValNomInicialConv3());
        }

        if (this.getRdValNomAjustado3() != null && this.getRdValNomAjustado3().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_AJUSTADO3 IS NULL";
        } else if (this.getRdValNomAjustado3() != null) {
            conditions += " AND RD_VAL_NOM_AJUSTADO3 = ?";
            values.add(this.getRdValNomAjustado3());
        }

        if (this.getRdValNomAjustadoConv3() != null && this.getRdValNomAjustadoConv3().longValue() == -999) {
            conditions += " AND RD_VAL_NOM_AJUSTADO_CONV3 IS NULL";
        } else if (this.getRdValNomAjustadoConv3() != null) {
            conditions += " AND RD_VAL_NOM_AJUSTADO_CONV3 = ?";
            values.add(this.getRdValNomAjustadoConv3());
        }

        if (this.getRdFactorPorrata3() != null && this.getRdFactorPorrata3().longValue() == -999) {
            conditions += " AND RD_FACTOR_PORRATA3 IS NULL";
        } else if (this.getRdFactorPorrata3() != null) {
            conditions += " AND RD_FACTOR_PORRATA3 = ?";
            values.add(this.getRdFactorPorrata3());
        }

        if (this.getRdTasaInteres3() != null && this.getRdTasaInteres3().longValue() == -999) {
            conditions += " AND RD_TASA_INTERES3 IS NULL";
        } else if (this.getRdTasaInteres3() != null) {
            conditions += " AND RD_TASA_INTERES3 = ?";
            values.add(this.getRdTasaInteres3());
        }

        if (this.getRdIntereses3() != null && this.getRdIntereses3().longValue() == -999) {
            conditions += " AND RD_INTERESES3 IS NULL";
        } else if (this.getRdIntereses3() != null) {
            conditions += " AND RD_INTERESES3 = ?";
            values.add(this.getRdIntereses3());
        }

        if (this.getRdInteresesConv3() != null && this.getRdInteresesConv3().longValue() == -999) {
            conditions += " AND RD_INTERESES_CONV3 IS NULL";
        } else if (this.getRdInteresesConv3() != null) {
            conditions += " AND RD_INTERESES_CONV3 = ?";
            values.add(this.getRdInteresesConv3());
        }

        if (this.getRdVanIniEmision3() != null && this.getRdVanIniEmision3().longValue() == -999) {
            conditions += " AND RD_VAN_INI_EMISION3 IS NULL";
        } else if (this.getRdVanIniEmision3() != null) {
            conditions += " AND RD_VAN_INI_EMISION3 = ?";
            values.add(this.getRdVanIniEmision3());
        }

        if (this.getRdAmortizacion3() != null && this.getRdAmortizacion3().longValue() == -999) {
            conditions += " AND RD_AMORTIZACION3 IS NULL";
        } else if (this.getRdAmortizacion3() != null) {
            conditions += " AND RD_AMORTIZACION3 = ?";
            values.add(this.getRdAmortizacion3());
        }

        if (this.getRdAmortizacionConv3() != null && this.getRdAmortizacionConv3().longValue() == -999) {
            conditions += " AND RD_AMORTIZACION_CONV3 IS NULL";
        } else if (this.getRdAmortizacionConv3() != null) {
            conditions += " AND RD_AMORTIZACION_CONV3 = ?";
            values.add(this.getRdAmortizacionConv3());
        }

        if (this.getRdVanAjustadoEmi3() != null && this.getRdVanAjustadoEmi3().longValue() == -999) {
            conditions += " AND RD_VAN_AJUSTADO_EMI3 IS NULL";
        } else if (this.getRdVanAjustadoEmi3() != null) {
            conditions += " AND RD_VAN_AJUSTADO_EMI3 = ?";
            values.add(this.getRdVanAjustadoEmi3());
        }

        if (this.getRdSalFinCartera() != null && this.getRdSalFinCartera().longValue() == -999) {
            conditions += " AND RD_SAL_FIN_CARTERA IS NULL";
        } else if (this.getRdSalFinCartera() != null) {
            conditions += " AND RD_SAL_FIN_CARTERA = ?";
            values.add(this.getRdSalFinCartera());
        }

        if (this.getRdNumCreditos() != null && this.getRdNumCreditos().longValue() == -999) {
            conditions += " AND RD_NUM_CREDITOS IS NULL";
        } else if (this.getRdNumCreditos() != null) {
            conditions += " AND RD_NUM_CREDITOS = ?";
            values.add(this.getRdNumCreditos());
        }

        if (this.getRdMorConcpeto1() != null && "null".equals(this.getRdMorConcpeto1())) {
            conditions += " AND RD_MOR_CONCPETO1 IS NULL";
        } else if (this.getRdMorConcpeto1() != null) {
            conditions += " AND RD_MOR_CONCPETO1 = ?";
            values.add(this.getRdMorConcpeto1());
        }

        if (this.getRdMorNumCtas1() != null && this.getRdMorNumCtas1().longValue() == -999) {
            conditions += " AND RD_MOR_NUM_CTAS1 IS NULL";
        } else if (this.getRdMorNumCtas1() != null) {
            conditions += " AND RD_MOR_NUM_CTAS1 = ?";
            values.add(this.getRdMorNumCtas1());
        }

        if (this.getRdMorPjeCtas1() != null && this.getRdMorPjeCtas1().longValue() == -999) {
            conditions += " AND RD_MOR_PJE_CTAS1 IS NULL";
        } else if (this.getRdMorPjeCtas1() != null) {
            conditions += " AND RD_MOR_PJE_CTAS1 = ?";
            values.add(this.getRdMorPjeCtas1());
        }

        if (this.getRdMorImporte1() != null && this.getRdMorImporte1().longValue() == -999) {
            conditions += " AND RD_MOR_IMPORTE1 IS NULL";
        } else if (this.getRdMorImporte1() != null) {
            conditions += " AND RD_MOR_IMPORTE1 = ?";
            values.add(this.getRdMorImporte1());
        }

        if (this.getRdMorConcpeto2() != null && "null".equals(this.getRdMorConcpeto2())) {
            conditions += " AND RD_MOR_CONCPETO2 IS NULL";
        } else if (this.getRdMorConcpeto2() != null) {
            conditions += " AND RD_MOR_CONCPETO2 = ?";
            values.add(this.getRdMorConcpeto2());
        }

        if (this.getRdMorNumCtas2() != null && this.getRdMorNumCtas2().longValue() == -999) {
            conditions += " AND RD_MOR_NUM_CTAS2 IS NULL";
        } else if (this.getRdMorNumCtas2() != null) {
            conditions += " AND RD_MOR_NUM_CTAS2 = ?";
            values.add(this.getRdMorNumCtas2());
        }

        if (this.getRdMorPjeCtas2() != null && this.getRdMorPjeCtas2().longValue() == -999) {
            conditions += " AND RD_MOR_PJE_CTAS2 IS NULL";
        } else if (this.getRdMorPjeCtas2() != null) {
            conditions += " AND RD_MOR_PJE_CTAS2 = ?";
            values.add(this.getRdMorPjeCtas2());
        }

        if (this.getRdMorImporte2() != null && this.getRdMorImporte2().longValue() == -999) {
            conditions += " AND RD_MOR_IMPORTE2 IS NULL";
        } else if (this.getRdMorImporte2() != null) {
            conditions += " AND RD_MOR_IMPORTE2 = ?";
            values.add(this.getRdMorImporte2());
        }

        if (this.getRdNumCreditos3() != null && this.getRdNumCreditos3().longValue() == -999) {
            conditions += " AND RD_NUM_CREDITOS3 IS NULL";
        } else if (this.getRdNumCreditos3() != null) {
            conditions += " AND RD_NUM_CREDITOS3 = ?";
            values.add(this.getRdNumCreditos3());
        }

        if (this.getRdMorConcpeto3() != null && "null".equals(this.getRdMorConcpeto3())) {
            conditions += " AND RD_MOR_CONCPETO3 IS NULL";
        } else if (this.getRdMorConcpeto3() != null) {
            conditions += " AND RD_MOR_CONCPETO3 = ?";
            values.add(this.getRdMorConcpeto3());
        }

        if (this.getRdMorNumCtas3() != null && this.getRdMorNumCtas3().longValue() == -999) {
            conditions += " AND RD_MOR_NUM_CTAS3 IS NULL";
        } else if (this.getRdMorNumCtas3() != null) {
            conditions += " AND RD_MOR_NUM_CTAS3 = ?";
            values.add(this.getRdMorNumCtas3());
        }

        if (this.getRdMorPjeCtas3() != null && this.getRdMorPjeCtas3().longValue() == -999) {
            conditions += " AND RD_MOR_PJE_CTAS3 IS NULL";
        } else if (this.getRdMorPjeCtas3() != null) {
            conditions += " AND RD_MOR_PJE_CTAS3 = ?";
            values.add(this.getRdMorPjeCtas3());
        }

        if (this.getRdMorImporte3() != null && this.getRdMorImporte3().longValue() == -999) {
            conditions += " AND RD_MOR_IMPORTE3 IS NULL";
        } else if (this.getRdMorImporte3() != null) {
            conditions += " AND RD_MOR_IMPORTE3 = ?";
            values.add(this.getRdMorImporte3());
        }

        if (this.getRdMorConcpeto4() != null && "null".equals(this.getRdMorConcpeto4())) {
            conditions += " AND RD_MOR_CONCPETO4 IS NULL";
        } else if (this.getRdMorConcpeto4() != null) {
            conditions += " AND RD_MOR_CONCPETO4 = ?";
            values.add(this.getRdMorConcpeto4());
        }

        if (this.getRdMorNumCtas4() != null && this.getRdMorNumCtas4().longValue() == -999) {
            conditions += " AND RD_MOR_NUM_CTAS4 IS NULL";
        } else if (this.getRdMorNumCtas4() != null) {
            conditions += " AND RD_MOR_NUM_CTAS4 = ?";
            values.add(this.getRdMorNumCtas4());
        }

        if (this.getRdMorPjeCtas4() != null && this.getRdMorPjeCtas4().longValue() == -999) {
            conditions += " AND RD_MOR_PJE_CTAS4 IS NULL";
        } else if (this.getRdMorPjeCtas4() != null) {
            conditions += " AND RD_MOR_PJE_CTAS4 = ?";
            values.add(this.getRdMorPjeCtas4());
        }

        if (this.getRdMorImporte4() != null && this.getRdMorImporte4().longValue() == -999) {
            conditions += " AND RD_MOR_IMPORTE4 IS NULL";
        } else if (this.getRdMorImporte4() != null) {
            conditions += " AND RD_MOR_IMPORTE4 = ?";
            values.add(this.getRdMorImporte4());
        }

        if (this.getRdNumCreditos5() != null && this.getRdNumCreditos5().longValue() == -999) {
            conditions += " AND RD_NUM_CREDITOS5 IS NULL";
        } else if (this.getRdNumCreditos5() != null) {
            conditions += " AND RD_NUM_CREDITOS5 = ?";
            values.add(this.getRdNumCreditos5());
        }

        if (this.getRdMorConcpeto5() != null && "null".equals(this.getRdMorConcpeto5())) {
            conditions += " AND RD_MOR_CONCPETO5 IS NULL";
        } else if (this.getRdMorConcpeto5() != null) {
            conditions += " AND RD_MOR_CONCPETO5 = ?";
            values.add(this.getRdMorConcpeto5());
        }

        if (this.getRdMorNumCtas5() != null && this.getRdMorNumCtas5().longValue() == -999) {
            conditions += " AND RD_MOR_NUM_CTAS5 IS NULL";
        } else if (this.getRdMorNumCtas5() != null) {
            conditions += " AND RD_MOR_NUM_CTAS5 = ?";
            values.add(this.getRdMorNumCtas5());
        }

        if (this.getRdMorPjeCtas5() != null && this.getRdMorPjeCtas5().longValue() == -999) {
            conditions += " AND RD_MOR_PJE_CTAS5 IS NULL";
        } else if (this.getRdMorPjeCtas5() != null) {
            conditions += " AND RD_MOR_PJE_CTAS5 = ?";
            values.add(this.getRdMorPjeCtas5());
        }

        if (this.getRdMorImporte5() != null && this.getRdMorImporte5().longValue() == -999) {
            conditions += " AND RD_MOR_IMPORTE5 IS NULL";
        } else if (this.getRdMorImporte5() != null) {
            conditions += " AND RD_MOR_IMPORTE5 = ?";
            values.add(this.getRdMorImporte5());
        }

        if (this.getRdMorConcpeto6() != null && "null".equals(this.getRdMorConcpeto6())) {
            conditions += " AND RD_MOR_CONCPETO6 IS NULL";
        } else if (this.getRdMorConcpeto6() != null) {
            conditions += " AND RD_MOR_CONCPETO6 = ?";
            values.add(this.getRdMorConcpeto6());
        }

        if (this.getRdMorNumCtas6() != null && this.getRdMorNumCtas6().longValue() == -999) {
            conditions += " AND RD_MOR_NUM_CTAS6 IS NULL";
        } else if (this.getRdMorNumCtas6() != null) {
            conditions += " AND RD_MOR_NUM_CTAS6 = ?";
            values.add(this.getRdMorNumCtas6());
        }

        if (this.getRdMorPjeCtas6() != null && this.getRdMorPjeCtas6().longValue() == -999) {
            conditions += " AND RD_MOR_PJE_CTAS6 IS NULL";
        } else if (this.getRdMorPjeCtas6() != null) {
            conditions += " AND RD_MOR_PJE_CTAS6 = ?";
            values.add(this.getRdMorPjeCtas6());
        }

        if (this.getRdMorImporte6() != null && this.getRdMorImporte6().longValue() == -999) {
            conditions += " AND RD_MOR_IMPORTE6 IS NULL";
        } else if (this.getRdMorImporte6() != null) {
            conditions += " AND RD_MOR_IMPORTE6 = ?";
            values.add(this.getRdMorImporte6());
        }

        if (this.getRdMorConcpeto7() != null && "null".equals(this.getRdMorConcpeto7())) {
            conditions += " AND RD_MOR_CONCPETO7 IS NULL";
        } else if (this.getRdMorConcpeto7() != null) {
            conditions += " AND RD_MOR_CONCPETO7 = ?";
            values.add(this.getRdMorConcpeto7());
        }

        if (this.getRdMorNumCtas7() != null && this.getRdMorNumCtas7().longValue() == -999) {
            conditions += " AND RD_MOR_NUM_CTAS7 IS NULL";
        } else if (this.getRdMorNumCtas7() != null) {
            conditions += " AND RD_MOR_NUM_CTAS7 = ?";
            values.add(this.getRdMorNumCtas7());
        }

        if (this.getRdMorPjeCtas7() != null && this.getRdMorPjeCtas7().longValue() == -999) {
            conditions += " AND RD_MOR_PJE_CTAS7 IS NULL";
        } else if (this.getRdMorPjeCtas7() != null) {
            conditions += " AND RD_MOR_PJE_CTAS7 = ?";
            values.add(this.getRdMorPjeCtas7());
        }

        if (this.getRdMorImporte7() != null && this.getRdMorImporte7().longValue() == -999) {
            conditions += " AND RD_MOR_IMPORTE7 IS NULL";
        } else if (this.getRdMorImporte7() != null) {
            conditions += " AND RD_MOR_IMPORTE7 = ?";
            values.add(this.getRdMorImporte7());
        }

        if (this.getRdNumCreditos8() != null && this.getRdNumCreditos8().longValue() == -999) {
            conditions += " AND RD_NUM_CREDITOS8 IS NULL";
        } else if (this.getRdNumCreditos8() != null) {
            conditions += " AND RD_NUM_CREDITOS8 = ?";
            values.add(this.getRdNumCreditos8());
        }

        if (this.getRdMorConcpeto8() != null && "null".equals(this.getRdMorConcpeto8())) {
            conditions += " AND RD_MOR_CONCPETO8 IS NULL";
        } else if (this.getRdMorConcpeto8() != null) {
            conditions += " AND RD_MOR_CONCPETO8 = ?";
            values.add(this.getRdMorConcpeto8());
        }

        if (this.getRdMorNumCtas8() != null && this.getRdMorNumCtas8().longValue() == -999) {
            conditions += " AND RD_MOR_NUM_CTAS8 IS NULL";
        } else if (this.getRdMorNumCtas8() != null) {
            conditions += " AND RD_MOR_NUM_CTAS8 = ?";
            values.add(this.getRdMorNumCtas8());
        }

        if (this.getRdMorPjeCtas8() != null && this.getRdMorPjeCtas8().longValue() == -999) {
            conditions += " AND RD_MOR_PJE_CTAS8 IS NULL";
        } else if (this.getRdMorPjeCtas8() != null) {
            conditions += " AND RD_MOR_PJE_CTAS8 = ?";
            values.add(this.getRdMorPjeCtas8());
        }

        if (this.getRdMorImporte8() != null && this.getRdMorImporte8().longValue() == -999) {
            conditions += " AND RD_MOR_IMPORTE8 IS NULL";
        } else if (this.getRdMorImporte8() != null) {
            conditions += " AND RD_MOR_IMPORTE8 = ?";
            values.add(this.getRdMorImporte8());
        }

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getUpdate() {
        DMLObject result = new DMLObject();
        String sql = "UPDATE F_REP_DISTRIB SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RD_ID_PROGRAMA = ?";
        pkValues.add(this.getRdIdPrograma());
        conditions += " AND RD_ID_FIDEICOMISO = ?";
        pkValues.add(this.getRdIdFideicomiso());
        conditions += " AND RD_ID_EMISION = ?";
        pkValues.add(this.getRdIdEmision());
        conditions += " AND RD_ID_PERIODO = ?";
        pkValues.add(this.getRdIdPeriodo());
        conditions += " AND RD_ID_SEC_INTER = ?";
        pkValues.add(this.getRdIdSecInter());
        fields += " RD_NOM_EMISOR = ?, ";
        values.add(this.getRdNomEmisor());
        fields += " RD_NOM_EMISION = ?, ";
        values.add(this.getRdNomEmision());
        fields += " RD_NOM_FIDEICOMISO = ?, ";
        values.add(this.getRdNomFideicomiso());
        fields += " RD_NOM_FIDEICOMITENTE = ?, ";
        values.add(this.getRdNomFideicomitente());
        fields += " RD_FECHA_EMISION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRdFechaEmision());
        fields += " RD_FECHA_DETERMINACION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRdFechaDeterminacion());
        fields += " RD_FECHA_INICIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRdFechaInicio());
        fields += " RD_FECHA_FIN = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRdFechaFin());
        fields += " RD_FECHA_PAGO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRdFechaPago());
        fields += " RD_TASA_UDI = ?, ";
        values.add(this.getRdTasaUdi());
        fields += " RD_DIAS_PERIODO = ?, ";
        values.add(this.getRdDiasPeriodo());
        fields += " RD_CONCEPTO_COBRANZA_INICIAL = ?, ";
        values.add(this.getRdConceptoCobranzaInicial());
        fields += " RD_IMP_DEPOSITO_INICIAL = ?, ";
        values.add(this.getRdImpDepositoInicial());
        fields += " RD_CONCEPTO_COBRANZA_1 = ?, ";
        values.add(this.getRdConceptoCobranza1());
        fields += " RD_IMP_DEPOSITO_1 = ?, ";
        values.add(this.getRdImpDeposito1());
        fields += " RD_CONCEPTO_COBRANZA_2 = ?, ";
        values.add(this.getRdConceptoCobranza2());
        fields += " RD_IMP_DEPOSITO_2 = ?, ";
        values.add(this.getRdImpDeposito2());
        fields += " RD_CONCEPTO_COBRANZA_3 = ?, ";
        values.add(this.getRdConceptoCobranza3());
        fields += " RD_IMP_DEPOSITO_3 = ?, ";
        values.add(this.getRdImpDeposito3());
        fields += " RD_CONCEPTO_INTERESES = ?, ";
        values.add(this.getRdConceptoIntereses());
        fields += " RD_IMP_INTERESES = ?, ";
        values.add(this.getRdImpIntereses());
        fields += " RD_ISR = ?, ";
        values.add(this.getRdIsr());
        fields += " RD_IMP_ISR = ?, ";
        values.add(this.getRdImpIsr());
        fields += " RD_CONCEPTO_COBRANZA_TOTAL = ?, ";
        values.add(this.getRdConceptoCobranzaTotal());
        fields += " RD_IMP_DEPOSITO_TOTAL = ?, ";
        values.add(this.getRdImpDepositoTotal());
        fields += " RD_IMP_GASTOS_PERMITIDOS = ?, ";
        values.add(this.getRdImpGastosPermitidos());
        fields += " RD_IMP_HONO_FID = ?, ";
        values.add(this.getRdImpHonoFid());
        fields += " RD_IMP_HONO_REP_COMUN = ?, ";
        values.add(this.getRdImpHonoRepComun());
        fields += " RD_IMP_HONO_BMV = ?, ";
        values.add(this.getRdImpHonoBmv());
        fields += " RD_IMP_HONO_CNVB = ?, ";
        values.add(this.getRdImpHonoCnvb());
        fields += " RD_IMP_HONO_CALIF = ?, ";
        values.add(this.getRdImpHonoCalif());
        fields += " RD_IMP_HONO_AUDIT_XT = ?, ";
        values.add(this.getRdImpHonoAuditXt());
        fields += " RD_IMP_HONO_AUDIT_XT_RE = ?, ";
        values.add(this.getRdImpHonoAuditXtRe());
        fields += " RD_IMP_HONO_LEGALES = ?, ";
        values.add(this.getRdImpHonoLegales());
        fields += " RD_IMP_ADMINISTRADOR = ?, ";
        values.add(this.getRdImpAdministrador());
        fields += " RD_IMP_HONO_PUBLICACIONES = ?, ";
        values.add(this.getRdImpHonoPublicaciones());
        fields += " RD_IMP_OTROS = ?, ";
        values.add(this.getRdImpOtros());
        fields += " RD_TOT_GASTOS = ?, ";
        values.add(this.getRdTotGastos());
        fields += " RD_TOT_DISPONIBLE = ?, ";
        values.add(this.getRdTotDisponible());
        fields += " RD_PIZARRA1 = ?, ";
        values.add(this.getRdPizarra1());
        fields += " RD_SERIE1 = ?, ";
        values.add(this.getRdSerie1());
        fields += " RD_INT_PENDIENTES = ?, ";
        values.add(this.getRdIntPendientes());
        fields += " RD_CONCEPTO_PAGO_INTERESES = ?, ";
        values.add(this.getRdConceptoPagoIntereses());
        fields += " RD_PAGO_INTERESES = ?, ";
        values.add(this.getRdPagoIntereses());
        fields += " RD_AMOR_PRINCIPAL = ?, ";
        values.add(this.getRdAmorPrincipal());
        fields += " RD_AMOR_CAR_VEN = ?, ";
        values.add(this.getRdAmorCarVen());
        fields += " RD_INTER_PEND_PER_ANT = ?, ";
        values.add(this.getRdInterPendPerAnt());
        fields += " RD_CONCEPTOPAGO_INT_INST_SUB = ?, ";
        values.add(this.getRdConceptopagoIntInstSub());
        fields += " RD_PAGO_INT_INST_SUB = ?, ";
        values.add(this.getRdPagoIntInstSub());
        fields += " RD_AMOR_ANT_PRINCIPAL = ?, ";
        values.add(this.getRdAmorAntPrincipal());
        fields += " RD_IMPORTE_PAGAR = ?, ";
        values.add(this.getRdImportePagar());
        fields += " RD_NUM_TITULOS = ?, ";
        values.add(this.getRdNumTitulos());
        fields += " RD_VAL_NOM_INICIAL = ?, ";
        values.add(this.getRdValNomInicial());
        fields += " RD_VAL_NOM_INICIAL_CONV = ?, ";
        values.add(this.getRdValNomInicialConv());
        fields += " RD_VAL_NOM_AJUSTADO = ?, ";
        values.add(this.getRdValNomAjustado());
        fields += " RD_VAL_NOM_AJUSTADO_CONV = ?, ";
        values.add(this.getRdValNomAjustadoConv());
        fields += " RD_FACTOR_PORRATA = ?, ";
        values.add(this.getRdFactorPorrata());
        fields += " RD_TASA_INTERES = ?, ";
        values.add(this.getRdTasaInteres());
        fields += " RD_INTERESES = ?, ";
        values.add(this.getRdIntereses());
        fields += " RD_INTERESES_CONV = ?, ";
        values.add(this.getRdInteresesConv());
        fields += " RD_VAN_INI_EMISION = ?, ";
        values.add(this.getRdVanIniEmision());
        fields += " RD_AMORTIZACION = ?, ";
        values.add(this.getRdAmortizacion());
        fields += " RD_AMORTIZACION_CONV = ?, ";
        values.add(this.getRdAmortizacionConv());
        fields += " RD_VAN_AJUSTADO_EMI = ?, ";
        values.add(this.getRdVanAjustadoEmi());
        fields += " RD_PIZARRA2 = ?, ";
        values.add(this.getRdPizarra2());
        fields += " RD_SERIE2 = ?, ";
        values.add(this.getRdSerie2());
        fields += " RD_INT_PENDIENTES2 = ?, ";
        values.add(this.getRdIntPendientes2());
        fields += " RD_CONCEPTO_PAGO_INTERESES2 = ?, ";
        values.add(this.getRdConceptoPagoIntereses2());
        fields += " RD_PAGO_INTERESES2 = ?, ";
        values.add(this.getRdPagoIntereses2());
        fields += " RD_AMOR_PRINCIPAL2 = ?, ";
        values.add(this.getRdAmorPrincipal2());
        fields += " RD_AMOR_CAR_VEN2 = ?, ";
        values.add(this.getRdAmorCarVen2());
        fields += " RD_INTER_PEND_PER_ANT2 = ?, ";
        values.add(this.getRdInterPendPerAnt2());
        fields += " RD_CONCEPTOPAGO_INT_INST_SUB2 = ?, ";
        values.add(this.getRdConceptopagoIntInstSub2());
        fields += " RD_PAGO_INT_INST_SUB2 = ?, ";
        values.add(this.getRdPagoIntInstSub2());
        fields += " RD_AMOR_ANT_PRINCIPAL2 = ?, ";
        values.add(this.getRdAmorAntPrincipal2());
        fields += " RD_IMPORTE_PAGAR2 = ?, ";
        values.add(this.getRdImportePagar2());
        fields += " RD_NUM_TITULOS2 = ?, ";
        values.add(this.getRdNumTitulos2());
        fields += " RD_VAL_NOM_INICIAL2 = ?, ";
        values.add(this.getRdValNomInicial2());
        fields += " RD_VAL_NOM_INICIAL_CONV2 = ?, ";
        values.add(this.getRdValNomInicialConv2());
        fields += " RD_VAL_NOM_AJUSTADO2 = ?, ";
        values.add(this.getRdValNomAjustado2());
        fields += " RD_VAL_NOM_AJUSTADO_CONV2 = ?, ";
        values.add(this.getRdValNomAjustadoConv2());
        fields += " RD_FACTOR_PORRATA2 = ?, ";
        values.add(this.getRdFactorPorrata2());
        fields += " RD_TASA_INTERES2 = ?, ";
        values.add(this.getRdTasaInteres2());
        fields += " RD_INTERESES2 = ?, ";
        values.add(this.getRdIntereses2());
        fields += " RD_INTERESES_CONV2 = ?, ";
        values.add(this.getRdInteresesConv2());
        fields += " RD_VAN_INI_EMISION2 = ?, ";
        values.add(this.getRdVanIniEmision2());
        fields += " RD_AMORTIZACION2 = ?, ";
        values.add(this.getRdAmortizacion2());
        fields += " RD_AMORTIZACION_CONV2 = ?, ";
        values.add(this.getRdAmortizacionConv2());
        fields += " RD_VAN_AJUSTADO_EMI2 = ?, ";
        values.add(this.getRdVanAjustadoEmi2());
        fields += " RD_PIZARRA3 = ?, ";
        values.add(this.getRdPizarra3());
        fields += " RD_SERIE3 = ?, ";
        values.add(this.getRdSerie3());
        fields += " RD_INT_PENDIENTES3 = ?, ";
        values.add(this.getRdIntPendientes3());
        fields += " RD_CONCEPTO_PAGO_INTERESES3 = ?, ";
        values.add(this.getRdConceptoPagoIntereses3());
        fields += " RD_PAGO_INTERESES3 = ?, ";
        values.add(this.getRdPagoIntereses3());
        fields += " RD_AMOR_PRINCIPAL3 = ?, ";
        values.add(this.getRdAmorPrincipal3());
        fields += " RD_AMOR_CAR_VEN3 = ?, ";
        values.add(this.getRdAmorCarVen3());
        fields += " RD_INTER_PEND_PER_ANT3 = ?, ";
        values.add(this.getRdInterPendPerAnt3());
        fields += " RD_CONCEPTOPAGO_INT_INST_SUB3 = ?, ";
        values.add(this.getRdConceptopagoIntInstSub3());
        fields += " RD_PAGO_INT_INST_SUB3 = ?, ";
        values.add(this.getRdPagoIntInstSub3());
        fields += " RD_AMOR_ANT_PRINCIPAL3 = ?, ";
        values.add(this.getRdAmorAntPrincipal3());
        fields += " RD_IMPORTE_PAGAR3 = ?, ";
        values.add(this.getRdImportePagar3());
        fields += " RD_NUM_TITULOS3 = ?, ";
        values.add(this.getRdNumTitulos3());
        fields += " RD_VAL_NOM_INICIAL3 = ?, ";
        values.add(this.getRdValNomInicial3());
        fields += " RD_VAL_NOM_INICIAL_CONV3 = ?, ";
        values.add(this.getRdValNomInicialConv3());
        fields += " RD_VAL_NOM_AJUSTADO3 = ?, ";
        values.add(this.getRdValNomAjustado3());
        fields += " RD_VAL_NOM_AJUSTADO_CONV3 = ?, ";
        values.add(this.getRdValNomAjustadoConv3());
        fields += " RD_FACTOR_PORRATA3 = ?, ";
        values.add(this.getRdFactorPorrata3());
        fields += " RD_TASA_INTERES3 = ?, ";
        values.add(this.getRdTasaInteres3());
        fields += " RD_INTERESES3 = ?, ";
        values.add(this.getRdIntereses3());
        fields += " RD_INTERESES_CONV3 = ?, ";
        values.add(this.getRdInteresesConv3());
        fields += " RD_VAN_INI_EMISION3 = ?, ";
        values.add(this.getRdVanIniEmision3());
        fields += " RD_AMORTIZACION3 = ?, ";
        values.add(this.getRdAmortizacion3());
        fields += " RD_AMORTIZACION_CONV3 = ?, ";
        values.add(this.getRdAmortizacionConv3());
        fields += " RD_VAN_AJUSTADO_EMI3 = ?, ";
        values.add(this.getRdVanAjustadoEmi3());
        fields += " RD_SAL_FIN_CARTERA = ?, ";
        values.add(this.getRdSalFinCartera());
        fields += " RD_NUM_CREDITOS = ?, ";
        values.add(this.getRdNumCreditos());
        fields += " RD_MOR_CONCPETO1 = ?, ";
        values.add(this.getRdMorConcpeto1());
        fields += " RD_MOR_NUM_CTAS1 = ?, ";
        values.add(this.getRdMorNumCtas1());
        fields += " RD_MOR_PJE_CTAS1 = ?, ";
        values.add(this.getRdMorPjeCtas1());
        fields += " RD_MOR_IMPORTE1 = ?, ";
        values.add(this.getRdMorImporte1());
        fields += " RD_MOR_CONCPETO2 = ?, ";
        values.add(this.getRdMorConcpeto2());
        fields += " RD_MOR_NUM_CTAS2 = ?, ";
        values.add(this.getRdMorNumCtas2());
        fields += " RD_MOR_PJE_CTAS2 = ?, ";
        values.add(this.getRdMorPjeCtas2());
        fields += " RD_MOR_IMPORTE2 = ?, ";
        values.add(this.getRdMorImporte2());
        fields += " RD_NUM_CREDITOS3 = ?, ";
        values.add(this.getRdNumCreditos3());
        fields += " RD_MOR_CONCPETO3 = ?, ";
        values.add(this.getRdMorConcpeto3());
        fields += " RD_MOR_NUM_CTAS3 = ?, ";
        values.add(this.getRdMorNumCtas3());
        fields += " RD_MOR_PJE_CTAS3 = ?, ";
        values.add(this.getRdMorPjeCtas3());
        fields += " RD_MOR_IMPORTE3 = ?, ";
        values.add(this.getRdMorImporte3());
        fields += " RD_MOR_CONCPETO4 = ?, ";
        values.add(this.getRdMorConcpeto4());
        fields += " RD_MOR_NUM_CTAS4 = ?, ";
        values.add(this.getRdMorNumCtas4());
        fields += " RD_MOR_PJE_CTAS4 = ?, ";
        values.add(this.getRdMorPjeCtas4());
        fields += " RD_MOR_IMPORTE4 = ?, ";
        values.add(this.getRdMorImporte4());
        fields += " RD_NUM_CREDITOS5 = ?, ";
        values.add(this.getRdNumCreditos5());
        fields += " RD_MOR_CONCPETO5 = ?, ";
        values.add(this.getRdMorConcpeto5());
        fields += " RD_MOR_NUM_CTAS5 = ?, ";
        values.add(this.getRdMorNumCtas5());
        fields += " RD_MOR_PJE_CTAS5 = ?, ";
        values.add(this.getRdMorPjeCtas5());
        fields += " RD_MOR_IMPORTE5 = ?, ";
        values.add(this.getRdMorImporte5());
        fields += " RD_MOR_CONCPETO6 = ?, ";
        values.add(this.getRdMorConcpeto6());
        fields += " RD_MOR_NUM_CTAS6 = ?, ";
        values.add(this.getRdMorNumCtas6());
        fields += " RD_MOR_PJE_CTAS6 = ?, ";
        values.add(this.getRdMorPjeCtas6());
        fields += " RD_MOR_IMPORTE6 = ?, ";
        values.add(this.getRdMorImporte6());
        fields += " RD_MOR_CONCPETO7 = ?, ";
        values.add(this.getRdMorConcpeto7());
        fields += " RD_MOR_NUM_CTAS7 = ?, ";
        values.add(this.getRdMorNumCtas7());
        fields += " RD_MOR_PJE_CTAS7 = ?, ";
        values.add(this.getRdMorPjeCtas7());
        fields += " RD_MOR_IMPORTE7 = ?, ";
        values.add(this.getRdMorImporte7());
        fields += " RD_NUM_CREDITOS8 = ?, ";
        values.add(this.getRdNumCreditos8());
        fields += " RD_MOR_CONCPETO8 = ?, ";
        values.add(this.getRdMorConcpeto8());
        fields += " RD_MOR_NUM_CTAS8 = ?, ";
        values.add(this.getRdMorNumCtas8());
        fields += " RD_MOR_PJE_CTAS8 = ?, ";
        values.add(this.getRdMorPjeCtas8());
        fields += " RD_MOR_IMPORTE8 = ?, ";
        values.add(this.getRdMorImporte8());
        for (int i = 0; i < pkValues.size(); i++) {
            values.add(pkValues.get(i));
        }
        ;

        fields = fields.substring(0, fields.length() - 2).trim();
        conditions = conditions.substring(4).trim();
        sql += fields + " WHERE " + conditions;
        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getInsert() {
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO F_REP_DISTRIB ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RD_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getRdIdPrograma());

        fields += ", RD_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getRdIdFideicomiso());

        fields += ", RD_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getRdIdEmision());

        fields += ", RD_ID_PERIODO";
        fieldValues += ", ?";
        values.add(this.getRdIdPeriodo());

        fields += ", RD_ID_SEC_INTER";
        fieldValues += ", ?";
        values.add(this.getRdIdSecInter());

        fields += ", RD_NOM_EMISOR";
        fieldValues += ", ?";
        values.add(this.getRdNomEmisor());

        fields += ", RD_NOM_EMISION";
        fieldValues += ", ?";
        values.add(this.getRdNomEmision());

        fields += ", RD_NOM_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getRdNomFideicomiso());

        fields += ", RD_NOM_FIDEICOMITENTE";
        fieldValues += ", ?";
        values.add(this.getRdNomFideicomitente());

        fields += ", RD_FECHA_EMISION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRdFechaEmision());

        fields += ", RD_FECHA_DETERMINACION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRdFechaDeterminacion());

        fields += ", RD_FECHA_INICIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRdFechaInicio());

        fields += ", RD_FECHA_FIN";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRdFechaFin());

        fields += ", RD_FECHA_PAGO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRdFechaPago());

        fields += ", RD_TASA_UDI";
        fieldValues += ", ?";
        values.add(this.getRdTasaUdi());

        fields += ", RD_DIAS_PERIODO";
        fieldValues += ", ?";
        values.add(this.getRdDiasPeriodo());

        fields += ", RD_CONCEPTO_COBRANZA_INICIAL";
        fieldValues += ", ?";
        values.add(this.getRdConceptoCobranzaInicial());

        fields += ", RD_IMP_DEPOSITO_INICIAL";
        fieldValues += ", ?";
        values.add(this.getRdImpDepositoInicial());

        fields += ", RD_CONCEPTO_COBRANZA_1";
        fieldValues += ", ?";
        values.add(this.getRdConceptoCobranza1());

        fields += ", RD_IMP_DEPOSITO_1";
        fieldValues += ", ?";
        values.add(this.getRdImpDeposito1());

        fields += ", RD_CONCEPTO_COBRANZA_2";
        fieldValues += ", ?";
        values.add(this.getRdConceptoCobranza2());

        fields += ", RD_IMP_DEPOSITO_2";
        fieldValues += ", ?";
        values.add(this.getRdImpDeposito2());

        fields += ", RD_CONCEPTO_COBRANZA_3";
        fieldValues += ", ?";
        values.add(this.getRdConceptoCobranza3());

        fields += ", RD_IMP_DEPOSITO_3";
        fieldValues += ", ?";
        values.add(this.getRdImpDeposito3());

        fields += ", RD_CONCEPTO_INTERESES";
        fieldValues += ", ?";
        values.add(this.getRdConceptoIntereses());

        fields += ", RD_IMP_INTERESES";
        fieldValues += ", ?";
        values.add(this.getRdImpIntereses());

        fields += ", RD_ISR";
        fieldValues += ", ?";
        values.add(this.getRdIsr());

        fields += ", RD_IMP_ISR";
        fieldValues += ", ?";
        values.add(this.getRdImpIsr());

        fields += ", RD_CONCEPTO_COBRANZA_TOTAL";
        fieldValues += ", ?";
        values.add(this.getRdConceptoCobranzaTotal());

        fields += ", RD_IMP_DEPOSITO_TOTAL";
        fieldValues += ", ?";
        values.add(this.getRdImpDepositoTotal());

        fields += ", RD_IMP_GASTOS_PERMITIDOS";
        fieldValues += ", ?";
        values.add(this.getRdImpGastosPermitidos());

        fields += ", RD_IMP_HONO_FID";
        fieldValues += ", ?";
        values.add(this.getRdImpHonoFid());

        fields += ", RD_IMP_HONO_REP_COMUN";
        fieldValues += ", ?";
        values.add(this.getRdImpHonoRepComun());

        fields += ", RD_IMP_HONO_BMV";
        fieldValues += ", ?";
        values.add(this.getRdImpHonoBmv());

        fields += ", RD_IMP_HONO_CNVB";
        fieldValues += ", ?";
        values.add(this.getRdImpHonoCnvb());

        fields += ", RD_IMP_HONO_CALIF";
        fieldValues += ", ?";
        values.add(this.getRdImpHonoCalif());

        fields += ", RD_IMP_HONO_AUDIT_XT";
        fieldValues += ", ?";
        values.add(this.getRdImpHonoAuditXt());

        fields += ", RD_IMP_HONO_AUDIT_XT_RE";
        fieldValues += ", ?";
        values.add(this.getRdImpHonoAuditXtRe());

        fields += ", RD_IMP_HONO_LEGALES";
        fieldValues += ", ?";
        values.add(this.getRdImpHonoLegales());

        fields += ", RD_IMP_ADMINISTRADOR";
        fieldValues += ", ?";
        values.add(this.getRdImpAdministrador());

        fields += ", RD_IMP_HONO_PUBLICACIONES";
        fieldValues += ", ?";
        values.add(this.getRdImpHonoPublicaciones());

        fields += ", RD_IMP_OTROS";
        fieldValues += ", ?";
        values.add(this.getRdImpOtros());

        fields += ", RD_TOT_GASTOS";
        fieldValues += ", ?";
        values.add(this.getRdTotGastos());

        fields += ", RD_TOT_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getRdTotDisponible());

        fields += ", RD_PIZARRA1";
        fieldValues += ", ?";
        values.add(this.getRdPizarra1());

        fields += ", RD_SERIE1";
        fieldValues += ", ?";
        values.add(this.getRdSerie1());

        fields += ", RD_INT_PENDIENTES";
        fieldValues += ", ?";
        values.add(this.getRdIntPendientes());

        fields += ", RD_CONCEPTO_PAGO_INTERESES";
        fieldValues += ", ?";
        values.add(this.getRdConceptoPagoIntereses());

        fields += ", RD_PAGO_INTERESES";
        fieldValues += ", ?";
        values.add(this.getRdPagoIntereses());

        fields += ", RD_AMOR_PRINCIPAL";
        fieldValues += ", ?";
        values.add(this.getRdAmorPrincipal());

        fields += ", RD_AMOR_CAR_VEN";
        fieldValues += ", ?";
        values.add(this.getRdAmorCarVen());

        fields += ", RD_INTER_PEND_PER_ANT";
        fieldValues += ", ?";
        values.add(this.getRdInterPendPerAnt());

        fields += ", RD_CONCEPTOPAGO_INT_INST_SUB";
        fieldValues += ", ?";
        values.add(this.getRdConceptopagoIntInstSub());

        fields += ", RD_PAGO_INT_INST_SUB";
        fieldValues += ", ?";
        values.add(this.getRdPagoIntInstSub());

        fields += ", RD_AMOR_ANT_PRINCIPAL";
        fieldValues += ", ?";
        values.add(this.getRdAmorAntPrincipal());

        fields += ", RD_IMPORTE_PAGAR";
        fieldValues += ", ?";
        values.add(this.getRdImportePagar());

        fields += ", RD_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getRdNumTitulos());

        fields += ", RD_VAL_NOM_INICIAL";
        fieldValues += ", ?";
        values.add(this.getRdValNomInicial());

        fields += ", RD_VAL_NOM_INICIAL_CONV";
        fieldValues += ", ?";
        values.add(this.getRdValNomInicialConv());

        fields += ", RD_VAL_NOM_AJUSTADO";
        fieldValues += ", ?";
        values.add(this.getRdValNomAjustado());

        fields += ", RD_VAL_NOM_AJUSTADO_CONV";
        fieldValues += ", ?";
        values.add(this.getRdValNomAjustadoConv());

        fields += ", RD_FACTOR_PORRATA";
        fieldValues += ", ?";
        values.add(this.getRdFactorPorrata());

        fields += ", RD_TASA_INTERES";
        fieldValues += ", ?";
        values.add(this.getRdTasaInteres());

        fields += ", RD_INTERESES";
        fieldValues += ", ?";
        values.add(this.getRdIntereses());

        fields += ", RD_INTERESES_CONV";
        fieldValues += ", ?";
        values.add(this.getRdInteresesConv());

        fields += ", RD_VAN_INI_EMISION";
        fieldValues += ", ?";
        values.add(this.getRdVanIniEmision());

        fields += ", RD_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getRdAmortizacion());

        fields += ", RD_AMORTIZACION_CONV";
        fieldValues += ", ?";
        values.add(this.getRdAmortizacionConv());

        fields += ", RD_VAN_AJUSTADO_EMI";
        fieldValues += ", ?";
        values.add(this.getRdVanAjustadoEmi());

        fields += ", RD_PIZARRA2";
        fieldValues += ", ?";
        values.add(this.getRdPizarra2());

        fields += ", RD_SERIE2";
        fieldValues += ", ?";
        values.add(this.getRdSerie2());

        fields += ", RD_INT_PENDIENTES2";
        fieldValues += ", ?";
        values.add(this.getRdIntPendientes2());

        fields += ", RD_CONCEPTO_PAGO_INTERESES2";
        fieldValues += ", ?";
        values.add(this.getRdConceptoPagoIntereses2());

        fields += ", RD_PAGO_INTERESES2";
        fieldValues += ", ?";
        values.add(this.getRdPagoIntereses2());

        fields += ", RD_AMOR_PRINCIPAL2";
        fieldValues += ", ?";
        values.add(this.getRdAmorPrincipal2());

        fields += ", RD_AMOR_CAR_VEN2";
        fieldValues += ", ?";
        values.add(this.getRdAmorCarVen2());

        fields += ", RD_INTER_PEND_PER_ANT2";
        fieldValues += ", ?";
        values.add(this.getRdInterPendPerAnt2());

        fields += ", RD_CONCEPTOPAGO_INT_INST_SUB2";
        fieldValues += ", ?";
        values.add(this.getRdConceptopagoIntInstSub2());

        fields += ", RD_PAGO_INT_INST_SUB2";
        fieldValues += ", ?";
        values.add(this.getRdPagoIntInstSub2());

        fields += ", RD_AMOR_ANT_PRINCIPAL2";
        fieldValues += ", ?";
        values.add(this.getRdAmorAntPrincipal2());

        fields += ", RD_IMPORTE_PAGAR2";
        fieldValues += ", ?";
        values.add(this.getRdImportePagar2());

        fields += ", RD_NUM_TITULOS2";
        fieldValues += ", ?";
        values.add(this.getRdNumTitulos2());

        fields += ", RD_VAL_NOM_INICIAL2";
        fieldValues += ", ?";
        values.add(this.getRdValNomInicial2());

        fields += ", RD_VAL_NOM_INICIAL_CONV2";
        fieldValues += ", ?";
        values.add(this.getRdValNomInicialConv2());

        fields += ", RD_VAL_NOM_AJUSTADO2";
        fieldValues += ", ?";
        values.add(this.getRdValNomAjustado2());

        fields += ", RD_VAL_NOM_AJUSTADO_CONV2";
        fieldValues += ", ?";
        values.add(this.getRdValNomAjustadoConv2());

        fields += ", RD_FACTOR_PORRATA2";
        fieldValues += ", ?";
        values.add(this.getRdFactorPorrata2());

        fields += ", RD_TASA_INTERES2";
        fieldValues += ", ?";
        values.add(this.getRdTasaInteres2());

        fields += ", RD_INTERESES2";
        fieldValues += ", ?";
        values.add(this.getRdIntereses2());

        fields += ", RD_INTERESES_CONV2";
        fieldValues += ", ?";
        values.add(this.getRdInteresesConv2());

        fields += ", RD_VAN_INI_EMISION2";
        fieldValues += ", ?";
        values.add(this.getRdVanIniEmision2());

        fields += ", RD_AMORTIZACION2";
        fieldValues += ", ?";
        values.add(this.getRdAmortizacion2());

        fields += ", RD_AMORTIZACION_CONV2";
        fieldValues += ", ?";
        values.add(this.getRdAmortizacionConv2());

        fields += ", RD_VAN_AJUSTADO_EMI2";
        fieldValues += ", ?";
        values.add(this.getRdVanAjustadoEmi2());

        fields += ", RD_PIZARRA3";
        fieldValues += ", ?";
        values.add(this.getRdPizarra3());

        fields += ", RD_SERIE3";
        fieldValues += ", ?";
        values.add(this.getRdSerie3());

        fields += ", RD_INT_PENDIENTES3";
        fieldValues += ", ?";
        values.add(this.getRdIntPendientes3());

        fields += ", RD_CONCEPTO_PAGO_INTERESES3";
        fieldValues += ", ?";
        values.add(this.getRdConceptoPagoIntereses3());

        fields += ", RD_PAGO_INTERESES3";
        fieldValues += ", ?";
        values.add(this.getRdPagoIntereses3());

        fields += ", RD_AMOR_PRINCIPAL3";
        fieldValues += ", ?";
        values.add(this.getRdAmorPrincipal3());

        fields += ", RD_AMOR_CAR_VEN3";
        fieldValues += ", ?";
        values.add(this.getRdAmorCarVen3());

        fields += ", RD_INTER_PEND_PER_ANT3";
        fieldValues += ", ?";
        values.add(this.getRdInterPendPerAnt3());

        fields += ", RD_CONCEPTOPAGO_INT_INST_SUB3";
        fieldValues += ", ?";
        values.add(this.getRdConceptopagoIntInstSub3());

        fields += ", RD_PAGO_INT_INST_SUB3";
        fieldValues += ", ?";
        values.add(this.getRdPagoIntInstSub3());

        fields += ", RD_AMOR_ANT_PRINCIPAL3";
        fieldValues += ", ?";
        values.add(this.getRdAmorAntPrincipal3());

        fields += ", RD_IMPORTE_PAGAR3";
        fieldValues += ", ?";
        values.add(this.getRdImportePagar3());

        fields += ", RD_NUM_TITULOS3";
        fieldValues += ", ?";
        values.add(this.getRdNumTitulos3());

        fields += ", RD_VAL_NOM_INICIAL3";
        fieldValues += ", ?";
        values.add(this.getRdValNomInicial3());

        fields += ", RD_VAL_NOM_INICIAL_CONV3";
        fieldValues += ", ?";
        values.add(this.getRdValNomInicialConv3());

        fields += ", RD_VAL_NOM_AJUSTADO3";
        fieldValues += ", ?";
        values.add(this.getRdValNomAjustado3());

        fields += ", RD_VAL_NOM_AJUSTADO_CONV3";
        fieldValues += ", ?";
        values.add(this.getRdValNomAjustadoConv3());

        fields += ", RD_FACTOR_PORRATA3";
        fieldValues += ", ?";
        values.add(this.getRdFactorPorrata3());

        fields += ", RD_TASA_INTERES3";
        fieldValues += ", ?";
        values.add(this.getRdTasaInteres3());

        fields += ", RD_INTERESES3";
        fieldValues += ", ?";
        values.add(this.getRdIntereses3());

        fields += ", RD_INTERESES_CONV3";
        fieldValues += ", ?";
        values.add(this.getRdInteresesConv3());

        fields += ", RD_VAN_INI_EMISION3";
        fieldValues += ", ?";
        values.add(this.getRdVanIniEmision3());

        fields += ", RD_AMORTIZACION3";
        fieldValues += ", ?";
        values.add(this.getRdAmortizacion3());

        fields += ", RD_AMORTIZACION_CONV3";
        fieldValues += ", ?";
        values.add(this.getRdAmortizacionConv3());

        fields += ", RD_VAN_AJUSTADO_EMI3";
        fieldValues += ", ?";
        values.add(this.getRdVanAjustadoEmi3());

        fields += ", RD_SAL_FIN_CARTERA";
        fieldValues += ", ?";
        values.add(this.getRdSalFinCartera());

        fields += ", RD_NUM_CREDITOS";
        fieldValues += ", ?";
        values.add(this.getRdNumCreditos());

        fields += ", RD_MOR_CONCPETO1";
        fieldValues += ", ?";
        values.add(this.getRdMorConcpeto1());

        fields += ", RD_MOR_NUM_CTAS1";
        fieldValues += ", ?";
        values.add(this.getRdMorNumCtas1());

        fields += ", RD_MOR_PJE_CTAS1";
        fieldValues += ", ?";
        values.add(this.getRdMorPjeCtas1());

        fields += ", RD_MOR_IMPORTE1";
        fieldValues += ", ?";
        values.add(this.getRdMorImporte1());

        fields += ", RD_MOR_CONCPETO2";
        fieldValues += ", ?";
        values.add(this.getRdMorConcpeto2());

        fields += ", RD_MOR_NUM_CTAS2";
        fieldValues += ", ?";
        values.add(this.getRdMorNumCtas2());

        fields += ", RD_MOR_PJE_CTAS2";
        fieldValues += ", ?";
        values.add(this.getRdMorPjeCtas2());

        fields += ", RD_MOR_IMPORTE2";
        fieldValues += ", ?";
        values.add(this.getRdMorImporte2());

        fields += ", RD_NUM_CREDITOS3";
        fieldValues += ", ?";
        values.add(this.getRdNumCreditos3());

        fields += ", RD_MOR_CONCPETO3";
        fieldValues += ", ?";
        values.add(this.getRdMorConcpeto3());

        fields += ", RD_MOR_NUM_CTAS3";
        fieldValues += ", ?";
        values.add(this.getRdMorNumCtas3());

        fields += ", RD_MOR_PJE_CTAS3";
        fieldValues += ", ?";
        values.add(this.getRdMorPjeCtas3());

        fields += ", RD_MOR_IMPORTE3";
        fieldValues += ", ?";
        values.add(this.getRdMorImporte3());

        fields += ", RD_MOR_CONCPETO4";
        fieldValues += ", ?";
        values.add(this.getRdMorConcpeto4());

        fields += ", RD_MOR_NUM_CTAS4";
        fieldValues += ", ?";
        values.add(this.getRdMorNumCtas4());

        fields += ", RD_MOR_PJE_CTAS4";
        fieldValues += ", ?";
        values.add(this.getRdMorPjeCtas4());

        fields += ", RD_MOR_IMPORTE4";
        fieldValues += ", ?";
        values.add(this.getRdMorImporte4());

        fields += ", RD_NUM_CREDITOS5";
        fieldValues += ", ?";
        values.add(this.getRdNumCreditos5());

        fields += ", RD_MOR_CONCPETO5";
        fieldValues += ", ?";
        values.add(this.getRdMorConcpeto5());

        fields += ", RD_MOR_NUM_CTAS5";
        fieldValues += ", ?";
        values.add(this.getRdMorNumCtas5());

        fields += ", RD_MOR_PJE_CTAS5";
        fieldValues += ", ?";
        values.add(this.getRdMorPjeCtas5());

        fields += ", RD_MOR_IMPORTE5";
        fieldValues += ", ?";
        values.add(this.getRdMorImporte5());

        fields += ", RD_MOR_CONCPETO6";
        fieldValues += ", ?";
        values.add(this.getRdMorConcpeto6());

        fields += ", RD_MOR_NUM_CTAS6";
        fieldValues += ", ?";
        values.add(this.getRdMorNumCtas6());

        fields += ", RD_MOR_PJE_CTAS6";
        fieldValues += ", ?";
        values.add(this.getRdMorPjeCtas6());

        fields += ", RD_MOR_IMPORTE6";
        fieldValues += ", ?";
        values.add(this.getRdMorImporte6());

        fields += ", RD_MOR_CONCPETO7";
        fieldValues += ", ?";
        values.add(this.getRdMorConcpeto7());

        fields += ", RD_MOR_NUM_CTAS7";
        fieldValues += ", ?";
        values.add(this.getRdMorNumCtas7());

        fields += ", RD_MOR_PJE_CTAS7";
        fieldValues += ", ?";
        values.add(this.getRdMorPjeCtas7());

        fields += ", RD_MOR_IMPORTE7";
        fieldValues += ", ?";
        values.add(this.getRdMorImporte7());

        fields += ", RD_NUM_CREDITOS8";
        fieldValues += ", ?";
        values.add(this.getRdNumCreditos8());

        fields += ", RD_MOR_CONCPETO8";
        fieldValues += ", ?";
        values.add(this.getRdMorConcpeto8());

        fields += ", RD_MOR_NUM_CTAS8";
        fieldValues += ", ?";
        values.add(this.getRdMorNumCtas8());

        fields += ", RD_MOR_PJE_CTAS8";
        fieldValues += ", ?";
        values.add(this.getRdMorPjeCtas8());

        fields += ", RD_MOR_IMPORTE8";
        fieldValues += ", ?";
        values.add(this.getRdMorImporte8());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REP_DISTRIB WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RD_ID_PROGRAMA = ?";
        values.add(this.getRdIdPrograma());
        conditions += " AND RD_ID_FIDEICOMISO = ?";
        values.add(this.getRdIdFideicomiso());
        conditions += " AND RD_ID_EMISION = ?";
        values.add(this.getRdIdEmision());
        conditions += " AND RD_ID_PERIODO = ?";
        values.add(this.getRdIdPeriodo());
        conditions += " AND RD_ID_SEC_INTER = ?";
        values.add(this.getRdIdSecInter());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRepDistrib instance = (FRepDistrib) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRdIdPrograma().equals(instance.getRdIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getRdIdFideicomiso().equals(instance.getRdIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getRdIdEmision().equals(instance.getRdIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getRdIdPeriodo().equals(instance.getRdIdPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getRdIdSecInter().equals(instance.getRdIdSecInter()))
            equalObjects = false;
        if (equalObjects && !this.getRdNomEmisor().equals(instance.getRdNomEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getRdNomEmision().equals(instance.getRdNomEmision()))
            equalObjects = false;
        if (equalObjects && !this.getRdNomFideicomiso().equals(instance.getRdNomFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getRdNomFideicomitente().equals(instance.getRdNomFideicomitente()))
            equalObjects = false;
        if (equalObjects && !this.getRdFechaEmision().equals(instance.getRdFechaEmision()))
            equalObjects = false;
        if (equalObjects && !this.getRdFechaDeterminacion().equals(instance.getRdFechaDeterminacion()))
            equalObjects = false;
        if (equalObjects && !this.getRdFechaInicio().equals(instance.getRdFechaInicio()))
            equalObjects = false;
        if (equalObjects && !this.getRdFechaFin().equals(instance.getRdFechaFin()))
            equalObjects = false;
        if (equalObjects && !this.getRdFechaPago().equals(instance.getRdFechaPago()))
            equalObjects = false;
        if (equalObjects && !this.getRdTasaUdi().equals(instance.getRdTasaUdi()))
            equalObjects = false;
        if (equalObjects && !this.getRdDiasPeriodo().equals(instance.getRdDiasPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptoCobranzaInicial().equals(instance.getRdConceptoCobranzaInicial()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpDepositoInicial().equals(instance.getRdImpDepositoInicial()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptoCobranza1().equals(instance.getRdConceptoCobranza1()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpDeposito1().equals(instance.getRdImpDeposito1()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptoCobranza2().equals(instance.getRdConceptoCobranza2()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpDeposito2().equals(instance.getRdImpDeposito2()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptoCobranza3().equals(instance.getRdConceptoCobranza3()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpDeposito3().equals(instance.getRdImpDeposito3()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptoIntereses().equals(instance.getRdConceptoIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpIntereses().equals(instance.getRdImpIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getRdIsr().equals(instance.getRdIsr()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpIsr().equals(instance.getRdImpIsr()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptoCobranzaTotal().equals(instance.getRdConceptoCobranzaTotal()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpDepositoTotal().equals(instance.getRdImpDepositoTotal()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpGastosPermitidos().equals(instance.getRdImpGastosPermitidos()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpHonoFid().equals(instance.getRdImpHonoFid()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpHonoRepComun().equals(instance.getRdImpHonoRepComun()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpHonoBmv().equals(instance.getRdImpHonoBmv()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpHonoCnvb().equals(instance.getRdImpHonoCnvb()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpHonoCalif().equals(instance.getRdImpHonoCalif()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpHonoAuditXt().equals(instance.getRdImpHonoAuditXt()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpHonoAuditXtRe().equals(instance.getRdImpHonoAuditXtRe()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpHonoLegales().equals(instance.getRdImpHonoLegales()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpAdministrador().equals(instance.getRdImpAdministrador()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpHonoPublicaciones().equals(instance.getRdImpHonoPublicaciones()))
            equalObjects = false;
        if (equalObjects && !this.getRdImpOtros().equals(instance.getRdImpOtros()))
            equalObjects = false;
        if (equalObjects && !this.getRdTotGastos().equals(instance.getRdTotGastos()))
            equalObjects = false;
        if (equalObjects && !this.getRdTotDisponible().equals(instance.getRdTotDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getRdPizarra1().equals(instance.getRdPizarra1()))
            equalObjects = false;
        if (equalObjects && !this.getRdSerie1().equals(instance.getRdSerie1()))
            equalObjects = false;
        if (equalObjects && !this.getRdIntPendientes().equals(instance.getRdIntPendientes()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptoPagoIntereses().equals(instance.getRdConceptoPagoIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getRdPagoIntereses().equals(instance.getRdPagoIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmorPrincipal().equals(instance.getRdAmorPrincipal()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmorCarVen().equals(instance.getRdAmorCarVen()))
            equalObjects = false;
        if (equalObjects && !this.getRdInterPendPerAnt().equals(instance.getRdInterPendPerAnt()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptopagoIntInstSub().equals(instance.getRdConceptopagoIntInstSub()))
            equalObjects = false;
        if (equalObjects && !this.getRdPagoIntInstSub().equals(instance.getRdPagoIntInstSub()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmorAntPrincipal().equals(instance.getRdAmorAntPrincipal()))
            equalObjects = false;
        if (equalObjects && !this.getRdImportePagar().equals(instance.getRdImportePagar()))
            equalObjects = false;
        if (equalObjects && !this.getRdNumTitulos().equals(instance.getRdNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomInicial().equals(instance.getRdValNomInicial()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomInicialConv().equals(instance.getRdValNomInicialConv()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomAjustado().equals(instance.getRdValNomAjustado()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomAjustadoConv().equals(instance.getRdValNomAjustadoConv()))
            equalObjects = false;
        if (equalObjects && !this.getRdFactorPorrata().equals(instance.getRdFactorPorrata()))
            equalObjects = false;
        if (equalObjects && !this.getRdTasaInteres().equals(instance.getRdTasaInteres()))
            equalObjects = false;
        if (equalObjects && !this.getRdIntereses().equals(instance.getRdIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getRdInteresesConv().equals(instance.getRdInteresesConv()))
            equalObjects = false;
        if (equalObjects && !this.getRdVanIniEmision().equals(instance.getRdVanIniEmision()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmortizacion().equals(instance.getRdAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmortizacionConv().equals(instance.getRdAmortizacionConv()))
            equalObjects = false;
        if (equalObjects && !this.getRdVanAjustadoEmi().equals(instance.getRdVanAjustadoEmi()))
            equalObjects = false;
        if (equalObjects && !this.getRdPizarra2().equals(instance.getRdPizarra2()))
            equalObjects = false;
        if (equalObjects && !this.getRdSerie2().equals(instance.getRdSerie2()))
            equalObjects = false;
        if (equalObjects && !this.getRdIntPendientes2().equals(instance.getRdIntPendientes2()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptoPagoIntereses2().equals(instance.getRdConceptoPagoIntereses2()))
            equalObjects = false;
        if (equalObjects && !this.getRdPagoIntereses2().equals(instance.getRdPagoIntereses2()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmorPrincipal2().equals(instance.getRdAmorPrincipal2()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmorCarVen2().equals(instance.getRdAmorCarVen2()))
            equalObjects = false;
        if (equalObjects && !this.getRdInterPendPerAnt2().equals(instance.getRdInterPendPerAnt2()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptopagoIntInstSub2().equals(instance.getRdConceptopagoIntInstSub2()))
            equalObjects = false;
        if (equalObjects && !this.getRdPagoIntInstSub2().equals(instance.getRdPagoIntInstSub2()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmorAntPrincipal2().equals(instance.getRdAmorAntPrincipal2()))
            equalObjects = false;
        if (equalObjects && !this.getRdImportePagar2().equals(instance.getRdImportePagar2()))
            equalObjects = false;
        if (equalObjects && !this.getRdNumTitulos2().equals(instance.getRdNumTitulos2()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomInicial2().equals(instance.getRdValNomInicial2()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomInicialConv2().equals(instance.getRdValNomInicialConv2()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomAjustado2().equals(instance.getRdValNomAjustado2()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomAjustadoConv2().equals(instance.getRdValNomAjustadoConv2()))
            equalObjects = false;
        if (equalObjects && !this.getRdFactorPorrata2().equals(instance.getRdFactorPorrata2()))
            equalObjects = false;
        if (equalObjects && !this.getRdTasaInteres2().equals(instance.getRdTasaInteres2()))
            equalObjects = false;
        if (equalObjects && !this.getRdIntereses2().equals(instance.getRdIntereses2()))
            equalObjects = false;
        if (equalObjects && !this.getRdInteresesConv2().equals(instance.getRdInteresesConv2()))
            equalObjects = false;
        if (equalObjects && !this.getRdVanIniEmision2().equals(instance.getRdVanIniEmision2()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmortizacion2().equals(instance.getRdAmortizacion2()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmortizacionConv2().equals(instance.getRdAmortizacionConv2()))
            equalObjects = false;
        if (equalObjects && !this.getRdVanAjustadoEmi2().equals(instance.getRdVanAjustadoEmi2()))
            equalObjects = false;
        if (equalObjects && !this.getRdPizarra3().equals(instance.getRdPizarra3()))
            equalObjects = false;
        if (equalObjects && !this.getRdSerie3().equals(instance.getRdSerie3()))
            equalObjects = false;
        if (equalObjects && !this.getRdIntPendientes3().equals(instance.getRdIntPendientes3()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptoPagoIntereses3().equals(instance.getRdConceptoPagoIntereses3()))
            equalObjects = false;
        if (equalObjects && !this.getRdPagoIntereses3().equals(instance.getRdPagoIntereses3()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmorPrincipal3().equals(instance.getRdAmorPrincipal3()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmorCarVen3().equals(instance.getRdAmorCarVen3()))
            equalObjects = false;
        if (equalObjects && !this.getRdInterPendPerAnt3().equals(instance.getRdInterPendPerAnt3()))
            equalObjects = false;
        if (equalObjects && !this.getRdConceptopagoIntInstSub3().equals(instance.getRdConceptopagoIntInstSub3()))
            equalObjects = false;
        if (equalObjects && !this.getRdPagoIntInstSub3().equals(instance.getRdPagoIntInstSub3()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmorAntPrincipal3().equals(instance.getRdAmorAntPrincipal3()))
            equalObjects = false;
        if (equalObjects && !this.getRdImportePagar3().equals(instance.getRdImportePagar3()))
            equalObjects = false;
        if (equalObjects && !this.getRdNumTitulos3().equals(instance.getRdNumTitulos3()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomInicial3().equals(instance.getRdValNomInicial3()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomInicialConv3().equals(instance.getRdValNomInicialConv3()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomAjustado3().equals(instance.getRdValNomAjustado3()))
            equalObjects = false;
        if (equalObjects && !this.getRdValNomAjustadoConv3().equals(instance.getRdValNomAjustadoConv3()))
            equalObjects = false;
        if (equalObjects && !this.getRdFactorPorrata3().equals(instance.getRdFactorPorrata3()))
            equalObjects = false;
        if (equalObjects && !this.getRdTasaInteres3().equals(instance.getRdTasaInteres3()))
            equalObjects = false;
        if (equalObjects && !this.getRdIntereses3().equals(instance.getRdIntereses3()))
            equalObjects = false;
        if (equalObjects && !this.getRdInteresesConv3().equals(instance.getRdInteresesConv3()))
            equalObjects = false;
        if (equalObjects && !this.getRdVanIniEmision3().equals(instance.getRdVanIniEmision3()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmortizacion3().equals(instance.getRdAmortizacion3()))
            equalObjects = false;
        if (equalObjects && !this.getRdAmortizacionConv3().equals(instance.getRdAmortizacionConv3()))
            equalObjects = false;
        if (equalObjects && !this.getRdVanAjustadoEmi3().equals(instance.getRdVanAjustadoEmi3()))
            equalObjects = false;
        if (equalObjects && !this.getRdSalFinCartera().equals(instance.getRdSalFinCartera()))
            equalObjects = false;
        if (equalObjects && !this.getRdNumCreditos().equals(instance.getRdNumCreditos()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorConcpeto1().equals(instance.getRdMorConcpeto1()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorNumCtas1().equals(instance.getRdMorNumCtas1()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorPjeCtas1().equals(instance.getRdMorPjeCtas1()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorImporte1().equals(instance.getRdMorImporte1()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorConcpeto2().equals(instance.getRdMorConcpeto2()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorNumCtas2().equals(instance.getRdMorNumCtas2()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorPjeCtas2().equals(instance.getRdMorPjeCtas2()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorImporte2().equals(instance.getRdMorImporte2()))
            equalObjects = false;
        if (equalObjects && !this.getRdNumCreditos3().equals(instance.getRdNumCreditos3()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorConcpeto3().equals(instance.getRdMorConcpeto3()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorNumCtas3().equals(instance.getRdMorNumCtas3()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorPjeCtas3().equals(instance.getRdMorPjeCtas3()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorImporte3().equals(instance.getRdMorImporte3()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorConcpeto4().equals(instance.getRdMorConcpeto4()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorNumCtas4().equals(instance.getRdMorNumCtas4()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorPjeCtas4().equals(instance.getRdMorPjeCtas4()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorImporte4().equals(instance.getRdMorImporte4()))
            equalObjects = false;
        if (equalObjects && !this.getRdNumCreditos5().equals(instance.getRdNumCreditos5()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorConcpeto5().equals(instance.getRdMorConcpeto5()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorNumCtas5().equals(instance.getRdMorNumCtas5()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorPjeCtas5().equals(instance.getRdMorPjeCtas5()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorImporte5().equals(instance.getRdMorImporte5()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorConcpeto6().equals(instance.getRdMorConcpeto6()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorNumCtas6().equals(instance.getRdMorNumCtas6()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorPjeCtas6().equals(instance.getRdMorPjeCtas6()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorImporte6().equals(instance.getRdMorImporte6()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorConcpeto7().equals(instance.getRdMorConcpeto7()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorNumCtas7().equals(instance.getRdMorNumCtas7()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorPjeCtas7().equals(instance.getRdMorPjeCtas7()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorImporte7().equals(instance.getRdMorImporte7()))
            equalObjects = false;
        if (equalObjects && !this.getRdNumCreditos8().equals(instance.getRdNumCreditos8()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorConcpeto8().equals(instance.getRdMorConcpeto8()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorNumCtas8().equals(instance.getRdMorNumCtas8()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorPjeCtas8().equals(instance.getRdMorPjeCtas8()))
            equalObjects = false;
        if (equalObjects && !this.getRdMorImporte8().equals(instance.getRdMorImporte8()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepDistrib result = new FRepDistrib();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRdIdPrograma((BigDecimal) objectData.getData("RD_ID_PROGRAMA"));
        result.setRdIdFideicomiso((BigDecimal) objectData.getData("RD_ID_FIDEICOMISO"));
        result.setRdIdEmision((BigDecimal) objectData.getData("RD_ID_EMISION"));
        result.setRdIdPeriodo((BigDecimal) objectData.getData("RD_ID_PERIODO"));
        result.setRdIdSecInter((BigDecimal) objectData.getData("RD_ID_SEC_INTER"));
        result.setRdNomEmisor((String) objectData.getData("RD_NOM_EMISOR"));
        result.setRdNomEmision((String) objectData.getData("RD_NOM_EMISION"));
        result.setRdNomFideicomiso((String) objectData.getData("RD_NOM_FIDEICOMISO"));
        result.setRdNomFideicomitente((String) objectData.getData("RD_NOM_FIDEICOMITENTE"));
        result.setRdFechaEmision((String) objectData.getData("RD_FECHA_EMISION"));
        result.setRdFechaDeterminacion((String) objectData.getData("RD_FECHA_DETERMINACION"));
        result.setRdFechaInicio((String) objectData.getData("RD_FECHA_INICIO"));
        result.setRdFechaFin((String) objectData.getData("RD_FECHA_FIN"));
        result.setRdFechaPago((String) objectData.getData("RD_FECHA_PAGO"));
        result.setRdTasaUdi((BigDecimal) objectData.getData("RD_TASA_UDI"));
        result.setRdDiasPeriodo((BigDecimal) objectData.getData("RD_DIAS_PERIODO"));
        result.setRdConceptoCobranzaInicial((String) objectData.getData("RD_CONCEPTO_COBRANZA_INICIAL"));
        result.setRdImpDepositoInicial((BigDecimal) objectData.getData("RD_IMP_DEPOSITO_INICIAL"));
        result.setRdConceptoCobranza1((String) objectData.getData("RD_CONCEPTO_COBRANZA_1"));
        result.setRdImpDeposito1((BigDecimal) objectData.getData("RD_IMP_DEPOSITO_1"));
        result.setRdConceptoCobranza2((String) objectData.getData("RD_CONCEPTO_COBRANZA_2"));
        result.setRdImpDeposito2((BigDecimal) objectData.getData("RD_IMP_DEPOSITO_2"));
        result.setRdConceptoCobranza3((String) objectData.getData("RD_CONCEPTO_COBRANZA_3"));
        result.setRdImpDeposito3((BigDecimal) objectData.getData("RD_IMP_DEPOSITO_3"));
        result.setRdConceptoIntereses((String) objectData.getData("RD_CONCEPTO_INTERESES"));
        result.setRdImpIntereses((BigDecimal) objectData.getData("RD_IMP_INTERESES"));
        result.setRdIsr((String) objectData.getData("RD_ISR"));
        result.setRdImpIsr((BigDecimal) objectData.getData("RD_IMP_ISR"));
        result.setRdConceptoCobranzaTotal((String) objectData.getData("RD_CONCEPTO_COBRANZA_TOTAL"));
        result.setRdImpDepositoTotal((BigDecimal) objectData.getData("RD_IMP_DEPOSITO_TOTAL"));
        result.setRdImpGastosPermitidos((BigDecimal) objectData.getData("RD_IMP_GASTOS_PERMITIDOS"));
        result.setRdImpHonoFid((BigDecimal) objectData.getData("RD_IMP_HONO_FID"));
        result.setRdImpHonoRepComun((BigDecimal) objectData.getData("RD_IMP_HONO_REP_COMUN"));
        result.setRdImpHonoBmv((BigDecimal) objectData.getData("RD_IMP_HONO_BMV"));
        result.setRdImpHonoCnvb((BigDecimal) objectData.getData("RD_IMP_HONO_CNVB"));
        result.setRdImpHonoCalif((BigDecimal) objectData.getData("RD_IMP_HONO_CALIF"));
        result.setRdImpHonoAuditXt((BigDecimal) objectData.getData("RD_IMP_HONO_AUDIT_XT"));
        result.setRdImpHonoAuditXtRe((BigDecimal) objectData.getData("RD_IMP_HONO_AUDIT_XT_RE"));
        result.setRdImpHonoLegales((BigDecimal) objectData.getData("RD_IMP_HONO_LEGALES"));
        result.setRdImpAdministrador((BigDecimal) objectData.getData("RD_IMP_ADMINISTRADOR"));
        result.setRdImpHonoPublicaciones((BigDecimal) objectData.getData("RD_IMP_HONO_PUBLICACIONES"));
        result.setRdImpOtros((BigDecimal) objectData.getData("RD_IMP_OTROS"));
        result.setRdTotGastos((BigDecimal) objectData.getData("RD_TOT_GASTOS"));
        result.setRdTotDisponible((BigDecimal) objectData.getData("RD_TOT_DISPONIBLE"));
        result.setRdPizarra1((String) objectData.getData("RD_PIZARRA1"));
        result.setRdSerie1((String) objectData.getData("RD_SERIE1"));
        result.setRdIntPendientes((BigDecimal) objectData.getData("RD_INT_PENDIENTES"));
        result.setRdConceptoPagoIntereses((String) objectData.getData("RD_CONCEPTO_PAGO_INTERESES"));
        result.setRdPagoIntereses((BigDecimal) objectData.getData("RD_PAGO_INTERESES"));
        result.setRdAmorPrincipal((BigDecimal) objectData.getData("RD_AMOR_PRINCIPAL"));
        result.setRdAmorCarVen((BigDecimal) objectData.getData("RD_AMOR_CAR_VEN"));
        result.setRdInterPendPerAnt((BigDecimal) objectData.getData("RD_INTER_PEND_PER_ANT"));
        result.setRdConceptopagoIntInstSub((String) objectData.getData("RD_CONCEPTOPAGO_INT_INST_SUB"));
        result.setRdPagoIntInstSub((BigDecimal) objectData.getData("RD_PAGO_INT_INST_SUB"));
        result.setRdAmorAntPrincipal((BigDecimal) objectData.getData("RD_AMOR_ANT_PRINCIPAL"));
        result.setRdImportePagar((BigDecimal) objectData.getData("RD_IMPORTE_PAGAR"));
        result.setRdNumTitulos((BigDecimal) objectData.getData("RD_NUM_TITULOS"));
        result.setRdValNomInicial((BigDecimal) objectData.getData("RD_VAL_NOM_INICIAL"));
        result.setRdValNomInicialConv((BigDecimal) objectData.getData("RD_VAL_NOM_INICIAL_CONV"));
        result.setRdValNomAjustado((BigDecimal) objectData.getData("RD_VAL_NOM_AJUSTADO"));
        result.setRdValNomAjustadoConv((BigDecimal) objectData.getData("RD_VAL_NOM_AJUSTADO_CONV"));
        result.setRdFactorPorrata((BigDecimal) objectData.getData("RD_FACTOR_PORRATA"));
        result.setRdTasaInteres((BigDecimal) objectData.getData("RD_TASA_INTERES"));
        result.setRdIntereses((BigDecimal) objectData.getData("RD_INTERESES"));
        result.setRdInteresesConv((BigDecimal) objectData.getData("RD_INTERESES_CONV"));
        result.setRdVanIniEmision((BigDecimal) objectData.getData("RD_VAN_INI_EMISION"));
        result.setRdAmortizacion((BigDecimal) objectData.getData("RD_AMORTIZACION"));
        result.setRdAmortizacionConv((BigDecimal) objectData.getData("RD_AMORTIZACION_CONV"));
        result.setRdVanAjustadoEmi((BigDecimal) objectData.getData("RD_VAN_AJUSTADO_EMI"));
        result.setRdPizarra2((String) objectData.getData("RD_PIZARRA2"));
        result.setRdSerie2((String) objectData.getData("RD_SERIE2"));
        result.setRdIntPendientes2((BigDecimal) objectData.getData("RD_INT_PENDIENTES2"));
        result.setRdConceptoPagoIntereses2((String) objectData.getData("RD_CONCEPTO_PAGO_INTERESES2"));
        result.setRdPagoIntereses2((BigDecimal) objectData.getData("RD_PAGO_INTERESES2"));
        result.setRdAmorPrincipal2((BigDecimal) objectData.getData("RD_AMOR_PRINCIPAL2"));
        result.setRdAmorCarVen2((BigDecimal) objectData.getData("RD_AMOR_CAR_VEN2"));
        result.setRdInterPendPerAnt2((BigDecimal) objectData.getData("RD_INTER_PEND_PER_ANT2"));
        result.setRdConceptopagoIntInstSub2((String) objectData.getData("RD_CONCEPTOPAGO_INT_INST_SUB2"));
        result.setRdPagoIntInstSub2((BigDecimal) objectData.getData("RD_PAGO_INT_INST_SUB2"));
        result.setRdAmorAntPrincipal2((BigDecimal) objectData.getData("RD_AMOR_ANT_PRINCIPAL2"));
        result.setRdImportePagar2((BigDecimal) objectData.getData("RD_IMPORTE_PAGAR2"));
        result.setRdNumTitulos2((BigDecimal) objectData.getData("RD_NUM_TITULOS2"));
        result.setRdValNomInicial2((BigDecimal) objectData.getData("RD_VAL_NOM_INICIAL2"));
        result.setRdValNomInicialConv2((BigDecimal) objectData.getData("RD_VAL_NOM_INICIAL_CONV2"));
        result.setRdValNomAjustado2((BigDecimal) objectData.getData("RD_VAL_NOM_AJUSTADO2"));
        result.setRdValNomAjustadoConv2((BigDecimal) objectData.getData("RD_VAL_NOM_AJUSTADO_CONV2"));
        result.setRdFactorPorrata2((BigDecimal) objectData.getData("RD_FACTOR_PORRATA2"));
        result.setRdTasaInteres2((BigDecimal) objectData.getData("RD_TASA_INTERES2"));
        result.setRdIntereses2((BigDecimal) objectData.getData("RD_INTERESES2"));
        result.setRdInteresesConv2((BigDecimal) objectData.getData("RD_INTERESES_CONV2"));
        result.setRdVanIniEmision2((BigDecimal) objectData.getData("RD_VAN_INI_EMISION2"));
        result.setRdAmortizacion2((BigDecimal) objectData.getData("RD_AMORTIZACION2"));
        result.setRdAmortizacionConv2((BigDecimal) objectData.getData("RD_AMORTIZACION_CONV2"));
        result.setRdVanAjustadoEmi2((BigDecimal) objectData.getData("RD_VAN_AJUSTADO_EMI2"));
        result.setRdPizarra3((String) objectData.getData("RD_PIZARRA3"));
        result.setRdSerie3((String) objectData.getData("RD_SERIE3"));
        result.setRdIntPendientes3((BigDecimal) objectData.getData("RD_INT_PENDIENTES3"));
        result.setRdConceptoPagoIntereses3((String) objectData.getData("RD_CONCEPTO_PAGO_INTERESES3"));
        result.setRdPagoIntereses3((BigDecimal) objectData.getData("RD_PAGO_INTERESES3"));
        result.setRdAmorPrincipal3((BigDecimal) objectData.getData("RD_AMOR_PRINCIPAL3"));
        result.setRdAmorCarVen3((BigDecimal) objectData.getData("RD_AMOR_CAR_VEN3"));
        result.setRdInterPendPerAnt3((BigDecimal) objectData.getData("RD_INTER_PEND_PER_ANT3"));
        result.setRdConceptopagoIntInstSub3((String) objectData.getData("RD_CONCEPTOPAGO_INT_INST_SUB3"));
        result.setRdPagoIntInstSub3((BigDecimal) objectData.getData("RD_PAGO_INT_INST_SUB3"));
        result.setRdAmorAntPrincipal3((BigDecimal) objectData.getData("RD_AMOR_ANT_PRINCIPAL3"));
        result.setRdImportePagar3((BigDecimal) objectData.getData("RD_IMPORTE_PAGAR3"));
        result.setRdNumTitulos3((BigDecimal) objectData.getData("RD_NUM_TITULOS3"));
        result.setRdValNomInicial3((BigDecimal) objectData.getData("RD_VAL_NOM_INICIAL3"));
        result.setRdValNomInicialConv3((BigDecimal) objectData.getData("RD_VAL_NOM_INICIAL_CONV3"));
        result.setRdValNomAjustado3((BigDecimal) objectData.getData("RD_VAL_NOM_AJUSTADO3"));
        result.setRdValNomAjustadoConv3((BigDecimal) objectData.getData("RD_VAL_NOM_AJUSTADO_CONV3"));
        result.setRdFactorPorrata3((BigDecimal) objectData.getData("RD_FACTOR_PORRATA3"));
        result.setRdTasaInteres3((BigDecimal) objectData.getData("RD_TASA_INTERES3"));
        result.setRdIntereses3((BigDecimal) objectData.getData("RD_INTERESES3"));
        result.setRdInteresesConv3((BigDecimal) objectData.getData("RD_INTERESES_CONV3"));
        result.setRdVanIniEmision3((BigDecimal) objectData.getData("RD_VAN_INI_EMISION3"));
        result.setRdAmortizacion3((BigDecimal) objectData.getData("RD_AMORTIZACION3"));
        result.setRdAmortizacionConv3((BigDecimal) objectData.getData("RD_AMORTIZACION_CONV3"));
        result.setRdVanAjustadoEmi3((BigDecimal) objectData.getData("RD_VAN_AJUSTADO_EMI3"));
        result.setRdSalFinCartera((BigDecimal) objectData.getData("RD_SAL_FIN_CARTERA"));
        result.setRdNumCreditos((BigDecimal) objectData.getData("RD_NUM_CREDITOS"));
        result.setRdMorConcpeto1((String) objectData.getData("RD_MOR_CONCPETO1"));
        result.setRdMorNumCtas1((BigDecimal) objectData.getData("RD_MOR_NUM_CTAS1"));
        result.setRdMorPjeCtas1((BigDecimal) objectData.getData("RD_MOR_PJE_CTAS1"));
        result.setRdMorImporte1((BigDecimal) objectData.getData("RD_MOR_IMPORTE1"));
        result.setRdMorConcpeto2((String) objectData.getData("RD_MOR_CONCPETO2"));
        result.setRdMorNumCtas2((BigDecimal) objectData.getData("RD_MOR_NUM_CTAS2"));
        result.setRdMorPjeCtas2((BigDecimal) objectData.getData("RD_MOR_PJE_CTAS2"));
        result.setRdMorImporte2((BigDecimal) objectData.getData("RD_MOR_IMPORTE2"));
        result.setRdNumCreditos3((BigDecimal) objectData.getData("RD_NUM_CREDITOS3"));
        result.setRdMorConcpeto3((String) objectData.getData("RD_MOR_CONCPETO3"));
        result.setRdMorNumCtas3((BigDecimal) objectData.getData("RD_MOR_NUM_CTAS3"));
        result.setRdMorPjeCtas3((BigDecimal) objectData.getData("RD_MOR_PJE_CTAS3"));
        result.setRdMorImporte3((BigDecimal) objectData.getData("RD_MOR_IMPORTE3"));
        result.setRdMorConcpeto4((String) objectData.getData("RD_MOR_CONCPETO4"));
        result.setRdMorNumCtas4((BigDecimal) objectData.getData("RD_MOR_NUM_CTAS4"));
        result.setRdMorPjeCtas4((BigDecimal) objectData.getData("RD_MOR_PJE_CTAS4"));
        result.setRdMorImporte4((BigDecimal) objectData.getData("RD_MOR_IMPORTE4"));
        result.setRdNumCreditos5((BigDecimal) objectData.getData("RD_NUM_CREDITOS5"));
        result.setRdMorConcpeto5((String) objectData.getData("RD_MOR_CONCPETO5"));
        result.setRdMorNumCtas5((BigDecimal) objectData.getData("RD_MOR_NUM_CTAS5"));
        result.setRdMorPjeCtas5((BigDecimal) objectData.getData("RD_MOR_PJE_CTAS5"));
        result.setRdMorImporte5((BigDecimal) objectData.getData("RD_MOR_IMPORTE5"));
        result.setRdMorConcpeto6((String) objectData.getData("RD_MOR_CONCPETO6"));
        result.setRdMorNumCtas6((BigDecimal) objectData.getData("RD_MOR_NUM_CTAS6"));
        result.setRdMorPjeCtas6((BigDecimal) objectData.getData("RD_MOR_PJE_CTAS6"));
        result.setRdMorImporte6((BigDecimal) objectData.getData("RD_MOR_IMPORTE6"));
        result.setRdMorConcpeto7((String) objectData.getData("RD_MOR_CONCPETO7"));
        result.setRdMorNumCtas7((BigDecimal) objectData.getData("RD_MOR_NUM_CTAS7"));
        result.setRdMorPjeCtas7((BigDecimal) objectData.getData("RD_MOR_PJE_CTAS7"));
        result.setRdMorImporte7((BigDecimal) objectData.getData("RD_MOR_IMPORTE7"));
        result.setRdNumCreditos8((BigDecimal) objectData.getData("RD_NUM_CREDITOS8"));
        result.setRdMorConcpeto8((String) objectData.getData("RD_MOR_CONCPETO8"));
        result.setRdMorNumCtas8((BigDecimal) objectData.getData("RD_MOR_NUM_CTAS8"));
        result.setRdMorPjeCtas8((BigDecimal) objectData.getData("RD_MOR_PJE_CTAS8"));
        result.setRdMorImporte8((BigDecimal) objectData.getData("RD_MOR_IMPORTE8"));

        return result;

    }

}
