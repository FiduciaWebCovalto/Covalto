package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "E_NEGS_PK",
            columns =
            { "ESTN_NUM_ANO", "ESTN_NUM_MES", "ESTN_CVE_TIPO_NEG", "ESTN_CVE_CLS_PROD", "ESTN_NUM_NIVEL1", "ESTN_NUM_NIVEL2", "ESTN_NUM_NIVEL3", "ESTN_NUM_NIVEL4",
              "ESTN_NUM_NIVEL5"
    }, sequences = { "MANUAL" })
public class ENegs extends DomainObject {

    BigDecimal estnNumNivel1 = null;
    BigDecimal estnNumNivel2 = null;
    BigDecimal estnNumNivel3 = null;
    BigDecimal estnNumNivel4 = null;
    BigDecimal estnNumNivel5 = null;
    BigDecimal estnNumAno = null;
    String estnNumMes = null;
    String estnCveTipoNeg = null;
    String estnCveClsProd = null;
    BigDecimal estnNumInvIni = null;
    BigDecimal estnImpInvIni = null;
    BigDecimal estnNumConst = null;
    BigDecimal estnImpConst = null;
    BigDecimal estnNumExti = null;
    BigDecimal estnImpExti = null;
    BigDecimal estnNumDesc = null;
    BigDecimal estnImpDesc = null;
    BigDecimal estnAnoAltaReg = null;
    BigDecimal estnMesAltaReg = null;
    BigDecimal estnDiaAltaReg = null;
    BigDecimal estnAnoUltMod = null;
    BigDecimal estnMesUltMod = null;
    BigDecimal estnDiaUltMod = null;
    String estnCveStNivel = null;

    public ENegs() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstnNumNivel1(BigDecimal estnNumNivel1) {
        this.estnNumNivel1 = estnNumNivel1;
    }

    public BigDecimal getEstnNumNivel1() {
        return this.estnNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstnNumNivel2(BigDecimal estnNumNivel2) {
        this.estnNumNivel2 = estnNumNivel2;
    }

    public BigDecimal getEstnNumNivel2() {
        return this.estnNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstnNumNivel3(BigDecimal estnNumNivel3) {
        this.estnNumNivel3 = estnNumNivel3;
    }

    public BigDecimal getEstnNumNivel3() {
        return this.estnNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstnNumNivel4(BigDecimal estnNumNivel4) {
        this.estnNumNivel4 = estnNumNivel4;
    }

    public BigDecimal getEstnNumNivel4() {
        return this.estnNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstnNumNivel5(BigDecimal estnNumNivel5) {
        this.estnNumNivel5 = estnNumNivel5;
    }

    public BigDecimal getEstnNumNivel5() {
        return this.estnNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstnNumAno(BigDecimal estnNumAno) {
        this.estnNumAno = estnNumAno;
    }

    public BigDecimal getEstnNumAno() {
        return this.estnNumAno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstnNumMes(String estnNumMes) {
        this.estnNumMes = estnNumMes;
    }

    public String getEstnNumMes() {
        return this.estnNumMes;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstnCveTipoNeg(String estnCveTipoNeg) {
        this.estnCveTipoNeg = estnCveTipoNeg;
    }

    public String getEstnCveTipoNeg() {
        return this.estnCveTipoNeg;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstnCveClsProd(String estnCveClsProd) {
        this.estnCveClsProd = estnCveClsProd;
    }

    public String getEstnCveClsProd() {
        return this.estnCveClsProd;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstnNumInvIni(BigDecimal estnNumInvIni) {
        this.estnNumInvIni = estnNumInvIni;
    }

    public BigDecimal getEstnNumInvIni() {
        return this.estnNumInvIni;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstnImpInvIni(BigDecimal estnImpInvIni) {
        this.estnImpInvIni = estnImpInvIni;
    }

    public BigDecimal getEstnImpInvIni() {
        return this.estnImpInvIni;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstnNumConst(BigDecimal estnNumConst) {
        this.estnNumConst = estnNumConst;
    }

    public BigDecimal getEstnNumConst() {
        return this.estnNumConst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstnImpConst(BigDecimal estnImpConst) {
        this.estnImpConst = estnImpConst;
    }

    public BigDecimal getEstnImpConst() {
        return this.estnImpConst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstnNumExti(BigDecimal estnNumExti) {
        this.estnNumExti = estnNumExti;
    }

    public BigDecimal getEstnNumExti() {
        return this.estnNumExti;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstnImpExti(BigDecimal estnImpExti) {
        this.estnImpExti = estnImpExti;
    }

    public BigDecimal getEstnImpExti() {
        return this.estnImpExti;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstnNumDesc(BigDecimal estnNumDesc) {
        this.estnNumDesc = estnNumDesc;
    }

    public BigDecimal getEstnNumDesc() {
        return this.estnNumDesc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstnImpDesc(BigDecimal estnImpDesc) {
        this.estnImpDesc = estnImpDesc;
    }

    public BigDecimal getEstnImpDesc() {
        return this.estnImpDesc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstnAnoAltaReg(BigDecimal estnAnoAltaReg) {
        this.estnAnoAltaReg = estnAnoAltaReg;
    }

    public BigDecimal getEstnAnoAltaReg() {
        return this.estnAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstnMesAltaReg(BigDecimal estnMesAltaReg) {
        this.estnMesAltaReg = estnMesAltaReg;
    }

    public BigDecimal getEstnMesAltaReg() {
        return this.estnMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstnDiaAltaReg(BigDecimal estnDiaAltaReg) {
        this.estnDiaAltaReg = estnDiaAltaReg;
    }

    public BigDecimal getEstnDiaAltaReg() {
        return this.estnDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstnAnoUltMod(BigDecimal estnAnoUltMod) {
        this.estnAnoUltMod = estnAnoUltMod;
    }

    public BigDecimal getEstnAnoUltMod() {
        return this.estnAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstnMesUltMod(BigDecimal estnMesUltMod) {
        this.estnMesUltMod = estnMesUltMod;
    }

    public BigDecimal getEstnMesUltMod() {
        return this.estnMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstnDiaUltMod(BigDecimal estnDiaUltMod) {
        this.estnDiaUltMod = estnDiaUltMod;
    }

    public BigDecimal getEstnDiaUltMod() {
        return this.estnDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstnCveStNivel(String estnCveStNivel) {
        this.estnCveStNivel = estnCveStNivel;
    }

    public String getEstnCveStNivel() {
        return this.estnCveStNivel;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM E_NEGS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstnNumNivel1() != null && this.getEstnNumNivel1().longValue() == -999) {
            conditions += " AND ESTN_NUM_NIVEL1 IS NULL";
        } else if (this.getEstnNumNivel1() != null) {
            conditions += " AND ESTN_NUM_NIVEL1 = ?";
            values.add(this.getEstnNumNivel1());
        }

        if (this.getEstnNumNivel2() != null && this.getEstnNumNivel2().longValue() == -999) {
            conditions += " AND ESTN_NUM_NIVEL2 IS NULL";
        } else if (this.getEstnNumNivel2() != null) {
            conditions += " AND ESTN_NUM_NIVEL2 = ?";
            values.add(this.getEstnNumNivel2());
        }

        if (this.getEstnNumNivel3() != null && this.getEstnNumNivel3().longValue() == -999) {
            conditions += " AND ESTN_NUM_NIVEL3 IS NULL";
        } else if (this.getEstnNumNivel3() != null) {
            conditions += " AND ESTN_NUM_NIVEL3 = ?";
            values.add(this.getEstnNumNivel3());
        }

        if (this.getEstnNumNivel4() != null && this.getEstnNumNivel4().longValue() == -999) {
            conditions += " AND ESTN_NUM_NIVEL4 IS NULL";
        } else if (this.getEstnNumNivel4() != null) {
            conditions += " AND ESTN_NUM_NIVEL4 = ?";
            values.add(this.getEstnNumNivel4());
        }

        if (this.getEstnNumNivel5() != null && this.getEstnNumNivel5().longValue() == -999) {
            conditions += " AND ESTN_NUM_NIVEL5 IS NULL";
        } else if (this.getEstnNumNivel5() != null) {
            conditions += " AND ESTN_NUM_NIVEL5 = ?";
            values.add(this.getEstnNumNivel5());
        }

        if (this.getEstnNumAno() != null && this.getEstnNumAno().longValue() == -999) {
            conditions += " AND ESTN_NUM_ANO IS NULL";
        } else if (this.getEstnNumAno() != null) {
            conditions += " AND ESTN_NUM_ANO = ?";
            values.add(this.getEstnNumAno());
        }

        if (this.getEstnNumMes() != null && "null".equals(this.getEstnNumMes())) {
            conditions += " AND ESTN_NUM_MES IS NULL";
        } else if (this.getEstnNumMes() != null) {
            conditions += " AND ESTN_NUM_MES = ?";
            values.add(this.getEstnNumMes());
        }

        if (this.getEstnCveTipoNeg() != null && "null".equals(this.getEstnCveTipoNeg())) {
            conditions += " AND ESTN_CVE_TIPO_NEG IS NULL";
        } else if (this.getEstnCveTipoNeg() != null) {
            conditions += " AND ESTN_CVE_TIPO_NEG = ?";
            values.add(this.getEstnCveTipoNeg());
        }

        if (this.getEstnCveClsProd() != null && "null".equals(this.getEstnCveClsProd())) {
            conditions += " AND ESTN_CVE_CLS_PROD IS NULL";
        } else if (this.getEstnCveClsProd() != null) {
            conditions += " AND ESTN_CVE_CLS_PROD = ?";
            values.add(this.getEstnCveClsProd());
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
        String sql = "SELECT * FROM E_NEGS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstnNumNivel1() != null && this.getEstnNumNivel1().longValue() == -999) {
            conditions += " AND ESTN_NUM_NIVEL1 IS NULL";
        } else if (this.getEstnNumNivel1() != null) {
            conditions += " AND ESTN_NUM_NIVEL1 = ?";
            values.add(this.getEstnNumNivel1());
        }

        if (this.getEstnNumNivel2() != null && this.getEstnNumNivel2().longValue() == -999) {
            conditions += " AND ESTN_NUM_NIVEL2 IS NULL";
        } else if (this.getEstnNumNivel2() != null) {
            conditions += " AND ESTN_NUM_NIVEL2 = ?";
            values.add(this.getEstnNumNivel2());
        }

        if (this.getEstnNumNivel3() != null && this.getEstnNumNivel3().longValue() == -999) {
            conditions += " AND ESTN_NUM_NIVEL3 IS NULL";
        } else if (this.getEstnNumNivel3() != null) {
            conditions += " AND ESTN_NUM_NIVEL3 = ?";
            values.add(this.getEstnNumNivel3());
        }

        if (this.getEstnNumNivel4() != null && this.getEstnNumNivel4().longValue() == -999) {
            conditions += " AND ESTN_NUM_NIVEL4 IS NULL";
        } else if (this.getEstnNumNivel4() != null) {
            conditions += " AND ESTN_NUM_NIVEL4 = ?";
            values.add(this.getEstnNumNivel4());
        }

        if (this.getEstnNumNivel5() != null && this.getEstnNumNivel5().longValue() == -999) {
            conditions += " AND ESTN_NUM_NIVEL5 IS NULL";
        } else if (this.getEstnNumNivel5() != null) {
            conditions += " AND ESTN_NUM_NIVEL5 = ?";
            values.add(this.getEstnNumNivel5());
        }

        if (this.getEstnNumAno() != null && this.getEstnNumAno().longValue() == -999) {
            conditions += " AND ESTN_NUM_ANO IS NULL";
        } else if (this.getEstnNumAno() != null) {
            conditions += " AND ESTN_NUM_ANO = ?";
            values.add(this.getEstnNumAno());
        }

        if (this.getEstnNumMes() != null && "null".equals(this.getEstnNumMes())) {
            conditions += " AND ESTN_NUM_MES IS NULL";
        } else if (this.getEstnNumMes() != null) {
            conditions += " AND ESTN_NUM_MES = ?";
            values.add(this.getEstnNumMes());
        }

        if (this.getEstnCveTipoNeg() != null && "null".equals(this.getEstnCveTipoNeg())) {
            conditions += " AND ESTN_CVE_TIPO_NEG IS NULL";
        } else if (this.getEstnCveTipoNeg() != null) {
            conditions += " AND ESTN_CVE_TIPO_NEG = ?";
            values.add(this.getEstnCveTipoNeg());
        }

        if (this.getEstnCveClsProd() != null && "null".equals(this.getEstnCveClsProd())) {
            conditions += " AND ESTN_CVE_CLS_PROD IS NULL";
        } else if (this.getEstnCveClsProd() != null) {
            conditions += " AND ESTN_CVE_CLS_PROD = ?";
            values.add(this.getEstnCveClsProd());
        }

        if (this.getEstnNumInvIni() != null && this.getEstnNumInvIni().longValue() == -999) {
            conditions += " AND ESTN_NUM_INV_INI IS NULL";
        } else if (this.getEstnNumInvIni() != null) {
            conditions += " AND ESTN_NUM_INV_INI = ?";
            values.add(this.getEstnNumInvIni());
        }

        if (this.getEstnImpInvIni() != null && this.getEstnImpInvIni().longValue() == -999) {
            conditions += " AND ESTN_IMP_INV_INI IS NULL";
        } else if (this.getEstnImpInvIni() != null) {
            conditions += " AND ESTN_IMP_INV_INI = ?";
            values.add(this.getEstnImpInvIni());
        }

        if (this.getEstnNumConst() != null && this.getEstnNumConst().longValue() == -999) {
            conditions += " AND ESTN_NUM_CONST IS NULL";
        } else if (this.getEstnNumConst() != null) {
            conditions += " AND ESTN_NUM_CONST = ?";
            values.add(this.getEstnNumConst());
        }

        if (this.getEstnImpConst() != null && this.getEstnImpConst().longValue() == -999) {
            conditions += " AND ESTN_IMP_CONST IS NULL";
        } else if (this.getEstnImpConst() != null) {
            conditions += " AND ESTN_IMP_CONST = ?";
            values.add(this.getEstnImpConst());
        }

        if (this.getEstnNumExti() != null && this.getEstnNumExti().longValue() == -999) {
            conditions += " AND ESTN_NUM_EXTI IS NULL";
        } else if (this.getEstnNumExti() != null) {
            conditions += " AND ESTN_NUM_EXTI = ?";
            values.add(this.getEstnNumExti());
        }

        if (this.getEstnImpExti() != null && this.getEstnImpExti().longValue() == -999) {
            conditions += " AND ESTN_IMP_EXTI IS NULL";
        } else if (this.getEstnImpExti() != null) {
            conditions += " AND ESTN_IMP_EXTI = ?";
            values.add(this.getEstnImpExti());
        }

        if (this.getEstnNumDesc() != null && this.getEstnNumDesc().longValue() == -999) {
            conditions += " AND ESTN_NUM_DESC IS NULL";
        } else if (this.getEstnNumDesc() != null) {
            conditions += " AND ESTN_NUM_DESC = ?";
            values.add(this.getEstnNumDesc());
        }

        if (this.getEstnImpDesc() != null && this.getEstnImpDesc().longValue() == -999) {
            conditions += " AND ESTN_IMP_DESC IS NULL";
        } else if (this.getEstnImpDesc() != null) {
            conditions += " AND ESTN_IMP_DESC = ?";
            values.add(this.getEstnImpDesc());
        }

        if (this.getEstnAnoAltaReg() != null && this.getEstnAnoAltaReg().longValue() == -999) {
            conditions += " AND ESTN_ANO_ALTA_REG IS NULL";
        } else if (this.getEstnAnoAltaReg() != null) {
            conditions += " AND ESTN_ANO_ALTA_REG = ?";
            values.add(this.getEstnAnoAltaReg());
        }

        if (this.getEstnMesAltaReg() != null && this.getEstnMesAltaReg().longValue() == -999) {
            conditions += " AND ESTN_MES_ALTA_REG IS NULL";
        } else if (this.getEstnMesAltaReg() != null) {
            conditions += " AND ESTN_MES_ALTA_REG = ?";
            values.add(this.getEstnMesAltaReg());
        }

        if (this.getEstnDiaAltaReg() != null && this.getEstnDiaAltaReg().longValue() == -999) {
            conditions += " AND ESTN_DIA_ALTA_REG IS NULL";
        } else if (this.getEstnDiaAltaReg() != null) {
            conditions += " AND ESTN_DIA_ALTA_REG = ?";
            values.add(this.getEstnDiaAltaReg());
        }

        if (this.getEstnAnoUltMod() != null && this.getEstnAnoUltMod().longValue() == -999) {
            conditions += " AND ESTN_ANO_ULT_MOD IS NULL";
        } else if (this.getEstnAnoUltMod() != null) {
            conditions += " AND ESTN_ANO_ULT_MOD = ?";
            values.add(this.getEstnAnoUltMod());
        }

        if (this.getEstnMesUltMod() != null && this.getEstnMesUltMod().longValue() == -999) {
            conditions += " AND ESTN_MES_ULT_MOD IS NULL";
        } else if (this.getEstnMesUltMod() != null) {
            conditions += " AND ESTN_MES_ULT_MOD = ?";
            values.add(this.getEstnMesUltMod());
        }

        if (this.getEstnDiaUltMod() != null && this.getEstnDiaUltMod().longValue() == -999) {
            conditions += " AND ESTN_DIA_ULT_MOD IS NULL";
        } else if (this.getEstnDiaUltMod() != null) {
            conditions += " AND ESTN_DIA_ULT_MOD = ?";
            values.add(this.getEstnDiaUltMod());
        }

        if (this.getEstnCveStNivel() != null && "null".equals(this.getEstnCveStNivel())) {
            conditions += " AND ESTN_CVE_ST_NIVEL IS NULL";
        } else if (this.getEstnCveStNivel() != null) {
            conditions += " AND ESTN_CVE_ST_NIVEL = ?";
            values.add(this.getEstnCveStNivel());
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
        String sql = "UPDATE E_NEGS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESTN_NUM_NIVEL1 = ?";
        pkValues.add(this.getEstnNumNivel1());
        conditions += " AND ESTN_NUM_NIVEL2 = ?";
        pkValues.add(this.getEstnNumNivel2());
        conditions += " AND ESTN_NUM_NIVEL3 = ?";
        pkValues.add(this.getEstnNumNivel3());
        conditions += " AND ESTN_NUM_NIVEL4 = ?";
        pkValues.add(this.getEstnNumNivel4());
        conditions += " AND ESTN_NUM_NIVEL5 = ?";
        pkValues.add(this.getEstnNumNivel5());
        conditions += " AND ESTN_NUM_ANO = ?";
        pkValues.add(this.getEstnNumAno());
        conditions += " AND ESTN_NUM_MES = ?";
        pkValues.add(this.getEstnNumMes());
        conditions += " AND ESTN_CVE_TIPO_NEG = ?";
        pkValues.add(this.getEstnCveTipoNeg());
        conditions += " AND ESTN_CVE_CLS_PROD = ?";
        pkValues.add(this.getEstnCveClsProd());
        fields += " ESTN_NUM_INV_INI = ?, ";
        values.add(this.getEstnNumInvIni());
        fields += " ESTN_IMP_INV_INI = ?, ";
        values.add(this.getEstnImpInvIni());
        fields += " ESTN_NUM_CONST = ?, ";
        values.add(this.getEstnNumConst());
        fields += " ESTN_IMP_CONST = ?, ";
        values.add(this.getEstnImpConst());
        fields += " ESTN_NUM_EXTI = ?, ";
        values.add(this.getEstnNumExti());
        fields += " ESTN_IMP_EXTI = ?, ";
        values.add(this.getEstnImpExti());
        fields += " ESTN_NUM_DESC = ?, ";
        values.add(this.getEstnNumDesc());
        fields += " ESTN_IMP_DESC = ?, ";
        values.add(this.getEstnImpDesc());
        fields += " ESTN_ANO_ALTA_REG = ?, ";
        values.add(this.getEstnAnoAltaReg());
        fields += " ESTN_MES_ALTA_REG = ?, ";
        values.add(this.getEstnMesAltaReg());
        fields += " ESTN_DIA_ALTA_REG = ?, ";
        values.add(this.getEstnDiaAltaReg());
        fields += " ESTN_ANO_ULT_MOD = ?, ";
        values.add(this.getEstnAnoUltMod());
        fields += " ESTN_MES_ULT_MOD = ?, ";
        values.add(this.getEstnMesUltMod());
        fields += " ESTN_DIA_ULT_MOD = ?, ";
        values.add(this.getEstnDiaUltMod());
        fields += " ESTN_CVE_ST_NIVEL = ?, ";
        values.add(this.getEstnCveStNivel());
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
        String sql = "INSERT INTO E_NEGS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESTN_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getEstnNumNivel1());

        fields += ", ESTN_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getEstnNumNivel2());

        fields += ", ESTN_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getEstnNumNivel3());

        fields += ", ESTN_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getEstnNumNivel4());

        fields += ", ESTN_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getEstnNumNivel5());

        fields += ", ESTN_NUM_ANO";
        fieldValues += ", ?";
        values.add(this.getEstnNumAno());

        fields += ", ESTN_NUM_MES";
        fieldValues += ", ?";
        values.add(this.getEstnNumMes());

        fields += ", ESTN_CVE_TIPO_NEG";
        fieldValues += ", ?";
        values.add(this.getEstnCveTipoNeg());

        fields += ", ESTN_CVE_CLS_PROD";
        fieldValues += ", ?";
        values.add(this.getEstnCveClsProd());

        fields += ", ESTN_NUM_INV_INI";
        fieldValues += ", ?";
        values.add(this.getEstnNumInvIni());

        fields += ", ESTN_IMP_INV_INI";
        fieldValues += ", ?";
        values.add(this.getEstnImpInvIni());

        fields += ", ESTN_NUM_CONST";
        fieldValues += ", ?";
        values.add(this.getEstnNumConst());

        fields += ", ESTN_IMP_CONST";
        fieldValues += ", ?";
        values.add(this.getEstnImpConst());

        fields += ", ESTN_NUM_EXTI";
        fieldValues += ", ?";
        values.add(this.getEstnNumExti());

        fields += ", ESTN_IMP_EXTI";
        fieldValues += ", ?";
        values.add(this.getEstnImpExti());

        fields += ", ESTN_NUM_DESC";
        fieldValues += ", ?";
        values.add(this.getEstnNumDesc());

        fields += ", ESTN_IMP_DESC";
        fieldValues += ", ?";
        values.add(this.getEstnImpDesc());

        fields += ", ESTN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstnAnoAltaReg());

        fields += ", ESTN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstnMesAltaReg());

        fields += ", ESTN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstnDiaAltaReg());

        fields += ", ESTN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstnAnoUltMod());

        fields += ", ESTN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstnMesUltMod());

        fields += ", ESTN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstnDiaUltMod());

        fields += ", ESTN_CVE_ST_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEstnCveStNivel());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM E_NEGS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESTN_NUM_NIVEL1 = ?";
        values.add(this.getEstnNumNivel1());
        conditions += " AND ESTN_NUM_NIVEL2 = ?";
        values.add(this.getEstnNumNivel2());
        conditions += " AND ESTN_NUM_NIVEL3 = ?";
        values.add(this.getEstnNumNivel3());
        conditions += " AND ESTN_NUM_NIVEL4 = ?";
        values.add(this.getEstnNumNivel4());
        conditions += " AND ESTN_NUM_NIVEL5 = ?";
        values.add(this.getEstnNumNivel5());
        conditions += " AND ESTN_NUM_ANO = ?";
        values.add(this.getEstnNumAno());
        conditions += " AND ESTN_NUM_MES = ?";
        values.add(this.getEstnNumMes());
        conditions += " AND ESTN_CVE_TIPO_NEG = ?";
        values.add(this.getEstnCveTipoNeg());
        conditions += " AND ESTN_CVE_CLS_PROD = ?";
        values.add(this.getEstnCveClsProd());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ENegs instance = (ENegs) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEstnNumNivel1().equals(instance.getEstnNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getEstnNumNivel2().equals(instance.getEstnNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getEstnNumNivel3().equals(instance.getEstnNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getEstnNumNivel4().equals(instance.getEstnNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getEstnNumNivel5().equals(instance.getEstnNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getEstnNumAno().equals(instance.getEstnNumAno()))
            equalObjects = false;
        if (equalObjects && !this.getEstnNumMes().equals(instance.getEstnNumMes()))
            equalObjects = false;
        if (equalObjects && !this.getEstnCveTipoNeg().equals(instance.getEstnCveTipoNeg()))
            equalObjects = false;
        if (equalObjects && !this.getEstnCveClsProd().equals(instance.getEstnCveClsProd()))
            equalObjects = false;
        if (equalObjects && !this.getEstnNumInvIni().equals(instance.getEstnNumInvIni()))
            equalObjects = false;
        if (equalObjects && !this.getEstnImpInvIni().equals(instance.getEstnImpInvIni()))
            equalObjects = false;
        if (equalObjects && !this.getEstnNumConst().equals(instance.getEstnNumConst()))
            equalObjects = false;
        if (equalObjects && !this.getEstnImpConst().equals(instance.getEstnImpConst()))
            equalObjects = false;
        if (equalObjects && !this.getEstnNumExti().equals(instance.getEstnNumExti()))
            equalObjects = false;
        if (equalObjects && !this.getEstnImpExti().equals(instance.getEstnImpExti()))
            equalObjects = false;
        if (equalObjects && !this.getEstnNumDesc().equals(instance.getEstnNumDesc()))
            equalObjects = false;
        if (equalObjects && !this.getEstnImpDesc().equals(instance.getEstnImpDesc()))
            equalObjects = false;
        if (equalObjects && !this.getEstnAnoAltaReg().equals(instance.getEstnAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstnMesAltaReg().equals(instance.getEstnMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstnDiaAltaReg().equals(instance.getEstnDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstnAnoUltMod().equals(instance.getEstnAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstnMesUltMod().equals(instance.getEstnMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstnDiaUltMod().equals(instance.getEstnDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstnCveStNivel().equals(instance.getEstnCveStNivel()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ENegs result = new ENegs();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEstnNumNivel1((BigDecimal) objectData.getData("ESTN_NUM_NIVEL1"));
        result.setEstnNumNivel2((BigDecimal) objectData.getData("ESTN_NUM_NIVEL2"));
        result.setEstnNumNivel3((BigDecimal) objectData.getData("ESTN_NUM_NIVEL3"));
        result.setEstnNumNivel4((BigDecimal) objectData.getData("ESTN_NUM_NIVEL4"));
        result.setEstnNumNivel5((BigDecimal) objectData.getData("ESTN_NUM_NIVEL5"));
        result.setEstnNumAno((BigDecimal) objectData.getData("ESTN_NUM_ANO"));
        result.setEstnNumMes((String) objectData.getData("ESTN_NUM_MES"));
        result.setEstnCveTipoNeg((String) objectData.getData("ESTN_CVE_TIPO_NEG"));
        result.setEstnCveClsProd((String) objectData.getData("ESTN_CVE_CLS_PROD"));
        result.setEstnNumInvIni((BigDecimal) objectData.getData("ESTN_NUM_INV_INI"));
        result.setEstnImpInvIni((BigDecimal) objectData.getData("ESTN_IMP_INV_INI"));
        result.setEstnNumConst((BigDecimal) objectData.getData("ESTN_NUM_CONST"));
        result.setEstnImpConst((BigDecimal) objectData.getData("ESTN_IMP_CONST"));
        result.setEstnNumExti((BigDecimal) objectData.getData("ESTN_NUM_EXTI"));
        result.setEstnImpExti((BigDecimal) objectData.getData("ESTN_IMP_EXTI"));
        result.setEstnNumDesc((BigDecimal) objectData.getData("ESTN_NUM_DESC"));
        result.setEstnImpDesc((BigDecimal) objectData.getData("ESTN_IMP_DESC"));
        result.setEstnAnoAltaReg((BigDecimal) objectData.getData("ESTN_ANO_ALTA_REG"));
        result.setEstnMesAltaReg((BigDecimal) objectData.getData("ESTN_MES_ALTA_REG"));
        result.setEstnDiaAltaReg((BigDecimal) objectData.getData("ESTN_DIA_ALTA_REG"));
        result.setEstnAnoUltMod((BigDecimal) objectData.getData("ESTN_ANO_ULT_MOD"));
        result.setEstnMesUltMod((BigDecimal) objectData.getData("ESTN_MES_ULT_MOD"));
        result.setEstnDiaUltMod((BigDecimal) objectData.getData("ESTN_DIA_ULT_MOD"));
        result.setEstnCveStNivel((String) objectData.getData("ESTN_CVE_ST_NIVEL"));

        return result;

    }

}
