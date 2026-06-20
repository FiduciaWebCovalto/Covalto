package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SUBPROG_PK", columns = { "SPG_NUM_CONTRATO", "SPG_SUB_CONTRATO", "SPG_NUM_SUB_PROG" }, sequences = { "MANUAL" })
public class Subprog extends DomainObject {

    BigDecimal spgNumContrato = null;
    BigDecimal spgSubContrato = null;
    BigDecimal spgNumSubProg = null;
    String spgDescSubprog = null;
    BigDecimal spgPctAport1 = null;
    BigDecimal spgPctAport2 = null;
    BigDecimal spgPctAport3 = null;
    BigDecimal spgVigencia = null;
    BigDecimal spgAnoAltaReg = null;
    BigDecimal spgMesAltaReg = null;
    BigDecimal spgDiaAltaReg = null;
    BigDecimal spgAnoUltMod = null;
    BigDecimal spgMesUltMod = null;
    BigDecimal spgDiaUltMod = null;
    String spgCveStSprog = null;

    public Subprog() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSpgNumContrato(BigDecimal spgNumContrato) {
        this.spgNumContrato = spgNumContrato;
    }

    public BigDecimal getSpgNumContrato() {
        return this.spgNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSpgSubContrato(BigDecimal spgSubContrato) {
        this.spgSubContrato = spgSubContrato;
    }

    public BigDecimal getSpgSubContrato() {
        return this.spgSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSpgNumSubProg(BigDecimal spgNumSubProg) {
        this.spgNumSubProg = spgNumSubProg;
    }

    public BigDecimal getSpgNumSubProg() {
        return this.spgNumSubProg;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSpgDescSubprog(String spgDescSubprog) {
        this.spgDescSubprog = spgDescSubprog;
    }

    public String getSpgDescSubprog() {
        return this.spgDescSubprog;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setSpgPctAport1(BigDecimal spgPctAport1) {
        this.spgPctAport1 = spgPctAport1;
    }

    public BigDecimal getSpgPctAport1() {
        return this.spgPctAport1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setSpgPctAport2(BigDecimal spgPctAport2) {
        this.spgPctAport2 = spgPctAport2;
    }

    public BigDecimal getSpgPctAport2() {
        return this.spgPctAport2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setSpgPctAport3(BigDecimal spgPctAport3) {
        this.spgPctAport3 = spgPctAport3;
    }

    public BigDecimal getSpgPctAport3() {
        return this.spgPctAport3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSpgVigencia(BigDecimal spgVigencia) {
        this.spgVigencia = spgVigencia;
    }

    public BigDecimal getSpgVigencia() {
        return this.spgVigencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSpgAnoAltaReg(BigDecimal spgAnoAltaReg) {
        this.spgAnoAltaReg = spgAnoAltaReg;
    }

    public BigDecimal getSpgAnoAltaReg() {
        return this.spgAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSpgMesAltaReg(BigDecimal spgMesAltaReg) {
        this.spgMesAltaReg = spgMesAltaReg;
    }

    public BigDecimal getSpgMesAltaReg() {
        return this.spgMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSpgDiaAltaReg(BigDecimal spgDiaAltaReg) {
        this.spgDiaAltaReg = spgDiaAltaReg;
    }

    public BigDecimal getSpgDiaAltaReg() {
        return this.spgDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSpgAnoUltMod(BigDecimal spgAnoUltMod) {
        this.spgAnoUltMod = spgAnoUltMod;
    }

    public BigDecimal getSpgAnoUltMod() {
        return this.spgAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSpgMesUltMod(BigDecimal spgMesUltMod) {
        this.spgMesUltMod = spgMesUltMod;
    }

    public BigDecimal getSpgMesUltMod() {
        return this.spgMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSpgDiaUltMod(BigDecimal spgDiaUltMod) {
        this.spgDiaUltMod = spgDiaUltMod;
    }

    public BigDecimal getSpgDiaUltMod() {
        return this.spgDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSpgCveStSprog(String spgCveStSprog) {
        this.spgCveStSprog = spgCveStSprog;
    }

    public String getSpgCveStSprog() {
        return this.spgCveStSprog;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SUBPROG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSpgNumContrato() != null && this.getSpgNumContrato().longValue() == -999) {
            conditions += " AND SPG_NUM_CONTRATO IS NULL";
        } else if (this.getSpgNumContrato() != null) {
            conditions += " AND SPG_NUM_CONTRATO = ?";
            values.add(this.getSpgNumContrato());
        }

        if (this.getSpgSubContrato() != null && this.getSpgSubContrato().longValue() == -999) {
            conditions += " AND SPG_SUB_CONTRATO IS NULL";
        } else if (this.getSpgSubContrato() != null) {
            conditions += " AND SPG_SUB_CONTRATO = ?";
            values.add(this.getSpgSubContrato());
        }

        if (this.getSpgNumSubProg() != null && this.getSpgNumSubProg().longValue() == -999) {
            conditions += " AND SPG_NUM_SUB_PROG IS NULL";
        } else if (this.getSpgNumSubProg() != null) {
            conditions += " AND SPG_NUM_SUB_PROG = ?";
            values.add(this.getSpgNumSubProg());
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
        String sql = "SELECT * FROM SUBPROG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSpgNumContrato() != null && this.getSpgNumContrato().longValue() == -999) {
            conditions += " AND SPG_NUM_CONTRATO IS NULL";
        } else if (this.getSpgNumContrato() != null) {
            conditions += " AND SPG_NUM_CONTRATO = ?";
            values.add(this.getSpgNumContrato());
        }

        if (this.getSpgSubContrato() != null && this.getSpgSubContrato().longValue() == -999) {
            conditions += " AND SPG_SUB_CONTRATO IS NULL";
        } else if (this.getSpgSubContrato() != null) {
            conditions += " AND SPG_SUB_CONTRATO = ?";
            values.add(this.getSpgSubContrato());
        }

        if (this.getSpgNumSubProg() != null && this.getSpgNumSubProg().longValue() == -999) {
            conditions += " AND SPG_NUM_SUB_PROG IS NULL";
        } else if (this.getSpgNumSubProg() != null) {
            conditions += " AND SPG_NUM_SUB_PROG = ?";
            values.add(this.getSpgNumSubProg());
        }

        if (this.getSpgDescSubprog() != null && "null".equals(this.getSpgDescSubprog())) {
            conditions += " AND SPG_DESC_SUBPROG IS NULL";
        } else if (this.getSpgDescSubprog() != null) {
            conditions += " AND SPG_DESC_SUBPROG = ?";
            values.add(this.getSpgDescSubprog());
        }

        if (this.getSpgPctAport1() != null && this.getSpgPctAport1().longValue() == -999) {
            conditions += " AND SPG_PCT_APORT1 IS NULL";
        } else if (this.getSpgPctAport1() != null) {
            conditions += " AND SPG_PCT_APORT1 = ?";
            values.add(this.getSpgPctAport1());
        }

        if (this.getSpgPctAport2() != null && this.getSpgPctAport2().longValue() == -999) {
            conditions += " AND SPG_PCT_APORT2 IS NULL";
        } else if (this.getSpgPctAport2() != null) {
            conditions += " AND SPG_PCT_APORT2 = ?";
            values.add(this.getSpgPctAport2());
        }

        if (this.getSpgPctAport3() != null && this.getSpgPctAport3().longValue() == -999) {
            conditions += " AND SPG_PCT_APORT3 IS NULL";
        } else if (this.getSpgPctAport3() != null) {
            conditions += " AND SPG_PCT_APORT3 = ?";
            values.add(this.getSpgPctAport3());
        }

        if (this.getSpgVigencia() != null && this.getSpgVigencia().longValue() == -999) {
            conditions += " AND SPG_VIGENCIA IS NULL";
        } else if (this.getSpgVigencia() != null) {
            conditions += " AND SPG_VIGENCIA = ?";
            values.add(this.getSpgVigencia());
        }

        if (this.getSpgAnoAltaReg() != null && this.getSpgAnoAltaReg().longValue() == -999) {
            conditions += " AND SPG_ANO_ALTA_REG IS NULL";
        } else if (this.getSpgAnoAltaReg() != null) {
            conditions += " AND SPG_ANO_ALTA_REG = ?";
            values.add(this.getSpgAnoAltaReg());
        }

        if (this.getSpgMesAltaReg() != null && this.getSpgMesAltaReg().longValue() == -999) {
            conditions += " AND SPG_MES_ALTA_REG IS NULL";
        } else if (this.getSpgMesAltaReg() != null) {
            conditions += " AND SPG_MES_ALTA_REG = ?";
            values.add(this.getSpgMesAltaReg());
        }

        if (this.getSpgDiaAltaReg() != null && this.getSpgDiaAltaReg().longValue() == -999) {
            conditions += " AND SPG_DIA_ALTA_REG IS NULL";
        } else if (this.getSpgDiaAltaReg() != null) {
            conditions += " AND SPG_DIA_ALTA_REG = ?";
            values.add(this.getSpgDiaAltaReg());
        }

        if (this.getSpgAnoUltMod() != null && this.getSpgAnoUltMod().longValue() == -999) {
            conditions += " AND SPG_ANO_ULT_MOD IS NULL";
        } else if (this.getSpgAnoUltMod() != null) {
            conditions += " AND SPG_ANO_ULT_MOD = ?";
            values.add(this.getSpgAnoUltMod());
        }

        if (this.getSpgMesUltMod() != null && this.getSpgMesUltMod().longValue() == -999) {
            conditions += " AND SPG_MES_ULT_MOD IS NULL";
        } else if (this.getSpgMesUltMod() != null) {
            conditions += " AND SPG_MES_ULT_MOD = ?";
            values.add(this.getSpgMesUltMod());
        }

        if (this.getSpgDiaUltMod() != null && this.getSpgDiaUltMod().longValue() == -999) {
            conditions += " AND SPG_DIA_ULT_MOD IS NULL";
        } else if (this.getSpgDiaUltMod() != null) {
            conditions += " AND SPG_DIA_ULT_MOD = ?";
            values.add(this.getSpgDiaUltMod());
        }

        if (this.getSpgCveStSprog() != null && "null".equals(this.getSpgCveStSprog())) {
            conditions += " AND SPG_CVE_ST_SPROG IS NULL";
        } else if (this.getSpgCveStSprog() != null) {
            conditions += " AND SPG_CVE_ST_SPROG = ?";
            values.add(this.getSpgCveStSprog());
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
        String sql = "UPDATE SUBPROG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SPG_NUM_CONTRATO = ?";
        pkValues.add(this.getSpgNumContrato());
        conditions += " AND SPG_SUB_CONTRATO = ?";
        pkValues.add(this.getSpgSubContrato());
        conditions += " AND SPG_NUM_SUB_PROG = ?";
        pkValues.add(this.getSpgNumSubProg());
        fields += " SPG_DESC_SUBPROG = ?, ";
        values.add(this.getSpgDescSubprog());
        fields += " SPG_PCT_APORT1 = ?, ";
        values.add(this.getSpgPctAport1());
        fields += " SPG_PCT_APORT2 = ?, ";
        values.add(this.getSpgPctAport2());
        fields += " SPG_PCT_APORT3 = ?, ";
        values.add(this.getSpgPctAport3());
        fields += " SPG_VIGENCIA = ?, ";
        values.add(this.getSpgVigencia());
        fields += " SPG_ANO_ALTA_REG = ?, ";
        values.add(this.getSpgAnoAltaReg());
        fields += " SPG_MES_ALTA_REG = ?, ";
        values.add(this.getSpgMesAltaReg());
        fields += " SPG_DIA_ALTA_REG = ?, ";
        values.add(this.getSpgDiaAltaReg());
        fields += " SPG_ANO_ULT_MOD = ?, ";
        values.add(this.getSpgAnoUltMod());
        fields += " SPG_MES_ULT_MOD = ?, ";
        values.add(this.getSpgMesUltMod());
        fields += " SPG_DIA_ULT_MOD = ?, ";
        values.add(this.getSpgDiaUltMod());
        fields += " SPG_CVE_ST_SPROG = ?, ";
        values.add(this.getSpgCveStSprog());
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
        String sql = "INSERT INTO SUBPROG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SPG_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSpgNumContrato());

        fields += ", SPG_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSpgSubContrato());

        fields += ", SPG_NUM_SUB_PROG";
        fieldValues += ", ?";
        values.add(this.getSpgNumSubProg());

        fields += ", SPG_DESC_SUBPROG";
        fieldValues += ", ?";
        values.add(this.getSpgDescSubprog());

        fields += ", SPG_PCT_APORT1";
        fieldValues += ", ?";
        values.add(this.getSpgPctAport1());

        fields += ", SPG_PCT_APORT2";
        fieldValues += ", ?";
        values.add(this.getSpgPctAport2());

        fields += ", SPG_PCT_APORT3";
        fieldValues += ", ?";
        values.add(this.getSpgPctAport3());

        fields += ", SPG_VIGENCIA";
        fieldValues += ", ?";
        values.add(this.getSpgVigencia());

        fields += ", SPG_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSpgAnoAltaReg());

        fields += ", SPG_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSpgMesAltaReg());

        fields += ", SPG_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSpgDiaAltaReg());

        fields += ", SPG_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSpgAnoUltMod());

        fields += ", SPG_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSpgMesUltMod());

        fields += ", SPG_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSpgDiaUltMod());

        fields += ", SPG_CVE_ST_SPROG";
        fieldValues += ", ?";
        values.add(this.getSpgCveStSprog());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SUBPROG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SPG_NUM_CONTRATO = ?";
        values.add(this.getSpgNumContrato());
        conditions += " AND SPG_SUB_CONTRATO = ?";
        values.add(this.getSpgSubContrato());
        conditions += " AND SPG_NUM_SUB_PROG = ?";
        values.add(this.getSpgNumSubProg());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Subprog instance = (Subprog) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSpgNumContrato().equals(instance.getSpgNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSpgSubContrato().equals(instance.getSpgSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSpgNumSubProg().equals(instance.getSpgNumSubProg()))
            equalObjects = false;
        if (equalObjects && !this.getSpgDescSubprog().equals(instance.getSpgDescSubprog()))
            equalObjects = false;
        if (equalObjects && !this.getSpgPctAport1().equals(instance.getSpgPctAport1()))
            equalObjects = false;
        if (equalObjects && !this.getSpgPctAport2().equals(instance.getSpgPctAport2()))
            equalObjects = false;
        if (equalObjects && !this.getSpgPctAport3().equals(instance.getSpgPctAport3()))
            equalObjects = false;
        if (equalObjects && !this.getSpgVigencia().equals(instance.getSpgVigencia()))
            equalObjects = false;
        if (equalObjects && !this.getSpgAnoAltaReg().equals(instance.getSpgAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSpgMesAltaReg().equals(instance.getSpgMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSpgDiaAltaReg().equals(instance.getSpgDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSpgAnoUltMod().equals(instance.getSpgAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSpgMesUltMod().equals(instance.getSpgMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSpgDiaUltMod().equals(instance.getSpgDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSpgCveStSprog().equals(instance.getSpgCveStSprog()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Subprog result = new Subprog();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSpgNumContrato((BigDecimal) objectData.getData("SPG_NUM_CONTRATO"));
        result.setSpgSubContrato((BigDecimal) objectData.getData("SPG_SUB_CONTRATO"));
        result.setSpgNumSubProg((BigDecimal) objectData.getData("SPG_NUM_SUB_PROG"));
        result.setSpgDescSubprog((String) objectData.getData("SPG_DESC_SUBPROG"));
        result.setSpgPctAport1((BigDecimal) objectData.getData("SPG_PCT_APORT1"));
        result.setSpgPctAport2((BigDecimal) objectData.getData("SPG_PCT_APORT2"));
        result.setSpgPctAport3((BigDecimal) objectData.getData("SPG_PCT_APORT3"));
        result.setSpgVigencia((BigDecimal) objectData.getData("SPG_VIGENCIA"));
        result.setSpgAnoAltaReg((BigDecimal) objectData.getData("SPG_ANO_ALTA_REG"));
        result.setSpgMesAltaReg((BigDecimal) objectData.getData("SPG_MES_ALTA_REG"));
        result.setSpgDiaAltaReg((BigDecimal) objectData.getData("SPG_DIA_ALTA_REG"));
        result.setSpgAnoUltMod((BigDecimal) objectData.getData("SPG_ANO_ULT_MOD"));
        result.setSpgMesUltMod((BigDecimal) objectData.getData("SPG_MES_ULT_MOD"));
        result.setSpgDiaUltMod((BigDecimal) objectData.getData("SPG_DIA_ULT_MOD"));
        result.setSpgCveStSprog((String) objectData.getData("SPG_CVE_ST_SPROG"));

        return result;

    }

}
