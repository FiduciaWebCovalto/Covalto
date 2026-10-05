package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REP_ERR_CUENTASINDIV_PK", columns = { "APC_SECUENCIAL", "APC_FECHA", "APC_NOM_ARCHIVO" }, sequences = { "MANUAL" })
public class RepErrCuentasindiv extends DomainObject {

    BigDecimal apcSecuencial = null;
    String apcFecha = null;
    String apcNomArchivo = null;
    String apcDescripcion = null;

    public RepErrCuentasindiv() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setApcSecuencial(BigDecimal apcSecuencial) {
        this.apcSecuencial = apcSecuencial;
    }

    public BigDecimal getApcSecuencial() {
        return this.apcSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setApcFecha(String apcFecha) {
        this.apcFecha = apcFecha;
    }

    public String getApcFecha() {
        return this.apcFecha;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setApcNomArchivo(String apcNomArchivo) {
        this.apcNomArchivo = apcNomArchivo;
    }

    public String getApcNomArchivo() {
        return this.apcNomArchivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setApcDescripcion(String apcDescripcion) {
        this.apcDescripcion = apcDescripcion;
    }

    public String getApcDescripcion() {
        return this.apcDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REP_ERR_CUENTASINDIV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApcSecuencial() != null && this.getApcSecuencial().longValue() == -999) {
            conditions += " AND APC_SECUENCIAL IS NULL";
        } else if (this.getApcSecuencial() != null) {
            conditions += " AND APC_SECUENCIAL = ?";
            values.add(this.getApcSecuencial());
        }

        if (this.getApcFecha() != null && "null".equals(this.getApcFecha())) {
            conditions += " AND APC_FECHA IS NULL";
        } else if (this.getApcFecha() != null) {
            conditions += " AND APC_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getApcFecha());
        }

        if (this.getApcNomArchivo() != null && "null".equals(this.getApcNomArchivo())) {
            conditions += " AND APC_NOM_ARCHIVO IS NULL";
        } else if (this.getApcNomArchivo() != null) {
            conditions += " AND APC_NOM_ARCHIVO = ?";
            values.add(this.getApcNomArchivo());
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
        String sql = "SELECT * FROM REP_ERR_CUENTASINDIV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApcSecuencial() != null && this.getApcSecuencial().longValue() == -999) {
            conditions += " AND APC_SECUENCIAL IS NULL";
        } else if (this.getApcSecuencial() != null) {
            conditions += " AND APC_SECUENCIAL = ?";
            values.add(this.getApcSecuencial());
        }

        if (this.getApcFecha() != null && "null".equals(this.getApcFecha())) {
            conditions += " AND APC_FECHA IS NULL";
        } else if (this.getApcFecha() != null) {
            conditions += " AND APC_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getApcFecha());
        }

        if (this.getApcNomArchivo() != null && "null".equals(this.getApcNomArchivo())) {
            conditions += " AND APC_NOM_ARCHIVO IS NULL";
        } else if (this.getApcNomArchivo() != null) {
            conditions += " AND APC_NOM_ARCHIVO = ?";
            values.add(this.getApcNomArchivo());
        }

        if (this.getApcDescripcion() != null && "null".equals(this.getApcDescripcion())) {
            conditions += " AND APC_DESCRIPCION IS NULL";
        } else if (this.getApcDescripcion() != null) {
            conditions += " AND APC_DESCRIPCION = ?";
            values.add(this.getApcDescripcion());
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
        String sql = "UPDATE REP_ERR_CUENTASINDIV SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND APC_SECUENCIAL = ?";
        pkValues.add(this.getApcSecuencial());
        conditions += " AND APC_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getApcFecha());
        conditions += " AND APC_NOM_ARCHIVO = ?";
        pkValues.add(this.getApcNomArchivo());
        fields += " APC_DESCRIPCION = ?, ";
        values.add(this.getApcDescripcion());
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
        String sql = "INSERT INTO REP_ERR_CUENTASINDIV ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", APC_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getApcSecuencial());

        fields += ", APC_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getApcFecha());

        fields += ", APC_NOM_ARCHIVO";
        fieldValues += ", ?";
        values.add(this.getApcNomArchivo());

        fields += ", APC_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getApcDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REP_ERR_CUENTASINDIV WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND APC_SECUENCIAL = ?";
        values.add(this.getApcSecuencial());
        conditions += " AND APC_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getApcFecha());
        conditions += " AND APC_NOM_ARCHIVO = ?";
        values.add(this.getApcNomArchivo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        RepErrCuentasindiv instance = (RepErrCuentasindiv) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getApcSecuencial().equals(instance.getApcSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getApcFecha().equals(instance.getApcFecha()))
            equalObjects = false;
        if (equalObjects && !this.getApcNomArchivo().equals(instance.getApcNomArchivo()))
            equalObjects = false;
        if (equalObjects && !this.getApcDescripcion().equals(instance.getApcDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        RepErrCuentasindiv result = new RepErrCuentasindiv();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setApcSecuencial((BigDecimal) objectData.getData("APC_SECUENCIAL"));
        result.setApcFecha((String) objectData.getData("APC_FECHA"));
        result.setApcNomArchivo((String) objectData.getData("APC_NOM_ARCHIVO"));
        result.setApcDescripcion((String) objectData.getData("APC_DESCRIPCION"));

        return result;

    }

}
