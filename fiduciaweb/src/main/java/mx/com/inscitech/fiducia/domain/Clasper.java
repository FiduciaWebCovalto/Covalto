package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CLASPER_PK", columns = { "CLA_IDENTIFICACION" }, sequences = { "MAX" })
public class Clasper extends DomainObject {

    BigDecimal claIdentificacion = null;
    String claDescripcion = null;

    public Clasper() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setClaIdentificacion(BigDecimal claIdentificacion) {
        this.claIdentificacion = claIdentificacion;
    }

    public BigDecimal getClaIdentificacion() {
        return this.claIdentificacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setClaDescripcion(String claDescripcion) {
        this.claDescripcion = claDescripcion;
    }

    public String getClaDescripcion() {
        return this.claDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CLASPER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getClaIdentificacion() != null && this.getClaIdentificacion().longValue() == -999) {
            conditions += " AND CLA_IDENTIFICACION IS NULL";
        } else if (this.getClaIdentificacion() != null) {
            conditions += " AND CLA_IDENTIFICACION = ?";
            values.add(this.getClaIdentificacion());
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
        String sql = "SELECT * FROM CLASPER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getClaIdentificacion() != null && this.getClaIdentificacion().longValue() == -999) {
            conditions += " AND CLA_IDENTIFICACION IS NULL";
        } else if (this.getClaIdentificacion() != null) {
            conditions += " AND CLA_IDENTIFICACION = ?";
            values.add(this.getClaIdentificacion());
        }

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
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
        String sql = "UPDATE CLASPER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CLA_IDENTIFICACION = ?";
        pkValues.add(this.getClaIdentificacion());
        fields += " CLA_DESCRIPCION = ?, ";
        values.add(this.getClaDescripcion());
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
        String sql = "INSERT INTO CLASPER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CLA_IDENTIFICACION";
        fieldValues += ", ?";
        values.add(this.getClaIdentificacion());

        fields += ", CLA_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getClaDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CLASPER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CLA_IDENTIFICACION = ?";
        values.add(this.getClaIdentificacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Clasper instance = (Clasper) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getClaIdentificacion().equals(instance.getClaIdentificacion()))
            equalObjects = false;
        if (equalObjects && !this.getClaDescripcion().equals(instance.getClaDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Clasper result = new Clasper();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setClaIdentificacion((BigDecimal) objectData.getData("CLA_IDENTIFICACION"));
        result.setClaDescripcion((String) objectData.getData("CLA_DESCRIPCION"));

        return result;

    }

}
