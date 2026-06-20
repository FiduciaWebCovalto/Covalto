package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SUBCONOM_PK", columns = { "NCO_NUM_CONTRATO", "NCO_NUM_SUBCOMITE" }, sequences = { "MANUAL" })
public class Subconom extends DomainObject {

    BigDecimal ncoNumContrato = null;
    BigDecimal ncoNumSubcomite = null;
    String ncoNomSubcomite = null;
    Long ncoFinalidSubcomite = null;
    String ncoComSubcomite = null;
    BigDecimal ncoAnoConst = null;
    BigDecimal ncoMesConst = null;
    BigDecimal ncoDiaConst = null;
    BigDecimal ncoAnoAltaReg = null;
    BigDecimal ncoMesAltaReg = null;
    BigDecimal ncoDiaAltaReg = null;
    BigDecimal ncoAnoUltMod = null;
    BigDecimal ncoMesUltMod = null;
    BigDecimal ncoDiaUltMod = null;
    String ncoCveStSubcono = null;
    String ncoIntSubcomite = null;

    public Subconom() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNcoNumContrato(BigDecimal ncoNumContrato) {
        this.ncoNumContrato = ncoNumContrato;
    }

    public BigDecimal getNcoNumContrato() {
        return this.ncoNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNcoNumSubcomite(BigDecimal ncoNumSubcomite) {
        this.ncoNumSubcomite = ncoNumSubcomite;
    }

    public BigDecimal getNcoNumSubcomite() {
        return this.ncoNumSubcomite;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNcoNomSubcomite(String ncoNomSubcomite) {
        this.ncoNomSubcomite = ncoNomSubcomite;
    }

    public String getNcoNomSubcomite() {
        return this.ncoNomSubcomite;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setNcoFinalidSubcomite(Long ncoFinalidSubcomite) {
        this.ncoFinalidSubcomite = ncoFinalidSubcomite;
    }

    public Long getNcoFinalidSubcomite() {
        return this.ncoFinalidSubcomite;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNcoComSubcomite(String ncoComSubcomite) {
        this.ncoComSubcomite = ncoComSubcomite;
    }

    public String getNcoComSubcomite() {
        return this.ncoComSubcomite;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setNcoAnoConst(BigDecimal ncoAnoConst) {
        this.ncoAnoConst = ncoAnoConst;
    }

    public BigDecimal getNcoAnoConst() {
        return this.ncoAnoConst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNcoMesConst(BigDecimal ncoMesConst) {
        this.ncoMesConst = ncoMesConst;
    }

    public BigDecimal getNcoMesConst() {
        return this.ncoMesConst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNcoDiaConst(BigDecimal ncoDiaConst) {
        this.ncoDiaConst = ncoDiaConst;
    }

    public BigDecimal getNcoDiaConst() {
        return this.ncoDiaConst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setNcoAnoAltaReg(BigDecimal ncoAnoAltaReg) {
        this.ncoAnoAltaReg = ncoAnoAltaReg;
    }

    public BigDecimal getNcoAnoAltaReg() {
        return this.ncoAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNcoMesAltaReg(BigDecimal ncoMesAltaReg) {
        this.ncoMesAltaReg = ncoMesAltaReg;
    }

    public BigDecimal getNcoMesAltaReg() {
        return this.ncoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNcoDiaAltaReg(BigDecimal ncoDiaAltaReg) {
        this.ncoDiaAltaReg = ncoDiaAltaReg;
    }

    public BigDecimal getNcoDiaAltaReg() {
        return this.ncoDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setNcoAnoUltMod(BigDecimal ncoAnoUltMod) {
        this.ncoAnoUltMod = ncoAnoUltMod;
    }

    public BigDecimal getNcoAnoUltMod() {
        return this.ncoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNcoMesUltMod(BigDecimal ncoMesUltMod) {
        this.ncoMesUltMod = ncoMesUltMod;
    }

    public BigDecimal getNcoMesUltMod() {
        return this.ncoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNcoDiaUltMod(BigDecimal ncoDiaUltMod) {
        this.ncoDiaUltMod = ncoDiaUltMod;
    }

    public BigDecimal getNcoDiaUltMod() {
        return this.ncoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNcoCveStSubcono(String ncoCveStSubcono) {
        this.ncoCveStSubcono = ncoCveStSubcono;
    }

    public String getNcoCveStSubcono() {
        return this.ncoCveStSubcono;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNcoIntSubcomite(String ncoIntSubcomite) {
        this.ncoIntSubcomite = ncoIntSubcomite;
    }

    public String getNcoIntSubcomite() {
        return this.ncoIntSubcomite;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SUBCONOM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getNcoNumContrato() != null && this.getNcoNumContrato().longValue() == -999) {
            conditions += " AND NCO_NUM_CONTRATO IS NULL";
        } else if (this.getNcoNumContrato() != null) {
            conditions += " AND NCO_NUM_CONTRATO = ?";
            values.add(this.getNcoNumContrato());
        }

        if (this.getNcoNumSubcomite() != null && this.getNcoNumSubcomite().longValue() == -999) {
            conditions += " AND NCO_NUM_SUBCOMITE IS NULL";
        } else if (this.getNcoNumSubcomite() != null) {
            conditions += " AND NCO_NUM_SUBCOMITE = ?";
            values.add(this.getNcoNumSubcomite());
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
        String sql = "SELECT * FROM SUBCONOM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getNcoNumContrato() != null && this.getNcoNumContrato().longValue() == -999) {
            conditions += " AND NCO_NUM_CONTRATO IS NULL";
        } else if (this.getNcoNumContrato() != null) {
            conditions += " AND NCO_NUM_CONTRATO = ?";
            values.add(this.getNcoNumContrato());
        }

        if (this.getNcoNumSubcomite() != null && this.getNcoNumSubcomite().longValue() == -999) {
            conditions += " AND NCO_NUM_SUBCOMITE IS NULL";
        } else if (this.getNcoNumSubcomite() != null) {
            conditions += " AND NCO_NUM_SUBCOMITE = ?";
            values.add(this.getNcoNumSubcomite());
        }

        if (this.getNcoNomSubcomite() != null && "null".equals(this.getNcoNomSubcomite())) {
            conditions += " AND NCO_NOM_SUBCOMITE IS NULL";
        } else if (this.getNcoNomSubcomite() != null) {
            conditions += " AND NCO_NOM_SUBCOMITE = ?";
            values.add(this.getNcoNomSubcomite());
        }

        if (this.getNcoFinalidSubcomite() != null && this.getNcoFinalidSubcomite() == -999) {
            conditions += " AND NCO_FINALID_SUBCOMITE IS NULL";
        } else if (this.getNcoFinalidSubcomite() != null) {
            conditions += " AND NCO_FINALID_SUBCOMITE = ?";
            values.add(this.getNcoFinalidSubcomite());
        }

        if (this.getNcoComSubcomite() != null && "null".equals(this.getNcoComSubcomite())) {
            conditions += " AND NCO_COM_SUBCOMITE IS NULL";
        } else if (this.getNcoComSubcomite() != null) {
            conditions += " AND NCO_COM_SUBCOMITE = ?";
            values.add(this.getNcoComSubcomite());
        }

        if (this.getNcoAnoConst() != null && this.getNcoAnoConst().longValue() == -999) {
            conditions += " AND NCO_ANO_CONST IS NULL";
        } else if (this.getNcoAnoConst() != null) {
            conditions += " AND NCO_ANO_CONST = ?";
            values.add(this.getNcoAnoConst());
        }

        if (this.getNcoMesConst() != null && this.getNcoMesConst().longValue() == -999) {
            conditions += " AND NCO_MES_CONST IS NULL";
        } else if (this.getNcoMesConst() != null) {
            conditions += " AND NCO_MES_CONST = ?";
            values.add(this.getNcoMesConst());
        }

        if (this.getNcoDiaConst() != null && this.getNcoDiaConst().longValue() == -999) {
            conditions += " AND NCO_DIA_CONST IS NULL";
        } else if (this.getNcoDiaConst() != null) {
            conditions += " AND NCO_DIA_CONST = ?";
            values.add(this.getNcoDiaConst());
        }

        if (this.getNcoAnoAltaReg() != null && this.getNcoAnoAltaReg().longValue() == -999) {
            conditions += " AND NCO_ANO_ALTA_REG IS NULL";
        } else if (this.getNcoAnoAltaReg() != null) {
            conditions += " AND NCO_ANO_ALTA_REG = ?";
            values.add(this.getNcoAnoAltaReg());
        }

        if (this.getNcoMesAltaReg() != null && this.getNcoMesAltaReg().longValue() == -999) {
            conditions += " AND NCO_MES_ALTA_REG IS NULL";
        } else if (this.getNcoMesAltaReg() != null) {
            conditions += " AND NCO_MES_ALTA_REG = ?";
            values.add(this.getNcoMesAltaReg());
        }

        if (this.getNcoDiaAltaReg() != null && this.getNcoDiaAltaReg().longValue() == -999) {
            conditions += " AND NCO_DIA_ALTA_REG IS NULL";
        } else if (this.getNcoDiaAltaReg() != null) {
            conditions += " AND NCO_DIA_ALTA_REG = ?";
            values.add(this.getNcoDiaAltaReg());
        }

        if (this.getNcoAnoUltMod() != null && this.getNcoAnoUltMod().longValue() == -999) {
            conditions += " AND NCO_ANO_ULT_MOD IS NULL";
        } else if (this.getNcoAnoUltMod() != null) {
            conditions += " AND NCO_ANO_ULT_MOD = ?";
            values.add(this.getNcoAnoUltMod());
        }

        if (this.getNcoMesUltMod() != null && this.getNcoMesUltMod().longValue() == -999) {
            conditions += " AND NCO_MES_ULT_MOD IS NULL";
        } else if (this.getNcoMesUltMod() != null) {
            conditions += " AND NCO_MES_ULT_MOD = ?";
            values.add(this.getNcoMesUltMod());
        }

        if (this.getNcoDiaUltMod() != null && this.getNcoDiaUltMod().longValue() == -999) {
            conditions += " AND NCO_DIA_ULT_MOD IS NULL";
        } else if (this.getNcoDiaUltMod() != null) {
            conditions += " AND NCO_DIA_ULT_MOD = ?";
            values.add(this.getNcoDiaUltMod());
        }

        if (this.getNcoCveStSubcono() != null && "null".equals(this.getNcoCveStSubcono())) {
            conditions += " AND NCO_CVE_ST_SUBCONO IS NULL";
        } else if (this.getNcoCveStSubcono() != null) {
            conditions += " AND NCO_CVE_ST_SUBCONO = ?";
            values.add(this.getNcoCveStSubcono());
        }

        if (this.getNcoIntSubcomite() != null && "null".equals(this.getNcoIntSubcomite())) {
            conditions += " AND NCO_INT_SUBCOMITE IS NULL";
        } else if (this.getNcoIntSubcomite() != null) {
            conditions += " AND NCO_INT_SUBCOMITE = ?";
            values.add(this.getNcoIntSubcomite());
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
        String sql = "UPDATE SUBCONOM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND NCO_NUM_CONTRATO = ?";
        pkValues.add(this.getNcoNumContrato());
        conditions += " AND NCO_NUM_SUBCOMITE = ?";
        pkValues.add(this.getNcoNumSubcomite());
        fields += " NCO_NOM_SUBCOMITE = ?, ";
        values.add(this.getNcoNomSubcomite());
        fields += " NCO_FINALID_SUBCOMITE = ?, ";
        values.add(this.getNcoFinalidSubcomite());
        fields += " NCO_COM_SUBCOMITE = ?, ";
        values.add(this.getNcoComSubcomite());
        fields += " NCO_ANO_CONST = ?, ";
        values.add(this.getNcoAnoConst());
        fields += " NCO_MES_CONST = ?, ";
        values.add(this.getNcoMesConst());
        fields += " NCO_DIA_CONST = ?, ";
        values.add(this.getNcoDiaConst());
        fields += " NCO_ANO_ALTA_REG = ?, ";
        values.add(this.getNcoAnoAltaReg());
        fields += " NCO_MES_ALTA_REG = ?, ";
        values.add(this.getNcoMesAltaReg());
        fields += " NCO_DIA_ALTA_REG = ?, ";
        values.add(this.getNcoDiaAltaReg());
        fields += " NCO_ANO_ULT_MOD = ?, ";
        values.add(this.getNcoAnoUltMod());
        fields += " NCO_MES_ULT_MOD = ?, ";
        values.add(this.getNcoMesUltMod());
        fields += " NCO_DIA_ULT_MOD = ?, ";
        values.add(this.getNcoDiaUltMod());
        fields += " NCO_CVE_ST_SUBCONO = ?, ";
        values.add(this.getNcoCveStSubcono());
        fields += " NCO_INT_SUBCOMITE = ?, ";
        values.add(this.getNcoIntSubcomite());
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
        String sql = "INSERT INTO SUBCONOM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", NCO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getNcoNumContrato());

        fields += ", NCO_NUM_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getNcoNumSubcomite());

        fields += ", NCO_NOM_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getNcoNomSubcomite());

        fields += ", NCO_FINALID_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getNcoFinalidSubcomite());

        fields += ", NCO_COM_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getNcoComSubcomite());

        fields += ", NCO_ANO_CONST";
        fieldValues += ", ?";
        values.add(this.getNcoAnoConst());

        fields += ", NCO_MES_CONST";
        fieldValues += ", ?";
        values.add(this.getNcoMesConst());

        fields += ", NCO_DIA_CONST";
        fieldValues += ", ?";
        values.add(this.getNcoDiaConst());

        fields += ", NCO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNcoAnoAltaReg());

        fields += ", NCO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNcoMesAltaReg());

        fields += ", NCO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNcoDiaAltaReg());

        fields += ", NCO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNcoAnoUltMod());

        fields += ", NCO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNcoMesUltMod());

        fields += ", NCO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNcoDiaUltMod());

        fields += ", NCO_CVE_ST_SUBCONO";
        fieldValues += ", ?";
        values.add(this.getNcoCveStSubcono());

        fields += ", NCO_INT_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getNcoIntSubcomite());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SUBCONOM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND NCO_NUM_CONTRATO = ?";
        values.add(this.getNcoNumContrato());
        conditions += " AND NCO_NUM_SUBCOMITE = ?";
        values.add(this.getNcoNumSubcomite());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Subconom instance = (Subconom) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getNcoNumContrato().equals(instance.getNcoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getNcoNumSubcomite().equals(instance.getNcoNumSubcomite()))
            equalObjects = false;
        if (equalObjects && !this.getNcoNomSubcomite().equals(instance.getNcoNomSubcomite()))
            equalObjects = false;
        if (equalObjects && !this.getNcoFinalidSubcomite().equals(instance.getNcoFinalidSubcomite()))
            equalObjects = false;
        if (equalObjects && !this.getNcoComSubcomite().equals(instance.getNcoComSubcomite()))
            equalObjects = false;
        if (equalObjects && !this.getNcoAnoConst().equals(instance.getNcoAnoConst()))
            equalObjects = false;
        if (equalObjects && !this.getNcoMesConst().equals(instance.getNcoMesConst()))
            equalObjects = false;
        if (equalObjects && !this.getNcoDiaConst().equals(instance.getNcoDiaConst()))
            equalObjects = false;
        if (equalObjects && !this.getNcoAnoAltaReg().equals(instance.getNcoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNcoMesAltaReg().equals(instance.getNcoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNcoDiaAltaReg().equals(instance.getNcoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNcoAnoUltMod().equals(instance.getNcoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNcoMesUltMod().equals(instance.getNcoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNcoDiaUltMod().equals(instance.getNcoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNcoCveStSubcono().equals(instance.getNcoCveStSubcono()))
            equalObjects = false;
        if (equalObjects && !this.getNcoIntSubcomite().equals(instance.getNcoIntSubcomite()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Subconom result = new Subconom();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setNcoNumContrato((BigDecimal) objectData.getData("NCO_NUM_CONTRATO"));
        result.setNcoNumSubcomite((BigDecimal) objectData.getData("NCO_NUM_SUBCOMITE"));
        result.setNcoNomSubcomite((String) objectData.getData("NCO_NOM_SUBCOMITE"));
        result.setNcoFinalidSubcomite((Long) objectData.getData("NCO_FINALID_SUBCOMITE"));
        result.setNcoComSubcomite((String) objectData.getData("NCO_COM_SUBCOMITE"));
        result.setNcoAnoConst((BigDecimal) objectData.getData("NCO_ANO_CONST"));
        result.setNcoMesConst((BigDecimal) objectData.getData("NCO_MES_CONST"));
        result.setNcoDiaConst((BigDecimal) objectData.getData("NCO_DIA_CONST"));
        result.setNcoAnoAltaReg((BigDecimal) objectData.getData("NCO_ANO_ALTA_REG"));
        result.setNcoMesAltaReg((BigDecimal) objectData.getData("NCO_MES_ALTA_REG"));
        result.setNcoDiaAltaReg((BigDecimal) objectData.getData("NCO_DIA_ALTA_REG"));
        result.setNcoAnoUltMod((BigDecimal) objectData.getData("NCO_ANO_ULT_MOD"));
        result.setNcoMesUltMod((BigDecimal) objectData.getData("NCO_MES_ULT_MOD"));
        result.setNcoDiaUltMod((BigDecimal) objectData.getData("NCO_DIA_ULT_MOD"));
        result.setNcoCveStSubcono((String) objectData.getData("NCO_CVE_ST_SUBCONO"));
        result.setNcoIntSubcomite((String) objectData.getData("NCO_INT_SUBCOMITE"));

        return result;

    }

}
