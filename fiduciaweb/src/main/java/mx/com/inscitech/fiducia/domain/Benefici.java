package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "BENEFICI_PK", columns = { "BEN_NUM_CONTRATO", "BEN_BENEFICIARIO" }, sequences = { "MANUAL" })
public class Benefici extends DomainObject {

    BigDecimal benNumContrato = null;
    BigDecimal benBeneficiario = null;
    BigDecimal benNumPais = null;
    BigDecimal benNumRama = null;
    BigDecimal benNumSrama = null;
    String benCveMigratoria = null;
    String benCveSexo = null;
    String benCveTipoPer = null;
    String benNomBenef = null;
    String benRfc = null;
    String benFecNac = null;
    String benNomRepres = null;
    String benNomNacional = null;
    String benNumLadaCasa = null;
    String benNumTelefCasa = null;
    String benNumLadaOfic = null;
    String benNumTelefOfic = null;
    String benNumExtOfic = null;
    String benNumLadaFax = null;
    String benNumTelefFax = null;
    String benNumExtFax = null;
    BigDecimal benAnoAltaReg = null;
    BigDecimal benMesAltaReg = null;
    BigDecimal benDiaAltaReg = null;
    BigDecimal benAnoUltMod = null;
    BigDecimal benMesUltMod = null;
    BigDecimal benDiaUltMod = null;
    String benCveStBenefic = null;
    String benCurp = null;

    public Benefici() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBenNumContrato(BigDecimal benNumContrato) {
        this.benNumContrato = benNumContrato;
    }

    public BigDecimal getBenNumContrato() {
        return this.benNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBenBeneficiario(BigDecimal benBeneficiario) {
        this.benBeneficiario = benBeneficiario;
    }

    public BigDecimal getBenBeneficiario() {
        return this.benBeneficiario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBenNumPais(BigDecimal benNumPais) {
        this.benNumPais = benNumPais;
    }

    public BigDecimal getBenNumPais() {
        return this.benNumPais;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBenNumRama(BigDecimal benNumRama) {
        this.benNumRama = benNumRama;
    }

    public BigDecimal getBenNumRama() {
        return this.benNumRama;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBenNumSrama(BigDecimal benNumSrama) {
        this.benNumSrama = benNumSrama;
    }

    public BigDecimal getBenNumSrama() {
        return this.benNumSrama;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenCveMigratoria(String benCveMigratoria) {
        this.benCveMigratoria = benCveMigratoria;
    }

    public String getBenCveMigratoria() {
        return this.benCveMigratoria;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenCveSexo(String benCveSexo) {
        this.benCveSexo = benCveSexo;
    }

    public String getBenCveSexo() {
        return this.benCveSexo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenCveTipoPer(String benCveTipoPer) {
        this.benCveTipoPer = benCveTipoPer;
    }

    public String getBenCveTipoPer() {
        return this.benCveTipoPer;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNomBenef(String benNomBenef) {
        this.benNomBenef = benNomBenef;
    }

    public String getBenNomBenef() {
        return this.benNomBenef;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenRfc(String benRfc) {
        this.benRfc = benRfc;
    }

    public String getBenRfc() {
        return this.benRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenFecNac(String benFecNac) {
        this.benFecNac = benFecNac;
    }

    public String getBenFecNac() {
        return this.benFecNac;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNomRepres(String benNomRepres) {
        this.benNomRepres = benNomRepres;
    }

    public String getBenNomRepres() {
        return this.benNomRepres;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNomNacional(String benNomNacional) {
        this.benNomNacional = benNomNacional;
    }

    public String getBenNomNacional() {
        return this.benNomNacional;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNumLadaCasa(String benNumLadaCasa) {
        this.benNumLadaCasa = benNumLadaCasa;
    }

    public String getBenNumLadaCasa() {
        return this.benNumLadaCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNumTelefCasa(String benNumTelefCasa) {
        this.benNumTelefCasa = benNumTelefCasa;
    }

    public String getBenNumTelefCasa() {
        return this.benNumTelefCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNumLadaOfic(String benNumLadaOfic) {
        this.benNumLadaOfic = benNumLadaOfic;
    }

    public String getBenNumLadaOfic() {
        return this.benNumLadaOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNumTelefOfic(String benNumTelefOfic) {
        this.benNumTelefOfic = benNumTelefOfic;
    }

    public String getBenNumTelefOfic() {
        return this.benNumTelefOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNumExtOfic(String benNumExtOfic) {
        this.benNumExtOfic = benNumExtOfic;
    }

    public String getBenNumExtOfic() {
        return this.benNumExtOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNumLadaFax(String benNumLadaFax) {
        this.benNumLadaFax = benNumLadaFax;
    }

    public String getBenNumLadaFax() {
        return this.benNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNumTelefFax(String benNumTelefFax) {
        this.benNumTelefFax = benNumTelefFax;
    }

    public String getBenNumTelefFax() {
        return this.benNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenNumExtFax(String benNumExtFax) {
        this.benNumExtFax = benNumExtFax;
    }

    public String getBenNumExtFax() {
        return this.benNumExtFax;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBenAnoAltaReg(BigDecimal benAnoAltaReg) {
        this.benAnoAltaReg = benAnoAltaReg;
    }

    public BigDecimal getBenAnoAltaReg() {
        return this.benAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBenMesAltaReg(BigDecimal benMesAltaReg) {
        this.benMesAltaReg = benMesAltaReg;
    }

    public BigDecimal getBenMesAltaReg() {
        return this.benMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBenDiaAltaReg(BigDecimal benDiaAltaReg) {
        this.benDiaAltaReg = benDiaAltaReg;
    }

    public BigDecimal getBenDiaAltaReg() {
        return this.benDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBenAnoUltMod(BigDecimal benAnoUltMod) {
        this.benAnoUltMod = benAnoUltMod;
    }

    public BigDecimal getBenAnoUltMod() {
        return this.benAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBenMesUltMod(BigDecimal benMesUltMod) {
        this.benMesUltMod = benMesUltMod;
    }

    public BigDecimal getBenMesUltMod() {
        return this.benMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBenDiaUltMod(BigDecimal benDiaUltMod) {
        this.benDiaUltMod = benDiaUltMod;
    }

    public BigDecimal getBenDiaUltMod() {
        return this.benDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenCveStBenefic(String benCveStBenefic) {
        this.benCveStBenefic = benCveStBenefic;
    }

    public String getBenCveStBenefic() {
        return this.benCveStBenefic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBenCurp(String benCurp) {
        this.benCurp = benCurp;
    }

    public String getBenCurp() {
        return this.benCurp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM BENEFICI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getBenNumContrato() != null && this.getBenNumContrato().longValue() == -999) {
            conditions += " AND BEN_NUM_CONTRATO IS NULL";
        } else if (this.getBenNumContrato() != null) {
            conditions += " AND BEN_NUM_CONTRATO = ?";
            values.add(this.getBenNumContrato());
        }

        if (this.getBenBeneficiario() != null && this.getBenBeneficiario().longValue() == -999) {
            conditions += " AND BEN_BENEFICIARIO IS NULL";
        } else if (this.getBenBeneficiario() != null) {
            conditions += " AND BEN_BENEFICIARIO = ?";
            values.add(this.getBenBeneficiario());
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
        String sql = "SELECT * FROM BENEFICI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getBenNumContrato() != null && this.getBenNumContrato().longValue() == -999) {
            conditions += " AND BEN_NUM_CONTRATO IS NULL";
        } else if (this.getBenNumContrato() != null) {
            conditions += " AND BEN_NUM_CONTRATO = ?";
            values.add(this.getBenNumContrato());
        }

        if (this.getBenBeneficiario() != null && this.getBenBeneficiario().longValue() == -999) {
            conditions += " AND BEN_BENEFICIARIO IS NULL";
        } else if (this.getBenBeneficiario() != null) {
            conditions += " AND BEN_BENEFICIARIO = ?";
            values.add(this.getBenBeneficiario());
        }

        if (this.getBenNumPais() != null && this.getBenNumPais().longValue() == -999) {
            conditions += " AND BEN_NUM_PAIS IS NULL";
        } else if (this.getBenNumPais() != null) {
            conditions += " AND BEN_NUM_PAIS = ?";
            values.add(this.getBenNumPais());
        }

        if (this.getBenNumRama() != null && this.getBenNumRama().longValue() == -999) {
            conditions += " AND BEN_NUM_RAMA IS NULL";
        } else if (this.getBenNumRama() != null) {
            conditions += " AND BEN_NUM_RAMA = ?";
            values.add(this.getBenNumRama());
        }

        if (this.getBenNumSrama() != null && this.getBenNumSrama().longValue() == -999) {
            conditions += " AND BEN_NUM_SRAMA IS NULL";
        } else if (this.getBenNumSrama() != null) {
            conditions += " AND BEN_NUM_SRAMA = ?";
            values.add(this.getBenNumSrama());
        }

        if (this.getBenCveMigratoria() != null && "null".equals(this.getBenCveMigratoria())) {
            conditions += " AND BEN_CVE_MIGRATORIA IS NULL";
        } else if (this.getBenCveMigratoria() != null) {
            conditions += " AND BEN_CVE_MIGRATORIA = ?";
            values.add(this.getBenCveMigratoria());
        }

        if (this.getBenCveSexo() != null && "null".equals(this.getBenCveSexo())) {
            conditions += " AND BEN_CVE_SEXO IS NULL";
        } else if (this.getBenCveSexo() != null) {
            conditions += " AND BEN_CVE_SEXO = ?";
            values.add(this.getBenCveSexo());
        }

        if (this.getBenCveTipoPer() != null && "null".equals(this.getBenCveTipoPer())) {
            conditions += " AND BEN_CVE_TIPO_PER IS NULL";
        } else if (this.getBenCveTipoPer() != null) {
            conditions += " AND BEN_CVE_TIPO_PER = ?";
            values.add(this.getBenCveTipoPer());
        }

        if (this.getBenNomBenef() != null && "null".equals(this.getBenNomBenef())) {
            conditions += " AND BEN_NOM_BENEF IS NULL";
        } else if (this.getBenNomBenef() != null) {
            conditions += " AND BEN_NOM_BENEF = ?";
            values.add(this.getBenNomBenef());
        }

        if (this.getBenRfc() != null && "null".equals(this.getBenRfc())) {
            conditions += " AND BEN_RFC IS NULL";
        } else if (this.getBenRfc() != null) {
            conditions += " AND BEN_RFC = ?";
            values.add(this.getBenRfc());
        }

        if (this.getBenFecNac() != null && "null".equals(this.getBenFecNac())) {
            conditions += " AND BEN_FEC_NAC IS NULL";
        } else if (this.getBenFecNac() != null) {
            conditions += " AND BEN_FEC_NAC = ?";
            values.add(this.getBenFecNac());
        }

        if (this.getBenNomRepres() != null && "null".equals(this.getBenNomRepres())) {
            conditions += " AND BEN_NOM_REPRES IS NULL";
        } else if (this.getBenNomRepres() != null) {
            conditions += " AND BEN_NOM_REPRES = ?";
            values.add(this.getBenNomRepres());
        }

        if (this.getBenNomNacional() != null && "null".equals(this.getBenNomNacional())) {
            conditions += " AND BEN_NOM_NACIONAL IS NULL";
        } else if (this.getBenNomNacional() != null) {
            conditions += " AND BEN_NOM_NACIONAL = ?";
            values.add(this.getBenNomNacional());
        }

        if (this.getBenNumLadaCasa() != null && "null".equals(this.getBenNumLadaCasa())) {
            conditions += " AND BEN_NUM_LADA_CASA IS NULL";
        } else if (this.getBenNumLadaCasa() != null) {
            conditions += " AND BEN_NUM_LADA_CASA = ?";
            values.add(this.getBenNumLadaCasa());
        }

        if (this.getBenNumTelefCasa() != null && "null".equals(this.getBenNumTelefCasa())) {
            conditions += " AND BEN_NUM_TELEF_CASA IS NULL";
        } else if (this.getBenNumTelefCasa() != null) {
            conditions += " AND BEN_NUM_TELEF_CASA = ?";
            values.add(this.getBenNumTelefCasa());
        }

        if (this.getBenNumLadaOfic() != null && "null".equals(this.getBenNumLadaOfic())) {
            conditions += " AND BEN_NUM_LADA_OFIC IS NULL";
        } else if (this.getBenNumLadaOfic() != null) {
            conditions += " AND BEN_NUM_LADA_OFIC = ?";
            values.add(this.getBenNumLadaOfic());
        }

        if (this.getBenNumTelefOfic() != null && "null".equals(this.getBenNumTelefOfic())) {
            conditions += " AND BEN_NUM_TELEF_OFIC IS NULL";
        } else if (this.getBenNumTelefOfic() != null) {
            conditions += " AND BEN_NUM_TELEF_OFIC = ?";
            values.add(this.getBenNumTelefOfic());
        }

        if (this.getBenNumExtOfic() != null && "null".equals(this.getBenNumExtOfic())) {
            conditions += " AND BEN_NUM_EXT_OFIC IS NULL";
        } else if (this.getBenNumExtOfic() != null) {
            conditions += " AND BEN_NUM_EXT_OFIC = ?";
            values.add(this.getBenNumExtOfic());
        }

        if (this.getBenNumLadaFax() != null && "null".equals(this.getBenNumLadaFax())) {
            conditions += " AND BEN_NUM_LADA_FAX IS NULL";
        } else if (this.getBenNumLadaFax() != null) {
            conditions += " AND BEN_NUM_LADA_FAX = ?";
            values.add(this.getBenNumLadaFax());
        }

        if (this.getBenNumTelefFax() != null && "null".equals(this.getBenNumTelefFax())) {
            conditions += " AND BEN_NUM_TELEF_FAX IS NULL";
        } else if (this.getBenNumTelefFax() != null) {
            conditions += " AND BEN_NUM_TELEF_FAX = ?";
            values.add(this.getBenNumTelefFax());
        }

        if (this.getBenNumExtFax() != null && "null".equals(this.getBenNumExtFax())) {
            conditions += " AND BEN_NUM_EXT_FAX IS NULL";
        } else if (this.getBenNumExtFax() != null) {
            conditions += " AND BEN_NUM_EXT_FAX = ?";
            values.add(this.getBenNumExtFax());
        }

        if (this.getBenAnoAltaReg() != null && this.getBenAnoAltaReg().longValue() == -999) {
            conditions += " AND BEN_ANO_ALTA_REG IS NULL";
        } else if (this.getBenAnoAltaReg() != null) {
            conditions += " AND BEN_ANO_ALTA_REG = ?";
            values.add(this.getBenAnoAltaReg());
        }

        if (this.getBenMesAltaReg() != null && this.getBenMesAltaReg().longValue() == -999) {
            conditions += " AND BEN_MES_ALTA_REG IS NULL";
        } else if (this.getBenMesAltaReg() != null) {
            conditions += " AND BEN_MES_ALTA_REG = ?";
            values.add(this.getBenMesAltaReg());
        }

        if (this.getBenDiaAltaReg() != null && this.getBenDiaAltaReg().longValue() == -999) {
            conditions += " AND BEN_DIA_ALTA_REG IS NULL";
        } else if (this.getBenDiaAltaReg() != null) {
            conditions += " AND BEN_DIA_ALTA_REG = ?";
            values.add(this.getBenDiaAltaReg());
        }

        if (this.getBenAnoUltMod() != null && this.getBenAnoUltMod().longValue() == -999) {
            conditions += " AND BEN_ANO_ULT_MOD IS NULL";
        } else if (this.getBenAnoUltMod() != null) {
            conditions += " AND BEN_ANO_ULT_MOD = ?";
            values.add(this.getBenAnoUltMod());
        }

        if (this.getBenMesUltMod() != null && this.getBenMesUltMod().longValue() == -999) {
            conditions += " AND BEN_MES_ULT_MOD IS NULL";
        } else if (this.getBenMesUltMod() != null) {
            conditions += " AND BEN_MES_ULT_MOD = ?";
            values.add(this.getBenMesUltMod());
        }

        if (this.getBenDiaUltMod() != null && this.getBenDiaUltMod().longValue() == -999) {
            conditions += " AND BEN_DIA_ULT_MOD IS NULL";
        } else if (this.getBenDiaUltMod() != null) {
            conditions += " AND BEN_DIA_ULT_MOD = ?";
            values.add(this.getBenDiaUltMod());
        }

        if (this.getBenCveStBenefic() != null && "null".equals(this.getBenCveStBenefic())) {
            conditions += " AND BEN_CVE_ST_BENEFIC IS NULL";
        } else if (this.getBenCveStBenefic() != null) {
            conditions += " AND BEN_CVE_ST_BENEFIC = ?";
            values.add(this.getBenCveStBenefic());
        }

        if (this.getBenCurp() != null && "null".equals(this.getBenCurp())) {
            conditions += " AND BEN_CURP IS NULL";
        } else if (this.getBenCurp() != null) {
            conditions += " AND BEN_CURP = ?";
            values.add(this.getBenCurp());
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
        String sql = "UPDATE BENEFICI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND BEN_NUM_CONTRATO = ?";
        pkValues.add(this.getBenNumContrato());
        conditions += " AND BEN_BENEFICIARIO = ?";
        pkValues.add(this.getBenBeneficiario());
        fields += " BEN_NUM_PAIS = ?, ";
        values.add(this.getBenNumPais());
        fields += " BEN_NUM_RAMA = ?, ";
        values.add(this.getBenNumRama());
        fields += " BEN_NUM_SRAMA = ?, ";
        values.add(this.getBenNumSrama());
        fields += " BEN_CVE_MIGRATORIA = ?, ";
        values.add(this.getBenCveMigratoria());
        fields += " BEN_CVE_SEXO = ?, ";
        values.add(this.getBenCveSexo());
        fields += " BEN_CVE_TIPO_PER = ?, ";
        values.add(this.getBenCveTipoPer());
        fields += " BEN_NOM_BENEF = ?, ";
        values.add(this.getBenNomBenef());
        fields += " BEN_RFC = ?, ";
        values.add(this.getBenRfc());
        fields += " BEN_FEC_NAC = ?, ";
        values.add(this.getBenFecNac());
        fields += " BEN_NOM_REPRES = ?, ";
        values.add(this.getBenNomRepres());
        fields += " BEN_NOM_NACIONAL = ?, ";
        values.add(this.getBenNomNacional());
        fields += " BEN_NUM_LADA_CASA = ?, ";
        values.add(this.getBenNumLadaCasa());
        fields += " BEN_NUM_TELEF_CASA = ?, ";
        values.add(this.getBenNumTelefCasa());
        fields += " BEN_NUM_LADA_OFIC = ?, ";
        values.add(this.getBenNumLadaOfic());
        fields += " BEN_NUM_TELEF_OFIC = ?, ";
        values.add(this.getBenNumTelefOfic());
        fields += " BEN_NUM_EXT_OFIC = ?, ";
        values.add(this.getBenNumExtOfic());
        fields += " BEN_NUM_LADA_FAX = ?, ";
        values.add(this.getBenNumLadaFax());
        fields += " BEN_NUM_TELEF_FAX = ?, ";
        values.add(this.getBenNumTelefFax());
        fields += " BEN_NUM_EXT_FAX = ?, ";
        values.add(this.getBenNumExtFax());
        fields += " BEN_ANO_ALTA_REG = ?, ";
        values.add(this.getBenAnoAltaReg());
        fields += " BEN_MES_ALTA_REG = ?, ";
        values.add(this.getBenMesAltaReg());
        fields += " BEN_DIA_ALTA_REG = ?, ";
        values.add(this.getBenDiaAltaReg());
        fields += " BEN_ANO_ULT_MOD = ?, ";
        values.add(this.getBenAnoUltMod());
        fields += " BEN_MES_ULT_MOD = ?, ";
        values.add(this.getBenMesUltMod());
        fields += " BEN_DIA_ULT_MOD = ?, ";
        values.add(this.getBenDiaUltMod());
        fields += " BEN_CVE_ST_BENEFIC = ?, ";
        values.add(this.getBenCveStBenefic());
        fields += " BEN_CURP = ?, ";
        values.add(this.getBenCurp());
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
        String sql = "INSERT INTO BENEFICI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", BEN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getBenNumContrato());

        fields += ", BEN_BENEFICIARIO";
        fieldValues += ", ?";
        values.add(this.getBenBeneficiario());

        fields += ", BEN_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getBenNumPais());

        fields += ", BEN_NUM_RAMA";
        fieldValues += ", ?";
        values.add(this.getBenNumRama());

        fields += ", BEN_NUM_SRAMA";
        fieldValues += ", ?";
        values.add(this.getBenNumSrama());

        fields += ", BEN_CVE_MIGRATORIA";
        fieldValues += ", ?";
        values.add(this.getBenCveMigratoria());

        fields += ", BEN_CVE_SEXO";
        fieldValues += ", ?";
        values.add(this.getBenCveSexo());

        fields += ", BEN_CVE_TIPO_PER";
        fieldValues += ", ?";
        values.add(this.getBenCveTipoPer());

        fields += ", BEN_NOM_BENEF";
        fieldValues += ", ?";
        values.add(this.getBenNomBenef());

        fields += ", BEN_RFC";
        fieldValues += ", ?";
        values.add(this.getBenRfc());

        fields += ", BEN_FEC_NAC";
        fieldValues += ", ?";
        values.add(this.getBenFecNac());

        fields += ", BEN_NOM_REPRES";
        fieldValues += ", ?";
        values.add(this.getBenNomRepres());

        fields += ", BEN_NOM_NACIONAL";
        fieldValues += ", ?";
        values.add(this.getBenNomNacional());

        fields += ", BEN_NUM_LADA_CASA";
        fieldValues += ", ?";
        values.add(this.getBenNumLadaCasa());

        fields += ", BEN_NUM_TELEF_CASA";
        fieldValues += ", ?";
        values.add(this.getBenNumTelefCasa());

        fields += ", BEN_NUM_LADA_OFIC";
        fieldValues += ", ?";
        values.add(this.getBenNumLadaOfic());

        fields += ", BEN_NUM_TELEF_OFIC";
        fieldValues += ", ?";
        values.add(this.getBenNumTelefOfic());

        fields += ", BEN_NUM_EXT_OFIC";
        fieldValues += ", ?";
        values.add(this.getBenNumExtOfic());

        fields += ", BEN_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getBenNumLadaFax());

        fields += ", BEN_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getBenNumTelefFax());

        fields += ", BEN_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getBenNumExtFax());

        fields += ", BEN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBenAnoAltaReg());

        fields += ", BEN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBenMesAltaReg());

        fields += ", BEN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBenDiaAltaReg());

        fields += ", BEN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBenAnoUltMod());

        fields += ", BEN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBenMesUltMod());

        fields += ", BEN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBenDiaUltMod());

        fields += ", BEN_CVE_ST_BENEFIC";
        fieldValues += ", ?";
        values.add(this.getBenCveStBenefic());

        fields += ", BEN_CURP";
        fieldValues += ", ?";
        values.add(this.getBenCurp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM BENEFICI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND BEN_NUM_CONTRATO = ?";
        values.add(this.getBenNumContrato());
        conditions += " AND BEN_BENEFICIARIO = ?";
        values.add(this.getBenBeneficiario());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Benefici instance = (Benefici) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getBenNumContrato().equals(instance.getBenNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getBenBeneficiario().equals(instance.getBenBeneficiario()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumPais().equals(instance.getBenNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumRama().equals(instance.getBenNumRama()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumSrama().equals(instance.getBenNumSrama()))
            equalObjects = false;
        if (equalObjects && !this.getBenCveMigratoria().equals(instance.getBenCveMigratoria()))
            equalObjects = false;
        if (equalObjects && !this.getBenCveSexo().equals(instance.getBenCveSexo()))
            equalObjects = false;
        if (equalObjects && !this.getBenCveTipoPer().equals(instance.getBenCveTipoPer()))
            equalObjects = false;
        if (equalObjects && !this.getBenNomBenef().equals(instance.getBenNomBenef()))
            equalObjects = false;
        if (equalObjects && !this.getBenRfc().equals(instance.getBenRfc()))
            equalObjects = false;
        if (equalObjects && !this.getBenFecNac().equals(instance.getBenFecNac()))
            equalObjects = false;
        if (equalObjects && !this.getBenNomRepres().equals(instance.getBenNomRepres()))
            equalObjects = false;
        if (equalObjects && !this.getBenNomNacional().equals(instance.getBenNomNacional()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumLadaCasa().equals(instance.getBenNumLadaCasa()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumTelefCasa().equals(instance.getBenNumTelefCasa()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumLadaOfic().equals(instance.getBenNumLadaOfic()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumTelefOfic().equals(instance.getBenNumTelefOfic()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumExtOfic().equals(instance.getBenNumExtOfic()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumLadaFax().equals(instance.getBenNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumTelefFax().equals(instance.getBenNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getBenNumExtFax().equals(instance.getBenNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getBenAnoAltaReg().equals(instance.getBenAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBenMesAltaReg().equals(instance.getBenMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBenDiaAltaReg().equals(instance.getBenDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBenAnoUltMod().equals(instance.getBenAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBenMesUltMod().equals(instance.getBenMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBenDiaUltMod().equals(instance.getBenDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBenCveStBenefic().equals(instance.getBenCveStBenefic()))
            equalObjects = false;
        if (equalObjects && !this.getBenCurp().equals(instance.getBenCurp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Benefici result = new Benefici();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setBenNumContrato((BigDecimal) objectData.getData("BEN_NUM_CONTRATO"));
        result.setBenBeneficiario((BigDecimal) objectData.getData("BEN_BENEFICIARIO"));
        result.setBenNumPais((BigDecimal) objectData.getData("BEN_NUM_PAIS"));
        result.setBenNumRama((BigDecimal) objectData.getData("BEN_NUM_RAMA"));
        result.setBenNumSrama((BigDecimal) objectData.getData("BEN_NUM_SRAMA"));
        result.setBenCveMigratoria((String) objectData.getData("BEN_CVE_MIGRATORIA"));
        result.setBenCveSexo((String) objectData.getData("BEN_CVE_SEXO"));
        result.setBenCveTipoPer((String) objectData.getData("BEN_CVE_TIPO_PER"));
        result.setBenNomBenef((String) objectData.getData("BEN_NOM_BENEF"));
        result.setBenRfc((String) objectData.getData("BEN_RFC"));
        result.setBenFecNac((String) objectData.getData("BEN_FEC_NAC"));
        result.setBenNomRepres((String) objectData.getData("BEN_NOM_REPRES"));
        result.setBenNomNacional((String) objectData.getData("BEN_NOM_NACIONAL"));
        result.setBenNumLadaCasa((String) objectData.getData("BEN_NUM_LADA_CASA"));
        result.setBenNumTelefCasa((String) objectData.getData("BEN_NUM_TELEF_CASA"));
        result.setBenNumLadaOfic((String) objectData.getData("BEN_NUM_LADA_OFIC"));
        result.setBenNumTelefOfic((String) objectData.getData("BEN_NUM_TELEF_OFIC"));
        result.setBenNumExtOfic((String) objectData.getData("BEN_NUM_EXT_OFIC"));
        result.setBenNumLadaFax((String) objectData.getData("BEN_NUM_LADA_FAX"));
        result.setBenNumTelefFax((String) objectData.getData("BEN_NUM_TELEF_FAX"));
        result.setBenNumExtFax((String) objectData.getData("BEN_NUM_EXT_FAX"));
        result.setBenAnoAltaReg((BigDecimal) objectData.getData("BEN_ANO_ALTA_REG"));
        result.setBenMesAltaReg((BigDecimal) objectData.getData("BEN_MES_ALTA_REG"));
        result.setBenDiaAltaReg((BigDecimal) objectData.getData("BEN_DIA_ALTA_REG"));
        result.setBenAnoUltMod((BigDecimal) objectData.getData("BEN_ANO_ULT_MOD"));
        result.setBenMesUltMod((BigDecimal) objectData.getData("BEN_MES_ULT_MOD"));
        result.setBenDiaUltMod((BigDecimal) objectData.getData("BEN_DIA_ULT_MOD"));
        result.setBenCveStBenefic((String) objectData.getData("BEN_CVE_ST_BENEFIC"));
        result.setBenCurp((String) objectData.getData("BEN_CURP"));

        return result;

    }

}
