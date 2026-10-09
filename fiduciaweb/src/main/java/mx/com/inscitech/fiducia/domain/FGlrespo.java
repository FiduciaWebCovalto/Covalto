package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_GLRESPO_PK", columns = { "FGRE_ID_FIDEICOMISO", "FGRE_ID_CREDITO", "FGRE_ID_RESPONSABLE" }, sequences = { "MANUAL" })
public class FGlrespo extends DomainObject {

    BigDecimal fgreIdFideicomiso = null;
    String fgreIdCredito = null;
    BigDecimal fgreIdResponsable = null;
    String fgreNomResponsable = null;
    String fgreFirma = null;
    String fgreCargo = null;
    String fgreStResponsable = null;
    String fgreCcp1 = null;
    String fgreCcp2 = null;

    public FGlrespo() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFgreIdFideicomiso(BigDecimal fgreIdFideicomiso) {
        this.fgreIdFideicomiso = fgreIdFideicomiso;
    }

    public BigDecimal getFgreIdFideicomiso() {
        return this.fgreIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgreIdCredito(String fgreIdCredito) {
        this.fgreIdCredito = fgreIdCredito;
    }

    public String getFgreIdCredito() {
        return this.fgreIdCredito;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFgreIdResponsable(BigDecimal fgreIdResponsable) {
        this.fgreIdResponsable = fgreIdResponsable;
    }

    public BigDecimal getFgreIdResponsable() {
        return this.fgreIdResponsable;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgreNomResponsable(String fgreNomResponsable) {
        this.fgreNomResponsable = fgreNomResponsable;
    }

    public String getFgreNomResponsable() {
        return this.fgreNomResponsable;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgreFirma(String fgreFirma) {
        this.fgreFirma = fgreFirma;
    }

    public String getFgreFirma() {
        return this.fgreFirma;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgreCargo(String fgreCargo) {
        this.fgreCargo = fgreCargo;
    }

    public String getFgreCargo() {
        return this.fgreCargo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgreStResponsable(String fgreStResponsable) {
        this.fgreStResponsable = fgreStResponsable;
    }

    public String getFgreStResponsable() {
        return this.fgreStResponsable;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgreCcp1(String fgreCcp1) {
        this.fgreCcp1 = fgreCcp1;
    }

    public String getFgreCcp1() {
        return this.fgreCcp1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgreCcp2(String fgreCcp2) {
        this.fgreCcp2 = fgreCcp2;
    }

    public String getFgreCcp2() {
        return this.fgreCcp2;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_GLRESPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFgreIdFideicomiso() != null && this.getFgreIdFideicomiso().longValue() == -999) {
            conditions += " AND FGRE_ID_FIDEICOMISO IS NULL";
        } else if (this.getFgreIdFideicomiso() != null) {
            conditions += " AND FGRE_ID_FIDEICOMISO = ?";
            values.add(this.getFgreIdFideicomiso());
        }

        if (this.getFgreIdCredito() != null && "null".equals(this.getFgreIdCredito())) {
            conditions += " AND FGRE_ID_CREDITO IS NULL";
        } else if (this.getFgreIdCredito() != null) {
            conditions += " AND FGRE_ID_CREDITO = ?";
            values.add(this.getFgreIdCredito());
        }

        if (this.getFgreIdResponsable() != null && this.getFgreIdResponsable().longValue() == -999) {
            conditions += " AND FGRE_ID_RESPONSABLE IS NULL";
        } else if (this.getFgreIdResponsable() != null) {
            conditions += " AND FGRE_ID_RESPONSABLE = ?";
            values.add(this.getFgreIdResponsable());
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
        String sql = "SELECT * FROM F_GLRESPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFgreIdFideicomiso() != null && this.getFgreIdFideicomiso().longValue() == -999) {
            conditions += " AND FGRE_ID_FIDEICOMISO IS NULL";
        } else if (this.getFgreIdFideicomiso() != null) {
            conditions += " AND FGRE_ID_FIDEICOMISO = ?";
            values.add(this.getFgreIdFideicomiso());
        }

        if (this.getFgreIdCredito() != null && "null".equals(this.getFgreIdCredito())) {
            conditions += " AND FGRE_ID_CREDITO IS NULL";
        } else if (this.getFgreIdCredito() != null) {
            conditions += " AND FGRE_ID_CREDITO = ?";
            values.add(this.getFgreIdCredito());
        }

        if (this.getFgreIdResponsable() != null && this.getFgreIdResponsable().longValue() == -999) {
            conditions += " AND FGRE_ID_RESPONSABLE IS NULL";
        } else if (this.getFgreIdResponsable() != null) {
            conditions += " AND FGRE_ID_RESPONSABLE = ?";
            values.add(this.getFgreIdResponsable());
        }

        if (this.getFgreNomResponsable() != null && "null".equals(this.getFgreNomResponsable())) {
            conditions += " AND FGRE_NOM_RESPONSABLE IS NULL";
        } else if (this.getFgreNomResponsable() != null) {
            conditions += " AND FGRE_NOM_RESPONSABLE = ?";
            values.add(this.getFgreNomResponsable());
        }

        if (this.getFgreFirma() != null && "null".equals(this.getFgreFirma())) {
            conditions += " AND FGRE_FIRMA IS NULL";
        } else if (this.getFgreFirma() != null) {
            conditions += " AND FGRE_FIRMA = ?";
            values.add(this.getFgreFirma());
        }

        if (this.getFgreCargo() != null && "null".equals(this.getFgreCargo())) {
            conditions += " AND FGRE_CARGO IS NULL";
        } else if (this.getFgreCargo() != null) {
            conditions += " AND FGRE_CARGO = ?";
            values.add(this.getFgreCargo());
        }

        if (this.getFgreStResponsable() != null && "null".equals(this.getFgreStResponsable())) {
            conditions += " AND FGRE_ST_RESPONSABLE IS NULL";
        } else if (this.getFgreStResponsable() != null) {
            conditions += " AND FGRE_ST_RESPONSABLE = ?";
            values.add(this.getFgreStResponsable());
        }

        if (this.getFgreCcp1() != null && "null".equals(this.getFgreCcp1())) {
            conditions += " AND FGRE_CCP1 IS NULL";
        } else if (this.getFgreCcp1() != null) {
            conditions += " AND FGRE_CCP1 = ?";
            values.add(this.getFgreCcp1());
        }

        if (this.getFgreCcp2() != null && "null".equals(this.getFgreCcp2())) {
            conditions += " AND FGRE_CCP2 IS NULL";
        } else if (this.getFgreCcp2() != null) {
            conditions += " AND FGRE_CCP2 = ?";
            values.add(this.getFgreCcp2());
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
        String sql = "UPDATE F_GLRESPO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FGRE_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFgreIdFideicomiso());
        conditions += " AND FGRE_ID_CREDITO = ?";
        pkValues.add(this.getFgreIdCredito());
        conditions += " AND FGRE_ID_RESPONSABLE = ?";
        pkValues.add(this.getFgreIdResponsable());
        fields += " FGRE_NOM_RESPONSABLE = ?, ";
        values.add(this.getFgreNomResponsable());
        fields += " FGRE_FIRMA = ?, ";
        values.add(this.getFgreFirma());
        fields += " FGRE_CARGO = ?, ";
        values.add(this.getFgreCargo());
        fields += " FGRE_ST_RESPONSABLE = ?, ";
        values.add(this.getFgreStResponsable());
        fields += " FGRE_CCP1 = ?, ";
        values.add(this.getFgreCcp1());
        fields += " FGRE_CCP2 = ?, ";
        values.add(this.getFgreCcp2());
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
        String sql = "INSERT INTO F_GLRESPO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FGRE_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFgreIdFideicomiso());

        fields += ", FGRE_ID_CREDITO";
        fieldValues += ", ?";
        values.add(this.getFgreIdCredito());

        fields += ", FGRE_ID_RESPONSABLE";
        fieldValues += ", ?";
        values.add(this.getFgreIdResponsable());

        fields += ", FGRE_NOM_RESPONSABLE";
        fieldValues += ", ?";
        values.add(this.getFgreNomResponsable());

        fields += ", FGRE_FIRMA";
        fieldValues += ", ?";
        values.add(this.getFgreFirma());

        fields += ", FGRE_CARGO";
        fieldValues += ", ?";
        values.add(this.getFgreCargo());

        fields += ", FGRE_ST_RESPONSABLE";
        fieldValues += ", ?";
        values.add(this.getFgreStResponsable());

        fields += ", FGRE_CCP1";
        fieldValues += ", ?";
        values.add(this.getFgreCcp1());

        fields += ", FGRE_CCP2";
        fieldValues += ", ?";
        values.add(this.getFgreCcp2());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_GLRESPO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FGRE_ID_FIDEICOMISO = ?";
        values.add(this.getFgreIdFideicomiso());
        conditions += " AND FGRE_ID_CREDITO = ?";
        values.add(this.getFgreIdCredito());
        conditions += " AND FGRE_ID_RESPONSABLE = ?";
        values.add(this.getFgreIdResponsable());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FGlrespo instance = (FGlrespo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFgreIdFideicomiso().equals(instance.getFgreIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFgreIdCredito().equals(instance.getFgreIdCredito()))
            equalObjects = false;
        if (equalObjects && !this.getFgreIdResponsable().equals(instance.getFgreIdResponsable()))
            equalObjects = false;
        if (equalObjects && !this.getFgreNomResponsable().equals(instance.getFgreNomResponsable()))
            equalObjects = false;
        if (equalObjects && !this.getFgreFirma().equals(instance.getFgreFirma()))
            equalObjects = false;
        if (equalObjects && !this.getFgreCargo().equals(instance.getFgreCargo()))
            equalObjects = false;
        if (equalObjects && !this.getFgreStResponsable().equals(instance.getFgreStResponsable()))
            equalObjects = false;
        if (equalObjects && !this.getFgreCcp1().equals(instance.getFgreCcp1()))
            equalObjects = false;
        if (equalObjects && !this.getFgreCcp2().equals(instance.getFgreCcp2()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FGlrespo result = new FGlrespo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFgreIdFideicomiso((BigDecimal) objectData.getData("FGRE_ID_FIDEICOMISO"));
        result.setFgreIdCredito((String) objectData.getData("FGRE_ID_CREDITO"));
        result.setFgreIdResponsable((BigDecimal) objectData.getData("FGRE_ID_RESPONSABLE"));
        result.setFgreNomResponsable((String) objectData.getData("FGRE_NOM_RESPONSABLE"));
        result.setFgreFirma((String) objectData.getData("FGRE_FIRMA"));
        result.setFgreCargo((String) objectData.getData("FGRE_CARGO"));
        result.setFgreStResponsable((String) objectData.getData("FGRE_ST_RESPONSABLE"));
        result.setFgreCcp1((String) objectData.getData("FGRE_CCP1"));
        result.setFgreCcp2((String) objectData.getData("FGRE_CCP2"));

        return result;

    }

}
