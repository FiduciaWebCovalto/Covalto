package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FActividad extends DomainObject {

    BigDecimal actNumRama = null;
    BigDecimal actNumSrama = null;
    String actNomRama = null;
    BigDecimal actAnoAltaReg = null;
    BigDecimal actMesAltaReg = null;
    BigDecimal actDiaAltaReg = null;
    BigDecimal actAnoUltMod = null;
    BigDecimal actMesUltMod = null;
    BigDecimal actDiaUltMod = null;
    String actCveStRama = null;

    public FActividad() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setActNumRama(BigDecimal actNumRama) {
        this.actNumRama = actNumRama;
    }

    public BigDecimal getActNumRama() {
        return this.actNumRama;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setActNumSrama(BigDecimal actNumSrama) {
        this.actNumSrama = actNumSrama;
    }

    public BigDecimal getActNumSrama() {
        return this.actNumSrama;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActNomRama(String actNomRama) {
        this.actNomRama = actNomRama;
    }

    public String getActNomRama() {
        return this.actNomRama;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setActAnoAltaReg(BigDecimal actAnoAltaReg) {
        this.actAnoAltaReg = actAnoAltaReg;
    }

    public BigDecimal getActAnoAltaReg() {
        return this.actAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setActMesAltaReg(BigDecimal actMesAltaReg) {
        this.actMesAltaReg = actMesAltaReg;
    }

    public BigDecimal getActMesAltaReg() {
        return this.actMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setActDiaAltaReg(BigDecimal actDiaAltaReg) {
        this.actDiaAltaReg = actDiaAltaReg;
    }

    public BigDecimal getActDiaAltaReg() {
        return this.actDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setActAnoUltMod(BigDecimal actAnoUltMod) {
        this.actAnoUltMod = actAnoUltMod;
    }

    public BigDecimal getActAnoUltMod() {
        return this.actAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setActMesUltMod(BigDecimal actMesUltMod) {
        this.actMesUltMod = actMesUltMod;
    }

    public BigDecimal getActMesUltMod() {
        return this.actMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setActDiaUltMod(BigDecimal actDiaUltMod) {
        this.actDiaUltMod = actDiaUltMod;
    }

    public BigDecimal getActDiaUltMod() {
        return this.actDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setActCveStRama(String actCveStRama) {
        this.actCveStRama = actCveStRama;
    }

    public String getActCveStRama() {
        return this.actCveStRama;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ACTIVIDAD ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM F_ACTIVIDAD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getActNumRama() != null && this.getActNumRama().longValue() == -999) {
            conditions += " AND ACT_NUM_RAMA IS NULL";
        } else if (this.getActNumRama() != null) {
            conditions += " AND ACT_NUM_RAMA = ?";
            values.add(this.getActNumRama());
        }

        if (this.getActNumSrama() != null && this.getActNumSrama().longValue() == -999) {
            conditions += " AND ACT_NUM_SRAMA IS NULL";
        } else if (this.getActNumSrama() != null) {
            conditions += " AND ACT_NUM_SRAMA = ?";
            values.add(this.getActNumSrama());
        }

        if (this.getActNomRama() != null && "null".equals(this.getActNomRama())) {
            conditions += " AND ACT_NOM_RAMA IS NULL";
        } else if (this.getActNomRama() != null) {
            conditions += " AND ACT_NOM_RAMA = ?";
            values.add(this.getActNomRama());
        }

        if (this.getActAnoAltaReg() != null && this.getActAnoAltaReg().longValue() == -999) {
            conditions += " AND ACT_ANO_ALTA_REG IS NULL";
        } else if (this.getActAnoAltaReg() != null) {
            conditions += " AND ACT_ANO_ALTA_REG = ?";
            values.add(this.getActAnoAltaReg());
        }

        if (this.getActMesAltaReg() != null && this.getActMesAltaReg().longValue() == -999) {
            conditions += " AND ACT_MES_ALTA_REG IS NULL";
        } else if (this.getActMesAltaReg() != null) {
            conditions += " AND ACT_MES_ALTA_REG = ?";
            values.add(this.getActMesAltaReg());
        }

        if (this.getActDiaAltaReg() != null && this.getActDiaAltaReg().longValue() == -999) {
            conditions += " AND ACT_DIA_ALTA_REG IS NULL";
        } else if (this.getActDiaAltaReg() != null) {
            conditions += " AND ACT_DIA_ALTA_REG = ?";
            values.add(this.getActDiaAltaReg());
        }

        if (this.getActAnoUltMod() != null && this.getActAnoUltMod().longValue() == -999) {
            conditions += " AND ACT_ANO_ULT_MOD IS NULL";
        } else if (this.getActAnoUltMod() != null) {
            conditions += " AND ACT_ANO_ULT_MOD = ?";
            values.add(this.getActAnoUltMod());
        }

        if (this.getActMesUltMod() != null && this.getActMesUltMod().longValue() == -999) {
            conditions += " AND ACT_MES_ULT_MOD IS NULL";
        } else if (this.getActMesUltMod() != null) {
            conditions += " AND ACT_MES_ULT_MOD = ?";
            values.add(this.getActMesUltMod());
        }

        if (this.getActDiaUltMod() != null && this.getActDiaUltMod().longValue() == -999) {
            conditions += " AND ACT_DIA_ULT_MOD IS NULL";
        } else if (this.getActDiaUltMod() != null) {
            conditions += " AND ACT_DIA_ULT_MOD = ?";
            values.add(this.getActDiaUltMod());
        }

        if (this.getActCveStRama() != null && "null".equals(this.getActCveStRama())) {
            conditions += " AND ACT_CVE_ST_RAMA IS NULL";
        } else if (this.getActCveStRama() != null) {
            conditions += " AND ACT_CVE_ST_RAMA = ?";
            values.add(this.getActCveStRama());
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
        String sql = "UPDATE F_ACTIVIDAD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " ACT_NUM_RAMA = ?, ";
        values.add(this.getActNumRama());
        fields += " ACT_NUM_SRAMA = ?, ";
        values.add(this.getActNumSrama());
        fields += " ACT_NOM_RAMA = ?, ";
        values.add(this.getActNomRama());
        fields += " ACT_ANO_ALTA_REG = ?, ";
        values.add(this.getActAnoAltaReg());
        fields += " ACT_MES_ALTA_REG = ?, ";
        values.add(this.getActMesAltaReg());
        fields += " ACT_DIA_ALTA_REG = ?, ";
        values.add(this.getActDiaAltaReg());
        fields += " ACT_ANO_ULT_MOD = ?, ";
        values.add(this.getActAnoUltMod());
        fields += " ACT_MES_ULT_MOD = ?, ";
        values.add(this.getActMesUltMod());
        fields += " ACT_DIA_ULT_MOD = ?, ";
        values.add(this.getActDiaUltMod());
        fields += " ACT_CVE_ST_RAMA = ?, ";
        values.add(this.getActCveStRama());
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
        String sql = "INSERT INTO F_ACTIVIDAD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ACT_NUM_RAMA";
        fieldValues += ", ?";
        values.add(this.getActNumRama());

        fields += ", ACT_NUM_SRAMA";
        fieldValues += ", ?";
        values.add(this.getActNumSrama());

        fields += ", ACT_NOM_RAMA";
        fieldValues += ", ?";
        values.add(this.getActNomRama());

        fields += ", ACT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getActAnoAltaReg());

        fields += ", ACT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getActMesAltaReg());

        fields += ", ACT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getActDiaAltaReg());

        fields += ", ACT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getActAnoUltMod());

        fields += ", ACT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getActMesUltMod());

        fields += ", ACT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getActDiaUltMod());

        fields += ", ACT_CVE_ST_RAMA";
        fieldValues += ", ?";
        values.add(this.getActCveStRama());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ACTIVIDAD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FActividad instance = (FActividad) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getActNumRama().equals(instance.getActNumRama()))
            equalObjects = false;
        if (equalObjects && !this.getActNumSrama().equals(instance.getActNumSrama()))
            equalObjects = false;
        if (equalObjects && !this.getActNomRama().equals(instance.getActNomRama()))
            equalObjects = false;
        if (equalObjects && !this.getActAnoAltaReg().equals(instance.getActAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getActMesAltaReg().equals(instance.getActMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getActDiaAltaReg().equals(instance.getActDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getActAnoUltMod().equals(instance.getActAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getActMesUltMod().equals(instance.getActMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getActDiaUltMod().equals(instance.getActDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getActCveStRama().equals(instance.getActCveStRama()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FActividad result = new FActividad();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setActNumRama((BigDecimal) objectData.getData("ACT_NUM_RAMA"));
        result.setActNumSrama((BigDecimal) objectData.getData("ACT_NUM_SRAMA"));
        result.setActNomRama((String) objectData.getData("ACT_NOM_RAMA"));
        result.setActAnoAltaReg((BigDecimal) objectData.getData("ACT_ANO_ALTA_REG"));
        result.setActMesAltaReg((BigDecimal) objectData.getData("ACT_MES_ALTA_REG"));
        result.setActDiaAltaReg((BigDecimal) objectData.getData("ACT_DIA_ALTA_REG"));
        result.setActAnoUltMod((BigDecimal) objectData.getData("ACT_ANO_ULT_MOD"));
        result.setActMesUltMod((BigDecimal) objectData.getData("ACT_MES_ULT_MOD"));
        result.setActDiaUltMod((BigDecimal) objectData.getData("ACT_DIA_ULT_MOD"));
        result.setActCveStRama((String) objectData.getData("ACT_CVE_ST_RAMA"));

        return result;

    }

}
