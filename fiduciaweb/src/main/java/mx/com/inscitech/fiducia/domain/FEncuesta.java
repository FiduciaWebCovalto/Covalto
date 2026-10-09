package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ENCUESTA_PK", columns = { "FENC_ID_ENCUESTA" }, sequences = { "MAX" })
public class FEncuesta extends DomainObject {

    BigDecimal fencIdEncuesta = null;
    String fencDescripcion = null;

    public FEncuesta() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFencIdEncuesta(BigDecimal fencIdEncuesta) {
        this.fencIdEncuesta = fencIdEncuesta;
    }

    public BigDecimal getFencIdEncuesta() {
        return this.fencIdEncuesta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFencDescripcion(String fencDescripcion) {
        this.fencDescripcion = fencDescripcion;
    }

    public String getFencDescripcion() {
        return this.fencDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ENCUESTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFencIdEncuesta() != null && this.getFencIdEncuesta().longValue() == -999) {
            conditions += " AND FENC_ID_ENCUESTA IS NULL";
        } else if (this.getFencIdEncuesta() != null) {
            conditions += " AND FENC_ID_ENCUESTA = ?";
            values.add(this.getFencIdEncuesta());
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
        String sql = "SELECT * FROM F_ENCUESTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFencIdEncuesta() != null && this.getFencIdEncuesta().longValue() == -999) {
            conditions += " AND FENC_ID_ENCUESTA IS NULL";
        } else if (this.getFencIdEncuesta() != null) {
            conditions += " AND FENC_ID_ENCUESTA = ?";
            values.add(this.getFencIdEncuesta());
        }

        if (this.getFencDescripcion() != null && "null".equals(this.getFencDescripcion())) {
            conditions += " AND FENC_DESCRIPCION IS NULL";
        } else if (this.getFencDescripcion() != null) {
            conditions += " AND FENC_DESCRIPCION = ?";
            values.add(this.getFencDescripcion());
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
        String sql = "UPDATE F_ENCUESTA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FENC_ID_ENCUESTA = ?";
        pkValues.add(this.getFencIdEncuesta());
        fields += " FENC_DESCRIPCION = ?, ";
        values.add(this.getFencDescripcion());
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
        String sql = "INSERT INTO F_ENCUESTA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FENC_ID_ENCUESTA";
        fieldValues += ", ?";
        values.add(this.getFencIdEncuesta());

        fields += ", FENC_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getFencDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ENCUESTA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FENC_ID_ENCUESTA = ?";
        values.add(this.getFencIdEncuesta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEncuesta instance = (FEncuesta) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFencIdEncuesta().equals(instance.getFencIdEncuesta()))
            equalObjects = false;
        if (equalObjects && !this.getFencDescripcion().equals(instance.getFencDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEncuesta result = new FEncuesta();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFencIdEncuesta((BigDecimal) objectData.getData("FENC_ID_ENCUESTA"));
        result.setFencDescripcion((String) objectData.getData("FENC_DESCRIPCION"));

        return result;

    }

}
