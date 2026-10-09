package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PAG_TEN_PK", columns = { "CUP_CVE_CUPON", "CLA_DESCRIPCION", "CPO_SERIE", "CPO_ACTA_EMIS" }, sequences = { "MANUAL" })
public class PagTen extends DomainObject {

    String cpoSerie = null;
    BigDecimal cupCveCupon = null;
    BigDecimal cpoActaEmis = null;
    String claDescripcion = null;
    BigDecimal patNoDias = null;
    BigDecimal patTitColocados = null;
    BigDecimal patVnu = null;
    BigDecimal patValIniEmis = null;
    BigDecimal patTip0Cambio = null;
    BigDecimal patVna = null;
    BigDecimal patTasaBruta = null;
    BigDecimal patIsr = null;
    BigDecimal patTasaNeta = null;
    BigDecimal patCParteAlic = null;
    BigDecimal patDParteAlic = null;
    BigDecimal patCCapital = null;
    BigDecimal patDCapital = null;
    BigDecimal patPagoTenIn = null;
    BigDecimal patPagoTenCa = null;
    BigDecimal patCapitalIn = null;
    BigDecimal patCapitalCa = null;
    BigDecimal patAnoAltReg = null;
    BigDecimal patMesAltReg = null;
    BigDecimal patDiaAltReg = null;
    BigDecimal patAnoUltMod = null;
    BigDecimal patMesUltMod = null;
    BigDecimal patDiaUltMod = null;
    String patCveStPagten = null;

    public PagTen() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoSerie(String cpoSerie) {
        this.cpoSerie = cpoSerie;
    }

    public String getCpoSerie() {
        return this.cpoSerie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCupCveCupon(BigDecimal cupCveCupon) {
        this.cupCveCupon = cupCveCupon;
    }

    public BigDecimal getCupCveCupon() {
        return this.cupCveCupon;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpoActaEmis(BigDecimal cpoActaEmis) {
        this.cpoActaEmis = cpoActaEmis;
    }

    public BigDecimal getCpoActaEmis() {
        return this.cpoActaEmis;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setClaDescripcion(String claDescripcion) {
        this.claDescripcion = claDescripcion;
    }

    public String getClaDescripcion() {
        return this.claDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatNoDias(BigDecimal patNoDias) {
        this.patNoDias = patNoDias;
    }

    public BigDecimal getPatNoDias() {
        return this.patNoDias;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatTitColocados(BigDecimal patTitColocados) {
        this.patTitColocados = patTitColocados;
    }

    public BigDecimal getPatTitColocados() {
        return this.patTitColocados;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatVnu(BigDecimal patVnu) {
        this.patVnu = patVnu;
    }

    public BigDecimal getPatVnu() {
        return this.patVnu;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatValIniEmis(BigDecimal patValIniEmis) {
        this.patValIniEmis = patValIniEmis;
    }

    public BigDecimal getPatValIniEmis() {
        return this.patValIniEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatTip0Cambio(BigDecimal patTip0Cambio) {
        this.patTip0Cambio = patTip0Cambio;
    }

    public BigDecimal getPatTip0Cambio() {
        return this.patTip0Cambio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatVna(BigDecimal patVna) {
        this.patVna = patVna;
    }

    public BigDecimal getPatVna() {
        return this.patVna;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatTasaBruta(BigDecimal patTasaBruta) {
        this.patTasaBruta = patTasaBruta;
    }

    public BigDecimal getPatTasaBruta() {
        return this.patTasaBruta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatIsr(BigDecimal patIsr) {
        this.patIsr = patIsr;
    }

    public BigDecimal getPatIsr() {
        return this.patIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatTasaNeta(BigDecimal patTasaNeta) {
        this.patTasaNeta = patTasaNeta;
    }

    public BigDecimal getPatTasaNeta() {
        return this.patTasaNeta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatCParteAlic(BigDecimal patCParteAlic) {
        this.patCParteAlic = patCParteAlic;
    }

    public BigDecimal getPatCParteAlic() {
        return this.patCParteAlic;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatDParteAlic(BigDecimal patDParteAlic) {
        this.patDParteAlic = patDParteAlic;
    }

    public BigDecimal getPatDParteAlic() {
        return this.patDParteAlic;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatCCapital(BigDecimal patCCapital) {
        this.patCCapital = patCCapital;
    }

    public BigDecimal getPatCCapital() {
        return this.patCCapital;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatDCapital(BigDecimal patDCapital) {
        this.patDCapital = patDCapital;
    }

    public BigDecimal getPatDCapital() {
        return this.patDCapital;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatPagoTenIn(BigDecimal patPagoTenIn) {
        this.patPagoTenIn = patPagoTenIn;
    }

    public BigDecimal getPatPagoTenIn() {
        return this.patPagoTenIn;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatPagoTenCa(BigDecimal patPagoTenCa) {
        this.patPagoTenCa = patPagoTenCa;
    }

    public BigDecimal getPatPagoTenCa() {
        return this.patPagoTenCa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatCapitalIn(BigDecimal patCapitalIn) {
        this.patCapitalIn = patCapitalIn;
    }

    public BigDecimal getPatCapitalIn() {
        return this.patCapitalIn;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setPatCapitalCa(BigDecimal patCapitalCa) {
        this.patCapitalCa = patCapitalCa;
    }

    public BigDecimal getPatCapitalCa() {
        return this.patCapitalCa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPatAnoAltReg(BigDecimal patAnoAltReg) {
        this.patAnoAltReg = patAnoAltReg;
    }

    public BigDecimal getPatAnoAltReg() {
        return this.patAnoAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPatMesAltReg(BigDecimal patMesAltReg) {
        this.patMesAltReg = patMesAltReg;
    }

    public BigDecimal getPatMesAltReg() {
        return this.patMesAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPatDiaAltReg(BigDecimal patDiaAltReg) {
        this.patDiaAltReg = patDiaAltReg;
    }

    public BigDecimal getPatDiaAltReg() {
        return this.patDiaAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPatAnoUltMod(BigDecimal patAnoUltMod) {
        this.patAnoUltMod = patAnoUltMod;
    }

    public BigDecimal getPatAnoUltMod() {
        return this.patAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPatMesUltMod(BigDecimal patMesUltMod) {
        this.patMesUltMod = patMesUltMod;
    }

    public BigDecimal getPatMesUltMod() {
        return this.patMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPatDiaUltMod(BigDecimal patDiaUltMod) {
        this.patDiaUltMod = patDiaUltMod;
    }

    public BigDecimal getPatDiaUltMod() {
        return this.patDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatCveStPagten(String patCveStPagten) {
        this.patCveStPagten = patCveStPagten;
    }

    public String getPatCveStPagten() {
        return this.patCveStPagten;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PAG_TEN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
        }

        if (this.getCupCveCupon() != null && this.getCupCveCupon().longValue() == -999) {
            conditions += " AND CUP_CVE_CUPON IS NULL";
        } else if (this.getCupCveCupon() != null) {
            conditions += " AND CUP_CVE_CUPON = ?";
            values.add(this.getCupCveCupon());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
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
        String sql = "SELECT * FROM PAG_TEN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
        }

        if (this.getCupCveCupon() != null && this.getCupCveCupon().longValue() == -999) {
            conditions += " AND CUP_CVE_CUPON IS NULL";
        } else if (this.getCupCveCupon() != null) {
            conditions += " AND CUP_CVE_CUPON = ?";
            values.add(this.getCupCveCupon());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
        }

        if (this.getPatNoDias() != null && this.getPatNoDias().longValue() == -999) {
            conditions += " AND PAT_NO_DIAS IS NULL";
        } else if (this.getPatNoDias() != null) {
            conditions += " AND PAT_NO_DIAS = ?";
            values.add(this.getPatNoDias());
        }

        if (this.getPatTitColocados() != null && this.getPatTitColocados().longValue() == -999) {
            conditions += " AND PAT_TIT_COLOCADOS IS NULL";
        } else if (this.getPatTitColocados() != null) {
            conditions += " AND PAT_TIT_COLOCADOS = ?";
            values.add(this.getPatTitColocados());
        }

        if (this.getPatVnu() != null && this.getPatVnu().longValue() == -999) {
            conditions += " AND PAT_VNU IS NULL";
        } else if (this.getPatVnu() != null) {
            conditions += " AND PAT_VNU = ?";
            values.add(this.getPatVnu());
        }

        if (this.getPatValIniEmis() != null && this.getPatValIniEmis().longValue() == -999) {
            conditions += " AND PAT_VAL_INI_EMIS IS NULL";
        } else if (this.getPatValIniEmis() != null) {
            conditions += " AND PAT_VAL_INI_EMIS = ?";
            values.add(this.getPatValIniEmis());
        }

        if (this.getPatTip0Cambio() != null && this.getPatTip0Cambio().longValue() == -999) {
            conditions += " AND PAT_TIP0_CAMBIO IS NULL";
        } else if (this.getPatTip0Cambio() != null) {
            conditions += " AND PAT_TIP0_CAMBIO = ?";
            values.add(this.getPatTip0Cambio());
        }

        if (this.getPatVna() != null && this.getPatVna().longValue() == -999) {
            conditions += " AND PAT_VNA IS NULL";
        } else if (this.getPatVna() != null) {
            conditions += " AND PAT_VNA = ?";
            values.add(this.getPatVna());
        }

        if (this.getPatTasaBruta() != null && this.getPatTasaBruta().longValue() == -999) {
            conditions += " AND PAT_TASA_BRUTA IS NULL";
        } else if (this.getPatTasaBruta() != null) {
            conditions += " AND PAT_TASA_BRUTA = ?";
            values.add(this.getPatTasaBruta());
        }

        if (this.getPatIsr() != null && this.getPatIsr().longValue() == -999) {
            conditions += " AND PAT_ISR IS NULL";
        } else if (this.getPatIsr() != null) {
            conditions += " AND PAT_ISR = ?";
            values.add(this.getPatIsr());
        }

        if (this.getPatTasaNeta() != null && this.getPatTasaNeta().longValue() == -999) {
            conditions += " AND PAT_TASA_NETA IS NULL";
        } else if (this.getPatTasaNeta() != null) {
            conditions += " AND PAT_TASA_NETA = ?";
            values.add(this.getPatTasaNeta());
        }

        if (this.getPatCParteAlic() != null && this.getPatCParteAlic().longValue() == -999) {
            conditions += " AND PAT_C_PARTE_ALIC IS NULL";
        } else if (this.getPatCParteAlic() != null) {
            conditions += " AND PAT_C_PARTE_ALIC = ?";
            values.add(this.getPatCParteAlic());
        }

        if (this.getPatDParteAlic() != null && this.getPatDParteAlic().longValue() == -999) {
            conditions += " AND PAT_D_PARTE_ALIC IS NULL";
        } else if (this.getPatDParteAlic() != null) {
            conditions += " AND PAT_D_PARTE_ALIC = ?";
            values.add(this.getPatDParteAlic());
        }

        if (this.getPatCCapital() != null && this.getPatCCapital().longValue() == -999) {
            conditions += " AND PAT_C_CAPITAL IS NULL";
        } else if (this.getPatCCapital() != null) {
            conditions += " AND PAT_C_CAPITAL = ?";
            values.add(this.getPatCCapital());
        }

        if (this.getPatDCapital() != null && this.getPatDCapital().longValue() == -999) {
            conditions += " AND PAT_D_CAPITAL IS NULL";
        } else if (this.getPatDCapital() != null) {
            conditions += " AND PAT_D_CAPITAL = ?";
            values.add(this.getPatDCapital());
        }

        if (this.getPatPagoTenIn() != null && this.getPatPagoTenIn().longValue() == -999) {
            conditions += " AND PAT_PAGO_TEN_IN IS NULL";
        } else if (this.getPatPagoTenIn() != null) {
            conditions += " AND PAT_PAGO_TEN_IN = ?";
            values.add(this.getPatPagoTenIn());
        }

        if (this.getPatPagoTenCa() != null && this.getPatPagoTenCa().longValue() == -999) {
            conditions += " AND PAT_PAGO_TEN_CA IS NULL";
        } else if (this.getPatPagoTenCa() != null) {
            conditions += " AND PAT_PAGO_TEN_CA = ?";
            values.add(this.getPatPagoTenCa());
        }

        if (this.getPatCapitalIn() != null && this.getPatCapitalIn().longValue() == -999) {
            conditions += " AND PAT_CAPITAL_IN IS NULL";
        } else if (this.getPatCapitalIn() != null) {
            conditions += " AND PAT_CAPITAL_IN = ?";
            values.add(this.getPatCapitalIn());
        }

        if (this.getPatCapitalCa() != null && this.getPatCapitalCa().longValue() == -999) {
            conditions += " AND PAT_CAPITAL_CA IS NULL";
        } else if (this.getPatCapitalCa() != null) {
            conditions += " AND PAT_CAPITAL_CA = ?";
            values.add(this.getPatCapitalCa());
        }

        if (this.getPatAnoAltReg() != null && this.getPatAnoAltReg().longValue() == -999) {
            conditions += " AND PAT_ANO_ALT_REG IS NULL";
        } else if (this.getPatAnoAltReg() != null) {
            conditions += " AND PAT_ANO_ALT_REG = ?";
            values.add(this.getPatAnoAltReg());
        }

        if (this.getPatMesAltReg() != null && this.getPatMesAltReg().longValue() == -999) {
            conditions += " AND PAT_MES_ALT_REG IS NULL";
        } else if (this.getPatMesAltReg() != null) {
            conditions += " AND PAT_MES_ALT_REG = ?";
            values.add(this.getPatMesAltReg());
        }

        if (this.getPatDiaAltReg() != null && this.getPatDiaAltReg().longValue() == -999) {
            conditions += " AND PAT_DIA_ALT_REG IS NULL";
        } else if (this.getPatDiaAltReg() != null) {
            conditions += " AND PAT_DIA_ALT_REG = ?";
            values.add(this.getPatDiaAltReg());
        }

        if (this.getPatAnoUltMod() != null && this.getPatAnoUltMod().longValue() == -999) {
            conditions += " AND PAT_ANO_ULT_MOD IS NULL";
        } else if (this.getPatAnoUltMod() != null) {
            conditions += " AND PAT_ANO_ULT_MOD = ?";
            values.add(this.getPatAnoUltMod());
        }

        if (this.getPatMesUltMod() != null && this.getPatMesUltMod().longValue() == -999) {
            conditions += " AND PAT_MES_ULT_MOD IS NULL";
        } else if (this.getPatMesUltMod() != null) {
            conditions += " AND PAT_MES_ULT_MOD = ?";
            values.add(this.getPatMesUltMod());
        }

        if (this.getPatDiaUltMod() != null && this.getPatDiaUltMod().longValue() == -999) {
            conditions += " AND PAT_DIA_ULT_MOD IS NULL";
        } else if (this.getPatDiaUltMod() != null) {
            conditions += " AND PAT_DIA_ULT_MOD = ?";
            values.add(this.getPatDiaUltMod());
        }

        if (this.getPatCveStPagten() != null && "null".equals(this.getPatCveStPagten())) {
            conditions += " AND PAT_CVE_ST_PAGTEN IS NULL";
        } else if (this.getPatCveStPagten() != null) {
            conditions += " AND PAT_CVE_ST_PAGTEN = ?";
            values.add(this.getPatCveStPagten());
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
        String sql = "UPDATE PAG_TEN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPO_SERIE = ?";
        pkValues.add(this.getCpoSerie());
        conditions += " AND CUP_CVE_CUPON = ?";
        pkValues.add(this.getCupCveCupon());
        conditions += " AND CPO_ACTA_EMIS = ?";
        pkValues.add(this.getCpoActaEmis());
        conditions += " AND CLA_DESCRIPCION = ?";
        pkValues.add(this.getClaDescripcion());
        fields += " PAT_NO_DIAS = ?, ";
        values.add(this.getPatNoDias());
        fields += " PAT_TIT_COLOCADOS = ?, ";
        values.add(this.getPatTitColocados());
        fields += " PAT_VNU = ?, ";
        values.add(this.getPatVnu());
        fields += " PAT_VAL_INI_EMIS = ?, ";
        values.add(this.getPatValIniEmis());
        fields += " PAT_TIP0_CAMBIO = ?, ";
        values.add(this.getPatTip0Cambio());
        fields += " PAT_VNA = ?, ";
        values.add(this.getPatVna());
        fields += " PAT_TASA_BRUTA = ?, ";
        values.add(this.getPatTasaBruta());
        fields += " PAT_ISR = ?, ";
        values.add(this.getPatIsr());
        fields += " PAT_TASA_NETA = ?, ";
        values.add(this.getPatTasaNeta());
        fields += " PAT_C_PARTE_ALIC = ?, ";
        values.add(this.getPatCParteAlic());
        fields += " PAT_D_PARTE_ALIC = ?, ";
        values.add(this.getPatDParteAlic());
        fields += " PAT_C_CAPITAL = ?, ";
        values.add(this.getPatCCapital());
        fields += " PAT_D_CAPITAL = ?, ";
        values.add(this.getPatDCapital());
        fields += " PAT_PAGO_TEN_IN = ?, ";
        values.add(this.getPatPagoTenIn());
        fields += " PAT_PAGO_TEN_CA = ?, ";
        values.add(this.getPatPagoTenCa());
        fields += " PAT_CAPITAL_IN = ?, ";
        values.add(this.getPatCapitalIn());
        fields += " PAT_CAPITAL_CA = ?, ";
        values.add(this.getPatCapitalCa());
        fields += " PAT_ANO_ALT_REG = ?, ";
        values.add(this.getPatAnoAltReg());
        fields += " PAT_MES_ALT_REG = ?, ";
        values.add(this.getPatMesAltReg());
        fields += " PAT_DIA_ALT_REG = ?, ";
        values.add(this.getPatDiaAltReg());
        fields += " PAT_ANO_ULT_MOD = ?, ";
        values.add(this.getPatAnoUltMod());
        fields += " PAT_MES_ULT_MOD = ?, ";
        values.add(this.getPatMesUltMod());
        fields += " PAT_DIA_ULT_MOD = ?, ";
        values.add(this.getPatDiaUltMod());
        fields += " PAT_CVE_ST_PAGTEN = ?, ";
        values.add(this.getPatCveStPagten());
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
        String sql = "INSERT INTO PAG_TEN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPO_SERIE";
        fieldValues += ", ?";
        values.add(this.getCpoSerie());

        fields += ", CUP_CVE_CUPON";
        fieldValues += ", ?";
        values.add(this.getCupCveCupon());

        fields += ", CPO_ACTA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoActaEmis());

        fields += ", CLA_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getClaDescripcion());

        fields += ", PAT_NO_DIAS";
        fieldValues += ", ?";
        values.add(this.getPatNoDias());

        fields += ", PAT_TIT_COLOCADOS";
        fieldValues += ", ?";
        values.add(this.getPatTitColocados());

        fields += ", PAT_VNU";
        fieldValues += ", ?";
        values.add(this.getPatVnu());

        fields += ", PAT_VAL_INI_EMIS";
        fieldValues += ", ?";
        values.add(this.getPatValIniEmis());

        fields += ", PAT_TIP0_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getPatTip0Cambio());

        fields += ", PAT_VNA";
        fieldValues += ", ?";
        values.add(this.getPatVna());

        fields += ", PAT_TASA_BRUTA";
        fieldValues += ", ?";
        values.add(this.getPatTasaBruta());

        fields += ", PAT_ISR";
        fieldValues += ", ?";
        values.add(this.getPatIsr());

        fields += ", PAT_TASA_NETA";
        fieldValues += ", ?";
        values.add(this.getPatTasaNeta());

        fields += ", PAT_C_PARTE_ALIC";
        fieldValues += ", ?";
        values.add(this.getPatCParteAlic());

        fields += ", PAT_D_PARTE_ALIC";
        fieldValues += ", ?";
        values.add(this.getPatDParteAlic());

        fields += ", PAT_C_CAPITAL";
        fieldValues += ", ?";
        values.add(this.getPatCCapital());

        fields += ", PAT_D_CAPITAL";
        fieldValues += ", ?";
        values.add(this.getPatDCapital());

        fields += ", PAT_PAGO_TEN_IN";
        fieldValues += ", ?";
        values.add(this.getPatPagoTenIn());

        fields += ", PAT_PAGO_TEN_CA";
        fieldValues += ", ?";
        values.add(this.getPatPagoTenCa());

        fields += ", PAT_CAPITAL_IN";
        fieldValues += ", ?";
        values.add(this.getPatCapitalIn());

        fields += ", PAT_CAPITAL_CA";
        fieldValues += ", ?";
        values.add(this.getPatCapitalCa());

        fields += ", PAT_ANO_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getPatAnoAltReg());

        fields += ", PAT_MES_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getPatMesAltReg());

        fields += ", PAT_DIA_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getPatDiaAltReg());

        fields += ", PAT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPatAnoUltMod());

        fields += ", PAT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPatMesUltMod());

        fields += ", PAT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPatDiaUltMod());

        fields += ", PAT_CVE_ST_PAGTEN";
        fieldValues += ", ?";
        values.add(this.getPatCveStPagten());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PAG_TEN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPO_SERIE = ?";
        values.add(this.getCpoSerie());
        conditions += " AND CUP_CVE_CUPON = ?";
        values.add(this.getCupCveCupon());
        conditions += " AND CPO_ACTA_EMIS = ?";
        values.add(this.getCpoActaEmis());
        conditions += " AND CLA_DESCRIPCION = ?";
        values.add(this.getClaDescripcion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        PagTen instance = (PagTen) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCpoSerie().equals(instance.getCpoSerie()))
            equalObjects = false;
        if (equalObjects && !this.getCupCveCupon().equals(instance.getCupCveCupon()))
            equalObjects = false;
        if (equalObjects && !this.getCpoActaEmis().equals(instance.getCpoActaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getClaDescripcion().equals(instance.getClaDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getPatNoDias().equals(instance.getPatNoDias()))
            equalObjects = false;
        if (equalObjects && !this.getPatTitColocados().equals(instance.getPatTitColocados()))
            equalObjects = false;
        if (equalObjects && !this.getPatVnu().equals(instance.getPatVnu()))
            equalObjects = false;
        if (equalObjects && !this.getPatValIniEmis().equals(instance.getPatValIniEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPatTip0Cambio().equals(instance.getPatTip0Cambio()))
            equalObjects = false;
        if (equalObjects && !this.getPatVna().equals(instance.getPatVna()))
            equalObjects = false;
        if (equalObjects && !this.getPatTasaBruta().equals(instance.getPatTasaBruta()))
            equalObjects = false;
        if (equalObjects && !this.getPatIsr().equals(instance.getPatIsr()))
            equalObjects = false;
        if (equalObjects && !this.getPatTasaNeta().equals(instance.getPatTasaNeta()))
            equalObjects = false;
        if (equalObjects && !this.getPatCParteAlic().equals(instance.getPatCParteAlic()))
            equalObjects = false;
        if (equalObjects && !this.getPatDParteAlic().equals(instance.getPatDParteAlic()))
            equalObjects = false;
        if (equalObjects && !this.getPatCCapital().equals(instance.getPatCCapital()))
            equalObjects = false;
        if (equalObjects && !this.getPatDCapital().equals(instance.getPatDCapital()))
            equalObjects = false;
        if (equalObjects && !this.getPatPagoTenIn().equals(instance.getPatPagoTenIn()))
            equalObjects = false;
        if (equalObjects && !this.getPatPagoTenCa().equals(instance.getPatPagoTenCa()))
            equalObjects = false;
        if (equalObjects && !this.getPatCapitalIn().equals(instance.getPatCapitalIn()))
            equalObjects = false;
        if (equalObjects && !this.getPatCapitalCa().equals(instance.getPatCapitalCa()))
            equalObjects = false;
        if (equalObjects && !this.getPatAnoAltReg().equals(instance.getPatAnoAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getPatMesAltReg().equals(instance.getPatMesAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getPatDiaAltReg().equals(instance.getPatDiaAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getPatAnoUltMod().equals(instance.getPatAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPatMesUltMod().equals(instance.getPatMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPatDiaUltMod().equals(instance.getPatDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPatCveStPagten().equals(instance.getPatCveStPagten()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        PagTen result = new PagTen();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCpoSerie((String) objectData.getData("CPO_SERIE"));
        result.setCupCveCupon((BigDecimal) objectData.getData("CUP_CVE_CUPON"));
        result.setCpoActaEmis((BigDecimal) objectData.getData("CPO_ACTA_EMIS"));
        result.setClaDescripcion((String) objectData.getData("CLA_DESCRIPCION"));
        result.setPatNoDias((BigDecimal) objectData.getData("PAT_NO_DIAS"));
        result.setPatTitColocados((BigDecimal) objectData.getData("PAT_TIT_COLOCADOS"));
        result.setPatVnu((BigDecimal) objectData.getData("PAT_VNU"));
        result.setPatValIniEmis((BigDecimal) objectData.getData("PAT_VAL_INI_EMIS"));
        result.setPatTip0Cambio((BigDecimal) objectData.getData("PAT_TIP0_CAMBIO"));
        result.setPatVna((BigDecimal) objectData.getData("PAT_VNA"));
        result.setPatTasaBruta((BigDecimal) objectData.getData("PAT_TASA_BRUTA"));
        result.setPatIsr((BigDecimal) objectData.getData("PAT_ISR"));
        result.setPatTasaNeta((BigDecimal) objectData.getData("PAT_TASA_NETA"));
        result.setPatCParteAlic((BigDecimal) objectData.getData("PAT_C_PARTE_ALIC"));
        result.setPatDParteAlic((BigDecimal) objectData.getData("PAT_D_PARTE_ALIC"));
        result.setPatCCapital((BigDecimal) objectData.getData("PAT_C_CAPITAL"));
        result.setPatDCapital((BigDecimal) objectData.getData("PAT_D_CAPITAL"));
        result.setPatPagoTenIn((BigDecimal) objectData.getData("PAT_PAGO_TEN_IN"));
        result.setPatPagoTenCa((BigDecimal) objectData.getData("PAT_PAGO_TEN_CA"));
        result.setPatCapitalIn((BigDecimal) objectData.getData("PAT_CAPITAL_IN"));
        result.setPatCapitalCa((BigDecimal) objectData.getData("PAT_CAPITAL_CA"));
        result.setPatAnoAltReg((BigDecimal) objectData.getData("PAT_ANO_ALT_REG"));
        result.setPatMesAltReg((BigDecimal) objectData.getData("PAT_MES_ALT_REG"));
        result.setPatDiaAltReg((BigDecimal) objectData.getData("PAT_DIA_ALT_REG"));
        result.setPatAnoUltMod((BigDecimal) objectData.getData("PAT_ANO_ULT_MOD"));
        result.setPatMesUltMod((BigDecimal) objectData.getData("PAT_MES_ULT_MOD"));
        result.setPatDiaUltMod((BigDecimal) objectData.getData("PAT_DIA_ULT_MOD"));
        result.setPatCveStPagten((String) objectData.getData("PAT_CVE_ST_PAGTEN"));

        return result;

    }

}
