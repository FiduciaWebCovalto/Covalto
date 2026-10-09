package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FBitacora extends DomainObject {

    String fbitDescripcion = null;
    BigDecimal fbitSecuencialFolio = null;
    String fbitFecha = null;
    String fusuIdUsuario = null;

    public FBitacora() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFbitDescripcion(String fbitDescripcion) {
        this.fbitDescripcion = fbitDescripcion;
    }

    public String getFbitDescripcion() {
        return this.fbitDescripcion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFbitSecuencialFolio(BigDecimal fbitSecuencialFolio) {
        this.fbitSecuencialFolio = fbitSecuencialFolio;
    }

    public BigDecimal getFbitSecuencialFolio() {
        return this.fbitSecuencialFolio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFbitFecha(String fbitFecha) {
        this.fbitFecha = fbitFecha;
    }

    public String getFbitFecha() {
        return this.fbitFecha;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFusuIdUsuario(String fusuIdUsuario) {
        this.fusuIdUsuario = fusuIdUsuario;
    }

    public String getFusuIdUsuario() {
        return this.fusuIdUsuario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_BITACORA ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM F_BITACORA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFbitDescripcion() != null && "null".equals(this.getFbitDescripcion())) {
            conditions += " AND FBIT_DESCRIPCION IS NULL";
        } else if (this.getFbitDescripcion() != null) {
            conditions += " AND FBIT_DESCRIPCION = ?";
            values.add(this.getFbitDescripcion());
        }

        if (this.getFbitSecuencialFolio() != null && this.getFbitSecuencialFolio().longValue() == -999) {
            conditions += " AND FBIT_SECUENCIAL_FOLIO IS NULL";
        } else if (this.getFbitSecuencialFolio() != null) {
            conditions += " AND FBIT_SECUENCIAL_FOLIO = ?";
            values.add(this.getFbitSecuencialFolio());
        }

        if (this.getFbitFecha() != null && "null".equals(this.getFbitFecha())) {
            conditions += " AND FBIT_FECHA IS NULL";
        } else if (this.getFbitFecha() != null) {
            conditions += " AND FBIT_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFbitFecha());
        }

        if (this.getFusuIdUsuario() != null && "null".equals(this.getFusuIdUsuario())) {
            conditions += " AND FUSU_ID_USUARIO IS NULL";
        } else if (this.getFusuIdUsuario() != null) {
            conditions += " AND FUSU_ID_USUARIO = ?";
            values.add(this.getFusuIdUsuario());
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
        String sql = "UPDATE F_BITACORA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FBIT_DESCRIPCION = ?, ";
        values.add(this.getFbitDescripcion());
        fields += " FBIT_SECUENCIAL_FOLIO = ?, ";
        values.add(this.getFbitSecuencialFolio());
        fields += " FBIT_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFbitFecha());
        fields += " FUSU_ID_USUARIO = ?, ";
        values.add(this.getFusuIdUsuario());
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
        String sql = "INSERT INTO F_BITACORA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FBIT_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getFbitDescripcion());

        fields += ", FBIT_SECUENCIAL_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFbitSecuencialFolio());

        fields += ", FBIT_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFbitFecha());

        fields += ", FUSU_ID_USUARIO";
        fieldValues += ", ?";
        values.add(this.getFusuIdUsuario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_BITACORA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FBitacora instance = (FBitacora) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFbitDescripcion().equals(instance.getFbitDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getFbitSecuencialFolio().equals(instance.getFbitSecuencialFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFbitFecha().equals(instance.getFbitFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFusuIdUsuario().equals(instance.getFusuIdUsuario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FBitacora result = new FBitacora();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFbitDescripcion((String) objectData.getData("FBIT_DESCRIPCION"));
        result.setFbitSecuencialFolio((BigDecimal) objectData.getData("FBIT_SECUENCIAL_FOLIO"));
        result.setFbitFecha((String) objectData.getData("FBIT_FECHA"));
        result.setFusuIdUsuario((String) objectData.getData("FUSU_ID_USUARIO"));

        return result;

    }

}
