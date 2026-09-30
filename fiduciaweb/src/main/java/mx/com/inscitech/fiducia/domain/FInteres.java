package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_INTERES_PK", columns = { "FINT_ID_PROGRAMA", "FINT_ID_CALC_SECUENCIAL" }, sequences = { "MANUAL" })
public class FInteres extends DomainObject {

    BigDecimal fintIdCalcSecuencial = null;
    BigDecimal fintIdPrograma = null;
    String fintNomPrograma = null;
    BigDecimal fintIdEmision = null;
    String fintIdTipoCalculo = null;
    String fintIdFecCalcPer = null;
    BigDecimal fintIdFormula = null;
    String fintNomFormula = null;
    String fintNomEmisor = null;
    String fintNomContrato = null;
    String fintStEmipcal = null;
    BigDecimal fintIdFideicomiso = null;
    String fintCvePizarra = null;
    String fintNumSerie = null;
    BigDecimal fintImpEmision = null;
    BigDecimal fintNumTitulos = null;
    String fintImpNomEmision = null;
    BigDecimal fintNumMoneda = null;
    String fintDestinoRecurso = null;
    BigDecimal fintAnoPlazo = null;
    BigDecimal fintDiasPlazo = null;
    String fintFecInicio = null;
    String fintFecVencimiento = null;
    String fintRepComun = null;
    String fintIntColocador = null;
    String fintAutorizacionCnbv = null;
    String fintFecCnbv = null;
    String fintAutorizacionBanxico = null;
    String fintFecBanxico = null;
    String fintFecSerie = null;
    String fintFecSubasta = null;
    String fintFecOfrecimiento = null;
    String fintFecEmision = null;
    String fintFecBolsa = null;
    String fintFecCruce = null;
    String fintFecLiquidacion = null;
    String fintTipoSubasta = null;
    String fintActoConstitutivo = null;
    String fintComiteTecnico = null;
    BigDecimal fintRepoDist = null;
    String fintFecAlta = null;
    String fintFecMod = null;
    String fintInicioPeriodo = null;
    String fintFinDePeriodo = null;
    BigDecimal fintPeriodicidadDias = null;
    String fintFechaDePago = null;
    BigDecimal fintImpValNomTot = null;
    BigDecimal fintValnomTitulos = null;
    BigDecimal fintPorcTasaFija = null;
    BigDecimal fintTasaPromedio = null;
    BigDecimal fintTasa = null;
    BigDecimal fintTasaBase = null;
    BigDecimal fintSobretasa = null;
    BigDecimal fintTasaBruta = null;
    BigDecimal fintIsr = null;
    BigDecimal fintTasaNeta = null;
    BigDecimal fintDolarInicio = null;
    BigDecimal fintDolarFin = null;
    BigDecimal fintIsr2 = null;
    BigDecimal fintTasaAbsoluta = null;
    BigDecimal fintTasaEquibalente = null;
    String fintFechaCalculo = null;
    BigDecimal fintInteresesPer = null;
    BigDecimal fintInteresesCap = null;
    BigDecimal fintImpAmortizacion = null;
    BigDecimal fintAmorExt = null;
    String fintStEmision = null;
    String fintElaboro = null;
    String fintFirmaVobo = null;

    public FInteres() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintIdCalcSecuencial(BigDecimal fintIdCalcSecuencial) {
        this.fintIdCalcSecuencial = fintIdCalcSecuencial;
    }

    public BigDecimal getFintIdCalcSecuencial() {
        return this.fintIdCalcSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintIdPrograma(BigDecimal fintIdPrograma) {
        this.fintIdPrograma = fintIdPrograma;
    }

    public BigDecimal getFintIdPrograma() {
        return this.fintIdPrograma;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintNomPrograma(String fintNomPrograma) {
        this.fintNomPrograma = fintNomPrograma;
    }

    public String getFintNomPrograma() {
        return this.fintNomPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintIdEmision(BigDecimal fintIdEmision) {
        this.fintIdEmision = fintIdEmision;
    }

    public BigDecimal getFintIdEmision() {
        return this.fintIdEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintIdTipoCalculo(String fintIdTipoCalculo) {
        this.fintIdTipoCalculo = fintIdTipoCalculo;
    }

    public String getFintIdTipoCalculo() {
        return this.fintIdTipoCalculo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintIdFecCalcPer(String fintIdFecCalcPer) {
        this.fintIdFecCalcPer = fintIdFecCalcPer;
    }

    public String getFintIdFecCalcPer() {
        return this.fintIdFecCalcPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintIdFormula(BigDecimal fintIdFormula) {
        this.fintIdFormula = fintIdFormula;
    }

    public BigDecimal getFintIdFormula() {
        return this.fintIdFormula;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintNomFormula(String fintNomFormula) {
        this.fintNomFormula = fintNomFormula;
    }

    public String getFintNomFormula() {
        return this.fintNomFormula;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintNomEmisor(String fintNomEmisor) {
        this.fintNomEmisor = fintNomEmisor;
    }

    public String getFintNomEmisor() {
        return this.fintNomEmisor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintNomContrato(String fintNomContrato) {
        this.fintNomContrato = fintNomContrato;
    }

    public String getFintNomContrato() {
        return this.fintNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintStEmipcal(String fintStEmipcal) {
        this.fintStEmipcal = fintStEmipcal;
    }

    public String getFintStEmipcal() {
        return this.fintStEmipcal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintIdFideicomiso(BigDecimal fintIdFideicomiso) {
        this.fintIdFideicomiso = fintIdFideicomiso;
    }

    public BigDecimal getFintIdFideicomiso() {
        return this.fintIdFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintCvePizarra(String fintCvePizarra) {
        this.fintCvePizarra = fintCvePizarra;
    }

    public String getFintCvePizarra() {
        return this.fintCvePizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintNumSerie(String fintNumSerie) {
        this.fintNumSerie = fintNumSerie;
    }

    public String getFintNumSerie() {
        return this.fintNumSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintImpEmision(BigDecimal fintImpEmision) {
        this.fintImpEmision = fintImpEmision;
    }

    public BigDecimal getFintImpEmision() {
        return this.fintImpEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintNumTitulos(BigDecimal fintNumTitulos) {
        this.fintNumTitulos = fintNumTitulos;
    }

    public BigDecimal getFintNumTitulos() {
        return this.fintNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintImpNomEmision(String fintImpNomEmision) {
        this.fintImpNomEmision = fintImpNomEmision;
    }

    public String getFintImpNomEmision() {
        return this.fintImpNomEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintNumMoneda(BigDecimal fintNumMoneda) {
        this.fintNumMoneda = fintNumMoneda;
    }

    public BigDecimal getFintNumMoneda() {
        return this.fintNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintDestinoRecurso(String fintDestinoRecurso) {
        this.fintDestinoRecurso = fintDestinoRecurso;
    }

    public String getFintDestinoRecurso() {
        return this.fintDestinoRecurso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintAnoPlazo(BigDecimal fintAnoPlazo) {
        this.fintAnoPlazo = fintAnoPlazo;
    }

    public BigDecimal getFintAnoPlazo() {
        return this.fintAnoPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintDiasPlazo(BigDecimal fintDiasPlazo) {
        this.fintDiasPlazo = fintDiasPlazo;
    }

    public BigDecimal getFintDiasPlazo() {
        return this.fintDiasPlazo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecInicio(String fintFecInicio) {
        this.fintFecInicio = fintFecInicio;
    }

    public String getFintFecInicio() {
        return this.fintFecInicio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecVencimiento(String fintFecVencimiento) {
        this.fintFecVencimiento = fintFecVencimiento;
    }

    public String getFintFecVencimiento() {
        return this.fintFecVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintRepComun(String fintRepComun) {
        this.fintRepComun = fintRepComun;
    }

    public String getFintRepComun() {
        return this.fintRepComun;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintIntColocador(String fintIntColocador) {
        this.fintIntColocador = fintIntColocador;
    }

    public String getFintIntColocador() {
        return this.fintIntColocador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintAutorizacionCnbv(String fintAutorizacionCnbv) {
        this.fintAutorizacionCnbv = fintAutorizacionCnbv;
    }

    public String getFintAutorizacionCnbv() {
        return this.fintAutorizacionCnbv;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecCnbv(String fintFecCnbv) {
        this.fintFecCnbv = fintFecCnbv;
    }

    public String getFintFecCnbv() {
        return this.fintFecCnbv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintAutorizacionBanxico(String fintAutorizacionBanxico) {
        this.fintAutorizacionBanxico = fintAutorizacionBanxico;
    }

    public String getFintAutorizacionBanxico() {
        return this.fintAutorizacionBanxico;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecBanxico(String fintFecBanxico) {
        this.fintFecBanxico = fintFecBanxico;
    }

    public String getFintFecBanxico() {
        return this.fintFecBanxico;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecSerie(String fintFecSerie) {
        this.fintFecSerie = fintFecSerie;
    }

    public String getFintFecSerie() {
        return this.fintFecSerie;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecSubasta(String fintFecSubasta) {
        this.fintFecSubasta = fintFecSubasta;
    }

    public String getFintFecSubasta() {
        return this.fintFecSubasta;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecOfrecimiento(String fintFecOfrecimiento) {
        this.fintFecOfrecimiento = fintFecOfrecimiento;
    }

    public String getFintFecOfrecimiento() {
        return this.fintFecOfrecimiento;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecEmision(String fintFecEmision) {
        this.fintFecEmision = fintFecEmision;
    }

    public String getFintFecEmision() {
        return this.fintFecEmision;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecBolsa(String fintFecBolsa) {
        this.fintFecBolsa = fintFecBolsa;
    }

    public String getFintFecBolsa() {
        return this.fintFecBolsa;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecCruce(String fintFecCruce) {
        this.fintFecCruce = fintFecCruce;
    }

    public String getFintFecCruce() {
        return this.fintFecCruce;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecLiquidacion(String fintFecLiquidacion) {
        this.fintFecLiquidacion = fintFecLiquidacion;
    }

    public String getFintFecLiquidacion() {
        return this.fintFecLiquidacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintTipoSubasta(String fintTipoSubasta) {
        this.fintTipoSubasta = fintTipoSubasta;
    }

    public String getFintTipoSubasta() {
        return this.fintTipoSubasta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintActoConstitutivo(String fintActoConstitutivo) {
        this.fintActoConstitutivo = fintActoConstitutivo;
    }

    public String getFintActoConstitutivo() {
        return this.fintActoConstitutivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintComiteTecnico(String fintComiteTecnico) {
        this.fintComiteTecnico = fintComiteTecnico;
    }

    public String getFintComiteTecnico() {
        return this.fintComiteTecnico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFintRepoDist(BigDecimal fintRepoDist) {
        this.fintRepoDist = fintRepoDist;
    }

    public BigDecimal getFintRepoDist() {
        return this.fintRepoDist;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecAlta(String fintFecAlta) {
        this.fintFecAlta = fintFecAlta;
    }

    public String getFintFecAlta() {
        return this.fintFecAlta;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFecMod(String fintFecMod) {
        this.fintFecMod = fintFecMod;
    }

    public String getFintFecMod() {
        return this.fintFecMod;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintInicioPeriodo(String fintInicioPeriodo) {
        this.fintInicioPeriodo = fintInicioPeriodo;
    }

    public String getFintInicioPeriodo() {
        return this.fintInicioPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFinDePeriodo(String fintFinDePeriodo) {
        this.fintFinDePeriodo = fintFinDePeriodo;
    }

    public String getFintFinDePeriodo() {
        return this.fintFinDePeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintPeriodicidadDias(BigDecimal fintPeriodicidadDias) {
        this.fintPeriodicidadDias = fintPeriodicidadDias;
    }

    public BigDecimal getFintPeriodicidadDias() {
        return this.fintPeriodicidadDias;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFechaDePago(String fintFechaDePago) {
        this.fintFechaDePago = fintFechaDePago;
    }

    public String getFintFechaDePago() {
        return this.fintFechaDePago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintImpValNomTot(BigDecimal fintImpValNomTot) {
        this.fintImpValNomTot = fintImpValNomTot;
    }

    public BigDecimal getFintImpValNomTot() {
        return this.fintImpValNomTot;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFintValnomTitulos(BigDecimal fintValnomTitulos) {
        this.fintValnomTitulos = fintValnomTitulos;
    }

    public BigDecimal getFintValnomTitulos() {
        return this.fintValnomTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintPorcTasaFija(BigDecimal fintPorcTasaFija) {
        this.fintPorcTasaFija = fintPorcTasaFija;
    }

    public BigDecimal getFintPorcTasaFija() {
        return this.fintPorcTasaFija;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setFintTasaPromedio(BigDecimal fintTasaPromedio) {
        this.fintTasaPromedio = fintTasaPromedio;
    }

    public BigDecimal getFintTasaPromedio() {
        return this.fintTasaPromedio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setFintTasa(BigDecimal fintTasa) {
        this.fintTasa = fintTasa;
    }

    public BigDecimal getFintTasa() {
        return this.fintTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setFintTasaBase(BigDecimal fintTasaBase) {
        this.fintTasaBase = fintTasaBase;
    }

    public BigDecimal getFintTasaBase() {
        return this.fintTasaBase;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setFintSobretasa(BigDecimal fintSobretasa) {
        this.fintSobretasa = fintSobretasa;
    }

    public BigDecimal getFintSobretasa() {
        return this.fintSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setFintTasaBruta(BigDecimal fintTasaBruta) {
        this.fintTasaBruta = fintTasaBruta;
    }

    public BigDecimal getFintTasaBruta() {
        return this.fintTasaBruta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintIsr(BigDecimal fintIsr) {
        this.fintIsr = fintIsr;
    }

    public BigDecimal getFintIsr() {
        return this.fintIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setFintTasaNeta(BigDecimal fintTasaNeta) {
        this.fintTasaNeta = fintTasaNeta;
    }

    public BigDecimal getFintTasaNeta() {
        return this.fintTasaNeta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintDolarInicio(BigDecimal fintDolarInicio) {
        this.fintDolarInicio = fintDolarInicio;
    }

    public BigDecimal getFintDolarInicio() {
        return this.fintDolarInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintDolarFin(BigDecimal fintDolarFin) {
        this.fintDolarFin = fintDolarFin;
    }

    public BigDecimal getFintDolarFin() {
        return this.fintDolarFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintIsr2(BigDecimal fintIsr2) {
        this.fintIsr2 = fintIsr2;
    }

    public BigDecimal getFintIsr2() {
        return this.fintIsr2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setFintTasaAbsoluta(BigDecimal fintTasaAbsoluta) {
        this.fintTasaAbsoluta = fintTasaAbsoluta;
    }

    public BigDecimal getFintTasaAbsoluta() {
        return this.fintTasaAbsoluta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setFintTasaEquibalente(BigDecimal fintTasaEquibalente) {
        this.fintTasaEquibalente = fintTasaEquibalente;
    }

    public BigDecimal getFintTasaEquibalente() {
        return this.fintTasaEquibalente;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFintFechaCalculo(String fintFechaCalculo) {
        this.fintFechaCalculo = fintFechaCalculo;
    }

    public String getFintFechaCalculo() {
        return this.fintFechaCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintInteresesPer(BigDecimal fintInteresesPer) {
        this.fintInteresesPer = fintInteresesPer;
    }

    public BigDecimal getFintInteresesPer() {
        return this.fintInteresesPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintInteresesCap(BigDecimal fintInteresesCap) {
        this.fintInteresesCap = fintInteresesCap;
    }

    public BigDecimal getFintInteresesCap() {
        return this.fintInteresesCap;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintImpAmortizacion(BigDecimal fintImpAmortizacion) {
        this.fintImpAmortizacion = fintImpAmortizacion;
    }

    public BigDecimal getFintImpAmortizacion() {
        return this.fintImpAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFintAmorExt(BigDecimal fintAmorExt) {
        this.fintAmorExt = fintAmorExt;
    }

    public BigDecimal getFintAmorExt() {
        return this.fintAmorExt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintStEmision(String fintStEmision) {
        this.fintStEmision = fintStEmision;
    }

    public String getFintStEmision() {
        return this.fintStEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintElaboro(String fintElaboro) {
        this.fintElaboro = fintElaboro;
    }

    public String getFintElaboro() {
        return this.fintElaboro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFintFirmaVobo(String fintFirmaVobo) {
        this.fintFirmaVobo = fintFirmaVobo;
    }

    public String getFintFirmaVobo() {
        return this.fintFirmaVobo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_INTERES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFintIdCalcSecuencial() != null && this.getFintIdCalcSecuencial().longValue() == -999) {
            conditions += " AND FINT_ID_CALC_SECUENCIAL IS NULL";
        } else if (this.getFintIdCalcSecuencial() != null) {
            conditions += " AND FINT_ID_CALC_SECUENCIAL = ?";
            values.add(this.getFintIdCalcSecuencial());
        }

        if (this.getFintIdPrograma() != null && this.getFintIdPrograma().longValue() == -999) {
            conditions += " AND FINT_ID_PROGRAMA IS NULL";
        } else if (this.getFintIdPrograma() != null) {
            conditions += " AND FINT_ID_PROGRAMA = ?";
            values.add(this.getFintIdPrograma());
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
        String sql = "SELECT * FROM F_INTERES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFintIdCalcSecuencial() != null && this.getFintIdCalcSecuencial().longValue() == -999) {
            conditions += " AND FINT_ID_CALC_SECUENCIAL IS NULL";
        } else if (this.getFintIdCalcSecuencial() != null) {
            conditions += " AND FINT_ID_CALC_SECUENCIAL = ?";
            values.add(this.getFintIdCalcSecuencial());
        }

        if (this.getFintIdPrograma() != null && this.getFintIdPrograma().longValue() == -999) {
            conditions += " AND FINT_ID_PROGRAMA IS NULL";
        } else if (this.getFintIdPrograma() != null) {
            conditions += " AND FINT_ID_PROGRAMA = ?";
            values.add(this.getFintIdPrograma());
        }

        if (this.getFintNomPrograma() != null && "null".equals(this.getFintNomPrograma())) {
            conditions += " AND FINT_NOM_PROGRAMA IS NULL";
        } else if (this.getFintNomPrograma() != null) {
            conditions += " AND FINT_NOM_PROGRAMA = ?";
            values.add(this.getFintNomPrograma());
        }

        if (this.getFintIdEmision() != null && this.getFintIdEmision().longValue() == -999) {
            conditions += " AND FINT_ID_EMISION IS NULL";
        } else if (this.getFintIdEmision() != null) {
            conditions += " AND FINT_ID_EMISION = ?";
            values.add(this.getFintIdEmision());
        }

        if (this.getFintIdTipoCalculo() != null && "null".equals(this.getFintIdTipoCalculo())) {
            conditions += " AND FINT_ID_TIPO_CALCULO IS NULL";
        } else if (this.getFintIdTipoCalculo() != null) {
            conditions += " AND FINT_ID_TIPO_CALCULO = ?";
            values.add(this.getFintIdTipoCalculo());
        }

        if (this.getFintIdFecCalcPer() != null && "null".equals(this.getFintIdFecCalcPer())) {
            conditions += " AND FINT_ID_FEC_CALC_PER IS NULL";
        } else if (this.getFintIdFecCalcPer() != null) {
            conditions += " AND FINT_ID_FEC_CALC_PER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintIdFecCalcPer());
        }

        if (this.getFintIdFormula() != null && this.getFintIdFormula().longValue() == -999) {
            conditions += " AND FINT_ID_FORMULA IS NULL";
        } else if (this.getFintIdFormula() != null) {
            conditions += " AND FINT_ID_FORMULA = ?";
            values.add(this.getFintIdFormula());
        }

        if (this.getFintNomFormula() != null && "null".equals(this.getFintNomFormula())) {
            conditions += " AND FINT_NOM_FORMULA IS NULL";
        } else if (this.getFintNomFormula() != null) {
            conditions += " AND FINT_NOM_FORMULA = ?";
            values.add(this.getFintNomFormula());
        }

        if (this.getFintNomEmisor() != null && "null".equals(this.getFintNomEmisor())) {
            conditions += " AND FINT_NOM_EMISOR IS NULL";
        } else if (this.getFintNomEmisor() != null) {
            conditions += " AND FINT_NOM_EMISOR = ?";
            values.add(this.getFintNomEmisor());
        }

        if (this.getFintNomContrato() != null && "null".equals(this.getFintNomContrato())) {
            conditions += " AND FINT_NOM_CONTRATO IS NULL";
        } else if (this.getFintNomContrato() != null) {
            conditions += " AND FINT_NOM_CONTRATO = ?";
            values.add(this.getFintNomContrato());
        }

        if (this.getFintStEmipcal() != null && "null".equals(this.getFintStEmipcal())) {
            conditions += " AND FINT_ST_EMIPCAL IS NULL";
        } else if (this.getFintStEmipcal() != null) {
            conditions += " AND FINT_ST_EMIPCAL = ?";
            values.add(this.getFintStEmipcal());
        }

        if (this.getFintIdFideicomiso() != null && this.getFintIdFideicomiso().longValue() == -999) {
            conditions += " AND FINT_ID_FIDEICOMISO IS NULL";
        } else if (this.getFintIdFideicomiso() != null) {
            conditions += " AND FINT_ID_FIDEICOMISO = ?";
            values.add(this.getFintIdFideicomiso());
        }

        if (this.getFintCvePizarra() != null && "null".equals(this.getFintCvePizarra())) {
            conditions += " AND FINT_CVE_PIZARRA IS NULL";
        } else if (this.getFintCvePizarra() != null) {
            conditions += " AND FINT_CVE_PIZARRA = ?";
            values.add(this.getFintCvePizarra());
        }

        if (this.getFintNumSerie() != null && "null".equals(this.getFintNumSerie())) {
            conditions += " AND FINT_NUM_SERIE IS NULL";
        } else if (this.getFintNumSerie() != null) {
            conditions += " AND FINT_NUM_SERIE = ?";
            values.add(this.getFintNumSerie());
        }

        if (this.getFintImpEmision() != null && this.getFintImpEmision().longValue() == -999) {
            conditions += " AND FINT_IMP_EMISION IS NULL";
        } else if (this.getFintImpEmision() != null) {
            conditions += " AND FINT_IMP_EMISION = ?";
            values.add(this.getFintImpEmision());
        }

        if (this.getFintNumTitulos() != null && this.getFintNumTitulos().longValue() == -999) {
            conditions += " AND FINT_NUM_TITULOS IS NULL";
        } else if (this.getFintNumTitulos() != null) {
            conditions += " AND FINT_NUM_TITULOS = ?";
            values.add(this.getFintNumTitulos());
        }

        if (this.getFintImpNomEmision() != null && "null".equals(this.getFintImpNomEmision())) {
            conditions += " AND FINT_IMP_NOM_EMISION IS NULL";
        } else if (this.getFintImpNomEmision() != null) {
            conditions += " AND FINT_IMP_NOM_EMISION = ?";
            values.add(this.getFintImpNomEmision());
        }

        if (this.getFintNumMoneda() != null && this.getFintNumMoneda().longValue() == -999) {
            conditions += " AND FINT_NUM_MONEDA IS NULL";
        } else if (this.getFintNumMoneda() != null) {
            conditions += " AND FINT_NUM_MONEDA = ?";
            values.add(this.getFintNumMoneda());
        }

        if (this.getFintDestinoRecurso() != null && "null".equals(this.getFintDestinoRecurso())) {
            conditions += " AND FINT_DESTINO_RECURSO IS NULL";
        } else if (this.getFintDestinoRecurso() != null) {
            conditions += " AND FINT_DESTINO_RECURSO = ?";
            values.add(this.getFintDestinoRecurso());
        }

        if (this.getFintAnoPlazo() != null && this.getFintAnoPlazo().longValue() == -999) {
            conditions += " AND FINT_ANO_PLAZO IS NULL";
        } else if (this.getFintAnoPlazo() != null) {
            conditions += " AND FINT_ANO_PLAZO = ?";
            values.add(this.getFintAnoPlazo());
        }

        if (this.getFintDiasPlazo() != null && this.getFintDiasPlazo().longValue() == -999) {
            conditions += " AND FINT_DIAS_PLAZO IS NULL";
        } else if (this.getFintDiasPlazo() != null) {
            conditions += " AND FINT_DIAS_PLAZO = ?";
            values.add(this.getFintDiasPlazo());
        }

        if (this.getFintFecInicio() != null && "null".equals(this.getFintFecInicio())) {
            conditions += " AND FINT_FEC_INICIO IS NULL";
        } else if (this.getFintFecInicio() != null) {
            conditions += " AND FINT_FEC_INICIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecInicio());
        }

        if (this.getFintFecVencimiento() != null && "null".equals(this.getFintFecVencimiento())) {
            conditions += " AND FINT_FEC_VENCIMIENTO IS NULL";
        } else if (this.getFintFecVencimiento() != null) {
            conditions += " AND FINT_FEC_VENCIMIENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecVencimiento());
        }

        if (this.getFintRepComun() != null && "null".equals(this.getFintRepComun())) {
            conditions += " AND FINT_REP_COMUN IS NULL";
        } else if (this.getFintRepComun() != null) {
            conditions += " AND FINT_REP_COMUN = ?";
            values.add(this.getFintRepComun());
        }

        if (this.getFintIntColocador() != null && "null".equals(this.getFintIntColocador())) {
            conditions += " AND FINT_INT_COLOCADOR IS NULL";
        } else if (this.getFintIntColocador() != null) {
            conditions += " AND FINT_INT_COLOCADOR = ?";
            values.add(this.getFintIntColocador());
        }

        if (this.getFintAutorizacionCnbv() != null && "null".equals(this.getFintAutorizacionCnbv())) {
            conditions += " AND FINT_AUTORIZACION_CNBV IS NULL";
        } else if (this.getFintAutorizacionCnbv() != null) {
            conditions += " AND FINT_AUTORIZACION_CNBV = ?";
            values.add(this.getFintAutorizacionCnbv());
        }

        if (this.getFintFecCnbv() != null && "null".equals(this.getFintFecCnbv())) {
            conditions += " AND FINT_FEC_CNBV IS NULL";
        } else if (this.getFintFecCnbv() != null) {
            conditions += " AND FINT_FEC_CNBV = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecCnbv());
        }

        if (this.getFintAutorizacionBanxico() != null && "null".equals(this.getFintAutorizacionBanxico())) {
            conditions += " AND FINT_AUTORIZACION_BANXICO IS NULL";
        } else if (this.getFintAutorizacionBanxico() != null) {
            conditions += " AND FINT_AUTORIZACION_BANXICO = ?";
            values.add(this.getFintAutorizacionBanxico());
        }

        if (this.getFintFecBanxico() != null && "null".equals(this.getFintFecBanxico())) {
            conditions += " AND FINT_FEC_BANXICO IS NULL";
        } else if (this.getFintFecBanxico() != null) {
            conditions += " AND FINT_FEC_BANXICO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecBanxico());
        }

        if (this.getFintFecSerie() != null && "null".equals(this.getFintFecSerie())) {
            conditions += " AND FINT_FEC_SERIE IS NULL";
        } else if (this.getFintFecSerie() != null) {
            conditions += " AND FINT_FEC_SERIE = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecSerie());
        }

        if (this.getFintFecSubasta() != null && "null".equals(this.getFintFecSubasta())) {
            conditions += " AND FINT_FEC_SUBASTA IS NULL";
        } else if (this.getFintFecSubasta() != null) {
            conditions += " AND FINT_FEC_SUBASTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecSubasta());
        }

        if (this.getFintFecOfrecimiento() != null && "null".equals(this.getFintFecOfrecimiento())) {
            conditions += " AND FINT_FEC_OFRECIMIENTO IS NULL";
        } else if (this.getFintFecOfrecimiento() != null) {
            conditions += " AND FINT_FEC_OFRECIMIENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecOfrecimiento());
        }

        if (this.getFintFecEmision() != null && "null".equals(this.getFintFecEmision())) {
            conditions += " AND FINT_FEC_EMISION IS NULL";
        } else if (this.getFintFecEmision() != null) {
            conditions += " AND FINT_FEC_EMISION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecEmision());
        }

        if (this.getFintFecBolsa() != null && "null".equals(this.getFintFecBolsa())) {
            conditions += " AND FINT_FEC_BOLSA IS NULL";
        } else if (this.getFintFecBolsa() != null) {
            conditions += " AND FINT_FEC_BOLSA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecBolsa());
        }

        if (this.getFintFecCruce() != null && "null".equals(this.getFintFecCruce())) {
            conditions += " AND FINT_FEC_CRUCE IS NULL";
        } else if (this.getFintFecCruce() != null) {
            conditions += " AND FINT_FEC_CRUCE = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecCruce());
        }

        if (this.getFintFecLiquidacion() != null && "null".equals(this.getFintFecLiquidacion())) {
            conditions += " AND FINT_FEC_LIQUIDACION IS NULL";
        } else if (this.getFintFecLiquidacion() != null) {
            conditions += " AND FINT_FEC_LIQUIDACION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecLiquidacion());
        }

        if (this.getFintTipoSubasta() != null && "null".equals(this.getFintTipoSubasta())) {
            conditions += " AND FINT_TIPO_SUBASTA IS NULL";
        } else if (this.getFintTipoSubasta() != null) {
            conditions += " AND FINT_TIPO_SUBASTA = ?";
            values.add(this.getFintTipoSubasta());
        }

        if (this.getFintActoConstitutivo() != null && "null".equals(this.getFintActoConstitutivo())) {
            conditions += " AND FINT_ACTO_CONSTITUTIVO IS NULL";
        } else if (this.getFintActoConstitutivo() != null) {
            conditions += " AND FINT_ACTO_CONSTITUTIVO = ?";
            values.add(this.getFintActoConstitutivo());
        }

        if (this.getFintComiteTecnico() != null && "null".equals(this.getFintComiteTecnico())) {
            conditions += " AND FINT_COMITE_TECNICO IS NULL";
        } else if (this.getFintComiteTecnico() != null) {
            conditions += " AND FINT_COMITE_TECNICO = ?";
            values.add(this.getFintComiteTecnico());
        }

        if (this.getFintRepoDist() != null && this.getFintRepoDist().longValue() == -999) {
            conditions += " AND FINT_REPO_DIST IS NULL";
        } else if (this.getFintRepoDist() != null) {
            conditions += " AND FINT_REPO_DIST = ?";
            values.add(this.getFintRepoDist());
        }

        if (this.getFintFecAlta() != null && "null".equals(this.getFintFecAlta())) {
            conditions += " AND FINT_FEC_ALTA IS NULL";
        } else if (this.getFintFecAlta() != null) {
            conditions += " AND FINT_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecAlta());
        }

        if (this.getFintFecMod() != null && "null".equals(this.getFintFecMod())) {
            conditions += " AND FINT_FEC_MOD IS NULL";
        } else if (this.getFintFecMod() != null) {
            conditions += " AND FINT_FEC_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFecMod());
        }

        if (this.getFintInicioPeriodo() != null && "null".equals(this.getFintInicioPeriodo())) {
            conditions += " AND FINT_INICIO_PERIODO IS NULL";
        } else if (this.getFintInicioPeriodo() != null) {
            conditions += " AND FINT_INICIO_PERIODO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintInicioPeriodo());
        }

        if (this.getFintFinDePeriodo() != null && "null".equals(this.getFintFinDePeriodo())) {
            conditions += " AND FINT_FIN_DE_PERIODO IS NULL";
        } else if (this.getFintFinDePeriodo() != null) {
            conditions += " AND FINT_FIN_DE_PERIODO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFinDePeriodo());
        }

        if (this.getFintPeriodicidadDias() != null && this.getFintPeriodicidadDias().longValue() == -999) {
            conditions += " AND FINT_PERIODICIDAD_DIAS IS NULL";
        } else if (this.getFintPeriodicidadDias() != null) {
            conditions += " AND FINT_PERIODICIDAD_DIAS = ?";
            values.add(this.getFintPeriodicidadDias());
        }

        if (this.getFintFechaDePago() != null && "null".equals(this.getFintFechaDePago())) {
            conditions += " AND FINT_FECHA_DE_PAGO IS NULL";
        } else if (this.getFintFechaDePago() != null) {
            conditions += " AND FINT_FECHA_DE_PAGO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFechaDePago());
        }

        if (this.getFintImpValNomTot() != null && this.getFintImpValNomTot().longValue() == -999) {
            conditions += " AND FINT_IMP_VAL_NOM_TOT IS NULL";
        } else if (this.getFintImpValNomTot() != null) {
            conditions += " AND FINT_IMP_VAL_NOM_TOT = ?";
            values.add(this.getFintImpValNomTot());
        }

        if (this.getFintValnomTitulos() != null && this.getFintValnomTitulos().longValue() == -999) {
            conditions += " AND FINT_VALNOM_TITULOS IS NULL";
        } else if (this.getFintValnomTitulos() != null) {
            conditions += " AND FINT_VALNOM_TITULOS = ?";
            values.add(this.getFintValnomTitulos());
        }

        if (this.getFintPorcTasaFija() != null && this.getFintPorcTasaFija().longValue() == -999) {
            conditions += " AND FINT_PORC_TASA_FIJA IS NULL";
        } else if (this.getFintPorcTasaFija() != null) {
            conditions += " AND FINT_PORC_TASA_FIJA = ?";
            values.add(this.getFintPorcTasaFija());
        }

        if (this.getFintTasaPromedio() != null && this.getFintTasaPromedio().longValue() == -999) {
            conditions += " AND FINT_TASA_PROMEDIO IS NULL";
        } else if (this.getFintTasaPromedio() != null) {
            conditions += " AND FINT_TASA_PROMEDIO = ?";
            values.add(this.getFintTasaPromedio());
        }

        if (this.getFintTasa() != null && this.getFintTasa().longValue() == -999) {
            conditions += " AND FINT_TASA IS NULL";
        } else if (this.getFintTasa() != null) {
            conditions += " AND FINT_TASA = ?";
            values.add(this.getFintTasa());
        }

        if (this.getFintTasaBase() != null && this.getFintTasaBase().longValue() == -999) {
            conditions += " AND FINT_TASA_BASE IS NULL";
        } else if (this.getFintTasaBase() != null) {
            conditions += " AND FINT_TASA_BASE = ?";
            values.add(this.getFintTasaBase());
        }

        if (this.getFintSobretasa() != null && this.getFintSobretasa().longValue() == -999) {
            conditions += " AND FINT_SOBRETASA IS NULL";
        } else if (this.getFintSobretasa() != null) {
            conditions += " AND FINT_SOBRETASA = ?";
            values.add(this.getFintSobretasa());
        }

        if (this.getFintTasaBruta() != null && this.getFintTasaBruta().longValue() == -999) {
            conditions += " AND FINT_TASA_BRUTA IS NULL";
        } else if (this.getFintTasaBruta() != null) {
            conditions += " AND FINT_TASA_BRUTA = ?";
            values.add(this.getFintTasaBruta());
        }

        if (this.getFintIsr() != null && this.getFintIsr().longValue() == -999) {
            conditions += " AND FINT_ISR IS NULL";
        } else if (this.getFintIsr() != null) {
            conditions += " AND FINT_ISR = ?";
            values.add(this.getFintIsr());
        }

        if (this.getFintTasaNeta() != null && this.getFintTasaNeta().longValue() == -999) {
            conditions += " AND FINT_TASA_NETA IS NULL";
        } else if (this.getFintTasaNeta() != null) {
            conditions += " AND FINT_TASA_NETA = ?";
            values.add(this.getFintTasaNeta());
        }

        if (this.getFintDolarInicio() != null && this.getFintDolarInicio().longValue() == -999) {
            conditions += " AND FINT_DOLAR_INICIO IS NULL";
        } else if (this.getFintDolarInicio() != null) {
            conditions += " AND FINT_DOLAR_INICIO = ?";
            values.add(this.getFintDolarInicio());
        }

        if (this.getFintDolarFin() != null && this.getFintDolarFin().longValue() == -999) {
            conditions += " AND FINT_DOLAR_FIN IS NULL";
        } else if (this.getFintDolarFin() != null) {
            conditions += " AND FINT_DOLAR_FIN = ?";
            values.add(this.getFintDolarFin());
        }

        if (this.getFintIsr2() != null && this.getFintIsr2().longValue() == -999) {
            conditions += " AND FINT_ISR2 IS NULL";
        } else if (this.getFintIsr2() != null) {
            conditions += " AND FINT_ISR2 = ?";
            values.add(this.getFintIsr2());
        }

        if (this.getFintTasaAbsoluta() != null && this.getFintTasaAbsoluta().longValue() == -999) {
            conditions += " AND FINT_TASA_ABSOLUTA IS NULL";
        } else if (this.getFintTasaAbsoluta() != null) {
            conditions += " AND FINT_TASA_ABSOLUTA = ?";
            values.add(this.getFintTasaAbsoluta());
        }

        if (this.getFintTasaEquibalente() != null && this.getFintTasaEquibalente().longValue() == -999) {
            conditions += " AND FINT_TASA_EQUIBALENTE IS NULL";
        } else if (this.getFintTasaEquibalente() != null) {
            conditions += " AND FINT_TASA_EQUIBALENTE = ?";
            values.add(this.getFintTasaEquibalente());
        }

        if (this.getFintFechaCalculo() != null && "null".equals(this.getFintFechaCalculo())) {
            conditions += " AND FINT_FECHA_CALCULO IS NULL";
        } else if (this.getFintFechaCalculo() != null) {
            conditions += " AND FINT_FECHA_CALCULO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFintFechaCalculo());
        }

        if (this.getFintInteresesPer() != null && this.getFintInteresesPer().longValue() == -999) {
            conditions += " AND FINT_INTERESES_PER IS NULL";
        } else if (this.getFintInteresesPer() != null) {
            conditions += " AND FINT_INTERESES_PER = ?";
            values.add(this.getFintInteresesPer());
        }

        if (this.getFintInteresesCap() != null && this.getFintInteresesCap().longValue() == -999) {
            conditions += " AND FINT_INTERESES_CAP IS NULL";
        } else if (this.getFintInteresesCap() != null) {
            conditions += " AND FINT_INTERESES_CAP = ?";
            values.add(this.getFintInteresesCap());
        }

        if (this.getFintImpAmortizacion() != null && this.getFintImpAmortizacion().longValue() == -999) {
            conditions += " AND FINT_IMP_AMORTIZACION IS NULL";
        } else if (this.getFintImpAmortizacion() != null) {
            conditions += " AND FINT_IMP_AMORTIZACION = ?";
            values.add(this.getFintImpAmortizacion());
        }

        if (this.getFintAmorExt() != null && this.getFintAmorExt().longValue() == -999) {
            conditions += " AND FINT_AMOR_EXT IS NULL";
        } else if (this.getFintAmorExt() != null) {
            conditions += " AND FINT_AMOR_EXT = ?";
            values.add(this.getFintAmorExt());
        }

        if (this.getFintStEmision() != null && "null".equals(this.getFintStEmision())) {
            conditions += " AND FINT_ST_EMISION IS NULL";
        } else if (this.getFintStEmision() != null) {
            conditions += " AND FINT_ST_EMISION = ?";
            values.add(this.getFintStEmision());
        }

        if (this.getFintElaboro() != null && "null".equals(this.getFintElaboro())) {
            conditions += " AND FINT_ELABORO IS NULL";
        } else if (this.getFintElaboro() != null) {
            conditions += " AND FINT_ELABORO = ?";
            values.add(this.getFintElaboro());
        }

        if (this.getFintFirmaVobo() != null && "null".equals(this.getFintFirmaVobo())) {
            conditions += " AND FINT_FIRMA_VOBO IS NULL";
        } else if (this.getFintFirmaVobo() != null) {
            conditions += " AND FINT_FIRMA_VOBO = ?";
            values.add(this.getFintFirmaVobo());
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
        String sql = "UPDATE F_INTERES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FINT_ID_CALC_SECUENCIAL = ?";
        pkValues.add(this.getFintIdCalcSecuencial());
        conditions += " AND FINT_ID_PROGRAMA = ?";
        pkValues.add(this.getFintIdPrograma());
        fields += " FINT_NOM_PROGRAMA = ?, ";
        values.add(this.getFintNomPrograma());
        fields += " FINT_ID_EMISION = ?, ";
        values.add(this.getFintIdEmision());
        fields += " FINT_ID_TIPO_CALCULO = ?, ";
        values.add(this.getFintIdTipoCalculo());
        fields += " FINT_ID_FEC_CALC_PER = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintIdFecCalcPer());
        fields += " FINT_ID_FORMULA = ?, ";
        values.add(this.getFintIdFormula());
        fields += " FINT_NOM_FORMULA = ?, ";
        values.add(this.getFintNomFormula());
        fields += " FINT_NOM_EMISOR = ?, ";
        values.add(this.getFintNomEmisor());
        fields += " FINT_NOM_CONTRATO = ?, ";
        values.add(this.getFintNomContrato());
        fields += " FINT_ST_EMIPCAL = ?, ";
        values.add(this.getFintStEmipcal());
        fields += " FINT_ID_FIDEICOMISO = ?, ";
        values.add(this.getFintIdFideicomiso());
        fields += " FINT_CVE_PIZARRA = ?, ";
        values.add(this.getFintCvePizarra());
        fields += " FINT_NUM_SERIE = ?, ";
        values.add(this.getFintNumSerie());
        fields += " FINT_IMP_EMISION = ?, ";
        values.add(this.getFintImpEmision());
        fields += " FINT_NUM_TITULOS = ?, ";
        values.add(this.getFintNumTitulos());
        fields += " FINT_IMP_NOM_EMISION = ?, ";
        values.add(this.getFintImpNomEmision());
        fields += " FINT_NUM_MONEDA = ?, ";
        values.add(this.getFintNumMoneda());
        fields += " FINT_DESTINO_RECURSO = ?, ";
        values.add(this.getFintDestinoRecurso());
        fields += " FINT_ANO_PLAZO = ?, ";
        values.add(this.getFintAnoPlazo());
        fields += " FINT_DIAS_PLAZO = ?, ";
        values.add(this.getFintDiasPlazo());
        fields += " FINT_FEC_INICIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecInicio());
        fields += " FINT_FEC_VENCIMIENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecVencimiento());
        fields += " FINT_REP_COMUN = ?, ";
        values.add(this.getFintRepComun());
        fields += " FINT_INT_COLOCADOR = ?, ";
        values.add(this.getFintIntColocador());
        fields += " FINT_AUTORIZACION_CNBV = ?, ";
        values.add(this.getFintAutorizacionCnbv());
        fields += " FINT_FEC_CNBV = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecCnbv());
        fields += " FINT_AUTORIZACION_BANXICO = ?, ";
        values.add(this.getFintAutorizacionBanxico());
        fields += " FINT_FEC_BANXICO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecBanxico());
        fields += " FINT_FEC_SERIE = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecSerie());
        fields += " FINT_FEC_SUBASTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecSubasta());
        fields += " FINT_FEC_OFRECIMIENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecOfrecimiento());
        fields += " FINT_FEC_EMISION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecEmision());
        fields += " FINT_FEC_BOLSA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecBolsa());
        fields += " FINT_FEC_CRUCE = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecCruce());
        fields += " FINT_FEC_LIQUIDACION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecLiquidacion());
        fields += " FINT_TIPO_SUBASTA = ?, ";
        values.add(this.getFintTipoSubasta());
        fields += " FINT_ACTO_CONSTITUTIVO = ?, ";
        values.add(this.getFintActoConstitutivo());
        fields += " FINT_COMITE_TECNICO = ?, ";
        values.add(this.getFintComiteTecnico());
        fields += " FINT_REPO_DIST = ?, ";
        values.add(this.getFintRepoDist());
        fields += " FINT_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecAlta());
        fields += " FINT_FEC_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFecMod());
        fields += " FINT_INICIO_PERIODO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintInicioPeriodo());
        fields += " FINT_FIN_DE_PERIODO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFinDePeriodo());
        fields += " FINT_PERIODICIDAD_DIAS = ?, ";
        values.add(this.getFintPeriodicidadDias());
        fields += " FINT_FECHA_DE_PAGO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFechaDePago());
        fields += " FINT_IMP_VAL_NOM_TOT = ?, ";
        values.add(this.getFintImpValNomTot());
        fields += " FINT_VALNOM_TITULOS = ?, ";
        values.add(this.getFintValnomTitulos());
        fields += " FINT_PORC_TASA_FIJA = ?, ";
        values.add(this.getFintPorcTasaFija());
        fields += " FINT_TASA_PROMEDIO = ?, ";
        values.add(this.getFintTasaPromedio());
        fields += " FINT_TASA = ?, ";
        values.add(this.getFintTasa());
        fields += " FINT_TASA_BASE = ?, ";
        values.add(this.getFintTasaBase());
        fields += " FINT_SOBRETASA = ?, ";
        values.add(this.getFintSobretasa());
        fields += " FINT_TASA_BRUTA = ?, ";
        values.add(this.getFintTasaBruta());
        fields += " FINT_ISR = ?, ";
        values.add(this.getFintIsr());
        fields += " FINT_TASA_NETA = ?, ";
        values.add(this.getFintTasaNeta());
        fields += " FINT_DOLAR_INICIO = ?, ";
        values.add(this.getFintDolarInicio());
        fields += " FINT_DOLAR_FIN = ?, ";
        values.add(this.getFintDolarFin());
        fields += " FINT_ISR2 = ?, ";
        values.add(this.getFintIsr2());
        fields += " FINT_TASA_ABSOLUTA = ?, ";
        values.add(this.getFintTasaAbsoluta());
        fields += " FINT_TASA_EQUIBALENTE = ?, ";
        values.add(this.getFintTasaEquibalente());
        fields += " FINT_FECHA_CALCULO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFintFechaCalculo());
        fields += " FINT_INTERESES_PER = ?, ";
        values.add(this.getFintInteresesPer());
        fields += " FINT_INTERESES_CAP = ?, ";
        values.add(this.getFintInteresesCap());
        fields += " FINT_IMP_AMORTIZACION = ?, ";
        values.add(this.getFintImpAmortizacion());
        fields += " FINT_AMOR_EXT = ?, ";
        values.add(this.getFintAmorExt());
        fields += " FINT_ST_EMISION = ?, ";
        values.add(this.getFintStEmision());
        fields += " FINT_ELABORO = ?, ";
        values.add(this.getFintElaboro());
        fields += " FINT_FIRMA_VOBO = ?, ";
        values.add(this.getFintFirmaVobo());
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
        String sql = "INSERT INTO F_INTERES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FINT_ID_CALC_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFintIdCalcSecuencial());

        fields += ", FINT_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getFintIdPrograma());

        fields += ", FINT_NOM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getFintNomPrograma());

        fields += ", FINT_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getFintIdEmision());

        fields += ", FINT_ID_TIPO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getFintIdTipoCalculo());

        fields += ", FINT_ID_FEC_CALC_PER";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintIdFecCalcPer());

        fields += ", FINT_ID_FORMULA";
        fieldValues += ", ?";
        values.add(this.getFintIdFormula());

        fields += ", FINT_NOM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getFintNomFormula());

        fields += ", FINT_NOM_EMISOR";
        fieldValues += ", ?";
        values.add(this.getFintNomEmisor());

        fields += ", FINT_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFintNomContrato());

        fields += ", FINT_ST_EMIPCAL";
        fieldValues += ", ?";
        values.add(this.getFintStEmipcal());

        fields += ", FINT_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFintIdFideicomiso());

        fields += ", FINT_CVE_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getFintCvePizarra());

        fields += ", FINT_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getFintNumSerie());

        fields += ", FINT_IMP_EMISION";
        fieldValues += ", ?";
        values.add(this.getFintImpEmision());

        fields += ", FINT_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getFintNumTitulos());

        fields += ", FINT_IMP_NOM_EMISION";
        fieldValues += ", ?";
        values.add(this.getFintImpNomEmision());

        fields += ", FINT_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFintNumMoneda());

        fields += ", FINT_DESTINO_RECURSO";
        fieldValues += ", ?";
        values.add(this.getFintDestinoRecurso());

        fields += ", FINT_ANO_PLAZO";
        fieldValues += ", ?";
        values.add(this.getFintAnoPlazo());

        fields += ", FINT_DIAS_PLAZO";
        fieldValues += ", ?";
        values.add(this.getFintDiasPlazo());

        fields += ", FINT_FEC_INICIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecInicio());

        fields += ", FINT_FEC_VENCIMIENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecVencimiento());

        fields += ", FINT_REP_COMUN";
        fieldValues += ", ?";
        values.add(this.getFintRepComun());

        fields += ", FINT_INT_COLOCADOR";
        fieldValues += ", ?";
        values.add(this.getFintIntColocador());

        fields += ", FINT_AUTORIZACION_CNBV";
        fieldValues += ", ?";
        values.add(this.getFintAutorizacionCnbv());

        fields += ", FINT_FEC_CNBV";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecCnbv());

        fields += ", FINT_AUTORIZACION_BANXICO";
        fieldValues += ", ?";
        values.add(this.getFintAutorizacionBanxico());

        fields += ", FINT_FEC_BANXICO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecBanxico());

        fields += ", FINT_FEC_SERIE";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecSerie());

        fields += ", FINT_FEC_SUBASTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecSubasta());

        fields += ", FINT_FEC_OFRECIMIENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecOfrecimiento());

        fields += ", FINT_FEC_EMISION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecEmision());

        fields += ", FINT_FEC_BOLSA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecBolsa());

        fields += ", FINT_FEC_CRUCE";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecCruce());

        fields += ", FINT_FEC_LIQUIDACION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecLiquidacion());

        fields += ", FINT_TIPO_SUBASTA";
        fieldValues += ", ?";
        values.add(this.getFintTipoSubasta());

        fields += ", FINT_ACTO_CONSTITUTIVO";
        fieldValues += ", ?";
        values.add(this.getFintActoConstitutivo());

        fields += ", FINT_COMITE_TECNICO";
        fieldValues += ", ?";
        values.add(this.getFintComiteTecnico());

        fields += ", FINT_REPO_DIST";
        fieldValues += ", ?";
        values.add(this.getFintRepoDist());

        fields += ", FINT_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecAlta());

        fields += ", FINT_FEC_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFecMod());

        fields += ", FINT_INICIO_PERIODO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintInicioPeriodo());

        fields += ", FINT_FIN_DE_PERIODO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFinDePeriodo());

        fields += ", FINT_PERIODICIDAD_DIAS";
        fieldValues += ", ?";
        values.add(this.getFintPeriodicidadDias());

        fields += ", FINT_FECHA_DE_PAGO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFechaDePago());

        fields += ", FINT_IMP_VAL_NOM_TOT";
        fieldValues += ", ?";
        values.add(this.getFintImpValNomTot());

        fields += ", FINT_VALNOM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getFintValnomTitulos());

        fields += ", FINT_PORC_TASA_FIJA";
        fieldValues += ", ?";
        values.add(this.getFintPorcTasaFija());

        fields += ", FINT_TASA_PROMEDIO";
        fieldValues += ", ?";
        values.add(this.getFintTasaPromedio());

        fields += ", FINT_TASA";
        fieldValues += ", ?";
        values.add(this.getFintTasa());

        fields += ", FINT_TASA_BASE";
        fieldValues += ", ?";
        values.add(this.getFintTasaBase());

        fields += ", FINT_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getFintSobretasa());

        fields += ", FINT_TASA_BRUTA";
        fieldValues += ", ?";
        values.add(this.getFintTasaBruta());

        fields += ", FINT_ISR";
        fieldValues += ", ?";
        values.add(this.getFintIsr());

        fields += ", FINT_TASA_NETA";
        fieldValues += ", ?";
        values.add(this.getFintTasaNeta());

        fields += ", FINT_DOLAR_INICIO";
        fieldValues += ", ?";
        values.add(this.getFintDolarInicio());

        fields += ", FINT_DOLAR_FIN";
        fieldValues += ", ?";
        values.add(this.getFintDolarFin());

        fields += ", FINT_ISR2";
        fieldValues += ", ?";
        values.add(this.getFintIsr2());

        fields += ", FINT_TASA_ABSOLUTA";
        fieldValues += ", ?";
        values.add(this.getFintTasaAbsoluta());

        fields += ", FINT_TASA_EQUIBALENTE";
        fieldValues += ", ?";
        values.add(this.getFintTasaEquibalente());

        fields += ", FINT_FECHA_CALCULO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFintFechaCalculo());

        fields += ", FINT_INTERESES_PER";
        fieldValues += ", ?";
        values.add(this.getFintInteresesPer());

        fields += ", FINT_INTERESES_CAP";
        fieldValues += ", ?";
        values.add(this.getFintInteresesCap());

        fields += ", FINT_IMP_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getFintImpAmortizacion());

        fields += ", FINT_AMOR_EXT";
        fieldValues += ", ?";
        values.add(this.getFintAmorExt());

        fields += ", FINT_ST_EMISION";
        fieldValues += ", ?";
        values.add(this.getFintStEmision());

        fields += ", FINT_ELABORO";
        fieldValues += ", ?";
        values.add(this.getFintElaboro());

        fields += ", FINT_FIRMA_VOBO";
        fieldValues += ", ?";
        values.add(this.getFintFirmaVobo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_INTERES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FINT_ID_CALC_SECUENCIAL = ?";
        values.add(this.getFintIdCalcSecuencial());
        conditions += " AND FINT_ID_PROGRAMA = ?";
        values.add(this.getFintIdPrograma());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FInteres instance = (FInteres) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFintIdCalcSecuencial().equals(instance.getFintIdCalcSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFintIdPrograma().equals(instance.getFintIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getFintNomPrograma().equals(instance.getFintNomPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getFintIdEmision().equals(instance.getFintIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getFintIdTipoCalculo().equals(instance.getFintIdTipoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getFintIdFecCalcPer().equals(instance.getFintIdFecCalcPer()))
            equalObjects = false;
        if (equalObjects && !this.getFintIdFormula().equals(instance.getFintIdFormula()))
            equalObjects = false;
        if (equalObjects && !this.getFintNomFormula().equals(instance.getFintNomFormula()))
            equalObjects = false;
        if (equalObjects && !this.getFintNomEmisor().equals(instance.getFintNomEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getFintNomContrato().equals(instance.getFintNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFintStEmipcal().equals(instance.getFintStEmipcal()))
            equalObjects = false;
        if (equalObjects && !this.getFintIdFideicomiso().equals(instance.getFintIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFintCvePizarra().equals(instance.getFintCvePizarra()))
            equalObjects = false;
        if (equalObjects && !this.getFintNumSerie().equals(instance.getFintNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getFintImpEmision().equals(instance.getFintImpEmision()))
            equalObjects = false;
        if (equalObjects && !this.getFintNumTitulos().equals(instance.getFintNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getFintImpNomEmision().equals(instance.getFintImpNomEmision()))
            equalObjects = false;
        if (equalObjects && !this.getFintNumMoneda().equals(instance.getFintNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFintDestinoRecurso().equals(instance.getFintDestinoRecurso()))
            equalObjects = false;
        if (equalObjects && !this.getFintAnoPlazo().equals(instance.getFintAnoPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getFintDiasPlazo().equals(instance.getFintDiasPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecInicio().equals(instance.getFintFecInicio()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecVencimiento().equals(instance.getFintFecVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getFintRepComun().equals(instance.getFintRepComun()))
            equalObjects = false;
        if (equalObjects && !this.getFintIntColocador().equals(instance.getFintIntColocador()))
            equalObjects = false;
        if (equalObjects && !this.getFintAutorizacionCnbv().equals(instance.getFintAutorizacionCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecCnbv().equals(instance.getFintFecCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getFintAutorizacionBanxico().equals(instance.getFintAutorizacionBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecBanxico().equals(instance.getFintFecBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecSerie().equals(instance.getFintFecSerie()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecSubasta().equals(instance.getFintFecSubasta()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecOfrecimiento().equals(instance.getFintFecOfrecimiento()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecEmision().equals(instance.getFintFecEmision()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecBolsa().equals(instance.getFintFecBolsa()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecCruce().equals(instance.getFintFecCruce()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecLiquidacion().equals(instance.getFintFecLiquidacion()))
            equalObjects = false;
        if (equalObjects && !this.getFintTipoSubasta().equals(instance.getFintTipoSubasta()))
            equalObjects = false;
        if (equalObjects && !this.getFintActoConstitutivo().equals(instance.getFintActoConstitutivo()))
            equalObjects = false;
        if (equalObjects && !this.getFintComiteTecnico().equals(instance.getFintComiteTecnico()))
            equalObjects = false;
        if (equalObjects && !this.getFintRepoDist().equals(instance.getFintRepoDist()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecAlta().equals(instance.getFintFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getFintFecMod().equals(instance.getFintFecMod()))
            equalObjects = false;
        if (equalObjects && !this.getFintInicioPeriodo().equals(instance.getFintInicioPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getFintFinDePeriodo().equals(instance.getFintFinDePeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getFintPeriodicidadDias().equals(instance.getFintPeriodicidadDias()))
            equalObjects = false;
        if (equalObjects && !this.getFintFechaDePago().equals(instance.getFintFechaDePago()))
            equalObjects = false;
        if (equalObjects && !this.getFintImpValNomTot().equals(instance.getFintImpValNomTot()))
            equalObjects = false;
        if (equalObjects && !this.getFintValnomTitulos().equals(instance.getFintValnomTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getFintPorcTasaFija().equals(instance.getFintPorcTasaFija()))
            equalObjects = false;
        if (equalObjects && !this.getFintTasaPromedio().equals(instance.getFintTasaPromedio()))
            equalObjects = false;
        if (equalObjects && !this.getFintTasa().equals(instance.getFintTasa()))
            equalObjects = false;
        if (equalObjects && !this.getFintTasaBase().equals(instance.getFintTasaBase()))
            equalObjects = false;
        if (equalObjects && !this.getFintSobretasa().equals(instance.getFintSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getFintTasaBruta().equals(instance.getFintTasaBruta()))
            equalObjects = false;
        if (equalObjects && !this.getFintIsr().equals(instance.getFintIsr()))
            equalObjects = false;
        if (equalObjects && !this.getFintTasaNeta().equals(instance.getFintTasaNeta()))
            equalObjects = false;
        if (equalObjects && !this.getFintDolarInicio().equals(instance.getFintDolarInicio()))
            equalObjects = false;
        if (equalObjects && !this.getFintDolarFin().equals(instance.getFintDolarFin()))
            equalObjects = false;
        if (equalObjects && !this.getFintIsr2().equals(instance.getFintIsr2()))
            equalObjects = false;
        if (equalObjects && !this.getFintTasaAbsoluta().equals(instance.getFintTasaAbsoluta()))
            equalObjects = false;
        if (equalObjects && !this.getFintTasaEquibalente().equals(instance.getFintTasaEquibalente()))
            equalObjects = false;
        if (equalObjects && !this.getFintFechaCalculo().equals(instance.getFintFechaCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getFintInteresesPer().equals(instance.getFintInteresesPer()))
            equalObjects = false;
        if (equalObjects && !this.getFintInteresesCap().equals(instance.getFintInteresesCap()))
            equalObjects = false;
        if (equalObjects && !this.getFintImpAmortizacion().equals(instance.getFintImpAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getFintAmorExt().equals(instance.getFintAmorExt()))
            equalObjects = false;
        if (equalObjects && !this.getFintStEmision().equals(instance.getFintStEmision()))
            equalObjects = false;
        if (equalObjects && !this.getFintElaboro().equals(instance.getFintElaboro()))
            equalObjects = false;
        if (equalObjects && !this.getFintFirmaVobo().equals(instance.getFintFirmaVobo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FInteres result = new FInteres();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFintIdCalcSecuencial((BigDecimal) objectData.getData("FINT_ID_CALC_SECUENCIAL"));
        result.setFintIdPrograma((BigDecimal) objectData.getData("FINT_ID_PROGRAMA"));
        result.setFintNomPrograma((String) objectData.getData("FINT_NOM_PROGRAMA"));
        result.setFintIdEmision((BigDecimal) objectData.getData("FINT_ID_EMISION"));
        result.setFintIdTipoCalculo((String) objectData.getData("FINT_ID_TIPO_CALCULO"));
        result.setFintIdFecCalcPer((String) objectData.getData("FINT_ID_FEC_CALC_PER"));
        result.setFintIdFormula((BigDecimal) objectData.getData("FINT_ID_FORMULA"));
        result.setFintNomFormula((String) objectData.getData("FINT_NOM_FORMULA"));
        result.setFintNomEmisor((String) objectData.getData("FINT_NOM_EMISOR"));
        result.setFintNomContrato((String) objectData.getData("FINT_NOM_CONTRATO"));
        result.setFintStEmipcal((String) objectData.getData("FINT_ST_EMIPCAL"));
        result.setFintIdFideicomiso((BigDecimal) objectData.getData("FINT_ID_FIDEICOMISO"));
        result.setFintCvePizarra((String) objectData.getData("FINT_CVE_PIZARRA"));
        result.setFintNumSerie((String) objectData.getData("FINT_NUM_SERIE"));
        result.setFintImpEmision((BigDecimal) objectData.getData("FINT_IMP_EMISION"));
        result.setFintNumTitulos((BigDecimal) objectData.getData("FINT_NUM_TITULOS"));
        result.setFintImpNomEmision((String) objectData.getData("FINT_IMP_NOM_EMISION"));
        result.setFintNumMoneda((BigDecimal) objectData.getData("FINT_NUM_MONEDA"));
        result.setFintDestinoRecurso((String) objectData.getData("FINT_DESTINO_RECURSO"));
        result.setFintAnoPlazo((BigDecimal) objectData.getData("FINT_ANO_PLAZO"));
        result.setFintDiasPlazo((BigDecimal) objectData.getData("FINT_DIAS_PLAZO"));
        result.setFintFecInicio((String) objectData.getData("FINT_FEC_INICIO"));
        result.setFintFecVencimiento((String) objectData.getData("FINT_FEC_VENCIMIENTO"));
        result.setFintRepComun((String) objectData.getData("FINT_REP_COMUN"));
        result.setFintIntColocador((String) objectData.getData("FINT_INT_COLOCADOR"));
        result.setFintAutorizacionCnbv((String) objectData.getData("FINT_AUTORIZACION_CNBV"));
        result.setFintFecCnbv((String) objectData.getData("FINT_FEC_CNBV"));
        result.setFintAutorizacionBanxico((String) objectData.getData("FINT_AUTORIZACION_BANXICO"));
        result.setFintFecBanxico((String) objectData.getData("FINT_FEC_BANXICO"));
        result.setFintFecSerie((String) objectData.getData("FINT_FEC_SERIE"));
        result.setFintFecSubasta((String) objectData.getData("FINT_FEC_SUBASTA"));
        result.setFintFecOfrecimiento((String) objectData.getData("FINT_FEC_OFRECIMIENTO"));
        result.setFintFecEmision((String) objectData.getData("FINT_FEC_EMISION"));
        result.setFintFecBolsa((String) objectData.getData("FINT_FEC_BOLSA"));
        result.setFintFecCruce((String) objectData.getData("FINT_FEC_CRUCE"));
        result.setFintFecLiquidacion((String) objectData.getData("FINT_FEC_LIQUIDACION"));
        result.setFintTipoSubasta((String) objectData.getData("FINT_TIPO_SUBASTA"));
        result.setFintActoConstitutivo((String) objectData.getData("FINT_ACTO_CONSTITUTIVO"));
        result.setFintComiteTecnico((String) objectData.getData("FINT_COMITE_TECNICO"));
        result.setFintRepoDist((BigDecimal) objectData.getData("FINT_REPO_DIST"));
        result.setFintFecAlta((String) objectData.getData("FINT_FEC_ALTA"));
        result.setFintFecMod((String) objectData.getData("FINT_FEC_MOD"));
        result.setFintInicioPeriodo((String) objectData.getData("FINT_INICIO_PERIODO"));
        result.setFintFinDePeriodo((String) objectData.getData("FINT_FIN_DE_PERIODO"));
        result.setFintPeriodicidadDias((BigDecimal) objectData.getData("FINT_PERIODICIDAD_DIAS"));
        result.setFintFechaDePago((String) objectData.getData("FINT_FECHA_DE_PAGO"));
        result.setFintImpValNomTot((BigDecimal) objectData.getData("FINT_IMP_VAL_NOM_TOT"));
        result.setFintValnomTitulos((BigDecimal) objectData.getData("FINT_VALNOM_TITULOS"));
        result.setFintPorcTasaFija((BigDecimal) objectData.getData("FINT_PORC_TASA_FIJA"));
        result.setFintTasaPromedio((BigDecimal) objectData.getData("FINT_TASA_PROMEDIO"));
        result.setFintTasa((BigDecimal) objectData.getData("FINT_TASA"));
        result.setFintTasaBase((BigDecimal) objectData.getData("FINT_TASA_BASE"));
        result.setFintSobretasa((BigDecimal) objectData.getData("FINT_SOBRETASA"));
        result.setFintTasaBruta((BigDecimal) objectData.getData("FINT_TASA_BRUTA"));
        result.setFintIsr((BigDecimal) objectData.getData("FINT_ISR"));
        result.setFintTasaNeta((BigDecimal) objectData.getData("FINT_TASA_NETA"));
        result.setFintDolarInicio((BigDecimal) objectData.getData("FINT_DOLAR_INICIO"));
        result.setFintDolarFin((BigDecimal) objectData.getData("FINT_DOLAR_FIN"));
        result.setFintIsr2((BigDecimal) objectData.getData("FINT_ISR2"));
        result.setFintTasaAbsoluta((BigDecimal) objectData.getData("FINT_TASA_ABSOLUTA"));
        result.setFintTasaEquibalente((BigDecimal) objectData.getData("FINT_TASA_EQUIBALENTE"));
        result.setFintFechaCalculo((String) objectData.getData("FINT_FECHA_CALCULO"));
        result.setFintInteresesPer((BigDecimal) objectData.getData("FINT_INTERESES_PER"));
        result.setFintInteresesCap((BigDecimal) objectData.getData("FINT_INTERESES_CAP"));
        result.setFintImpAmortizacion((BigDecimal) objectData.getData("FINT_IMP_AMORTIZACION"));
        result.setFintAmorExt((BigDecimal) objectData.getData("FINT_AMOR_EXT"));
        result.setFintStEmision((String) objectData.getData("FINT_ST_EMISION"));
        result.setFintElaboro((String) objectData.getData("FINT_ELABORO"));
        result.setFintFirmaVobo((String) objectData.getData("FINT_FIRMA_VOBO"));

        return result;

    }

}
