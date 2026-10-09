package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DEPARTAM_PK", columns = { "DEP_NUM_CONTRATO", "DEP_NUM_DEPTO" }, sequences = { "MANUAL" })
public class Departam extends DomainObject {

    BigDecimal depNumContrato = null;
    BigDecimal depNumDepto = null;
    String depDescDepto = null;
    BigDecimal depAnoAltaReg = null;
    BigDecimal depMesAltaReg = null;
    BigDecimal depDiaAltaReg = null;
    BigDecimal depAnoUltMod = null;
    BigDecimal depMesUltMod = null;
    BigDecimal depDiaUltMod = null;
    String depCveStDeparta = null;

    public Departam() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDepNumContrato(BigDecimal depNumContrato) {
        this.depNumContrato = depNumContrato;
    }

    public BigDecimal getDepNumContrato() {
        return this.depNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDepNumDepto(BigDecimal depNumDepto) {
        this.depNumDepto = depNumDepto;
    }

    public BigDecimal getDepNumDepto() {
        return this.depNumDepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDepDescDepto(String depDescDepto) {
        this.depDescDepto = depDescDepto;
    }

    public String getDepDescDepto() {
        return this.depDescDepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDepAnoAltaReg(BigDecimal depAnoAltaReg) {
        this.depAnoAltaReg = depAnoAltaReg;
    }

    public BigDecimal getDepAnoAltaReg() {
        return this.depAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDepMesAltaReg(BigDecimal depMesAltaReg) {
        this.depMesAltaReg = depMesAltaReg;
    }

    public BigDecimal getDepMesAltaReg() {
        return this.depMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDepDiaAltaReg(BigDecimal depDiaAltaReg) {
        this.depDiaAltaReg = depDiaAltaReg;
    }

    public BigDecimal getDepDiaAltaReg() {
        return this.depDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDepAnoUltMod(BigDecimal depAnoUltMod) {
        this.depAnoUltMod = depAnoUltMod;
    }

    public BigDecimal getDepAnoUltMod() {
        return this.depAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDepMesUltMod(BigDecimal depMesUltMod) {
        this.depMesUltMod = depMesUltMod;
    }

    public BigDecimal getDepMesUltMod() {
        return this.depMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDepDiaUltMod(BigDecimal depDiaUltMod) {
        this.depDiaUltMod = depDiaUltMod;
    }

    public BigDecimal getDepDiaUltMod() {
        return this.depDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDepCveStDeparta(String depCveStDeparta) {
        this.depCveStDeparta = depCveStDeparta;
    }

    public String getDepCveStDeparta() {
        return this.depCveStDeparta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DEPARTAM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDepNumContrato() != null && this.getDepNumContrato().longValue() == -999) {
            conditions += " AND DEP_NUM_CONTRATO IS NULL";
        } else if (this.getDepNumContrato() != null) {
            conditions += " AND DEP_NUM_CONTRATO = ?";
            values.add(this.getDepNumContrato());
        }

        if (this.getDepNumDepto() != null && this.getDepNumDepto().longValue() == -999) {
            conditions += " AND DEP_NUM_DEPTO IS NULL";
        } else if (this.getDepNumDepto() != null) {
            conditions += " AND DEP_NUM_DEPTO = ?";
            values.add(this.getDepNumDepto());
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
        String sql = "SELECT * FROM DEPARTAM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDepNumContrato() != null && this.getDepNumContrato().longValue() == -999) {
            conditions += " AND DEP_NUM_CONTRATO IS NULL";
        } else if (this.getDepNumContrato() != null) {
            conditions += " AND DEP_NUM_CONTRATO = ?";
            values.add(this.getDepNumContrato());
        }

        if (this.getDepNumDepto() != null && this.getDepNumDepto().longValue() == -999) {
            conditions += " AND DEP_NUM_DEPTO IS NULL";
        } else if (this.getDepNumDepto() != null) {
            conditions += " AND DEP_NUM_DEPTO = ?";
            values.add(this.getDepNumDepto());
        }

        if (this.getDepDescDepto() != null && "null".equals(this.getDepDescDepto())) {
            conditions += " AND DEP_DESC_DEPTO IS NULL";
        } else if (this.getDepDescDepto() != null) {
            conditions += " AND DEP_DESC_DEPTO = ?";
            values.add(this.getDepDescDepto());
        }

        if (this.getDepAnoAltaReg() != null && this.getDepAnoAltaReg().longValue() == -999) {
            conditions += " AND DEP_ANO_ALTA_REG IS NULL";
        } else if (this.getDepAnoAltaReg() != null) {
            conditions += " AND DEP_ANO_ALTA_REG = ?";
            values.add(this.getDepAnoAltaReg());
        }

        if (this.getDepMesAltaReg() != null && this.getDepMesAltaReg().longValue() == -999) {
            conditions += " AND DEP_MES_ALTA_REG IS NULL";
        } else if (this.getDepMesAltaReg() != null) {
            conditions += " AND DEP_MES_ALTA_REG = ?";
            values.add(this.getDepMesAltaReg());
        }

        if (this.getDepDiaAltaReg() != null && this.getDepDiaAltaReg().longValue() == -999) {
            conditions += " AND DEP_DIA_ALTA_REG IS NULL";
        } else if (this.getDepDiaAltaReg() != null) {
            conditions += " AND DEP_DIA_ALTA_REG = ?";
            values.add(this.getDepDiaAltaReg());
        }

        if (this.getDepAnoUltMod() != null && this.getDepAnoUltMod().longValue() == -999) {
            conditions += " AND DEP_ANO_ULT_MOD IS NULL";
        } else if (this.getDepAnoUltMod() != null) {
            conditions += " AND DEP_ANO_ULT_MOD = ?";
            values.add(this.getDepAnoUltMod());
        }

        if (this.getDepMesUltMod() != null && this.getDepMesUltMod().longValue() == -999) {
            conditions += " AND DEP_MES_ULT_MOD IS NULL";
        } else if (this.getDepMesUltMod() != null) {
            conditions += " AND DEP_MES_ULT_MOD = ?";
            values.add(this.getDepMesUltMod());
        }

        if (this.getDepDiaUltMod() != null && this.getDepDiaUltMod().longValue() == -999) {
            conditions += " AND DEP_DIA_ULT_MOD IS NULL";
        } else if (this.getDepDiaUltMod() != null) {
            conditions += " AND DEP_DIA_ULT_MOD = ?";
            values.add(this.getDepDiaUltMod());
        }

        if (this.getDepCveStDeparta() != null && "null".equals(this.getDepCveStDeparta())) {
            conditions += " AND DEP_CVE_ST_DEPARTA IS NULL";
        } else if (this.getDepCveStDeparta() != null) {
            conditions += " AND DEP_CVE_ST_DEPARTA = ?";
            values.add(this.getDepCveStDeparta());
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
        String sql = "UPDATE DEPARTAM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DEP_NUM_CONTRATO = ?";
        pkValues.add(this.getDepNumContrato());
        conditions += " AND DEP_NUM_DEPTO = ?";
        pkValues.add(this.getDepNumDepto());
        fields += " DEP_DESC_DEPTO = ?, ";
        values.add(this.getDepDescDepto());
        fields += " DEP_ANO_ALTA_REG = ?, ";
        values.add(this.getDepAnoAltaReg());
        fields += " DEP_MES_ALTA_REG = ?, ";
        values.add(this.getDepMesAltaReg());
        fields += " DEP_DIA_ALTA_REG = ?, ";
        values.add(this.getDepDiaAltaReg());
        fields += " DEP_ANO_ULT_MOD = ?, ";
        values.add(this.getDepAnoUltMod());
        fields += " DEP_MES_ULT_MOD = ?, ";
        values.add(this.getDepMesUltMod());
        fields += " DEP_DIA_ULT_MOD = ?, ";
        values.add(this.getDepDiaUltMod());
        fields += " DEP_CVE_ST_DEPARTA = ?, ";
        values.add(this.getDepCveStDeparta());
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
        String sql = "INSERT INTO DEPARTAM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DEP_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDepNumContrato());

        fields += ", DEP_NUM_DEPTO";
        fieldValues += ", ?";
        values.add(this.getDepNumDepto());

        fields += ", DEP_DESC_DEPTO";
        fieldValues += ", ?";
        values.add(this.getDepDescDepto());

        fields += ", DEP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDepAnoAltaReg());

        fields += ", DEP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDepMesAltaReg());

        fields += ", DEP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDepDiaAltaReg());

        fields += ", DEP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDepAnoUltMod());

        fields += ", DEP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDepMesUltMod());

        fields += ", DEP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDepDiaUltMod());

        fields += ", DEP_CVE_ST_DEPARTA";
        fieldValues += ", ?";
        values.add(this.getDepCveStDeparta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DEPARTAM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DEP_NUM_CONTRATO = ?";
        values.add(this.getDepNumContrato());
        conditions += " AND DEP_NUM_DEPTO = ?";
        values.add(this.getDepNumDepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Departam instance = (Departam) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDepNumContrato().equals(instance.getDepNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDepNumDepto().equals(instance.getDepNumDepto()))
            equalObjects = false;
        if (equalObjects && !this.getDepDescDepto().equals(instance.getDepDescDepto()))
            equalObjects = false;
        if (equalObjects && !this.getDepAnoAltaReg().equals(instance.getDepAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDepMesAltaReg().equals(instance.getDepMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDepDiaAltaReg().equals(instance.getDepDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDepAnoUltMod().equals(instance.getDepAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDepMesUltMod().equals(instance.getDepMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDepDiaUltMod().equals(instance.getDepDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDepCveStDeparta().equals(instance.getDepCveStDeparta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Departam result = new Departam();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDepNumContrato((BigDecimal) objectData.getData("DEP_NUM_CONTRATO"));
        result.setDepNumDepto((BigDecimal) objectData.getData("DEP_NUM_DEPTO"));
        result.setDepDescDepto((String) objectData.getData("DEP_DESC_DEPTO"));
        result.setDepAnoAltaReg((BigDecimal) objectData.getData("DEP_ANO_ALTA_REG"));
        result.setDepMesAltaReg((BigDecimal) objectData.getData("DEP_MES_ALTA_REG"));
        result.setDepDiaAltaReg((BigDecimal) objectData.getData("DEP_DIA_ALTA_REG"));
        result.setDepAnoUltMod((BigDecimal) objectData.getData("DEP_ANO_ULT_MOD"));
        result.setDepMesUltMod((BigDecimal) objectData.getData("DEP_MES_ULT_MOD"));
        result.setDepDiaUltMod((BigDecimal) objectData.getData("DEP_DIA_ULT_MOD"));
        result.setDepCveStDeparta((String) objectData.getData("DEP_CVE_ST_DEPARTA"));

        return result;

    }

}
