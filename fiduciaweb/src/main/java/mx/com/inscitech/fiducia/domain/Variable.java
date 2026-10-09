package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "VARIABLE_PK", columns = { "VAR_CVE_VARIABLE", "FOR_CVE_FORMULAS", "CLA_DESCRIPCION", "CPO_SERIE", "CPO_ACTA_EMIS" }, sequences = { "MANUAL" })
public class Variable extends DomainObject {

    BigDecimal forCveFormulas = null;
    String varCveVariable = null;
    BigDecimal cpoActaEmis = null;
    String claDescripcion = null;
    String cpoSerie = null;
    String varDescripcion = null;
    BigDecimal varAnoAltReg = null;
    BigDecimal varMesAltReg = null;
    BigDecimal varDiaAltReg = null;
    BigDecimal varAnoUltMod = null;
    BigDecimal varMesUltMod = null;
    BigDecimal varDiaUltMod = null;
    String varCveStVar = null;
    BigDecimal varDepende = null;

    public Variable() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setForCveFormulas(BigDecimal forCveFormulas) {
        this.forCveFormulas = forCveFormulas;
    }

    public BigDecimal getForCveFormulas() {
        return this.forCveFormulas;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVarCveVariable(String varCveVariable) {
        this.varCveVariable = varCveVariable;
    }

    public String getVarCveVariable() {
        return this.varCveVariable;
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
    public void setVarDescripcion(String varDescripcion) {
        this.varDescripcion = varDescripcion;
    }

    public String getVarDescripcion() {
        return this.varDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setVarAnoAltReg(BigDecimal varAnoAltReg) {
        this.varAnoAltReg = varAnoAltReg;
    }

    public BigDecimal getVarAnoAltReg() {
        return this.varAnoAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVarMesAltReg(BigDecimal varMesAltReg) {
        this.varMesAltReg = varMesAltReg;
    }

    public BigDecimal getVarMesAltReg() {
        return this.varMesAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVarDiaAltReg(BigDecimal varDiaAltReg) {
        this.varDiaAltReg = varDiaAltReg;
    }

    public BigDecimal getVarDiaAltReg() {
        return this.varDiaAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setVarAnoUltMod(BigDecimal varAnoUltMod) {
        this.varAnoUltMod = varAnoUltMod;
    }

    public BigDecimal getVarAnoUltMod() {
        return this.varAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVarMesUltMod(BigDecimal varMesUltMod) {
        this.varMesUltMod = varMesUltMod;
    }

    public BigDecimal getVarMesUltMod() {
        return this.varMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVarDiaUltMod(BigDecimal varDiaUltMod) {
        this.varDiaUltMod = varDiaUltMod;
    }

    public BigDecimal getVarDiaUltMod() {
        return this.varDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVarCveStVar(String varCveStVar) {
        this.varCveStVar = varCveStVar;
    }

    public String getVarCveStVar() {
        return this.varCveStVar;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setVarDepende(BigDecimal varDepende) {
        this.varDepende = varDepende;
    }

    public BigDecimal getVarDepende() {
        return this.varDepende;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM VARIABLE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getForCveFormulas() != null && this.getForCveFormulas().longValue() == -999) {
            conditions += " AND FOR_CVE_FORMULAS IS NULL";
        } else if (this.getForCveFormulas() != null) {
            conditions += " AND FOR_CVE_FORMULAS = ?";
            values.add(this.getForCveFormulas());
        }

        if (this.getVarCveVariable() != null && "null".equals(this.getVarCveVariable())) {
            conditions += " AND VAR_CVE_VARIABLE IS NULL";
        } else if (this.getVarCveVariable() != null) {
            conditions += " AND VAR_CVE_VARIABLE = ?";
            values.add(this.getVarCveVariable());
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
        String sql = "SELECT * FROM VARIABLE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getForCveFormulas() != null && this.getForCveFormulas().longValue() == -999) {
            conditions += " AND FOR_CVE_FORMULAS IS NULL";
        } else if (this.getForCveFormulas() != null) {
            conditions += " AND FOR_CVE_FORMULAS = ?";
            values.add(this.getForCveFormulas());
        }

        if (this.getVarCveVariable() != null && "null".equals(this.getVarCveVariable())) {
            conditions += " AND VAR_CVE_VARIABLE IS NULL";
        } else if (this.getVarCveVariable() != null) {
            conditions += " AND VAR_CVE_VARIABLE = ?";
            values.add(this.getVarCveVariable());
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

        if (this.getVarDescripcion() != null && "null".equals(this.getVarDescripcion())) {
            conditions += " AND VAR_DESCRIPCION IS NULL";
        } else if (this.getVarDescripcion() != null) {
            conditions += " AND VAR_DESCRIPCION = ?";
            values.add(this.getVarDescripcion());
        }

        if (this.getVarAnoAltReg() != null && this.getVarAnoAltReg().longValue() == -999) {
            conditions += " AND VAR_ANO_ALT_REG IS NULL";
        } else if (this.getVarAnoAltReg() != null) {
            conditions += " AND VAR_ANO_ALT_REG = ?";
            values.add(this.getVarAnoAltReg());
        }

        if (this.getVarMesAltReg() != null && this.getVarMesAltReg().longValue() == -999) {
            conditions += " AND VAR_MES_ALT_REG IS NULL";
        } else if (this.getVarMesAltReg() != null) {
            conditions += " AND VAR_MES_ALT_REG = ?";
            values.add(this.getVarMesAltReg());
        }

        if (this.getVarDiaAltReg() != null && this.getVarDiaAltReg().longValue() == -999) {
            conditions += " AND VAR_DIA_ALT_REG IS NULL";
        } else if (this.getVarDiaAltReg() != null) {
            conditions += " AND VAR_DIA_ALT_REG = ?";
            values.add(this.getVarDiaAltReg());
        }

        if (this.getVarAnoUltMod() != null && this.getVarAnoUltMod().longValue() == -999) {
            conditions += " AND VAR_ANO_ULT_MOD IS NULL";
        } else if (this.getVarAnoUltMod() != null) {
            conditions += " AND VAR_ANO_ULT_MOD = ?";
            values.add(this.getVarAnoUltMod());
        }

        if (this.getVarMesUltMod() != null && this.getVarMesUltMod().longValue() == -999) {
            conditions += " AND VAR_MES_ULT_MOD IS NULL";
        } else if (this.getVarMesUltMod() != null) {
            conditions += " AND VAR_MES_ULT_MOD = ?";
            values.add(this.getVarMesUltMod());
        }

        if (this.getVarDiaUltMod() != null && this.getVarDiaUltMod().longValue() == -999) {
            conditions += " AND VAR_DIA_ULT_MOD IS NULL";
        } else if (this.getVarDiaUltMod() != null) {
            conditions += " AND VAR_DIA_ULT_MOD = ?";
            values.add(this.getVarDiaUltMod());
        }

        if (this.getVarCveStVar() != null && "null".equals(this.getVarCveStVar())) {
            conditions += " AND VAR_CVE_ST_VAR IS NULL";
        } else if (this.getVarCveStVar() != null) {
            conditions += " AND VAR_CVE_ST_VAR = ?";
            values.add(this.getVarCveStVar());
        }

        if (this.getVarDepende() != null && this.getVarDepende().longValue() == -999) {
            conditions += " AND VAR_DEPENDE IS NULL";
        } else if (this.getVarDepende() != null) {
            conditions += " AND VAR_DEPENDE = ?";
            values.add(this.getVarDepende());
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
        String sql = "UPDATE VARIABLE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOR_CVE_FORMULAS = ?";
        pkValues.add(this.getForCveFormulas());
        conditions += " AND VAR_CVE_VARIABLE = ?";
        pkValues.add(this.getVarCveVariable());
        conditions += " AND CPO_ACTA_EMIS = ?";
        pkValues.add(this.getCpoActaEmis());
        conditions += " AND CLA_DESCRIPCION = ?";
        pkValues.add(this.getClaDescripcion());
        conditions += " AND CPO_SERIE = ?";
        pkValues.add(this.getCpoSerie());
        fields += " VAR_DESCRIPCION = ?, ";
        values.add(this.getVarDescripcion());
        fields += " VAR_ANO_ALT_REG = ?, ";
        values.add(this.getVarAnoAltReg());
        fields += " VAR_MES_ALT_REG = ?, ";
        values.add(this.getVarMesAltReg());
        fields += " VAR_DIA_ALT_REG = ?, ";
        values.add(this.getVarDiaAltReg());
        fields += " VAR_ANO_ULT_MOD = ?, ";
        values.add(this.getVarAnoUltMod());
        fields += " VAR_MES_ULT_MOD = ?, ";
        values.add(this.getVarMesUltMod());
        fields += " VAR_DIA_ULT_MOD = ?, ";
        values.add(this.getVarDiaUltMod());
        fields += " VAR_CVE_ST_VAR = ?, ";
        values.add(this.getVarCveStVar());
        fields += " VAR_DEPENDE = ?, ";
        values.add(this.getVarDepende());
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
        String sql = "INSERT INTO VARIABLE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOR_CVE_FORMULAS";
        fieldValues += ", ?";
        values.add(this.getForCveFormulas());

        fields += ", VAR_CVE_VARIABLE";
        fieldValues += ", ?";
        values.add(this.getVarCveVariable());

        fields += ", CPO_ACTA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoActaEmis());

        fields += ", CLA_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getClaDescripcion());

        fields += ", CPO_SERIE";
        fieldValues += ", ?";
        values.add(this.getCpoSerie());

        fields += ", VAR_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getVarDescripcion());

        fields += ", VAR_ANO_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getVarAnoAltReg());

        fields += ", VAR_MES_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getVarMesAltReg());

        fields += ", VAR_DIA_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getVarDiaAltReg());

        fields += ", VAR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVarAnoUltMod());

        fields += ", VAR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVarMesUltMod());

        fields += ", VAR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVarDiaUltMod());

        fields += ", VAR_CVE_ST_VAR";
        fieldValues += ", ?";
        values.add(this.getVarCveStVar());

        fields += ", VAR_DEPENDE";
        fieldValues += ", ?";
        values.add(this.getVarDepende());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM VARIABLE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOR_CVE_FORMULAS = ?";
        values.add(this.getForCveFormulas());
        conditions += " AND VAR_CVE_VARIABLE = ?";
        values.add(this.getVarCveVariable());
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
        Variable instance = (Variable) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getForCveFormulas().equals(instance.getForCveFormulas()))
            equalObjects = false;
        if (equalObjects && !this.getVarCveVariable().equals(instance.getVarCveVariable()))
            equalObjects = false;
        if (equalObjects && !this.getCpoActaEmis().equals(instance.getCpoActaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getClaDescripcion().equals(instance.getClaDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getCpoSerie().equals(instance.getCpoSerie()))
            equalObjects = false;
        if (equalObjects && !this.getVarDescripcion().equals(instance.getVarDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getVarAnoAltReg().equals(instance.getVarAnoAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getVarMesAltReg().equals(instance.getVarMesAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getVarDiaAltReg().equals(instance.getVarDiaAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getVarAnoUltMod().equals(instance.getVarAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVarMesUltMod().equals(instance.getVarMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVarDiaUltMod().equals(instance.getVarDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVarCveStVar().equals(instance.getVarCveStVar()))
            equalObjects = false;
        if (equalObjects && !this.getVarDepende().equals(instance.getVarDepende()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Variable result = new Variable();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setForCveFormulas((BigDecimal) objectData.getData("FOR_CVE_FORMULAS"));
        result.setVarCveVariable((String) objectData.getData("VAR_CVE_VARIABLE"));
        result.setCpoActaEmis((BigDecimal) objectData.getData("CPO_ACTA_EMIS"));
        result.setClaDescripcion((String) objectData.getData("CLA_DESCRIPCION"));
        result.setCpoSerie((String) objectData.getData("CPO_SERIE"));
        result.setVarDescripcion((String) objectData.getData("VAR_DESCRIPCION"));
        result.setVarAnoAltReg((BigDecimal) objectData.getData("VAR_ANO_ALT_REG"));
        result.setVarMesAltReg((BigDecimal) objectData.getData("VAR_MES_ALT_REG"));
        result.setVarDiaAltReg((BigDecimal) objectData.getData("VAR_DIA_ALT_REG"));
        result.setVarAnoUltMod((BigDecimal) objectData.getData("VAR_ANO_ULT_MOD"));
        result.setVarMesUltMod((BigDecimal) objectData.getData("VAR_MES_ULT_MOD"));
        result.setVarDiaUltMod((BigDecimal) objectData.getData("VAR_DIA_ULT_MOD"));
        result.setVarCveStVar((String) objectData.getData("VAR_CVE_ST_VAR"));
        result.setVarDepende((BigDecimal) objectData.getData("VAR_DEPENDE"));

        return result;

    }

}
