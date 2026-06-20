package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SUBPART_PK", columns = { "SPT_NUM_CONTRATO", "SPT_SUB_CONTRATO", "SPT_NUM_PARTICIP" }, sequences = { "MANUAL" })
public class Subpart extends DomainObject {

    BigDecimal sptNumContrato = null;
    BigDecimal sptSubContrato = null;
    BigDecimal sptNumParticip = null;
    String sptNomParticip = null;
    String sptCvePersFid = null;
    BigDecimal sptNumPersFid = null;
    BigDecimal sptPjeParticip = null;
    BigDecimal sptAnoAltaReg = null;
    BigDecimal sptMesAltaReg = null;
    BigDecimal sptDiaAltaReg = null;
    BigDecimal sptAnoUltMod = null;
    BigDecimal sptMesUltMod = null;
    BigDecimal sptDiaUltMod = null;
    String sptCveStSubpart = null;

    public Subpart() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSptNumContrato(BigDecimal sptNumContrato) {
        this.sptNumContrato = sptNumContrato;
    }

    public BigDecimal getSptNumContrato() {
        return this.sptNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSptSubContrato(BigDecimal sptSubContrato) {
        this.sptSubContrato = sptSubContrato;
    }

    public BigDecimal getSptSubContrato() {
        return this.sptSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSptNumParticip(BigDecimal sptNumParticip) {
        this.sptNumParticip = sptNumParticip;
    }

    public BigDecimal getSptNumParticip() {
        return this.sptNumParticip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSptNomParticip(String sptNomParticip) {
        this.sptNomParticip = sptNomParticip;
    }

    public String getSptNomParticip() {
        return this.sptNomParticip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSptCvePersFid(String sptCvePersFid) {
        this.sptCvePersFid = sptCvePersFid;
    }

    public String getSptCvePersFid() {
        return this.sptCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSptNumPersFid(BigDecimal sptNumPersFid) {
        this.sptNumPersFid = sptNumPersFid;
    }

    public BigDecimal getSptNumPersFid() {
        return this.sptNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSptPjeParticip(BigDecimal sptPjeParticip) {
        this.sptPjeParticip = sptPjeParticip;
    }

    public BigDecimal getSptPjeParticip() {
        return this.sptPjeParticip;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSptAnoAltaReg(BigDecimal sptAnoAltaReg) {
        this.sptAnoAltaReg = sptAnoAltaReg;
    }

    public BigDecimal getSptAnoAltaReg() {
        return this.sptAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSptMesAltaReg(BigDecimal sptMesAltaReg) {
        this.sptMesAltaReg = sptMesAltaReg;
    }

    public BigDecimal getSptMesAltaReg() {
        return this.sptMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSptDiaAltaReg(BigDecimal sptDiaAltaReg) {
        this.sptDiaAltaReg = sptDiaAltaReg;
    }

    public BigDecimal getSptDiaAltaReg() {
        return this.sptDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSptAnoUltMod(BigDecimal sptAnoUltMod) {
        this.sptAnoUltMod = sptAnoUltMod;
    }

    public BigDecimal getSptAnoUltMod() {
        return this.sptAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSptMesUltMod(BigDecimal sptMesUltMod) {
        this.sptMesUltMod = sptMesUltMod;
    }

    public BigDecimal getSptMesUltMod() {
        return this.sptMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSptDiaUltMod(BigDecimal sptDiaUltMod) {
        this.sptDiaUltMod = sptDiaUltMod;
    }

    public BigDecimal getSptDiaUltMod() {
        return this.sptDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSptCveStSubpart(String sptCveStSubpart) {
        this.sptCveStSubpart = sptCveStSubpart;
    }

    public String getSptCveStSubpart() {
        return this.sptCveStSubpart;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SUBPART ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSptNumContrato() != null && this.getSptNumContrato().longValue() == -999) {
            conditions += " AND SPT_NUM_CONTRATO IS NULL";
        } else if (this.getSptNumContrato() != null) {
            conditions += " AND SPT_NUM_CONTRATO = ?";
            values.add(this.getSptNumContrato());
        }

        if (this.getSptSubContrato() != null && this.getSptSubContrato().longValue() == -999) {
            conditions += " AND SPT_SUB_CONTRATO IS NULL";
        } else if (this.getSptSubContrato() != null) {
            conditions += " AND SPT_SUB_CONTRATO = ?";
            values.add(this.getSptSubContrato());
        }

        if (this.getSptNumParticip() != null && this.getSptNumParticip().longValue() == -999) {
            conditions += " AND SPT_NUM_PARTICIP IS NULL";
        } else if (this.getSptNumParticip() != null) {
            conditions += " AND SPT_NUM_PARTICIP = ?";
            values.add(this.getSptNumParticip());
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
        String sql = "SELECT * FROM SUBPART ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSptNumContrato() != null && this.getSptNumContrato().longValue() == -999) {
            conditions += " AND SPT_NUM_CONTRATO IS NULL";
        } else if (this.getSptNumContrato() != null) {
            conditions += " AND SPT_NUM_CONTRATO = ?";
            values.add(this.getSptNumContrato());
        }

        if (this.getSptSubContrato() != null && this.getSptSubContrato().longValue() == -999) {
            conditions += " AND SPT_SUB_CONTRATO IS NULL";
        } else if (this.getSptSubContrato() != null) {
            conditions += " AND SPT_SUB_CONTRATO = ?";
            values.add(this.getSptSubContrato());
        }

        if (this.getSptNumParticip() != null && this.getSptNumParticip().longValue() == -999) {
            conditions += " AND SPT_NUM_PARTICIP IS NULL";
        } else if (this.getSptNumParticip() != null) {
            conditions += " AND SPT_NUM_PARTICIP = ?";
            values.add(this.getSptNumParticip());
        }

        if (this.getSptNomParticip() != null && "null".equals(this.getSptNomParticip())) {
            conditions += " AND SPT_NOM_PARTICIP IS NULL";
        } else if (this.getSptNomParticip() != null) {
            conditions += " AND SPT_NOM_PARTICIP = ?";
            values.add(this.getSptNomParticip());
        }

        if (this.getSptCvePersFid() != null && "null".equals(this.getSptCvePersFid())) {
            conditions += " AND SPT_CVE_PERS_FID IS NULL";
        } else if (this.getSptCvePersFid() != null) {
            conditions += " AND SPT_CVE_PERS_FID = ?";
            values.add(this.getSptCvePersFid());
        }

        if (this.getSptNumPersFid() != null && this.getSptNumPersFid().longValue() == -999) {
            conditions += " AND SPT_NUM_PERS_FID IS NULL";
        } else if (this.getSptNumPersFid() != null) {
            conditions += " AND SPT_NUM_PERS_FID = ?";
            values.add(this.getSptNumPersFid());
        }

        if (this.getSptPjeParticip() != null && this.getSptPjeParticip().longValue() == -999) {
            conditions += " AND SPT_PJE_PARTICIP IS NULL";
        } else if (this.getSptPjeParticip() != null) {
            conditions += " AND SPT_PJE_PARTICIP = ?";
            values.add(this.getSptPjeParticip());
        }

        if (this.getSptAnoAltaReg() != null && this.getSptAnoAltaReg().longValue() == -999) {
            conditions += " AND SPT_ANO_ALTA_REG IS NULL";
        } else if (this.getSptAnoAltaReg() != null) {
            conditions += " AND SPT_ANO_ALTA_REG = ?";
            values.add(this.getSptAnoAltaReg());
        }

        if (this.getSptMesAltaReg() != null && this.getSptMesAltaReg().longValue() == -999) {
            conditions += " AND SPT_MES_ALTA_REG IS NULL";
        } else if (this.getSptMesAltaReg() != null) {
            conditions += " AND SPT_MES_ALTA_REG = ?";
            values.add(this.getSptMesAltaReg());
        }

        if (this.getSptDiaAltaReg() != null && this.getSptDiaAltaReg().longValue() == -999) {
            conditions += " AND SPT_DIA_ALTA_REG IS NULL";
        } else if (this.getSptDiaAltaReg() != null) {
            conditions += " AND SPT_DIA_ALTA_REG = ?";
            values.add(this.getSptDiaAltaReg());
        }

        if (this.getSptAnoUltMod() != null && this.getSptAnoUltMod().longValue() == -999) {
            conditions += " AND SPT_ANO_ULT_MOD IS NULL";
        } else if (this.getSptAnoUltMod() != null) {
            conditions += " AND SPT_ANO_ULT_MOD = ?";
            values.add(this.getSptAnoUltMod());
        }

        if (this.getSptMesUltMod() != null && this.getSptMesUltMod().longValue() == -999) {
            conditions += " AND SPT_MES_ULT_MOD IS NULL";
        } else if (this.getSptMesUltMod() != null) {
            conditions += " AND SPT_MES_ULT_MOD = ?";
            values.add(this.getSptMesUltMod());
        }

        if (this.getSptDiaUltMod() != null && this.getSptDiaUltMod().longValue() == -999) {
            conditions += " AND SPT_DIA_ULT_MOD IS NULL";
        } else if (this.getSptDiaUltMod() != null) {
            conditions += " AND SPT_DIA_ULT_MOD = ?";
            values.add(this.getSptDiaUltMod());
        }

        if (this.getSptCveStSubpart() != null && "null".equals(this.getSptCveStSubpart())) {
            conditions += " AND SPT_CVE_ST_SUBPART IS NULL";
        } else if (this.getSptCveStSubpart() != null) {
            conditions += " AND SPT_CVE_ST_SUBPART = ?";
            values.add(this.getSptCveStSubpart());
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
        String sql = "UPDATE SUBPART SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SPT_NUM_CONTRATO = ?";
        pkValues.add(this.getSptNumContrato());
        conditions += " AND SPT_SUB_CONTRATO = ?";
        pkValues.add(this.getSptSubContrato());
        conditions += " AND SPT_NUM_PARTICIP = ?";
        pkValues.add(this.getSptNumParticip());
        fields += " SPT_NOM_PARTICIP = ?, ";
        values.add(this.getSptNomParticip());
        fields += " SPT_CVE_PERS_FID = ?, ";
        values.add(this.getSptCvePersFid());
        fields += " SPT_NUM_PERS_FID = ?, ";
        values.add(this.getSptNumPersFid());
        fields += " SPT_PJE_PARTICIP = ?, ";
        values.add(this.getSptPjeParticip());
        fields += " SPT_ANO_ALTA_REG = ?, ";
        values.add(this.getSptAnoAltaReg());
        fields += " SPT_MES_ALTA_REG = ?, ";
        values.add(this.getSptMesAltaReg());
        fields += " SPT_DIA_ALTA_REG = ?, ";
        values.add(this.getSptDiaAltaReg());
        fields += " SPT_ANO_ULT_MOD = ?, ";
        values.add(this.getSptAnoUltMod());
        fields += " SPT_MES_ULT_MOD = ?, ";
        values.add(this.getSptMesUltMod());
        fields += " SPT_DIA_ULT_MOD = ?, ";
        values.add(this.getSptDiaUltMod());
        fields += " SPT_CVE_ST_SUBPART = ?, ";
        values.add(this.getSptCveStSubpart());
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
        String sql = "INSERT INTO SUBPART ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SPT_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSptNumContrato());

        fields += ", SPT_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSptSubContrato());

        fields += ", SPT_NUM_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getSptNumParticip());

        fields += ", SPT_NOM_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getSptNomParticip());

        fields += ", SPT_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getSptCvePersFid());

        fields += ", SPT_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getSptNumPersFid());

        fields += ", SPT_PJE_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getSptPjeParticip());

        fields += ", SPT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSptAnoAltaReg());

        fields += ", SPT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSptMesAltaReg());

        fields += ", SPT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSptDiaAltaReg());

        fields += ", SPT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSptAnoUltMod());

        fields += ", SPT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSptMesUltMod());

        fields += ", SPT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSptDiaUltMod());

        fields += ", SPT_CVE_ST_SUBPART";
        fieldValues += ", ?";
        values.add(this.getSptCveStSubpart());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SUBPART WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SPT_NUM_CONTRATO = ?";
        values.add(this.getSptNumContrato());
        conditions += " AND SPT_SUB_CONTRATO = ?";
        values.add(this.getSptSubContrato());
        conditions += " AND SPT_NUM_PARTICIP = ?";
        values.add(this.getSptNumParticip());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Subpart instance = (Subpart) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSptNumContrato().equals(instance.getSptNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSptSubContrato().equals(instance.getSptSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSptNumParticip().equals(instance.getSptNumParticip()))
            equalObjects = false;
        if (equalObjects && !this.getSptNomParticip().equals(instance.getSptNomParticip()))
            equalObjects = false;
        if (equalObjects && !this.getSptCvePersFid().equals(instance.getSptCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getSptNumPersFid().equals(instance.getSptNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getSptPjeParticip().equals(instance.getSptPjeParticip()))
            equalObjects = false;
        if (equalObjects && !this.getSptAnoAltaReg().equals(instance.getSptAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSptMesAltaReg().equals(instance.getSptMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSptDiaAltaReg().equals(instance.getSptDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSptAnoUltMod().equals(instance.getSptAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSptMesUltMod().equals(instance.getSptMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSptDiaUltMod().equals(instance.getSptDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSptCveStSubpart().equals(instance.getSptCveStSubpart()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Subpart result = new Subpart();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSptNumContrato((BigDecimal) objectData.getData("SPT_NUM_CONTRATO"));
        result.setSptSubContrato((BigDecimal) objectData.getData("SPT_SUB_CONTRATO"));
        result.setSptNumParticip((BigDecimal) objectData.getData("SPT_NUM_PARTICIP"));
        result.setSptNomParticip((String) objectData.getData("SPT_NOM_PARTICIP"));
        result.setSptCvePersFid((String) objectData.getData("SPT_CVE_PERS_FID"));
        result.setSptNumPersFid((BigDecimal) objectData.getData("SPT_NUM_PERS_FID"));
        result.setSptPjeParticip((BigDecimal) objectData.getData("SPT_PJE_PARTICIP"));
        result.setSptAnoAltaReg((BigDecimal) objectData.getData("SPT_ANO_ALTA_REG"));
        result.setSptMesAltaReg((BigDecimal) objectData.getData("SPT_MES_ALTA_REG"));
        result.setSptDiaAltaReg((BigDecimal) objectData.getData("SPT_DIA_ALTA_REG"));
        result.setSptAnoUltMod((BigDecimal) objectData.getData("SPT_ANO_ULT_MOD"));
        result.setSptMesUltMod((BigDecimal) objectData.getData("SPT_MES_ULT_MOD"));
        result.setSptDiaUltMod((BigDecimal) objectData.getData("SPT_DIA_ULT_MOD"));
        result.setSptCveStSubpart((String) objectData.getData("SPT_CVE_ST_SUBPART"));

        return result;

    }

}
