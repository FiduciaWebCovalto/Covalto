package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AVISOS_PK", columns = { "AVI_ANO_ALTA_REG", "AVI_MES_ALTA_REG", "AVI_DIA_ALTA_REG", "AVI_NUM_CONTRATO", "AVI_CVE_PERS_FID", "AVI_NUM_PERS_FID" },
            sequences = { "MANUAL" })
public class Avisos extends DomainObject {

    BigDecimal aviNumContrato = null;
    String aviCvePersFid = null;
    BigDecimal aviNumPersFid = null;
    BigDecimal aviAnoAltaReg = null;
    BigDecimal aviMesAltaReg = null;
    BigDecimal aviDiaAltaReg = null;
    String aviNomPersFid = null;
    BigDecimal aviAnoUltMod = null;
    BigDecimal aviMesUltMod = null;
    BigDecimal aviDiaUltMod = null;
    String aviCveStAvisos = null;

    public Avisos() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAviNumContrato(BigDecimal aviNumContrato) {
        this.aviNumContrato = aviNumContrato;
    }

    public BigDecimal getAviNumContrato() {
        return this.aviNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAviCvePersFid(String aviCvePersFid) {
        this.aviCvePersFid = aviCvePersFid;
    }

    public String getAviCvePersFid() {
        return this.aviCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAviNumPersFid(BigDecimal aviNumPersFid) {
        this.aviNumPersFid = aviNumPersFid;
    }

    public BigDecimal getAviNumPersFid() {
        return this.aviNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAviAnoAltaReg(BigDecimal aviAnoAltaReg) {
        this.aviAnoAltaReg = aviAnoAltaReg;
    }

    public BigDecimal getAviAnoAltaReg() {
        return this.aviAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAviMesAltaReg(BigDecimal aviMesAltaReg) {
        this.aviMesAltaReg = aviMesAltaReg;
    }

    public BigDecimal getAviMesAltaReg() {
        return this.aviMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAviDiaAltaReg(BigDecimal aviDiaAltaReg) {
        this.aviDiaAltaReg = aviDiaAltaReg;
    }

    public BigDecimal getAviDiaAltaReg() {
        return this.aviDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAviNomPersFid(String aviNomPersFid) {
        this.aviNomPersFid = aviNomPersFid;
    }

    public String getAviNomPersFid() {
        return this.aviNomPersFid;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAviAnoUltMod(BigDecimal aviAnoUltMod) {
        this.aviAnoUltMod = aviAnoUltMod;
    }

    public BigDecimal getAviAnoUltMod() {
        return this.aviAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAviMesUltMod(BigDecimal aviMesUltMod) {
        this.aviMesUltMod = aviMesUltMod;
    }

    public BigDecimal getAviMesUltMod() {
        return this.aviMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAviDiaUltMod(BigDecimal aviDiaUltMod) {
        this.aviDiaUltMod = aviDiaUltMod;
    }

    public BigDecimal getAviDiaUltMod() {
        return this.aviDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAviCveStAvisos(String aviCveStAvisos) {
        this.aviCveStAvisos = aviCveStAvisos;
    }

    public String getAviCveStAvisos() {
        return this.aviCveStAvisos;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AVISOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAviNumContrato() != null && this.getAviNumContrato().longValue() == -999) {
            conditions += " AND AVI_NUM_CONTRATO IS NULL";
        } else if (this.getAviNumContrato() != null) {
            conditions += " AND AVI_NUM_CONTRATO = ?";
            values.add(this.getAviNumContrato());
        }

        if (this.getAviCvePersFid() != null && "null".equals(this.getAviCvePersFid())) {
            conditions += " AND AVI_CVE_PERS_FID IS NULL";
        } else if (this.getAviCvePersFid() != null) {
            conditions += " AND AVI_CVE_PERS_FID = ?";
            values.add(this.getAviCvePersFid());
        }

        if (this.getAviNumPersFid() != null && this.getAviNumPersFid().longValue() == -999) {
            conditions += " AND AVI_NUM_PERS_FID IS NULL";
        } else if (this.getAviNumPersFid() != null) {
            conditions += " AND AVI_NUM_PERS_FID = ?";
            values.add(this.getAviNumPersFid());
        }

        if (this.getAviAnoAltaReg() != null && this.getAviAnoAltaReg().longValue() == -999) {
            conditions += " AND AVI_ANO_ALTA_REG IS NULL";
        } else if (this.getAviAnoAltaReg() != null) {
            conditions += " AND AVI_ANO_ALTA_REG = ?";
            values.add(this.getAviAnoAltaReg());
        }

        if (this.getAviMesAltaReg() != null && this.getAviMesAltaReg().longValue() == -999) {
            conditions += " AND AVI_MES_ALTA_REG IS NULL";
        } else if (this.getAviMesAltaReg() != null) {
            conditions += " AND AVI_MES_ALTA_REG = ?";
            values.add(this.getAviMesAltaReg());
        }

        if (this.getAviDiaAltaReg() != null && this.getAviDiaAltaReg().longValue() == -999) {
            conditions += " AND AVI_DIA_ALTA_REG IS NULL";
        } else if (this.getAviDiaAltaReg() != null) {
            conditions += " AND AVI_DIA_ALTA_REG = ?";
            values.add(this.getAviDiaAltaReg());
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
        String sql = "SELECT * FROM AVISOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAviNumContrato() != null && this.getAviNumContrato().longValue() == -999) {
            conditions += " AND AVI_NUM_CONTRATO IS NULL";
        } else if (this.getAviNumContrato() != null) {
            conditions += " AND AVI_NUM_CONTRATO = ?";
            values.add(this.getAviNumContrato());
        }

        if (this.getAviCvePersFid() != null && "null".equals(this.getAviCvePersFid())) {
            conditions += " AND AVI_CVE_PERS_FID IS NULL";
        } else if (this.getAviCvePersFid() != null) {
            conditions += " AND AVI_CVE_PERS_FID = ?";
            values.add(this.getAviCvePersFid());
        }

        if (this.getAviNumPersFid() != null && this.getAviNumPersFid().longValue() == -999) {
            conditions += " AND AVI_NUM_PERS_FID IS NULL";
        } else if (this.getAviNumPersFid() != null) {
            conditions += " AND AVI_NUM_PERS_FID = ?";
            values.add(this.getAviNumPersFid());
        }

        if (this.getAviAnoAltaReg() != null && this.getAviAnoAltaReg().longValue() == -999) {
            conditions += " AND AVI_ANO_ALTA_REG IS NULL";
        } else if (this.getAviAnoAltaReg() != null) {
            conditions += " AND AVI_ANO_ALTA_REG = ?";
            values.add(this.getAviAnoAltaReg());
        }

        if (this.getAviMesAltaReg() != null && this.getAviMesAltaReg().longValue() == -999) {
            conditions += " AND AVI_MES_ALTA_REG IS NULL";
        } else if (this.getAviMesAltaReg() != null) {
            conditions += " AND AVI_MES_ALTA_REG = ?";
            values.add(this.getAviMesAltaReg());
        }

        if (this.getAviDiaAltaReg() != null && this.getAviDiaAltaReg().longValue() == -999) {
            conditions += " AND AVI_DIA_ALTA_REG IS NULL";
        } else if (this.getAviDiaAltaReg() != null) {
            conditions += " AND AVI_DIA_ALTA_REG = ?";
            values.add(this.getAviDiaAltaReg());
        }

        if (this.getAviNomPersFid() != null && "null".equals(this.getAviNomPersFid())) {
            conditions += " AND AVI_NOM_PERS_FID IS NULL";
        } else if (this.getAviNomPersFid() != null) {
            conditions += " AND AVI_NOM_PERS_FID = ?";
            values.add(this.getAviNomPersFid());
        }

        if (this.getAviAnoUltMod() != null && this.getAviAnoUltMod().longValue() == -999) {
            conditions += " AND AVI_ANO_ULT_MOD IS NULL";
        } else if (this.getAviAnoUltMod() != null) {
            conditions += " AND AVI_ANO_ULT_MOD = ?";
            values.add(this.getAviAnoUltMod());
        }

        if (this.getAviMesUltMod() != null && this.getAviMesUltMod().longValue() == -999) {
            conditions += " AND AVI_MES_ULT_MOD IS NULL";
        } else if (this.getAviMesUltMod() != null) {
            conditions += " AND AVI_MES_ULT_MOD = ?";
            values.add(this.getAviMesUltMod());
        }

        if (this.getAviDiaUltMod() != null && this.getAviDiaUltMod().longValue() == -999) {
            conditions += " AND AVI_DIA_ULT_MOD IS NULL";
        } else if (this.getAviDiaUltMod() != null) {
            conditions += " AND AVI_DIA_ULT_MOD = ?";
            values.add(this.getAviDiaUltMod());
        }

        if (this.getAviCveStAvisos() != null && "null".equals(this.getAviCveStAvisos())) {
            conditions += " AND AVI_CVE_ST_AVISOS IS NULL";
        } else if (this.getAviCveStAvisos() != null) {
            conditions += " AND AVI_CVE_ST_AVISOS = ?";
            values.add(this.getAviCveStAvisos());
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
        String sql = "UPDATE AVISOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AVI_NUM_CONTRATO = ?";
        pkValues.add(this.getAviNumContrato());
        conditions += " AND AVI_CVE_PERS_FID = ?";
        pkValues.add(this.getAviCvePersFid());
        conditions += " AND AVI_NUM_PERS_FID = ?";
        pkValues.add(this.getAviNumPersFid());
        conditions += " AND AVI_ANO_ALTA_REG = ?";
        pkValues.add(this.getAviAnoAltaReg());
        conditions += " AND AVI_MES_ALTA_REG = ?";
        pkValues.add(this.getAviMesAltaReg());
        conditions += " AND AVI_DIA_ALTA_REG = ?";
        pkValues.add(this.getAviDiaAltaReg());
        fields += " AVI_NOM_PERS_FID = ?, ";
        values.add(this.getAviNomPersFid());
        fields += " AVI_ANO_ULT_MOD = ?, ";
        values.add(this.getAviAnoUltMod());
        fields += " AVI_MES_ULT_MOD = ?, ";
        values.add(this.getAviMesUltMod());
        fields += " AVI_DIA_ULT_MOD = ?, ";
        values.add(this.getAviDiaUltMod());
        fields += " AVI_CVE_ST_AVISOS = ?, ";
        values.add(this.getAviCveStAvisos());
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
        String sql = "INSERT INTO AVISOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AVI_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getAviNumContrato());

        fields += ", AVI_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getAviCvePersFid());

        fields += ", AVI_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getAviNumPersFid());

        fields += ", AVI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAviAnoAltaReg());

        fields += ", AVI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAviMesAltaReg());

        fields += ", AVI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAviDiaAltaReg());

        fields += ", AVI_NOM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getAviNomPersFid());

        fields += ", AVI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAviAnoUltMod());

        fields += ", AVI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAviMesUltMod());

        fields += ", AVI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAviDiaUltMod());

        fields += ", AVI_CVE_ST_AVISOS";
        fieldValues += ", ?";
        values.add(this.getAviCveStAvisos());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AVISOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AVI_NUM_CONTRATO = ?";
        values.add(this.getAviNumContrato());
        conditions += " AND AVI_CVE_PERS_FID = ?";
        values.add(this.getAviCvePersFid());
        conditions += " AND AVI_NUM_PERS_FID = ?";
        values.add(this.getAviNumPersFid());
        conditions += " AND AVI_ANO_ALTA_REG = ?";
        values.add(this.getAviAnoAltaReg());
        conditions += " AND AVI_MES_ALTA_REG = ?";
        values.add(this.getAviMesAltaReg());
        conditions += " AND AVI_DIA_ALTA_REG = ?";
        values.add(this.getAviDiaAltaReg());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Avisos instance = (Avisos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAviNumContrato().equals(instance.getAviNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAviCvePersFid().equals(instance.getAviCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getAviNumPersFid().equals(instance.getAviNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getAviAnoAltaReg().equals(instance.getAviAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAviMesAltaReg().equals(instance.getAviMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAviDiaAltaReg().equals(instance.getAviDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAviNomPersFid().equals(instance.getAviNomPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getAviAnoUltMod().equals(instance.getAviAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAviMesUltMod().equals(instance.getAviMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAviDiaUltMod().equals(instance.getAviDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAviCveStAvisos().equals(instance.getAviCveStAvisos()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Avisos result = new Avisos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAviNumContrato((BigDecimal) objectData.getData("AVI_NUM_CONTRATO"));
        result.setAviCvePersFid((String) objectData.getData("AVI_CVE_PERS_FID"));
        result.setAviNumPersFid((BigDecimal) objectData.getData("AVI_NUM_PERS_FID"));
        result.setAviAnoAltaReg((BigDecimal) objectData.getData("AVI_ANO_ALTA_REG"));
        result.setAviMesAltaReg((BigDecimal) objectData.getData("AVI_MES_ALTA_REG"));
        result.setAviDiaAltaReg((BigDecimal) objectData.getData("AVI_DIA_ALTA_REG"));
        result.setAviNomPersFid((String) objectData.getData("AVI_NOM_PERS_FID"));
        result.setAviAnoUltMod((BigDecimal) objectData.getData("AVI_ANO_ULT_MOD"));
        result.setAviMesUltMod((BigDecimal) objectData.getData("AVI_MES_ULT_MOD"));
        result.setAviDiaUltMod((BigDecimal) objectData.getData("AVI_DIA_ULT_MOD"));
        result.setAviCveStAvisos((String) objectData.getData("AVI_CVE_ST_AVISOS"));

        return result;

    }

}
