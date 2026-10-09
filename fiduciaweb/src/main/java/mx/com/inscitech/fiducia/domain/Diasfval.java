package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DIASFVAL_PK", columns = { "DFV_NUM_PROGRAMA", "DFV_NUM_EMISION", "DFV_NUM_PAIS" }, sequences = { "MANUAL" })
public class Diasfval extends DomainObject {

    BigDecimal dfvNumPrograma = null;
    BigDecimal dfvNumEmision = null;
    BigDecimal dfvNumPais = null;
    BigDecimal dfvAnoAltaReg = null;
    BigDecimal dfvMesAltaReg = null;
    BigDecimal dfvDiaAltaReg = null;
    BigDecimal dfvAnoUltMod = null;
    BigDecimal dfvMesUltMod = null;
    BigDecimal dfvDiaUltMod = null;
    String dfvCveStDiasfera = null;

    public Diasfval() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDfvNumPrograma(BigDecimal dfvNumPrograma) {
        this.dfvNumPrograma = dfvNumPrograma;
    }

    public BigDecimal getDfvNumPrograma() {
        return this.dfvNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDfvNumEmision(BigDecimal dfvNumEmision) {
        this.dfvNumEmision = dfvNumEmision;
    }

    public BigDecimal getDfvNumEmision() {
        return this.dfvNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDfvNumPais(BigDecimal dfvNumPais) {
        this.dfvNumPais = dfvNumPais;
    }

    public BigDecimal getDfvNumPais() {
        return this.dfvNumPais;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDfvAnoAltaReg(BigDecimal dfvAnoAltaReg) {
        this.dfvAnoAltaReg = dfvAnoAltaReg;
    }

    public BigDecimal getDfvAnoAltaReg() {
        return this.dfvAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfvMesAltaReg(BigDecimal dfvMesAltaReg) {
        this.dfvMesAltaReg = dfvMesAltaReg;
    }

    public BigDecimal getDfvMesAltaReg() {
        return this.dfvMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfvDiaAltaReg(BigDecimal dfvDiaAltaReg) {
        this.dfvDiaAltaReg = dfvDiaAltaReg;
    }

    public BigDecimal getDfvDiaAltaReg() {
        return this.dfvDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDfvAnoUltMod(BigDecimal dfvAnoUltMod) {
        this.dfvAnoUltMod = dfvAnoUltMod;
    }

    public BigDecimal getDfvAnoUltMod() {
        return this.dfvAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfvMesUltMod(BigDecimal dfvMesUltMod) {
        this.dfvMesUltMod = dfvMesUltMod;
    }

    public BigDecimal getDfvMesUltMod() {
        return this.dfvMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfvDiaUltMod(BigDecimal dfvDiaUltMod) {
        this.dfvDiaUltMod = dfvDiaUltMod;
    }

    public BigDecimal getDfvDiaUltMod() {
        return this.dfvDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDfvCveStDiasfera(String dfvCveStDiasfera) {
        this.dfvCveStDiasfera = dfvCveStDiasfera;
    }

    public String getDfvCveStDiasfera() {
        return this.dfvCveStDiasfera;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DIASFVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDfvNumPrograma() != null && this.getDfvNumPrograma().longValue() == -999) {
            conditions += " AND DFV_NUM_PROGRAMA IS NULL";
        } else if (this.getDfvNumPrograma() != null) {
            conditions += " AND DFV_NUM_PROGRAMA = ?";
            values.add(this.getDfvNumPrograma());
        }

        if (this.getDfvNumEmision() != null && this.getDfvNumEmision().longValue() == -999) {
            conditions += " AND DFV_NUM_EMISION IS NULL";
        } else if (this.getDfvNumEmision() != null) {
            conditions += " AND DFV_NUM_EMISION = ?";
            values.add(this.getDfvNumEmision());
        }

        if (this.getDfvNumPais() != null && this.getDfvNumPais().longValue() == -999) {
            conditions += " AND DFV_NUM_PAIS IS NULL";
        } else if (this.getDfvNumPais() != null) {
            conditions += " AND DFV_NUM_PAIS = ?";
            values.add(this.getDfvNumPais());
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
        String sql = "SELECT * FROM DIASFVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDfvNumPrograma() != null && this.getDfvNumPrograma().longValue() == -999) {
            conditions += " AND DFV_NUM_PROGRAMA IS NULL";
        } else if (this.getDfvNumPrograma() != null) {
            conditions += " AND DFV_NUM_PROGRAMA = ?";
            values.add(this.getDfvNumPrograma());
        }

        if (this.getDfvNumEmision() != null && this.getDfvNumEmision().longValue() == -999) {
            conditions += " AND DFV_NUM_EMISION IS NULL";
        } else if (this.getDfvNumEmision() != null) {
            conditions += " AND DFV_NUM_EMISION = ?";
            values.add(this.getDfvNumEmision());
        }

        if (this.getDfvNumPais() != null && this.getDfvNumPais().longValue() == -999) {
            conditions += " AND DFV_NUM_PAIS IS NULL";
        } else if (this.getDfvNumPais() != null) {
            conditions += " AND DFV_NUM_PAIS = ?";
            values.add(this.getDfvNumPais());
        }

        if (this.getDfvAnoAltaReg() != null && this.getDfvAnoAltaReg().longValue() == -999) {
            conditions += " AND DFV_ANO_ALTA_REG IS NULL";
        } else if (this.getDfvAnoAltaReg() != null) {
            conditions += " AND DFV_ANO_ALTA_REG = ?";
            values.add(this.getDfvAnoAltaReg());
        }

        if (this.getDfvMesAltaReg() != null && this.getDfvMesAltaReg().longValue() == -999) {
            conditions += " AND DFV_MES_ALTA_REG IS NULL";
        } else if (this.getDfvMesAltaReg() != null) {
            conditions += " AND DFV_MES_ALTA_REG = ?";
            values.add(this.getDfvMesAltaReg());
        }

        if (this.getDfvDiaAltaReg() != null && this.getDfvDiaAltaReg().longValue() == -999) {
            conditions += " AND DFV_DIA_ALTA_REG IS NULL";
        } else if (this.getDfvDiaAltaReg() != null) {
            conditions += " AND DFV_DIA_ALTA_REG = ?";
            values.add(this.getDfvDiaAltaReg());
        }

        if (this.getDfvAnoUltMod() != null && this.getDfvAnoUltMod().longValue() == -999) {
            conditions += " AND DFV_ANO_ULT_MOD IS NULL";
        } else if (this.getDfvAnoUltMod() != null) {
            conditions += " AND DFV_ANO_ULT_MOD = ?";
            values.add(this.getDfvAnoUltMod());
        }

        if (this.getDfvMesUltMod() != null && this.getDfvMesUltMod().longValue() == -999) {
            conditions += " AND DFV_MES_ULT_MOD IS NULL";
        } else if (this.getDfvMesUltMod() != null) {
            conditions += " AND DFV_MES_ULT_MOD = ?";
            values.add(this.getDfvMesUltMod());
        }

        if (this.getDfvDiaUltMod() != null && this.getDfvDiaUltMod().longValue() == -999) {
            conditions += " AND DFV_DIA_ULT_MOD IS NULL";
        } else if (this.getDfvDiaUltMod() != null) {
            conditions += " AND DFV_DIA_ULT_MOD = ?";
            values.add(this.getDfvDiaUltMod());
        }

        if (this.getDfvCveStDiasfera() != null && "null".equals(this.getDfvCveStDiasfera())) {
            conditions += " AND DFV_CVE_ST_DIASFERA IS NULL";
        } else if (this.getDfvCveStDiasfera() != null) {
            conditions += " AND DFV_CVE_ST_DIASFERA = ?";
            values.add(this.getDfvCveStDiasfera());
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
        String sql = "UPDATE DIASFVAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DFV_NUM_PROGRAMA = ?";
        pkValues.add(this.getDfvNumPrograma());
        conditions += " AND DFV_NUM_EMISION = ?";
        pkValues.add(this.getDfvNumEmision());
        conditions += " AND DFV_NUM_PAIS = ?";
        pkValues.add(this.getDfvNumPais());
        fields += " DFV_ANO_ALTA_REG = ?, ";
        values.add(this.getDfvAnoAltaReg());
        fields += " DFV_MES_ALTA_REG = ?, ";
        values.add(this.getDfvMesAltaReg());
        fields += " DFV_DIA_ALTA_REG = ?, ";
        values.add(this.getDfvDiaAltaReg());
        fields += " DFV_ANO_ULT_MOD = ?, ";
        values.add(this.getDfvAnoUltMod());
        fields += " DFV_MES_ULT_MOD = ?, ";
        values.add(this.getDfvMesUltMod());
        fields += " DFV_DIA_ULT_MOD = ?, ";
        values.add(this.getDfvDiaUltMod());
        fields += " DFV_CVE_ST_DIASFERA = ?, ";
        values.add(this.getDfvCveStDiasfera());
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
        String sql = "INSERT INTO DIASFVAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DFV_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getDfvNumPrograma());

        fields += ", DFV_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getDfvNumEmision());

        fields += ", DFV_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getDfvNumPais());

        fields += ", DFV_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDfvAnoAltaReg());

        fields += ", DFV_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDfvMesAltaReg());

        fields += ", DFV_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDfvDiaAltaReg());

        fields += ", DFV_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDfvAnoUltMod());

        fields += ", DFV_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDfvMesUltMod());

        fields += ", DFV_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDfvDiaUltMod());

        fields += ", DFV_CVE_ST_DIASFERA";
        fieldValues += ", ?";
        values.add(this.getDfvCveStDiasfera());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DIASFVAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DFV_NUM_PROGRAMA = ?";
        values.add(this.getDfvNumPrograma());
        conditions += " AND DFV_NUM_EMISION = ?";
        values.add(this.getDfvNumEmision());
        conditions += " AND DFV_NUM_PAIS = ?";
        values.add(this.getDfvNumPais());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Diasfval instance = (Diasfval) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDfvNumPrograma().equals(instance.getDfvNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getDfvNumEmision().equals(instance.getDfvNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getDfvNumPais().equals(instance.getDfvNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getDfvAnoAltaReg().equals(instance.getDfvAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDfvMesAltaReg().equals(instance.getDfvMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDfvDiaAltaReg().equals(instance.getDfvDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDfvAnoUltMod().equals(instance.getDfvAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDfvMesUltMod().equals(instance.getDfvMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDfvDiaUltMod().equals(instance.getDfvDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDfvCveStDiasfera().equals(instance.getDfvCveStDiasfera()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Diasfval result = new Diasfval();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDfvNumPrograma((BigDecimal) objectData.getData("DFV_NUM_PROGRAMA"));
        result.setDfvNumEmision((BigDecimal) objectData.getData("DFV_NUM_EMISION"));
        result.setDfvNumPais((BigDecimal) objectData.getData("DFV_NUM_PAIS"));
        result.setDfvAnoAltaReg((BigDecimal) objectData.getData("DFV_ANO_ALTA_REG"));
        result.setDfvMesAltaReg((BigDecimal) objectData.getData("DFV_MES_ALTA_REG"));
        result.setDfvDiaAltaReg((BigDecimal) objectData.getData("DFV_DIA_ALTA_REG"));
        result.setDfvAnoUltMod((BigDecimal) objectData.getData("DFV_ANO_ULT_MOD"));
        result.setDfvMesUltMod((BigDecimal) objectData.getData("DFV_MES_ULT_MOD"));
        result.setDfvDiaUltMod((BigDecimal) objectData.getData("DFV_DIA_ULT_MOD"));
        result.setDfvCveStDiasfera((String) objectData.getData("DFV_CVE_ST_DIASFERA"));

        return result;

    }

}
