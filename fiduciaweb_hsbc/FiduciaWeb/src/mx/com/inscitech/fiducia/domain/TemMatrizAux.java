package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TEM_MATRIZ_AUX_PK", columns = { "TEM_FILA", "TEM_COL", "TEM_TABLA" }, sequences = { "MANUAL" })
public class TemMatrizAux extends DomainObject {

    BigDecimal temFila = null;
    BigDecimal temCol = null;
    String temValor = null;
    String temTabla = null;

    public TemMatrizAux() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTemFila(BigDecimal temFila) {
        this.temFila = temFila;
    }

    public BigDecimal getTemFila() {
        return this.temFila;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTemCol(BigDecimal temCol) {
        this.temCol = temCol;
    }

    public BigDecimal getTemCol() {
        return this.temCol;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTemValor(String temValor) {
        this.temValor = temValor;
    }

    public String getTemValor() {
        return this.temValor;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTemTabla(String temTabla) {
        this.temTabla = temTabla;
    }

    public String getTemTabla() {
        return this.temTabla;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TEM_MATRIZ_AUX ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTemFila() != null && this.getTemFila().longValue() == -999) {
            conditions += " AND TEM_FILA IS NULL";
        } else if (this.getTemFila() != null) {
            conditions += " AND TEM_FILA = ?";
            values.add(this.getTemFila());
        }

        if (this.getTemCol() != null && this.getTemCol().longValue() == -999) {
            conditions += " AND TEM_COL IS NULL";
        } else if (this.getTemCol() != null) {
            conditions += " AND TEM_COL = ?";
            values.add(this.getTemCol());
        }

        if (this.getTemTabla() != null && "null".equals(this.getTemTabla())) {
            conditions += " AND TEM_TABLA IS NULL";
        } else if (this.getTemTabla() != null) {
            conditions += " AND TEM_TABLA = ?";
            values.add(this.getTemTabla());
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
        String sql = "SELECT * FROM TEM_MATRIZ_AUX ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTemFila() != null && this.getTemFila().longValue() == -999) {
            conditions += " AND TEM_FILA IS NULL";
        } else if (this.getTemFila() != null) {
            conditions += " AND TEM_FILA = ?";
            values.add(this.getTemFila());
        }

        if (this.getTemCol() != null && this.getTemCol().longValue() == -999) {
            conditions += " AND TEM_COL IS NULL";
        } else if (this.getTemCol() != null) {
            conditions += " AND TEM_COL = ?";
            values.add(this.getTemCol());
        }

        if (this.getTemValor() != null && "null".equals(this.getTemValor())) {
            conditions += " AND TEM_VALOR IS NULL";
        } else if (this.getTemValor() != null) {
            conditions += " AND TEM_VALOR = ?";
            values.add(this.getTemValor());
        }

        if (this.getTemTabla() != null && "null".equals(this.getTemTabla())) {
            conditions += " AND TEM_TABLA IS NULL";
        } else if (this.getTemTabla() != null) {
            conditions += " AND TEM_TABLA = ?";
            values.add(this.getTemTabla());
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
        String sql = "UPDATE TEM_MATRIZ_AUX SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TEM_FILA = ?";
        pkValues.add(this.getTemFila());
        conditions += " AND TEM_COL = ?";
        pkValues.add(this.getTemCol());
        fields += " TEM_VALOR = ?, ";
        values.add(this.getTemValor());
        conditions += " AND TEM_TABLA = ?";
        pkValues.add(this.getTemTabla());
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
        String sql = "INSERT INTO TEM_MATRIZ_AUX ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TEM_FILA";
        fieldValues += ", ?";
        values.add(this.getTemFila());

        fields += ", TEM_COL";
        fieldValues += ", ?";
        values.add(this.getTemCol());

        fields += ", TEM_VALOR";
        fieldValues += ", ?";
        values.add(this.getTemValor());

        fields += ", TEM_TABLA";
        fieldValues += ", ?";
        values.add(this.getTemTabla());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TEM_MATRIZ_AUX WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TEM_FILA = ?";
        values.add(this.getTemFila());
        conditions += " AND TEM_COL = ?";
        values.add(this.getTemCol());
        conditions += " AND TEM_TABLA = ?";
        values.add(this.getTemTabla());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        TemMatrizAux instance = (TemMatrizAux) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTemFila().equals(instance.getTemFila()))
            equalObjects = false;
        if (equalObjects && !this.getTemCol().equals(instance.getTemCol()))
            equalObjects = false;
        if (equalObjects && !this.getTemValor().equals(instance.getTemValor()))
            equalObjects = false;
        if (equalObjects && !this.getTemTabla().equals(instance.getTemTabla()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        TemMatrizAux result = new TemMatrizAux();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTemFila((BigDecimal) objectData.getData("TEM_FILA"));
        result.setTemCol((BigDecimal) objectData.getData("TEM_COL"));
        result.setTemValor((String) objectData.getData("TEM_VALOR"));
        result.setTemTabla((String) objectData.getData("TEM_TABLA"));

        return result;

    }

}
