package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIREND_PK", columns = { "EERE_ID_PROGRAMA", "EERE_ID_FIDEICOMISO", "EERE_ID_EMISION" }, sequences = { "MANUAL" })
public class FEmirend extends DomainObject {

    BigDecimal eereIdPrograma = null;
    BigDecimal eereIdFideicomiso = null;
    BigDecimal eereIdEmision = null;
    BigDecimal eereTipoCalculo = null;
    BigDecimal eerePjeTasa = null;
    BigDecimal eereNumFormula = null;
    BigDecimal eereDecimales = null;
    BigDecimal eereNumDecimales = null;
    BigDecimal eereNumTasaInt = null;
    BigDecimal eereTasaInteres1 = null;
    BigDecimal eereDeterminaTrb = null;
    BigDecimal eereDeterminaTrn = null;
    BigDecimal eereAbsolutaTrb = null;
    BigDecimal eereAbsNumDec = null;
    BigDecimal eereDiasAntesTasa = null;
    BigDecimal eereNumDecimalesPp = null;
    BigDecimal eereSumaIsr = null;
    BigDecimal eereRedondeo = null;
    BigDecimal eereTipoPromedio = null;
    BigDecimal eereCalcSobretasa = null;
    String eerePerPromedio = null;
    String eereProceso = null;
    BigDecimal eereDiasNatural = null;
    String eerePeriodicidadProm = null;
    BigDecimal eereNumDias = null;
    BigDecimal eereDiaFijo = null;
    BigDecimal eereNumDiaFijo = null;
    BigDecimal eereDiasAntesAvi = null;
    String eereStEmirend = null;

    public FEmirend() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEereIdPrograma(BigDecimal eereIdPrograma) {
        this.eereIdPrograma = eereIdPrograma;
    }

    public BigDecimal getEereIdPrograma() {
        return this.eereIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEereIdFideicomiso(BigDecimal eereIdFideicomiso) {
        this.eereIdFideicomiso = eereIdFideicomiso;
    }

    public BigDecimal getEereIdFideicomiso() {
        return this.eereIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEereIdEmision(BigDecimal eereIdEmision) {
        this.eereIdEmision = eereIdEmision;
    }

    public BigDecimal getEereIdEmision() {
        return this.eereIdEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEereTipoCalculo(BigDecimal eereTipoCalculo) {
        this.eereTipoCalculo = eereTipoCalculo;
    }

    public BigDecimal getEereTipoCalculo() {
        return this.eereTipoCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEerePjeTasa(BigDecimal eerePjeTasa) {
        this.eerePjeTasa = eerePjeTasa;
    }

    public BigDecimal getEerePjeTasa() {
        return this.eerePjeTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEereNumFormula(BigDecimal eereNumFormula) {
        this.eereNumFormula = eereNumFormula;
    }

    public BigDecimal getEereNumFormula() {
        return this.eereNumFormula;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereDecimales(BigDecimal eereDecimales) {
        this.eereDecimales = eereDecimales;
    }

    public BigDecimal getEereDecimales() {
        return this.eereDecimales;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereNumDecimales(BigDecimal eereNumDecimales) {
        this.eereNumDecimales = eereNumDecimales;
    }

    public BigDecimal getEereNumDecimales() {
        return this.eereNumDecimales;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereNumTasaInt(BigDecimal eereNumTasaInt) {
        this.eereNumTasaInt = eereNumTasaInt;
    }

    public BigDecimal getEereNumTasaInt() {
        return this.eereNumTasaInt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEereTasaInteres1(BigDecimal eereTasaInteres1) {
        this.eereTasaInteres1 = eereTasaInteres1;
    }

    public BigDecimal getEereTasaInteres1() {
        return this.eereTasaInteres1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereDeterminaTrb(BigDecimal eereDeterminaTrb) {
        this.eereDeterminaTrb = eereDeterminaTrb;
    }

    public BigDecimal getEereDeterminaTrb() {
        return this.eereDeterminaTrb;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereDeterminaTrn(BigDecimal eereDeterminaTrn) {
        this.eereDeterminaTrn = eereDeterminaTrn;
    }

    public BigDecimal getEereDeterminaTrn() {
        return this.eereDeterminaTrn;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereAbsolutaTrb(BigDecimal eereAbsolutaTrb) {
        this.eereAbsolutaTrb = eereAbsolutaTrb;
    }

    public BigDecimal getEereAbsolutaTrb() {
        return this.eereAbsolutaTrb;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereAbsNumDec(BigDecimal eereAbsNumDec) {
        this.eereAbsNumDec = eereAbsNumDec;
    }

    public BigDecimal getEereAbsNumDec() {
        return this.eereAbsNumDec;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereDiasAntesTasa(BigDecimal eereDiasAntesTasa) {
        this.eereDiasAntesTasa = eereDiasAntesTasa;
    }

    public BigDecimal getEereDiasAntesTasa() {
        return this.eereDiasAntesTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereNumDecimalesPp(BigDecimal eereNumDecimalesPp) {
        this.eereNumDecimalesPp = eereNumDecimalesPp;
    }

    public BigDecimal getEereNumDecimalesPp() {
        return this.eereNumDecimalesPp;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereSumaIsr(BigDecimal eereSumaIsr) {
        this.eereSumaIsr = eereSumaIsr;
    }

    public BigDecimal getEereSumaIsr() {
        return this.eereSumaIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereRedondeo(BigDecimal eereRedondeo) {
        this.eereRedondeo = eereRedondeo;
    }

    public BigDecimal getEereRedondeo() {
        return this.eereRedondeo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereTipoPromedio(BigDecimal eereTipoPromedio) {
        this.eereTipoPromedio = eereTipoPromedio;
    }

    public BigDecimal getEereTipoPromedio() {
        return this.eereTipoPromedio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereCalcSobretasa(BigDecimal eereCalcSobretasa) {
        this.eereCalcSobretasa = eereCalcSobretasa;
    }

    public BigDecimal getEereCalcSobretasa() {
        return this.eereCalcSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEerePerPromedio(String eerePerPromedio) {
        this.eerePerPromedio = eerePerPromedio;
    }

    public String getEerePerPromedio() {
        return this.eerePerPromedio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEereProceso(String eereProceso) {
        this.eereProceso = eereProceso;
    }

    public String getEereProceso() {
        return this.eereProceso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereDiasNatural(BigDecimal eereDiasNatural) {
        this.eereDiasNatural = eereDiasNatural;
    }

    public BigDecimal getEereDiasNatural() {
        return this.eereDiasNatural;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEerePeriodicidadProm(String eerePeriodicidadProm) {
        this.eerePeriodicidadProm = eerePeriodicidadProm;
    }

    public String getEerePeriodicidadProm() {
        return this.eerePeriodicidadProm;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereNumDias(BigDecimal eereNumDias) {
        this.eereNumDias = eereNumDias;
    }

    public BigDecimal getEereNumDias() {
        return this.eereNumDias;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereDiaFijo(BigDecimal eereDiaFijo) {
        this.eereDiaFijo = eereDiaFijo;
    }

    public BigDecimal getEereDiaFijo() {
        return this.eereDiaFijo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereNumDiaFijo(BigDecimal eereNumDiaFijo) {
        this.eereNumDiaFijo = eereNumDiaFijo;
    }

    public BigDecimal getEereNumDiaFijo() {
        return this.eereNumDiaFijo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEereDiasAntesAvi(BigDecimal eereDiasAntesAvi) {
        this.eereDiasAntesAvi = eereDiasAntesAvi;
    }

    public BigDecimal getEereDiasAntesAvi() {
        return this.eereDiasAntesAvi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEereStEmirend(String eereStEmirend) {
        this.eereStEmirend = eereStEmirend;
    }

    public String getEereStEmirend() {
        return this.eereStEmirend;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIREND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEereIdPrograma() != null && this.getEereIdPrograma().longValue() == -999) {
            conditions += " AND EERE_ID_PROGRAMA IS NULL";
        } else if (this.getEereIdPrograma() != null) {
            conditions += " AND EERE_ID_PROGRAMA = ?";
            values.add(this.getEereIdPrograma());
        }

        if (this.getEereIdFideicomiso() != null && this.getEereIdFideicomiso().longValue() == -999) {
            conditions += " AND EERE_ID_FIDEICOMISO IS NULL";
        } else if (this.getEereIdFideicomiso() != null) {
            conditions += " AND EERE_ID_FIDEICOMISO = ?";
            values.add(this.getEereIdFideicomiso());
        }

        if (this.getEereIdEmision() != null && this.getEereIdEmision().longValue() == -999) {
            conditions += " AND EERE_ID_EMISION IS NULL";
        } else if (this.getEereIdEmision() != null) {
            conditions += " AND EERE_ID_EMISION = ?";
            values.add(this.getEereIdEmision());
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
        String sql = "SELECT * FROM F_EMIREND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEereIdPrograma() != null && this.getEereIdPrograma().longValue() == -999) {
            conditions += " AND EERE_ID_PROGRAMA IS NULL";
        } else if (this.getEereIdPrograma() != null) {
            conditions += " AND EERE_ID_PROGRAMA = ?";
            values.add(this.getEereIdPrograma());
        }

        if (this.getEereIdFideicomiso() != null && this.getEereIdFideicomiso().longValue() == -999) {
            conditions += " AND EERE_ID_FIDEICOMISO IS NULL";
        } else if (this.getEereIdFideicomiso() != null) {
            conditions += " AND EERE_ID_FIDEICOMISO = ?";
            values.add(this.getEereIdFideicomiso());
        }

        if (this.getEereIdEmision() != null && this.getEereIdEmision().longValue() == -999) {
            conditions += " AND EERE_ID_EMISION IS NULL";
        } else if (this.getEereIdEmision() != null) {
            conditions += " AND EERE_ID_EMISION = ?";
            values.add(this.getEereIdEmision());
        }

        if (this.getEereTipoCalculo() != null && this.getEereTipoCalculo().longValue() == -999) {
            conditions += " AND EERE_TIPO_CALCULO IS NULL";
        } else if (this.getEereTipoCalculo() != null) {
            conditions += " AND EERE_TIPO_CALCULO = ?";
            values.add(this.getEereTipoCalculo());
        }

        if (this.getEerePjeTasa() != null && this.getEerePjeTasa().longValue() == -999) {
            conditions += " AND EERE_PJE_TASA IS NULL";
        } else if (this.getEerePjeTasa() != null) {
            conditions += " AND EERE_PJE_TASA = ?";
            values.add(this.getEerePjeTasa());
        }

        if (this.getEereNumFormula() != null && this.getEereNumFormula().longValue() == -999) {
            conditions += " AND EERE_NUM_FORMULA IS NULL";
        } else if (this.getEereNumFormula() != null) {
            conditions += " AND EERE_NUM_FORMULA = ?";
            values.add(this.getEereNumFormula());
        }

        if (this.getEereDecimales() != null && this.getEereDecimales().longValue() == -999) {
            conditions += " AND EERE_DECIMALES IS NULL";
        } else if (this.getEereDecimales() != null) {
            conditions += " AND EERE_DECIMALES = ?";
            values.add(this.getEereDecimales());
        }

        if (this.getEereNumDecimales() != null && this.getEereNumDecimales().longValue() == -999) {
            conditions += " AND EERE_NUM_DECIMALES IS NULL";
        } else if (this.getEereNumDecimales() != null) {
            conditions += " AND EERE_NUM_DECIMALES = ?";
            values.add(this.getEereNumDecimales());
        }

        if (this.getEereNumTasaInt() != null && this.getEereNumTasaInt().longValue() == -999) {
            conditions += " AND EERE_NUM_TASA_INT IS NULL";
        } else if (this.getEereNumTasaInt() != null) {
            conditions += " AND EERE_NUM_TASA_INT = ?";
            values.add(this.getEereNumTasaInt());
        }

        if (this.getEereTasaInteres1() != null && this.getEereTasaInteres1().longValue() == -999) {
            conditions += " AND EERE_TASA_INTERES_1 IS NULL";
        } else if (this.getEereTasaInteres1() != null) {
            conditions += " AND EERE_TASA_INTERES_1 = ?";
            values.add(this.getEereTasaInteres1());
        }

        if (this.getEereDeterminaTrb() != null && this.getEereDeterminaTrb().longValue() == -999) {
            conditions += " AND EERE_DETERMINA_TRB IS NULL";
        } else if (this.getEereDeterminaTrb() != null) {
            conditions += " AND EERE_DETERMINA_TRB = ?";
            values.add(this.getEereDeterminaTrb());
        }

        if (this.getEereDeterminaTrn() != null && this.getEereDeterminaTrn().longValue() == -999) {
            conditions += " AND EERE_DETERMINA_TRN IS NULL";
        } else if (this.getEereDeterminaTrn() != null) {
            conditions += " AND EERE_DETERMINA_TRN = ?";
            values.add(this.getEereDeterminaTrn());
        }

        if (this.getEereAbsolutaTrb() != null && this.getEereAbsolutaTrb().longValue() == -999) {
            conditions += " AND EERE_ABSOLUTA_TRB IS NULL";
        } else if (this.getEereAbsolutaTrb() != null) {
            conditions += " AND EERE_ABSOLUTA_TRB = ?";
            values.add(this.getEereAbsolutaTrb());
        }

        if (this.getEereAbsNumDec() != null && this.getEereAbsNumDec().longValue() == -999) {
            conditions += " AND EERE_ABS_NUM_DEC IS NULL";
        } else if (this.getEereAbsNumDec() != null) {
            conditions += " AND EERE_ABS_NUM_DEC = ?";
            values.add(this.getEereAbsNumDec());
        }

        if (this.getEereDiasAntesTasa() != null && this.getEereDiasAntesTasa().longValue() == -999) {
            conditions += " AND EERE_DIAS_ANTES_TASA IS NULL";
        } else if (this.getEereDiasAntesTasa() != null) {
            conditions += " AND EERE_DIAS_ANTES_TASA = ?";
            values.add(this.getEereDiasAntesTasa());
        }

        if (this.getEereNumDecimalesPp() != null && this.getEereNumDecimalesPp().longValue() == -999) {
            conditions += " AND EERE_NUM_DECIMALES_PP IS NULL";
        } else if (this.getEereNumDecimalesPp() != null) {
            conditions += " AND EERE_NUM_DECIMALES_PP = ?";
            values.add(this.getEereNumDecimalesPp());
        }

        if (this.getEereSumaIsr() != null && this.getEereSumaIsr().longValue() == -999) {
            conditions += " AND EERE_SUMA_ISR IS NULL";
        } else if (this.getEereSumaIsr() != null) {
            conditions += " AND EERE_SUMA_ISR = ?";
            values.add(this.getEereSumaIsr());
        }

        if (this.getEereRedondeo() != null && this.getEereRedondeo().longValue() == -999) {
            conditions += " AND EERE_REDONDEO IS NULL";
        } else if (this.getEereRedondeo() != null) {
            conditions += " AND EERE_REDONDEO = ?";
            values.add(this.getEereRedondeo());
        }

        if (this.getEereTipoPromedio() != null && this.getEereTipoPromedio().longValue() == -999) {
            conditions += " AND EERE_TIPO_PROMEDIO IS NULL";
        } else if (this.getEereTipoPromedio() != null) {
            conditions += " AND EERE_TIPO_PROMEDIO = ?";
            values.add(this.getEereTipoPromedio());
        }

        if (this.getEereCalcSobretasa() != null && this.getEereCalcSobretasa().longValue() == -999) {
            conditions += " AND EERE_CALC_SOBRETASA IS NULL";
        } else if (this.getEereCalcSobretasa() != null) {
            conditions += " AND EERE_CALC_SOBRETASA = ?";
            values.add(this.getEereCalcSobretasa());
        }

        if (this.getEerePerPromedio() != null && "null".equals(this.getEerePerPromedio())) {
            conditions += " AND EERE_PER_PROMEDIO IS NULL";
        } else if (this.getEerePerPromedio() != null) {
            conditions += " AND EERE_PER_PROMEDIO = ?";
            values.add(this.getEerePerPromedio());
        }

        if (this.getEereProceso() != null && "null".equals(this.getEereProceso())) {
            conditions += " AND EERE_PROCESO IS NULL";
        } else if (this.getEereProceso() != null) {
            conditions += " AND EERE_PROCESO = ?";
            values.add(this.getEereProceso());
        }

        if (this.getEereDiasNatural() != null && this.getEereDiasNatural().longValue() == -999) {
            conditions += " AND EERE_DIAS_NATURAL IS NULL";
        } else if (this.getEereDiasNatural() != null) {
            conditions += " AND EERE_DIAS_NATURAL = ?";
            values.add(this.getEereDiasNatural());
        }

        if (this.getEerePeriodicidadProm() != null && "null".equals(this.getEerePeriodicidadProm())) {
            conditions += " AND EERE_PERIODICIDAD_PROM IS NULL";
        } else if (this.getEerePeriodicidadProm() != null) {
            conditions += " AND EERE_PERIODICIDAD_PROM = ?";
            values.add(this.getEerePeriodicidadProm());
        }

        if (this.getEereNumDias() != null && this.getEereNumDias().longValue() == -999) {
            conditions += " AND EERE_NUM_DIAS IS NULL";
        } else if (this.getEereNumDias() != null) {
            conditions += " AND EERE_NUM_DIAS = ?";
            values.add(this.getEereNumDias());
        }

        if (this.getEereDiaFijo() != null && this.getEereDiaFijo().longValue() == -999) {
            conditions += " AND EERE_DIA_FIJO IS NULL";
        } else if (this.getEereDiaFijo() != null) {
            conditions += " AND EERE_DIA_FIJO = ?";
            values.add(this.getEereDiaFijo());
        }

        if (this.getEereNumDiaFijo() != null && this.getEereNumDiaFijo().longValue() == -999) {
            conditions += " AND EERE_NUM_DIA_FIJO IS NULL";
        } else if (this.getEereNumDiaFijo() != null) {
            conditions += " AND EERE_NUM_DIA_FIJO = ?";
            values.add(this.getEereNumDiaFijo());
        }

        if (this.getEereDiasAntesAvi() != null && this.getEereDiasAntesAvi().longValue() == -999) {
            conditions += " AND EERE_DIAS_ANTES_AVI IS NULL";
        } else if (this.getEereDiasAntesAvi() != null) {
            conditions += " AND EERE_DIAS_ANTES_AVI = ?";
            values.add(this.getEereDiasAntesAvi());
        }

        if (this.getEereStEmirend() != null && "null".equals(this.getEereStEmirend())) {
            conditions += " AND EERE_ST_EMIREND IS NULL";
        } else if (this.getEereStEmirend() != null) {
            conditions += " AND EERE_ST_EMIREND = ?";
            values.add(this.getEereStEmirend());
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
        String sql = "UPDATE F_EMIREND SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EERE_ID_PROGRAMA = ?";
        pkValues.add(this.getEereIdPrograma());
        conditions += " AND EERE_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEereIdFideicomiso());
        conditions += " AND EERE_ID_EMISION = ?";
        pkValues.add(this.getEereIdEmision());
        fields += " EERE_TIPO_CALCULO = ?, ";
        values.add(this.getEereTipoCalculo());
        fields += " EERE_PJE_TASA = ?, ";
        values.add(this.getEerePjeTasa());
        fields += " EERE_NUM_FORMULA = ?, ";
        values.add(this.getEereNumFormula());
        fields += " EERE_DECIMALES = ?, ";
        values.add(this.getEereDecimales());
        fields += " EERE_NUM_DECIMALES = ?, ";
        values.add(this.getEereNumDecimales());
        fields += " EERE_NUM_TASA_INT = ?, ";
        values.add(this.getEereNumTasaInt());
        fields += " EERE_TASA_INTERES_1 = ?, ";
        values.add(this.getEereTasaInteres1());
        fields += " EERE_DETERMINA_TRB = ?, ";
        values.add(this.getEereDeterminaTrb());
        fields += " EERE_DETERMINA_TRN = ?, ";
        values.add(this.getEereDeterminaTrn());
        fields += " EERE_ABSOLUTA_TRB = ?, ";
        values.add(this.getEereAbsolutaTrb());
        fields += " EERE_ABS_NUM_DEC = ?, ";
        values.add(this.getEereAbsNumDec());
        fields += " EERE_DIAS_ANTES_TASA = ?, ";
        values.add(this.getEereDiasAntesTasa());
        fields += " EERE_NUM_DECIMALES_PP = ?, ";
        values.add(this.getEereNumDecimalesPp());
        fields += " EERE_SUMA_ISR = ?, ";
        values.add(this.getEereSumaIsr());
        fields += " EERE_REDONDEO = ?, ";
        values.add(this.getEereRedondeo());
        fields += " EERE_TIPO_PROMEDIO = ?, ";
        values.add(this.getEereTipoPromedio());
        fields += " EERE_CALC_SOBRETASA = ?, ";
        values.add(this.getEereCalcSobretasa());
        fields += " EERE_PER_PROMEDIO = ?, ";
        values.add(this.getEerePerPromedio());
        fields += " EERE_PROCESO = ?, ";
        values.add(this.getEereProceso());
        fields += " EERE_DIAS_NATURAL = ?, ";
        values.add(this.getEereDiasNatural());
        fields += " EERE_PERIODICIDAD_PROM = ?, ";
        values.add(this.getEerePeriodicidadProm());
        fields += " EERE_NUM_DIAS = ?, ";
        values.add(this.getEereNumDias());
        fields += " EERE_DIA_FIJO = ?, ";
        values.add(this.getEereDiaFijo());
        fields += " EERE_NUM_DIA_FIJO = ?, ";
        values.add(this.getEereNumDiaFijo());
        fields += " EERE_DIAS_ANTES_AVI = ?, ";
        values.add(this.getEereDiasAntesAvi());
        fields += " EERE_ST_EMIREND = ?, ";
        values.add(this.getEereStEmirend());
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
        String sql = "INSERT INTO F_EMIREND ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EERE_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEereIdPrograma());

        fields += ", EERE_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEereIdFideicomiso());

        fields += ", EERE_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEereIdEmision());

        fields += ", EERE_TIPO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEereTipoCalculo());

        fields += ", EERE_PJE_TASA";
        fieldValues += ", ?";
        values.add(this.getEerePjeTasa());

        fields += ", EERE_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getEereNumFormula());

        fields += ", EERE_DECIMALES";
        fieldValues += ", ?";
        values.add(this.getEereDecimales());

        fields += ", EERE_NUM_DECIMALES";
        fieldValues += ", ?";
        values.add(this.getEereNumDecimales());

        fields += ", EERE_NUM_TASA_INT";
        fieldValues += ", ?";
        values.add(this.getEereNumTasaInt());

        fields += ", EERE_TASA_INTERES_1";
        fieldValues += ", ?";
        values.add(this.getEereTasaInteres1());

        fields += ", EERE_DETERMINA_TRB";
        fieldValues += ", ?";
        values.add(this.getEereDeterminaTrb());

        fields += ", EERE_DETERMINA_TRN";
        fieldValues += ", ?";
        values.add(this.getEereDeterminaTrn());

        fields += ", EERE_ABSOLUTA_TRB";
        fieldValues += ", ?";
        values.add(this.getEereAbsolutaTrb());

        fields += ", EERE_ABS_NUM_DEC";
        fieldValues += ", ?";
        values.add(this.getEereAbsNumDec());

        fields += ", EERE_DIAS_ANTES_TASA";
        fieldValues += ", ?";
        values.add(this.getEereDiasAntesTasa());

        fields += ", EERE_NUM_DECIMALES_PP";
        fieldValues += ", ?";
        values.add(this.getEereNumDecimalesPp());

        fields += ", EERE_SUMA_ISR";
        fieldValues += ", ?";
        values.add(this.getEereSumaIsr());

        fields += ", EERE_REDONDEO";
        fieldValues += ", ?";
        values.add(this.getEereRedondeo());

        fields += ", EERE_TIPO_PROMEDIO";
        fieldValues += ", ?";
        values.add(this.getEereTipoPromedio());

        fields += ", EERE_CALC_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getEereCalcSobretasa());

        fields += ", EERE_PER_PROMEDIO";
        fieldValues += ", ?";
        values.add(this.getEerePerPromedio());

        fields += ", EERE_PROCESO";
        fieldValues += ", ?";
        values.add(this.getEereProceso());

        fields += ", EERE_DIAS_NATURAL";
        fieldValues += ", ?";
        values.add(this.getEereDiasNatural());

        fields += ", EERE_PERIODICIDAD_PROM";
        fieldValues += ", ?";
        values.add(this.getEerePeriodicidadProm());

        fields += ", EERE_NUM_DIAS";
        fieldValues += ", ?";
        values.add(this.getEereNumDias());

        fields += ", EERE_DIA_FIJO";
        fieldValues += ", ?";
        values.add(this.getEereDiaFijo());

        fields += ", EERE_NUM_DIA_FIJO";
        fieldValues += ", ?";
        values.add(this.getEereNumDiaFijo());

        fields += ", EERE_DIAS_ANTES_AVI";
        fieldValues += ", ?";
        values.add(this.getEereDiasAntesAvi());

        fields += ", EERE_ST_EMIREND";
        fieldValues += ", ?";
        values.add(this.getEereStEmirend());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIREND WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EERE_ID_PROGRAMA = ?";
        values.add(this.getEereIdPrograma());
        conditions += " AND EERE_ID_FIDEICOMISO = ?";
        values.add(this.getEereIdFideicomiso());
        conditions += " AND EERE_ID_EMISION = ?";
        values.add(this.getEereIdEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmirend instance = (FEmirend) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEereIdPrograma().equals(instance.getEereIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEereIdFideicomiso().equals(instance.getEereIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEereIdEmision().equals(instance.getEereIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEereTipoCalculo().equals(instance.getEereTipoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getEerePjeTasa().equals(instance.getEerePjeTasa()))
            equalObjects = false;
        if (equalObjects && !this.getEereNumFormula().equals(instance.getEereNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getEereDecimales().equals(instance.getEereDecimales()))
            equalObjects = false;
        if (equalObjects && !this.getEereNumDecimales().equals(instance.getEereNumDecimales()))
            equalObjects = false;
        if (equalObjects && !this.getEereNumTasaInt().equals(instance.getEereNumTasaInt()))
            equalObjects = false;
        if (equalObjects && !this.getEereTasaInteres1().equals(instance.getEereTasaInteres1()))
            equalObjects = false;
        if (equalObjects && !this.getEereDeterminaTrb().equals(instance.getEereDeterminaTrb()))
            equalObjects = false;
        if (equalObjects && !this.getEereDeterminaTrn().equals(instance.getEereDeterminaTrn()))
            equalObjects = false;
        if (equalObjects && !this.getEereAbsolutaTrb().equals(instance.getEereAbsolutaTrb()))
            equalObjects = false;
        if (equalObjects && !this.getEereAbsNumDec().equals(instance.getEereAbsNumDec()))
            equalObjects = false;
        if (equalObjects && !this.getEereDiasAntesTasa().equals(instance.getEereDiasAntesTasa()))
            equalObjects = false;
        if (equalObjects && !this.getEereNumDecimalesPp().equals(instance.getEereNumDecimalesPp()))
            equalObjects = false;
        if (equalObjects && !this.getEereSumaIsr().equals(instance.getEereSumaIsr()))
            equalObjects = false;
        if (equalObjects && !this.getEereRedondeo().equals(instance.getEereRedondeo()))
            equalObjects = false;
        if (equalObjects && !this.getEereTipoPromedio().equals(instance.getEereTipoPromedio()))
            equalObjects = false;
        if (equalObjects && !this.getEereCalcSobretasa().equals(instance.getEereCalcSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getEerePerPromedio().equals(instance.getEerePerPromedio()))
            equalObjects = false;
        if (equalObjects && !this.getEereProceso().equals(instance.getEereProceso()))
            equalObjects = false;
        if (equalObjects && !this.getEereDiasNatural().equals(instance.getEereDiasNatural()))
            equalObjects = false;
        if (equalObjects && !this.getEerePeriodicidadProm().equals(instance.getEerePeriodicidadProm()))
            equalObjects = false;
        if (equalObjects && !this.getEereNumDias().equals(instance.getEereNumDias()))
            equalObjects = false;
        if (equalObjects && !this.getEereDiaFijo().equals(instance.getEereDiaFijo()))
            equalObjects = false;
        if (equalObjects && !this.getEereNumDiaFijo().equals(instance.getEereNumDiaFijo()))
            equalObjects = false;
        if (equalObjects && !this.getEereDiasAntesAvi().equals(instance.getEereDiasAntesAvi()))
            equalObjects = false;
        if (equalObjects && !this.getEereStEmirend().equals(instance.getEereStEmirend()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmirend result = new FEmirend();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEereIdPrograma((BigDecimal) objectData.getData("EERE_ID_PROGRAMA"));
        result.setEereIdFideicomiso((BigDecimal) objectData.getData("EERE_ID_FIDEICOMISO"));
        result.setEereIdEmision((BigDecimal) objectData.getData("EERE_ID_EMISION"));
        result.setEereTipoCalculo((BigDecimal) objectData.getData("EERE_TIPO_CALCULO"));
        result.setEerePjeTasa((BigDecimal) objectData.getData("EERE_PJE_TASA"));
        result.setEereNumFormula((BigDecimal) objectData.getData("EERE_NUM_FORMULA"));
        result.setEereDecimales((BigDecimal) objectData.getData("EERE_DECIMALES"));
        result.setEereNumDecimales((BigDecimal) objectData.getData("EERE_NUM_DECIMALES"));
        result.setEereNumTasaInt((BigDecimal) objectData.getData("EERE_NUM_TASA_INT"));
        result.setEereTasaInteres1((BigDecimal) objectData.getData("EERE_TASA_INTERES_1"));
        result.setEereDeterminaTrb((BigDecimal) objectData.getData("EERE_DETERMINA_TRB"));
        result.setEereDeterminaTrn((BigDecimal) objectData.getData("EERE_DETERMINA_TRN"));
        result.setEereAbsolutaTrb((BigDecimal) objectData.getData("EERE_ABSOLUTA_TRB"));
        result.setEereAbsNumDec((BigDecimal) objectData.getData("EERE_ABS_NUM_DEC"));
        result.setEereDiasAntesTasa((BigDecimal) objectData.getData("EERE_DIAS_ANTES_TASA"));
        result.setEereNumDecimalesPp((BigDecimal) objectData.getData("EERE_NUM_DECIMALES_PP"));
        result.setEereSumaIsr((BigDecimal) objectData.getData("EERE_SUMA_ISR"));
        result.setEereRedondeo((BigDecimal) objectData.getData("EERE_REDONDEO"));
        result.setEereTipoPromedio((BigDecimal) objectData.getData("EERE_TIPO_PROMEDIO"));
        result.setEereCalcSobretasa((BigDecimal) objectData.getData("EERE_CALC_SOBRETASA"));
        result.setEerePerPromedio((String) objectData.getData("EERE_PER_PROMEDIO"));
        result.setEereProceso((String) objectData.getData("EERE_PROCESO"));
        result.setEereDiasNatural((BigDecimal) objectData.getData("EERE_DIAS_NATURAL"));
        result.setEerePeriodicidadProm((String) objectData.getData("EERE_PERIODICIDAD_PROM"));
        result.setEereNumDias((BigDecimal) objectData.getData("EERE_NUM_DIAS"));
        result.setEereDiaFijo((BigDecimal) objectData.getData("EERE_DIA_FIJO"));
        result.setEereNumDiaFijo((BigDecimal) objectData.getData("EERE_NUM_DIA_FIJO"));
        result.setEereDiasAntesAvi((BigDecimal) objectData.getData("EERE_DIAS_ANTES_AVI"));
        result.setEereStEmirend((String) objectData.getData("EERE_ST_EMIREND"));

        return result;

    }

}
