package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PRESAVAL_PK", columns = { "PRA_NUM_CONTRATO", "PRA_ANO_REGISTRO" }, sequences = { "MANUAL" })
public class Presaval extends DomainObject {

    BigDecimal praNumContrato = null;
    BigDecimal praAnoRegistro = null;
    BigDecimal praTotalAno = null;
    BigDecimal praEnePres = null;
    BigDecimal praEneReal = null;
    BigDecimal praFebPres = null;
    BigDecimal praFebReal = null;
    BigDecimal praMarPres = null;
    BigDecimal praMarReal = null;
    BigDecimal praAbrPres = null;
    BigDecimal praAbrReal = null;
    BigDecimal praMayPres = null;
    BigDecimal praMayReal = null;
    BigDecimal praJunPres = null;
    BigDecimal praJunReal = null;
    BigDecimal praJulPres = null;
    BigDecimal praJulReal = null;
    BigDecimal praAgoPres = null;
    BigDecimal praAgoReal = null;
    BigDecimal praSepPres = null;
    BigDecimal praSepReal = null;
    BigDecimal praOctPres = null;
    BigDecimal praOctReal = null;
    BigDecimal praNovPres = null;
    BigDecimal praNovReal = null;
    BigDecimal praDicPres = null;
    BigDecimal praDicReal = null;
    String praComentario = null;
    BigDecimal praNumNivel1 = null;
    BigDecimal praNumNivel2 = null;
    BigDecimal praNumNivel3 = null;
    BigDecimal praNumNivel4 = null;
    BigDecimal praNumNivel5 = null;
    BigDecimal praAnoAltaReg = null;
    BigDecimal praMesAltaReg = null;
    BigDecimal praDiaAltaReg = null;
    BigDecimal praAnoUltMod = null;
    BigDecimal praMesUltMod = null;
    BigDecimal praDiaUltMod = null;
    String praCveStPreshon = null;

    public Presaval() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPraNumContrato(BigDecimal praNumContrato) {
        this.praNumContrato = praNumContrato;
    }

    public BigDecimal getPraNumContrato() {
        return this.praNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPraAnoRegistro(BigDecimal praAnoRegistro) {
        this.praAnoRegistro = praAnoRegistro;
    }

    public BigDecimal getPraAnoRegistro() {
        return this.praAnoRegistro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraTotalAno(BigDecimal praTotalAno) {
        this.praTotalAno = praTotalAno;
    }

    public BigDecimal getPraTotalAno() {
        return this.praTotalAno;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraEnePres(BigDecimal praEnePres) {
        this.praEnePres = praEnePres;
    }

    public BigDecimal getPraEnePres() {
        return this.praEnePres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraEneReal(BigDecimal praEneReal) {
        this.praEneReal = praEneReal;
    }

    public BigDecimal getPraEneReal() {
        return this.praEneReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraFebPres(BigDecimal praFebPres) {
        this.praFebPres = praFebPres;
    }

    public BigDecimal getPraFebPres() {
        return this.praFebPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraFebReal(BigDecimal praFebReal) {
        this.praFebReal = praFebReal;
    }

    public BigDecimal getPraFebReal() {
        return this.praFebReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraMarPres(BigDecimal praMarPres) {
        this.praMarPres = praMarPres;
    }

    public BigDecimal getPraMarPres() {
        return this.praMarPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraMarReal(BigDecimal praMarReal) {
        this.praMarReal = praMarReal;
    }

    public BigDecimal getPraMarReal() {
        return this.praMarReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraAbrPres(BigDecimal praAbrPres) {
        this.praAbrPres = praAbrPres;
    }

    public BigDecimal getPraAbrPres() {
        return this.praAbrPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraAbrReal(BigDecimal praAbrReal) {
        this.praAbrReal = praAbrReal;
    }

    public BigDecimal getPraAbrReal() {
        return this.praAbrReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraMayPres(BigDecimal praMayPres) {
        this.praMayPres = praMayPres;
    }

    public BigDecimal getPraMayPres() {
        return this.praMayPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraMayReal(BigDecimal praMayReal) {
        this.praMayReal = praMayReal;
    }

    public BigDecimal getPraMayReal() {
        return this.praMayReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraJunPres(BigDecimal praJunPres) {
        this.praJunPres = praJunPres;
    }

    public BigDecimal getPraJunPres() {
        return this.praJunPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraJunReal(BigDecimal praJunReal) {
        this.praJunReal = praJunReal;
    }

    public BigDecimal getPraJunReal() {
        return this.praJunReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraJulPres(BigDecimal praJulPres) {
        this.praJulPres = praJulPres;
    }

    public BigDecimal getPraJulPres() {
        return this.praJulPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraJulReal(BigDecimal praJulReal) {
        this.praJulReal = praJulReal;
    }

    public BigDecimal getPraJulReal() {
        return this.praJulReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraAgoPres(BigDecimal praAgoPres) {
        this.praAgoPres = praAgoPres;
    }

    public BigDecimal getPraAgoPres() {
        return this.praAgoPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraAgoReal(BigDecimal praAgoReal) {
        this.praAgoReal = praAgoReal;
    }

    public BigDecimal getPraAgoReal() {
        return this.praAgoReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraSepPres(BigDecimal praSepPres) {
        this.praSepPres = praSepPres;
    }

    public BigDecimal getPraSepPres() {
        return this.praSepPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraSepReal(BigDecimal praSepReal) {
        this.praSepReal = praSepReal;
    }

    public BigDecimal getPraSepReal() {
        return this.praSepReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraOctPres(BigDecimal praOctPres) {
        this.praOctPres = praOctPres;
    }

    public BigDecimal getPraOctPres() {
        return this.praOctPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraOctReal(BigDecimal praOctReal) {
        this.praOctReal = praOctReal;
    }

    public BigDecimal getPraOctReal() {
        return this.praOctReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraNovPres(BigDecimal praNovPres) {
        this.praNovPres = praNovPres;
    }

    public BigDecimal getPraNovPres() {
        return this.praNovPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraNovReal(BigDecimal praNovReal) {
        this.praNovReal = praNovReal;
    }

    public BigDecimal getPraNovReal() {
        return this.praNovReal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraDicPres(BigDecimal praDicPres) {
        this.praDicPres = praDicPres;
    }

    public BigDecimal getPraDicPres() {
        return this.praDicPres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPraDicReal(BigDecimal praDicReal) {
        this.praDicReal = praDicReal;
    }

    public BigDecimal getPraDicReal() {
        return this.praDicReal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPraComentario(String praComentario) {
        this.praComentario = praComentario;
    }

    public String getPraComentario() {
        return this.praComentario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 2, javaClass = BigDecimal.class)
    public void setPraNumNivel1(BigDecimal praNumNivel1) {
        this.praNumNivel1 = praNumNivel1;
    }

    public BigDecimal getPraNumNivel1() {
        return this.praNumNivel1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 2, javaClass = BigDecimal.class)
    public void setPraNumNivel2(BigDecimal praNumNivel2) {
        this.praNumNivel2 = praNumNivel2;
    }

    public BigDecimal getPraNumNivel2() {
        return this.praNumNivel2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 2, javaClass = BigDecimal.class)
    public void setPraNumNivel3(BigDecimal praNumNivel3) {
        this.praNumNivel3 = praNumNivel3;
    }

    public BigDecimal getPraNumNivel3() {
        return this.praNumNivel3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 2, javaClass = BigDecimal.class)
    public void setPraNumNivel4(BigDecimal praNumNivel4) {
        this.praNumNivel4 = praNumNivel4;
    }

    public BigDecimal getPraNumNivel4() {
        return this.praNumNivel4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 2, javaClass = BigDecimal.class)
    public void setPraNumNivel5(BigDecimal praNumNivel5) {
        this.praNumNivel5 = praNumNivel5;
    }

    public BigDecimal getPraNumNivel5() {
        return this.praNumNivel5;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPraAnoAltaReg(BigDecimal praAnoAltaReg) {
        this.praAnoAltaReg = praAnoAltaReg;
    }

    public BigDecimal getPraAnoAltaReg() {
        return this.praAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPraMesAltaReg(BigDecimal praMesAltaReg) {
        this.praMesAltaReg = praMesAltaReg;
    }

    public BigDecimal getPraMesAltaReg() {
        return this.praMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPraDiaAltaReg(BigDecimal praDiaAltaReg) {
        this.praDiaAltaReg = praDiaAltaReg;
    }

    public BigDecimal getPraDiaAltaReg() {
        return this.praDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPraAnoUltMod(BigDecimal praAnoUltMod) {
        this.praAnoUltMod = praAnoUltMod;
    }

    public BigDecimal getPraAnoUltMod() {
        return this.praAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPraMesUltMod(BigDecimal praMesUltMod) {
        this.praMesUltMod = praMesUltMod;
    }

    public BigDecimal getPraMesUltMod() {
        return this.praMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPraDiaUltMod(BigDecimal praDiaUltMod) {
        this.praDiaUltMod = praDiaUltMod;
    }

    public BigDecimal getPraDiaUltMod() {
        return this.praDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPraCveStPreshon(String praCveStPreshon) {
        this.praCveStPreshon = praCveStPreshon;
    }

    public String getPraCveStPreshon() {
        return this.praCveStPreshon;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PRESAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPraNumContrato() != null && this.getPraNumContrato().longValue() == -999) {
            conditions += " AND PRA_NUM_CONTRATO IS NULL";
        } else if (this.getPraNumContrato() != null) {
            conditions += " AND PRA_NUM_CONTRATO = ?";
            values.add(this.getPraNumContrato());
        }

        if (this.getPraAnoRegistro() != null && this.getPraAnoRegistro().longValue() == -999) {
            conditions += " AND PRA_ANO_REGISTRO IS NULL";
        } else if (this.getPraAnoRegistro() != null) {
            conditions += " AND PRA_ANO_REGISTRO = ?";
            values.add(this.getPraAnoRegistro());
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
        String sql = "SELECT * FROM PRESAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPraNumContrato() != null && this.getPraNumContrato().longValue() == -999) {
            conditions += " AND PRA_NUM_CONTRATO IS NULL";
        } else if (this.getPraNumContrato() != null) {
            conditions += " AND PRA_NUM_CONTRATO = ?";
            values.add(this.getPraNumContrato());
        }

        if (this.getPraAnoRegistro() != null && this.getPraAnoRegistro().longValue() == -999) {
            conditions += " AND PRA_ANO_REGISTRO IS NULL";
        } else if (this.getPraAnoRegistro() != null) {
            conditions += " AND PRA_ANO_REGISTRO = ?";
            values.add(this.getPraAnoRegistro());
        }

        if (this.getPraTotalAno() != null && this.getPraTotalAno().longValue() == -999) {
            conditions += " AND PRA_TOTAL_ANO IS NULL";
        } else if (this.getPraTotalAno() != null) {
            conditions += " AND PRA_TOTAL_ANO = ?";
            values.add(this.getPraTotalAno());
        }

        if (this.getPraEnePres() != null && this.getPraEnePres().longValue() == -999) {
            conditions += " AND PRA_ENE_PRES IS NULL";
        } else if (this.getPraEnePres() != null) {
            conditions += " AND PRA_ENE_PRES = ?";
            values.add(this.getPraEnePres());
        }

        if (this.getPraEneReal() != null && this.getPraEneReal().longValue() == -999) {
            conditions += " AND PRA_ENE_REAL IS NULL";
        } else if (this.getPraEneReal() != null) {
            conditions += " AND PRA_ENE_REAL = ?";
            values.add(this.getPraEneReal());
        }

        if (this.getPraFebPres() != null && this.getPraFebPres().longValue() == -999) {
            conditions += " AND PRA_FEB_PRES IS NULL";
        } else if (this.getPraFebPres() != null) {
            conditions += " AND PRA_FEB_PRES = ?";
            values.add(this.getPraFebPres());
        }

        if (this.getPraFebReal() != null && this.getPraFebReal().longValue() == -999) {
            conditions += " AND PRA_FEB_REAL IS NULL";
        } else if (this.getPraFebReal() != null) {
            conditions += " AND PRA_FEB_REAL = ?";
            values.add(this.getPraFebReal());
        }

        if (this.getPraMarPres() != null && this.getPraMarPres().longValue() == -999) {
            conditions += " AND PRA_MAR_PRES IS NULL";
        } else if (this.getPraMarPres() != null) {
            conditions += " AND PRA_MAR_PRES = ?";
            values.add(this.getPraMarPres());
        }

        if (this.getPraMarReal() != null && this.getPraMarReal().longValue() == -999) {
            conditions += " AND PRA_MAR_REAL IS NULL";
        } else if (this.getPraMarReal() != null) {
            conditions += " AND PRA_MAR_REAL = ?";
            values.add(this.getPraMarReal());
        }

        if (this.getPraAbrPres() != null && this.getPraAbrPres().longValue() == -999) {
            conditions += " AND PRA_ABR_PRES IS NULL";
        } else if (this.getPraAbrPres() != null) {
            conditions += " AND PRA_ABR_PRES = ?";
            values.add(this.getPraAbrPres());
        }

        if (this.getPraAbrReal() != null && this.getPraAbrReal().longValue() == -999) {
            conditions += " AND PRA_ABR_REAL IS NULL";
        } else if (this.getPraAbrReal() != null) {
            conditions += " AND PRA_ABR_REAL = ?";
            values.add(this.getPraAbrReal());
        }

        if (this.getPraMayPres() != null && this.getPraMayPres().longValue() == -999) {
            conditions += " AND PRA_MAY_PRES IS NULL";
        } else if (this.getPraMayPres() != null) {
            conditions += " AND PRA_MAY_PRES = ?";
            values.add(this.getPraMayPres());
        }

        if (this.getPraMayReal() != null && this.getPraMayReal().longValue() == -999) {
            conditions += " AND PRA_MAY_REAL IS NULL";
        } else if (this.getPraMayReal() != null) {
            conditions += " AND PRA_MAY_REAL = ?";
            values.add(this.getPraMayReal());
        }

        if (this.getPraJunPres() != null && this.getPraJunPres().longValue() == -999) {
            conditions += " AND PRA_JUN_PRES IS NULL";
        } else if (this.getPraJunPres() != null) {
            conditions += " AND PRA_JUN_PRES = ?";
            values.add(this.getPraJunPres());
        }

        if (this.getPraJunReal() != null && this.getPraJunReal().longValue() == -999) {
            conditions += " AND PRA_JUN_REAL IS NULL";
        } else if (this.getPraJunReal() != null) {
            conditions += " AND PRA_JUN_REAL = ?";
            values.add(this.getPraJunReal());
        }

        if (this.getPraJulPres() != null && this.getPraJulPres().longValue() == -999) {
            conditions += " AND PRA_JUL_PRES IS NULL";
        } else if (this.getPraJulPres() != null) {
            conditions += " AND PRA_JUL_PRES = ?";
            values.add(this.getPraJulPres());
        }

        if (this.getPraJulReal() != null && this.getPraJulReal().longValue() == -999) {
            conditions += " AND PRA_JUL_REAL IS NULL";
        } else if (this.getPraJulReal() != null) {
            conditions += " AND PRA_JUL_REAL = ?";
            values.add(this.getPraJulReal());
        }

        if (this.getPraAgoPres() != null && this.getPraAgoPres().longValue() == -999) {
            conditions += " AND PRA_AGO_PRES IS NULL";
        } else if (this.getPraAgoPres() != null) {
            conditions += " AND PRA_AGO_PRES = ?";
            values.add(this.getPraAgoPres());
        }

        if (this.getPraAgoReal() != null && this.getPraAgoReal().longValue() == -999) {
            conditions += " AND PRA_AGO_REAL IS NULL";
        } else if (this.getPraAgoReal() != null) {
            conditions += " AND PRA_AGO_REAL = ?";
            values.add(this.getPraAgoReal());
        }

        if (this.getPraSepPres() != null && this.getPraSepPres().longValue() == -999) {
            conditions += " AND PRA_SEP_PRES IS NULL";
        } else if (this.getPraSepPres() != null) {
            conditions += " AND PRA_SEP_PRES = ?";
            values.add(this.getPraSepPres());
        }

        if (this.getPraSepReal() != null && this.getPraSepReal().longValue() == -999) {
            conditions += " AND PRA_SEP_REAL IS NULL";
        } else if (this.getPraSepReal() != null) {
            conditions += " AND PRA_SEP_REAL = ?";
            values.add(this.getPraSepReal());
        }

        if (this.getPraOctPres() != null && this.getPraOctPres().longValue() == -999) {
            conditions += " AND PRA_OCT_PRES IS NULL";
        } else if (this.getPraOctPres() != null) {
            conditions += " AND PRA_OCT_PRES = ?";
            values.add(this.getPraOctPres());
        }

        if (this.getPraOctReal() != null && this.getPraOctReal().longValue() == -999) {
            conditions += " AND PRA_OCT_REAL IS NULL";
        } else if (this.getPraOctReal() != null) {
            conditions += " AND PRA_OCT_REAL = ?";
            values.add(this.getPraOctReal());
        }

        if (this.getPraNovPres() != null && this.getPraNovPres().longValue() == -999) {
            conditions += " AND PRA_NOV_PRES IS NULL";
        } else if (this.getPraNovPres() != null) {
            conditions += " AND PRA_NOV_PRES = ?";
            values.add(this.getPraNovPres());
        }

        if (this.getPraNovReal() != null && this.getPraNovReal().longValue() == -999) {
            conditions += " AND PRA_NOV_REAL IS NULL";
        } else if (this.getPraNovReal() != null) {
            conditions += " AND PRA_NOV_REAL = ?";
            values.add(this.getPraNovReal());
        }

        if (this.getPraDicPres() != null && this.getPraDicPres().longValue() == -999) {
            conditions += " AND PRA_DIC_PRES IS NULL";
        } else if (this.getPraDicPres() != null) {
            conditions += " AND PRA_DIC_PRES = ?";
            values.add(this.getPraDicPres());
        }

        if (this.getPraDicReal() != null && this.getPraDicReal().longValue() == -999) {
            conditions += " AND PRA_DIC_REAL IS NULL";
        } else if (this.getPraDicReal() != null) {
            conditions += " AND PRA_DIC_REAL = ?";
            values.add(this.getPraDicReal());
        }

        if (this.getPraComentario() != null && "null".equals(this.getPraComentario())) {
            conditions += " AND PRA_COMENTARIO IS NULL";
        } else if (this.getPraComentario() != null) {
            conditions += " AND PRA_COMENTARIO = ?";
            values.add(this.getPraComentario());
        }

        if (this.getPraNumNivel1() != null && this.getPraNumNivel1().longValue() == -999) {
            conditions += " AND PRA_NUM_NIVEL1 IS NULL";
        } else if (this.getPraNumNivel1() != null) {
            conditions += " AND PRA_NUM_NIVEL1 = ?";
            values.add(this.getPraNumNivel1());
        }

        if (this.getPraNumNivel2() != null && this.getPraNumNivel2().longValue() == -999) {
            conditions += " AND PRA_NUM_NIVEL2 IS NULL";
        } else if (this.getPraNumNivel2() != null) {
            conditions += " AND PRA_NUM_NIVEL2 = ?";
            values.add(this.getPraNumNivel2());
        }

        if (this.getPraNumNivel3() != null && this.getPraNumNivel3().longValue() == -999) {
            conditions += " AND PRA_NUM_NIVEL3 IS NULL";
        } else if (this.getPraNumNivel3() != null) {
            conditions += " AND PRA_NUM_NIVEL3 = ?";
            values.add(this.getPraNumNivel3());
        }

        if (this.getPraNumNivel4() != null && this.getPraNumNivel4().longValue() == -999) {
            conditions += " AND PRA_NUM_NIVEL4 IS NULL";
        } else if (this.getPraNumNivel4() != null) {
            conditions += " AND PRA_NUM_NIVEL4 = ?";
            values.add(this.getPraNumNivel4());
        }

        if (this.getPraNumNivel5() != null && this.getPraNumNivel5().longValue() == -999) {
            conditions += " AND PRA_NUM_NIVEL5 IS NULL";
        } else if (this.getPraNumNivel5() != null) {
            conditions += " AND PRA_NUM_NIVEL5 = ?";
            values.add(this.getPraNumNivel5());
        }

        if (this.getPraAnoAltaReg() != null && this.getPraAnoAltaReg().longValue() == -999) {
            conditions += " AND PRA_ANO_ALTA_REG IS NULL";
        } else if (this.getPraAnoAltaReg() != null) {
            conditions += " AND PRA_ANO_ALTA_REG = ?";
            values.add(this.getPraAnoAltaReg());
        }

        if (this.getPraMesAltaReg() != null && this.getPraMesAltaReg().longValue() == -999) {
            conditions += " AND PRA_MES_ALTA_REG IS NULL";
        } else if (this.getPraMesAltaReg() != null) {
            conditions += " AND PRA_MES_ALTA_REG = ?";
            values.add(this.getPraMesAltaReg());
        }

        if (this.getPraDiaAltaReg() != null && this.getPraDiaAltaReg().longValue() == -999) {
            conditions += " AND PRA_DIA_ALTA_REG IS NULL";
        } else if (this.getPraDiaAltaReg() != null) {
            conditions += " AND PRA_DIA_ALTA_REG = ?";
            values.add(this.getPraDiaAltaReg());
        }

        if (this.getPraAnoUltMod() != null && this.getPraAnoUltMod().longValue() == -999) {
            conditions += " AND PRA_ANO_ULT_MOD IS NULL";
        } else if (this.getPraAnoUltMod() != null) {
            conditions += " AND PRA_ANO_ULT_MOD = ?";
            values.add(this.getPraAnoUltMod());
        }

        if (this.getPraMesUltMod() != null && this.getPraMesUltMod().longValue() == -999) {
            conditions += " AND PRA_MES_ULT_MOD IS NULL";
        } else if (this.getPraMesUltMod() != null) {
            conditions += " AND PRA_MES_ULT_MOD = ?";
            values.add(this.getPraMesUltMod());
        }

        if (this.getPraDiaUltMod() != null && this.getPraDiaUltMod().longValue() == -999) {
            conditions += " AND PRA_DIA_ULT_MOD IS NULL";
        } else if (this.getPraDiaUltMod() != null) {
            conditions += " AND PRA_DIA_ULT_MOD = ?";
            values.add(this.getPraDiaUltMod());
        }

        if (this.getPraCveStPreshon() != null && "null".equals(this.getPraCveStPreshon())) {
            conditions += " AND PRA_CVE_ST_PRESHON IS NULL";
        } else if (this.getPraCveStPreshon() != null) {
            conditions += " AND PRA_CVE_ST_PRESHON = ?";
            values.add(this.getPraCveStPreshon());
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
        String sql = "UPDATE PRESAVAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PRA_NUM_CONTRATO = ?";
        pkValues.add(this.getPraNumContrato());
        conditions += " AND PRA_ANO_REGISTRO = ?";
        pkValues.add(this.getPraAnoRegistro());
        fields += " PRA_TOTAL_ANO = ?, ";
        values.add(this.getPraTotalAno());
        fields += " PRA_ENE_PRES = ?, ";
        values.add(this.getPraEnePres());
        fields += " PRA_ENE_REAL = ?, ";
        values.add(this.getPraEneReal());
        fields += " PRA_FEB_PRES = ?, ";
        values.add(this.getPraFebPres());
        fields += " PRA_FEB_REAL = ?, ";
        values.add(this.getPraFebReal());
        fields += " PRA_MAR_PRES = ?, ";
        values.add(this.getPraMarPres());
        fields += " PRA_MAR_REAL = ?, ";
        values.add(this.getPraMarReal());
        fields += " PRA_ABR_PRES = ?, ";
        values.add(this.getPraAbrPres());
        fields += " PRA_ABR_REAL = ?, ";
        values.add(this.getPraAbrReal());
        fields += " PRA_MAY_PRES = ?, ";
        values.add(this.getPraMayPres());
        fields += " PRA_MAY_REAL = ?, ";
        values.add(this.getPraMayReal());
        fields += " PRA_JUN_PRES = ?, ";
        values.add(this.getPraJunPres());
        fields += " PRA_JUN_REAL = ?, ";
        values.add(this.getPraJunReal());
        fields += " PRA_JUL_PRES = ?, ";
        values.add(this.getPraJulPres());
        fields += " PRA_JUL_REAL = ?, ";
        values.add(this.getPraJulReal());
        fields += " PRA_AGO_PRES = ?, ";
        values.add(this.getPraAgoPres());
        fields += " PRA_AGO_REAL = ?, ";
        values.add(this.getPraAgoReal());
        fields += " PRA_SEP_PRES = ?, ";
        values.add(this.getPraSepPres());
        fields += " PRA_SEP_REAL = ?, ";
        values.add(this.getPraSepReal());
        fields += " PRA_OCT_PRES = ?, ";
        values.add(this.getPraOctPres());
        fields += " PRA_OCT_REAL = ?, ";
        values.add(this.getPraOctReal());
        fields += " PRA_NOV_PRES = ?, ";
        values.add(this.getPraNovPres());
        fields += " PRA_NOV_REAL = ?, ";
        values.add(this.getPraNovReal());
        fields += " PRA_DIC_PRES = ?, ";
        values.add(this.getPraDicPres());
        fields += " PRA_DIC_REAL = ?, ";
        values.add(this.getPraDicReal());
        fields += " PRA_COMENTARIO = ?, ";
        values.add(this.getPraComentario());
        fields += " PRA_NUM_NIVEL1 = ?, ";
        values.add(this.getPraNumNivel1());
        fields += " PRA_NUM_NIVEL2 = ?, ";
        values.add(this.getPraNumNivel2());
        fields += " PRA_NUM_NIVEL3 = ?, ";
        values.add(this.getPraNumNivel3());
        fields += " PRA_NUM_NIVEL4 = ?, ";
        values.add(this.getPraNumNivel4());
        fields += " PRA_NUM_NIVEL5 = ?, ";
        values.add(this.getPraNumNivel5());
        fields += " PRA_ANO_ALTA_REG = ?, ";
        values.add(this.getPraAnoAltaReg());
        fields += " PRA_MES_ALTA_REG = ?, ";
        values.add(this.getPraMesAltaReg());
        fields += " PRA_DIA_ALTA_REG = ?, ";
        values.add(this.getPraDiaAltaReg());
        fields += " PRA_ANO_ULT_MOD = ?, ";
        values.add(this.getPraAnoUltMod());
        fields += " PRA_MES_ULT_MOD = ?, ";
        values.add(this.getPraMesUltMod());
        fields += " PRA_DIA_ULT_MOD = ?, ";
        values.add(this.getPraDiaUltMod());
        fields += " PRA_CVE_ST_PRESHON = ?, ";
        values.add(this.getPraCveStPreshon());
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
        String sql = "INSERT INTO PRESAVAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PRA_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPraNumContrato());

        fields += ", PRA_ANO_REGISTRO";
        fieldValues += ", ?";
        values.add(this.getPraAnoRegistro());

        fields += ", PRA_TOTAL_ANO";
        fieldValues += ", ?";
        values.add(this.getPraTotalAno());

        fields += ", PRA_ENE_PRES";
        fieldValues += ", ?";
        values.add(this.getPraEnePres());

        fields += ", PRA_ENE_REAL";
        fieldValues += ", ?";
        values.add(this.getPraEneReal());

        fields += ", PRA_FEB_PRES";
        fieldValues += ", ?";
        values.add(this.getPraFebPres());

        fields += ", PRA_FEB_REAL";
        fieldValues += ", ?";
        values.add(this.getPraFebReal());

        fields += ", PRA_MAR_PRES";
        fieldValues += ", ?";
        values.add(this.getPraMarPres());

        fields += ", PRA_MAR_REAL";
        fieldValues += ", ?";
        values.add(this.getPraMarReal());

        fields += ", PRA_ABR_PRES";
        fieldValues += ", ?";
        values.add(this.getPraAbrPres());

        fields += ", PRA_ABR_REAL";
        fieldValues += ", ?";
        values.add(this.getPraAbrReal());

        fields += ", PRA_MAY_PRES";
        fieldValues += ", ?";
        values.add(this.getPraMayPres());

        fields += ", PRA_MAY_REAL";
        fieldValues += ", ?";
        values.add(this.getPraMayReal());

        fields += ", PRA_JUN_PRES";
        fieldValues += ", ?";
        values.add(this.getPraJunPres());

        fields += ", PRA_JUN_REAL";
        fieldValues += ", ?";
        values.add(this.getPraJunReal());

        fields += ", PRA_JUL_PRES";
        fieldValues += ", ?";
        values.add(this.getPraJulPres());

        fields += ", PRA_JUL_REAL";
        fieldValues += ", ?";
        values.add(this.getPraJulReal());

        fields += ", PRA_AGO_PRES";
        fieldValues += ", ?";
        values.add(this.getPraAgoPres());

        fields += ", PRA_AGO_REAL";
        fieldValues += ", ?";
        values.add(this.getPraAgoReal());

        fields += ", PRA_SEP_PRES";
        fieldValues += ", ?";
        values.add(this.getPraSepPres());

        fields += ", PRA_SEP_REAL";
        fieldValues += ", ?";
        values.add(this.getPraSepReal());

        fields += ", PRA_OCT_PRES";
        fieldValues += ", ?";
        values.add(this.getPraOctPres());

        fields += ", PRA_OCT_REAL";
        fieldValues += ", ?";
        values.add(this.getPraOctReal());

        fields += ", PRA_NOV_PRES";
        fieldValues += ", ?";
        values.add(this.getPraNovPres());

        fields += ", PRA_NOV_REAL";
        fieldValues += ", ?";
        values.add(this.getPraNovReal());

        fields += ", PRA_DIC_PRES";
        fieldValues += ", ?";
        values.add(this.getPraDicPres());

        fields += ", PRA_DIC_REAL";
        fieldValues += ", ?";
        values.add(this.getPraDicReal());

        fields += ", PRA_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getPraComentario());

        fields += ", PRA_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getPraNumNivel1());

        fields += ", PRA_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getPraNumNivel2());

        fields += ", PRA_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getPraNumNivel3());

        fields += ", PRA_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getPraNumNivel4());

        fields += ", PRA_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getPraNumNivel5());

        fields += ", PRA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPraAnoAltaReg());

        fields += ", PRA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPraMesAltaReg());

        fields += ", PRA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPraDiaAltaReg());

        fields += ", PRA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPraAnoUltMod());

        fields += ", PRA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPraMesUltMod());

        fields += ", PRA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPraDiaUltMod());

        fields += ", PRA_CVE_ST_PRESHON";
        fieldValues += ", ?";
        values.add(this.getPraCveStPreshon());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PRESAVAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PRA_NUM_CONTRATO = ?";
        values.add(this.getPraNumContrato());
        conditions += " AND PRA_ANO_REGISTRO = ?";
        values.add(this.getPraAnoRegistro());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Presaval instance = (Presaval) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPraNumContrato().equals(instance.getPraNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPraAnoRegistro().equals(instance.getPraAnoRegistro()))
            equalObjects = false;
        if (equalObjects && !this.getPraTotalAno().equals(instance.getPraTotalAno()))
            equalObjects = false;
        if (equalObjects && !this.getPraEnePres().equals(instance.getPraEnePres()))
            equalObjects = false;
        if (equalObjects && !this.getPraEneReal().equals(instance.getPraEneReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraFebPres().equals(instance.getPraFebPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraFebReal().equals(instance.getPraFebReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraMarPres().equals(instance.getPraMarPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraMarReal().equals(instance.getPraMarReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraAbrPres().equals(instance.getPraAbrPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraAbrReal().equals(instance.getPraAbrReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraMayPres().equals(instance.getPraMayPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraMayReal().equals(instance.getPraMayReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraJunPres().equals(instance.getPraJunPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraJunReal().equals(instance.getPraJunReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraJulPres().equals(instance.getPraJulPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraJulReal().equals(instance.getPraJulReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraAgoPres().equals(instance.getPraAgoPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraAgoReal().equals(instance.getPraAgoReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraSepPres().equals(instance.getPraSepPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraSepReal().equals(instance.getPraSepReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraOctPres().equals(instance.getPraOctPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraOctReal().equals(instance.getPraOctReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraNovPres().equals(instance.getPraNovPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraNovReal().equals(instance.getPraNovReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraDicPres().equals(instance.getPraDicPres()))
            equalObjects = false;
        if (equalObjects && !this.getPraDicReal().equals(instance.getPraDicReal()))
            equalObjects = false;
        if (equalObjects && !this.getPraComentario().equals(instance.getPraComentario()))
            equalObjects = false;
        if (equalObjects && !this.getPraNumNivel1().equals(instance.getPraNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getPraNumNivel2().equals(instance.getPraNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getPraNumNivel3().equals(instance.getPraNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getPraNumNivel4().equals(instance.getPraNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getPraNumNivel5().equals(instance.getPraNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getPraAnoAltaReg().equals(instance.getPraAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPraMesAltaReg().equals(instance.getPraMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPraDiaAltaReg().equals(instance.getPraDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPraAnoUltMod().equals(instance.getPraAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPraMesUltMod().equals(instance.getPraMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPraDiaUltMod().equals(instance.getPraDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPraCveStPreshon().equals(instance.getPraCveStPreshon()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Presaval result = new Presaval();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPraNumContrato((BigDecimal) objectData.getData("PRA_NUM_CONTRATO"));
        result.setPraAnoRegistro((BigDecimal) objectData.getData("PRA_ANO_REGISTRO"));
        result.setPraTotalAno((BigDecimal) objectData.getData("PRA_TOTAL_ANO"));
        result.setPraEnePres((BigDecimal) objectData.getData("PRA_ENE_PRES"));
        result.setPraEneReal((BigDecimal) objectData.getData("PRA_ENE_REAL"));
        result.setPraFebPres((BigDecimal) objectData.getData("PRA_FEB_PRES"));
        result.setPraFebReal((BigDecimal) objectData.getData("PRA_FEB_REAL"));
        result.setPraMarPres((BigDecimal) objectData.getData("PRA_MAR_PRES"));
        result.setPraMarReal((BigDecimal) objectData.getData("PRA_MAR_REAL"));
        result.setPraAbrPres((BigDecimal) objectData.getData("PRA_ABR_PRES"));
        result.setPraAbrReal((BigDecimal) objectData.getData("PRA_ABR_REAL"));
        result.setPraMayPres((BigDecimal) objectData.getData("PRA_MAY_PRES"));
        result.setPraMayReal((BigDecimal) objectData.getData("PRA_MAY_REAL"));
        result.setPraJunPres((BigDecimal) objectData.getData("PRA_JUN_PRES"));
        result.setPraJunReal((BigDecimal) objectData.getData("PRA_JUN_REAL"));
        result.setPraJulPres((BigDecimal) objectData.getData("PRA_JUL_PRES"));
        result.setPraJulReal((BigDecimal) objectData.getData("PRA_JUL_REAL"));
        result.setPraAgoPres((BigDecimal) objectData.getData("PRA_AGO_PRES"));
        result.setPraAgoReal((BigDecimal) objectData.getData("PRA_AGO_REAL"));
        result.setPraSepPres((BigDecimal) objectData.getData("PRA_SEP_PRES"));
        result.setPraSepReal((BigDecimal) objectData.getData("PRA_SEP_REAL"));
        result.setPraOctPres((BigDecimal) objectData.getData("PRA_OCT_PRES"));
        result.setPraOctReal((BigDecimal) objectData.getData("PRA_OCT_REAL"));
        result.setPraNovPres((BigDecimal) objectData.getData("PRA_NOV_PRES"));
        result.setPraNovReal((BigDecimal) objectData.getData("PRA_NOV_REAL"));
        result.setPraDicPres((BigDecimal) objectData.getData("PRA_DIC_PRES"));
        result.setPraDicReal((BigDecimal) objectData.getData("PRA_DIC_REAL"));
        result.setPraComentario((String) objectData.getData("PRA_COMENTARIO"));
        result.setPraNumNivel1((BigDecimal) objectData.getData("PRA_NUM_NIVEL1"));
        result.setPraNumNivel2((BigDecimal) objectData.getData("PRA_NUM_NIVEL2"));
        result.setPraNumNivel3((BigDecimal) objectData.getData("PRA_NUM_NIVEL3"));
        result.setPraNumNivel4((BigDecimal) objectData.getData("PRA_NUM_NIVEL4"));
        result.setPraNumNivel5((BigDecimal) objectData.getData("PRA_NUM_NIVEL5"));
        result.setPraAnoAltaReg((BigDecimal) objectData.getData("PRA_ANO_ALTA_REG"));
        result.setPraMesAltaReg((BigDecimal) objectData.getData("PRA_MES_ALTA_REG"));
        result.setPraDiaAltaReg((BigDecimal) objectData.getData("PRA_DIA_ALTA_REG"));
        result.setPraAnoUltMod((BigDecimal) objectData.getData("PRA_ANO_ULT_MOD"));
        result.setPraMesUltMod((BigDecimal) objectData.getData("PRA_MES_ULT_MOD"));
        result.setPraDiaUltMod((BigDecimal) objectData.getData("PRA_DIA_ULT_MOD"));
        result.setPraCveStPreshon((String) objectData.getData("PRA_CVE_ST_PRESHON"));

        return result;

    }

}
