package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PRESHONO_PK", columns = { "PRH_NUM_CONTRATO", "PRH_ANO_REGISTRO" }, sequences = { "MANUAL" })
public class Preshono extends DomainObject {

    BigDecimal prhNumContrato = null;
    BigDecimal prhAnoRegistro = null;
    BigDecimal prhTotalAno = null;
    BigDecimal prhEnePres = null;
    BigDecimal prhEneReal = null;
    BigDecimal prhFebPres = null;
    BigDecimal prhFebReal = null;
    BigDecimal prhMarPres = null;
    BigDecimal prhMarReal = null;
    BigDecimal prhAbrPres = null;
    BigDecimal prhAbrReal = null;
    BigDecimal prhMayPres = null;
    BigDecimal prhMayReal = null;
    BigDecimal prhJunPres = null;
    BigDecimal prhJunReal = null;
    BigDecimal prhJulPres = null;
    BigDecimal prhJulReal = null;
    BigDecimal prhAgoPres = null;
    BigDecimal prhAgoReal = null;
    BigDecimal prhSepPres = null;
    BigDecimal prhSepReal = null;
    BigDecimal prhOctPres = null;
    BigDecimal prhOctReal = null;
    BigDecimal prhNovPres = null;
    BigDecimal prhNovReal = null;
    BigDecimal prhDicPres = null;
    BigDecimal prhDicReal = null;
    String prhComentario = null;
    BigDecimal prhAnoAltaReg = null;
    BigDecimal prhMesAltaReg = null;
    BigDecimal prhDiaAltaReg = null;
    BigDecimal prhAnoUltMod = null;
    BigDecimal prhMesUltMod = null;
    BigDecimal prhDiaUltMod = null;
    String prhCveStPreshon = null;

    public Preshono() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrhNumContrato(BigDecimal prhNumContrato) {
        this.prhNumContrato = prhNumContrato;
    }

    public BigDecimal getPrhNumContrato() {
        return this.prhNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPrhAnoRegistro(BigDecimal prhAnoRegistro) {
        this.prhAnoRegistro = prhAnoRegistro;
    }

    public BigDecimal getPrhAnoRegistro() {
        return this.prhAnoRegistro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhTotalAno(BigDecimal prhTotalAno) {
        this.prhTotalAno = prhTotalAno;
    }

    public BigDecimal getPrhTotalAno() {
        return this.prhTotalAno;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhEnePres(BigDecimal prhEnePres) {
        this.prhEnePres = prhEnePres;
    }

    public BigDecimal getPrhEnePres() {
        return this.prhEnePres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhEneReal(BigDecimal prhEneReal) {
        this.prhEneReal = prhEneReal;
    }

    public BigDecimal getPrhEneReal() {
        return this.prhEneReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhFebPres(BigDecimal prhFebPres) {
        this.prhFebPres = prhFebPres;
    }

    public BigDecimal getPrhFebPres() {
        return this.prhFebPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhFebReal(BigDecimal prhFebReal) {
        this.prhFebReal = prhFebReal;
    }

    public BigDecimal getPrhFebReal() {
        return this.prhFebReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhMarPres(BigDecimal prhMarPres) {
        this.prhMarPres = prhMarPres;
    }

    public BigDecimal getPrhMarPres() {
        return this.prhMarPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhMarReal(BigDecimal prhMarReal) {
        this.prhMarReal = prhMarReal;
    }

    public BigDecimal getPrhMarReal() {
        return this.prhMarReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhAbrPres(BigDecimal prhAbrPres) {
        this.prhAbrPres = prhAbrPres;
    }

    public BigDecimal getPrhAbrPres() {
        return this.prhAbrPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhAbrReal(BigDecimal prhAbrReal) {
        this.prhAbrReal = prhAbrReal;
    }

    public BigDecimal getPrhAbrReal() {
        return this.prhAbrReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhMayPres(BigDecimal prhMayPres) {
        this.prhMayPres = prhMayPres;
    }

    public BigDecimal getPrhMayPres() {
        return this.prhMayPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhMayReal(BigDecimal prhMayReal) {
        this.prhMayReal = prhMayReal;
    }

    public BigDecimal getPrhMayReal() {
        return this.prhMayReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhJunPres(BigDecimal prhJunPres) {
        this.prhJunPres = prhJunPres;
    }

    public BigDecimal getPrhJunPres() {
        return this.prhJunPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhJunReal(BigDecimal prhJunReal) {
        this.prhJunReal = prhJunReal;
    }

    public BigDecimal getPrhJunReal() {
        return this.prhJunReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhJulPres(BigDecimal prhJulPres) {
        this.prhJulPres = prhJulPres;
    }

    public BigDecimal getPrhJulPres() {
        return this.prhJulPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhJulReal(BigDecimal prhJulReal) {
        this.prhJulReal = prhJulReal;
    }

    public BigDecimal getPrhJulReal() {
        return this.prhJulReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhAgoPres(BigDecimal prhAgoPres) {
        this.prhAgoPres = prhAgoPres;
    }

    public BigDecimal getPrhAgoPres() {
        return this.prhAgoPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhAgoReal(BigDecimal prhAgoReal) {
        this.prhAgoReal = prhAgoReal;
    }

    public BigDecimal getPrhAgoReal() {
        return this.prhAgoReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhSepPres(BigDecimal prhSepPres) {
        this.prhSepPres = prhSepPres;
    }

    public BigDecimal getPrhSepPres() {
        return this.prhSepPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhSepReal(BigDecimal prhSepReal) {
        this.prhSepReal = prhSepReal;
    }

    public BigDecimal getPrhSepReal() {
        return this.prhSepReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhOctPres(BigDecimal prhOctPres) {
        this.prhOctPres = prhOctPres;
    }

    public BigDecimal getPrhOctPres() {
        return this.prhOctPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhOctReal(BigDecimal prhOctReal) {
        this.prhOctReal = prhOctReal;
    }

    public BigDecimal getPrhOctReal() {
        return this.prhOctReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhNovPres(BigDecimal prhNovPres) {
        this.prhNovPres = prhNovPres;
    }

    public BigDecimal getPrhNovPres() {
        return this.prhNovPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhNovReal(BigDecimal prhNovReal) {
        this.prhNovReal = prhNovReal;
    }

    public BigDecimal getPrhNovReal() {
        return this.prhNovReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhDicPres(BigDecimal prhDicPres) {
        this.prhDicPres = prhDicPres;
    }

    public BigDecimal getPrhDicPres() {
        return this.prhDicPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrhDicReal(BigDecimal prhDicReal) {
        this.prhDicReal = prhDicReal;
    }

    public BigDecimal getPrhDicReal() {
        return this.prhDicReal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrhComentario(String prhComentario) {
        this.prhComentario = prhComentario;
    }

    public String getPrhComentario() {
        return this.prhComentario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPrhAnoAltaReg(BigDecimal prhAnoAltaReg) {
        this.prhAnoAltaReg = prhAnoAltaReg;
    }

    public BigDecimal getPrhAnoAltaReg() {
        return this.prhAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrhMesAltaReg(BigDecimal prhMesAltaReg) {
        this.prhMesAltaReg = prhMesAltaReg;
    }

    public BigDecimal getPrhMesAltaReg() {
        return this.prhMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrhDiaAltaReg(BigDecimal prhDiaAltaReg) {
        this.prhDiaAltaReg = prhDiaAltaReg;
    }

    public BigDecimal getPrhDiaAltaReg() {
        return this.prhDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPrhAnoUltMod(BigDecimal prhAnoUltMod) {
        this.prhAnoUltMod = prhAnoUltMod;
    }

    public BigDecimal getPrhAnoUltMod() {
        return this.prhAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrhMesUltMod(BigDecimal prhMesUltMod) {
        this.prhMesUltMod = prhMesUltMod;
    }

    public BigDecimal getPrhMesUltMod() {
        return this.prhMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrhDiaUltMod(BigDecimal prhDiaUltMod) {
        this.prhDiaUltMod = prhDiaUltMod;
    }

    public BigDecimal getPrhDiaUltMod() {
        return this.prhDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrhCveStPreshon(String prhCveStPreshon) {
        this.prhCveStPreshon = prhCveStPreshon;
    }

    public String getPrhCveStPreshon() {
        return this.prhCveStPreshon;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PRESHONO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPrhNumContrato() != null && this.getPrhNumContrato().longValue() == -999) {
            conditions += " AND PRH_NUM_CONTRATO IS NULL";
        } else if (this.getPrhNumContrato() != null) {
            conditions += " AND PRH_NUM_CONTRATO = ?";
            values.add(this.getPrhNumContrato());
        }

        if (this.getPrhAnoRegistro() != null && this.getPrhAnoRegistro().longValue() == -999) {
            conditions += " AND PRH_ANO_REGISTRO IS NULL";
        } else if (this.getPrhAnoRegistro() != null) {
            conditions += " AND PRH_ANO_REGISTRO = ?";
            values.add(this.getPrhAnoRegistro());
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
        String sql = "SELECT * FROM PRESHONO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPrhNumContrato() != null && this.getPrhNumContrato().longValue() == -999) {
            conditions += " AND PRH_NUM_CONTRATO IS NULL";
        } else if (this.getPrhNumContrato() != null) {
            conditions += " AND PRH_NUM_CONTRATO = ?";
            values.add(this.getPrhNumContrato());
        }

        if (this.getPrhAnoRegistro() != null && this.getPrhAnoRegistro().longValue() == -999) {
            conditions += " AND PRH_ANO_REGISTRO IS NULL";
        } else if (this.getPrhAnoRegistro() != null) {
            conditions += " AND PRH_ANO_REGISTRO = ?";
            values.add(this.getPrhAnoRegistro());
        }

        if (this.getPrhTotalAno() != null && this.getPrhTotalAno().longValue() == -999) {
            conditions += " AND PRH_TOTAL_ANO IS NULL";
        } else if (this.getPrhTotalAno() != null) {
            conditions += " AND PRH_TOTAL_ANO = ?";
            values.add(this.getPrhTotalAno());
        }

        if (this.getPrhEnePres() != null && this.getPrhEnePres().longValue() == -999) {
            conditions += " AND PRH_ENE_PRES IS NULL";
        } else if (this.getPrhEnePres() != null) {
            conditions += " AND PRH_ENE_PRES = ?";
            values.add(this.getPrhEnePres());
        }

        if (this.getPrhEneReal() != null && this.getPrhEneReal().longValue() == -999) {
            conditions += " AND PRH_ENE_REAL IS NULL";
        } else if (this.getPrhEneReal() != null) {
            conditions += " AND PRH_ENE_REAL = ?";
            values.add(this.getPrhEneReal());
        }

        if (this.getPrhFebPres() != null && this.getPrhFebPres().longValue() == -999) {
            conditions += " AND PRH_FEB_PRES IS NULL";
        } else if (this.getPrhFebPres() != null) {
            conditions += " AND PRH_FEB_PRES = ?";
            values.add(this.getPrhFebPres());
        }

        if (this.getPrhFebReal() != null && this.getPrhFebReal().longValue() == -999) {
            conditions += " AND PRH_FEB_REAL IS NULL";
        } else if (this.getPrhFebReal() != null) {
            conditions += " AND PRH_FEB_REAL = ?";
            values.add(this.getPrhFebReal());
        }

        if (this.getPrhMarPres() != null && this.getPrhMarPres().longValue() == -999) {
            conditions += " AND PRH_MAR_PRES IS NULL";
        } else if (this.getPrhMarPres() != null) {
            conditions += " AND PRH_MAR_PRES = ?";
            values.add(this.getPrhMarPres());
        }

        if (this.getPrhMarReal() != null && this.getPrhMarReal().longValue() == -999) {
            conditions += " AND PRH_MAR_REAL IS NULL";
        } else if (this.getPrhMarReal() != null) {
            conditions += " AND PRH_MAR_REAL = ?";
            values.add(this.getPrhMarReal());
        }

        if (this.getPrhAbrPres() != null && this.getPrhAbrPres().longValue() == -999) {
            conditions += " AND PRH_ABR_PRES IS NULL";
        } else if (this.getPrhAbrPres() != null) {
            conditions += " AND PRH_ABR_PRES = ?";
            values.add(this.getPrhAbrPres());
        }

        if (this.getPrhAbrReal() != null && this.getPrhAbrReal().longValue() == -999) {
            conditions += " AND PRH_ABR_REAL IS NULL";
        } else if (this.getPrhAbrReal() != null) {
            conditions += " AND PRH_ABR_REAL = ?";
            values.add(this.getPrhAbrReal());
        }

        if (this.getPrhMayPres() != null && this.getPrhMayPres().longValue() == -999) {
            conditions += " AND PRH_MAY_PRES IS NULL";
        } else if (this.getPrhMayPres() != null) {
            conditions += " AND PRH_MAY_PRES = ?";
            values.add(this.getPrhMayPres());
        }

        if (this.getPrhMayReal() != null && this.getPrhMayReal().longValue() == -999) {
            conditions += " AND PRH_MAY_REAL IS NULL";
        } else if (this.getPrhMayReal() != null) {
            conditions += " AND PRH_MAY_REAL = ?";
            values.add(this.getPrhMayReal());
        }

        if (this.getPrhJunPres() != null && this.getPrhJunPres().longValue() == -999) {
            conditions += " AND PRH_JUN_PRES IS NULL";
        } else if (this.getPrhJunPres() != null) {
            conditions += " AND PRH_JUN_PRES = ?";
            values.add(this.getPrhJunPres());
        }

        if (this.getPrhJunReal() != null && this.getPrhJunReal().longValue() == -999) {
            conditions += " AND PRH_JUN_REAL IS NULL";
        } else if (this.getPrhJunReal() != null) {
            conditions += " AND PRH_JUN_REAL = ?";
            values.add(this.getPrhJunReal());
        }

        if (this.getPrhJulPres() != null && this.getPrhJulPres().longValue() == -999) {
            conditions += " AND PRH_JUL_PRES IS NULL";
        } else if (this.getPrhJulPres() != null) {
            conditions += " AND PRH_JUL_PRES = ?";
            values.add(this.getPrhJulPres());
        }

        if (this.getPrhJulReal() != null && this.getPrhJulReal().longValue() == -999) {
            conditions += " AND PRH_JUL_REAL IS NULL";
        } else if (this.getPrhJulReal() != null) {
            conditions += " AND PRH_JUL_REAL = ?";
            values.add(this.getPrhJulReal());
        }

        if (this.getPrhAgoPres() != null && this.getPrhAgoPres().longValue() == -999) {
            conditions += " AND PRH_AGO_PRES IS NULL";
        } else if (this.getPrhAgoPres() != null) {
            conditions += " AND PRH_AGO_PRES = ?";
            values.add(this.getPrhAgoPres());
        }

        if (this.getPrhAgoReal() != null && this.getPrhAgoReal().longValue() == -999) {
            conditions += " AND PRH_AGO_REAL IS NULL";
        } else if (this.getPrhAgoReal() != null) {
            conditions += " AND PRH_AGO_REAL = ?";
            values.add(this.getPrhAgoReal());
        }

        if (this.getPrhSepPres() != null && this.getPrhSepPres().longValue() == -999) {
            conditions += " AND PRH_SEP_PRES IS NULL";
        } else if (this.getPrhSepPres() != null) {
            conditions += " AND PRH_SEP_PRES = ?";
            values.add(this.getPrhSepPres());
        }

        if (this.getPrhSepReal() != null && this.getPrhSepReal().longValue() == -999) {
            conditions += " AND PRH_SEP_REAL IS NULL";
        } else if (this.getPrhSepReal() != null) {
            conditions += " AND PRH_SEP_REAL = ?";
            values.add(this.getPrhSepReal());
        }

        if (this.getPrhOctPres() != null && this.getPrhOctPres().longValue() == -999) {
            conditions += " AND PRH_OCT_PRES IS NULL";
        } else if (this.getPrhOctPres() != null) {
            conditions += " AND PRH_OCT_PRES = ?";
            values.add(this.getPrhOctPres());
        }

        if (this.getPrhOctReal() != null && this.getPrhOctReal().longValue() == -999) {
            conditions += " AND PRH_OCT_REAL IS NULL";
        } else if (this.getPrhOctReal() != null) {
            conditions += " AND PRH_OCT_REAL = ?";
            values.add(this.getPrhOctReal());
        }

        if (this.getPrhNovPres() != null && this.getPrhNovPres().longValue() == -999) {
            conditions += " AND PRH_NOV_PRES IS NULL";
        } else if (this.getPrhNovPres() != null) {
            conditions += " AND PRH_NOV_PRES = ?";
            values.add(this.getPrhNovPres());
        }

        if (this.getPrhNovReal() != null && this.getPrhNovReal().longValue() == -999) {
            conditions += " AND PRH_NOV_REAL IS NULL";
        } else if (this.getPrhNovReal() != null) {
            conditions += " AND PRH_NOV_REAL = ?";
            values.add(this.getPrhNovReal());
        }

        if (this.getPrhDicPres() != null && this.getPrhDicPres().longValue() == -999) {
            conditions += " AND PRH_DIC_PRES IS NULL";
        } else if (this.getPrhDicPres() != null) {
            conditions += " AND PRH_DIC_PRES = ?";
            values.add(this.getPrhDicPres());
        }

        if (this.getPrhDicReal() != null && this.getPrhDicReal().longValue() == -999) {
            conditions += " AND PRH_DIC_REAL IS NULL";
        } else if (this.getPrhDicReal() != null) {
            conditions += " AND PRH_DIC_REAL = ?";
            values.add(this.getPrhDicReal());
        }

        if (this.getPrhComentario() != null && "null".equals(this.getPrhComentario())) {
            conditions += " AND PRH_COMENTARIO IS NULL";
        } else if (this.getPrhComentario() != null) {
            conditions += " AND PRH_COMENTARIO = ?";
            values.add(this.getPrhComentario());
        }

        if (this.getPrhAnoAltaReg() != null && this.getPrhAnoAltaReg().longValue() == -999) {
            conditions += " AND PRH_ANO_ALTA_REG IS NULL";
        } else if (this.getPrhAnoAltaReg() != null) {
            conditions += " AND PRH_ANO_ALTA_REG = ?";
            values.add(this.getPrhAnoAltaReg());
        }

        if (this.getPrhMesAltaReg() != null && this.getPrhMesAltaReg().longValue() == -999) {
            conditions += " AND PRH_MES_ALTA_REG IS NULL";
        } else if (this.getPrhMesAltaReg() != null) {
            conditions += " AND PRH_MES_ALTA_REG = ?";
            values.add(this.getPrhMesAltaReg());
        }

        if (this.getPrhDiaAltaReg() != null && this.getPrhDiaAltaReg().longValue() == -999) {
            conditions += " AND PRH_DIA_ALTA_REG IS NULL";
        } else if (this.getPrhDiaAltaReg() != null) {
            conditions += " AND PRH_DIA_ALTA_REG = ?";
            values.add(this.getPrhDiaAltaReg());
        }

        if (this.getPrhAnoUltMod() != null && this.getPrhAnoUltMod().longValue() == -999) {
            conditions += " AND PRH_ANO_ULT_MOD IS NULL";
        } else if (this.getPrhAnoUltMod() != null) {
            conditions += " AND PRH_ANO_ULT_MOD = ?";
            values.add(this.getPrhAnoUltMod());
        }

        if (this.getPrhMesUltMod() != null && this.getPrhMesUltMod().longValue() == -999) {
            conditions += " AND PRH_MES_ULT_MOD IS NULL";
        } else if (this.getPrhMesUltMod() != null) {
            conditions += " AND PRH_MES_ULT_MOD = ?";
            values.add(this.getPrhMesUltMod());
        }

        if (this.getPrhDiaUltMod() != null && this.getPrhDiaUltMod().longValue() == -999) {
            conditions += " AND PRH_DIA_ULT_MOD IS NULL";
        } else if (this.getPrhDiaUltMod() != null) {
            conditions += " AND PRH_DIA_ULT_MOD = ?";
            values.add(this.getPrhDiaUltMod());
        }

        if (this.getPrhCveStPreshon() != null && "null".equals(this.getPrhCveStPreshon())) {
            conditions += " AND PRH_CVE_ST_PRESHON IS NULL";
        } else if (this.getPrhCveStPreshon() != null) {
            conditions += " AND PRH_CVE_ST_PRESHON = ?";
            values.add(this.getPrhCveStPreshon());
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
        String sql = "UPDATE PRESHONO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PRH_NUM_CONTRATO = ?";
        pkValues.add(this.getPrhNumContrato());
        conditions += " AND PRH_ANO_REGISTRO = ?";
        pkValues.add(this.getPrhAnoRegistro());
        fields += " PRH_TOTAL_ANO = ?, ";
        values.add(this.getPrhTotalAno());
        fields += " PRH_ENE_PRES = ?, ";
        values.add(this.getPrhEnePres());
        fields += " PRH_ENE_REAL = ?, ";
        values.add(this.getPrhEneReal());
        fields += " PRH_FEB_PRES = ?, ";
        values.add(this.getPrhFebPres());
        fields += " PRH_FEB_REAL = ?, ";
        values.add(this.getPrhFebReal());
        fields += " PRH_MAR_PRES = ?, ";
        values.add(this.getPrhMarPres());
        fields += " PRH_MAR_REAL = ?, ";
        values.add(this.getPrhMarReal());
        fields += " PRH_ABR_PRES = ?, ";
        values.add(this.getPrhAbrPres());
        fields += " PRH_ABR_REAL = ?, ";
        values.add(this.getPrhAbrReal());
        fields += " PRH_MAY_PRES = ?, ";
        values.add(this.getPrhMayPres());
        fields += " PRH_MAY_REAL = ?, ";
        values.add(this.getPrhMayReal());
        fields += " PRH_JUN_PRES = ?, ";
        values.add(this.getPrhJunPres());
        fields += " PRH_JUN_REAL = ?, ";
        values.add(this.getPrhJunReal());
        fields += " PRH_JUL_PRES = ?, ";
        values.add(this.getPrhJulPres());
        fields += " PRH_JUL_REAL = ?, ";
        values.add(this.getPrhJulReal());
        fields += " PRH_AGO_PRES = ?, ";
        values.add(this.getPrhAgoPres());
        fields += " PRH_AGO_REAL = ?, ";
        values.add(this.getPrhAgoReal());
        fields += " PRH_SEP_PRES = ?, ";
        values.add(this.getPrhSepPres());
        fields += " PRH_SEP_REAL = ?, ";
        values.add(this.getPrhSepReal());
        fields += " PRH_OCT_PRES = ?, ";
        values.add(this.getPrhOctPres());
        fields += " PRH_OCT_REAL = ?, ";
        values.add(this.getPrhOctReal());
        fields += " PRH_NOV_PRES = ?, ";
        values.add(this.getPrhNovPres());
        fields += " PRH_NOV_REAL = ?, ";
        values.add(this.getPrhNovReal());
        fields += " PRH_DIC_PRES = ?, ";
        values.add(this.getPrhDicPres());
        fields += " PRH_DIC_REAL = ?, ";
        values.add(this.getPrhDicReal());
        fields += " PRH_COMENTARIO = ?, ";
        values.add(this.getPrhComentario());
        fields += " PRH_ANO_ALTA_REG = ?, ";
        values.add(this.getPrhAnoAltaReg());
        fields += " PRH_MES_ALTA_REG = ?, ";
        values.add(this.getPrhMesAltaReg());
        fields += " PRH_DIA_ALTA_REG = ?, ";
        values.add(this.getPrhDiaAltaReg());
        fields += " PRH_ANO_ULT_MOD = ?, ";
        values.add(this.getPrhAnoUltMod());
        fields += " PRH_MES_ULT_MOD = ?, ";
        values.add(this.getPrhMesUltMod());
        fields += " PRH_DIA_ULT_MOD = ?, ";
        values.add(this.getPrhDiaUltMod());
        fields += " PRH_CVE_ST_PRESHON = ?, ";
        values.add(this.getPrhCveStPreshon());
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
        String sql = "INSERT INTO PRESHONO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PRH_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPrhNumContrato());

        fields += ", PRH_ANO_REGISTRO";
        fieldValues += ", ?";
        values.add(this.getPrhAnoRegistro());

        fields += ", PRH_TOTAL_ANO";
        fieldValues += ", ?";
        values.add(this.getPrhTotalAno());

        fields += ", PRH_ENE_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhEnePres());

        fields += ", PRH_ENE_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhEneReal());

        fields += ", PRH_FEB_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhFebPres());

        fields += ", PRH_FEB_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhFebReal());

        fields += ", PRH_MAR_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhMarPres());

        fields += ", PRH_MAR_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhMarReal());

        fields += ", PRH_ABR_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhAbrPres());

        fields += ", PRH_ABR_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhAbrReal());

        fields += ", PRH_MAY_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhMayPres());

        fields += ", PRH_MAY_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhMayReal());

        fields += ", PRH_JUN_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhJunPres());

        fields += ", PRH_JUN_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhJunReal());

        fields += ", PRH_JUL_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhJulPres());

        fields += ", PRH_JUL_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhJulReal());

        fields += ", PRH_AGO_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhAgoPres());

        fields += ", PRH_AGO_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhAgoReal());

        fields += ", PRH_SEP_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhSepPres());

        fields += ", PRH_SEP_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhSepReal());

        fields += ", PRH_OCT_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhOctPres());

        fields += ", PRH_OCT_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhOctReal());

        fields += ", PRH_NOV_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhNovPres());

        fields += ", PRH_NOV_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhNovReal());

        fields += ", PRH_DIC_PRES";
        fieldValues += ", ?";
        values.add(this.getPrhDicPres());

        fields += ", PRH_DIC_REAL";
        fieldValues += ", ?";
        values.add(this.getPrhDicReal());

        fields += ", PRH_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getPrhComentario());

        fields += ", PRH_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPrhAnoAltaReg());

        fields += ", PRH_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPrhMesAltaReg());

        fields += ", PRH_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPrhDiaAltaReg());

        fields += ", PRH_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPrhAnoUltMod());

        fields += ", PRH_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPrhMesUltMod());

        fields += ", PRH_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPrhDiaUltMod());

        fields += ", PRH_CVE_ST_PRESHON";
        fieldValues += ", ?";
        values.add(this.getPrhCveStPreshon());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PRESHONO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PRH_NUM_CONTRATO = ?";
        values.add(this.getPrhNumContrato());
        conditions += " AND PRH_ANO_REGISTRO = ?";
        values.add(this.getPrhAnoRegistro());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Preshono instance = (Preshono) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPrhNumContrato().equals(instance.getPrhNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPrhAnoRegistro().equals(instance.getPrhAnoRegistro()))
            equalObjects = false;
        if (equalObjects && !this.getPrhTotalAno().equals(instance.getPrhTotalAno()))
            equalObjects = false;
        if (equalObjects && !this.getPrhEnePres().equals(instance.getPrhEnePres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhEneReal().equals(instance.getPrhEneReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhFebPres().equals(instance.getPrhFebPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhFebReal().equals(instance.getPrhFebReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhMarPres().equals(instance.getPrhMarPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhMarReal().equals(instance.getPrhMarReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhAbrPres().equals(instance.getPrhAbrPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhAbrReal().equals(instance.getPrhAbrReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhMayPres().equals(instance.getPrhMayPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhMayReal().equals(instance.getPrhMayReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhJunPres().equals(instance.getPrhJunPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhJunReal().equals(instance.getPrhJunReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhJulPres().equals(instance.getPrhJulPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhJulReal().equals(instance.getPrhJulReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhAgoPres().equals(instance.getPrhAgoPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhAgoReal().equals(instance.getPrhAgoReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhSepPres().equals(instance.getPrhSepPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhSepReal().equals(instance.getPrhSepReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhOctPres().equals(instance.getPrhOctPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhOctReal().equals(instance.getPrhOctReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhNovPres().equals(instance.getPrhNovPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhNovReal().equals(instance.getPrhNovReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhDicPres().equals(instance.getPrhDicPres()))
            equalObjects = false;
        if (equalObjects && !this.getPrhDicReal().equals(instance.getPrhDicReal()))
            equalObjects = false;
        if (equalObjects && !this.getPrhComentario().equals(instance.getPrhComentario()))
            equalObjects = false;
        if (equalObjects && !this.getPrhAnoAltaReg().equals(instance.getPrhAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPrhMesAltaReg().equals(instance.getPrhMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPrhDiaAltaReg().equals(instance.getPrhDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPrhAnoUltMod().equals(instance.getPrhAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPrhMesUltMod().equals(instance.getPrhMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPrhDiaUltMod().equals(instance.getPrhDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPrhCveStPreshon().equals(instance.getPrhCveStPreshon()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Preshono result = new Preshono();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPrhNumContrato((BigDecimal) objectData.getData("PRH_NUM_CONTRATO"));
        result.setPrhAnoRegistro((BigDecimal) objectData.getData("PRH_ANO_REGISTRO"));
        result.setPrhTotalAno((BigDecimal) objectData.getData("PRH_TOTAL_ANO"));
        result.setPrhEnePres((BigDecimal) objectData.getData("PRH_ENE_PRES"));
        result.setPrhEneReal((BigDecimal) objectData.getData("PRH_ENE_REAL"));
        result.setPrhFebPres((BigDecimal) objectData.getData("PRH_FEB_PRES"));
        result.setPrhFebReal((BigDecimal) objectData.getData("PRH_FEB_REAL"));
        result.setPrhMarPres((BigDecimal) objectData.getData("PRH_MAR_PRES"));
        result.setPrhMarReal((BigDecimal) objectData.getData("PRH_MAR_REAL"));
        result.setPrhAbrPres((BigDecimal) objectData.getData("PRH_ABR_PRES"));
        result.setPrhAbrReal((BigDecimal) objectData.getData("PRH_ABR_REAL"));
        result.setPrhMayPres((BigDecimal) objectData.getData("PRH_MAY_PRES"));
        result.setPrhMayReal((BigDecimal) objectData.getData("PRH_MAY_REAL"));
        result.setPrhJunPres((BigDecimal) objectData.getData("PRH_JUN_PRES"));
        result.setPrhJunReal((BigDecimal) objectData.getData("PRH_JUN_REAL"));
        result.setPrhJulPres((BigDecimal) objectData.getData("PRH_JUL_PRES"));
        result.setPrhJulReal((BigDecimal) objectData.getData("PRH_JUL_REAL"));
        result.setPrhAgoPres((BigDecimal) objectData.getData("PRH_AGO_PRES"));
        result.setPrhAgoReal((BigDecimal) objectData.getData("PRH_AGO_REAL"));
        result.setPrhSepPres((BigDecimal) objectData.getData("PRH_SEP_PRES"));
        result.setPrhSepReal((BigDecimal) objectData.getData("PRH_SEP_REAL"));
        result.setPrhOctPres((BigDecimal) objectData.getData("PRH_OCT_PRES"));
        result.setPrhOctReal((BigDecimal) objectData.getData("PRH_OCT_REAL"));
        result.setPrhNovPres((BigDecimal) objectData.getData("PRH_NOV_PRES"));
        result.setPrhNovReal((BigDecimal) objectData.getData("PRH_NOV_REAL"));
        result.setPrhDicPres((BigDecimal) objectData.getData("PRH_DIC_PRES"));
        result.setPrhDicReal((BigDecimal) objectData.getData("PRH_DIC_REAL"));
        result.setPrhComentario((String) objectData.getData("PRH_COMENTARIO"));
        result.setPrhAnoAltaReg((BigDecimal) objectData.getData("PRH_ANO_ALTA_REG"));
        result.setPrhMesAltaReg((BigDecimal) objectData.getData("PRH_MES_ALTA_REG"));
        result.setPrhDiaAltaReg((BigDecimal) objectData.getData("PRH_DIA_ALTA_REG"));
        result.setPrhAnoUltMod((BigDecimal) objectData.getData("PRH_ANO_ULT_MOD"));
        result.setPrhMesUltMod((BigDecimal) objectData.getData("PRH_MES_ULT_MOD"));
        result.setPrhDiaUltMod((BigDecimal) objectData.getData("PRH_DIA_ULT_MOD"));
        result.setPrhCveStPreshon((String) objectData.getData("PRH_CVE_ST_PRESHON"));

        return result;

    }

}
