package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "NACIONAL_PK", columns = { "NAC_NUM_PAIS" }, sequences = { "MAX" })
public class Nacional extends DomainObject {

    BigDecimal nacNumPais = null;
    String nacNomNacional = null;
    String nacAbrNacional = null;
    BigDecimal nacAnoAltaReg = null;
    BigDecimal nacMesAltaReg = null;
    BigDecimal nacDiaAltaReg = null;
    BigDecimal nacAnoUltMod = null;
    BigDecimal nacMesUltMod = null;
    BigDecimal nacDiaUltMod = null;
    String nacCveStNaciona = null;

    public Nacional() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNacNumPais(BigDecimal nacNumPais) {
        this.nacNumPais = nacNumPais;
    }

    public BigDecimal getNacNumPais() {
        return this.nacNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNacNomNacional(String nacNomNacional) {
        this.nacNomNacional = nacNomNacional;
    }

    public String getNacNomNacional() {
        return this.nacNomNacional;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNacAbrNacional(String nacAbrNacional) {
        this.nacAbrNacional = nacAbrNacional;
    }

    public String getNacAbrNacional() {
        return this.nacAbrNacional;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setNacAnoAltaReg(BigDecimal nacAnoAltaReg) {
        this.nacAnoAltaReg = nacAnoAltaReg;
    }

    public BigDecimal getNacAnoAltaReg() {
        return this.nacAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNacMesAltaReg(BigDecimal nacMesAltaReg) {
        this.nacMesAltaReg = nacMesAltaReg;
    }

    public BigDecimal getNacMesAltaReg() {
        return this.nacMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNacDiaAltaReg(BigDecimal nacDiaAltaReg) {
        this.nacDiaAltaReg = nacDiaAltaReg;
    }

    public BigDecimal getNacDiaAltaReg() {
        return this.nacDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setNacAnoUltMod(BigDecimal nacAnoUltMod) {
        this.nacAnoUltMod = nacAnoUltMod;
    }

    public BigDecimal getNacAnoUltMod() {
        return this.nacAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNacMesUltMod(BigDecimal nacMesUltMod) {
        this.nacMesUltMod = nacMesUltMod;
    }

    public BigDecimal getNacMesUltMod() {
        return this.nacMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNacDiaUltMod(BigDecimal nacDiaUltMod) {
        this.nacDiaUltMod = nacDiaUltMod;
    }

    public BigDecimal getNacDiaUltMod() {
        return this.nacDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNacCveStNaciona(String nacCveStNaciona) {
        this.nacCveStNaciona = nacCveStNaciona;
    }

    public String getNacCveStNaciona() {
        return this.nacCveStNaciona;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM NACIONAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getNacNumPais() != null && this.getNacNumPais().longValue() == -999) {
            conditions += " AND NAC_NUM_PAIS IS NULL";
        } else if (this.getNacNumPais() != null) {
            conditions += " AND NAC_NUM_PAIS = ?";
            values.add(this.getNacNumPais());
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
        String sql = "SELECT * FROM NACIONAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getNacNumPais() != null && this.getNacNumPais().longValue() == -999) {
            conditions += " AND NAC_NUM_PAIS IS NULL";
        } else if (this.getNacNumPais() != null) {
            conditions += " AND NAC_NUM_PAIS = ?";
            values.add(this.getNacNumPais());
        }

        if (this.getNacNomNacional() != null && "null".equals(this.getNacNomNacional())) {
            conditions += " AND NAC_NOM_NACIONAL IS NULL";
        } else if (this.getNacNomNacional() != null) {
            conditions += " AND NAC_NOM_NACIONAL = ?";
            values.add(this.getNacNomNacional());
        }

        if (this.getNacAbrNacional() != null && "null".equals(this.getNacAbrNacional())) {
            conditions += " AND NAC_ABR_NACIONAL IS NULL";
        } else if (this.getNacAbrNacional() != null) {
            conditions += " AND NAC_ABR_NACIONAL = ?";
            values.add(this.getNacAbrNacional());
        }

        if (this.getNacAnoAltaReg() != null && this.getNacAnoAltaReg().longValue() == -999) {
            conditions += " AND NAC_ANO_ALTA_REG IS NULL";
        } else if (this.getNacAnoAltaReg() != null) {
            conditions += " AND NAC_ANO_ALTA_REG = ?";
            values.add(this.getNacAnoAltaReg());
        }

        if (this.getNacMesAltaReg() != null && this.getNacMesAltaReg().longValue() == -999) {
            conditions += " AND NAC_MES_ALTA_REG IS NULL";
        } else if (this.getNacMesAltaReg() != null) {
            conditions += " AND NAC_MES_ALTA_REG = ?";
            values.add(this.getNacMesAltaReg());
        }

        if (this.getNacDiaAltaReg() != null && this.getNacDiaAltaReg().longValue() == -999) {
            conditions += " AND NAC_DIA_ALTA_REG IS NULL";
        } else if (this.getNacDiaAltaReg() != null) {
            conditions += " AND NAC_DIA_ALTA_REG = ?";
            values.add(this.getNacDiaAltaReg());
        }

        if (this.getNacAnoUltMod() != null && this.getNacAnoUltMod().longValue() == -999) {
            conditions += " AND NAC_ANO_ULT_MOD IS NULL";
        } else if (this.getNacAnoUltMod() != null) {
            conditions += " AND NAC_ANO_ULT_MOD = ?";
            values.add(this.getNacAnoUltMod());
        }

        if (this.getNacMesUltMod() != null && this.getNacMesUltMod().longValue() == -999) {
            conditions += " AND NAC_MES_ULT_MOD IS NULL";
        } else if (this.getNacMesUltMod() != null) {
            conditions += " AND NAC_MES_ULT_MOD = ?";
            values.add(this.getNacMesUltMod());
        }

        if (this.getNacDiaUltMod() != null && this.getNacDiaUltMod().longValue() == -999) {
            conditions += " AND NAC_DIA_ULT_MOD IS NULL";
        } else if (this.getNacDiaUltMod() != null) {
            conditions += " AND NAC_DIA_ULT_MOD = ?";
            values.add(this.getNacDiaUltMod());
        }

        if (this.getNacCveStNaciona() != null && "null".equals(this.getNacCveStNaciona())) {
            conditions += " AND NAC_CVE_ST_NACIONA IS NULL";
        } else if (this.getNacCveStNaciona() != null) {
            conditions += " AND NAC_CVE_ST_NACIONA = ?";
            values.add(this.getNacCveStNaciona());
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
        String sql = "UPDATE NACIONAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND NAC_NUM_PAIS = ?";
        pkValues.add(this.getNacNumPais());
        fields += " NAC_NOM_NACIONAL = ?, ";
        values.add(this.getNacNomNacional());
        fields += " NAC_ABR_NACIONAL = ?, ";
        values.add(this.getNacAbrNacional());
        fields += " NAC_ANO_ALTA_REG = ?, ";
        values.add(this.getNacAnoAltaReg());
        fields += " NAC_MES_ALTA_REG = ?, ";
        values.add(this.getNacMesAltaReg());
        fields += " NAC_DIA_ALTA_REG = ?, ";
        values.add(this.getNacDiaAltaReg());
        fields += " NAC_ANO_ULT_MOD = ?, ";
        values.add(this.getNacAnoUltMod());
        fields += " NAC_MES_ULT_MOD = ?, ";
        values.add(this.getNacMesUltMod());
        fields += " NAC_DIA_ULT_MOD = ?, ";
        values.add(this.getNacDiaUltMod());
        fields += " NAC_CVE_ST_NACIONA = ?, ";
        values.add(this.getNacCveStNaciona());
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
        String sql = "INSERT INTO NACIONAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", NAC_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getNacNumPais());

        fields += ", NAC_NOM_NACIONAL";
        fieldValues += ", ?";
        values.add(this.getNacNomNacional());

        fields += ", NAC_ABR_NACIONAL";
        fieldValues += ", ?";
        values.add(this.getNacAbrNacional());

        fields += ", NAC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNacAnoAltaReg());

        fields += ", NAC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNacMesAltaReg());

        fields += ", NAC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNacDiaAltaReg());

        fields += ", NAC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNacAnoUltMod());

        fields += ", NAC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNacMesUltMod());

        fields += ", NAC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNacDiaUltMod());

        fields += ", NAC_CVE_ST_NACIONA";
        fieldValues += ", ?";
        values.add(this.getNacCveStNaciona());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM NACIONAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND NAC_NUM_PAIS = ?";
        values.add(this.getNacNumPais());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Nacional instance = (Nacional) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getNacNumPais().equals(instance.getNacNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getNacNomNacional().equals(instance.getNacNomNacional()))
            equalObjects = false;
        if (equalObjects && !this.getNacAbrNacional().equals(instance.getNacAbrNacional()))
            equalObjects = false;
        if (equalObjects && !this.getNacAnoAltaReg().equals(instance.getNacAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNacMesAltaReg().equals(instance.getNacMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNacDiaAltaReg().equals(instance.getNacDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNacAnoUltMod().equals(instance.getNacAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNacMesUltMod().equals(instance.getNacMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNacDiaUltMod().equals(instance.getNacDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNacCveStNaciona().equals(instance.getNacCveStNaciona()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Nacional result = new Nacional();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setNacNumPais((BigDecimal) objectData.getData("NAC_NUM_PAIS"));
        result.setNacNomNacional((String) objectData.getData("NAC_NOM_NACIONAL"));
        result.setNacAbrNacional((String) objectData.getData("NAC_ABR_NACIONAL"));
        result.setNacAnoAltaReg((BigDecimal) objectData.getData("NAC_ANO_ALTA_REG"));
        result.setNacMesAltaReg((BigDecimal) objectData.getData("NAC_MES_ALTA_REG"));
        result.setNacDiaAltaReg((BigDecimal) objectData.getData("NAC_DIA_ALTA_REG"));
        result.setNacAnoUltMod((BigDecimal) objectData.getData("NAC_ANO_ULT_MOD"));
        result.setNacMesUltMod((BigDecimal) objectData.getData("NAC_MES_ULT_MOD"));
        result.setNacDiaUltMod((BigDecimal) objectData.getData("NAC_DIA_ULT_MOD"));
        result.setNacCveStNaciona((String) objectData.getData("NAC_CVE_ST_NACIONA"));

        return result;

    }

}
