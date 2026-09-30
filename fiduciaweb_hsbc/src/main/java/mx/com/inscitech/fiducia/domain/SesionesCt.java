package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SESIONES_CT_PK", columns = { "SES_NUM_CONTRATO", "SES_FECHA", "SES_TIPO" }, sequences = { "MANUAL" })
public class SesionesCt extends DomainObject {

    BigDecimal sesNumContrato = null;
    String sesFecha = null;
    String sesTipo = null;
    String sesTema = null;
    String sesFechaAlta = null;
    String sesFechaUltMod = null;

    public SesionesCt() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSesNumContrato(BigDecimal sesNumContrato) {
        this.sesNumContrato = sesNumContrato;
    }

    public BigDecimal getSesNumContrato() {
        return this.sesNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setSesFecha(String sesFecha) {
        this.sesFecha = sesFecha;
    }

    public String getSesFecha() {
        return this.sesFecha;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSesTipo(String sesTipo) {
        this.sesTipo = sesTipo;
    }

    public String getSesTipo() {
        return this.sesTipo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSesTema(String sesTema) {
        this.sesTema = sesTema;
    }

    public String getSesTema() {
        return this.sesTema;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setSesFechaAlta(String sesFechaAlta) {
        this.sesFechaAlta = sesFechaAlta;
    }

    public String getSesFechaAlta() {
        return this.sesFechaAlta;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setSesFechaUltMod(String sesFechaUltMod) {
        this.sesFechaUltMod = sesFechaUltMod;
    }

    public String getSesFechaUltMod() {
        return this.sesFechaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SESIONES_CT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSesNumContrato() != null && this.getSesNumContrato().longValue() == -999) {
            conditions += " AND SES_NUM_CONTRATO IS NULL";
        } else if (this.getSesNumContrato() != null) {
            conditions += " AND SES_NUM_CONTRATO = ?";
            values.add(this.getSesNumContrato());
        }

        if (this.getSesFecha() != null && "null".equals(this.getSesFecha())) {
            conditions += " AND SES_FECHA IS NULL";
        } else if (this.getSesFecha() != null) {
            conditions += " AND SES_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSesFecha());
        }

        if (this.getSesTipo() != null && "null".equals(this.getSesTipo())) {
            conditions += " AND SES_TIPO IS NULL";
        } else if (this.getSesTipo() != null) {
            conditions += " AND SES_TIPO = ?";
            values.add(this.getSesTipo());
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
        String sql = "SELECT * FROM SESIONES_CT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSesNumContrato() != null && this.getSesNumContrato().longValue() == -999) {
            conditions += " AND SES_NUM_CONTRATO IS NULL";
        } else if (this.getSesNumContrato() != null) {
            conditions += " AND SES_NUM_CONTRATO = ?";
            values.add(this.getSesNumContrato());
        }

        if (this.getSesFecha() != null && "null".equals(this.getSesFecha())) {
            conditions += " AND SES_FECHA IS NULL";
        } else if (this.getSesFecha() != null) {
            conditions += " AND SES_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSesFecha());
        }

        if (this.getSesTipo() != null && "null".equals(this.getSesTipo())) {
            conditions += " AND SES_TIPO IS NULL";
        } else if (this.getSesTipo() != null) {
            conditions += " AND SES_TIPO = ?";
            values.add(this.getSesTipo());
        }

        if (this.getSesTema() != null && "null".equals(this.getSesTema())) {
            conditions += " AND SES_TEMA IS NULL";
        } else if (this.getSesTema() != null) {
            conditions += " AND SES_TEMA = ?";
            values.add(this.getSesTema());
        }

        if (this.getSesFechaAlta() != null && "null".equals(this.getSesFechaAlta())) {
            conditions += " AND SES_FECHA_ALTA IS NULL";
        } else if (this.getSesFechaAlta() != null) {
            conditions += " AND SES_FECHA_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSesFechaAlta());
        }

        if (this.getSesFechaUltMod() != null && "null".equals(this.getSesFechaUltMod())) {
            conditions += " AND SES_FECHA_ULT_MOD IS NULL";
        } else if (this.getSesFechaUltMod() != null) {
            conditions += " AND SES_FECHA_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSesFechaUltMod());
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
        String sql = "UPDATE SESIONES_CT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SES_NUM_CONTRATO = ?";
        pkValues.add(this.getSesNumContrato());
        conditions += " AND SES_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getSesFecha());
        conditions += " AND SES_TIPO = ?";
        pkValues.add(this.getSesTipo());
        fields += " SES_TEMA = ?, ";
        values.add(this.getSesTema());
        fields += " SES_FECHA_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getSesFechaAlta());
        fields += " SES_FECHA_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getSesFechaUltMod());
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
        String sql = "INSERT INTO SESIONES_CT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SES_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSesNumContrato());

        fields += ", SES_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getSesFecha());

        fields += ", SES_TIPO";
        fieldValues += ", ?";
        values.add(this.getSesTipo());

        fields += ", SES_TEMA";
        fieldValues += ", ?";
        values.add(this.getSesTema());

        fields += ", SES_FECHA_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getSesFechaAlta());

        fields += ", SES_FECHA_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getSesFechaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SESIONES_CT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SES_NUM_CONTRATO = ?";
        values.add(this.getSesNumContrato());
        conditions += " AND SES_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getSesFecha());
        conditions += " AND SES_TIPO = ?";
        values.add(this.getSesTipo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        SesionesCt instance = (SesionesCt) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSesNumContrato().equals(instance.getSesNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSesFecha().equals(instance.getSesFecha()))
            equalObjects = false;
        if (equalObjects && !this.getSesTipo().equals(instance.getSesTipo()))
            equalObjects = false;
        if (equalObjects && !this.getSesTema().equals(instance.getSesTema()))
            equalObjects = false;
        if (equalObjects && !this.getSesFechaAlta().equals(instance.getSesFechaAlta()))
            equalObjects = false;
        if (equalObjects && !this.getSesFechaUltMod().equals(instance.getSesFechaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        SesionesCt result = new SesionesCt();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSesNumContrato((BigDecimal) objectData.getData("SES_NUM_CONTRATO"));
        result.setSesFecha((String) objectData.getData("SES_FECHA"));
        result.setSesTipo((String) objectData.getData("SES_TIPO"));
        result.setSesTema((String) objectData.getData("SES_TEMA"));
        result.setSesFechaAlta((String) objectData.getData("SES_FECHA_ALTA"));
        result.setSesFechaUltMod((String) objectData.getData("SES_FECHA_ULT_MOD"));

        return result;

    }

}
