package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INDICES_PK", columns = { "IND_CVE_INDICE", "IND_ANO_INDICE", "IND_MES_INDICE", "IND_DIA_INDICE" }, sequences = { "MANUAL" })
public class Indices extends DomainObject {

    String indCveIndice = null;
    BigDecimal indAnoIndice = null;
    BigDecimal indMesIndice = null;
    BigDecimal indDiaIndice = null;
    BigDecimal indValorIndice = null;
    BigDecimal indAnoAltaReg = null;
    BigDecimal indMesAltaReg = null;
    BigDecimal indDiaAltaReg = null;
    BigDecimal indAnoUltMod = null;
    BigDecimal indMesUltMod = null;
    BigDecimal indDiaUltMod = null;
    String indCveStIndice = null;

    public Indices() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setIndCveIndice(String indCveIndice) {
        this.indCveIndice = indCveIndice;
    }

    public String getIndCveIndice() {
        return this.indCveIndice;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIndAnoIndice(BigDecimal indAnoIndice) {
        this.indAnoIndice = indAnoIndice;
    }

    public BigDecimal getIndAnoIndice() {
        return this.indAnoIndice;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIndMesIndice(BigDecimal indMesIndice) {
        this.indMesIndice = indMesIndice;
    }

    public BigDecimal getIndMesIndice() {
        return this.indMesIndice;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIndDiaIndice(BigDecimal indDiaIndice) {
        this.indDiaIndice = indDiaIndice;
    }

    public BigDecimal getIndDiaIndice() {
        return this.indDiaIndice;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setIndValorIndice(BigDecimal indValorIndice) {
        this.indValorIndice = indValorIndice;
    }

    public BigDecimal getIndValorIndice() {
        return this.indValorIndice;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIndAnoAltaReg(BigDecimal indAnoAltaReg) {
        this.indAnoAltaReg = indAnoAltaReg;
    }

    public BigDecimal getIndAnoAltaReg() {
        return this.indAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIndMesAltaReg(BigDecimal indMesAltaReg) {
        this.indMesAltaReg = indMesAltaReg;
    }

    public BigDecimal getIndMesAltaReg() {
        return this.indMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIndDiaAltaReg(BigDecimal indDiaAltaReg) {
        this.indDiaAltaReg = indDiaAltaReg;
    }

    public BigDecimal getIndDiaAltaReg() {
        return this.indDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setIndAnoUltMod(BigDecimal indAnoUltMod) {
        this.indAnoUltMod = indAnoUltMod;
    }

    public BigDecimal getIndAnoUltMod() {
        return this.indAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIndMesUltMod(BigDecimal indMesUltMod) {
        this.indMesUltMod = indMesUltMod;
    }

    public BigDecimal getIndMesUltMod() {
        return this.indMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setIndDiaUltMod(BigDecimal indDiaUltMod) {
        this.indDiaUltMod = indDiaUltMod;
    }

    public BigDecimal getIndDiaUltMod() {
        return this.indDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setIndCveStIndice(String indCveStIndice) {
        this.indCveStIndice = indCveStIndice;
    }

    public String getIndCveStIndice() {
        return this.indCveStIndice;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INDICES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIndCveIndice() != null && "null".equals(this.getIndCveIndice())) {
            conditions += " AND IND_CVE_INDICE IS NULL";
        } else if (this.getIndCveIndice() != null) {
            conditions += " AND IND_CVE_INDICE = ?";
            values.add(this.getIndCveIndice());
        }

        if (this.getIndAnoIndice() != null && this.getIndAnoIndice().longValue() == -999) {
            conditions += " AND IND_ANO_INDICE IS NULL";
        } else if (this.getIndAnoIndice() != null) {
            conditions += " AND IND_ANO_INDICE = ?";
            values.add(this.getIndAnoIndice());
        }

        if (this.getIndMesIndice() != null && this.getIndMesIndice().longValue() == -999) {
            conditions += " AND IND_MES_INDICE IS NULL";
        } else if (this.getIndMesIndice() != null) {
            conditions += " AND IND_MES_INDICE = ?";
            values.add(this.getIndMesIndice());
        }

        if (this.getIndDiaIndice() != null && this.getIndDiaIndice().longValue() == -999) {
            conditions += " AND IND_DIA_INDICE IS NULL";
        } else if (this.getIndDiaIndice() != null) {
            conditions += " AND IND_DIA_INDICE = ?";
            values.add(this.getIndDiaIndice());
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
        String sql = "SELECT * FROM INDICES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIndCveIndice() != null && "null".equals(this.getIndCveIndice())) {
            conditions += " AND IND_CVE_INDICE IS NULL";
        } else if (this.getIndCveIndice() != null) {
            conditions += " AND IND_CVE_INDICE = ?";
            values.add(this.getIndCveIndice());
        }

        if (this.getIndAnoIndice() != null && this.getIndAnoIndice().longValue() == -999) {
            conditions += " AND IND_ANO_INDICE IS NULL";
        } else if (this.getIndAnoIndice() != null) {
            conditions += " AND IND_ANO_INDICE = ?";
            values.add(this.getIndAnoIndice());
        }

        if (this.getIndMesIndice() != null && this.getIndMesIndice().longValue() == -999) {
            conditions += " AND IND_MES_INDICE IS NULL";
        } else if (this.getIndMesIndice() != null) {
            conditions += " AND IND_MES_INDICE = ?";
            values.add(this.getIndMesIndice());
        }

        if (this.getIndDiaIndice() != null && this.getIndDiaIndice().longValue() == -999) {
            conditions += " AND IND_DIA_INDICE IS NULL";
        } else if (this.getIndDiaIndice() != null) {
            conditions += " AND IND_DIA_INDICE = ?";
            values.add(this.getIndDiaIndice());
        }

        if (this.getIndValorIndice() != null && this.getIndValorIndice().longValue() == -999) {
            conditions += " AND IND_VALOR_INDICE IS NULL";
        } else if (this.getIndValorIndice() != null) {
            conditions += " AND IND_VALOR_INDICE = ?";
            values.add(this.getIndValorIndice());
        }

        if (this.getIndAnoAltaReg() != null && this.getIndAnoAltaReg().longValue() == -999) {
            conditions += " AND IND_ANO_ALTA_REG IS NULL";
        } else if (this.getIndAnoAltaReg() != null) {
            conditions += " AND IND_ANO_ALTA_REG = ?";
            values.add(this.getIndAnoAltaReg());
        }

        if (this.getIndMesAltaReg() != null && this.getIndMesAltaReg().longValue() == -999) {
            conditions += " AND IND_MES_ALTA_REG IS NULL";
        } else if (this.getIndMesAltaReg() != null) {
            conditions += " AND IND_MES_ALTA_REG = ?";
            values.add(this.getIndMesAltaReg());
        }

        if (this.getIndDiaAltaReg() != null && this.getIndDiaAltaReg().longValue() == -999) {
            conditions += " AND IND_DIA_ALTA_REG IS NULL";
        } else if (this.getIndDiaAltaReg() != null) {
            conditions += " AND IND_DIA_ALTA_REG = ?";
            values.add(this.getIndDiaAltaReg());
        }

        if (this.getIndAnoUltMod() != null && this.getIndAnoUltMod().longValue() == -999) {
            conditions += " AND IND_ANO_ULT_MOD IS NULL";
        } else if (this.getIndAnoUltMod() != null) {
            conditions += " AND IND_ANO_ULT_MOD = ?";
            values.add(this.getIndAnoUltMod());
        }

        if (this.getIndMesUltMod() != null && this.getIndMesUltMod().longValue() == -999) {
            conditions += " AND IND_MES_ULT_MOD IS NULL";
        } else if (this.getIndMesUltMod() != null) {
            conditions += " AND IND_MES_ULT_MOD = ?";
            values.add(this.getIndMesUltMod());
        }

        if (this.getIndDiaUltMod() != null && this.getIndDiaUltMod().longValue() == -999) {
            conditions += " AND IND_DIA_ULT_MOD IS NULL";
        } else if (this.getIndDiaUltMod() != null) {
            conditions += " AND IND_DIA_ULT_MOD = ?";
            values.add(this.getIndDiaUltMod());
        }

        if (this.getIndCveStIndice() != null && "null".equals(this.getIndCveStIndice())) {
            conditions += " AND IND_CVE_ST_INDICE IS NULL";
        } else if (this.getIndCveStIndice() != null) {
            conditions += " AND IND_CVE_ST_INDICE = ?";
            values.add(this.getIndCveStIndice());
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
        String sql = "UPDATE INDICES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND IND_CVE_INDICE = ?";
        pkValues.add(this.getIndCveIndice());
        conditions += " AND IND_ANO_INDICE = ?";
        pkValues.add(this.getIndAnoIndice());
        conditions += " AND IND_MES_INDICE = ?";
        pkValues.add(this.getIndMesIndice());
        conditions += " AND IND_DIA_INDICE = ?";
        pkValues.add(this.getIndDiaIndice());
        fields += " IND_VALOR_INDICE = ?, ";
        values.add(this.getIndValorIndice());
        fields += " IND_ANO_ALTA_REG = ?, ";
        values.add(this.getIndAnoAltaReg());
        fields += " IND_MES_ALTA_REG = ?, ";
        values.add(this.getIndMesAltaReg());
        fields += " IND_DIA_ALTA_REG = ?, ";
        values.add(this.getIndDiaAltaReg());
        fields += " IND_ANO_ULT_MOD = ?, ";
        values.add(this.getIndAnoUltMod());
        fields += " IND_MES_ULT_MOD = ?, ";
        values.add(this.getIndMesUltMod());
        fields += " IND_DIA_ULT_MOD = ?, ";
        values.add(this.getIndDiaUltMod());
        fields += " IND_CVE_ST_INDICE = ?, ";
        values.add(this.getIndCveStIndice());
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
        String sql = "INSERT INTO INDICES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", IND_CVE_INDICE";
        fieldValues += ", ?";
        values.add(this.getIndCveIndice());

        fields += ", IND_ANO_INDICE";
        fieldValues += ", ?";
        values.add(this.getIndAnoIndice());

        fields += ", IND_MES_INDICE";
        fieldValues += ", ?";
        values.add(this.getIndMesIndice());

        fields += ", IND_DIA_INDICE";
        fieldValues += ", ?";
        values.add(this.getIndDiaIndice());

        fields += ", IND_VALOR_INDICE";
        fieldValues += ", ?";
        values.add(this.getIndValorIndice());

        fields += ", IND_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIndAnoAltaReg());

        fields += ", IND_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIndMesAltaReg());

        fields += ", IND_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getIndDiaAltaReg());

        fields += ", IND_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIndAnoUltMod());

        fields += ", IND_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIndMesUltMod());

        fields += ", IND_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getIndDiaUltMod());

        fields += ", IND_CVE_ST_INDICE";
        fieldValues += ", ?";
        values.add(this.getIndCveStIndice());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INDICES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND IND_CVE_INDICE = ?";
        values.add(this.getIndCveIndice());
        conditions += " AND IND_ANO_INDICE = ?";
        values.add(this.getIndAnoIndice());
        conditions += " AND IND_MES_INDICE = ?";
        values.add(this.getIndMesIndice());
        conditions += " AND IND_DIA_INDICE = ?";
        values.add(this.getIndDiaIndice());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Indices instance = (Indices) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIndCveIndice().equals(instance.getIndCveIndice()))
            equalObjects = false;
        if (equalObjects && !this.getIndAnoIndice().equals(instance.getIndAnoIndice()))
            equalObjects = false;
        if (equalObjects && !this.getIndMesIndice().equals(instance.getIndMesIndice()))
            equalObjects = false;
        if (equalObjects && !this.getIndDiaIndice().equals(instance.getIndDiaIndice()))
            equalObjects = false;
        if (equalObjects && !this.getIndValorIndice().equals(instance.getIndValorIndice()))
            equalObjects = false;
        if (equalObjects && !this.getIndAnoAltaReg().equals(instance.getIndAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIndMesAltaReg().equals(instance.getIndMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIndDiaAltaReg().equals(instance.getIndDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getIndAnoUltMod().equals(instance.getIndAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIndMesUltMod().equals(instance.getIndMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIndDiaUltMod().equals(instance.getIndDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getIndCveStIndice().equals(instance.getIndCveStIndice()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Indices result = new Indices();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIndCveIndice((String) objectData.getData("IND_CVE_INDICE"));
        result.setIndAnoIndice((BigDecimal) objectData.getData("IND_ANO_INDICE"));
        result.setIndMesIndice((BigDecimal) objectData.getData("IND_MES_INDICE"));
        result.setIndDiaIndice((BigDecimal) objectData.getData("IND_DIA_INDICE"));
        result.setIndValorIndice((BigDecimal) objectData.getData("IND_VALOR_INDICE"));
        result.setIndAnoAltaReg((BigDecimal) objectData.getData("IND_ANO_ALTA_REG"));
        result.setIndMesAltaReg((BigDecimal) objectData.getData("IND_MES_ALTA_REG"));
        result.setIndDiaAltaReg((BigDecimal) objectData.getData("IND_DIA_ALTA_REG"));
        result.setIndAnoUltMod((BigDecimal) objectData.getData("IND_ANO_ULT_MOD"));
        result.setIndMesUltMod((BigDecimal) objectData.getData("IND_MES_ULT_MOD"));
        result.setIndDiaUltMod((BigDecimal) objectData.getData("IND_DIA_ULT_MOD"));
        result.setIndCveStIndice((String) objectData.getData("IND_CVE_ST_INDICE"));

        return result;

    }

}
