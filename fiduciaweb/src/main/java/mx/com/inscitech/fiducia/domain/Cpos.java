package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CPOS_PK", columns = { "CPO_ACTA_EMIS" }, sequences = { "MAX" })
public class Cpos extends DomainObject {

    BigDecimal cpoActaEmis = null;
    BigDecimal ctoNumContrato = null;
    BigDecimal emsNumEmisor = null;
    String cpoEmision = null;
    BigDecimal notNumNotario = null;

    public Cpos() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpoActaEmis(BigDecimal cpoActaEmis) {
        this.cpoActaEmis = cpoActaEmis;
    }

    public BigDecimal getCpoActaEmis() {
        return this.cpoActaEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumContrato(BigDecimal ctoNumContrato) {
        this.ctoNumContrato = ctoNumContrato;
    }

    public BigDecimal getCtoNumContrato() {
        return this.ctoNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmsNumEmisor(BigDecimal emsNumEmisor) {
        this.emsNumEmisor = emsNumEmisor;
    }

    public BigDecimal getEmsNumEmisor() {
        return this.emsNumEmisor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoEmision(String cpoEmision) {
        this.cpoEmision = cpoEmision;
    }

    public String getCpoEmision() {
        return this.cpoEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNotNumNotario(BigDecimal notNumNotario) {
        this.notNumNotario = notNumNotario;
    }

    public BigDecimal getNotNumNotario() {
        return this.notNumNotario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CPOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
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
        String sql = "SELECT * FROM CPOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getCtoNumContrato() != null && this.getCtoNumContrato().longValue() == -999) {
            conditions += " AND CTO_NUM_CONTRATO IS NULL";
        } else if (this.getCtoNumContrato() != null) {
            conditions += " AND CTO_NUM_CONTRATO = ?";
            values.add(this.getCtoNumContrato());
        }

        if (this.getEmsNumEmisor() != null && this.getEmsNumEmisor().longValue() == -999) {
            conditions += " AND EMS_NUM_EMISOR IS NULL";
        } else if (this.getEmsNumEmisor() != null) {
            conditions += " AND EMS_NUM_EMISOR = ?";
            values.add(this.getEmsNumEmisor());
        }

        if (this.getCpoEmision() != null && "null".equals(this.getCpoEmision())) {
            conditions += " AND CPO_EMISION IS NULL";
        } else if (this.getCpoEmision() != null) {
            conditions += " AND CPO_EMISION = ?";
            values.add(this.getCpoEmision());
        }

        if (this.getNotNumNotario() != null && this.getNotNumNotario().longValue() == -999) {
            conditions += " AND NOT_NUM_NOTARIO IS NULL";
        } else if (this.getNotNumNotario() != null) {
            conditions += " AND NOT_NUM_NOTARIO = ?";
            values.add(this.getNotNumNotario());
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
        String sql = "UPDATE CPOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPO_ACTA_EMIS = ?";
        pkValues.add(this.getCpoActaEmis());
        fields += " CTO_NUM_CONTRATO = ?, ";
        values.add(this.getCtoNumContrato());
        fields += " EMS_NUM_EMISOR = ?, ";
        values.add(this.getEmsNumEmisor());
        fields += " CPO_EMISION = ?, ";
        values.add(this.getCpoEmision());
        fields += " NOT_NUM_NOTARIO = ?, ";
        values.add(this.getNotNumNotario());
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
        String sql = "INSERT INTO CPOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPO_ACTA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoActaEmis());

        fields += ", CTO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtoNumContrato());

        fields += ", EMS_NUM_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEmsNumEmisor());

        fields += ", CPO_EMISION";
        fieldValues += ", ?";
        values.add(this.getCpoEmision());

        fields += ", NOT_NUM_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getNotNumNotario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CPOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPO_ACTA_EMIS = ?";
        values.add(this.getCpoActaEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cpos instance = (Cpos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCpoActaEmis().equals(instance.getCpoActaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumContrato().equals(instance.getCtoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getEmsNumEmisor().equals(instance.getEmsNumEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getCpoEmision().equals(instance.getCpoEmision()))
            equalObjects = false;
        if (equalObjects && !this.getNotNumNotario().equals(instance.getNotNumNotario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cpos result = new Cpos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCpoActaEmis((BigDecimal) objectData.getData("CPO_ACTA_EMIS"));
        result.setCtoNumContrato((BigDecimal) objectData.getData("CTO_NUM_CONTRATO"));
        result.setEmsNumEmisor((BigDecimal) objectData.getData("EMS_NUM_EMISOR"));
        result.setCpoEmision((String) objectData.getData("CPO_EMISION"));
        result.setNotNumNotario((BigDecimal) objectData.getData("NOT_NUM_NOTARIO"));

        return result;

    }

}
