package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_FIDEOPER_PK", columns = { "FFOP_ID_FIDEICOMISO", "FFOP_ID_OPERACION" }, sequences = { "MANUAL" })
public class FFideoper extends DomainObject {

    BigDecimal ffopIdFideicomiso = null;
    BigDecimal ffopIdOperacion = null;
    BigDecimal ffopTipo = null;
    String ffopComentario = null;
    String ffopStFideoper = null;

    public FFideoper() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfopIdFideicomiso(BigDecimal ffopIdFideicomiso) {
        this.ffopIdFideicomiso = ffopIdFideicomiso;
    }

    public BigDecimal getFfopIdFideicomiso() {
        return this.ffopIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 15, scale = 0, javaClass = BigDecimal.class)
    public void setFfopIdOperacion(BigDecimal ffopIdOperacion) {
        this.ffopIdOperacion = ffopIdOperacion;
    }

    public BigDecimal getFfopIdOperacion() {
        return this.ffopIdOperacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFfopTipo(BigDecimal ffopTipo) {
        this.ffopTipo = ffopTipo;
    }

    public BigDecimal getFfopTipo() {
        return this.ffopTipo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFfopComentario(String ffopComentario) {
        this.ffopComentario = ffopComentario;
    }

    public String getFfopComentario() {
        return this.ffopComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFfopStFideoper(String ffopStFideoper) {
        this.ffopStFideoper = ffopStFideoper;
    }

    public String getFfopStFideoper() {
        return this.ffopStFideoper;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_FIDEOPER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFfopIdFideicomiso() != null && this.getFfopIdFideicomiso().longValue() == -999) {
            conditions += " AND FFOP_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfopIdFideicomiso() != null) {
            conditions += " AND FFOP_ID_FIDEICOMISO = ?";
            values.add(this.getFfopIdFideicomiso());
        }

        if (this.getFfopIdOperacion() != null && this.getFfopIdOperacion().longValue() == -999) {
            conditions += " AND FFOP_ID_OPERACION IS NULL";
        } else if (this.getFfopIdOperacion() != null) {
            conditions += " AND FFOP_ID_OPERACION = ?";
            values.add(this.getFfopIdOperacion());
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
        String sql = "SELECT * FROM F_FIDEOPER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFfopIdFideicomiso() != null && this.getFfopIdFideicomiso().longValue() == -999) {
            conditions += " AND FFOP_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfopIdFideicomiso() != null) {
            conditions += " AND FFOP_ID_FIDEICOMISO = ?";
            values.add(this.getFfopIdFideicomiso());
        }

        if (this.getFfopIdOperacion() != null && this.getFfopIdOperacion().longValue() == -999) {
            conditions += " AND FFOP_ID_OPERACION IS NULL";
        } else if (this.getFfopIdOperacion() != null) {
            conditions += " AND FFOP_ID_OPERACION = ?";
            values.add(this.getFfopIdOperacion());
        }

        if (this.getFfopTipo() != null && this.getFfopTipo().longValue() == -999) {
            conditions += " AND FFOP_TIPO IS NULL";
        } else if (this.getFfopTipo() != null) {
            conditions += " AND FFOP_TIPO = ?";
            values.add(this.getFfopTipo());
        }

        if (this.getFfopComentario() != null && "null".equals(this.getFfopComentario())) {
            conditions += " AND FFOP_COMENTARIO IS NULL";
        } else if (this.getFfopComentario() != null) {
            conditions += " AND FFOP_COMENTARIO = ?";
            values.add(this.getFfopComentario());
        }

        if (this.getFfopStFideoper() != null && "null".equals(this.getFfopStFideoper())) {
            conditions += " AND FFOP_ST_FIDEOPER IS NULL";
        } else if (this.getFfopStFideoper() != null) {
            conditions += " AND FFOP_ST_FIDEOPER = ?";
            values.add(this.getFfopStFideoper());
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
        String sql = "UPDATE F_FIDEOPER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FFOP_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFfopIdFideicomiso());
        conditions += " AND FFOP_ID_OPERACION = ?";
        pkValues.add(this.getFfopIdOperacion());
        fields += " FFOP_TIPO = ?, ";
        values.add(this.getFfopTipo());
        fields += " FFOP_COMENTARIO = ?, ";
        values.add(this.getFfopComentario());
        fields += " FFOP_ST_FIDEOPER = ?, ";
        values.add(this.getFfopStFideoper());
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
        String sql = "INSERT INTO F_FIDEOPER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FFOP_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFfopIdFideicomiso());

        fields += ", FFOP_ID_OPERACION";
        fieldValues += ", ?";
        values.add(this.getFfopIdOperacion());

        fields += ", FFOP_TIPO";
        fieldValues += ", ?";
        values.add(this.getFfopTipo());

        fields += ", FFOP_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFfopComentario());

        fields += ", FFOP_ST_FIDEOPER";
        fieldValues += ", ?";
        values.add(this.getFfopStFideoper());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_FIDEOPER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FFOP_ID_FIDEICOMISO = ?";
        values.add(this.getFfopIdFideicomiso());
        conditions += " AND FFOP_ID_OPERACION = ?";
        values.add(this.getFfopIdOperacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FFideoper instance = (FFideoper) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFfopIdFideicomiso().equals(instance.getFfopIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFfopIdOperacion().equals(instance.getFfopIdOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getFfopTipo().equals(instance.getFfopTipo()))
            equalObjects = false;
        if (equalObjects && !this.getFfopComentario().equals(instance.getFfopComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFfopStFideoper().equals(instance.getFfopStFideoper()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FFideoper result = new FFideoper();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFfopIdFideicomiso((BigDecimal) objectData.getData("FFOP_ID_FIDEICOMISO"));
        result.setFfopIdOperacion((BigDecimal) objectData.getData("FFOP_ID_OPERACION"));
        result.setFfopTipo((BigDecimal) objectData.getData("FFOP_TIPO"));
        result.setFfopComentario((String) objectData.getData("FFOP_COMENTARIO"));
        result.setFfopStFideoper((String) objectData.getData("FFOP_ST_FIDEOPER"));

        return result;

    }

}
