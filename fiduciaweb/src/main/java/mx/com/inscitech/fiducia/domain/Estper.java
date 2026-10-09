package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ESTPER_PK", columns = { "TPR_IDENTIFICACION" }, sequences = { "MAX" })
public class Estper extends DomainObject {

    BigDecimal tprIdentificacion = null;
    String tprDescripcion = null;

    public Estper() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTprIdentificacion(BigDecimal tprIdentificacion) {
        this.tprIdentificacion = tprIdentificacion;
    }

    public BigDecimal getTprIdentificacion() {
        return this.tprIdentificacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTprDescripcion(String tprDescripcion) {
        this.tprDescripcion = tprDescripcion;
    }

    public String getTprDescripcion() {
        return this.tprDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ESTPER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTprIdentificacion() != null && this.getTprIdentificacion().longValue() == -999) {
            conditions += " AND TPR_IDENTIFICACION IS NULL";
        } else if (this.getTprIdentificacion() != null) {
            conditions += " AND TPR_IDENTIFICACION = ?";
            values.add(this.getTprIdentificacion());
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
        String sql = "SELECT * FROM ESTPER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTprIdentificacion() != null && this.getTprIdentificacion().longValue() == -999) {
            conditions += " AND TPR_IDENTIFICACION IS NULL";
        } else if (this.getTprIdentificacion() != null) {
            conditions += " AND TPR_IDENTIFICACION = ?";
            values.add(this.getTprIdentificacion());
        }

        if (this.getTprDescripcion() != null && "null".equals(this.getTprDescripcion())) {
            conditions += " AND TPR_DESCRIPCION IS NULL";
        } else if (this.getTprDescripcion() != null) {
            conditions += " AND TPR_DESCRIPCION = ?";
            values.add(this.getTprDescripcion());
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
        String sql = "UPDATE ESTPER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TPR_IDENTIFICACION = ?";
        pkValues.add(this.getTprIdentificacion());
        fields += " TPR_DESCRIPCION = ?, ";
        values.add(this.getTprDescripcion());
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
        String sql = "INSERT INTO ESTPER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TPR_IDENTIFICACION";
        fieldValues += ", ?";
        values.add(this.getTprIdentificacion());

        fields += ", TPR_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getTprDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ESTPER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TPR_IDENTIFICACION = ?";
        values.add(this.getTprIdentificacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Estper instance = (Estper) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTprIdentificacion().equals(instance.getTprIdentificacion()))
            equalObjects = false;
        if (equalObjects && !this.getTprDescripcion().equals(instance.getTprDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Estper result = new Estper();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTprIdentificacion((BigDecimal) objectData.getData("TPR_IDENTIFICACION"));
        result.setTprDescripcion((String) objectData.getData("TPR_DESCRIPCION"));

        return result;

    }

}
