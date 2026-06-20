package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INCENC_PK", columns = { "IEN_NUM_INCISO", "IEN_NUM_PREGUNTA" }, sequences = { "MANUAL" })
public class Incenc extends DomainObject {

    String ienNumInciso = null;
    String ienDescrInciso = null;
    BigDecimal ienNumPregunta = null;

    public Incenc() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setIenNumInciso(String ienNumInciso) {
        this.ienNumInciso = ienNumInciso;
    }

    public String getIenNumInciso() {
        return this.ienNumInciso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIenDescrInciso(String ienDescrInciso) {
        this.ienDescrInciso = ienDescrInciso;
    }

    public String getIenDescrInciso() {
        return this.ienDescrInciso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setIenNumPregunta(BigDecimal ienNumPregunta) {
        this.ienNumPregunta = ienNumPregunta;
    }

    public BigDecimal getIenNumPregunta() {
        return this.ienNumPregunta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INCENC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIenNumInciso() != null && "null".equals(this.getIenNumInciso())) {
            conditions += " AND IEN_NUM_INCISO IS NULL";
        } else if (this.getIenNumInciso() != null) {
            conditions += " AND IEN_NUM_INCISO = ?";
            values.add(this.getIenNumInciso());
        }

        if (this.getIenNumPregunta() != null && this.getIenNumPregunta().longValue() == -999) {
            conditions += " AND IEN_NUM_PREGUNTA IS NULL";
        } else if (this.getIenNumPregunta() != null) {
            conditions += " AND IEN_NUM_PREGUNTA = ?";
            values.add(this.getIenNumPregunta());
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
        String sql = "SELECT * FROM INCENC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIenNumInciso() != null && "null".equals(this.getIenNumInciso())) {
            conditions += " AND IEN_NUM_INCISO IS NULL";
        } else if (this.getIenNumInciso() != null) {
            conditions += " AND IEN_NUM_INCISO = ?";
            values.add(this.getIenNumInciso());
        }

        if (this.getIenDescrInciso() != null && "null".equals(this.getIenDescrInciso())) {
            conditions += " AND IEN_DESCR_INCISO IS NULL";
        } else if (this.getIenDescrInciso() != null) {
            conditions += " AND IEN_DESCR_INCISO = ?";
            values.add(this.getIenDescrInciso());
        }

        if (this.getIenNumPregunta() != null && this.getIenNumPregunta().longValue() == -999) {
            conditions += " AND IEN_NUM_PREGUNTA IS NULL";
        } else if (this.getIenNumPregunta() != null) {
            conditions += " AND IEN_NUM_PREGUNTA = ?";
            values.add(this.getIenNumPregunta());
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
        String sql = "UPDATE INCENC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND IEN_NUM_INCISO = ?";
        pkValues.add(this.getIenNumInciso());
        fields += " IEN_DESCR_INCISO = ?, ";
        values.add(this.getIenDescrInciso());
        conditions += " AND IEN_NUM_PREGUNTA = ?";
        pkValues.add(this.getIenNumPregunta());
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
        String sql = "INSERT INTO INCENC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", IEN_NUM_INCISO";
        fieldValues += ", ?";
        values.add(this.getIenNumInciso());

        fields += ", IEN_DESCR_INCISO";
        fieldValues += ", ?";
        values.add(this.getIenDescrInciso());

        fields += ", IEN_NUM_PREGUNTA";
        fieldValues += ", ?";
        values.add(this.getIenNumPregunta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INCENC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND IEN_NUM_INCISO = ?";
        values.add(this.getIenNumInciso());
        conditions += " AND IEN_NUM_PREGUNTA = ?";
        values.add(this.getIenNumPregunta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Incenc instance = (Incenc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIenNumInciso().equals(instance.getIenNumInciso()))
            equalObjects = false;
        if (equalObjects && !this.getIenDescrInciso().equals(instance.getIenDescrInciso()))
            equalObjects = false;
        if (equalObjects && !this.getIenNumPregunta().equals(instance.getIenNumPregunta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Incenc result = new Incenc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIenNumInciso((String) objectData.getData("IEN_NUM_INCISO"));
        result.setIenDescrInciso((String) objectData.getData("IEN_DESCR_INCISO"));
        result.setIenNumPregunta((BigDecimal) objectData.getData("IEN_NUM_PREGUNTA"));

        return result;

    }

}
