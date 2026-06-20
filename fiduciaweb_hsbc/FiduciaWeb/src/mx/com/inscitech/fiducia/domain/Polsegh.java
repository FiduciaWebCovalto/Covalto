package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "POLSEGH_PK", columns = { "PSE_POLIZA_SEG", "PSE_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Polsegh extends DomainObject {

    BigDecimal pseNumContrato = null;
    String psePolizaSeg = null;
    String pseCveTipoPoli = null;
    String pseTitularPoliza = null;
    BigDecimal pseSumaAsegura = null;
    BigDecimal pseImpPrima = null;
    BigDecimal pseImpDeducible = null;
    String pseTexCobertura = null;
    String pseAseguradora = null;
    String pseNomAgente = null;
    String pseTelAgente = null;
    BigDecimal pseAnoIniVig = null;
    BigDecimal pseMesIniVig = null;
    BigDecimal pseDiaIniVig = null;
    BigDecimal pseAnoFinalVig = null;
    BigDecimal pseMesFinalVig = null;
    BigDecimal pseDiaFinalVig = null;
    BigDecimal pseAnoAltaReg = null;
    BigDecimal pseMesAltaReg = null;
    BigDecimal pseDiaAltaReg = null;
    BigDecimal pseAnoUltMod = null;
    BigDecimal pseMesUltMod = null;
    BigDecimal pseDiaUltMod = null;
    String pseCveStPolseg = null;
    String pseNomCustodio = null;

    public Polsegh() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPseNumContrato(BigDecimal pseNumContrato) {
        this.pseNumContrato = pseNumContrato;
    }

    public BigDecimal getPseNumContrato() {
        return this.pseNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPsePolizaSeg(String psePolizaSeg) {
        this.psePolizaSeg = psePolizaSeg;
    }

    public String getPsePolizaSeg() {
        return this.psePolizaSeg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPseCveTipoPoli(String pseCveTipoPoli) {
        this.pseCveTipoPoli = pseCveTipoPoli;
    }

    public String getPseCveTipoPoli() {
        return this.pseCveTipoPoli;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPseTitularPoliza(String pseTitularPoliza) {
        this.pseTitularPoliza = pseTitularPoliza;
    }

    public String getPseTitularPoliza() {
        return this.pseTitularPoliza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPseSumaAsegura(BigDecimal pseSumaAsegura) {
        this.pseSumaAsegura = pseSumaAsegura;
    }

    public BigDecimal getPseSumaAsegura() {
        return this.pseSumaAsegura;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPseImpPrima(BigDecimal pseImpPrima) {
        this.pseImpPrima = pseImpPrima;
    }

    public BigDecimal getPseImpPrima() {
        return this.pseImpPrima;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPseImpDeducible(BigDecimal pseImpDeducible) {
        this.pseImpDeducible = pseImpDeducible;
    }

    public BigDecimal getPseImpDeducible() {
        return this.pseImpDeducible;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPseTexCobertura(String pseTexCobertura) {
        this.pseTexCobertura = pseTexCobertura;
    }

    public String getPseTexCobertura() {
        return this.pseTexCobertura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPseAseguradora(String pseAseguradora) {
        this.pseAseguradora = pseAseguradora;
    }

    public String getPseAseguradora() {
        return this.pseAseguradora;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPseNomAgente(String pseNomAgente) {
        this.pseNomAgente = pseNomAgente;
    }

    public String getPseNomAgente() {
        return this.pseNomAgente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPseTelAgente(String pseTelAgente) {
        this.pseTelAgente = pseTelAgente;
    }

    public String getPseTelAgente() {
        return this.pseTelAgente;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPseAnoIniVig(BigDecimal pseAnoIniVig) {
        this.pseAnoIniVig = pseAnoIniVig;
    }

    public BigDecimal getPseAnoIniVig() {
        return this.pseAnoIniVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPseMesIniVig(BigDecimal pseMesIniVig) {
        this.pseMesIniVig = pseMesIniVig;
    }

    public BigDecimal getPseMesIniVig() {
        return this.pseMesIniVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPseDiaIniVig(BigDecimal pseDiaIniVig) {
        this.pseDiaIniVig = pseDiaIniVig;
    }

    public BigDecimal getPseDiaIniVig() {
        return this.pseDiaIniVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPseAnoFinalVig(BigDecimal pseAnoFinalVig) {
        this.pseAnoFinalVig = pseAnoFinalVig;
    }

    public BigDecimal getPseAnoFinalVig() {
        return this.pseAnoFinalVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPseMesFinalVig(BigDecimal pseMesFinalVig) {
        this.pseMesFinalVig = pseMesFinalVig;
    }

    public BigDecimal getPseMesFinalVig() {
        return this.pseMesFinalVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPseDiaFinalVig(BigDecimal pseDiaFinalVig) {
        this.pseDiaFinalVig = pseDiaFinalVig;
    }

    public BigDecimal getPseDiaFinalVig() {
        return this.pseDiaFinalVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPseAnoAltaReg(BigDecimal pseAnoAltaReg) {
        this.pseAnoAltaReg = pseAnoAltaReg;
    }

    public BigDecimal getPseAnoAltaReg() {
        return this.pseAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPseMesAltaReg(BigDecimal pseMesAltaReg) {
        this.pseMesAltaReg = pseMesAltaReg;
    }

    public BigDecimal getPseMesAltaReg() {
        return this.pseMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPseDiaAltaReg(BigDecimal pseDiaAltaReg) {
        this.pseDiaAltaReg = pseDiaAltaReg;
    }

    public BigDecimal getPseDiaAltaReg() {
        return this.pseDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPseAnoUltMod(BigDecimal pseAnoUltMod) {
        this.pseAnoUltMod = pseAnoUltMod;
    }

    public BigDecimal getPseAnoUltMod() {
        return this.pseAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPseMesUltMod(BigDecimal pseMesUltMod) {
        this.pseMesUltMod = pseMesUltMod;
    }

    public BigDecimal getPseMesUltMod() {
        return this.pseMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPseDiaUltMod(BigDecimal pseDiaUltMod) {
        this.pseDiaUltMod = pseDiaUltMod;
    }

    public BigDecimal getPseDiaUltMod() {
        return this.pseDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPseCveStPolseg(String pseCveStPolseg) {
        this.pseCveStPolseg = pseCveStPolseg;
    }

    public String getPseCveStPolseg() {
        return this.pseCveStPolseg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPseNomCustodio(String pseNomCustodio) {
        this.pseNomCustodio = pseNomCustodio;
    }

    public String getPseNomCustodio() {
        return this.pseNomCustodio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM POLSEGH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPseNumContrato() != null && this.getPseNumContrato().longValue() == -999) {
            conditions += " AND PSE_NUM_CONTRATO IS NULL";
        } else if (this.getPseNumContrato() != null) {
            conditions += " AND PSE_NUM_CONTRATO = ?";
            values.add(this.getPseNumContrato());
        }

        if (this.getPsePolizaSeg() != null && "null".equals(this.getPsePolizaSeg())) {
            conditions += " AND PSE_POLIZA_SEG IS NULL";
        } else if (this.getPsePolizaSeg() != null) {
            conditions += " AND PSE_POLIZA_SEG = ?";
            values.add(this.getPsePolizaSeg());
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
        String sql = "SELECT * FROM POLSEGH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPseNumContrato() != null && this.getPseNumContrato().longValue() == -999) {
            conditions += " AND PSE_NUM_CONTRATO IS NULL";
        } else if (this.getPseNumContrato() != null) {
            conditions += " AND PSE_NUM_CONTRATO = ?";
            values.add(this.getPseNumContrato());
        }

        if (this.getPsePolizaSeg() != null && "null".equals(this.getPsePolizaSeg())) {
            conditions += " AND PSE_POLIZA_SEG IS NULL";
        } else if (this.getPsePolizaSeg() != null) {
            conditions += " AND PSE_POLIZA_SEG = ?";
            values.add(this.getPsePolizaSeg());
        }

        if (this.getPseCveTipoPoli() != null && "null".equals(this.getPseCveTipoPoli())) {
            conditions += " AND PSE_CVE_TIPO_POLI IS NULL";
        } else if (this.getPseCveTipoPoli() != null) {
            conditions += " AND PSE_CVE_TIPO_POLI = ?";
            values.add(this.getPseCveTipoPoli());
        }

        if (this.getPseTitularPoliza() != null && "null".equals(this.getPseTitularPoliza())) {
            conditions += " AND PSE_TITULAR_POLIZA IS NULL";
        } else if (this.getPseTitularPoliza() != null) {
            conditions += " AND PSE_TITULAR_POLIZA = ?";
            values.add(this.getPseTitularPoliza());
        }

        if (this.getPseSumaAsegura() != null && this.getPseSumaAsegura().longValue() == -999) {
            conditions += " AND PSE_SUMA_ASEGURA IS NULL";
        } else if (this.getPseSumaAsegura() != null) {
            conditions += " AND PSE_SUMA_ASEGURA = ?";
            values.add(this.getPseSumaAsegura());
        }

        if (this.getPseImpPrima() != null && this.getPseImpPrima().longValue() == -999) {
            conditions += " AND PSE_IMP_PRIMA IS NULL";
        } else if (this.getPseImpPrima() != null) {
            conditions += " AND PSE_IMP_PRIMA = ?";
            values.add(this.getPseImpPrima());
        }

        if (this.getPseImpDeducible() != null && this.getPseImpDeducible().longValue() == -999) {
            conditions += " AND PSE_IMP_DEDUCIBLE IS NULL";
        } else if (this.getPseImpDeducible() != null) {
            conditions += " AND PSE_IMP_DEDUCIBLE = ?";
            values.add(this.getPseImpDeducible());
        }

        if (this.getPseTexCobertura() != null && "null".equals(this.getPseTexCobertura())) {
            conditions += " AND PSE_TEX_COBERTURA IS NULL";
        } else if (this.getPseTexCobertura() != null) {
            conditions += " AND PSE_TEX_COBERTURA = ?";
            values.add(this.getPseTexCobertura());
        }

        if (this.getPseAseguradora() != null && "null".equals(this.getPseAseguradora())) {
            conditions += " AND PSE_ASEGURADORA IS NULL";
        } else if (this.getPseAseguradora() != null) {
            conditions += " AND PSE_ASEGURADORA = ?";
            values.add(this.getPseAseguradora());
        }

        if (this.getPseNomAgente() != null && "null".equals(this.getPseNomAgente())) {
            conditions += " AND PSE_NOM_AGENTE IS NULL";
        } else if (this.getPseNomAgente() != null) {
            conditions += " AND PSE_NOM_AGENTE = ?";
            values.add(this.getPseNomAgente());
        }

        if (this.getPseTelAgente() != null && "null".equals(this.getPseTelAgente())) {
            conditions += " AND PSE_TEL_AGENTE IS NULL";
        } else if (this.getPseTelAgente() != null) {
            conditions += " AND PSE_TEL_AGENTE = ?";
            values.add(this.getPseTelAgente());
        }

        if (this.getPseAnoIniVig() != null && this.getPseAnoIniVig().longValue() == -999) {
            conditions += " AND PSE_ANO_INI_VIG IS NULL";
        } else if (this.getPseAnoIniVig() != null) {
            conditions += " AND PSE_ANO_INI_VIG = ?";
            values.add(this.getPseAnoIniVig());
        }

        if (this.getPseMesIniVig() != null && this.getPseMesIniVig().longValue() == -999) {
            conditions += " AND PSE_MES_INI_VIG IS NULL";
        } else if (this.getPseMesIniVig() != null) {
            conditions += " AND PSE_MES_INI_VIG = ?";
            values.add(this.getPseMesIniVig());
        }

        if (this.getPseDiaIniVig() != null && this.getPseDiaIniVig().longValue() == -999) {
            conditions += " AND PSE_DIA_INI_VIG IS NULL";
        } else if (this.getPseDiaIniVig() != null) {
            conditions += " AND PSE_DIA_INI_VIG = ?";
            values.add(this.getPseDiaIniVig());
        }

        if (this.getPseAnoFinalVig() != null && this.getPseAnoFinalVig().longValue() == -999) {
            conditions += " AND PSE_ANO_FINAL_VIG IS NULL";
        } else if (this.getPseAnoFinalVig() != null) {
            conditions += " AND PSE_ANO_FINAL_VIG = ?";
            values.add(this.getPseAnoFinalVig());
        }

        if (this.getPseMesFinalVig() != null && this.getPseMesFinalVig().longValue() == -999) {
            conditions += " AND PSE_MES_FINAL_VIG IS NULL";
        } else if (this.getPseMesFinalVig() != null) {
            conditions += " AND PSE_MES_FINAL_VIG = ?";
            values.add(this.getPseMesFinalVig());
        }

        if (this.getPseDiaFinalVig() != null && this.getPseDiaFinalVig().longValue() == -999) {
            conditions += " AND PSE_DIA_FINAL_VIG IS NULL";
        } else if (this.getPseDiaFinalVig() != null) {
            conditions += " AND PSE_DIA_FINAL_VIG = ?";
            values.add(this.getPseDiaFinalVig());
        }

        if (this.getPseAnoAltaReg() != null && this.getPseAnoAltaReg().longValue() == -999) {
            conditions += " AND PSE_ANO_ALTA_REG IS NULL";
        } else if (this.getPseAnoAltaReg() != null) {
            conditions += " AND PSE_ANO_ALTA_REG = ?";
            values.add(this.getPseAnoAltaReg());
        }

        if (this.getPseMesAltaReg() != null && this.getPseMesAltaReg().longValue() == -999) {
            conditions += " AND PSE_MES_ALTA_REG IS NULL";
        } else if (this.getPseMesAltaReg() != null) {
            conditions += " AND PSE_MES_ALTA_REG = ?";
            values.add(this.getPseMesAltaReg());
        }

        if (this.getPseDiaAltaReg() != null && this.getPseDiaAltaReg().longValue() == -999) {
            conditions += " AND PSE_DIA_ALTA_REG IS NULL";
        } else if (this.getPseDiaAltaReg() != null) {
            conditions += " AND PSE_DIA_ALTA_REG = ?";
            values.add(this.getPseDiaAltaReg());
        }

        if (this.getPseAnoUltMod() != null && this.getPseAnoUltMod().longValue() == -999) {
            conditions += " AND PSE_ANO_ULT_MOD IS NULL";
        } else if (this.getPseAnoUltMod() != null) {
            conditions += " AND PSE_ANO_ULT_MOD = ?";
            values.add(this.getPseAnoUltMod());
        }

        if (this.getPseMesUltMod() != null && this.getPseMesUltMod().longValue() == -999) {
            conditions += " AND PSE_MES_ULT_MOD IS NULL";
        } else if (this.getPseMesUltMod() != null) {
            conditions += " AND PSE_MES_ULT_MOD = ?";
            values.add(this.getPseMesUltMod());
        }

        if (this.getPseDiaUltMod() != null && this.getPseDiaUltMod().longValue() == -999) {
            conditions += " AND PSE_DIA_ULT_MOD IS NULL";
        } else if (this.getPseDiaUltMod() != null) {
            conditions += " AND PSE_DIA_ULT_MOD = ?";
            values.add(this.getPseDiaUltMod());
        }

        if (this.getPseCveStPolseg() != null && "null".equals(this.getPseCveStPolseg())) {
            conditions += " AND PSE_CVE_ST_POLSEG IS NULL";
        } else if (this.getPseCveStPolseg() != null) {
            conditions += " AND PSE_CVE_ST_POLSEG = ?";
            values.add(this.getPseCveStPolseg());
        }

        if (this.getPseNomCustodio() != null && "null".equals(this.getPseNomCustodio())) {
            conditions += " AND PSE_NOM_CUSTODIO IS NULL";
        } else if (this.getPseNomCustodio() != null) {
            conditions += " AND PSE_NOM_CUSTODIO = ?";
            values.add(this.getPseNomCustodio());
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
        String sql = "UPDATE POLSEGH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PSE_NUM_CONTRATO = ?";
        pkValues.add(this.getPseNumContrato());
        conditions += " AND PSE_POLIZA_SEG = ?";
        pkValues.add(this.getPsePolizaSeg());
        fields += " PSE_CVE_TIPO_POLI = ?, ";
        values.add(this.getPseCveTipoPoli());
        fields += " PSE_TITULAR_POLIZA = ?, ";
        values.add(this.getPseTitularPoliza());
        fields += " PSE_SUMA_ASEGURA = ?, ";
        values.add(this.getPseSumaAsegura());
        fields += " PSE_IMP_PRIMA = ?, ";
        values.add(this.getPseImpPrima());
        fields += " PSE_IMP_DEDUCIBLE = ?, ";
        values.add(this.getPseImpDeducible());
        fields += " PSE_TEX_COBERTURA = ?, ";
        values.add(this.getPseTexCobertura());
        fields += " PSE_ASEGURADORA = ?, ";
        values.add(this.getPseAseguradora());
        fields += " PSE_NOM_AGENTE = ?, ";
        values.add(this.getPseNomAgente());
        fields += " PSE_TEL_AGENTE = ?, ";
        values.add(this.getPseTelAgente());
        fields += " PSE_ANO_INI_VIG = ?, ";
        values.add(this.getPseAnoIniVig());
        fields += " PSE_MES_INI_VIG = ?, ";
        values.add(this.getPseMesIniVig());
        fields += " PSE_DIA_INI_VIG = ?, ";
        values.add(this.getPseDiaIniVig());
        fields += " PSE_ANO_FINAL_VIG = ?, ";
        values.add(this.getPseAnoFinalVig());
        fields += " PSE_MES_FINAL_VIG = ?, ";
        values.add(this.getPseMesFinalVig());
        fields += " PSE_DIA_FINAL_VIG = ?, ";
        values.add(this.getPseDiaFinalVig());
        fields += " PSE_ANO_ALTA_REG = ?, ";
        values.add(this.getPseAnoAltaReg());
        fields += " PSE_MES_ALTA_REG = ?, ";
        values.add(this.getPseMesAltaReg());
        fields += " PSE_DIA_ALTA_REG = ?, ";
        values.add(this.getPseDiaAltaReg());
        fields += " PSE_ANO_ULT_MOD = ?, ";
        values.add(this.getPseAnoUltMod());
        fields += " PSE_MES_ULT_MOD = ?, ";
        values.add(this.getPseMesUltMod());
        fields += " PSE_DIA_ULT_MOD = ?, ";
        values.add(this.getPseDiaUltMod());
        fields += " PSE_CVE_ST_POLSEG = ?, ";
        values.add(this.getPseCveStPolseg());
        fields += " PSE_NOM_CUSTODIO = ?, ";
        values.add(this.getPseNomCustodio());
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
        String sql = "INSERT INTO POLSEGH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PSE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPseNumContrato());

        fields += ", PSE_POLIZA_SEG";
        fieldValues += ", ?";
        values.add(this.getPsePolizaSeg());

        fields += ", PSE_CVE_TIPO_POLI";
        fieldValues += ", ?";
        values.add(this.getPseCveTipoPoli());

        fields += ", PSE_TITULAR_POLIZA";
        fieldValues += ", ?";
        values.add(this.getPseTitularPoliza());

        fields += ", PSE_SUMA_ASEGURA";
        fieldValues += ", ?";
        values.add(this.getPseSumaAsegura());

        fields += ", PSE_IMP_PRIMA";
        fieldValues += ", ?";
        values.add(this.getPseImpPrima());

        fields += ", PSE_IMP_DEDUCIBLE";
        fieldValues += ", ?";
        values.add(this.getPseImpDeducible());

        fields += ", PSE_TEX_COBERTURA";
        fieldValues += ", ?";
        values.add(this.getPseTexCobertura());

        fields += ", PSE_ASEGURADORA";
        fieldValues += ", ?";
        values.add(this.getPseAseguradora());

        fields += ", PSE_NOM_AGENTE";
        fieldValues += ", ?";
        values.add(this.getPseNomAgente());

        fields += ", PSE_TEL_AGENTE";
        fieldValues += ", ?";
        values.add(this.getPseTelAgente());

        fields += ", PSE_ANO_INI_VIG";
        fieldValues += ", ?";
        values.add(this.getPseAnoIniVig());

        fields += ", PSE_MES_INI_VIG";
        fieldValues += ", ?";
        values.add(this.getPseMesIniVig());

        fields += ", PSE_DIA_INI_VIG";
        fieldValues += ", ?";
        values.add(this.getPseDiaIniVig());

        fields += ", PSE_ANO_FINAL_VIG";
        fieldValues += ", ?";
        values.add(this.getPseAnoFinalVig());

        fields += ", PSE_MES_FINAL_VIG";
        fieldValues += ", ?";
        values.add(this.getPseMesFinalVig());

        fields += ", PSE_DIA_FINAL_VIG";
        fieldValues += ", ?";
        values.add(this.getPseDiaFinalVig());

        fields += ", PSE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPseAnoAltaReg());

        fields += ", PSE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPseMesAltaReg());

        fields += ", PSE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPseDiaAltaReg());

        fields += ", PSE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPseAnoUltMod());

        fields += ", PSE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPseMesUltMod());

        fields += ", PSE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPseDiaUltMod());

        fields += ", PSE_CVE_ST_POLSEG";
        fieldValues += ", ?";
        values.add(this.getPseCveStPolseg());

        fields += ", PSE_NOM_CUSTODIO";
        fieldValues += ", ?";
        values.add(this.getPseNomCustodio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM POLSEGH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PSE_NUM_CONTRATO = ?";
        values.add(this.getPseNumContrato());
        conditions += " AND PSE_POLIZA_SEG = ?";
        values.add(this.getPsePolizaSeg());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Polsegh instance = (Polsegh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPseNumContrato().equals(instance.getPseNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPsePolizaSeg().equals(instance.getPsePolizaSeg()))
            equalObjects = false;
        if (equalObjects && !this.getPseCveTipoPoli().equals(instance.getPseCveTipoPoli()))
            equalObjects = false;
        if (equalObjects && !this.getPseTitularPoliza().equals(instance.getPseTitularPoliza()))
            equalObjects = false;
        if (equalObjects && !this.getPseSumaAsegura().equals(instance.getPseSumaAsegura()))
            equalObjects = false;
        if (equalObjects && !this.getPseImpPrima().equals(instance.getPseImpPrima()))
            equalObjects = false;
        if (equalObjects && !this.getPseImpDeducible().equals(instance.getPseImpDeducible()))
            equalObjects = false;
        if (equalObjects && !this.getPseTexCobertura().equals(instance.getPseTexCobertura()))
            equalObjects = false;
        if (equalObjects && !this.getPseAseguradora().equals(instance.getPseAseguradora()))
            equalObjects = false;
        if (equalObjects && !this.getPseNomAgente().equals(instance.getPseNomAgente()))
            equalObjects = false;
        if (equalObjects && !this.getPseTelAgente().equals(instance.getPseTelAgente()))
            equalObjects = false;
        if (equalObjects && !this.getPseAnoIniVig().equals(instance.getPseAnoIniVig()))
            equalObjects = false;
        if (equalObjects && !this.getPseMesIniVig().equals(instance.getPseMesIniVig()))
            equalObjects = false;
        if (equalObjects && !this.getPseDiaIniVig().equals(instance.getPseDiaIniVig()))
            equalObjects = false;
        if (equalObjects && !this.getPseAnoFinalVig().equals(instance.getPseAnoFinalVig()))
            equalObjects = false;
        if (equalObjects && !this.getPseMesFinalVig().equals(instance.getPseMesFinalVig()))
            equalObjects = false;
        if (equalObjects && !this.getPseDiaFinalVig().equals(instance.getPseDiaFinalVig()))
            equalObjects = false;
        if (equalObjects && !this.getPseAnoAltaReg().equals(instance.getPseAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPseMesAltaReg().equals(instance.getPseMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPseDiaAltaReg().equals(instance.getPseDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPseAnoUltMod().equals(instance.getPseAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPseMesUltMod().equals(instance.getPseMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPseDiaUltMod().equals(instance.getPseDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPseCveStPolseg().equals(instance.getPseCveStPolseg()))
            equalObjects = false;
        if (equalObjects && !this.getPseNomCustodio().equals(instance.getPseNomCustodio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Polsegh result = new Polsegh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPseNumContrato((BigDecimal) objectData.getData("PSE_NUM_CONTRATO"));
        result.setPsePolizaSeg((String) objectData.getData("PSE_POLIZA_SEG"));
        result.setPseCveTipoPoli((String) objectData.getData("PSE_CVE_TIPO_POLI"));
        result.setPseTitularPoliza((String) objectData.getData("PSE_TITULAR_POLIZA"));
        result.setPseSumaAsegura((BigDecimal) objectData.getData("PSE_SUMA_ASEGURA"));
        result.setPseImpPrima((BigDecimal) objectData.getData("PSE_IMP_PRIMA"));
        result.setPseImpDeducible((BigDecimal) objectData.getData("PSE_IMP_DEDUCIBLE"));
        result.setPseTexCobertura((String) objectData.getData("PSE_TEX_COBERTURA"));
        result.setPseAseguradora((String) objectData.getData("PSE_ASEGURADORA"));
        result.setPseNomAgente((String) objectData.getData("PSE_NOM_AGENTE"));
        result.setPseTelAgente((String) objectData.getData("PSE_TEL_AGENTE"));
        result.setPseAnoIniVig((BigDecimal) objectData.getData("PSE_ANO_INI_VIG"));
        result.setPseMesIniVig((BigDecimal) objectData.getData("PSE_MES_INI_VIG"));
        result.setPseDiaIniVig((BigDecimal) objectData.getData("PSE_DIA_INI_VIG"));
        result.setPseAnoFinalVig((BigDecimal) objectData.getData("PSE_ANO_FINAL_VIG"));
        result.setPseMesFinalVig((BigDecimal) objectData.getData("PSE_MES_FINAL_VIG"));
        result.setPseDiaFinalVig((BigDecimal) objectData.getData("PSE_DIA_FINAL_VIG"));
        result.setPseAnoAltaReg((BigDecimal) objectData.getData("PSE_ANO_ALTA_REG"));
        result.setPseMesAltaReg((BigDecimal) objectData.getData("PSE_MES_ALTA_REG"));
        result.setPseDiaAltaReg((BigDecimal) objectData.getData("PSE_DIA_ALTA_REG"));
        result.setPseAnoUltMod((BigDecimal) objectData.getData("PSE_ANO_ULT_MOD"));
        result.setPseMesUltMod((BigDecimal) objectData.getData("PSE_MES_ULT_MOD"));
        result.setPseDiaUltMod((BigDecimal) objectData.getData("PSE_DIA_ULT_MOD"));
        result.setPseCveStPolseg((String) objectData.getData("PSE_CVE_ST_POLSEG"));
        result.setPseNomCustodio((String) objectData.getData("PSE_NOM_CUSTODIO"));

        return result;

    }

}
