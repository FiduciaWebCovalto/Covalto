package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PLAZAS_BANCO_PK", columns = { "FPLB_ID_BANCO", "FPLB_ID_PLAZA" }, sequences = { "MANUAL" })
public class FPlazasBanco extends DomainObject {

    BigDecimal fplbIdBanco = null;
    BigDecimal fplbIdPlaza = null;
    String fplbNombrePlaza = null;

    public FPlazasBanco() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFplbIdBanco(BigDecimal fplbIdBanco) {
        this.fplbIdBanco = fplbIdBanco;
    }

    public BigDecimal getFplbIdBanco() {
        return this.fplbIdBanco;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFplbIdPlaza(BigDecimal fplbIdPlaza) {
        this.fplbIdPlaza = fplbIdPlaza;
    }

    public BigDecimal getFplbIdPlaza() {
        return this.fplbIdPlaza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFplbNombrePlaza(String fplbNombrePlaza) {
        this.fplbNombrePlaza = fplbNombrePlaza;
    }

    public String getFplbNombrePlaza() {
        return this.fplbNombrePlaza;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PLAZAS_BANCO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFplbIdBanco() != null && this.getFplbIdBanco().longValue() == -999) {
            conditions += " AND FPLB_ID_BANCO IS NULL";
        } else if (this.getFplbIdBanco() != null) {
            conditions += " AND FPLB_ID_BANCO = ?";
            values.add(this.getFplbIdBanco());
        }

        if (this.getFplbIdPlaza() != null && this.getFplbIdPlaza().longValue() == -999) {
            conditions += " AND FPLB_ID_PLAZA IS NULL";
        } else if (this.getFplbIdPlaza() != null) {
            conditions += " AND FPLB_ID_PLAZA = ?";
            values.add(this.getFplbIdPlaza());
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
        String sql = "SELECT * FROM F_PLAZAS_BANCO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFplbIdBanco() != null && this.getFplbIdBanco().longValue() == -999) {
            conditions += " AND FPLB_ID_BANCO IS NULL";
        } else if (this.getFplbIdBanco() != null) {
            conditions += " AND FPLB_ID_BANCO = ?";
            values.add(this.getFplbIdBanco());
        }

        if (this.getFplbIdPlaza() != null && this.getFplbIdPlaza().longValue() == -999) {
            conditions += " AND FPLB_ID_PLAZA IS NULL";
        } else if (this.getFplbIdPlaza() != null) {
            conditions += " AND FPLB_ID_PLAZA = ?";
            values.add(this.getFplbIdPlaza());
        }

        if (this.getFplbNombrePlaza() != null && "null".equals(this.getFplbNombrePlaza())) {
            conditions += " AND FPLB_NOMBRE_PLAZA IS NULL";
        } else if (this.getFplbNombrePlaza() != null) {
            conditions += " AND FPLB_NOMBRE_PLAZA = ?";
            values.add(this.getFplbNombrePlaza());
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
        String sql = "UPDATE F_PLAZAS_BANCO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FPLB_ID_BANCO = ?";
        pkValues.add(this.getFplbIdBanco());
        conditions += " AND FPLB_ID_PLAZA = ?";
        pkValues.add(this.getFplbIdPlaza());
        fields += " FPLB_NOMBRE_PLAZA = ?, ";
        values.add(this.getFplbNombrePlaza());
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
        String sql = "INSERT INTO F_PLAZAS_BANCO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPLB_ID_BANCO";
        fieldValues += ", ?";
        values.add(this.getFplbIdBanco());

        fields += ", FPLB_ID_PLAZA";
        fieldValues += ", ?";
        values.add(this.getFplbIdPlaza());

        fields += ", FPLB_NOMBRE_PLAZA";
        fieldValues += ", ?";
        values.add(this.getFplbNombrePlaza());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PLAZAS_BANCO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FPLB_ID_BANCO = ?";
        values.add(this.getFplbIdBanco());
        conditions += " AND FPLB_ID_PLAZA = ?";
        values.add(this.getFplbIdPlaza());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FPlazasBanco instance = (FPlazasBanco) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFplbIdBanco().equals(instance.getFplbIdBanco()))
            equalObjects = false;
        if (equalObjects && !this.getFplbIdPlaza().equals(instance.getFplbIdPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getFplbNombrePlaza().equals(instance.getFplbNombrePlaza()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FPlazasBanco result = new FPlazasBanco();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFplbIdBanco((BigDecimal) objectData.getData("FPLB_ID_BANCO"));
        result.setFplbIdPlaza((BigDecimal) objectData.getData("FPLB_ID_PLAZA"));
        result.setFplbNombrePlaza((String) objectData.getData("FPLB_NOMBRE_PLAZA"));

        return result;

    }

}
