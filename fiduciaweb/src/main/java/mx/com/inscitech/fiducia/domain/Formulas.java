package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FORMULAS_PK", columns = { "FOR_CVE_FORMULA", "FOR_NUM_FORMULA" }, sequences = { "MANUAL" })
public class Formulas extends DomainObject {

    String forCveFormula = null;
    BigDecimal forNumFormula = null;
    String forPropFormula = null;
    String forFormula = null;
    BigDecimal forAnoAltaReg = null;
    BigDecimal forMesAltaReg = null;
    BigDecimal forDiaAltaReg = null;
    BigDecimal forAnoUltMod = null;
    BigDecimal forMesUltMod = null;
    BigDecimal forDiaUltMod = null;
    String forCveStFormula = null;

    public Formulas() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setForCveFormula(String forCveFormula) {
        this.forCveFormula = forCveFormula;
    }

    public String getForCveFormula() {
        return this.forCveFormula;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setForNumFormula(BigDecimal forNumFormula) {
        this.forNumFormula = forNumFormula;
    }

    public BigDecimal getForNumFormula() {
        return this.forNumFormula;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setForPropFormula(String forPropFormula) {
        this.forPropFormula = forPropFormula;
    }

    public String getForPropFormula() {
        return this.forPropFormula;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setForFormula(String forFormula) {
        this.forFormula = forFormula;
    }

    public String getForFormula() {
        return this.forFormula;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setForAnoAltaReg(BigDecimal forAnoAltaReg) {
        this.forAnoAltaReg = forAnoAltaReg;
    }

    public BigDecimal getForAnoAltaReg() {
        return this.forAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setForMesAltaReg(BigDecimal forMesAltaReg) {
        this.forMesAltaReg = forMesAltaReg;
    }

    public BigDecimal getForMesAltaReg() {
        return this.forMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setForDiaAltaReg(BigDecimal forDiaAltaReg) {
        this.forDiaAltaReg = forDiaAltaReg;
    }

    public BigDecimal getForDiaAltaReg() {
        return this.forDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setForAnoUltMod(BigDecimal forAnoUltMod) {
        this.forAnoUltMod = forAnoUltMod;
    }

    public BigDecimal getForAnoUltMod() {
        return this.forAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setForMesUltMod(BigDecimal forMesUltMod) {
        this.forMesUltMod = forMesUltMod;
    }

    public BigDecimal getForMesUltMod() {
        return this.forMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setForDiaUltMod(BigDecimal forDiaUltMod) {
        this.forDiaUltMod = forDiaUltMod;
    }

    public BigDecimal getForDiaUltMod() {
        return this.forDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setForCveStFormula(String forCveStFormula) {
        this.forCveStFormula = forCveStFormula;
    }

    public String getForCveStFormula() {
        return this.forCveStFormula;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FORMULAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getForCveFormula() != null && "null".equals(this.getForCveFormula())) {
            conditions += " AND FOR_CVE_FORMULA IS NULL";
        } else if (this.getForCveFormula() != null) {
            conditions += " AND FOR_CVE_FORMULA = ?";
            values.add(this.getForCveFormula());
        }

        if (this.getForNumFormula() != null && this.getForNumFormula().longValue() == -999) {
            conditions += " AND FOR_NUM_FORMULA IS NULL";
        } else if (this.getForNumFormula() != null) {
            conditions += " AND FOR_NUM_FORMULA = ?";
            values.add(this.getForNumFormula());
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
        String sql = "SELECT * FROM FORMULAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getForCveFormula() != null && "null".equals(this.getForCveFormula())) {
            conditions += " AND FOR_CVE_FORMULA IS NULL";
        } else if (this.getForCveFormula() != null) {
            conditions += " AND FOR_CVE_FORMULA = ?";
            values.add(this.getForCveFormula());
        }

        if (this.getForNumFormula() != null && this.getForNumFormula().longValue() == -999) {
            conditions += " AND FOR_NUM_FORMULA IS NULL";
        } else if (this.getForNumFormula() != null) {
            conditions += " AND FOR_NUM_FORMULA = ?";
            values.add(this.getForNumFormula());
        }

        if (this.getForPropFormula() != null && "null".equals(this.getForPropFormula())) {
            conditions += " AND FOR_PROP_FORMULA IS NULL";
        } else if (this.getForPropFormula() != null) {
            conditions += " AND FOR_PROP_FORMULA = ?";
            values.add(this.getForPropFormula());
        }

        if (this.getForFormula() != null && "null".equals(this.getForFormula())) {
            conditions += " AND FOR_FORMULA IS NULL";
        } else if (this.getForFormula() != null) {
            conditions += " AND FOR_FORMULA = ?";
            values.add(this.getForFormula());
        }

        if (this.getForAnoAltaReg() != null && this.getForAnoAltaReg().longValue() == -999) {
            conditions += " AND FOR_ANO_ALTA_REG IS NULL";
        } else if (this.getForAnoAltaReg() != null) {
            conditions += " AND FOR_ANO_ALTA_REG = ?";
            values.add(this.getForAnoAltaReg());
        }

        if (this.getForMesAltaReg() != null && this.getForMesAltaReg().longValue() == -999) {
            conditions += " AND FOR_MES_ALTA_REG IS NULL";
        } else if (this.getForMesAltaReg() != null) {
            conditions += " AND FOR_MES_ALTA_REG = ?";
            values.add(this.getForMesAltaReg());
        }

        if (this.getForDiaAltaReg() != null && this.getForDiaAltaReg().longValue() == -999) {
            conditions += " AND FOR_DIA_ALTA_REG IS NULL";
        } else if (this.getForDiaAltaReg() != null) {
            conditions += " AND FOR_DIA_ALTA_REG = ?";
            values.add(this.getForDiaAltaReg());
        }

        if (this.getForAnoUltMod() != null && this.getForAnoUltMod().longValue() == -999) {
            conditions += " AND FOR_ANO_ULT_MOD IS NULL";
        } else if (this.getForAnoUltMod() != null) {
            conditions += " AND FOR_ANO_ULT_MOD = ?";
            values.add(this.getForAnoUltMod());
        }

        if (this.getForMesUltMod() != null && this.getForMesUltMod().longValue() == -999) {
            conditions += " AND FOR_MES_ULT_MOD IS NULL";
        } else if (this.getForMesUltMod() != null) {
            conditions += " AND FOR_MES_ULT_MOD = ?";
            values.add(this.getForMesUltMod());
        }

        if (this.getForDiaUltMod() != null && this.getForDiaUltMod().longValue() == -999) {
            conditions += " AND FOR_DIA_ULT_MOD IS NULL";
        } else if (this.getForDiaUltMod() != null) {
            conditions += " AND FOR_DIA_ULT_MOD = ?";
            values.add(this.getForDiaUltMod());
        }

        if (this.getForCveStFormula() != null && "null".equals(this.getForCveStFormula())) {
            conditions += " AND FOR_CVE_ST_FORMULA IS NULL";
        } else if (this.getForCveStFormula() != null) {
            conditions += " AND FOR_CVE_ST_FORMULA = ?";
            values.add(this.getForCveStFormula());
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
        String sql = "UPDATE FORMULAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOR_CVE_FORMULA = ?";
        pkValues.add(this.getForCveFormula());
        conditions += " AND FOR_NUM_FORMULA = ?";
        pkValues.add(this.getForNumFormula());
        fields += " FOR_PROP_FORMULA = ?, ";
        values.add(this.getForPropFormula());
        fields += " FOR_FORMULA = ?, ";
        values.add(this.getForFormula());
        fields += " FOR_ANO_ALTA_REG = ?, ";
        values.add(this.getForAnoAltaReg());
        fields += " FOR_MES_ALTA_REG = ?, ";
        values.add(this.getForMesAltaReg());
        fields += " FOR_DIA_ALTA_REG = ?, ";
        values.add(this.getForDiaAltaReg());
        fields += " FOR_ANO_ULT_MOD = ?, ";
        values.add(this.getForAnoUltMod());
        fields += " FOR_MES_ULT_MOD = ?, ";
        values.add(this.getForMesUltMod());
        fields += " FOR_DIA_ULT_MOD = ?, ";
        values.add(this.getForDiaUltMod());
        fields += " FOR_CVE_ST_FORMULA = ?, ";
        values.add(this.getForCveStFormula());
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
        String sql = "INSERT INTO FORMULAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOR_CVE_FORMULA";
        fieldValues += ", ?";
        values.add(this.getForCveFormula());

        fields += ", FOR_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getForNumFormula());

        fields += ", FOR_PROP_FORMULA";
        fieldValues += ", ?";
        values.add(this.getForPropFormula());

        fields += ", FOR_FORMULA";
        fieldValues += ", ?";
        values.add(this.getForFormula());

        fields += ", FOR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getForAnoAltaReg());

        fields += ", FOR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getForMesAltaReg());

        fields += ", FOR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getForDiaAltaReg());

        fields += ", FOR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getForAnoUltMod());

        fields += ", FOR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getForMesUltMod());

        fields += ", FOR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getForDiaUltMod());

        fields += ", FOR_CVE_ST_FORMULA";
        fieldValues += ", ?";
        values.add(this.getForCveStFormula());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FORMULAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOR_CVE_FORMULA = ?";
        values.add(this.getForCveFormula());
        conditions += " AND FOR_NUM_FORMULA = ?";
        values.add(this.getForNumFormula());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Formulas instance = (Formulas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getForCveFormula().equals(instance.getForCveFormula()))
            equalObjects = false;
        if (equalObjects && !this.getForNumFormula().equals(instance.getForNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getForPropFormula().equals(instance.getForPropFormula()))
            equalObjects = false;
        if (equalObjects && !this.getForFormula().equals(instance.getForFormula()))
            equalObjects = false;
        if (equalObjects && !this.getForAnoAltaReg().equals(instance.getForAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getForMesAltaReg().equals(instance.getForMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getForDiaAltaReg().equals(instance.getForDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getForAnoUltMod().equals(instance.getForAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getForMesUltMod().equals(instance.getForMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getForDiaUltMod().equals(instance.getForDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getForCveStFormula().equals(instance.getForCveStFormula()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Formulas result = new Formulas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setForCveFormula((String) objectData.getData("FOR_CVE_FORMULA"));
        result.setForNumFormula((BigDecimal) objectData.getData("FOR_NUM_FORMULA"));
        result.setForPropFormula((String) objectData.getData("FOR_PROP_FORMULA"));
        result.setForFormula((String) objectData.getData("FOR_FORMULA"));
        result.setForAnoAltaReg((BigDecimal) objectData.getData("FOR_ANO_ALTA_REG"));
        result.setForMesAltaReg((BigDecimal) objectData.getData("FOR_MES_ALTA_REG"));
        result.setForDiaAltaReg((BigDecimal) objectData.getData("FOR_DIA_ALTA_REG"));
        result.setForAnoUltMod((BigDecimal) objectData.getData("FOR_ANO_ULT_MOD"));
        result.setForMesUltMod((BigDecimal) objectData.getData("FOR_MES_ULT_MOD"));
        result.setForDiaUltMod((BigDecimal) objectData.getData("FOR_DIA_ULT_MOD"));
        result.setForCveStFormula((String) objectData.getData("FOR_CVE_ST_FORMULA"));

        return result;

    }

}
