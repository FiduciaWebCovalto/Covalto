package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIPCAL_PK", columns = { "EEPC_ID_PROGRAMA", "EEPC_ID_FIDEICOMISO", "EEPC_ID_EMISION", "EEPC_ID_TIPO_CALCULO", "EEPC_ID_FEC_CALC_PER" },
            sequences = { "MANUAL" })
public class FEmipcal extends DomainObject {

    BigDecimal eepcIdPrograma = null;
    BigDecimal eepcIdFideicomiso = null;
    BigDecimal eepcIdEmision = null;
    BigDecimal eepcIdTipoCalculo = null;
    String eepcIdFecCalcPer = null;
    BigDecimal eepcNumPer = null;
    BigDecimal eepcIdFormula = null;
    BigDecimal eepcNumTitulos = null;
    BigDecimal eepcImpNomEmision = null;
    BigDecimal eepcIdMoneda = null;
    BigDecimal eepcPjeTasaFija = null;
    BigDecimal eepcPjeSobretasa = null;
    BigDecimal eepcPjeIsr = null;
    BigDecimal eepcPlazo = null;
    String eepcPeriodicidadMeses = null;
    BigDecimal eepcPeriodicidadDias = null;
    BigDecimal eepcHabiles = null;
    BigDecimal eepcAnteriores = null;
    BigDecimal eepcRegPeriodo = null;
    BigDecimal eepcRegAmort = null;
    BigDecimal eepcNumCalculos = null;
    BigDecimal eepcNumModifi = null;
    String eepcStEmipcal = null;

    public FEmipcal() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepcIdPrograma(BigDecimal eepcIdPrograma) {
        this.eepcIdPrograma = eepcIdPrograma;
    }

    public BigDecimal getEepcIdPrograma() {
        return this.eepcIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepcIdFideicomiso(BigDecimal eepcIdFideicomiso) {
        this.eepcIdFideicomiso = eepcIdFideicomiso;
    }

    public BigDecimal getEepcIdFideicomiso() {
        return this.eepcIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepcIdEmision(BigDecimal eepcIdEmision) {
        this.eepcIdEmision = eepcIdEmision;
    }

    public BigDecimal getEepcIdEmision() {
        return this.eepcIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepcIdTipoCalculo(BigDecimal eepcIdTipoCalculo) {
        this.eepcIdTipoCalculo = eepcIdTipoCalculo;
    }

    public BigDecimal getEepcIdTipoCalculo() {
        return this.eepcIdTipoCalculo;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setEepcIdFecCalcPer(String eepcIdFecCalcPer) {
        this.eepcIdFecCalcPer = eepcIdFecCalcPer;
    }

    public String getEepcIdFecCalcPer() {
        return this.eepcIdFecCalcPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepcNumPer(BigDecimal eepcNumPer) {
        this.eepcNumPer = eepcNumPer;
    }

    public BigDecimal getEepcNumPer() {
        return this.eepcNumPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepcIdFormula(BigDecimal eepcIdFormula) {
        this.eepcIdFormula = eepcIdFormula;
    }

    public BigDecimal getEepcIdFormula() {
        return this.eepcIdFormula;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setEepcNumTitulos(BigDecimal eepcNumTitulos) {
        this.eepcNumTitulos = eepcNumTitulos;
    }

    public BigDecimal getEepcNumTitulos() {
        return this.eepcNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEepcImpNomEmision(BigDecimal eepcImpNomEmision) {
        this.eepcImpNomEmision = eepcImpNomEmision;
    }

    public BigDecimal getEepcImpNomEmision() {
        return this.eepcImpNomEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepcIdMoneda(BigDecimal eepcIdMoneda) {
        this.eepcIdMoneda = eepcIdMoneda;
    }

    public BigDecimal getEepcIdMoneda() {
        return this.eepcIdMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEepcPjeTasaFija(BigDecimal eepcPjeTasaFija) {
        this.eepcPjeTasaFija = eepcPjeTasaFija;
    }

    public BigDecimal getEepcPjeTasaFija() {
        return this.eepcPjeTasaFija;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setEepcPjeSobretasa(BigDecimal eepcPjeSobretasa) {
        this.eepcPjeSobretasa = eepcPjeSobretasa;
    }

    public BigDecimal getEepcPjeSobretasa() {
        return this.eepcPjeSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 9, javaClass = BigDecimal.class)
    public void setEepcPjeIsr(BigDecimal eepcPjeIsr) {
        this.eepcPjeIsr = eepcPjeIsr;
    }

    public BigDecimal getEepcPjeIsr() {
        return this.eepcPjeIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepcPlazo(BigDecimal eepcPlazo) {
        this.eepcPlazo = eepcPlazo;
    }

    public BigDecimal getEepcPlazo() {
        return this.eepcPlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEepcPeriodicidadMeses(String eepcPeriodicidadMeses) {
        this.eepcPeriodicidadMeses = eepcPeriodicidadMeses;
    }

    public String getEepcPeriodicidadMeses() {
        return this.eepcPeriodicidadMeses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepcPeriodicidadDias(BigDecimal eepcPeriodicidadDias) {
        this.eepcPeriodicidadDias = eepcPeriodicidadDias;
    }

    public BigDecimal getEepcPeriodicidadDias() {
        return this.eepcPeriodicidadDias;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepcHabiles(BigDecimal eepcHabiles) {
        this.eepcHabiles = eepcHabiles;
    }

    public BigDecimal getEepcHabiles() {
        return this.eepcHabiles;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepcAnteriores(BigDecimal eepcAnteriores) {
        this.eepcAnteriores = eepcAnteriores;
    }

    public BigDecimal getEepcAnteriores() {
        return this.eepcAnteriores;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepcRegPeriodo(BigDecimal eepcRegPeriodo) {
        this.eepcRegPeriodo = eepcRegPeriodo;
    }

    public BigDecimal getEepcRegPeriodo() {
        return this.eepcRegPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepcRegAmort(BigDecimal eepcRegAmort) {
        this.eepcRegAmort = eepcRegAmort;
    }

    public BigDecimal getEepcRegAmort() {
        return this.eepcRegAmort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepcNumCalculos(BigDecimal eepcNumCalculos) {
        this.eepcNumCalculos = eepcNumCalculos;
    }

    public BigDecimal getEepcNumCalculos() {
        return this.eepcNumCalculos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepcNumModifi(BigDecimal eepcNumModifi) {
        this.eepcNumModifi = eepcNumModifi;
    }

    public BigDecimal getEepcNumModifi() {
        return this.eepcNumModifi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEepcStEmipcal(String eepcStEmipcal) {
        this.eepcStEmipcal = eepcStEmipcal;
    }

    public String getEepcStEmipcal() {
        return this.eepcStEmipcal;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIPCAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEepcIdPrograma() != null && this.getEepcIdPrograma().longValue() == -999) {
            conditions += " AND EEPC_ID_PROGRAMA IS NULL";
        } else if (this.getEepcIdPrograma() != null) {
            conditions += " AND EEPC_ID_PROGRAMA = ?";
            values.add(this.getEepcIdPrograma());
        }

        if (this.getEepcIdFideicomiso() != null && this.getEepcIdFideicomiso().longValue() == -999) {
            conditions += " AND EEPC_ID_FIDEICOMISO IS NULL";
        } else if (this.getEepcIdFideicomiso() != null) {
            conditions += " AND EEPC_ID_FIDEICOMISO = ?";
            values.add(this.getEepcIdFideicomiso());
        }

        if (this.getEepcIdEmision() != null && this.getEepcIdEmision().longValue() == -999) {
            conditions += " AND EEPC_ID_EMISION IS NULL";
        } else if (this.getEepcIdEmision() != null) {
            conditions += " AND EEPC_ID_EMISION = ?";
            values.add(this.getEepcIdEmision());
        }

        if (this.getEepcIdTipoCalculo() != null && this.getEepcIdTipoCalculo().longValue() == -999) {
            conditions += " AND EEPC_ID_TIPO_CALCULO IS NULL";
        } else if (this.getEepcIdTipoCalculo() != null) {
            conditions += " AND EEPC_ID_TIPO_CALCULO = ?";
            values.add(this.getEepcIdTipoCalculo());
        }

        if (this.getEepcIdFecCalcPer() != null && "null".equals(this.getEepcIdFecCalcPer())) {
            conditions += " AND EEPC_ID_FEC_CALC_PER IS NULL";
        } else if (this.getEepcIdFecCalcPer() != null) {
            conditions += " AND EEPC_ID_FEC_CALC_PER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEepcIdFecCalcPer());
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
        String sql = "SELECT * FROM F_EMIPCAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEepcIdPrograma() != null && this.getEepcIdPrograma().longValue() == -999) {
            conditions += " AND EEPC_ID_PROGRAMA IS NULL";
        } else if (this.getEepcIdPrograma() != null) {
            conditions += " AND EEPC_ID_PROGRAMA = ?";
            values.add(this.getEepcIdPrograma());
        }

        if (this.getEepcIdFideicomiso() != null && this.getEepcIdFideicomiso().longValue() == -999) {
            conditions += " AND EEPC_ID_FIDEICOMISO IS NULL";
        } else if (this.getEepcIdFideicomiso() != null) {
            conditions += " AND EEPC_ID_FIDEICOMISO = ?";
            values.add(this.getEepcIdFideicomiso());
        }

        if (this.getEepcIdEmision() != null && this.getEepcIdEmision().longValue() == -999) {
            conditions += " AND EEPC_ID_EMISION IS NULL";
        } else if (this.getEepcIdEmision() != null) {
            conditions += " AND EEPC_ID_EMISION = ?";
            values.add(this.getEepcIdEmision());
        }

        if (this.getEepcIdTipoCalculo() != null && this.getEepcIdTipoCalculo().longValue() == -999) {
            conditions += " AND EEPC_ID_TIPO_CALCULO IS NULL";
        } else if (this.getEepcIdTipoCalculo() != null) {
            conditions += " AND EEPC_ID_TIPO_CALCULO = ?";
            values.add(this.getEepcIdTipoCalculo());
        }

        if (this.getEepcIdFecCalcPer() != null && "null".equals(this.getEepcIdFecCalcPer())) {
            conditions += " AND EEPC_ID_FEC_CALC_PER IS NULL";
        } else if (this.getEepcIdFecCalcPer() != null) {
            conditions += " AND EEPC_ID_FEC_CALC_PER = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEepcIdFecCalcPer());
        }

        if (this.getEepcNumPer() != null && this.getEepcNumPer().longValue() == -999) {
            conditions += " AND EEPC_NUM_PER IS NULL";
        } else if (this.getEepcNumPer() != null) {
            conditions += " AND EEPC_NUM_PER = ?";
            values.add(this.getEepcNumPer());
        }

        if (this.getEepcIdFormula() != null && this.getEepcIdFormula().longValue() == -999) {
            conditions += " AND EEPC_ID_FORMULA IS NULL";
        } else if (this.getEepcIdFormula() != null) {
            conditions += " AND EEPC_ID_FORMULA = ?";
            values.add(this.getEepcIdFormula());
        }

        if (this.getEepcNumTitulos() != null && this.getEepcNumTitulos().longValue() == -999) {
            conditions += " AND EEPC_NUM_TITULOS IS NULL";
        } else if (this.getEepcNumTitulos() != null) {
            conditions += " AND EEPC_NUM_TITULOS = ?";
            values.add(this.getEepcNumTitulos());
        }

        if (this.getEepcImpNomEmision() != null && this.getEepcImpNomEmision().longValue() == -999) {
            conditions += " AND EEPC_IMP_NOM_EMISION IS NULL";
        } else if (this.getEepcImpNomEmision() != null) {
            conditions += " AND EEPC_IMP_NOM_EMISION = ?";
            values.add(this.getEepcImpNomEmision());
        }

        if (this.getEepcIdMoneda() != null && this.getEepcIdMoneda().longValue() == -999) {
            conditions += " AND EEPC_ID_MONEDA IS NULL";
        } else if (this.getEepcIdMoneda() != null) {
            conditions += " AND EEPC_ID_MONEDA = ?";
            values.add(this.getEepcIdMoneda());
        }

        if (this.getEepcPjeTasaFija() != null && this.getEepcPjeTasaFija().longValue() == -999) {
            conditions += " AND EEPC_PJE_TASA_FIJA IS NULL";
        } else if (this.getEepcPjeTasaFija() != null) {
            conditions += " AND EEPC_PJE_TASA_FIJA = ?";
            values.add(this.getEepcPjeTasaFija());
        }

        if (this.getEepcPjeSobretasa() != null && this.getEepcPjeSobretasa().longValue() == -999) {
            conditions += " AND EEPC_PJE_SOBRETASA IS NULL";
        } else if (this.getEepcPjeSobretasa() != null) {
            conditions += " AND EEPC_PJE_SOBRETASA = ?";
            values.add(this.getEepcPjeSobretasa());
        }

        if (this.getEepcPjeIsr() != null && this.getEepcPjeIsr().longValue() == -999) {
            conditions += " AND EEPC_PJE_ISR IS NULL";
        } else if (this.getEepcPjeIsr() != null) {
            conditions += " AND EEPC_PJE_ISR = ?";
            values.add(this.getEepcPjeIsr());
        }

        if (this.getEepcPlazo() != null && this.getEepcPlazo().longValue() == -999) {
            conditions += " AND EEPC_PLAZO IS NULL";
        } else if (this.getEepcPlazo() != null) {
            conditions += " AND EEPC_PLAZO = ?";
            values.add(this.getEepcPlazo());
        }

        if (this.getEepcPeriodicidadMeses() != null && "null".equals(this.getEepcPeriodicidadMeses())) {
            conditions += " AND EEPC_PERIODICIDAD_MESES IS NULL";
        } else if (this.getEepcPeriodicidadMeses() != null) {
            conditions += " AND EEPC_PERIODICIDAD_MESES = ?";
            values.add(this.getEepcPeriodicidadMeses());
        }

        if (this.getEepcPeriodicidadDias() != null && this.getEepcPeriodicidadDias().longValue() == -999) {
            conditions += " AND EEPC_PERIODICIDAD_DIAS IS NULL";
        } else if (this.getEepcPeriodicidadDias() != null) {
            conditions += " AND EEPC_PERIODICIDAD_DIAS = ?";
            values.add(this.getEepcPeriodicidadDias());
        }

        if (this.getEepcHabiles() != null && this.getEepcHabiles().longValue() == -999) {
            conditions += " AND EEPC_HABILES IS NULL";
        } else if (this.getEepcHabiles() != null) {
            conditions += " AND EEPC_HABILES = ?";
            values.add(this.getEepcHabiles());
        }

        if (this.getEepcAnteriores() != null && this.getEepcAnteriores().longValue() == -999) {
            conditions += " AND EEPC_ANTERIORES IS NULL";
        } else if (this.getEepcAnteriores() != null) {
            conditions += " AND EEPC_ANTERIORES = ?";
            values.add(this.getEepcAnteriores());
        }

        if (this.getEepcRegPeriodo() != null && this.getEepcRegPeriodo().longValue() == -999) {
            conditions += " AND EEPC_REG_PERIODO IS NULL";
        } else if (this.getEepcRegPeriodo() != null) {
            conditions += " AND EEPC_REG_PERIODO = ?";
            values.add(this.getEepcRegPeriodo());
        }

        if (this.getEepcRegAmort() != null && this.getEepcRegAmort().longValue() == -999) {
            conditions += " AND EEPC_REG_AMORT IS NULL";
        } else if (this.getEepcRegAmort() != null) {
            conditions += " AND EEPC_REG_AMORT = ?";
            values.add(this.getEepcRegAmort());
        }

        if (this.getEepcNumCalculos() != null && this.getEepcNumCalculos().longValue() == -999) {
            conditions += " AND EEPC_NUM_CALCULOS IS NULL";
        } else if (this.getEepcNumCalculos() != null) {
            conditions += " AND EEPC_NUM_CALCULOS = ?";
            values.add(this.getEepcNumCalculos());
        }

        if (this.getEepcNumModifi() != null && this.getEepcNumModifi().longValue() == -999) {
            conditions += " AND EEPC_NUM_MODIFI IS NULL";
        } else if (this.getEepcNumModifi() != null) {
            conditions += " AND EEPC_NUM_MODIFI = ?";
            values.add(this.getEepcNumModifi());
        }

        if (this.getEepcStEmipcal() != null && "null".equals(this.getEepcStEmipcal())) {
            conditions += " AND EEPC_ST_EMIPCAL IS NULL";
        } else if (this.getEepcStEmipcal() != null) {
            conditions += " AND EEPC_ST_EMIPCAL = ?";
            values.add(this.getEepcStEmipcal());
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
        String sql = "UPDATE F_EMIPCAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEPC_ID_PROGRAMA = ?";
        pkValues.add(this.getEepcIdPrograma());
        conditions += " AND EEPC_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEepcIdFideicomiso());
        conditions += " AND EEPC_ID_EMISION = ?";
        pkValues.add(this.getEepcIdEmision());
        conditions += " AND EEPC_ID_TIPO_CALCULO = ?";
        pkValues.add(this.getEepcIdTipoCalculo());
        conditions += " AND EEPC_ID_FEC_CALC_PER = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getEepcIdFecCalcPer());
        fields += " EEPC_NUM_PER = ?, ";
        values.add(this.getEepcNumPer());
        fields += " EEPC_ID_FORMULA = ?, ";
        values.add(this.getEepcIdFormula());
        fields += " EEPC_NUM_TITULOS = ?, ";
        values.add(this.getEepcNumTitulos());
        fields += " EEPC_IMP_NOM_EMISION = ?, ";
        values.add(this.getEepcImpNomEmision());
        fields += " EEPC_ID_MONEDA = ?, ";
        values.add(this.getEepcIdMoneda());
        fields += " EEPC_PJE_TASA_FIJA = ?, ";
        values.add(this.getEepcPjeTasaFija());
        fields += " EEPC_PJE_SOBRETASA = ?, ";
        values.add(this.getEepcPjeSobretasa());
        fields += " EEPC_PJE_ISR = ?, ";
        values.add(this.getEepcPjeIsr());
        fields += " EEPC_PLAZO = ?, ";
        values.add(this.getEepcPlazo());
        fields += " EEPC_PERIODICIDAD_MESES = ?, ";
        values.add(this.getEepcPeriodicidadMeses());
        fields += " EEPC_PERIODICIDAD_DIAS = ?, ";
        values.add(this.getEepcPeriodicidadDias());
        fields += " EEPC_HABILES = ?, ";
        values.add(this.getEepcHabiles());
        fields += " EEPC_ANTERIORES = ?, ";
        values.add(this.getEepcAnteriores());
        fields += " EEPC_REG_PERIODO = ?, ";
        values.add(this.getEepcRegPeriodo());
        fields += " EEPC_REG_AMORT = ?, ";
        values.add(this.getEepcRegAmort());
        fields += " EEPC_NUM_CALCULOS = ?, ";
        values.add(this.getEepcNumCalculos());
        fields += " EEPC_NUM_MODIFI = ?, ";
        values.add(this.getEepcNumModifi());
        fields += " EEPC_ST_EMIPCAL = ?, ";
        values.add(this.getEepcStEmipcal());
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
        String sql = "INSERT INTO F_EMIPCAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEPC_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEepcIdPrograma());

        fields += ", EEPC_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEepcIdFideicomiso());

        fields += ", EEPC_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEepcIdEmision());

        fields += ", EEPC_ID_TIPO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEepcIdTipoCalculo());

        fields += ", EEPC_ID_FEC_CALC_PER";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEepcIdFecCalcPer());

        fields += ", EEPC_NUM_PER";
        fieldValues += ", ?";
        values.add(this.getEepcNumPer());

        fields += ", EEPC_ID_FORMULA";
        fieldValues += ", ?";
        values.add(this.getEepcIdFormula());

        fields += ", EEPC_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEepcNumTitulos());

        fields += ", EEPC_IMP_NOM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEepcImpNomEmision());

        fields += ", EEPC_ID_MONEDA";
        fieldValues += ", ?";
        values.add(this.getEepcIdMoneda());

        fields += ", EEPC_PJE_TASA_FIJA";
        fieldValues += ", ?";
        values.add(this.getEepcPjeTasaFija());

        fields += ", EEPC_PJE_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getEepcPjeSobretasa());

        fields += ", EEPC_PJE_ISR";
        fieldValues += ", ?";
        values.add(this.getEepcPjeIsr());

        fields += ", EEPC_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEepcPlazo());

        fields += ", EEPC_PERIODICIDAD_MESES";
        fieldValues += ", ?";
        values.add(this.getEepcPeriodicidadMeses());

        fields += ", EEPC_PERIODICIDAD_DIAS";
        fieldValues += ", ?";
        values.add(this.getEepcPeriodicidadDias());

        fields += ", EEPC_HABILES";
        fieldValues += ", ?";
        values.add(this.getEepcHabiles());

        fields += ", EEPC_ANTERIORES";
        fieldValues += ", ?";
        values.add(this.getEepcAnteriores());

        fields += ", EEPC_REG_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEepcRegPeriodo());

        fields += ", EEPC_REG_AMORT";
        fieldValues += ", ?";
        values.add(this.getEepcRegAmort());

        fields += ", EEPC_NUM_CALCULOS";
        fieldValues += ", ?";
        values.add(this.getEepcNumCalculos());

        fields += ", EEPC_NUM_MODIFI";
        fieldValues += ", ?";
        values.add(this.getEepcNumModifi());

        fields += ", EEPC_ST_EMIPCAL";
        fieldValues += ", ?";
        values.add(this.getEepcStEmipcal());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIPCAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEPC_ID_PROGRAMA = ?";
        values.add(this.getEepcIdPrograma());
        conditions += " AND EEPC_ID_FIDEICOMISO = ?";
        values.add(this.getEepcIdFideicomiso());
        conditions += " AND EEPC_ID_EMISION = ?";
        values.add(this.getEepcIdEmision());
        conditions += " AND EEPC_ID_TIPO_CALCULO = ?";
        values.add(this.getEepcIdTipoCalculo());
        conditions += " AND EEPC_ID_FEC_CALC_PER = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getEepcIdFecCalcPer());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmipcal instance = (FEmipcal) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEepcIdPrograma().equals(instance.getEepcIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEepcIdFideicomiso().equals(instance.getEepcIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEepcIdEmision().equals(instance.getEepcIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEepcIdTipoCalculo().equals(instance.getEepcIdTipoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getEepcIdFecCalcPer().equals(instance.getEepcIdFecCalcPer()))
            equalObjects = false;
        if (equalObjects && !this.getEepcNumPer().equals(instance.getEepcNumPer()))
            equalObjects = false;
        if (equalObjects && !this.getEepcIdFormula().equals(instance.getEepcIdFormula()))
            equalObjects = false;
        if (equalObjects && !this.getEepcNumTitulos().equals(instance.getEepcNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEepcImpNomEmision().equals(instance.getEepcImpNomEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEepcIdMoneda().equals(instance.getEepcIdMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getEepcPjeTasaFija().equals(instance.getEepcPjeTasaFija()))
            equalObjects = false;
        if (equalObjects && !this.getEepcPjeSobretasa().equals(instance.getEepcPjeSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getEepcPjeIsr().equals(instance.getEepcPjeIsr()))
            equalObjects = false;
        if (equalObjects && !this.getEepcPlazo().equals(instance.getEepcPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEepcPeriodicidadMeses().equals(instance.getEepcPeriodicidadMeses()))
            equalObjects = false;
        if (equalObjects && !this.getEepcPeriodicidadDias().equals(instance.getEepcPeriodicidadDias()))
            equalObjects = false;
        if (equalObjects && !this.getEepcHabiles().equals(instance.getEepcHabiles()))
            equalObjects = false;
        if (equalObjects && !this.getEepcAnteriores().equals(instance.getEepcAnteriores()))
            equalObjects = false;
        if (equalObjects && !this.getEepcRegPeriodo().equals(instance.getEepcRegPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEepcRegAmort().equals(instance.getEepcRegAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEepcNumCalculos().equals(instance.getEepcNumCalculos()))
            equalObjects = false;
        if (equalObjects && !this.getEepcNumModifi().equals(instance.getEepcNumModifi()))
            equalObjects = false;
        if (equalObjects && !this.getEepcStEmipcal().equals(instance.getEepcStEmipcal()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmipcal result = new FEmipcal();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEepcIdPrograma((BigDecimal) objectData.getData("EEPC_ID_PROGRAMA"));
        result.setEepcIdFideicomiso((BigDecimal) objectData.getData("EEPC_ID_FIDEICOMISO"));
        result.setEepcIdEmision((BigDecimal) objectData.getData("EEPC_ID_EMISION"));
        result.setEepcIdTipoCalculo((BigDecimal) objectData.getData("EEPC_ID_TIPO_CALCULO"));
        result.setEepcIdFecCalcPer((String) objectData.getData("EEPC_ID_FEC_CALC_PER"));
        result.setEepcNumPer((BigDecimal) objectData.getData("EEPC_NUM_PER"));
        result.setEepcIdFormula((BigDecimal) objectData.getData("EEPC_ID_FORMULA"));
        result.setEepcNumTitulos((BigDecimal) objectData.getData("EEPC_NUM_TITULOS"));
        result.setEepcImpNomEmision((BigDecimal) objectData.getData("EEPC_IMP_NOM_EMISION"));
        result.setEepcIdMoneda((BigDecimal) objectData.getData("EEPC_ID_MONEDA"));
        result.setEepcPjeTasaFija((BigDecimal) objectData.getData("EEPC_PJE_TASA_FIJA"));
        result.setEepcPjeSobretasa((BigDecimal) objectData.getData("EEPC_PJE_SOBRETASA"));
        result.setEepcPjeIsr((BigDecimal) objectData.getData("EEPC_PJE_ISR"));
        result.setEepcPlazo((BigDecimal) objectData.getData("EEPC_PLAZO"));
        result.setEepcPeriodicidadMeses((String) objectData.getData("EEPC_PERIODICIDAD_MESES"));
        result.setEepcPeriodicidadDias((BigDecimal) objectData.getData("EEPC_PERIODICIDAD_DIAS"));
        result.setEepcHabiles((BigDecimal) objectData.getData("EEPC_HABILES"));
        result.setEepcAnteriores((BigDecimal) objectData.getData("EEPC_ANTERIORES"));
        result.setEepcRegPeriodo((BigDecimal) objectData.getData("EEPC_REG_PERIODO"));
        result.setEepcRegAmort((BigDecimal) objectData.getData("EEPC_REG_AMORT"));
        result.setEepcNumCalculos((BigDecimal) objectData.getData("EEPC_NUM_CALCULOS"));
        result.setEepcNumModifi((BigDecimal) objectData.getData("EEPC_NUM_MODIFI"));
        result.setEepcStEmipcal((String) objectData.getData("EEPC_ST_EMIPCAL"));

        return result;

    }

}
