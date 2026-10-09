package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISOR_PK", columns = { "EMS_NUM_EMISOR" }, sequences = { "MAX" })
public class Emisor extends DomainObject {

    BigDecimal emsNumEmisor = null;
    BigDecimal emsNumPaisOrig = null;
    BigDecimal emsNumRama = null;
    BigDecimal emsNumSrama = null;
    BigDecimal emsCveExtranjero = null;
    String emsNomEmisor = null;
    String emsNomPaisOrig = null;
    BigDecimal emsAnoAltaReg = null;
    BigDecimal emsMesAltaReg = null;
    BigDecimal emsDiaAltaReg = null;
    BigDecimal emsAnoUltMod = null;
    BigDecimal emsMesUltMod = null;
    BigDecimal emsDiaUltMod = null;
    String emsCveStEmisor = null;

    public Emisor() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmsNumEmisor(BigDecimal emsNumEmisor) {
        this.emsNumEmisor = emsNumEmisor;
    }

    public BigDecimal getEmsNumEmisor() {
        return this.emsNumEmisor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmsNumPaisOrig(BigDecimal emsNumPaisOrig) {
        this.emsNumPaisOrig = emsNumPaisOrig;
    }

    public BigDecimal getEmsNumPaisOrig() {
        return this.emsNumPaisOrig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmsNumRama(BigDecimal emsNumRama) {
        this.emsNumRama = emsNumRama;
    }

    public BigDecimal getEmsNumRama() {
        return this.emsNumRama;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmsNumSrama(BigDecimal emsNumSrama) {
        this.emsNumSrama = emsNumSrama;
    }

    public BigDecimal getEmsNumSrama() {
        return this.emsNumSrama;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmsCveExtranjero(BigDecimal emsCveExtranjero) {
        this.emsCveExtranjero = emsCveExtranjero;
    }

    public BigDecimal getEmsCveExtranjero() {
        return this.emsCveExtranjero;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmsNomEmisor(String emsNomEmisor) {
        this.emsNomEmisor = emsNomEmisor;
    }

    public String getEmsNomEmisor() {
        return this.emsNomEmisor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmsNomPaisOrig(String emsNomPaisOrig) {
        this.emsNomPaisOrig = emsNomPaisOrig;
    }

    public String getEmsNomPaisOrig() {
        return this.emsNomPaisOrig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmsAnoAltaReg(BigDecimal emsAnoAltaReg) {
        this.emsAnoAltaReg = emsAnoAltaReg;
    }

    public BigDecimal getEmsAnoAltaReg() {
        return this.emsAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmsMesAltaReg(BigDecimal emsMesAltaReg) {
        this.emsMesAltaReg = emsMesAltaReg;
    }

    public BigDecimal getEmsMesAltaReg() {
        return this.emsMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmsDiaAltaReg(BigDecimal emsDiaAltaReg) {
        this.emsDiaAltaReg = emsDiaAltaReg;
    }

    public BigDecimal getEmsDiaAltaReg() {
        return this.emsDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmsAnoUltMod(BigDecimal emsAnoUltMod) {
        this.emsAnoUltMod = emsAnoUltMod;
    }

    public BigDecimal getEmsAnoUltMod() {
        return this.emsAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmsMesUltMod(BigDecimal emsMesUltMod) {
        this.emsMesUltMod = emsMesUltMod;
    }

    public BigDecimal getEmsMesUltMod() {
        return this.emsMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmsDiaUltMod(BigDecimal emsDiaUltMod) {
        this.emsDiaUltMod = emsDiaUltMod;
    }

    public BigDecimal getEmsDiaUltMod() {
        return this.emsDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmsCveStEmisor(String emsCveStEmisor) {
        this.emsCveStEmisor = emsCveStEmisor;
    }

    public String getEmsCveStEmisor() {
        return this.emsCveStEmisor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEmsNumEmisor() != null && this.getEmsNumEmisor().longValue() == -999) {
            conditions += " AND EMS_NUM_EMISOR IS NULL";
        } else if (this.getEmsNumEmisor() != null) {
            conditions += " AND EMS_NUM_EMISOR = ?";
            values.add(this.getEmsNumEmisor());
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
        String sql = "SELECT * FROM EMISOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEmsNumEmisor() != null && this.getEmsNumEmisor().longValue() == -999) {
            conditions += " AND EMS_NUM_EMISOR IS NULL";
        } else if (this.getEmsNumEmisor() != null) {
            conditions += " AND EMS_NUM_EMISOR = ?";
            values.add(this.getEmsNumEmisor());
        }

        if (this.getEmsNumPaisOrig() != null && this.getEmsNumPaisOrig().longValue() == -999) {
            conditions += " AND EMS_NUM_PAIS_ORIG IS NULL";
        } else if (this.getEmsNumPaisOrig() != null) {
            conditions += " AND EMS_NUM_PAIS_ORIG = ?";
            values.add(this.getEmsNumPaisOrig());
        }

        if (this.getEmsNumRama() != null && this.getEmsNumRama().longValue() == -999) {
            conditions += " AND EMS_NUM_RAMA IS NULL";
        } else if (this.getEmsNumRama() != null) {
            conditions += " AND EMS_NUM_RAMA = ?";
            values.add(this.getEmsNumRama());
        }

        if (this.getEmsNumSrama() != null && this.getEmsNumSrama().longValue() == -999) {
            conditions += " AND EMS_NUM_SRAMA IS NULL";
        } else if (this.getEmsNumSrama() != null) {
            conditions += " AND EMS_NUM_SRAMA = ?";
            values.add(this.getEmsNumSrama());
        }

        if (this.getEmsCveExtranjero() != null && this.getEmsCveExtranjero().longValue() == -999) {
            conditions += " AND EMS_CVE_EXTRANJERO IS NULL";
        } else if (this.getEmsCveExtranjero() != null) {
            conditions += " AND EMS_CVE_EXTRANJERO = ?";
            values.add(this.getEmsCveExtranjero());
        }

        if (this.getEmsNomEmisor() != null && "null".equals(this.getEmsNomEmisor())) {
            conditions += " AND EMS_NOM_EMISOR IS NULL";
        } else if (this.getEmsNomEmisor() != null) {
            conditions += " AND EMS_NOM_EMISOR = ?";
            values.add(this.getEmsNomEmisor());
        }

        if (this.getEmsNomPaisOrig() != null && "null".equals(this.getEmsNomPaisOrig())) {
            conditions += " AND EMS_NOM_PAIS_ORIG IS NULL";
        } else if (this.getEmsNomPaisOrig() != null) {
            conditions += " AND EMS_NOM_PAIS_ORIG = ?";
            values.add(this.getEmsNomPaisOrig());
        }

        if (this.getEmsAnoAltaReg() != null && this.getEmsAnoAltaReg().longValue() == -999) {
            conditions += " AND EMS_ANO_ALTA_REG IS NULL";
        } else if (this.getEmsAnoAltaReg() != null) {
            conditions += " AND EMS_ANO_ALTA_REG = ?";
            values.add(this.getEmsAnoAltaReg());
        }

        if (this.getEmsMesAltaReg() != null && this.getEmsMesAltaReg().longValue() == -999) {
            conditions += " AND EMS_MES_ALTA_REG IS NULL";
        } else if (this.getEmsMesAltaReg() != null) {
            conditions += " AND EMS_MES_ALTA_REG = ?";
            values.add(this.getEmsMesAltaReg());
        }

        if (this.getEmsDiaAltaReg() != null && this.getEmsDiaAltaReg().longValue() == -999) {
            conditions += " AND EMS_DIA_ALTA_REG IS NULL";
        } else if (this.getEmsDiaAltaReg() != null) {
            conditions += " AND EMS_DIA_ALTA_REG = ?";
            values.add(this.getEmsDiaAltaReg());
        }

        if (this.getEmsAnoUltMod() != null && this.getEmsAnoUltMod().longValue() == -999) {
            conditions += " AND EMS_ANO_ULT_MOD IS NULL";
        } else if (this.getEmsAnoUltMod() != null) {
            conditions += " AND EMS_ANO_ULT_MOD = ?";
            values.add(this.getEmsAnoUltMod());
        }

        if (this.getEmsMesUltMod() != null && this.getEmsMesUltMod().longValue() == -999) {
            conditions += " AND EMS_MES_ULT_MOD IS NULL";
        } else if (this.getEmsMesUltMod() != null) {
            conditions += " AND EMS_MES_ULT_MOD = ?";
            values.add(this.getEmsMesUltMod());
        }

        if (this.getEmsDiaUltMod() != null && this.getEmsDiaUltMod().longValue() == -999) {
            conditions += " AND EMS_DIA_ULT_MOD IS NULL";
        } else if (this.getEmsDiaUltMod() != null) {
            conditions += " AND EMS_DIA_ULT_MOD = ?";
            values.add(this.getEmsDiaUltMod());
        }

        if (this.getEmsCveStEmisor() != null && "null".equals(this.getEmsCveStEmisor())) {
            conditions += " AND EMS_CVE_ST_EMISOR IS NULL";
        } else if (this.getEmsCveStEmisor() != null) {
            conditions += " AND EMS_CVE_ST_EMISOR = ?";
            values.add(this.getEmsCveStEmisor());
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
        String sql = "UPDATE EMISOR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EMS_NUM_EMISOR = ?";
        pkValues.add(this.getEmsNumEmisor());
        fields += " EMS_NUM_PAIS_ORIG = ?, ";
        values.add(this.getEmsNumPaisOrig());
        fields += " EMS_NUM_RAMA = ?, ";
        values.add(this.getEmsNumRama());
        fields += " EMS_NUM_SRAMA = ?, ";
        values.add(this.getEmsNumSrama());
        fields += " EMS_CVE_EXTRANJERO = ?, ";
        values.add(this.getEmsCveExtranjero());
        fields += " EMS_NOM_EMISOR = ?, ";
        values.add(this.getEmsNomEmisor());
        fields += " EMS_NOM_PAIS_ORIG = ?, ";
        values.add(this.getEmsNomPaisOrig());
        fields += " EMS_ANO_ALTA_REG = ?, ";
        values.add(this.getEmsAnoAltaReg());
        fields += " EMS_MES_ALTA_REG = ?, ";
        values.add(this.getEmsMesAltaReg());
        fields += " EMS_DIA_ALTA_REG = ?, ";
        values.add(this.getEmsDiaAltaReg());
        fields += " EMS_ANO_ULT_MOD = ?, ";
        values.add(this.getEmsAnoUltMod());
        fields += " EMS_MES_ULT_MOD = ?, ";
        values.add(this.getEmsMesUltMod());
        fields += " EMS_DIA_ULT_MOD = ?, ";
        values.add(this.getEmsDiaUltMod());
        fields += " EMS_CVE_ST_EMISOR = ?, ";
        values.add(this.getEmsCveStEmisor());
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
        String sql = "INSERT INTO EMISOR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EMS_NUM_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEmsNumEmisor());

        fields += ", EMS_NUM_PAIS_ORIG";
        fieldValues += ", ?";
        values.add(this.getEmsNumPaisOrig());

        fields += ", EMS_NUM_RAMA";
        fieldValues += ", ?";
        values.add(this.getEmsNumRama());

        fields += ", EMS_NUM_SRAMA";
        fieldValues += ", ?";
        values.add(this.getEmsNumSrama());

        fields += ", EMS_CVE_EXTRANJERO";
        fieldValues += ", ?";
        values.add(this.getEmsCveExtranjero());

        fields += ", EMS_NOM_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEmsNomEmisor());

        fields += ", EMS_NOM_PAIS_ORIG";
        fieldValues += ", ?";
        values.add(this.getEmsNomPaisOrig());

        fields += ", EMS_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmsAnoAltaReg());

        fields += ", EMS_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmsMesAltaReg());

        fields += ", EMS_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmsDiaAltaReg());

        fields += ", EMS_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmsAnoUltMod());

        fields += ", EMS_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmsMesUltMod());

        fields += ", EMS_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmsDiaUltMod());

        fields += ", EMS_CVE_ST_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEmsCveStEmisor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISOR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EMS_NUM_EMISOR = ?";
        values.add(this.getEmsNumEmisor());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisor instance = (Emisor) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEmsNumEmisor().equals(instance.getEmsNumEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getEmsNumPaisOrig().equals(instance.getEmsNumPaisOrig()))
            equalObjects = false;
        if (equalObjects && !this.getEmsNumRama().equals(instance.getEmsNumRama()))
            equalObjects = false;
        if (equalObjects && !this.getEmsNumSrama().equals(instance.getEmsNumSrama()))
            equalObjects = false;
        if (equalObjects && !this.getEmsCveExtranjero().equals(instance.getEmsCveExtranjero()))
            equalObjects = false;
        if (equalObjects && !this.getEmsNomEmisor().equals(instance.getEmsNomEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getEmsNomPaisOrig().equals(instance.getEmsNomPaisOrig()))
            equalObjects = false;
        if (equalObjects && !this.getEmsAnoAltaReg().equals(instance.getEmsAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmsMesAltaReg().equals(instance.getEmsMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmsDiaAltaReg().equals(instance.getEmsDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmsAnoUltMod().equals(instance.getEmsAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmsMesUltMod().equals(instance.getEmsMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmsDiaUltMod().equals(instance.getEmsDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmsCveStEmisor().equals(instance.getEmsCveStEmisor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisor result = new Emisor();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEmsNumEmisor((BigDecimal) objectData.getData("EMS_NUM_EMISOR"));
        result.setEmsNumPaisOrig((BigDecimal) objectData.getData("EMS_NUM_PAIS_ORIG"));
        result.setEmsNumRama((BigDecimal) objectData.getData("EMS_NUM_RAMA"));
        result.setEmsNumSrama((BigDecimal) objectData.getData("EMS_NUM_SRAMA"));
        result.setEmsCveExtranjero((BigDecimal) objectData.getData("EMS_CVE_EXTRANJERO"));
        result.setEmsNomEmisor((String) objectData.getData("EMS_NOM_EMISOR"));
        result.setEmsNomPaisOrig((String) objectData.getData("EMS_NOM_PAIS_ORIG"));
        result.setEmsAnoAltaReg((BigDecimal) objectData.getData("EMS_ANO_ALTA_REG"));
        result.setEmsMesAltaReg((BigDecimal) objectData.getData("EMS_MES_ALTA_REG"));
        result.setEmsDiaAltaReg((BigDecimal) objectData.getData("EMS_DIA_ALTA_REG"));
        result.setEmsAnoUltMod((BigDecimal) objectData.getData("EMS_ANO_ULT_MOD"));
        result.setEmsMesUltMod((BigDecimal) objectData.getData("EMS_MES_ULT_MOD"));
        result.setEmsDiaUltMod((BigDecimal) objectData.getData("EMS_DIA_ULT_MOD"));
        result.setEmsCveStEmisor((String) objectData.getData("EMS_CVE_ST_EMISOR"));

        return result;

    }

}
