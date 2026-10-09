package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CUENTAS_SAT_PK",
            columns = { "CSA_NUM_CTAM", "CSA_NUM_SCTA", "CSA_NUM_SSCTA", "CSA_NUM_SSSCTA", "CSA_NUM_SSSSCTA", "CSA_NUM_SSSSSCTA", "CSA_NUM_AUX1" }, sequences = { "MANUAL" })
public class CuentasSat extends DomainObject {

    BigDecimal csaNumCtam = null;
    BigDecimal csaNumScta = null;
    BigDecimal csaNumSscta = null;
    BigDecimal csaNumSsscta = null;
    BigDecimal csaNumSssscta = null;
    BigDecimal csaNumSsssscta = null;
    BigDecimal csaNumAux1 = null;
    String csaAportacion = null;
    String csaIngreso = null;
    String csaCargo = null;
    String csaAbono = null;

    public CuentasSat() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumCtam(BigDecimal csaNumCtam) {
        this.csaNumCtam = csaNumCtam;
    }

    public BigDecimal getCsaNumCtam() {
        return this.csaNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumScta(BigDecimal csaNumScta) {
        this.csaNumScta = csaNumScta;
    }

    public BigDecimal getCsaNumScta() {
        return this.csaNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumSscta(BigDecimal csaNumSscta) {
        this.csaNumSscta = csaNumSscta;
    }

    public BigDecimal getCsaNumSscta() {
        return this.csaNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumSsscta(BigDecimal csaNumSsscta) {
        this.csaNumSsscta = csaNumSsscta;
    }

    public BigDecimal getCsaNumSsscta() {
        return this.csaNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumSssscta(BigDecimal csaNumSssscta) {
        this.csaNumSssscta = csaNumSssscta;
    }

    public BigDecimal getCsaNumSssscta() {
        return this.csaNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumSsssscta(BigDecimal csaNumSsssscta) {
        this.csaNumSsssscta = csaNumSsssscta;
    }

    public BigDecimal getCsaNumSsssscta() {
        return this.csaNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCsaNumAux1(BigDecimal csaNumAux1) {
        this.csaNumAux1 = csaNumAux1;
    }

    public BigDecimal getCsaNumAux1() {
        return this.csaNumAux1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCsaAportacion(String csaAportacion) {
        this.csaAportacion = csaAportacion;
    }

    public String getCsaAportacion() {
        return this.csaAportacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCsaIngreso(String csaIngreso) {
        this.csaIngreso = csaIngreso;
    }

    public String getCsaIngreso() {
        return this.csaIngreso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCsaCargo(String csaCargo) {
        this.csaCargo = csaCargo;
    }

    public String getCsaCargo() {
        return this.csaCargo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCsaAbono(String csaAbono) {
        this.csaAbono = csaAbono;
    }

    public String getCsaAbono() {
        return this.csaAbono;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CUENTAS_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCsaNumCtam() != null && this.getCsaNumCtam().longValue() == -999) {
            conditions += " AND CSA_NUM_CTAM IS NULL";
        } else if (this.getCsaNumCtam() != null) {
            conditions += " AND CSA_NUM_CTAM = ?";
            values.add(this.getCsaNumCtam());
        }

        if (this.getCsaNumScta() != null && this.getCsaNumScta().longValue() == -999) {
            conditions += " AND CSA_NUM_SCTA IS NULL";
        } else if (this.getCsaNumScta() != null) {
            conditions += " AND CSA_NUM_SCTA = ?";
            values.add(this.getCsaNumScta());
        }

        if (this.getCsaNumSscta() != null && this.getCsaNumSscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSCTA IS NULL";
        } else if (this.getCsaNumSscta() != null) {
            conditions += " AND CSA_NUM_SSCTA = ?";
            values.add(this.getCsaNumSscta());
        }

        if (this.getCsaNumSsscta() != null && this.getCsaNumSsscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSCTA IS NULL";
        } else if (this.getCsaNumSsscta() != null) {
            conditions += " AND CSA_NUM_SSSCTA = ?";
            values.add(this.getCsaNumSsscta());
        }

        if (this.getCsaNumSssscta() != null && this.getCsaNumSssscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSSCTA IS NULL";
        } else if (this.getCsaNumSssscta() != null) {
            conditions += " AND CSA_NUM_SSSSCTA = ?";
            values.add(this.getCsaNumSssscta());
        }

        if (this.getCsaNumSsssscta() != null && this.getCsaNumSsssscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSSSCTA IS NULL";
        } else if (this.getCsaNumSsssscta() != null) {
            conditions += " AND CSA_NUM_SSSSSCTA = ?";
            values.add(this.getCsaNumSsssscta());
        }

        if (this.getCsaNumAux1() != null && this.getCsaNumAux1().longValue() == -999) {
            conditions += " AND CSA_NUM_AUX1 IS NULL";
        } else if (this.getCsaNumAux1() != null) {
            conditions += " AND CSA_NUM_AUX1 = ?";
            values.add(this.getCsaNumAux1());
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
        String sql = "SELECT * FROM CUENTAS_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCsaNumCtam() != null && this.getCsaNumCtam().longValue() == -999) {
            conditions += " AND CSA_NUM_CTAM IS NULL";
        } else if (this.getCsaNumCtam() != null) {
            conditions += " AND CSA_NUM_CTAM = ?";
            values.add(this.getCsaNumCtam());
        }

        if (this.getCsaNumScta() != null && this.getCsaNumScta().longValue() == -999) {
            conditions += " AND CSA_NUM_SCTA IS NULL";
        } else if (this.getCsaNumScta() != null) {
            conditions += " AND CSA_NUM_SCTA = ?";
            values.add(this.getCsaNumScta());
        }

        if (this.getCsaNumSscta() != null && this.getCsaNumSscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSCTA IS NULL";
        } else if (this.getCsaNumSscta() != null) {
            conditions += " AND CSA_NUM_SSCTA = ?";
            values.add(this.getCsaNumSscta());
        }

        if (this.getCsaNumSsscta() != null && this.getCsaNumSsscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSCTA IS NULL";
        } else if (this.getCsaNumSsscta() != null) {
            conditions += " AND CSA_NUM_SSSCTA = ?";
            values.add(this.getCsaNumSsscta());
        }

        if (this.getCsaNumSssscta() != null && this.getCsaNumSssscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSSCTA IS NULL";
        } else if (this.getCsaNumSssscta() != null) {
            conditions += " AND CSA_NUM_SSSSCTA = ?";
            values.add(this.getCsaNumSssscta());
        }

        if (this.getCsaNumSsssscta() != null && this.getCsaNumSsssscta().longValue() == -999) {
            conditions += " AND CSA_NUM_SSSSSCTA IS NULL";
        } else if (this.getCsaNumSsssscta() != null) {
            conditions += " AND CSA_NUM_SSSSSCTA = ?";
            values.add(this.getCsaNumSsssscta());
        }

        if (this.getCsaNumAux1() != null && this.getCsaNumAux1().longValue() == -999) {
            conditions += " AND CSA_NUM_AUX1 IS NULL";
        } else if (this.getCsaNumAux1() != null) {
            conditions += " AND CSA_NUM_AUX1 = ?";
            values.add(this.getCsaNumAux1());
        }

        if (this.getCsaAportacion() != null && "null".equals(this.getCsaAportacion())) {
            conditions += " AND CSA_APORTACION IS NULL";
        } else if (this.getCsaAportacion() != null) {
            conditions += " AND CSA_APORTACION = ?";
            values.add(this.getCsaAportacion());
        }

        if (this.getCsaIngreso() != null && "null".equals(this.getCsaIngreso())) {
            conditions += " AND CSA_INGRESO IS NULL";
        } else if (this.getCsaIngreso() != null) {
            conditions += " AND CSA_INGRESO = ?";
            values.add(this.getCsaIngreso());
        }

        if (this.getCsaCargo() != null && "null".equals(this.getCsaCargo())) {
            conditions += " AND CSA_CARGO IS NULL";
        } else if (this.getCsaCargo() != null) {
            conditions += " AND CSA_CARGO = ?";
            values.add(this.getCsaCargo());
        }

        if (this.getCsaAbono() != null && "null".equals(this.getCsaAbono())) {
            conditions += " AND CSA_ABONO IS NULL";
        } else if (this.getCsaAbono() != null) {
            conditions += " AND CSA_ABONO = ?";
            values.add(this.getCsaAbono());
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
        String sql = "UPDATE CUENTAS_SAT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CSA_NUM_CTAM = ?";
        pkValues.add(this.getCsaNumCtam());
        conditions += " AND CSA_NUM_SCTA = ?";
        pkValues.add(this.getCsaNumScta());
        conditions += " AND CSA_NUM_SSCTA = ?";
        pkValues.add(this.getCsaNumSscta());
        conditions += " AND CSA_NUM_SSSCTA = ?";
        pkValues.add(this.getCsaNumSsscta());
        conditions += " AND CSA_NUM_SSSSCTA = ?";
        pkValues.add(this.getCsaNumSssscta());
        conditions += " AND CSA_NUM_SSSSSCTA = ?";
        pkValues.add(this.getCsaNumSsssscta());
        conditions += " AND CSA_NUM_AUX1 = ?";
        pkValues.add(this.getCsaNumAux1());
        fields += " CSA_APORTACION = ?, ";
        values.add(this.getCsaAportacion());
        fields += " CSA_INGRESO = ?, ";
        values.add(this.getCsaIngreso());
        fields += " CSA_CARGO = ?, ";
        values.add(this.getCsaCargo());
        fields += " CSA_ABONO = ?, ";
        values.add(this.getCsaAbono());
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
        String sql = "INSERT INTO CUENTAS_SAT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CSA_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getCsaNumCtam());

        fields += ", CSA_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getCsaNumScta());

        fields += ", CSA_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getCsaNumSscta());

        fields += ", CSA_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getCsaNumSsscta());

        fields += ", CSA_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getCsaNumSssscta());

        fields += ", CSA_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getCsaNumSsssscta());

        fields += ", CSA_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getCsaNumAux1());

        fields += ", CSA_APORTACION";
        fieldValues += ", ?";
        values.add(this.getCsaAportacion());

        fields += ", CSA_INGRESO";
        fieldValues += ", ?";
        values.add(this.getCsaIngreso());

        fields += ", CSA_CARGO";
        fieldValues += ", ?";
        values.add(this.getCsaCargo());

        fields += ", CSA_ABONO";
        fieldValues += ", ?";
        values.add(this.getCsaAbono());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CUENTAS_SAT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CSA_NUM_CTAM = ?";
        values.add(this.getCsaNumCtam());
        conditions += " AND CSA_NUM_SCTA = ?";
        values.add(this.getCsaNumScta());
        conditions += " AND CSA_NUM_SSCTA = ?";
        values.add(this.getCsaNumSscta());
        conditions += " AND CSA_NUM_SSSCTA = ?";
        values.add(this.getCsaNumSsscta());
        conditions += " AND CSA_NUM_SSSSCTA = ?";
        values.add(this.getCsaNumSssscta());
        conditions += " AND CSA_NUM_SSSSSCTA = ?";
        values.add(this.getCsaNumSsssscta());
        conditions += " AND CSA_NUM_AUX1 = ?";
        values.add(this.getCsaNumAux1());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        CuentasSat instance = (CuentasSat) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCsaNumCtam().equals(instance.getCsaNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumScta().equals(instance.getCsaNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumSscta().equals(instance.getCsaNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumSsscta().equals(instance.getCsaNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumSssscta().equals(instance.getCsaNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumSsssscta().equals(instance.getCsaNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getCsaNumAux1().equals(instance.getCsaNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getCsaAportacion().equals(instance.getCsaAportacion()))
            equalObjects = false;
        if (equalObjects && !this.getCsaIngreso().equals(instance.getCsaIngreso()))
            equalObjects = false;
        if (equalObjects && !this.getCsaCargo().equals(instance.getCsaCargo()))
            equalObjects = false;
        if (equalObjects && !this.getCsaAbono().equals(instance.getCsaAbono()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        CuentasSat result = new CuentasSat();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCsaNumCtam((BigDecimal) objectData.getData("CSA_NUM_CTAM"));
        result.setCsaNumScta((BigDecimal) objectData.getData("CSA_NUM_SCTA"));
        result.setCsaNumSscta((BigDecimal) objectData.getData("CSA_NUM_SSCTA"));
        result.setCsaNumSsscta((BigDecimal) objectData.getData("CSA_NUM_SSSCTA"));
        result.setCsaNumSssscta((BigDecimal) objectData.getData("CSA_NUM_SSSSCTA"));
        result.setCsaNumSsssscta((BigDecimal) objectData.getData("CSA_NUM_SSSSSCTA"));
        result.setCsaNumAux1((BigDecimal) objectData.getData("CSA_NUM_AUX1"));
        result.setCsaAportacion((String) objectData.getData("CSA_APORTACION"));
        result.setCsaIngreso((String) objectData.getData("CSA_INGRESO"));
        result.setCsaCargo((String) objectData.getData("CSA_CARGO"));
        result.setCsaAbono((String) objectData.getData("CSA_ABONO"));

        return result;

    }

}
