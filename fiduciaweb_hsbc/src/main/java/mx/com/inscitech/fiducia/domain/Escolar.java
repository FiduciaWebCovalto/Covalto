package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ESCOLAR_PK", columns = { "ESC_IDENTIFICACION" }, sequences = { "MAX" })
public class Escolar extends DomainObject {

    BigDecimal escIdentificacion = null;
    String escDescripcion = null;

    public Escolar() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEscIdentificacion(BigDecimal escIdentificacion) {
        this.escIdentificacion = escIdentificacion;
    }

    public BigDecimal getEscIdentificacion() {
        return this.escIdentificacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEscDescripcion(String escDescripcion) {
        this.escDescripcion = escDescripcion;
    }

    public String getEscDescripcion() {
        return this.escDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ESCOLAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEscIdentificacion() != null && this.getEscIdentificacion().longValue() == -999) {
            conditions += " AND ESC_IDENTIFICACION IS NULL";
        } else if (this.getEscIdentificacion() != null) {
            conditions += " AND ESC_IDENTIFICACION = ?";
            values.add(this.getEscIdentificacion());
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
        String sql = "SELECT * FROM ESCOLAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEscIdentificacion() != null && this.getEscIdentificacion().longValue() == -999) {
            conditions += " AND ESC_IDENTIFICACION IS NULL";
        } else if (this.getEscIdentificacion() != null) {
            conditions += " AND ESC_IDENTIFICACION = ?";
            values.add(this.getEscIdentificacion());
        }

        if (this.getEscDescripcion() != null && "null".equals(this.getEscDescripcion())) {
            conditions += " AND ESC_DESCRIPCION IS NULL";
        } else if (this.getEscDescripcion() != null) {
            conditions += " AND ESC_DESCRIPCION = ?";
            values.add(this.getEscDescripcion());
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
        String sql = "UPDATE ESCOLAR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESC_IDENTIFICACION = ?";
        pkValues.add(this.getEscIdentificacion());
        fields += " ESC_DESCRIPCION = ?, ";
        values.add(this.getEscDescripcion());
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
        String sql = "INSERT INTO ESCOLAR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESC_IDENTIFICACION";
        fieldValues += ", ?";
        values.add(this.getEscIdentificacion());

        fields += ", ESC_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getEscDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ESCOLAR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESC_IDENTIFICACION = ?";
        values.add(this.getEscIdentificacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Escolar instance = (Escolar) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEscIdentificacion().equals(instance.getEscIdentificacion()))
            equalObjects = false;
        if (equalObjects && !this.getEscDescripcion().equals(instance.getEscDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Escolar result = new Escolar();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEscIdentificacion((BigDecimal) objectData.getData("ESC_IDENTIFICACION"));
        result.setEscDescripcion((String) objectData.getData("ESC_DESCRIPCION"));

        return result;

    }

}
