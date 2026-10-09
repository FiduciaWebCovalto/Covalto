package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIAMAD_PK", columns = { "EEAD_ID_PROGRAMA", "EEAD_ID_FIDEICOMISO", "EEAD_ID_EMISION", "EEAD_ID_AMORTIZACION" }, sequences = { "MANUAL" })
public class FEmiamad extends DomainObject {

    BigDecimal eeadIdPrograma = null;
    BigDecimal eeadIdFideicomiso = null;
    BigDecimal eeadIdEmision = null;
    BigDecimal eeadIdAmortizacion = null;
    BigDecimal eeadPjeAmortizacion = null;
    BigDecimal eeadImpAmortizacion = null;
    String eeadFecAmort = null;
    String eeadStEmiamad = null;

    public FEmiamad() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeadIdPrograma(BigDecimal eeadIdPrograma) {
        this.eeadIdPrograma = eeadIdPrograma;
    }

    public BigDecimal getEeadIdPrograma() {
        return this.eeadIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeadIdFideicomiso(BigDecimal eeadIdFideicomiso) {
        this.eeadIdFideicomiso = eeadIdFideicomiso;
    }

    public BigDecimal getEeadIdFideicomiso() {
        return this.eeadIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeadIdEmision(BigDecimal eeadIdEmision) {
        this.eeadIdEmision = eeadIdEmision;
    }

    public BigDecimal getEeadIdEmision() {
        return this.eeadIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeadIdAmortizacion(BigDecimal eeadIdAmortizacion) {
        this.eeadIdAmortizacion = eeadIdAmortizacion;
    }

    public BigDecimal getEeadIdAmortizacion() {
        return this.eeadIdAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeadPjeAmortizacion(BigDecimal eeadPjeAmortizacion) {
        this.eeadPjeAmortizacion = eeadPjeAmortizacion;
    }

    public BigDecimal getEeadPjeAmortizacion() {
        return this.eeadPjeAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeadImpAmortizacion(BigDecimal eeadImpAmortizacion) {
        this.eeadImpAmortizacion = eeadImpAmortizacion;
    }

    public BigDecimal getEeadImpAmortizacion() {
        return this.eeadImpAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeadFecAmort(String eeadFecAmort) {
        this.eeadFecAmort = eeadFecAmort;
    }

    public String getEeadFecAmort() {
        return this.eeadFecAmort;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeadStEmiamad(String eeadStEmiamad) {
        this.eeadStEmiamad = eeadStEmiamad;
    }

    public String getEeadStEmiamad() {
        return this.eeadStEmiamad;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIAMAD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeadIdPrograma() != null && this.getEeadIdPrograma().longValue() == -999) {
            conditions += " AND EEAD_ID_PROGRAMA IS NULL";
        } else if (this.getEeadIdPrograma() != null) {
            conditions += " AND EEAD_ID_PROGRAMA = ?";
            values.add(this.getEeadIdPrograma());
        }

        if (this.getEeadIdFideicomiso() != null && this.getEeadIdFideicomiso().longValue() == -999) {
            conditions += " AND EEAD_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeadIdFideicomiso() != null) {
            conditions += " AND EEAD_ID_FIDEICOMISO = ?";
            values.add(this.getEeadIdFideicomiso());
        }

        if (this.getEeadIdEmision() != null && this.getEeadIdEmision().longValue() == -999) {
            conditions += " AND EEAD_ID_EMISION IS NULL";
        } else if (this.getEeadIdEmision() != null) {
            conditions += " AND EEAD_ID_EMISION = ?";
            values.add(this.getEeadIdEmision());
        }

        if (this.getEeadIdAmortizacion() != null && this.getEeadIdAmortizacion().longValue() == -999) {
            conditions += " AND EEAD_ID_AMORTIZACION IS NULL";
        } else if (this.getEeadIdAmortizacion() != null) {
            conditions += " AND EEAD_ID_AMORTIZACION = ?";
            values.add(this.getEeadIdAmortizacion());
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
        String sql = "SELECT * FROM F_EMIAMAD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeadIdPrograma() != null && this.getEeadIdPrograma().longValue() == -999) {
            conditions += " AND EEAD_ID_PROGRAMA IS NULL";
        } else if (this.getEeadIdPrograma() != null) {
            conditions += " AND EEAD_ID_PROGRAMA = ?";
            values.add(this.getEeadIdPrograma());
        }

        if (this.getEeadIdFideicomiso() != null && this.getEeadIdFideicomiso().longValue() == -999) {
            conditions += " AND EEAD_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeadIdFideicomiso() != null) {
            conditions += " AND EEAD_ID_FIDEICOMISO = ?";
            values.add(this.getEeadIdFideicomiso());
        }

        if (this.getEeadIdEmision() != null && this.getEeadIdEmision().longValue() == -999) {
            conditions += " AND EEAD_ID_EMISION IS NULL";
        } else if (this.getEeadIdEmision() != null) {
            conditions += " AND EEAD_ID_EMISION = ?";
            values.add(this.getEeadIdEmision());
        }

        if (this.getEeadIdAmortizacion() != null && this.getEeadIdAmortizacion().longValue() == -999) {
            conditions += " AND EEAD_ID_AMORTIZACION IS NULL";
        } else if (this.getEeadIdAmortizacion() != null) {
            conditions += " AND EEAD_ID_AMORTIZACION = ?";
            values.add(this.getEeadIdAmortizacion());
        }

        if (this.getEeadPjeAmortizacion() != null && this.getEeadPjeAmortizacion().longValue() == -999) {
            conditions += " AND EEAD_PJE_AMORTIZACION IS NULL";
        } else if (this.getEeadPjeAmortizacion() != null) {
            conditions += " AND EEAD_PJE_AMORTIZACION = ?";
            values.add(this.getEeadPjeAmortizacion());
        }

        if (this.getEeadImpAmortizacion() != null && this.getEeadImpAmortizacion().longValue() == -999) {
            conditions += " AND EEAD_IMP_AMORTIZACION IS NULL";
        } else if (this.getEeadImpAmortizacion() != null) {
            conditions += " AND EEAD_IMP_AMORTIZACION = ?";
            values.add(this.getEeadImpAmortizacion());
        }

        if (this.getEeadFecAmort() != null && "null".equals(this.getEeadFecAmort())) {
            conditions += " AND EEAD_FEC_AMORT IS NULL";
        } else if (this.getEeadFecAmort() != null) {
            conditions += " AND EEAD_FEC_AMORT = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeadFecAmort());
        }

        if (this.getEeadStEmiamad() != null && "null".equals(this.getEeadStEmiamad())) {
            conditions += " AND EEAD_ST_EMIAMAD IS NULL";
        } else if (this.getEeadStEmiamad() != null) {
            conditions += " AND EEAD_ST_EMIAMAD = ?";
            values.add(this.getEeadStEmiamad());
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
        String sql = "UPDATE F_EMIAMAD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEAD_ID_PROGRAMA = ?";
        pkValues.add(this.getEeadIdPrograma());
        conditions += " AND EEAD_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEeadIdFideicomiso());
        conditions += " AND EEAD_ID_EMISION = ?";
        pkValues.add(this.getEeadIdEmision());
        conditions += " AND EEAD_ID_AMORTIZACION = ?";
        pkValues.add(this.getEeadIdAmortizacion());
        fields += " EEAD_PJE_AMORTIZACION = ?, ";
        values.add(this.getEeadPjeAmortizacion());
        fields += " EEAD_IMP_AMORTIZACION = ?, ";
        values.add(this.getEeadImpAmortizacion());
        fields += " EEAD_FEC_AMORT = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeadFecAmort());
        fields += " EEAD_ST_EMIAMAD = ?, ";
        values.add(this.getEeadStEmiamad());
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
        String sql = "INSERT INTO F_EMIAMAD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEAD_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEeadIdPrograma());

        fields += ", EEAD_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEeadIdFideicomiso());

        fields += ", EEAD_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEeadIdEmision());

        fields += ", EEAD_ID_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEeadIdAmortizacion());

        fields += ", EEAD_PJE_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEeadPjeAmortizacion());

        fields += ", EEAD_IMP_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEeadImpAmortizacion());

        fields += ", EEAD_FEC_AMORT";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeadFecAmort());

        fields += ", EEAD_ST_EMIAMAD";
        fieldValues += ", ?";
        values.add(this.getEeadStEmiamad());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIAMAD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEAD_ID_PROGRAMA = ?";
        values.add(this.getEeadIdPrograma());
        conditions += " AND EEAD_ID_FIDEICOMISO = ?";
        values.add(this.getEeadIdFideicomiso());
        conditions += " AND EEAD_ID_EMISION = ?";
        values.add(this.getEeadIdEmision());
        conditions += " AND EEAD_ID_AMORTIZACION = ?";
        values.add(this.getEeadIdAmortizacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmiamad instance = (FEmiamad) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEeadIdPrograma().equals(instance.getEeadIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEeadIdFideicomiso().equals(instance.getEeadIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEeadIdEmision().equals(instance.getEeadIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeadIdAmortizacion().equals(instance.getEeadIdAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEeadPjeAmortizacion().equals(instance.getEeadPjeAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEeadImpAmortizacion().equals(instance.getEeadImpAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEeadFecAmort().equals(instance.getEeadFecAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEeadStEmiamad().equals(instance.getEeadStEmiamad()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmiamad result = new FEmiamad();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEeadIdPrograma((BigDecimal) objectData.getData("EEAD_ID_PROGRAMA"));
        result.setEeadIdFideicomiso((BigDecimal) objectData.getData("EEAD_ID_FIDEICOMISO"));
        result.setEeadIdEmision((BigDecimal) objectData.getData("EEAD_ID_EMISION"));
        result.setEeadIdAmortizacion((BigDecimal) objectData.getData("EEAD_ID_AMORTIZACION"));
        result.setEeadPjeAmortizacion((BigDecimal) objectData.getData("EEAD_PJE_AMORTIZACION"));
        result.setEeadImpAmortizacion((BigDecimal) objectData.getData("EEAD_IMP_AMORTIZACION"));
        result.setEeadFecAmort((String) objectData.getData("EEAD_FEC_AMORT"));
        result.setEeadStEmiamad((String) objectData.getData("EEAD_ST_EMIAMAD"));

        return result;

    }

}
