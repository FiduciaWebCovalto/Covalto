package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CALCULO_PK", columns = { "ECAL_ID_PROGRAMA", "ECAL_ID_FIDEICOMISO", "ECAL_ID_EMISION", "ECAL_ID_SEC_CALC", "ECAL_ID_SEC_INTER" },
            sequences = { "MANUAL" })
public class FCalculo extends DomainObject {

    BigDecimal ecalIdPrograma = null;
    BigDecimal ecalIdFideicomiso = null;
    BigDecimal ecalIdEmision = null;
    BigDecimal ecalIdSecCalc = null;
    BigDecimal ecalIdSecInter = null;
    String ecalFecIniPeriodo = null;
    String ecalFecFinPeriodo = null;
    String ecalFecRealPeriodo = null;
    String ecalFecPago = null;
    String ecalInstrumento = null;
    BigDecimal ecalNumFormula = null;
    BigDecimal ecalTasaAplicada = null;
    BigDecimal ecalTasaEquivalente = null;
    BigDecimal ecalTasaSobretasa = null;
    BigDecimal ecalTasaBruta = null;
    BigDecimal ecalTasaNeta = null;
    BigDecimal ecalTasaAbsoluta = null;
    BigDecimal ecalPjeIsr = null;
    String ecalPeriodicidadMeses = null;
    BigDecimal ecalPeriodicidadDias = null;
    BigDecimal ecalPlazo = null;
    BigDecimal ecalImpValNominal = null;
    BigDecimal ecalImpValNomAdic = null;
    BigDecimal ecalImpValNomTot = null;
    BigDecimal ecalImpAmortizacion = null;
    BigDecimal ecalImpIntereses = null;
    BigDecimal ecalImpNumTitulos = null;
    BigDecimal ecalImpTipoCambInicio = null;
    BigDecimal ecalImpTipoCambFin = null;
    BigDecimal ecalImpTipoUdi = null;
    BigDecimal ecalImpAdicInflacion = null;
    BigDecimal ecalTipoCalculo = null;
    String ecalEstadoCalculo = null;
    BigDecimal ecalCveInflacion = null;
    BigDecimal ecalValNomTitulos = null;
    BigDecimal ecalTasaTiie = null;
    BigDecimal ecalAmortConv = null;
    BigDecimal ecalInteresesConv = null;
    BigDecimal ecalVnaConv = null;
    BigDecimal ecalVnxt = null;
    BigDecimal ecalInteresesCap = null;
    BigDecimal ecalInteresesPer = null;
    BigDecimal ecalAmortExt = null;
    String ecalStCalculo = null;

    public FCalculo() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcalIdPrograma(BigDecimal ecalIdPrograma) {
        this.ecalIdPrograma = ecalIdPrograma;
    }

    public BigDecimal getEcalIdPrograma() {
        return this.ecalIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcalIdFideicomiso(BigDecimal ecalIdFideicomiso) {
        this.ecalIdFideicomiso = ecalIdFideicomiso;
    }

    public BigDecimal getEcalIdFideicomiso() {
        return this.ecalIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcalIdEmision(BigDecimal ecalIdEmision) {
        this.ecalIdEmision = ecalIdEmision;
    }

    public BigDecimal getEcalIdEmision() {
        return this.ecalIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcalIdSecCalc(BigDecimal ecalIdSecCalc) {
        this.ecalIdSecCalc = ecalIdSecCalc;
    }

    public BigDecimal getEcalIdSecCalc() {
        return this.ecalIdSecCalc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcalIdSecInter(BigDecimal ecalIdSecInter) {
        this.ecalIdSecInter = ecalIdSecInter;
    }

    public BigDecimal getEcalIdSecInter() {
        return this.ecalIdSecInter;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcalFecIniPeriodo(String ecalFecIniPeriodo) {
        this.ecalFecIniPeriodo = ecalFecIniPeriodo;
    }

    public String getEcalFecIniPeriodo() {
        return this.ecalFecIniPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcalFecFinPeriodo(String ecalFecFinPeriodo) {
        this.ecalFecFinPeriodo = ecalFecFinPeriodo;
    }

    public String getEcalFecFinPeriodo() {
        return this.ecalFecFinPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcalFecRealPeriodo(String ecalFecRealPeriodo) {
        this.ecalFecRealPeriodo = ecalFecRealPeriodo;
    }

    public String getEcalFecRealPeriodo() {
        return this.ecalFecRealPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEcalFecPago(String ecalFecPago) {
        this.ecalFecPago = ecalFecPago;
    }

    public String getEcalFecPago() {
        return this.ecalFecPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcalInstrumento(String ecalInstrumento) {
        this.ecalInstrumento = ecalInstrumento;
    }

    public String getEcalInstrumento() {
        return this.ecalInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcalNumFormula(BigDecimal ecalNumFormula) {
        this.ecalNumFormula = ecalNumFormula;
    }

    public BigDecimal getEcalNumFormula() {
        return this.ecalNumFormula;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEcalTasaAplicada(BigDecimal ecalTasaAplicada) {
        this.ecalTasaAplicada = ecalTasaAplicada;
    }

    public BigDecimal getEcalTasaAplicada() {
        return this.ecalTasaAplicada;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEcalTasaEquivalente(BigDecimal ecalTasaEquivalente) {
        this.ecalTasaEquivalente = ecalTasaEquivalente;
    }

    public BigDecimal getEcalTasaEquivalente() {
        return this.ecalTasaEquivalente;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEcalTasaSobretasa(BigDecimal ecalTasaSobretasa) {
        this.ecalTasaSobretasa = ecalTasaSobretasa;
    }

    public BigDecimal getEcalTasaSobretasa() {
        return this.ecalTasaSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEcalTasaBruta(BigDecimal ecalTasaBruta) {
        this.ecalTasaBruta = ecalTasaBruta;
    }

    public BigDecimal getEcalTasaBruta() {
        return this.ecalTasaBruta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEcalTasaNeta(BigDecimal ecalTasaNeta) {
        this.ecalTasaNeta = ecalTasaNeta;
    }

    public BigDecimal getEcalTasaNeta() {
        return this.ecalTasaNeta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEcalTasaAbsoluta(BigDecimal ecalTasaAbsoluta) {
        this.ecalTasaAbsoluta = ecalTasaAbsoluta;
    }

    public BigDecimal getEcalTasaAbsoluta() {
        return this.ecalTasaAbsoluta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEcalPjeIsr(BigDecimal ecalPjeIsr) {
        this.ecalPjeIsr = ecalPjeIsr;
    }

    public BigDecimal getEcalPjeIsr() {
        return this.ecalPjeIsr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcalPeriodicidadMeses(String ecalPeriodicidadMeses) {
        this.ecalPeriodicidadMeses = ecalPeriodicidadMeses;
    }

    public String getEcalPeriodicidadMeses() {
        return this.ecalPeriodicidadMeses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setEcalPeriodicidadDias(BigDecimal ecalPeriodicidadDias) {
        this.ecalPeriodicidadDias = ecalPeriodicidadDias;
    }

    public BigDecimal getEcalPeriodicidadDias() {
        return this.ecalPeriodicidadDias;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEcalPlazo(BigDecimal ecalPlazo) {
        this.ecalPlazo = ecalPlazo;
    }

    public BigDecimal getEcalPlazo() {
        return this.ecalPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalImpValNominal(BigDecimal ecalImpValNominal) {
        this.ecalImpValNominal = ecalImpValNominal;
    }

    public BigDecimal getEcalImpValNominal() {
        return this.ecalImpValNominal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalImpValNomAdic(BigDecimal ecalImpValNomAdic) {
        this.ecalImpValNomAdic = ecalImpValNomAdic;
    }

    public BigDecimal getEcalImpValNomAdic() {
        return this.ecalImpValNomAdic;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalImpValNomTot(BigDecimal ecalImpValNomTot) {
        this.ecalImpValNomTot = ecalImpValNomTot;
    }

    public BigDecimal getEcalImpValNomTot() {
        return this.ecalImpValNomTot;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalImpAmortizacion(BigDecimal ecalImpAmortizacion) {
        this.ecalImpAmortizacion = ecalImpAmortizacion;
    }

    public BigDecimal getEcalImpAmortizacion() {
        return this.ecalImpAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalImpIntereses(BigDecimal ecalImpIntereses) {
        this.ecalImpIntereses = ecalImpIntereses;
    }

    public BigDecimal getEcalImpIntereses() {
        return this.ecalImpIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalImpNumTitulos(BigDecimal ecalImpNumTitulos) {
        this.ecalImpNumTitulos = ecalImpNumTitulos;
    }

    public BigDecimal getEcalImpNumTitulos() {
        return this.ecalImpNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalImpTipoCambInicio(BigDecimal ecalImpTipoCambInicio) {
        this.ecalImpTipoCambInicio = ecalImpTipoCambInicio;
    }

    public BigDecimal getEcalImpTipoCambInicio() {
        return this.ecalImpTipoCambInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalImpTipoCambFin(BigDecimal ecalImpTipoCambFin) {
        this.ecalImpTipoCambFin = ecalImpTipoCambFin;
    }

    public BigDecimal getEcalImpTipoCambFin() {
        return this.ecalImpTipoCambFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalImpTipoUdi(BigDecimal ecalImpTipoUdi) {
        this.ecalImpTipoUdi = ecalImpTipoUdi;
    }

    public BigDecimal getEcalImpTipoUdi() {
        return this.ecalImpTipoUdi;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalImpAdicInflacion(BigDecimal ecalImpAdicInflacion) {
        this.ecalImpAdicInflacion = ecalImpAdicInflacion;
    }

    public BigDecimal getEcalImpAdicInflacion() {
        return this.ecalImpAdicInflacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEcalTipoCalculo(BigDecimal ecalTipoCalculo) {
        this.ecalTipoCalculo = ecalTipoCalculo;
    }

    public BigDecimal getEcalTipoCalculo() {
        return this.ecalTipoCalculo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcalEstadoCalculo(String ecalEstadoCalculo) {
        this.ecalEstadoCalculo = ecalEstadoCalculo;
    }

    public String getEcalEstadoCalculo() {
        return this.ecalEstadoCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEcalCveInflacion(BigDecimal ecalCveInflacion) {
        this.ecalCveInflacion = ecalCveInflacion;
    }

    public BigDecimal getEcalCveInflacion() {
        return this.ecalCveInflacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEcalValNomTitulos(BigDecimal ecalValNomTitulos) {
        this.ecalValNomTitulos = ecalValNomTitulos;
    }

    public BigDecimal getEcalValNomTitulos() {
        return this.ecalValNomTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEcalTasaTiie(BigDecimal ecalTasaTiie) {
        this.ecalTasaTiie = ecalTasaTiie;
    }

    public BigDecimal getEcalTasaTiie() {
        return this.ecalTasaTiie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalAmortConv(BigDecimal ecalAmortConv) {
        this.ecalAmortConv = ecalAmortConv;
    }

    public BigDecimal getEcalAmortConv() {
        return this.ecalAmortConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalInteresesConv(BigDecimal ecalInteresesConv) {
        this.ecalInteresesConv = ecalInteresesConv;
    }

    public BigDecimal getEcalInteresesConv() {
        return this.ecalInteresesConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalVnaConv(BigDecimal ecalVnaConv) {
        this.ecalVnaConv = ecalVnaConv;
    }

    public BigDecimal getEcalVnaConv() {
        return this.ecalVnaConv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalVnxt(BigDecimal ecalVnxt) {
        this.ecalVnxt = ecalVnxt;
    }

    public BigDecimal getEcalVnxt() {
        return this.ecalVnxt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalInteresesCap(BigDecimal ecalInteresesCap) {
        this.ecalInteresesCap = ecalInteresesCap;
    }

    public BigDecimal getEcalInteresesCap() {
        return this.ecalInteresesCap;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalInteresesPer(BigDecimal ecalInteresesPer) {
        this.ecalInteresesPer = ecalInteresesPer;
    }

    public BigDecimal getEcalInteresesPer() {
        return this.ecalInteresesPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcalAmortExt(BigDecimal ecalAmortExt) {
        this.ecalAmortExt = ecalAmortExt;
    }

    public BigDecimal getEcalAmortExt() {
        return this.ecalAmortExt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcalStCalculo(String ecalStCalculo) {
        this.ecalStCalculo = ecalStCalculo;
    }

    public String getEcalStCalculo() {
        return this.ecalStCalculo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CALCULO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcalIdPrograma() != null && this.getEcalIdPrograma().longValue() == -999) {
            conditions += " AND ECAL_ID_PROGRAMA IS NULL";
        } else if (this.getEcalIdPrograma() != null) {
            conditions += " AND ECAL_ID_PROGRAMA = ?";
            values.add(this.getEcalIdPrograma());
        }

        if (this.getEcalIdFideicomiso() != null && this.getEcalIdFideicomiso().longValue() == -999) {
            conditions += " AND ECAL_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcalIdFideicomiso() != null) {
            conditions += " AND ECAL_ID_FIDEICOMISO = ?";
            values.add(this.getEcalIdFideicomiso());
        }

        if (this.getEcalIdEmision() != null && this.getEcalIdEmision().longValue() == -999) {
            conditions += " AND ECAL_ID_EMISION IS NULL";
        } else if (this.getEcalIdEmision() != null) {
            conditions += " AND ECAL_ID_EMISION = ?";
            values.add(this.getEcalIdEmision());
        }

        if (this.getEcalIdSecCalc() != null && this.getEcalIdSecCalc().longValue() == -999) {
            conditions += " AND ECAL_ID_SEC_CALC IS NULL";
        } else if (this.getEcalIdSecCalc() != null) {
            conditions += " AND ECAL_ID_SEC_CALC = ?";
            values.add(this.getEcalIdSecCalc());
        }

        if (this.getEcalIdSecInter() != null && this.getEcalIdSecInter().longValue() == -999) {
            conditions += " AND ECAL_ID_SEC_INTER IS NULL";
        } else if (this.getEcalIdSecInter() != null) {
            conditions += " AND ECAL_ID_SEC_INTER = ?";
            values.add(this.getEcalIdSecInter());
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
        String sql = "SELECT * FROM F_CALCULO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcalIdPrograma() != null && this.getEcalIdPrograma().longValue() == -999) {
            conditions += " AND ECAL_ID_PROGRAMA IS NULL";
        } else if (this.getEcalIdPrograma() != null) {
            conditions += " AND ECAL_ID_PROGRAMA = ?";
            values.add(this.getEcalIdPrograma());
        }

        if (this.getEcalIdFideicomiso() != null && this.getEcalIdFideicomiso().longValue() == -999) {
            conditions += " AND ECAL_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcalIdFideicomiso() != null) {
            conditions += " AND ECAL_ID_FIDEICOMISO = ?";
            values.add(this.getEcalIdFideicomiso());
        }

        if (this.getEcalIdEmision() != null && this.getEcalIdEmision().longValue() == -999) {
            conditions += " AND ECAL_ID_EMISION IS NULL";
        } else if (this.getEcalIdEmision() != null) {
            conditions += " AND ECAL_ID_EMISION = ?";
            values.add(this.getEcalIdEmision());
        }

        if (this.getEcalIdSecCalc() != null && this.getEcalIdSecCalc().longValue() == -999) {
            conditions += " AND ECAL_ID_SEC_CALC IS NULL";
        } else if (this.getEcalIdSecCalc() != null) {
            conditions += " AND ECAL_ID_SEC_CALC = ?";
            values.add(this.getEcalIdSecCalc());
        }

        if (this.getEcalIdSecInter() != null && this.getEcalIdSecInter().longValue() == -999) {
            conditions += " AND ECAL_ID_SEC_INTER IS NULL";
        } else if (this.getEcalIdSecInter() != null) {
            conditions += " AND ECAL_ID_SEC_INTER = ?";
            values.add(this.getEcalIdSecInter());
        }

        if (this.getEcalFecIniPeriodo() != null && "null".equals(this.getEcalFecIniPeriodo())) {
            conditions += " AND ECAL_FEC_INI_PERIODO IS NULL";
        } else if (this.getEcalFecIniPeriodo() != null) {
            conditions += " AND ECAL_FEC_INI_PERIODO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcalFecIniPeriodo());
        }

        if (this.getEcalFecFinPeriodo() != null && "null".equals(this.getEcalFecFinPeriodo())) {
            conditions += " AND ECAL_FEC_FIN_PERIODO IS NULL";
        } else if (this.getEcalFecFinPeriodo() != null) {
            conditions += " AND ECAL_FEC_FIN_PERIODO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcalFecFinPeriodo());
        }

        if (this.getEcalFecRealPeriodo() != null && "null".equals(this.getEcalFecRealPeriodo())) {
            conditions += " AND ECAL_FEC_REAL_PERIODO IS NULL";
        } else if (this.getEcalFecRealPeriodo() != null) {
            conditions += " AND ECAL_FEC_REAL_PERIODO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcalFecRealPeriodo());
        }

        if (this.getEcalFecPago() != null && "null".equals(this.getEcalFecPago())) {
            conditions += " AND ECAL_FEC_PAGO IS NULL";
        } else if (this.getEcalFecPago() != null) {
            conditions += " AND ECAL_FEC_PAGO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEcalFecPago());
        }

        if (this.getEcalInstrumento() != null && "null".equals(this.getEcalInstrumento())) {
            conditions += " AND ECAL_INSTRUMENTO IS NULL";
        } else if (this.getEcalInstrumento() != null) {
            conditions += " AND ECAL_INSTRUMENTO = ?";
            values.add(this.getEcalInstrumento());
        }

        if (this.getEcalNumFormula() != null && this.getEcalNumFormula().longValue() == -999) {
            conditions += " AND ECAL_NUM_FORMULA IS NULL";
        } else if (this.getEcalNumFormula() != null) {
            conditions += " AND ECAL_NUM_FORMULA = ?";
            values.add(this.getEcalNumFormula());
        }

        if (this.getEcalTasaAplicada() != null && this.getEcalTasaAplicada().longValue() == -999) {
            conditions += " AND ECAL_TASA_APLICADA IS NULL";
        } else if (this.getEcalTasaAplicada() != null) {
            conditions += " AND ECAL_TASA_APLICADA = ?";
            values.add(this.getEcalTasaAplicada());
        }

        if (this.getEcalTasaEquivalente() != null && this.getEcalTasaEquivalente().longValue() == -999) {
            conditions += " AND ECAL_TASA_EQUIVALENTE IS NULL";
        } else if (this.getEcalTasaEquivalente() != null) {
            conditions += " AND ECAL_TASA_EQUIVALENTE = ?";
            values.add(this.getEcalTasaEquivalente());
        }

        if (this.getEcalTasaSobretasa() != null && this.getEcalTasaSobretasa().longValue() == -999) {
            conditions += " AND ECAL_TASA_SOBRETASA IS NULL";
        } else if (this.getEcalTasaSobretasa() != null) {
            conditions += " AND ECAL_TASA_SOBRETASA = ?";
            values.add(this.getEcalTasaSobretasa());
        }

        if (this.getEcalTasaBruta() != null && this.getEcalTasaBruta().longValue() == -999) {
            conditions += " AND ECAL_TASA_BRUTA IS NULL";
        } else if (this.getEcalTasaBruta() != null) {
            conditions += " AND ECAL_TASA_BRUTA = ?";
            values.add(this.getEcalTasaBruta());
        }

        if (this.getEcalTasaNeta() != null && this.getEcalTasaNeta().longValue() == -999) {
            conditions += " AND ECAL_TASA_NETA IS NULL";
        } else if (this.getEcalTasaNeta() != null) {
            conditions += " AND ECAL_TASA_NETA = ?";
            values.add(this.getEcalTasaNeta());
        }

        if (this.getEcalTasaAbsoluta() != null && this.getEcalTasaAbsoluta().longValue() == -999) {
            conditions += " AND ECAL_TASA_ABSOLUTA IS NULL";
        } else if (this.getEcalTasaAbsoluta() != null) {
            conditions += " AND ECAL_TASA_ABSOLUTA = ?";
            values.add(this.getEcalTasaAbsoluta());
        }

        if (this.getEcalPjeIsr() != null && this.getEcalPjeIsr().longValue() == -999) {
            conditions += " AND ECAL_PJE_ISR IS NULL";
        } else if (this.getEcalPjeIsr() != null) {
            conditions += " AND ECAL_PJE_ISR = ?";
            values.add(this.getEcalPjeIsr());
        }

        if (this.getEcalPeriodicidadMeses() != null && "null".equals(this.getEcalPeriodicidadMeses())) {
            conditions += " AND ECAL_PERIODICIDAD_MESES IS NULL";
        } else if (this.getEcalPeriodicidadMeses() != null) {
            conditions += " AND ECAL_PERIODICIDAD_MESES = ?";
            values.add(this.getEcalPeriodicidadMeses());
        }

        if (this.getEcalPeriodicidadDias() != null && this.getEcalPeriodicidadDias().longValue() == -999) {
            conditions += " AND ECAL_PERIODICIDAD_DIAS IS NULL";
        } else if (this.getEcalPeriodicidadDias() != null) {
            conditions += " AND ECAL_PERIODICIDAD_DIAS = ?";
            values.add(this.getEcalPeriodicidadDias());
        }

        if (this.getEcalPlazo() != null && this.getEcalPlazo().longValue() == -999) {
            conditions += " AND ECAL_PLAZO IS NULL";
        } else if (this.getEcalPlazo() != null) {
            conditions += " AND ECAL_PLAZO = ?";
            values.add(this.getEcalPlazo());
        }

        if (this.getEcalImpValNominal() != null && this.getEcalImpValNominal().longValue() == -999) {
            conditions += " AND ECAL_IMP_VAL_NOMINAL IS NULL";
        } else if (this.getEcalImpValNominal() != null) {
            conditions += " AND ECAL_IMP_VAL_NOMINAL = ?";
            values.add(this.getEcalImpValNominal());
        }

        if (this.getEcalImpValNomAdic() != null && this.getEcalImpValNomAdic().longValue() == -999) {
            conditions += " AND ECAL_IMP_VAL_NOM_ADIC IS NULL";
        } else if (this.getEcalImpValNomAdic() != null) {
            conditions += " AND ECAL_IMP_VAL_NOM_ADIC = ?";
            values.add(this.getEcalImpValNomAdic());
        }

        if (this.getEcalImpValNomTot() != null && this.getEcalImpValNomTot().longValue() == -999) {
            conditions += " AND ECAL_IMP_VAL_NOM_TOT IS NULL";
        } else if (this.getEcalImpValNomTot() != null) {
            conditions += " AND ECAL_IMP_VAL_NOM_TOT = ?";
            values.add(this.getEcalImpValNomTot());
        }

        if (this.getEcalImpAmortizacion() != null && this.getEcalImpAmortizacion().longValue() == -999) {
            conditions += " AND ECAL_IMP_AMORTIZACION IS NULL";
        } else if (this.getEcalImpAmortizacion() != null) {
            conditions += " AND ECAL_IMP_AMORTIZACION = ?";
            values.add(this.getEcalImpAmortizacion());
        }

        if (this.getEcalImpIntereses() != null && this.getEcalImpIntereses().longValue() == -999) {
            conditions += " AND ECAL_IMP_INTERESES IS NULL";
        } else if (this.getEcalImpIntereses() != null) {
            conditions += " AND ECAL_IMP_INTERESES = ?";
            values.add(this.getEcalImpIntereses());
        }

        if (this.getEcalImpNumTitulos() != null && this.getEcalImpNumTitulos().longValue() == -999) {
            conditions += " AND ECAL_IMP_NUM_TITULOS IS NULL";
        } else if (this.getEcalImpNumTitulos() != null) {
            conditions += " AND ECAL_IMP_NUM_TITULOS = ?";
            values.add(this.getEcalImpNumTitulos());
        }

        if (this.getEcalImpTipoCambInicio() != null && this.getEcalImpTipoCambInicio().longValue() == -999) {
            conditions += " AND ECAL_IMP_TIPO_CAMB_INICIO IS NULL";
        } else if (this.getEcalImpTipoCambInicio() != null) {
            conditions += " AND ECAL_IMP_TIPO_CAMB_INICIO = ?";
            values.add(this.getEcalImpTipoCambInicio());
        }

        if (this.getEcalImpTipoCambFin() != null && this.getEcalImpTipoCambFin().longValue() == -999) {
            conditions += " AND ECAL_IMP_TIPO_CAMB_FIN IS NULL";
        } else if (this.getEcalImpTipoCambFin() != null) {
            conditions += " AND ECAL_IMP_TIPO_CAMB_FIN = ?";
            values.add(this.getEcalImpTipoCambFin());
        }

        if (this.getEcalImpTipoUdi() != null && this.getEcalImpTipoUdi().longValue() == -999) {
            conditions += " AND ECAL_IMP_TIPO_UDI IS NULL";
        } else if (this.getEcalImpTipoUdi() != null) {
            conditions += " AND ECAL_IMP_TIPO_UDI = ?";
            values.add(this.getEcalImpTipoUdi());
        }

        if (this.getEcalImpAdicInflacion() != null && this.getEcalImpAdicInflacion().longValue() == -999) {
            conditions += " AND ECAL_IMP_ADIC_INFLACION IS NULL";
        } else if (this.getEcalImpAdicInflacion() != null) {
            conditions += " AND ECAL_IMP_ADIC_INFLACION = ?";
            values.add(this.getEcalImpAdicInflacion());
        }

        if (this.getEcalTipoCalculo() != null && this.getEcalTipoCalculo().longValue() == -999) {
            conditions += " AND ECAL_TIPO_CALCULO IS NULL";
        } else if (this.getEcalTipoCalculo() != null) {
            conditions += " AND ECAL_TIPO_CALCULO = ?";
            values.add(this.getEcalTipoCalculo());
        }

        if (this.getEcalEstadoCalculo() != null && "null".equals(this.getEcalEstadoCalculo())) {
            conditions += " AND ECAL_ESTADO_CALCULO IS NULL";
        } else if (this.getEcalEstadoCalculo() != null) {
            conditions += " AND ECAL_ESTADO_CALCULO = ?";
            values.add(this.getEcalEstadoCalculo());
        }

        if (this.getEcalCveInflacion() != null && this.getEcalCveInflacion().longValue() == -999) {
            conditions += " AND ECAL_CVE_INFLACION IS NULL";
        } else if (this.getEcalCveInflacion() != null) {
            conditions += " AND ECAL_CVE_INFLACION = ?";
            values.add(this.getEcalCveInflacion());
        }

        if (this.getEcalValNomTitulos() != null && this.getEcalValNomTitulos().longValue() == -999) {
            conditions += " AND ECAL_VAL_NOM_TITULOS IS NULL";
        } else if (this.getEcalValNomTitulos() != null) {
            conditions += " AND ECAL_VAL_NOM_TITULOS = ?";
            values.add(this.getEcalValNomTitulos());
        }

        if (this.getEcalTasaTiie() != null && this.getEcalTasaTiie().longValue() == -999) {
            conditions += " AND ECAL_TASA_TIIE IS NULL";
        } else if (this.getEcalTasaTiie() != null) {
            conditions += " AND ECAL_TASA_TIIE = ?";
            values.add(this.getEcalTasaTiie());
        }

        if (this.getEcalAmortConv() != null && this.getEcalAmortConv().longValue() == -999) {
            conditions += " AND ECAL_AMORT_CONV IS NULL";
        } else if (this.getEcalAmortConv() != null) {
            conditions += " AND ECAL_AMORT_CONV = ?";
            values.add(this.getEcalAmortConv());
        }

        if (this.getEcalInteresesConv() != null && this.getEcalInteresesConv().longValue() == -999) {
            conditions += " AND ECAL_INTERESES_CONV IS NULL";
        } else if (this.getEcalInteresesConv() != null) {
            conditions += " AND ECAL_INTERESES_CONV = ?";
            values.add(this.getEcalInteresesConv());
        }

        if (this.getEcalVnaConv() != null && this.getEcalVnaConv().longValue() == -999) {
            conditions += " AND ECAL_VNA_CONV IS NULL";
        } else if (this.getEcalVnaConv() != null) {
            conditions += " AND ECAL_VNA_CONV = ?";
            values.add(this.getEcalVnaConv());
        }

        if (this.getEcalVnxt() != null && this.getEcalVnxt().longValue() == -999) {
            conditions += " AND ECAL_VNXT IS NULL";
        } else if (this.getEcalVnxt() != null) {
            conditions += " AND ECAL_VNXT = ?";
            values.add(this.getEcalVnxt());
        }

        if (this.getEcalInteresesCap() != null && this.getEcalInteresesCap().longValue() == -999) {
            conditions += " AND ECAL_INTERESES_CAP IS NULL";
        } else if (this.getEcalInteresesCap() != null) {
            conditions += " AND ECAL_INTERESES_CAP = ?";
            values.add(this.getEcalInteresesCap());
        }

        if (this.getEcalInteresesPer() != null && this.getEcalInteresesPer().longValue() == -999) {
            conditions += " AND ECAL_INTERESES_PER IS NULL";
        } else if (this.getEcalInteresesPer() != null) {
            conditions += " AND ECAL_INTERESES_PER = ?";
            values.add(this.getEcalInteresesPer());
        }

        if (this.getEcalAmortExt() != null && this.getEcalAmortExt().longValue() == -999) {
            conditions += " AND ECAL_AMORT_EXT IS NULL";
        } else if (this.getEcalAmortExt() != null) {
            conditions += " AND ECAL_AMORT_EXT = ?";
            values.add(this.getEcalAmortExt());
        }

        if (this.getEcalStCalculo() != null && "null".equals(this.getEcalStCalculo())) {
            conditions += " AND ECAL_ST_CALCULO IS NULL";
        } else if (this.getEcalStCalculo() != null) {
            conditions += " AND ECAL_ST_CALCULO = ?";
            values.add(this.getEcalStCalculo());
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
        String sql = "UPDATE F_CALCULO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ECAL_ID_PROGRAMA = ?";
        pkValues.add(this.getEcalIdPrograma());
        conditions += " AND ECAL_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEcalIdFideicomiso());
        conditions += " AND ECAL_ID_EMISION = ?";
        pkValues.add(this.getEcalIdEmision());
        conditions += " AND ECAL_ID_SEC_CALC = ?";
        pkValues.add(this.getEcalIdSecCalc());
        conditions += " AND ECAL_ID_SEC_INTER = ?";
        pkValues.add(this.getEcalIdSecInter());
        fields += " ECAL_FEC_INI_PERIODO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcalFecIniPeriodo());
        fields += " ECAL_FEC_FIN_PERIODO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcalFecFinPeriodo());
        fields += " ECAL_FEC_REAL_PERIODO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcalFecRealPeriodo());
        fields += " ECAL_FEC_PAGO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEcalFecPago());
        fields += " ECAL_INSTRUMENTO = ?, ";
        values.add(this.getEcalInstrumento());
        fields += " ECAL_NUM_FORMULA = ?, ";
        values.add(this.getEcalNumFormula());
        fields += " ECAL_TASA_APLICADA = ?, ";
        values.add(this.getEcalTasaAplicada());
        fields += " ECAL_TASA_EQUIVALENTE = ?, ";
        values.add(this.getEcalTasaEquivalente());
        fields += " ECAL_TASA_SOBRETASA = ?, ";
        values.add(this.getEcalTasaSobretasa());
        fields += " ECAL_TASA_BRUTA = ?, ";
        values.add(this.getEcalTasaBruta());
        fields += " ECAL_TASA_NETA = ?, ";
        values.add(this.getEcalTasaNeta());
        fields += " ECAL_TASA_ABSOLUTA = ?, ";
        values.add(this.getEcalTasaAbsoluta());
        fields += " ECAL_PJE_ISR = ?, ";
        values.add(this.getEcalPjeIsr());
        fields += " ECAL_PERIODICIDAD_MESES = ?, ";
        values.add(this.getEcalPeriodicidadMeses());
        fields += " ECAL_PERIODICIDAD_DIAS = ?, ";
        values.add(this.getEcalPeriodicidadDias());
        fields += " ECAL_PLAZO = ?, ";
        values.add(this.getEcalPlazo());
        fields += " ECAL_IMP_VAL_NOMINAL = ?, ";
        values.add(this.getEcalImpValNominal());
        fields += " ECAL_IMP_VAL_NOM_ADIC = ?, ";
        values.add(this.getEcalImpValNomAdic());
        fields += " ECAL_IMP_VAL_NOM_TOT = ?, ";
        values.add(this.getEcalImpValNomTot());
        fields += " ECAL_IMP_AMORTIZACION = ?, ";
        values.add(this.getEcalImpAmortizacion());
        fields += " ECAL_IMP_INTERESES = ?, ";
        values.add(this.getEcalImpIntereses());
        fields += " ECAL_IMP_NUM_TITULOS = ?, ";
        values.add(this.getEcalImpNumTitulos());
        fields += " ECAL_IMP_TIPO_CAMB_INICIO = ?, ";
        values.add(this.getEcalImpTipoCambInicio());
        fields += " ECAL_IMP_TIPO_CAMB_FIN = ?, ";
        values.add(this.getEcalImpTipoCambFin());
        fields += " ECAL_IMP_TIPO_UDI = ?, ";
        values.add(this.getEcalImpTipoUdi());
        fields += " ECAL_IMP_ADIC_INFLACION = ?, ";
        values.add(this.getEcalImpAdicInflacion());
        fields += " ECAL_TIPO_CALCULO = ?, ";
        values.add(this.getEcalTipoCalculo());
        fields += " ECAL_ESTADO_CALCULO = ?, ";
        values.add(this.getEcalEstadoCalculo());
        fields += " ECAL_CVE_INFLACION = ?, ";
        values.add(this.getEcalCveInflacion());
        fields += " ECAL_VAL_NOM_TITULOS = ?, ";
        values.add(this.getEcalValNomTitulos());
        fields += " ECAL_TASA_TIIE = ?, ";
        values.add(this.getEcalTasaTiie());
        fields += " ECAL_AMORT_CONV = ?, ";
        values.add(this.getEcalAmortConv());
        fields += " ECAL_INTERESES_CONV = ?, ";
        values.add(this.getEcalInteresesConv());
        fields += " ECAL_VNA_CONV = ?, ";
        values.add(this.getEcalVnaConv());
        fields += " ECAL_VNXT = ?, ";
        values.add(this.getEcalVnxt());
        fields += " ECAL_INTERESES_CAP = ?, ";
        values.add(this.getEcalInteresesCap());
        fields += " ECAL_INTERESES_PER = ?, ";
        values.add(this.getEcalInteresesPer());
        fields += " ECAL_AMORT_EXT = ?, ";
        values.add(this.getEcalAmortExt());
        fields += " ECAL_ST_CALCULO = ?, ";
        values.add(this.getEcalStCalculo());
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
        String sql = "INSERT INTO F_CALCULO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ECAL_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEcalIdPrograma());

        fields += ", ECAL_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEcalIdFideicomiso());

        fields += ", ECAL_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEcalIdEmision());

        fields += ", ECAL_ID_SEC_CALC";
        fieldValues += ", ?";
        values.add(this.getEcalIdSecCalc());

        fields += ", ECAL_ID_SEC_INTER";
        fieldValues += ", ?";
        values.add(this.getEcalIdSecInter());

        fields += ", ECAL_FEC_INI_PERIODO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcalFecIniPeriodo());

        fields += ", ECAL_FEC_FIN_PERIODO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcalFecFinPeriodo());

        fields += ", ECAL_FEC_REAL_PERIODO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcalFecRealPeriodo());

        fields += ", ECAL_FEC_PAGO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEcalFecPago());

        fields += ", ECAL_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getEcalInstrumento());

        fields += ", ECAL_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getEcalNumFormula());

        fields += ", ECAL_TASA_APLICADA";
        fieldValues += ", ?";
        values.add(this.getEcalTasaAplicada());

        fields += ", ECAL_TASA_EQUIVALENTE";
        fieldValues += ", ?";
        values.add(this.getEcalTasaEquivalente());

        fields += ", ECAL_TASA_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getEcalTasaSobretasa());

        fields += ", ECAL_TASA_BRUTA";
        fieldValues += ", ?";
        values.add(this.getEcalTasaBruta());

        fields += ", ECAL_TASA_NETA";
        fieldValues += ", ?";
        values.add(this.getEcalTasaNeta());

        fields += ", ECAL_TASA_ABSOLUTA";
        fieldValues += ", ?";
        values.add(this.getEcalTasaAbsoluta());

        fields += ", ECAL_PJE_ISR";
        fieldValues += ", ?";
        values.add(this.getEcalPjeIsr());

        fields += ", ECAL_PERIODICIDAD_MESES";
        fieldValues += ", ?";
        values.add(this.getEcalPeriodicidadMeses());

        fields += ", ECAL_PERIODICIDAD_DIAS";
        fieldValues += ", ?";
        values.add(this.getEcalPeriodicidadDias());

        fields += ", ECAL_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEcalPlazo());

        fields += ", ECAL_IMP_VAL_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getEcalImpValNominal());

        fields += ", ECAL_IMP_VAL_NOM_ADIC";
        fieldValues += ", ?";
        values.add(this.getEcalImpValNomAdic());

        fields += ", ECAL_IMP_VAL_NOM_TOT";
        fieldValues += ", ?";
        values.add(this.getEcalImpValNomTot());

        fields += ", ECAL_IMP_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEcalImpAmortizacion());

        fields += ", ECAL_IMP_INTERESES";
        fieldValues += ", ?";
        values.add(this.getEcalImpIntereses());

        fields += ", ECAL_IMP_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEcalImpNumTitulos());

        fields += ", ECAL_IMP_TIPO_CAMB_INICIO";
        fieldValues += ", ?";
        values.add(this.getEcalImpTipoCambInicio());

        fields += ", ECAL_IMP_TIPO_CAMB_FIN";
        fieldValues += ", ?";
        values.add(this.getEcalImpTipoCambFin());

        fields += ", ECAL_IMP_TIPO_UDI";
        fieldValues += ", ?";
        values.add(this.getEcalImpTipoUdi());

        fields += ", ECAL_IMP_ADIC_INFLACION";
        fieldValues += ", ?";
        values.add(this.getEcalImpAdicInflacion());

        fields += ", ECAL_TIPO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEcalTipoCalculo());

        fields += ", ECAL_ESTADO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEcalEstadoCalculo());

        fields += ", ECAL_CVE_INFLACION";
        fieldValues += ", ?";
        values.add(this.getEcalCveInflacion());

        fields += ", ECAL_VAL_NOM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEcalValNomTitulos());

        fields += ", ECAL_TASA_TIIE";
        fieldValues += ", ?";
        values.add(this.getEcalTasaTiie());

        fields += ", ECAL_AMORT_CONV";
        fieldValues += ", ?";
        values.add(this.getEcalAmortConv());

        fields += ", ECAL_INTERESES_CONV";
        fieldValues += ", ?";
        values.add(this.getEcalInteresesConv());

        fields += ", ECAL_VNA_CONV";
        fieldValues += ", ?";
        values.add(this.getEcalVnaConv());

        fields += ", ECAL_VNXT";
        fieldValues += ", ?";
        values.add(this.getEcalVnxt());

        fields += ", ECAL_INTERESES_CAP";
        fieldValues += ", ?";
        values.add(this.getEcalInteresesCap());

        fields += ", ECAL_INTERESES_PER";
        fieldValues += ", ?";
        values.add(this.getEcalInteresesPer());

        fields += ", ECAL_AMORT_EXT";
        fieldValues += ", ?";
        values.add(this.getEcalAmortExt());

        fields += ", ECAL_ST_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEcalStCalculo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CALCULO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ECAL_ID_PROGRAMA = ?";
        values.add(this.getEcalIdPrograma());
        conditions += " AND ECAL_ID_FIDEICOMISO = ?";
        values.add(this.getEcalIdFideicomiso());
        conditions += " AND ECAL_ID_EMISION = ?";
        values.add(this.getEcalIdEmision());
        conditions += " AND ECAL_ID_SEC_CALC = ?";
        values.add(this.getEcalIdSecCalc());
        conditions += " AND ECAL_ID_SEC_INTER = ?";
        values.add(this.getEcalIdSecInter());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCalculo instance = (FCalculo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEcalIdPrograma().equals(instance.getEcalIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEcalIdFideicomiso().equals(instance.getEcalIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEcalIdEmision().equals(instance.getEcalIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEcalIdSecCalc().equals(instance.getEcalIdSecCalc()))
            equalObjects = false;
        if (equalObjects && !this.getEcalIdSecInter().equals(instance.getEcalIdSecInter()))
            equalObjects = false;
        if (equalObjects && !this.getEcalFecIniPeriodo().equals(instance.getEcalFecIniPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEcalFecFinPeriodo().equals(instance.getEcalFecFinPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEcalFecRealPeriodo().equals(instance.getEcalFecRealPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEcalFecPago().equals(instance.getEcalFecPago()))
            equalObjects = false;
        if (equalObjects && !this.getEcalInstrumento().equals(instance.getEcalInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getEcalNumFormula().equals(instance.getEcalNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getEcalTasaAplicada().equals(instance.getEcalTasaAplicada()))
            equalObjects = false;
        if (equalObjects && !this.getEcalTasaEquivalente().equals(instance.getEcalTasaEquivalente()))
            equalObjects = false;
        if (equalObjects && !this.getEcalTasaSobretasa().equals(instance.getEcalTasaSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getEcalTasaBruta().equals(instance.getEcalTasaBruta()))
            equalObjects = false;
        if (equalObjects && !this.getEcalTasaNeta().equals(instance.getEcalTasaNeta()))
            equalObjects = false;
        if (equalObjects && !this.getEcalTasaAbsoluta().equals(instance.getEcalTasaAbsoluta()))
            equalObjects = false;
        if (equalObjects && !this.getEcalPjeIsr().equals(instance.getEcalPjeIsr()))
            equalObjects = false;
        if (equalObjects && !this.getEcalPeriodicidadMeses().equals(instance.getEcalPeriodicidadMeses()))
            equalObjects = false;
        if (equalObjects && !this.getEcalPeriodicidadDias().equals(instance.getEcalPeriodicidadDias()))
            equalObjects = false;
        if (equalObjects && !this.getEcalPlazo().equals(instance.getEcalPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEcalImpValNominal().equals(instance.getEcalImpValNominal()))
            equalObjects = false;
        if (equalObjects && !this.getEcalImpValNomAdic().equals(instance.getEcalImpValNomAdic()))
            equalObjects = false;
        if (equalObjects && !this.getEcalImpValNomTot().equals(instance.getEcalImpValNomTot()))
            equalObjects = false;
        if (equalObjects && !this.getEcalImpAmortizacion().equals(instance.getEcalImpAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEcalImpIntereses().equals(instance.getEcalImpIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getEcalImpNumTitulos().equals(instance.getEcalImpNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEcalImpTipoCambInicio().equals(instance.getEcalImpTipoCambInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEcalImpTipoCambFin().equals(instance.getEcalImpTipoCambFin()))
            equalObjects = false;
        if (equalObjects && !this.getEcalImpTipoUdi().equals(instance.getEcalImpTipoUdi()))
            equalObjects = false;
        if (equalObjects && !this.getEcalImpAdicInflacion().equals(instance.getEcalImpAdicInflacion()))
            equalObjects = false;
        if (equalObjects && !this.getEcalTipoCalculo().equals(instance.getEcalTipoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getEcalEstadoCalculo().equals(instance.getEcalEstadoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getEcalCveInflacion().equals(instance.getEcalCveInflacion()))
            equalObjects = false;
        if (equalObjects && !this.getEcalValNomTitulos().equals(instance.getEcalValNomTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEcalTasaTiie().equals(instance.getEcalTasaTiie()))
            equalObjects = false;
        if (equalObjects && !this.getEcalAmortConv().equals(instance.getEcalAmortConv()))
            equalObjects = false;
        if (equalObjects && !this.getEcalInteresesConv().equals(instance.getEcalInteresesConv()))
            equalObjects = false;
        if (equalObjects && !this.getEcalVnaConv().equals(instance.getEcalVnaConv()))
            equalObjects = false;
        if (equalObjects && !this.getEcalVnxt().equals(instance.getEcalVnxt()))
            equalObjects = false;
        if (equalObjects && !this.getEcalInteresesCap().equals(instance.getEcalInteresesCap()))
            equalObjects = false;
        if (equalObjects && !this.getEcalInteresesPer().equals(instance.getEcalInteresesPer()))
            equalObjects = false;
        if (equalObjects && !this.getEcalAmortExt().equals(instance.getEcalAmortExt()))
            equalObjects = false;
        if (equalObjects && !this.getEcalStCalculo().equals(instance.getEcalStCalculo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCalculo result = new FCalculo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEcalIdPrograma((BigDecimal) objectData.getData("ECAL_ID_PROGRAMA"));
        result.setEcalIdFideicomiso((BigDecimal) objectData.getData("ECAL_ID_FIDEICOMISO"));
        result.setEcalIdEmision((BigDecimal) objectData.getData("ECAL_ID_EMISION"));
        result.setEcalIdSecCalc((BigDecimal) objectData.getData("ECAL_ID_SEC_CALC"));
        result.setEcalIdSecInter((BigDecimal) objectData.getData("ECAL_ID_SEC_INTER"));
        result.setEcalFecIniPeriodo((String) objectData.getData("ECAL_FEC_INI_PERIODO"));
        result.setEcalFecFinPeriodo((String) objectData.getData("ECAL_FEC_FIN_PERIODO"));
        result.setEcalFecRealPeriodo((String) objectData.getData("ECAL_FEC_REAL_PERIODO"));
        result.setEcalFecPago((String) objectData.getData("ECAL_FEC_PAGO"));
        result.setEcalInstrumento((String) objectData.getData("ECAL_INSTRUMENTO"));
        result.setEcalNumFormula((BigDecimal) objectData.getData("ECAL_NUM_FORMULA"));
        result.setEcalTasaAplicada((BigDecimal) objectData.getData("ECAL_TASA_APLICADA"));
        result.setEcalTasaEquivalente((BigDecimal) objectData.getData("ECAL_TASA_EQUIVALENTE"));
        result.setEcalTasaSobretasa((BigDecimal) objectData.getData("ECAL_TASA_SOBRETASA"));
        result.setEcalTasaBruta((BigDecimal) objectData.getData("ECAL_TASA_BRUTA"));
        result.setEcalTasaNeta((BigDecimal) objectData.getData("ECAL_TASA_NETA"));
        result.setEcalTasaAbsoluta((BigDecimal) objectData.getData("ECAL_TASA_ABSOLUTA"));
        result.setEcalPjeIsr((BigDecimal) objectData.getData("ECAL_PJE_ISR"));
        result.setEcalPeriodicidadMeses((String) objectData.getData("ECAL_PERIODICIDAD_MESES"));
        result.setEcalPeriodicidadDias((BigDecimal) objectData.getData("ECAL_PERIODICIDAD_DIAS"));
        result.setEcalPlazo((BigDecimal) objectData.getData("ECAL_PLAZO"));
        result.setEcalImpValNominal((BigDecimal) objectData.getData("ECAL_IMP_VAL_NOMINAL"));
        result.setEcalImpValNomAdic((BigDecimal) objectData.getData("ECAL_IMP_VAL_NOM_ADIC"));
        result.setEcalImpValNomTot((BigDecimal) objectData.getData("ECAL_IMP_VAL_NOM_TOT"));
        result.setEcalImpAmortizacion((BigDecimal) objectData.getData("ECAL_IMP_AMORTIZACION"));
        result.setEcalImpIntereses((BigDecimal) objectData.getData("ECAL_IMP_INTERESES"));
        result.setEcalImpNumTitulos((BigDecimal) objectData.getData("ECAL_IMP_NUM_TITULOS"));
        result.setEcalImpTipoCambInicio((BigDecimal) objectData.getData("ECAL_IMP_TIPO_CAMB_INICIO"));
        result.setEcalImpTipoCambFin((BigDecimal) objectData.getData("ECAL_IMP_TIPO_CAMB_FIN"));
        result.setEcalImpTipoUdi((BigDecimal) objectData.getData("ECAL_IMP_TIPO_UDI"));
        result.setEcalImpAdicInflacion((BigDecimal) objectData.getData("ECAL_IMP_ADIC_INFLACION"));
        result.setEcalTipoCalculo((BigDecimal) objectData.getData("ECAL_TIPO_CALCULO"));
        result.setEcalEstadoCalculo((String) objectData.getData("ECAL_ESTADO_CALCULO"));
        result.setEcalCveInflacion((BigDecimal) objectData.getData("ECAL_CVE_INFLACION"));
        result.setEcalValNomTitulos((BigDecimal) objectData.getData("ECAL_VAL_NOM_TITULOS"));
        result.setEcalTasaTiie((BigDecimal) objectData.getData("ECAL_TASA_TIIE"));
        result.setEcalAmortConv((BigDecimal) objectData.getData("ECAL_AMORT_CONV"));
        result.setEcalInteresesConv((BigDecimal) objectData.getData("ECAL_INTERESES_CONV"));
        result.setEcalVnaConv((BigDecimal) objectData.getData("ECAL_VNA_CONV"));
        result.setEcalVnxt((BigDecimal) objectData.getData("ECAL_VNXT"));
        result.setEcalInteresesCap((BigDecimal) objectData.getData("ECAL_INTERESES_CAP"));
        result.setEcalInteresesPer((BigDecimal) objectData.getData("ECAL_INTERESES_PER"));
        result.setEcalAmortExt((BigDecimal) objectData.getData("ECAL_AMORT_EXT"));
        result.setEcalStCalculo((String) objectData.getData("ECAL_ST_CALCULO"));

        return result;

    }

}
