package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FSF_ID_CVE_FIDEICOMISO_PK", columns = { "FSF_ID_CVE_FIDEICOMISO" }, sequences = { "MAX" })
public class FSecuencialFideicomiso extends DomainObject {

    String fsfIdCveFideicomiso = null;
    BigDecimal fsfNumSecuencial = null;
    String fsfCveStScuencial = null;

    public FSecuencialFideicomiso() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFsfIdCveFideicomiso(String fsfIdCveFideicomiso) {
        this.fsfIdCveFideicomiso = fsfIdCveFideicomiso;
    }

    public String getFsfIdCveFideicomiso() {
        return this.fsfIdCveFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsfNumSecuencial(BigDecimal fsfNumSecuencial) {
        this.fsfNumSecuencial = fsfNumSecuencial;
    }

    public BigDecimal getFsfNumSecuencial() {
        return this.fsfNumSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFsfCveStScuencial(String fsfCveStScuencial) {
        this.fsfCveStScuencial = fsfCveStScuencial;
    }

    public String getFsfCveStScuencial() {
        return this.fsfCveStScuencial;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_SECUENCIAL_FIDEICOMISO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsfIdCveFideicomiso() != null && "null".equals(this.getFsfIdCveFideicomiso())) {
            conditions += " AND FSF_ID_CVE_FIDEICOMISO IS NULL";
        } else if (this.getFsfIdCveFideicomiso() != null) {
            conditions += " AND FSF_ID_CVE_FIDEICOMISO = ?";
            values.add(this.getFsfIdCveFideicomiso());
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
        String sql = "SELECT * FROM F_SECUENCIAL_FIDEICOMISO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsfIdCveFideicomiso() != null && "null".equals(this.getFsfIdCveFideicomiso())) {
            conditions += " AND FSF_ID_CVE_FIDEICOMISO IS NULL";
        } else if (this.getFsfIdCveFideicomiso() != null) {
            conditions += " AND FSF_ID_CVE_FIDEICOMISO = ?";
            values.add(this.getFsfIdCveFideicomiso());
        }

        if (this.getFsfNumSecuencial() != null && this.getFsfNumSecuencial().longValue() == -999) {
            conditions += " AND FSF_NUM_SECUENCIAL IS NULL";
        } else if (this.getFsfNumSecuencial() != null) {
            conditions += " AND FSF_NUM_SECUENCIAL = ?";
            values.add(this.getFsfNumSecuencial());
        }

        if (this.getFsfCveStScuencial() != null && "null".equals(this.getFsfCveStScuencial())) {
            conditions += " AND FSF_CVE_ST_SCUENCIAL IS NULL";
        } else if (this.getFsfCveStScuencial() != null) {
            conditions += " AND FSF_CVE_ST_SCUENCIAL = ?";
            values.add(this.getFsfCveStScuencial());
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
        String sql = "UPDATE F_SECUENCIAL_FIDEICOMISO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FSF_ID_CVE_FIDEICOMISO = ?";
        pkValues.add(this.getFsfIdCveFideicomiso());
        fields += " FSF_NUM_SECUENCIAL = ?, ";
        values.add(this.getFsfNumSecuencial());
        fields += " FSF_CVE_ST_SCUENCIAL = ?, ";
        values.add(this.getFsfCveStScuencial());
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
        String sql = "INSERT INTO F_SECUENCIAL_FIDEICOMISO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FSF_ID_CVE_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFsfIdCveFideicomiso());

        fields += ", FSF_NUM_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFsfNumSecuencial());

        fields += ", FSF_CVE_ST_SCUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFsfCveStScuencial());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_SECUENCIAL_FIDEICOMISO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FSF_ID_CVE_FIDEICOMISO = ?";
        values.add(this.getFsfIdCveFideicomiso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FSecuencialFideicomiso instance = (FSecuencialFideicomiso) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFsfIdCveFideicomiso().equals(instance.getFsfIdCveFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFsfNumSecuencial().equals(instance.getFsfNumSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFsfCveStScuencial().equals(instance.getFsfCveStScuencial()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FSecuencialFideicomiso result = new FSecuencialFideicomiso();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFsfIdCveFideicomiso((String) objectData.getData("FSF_ID_CVE_FIDEICOMISO"));
        result.setFsfNumSecuencial((BigDecimal) objectData.getData("FSF_NUM_SECUENCIAL"));
        result.setFsfCveStScuencial((String) objectData.getData("FSF_CVE_ST_SCUENCIAL"));

        return result;

    }

}
