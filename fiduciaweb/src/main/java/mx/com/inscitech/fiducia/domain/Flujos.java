package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FLUJOS_PK", columns = { "FLU_NUM_CONTRATO", "FLU_ID_CTO_DERIVA", "FLU_NUM_MOVIMIENTO" }, sequences = { "MANUAL" })
public class Flujos extends DomainObject {

    BigDecimal fluNumContrato = null;
    String fluIdCtoDeriva = null;
    BigDecimal fluNumMovimiento = null;
    String fluIdComprobante = null;
    String fluDescMovim = null;
    String fluCveMovim = null;
    BigDecimal fluImpMovim = null;
    BigDecimal fluAnoMovim = null;
    BigDecimal fluMesMovim = null;
    BigDecimal fluDiaMovim = null;
    BigDecimal fluAnoAltaReg = null;
    BigDecimal fluMesAltaReg = null;
    BigDecimal fluDiaAltaReg = null;
    BigDecimal fluAnoUltMod = null;
    BigDecimal fluMesUltMod = null;
    BigDecimal fluDiaUltMod = null;
    String fluCveStFlujos = null;

    public Flujos() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFluNumContrato(BigDecimal fluNumContrato) {
        this.fluNumContrato = fluNumContrato;
    }

    public BigDecimal getFluNumContrato() {
        return this.fluNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFluIdCtoDeriva(String fluIdCtoDeriva) {
        this.fluIdCtoDeriva = fluIdCtoDeriva;
    }

    public String getFluIdCtoDeriva() {
        return this.fluIdCtoDeriva;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFluNumMovimiento(BigDecimal fluNumMovimiento) {
        this.fluNumMovimiento = fluNumMovimiento;
    }

    public BigDecimal getFluNumMovimiento() {
        return this.fluNumMovimiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFluIdComprobante(String fluIdComprobante) {
        this.fluIdComprobante = fluIdComprobante;
    }

    public String getFluIdComprobante() {
        return this.fluIdComprobante;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFluDescMovim(String fluDescMovim) {
        this.fluDescMovim = fluDescMovim;
    }

    public String getFluDescMovim() {
        return this.fluDescMovim;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFluCveMovim(String fluCveMovim) {
        this.fluCveMovim = fluCveMovim;
    }

    public String getFluCveMovim() {
        return this.fluCveMovim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFluImpMovim(BigDecimal fluImpMovim) {
        this.fluImpMovim = fluImpMovim;
    }

    public BigDecimal getFluImpMovim() {
        return this.fluImpMovim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFluAnoMovim(BigDecimal fluAnoMovim) {
        this.fluAnoMovim = fluAnoMovim;
    }

    public BigDecimal getFluAnoMovim() {
        return this.fluAnoMovim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFluMesMovim(BigDecimal fluMesMovim) {
        this.fluMesMovim = fluMesMovim;
    }

    public BigDecimal getFluMesMovim() {
        return this.fluMesMovim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFluDiaMovim(BigDecimal fluDiaMovim) {
        this.fluDiaMovim = fluDiaMovim;
    }

    public BigDecimal getFluDiaMovim() {
        return this.fluDiaMovim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFluAnoAltaReg(BigDecimal fluAnoAltaReg) {
        this.fluAnoAltaReg = fluAnoAltaReg;
    }

    public BigDecimal getFluAnoAltaReg() {
        return this.fluAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFluMesAltaReg(BigDecimal fluMesAltaReg) {
        this.fluMesAltaReg = fluMesAltaReg;
    }

    public BigDecimal getFluMesAltaReg() {
        return this.fluMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFluDiaAltaReg(BigDecimal fluDiaAltaReg) {
        this.fluDiaAltaReg = fluDiaAltaReg;
    }

    public BigDecimal getFluDiaAltaReg() {
        return this.fluDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFluAnoUltMod(BigDecimal fluAnoUltMod) {
        this.fluAnoUltMod = fluAnoUltMod;
    }

    public BigDecimal getFluAnoUltMod() {
        return this.fluAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFluMesUltMod(BigDecimal fluMesUltMod) {
        this.fluMesUltMod = fluMesUltMod;
    }

    public BigDecimal getFluMesUltMod() {
        return this.fluMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFluDiaUltMod(BigDecimal fluDiaUltMod) {
        this.fluDiaUltMod = fluDiaUltMod;
    }

    public BigDecimal getFluDiaUltMod() {
        return this.fluDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFluCveStFlujos(String fluCveStFlujos) {
        this.fluCveStFlujos = fluCveStFlujos;
    }

    public String getFluCveStFlujos() {
        return this.fluCveStFlujos;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FLUJOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFluNumContrato() != null && this.getFluNumContrato().longValue() == -999) {
            conditions += " AND FLU_NUM_CONTRATO IS NULL";
        } else if (this.getFluNumContrato() != null) {
            conditions += " AND FLU_NUM_CONTRATO = ?";
            values.add(this.getFluNumContrato());
        }

        if (this.getFluIdCtoDeriva() != null && "null".equals(this.getFluIdCtoDeriva())) {
            conditions += " AND FLU_ID_CTO_DERIVA IS NULL";
        } else if (this.getFluIdCtoDeriva() != null) {
            conditions += " AND FLU_ID_CTO_DERIVA = ?";
            values.add(this.getFluIdCtoDeriva());
        }

        if (this.getFluNumMovimiento() != null && this.getFluNumMovimiento().longValue() == -999) {
            conditions += " AND FLU_NUM_MOVIMIENTO IS NULL";
        } else if (this.getFluNumMovimiento() != null) {
            conditions += " AND FLU_NUM_MOVIMIENTO = ?";
            values.add(this.getFluNumMovimiento());
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
        String sql = "SELECT * FROM FLUJOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFluNumContrato() != null && this.getFluNumContrato().longValue() == -999) {
            conditions += " AND FLU_NUM_CONTRATO IS NULL";
        } else if (this.getFluNumContrato() != null) {
            conditions += " AND FLU_NUM_CONTRATO = ?";
            values.add(this.getFluNumContrato());
        }

        if (this.getFluIdCtoDeriva() != null && "null".equals(this.getFluIdCtoDeriva())) {
            conditions += " AND FLU_ID_CTO_DERIVA IS NULL";
        } else if (this.getFluIdCtoDeriva() != null) {
            conditions += " AND FLU_ID_CTO_DERIVA = ?";
            values.add(this.getFluIdCtoDeriva());
        }

        if (this.getFluNumMovimiento() != null && this.getFluNumMovimiento().longValue() == -999) {
            conditions += " AND FLU_NUM_MOVIMIENTO IS NULL";
        } else if (this.getFluNumMovimiento() != null) {
            conditions += " AND FLU_NUM_MOVIMIENTO = ?";
            values.add(this.getFluNumMovimiento());
        }

        if (this.getFluIdComprobante() != null && "null".equals(this.getFluIdComprobante())) {
            conditions += " AND FLU_ID_COMPROBANTE IS NULL";
        } else if (this.getFluIdComprobante() != null) {
            conditions += " AND FLU_ID_COMPROBANTE = ?";
            values.add(this.getFluIdComprobante());
        }

        if (this.getFluDescMovim() != null && "null".equals(this.getFluDescMovim())) {
            conditions += " AND FLU_DESC_MOVIM IS NULL";
        } else if (this.getFluDescMovim() != null) {
            conditions += " AND FLU_DESC_MOVIM = ?";
            values.add(this.getFluDescMovim());
        }

        if (this.getFluCveMovim() != null && "null".equals(this.getFluCveMovim())) {
            conditions += " AND FLU_CVE_MOVIM IS NULL";
        } else if (this.getFluCveMovim() != null) {
            conditions += " AND FLU_CVE_MOVIM = ?";
            values.add(this.getFluCveMovim());
        }

        if (this.getFluImpMovim() != null && this.getFluImpMovim().longValue() == -999) {
            conditions += " AND FLU_IMP_MOVIM IS NULL";
        } else if (this.getFluImpMovim() != null) {
            conditions += " AND FLU_IMP_MOVIM = ?";
            values.add(this.getFluImpMovim());
        }

        if (this.getFluAnoMovim() != null && this.getFluAnoMovim().longValue() == -999) {
            conditions += " AND FLU_ANO_MOVIM IS NULL";
        } else if (this.getFluAnoMovim() != null) {
            conditions += " AND FLU_ANO_MOVIM = ?";
            values.add(this.getFluAnoMovim());
        }

        if (this.getFluMesMovim() != null && this.getFluMesMovim().longValue() == -999) {
            conditions += " AND FLU_MES_MOVIM IS NULL";
        } else if (this.getFluMesMovim() != null) {
            conditions += " AND FLU_MES_MOVIM = ?";
            values.add(this.getFluMesMovim());
        }

        if (this.getFluDiaMovim() != null && this.getFluDiaMovim().longValue() == -999) {
            conditions += " AND FLU_DIA_MOVIM IS NULL";
        } else if (this.getFluDiaMovim() != null) {
            conditions += " AND FLU_DIA_MOVIM = ?";
            values.add(this.getFluDiaMovim());
        }

        if (this.getFluAnoAltaReg() != null && this.getFluAnoAltaReg().longValue() == -999) {
            conditions += " AND FLU_ANO_ALTA_REG IS NULL";
        } else if (this.getFluAnoAltaReg() != null) {
            conditions += " AND FLU_ANO_ALTA_REG = ?";
            values.add(this.getFluAnoAltaReg());
        }

        if (this.getFluMesAltaReg() != null && this.getFluMesAltaReg().longValue() == -999) {
            conditions += " AND FLU_MES_ALTA_REG IS NULL";
        } else if (this.getFluMesAltaReg() != null) {
            conditions += " AND FLU_MES_ALTA_REG = ?";
            values.add(this.getFluMesAltaReg());
        }

        if (this.getFluDiaAltaReg() != null && this.getFluDiaAltaReg().longValue() == -999) {
            conditions += " AND FLU_DIA_ALTA_REG IS NULL";
        } else if (this.getFluDiaAltaReg() != null) {
            conditions += " AND FLU_DIA_ALTA_REG = ?";
            values.add(this.getFluDiaAltaReg());
        }

        if (this.getFluAnoUltMod() != null && this.getFluAnoUltMod().longValue() == -999) {
            conditions += " AND FLU_ANO_ULT_MOD IS NULL";
        } else if (this.getFluAnoUltMod() != null) {
            conditions += " AND FLU_ANO_ULT_MOD = ?";
            values.add(this.getFluAnoUltMod());
        }

        if (this.getFluMesUltMod() != null && this.getFluMesUltMod().longValue() == -999) {
            conditions += " AND FLU_MES_ULT_MOD IS NULL";
        } else if (this.getFluMesUltMod() != null) {
            conditions += " AND FLU_MES_ULT_MOD = ?";
            values.add(this.getFluMesUltMod());
        }

        if (this.getFluDiaUltMod() != null && this.getFluDiaUltMod().longValue() == -999) {
            conditions += " AND FLU_DIA_ULT_MOD IS NULL";
        } else if (this.getFluDiaUltMod() != null) {
            conditions += " AND FLU_DIA_ULT_MOD = ?";
            values.add(this.getFluDiaUltMod());
        }

        if (this.getFluCveStFlujos() != null && "null".equals(this.getFluCveStFlujos())) {
            conditions += " AND FLU_CVE_ST_FLUJOS IS NULL";
        } else if (this.getFluCveStFlujos() != null) {
            conditions += " AND FLU_CVE_ST_FLUJOS = ?";
            values.add(this.getFluCveStFlujos());
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
        String sql = "UPDATE FLUJOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FLU_NUM_CONTRATO = ?";
        pkValues.add(this.getFluNumContrato());
        conditions += " AND FLU_ID_CTO_DERIVA = ?";
        pkValues.add(this.getFluIdCtoDeriva());
        conditions += " AND FLU_NUM_MOVIMIENTO = ?";
        pkValues.add(this.getFluNumMovimiento());
        fields += " FLU_ID_COMPROBANTE = ?, ";
        values.add(this.getFluIdComprobante());
        fields += " FLU_DESC_MOVIM = ?, ";
        values.add(this.getFluDescMovim());
        fields += " FLU_CVE_MOVIM = ?, ";
        values.add(this.getFluCveMovim());
        fields += " FLU_IMP_MOVIM = ?, ";
        values.add(this.getFluImpMovim());
        fields += " FLU_ANO_MOVIM = ?, ";
        values.add(this.getFluAnoMovim());
        fields += " FLU_MES_MOVIM = ?, ";
        values.add(this.getFluMesMovim());
        fields += " FLU_DIA_MOVIM = ?, ";
        values.add(this.getFluDiaMovim());
        fields += " FLU_ANO_ALTA_REG = ?, ";
        values.add(this.getFluAnoAltaReg());
        fields += " FLU_MES_ALTA_REG = ?, ";
        values.add(this.getFluMesAltaReg());
        fields += " FLU_DIA_ALTA_REG = ?, ";
        values.add(this.getFluDiaAltaReg());
        fields += " FLU_ANO_ULT_MOD = ?, ";
        values.add(this.getFluAnoUltMod());
        fields += " FLU_MES_ULT_MOD = ?, ";
        values.add(this.getFluMesUltMod());
        fields += " FLU_DIA_ULT_MOD = ?, ";
        values.add(this.getFluDiaUltMod());
        fields += " FLU_CVE_ST_FLUJOS = ?, ";
        values.add(this.getFluCveStFlujos());
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
        String sql = "INSERT INTO FLUJOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FLU_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFluNumContrato());

        fields += ", FLU_ID_CTO_DERIVA";
        fieldValues += ", ?";
        values.add(this.getFluIdCtoDeriva());

        fields += ", FLU_NUM_MOVIMIENTO";
        fieldValues += ", ?";
        values.add(this.getFluNumMovimiento());

        fields += ", FLU_ID_COMPROBANTE";
        fieldValues += ", ?";
        values.add(this.getFluIdComprobante());

        fields += ", FLU_DESC_MOVIM";
        fieldValues += ", ?";
        values.add(this.getFluDescMovim());

        fields += ", FLU_CVE_MOVIM";
        fieldValues += ", ?";
        values.add(this.getFluCveMovim());

        fields += ", FLU_IMP_MOVIM";
        fieldValues += ", ?";
        values.add(this.getFluImpMovim());

        fields += ", FLU_ANO_MOVIM";
        fieldValues += ", ?";
        values.add(this.getFluAnoMovim());

        fields += ", FLU_MES_MOVIM";
        fieldValues += ", ?";
        values.add(this.getFluMesMovim());

        fields += ", FLU_DIA_MOVIM";
        fieldValues += ", ?";
        values.add(this.getFluDiaMovim());

        fields += ", FLU_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFluAnoAltaReg());

        fields += ", FLU_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFluMesAltaReg());

        fields += ", FLU_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFluDiaAltaReg());

        fields += ", FLU_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFluAnoUltMod());

        fields += ", FLU_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFluMesUltMod());

        fields += ", FLU_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFluDiaUltMod());

        fields += ", FLU_CVE_ST_FLUJOS";
        fieldValues += ", ?";
        values.add(this.getFluCveStFlujos());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FLUJOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FLU_NUM_CONTRATO = ?";
        values.add(this.getFluNumContrato());
        conditions += " AND FLU_ID_CTO_DERIVA = ?";
        values.add(this.getFluIdCtoDeriva());
        conditions += " AND FLU_NUM_MOVIMIENTO = ?";
        values.add(this.getFluNumMovimiento());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Flujos instance = (Flujos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFluNumContrato().equals(instance.getFluNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFluIdCtoDeriva().equals(instance.getFluIdCtoDeriva()))
            equalObjects = false;
        if (equalObjects && !this.getFluNumMovimiento().equals(instance.getFluNumMovimiento()))
            equalObjects = false;
        if (equalObjects && !this.getFluIdComprobante().equals(instance.getFluIdComprobante()))
            equalObjects = false;
        if (equalObjects && !this.getFluDescMovim().equals(instance.getFluDescMovim()))
            equalObjects = false;
        if (equalObjects && !this.getFluCveMovim().equals(instance.getFluCveMovim()))
            equalObjects = false;
        if (equalObjects && !this.getFluImpMovim().equals(instance.getFluImpMovim()))
            equalObjects = false;
        if (equalObjects && !this.getFluAnoMovim().equals(instance.getFluAnoMovim()))
            equalObjects = false;
        if (equalObjects && !this.getFluMesMovim().equals(instance.getFluMesMovim()))
            equalObjects = false;
        if (equalObjects && !this.getFluDiaMovim().equals(instance.getFluDiaMovim()))
            equalObjects = false;
        if (equalObjects && !this.getFluAnoAltaReg().equals(instance.getFluAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFluMesAltaReg().equals(instance.getFluMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFluDiaAltaReg().equals(instance.getFluDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFluAnoUltMod().equals(instance.getFluAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFluMesUltMod().equals(instance.getFluMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFluDiaUltMod().equals(instance.getFluDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFluCveStFlujos().equals(instance.getFluCveStFlujos()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Flujos result = new Flujos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFluNumContrato((BigDecimal) objectData.getData("FLU_NUM_CONTRATO"));
        result.setFluIdCtoDeriva((String) objectData.getData("FLU_ID_CTO_DERIVA"));
        result.setFluNumMovimiento((BigDecimal) objectData.getData("FLU_NUM_MOVIMIENTO"));
        result.setFluIdComprobante((String) objectData.getData("FLU_ID_COMPROBANTE"));
        result.setFluDescMovim((String) objectData.getData("FLU_DESC_MOVIM"));
        result.setFluCveMovim((String) objectData.getData("FLU_CVE_MOVIM"));
        result.setFluImpMovim((BigDecimal) objectData.getData("FLU_IMP_MOVIM"));
        result.setFluAnoMovim((BigDecimal) objectData.getData("FLU_ANO_MOVIM"));
        result.setFluMesMovim((BigDecimal) objectData.getData("FLU_MES_MOVIM"));
        result.setFluDiaMovim((BigDecimal) objectData.getData("FLU_DIA_MOVIM"));
        result.setFluAnoAltaReg((BigDecimal) objectData.getData("FLU_ANO_ALTA_REG"));
        result.setFluMesAltaReg((BigDecimal) objectData.getData("FLU_MES_ALTA_REG"));
        result.setFluDiaAltaReg((BigDecimal) objectData.getData("FLU_DIA_ALTA_REG"));
        result.setFluAnoUltMod((BigDecimal) objectData.getData("FLU_ANO_ULT_MOD"));
        result.setFluMesUltMod((BigDecimal) objectData.getData("FLU_MES_ULT_MOD"));
        result.setFluDiaUltMod((BigDecimal) objectData.getData("FLU_DIA_ULT_MOD"));
        result.setFluCveStFlujos((String) objectData.getData("FLU_CVE_ST_FLUJOS"));

        return result;

    }

}
