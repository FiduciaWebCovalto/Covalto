package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIAMAP_PK", columns = { "EEAP_ID_PROGRAMA", "EEAP_ID_FIDEICOMISO", "EEAP_ID_EMISION", "EEAP_ID_AMORTIZACION" }, sequences = { "MANUAL" })
public class FEmiamap extends DomainObject {

    BigDecimal eeapIdPrograma = null;
    BigDecimal eeapIdFideicomiso = null;
    BigDecimal eeapIdEmision = null;
    BigDecimal eeapIdAmortizacion = null;
    BigDecimal eeapPjeAmortizacion = null;
    BigDecimal eeapImpAmortizacion = null;
    String eeapFecAmort = null;
    String eeapStEmiamap = null;

    public FEmiamap() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeapIdPrograma(BigDecimal eeapIdPrograma) {
        this.eeapIdPrograma = eeapIdPrograma;
    }

    public BigDecimal getEeapIdPrograma() {
        return this.eeapIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeapIdFideicomiso(BigDecimal eeapIdFideicomiso) {
        this.eeapIdFideicomiso = eeapIdFideicomiso;
    }

    public BigDecimal getEeapIdFideicomiso() {
        return this.eeapIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeapIdEmision(BigDecimal eeapIdEmision) {
        this.eeapIdEmision = eeapIdEmision;
    }

    public BigDecimal getEeapIdEmision() {
        return this.eeapIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeapIdAmortizacion(BigDecimal eeapIdAmortizacion) {
        this.eeapIdAmortizacion = eeapIdAmortizacion;
    }

    public BigDecimal getEeapIdAmortizacion() {
        return this.eeapIdAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeapPjeAmortizacion(BigDecimal eeapPjeAmortizacion) {
        this.eeapPjeAmortizacion = eeapPjeAmortizacion;
    }

    public BigDecimal getEeapPjeAmortizacion() {
        return this.eeapPjeAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeapImpAmortizacion(BigDecimal eeapImpAmortizacion) {
        this.eeapImpAmortizacion = eeapImpAmortizacion;
    }

    public BigDecimal getEeapImpAmortizacion() {
        return this.eeapImpAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeapFecAmort(String eeapFecAmort) {
        this.eeapFecAmort = eeapFecAmort;
    }

    public String getEeapFecAmort() {
        return this.eeapFecAmort;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeapStEmiamap(String eeapStEmiamap) {
        this.eeapStEmiamap = eeapStEmiamap;
    }

    public String getEeapStEmiamap() {
        return this.eeapStEmiamap;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIAMAP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeapIdPrograma() != null && this.getEeapIdPrograma().longValue() == -999) {
            conditions += " AND EEAP_ID_PROGRAMA IS NULL";
        } else if (this.getEeapIdPrograma() != null) {
            conditions += " AND EEAP_ID_PROGRAMA = ?";
            values.add(this.getEeapIdPrograma());
        }

        if (this.getEeapIdFideicomiso() != null && this.getEeapIdFideicomiso().longValue() == -999) {
            conditions += " AND EEAP_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeapIdFideicomiso() != null) {
            conditions += " AND EEAP_ID_FIDEICOMISO = ?";
            values.add(this.getEeapIdFideicomiso());
        }

        if (this.getEeapIdEmision() != null && this.getEeapIdEmision().longValue() == -999) {
            conditions += " AND EEAP_ID_EMISION IS NULL";
        } else if (this.getEeapIdEmision() != null) {
            conditions += " AND EEAP_ID_EMISION = ?";
            values.add(this.getEeapIdEmision());
        }

        if (this.getEeapIdAmortizacion() != null && this.getEeapIdAmortizacion().longValue() == -999) {
            conditions += " AND EEAP_ID_AMORTIZACION IS NULL";
        } else if (this.getEeapIdAmortizacion() != null) {
            conditions += " AND EEAP_ID_AMORTIZACION = ?";
            values.add(this.getEeapIdAmortizacion());
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
        String sql = "SELECT * FROM F_EMIAMAP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeapIdPrograma() != null && this.getEeapIdPrograma().longValue() == -999) {
            conditions += " AND EEAP_ID_PROGRAMA IS NULL";
        } else if (this.getEeapIdPrograma() != null) {
            conditions += " AND EEAP_ID_PROGRAMA = ?";
            values.add(this.getEeapIdPrograma());
        }

        if (this.getEeapIdFideicomiso() != null && this.getEeapIdFideicomiso().longValue() == -999) {
            conditions += " AND EEAP_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeapIdFideicomiso() != null) {
            conditions += " AND EEAP_ID_FIDEICOMISO = ?";
            values.add(this.getEeapIdFideicomiso());
        }

        if (this.getEeapIdEmision() != null && this.getEeapIdEmision().longValue() == -999) {
            conditions += " AND EEAP_ID_EMISION IS NULL";
        } else if (this.getEeapIdEmision() != null) {
            conditions += " AND EEAP_ID_EMISION = ?";
            values.add(this.getEeapIdEmision());
        }

        if (this.getEeapIdAmortizacion() != null && this.getEeapIdAmortizacion().longValue() == -999) {
            conditions += " AND EEAP_ID_AMORTIZACION IS NULL";
        } else if (this.getEeapIdAmortizacion() != null) {
            conditions += " AND EEAP_ID_AMORTIZACION = ?";
            values.add(this.getEeapIdAmortizacion());
        }

        if (this.getEeapPjeAmortizacion() != null && this.getEeapPjeAmortizacion().longValue() == -999) {
            conditions += " AND EEAP_PJE_AMORTIZACION IS NULL";
        } else if (this.getEeapPjeAmortizacion() != null) {
            conditions += " AND EEAP_PJE_AMORTIZACION = ?";
            values.add(this.getEeapPjeAmortizacion());
        }

        if (this.getEeapImpAmortizacion() != null && this.getEeapImpAmortizacion().longValue() == -999) {
            conditions += " AND EEAP_IMP_AMORTIZACION IS NULL";
        } else if (this.getEeapImpAmortizacion() != null) {
            conditions += " AND EEAP_IMP_AMORTIZACION = ?";
            values.add(this.getEeapImpAmortizacion());
        }

        if (this.getEeapFecAmort() != null && "null".equals(this.getEeapFecAmort())) {
            conditions += " AND EEAP_FEC_AMORT IS NULL";
        } else if (this.getEeapFecAmort() != null) {
            conditions += " AND EEAP_FEC_AMORT = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeapFecAmort());
        }

        if (this.getEeapStEmiamap() != null && "null".equals(this.getEeapStEmiamap())) {
            conditions += " AND EEAP_ST_EMIAMAP IS NULL";
        } else if (this.getEeapStEmiamap() != null) {
            conditions += " AND EEAP_ST_EMIAMAP = ?";
            values.add(this.getEeapStEmiamap());
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
        String sql = "UPDATE F_EMIAMAP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEAP_ID_PROGRAMA = ?";
        pkValues.add(this.getEeapIdPrograma());
        conditions += " AND EEAP_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEeapIdFideicomiso());
        conditions += " AND EEAP_ID_EMISION = ?";
        pkValues.add(this.getEeapIdEmision());
        conditions += " AND EEAP_ID_AMORTIZACION = ?";
        pkValues.add(this.getEeapIdAmortizacion());
        fields += " EEAP_PJE_AMORTIZACION = ?, ";
        values.add(this.getEeapPjeAmortizacion());
        fields += " EEAP_IMP_AMORTIZACION = ?, ";
        values.add(this.getEeapImpAmortizacion());
        fields += " EEAP_FEC_AMORT = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeapFecAmort());
        fields += " EEAP_ST_EMIAMAP = ?, ";
        values.add(this.getEeapStEmiamap());
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
        String sql = "INSERT INTO F_EMIAMAP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEAP_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEeapIdPrograma());

        fields += ", EEAP_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEeapIdFideicomiso());

        fields += ", EEAP_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEeapIdEmision());

        fields += ", EEAP_ID_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEeapIdAmortizacion());

        fields += ", EEAP_PJE_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEeapPjeAmortizacion());

        fields += ", EEAP_IMP_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEeapImpAmortizacion());

        fields += ", EEAP_FEC_AMORT";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeapFecAmort());

        fields += ", EEAP_ST_EMIAMAP";
        fieldValues += ", ?";
        values.add(this.getEeapStEmiamap());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIAMAP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEAP_ID_PROGRAMA = ?";
        values.add(this.getEeapIdPrograma());
        conditions += " AND EEAP_ID_FIDEICOMISO = ?";
        values.add(this.getEeapIdFideicomiso());
        conditions += " AND EEAP_ID_EMISION = ?";
        values.add(this.getEeapIdEmision());
        conditions += " AND EEAP_ID_AMORTIZACION = ?";
        values.add(this.getEeapIdAmortizacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmiamap instance = (FEmiamap) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEeapIdPrograma().equals(instance.getEeapIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEeapIdFideicomiso().equals(instance.getEeapIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEeapIdEmision().equals(instance.getEeapIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeapIdAmortizacion().equals(instance.getEeapIdAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEeapPjeAmortizacion().equals(instance.getEeapPjeAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEeapImpAmortizacion().equals(instance.getEeapImpAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEeapFecAmort().equals(instance.getEeapFecAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEeapStEmiamap().equals(instance.getEeapStEmiamap()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmiamap result = new FEmiamap();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEeapIdPrograma((BigDecimal) objectData.getData("EEAP_ID_PROGRAMA"));
        result.setEeapIdFideicomiso((BigDecimal) objectData.getData("EEAP_ID_FIDEICOMISO"));
        result.setEeapIdEmision((BigDecimal) objectData.getData("EEAP_ID_EMISION"));
        result.setEeapIdAmortizacion((BigDecimal) objectData.getData("EEAP_ID_AMORTIZACION"));
        result.setEeapPjeAmortizacion((BigDecimal) objectData.getData("EEAP_PJE_AMORTIZACION"));
        result.setEeapImpAmortizacion((BigDecimal) objectData.getData("EEAP_IMP_AMORTIZACION"));
        result.setEeapFecAmort((String) objectData.getData("EEAP_FEC_AMORT"));
        result.setEeapStEmiamap((String) objectData.getData("EEAP_ST_EMIAMAP"));

        return result;

    }

}
