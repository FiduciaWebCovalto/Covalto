package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_NIVELPRE_PK", columns = { "FNIVP_ID_FIDEICOMISO", "FNIVP_ID_SECUENCIAL" }, sequences = { "MANUAL" })
public class FNivelpre extends DomainObject {

    BigDecimal fnivpIdFideicomiso = null;
    BigDecimal fnivpIdSecuencial = null;
    String fnivpNombre = null;
    String fnivpDescripcion = null;
    String fnivpEstatus = null;

    public FNivelpre() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFnivpIdFideicomiso(BigDecimal fnivpIdFideicomiso) {
        this.fnivpIdFideicomiso = fnivpIdFideicomiso;
    }

    public BigDecimal getFnivpIdFideicomiso() {
        return this.fnivpIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFnivpIdSecuencial(BigDecimal fnivpIdSecuencial) {
        this.fnivpIdSecuencial = fnivpIdSecuencial;
    }

    public BigDecimal getFnivpIdSecuencial() {
        return this.fnivpIdSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFnivpNombre(String fnivpNombre) {
        this.fnivpNombre = fnivpNombre;
    }

    public String getFnivpNombre() {
        return this.fnivpNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFnivpDescripcion(String fnivpDescripcion) {
        this.fnivpDescripcion = fnivpDescripcion;
    }

    public String getFnivpDescripcion() {
        return this.fnivpDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFnivpEstatus(String fnivpEstatus) {
        this.fnivpEstatus = fnivpEstatus;
    }

    public String getFnivpEstatus() {
        return this.fnivpEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_NIVELPRE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFnivpIdFideicomiso() != null && this.getFnivpIdFideicomiso().longValue() == -999) {
            conditions += " AND FNIVP_ID_FIDEICOMISO IS NULL";
        } else if (this.getFnivpIdFideicomiso() != null) {
            conditions += " AND FNIVP_ID_FIDEICOMISO = ?";
            values.add(this.getFnivpIdFideicomiso());
        }

        if (this.getFnivpIdSecuencial() != null && this.getFnivpIdSecuencial().longValue() == -999) {
            conditions += " AND FNIVP_ID_SECUENCIAL IS NULL";
        } else if (this.getFnivpIdSecuencial() != null) {
            conditions += " AND FNIVP_ID_SECUENCIAL = ?";
            values.add(this.getFnivpIdSecuencial());
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
        String sql = "SELECT * FROM F_NIVELPRE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFnivpIdFideicomiso() != null && this.getFnivpIdFideicomiso().longValue() == -999) {
            conditions += " AND FNIVP_ID_FIDEICOMISO IS NULL";
        } else if (this.getFnivpIdFideicomiso() != null) {
            conditions += " AND FNIVP_ID_FIDEICOMISO = ?";
            values.add(this.getFnivpIdFideicomiso());
        }

        if (this.getFnivpIdSecuencial() != null && this.getFnivpIdSecuencial().longValue() == -999) {
            conditions += " AND FNIVP_ID_SECUENCIAL IS NULL";
        } else if (this.getFnivpIdSecuencial() != null) {
            conditions += " AND FNIVP_ID_SECUENCIAL = ?";
            values.add(this.getFnivpIdSecuencial());
        }

        if (this.getFnivpNombre() != null && "null".equals(this.getFnivpNombre())) {
            conditions += " AND FNIVP_NOMBRE IS NULL";
        } else if (this.getFnivpNombre() != null) {
            conditions += " AND FNIVP_NOMBRE = ?";
            values.add(this.getFnivpNombre());
        }

        if (this.getFnivpDescripcion() != null && "null".equals(this.getFnivpDescripcion())) {
            conditions += " AND FNIVP_DESCRIPCION IS NULL";
        } else if (this.getFnivpDescripcion() != null) {
            conditions += " AND FNIVP_DESCRIPCION = ?";
            values.add(this.getFnivpDescripcion());
        }

        if (this.getFnivpEstatus() != null && "null".equals(this.getFnivpEstatus())) {
            conditions += " AND FNIVP_ESTATUS IS NULL";
        } else if (this.getFnivpEstatus() != null) {
            conditions += " AND FNIVP_ESTATUS = ?";
            values.add(this.getFnivpEstatus());
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
        String sql = "UPDATE F_NIVELPRE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FNIVP_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFnivpIdFideicomiso());
        conditions += " AND FNIVP_ID_SECUENCIAL = ?";
        pkValues.add(this.getFnivpIdSecuencial());
        fields += " FNIVP_NOMBRE = ?, ";
        values.add(this.getFnivpNombre());
        fields += " FNIVP_DESCRIPCION = ?, ";
        values.add(this.getFnivpDescripcion());
        fields += " FNIVP_ESTATUS = ?, ";
        values.add(this.getFnivpEstatus());
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
        String sql = "INSERT INTO F_NIVELPRE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FNIVP_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFnivpIdFideicomiso());

        fields += ", FNIVP_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFnivpIdSecuencial());

        fields += ", FNIVP_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getFnivpNombre());

        fields += ", FNIVP_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getFnivpDescripcion());

        fields += ", FNIVP_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getFnivpEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_NIVELPRE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FNIVP_ID_FIDEICOMISO = ?";
        values.add(this.getFnivpIdFideicomiso());
        conditions += " AND FNIVP_ID_SECUENCIAL = ?";
        values.add(this.getFnivpIdSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FNivelpre instance = (FNivelpre) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFnivpIdFideicomiso().equals(instance.getFnivpIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFnivpIdSecuencial().equals(instance.getFnivpIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFnivpNombre().equals(instance.getFnivpNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFnivpDescripcion().equals(instance.getFnivpDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getFnivpEstatus().equals(instance.getFnivpEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FNivelpre result = new FNivelpre();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFnivpIdFideicomiso((BigDecimal) objectData.getData("FNIVP_ID_FIDEICOMISO"));
        result.setFnivpIdSecuencial((BigDecimal) objectData.getData("FNIVP_ID_SECUENCIAL"));
        result.setFnivpNombre((String) objectData.getData("FNIVP_NOMBRE"));
        result.setFnivpDescripcion((String) objectData.getData("FNIVP_DESCRIPCION"));
        result.setFnivpEstatus((String) objectData.getData("FNIVP_ESTATUS"));

        return result;

    }

}
