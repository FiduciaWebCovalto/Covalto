package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CATMINDS_PK", columns = { "CMID_ID_CONCEPTO" }, sequences = { "MAX" })
public class FCatminds extends DomainObject {

    BigDecimal cmidIdConcepto = null;
    String cmidNombre = null;
    BigDecimal conpObligatorio = null;
    String conpTipoDato = null;
    String conpEstatus = null;

    public FCatminds() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCmidIdConcepto(BigDecimal cmidIdConcepto) {
        this.cmidIdConcepto = cmidIdConcepto;
    }

    public BigDecimal getCmidIdConcepto() {
        return this.cmidIdConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCmidNombre(String cmidNombre) {
        this.cmidNombre = cmidNombre;
    }

    public String getCmidNombre() {
        return this.cmidNombre;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConpObligatorio(BigDecimal conpObligatorio) {
        this.conpObligatorio = conpObligatorio;
    }

    public BigDecimal getConpObligatorio() {
        return this.conpObligatorio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConpTipoDato(String conpTipoDato) {
        this.conpTipoDato = conpTipoDato;
    }

    public String getConpTipoDato() {
        return this.conpTipoDato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConpEstatus(String conpEstatus) {
        this.conpEstatus = conpEstatus;
    }

    public String getConpEstatus() {
        return this.conpEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CATMINDS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCmidIdConcepto() != null && this.getCmidIdConcepto().longValue() == -999) {
            conditions += " AND CMID_ID_CONCEPTO IS NULL";
        } else if (this.getCmidIdConcepto() != null) {
            conditions += " AND CMID_ID_CONCEPTO = ?";
            values.add(this.getCmidIdConcepto());
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
        String sql = "SELECT * FROM F_CATMINDS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCmidIdConcepto() != null && this.getCmidIdConcepto().longValue() == -999) {
            conditions += " AND CMID_ID_CONCEPTO IS NULL";
        } else if (this.getCmidIdConcepto() != null) {
            conditions += " AND CMID_ID_CONCEPTO = ?";
            values.add(this.getCmidIdConcepto());
        }

        if (this.getCmidNombre() != null && "null".equals(this.getCmidNombre())) {
            conditions += " AND CMID_NOMBRE IS NULL";
        } else if (this.getCmidNombre() != null) {
            conditions += " AND CMID_NOMBRE = ?";
            values.add(this.getCmidNombre());
        }

        if (this.getConpObligatorio() != null && this.getConpObligatorio().longValue() == -999) {
            conditions += " AND CONP_OBLIGATORIO IS NULL";
        } else if (this.getConpObligatorio() != null) {
            conditions += " AND CONP_OBLIGATORIO = ?";
            values.add(this.getConpObligatorio());
        }

        if (this.getConpTipoDato() != null && "null".equals(this.getConpTipoDato())) {
            conditions += " AND CONP_TIPO_DATO IS NULL";
        } else if (this.getConpTipoDato() != null) {
            conditions += " AND CONP_TIPO_DATO = ?";
            values.add(this.getConpTipoDato());
        }

        if (this.getConpEstatus() != null && "null".equals(this.getConpEstatus())) {
            conditions += " AND CONP_ESTATUS IS NULL";
        } else if (this.getConpEstatus() != null) {
            conditions += " AND CONP_ESTATUS = ?";
            values.add(this.getConpEstatus());
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
        String sql = "UPDATE F_CATMINDS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CMID_ID_CONCEPTO = ?";
        pkValues.add(this.getCmidIdConcepto());
        fields += " CMID_NOMBRE = ?, ";
        values.add(this.getCmidNombre());
        fields += " CONP_OBLIGATORIO = ?, ";
        values.add(this.getConpObligatorio());
        fields += " CONP_TIPO_DATO = ?, ";
        values.add(this.getConpTipoDato());
        fields += " CONP_ESTATUS = ?, ";
        values.add(this.getConpEstatus());
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
        String sql = "INSERT INTO F_CATMINDS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CMID_ID_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getCmidIdConcepto());

        fields += ", CMID_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getCmidNombre());

        fields += ", CONP_OBLIGATORIO";
        fieldValues += ", ?";
        values.add(this.getConpObligatorio());

        fields += ", CONP_TIPO_DATO";
        fieldValues += ", ?";
        values.add(this.getConpTipoDato());

        fields += ", CONP_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getConpEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CATMINDS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CMID_ID_CONCEPTO = ?";
        values.add(this.getCmidIdConcepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCatminds instance = (FCatminds) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCmidIdConcepto().equals(instance.getCmidIdConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getCmidNombre().equals(instance.getCmidNombre()))
            equalObjects = false;
        if (equalObjects && !this.getConpObligatorio().equals(instance.getConpObligatorio()))
            equalObjects = false;
        if (equalObjects && !this.getConpTipoDato().equals(instance.getConpTipoDato()))
            equalObjects = false;
        if (equalObjects && !this.getConpEstatus().equals(instance.getConpEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCatminds result = new FCatminds();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCmidIdConcepto((BigDecimal) objectData.getData("CMID_ID_CONCEPTO"));
        result.setCmidNombre((String) objectData.getData("CMID_NOMBRE"));
        result.setConpObligatorio((BigDecimal) objectData.getData("CONP_OBLIGATORIO"));
        result.setConpTipoDato((String) objectData.getData("CONP_TIPO_DATO"));
        result.setConpEstatus((String) objectData.getData("CONP_ESTATUS"));

        return result;

    }

}
