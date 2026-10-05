package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PROINFLA_PK", columns = { "PCI_NUM_PROGRAMA", "PCI_NUM_EMISION", "PCI_NUM_SEC_CALC" }, sequences = { "MANUAL" })
public class Proinfla extends DomainObject {

    BigDecimal pciNumPrograma = null;
    BigDecimal pciNumEmision = null;
    BigDecimal pciNumSecCalc = null;
    BigDecimal pciAnoCalcInicio = null;
    BigDecimal pciMesCalcInicio = null;
    BigDecimal pciDiaCalcInicio = null;
    BigDecimal pciAnoCalcFin = null;
    BigDecimal pciMesCalcFin = null;
    BigDecimal pciDiaCalcFin = null;
    BigDecimal pciNumFormula = null;
    BigDecimal pciImpIndiceInicio = null;
    BigDecimal pciImpIndiceFin = null;
    BigDecimal pciImpIndiceCalc = null;
    BigDecimal pciNumDiasTrans = null;
    BigDecimal pciNumMoneda = null;
    String pciDescMoneda = null;
    BigDecimal pciAnoAltaReg = null;
    BigDecimal pciMesAltaReg = null;
    BigDecimal pciDiaAltaReg = null;
    BigDecimal pciAnoUltMod = null;
    BigDecimal pciMesUltMod = null;
    BigDecimal pciDiaUltMod = null;
    String pciCveStCalcucpp = null;

    public Proinfla() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPciNumPrograma(BigDecimal pciNumPrograma) {
        this.pciNumPrograma = pciNumPrograma;
    }

    public BigDecimal getPciNumPrograma() {
        return this.pciNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPciNumEmision(BigDecimal pciNumEmision) {
        this.pciNumEmision = pciNumEmision;
    }

    public BigDecimal getPciNumEmision() {
        return this.pciNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPciNumSecCalc(BigDecimal pciNumSecCalc) {
        this.pciNumSecCalc = pciNumSecCalc;
    }

    public BigDecimal getPciNumSecCalc() {
        return this.pciNumSecCalc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPciAnoCalcInicio(BigDecimal pciAnoCalcInicio) {
        this.pciAnoCalcInicio = pciAnoCalcInicio;
    }

    public BigDecimal getPciAnoCalcInicio() {
        return this.pciAnoCalcInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPciMesCalcInicio(BigDecimal pciMesCalcInicio) {
        this.pciMesCalcInicio = pciMesCalcInicio;
    }

    public BigDecimal getPciMesCalcInicio() {
        return this.pciMesCalcInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPciDiaCalcInicio(BigDecimal pciDiaCalcInicio) {
        this.pciDiaCalcInicio = pciDiaCalcInicio;
    }

    public BigDecimal getPciDiaCalcInicio() {
        return this.pciDiaCalcInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPciAnoCalcFin(BigDecimal pciAnoCalcFin) {
        this.pciAnoCalcFin = pciAnoCalcFin;
    }

    public BigDecimal getPciAnoCalcFin() {
        return this.pciAnoCalcFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPciMesCalcFin(BigDecimal pciMesCalcFin) {
        this.pciMesCalcFin = pciMesCalcFin;
    }

    public BigDecimal getPciMesCalcFin() {
        return this.pciMesCalcFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPciDiaCalcFin(BigDecimal pciDiaCalcFin) {
        this.pciDiaCalcFin = pciDiaCalcFin;
    }

    public BigDecimal getPciDiaCalcFin() {
        return this.pciDiaCalcFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPciNumFormula(BigDecimal pciNumFormula) {
        this.pciNumFormula = pciNumFormula;
    }

    public BigDecimal getPciNumFormula() {
        return this.pciNumFormula;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setPciImpIndiceInicio(BigDecimal pciImpIndiceInicio) {
        this.pciImpIndiceInicio = pciImpIndiceInicio;
    }

    public BigDecimal getPciImpIndiceInicio() {
        return this.pciImpIndiceInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setPciImpIndiceFin(BigDecimal pciImpIndiceFin) {
        this.pciImpIndiceFin = pciImpIndiceFin;
    }

    public BigDecimal getPciImpIndiceFin() {
        return this.pciImpIndiceFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setPciImpIndiceCalc(BigDecimal pciImpIndiceCalc) {
        this.pciImpIndiceCalc = pciImpIndiceCalc;
    }

    public BigDecimal getPciImpIndiceCalc() {
        return this.pciImpIndiceCalc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPciNumDiasTrans(BigDecimal pciNumDiasTrans) {
        this.pciNumDiasTrans = pciNumDiasTrans;
    }

    public BigDecimal getPciNumDiasTrans() {
        return this.pciNumDiasTrans;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPciNumMoneda(BigDecimal pciNumMoneda) {
        this.pciNumMoneda = pciNumMoneda;
    }

    public BigDecimal getPciNumMoneda() {
        return this.pciNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPciDescMoneda(String pciDescMoneda) {
        this.pciDescMoneda = pciDescMoneda;
    }

    public String getPciDescMoneda() {
        return this.pciDescMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPciAnoAltaReg(BigDecimal pciAnoAltaReg) {
        this.pciAnoAltaReg = pciAnoAltaReg;
    }

    public BigDecimal getPciAnoAltaReg() {
        return this.pciAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPciMesAltaReg(BigDecimal pciMesAltaReg) {
        this.pciMesAltaReg = pciMesAltaReg;
    }

    public BigDecimal getPciMesAltaReg() {
        return this.pciMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPciDiaAltaReg(BigDecimal pciDiaAltaReg) {
        this.pciDiaAltaReg = pciDiaAltaReg;
    }

    public BigDecimal getPciDiaAltaReg() {
        return this.pciDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPciAnoUltMod(BigDecimal pciAnoUltMod) {
        this.pciAnoUltMod = pciAnoUltMod;
    }

    public BigDecimal getPciAnoUltMod() {
        return this.pciAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPciMesUltMod(BigDecimal pciMesUltMod) {
        this.pciMesUltMod = pciMesUltMod;
    }

    public BigDecimal getPciMesUltMod() {
        return this.pciMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPciDiaUltMod(BigDecimal pciDiaUltMod) {
        this.pciDiaUltMod = pciDiaUltMod;
    }

    public BigDecimal getPciDiaUltMod() {
        return this.pciDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPciCveStCalcucpp(String pciCveStCalcucpp) {
        this.pciCveStCalcucpp = pciCveStCalcucpp;
    }

    public String getPciCveStCalcucpp() {
        return this.pciCveStCalcucpp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PROINFLA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPciNumPrograma() != null && this.getPciNumPrograma().longValue() == -999) {
            conditions += " AND PCI_NUM_PROGRAMA IS NULL";
        } else if (this.getPciNumPrograma() != null) {
            conditions += " AND PCI_NUM_PROGRAMA = ?";
            values.add(this.getPciNumPrograma());
        }

        if (this.getPciNumEmision() != null && this.getPciNumEmision().longValue() == -999) {
            conditions += " AND PCI_NUM_EMISION IS NULL";
        } else if (this.getPciNumEmision() != null) {
            conditions += " AND PCI_NUM_EMISION = ?";
            values.add(this.getPciNumEmision());
        }

        if (this.getPciNumSecCalc() != null && this.getPciNumSecCalc().longValue() == -999) {
            conditions += " AND PCI_NUM_SEC_CALC IS NULL";
        } else if (this.getPciNumSecCalc() != null) {
            conditions += " AND PCI_NUM_SEC_CALC = ?";
            values.add(this.getPciNumSecCalc());
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
        String sql = "SELECT * FROM PROINFLA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPciNumPrograma() != null && this.getPciNumPrograma().longValue() == -999) {
            conditions += " AND PCI_NUM_PROGRAMA IS NULL";
        } else if (this.getPciNumPrograma() != null) {
            conditions += " AND PCI_NUM_PROGRAMA = ?";
            values.add(this.getPciNumPrograma());
        }

        if (this.getPciNumEmision() != null && this.getPciNumEmision().longValue() == -999) {
            conditions += " AND PCI_NUM_EMISION IS NULL";
        } else if (this.getPciNumEmision() != null) {
            conditions += " AND PCI_NUM_EMISION = ?";
            values.add(this.getPciNumEmision());
        }

        if (this.getPciNumSecCalc() != null && this.getPciNumSecCalc().longValue() == -999) {
            conditions += " AND PCI_NUM_SEC_CALC IS NULL";
        } else if (this.getPciNumSecCalc() != null) {
            conditions += " AND PCI_NUM_SEC_CALC = ?";
            values.add(this.getPciNumSecCalc());
        }

        if (this.getPciAnoCalcInicio() != null && this.getPciAnoCalcInicio().longValue() == -999) {
            conditions += " AND PCI_ANO_CALC_INICIO IS NULL";
        } else if (this.getPciAnoCalcInicio() != null) {
            conditions += " AND PCI_ANO_CALC_INICIO = ?";
            values.add(this.getPciAnoCalcInicio());
        }

        if (this.getPciMesCalcInicio() != null && this.getPciMesCalcInicio().longValue() == -999) {
            conditions += " AND PCI_MES_CALC_INICIO IS NULL";
        } else if (this.getPciMesCalcInicio() != null) {
            conditions += " AND PCI_MES_CALC_INICIO = ?";
            values.add(this.getPciMesCalcInicio());
        }

        if (this.getPciDiaCalcInicio() != null && this.getPciDiaCalcInicio().longValue() == -999) {
            conditions += " AND PCI_DIA_CALC_INICIO IS NULL";
        } else if (this.getPciDiaCalcInicio() != null) {
            conditions += " AND PCI_DIA_CALC_INICIO = ?";
            values.add(this.getPciDiaCalcInicio());
        }

        if (this.getPciAnoCalcFin() != null && this.getPciAnoCalcFin().longValue() == -999) {
            conditions += " AND PCI_ANO_CALC_FIN IS NULL";
        } else if (this.getPciAnoCalcFin() != null) {
            conditions += " AND PCI_ANO_CALC_FIN = ?";
            values.add(this.getPciAnoCalcFin());
        }

        if (this.getPciMesCalcFin() != null && this.getPciMesCalcFin().longValue() == -999) {
            conditions += " AND PCI_MES_CALC_FIN IS NULL";
        } else if (this.getPciMesCalcFin() != null) {
            conditions += " AND PCI_MES_CALC_FIN = ?";
            values.add(this.getPciMesCalcFin());
        }

        if (this.getPciDiaCalcFin() != null && this.getPciDiaCalcFin().longValue() == -999) {
            conditions += " AND PCI_DIA_CALC_FIN IS NULL";
        } else if (this.getPciDiaCalcFin() != null) {
            conditions += " AND PCI_DIA_CALC_FIN = ?";
            values.add(this.getPciDiaCalcFin());
        }

        if (this.getPciNumFormula() != null && this.getPciNumFormula().longValue() == -999) {
            conditions += " AND PCI_NUM_FORMULA IS NULL";
        } else if (this.getPciNumFormula() != null) {
            conditions += " AND PCI_NUM_FORMULA = ?";
            values.add(this.getPciNumFormula());
        }

        if (this.getPciImpIndiceInicio() != null && this.getPciImpIndiceInicio().longValue() == -999) {
            conditions += " AND PCI_IMP_INDICE_INICIO IS NULL";
        } else if (this.getPciImpIndiceInicio() != null) {
            conditions += " AND PCI_IMP_INDICE_INICIO = ?";
            values.add(this.getPciImpIndiceInicio());
        }

        if (this.getPciImpIndiceFin() != null && this.getPciImpIndiceFin().longValue() == -999) {
            conditions += " AND PCI_IMP_INDICE_FIN IS NULL";
        } else if (this.getPciImpIndiceFin() != null) {
            conditions += " AND PCI_IMP_INDICE_FIN = ?";
            values.add(this.getPciImpIndiceFin());
        }

        if (this.getPciImpIndiceCalc() != null && this.getPciImpIndiceCalc().longValue() == -999) {
            conditions += " AND PCI_IMP_INDICE_CALC IS NULL";
        } else if (this.getPciImpIndiceCalc() != null) {
            conditions += " AND PCI_IMP_INDICE_CALC = ?";
            values.add(this.getPciImpIndiceCalc());
        }

        if (this.getPciNumDiasTrans() != null && this.getPciNumDiasTrans().longValue() == -999) {
            conditions += " AND PCI_NUM_DIAS_TRANS IS NULL";
        } else if (this.getPciNumDiasTrans() != null) {
            conditions += " AND PCI_NUM_DIAS_TRANS = ?";
            values.add(this.getPciNumDiasTrans());
        }

        if (this.getPciNumMoneda() != null && this.getPciNumMoneda().longValue() == -999) {
            conditions += " AND PCI_NUM_MONEDA IS NULL";
        } else if (this.getPciNumMoneda() != null) {
            conditions += " AND PCI_NUM_MONEDA = ?";
            values.add(this.getPciNumMoneda());
        }

        if (this.getPciDescMoneda() != null && "null".equals(this.getPciDescMoneda())) {
            conditions += " AND PCI_DESC_MONEDA IS NULL";
        } else if (this.getPciDescMoneda() != null) {
            conditions += " AND PCI_DESC_MONEDA = ?";
            values.add(this.getPciDescMoneda());
        }

        if (this.getPciAnoAltaReg() != null && this.getPciAnoAltaReg().longValue() == -999) {
            conditions += " AND PCI_ANO_ALTA_REG IS NULL";
        } else if (this.getPciAnoAltaReg() != null) {
            conditions += " AND PCI_ANO_ALTA_REG = ?";
            values.add(this.getPciAnoAltaReg());
        }

        if (this.getPciMesAltaReg() != null && this.getPciMesAltaReg().longValue() == -999) {
            conditions += " AND PCI_MES_ALTA_REG IS NULL";
        } else if (this.getPciMesAltaReg() != null) {
            conditions += " AND PCI_MES_ALTA_REG = ?";
            values.add(this.getPciMesAltaReg());
        }

        if (this.getPciDiaAltaReg() != null && this.getPciDiaAltaReg().longValue() == -999) {
            conditions += " AND PCI_DIA_ALTA_REG IS NULL";
        } else if (this.getPciDiaAltaReg() != null) {
            conditions += " AND PCI_DIA_ALTA_REG = ?";
            values.add(this.getPciDiaAltaReg());
        }

        if (this.getPciAnoUltMod() != null && this.getPciAnoUltMod().longValue() == -999) {
            conditions += " AND PCI_ANO_ULT_MOD IS NULL";
        } else if (this.getPciAnoUltMod() != null) {
            conditions += " AND PCI_ANO_ULT_MOD = ?";
            values.add(this.getPciAnoUltMod());
        }

        if (this.getPciMesUltMod() != null && this.getPciMesUltMod().longValue() == -999) {
            conditions += " AND PCI_MES_ULT_MOD IS NULL";
        } else if (this.getPciMesUltMod() != null) {
            conditions += " AND PCI_MES_ULT_MOD = ?";
            values.add(this.getPciMesUltMod());
        }

        if (this.getPciDiaUltMod() != null && this.getPciDiaUltMod().longValue() == -999) {
            conditions += " AND PCI_DIA_ULT_MOD IS NULL";
        } else if (this.getPciDiaUltMod() != null) {
            conditions += " AND PCI_DIA_ULT_MOD = ?";
            values.add(this.getPciDiaUltMod());
        }

        if (this.getPciCveStCalcucpp() != null && "null".equals(this.getPciCveStCalcucpp())) {
            conditions += " AND PCI_CVE_ST_CALCUCPP IS NULL";
        } else if (this.getPciCveStCalcucpp() != null) {
            conditions += " AND PCI_CVE_ST_CALCUCPP = ?";
            values.add(this.getPciCveStCalcucpp());
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
        String sql = "UPDATE PROINFLA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PCI_NUM_PROGRAMA = ?";
        pkValues.add(this.getPciNumPrograma());
        conditions += " AND PCI_NUM_EMISION = ?";
        pkValues.add(this.getPciNumEmision());
        conditions += " AND PCI_NUM_SEC_CALC = ?";
        pkValues.add(this.getPciNumSecCalc());
        fields += " PCI_ANO_CALC_INICIO = ?, ";
        values.add(this.getPciAnoCalcInicio());
        fields += " PCI_MES_CALC_INICIO = ?, ";
        values.add(this.getPciMesCalcInicio());
        fields += " PCI_DIA_CALC_INICIO = ?, ";
        values.add(this.getPciDiaCalcInicio());
        fields += " PCI_ANO_CALC_FIN = ?, ";
        values.add(this.getPciAnoCalcFin());
        fields += " PCI_MES_CALC_FIN = ?, ";
        values.add(this.getPciMesCalcFin());
        fields += " PCI_DIA_CALC_FIN = ?, ";
        values.add(this.getPciDiaCalcFin());
        fields += " PCI_NUM_FORMULA = ?, ";
        values.add(this.getPciNumFormula());
        fields += " PCI_IMP_INDICE_INICIO = ?, ";
        values.add(this.getPciImpIndiceInicio());
        fields += " PCI_IMP_INDICE_FIN = ?, ";
        values.add(this.getPciImpIndiceFin());
        fields += " PCI_IMP_INDICE_CALC = ?, ";
        values.add(this.getPciImpIndiceCalc());
        fields += " PCI_NUM_DIAS_TRANS = ?, ";
        values.add(this.getPciNumDiasTrans());
        fields += " PCI_NUM_MONEDA = ?, ";
        values.add(this.getPciNumMoneda());
        fields += " PCI_DESC_MONEDA = ?, ";
        values.add(this.getPciDescMoneda());
        fields += " PCI_ANO_ALTA_REG = ?, ";
        values.add(this.getPciAnoAltaReg());
        fields += " PCI_MES_ALTA_REG = ?, ";
        values.add(this.getPciMesAltaReg());
        fields += " PCI_DIA_ALTA_REG = ?, ";
        values.add(this.getPciDiaAltaReg());
        fields += " PCI_ANO_ULT_MOD = ?, ";
        values.add(this.getPciAnoUltMod());
        fields += " PCI_MES_ULT_MOD = ?, ";
        values.add(this.getPciMesUltMod());
        fields += " PCI_DIA_ULT_MOD = ?, ";
        values.add(this.getPciDiaUltMod());
        fields += " PCI_CVE_ST_CALCUCPP = ?, ";
        values.add(this.getPciCveStCalcucpp());
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
        String sql = "INSERT INTO PROINFLA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PCI_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getPciNumPrograma());

        fields += ", PCI_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getPciNumEmision());

        fields += ", PCI_NUM_SEC_CALC";
        fieldValues += ", ?";
        values.add(this.getPciNumSecCalc());

        fields += ", PCI_ANO_CALC_INICIO";
        fieldValues += ", ?";
        values.add(this.getPciAnoCalcInicio());

        fields += ", PCI_MES_CALC_INICIO";
        fieldValues += ", ?";
        values.add(this.getPciMesCalcInicio());

        fields += ", PCI_DIA_CALC_INICIO";
        fieldValues += ", ?";
        values.add(this.getPciDiaCalcInicio());

        fields += ", PCI_ANO_CALC_FIN";
        fieldValues += ", ?";
        values.add(this.getPciAnoCalcFin());

        fields += ", PCI_MES_CALC_FIN";
        fieldValues += ", ?";
        values.add(this.getPciMesCalcFin());

        fields += ", PCI_DIA_CALC_FIN";
        fieldValues += ", ?";
        values.add(this.getPciDiaCalcFin());

        fields += ", PCI_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getPciNumFormula());

        fields += ", PCI_IMP_INDICE_INICIO";
        fieldValues += ", ?";
        values.add(this.getPciImpIndiceInicio());

        fields += ", PCI_IMP_INDICE_FIN";
        fieldValues += ", ?";
        values.add(this.getPciImpIndiceFin());

        fields += ", PCI_IMP_INDICE_CALC";
        fieldValues += ", ?";
        values.add(this.getPciImpIndiceCalc());

        fields += ", PCI_NUM_DIAS_TRANS";
        fieldValues += ", ?";
        values.add(this.getPciNumDiasTrans());

        fields += ", PCI_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getPciNumMoneda());

        fields += ", PCI_DESC_MONEDA";
        fieldValues += ", ?";
        values.add(this.getPciDescMoneda());

        fields += ", PCI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPciAnoAltaReg());

        fields += ", PCI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPciMesAltaReg());

        fields += ", PCI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPciDiaAltaReg());

        fields += ", PCI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPciAnoUltMod());

        fields += ", PCI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPciMesUltMod());

        fields += ", PCI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPciDiaUltMod());

        fields += ", PCI_CVE_ST_CALCUCPP";
        fieldValues += ", ?";
        values.add(this.getPciCveStCalcucpp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PROINFLA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PCI_NUM_PROGRAMA = ?";
        values.add(this.getPciNumPrograma());
        conditions += " AND PCI_NUM_EMISION = ?";
        values.add(this.getPciNumEmision());
        conditions += " AND PCI_NUM_SEC_CALC = ?";
        values.add(this.getPciNumSecCalc());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Proinfla instance = (Proinfla) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPciNumPrograma().equals(instance.getPciNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getPciNumEmision().equals(instance.getPciNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getPciNumSecCalc().equals(instance.getPciNumSecCalc()))
            equalObjects = false;
        if (equalObjects && !this.getPciAnoCalcInicio().equals(instance.getPciAnoCalcInicio()))
            equalObjects = false;
        if (equalObjects && !this.getPciMesCalcInicio().equals(instance.getPciMesCalcInicio()))
            equalObjects = false;
        if (equalObjects && !this.getPciDiaCalcInicio().equals(instance.getPciDiaCalcInicio()))
            equalObjects = false;
        if (equalObjects && !this.getPciAnoCalcFin().equals(instance.getPciAnoCalcFin()))
            equalObjects = false;
        if (equalObjects && !this.getPciMesCalcFin().equals(instance.getPciMesCalcFin()))
            equalObjects = false;
        if (equalObjects && !this.getPciDiaCalcFin().equals(instance.getPciDiaCalcFin()))
            equalObjects = false;
        if (equalObjects && !this.getPciNumFormula().equals(instance.getPciNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getPciImpIndiceInicio().equals(instance.getPciImpIndiceInicio()))
            equalObjects = false;
        if (equalObjects && !this.getPciImpIndiceFin().equals(instance.getPciImpIndiceFin()))
            equalObjects = false;
        if (equalObjects && !this.getPciImpIndiceCalc().equals(instance.getPciImpIndiceCalc()))
            equalObjects = false;
        if (equalObjects && !this.getPciNumDiasTrans().equals(instance.getPciNumDiasTrans()))
            equalObjects = false;
        if (equalObjects && !this.getPciNumMoneda().equals(instance.getPciNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getPciDescMoneda().equals(instance.getPciDescMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getPciAnoAltaReg().equals(instance.getPciAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPciMesAltaReg().equals(instance.getPciMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPciDiaAltaReg().equals(instance.getPciDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPciAnoUltMod().equals(instance.getPciAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPciMesUltMod().equals(instance.getPciMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPciDiaUltMod().equals(instance.getPciDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPciCveStCalcucpp().equals(instance.getPciCveStCalcucpp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Proinfla result = new Proinfla();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPciNumPrograma((BigDecimal) objectData.getData("PCI_NUM_PROGRAMA"));
        result.setPciNumEmision((BigDecimal) objectData.getData("PCI_NUM_EMISION"));
        result.setPciNumSecCalc((BigDecimal) objectData.getData("PCI_NUM_SEC_CALC"));
        result.setPciAnoCalcInicio((BigDecimal) objectData.getData("PCI_ANO_CALC_INICIO"));
        result.setPciMesCalcInicio((BigDecimal) objectData.getData("PCI_MES_CALC_INICIO"));
        result.setPciDiaCalcInicio((BigDecimal) objectData.getData("PCI_DIA_CALC_INICIO"));
        result.setPciAnoCalcFin((BigDecimal) objectData.getData("PCI_ANO_CALC_FIN"));
        result.setPciMesCalcFin((BigDecimal) objectData.getData("PCI_MES_CALC_FIN"));
        result.setPciDiaCalcFin((BigDecimal) objectData.getData("PCI_DIA_CALC_FIN"));
        result.setPciNumFormula((BigDecimal) objectData.getData("PCI_NUM_FORMULA"));
        result.setPciImpIndiceInicio((BigDecimal) objectData.getData("PCI_IMP_INDICE_INICIO"));
        result.setPciImpIndiceFin((BigDecimal) objectData.getData("PCI_IMP_INDICE_FIN"));
        result.setPciImpIndiceCalc((BigDecimal) objectData.getData("PCI_IMP_INDICE_CALC"));
        result.setPciNumDiasTrans((BigDecimal) objectData.getData("PCI_NUM_DIAS_TRANS"));
        result.setPciNumMoneda((BigDecimal) objectData.getData("PCI_NUM_MONEDA"));
        result.setPciDescMoneda((String) objectData.getData("PCI_DESC_MONEDA"));
        result.setPciAnoAltaReg((BigDecimal) objectData.getData("PCI_ANO_ALTA_REG"));
        result.setPciMesAltaReg((BigDecimal) objectData.getData("PCI_MES_ALTA_REG"));
        result.setPciDiaAltaReg((BigDecimal) objectData.getData("PCI_DIA_ALTA_REG"));
        result.setPciAnoUltMod((BigDecimal) objectData.getData("PCI_ANO_ULT_MOD"));
        result.setPciMesUltMod((BigDecimal) objectData.getData("PCI_MES_ULT_MOD"));
        result.setPciDiaUltMod((BigDecimal) objectData.getData("PCI_DIA_ULT_MOD"));
        result.setPciCveStCalcucpp((String) objectData.getData("PCI_CVE_ST_CALCUCPP"));

        return result;

    }

}
