package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FOLIOCTO_PK", columns = { "FOC_NUM_CONTRATO" }, sequences = { "MAX" })
public class Foliocto extends DomainObject {

    BigDecimal focNumContrato = null;
    BigDecimal focNumFolio = null;
    String focCveStFolio = null;

    public Foliocto() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFocNumContrato(BigDecimal focNumContrato) {
        this.focNumContrato = focNumContrato;
    }

    public BigDecimal getFocNumContrato() {
        return this.focNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFocNumFolio(BigDecimal focNumFolio) {
        this.focNumFolio = focNumFolio;
    }

    public BigDecimal getFocNumFolio() {
        return this.focNumFolio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFocCveStFolio(String focCveStFolio) {
        this.focCveStFolio = focCveStFolio;
    }

    public String getFocCveStFolio() {
        return this.focCveStFolio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FOLIOCTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFocNumContrato() != null && this.getFocNumContrato().longValue() == -999) {
            conditions += " AND FOC_NUM_CONTRATO IS NULL";
        } else if (this.getFocNumContrato() != null) {
            conditions += " AND FOC_NUM_CONTRATO = ?";
            values.add(this.getFocNumContrato());
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
        String sql = "SELECT * FROM FOLIOCTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFocNumContrato() != null && this.getFocNumContrato().longValue() == -999) {
            conditions += " AND FOC_NUM_CONTRATO IS NULL";
        } else if (this.getFocNumContrato() != null) {
            conditions += " AND FOC_NUM_CONTRATO = ?";
            values.add(this.getFocNumContrato());
        }

        if (this.getFocNumFolio() != null && this.getFocNumFolio().longValue() == -999) {
            conditions += " AND FOC_NUM_FOLIO IS NULL";
        } else if (this.getFocNumFolio() != null) {
            conditions += " AND FOC_NUM_FOLIO = ?";
            values.add(this.getFocNumFolio());
        }

        if (this.getFocCveStFolio() != null && "null".equals(this.getFocCveStFolio())) {
            conditions += " AND FOC_CVE_ST_FOLIO IS NULL";
        } else if (this.getFocCveStFolio() != null) {
            conditions += " AND FOC_CVE_ST_FOLIO = ?";
            values.add(this.getFocCveStFolio());
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
        String sql = "UPDATE FOLIOCTO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOC_NUM_CONTRATO = ?";
        pkValues.add(this.getFocNumContrato());
        fields += " FOC_NUM_FOLIO = ?, ";
        values.add(this.getFocNumFolio());
        fields += " FOC_CVE_ST_FOLIO = ?, ";
        values.add(this.getFocCveStFolio());
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
        String sql = "INSERT INTO FOLIOCTO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFocNumContrato());

        fields += ", FOC_NUM_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFocNumFolio());

        fields += ", FOC_CVE_ST_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFocCveStFolio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FOLIOCTO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOC_NUM_CONTRATO = ?";
        values.add(this.getFocNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Foliocto instance = (Foliocto) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFocNumContrato().equals(instance.getFocNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFocNumFolio().equals(instance.getFocNumFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFocCveStFolio().equals(instance.getFocCveStFolio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Foliocto result = new Foliocto();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFocNumContrato((BigDecimal) objectData.getData("FOC_NUM_CONTRATO"));
        result.setFocNumFolio((BigDecimal) objectData.getData("FOC_NUM_FOLIO"));
        result.setFocCveStFolio((String) objectData.getData("FOC_CVE_ST_FOLIO"));

        return result;

    }

}
