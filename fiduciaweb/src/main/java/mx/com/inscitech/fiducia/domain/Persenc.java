package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PERSENC_PK", columns = { "PEC_NUM_PREGUNTA" }, sequences = { "MAX" })
public class Persenc extends DomainObject {

    BigDecimal pecNumPregunta = null;
    String pecDescrPregunta = null;

    public Persenc() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setPecNumPregunta(BigDecimal pecNumPregunta) {
        this.pecNumPregunta = pecNumPregunta;
    }

    public BigDecimal getPecNumPregunta() {
        return this.pecNumPregunta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPecDescrPregunta(String pecDescrPregunta) {
        this.pecDescrPregunta = pecDescrPregunta;
    }

    public String getPecDescrPregunta() {
        return this.pecDescrPregunta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PERSENC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPecNumPregunta() != null && this.getPecNumPregunta().longValue() == -999) {
            conditions += " AND PEC_NUM_PREGUNTA IS NULL";
        } else if (this.getPecNumPregunta() != null) {
            conditions += " AND PEC_NUM_PREGUNTA = ?";
            values.add(this.getPecNumPregunta());
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
        String sql = "SELECT * FROM PERSENC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPecNumPregunta() != null && this.getPecNumPregunta().longValue() == -999) {
            conditions += " AND PEC_NUM_PREGUNTA IS NULL";
        } else if (this.getPecNumPregunta() != null) {
            conditions += " AND PEC_NUM_PREGUNTA = ?";
            values.add(this.getPecNumPregunta());
        }

        if (this.getPecDescrPregunta() != null && "null".equals(this.getPecDescrPregunta())) {
            conditions += " AND PEC_DESCR_PREGUNTA IS NULL";
        } else if (this.getPecDescrPregunta() != null) {
            conditions += " AND PEC_DESCR_PREGUNTA = ?";
            values.add(this.getPecDescrPregunta());
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
        String sql = "UPDATE PERSENC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PEC_NUM_PREGUNTA = ?";
        pkValues.add(this.getPecNumPregunta());
        fields += " PEC_DESCR_PREGUNTA = ?, ";
        values.add(this.getPecDescrPregunta());
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
        String sql = "INSERT INTO PERSENC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PEC_NUM_PREGUNTA";
        fieldValues += ", ?";
        values.add(this.getPecNumPregunta());

        fields += ", PEC_DESCR_PREGUNTA";
        fieldValues += ", ?";
        values.add(this.getPecDescrPregunta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PERSENC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PEC_NUM_PREGUNTA = ?";
        values.add(this.getPecNumPregunta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Persenc instance = (Persenc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPecNumPregunta().equals(instance.getPecNumPregunta()))
            equalObjects = false;
        if (equalObjects && !this.getPecDescrPregunta().equals(instance.getPecDescrPregunta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Persenc result = new Persenc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPecNumPregunta((BigDecimal) objectData.getData("PEC_NUM_PREGUNTA"));
        result.setPecDescrPregunta((String) objectData.getData("PEC_DESCR_PREGUNTA"));

        return result;

    }

}
