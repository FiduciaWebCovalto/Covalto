package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARAM_GLOBAL_PK", columns = { "PARAM_CLAVE" }, sequences = { "MAX" })
public class ParamGlobal extends DomainObject {

    BigDecimal paramClave = null;
    String paramDescripcion = null;
    BigDecimal paramValor = null;
    String paramValor2 = null;

    public ParamGlobal() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setParamClave(BigDecimal paramClave) {
        this.paramClave = paramClave;
    }

    public BigDecimal getParamClave() {
        return this.paramClave;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setParamDescripcion(String paramDescripcion) {
        this.paramDescripcion = paramDescripcion;
    }

    public String getParamDescripcion() {
        return this.paramDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setParamValor(BigDecimal paramValor) {
        this.paramValor = paramValor;
    }

    public BigDecimal getParamValor() {
        return this.paramValor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setParamValor2(String paramValor2) {
        this.paramValor2 = paramValor2;
    }

    public String getParamValor2() {
        return this.paramValor2;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARAM_GLOBAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getParamClave() != null && this.getParamClave().longValue() == -999) {
            conditions += " AND PARAM_CLAVE IS NULL";
        } else if (this.getParamClave() != null) {
            conditions += " AND PARAM_CLAVE = ?";
            values.add(this.getParamClave());
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
        String sql = "SELECT * FROM PARAM_GLOBAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getParamClave() != null && this.getParamClave().longValue() == -999) {
            conditions += " AND PARAM_CLAVE IS NULL";
        } else if (this.getParamClave() != null) {
            conditions += " AND PARAM_CLAVE = ?";
            values.add(this.getParamClave());
        }

        if (this.getParamDescripcion() != null && "null".equals(this.getParamDescripcion())) {
            conditions += " AND PARAM_DESCRIPCION IS NULL";
        } else if (this.getParamDescripcion() != null) {
            conditions += " AND PARAM_DESCRIPCION = ?";
            values.add(this.getParamDescripcion());
        }

        if (this.getParamValor() != null && this.getParamValor().longValue() == -999) {
            conditions += " AND PARAM_VALOR IS NULL";
        } else if (this.getParamValor() != null) {
            conditions += " AND PARAM_VALOR = ?";
            values.add(this.getParamValor());
        }

        if (this.getParamValor2() != null && "null".equals(this.getParamValor2())) {
            conditions += " AND PARAM_VALOR2 IS NULL";
        } else if (this.getParamValor2() != null) {
            conditions += " AND PARAM_VALOR2 = ?";
            values.add(this.getParamValor2());
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
        String sql = "UPDATE PARAM_GLOBAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PARAM_CLAVE = ?";
        pkValues.add(this.getParamClave());
        fields += " PARAM_DESCRIPCION = ?, ";
        values.add(this.getParamDescripcion());
        fields += " PARAM_VALOR = ?, ";
        values.add(this.getParamValor());
        fields += " PARAM_VALOR2 = ?, ";
        values.add(this.getParamValor2());
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
        String sql = "INSERT INTO PARAM_GLOBAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PARAM_CLAVE";
        fieldValues += ", ?";
        values.add(this.getParamClave());

        fields += ", PARAM_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getParamDescripcion());

        fields += ", PARAM_VALOR";
        fieldValues += ", ?";
        values.add(this.getParamValor());

        fields += ", PARAM_VALOR2";
        fieldValues += ", ?";
        values.add(this.getParamValor2());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARAM_GLOBAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PARAM_CLAVE = ?";
        values.add(this.getParamClave());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ParamGlobal instance = (ParamGlobal) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getParamClave().equals(instance.getParamClave()))
            equalObjects = false;
        if (equalObjects && !this.getParamDescripcion().equals(instance.getParamDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getParamValor().equals(instance.getParamValor()))
            equalObjects = false;
        if (equalObjects && !this.getParamValor2().equals(instance.getParamValor2()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ParamGlobal result = new ParamGlobal();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setParamClave((BigDecimal) objectData.getData("PARAM_CLAVE"));
        result.setParamDescripcion((String) objectData.getData("PARAM_DESCRIPCION"));
        result.setParamValor((BigDecimal) objectData.getData("PARAM_VALOR"));
        result.setParamValor2((String) objectData.getData("PARAM_VALOR2"));

        return result;

    }

}
