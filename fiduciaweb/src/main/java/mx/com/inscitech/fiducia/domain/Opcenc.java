package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OPCENC_PK", columns = { "OEC_NUM_OPCION" }, sequences = { "MAX" })
public class Opcenc extends DomainObject {

    BigDecimal oecNumOpcion = null;
    String oecDescripcionOpcion = null;

    public Opcenc() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setOecNumOpcion(BigDecimal oecNumOpcion) {
        this.oecNumOpcion = oecNumOpcion;
    }

    public BigDecimal getOecNumOpcion() {
        return this.oecNumOpcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOecDescripcionOpcion(String oecDescripcionOpcion) {
        this.oecDescripcionOpcion = oecDescripcionOpcion;
    }

    public String getOecDescripcionOpcion() {
        return this.oecDescripcionOpcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OPCENC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOecNumOpcion() != null && this.getOecNumOpcion().longValue() == -999) {
            conditions += " AND OEC_NUM_OPCION IS NULL";
        } else if (this.getOecNumOpcion() != null) {
            conditions += " AND OEC_NUM_OPCION = ?";
            values.add(this.getOecNumOpcion());
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
        String sql = "SELECT * FROM OPCENC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOecNumOpcion() != null && this.getOecNumOpcion().longValue() == -999) {
            conditions += " AND OEC_NUM_OPCION IS NULL";
        } else if (this.getOecNumOpcion() != null) {
            conditions += " AND OEC_NUM_OPCION = ?";
            values.add(this.getOecNumOpcion());
        }

        if (this.getOecDescripcionOpcion() != null && "null".equals(this.getOecDescripcionOpcion())) {
            conditions += " AND OEC_DESCRIPCION_OPCION IS NULL";
        } else if (this.getOecDescripcionOpcion() != null) {
            conditions += " AND OEC_DESCRIPCION_OPCION = ?";
            values.add(this.getOecDescripcionOpcion());
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
        String sql = "UPDATE OPCENC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND OEC_NUM_OPCION = ?";
        pkValues.add(this.getOecNumOpcion());
        fields += " OEC_DESCRIPCION_OPCION = ?, ";
        values.add(this.getOecDescripcionOpcion());
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
        String sql = "INSERT INTO OPCENC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", OEC_NUM_OPCION";
        fieldValues += ", ?";
        values.add(this.getOecNumOpcion());

        fields += ", OEC_DESCRIPCION_OPCION";
        fieldValues += ", ?";
        values.add(this.getOecDescripcionOpcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OPCENC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND OEC_NUM_OPCION = ?";
        values.add(this.getOecNumOpcion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Opcenc instance = (Opcenc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getOecNumOpcion().equals(instance.getOecNumOpcion()))
            equalObjects = false;
        if (equalObjects && !this.getOecDescripcionOpcion().equals(instance.getOecDescripcionOpcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Opcenc result = new Opcenc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setOecNumOpcion((BigDecimal) objectData.getData("OEC_NUM_OPCION"));
        result.setOecDescripcionOpcion((String) objectData.getData("OEC_DESCRIPCION_OPCION"));

        return result;

    }

}
