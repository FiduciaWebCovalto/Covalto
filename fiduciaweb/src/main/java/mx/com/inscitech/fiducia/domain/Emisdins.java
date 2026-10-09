package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISDINS_PK", columns = { "EDI_NUM_PROGRAMA", "EDI_NUM_EMISION", "EDI_NUM_SEC_INSTRUMENTO" }, sequences = { "MANUAL" })
public class Emisdins extends DomainObject {

    BigDecimal ediNumPrograma = null;
    BigDecimal ediNumEmision = null;
    BigDecimal ediNumSecInstrumento = null;
    String ediCveInstrumento = null;
    BigDecimal ediPlazo = null;
    BigDecimal ediTasaCalculo = null;
    BigDecimal ediPlazoHasta = null;
    BigDecimal ediTasaEquivalente = null;
    BigDecimal ediTipoInstPlazo = null;
    BigDecimal ediAnoAltaReg = null;
    BigDecimal ediMesAltaReg = null;
    BigDecimal ediDiaAltaReg = null;
    BigDecimal ediAnoUltMod = null;
    BigDecimal ediMesUltMod = null;
    BigDecimal ediDiaUltMod = null;
    String ediCveStEmisdins = null;

    public Emisdins() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdiNumPrograma(BigDecimal ediNumPrograma) {
        this.ediNumPrograma = ediNumPrograma;
    }

    public BigDecimal getEdiNumPrograma() {
        return this.ediNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdiNumEmision(BigDecimal ediNumEmision) {
        this.ediNumEmision = ediNumEmision;
    }

    public BigDecimal getEdiNumEmision() {
        return this.ediNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdiNumSecInstrumento(BigDecimal ediNumSecInstrumento) {
        this.ediNumSecInstrumento = ediNumSecInstrumento;
    }

    public BigDecimal getEdiNumSecInstrumento() {
        return this.ediNumSecInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdiCveInstrumento(String ediCveInstrumento) {
        this.ediCveInstrumento = ediCveInstrumento;
    }

    public String getEdiCveInstrumento() {
        return this.ediCveInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdiPlazo(BigDecimal ediPlazo) {
        this.ediPlazo = ediPlazo;
    }

    public BigDecimal getEdiPlazo() {
        return this.ediPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEdiTasaCalculo(BigDecimal ediTasaCalculo) {
        this.ediTasaCalculo = ediTasaCalculo;
    }

    public BigDecimal getEdiTasaCalculo() {
        return this.ediTasaCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdiPlazoHasta(BigDecimal ediPlazoHasta) {
        this.ediPlazoHasta = ediPlazoHasta;
    }

    public BigDecimal getEdiPlazoHasta() {
        return this.ediPlazoHasta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEdiTasaEquivalente(BigDecimal ediTasaEquivalente) {
        this.ediTasaEquivalente = ediTasaEquivalente;
    }

    public BigDecimal getEdiTasaEquivalente() {
        return this.ediTasaEquivalente;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdiTipoInstPlazo(BigDecimal ediTipoInstPlazo) {
        this.ediTipoInstPlazo = ediTipoInstPlazo;
    }

    public BigDecimal getEdiTipoInstPlazo() {
        return this.ediTipoInstPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdiAnoAltaReg(BigDecimal ediAnoAltaReg) {
        this.ediAnoAltaReg = ediAnoAltaReg;
    }

    public BigDecimal getEdiAnoAltaReg() {
        return this.ediAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiMesAltaReg(BigDecimal ediMesAltaReg) {
        this.ediMesAltaReg = ediMesAltaReg;
    }

    public BigDecimal getEdiMesAltaReg() {
        return this.ediMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiDiaAltaReg(BigDecimal ediDiaAltaReg) {
        this.ediDiaAltaReg = ediDiaAltaReg;
    }

    public BigDecimal getEdiDiaAltaReg() {
        return this.ediDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdiAnoUltMod(BigDecimal ediAnoUltMod) {
        this.ediAnoUltMod = ediAnoUltMod;
    }

    public BigDecimal getEdiAnoUltMod() {
        return this.ediAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiMesUltMod(BigDecimal ediMesUltMod) {
        this.ediMesUltMod = ediMesUltMod;
    }

    public BigDecimal getEdiMesUltMod() {
        return this.ediMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiDiaUltMod(BigDecimal ediDiaUltMod) {
        this.ediDiaUltMod = ediDiaUltMod;
    }

    public BigDecimal getEdiDiaUltMod() {
        return this.ediDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdiCveStEmisdins(String ediCveStEmisdins) {
        this.ediCveStEmisdins = ediCveStEmisdins;
    }

    public String getEdiCveStEmisdins() {
        return this.ediCveStEmisdins;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISDINS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdiNumPrograma() != null && this.getEdiNumPrograma().longValue() == -999) {
            conditions += " AND EDI_NUM_PROGRAMA IS NULL";
        } else if (this.getEdiNumPrograma() != null) {
            conditions += " AND EDI_NUM_PROGRAMA = ?";
            values.add(this.getEdiNumPrograma());
        }

        if (this.getEdiNumEmision() != null && this.getEdiNumEmision().longValue() == -999) {
            conditions += " AND EDI_NUM_EMISION IS NULL";
        } else if (this.getEdiNumEmision() != null) {
            conditions += " AND EDI_NUM_EMISION = ?";
            values.add(this.getEdiNumEmision());
        }

        if (this.getEdiNumSecInstrumento() != null && this.getEdiNumSecInstrumento().longValue() == -999) {
            conditions += " AND EDI_NUM_SEC_INSTRUMENTO IS NULL";
        } else if (this.getEdiNumSecInstrumento() != null) {
            conditions += " AND EDI_NUM_SEC_INSTRUMENTO = ?";
            values.add(this.getEdiNumSecInstrumento());
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
        String sql = "SELECT * FROM EMISDINS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdiNumPrograma() != null && this.getEdiNumPrograma().longValue() == -999) {
            conditions += " AND EDI_NUM_PROGRAMA IS NULL";
        } else if (this.getEdiNumPrograma() != null) {
            conditions += " AND EDI_NUM_PROGRAMA = ?";
            values.add(this.getEdiNumPrograma());
        }

        if (this.getEdiNumEmision() != null && this.getEdiNumEmision().longValue() == -999) {
            conditions += " AND EDI_NUM_EMISION IS NULL";
        } else if (this.getEdiNumEmision() != null) {
            conditions += " AND EDI_NUM_EMISION = ?";
            values.add(this.getEdiNumEmision());
        }

        if (this.getEdiNumSecInstrumento() != null && this.getEdiNumSecInstrumento().longValue() == -999) {
            conditions += " AND EDI_NUM_SEC_INSTRUMENTO IS NULL";
        } else if (this.getEdiNumSecInstrumento() != null) {
            conditions += " AND EDI_NUM_SEC_INSTRUMENTO = ?";
            values.add(this.getEdiNumSecInstrumento());
        }

        if (this.getEdiCveInstrumento() != null && "null".equals(this.getEdiCveInstrumento())) {
            conditions += " AND EDI_CVE_INSTRUMENTO IS NULL";
        } else if (this.getEdiCveInstrumento() != null) {
            conditions += " AND EDI_CVE_INSTRUMENTO = ?";
            values.add(this.getEdiCveInstrumento());
        }

        if (this.getEdiPlazo() != null && this.getEdiPlazo().longValue() == -999) {
            conditions += " AND EDI_PLAZO IS NULL";
        } else if (this.getEdiPlazo() != null) {
            conditions += " AND EDI_PLAZO = ?";
            values.add(this.getEdiPlazo());
        }

        if (this.getEdiTasaCalculo() != null && this.getEdiTasaCalculo().longValue() == -999) {
            conditions += " AND EDI_TASA_CALCULO IS NULL";
        } else if (this.getEdiTasaCalculo() != null) {
            conditions += " AND EDI_TASA_CALCULO = ?";
            values.add(this.getEdiTasaCalculo());
        }

        if (this.getEdiPlazoHasta() != null && this.getEdiPlazoHasta().longValue() == -999) {
            conditions += " AND EDI_PLAZO_HASTA IS NULL";
        } else if (this.getEdiPlazoHasta() != null) {
            conditions += " AND EDI_PLAZO_HASTA = ?";
            values.add(this.getEdiPlazoHasta());
        }

        if (this.getEdiTasaEquivalente() != null && this.getEdiTasaEquivalente().longValue() == -999) {
            conditions += " AND EDI_TASA_EQUIVALENTE IS NULL";
        } else if (this.getEdiTasaEquivalente() != null) {
            conditions += " AND EDI_TASA_EQUIVALENTE = ?";
            values.add(this.getEdiTasaEquivalente());
        }

        if (this.getEdiTipoInstPlazo() != null && this.getEdiTipoInstPlazo().longValue() == -999) {
            conditions += " AND EDI_TIPO_INST_PLAZO IS NULL";
        } else if (this.getEdiTipoInstPlazo() != null) {
            conditions += " AND EDI_TIPO_INST_PLAZO = ?";
            values.add(this.getEdiTipoInstPlazo());
        }

        if (this.getEdiAnoAltaReg() != null && this.getEdiAnoAltaReg().longValue() == -999) {
            conditions += " AND EDI_ANO_ALTA_REG IS NULL";
        } else if (this.getEdiAnoAltaReg() != null) {
            conditions += " AND EDI_ANO_ALTA_REG = ?";
            values.add(this.getEdiAnoAltaReg());
        }

        if (this.getEdiMesAltaReg() != null && this.getEdiMesAltaReg().longValue() == -999) {
            conditions += " AND EDI_MES_ALTA_REG IS NULL";
        } else if (this.getEdiMesAltaReg() != null) {
            conditions += " AND EDI_MES_ALTA_REG = ?";
            values.add(this.getEdiMesAltaReg());
        }

        if (this.getEdiDiaAltaReg() != null && this.getEdiDiaAltaReg().longValue() == -999) {
            conditions += " AND EDI_DIA_ALTA_REG IS NULL";
        } else if (this.getEdiDiaAltaReg() != null) {
            conditions += " AND EDI_DIA_ALTA_REG = ?";
            values.add(this.getEdiDiaAltaReg());
        }

        if (this.getEdiAnoUltMod() != null && this.getEdiAnoUltMod().longValue() == -999) {
            conditions += " AND EDI_ANO_ULT_MOD IS NULL";
        } else if (this.getEdiAnoUltMod() != null) {
            conditions += " AND EDI_ANO_ULT_MOD = ?";
            values.add(this.getEdiAnoUltMod());
        }

        if (this.getEdiMesUltMod() != null && this.getEdiMesUltMod().longValue() == -999) {
            conditions += " AND EDI_MES_ULT_MOD IS NULL";
        } else if (this.getEdiMesUltMod() != null) {
            conditions += " AND EDI_MES_ULT_MOD = ?";
            values.add(this.getEdiMesUltMod());
        }

        if (this.getEdiDiaUltMod() != null && this.getEdiDiaUltMod().longValue() == -999) {
            conditions += " AND EDI_DIA_ULT_MOD IS NULL";
        } else if (this.getEdiDiaUltMod() != null) {
            conditions += " AND EDI_DIA_ULT_MOD = ?";
            values.add(this.getEdiDiaUltMod());
        }

        if (this.getEdiCveStEmisdins() != null && "null".equals(this.getEdiCveStEmisdins())) {
            conditions += " AND EDI_CVE_ST_EMISDINS IS NULL";
        } else if (this.getEdiCveStEmisdins() != null) {
            conditions += " AND EDI_CVE_ST_EMISDINS = ?";
            values.add(this.getEdiCveStEmisdins());
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
        String sql = "UPDATE EMISDINS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EDI_NUM_PROGRAMA = ?";
        pkValues.add(this.getEdiNumPrograma());
        conditions += " AND EDI_NUM_EMISION = ?";
        pkValues.add(this.getEdiNumEmision());
        conditions += " AND EDI_NUM_SEC_INSTRUMENTO = ?";
        pkValues.add(this.getEdiNumSecInstrumento());
        fields += " EDI_CVE_INSTRUMENTO = ?, ";
        values.add(this.getEdiCveInstrumento());
        fields += " EDI_PLAZO = ?, ";
        values.add(this.getEdiPlazo());
        fields += " EDI_TASA_CALCULO = ?, ";
        values.add(this.getEdiTasaCalculo());
        fields += " EDI_PLAZO_HASTA = ?, ";
        values.add(this.getEdiPlazoHasta());
        fields += " EDI_TASA_EQUIVALENTE = ?, ";
        values.add(this.getEdiTasaEquivalente());
        fields += " EDI_TIPO_INST_PLAZO = ?, ";
        values.add(this.getEdiTipoInstPlazo());
        fields += " EDI_ANO_ALTA_REG = ?, ";
        values.add(this.getEdiAnoAltaReg());
        fields += " EDI_MES_ALTA_REG = ?, ";
        values.add(this.getEdiMesAltaReg());
        fields += " EDI_DIA_ALTA_REG = ?, ";
        values.add(this.getEdiDiaAltaReg());
        fields += " EDI_ANO_ULT_MOD = ?, ";
        values.add(this.getEdiAnoUltMod());
        fields += " EDI_MES_ULT_MOD = ?, ";
        values.add(this.getEdiMesUltMod());
        fields += " EDI_DIA_ULT_MOD = ?, ";
        values.add(this.getEdiDiaUltMod());
        fields += " EDI_CVE_ST_EMISDINS = ?, ";
        values.add(this.getEdiCveStEmisdins());
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
        String sql = "INSERT INTO EMISDINS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EDI_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEdiNumPrograma());

        fields += ", EDI_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEdiNumEmision());

        fields += ", EDI_NUM_SEC_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getEdiNumSecInstrumento());

        fields += ", EDI_CVE_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getEdiCveInstrumento());

        fields += ", EDI_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEdiPlazo());

        fields += ", EDI_TASA_CALCULO";
        fieldValues += ", ?";
        values.add(this.getEdiTasaCalculo());

        fields += ", EDI_PLAZO_HASTA";
        fieldValues += ", ?";
        values.add(this.getEdiPlazoHasta());

        fields += ", EDI_TASA_EQUIVALENTE";
        fieldValues += ", ?";
        values.add(this.getEdiTasaEquivalente());

        fields += ", EDI_TIPO_INST_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEdiTipoInstPlazo());

        fields += ", EDI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdiAnoAltaReg());

        fields += ", EDI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdiMesAltaReg());

        fields += ", EDI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdiDiaAltaReg());

        fields += ", EDI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdiAnoUltMod());

        fields += ", EDI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdiMesUltMod());

        fields += ", EDI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdiDiaUltMod());

        fields += ", EDI_CVE_ST_EMISDINS";
        fieldValues += ", ?";
        values.add(this.getEdiCveStEmisdins());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISDINS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EDI_NUM_PROGRAMA = ?";
        values.add(this.getEdiNumPrograma());
        conditions += " AND EDI_NUM_EMISION = ?";
        values.add(this.getEdiNumEmision());
        conditions += " AND EDI_NUM_SEC_INSTRUMENTO = ?";
        values.add(this.getEdiNumSecInstrumento());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisdins instance = (Emisdins) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEdiNumPrograma().equals(instance.getEdiNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEdiNumEmision().equals(instance.getEdiNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEdiNumSecInstrumento().equals(instance.getEdiNumSecInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getEdiCveInstrumento().equals(instance.getEdiCveInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getEdiPlazo().equals(instance.getEdiPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEdiTasaCalculo().equals(instance.getEdiTasaCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getEdiPlazoHasta().equals(instance.getEdiPlazoHasta()))
            equalObjects = false;
        if (equalObjects && !this.getEdiTasaEquivalente().equals(instance.getEdiTasaEquivalente()))
            equalObjects = false;
        if (equalObjects && !this.getEdiTipoInstPlazo().equals(instance.getEdiTipoInstPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEdiAnoAltaReg().equals(instance.getEdiAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdiMesAltaReg().equals(instance.getEdiMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdiDiaAltaReg().equals(instance.getEdiDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdiAnoUltMod().equals(instance.getEdiAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdiMesUltMod().equals(instance.getEdiMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdiDiaUltMod().equals(instance.getEdiDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdiCveStEmisdins().equals(instance.getEdiCveStEmisdins()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisdins result = new Emisdins();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEdiNumPrograma((BigDecimal) objectData.getData("EDI_NUM_PROGRAMA"));
        result.setEdiNumEmision((BigDecimal) objectData.getData("EDI_NUM_EMISION"));
        result.setEdiNumSecInstrumento((BigDecimal) objectData.getData("EDI_NUM_SEC_INSTRUMENTO"));
        result.setEdiCveInstrumento((String) objectData.getData("EDI_CVE_INSTRUMENTO"));
        result.setEdiPlazo((BigDecimal) objectData.getData("EDI_PLAZO"));
        result.setEdiTasaCalculo((BigDecimal) objectData.getData("EDI_TASA_CALCULO"));
        result.setEdiPlazoHasta((BigDecimal) objectData.getData("EDI_PLAZO_HASTA"));
        result.setEdiTasaEquivalente((BigDecimal) objectData.getData("EDI_TASA_EQUIVALENTE"));
        result.setEdiTipoInstPlazo((BigDecimal) objectData.getData("EDI_TIPO_INST_PLAZO"));
        result.setEdiAnoAltaReg((BigDecimal) objectData.getData("EDI_ANO_ALTA_REG"));
        result.setEdiMesAltaReg((BigDecimal) objectData.getData("EDI_MES_ALTA_REG"));
        result.setEdiDiaAltaReg((BigDecimal) objectData.getData("EDI_DIA_ALTA_REG"));
        result.setEdiAnoUltMod((BigDecimal) objectData.getData("EDI_ANO_ULT_MOD"));
        result.setEdiMesUltMod((BigDecimal) objectData.getData("EDI_MES_ULT_MOD"));
        result.setEdiDiaUltMod((BigDecimal) objectData.getData("EDI_DIA_ULT_MOD"));
        result.setEdiCveStEmisdins((String) objectData.getData("EDI_CVE_ST_EMISDINS"));

        return result;

    }

}
