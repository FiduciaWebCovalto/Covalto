package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CALIRAFI_PK", columns = { "AFI_NUM_PROGRAMA", "AFI_NUM_CONTRATO", "AFI_NUM_FORMULA", "AFI_NUM_SEC_CALIF" }, sequences = { "MANUAL" })
public class Calirafi extends DomainObject {

    BigDecimal afiNumPrograma = null;
    BigDecimal afiNumContrato = null;
    BigDecimal afiNumFormula = null;
    BigDecimal afiNumSecCalif = null;
    String afiPeriodoEvalua = null;
    BigDecimal afiAnoCalif = null;
    BigDecimal afiMesCalif = null;
    BigDecimal afiDiaCalif = null;
    BigDecimal afiImpEvaluacion = null;
    String afiOperador = null;
    String afiProporcion = null;
    String afiCalificacion = null;
    BigDecimal afiAnoAltaReg = null;
    BigDecimal afiMesAltaReg = null;
    BigDecimal afiDiaAltaReg = null;
    BigDecimal afiAnoUltMod = null;
    BigDecimal afiMesUltMod = null;
    BigDecimal afiDiaUltMod = null;
    String afiCveStCalcucpp = null;

    public Calirafi() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAfiNumPrograma(BigDecimal afiNumPrograma) {
        this.afiNumPrograma = afiNumPrograma;
    }

    public BigDecimal getAfiNumPrograma() {
        return this.afiNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAfiNumContrato(BigDecimal afiNumContrato) {
        this.afiNumContrato = afiNumContrato;
    }

    public BigDecimal getAfiNumContrato() {
        return this.afiNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAfiNumFormula(BigDecimal afiNumFormula) {
        this.afiNumFormula = afiNumFormula;
    }

    public BigDecimal getAfiNumFormula() {
        return this.afiNumFormula;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAfiNumSecCalif(BigDecimal afiNumSecCalif) {
        this.afiNumSecCalif = afiNumSecCalif;
    }

    public BigDecimal getAfiNumSecCalif() {
        return this.afiNumSecCalif;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfiPeriodoEvalua(String afiPeriodoEvalua) {
        this.afiPeriodoEvalua = afiPeriodoEvalua;
    }

    public String getAfiPeriodoEvalua() {
        return this.afiPeriodoEvalua;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAfiAnoCalif(BigDecimal afiAnoCalif) {
        this.afiAnoCalif = afiAnoCalif;
    }

    public BigDecimal getAfiAnoCalif() {
        return this.afiAnoCalif;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAfiMesCalif(BigDecimal afiMesCalif) {
        this.afiMesCalif = afiMesCalif;
    }

    public BigDecimal getAfiMesCalif() {
        return this.afiMesCalif;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAfiDiaCalif(BigDecimal afiDiaCalif) {
        this.afiDiaCalif = afiDiaCalif;
    }

    public BigDecimal getAfiDiaCalif() {
        return this.afiDiaCalif;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setAfiImpEvaluacion(BigDecimal afiImpEvaluacion) {
        this.afiImpEvaluacion = afiImpEvaluacion;
    }

    public BigDecimal getAfiImpEvaluacion() {
        return this.afiImpEvaluacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfiOperador(String afiOperador) {
        this.afiOperador = afiOperador;
    }

    public String getAfiOperador() {
        return this.afiOperador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfiProporcion(String afiProporcion) {
        this.afiProporcion = afiProporcion;
    }

    public String getAfiProporcion() {
        return this.afiProporcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfiCalificacion(String afiCalificacion) {
        this.afiCalificacion = afiCalificacion;
    }

    public String getAfiCalificacion() {
        return this.afiCalificacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAfiAnoAltaReg(BigDecimal afiAnoAltaReg) {
        this.afiAnoAltaReg = afiAnoAltaReg;
    }

    public BigDecimal getAfiAnoAltaReg() {
        return this.afiAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAfiMesAltaReg(BigDecimal afiMesAltaReg) {
        this.afiMesAltaReg = afiMesAltaReg;
    }

    public BigDecimal getAfiMesAltaReg() {
        return this.afiMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAfiDiaAltaReg(BigDecimal afiDiaAltaReg) {
        this.afiDiaAltaReg = afiDiaAltaReg;
    }

    public BigDecimal getAfiDiaAltaReg() {
        return this.afiDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAfiAnoUltMod(BigDecimal afiAnoUltMod) {
        this.afiAnoUltMod = afiAnoUltMod;
    }

    public BigDecimal getAfiAnoUltMod() {
        return this.afiAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAfiMesUltMod(BigDecimal afiMesUltMod) {
        this.afiMesUltMod = afiMesUltMod;
    }

    public BigDecimal getAfiMesUltMod() {
        return this.afiMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAfiDiaUltMod(BigDecimal afiDiaUltMod) {
        this.afiDiaUltMod = afiDiaUltMod;
    }

    public BigDecimal getAfiDiaUltMod() {
        return this.afiDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAfiCveStCalcucpp(String afiCveStCalcucpp) {
        this.afiCveStCalcucpp = afiCveStCalcucpp;
    }

    public String getAfiCveStCalcucpp() {
        return this.afiCveStCalcucpp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CALIRAFI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAfiNumPrograma() != null && this.getAfiNumPrograma().longValue() == -999) {
            conditions += " AND AFI_NUM_PROGRAMA IS NULL";
        } else if (this.getAfiNumPrograma() != null) {
            conditions += " AND AFI_NUM_PROGRAMA = ?";
            values.add(this.getAfiNumPrograma());
        }

        if (this.getAfiNumContrato() != null && this.getAfiNumContrato().longValue() == -999) {
            conditions += " AND AFI_NUM_CONTRATO IS NULL";
        } else if (this.getAfiNumContrato() != null) {
            conditions += " AND AFI_NUM_CONTRATO = ?";
            values.add(this.getAfiNumContrato());
        }

        if (this.getAfiNumFormula() != null && this.getAfiNumFormula().longValue() == -999) {
            conditions += " AND AFI_NUM_FORMULA IS NULL";
        } else if (this.getAfiNumFormula() != null) {
            conditions += " AND AFI_NUM_FORMULA = ?";
            values.add(this.getAfiNumFormula());
        }

        if (this.getAfiNumSecCalif() != null && this.getAfiNumSecCalif().longValue() == -999) {
            conditions += " AND AFI_NUM_SEC_CALIF IS NULL";
        } else if (this.getAfiNumSecCalif() != null) {
            conditions += " AND AFI_NUM_SEC_CALIF = ?";
            values.add(this.getAfiNumSecCalif());
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
        String sql = "SELECT * FROM CALIRAFI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAfiNumPrograma() != null && this.getAfiNumPrograma().longValue() == -999) {
            conditions += " AND AFI_NUM_PROGRAMA IS NULL";
        } else if (this.getAfiNumPrograma() != null) {
            conditions += " AND AFI_NUM_PROGRAMA = ?";
            values.add(this.getAfiNumPrograma());
        }

        if (this.getAfiNumContrato() != null && this.getAfiNumContrato().longValue() == -999) {
            conditions += " AND AFI_NUM_CONTRATO IS NULL";
        } else if (this.getAfiNumContrato() != null) {
            conditions += " AND AFI_NUM_CONTRATO = ?";
            values.add(this.getAfiNumContrato());
        }

        if (this.getAfiNumFormula() != null && this.getAfiNumFormula().longValue() == -999) {
            conditions += " AND AFI_NUM_FORMULA IS NULL";
        } else if (this.getAfiNumFormula() != null) {
            conditions += " AND AFI_NUM_FORMULA = ?";
            values.add(this.getAfiNumFormula());
        }

        if (this.getAfiNumSecCalif() != null && this.getAfiNumSecCalif().longValue() == -999) {
            conditions += " AND AFI_NUM_SEC_CALIF IS NULL";
        } else if (this.getAfiNumSecCalif() != null) {
            conditions += " AND AFI_NUM_SEC_CALIF = ?";
            values.add(this.getAfiNumSecCalif());
        }

        if (this.getAfiPeriodoEvalua() != null && "null".equals(this.getAfiPeriodoEvalua())) {
            conditions += " AND AFI_PERIODO_EVALUA IS NULL";
        } else if (this.getAfiPeriodoEvalua() != null) {
            conditions += " AND AFI_PERIODO_EVALUA = ?";
            values.add(this.getAfiPeriodoEvalua());
        }

        if (this.getAfiAnoCalif() != null && this.getAfiAnoCalif().longValue() == -999) {
            conditions += " AND AFI_ANO_CALIF IS NULL";
        } else if (this.getAfiAnoCalif() != null) {
            conditions += " AND AFI_ANO_CALIF = ?";
            values.add(this.getAfiAnoCalif());
        }

        if (this.getAfiMesCalif() != null && this.getAfiMesCalif().longValue() == -999) {
            conditions += " AND AFI_MES_CALIF IS NULL";
        } else if (this.getAfiMesCalif() != null) {
            conditions += " AND AFI_MES_CALIF = ?";
            values.add(this.getAfiMesCalif());
        }

        if (this.getAfiDiaCalif() != null && this.getAfiDiaCalif().longValue() == -999) {
            conditions += " AND AFI_DIA_CALIF IS NULL";
        } else if (this.getAfiDiaCalif() != null) {
            conditions += " AND AFI_DIA_CALIF = ?";
            values.add(this.getAfiDiaCalif());
        }

        if (this.getAfiImpEvaluacion() != null && this.getAfiImpEvaluacion().longValue() == -999) {
            conditions += " AND AFI_IMP_EVALUACION IS NULL";
        } else if (this.getAfiImpEvaluacion() != null) {
            conditions += " AND AFI_IMP_EVALUACION = ?";
            values.add(this.getAfiImpEvaluacion());
        }

        if (this.getAfiOperador() != null && "null".equals(this.getAfiOperador())) {
            conditions += " AND AFI_OPERADOR IS NULL";
        } else if (this.getAfiOperador() != null) {
            conditions += " AND AFI_OPERADOR = ?";
            values.add(this.getAfiOperador());
        }

        if (this.getAfiProporcion() != null && "null".equals(this.getAfiProporcion())) {
            conditions += " AND AFI_PROPORCION IS NULL";
        } else if (this.getAfiProporcion() != null) {
            conditions += " AND AFI_PROPORCION = ?";
            values.add(this.getAfiProporcion());
        }

        if (this.getAfiCalificacion() != null && "null".equals(this.getAfiCalificacion())) {
            conditions += " AND AFI_CALIFICACION IS NULL";
        } else if (this.getAfiCalificacion() != null) {
            conditions += " AND AFI_CALIFICACION = ?";
            values.add(this.getAfiCalificacion());
        }

        if (this.getAfiAnoAltaReg() != null && this.getAfiAnoAltaReg().longValue() == -999) {
            conditions += " AND AFI_ANO_ALTA_REG IS NULL";
        } else if (this.getAfiAnoAltaReg() != null) {
            conditions += " AND AFI_ANO_ALTA_REG = ?";
            values.add(this.getAfiAnoAltaReg());
        }

        if (this.getAfiMesAltaReg() != null && this.getAfiMesAltaReg().longValue() == -999) {
            conditions += " AND AFI_MES_ALTA_REG IS NULL";
        } else if (this.getAfiMesAltaReg() != null) {
            conditions += " AND AFI_MES_ALTA_REG = ?";
            values.add(this.getAfiMesAltaReg());
        }

        if (this.getAfiDiaAltaReg() != null && this.getAfiDiaAltaReg().longValue() == -999) {
            conditions += " AND AFI_DIA_ALTA_REG IS NULL";
        } else if (this.getAfiDiaAltaReg() != null) {
            conditions += " AND AFI_DIA_ALTA_REG = ?";
            values.add(this.getAfiDiaAltaReg());
        }

        if (this.getAfiAnoUltMod() != null && this.getAfiAnoUltMod().longValue() == -999) {
            conditions += " AND AFI_ANO_ULT_MOD IS NULL";
        } else if (this.getAfiAnoUltMod() != null) {
            conditions += " AND AFI_ANO_ULT_MOD = ?";
            values.add(this.getAfiAnoUltMod());
        }

        if (this.getAfiMesUltMod() != null && this.getAfiMesUltMod().longValue() == -999) {
            conditions += " AND AFI_MES_ULT_MOD IS NULL";
        } else if (this.getAfiMesUltMod() != null) {
            conditions += " AND AFI_MES_ULT_MOD = ?";
            values.add(this.getAfiMesUltMod());
        }

        if (this.getAfiDiaUltMod() != null && this.getAfiDiaUltMod().longValue() == -999) {
            conditions += " AND AFI_DIA_ULT_MOD IS NULL";
        } else if (this.getAfiDiaUltMod() != null) {
            conditions += " AND AFI_DIA_ULT_MOD = ?";
            values.add(this.getAfiDiaUltMod());
        }

        if (this.getAfiCveStCalcucpp() != null && "null".equals(this.getAfiCveStCalcucpp())) {
            conditions += " AND AFI_CVE_ST_CALCUCPP IS NULL";
        } else if (this.getAfiCveStCalcucpp() != null) {
            conditions += " AND AFI_CVE_ST_CALCUCPP = ?";
            values.add(this.getAfiCveStCalcucpp());
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
        String sql = "UPDATE CALIRAFI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AFI_NUM_PROGRAMA = ?";
        pkValues.add(this.getAfiNumPrograma());
        conditions += " AND AFI_NUM_CONTRATO = ?";
        pkValues.add(this.getAfiNumContrato());
        conditions += " AND AFI_NUM_FORMULA = ?";
        pkValues.add(this.getAfiNumFormula());
        conditions += " AND AFI_NUM_SEC_CALIF = ?";
        pkValues.add(this.getAfiNumSecCalif());
        fields += " AFI_PERIODO_EVALUA = ?, ";
        values.add(this.getAfiPeriodoEvalua());
        fields += " AFI_ANO_CALIF = ?, ";
        values.add(this.getAfiAnoCalif());
        fields += " AFI_MES_CALIF = ?, ";
        values.add(this.getAfiMesCalif());
        fields += " AFI_DIA_CALIF = ?, ";
        values.add(this.getAfiDiaCalif());
        fields += " AFI_IMP_EVALUACION = ?, ";
        values.add(this.getAfiImpEvaluacion());
        fields += " AFI_OPERADOR = ?, ";
        values.add(this.getAfiOperador());
        fields += " AFI_PROPORCION = ?, ";
        values.add(this.getAfiProporcion());
        fields += " AFI_CALIFICACION = ?, ";
        values.add(this.getAfiCalificacion());
        fields += " AFI_ANO_ALTA_REG = ?, ";
        values.add(this.getAfiAnoAltaReg());
        fields += " AFI_MES_ALTA_REG = ?, ";
        values.add(this.getAfiMesAltaReg());
        fields += " AFI_DIA_ALTA_REG = ?, ";
        values.add(this.getAfiDiaAltaReg());
        fields += " AFI_ANO_ULT_MOD = ?, ";
        values.add(this.getAfiAnoUltMod());
        fields += " AFI_MES_ULT_MOD = ?, ";
        values.add(this.getAfiMesUltMod());
        fields += " AFI_DIA_ULT_MOD = ?, ";
        values.add(this.getAfiDiaUltMod());
        fields += " AFI_CVE_ST_CALCUCPP = ?, ";
        values.add(this.getAfiCveStCalcucpp());
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
        String sql = "INSERT INTO CALIRAFI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AFI_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getAfiNumPrograma());

        fields += ", AFI_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getAfiNumContrato());

        fields += ", AFI_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getAfiNumFormula());

        fields += ", AFI_NUM_SEC_CALIF";
        fieldValues += ", ?";
        values.add(this.getAfiNumSecCalif());

        fields += ", AFI_PERIODO_EVALUA";
        fieldValues += ", ?";
        values.add(this.getAfiPeriodoEvalua());

        fields += ", AFI_ANO_CALIF";
        fieldValues += ", ?";
        values.add(this.getAfiAnoCalif());

        fields += ", AFI_MES_CALIF";
        fieldValues += ", ?";
        values.add(this.getAfiMesCalif());

        fields += ", AFI_DIA_CALIF";
        fieldValues += ", ?";
        values.add(this.getAfiDiaCalif());

        fields += ", AFI_IMP_EVALUACION";
        fieldValues += ", ?";
        values.add(this.getAfiImpEvaluacion());

        fields += ", AFI_OPERADOR";
        fieldValues += ", ?";
        values.add(this.getAfiOperador());

        fields += ", AFI_PROPORCION";
        fieldValues += ", ?";
        values.add(this.getAfiProporcion());

        fields += ", AFI_CALIFICACION";
        fieldValues += ", ?";
        values.add(this.getAfiCalificacion());

        fields += ", AFI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAfiAnoAltaReg());

        fields += ", AFI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAfiMesAltaReg());

        fields += ", AFI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAfiDiaAltaReg());

        fields += ", AFI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAfiAnoUltMod());

        fields += ", AFI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAfiMesUltMod());

        fields += ", AFI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAfiDiaUltMod());

        fields += ", AFI_CVE_ST_CALCUCPP";
        fieldValues += ", ?";
        values.add(this.getAfiCveStCalcucpp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CALIRAFI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AFI_NUM_PROGRAMA = ?";
        values.add(this.getAfiNumPrograma());
        conditions += " AND AFI_NUM_CONTRATO = ?";
        values.add(this.getAfiNumContrato());
        conditions += " AND AFI_NUM_FORMULA = ?";
        values.add(this.getAfiNumFormula());
        conditions += " AND AFI_NUM_SEC_CALIF = ?";
        values.add(this.getAfiNumSecCalif());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Calirafi instance = (Calirafi) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAfiNumPrograma().equals(instance.getAfiNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getAfiNumContrato().equals(instance.getAfiNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAfiNumFormula().equals(instance.getAfiNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getAfiNumSecCalif().equals(instance.getAfiNumSecCalif()))
            equalObjects = false;
        if (equalObjects && !this.getAfiPeriodoEvalua().equals(instance.getAfiPeriodoEvalua()))
            equalObjects = false;
        if (equalObjects && !this.getAfiAnoCalif().equals(instance.getAfiAnoCalif()))
            equalObjects = false;
        if (equalObjects && !this.getAfiMesCalif().equals(instance.getAfiMesCalif()))
            equalObjects = false;
        if (equalObjects && !this.getAfiDiaCalif().equals(instance.getAfiDiaCalif()))
            equalObjects = false;
        if (equalObjects && !this.getAfiImpEvaluacion().equals(instance.getAfiImpEvaluacion()))
            equalObjects = false;
        if (equalObjects && !this.getAfiOperador().equals(instance.getAfiOperador()))
            equalObjects = false;
        if (equalObjects && !this.getAfiProporcion().equals(instance.getAfiProporcion()))
            equalObjects = false;
        if (equalObjects && !this.getAfiCalificacion().equals(instance.getAfiCalificacion()))
            equalObjects = false;
        if (equalObjects && !this.getAfiAnoAltaReg().equals(instance.getAfiAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAfiMesAltaReg().equals(instance.getAfiMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAfiDiaAltaReg().equals(instance.getAfiDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAfiAnoUltMod().equals(instance.getAfiAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAfiMesUltMod().equals(instance.getAfiMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAfiDiaUltMod().equals(instance.getAfiDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAfiCveStCalcucpp().equals(instance.getAfiCveStCalcucpp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Calirafi result = new Calirafi();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAfiNumPrograma((BigDecimal) objectData.getData("AFI_NUM_PROGRAMA"));
        result.setAfiNumContrato((BigDecimal) objectData.getData("AFI_NUM_CONTRATO"));
        result.setAfiNumFormula((BigDecimal) objectData.getData("AFI_NUM_FORMULA"));
        result.setAfiNumSecCalif((BigDecimal) objectData.getData("AFI_NUM_SEC_CALIF"));
        result.setAfiPeriodoEvalua((String) objectData.getData("AFI_PERIODO_EVALUA"));
        result.setAfiAnoCalif((BigDecimal) objectData.getData("AFI_ANO_CALIF"));
        result.setAfiMesCalif((BigDecimal) objectData.getData("AFI_MES_CALIF"));
        result.setAfiDiaCalif((BigDecimal) objectData.getData("AFI_DIA_CALIF"));
        result.setAfiImpEvaluacion((BigDecimal) objectData.getData("AFI_IMP_EVALUACION"));
        result.setAfiOperador((String) objectData.getData("AFI_OPERADOR"));
        result.setAfiProporcion((String) objectData.getData("AFI_PROPORCION"));
        result.setAfiCalificacion((String) objectData.getData("AFI_CALIFICACION"));
        result.setAfiAnoAltaReg((BigDecimal) objectData.getData("AFI_ANO_ALTA_REG"));
        result.setAfiMesAltaReg((BigDecimal) objectData.getData("AFI_MES_ALTA_REG"));
        result.setAfiDiaAltaReg((BigDecimal) objectData.getData("AFI_DIA_ALTA_REG"));
        result.setAfiAnoUltMod((BigDecimal) objectData.getData("AFI_ANO_ULT_MOD"));
        result.setAfiMesUltMod((BigDecimal) objectData.getData("AFI_MES_ULT_MOD"));
        result.setAfiDiaUltMod((BigDecimal) objectData.getData("AFI_DIA_ULT_MOD"));
        result.setAfiCveStCalcucpp((String) objectData.getData("AFI_CVE_ST_CALCUCPP"));

        return result;

    }

}
