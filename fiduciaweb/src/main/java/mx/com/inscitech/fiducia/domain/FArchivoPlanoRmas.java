package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FArchivoPlanoRmas extends DomainObject {

    BigDecimal arpSecuencial = null;
    String arpFecha = null;
    String arpNomArchivo = null;
    String arpDescripcion = null;

    public FArchivoPlanoRmas() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setArpSecuencial(BigDecimal arpSecuencial) {
        this.arpSecuencial = arpSecuencial;
    }

    public BigDecimal getArpSecuencial() {
        return this.arpSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setArpFecha(String arpFecha) {
        this.arpFecha = arpFecha;
    }

    public String getArpFecha() {
        return this.arpFecha;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setArpNomArchivo(String arpNomArchivo) {
        this.arpNomArchivo = arpNomArchivo;
    }

    public String getArpNomArchivo() {
        return this.arpNomArchivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setArpDescripcion(String arpDescripcion) {
        this.arpDescripcion = arpDescripcion;
    }

    public String getArpDescripcion() {
        return this.arpDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ARCHIVO_PLANO_RMAS ";

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
        String sql = "SELECT * FROM F_ARCHIVO_PLANO_RMAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getArpSecuencial() != null && this.getArpSecuencial().longValue() == -999) {
            conditions += " AND ARP_SECUENCIAL IS NULL";
        } else if (this.getArpSecuencial() != null) {
            conditions += " AND ARP_SECUENCIAL = ?";
            values.add(this.getArpSecuencial());
        }

        if (this.getArpFecha() != null && "null".equals(this.getArpFecha())) {
            conditions += " AND ARP_FECHA IS NULL";
        } else if (this.getArpFecha() != null) {
            conditions += " AND ARP_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getArpFecha());
        }

        if (this.getArpNomArchivo() != null && "null".equals(this.getArpNomArchivo())) {
            conditions += " AND ARP_NOM_ARCHIVO IS NULL";
        } else if (this.getArpNomArchivo() != null) {
            conditions += " AND ARP_NOM_ARCHIVO = ?";
            values.add(this.getArpNomArchivo());
        }

        if (this.getArpDescripcion() != null && "null".equals(this.getArpDescripcion())) {
            conditions += " AND ARP_DESCRIPCION IS NULL";
        } else if (this.getArpDescripcion() != null) {
            conditions += " AND ARP_DESCRIPCION = ?";
            values.add(this.getArpDescripcion());
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
        String sql = "UPDATE F_ARCHIVO_PLANO_RMAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " ARP_SECUENCIAL = ?, ";
        values.add(this.getArpSecuencial());
        fields += " ARP_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getArpFecha());
        fields += " ARP_NOM_ARCHIVO = ?, ";
        values.add(this.getArpNomArchivo());
        fields += " ARP_DESCRIPCION = ?, ";
        values.add(this.getArpDescripcion());
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
        String sql = "INSERT INTO F_ARCHIVO_PLANO_RMAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ARP_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getArpSecuencial());

        fields += ", ARP_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getArpFecha());

        fields += ", ARP_NOM_ARCHIVO";
        fieldValues += ", ?";
        values.add(this.getArpNomArchivo());

        fields += ", ARP_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getArpDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ARCHIVO_PLANO_RMAS WHERE ";

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
        FArchivoPlanoRmas instance = (FArchivoPlanoRmas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getArpSecuencial().equals(instance.getArpSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getArpFecha().equals(instance.getArpFecha()))
            equalObjects = false;
        if (equalObjects && !this.getArpNomArchivo().equals(instance.getArpNomArchivo()))
            equalObjects = false;
        if (equalObjects && !this.getArpDescripcion().equals(instance.getArpDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FArchivoPlanoRmas result = new FArchivoPlanoRmas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setArpSecuencial((BigDecimal) objectData.getData("ARP_SECUENCIAL"));
        result.setArpFecha((String) objectData.getData("ARP_FECHA"));
        result.setArpNomArchivo((String) objectData.getData("ARP_NOM_ARCHIVO"));
        result.setArpDescripcion((String) objectData.getData("ARP_DESCRIPCION"));

        return result;

    }

}
