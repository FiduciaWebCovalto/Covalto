package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTOINVER_PK", columns = { "CIN_NUM_CONTRATO", "CIN_SUB_CONTRATO", "CIN_NUM_CTO_INVER" }, sequences = { "MANUAL" })
public class Ctoinver extends DomainObject {

    BigDecimal cinNumContrato = null;
    BigDecimal cinSubContrato = null;
    BigDecimal cinNumCtoInver = null;
    String cinCveStConrepo = null;

    public Ctoinver() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinNumContrato(BigDecimal cinNumContrato) {
        this.cinNumContrato = cinNumContrato;
    }

    public BigDecimal getCinNumContrato() {
        return this.cinNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinSubContrato(BigDecimal cinSubContrato) {
        this.cinSubContrato = cinSubContrato;
    }

    public BigDecimal getCinSubContrato() {
        return this.cinSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCinNumCtoInver(BigDecimal cinNumCtoInver) {
        this.cinNumCtoInver = cinNumCtoInver;
    }

    public BigDecimal getCinNumCtoInver() {
        return this.cinNumCtoInver;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCinCveStConrepo(String cinCveStConrepo) {
        this.cinCveStConrepo = cinCveStConrepo;
    }

    public String getCinCveStConrepo() {
        return this.cinCveStConrepo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTOINVER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCinNumContrato() != null && this.getCinNumContrato().longValue() == -999) {
            conditions += " AND CIN_NUM_CONTRATO IS NULL";
        } else if (this.getCinNumContrato() != null) {
            conditions += " AND CIN_NUM_CONTRATO = ?";
            values.add(this.getCinNumContrato());
        }

        if (this.getCinSubContrato() != null && this.getCinSubContrato().longValue() == -999) {
            conditions += " AND CIN_SUB_CONTRATO IS NULL";
        } else if (this.getCinSubContrato() != null) {
            conditions += " AND CIN_SUB_CONTRATO = ?";
            values.add(this.getCinSubContrato());
        }

        if (this.getCinNumCtoInver() != null && this.getCinNumCtoInver().longValue() == -999) {
            conditions += " AND CIN_NUM_CTO_INVER IS NULL";
        } else if (this.getCinNumCtoInver() != null) {
            conditions += " AND CIN_NUM_CTO_INVER = ?";
            values.add(this.getCinNumCtoInver());
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
        String sql = "SELECT * FROM CTOINVER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCinNumContrato() != null && this.getCinNumContrato().longValue() == -999) {
            conditions += " AND CIN_NUM_CONTRATO IS NULL";
        } else if (this.getCinNumContrato() != null) {
            conditions += " AND CIN_NUM_CONTRATO = ?";
            values.add(this.getCinNumContrato());
        }

        if (this.getCinSubContrato() != null && this.getCinSubContrato().longValue() == -999) {
            conditions += " AND CIN_SUB_CONTRATO IS NULL";
        } else if (this.getCinSubContrato() != null) {
            conditions += " AND CIN_SUB_CONTRATO = ?";
            values.add(this.getCinSubContrato());
        }

        if (this.getCinNumCtoInver() != null && this.getCinNumCtoInver().longValue() == -999) {
            conditions += " AND CIN_NUM_CTO_INVER IS NULL";
        } else if (this.getCinNumCtoInver() != null) {
            conditions += " AND CIN_NUM_CTO_INVER = ?";
            values.add(this.getCinNumCtoInver());
        }

        if (this.getCinCveStConrepo() != null && "null".equals(this.getCinCveStConrepo())) {
            conditions += " AND CIN_CVE_ST_CONREPO IS NULL";
        } else if (this.getCinCveStConrepo() != null) {
            conditions += " AND CIN_CVE_ST_CONREPO = ?";
            values.add(this.getCinCveStConrepo());
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
        String sql = "UPDATE CTOINVER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CIN_NUM_CONTRATO = ?";
        pkValues.add(this.getCinNumContrato());
        conditions += " AND CIN_SUB_CONTRATO = ?";
        pkValues.add(this.getCinSubContrato());
        conditions += " AND CIN_NUM_CTO_INVER = ?";
        pkValues.add(this.getCinNumCtoInver());
        fields += " CIN_CVE_ST_CONREPO = ?, ";
        values.add(this.getCinCveStConrepo());
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
        String sql = "INSERT INTO CTOINVER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CIN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCinNumContrato());

        fields += ", CIN_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCinSubContrato());

        fields += ", CIN_NUM_CTO_INVER";
        fieldValues += ", ?";
        values.add(this.getCinNumCtoInver());

        fields += ", CIN_CVE_ST_CONREPO";
        fieldValues += ", ?";
        values.add(this.getCinCveStConrepo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTOINVER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CIN_NUM_CONTRATO = ?";
        values.add(this.getCinNumContrato());
        conditions += " AND CIN_SUB_CONTRATO = ?";
        values.add(this.getCinSubContrato());
        conditions += " AND CIN_NUM_CTO_INVER = ?";
        values.add(this.getCinNumCtoInver());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ctoinver instance = (Ctoinver) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCinNumContrato().equals(instance.getCinNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCinSubContrato().equals(instance.getCinSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCinNumCtoInver().equals(instance.getCinNumCtoInver()))
            equalObjects = false;
        if (equalObjects && !this.getCinCveStConrepo().equals(instance.getCinCveStConrepo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ctoinver result = new Ctoinver();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCinNumContrato((BigDecimal) objectData.getData("CIN_NUM_CONTRATO"));
        result.setCinSubContrato((BigDecimal) objectData.getData("CIN_SUB_CONTRATO"));
        result.setCinNumCtoInver((BigDecimal) objectData.getData("CIN_NUM_CTO_INVER"));
        result.setCinCveStConrepo((String) objectData.getData("CIN_CVE_ST_CONREPO"));

        return result;

    }

}
