package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SUBCONT_PK", columns = { "SCT_SUB_CONTRATO", "SCT_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Subcont extends DomainObject {

    BigDecimal sctNumContrato = null;
    BigDecimal sctSubContrato = null;
    String sctNomSubCto = null;
    String sctCvePersFid = null;
    BigDecimal sctNumPersFid = null;
    BigDecimal sctAnoAltaReg = null;
    BigDecimal sctMesAltaReg = null;
    BigDecimal sctDiaAltaReg = null;
    BigDecimal sctAnoUltMod = null;
    BigDecimal sctMesUltMod = null;
    BigDecimal sctDiaUltMod = null;
    String sctCveStSubcont = null;

    public Subcont() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSctNumContrato(BigDecimal sctNumContrato) {
        this.sctNumContrato = sctNumContrato;
    }

    public BigDecimal getSctNumContrato() {
        return this.sctNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSctSubContrato(BigDecimal sctSubContrato) {
        this.sctSubContrato = sctSubContrato;
    }

    public BigDecimal getSctSubContrato() {
        return this.sctSubContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSctNomSubCto(String sctNomSubCto) {
        this.sctNomSubCto = sctNomSubCto;
    }

    public String getSctNomSubCto() {
        return this.sctNomSubCto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSctCvePersFid(String sctCvePersFid) {
        this.sctCvePersFid = sctCvePersFid;
    }

    public String getSctCvePersFid() {
        return this.sctCvePersFid;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSctNumPersFid(BigDecimal sctNumPersFid) {
        this.sctNumPersFid = sctNumPersFid;
    }

    public BigDecimal getSctNumPersFid() {
        return this.sctNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSctAnoAltaReg(BigDecimal sctAnoAltaReg) {
        this.sctAnoAltaReg = sctAnoAltaReg;
    }

    public BigDecimal getSctAnoAltaReg() {
        return this.sctAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSctMesAltaReg(BigDecimal sctMesAltaReg) {
        this.sctMesAltaReg = sctMesAltaReg;
    }

    public BigDecimal getSctMesAltaReg() {
        return this.sctMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSctDiaAltaReg(BigDecimal sctDiaAltaReg) {
        this.sctDiaAltaReg = sctDiaAltaReg;
    }

    public BigDecimal getSctDiaAltaReg() {
        return this.sctDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSctAnoUltMod(BigDecimal sctAnoUltMod) {
        this.sctAnoUltMod = sctAnoUltMod;
    }

    public BigDecimal getSctAnoUltMod() {
        return this.sctAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSctMesUltMod(BigDecimal sctMesUltMod) {
        this.sctMesUltMod = sctMesUltMod;
    }

    public BigDecimal getSctMesUltMod() {
        return this.sctMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSctDiaUltMod(BigDecimal sctDiaUltMod) {
        this.sctDiaUltMod = sctDiaUltMod;
    }

    public BigDecimal getSctDiaUltMod() {
        return this.sctDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSctCveStSubcont(String sctCveStSubcont) {
        this.sctCveStSubcont = sctCveStSubcont;
    }

    public String getSctCveStSubcont() {
        return this.sctCveStSubcont;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SUBCONT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSctNumContrato() != null && this.getSctNumContrato().longValue() == -999) {
            conditions += " AND SCT_NUM_CONTRATO IS NULL";
        } else if (this.getSctNumContrato() != null) {
            conditions += " AND SCT_NUM_CONTRATO = ?";
            values.add(this.getSctNumContrato());
        }

        if (this.getSctSubContrato() != null && this.getSctSubContrato().longValue() == -999) {
            conditions += " AND SCT_SUB_CONTRATO IS NULL";
        } else if (this.getSctSubContrato() != null) {
            conditions += " AND SCT_SUB_CONTRATO = ?";
            values.add(this.getSctSubContrato());
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
        String sql = "SELECT * FROM SUBCONT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSctNumContrato() != null && this.getSctNumContrato().longValue() == -999) {
            conditions += " AND SCT_NUM_CONTRATO IS NULL";
        } else if (this.getSctNumContrato() != null) {
            conditions += " AND SCT_NUM_CONTRATO = ?";
            values.add(this.getSctNumContrato());
        }

        if (this.getSctSubContrato() != null && this.getSctSubContrato().longValue() == -999) {
            conditions += " AND SCT_SUB_CONTRATO IS NULL";
        } else if (this.getSctSubContrato() != null) {
            conditions += " AND SCT_SUB_CONTRATO = ?";
            values.add(this.getSctSubContrato());
        }

        if (this.getSctNomSubCto() != null && "null".equals(this.getSctNomSubCto())) {
            conditions += " AND SCT_NOM_SUB_CTO IS NULL";
        } else if (this.getSctNomSubCto() != null) {
            conditions += " AND SCT_NOM_SUB_CTO = ?";
            values.add(this.getSctNomSubCto());
        }

        if (this.getSctCvePersFid() != null && "null".equals(this.getSctCvePersFid())) {
            conditions += " AND SCT_CVE_PERS_FID IS NULL";
        } else if (this.getSctCvePersFid() != null) {
            conditions += " AND SCT_CVE_PERS_FID = ?";
            values.add(this.getSctCvePersFid());
        }

        if (this.getSctNumPersFid() != null && this.getSctNumPersFid().longValue() == -999) {
            conditions += " AND SCT_NUM_PERS_FID IS NULL";
        } else if (this.getSctNumPersFid() != null) {
            conditions += " AND SCT_NUM_PERS_FID = ?";
            values.add(this.getSctNumPersFid());
        }

        if (this.getSctAnoAltaReg() != null && this.getSctAnoAltaReg().longValue() == -999) {
            conditions += " AND SCT_ANO_ALTA_REG IS NULL";
        } else if (this.getSctAnoAltaReg() != null) {
            conditions += " AND SCT_ANO_ALTA_REG = ?";
            values.add(this.getSctAnoAltaReg());
        }

        if (this.getSctMesAltaReg() != null && this.getSctMesAltaReg().longValue() == -999) {
            conditions += " AND SCT_MES_ALTA_REG IS NULL";
        } else if (this.getSctMesAltaReg() != null) {
            conditions += " AND SCT_MES_ALTA_REG = ?";
            values.add(this.getSctMesAltaReg());
        }

        if (this.getSctDiaAltaReg() != null && this.getSctDiaAltaReg().longValue() == -999) {
            conditions += " AND SCT_DIA_ALTA_REG IS NULL";
        } else if (this.getSctDiaAltaReg() != null) {
            conditions += " AND SCT_DIA_ALTA_REG = ?";
            values.add(this.getSctDiaAltaReg());
        }

        if (this.getSctAnoUltMod() != null && this.getSctAnoUltMod().longValue() == -999) {
            conditions += " AND SCT_ANO_ULT_MOD IS NULL";
        } else if (this.getSctAnoUltMod() != null) {
            conditions += " AND SCT_ANO_ULT_MOD = ?";
            values.add(this.getSctAnoUltMod());
        }

        if (this.getSctMesUltMod() != null && this.getSctMesUltMod().longValue() == -999) {
            conditions += " AND SCT_MES_ULT_MOD IS NULL";
        } else if (this.getSctMesUltMod() != null) {
            conditions += " AND SCT_MES_ULT_MOD = ?";
            values.add(this.getSctMesUltMod());
        }

        if (this.getSctDiaUltMod() != null && this.getSctDiaUltMod().longValue() == -999) {
            conditions += " AND SCT_DIA_ULT_MOD IS NULL";
        } else if (this.getSctDiaUltMod() != null) {
            conditions += " AND SCT_DIA_ULT_MOD = ?";
            values.add(this.getSctDiaUltMod());
        }

        if (this.getSctCveStSubcont() != null && "null".equals(this.getSctCveStSubcont())) {
            conditions += " AND SCT_CVE_ST_SUBCONT IS NULL";
        } else if (this.getSctCveStSubcont() != null) {
            conditions += " AND SCT_CVE_ST_SUBCONT = ?";
            values.add(this.getSctCveStSubcont());
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
        String sql = "UPDATE SUBCONT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SCT_NUM_CONTRATO = ?";
        pkValues.add(this.getSctNumContrato());
        conditions += " AND SCT_SUB_CONTRATO = ?";
        pkValues.add(this.getSctSubContrato());
        fields += " SCT_NOM_SUB_CTO = ?, ";
        values.add(this.getSctNomSubCto());
        fields += " SCT_CVE_PERS_FID = ?, ";
        values.add(this.getSctCvePersFid());
        fields += " SCT_NUM_PERS_FID = ?, ";
        values.add(this.getSctNumPersFid());
        fields += " SCT_ANO_ALTA_REG = ?, ";
        values.add(this.getSctAnoAltaReg());
        fields += " SCT_MES_ALTA_REG = ?, ";
        values.add(this.getSctMesAltaReg());
        fields += " SCT_DIA_ALTA_REG = ?, ";
        values.add(this.getSctDiaAltaReg());
        fields += " SCT_ANO_ULT_MOD = ?, ";
        values.add(this.getSctAnoUltMod());
        fields += " SCT_MES_ULT_MOD = ?, ";
        values.add(this.getSctMesUltMod());
        fields += " SCT_DIA_ULT_MOD = ?, ";
        values.add(this.getSctDiaUltMod());
        fields += " SCT_CVE_ST_SUBCONT = ?, ";
        values.add(this.getSctCveStSubcont());
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
        String sql = "INSERT INTO SUBCONT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SCT_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSctNumContrato());

        fields += ", SCT_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSctSubContrato());

        fields += ", SCT_NOM_SUB_CTO";
        fieldValues += ", ?";
        values.add(this.getSctNomSubCto());

        fields += ", SCT_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getSctCvePersFid());

        fields += ", SCT_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getSctNumPersFid());

        fields += ", SCT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSctAnoAltaReg());

        fields += ", SCT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSctMesAltaReg());

        fields += ", SCT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSctDiaAltaReg());

        fields += ", SCT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSctAnoUltMod());

        fields += ", SCT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSctMesUltMod());

        fields += ", SCT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSctDiaUltMod());

        fields += ", SCT_CVE_ST_SUBCONT";
        fieldValues += ", ?";
        values.add(this.getSctCveStSubcont());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SUBCONT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SCT_NUM_CONTRATO = ?";
        values.add(this.getSctNumContrato());
        conditions += " AND SCT_SUB_CONTRATO = ?";
        values.add(this.getSctSubContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Subcont instance = (Subcont) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSctNumContrato().equals(instance.getSctNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSctSubContrato().equals(instance.getSctSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSctNomSubCto().equals(instance.getSctNomSubCto()))
            equalObjects = false;
        if (equalObjects && !this.getSctCvePersFid().equals(instance.getSctCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getSctNumPersFid().equals(instance.getSctNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getSctAnoAltaReg().equals(instance.getSctAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSctMesAltaReg().equals(instance.getSctMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSctDiaAltaReg().equals(instance.getSctDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSctAnoUltMod().equals(instance.getSctAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSctMesUltMod().equals(instance.getSctMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSctDiaUltMod().equals(instance.getSctDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSctCveStSubcont().equals(instance.getSctCveStSubcont()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Subcont result = new Subcont();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSctNumContrato((BigDecimal) objectData.getData("SCT_NUM_CONTRATO"));
        result.setSctSubContrato((BigDecimal) objectData.getData("SCT_SUB_CONTRATO"));
        result.setSctNomSubCto((String) objectData.getData("SCT_NOM_SUB_CTO"));
        result.setSctCvePersFid((String) objectData.getData("SCT_CVE_PERS_FID"));
        result.setSctNumPersFid((BigDecimal) objectData.getData("SCT_NUM_PERS_FID"));
        result.setSctAnoAltaReg((BigDecimal) objectData.getData("SCT_ANO_ALTA_REG"));
        result.setSctMesAltaReg((BigDecimal) objectData.getData("SCT_MES_ALTA_REG"));
        result.setSctDiaAltaReg((BigDecimal) objectData.getData("SCT_DIA_ALTA_REG"));
        result.setSctAnoUltMod((BigDecimal) objectData.getData("SCT_ANO_ULT_MOD"));
        result.setSctMesUltMod((BigDecimal) objectData.getData("SCT_MES_ULT_MOD"));
        result.setSctDiaUltMod((BigDecimal) objectData.getData("SCT_DIA_ULT_MOD"));
        result.setSctCveStSubcont((String) objectData.getData("SCT_CVE_ST_SUBCONT"));

        return result;

    }

}
