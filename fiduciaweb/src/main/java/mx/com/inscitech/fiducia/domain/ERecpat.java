package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "E_RECPAT_PK",
            columns =
            { "ESTR_NUM_ANO", "ESTR_NUM_MES", "ESTR_CVE_TIPO_NEG", "ESTR_CVE_CLS_PROD", "ESTR_NUM_NIVEL1", "ESTR_NUM_NIVEL2", "ESTR_NUM_NIVEL3", "ESTR_NUM_NIVEL4",
              "ESTR_NUM_NIVEL5"
    }, sequences = { "MANUAL" })
public class ERecpat extends DomainObject {

    BigDecimal estrNumNivel1 = null;
    BigDecimal estrNumNivel2 = null;
    BigDecimal estrNumNivel3 = null;
    BigDecimal estrNumNivel4 = null;
    BigDecimal estrNumNivel5 = null;
    BigDecimal estrNumAno = null;
    String estrNumMes = null;
    String estrCveTipoNeg = null;
    String estrCveClsProd = null;
    BigDecimal estrNumNafin = null;
    BigDecimal estrImpNafin = null;
    BigDecimal estrNumTesofe = null;
    BigDecimal estrImpTesofe = null;
    BigDecimal estrNumCbolsa = null;
    BigDecimal estrImpCbolsa = null;
    BigDecimal estrAnoAltaReg = null;
    BigDecimal estrMesAltaReg = null;
    BigDecimal estrDiaAltaReg = null;
    BigDecimal estrAnoUltMod = null;
    BigDecimal estrMesUltMod = null;
    BigDecimal estrDiaUltMod = null;
    String estrCveStNivel = null;

    public ERecpat() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstrNumNivel1(BigDecimal estrNumNivel1) {
        this.estrNumNivel1 = estrNumNivel1;
    }

    public BigDecimal getEstrNumNivel1() {
        return this.estrNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstrNumNivel2(BigDecimal estrNumNivel2) {
        this.estrNumNivel2 = estrNumNivel2;
    }

    public BigDecimal getEstrNumNivel2() {
        return this.estrNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstrNumNivel3(BigDecimal estrNumNivel3) {
        this.estrNumNivel3 = estrNumNivel3;
    }

    public BigDecimal getEstrNumNivel3() {
        return this.estrNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstrNumNivel4(BigDecimal estrNumNivel4) {
        this.estrNumNivel4 = estrNumNivel4;
    }

    public BigDecimal getEstrNumNivel4() {
        return this.estrNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstrNumNivel5(BigDecimal estrNumNivel5) {
        this.estrNumNivel5 = estrNumNivel5;
    }

    public BigDecimal getEstrNumNivel5() {
        return this.estrNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstrNumAno(BigDecimal estrNumAno) {
        this.estrNumAno = estrNumAno;
    }

    public BigDecimal getEstrNumAno() {
        return this.estrNumAno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstrNumMes(String estrNumMes) {
        this.estrNumMes = estrNumMes;
    }

    public String getEstrNumMes() {
        return this.estrNumMes;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstrCveTipoNeg(String estrCveTipoNeg) {
        this.estrCveTipoNeg = estrCveTipoNeg;
    }

    public String getEstrCveTipoNeg() {
        return this.estrCveTipoNeg;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstrCveClsProd(String estrCveClsProd) {
        this.estrCveClsProd = estrCveClsProd;
    }

    public String getEstrCveClsProd() {
        return this.estrCveClsProd;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstrNumNafin(BigDecimal estrNumNafin) {
        this.estrNumNafin = estrNumNafin;
    }

    public BigDecimal getEstrNumNafin() {
        return this.estrNumNafin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstrImpNafin(BigDecimal estrImpNafin) {
        this.estrImpNafin = estrImpNafin;
    }

    public BigDecimal getEstrImpNafin() {
        return this.estrImpNafin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstrNumTesofe(BigDecimal estrNumTesofe) {
        this.estrNumTesofe = estrNumTesofe;
    }

    public BigDecimal getEstrNumTesofe() {
        return this.estrNumTesofe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstrImpTesofe(BigDecimal estrImpTesofe) {
        this.estrImpTesofe = estrImpTesofe;
    }

    public BigDecimal getEstrImpTesofe() {
        return this.estrImpTesofe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstrNumCbolsa(BigDecimal estrNumCbolsa) {
        this.estrNumCbolsa = estrNumCbolsa;
    }

    public BigDecimal getEstrNumCbolsa() {
        return this.estrNumCbolsa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEstrImpCbolsa(BigDecimal estrImpCbolsa) {
        this.estrImpCbolsa = estrImpCbolsa;
    }

    public BigDecimal getEstrImpCbolsa() {
        return this.estrImpCbolsa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstrAnoAltaReg(BigDecimal estrAnoAltaReg) {
        this.estrAnoAltaReg = estrAnoAltaReg;
    }

    public BigDecimal getEstrAnoAltaReg() {
        return this.estrAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstrMesAltaReg(BigDecimal estrMesAltaReg) {
        this.estrMesAltaReg = estrMesAltaReg;
    }

    public BigDecimal getEstrMesAltaReg() {
        return this.estrMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstrDiaAltaReg(BigDecimal estrDiaAltaReg) {
        this.estrDiaAltaReg = estrDiaAltaReg;
    }

    public BigDecimal getEstrDiaAltaReg() {
        return this.estrDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstrAnoUltMod(BigDecimal estrAnoUltMod) {
        this.estrAnoUltMod = estrAnoUltMod;
    }

    public BigDecimal getEstrAnoUltMod() {
        return this.estrAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstrMesUltMod(BigDecimal estrMesUltMod) {
        this.estrMesUltMod = estrMesUltMod;
    }

    public BigDecimal getEstrMesUltMod() {
        return this.estrMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstrDiaUltMod(BigDecimal estrDiaUltMod) {
        this.estrDiaUltMod = estrDiaUltMod;
    }

    public BigDecimal getEstrDiaUltMod() {
        return this.estrDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstrCveStNivel(String estrCveStNivel) {
        this.estrCveStNivel = estrCveStNivel;
    }

    public String getEstrCveStNivel() {
        return this.estrCveStNivel;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM E_RECPAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstrNumNivel1() != null && this.getEstrNumNivel1().longValue() == -999) {
            conditions += " AND ESTR_NUM_NIVEL1 IS NULL";
        } else if (this.getEstrNumNivel1() != null) {
            conditions += " AND ESTR_NUM_NIVEL1 = ?";
            values.add(this.getEstrNumNivel1());
        }

        if (this.getEstrNumNivel2() != null && this.getEstrNumNivel2().longValue() == -999) {
            conditions += " AND ESTR_NUM_NIVEL2 IS NULL";
        } else if (this.getEstrNumNivel2() != null) {
            conditions += " AND ESTR_NUM_NIVEL2 = ?";
            values.add(this.getEstrNumNivel2());
        }

        if (this.getEstrNumNivel3() != null && this.getEstrNumNivel3().longValue() == -999) {
            conditions += " AND ESTR_NUM_NIVEL3 IS NULL";
        } else if (this.getEstrNumNivel3() != null) {
            conditions += " AND ESTR_NUM_NIVEL3 = ?";
            values.add(this.getEstrNumNivel3());
        }

        if (this.getEstrNumNivel4() != null && this.getEstrNumNivel4().longValue() == -999) {
            conditions += " AND ESTR_NUM_NIVEL4 IS NULL";
        } else if (this.getEstrNumNivel4() != null) {
            conditions += " AND ESTR_NUM_NIVEL4 = ?";
            values.add(this.getEstrNumNivel4());
        }

        if (this.getEstrNumNivel5() != null && this.getEstrNumNivel5().longValue() == -999) {
            conditions += " AND ESTR_NUM_NIVEL5 IS NULL";
        } else if (this.getEstrNumNivel5() != null) {
            conditions += " AND ESTR_NUM_NIVEL5 = ?";
            values.add(this.getEstrNumNivel5());
        }

        if (this.getEstrNumAno() != null && this.getEstrNumAno().longValue() == -999) {
            conditions += " AND ESTR_NUM_ANO IS NULL";
        } else if (this.getEstrNumAno() != null) {
            conditions += " AND ESTR_NUM_ANO = ?";
            values.add(this.getEstrNumAno());
        }

        if (this.getEstrNumMes() != null && "null".equals(this.getEstrNumMes())) {
            conditions += " AND ESTR_NUM_MES IS NULL";
        } else if (this.getEstrNumMes() != null) {
            conditions += " AND ESTR_NUM_MES = ?";
            values.add(this.getEstrNumMes());
        }

        if (this.getEstrCveTipoNeg() != null && "null".equals(this.getEstrCveTipoNeg())) {
            conditions += " AND ESTR_CVE_TIPO_NEG IS NULL";
        } else if (this.getEstrCveTipoNeg() != null) {
            conditions += " AND ESTR_CVE_TIPO_NEG = ?";
            values.add(this.getEstrCveTipoNeg());
        }

        if (this.getEstrCveClsProd() != null && "null".equals(this.getEstrCveClsProd())) {
            conditions += " AND ESTR_CVE_CLS_PROD IS NULL";
        } else if (this.getEstrCveClsProd() != null) {
            conditions += " AND ESTR_CVE_CLS_PROD = ?";
            values.add(this.getEstrCveClsProd());
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
        String sql = "SELECT * FROM E_RECPAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstrNumNivel1() != null && this.getEstrNumNivel1().longValue() == -999) {
            conditions += " AND ESTR_NUM_NIVEL1 IS NULL";
        } else if (this.getEstrNumNivel1() != null) {
            conditions += " AND ESTR_NUM_NIVEL1 = ?";
            values.add(this.getEstrNumNivel1());
        }

        if (this.getEstrNumNivel2() != null && this.getEstrNumNivel2().longValue() == -999) {
            conditions += " AND ESTR_NUM_NIVEL2 IS NULL";
        } else if (this.getEstrNumNivel2() != null) {
            conditions += " AND ESTR_NUM_NIVEL2 = ?";
            values.add(this.getEstrNumNivel2());
        }

        if (this.getEstrNumNivel3() != null && this.getEstrNumNivel3().longValue() == -999) {
            conditions += " AND ESTR_NUM_NIVEL3 IS NULL";
        } else if (this.getEstrNumNivel3() != null) {
            conditions += " AND ESTR_NUM_NIVEL3 = ?";
            values.add(this.getEstrNumNivel3());
        }

        if (this.getEstrNumNivel4() != null && this.getEstrNumNivel4().longValue() == -999) {
            conditions += " AND ESTR_NUM_NIVEL4 IS NULL";
        } else if (this.getEstrNumNivel4() != null) {
            conditions += " AND ESTR_NUM_NIVEL4 = ?";
            values.add(this.getEstrNumNivel4());
        }

        if (this.getEstrNumNivel5() != null && this.getEstrNumNivel5().longValue() == -999) {
            conditions += " AND ESTR_NUM_NIVEL5 IS NULL";
        } else if (this.getEstrNumNivel5() != null) {
            conditions += " AND ESTR_NUM_NIVEL5 = ?";
            values.add(this.getEstrNumNivel5());
        }

        if (this.getEstrNumAno() != null && this.getEstrNumAno().longValue() == -999) {
            conditions += " AND ESTR_NUM_ANO IS NULL";
        } else if (this.getEstrNumAno() != null) {
            conditions += " AND ESTR_NUM_ANO = ?";
            values.add(this.getEstrNumAno());
        }

        if (this.getEstrNumMes() != null && "null".equals(this.getEstrNumMes())) {
            conditions += " AND ESTR_NUM_MES IS NULL";
        } else if (this.getEstrNumMes() != null) {
            conditions += " AND ESTR_NUM_MES = ?";
            values.add(this.getEstrNumMes());
        }

        if (this.getEstrCveTipoNeg() != null && "null".equals(this.getEstrCveTipoNeg())) {
            conditions += " AND ESTR_CVE_TIPO_NEG IS NULL";
        } else if (this.getEstrCveTipoNeg() != null) {
            conditions += " AND ESTR_CVE_TIPO_NEG = ?";
            values.add(this.getEstrCveTipoNeg());
        }

        if (this.getEstrCveClsProd() != null && "null".equals(this.getEstrCveClsProd())) {
            conditions += " AND ESTR_CVE_CLS_PROD IS NULL";
        } else if (this.getEstrCveClsProd() != null) {
            conditions += " AND ESTR_CVE_CLS_PROD = ?";
            values.add(this.getEstrCveClsProd());
        }

        if (this.getEstrNumNafin() != null && this.getEstrNumNafin().longValue() == -999) {
            conditions += " AND ESTR_NUM_NAFIN IS NULL";
        } else if (this.getEstrNumNafin() != null) {
            conditions += " AND ESTR_NUM_NAFIN = ?";
            values.add(this.getEstrNumNafin());
        }

        if (this.getEstrImpNafin() != null && this.getEstrImpNafin().longValue() == -999) {
            conditions += " AND ESTR_IMP_NAFIN IS NULL";
        } else if (this.getEstrImpNafin() != null) {
            conditions += " AND ESTR_IMP_NAFIN = ?";
            values.add(this.getEstrImpNafin());
        }

        if (this.getEstrNumTesofe() != null && this.getEstrNumTesofe().longValue() == -999) {
            conditions += " AND ESTR_NUM_TESOFE IS NULL";
        } else if (this.getEstrNumTesofe() != null) {
            conditions += " AND ESTR_NUM_TESOFE = ?";
            values.add(this.getEstrNumTesofe());
        }

        if (this.getEstrImpTesofe() != null && this.getEstrImpTesofe().longValue() == -999) {
            conditions += " AND ESTR_IMP_TESOFE IS NULL";
        } else if (this.getEstrImpTesofe() != null) {
            conditions += " AND ESTR_IMP_TESOFE = ?";
            values.add(this.getEstrImpTesofe());
        }

        if (this.getEstrNumCbolsa() != null && this.getEstrNumCbolsa().longValue() == -999) {
            conditions += " AND ESTR_NUM_CBOLSA IS NULL";
        } else if (this.getEstrNumCbolsa() != null) {
            conditions += " AND ESTR_NUM_CBOLSA = ?";
            values.add(this.getEstrNumCbolsa());
        }

        if (this.getEstrImpCbolsa() != null && this.getEstrImpCbolsa().longValue() == -999) {
            conditions += " AND ESTR_IMP_CBOLSA IS NULL";
        } else if (this.getEstrImpCbolsa() != null) {
            conditions += " AND ESTR_IMP_CBOLSA = ?";
            values.add(this.getEstrImpCbolsa());
        }

        if (this.getEstrAnoAltaReg() != null && this.getEstrAnoAltaReg().longValue() == -999) {
            conditions += " AND ESTR_ANO_ALTA_REG IS NULL";
        } else if (this.getEstrAnoAltaReg() != null) {
            conditions += " AND ESTR_ANO_ALTA_REG = ?";
            values.add(this.getEstrAnoAltaReg());
        }

        if (this.getEstrMesAltaReg() != null && this.getEstrMesAltaReg().longValue() == -999) {
            conditions += " AND ESTR_MES_ALTA_REG IS NULL";
        } else if (this.getEstrMesAltaReg() != null) {
            conditions += " AND ESTR_MES_ALTA_REG = ?";
            values.add(this.getEstrMesAltaReg());
        }

        if (this.getEstrDiaAltaReg() != null && this.getEstrDiaAltaReg().longValue() == -999) {
            conditions += " AND ESTR_DIA_ALTA_REG IS NULL";
        } else if (this.getEstrDiaAltaReg() != null) {
            conditions += " AND ESTR_DIA_ALTA_REG = ?";
            values.add(this.getEstrDiaAltaReg());
        }

        if (this.getEstrAnoUltMod() != null && this.getEstrAnoUltMod().longValue() == -999) {
            conditions += " AND ESTR_ANO_ULT_MOD IS NULL";
        } else if (this.getEstrAnoUltMod() != null) {
            conditions += " AND ESTR_ANO_ULT_MOD = ?";
            values.add(this.getEstrAnoUltMod());
        }

        if (this.getEstrMesUltMod() != null && this.getEstrMesUltMod().longValue() == -999) {
            conditions += " AND ESTR_MES_ULT_MOD IS NULL";
        } else if (this.getEstrMesUltMod() != null) {
            conditions += " AND ESTR_MES_ULT_MOD = ?";
            values.add(this.getEstrMesUltMod());
        }

        if (this.getEstrDiaUltMod() != null && this.getEstrDiaUltMod().longValue() == -999) {
            conditions += " AND ESTR_DIA_ULT_MOD IS NULL";
        } else if (this.getEstrDiaUltMod() != null) {
            conditions += " AND ESTR_DIA_ULT_MOD = ?";
            values.add(this.getEstrDiaUltMod());
        }

        if (this.getEstrCveStNivel() != null && "null".equals(this.getEstrCveStNivel())) {
            conditions += " AND ESTR_CVE_ST_NIVEL IS NULL";
        } else if (this.getEstrCveStNivel() != null) {
            conditions += " AND ESTR_CVE_ST_NIVEL = ?";
            values.add(this.getEstrCveStNivel());
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
        String sql = "UPDATE E_RECPAT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESTR_NUM_NIVEL1 = ?";
        pkValues.add(this.getEstrNumNivel1());
        conditions += " AND ESTR_NUM_NIVEL2 = ?";
        pkValues.add(this.getEstrNumNivel2());
        conditions += " AND ESTR_NUM_NIVEL3 = ?";
        pkValues.add(this.getEstrNumNivel3());
        conditions += " AND ESTR_NUM_NIVEL4 = ?";
        pkValues.add(this.getEstrNumNivel4());
        conditions += " AND ESTR_NUM_NIVEL5 = ?";
        pkValues.add(this.getEstrNumNivel5());
        conditions += " AND ESTR_NUM_ANO = ?";
        pkValues.add(this.getEstrNumAno());
        conditions += " AND ESTR_NUM_MES = ?";
        pkValues.add(this.getEstrNumMes());
        conditions += " AND ESTR_CVE_TIPO_NEG = ?";
        pkValues.add(this.getEstrCveTipoNeg());
        conditions += " AND ESTR_CVE_CLS_PROD = ?";
        pkValues.add(this.getEstrCveClsProd());
        fields += " ESTR_NUM_NAFIN = ?, ";
        values.add(this.getEstrNumNafin());
        fields += " ESTR_IMP_NAFIN = ?, ";
        values.add(this.getEstrImpNafin());
        fields += " ESTR_NUM_TESOFE = ?, ";
        values.add(this.getEstrNumTesofe());
        fields += " ESTR_IMP_TESOFE = ?, ";
        values.add(this.getEstrImpTesofe());
        fields += " ESTR_NUM_CBOLSA = ?, ";
        values.add(this.getEstrNumCbolsa());
        fields += " ESTR_IMP_CBOLSA = ?, ";
        values.add(this.getEstrImpCbolsa());
        fields += " ESTR_ANO_ALTA_REG = ?, ";
        values.add(this.getEstrAnoAltaReg());
        fields += " ESTR_MES_ALTA_REG = ?, ";
        values.add(this.getEstrMesAltaReg());
        fields += " ESTR_DIA_ALTA_REG = ?, ";
        values.add(this.getEstrDiaAltaReg());
        fields += " ESTR_ANO_ULT_MOD = ?, ";
        values.add(this.getEstrAnoUltMod());
        fields += " ESTR_MES_ULT_MOD = ?, ";
        values.add(this.getEstrMesUltMod());
        fields += " ESTR_DIA_ULT_MOD = ?, ";
        values.add(this.getEstrDiaUltMod());
        fields += " ESTR_CVE_ST_NIVEL = ?, ";
        values.add(this.getEstrCveStNivel());
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
        String sql = "INSERT INTO E_RECPAT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESTR_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getEstrNumNivel1());

        fields += ", ESTR_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getEstrNumNivel2());

        fields += ", ESTR_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getEstrNumNivel3());

        fields += ", ESTR_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getEstrNumNivel4());

        fields += ", ESTR_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getEstrNumNivel5());

        fields += ", ESTR_NUM_ANO";
        fieldValues += ", ?";
        values.add(this.getEstrNumAno());

        fields += ", ESTR_NUM_MES";
        fieldValues += ", ?";
        values.add(this.getEstrNumMes());

        fields += ", ESTR_CVE_TIPO_NEG";
        fieldValues += ", ?";
        values.add(this.getEstrCveTipoNeg());

        fields += ", ESTR_CVE_CLS_PROD";
        fieldValues += ", ?";
        values.add(this.getEstrCveClsProd());

        fields += ", ESTR_NUM_NAFIN";
        fieldValues += ", ?";
        values.add(this.getEstrNumNafin());

        fields += ", ESTR_IMP_NAFIN";
        fieldValues += ", ?";
        values.add(this.getEstrImpNafin());

        fields += ", ESTR_NUM_TESOFE";
        fieldValues += ", ?";
        values.add(this.getEstrNumTesofe());

        fields += ", ESTR_IMP_TESOFE";
        fieldValues += ", ?";
        values.add(this.getEstrImpTesofe());

        fields += ", ESTR_NUM_CBOLSA";
        fieldValues += ", ?";
        values.add(this.getEstrNumCbolsa());

        fields += ", ESTR_IMP_CBOLSA";
        fieldValues += ", ?";
        values.add(this.getEstrImpCbolsa());

        fields += ", ESTR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstrAnoAltaReg());

        fields += ", ESTR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstrMesAltaReg());

        fields += ", ESTR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstrDiaAltaReg());

        fields += ", ESTR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstrAnoUltMod());

        fields += ", ESTR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstrMesUltMod());

        fields += ", ESTR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstrDiaUltMod());

        fields += ", ESTR_CVE_ST_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEstrCveStNivel());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM E_RECPAT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESTR_NUM_NIVEL1 = ?";
        values.add(this.getEstrNumNivel1());
        conditions += " AND ESTR_NUM_NIVEL2 = ?";
        values.add(this.getEstrNumNivel2());
        conditions += " AND ESTR_NUM_NIVEL3 = ?";
        values.add(this.getEstrNumNivel3());
        conditions += " AND ESTR_NUM_NIVEL4 = ?";
        values.add(this.getEstrNumNivel4());
        conditions += " AND ESTR_NUM_NIVEL5 = ?";
        values.add(this.getEstrNumNivel5());
        conditions += " AND ESTR_NUM_ANO = ?";
        values.add(this.getEstrNumAno());
        conditions += " AND ESTR_NUM_MES = ?";
        values.add(this.getEstrNumMes());
        conditions += " AND ESTR_CVE_TIPO_NEG = ?";
        values.add(this.getEstrCveTipoNeg());
        conditions += " AND ESTR_CVE_CLS_PROD = ?";
        values.add(this.getEstrCveClsProd());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ERecpat instance = (ERecpat) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEstrNumNivel1().equals(instance.getEstrNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getEstrNumNivel2().equals(instance.getEstrNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getEstrNumNivel3().equals(instance.getEstrNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getEstrNumNivel4().equals(instance.getEstrNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getEstrNumNivel5().equals(instance.getEstrNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getEstrNumAno().equals(instance.getEstrNumAno()))
            equalObjects = false;
        if (equalObjects && !this.getEstrNumMes().equals(instance.getEstrNumMes()))
            equalObjects = false;
        if (equalObjects && !this.getEstrCveTipoNeg().equals(instance.getEstrCveTipoNeg()))
            equalObjects = false;
        if (equalObjects && !this.getEstrCveClsProd().equals(instance.getEstrCveClsProd()))
            equalObjects = false;
        if (equalObjects && !this.getEstrNumNafin().equals(instance.getEstrNumNafin()))
            equalObjects = false;
        if (equalObjects && !this.getEstrImpNafin().equals(instance.getEstrImpNafin()))
            equalObjects = false;
        if (equalObjects && !this.getEstrNumTesofe().equals(instance.getEstrNumTesofe()))
            equalObjects = false;
        if (equalObjects && !this.getEstrImpTesofe().equals(instance.getEstrImpTesofe()))
            equalObjects = false;
        if (equalObjects && !this.getEstrNumCbolsa().equals(instance.getEstrNumCbolsa()))
            equalObjects = false;
        if (equalObjects && !this.getEstrImpCbolsa().equals(instance.getEstrImpCbolsa()))
            equalObjects = false;
        if (equalObjects && !this.getEstrAnoAltaReg().equals(instance.getEstrAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstrMesAltaReg().equals(instance.getEstrMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstrDiaAltaReg().equals(instance.getEstrDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstrAnoUltMod().equals(instance.getEstrAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstrMesUltMod().equals(instance.getEstrMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstrDiaUltMod().equals(instance.getEstrDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstrCveStNivel().equals(instance.getEstrCveStNivel()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ERecpat result = new ERecpat();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEstrNumNivel1((BigDecimal) objectData.getData("ESTR_NUM_NIVEL1"));
        result.setEstrNumNivel2((BigDecimal) objectData.getData("ESTR_NUM_NIVEL2"));
        result.setEstrNumNivel3((BigDecimal) objectData.getData("ESTR_NUM_NIVEL3"));
        result.setEstrNumNivel4((BigDecimal) objectData.getData("ESTR_NUM_NIVEL4"));
        result.setEstrNumNivel5((BigDecimal) objectData.getData("ESTR_NUM_NIVEL5"));
        result.setEstrNumAno((BigDecimal) objectData.getData("ESTR_NUM_ANO"));
        result.setEstrNumMes((String) objectData.getData("ESTR_NUM_MES"));
        result.setEstrCveTipoNeg((String) objectData.getData("ESTR_CVE_TIPO_NEG"));
        result.setEstrCveClsProd((String) objectData.getData("ESTR_CVE_CLS_PROD"));
        result.setEstrNumNafin((BigDecimal) objectData.getData("ESTR_NUM_NAFIN"));
        result.setEstrImpNafin((BigDecimal) objectData.getData("ESTR_IMP_NAFIN"));
        result.setEstrNumTesofe((BigDecimal) objectData.getData("ESTR_NUM_TESOFE"));
        result.setEstrImpTesofe((BigDecimal) objectData.getData("ESTR_IMP_TESOFE"));
        result.setEstrNumCbolsa((BigDecimal) objectData.getData("ESTR_NUM_CBOLSA"));
        result.setEstrImpCbolsa((BigDecimal) objectData.getData("ESTR_IMP_CBOLSA"));
        result.setEstrAnoAltaReg((BigDecimal) objectData.getData("ESTR_ANO_ALTA_REG"));
        result.setEstrMesAltaReg((BigDecimal) objectData.getData("ESTR_MES_ALTA_REG"));
        result.setEstrDiaAltaReg((BigDecimal) objectData.getData("ESTR_DIA_ALTA_REG"));
        result.setEstrAnoUltMod((BigDecimal) objectData.getData("ESTR_ANO_ULT_MOD"));
        result.setEstrMesUltMod((BigDecimal) objectData.getData("ESTR_MES_ULT_MOD"));
        result.setEstrDiaUltMod((BigDecimal) objectData.getData("ESTR_DIA_ULT_MOD"));
        result.setEstrCveStNivel((String) objectData.getData("ESTR_CVE_ST_NIVEL"));

        return result;

    }

}
