package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TRATFISC_PK", columns = { "TRF_CVE_TRATFISC" }, sequences = { "MAX" })
public class Tratfisc extends DomainObject {

    BigDecimal trfCveTratfisc = null;
    String trfClasific = null;
    BigDecimal trfAnoAltReg = null;
    BigDecimal trfMesAltReg = null;
    BigDecimal trfDiaAltReg = null;
    BigDecimal trfAnoUltMod = null;
    BigDecimal trfMesUltMod = null;
    BigDecimal trfDiaUltMod = null;
    String trfCveStTrafis = null;

    public Tratfisc() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrfCveTratfisc(BigDecimal trfCveTratfisc) {
        this.trfCveTratfisc = trfCveTratfisc;
    }

    public BigDecimal getTrfCveTratfisc() {
        return this.trfCveTratfisc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrfClasific(String trfClasific) {
        this.trfClasific = trfClasific;
    }

    public String getTrfClasific() {
        return this.trfClasific;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTrfAnoAltReg(BigDecimal trfAnoAltReg) {
        this.trfAnoAltReg = trfAnoAltReg;
    }

    public BigDecimal getTrfAnoAltReg() {
        return this.trfAnoAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTrfMesAltReg(BigDecimal trfMesAltReg) {
        this.trfMesAltReg = trfMesAltReg;
    }

    public BigDecimal getTrfMesAltReg() {
        return this.trfMesAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTrfDiaAltReg(BigDecimal trfDiaAltReg) {
        this.trfDiaAltReg = trfDiaAltReg;
    }

    public BigDecimal getTrfDiaAltReg() {
        return this.trfDiaAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTrfAnoUltMod(BigDecimal trfAnoUltMod) {
        this.trfAnoUltMod = trfAnoUltMod;
    }

    public BigDecimal getTrfAnoUltMod() {
        return this.trfAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTrfMesUltMod(BigDecimal trfMesUltMod) {
        this.trfMesUltMod = trfMesUltMod;
    }

    public BigDecimal getTrfMesUltMod() {
        return this.trfMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTrfDiaUltMod(BigDecimal trfDiaUltMod) {
        this.trfDiaUltMod = trfDiaUltMod;
    }

    public BigDecimal getTrfDiaUltMod() {
        return this.trfDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrfCveStTrafis(String trfCveStTrafis) {
        this.trfCveStTrafis = trfCveStTrafis;
    }

    public String getTrfCveStTrafis() {
        return this.trfCveStTrafis;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TRATFISC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTrfCveTratfisc() != null && this.getTrfCveTratfisc().longValue() == -999) {
            conditions += " AND TRF_CVE_TRATFISC IS NULL";
        } else if (this.getTrfCveTratfisc() != null) {
            conditions += " AND TRF_CVE_TRATFISC = ?";
            values.add(this.getTrfCveTratfisc());
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
        String sql = "SELECT * FROM TRATFISC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTrfCveTratfisc() != null && this.getTrfCveTratfisc().longValue() == -999) {
            conditions += " AND TRF_CVE_TRATFISC IS NULL";
        } else if (this.getTrfCveTratfisc() != null) {
            conditions += " AND TRF_CVE_TRATFISC = ?";
            values.add(this.getTrfCveTratfisc());
        }

        if (this.getTrfClasific() != null && "null".equals(this.getTrfClasific())) {
            conditions += " AND TRF_CLASIFIC IS NULL";
        } else if (this.getTrfClasific() != null) {
            conditions += " AND TRF_CLASIFIC = ?";
            values.add(this.getTrfClasific());
        }

        if (this.getTrfAnoAltReg() != null && this.getTrfAnoAltReg().longValue() == -999) {
            conditions += " AND TRF_ANO_ALT_REG IS NULL";
        } else if (this.getTrfAnoAltReg() != null) {
            conditions += " AND TRF_ANO_ALT_REG = ?";
            values.add(this.getTrfAnoAltReg());
        }

        if (this.getTrfMesAltReg() != null && this.getTrfMesAltReg().longValue() == -999) {
            conditions += " AND TRF_MES_ALT_REG IS NULL";
        } else if (this.getTrfMesAltReg() != null) {
            conditions += " AND TRF_MES_ALT_REG = ?";
            values.add(this.getTrfMesAltReg());
        }

        if (this.getTrfDiaAltReg() != null && this.getTrfDiaAltReg().longValue() == -999) {
            conditions += " AND TRF_DIA_ALT_REG IS NULL";
        } else if (this.getTrfDiaAltReg() != null) {
            conditions += " AND TRF_DIA_ALT_REG = ?";
            values.add(this.getTrfDiaAltReg());
        }

        if (this.getTrfAnoUltMod() != null && this.getTrfAnoUltMod().longValue() == -999) {
            conditions += " AND TRF_ANO_ULT_MOD IS NULL";
        } else if (this.getTrfAnoUltMod() != null) {
            conditions += " AND TRF_ANO_ULT_MOD = ?";
            values.add(this.getTrfAnoUltMod());
        }

        if (this.getTrfMesUltMod() != null && this.getTrfMesUltMod().longValue() == -999) {
            conditions += " AND TRF_MES_ULT_MOD IS NULL";
        } else if (this.getTrfMesUltMod() != null) {
            conditions += " AND TRF_MES_ULT_MOD = ?";
            values.add(this.getTrfMesUltMod());
        }

        if (this.getTrfDiaUltMod() != null && this.getTrfDiaUltMod().longValue() == -999) {
            conditions += " AND TRF_DIA_ULT_MOD IS NULL";
        } else if (this.getTrfDiaUltMod() != null) {
            conditions += " AND TRF_DIA_ULT_MOD = ?";
            values.add(this.getTrfDiaUltMod());
        }

        if (this.getTrfCveStTrafis() != null && "null".equals(this.getTrfCveStTrafis())) {
            conditions += " AND TRF_CVE_ST_TRAFIS IS NULL";
        } else if (this.getTrfCveStTrafis() != null) {
            conditions += " AND TRF_CVE_ST_TRAFIS = ?";
            values.add(this.getTrfCveStTrafis());
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
        String sql = "UPDATE TRATFISC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TRF_CVE_TRATFISC = ?";
        pkValues.add(this.getTrfCveTratfisc());
        fields += " TRF_CLASIFIC = ?, ";
        values.add(this.getTrfClasific());
        fields += " TRF_ANO_ALT_REG = ?, ";
        values.add(this.getTrfAnoAltReg());
        fields += " TRF_MES_ALT_REG = ?, ";
        values.add(this.getTrfMesAltReg());
        fields += " TRF_DIA_ALT_REG = ?, ";
        values.add(this.getTrfDiaAltReg());
        fields += " TRF_ANO_ULT_MOD = ?, ";
        values.add(this.getTrfAnoUltMod());
        fields += " TRF_MES_ULT_MOD = ?, ";
        values.add(this.getTrfMesUltMod());
        fields += " TRF_DIA_ULT_MOD = ?, ";
        values.add(this.getTrfDiaUltMod());
        fields += " TRF_CVE_ST_TRAFIS = ?, ";
        values.add(this.getTrfCveStTrafis());
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
        String sql = "INSERT INTO TRATFISC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TRF_CVE_TRATFISC";
        fieldValues += ", ?";
        values.add(this.getTrfCveTratfisc());

        fields += ", TRF_CLASIFIC";
        fieldValues += ", ?";
        values.add(this.getTrfClasific());

        fields += ", TRF_ANO_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getTrfAnoAltReg());

        fields += ", TRF_MES_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getTrfMesAltReg());

        fields += ", TRF_DIA_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getTrfDiaAltReg());

        fields += ", TRF_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTrfAnoUltMod());

        fields += ", TRF_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTrfMesUltMod());

        fields += ", TRF_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTrfDiaUltMod());

        fields += ", TRF_CVE_ST_TRAFIS";
        fieldValues += ", ?";
        values.add(this.getTrfCveStTrafis());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TRATFISC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TRF_CVE_TRATFISC = ?";
        values.add(this.getTrfCveTratfisc());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Tratfisc instance = (Tratfisc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTrfCveTratfisc().equals(instance.getTrfCveTratfisc()))
            equalObjects = false;
        if (equalObjects && !this.getTrfClasific().equals(instance.getTrfClasific()))
            equalObjects = false;
        if (equalObjects && !this.getTrfAnoAltReg().equals(instance.getTrfAnoAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getTrfMesAltReg().equals(instance.getTrfMesAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getTrfDiaAltReg().equals(instance.getTrfDiaAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getTrfAnoUltMod().equals(instance.getTrfAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTrfMesUltMod().equals(instance.getTrfMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTrfDiaUltMod().equals(instance.getTrfDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTrfCveStTrafis().equals(instance.getTrfCveStTrafis()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Tratfisc result = new Tratfisc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTrfCveTratfisc((BigDecimal) objectData.getData("TRF_CVE_TRATFISC"));
        result.setTrfClasific((String) objectData.getData("TRF_CLASIFIC"));
        result.setTrfAnoAltReg((BigDecimal) objectData.getData("TRF_ANO_ALT_REG"));
        result.setTrfMesAltReg((BigDecimal) objectData.getData("TRF_MES_ALT_REG"));
        result.setTrfDiaAltReg((BigDecimal) objectData.getData("TRF_DIA_ALT_REG"));
        result.setTrfAnoUltMod((BigDecimal) objectData.getData("TRF_ANO_ULT_MOD"));
        result.setTrfMesUltMod((BigDecimal) objectData.getData("TRF_MES_ULT_MOD"));
        result.setTrfDiaUltMod((BigDecimal) objectData.getData("TRF_DIA_ULT_MOD"));
        result.setTrfCveStTrafis((String) objectData.getData("TRF_CVE_ST_TRAFIS"));

        return result;

    }

}
