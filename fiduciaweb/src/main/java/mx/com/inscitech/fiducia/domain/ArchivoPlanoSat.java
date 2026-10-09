package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class ArchivoPlanoSat extends DomainObject {

    BigDecimal apsIdArchivo = null;
    String apsFecha = null;
    String apsNomArchivo = null;
    String apsDescripcion = null;

    public ArchivoPlanoSat() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setApsIdArchivo(BigDecimal apsIdArchivo) {
        this.apsIdArchivo = apsIdArchivo;
    }

    public BigDecimal getApsIdArchivo() {
        return this.apsIdArchivo;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setApsFecha(String apsFecha) {
        this.apsFecha = apsFecha;
    }

    public String getApsFecha() {
        return this.apsFecha;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setApsNomArchivo(String apsNomArchivo) {
        this.apsNomArchivo = apsNomArchivo;
    }

    public String getApsNomArchivo() {
        return this.apsNomArchivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setApsDescripcion(String apsDescripcion) {
        this.apsDescripcion = apsDescripcion;
    }

    public String getApsDescripcion() {
        return this.apsDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ARCHIVO_PLANO_SAT ";

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
        String sql = "SELECT * FROM ARCHIVO_PLANO_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApsIdArchivo() != null && this.getApsIdArchivo().longValue() == -999) {
            conditions += " AND APS_ID_ARCHIVO IS NULL";
        } else if (this.getApsIdArchivo() != null) {
            conditions += " AND APS_ID_ARCHIVO = ?";
            values.add(this.getApsIdArchivo());
        }

        if (this.getApsFecha() != null && "null".equals(this.getApsFecha())) {
            conditions += " AND APS_FECHA IS NULL";
        } else if (this.getApsFecha() != null) {
            conditions += " AND APS_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getApsFecha());
        }

        if (this.getApsNomArchivo() != null && "null".equals(this.getApsNomArchivo())) {
            conditions += " AND APS_NOM_ARCHIVO IS NULL";
        } else if (this.getApsNomArchivo() != null) {
            conditions += " AND APS_NOM_ARCHIVO = ?";
            values.add(this.getApsNomArchivo());
        }

        if (this.getApsDescripcion() != null && "null".equals(this.getApsDescripcion())) {
            conditions += " AND APS_DESCRIPCION IS NULL";
        } else if (this.getApsDescripcion() != null) {
            conditions += " AND APS_DESCRIPCION = ?";
            values.add(this.getApsDescripcion());
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
        String sql = "UPDATE ARCHIVO_PLANO_SAT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " APS_ID_ARCHIVO = ?, ";
        values.add(this.getApsIdArchivo());
        fields += " APS_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getApsFecha());
        fields += " APS_NOM_ARCHIVO = ?, ";
        values.add(this.getApsNomArchivo());
        fields += " APS_DESCRIPCION = ?, ";
        values.add(this.getApsDescripcion());
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
        String sql = "INSERT INTO ARCHIVO_PLANO_SAT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", APS_ID_ARCHIVO";
        fieldValues += ", ?";
        values.add(this.getApsIdArchivo());

        fields += ", APS_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getApsFecha());

        fields += ", APS_NOM_ARCHIVO";
        fieldValues += ", ?";
        values.add(this.getApsNomArchivo());

        fields += ", APS_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getApsDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ARCHIVO_PLANO_SAT WHERE ";

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
        ArchivoPlanoSat instance = (ArchivoPlanoSat) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getApsIdArchivo().equals(instance.getApsIdArchivo()))
            equalObjects = false;
        if (equalObjects && !this.getApsFecha().equals(instance.getApsFecha()))
            equalObjects = false;
        if (equalObjects && !this.getApsNomArchivo().equals(instance.getApsNomArchivo()))
            equalObjects = false;
        if (equalObjects && !this.getApsDescripcion().equals(instance.getApsDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ArchivoPlanoSat result = new ArchivoPlanoSat();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setApsIdArchivo((BigDecimal) objectData.getData("APS_ID_ARCHIVO"));
        result.setApsFecha((String) objectData.getData("APS_FECHA"));
        result.setApsNomArchivo((String) objectData.getData("APS_NOM_ARCHIVO"));
        result.setApsDescripcion((String) objectData.getData("APS_DESCRIPCION"));

        return result;

    }

}
