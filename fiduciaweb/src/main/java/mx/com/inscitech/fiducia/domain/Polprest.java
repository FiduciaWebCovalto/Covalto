package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "POLPREST_PK", columns = { "PLP_NUM_CONTRATO", "PLP_CVE_TIPO_PREST", "PLP_NUM_SEC_POLIT" }, sequences = { "MANUAL" })
public class Polprest extends DomainObject {

    BigDecimal plpNumContrato = null;
    String plpCveTipoPrest = null;
    BigDecimal plpNumSecPolit = null;
    BigDecimal plpCveAutComite = null;
    BigDecimal plpCvePrestVig = null;
    String plpCvePerPago = null;
    BigDecimal plpCvePagAdel = null;
    BigDecimal plpCveGarantia = null;
    BigDecimal plpPjeSinGarant = null;
    BigDecimal plpImpMaxPrest = null;
    BigDecimal plpImpMinPrest = null;
    BigDecimal plpNumPagos = null;
    BigDecimal plpPjeTasaInter = null;
    BigDecimal plpCveMoratorios = null;
    BigDecimal plpPjeTasaMorat = null;
    BigDecimal plpNumAnosAntig = null;
    BigDecimal plpImpRango1Sal = null;
    BigDecimal plpImpRango2Sal = null;
    BigDecimal plpNumVecesSal = null;
    String plpTabulador1 = null;
    String plpTabulador2 = null;
    BigDecimal plpPjeAportacion = null;
    BigDecimal plpMesAltaReg = null;
    BigDecimal plpDiaAltaReg = null;
    BigDecimal plpAnoUltMod = null;
    BigDecimal plpMesUltMod = null;
    BigDecimal plpDiaUltMod = null;
    String plpCveStPolpres = null;

    public Polprest() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlpNumContrato(BigDecimal plpNumContrato) {
        this.plpNumContrato = plpNumContrato;
    }

    public BigDecimal getPlpNumContrato() {
        return this.plpNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlpCveTipoPrest(String plpCveTipoPrest) {
        this.plpCveTipoPrest = plpCveTipoPrest;
    }

    public String getPlpCveTipoPrest() {
        return this.plpCveTipoPrest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlpNumSecPolit(BigDecimal plpNumSecPolit) {
        this.plpNumSecPolit = plpNumSecPolit;
    }

    public BigDecimal getPlpNumSecPolit() {
        return this.plpNumSecPolit;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlpCveAutComite(BigDecimal plpCveAutComite) {
        this.plpCveAutComite = plpCveAutComite;
    }

    public BigDecimal getPlpCveAutComite() {
        return this.plpCveAutComite;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlpCvePrestVig(BigDecimal plpCvePrestVig) {
        this.plpCvePrestVig = plpCvePrestVig;
    }

    public BigDecimal getPlpCvePrestVig() {
        return this.plpCvePrestVig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlpCvePerPago(String plpCvePerPago) {
        this.plpCvePerPago = plpCvePerPago;
    }

    public String getPlpCvePerPago() {
        return this.plpCvePerPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlpCvePagAdel(BigDecimal plpCvePagAdel) {
        this.plpCvePagAdel = plpCvePagAdel;
    }

    public BigDecimal getPlpCvePagAdel() {
        return this.plpCvePagAdel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlpCveGarantia(BigDecimal plpCveGarantia) {
        this.plpCveGarantia = plpCveGarantia;
    }

    public BigDecimal getPlpCveGarantia() {
        return this.plpCveGarantia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setPlpPjeSinGarant(BigDecimal plpPjeSinGarant) {
        this.plpPjeSinGarant = plpPjeSinGarant;
    }

    public BigDecimal getPlpPjeSinGarant() {
        return this.plpPjeSinGarant;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPlpImpMaxPrest(BigDecimal plpImpMaxPrest) {
        this.plpImpMaxPrest = plpImpMaxPrest;
    }

    public BigDecimal getPlpImpMaxPrest() {
        return this.plpImpMaxPrest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPlpImpMinPrest(BigDecimal plpImpMinPrest) {
        this.plpImpMinPrest = plpImpMinPrest;
    }

    public BigDecimal getPlpImpMinPrest() {
        return this.plpImpMinPrest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlpNumPagos(BigDecimal plpNumPagos) {
        this.plpNumPagos = plpNumPagos;
    }

    public BigDecimal getPlpNumPagos() {
        return this.plpNumPagos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setPlpPjeTasaInter(BigDecimal plpPjeTasaInter) {
        this.plpPjeTasaInter = plpPjeTasaInter;
    }

    public BigDecimal getPlpPjeTasaInter() {
        return this.plpPjeTasaInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlpCveMoratorios(BigDecimal plpCveMoratorios) {
        this.plpCveMoratorios = plpCveMoratorios;
    }

    public BigDecimal getPlpCveMoratorios() {
        return this.plpCveMoratorios;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setPlpPjeTasaMorat(BigDecimal plpPjeTasaMorat) {
        this.plpPjeTasaMorat = plpPjeTasaMorat;
    }

    public BigDecimal getPlpPjeTasaMorat() {
        return this.plpPjeTasaMorat;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlpNumAnosAntig(BigDecimal plpNumAnosAntig) {
        this.plpNumAnosAntig = plpNumAnosAntig;
    }

    public BigDecimal getPlpNumAnosAntig() {
        return this.plpNumAnosAntig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPlpImpRango1Sal(BigDecimal plpImpRango1Sal) {
        this.plpImpRango1Sal = plpImpRango1Sal;
    }

    public BigDecimal getPlpImpRango1Sal() {
        return this.plpImpRango1Sal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPlpImpRango2Sal(BigDecimal plpImpRango2Sal) {
        this.plpImpRango2Sal = plpImpRango2Sal;
    }

    public BigDecimal getPlpImpRango2Sal() {
        return this.plpImpRango2Sal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPlpNumVecesSal(BigDecimal plpNumVecesSal) {
        this.plpNumVecesSal = plpNumVecesSal;
    }

    public BigDecimal getPlpNumVecesSal() {
        return this.plpNumVecesSal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlpTabulador1(String plpTabulador1) {
        this.plpTabulador1 = plpTabulador1;
    }

    public String getPlpTabulador1() {
        return this.plpTabulador1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlpTabulador2(String plpTabulador2) {
        this.plpTabulador2 = plpTabulador2;
    }

    public String getPlpTabulador2() {
        return this.plpTabulador2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setPlpPjeAportacion(BigDecimal plpPjeAportacion) {
        this.plpPjeAportacion = plpPjeAportacion;
    }

    public BigDecimal getPlpPjeAportacion() {
        return this.plpPjeAportacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlpMesAltaReg(BigDecimal plpMesAltaReg) {
        this.plpMesAltaReg = plpMesAltaReg;
    }

    public BigDecimal getPlpMesAltaReg() {
        return this.plpMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlpDiaAltaReg(BigDecimal plpDiaAltaReg) {
        this.plpDiaAltaReg = plpDiaAltaReg;
    }

    public BigDecimal getPlpDiaAltaReg() {
        return this.plpDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPlpAnoUltMod(BigDecimal plpAnoUltMod) {
        this.plpAnoUltMod = plpAnoUltMod;
    }

    public BigDecimal getPlpAnoUltMod() {
        return this.plpAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlpMesUltMod(BigDecimal plpMesUltMod) {
        this.plpMesUltMod = plpMesUltMod;
    }

    public BigDecimal getPlpMesUltMod() {
        return this.plpMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPlpDiaUltMod(BigDecimal plpDiaUltMod) {
        this.plpDiaUltMod = plpDiaUltMod;
    }

    public BigDecimal getPlpDiaUltMod() {
        return this.plpDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPlpCveStPolpres(String plpCveStPolpres) {
        this.plpCveStPolpres = plpCveStPolpres;
    }

    public String getPlpCveStPolpres() {
        return this.plpCveStPolpres;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM POLPREST ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPlpNumContrato() != null && this.getPlpNumContrato().longValue() == -999) {
            conditions += " AND PLP_NUM_CONTRATO IS NULL";
        } else if (this.getPlpNumContrato() != null) {
            conditions += " AND PLP_NUM_CONTRATO = ?";
            values.add(this.getPlpNumContrato());
        }

        if (this.getPlpCveTipoPrest() != null && "null".equals(this.getPlpCveTipoPrest())) {
            conditions += " AND PLP_CVE_TIPO_PREST IS NULL";
        } else if (this.getPlpCveTipoPrest() != null) {
            conditions += " AND PLP_CVE_TIPO_PREST = ?";
            values.add(this.getPlpCveTipoPrest());
        }

        if (this.getPlpNumSecPolit() != null && this.getPlpNumSecPolit().longValue() == -999) {
            conditions += " AND PLP_NUM_SEC_POLIT IS NULL";
        } else if (this.getPlpNumSecPolit() != null) {
            conditions += " AND PLP_NUM_SEC_POLIT = ?";
            values.add(this.getPlpNumSecPolit());
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
        String sql = "SELECT * FROM POLPREST ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPlpNumContrato() != null && this.getPlpNumContrato().longValue() == -999) {
            conditions += " AND PLP_NUM_CONTRATO IS NULL";
        } else if (this.getPlpNumContrato() != null) {
            conditions += " AND PLP_NUM_CONTRATO = ?";
            values.add(this.getPlpNumContrato());
        }

        if (this.getPlpCveTipoPrest() != null && "null".equals(this.getPlpCveTipoPrest())) {
            conditions += " AND PLP_CVE_TIPO_PREST IS NULL";
        } else if (this.getPlpCveTipoPrest() != null) {
            conditions += " AND PLP_CVE_TIPO_PREST = ?";
            values.add(this.getPlpCveTipoPrest());
        }

        if (this.getPlpNumSecPolit() != null && this.getPlpNumSecPolit().longValue() == -999) {
            conditions += " AND PLP_NUM_SEC_POLIT IS NULL";
        } else if (this.getPlpNumSecPolit() != null) {
            conditions += " AND PLP_NUM_SEC_POLIT = ?";
            values.add(this.getPlpNumSecPolit());
        }

        if (this.getPlpCveAutComite() != null && this.getPlpCveAutComite().longValue() == -999) {
            conditions += " AND PLP_CVE_AUT_COMITE IS NULL";
        } else if (this.getPlpCveAutComite() != null) {
            conditions += " AND PLP_CVE_AUT_COMITE = ?";
            values.add(this.getPlpCveAutComite());
        }

        if (this.getPlpCvePrestVig() != null && this.getPlpCvePrestVig().longValue() == -999) {
            conditions += " AND PLP_CVE_PREST_VIG IS NULL";
        } else if (this.getPlpCvePrestVig() != null) {
            conditions += " AND PLP_CVE_PREST_VIG = ?";
            values.add(this.getPlpCvePrestVig());
        }

        if (this.getPlpCvePerPago() != null && "null".equals(this.getPlpCvePerPago())) {
            conditions += " AND PLP_CVE_PER_PAGO IS NULL";
        } else if (this.getPlpCvePerPago() != null) {
            conditions += " AND PLP_CVE_PER_PAGO = ?";
            values.add(this.getPlpCvePerPago());
        }

        if (this.getPlpCvePagAdel() != null && this.getPlpCvePagAdel().longValue() == -999) {
            conditions += " AND PLP_CVE_PAG_ADEL IS NULL";
        } else if (this.getPlpCvePagAdel() != null) {
            conditions += " AND PLP_CVE_PAG_ADEL = ?";
            values.add(this.getPlpCvePagAdel());
        }

        if (this.getPlpCveGarantia() != null && this.getPlpCveGarantia().longValue() == -999) {
            conditions += " AND PLP_CVE_GARANTIA IS NULL";
        } else if (this.getPlpCveGarantia() != null) {
            conditions += " AND PLP_CVE_GARANTIA = ?";
            values.add(this.getPlpCveGarantia());
        }

        if (this.getPlpPjeSinGarant() != null && this.getPlpPjeSinGarant().longValue() == -999) {
            conditions += " AND PLP_PJE_SIN_GARANT IS NULL";
        } else if (this.getPlpPjeSinGarant() != null) {
            conditions += " AND PLP_PJE_SIN_GARANT = ?";
            values.add(this.getPlpPjeSinGarant());
        }

        if (this.getPlpImpMaxPrest() != null && this.getPlpImpMaxPrest().longValue() == -999) {
            conditions += " AND PLP_IMP_MAX_PREST IS NULL";
        } else if (this.getPlpImpMaxPrest() != null) {
            conditions += " AND PLP_IMP_MAX_PREST = ?";
            values.add(this.getPlpImpMaxPrest());
        }

        if (this.getPlpImpMinPrest() != null && this.getPlpImpMinPrest().longValue() == -999) {
            conditions += " AND PLP_IMP_MIN_PREST IS NULL";
        } else if (this.getPlpImpMinPrest() != null) {
            conditions += " AND PLP_IMP_MIN_PREST = ?";
            values.add(this.getPlpImpMinPrest());
        }

        if (this.getPlpNumPagos() != null && this.getPlpNumPagos().longValue() == -999) {
            conditions += " AND PLP_NUM_PAGOS IS NULL";
        } else if (this.getPlpNumPagos() != null) {
            conditions += " AND PLP_NUM_PAGOS = ?";
            values.add(this.getPlpNumPagos());
        }

        if (this.getPlpPjeTasaInter() != null && this.getPlpPjeTasaInter().longValue() == -999) {
            conditions += " AND PLP_PJE_TASA_INTER IS NULL";
        } else if (this.getPlpPjeTasaInter() != null) {
            conditions += " AND PLP_PJE_TASA_INTER = ?";
            values.add(this.getPlpPjeTasaInter());
        }

        if (this.getPlpCveMoratorios() != null && this.getPlpCveMoratorios().longValue() == -999) {
            conditions += " AND PLP_CVE_MORATORIOS IS NULL";
        } else if (this.getPlpCveMoratorios() != null) {
            conditions += " AND PLP_CVE_MORATORIOS = ?";
            values.add(this.getPlpCveMoratorios());
        }

        if (this.getPlpPjeTasaMorat() != null && this.getPlpPjeTasaMorat().longValue() == -999) {
            conditions += " AND PLP_PJE_TASA_MORAT IS NULL";
        } else if (this.getPlpPjeTasaMorat() != null) {
            conditions += " AND PLP_PJE_TASA_MORAT = ?";
            values.add(this.getPlpPjeTasaMorat());
        }

        if (this.getPlpNumAnosAntig() != null && this.getPlpNumAnosAntig().longValue() == -999) {
            conditions += " AND PLP_NUM_ANOS_ANTIG IS NULL";
        } else if (this.getPlpNumAnosAntig() != null) {
            conditions += " AND PLP_NUM_ANOS_ANTIG = ?";
            values.add(this.getPlpNumAnosAntig());
        }

        if (this.getPlpImpRango1Sal() != null && this.getPlpImpRango1Sal().longValue() == -999) {
            conditions += " AND PLP_IMP_RANGO1_SAL IS NULL";
        } else if (this.getPlpImpRango1Sal() != null) {
            conditions += " AND PLP_IMP_RANGO1_SAL = ?";
            values.add(this.getPlpImpRango1Sal());
        }

        if (this.getPlpImpRango2Sal() != null && this.getPlpImpRango2Sal().longValue() == -999) {
            conditions += " AND PLP_IMP_RANGO2_SAL IS NULL";
        } else if (this.getPlpImpRango2Sal() != null) {
            conditions += " AND PLP_IMP_RANGO2_SAL = ?";
            values.add(this.getPlpImpRango2Sal());
        }

        if (this.getPlpNumVecesSal() != null && this.getPlpNumVecesSal().longValue() == -999) {
            conditions += " AND PLP_NUM_VECES_SAL IS NULL";
        } else if (this.getPlpNumVecesSal() != null) {
            conditions += " AND PLP_NUM_VECES_SAL = ?";
            values.add(this.getPlpNumVecesSal());
        }

        if (this.getPlpTabulador1() != null && "null".equals(this.getPlpTabulador1())) {
            conditions += " AND PLP_TABULADOR1 IS NULL";
        } else if (this.getPlpTabulador1() != null) {
            conditions += " AND PLP_TABULADOR1 = ?";
            values.add(this.getPlpTabulador1());
        }

        if (this.getPlpTabulador2() != null && "null".equals(this.getPlpTabulador2())) {
            conditions += " AND PLP_TABULADOR2 IS NULL";
        } else if (this.getPlpTabulador2() != null) {
            conditions += " AND PLP_TABULADOR2 = ?";
            values.add(this.getPlpTabulador2());
        }

        if (this.getPlpPjeAportacion() != null && this.getPlpPjeAportacion().longValue() == -999) {
            conditions += " AND PLP_PJE_APORTACION IS NULL";
        } else if (this.getPlpPjeAportacion() != null) {
            conditions += " AND PLP_PJE_APORTACION = ?";
            values.add(this.getPlpPjeAportacion());
        }

        if (this.getPlpMesAltaReg() != null && this.getPlpMesAltaReg().longValue() == -999) {
            conditions += " AND PLP_MES_ALTA_REG IS NULL";
        } else if (this.getPlpMesAltaReg() != null) {
            conditions += " AND PLP_MES_ALTA_REG = ?";
            values.add(this.getPlpMesAltaReg());
        }

        if (this.getPlpDiaAltaReg() != null && this.getPlpDiaAltaReg().longValue() == -999) {
            conditions += " AND PLP_DIA_ALTA_REG IS NULL";
        } else if (this.getPlpDiaAltaReg() != null) {
            conditions += " AND PLP_DIA_ALTA_REG = ?";
            values.add(this.getPlpDiaAltaReg());
        }

        if (this.getPlpAnoUltMod() != null && this.getPlpAnoUltMod().longValue() == -999) {
            conditions += " AND PLP_ANO_ULT_MOD IS NULL";
        } else if (this.getPlpAnoUltMod() != null) {
            conditions += " AND PLP_ANO_ULT_MOD = ?";
            values.add(this.getPlpAnoUltMod());
        }

        if (this.getPlpMesUltMod() != null && this.getPlpMesUltMod().longValue() == -999) {
            conditions += " AND PLP_MES_ULT_MOD IS NULL";
        } else if (this.getPlpMesUltMod() != null) {
            conditions += " AND PLP_MES_ULT_MOD = ?";
            values.add(this.getPlpMesUltMod());
        }

        if (this.getPlpDiaUltMod() != null && this.getPlpDiaUltMod().longValue() == -999) {
            conditions += " AND PLP_DIA_ULT_MOD IS NULL";
        } else if (this.getPlpDiaUltMod() != null) {
            conditions += " AND PLP_DIA_ULT_MOD = ?";
            values.add(this.getPlpDiaUltMod());
        }

        if (this.getPlpCveStPolpres() != null && "null".equals(this.getPlpCveStPolpres())) {
            conditions += " AND PLP_CVE_ST_POLPRES IS NULL";
        } else if (this.getPlpCveStPolpres() != null) {
            conditions += " AND PLP_CVE_ST_POLPRES = ?";
            values.add(this.getPlpCveStPolpres());
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
        String sql = "UPDATE POLPREST SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PLP_NUM_CONTRATO = ?";
        pkValues.add(this.getPlpNumContrato());
        conditions += " AND PLP_CVE_TIPO_PREST = ?";
        pkValues.add(this.getPlpCveTipoPrest());
        conditions += " AND PLP_NUM_SEC_POLIT = ?";
        pkValues.add(this.getPlpNumSecPolit());
        fields += " PLP_CVE_AUT_COMITE = ?, ";
        values.add(this.getPlpCveAutComite());
        fields += " PLP_CVE_PREST_VIG = ?, ";
        values.add(this.getPlpCvePrestVig());
        fields += " PLP_CVE_PER_PAGO = ?, ";
        values.add(this.getPlpCvePerPago());
        fields += " PLP_CVE_PAG_ADEL = ?, ";
        values.add(this.getPlpCvePagAdel());
        fields += " PLP_CVE_GARANTIA = ?, ";
        values.add(this.getPlpCveGarantia());
        fields += " PLP_PJE_SIN_GARANT = ?, ";
        values.add(this.getPlpPjeSinGarant());
        fields += " PLP_IMP_MAX_PREST = ?, ";
        values.add(this.getPlpImpMaxPrest());
        fields += " PLP_IMP_MIN_PREST = ?, ";
        values.add(this.getPlpImpMinPrest());
        fields += " PLP_NUM_PAGOS = ?, ";
        values.add(this.getPlpNumPagos());
        fields += " PLP_PJE_TASA_INTER = ?, ";
        values.add(this.getPlpPjeTasaInter());
        fields += " PLP_CVE_MORATORIOS = ?, ";
        values.add(this.getPlpCveMoratorios());
        fields += " PLP_PJE_TASA_MORAT = ?, ";
        values.add(this.getPlpPjeTasaMorat());
        fields += " PLP_NUM_ANOS_ANTIG = ?, ";
        values.add(this.getPlpNumAnosAntig());
        fields += " PLP_IMP_RANGO1_SAL = ?, ";
        values.add(this.getPlpImpRango1Sal());
        fields += " PLP_IMP_RANGO2_SAL = ?, ";
        values.add(this.getPlpImpRango2Sal());
        fields += " PLP_NUM_VECES_SAL = ?, ";
        values.add(this.getPlpNumVecesSal());
        fields += " PLP_TABULADOR1 = ?, ";
        values.add(this.getPlpTabulador1());
        fields += " PLP_TABULADOR2 = ?, ";
        values.add(this.getPlpTabulador2());
        fields += " PLP_PJE_APORTACION = ?, ";
        values.add(this.getPlpPjeAportacion());
        fields += " PLP_MES_ALTA_REG = ?, ";
        values.add(this.getPlpMesAltaReg());
        fields += " PLP_DIA_ALTA_REG = ?, ";
        values.add(this.getPlpDiaAltaReg());
        fields += " PLP_ANO_ULT_MOD = ?, ";
        values.add(this.getPlpAnoUltMod());
        fields += " PLP_MES_ULT_MOD = ?, ";
        values.add(this.getPlpMesUltMod());
        fields += " PLP_DIA_ULT_MOD = ?, ";
        values.add(this.getPlpDiaUltMod());
        fields += " PLP_CVE_ST_POLPRES = ?, ";
        values.add(this.getPlpCveStPolpres());
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
        String sql = "INSERT INTO POLPREST ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PLP_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPlpNumContrato());

        fields += ", PLP_CVE_TIPO_PREST";
        fieldValues += ", ?";
        values.add(this.getPlpCveTipoPrest());

        fields += ", PLP_NUM_SEC_POLIT";
        fieldValues += ", ?";
        values.add(this.getPlpNumSecPolit());

        fields += ", PLP_CVE_AUT_COMITE";
        fieldValues += ", ?";
        values.add(this.getPlpCveAutComite());

        fields += ", PLP_CVE_PREST_VIG";
        fieldValues += ", ?";
        values.add(this.getPlpCvePrestVig());

        fields += ", PLP_CVE_PER_PAGO";
        fieldValues += ", ?";
        values.add(this.getPlpCvePerPago());

        fields += ", PLP_CVE_PAG_ADEL";
        fieldValues += ", ?";
        values.add(this.getPlpCvePagAdel());

        fields += ", PLP_CVE_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getPlpCveGarantia());

        fields += ", PLP_PJE_SIN_GARANT";
        fieldValues += ", ?";
        values.add(this.getPlpPjeSinGarant());

        fields += ", PLP_IMP_MAX_PREST";
        fieldValues += ", ?";
        values.add(this.getPlpImpMaxPrest());

        fields += ", PLP_IMP_MIN_PREST";
        fieldValues += ", ?";
        values.add(this.getPlpImpMinPrest());

        fields += ", PLP_NUM_PAGOS";
        fieldValues += ", ?";
        values.add(this.getPlpNumPagos());

        fields += ", PLP_PJE_TASA_INTER";
        fieldValues += ", ?";
        values.add(this.getPlpPjeTasaInter());

        fields += ", PLP_CVE_MORATORIOS";
        fieldValues += ", ?";
        values.add(this.getPlpCveMoratorios());

        fields += ", PLP_PJE_TASA_MORAT";
        fieldValues += ", ?";
        values.add(this.getPlpPjeTasaMorat());

        fields += ", PLP_NUM_ANOS_ANTIG";
        fieldValues += ", ?";
        values.add(this.getPlpNumAnosAntig());

        fields += ", PLP_IMP_RANGO1_SAL";
        fieldValues += ", ?";
        values.add(this.getPlpImpRango1Sal());

        fields += ", PLP_IMP_RANGO2_SAL";
        fieldValues += ", ?";
        values.add(this.getPlpImpRango2Sal());

        fields += ", PLP_NUM_VECES_SAL";
        fieldValues += ", ?";
        values.add(this.getPlpNumVecesSal());

        fields += ", PLP_TABULADOR1";
        fieldValues += ", ?";
        values.add(this.getPlpTabulador1());

        fields += ", PLP_TABULADOR2";
        fieldValues += ", ?";
        values.add(this.getPlpTabulador2());

        fields += ", PLP_PJE_APORTACION";
        fieldValues += ", ?";
        values.add(this.getPlpPjeAportacion());

        fields += ", PLP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlpMesAltaReg());

        fields += ", PLP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPlpDiaAltaReg());

        fields += ", PLP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlpAnoUltMod());

        fields += ", PLP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlpMesUltMod());

        fields += ", PLP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPlpDiaUltMod());

        fields += ", PLP_CVE_ST_POLPRES";
        fieldValues += ", ?";
        values.add(this.getPlpCveStPolpres());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM POLPREST WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PLP_NUM_CONTRATO = ?";
        values.add(this.getPlpNumContrato());
        conditions += " AND PLP_CVE_TIPO_PREST = ?";
        values.add(this.getPlpCveTipoPrest());
        conditions += " AND PLP_NUM_SEC_POLIT = ?";
        values.add(this.getPlpNumSecPolit());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Polprest instance = (Polprest) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPlpNumContrato().equals(instance.getPlpNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPlpCveTipoPrest().equals(instance.getPlpCveTipoPrest()))
            equalObjects = false;
        if (equalObjects && !this.getPlpNumSecPolit().equals(instance.getPlpNumSecPolit()))
            equalObjects = false;
        if (equalObjects && !this.getPlpCveAutComite().equals(instance.getPlpCveAutComite()))
            equalObjects = false;
        if (equalObjects && !this.getPlpCvePrestVig().equals(instance.getPlpCvePrestVig()))
            equalObjects = false;
        if (equalObjects && !this.getPlpCvePerPago().equals(instance.getPlpCvePerPago()))
            equalObjects = false;
        if (equalObjects && !this.getPlpCvePagAdel().equals(instance.getPlpCvePagAdel()))
            equalObjects = false;
        if (equalObjects && !this.getPlpCveGarantia().equals(instance.getPlpCveGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getPlpPjeSinGarant().equals(instance.getPlpPjeSinGarant()))
            equalObjects = false;
        if (equalObjects && !this.getPlpImpMaxPrest().equals(instance.getPlpImpMaxPrest()))
            equalObjects = false;
        if (equalObjects && !this.getPlpImpMinPrest().equals(instance.getPlpImpMinPrest()))
            equalObjects = false;
        if (equalObjects && !this.getPlpNumPagos().equals(instance.getPlpNumPagos()))
            equalObjects = false;
        if (equalObjects && !this.getPlpPjeTasaInter().equals(instance.getPlpPjeTasaInter()))
            equalObjects = false;
        if (equalObjects && !this.getPlpCveMoratorios().equals(instance.getPlpCveMoratorios()))
            equalObjects = false;
        if (equalObjects && !this.getPlpPjeTasaMorat().equals(instance.getPlpPjeTasaMorat()))
            equalObjects = false;
        if (equalObjects && !this.getPlpNumAnosAntig().equals(instance.getPlpNumAnosAntig()))
            equalObjects = false;
        if (equalObjects && !this.getPlpImpRango1Sal().equals(instance.getPlpImpRango1Sal()))
            equalObjects = false;
        if (equalObjects && !this.getPlpImpRango2Sal().equals(instance.getPlpImpRango2Sal()))
            equalObjects = false;
        if (equalObjects && !this.getPlpNumVecesSal().equals(instance.getPlpNumVecesSal()))
            equalObjects = false;
        if (equalObjects && !this.getPlpTabulador1().equals(instance.getPlpTabulador1()))
            equalObjects = false;
        if (equalObjects && !this.getPlpTabulador2().equals(instance.getPlpTabulador2()))
            equalObjects = false;
        if (equalObjects && !this.getPlpPjeAportacion().equals(instance.getPlpPjeAportacion()))
            equalObjects = false;
        if (equalObjects && !this.getPlpMesAltaReg().equals(instance.getPlpMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlpDiaAltaReg().equals(instance.getPlpDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPlpAnoUltMod().equals(instance.getPlpAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlpMesUltMod().equals(instance.getPlpMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlpDiaUltMod().equals(instance.getPlpDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPlpCveStPolpres().equals(instance.getPlpCveStPolpres()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Polprest result = new Polprest();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPlpNumContrato((BigDecimal) objectData.getData("PLP_NUM_CONTRATO"));
        result.setPlpCveTipoPrest((String) objectData.getData("PLP_CVE_TIPO_PREST"));
        result.setPlpNumSecPolit((BigDecimal) objectData.getData("PLP_NUM_SEC_POLIT"));
        result.setPlpCveAutComite((BigDecimal) objectData.getData("PLP_CVE_AUT_COMITE"));
        result.setPlpCvePrestVig((BigDecimal) objectData.getData("PLP_CVE_PREST_VIG"));
        result.setPlpCvePerPago((String) objectData.getData("PLP_CVE_PER_PAGO"));
        result.setPlpCvePagAdel((BigDecimal) objectData.getData("PLP_CVE_PAG_ADEL"));
        result.setPlpCveGarantia((BigDecimal) objectData.getData("PLP_CVE_GARANTIA"));
        result.setPlpPjeSinGarant((BigDecimal) objectData.getData("PLP_PJE_SIN_GARANT"));
        result.setPlpImpMaxPrest((BigDecimal) objectData.getData("PLP_IMP_MAX_PREST"));
        result.setPlpImpMinPrest((BigDecimal) objectData.getData("PLP_IMP_MIN_PREST"));
        result.setPlpNumPagos((BigDecimal) objectData.getData("PLP_NUM_PAGOS"));
        result.setPlpPjeTasaInter((BigDecimal) objectData.getData("PLP_PJE_TASA_INTER"));
        result.setPlpCveMoratorios((BigDecimal) objectData.getData("PLP_CVE_MORATORIOS"));
        result.setPlpPjeTasaMorat((BigDecimal) objectData.getData("PLP_PJE_TASA_MORAT"));
        result.setPlpNumAnosAntig((BigDecimal) objectData.getData("PLP_NUM_ANOS_ANTIG"));
        result.setPlpImpRango1Sal((BigDecimal) objectData.getData("PLP_IMP_RANGO1_SAL"));
        result.setPlpImpRango2Sal((BigDecimal) objectData.getData("PLP_IMP_RANGO2_SAL"));
        result.setPlpNumVecesSal((BigDecimal) objectData.getData("PLP_NUM_VECES_SAL"));
        result.setPlpTabulador1((String) objectData.getData("PLP_TABULADOR1"));
        result.setPlpTabulador2((String) objectData.getData("PLP_TABULADOR2"));
        result.setPlpPjeAportacion((BigDecimal) objectData.getData("PLP_PJE_APORTACION"));
        result.setPlpMesAltaReg((BigDecimal) objectData.getData("PLP_MES_ALTA_REG"));
        result.setPlpDiaAltaReg((BigDecimal) objectData.getData("PLP_DIA_ALTA_REG"));
        result.setPlpAnoUltMod((BigDecimal) objectData.getData("PLP_ANO_ULT_MOD"));
        result.setPlpMesUltMod((BigDecimal) objectData.getData("PLP_MES_ULT_MOD"));
        result.setPlpDiaUltMod((BigDecimal) objectData.getData("PLP_DIA_ULT_MOD"));
        result.setPlpCveStPolpres((String) objectData.getData("PLP_CVE_ST_POLPRES"));

        return result;

    }

}
