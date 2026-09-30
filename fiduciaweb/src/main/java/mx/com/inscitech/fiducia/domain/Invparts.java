package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INVPARTS_PK", columns = { "IPAR_CVE" }, sequences = { "MAX" })
public class Invparts extends DomainObject {

    BigDecimal iparEntClave = null;
    BigDecimal iparMunCve = null;
    BigDecimal iparCve = null;
    BigDecimal iparAnoAltaReg = null;
    BigDecimal iparMesAltaReg = null;
    BigDecimal iparDiaAltaReg = null;
    BigDecimal iparAnoUltMod = null;
    BigDecimal iparMesUltMod = null;
    BigDecimal iparDiaUltMod = null;
    String iparCveStInvpart = null;

    public Invparts() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIparEntClave(BigDecimal iparEntClave) {
        this.iparEntClave = iparEntClave;
    }

    public BigDecimal getIparEntClave() {
        return this.iparEntClave;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setIparMunCve(BigDecimal iparMunCve) {
        this.iparMunCve = iparMunCve;
    }

    public BigDecimal getIparMunCve() {
        return this.iparMunCve;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setIparCve(BigDecimal iparCve) {
        this.iparCve = iparCve;
    }

    public BigDecimal getIparCve() {
        return this.iparCve;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIparAnoAltaReg(BigDecimal iparAnoAltaReg) {
        this.iparAnoAltaReg = iparAnoAltaReg;
    }

    public BigDecimal getIparAnoAltaReg() {
        return this.iparAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIparMesAltaReg(BigDecimal iparMesAltaReg) {
        this.iparMesAltaReg = iparMesAltaReg;
    }

    public BigDecimal getIparMesAltaReg() {
        return this.iparMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIparDiaAltaReg(BigDecimal iparDiaAltaReg) {
        this.iparDiaAltaReg = iparDiaAltaReg;
    }

    public BigDecimal getIparDiaAltaReg() {
        return this.iparDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIparAnoUltMod(BigDecimal iparAnoUltMod) {
        this.iparAnoUltMod = iparAnoUltMod;
    }

    public BigDecimal getIparAnoUltMod() {
        return this.iparAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIparMesUltMod(BigDecimal iparMesUltMod) {
        this.iparMesUltMod = iparMesUltMod;
    }

    public BigDecimal getIparMesUltMod() {
        return this.iparMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIparDiaUltMod(BigDecimal iparDiaUltMod) {
        this.iparDiaUltMod = iparDiaUltMod;
    }

    public BigDecimal getIparDiaUltMod() {
        return this.iparDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIparCveStInvpart(String iparCveStInvpart) {
        this.iparCveStInvpart = iparCveStInvpart;
    }

    public String getIparCveStInvpart() {
        return this.iparCveStInvpart;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INVPARTS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIparCve() != null && this.getIparCve().longValue() == -999) {
            conditions += " AND IPAR_CVE IS NULL";
        } else if (this.getIparCve() != null) {
            conditions += " AND IPAR_CVE = ?";
            values.add(this.getIparCve());
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
        String sql = "SELECT * FROM INVPARTS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIparEntClave() != null && this.getIparEntClave().longValue() == -999) {
            conditions += " AND IPAR_ENT_CLAVE IS NULL";
        } else if (this.getIparEntClave() != null) {
            conditions += " AND IPAR_ENT_CLAVE = ?";
            values.add(this.getIparEntClave());
        }

        if (this.getIparMunCve() != null && this.getIparMunCve().longValue() == -999) {
            conditions += " AND IPAR_MUN_CVE IS NULL";
        } else if (this.getIparMunCve() != null) {
            conditions += " AND IPAR_MUN_CVE = ?";
            values.add(this.getIparMunCve());
        }

        if (this.getIparCve() != null && this.getIparCve().longValue() == -999) {
            conditions += " AND IPAR_CVE IS NULL";
        } else if (this.getIparCve() != null) {
            conditions += " AND IPAR_CVE = ?";
            values.add(this.getIparCve());
        }

        if (this.getIparAnoAltaReg() != null && this.getIparAnoAltaReg().longValue() == -999) {
            conditions += " AND IPAR_ANO_ALTA_REG IS NULL";
        } else if (this.getIparAnoAltaReg() != null) {
            conditions += " AND IPAR_ANO_ALTA_REG = ?";
            values.add(this.getIparAnoAltaReg());
        }

        if (this.getIparMesAltaReg() != null && this.getIparMesAltaReg().longValue() == -999) {
            conditions += " AND IPAR_MES_ALTA_REG IS NULL";
        } else if (this.getIparMesAltaReg() != null) {
            conditions += " AND IPAR_MES_ALTA_REG = ?";
            values.add(this.getIparMesAltaReg());
        }

        if (this.getIparDiaAltaReg() != null && this.getIparDiaAltaReg().longValue() == -999) {
            conditions += " AND IPAR_DIA_ALTA_REG IS NULL";
        } else if (this.getIparDiaAltaReg() != null) {
            conditions += " AND IPAR_DIA_ALTA_REG = ?";
            values.add(this.getIparDiaAltaReg());
        }

        if (this.getIparAnoUltMod() != null && this.getIparAnoUltMod().longValue() == -999) {
            conditions += " AND IPAR_ANO_ULT_MOD IS NULL";
        } else if (this.getIparAnoUltMod() != null) {
            conditions += " AND IPAR_ANO_ULT_MOD = ?";
            values.add(this.getIparAnoUltMod());
        }

        if (this.getIparMesUltMod() != null && this.getIparMesUltMod().longValue() == -999) {
            conditions += " AND IPAR_MES_ULT_MOD IS NULL";
        } else if (this.getIparMesUltMod() != null) {
            conditions += " AND IPAR_MES_ULT_MOD = ?";
            values.add(this.getIparMesUltMod());
        }

        if (this.getIparDiaUltMod() != null && this.getIparDiaUltMod().longValue() == -999) {
            conditions += " AND IPAR_DIA_ULT_MOD IS NULL";
        } else if (this.getIparDiaUltMod() != null) {
            conditions += " AND IPAR_DIA_ULT_MOD = ?";
            values.add(this.getIparDiaUltMod());
        }

        if (this.getIparCveStInvpart() != null && "null".equals(this.getIparCveStInvpart())) {
            conditions += " AND IPAR_CVE_ST_INVPART IS NULL";
        } else if (this.getIparCveStInvpart() != null) {
            conditions += " AND IPAR_CVE_ST_INVPART = ?";
            values.add(this.getIparCveStInvpart());
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
        String sql = "UPDATE INVPARTS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " IPAR_ENT_CLAVE = ?, ";
        values.add(this.getIparEntClave());
        fields += " IPAR_MUN_CVE = ?, ";
        values.add(this.getIparMunCve());
        conditions += " AND IPAR_CVE = ?";
        pkValues.add(this.getIparCve());
        fields += " IPAR_ANO_ALTA_REG = ?, ";
        values.add(this.getIparAnoAltaReg());
        fields += " IPAR_MES_ALTA_REG = ?, ";
        values.add(this.getIparMesAltaReg());
        fields += " IPAR_DIA_ALTA_REG = ?, ";
        values.add(this.getIparDiaAltaReg());
        fields += " IPAR_ANO_ULT_MOD = ?, ";
        values.add(this.getIparAnoUltMod());
        fields += " IPAR_MES_ULT_MOD = ?, ";
        values.add(this.getIparMesUltMod());
        fields += " IPAR_DIA_ULT_MOD = ?, ";
        values.add(this.getIparDiaUltMod());
        fields += " IPAR_CVE_ST_INVPART = ?, ";
        values.add(this.getIparCveStInvpart());
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
        String sql = "INSERT INTO INVPARTS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", IPAR_ENT_CLAVE";
        fieldValues += ", ?";
        values.add(this.getIparEntClave());

        fields += ", IPAR_MUN_CVE";
        fieldValues += ", ?";
        values.add(this.getIparMunCve());

        fields += ", IPAR_CVE";
        fieldValues += ", ?";
        values.add(this.getIparCve());

        fields += ", IPAR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIparAnoAltaReg());

        fields += ", IPAR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIparMesAltaReg());

        fields += ", IPAR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIparDiaAltaReg());

        fields += ", IPAR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIparAnoUltMod());

        fields += ", IPAR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIparMesUltMod());

        fields += ", IPAR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIparDiaUltMod());

        fields += ", IPAR_CVE_ST_INVPART";
        fieldValues += ", ?";
        values.add(this.getIparCveStInvpart());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INVPARTS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND IPAR_CVE = ?";
        values.add(this.getIparCve());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Invparts instance = (Invparts) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIparEntClave().equals(instance.getIparEntClave()))
            equalObjects = false;
        if (equalObjects && !this.getIparMunCve().equals(instance.getIparMunCve()))
            equalObjects = false;
        if (equalObjects && !this.getIparCve().equals(instance.getIparCve()))
            equalObjects = false;
        if (equalObjects && !this.getIparAnoAltaReg().equals(instance.getIparAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIparMesAltaReg().equals(instance.getIparMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIparDiaAltaReg().equals(instance.getIparDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIparAnoUltMod().equals(instance.getIparAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIparMesUltMod().equals(instance.getIparMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIparDiaUltMod().equals(instance.getIparDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIparCveStInvpart().equals(instance.getIparCveStInvpart()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Invparts result = new Invparts();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIparEntClave((BigDecimal) objectData.getData("IPAR_ENT_CLAVE"));
        result.setIparMunCve((BigDecimal) objectData.getData("IPAR_MUN_CVE"));
        result.setIparCve((BigDecimal) objectData.getData("IPAR_CVE"));
        result.setIparAnoAltaReg((BigDecimal) objectData.getData("IPAR_ANO_ALTA_REG"));
        result.setIparMesAltaReg((BigDecimal) objectData.getData("IPAR_MES_ALTA_REG"));
        result.setIparDiaAltaReg((BigDecimal) objectData.getData("IPAR_DIA_ALTA_REG"));
        result.setIparAnoUltMod((BigDecimal) objectData.getData("IPAR_ANO_ULT_MOD"));
        result.setIparMesUltMod((BigDecimal) objectData.getData("IPAR_MES_ULT_MOD"));
        result.setIparDiaUltMod((BigDecimal) objectData.getData("IPAR_DIA_ULT_MOD"));
        result.setIparCveStInvpart((String) objectData.getData("IPAR_CVE_ST_INVPART"));

        return result;

    }

}
