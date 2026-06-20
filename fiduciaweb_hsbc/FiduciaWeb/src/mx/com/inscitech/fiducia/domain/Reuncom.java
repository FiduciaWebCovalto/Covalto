package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REUNCOM_PK", columns = { "REC_NUM_CONTRATO", "REC_NUM_REUNION", "REC_ANO_REUNION", "REC_MES_REUNION", "REC_DIA_REUNION" }, sequences = { "MANUAL" })
public class Reuncom extends DomainObject {

    BigDecimal recNumContrato = null;
    BigDecimal recNumReunion = null;
    BigDecimal recAnoReunion = null;
    BigDecimal recMesReunion = null;
    BigDecimal recDiaReunion = null;
    String recCveStReunion = null;
    String recLugarReunion = null;
    String recAgendaReunion = null;
    BigDecimal recAnoAltaReg = null;
    BigDecimal recMesAltaReg = null;
    BigDecimal recDiaAltaReg = null;
    BigDecimal recAnoUltMod = null;
    BigDecimal recMesUltMod = null;
    BigDecimal recDiaUltMod = null;
    String recCveStReucom = null;

    public Reuncom() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRecNumContrato(BigDecimal recNumContrato) {
        this.recNumContrato = recNumContrato;
    }

    public BigDecimal getRecNumContrato() {
        return this.recNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRecNumReunion(BigDecimal recNumReunion) {
        this.recNumReunion = recNumReunion;
    }

    public BigDecimal getRecNumReunion() {
        return this.recNumReunion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRecAnoReunion(BigDecimal recAnoReunion) {
        this.recAnoReunion = recAnoReunion;
    }

    public BigDecimal getRecAnoReunion() {
        return this.recAnoReunion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRecMesReunion(BigDecimal recMesReunion) {
        this.recMesReunion = recMesReunion;
    }

    public BigDecimal getRecMesReunion() {
        return this.recMesReunion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRecDiaReunion(BigDecimal recDiaReunion) {
        this.recDiaReunion = recDiaReunion;
    }

    public BigDecimal getRecDiaReunion() {
        return this.recDiaReunion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecCveStReunion(String recCveStReunion) {
        this.recCveStReunion = recCveStReunion;
    }

    public String getRecCveStReunion() {
        return this.recCveStReunion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecLugarReunion(String recLugarReunion) {
        this.recLugarReunion = recLugarReunion;
    }

    public String getRecLugarReunion() {
        return this.recLugarReunion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecAgendaReunion(String recAgendaReunion) {
        this.recAgendaReunion = recAgendaReunion;
    }

    public String getRecAgendaReunion() {
        return this.recAgendaReunion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRecAnoAltaReg(BigDecimal recAnoAltaReg) {
        this.recAnoAltaReg = recAnoAltaReg;
    }

    public BigDecimal getRecAnoAltaReg() {
        return this.recAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRecMesAltaReg(BigDecimal recMesAltaReg) {
        this.recMesAltaReg = recMesAltaReg;
    }

    public BigDecimal getRecMesAltaReg() {
        return this.recMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRecDiaAltaReg(BigDecimal recDiaAltaReg) {
        this.recDiaAltaReg = recDiaAltaReg;
    }

    public BigDecimal getRecDiaAltaReg() {
        return this.recDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRecAnoUltMod(BigDecimal recAnoUltMod) {
        this.recAnoUltMod = recAnoUltMod;
    }

    public BigDecimal getRecAnoUltMod() {
        return this.recAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRecMesUltMod(BigDecimal recMesUltMod) {
        this.recMesUltMod = recMesUltMod;
    }

    public BigDecimal getRecMesUltMod() {
        return this.recMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRecDiaUltMod(BigDecimal recDiaUltMod) {
        this.recDiaUltMod = recDiaUltMod;
    }

    public BigDecimal getRecDiaUltMod() {
        return this.recDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRecCveStReucom(String recCveStReucom) {
        this.recCveStReucom = recCveStReucom;
    }

    public String getRecCveStReucom() {
        return this.recCveStReucom;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REUNCOM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRecNumContrato() != null && this.getRecNumContrato().longValue() == -999) {
            conditions += " AND REC_NUM_CONTRATO IS NULL";
        } else if (this.getRecNumContrato() != null) {
            conditions += " AND REC_NUM_CONTRATO = ?";
            values.add(this.getRecNumContrato());
        }

        if (this.getRecNumReunion() != null && this.getRecNumReunion().longValue() == -999) {
            conditions += " AND REC_NUM_REUNION IS NULL";
        } else if (this.getRecNumReunion() != null) {
            conditions += " AND REC_NUM_REUNION = ?";
            values.add(this.getRecNumReunion());
        }

        if (this.getRecAnoReunion() != null && this.getRecAnoReunion().longValue() == -999) {
            conditions += " AND REC_ANO_REUNION IS NULL";
        } else if (this.getRecAnoReunion() != null) {
            conditions += " AND REC_ANO_REUNION = ?";
            values.add(this.getRecAnoReunion());
        }

        if (this.getRecMesReunion() != null && this.getRecMesReunion().longValue() == -999) {
            conditions += " AND REC_MES_REUNION IS NULL";
        } else if (this.getRecMesReunion() != null) {
            conditions += " AND REC_MES_REUNION = ?";
            values.add(this.getRecMesReunion());
        }

        if (this.getRecDiaReunion() != null && this.getRecDiaReunion().longValue() == -999) {
            conditions += " AND REC_DIA_REUNION IS NULL";
        } else if (this.getRecDiaReunion() != null) {
            conditions += " AND REC_DIA_REUNION = ?";
            values.add(this.getRecDiaReunion());
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
        String sql = "SELECT * FROM REUNCOM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRecNumContrato() != null && this.getRecNumContrato().longValue() == -999) {
            conditions += " AND REC_NUM_CONTRATO IS NULL";
        } else if (this.getRecNumContrato() != null) {
            conditions += " AND REC_NUM_CONTRATO = ?";
            values.add(this.getRecNumContrato());
        }

        if (this.getRecNumReunion() != null && this.getRecNumReunion().longValue() == -999) {
            conditions += " AND REC_NUM_REUNION IS NULL";
        } else if (this.getRecNumReunion() != null) {
            conditions += " AND REC_NUM_REUNION = ?";
            values.add(this.getRecNumReunion());
        }

        if (this.getRecAnoReunion() != null && this.getRecAnoReunion().longValue() == -999) {
            conditions += " AND REC_ANO_REUNION IS NULL";
        } else if (this.getRecAnoReunion() != null) {
            conditions += " AND REC_ANO_REUNION = ?";
            values.add(this.getRecAnoReunion());
        }

        if (this.getRecMesReunion() != null && this.getRecMesReunion().longValue() == -999) {
            conditions += " AND REC_MES_REUNION IS NULL";
        } else if (this.getRecMesReunion() != null) {
            conditions += " AND REC_MES_REUNION = ?";
            values.add(this.getRecMesReunion());
        }

        if (this.getRecDiaReunion() != null && this.getRecDiaReunion().longValue() == -999) {
            conditions += " AND REC_DIA_REUNION IS NULL";
        } else if (this.getRecDiaReunion() != null) {
            conditions += " AND REC_DIA_REUNION = ?";
            values.add(this.getRecDiaReunion());
        }

        if (this.getRecCveStReunion() != null && "null".equals(this.getRecCveStReunion())) {
            conditions += " AND REC_CVE_ST_REUNION IS NULL";
        } else if (this.getRecCveStReunion() != null) {
            conditions += " AND REC_CVE_ST_REUNION = ?";
            values.add(this.getRecCveStReunion());
        }

        if (this.getRecLugarReunion() != null && "null".equals(this.getRecLugarReunion())) {
            conditions += " AND REC_LUGAR_REUNION IS NULL";
        } else if (this.getRecLugarReunion() != null) {
            conditions += " AND REC_LUGAR_REUNION = ?";
            values.add(this.getRecLugarReunion());
        }

        if (this.getRecAgendaReunion() != null && "null".equals(this.getRecAgendaReunion())) {
            conditions += " AND REC_AGENDA_REUNION IS NULL";
        } else if (this.getRecAgendaReunion() != null) {
            conditions += " AND REC_AGENDA_REUNION = ?";
            values.add(this.getRecAgendaReunion());
        }

        if (this.getRecAnoAltaReg() != null && this.getRecAnoAltaReg().longValue() == -999) {
            conditions += " AND REC_ANO_ALTA_REG IS NULL";
        } else if (this.getRecAnoAltaReg() != null) {
            conditions += " AND REC_ANO_ALTA_REG = ?";
            values.add(this.getRecAnoAltaReg());
        }

        if (this.getRecMesAltaReg() != null && this.getRecMesAltaReg().longValue() == -999) {
            conditions += " AND REC_MES_ALTA_REG IS NULL";
        } else if (this.getRecMesAltaReg() != null) {
            conditions += " AND REC_MES_ALTA_REG = ?";
            values.add(this.getRecMesAltaReg());
        }

        if (this.getRecDiaAltaReg() != null && this.getRecDiaAltaReg().longValue() == -999) {
            conditions += " AND REC_DIA_ALTA_REG IS NULL";
        } else if (this.getRecDiaAltaReg() != null) {
            conditions += " AND REC_DIA_ALTA_REG = ?";
            values.add(this.getRecDiaAltaReg());
        }

        if (this.getRecAnoUltMod() != null && this.getRecAnoUltMod().longValue() == -999) {
            conditions += " AND REC_ANO_ULT_MOD IS NULL";
        } else if (this.getRecAnoUltMod() != null) {
            conditions += " AND REC_ANO_ULT_MOD = ?";
            values.add(this.getRecAnoUltMod());
        }

        if (this.getRecMesUltMod() != null && this.getRecMesUltMod().longValue() == -999) {
            conditions += " AND REC_MES_ULT_MOD IS NULL";
        } else if (this.getRecMesUltMod() != null) {
            conditions += " AND REC_MES_ULT_MOD = ?";
            values.add(this.getRecMesUltMod());
        }

        if (this.getRecDiaUltMod() != null && this.getRecDiaUltMod().longValue() == -999) {
            conditions += " AND REC_DIA_ULT_MOD IS NULL";
        } else if (this.getRecDiaUltMod() != null) {
            conditions += " AND REC_DIA_ULT_MOD = ?";
            values.add(this.getRecDiaUltMod());
        }

        if (this.getRecCveStReucom() != null && "null".equals(this.getRecCveStReucom())) {
            conditions += " AND REC_CVE_ST_REUCOM IS NULL";
        } else if (this.getRecCveStReucom() != null) {
            conditions += " AND REC_CVE_ST_REUCOM = ?";
            values.add(this.getRecCveStReucom());
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
        String sql = "UPDATE REUNCOM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REC_NUM_CONTRATO = ?";
        pkValues.add(this.getRecNumContrato());
        conditions += " AND REC_NUM_REUNION = ?";
        pkValues.add(this.getRecNumReunion());
        conditions += " AND REC_ANO_REUNION = ?";
        pkValues.add(this.getRecAnoReunion());
        conditions += " AND REC_MES_REUNION = ?";
        pkValues.add(this.getRecMesReunion());
        conditions += " AND REC_DIA_REUNION = ?";
        pkValues.add(this.getRecDiaReunion());
        fields += " REC_CVE_ST_REUNION = ?, ";
        values.add(this.getRecCveStReunion());
        fields += " REC_LUGAR_REUNION = ?, ";
        values.add(this.getRecLugarReunion());
        fields += " REC_AGENDA_REUNION = ?, ";
        values.add(this.getRecAgendaReunion());
        fields += " REC_ANO_ALTA_REG = ?, ";
        values.add(this.getRecAnoAltaReg());
        fields += " REC_MES_ALTA_REG = ?, ";
        values.add(this.getRecMesAltaReg());
        fields += " REC_DIA_ALTA_REG = ?, ";
        values.add(this.getRecDiaAltaReg());
        fields += " REC_ANO_ULT_MOD = ?, ";
        values.add(this.getRecAnoUltMod());
        fields += " REC_MES_ULT_MOD = ?, ";
        values.add(this.getRecMesUltMod());
        fields += " REC_DIA_ULT_MOD = ?, ";
        values.add(this.getRecDiaUltMod());
        fields += " REC_CVE_ST_REUCOM = ?, ";
        values.add(this.getRecCveStReucom());
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
        String sql = "INSERT INTO REUNCOM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRecNumContrato());

        fields += ", REC_NUM_REUNION";
        fieldValues += ", ?";
        values.add(this.getRecNumReunion());

        fields += ", REC_ANO_REUNION";
        fieldValues += ", ?";
        values.add(this.getRecAnoReunion());

        fields += ", REC_MES_REUNION";
        fieldValues += ", ?";
        values.add(this.getRecMesReunion());

        fields += ", REC_DIA_REUNION";
        fieldValues += ", ?";
        values.add(this.getRecDiaReunion());

        fields += ", REC_CVE_ST_REUNION";
        fieldValues += ", ?";
        values.add(this.getRecCveStReunion());

        fields += ", REC_LUGAR_REUNION";
        fieldValues += ", ?";
        values.add(this.getRecLugarReunion());

        fields += ", REC_AGENDA_REUNION";
        fieldValues += ", ?";
        values.add(this.getRecAgendaReunion());

        fields += ", REC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRecAnoAltaReg());

        fields += ", REC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRecMesAltaReg());

        fields += ", REC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRecDiaAltaReg());

        fields += ", REC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRecAnoUltMod());

        fields += ", REC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRecMesUltMod());

        fields += ", REC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRecDiaUltMod());

        fields += ", REC_CVE_ST_REUCOM";
        fieldValues += ", ?";
        values.add(this.getRecCveStReucom());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REUNCOM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REC_NUM_CONTRATO = ?";
        values.add(this.getRecNumContrato());
        conditions += " AND REC_NUM_REUNION = ?";
        values.add(this.getRecNumReunion());
        conditions += " AND REC_ANO_REUNION = ?";
        values.add(this.getRecAnoReunion());
        conditions += " AND REC_MES_REUNION = ?";
        values.add(this.getRecMesReunion());
        conditions += " AND REC_DIA_REUNION = ?";
        values.add(this.getRecDiaReunion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Reuncom instance = (Reuncom) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRecNumContrato().equals(instance.getRecNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRecNumReunion().equals(instance.getRecNumReunion()))
            equalObjects = false;
        if (equalObjects && !this.getRecAnoReunion().equals(instance.getRecAnoReunion()))
            equalObjects = false;
        if (equalObjects && !this.getRecMesReunion().equals(instance.getRecMesReunion()))
            equalObjects = false;
        if (equalObjects && !this.getRecDiaReunion().equals(instance.getRecDiaReunion()))
            equalObjects = false;
        if (equalObjects && !this.getRecCveStReunion().equals(instance.getRecCveStReunion()))
            equalObjects = false;
        if (equalObjects && !this.getRecLugarReunion().equals(instance.getRecLugarReunion()))
            equalObjects = false;
        if (equalObjects && !this.getRecAgendaReunion().equals(instance.getRecAgendaReunion()))
            equalObjects = false;
        if (equalObjects && !this.getRecAnoAltaReg().equals(instance.getRecAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRecMesAltaReg().equals(instance.getRecMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRecDiaAltaReg().equals(instance.getRecDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRecAnoUltMod().equals(instance.getRecAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRecMesUltMod().equals(instance.getRecMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRecDiaUltMod().equals(instance.getRecDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRecCveStReucom().equals(instance.getRecCveStReucom()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Reuncom result = new Reuncom();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRecNumContrato((BigDecimal) objectData.getData("REC_NUM_CONTRATO"));
        result.setRecNumReunion((BigDecimal) objectData.getData("REC_NUM_REUNION"));
        result.setRecAnoReunion((BigDecimal) objectData.getData("REC_ANO_REUNION"));
        result.setRecMesReunion((BigDecimal) objectData.getData("REC_MES_REUNION"));
        result.setRecDiaReunion((BigDecimal) objectData.getData("REC_DIA_REUNION"));
        result.setRecCveStReunion((String) objectData.getData("REC_CVE_ST_REUNION"));
        result.setRecLugarReunion((String) objectData.getData("REC_LUGAR_REUNION"));
        result.setRecAgendaReunion((String) objectData.getData("REC_AGENDA_REUNION"));
        result.setRecAnoAltaReg((BigDecimal) objectData.getData("REC_ANO_ALTA_REG"));
        result.setRecMesAltaReg((BigDecimal) objectData.getData("REC_MES_ALTA_REG"));
        result.setRecDiaAltaReg((BigDecimal) objectData.getData("REC_DIA_ALTA_REG"));
        result.setRecAnoUltMod((BigDecimal) objectData.getData("REC_ANO_ULT_MOD"));
        result.setRecMesUltMod((BigDecimal) objectData.getData("REC_MES_ULT_MOD"));
        result.setRecDiaUltMod((BigDecimal) objectData.getData("REC_DIA_ULT_MOD"));
        result.setRecCveStReucom((String) objectData.getData("REC_CVE_ST_REUCOM"));

        return result;

    }

}
