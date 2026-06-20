package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIAMORC_PK", columns = { "EEAC_ID_PROGRAMA", "EEAC_ID_FIDEICOMISO", "EEAC_ID_EMISION" }, sequences = { "MANUAL" })
public class FEmiamorc extends DomainObject {

    BigDecimal eeacIdPrograma = null;
    BigDecimal eeacIdFideicomiso = null;
    BigDecimal eeacIdEmision = null;
    BigDecimal eeacIdPeriodo = null;
    String eeacTipoAmortizacion = null;
    String eeacPeriodicidad = null;
    String eeacFecInicioAmort = null;
    String eeacFecFinAmort = null;
    BigDecimal eeacImpAmort = null;
    BigDecimal eeacAmortTitulos = null;
    BigDecimal eeacAmortUlt = null;
    BigDecimal eeacPjeTasa = null;
    String eeacStEmiamorc = null;

    public FEmiamorc() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeacIdPrograma(BigDecimal eeacIdPrograma) {
        this.eeacIdPrograma = eeacIdPrograma;
    }

    public BigDecimal getEeacIdPrograma() {
        return this.eeacIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeacIdFideicomiso(BigDecimal eeacIdFideicomiso) {
        this.eeacIdFideicomiso = eeacIdFideicomiso;
    }

    public BigDecimal getEeacIdFideicomiso() {
        return this.eeacIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeacIdEmision(BigDecimal eeacIdEmision) {
        this.eeacIdEmision = eeacIdEmision;
    }

    public BigDecimal getEeacIdEmision() {
        return this.eeacIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeacIdPeriodo(BigDecimal eeacIdPeriodo) {
        this.eeacIdPeriodo = eeacIdPeriodo;
    }

    public BigDecimal getEeacIdPeriodo() {
        return this.eeacIdPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeacTipoAmortizacion(String eeacTipoAmortizacion) {
        this.eeacTipoAmortizacion = eeacTipoAmortizacion;
    }

    public String getEeacTipoAmortizacion() {
        return this.eeacTipoAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeacPeriodicidad(String eeacPeriodicidad) {
        this.eeacPeriodicidad = eeacPeriodicidad;
    }

    public String getEeacPeriodicidad() {
        return this.eeacPeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeacFecInicioAmort(String eeacFecInicioAmort) {
        this.eeacFecInicioAmort = eeacFecInicioAmort;
    }

    public String getEeacFecInicioAmort() {
        return this.eeacFecInicioAmort;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeacFecFinAmort(String eeacFecFinAmort) {
        this.eeacFecFinAmort = eeacFecFinAmort;
    }

    public String getEeacFecFinAmort() {
        return this.eeacFecFinAmort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeacImpAmort(BigDecimal eeacImpAmort) {
        this.eeacImpAmort = eeacImpAmort;
    }

    public BigDecimal getEeacImpAmort() {
        return this.eeacImpAmort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setEeacAmortTitulos(BigDecimal eeacAmortTitulos) {
        this.eeacAmortTitulos = eeacAmortTitulos;
    }

    public BigDecimal getEeacAmortTitulos() {
        return this.eeacAmortTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setEeacAmortUlt(BigDecimal eeacAmortUlt) {
        this.eeacAmortUlt = eeacAmortUlt;
    }

    public BigDecimal getEeacAmortUlt() {
        return this.eeacAmortUlt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setEeacPjeTasa(BigDecimal eeacPjeTasa) {
        this.eeacPjeTasa = eeacPjeTasa;
    }

    public BigDecimal getEeacPjeTasa() {
        return this.eeacPjeTasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeacStEmiamorc(String eeacStEmiamorc) {
        this.eeacStEmiamorc = eeacStEmiamorc;
    }

    public String getEeacStEmiamorc() {
        return this.eeacStEmiamorc;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIAMORC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeacIdPrograma() != null && this.getEeacIdPrograma().longValue() == -999) {
            conditions += " AND EEAC_ID_PROGRAMA IS NULL";
        } else if (this.getEeacIdPrograma() != null) {
            conditions += " AND EEAC_ID_PROGRAMA = ?";
            values.add(this.getEeacIdPrograma());
        }

        if (this.getEeacIdFideicomiso() != null && this.getEeacIdFideicomiso().longValue() == -999) {
            conditions += " AND EEAC_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeacIdFideicomiso() != null) {
            conditions += " AND EEAC_ID_FIDEICOMISO = ?";
            values.add(this.getEeacIdFideicomiso());
        }

        if (this.getEeacIdEmision() != null && this.getEeacIdEmision().longValue() == -999) {
            conditions += " AND EEAC_ID_EMISION IS NULL";
        } else if (this.getEeacIdEmision() != null) {
            conditions += " AND EEAC_ID_EMISION = ?";
            values.add(this.getEeacIdEmision());
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
        String sql = "SELECT * FROM F_EMIAMORC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeacIdPrograma() != null && this.getEeacIdPrograma().longValue() == -999) {
            conditions += " AND EEAC_ID_PROGRAMA IS NULL";
        } else if (this.getEeacIdPrograma() != null) {
            conditions += " AND EEAC_ID_PROGRAMA = ?";
            values.add(this.getEeacIdPrograma());
        }

        if (this.getEeacIdFideicomiso() != null && this.getEeacIdFideicomiso().longValue() == -999) {
            conditions += " AND EEAC_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeacIdFideicomiso() != null) {
            conditions += " AND EEAC_ID_FIDEICOMISO = ?";
            values.add(this.getEeacIdFideicomiso());
        }

        if (this.getEeacIdEmision() != null && this.getEeacIdEmision().longValue() == -999) {
            conditions += " AND EEAC_ID_EMISION IS NULL";
        } else if (this.getEeacIdEmision() != null) {
            conditions += " AND EEAC_ID_EMISION = ?";
            values.add(this.getEeacIdEmision());
        }

        if (this.getEeacIdPeriodo() != null && this.getEeacIdPeriodo().longValue() == -999) {
            conditions += " AND EEAC_ID_PERIODO IS NULL";
        } else if (this.getEeacIdPeriodo() != null) {
            conditions += " AND EEAC_ID_PERIODO = ?";
            values.add(this.getEeacIdPeriodo());
        }

        if (this.getEeacTipoAmortizacion() != null && "null".equals(this.getEeacTipoAmortizacion())) {
            conditions += " AND EEAC_TIPO_AMORTIZACION IS NULL";
        } else if (this.getEeacTipoAmortizacion() != null) {
            conditions += " AND EEAC_TIPO_AMORTIZACION = ?";
            values.add(this.getEeacTipoAmortizacion());
        }

        if (this.getEeacPeriodicidad() != null && "null".equals(this.getEeacPeriodicidad())) {
            conditions += " AND EEAC_PERIODICIDAD IS NULL";
        } else if (this.getEeacPeriodicidad() != null) {
            conditions += " AND EEAC_PERIODICIDAD = ?";
            values.add(this.getEeacPeriodicidad());
        }

        if (this.getEeacFecInicioAmort() != null && "null".equals(this.getEeacFecInicioAmort())) {
            conditions += " AND EEAC_FEC_INICIO_AMORT IS NULL";
        } else if (this.getEeacFecInicioAmort() != null) {
            conditions += " AND EEAC_FEC_INICIO_AMORT = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeacFecInicioAmort());
        }

        if (this.getEeacFecFinAmort() != null && "null".equals(this.getEeacFecFinAmort())) {
            conditions += " AND EEAC_FEC_FIN_AMORT IS NULL";
        } else if (this.getEeacFecFinAmort() != null) {
            conditions += " AND EEAC_FEC_FIN_AMORT = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeacFecFinAmort());
        }

        if (this.getEeacImpAmort() != null && this.getEeacImpAmort().longValue() == -999) {
            conditions += " AND EEAC_IMP_AMORT IS NULL";
        } else if (this.getEeacImpAmort() != null) {
            conditions += " AND EEAC_IMP_AMORT = ?";
            values.add(this.getEeacImpAmort());
        }

        if (this.getEeacAmortTitulos() != null && this.getEeacAmortTitulos().longValue() == -999) {
            conditions += " AND EEAC_AMORT_TITULOS IS NULL";
        } else if (this.getEeacAmortTitulos() != null) {
            conditions += " AND EEAC_AMORT_TITULOS = ?";
            values.add(this.getEeacAmortTitulos());
        }

        if (this.getEeacAmortUlt() != null && this.getEeacAmortUlt().longValue() == -999) {
            conditions += " AND EEAC_AMORT_ULT IS NULL";
        } else if (this.getEeacAmortUlt() != null) {
            conditions += " AND EEAC_AMORT_ULT = ?";
            values.add(this.getEeacAmortUlt());
        }

        if (this.getEeacPjeTasa() != null && this.getEeacPjeTasa().longValue() == -999) {
            conditions += " AND EEAC_PJE_TASA IS NULL";
        } else if (this.getEeacPjeTasa() != null) {
            conditions += " AND EEAC_PJE_TASA = ?";
            values.add(this.getEeacPjeTasa());
        }

        if (this.getEeacStEmiamorc() != null && "null".equals(this.getEeacStEmiamorc())) {
            conditions += " AND EEAC_ST_EMIAMORC IS NULL";
        } else if (this.getEeacStEmiamorc() != null) {
            conditions += " AND EEAC_ST_EMIAMORC = ?";
            values.add(this.getEeacStEmiamorc());
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
        String sql = "UPDATE F_EMIAMORC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEAC_ID_PROGRAMA = ?";
        pkValues.add(this.getEeacIdPrograma());
        conditions += " AND EEAC_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEeacIdFideicomiso());
        conditions += " AND EEAC_ID_EMISION = ?";
        pkValues.add(this.getEeacIdEmision());
        fields += " EEAC_ID_PERIODO = ?, ";
        values.add(this.getEeacIdPeriodo());
        fields += " EEAC_TIPO_AMORTIZACION = ?, ";
        values.add(this.getEeacTipoAmortizacion());
        fields += " EEAC_PERIODICIDAD = ?, ";
        values.add(this.getEeacPeriodicidad());
        fields += " EEAC_FEC_INICIO_AMORT = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeacFecInicioAmort());
        fields += " EEAC_FEC_FIN_AMORT = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeacFecFinAmort());
        fields += " EEAC_IMP_AMORT = ?, ";
        values.add(this.getEeacImpAmort());
        fields += " EEAC_AMORT_TITULOS = ?, ";
        values.add(this.getEeacAmortTitulos());
        fields += " EEAC_AMORT_ULT = ?, ";
        values.add(this.getEeacAmortUlt());
        fields += " EEAC_PJE_TASA = ?, ";
        values.add(this.getEeacPjeTasa());
        fields += " EEAC_ST_EMIAMORC = ?, ";
        values.add(this.getEeacStEmiamorc());
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
        String sql = "INSERT INTO F_EMIAMORC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEAC_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEeacIdPrograma());

        fields += ", EEAC_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEeacIdFideicomiso());

        fields += ", EEAC_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEeacIdEmision());

        fields += ", EEAC_ID_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEeacIdPeriodo());

        fields += ", EEAC_TIPO_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEeacTipoAmortizacion());

        fields += ", EEAC_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getEeacPeriodicidad());

        fields += ", EEAC_FEC_INICIO_AMORT";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeacFecInicioAmort());

        fields += ", EEAC_FEC_FIN_AMORT";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeacFecFinAmort());

        fields += ", EEAC_IMP_AMORT";
        fieldValues += ", ?";
        values.add(this.getEeacImpAmort());

        fields += ", EEAC_AMORT_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEeacAmortTitulos());

        fields += ", EEAC_AMORT_ULT";
        fieldValues += ", ?";
        values.add(this.getEeacAmortUlt());

        fields += ", EEAC_PJE_TASA";
        fieldValues += ", ?";
        values.add(this.getEeacPjeTasa());

        fields += ", EEAC_ST_EMIAMORC";
        fieldValues += ", ?";
        values.add(this.getEeacStEmiamorc());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIAMORC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEAC_ID_PROGRAMA = ?";
        values.add(this.getEeacIdPrograma());
        conditions += " AND EEAC_ID_FIDEICOMISO = ?";
        values.add(this.getEeacIdFideicomiso());
        conditions += " AND EEAC_ID_EMISION = ?";
        values.add(this.getEeacIdEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmiamorc instance = (FEmiamorc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEeacIdPrograma().equals(instance.getEeacIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEeacIdFideicomiso().equals(instance.getEeacIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEeacIdEmision().equals(instance.getEeacIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeacIdPeriodo().equals(instance.getEeacIdPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEeacTipoAmortizacion().equals(instance.getEeacTipoAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEeacPeriodicidad().equals(instance.getEeacPeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getEeacFecInicioAmort().equals(instance.getEeacFecInicioAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEeacFecFinAmort().equals(instance.getEeacFecFinAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEeacImpAmort().equals(instance.getEeacImpAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEeacAmortTitulos().equals(instance.getEeacAmortTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEeacAmortUlt().equals(instance.getEeacAmortUlt()))
            equalObjects = false;
        if (equalObjects && !this.getEeacPjeTasa().equals(instance.getEeacPjeTasa()))
            equalObjects = false;
        if (equalObjects && !this.getEeacStEmiamorc().equals(instance.getEeacStEmiamorc()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmiamorc result = new FEmiamorc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEeacIdPrograma((BigDecimal) objectData.getData("EEAC_ID_PROGRAMA"));
        result.setEeacIdFideicomiso((BigDecimal) objectData.getData("EEAC_ID_FIDEICOMISO"));
        result.setEeacIdEmision((BigDecimal) objectData.getData("EEAC_ID_EMISION"));
        result.setEeacIdPeriodo((BigDecimal) objectData.getData("EEAC_ID_PERIODO"));
        result.setEeacTipoAmortizacion((String) objectData.getData("EEAC_TIPO_AMORTIZACION"));
        result.setEeacPeriodicidad((String) objectData.getData("EEAC_PERIODICIDAD"));
        result.setEeacFecInicioAmort((String) objectData.getData("EEAC_FEC_INICIO_AMORT"));
        result.setEeacFecFinAmort((String) objectData.getData("EEAC_FEC_FIN_AMORT"));
        result.setEeacImpAmort((BigDecimal) objectData.getData("EEAC_IMP_AMORT"));
        result.setEeacAmortTitulos((BigDecimal) objectData.getData("EEAC_AMORT_TITULOS"));
        result.setEeacAmortUlt((BigDecimal) objectData.getData("EEAC_AMORT_ULT"));
        result.setEeacPjeTasa((BigDecimal) objectData.getData("EEAC_PJE_TASA"));
        result.setEeacStEmiamorc((String) objectData.getData("EEAC_ST_EMIAMORC"));

        return result;

    }

}
