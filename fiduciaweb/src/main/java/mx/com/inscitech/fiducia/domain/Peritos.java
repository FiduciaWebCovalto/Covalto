package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PERITOS_PK", columns = { "PER_NUM_PERITO" }, sequences = { "MAX" })
public class Peritos extends DomainObject {

    BigDecimal perNumPerito = null;
    String perTitulo = null;
    String perNomPerito = null;
    String perApellidoPat = null;
    String perApellidoMat = null;
    String perCurp = null;
    String perCalidad = null;
    String perOportunidad = null;
    String perInteExteFunc = null;
    String perCalleNum = null;
    String perNomColonia = null;
    String perNomPoblacion = null;
    String perCodigoPostal = null;
    BigDecimal perNumEstado = null;
    BigDecimal perNumPais = null;
    String perNumLadaOfic = null;
    String perNumTelefOfic = null;
    String perNumExtOfic = null;
    String perNumLadaOfic2 = null;
    String perNumTelefOfic2 = null;
    String perNumExtOfic2 = null;
    String perNumLadaFax = null;
    String perNumTelefFax = null;
    String perNumExtFax = null;
    BigDecimal perPromoPerito = null;
    BigDecimal perPromoBanco = null;
    BigDecimal perAnoAltaReg = null;
    BigDecimal perMesAltaReg = null;
    BigDecimal perDiaAltaReg = null;
    BigDecimal perAnoUltMod = null;
    BigDecimal perMesUltMod = null;
    BigDecimal perDiaUltMod = null;
    String perNumContrato = null;
    String perContVence = null;
    String perCveStPerito = null;

    public Peritos() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumPerito(BigDecimal perNumPerito) {
        this.perNumPerito = perNumPerito;
    }

    public BigDecimal getPerNumPerito() {
        return this.perNumPerito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerTitulo(String perTitulo) {
        this.perTitulo = perTitulo;
    }

    public String getPerTitulo() {
        return this.perTitulo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNomPerito(String perNomPerito) {
        this.perNomPerito = perNomPerito;
    }

    public String getPerNomPerito() {
        return this.perNomPerito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerApellidoPat(String perApellidoPat) {
        this.perApellidoPat = perApellidoPat;
    }

    public String getPerApellidoPat() {
        return this.perApellidoPat;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerApellidoMat(String perApellidoMat) {
        this.perApellidoMat = perApellidoMat;
    }

    public String getPerApellidoMat() {
        return this.perApellidoMat;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerCurp(String perCurp) {
        this.perCurp = perCurp;
    }

    public String getPerCurp() {
        return this.perCurp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerCalidad(String perCalidad) {
        this.perCalidad = perCalidad;
    }

    public String getPerCalidad() {
        return this.perCalidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerOportunidad(String perOportunidad) {
        this.perOportunidad = perOportunidad;
    }

    public String getPerOportunidad() {
        return this.perOportunidad;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerInteExteFunc(String perInteExteFunc) {
        this.perInteExteFunc = perInteExteFunc;
    }

    public String getPerInteExteFunc() {
        return this.perInteExteFunc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerCalleNum(String perCalleNum) {
        this.perCalleNum = perCalleNum;
    }

    public String getPerCalleNum() {
        return this.perCalleNum;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNomColonia(String perNomColonia) {
        this.perNomColonia = perNomColonia;
    }

    public String getPerNomColonia() {
        return this.perNomColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNomPoblacion(String perNomPoblacion) {
        this.perNomPoblacion = perNomPoblacion;
    }

    public String getPerNomPoblacion() {
        return this.perNomPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerCodigoPostal(String perCodigoPostal) {
        this.perCodigoPostal = perCodigoPostal;
    }

    public String getPerCodigoPostal() {
        return this.perCodigoPostal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumEstado(BigDecimal perNumEstado) {
        this.perNumEstado = perNumEstado;
    }

    public BigDecimal getPerNumEstado() {
        return this.perNumEstado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPerNumPais(BigDecimal perNumPais) {
        this.perNumPais = perNumPais;
    }

    public BigDecimal getPerNumPais() {
        return this.perNumPais;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNumLadaOfic(String perNumLadaOfic) {
        this.perNumLadaOfic = perNumLadaOfic;
    }

    public String getPerNumLadaOfic() {
        return this.perNumLadaOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNumTelefOfic(String perNumTelefOfic) {
        this.perNumTelefOfic = perNumTelefOfic;
    }

    public String getPerNumTelefOfic() {
        return this.perNumTelefOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNumExtOfic(String perNumExtOfic) {
        this.perNumExtOfic = perNumExtOfic;
    }

    public String getPerNumExtOfic() {
        return this.perNumExtOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNumLadaOfic2(String perNumLadaOfic2) {
        this.perNumLadaOfic2 = perNumLadaOfic2;
    }

    public String getPerNumLadaOfic2() {
        return this.perNumLadaOfic2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNumTelefOfic2(String perNumTelefOfic2) {
        this.perNumTelefOfic2 = perNumTelefOfic2;
    }

    public String getPerNumTelefOfic2() {
        return this.perNumTelefOfic2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNumExtOfic2(String perNumExtOfic2) {
        this.perNumExtOfic2 = perNumExtOfic2;
    }

    public String getPerNumExtOfic2() {
        return this.perNumExtOfic2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNumLadaFax(String perNumLadaFax) {
        this.perNumLadaFax = perNumLadaFax;
    }

    public String getPerNumLadaFax() {
        return this.perNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNumTelefFax(String perNumTelefFax) {
        this.perNumTelefFax = perNumTelefFax;
    }

    public String getPerNumTelefFax() {
        return this.perNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNumExtFax(String perNumExtFax) {
        this.perNumExtFax = perNumExtFax;
    }

    public String getPerNumExtFax() {
        return this.perNumExtFax;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 8, scale = 2, javaClass = BigDecimal.class)
    public void setPerPromoPerito(BigDecimal perPromoPerito) {
        this.perPromoPerito = perPromoPerito;
    }

    public BigDecimal getPerPromoPerito() {
        return this.perPromoPerito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 8, scale = 2, javaClass = BigDecimal.class)
    public void setPerPromoBanco(BigDecimal perPromoBanco) {
        this.perPromoBanco = perPromoBanco;
    }

    public BigDecimal getPerPromoBanco() {
        return this.perPromoBanco;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPerAnoAltaReg(BigDecimal perAnoAltaReg) {
        this.perAnoAltaReg = perAnoAltaReg;
    }

    public BigDecimal getPerAnoAltaReg() {
        return this.perAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerMesAltaReg(BigDecimal perMesAltaReg) {
        this.perMesAltaReg = perMesAltaReg;
    }

    public BigDecimal getPerMesAltaReg() {
        return this.perMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerDiaAltaReg(BigDecimal perDiaAltaReg) {
        this.perDiaAltaReg = perDiaAltaReg;
    }

    public BigDecimal getPerDiaAltaReg() {
        return this.perDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPerAnoUltMod(BigDecimal perAnoUltMod) {
        this.perAnoUltMod = perAnoUltMod;
    }

    public BigDecimal getPerAnoUltMod() {
        return this.perAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerMesUltMod(BigDecimal perMesUltMod) {
        this.perMesUltMod = perMesUltMod;
    }

    public BigDecimal getPerMesUltMod() {
        return this.perMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPerDiaUltMod(BigDecimal perDiaUltMod) {
        this.perDiaUltMod = perDiaUltMod;
    }

    public BigDecimal getPerDiaUltMod() {
        return this.perDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerNumContrato(String perNumContrato) {
        this.perNumContrato = perNumContrato;
    }

    public String getPerNumContrato() {
        return this.perNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerContVence(String perContVence) {
        this.perContVence = perContVence;
    }

    public String getPerContVence() {
        return this.perContVence;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPerCveStPerito(String perCveStPerito) {
        this.perCveStPerito = perCveStPerito;
    }

    public String getPerCveStPerito() {
        return this.perCveStPerito;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PERITOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPerNumPerito() != null && this.getPerNumPerito().longValue() == -999) {
            conditions += " AND PER_NUM_PERITO IS NULL";
        } else if (this.getPerNumPerito() != null) {
            conditions += " AND PER_NUM_PERITO = ?";
            values.add(this.getPerNumPerito());
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
        String sql = "SELECT * FROM PERITOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPerNumPerito() != null && this.getPerNumPerito().longValue() == -999) {
            conditions += " AND PER_NUM_PERITO IS NULL";
        } else if (this.getPerNumPerito() != null) {
            conditions += " AND PER_NUM_PERITO = ?";
            values.add(this.getPerNumPerito());
        }

        if (this.getPerTitulo() != null && "null".equals(this.getPerTitulo())) {
            conditions += " AND PER_TITULO IS NULL";
        } else if (this.getPerTitulo() != null) {
            conditions += " AND PER_TITULO = ?";
            values.add(this.getPerTitulo());
        }

        if (this.getPerNomPerito() != null && "null".equals(this.getPerNomPerito())) {
            conditions += " AND PER_NOM_PERITO IS NULL";
        } else if (this.getPerNomPerito() != null) {
            conditions += " AND PER_NOM_PERITO = ?";
            values.add(this.getPerNomPerito());
        }

        if (this.getPerApellidoPat() != null && "null".equals(this.getPerApellidoPat())) {
            conditions += " AND PER_APELLIDO_PAT IS NULL";
        } else if (this.getPerApellidoPat() != null) {
            conditions += " AND PER_APELLIDO_PAT = ?";
            values.add(this.getPerApellidoPat());
        }

        if (this.getPerApellidoMat() != null && "null".equals(this.getPerApellidoMat())) {
            conditions += " AND PER_APELLIDO_MAT IS NULL";
        } else if (this.getPerApellidoMat() != null) {
            conditions += " AND PER_APELLIDO_MAT = ?";
            values.add(this.getPerApellidoMat());
        }

        if (this.getPerCurp() != null && "null".equals(this.getPerCurp())) {
            conditions += " AND PER_CURP IS NULL";
        } else if (this.getPerCurp() != null) {
            conditions += " AND PER_CURP = ?";
            values.add(this.getPerCurp());
        }

        if (this.getPerCalidad() != null && "null".equals(this.getPerCalidad())) {
            conditions += " AND PER_CALIDAD IS NULL";
        } else if (this.getPerCalidad() != null) {
            conditions += " AND PER_CALIDAD = ?";
            values.add(this.getPerCalidad());
        }

        if (this.getPerOportunidad() != null && "null".equals(this.getPerOportunidad())) {
            conditions += " AND PER_OPORTUNIDAD IS NULL";
        } else if (this.getPerOportunidad() != null) {
            conditions += " AND PER_OPORTUNIDAD = ?";
            values.add(this.getPerOportunidad());
        }

        if (this.getPerInteExteFunc() != null && "null".equals(this.getPerInteExteFunc())) {
            conditions += " AND PER_INTE_EXTE_FUNC IS NULL";
        } else if (this.getPerInteExteFunc() != null) {
            conditions += " AND PER_INTE_EXTE_FUNC = ?";
            values.add(this.getPerInteExteFunc());
        }

        if (this.getPerCalleNum() != null && "null".equals(this.getPerCalleNum())) {
            conditions += " AND PER_CALLE_NUM IS NULL";
        } else if (this.getPerCalleNum() != null) {
            conditions += " AND PER_CALLE_NUM = ?";
            values.add(this.getPerCalleNum());
        }

        if (this.getPerNomColonia() != null && "null".equals(this.getPerNomColonia())) {
            conditions += " AND PER_NOM_COLONIA IS NULL";
        } else if (this.getPerNomColonia() != null) {
            conditions += " AND PER_NOM_COLONIA = ?";
            values.add(this.getPerNomColonia());
        }

        if (this.getPerNomPoblacion() != null && "null".equals(this.getPerNomPoblacion())) {
            conditions += " AND PER_NOM_POBLACION IS NULL";
        } else if (this.getPerNomPoblacion() != null) {
            conditions += " AND PER_NOM_POBLACION = ?";
            values.add(this.getPerNomPoblacion());
        }

        if (this.getPerCodigoPostal() != null && "null".equals(this.getPerCodigoPostal())) {
            conditions += " AND PER_CODIGO_POSTAL IS NULL";
        } else if (this.getPerCodigoPostal() != null) {
            conditions += " AND PER_CODIGO_POSTAL = ?";
            values.add(this.getPerCodigoPostal());
        }

        if (this.getPerNumEstado() != null && this.getPerNumEstado().longValue() == -999) {
            conditions += " AND PER_NUM_ESTADO IS NULL";
        } else if (this.getPerNumEstado() != null) {
            conditions += " AND PER_NUM_ESTADO = ?";
            values.add(this.getPerNumEstado());
        }

        if (this.getPerNumPais() != null && this.getPerNumPais().longValue() == -999) {
            conditions += " AND PER_NUM_PAIS IS NULL";
        } else if (this.getPerNumPais() != null) {
            conditions += " AND PER_NUM_PAIS = ?";
            values.add(this.getPerNumPais());
        }

        if (this.getPerNumLadaOfic() != null && "null".equals(this.getPerNumLadaOfic())) {
            conditions += " AND PER_NUM_LADA_OFIC IS NULL";
        } else if (this.getPerNumLadaOfic() != null) {
            conditions += " AND PER_NUM_LADA_OFIC = ?";
            values.add(this.getPerNumLadaOfic());
        }

        if (this.getPerNumTelefOfic() != null && "null".equals(this.getPerNumTelefOfic())) {
            conditions += " AND PER_NUM_TELEF_OFIC IS NULL";
        } else if (this.getPerNumTelefOfic() != null) {
            conditions += " AND PER_NUM_TELEF_OFIC = ?";
            values.add(this.getPerNumTelefOfic());
        }

        if (this.getPerNumExtOfic() != null && "null".equals(this.getPerNumExtOfic())) {
            conditions += " AND PER_NUM_EXT_OFIC IS NULL";
        } else if (this.getPerNumExtOfic() != null) {
            conditions += " AND PER_NUM_EXT_OFIC = ?";
            values.add(this.getPerNumExtOfic());
        }

        if (this.getPerNumLadaOfic2() != null && "null".equals(this.getPerNumLadaOfic2())) {
            conditions += " AND PER_NUM_LADA_OFIC2 IS NULL";
        } else if (this.getPerNumLadaOfic2() != null) {
            conditions += " AND PER_NUM_LADA_OFIC2 = ?";
            values.add(this.getPerNumLadaOfic2());
        }

        if (this.getPerNumTelefOfic2() != null && "null".equals(this.getPerNumTelefOfic2())) {
            conditions += " AND PER_NUM_TELEF_OFIC2 IS NULL";
        } else if (this.getPerNumTelefOfic2() != null) {
            conditions += " AND PER_NUM_TELEF_OFIC2 = ?";
            values.add(this.getPerNumTelefOfic2());
        }

        if (this.getPerNumExtOfic2() != null && "null".equals(this.getPerNumExtOfic2())) {
            conditions += " AND PER_NUM_EXT_OFIC2 IS NULL";
        } else if (this.getPerNumExtOfic2() != null) {
            conditions += " AND PER_NUM_EXT_OFIC2 = ?";
            values.add(this.getPerNumExtOfic2());
        }

        if (this.getPerNumLadaFax() != null && "null".equals(this.getPerNumLadaFax())) {
            conditions += " AND PER_NUM_LADA_FAX IS NULL";
        } else if (this.getPerNumLadaFax() != null) {
            conditions += " AND PER_NUM_LADA_FAX = ?";
            values.add(this.getPerNumLadaFax());
        }

        if (this.getPerNumTelefFax() != null && "null".equals(this.getPerNumTelefFax())) {
            conditions += " AND PER_NUM_TELEF_FAX IS NULL";
        } else if (this.getPerNumTelefFax() != null) {
            conditions += " AND PER_NUM_TELEF_FAX = ?";
            values.add(this.getPerNumTelefFax());
        }

        if (this.getPerNumExtFax() != null && "null".equals(this.getPerNumExtFax())) {
            conditions += " AND PER_NUM_EXT_FAX IS NULL";
        } else if (this.getPerNumExtFax() != null) {
            conditions += " AND PER_NUM_EXT_FAX = ?";
            values.add(this.getPerNumExtFax());
        }

        if (this.getPerPromoPerito() != null && this.getPerPromoPerito().longValue() == -999) {
            conditions += " AND PER_PROMO_PERITO IS NULL";
        } else if (this.getPerPromoPerito() != null) {
            conditions += " AND PER_PROMO_PERITO = ?";
            values.add(this.getPerPromoPerito());
        }

        if (this.getPerPromoBanco() != null && this.getPerPromoBanco().longValue() == -999) {
            conditions += " AND PER_PROMO_BANCO IS NULL";
        } else if (this.getPerPromoBanco() != null) {
            conditions += " AND PER_PROMO_BANCO = ?";
            values.add(this.getPerPromoBanco());
        }

        if (this.getPerAnoAltaReg() != null && this.getPerAnoAltaReg().longValue() == -999) {
            conditions += " AND PER_ANO_ALTA_REG IS NULL";
        } else if (this.getPerAnoAltaReg() != null) {
            conditions += " AND PER_ANO_ALTA_REG = ?";
            values.add(this.getPerAnoAltaReg());
        }

        if (this.getPerMesAltaReg() != null && this.getPerMesAltaReg().longValue() == -999) {
            conditions += " AND PER_MES_ALTA_REG IS NULL";
        } else if (this.getPerMesAltaReg() != null) {
            conditions += " AND PER_MES_ALTA_REG = ?";
            values.add(this.getPerMesAltaReg());
        }

        if (this.getPerDiaAltaReg() != null && this.getPerDiaAltaReg().longValue() == -999) {
            conditions += " AND PER_DIA_ALTA_REG IS NULL";
        } else if (this.getPerDiaAltaReg() != null) {
            conditions += " AND PER_DIA_ALTA_REG = ?";
            values.add(this.getPerDiaAltaReg());
        }

        if (this.getPerAnoUltMod() != null && this.getPerAnoUltMod().longValue() == -999) {
            conditions += " AND PER_ANO_ULT_MOD IS NULL";
        } else if (this.getPerAnoUltMod() != null) {
            conditions += " AND PER_ANO_ULT_MOD = ?";
            values.add(this.getPerAnoUltMod());
        }

        if (this.getPerMesUltMod() != null && this.getPerMesUltMod().longValue() == -999) {
            conditions += " AND PER_MES_ULT_MOD IS NULL";
        } else if (this.getPerMesUltMod() != null) {
            conditions += " AND PER_MES_ULT_MOD = ?";
            values.add(this.getPerMesUltMod());
        }

        if (this.getPerDiaUltMod() != null && this.getPerDiaUltMod().longValue() == -999) {
            conditions += " AND PER_DIA_ULT_MOD IS NULL";
        } else if (this.getPerDiaUltMod() != null) {
            conditions += " AND PER_DIA_ULT_MOD = ?";
            values.add(this.getPerDiaUltMod());
        }

        if (this.getPerNumContrato() != null && "null".equals(this.getPerNumContrato())) {
            conditions += " AND PER_NUM_CONTRATO IS NULL";
        } else if (this.getPerNumContrato() != null) {
            conditions += " AND PER_NUM_CONTRATO = ?";
            values.add(this.getPerNumContrato());
        }

        if (this.getPerContVence() != null && "null".equals(this.getPerContVence())) {
            conditions += " AND PER_CONT_VENCE IS NULL";
        } else if (this.getPerContVence() != null) {
            conditions += " AND PER_CONT_VENCE = ?";
            values.add(this.getPerContVence());
        }

        if (this.getPerCveStPerito() != null && "null".equals(this.getPerCveStPerito())) {
            conditions += " AND PER_CVE_ST_PERITO IS NULL";
        } else if (this.getPerCveStPerito() != null) {
            conditions += " AND PER_CVE_ST_PERITO = ?";
            values.add(this.getPerCveStPerito());
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
        String sql = "UPDATE PERITOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PER_NUM_PERITO = ?";
        pkValues.add(this.getPerNumPerito());
        fields += " PER_TITULO = ?, ";
        values.add(this.getPerTitulo());
        fields += " PER_NOM_PERITO = ?, ";
        values.add(this.getPerNomPerito());
        fields += " PER_APELLIDO_PAT = ?, ";
        values.add(this.getPerApellidoPat());
        fields += " PER_APELLIDO_MAT = ?, ";
        values.add(this.getPerApellidoMat());
        fields += " PER_CURP = ?, ";
        values.add(this.getPerCurp());
        fields += " PER_CALIDAD = ?, ";
        values.add(this.getPerCalidad());
        fields += " PER_OPORTUNIDAD = ?, ";
        values.add(this.getPerOportunidad());
        fields += " PER_INTE_EXTE_FUNC = ?, ";
        values.add(this.getPerInteExteFunc());
        fields += " PER_CALLE_NUM = ?, ";
        values.add(this.getPerCalleNum());
        fields += " PER_NOM_COLONIA = ?, ";
        values.add(this.getPerNomColonia());
        fields += " PER_NOM_POBLACION = ?, ";
        values.add(this.getPerNomPoblacion());
        fields += " PER_CODIGO_POSTAL = ?, ";
        values.add(this.getPerCodigoPostal());
        fields += " PER_NUM_ESTADO = ?, ";
        values.add(this.getPerNumEstado());
        fields += " PER_NUM_PAIS = ?, ";
        values.add(this.getPerNumPais());
        fields += " PER_NUM_LADA_OFIC = ?, ";
        values.add(this.getPerNumLadaOfic());
        fields += " PER_NUM_TELEF_OFIC = ?, ";
        values.add(this.getPerNumTelefOfic());
        fields += " PER_NUM_EXT_OFIC = ?, ";
        values.add(this.getPerNumExtOfic());
        fields += " PER_NUM_LADA_OFIC2 = ?, ";
        values.add(this.getPerNumLadaOfic2());
        fields += " PER_NUM_TELEF_OFIC2 = ?, ";
        values.add(this.getPerNumTelefOfic2());
        fields += " PER_NUM_EXT_OFIC2 = ?, ";
        values.add(this.getPerNumExtOfic2());
        fields += " PER_NUM_LADA_FAX = ?, ";
        values.add(this.getPerNumLadaFax());
        fields += " PER_NUM_TELEF_FAX = ?, ";
        values.add(this.getPerNumTelefFax());
        fields += " PER_NUM_EXT_FAX = ?, ";
        values.add(this.getPerNumExtFax());
        fields += " PER_PROMO_PERITO = ?, ";
        values.add(this.getPerPromoPerito());
        fields += " PER_PROMO_BANCO = ?, ";
        values.add(this.getPerPromoBanco());
        fields += " PER_ANO_ALTA_REG = ?, ";
        values.add(this.getPerAnoAltaReg());
        fields += " PER_MES_ALTA_REG = ?, ";
        values.add(this.getPerMesAltaReg());
        fields += " PER_DIA_ALTA_REG = ?, ";
        values.add(this.getPerDiaAltaReg());
        fields += " PER_ANO_ULT_MOD = ?, ";
        values.add(this.getPerAnoUltMod());
        fields += " PER_MES_ULT_MOD = ?, ";
        values.add(this.getPerMesUltMod());
        fields += " PER_DIA_ULT_MOD = ?, ";
        values.add(this.getPerDiaUltMod());
        fields += " PER_NUM_CONTRATO = ?, ";
        values.add(this.getPerNumContrato());
        fields += " PER_CONT_VENCE = ?, ";
        values.add(this.getPerContVence());
        fields += " PER_CVE_ST_PERITO = ?, ";
        values.add(this.getPerCveStPerito());
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
        String sql = "INSERT INTO PERITOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PER_NUM_PERITO";
        fieldValues += ", ?";
        values.add(this.getPerNumPerito());

        fields += ", PER_TITULO";
        fieldValues += ", ?";
        values.add(this.getPerTitulo());

        fields += ", PER_NOM_PERITO";
        fieldValues += ", ?";
        values.add(this.getPerNomPerito());

        fields += ", PER_APELLIDO_PAT";
        fieldValues += ", ?";
        values.add(this.getPerApellidoPat());

        fields += ", PER_APELLIDO_MAT";
        fieldValues += ", ?";
        values.add(this.getPerApellidoMat());

        fields += ", PER_CURP";
        fieldValues += ", ?";
        values.add(this.getPerCurp());

        fields += ", PER_CALIDAD";
        fieldValues += ", ?";
        values.add(this.getPerCalidad());

        fields += ", PER_OPORTUNIDAD";
        fieldValues += ", ?";
        values.add(this.getPerOportunidad());

        fields += ", PER_INTE_EXTE_FUNC";
        fieldValues += ", ?";
        values.add(this.getPerInteExteFunc());

        fields += ", PER_CALLE_NUM";
        fieldValues += ", ?";
        values.add(this.getPerCalleNum());

        fields += ", PER_NOM_COLONIA";
        fieldValues += ", ?";
        values.add(this.getPerNomColonia());

        fields += ", PER_NOM_POBLACION";
        fieldValues += ", ?";
        values.add(this.getPerNomPoblacion());

        fields += ", PER_CODIGO_POSTAL";
        fieldValues += ", ?";
        values.add(this.getPerCodigoPostal());

        fields += ", PER_NUM_ESTADO";
        fieldValues += ", ?";
        values.add(this.getPerNumEstado());

        fields += ", PER_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getPerNumPais());

        fields += ", PER_NUM_LADA_OFIC";
        fieldValues += ", ?";
        values.add(this.getPerNumLadaOfic());

        fields += ", PER_NUM_TELEF_OFIC";
        fieldValues += ", ?";
        values.add(this.getPerNumTelefOfic());

        fields += ", PER_NUM_EXT_OFIC";
        fieldValues += ", ?";
        values.add(this.getPerNumExtOfic());

        fields += ", PER_NUM_LADA_OFIC2";
        fieldValues += ", ?";
        values.add(this.getPerNumLadaOfic2());

        fields += ", PER_NUM_TELEF_OFIC2";
        fieldValues += ", ?";
        values.add(this.getPerNumTelefOfic2());

        fields += ", PER_NUM_EXT_OFIC2";
        fieldValues += ", ?";
        values.add(this.getPerNumExtOfic2());

        fields += ", PER_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getPerNumLadaFax());

        fields += ", PER_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getPerNumTelefFax());

        fields += ", PER_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getPerNumExtFax());

        fields += ", PER_PROMO_PERITO";
        fieldValues += ", ?";
        values.add(this.getPerPromoPerito());

        fields += ", PER_PROMO_BANCO";
        fieldValues += ", ?";
        values.add(this.getPerPromoBanco());

        fields += ", PER_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPerAnoAltaReg());

        fields += ", PER_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPerMesAltaReg());

        fields += ", PER_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPerDiaAltaReg());

        fields += ", PER_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPerAnoUltMod());

        fields += ", PER_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPerMesUltMod());

        fields += ", PER_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPerDiaUltMod());

        fields += ", PER_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPerNumContrato());

        fields += ", PER_CONT_VENCE";
        fieldValues += ", ?";
        values.add(this.getPerContVence());

        fields += ", PER_CVE_ST_PERITO";
        fieldValues += ", ?";
        values.add(this.getPerCveStPerito());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PERITOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PER_NUM_PERITO = ?";
        values.add(this.getPerNumPerito());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Peritos instance = (Peritos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPerNumPerito().equals(instance.getPerNumPerito()))
            equalObjects = false;
        if (equalObjects && !this.getPerTitulo().equals(instance.getPerTitulo()))
            equalObjects = false;
        if (equalObjects && !this.getPerNomPerito().equals(instance.getPerNomPerito()))
            equalObjects = false;
        if (equalObjects && !this.getPerApellidoPat().equals(instance.getPerApellidoPat()))
            equalObjects = false;
        if (equalObjects && !this.getPerApellidoMat().equals(instance.getPerApellidoMat()))
            equalObjects = false;
        if (equalObjects && !this.getPerCurp().equals(instance.getPerCurp()))
            equalObjects = false;
        if (equalObjects && !this.getPerCalidad().equals(instance.getPerCalidad()))
            equalObjects = false;
        if (equalObjects && !this.getPerOportunidad().equals(instance.getPerOportunidad()))
            equalObjects = false;
        if (equalObjects && !this.getPerInteExteFunc().equals(instance.getPerInteExteFunc()))
            equalObjects = false;
        if (equalObjects && !this.getPerCalleNum().equals(instance.getPerCalleNum()))
            equalObjects = false;
        if (equalObjects && !this.getPerNomColonia().equals(instance.getPerNomColonia()))
            equalObjects = false;
        if (equalObjects && !this.getPerNomPoblacion().equals(instance.getPerNomPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getPerCodigoPostal().equals(instance.getPerCodigoPostal()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumEstado().equals(instance.getPerNumEstado()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumPais().equals(instance.getPerNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumLadaOfic().equals(instance.getPerNumLadaOfic()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumTelefOfic().equals(instance.getPerNumTelefOfic()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumExtOfic().equals(instance.getPerNumExtOfic()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumLadaOfic2().equals(instance.getPerNumLadaOfic2()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumTelefOfic2().equals(instance.getPerNumTelefOfic2()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumExtOfic2().equals(instance.getPerNumExtOfic2()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumLadaFax().equals(instance.getPerNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumTelefFax().equals(instance.getPerNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumExtFax().equals(instance.getPerNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getPerPromoPerito().equals(instance.getPerPromoPerito()))
            equalObjects = false;
        if (equalObjects && !this.getPerPromoBanco().equals(instance.getPerPromoBanco()))
            equalObjects = false;
        if (equalObjects && !this.getPerAnoAltaReg().equals(instance.getPerAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPerMesAltaReg().equals(instance.getPerMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPerDiaAltaReg().equals(instance.getPerDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPerAnoUltMod().equals(instance.getPerAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPerMesUltMod().equals(instance.getPerMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPerDiaUltMod().equals(instance.getPerDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPerNumContrato().equals(instance.getPerNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPerContVence().equals(instance.getPerContVence()))
            equalObjects = false;
        if (equalObjects && !this.getPerCveStPerito().equals(instance.getPerCveStPerito()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Peritos result = new Peritos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPerNumPerito((BigDecimal) objectData.getData("PER_NUM_PERITO"));
        result.setPerTitulo((String) objectData.getData("PER_TITULO"));
        result.setPerNomPerito((String) objectData.getData("PER_NOM_PERITO"));
        result.setPerApellidoPat((String) objectData.getData("PER_APELLIDO_PAT"));
        result.setPerApellidoMat((String) objectData.getData("PER_APELLIDO_MAT"));
        result.setPerCurp((String) objectData.getData("PER_CURP"));
        result.setPerCalidad((String) objectData.getData("PER_CALIDAD"));
        result.setPerOportunidad((String) objectData.getData("PER_OPORTUNIDAD"));
        result.setPerInteExteFunc((String) objectData.getData("PER_INTE_EXTE_FUNC"));
        result.setPerCalleNum((String) objectData.getData("PER_CALLE_NUM"));
        result.setPerNomColonia((String) objectData.getData("PER_NOM_COLONIA"));
        result.setPerNomPoblacion((String) objectData.getData("PER_NOM_POBLACION"));
        result.setPerCodigoPostal((String) objectData.getData("PER_CODIGO_POSTAL"));
        result.setPerNumEstado((BigDecimal) objectData.getData("PER_NUM_ESTADO"));
        result.setPerNumPais((BigDecimal) objectData.getData("PER_NUM_PAIS"));
        result.setPerNumLadaOfic((String) objectData.getData("PER_NUM_LADA_OFIC"));
        result.setPerNumTelefOfic((String) objectData.getData("PER_NUM_TELEF_OFIC"));
        result.setPerNumExtOfic((String) objectData.getData("PER_NUM_EXT_OFIC"));
        result.setPerNumLadaOfic2((String) objectData.getData("PER_NUM_LADA_OFIC2"));
        result.setPerNumTelefOfic2((String) objectData.getData("PER_NUM_TELEF_OFIC2"));
        result.setPerNumExtOfic2((String) objectData.getData("PER_NUM_EXT_OFIC2"));
        result.setPerNumLadaFax((String) objectData.getData("PER_NUM_LADA_FAX"));
        result.setPerNumTelefFax((String) objectData.getData("PER_NUM_TELEF_FAX"));
        result.setPerNumExtFax((String) objectData.getData("PER_NUM_EXT_FAX"));
        result.setPerPromoPerito((BigDecimal) objectData.getData("PER_PROMO_PERITO"));
        result.setPerPromoBanco((BigDecimal) objectData.getData("PER_PROMO_BANCO"));
        result.setPerAnoAltaReg((BigDecimal) objectData.getData("PER_ANO_ALTA_REG"));
        result.setPerMesAltaReg((BigDecimal) objectData.getData("PER_MES_ALTA_REG"));
        result.setPerDiaAltaReg((BigDecimal) objectData.getData("PER_DIA_ALTA_REG"));
        result.setPerAnoUltMod((BigDecimal) objectData.getData("PER_ANO_ULT_MOD"));
        result.setPerMesUltMod((BigDecimal) objectData.getData("PER_MES_ULT_MOD"));
        result.setPerDiaUltMod((BigDecimal) objectData.getData("PER_DIA_ULT_MOD"));
        result.setPerNumContrato((String) objectData.getData("PER_NUM_CONTRATO"));
        result.setPerContVence((String) objectData.getData("PER_CONT_VENCE"));
        result.setPerCveStPerito((String) objectData.getData("PER_CVE_ST_PERITO"));

        return result;

    }

}
