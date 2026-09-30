package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_IMPAVISO_PK", columns = { "EAVI_ID_PROGRAMA", "EAVI_ID_FIDEICOMISO", "EAVI_ID_EMISION", "EAVI_ID_SEC_CALC", "EAVI_ID_REPORTE" },
            sequences = { "MANUAL" })
public class FImpaviso extends DomainObject {

    BigDecimal eaviIdPrograma = null;
    BigDecimal eaviIdFideicomiso = null;
    BigDecimal eaviIdEmision = null;
    BigDecimal eaviIdSecCalc = null;
    String eaviIdReporte = null;
    String eaviCvePizarra = null;
    String eaviNumSerie = null;
    String eaviNomEmisor = null;
    String eaviFecInicio = null;
    String eaviFecCnbv = null;
    String eaviFecVencimiento = null;
    String eaviNomAutoridad1 = null;
    String eaviDirAutoridad1 = null;
    String eaviNomResponsable1 = null;
    String eaviNomPuestRespo1 = null;
    String eaviNomAutoridad2 = null;
    String eaviDirAutoridad2 = null;
    String eaviNomResponsable2 = null;
    String eaviNomPuestRespo2 = null;
    String eaviNomAutoridad3 = null;
    String eaviDirAutoridad3 = null;
    String eaviNomResponsable3 = null;
    String eaviNomPuestRespo3 = null;
    String eaviTipoCalculo = null;
    String eaviFecIniPeriodo = null;
    String eaviFecFinPeriodo = null;
    String eaviFecAviso = null;
    String eaviFecAviso1 = null;
    String eaviFecPagoSig = null;
    String eaviFecIniProx = null;
    String eaviFecFinProx = null;
    BigDecimal eaviImpProx = null;
    BigDecimal eaviPlazoProx = null;
    BigDecimal eaviTasaActual = null;
    BigDecimal eaviNumAmort = null;
    BigDecimal eaviImpAmort = null;
    String eaviFecRealPeriodo = null;
    String eaviInstrumento = null;
    BigDecimal eaviTasaAplicada = null;
    BigDecimal eaviTasaSobretasa = null;
    BigDecimal eaviTasaBruta = null;
    BigDecimal eaviTasaNeta = null;
    BigDecimal eaviPeriodicidadDias = null;
    BigDecimal eaviImpValNominal = null;
    BigDecimal eaviImpValNomTot = null;
    BigDecimal eaviImpAmortizacion = null;
    BigDecimal eaviImpIntereses = null;
    BigDecimal eaviImpNumTitulos = null;
    String eaviFecPago = null;
    BigDecimal eaviValNomTitulos = null;
    BigDecimal eaviTasaTiie = null;
    BigDecimal eaviAmortConv = null;
    BigDecimal eaviInteresesConv = null;
    BigDecimal eaviVnaConv = null;
    BigDecimal eaviInteresesCap = null;
    BigDecimal eaviInteresesPer = null;
    BigDecimal eaviAmortExt = null;
    BigDecimal eaviVnxt = null;
    BigDecimal eaviImpTipoCambInicio = null;
    BigDecimal eaviImpTipoCambFin = null;
    BigDecimal eaviImpTipoUdi = null;
    BigDecimal eaviImpAdicInflacion = null;
    String eaviElaboro = null;
    String eaviFirma = null;
    String eaviNombre1Ccp = null;
    String eaviPuesto1Ccp = null;
    String eaviNombre2Ccp = null;
    String eaviPuesto2Ccp = null;
    String eaviNombre3Ccp = null;
    String eaviPuesto3Ccp = null;

    public FImpaviso() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEaviIdPrograma(BigDecimal eaviIdPrograma) {
        this.eaviIdPrograma = eaviIdPrograma;
    }

    public BigDecimal getEaviIdPrograma() {
        return this.eaviIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEaviIdFideicomiso(BigDecimal eaviIdFideicomiso) {
        this.eaviIdFideicomiso = eaviIdFideicomiso;
    }

    public BigDecimal getEaviIdFideicomiso() {
        return this.eaviIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEaviIdEmision(BigDecimal eaviIdEmision) {
        this.eaviIdEmision = eaviIdEmision;
    }

    public BigDecimal getEaviIdEmision() {
        return this.eaviIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEaviIdSecCalc(BigDecimal eaviIdSecCalc) {
        this.eaviIdSecCalc = eaviIdSecCalc;
    }

    public BigDecimal getEaviIdSecCalc() {
        return this.eaviIdSecCalc;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviIdReporte(String eaviIdReporte) {
        this.eaviIdReporte = eaviIdReporte;
    }

    public String getEaviIdReporte() {
        return this.eaviIdReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviCvePizarra(String eaviCvePizarra) {
        this.eaviCvePizarra = eaviCvePizarra;
    }

    public String getEaviCvePizarra() {
        return this.eaviCvePizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNumSerie(String eaviNumSerie) {
        this.eaviNumSerie = eaviNumSerie;
    }

    public String getEaviNumSerie() {
        return this.eaviNumSerie;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNomEmisor(String eaviNomEmisor) {
        this.eaviNomEmisor = eaviNomEmisor;
    }

    public String getEaviNomEmisor() {
        return this.eaviNomEmisor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecInicio(String eaviFecInicio) {
        this.eaviFecInicio = eaviFecInicio;
    }

    public String getEaviFecInicio() {
        return this.eaviFecInicio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecCnbv(String eaviFecCnbv) {
        this.eaviFecCnbv = eaviFecCnbv;
    }

    public String getEaviFecCnbv() {
        return this.eaviFecCnbv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecVencimiento(String eaviFecVencimiento) {
        this.eaviFecVencimiento = eaviFecVencimiento;
    }

    public String getEaviFecVencimiento() {
        return this.eaviFecVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNomAutoridad1(String eaviNomAutoridad1) {
        this.eaviNomAutoridad1 = eaviNomAutoridad1;
    }

    public String getEaviNomAutoridad1() {
        return this.eaviNomAutoridad1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviDirAutoridad1(String eaviDirAutoridad1) {
        this.eaviDirAutoridad1 = eaviDirAutoridad1;
    }

    public String getEaviDirAutoridad1() {
        return this.eaviDirAutoridad1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNomResponsable1(String eaviNomResponsable1) {
        this.eaviNomResponsable1 = eaviNomResponsable1;
    }

    public String getEaviNomResponsable1() {
        return this.eaviNomResponsable1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNomPuestRespo1(String eaviNomPuestRespo1) {
        this.eaviNomPuestRespo1 = eaviNomPuestRespo1;
    }

    public String getEaviNomPuestRespo1() {
        return this.eaviNomPuestRespo1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNomAutoridad2(String eaviNomAutoridad2) {
        this.eaviNomAutoridad2 = eaviNomAutoridad2;
    }

    public String getEaviNomAutoridad2() {
        return this.eaviNomAutoridad2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviDirAutoridad2(String eaviDirAutoridad2) {
        this.eaviDirAutoridad2 = eaviDirAutoridad2;
    }

    public String getEaviDirAutoridad2() {
        return this.eaviDirAutoridad2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNomResponsable2(String eaviNomResponsable2) {
        this.eaviNomResponsable2 = eaviNomResponsable2;
    }

    public String getEaviNomResponsable2() {
        return this.eaviNomResponsable2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNomPuestRespo2(String eaviNomPuestRespo2) {
        this.eaviNomPuestRespo2 = eaviNomPuestRespo2;
    }

    public String getEaviNomPuestRespo2() {
        return this.eaviNomPuestRespo2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNomAutoridad3(String eaviNomAutoridad3) {
        this.eaviNomAutoridad3 = eaviNomAutoridad3;
    }

    public String getEaviNomAutoridad3() {
        return this.eaviNomAutoridad3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviDirAutoridad3(String eaviDirAutoridad3) {
        this.eaviDirAutoridad3 = eaviDirAutoridad3;
    }

    public String getEaviDirAutoridad3() {
        return this.eaviDirAutoridad3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNomResponsable3(String eaviNomResponsable3) {
        this.eaviNomResponsable3 = eaviNomResponsable3;
    }

    public String getEaviNomResponsable3() {
        return this.eaviNomResponsable3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNomPuestRespo3(String eaviNomPuestRespo3) {
        this.eaviNomPuestRespo3 = eaviNomPuestRespo3;
    }

    public String getEaviNomPuestRespo3() {
        return this.eaviNomPuestRespo3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviTipoCalculo(String eaviTipoCalculo) {
        this.eaviTipoCalculo = eaviTipoCalculo;
    }

    public String getEaviTipoCalculo() {
        return this.eaviTipoCalculo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecIniPeriodo(String eaviFecIniPeriodo) {
        this.eaviFecIniPeriodo = eaviFecIniPeriodo;
    }

    public String getEaviFecIniPeriodo() {
        return this.eaviFecIniPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecFinPeriodo(String eaviFecFinPeriodo) {
        this.eaviFecFinPeriodo = eaviFecFinPeriodo;
    }

    public String getEaviFecFinPeriodo() {
        return this.eaviFecFinPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecAviso(String eaviFecAviso) {
        this.eaviFecAviso = eaviFecAviso;
    }

    public String getEaviFecAviso() {
        return this.eaviFecAviso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecAviso1(String eaviFecAviso1) {
        this.eaviFecAviso1 = eaviFecAviso1;
    }

    public String getEaviFecAviso1() {
        return this.eaviFecAviso1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecPagoSig(String eaviFecPagoSig) {
        this.eaviFecPagoSig = eaviFecPagoSig;
    }

    public String getEaviFecPagoSig() {
        return this.eaviFecPagoSig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecIniProx(String eaviFecIniProx) {
        this.eaviFecIniProx = eaviFecIniProx;
    }

    public String getEaviFecIniProx() {
        return this.eaviFecIniProx;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecFinProx(String eaviFecFinProx) {
        this.eaviFecFinProx = eaviFecFinProx;
    }

    public String getEaviFecFinProx() {
        return this.eaviFecFinProx;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpProx(BigDecimal eaviImpProx) {
        this.eaviImpProx = eaviImpProx;
    }

    public BigDecimal getEaviImpProx() {
        return this.eaviImpProx;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEaviPlazoProx(BigDecimal eaviPlazoProx) {
        this.eaviPlazoProx = eaviPlazoProx;
    }

    public BigDecimal getEaviPlazoProx() {
        return this.eaviPlazoProx;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEaviTasaActual(BigDecimal eaviTasaActual) {
        this.eaviTasaActual = eaviTasaActual;
    }

    public BigDecimal getEaviTasaActual() {
        return this.eaviTasaActual;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEaviNumAmort(BigDecimal eaviNumAmort) {
        this.eaviNumAmort = eaviNumAmort;
    }

    public BigDecimal getEaviNumAmort() {
        return this.eaviNumAmort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpAmort(BigDecimal eaviImpAmort) {
        this.eaviImpAmort = eaviImpAmort;
    }

    public BigDecimal getEaviImpAmort() {
        return this.eaviImpAmort;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecRealPeriodo(String eaviFecRealPeriodo) {
        this.eaviFecRealPeriodo = eaviFecRealPeriodo;
    }

    public String getEaviFecRealPeriodo() {
        return this.eaviFecRealPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviInstrumento(String eaviInstrumento) {
        this.eaviInstrumento = eaviInstrumento;
    }

    public String getEaviInstrumento() {
        return this.eaviInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEaviTasaAplicada(BigDecimal eaviTasaAplicada) {
        this.eaviTasaAplicada = eaviTasaAplicada;
    }

    public BigDecimal getEaviTasaAplicada() {
        return this.eaviTasaAplicada;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEaviTasaSobretasa(BigDecimal eaviTasaSobretasa) {
        this.eaviTasaSobretasa = eaviTasaSobretasa;
    }

    public BigDecimal getEaviTasaSobretasa() {
        return this.eaviTasaSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEaviTasaBruta(BigDecimal eaviTasaBruta) {
        this.eaviTasaBruta = eaviTasaBruta;
    }

    public BigDecimal getEaviTasaBruta() {
        return this.eaviTasaBruta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEaviTasaNeta(BigDecimal eaviTasaNeta) {
        this.eaviTasaNeta = eaviTasaNeta;
    }

    public BigDecimal getEaviTasaNeta() {
        return this.eaviTasaNeta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setEaviPeriodicidadDias(BigDecimal eaviPeriodicidadDias) {
        this.eaviPeriodicidadDias = eaviPeriodicidadDias;
    }

    public BigDecimal getEaviPeriodicidadDias() {
        return this.eaviPeriodicidadDias;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpValNominal(BigDecimal eaviImpValNominal) {
        this.eaviImpValNominal = eaviImpValNominal;
    }

    public BigDecimal getEaviImpValNominal() {
        return this.eaviImpValNominal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpValNomTot(BigDecimal eaviImpValNomTot) {
        this.eaviImpValNomTot = eaviImpValNomTot;
    }

    public BigDecimal getEaviImpValNomTot() {
        return this.eaviImpValNomTot;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpAmortizacion(BigDecimal eaviImpAmortizacion) {
        this.eaviImpAmortizacion = eaviImpAmortizacion;
    }

    public BigDecimal getEaviImpAmortizacion() {
        return this.eaviImpAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpIntereses(BigDecimal eaviImpIntereses) {
        this.eaviImpIntereses = eaviImpIntereses;
    }

    public BigDecimal getEaviImpIntereses() {
        return this.eaviImpIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpNumTitulos(BigDecimal eaviImpNumTitulos) {
        this.eaviImpNumTitulos = eaviImpNumTitulos;
    }

    public BigDecimal getEaviImpNumTitulos() {
        return this.eaviImpNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFecPago(String eaviFecPago) {
        this.eaviFecPago = eaviFecPago;
    }

    public String getEaviFecPago() {
        return this.eaviFecPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEaviValNomTitulos(BigDecimal eaviValNomTitulos) {
        this.eaviValNomTitulos = eaviValNomTitulos;
    }

    public BigDecimal getEaviValNomTitulos() {
        return this.eaviValNomTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEaviTasaTiie(BigDecimal eaviTasaTiie) {
        this.eaviTasaTiie = eaviTasaTiie;
    }

    public BigDecimal getEaviTasaTiie() {
        return this.eaviTasaTiie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviAmortConv(BigDecimal eaviAmortConv) {
        this.eaviAmortConv = eaviAmortConv;
    }

    public BigDecimal getEaviAmortConv() {
        return this.eaviAmortConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviInteresesConv(BigDecimal eaviInteresesConv) {
        this.eaviInteresesConv = eaviInteresesConv;
    }

    public BigDecimal getEaviInteresesConv() {
        return this.eaviInteresesConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviVnaConv(BigDecimal eaviVnaConv) {
        this.eaviVnaConv = eaviVnaConv;
    }

    public BigDecimal getEaviVnaConv() {
        return this.eaviVnaConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviInteresesCap(BigDecimal eaviInteresesCap) {
        this.eaviInteresesCap = eaviInteresesCap;
    }

    public BigDecimal getEaviInteresesCap() {
        return this.eaviInteresesCap;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviInteresesPer(BigDecimal eaviInteresesPer) {
        this.eaviInteresesPer = eaviInteresesPer;
    }

    public BigDecimal getEaviInteresesPer() {
        return this.eaviInteresesPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviAmortExt(BigDecimal eaviAmortExt) {
        this.eaviAmortExt = eaviAmortExt;
    }

    public BigDecimal getEaviAmortExt() {
        return this.eaviAmortExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviVnxt(BigDecimal eaviVnxt) {
        this.eaviVnxt = eaviVnxt;
    }

    public BigDecimal getEaviVnxt() {
        return this.eaviVnxt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpTipoCambInicio(BigDecimal eaviImpTipoCambInicio) {
        this.eaviImpTipoCambInicio = eaviImpTipoCambInicio;
    }

    public BigDecimal getEaviImpTipoCambInicio() {
        return this.eaviImpTipoCambInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpTipoCambFin(BigDecimal eaviImpTipoCambFin) {
        this.eaviImpTipoCambFin = eaviImpTipoCambFin;
    }

    public BigDecimal getEaviImpTipoCambFin() {
        return this.eaviImpTipoCambFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpTipoUdi(BigDecimal eaviImpTipoUdi) {
        this.eaviImpTipoUdi = eaviImpTipoUdi;
    }

    public BigDecimal getEaviImpTipoUdi() {
        return this.eaviImpTipoUdi;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEaviImpAdicInflacion(BigDecimal eaviImpAdicInflacion) {
        this.eaviImpAdicInflacion = eaviImpAdicInflacion;
    }

    public BigDecimal getEaviImpAdicInflacion() {
        return this.eaviImpAdicInflacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviElaboro(String eaviElaboro) {
        this.eaviElaboro = eaviElaboro;
    }

    public String getEaviElaboro() {
        return this.eaviElaboro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviFirma(String eaviFirma) {
        this.eaviFirma = eaviFirma;
    }

    public String getEaviFirma() {
        return this.eaviFirma;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNombre1Ccp(String eaviNombre1Ccp) {
        this.eaviNombre1Ccp = eaviNombre1Ccp;
    }

    public String getEaviNombre1Ccp() {
        return this.eaviNombre1Ccp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviPuesto1Ccp(String eaviPuesto1Ccp) {
        this.eaviPuesto1Ccp = eaviPuesto1Ccp;
    }

    public String getEaviPuesto1Ccp() {
        return this.eaviPuesto1Ccp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNombre2Ccp(String eaviNombre2Ccp) {
        this.eaviNombre2Ccp = eaviNombre2Ccp;
    }

    public String getEaviNombre2Ccp() {
        return this.eaviNombre2Ccp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviPuesto2Ccp(String eaviPuesto2Ccp) {
        this.eaviPuesto2Ccp = eaviPuesto2Ccp;
    }

    public String getEaviPuesto2Ccp() {
        return this.eaviPuesto2Ccp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviNombre3Ccp(String eaviNombre3Ccp) {
        this.eaviNombre3Ccp = eaviNombre3Ccp;
    }

    public String getEaviNombre3Ccp() {
        return this.eaviNombre3Ccp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaviPuesto3Ccp(String eaviPuesto3Ccp) {
        this.eaviPuesto3Ccp = eaviPuesto3Ccp;
    }

    public String getEaviPuesto3Ccp() {
        return this.eaviPuesto3Ccp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_IMPAVISO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEaviIdPrograma() != null && this.getEaviIdPrograma().longValue() == -999) {
            conditions += " AND EAVI_ID_PROGRAMA IS NULL";
        } else if (this.getEaviIdPrograma() != null) {
            conditions += " AND EAVI_ID_PROGRAMA = ?";
            values.add(this.getEaviIdPrograma());
        }

        if (this.getEaviIdFideicomiso() != null && this.getEaviIdFideicomiso().longValue() == -999) {
            conditions += " AND EAVI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEaviIdFideicomiso() != null) {
            conditions += " AND EAVI_ID_FIDEICOMISO = ?";
            values.add(this.getEaviIdFideicomiso());
        }

        if (this.getEaviIdEmision() != null && this.getEaviIdEmision().longValue() == -999) {
            conditions += " AND EAVI_ID_EMISION IS NULL";
        } else if (this.getEaviIdEmision() != null) {
            conditions += " AND EAVI_ID_EMISION = ?";
            values.add(this.getEaviIdEmision());
        }

        if (this.getEaviIdSecCalc() != null && this.getEaviIdSecCalc().longValue() == -999) {
            conditions += " AND EAVI_ID_SEC_CALC IS NULL";
        } else if (this.getEaviIdSecCalc() != null) {
            conditions += " AND EAVI_ID_SEC_CALC = ?";
            values.add(this.getEaviIdSecCalc());
        }

        if (this.getEaviIdReporte() != null && "null".equals(this.getEaviIdReporte())) {
            conditions += " AND EAVI_ID_REPORTE IS NULL";
        } else if (this.getEaviIdReporte() != null) {
            conditions += " AND EAVI_ID_REPORTE = ?";
            values.add(this.getEaviIdReporte());
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
        String sql = "SELECT * FROM F_IMPAVISO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEaviIdPrograma() != null && this.getEaviIdPrograma().longValue() == -999) {
            conditions += " AND EAVI_ID_PROGRAMA IS NULL";
        } else if (this.getEaviIdPrograma() != null) {
            conditions += " AND EAVI_ID_PROGRAMA = ?";
            values.add(this.getEaviIdPrograma());
        }

        if (this.getEaviIdFideicomiso() != null && this.getEaviIdFideicomiso().longValue() == -999) {
            conditions += " AND EAVI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEaviIdFideicomiso() != null) {
            conditions += " AND EAVI_ID_FIDEICOMISO = ?";
            values.add(this.getEaviIdFideicomiso());
        }

        if (this.getEaviIdEmision() != null && this.getEaviIdEmision().longValue() == -999) {
            conditions += " AND EAVI_ID_EMISION IS NULL";
        } else if (this.getEaviIdEmision() != null) {
            conditions += " AND EAVI_ID_EMISION = ?";
            values.add(this.getEaviIdEmision());
        }

        if (this.getEaviIdSecCalc() != null && this.getEaviIdSecCalc().longValue() == -999) {
            conditions += " AND EAVI_ID_SEC_CALC IS NULL";
        } else if (this.getEaviIdSecCalc() != null) {
            conditions += " AND EAVI_ID_SEC_CALC = ?";
            values.add(this.getEaviIdSecCalc());
        }

        if (this.getEaviIdReporte() != null && "null".equals(this.getEaviIdReporte())) {
            conditions += " AND EAVI_ID_REPORTE IS NULL";
        } else if (this.getEaviIdReporte() != null) {
            conditions += " AND EAVI_ID_REPORTE = ?";
            values.add(this.getEaviIdReporte());
        }

        if (this.getEaviCvePizarra() != null && "null".equals(this.getEaviCvePizarra())) {
            conditions += " AND EAVI_CVE_PIZARRA IS NULL";
        } else if (this.getEaviCvePizarra() != null) {
            conditions += " AND EAVI_CVE_PIZARRA = ?";
            values.add(this.getEaviCvePizarra());
        }

        if (this.getEaviNumSerie() != null && "null".equals(this.getEaviNumSerie())) {
            conditions += " AND EAVI_NUM_SERIE IS NULL";
        } else if (this.getEaviNumSerie() != null) {
            conditions += " AND EAVI_NUM_SERIE = ?";
            values.add(this.getEaviNumSerie());
        }

        if (this.getEaviNomEmisor() != null && "null".equals(this.getEaviNomEmisor())) {
            conditions += " AND EAVI_NOM_EMISOR IS NULL";
        } else if (this.getEaviNomEmisor() != null) {
            conditions += " AND EAVI_NOM_EMISOR = ?";
            values.add(this.getEaviNomEmisor());
        }

        if (this.getEaviFecInicio() != null && "null".equals(this.getEaviFecInicio())) {
            conditions += " AND EAVI_FEC_INICIO IS NULL";
        } else if (this.getEaviFecInicio() != null) {
            conditions += " AND EAVI_FEC_INICIO = ?";
            values.add(this.getEaviFecInicio());
        }

        if (this.getEaviFecCnbv() != null && "null".equals(this.getEaviFecCnbv())) {
            conditions += " AND EAVI_FEC_CNBV IS NULL";
        } else if (this.getEaviFecCnbv() != null) {
            conditions += " AND EAVI_FEC_CNBV = ?";
            values.add(this.getEaviFecCnbv());
        }

        if (this.getEaviFecVencimiento() != null && "null".equals(this.getEaviFecVencimiento())) {
            conditions += " AND EAVI_FEC_VENCIMIENTO IS NULL";
        } else if (this.getEaviFecVencimiento() != null) {
            conditions += " AND EAVI_FEC_VENCIMIENTO = ?";
            values.add(this.getEaviFecVencimiento());
        }

        if (this.getEaviNomAutoridad1() != null && "null".equals(this.getEaviNomAutoridad1())) {
            conditions += " AND EAVI_NOM_AUTORIDAD1 IS NULL";
        } else if (this.getEaviNomAutoridad1() != null) {
            conditions += " AND EAVI_NOM_AUTORIDAD1 = ?";
            values.add(this.getEaviNomAutoridad1());
        }

        if (this.getEaviDirAutoridad1() != null && "null".equals(this.getEaviDirAutoridad1())) {
            conditions += " AND EAVI_DIR_AUTORIDAD1 IS NULL";
        } else if (this.getEaviDirAutoridad1() != null) {
            conditions += " AND EAVI_DIR_AUTORIDAD1 = ?";
            values.add(this.getEaviDirAutoridad1());
        }

        if (this.getEaviNomResponsable1() != null && "null".equals(this.getEaviNomResponsable1())) {
            conditions += " AND EAVI_NOM_RESPONSABLE1 IS NULL";
        } else if (this.getEaviNomResponsable1() != null) {
            conditions += " AND EAVI_NOM_RESPONSABLE1 = ?";
            values.add(this.getEaviNomResponsable1());
        }

        if (this.getEaviNomPuestRespo1() != null && "null".equals(this.getEaviNomPuestRespo1())) {
            conditions += " AND EAVI_NOM_PUEST_RESPO1 IS NULL";
        } else if (this.getEaviNomPuestRespo1() != null) {
            conditions += " AND EAVI_NOM_PUEST_RESPO1 = ?";
            values.add(this.getEaviNomPuestRespo1());
        }

        if (this.getEaviNomAutoridad2() != null && "null".equals(this.getEaviNomAutoridad2())) {
            conditions += " AND EAVI_NOM_AUTORIDAD2 IS NULL";
        } else if (this.getEaviNomAutoridad2() != null) {
            conditions += " AND EAVI_NOM_AUTORIDAD2 = ?";
            values.add(this.getEaviNomAutoridad2());
        }

        if (this.getEaviDirAutoridad2() != null && "null".equals(this.getEaviDirAutoridad2())) {
            conditions += " AND EAVI_DIR_AUTORIDAD2 IS NULL";
        } else if (this.getEaviDirAutoridad2() != null) {
            conditions += " AND EAVI_DIR_AUTORIDAD2 = ?";
            values.add(this.getEaviDirAutoridad2());
        }

        if (this.getEaviNomResponsable2() != null && "null".equals(this.getEaviNomResponsable2())) {
            conditions += " AND EAVI_NOM_RESPONSABLE2 IS NULL";
        } else if (this.getEaviNomResponsable2() != null) {
            conditions += " AND EAVI_NOM_RESPONSABLE2 = ?";
            values.add(this.getEaviNomResponsable2());
        }

        if (this.getEaviNomPuestRespo2() != null && "null".equals(this.getEaviNomPuestRespo2())) {
            conditions += " AND EAVI_NOM_PUEST_RESPO2 IS NULL";
        } else if (this.getEaviNomPuestRespo2() != null) {
            conditions += " AND EAVI_NOM_PUEST_RESPO2 = ?";
            values.add(this.getEaviNomPuestRespo2());
        }

        if (this.getEaviNomAutoridad3() != null && "null".equals(this.getEaviNomAutoridad3())) {
            conditions += " AND EAVI_NOM_AUTORIDAD3 IS NULL";
        } else if (this.getEaviNomAutoridad3() != null) {
            conditions += " AND EAVI_NOM_AUTORIDAD3 = ?";
            values.add(this.getEaviNomAutoridad3());
        }

        if (this.getEaviDirAutoridad3() != null && "null".equals(this.getEaviDirAutoridad3())) {
            conditions += " AND EAVI_DIR_AUTORIDAD3 IS NULL";
        } else if (this.getEaviDirAutoridad3() != null) {
            conditions += " AND EAVI_DIR_AUTORIDAD3 = ?";
            values.add(this.getEaviDirAutoridad3());
        }

        if (this.getEaviNomResponsable3() != null && "null".equals(this.getEaviNomResponsable3())) {
            conditions += " AND EAVI_NOM_RESPONSABLE3 IS NULL";
        } else if (this.getEaviNomResponsable3() != null) {
            conditions += " AND EAVI_NOM_RESPONSABLE3 = ?";
            values.add(this.getEaviNomResponsable3());
        }

        if (this.getEaviNomPuestRespo3() != null && "null".equals(this.getEaviNomPuestRespo3())) {
            conditions += " AND EAVI_NOM_PUEST_RESPO3 IS NULL";
        } else if (this.getEaviNomPuestRespo3() != null) {
            conditions += " AND EAVI_NOM_PUEST_RESPO3 = ?";
            values.add(this.getEaviNomPuestRespo3());
        }

        if (this.getEaviTipoCalculo() != null && "null".equals(this.getEaviTipoCalculo())) {
            conditions += " AND EAVI_TIPO_CALCULO IS NULL";
        } else if (this.getEaviTipoCalculo() != null) {
            conditions += " AND EAVI_TIPO_CALCULO = ?";
            values.add(this.getEaviTipoCalculo());
        }

        if (this.getEaviFecIniPeriodo() != null && "null".equals(this.getEaviFecIniPeriodo())) {
            conditions += " AND EAVI_FEC_INI_PERIODO IS NULL";
        } else if (this.getEaviFecIniPeriodo() != null) {
            conditions += " AND EAVI_FEC_INI_PERIODO = ?";
            values.add(this.getEaviFecIniPeriodo());
        }

        if (this.getEaviFecFinPeriodo() != null && "null".equals(this.getEaviFecFinPeriodo())) {
            conditions += " AND EAVI_FEC_FIN_PERIODO IS NULL";
        } else if (this.getEaviFecFinPeriodo() != null) {
            conditions += " AND EAVI_FEC_FIN_PERIODO = ?";
            values.add(this.getEaviFecFinPeriodo());
        }

        if (this.getEaviFecAviso() != null && "null".equals(this.getEaviFecAviso())) {
            conditions += " AND EAVI_FEC_AVISO IS NULL";
        } else if (this.getEaviFecAviso() != null) {
            conditions += " AND EAVI_FEC_AVISO = ?";
            values.add(this.getEaviFecAviso());
        }

        if (this.getEaviFecAviso1() != null && "null".equals(this.getEaviFecAviso1())) {
            conditions += " AND EAVI_FEC_AVISO1 IS NULL";
        } else if (this.getEaviFecAviso1() != null) {
            conditions += " AND EAVI_FEC_AVISO1 = ?";
            values.add(this.getEaviFecAviso1());
        }

        if (this.getEaviFecPagoSig() != null && "null".equals(this.getEaviFecPagoSig())) {
            conditions += " AND EAVI_FEC_PAGO_SIG IS NULL";
        } else if (this.getEaviFecPagoSig() != null) {
            conditions += " AND EAVI_FEC_PAGO_SIG = ?";
            values.add(this.getEaviFecPagoSig());
        }

        if (this.getEaviFecIniProx() != null && "null".equals(this.getEaviFecIniProx())) {
            conditions += " AND EAVI_FEC_INI_PROX IS NULL";
        } else if (this.getEaviFecIniProx() != null) {
            conditions += " AND EAVI_FEC_INI_PROX = ?";
            values.add(this.getEaviFecIniProx());
        }

        if (this.getEaviFecFinProx() != null && "null".equals(this.getEaviFecFinProx())) {
            conditions += " AND EAVI_FEC_FIN_PROX IS NULL";
        } else if (this.getEaviFecFinProx() != null) {
            conditions += " AND EAVI_FEC_FIN_PROX = ?";
            values.add(this.getEaviFecFinProx());
        }

        if (this.getEaviImpProx() != null && this.getEaviImpProx().longValue() == -999) {
            conditions += " AND EAVI_IMP_PROX IS NULL";
        } else if (this.getEaviImpProx() != null) {
            conditions += " AND EAVI_IMP_PROX = ?";
            values.add(this.getEaviImpProx());
        }

        if (this.getEaviPlazoProx() != null && this.getEaviPlazoProx().longValue() == -999) {
            conditions += " AND EAVI_PLAZO_PROX IS NULL";
        } else if (this.getEaviPlazoProx() != null) {
            conditions += " AND EAVI_PLAZO_PROX = ?";
            values.add(this.getEaviPlazoProx());
        }

        if (this.getEaviTasaActual() != null && this.getEaviTasaActual().longValue() == -999) {
            conditions += " AND EAVI_TASA_ACTUAL IS NULL";
        } else if (this.getEaviTasaActual() != null) {
            conditions += " AND EAVI_TASA_ACTUAL = ?";
            values.add(this.getEaviTasaActual());
        }

        if (this.getEaviNumAmort() != null && this.getEaviNumAmort().longValue() == -999) {
            conditions += " AND EAVI_NUM_AMORT IS NULL";
        } else if (this.getEaviNumAmort() != null) {
            conditions += " AND EAVI_NUM_AMORT = ?";
            values.add(this.getEaviNumAmort());
        }

        if (this.getEaviImpAmort() != null && this.getEaviImpAmort().longValue() == -999) {
            conditions += " AND EAVI_IMP_AMORT IS NULL";
        } else if (this.getEaviImpAmort() != null) {
            conditions += " AND EAVI_IMP_AMORT = ?";
            values.add(this.getEaviImpAmort());
        }

        if (this.getEaviFecRealPeriodo() != null && "null".equals(this.getEaviFecRealPeriodo())) {
            conditions += " AND EAVI_FEC_REAL_PERIODO IS NULL";
        } else if (this.getEaviFecRealPeriodo() != null) {
            conditions += " AND EAVI_FEC_REAL_PERIODO = ?";
            values.add(this.getEaviFecRealPeriodo());
        }

        if (this.getEaviInstrumento() != null && "null".equals(this.getEaviInstrumento())) {
            conditions += " AND EAVI_INSTRUMENTO IS NULL";
        } else if (this.getEaviInstrumento() != null) {
            conditions += " AND EAVI_INSTRUMENTO = ?";
            values.add(this.getEaviInstrumento());
        }

        if (this.getEaviTasaAplicada() != null && this.getEaviTasaAplicada().longValue() == -999) {
            conditions += " AND EAVI_TASA_APLICADA IS NULL";
        } else if (this.getEaviTasaAplicada() != null) {
            conditions += " AND EAVI_TASA_APLICADA = ?";
            values.add(this.getEaviTasaAplicada());
        }

        if (this.getEaviTasaSobretasa() != null && this.getEaviTasaSobretasa().longValue() == -999) {
            conditions += " AND EAVI_TASA_SOBRETASA IS NULL";
        } else if (this.getEaviTasaSobretasa() != null) {
            conditions += " AND EAVI_TASA_SOBRETASA = ?";
            values.add(this.getEaviTasaSobretasa());
        }

        if (this.getEaviTasaBruta() != null && this.getEaviTasaBruta().longValue() == -999) {
            conditions += " AND EAVI_TASA_BRUTA IS NULL";
        } else if (this.getEaviTasaBruta() != null) {
            conditions += " AND EAVI_TASA_BRUTA = ?";
            values.add(this.getEaviTasaBruta());
        }

        if (this.getEaviTasaNeta() != null && this.getEaviTasaNeta().longValue() == -999) {
            conditions += " AND EAVI_TASA_NETA IS NULL";
        } else if (this.getEaviTasaNeta() != null) {
            conditions += " AND EAVI_TASA_NETA = ?";
            values.add(this.getEaviTasaNeta());
        }

        if (this.getEaviPeriodicidadDias() != null && this.getEaviPeriodicidadDias().longValue() == -999) {
            conditions += " AND EAVI_PERIODICIDAD_DIAS IS NULL";
        } else if (this.getEaviPeriodicidadDias() != null) {
            conditions += " AND EAVI_PERIODICIDAD_DIAS = ?";
            values.add(this.getEaviPeriodicidadDias());
        }

        if (this.getEaviImpValNominal() != null && this.getEaviImpValNominal().longValue() == -999) {
            conditions += " AND EAVI_IMP_VAL_NOMINAL IS NULL";
        } else if (this.getEaviImpValNominal() != null) {
            conditions += " AND EAVI_IMP_VAL_NOMINAL = ?";
            values.add(this.getEaviImpValNominal());
        }

        if (this.getEaviImpValNomTot() != null && this.getEaviImpValNomTot().longValue() == -999) {
            conditions += " AND EAVI_IMP_VAL_NOM_TOT IS NULL";
        } else if (this.getEaviImpValNomTot() != null) {
            conditions += " AND EAVI_IMP_VAL_NOM_TOT = ?";
            values.add(this.getEaviImpValNomTot());
        }

        if (this.getEaviImpAmortizacion() != null && this.getEaviImpAmortizacion().longValue() == -999) {
            conditions += " AND EAVI_IMP_AMORTIZACION IS NULL";
        } else if (this.getEaviImpAmortizacion() != null) {
            conditions += " AND EAVI_IMP_AMORTIZACION = ?";
            values.add(this.getEaviImpAmortizacion());
        }

        if (this.getEaviImpIntereses() != null && this.getEaviImpIntereses().longValue() == -999) {
            conditions += " AND EAVI_IMP_INTERESES IS NULL";
        } else if (this.getEaviImpIntereses() != null) {
            conditions += " AND EAVI_IMP_INTERESES = ?";
            values.add(this.getEaviImpIntereses());
        }

        if (this.getEaviImpNumTitulos() != null && this.getEaviImpNumTitulos().longValue() == -999) {
            conditions += " AND EAVI_IMP_NUM_TITULOS IS NULL";
        } else if (this.getEaviImpNumTitulos() != null) {
            conditions += " AND EAVI_IMP_NUM_TITULOS = ?";
            values.add(this.getEaviImpNumTitulos());
        }

        if (this.getEaviFecPago() != null && "null".equals(this.getEaviFecPago())) {
            conditions += " AND EAVI_FEC_PAGO IS NULL";
        } else if (this.getEaviFecPago() != null) {
            conditions += " AND EAVI_FEC_PAGO = ?";
            values.add(this.getEaviFecPago());
        }

        if (this.getEaviValNomTitulos() != null && this.getEaviValNomTitulos().longValue() == -999) {
            conditions += " AND EAVI_VAL_NOM_TITULOS IS NULL";
        } else if (this.getEaviValNomTitulos() != null) {
            conditions += " AND EAVI_VAL_NOM_TITULOS = ?";
            values.add(this.getEaviValNomTitulos());
        }

        if (this.getEaviTasaTiie() != null && this.getEaviTasaTiie().longValue() == -999) {
            conditions += " AND EAVI_TASA_TIIE IS NULL";
        } else if (this.getEaviTasaTiie() != null) {
            conditions += " AND EAVI_TASA_TIIE = ?";
            values.add(this.getEaviTasaTiie());
        }

        if (this.getEaviAmortConv() != null && this.getEaviAmortConv().longValue() == -999) {
            conditions += " AND EAVI_AMORT_CONV IS NULL";
        } else if (this.getEaviAmortConv() != null) {
            conditions += " AND EAVI_AMORT_CONV = ?";
            values.add(this.getEaviAmortConv());
        }

        if (this.getEaviInteresesConv() != null && this.getEaviInteresesConv().longValue() == -999) {
            conditions += " AND EAVI_INTERESES_CONV IS NULL";
        } else if (this.getEaviInteresesConv() != null) {
            conditions += " AND EAVI_INTERESES_CONV = ?";
            values.add(this.getEaviInteresesConv());
        }

        if (this.getEaviVnaConv() != null && this.getEaviVnaConv().longValue() == -999) {
            conditions += " AND EAVI_VNA_CONV IS NULL";
        } else if (this.getEaviVnaConv() != null) {
            conditions += " AND EAVI_VNA_CONV = ?";
            values.add(this.getEaviVnaConv());
        }

        if (this.getEaviInteresesCap() != null && this.getEaviInteresesCap().longValue() == -999) {
            conditions += " AND EAVI_INTERESES_CAP IS NULL";
        } else if (this.getEaviInteresesCap() != null) {
            conditions += " AND EAVI_INTERESES_CAP = ?";
            values.add(this.getEaviInteresesCap());
        }

        if (this.getEaviInteresesPer() != null && this.getEaviInteresesPer().longValue() == -999) {
            conditions += " AND EAVI_INTERESES_PER IS NULL";
        } else if (this.getEaviInteresesPer() != null) {
            conditions += " AND EAVI_INTERESES_PER = ?";
            values.add(this.getEaviInteresesPer());
        }

        if (this.getEaviAmortExt() != null && this.getEaviAmortExt().longValue() == -999) {
            conditions += " AND EAVI_AMORT_EXT IS NULL";
        } else if (this.getEaviAmortExt() != null) {
            conditions += " AND EAVI_AMORT_EXT = ?";
            values.add(this.getEaviAmortExt());
        }

        if (this.getEaviVnxt() != null && this.getEaviVnxt().longValue() == -999) {
            conditions += " AND EAVI_VNXT IS NULL";
        } else if (this.getEaviVnxt() != null) {
            conditions += " AND EAVI_VNXT = ?";
            values.add(this.getEaviVnxt());
        }

        if (this.getEaviImpTipoCambInicio() != null && this.getEaviImpTipoCambInicio().longValue() == -999) {
            conditions += " AND EAVI_IMP_TIPO_CAMB_INICIO IS NULL";
        } else if (this.getEaviImpTipoCambInicio() != null) {
            conditions += " AND EAVI_IMP_TIPO_CAMB_INICIO = ?";
            values.add(this.getEaviImpTipoCambInicio());
        }

        if (this.getEaviImpTipoCambFin() != null && this.getEaviImpTipoCambFin().longValue() == -999) {
            conditions += " AND EAVI_IMP_TIPO_CAMB_FIN IS NULL";
        } else if (this.getEaviImpTipoCambFin() != null) {
            conditions += " AND EAVI_IMP_TIPO_CAMB_FIN = ?";
            values.add(this.getEaviImpTipoCambFin());
        }

        if (this.getEaviImpTipoUdi() != null && this.getEaviImpTipoUdi().longValue() == -999) {
            conditions += " AND EAVI_IMP_TIPO_UDI IS NULL";
        } else if (this.getEaviImpTipoUdi() != null) {
            conditions += " AND EAVI_IMP_TIPO_UDI = ?";
            values.add(this.getEaviImpTipoUdi());
        }

        if (this.getEaviImpAdicInflacion() != null && this.getEaviImpAdicInflacion().longValue() == -999) {
            conditions += " AND EAVI_IMP_ADIC_INFLACION IS NULL";
        } else if (this.getEaviImpAdicInflacion() != null) {
            conditions += " AND EAVI_IMP_ADIC_INFLACION = ?";
            values.add(this.getEaviImpAdicInflacion());
        }

        if (this.getEaviElaboro() != null && "null".equals(this.getEaviElaboro())) {
            conditions += " AND EAVI_ELABORO IS NULL";
        } else if (this.getEaviElaboro() != null) {
            conditions += " AND EAVI_ELABORO = ?";
            values.add(this.getEaviElaboro());
        }

        if (this.getEaviFirma() != null && "null".equals(this.getEaviFirma())) {
            conditions += " AND EAVI_FIRMA IS NULL";
        } else if (this.getEaviFirma() != null) {
            conditions += " AND EAVI_FIRMA = ?";
            values.add(this.getEaviFirma());
        }

        if (this.getEaviNombre1Ccp() != null && "null".equals(this.getEaviNombre1Ccp())) {
            conditions += " AND EAVI_NOMBRE1_CCP IS NULL";
        } else if (this.getEaviNombre1Ccp() != null) {
            conditions += " AND EAVI_NOMBRE1_CCP = ?";
            values.add(this.getEaviNombre1Ccp());
        }

        if (this.getEaviPuesto1Ccp() != null && "null".equals(this.getEaviPuesto1Ccp())) {
            conditions += " AND EAVI_PUESTO1_CCP IS NULL";
        } else if (this.getEaviPuesto1Ccp() != null) {
            conditions += " AND EAVI_PUESTO1_CCP = ?";
            values.add(this.getEaviPuesto1Ccp());
        }

        if (this.getEaviNombre2Ccp() != null && "null".equals(this.getEaviNombre2Ccp())) {
            conditions += " AND EAVI_NOMBRE2_CCP IS NULL";
        } else if (this.getEaviNombre2Ccp() != null) {
            conditions += " AND EAVI_NOMBRE2_CCP = ?";
            values.add(this.getEaviNombre2Ccp());
        }

        if (this.getEaviPuesto2Ccp() != null && "null".equals(this.getEaviPuesto2Ccp())) {
            conditions += " AND EAVI_PUESTO2_CCP IS NULL";
        } else if (this.getEaviPuesto2Ccp() != null) {
            conditions += " AND EAVI_PUESTO2_CCP = ?";
            values.add(this.getEaviPuesto2Ccp());
        }

        if (this.getEaviNombre3Ccp() != null && "null".equals(this.getEaviNombre3Ccp())) {
            conditions += " AND EAVI_NOMBRE3_CCP IS NULL";
        } else if (this.getEaviNombre3Ccp() != null) {
            conditions += " AND EAVI_NOMBRE3_CCP = ?";
            values.add(this.getEaviNombre3Ccp());
        }

        if (this.getEaviPuesto3Ccp() != null && "null".equals(this.getEaviPuesto3Ccp())) {
            conditions += " AND EAVI_PUESTO3_CCP IS NULL";
        } else if (this.getEaviPuesto3Ccp() != null) {
            conditions += " AND EAVI_PUESTO3_CCP = ?";
            values.add(this.getEaviPuesto3Ccp());
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
        String sql = "UPDATE F_IMPAVISO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EAVI_ID_PROGRAMA = ?";
        pkValues.add(this.getEaviIdPrograma());
        conditions += " AND EAVI_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEaviIdFideicomiso());
        conditions += " AND EAVI_ID_EMISION = ?";
        pkValues.add(this.getEaviIdEmision());
        conditions += " AND EAVI_ID_SEC_CALC = ?";
        pkValues.add(this.getEaviIdSecCalc());
        conditions += " AND EAVI_ID_REPORTE = ?";
        pkValues.add(this.getEaviIdReporte());
        fields += " EAVI_CVE_PIZARRA = ?, ";
        values.add(this.getEaviCvePizarra());
        fields += " EAVI_NUM_SERIE = ?, ";
        values.add(this.getEaviNumSerie());
        fields += " EAVI_NOM_EMISOR = ?, ";
        values.add(this.getEaviNomEmisor());
        fields += " EAVI_FEC_INICIO = ?, ";
        values.add(this.getEaviFecInicio());
        fields += " EAVI_FEC_CNBV = ?, ";
        values.add(this.getEaviFecCnbv());
        fields += " EAVI_FEC_VENCIMIENTO = ?, ";
        values.add(this.getEaviFecVencimiento());
        fields += " EAVI_NOM_AUTORIDAD1 = ?, ";
        values.add(this.getEaviNomAutoridad1());
        fields += " EAVI_DIR_AUTORIDAD1 = ?, ";
        values.add(this.getEaviDirAutoridad1());
        fields += " EAVI_NOM_RESPONSABLE1 = ?, ";
        values.add(this.getEaviNomResponsable1());
        fields += " EAVI_NOM_PUEST_RESPO1 = ?, ";
        values.add(this.getEaviNomPuestRespo1());
        fields += " EAVI_NOM_AUTORIDAD2 = ?, ";
        values.add(this.getEaviNomAutoridad2());
        fields += " EAVI_DIR_AUTORIDAD2 = ?, ";
        values.add(this.getEaviDirAutoridad2());
        fields += " EAVI_NOM_RESPONSABLE2 = ?, ";
        values.add(this.getEaviNomResponsable2());
        fields += " EAVI_NOM_PUEST_RESPO2 = ?, ";
        values.add(this.getEaviNomPuestRespo2());
        fields += " EAVI_NOM_AUTORIDAD3 = ?, ";
        values.add(this.getEaviNomAutoridad3());
        fields += " EAVI_DIR_AUTORIDAD3 = ?, ";
        values.add(this.getEaviDirAutoridad3());
        fields += " EAVI_NOM_RESPONSABLE3 = ?, ";
        values.add(this.getEaviNomResponsable3());
        fields += " EAVI_NOM_PUEST_RESPO3 = ?, ";
        values.add(this.getEaviNomPuestRespo3());
        fields += " EAVI_TIPO_CALCULO = ?, ";
        values.add(this.getEaviTipoCalculo());
        fields += " EAVI_FEC_INI_PERIODO = ?, ";
        values.add(this.getEaviFecIniPeriodo());
        fields += " EAVI_FEC_FIN_PERIODO = ?, ";
        values.add(this.getEaviFecFinPeriodo());
        fields += " EAVI_FEC_AVISO = ?, ";
        values.add(this.getEaviFecAviso());
        fields += " EAVI_FEC_AVISO1 = ?, ";
        values.add(this.getEaviFecAviso1());
        fields += " EAVI_FEC_PAGO_SIG = ?, ";
        values.add(this.getEaviFecPagoSig());
        fields += " EAVI_FEC_INI_PROX = ?, ";
        values.add(this.getEaviFecIniProx());
        fields += " EAVI_FEC_FIN_PROX = ?, ";
        values.add(this.getEaviFecFinProx());
        fields += " EAVI_IMP_PROX = ?, ";
        values.add(this.getEaviImpProx());
        fields += " EAVI_PLAZO_PROX = ?, ";
        values.add(this.getEaviPlazoProx());
        fields += " EAVI_TASA_ACTUAL = ?, ";
        values.add(this.getEaviTasaActual());
        fields += " EAVI_NUM_AMORT = ?, ";
        values.add(this.getEaviNumAmort());
        fields += " EAVI_IMP_AMORT = ?, ";
        values.add(this.getEaviImpAmort());
        fields += " EAVI_FEC_REAL_PERIODO = ?, ";
        values.add(this.getEaviFecRealPeriodo());
        fields += " EAVI_INSTRUMENTO = ?, ";
        values.add(this.getEaviInstrumento());
        fields += " EAVI_TASA_APLICADA = ?, ";
        values.add(this.getEaviTasaAplicada());
        fields += " EAVI_TASA_SOBRETASA = ?, ";
        values.add(this.getEaviTasaSobretasa());
        fields += " EAVI_TASA_BRUTA = ?, ";
        values.add(this.getEaviTasaBruta());
        fields += " EAVI_TASA_NETA = ?, ";
        values.add(this.getEaviTasaNeta());
        fields += " EAVI_PERIODICIDAD_DIAS = ?, ";
        values.add(this.getEaviPeriodicidadDias());
        fields += " EAVI_IMP_VAL_NOMINAL = ?, ";
        values.add(this.getEaviImpValNominal());
        fields += " EAVI_IMP_VAL_NOM_TOT = ?, ";
        values.add(this.getEaviImpValNomTot());
        fields += " EAVI_IMP_AMORTIZACION = ?, ";
        values.add(this.getEaviImpAmortizacion());
        fields += " EAVI_IMP_INTERESES = ?, ";
        values.add(this.getEaviImpIntereses());
        fields += " EAVI_IMP_NUM_TITULOS = ?, ";
        values.add(this.getEaviImpNumTitulos());
        fields += " EAVI_FEC_PAGO = ?, ";
        values.add(this.getEaviFecPago());
        fields += " EAVI_VAL_NOM_TITULOS = ?, ";
        values.add(this.getEaviValNomTitulos());
        fields += " EAVI_TASA_TIIE = ?, ";
        values.add(this.getEaviTasaTiie());
        fields += " EAVI_AMORT_CONV = ?, ";
        values.add(this.getEaviAmortConv());
        fields += " EAVI_INTERESES_CONV = ?, ";
        values.add(this.getEaviInteresesConv());
        fields += " EAVI_VNA_CONV = ?, ";
        values.add(this.getEaviVnaConv());
        fields += " EAVI_INTERESES_CAP = ?, ";
        values.add(this.getEaviInteresesCap());
        fields += " EAVI_INTERESES_PER = ?, ";
        values.add(this.getEaviInteresesPer());
        fields += " EAVI_AMORT_EXT = ?, ";
        values.add(this.getEaviAmortExt());
        fields += " EAVI_VNXT = ?, ";
        values.add(this.getEaviVnxt());
        fields += " EAVI_IMP_TIPO_CAMB_INICIO = ?, ";
        values.add(this.getEaviImpTipoCambInicio());
        fields += " EAVI_IMP_TIPO_CAMB_FIN = ?, ";
        values.add(this.getEaviImpTipoCambFin());
        fields += " EAVI_IMP_TIPO_UDI = ?, ";
        values.add(this.getEaviImpTipoUdi());
        fields += " EAVI_IMP_ADIC_INFLACION = ?, ";
        values.add(this.getEaviImpAdicInflacion());
        fields += " EAVI_ELABORO = ?, ";
        values.add(this.getEaviElaboro());
        fields += " EAVI_FIRMA = ?, ";
        values.add(this.getEaviFirma());
        fields += " EAVI_NOMBRE1_CCP = ?, ";
        values.add(this.getEaviNombre1Ccp());
        fields += " EAVI_PUESTO1_CCP = ?, ";
        values.add(this.getEaviPuesto1Ccp());
        fields += " EAVI_NOMBRE2_CCP = ?, ";
        values.add(this.getEaviNombre2Ccp());
        fields += " EAVI_PUESTO2_CCP = ?, ";
        values.add(this.getEaviPuesto2Ccp());
        fields += " EAVI_NOMBRE3_CCP = ?, ";
        values.add(this.getEaviNombre3Ccp());
        fields += " EAVI_PUESTO3_CCP = ?, ";
        values.add(this.getEaviPuesto3Ccp());
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
        String sql = "INSERT INTO F_IMPAVISO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EAVI_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEaviIdPrograma());

        fields += ", EAVI_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEaviIdFideicomiso());

        fields += ", EAVI_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEaviIdEmision());

        fields += ", EAVI_ID_SEC_CALC";
        fieldValues += ", ?";
        values.add(this.getEaviIdSecCalc());

        fields += ", EAVI_ID_REPORTE";
        fieldValues += ", ?";
        values.add(this.getEaviIdReporte());

        fields += ", EAVI_CVE_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getEaviCvePizarra());

        fields += ", EAVI_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getEaviNumSerie());

        fields += ", EAVI_NOM_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEaviNomEmisor());

        fields += ", EAVI_FEC_INICIO";
        fieldValues += ", ?";
        values.add(this.getEaviFecInicio());

        fields += ", EAVI_FEC_CNBV";
        fieldValues += ", ?";
        values.add(this.getEaviFecCnbv());

        fields += ", EAVI_FEC_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getEaviFecVencimiento());

        fields += ", EAVI_NOM_AUTORIDAD1";
        fieldValues += ", ?";
        values.add(this.getEaviNomAutoridad1());

        fields += ", EAVI_DIR_AUTORIDAD1";
        fieldValues += ", ?";
        values.add(this.getEaviDirAutoridad1());

        fields += ", EAVI_NOM_RESPONSABLE1";
        fieldValues += ", ?";
        values.add(this.getEaviNomResponsable1());

        fields += ", EAVI_NOM_PUEST_RESPO1";
        fieldValues += ", ?";
        values.add(this.getEaviNomPuestRespo1());

        fields += ", EAVI_NOM_AUTORIDAD2";
        fieldValues += ", ?";
        values.add(this.getEaviNomAutoridad2());

        fields += ", EAVI_DIR_AUTORIDAD2";
        fieldValues += ", ?";
        values.add(this.getEaviDirAutoridad2());

        fields += ", EAVI_NOM_RESPONSABLE2";
        fieldValues += ", ?";
        values.add(this.getEaviNomResponsable2());

        fields += ", EAVI_NOM_PUEST_RESPO2";
        fieldValues += ", ?";
        values.add(this.getEaviNomPuestRespo2());

        fields += ", EAVI_NOM_AUTORIDAD3";
        fieldValues += ", ?";
        values.add(this.getEaviNomAutoridad3());

        fields += ", EAVI_DIR_AUTORIDAD3";
        fieldValues += ", ?";
        values.add(this.getEaviDirAutoridad3());

        fields += ", EAVI_NOM_RESPONSABLE3";
        fieldValues += ", ?";
        values.add(this.getEaviNomResponsable3());

        fields += ", EAVI_NOM_PUEST_RESPO3";
        fieldValues += ", ?";
        values.add(this.getEaviNomPuestRespo3());

        fields += ", EAVI_TIPO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEaviTipoCalculo());

        fields += ", EAVI_FEC_INI_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEaviFecIniPeriodo());

        fields += ", EAVI_FEC_FIN_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEaviFecFinPeriodo());

        fields += ", EAVI_FEC_AVISO";
        fieldValues += ", ?";
        values.add(this.getEaviFecAviso());

        fields += ", EAVI_FEC_AVISO1";
        fieldValues += ", ?";
        values.add(this.getEaviFecAviso1());

        fields += ", EAVI_FEC_PAGO_SIG";
        fieldValues += ", ?";
        values.add(this.getEaviFecPagoSig());

        fields += ", EAVI_FEC_INI_PROX";
        fieldValues += ", ?";
        values.add(this.getEaviFecIniProx());

        fields += ", EAVI_FEC_FIN_PROX";
        fieldValues += ", ?";
        values.add(this.getEaviFecFinProx());

        fields += ", EAVI_IMP_PROX";
        fieldValues += ", ?";
        values.add(this.getEaviImpProx());

        fields += ", EAVI_PLAZO_PROX";
        fieldValues += ", ?";
        values.add(this.getEaviPlazoProx());

        fields += ", EAVI_TASA_ACTUAL";
        fieldValues += ", ?";
        values.add(this.getEaviTasaActual());

        fields += ", EAVI_NUM_AMORT";
        fieldValues += ", ?";
        values.add(this.getEaviNumAmort());

        fields += ", EAVI_IMP_AMORT";
        fieldValues += ", ?";
        values.add(this.getEaviImpAmort());

        fields += ", EAVI_FEC_REAL_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEaviFecRealPeriodo());

        fields += ", EAVI_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getEaviInstrumento());

        fields += ", EAVI_TASA_APLICADA";
        fieldValues += ", ?";
        values.add(this.getEaviTasaAplicada());

        fields += ", EAVI_TASA_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getEaviTasaSobretasa());

        fields += ", EAVI_TASA_BRUTA";
        fieldValues += ", ?";
        values.add(this.getEaviTasaBruta());

        fields += ", EAVI_TASA_NETA";
        fieldValues += ", ?";
        values.add(this.getEaviTasaNeta());

        fields += ", EAVI_PERIODICIDAD_DIAS";
        fieldValues += ", ?";
        values.add(this.getEaviPeriodicidadDias());

        fields += ", EAVI_IMP_VAL_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getEaviImpValNominal());

        fields += ", EAVI_IMP_VAL_NOM_TOT";
        fieldValues += ", ?";
        values.add(this.getEaviImpValNomTot());

        fields += ", EAVI_IMP_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEaviImpAmortizacion());

        fields += ", EAVI_IMP_INTERESES";
        fieldValues += ", ?";
        values.add(this.getEaviImpIntereses());

        fields += ", EAVI_IMP_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEaviImpNumTitulos());

        fields += ", EAVI_FEC_PAGO";
        fieldValues += ", ?";
        values.add(this.getEaviFecPago());

        fields += ", EAVI_VAL_NOM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEaviValNomTitulos());

        fields += ", EAVI_TASA_TIIE";
        fieldValues += ", ?";
        values.add(this.getEaviTasaTiie());

        fields += ", EAVI_AMORT_CONV";
        fieldValues += ", ?";
        values.add(this.getEaviAmortConv());

        fields += ", EAVI_INTERESES_CONV";
        fieldValues += ", ?";
        values.add(this.getEaviInteresesConv());

        fields += ", EAVI_VNA_CONV";
        fieldValues += ", ?";
        values.add(this.getEaviVnaConv());

        fields += ", EAVI_INTERESES_CAP";
        fieldValues += ", ?";
        values.add(this.getEaviInteresesCap());

        fields += ", EAVI_INTERESES_PER";
        fieldValues += ", ?";
        values.add(this.getEaviInteresesPer());

        fields += ", EAVI_AMORT_EXT";
        fieldValues += ", ?";
        values.add(this.getEaviAmortExt());

        fields += ", EAVI_VNXT";
        fieldValues += ", ?";
        values.add(this.getEaviVnxt());

        fields += ", EAVI_IMP_TIPO_CAMB_INICIO";
        fieldValues += ", ?";
        values.add(this.getEaviImpTipoCambInicio());

        fields += ", EAVI_IMP_TIPO_CAMB_FIN";
        fieldValues += ", ?";
        values.add(this.getEaviImpTipoCambFin());

        fields += ", EAVI_IMP_TIPO_UDI";
        fieldValues += ", ?";
        values.add(this.getEaviImpTipoUdi());

        fields += ", EAVI_IMP_ADIC_INFLACION";
        fieldValues += ", ?";
        values.add(this.getEaviImpAdicInflacion());

        fields += ", EAVI_ELABORO";
        fieldValues += ", ?";
        values.add(this.getEaviElaboro());

        fields += ", EAVI_FIRMA";
        fieldValues += ", ?";
        values.add(this.getEaviFirma());

        fields += ", EAVI_NOMBRE1_CCP";
        fieldValues += ", ?";
        values.add(this.getEaviNombre1Ccp());

        fields += ", EAVI_PUESTO1_CCP";
        fieldValues += ", ?";
        values.add(this.getEaviPuesto1Ccp());

        fields += ", EAVI_NOMBRE2_CCP";
        fieldValues += ", ?";
        values.add(this.getEaviNombre2Ccp());

        fields += ", EAVI_PUESTO2_CCP";
        fieldValues += ", ?";
        values.add(this.getEaviPuesto2Ccp());

        fields += ", EAVI_NOMBRE3_CCP";
        fieldValues += ", ?";
        values.add(this.getEaviNombre3Ccp());

        fields += ", EAVI_PUESTO3_CCP";
        fieldValues += ", ?";
        values.add(this.getEaviPuesto3Ccp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_IMPAVISO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EAVI_ID_PROGRAMA = ?";
        values.add(this.getEaviIdPrograma());
        conditions += " AND EAVI_ID_FIDEICOMISO = ?";
        values.add(this.getEaviIdFideicomiso());
        conditions += " AND EAVI_ID_EMISION = ?";
        values.add(this.getEaviIdEmision());
        conditions += " AND EAVI_ID_SEC_CALC = ?";
        values.add(this.getEaviIdSecCalc());
        conditions += " AND EAVI_ID_REPORTE = ?";
        values.add(this.getEaviIdReporte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FImpaviso instance = (FImpaviso) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEaviIdPrograma().equals(instance.getEaviIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEaviIdFideicomiso().equals(instance.getEaviIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEaviIdEmision().equals(instance.getEaviIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEaviIdSecCalc().equals(instance.getEaviIdSecCalc()))
            equalObjects = false;
        if (equalObjects && !this.getEaviIdReporte().equals(instance.getEaviIdReporte()))
            equalObjects = false;
        if (equalObjects && !this.getEaviCvePizarra().equals(instance.getEaviCvePizarra()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNumSerie().equals(instance.getEaviNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNomEmisor().equals(instance.getEaviNomEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecInicio().equals(instance.getEaviFecInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecCnbv().equals(instance.getEaviFecCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecVencimiento().equals(instance.getEaviFecVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNomAutoridad1().equals(instance.getEaviNomAutoridad1()))
            equalObjects = false;
        if (equalObjects && !this.getEaviDirAutoridad1().equals(instance.getEaviDirAutoridad1()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNomResponsable1().equals(instance.getEaviNomResponsable1()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNomPuestRespo1().equals(instance.getEaviNomPuestRespo1()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNomAutoridad2().equals(instance.getEaviNomAutoridad2()))
            equalObjects = false;
        if (equalObjects && !this.getEaviDirAutoridad2().equals(instance.getEaviDirAutoridad2()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNomResponsable2().equals(instance.getEaviNomResponsable2()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNomPuestRespo2().equals(instance.getEaviNomPuestRespo2()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNomAutoridad3().equals(instance.getEaviNomAutoridad3()))
            equalObjects = false;
        if (equalObjects && !this.getEaviDirAutoridad3().equals(instance.getEaviDirAutoridad3()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNomResponsable3().equals(instance.getEaviNomResponsable3()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNomPuestRespo3().equals(instance.getEaviNomPuestRespo3()))
            equalObjects = false;
        if (equalObjects && !this.getEaviTipoCalculo().equals(instance.getEaviTipoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecIniPeriodo().equals(instance.getEaviFecIniPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecFinPeriodo().equals(instance.getEaviFecFinPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecAviso().equals(instance.getEaviFecAviso()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecAviso1().equals(instance.getEaviFecAviso1()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecPagoSig().equals(instance.getEaviFecPagoSig()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecIniProx().equals(instance.getEaviFecIniProx()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecFinProx().equals(instance.getEaviFecFinProx()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpProx().equals(instance.getEaviImpProx()))
            equalObjects = false;
        if (equalObjects && !this.getEaviPlazoProx().equals(instance.getEaviPlazoProx()))
            equalObjects = false;
        if (equalObjects && !this.getEaviTasaActual().equals(instance.getEaviTasaActual()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNumAmort().equals(instance.getEaviNumAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpAmort().equals(instance.getEaviImpAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecRealPeriodo().equals(instance.getEaviFecRealPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEaviInstrumento().equals(instance.getEaviInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getEaviTasaAplicada().equals(instance.getEaviTasaAplicada()))
            equalObjects = false;
        if (equalObjects && !this.getEaviTasaSobretasa().equals(instance.getEaviTasaSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getEaviTasaBruta().equals(instance.getEaviTasaBruta()))
            equalObjects = false;
        if (equalObjects && !this.getEaviTasaNeta().equals(instance.getEaviTasaNeta()))
            equalObjects = false;
        if (equalObjects && !this.getEaviPeriodicidadDias().equals(instance.getEaviPeriodicidadDias()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpValNominal().equals(instance.getEaviImpValNominal()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpValNomTot().equals(instance.getEaviImpValNomTot()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpAmortizacion().equals(instance.getEaviImpAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpIntereses().equals(instance.getEaviImpIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpNumTitulos().equals(instance.getEaviImpNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFecPago().equals(instance.getEaviFecPago()))
            equalObjects = false;
        if (equalObjects && !this.getEaviValNomTitulos().equals(instance.getEaviValNomTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEaviTasaTiie().equals(instance.getEaviTasaTiie()))
            equalObjects = false;
        if (equalObjects && !this.getEaviAmortConv().equals(instance.getEaviAmortConv()))
            equalObjects = false;
        if (equalObjects && !this.getEaviInteresesConv().equals(instance.getEaviInteresesConv()))
            equalObjects = false;
        if (equalObjects && !this.getEaviVnaConv().equals(instance.getEaviVnaConv()))
            equalObjects = false;
        if (equalObjects && !this.getEaviInteresesCap().equals(instance.getEaviInteresesCap()))
            equalObjects = false;
        if (equalObjects && !this.getEaviInteresesPer().equals(instance.getEaviInteresesPer()))
            equalObjects = false;
        if (equalObjects && !this.getEaviAmortExt().equals(instance.getEaviAmortExt()))
            equalObjects = false;
        if (equalObjects && !this.getEaviVnxt().equals(instance.getEaviVnxt()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpTipoCambInicio().equals(instance.getEaviImpTipoCambInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpTipoCambFin().equals(instance.getEaviImpTipoCambFin()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpTipoUdi().equals(instance.getEaviImpTipoUdi()))
            equalObjects = false;
        if (equalObjects && !this.getEaviImpAdicInflacion().equals(instance.getEaviImpAdicInflacion()))
            equalObjects = false;
        if (equalObjects && !this.getEaviElaboro().equals(instance.getEaviElaboro()))
            equalObjects = false;
        if (equalObjects && !this.getEaviFirma().equals(instance.getEaviFirma()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNombre1Ccp().equals(instance.getEaviNombre1Ccp()))
            equalObjects = false;
        if (equalObjects && !this.getEaviPuesto1Ccp().equals(instance.getEaviPuesto1Ccp()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNombre2Ccp().equals(instance.getEaviNombre2Ccp()))
            equalObjects = false;
        if (equalObjects && !this.getEaviPuesto2Ccp().equals(instance.getEaviPuesto2Ccp()))
            equalObjects = false;
        if (equalObjects && !this.getEaviNombre3Ccp().equals(instance.getEaviNombre3Ccp()))
            equalObjects = false;
        if (equalObjects && !this.getEaviPuesto3Ccp().equals(instance.getEaviPuesto3Ccp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FImpaviso result = new FImpaviso();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEaviIdPrograma((BigDecimal) objectData.getData("EAVI_ID_PROGRAMA"));
        result.setEaviIdFideicomiso((BigDecimal) objectData.getData("EAVI_ID_FIDEICOMISO"));
        result.setEaviIdEmision((BigDecimal) objectData.getData("EAVI_ID_EMISION"));
        result.setEaviIdSecCalc((BigDecimal) objectData.getData("EAVI_ID_SEC_CALC"));
        result.setEaviIdReporte((String) objectData.getData("EAVI_ID_REPORTE"));
        result.setEaviCvePizarra((String) objectData.getData("EAVI_CVE_PIZARRA"));
        result.setEaviNumSerie((String) objectData.getData("EAVI_NUM_SERIE"));
        result.setEaviNomEmisor((String) objectData.getData("EAVI_NOM_EMISOR"));
        result.setEaviFecInicio((String) objectData.getData("EAVI_FEC_INICIO"));
        result.setEaviFecCnbv((String) objectData.getData("EAVI_FEC_CNBV"));
        result.setEaviFecVencimiento((String) objectData.getData("EAVI_FEC_VENCIMIENTO"));
        result.setEaviNomAutoridad1((String) objectData.getData("EAVI_NOM_AUTORIDAD1"));
        result.setEaviDirAutoridad1((String) objectData.getData("EAVI_DIR_AUTORIDAD1"));
        result.setEaviNomResponsable1((String) objectData.getData("EAVI_NOM_RESPONSABLE1"));
        result.setEaviNomPuestRespo1((String) objectData.getData("EAVI_NOM_PUEST_RESPO1"));
        result.setEaviNomAutoridad2((String) objectData.getData("EAVI_NOM_AUTORIDAD2"));
        result.setEaviDirAutoridad2((String) objectData.getData("EAVI_DIR_AUTORIDAD2"));
        result.setEaviNomResponsable2((String) objectData.getData("EAVI_NOM_RESPONSABLE2"));
        result.setEaviNomPuestRespo2((String) objectData.getData("EAVI_NOM_PUEST_RESPO2"));
        result.setEaviNomAutoridad3((String) objectData.getData("EAVI_NOM_AUTORIDAD3"));
        result.setEaviDirAutoridad3((String) objectData.getData("EAVI_DIR_AUTORIDAD3"));
        result.setEaviNomResponsable3((String) objectData.getData("EAVI_NOM_RESPONSABLE3"));
        result.setEaviNomPuestRespo3((String) objectData.getData("EAVI_NOM_PUEST_RESPO3"));
        result.setEaviTipoCalculo((String) objectData.getData("EAVI_TIPO_CALCULO"));
        result.setEaviFecIniPeriodo((String) objectData.getData("EAVI_FEC_INI_PERIODO"));
        result.setEaviFecFinPeriodo((String) objectData.getData("EAVI_FEC_FIN_PERIODO"));
        result.setEaviFecAviso((String) objectData.getData("EAVI_FEC_AVISO"));
        result.setEaviFecAviso1((String) objectData.getData("EAVI_FEC_AVISO1"));
        result.setEaviFecPagoSig((String) objectData.getData("EAVI_FEC_PAGO_SIG"));
        result.setEaviFecIniProx((String) objectData.getData("EAVI_FEC_INI_PROX"));
        result.setEaviFecFinProx((String) objectData.getData("EAVI_FEC_FIN_PROX"));
        result.setEaviImpProx((BigDecimal) objectData.getData("EAVI_IMP_PROX"));
        result.setEaviPlazoProx((BigDecimal) objectData.getData("EAVI_PLAZO_PROX"));
        result.setEaviTasaActual((BigDecimal) objectData.getData("EAVI_TASA_ACTUAL"));
        result.setEaviNumAmort((BigDecimal) objectData.getData("EAVI_NUM_AMORT"));
        result.setEaviImpAmort((BigDecimal) objectData.getData("EAVI_IMP_AMORT"));
        result.setEaviFecRealPeriodo((String) objectData.getData("EAVI_FEC_REAL_PERIODO"));
        result.setEaviInstrumento((String) objectData.getData("EAVI_INSTRUMENTO"));
        result.setEaviTasaAplicada((BigDecimal) objectData.getData("EAVI_TASA_APLICADA"));
        result.setEaviTasaSobretasa((BigDecimal) objectData.getData("EAVI_TASA_SOBRETASA"));
        result.setEaviTasaBruta((BigDecimal) objectData.getData("EAVI_TASA_BRUTA"));
        result.setEaviTasaNeta((BigDecimal) objectData.getData("EAVI_TASA_NETA"));
        result.setEaviPeriodicidadDias((BigDecimal) objectData.getData("EAVI_PERIODICIDAD_DIAS"));
        result.setEaviImpValNominal((BigDecimal) objectData.getData("EAVI_IMP_VAL_NOMINAL"));
        result.setEaviImpValNomTot((BigDecimal) objectData.getData("EAVI_IMP_VAL_NOM_TOT"));
        result.setEaviImpAmortizacion((BigDecimal) objectData.getData("EAVI_IMP_AMORTIZACION"));
        result.setEaviImpIntereses((BigDecimal) objectData.getData("EAVI_IMP_INTERESES"));
        result.setEaviImpNumTitulos((BigDecimal) objectData.getData("EAVI_IMP_NUM_TITULOS"));
        result.setEaviFecPago((String) objectData.getData("EAVI_FEC_PAGO"));
        result.setEaviValNomTitulos((BigDecimal) objectData.getData("EAVI_VAL_NOM_TITULOS"));
        result.setEaviTasaTiie((BigDecimal) objectData.getData("EAVI_TASA_TIIE"));
        result.setEaviAmortConv((BigDecimal) objectData.getData("EAVI_AMORT_CONV"));
        result.setEaviInteresesConv((BigDecimal) objectData.getData("EAVI_INTERESES_CONV"));
        result.setEaviVnaConv((BigDecimal) objectData.getData("EAVI_VNA_CONV"));
        result.setEaviInteresesCap((BigDecimal) objectData.getData("EAVI_INTERESES_CAP"));
        result.setEaviInteresesPer((BigDecimal) objectData.getData("EAVI_INTERESES_PER"));
        result.setEaviAmortExt((BigDecimal) objectData.getData("EAVI_AMORT_EXT"));
        result.setEaviVnxt((BigDecimal) objectData.getData("EAVI_VNXT"));
        result.setEaviImpTipoCambInicio((BigDecimal) objectData.getData("EAVI_IMP_TIPO_CAMB_INICIO"));
        result.setEaviImpTipoCambFin((BigDecimal) objectData.getData("EAVI_IMP_TIPO_CAMB_FIN"));
        result.setEaviImpTipoUdi((BigDecimal) objectData.getData("EAVI_IMP_TIPO_UDI"));
        result.setEaviImpAdicInflacion((BigDecimal) objectData.getData("EAVI_IMP_ADIC_INFLACION"));
        result.setEaviElaboro((String) objectData.getData("EAVI_ELABORO"));
        result.setEaviFirma((String) objectData.getData("EAVI_FIRMA"));
        result.setEaviNombre1Ccp((String) objectData.getData("EAVI_NOMBRE1_CCP"));
        result.setEaviPuesto1Ccp((String) objectData.getData("EAVI_PUESTO1_CCP"));
        result.setEaviNombre2Ccp((String) objectData.getData("EAVI_NOMBRE2_CCP"));
        result.setEaviPuesto2Ccp((String) objectData.getData("EAVI_PUESTO2_CCP"));
        result.setEaviNombre3Ccp((String) objectData.getData("EAVI_NOMBRE3_CCP"));
        result.setEaviPuesto3Ccp((String) objectData.getData("EAVI_PUESTO3_CCP"));

        return result;

    }

}
