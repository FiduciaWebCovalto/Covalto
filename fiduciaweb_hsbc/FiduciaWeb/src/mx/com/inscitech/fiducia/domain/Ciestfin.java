package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CIESTFIN_PK", columns = { "IEF_NUM_PROGRAMA", "IEF_NUM_CONTRATO", "IEF_NUM_PERS_FID", "IEF_NUM_FORMULA", "IEF_NUM_TERMINO" },
            sequences = { "MANUAL" })
public class Ciestfin extends DomainObject {

    BigDecimal iefNumPrograma = null;
    BigDecimal iefNumContrato = null;
    BigDecimal iefNumPersFid = null;
    BigDecimal iefNumFormula = null;
    BigDecimal iefNumTermino = null;
    BigDecimal iefNumConcepto = null;
    BigDecimal iefImpEvaluacion = null;
    String iefPeriodoEvalua = null;
    BigDecimal iefAnoAltaReg = null;
    BigDecimal iefMesAltaReg = null;
    BigDecimal iefDiaAltaReg = null;
    BigDecimal iefAnoUltMod = null;
    BigDecimal iefMesUltMod = null;
    BigDecimal iefDiaUltMod = null;
    String iefCveStCiestfin = null;

    public Ciestfin() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIefNumPrograma(BigDecimal iefNumPrograma) {
        this.iefNumPrograma = iefNumPrograma;
    }

    public BigDecimal getIefNumPrograma() {
        return this.iefNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIefNumContrato(BigDecimal iefNumContrato) {
        this.iefNumContrato = iefNumContrato;
    }

    public BigDecimal getIefNumContrato() {
        return this.iefNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIefNumPersFid(BigDecimal iefNumPersFid) {
        this.iefNumPersFid = iefNumPersFid;
    }

    public BigDecimal getIefNumPersFid() {
        return this.iefNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIefNumFormula(BigDecimal iefNumFormula) {
        this.iefNumFormula = iefNumFormula;
    }

    public BigDecimal getIefNumFormula() {
        return this.iefNumFormula;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIefNumTermino(BigDecimal iefNumTermino) {
        this.iefNumTermino = iefNumTermino;
    }

    public BigDecimal getIefNumTermino() {
        return this.iefNumTermino;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIefNumConcepto(BigDecimal iefNumConcepto) {
        this.iefNumConcepto = iefNumConcepto;
    }

    public BigDecimal getIefNumConcepto() {
        return this.iefNumConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setIefImpEvaluacion(BigDecimal iefImpEvaluacion) {
        this.iefImpEvaluacion = iefImpEvaluacion;
    }

    public BigDecimal getIefImpEvaluacion() {
        return this.iefImpEvaluacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIefPeriodoEvalua(String iefPeriodoEvalua) {
        this.iefPeriodoEvalua = iefPeriodoEvalua;
    }

    public String getIefPeriodoEvalua() {
        return this.iefPeriodoEvalua;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIefAnoAltaReg(BigDecimal iefAnoAltaReg) {
        this.iefAnoAltaReg = iefAnoAltaReg;
    }

    public BigDecimal getIefAnoAltaReg() {
        return this.iefAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIefMesAltaReg(BigDecimal iefMesAltaReg) {
        this.iefMesAltaReg = iefMesAltaReg;
    }

    public BigDecimal getIefMesAltaReg() {
        return this.iefMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIefDiaAltaReg(BigDecimal iefDiaAltaReg) {
        this.iefDiaAltaReg = iefDiaAltaReg;
    }

    public BigDecimal getIefDiaAltaReg() {
        return this.iefDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIefAnoUltMod(BigDecimal iefAnoUltMod) {
        this.iefAnoUltMod = iefAnoUltMod;
    }

    public BigDecimal getIefAnoUltMod() {
        return this.iefAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIefMesUltMod(BigDecimal iefMesUltMod) {
        this.iefMesUltMod = iefMesUltMod;
    }

    public BigDecimal getIefMesUltMod() {
        return this.iefMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIefDiaUltMod(BigDecimal iefDiaUltMod) {
        this.iefDiaUltMod = iefDiaUltMod;
    }

    public BigDecimal getIefDiaUltMod() {
        return this.iefDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIefCveStCiestfin(String iefCveStCiestfin) {
        this.iefCveStCiestfin = iefCveStCiestfin;
    }

    public String getIefCveStCiestfin() {
        return this.iefCveStCiestfin;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CIESTFIN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIefNumPrograma() != null && this.getIefNumPrograma().longValue() == -999) {
            conditions += " AND IEF_NUM_PROGRAMA IS NULL";
        } else if (this.getIefNumPrograma() != null) {
            conditions += " AND IEF_NUM_PROGRAMA = ?";
            values.add(this.getIefNumPrograma());
        }

        if (this.getIefNumContrato() != null && this.getIefNumContrato().longValue() == -999) {
            conditions += " AND IEF_NUM_CONTRATO IS NULL";
        } else if (this.getIefNumContrato() != null) {
            conditions += " AND IEF_NUM_CONTRATO = ?";
            values.add(this.getIefNumContrato());
        }

        if (this.getIefNumPersFid() != null && this.getIefNumPersFid().longValue() == -999) {
            conditions += " AND IEF_NUM_PERS_FID IS NULL";
        } else if (this.getIefNumPersFid() != null) {
            conditions += " AND IEF_NUM_PERS_FID = ?";
            values.add(this.getIefNumPersFid());
        }

        if (this.getIefNumFormula() != null && this.getIefNumFormula().longValue() == -999) {
            conditions += " AND IEF_NUM_FORMULA IS NULL";
        } else if (this.getIefNumFormula() != null) {
            conditions += " AND IEF_NUM_FORMULA = ?";
            values.add(this.getIefNumFormula());
        }

        if (this.getIefNumTermino() != null && this.getIefNumTermino().longValue() == -999) {
            conditions += " AND IEF_NUM_TERMINO IS NULL";
        } else if (this.getIefNumTermino() != null) {
            conditions += " AND IEF_NUM_TERMINO = ?";
            values.add(this.getIefNumTermino());
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
        String sql = "SELECT * FROM CIESTFIN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIefNumPrograma() != null && this.getIefNumPrograma().longValue() == -999) {
            conditions += " AND IEF_NUM_PROGRAMA IS NULL";
        } else if (this.getIefNumPrograma() != null) {
            conditions += " AND IEF_NUM_PROGRAMA = ?";
            values.add(this.getIefNumPrograma());
        }

        if (this.getIefNumContrato() != null && this.getIefNumContrato().longValue() == -999) {
            conditions += " AND IEF_NUM_CONTRATO IS NULL";
        } else if (this.getIefNumContrato() != null) {
            conditions += " AND IEF_NUM_CONTRATO = ?";
            values.add(this.getIefNumContrato());
        }

        if (this.getIefNumPersFid() != null && this.getIefNumPersFid().longValue() == -999) {
            conditions += " AND IEF_NUM_PERS_FID IS NULL";
        } else if (this.getIefNumPersFid() != null) {
            conditions += " AND IEF_NUM_PERS_FID = ?";
            values.add(this.getIefNumPersFid());
        }

        if (this.getIefNumFormula() != null && this.getIefNumFormula().longValue() == -999) {
            conditions += " AND IEF_NUM_FORMULA IS NULL";
        } else if (this.getIefNumFormula() != null) {
            conditions += " AND IEF_NUM_FORMULA = ?";
            values.add(this.getIefNumFormula());
        }

        if (this.getIefNumTermino() != null && this.getIefNumTermino().longValue() == -999) {
            conditions += " AND IEF_NUM_TERMINO IS NULL";
        } else if (this.getIefNumTermino() != null) {
            conditions += " AND IEF_NUM_TERMINO = ?";
            values.add(this.getIefNumTermino());
        }

        if (this.getIefNumConcepto() != null && this.getIefNumConcepto().longValue() == -999) {
            conditions += " AND IEF_NUM_CONCEPTO IS NULL";
        } else if (this.getIefNumConcepto() != null) {
            conditions += " AND IEF_NUM_CONCEPTO = ?";
            values.add(this.getIefNumConcepto());
        }

        if (this.getIefImpEvaluacion() != null && this.getIefImpEvaluacion().longValue() == -999) {
            conditions += " AND IEF_IMP_EVALUACION IS NULL";
        } else if (this.getIefImpEvaluacion() != null) {
            conditions += " AND IEF_IMP_EVALUACION = ?";
            values.add(this.getIefImpEvaluacion());
        }

        if (this.getIefPeriodoEvalua() != null && "null".equals(this.getIefPeriodoEvalua())) {
            conditions += " AND IEF_PERIODO_EVALUA IS NULL";
        } else if (this.getIefPeriodoEvalua() != null) {
            conditions += " AND IEF_PERIODO_EVALUA = ?";
            values.add(this.getIefPeriodoEvalua());
        }

        if (this.getIefAnoAltaReg() != null && this.getIefAnoAltaReg().longValue() == -999) {
            conditions += " AND IEF_ANO_ALTA_REG IS NULL";
        } else if (this.getIefAnoAltaReg() != null) {
            conditions += " AND IEF_ANO_ALTA_REG = ?";
            values.add(this.getIefAnoAltaReg());
        }

        if (this.getIefMesAltaReg() != null && this.getIefMesAltaReg().longValue() == -999) {
            conditions += " AND IEF_MES_ALTA_REG IS NULL";
        } else if (this.getIefMesAltaReg() != null) {
            conditions += " AND IEF_MES_ALTA_REG = ?";
            values.add(this.getIefMesAltaReg());
        }

        if (this.getIefDiaAltaReg() != null && this.getIefDiaAltaReg().longValue() == -999) {
            conditions += " AND IEF_DIA_ALTA_REG IS NULL";
        } else if (this.getIefDiaAltaReg() != null) {
            conditions += " AND IEF_DIA_ALTA_REG = ?";
            values.add(this.getIefDiaAltaReg());
        }

        if (this.getIefAnoUltMod() != null && this.getIefAnoUltMod().longValue() == -999) {
            conditions += " AND IEF_ANO_ULT_MOD IS NULL";
        } else if (this.getIefAnoUltMod() != null) {
            conditions += " AND IEF_ANO_ULT_MOD = ?";
            values.add(this.getIefAnoUltMod());
        }

        if (this.getIefMesUltMod() != null && this.getIefMesUltMod().longValue() == -999) {
            conditions += " AND IEF_MES_ULT_MOD IS NULL";
        } else if (this.getIefMesUltMod() != null) {
            conditions += " AND IEF_MES_ULT_MOD = ?";
            values.add(this.getIefMesUltMod());
        }

        if (this.getIefDiaUltMod() != null && this.getIefDiaUltMod().longValue() == -999) {
            conditions += " AND IEF_DIA_ULT_MOD IS NULL";
        } else if (this.getIefDiaUltMod() != null) {
            conditions += " AND IEF_DIA_ULT_MOD = ?";
            values.add(this.getIefDiaUltMod());
        }

        if (this.getIefCveStCiestfin() != null && "null".equals(this.getIefCveStCiestfin())) {
            conditions += " AND IEF_CVE_ST_CIESTFIN IS NULL";
        } else if (this.getIefCveStCiestfin() != null) {
            conditions += " AND IEF_CVE_ST_CIESTFIN = ?";
            values.add(this.getIefCveStCiestfin());
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
        String sql = "UPDATE CIESTFIN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND IEF_NUM_PROGRAMA = ?";
        pkValues.add(this.getIefNumPrograma());
        conditions += " AND IEF_NUM_CONTRATO = ?";
        pkValues.add(this.getIefNumContrato());
        conditions += " AND IEF_NUM_PERS_FID = ?";
        pkValues.add(this.getIefNumPersFid());
        conditions += " AND IEF_NUM_FORMULA = ?";
        pkValues.add(this.getIefNumFormula());
        conditions += " AND IEF_NUM_TERMINO = ?";
        pkValues.add(this.getIefNumTermino());
        fields += " IEF_NUM_CONCEPTO = ?, ";
        values.add(this.getIefNumConcepto());
        fields += " IEF_IMP_EVALUACION = ?, ";
        values.add(this.getIefImpEvaluacion());
        fields += " IEF_PERIODO_EVALUA = ?, ";
        values.add(this.getIefPeriodoEvalua());
        fields += " IEF_ANO_ALTA_REG = ?, ";
        values.add(this.getIefAnoAltaReg());
        fields += " IEF_MES_ALTA_REG = ?, ";
        values.add(this.getIefMesAltaReg());
        fields += " IEF_DIA_ALTA_REG = ?, ";
        values.add(this.getIefDiaAltaReg());
        fields += " IEF_ANO_ULT_MOD = ?, ";
        values.add(this.getIefAnoUltMod());
        fields += " IEF_MES_ULT_MOD = ?, ";
        values.add(this.getIefMesUltMod());
        fields += " IEF_DIA_ULT_MOD = ?, ";
        values.add(this.getIefDiaUltMod());
        fields += " IEF_CVE_ST_CIESTFIN = ?, ";
        values.add(this.getIefCveStCiestfin());
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
        String sql = "INSERT INTO CIESTFIN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", IEF_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getIefNumPrograma());

        fields += ", IEF_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getIefNumContrato());

        fields += ", IEF_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getIefNumPersFid());

        fields += ", IEF_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getIefNumFormula());

        fields += ", IEF_NUM_TERMINO";
        fieldValues += ", ?";
        values.add(this.getIefNumTermino());

        fields += ", IEF_NUM_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getIefNumConcepto());

        fields += ", IEF_IMP_EVALUACION";
        fieldValues += ", ?";
        values.add(this.getIefImpEvaluacion());

        fields += ", IEF_PERIODO_EVALUA";
        fieldValues += ", ?";
        values.add(this.getIefPeriodoEvalua());

        fields += ", IEF_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIefAnoAltaReg());

        fields += ", IEF_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIefMesAltaReg());

        fields += ", IEF_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIefDiaAltaReg());

        fields += ", IEF_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIefAnoUltMod());

        fields += ", IEF_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIefMesUltMod());

        fields += ", IEF_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIefDiaUltMod());

        fields += ", IEF_CVE_ST_CIESTFIN";
        fieldValues += ", ?";
        values.add(this.getIefCveStCiestfin());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CIESTFIN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND IEF_NUM_PROGRAMA = ?";
        values.add(this.getIefNumPrograma());
        conditions += " AND IEF_NUM_CONTRATO = ?";
        values.add(this.getIefNumContrato());
        conditions += " AND IEF_NUM_PERS_FID = ?";
        values.add(this.getIefNumPersFid());
        conditions += " AND IEF_NUM_FORMULA = ?";
        values.add(this.getIefNumFormula());
        conditions += " AND IEF_NUM_TERMINO = ?";
        values.add(this.getIefNumTermino());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ciestfin instance = (Ciestfin) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIefNumPrograma().equals(instance.getIefNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getIefNumContrato().equals(instance.getIefNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getIefNumPersFid().equals(instance.getIefNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getIefNumFormula().equals(instance.getIefNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getIefNumTermino().equals(instance.getIefNumTermino()))
            equalObjects = false;
        if (equalObjects && !this.getIefNumConcepto().equals(instance.getIefNumConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getIefImpEvaluacion().equals(instance.getIefImpEvaluacion()))
            equalObjects = false;
        if (equalObjects && !this.getIefPeriodoEvalua().equals(instance.getIefPeriodoEvalua()))
            equalObjects = false;
        if (equalObjects && !this.getIefAnoAltaReg().equals(instance.getIefAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIefMesAltaReg().equals(instance.getIefMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIefDiaAltaReg().equals(instance.getIefDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIefAnoUltMod().equals(instance.getIefAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIefMesUltMod().equals(instance.getIefMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIefDiaUltMod().equals(instance.getIefDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIefCveStCiestfin().equals(instance.getIefCveStCiestfin()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ciestfin result = new Ciestfin();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIefNumPrograma((BigDecimal) objectData.getData("IEF_NUM_PROGRAMA"));
        result.setIefNumContrato((BigDecimal) objectData.getData("IEF_NUM_CONTRATO"));
        result.setIefNumPersFid((BigDecimal) objectData.getData("IEF_NUM_PERS_FID"));
        result.setIefNumFormula((BigDecimal) objectData.getData("IEF_NUM_FORMULA"));
        result.setIefNumTermino((BigDecimal) objectData.getData("IEF_NUM_TERMINO"));
        result.setIefNumConcepto((BigDecimal) objectData.getData("IEF_NUM_CONCEPTO"));
        result.setIefImpEvaluacion((BigDecimal) objectData.getData("IEF_IMP_EVALUACION"));
        result.setIefPeriodoEvalua((String) objectData.getData("IEF_PERIODO_EVALUA"));
        result.setIefAnoAltaReg((BigDecimal) objectData.getData("IEF_ANO_ALTA_REG"));
        result.setIefMesAltaReg((BigDecimal) objectData.getData("IEF_MES_ALTA_REG"));
        result.setIefDiaAltaReg((BigDecimal) objectData.getData("IEF_DIA_ALTA_REG"));
        result.setIefAnoUltMod((BigDecimal) objectData.getData("IEF_ANO_ULT_MOD"));
        result.setIefMesUltMod((BigDecimal) objectData.getData("IEF_MES_ULT_MOD"));
        result.setIefDiaUltMod((BigDecimal) objectData.getData("IEF_DIA_ULT_MOD"));
        result.setIefCveStCiestfin((String) objectData.getData("IEF_CVE_ST_CIESTFIN"));

        return result;

    }

}
