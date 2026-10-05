package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AUTORIDADES_PK", columns = { "AUT_NUM_AUTORIDAD" }, sequences = { "MAX" })
public class Autoridades extends DomainObject {

    BigDecimal autNumAutoridad = null;
    String autCveAutoridad = null;
    String autNomAutoridad = null;
    String autDirAutoridad = null;
    BigDecimal autAnoAltaReg = null;
    BigDecimal autMesAltaReg = null;
    BigDecimal autDiaAltaReg = null;
    BigDecimal autAnoUltMod = null;
    BigDecimal autMesUltMod = null;
    BigDecimal autDiaUltMod = null;
    String autCveStAutoridades = null;

    public Autoridades() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAutNumAutoridad(BigDecimal autNumAutoridad) {
        this.autNumAutoridad = autNumAutoridad;
    }

    public BigDecimal getAutNumAutoridad() {
        return this.autNumAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutCveAutoridad(String autCveAutoridad) {
        this.autCveAutoridad = autCveAutoridad;
    }

    public String getAutCveAutoridad() {
        return this.autCveAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutNomAutoridad(String autNomAutoridad) {
        this.autNomAutoridad = autNomAutoridad;
    }

    public String getAutNomAutoridad() {
        return this.autNomAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutDirAutoridad(String autDirAutoridad) {
        this.autDirAutoridad = autDirAutoridad;
    }

    public String getAutDirAutoridad() {
        return this.autDirAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAutAnoAltaReg(BigDecimal autAnoAltaReg) {
        this.autAnoAltaReg = autAnoAltaReg;
    }

    public BigDecimal getAutAnoAltaReg() {
        return this.autAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutMesAltaReg(BigDecimal autMesAltaReg) {
        this.autMesAltaReg = autMesAltaReg;
    }

    public BigDecimal getAutMesAltaReg() {
        return this.autMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutDiaAltaReg(BigDecimal autDiaAltaReg) {
        this.autDiaAltaReg = autDiaAltaReg;
    }

    public BigDecimal getAutDiaAltaReg() {
        return this.autDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAutAnoUltMod(BigDecimal autAnoUltMod) {
        this.autAnoUltMod = autAnoUltMod;
    }

    public BigDecimal getAutAnoUltMod() {
        return this.autAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutMesUltMod(BigDecimal autMesUltMod) {
        this.autMesUltMod = autMesUltMod;
    }

    public BigDecimal getAutMesUltMod() {
        return this.autMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAutDiaUltMod(BigDecimal autDiaUltMod) {
        this.autDiaUltMod = autDiaUltMod;
    }

    public BigDecimal getAutDiaUltMod() {
        return this.autDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAutCveStAutoridades(String autCveStAutoridades) {
        this.autCveStAutoridades = autCveStAutoridades;
    }

    public String getAutCveStAutoridades() {
        return this.autCveStAutoridades;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AUTORIDADES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAutNumAutoridad() != null && this.getAutNumAutoridad().longValue() == -999) {
            conditions += " AND AUT_NUM_AUTORIDAD IS NULL";
        } else if (this.getAutNumAutoridad() != null) {
            conditions += " AND AUT_NUM_AUTORIDAD = ?";
            values.add(this.getAutNumAutoridad());
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
        String sql = "SELECT * FROM AUTORIDADES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAutNumAutoridad() != null && this.getAutNumAutoridad().longValue() == -999) {
            conditions += " AND AUT_NUM_AUTORIDAD IS NULL";
        } else if (this.getAutNumAutoridad() != null) {
            conditions += " AND AUT_NUM_AUTORIDAD = ?";
            values.add(this.getAutNumAutoridad());
        }

        if (this.getAutCveAutoridad() != null && "null".equals(this.getAutCveAutoridad())) {
            conditions += " AND AUT_CVE_AUTORIDAD IS NULL";
        } else if (this.getAutCveAutoridad() != null) {
            conditions += " AND AUT_CVE_AUTORIDAD = ?";
            values.add(this.getAutCveAutoridad());
        }

        if (this.getAutNomAutoridad() != null && "null".equals(this.getAutNomAutoridad())) {
            conditions += " AND AUT_NOM_AUTORIDAD IS NULL";
        } else if (this.getAutNomAutoridad() != null) {
            conditions += " AND AUT_NOM_AUTORIDAD = ?";
            values.add(this.getAutNomAutoridad());
        }

        if (this.getAutDirAutoridad() != null && "null".equals(this.getAutDirAutoridad())) {
            conditions += " AND AUT_DIR_AUTORIDAD IS NULL";
        } else if (this.getAutDirAutoridad() != null) {
            conditions += " AND AUT_DIR_AUTORIDAD = ?";
            values.add(this.getAutDirAutoridad());
        }

        if (this.getAutAnoAltaReg() != null && this.getAutAnoAltaReg().longValue() == -999) {
            conditions += " AND AUT_ANO_ALTA_REG IS NULL";
        } else if (this.getAutAnoAltaReg() != null) {
            conditions += " AND AUT_ANO_ALTA_REG = ?";
            values.add(this.getAutAnoAltaReg());
        }

        if (this.getAutMesAltaReg() != null && this.getAutMesAltaReg().longValue() == -999) {
            conditions += " AND AUT_MES_ALTA_REG IS NULL";
        } else if (this.getAutMesAltaReg() != null) {
            conditions += " AND AUT_MES_ALTA_REG = ?";
            values.add(this.getAutMesAltaReg());
        }

        if (this.getAutDiaAltaReg() != null && this.getAutDiaAltaReg().longValue() == -999) {
            conditions += " AND AUT_DIA_ALTA_REG IS NULL";
        } else if (this.getAutDiaAltaReg() != null) {
            conditions += " AND AUT_DIA_ALTA_REG = ?";
            values.add(this.getAutDiaAltaReg());
        }

        if (this.getAutAnoUltMod() != null && this.getAutAnoUltMod().longValue() == -999) {
            conditions += " AND AUT_ANO_ULT_MOD IS NULL";
        } else if (this.getAutAnoUltMod() != null) {
            conditions += " AND AUT_ANO_ULT_MOD = ?";
            values.add(this.getAutAnoUltMod());
        }

        if (this.getAutMesUltMod() != null && this.getAutMesUltMod().longValue() == -999) {
            conditions += " AND AUT_MES_ULT_MOD IS NULL";
        } else if (this.getAutMesUltMod() != null) {
            conditions += " AND AUT_MES_ULT_MOD = ?";
            values.add(this.getAutMesUltMod());
        }

        if (this.getAutDiaUltMod() != null && this.getAutDiaUltMod().longValue() == -999) {
            conditions += " AND AUT_DIA_ULT_MOD IS NULL";
        } else if (this.getAutDiaUltMod() != null) {
            conditions += " AND AUT_DIA_ULT_MOD = ?";
            values.add(this.getAutDiaUltMod());
        }

        if (this.getAutCveStAutoridades() != null && "null".equals(this.getAutCveStAutoridades())) {
            conditions += " AND AUT_CVE_ST_AUTORIDADES IS NULL";
        } else if (this.getAutCveStAutoridades() != null) {
            conditions += " AND AUT_CVE_ST_AUTORIDADES = ?";
            values.add(this.getAutCveStAutoridades());
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
        String sql = "UPDATE AUTORIDADES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AUT_NUM_AUTORIDAD = ?";
        pkValues.add(this.getAutNumAutoridad());
        fields += " AUT_CVE_AUTORIDAD = ?, ";
        values.add(this.getAutCveAutoridad());
        fields += " AUT_NOM_AUTORIDAD = ?, ";
        values.add(this.getAutNomAutoridad());
        fields += " AUT_DIR_AUTORIDAD = ?, ";
        values.add(this.getAutDirAutoridad());
        fields += " AUT_ANO_ALTA_REG = ?, ";
        values.add(this.getAutAnoAltaReg());
        fields += " AUT_MES_ALTA_REG = ?, ";
        values.add(this.getAutMesAltaReg());
        fields += " AUT_DIA_ALTA_REG = ?, ";
        values.add(this.getAutDiaAltaReg());
        fields += " AUT_ANO_ULT_MOD = ?, ";
        values.add(this.getAutAnoUltMod());
        fields += " AUT_MES_ULT_MOD = ?, ";
        values.add(this.getAutMesUltMod());
        fields += " AUT_DIA_ULT_MOD = ?, ";
        values.add(this.getAutDiaUltMod());
        fields += " AUT_CVE_ST_AUTORIDADES = ?, ";
        values.add(this.getAutCveStAutoridades());
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
        String sql = "INSERT INTO AUTORIDADES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AUT_NUM_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getAutNumAutoridad());

        fields += ", AUT_CVE_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getAutCveAutoridad());

        fields += ", AUT_NOM_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getAutNomAutoridad());

        fields += ", AUT_DIR_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getAutDirAutoridad());

        fields += ", AUT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAutAnoAltaReg());

        fields += ", AUT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAutMesAltaReg());

        fields += ", AUT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAutDiaAltaReg());

        fields += ", AUT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAutAnoUltMod());

        fields += ", AUT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAutMesUltMod());

        fields += ", AUT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAutDiaUltMod());

        fields += ", AUT_CVE_ST_AUTORIDADES";
        fieldValues += ", ?";
        values.add(this.getAutCveStAutoridades());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AUTORIDADES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AUT_NUM_AUTORIDAD = ?";
        values.add(this.getAutNumAutoridad());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Autoridades instance = (Autoridades) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAutNumAutoridad().equals(instance.getAutNumAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getAutCveAutoridad().equals(instance.getAutCveAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getAutNomAutoridad().equals(instance.getAutNomAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getAutDirAutoridad().equals(instance.getAutDirAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getAutAnoAltaReg().equals(instance.getAutAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAutMesAltaReg().equals(instance.getAutMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAutDiaAltaReg().equals(instance.getAutDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAutAnoUltMod().equals(instance.getAutAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAutMesUltMod().equals(instance.getAutMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAutDiaUltMod().equals(instance.getAutDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAutCveStAutoridades().equals(instance.getAutCveStAutoridades()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Autoridades result = new Autoridades();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAutNumAutoridad((BigDecimal) objectData.getData("AUT_NUM_AUTORIDAD"));
        result.setAutCveAutoridad((String) objectData.getData("AUT_CVE_AUTORIDAD"));
        result.setAutNomAutoridad((String) objectData.getData("AUT_NOM_AUTORIDAD"));
        result.setAutDirAutoridad((String) objectData.getData("AUT_DIR_AUTORIDAD"));
        result.setAutAnoAltaReg((BigDecimal) objectData.getData("AUT_ANO_ALTA_REG"));
        result.setAutMesAltaReg((BigDecimal) objectData.getData("AUT_MES_ALTA_REG"));
        result.setAutDiaAltaReg((BigDecimal) objectData.getData("AUT_DIA_ALTA_REG"));
        result.setAutAnoUltMod((BigDecimal) objectData.getData("AUT_ANO_ULT_MOD"));
        result.setAutMesUltMod((BigDecimal) objectData.getData("AUT_MES_ULT_MOD"));
        result.setAutDiaUltMod((BigDecimal) objectData.getData("AUT_DIA_ULT_MOD"));
        result.setAutCveStAutoridades((String) objectData.getData("AUT_CVE_ST_AUTORIDADES"));

        return result;

    }

}
