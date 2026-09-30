package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ESPECIAL_PK", columns = { "ESP_IDENTIFICADOR" }, sequences = { "MAX" })
public class Especial extends DomainObject {

    BigDecimal espIdentificador = null;
    String espDescripcion = null;

    public Especial() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEspIdentificador(BigDecimal espIdentificador) {
        this.espIdentificador = espIdentificador;
    }

    public BigDecimal getEspIdentificador() {
        return this.espIdentificador;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEspDescripcion(String espDescripcion) {
        this.espDescripcion = espDescripcion;
    }

    public String getEspDescripcion() {
        return this.espDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ESPECIAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEspIdentificador() != null && this.getEspIdentificador().longValue() == -999) {
            conditions += " AND ESP_IDENTIFICADOR IS NULL";
        } else if (this.getEspIdentificador() != null) {
            conditions += " AND ESP_IDENTIFICADOR = ?";
            values.add(this.getEspIdentificador());
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
        String sql = "SELECT * FROM ESPECIAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEspIdentificador() != null && this.getEspIdentificador().longValue() == -999) {
            conditions += " AND ESP_IDENTIFICADOR IS NULL";
        } else if (this.getEspIdentificador() != null) {
            conditions += " AND ESP_IDENTIFICADOR = ?";
            values.add(this.getEspIdentificador());
        }

        if (this.getEspDescripcion() != null && "null".equals(this.getEspDescripcion())) {
            conditions += " AND ESP_DESCRIPCION IS NULL";
        } else if (this.getEspDescripcion() != null) {
            conditions += " AND ESP_DESCRIPCION = ?";
            values.add(this.getEspDescripcion());
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
        String sql = "UPDATE ESPECIAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESP_IDENTIFICADOR = ?";
        pkValues.add(this.getEspIdentificador());
        fields += " ESP_DESCRIPCION = ?, ";
        values.add(this.getEspDescripcion());
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
        String sql = "INSERT INTO ESPECIAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESP_IDENTIFICADOR";
        fieldValues += ", ?";
        values.add(this.getEspIdentificador());

        fields += ", ESP_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getEspDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ESPECIAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESP_IDENTIFICADOR = ?";
        values.add(this.getEspIdentificador());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Especial instance = (Especial) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEspIdentificador().equals(instance.getEspIdentificador()))
            equalObjects = false;
        if (equalObjects && !this.getEspDescripcion().equals(instance.getEspDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Especial result = new Especial();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEspIdentificador((BigDecimal) objectData.getData("ESP_IDENTIFICADOR"));
        result.setEspDescripcion((String) objectData.getData("ESP_DESCRIPCION"));

        return result;

    }

}
