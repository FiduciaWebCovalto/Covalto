package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FIDEICOMH_PK", columns = { "FID_NUM_CONTRATO", "FID_FIDEICOMITENTE" }, sequences = { "MANUAL" })
public class Fideicomh extends DomainObject {

    BigDecimal fidNumContrato = null;
    BigDecimal fidFideicomitente = null;
    BigDecimal fidNumPais = null;
    BigDecimal fidNumRama = null;
    BigDecimal fidNumSrama = null;
    String fidCveMigratoria = null;
    String fidCveSexo = null;
    String fidCveTipoPer = null;
    String fidNomFideicom = null;
    String fidRfc = null;
    BigDecimal fidFecNac = null;
    String fidNomNacional = null;
    String fidNumLadaCasa = null;
    String fidNumTelefCasa = null;
    String fidNumLadaOfic = null;
    String fidNumTelefOfic = null;
    String fidNumExtOfic = null;
    String fidNumLadaFax = null;
    String fidNumTelefFax = null;
    String fidNumExtFax = null;
    BigDecimal fidAnoAltaReg = null;
    BigDecimal fidMesAltaReg = null;
    BigDecimal fidDiaAltaReg = null;
    BigDecimal fidAnoUltMod = null;
    BigDecimal fidMesUltMod = null;
    BigDecimal fidDiaUltMod = null;
    String fidCveStFideico = null;
    String fidCurp = null;

    public Fideicomh() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFidNumContrato(BigDecimal fidNumContrato) {
        this.fidNumContrato = fidNumContrato;
    }

    public BigDecimal getFidNumContrato() {
        return this.fidNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFidFideicomitente(BigDecimal fidFideicomitente) {
        this.fidFideicomitente = fidFideicomitente;
    }

    public BigDecimal getFidFideicomitente() {
        return this.fidFideicomitente;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFidNumPais(BigDecimal fidNumPais) {
        this.fidNumPais = fidNumPais;
    }

    public BigDecimal getFidNumPais() {
        return this.fidNumPais;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFidNumRama(BigDecimal fidNumRama) {
        this.fidNumRama = fidNumRama;
    }

    public BigDecimal getFidNumRama() {
        return this.fidNumRama;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFidNumSrama(BigDecimal fidNumSrama) {
        this.fidNumSrama = fidNumSrama;
    }

    public BigDecimal getFidNumSrama() {
        return this.fidNumSrama;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidCveMigratoria(String fidCveMigratoria) {
        this.fidCveMigratoria = fidCveMigratoria;
    }

    public String getFidCveMigratoria() {
        return this.fidCveMigratoria;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidCveSexo(String fidCveSexo) {
        this.fidCveSexo = fidCveSexo;
    }

    public String getFidCveSexo() {
        return this.fidCveSexo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidCveTipoPer(String fidCveTipoPer) {
        this.fidCveTipoPer = fidCveTipoPer;
    }

    public String getFidCveTipoPer() {
        return this.fidCveTipoPer;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidNomFideicom(String fidNomFideicom) {
        this.fidNomFideicom = fidNomFideicom;
    }

    public String getFidNomFideicom() {
        return this.fidNomFideicom;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidRfc(String fidRfc) {
        this.fidRfc = fidRfc;
    }

    public String getFidRfc() {
        return this.fidRfc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFidFecNac(BigDecimal fidFecNac) {
        this.fidFecNac = fidFecNac;
    }

    public BigDecimal getFidFecNac() {
        return this.fidFecNac;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidNomNacional(String fidNomNacional) {
        this.fidNomNacional = fidNomNacional;
    }

    public String getFidNomNacional() {
        return this.fidNomNacional;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidNumLadaCasa(String fidNumLadaCasa) {
        this.fidNumLadaCasa = fidNumLadaCasa;
    }

    public String getFidNumLadaCasa() {
        return this.fidNumLadaCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidNumTelefCasa(String fidNumTelefCasa) {
        this.fidNumTelefCasa = fidNumTelefCasa;
    }

    public String getFidNumTelefCasa() {
        return this.fidNumTelefCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidNumLadaOfic(String fidNumLadaOfic) {
        this.fidNumLadaOfic = fidNumLadaOfic;
    }

    public String getFidNumLadaOfic() {
        return this.fidNumLadaOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidNumTelefOfic(String fidNumTelefOfic) {
        this.fidNumTelefOfic = fidNumTelefOfic;
    }

    public String getFidNumTelefOfic() {
        return this.fidNumTelefOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidNumExtOfic(String fidNumExtOfic) {
        this.fidNumExtOfic = fidNumExtOfic;
    }

    public String getFidNumExtOfic() {
        return this.fidNumExtOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidNumLadaFax(String fidNumLadaFax) {
        this.fidNumLadaFax = fidNumLadaFax;
    }

    public String getFidNumLadaFax() {
        return this.fidNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidNumTelefFax(String fidNumTelefFax) {
        this.fidNumTelefFax = fidNumTelefFax;
    }

    public String getFidNumTelefFax() {
        return this.fidNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidNumExtFax(String fidNumExtFax) {
        this.fidNumExtFax = fidNumExtFax;
    }

    public String getFidNumExtFax() {
        return this.fidNumExtFax;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFidAnoAltaReg(BigDecimal fidAnoAltaReg) {
        this.fidAnoAltaReg = fidAnoAltaReg;
    }

    public BigDecimal getFidAnoAltaReg() {
        return this.fidAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFidMesAltaReg(BigDecimal fidMesAltaReg) {
        this.fidMesAltaReg = fidMesAltaReg;
    }

    public BigDecimal getFidMesAltaReg() {
        return this.fidMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFidDiaAltaReg(BigDecimal fidDiaAltaReg) {
        this.fidDiaAltaReg = fidDiaAltaReg;
    }

    public BigDecimal getFidDiaAltaReg() {
        return this.fidDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFidAnoUltMod(BigDecimal fidAnoUltMod) {
        this.fidAnoUltMod = fidAnoUltMod;
    }

    public BigDecimal getFidAnoUltMod() {
        return this.fidAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFidMesUltMod(BigDecimal fidMesUltMod) {
        this.fidMesUltMod = fidMesUltMod;
    }

    public BigDecimal getFidMesUltMod() {
        return this.fidMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFidDiaUltMod(BigDecimal fidDiaUltMod) {
        this.fidDiaUltMod = fidDiaUltMod;
    }

    public BigDecimal getFidDiaUltMod() {
        return this.fidDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidCveStFideico(String fidCveStFideico) {
        this.fidCveStFideico = fidCveStFideico;
    }

    public String getFidCveStFideico() {
        return this.fidCveStFideico;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFidCurp(String fidCurp) {
        this.fidCurp = fidCurp;
    }

    public String getFidCurp() {
        return this.fidCurp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FIDEICOMH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFidNumContrato() != null && this.getFidNumContrato().longValue() == -999) {
            conditions += " AND FID_NUM_CONTRATO IS NULL";
        } else if (this.getFidNumContrato() != null) {
            conditions += " AND FID_NUM_CONTRATO = ?";
            values.add(this.getFidNumContrato());
        }

        if (this.getFidFideicomitente() != null && this.getFidFideicomitente().longValue() == -999) {
            conditions += " AND FID_FIDEICOMITENTE IS NULL";
        } else if (this.getFidFideicomitente() != null) {
            conditions += " AND FID_FIDEICOMITENTE = ?";
            values.add(this.getFidFideicomitente());
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
        String sql = "SELECT * FROM FIDEICOMH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFidNumContrato() != null && this.getFidNumContrato().longValue() == -999) {
            conditions += " AND FID_NUM_CONTRATO IS NULL";
        } else if (this.getFidNumContrato() != null) {
            conditions += " AND FID_NUM_CONTRATO = ?";
            values.add(this.getFidNumContrato());
        }

        if (this.getFidFideicomitente() != null && this.getFidFideicomitente().longValue() == -999) {
            conditions += " AND FID_FIDEICOMITENTE IS NULL";
        } else if (this.getFidFideicomitente() != null) {
            conditions += " AND FID_FIDEICOMITENTE = ?";
            values.add(this.getFidFideicomitente());
        }

        if (this.getFidNumPais() != null && this.getFidNumPais().longValue() == -999) {
            conditions += " AND FID_NUM_PAIS IS NULL";
        } else if (this.getFidNumPais() != null) {
            conditions += " AND FID_NUM_PAIS = ?";
            values.add(this.getFidNumPais());
        }

        if (this.getFidNumRama() != null && this.getFidNumRama().longValue() == -999) {
            conditions += " AND FID_NUM_RAMA IS NULL";
        } else if (this.getFidNumRama() != null) {
            conditions += " AND FID_NUM_RAMA = ?";
            values.add(this.getFidNumRama());
        }

        if (this.getFidNumSrama() != null && this.getFidNumSrama().longValue() == -999) {
            conditions += " AND FID_NUM_SRAMA IS NULL";
        } else if (this.getFidNumSrama() != null) {
            conditions += " AND FID_NUM_SRAMA = ?";
            values.add(this.getFidNumSrama());
        }

        if (this.getFidCveMigratoria() != null && "null".equals(this.getFidCveMigratoria())) {
            conditions += " AND FID_CVE_MIGRATORIA IS NULL";
        } else if (this.getFidCveMigratoria() != null) {
            conditions += " AND FID_CVE_MIGRATORIA = ?";
            values.add(this.getFidCveMigratoria());
        }

        if (this.getFidCveSexo() != null && "null".equals(this.getFidCveSexo())) {
            conditions += " AND FID_CVE_SEXO IS NULL";
        } else if (this.getFidCveSexo() != null) {
            conditions += " AND FID_CVE_SEXO = ?";
            values.add(this.getFidCveSexo());
        }

        if (this.getFidCveTipoPer() != null && "null".equals(this.getFidCveTipoPer())) {
            conditions += " AND FID_CVE_TIPO_PER IS NULL";
        } else if (this.getFidCveTipoPer() != null) {
            conditions += " AND FID_CVE_TIPO_PER = ?";
            values.add(this.getFidCveTipoPer());
        }

        if (this.getFidNomFideicom() != null && "null".equals(this.getFidNomFideicom())) {
            conditions += " AND FID_NOM_FIDEICOM IS NULL";
        } else if (this.getFidNomFideicom() != null) {
            conditions += " AND FID_NOM_FIDEICOM = ?";
            values.add(this.getFidNomFideicom());
        }

        if (this.getFidRfc() != null && "null".equals(this.getFidRfc())) {
            conditions += " AND FID_RFC IS NULL";
        } else if (this.getFidRfc() != null) {
            conditions += " AND FID_RFC = ?";
            values.add(this.getFidRfc());
        }

        if (this.getFidFecNac() != null && this.getFidFecNac().longValue() == -999) {
            conditions += " AND FID_FEC_NAC IS NULL";
        } else if (this.getFidFecNac() != null) {
            conditions += " AND FID_FEC_NAC = ?";
            values.add(this.getFidFecNac());
        }

        if (this.getFidNomNacional() != null && "null".equals(this.getFidNomNacional())) {
            conditions += " AND FID_NOM_NACIONAL IS NULL";
        } else if (this.getFidNomNacional() != null) {
            conditions += " AND FID_NOM_NACIONAL = ?";
            values.add(this.getFidNomNacional());
        }

        if (this.getFidNumLadaCasa() != null && "null".equals(this.getFidNumLadaCasa())) {
            conditions += " AND FID_NUM_LADA_CASA IS NULL";
        } else if (this.getFidNumLadaCasa() != null) {
            conditions += " AND FID_NUM_LADA_CASA = ?";
            values.add(this.getFidNumLadaCasa());
        }

        if (this.getFidNumTelefCasa() != null && "null".equals(this.getFidNumTelefCasa())) {
            conditions += " AND FID_NUM_TELEF_CASA IS NULL";
        } else if (this.getFidNumTelefCasa() != null) {
            conditions += " AND FID_NUM_TELEF_CASA = ?";
            values.add(this.getFidNumTelefCasa());
        }

        if (this.getFidNumLadaOfic() != null && "null".equals(this.getFidNumLadaOfic())) {
            conditions += " AND FID_NUM_LADA_OFIC IS NULL";
        } else if (this.getFidNumLadaOfic() != null) {
            conditions += " AND FID_NUM_LADA_OFIC = ?";
            values.add(this.getFidNumLadaOfic());
        }

        if (this.getFidNumTelefOfic() != null && "null".equals(this.getFidNumTelefOfic())) {
            conditions += " AND FID_NUM_TELEF_OFIC IS NULL";
        } else if (this.getFidNumTelefOfic() != null) {
            conditions += " AND FID_NUM_TELEF_OFIC = ?";
            values.add(this.getFidNumTelefOfic());
        }

        if (this.getFidNumExtOfic() != null && "null".equals(this.getFidNumExtOfic())) {
            conditions += " AND FID_NUM_EXT_OFIC IS NULL";
        } else if (this.getFidNumExtOfic() != null) {
            conditions += " AND FID_NUM_EXT_OFIC = ?";
            values.add(this.getFidNumExtOfic());
        }

        if (this.getFidNumLadaFax() != null && "null".equals(this.getFidNumLadaFax())) {
            conditions += " AND FID_NUM_LADA_FAX IS NULL";
        } else if (this.getFidNumLadaFax() != null) {
            conditions += " AND FID_NUM_LADA_FAX = ?";
            values.add(this.getFidNumLadaFax());
        }

        if (this.getFidNumTelefFax() != null && "null".equals(this.getFidNumTelefFax())) {
            conditions += " AND FID_NUM_TELEF_FAX IS NULL";
        } else if (this.getFidNumTelefFax() != null) {
            conditions += " AND FID_NUM_TELEF_FAX = ?";
            values.add(this.getFidNumTelefFax());
        }

        if (this.getFidNumExtFax() != null && "null".equals(this.getFidNumExtFax())) {
            conditions += " AND FID_NUM_EXT_FAX IS NULL";
        } else if (this.getFidNumExtFax() != null) {
            conditions += " AND FID_NUM_EXT_FAX = ?";
            values.add(this.getFidNumExtFax());
        }

        if (this.getFidAnoAltaReg() != null && this.getFidAnoAltaReg().longValue() == -999) {
            conditions += " AND FID_ANO_ALTA_REG IS NULL";
        } else if (this.getFidAnoAltaReg() != null) {
            conditions += " AND FID_ANO_ALTA_REG = ?";
            values.add(this.getFidAnoAltaReg());
        }

        if (this.getFidMesAltaReg() != null && this.getFidMesAltaReg().longValue() == -999) {
            conditions += " AND FID_MES_ALTA_REG IS NULL";
        } else if (this.getFidMesAltaReg() != null) {
            conditions += " AND FID_MES_ALTA_REG = ?";
            values.add(this.getFidMesAltaReg());
        }

        if (this.getFidDiaAltaReg() != null && this.getFidDiaAltaReg().longValue() == -999) {
            conditions += " AND FID_DIA_ALTA_REG IS NULL";
        } else if (this.getFidDiaAltaReg() != null) {
            conditions += " AND FID_DIA_ALTA_REG = ?";
            values.add(this.getFidDiaAltaReg());
        }

        if (this.getFidAnoUltMod() != null && this.getFidAnoUltMod().longValue() == -999) {
            conditions += " AND FID_ANO_ULT_MOD IS NULL";
        } else if (this.getFidAnoUltMod() != null) {
            conditions += " AND FID_ANO_ULT_MOD = ?";
            values.add(this.getFidAnoUltMod());
        }

        if (this.getFidMesUltMod() != null && this.getFidMesUltMod().longValue() == -999) {
            conditions += " AND FID_MES_ULT_MOD IS NULL";
        } else if (this.getFidMesUltMod() != null) {
            conditions += " AND FID_MES_ULT_MOD = ?";
            values.add(this.getFidMesUltMod());
        }

        if (this.getFidDiaUltMod() != null && this.getFidDiaUltMod().longValue() == -999) {
            conditions += " AND FID_DIA_ULT_MOD IS NULL";
        } else if (this.getFidDiaUltMod() != null) {
            conditions += " AND FID_DIA_ULT_MOD = ?";
            values.add(this.getFidDiaUltMod());
        }

        if (this.getFidCveStFideico() != null && "null".equals(this.getFidCveStFideico())) {
            conditions += " AND FID_CVE_ST_FIDEICO IS NULL";
        } else if (this.getFidCveStFideico() != null) {
            conditions += " AND FID_CVE_ST_FIDEICO = ?";
            values.add(this.getFidCveStFideico());
        }

        if (this.getFidCurp() != null && "null".equals(this.getFidCurp())) {
            conditions += " AND FID_CURP IS NULL";
        } else if (this.getFidCurp() != null) {
            conditions += " AND FID_CURP = ?";
            values.add(this.getFidCurp());
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
        String sql = "UPDATE FIDEICOMH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FID_NUM_CONTRATO = ?";
        pkValues.add(this.getFidNumContrato());
        conditions += " AND FID_FIDEICOMITENTE = ?";
        pkValues.add(this.getFidFideicomitente());
        fields += " FID_NUM_PAIS = ?, ";
        values.add(this.getFidNumPais());
        fields += " FID_NUM_RAMA = ?, ";
        values.add(this.getFidNumRama());
        fields += " FID_NUM_SRAMA = ?, ";
        values.add(this.getFidNumSrama());
        fields += " FID_CVE_MIGRATORIA = ?, ";
        values.add(this.getFidCveMigratoria());
        fields += " FID_CVE_SEXO = ?, ";
        values.add(this.getFidCveSexo());
        fields += " FID_CVE_TIPO_PER = ?, ";
        values.add(this.getFidCveTipoPer());
        fields += " FID_NOM_FIDEICOM = ?, ";
        values.add(this.getFidNomFideicom());
        fields += " FID_RFC = ?, ";
        values.add(this.getFidRfc());
        fields += " FID_FEC_NAC = ?, ";
        values.add(this.getFidFecNac());
        fields += " FID_NOM_NACIONAL = ?, ";
        values.add(this.getFidNomNacional());
        fields += " FID_NUM_LADA_CASA = ?, ";
        values.add(this.getFidNumLadaCasa());
        fields += " FID_NUM_TELEF_CASA = ?, ";
        values.add(this.getFidNumTelefCasa());
        fields += " FID_NUM_LADA_OFIC = ?, ";
        values.add(this.getFidNumLadaOfic());
        fields += " FID_NUM_TELEF_OFIC = ?, ";
        values.add(this.getFidNumTelefOfic());
        fields += " FID_NUM_EXT_OFIC = ?, ";
        values.add(this.getFidNumExtOfic());
        fields += " FID_NUM_LADA_FAX = ?, ";
        values.add(this.getFidNumLadaFax());
        fields += " FID_NUM_TELEF_FAX = ?, ";
        values.add(this.getFidNumTelefFax());
        fields += " FID_NUM_EXT_FAX = ?, ";
        values.add(this.getFidNumExtFax());
        fields += " FID_ANO_ALTA_REG = ?, ";
        values.add(this.getFidAnoAltaReg());
        fields += " FID_MES_ALTA_REG = ?, ";
        values.add(this.getFidMesAltaReg());
        fields += " FID_DIA_ALTA_REG = ?, ";
        values.add(this.getFidDiaAltaReg());
        fields += " FID_ANO_ULT_MOD = ?, ";
        values.add(this.getFidAnoUltMod());
        fields += " FID_MES_ULT_MOD = ?, ";
        values.add(this.getFidMesUltMod());
        fields += " FID_DIA_ULT_MOD = ?, ";
        values.add(this.getFidDiaUltMod());
        fields += " FID_CVE_ST_FIDEICO = ?, ";
        values.add(this.getFidCveStFideico());
        fields += " FID_CURP = ?, ";
        values.add(this.getFidCurp());
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
        String sql = "INSERT INTO FIDEICOMH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FID_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFidNumContrato());

        fields += ", FID_FIDEICOMITENTE";
        fieldValues += ", ?";
        values.add(this.getFidFideicomitente());

        fields += ", FID_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getFidNumPais());

        fields += ", FID_NUM_RAMA";
        fieldValues += ", ?";
        values.add(this.getFidNumRama());

        fields += ", FID_NUM_SRAMA";
        fieldValues += ", ?";
        values.add(this.getFidNumSrama());

        fields += ", FID_CVE_MIGRATORIA";
        fieldValues += ", ?";
        values.add(this.getFidCveMigratoria());

        fields += ", FID_CVE_SEXO";
        fieldValues += ", ?";
        values.add(this.getFidCveSexo());

        fields += ", FID_CVE_TIPO_PER";
        fieldValues += ", ?";
        values.add(this.getFidCveTipoPer());

        fields += ", FID_NOM_FIDEICOM";
        fieldValues += ", ?";
        values.add(this.getFidNomFideicom());

        fields += ", FID_RFC";
        fieldValues += ", ?";
        values.add(this.getFidRfc());

        fields += ", FID_FEC_NAC";
        fieldValues += ", ?";
        values.add(this.getFidFecNac());

        fields += ", FID_NOM_NACIONAL";
        fieldValues += ", ?";
        values.add(this.getFidNomNacional());

        fields += ", FID_NUM_LADA_CASA";
        fieldValues += ", ?";
        values.add(this.getFidNumLadaCasa());

        fields += ", FID_NUM_TELEF_CASA";
        fieldValues += ", ?";
        values.add(this.getFidNumTelefCasa());

        fields += ", FID_NUM_LADA_OFIC";
        fieldValues += ", ?";
        values.add(this.getFidNumLadaOfic());

        fields += ", FID_NUM_TELEF_OFIC";
        fieldValues += ", ?";
        values.add(this.getFidNumTelefOfic());

        fields += ", FID_NUM_EXT_OFIC";
        fieldValues += ", ?";
        values.add(this.getFidNumExtOfic());

        fields += ", FID_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getFidNumLadaFax());

        fields += ", FID_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getFidNumTelefFax());

        fields += ", FID_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getFidNumExtFax());

        fields += ", FID_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFidAnoAltaReg());

        fields += ", FID_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFidMesAltaReg());

        fields += ", FID_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFidDiaAltaReg());

        fields += ", FID_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFidAnoUltMod());

        fields += ", FID_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFidMesUltMod());

        fields += ", FID_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFidDiaUltMod());

        fields += ", FID_CVE_ST_FIDEICO";
        fieldValues += ", ?";
        values.add(this.getFidCveStFideico());

        fields += ", FID_CURP";
        fieldValues += ", ?";
        values.add(this.getFidCurp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FIDEICOMH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FID_NUM_CONTRATO = ?";
        values.add(this.getFidNumContrato());
        conditions += " AND FID_FIDEICOMITENTE = ?";
        values.add(this.getFidFideicomitente());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Fideicomh instance = (Fideicomh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFidNumContrato().equals(instance.getFidNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFidFideicomitente().equals(instance.getFidFideicomitente()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumPais().equals(instance.getFidNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumRama().equals(instance.getFidNumRama()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumSrama().equals(instance.getFidNumSrama()))
            equalObjects = false;
        if (equalObjects && !this.getFidCveMigratoria().equals(instance.getFidCveMigratoria()))
            equalObjects = false;
        if (equalObjects && !this.getFidCveSexo().equals(instance.getFidCveSexo()))
            equalObjects = false;
        if (equalObjects && !this.getFidCveTipoPer().equals(instance.getFidCveTipoPer()))
            equalObjects = false;
        if (equalObjects && !this.getFidNomFideicom().equals(instance.getFidNomFideicom()))
            equalObjects = false;
        if (equalObjects && !this.getFidRfc().equals(instance.getFidRfc()))
            equalObjects = false;
        if (equalObjects && !this.getFidFecNac().equals(instance.getFidFecNac()))
            equalObjects = false;
        if (equalObjects && !this.getFidNomNacional().equals(instance.getFidNomNacional()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumLadaCasa().equals(instance.getFidNumLadaCasa()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumTelefCasa().equals(instance.getFidNumTelefCasa()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumLadaOfic().equals(instance.getFidNumLadaOfic()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumTelefOfic().equals(instance.getFidNumTelefOfic()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumExtOfic().equals(instance.getFidNumExtOfic()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumLadaFax().equals(instance.getFidNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumTelefFax().equals(instance.getFidNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getFidNumExtFax().equals(instance.getFidNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getFidAnoAltaReg().equals(instance.getFidAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFidMesAltaReg().equals(instance.getFidMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFidDiaAltaReg().equals(instance.getFidDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFidAnoUltMod().equals(instance.getFidAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFidMesUltMod().equals(instance.getFidMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFidDiaUltMod().equals(instance.getFidDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFidCveStFideico().equals(instance.getFidCveStFideico()))
            equalObjects = false;
        if (equalObjects && !this.getFidCurp().equals(instance.getFidCurp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Fideicomh result = new Fideicomh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFidNumContrato((BigDecimal) objectData.getData("FID_NUM_CONTRATO"));
        result.setFidFideicomitente((BigDecimal) objectData.getData("FID_FIDEICOMITENTE"));
        result.setFidNumPais((BigDecimal) objectData.getData("FID_NUM_PAIS"));
        result.setFidNumRama((BigDecimal) objectData.getData("FID_NUM_RAMA"));
        result.setFidNumSrama((BigDecimal) objectData.getData("FID_NUM_SRAMA"));
        result.setFidCveMigratoria((String) objectData.getData("FID_CVE_MIGRATORIA"));
        result.setFidCveSexo((String) objectData.getData("FID_CVE_SEXO"));
        result.setFidCveTipoPer((String) objectData.getData("FID_CVE_TIPO_PER"));
        result.setFidNomFideicom((String) objectData.getData("FID_NOM_FIDEICOM"));
        result.setFidRfc((String) objectData.getData("FID_RFC"));
        result.setFidFecNac((BigDecimal) objectData.getData("FID_FEC_NAC"));
        result.setFidNomNacional((String) objectData.getData("FID_NOM_NACIONAL"));
        result.setFidNumLadaCasa((String) objectData.getData("FID_NUM_LADA_CASA"));
        result.setFidNumTelefCasa((String) objectData.getData("FID_NUM_TELEF_CASA"));
        result.setFidNumLadaOfic((String) objectData.getData("FID_NUM_LADA_OFIC"));
        result.setFidNumTelefOfic((String) objectData.getData("FID_NUM_TELEF_OFIC"));
        result.setFidNumExtOfic((String) objectData.getData("FID_NUM_EXT_OFIC"));
        result.setFidNumLadaFax((String) objectData.getData("FID_NUM_LADA_FAX"));
        result.setFidNumTelefFax((String) objectData.getData("FID_NUM_TELEF_FAX"));
        result.setFidNumExtFax((String) objectData.getData("FID_NUM_EXT_FAX"));
        result.setFidAnoAltaReg((BigDecimal) objectData.getData("FID_ANO_ALTA_REG"));
        result.setFidMesAltaReg((BigDecimal) objectData.getData("FID_MES_ALTA_REG"));
        result.setFidDiaAltaReg((BigDecimal) objectData.getData("FID_DIA_ALTA_REG"));
        result.setFidAnoUltMod((BigDecimal) objectData.getData("FID_ANO_ULT_MOD"));
        result.setFidMesUltMod((BigDecimal) objectData.getData("FID_MES_ULT_MOD"));
        result.setFidDiaUltMod((BigDecimal) objectData.getData("FID_DIA_ULT_MOD"));
        result.setFidCveStFideico((String) objectData.getData("FID_CVE_ST_FIDEICO"));
        result.setFidCurp((String) objectData.getData("FID_CURP"));

        return result;

    }

}
