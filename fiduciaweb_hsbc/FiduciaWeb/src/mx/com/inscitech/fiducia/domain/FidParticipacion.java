package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PK_FID_PARTICIPACION", columns = { "PAR_CONTRATO", "PAR_CLAVE" }, sequences = { "MANUAL" })
public class FidParticipacion extends DomainObject {

    BigDecimal parContrato = null;
    String parClave = null;
    BigDecimal parNivel = null;
    String parFecAlta = null;
    String parFecUltMod = null;
    String parEstatus = null;

    public FidParticipacion() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setParContrato(BigDecimal parContrato) {
        this.parContrato = parContrato;
    }

    public BigDecimal getParContrato() {
        return this.parContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setParClave(String parClave) {
        this.parClave = parClave;
    }

    public String getParClave() {
        return this.parClave;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setParNivel(BigDecimal parNivel) {
        this.parNivel = parNivel;
    }

    public BigDecimal getParNivel() {
        return this.parNivel;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setParFecAlta(String parFecAlta) {
        this.parFecAlta = parFecAlta;
    }

    public String getParFecAlta() {
        return this.parFecAlta;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setParFecUltMod(String parFecUltMod) {
        this.parFecUltMod = parFecUltMod;
    }

    public String getParFecUltMod() {
        return this.parFecUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setParEstatus(String parEstatus) {
        this.parEstatus = parEstatus;
    }

    public String getParEstatus() {
        return this.parEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_PARTICIPACION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getParContrato() != null && this.getParContrato().longValue() == -999) {
            conditions += " AND PAR_CONTRATO IS NULL";
        } else if (this.getParContrato() != null) {
            conditions += " AND PAR_CONTRATO = ?";
            values.add(this.getParContrato());
        }

        if (this.getParClave() != null && "null".equals(this.getParClave())) {
            conditions += " AND PAR_CLAVE IS NULL";
        } else if (this.getParClave() != null) {
            conditions += " AND PAR_CLAVE = ?";
            values.add(this.getParClave());
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
        String sql = "SELECT * FROM FID_PARTICIPACION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getParContrato() != null && this.getParContrato().longValue() == -999) {
            conditions += " AND PAR_CONTRATO IS NULL";
        } else if (this.getParContrato() != null) {
            conditions += " AND PAR_CONTRATO = ?";
            values.add(this.getParContrato());
        }

        if (this.getParClave() != null && "null".equals(this.getParClave())) {
            conditions += " AND PAR_CLAVE IS NULL";
        } else if (this.getParClave() != null) {
            conditions += " AND PAR_CLAVE = ?";
            values.add(this.getParClave());
        }

        if (this.getParNivel() != null && this.getParNivel().longValue() == -999) {
            conditions += " AND PAR_NIVEL IS NULL";
        } else if (this.getParNivel() != null) {
            conditions += " AND PAR_NIVEL = ?";
            values.add(this.getParNivel());
        }

        if (this.getParFecAlta() != null && "null".equals(this.getParFecAlta())) {
            conditions += " AND PAR_FEC_ALTA IS NULL";
        } else if (this.getParFecAlta() != null) {
            conditions += " AND PAR_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getParFecAlta());
        }

        if (this.getParFecUltMod() != null && "null".equals(this.getParFecUltMod())) {
            conditions += " AND PAR_FEC_ULT_MOD IS NULL";
        } else if (this.getParFecUltMod() != null) {
            conditions += " AND PAR_FEC_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getParFecUltMod());
        }

        if (this.getParEstatus() != null && "null".equals(this.getParEstatus())) {
            conditions += " AND PAR_ESTATUS IS NULL";
        } else if (this.getParEstatus() != null) {
            conditions += " AND PAR_ESTATUS = ?";
            values.add(this.getParEstatus());
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
        String sql = "UPDATE FID_PARTICIPACION SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PAR_CONTRATO = ?";
        pkValues.add(this.getParContrato());
        conditions += " AND PAR_CLAVE = ?";
        pkValues.add(this.getParClave());
        fields += " PAR_NIVEL = ?, ";
        values.add(this.getParNivel());
        fields += " PAR_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getParFecAlta());
        fields += " PAR_FEC_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getParFecUltMod());
        fields += " PAR_ESTATUS = ?, ";
        values.add(this.getParEstatus());
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
        String sql = "INSERT INTO FID_PARTICIPACION ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAR_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getParContrato());

        fields += ", PAR_CLAVE";
        fieldValues += ", ?";
        values.add(this.getParClave());

        fields += ", PAR_NIVEL";
        fieldValues += ", ?";
        values.add(this.getParNivel());

        fields += ", PAR_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getParFecAlta());

        fields += ", PAR_FEC_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getParFecUltMod());

        fields += ", PAR_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getParEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FID_PARTICIPACION WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PAR_CONTRATO = ?";
        values.add(this.getParContrato());
        conditions += " AND PAR_CLAVE = ?";
        values.add(this.getParClave());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FidParticipacion instance = (FidParticipacion) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getParContrato().equals(instance.getParContrato()))
            equalObjects = false;
        if (equalObjects && !this.getParClave().equals(instance.getParClave()))
            equalObjects = false;
        if (equalObjects && !this.getParNivel().equals(instance.getParNivel()))
            equalObjects = false;
        if (equalObjects && !this.getParFecAlta().equals(instance.getParFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getParFecUltMod().equals(instance.getParFecUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getParEstatus().equals(instance.getParEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FidParticipacion result = new FidParticipacion();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setParContrato((BigDecimal) objectData.getData("PAR_CONTRATO"));
        result.setParClave((String) objectData.getData("PAR_CLAVE"));
        result.setParNivel((BigDecimal) objectData.getData("PAR_NIVEL"));
        result.setParFecAlta((String) objectData.getData("PAR_FEC_ALTA"));
        result.setParFecUltMod((String) objectData.getData("PAR_FEC_ULT_MOD"));
        result.setParEstatus((String) objectData.getData("PAR_ESTATUS"));

        return result;

    }

}
