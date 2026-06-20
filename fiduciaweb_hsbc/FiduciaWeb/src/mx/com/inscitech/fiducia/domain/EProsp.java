package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "E_PROSP_PK",
            columns =
            { "ESTP_NUM_ANO", "ESTP_NUM_MES", "ESTP_CVE_TIPO_NEG", "ESTP_CVE_CLS_PROD", "ESTP_NUM_NIVEL1", "ESTP_NUM_NIVEL2", "ESTP_NUM_NIVEL3", "ESTP_NUM_NIVEL4",
              "ESTP_NUM_NIVEL5"
    }, sequences = { "MANUAL" })
public class EProsp extends DomainObject {

    BigDecimal estpNumNivel1 = null;
    BigDecimal estpNumNivel2 = null;
    BigDecimal estpNumNivel3 = null;
    BigDecimal estpNumNivel4 = null;
    BigDecimal estpNumNivel5 = null;
    BigDecimal estpNumAno = null;
    String estpNumMes = null;
    String estpCveTipoNeg = null;
    String estpCveClsProd = null;
    BigDecimal estpNumProOri = null;
    BigDecimal estpImpProOri = null;
    BigDecimal estpNumNewPro = null;
    BigDecimal estpImpNewPro = null;
    BigDecimal estpNumNegFor = null;
    BigDecimal estpImpNegFor = null;
    BigDecimal estpNumNegRec = null;
    BigDecimal estpImpNegRec = null;
    BigDecimal estpAnoAltaReg = null;
    BigDecimal estpMesAltaReg = null;
    BigDecimal estpDiaAltaReg = null;
    BigDecimal estpAnoUltMod = null;
    BigDecimal estpMesUltMod = null;
    BigDecimal estpDiaUltMod = null;
    String estpCveStNivel = null;

    public EProsp() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstpNumNivel1(BigDecimal estpNumNivel1) {
        this.estpNumNivel1 = estpNumNivel1;
    }

    public BigDecimal getEstpNumNivel1() {
        return this.estpNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstpNumNivel2(BigDecimal estpNumNivel2) {
        this.estpNumNivel2 = estpNumNivel2;
    }

    public BigDecimal getEstpNumNivel2() {
        return this.estpNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstpNumNivel3(BigDecimal estpNumNivel3) {
        this.estpNumNivel3 = estpNumNivel3;
    }

    public BigDecimal getEstpNumNivel3() {
        return this.estpNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstpNumNivel4(BigDecimal estpNumNivel4) {
        this.estpNumNivel4 = estpNumNivel4;
    }

    public BigDecimal getEstpNumNivel4() {
        return this.estpNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstpNumNivel5(BigDecimal estpNumNivel5) {
        this.estpNumNivel5 = estpNumNivel5;
    }

    public BigDecimal getEstpNumNivel5() {
        return this.estpNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstpNumAno(BigDecimal estpNumAno) {
        this.estpNumAno = estpNumAno;
    }

    public BigDecimal getEstpNumAno() {
        return this.estpNumAno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstpNumMes(String estpNumMes) {
        this.estpNumMes = estpNumMes;
    }

    public String getEstpNumMes() {
        return this.estpNumMes;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstpCveTipoNeg(String estpCveTipoNeg) {
        this.estpCveTipoNeg = estpCveTipoNeg;
    }

    public String getEstpCveTipoNeg() {
        return this.estpCveTipoNeg;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstpCveClsProd(String estpCveClsProd) {
        this.estpCveClsProd = estpCveClsProd;
    }

    public String getEstpCveClsProd() {
        return this.estpCveClsProd;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstpNumProOri(BigDecimal estpNumProOri) {
        this.estpNumProOri = estpNumProOri;
    }

    public BigDecimal getEstpNumProOri() {
        return this.estpNumProOri;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstpImpProOri(BigDecimal estpImpProOri) {
        this.estpImpProOri = estpImpProOri;
    }

    public BigDecimal getEstpImpProOri() {
        return this.estpImpProOri;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstpNumNewPro(BigDecimal estpNumNewPro) {
        this.estpNumNewPro = estpNumNewPro;
    }

    public BigDecimal getEstpNumNewPro() {
        return this.estpNumNewPro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstpImpNewPro(BigDecimal estpImpNewPro) {
        this.estpImpNewPro = estpImpNewPro;
    }

    public BigDecimal getEstpImpNewPro() {
        return this.estpImpNewPro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstpNumNegFor(BigDecimal estpNumNegFor) {
        this.estpNumNegFor = estpNumNegFor;
    }

    public BigDecimal getEstpNumNegFor() {
        return this.estpNumNegFor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstpImpNegFor(BigDecimal estpImpNegFor) {
        this.estpImpNegFor = estpImpNegFor;
    }

    public BigDecimal getEstpImpNegFor() {
        return this.estpImpNegFor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstpNumNegRec(BigDecimal estpNumNegRec) {
        this.estpNumNegRec = estpNumNegRec;
    }

    public BigDecimal getEstpNumNegRec() {
        return this.estpNumNegRec;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstpImpNegRec(BigDecimal estpImpNegRec) {
        this.estpImpNegRec = estpImpNegRec;
    }

    public BigDecimal getEstpImpNegRec() {
        return this.estpImpNegRec;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstpAnoAltaReg(BigDecimal estpAnoAltaReg) {
        this.estpAnoAltaReg = estpAnoAltaReg;
    }

    public BigDecimal getEstpAnoAltaReg() {
        return this.estpAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstpMesAltaReg(BigDecimal estpMesAltaReg) {
        this.estpMesAltaReg = estpMesAltaReg;
    }

    public BigDecimal getEstpMesAltaReg() {
        return this.estpMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstpDiaAltaReg(BigDecimal estpDiaAltaReg) {
        this.estpDiaAltaReg = estpDiaAltaReg;
    }

    public BigDecimal getEstpDiaAltaReg() {
        return this.estpDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstpAnoUltMod(BigDecimal estpAnoUltMod) {
        this.estpAnoUltMod = estpAnoUltMod;
    }

    public BigDecimal getEstpAnoUltMod() {
        return this.estpAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstpMesUltMod(BigDecimal estpMesUltMod) {
        this.estpMesUltMod = estpMesUltMod;
    }

    public BigDecimal getEstpMesUltMod() {
        return this.estpMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstpDiaUltMod(BigDecimal estpDiaUltMod) {
        this.estpDiaUltMod = estpDiaUltMod;
    }

    public BigDecimal getEstpDiaUltMod() {
        return this.estpDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstpCveStNivel(String estpCveStNivel) {
        this.estpCveStNivel = estpCveStNivel;
    }

    public String getEstpCveStNivel() {
        return this.estpCveStNivel;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM E_PROSP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstpNumNivel1() != null && this.getEstpNumNivel1().longValue() == -999) {
            conditions += " AND ESTP_NUM_NIVEL1 IS NULL";
        } else if (this.getEstpNumNivel1() != null) {
            conditions += " AND ESTP_NUM_NIVEL1 = ?";
            values.add(this.getEstpNumNivel1());
        }

        if (this.getEstpNumNivel2() != null && this.getEstpNumNivel2().longValue() == -999) {
            conditions += " AND ESTP_NUM_NIVEL2 IS NULL";
        } else if (this.getEstpNumNivel2() != null) {
            conditions += " AND ESTP_NUM_NIVEL2 = ?";
            values.add(this.getEstpNumNivel2());
        }

        if (this.getEstpNumNivel3() != null && this.getEstpNumNivel3().longValue() == -999) {
            conditions += " AND ESTP_NUM_NIVEL3 IS NULL";
        } else if (this.getEstpNumNivel3() != null) {
            conditions += " AND ESTP_NUM_NIVEL3 = ?";
            values.add(this.getEstpNumNivel3());
        }

        if (this.getEstpNumNivel4() != null && this.getEstpNumNivel4().longValue() == -999) {
            conditions += " AND ESTP_NUM_NIVEL4 IS NULL";
        } else if (this.getEstpNumNivel4() != null) {
            conditions += " AND ESTP_NUM_NIVEL4 = ?";
            values.add(this.getEstpNumNivel4());
        }

        if (this.getEstpNumNivel5() != null && this.getEstpNumNivel5().longValue() == -999) {
            conditions += " AND ESTP_NUM_NIVEL5 IS NULL";
        } else if (this.getEstpNumNivel5() != null) {
            conditions += " AND ESTP_NUM_NIVEL5 = ?";
            values.add(this.getEstpNumNivel5());
        }

        if (this.getEstpNumAno() != null && this.getEstpNumAno().longValue() == -999) {
            conditions += " AND ESTP_NUM_ANO IS NULL";
        } else if (this.getEstpNumAno() != null) {
            conditions += " AND ESTP_NUM_ANO = ?";
            values.add(this.getEstpNumAno());
        }

        if (this.getEstpNumMes() != null && "null".equals(this.getEstpNumMes())) {
            conditions += " AND ESTP_NUM_MES IS NULL";
        } else if (this.getEstpNumMes() != null) {
            conditions += " AND ESTP_NUM_MES = ?";
            values.add(this.getEstpNumMes());
        }

        if (this.getEstpCveTipoNeg() != null && "null".equals(this.getEstpCveTipoNeg())) {
            conditions += " AND ESTP_CVE_TIPO_NEG IS NULL";
        } else if (this.getEstpCveTipoNeg() != null) {
            conditions += " AND ESTP_CVE_TIPO_NEG = ?";
            values.add(this.getEstpCveTipoNeg());
        }

        if (this.getEstpCveClsProd() != null && "null".equals(this.getEstpCveClsProd())) {
            conditions += " AND ESTP_CVE_CLS_PROD IS NULL";
        } else if (this.getEstpCveClsProd() != null) {
            conditions += " AND ESTP_CVE_CLS_PROD = ?";
            values.add(this.getEstpCveClsProd());
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
        String sql = "SELECT * FROM E_PROSP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstpNumNivel1() != null && this.getEstpNumNivel1().longValue() == -999) {
            conditions += " AND ESTP_NUM_NIVEL1 IS NULL";
        } else if (this.getEstpNumNivel1() != null) {
            conditions += " AND ESTP_NUM_NIVEL1 = ?";
            values.add(this.getEstpNumNivel1());
        }

        if (this.getEstpNumNivel2() != null && this.getEstpNumNivel2().longValue() == -999) {
            conditions += " AND ESTP_NUM_NIVEL2 IS NULL";
        } else if (this.getEstpNumNivel2() != null) {
            conditions += " AND ESTP_NUM_NIVEL2 = ?";
            values.add(this.getEstpNumNivel2());
        }

        if (this.getEstpNumNivel3() != null && this.getEstpNumNivel3().longValue() == -999) {
            conditions += " AND ESTP_NUM_NIVEL3 IS NULL";
        } else if (this.getEstpNumNivel3() != null) {
            conditions += " AND ESTP_NUM_NIVEL3 = ?";
            values.add(this.getEstpNumNivel3());
        }

        if (this.getEstpNumNivel4() != null && this.getEstpNumNivel4().longValue() == -999) {
            conditions += " AND ESTP_NUM_NIVEL4 IS NULL";
        } else if (this.getEstpNumNivel4() != null) {
            conditions += " AND ESTP_NUM_NIVEL4 = ?";
            values.add(this.getEstpNumNivel4());
        }

        if (this.getEstpNumNivel5() != null && this.getEstpNumNivel5().longValue() == -999) {
            conditions += " AND ESTP_NUM_NIVEL5 IS NULL";
        } else if (this.getEstpNumNivel5() != null) {
            conditions += " AND ESTP_NUM_NIVEL5 = ?";
            values.add(this.getEstpNumNivel5());
        }

        if (this.getEstpNumAno() != null && this.getEstpNumAno().longValue() == -999) {
            conditions += " AND ESTP_NUM_ANO IS NULL";
        } else if (this.getEstpNumAno() != null) {
            conditions += " AND ESTP_NUM_ANO = ?";
            values.add(this.getEstpNumAno());
        }

        if (this.getEstpNumMes() != null && "null".equals(this.getEstpNumMes())) {
            conditions += " AND ESTP_NUM_MES IS NULL";
        } else if (this.getEstpNumMes() != null) {
            conditions += " AND ESTP_NUM_MES = ?";
            values.add(this.getEstpNumMes());
        }

        if (this.getEstpCveTipoNeg() != null && "null".equals(this.getEstpCveTipoNeg())) {
            conditions += " AND ESTP_CVE_TIPO_NEG IS NULL";
        } else if (this.getEstpCveTipoNeg() != null) {
            conditions += " AND ESTP_CVE_TIPO_NEG = ?";
            values.add(this.getEstpCveTipoNeg());
        }

        if (this.getEstpCveClsProd() != null && "null".equals(this.getEstpCveClsProd())) {
            conditions += " AND ESTP_CVE_CLS_PROD IS NULL";
        } else if (this.getEstpCveClsProd() != null) {
            conditions += " AND ESTP_CVE_CLS_PROD = ?";
            values.add(this.getEstpCveClsProd());
        }

        if (this.getEstpNumProOri() != null && this.getEstpNumProOri().longValue() == -999) {
            conditions += " AND ESTP_NUM_PRO_ORI IS NULL";
        } else if (this.getEstpNumProOri() != null) {
            conditions += " AND ESTP_NUM_PRO_ORI = ?";
            values.add(this.getEstpNumProOri());
        }

        if (this.getEstpImpProOri() != null && this.getEstpImpProOri().longValue() == -999) {
            conditions += " AND ESTP_IMP_PRO_ORI IS NULL";
        } else if (this.getEstpImpProOri() != null) {
            conditions += " AND ESTP_IMP_PRO_ORI = ?";
            values.add(this.getEstpImpProOri());
        }

        if (this.getEstpNumNewPro() != null && this.getEstpNumNewPro().longValue() == -999) {
            conditions += " AND ESTP_NUM_NEW_PRO IS NULL";
        } else if (this.getEstpNumNewPro() != null) {
            conditions += " AND ESTP_NUM_NEW_PRO = ?";
            values.add(this.getEstpNumNewPro());
        }

        if (this.getEstpImpNewPro() != null && this.getEstpImpNewPro().longValue() == -999) {
            conditions += " AND ESTP_IMP_NEW_PRO IS NULL";
        } else if (this.getEstpImpNewPro() != null) {
            conditions += " AND ESTP_IMP_NEW_PRO = ?";
            values.add(this.getEstpImpNewPro());
        }

        if (this.getEstpNumNegFor() != null && this.getEstpNumNegFor().longValue() == -999) {
            conditions += " AND ESTP_NUM_NEG_FOR IS NULL";
        } else if (this.getEstpNumNegFor() != null) {
            conditions += " AND ESTP_NUM_NEG_FOR = ?";
            values.add(this.getEstpNumNegFor());
        }

        if (this.getEstpImpNegFor() != null && this.getEstpImpNegFor().longValue() == -999) {
            conditions += " AND ESTP_IMP_NEG_FOR IS NULL";
        } else if (this.getEstpImpNegFor() != null) {
            conditions += " AND ESTP_IMP_NEG_FOR = ?";
            values.add(this.getEstpImpNegFor());
        }

        if (this.getEstpNumNegRec() != null && this.getEstpNumNegRec().longValue() == -999) {
            conditions += " AND ESTP_NUM_NEG_REC IS NULL";
        } else if (this.getEstpNumNegRec() != null) {
            conditions += " AND ESTP_NUM_NEG_REC = ?";
            values.add(this.getEstpNumNegRec());
        }

        if (this.getEstpImpNegRec() != null && this.getEstpImpNegRec().longValue() == -999) {
            conditions += " AND ESTP_IMP_NEG_REC IS NULL";
        } else if (this.getEstpImpNegRec() != null) {
            conditions += " AND ESTP_IMP_NEG_REC = ?";
            values.add(this.getEstpImpNegRec());
        }

        if (this.getEstpAnoAltaReg() != null && this.getEstpAnoAltaReg().longValue() == -999) {
            conditions += " AND ESTP_ANO_ALTA_REG IS NULL";
        } else if (this.getEstpAnoAltaReg() != null) {
            conditions += " AND ESTP_ANO_ALTA_REG = ?";
            values.add(this.getEstpAnoAltaReg());
        }

        if (this.getEstpMesAltaReg() != null && this.getEstpMesAltaReg().longValue() == -999) {
            conditions += " AND ESTP_MES_ALTA_REG IS NULL";
        } else if (this.getEstpMesAltaReg() != null) {
            conditions += " AND ESTP_MES_ALTA_REG = ?";
            values.add(this.getEstpMesAltaReg());
        }

        if (this.getEstpDiaAltaReg() != null && this.getEstpDiaAltaReg().longValue() == -999) {
            conditions += " AND ESTP_DIA_ALTA_REG IS NULL";
        } else if (this.getEstpDiaAltaReg() != null) {
            conditions += " AND ESTP_DIA_ALTA_REG = ?";
            values.add(this.getEstpDiaAltaReg());
        }

        if (this.getEstpAnoUltMod() != null && this.getEstpAnoUltMod().longValue() == -999) {
            conditions += " AND ESTP_ANO_ULT_MOD IS NULL";
        } else if (this.getEstpAnoUltMod() != null) {
            conditions += " AND ESTP_ANO_ULT_MOD = ?";
            values.add(this.getEstpAnoUltMod());
        }

        if (this.getEstpMesUltMod() != null && this.getEstpMesUltMod().longValue() == -999) {
            conditions += " AND ESTP_MES_ULT_MOD IS NULL";
        } else if (this.getEstpMesUltMod() != null) {
            conditions += " AND ESTP_MES_ULT_MOD = ?";
            values.add(this.getEstpMesUltMod());
        }

        if (this.getEstpDiaUltMod() != null && this.getEstpDiaUltMod().longValue() == -999) {
            conditions += " AND ESTP_DIA_ULT_MOD IS NULL";
        } else if (this.getEstpDiaUltMod() != null) {
            conditions += " AND ESTP_DIA_ULT_MOD = ?";
            values.add(this.getEstpDiaUltMod());
        }

        if (this.getEstpCveStNivel() != null && "null".equals(this.getEstpCveStNivel())) {
            conditions += " AND ESTP_CVE_ST_NIVEL IS NULL";
        } else if (this.getEstpCveStNivel() != null) {
            conditions += " AND ESTP_CVE_ST_NIVEL = ?";
            values.add(this.getEstpCveStNivel());
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
        String sql = "UPDATE E_PROSP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESTP_NUM_NIVEL1 = ?";
        pkValues.add(this.getEstpNumNivel1());
        conditions += " AND ESTP_NUM_NIVEL2 = ?";
        pkValues.add(this.getEstpNumNivel2());
        conditions += " AND ESTP_NUM_NIVEL3 = ?";
        pkValues.add(this.getEstpNumNivel3());
        conditions += " AND ESTP_NUM_NIVEL4 = ?";
        pkValues.add(this.getEstpNumNivel4());
        conditions += " AND ESTP_NUM_NIVEL5 = ?";
        pkValues.add(this.getEstpNumNivel5());
        conditions += " AND ESTP_NUM_ANO = ?";
        pkValues.add(this.getEstpNumAno());
        conditions += " AND ESTP_NUM_MES = ?";
        pkValues.add(this.getEstpNumMes());
        conditions += " AND ESTP_CVE_TIPO_NEG = ?";
        pkValues.add(this.getEstpCveTipoNeg());
        conditions += " AND ESTP_CVE_CLS_PROD = ?";
        pkValues.add(this.getEstpCveClsProd());
        fields += " ESTP_NUM_PRO_ORI = ?, ";
        values.add(this.getEstpNumProOri());
        fields += " ESTP_IMP_PRO_ORI = ?, ";
        values.add(this.getEstpImpProOri());
        fields += " ESTP_NUM_NEW_PRO = ?, ";
        values.add(this.getEstpNumNewPro());
        fields += " ESTP_IMP_NEW_PRO = ?, ";
        values.add(this.getEstpImpNewPro());
        fields += " ESTP_NUM_NEG_FOR = ?, ";
        values.add(this.getEstpNumNegFor());
        fields += " ESTP_IMP_NEG_FOR = ?, ";
        values.add(this.getEstpImpNegFor());
        fields += " ESTP_NUM_NEG_REC = ?, ";
        values.add(this.getEstpNumNegRec());
        fields += " ESTP_IMP_NEG_REC = ?, ";
        values.add(this.getEstpImpNegRec());
        fields += " ESTP_ANO_ALTA_REG = ?, ";
        values.add(this.getEstpAnoAltaReg());
        fields += " ESTP_MES_ALTA_REG = ?, ";
        values.add(this.getEstpMesAltaReg());
        fields += " ESTP_DIA_ALTA_REG = ?, ";
        values.add(this.getEstpDiaAltaReg());
        fields += " ESTP_ANO_ULT_MOD = ?, ";
        values.add(this.getEstpAnoUltMod());
        fields += " ESTP_MES_ULT_MOD = ?, ";
        values.add(this.getEstpMesUltMod());
        fields += " ESTP_DIA_ULT_MOD = ?, ";
        values.add(this.getEstpDiaUltMod());
        fields += " ESTP_CVE_ST_NIVEL = ?, ";
        values.add(this.getEstpCveStNivel());
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
        String sql = "INSERT INTO E_PROSP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESTP_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getEstpNumNivel1());

        fields += ", ESTP_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getEstpNumNivel2());

        fields += ", ESTP_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getEstpNumNivel3());

        fields += ", ESTP_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getEstpNumNivel4());

        fields += ", ESTP_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getEstpNumNivel5());

        fields += ", ESTP_NUM_ANO";
        fieldValues += ", ?";
        values.add(this.getEstpNumAno());

        fields += ", ESTP_NUM_MES";
        fieldValues += ", ?";
        values.add(this.getEstpNumMes());

        fields += ", ESTP_CVE_TIPO_NEG";
        fieldValues += ", ?";
        values.add(this.getEstpCveTipoNeg());

        fields += ", ESTP_CVE_CLS_PROD";
        fieldValues += ", ?";
        values.add(this.getEstpCveClsProd());

        fields += ", ESTP_NUM_PRO_ORI";
        fieldValues += ", ?";
        values.add(this.getEstpNumProOri());

        fields += ", ESTP_IMP_PRO_ORI";
        fieldValues += ", ?";
        values.add(this.getEstpImpProOri());

        fields += ", ESTP_NUM_NEW_PRO";
        fieldValues += ", ?";
        values.add(this.getEstpNumNewPro());

        fields += ", ESTP_IMP_NEW_PRO";
        fieldValues += ", ?";
        values.add(this.getEstpImpNewPro());

        fields += ", ESTP_NUM_NEG_FOR";
        fieldValues += ", ?";
        values.add(this.getEstpNumNegFor());

        fields += ", ESTP_IMP_NEG_FOR";
        fieldValues += ", ?";
        values.add(this.getEstpImpNegFor());

        fields += ", ESTP_NUM_NEG_REC";
        fieldValues += ", ?";
        values.add(this.getEstpNumNegRec());

        fields += ", ESTP_IMP_NEG_REC";
        fieldValues += ", ?";
        values.add(this.getEstpImpNegRec());

        fields += ", ESTP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstpAnoAltaReg());

        fields += ", ESTP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstpMesAltaReg());

        fields += ", ESTP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstpDiaAltaReg());

        fields += ", ESTP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstpAnoUltMod());

        fields += ", ESTP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstpMesUltMod());

        fields += ", ESTP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstpDiaUltMod());

        fields += ", ESTP_CVE_ST_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEstpCveStNivel());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM E_PROSP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESTP_NUM_NIVEL1 = ?";
        values.add(this.getEstpNumNivel1());
        conditions += " AND ESTP_NUM_NIVEL2 = ?";
        values.add(this.getEstpNumNivel2());
        conditions += " AND ESTP_NUM_NIVEL3 = ?";
        values.add(this.getEstpNumNivel3());
        conditions += " AND ESTP_NUM_NIVEL4 = ?";
        values.add(this.getEstpNumNivel4());
        conditions += " AND ESTP_NUM_NIVEL5 = ?";
        values.add(this.getEstpNumNivel5());
        conditions += " AND ESTP_NUM_ANO = ?";
        values.add(this.getEstpNumAno());
        conditions += " AND ESTP_NUM_MES = ?";
        values.add(this.getEstpNumMes());
        conditions += " AND ESTP_CVE_TIPO_NEG = ?";
        values.add(this.getEstpCveTipoNeg());
        conditions += " AND ESTP_CVE_CLS_PROD = ?";
        values.add(this.getEstpCveClsProd());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        EProsp instance = (EProsp) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEstpNumNivel1().equals(instance.getEstpNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getEstpNumNivel2().equals(instance.getEstpNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getEstpNumNivel3().equals(instance.getEstpNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getEstpNumNivel4().equals(instance.getEstpNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getEstpNumNivel5().equals(instance.getEstpNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getEstpNumAno().equals(instance.getEstpNumAno()))
            equalObjects = false;
        if (equalObjects && !this.getEstpNumMes().equals(instance.getEstpNumMes()))
            equalObjects = false;
        if (equalObjects && !this.getEstpCveTipoNeg().equals(instance.getEstpCveTipoNeg()))
            equalObjects = false;
        if (equalObjects && !this.getEstpCveClsProd().equals(instance.getEstpCveClsProd()))
            equalObjects = false;
        if (equalObjects && !this.getEstpNumProOri().equals(instance.getEstpNumProOri()))
            equalObjects = false;
        if (equalObjects && !this.getEstpImpProOri().equals(instance.getEstpImpProOri()))
            equalObjects = false;
        if (equalObjects && !this.getEstpNumNewPro().equals(instance.getEstpNumNewPro()))
            equalObjects = false;
        if (equalObjects && !this.getEstpImpNewPro().equals(instance.getEstpImpNewPro()))
            equalObjects = false;
        if (equalObjects && !this.getEstpNumNegFor().equals(instance.getEstpNumNegFor()))
            equalObjects = false;
        if (equalObjects && !this.getEstpImpNegFor().equals(instance.getEstpImpNegFor()))
            equalObjects = false;
        if (equalObjects && !this.getEstpNumNegRec().equals(instance.getEstpNumNegRec()))
            equalObjects = false;
        if (equalObjects && !this.getEstpImpNegRec().equals(instance.getEstpImpNegRec()))
            equalObjects = false;
        if (equalObjects && !this.getEstpAnoAltaReg().equals(instance.getEstpAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstpMesAltaReg().equals(instance.getEstpMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstpDiaAltaReg().equals(instance.getEstpDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstpAnoUltMod().equals(instance.getEstpAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstpMesUltMod().equals(instance.getEstpMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstpDiaUltMod().equals(instance.getEstpDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstpCveStNivel().equals(instance.getEstpCveStNivel()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        EProsp result = new EProsp();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEstpNumNivel1((BigDecimal) objectData.getData("ESTP_NUM_NIVEL1"));
        result.setEstpNumNivel2((BigDecimal) objectData.getData("ESTP_NUM_NIVEL2"));
        result.setEstpNumNivel3((BigDecimal) objectData.getData("ESTP_NUM_NIVEL3"));
        result.setEstpNumNivel4((BigDecimal) objectData.getData("ESTP_NUM_NIVEL4"));
        result.setEstpNumNivel5((BigDecimal) objectData.getData("ESTP_NUM_NIVEL5"));
        result.setEstpNumAno((BigDecimal) objectData.getData("ESTP_NUM_ANO"));
        result.setEstpNumMes((String) objectData.getData("ESTP_NUM_MES"));
        result.setEstpCveTipoNeg((String) objectData.getData("ESTP_CVE_TIPO_NEG"));
        result.setEstpCveClsProd((String) objectData.getData("ESTP_CVE_CLS_PROD"));
        result.setEstpNumProOri((BigDecimal) objectData.getData("ESTP_NUM_PRO_ORI"));
        result.setEstpImpProOri((BigDecimal) objectData.getData("ESTP_IMP_PRO_ORI"));
        result.setEstpNumNewPro((BigDecimal) objectData.getData("ESTP_NUM_NEW_PRO"));
        result.setEstpImpNewPro((BigDecimal) objectData.getData("ESTP_IMP_NEW_PRO"));
        result.setEstpNumNegFor((BigDecimal) objectData.getData("ESTP_NUM_NEG_FOR"));
        result.setEstpImpNegFor((BigDecimal) objectData.getData("ESTP_IMP_NEG_FOR"));
        result.setEstpNumNegRec((BigDecimal) objectData.getData("ESTP_NUM_NEG_REC"));
        result.setEstpImpNegRec((BigDecimal) objectData.getData("ESTP_IMP_NEG_REC"));
        result.setEstpAnoAltaReg((BigDecimal) objectData.getData("ESTP_ANO_ALTA_REG"));
        result.setEstpMesAltaReg((BigDecimal) objectData.getData("ESTP_MES_ALTA_REG"));
        result.setEstpDiaAltaReg((BigDecimal) objectData.getData("ESTP_DIA_ALTA_REG"));
        result.setEstpAnoUltMod((BigDecimal) objectData.getData("ESTP_ANO_ULT_MOD"));
        result.setEstpMesUltMod((BigDecimal) objectData.getData("ESTP_MES_ULT_MOD"));
        result.setEstpDiaUltMod((BigDecimal) objectData.getData("ESTP_DIA_ULT_MOD"));
        result.setEstpCveStNivel((String) objectData.getData("ESTP_CVE_ST_NIVEL"));

        return result;

    }

}
