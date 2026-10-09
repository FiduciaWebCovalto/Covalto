package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_LAYODCAR_PK", columns = { "LADY_ID_LAYOD" }, sequences = { "MAX" })
public class FLayodcar extends DomainObject {

    BigDecimal ladyIdLayod = null;
    String ladyNombre = null;
    String ladyDescripcion = null;
    String ladyFecEstatus = null;
    String ladyEstatus = null;

    public FLayodcar() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLadyIdLayod(BigDecimal ladyIdLayod) {
        this.ladyIdLayod = ladyIdLayod;
    }

    public BigDecimal getLadyIdLayod() {
        return this.ladyIdLayod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setLadyNombre(String ladyNombre) {
        this.ladyNombre = ladyNombre;
    }

    public String getLadyNombre() {
        return this.ladyNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setLadyDescripcion(String ladyDescripcion) {
        this.ladyDescripcion = ladyDescripcion;
    }

    public String getLadyDescripcion() {
        return this.ladyDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setLadyFecEstatus(String ladyFecEstatus) {
        this.ladyFecEstatus = ladyFecEstatus;
    }

    public String getLadyFecEstatus() {
        return this.ladyFecEstatus;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setLadyEstatus(String ladyEstatus) {
        this.ladyEstatus = ladyEstatus;
    }

    public String getLadyEstatus() {
        return this.ladyEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_LAYODCAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getLadyIdLayod() != null && this.getLadyIdLayod().longValue() == -999) {
            conditions += " AND LADY_ID_LAYOD IS NULL";
        } else if (this.getLadyIdLayod() != null) {
            conditions += " AND LADY_ID_LAYOD = ?";
            values.add(this.getLadyIdLayod());
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
        String sql = "SELECT * FROM F_LAYODCAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getLadyIdLayod() != null && this.getLadyIdLayod().longValue() == -999) {
            conditions += " AND LADY_ID_LAYOD IS NULL";
        } else if (this.getLadyIdLayod() != null) {
            conditions += " AND LADY_ID_LAYOD = ?";
            values.add(this.getLadyIdLayod());
        }

        if (this.getLadyNombre() != null && "null".equals(this.getLadyNombre())) {
            conditions += " AND LADY_NOMBRE IS NULL";
        } else if (this.getLadyNombre() != null) {
            conditions += " AND LADY_NOMBRE = ?";
            values.add(this.getLadyNombre());
        }

        if (this.getLadyDescripcion() != null && "null".equals(this.getLadyDescripcion())) {
            conditions += " AND LADY_DESCRIPCION IS NULL";
        } else if (this.getLadyDescripcion() != null) {
            conditions += " AND LADY_DESCRIPCION = ?";
            values.add(this.getLadyDescripcion());
        }

        if (this.getLadyFecEstatus() != null && "null".equals(this.getLadyFecEstatus())) {
            conditions += " AND LADY_FEC_ESTATUS IS NULL";
        } else if (this.getLadyFecEstatus() != null) {
            conditions += " AND LADY_FEC_ESTATUS = ?";
            values.add(this.getLadyFecEstatus());
        }

        if (this.getLadyEstatus() != null && "null".equals(this.getLadyEstatus())) {
            conditions += " AND LADY_ESTATUS IS NULL";
        } else if (this.getLadyEstatus() != null) {
            conditions += " AND LADY_ESTATUS = ?";
            values.add(this.getLadyEstatus());
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
        String sql = "UPDATE F_LAYODCAR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND LADY_ID_LAYOD = ?";
        pkValues.add(this.getLadyIdLayod());
        fields += " LADY_NOMBRE = ?, ";
        values.add(this.getLadyNombre());
        fields += " LADY_DESCRIPCION = ?, ";
        values.add(this.getLadyDescripcion());
        fields += " LADY_FEC_ESTATUS = ?, ";
        values.add(this.getLadyFecEstatus());
        fields += " LADY_ESTATUS = ?, ";
        values.add(this.getLadyEstatus());
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
        String sql = "INSERT INTO F_LAYODCAR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", LADY_ID_LAYOD";
        fieldValues += ", ?";
        values.add(this.getLadyIdLayod());

        fields += ", LADY_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getLadyNombre());

        fields += ", LADY_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getLadyDescripcion());

        fields += ", LADY_FEC_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getLadyFecEstatus());

        fields += ", LADY_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getLadyEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_LAYODCAR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND LADY_ID_LAYOD = ?";
        values.add(this.getLadyIdLayod());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FLayodcar instance = (FLayodcar) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getLadyIdLayod().equals(instance.getLadyIdLayod()))
            equalObjects = false;
        if (equalObjects && !this.getLadyNombre().equals(instance.getLadyNombre()))
            equalObjects = false;
        if (equalObjects && !this.getLadyDescripcion().equals(instance.getLadyDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getLadyFecEstatus().equals(instance.getLadyFecEstatus()))
            equalObjects = false;
        if (equalObjects && !this.getLadyEstatus().equals(instance.getLadyEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FLayodcar result = new FLayodcar();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setLadyIdLayod((BigDecimal) objectData.getData("LADY_ID_LAYOD"));
        result.setLadyNombre((String) objectData.getData("LADY_NOMBRE"));
        result.setLadyDescripcion((String) objectData.getData("LADY_DESCRIPCION"));
        result.setLadyFecEstatus((String) objectData.getData("LADY_FEC_ESTATUS"));
        result.setLadyEstatus((String) objectData.getData("LADY_ESTATUS"));

        return result;

    }

}
