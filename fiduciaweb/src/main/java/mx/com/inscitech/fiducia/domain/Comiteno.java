package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "COMITENO_PK", columns = { "CON_NUM_CONTRATO" }, sequences = { "MAX" })
public class Comiteno extends DomainObject {

    BigDecimal conNumContrato = null;
    String conNomComite = null;
    String conFinalidComite = null;
    String conComComite = null;
    BigDecimal conAnoConst = null;
    BigDecimal conMesConst = null;
    BigDecimal conDiaConst = null;
    BigDecimal conAnoAltaReg = null;
    BigDecimal conMesAltaReg = null;
    BigDecimal conDiaAltaReg = null;
    BigDecimal conAnoUltMod = null;
    BigDecimal conMesUltMod = null;
    BigDecimal conDiaUltMod = null;
    String conCveStComite = null;
    String conIntComite = null;

    public Comiteno() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConNumContrato(BigDecimal conNumContrato) {
        this.conNumContrato = conNumContrato;
    }

    public BigDecimal getConNumContrato() {
        return this.conNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConNomComite(String conNomComite) {
        this.conNomComite = conNomComite;
    }

    public String getConNomComite() {
        return this.conNomComite;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setConFinalidComite(String conFinalidComite) {
        this.conFinalidComite = conFinalidComite;
    }

    public String getConFinalidComite() {
        return this.conFinalidComite;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConComComite(String conComComite) {
        this.conComComite = conComComite;
    }

    public String getConComComite() {
        return this.conComComite;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setConAnoConst(BigDecimal conAnoConst) {
        this.conAnoConst = conAnoConst;
    }

    public BigDecimal getConAnoConst() {
        return this.conAnoConst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setConMesConst(BigDecimal conMesConst) {
        this.conMesConst = conMesConst;
    }

    public BigDecimal getConMesConst() {
        return this.conMesConst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setConDiaConst(BigDecimal conDiaConst) {
        this.conDiaConst = conDiaConst;
    }

    public BigDecimal getConDiaConst() {
        return this.conDiaConst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setConAnoAltaReg(BigDecimal conAnoAltaReg) {
        this.conAnoAltaReg = conAnoAltaReg;
    }

    public BigDecimal getConAnoAltaReg() {
        return this.conAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setConMesAltaReg(BigDecimal conMesAltaReg) {
        this.conMesAltaReg = conMesAltaReg;
    }

    public BigDecimal getConMesAltaReg() {
        return this.conMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setConDiaAltaReg(BigDecimal conDiaAltaReg) {
        this.conDiaAltaReg = conDiaAltaReg;
    }

    public BigDecimal getConDiaAltaReg() {
        return this.conDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setConAnoUltMod(BigDecimal conAnoUltMod) {
        this.conAnoUltMod = conAnoUltMod;
    }

    public BigDecimal getConAnoUltMod() {
        return this.conAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setConMesUltMod(BigDecimal conMesUltMod) {
        this.conMesUltMod = conMesUltMod;
    }

    public BigDecimal getConMesUltMod() {
        return this.conMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setConDiaUltMod(BigDecimal conDiaUltMod) {
        this.conDiaUltMod = conDiaUltMod;
    }

    public BigDecimal getConDiaUltMod() {
        return this.conDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConCveStComite(String conCveStComite) {
        this.conCveStComite = conCveStComite;
    }

    public String getConCveStComite() {
        return this.conCveStComite;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConIntComite(String conIntComite) {
        this.conIntComite = conIntComite;
    }

    public String getConIntComite() {
        return this.conIntComite;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM COMITENO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getConNumContrato() != null && this.getConNumContrato().longValue() == -999) {
            conditions += " AND CON_NUM_CONTRATO IS NULL";
        } else if (this.getConNumContrato() != null) {
            conditions += " AND CON_NUM_CONTRATO = ?";
            values.add(this.getConNumContrato());
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
        String sql = "SELECT * FROM COMITENO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getConNumContrato() != null && this.getConNumContrato().longValue() == -999) {
            conditions += " AND CON_NUM_CONTRATO IS NULL";
        } else if (this.getConNumContrato() != null) {
            conditions += " AND CON_NUM_CONTRATO = ?";
            values.add(this.getConNumContrato());
        }

        if (this.getConNomComite() != null && "null".equals(this.getConNomComite())) {
            conditions += " AND CON_NOM_COMITE IS NULL";
        } else if (this.getConNomComite() != null) {
            conditions += " AND CON_NOM_COMITE = ?";
            values.add(this.getConNomComite());
        }

        if (this.getConFinalidComite() != null && "null".equals(this.getConFinalidComite())) {
            conditions += " AND CON_FINALID_COMITE IS NULL";
        } else if (this.getConFinalidComite() != null) {
            conditions += " AND CON_FINALID_COMITE = ?";
            values.add(this.getConFinalidComite());
        }

        if (this.getConComComite() != null && "null".equals(this.getConComComite())) {
            conditions += " AND CON_COM_COMITE IS NULL";
        } else if (this.getConComComite() != null) {
            conditions += " AND CON_COM_COMITE = ?";
            values.add(this.getConComComite());
        }

        if (this.getConAnoConst() != null && this.getConAnoConst().longValue() == -999) {
            conditions += " AND CON_ANO_CONST IS NULL";
        } else if (this.getConAnoConst() != null) {
            conditions += " AND CON_ANO_CONST = ?";
            values.add(this.getConAnoConst());
        }

        if (this.getConMesConst() != null && this.getConMesConst().longValue() == -999) {
            conditions += " AND CON_MES_CONST IS NULL";
        } else if (this.getConMesConst() != null) {
            conditions += " AND CON_MES_CONST = ?";
            values.add(this.getConMesConst());
        }

        if (this.getConDiaConst() != null && this.getConDiaConst().longValue() == -999) {
            conditions += " AND CON_DIA_CONST IS NULL";
        } else if (this.getConDiaConst() != null) {
            conditions += " AND CON_DIA_CONST = ?";
            values.add(this.getConDiaConst());
        }

        if (this.getConAnoAltaReg() != null && this.getConAnoAltaReg().longValue() == -999) {
            conditions += " AND CON_ANO_ALTA_REG IS NULL";
        } else if (this.getConAnoAltaReg() != null) {
            conditions += " AND CON_ANO_ALTA_REG = ?";
            values.add(this.getConAnoAltaReg());
        }

        if (this.getConMesAltaReg() != null && this.getConMesAltaReg().longValue() == -999) {
            conditions += " AND CON_MES_ALTA_REG IS NULL";
        } else if (this.getConMesAltaReg() != null) {
            conditions += " AND CON_MES_ALTA_REG = ?";
            values.add(this.getConMesAltaReg());
        }

        if (this.getConDiaAltaReg() != null && this.getConDiaAltaReg().longValue() == -999) {
            conditions += " AND CON_DIA_ALTA_REG IS NULL";
        } else if (this.getConDiaAltaReg() != null) {
            conditions += " AND CON_DIA_ALTA_REG = ?";
            values.add(this.getConDiaAltaReg());
        }

        if (this.getConAnoUltMod() != null && this.getConAnoUltMod().longValue() == -999) {
            conditions += " AND CON_ANO_ULT_MOD IS NULL";
        } else if (this.getConAnoUltMod() != null) {
            conditions += " AND CON_ANO_ULT_MOD = ?";
            values.add(this.getConAnoUltMod());
        }

        if (this.getConMesUltMod() != null && this.getConMesUltMod().longValue() == -999) {
            conditions += " AND CON_MES_ULT_MOD IS NULL";
        } else if (this.getConMesUltMod() != null) {
            conditions += " AND CON_MES_ULT_MOD = ?";
            values.add(this.getConMesUltMod());
        }

        if (this.getConDiaUltMod() != null && this.getConDiaUltMod().longValue() == -999) {
            conditions += " AND CON_DIA_ULT_MOD IS NULL";
        } else if (this.getConDiaUltMod() != null) {
            conditions += " AND CON_DIA_ULT_MOD = ?";
            values.add(this.getConDiaUltMod());
        }

        if (this.getConCveStComite() != null && "null".equals(this.getConCveStComite())) {
            conditions += " AND CON_CVE_ST_COMITE IS NULL";
        } else if (this.getConCveStComite() != null) {
            conditions += " AND CON_CVE_ST_COMITE = ?";
            values.add(this.getConCveStComite());
        }

        if (this.getConIntComite() != null && "null".equals(this.getConIntComite())) {
            conditions += " AND CON_INT_COMITE IS NULL";
        } else if (this.getConIntComite() != null) {
            conditions += " AND CON_INT_COMITE = ?";
            values.add(this.getConIntComite());
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
        String sql = "UPDATE COMITENO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CON_NUM_CONTRATO = ?";
        pkValues.add(this.getConNumContrato());
        fields += " CON_NOM_COMITE = ?, ";
        values.add(this.getConNomComite());
        fields += " CON_FINALID_COMITE = ?, ";
        values.add(this.getConFinalidComite());
        fields += " CON_COM_COMITE = ?, ";
        values.add(this.getConComComite());
        fields += " CON_ANO_CONST = ?, ";
        values.add(this.getConAnoConst());
        fields += " CON_MES_CONST = ?, ";
        values.add(this.getConMesConst());
        fields += " CON_DIA_CONST = ?, ";
        values.add(this.getConDiaConst());
        fields += " CON_ANO_ALTA_REG = ?, ";
        values.add(this.getConAnoAltaReg());
        fields += " CON_MES_ALTA_REG = ?, ";
        values.add(this.getConMesAltaReg());
        fields += " CON_DIA_ALTA_REG = ?, ";
        values.add(this.getConDiaAltaReg());
        fields += " CON_ANO_ULT_MOD = ?, ";
        values.add(this.getConAnoUltMod());
        fields += " CON_MES_ULT_MOD = ?, ";
        values.add(this.getConMesUltMod());
        fields += " CON_DIA_ULT_MOD = ?, ";
        values.add(this.getConDiaUltMod());
        fields += " CON_CVE_ST_COMITE = ?, ";
        values.add(this.getConCveStComite());
        fields += " CON_INT_COMITE = ?, ";
        values.add(this.getConIntComite());
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
        String sql = "INSERT INTO COMITENO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CON_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getConNumContrato());

        fields += ", CON_NOM_COMITE";
        fieldValues += ", ?";
        values.add(this.getConNomComite());

        fields += ", CON_FINALID_COMITE";
        fieldValues += ", ?";
        values.add(this.getConFinalidComite());

        fields += ", CON_COM_COMITE";
        fieldValues += ", ?";
        values.add(this.getConComComite());

        fields += ", CON_ANO_CONST";
        fieldValues += ", ?";
        values.add(this.getConAnoConst());

        fields += ", CON_MES_CONST";
        fieldValues += ", ?";
        values.add(this.getConMesConst());

        fields += ", CON_DIA_CONST";
        fieldValues += ", ?";
        values.add(this.getConDiaConst());

        fields += ", CON_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getConAnoAltaReg());

        fields += ", CON_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getConMesAltaReg());

        fields += ", CON_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getConDiaAltaReg());

        fields += ", CON_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getConAnoUltMod());

        fields += ", CON_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getConMesUltMod());

        fields += ", CON_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getConDiaUltMod());

        fields += ", CON_CVE_ST_COMITE";
        fieldValues += ", ?";
        values.add(this.getConCveStComite());

        fields += ", CON_INT_COMITE";
        fieldValues += ", ?";
        values.add(this.getConIntComite());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM COMITENO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CON_NUM_CONTRATO = ?";
        values.add(this.getConNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Comiteno instance = (Comiteno) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getConNumContrato().equals(instance.getConNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getConNomComite().equals(instance.getConNomComite()))
            equalObjects = false;
        if (equalObjects && !this.getConFinalidComite().equals(instance.getConFinalidComite()))
            equalObjects = false;
        if (equalObjects && !this.getConComComite().equals(instance.getConComComite()))
            equalObjects = false;
        if (equalObjects && !this.getConAnoConst().equals(instance.getConAnoConst()))
            equalObjects = false;
        if (equalObjects && !this.getConMesConst().equals(instance.getConMesConst()))
            equalObjects = false;
        if (equalObjects && !this.getConDiaConst().equals(instance.getConDiaConst()))
            equalObjects = false;
        if (equalObjects && !this.getConAnoAltaReg().equals(instance.getConAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getConMesAltaReg().equals(instance.getConMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getConDiaAltaReg().equals(instance.getConDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getConAnoUltMod().equals(instance.getConAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getConMesUltMod().equals(instance.getConMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getConDiaUltMod().equals(instance.getConDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getConCveStComite().equals(instance.getConCveStComite()))
            equalObjects = false;
        if (equalObjects && !this.getConIntComite().equals(instance.getConIntComite()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Comiteno result = new Comiteno();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setConNumContrato((BigDecimal) objectData.getData("CON_NUM_CONTRATO"));
        result.setConNomComite((String) objectData.getData("CON_NOM_COMITE"));
        result.setConFinalidComite((String) objectData.getData("CON_FINALID_COMITE"));
        result.setConComComite((String) objectData.getData("CON_COM_COMITE"));
        result.setConAnoConst((BigDecimal) objectData.getData("CON_ANO_CONST"));
        result.setConMesConst((BigDecimal) objectData.getData("CON_MES_CONST"));
        result.setConDiaConst((BigDecimal) objectData.getData("CON_DIA_CONST"));
        result.setConAnoAltaReg((BigDecimal) objectData.getData("CON_ANO_ALTA_REG"));
        result.setConMesAltaReg((BigDecimal) objectData.getData("CON_MES_ALTA_REG"));
        result.setConDiaAltaReg((BigDecimal) objectData.getData("CON_DIA_ALTA_REG"));
        result.setConAnoUltMod((BigDecimal) objectData.getData("CON_ANO_ULT_MOD"));
        result.setConMesUltMod((BigDecimal) objectData.getData("CON_MES_ULT_MOD"));
        result.setConDiaUltMod((BigDecimal) objectData.getData("CON_DIA_ULT_MOD"));
        result.setConCveStComite((String) objectData.getData("CON_CVE_ST_COMITE"));
        result.setConIntComite((String) objectData.getData("CON_INT_COMITE"));

        return result;

    }

}
