package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REUNSUB_PK", columns = { "CRS_NUM_CONTRATO", "CRS_NUM_SUBCOMITE", "CRS_NUM_REUNION", "CRS_ANO_REUNION", "CRS_MES_REUNION", "CRS_DIA_REUNION" },
            sequences = { "MANUAL" })
public class Reunsub extends DomainObject {

    BigDecimal crsNumContrato = null;
    BigDecimal crsNumSubcomite = null;
    String crsNumReunion = null;
    BigDecimal crsAnoReunion = null;
    BigDecimal crsMesReunion = null;
    BigDecimal crsDiaReunion = null;
    String crsLugarReunion = null;
    Long crsAgendaReunion = null;
    BigDecimal crsAnoAltaReg = null;
    BigDecimal crsMesAltaReg = null;
    BigDecimal crsDiaAltaReg = null;
    BigDecimal crsAnoUltMod = null;
    BigDecimal crsMesUltMod = null;
    BigDecimal crsDiaUltMod = null;
    String crsCveStReunsub = null;
    BigDecimal crsCvePreRes = null;
    String crsComentario = null;
    BigDecimal crsReunionExtra = null;
    BigDecimal crsCveRecRes = null;

    public Reunsub() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrsNumContrato(BigDecimal crsNumContrato) {
        this.crsNumContrato = crsNumContrato;
    }

    public BigDecimal getCrsNumContrato() {
        return this.crsNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrsNumSubcomite(BigDecimal crsNumSubcomite) {
        this.crsNumSubcomite = crsNumSubcomite;
    }

    public BigDecimal getCrsNumSubcomite() {
        return this.crsNumSubcomite;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrsNumReunion(String crsNumReunion) {
        this.crsNumReunion = crsNumReunion;
    }

    public String getCrsNumReunion() {
        return this.crsNumReunion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCrsAnoReunion(BigDecimal crsAnoReunion) {
        this.crsAnoReunion = crsAnoReunion;
    }

    public BigDecimal getCrsAnoReunion() {
        return this.crsAnoReunion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrsMesReunion(BigDecimal crsMesReunion) {
        this.crsMesReunion = crsMesReunion;
    }

    public BigDecimal getCrsMesReunion() {
        return this.crsMesReunion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrsDiaReunion(BigDecimal crsDiaReunion) {
        this.crsDiaReunion = crsDiaReunion;
    }

    public BigDecimal getCrsDiaReunion() {
        return this.crsDiaReunion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrsLugarReunion(String crsLugarReunion) {
        this.crsLugarReunion = crsLugarReunion;
    }

    public String getCrsLugarReunion() {
        return this.crsLugarReunion;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setCrsAgendaReunion(Long crsAgendaReunion) {
        this.crsAgendaReunion = crsAgendaReunion;
    }

    public Long getCrsAgendaReunion() {
        return this.crsAgendaReunion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCrsAnoAltaReg(BigDecimal crsAnoAltaReg) {
        this.crsAnoAltaReg = crsAnoAltaReg;
    }

    public BigDecimal getCrsAnoAltaReg() {
        return this.crsAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrsMesAltaReg(BigDecimal crsMesAltaReg) {
        this.crsMesAltaReg = crsMesAltaReg;
    }

    public BigDecimal getCrsMesAltaReg() {
        return this.crsMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrsDiaAltaReg(BigDecimal crsDiaAltaReg) {
        this.crsDiaAltaReg = crsDiaAltaReg;
    }

    public BigDecimal getCrsDiaAltaReg() {
        return this.crsDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCrsAnoUltMod(BigDecimal crsAnoUltMod) {
        this.crsAnoUltMod = crsAnoUltMod;
    }

    public BigDecimal getCrsAnoUltMod() {
        return this.crsAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrsMesUltMod(BigDecimal crsMesUltMod) {
        this.crsMesUltMod = crsMesUltMod;
    }

    public BigDecimal getCrsMesUltMod() {
        return this.crsMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrsDiaUltMod(BigDecimal crsDiaUltMod) {
        this.crsDiaUltMod = crsDiaUltMod;
    }

    public BigDecimal getCrsDiaUltMod() {
        return this.crsDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrsCveStReunsub(String crsCveStReunsub) {
        this.crsCveStReunsub = crsCveStReunsub;
    }

    public String getCrsCveStReunsub() {
        return this.crsCveStReunsub;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrsCvePreRes(BigDecimal crsCvePreRes) {
        this.crsCvePreRes = crsCvePreRes;
    }

    public BigDecimal getCrsCvePreRes() {
        return this.crsCvePreRes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCrsComentario(String crsComentario) {
        this.crsComentario = crsComentario;
    }

    public String getCrsComentario() {
        return this.crsComentario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrsReunionExtra(BigDecimal crsReunionExtra) {
        this.crsReunionExtra = crsReunionExtra;
    }

    public BigDecimal getCrsReunionExtra() {
        return this.crsReunionExtra;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCrsCveRecRes(BigDecimal crsCveRecRes) {
        this.crsCveRecRes = crsCveRecRes;
    }

    public BigDecimal getCrsCveRecRes() {
        return this.crsCveRecRes;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REUNSUB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCrsNumContrato() != null && this.getCrsNumContrato().longValue() == -999) {
            conditions += " AND CRS_NUM_CONTRATO IS NULL";
        } else if (this.getCrsNumContrato() != null) {
            conditions += " AND CRS_NUM_CONTRATO = ?";
            values.add(this.getCrsNumContrato());
        }

        if (this.getCrsNumSubcomite() != null && this.getCrsNumSubcomite().longValue() == -999) {
            conditions += " AND CRS_NUM_SUBCOMITE IS NULL";
        } else if (this.getCrsNumSubcomite() != null) {
            conditions += " AND CRS_NUM_SUBCOMITE = ?";
            values.add(this.getCrsNumSubcomite());
        }

        if (this.getCrsNumReunion() != null && "null".equals(this.getCrsNumReunion())) {
            conditions += " AND CRS_NUM_REUNION IS NULL";
        } else if (this.getCrsNumReunion() != null) {
            conditions += " AND CRS_NUM_REUNION = ?";
            values.add(this.getCrsNumReunion());
        }

        if (this.getCrsAnoReunion() != null && this.getCrsAnoReunion().longValue() == -999) {
            conditions += " AND CRS_ANO_REUNION IS NULL";
        } else if (this.getCrsAnoReunion() != null) {
            conditions += " AND CRS_ANO_REUNION = ?";
            values.add(this.getCrsAnoReunion());
        }

        if (this.getCrsMesReunion() != null && this.getCrsMesReunion().longValue() == -999) {
            conditions += " AND CRS_MES_REUNION IS NULL";
        } else if (this.getCrsMesReunion() != null) {
            conditions += " AND CRS_MES_REUNION = ?";
            values.add(this.getCrsMesReunion());
        }

        if (this.getCrsDiaReunion() != null && this.getCrsDiaReunion().longValue() == -999) {
            conditions += " AND CRS_DIA_REUNION IS NULL";
        } else if (this.getCrsDiaReunion() != null) {
            conditions += " AND CRS_DIA_REUNION = ?";
            values.add(this.getCrsDiaReunion());
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
        String sql = "SELECT * FROM REUNSUB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCrsNumContrato() != null && this.getCrsNumContrato().longValue() == -999) {
            conditions += " AND CRS_NUM_CONTRATO IS NULL";
        } else if (this.getCrsNumContrato() != null) {
            conditions += " AND CRS_NUM_CONTRATO = ?";
            values.add(this.getCrsNumContrato());
        }

        if (this.getCrsNumSubcomite() != null && this.getCrsNumSubcomite().longValue() == -999) {
            conditions += " AND CRS_NUM_SUBCOMITE IS NULL";
        } else if (this.getCrsNumSubcomite() != null) {
            conditions += " AND CRS_NUM_SUBCOMITE = ?";
            values.add(this.getCrsNumSubcomite());
        }

        if (this.getCrsNumReunion() != null && "null".equals(this.getCrsNumReunion())) {
            conditions += " AND CRS_NUM_REUNION IS NULL";
        } else if (this.getCrsNumReunion() != null) {
            conditions += " AND CRS_NUM_REUNION = ?";
            values.add(this.getCrsNumReunion());
        }

        if (this.getCrsAnoReunion() != null && this.getCrsAnoReunion().longValue() == -999) {
            conditions += " AND CRS_ANO_REUNION IS NULL";
        } else if (this.getCrsAnoReunion() != null) {
            conditions += " AND CRS_ANO_REUNION = ?";
            values.add(this.getCrsAnoReunion());
        }

        if (this.getCrsMesReunion() != null && this.getCrsMesReunion().longValue() == -999) {
            conditions += " AND CRS_MES_REUNION IS NULL";
        } else if (this.getCrsMesReunion() != null) {
            conditions += " AND CRS_MES_REUNION = ?";
            values.add(this.getCrsMesReunion());
        }

        if (this.getCrsDiaReunion() != null && this.getCrsDiaReunion().longValue() == -999) {
            conditions += " AND CRS_DIA_REUNION IS NULL";
        } else if (this.getCrsDiaReunion() != null) {
            conditions += " AND CRS_DIA_REUNION = ?";
            values.add(this.getCrsDiaReunion());
        }

        if (this.getCrsLugarReunion() != null && "null".equals(this.getCrsLugarReunion())) {
            conditions += " AND CRS_LUGAR_REUNION IS NULL";
        } else if (this.getCrsLugarReunion() != null) {
            conditions += " AND CRS_LUGAR_REUNION = ?";
            values.add(this.getCrsLugarReunion());
        }

        if (this.getCrsAgendaReunion() != null && this.getCrsAgendaReunion() == -999) {
            conditions += " AND CRS_AGENDA_REUNION IS NULL";
        } else if (this.getCrsAgendaReunion() != null) {
            conditions += " AND CRS_AGENDA_REUNION = ?";
            values.add(this.getCrsAgendaReunion());
        }

        if (this.getCrsAnoAltaReg() != null && this.getCrsAnoAltaReg().longValue() == -999) {
            conditions += " AND CRS_ANO_ALTA_REG IS NULL";
        } else if (this.getCrsAnoAltaReg() != null) {
            conditions += " AND CRS_ANO_ALTA_REG = ?";
            values.add(this.getCrsAnoAltaReg());
        }

        if (this.getCrsMesAltaReg() != null && this.getCrsMesAltaReg().longValue() == -999) {
            conditions += " AND CRS_MES_ALTA_REG IS NULL";
        } else if (this.getCrsMesAltaReg() != null) {
            conditions += " AND CRS_MES_ALTA_REG = ?";
            values.add(this.getCrsMesAltaReg());
        }

        if (this.getCrsDiaAltaReg() != null && this.getCrsDiaAltaReg().longValue() == -999) {
            conditions += " AND CRS_DIA_ALTA_REG IS NULL";
        } else if (this.getCrsDiaAltaReg() != null) {
            conditions += " AND CRS_DIA_ALTA_REG = ?";
            values.add(this.getCrsDiaAltaReg());
        }

        if (this.getCrsAnoUltMod() != null && this.getCrsAnoUltMod().longValue() == -999) {
            conditions += " AND CRS_ANO_ULT_MOD IS NULL";
        } else if (this.getCrsAnoUltMod() != null) {
            conditions += " AND CRS_ANO_ULT_MOD = ?";
            values.add(this.getCrsAnoUltMod());
        }

        if (this.getCrsMesUltMod() != null && this.getCrsMesUltMod().longValue() == -999) {
            conditions += " AND CRS_MES_ULT_MOD IS NULL";
        } else if (this.getCrsMesUltMod() != null) {
            conditions += " AND CRS_MES_ULT_MOD = ?";
            values.add(this.getCrsMesUltMod());
        }

        if (this.getCrsDiaUltMod() != null && this.getCrsDiaUltMod().longValue() == -999) {
            conditions += " AND CRS_DIA_ULT_MOD IS NULL";
        } else if (this.getCrsDiaUltMod() != null) {
            conditions += " AND CRS_DIA_ULT_MOD = ?";
            values.add(this.getCrsDiaUltMod());
        }

        if (this.getCrsCveStReunsub() != null && "null".equals(this.getCrsCveStReunsub())) {
            conditions += " AND CRS_CVE_ST_REUNSUB IS NULL";
        } else if (this.getCrsCveStReunsub() != null) {
            conditions += " AND CRS_CVE_ST_REUNSUB = ?";
            values.add(this.getCrsCveStReunsub());
        }

        if (this.getCrsCvePreRes() != null && this.getCrsCvePreRes().longValue() == -999) {
            conditions += " AND CRS_CVE_PRE_RES IS NULL";
        } else if (this.getCrsCvePreRes() != null) {
            conditions += " AND CRS_CVE_PRE_RES = ?";
            values.add(this.getCrsCvePreRes());
        }

        if (this.getCrsComentario() != null && "null".equals(this.getCrsComentario())) {
            conditions += " AND CRS_COMENTARIO IS NULL";
        } else if (this.getCrsComentario() != null) {
            conditions += " AND CRS_COMENTARIO = ?";
            values.add(this.getCrsComentario());
        }

        if (this.getCrsReunionExtra() != null && this.getCrsReunionExtra().longValue() == -999) {
            conditions += " AND CRS_REUNION_EXTRA IS NULL";
        } else if (this.getCrsReunionExtra() != null) {
            conditions += " AND CRS_REUNION_EXTRA = ?";
            values.add(this.getCrsReunionExtra());
        }

        if (this.getCrsCveRecRes() != null && this.getCrsCveRecRes().longValue() == -999) {
            conditions += " AND CRS_CVE_REC_RES IS NULL";
        } else if (this.getCrsCveRecRes() != null) {
            conditions += " AND CRS_CVE_REC_RES = ?";
            values.add(this.getCrsCveRecRes());
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
        String sql = "UPDATE REUNSUB SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CRS_NUM_CONTRATO = ?";
        pkValues.add(this.getCrsNumContrato());
        conditions += " AND CRS_NUM_SUBCOMITE = ?";
        pkValues.add(this.getCrsNumSubcomite());
        conditions += " AND CRS_NUM_REUNION = ?";
        pkValues.add(this.getCrsNumReunion());
        conditions += " AND CRS_ANO_REUNION = ?";
        pkValues.add(this.getCrsAnoReunion());
        conditions += " AND CRS_MES_REUNION = ?";
        pkValues.add(this.getCrsMesReunion());
        conditions += " AND CRS_DIA_REUNION = ?";
        pkValues.add(this.getCrsDiaReunion());
        fields += " CRS_LUGAR_REUNION = ?, ";
        values.add(this.getCrsLugarReunion());
        fields += " CRS_AGENDA_REUNION = ?, ";
        values.add(this.getCrsAgendaReunion());
        fields += " CRS_ANO_ALTA_REG = ?, ";
        values.add(this.getCrsAnoAltaReg());
        fields += " CRS_MES_ALTA_REG = ?, ";
        values.add(this.getCrsMesAltaReg());
        fields += " CRS_DIA_ALTA_REG = ?, ";
        values.add(this.getCrsDiaAltaReg());
        fields += " CRS_ANO_ULT_MOD = ?, ";
        values.add(this.getCrsAnoUltMod());
        fields += " CRS_MES_ULT_MOD = ?, ";
        values.add(this.getCrsMesUltMod());
        fields += " CRS_DIA_ULT_MOD = ?, ";
        values.add(this.getCrsDiaUltMod());
        fields += " CRS_CVE_ST_REUNSUB = ?, ";
        values.add(this.getCrsCveStReunsub());
        fields += " CRS_CVE_PRE_RES = ?, ";
        values.add(this.getCrsCvePreRes());
        fields += " CRS_COMENTARIO = ?, ";
        values.add(this.getCrsComentario());
        fields += " CRS_REUNION_EXTRA = ?, ";
        values.add(this.getCrsReunionExtra());
        fields += " CRS_CVE_REC_RES = ?, ";
        values.add(this.getCrsCveRecRes());
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
        String sql = "INSERT INTO REUNSUB ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CRS_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCrsNumContrato());

        fields += ", CRS_NUM_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getCrsNumSubcomite());

        fields += ", CRS_NUM_REUNION";
        fieldValues += ", ?";
        values.add(this.getCrsNumReunion());

        fields += ", CRS_ANO_REUNION";
        fieldValues += ", ?";
        values.add(this.getCrsAnoReunion());

        fields += ", CRS_MES_REUNION";
        fieldValues += ", ?";
        values.add(this.getCrsMesReunion());

        fields += ", CRS_DIA_REUNION";
        fieldValues += ", ?";
        values.add(this.getCrsDiaReunion());

        fields += ", CRS_LUGAR_REUNION";
        fieldValues += ", ?";
        values.add(this.getCrsLugarReunion());

        fields += ", CRS_AGENDA_REUNION";
        fieldValues += ", ?";
        values.add(this.getCrsAgendaReunion());

        fields += ", CRS_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCrsAnoAltaReg());

        fields += ", CRS_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCrsMesAltaReg());

        fields += ", CRS_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCrsDiaAltaReg());

        fields += ", CRS_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCrsAnoUltMod());

        fields += ", CRS_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCrsMesUltMod());

        fields += ", CRS_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCrsDiaUltMod());

        fields += ", CRS_CVE_ST_REUNSUB";
        fieldValues += ", ?";
        values.add(this.getCrsCveStReunsub());

        fields += ", CRS_CVE_PRE_RES";
        fieldValues += ", ?";
        values.add(this.getCrsCvePreRes());

        fields += ", CRS_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getCrsComentario());

        fields += ", CRS_REUNION_EXTRA";
        fieldValues += ", ?";
        values.add(this.getCrsReunionExtra());

        fields += ", CRS_CVE_REC_RES";
        fieldValues += ", ?";
        values.add(this.getCrsCveRecRes());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REUNSUB WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CRS_NUM_CONTRATO = ?";
        values.add(this.getCrsNumContrato());
        conditions += " AND CRS_NUM_SUBCOMITE = ?";
        values.add(this.getCrsNumSubcomite());
        conditions += " AND CRS_NUM_REUNION = ?";
        values.add(this.getCrsNumReunion());
        conditions += " AND CRS_ANO_REUNION = ?";
        values.add(this.getCrsAnoReunion());
        conditions += " AND CRS_MES_REUNION = ?";
        values.add(this.getCrsMesReunion());
        conditions += " AND CRS_DIA_REUNION = ?";
        values.add(this.getCrsDiaReunion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Reunsub instance = (Reunsub) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCrsNumContrato().equals(instance.getCrsNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCrsNumSubcomite().equals(instance.getCrsNumSubcomite()))
            equalObjects = false;
        if (equalObjects && !this.getCrsNumReunion().equals(instance.getCrsNumReunion()))
            equalObjects = false;
        if (equalObjects && !this.getCrsAnoReunion().equals(instance.getCrsAnoReunion()))
            equalObjects = false;
        if (equalObjects && !this.getCrsMesReunion().equals(instance.getCrsMesReunion()))
            equalObjects = false;
        if (equalObjects && !this.getCrsDiaReunion().equals(instance.getCrsDiaReunion()))
            equalObjects = false;
        if (equalObjects && !this.getCrsLugarReunion().equals(instance.getCrsLugarReunion()))
            equalObjects = false;
        if (equalObjects && !this.getCrsAgendaReunion().equals(instance.getCrsAgendaReunion()))
            equalObjects = false;
        if (equalObjects && !this.getCrsAnoAltaReg().equals(instance.getCrsAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCrsMesAltaReg().equals(instance.getCrsMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCrsDiaAltaReg().equals(instance.getCrsDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCrsAnoUltMod().equals(instance.getCrsAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCrsMesUltMod().equals(instance.getCrsMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCrsDiaUltMod().equals(instance.getCrsDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCrsCveStReunsub().equals(instance.getCrsCveStReunsub()))
            equalObjects = false;
        if (equalObjects && !this.getCrsCvePreRes().equals(instance.getCrsCvePreRes()))
            equalObjects = false;
        if (equalObjects && !this.getCrsComentario().equals(instance.getCrsComentario()))
            equalObjects = false;
        if (equalObjects && !this.getCrsReunionExtra().equals(instance.getCrsReunionExtra()))
            equalObjects = false;
        if (equalObjects && !this.getCrsCveRecRes().equals(instance.getCrsCveRecRes()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Reunsub result = new Reunsub();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCrsNumContrato((BigDecimal) objectData.getData("CRS_NUM_CONTRATO"));
        result.setCrsNumSubcomite((BigDecimal) objectData.getData("CRS_NUM_SUBCOMITE"));
        result.setCrsNumReunion((String) objectData.getData("CRS_NUM_REUNION"));
        result.setCrsAnoReunion((BigDecimal) objectData.getData("CRS_ANO_REUNION"));
        result.setCrsMesReunion((BigDecimal) objectData.getData("CRS_MES_REUNION"));
        result.setCrsDiaReunion((BigDecimal) objectData.getData("CRS_DIA_REUNION"));
        result.setCrsLugarReunion((String) objectData.getData("CRS_LUGAR_REUNION"));
        result.setCrsAgendaReunion((Long) objectData.getData("CRS_AGENDA_REUNION"));
        result.setCrsAnoAltaReg((BigDecimal) objectData.getData("CRS_ANO_ALTA_REG"));
        result.setCrsMesAltaReg((BigDecimal) objectData.getData("CRS_MES_ALTA_REG"));
        result.setCrsDiaAltaReg((BigDecimal) objectData.getData("CRS_DIA_ALTA_REG"));
        result.setCrsAnoUltMod((BigDecimal) objectData.getData("CRS_ANO_ULT_MOD"));
        result.setCrsMesUltMod((BigDecimal) objectData.getData("CRS_MES_ULT_MOD"));
        result.setCrsDiaUltMod((BigDecimal) objectData.getData("CRS_DIA_ULT_MOD"));
        result.setCrsCveStReunsub((String) objectData.getData("CRS_CVE_ST_REUNSUB"));
        result.setCrsCvePreRes((BigDecimal) objectData.getData("CRS_CVE_PRE_RES"));
        result.setCrsComentario((String) objectData.getData("CRS_COMENTARIO"));
        result.setCrsReunionExtra((BigDecimal) objectData.getData("CRS_REUNION_EXTRA"));
        result.setCrsCveRecRes((BigDecimal) objectData.getData("CRS_CVE_REC_RES"));

        return result;

    }

}
