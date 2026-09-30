package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISREND_PK", columns = { "ERE_NUM_PROGRAMA", "ERE_NUM_EMISION" }, sequences = { "MANUAL" })
public class Emisrend extends DomainObject {

    BigDecimal ereNumPrograma = null;
    BigDecimal ereNumEmision = null;
    BigDecimal ereTipoCalculo = null;
    BigDecimal ereNumFormula = null;
    BigDecimal erePjeTasa = null;
    BigDecimal ereDecimales = null;
    BigDecimal ereNumDecimales = null;
    BigDecimal ereNumTasaInt = null;
    BigDecimal ereTasaInteres1 = null;
    String ereDeterminaTrb = null;
    String ereDeterminaTrn = null;
    BigDecimal ereAbsolutaTrb = null;
    BigDecimal ereAbsNumDec = null;
    BigDecimal ereDiasAntesTasa = null;
    BigDecimal ereTipoPromedio = null;
    BigDecimal ereDiasNatural = null;
    String erePeriodicidadProm = null;
    BigDecimal ereNumDias = null;
    BigDecimal ereDiaFijo = null;
    BigDecimal ereNumDiaFijo = null;
    String ereProceso = null;
    BigDecimal ereCalcSobretasa = null;
    BigDecimal ereDiasAntesAvi = null;
    String erePerPromedio = null;
    BigDecimal ereNumDecimalesPp = null;
    BigDecimal ereSumaIsr = null;
    BigDecimal ereRedondeo = null;
    BigDecimal ereAnoAltaReg = null;
    BigDecimal ereMesAltaReg = null;
    BigDecimal ereDiaAltaReg = null;
    BigDecimal ereAnoUltMod = null;
    BigDecimal ereMesUltMod = null;
    BigDecimal ereDiaUltMod = null;
    String ereCveStEmisrend = null;

    public Emisrend() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEreNumPrograma(BigDecimal ereNumPrograma) {
        this.ereNumPrograma = ereNumPrograma;
    }

    public BigDecimal getEreNumPrograma() {
        return this.ereNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEreNumEmision(BigDecimal ereNumEmision) {
        this.ereNumEmision = ereNumEmision;
    }

    public BigDecimal getEreNumEmision() {
        return this.ereNumEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEreTipoCalculo(BigDecimal ereTipoCalculo) {
        this.ereTipoCalculo = ereTipoCalculo;
    }

    public BigDecimal getEreTipoCalculo() {
        return this.ereTipoCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEreNumFormula(BigDecimal ereNumFormula) {
        this.ereNumFormula = ereNumFormula;
    }

    public BigDecimal getEreNumFormula() {
        return this.ereNumFormula;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setErePjeTasa(BigDecimal erePjeTasa) {
        this.erePjeTasa = erePjeTasa;
    }

    public BigDecimal getErePjeTasa() {
        return this.erePjeTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreDecimales(BigDecimal ereDecimales) {
        this.ereDecimales = ereDecimales;
    }

    public BigDecimal getEreDecimales() {
        return this.ereDecimales;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreNumDecimales(BigDecimal ereNumDecimales) {
        this.ereNumDecimales = ereNumDecimales;
    }

    public BigDecimal getEreNumDecimales() {
        return this.ereNumDecimales;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreNumTasaInt(BigDecimal ereNumTasaInt) {
        this.ereNumTasaInt = ereNumTasaInt;
    }

    public BigDecimal getEreNumTasaInt() {
        return this.ereNumTasaInt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEreTasaInteres1(BigDecimal ereTasaInteres1) {
        this.ereTasaInteres1 = ereTasaInteres1;
    }

    public BigDecimal getEreTasaInteres1() {
        return this.ereTasaInteres1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEreDeterminaTrb(String ereDeterminaTrb) {
        this.ereDeterminaTrb = ereDeterminaTrb;
    }

    public String getEreDeterminaTrb() {
        return this.ereDeterminaTrb;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEreDeterminaTrn(String ereDeterminaTrn) {
        this.ereDeterminaTrn = ereDeterminaTrn;
    }

    public String getEreDeterminaTrn() {
        return this.ereDeterminaTrn;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreAbsolutaTrb(BigDecimal ereAbsolutaTrb) {
        this.ereAbsolutaTrb = ereAbsolutaTrb;
    }

    public BigDecimal getEreAbsolutaTrb() {
        return this.ereAbsolutaTrb;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreAbsNumDec(BigDecimal ereAbsNumDec) {
        this.ereAbsNumDec = ereAbsNumDec;
    }

    public BigDecimal getEreAbsNumDec() {
        return this.ereAbsNumDec;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreDiasAntesTasa(BigDecimal ereDiasAntesTasa) {
        this.ereDiasAntesTasa = ereDiasAntesTasa;
    }

    public BigDecimal getEreDiasAntesTasa() {
        return this.ereDiasAntesTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreTipoPromedio(BigDecimal ereTipoPromedio) {
        this.ereTipoPromedio = ereTipoPromedio;
    }

    public BigDecimal getEreTipoPromedio() {
        return this.ereTipoPromedio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreDiasNatural(BigDecimal ereDiasNatural) {
        this.ereDiasNatural = ereDiasNatural;
    }

    public BigDecimal getEreDiasNatural() {
        return this.ereDiasNatural;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErePeriodicidadProm(String erePeriodicidadProm) {
        this.erePeriodicidadProm = erePeriodicidadProm;
    }

    public String getErePeriodicidadProm() {
        return this.erePeriodicidadProm;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreNumDias(BigDecimal ereNumDias) {
        this.ereNumDias = ereNumDias;
    }

    public BigDecimal getEreNumDias() {
        return this.ereNumDias;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreDiaFijo(BigDecimal ereDiaFijo) {
        this.ereDiaFijo = ereDiaFijo;
    }

    public BigDecimal getEreDiaFijo() {
        return this.ereDiaFijo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreNumDiaFijo(BigDecimal ereNumDiaFijo) {
        this.ereNumDiaFijo = ereNumDiaFijo;
    }

    public BigDecimal getEreNumDiaFijo() {
        return this.ereNumDiaFijo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEreProceso(String ereProceso) {
        this.ereProceso = ereProceso;
    }

    public String getEreProceso() {
        return this.ereProceso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreCalcSobretasa(BigDecimal ereCalcSobretasa) {
        this.ereCalcSobretasa = ereCalcSobretasa;
    }

    public BigDecimal getEreCalcSobretasa() {
        return this.ereCalcSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreDiasAntesAvi(BigDecimal ereDiasAntesAvi) {
        this.ereDiasAntesAvi = ereDiasAntesAvi;
    }

    public BigDecimal getEreDiasAntesAvi() {
        return this.ereDiasAntesAvi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErePerPromedio(String erePerPromedio) {
        this.erePerPromedio = erePerPromedio;
    }

    public String getErePerPromedio() {
        return this.erePerPromedio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreNumDecimalesPp(BigDecimal ereNumDecimalesPp) {
        this.ereNumDecimalesPp = ereNumDecimalesPp;
    }

    public BigDecimal getEreNumDecimalesPp() {
        return this.ereNumDecimalesPp;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreSumaIsr(BigDecimal ereSumaIsr) {
        this.ereSumaIsr = ereSumaIsr;
    }

    public BigDecimal getEreSumaIsr() {
        return this.ereSumaIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreRedondeo(BigDecimal ereRedondeo) {
        this.ereRedondeo = ereRedondeo;
    }

    public BigDecimal getEreRedondeo() {
        return this.ereRedondeo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreAnoAltaReg(BigDecimal ereAnoAltaReg) {
        this.ereAnoAltaReg = ereAnoAltaReg;
    }

    public BigDecimal getEreAnoAltaReg() {
        return this.ereAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEreMesAltaReg(BigDecimal ereMesAltaReg) {
        this.ereMesAltaReg = ereMesAltaReg;
    }

    public BigDecimal getEreMesAltaReg() {
        return this.ereMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEreDiaAltaReg(BigDecimal ereDiaAltaReg) {
        this.ereDiaAltaReg = ereDiaAltaReg;
    }

    public BigDecimal getEreDiaAltaReg() {
        return this.ereDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEreAnoUltMod(BigDecimal ereAnoUltMod) {
        this.ereAnoUltMod = ereAnoUltMod;
    }

    public BigDecimal getEreAnoUltMod() {
        return this.ereAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEreMesUltMod(BigDecimal ereMesUltMod) {
        this.ereMesUltMod = ereMesUltMod;
    }

    public BigDecimal getEreMesUltMod() {
        return this.ereMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEreDiaUltMod(BigDecimal ereDiaUltMod) {
        this.ereDiaUltMod = ereDiaUltMod;
    }

    public BigDecimal getEreDiaUltMod() {
        return this.ereDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEreCveStEmisrend(String ereCveStEmisrend) {
        this.ereCveStEmisrend = ereCveStEmisrend;
    }

    public String getEreCveStEmisrend() {
        return this.ereCveStEmisrend;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISREND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEreNumPrograma() != null && this.getEreNumPrograma().longValue() == -999) {
            conditions += " AND ERE_NUM_PROGRAMA IS NULL";
        } else if (this.getEreNumPrograma() != null) {
            conditions += " AND ERE_NUM_PROGRAMA = ?";
            values.add(this.getEreNumPrograma());
        }

        if (this.getEreNumEmision() != null && this.getEreNumEmision().longValue() == -999) {
            conditions += " AND ERE_NUM_EMISION IS NULL";
        } else if (this.getEreNumEmision() != null) {
            conditions += " AND ERE_NUM_EMISION = ?";
            values.add(this.getEreNumEmision());
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
        String sql = "SELECT * FROM EMISREND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEreNumPrograma() != null && this.getEreNumPrograma().longValue() == -999) {
            conditions += " AND ERE_NUM_PROGRAMA IS NULL";
        } else if (this.getEreNumPrograma() != null) {
            conditions += " AND ERE_NUM_PROGRAMA = ?";
            values.add(this.getEreNumPrograma());
        }

        if (this.getEreNumEmision() != null && this.getEreNumEmision().longValue() == -999) {
            conditions += " AND ERE_NUM_EMISION IS NULL";
        } else if (this.getEreNumEmision() != null) {
            conditions += " AND ERE_NUM_EMISION = ?";
            values.add(this.getEreNumEmision());
        }

        if (this.getEreTipoCalculo() != null && this.getEreTipoCalculo().longValue() == -999) {
            conditions += " AND ERE_TIPO_CALCULO IS NULL";
        } else if (this.getEreTipoCalculo() != null) {
            conditions += " AND ERE_TIPO_CALCULO = ?";
            values.add(this.getEreTipoCalculo());
        }

        if (this.getEreNumFormula() != null && this.getEreNumFormula().longValue() == -999) {
            conditions += " AND ERE_NUM_FORMULA IS NULL";
        } else if (this.getEreNumFormula() != null) {
            conditions += " AND ERE_NUM_FORMULA = ?";
            values.add(this.getEreNumFormula());
        }

        if (this.getErePjeTasa() != null && this.getErePjeTasa().longValue() == -999) {
            conditions += " AND ERE_PJE_TASA IS NULL";
        } else if (this.getErePjeTasa() != null) {
            conditions += " AND ERE_PJE_TASA = ?";
            values.add(this.getErePjeTasa());
        }

        if (this.getEreDecimales() != null && this.getEreDecimales().longValue() == -999) {
            conditions += " AND ERE_DECIMALES IS NULL";
        } else if (this.getEreDecimales() != null) {
            conditions += " AND ERE_DECIMALES = ?";
            values.add(this.getEreDecimales());
        }

        if (this.getEreNumDecimales() != null && this.getEreNumDecimales().longValue() == -999) {
            conditions += " AND ERE_NUM_DECIMALES IS NULL";
        } else if (this.getEreNumDecimales() != null) {
            conditions += " AND ERE_NUM_DECIMALES = ?";
            values.add(this.getEreNumDecimales());
        }

        if (this.getEreNumTasaInt() != null && this.getEreNumTasaInt().longValue() == -999) {
            conditions += " AND ERE_NUM_TASA_INT IS NULL";
        } else if (this.getEreNumTasaInt() != null) {
            conditions += " AND ERE_NUM_TASA_INT = ?";
            values.add(this.getEreNumTasaInt());
        }

        if (this.getEreTasaInteres1() != null && this.getEreTasaInteres1().longValue() == -999) {
            conditions += " AND ERE_TASA_INTERES_1 IS NULL";
        } else if (this.getEreTasaInteres1() != null) {
            conditions += " AND ERE_TASA_INTERES_1 = ?";
            values.add(this.getEreTasaInteres1());
        }

        if (this.getEreDeterminaTrb() != null && "null".equals(this.getEreDeterminaTrb())) {
            conditions += " AND ERE_DETERMINA_TRB IS NULL";
        } else if (this.getEreDeterminaTrb() != null) {
            conditions += " AND ERE_DETERMINA_TRB = ?";
            values.add(this.getEreDeterminaTrb());
        }

        if (this.getEreDeterminaTrn() != null && "null".equals(this.getEreDeterminaTrn())) {
            conditions += " AND ERE_DETERMINA_TRN IS NULL";
        } else if (this.getEreDeterminaTrn() != null) {
            conditions += " AND ERE_DETERMINA_TRN = ?";
            values.add(this.getEreDeterminaTrn());
        }

        if (this.getEreAbsolutaTrb() != null && this.getEreAbsolutaTrb().longValue() == -999) {
            conditions += " AND ERE_ABSOLUTA_TRB IS NULL";
        } else if (this.getEreAbsolutaTrb() != null) {
            conditions += " AND ERE_ABSOLUTA_TRB = ?";
            values.add(this.getEreAbsolutaTrb());
        }

        if (this.getEreAbsNumDec() != null && this.getEreAbsNumDec().longValue() == -999) {
            conditions += " AND ERE_ABS_NUM_DEC IS NULL";
        } else if (this.getEreAbsNumDec() != null) {
            conditions += " AND ERE_ABS_NUM_DEC = ?";
            values.add(this.getEreAbsNumDec());
        }

        if (this.getEreDiasAntesTasa() != null && this.getEreDiasAntesTasa().longValue() == -999) {
            conditions += " AND ERE_DIAS_ANTES_TASA IS NULL";
        } else if (this.getEreDiasAntesTasa() != null) {
            conditions += " AND ERE_DIAS_ANTES_TASA = ?";
            values.add(this.getEreDiasAntesTasa());
        }

        if (this.getEreTipoPromedio() != null && this.getEreTipoPromedio().longValue() == -999) {
            conditions += " AND ERE_TIPO_PROMEDIO IS NULL";
        } else if (this.getEreTipoPromedio() != null) {
            conditions += " AND ERE_TIPO_PROMEDIO = ?";
            values.add(this.getEreTipoPromedio());
        }

        if (this.getEreDiasNatural() != null && this.getEreDiasNatural().longValue() == -999) {
            conditions += " AND ERE_DIAS_NATURAL IS NULL";
        } else if (this.getEreDiasNatural() != null) {
            conditions += " AND ERE_DIAS_NATURAL = ?";
            values.add(this.getEreDiasNatural());
        }

        if (this.getErePeriodicidadProm() != null && "null".equals(this.getErePeriodicidadProm())) {
            conditions += " AND ERE_PERIODICIDAD_PROM IS NULL";
        } else if (this.getErePeriodicidadProm() != null) {
            conditions += " AND ERE_PERIODICIDAD_PROM = ?";
            values.add(this.getErePeriodicidadProm());
        }

        if (this.getEreNumDias() != null && this.getEreNumDias().longValue() == -999) {
            conditions += " AND ERE_NUM_DIAS IS NULL";
        } else if (this.getEreNumDias() != null) {
            conditions += " AND ERE_NUM_DIAS = ?";
            values.add(this.getEreNumDias());
        }

        if (this.getEreDiaFijo() != null && this.getEreDiaFijo().longValue() == -999) {
            conditions += " AND ERE_DIA_FIJO IS NULL";
        } else if (this.getEreDiaFijo() != null) {
            conditions += " AND ERE_DIA_FIJO = ?";
            values.add(this.getEreDiaFijo());
        }

        if (this.getEreNumDiaFijo() != null && this.getEreNumDiaFijo().longValue() == -999) {
            conditions += " AND ERE_NUM_DIA_FIJO IS NULL";
        } else if (this.getEreNumDiaFijo() != null) {
            conditions += " AND ERE_NUM_DIA_FIJO = ?";
            values.add(this.getEreNumDiaFijo());
        }

        if (this.getEreProceso() != null && "null".equals(this.getEreProceso())) {
            conditions += " AND ERE_PROCESO IS NULL";
        } else if (this.getEreProceso() != null) {
            conditions += " AND ERE_PROCESO = ?";
            values.add(this.getEreProceso());
        }

        if (this.getEreCalcSobretasa() != null && this.getEreCalcSobretasa().longValue() == -999) {
            conditions += " AND ERE_CALC_SOBRETASA IS NULL";
        } else if (this.getEreCalcSobretasa() != null) {
            conditions += " AND ERE_CALC_SOBRETASA = ?";
            values.add(this.getEreCalcSobretasa());
        }

        if (this.getEreDiasAntesAvi() != null && this.getEreDiasAntesAvi().longValue() == -999) {
            conditions += " AND ERE_DIAS_ANTES_AVI IS NULL";
        } else if (this.getEreDiasAntesAvi() != null) {
            conditions += " AND ERE_DIAS_ANTES_AVI = ?";
            values.add(this.getEreDiasAntesAvi());
        }

        if (this.getErePerPromedio() != null && "null".equals(this.getErePerPromedio())) {
            conditions += " AND ERE_PER_PROMEDIO IS NULL";
        } else if (this.getErePerPromedio() != null) {
            conditions += " AND ERE_PER_PROMEDIO = ?";
            values.add(this.getErePerPromedio());
        }

        if (this.getEreNumDecimalesPp() != null && this.getEreNumDecimalesPp().longValue() == -999) {
            conditions += " AND ERE_NUM_DECIMALES_PP IS NULL";
        } else if (this.getEreNumDecimalesPp() != null) {
            conditions += " AND ERE_NUM_DECIMALES_PP = ?";
            values.add(this.getEreNumDecimalesPp());
        }

        if (this.getEreSumaIsr() != null && this.getEreSumaIsr().longValue() == -999) {
            conditions += " AND ERE_SUMA_ISR IS NULL";
        } else if (this.getEreSumaIsr() != null) {
            conditions += " AND ERE_SUMA_ISR = ?";
            values.add(this.getEreSumaIsr());
        }

        if (this.getEreRedondeo() != null && this.getEreRedondeo().longValue() == -999) {
            conditions += " AND ERE_REDONDEO IS NULL";
        } else if (this.getEreRedondeo() != null) {
            conditions += " AND ERE_REDONDEO = ?";
            values.add(this.getEreRedondeo());
        }

        if (this.getEreAnoAltaReg() != null && this.getEreAnoAltaReg().longValue() == -999) {
            conditions += " AND ERE_ANO_ALTA_REG IS NULL";
        } else if (this.getEreAnoAltaReg() != null) {
            conditions += " AND ERE_ANO_ALTA_REG = ?";
            values.add(this.getEreAnoAltaReg());
        }

        if (this.getEreMesAltaReg() != null && this.getEreMesAltaReg().longValue() == -999) {
            conditions += " AND ERE_MES_ALTA_REG IS NULL";
        } else if (this.getEreMesAltaReg() != null) {
            conditions += " AND ERE_MES_ALTA_REG = ?";
            values.add(this.getEreMesAltaReg());
        }

        if (this.getEreDiaAltaReg() != null && this.getEreDiaAltaReg().longValue() == -999) {
            conditions += " AND ERE_DIA_ALTA_REG IS NULL";
        } else if (this.getEreDiaAltaReg() != null) {
            conditions += " AND ERE_DIA_ALTA_REG = ?";
            values.add(this.getEreDiaAltaReg());
        }

        if (this.getEreAnoUltMod() != null && this.getEreAnoUltMod().longValue() == -999) {
            conditions += " AND ERE_ANO_ULT_MOD IS NULL";
        } else if (this.getEreAnoUltMod() != null) {
            conditions += " AND ERE_ANO_ULT_MOD = ?";
            values.add(this.getEreAnoUltMod());
        }

        if (this.getEreMesUltMod() != null && this.getEreMesUltMod().longValue() == -999) {
            conditions += " AND ERE_MES_ULT_MOD IS NULL";
        } else if (this.getEreMesUltMod() != null) {
            conditions += " AND ERE_MES_ULT_MOD = ?";
            values.add(this.getEreMesUltMod());
        }

        if (this.getEreDiaUltMod() != null && this.getEreDiaUltMod().longValue() == -999) {
            conditions += " AND ERE_DIA_ULT_MOD IS NULL";
        } else if (this.getEreDiaUltMod() != null) {
            conditions += " AND ERE_DIA_ULT_MOD = ?";
            values.add(this.getEreDiaUltMod());
        }

        if (this.getEreCveStEmisrend() != null && "null".equals(this.getEreCveStEmisrend())) {
            conditions += " AND ERE_CVE_ST_EMISREND IS NULL";
        } else if (this.getEreCveStEmisrend() != null) {
            conditions += " AND ERE_CVE_ST_EMISREND = ?";
            values.add(this.getEreCveStEmisrend());
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
        String sql = "UPDATE EMISREND SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ERE_NUM_PROGRAMA = ?";
        pkValues.add(this.getEreNumPrograma());
        conditions += " AND ERE_NUM_EMISION = ?";
        pkValues.add(this.getEreNumEmision());
        fields += " ERE_TIPO_CALCULO = ?, ";
        values.add(this.getEreTipoCalculo());
        fields += " ERE_NUM_FORMULA = ?, ";
        values.add(this.getEreNumFormula());
        fields += " ERE_PJE_TASA = ?, ";
        values.add(this.getErePjeTasa());
        fields += " ERE_DECIMALES = ?, ";
        values.add(this.getEreDecimales());
        fields += " ERE_NUM_DECIMALES = ?, ";
        values.add(this.getEreNumDecimales());
        fields += " ERE_NUM_TASA_INT = ?, ";
        values.add(this.getEreNumTasaInt());
        fields += " ERE_TASA_INTERES_1 = ?, ";
        values.add(this.getEreTasaInteres1());
        fields += " ERE_DETERMINA_TRB = ?, ";
        values.add(this.getEreDeterminaTrb());
        fields += " ERE_DETERMINA_TRN = ?, ";
        values.add(this.getEreDeterminaTrn());
        fields += " ERE_ABSOLUTA_TRB = ?, ";
        values.add(this.getEreAbsolutaTrb());
        fields += " ERE_ABS_NUM_DEC = ?, ";
        values.add(this.getEreAbsNumDec());
        fields += " ERE_DIAS_ANTES_TASA = ?, ";
        values.add(this.getEreDiasAntesTasa());
        fields += " ERE_TIPO_PROMEDIO = ?, ";
        values.add(this.getEreTipoPromedio());
        fields += " ERE_DIAS_NATURAL = ?, ";
        values.add(this.getEreDiasNatural());
        fields += " ERE_PERIODICIDAD_PROM = ?, ";
        values.add(this.getErePeriodicidadProm());
        fields += " ERE_NUM_DIAS = ?, ";
        values.add(this.getEreNumDias());
        fields += " ERE_DIA_FIJO = ?, ";
        values.add(this.getEreDiaFijo());
        fields += " ERE_NUM_DIA_FIJO = ?, ";
        values.add(this.getEreNumDiaFijo());
        fields += " ERE_PROCESO = ?, ";
        values.add(this.getEreProceso());
        fields += " ERE_CALC_SOBRETASA = ?, ";
        values.add(this.getEreCalcSobretasa());
        fields += " ERE_DIAS_ANTES_AVI = ?, ";
        values.add(this.getEreDiasAntesAvi());
        fields += " ERE_PER_PROMEDIO = ?, ";
        values.add(this.getErePerPromedio());
        fields += " ERE_NUM_DECIMALES_PP = ?, ";
        values.add(this.getEreNumDecimalesPp());
        fields += " ERE_SUMA_ISR = ?, ";
        values.add(this.getEreSumaIsr());
        fields += " ERE_REDONDEO = ?, ";
        values.add(this.getEreRedondeo());
        fields += " ERE_ANO_ALTA_REG = ?, ";
        values.add(this.getEreAnoAltaReg());
        fields += " ERE_MES_ALTA_REG = ?, ";
        values.add(this.getEreMesAltaReg());
        fields += " ERE_DIA_ALTA_REG = ?, ";
        values.add(this.getEreDiaAltaReg());
        fields += " ERE_ANO_ULT_MOD = ?, ";
        values.add(this.getEreAnoUltMod());
        fields += " ERE_MES_ULT_MOD = ?, ";
        values.add(this.getEreMesUltMod());
        fields += " ERE_DIA_ULT_MOD = ?, ";
        values.add(this.getEreDiaUltMod());
        fields += " ERE_CVE_ST_EMISREND = ?, ";
        values.add(this.getEreCveStEmisrend());
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
        String sql = "INSERT INTO EMISREND ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ERE_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEreNumPrograma());

        fields += ", ERE_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEreNumEmision());

        fields += ", ERE_TIPO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEreTipoCalculo());

        fields += ", ERE_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getEreNumFormula());

        fields += ", ERE_PJE_TASA";
        fieldValues += ", ?";
        values.add(this.getErePjeTasa());

        fields += ", ERE_DECIMALES";
        fieldValues += ", ?";
        values.add(this.getEreDecimales());

        fields += ", ERE_NUM_DECIMALES";
        fieldValues += ", ?";
        values.add(this.getEreNumDecimales());

        fields += ", ERE_NUM_TASA_INT";
        fieldValues += ", ?";
        values.add(this.getEreNumTasaInt());

        fields += ", ERE_TASA_INTERES_1";
        fieldValues += ", ?";
        values.add(this.getEreTasaInteres1());

        fields += ", ERE_DETERMINA_TRB";
        fieldValues += ", ?";
        values.add(this.getEreDeterminaTrb());

        fields += ", ERE_DETERMINA_TRN";
        fieldValues += ", ?";
        values.add(this.getEreDeterminaTrn());

        fields += ", ERE_ABSOLUTA_TRB";
        fieldValues += ", ?";
        values.add(this.getEreAbsolutaTrb());

        fields += ", ERE_ABS_NUM_DEC";
        fieldValues += ", ?";
        values.add(this.getEreAbsNumDec());

        fields += ", ERE_DIAS_ANTES_TASA";
        fieldValues += ", ?";
        values.add(this.getEreDiasAntesTasa());

        fields += ", ERE_TIPO_PROMEDIO";
        fieldValues += ", ?";
        values.add(this.getEreTipoPromedio());

        fields += ", ERE_DIAS_NATURAL";
        fieldValues += ", ?";
        values.add(this.getEreDiasNatural());

        fields += ", ERE_PERIODICIDAD_PROM";
        fieldValues += ", ?";
        values.add(this.getErePeriodicidadProm());

        fields += ", ERE_NUM_DIAS";
        fieldValues += ", ?";
        values.add(this.getEreNumDias());

        fields += ", ERE_DIA_FIJO";
        fieldValues += ", ?";
        values.add(this.getEreDiaFijo());

        fields += ", ERE_NUM_DIA_FIJO";
        fieldValues += ", ?";
        values.add(this.getEreNumDiaFijo());

        fields += ", ERE_PROCESO";
        fieldValues += ", ?";
        values.add(this.getEreProceso());

        fields += ", ERE_CALC_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getEreCalcSobretasa());

        fields += ", ERE_DIAS_ANTES_AVI";
        fieldValues += ", ?";
        values.add(this.getEreDiasAntesAvi());

        fields += ", ERE_PER_PROMEDIO";
        fieldValues += ", ?";
        values.add(this.getErePerPromedio());

        fields += ", ERE_NUM_DECIMALES_PP";
        fieldValues += ", ?";
        values.add(this.getEreNumDecimalesPp());

        fields += ", ERE_SUMA_ISR";
        fieldValues += ", ?";
        values.add(this.getEreSumaIsr());

        fields += ", ERE_REDONDEO";
        fieldValues += ", ?";
        values.add(this.getEreRedondeo());

        fields += ", ERE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEreAnoAltaReg());

        fields += ", ERE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEreMesAltaReg());

        fields += ", ERE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEreDiaAltaReg());

        fields += ", ERE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEreAnoUltMod());

        fields += ", ERE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEreMesUltMod());

        fields += ", ERE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEreDiaUltMod());

        fields += ", ERE_CVE_ST_EMISREND";
        fieldValues += ", ?";
        values.add(this.getEreCveStEmisrend());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISREND WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ERE_NUM_PROGRAMA = ?";
        values.add(this.getEreNumPrograma());
        conditions += " AND ERE_NUM_EMISION = ?";
        values.add(this.getEreNumEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisrend instance = (Emisrend) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEreNumPrograma().equals(instance.getEreNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEreNumEmision().equals(instance.getEreNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEreTipoCalculo().equals(instance.getEreTipoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getEreNumFormula().equals(instance.getEreNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getErePjeTasa().equals(instance.getErePjeTasa()))
            equalObjects = false;
        if (equalObjects && !this.getEreDecimales().equals(instance.getEreDecimales()))
            equalObjects = false;
        if (equalObjects && !this.getEreNumDecimales().equals(instance.getEreNumDecimales()))
            equalObjects = false;
        if (equalObjects && !this.getEreNumTasaInt().equals(instance.getEreNumTasaInt()))
            equalObjects = false;
        if (equalObjects && !this.getEreTasaInteres1().equals(instance.getEreTasaInteres1()))
            equalObjects = false;
        if (equalObjects && !this.getEreDeterminaTrb().equals(instance.getEreDeterminaTrb()))
            equalObjects = false;
        if (equalObjects && !this.getEreDeterminaTrn().equals(instance.getEreDeterminaTrn()))
            equalObjects = false;
        if (equalObjects && !this.getEreAbsolutaTrb().equals(instance.getEreAbsolutaTrb()))
            equalObjects = false;
        if (equalObjects && !this.getEreAbsNumDec().equals(instance.getEreAbsNumDec()))
            equalObjects = false;
        if (equalObjects && !this.getEreDiasAntesTasa().equals(instance.getEreDiasAntesTasa()))
            equalObjects = false;
        if (equalObjects && !this.getEreTipoPromedio().equals(instance.getEreTipoPromedio()))
            equalObjects = false;
        if (equalObjects && !this.getEreDiasNatural().equals(instance.getEreDiasNatural()))
            equalObjects = false;
        if (equalObjects && !this.getErePeriodicidadProm().equals(instance.getErePeriodicidadProm()))
            equalObjects = false;
        if (equalObjects && !this.getEreNumDias().equals(instance.getEreNumDias()))
            equalObjects = false;
        if (equalObjects && !this.getEreDiaFijo().equals(instance.getEreDiaFijo()))
            equalObjects = false;
        if (equalObjects && !this.getEreNumDiaFijo().equals(instance.getEreNumDiaFijo()))
            equalObjects = false;
        if (equalObjects && !this.getEreProceso().equals(instance.getEreProceso()))
            equalObjects = false;
        if (equalObjects && !this.getEreCalcSobretasa().equals(instance.getEreCalcSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getEreDiasAntesAvi().equals(instance.getEreDiasAntesAvi()))
            equalObjects = false;
        if (equalObjects && !this.getErePerPromedio().equals(instance.getErePerPromedio()))
            equalObjects = false;
        if (equalObjects && !this.getEreNumDecimalesPp().equals(instance.getEreNumDecimalesPp()))
            equalObjects = false;
        if (equalObjects && !this.getEreSumaIsr().equals(instance.getEreSumaIsr()))
            equalObjects = false;
        if (equalObjects && !this.getEreRedondeo().equals(instance.getEreRedondeo()))
            equalObjects = false;
        if (equalObjects && !this.getEreAnoAltaReg().equals(instance.getEreAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEreMesAltaReg().equals(instance.getEreMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEreDiaAltaReg().equals(instance.getEreDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEreAnoUltMod().equals(instance.getEreAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEreMesUltMod().equals(instance.getEreMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEreDiaUltMod().equals(instance.getEreDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEreCveStEmisrend().equals(instance.getEreCveStEmisrend()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisrend result = new Emisrend();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEreNumPrograma((BigDecimal) objectData.getData("ERE_NUM_PROGRAMA"));
        result.setEreNumEmision((BigDecimal) objectData.getData("ERE_NUM_EMISION"));
        result.setEreTipoCalculo((BigDecimal) objectData.getData("ERE_TIPO_CALCULO"));
        result.setEreNumFormula((BigDecimal) objectData.getData("ERE_NUM_FORMULA"));
        result.setErePjeTasa((BigDecimal) objectData.getData("ERE_PJE_TASA"));
        result.setEreDecimales((BigDecimal) objectData.getData("ERE_DECIMALES"));
        result.setEreNumDecimales((BigDecimal) objectData.getData("ERE_NUM_DECIMALES"));
        result.setEreNumTasaInt((BigDecimal) objectData.getData("ERE_NUM_TASA_INT"));
        result.setEreTasaInteres1((BigDecimal) objectData.getData("ERE_TASA_INTERES_1"));
        result.setEreDeterminaTrb((String) objectData.getData("ERE_DETERMINA_TRB"));
        result.setEreDeterminaTrn((String) objectData.getData("ERE_DETERMINA_TRN"));
        result.setEreAbsolutaTrb((BigDecimal) objectData.getData("ERE_ABSOLUTA_TRB"));
        result.setEreAbsNumDec((BigDecimal) objectData.getData("ERE_ABS_NUM_DEC"));
        result.setEreDiasAntesTasa((BigDecimal) objectData.getData("ERE_DIAS_ANTES_TASA"));
        result.setEreTipoPromedio((BigDecimal) objectData.getData("ERE_TIPO_PROMEDIO"));
        result.setEreDiasNatural((BigDecimal) objectData.getData("ERE_DIAS_NATURAL"));
        result.setErePeriodicidadProm((String) objectData.getData("ERE_PERIODICIDAD_PROM"));
        result.setEreNumDias((BigDecimal) objectData.getData("ERE_NUM_DIAS"));
        result.setEreDiaFijo((BigDecimal) objectData.getData("ERE_DIA_FIJO"));
        result.setEreNumDiaFijo((BigDecimal) objectData.getData("ERE_NUM_DIA_FIJO"));
        result.setEreProceso((String) objectData.getData("ERE_PROCESO"));
        result.setEreCalcSobretasa((BigDecimal) objectData.getData("ERE_CALC_SOBRETASA"));
        result.setEreDiasAntesAvi((BigDecimal) objectData.getData("ERE_DIAS_ANTES_AVI"));
        result.setErePerPromedio((String) objectData.getData("ERE_PER_PROMEDIO"));
        result.setEreNumDecimalesPp((BigDecimal) objectData.getData("ERE_NUM_DECIMALES_PP"));
        result.setEreSumaIsr((BigDecimal) objectData.getData("ERE_SUMA_ISR"));
        result.setEreRedondeo((BigDecimal) objectData.getData("ERE_REDONDEO"));
        result.setEreAnoAltaReg((BigDecimal) objectData.getData("ERE_ANO_ALTA_REG"));
        result.setEreMesAltaReg((BigDecimal) objectData.getData("ERE_MES_ALTA_REG"));
        result.setEreDiaAltaReg((BigDecimal) objectData.getData("ERE_DIA_ALTA_REG"));
        result.setEreAnoUltMod((BigDecimal) objectData.getData("ERE_ANO_ULT_MOD"));
        result.setEreMesUltMod((BigDecimal) objectData.getData("ERE_MES_ULT_MOD"));
        result.setEreDiaUltMod((BigDecimal) objectData.getData("ERE_DIA_ULT_MOD"));
        result.setEreCveStEmisrend((String) objectData.getData("ERE_CVE_ST_EMISREND"));

        return result;

    }

}
