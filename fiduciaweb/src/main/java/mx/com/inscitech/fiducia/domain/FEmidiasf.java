package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIDIASF_PK", columns = { "EEDP_ID_PROGRAMA", "EEDP_ID_FIDEICOMISO", "EEDP_ID_EMISION", "EEDP_ID_PAIS" }, sequences = { "MANUAL" })
public class FEmidiasf extends DomainObject {

    BigDecimal eedpIdPrograma = null;
    BigDecimal eedpIdFideicomiso = null;
    BigDecimal eedpIdEmision = null;
    BigDecimal eedpIdPais = null;
    String eedpStEmidiasf = null;

    public FEmidiasf() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEedpIdPrograma(BigDecimal eedpIdPrograma) {
        this.eedpIdPrograma = eedpIdPrograma;
    }

    public BigDecimal getEedpIdPrograma() {
        return this.eedpIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEedpIdFideicomiso(BigDecimal eedpIdFideicomiso) {
        this.eedpIdFideicomiso = eedpIdFideicomiso;
    }

    public BigDecimal getEedpIdFideicomiso() {
        return this.eedpIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEedpIdEmision(BigDecimal eedpIdEmision) {
        this.eedpIdEmision = eedpIdEmision;
    }

    public BigDecimal getEedpIdEmision() {
        return this.eedpIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEedpIdPais(BigDecimal eedpIdPais) {
        this.eedpIdPais = eedpIdPais;
    }

    public BigDecimal getEedpIdPais() {
        return this.eedpIdPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEedpStEmidiasf(String eedpStEmidiasf) {
        this.eedpStEmidiasf = eedpStEmidiasf;
    }

    public String getEedpStEmidiasf() {
        return this.eedpStEmidiasf;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIDIASF ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEedpIdPrograma() != null && this.getEedpIdPrograma().longValue() == -999) {
            conditions += " AND EEDP_ID_PROGRAMA IS NULL";
        } else if (this.getEedpIdPrograma() != null) {
            conditions += " AND EEDP_ID_PROGRAMA = ?";
            values.add(this.getEedpIdPrograma());
        }

        if (this.getEedpIdFideicomiso() != null && this.getEedpIdFideicomiso().longValue() == -999) {
            conditions += " AND EEDP_ID_FIDEICOMISO IS NULL";
        } else if (this.getEedpIdFideicomiso() != null) {
            conditions += " AND EEDP_ID_FIDEICOMISO = ?";
            values.add(this.getEedpIdFideicomiso());
        }

        if (this.getEedpIdEmision() != null && this.getEedpIdEmision().longValue() == -999) {
            conditions += " AND EEDP_ID_EMISION IS NULL";
        } else if (this.getEedpIdEmision() != null) {
            conditions += " AND EEDP_ID_EMISION = ?";
            values.add(this.getEedpIdEmision());
        }

        if (this.getEedpIdPais() != null && this.getEedpIdPais().longValue() == -999) {
            conditions += " AND EEDP_ID_PAIS IS NULL";
        } else if (this.getEedpIdPais() != null) {
            conditions += " AND EEDP_ID_PAIS = ?";
            values.add(this.getEedpIdPais());
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
        String sql = "SELECT * FROM F_EMIDIASF ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEedpIdPrograma() != null && this.getEedpIdPrograma().longValue() == -999) {
            conditions += " AND EEDP_ID_PROGRAMA IS NULL";
        } else if (this.getEedpIdPrograma() != null) {
            conditions += " AND EEDP_ID_PROGRAMA = ?";
            values.add(this.getEedpIdPrograma());
        }

        if (this.getEedpIdFideicomiso() != null && this.getEedpIdFideicomiso().longValue() == -999) {
            conditions += " AND EEDP_ID_FIDEICOMISO IS NULL";
        } else if (this.getEedpIdFideicomiso() != null) {
            conditions += " AND EEDP_ID_FIDEICOMISO = ?";
            values.add(this.getEedpIdFideicomiso());
        }

        if (this.getEedpIdEmision() != null && this.getEedpIdEmision().longValue() == -999) {
            conditions += " AND EEDP_ID_EMISION IS NULL";
        } else if (this.getEedpIdEmision() != null) {
            conditions += " AND EEDP_ID_EMISION = ?";
            values.add(this.getEedpIdEmision());
        }

        if (this.getEedpIdPais() != null && this.getEedpIdPais().longValue() == -999) {
            conditions += " AND EEDP_ID_PAIS IS NULL";
        } else if (this.getEedpIdPais() != null) {
            conditions += " AND EEDP_ID_PAIS = ?";
            values.add(this.getEedpIdPais());
        }

        if (this.getEedpStEmidiasf() != null && "null".equals(this.getEedpStEmidiasf())) {
            conditions += " AND EEDP_ST_EMIDIASF IS NULL";
        } else if (this.getEedpStEmidiasf() != null) {
            conditions += " AND EEDP_ST_EMIDIASF = ?";
            values.add(this.getEedpStEmidiasf());
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
        String sql = "UPDATE F_EMIDIASF SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEDP_ID_PROGRAMA = ?";
        pkValues.add(this.getEedpIdPrograma());
        conditions += " AND EEDP_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEedpIdFideicomiso());
        conditions += " AND EEDP_ID_EMISION = ?";
        pkValues.add(this.getEedpIdEmision());
        conditions += " AND EEDP_ID_PAIS = ?";
        pkValues.add(this.getEedpIdPais());
        fields += " EEDP_ST_EMIDIASF = ?, ";
        values.add(this.getEedpStEmidiasf());
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
        String sql = "INSERT INTO F_EMIDIASF ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEDP_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEedpIdPrograma());

        fields += ", EEDP_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEedpIdFideicomiso());

        fields += ", EEDP_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEedpIdEmision());

        fields += ", EEDP_ID_PAIS";
        fieldValues += ", ?";
        values.add(this.getEedpIdPais());

        fields += ", EEDP_ST_EMIDIASF";
        fieldValues += ", ?";
        values.add(this.getEedpStEmidiasf());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIDIASF WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEDP_ID_PROGRAMA = ?";
        values.add(this.getEedpIdPrograma());
        conditions += " AND EEDP_ID_FIDEICOMISO = ?";
        values.add(this.getEedpIdFideicomiso());
        conditions += " AND EEDP_ID_EMISION = ?";
        values.add(this.getEedpIdEmision());
        conditions += " AND EEDP_ID_PAIS = ?";
        values.add(this.getEedpIdPais());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmidiasf instance = (FEmidiasf) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEedpIdPrograma().equals(instance.getEedpIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEedpIdFideicomiso().equals(instance.getEedpIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEedpIdEmision().equals(instance.getEedpIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEedpIdPais().equals(instance.getEedpIdPais()))
            equalObjects = false;
        if (equalObjects && !this.getEedpStEmidiasf().equals(instance.getEedpStEmidiasf()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmidiasf result = new FEmidiasf();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEedpIdPrograma((BigDecimal) objectData.getData("EEDP_ID_PROGRAMA"));
        result.setEedpIdFideicomiso((BigDecimal) objectData.getData("EEDP_ID_FIDEICOMISO"));
        result.setEedpIdEmision((BigDecimal) objectData.getData("EEDP_ID_EMISION"));
        result.setEedpIdPais((BigDecimal) objectData.getData("EEDP_ID_PAIS"));
        result.setEedpStEmidiasf((String) objectData.getData("EEDP_ST_EMIDIASF"));

        return result;

    }

}
