package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "GUIANOM_PK", columns = { "GUN_NUM_GUIA" }, sequences = { "MAX" })
public class Guianom extends DomainObject {

    BigDecimal gunNumGuia = null;
    String gunNomGuia = null;
    BigDecimal gunAnoAltaReg = null;
    BigDecimal gunMesAltaReg = null;
    BigDecimal gunDiaAltaReg = null;
    BigDecimal gunAnoUltMod = null;
    BigDecimal gunMesUltMod = null;
    BigDecimal gunDiaUltMod = null;
    String gunCveStGuiano = null;

    public Guianom() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGunNumGuia(BigDecimal gunNumGuia) {
        this.gunNumGuia = gunNumGuia;
    }

    public BigDecimal getGunNumGuia() {
        return this.gunNumGuia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGunNomGuia(String gunNomGuia) {
        this.gunNomGuia = gunNomGuia;
    }

    public String getGunNomGuia() {
        return this.gunNomGuia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setGunAnoAltaReg(BigDecimal gunAnoAltaReg) {
        this.gunAnoAltaReg = gunAnoAltaReg;
    }

    public BigDecimal getGunAnoAltaReg() {
        return this.gunAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGunMesAltaReg(BigDecimal gunMesAltaReg) {
        this.gunMesAltaReg = gunMesAltaReg;
    }

    public BigDecimal getGunMesAltaReg() {
        return this.gunMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGunDiaAltaReg(BigDecimal gunDiaAltaReg) {
        this.gunDiaAltaReg = gunDiaAltaReg;
    }

    public BigDecimal getGunDiaAltaReg() {
        return this.gunDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setGunAnoUltMod(BigDecimal gunAnoUltMod) {
        this.gunAnoUltMod = gunAnoUltMod;
    }

    public BigDecimal getGunAnoUltMod() {
        return this.gunAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGunMesUltMod(BigDecimal gunMesUltMod) {
        this.gunMesUltMod = gunMesUltMod;
    }

    public BigDecimal getGunMesUltMod() {
        return this.gunMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGunDiaUltMod(BigDecimal gunDiaUltMod) {
        this.gunDiaUltMod = gunDiaUltMod;
    }

    public BigDecimal getGunDiaUltMod() {
        return this.gunDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGunCveStGuiano(String gunCveStGuiano) {
        this.gunCveStGuiano = gunCveStGuiano;
    }

    public String getGunCveStGuiano() {
        return this.gunCveStGuiano;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM GUIANOM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGunNumGuia() != null && this.getGunNumGuia().longValue() == -999) {
            conditions += " AND GUN_NUM_GUIA IS NULL";
        } else if (this.getGunNumGuia() != null) {
            conditions += " AND GUN_NUM_GUIA = ?";
            values.add(this.getGunNumGuia());
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
        String sql = "SELECT * FROM GUIANOM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGunNumGuia() != null && this.getGunNumGuia().longValue() == -999) {
            conditions += " AND GUN_NUM_GUIA IS NULL";
        } else if (this.getGunNumGuia() != null) {
            conditions += " AND GUN_NUM_GUIA = ?";
            values.add(this.getGunNumGuia());
        }

        if (this.getGunNomGuia() != null && "null".equals(this.getGunNomGuia())) {
            conditions += " AND GUN_NOM_GUIA IS NULL";
        } else if (this.getGunNomGuia() != null) {
            conditions += " AND GUN_NOM_GUIA = ?";
            values.add(this.getGunNomGuia());
        }

        if (this.getGunAnoAltaReg() != null && this.getGunAnoAltaReg().longValue() == -999) {
            conditions += " AND GUN_ANO_ALTA_REG IS NULL";
        } else if (this.getGunAnoAltaReg() != null) {
            conditions += " AND GUN_ANO_ALTA_REG = ?";
            values.add(this.getGunAnoAltaReg());
        }

        if (this.getGunMesAltaReg() != null && this.getGunMesAltaReg().longValue() == -999) {
            conditions += " AND GUN_MES_ALTA_REG IS NULL";
        } else if (this.getGunMesAltaReg() != null) {
            conditions += " AND GUN_MES_ALTA_REG = ?";
            values.add(this.getGunMesAltaReg());
        }

        if (this.getGunDiaAltaReg() != null && this.getGunDiaAltaReg().longValue() == -999) {
            conditions += " AND GUN_DIA_ALTA_REG IS NULL";
        } else if (this.getGunDiaAltaReg() != null) {
            conditions += " AND GUN_DIA_ALTA_REG = ?";
            values.add(this.getGunDiaAltaReg());
        }

        if (this.getGunAnoUltMod() != null && this.getGunAnoUltMod().longValue() == -999) {
            conditions += " AND GUN_ANO_ULT_MOD IS NULL";
        } else if (this.getGunAnoUltMod() != null) {
            conditions += " AND GUN_ANO_ULT_MOD = ?";
            values.add(this.getGunAnoUltMod());
        }

        if (this.getGunMesUltMod() != null && this.getGunMesUltMod().longValue() == -999) {
            conditions += " AND GUN_MES_ULT_MOD IS NULL";
        } else if (this.getGunMesUltMod() != null) {
            conditions += " AND GUN_MES_ULT_MOD = ?";
            values.add(this.getGunMesUltMod());
        }

        if (this.getGunDiaUltMod() != null && this.getGunDiaUltMod().longValue() == -999) {
            conditions += " AND GUN_DIA_ULT_MOD IS NULL";
        } else if (this.getGunDiaUltMod() != null) {
            conditions += " AND GUN_DIA_ULT_MOD = ?";
            values.add(this.getGunDiaUltMod());
        }

        if (this.getGunCveStGuiano() != null && "null".equals(this.getGunCveStGuiano())) {
            conditions += " AND GUN_CVE_ST_GUIANO IS NULL";
        } else if (this.getGunCveStGuiano() != null) {
            conditions += " AND GUN_CVE_ST_GUIANO = ?";
            values.add(this.getGunCveStGuiano());
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
        String sql = "UPDATE GUIANOM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GUN_NUM_GUIA = ?";
        pkValues.add(this.getGunNumGuia());
        fields += " GUN_NOM_GUIA = ?, ";
        values.add(this.getGunNomGuia());
        fields += " GUN_ANO_ALTA_REG = ?, ";
        values.add(this.getGunAnoAltaReg());
        fields += " GUN_MES_ALTA_REG = ?, ";
        values.add(this.getGunMesAltaReg());
        fields += " GUN_DIA_ALTA_REG = ?, ";
        values.add(this.getGunDiaAltaReg());
        fields += " GUN_ANO_ULT_MOD = ?, ";
        values.add(this.getGunAnoUltMod());
        fields += " GUN_MES_ULT_MOD = ?, ";
        values.add(this.getGunMesUltMod());
        fields += " GUN_DIA_ULT_MOD = ?, ";
        values.add(this.getGunDiaUltMod());
        fields += " GUN_CVE_ST_GUIANO = ?, ";
        values.add(this.getGunCveStGuiano());
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
        String sql = "INSERT INTO GUIANOM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GUN_NUM_GUIA";
        fieldValues += ", ?";
        values.add(this.getGunNumGuia());

        fields += ", GUN_NOM_GUIA";
        fieldValues += ", ?";
        values.add(this.getGunNomGuia());

        fields += ", GUN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGunAnoAltaReg());

        fields += ", GUN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGunMesAltaReg());

        fields += ", GUN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGunDiaAltaReg());

        fields += ", GUN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGunAnoUltMod());

        fields += ", GUN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGunMesUltMod());

        fields += ", GUN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGunDiaUltMod());

        fields += ", GUN_CVE_ST_GUIANO";
        fieldValues += ", ?";
        values.add(this.getGunCveStGuiano());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM GUIANOM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GUN_NUM_GUIA = ?";
        values.add(this.getGunNumGuia());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Guianom instance = (Guianom) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGunNumGuia().equals(instance.getGunNumGuia()))
            equalObjects = false;
        if (equalObjects && !this.getGunNomGuia().equals(instance.getGunNomGuia()))
            equalObjects = false;
        if (equalObjects && !this.getGunAnoAltaReg().equals(instance.getGunAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGunMesAltaReg().equals(instance.getGunMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGunDiaAltaReg().equals(instance.getGunDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGunAnoUltMod().equals(instance.getGunAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGunMesUltMod().equals(instance.getGunMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGunDiaUltMod().equals(instance.getGunDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGunCveStGuiano().equals(instance.getGunCveStGuiano()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Guianom result = new Guianom();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGunNumGuia((BigDecimal) objectData.getData("GUN_NUM_GUIA"));
        result.setGunNomGuia((String) objectData.getData("GUN_NOM_GUIA"));
        result.setGunAnoAltaReg((BigDecimal) objectData.getData("GUN_ANO_ALTA_REG"));
        result.setGunMesAltaReg((BigDecimal) objectData.getData("GUN_MES_ALTA_REG"));
        result.setGunDiaAltaReg((BigDecimal) objectData.getData("GUN_DIA_ALTA_REG"));
        result.setGunAnoUltMod((BigDecimal) objectData.getData("GUN_ANO_ULT_MOD"));
        result.setGunMesUltMod((BigDecimal) objectData.getData("GUN_MES_ULT_MOD"));
        result.setGunDiaUltMod((BigDecimal) objectData.getData("GUN_DIA_ULT_MOD"));
        result.setGunCveStGuiano((String) objectData.getData("GUN_CVE_ST_GUIANO"));

        return result;

    }

}
