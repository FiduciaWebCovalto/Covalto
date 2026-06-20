package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISINFLA_PK", columns = { "EFL_NUM_PROGRAMA", "EFL_NUM_EMISION" }, sequences = { "MANUAL" })
public class Emisinfla extends DomainObject {

    BigDecimal eflNumPrograma = null;
    BigDecimal eflNumEmision = null;
    BigDecimal eflTasaIntsReal = null;
    BigDecimal eflNumPeriodos = null;
    BigDecimal eflAnoAltaReg = null;
    BigDecimal eflMesAltaReg = null;
    BigDecimal eflDiaAltaReg = null;
    BigDecimal eflAnoUltMod = null;
    BigDecimal eflMesUltMod = null;
    BigDecimal eflDiaUltMod = null;
    String eflCveStEmisinfla = null;

    public Emisinfla() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEflNumPrograma(BigDecimal eflNumPrograma) {
        this.eflNumPrograma = eflNumPrograma;
    }

    public BigDecimal getEflNumPrograma() {
        return this.eflNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEflNumEmision(BigDecimal eflNumEmision) {
        this.eflNumEmision = eflNumEmision;
    }

    public BigDecimal getEflNumEmision() {
        return this.eflNumEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 9, javaClass = BigDecimal.class)
    public void setEflTasaIntsReal(BigDecimal eflTasaIntsReal) {
        this.eflTasaIntsReal = eflTasaIntsReal;
    }

    public BigDecimal getEflTasaIntsReal() {
        return this.eflTasaIntsReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEflNumPeriodos(BigDecimal eflNumPeriodos) {
        this.eflNumPeriodos = eflNumPeriodos;
    }

    public BigDecimal getEflNumPeriodos() {
        return this.eflNumPeriodos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEflAnoAltaReg(BigDecimal eflAnoAltaReg) {
        this.eflAnoAltaReg = eflAnoAltaReg;
    }

    public BigDecimal getEflAnoAltaReg() {
        return this.eflAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEflMesAltaReg(BigDecimal eflMesAltaReg) {
        this.eflMesAltaReg = eflMesAltaReg;
    }

    public BigDecimal getEflMesAltaReg() {
        return this.eflMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEflDiaAltaReg(BigDecimal eflDiaAltaReg) {
        this.eflDiaAltaReg = eflDiaAltaReg;
    }

    public BigDecimal getEflDiaAltaReg() {
        return this.eflDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEflAnoUltMod(BigDecimal eflAnoUltMod) {
        this.eflAnoUltMod = eflAnoUltMod;
    }

    public BigDecimal getEflAnoUltMod() {
        return this.eflAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEflMesUltMod(BigDecimal eflMesUltMod) {
        this.eflMesUltMod = eflMesUltMod;
    }

    public BigDecimal getEflMesUltMod() {
        return this.eflMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEflDiaUltMod(BigDecimal eflDiaUltMod) {
        this.eflDiaUltMod = eflDiaUltMod;
    }

    public BigDecimal getEflDiaUltMod() {
        return this.eflDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEflCveStEmisinfla(String eflCveStEmisinfla) {
        this.eflCveStEmisinfla = eflCveStEmisinfla;
    }

    public String getEflCveStEmisinfla() {
        return this.eflCveStEmisinfla;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISINFLA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEflNumPrograma() != null && this.getEflNumPrograma().longValue() == -999) {
            conditions += " AND EFL_NUM_PROGRAMA IS NULL";
        } else if (this.getEflNumPrograma() != null) {
            conditions += " AND EFL_NUM_PROGRAMA = ?";
            values.add(this.getEflNumPrograma());
        }

        if (this.getEflNumEmision() != null && this.getEflNumEmision().longValue() == -999) {
            conditions += " AND EFL_NUM_EMISION IS NULL";
        } else if (this.getEflNumEmision() != null) {
            conditions += " AND EFL_NUM_EMISION = ?";
            values.add(this.getEflNumEmision());
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
        String sql = "SELECT * FROM EMISINFLA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEflNumPrograma() != null && this.getEflNumPrograma().longValue() == -999) {
            conditions += " AND EFL_NUM_PROGRAMA IS NULL";
        } else if (this.getEflNumPrograma() != null) {
            conditions += " AND EFL_NUM_PROGRAMA = ?";
            values.add(this.getEflNumPrograma());
        }

        if (this.getEflNumEmision() != null && this.getEflNumEmision().longValue() == -999) {
            conditions += " AND EFL_NUM_EMISION IS NULL";
        } else if (this.getEflNumEmision() != null) {
            conditions += " AND EFL_NUM_EMISION = ?";
            values.add(this.getEflNumEmision());
        }

        if (this.getEflTasaIntsReal() != null && this.getEflTasaIntsReal().longValue() == -999) {
            conditions += " AND EFL_TASA_INTS_REAL IS NULL";
        } else if (this.getEflTasaIntsReal() != null) {
            conditions += " AND EFL_TASA_INTS_REAL = ?";
            values.add(this.getEflTasaIntsReal());
        }

        if (this.getEflNumPeriodos() != null && this.getEflNumPeriodos().longValue() == -999) {
            conditions += " AND EFL_NUM_PERIODOS IS NULL";
        } else if (this.getEflNumPeriodos() != null) {
            conditions += " AND EFL_NUM_PERIODOS = ?";
            values.add(this.getEflNumPeriodos());
        }

        if (this.getEflAnoAltaReg() != null && this.getEflAnoAltaReg().longValue() == -999) {
            conditions += " AND EFL_ANO_ALTA_REG IS NULL";
        } else if (this.getEflAnoAltaReg() != null) {
            conditions += " AND EFL_ANO_ALTA_REG = ?";
            values.add(this.getEflAnoAltaReg());
        }

        if (this.getEflMesAltaReg() != null && this.getEflMesAltaReg().longValue() == -999) {
            conditions += " AND EFL_MES_ALTA_REG IS NULL";
        } else if (this.getEflMesAltaReg() != null) {
            conditions += " AND EFL_MES_ALTA_REG = ?";
            values.add(this.getEflMesAltaReg());
        }

        if (this.getEflDiaAltaReg() != null && this.getEflDiaAltaReg().longValue() == -999) {
            conditions += " AND EFL_DIA_ALTA_REG IS NULL";
        } else if (this.getEflDiaAltaReg() != null) {
            conditions += " AND EFL_DIA_ALTA_REG = ?";
            values.add(this.getEflDiaAltaReg());
        }

        if (this.getEflAnoUltMod() != null && this.getEflAnoUltMod().longValue() == -999) {
            conditions += " AND EFL_ANO_ULT_MOD IS NULL";
        } else if (this.getEflAnoUltMod() != null) {
            conditions += " AND EFL_ANO_ULT_MOD = ?";
            values.add(this.getEflAnoUltMod());
        }

        if (this.getEflMesUltMod() != null && this.getEflMesUltMod().longValue() == -999) {
            conditions += " AND EFL_MES_ULT_MOD IS NULL";
        } else if (this.getEflMesUltMod() != null) {
            conditions += " AND EFL_MES_ULT_MOD = ?";
            values.add(this.getEflMesUltMod());
        }

        if (this.getEflDiaUltMod() != null && this.getEflDiaUltMod().longValue() == -999) {
            conditions += " AND EFL_DIA_ULT_MOD IS NULL";
        } else if (this.getEflDiaUltMod() != null) {
            conditions += " AND EFL_DIA_ULT_MOD = ?";
            values.add(this.getEflDiaUltMod());
        }

        if (this.getEflCveStEmisinfla() != null && "null".equals(this.getEflCveStEmisinfla())) {
            conditions += " AND EFL_CVE_ST_EMISINFLA IS NULL";
        } else if (this.getEflCveStEmisinfla() != null) {
            conditions += " AND EFL_CVE_ST_EMISINFLA = ?";
            values.add(this.getEflCveStEmisinfla());
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
        String sql = "UPDATE EMISINFLA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EFL_NUM_PROGRAMA = ?";
        pkValues.add(this.getEflNumPrograma());
        conditions += " AND EFL_NUM_EMISION = ?";
        pkValues.add(this.getEflNumEmision());
        fields += " EFL_TASA_INTS_REAL = ?, ";
        values.add(this.getEflTasaIntsReal());
        fields += " EFL_NUM_PERIODOS = ?, ";
        values.add(this.getEflNumPeriodos());
        fields += " EFL_ANO_ALTA_REG = ?, ";
        values.add(this.getEflAnoAltaReg());
        fields += " EFL_MES_ALTA_REG = ?, ";
        values.add(this.getEflMesAltaReg());
        fields += " EFL_DIA_ALTA_REG = ?, ";
        values.add(this.getEflDiaAltaReg());
        fields += " EFL_ANO_ULT_MOD = ?, ";
        values.add(this.getEflAnoUltMod());
        fields += " EFL_MES_ULT_MOD = ?, ";
        values.add(this.getEflMesUltMod());
        fields += " EFL_DIA_ULT_MOD = ?, ";
        values.add(this.getEflDiaUltMod());
        fields += " EFL_CVE_ST_EMISINFLA = ?, ";
        values.add(this.getEflCveStEmisinfla());
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
        String sql = "INSERT INTO EMISINFLA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EFL_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEflNumPrograma());

        fields += ", EFL_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEflNumEmision());

        fields += ", EFL_TASA_INTS_REAL";
        fieldValues += ", ?";
        values.add(this.getEflTasaIntsReal());

        fields += ", EFL_NUM_PERIODOS";
        fieldValues += ", ?";
        values.add(this.getEflNumPeriodos());

        fields += ", EFL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEflAnoAltaReg());

        fields += ", EFL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEflMesAltaReg());

        fields += ", EFL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEflDiaAltaReg());

        fields += ", EFL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEflAnoUltMod());

        fields += ", EFL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEflMesUltMod());

        fields += ", EFL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEflDiaUltMod());

        fields += ", EFL_CVE_ST_EMISINFLA";
        fieldValues += ", ?";
        values.add(this.getEflCveStEmisinfla());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISINFLA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EFL_NUM_PROGRAMA = ?";
        values.add(this.getEflNumPrograma());
        conditions += " AND EFL_NUM_EMISION = ?";
        values.add(this.getEflNumEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisinfla instance = (Emisinfla) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEflNumPrograma().equals(instance.getEflNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEflNumEmision().equals(instance.getEflNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEflTasaIntsReal().equals(instance.getEflTasaIntsReal()))
            equalObjects = false;
        if (equalObjects && !this.getEflNumPeriodos().equals(instance.getEflNumPeriodos()))
            equalObjects = false;
        if (equalObjects && !this.getEflAnoAltaReg().equals(instance.getEflAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEflMesAltaReg().equals(instance.getEflMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEflDiaAltaReg().equals(instance.getEflDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEflAnoUltMod().equals(instance.getEflAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEflMesUltMod().equals(instance.getEflMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEflDiaUltMod().equals(instance.getEflDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEflCveStEmisinfla().equals(instance.getEflCveStEmisinfla()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisinfla result = new Emisinfla();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEflNumPrograma((BigDecimal) objectData.getData("EFL_NUM_PROGRAMA"));
        result.setEflNumEmision((BigDecimal) objectData.getData("EFL_NUM_EMISION"));
        result.setEflTasaIntsReal((BigDecimal) objectData.getData("EFL_TASA_INTS_REAL"));
        result.setEflNumPeriodos((BigDecimal) objectData.getData("EFL_NUM_PERIODOS"));
        result.setEflAnoAltaReg((BigDecimal) objectData.getData("EFL_ANO_ALTA_REG"));
        result.setEflMesAltaReg((BigDecimal) objectData.getData("EFL_MES_ALTA_REG"));
        result.setEflDiaAltaReg((BigDecimal) objectData.getData("EFL_DIA_ALTA_REG"));
        result.setEflAnoUltMod((BigDecimal) objectData.getData("EFL_ANO_ULT_MOD"));
        result.setEflMesUltMod((BigDecimal) objectData.getData("EFL_MES_ULT_MOD"));
        result.setEflDiaUltMod((BigDecimal) objectData.getData("EFL_DIA_ULT_MOD"));
        result.setEflCveStEmisinfla((String) objectData.getData("EFL_CVE_ST_EMISINFLA"));

        return result;

    }

}
