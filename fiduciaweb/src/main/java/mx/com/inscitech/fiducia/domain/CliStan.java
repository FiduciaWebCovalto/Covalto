package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CLI_STAN_PK", columns = { "CLS_CVE_FID", "CLS_NUM_CONTRATO", "CLS_TIPO_PER" }, sequences = { "MANUAL" })
public class CliStan extends DomainObject {

    BigDecimal clsCveFid = null;
    String clsCveStan = null;
    String clsTipoPer = null;
    BigDecimal clsNumContrato = null;

    public CliStan() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setClsCveFid(BigDecimal clsCveFid) {
        this.clsCveFid = clsCveFid;
    }

    public BigDecimal getClsCveFid() {
        return this.clsCveFid;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setClsCveStan(String clsCveStan) {
        this.clsCveStan = clsCveStan;
    }

    public String getClsCveStan() {
        return this.clsCveStan;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setClsTipoPer(String clsTipoPer) {
        this.clsTipoPer = clsTipoPer;
    }

    public String getClsTipoPer() {
        return this.clsTipoPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setClsNumContrato(BigDecimal clsNumContrato) {
        this.clsNumContrato = clsNumContrato;
    }

    public BigDecimal getClsNumContrato() {
        return this.clsNumContrato;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CLI_STAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getClsCveFid() != null && this.getClsCveFid().longValue() == -999) {
            conditions += " AND CLS_CVE_FID IS NULL";
        } else if (this.getClsCveFid() != null) {
            conditions += " AND CLS_CVE_FID = ?";
            values.add(this.getClsCveFid());
        }

        if (this.getClsTipoPer() != null && "null".equals(this.getClsTipoPer())) {
            conditions += " AND CLS_TIPO_PER IS NULL";
        } else if (this.getClsTipoPer() != null) {
            conditions += " AND CLS_TIPO_PER = ?";
            values.add(this.getClsTipoPer());
        }

        if (this.getClsNumContrato() != null && this.getClsNumContrato().longValue() == -999) {
            conditions += " AND CLS_NUM_CONTRATO IS NULL";
        } else if (this.getClsNumContrato() != null) {
            conditions += " AND CLS_NUM_CONTRATO = ?";
            values.add(this.getClsNumContrato());
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
        String sql = "SELECT * FROM CLI_STAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getClsCveFid() != null && this.getClsCveFid().longValue() == -999) {
            conditions += " AND CLS_CVE_FID IS NULL";
        } else if (this.getClsCveFid() != null) {
            conditions += " AND CLS_CVE_FID = ?";
            values.add(this.getClsCveFid());
        }

        if (this.getClsCveStan() != null && "null".equals(this.getClsCveStan())) {
            conditions += " AND CLS_CVE_STAN IS NULL";
        } else if (this.getClsCveStan() != null) {
            conditions += " AND CLS_CVE_STAN = ?";
            values.add(this.getClsCveStan());
        }

        if (this.getClsTipoPer() != null && "null".equals(this.getClsTipoPer())) {
            conditions += " AND CLS_TIPO_PER IS NULL";
        } else if (this.getClsTipoPer() != null) {
            conditions += " AND CLS_TIPO_PER = ?";
            values.add(this.getClsTipoPer());
        }

        if (this.getClsNumContrato() != null && this.getClsNumContrato().longValue() == -999) {
            conditions += " AND CLS_NUM_CONTRATO IS NULL";
        } else if (this.getClsNumContrato() != null) {
            conditions += " AND CLS_NUM_CONTRATO = ?";
            values.add(this.getClsNumContrato());
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
        String sql = "UPDATE CLI_STAN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CLS_CVE_FID = ?";
        pkValues.add(this.getClsCveFid());
        fields += " CLS_CVE_STAN = ?, ";
        values.add(this.getClsCveStan());
        conditions += " AND CLS_TIPO_PER = ?";
        pkValues.add(this.getClsTipoPer());
        conditions += " AND CLS_NUM_CONTRATO = ?";
        pkValues.add(this.getClsNumContrato());
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
        String sql = "INSERT INTO CLI_STAN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CLS_CVE_FID";
        fieldValues += ", ?";
        values.add(this.getClsCveFid());

        fields += ", CLS_CVE_STAN";
        fieldValues += ", ?";
        values.add(this.getClsCveStan());

        fields += ", CLS_TIPO_PER";
        fieldValues += ", ?";
        values.add(this.getClsTipoPer());

        fields += ", CLS_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getClsNumContrato());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CLI_STAN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CLS_CVE_FID = ?";
        values.add(this.getClsCveFid());
        conditions += " AND CLS_TIPO_PER = ?";
        values.add(this.getClsTipoPer());
        conditions += " AND CLS_NUM_CONTRATO = ?";
        values.add(this.getClsNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        CliStan instance = (CliStan) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getClsCveFid().equals(instance.getClsCveFid()))
            equalObjects = false;
        if (equalObjects && !this.getClsCveStan().equals(instance.getClsCveStan()))
            equalObjects = false;
        if (equalObjects && !this.getClsTipoPer().equals(instance.getClsTipoPer()))
            equalObjects = false;
        if (equalObjects && !this.getClsNumContrato().equals(instance.getClsNumContrato()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        CliStan result = new CliStan();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setClsCveFid((BigDecimal) objectData.getData("CLS_CVE_FID"));
        result.setClsCveStan((String) objectData.getData("CLS_CVE_STAN"));
        result.setClsTipoPer((String) objectData.getData("CLS_TIPO_PER"));
        result.setClsNumContrato((BigDecimal) objectData.getData("CLS_NUM_CONTRATO"));

        return result;

    }

}
