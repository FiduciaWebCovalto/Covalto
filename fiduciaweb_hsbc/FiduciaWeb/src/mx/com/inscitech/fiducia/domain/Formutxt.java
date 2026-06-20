package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FORMUTXT_PK", columns = { "FOT_NUM_FORMULA", "FOT_NUM_CLASIFIC" }, sequences = { "MANUAL" })
public class Formutxt extends DomainObject {

    BigDecimal fotNumFormula = null;
    BigDecimal fotNumClasific = null;
    String fotNomFormula = null;
    String fotTextoFormula = null;
    BigDecimal fotAnoAltaReg = null;
    BigDecimal fotMesAltaReg = null;
    BigDecimal fotDiaAltaReg = null;
    BigDecimal fotAnoUltMod = null;
    BigDecimal fotMesUltMod = null;
    BigDecimal fotDiaUltMod = null;
    String fotCveStFormutxt = null;

    public Formutxt() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFotNumFormula(BigDecimal fotNumFormula) {
        this.fotNumFormula = fotNumFormula;
    }

    public BigDecimal getFotNumFormula() {
        return this.fotNumFormula;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFotNumClasific(BigDecimal fotNumClasific) {
        this.fotNumClasific = fotNumClasific;
    }

    public BigDecimal getFotNumClasific() {
        return this.fotNumClasific;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFotNomFormula(String fotNomFormula) {
        this.fotNomFormula = fotNomFormula;
    }

    public String getFotNomFormula() {
        return this.fotNomFormula;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFotTextoFormula(String fotTextoFormula) {
        this.fotTextoFormula = fotTextoFormula;
    }

    public String getFotTextoFormula() {
        return this.fotTextoFormula;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFotAnoAltaReg(BigDecimal fotAnoAltaReg) {
        this.fotAnoAltaReg = fotAnoAltaReg;
    }

    public BigDecimal getFotAnoAltaReg() {
        return this.fotAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFotMesAltaReg(BigDecimal fotMesAltaReg) {
        this.fotMesAltaReg = fotMesAltaReg;
    }

    public BigDecimal getFotMesAltaReg() {
        return this.fotMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFotDiaAltaReg(BigDecimal fotDiaAltaReg) {
        this.fotDiaAltaReg = fotDiaAltaReg;
    }

    public BigDecimal getFotDiaAltaReg() {
        return this.fotDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFotAnoUltMod(BigDecimal fotAnoUltMod) {
        this.fotAnoUltMod = fotAnoUltMod;
    }

    public BigDecimal getFotAnoUltMod() {
        return this.fotAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFotMesUltMod(BigDecimal fotMesUltMod) {
        this.fotMesUltMod = fotMesUltMod;
    }

    public BigDecimal getFotMesUltMod() {
        return this.fotMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFotDiaUltMod(BigDecimal fotDiaUltMod) {
        this.fotDiaUltMod = fotDiaUltMod;
    }

    public BigDecimal getFotDiaUltMod() {
        return this.fotDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFotCveStFormutxt(String fotCveStFormutxt) {
        this.fotCveStFormutxt = fotCveStFormutxt;
    }

    public String getFotCveStFormutxt() {
        return this.fotCveStFormutxt;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FORMUTXT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFotNumFormula() != null && this.getFotNumFormula().longValue() == -999) {
            conditions += " AND FOT_NUM_FORMULA IS NULL";
        } else if (this.getFotNumFormula() != null) {
            conditions += " AND FOT_NUM_FORMULA = ?";
            values.add(this.getFotNumFormula());
        }

        if (this.getFotNumClasific() != null && this.getFotNumClasific().longValue() == -999) {
            conditions += " AND FOT_NUM_CLASIFIC IS NULL";
        } else if (this.getFotNumClasific() != null) {
            conditions += " AND FOT_NUM_CLASIFIC = ?";
            values.add(this.getFotNumClasific());
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
        String sql = "SELECT * FROM FORMUTXT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFotNumFormula() != null && this.getFotNumFormula().longValue() == -999) {
            conditions += " AND FOT_NUM_FORMULA IS NULL";
        } else if (this.getFotNumFormula() != null) {
            conditions += " AND FOT_NUM_FORMULA = ?";
            values.add(this.getFotNumFormula());
        }

        if (this.getFotNumClasific() != null && this.getFotNumClasific().longValue() == -999) {
            conditions += " AND FOT_NUM_CLASIFIC IS NULL";
        } else if (this.getFotNumClasific() != null) {
            conditions += " AND FOT_NUM_CLASIFIC = ?";
            values.add(this.getFotNumClasific());
        }

        if (this.getFotNomFormula() != null && "null".equals(this.getFotNomFormula())) {
            conditions += " AND FOT_NOM_FORMULA IS NULL";
        } else if (this.getFotNomFormula() != null) {
            conditions += " AND FOT_NOM_FORMULA = ?";
            values.add(this.getFotNomFormula());
        }

        if (this.getFotTextoFormula() != null && "null".equals(this.getFotTextoFormula())) {
            conditions += " AND FOT_TEXTO_FORMULA IS NULL";
        } else if (this.getFotTextoFormula() != null) {
            conditions += " AND FOT_TEXTO_FORMULA = ?";
            values.add(this.getFotTextoFormula());
        }

        if (this.getFotAnoAltaReg() != null && this.getFotAnoAltaReg().longValue() == -999) {
            conditions += " AND FOT_ANO_ALTA_REG IS NULL";
        } else if (this.getFotAnoAltaReg() != null) {
            conditions += " AND FOT_ANO_ALTA_REG = ?";
            values.add(this.getFotAnoAltaReg());
        }

        if (this.getFotMesAltaReg() != null && this.getFotMesAltaReg().longValue() == -999) {
            conditions += " AND FOT_MES_ALTA_REG IS NULL";
        } else if (this.getFotMesAltaReg() != null) {
            conditions += " AND FOT_MES_ALTA_REG = ?";
            values.add(this.getFotMesAltaReg());
        }

        if (this.getFotDiaAltaReg() != null && this.getFotDiaAltaReg().longValue() == -999) {
            conditions += " AND FOT_DIA_ALTA_REG IS NULL";
        } else if (this.getFotDiaAltaReg() != null) {
            conditions += " AND FOT_DIA_ALTA_REG = ?";
            values.add(this.getFotDiaAltaReg());
        }

        if (this.getFotAnoUltMod() != null && this.getFotAnoUltMod().longValue() == -999) {
            conditions += " AND FOT_ANO_ULT_MOD IS NULL";
        } else if (this.getFotAnoUltMod() != null) {
            conditions += " AND FOT_ANO_ULT_MOD = ?";
            values.add(this.getFotAnoUltMod());
        }

        if (this.getFotMesUltMod() != null && this.getFotMesUltMod().longValue() == -999) {
            conditions += " AND FOT_MES_ULT_MOD IS NULL";
        } else if (this.getFotMesUltMod() != null) {
            conditions += " AND FOT_MES_ULT_MOD = ?";
            values.add(this.getFotMesUltMod());
        }

        if (this.getFotDiaUltMod() != null && this.getFotDiaUltMod().longValue() == -999) {
            conditions += " AND FOT_DIA_ULT_MOD IS NULL";
        } else if (this.getFotDiaUltMod() != null) {
            conditions += " AND FOT_DIA_ULT_MOD = ?";
            values.add(this.getFotDiaUltMod());
        }

        if (this.getFotCveStFormutxt() != null && "null".equals(this.getFotCveStFormutxt())) {
            conditions += " AND FOT_CVE_ST_FORMUTXT IS NULL";
        } else if (this.getFotCveStFormutxt() != null) {
            conditions += " AND FOT_CVE_ST_FORMUTXT = ?";
            values.add(this.getFotCveStFormutxt());
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
        String sql = "UPDATE FORMUTXT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOT_NUM_FORMULA = ?";
        pkValues.add(this.getFotNumFormula());
        conditions += " AND FOT_NUM_CLASIFIC = ?";
        pkValues.add(this.getFotNumClasific());
        fields += " FOT_NOM_FORMULA = ?, ";
        values.add(this.getFotNomFormula());
        fields += " FOT_TEXTO_FORMULA = ?, ";
        values.add(this.getFotTextoFormula());
        fields += " FOT_ANO_ALTA_REG = ?, ";
        values.add(this.getFotAnoAltaReg());
        fields += " FOT_MES_ALTA_REG = ?, ";
        values.add(this.getFotMesAltaReg());
        fields += " FOT_DIA_ALTA_REG = ?, ";
        values.add(this.getFotDiaAltaReg());
        fields += " FOT_ANO_ULT_MOD = ?, ";
        values.add(this.getFotAnoUltMod());
        fields += " FOT_MES_ULT_MOD = ?, ";
        values.add(this.getFotMesUltMod());
        fields += " FOT_DIA_ULT_MOD = ?, ";
        values.add(this.getFotDiaUltMod());
        fields += " FOT_CVE_ST_FORMUTXT = ?, ";
        values.add(this.getFotCveStFormutxt());
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
        String sql = "INSERT INTO FORMUTXT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOT_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getFotNumFormula());

        fields += ", FOT_NUM_CLASIFIC";
        fieldValues += ", ?";
        values.add(this.getFotNumClasific());

        fields += ", FOT_NOM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getFotNomFormula());

        fields += ", FOT_TEXTO_FORMULA";
        fieldValues += ", ?";
        values.add(this.getFotTextoFormula());

        fields += ", FOT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFotAnoAltaReg());

        fields += ", FOT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFotMesAltaReg());

        fields += ", FOT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFotDiaAltaReg());

        fields += ", FOT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFotAnoUltMod());

        fields += ", FOT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFotMesUltMod());

        fields += ", FOT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFotDiaUltMod());

        fields += ", FOT_CVE_ST_FORMUTXT";
        fieldValues += ", ?";
        values.add(this.getFotCveStFormutxt());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FORMUTXT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOT_NUM_FORMULA = ?";
        values.add(this.getFotNumFormula());
        conditions += " AND FOT_NUM_CLASIFIC = ?";
        values.add(this.getFotNumClasific());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Formutxt instance = (Formutxt) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFotNumFormula().equals(instance.getFotNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getFotNumClasific().equals(instance.getFotNumClasific()))
            equalObjects = false;
        if (equalObjects && !this.getFotNomFormula().equals(instance.getFotNomFormula()))
            equalObjects = false;
        if (equalObjects && !this.getFotTextoFormula().equals(instance.getFotTextoFormula()))
            equalObjects = false;
        if (equalObjects && !this.getFotAnoAltaReg().equals(instance.getFotAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFotMesAltaReg().equals(instance.getFotMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFotDiaAltaReg().equals(instance.getFotDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFotAnoUltMod().equals(instance.getFotAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFotMesUltMod().equals(instance.getFotMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFotDiaUltMod().equals(instance.getFotDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFotCveStFormutxt().equals(instance.getFotCveStFormutxt()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Formutxt result = new Formutxt();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFotNumFormula((BigDecimal) objectData.getData("FOT_NUM_FORMULA"));
        result.setFotNumClasific((BigDecimal) objectData.getData("FOT_NUM_CLASIFIC"));
        result.setFotNomFormula((String) objectData.getData("FOT_NOM_FORMULA"));
        result.setFotTextoFormula((String) objectData.getData("FOT_TEXTO_FORMULA"));
        result.setFotAnoAltaReg((BigDecimal) objectData.getData("FOT_ANO_ALTA_REG"));
        result.setFotMesAltaReg((BigDecimal) objectData.getData("FOT_MES_ALTA_REG"));
        result.setFotDiaAltaReg((BigDecimal) objectData.getData("FOT_DIA_ALTA_REG"));
        result.setFotAnoUltMod((BigDecimal) objectData.getData("FOT_ANO_ULT_MOD"));
        result.setFotMesUltMod((BigDecimal) objectData.getData("FOT_MES_ULT_MOD"));
        result.setFotDiaUltMod((BigDecimal) objectData.getData("FOT_DIA_ULT_MOD"));
        result.setFotCveStFormutxt((String) objectData.getData("FOT_CVE_ST_FORMUTXT"));

        return result;

    }

}
