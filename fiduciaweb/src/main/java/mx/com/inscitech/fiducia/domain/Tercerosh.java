package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TERCEROSH_PK", columns = { "TER_NUM_CONTRATO", "TER_NUM_TERCERO" }, sequences = { "MANUAL" })
public class Tercerosh extends DomainObject {

    BigDecimal terNumContrato = null;
    BigDecimal terNumTercero = null;
    BigDecimal terNumPais = null;
    BigDecimal terNumRama = null;
    BigDecimal terNumSrama = null;
    String terCveMigratoria = null;
    String terCveSexo = null;
    String terCveTipoPers = null;
    String terNomTercero = null;
    String terRfc = null;
    String terNomNacional = null;
    String terNumLadaCasa = null;
    String terNumTelefCasa = null;
    String terNumLadaOfic = null;
    String terNumTelefOfic = null;
    String terNumExtOfic = null;
    String terNumLadaFax = null;
    String terNumTelefFax = null;
    String terNumExtFax = null;
    BigDecimal terAnoAltaReg = null;
    BigDecimal terMesAltaReg = null;
    BigDecimal terDiaAltaReg = null;
    BigDecimal terAnoUltMod = null;
    BigDecimal terMesUltMod = null;
    BigDecimal terDiaUltMod = null;
    String terCveStTercero = null;
    String terCurp = null;

    public Tercerosh() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTerNumContrato(BigDecimal terNumContrato) {
        this.terNumContrato = terNumContrato;
    }

    public BigDecimal getTerNumContrato() {
        return this.terNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTerNumTercero(BigDecimal terNumTercero) {
        this.terNumTercero = terNumTercero;
    }

    public BigDecimal getTerNumTercero() {
        return this.terNumTercero;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTerNumPais(BigDecimal terNumPais) {
        this.terNumPais = terNumPais;
    }

    public BigDecimal getTerNumPais() {
        return this.terNumPais;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTerNumRama(BigDecimal terNumRama) {
        this.terNumRama = terNumRama;
    }

    public BigDecimal getTerNumRama() {
        return this.terNumRama;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTerNumSrama(BigDecimal terNumSrama) {
        this.terNumSrama = terNumSrama;
    }

    public BigDecimal getTerNumSrama() {
        return this.terNumSrama;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerCveMigratoria(String terCveMigratoria) {
        this.terCveMigratoria = terCveMigratoria;
    }

    public String getTerCveMigratoria() {
        return this.terCveMigratoria;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerCveSexo(String terCveSexo) {
        this.terCveSexo = terCveSexo;
    }

    public String getTerCveSexo() {
        return this.terCveSexo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerCveTipoPers(String terCveTipoPers) {
        this.terCveTipoPers = terCveTipoPers;
    }

    public String getTerCveTipoPers() {
        return this.terCveTipoPers;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerNomTercero(String terNomTercero) {
        this.terNomTercero = terNomTercero;
    }

    public String getTerNomTercero() {
        return this.terNomTercero;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerRfc(String terRfc) {
        this.terRfc = terRfc;
    }

    public String getTerRfc() {
        return this.terRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerNomNacional(String terNomNacional) {
        this.terNomNacional = terNomNacional;
    }

    public String getTerNomNacional() {
        return this.terNomNacional;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerNumLadaCasa(String terNumLadaCasa) {
        this.terNumLadaCasa = terNumLadaCasa;
    }

    public String getTerNumLadaCasa() {
        return this.terNumLadaCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerNumTelefCasa(String terNumTelefCasa) {
        this.terNumTelefCasa = terNumTelefCasa;
    }

    public String getTerNumTelefCasa() {
        return this.terNumTelefCasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerNumLadaOfic(String terNumLadaOfic) {
        this.terNumLadaOfic = terNumLadaOfic;
    }

    public String getTerNumLadaOfic() {
        return this.terNumLadaOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerNumTelefOfic(String terNumTelefOfic) {
        this.terNumTelefOfic = terNumTelefOfic;
    }

    public String getTerNumTelefOfic() {
        return this.terNumTelefOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerNumExtOfic(String terNumExtOfic) {
        this.terNumExtOfic = terNumExtOfic;
    }

    public String getTerNumExtOfic() {
        return this.terNumExtOfic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerNumLadaFax(String terNumLadaFax) {
        this.terNumLadaFax = terNumLadaFax;
    }

    public String getTerNumLadaFax() {
        return this.terNumLadaFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerNumTelefFax(String terNumTelefFax) {
        this.terNumTelefFax = terNumTelefFax;
    }

    public String getTerNumTelefFax() {
        return this.terNumTelefFax;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerNumExtFax(String terNumExtFax) {
        this.terNumExtFax = terNumExtFax;
    }

    public String getTerNumExtFax() {
        return this.terNumExtFax;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTerAnoAltaReg(BigDecimal terAnoAltaReg) {
        this.terAnoAltaReg = terAnoAltaReg;
    }

    public BigDecimal getTerAnoAltaReg() {
        return this.terAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTerMesAltaReg(BigDecimal terMesAltaReg) {
        this.terMesAltaReg = terMesAltaReg;
    }

    public BigDecimal getTerMesAltaReg() {
        return this.terMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTerDiaAltaReg(BigDecimal terDiaAltaReg) {
        this.terDiaAltaReg = terDiaAltaReg;
    }

    public BigDecimal getTerDiaAltaReg() {
        return this.terDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTerAnoUltMod(BigDecimal terAnoUltMod) {
        this.terAnoUltMod = terAnoUltMod;
    }

    public BigDecimal getTerAnoUltMod() {
        return this.terAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTerMesUltMod(BigDecimal terMesUltMod) {
        this.terMesUltMod = terMesUltMod;
    }

    public BigDecimal getTerMesUltMod() {
        return this.terMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTerDiaUltMod(BigDecimal terDiaUltMod) {
        this.terDiaUltMod = terDiaUltMod;
    }

    public BigDecimal getTerDiaUltMod() {
        return this.terDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerCveStTercero(String terCveStTercero) {
        this.terCveStTercero = terCveStTercero;
    }

    public String getTerCveStTercero() {
        return this.terCveStTercero;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTerCurp(String terCurp) {
        this.terCurp = terCurp;
    }

    public String getTerCurp() {
        return this.terCurp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TERCEROSH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTerNumContrato() != null && this.getTerNumContrato().longValue() == -999) {
            conditions += " AND TER_NUM_CONTRATO IS NULL";
        } else if (this.getTerNumContrato() != null) {
            conditions += " AND TER_NUM_CONTRATO = ?";
            values.add(this.getTerNumContrato());
        }

        if (this.getTerNumTercero() != null && this.getTerNumTercero().longValue() == -999) {
            conditions += " AND TER_NUM_TERCERO IS NULL";
        } else if (this.getTerNumTercero() != null) {
            conditions += " AND TER_NUM_TERCERO = ?";
            values.add(this.getTerNumTercero());
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
        String sql = "SELECT * FROM TERCEROSH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTerNumContrato() != null && this.getTerNumContrato().longValue() == -999) {
            conditions += " AND TER_NUM_CONTRATO IS NULL";
        } else if (this.getTerNumContrato() != null) {
            conditions += " AND TER_NUM_CONTRATO = ?";
            values.add(this.getTerNumContrato());
        }

        if (this.getTerNumTercero() != null && this.getTerNumTercero().longValue() == -999) {
            conditions += " AND TER_NUM_TERCERO IS NULL";
        } else if (this.getTerNumTercero() != null) {
            conditions += " AND TER_NUM_TERCERO = ?";
            values.add(this.getTerNumTercero());
        }

        if (this.getTerNumPais() != null && this.getTerNumPais().longValue() == -999) {
            conditions += " AND TER_NUM_PAIS IS NULL";
        } else if (this.getTerNumPais() != null) {
            conditions += " AND TER_NUM_PAIS = ?";
            values.add(this.getTerNumPais());
        }

        if (this.getTerNumRama() != null && this.getTerNumRama().longValue() == -999) {
            conditions += " AND TER_NUM_RAMA IS NULL";
        } else if (this.getTerNumRama() != null) {
            conditions += " AND TER_NUM_RAMA = ?";
            values.add(this.getTerNumRama());
        }

        if (this.getTerNumSrama() != null && this.getTerNumSrama().longValue() == -999) {
            conditions += " AND TER_NUM_SRAMA IS NULL";
        } else if (this.getTerNumSrama() != null) {
            conditions += " AND TER_NUM_SRAMA = ?";
            values.add(this.getTerNumSrama());
        }

        if (this.getTerCveMigratoria() != null && "null".equals(this.getTerCveMigratoria())) {
            conditions += " AND TER_CVE_MIGRATORIA IS NULL";
        } else if (this.getTerCveMigratoria() != null) {
            conditions += " AND TER_CVE_MIGRATORIA = ?";
            values.add(this.getTerCveMigratoria());
        }

        if (this.getTerCveSexo() != null && "null".equals(this.getTerCveSexo())) {
            conditions += " AND TER_CVE_SEXO IS NULL";
        } else if (this.getTerCveSexo() != null) {
            conditions += " AND TER_CVE_SEXO = ?";
            values.add(this.getTerCveSexo());
        }

        if (this.getTerCveTipoPers() != null && "null".equals(this.getTerCveTipoPers())) {
            conditions += " AND TER_CVE_TIPO_PERS IS NULL";
        } else if (this.getTerCveTipoPers() != null) {
            conditions += " AND TER_CVE_TIPO_PERS = ?";
            values.add(this.getTerCveTipoPers());
        }

        if (this.getTerNomTercero() != null && "null".equals(this.getTerNomTercero())) {
            conditions += " AND TER_NOM_TERCERO IS NULL";
        } else if (this.getTerNomTercero() != null) {
            conditions += " AND TER_NOM_TERCERO = ?";
            values.add(this.getTerNomTercero());
        }

        if (this.getTerRfc() != null && "null".equals(this.getTerRfc())) {
            conditions += " AND TER_RFC IS NULL";
        } else if (this.getTerRfc() != null) {
            conditions += " AND TER_RFC = ?";
            values.add(this.getTerRfc());
        }

        if (this.getTerNomNacional() != null && "null".equals(this.getTerNomNacional())) {
            conditions += " AND TER_NOM_NACIONAL IS NULL";
        } else if (this.getTerNomNacional() != null) {
            conditions += " AND TER_NOM_NACIONAL = ?";
            values.add(this.getTerNomNacional());
        }

        if (this.getTerNumLadaCasa() != null && "null".equals(this.getTerNumLadaCasa())) {
            conditions += " AND TER_NUM_LADA_CASA IS NULL";
        } else if (this.getTerNumLadaCasa() != null) {
            conditions += " AND TER_NUM_LADA_CASA = ?";
            values.add(this.getTerNumLadaCasa());
        }

        if (this.getTerNumTelefCasa() != null && "null".equals(this.getTerNumTelefCasa())) {
            conditions += " AND TER_NUM_TELEF_CASA IS NULL";
        } else if (this.getTerNumTelefCasa() != null) {
            conditions += " AND TER_NUM_TELEF_CASA = ?";
            values.add(this.getTerNumTelefCasa());
        }

        if (this.getTerNumLadaOfic() != null && "null".equals(this.getTerNumLadaOfic())) {
            conditions += " AND TER_NUM_LADA_OFIC IS NULL";
        } else if (this.getTerNumLadaOfic() != null) {
            conditions += " AND TER_NUM_LADA_OFIC = ?";
            values.add(this.getTerNumLadaOfic());
        }

        if (this.getTerNumTelefOfic() != null && "null".equals(this.getTerNumTelefOfic())) {
            conditions += " AND TER_NUM_TELEF_OFIC IS NULL";
        } else if (this.getTerNumTelefOfic() != null) {
            conditions += " AND TER_NUM_TELEF_OFIC = ?";
            values.add(this.getTerNumTelefOfic());
        }

        if (this.getTerNumExtOfic() != null && "null".equals(this.getTerNumExtOfic())) {
            conditions += " AND TER_NUM_EXT_OFIC IS NULL";
        } else if (this.getTerNumExtOfic() != null) {
            conditions += " AND TER_NUM_EXT_OFIC = ?";
            values.add(this.getTerNumExtOfic());
        }

        if (this.getTerNumLadaFax() != null && "null".equals(this.getTerNumLadaFax())) {
            conditions += " AND TER_NUM_LADA_FAX IS NULL";
        } else if (this.getTerNumLadaFax() != null) {
            conditions += " AND TER_NUM_LADA_FAX = ?";
            values.add(this.getTerNumLadaFax());
        }

        if (this.getTerNumTelefFax() != null && "null".equals(this.getTerNumTelefFax())) {
            conditions += " AND TER_NUM_TELEF_FAX IS NULL";
        } else if (this.getTerNumTelefFax() != null) {
            conditions += " AND TER_NUM_TELEF_FAX = ?";
            values.add(this.getTerNumTelefFax());
        }

        if (this.getTerNumExtFax() != null && "null".equals(this.getTerNumExtFax())) {
            conditions += " AND TER_NUM_EXT_FAX IS NULL";
        } else if (this.getTerNumExtFax() != null) {
            conditions += " AND TER_NUM_EXT_FAX = ?";
            values.add(this.getTerNumExtFax());
        }

        if (this.getTerAnoAltaReg() != null && this.getTerAnoAltaReg().longValue() == -999) {
            conditions += " AND TER_ANO_ALTA_REG IS NULL";
        } else if (this.getTerAnoAltaReg() != null) {
            conditions += " AND TER_ANO_ALTA_REG = ?";
            values.add(this.getTerAnoAltaReg());
        }

        if (this.getTerMesAltaReg() != null && this.getTerMesAltaReg().longValue() == -999) {
            conditions += " AND TER_MES_ALTA_REG IS NULL";
        } else if (this.getTerMesAltaReg() != null) {
            conditions += " AND TER_MES_ALTA_REG = ?";
            values.add(this.getTerMesAltaReg());
        }

        if (this.getTerDiaAltaReg() != null && this.getTerDiaAltaReg().longValue() == -999) {
            conditions += " AND TER_DIA_ALTA_REG IS NULL";
        } else if (this.getTerDiaAltaReg() != null) {
            conditions += " AND TER_DIA_ALTA_REG = ?";
            values.add(this.getTerDiaAltaReg());
        }

        if (this.getTerAnoUltMod() != null && this.getTerAnoUltMod().longValue() == -999) {
            conditions += " AND TER_ANO_ULT_MOD IS NULL";
        } else if (this.getTerAnoUltMod() != null) {
            conditions += " AND TER_ANO_ULT_MOD = ?";
            values.add(this.getTerAnoUltMod());
        }

        if (this.getTerMesUltMod() != null && this.getTerMesUltMod().longValue() == -999) {
            conditions += " AND TER_MES_ULT_MOD IS NULL";
        } else if (this.getTerMesUltMod() != null) {
            conditions += " AND TER_MES_ULT_MOD = ?";
            values.add(this.getTerMesUltMod());
        }

        if (this.getTerDiaUltMod() != null && this.getTerDiaUltMod().longValue() == -999) {
            conditions += " AND TER_DIA_ULT_MOD IS NULL";
        } else if (this.getTerDiaUltMod() != null) {
            conditions += " AND TER_DIA_ULT_MOD = ?";
            values.add(this.getTerDiaUltMod());
        }

        if (this.getTerCveStTercero() != null && "null".equals(this.getTerCveStTercero())) {
            conditions += " AND TER_CVE_ST_TERCERO IS NULL";
        } else if (this.getTerCveStTercero() != null) {
            conditions += " AND TER_CVE_ST_TERCERO = ?";
            values.add(this.getTerCveStTercero());
        }

        if (this.getTerCurp() != null && "null".equals(this.getTerCurp())) {
            conditions += " AND TER_CURP IS NULL";
        } else if (this.getTerCurp() != null) {
            conditions += " AND TER_CURP = ?";
            values.add(this.getTerCurp());
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
        String sql = "UPDATE TERCEROSH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TER_NUM_CONTRATO = ?";
        pkValues.add(this.getTerNumContrato());
        conditions += " AND TER_NUM_TERCERO = ?";
        pkValues.add(this.getTerNumTercero());
        fields += " TER_NUM_PAIS = ?, ";
        values.add(this.getTerNumPais());
        fields += " TER_NUM_RAMA = ?, ";
        values.add(this.getTerNumRama());
        fields += " TER_NUM_SRAMA = ?, ";
        values.add(this.getTerNumSrama());
        fields += " TER_CVE_MIGRATORIA = ?, ";
        values.add(this.getTerCveMigratoria());
        fields += " TER_CVE_SEXO = ?, ";
        values.add(this.getTerCveSexo());
        fields += " TER_CVE_TIPO_PERS = ?, ";
        values.add(this.getTerCveTipoPers());
        fields += " TER_NOM_TERCERO = ?, ";
        values.add(this.getTerNomTercero());
        fields += " TER_RFC = ?, ";
        values.add(this.getTerRfc());
        fields += " TER_NOM_NACIONAL = ?, ";
        values.add(this.getTerNomNacional());
        fields += " TER_NUM_LADA_CASA = ?, ";
        values.add(this.getTerNumLadaCasa());
        fields += " TER_NUM_TELEF_CASA = ?, ";
        values.add(this.getTerNumTelefCasa());
        fields += " TER_NUM_LADA_OFIC = ?, ";
        values.add(this.getTerNumLadaOfic());
        fields += " TER_NUM_TELEF_OFIC = ?, ";
        values.add(this.getTerNumTelefOfic());
        fields += " TER_NUM_EXT_OFIC = ?, ";
        values.add(this.getTerNumExtOfic());
        fields += " TER_NUM_LADA_FAX = ?, ";
        values.add(this.getTerNumLadaFax());
        fields += " TER_NUM_TELEF_FAX = ?, ";
        values.add(this.getTerNumTelefFax());
        fields += " TER_NUM_EXT_FAX = ?, ";
        values.add(this.getTerNumExtFax());
        fields += " TER_ANO_ALTA_REG = ?, ";
        values.add(this.getTerAnoAltaReg());
        fields += " TER_MES_ALTA_REG = ?, ";
        values.add(this.getTerMesAltaReg());
        fields += " TER_DIA_ALTA_REG = ?, ";
        values.add(this.getTerDiaAltaReg());
        fields += " TER_ANO_ULT_MOD = ?, ";
        values.add(this.getTerAnoUltMod());
        fields += " TER_MES_ULT_MOD = ?, ";
        values.add(this.getTerMesUltMod());
        fields += " TER_DIA_ULT_MOD = ?, ";
        values.add(this.getTerDiaUltMod());
        fields += " TER_CVE_ST_TERCERO = ?, ";
        values.add(this.getTerCveStTercero());
        fields += " TER_CURP = ?, ";
        values.add(this.getTerCurp());
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
        String sql = "INSERT INTO TERCEROSH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TER_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getTerNumContrato());

        fields += ", TER_NUM_TERCERO";
        fieldValues += ", ?";
        values.add(this.getTerNumTercero());

        fields += ", TER_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getTerNumPais());

        fields += ", TER_NUM_RAMA";
        fieldValues += ", ?";
        values.add(this.getTerNumRama());

        fields += ", TER_NUM_SRAMA";
        fieldValues += ", ?";
        values.add(this.getTerNumSrama());

        fields += ", TER_CVE_MIGRATORIA";
        fieldValues += ", ?";
        values.add(this.getTerCveMigratoria());

        fields += ", TER_CVE_SEXO";
        fieldValues += ", ?";
        values.add(this.getTerCveSexo());

        fields += ", TER_CVE_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getTerCveTipoPers());

        fields += ", TER_NOM_TERCERO";
        fieldValues += ", ?";
        values.add(this.getTerNomTercero());

        fields += ", TER_RFC";
        fieldValues += ", ?";
        values.add(this.getTerRfc());

        fields += ", TER_NOM_NACIONAL";
        fieldValues += ", ?";
        values.add(this.getTerNomNacional());

        fields += ", TER_NUM_LADA_CASA";
        fieldValues += ", ?";
        values.add(this.getTerNumLadaCasa());

        fields += ", TER_NUM_TELEF_CASA";
        fieldValues += ", ?";
        values.add(this.getTerNumTelefCasa());

        fields += ", TER_NUM_LADA_OFIC";
        fieldValues += ", ?";
        values.add(this.getTerNumLadaOfic());

        fields += ", TER_NUM_TELEF_OFIC";
        fieldValues += ", ?";
        values.add(this.getTerNumTelefOfic());

        fields += ", TER_NUM_EXT_OFIC";
        fieldValues += ", ?";
        values.add(this.getTerNumExtOfic());

        fields += ", TER_NUM_LADA_FAX";
        fieldValues += ", ?";
        values.add(this.getTerNumLadaFax());

        fields += ", TER_NUM_TELEF_FAX";
        fieldValues += ", ?";
        values.add(this.getTerNumTelefFax());

        fields += ", TER_NUM_EXT_FAX";
        fieldValues += ", ?";
        values.add(this.getTerNumExtFax());

        fields += ", TER_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTerAnoAltaReg());

        fields += ", TER_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTerMesAltaReg());

        fields += ", TER_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTerDiaAltaReg());

        fields += ", TER_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTerAnoUltMod());

        fields += ", TER_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTerMesUltMod());

        fields += ", TER_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTerDiaUltMod());

        fields += ", TER_CVE_ST_TERCERO";
        fieldValues += ", ?";
        values.add(this.getTerCveStTercero());

        fields += ", TER_CURP";
        fieldValues += ", ?";
        values.add(this.getTerCurp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TERCEROSH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TER_NUM_CONTRATO = ?";
        values.add(this.getTerNumContrato());
        conditions += " AND TER_NUM_TERCERO = ?";
        values.add(this.getTerNumTercero());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Tercerosh instance = (Tercerosh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTerNumContrato().equals(instance.getTerNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumTercero().equals(instance.getTerNumTercero()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumPais().equals(instance.getTerNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumRama().equals(instance.getTerNumRama()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumSrama().equals(instance.getTerNumSrama()))
            equalObjects = false;
        if (equalObjects && !this.getTerCveMigratoria().equals(instance.getTerCveMigratoria()))
            equalObjects = false;
        if (equalObjects && !this.getTerCveSexo().equals(instance.getTerCveSexo()))
            equalObjects = false;
        if (equalObjects && !this.getTerCveTipoPers().equals(instance.getTerCveTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getTerNomTercero().equals(instance.getTerNomTercero()))
            equalObjects = false;
        if (equalObjects && !this.getTerRfc().equals(instance.getTerRfc()))
            equalObjects = false;
        if (equalObjects && !this.getTerNomNacional().equals(instance.getTerNomNacional()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumLadaCasa().equals(instance.getTerNumLadaCasa()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumTelefCasa().equals(instance.getTerNumTelefCasa()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumLadaOfic().equals(instance.getTerNumLadaOfic()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumTelefOfic().equals(instance.getTerNumTelefOfic()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumExtOfic().equals(instance.getTerNumExtOfic()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumLadaFax().equals(instance.getTerNumLadaFax()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumTelefFax().equals(instance.getTerNumTelefFax()))
            equalObjects = false;
        if (equalObjects && !this.getTerNumExtFax().equals(instance.getTerNumExtFax()))
            equalObjects = false;
        if (equalObjects && !this.getTerAnoAltaReg().equals(instance.getTerAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTerMesAltaReg().equals(instance.getTerMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTerDiaAltaReg().equals(instance.getTerDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTerAnoUltMod().equals(instance.getTerAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTerMesUltMod().equals(instance.getTerMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTerDiaUltMod().equals(instance.getTerDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTerCveStTercero().equals(instance.getTerCveStTercero()))
            equalObjects = false;
        if (equalObjects && !this.getTerCurp().equals(instance.getTerCurp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Tercerosh result = new Tercerosh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTerNumContrato((BigDecimal) objectData.getData("TER_NUM_CONTRATO"));
        result.setTerNumTercero((BigDecimal) objectData.getData("TER_NUM_TERCERO"));
        result.setTerNumPais((BigDecimal) objectData.getData("TER_NUM_PAIS"));
        result.setTerNumRama((BigDecimal) objectData.getData("TER_NUM_RAMA"));
        result.setTerNumSrama((BigDecimal) objectData.getData("TER_NUM_SRAMA"));
        result.setTerCveMigratoria((String) objectData.getData("TER_CVE_MIGRATORIA"));
        result.setTerCveSexo((String) objectData.getData("TER_CVE_SEXO"));
        result.setTerCveTipoPers((String) objectData.getData("TER_CVE_TIPO_PERS"));
        result.setTerNomTercero((String) objectData.getData("TER_NOM_TERCERO"));
        result.setTerRfc((String) objectData.getData("TER_RFC"));
        result.setTerNomNacional((String) objectData.getData("TER_NOM_NACIONAL"));
        result.setTerNumLadaCasa((String) objectData.getData("TER_NUM_LADA_CASA"));
        result.setTerNumTelefCasa((String) objectData.getData("TER_NUM_TELEF_CASA"));
        result.setTerNumLadaOfic((String) objectData.getData("TER_NUM_LADA_OFIC"));
        result.setTerNumTelefOfic((String) objectData.getData("TER_NUM_TELEF_OFIC"));
        result.setTerNumExtOfic((String) objectData.getData("TER_NUM_EXT_OFIC"));
        result.setTerNumLadaFax((String) objectData.getData("TER_NUM_LADA_FAX"));
        result.setTerNumTelefFax((String) objectData.getData("TER_NUM_TELEF_FAX"));
        result.setTerNumExtFax((String) objectData.getData("TER_NUM_EXT_FAX"));
        result.setTerAnoAltaReg((BigDecimal) objectData.getData("TER_ANO_ALTA_REG"));
        result.setTerMesAltaReg((BigDecimal) objectData.getData("TER_MES_ALTA_REG"));
        result.setTerDiaAltaReg((BigDecimal) objectData.getData("TER_DIA_ALTA_REG"));
        result.setTerAnoUltMod((BigDecimal) objectData.getData("TER_ANO_ULT_MOD"));
        result.setTerMesUltMod((BigDecimal) objectData.getData("TER_MES_ULT_MOD"));
        result.setTerDiaUltMod((BigDecimal) objectData.getData("TER_DIA_ULT_MOD"));
        result.setTerCveStTercero((String) objectData.getData("TER_CVE_ST_TERCERO"));
        result.setTerCurp((String) objectData.getData("TER_CURP"));

        return result;

    }

}
