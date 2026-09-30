package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FORMDETA_PK", columns = { "FOD_NUM_FORMULA", "FOD_NUM_CLASIFIC", "FOD_NUM_TERMINO" }, sequences = { "MANUAL" })
public class Formdeta extends DomainObject {

    BigDecimal fodNumFormula = null;
    BigDecimal fodNumClasific = null;
    BigDecimal fodNumTermino = null;
    BigDecimal fodNumCveElemento = null;
    String fodNomTermino = null;
    BigDecimal fodTipoDato = null;
    BigDecimal fodNumModif = null;
    BigDecimal fodNumAplicaciones = null;
    BigDecimal fodAnoAltaReg = null;
    BigDecimal fodMesAltaReg = null;
    BigDecimal fodDiaAltaReg = null;
    BigDecimal fodAnoUltMod = null;
    BigDecimal fodMesUltMod = null;
    BigDecimal fodDiaUltMod = null;
    String fodCveStFormdeta = null;

    public Formdeta() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFodNumFormula(BigDecimal fodNumFormula) {
        this.fodNumFormula = fodNumFormula;
    }

    public BigDecimal getFodNumFormula() {
        return this.fodNumFormula;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFodNumClasific(BigDecimal fodNumClasific) {
        this.fodNumClasific = fodNumClasific;
    }

    public BigDecimal getFodNumClasific() {
        return this.fodNumClasific;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFodNumTermino(BigDecimal fodNumTermino) {
        this.fodNumTermino = fodNumTermino;
    }

    public BigDecimal getFodNumTermino() {
        return this.fodNumTermino;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFodNumCveElemento(BigDecimal fodNumCveElemento) {
        this.fodNumCveElemento = fodNumCveElemento;
    }

    public BigDecimal getFodNumCveElemento() {
        return this.fodNumCveElemento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFodNomTermino(String fodNomTermino) {
        this.fodNomTermino = fodNomTermino;
    }

    public String getFodNomTermino() {
        return this.fodNomTermino;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFodTipoDato(BigDecimal fodTipoDato) {
        this.fodTipoDato = fodTipoDato;
    }

    public BigDecimal getFodTipoDato() {
        return this.fodTipoDato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFodNumModif(BigDecimal fodNumModif) {
        this.fodNumModif = fodNumModif;
    }

    public BigDecimal getFodNumModif() {
        return this.fodNumModif;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setFodNumAplicaciones(BigDecimal fodNumAplicaciones) {
        this.fodNumAplicaciones = fodNumAplicaciones;
    }

    public BigDecimal getFodNumAplicaciones() {
        return this.fodNumAplicaciones;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFodAnoAltaReg(BigDecimal fodAnoAltaReg) {
        this.fodAnoAltaReg = fodAnoAltaReg;
    }

    public BigDecimal getFodAnoAltaReg() {
        return this.fodAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFodMesAltaReg(BigDecimal fodMesAltaReg) {
        this.fodMesAltaReg = fodMesAltaReg;
    }

    public BigDecimal getFodMesAltaReg() {
        return this.fodMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFodDiaAltaReg(BigDecimal fodDiaAltaReg) {
        this.fodDiaAltaReg = fodDiaAltaReg;
    }

    public BigDecimal getFodDiaAltaReg() {
        return this.fodDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFodAnoUltMod(BigDecimal fodAnoUltMod) {
        this.fodAnoUltMod = fodAnoUltMod;
    }

    public BigDecimal getFodAnoUltMod() {
        return this.fodAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFodMesUltMod(BigDecimal fodMesUltMod) {
        this.fodMesUltMod = fodMesUltMod;
    }

    public BigDecimal getFodMesUltMod() {
        return this.fodMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFodDiaUltMod(BigDecimal fodDiaUltMod) {
        this.fodDiaUltMod = fodDiaUltMod;
    }

    public BigDecimal getFodDiaUltMod() {
        return this.fodDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFodCveStFormdeta(String fodCveStFormdeta) {
        this.fodCveStFormdeta = fodCveStFormdeta;
    }

    public String getFodCveStFormdeta() {
        return this.fodCveStFormdeta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FORMDETA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFodNumFormula() != null && this.getFodNumFormula().longValue() == -999) {
            conditions += " AND FOD_NUM_FORMULA IS NULL";
        } else if (this.getFodNumFormula() != null) {
            conditions += " AND FOD_NUM_FORMULA = ?";
            values.add(this.getFodNumFormula());
        }

        if (this.getFodNumClasific() != null && this.getFodNumClasific().longValue() == -999) {
            conditions += " AND FOD_NUM_CLASIFIC IS NULL";
        } else if (this.getFodNumClasific() != null) {
            conditions += " AND FOD_NUM_CLASIFIC = ?";
            values.add(this.getFodNumClasific());
        }

        if (this.getFodNumTermino() != null && this.getFodNumTermino().longValue() == -999) {
            conditions += " AND FOD_NUM_TERMINO IS NULL";
        } else if (this.getFodNumTermino() != null) {
            conditions += " AND FOD_NUM_TERMINO = ?";
            values.add(this.getFodNumTermino());
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
        String sql = "SELECT * FROM FORMDETA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFodNumFormula() != null && this.getFodNumFormula().longValue() == -999) {
            conditions += " AND FOD_NUM_FORMULA IS NULL";
        } else if (this.getFodNumFormula() != null) {
            conditions += " AND FOD_NUM_FORMULA = ?";
            values.add(this.getFodNumFormula());
        }

        if (this.getFodNumClasific() != null && this.getFodNumClasific().longValue() == -999) {
            conditions += " AND FOD_NUM_CLASIFIC IS NULL";
        } else if (this.getFodNumClasific() != null) {
            conditions += " AND FOD_NUM_CLASIFIC = ?";
            values.add(this.getFodNumClasific());
        }

        if (this.getFodNumTermino() != null && this.getFodNumTermino().longValue() == -999) {
            conditions += " AND FOD_NUM_TERMINO IS NULL";
        } else if (this.getFodNumTermino() != null) {
            conditions += " AND FOD_NUM_TERMINO = ?";
            values.add(this.getFodNumTermino());
        }

        if (this.getFodNumCveElemento() != null && this.getFodNumCveElemento().longValue() == -999) {
            conditions += " AND FOD_NUM_CVE_ELEMENTO IS NULL";
        } else if (this.getFodNumCveElemento() != null) {
            conditions += " AND FOD_NUM_CVE_ELEMENTO = ?";
            values.add(this.getFodNumCveElemento());
        }

        if (this.getFodNomTermino() != null && "null".equals(this.getFodNomTermino())) {
            conditions += " AND FOD_NOM_TERMINO IS NULL";
        } else if (this.getFodNomTermino() != null) {
            conditions += " AND FOD_NOM_TERMINO = ?";
            values.add(this.getFodNomTermino());
        }

        if (this.getFodTipoDato() != null && this.getFodTipoDato().longValue() == -999) {
            conditions += " AND FOD_TIPO_DATO IS NULL";
        } else if (this.getFodTipoDato() != null) {
            conditions += " AND FOD_TIPO_DATO = ?";
            values.add(this.getFodTipoDato());
        }

        if (this.getFodNumModif() != null && this.getFodNumModif().longValue() == -999) {
            conditions += " AND FOD_NUM_MODIF IS NULL";
        } else if (this.getFodNumModif() != null) {
            conditions += " AND FOD_NUM_MODIF = ?";
            values.add(this.getFodNumModif());
        }

        if (this.getFodNumAplicaciones() != null && this.getFodNumAplicaciones().longValue() == -999) {
            conditions += " AND FOD_NUM_APLICACIONES IS NULL";
        } else if (this.getFodNumAplicaciones() != null) {
            conditions += " AND FOD_NUM_APLICACIONES = ?";
            values.add(this.getFodNumAplicaciones());
        }

        if (this.getFodAnoAltaReg() != null && this.getFodAnoAltaReg().longValue() == -999) {
            conditions += " AND FOD_ANO_ALTA_REG IS NULL";
        } else if (this.getFodAnoAltaReg() != null) {
            conditions += " AND FOD_ANO_ALTA_REG = ?";
            values.add(this.getFodAnoAltaReg());
        }

        if (this.getFodMesAltaReg() != null && this.getFodMesAltaReg().longValue() == -999) {
            conditions += " AND FOD_MES_ALTA_REG IS NULL";
        } else if (this.getFodMesAltaReg() != null) {
            conditions += " AND FOD_MES_ALTA_REG = ?";
            values.add(this.getFodMesAltaReg());
        }

        if (this.getFodDiaAltaReg() != null && this.getFodDiaAltaReg().longValue() == -999) {
            conditions += " AND FOD_DIA_ALTA_REG IS NULL";
        } else if (this.getFodDiaAltaReg() != null) {
            conditions += " AND FOD_DIA_ALTA_REG = ?";
            values.add(this.getFodDiaAltaReg());
        }

        if (this.getFodAnoUltMod() != null && this.getFodAnoUltMod().longValue() == -999) {
            conditions += " AND FOD_ANO_ULT_MOD IS NULL";
        } else if (this.getFodAnoUltMod() != null) {
            conditions += " AND FOD_ANO_ULT_MOD = ?";
            values.add(this.getFodAnoUltMod());
        }

        if (this.getFodMesUltMod() != null && this.getFodMesUltMod().longValue() == -999) {
            conditions += " AND FOD_MES_ULT_MOD IS NULL";
        } else if (this.getFodMesUltMod() != null) {
            conditions += " AND FOD_MES_ULT_MOD = ?";
            values.add(this.getFodMesUltMod());
        }

        if (this.getFodDiaUltMod() != null && this.getFodDiaUltMod().longValue() == -999) {
            conditions += " AND FOD_DIA_ULT_MOD IS NULL";
        } else if (this.getFodDiaUltMod() != null) {
            conditions += " AND FOD_DIA_ULT_MOD = ?";
            values.add(this.getFodDiaUltMod());
        }

        if (this.getFodCveStFormdeta() != null && "null".equals(this.getFodCveStFormdeta())) {
            conditions += " AND FOD_CVE_ST_FORMDETA IS NULL";
        } else if (this.getFodCveStFormdeta() != null) {
            conditions += " AND FOD_CVE_ST_FORMDETA = ?";
            values.add(this.getFodCveStFormdeta());
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
        String sql = "UPDATE FORMDETA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOD_NUM_FORMULA = ?";
        pkValues.add(this.getFodNumFormula());
        conditions += " AND FOD_NUM_CLASIFIC = ?";
        pkValues.add(this.getFodNumClasific());
        conditions += " AND FOD_NUM_TERMINO = ?";
        pkValues.add(this.getFodNumTermino());
        fields += " FOD_NUM_CVE_ELEMENTO = ?, ";
        values.add(this.getFodNumCveElemento());
        fields += " FOD_NOM_TERMINO = ?, ";
        values.add(this.getFodNomTermino());
        fields += " FOD_TIPO_DATO = ?, ";
        values.add(this.getFodTipoDato());
        fields += " FOD_NUM_MODIF = ?, ";
        values.add(this.getFodNumModif());
        fields += " FOD_NUM_APLICACIONES = ?, ";
        values.add(this.getFodNumAplicaciones());
        fields += " FOD_ANO_ALTA_REG = ?, ";
        values.add(this.getFodAnoAltaReg());
        fields += " FOD_MES_ALTA_REG = ?, ";
        values.add(this.getFodMesAltaReg());
        fields += " FOD_DIA_ALTA_REG = ?, ";
        values.add(this.getFodDiaAltaReg());
        fields += " FOD_ANO_ULT_MOD = ?, ";
        values.add(this.getFodAnoUltMod());
        fields += " FOD_MES_ULT_MOD = ?, ";
        values.add(this.getFodMesUltMod());
        fields += " FOD_DIA_ULT_MOD = ?, ";
        values.add(this.getFodDiaUltMod());
        fields += " FOD_CVE_ST_FORMDETA = ?, ";
        values.add(this.getFodCveStFormdeta());
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
        String sql = "INSERT INTO FORMDETA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOD_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getFodNumFormula());

        fields += ", FOD_NUM_CLASIFIC";
        fieldValues += ", ?";
        values.add(this.getFodNumClasific());

        fields += ", FOD_NUM_TERMINO";
        fieldValues += ", ?";
        values.add(this.getFodNumTermino());

        fields += ", FOD_NUM_CVE_ELEMENTO";
        fieldValues += ", ?";
        values.add(this.getFodNumCveElemento());

        fields += ", FOD_NOM_TERMINO";
        fieldValues += ", ?";
        values.add(this.getFodNomTermino());

        fields += ", FOD_TIPO_DATO";
        fieldValues += ", ?";
        values.add(this.getFodTipoDato());

        fields += ", FOD_NUM_MODIF";
        fieldValues += ", ?";
        values.add(this.getFodNumModif());

        fields += ", FOD_NUM_APLICACIONES";
        fieldValues += ", ?";
        values.add(this.getFodNumAplicaciones());

        fields += ", FOD_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFodAnoAltaReg());

        fields += ", FOD_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFodMesAltaReg());

        fields += ", FOD_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFodDiaAltaReg());

        fields += ", FOD_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFodAnoUltMod());

        fields += ", FOD_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFodMesUltMod());

        fields += ", FOD_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFodDiaUltMod());

        fields += ", FOD_CVE_ST_FORMDETA";
        fieldValues += ", ?";
        values.add(this.getFodCveStFormdeta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FORMDETA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOD_NUM_FORMULA = ?";
        values.add(this.getFodNumFormula());
        conditions += " AND FOD_NUM_CLASIFIC = ?";
        values.add(this.getFodNumClasific());
        conditions += " AND FOD_NUM_TERMINO = ?";
        values.add(this.getFodNumTermino());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Formdeta instance = (Formdeta) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFodNumFormula().equals(instance.getFodNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getFodNumClasific().equals(instance.getFodNumClasific()))
            equalObjects = false;
        if (equalObjects && !this.getFodNumTermino().equals(instance.getFodNumTermino()))
            equalObjects = false;
        if (equalObjects && !this.getFodNumCveElemento().equals(instance.getFodNumCveElemento()))
            equalObjects = false;
        if (equalObjects && !this.getFodNomTermino().equals(instance.getFodNomTermino()))
            equalObjects = false;
        if (equalObjects && !this.getFodTipoDato().equals(instance.getFodTipoDato()))
            equalObjects = false;
        if (equalObjects && !this.getFodNumModif().equals(instance.getFodNumModif()))
            equalObjects = false;
        if (equalObjects && !this.getFodNumAplicaciones().equals(instance.getFodNumAplicaciones()))
            equalObjects = false;
        if (equalObjects && !this.getFodAnoAltaReg().equals(instance.getFodAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFodMesAltaReg().equals(instance.getFodMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFodDiaAltaReg().equals(instance.getFodDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFodAnoUltMod().equals(instance.getFodAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFodMesUltMod().equals(instance.getFodMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFodDiaUltMod().equals(instance.getFodDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFodCveStFormdeta().equals(instance.getFodCveStFormdeta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Formdeta result = new Formdeta();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFodNumFormula((BigDecimal) objectData.getData("FOD_NUM_FORMULA"));
        result.setFodNumClasific((BigDecimal) objectData.getData("FOD_NUM_CLASIFIC"));
        result.setFodNumTermino((BigDecimal) objectData.getData("FOD_NUM_TERMINO"));
        result.setFodNumCveElemento((BigDecimal) objectData.getData("FOD_NUM_CVE_ELEMENTO"));
        result.setFodNomTermino((String) objectData.getData("FOD_NOM_TERMINO"));
        result.setFodTipoDato((BigDecimal) objectData.getData("FOD_TIPO_DATO"));
        result.setFodNumModif((BigDecimal) objectData.getData("FOD_NUM_MODIF"));
        result.setFodNumAplicaciones((BigDecimal) objectData.getData("FOD_NUM_APLICACIONES"));
        result.setFodAnoAltaReg((BigDecimal) objectData.getData("FOD_ANO_ALTA_REG"));
        result.setFodMesAltaReg((BigDecimal) objectData.getData("FOD_MES_ALTA_REG"));
        result.setFodDiaAltaReg((BigDecimal) objectData.getData("FOD_DIA_ALTA_REG"));
        result.setFodAnoUltMod((BigDecimal) objectData.getData("FOD_ANO_ULT_MOD"));
        result.setFodMesUltMod((BigDecimal) objectData.getData("FOD_MES_ULT_MOD"));
        result.setFodDiaUltMod((BigDecimal) objectData.getData("FOD_DIA_ULT_MOD"));
        result.setFodCveStFormdeta((String) objectData.getData("FOD_CVE_ST_FORMDETA"));

        return result;

    }

}
