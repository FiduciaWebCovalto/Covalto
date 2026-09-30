package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "E_COMITE_PK",
            columns =
            { "ESTC_NUM_ANO", "ESTC_NUM_MES", "ESTC_CVE_TIPO_NEG", "ESTC_CVE_CLS_PROD", "ESTC_NUM_NIVEL1", "ESTC_NUM_NIVEL2", "ESTC_NUM_NIVEL3", "ESTC_NUM_NIVEL4",
              "ESTC_NUM_NIVEL5"
    }, sequences = { "MANUAL" })
public class EComite extends DomainObject {

    BigDecimal estcNumNivel1 = null;
    BigDecimal estcNumNivel2 = null;
    BigDecimal estcNumNivel3 = null;
    BigDecimal estcNumNivel4 = null;
    BigDecimal estcNumNivel5 = null;
    BigDecimal estcNumAno = null;
    String estcNumMes = null;
    String estcCveTipoNeg = null;
    String estcCveClsProd = null;
    BigDecimal estcNumComites = null;
    BigDecimal estcNumSubcomite = null;
    BigDecimal estcAnoAltaReg = null;
    BigDecimal estcMesAltaReg = null;
    BigDecimal estcDiaAltaReg = null;
    BigDecimal estcAnoUltMod = null;
    BigDecimal estcMesUltMod = null;
    BigDecimal estcDiaUltMod = null;
    String estcCveStNivel = null;

    public EComite() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstcNumNivel1(BigDecimal estcNumNivel1) {
        this.estcNumNivel1 = estcNumNivel1;
    }

    public BigDecimal getEstcNumNivel1() {
        return this.estcNumNivel1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstcNumNivel2(BigDecimal estcNumNivel2) {
        this.estcNumNivel2 = estcNumNivel2;
    }

    public BigDecimal getEstcNumNivel2() {
        return this.estcNumNivel2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstcNumNivel3(BigDecimal estcNumNivel3) {
        this.estcNumNivel3 = estcNumNivel3;
    }

    public BigDecimal getEstcNumNivel3() {
        return this.estcNumNivel3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstcNumNivel4(BigDecimal estcNumNivel4) {
        this.estcNumNivel4 = estcNumNivel4;
    }

    public BigDecimal getEstcNumNivel4() {
        return this.estcNumNivel4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstcNumNivel5(BigDecimal estcNumNivel5) {
        this.estcNumNivel5 = estcNumNivel5;
    }

    public BigDecimal getEstcNumNivel5() {
        return this.estcNumNivel5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstcNumAno(BigDecimal estcNumAno) {
        this.estcNumAno = estcNumAno;
    }

    public BigDecimal getEstcNumAno() {
        return this.estcNumAno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstcNumMes(String estcNumMes) {
        this.estcNumMes = estcNumMes;
    }

    public String getEstcNumMes() {
        return this.estcNumMes;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstcCveTipoNeg(String estcCveTipoNeg) {
        this.estcCveTipoNeg = estcCveTipoNeg;
    }

    public String getEstcCveTipoNeg() {
        return this.estcCveTipoNeg;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstcCveClsProd(String estcCveClsProd) {
        this.estcCveClsProd = estcCveClsProd;
    }

    public String getEstcCveClsProd() {
        return this.estcCveClsProd;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstcNumComites(BigDecimal estcNumComites) {
        this.estcNumComites = estcNumComites;
    }

    public BigDecimal getEstcNumComites() {
        return this.estcNumComites;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEstcNumSubcomite(BigDecimal estcNumSubcomite) {
        this.estcNumSubcomite = estcNumSubcomite;
    }

    public BigDecimal getEstcNumSubcomite() {
        return this.estcNumSubcomite;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstcAnoAltaReg(BigDecimal estcAnoAltaReg) {
        this.estcAnoAltaReg = estcAnoAltaReg;
    }

    public BigDecimal getEstcAnoAltaReg() {
        return this.estcAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstcMesAltaReg(BigDecimal estcMesAltaReg) {
        this.estcMesAltaReg = estcMesAltaReg;
    }

    public BigDecimal getEstcMesAltaReg() {
        return this.estcMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstcDiaAltaReg(BigDecimal estcDiaAltaReg) {
        this.estcDiaAltaReg = estcDiaAltaReg;
    }

    public BigDecimal getEstcDiaAltaReg() {
        return this.estcDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEstcAnoUltMod(BigDecimal estcAnoUltMod) {
        this.estcAnoUltMod = estcAnoUltMod;
    }

    public BigDecimal getEstcAnoUltMod() {
        return this.estcAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstcMesUltMod(BigDecimal estcMesUltMod) {
        this.estcMesUltMod = estcMesUltMod;
    }

    public BigDecimal getEstcMesUltMod() {
        return this.estcMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEstcDiaUltMod(BigDecimal estcDiaUltMod) {
        this.estcDiaUltMod = estcDiaUltMod;
    }

    public BigDecimal getEstcDiaUltMod() {
        return this.estcDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstcCveStNivel(String estcCveStNivel) {
        this.estcCveStNivel = estcCveStNivel;
    }

    public String getEstcCveStNivel() {
        return this.estcCveStNivel;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM E_COMITE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstcNumNivel1() != null && this.getEstcNumNivel1().longValue() == -999) {
            conditions += " AND ESTC_NUM_NIVEL1 IS NULL";
        } else if (this.getEstcNumNivel1() != null) {
            conditions += " AND ESTC_NUM_NIVEL1 = ?";
            values.add(this.getEstcNumNivel1());
        }

        if (this.getEstcNumNivel2() != null && this.getEstcNumNivel2().longValue() == -999) {
            conditions += " AND ESTC_NUM_NIVEL2 IS NULL";
        } else if (this.getEstcNumNivel2() != null) {
            conditions += " AND ESTC_NUM_NIVEL2 = ?";
            values.add(this.getEstcNumNivel2());
        }

        if (this.getEstcNumNivel3() != null && this.getEstcNumNivel3().longValue() == -999) {
            conditions += " AND ESTC_NUM_NIVEL3 IS NULL";
        } else if (this.getEstcNumNivel3() != null) {
            conditions += " AND ESTC_NUM_NIVEL3 = ?";
            values.add(this.getEstcNumNivel3());
        }

        if (this.getEstcNumNivel4() != null && this.getEstcNumNivel4().longValue() == -999) {
            conditions += " AND ESTC_NUM_NIVEL4 IS NULL";
        } else if (this.getEstcNumNivel4() != null) {
            conditions += " AND ESTC_NUM_NIVEL4 = ?";
            values.add(this.getEstcNumNivel4());
        }

        if (this.getEstcNumNivel5() != null && this.getEstcNumNivel5().longValue() == -999) {
            conditions += " AND ESTC_NUM_NIVEL5 IS NULL";
        } else if (this.getEstcNumNivel5() != null) {
            conditions += " AND ESTC_NUM_NIVEL5 = ?";
            values.add(this.getEstcNumNivel5());
        }

        if (this.getEstcNumAno() != null && this.getEstcNumAno().longValue() == -999) {
            conditions += " AND ESTC_NUM_ANO IS NULL";
        } else if (this.getEstcNumAno() != null) {
            conditions += " AND ESTC_NUM_ANO = ?";
            values.add(this.getEstcNumAno());
        }

        if (this.getEstcNumMes() != null && "null".equals(this.getEstcNumMes())) {
            conditions += " AND ESTC_NUM_MES IS NULL";
        } else if (this.getEstcNumMes() != null) {
            conditions += " AND ESTC_NUM_MES = ?";
            values.add(this.getEstcNumMes());
        }

        if (this.getEstcCveTipoNeg() != null && "null".equals(this.getEstcCveTipoNeg())) {
            conditions += " AND ESTC_CVE_TIPO_NEG IS NULL";
        } else if (this.getEstcCveTipoNeg() != null) {
            conditions += " AND ESTC_CVE_TIPO_NEG = ?";
            values.add(this.getEstcCveTipoNeg());
        }

        if (this.getEstcCveClsProd() != null && "null".equals(this.getEstcCveClsProd())) {
            conditions += " AND ESTC_CVE_CLS_PROD IS NULL";
        } else if (this.getEstcCveClsProd() != null) {
            conditions += " AND ESTC_CVE_CLS_PROD = ?";
            values.add(this.getEstcCveClsProd());
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
        String sql = "SELECT * FROM E_COMITE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEstcNumNivel1() != null && this.getEstcNumNivel1().longValue() == -999) {
            conditions += " AND ESTC_NUM_NIVEL1 IS NULL";
        } else if (this.getEstcNumNivel1() != null) {
            conditions += " AND ESTC_NUM_NIVEL1 = ?";
            values.add(this.getEstcNumNivel1());
        }

        if (this.getEstcNumNivel2() != null && this.getEstcNumNivel2().longValue() == -999) {
            conditions += " AND ESTC_NUM_NIVEL2 IS NULL";
        } else if (this.getEstcNumNivel2() != null) {
            conditions += " AND ESTC_NUM_NIVEL2 = ?";
            values.add(this.getEstcNumNivel2());
        }

        if (this.getEstcNumNivel3() != null && this.getEstcNumNivel3().longValue() == -999) {
            conditions += " AND ESTC_NUM_NIVEL3 IS NULL";
        } else if (this.getEstcNumNivel3() != null) {
            conditions += " AND ESTC_NUM_NIVEL3 = ?";
            values.add(this.getEstcNumNivel3());
        }

        if (this.getEstcNumNivel4() != null && this.getEstcNumNivel4().longValue() == -999) {
            conditions += " AND ESTC_NUM_NIVEL4 IS NULL";
        } else if (this.getEstcNumNivel4() != null) {
            conditions += " AND ESTC_NUM_NIVEL4 = ?";
            values.add(this.getEstcNumNivel4());
        }

        if (this.getEstcNumNivel5() != null && this.getEstcNumNivel5().longValue() == -999) {
            conditions += " AND ESTC_NUM_NIVEL5 IS NULL";
        } else if (this.getEstcNumNivel5() != null) {
            conditions += " AND ESTC_NUM_NIVEL5 = ?";
            values.add(this.getEstcNumNivel5());
        }

        if (this.getEstcNumAno() != null && this.getEstcNumAno().longValue() == -999) {
            conditions += " AND ESTC_NUM_ANO IS NULL";
        } else if (this.getEstcNumAno() != null) {
            conditions += " AND ESTC_NUM_ANO = ?";
            values.add(this.getEstcNumAno());
        }

        if (this.getEstcNumMes() != null && "null".equals(this.getEstcNumMes())) {
            conditions += " AND ESTC_NUM_MES IS NULL";
        } else if (this.getEstcNumMes() != null) {
            conditions += " AND ESTC_NUM_MES = ?";
            values.add(this.getEstcNumMes());
        }

        if (this.getEstcCveTipoNeg() != null && "null".equals(this.getEstcCveTipoNeg())) {
            conditions += " AND ESTC_CVE_TIPO_NEG IS NULL";
        } else if (this.getEstcCveTipoNeg() != null) {
            conditions += " AND ESTC_CVE_TIPO_NEG = ?";
            values.add(this.getEstcCveTipoNeg());
        }

        if (this.getEstcCveClsProd() != null && "null".equals(this.getEstcCveClsProd())) {
            conditions += " AND ESTC_CVE_CLS_PROD IS NULL";
        } else if (this.getEstcCveClsProd() != null) {
            conditions += " AND ESTC_CVE_CLS_PROD = ?";
            values.add(this.getEstcCveClsProd());
        }

        if (this.getEstcNumComites() != null && this.getEstcNumComites().longValue() == -999) {
            conditions += " AND ESTC_NUM_COMITES IS NULL";
        } else if (this.getEstcNumComites() != null) {
            conditions += " AND ESTC_NUM_COMITES = ?";
            values.add(this.getEstcNumComites());
        }

        if (this.getEstcNumSubcomite() != null && this.getEstcNumSubcomite().longValue() == -999) {
            conditions += " AND ESTC_NUM_SUBCOMITE IS NULL";
        } else if (this.getEstcNumSubcomite() != null) {
            conditions += " AND ESTC_NUM_SUBCOMITE = ?";
            values.add(this.getEstcNumSubcomite());
        }

        if (this.getEstcAnoAltaReg() != null && this.getEstcAnoAltaReg().longValue() == -999) {
            conditions += " AND ESTC_ANO_ALTA_REG IS NULL";
        } else if (this.getEstcAnoAltaReg() != null) {
            conditions += " AND ESTC_ANO_ALTA_REG = ?";
            values.add(this.getEstcAnoAltaReg());
        }

        if (this.getEstcMesAltaReg() != null && this.getEstcMesAltaReg().longValue() == -999) {
            conditions += " AND ESTC_MES_ALTA_REG IS NULL";
        } else if (this.getEstcMesAltaReg() != null) {
            conditions += " AND ESTC_MES_ALTA_REG = ?";
            values.add(this.getEstcMesAltaReg());
        }

        if (this.getEstcDiaAltaReg() != null && this.getEstcDiaAltaReg().longValue() == -999) {
            conditions += " AND ESTC_DIA_ALTA_REG IS NULL";
        } else if (this.getEstcDiaAltaReg() != null) {
            conditions += " AND ESTC_DIA_ALTA_REG = ?";
            values.add(this.getEstcDiaAltaReg());
        }

        if (this.getEstcAnoUltMod() != null && this.getEstcAnoUltMod().longValue() == -999) {
            conditions += " AND ESTC_ANO_ULT_MOD IS NULL";
        } else if (this.getEstcAnoUltMod() != null) {
            conditions += " AND ESTC_ANO_ULT_MOD = ?";
            values.add(this.getEstcAnoUltMod());
        }

        if (this.getEstcMesUltMod() != null && this.getEstcMesUltMod().longValue() == -999) {
            conditions += " AND ESTC_MES_ULT_MOD IS NULL";
        } else if (this.getEstcMesUltMod() != null) {
            conditions += " AND ESTC_MES_ULT_MOD = ?";
            values.add(this.getEstcMesUltMod());
        }

        if (this.getEstcDiaUltMod() != null && this.getEstcDiaUltMod().longValue() == -999) {
            conditions += " AND ESTC_DIA_ULT_MOD IS NULL";
        } else if (this.getEstcDiaUltMod() != null) {
            conditions += " AND ESTC_DIA_ULT_MOD = ?";
            values.add(this.getEstcDiaUltMod());
        }

        if (this.getEstcCveStNivel() != null && "null".equals(this.getEstcCveStNivel())) {
            conditions += " AND ESTC_CVE_ST_NIVEL IS NULL";
        } else if (this.getEstcCveStNivel() != null) {
            conditions += " AND ESTC_CVE_ST_NIVEL = ?";
            values.add(this.getEstcCveStNivel());
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
        String sql = "UPDATE E_COMITE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ESTC_NUM_NIVEL1 = ?";
        pkValues.add(this.getEstcNumNivel1());
        conditions += " AND ESTC_NUM_NIVEL2 = ?";
        pkValues.add(this.getEstcNumNivel2());
        conditions += " AND ESTC_NUM_NIVEL3 = ?";
        pkValues.add(this.getEstcNumNivel3());
        conditions += " AND ESTC_NUM_NIVEL4 = ?";
        pkValues.add(this.getEstcNumNivel4());
        conditions += " AND ESTC_NUM_NIVEL5 = ?";
        pkValues.add(this.getEstcNumNivel5());
        conditions += " AND ESTC_NUM_ANO = ?";
        pkValues.add(this.getEstcNumAno());
        conditions += " AND ESTC_NUM_MES = ?";
        pkValues.add(this.getEstcNumMes());
        conditions += " AND ESTC_CVE_TIPO_NEG = ?";
        pkValues.add(this.getEstcCveTipoNeg());
        conditions += " AND ESTC_CVE_CLS_PROD = ?";
        pkValues.add(this.getEstcCveClsProd());
        fields += " ESTC_NUM_COMITES = ?, ";
        values.add(this.getEstcNumComites());
        fields += " ESTC_NUM_SUBCOMITE = ?, ";
        values.add(this.getEstcNumSubcomite());
        fields += " ESTC_ANO_ALTA_REG = ?, ";
        values.add(this.getEstcAnoAltaReg());
        fields += " ESTC_MES_ALTA_REG = ?, ";
        values.add(this.getEstcMesAltaReg());
        fields += " ESTC_DIA_ALTA_REG = ?, ";
        values.add(this.getEstcDiaAltaReg());
        fields += " ESTC_ANO_ULT_MOD = ?, ";
        values.add(this.getEstcAnoUltMod());
        fields += " ESTC_MES_ULT_MOD = ?, ";
        values.add(this.getEstcMesUltMod());
        fields += " ESTC_DIA_ULT_MOD = ?, ";
        values.add(this.getEstcDiaUltMod());
        fields += " ESTC_CVE_ST_NIVEL = ?, ";
        values.add(this.getEstcCveStNivel());
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
        String sql = "INSERT INTO E_COMITE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ESTC_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getEstcNumNivel1());

        fields += ", ESTC_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getEstcNumNivel2());

        fields += ", ESTC_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getEstcNumNivel3());

        fields += ", ESTC_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getEstcNumNivel4());

        fields += ", ESTC_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getEstcNumNivel5());

        fields += ", ESTC_NUM_ANO";
        fieldValues += ", ?";
        values.add(this.getEstcNumAno());

        fields += ", ESTC_NUM_MES";
        fieldValues += ", ?";
        values.add(this.getEstcNumMes());

        fields += ", ESTC_CVE_TIPO_NEG";
        fieldValues += ", ?";
        values.add(this.getEstcCveTipoNeg());

        fields += ", ESTC_CVE_CLS_PROD";
        fieldValues += ", ?";
        values.add(this.getEstcCveClsProd());

        fields += ", ESTC_NUM_COMITES";
        fieldValues += ", ?";
        values.add(this.getEstcNumComites());

        fields += ", ESTC_NUM_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getEstcNumSubcomite());

        fields += ", ESTC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstcAnoAltaReg());

        fields += ", ESTC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstcMesAltaReg());

        fields += ", ESTC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEstcDiaAltaReg());

        fields += ", ESTC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstcAnoUltMod());

        fields += ", ESTC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstcMesUltMod());

        fields += ", ESTC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEstcDiaUltMod());

        fields += ", ESTC_CVE_ST_NIVEL";
        fieldValues += ", ?";
        values.add(this.getEstcCveStNivel());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM E_COMITE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ESTC_NUM_NIVEL1 = ?";
        values.add(this.getEstcNumNivel1());
        conditions += " AND ESTC_NUM_NIVEL2 = ?";
        values.add(this.getEstcNumNivel2());
        conditions += " AND ESTC_NUM_NIVEL3 = ?";
        values.add(this.getEstcNumNivel3());
        conditions += " AND ESTC_NUM_NIVEL4 = ?";
        values.add(this.getEstcNumNivel4());
        conditions += " AND ESTC_NUM_NIVEL5 = ?";
        values.add(this.getEstcNumNivel5());
        conditions += " AND ESTC_NUM_ANO = ?";
        values.add(this.getEstcNumAno());
        conditions += " AND ESTC_NUM_MES = ?";
        values.add(this.getEstcNumMes());
        conditions += " AND ESTC_CVE_TIPO_NEG = ?";
        values.add(this.getEstcCveTipoNeg());
        conditions += " AND ESTC_CVE_CLS_PROD = ?";
        values.add(this.getEstcCveClsProd());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        EComite instance = (EComite) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEstcNumNivel1().equals(instance.getEstcNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getEstcNumNivel2().equals(instance.getEstcNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getEstcNumNivel3().equals(instance.getEstcNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getEstcNumNivel4().equals(instance.getEstcNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getEstcNumNivel5().equals(instance.getEstcNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getEstcNumAno().equals(instance.getEstcNumAno()))
            equalObjects = false;
        if (equalObjects && !this.getEstcNumMes().equals(instance.getEstcNumMes()))
            equalObjects = false;
        if (equalObjects && !this.getEstcCveTipoNeg().equals(instance.getEstcCveTipoNeg()))
            equalObjects = false;
        if (equalObjects && !this.getEstcCveClsProd().equals(instance.getEstcCveClsProd()))
            equalObjects = false;
        if (equalObjects && !this.getEstcNumComites().equals(instance.getEstcNumComites()))
            equalObjects = false;
        if (equalObjects && !this.getEstcNumSubcomite().equals(instance.getEstcNumSubcomite()))
            equalObjects = false;
        if (equalObjects && !this.getEstcAnoAltaReg().equals(instance.getEstcAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstcMesAltaReg().equals(instance.getEstcMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstcDiaAltaReg().equals(instance.getEstcDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEstcAnoUltMod().equals(instance.getEstcAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstcMesUltMod().equals(instance.getEstcMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstcDiaUltMod().equals(instance.getEstcDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEstcCveStNivel().equals(instance.getEstcCveStNivel()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        EComite result = new EComite();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEstcNumNivel1((BigDecimal) objectData.getData("ESTC_NUM_NIVEL1"));
        result.setEstcNumNivel2((BigDecimal) objectData.getData("ESTC_NUM_NIVEL2"));
        result.setEstcNumNivel3((BigDecimal) objectData.getData("ESTC_NUM_NIVEL3"));
        result.setEstcNumNivel4((BigDecimal) objectData.getData("ESTC_NUM_NIVEL4"));
        result.setEstcNumNivel5((BigDecimal) objectData.getData("ESTC_NUM_NIVEL5"));
        result.setEstcNumAno((BigDecimal) objectData.getData("ESTC_NUM_ANO"));
        result.setEstcNumMes((String) objectData.getData("ESTC_NUM_MES"));
        result.setEstcCveTipoNeg((String) objectData.getData("ESTC_CVE_TIPO_NEG"));
        result.setEstcCveClsProd((String) objectData.getData("ESTC_CVE_CLS_PROD"));
        result.setEstcNumComites((BigDecimal) objectData.getData("ESTC_NUM_COMITES"));
        result.setEstcNumSubcomite((BigDecimal) objectData.getData("ESTC_NUM_SUBCOMITE"));
        result.setEstcAnoAltaReg((BigDecimal) objectData.getData("ESTC_ANO_ALTA_REG"));
        result.setEstcMesAltaReg((BigDecimal) objectData.getData("ESTC_MES_ALTA_REG"));
        result.setEstcDiaAltaReg((BigDecimal) objectData.getData("ESTC_DIA_ALTA_REG"));
        result.setEstcAnoUltMod((BigDecimal) objectData.getData("ESTC_ANO_ULT_MOD"));
        result.setEstcMesUltMod((BigDecimal) objectData.getData("ESTC_MES_ULT_MOD"));
        result.setEstcDiaUltMod((BigDecimal) objectData.getData("ESTC_DIA_ULT_MOD"));
        result.setEstcCveStNivel((String) objectData.getData("ESTC_CVE_ST_NIVEL"));

        return result;

    }

}
