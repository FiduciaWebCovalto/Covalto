package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMSSEGR_PK", columns = { "ESE_NUM_PROGRAMA", "ESE_NUM_EMISION", "ESE_NUM_SEC_CUPON" }, sequences = { "MANUAL" })
public class Emssegr extends DomainObject {

    BigDecimal eseNumSecCupon = null;
    String eseCveCupon = null;
    BigDecimal eseNumSerie = null;
    BigDecimal esePlazo = null;
    String eseCvePeriodo = null;
    BigDecimal eseAnoInicio = null;
    BigDecimal eseMesInicio = null;
    BigDecimal eseDiaInicio = null;
    BigDecimal eseAnoVencimiento = null;
    BigDecimal eseMesVencimiento = null;
    BigDecimal eseDiaVencimiento = null;
    BigDecimal eseAnoAltaReg = null;
    BigDecimal eseMesAltaReg = null;
    BigDecimal eseDiaAltaReg = null;
    BigDecimal eseAnoUltMod = null;
    BigDecimal eseMesUltMod = null;
    BigDecimal eseDiaUltMod = null;
    String eseCveStEmissegr = null;
    BigDecimal eseNumPrograma = null;
    BigDecimal eseNumEmision = null;

    public Emssegr() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEseNumSecCupon(BigDecimal eseNumSecCupon) {
        this.eseNumSecCupon = eseNumSecCupon;
    }

    public BigDecimal getEseNumSecCupon() {
        return this.eseNumSecCupon;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEseCveCupon(String eseCveCupon) {
        this.eseCveCupon = eseCveCupon;
    }

    public String getEseCveCupon() {
        return this.eseCveCupon;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEseNumSerie(BigDecimal eseNumSerie) {
        this.eseNumSerie = eseNumSerie;
    }

    public BigDecimal getEseNumSerie() {
        return this.eseNumSerie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEsePlazo(BigDecimal esePlazo) {
        this.esePlazo = esePlazo;
    }

    public BigDecimal getEsePlazo() {
        return this.esePlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEseCvePeriodo(String eseCvePeriodo) {
        this.eseCvePeriodo = eseCvePeriodo;
    }

    public String getEseCvePeriodo() {
        return this.eseCvePeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEseAnoInicio(BigDecimal eseAnoInicio) {
        this.eseAnoInicio = eseAnoInicio;
    }

    public BigDecimal getEseAnoInicio() {
        return this.eseAnoInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEseMesInicio(BigDecimal eseMesInicio) {
        this.eseMesInicio = eseMesInicio;
    }

    public BigDecimal getEseMesInicio() {
        return this.eseMesInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEseDiaInicio(BigDecimal eseDiaInicio) {
        this.eseDiaInicio = eseDiaInicio;
    }

    public BigDecimal getEseDiaInicio() {
        return this.eseDiaInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEseAnoVencimiento(BigDecimal eseAnoVencimiento) {
        this.eseAnoVencimiento = eseAnoVencimiento;
    }

    public BigDecimal getEseAnoVencimiento() {
        return this.eseAnoVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEseMesVencimiento(BigDecimal eseMesVencimiento) {
        this.eseMesVencimiento = eseMesVencimiento;
    }

    public BigDecimal getEseMesVencimiento() {
        return this.eseMesVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEseDiaVencimiento(BigDecimal eseDiaVencimiento) {
        this.eseDiaVencimiento = eseDiaVencimiento;
    }

    public BigDecimal getEseDiaVencimiento() {
        return this.eseDiaVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEseAnoAltaReg(BigDecimal eseAnoAltaReg) {
        this.eseAnoAltaReg = eseAnoAltaReg;
    }

    public BigDecimal getEseAnoAltaReg() {
        return this.eseAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEseMesAltaReg(BigDecimal eseMesAltaReg) {
        this.eseMesAltaReg = eseMesAltaReg;
    }

    public BigDecimal getEseMesAltaReg() {
        return this.eseMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEseDiaAltaReg(BigDecimal eseDiaAltaReg) {
        this.eseDiaAltaReg = eseDiaAltaReg;
    }

    public BigDecimal getEseDiaAltaReg() {
        return this.eseDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEseAnoUltMod(BigDecimal eseAnoUltMod) {
        this.eseAnoUltMod = eseAnoUltMod;
    }

    public BigDecimal getEseAnoUltMod() {
        return this.eseAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEseMesUltMod(BigDecimal eseMesUltMod) {
        this.eseMesUltMod = eseMesUltMod;
    }

    public BigDecimal getEseMesUltMod() {
        return this.eseMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEseDiaUltMod(BigDecimal eseDiaUltMod) {
        this.eseDiaUltMod = eseDiaUltMod;
    }

    public BigDecimal getEseDiaUltMod() {
        return this.eseDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEseCveStEmissegr(String eseCveStEmissegr) {
        this.eseCveStEmissegr = eseCveStEmissegr;
    }

    public String getEseCveStEmissegr() {
        return this.eseCveStEmissegr;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEseNumPrograma(BigDecimal eseNumPrograma) {
        this.eseNumPrograma = eseNumPrograma;
    }

    public BigDecimal getEseNumPrograma() {
        return this.eseNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEseNumEmision(BigDecimal eseNumEmision) {
        this.eseNumEmision = eseNumEmision;
    }

    public BigDecimal getEseNumEmision() {
        return this.eseNumEmision;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMSSEGR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEseNumSecCupon() != null && this.getEseNumSecCupon().longValue() == -999) {
            conditions += " AND ESE_NUM_SEC_CUPON IS NULL";
        } else if (this.getEseNumSecCupon() != null) {
            conditions += " AND ESE_NUM_SEC_CUPON = ?";
            values.add(this.getEseNumSecCupon());
        }

        if (this.getEseNumPrograma() != null && this.getEseNumPrograma().longValue() == -999) {
            conditions += " AND ESE_NUM_PROGRAMA IS NULL";
        } else if (this.getEseNumPrograma() != null) {
            conditions += " AND ESE_NUM_PROGRAMA = ?";
            values.add(this.getEseNumPrograma());
        }

        if (this.getEseNumEmision() != null && this.getEseNumEmision().longValue() == -999) {
            conditions += " AND ESE_NUM_EMISION IS NULL";
        } else if (this.getEseNumEmision() != null) {
            conditions += " AND ESE_NUM_EMISION = ?";
            values.add(this.getEseNumEmision());
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
        String sql = "SELECT * FROM EMSSEGR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEseNumSecCupon() != null && this.getEseNumSecCupon().longValue() == -999) {
            conditions += " AND ESE_NUM_SEC_CUPON IS NULL";
        } else if (this.getEseNumSecCupon() != null) {
            conditions += " AND ESE_NUM_SEC_CUPON = ?";
            values.add(this.getEseNumSecCupon());
        }

        if (this.getEseCveCupon() != null && "null".equals(this.getEseCveCupon())) {
            conditions += " AND ESE_CVE_CUPON IS NULL";
        } else if (this.getEseCveCupon() != null) {
            conditions += " AND ESE_CVE_CUPON = ?";
            values.add(this.getEseCveCupon());
        }

        if (this.getEseNumSerie() != null && this.getEseNumSerie().longValue() == -999) {
            conditions += " AND ESE_NUM_SERIE IS NULL";
        } else if (this.getEseNumSerie() != null) {
            conditions += " AND ESE_NUM_SERIE = ?";
            values.add(this.getEseNumSerie());
        }

        if (this.getEsePlazo() != null && this.getEsePlazo().longValue() == -999) {
            conditions += " AND ESE_PLAZO IS NULL";
        } else if (this.getEsePlazo() != null) {
            conditions += " AND ESE_PLAZO = ?";
            values.add(this.getEsePlazo());
        }

        if (this.getEseCvePeriodo() != null && "null".equals(this.getEseCvePeriodo())) {
            conditions += " AND ESE_CVE_PERIODO IS NULL";
        } else if (this.getEseCvePeriodo() != null) {
            conditions += " AND ESE_CVE_PERIODO = ?";
            values.add(this.getEseCvePeriodo());
        }

        if (this.getEseAnoInicio() != null && this.getEseAnoInicio().longValue() == -999) {
            conditions += " AND ESE_ANO_INICIO IS NULL";
        } else if (this.getEseAnoInicio() != null) {
            conditions += " AND ESE_ANO_INICIO = ?";
            values.add(this.getEseAnoInicio());
        }

        if (this.getEseMesInicio() != null && this.getEseMesInicio().longValue() == -999) {
            conditions += " AND ESE_MES_INICIO IS NULL";
        } else if (this.getEseMesInicio() != null) {
            conditions += " AND ESE_MES_INICIO = ?";
            values.add(this.getEseMesInicio());
        }

        if (this.getEseDiaInicio() != null && this.getEseDiaInicio().longValue() == -999) {
            conditions += " AND ESE_DIA_INICIO IS NULL";
        } else if (this.getEseDiaInicio() != null) {
            conditions += " AND ESE_DIA_INICIO = ?";
            values.add(this.getEseDiaInicio());
        }

        if (this.getEseAnoVencimiento() != null && this.getEseAnoVencimiento().longValue() == -999) {
            conditions += " AND ESE_ANO_VENCIMIENTO IS NULL";
        } else if (this.getEseAnoVencimiento() != null) {
            conditions += " AND ESE_ANO_VENCIMIENTO = ?";
            values.add(this.getEseAnoVencimiento());
        }

        if (this.getEseMesVencimiento() != null && this.getEseMesVencimiento().longValue() == -999) {
            conditions += " AND ESE_MES_VENCIMIENTO IS NULL";
        } else if (this.getEseMesVencimiento() != null) {
            conditions += " AND ESE_MES_VENCIMIENTO = ?";
            values.add(this.getEseMesVencimiento());
        }

        if (this.getEseDiaVencimiento() != null && this.getEseDiaVencimiento().longValue() == -999) {
            conditions += " AND ESE_DIA_VENCIMIENTO IS NULL";
        } else if (this.getEseDiaVencimiento() != null) {
            conditions += " AND ESE_DIA_VENCIMIENTO = ?";
            values.add(this.getEseDiaVencimiento());
        }

        if (this.getEseAnoAltaReg() != null && this.getEseAnoAltaReg().longValue() == -999) {
            conditions += " AND ESE_ANO_ALTA_REG IS NULL";
        } else if (this.getEseAnoAltaReg() != null) {
            conditions += " AND ESE_ANO_ALTA_REG = ?";
            values.add(this.getEseAnoAltaReg());
        }

        if (this.getEseMesAltaReg() != null && this.getEseMesAltaReg().longValue() == -999) {
            conditions += " AND ESE_MES_ALTA_REG IS NULL";
        } else if (this.getEseMesAltaReg() != null) {
            conditions += " AND ESE_MES_ALTA_REG = ?";
            values.add(this.getEseMesAltaReg());
        }

        if (this.getEseDiaAltaReg() != null && this.getEseDiaAltaReg().longValue() == -999) {
            conditions += " AND ESE_DIA_ALTA_REG IS NULL";
        } else if (this.getEseDiaAltaReg() != null) {
            conditions += " AND ESE_DIA_ALTA_REG = ?";
            values.add(this.getEseDiaAltaReg());
        }

        if (this.getEseAnoUltMod() != null && this.getEseAnoUltMod().longValue() == -999) {
            conditions += " AND ESE_ANO_ULT_MOD IS NULL";
        } else if (this.getEseAnoUltMod() != null) {
            conditions += " AND ESE_ANO_ULT_MOD = ?";
            values.add(this.getEseAnoUltMod());
        }

        if (this.getEseMesUltMod() != null && this.getEseMesUltMod().longValue() == -999) {
            conditions += " AND ESE_MES_ULT_MOD IS NULL";
        } else if (this.getEseMesUltMod() != null) {
            conditions += " AND ESE_MES_ULT_MOD = ?";
            values.add(this.getEseMesUltMod());
        }

        if (this.getEseDiaUltMod() != null && this.getEseDiaUltMod().longValue() == -999) {
            conditions += " AND ESE_DIA_ULT_MOD IS NULL";
        } else if (this.getEseDiaUltMod() != null) {
            conditions += " AND ESE_DIA_ULT_MOD = ?";
            values.add(this.getEseDiaUltMod());
        }

        if (this.getEseCveStEmissegr() != null && "null".equals(this.getEseCveStEmissegr())) {
            conditions += " AND ESE_CVE_ST_EMISSEGR IS NULL";
        } else if (this.getEseCveStEmissegr() != null) {
            conditions += " AND ESE_CVE_ST_EMISSEGR = ?";
            values.add(this.getEseCveStEmissegr());
        }

        if (this.getEseNumPrograma() != null && this.getEseNumPrograma().longValue() == -999) {
            conditions += " AND ESE_NUM_PROGRAMA IS NULL";
        } else if (this.getEseNumPrograma() != null) {
            conditions += " AND ESE_NUM_PROGRAMA = ?";
            values.add(this.getEseNumPrograma());
        }

        if (this.getEseNumEmision() != null && this.getEseNumEmision().longValue() == -999) {
            conditions += " AND ESE_NUM_EMISION IS NULL";
        } else if (this.getEseNumEmision() != null) {
            conditions += " AND ESE_NUM_EMISION = ?";
            values.add(this.getEseNumEmision());
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
        String sql = "UPDATE EMSSEGR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESE_NUM_SEC_CUPON = ?";
        pkValues.add(this.getEseNumSecCupon());
        fields += " ESE_CVE_CUPON = ?, ";
        values.add(this.getEseCveCupon());
        fields += " ESE_NUM_SERIE = ?, ";
        values.add(this.getEseNumSerie());
        fields += " ESE_PLAZO = ?, ";
        values.add(this.getEsePlazo());
        fields += " ESE_CVE_PERIODO = ?, ";
        values.add(this.getEseCvePeriodo());
        fields += " ESE_ANO_INICIO = ?, ";
        values.add(this.getEseAnoInicio());
        fields += " ESE_MES_INICIO = ?, ";
        values.add(this.getEseMesInicio());
        fields += " ESE_DIA_INICIO = ?, ";
        values.add(this.getEseDiaInicio());
        fields += " ESE_ANO_VENCIMIENTO = ?, ";
        values.add(this.getEseAnoVencimiento());
        fields += " ESE_MES_VENCIMIENTO = ?, ";
        values.add(this.getEseMesVencimiento());
        fields += " ESE_DIA_VENCIMIENTO = ?, ";
        values.add(this.getEseDiaVencimiento());
        fields += " ESE_ANO_ALTA_REG = ?, ";
        values.add(this.getEseAnoAltaReg());
        fields += " ESE_MES_ALTA_REG = ?, ";
        values.add(this.getEseMesAltaReg());
        fields += " ESE_DIA_ALTA_REG = ?, ";
        values.add(this.getEseDiaAltaReg());
        fields += " ESE_ANO_ULT_MOD = ?, ";
        values.add(this.getEseAnoUltMod());
        fields += " ESE_MES_ULT_MOD = ?, ";
        values.add(this.getEseMesUltMod());
        fields += " ESE_DIA_ULT_MOD = ?, ";
        values.add(this.getEseDiaUltMod());
        fields += " ESE_CVE_ST_EMISSEGR = ?, ";
        values.add(this.getEseCveStEmissegr());
        conditions += " AND ESE_NUM_PROGRAMA = ?";
        pkValues.add(this.getEseNumPrograma());
        conditions += " AND ESE_NUM_EMISION = ?";
        pkValues.add(this.getEseNumEmision());
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
        String sql = "INSERT INTO EMSSEGR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESE_NUM_SEC_CUPON";
        fieldValues += ", ?";
        values.add(this.getEseNumSecCupon());

        fields += ", ESE_CVE_CUPON";
        fieldValues += ", ?";
        values.add(this.getEseCveCupon());

        fields += ", ESE_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getEseNumSerie());

        fields += ", ESE_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEsePlazo());

        fields += ", ESE_CVE_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEseCvePeriodo());

        fields += ", ESE_ANO_INICIO";
        fieldValues += ", ?";
        values.add(this.getEseAnoInicio());

        fields += ", ESE_MES_INICIO";
        fieldValues += ", ?";
        values.add(this.getEseMesInicio());

        fields += ", ESE_DIA_INICIO";
        fieldValues += ", ?";
        values.add(this.getEseDiaInicio());

        fields += ", ESE_ANO_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getEseAnoVencimiento());

        fields += ", ESE_MES_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getEseMesVencimiento());

        fields += ", ESE_DIA_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getEseDiaVencimiento());

        fields += ", ESE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEseAnoAltaReg());

        fields += ", ESE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEseMesAltaReg());

        fields += ", ESE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEseDiaAltaReg());

        fields += ", ESE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEseAnoUltMod());

        fields += ", ESE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEseMesUltMod());

        fields += ", ESE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEseDiaUltMod());

        fields += ", ESE_CVE_ST_EMISSEGR";
        fieldValues += ", ?";
        values.add(this.getEseCveStEmissegr());

        fields += ", ESE_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEseNumPrograma());

        fields += ", ESE_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEseNumEmision());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMSSEGR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESE_NUM_SEC_CUPON = ?";
        values.add(this.getEseNumSecCupon());
        conditions += " AND ESE_NUM_PROGRAMA = ?";
        values.add(this.getEseNumPrograma());
        conditions += " AND ESE_NUM_EMISION = ?";
        values.add(this.getEseNumEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emssegr instance = (Emssegr) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEseNumSecCupon().equals(instance.getEseNumSecCupon()))
            equalObjects = false;
        if (equalObjects && !this.getEseCveCupon().equals(instance.getEseCveCupon()))
            equalObjects = false;
        if (equalObjects && !this.getEseNumSerie().equals(instance.getEseNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEsePlazo().equals(instance.getEsePlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEseCvePeriodo().equals(instance.getEseCvePeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEseAnoInicio().equals(instance.getEseAnoInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEseMesInicio().equals(instance.getEseMesInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEseDiaInicio().equals(instance.getEseDiaInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEseAnoVencimiento().equals(instance.getEseAnoVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getEseMesVencimiento().equals(instance.getEseMesVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getEseDiaVencimiento().equals(instance.getEseDiaVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getEseAnoAltaReg().equals(instance.getEseAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEseMesAltaReg().equals(instance.getEseMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEseDiaAltaReg().equals(instance.getEseDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEseAnoUltMod().equals(instance.getEseAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEseMesUltMod().equals(instance.getEseMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEseDiaUltMod().equals(instance.getEseDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEseCveStEmissegr().equals(instance.getEseCveStEmissegr()))
            equalObjects = false;
        if (equalObjects && !this.getEseNumPrograma().equals(instance.getEseNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEseNumEmision().equals(instance.getEseNumEmision()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emssegr result = new Emssegr();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEseNumSecCupon((BigDecimal) objectData.getData("ESE_NUM_SEC_CUPON"));
        result.setEseCveCupon((String) objectData.getData("ESE_CVE_CUPON"));
        result.setEseNumSerie((BigDecimal) objectData.getData("ESE_NUM_SERIE"));
        result.setEsePlazo((BigDecimal) objectData.getData("ESE_PLAZO"));
        result.setEseCvePeriodo((String) objectData.getData("ESE_CVE_PERIODO"));
        result.setEseAnoInicio((BigDecimal) objectData.getData("ESE_ANO_INICIO"));
        result.setEseMesInicio((BigDecimal) objectData.getData("ESE_MES_INICIO"));
        result.setEseDiaInicio((BigDecimal) objectData.getData("ESE_DIA_INICIO"));
        result.setEseAnoVencimiento((BigDecimal) objectData.getData("ESE_ANO_VENCIMIENTO"));
        result.setEseMesVencimiento((BigDecimal) objectData.getData("ESE_MES_VENCIMIENTO"));
        result.setEseDiaVencimiento((BigDecimal) objectData.getData("ESE_DIA_VENCIMIENTO"));
        result.setEseAnoAltaReg((BigDecimal) objectData.getData("ESE_ANO_ALTA_REG"));
        result.setEseMesAltaReg((BigDecimal) objectData.getData("ESE_MES_ALTA_REG"));
        result.setEseDiaAltaReg((BigDecimal) objectData.getData("ESE_DIA_ALTA_REG"));
        result.setEseAnoUltMod((BigDecimal) objectData.getData("ESE_ANO_ULT_MOD"));
        result.setEseMesUltMod((BigDecimal) objectData.getData("ESE_MES_ULT_MOD"));
        result.setEseDiaUltMod((BigDecimal) objectData.getData("ESE_DIA_ULT_MOD"));
        result.setEseCveStEmissegr((String) objectData.getData("ESE_CVE_ST_EMISSEGR"));
        result.setEseNumPrograma((BigDecimal) objectData.getData("ESE_NUM_PROGRAMA"));
        result.setEseNumEmision((BigDecimal) objectData.getData("ESE_NUM_EMISION"));

        return result;

    }

}
