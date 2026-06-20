package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REVISION_INPC_PK", columns = { "RIN_NUM_CONTRATO", "RIN_NOM_CONTRATO" }, sequences = { "MANUAL" })
public class RevisionInpc extends DomainObject {

    BigDecimal rinNumContrato = null;
    String rinNomContrato = null;
    String rinFechaUltRev = null;
    String rinPeriodicidad = null;
    String rinCalcAutomatico = null;
    String rinStatus = null;
    String rinComentarios = null;

    public RevisionInpc() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRinNumContrato(BigDecimal rinNumContrato) {
        this.rinNumContrato = rinNumContrato;
    }

    public BigDecimal getRinNumContrato() {
        return this.rinNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRinNomContrato(String rinNomContrato) {
        this.rinNomContrato = rinNomContrato;
    }

    public String getRinNomContrato() {
        return this.rinNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setRinFechaUltRev(String rinFechaUltRev) {
        this.rinFechaUltRev = rinFechaUltRev;
    }

    public String getRinFechaUltRev() {
        return this.rinFechaUltRev;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRinPeriodicidad(String rinPeriodicidad) {
        this.rinPeriodicidad = rinPeriodicidad;
    }

    public String getRinPeriodicidad() {
        return this.rinPeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRinCalcAutomatico(String rinCalcAutomatico) {
        this.rinCalcAutomatico = rinCalcAutomatico;
    }

    public String getRinCalcAutomatico() {
        return this.rinCalcAutomatico;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRinStatus(String rinStatus) {
        this.rinStatus = rinStatus;
    }

    public String getRinStatus() {
        return this.rinStatus;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRinComentarios(String rinComentarios) {
        this.rinComentarios = rinComentarios;
    }

    public String getRinComentarios() {
        return this.rinComentarios;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REVISION_INPC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRinNumContrato() != null && this.getRinNumContrato().longValue() == -999) {
            conditions += " AND RIN_NUM_CONTRATO IS NULL";
        } else if (this.getRinNumContrato() != null) {
            conditions += " AND RIN_NUM_CONTRATO = ?";
            values.add(this.getRinNumContrato());
        }

        if (this.getRinNomContrato() != null && "null".equals(this.getRinNomContrato())) {
            conditions += " AND RIN_NOM_CONTRATO IS NULL";
        } else if (this.getRinNomContrato() != null) {
            conditions += " AND RIN_NOM_CONTRATO = ?";
            values.add(this.getRinNomContrato());
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
        String sql = "SELECT * FROM REVISION_INPC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRinNumContrato() != null && this.getRinNumContrato().longValue() == -999) {
            conditions += " AND RIN_NUM_CONTRATO IS NULL";
        } else if (this.getRinNumContrato() != null) {
            conditions += " AND RIN_NUM_CONTRATO = ?";
            values.add(this.getRinNumContrato());
        }

        if (this.getRinNomContrato() != null && "null".equals(this.getRinNomContrato())) {
            conditions += " AND RIN_NOM_CONTRATO IS NULL";
        } else if (this.getRinNomContrato() != null) {
            conditions += " AND RIN_NOM_CONTRATO = ?";
            values.add(this.getRinNomContrato());
        }

        if (this.getRinFechaUltRev() != null && "null".equals(this.getRinFechaUltRev())) {
            conditions += " AND RIN_FECHA_ULT_REV IS NULL";
        } else if (this.getRinFechaUltRev() != null) {
            conditions += " AND RIN_FECHA_ULT_REV = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getRinFechaUltRev());
        }

        if (this.getRinPeriodicidad() != null && "null".equals(this.getRinPeriodicidad())) {
            conditions += " AND RIN_PERIODICIDAD IS NULL";
        } else if (this.getRinPeriodicidad() != null) {
            conditions += " AND RIN_PERIODICIDAD = ?";
            values.add(this.getRinPeriodicidad());
        }

        if (this.getRinCalcAutomatico() != null && "null".equals(this.getRinCalcAutomatico())) {
            conditions += " AND RIN_CALC_AUTOMATICO IS NULL";
        } else if (this.getRinCalcAutomatico() != null) {
            conditions += " AND RIN_CALC_AUTOMATICO = ?";
            values.add(this.getRinCalcAutomatico());
        }

        if (this.getRinStatus() != null && "null".equals(this.getRinStatus())) {
            conditions += " AND RIN_STATUS IS NULL";
        } else if (this.getRinStatus() != null) {
            conditions += " AND RIN_STATUS = ?";
            values.add(this.getRinStatus());
        }

        if (this.getRinComentarios() != null && "null".equals(this.getRinComentarios())) {
            conditions += " AND RIN_COMENTARIOS IS NULL";
        } else if (this.getRinComentarios() != null) {
            conditions += " AND RIN_COMENTARIOS = ?";
            values.add(this.getRinComentarios());
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
        String sql = "UPDATE REVISION_INPC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RIN_NUM_CONTRATO = ?";
        pkValues.add(this.getRinNumContrato());
        conditions += " AND RIN_NOM_CONTRATO = ?";
        pkValues.add(this.getRinNomContrato());
        fields += " RIN_FECHA_ULT_REV = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getRinFechaUltRev());
        fields += " RIN_PERIODICIDAD = ?, ";
        values.add(this.getRinPeriodicidad());
        fields += " RIN_CALC_AUTOMATICO = ?, ";
        values.add(this.getRinCalcAutomatico());
        fields += " RIN_STATUS = ?, ";
        values.add(this.getRinStatus());
        fields += " RIN_COMENTARIOS = ?, ";
        values.add(this.getRinComentarios());
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
        String sql = "INSERT INTO REVISION_INPC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RIN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRinNumContrato());

        fields += ", RIN_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRinNomContrato());

        fields += ", RIN_FECHA_ULT_REV";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getRinFechaUltRev());

        fields += ", RIN_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getRinPeriodicidad());

        fields += ", RIN_CALC_AUTOMATICO";
        fieldValues += ", ?";
        values.add(this.getRinCalcAutomatico());

        fields += ", RIN_STATUS";
        fieldValues += ", ?";
        values.add(this.getRinStatus());

        fields += ", RIN_COMENTARIOS";
        fieldValues += ", ?";
        values.add(this.getRinComentarios());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REVISION_INPC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RIN_NUM_CONTRATO = ?";
        values.add(this.getRinNumContrato());
        conditions += " AND RIN_NOM_CONTRATO = ?";
        values.add(this.getRinNomContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        RevisionInpc instance = (RevisionInpc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRinNumContrato().equals(instance.getRinNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRinNomContrato().equals(instance.getRinNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRinFechaUltRev().equals(instance.getRinFechaUltRev()))
            equalObjects = false;
        if (equalObjects && !this.getRinPeriodicidad().equals(instance.getRinPeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getRinCalcAutomatico().equals(instance.getRinCalcAutomatico()))
            equalObjects = false;
        if (equalObjects && !this.getRinStatus().equals(instance.getRinStatus()))
            equalObjects = false;
        if (equalObjects && !this.getRinComentarios().equals(instance.getRinComentarios()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        RevisionInpc result = new RevisionInpc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRinNumContrato((BigDecimal) objectData.getData("RIN_NUM_CONTRATO"));
        result.setRinNomContrato((String) objectData.getData("RIN_NOM_CONTRATO"));
        result.setRinFechaUltRev((String) objectData.getData("RIN_FECHA_ULT_REV"));
        result.setRinPeriodicidad((String) objectData.getData("RIN_PERIODICIDAD"));
        result.setRinCalcAutomatico((String) objectData.getData("RIN_CALC_AUTOMATICO"));
        result.setRinStatus((String) objectData.getData("RIN_STATUS"));
        result.setRinComentarios((String) objectData.getData("RIN_COMENTARIOS"));

        return result;

    }

}
