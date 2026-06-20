package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISAMOR_PK", columns = { "EAM_NUM_PROGRAMA", "EAM_NUM_EMISION", "EAM_NUM_SEC_CALC", "EAM_NUM_SEC_AMOR" }, sequences = { "MANUAL" })
public class Emisamor extends DomainObject {

    BigDecimal eamNumPrograma = null;
    BigDecimal eamNumEmision = null;
    BigDecimal eamNumSecCalc = null;
    BigDecimal eamNumSecAmor = null;
    BigDecimal eamAnoIniPeriodo = null;
    BigDecimal eamMesIniPeriodo = null;
    BigDecimal eamDiaIniPeriodo = null;
    BigDecimal eamAnoFinPeriodo = null;
    BigDecimal eamMesFinPeriodo = null;
    BigDecimal eamDiaFinPeriodo = null;
    String eamPeriodicidad = null;
    BigDecimal eamImpAmortizacion = null;
    String eamStAmortizado = null;
    BigDecimal eamAnoAltaReg = null;
    BigDecimal eamMesAltaReg = null;
    BigDecimal eamDiaAltaReg = null;
    BigDecimal eamAnoUltMod = null;
    BigDecimal eamMesUltMod = null;
    BigDecimal eamDiaUltMod = null;
    String eamCveStEmisamor = null;

    public Emisamor() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEamNumPrograma(BigDecimal eamNumPrograma) {
        this.eamNumPrograma = eamNumPrograma;
    }

    public BigDecimal getEamNumPrograma() {
        return this.eamNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEamNumEmision(BigDecimal eamNumEmision) {
        this.eamNumEmision = eamNumEmision;
    }

    public BigDecimal getEamNumEmision() {
        return this.eamNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEamNumSecCalc(BigDecimal eamNumSecCalc) {
        this.eamNumSecCalc = eamNumSecCalc;
    }

    public BigDecimal getEamNumSecCalc() {
        return this.eamNumSecCalc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEamNumSecAmor(BigDecimal eamNumSecAmor) {
        this.eamNumSecAmor = eamNumSecAmor;
    }

    public BigDecimal getEamNumSecAmor() {
        return this.eamNumSecAmor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEamAnoIniPeriodo(BigDecimal eamAnoIniPeriodo) {
        this.eamAnoIniPeriodo = eamAnoIniPeriodo;
    }

    public BigDecimal getEamAnoIniPeriodo() {
        return this.eamAnoIniPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEamMesIniPeriodo(BigDecimal eamMesIniPeriodo) {
        this.eamMesIniPeriodo = eamMesIniPeriodo;
    }

    public BigDecimal getEamMesIniPeriodo() {
        return this.eamMesIniPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEamDiaIniPeriodo(BigDecimal eamDiaIniPeriodo) {
        this.eamDiaIniPeriodo = eamDiaIniPeriodo;
    }

    public BigDecimal getEamDiaIniPeriodo() {
        return this.eamDiaIniPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEamAnoFinPeriodo(BigDecimal eamAnoFinPeriodo) {
        this.eamAnoFinPeriodo = eamAnoFinPeriodo;
    }

    public BigDecimal getEamAnoFinPeriodo() {
        return this.eamAnoFinPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEamMesFinPeriodo(BigDecimal eamMesFinPeriodo) {
        this.eamMesFinPeriodo = eamMesFinPeriodo;
    }

    public BigDecimal getEamMesFinPeriodo() {
        return this.eamMesFinPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEamDiaFinPeriodo(BigDecimal eamDiaFinPeriodo) {
        this.eamDiaFinPeriodo = eamDiaFinPeriodo;
    }

    public BigDecimal getEamDiaFinPeriodo() {
        return this.eamDiaFinPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEamPeriodicidad(String eamPeriodicidad) {
        this.eamPeriodicidad = eamPeriodicidad;
    }

    public String getEamPeriodicidad() {
        return this.eamPeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEamImpAmortizacion(BigDecimal eamImpAmortizacion) {
        this.eamImpAmortizacion = eamImpAmortizacion;
    }

    public BigDecimal getEamImpAmortizacion() {
        return this.eamImpAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEamStAmortizado(String eamStAmortizado) {
        this.eamStAmortizado = eamStAmortizado;
    }

    public String getEamStAmortizado() {
        return this.eamStAmortizado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEamAnoAltaReg(BigDecimal eamAnoAltaReg) {
        this.eamAnoAltaReg = eamAnoAltaReg;
    }

    public BigDecimal getEamAnoAltaReg() {
        return this.eamAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEamMesAltaReg(BigDecimal eamMesAltaReg) {
        this.eamMesAltaReg = eamMesAltaReg;
    }

    public BigDecimal getEamMesAltaReg() {
        return this.eamMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEamDiaAltaReg(BigDecimal eamDiaAltaReg) {
        this.eamDiaAltaReg = eamDiaAltaReg;
    }

    public BigDecimal getEamDiaAltaReg() {
        return this.eamDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEamAnoUltMod(BigDecimal eamAnoUltMod) {
        this.eamAnoUltMod = eamAnoUltMod;
    }

    public BigDecimal getEamAnoUltMod() {
        return this.eamAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEamMesUltMod(BigDecimal eamMesUltMod) {
        this.eamMesUltMod = eamMesUltMod;
    }

    public BigDecimal getEamMesUltMod() {
        return this.eamMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 24, scale = 0, javaClass = BigDecimal.class)
    public void setEamDiaUltMod(BigDecimal eamDiaUltMod) {
        this.eamDiaUltMod = eamDiaUltMod;
    }

    public BigDecimal getEamDiaUltMod() {
        return this.eamDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEamCveStEmisamor(String eamCveStEmisamor) {
        this.eamCveStEmisamor = eamCveStEmisamor;
    }

    public String getEamCveStEmisamor() {
        return this.eamCveStEmisamor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISAMOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEamNumPrograma() != null && this.getEamNumPrograma().longValue() == -999) {
            conditions += " AND EAM_NUM_PROGRAMA IS NULL";
        } else if (this.getEamNumPrograma() != null) {
            conditions += " AND EAM_NUM_PROGRAMA = ?";
            values.add(this.getEamNumPrograma());
        }

        if (this.getEamNumEmision() != null && this.getEamNumEmision().longValue() == -999) {
            conditions += " AND EAM_NUM_EMISION IS NULL";
        } else if (this.getEamNumEmision() != null) {
            conditions += " AND EAM_NUM_EMISION = ?";
            values.add(this.getEamNumEmision());
        }

        if (this.getEamNumSecCalc() != null && this.getEamNumSecCalc().longValue() == -999) {
            conditions += " AND EAM_NUM_SEC_CALC IS NULL";
        } else if (this.getEamNumSecCalc() != null) {
            conditions += " AND EAM_NUM_SEC_CALC = ?";
            values.add(this.getEamNumSecCalc());
        }

        if (this.getEamNumSecAmor() != null && this.getEamNumSecAmor().longValue() == -999) {
            conditions += " AND EAM_NUM_SEC_AMOR IS NULL";
        } else if (this.getEamNumSecAmor() != null) {
            conditions += " AND EAM_NUM_SEC_AMOR = ?";
            values.add(this.getEamNumSecAmor());
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
        String sql = "SELECT * FROM EMISAMOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEamNumPrograma() != null && this.getEamNumPrograma().longValue() == -999) {
            conditions += " AND EAM_NUM_PROGRAMA IS NULL";
        } else if (this.getEamNumPrograma() != null) {
            conditions += " AND EAM_NUM_PROGRAMA = ?";
            values.add(this.getEamNumPrograma());
        }

        if (this.getEamNumEmision() != null && this.getEamNumEmision().longValue() == -999) {
            conditions += " AND EAM_NUM_EMISION IS NULL";
        } else if (this.getEamNumEmision() != null) {
            conditions += " AND EAM_NUM_EMISION = ?";
            values.add(this.getEamNumEmision());
        }

        if (this.getEamNumSecCalc() != null && this.getEamNumSecCalc().longValue() == -999) {
            conditions += " AND EAM_NUM_SEC_CALC IS NULL";
        } else if (this.getEamNumSecCalc() != null) {
            conditions += " AND EAM_NUM_SEC_CALC = ?";
            values.add(this.getEamNumSecCalc());
        }

        if (this.getEamNumSecAmor() != null && this.getEamNumSecAmor().longValue() == -999) {
            conditions += " AND EAM_NUM_SEC_AMOR IS NULL";
        } else if (this.getEamNumSecAmor() != null) {
            conditions += " AND EAM_NUM_SEC_AMOR = ?";
            values.add(this.getEamNumSecAmor());
        }

        if (this.getEamAnoIniPeriodo() != null && this.getEamAnoIniPeriodo().longValue() == -999) {
            conditions += " AND EAM_ANO_INI_PERIODO IS NULL";
        } else if (this.getEamAnoIniPeriodo() != null) {
            conditions += " AND EAM_ANO_INI_PERIODO = ?";
            values.add(this.getEamAnoIniPeriodo());
        }

        if (this.getEamMesIniPeriodo() != null && this.getEamMesIniPeriodo().longValue() == -999) {
            conditions += " AND EAM_MES_INI_PERIODO IS NULL";
        } else if (this.getEamMesIniPeriodo() != null) {
            conditions += " AND EAM_MES_INI_PERIODO = ?";
            values.add(this.getEamMesIniPeriodo());
        }

        if (this.getEamDiaIniPeriodo() != null && this.getEamDiaIniPeriodo().longValue() == -999) {
            conditions += " AND EAM_DIA_INI_PERIODO IS NULL";
        } else if (this.getEamDiaIniPeriodo() != null) {
            conditions += " AND EAM_DIA_INI_PERIODO = ?";
            values.add(this.getEamDiaIniPeriodo());
        }

        if (this.getEamAnoFinPeriodo() != null && this.getEamAnoFinPeriodo().longValue() == -999) {
            conditions += " AND EAM_ANO_FIN_PERIODO IS NULL";
        } else if (this.getEamAnoFinPeriodo() != null) {
            conditions += " AND EAM_ANO_FIN_PERIODO = ?";
            values.add(this.getEamAnoFinPeriodo());
        }

        if (this.getEamMesFinPeriodo() != null && this.getEamMesFinPeriodo().longValue() == -999) {
            conditions += " AND EAM_MES_FIN_PERIODO IS NULL";
        } else if (this.getEamMesFinPeriodo() != null) {
            conditions += " AND EAM_MES_FIN_PERIODO = ?";
            values.add(this.getEamMesFinPeriodo());
        }

        if (this.getEamDiaFinPeriodo() != null && this.getEamDiaFinPeriodo().longValue() == -999) {
            conditions += " AND EAM_DIA_FIN_PERIODO IS NULL";
        } else if (this.getEamDiaFinPeriodo() != null) {
            conditions += " AND EAM_DIA_FIN_PERIODO = ?";
            values.add(this.getEamDiaFinPeriodo());
        }

        if (this.getEamPeriodicidad() != null && "null".equals(this.getEamPeriodicidad())) {
            conditions += " AND EAM_PERIODICIDAD IS NULL";
        } else if (this.getEamPeriodicidad() != null) {
            conditions += " AND EAM_PERIODICIDAD = ?";
            values.add(this.getEamPeriodicidad());
        }

        if (this.getEamImpAmortizacion() != null && this.getEamImpAmortizacion().longValue() == -999) {
            conditions += " AND EAM_IMP_AMORTIZACION IS NULL";
        } else if (this.getEamImpAmortizacion() != null) {
            conditions += " AND EAM_IMP_AMORTIZACION = ?";
            values.add(this.getEamImpAmortizacion());
        }

        if (this.getEamStAmortizado() != null && "null".equals(this.getEamStAmortizado())) {
            conditions += " AND EAM_ST_AMORTIZADO IS NULL";
        } else if (this.getEamStAmortizado() != null) {
            conditions += " AND EAM_ST_AMORTIZADO = ?";
            values.add(this.getEamStAmortizado());
        }

        if (this.getEamAnoAltaReg() != null && this.getEamAnoAltaReg().longValue() == -999) {
            conditions += " AND EAM_ANO_ALTA_REG IS NULL";
        } else if (this.getEamAnoAltaReg() != null) {
            conditions += " AND EAM_ANO_ALTA_REG = ?";
            values.add(this.getEamAnoAltaReg());
        }

        if (this.getEamMesAltaReg() != null && this.getEamMesAltaReg().longValue() == -999) {
            conditions += " AND EAM_MES_ALTA_REG IS NULL";
        } else if (this.getEamMesAltaReg() != null) {
            conditions += " AND EAM_MES_ALTA_REG = ?";
            values.add(this.getEamMesAltaReg());
        }

        if (this.getEamDiaAltaReg() != null && this.getEamDiaAltaReg().longValue() == -999) {
            conditions += " AND EAM_DIA_ALTA_REG IS NULL";
        } else if (this.getEamDiaAltaReg() != null) {
            conditions += " AND EAM_DIA_ALTA_REG = ?";
            values.add(this.getEamDiaAltaReg());
        }

        if (this.getEamAnoUltMod() != null && this.getEamAnoUltMod().longValue() == -999) {
            conditions += " AND EAM_ANO_ULT_MOD IS NULL";
        } else if (this.getEamAnoUltMod() != null) {
            conditions += " AND EAM_ANO_ULT_MOD = ?";
            values.add(this.getEamAnoUltMod());
        }

        if (this.getEamMesUltMod() != null && this.getEamMesUltMod().longValue() == -999) {
            conditions += " AND EAM_MES_ULT_MOD IS NULL";
        } else if (this.getEamMesUltMod() != null) {
            conditions += " AND EAM_MES_ULT_MOD = ?";
            values.add(this.getEamMesUltMod());
        }

        if (this.getEamDiaUltMod() != null && this.getEamDiaUltMod().longValue() == -999) {
            conditions += " AND EAM_DIA_ULT_MOD IS NULL";
        } else if (this.getEamDiaUltMod() != null) {
            conditions += " AND EAM_DIA_ULT_MOD = ?";
            values.add(this.getEamDiaUltMod());
        }

        if (this.getEamCveStEmisamor() != null && "null".equals(this.getEamCveStEmisamor())) {
            conditions += " AND EAM_CVE_ST_EMISAMOR IS NULL";
        } else if (this.getEamCveStEmisamor() != null) {
            conditions += " AND EAM_CVE_ST_EMISAMOR = ?";
            values.add(this.getEamCveStEmisamor());
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
        String sql = "UPDATE EMISAMOR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EAM_NUM_PROGRAMA = ?";
        pkValues.add(this.getEamNumPrograma());
        conditions += " AND EAM_NUM_EMISION = ?";
        pkValues.add(this.getEamNumEmision());
        conditions += " AND EAM_NUM_SEC_CALC = ?";
        pkValues.add(this.getEamNumSecCalc());
        conditions += " AND EAM_NUM_SEC_AMOR = ?";
        pkValues.add(this.getEamNumSecAmor());
        fields += " EAM_ANO_INI_PERIODO = ?, ";
        values.add(this.getEamAnoIniPeriodo());
        fields += " EAM_MES_INI_PERIODO = ?, ";
        values.add(this.getEamMesIniPeriodo());
        fields += " EAM_DIA_INI_PERIODO = ?, ";
        values.add(this.getEamDiaIniPeriodo());
        fields += " EAM_ANO_FIN_PERIODO = ?, ";
        values.add(this.getEamAnoFinPeriodo());
        fields += " EAM_MES_FIN_PERIODO = ?, ";
        values.add(this.getEamMesFinPeriodo());
        fields += " EAM_DIA_FIN_PERIODO = ?, ";
        values.add(this.getEamDiaFinPeriodo());
        fields += " EAM_PERIODICIDAD = ?, ";
        values.add(this.getEamPeriodicidad());
        fields += " EAM_IMP_AMORTIZACION = ?, ";
        values.add(this.getEamImpAmortizacion());
        fields += " EAM_ST_AMORTIZADO = ?, ";
        values.add(this.getEamStAmortizado());
        fields += " EAM_ANO_ALTA_REG = ?, ";
        values.add(this.getEamAnoAltaReg());
        fields += " EAM_MES_ALTA_REG = ?, ";
        values.add(this.getEamMesAltaReg());
        fields += " EAM_DIA_ALTA_REG = ?, ";
        values.add(this.getEamDiaAltaReg());
        fields += " EAM_ANO_ULT_MOD = ?, ";
        values.add(this.getEamAnoUltMod());
        fields += " EAM_MES_ULT_MOD = ?, ";
        values.add(this.getEamMesUltMod());
        fields += " EAM_DIA_ULT_MOD = ?, ";
        values.add(this.getEamDiaUltMod());
        fields += " EAM_CVE_ST_EMISAMOR = ?, ";
        values.add(this.getEamCveStEmisamor());
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
        String sql = "INSERT INTO EMISAMOR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EAM_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEamNumPrograma());

        fields += ", EAM_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEamNumEmision());

        fields += ", EAM_NUM_SEC_CALC";
        fieldValues += ", ?";
        values.add(this.getEamNumSecCalc());

        fields += ", EAM_NUM_SEC_AMOR";
        fieldValues += ", ?";
        values.add(this.getEamNumSecAmor());

        fields += ", EAM_ANO_INI_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEamAnoIniPeriodo());

        fields += ", EAM_MES_INI_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEamMesIniPeriodo());

        fields += ", EAM_DIA_INI_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEamDiaIniPeriodo());

        fields += ", EAM_ANO_FIN_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEamAnoFinPeriodo());

        fields += ", EAM_MES_FIN_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEamMesFinPeriodo());

        fields += ", EAM_DIA_FIN_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEamDiaFinPeriodo());

        fields += ", EAM_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getEamPeriodicidad());

        fields += ", EAM_IMP_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEamImpAmortizacion());

        fields += ", EAM_ST_AMORTIZADO";
        fieldValues += ", ?";
        values.add(this.getEamStAmortizado());

        fields += ", EAM_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEamAnoAltaReg());

        fields += ", EAM_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEamMesAltaReg());

        fields += ", EAM_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEamDiaAltaReg());

        fields += ", EAM_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEamAnoUltMod());

        fields += ", EAM_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEamMesUltMod());

        fields += ", EAM_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEamDiaUltMod());

        fields += ", EAM_CVE_ST_EMISAMOR";
        fieldValues += ", ?";
        values.add(this.getEamCveStEmisamor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISAMOR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EAM_NUM_PROGRAMA = ?";
        values.add(this.getEamNumPrograma());
        conditions += " AND EAM_NUM_EMISION = ?";
        values.add(this.getEamNumEmision());
        conditions += " AND EAM_NUM_SEC_CALC = ?";
        values.add(this.getEamNumSecCalc());
        conditions += " AND EAM_NUM_SEC_AMOR = ?";
        values.add(this.getEamNumSecAmor());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisamor instance = (Emisamor) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEamNumPrograma().equals(instance.getEamNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEamNumEmision().equals(instance.getEamNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEamNumSecCalc().equals(instance.getEamNumSecCalc()))
            equalObjects = false;
        if (equalObjects && !this.getEamNumSecAmor().equals(instance.getEamNumSecAmor()))
            equalObjects = false;
        if (equalObjects && !this.getEamAnoIniPeriodo().equals(instance.getEamAnoIniPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEamMesIniPeriodo().equals(instance.getEamMesIniPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEamDiaIniPeriodo().equals(instance.getEamDiaIniPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEamAnoFinPeriodo().equals(instance.getEamAnoFinPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEamMesFinPeriodo().equals(instance.getEamMesFinPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEamDiaFinPeriodo().equals(instance.getEamDiaFinPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEamPeriodicidad().equals(instance.getEamPeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getEamImpAmortizacion().equals(instance.getEamImpAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEamStAmortizado().equals(instance.getEamStAmortizado()))
            equalObjects = false;
        if (equalObjects && !this.getEamAnoAltaReg().equals(instance.getEamAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEamMesAltaReg().equals(instance.getEamMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEamDiaAltaReg().equals(instance.getEamDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEamAnoUltMod().equals(instance.getEamAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEamMesUltMod().equals(instance.getEamMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEamDiaUltMod().equals(instance.getEamDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEamCveStEmisamor().equals(instance.getEamCveStEmisamor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisamor result = new Emisamor();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEamNumPrograma((BigDecimal) objectData.getData("EAM_NUM_PROGRAMA"));
        result.setEamNumEmision((BigDecimal) objectData.getData("EAM_NUM_EMISION"));
        result.setEamNumSecCalc((BigDecimal) objectData.getData("EAM_NUM_SEC_CALC"));
        result.setEamNumSecAmor((BigDecimal) objectData.getData("EAM_NUM_SEC_AMOR"));
        result.setEamAnoIniPeriodo((BigDecimal) objectData.getData("EAM_ANO_INI_PERIODO"));
        result.setEamMesIniPeriodo((BigDecimal) objectData.getData("EAM_MES_INI_PERIODO"));
        result.setEamDiaIniPeriodo((BigDecimal) objectData.getData("EAM_DIA_INI_PERIODO"));
        result.setEamAnoFinPeriodo((BigDecimal) objectData.getData("EAM_ANO_FIN_PERIODO"));
        result.setEamMesFinPeriodo((BigDecimal) objectData.getData("EAM_MES_FIN_PERIODO"));
        result.setEamDiaFinPeriodo((BigDecimal) objectData.getData("EAM_DIA_FIN_PERIODO"));
        result.setEamPeriodicidad((String) objectData.getData("EAM_PERIODICIDAD"));
        result.setEamImpAmortizacion((BigDecimal) objectData.getData("EAM_IMP_AMORTIZACION"));
        result.setEamStAmortizado((String) objectData.getData("EAM_ST_AMORTIZADO"));
        result.setEamAnoAltaReg((BigDecimal) objectData.getData("EAM_ANO_ALTA_REG"));
        result.setEamMesAltaReg((BigDecimal) objectData.getData("EAM_MES_ALTA_REG"));
        result.setEamDiaAltaReg((BigDecimal) objectData.getData("EAM_DIA_ALTA_REG"));
        result.setEamAnoUltMod((BigDecimal) objectData.getData("EAM_ANO_ULT_MOD"));
        result.setEamMesUltMod((BigDecimal) objectData.getData("EAM_MES_ULT_MOD"));
        result.setEamDiaUltMod((BigDecimal) objectData.getData("EAM_DIA_ULT_MOD"));
        result.setEamCveStEmisamor((String) objectData.getData("EAM_CVE_ST_EMISAMOR"));

        return result;

    }

}
