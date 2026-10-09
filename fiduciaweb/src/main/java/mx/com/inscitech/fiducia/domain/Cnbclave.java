package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CNBCLAVE_PK", columns = { "CNB_CVE_CNB" }, sequences = { "MAX" })
public class Cnbclave extends DomainObject {

    BigDecimal cnbCveCnb = null;
    String cnbDescCveCnb = null;
    BigDecimal cnbAnoAltaReg = null;
    BigDecimal cnbMesAltaReg = null;
    BigDecimal cnbDiaAltaReg = null;
    BigDecimal cnbAnoUltMod = null;
    BigDecimal cnbMesUltMod = null;
    BigDecimal cnbDiaUltMod = null;
    String cnbCveStCnbcve = null;

    public Cnbclave() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCnbCveCnb(BigDecimal cnbCveCnb) {
        this.cnbCveCnb = cnbCveCnb;
    }

    public BigDecimal getCnbCveCnb() {
        return this.cnbCveCnb;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCnbDescCveCnb(String cnbDescCveCnb) {
        this.cnbDescCveCnb = cnbDescCveCnb;
    }

    public String getCnbDescCveCnb() {
        return this.cnbDescCveCnb;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCnbAnoAltaReg(BigDecimal cnbAnoAltaReg) {
        this.cnbAnoAltaReg = cnbAnoAltaReg;
    }

    public BigDecimal getCnbAnoAltaReg() {
        return this.cnbAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCnbMesAltaReg(BigDecimal cnbMesAltaReg) {
        this.cnbMesAltaReg = cnbMesAltaReg;
    }

    public BigDecimal getCnbMesAltaReg() {
        return this.cnbMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCnbDiaAltaReg(BigDecimal cnbDiaAltaReg) {
        this.cnbDiaAltaReg = cnbDiaAltaReg;
    }

    public BigDecimal getCnbDiaAltaReg() {
        return this.cnbDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCnbAnoUltMod(BigDecimal cnbAnoUltMod) {
        this.cnbAnoUltMod = cnbAnoUltMod;
    }

    public BigDecimal getCnbAnoUltMod() {
        return this.cnbAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCnbMesUltMod(BigDecimal cnbMesUltMod) {
        this.cnbMesUltMod = cnbMesUltMod;
    }

    public BigDecimal getCnbMesUltMod() {
        return this.cnbMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCnbDiaUltMod(BigDecimal cnbDiaUltMod) {
        this.cnbDiaUltMod = cnbDiaUltMod;
    }

    public BigDecimal getCnbDiaUltMod() {
        return this.cnbDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCnbCveStCnbcve(String cnbCveStCnbcve) {
        this.cnbCveStCnbcve = cnbCveStCnbcve;
    }

    public String getCnbCveStCnbcve() {
        return this.cnbCveStCnbcve;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CNBCLAVE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCnbCveCnb() != null && this.getCnbCveCnb().longValue() == -999) {
            conditions += " AND CNB_CVE_CNB IS NULL";
        } else if (this.getCnbCveCnb() != null) {
            conditions += " AND CNB_CVE_CNB = ?";
            values.add(this.getCnbCveCnb());
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
        String sql = "SELECT * FROM CNBCLAVE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCnbCveCnb() != null && this.getCnbCveCnb().longValue() == -999) {
            conditions += " AND CNB_CVE_CNB IS NULL";
        } else if (this.getCnbCveCnb() != null) {
            conditions += " AND CNB_CVE_CNB = ?";
            values.add(this.getCnbCveCnb());
        }

        if (this.getCnbDescCveCnb() != null && "null".equals(this.getCnbDescCveCnb())) {
            conditions += " AND CNB_DESC_CVE_CNB IS NULL";
        } else if (this.getCnbDescCveCnb() != null) {
            conditions += " AND CNB_DESC_CVE_CNB = ?";
            values.add(this.getCnbDescCveCnb());
        }

        if (this.getCnbAnoAltaReg() != null && this.getCnbAnoAltaReg().longValue() == -999) {
            conditions += " AND CNB_ANO_ALTA_REG IS NULL";
        } else if (this.getCnbAnoAltaReg() != null) {
            conditions += " AND CNB_ANO_ALTA_REG = ?";
            values.add(this.getCnbAnoAltaReg());
        }

        if (this.getCnbMesAltaReg() != null && this.getCnbMesAltaReg().longValue() == -999) {
            conditions += " AND CNB_MES_ALTA_REG IS NULL";
        } else if (this.getCnbMesAltaReg() != null) {
            conditions += " AND CNB_MES_ALTA_REG = ?";
            values.add(this.getCnbMesAltaReg());
        }

        if (this.getCnbDiaAltaReg() != null && this.getCnbDiaAltaReg().longValue() == -999) {
            conditions += " AND CNB_DIA_ALTA_REG IS NULL";
        } else if (this.getCnbDiaAltaReg() != null) {
            conditions += " AND CNB_DIA_ALTA_REG = ?";
            values.add(this.getCnbDiaAltaReg());
        }

        if (this.getCnbAnoUltMod() != null && this.getCnbAnoUltMod().longValue() == -999) {
            conditions += " AND CNB_ANO_ULT_MOD IS NULL";
        } else if (this.getCnbAnoUltMod() != null) {
            conditions += " AND CNB_ANO_ULT_MOD = ?";
            values.add(this.getCnbAnoUltMod());
        }

        if (this.getCnbMesUltMod() != null && this.getCnbMesUltMod().longValue() == -999) {
            conditions += " AND CNB_MES_ULT_MOD IS NULL";
        } else if (this.getCnbMesUltMod() != null) {
            conditions += " AND CNB_MES_ULT_MOD = ?";
            values.add(this.getCnbMesUltMod());
        }

        if (this.getCnbDiaUltMod() != null && this.getCnbDiaUltMod().longValue() == -999) {
            conditions += " AND CNB_DIA_ULT_MOD IS NULL";
        } else if (this.getCnbDiaUltMod() != null) {
            conditions += " AND CNB_DIA_ULT_MOD = ?";
            values.add(this.getCnbDiaUltMod());
        }

        if (this.getCnbCveStCnbcve() != null && "null".equals(this.getCnbCveStCnbcve())) {
            conditions += " AND CNB_CVE_ST_CNBCVE IS NULL";
        } else if (this.getCnbCveStCnbcve() != null) {
            conditions += " AND CNB_CVE_ST_CNBCVE = ?";
            values.add(this.getCnbCveStCnbcve());
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
        String sql = "UPDATE CNBCLAVE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CNB_CVE_CNB = ?";
        pkValues.add(this.getCnbCveCnb());
        fields += " CNB_DESC_CVE_CNB = ?, ";
        values.add(this.getCnbDescCveCnb());
        fields += " CNB_ANO_ALTA_REG = ?, ";
        values.add(this.getCnbAnoAltaReg());
        fields += " CNB_MES_ALTA_REG = ?, ";
        values.add(this.getCnbMesAltaReg());
        fields += " CNB_DIA_ALTA_REG = ?, ";
        values.add(this.getCnbDiaAltaReg());
        fields += " CNB_ANO_ULT_MOD = ?, ";
        values.add(this.getCnbAnoUltMod());
        fields += " CNB_MES_ULT_MOD = ?, ";
        values.add(this.getCnbMesUltMod());
        fields += " CNB_DIA_ULT_MOD = ?, ";
        values.add(this.getCnbDiaUltMod());
        fields += " CNB_CVE_ST_CNBCVE = ?, ";
        values.add(this.getCnbCveStCnbcve());
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
        String sql = "INSERT INTO CNBCLAVE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CNB_CVE_CNB";
        fieldValues += ", ?";
        values.add(this.getCnbCveCnb());

        fields += ", CNB_DESC_CVE_CNB";
        fieldValues += ", ?";
        values.add(this.getCnbDescCveCnb());

        fields += ", CNB_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCnbAnoAltaReg());

        fields += ", CNB_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCnbMesAltaReg());

        fields += ", CNB_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCnbDiaAltaReg());

        fields += ", CNB_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCnbAnoUltMod());

        fields += ", CNB_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCnbMesUltMod());

        fields += ", CNB_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCnbDiaUltMod());

        fields += ", CNB_CVE_ST_CNBCVE";
        fieldValues += ", ?";
        values.add(this.getCnbCveStCnbcve());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CNBCLAVE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CNB_CVE_CNB = ?";
        values.add(this.getCnbCveCnb());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cnbclave instance = (Cnbclave) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCnbCveCnb().equals(instance.getCnbCveCnb()))
            equalObjects = false;
        if (equalObjects && !this.getCnbDescCveCnb().equals(instance.getCnbDescCveCnb()))
            equalObjects = false;
        if (equalObjects && !this.getCnbAnoAltaReg().equals(instance.getCnbAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCnbMesAltaReg().equals(instance.getCnbMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCnbDiaAltaReg().equals(instance.getCnbDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCnbAnoUltMod().equals(instance.getCnbAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCnbMesUltMod().equals(instance.getCnbMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCnbDiaUltMod().equals(instance.getCnbDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCnbCveStCnbcve().equals(instance.getCnbCveStCnbcve()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cnbclave result = new Cnbclave();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCnbCveCnb((BigDecimal) objectData.getData("CNB_CVE_CNB"));
        result.setCnbDescCveCnb((String) objectData.getData("CNB_DESC_CVE_CNB"));
        result.setCnbAnoAltaReg((BigDecimal) objectData.getData("CNB_ANO_ALTA_REG"));
        result.setCnbMesAltaReg((BigDecimal) objectData.getData("CNB_MES_ALTA_REG"));
        result.setCnbDiaAltaReg((BigDecimal) objectData.getData("CNB_DIA_ALTA_REG"));
        result.setCnbAnoUltMod((BigDecimal) objectData.getData("CNB_ANO_ULT_MOD"));
        result.setCnbMesUltMod((BigDecimal) objectData.getData("CNB_MES_ULT_MOD"));
        result.setCnbDiaUltMod((BigDecimal) objectData.getData("CNB_DIA_ULT_MOD"));
        result.setCnbCveStCnbcve((String) objectData.getData("CNB_CVE_ST_CNBCVE"));

        return result;

    }

}
