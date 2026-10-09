package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CALCULOE_PK", columns = { "CAL_NUM_PROGRAMA", "CAL_NUM_EMISION", "CAL_NUM_SEC_CALC", "CAL_NUM_SEC_INTER" }, sequences = { "MANUAL" })
public class Calculoe extends DomainObject {

    BigDecimal calNumPrograma = null;
    BigDecimal calNumEmision = null;
    BigDecimal calNumSecCalc = null;
    BigDecimal calNumSecInter = null;
    BigDecimal calAnoIniPeriodo = null;
    BigDecimal calMesIniPeriodo = null;
    BigDecimal calDiaIniPeriodo = null;
    BigDecimal calAnoFinPeriodo = null;
    BigDecimal calMesFinPeriodo = null;
    BigDecimal calDiaFinPeriodo = null;
    BigDecimal calAnoRealPeriodo = null;
    BigDecimal calMesRealPeriodo = null;
    BigDecimal calDiaRealPeriodo = null;
    String calCveInstrumento = null;
    BigDecimal calTasaAplicada = null;
    BigDecimal calTasaEquivalente = null;
    BigDecimal calTasaSobretasa = null;
    BigDecimal calTasaBruta = null;
    BigDecimal calTasaNeta = null;
    BigDecimal calTasaAbsoluta = null;
    BigDecimal calPjeIsr = null;
    String calPeriodicidadMeses = null;
    BigDecimal calPeriodicidadDias = null;
    BigDecimal calPlazo = null;
    BigDecimal calImpValNominal = null;
    BigDecimal calImpValNomAdic = null;
    BigDecimal calImpValNomTot = null;
    BigDecimal calImpAmortizacion = null;
    BigDecimal calImpIntereses = null;
    BigDecimal calImpNumTitulos = null;
    BigDecimal calImpTipoCambInicio = null;
    BigDecimal calImpTipoCambFin = null;
    BigDecimal calImpTipoUdi = null;
    BigDecimal calImpAdicInflacion = null;
    BigDecimal calAnoPago = null;
    BigDecimal calMesPago = null;
    BigDecimal calDiaPago = null;
    BigDecimal calNumFormula = null;
    BigDecimal calTipoCalculo = null;
    String calEstadoCalculo = null;
    BigDecimal calCveInflacion = null;
    BigDecimal calValNomTitulos = null;
    BigDecimal calTasaTiie = null;
    BigDecimal calAmortConv = null;
    BigDecimal calInteresesConv = null;
    BigDecimal calVnaConv = null;
    BigDecimal calVnxt = null;
    BigDecimal calAnoAltaReg = null;
    BigDecimal calMesAltaReg = null;
    BigDecimal calDiaAltaReg = null;
    BigDecimal calAnoUltMod = null;
    BigDecimal calMesUltMod = null;
    BigDecimal calDiaUltMod = null;
    String calCveStCalculoe = null;
    BigDecimal calInteresesCap = null;
    BigDecimal calInteresesPer = null;
    BigDecimal calAmortExt = null;

    public Calculoe() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCalNumPrograma(BigDecimal calNumPrograma) {
        this.calNumPrograma = calNumPrograma;
    }

    public BigDecimal getCalNumPrograma() {
        return this.calNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCalNumEmision(BigDecimal calNumEmision) {
        this.calNumEmision = calNumEmision;
    }

    public BigDecimal getCalNumEmision() {
        return this.calNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCalNumSecCalc(BigDecimal calNumSecCalc) {
        this.calNumSecCalc = calNumSecCalc;
    }

    public BigDecimal getCalNumSecCalc() {
        return this.calNumSecCalc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCalNumSecInter(BigDecimal calNumSecInter) {
        this.calNumSecInter = calNumSecInter;
    }

    public BigDecimal getCalNumSecInter() {
        return this.calNumSecInter;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoIniPeriodo(BigDecimal calAnoIniPeriodo) {
        this.calAnoIniPeriodo = calAnoIniPeriodo;
    }

    public BigDecimal getCalAnoIniPeriodo() {
        return this.calAnoIniPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesIniPeriodo(BigDecimal calMesIniPeriodo) {
        this.calMesIniPeriodo = calMesIniPeriodo;
    }

    public BigDecimal getCalMesIniPeriodo() {
        return this.calMesIniPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaIniPeriodo(BigDecimal calDiaIniPeriodo) {
        this.calDiaIniPeriodo = calDiaIniPeriodo;
    }

    public BigDecimal getCalDiaIniPeriodo() {
        return this.calDiaIniPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoFinPeriodo(BigDecimal calAnoFinPeriodo) {
        this.calAnoFinPeriodo = calAnoFinPeriodo;
    }

    public BigDecimal getCalAnoFinPeriodo() {
        return this.calAnoFinPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesFinPeriodo(BigDecimal calMesFinPeriodo) {
        this.calMesFinPeriodo = calMesFinPeriodo;
    }

    public BigDecimal getCalMesFinPeriodo() {
        return this.calMesFinPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaFinPeriodo(BigDecimal calDiaFinPeriodo) {
        this.calDiaFinPeriodo = calDiaFinPeriodo;
    }

    public BigDecimal getCalDiaFinPeriodo() {
        return this.calDiaFinPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoRealPeriodo(BigDecimal calAnoRealPeriodo) {
        this.calAnoRealPeriodo = calAnoRealPeriodo;
    }

    public BigDecimal getCalAnoRealPeriodo() {
        return this.calAnoRealPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesRealPeriodo(BigDecimal calMesRealPeriodo) {
        this.calMesRealPeriodo = calMesRealPeriodo;
    }

    public BigDecimal getCalMesRealPeriodo() {
        return this.calMesRealPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaRealPeriodo(BigDecimal calDiaRealPeriodo) {
        this.calDiaRealPeriodo = calDiaRealPeriodo;
    }

    public BigDecimal getCalDiaRealPeriodo() {
        return this.calDiaRealPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalCveInstrumento(String calCveInstrumento) {
        this.calCveInstrumento = calCveInstrumento;
    }

    public String getCalCveInstrumento() {
        return this.calCveInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setCalTasaAplicada(BigDecimal calTasaAplicada) {
        this.calTasaAplicada = calTasaAplicada;
    }

    public BigDecimal getCalTasaAplicada() {
        return this.calTasaAplicada;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setCalTasaEquivalente(BigDecimal calTasaEquivalente) {
        this.calTasaEquivalente = calTasaEquivalente;
    }

    public BigDecimal getCalTasaEquivalente() {
        return this.calTasaEquivalente;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setCalTasaSobretasa(BigDecimal calTasaSobretasa) {
        this.calTasaSobretasa = calTasaSobretasa;
    }

    public BigDecimal getCalTasaSobretasa() {
        return this.calTasaSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setCalTasaBruta(BigDecimal calTasaBruta) {
        this.calTasaBruta = calTasaBruta;
    }

    public BigDecimal getCalTasaBruta() {
        return this.calTasaBruta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setCalTasaNeta(BigDecimal calTasaNeta) {
        this.calTasaNeta = calTasaNeta;
    }

    public BigDecimal getCalTasaNeta() {
        return this.calTasaNeta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setCalTasaAbsoluta(BigDecimal calTasaAbsoluta) {
        this.calTasaAbsoluta = calTasaAbsoluta;
    }

    public BigDecimal getCalTasaAbsoluta() {
        return this.calTasaAbsoluta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setCalPjeIsr(BigDecimal calPjeIsr) {
        this.calPjeIsr = calPjeIsr;
    }

    public BigDecimal getCalPjeIsr() {
        return this.calPjeIsr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalPeriodicidadMeses(String calPeriodicidadMeses) {
        this.calPeriodicidadMeses = calPeriodicidadMeses;
    }

    public String getCalPeriodicidadMeses() {
        return this.calPeriodicidadMeses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setCalPeriodicidadDias(BigDecimal calPeriodicidadDias) {
        this.calPeriodicidadDias = calPeriodicidadDias;
    }

    public BigDecimal getCalPeriodicidadDias() {
        return this.calPeriodicidadDias;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalPlazo(BigDecimal calPlazo) {
        this.calPlazo = calPlazo;
    }

    public BigDecimal getCalPlazo() {
        return this.calPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalImpValNominal(BigDecimal calImpValNominal) {
        this.calImpValNominal = calImpValNominal;
    }

    public BigDecimal getCalImpValNominal() {
        return this.calImpValNominal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalImpValNomAdic(BigDecimal calImpValNomAdic) {
        this.calImpValNomAdic = calImpValNomAdic;
    }

    public BigDecimal getCalImpValNomAdic() {
        return this.calImpValNomAdic;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalImpValNomTot(BigDecimal calImpValNomTot) {
        this.calImpValNomTot = calImpValNomTot;
    }

    public BigDecimal getCalImpValNomTot() {
        return this.calImpValNomTot;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalImpAmortizacion(BigDecimal calImpAmortizacion) {
        this.calImpAmortizacion = calImpAmortizacion;
    }

    public BigDecimal getCalImpAmortizacion() {
        return this.calImpAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalImpIntereses(BigDecimal calImpIntereses) {
        this.calImpIntereses = calImpIntereses;
    }

    public BigDecimal getCalImpIntereses() {
        return this.calImpIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalImpNumTitulos(BigDecimal calImpNumTitulos) {
        this.calImpNumTitulos = calImpNumTitulos;
    }

    public BigDecimal getCalImpNumTitulos() {
        return this.calImpNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalImpTipoCambInicio(BigDecimal calImpTipoCambInicio) {
        this.calImpTipoCambInicio = calImpTipoCambInicio;
    }

    public BigDecimal getCalImpTipoCambInicio() {
        return this.calImpTipoCambInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalImpTipoCambFin(BigDecimal calImpTipoCambFin) {
        this.calImpTipoCambFin = calImpTipoCambFin;
    }

    public BigDecimal getCalImpTipoCambFin() {
        return this.calImpTipoCambFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setCalImpTipoUdi(BigDecimal calImpTipoUdi) {
        this.calImpTipoUdi = calImpTipoUdi;
    }

    public BigDecimal getCalImpTipoUdi() {
        return this.calImpTipoUdi;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalImpAdicInflacion(BigDecimal calImpAdicInflacion) {
        this.calImpAdicInflacion = calImpAdicInflacion;
    }

    public BigDecimal getCalImpAdicInflacion() {
        return this.calImpAdicInflacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoPago(BigDecimal calAnoPago) {
        this.calAnoPago = calAnoPago;
    }

    public BigDecimal getCalAnoPago() {
        return this.calAnoPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesPago(BigDecimal calMesPago) {
        this.calMesPago = calMesPago;
    }

    public BigDecimal getCalMesPago() {
        return this.calMesPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaPago(BigDecimal calDiaPago) {
        this.calDiaPago = calDiaPago;
    }

    public BigDecimal getCalDiaPago() {
        return this.calDiaPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCalNumFormula(BigDecimal calNumFormula) {
        this.calNumFormula = calNumFormula;
    }

    public BigDecimal getCalNumFormula() {
        return this.calNumFormula;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalTipoCalculo(BigDecimal calTipoCalculo) {
        this.calTipoCalculo = calTipoCalculo;
    }

    public BigDecimal getCalTipoCalculo() {
        return this.calTipoCalculo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalEstadoCalculo(String calEstadoCalculo) {
        this.calEstadoCalculo = calEstadoCalculo;
    }

    public String getCalEstadoCalculo() {
        return this.calEstadoCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalCveInflacion(BigDecimal calCveInflacion) {
        this.calCveInflacion = calCveInflacion;
    }

    public BigDecimal getCalCveInflacion() {
        return this.calCveInflacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setCalValNomTitulos(BigDecimal calValNomTitulos) {
        this.calValNomTitulos = calValNomTitulos;
    }

    public BigDecimal getCalValNomTitulos() {
        return this.calValNomTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setCalTasaTiie(BigDecimal calTasaTiie) {
        this.calTasaTiie = calTasaTiie;
    }

    public BigDecimal getCalTasaTiie() {
        return this.calTasaTiie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalAmortConv(BigDecimal calAmortConv) {
        this.calAmortConv = calAmortConv;
    }

    public BigDecimal getCalAmortConv() {
        return this.calAmortConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalInteresesConv(BigDecimal calInteresesConv) {
        this.calInteresesConv = calInteresesConv;
    }

    public BigDecimal getCalInteresesConv() {
        return this.calInteresesConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalVnaConv(BigDecimal calVnaConv) {
        this.calVnaConv = calVnaConv;
    }

    public BigDecimal getCalVnaConv() {
        return this.calVnaConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalVnxt(BigDecimal calVnxt) {
        this.calVnxt = calVnxt;
    }

    public BigDecimal getCalVnxt() {
        return this.calVnxt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoAltaReg(BigDecimal calAnoAltaReg) {
        this.calAnoAltaReg = calAnoAltaReg;
    }

    public BigDecimal getCalAnoAltaReg() {
        return this.calAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesAltaReg(BigDecimal calMesAltaReg) {
        this.calMesAltaReg = calMesAltaReg;
    }

    public BigDecimal getCalMesAltaReg() {
        return this.calMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaAltaReg(BigDecimal calDiaAltaReg) {
        this.calDiaAltaReg = calDiaAltaReg;
    }

    public BigDecimal getCalDiaAltaReg() {
        return this.calDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoUltMod(BigDecimal calAnoUltMod) {
        this.calAnoUltMod = calAnoUltMod;
    }

    public BigDecimal getCalAnoUltMod() {
        return this.calAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesUltMod(BigDecimal calMesUltMod) {
        this.calMesUltMod = calMesUltMod;
    }

    public BigDecimal getCalMesUltMod() {
        return this.calMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaUltMod(BigDecimal calDiaUltMod) {
        this.calDiaUltMod = calDiaUltMod;
    }

    public BigDecimal getCalDiaUltMod() {
        return this.calDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalCveStCalculoe(String calCveStCalculoe) {
        this.calCveStCalculoe = calCveStCalculoe;
    }

    public String getCalCveStCalculoe() {
        return this.calCveStCalculoe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalInteresesCap(BigDecimal calInteresesCap) {
        this.calInteresesCap = calInteresesCap;
    }

    public BigDecimal getCalInteresesCap() {
        return this.calInteresesCap;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalInteresesPer(BigDecimal calInteresesPer) {
        this.calInteresesPer = calInteresesPer;
    }

    public BigDecimal getCalInteresesPer() {
        return this.calInteresesPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCalAmortExt(BigDecimal calAmortExt) {
        this.calAmortExt = calAmortExt;
    }

    public BigDecimal getCalAmortExt() {
        return this.calAmortExt;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CALCULOE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCalNumPrograma() != null && this.getCalNumPrograma().longValue() == -999) {
            conditions += " AND CAL_NUM_PROGRAMA IS NULL";
        } else if (this.getCalNumPrograma() != null) {
            conditions += " AND CAL_NUM_PROGRAMA = ?";
            values.add(this.getCalNumPrograma());
        }

        if (this.getCalNumEmision() != null && this.getCalNumEmision().longValue() == -999) {
            conditions += " AND CAL_NUM_EMISION IS NULL";
        } else if (this.getCalNumEmision() != null) {
            conditions += " AND CAL_NUM_EMISION = ?";
            values.add(this.getCalNumEmision());
        }

        if (this.getCalNumSecCalc() != null && this.getCalNumSecCalc().longValue() == -999) {
            conditions += " AND CAL_NUM_SEC_CALC IS NULL";
        } else if (this.getCalNumSecCalc() != null) {
            conditions += " AND CAL_NUM_SEC_CALC = ?";
            values.add(this.getCalNumSecCalc());
        }

        if (this.getCalNumSecInter() != null && this.getCalNumSecInter().longValue() == -999) {
            conditions += " AND CAL_NUM_SEC_INTER IS NULL";
        } else if (this.getCalNumSecInter() != null) {
            conditions += " AND CAL_NUM_SEC_INTER = ?";
            values.add(this.getCalNumSecInter());
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
        String sql = "SELECT * FROM CALCULOE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCalNumPrograma() != null && this.getCalNumPrograma().longValue() == -999) {
            conditions += " AND CAL_NUM_PROGRAMA IS NULL";
        } else if (this.getCalNumPrograma() != null) {
            conditions += " AND CAL_NUM_PROGRAMA = ?";
            values.add(this.getCalNumPrograma());
        }

        if (this.getCalNumEmision() != null && this.getCalNumEmision().longValue() == -999) {
            conditions += " AND CAL_NUM_EMISION IS NULL";
        } else if (this.getCalNumEmision() != null) {
            conditions += " AND CAL_NUM_EMISION = ?";
            values.add(this.getCalNumEmision());
        }

        if (this.getCalNumSecCalc() != null && this.getCalNumSecCalc().longValue() == -999) {
            conditions += " AND CAL_NUM_SEC_CALC IS NULL";
        } else if (this.getCalNumSecCalc() != null) {
            conditions += " AND CAL_NUM_SEC_CALC = ?";
            values.add(this.getCalNumSecCalc());
        }

        if (this.getCalNumSecInter() != null && this.getCalNumSecInter().longValue() == -999) {
            conditions += " AND CAL_NUM_SEC_INTER IS NULL";
        } else if (this.getCalNumSecInter() != null) {
            conditions += " AND CAL_NUM_SEC_INTER = ?";
            values.add(this.getCalNumSecInter());
        }

        if (this.getCalAnoIniPeriodo() != null && this.getCalAnoIniPeriodo().longValue() == -999) {
            conditions += " AND CAL_ANO_INI_PERIODO IS NULL";
        } else if (this.getCalAnoIniPeriodo() != null) {
            conditions += " AND CAL_ANO_INI_PERIODO = ?";
            values.add(this.getCalAnoIniPeriodo());
        }

        if (this.getCalMesIniPeriodo() != null && this.getCalMesIniPeriodo().longValue() == -999) {
            conditions += " AND CAL_MES_INI_PERIODO IS NULL";
        } else if (this.getCalMesIniPeriodo() != null) {
            conditions += " AND CAL_MES_INI_PERIODO = ?";
            values.add(this.getCalMesIniPeriodo());
        }

        if (this.getCalDiaIniPeriodo() != null && this.getCalDiaIniPeriodo().longValue() == -999) {
            conditions += " AND CAL_DIA_INI_PERIODO IS NULL";
        } else if (this.getCalDiaIniPeriodo() != null) {
            conditions += " AND CAL_DIA_INI_PERIODO = ?";
            values.add(this.getCalDiaIniPeriodo());
        }

        if (this.getCalAnoFinPeriodo() != null && this.getCalAnoFinPeriodo().longValue() == -999) {
            conditions += " AND CAL_ANO_FIN_PERIODO IS NULL";
        } else if (this.getCalAnoFinPeriodo() != null) {
            conditions += " AND CAL_ANO_FIN_PERIODO = ?";
            values.add(this.getCalAnoFinPeriodo());
        }

        if (this.getCalMesFinPeriodo() != null && this.getCalMesFinPeriodo().longValue() == -999) {
            conditions += " AND CAL_MES_FIN_PERIODO IS NULL";
        } else if (this.getCalMesFinPeriodo() != null) {
            conditions += " AND CAL_MES_FIN_PERIODO = ?";
            values.add(this.getCalMesFinPeriodo());
        }

        if (this.getCalDiaFinPeriodo() != null && this.getCalDiaFinPeriodo().longValue() == -999) {
            conditions += " AND CAL_DIA_FIN_PERIODO IS NULL";
        } else if (this.getCalDiaFinPeriodo() != null) {
            conditions += " AND CAL_DIA_FIN_PERIODO = ?";
            values.add(this.getCalDiaFinPeriodo());
        }

        if (this.getCalAnoRealPeriodo() != null && this.getCalAnoRealPeriodo().longValue() == -999) {
            conditions += " AND CAL_ANO_REAL_PERIODO IS NULL";
        } else if (this.getCalAnoRealPeriodo() != null) {
            conditions += " AND CAL_ANO_REAL_PERIODO = ?";
            values.add(this.getCalAnoRealPeriodo());
        }

        if (this.getCalMesRealPeriodo() != null && this.getCalMesRealPeriodo().longValue() == -999) {
            conditions += " AND CAL_MES_REAL_PERIODO IS NULL";
        } else if (this.getCalMesRealPeriodo() != null) {
            conditions += " AND CAL_MES_REAL_PERIODO = ?";
            values.add(this.getCalMesRealPeriodo());
        }

        if (this.getCalDiaRealPeriodo() != null && this.getCalDiaRealPeriodo().longValue() == -999) {
            conditions += " AND CAL_DIA_REAL_PERIODO IS NULL";
        } else if (this.getCalDiaRealPeriodo() != null) {
            conditions += " AND CAL_DIA_REAL_PERIODO = ?";
            values.add(this.getCalDiaRealPeriodo());
        }

        if (this.getCalCveInstrumento() != null && "null".equals(this.getCalCveInstrumento())) {
            conditions += " AND CAL_CVE_INSTRUMENTO IS NULL";
        } else if (this.getCalCveInstrumento() != null) {
            conditions += " AND CAL_CVE_INSTRUMENTO = ?";
            values.add(this.getCalCveInstrumento());
        }

        if (this.getCalTasaAplicada() != null && this.getCalTasaAplicada().longValue() == -999) {
            conditions += " AND CAL_TASA_APLICADA IS NULL";
        } else if (this.getCalTasaAplicada() != null) {
            conditions += " AND CAL_TASA_APLICADA = ?";
            values.add(this.getCalTasaAplicada());
        }

        if (this.getCalTasaEquivalente() != null && this.getCalTasaEquivalente().longValue() == -999) {
            conditions += " AND CAL_TASA_EQUIVALENTE IS NULL";
        } else if (this.getCalTasaEquivalente() != null) {
            conditions += " AND CAL_TASA_EQUIVALENTE = ?";
            values.add(this.getCalTasaEquivalente());
        }

        if (this.getCalTasaSobretasa() != null && this.getCalTasaSobretasa().longValue() == -999) {
            conditions += " AND CAL_TASA_SOBRETASA IS NULL";
        } else if (this.getCalTasaSobretasa() != null) {
            conditions += " AND CAL_TASA_SOBRETASA = ?";
            values.add(this.getCalTasaSobretasa());
        }

        if (this.getCalTasaBruta() != null && this.getCalTasaBruta().longValue() == -999) {
            conditions += " AND CAL_TASA_BRUTA IS NULL";
        } else if (this.getCalTasaBruta() != null) {
            conditions += " AND CAL_TASA_BRUTA = ?";
            values.add(this.getCalTasaBruta());
        }

        if (this.getCalTasaNeta() != null && this.getCalTasaNeta().longValue() == -999) {
            conditions += " AND CAL_TASA_NETA IS NULL";
        } else if (this.getCalTasaNeta() != null) {
            conditions += " AND CAL_TASA_NETA = ?";
            values.add(this.getCalTasaNeta());
        }

        if (this.getCalTasaAbsoluta() != null && this.getCalTasaAbsoluta().longValue() == -999) {
            conditions += " AND CAL_TASA_ABSOLUTA IS NULL";
        } else if (this.getCalTasaAbsoluta() != null) {
            conditions += " AND CAL_TASA_ABSOLUTA = ?";
            values.add(this.getCalTasaAbsoluta());
        }

        if (this.getCalPjeIsr() != null && this.getCalPjeIsr().longValue() == -999) {
            conditions += " AND CAL_PJE_ISR IS NULL";
        } else if (this.getCalPjeIsr() != null) {
            conditions += " AND CAL_PJE_ISR = ?";
            values.add(this.getCalPjeIsr());
        }

        if (this.getCalPeriodicidadMeses() != null && "null".equals(this.getCalPeriodicidadMeses())) {
            conditions += " AND CAL_PERIODICIDAD_MESES IS NULL";
        } else if (this.getCalPeriodicidadMeses() != null) {
            conditions += " AND CAL_PERIODICIDAD_MESES = ?";
            values.add(this.getCalPeriodicidadMeses());
        }

        if (this.getCalPeriodicidadDias() != null && this.getCalPeriodicidadDias().longValue() == -999) {
            conditions += " AND CAL_PERIODICIDAD_DIAS IS NULL";
        } else if (this.getCalPeriodicidadDias() != null) {
            conditions += " AND CAL_PERIODICIDAD_DIAS = ?";
            values.add(this.getCalPeriodicidadDias());
        }

        if (this.getCalPlazo() != null && this.getCalPlazo().longValue() == -999) {
            conditions += " AND CAL_PLAZO IS NULL";
        } else if (this.getCalPlazo() != null) {
            conditions += " AND CAL_PLAZO = ?";
            values.add(this.getCalPlazo());
        }

        if (this.getCalImpValNominal() != null && this.getCalImpValNominal().longValue() == -999) {
            conditions += " AND CAL_IMP_VAL_NOMINAL IS NULL";
        } else if (this.getCalImpValNominal() != null) {
            conditions += " AND CAL_IMP_VAL_NOMINAL = ?";
            values.add(this.getCalImpValNominal());
        }

        if (this.getCalImpValNomAdic() != null && this.getCalImpValNomAdic().longValue() == -999) {
            conditions += " AND CAL_IMP_VAL_NOM_ADIC IS NULL";
        } else if (this.getCalImpValNomAdic() != null) {
            conditions += " AND CAL_IMP_VAL_NOM_ADIC = ?";
            values.add(this.getCalImpValNomAdic());
        }

        if (this.getCalImpValNomTot() != null && this.getCalImpValNomTot().longValue() == -999) {
            conditions += " AND CAL_IMP_VAL_NOM_TOT IS NULL";
        } else if (this.getCalImpValNomTot() != null) {
            conditions += " AND CAL_IMP_VAL_NOM_TOT = ?";
            values.add(this.getCalImpValNomTot());
        }

        if (this.getCalImpAmortizacion() != null && this.getCalImpAmortizacion().longValue() == -999) {
            conditions += " AND CAL_IMP_AMORTIZACION IS NULL";
        } else if (this.getCalImpAmortizacion() != null) {
            conditions += " AND CAL_IMP_AMORTIZACION = ?";
            values.add(this.getCalImpAmortizacion());
        }

        if (this.getCalImpIntereses() != null && this.getCalImpIntereses().longValue() == -999) {
            conditions += " AND CAL_IMP_INTERESES IS NULL";
        } else if (this.getCalImpIntereses() != null) {
            conditions += " AND CAL_IMP_INTERESES = ?";
            values.add(this.getCalImpIntereses());
        }

        if (this.getCalImpNumTitulos() != null && this.getCalImpNumTitulos().longValue() == -999) {
            conditions += " AND CAL_IMP_NUM_TITULOS IS NULL";
        } else if (this.getCalImpNumTitulos() != null) {
            conditions += " AND CAL_IMP_NUM_TITULOS = ?";
            values.add(this.getCalImpNumTitulos());
        }

        if (this.getCalImpTipoCambInicio() != null && this.getCalImpTipoCambInicio().longValue() == -999) {
            conditions += " AND CAL_IMP_TIPO_CAMB_INICIO IS NULL";
        } else if (this.getCalImpTipoCambInicio() != null) {
            conditions += " AND CAL_IMP_TIPO_CAMB_INICIO = ?";
            values.add(this.getCalImpTipoCambInicio());
        }

        if (this.getCalImpTipoCambFin() != null && this.getCalImpTipoCambFin().longValue() == -999) {
            conditions += " AND CAL_IMP_TIPO_CAMB_FIN IS NULL";
        } else if (this.getCalImpTipoCambFin() != null) {
            conditions += " AND CAL_IMP_TIPO_CAMB_FIN = ?";
            values.add(this.getCalImpTipoCambFin());
        }

        if (this.getCalImpTipoUdi() != null && this.getCalImpTipoUdi().longValue() == -999) {
            conditions += " AND CAL_IMP_TIPO_UDI IS NULL";
        } else if (this.getCalImpTipoUdi() != null) {
            conditions += " AND CAL_IMP_TIPO_UDI = ?";
            values.add(this.getCalImpTipoUdi());
        }

        if (this.getCalImpAdicInflacion() != null && this.getCalImpAdicInflacion().longValue() == -999) {
            conditions += " AND CAL_IMP_ADIC_INFLACION IS NULL";
        } else if (this.getCalImpAdicInflacion() != null) {
            conditions += " AND CAL_IMP_ADIC_INFLACION = ?";
            values.add(this.getCalImpAdicInflacion());
        }

        if (this.getCalAnoPago() != null && this.getCalAnoPago().longValue() == -999) {
            conditions += " AND CAL_ANO_PAGO IS NULL";
        } else if (this.getCalAnoPago() != null) {
            conditions += " AND CAL_ANO_PAGO = ?";
            values.add(this.getCalAnoPago());
        }

        if (this.getCalMesPago() != null && this.getCalMesPago().longValue() == -999) {
            conditions += " AND CAL_MES_PAGO IS NULL";
        } else if (this.getCalMesPago() != null) {
            conditions += " AND CAL_MES_PAGO = ?";
            values.add(this.getCalMesPago());
        }

        if (this.getCalDiaPago() != null && this.getCalDiaPago().longValue() == -999) {
            conditions += " AND CAL_DIA_PAGO IS NULL";
        } else if (this.getCalDiaPago() != null) {
            conditions += " AND CAL_DIA_PAGO = ?";
            values.add(this.getCalDiaPago());
        }

        if (this.getCalNumFormula() != null && this.getCalNumFormula().longValue() == -999) {
            conditions += " AND CAL_NUM_FORMULA IS NULL";
        } else if (this.getCalNumFormula() != null) {
            conditions += " AND CAL_NUM_FORMULA = ?";
            values.add(this.getCalNumFormula());
        }

        if (this.getCalTipoCalculo() != null && this.getCalTipoCalculo().longValue() == -999) {
            conditions += " AND CAL_TIPO_CALCULO IS NULL";
        } else if (this.getCalTipoCalculo() != null) {
            conditions += " AND CAL_TIPO_CALCULO = ?";
            values.add(this.getCalTipoCalculo());
        }

        if (this.getCalEstadoCalculo() != null && "null".equals(this.getCalEstadoCalculo())) {
            conditions += " AND CAL_ESTADO_CALCULO IS NULL";
        } else if (this.getCalEstadoCalculo() != null) {
            conditions += " AND CAL_ESTADO_CALCULO = ?";
            values.add(this.getCalEstadoCalculo());
        }

        if (this.getCalCveInflacion() != null && this.getCalCveInflacion().longValue() == -999) {
            conditions += " AND CAL_CVE_INFLACION IS NULL";
        } else if (this.getCalCveInflacion() != null) {
            conditions += " AND CAL_CVE_INFLACION = ?";
            values.add(this.getCalCveInflacion());
        }

        if (this.getCalValNomTitulos() != null && this.getCalValNomTitulos().longValue() == -999) {
            conditions += " AND CAL_VAL_NOM_TITULOS IS NULL";
        } else if (this.getCalValNomTitulos() != null) {
            conditions += " AND CAL_VAL_NOM_TITULOS = ?";
            values.add(this.getCalValNomTitulos());
        }

        if (this.getCalTasaTiie() != null && this.getCalTasaTiie().longValue() == -999) {
            conditions += " AND CAL_TASA_TIIE IS NULL";
        } else if (this.getCalTasaTiie() != null) {
            conditions += " AND CAL_TASA_TIIE = ?";
            values.add(this.getCalTasaTiie());
        }

        if (this.getCalAmortConv() != null && this.getCalAmortConv().longValue() == -999) {
            conditions += " AND CAL_AMORT_CONV IS NULL";
        } else if (this.getCalAmortConv() != null) {
            conditions += " AND CAL_AMORT_CONV = ?";
            values.add(this.getCalAmortConv());
        }

        if (this.getCalInteresesConv() != null && this.getCalInteresesConv().longValue() == -999) {
            conditions += " AND CAL_INTERESES_CONV IS NULL";
        } else if (this.getCalInteresesConv() != null) {
            conditions += " AND CAL_INTERESES_CONV = ?";
            values.add(this.getCalInteresesConv());
        }

        if (this.getCalVnaConv() != null && this.getCalVnaConv().longValue() == -999) {
            conditions += " AND CAL_VNA_CONV IS NULL";
        } else if (this.getCalVnaConv() != null) {
            conditions += " AND CAL_VNA_CONV = ?";
            values.add(this.getCalVnaConv());
        }

        if (this.getCalVnxt() != null && this.getCalVnxt().longValue() == -999) {
            conditions += " AND CAL_VNXT IS NULL";
        } else if (this.getCalVnxt() != null) {
            conditions += " AND CAL_VNXT = ?";
            values.add(this.getCalVnxt());
        }

        if (this.getCalAnoAltaReg() != null && this.getCalAnoAltaReg().longValue() == -999) {
            conditions += " AND CAL_ANO_ALTA_REG IS NULL";
        } else if (this.getCalAnoAltaReg() != null) {
            conditions += " AND CAL_ANO_ALTA_REG = ?";
            values.add(this.getCalAnoAltaReg());
        }

        if (this.getCalMesAltaReg() != null && this.getCalMesAltaReg().longValue() == -999) {
            conditions += " AND CAL_MES_ALTA_REG IS NULL";
        } else if (this.getCalMesAltaReg() != null) {
            conditions += " AND CAL_MES_ALTA_REG = ?";
            values.add(this.getCalMesAltaReg());
        }

        if (this.getCalDiaAltaReg() != null && this.getCalDiaAltaReg().longValue() == -999) {
            conditions += " AND CAL_DIA_ALTA_REG IS NULL";
        } else if (this.getCalDiaAltaReg() != null) {
            conditions += " AND CAL_DIA_ALTA_REG = ?";
            values.add(this.getCalDiaAltaReg());
        }

        if (this.getCalAnoUltMod() != null && this.getCalAnoUltMod().longValue() == -999) {
            conditions += " AND CAL_ANO_ULT_MOD IS NULL";
        } else if (this.getCalAnoUltMod() != null) {
            conditions += " AND CAL_ANO_ULT_MOD = ?";
            values.add(this.getCalAnoUltMod());
        }

        if (this.getCalMesUltMod() != null && this.getCalMesUltMod().longValue() == -999) {
            conditions += " AND CAL_MES_ULT_MOD IS NULL";
        } else if (this.getCalMesUltMod() != null) {
            conditions += " AND CAL_MES_ULT_MOD = ?";
            values.add(this.getCalMesUltMod());
        }

        if (this.getCalDiaUltMod() != null && this.getCalDiaUltMod().longValue() == -999) {
            conditions += " AND CAL_DIA_ULT_MOD IS NULL";
        } else if (this.getCalDiaUltMod() != null) {
            conditions += " AND CAL_DIA_ULT_MOD = ?";
            values.add(this.getCalDiaUltMod());
        }

        if (this.getCalCveStCalculoe() != null && "null".equals(this.getCalCveStCalculoe())) {
            conditions += " AND CAL_CVE_ST_CALCULOE IS NULL";
        } else if (this.getCalCveStCalculoe() != null) {
            conditions += " AND CAL_CVE_ST_CALCULOE = ?";
            values.add(this.getCalCveStCalculoe());
        }

        if (this.getCalInteresesCap() != null && this.getCalInteresesCap().longValue() == -999) {
            conditions += " AND CAL_INTERESES_CAP IS NULL";
        } else if (this.getCalInteresesCap() != null) {
            conditions += " AND CAL_INTERESES_CAP = ?";
            values.add(this.getCalInteresesCap());
        }

        if (this.getCalInteresesPer() != null && this.getCalInteresesPer().longValue() == -999) {
            conditions += " AND CAL_INTERESES_PER IS NULL";
        } else if (this.getCalInteresesPer() != null) {
            conditions += " AND CAL_INTERESES_PER = ?";
            values.add(this.getCalInteresesPer());
        }

        if (this.getCalAmortExt() != null && this.getCalAmortExt().longValue() == -999) {
            conditions += " AND CAL_AMORT_EXT IS NULL";
        } else if (this.getCalAmortExt() != null) {
            conditions += " AND CAL_AMORT_EXT = ?";
            values.add(this.getCalAmortExt());
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
        String sql = "UPDATE CALCULOE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CAL_NUM_PROGRAMA = ?";
        pkValues.add(this.getCalNumPrograma());
        conditions += " AND CAL_NUM_EMISION = ?";
        pkValues.add(this.getCalNumEmision());
        conditions += " AND CAL_NUM_SEC_CALC = ?";
        pkValues.add(this.getCalNumSecCalc());
        conditions += " AND CAL_NUM_SEC_INTER = ?";
        pkValues.add(this.getCalNumSecInter());
        fields += " CAL_ANO_INI_PERIODO = ?, ";
        values.add(this.getCalAnoIniPeriodo());
        fields += " CAL_MES_INI_PERIODO = ?, ";
        values.add(this.getCalMesIniPeriodo());
        fields += " CAL_DIA_INI_PERIODO = ?, ";
        values.add(this.getCalDiaIniPeriodo());
        fields += " CAL_ANO_FIN_PERIODO = ?, ";
        values.add(this.getCalAnoFinPeriodo());
        fields += " CAL_MES_FIN_PERIODO = ?, ";
        values.add(this.getCalMesFinPeriodo());
        fields += " CAL_DIA_FIN_PERIODO = ?, ";
        values.add(this.getCalDiaFinPeriodo());
        fields += " CAL_ANO_REAL_PERIODO = ?, ";
        values.add(this.getCalAnoRealPeriodo());
        fields += " CAL_MES_REAL_PERIODO = ?, ";
        values.add(this.getCalMesRealPeriodo());
        fields += " CAL_DIA_REAL_PERIODO = ?, ";
        values.add(this.getCalDiaRealPeriodo());
        fields += " CAL_CVE_INSTRUMENTO = ?, ";
        values.add(this.getCalCveInstrumento());
        fields += " CAL_TASA_APLICADA = ?, ";
        values.add(this.getCalTasaAplicada());
        fields += " CAL_TASA_EQUIVALENTE = ?, ";
        values.add(this.getCalTasaEquivalente());
        fields += " CAL_TASA_SOBRETASA = ?, ";
        values.add(this.getCalTasaSobretasa());
        fields += " CAL_TASA_BRUTA = ?, ";
        values.add(this.getCalTasaBruta());
        fields += " CAL_TASA_NETA = ?, ";
        values.add(this.getCalTasaNeta());
        fields += " CAL_TASA_ABSOLUTA = ?, ";
        values.add(this.getCalTasaAbsoluta());
        fields += " CAL_PJE_ISR = ?, ";
        values.add(this.getCalPjeIsr());
        fields += " CAL_PERIODICIDAD_MESES = ?, ";
        values.add(this.getCalPeriodicidadMeses());
        fields += " CAL_PERIODICIDAD_DIAS = ?, ";
        values.add(this.getCalPeriodicidadDias());
        fields += " CAL_PLAZO = ?, ";
        values.add(this.getCalPlazo());
        fields += " CAL_IMP_VAL_NOMINAL = ?, ";
        values.add(this.getCalImpValNominal());
        fields += " CAL_IMP_VAL_NOM_ADIC = ?, ";
        values.add(this.getCalImpValNomAdic());
        fields += " CAL_IMP_VAL_NOM_TOT = ?, ";
        values.add(this.getCalImpValNomTot());
        fields += " CAL_IMP_AMORTIZACION = ?, ";
        values.add(this.getCalImpAmortizacion());
        fields += " CAL_IMP_INTERESES = ?, ";
        values.add(this.getCalImpIntereses());
        fields += " CAL_IMP_NUM_TITULOS = ?, ";
        values.add(this.getCalImpNumTitulos());
        fields += " CAL_IMP_TIPO_CAMB_INICIO = ?, ";
        values.add(this.getCalImpTipoCambInicio());
        fields += " CAL_IMP_TIPO_CAMB_FIN = ?, ";
        values.add(this.getCalImpTipoCambFin());
        fields += " CAL_IMP_TIPO_UDI = ?, ";
        values.add(this.getCalImpTipoUdi());
        fields += " CAL_IMP_ADIC_INFLACION = ?, ";
        values.add(this.getCalImpAdicInflacion());
        fields += " CAL_ANO_PAGO = ?, ";
        values.add(this.getCalAnoPago());
        fields += " CAL_MES_PAGO = ?, ";
        values.add(this.getCalMesPago());
        fields += " CAL_DIA_PAGO = ?, ";
        values.add(this.getCalDiaPago());
        fields += " CAL_NUM_FORMULA = ?, ";
        values.add(this.getCalNumFormula());
        fields += " CAL_TIPO_CALCULO = ?, ";
        values.add(this.getCalTipoCalculo());
        fields += " CAL_ESTADO_CALCULO = ?, ";
        values.add(this.getCalEstadoCalculo());
        fields += " CAL_CVE_INFLACION = ?, ";
        values.add(this.getCalCveInflacion());
        fields += " CAL_VAL_NOM_TITULOS = ?, ";
        values.add(this.getCalValNomTitulos());
        fields += " CAL_TASA_TIIE = ?, ";
        values.add(this.getCalTasaTiie());
        fields += " CAL_AMORT_CONV = ?, ";
        values.add(this.getCalAmortConv());
        fields += " CAL_INTERESES_CONV = ?, ";
        values.add(this.getCalInteresesConv());
        fields += " CAL_VNA_CONV = ?, ";
        values.add(this.getCalVnaConv());
        fields += " CAL_VNXT = ?, ";
        values.add(this.getCalVnxt());
        fields += " CAL_ANO_ALTA_REG = ?, ";
        values.add(this.getCalAnoAltaReg());
        fields += " CAL_MES_ALTA_REG = ?, ";
        values.add(this.getCalMesAltaReg());
        fields += " CAL_DIA_ALTA_REG = ?, ";
        values.add(this.getCalDiaAltaReg());
        fields += " CAL_ANO_ULT_MOD = ?, ";
        values.add(this.getCalAnoUltMod());
        fields += " CAL_MES_ULT_MOD = ?, ";
        values.add(this.getCalMesUltMod());
        fields += " CAL_DIA_ULT_MOD = ?, ";
        values.add(this.getCalDiaUltMod());
        fields += " CAL_CVE_ST_CALCULOE = ?, ";
        values.add(this.getCalCveStCalculoe());
        fields += " CAL_INTERESES_CAP = ?, ";
        values.add(this.getCalInteresesCap());
        fields += " CAL_INTERESES_PER = ?, ";
        values.add(this.getCalInteresesPer());
        fields += " CAL_AMORT_EXT = ?, ";
        values.add(this.getCalAmortExt());
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
        String sql = "INSERT INTO CALCULOE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CAL_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getCalNumPrograma());

        fields += ", CAL_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getCalNumEmision());

        fields += ", CAL_NUM_SEC_CALC";
        fieldValues += ", ?";
        values.add(this.getCalNumSecCalc());

        fields += ", CAL_NUM_SEC_INTER";
        fieldValues += ", ?";
        values.add(this.getCalNumSecInter());

        fields += ", CAL_ANO_INI_PERIODO";
        fieldValues += ", ?";
        values.add(this.getCalAnoIniPeriodo());

        fields += ", CAL_MES_INI_PERIODO";
        fieldValues += ", ?";
        values.add(this.getCalMesIniPeriodo());

        fields += ", CAL_DIA_INI_PERIODO";
        fieldValues += ", ?";
        values.add(this.getCalDiaIniPeriodo());

        fields += ", CAL_ANO_FIN_PERIODO";
        fieldValues += ", ?";
        values.add(this.getCalAnoFinPeriodo());

        fields += ", CAL_MES_FIN_PERIODO";
        fieldValues += ", ?";
        values.add(this.getCalMesFinPeriodo());

        fields += ", CAL_DIA_FIN_PERIODO";
        fieldValues += ", ?";
        values.add(this.getCalDiaFinPeriodo());

        fields += ", CAL_ANO_REAL_PERIODO";
        fieldValues += ", ?";
        values.add(this.getCalAnoRealPeriodo());

        fields += ", CAL_MES_REAL_PERIODO";
        fieldValues += ", ?";
        values.add(this.getCalMesRealPeriodo());

        fields += ", CAL_DIA_REAL_PERIODO";
        fieldValues += ", ?";
        values.add(this.getCalDiaRealPeriodo());

        fields += ", CAL_CVE_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getCalCveInstrumento());

        fields += ", CAL_TASA_APLICADA";
        fieldValues += ", ?";
        values.add(this.getCalTasaAplicada());

        fields += ", CAL_TASA_EQUIVALENTE";
        fieldValues += ", ?";
        values.add(this.getCalTasaEquivalente());

        fields += ", CAL_TASA_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getCalTasaSobretasa());

        fields += ", CAL_TASA_BRUTA";
        fieldValues += ", ?";
        values.add(this.getCalTasaBruta());

        fields += ", CAL_TASA_NETA";
        fieldValues += ", ?";
        values.add(this.getCalTasaNeta());

        fields += ", CAL_TASA_ABSOLUTA";
        fieldValues += ", ?";
        values.add(this.getCalTasaAbsoluta());

        fields += ", CAL_PJE_ISR";
        fieldValues += ", ?";
        values.add(this.getCalPjeIsr());

        fields += ", CAL_PERIODICIDAD_MESES";
        fieldValues += ", ?";
        values.add(this.getCalPeriodicidadMeses());

        fields += ", CAL_PERIODICIDAD_DIAS";
        fieldValues += ", ?";
        values.add(this.getCalPeriodicidadDias());

        fields += ", CAL_PLAZO";
        fieldValues += ", ?";
        values.add(this.getCalPlazo());

        fields += ", CAL_IMP_VAL_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getCalImpValNominal());

        fields += ", CAL_IMP_VAL_NOM_ADIC";
        fieldValues += ", ?";
        values.add(this.getCalImpValNomAdic());

        fields += ", CAL_IMP_VAL_NOM_TOT";
        fieldValues += ", ?";
        values.add(this.getCalImpValNomTot());

        fields += ", CAL_IMP_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getCalImpAmortizacion());

        fields += ", CAL_IMP_INTERESES";
        fieldValues += ", ?";
        values.add(this.getCalImpIntereses());

        fields += ", CAL_IMP_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getCalImpNumTitulos());

        fields += ", CAL_IMP_TIPO_CAMB_INICIO";
        fieldValues += ", ?";
        values.add(this.getCalImpTipoCambInicio());

        fields += ", CAL_IMP_TIPO_CAMB_FIN";
        fieldValues += ", ?";
        values.add(this.getCalImpTipoCambFin());

        fields += ", CAL_IMP_TIPO_UDI";
        fieldValues += ", ?";
        values.add(this.getCalImpTipoUdi());

        fields += ", CAL_IMP_ADIC_INFLACION";
        fieldValues += ", ?";
        values.add(this.getCalImpAdicInflacion());

        fields += ", CAL_ANO_PAGO";
        fieldValues += ", ?";
        values.add(this.getCalAnoPago());

        fields += ", CAL_MES_PAGO";
        fieldValues += ", ?";
        values.add(this.getCalMesPago());

        fields += ", CAL_DIA_PAGO";
        fieldValues += ", ?";
        values.add(this.getCalDiaPago());

        fields += ", CAL_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getCalNumFormula());

        fields += ", CAL_TIPO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getCalTipoCalculo());

        fields += ", CAL_ESTADO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getCalEstadoCalculo());

        fields += ", CAL_CVE_INFLACION";
        fieldValues += ", ?";
        values.add(this.getCalCveInflacion());

        fields += ", CAL_VAL_NOM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getCalValNomTitulos());

        fields += ", CAL_TASA_TIIE";
        fieldValues += ", ?";
        values.add(this.getCalTasaTiie());

        fields += ", CAL_AMORT_CONV";
        fieldValues += ", ?";
        values.add(this.getCalAmortConv());

        fields += ", CAL_INTERESES_CONV";
        fieldValues += ", ?";
        values.add(this.getCalInteresesConv());

        fields += ", CAL_VNA_CONV";
        fieldValues += ", ?";
        values.add(this.getCalVnaConv());

        fields += ", CAL_VNXT";
        fieldValues += ", ?";
        values.add(this.getCalVnxt());

        fields += ", CAL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCalAnoAltaReg());

        fields += ", CAL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCalMesAltaReg());

        fields += ", CAL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCalDiaAltaReg());

        fields += ", CAL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCalAnoUltMod());

        fields += ", CAL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCalMesUltMod());

        fields += ", CAL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCalDiaUltMod());

        fields += ", CAL_CVE_ST_CALCULOE";
        fieldValues += ", ?";
        values.add(this.getCalCveStCalculoe());

        fields += ", CAL_INTERESES_CAP";
        fieldValues += ", ?";
        values.add(this.getCalInteresesCap());

        fields += ", CAL_INTERESES_PER";
        fieldValues += ", ?";
        values.add(this.getCalInteresesPer());

        fields += ", CAL_AMORT_EXT";
        fieldValues += ", ?";
        values.add(this.getCalAmortExt());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CALCULOE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CAL_NUM_PROGRAMA = ?";
        values.add(this.getCalNumPrograma());
        conditions += " AND CAL_NUM_EMISION = ?";
        values.add(this.getCalNumEmision());
        conditions += " AND CAL_NUM_SEC_CALC = ?";
        values.add(this.getCalNumSecCalc());
        conditions += " AND CAL_NUM_SEC_INTER = ?";
        values.add(this.getCalNumSecInter());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Calculoe instance = (Calculoe) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCalNumPrograma().equals(instance.getCalNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getCalNumEmision().equals(instance.getCalNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCalNumSecCalc().equals(instance.getCalNumSecCalc()))
            equalObjects = false;
        if (equalObjects && !this.getCalNumSecInter().equals(instance.getCalNumSecInter()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoIniPeriodo().equals(instance.getCalAnoIniPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesIniPeriodo().equals(instance.getCalMesIniPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaIniPeriodo().equals(instance.getCalDiaIniPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoFinPeriodo().equals(instance.getCalAnoFinPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesFinPeriodo().equals(instance.getCalMesFinPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaFinPeriodo().equals(instance.getCalDiaFinPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoRealPeriodo().equals(instance.getCalAnoRealPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesRealPeriodo().equals(instance.getCalMesRealPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaRealPeriodo().equals(instance.getCalDiaRealPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getCalCveInstrumento().equals(instance.getCalCveInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getCalTasaAplicada().equals(instance.getCalTasaAplicada()))
            equalObjects = false;
        if (equalObjects && !this.getCalTasaEquivalente().equals(instance.getCalTasaEquivalente()))
            equalObjects = false;
        if (equalObjects && !this.getCalTasaSobretasa().equals(instance.getCalTasaSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getCalTasaBruta().equals(instance.getCalTasaBruta()))
            equalObjects = false;
        if (equalObjects && !this.getCalTasaNeta().equals(instance.getCalTasaNeta()))
            equalObjects = false;
        if (equalObjects && !this.getCalTasaAbsoluta().equals(instance.getCalTasaAbsoluta()))
            equalObjects = false;
        if (equalObjects && !this.getCalPjeIsr().equals(instance.getCalPjeIsr()))
            equalObjects = false;
        if (equalObjects && !this.getCalPeriodicidadMeses().equals(instance.getCalPeriodicidadMeses()))
            equalObjects = false;
        if (equalObjects && !this.getCalPeriodicidadDias().equals(instance.getCalPeriodicidadDias()))
            equalObjects = false;
        if (equalObjects && !this.getCalPlazo().equals(instance.getCalPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getCalImpValNominal().equals(instance.getCalImpValNominal()))
            equalObjects = false;
        if (equalObjects && !this.getCalImpValNomAdic().equals(instance.getCalImpValNomAdic()))
            equalObjects = false;
        if (equalObjects && !this.getCalImpValNomTot().equals(instance.getCalImpValNomTot()))
            equalObjects = false;
        if (equalObjects && !this.getCalImpAmortizacion().equals(instance.getCalImpAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getCalImpIntereses().equals(instance.getCalImpIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getCalImpNumTitulos().equals(instance.getCalImpNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getCalImpTipoCambInicio().equals(instance.getCalImpTipoCambInicio()))
            equalObjects = false;
        if (equalObjects && !this.getCalImpTipoCambFin().equals(instance.getCalImpTipoCambFin()))
            equalObjects = false;
        if (equalObjects && !this.getCalImpTipoUdi().equals(instance.getCalImpTipoUdi()))
            equalObjects = false;
        if (equalObjects && !this.getCalImpAdicInflacion().equals(instance.getCalImpAdicInflacion()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoPago().equals(instance.getCalAnoPago()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesPago().equals(instance.getCalMesPago()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaPago().equals(instance.getCalDiaPago()))
            equalObjects = false;
        if (equalObjects && !this.getCalNumFormula().equals(instance.getCalNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getCalTipoCalculo().equals(instance.getCalTipoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getCalEstadoCalculo().equals(instance.getCalEstadoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getCalCveInflacion().equals(instance.getCalCveInflacion()))
            equalObjects = false;
        if (equalObjects && !this.getCalValNomTitulos().equals(instance.getCalValNomTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getCalTasaTiie().equals(instance.getCalTasaTiie()))
            equalObjects = false;
        if (equalObjects && !this.getCalAmortConv().equals(instance.getCalAmortConv()))
            equalObjects = false;
        if (equalObjects && !this.getCalInteresesConv().equals(instance.getCalInteresesConv()))
            equalObjects = false;
        if (equalObjects && !this.getCalVnaConv().equals(instance.getCalVnaConv()))
            equalObjects = false;
        if (equalObjects && !this.getCalVnxt().equals(instance.getCalVnxt()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoAltaReg().equals(instance.getCalAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesAltaReg().equals(instance.getCalMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaAltaReg().equals(instance.getCalDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoUltMod().equals(instance.getCalAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesUltMod().equals(instance.getCalMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaUltMod().equals(instance.getCalDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCalCveStCalculoe().equals(instance.getCalCveStCalculoe()))
            equalObjects = false;
        if (equalObjects && !this.getCalInteresesCap().equals(instance.getCalInteresesCap()))
            equalObjects = false;
        if (equalObjects && !this.getCalInteresesPer().equals(instance.getCalInteresesPer()))
            equalObjects = false;
        if (equalObjects && !this.getCalAmortExt().equals(instance.getCalAmortExt()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Calculoe result = new Calculoe();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCalNumPrograma((BigDecimal) objectData.getData("CAL_NUM_PROGRAMA"));
        result.setCalNumEmision((BigDecimal) objectData.getData("CAL_NUM_EMISION"));
        result.setCalNumSecCalc((BigDecimal) objectData.getData("CAL_NUM_SEC_CALC"));
        result.setCalNumSecInter((BigDecimal) objectData.getData("CAL_NUM_SEC_INTER"));
        result.setCalAnoIniPeriodo((BigDecimal) objectData.getData("CAL_ANO_INI_PERIODO"));
        result.setCalMesIniPeriodo((BigDecimal) objectData.getData("CAL_MES_INI_PERIODO"));
        result.setCalDiaIniPeriodo((BigDecimal) objectData.getData("CAL_DIA_INI_PERIODO"));
        result.setCalAnoFinPeriodo((BigDecimal) objectData.getData("CAL_ANO_FIN_PERIODO"));
        result.setCalMesFinPeriodo((BigDecimal) objectData.getData("CAL_MES_FIN_PERIODO"));
        result.setCalDiaFinPeriodo((BigDecimal) objectData.getData("CAL_DIA_FIN_PERIODO"));
        result.setCalAnoRealPeriodo((BigDecimal) objectData.getData("CAL_ANO_REAL_PERIODO"));
        result.setCalMesRealPeriodo((BigDecimal) objectData.getData("CAL_MES_REAL_PERIODO"));
        result.setCalDiaRealPeriodo((BigDecimal) objectData.getData("CAL_DIA_REAL_PERIODO"));
        result.setCalCveInstrumento((String) objectData.getData("CAL_CVE_INSTRUMENTO"));
        result.setCalTasaAplicada((BigDecimal) objectData.getData("CAL_TASA_APLICADA"));
        result.setCalTasaEquivalente((BigDecimal) objectData.getData("CAL_TASA_EQUIVALENTE"));
        result.setCalTasaSobretasa((BigDecimal) objectData.getData("CAL_TASA_SOBRETASA"));
        result.setCalTasaBruta((BigDecimal) objectData.getData("CAL_TASA_BRUTA"));
        result.setCalTasaNeta((BigDecimal) objectData.getData("CAL_TASA_NETA"));
        result.setCalTasaAbsoluta((BigDecimal) objectData.getData("CAL_TASA_ABSOLUTA"));
        result.setCalPjeIsr((BigDecimal) objectData.getData("CAL_PJE_ISR"));
        result.setCalPeriodicidadMeses((String) objectData.getData("CAL_PERIODICIDAD_MESES"));
        result.setCalPeriodicidadDias((BigDecimal) objectData.getData("CAL_PERIODICIDAD_DIAS"));
        result.setCalPlazo((BigDecimal) objectData.getData("CAL_PLAZO"));
        result.setCalImpValNominal((BigDecimal) objectData.getData("CAL_IMP_VAL_NOMINAL"));
        result.setCalImpValNomAdic((BigDecimal) objectData.getData("CAL_IMP_VAL_NOM_ADIC"));
        result.setCalImpValNomTot((BigDecimal) objectData.getData("CAL_IMP_VAL_NOM_TOT"));
        result.setCalImpAmortizacion((BigDecimal) objectData.getData("CAL_IMP_AMORTIZACION"));
        result.setCalImpIntereses((BigDecimal) objectData.getData("CAL_IMP_INTERESES"));
        result.setCalImpNumTitulos((BigDecimal) objectData.getData("CAL_IMP_NUM_TITULOS"));
        result.setCalImpTipoCambInicio((BigDecimal) objectData.getData("CAL_IMP_TIPO_CAMB_INICIO"));
        result.setCalImpTipoCambFin((BigDecimal) objectData.getData("CAL_IMP_TIPO_CAMB_FIN"));
        result.setCalImpTipoUdi((BigDecimal) objectData.getData("CAL_IMP_TIPO_UDI"));
        result.setCalImpAdicInflacion((BigDecimal) objectData.getData("CAL_IMP_ADIC_INFLACION"));
        result.setCalAnoPago((BigDecimal) objectData.getData("CAL_ANO_PAGO"));
        result.setCalMesPago((BigDecimal) objectData.getData("CAL_MES_PAGO"));
        result.setCalDiaPago((BigDecimal) objectData.getData("CAL_DIA_PAGO"));
        result.setCalNumFormula((BigDecimal) objectData.getData("CAL_NUM_FORMULA"));
        result.setCalTipoCalculo((BigDecimal) objectData.getData("CAL_TIPO_CALCULO"));
        result.setCalEstadoCalculo((String) objectData.getData("CAL_ESTADO_CALCULO"));
        result.setCalCveInflacion((BigDecimal) objectData.getData("CAL_CVE_INFLACION"));
        result.setCalValNomTitulos((BigDecimal) objectData.getData("CAL_VAL_NOM_TITULOS"));
        result.setCalTasaTiie((BigDecimal) objectData.getData("CAL_TASA_TIIE"));
        result.setCalAmortConv((BigDecimal) objectData.getData("CAL_AMORT_CONV"));
        result.setCalInteresesConv((BigDecimal) objectData.getData("CAL_INTERESES_CONV"));
        result.setCalVnaConv((BigDecimal) objectData.getData("CAL_VNA_CONV"));
        result.setCalVnxt((BigDecimal) objectData.getData("CAL_VNXT"));
        result.setCalAnoAltaReg((BigDecimal) objectData.getData("CAL_ANO_ALTA_REG"));
        result.setCalMesAltaReg((BigDecimal) objectData.getData("CAL_MES_ALTA_REG"));
        result.setCalDiaAltaReg((BigDecimal) objectData.getData("CAL_DIA_ALTA_REG"));
        result.setCalAnoUltMod((BigDecimal) objectData.getData("CAL_ANO_ULT_MOD"));
        result.setCalMesUltMod((BigDecimal) objectData.getData("CAL_MES_ULT_MOD"));
        result.setCalDiaUltMod((BigDecimal) objectData.getData("CAL_DIA_ULT_MOD"));
        result.setCalCveStCalculoe((String) objectData.getData("CAL_CVE_ST_CALCULOE"));
        result.setCalInteresesCap((BigDecimal) objectData.getData("CAL_INTERESES_CAP"));
        result.setCalInteresesPer((BigDecimal) objectData.getData("CAL_INTERESES_PER"));
        result.setCalAmortExt((BigDecimal) objectData.getData("CAL_AMORT_EXT"));

        return result;

    }

}
