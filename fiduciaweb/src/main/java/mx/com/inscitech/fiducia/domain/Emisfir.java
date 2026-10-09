package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISFIR_PK", columns = { "EMF_NUM_PROGRAMA", "EMF_NUM_EMISION", "EMF_NUM_SEC_CALC" }, sequences = { "MANUAL" })
public class Emisfir extends DomainObject {

    BigDecimal emfNumPrograma = null;
    BigDecimal emfNumEmision = null;
    BigDecimal emfNumSecCalc = null;
    String emfElaboro = null;
    String emfFirmaVobo = null;
    BigDecimal emfAnoAltaReg = null;
    BigDecimal emfMesAltaReg = null;
    BigDecimal emfDiaAltaReg = null;
    BigDecimal emfAnoUltMod = null;
    BigDecimal emfMesUltMod = null;
    BigDecimal emfDiaUltMod = null;
    String emfCveStEmisfir = null;

    public Emisfir() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmfNumPrograma(BigDecimal emfNumPrograma) {
        this.emfNumPrograma = emfNumPrograma;
    }

    public BigDecimal getEmfNumPrograma() {
        return this.emfNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmfNumEmision(BigDecimal emfNumEmision) {
        this.emfNumEmision = emfNumEmision;
    }

    public BigDecimal getEmfNumEmision() {
        return this.emfNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmfNumSecCalc(BigDecimal emfNumSecCalc) {
        this.emfNumSecCalc = emfNumSecCalc;
    }

    public BigDecimal getEmfNumSecCalc() {
        return this.emfNumSecCalc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmfElaboro(String emfElaboro) {
        this.emfElaboro = emfElaboro;
    }

    public String getEmfElaboro() {
        return this.emfElaboro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmfFirmaVobo(String emfFirmaVobo) {
        this.emfFirmaVobo = emfFirmaVobo;
    }

    public String getEmfFirmaVobo() {
        return this.emfFirmaVobo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmfAnoAltaReg(BigDecimal emfAnoAltaReg) {
        this.emfAnoAltaReg = emfAnoAltaReg;
    }

    public BigDecimal getEmfAnoAltaReg() {
        return this.emfAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmfMesAltaReg(BigDecimal emfMesAltaReg) {
        this.emfMesAltaReg = emfMesAltaReg;
    }

    public BigDecimal getEmfMesAltaReg() {
        return this.emfMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmfDiaAltaReg(BigDecimal emfDiaAltaReg) {
        this.emfDiaAltaReg = emfDiaAltaReg;
    }

    public BigDecimal getEmfDiaAltaReg() {
        return this.emfDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmfAnoUltMod(BigDecimal emfAnoUltMod) {
        this.emfAnoUltMod = emfAnoUltMod;
    }

    public BigDecimal getEmfAnoUltMod() {
        return this.emfAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmfMesUltMod(BigDecimal emfMesUltMod) {
        this.emfMesUltMod = emfMesUltMod;
    }

    public BigDecimal getEmfMesUltMod() {
        return this.emfMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmfDiaUltMod(BigDecimal emfDiaUltMod) {
        this.emfDiaUltMod = emfDiaUltMod;
    }

    public BigDecimal getEmfDiaUltMod() {
        return this.emfDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmfCveStEmisfir(String emfCveStEmisfir) {
        this.emfCveStEmisfir = emfCveStEmisfir;
    }

    public String getEmfCveStEmisfir() {
        return this.emfCveStEmisfir;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISFIR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEmfNumPrograma() != null && this.getEmfNumPrograma().longValue() == -999) {
            conditions += " AND EMF_NUM_PROGRAMA IS NULL";
        } else if (this.getEmfNumPrograma() != null) {
            conditions += " AND EMF_NUM_PROGRAMA = ?";
            values.add(this.getEmfNumPrograma());
        }

        if (this.getEmfNumEmision() != null && this.getEmfNumEmision().longValue() == -999) {
            conditions += " AND EMF_NUM_EMISION IS NULL";
        } else if (this.getEmfNumEmision() != null) {
            conditions += " AND EMF_NUM_EMISION = ?";
            values.add(this.getEmfNumEmision());
        }

        if (this.getEmfNumSecCalc() != null && this.getEmfNumSecCalc().longValue() == -999) {
            conditions += " AND EMF_NUM_SEC_CALC IS NULL";
        } else if (this.getEmfNumSecCalc() != null) {
            conditions += " AND EMF_NUM_SEC_CALC = ?";
            values.add(this.getEmfNumSecCalc());
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
        String sql = "SELECT * FROM EMISFIR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEmfNumPrograma() != null && this.getEmfNumPrograma().longValue() == -999) {
            conditions += " AND EMF_NUM_PROGRAMA IS NULL";
        } else if (this.getEmfNumPrograma() != null) {
            conditions += " AND EMF_NUM_PROGRAMA = ?";
            values.add(this.getEmfNumPrograma());
        }

        if (this.getEmfNumEmision() != null && this.getEmfNumEmision().longValue() == -999) {
            conditions += " AND EMF_NUM_EMISION IS NULL";
        } else if (this.getEmfNumEmision() != null) {
            conditions += " AND EMF_NUM_EMISION = ?";
            values.add(this.getEmfNumEmision());
        }

        if (this.getEmfNumSecCalc() != null && this.getEmfNumSecCalc().longValue() == -999) {
            conditions += " AND EMF_NUM_SEC_CALC IS NULL";
        } else if (this.getEmfNumSecCalc() != null) {
            conditions += " AND EMF_NUM_SEC_CALC = ?";
            values.add(this.getEmfNumSecCalc());
        }

        if (this.getEmfElaboro() != null && "null".equals(this.getEmfElaboro())) {
            conditions += " AND EMF_ELABORO IS NULL";
        } else if (this.getEmfElaboro() != null) {
            conditions += " AND EMF_ELABORO = ?";
            values.add(this.getEmfElaboro());
        }

        if (this.getEmfFirmaVobo() != null && "null".equals(this.getEmfFirmaVobo())) {
            conditions += " AND EMF_FIRMA_VOBO IS NULL";
        } else if (this.getEmfFirmaVobo() != null) {
            conditions += " AND EMF_FIRMA_VOBO = ?";
            values.add(this.getEmfFirmaVobo());
        }

        if (this.getEmfAnoAltaReg() != null && this.getEmfAnoAltaReg().longValue() == -999) {
            conditions += " AND EMF_ANO_ALTA_REG IS NULL";
        } else if (this.getEmfAnoAltaReg() != null) {
            conditions += " AND EMF_ANO_ALTA_REG = ?";
            values.add(this.getEmfAnoAltaReg());
        }

        if (this.getEmfMesAltaReg() != null && this.getEmfMesAltaReg().longValue() == -999) {
            conditions += " AND EMF_MES_ALTA_REG IS NULL";
        } else if (this.getEmfMesAltaReg() != null) {
            conditions += " AND EMF_MES_ALTA_REG = ?";
            values.add(this.getEmfMesAltaReg());
        }

        if (this.getEmfDiaAltaReg() != null && this.getEmfDiaAltaReg().longValue() == -999) {
            conditions += " AND EMF_DIA_ALTA_REG IS NULL";
        } else if (this.getEmfDiaAltaReg() != null) {
            conditions += " AND EMF_DIA_ALTA_REG = ?";
            values.add(this.getEmfDiaAltaReg());
        }

        if (this.getEmfAnoUltMod() != null && this.getEmfAnoUltMod().longValue() == -999) {
            conditions += " AND EMF_ANO_ULT_MOD IS NULL";
        } else if (this.getEmfAnoUltMod() != null) {
            conditions += " AND EMF_ANO_ULT_MOD = ?";
            values.add(this.getEmfAnoUltMod());
        }

        if (this.getEmfMesUltMod() != null && this.getEmfMesUltMod().longValue() == -999) {
            conditions += " AND EMF_MES_ULT_MOD IS NULL";
        } else if (this.getEmfMesUltMod() != null) {
            conditions += " AND EMF_MES_ULT_MOD = ?";
            values.add(this.getEmfMesUltMod());
        }

        if (this.getEmfDiaUltMod() != null && this.getEmfDiaUltMod().longValue() == -999) {
            conditions += " AND EMF_DIA_ULT_MOD IS NULL";
        } else if (this.getEmfDiaUltMod() != null) {
            conditions += " AND EMF_DIA_ULT_MOD = ?";
            values.add(this.getEmfDiaUltMod());
        }

        if (this.getEmfCveStEmisfir() != null && "null".equals(this.getEmfCveStEmisfir())) {
            conditions += " AND EMF_CVE_ST_EMISFIR IS NULL";
        } else if (this.getEmfCveStEmisfir() != null) {
            conditions += " AND EMF_CVE_ST_EMISFIR = ?";
            values.add(this.getEmfCveStEmisfir());
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
        String sql = "UPDATE EMISFIR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EMF_NUM_PROGRAMA = ?";
        pkValues.add(this.getEmfNumPrograma());
        conditions += " AND EMF_NUM_EMISION = ?";
        pkValues.add(this.getEmfNumEmision());
        conditions += " AND EMF_NUM_SEC_CALC = ?";
        pkValues.add(this.getEmfNumSecCalc());
        fields += " EMF_ELABORO = ?, ";
        values.add(this.getEmfElaboro());
        fields += " EMF_FIRMA_VOBO = ?, ";
        values.add(this.getEmfFirmaVobo());
        fields += " EMF_ANO_ALTA_REG = ?, ";
        values.add(this.getEmfAnoAltaReg());
        fields += " EMF_MES_ALTA_REG = ?, ";
        values.add(this.getEmfMesAltaReg());
        fields += " EMF_DIA_ALTA_REG = ?, ";
        values.add(this.getEmfDiaAltaReg());
        fields += " EMF_ANO_ULT_MOD = ?, ";
        values.add(this.getEmfAnoUltMod());
        fields += " EMF_MES_ULT_MOD = ?, ";
        values.add(this.getEmfMesUltMod());
        fields += " EMF_DIA_ULT_MOD = ?, ";
        values.add(this.getEmfDiaUltMod());
        fields += " EMF_CVE_ST_EMISFIR = ?, ";
        values.add(this.getEmfCveStEmisfir());
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
        String sql = "INSERT INTO EMISFIR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EMF_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEmfNumPrograma());

        fields += ", EMF_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEmfNumEmision());

        fields += ", EMF_NUM_SEC_CALC";
        fieldValues += ", ?";
        values.add(this.getEmfNumSecCalc());

        fields += ", EMF_ELABORO";
        fieldValues += ", ?";
        values.add(this.getEmfElaboro());

        fields += ", EMF_FIRMA_VOBO";
        fieldValues += ", ?";
        values.add(this.getEmfFirmaVobo());

        fields += ", EMF_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmfAnoAltaReg());

        fields += ", EMF_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmfMesAltaReg());

        fields += ", EMF_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmfDiaAltaReg());

        fields += ", EMF_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmfAnoUltMod());

        fields += ", EMF_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmfMesUltMod());

        fields += ", EMF_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmfDiaUltMod());

        fields += ", EMF_CVE_ST_EMISFIR";
        fieldValues += ", ?";
        values.add(this.getEmfCveStEmisfir());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISFIR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EMF_NUM_PROGRAMA = ?";
        values.add(this.getEmfNumPrograma());
        conditions += " AND EMF_NUM_EMISION = ?";
        values.add(this.getEmfNumEmision());
        conditions += " AND EMF_NUM_SEC_CALC = ?";
        values.add(this.getEmfNumSecCalc());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisfir instance = (Emisfir) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEmfNumPrograma().equals(instance.getEmfNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEmfNumEmision().equals(instance.getEmfNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEmfNumSecCalc().equals(instance.getEmfNumSecCalc()))
            equalObjects = false;
        if (equalObjects && !this.getEmfElaboro().equals(instance.getEmfElaboro()))
            equalObjects = false;
        if (equalObjects && !this.getEmfFirmaVobo().equals(instance.getEmfFirmaVobo()))
            equalObjects = false;
        if (equalObjects && !this.getEmfAnoAltaReg().equals(instance.getEmfAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmfMesAltaReg().equals(instance.getEmfMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmfDiaAltaReg().equals(instance.getEmfDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmfAnoUltMod().equals(instance.getEmfAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmfMesUltMod().equals(instance.getEmfMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmfDiaUltMod().equals(instance.getEmfDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmfCveStEmisfir().equals(instance.getEmfCveStEmisfir()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisfir result = new Emisfir();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEmfNumPrograma((BigDecimal) objectData.getData("EMF_NUM_PROGRAMA"));
        result.setEmfNumEmision((BigDecimal) objectData.getData("EMF_NUM_EMISION"));
        result.setEmfNumSecCalc((BigDecimal) objectData.getData("EMF_NUM_SEC_CALC"));
        result.setEmfElaboro((String) objectData.getData("EMF_ELABORO"));
        result.setEmfFirmaVobo((String) objectData.getData("EMF_FIRMA_VOBO"));
        result.setEmfAnoAltaReg((BigDecimal) objectData.getData("EMF_ANO_ALTA_REG"));
        result.setEmfMesAltaReg((BigDecimal) objectData.getData("EMF_MES_ALTA_REG"));
        result.setEmfDiaAltaReg((BigDecimal) objectData.getData("EMF_DIA_ALTA_REG"));
        result.setEmfAnoUltMod((BigDecimal) objectData.getData("EMF_ANO_ULT_MOD"));
        result.setEmfMesUltMod((BigDecimal) objectData.getData("EMF_MES_ULT_MOD"));
        result.setEmfDiaUltMod((BigDecimal) objectData.getData("EMF_DIA_ULT_MOD"));
        result.setEmfCveStEmisfir((String) objectData.getData("EMF_CVE_ST_EMISFIR"));

        return result;

    }

}
