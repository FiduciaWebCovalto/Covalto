package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PAQUETES_PK", columns = { "PAQ_IDENTIFICADOR" }, sequences = { "MAX" })
public class Paquetes extends DomainObject {

    BigDecimal paqIdentificador = null;
    String paqDescripcion = null;

    public Paquetes() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPaqIdentificador(BigDecimal paqIdentificador) {
        this.paqIdentificador = paqIdentificador;
    }

    public BigDecimal getPaqIdentificador() {
        return this.paqIdentificador;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPaqDescripcion(String paqDescripcion) {
        this.paqDescripcion = paqDescripcion;
    }

    public String getPaqDescripcion() {
        return this.paqDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PAQUETES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPaqIdentificador() != null && this.getPaqIdentificador().longValue() == -999) {
            conditions += " AND PAQ_IDENTIFICADOR IS NULL";
        } else if (this.getPaqIdentificador() != null) {
            conditions += " AND PAQ_IDENTIFICADOR = ?";
            values.add(this.getPaqIdentificador());
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
        String sql = "SELECT * FROM PAQUETES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPaqIdentificador() != null && this.getPaqIdentificador().longValue() == -999) {
            conditions += " AND PAQ_IDENTIFICADOR IS NULL";
        } else if (this.getPaqIdentificador() != null) {
            conditions += " AND PAQ_IDENTIFICADOR = ?";
            values.add(this.getPaqIdentificador());
        }

        if (this.getPaqDescripcion() != null && "null".equals(this.getPaqDescripcion())) {
            conditions += " AND PAQ_DESCRIPCION IS NULL";
        } else if (this.getPaqDescripcion() != null) {
            conditions += " AND PAQ_DESCRIPCION = ?";
            values.add(this.getPaqDescripcion());
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
        String sql = "UPDATE PAQUETES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PAQ_IDENTIFICADOR = ?";
        pkValues.add(this.getPaqIdentificador());
        fields += " PAQ_DESCRIPCION = ?, ";
        values.add(this.getPaqDescripcion());
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
        String sql = "INSERT INTO PAQUETES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAQ_IDENTIFICADOR";
        fieldValues += ", ?";
        values.add(this.getPaqIdentificador());

        fields += ", PAQ_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getPaqDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PAQUETES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PAQ_IDENTIFICADOR = ?";
        values.add(this.getPaqIdentificador());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Paquetes instance = (Paquetes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPaqIdentificador().equals(instance.getPaqIdentificador()))
            equalObjects = false;
        if (equalObjects && !this.getPaqDescripcion().equals(instance.getPaqDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Paquetes result = new Paquetes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPaqIdentificador((BigDecimal) objectData.getData("PAQ_IDENTIFICADOR"));
        result.setPaqDescripcion((String) objectData.getData("PAQ_DESCRIPCION"));

        return result;

    }

}
