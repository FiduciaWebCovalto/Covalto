package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "HONFEVA_PK",
            columns = { "HFV_NUM_CONTRATO", "HFV_CVE_PERS_FID", "HFV_NUM_PERS_FID", "HFV_CVE_TIPO_HONO", "HFV_FEC_CALC_HONO", "HFV_NUM_SECUENCIAL", "HFV_TIPO" },
            sequences = { "MANUAL" })
public class Honfeva extends DomainObject {

    BigDecimal hfvNumContrato = null;
    String hfvCvePersFid = null;
    BigDecimal hfvNumPersFid = null;
    String hfvCveTipoHono = null;
    String hfvFecCalcHono = null;
    BigDecimal hfvNumSecuencial = null;
    String hfvTipo = null;

    public Honfeva() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHfvNumContrato(BigDecimal hfvNumContrato) {
        this.hfvNumContrato = hfvNumContrato;
    }

    public BigDecimal getHfvNumContrato() {
        return this.hfvNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setHfvCvePersFid(String hfvCvePersFid) {
        this.hfvCvePersFid = hfvCvePersFid;
    }

    public String getHfvCvePersFid() {
        return this.hfvCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHfvNumPersFid(BigDecimal hfvNumPersFid) {
        this.hfvNumPersFid = hfvNumPersFid;
    }

    public BigDecimal getHfvNumPersFid() {
        return this.hfvNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setHfvCveTipoHono(String hfvCveTipoHono) {
        this.hfvCveTipoHono = hfvCveTipoHono;
    }

    public String getHfvCveTipoHono() {
        return this.hfvCveTipoHono;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setHfvFecCalcHono(String hfvFecCalcHono) {
        this.hfvFecCalcHono = hfvFecCalcHono;
    }

    public String getHfvFecCalcHono() {
        return this.hfvFecCalcHono;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHfvNumSecuencial(BigDecimal hfvNumSecuencial) {
        this.hfvNumSecuencial = hfvNumSecuencial;
    }

    public BigDecimal getHfvNumSecuencial() {
        return this.hfvNumSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "CHAR", javaClass = String.class)
    public void setHfvTipo(String hfvTipo) {
        this.hfvTipo = hfvTipo;
    }

    public String getHfvTipo() {
        return this.hfvTipo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM HONFEVA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getHfvNumContrato() != null && this.getHfvNumContrato().longValue() == -999) {
            conditions += " AND HFV_NUM_CONTRATO IS NULL";
        } else if (this.getHfvNumContrato() != null) {
            conditions += " AND HFV_NUM_CONTRATO = ?";
            values.add(this.getHfvNumContrato());
        }

        if (this.getHfvCvePersFid() != null && "null".equals(this.getHfvCvePersFid())) {
            conditions += " AND HFV_CVE_PERS_FID IS NULL";
        } else if (this.getHfvCvePersFid() != null) {
            conditions += " AND HFV_CVE_PERS_FID = ?";
            values.add(this.getHfvCvePersFid());
        }

        if (this.getHfvNumPersFid() != null && this.getHfvNumPersFid().longValue() == -999) {
            conditions += " AND HFV_NUM_PERS_FID IS NULL";
        } else if (this.getHfvNumPersFid() != null) {
            conditions += " AND HFV_NUM_PERS_FID = ?";
            values.add(this.getHfvNumPersFid());
        }

        if (this.getHfvCveTipoHono() != null && "null".equals(this.getHfvCveTipoHono())) {
            conditions += " AND HFV_CVE_TIPO_HONO IS NULL";
        } else if (this.getHfvCveTipoHono() != null) {
            conditions += " AND HFV_CVE_TIPO_HONO = ?";
            values.add(this.getHfvCveTipoHono());
        }

        if (this.getHfvFecCalcHono() != null && "null".equals(this.getHfvFecCalcHono())) {
            conditions += " AND HFV_FEC_CALC_HONO IS NULL";
        } else if (this.getHfvFecCalcHono() != null) {
            conditions += " AND HFV_FEC_CALC_HONO = ?";
            values.add(this.getHfvFecCalcHono());
        }

        if (this.getHfvNumSecuencial() != null && this.getHfvNumSecuencial().longValue() == -999) {
            conditions += " AND HFV_NUM_SECUENCIAL IS NULL";
        } else if (this.getHfvNumSecuencial() != null) {
            conditions += " AND HFV_NUM_SECUENCIAL = ?";
            values.add(this.getHfvNumSecuencial());
        }

        if (this.getHfvTipo() != null && "null".equals(this.getHfvTipo())) {
            conditions += " AND HFV_TIPO IS NULL";
        } else if (this.getHfvTipo() != null) {
            conditions += " AND HFV_TIPO = ?";
            values.add(this.getHfvTipo());
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
        String sql = "SELECT * FROM HONFEVA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getHfvNumContrato() != null && this.getHfvNumContrato().longValue() == -999) {
            conditions += " AND HFV_NUM_CONTRATO IS NULL";
        } else if (this.getHfvNumContrato() != null) {
            conditions += " AND HFV_NUM_CONTRATO = ?";
            values.add(this.getHfvNumContrato());
        }

        if (this.getHfvCvePersFid() != null && "null".equals(this.getHfvCvePersFid())) {
            conditions += " AND HFV_CVE_PERS_FID IS NULL";
        } else if (this.getHfvCvePersFid() != null) {
            conditions += " AND HFV_CVE_PERS_FID = ?";
            values.add(this.getHfvCvePersFid());
        }

        if (this.getHfvNumPersFid() != null && this.getHfvNumPersFid().longValue() == -999) {
            conditions += " AND HFV_NUM_PERS_FID IS NULL";
        } else if (this.getHfvNumPersFid() != null) {
            conditions += " AND HFV_NUM_PERS_FID = ?";
            values.add(this.getHfvNumPersFid());
        }

        if (this.getHfvCveTipoHono() != null && "null".equals(this.getHfvCveTipoHono())) {
            conditions += " AND HFV_CVE_TIPO_HONO IS NULL";
        } else if (this.getHfvCveTipoHono() != null) {
            conditions += " AND HFV_CVE_TIPO_HONO = ?";
            values.add(this.getHfvCveTipoHono());
        }

        if (this.getHfvFecCalcHono() != null && "null".equals(this.getHfvFecCalcHono())) {
            conditions += " AND HFV_FEC_CALC_HONO IS NULL";
        } else if (this.getHfvFecCalcHono() != null) {
            conditions += " AND HFV_FEC_CALC_HONO = ?";
            values.add(this.getHfvFecCalcHono());
        }

        if (this.getHfvNumSecuencial() != null && this.getHfvNumSecuencial().longValue() == -999) {
            conditions += " AND HFV_NUM_SECUENCIAL IS NULL";
        } else if (this.getHfvNumSecuencial() != null) {
            conditions += " AND HFV_NUM_SECUENCIAL = ?";
            values.add(this.getHfvNumSecuencial());
        }

        if (this.getHfvTipo() != null && "null".equals(this.getHfvTipo())) {
            conditions += " AND HFV_TIPO IS NULL";
        } else if (this.getHfvTipo() != null) {
            conditions += " AND HFV_TIPO = ?";
            values.add(this.getHfvTipo());
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
        String sql = "UPDATE HONFEVA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND HFV_NUM_CONTRATO = ?";
        pkValues.add(this.getHfvNumContrato());
        conditions += " AND HFV_CVE_PERS_FID = ?";
        pkValues.add(this.getHfvCvePersFid());
        conditions += " AND HFV_NUM_PERS_FID = ?";
        pkValues.add(this.getHfvNumPersFid());
        conditions += " AND HFV_CVE_TIPO_HONO = ?";
        pkValues.add(this.getHfvCveTipoHono());
        conditions += " AND HFV_FEC_CALC_HONO = ?";
        pkValues.add(this.getHfvFecCalcHono());
        conditions += " AND HFV_NUM_SECUENCIAL = ?";
        pkValues.add(this.getHfvNumSecuencial());
        conditions += " AND HFV_TIPO = ?";
        pkValues.add(this.getHfvTipo());
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
        String sql = "INSERT INTO HONFEVA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", HFV_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getHfvNumContrato());

        fields += ", HFV_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getHfvCvePersFid());

        fields += ", HFV_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getHfvNumPersFid());

        fields += ", HFV_CVE_TIPO_HONO";
        fieldValues += ", ?";
        values.add(this.getHfvCveTipoHono());

        fields += ", HFV_FEC_CALC_HONO";
        fieldValues += ", ?";
        values.add(this.getHfvFecCalcHono());

        fields += ", HFV_NUM_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getHfvNumSecuencial());

        fields += ", HFV_TIPO";
        fieldValues += ", ?";
        values.add(this.getHfvTipo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM HONFEVA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND HFV_NUM_CONTRATO = ?";
        values.add(this.getHfvNumContrato());
        conditions += " AND HFV_CVE_PERS_FID = ?";
        values.add(this.getHfvCvePersFid());
        conditions += " AND HFV_NUM_PERS_FID = ?";
        values.add(this.getHfvNumPersFid());
        conditions += " AND HFV_CVE_TIPO_HONO = ?";
        values.add(this.getHfvCveTipoHono());
        conditions += " AND HFV_FEC_CALC_HONO = ?";
        values.add(this.getHfvFecCalcHono());
        conditions += " AND HFV_NUM_SECUENCIAL = ?";
        values.add(this.getHfvNumSecuencial());
        conditions += " AND HFV_TIPO = ?";
        values.add(this.getHfvTipo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Honfeva instance = (Honfeva) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getHfvNumContrato().equals(instance.getHfvNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getHfvCvePersFid().equals(instance.getHfvCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getHfvNumPersFid().equals(instance.getHfvNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getHfvCveTipoHono().equals(instance.getHfvCveTipoHono()))
            equalObjects = false;
        if (equalObjects && !this.getHfvFecCalcHono().equals(instance.getHfvFecCalcHono()))
            equalObjects = false;
        if (equalObjects && !this.getHfvNumSecuencial().equals(instance.getHfvNumSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getHfvTipo().equals(instance.getHfvTipo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Honfeva result = new Honfeva();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setHfvNumContrato((BigDecimal) objectData.getData("HFV_NUM_CONTRATO"));
        result.setHfvCvePersFid((String) objectData.getData("HFV_CVE_PERS_FID"));
        result.setHfvNumPersFid((BigDecimal) objectData.getData("HFV_NUM_PERS_FID"));
        result.setHfvCveTipoHono((String) objectData.getData("HFV_CVE_TIPO_HONO"));
        result.setHfvFecCalcHono((String) objectData.getData("HFV_FEC_CALC_HONO"));
        result.setHfvNumSecuencial((BigDecimal) objectData.getData("HFV_NUM_SECUENCIAL"));
        result.setHfvTipo((String) objectData.getData("HFV_TIPO"));

        return result;

    }

}
