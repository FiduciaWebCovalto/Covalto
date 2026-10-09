package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FORMULA_PK", columns = { "FOR_CVE_FORMULAS", "CLA_DESCRIPCION", "CPO_SERIE", "CPO_ACTA_EMIS" }, sequences = { "MANUAL" })
public class Formula extends DomainObject {

    BigDecimal forCveFormulas = null;
    BigDecimal cpoActaEmis = null;
    String claDescripcion = null;
    String cpoSerie = null;
    String forDescripcion = null;
    BigDecimal forAnoAltReg = null;
    BigDecimal forMesAltReg = null;
    BigDecimal forDiaAltReg = null;
    BigDecimal forAnoUltMod = null;
    BigDecimal forMesUltMod = null;
    BigDecimal forDiaUltMod = null;
    String forCveStForm = null;
    String forNomFormula = null;

    public Formula() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setForCveFormulas(BigDecimal forCveFormulas) {
        this.forCveFormulas = forCveFormulas;
    }

    public BigDecimal getForCveFormulas() {
        return this.forCveFormulas;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpoActaEmis(BigDecimal cpoActaEmis) {
        this.cpoActaEmis = cpoActaEmis;
    }

    public BigDecimal getCpoActaEmis() {
        return this.cpoActaEmis;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setClaDescripcion(String claDescripcion) {
        this.claDescripcion = claDescripcion;
    }

    public String getClaDescripcion() {
        return this.claDescripcion;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoSerie(String cpoSerie) {
        this.cpoSerie = cpoSerie;
    }

    public String getCpoSerie() {
        return this.cpoSerie;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setForDescripcion(String forDescripcion) {
        this.forDescripcion = forDescripcion;
    }

    public String getForDescripcion() {
        return this.forDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setForAnoAltReg(BigDecimal forAnoAltReg) {
        this.forAnoAltReg = forAnoAltReg;
    }

    public BigDecimal getForAnoAltReg() {
        return this.forAnoAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setForMesAltReg(BigDecimal forMesAltReg) {
        this.forMesAltReg = forMesAltReg;
    }

    public BigDecimal getForMesAltReg() {
        return this.forMesAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setForDiaAltReg(BigDecimal forDiaAltReg) {
        this.forDiaAltReg = forDiaAltReg;
    }

    public BigDecimal getForDiaAltReg() {
        return this.forDiaAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setForAnoUltMod(BigDecimal forAnoUltMod) {
        this.forAnoUltMod = forAnoUltMod;
    }

    public BigDecimal getForAnoUltMod() {
        return this.forAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setForMesUltMod(BigDecimal forMesUltMod) {
        this.forMesUltMod = forMesUltMod;
    }

    public BigDecimal getForMesUltMod() {
        return this.forMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setForDiaUltMod(BigDecimal forDiaUltMod) {
        this.forDiaUltMod = forDiaUltMod;
    }

    public BigDecimal getForDiaUltMod() {
        return this.forDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setForCveStForm(String forCveStForm) {
        this.forCveStForm = forCveStForm;
    }

    public String getForCveStForm() {
        return this.forCveStForm;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setForNomFormula(String forNomFormula) {
        this.forNomFormula = forNomFormula;
    }

    public String getForNomFormula() {
        return this.forNomFormula;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FORMULA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getForCveFormulas() != null && this.getForCveFormulas().longValue() == -999) {
            conditions += " AND FOR_CVE_FORMULAS IS NULL";
        } else if (this.getForCveFormulas() != null) {
            conditions += " AND FOR_CVE_FORMULAS = ?";
            values.add(this.getForCveFormulas());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
        }

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
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
        String sql = "SELECT * FROM FORMULA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getForCveFormulas() != null && this.getForCveFormulas().longValue() == -999) {
            conditions += " AND FOR_CVE_FORMULAS IS NULL";
        } else if (this.getForCveFormulas() != null) {
            conditions += " AND FOR_CVE_FORMULAS = ?";
            values.add(this.getForCveFormulas());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
        }

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
        }

        if (this.getForDescripcion() != null && "null".equals(this.getForDescripcion())) {
            conditions += " AND FOR_DESCRIPCION IS NULL";
        } else if (this.getForDescripcion() != null) {
            conditions += " AND FOR_DESCRIPCION = ?";
            values.add(this.getForDescripcion());
        }

        if (this.getForAnoAltReg() != null && this.getForAnoAltReg().longValue() == -999) {
            conditions += " AND FOR_ANO_ALT_REG IS NULL";
        } else if (this.getForAnoAltReg() != null) {
            conditions += " AND FOR_ANO_ALT_REG = ?";
            values.add(this.getForAnoAltReg());
        }

        if (this.getForMesAltReg() != null && this.getForMesAltReg().longValue() == -999) {
            conditions += " AND FOR_MES_ALT_REG IS NULL";
        } else if (this.getForMesAltReg() != null) {
            conditions += " AND FOR_MES_ALT_REG = ?";
            values.add(this.getForMesAltReg());
        }

        if (this.getForDiaAltReg() != null && this.getForDiaAltReg().longValue() == -999) {
            conditions += " AND FOR_DIA_ALT_REG IS NULL";
        } else if (this.getForDiaAltReg() != null) {
            conditions += " AND FOR_DIA_ALT_REG = ?";
            values.add(this.getForDiaAltReg());
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

        if (this.getForCveStForm() != null && "null".equals(this.getForCveStForm())) {
            conditions += " AND FOR_CVE_ST_FORM IS NULL";
        } else if (this.getForCveStForm() != null) {
            conditions += " AND FOR_CVE_ST_FORM = ?";
            values.add(this.getForCveStForm());
        }

        if (this.getForNomFormula() != null && "null".equals(this.getForNomFormula())) {
            conditions += " AND FOR_NOM_FORMULA IS NULL";
        } else if (this.getForNomFormula() != null) {
            conditions += " AND FOR_NOM_FORMULA = ?";
            values.add(this.getForNomFormula());
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
        String sql = "UPDATE FORMULA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOR_CVE_FORMULAS = ?";
        pkValues.add(this.getForCveFormulas());
        conditions += " AND CPO_ACTA_EMIS = ?";
        pkValues.add(this.getCpoActaEmis());
        conditions += " AND CLA_DESCRIPCION = ?";
        pkValues.add(this.getClaDescripcion());
        conditions += " AND CPO_SERIE = ?";
        pkValues.add(this.getCpoSerie());
        fields += " FOR_DESCRIPCION = ?, ";
        values.add(this.getForDescripcion());
        fields += " FOR_ANO_ALT_REG = ?, ";
        values.add(this.getForAnoAltReg());
        fields += " FOR_MES_ALT_REG = ?, ";
        values.add(this.getForMesAltReg());
        fields += " FOR_DIA_ALT_REG = ?, ";
        values.add(this.getForDiaAltReg());
        fields += " FOR_ANO_ULT_MOD = ?, ";
        values.add(this.getForAnoUltMod());
        fields += " FOR_MES_ULT_MOD = ?, ";
        values.add(this.getForMesUltMod());
        fields += " FOR_DIA_ULT_MOD = ?, ";
        values.add(this.getForDiaUltMod());
        fields += " FOR_CVE_ST_FORM = ?, ";
        values.add(this.getForCveStForm());
        fields += " FOR_NOM_FORMULA = ?, ";
        values.add(this.getForNomFormula());
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
        String sql = "INSERT INTO FORMULA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOR_CVE_FORMULAS";
        fieldValues += ", ?";
        values.add(this.getForCveFormulas());

        fields += ", CPO_ACTA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoActaEmis());

        fields += ", CLA_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getClaDescripcion());

        fields += ", CPO_SERIE";
        fieldValues += ", ?";
        values.add(this.getCpoSerie());

        fields += ", FOR_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getForDescripcion());

        fields += ", FOR_ANO_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getForAnoAltReg());

        fields += ", FOR_MES_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getForMesAltReg());

        fields += ", FOR_DIA_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getForDiaAltReg());

        fields += ", FOR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getForAnoUltMod());

        fields += ", FOR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getForMesUltMod());

        fields += ", FOR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getForDiaUltMod());

        fields += ", FOR_CVE_ST_FORM";
        fieldValues += ", ?";
        values.add(this.getForCveStForm());

        fields += ", FOR_NOM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getForNomFormula());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FORMULA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOR_CVE_FORMULAS = ?";
        values.add(this.getForCveFormulas());
        conditions += " AND CPO_ACTA_EMIS = ?";
        values.add(this.getCpoActaEmis());
        conditions += " AND CLA_DESCRIPCION = ?";
        values.add(this.getClaDescripcion());
        conditions += " AND CPO_SERIE = ?";
        values.add(this.getCpoSerie());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Formula instance = (Formula) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getForCveFormulas().equals(instance.getForCveFormulas()))
            equalObjects = false;
        if (equalObjects && !this.getCpoActaEmis().equals(instance.getCpoActaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getClaDescripcion().equals(instance.getClaDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getCpoSerie().equals(instance.getCpoSerie()))
            equalObjects = false;
        if (equalObjects && !this.getForDescripcion().equals(instance.getForDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getForAnoAltReg().equals(instance.getForAnoAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getForMesAltReg().equals(instance.getForMesAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getForDiaAltReg().equals(instance.getForDiaAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getForAnoUltMod().equals(instance.getForAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getForMesUltMod().equals(instance.getForMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getForDiaUltMod().equals(instance.getForDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getForCveStForm().equals(instance.getForCveStForm()))
            equalObjects = false;
        if (equalObjects && !this.getForNomFormula().equals(instance.getForNomFormula()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Formula result = new Formula();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setForCveFormulas((BigDecimal) objectData.getData("FOR_CVE_FORMULAS"));
        result.setCpoActaEmis((BigDecimal) objectData.getData("CPO_ACTA_EMIS"));
        result.setClaDescripcion((String) objectData.getData("CLA_DESCRIPCION"));
        result.setCpoSerie((String) objectData.getData("CPO_SERIE"));
        result.setForDescripcion((String) objectData.getData("FOR_DESCRIPCION"));
        result.setForAnoAltReg((BigDecimal) objectData.getData("FOR_ANO_ALT_REG"));
        result.setForMesAltReg((BigDecimal) objectData.getData("FOR_MES_ALT_REG"));
        result.setForDiaAltReg((BigDecimal) objectData.getData("FOR_DIA_ALT_REG"));
        result.setForAnoUltMod((BigDecimal) objectData.getData("FOR_ANO_ULT_MOD"));
        result.setForMesUltMod((BigDecimal) objectData.getData("FOR_MES_ULT_MOD"));
        result.setForDiaUltMod((BigDecimal) objectData.getData("FOR_DIA_ULT_MOD"));
        result.setForCveStForm((String) objectData.getData("FOR_CVE_ST_FORM"));
        result.setForNomFormula((String) objectData.getData("FOR_NOM_FORMULA"));

        return result;

    }

}
