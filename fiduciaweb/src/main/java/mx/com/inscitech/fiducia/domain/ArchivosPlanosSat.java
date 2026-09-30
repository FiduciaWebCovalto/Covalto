package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ARCHIVOS_PLANOS_SAT_PK", columns = { "APS_SECUENCIAL", "APS_FECHA", "APS_NOM_ARCHIVO" }, sequences = { "MANUAL" })
public class ArchivosPlanosSat extends DomainObject {

    BigDecimal apsSecuencial = null;
    String apsFecha = null;
    String apsNomArchivo = null;
    String apsDescripcion = null;

    public ArchivosPlanosSat() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setApsSecuencial(BigDecimal apsSecuencial) {
        this.apsSecuencial = apsSecuencial;
    }

    public BigDecimal getApsSecuencial() {
        return this.apsSecuencial;
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
        String sql = "SELECT * FROM ARCHIVOS_PLANOS_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApsSecuencial() != null && this.getApsSecuencial().longValue() == -999) {
            conditions += " AND APS_SECUENCIAL IS NULL";
        } else if (this.getApsSecuencial() != null) {
            conditions += " AND APS_SECUENCIAL = ?";
            values.add(this.getApsSecuencial());
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
        String sql = "SELECT * FROM ARCHIVOS_PLANOS_SAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApsSecuencial() != null && this.getApsSecuencial().longValue() == -999) {
            conditions += " AND APS_SECUENCIAL IS NULL";
        } else if (this.getApsSecuencial() != null) {
            conditions += " AND APS_SECUENCIAL = ?";
            values.add(this.getApsSecuencial());
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
        String sql = "UPDATE ARCHIVOS_PLANOS_SAT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND APS_SECUENCIAL = ?";
        pkValues.add(this.getApsSecuencial());
        conditions += " AND APS_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getApsFecha());
        conditions += " AND APS_NOM_ARCHIVO = ?";
        pkValues.add(this.getApsNomArchivo());
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
        String sql = "INSERT INTO ARCHIVOS_PLANOS_SAT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", APS_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getApsSecuencial());

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
        String sql = "DELETE FROM ARCHIVOS_PLANOS_SAT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND APS_SECUENCIAL = ?";
        values.add(this.getApsSecuencial());
        conditions += " AND APS_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getApsFecha());
        conditions += " AND APS_NOM_ARCHIVO = ?";
        values.add(this.getApsNomArchivo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ArchivosPlanosSat instance = (ArchivosPlanosSat) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getApsSecuencial().equals(instance.getApsSecuencial()))
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
        ArchivosPlanosSat result = new ArchivosPlanosSat();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setApsSecuencial((BigDecimal) objectData.getData("APS_SECUENCIAL"));
        result.setApsFecha((String) objectData.getData("APS_FECHA"));
        result.setApsNomArchivo((String) objectData.getData("APS_NOM_ARCHIVO"));
        result.setApsDescripcion((String) objectData.getData("APS_DESCRIPCION"));

        return result;

    }

}
