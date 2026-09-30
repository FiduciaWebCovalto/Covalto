package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTL_MESC_PK", columns = { "CCC_ANO", "CCC_MES" }, sequences = { "MANUAL" })
public class CtlMesc extends DomainObject {

    BigDecimal cccAno = null;
    BigDecimal cccMes = null;
    BigDecimal cccMesAbierto = null;
    BigDecimal cccAnoAltaReg = null;
    BigDecimal cccMesAltaReg = null;
    BigDecimal cccDiaAltaReg = null;
    BigDecimal cccAnoUltMod = null;
    BigDecimal cccMesUltMod = null;
    BigDecimal cccDiaUltMod = null;
    String cccCveStCtlmes = null;

    public CtlMesc() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCccAno(BigDecimal cccAno) {
        this.cccAno = cccAno;
    }

    public BigDecimal getCccAno() {
        return this.cccAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCccMes(BigDecimal cccMes) {
        this.cccMes = cccMes;
    }

    public BigDecimal getCccMes() {
        return this.cccMes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCccMesAbierto(BigDecimal cccMesAbierto) {
        this.cccMesAbierto = cccMesAbierto;
    }

    public BigDecimal getCccMesAbierto() {
        return this.cccMesAbierto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCccAnoAltaReg(BigDecimal cccAnoAltaReg) {
        this.cccAnoAltaReg = cccAnoAltaReg;
    }

    public BigDecimal getCccAnoAltaReg() {
        return this.cccAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCccMesAltaReg(BigDecimal cccMesAltaReg) {
        this.cccMesAltaReg = cccMesAltaReg;
    }

    public BigDecimal getCccMesAltaReg() {
        return this.cccMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCccDiaAltaReg(BigDecimal cccDiaAltaReg) {
        this.cccDiaAltaReg = cccDiaAltaReg;
    }

    public BigDecimal getCccDiaAltaReg() {
        return this.cccDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCccAnoUltMod(BigDecimal cccAnoUltMod) {
        this.cccAnoUltMod = cccAnoUltMod;
    }

    public BigDecimal getCccAnoUltMod() {
        return this.cccAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCccMesUltMod(BigDecimal cccMesUltMod) {
        this.cccMesUltMod = cccMesUltMod;
    }

    public BigDecimal getCccMesUltMod() {
        return this.cccMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCccDiaUltMod(BigDecimal cccDiaUltMod) {
        this.cccDiaUltMod = cccDiaUltMod;
    }

    public BigDecimal getCccDiaUltMod() {
        return this.cccDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCccCveStCtlmes(String cccCveStCtlmes) {
        this.cccCveStCtlmes = cccCveStCtlmes;
    }

    public String getCccCveStCtlmes() {
        return this.cccCveStCtlmes;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTL_MESC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCccAno() != null && this.getCccAno().longValue() == -999) {
            conditions += " AND CCC_ANO IS NULL";
        } else if (this.getCccAno() != null) {
            conditions += " AND CCC_ANO = ?";
            values.add(this.getCccAno());
        }

        if (this.getCccMes() != null && this.getCccMes().longValue() == -999) {
            conditions += " AND CCC_MES IS NULL";
        } else if (this.getCccMes() != null) {
            conditions += " AND CCC_MES = ?";
            values.add(this.getCccMes());
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
        String sql = "SELECT * FROM CTL_MESC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCccAno() != null && this.getCccAno().longValue() == -999) {
            conditions += " AND CCC_ANO IS NULL";
        } else if (this.getCccAno() != null) {
            conditions += " AND CCC_ANO = ?";
            values.add(this.getCccAno());
        }

        if (this.getCccMes() != null && this.getCccMes().longValue() == -999) {
            conditions += " AND CCC_MES IS NULL";
        } else if (this.getCccMes() != null) {
            conditions += " AND CCC_MES = ?";
            values.add(this.getCccMes());
        }

        if (this.getCccMesAbierto() != null && this.getCccMesAbierto().longValue() == -999) {
            conditions += " AND CCC_MES_ABIERTO IS NULL";
        } else if (this.getCccMesAbierto() != null) {
            conditions += " AND CCC_MES_ABIERTO = ?";
            values.add(this.getCccMesAbierto());
        }

        if (this.getCccAnoAltaReg() != null && this.getCccAnoAltaReg().longValue() == -999) {
            conditions += " AND CCC_ANO_ALTA_REG IS NULL";
        } else if (this.getCccAnoAltaReg() != null) {
            conditions += " AND CCC_ANO_ALTA_REG = ?";
            values.add(this.getCccAnoAltaReg());
        }

        if (this.getCccMesAltaReg() != null && this.getCccMesAltaReg().longValue() == -999) {
            conditions += " AND CCC_MES_ALTA_REG IS NULL";
        } else if (this.getCccMesAltaReg() != null) {
            conditions += " AND CCC_MES_ALTA_REG = ?";
            values.add(this.getCccMesAltaReg());
        }

        if (this.getCccDiaAltaReg() != null && this.getCccDiaAltaReg().longValue() == -999) {
            conditions += " AND CCC_DIA_ALTA_REG IS NULL";
        } else if (this.getCccDiaAltaReg() != null) {
            conditions += " AND CCC_DIA_ALTA_REG = ?";
            values.add(this.getCccDiaAltaReg());
        }

        if (this.getCccAnoUltMod() != null && this.getCccAnoUltMod().longValue() == -999) {
            conditions += " AND CCC_ANO_ULT_MOD IS NULL";
        } else if (this.getCccAnoUltMod() != null) {
            conditions += " AND CCC_ANO_ULT_MOD = ?";
            values.add(this.getCccAnoUltMod());
        }

        if (this.getCccMesUltMod() != null && this.getCccMesUltMod().longValue() == -999) {
            conditions += " AND CCC_MES_ULT_MOD IS NULL";
        } else if (this.getCccMesUltMod() != null) {
            conditions += " AND CCC_MES_ULT_MOD = ?";
            values.add(this.getCccMesUltMod());
        }

        if (this.getCccDiaUltMod() != null && this.getCccDiaUltMod().longValue() == -999) {
            conditions += " AND CCC_DIA_ULT_MOD IS NULL";
        } else if (this.getCccDiaUltMod() != null) {
            conditions += " AND CCC_DIA_ULT_MOD = ?";
            values.add(this.getCccDiaUltMod());
        }

        if (this.getCccCveStCtlmes() != null && "null".equals(this.getCccCveStCtlmes())) {
            conditions += " AND CCC_CVE_ST_CTLMES IS NULL";
        } else if (this.getCccCveStCtlmes() != null) {
            conditions += " AND CCC_CVE_ST_CTLMES = ?";
            values.add(this.getCccCveStCtlmes());
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
        String sql = "UPDATE CTL_MESC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CCC_ANO = ?";
        pkValues.add(this.getCccAno());
        conditions += " AND CCC_MES = ?";
        pkValues.add(this.getCccMes());
        fields += " CCC_MES_ABIERTO = ?, ";
        values.add(this.getCccMesAbierto());
        fields += " CCC_ANO_ALTA_REG = ?, ";
        values.add(this.getCccAnoAltaReg());
        fields += " CCC_MES_ALTA_REG = ?, ";
        values.add(this.getCccMesAltaReg());
        fields += " CCC_DIA_ALTA_REG = ?, ";
        values.add(this.getCccDiaAltaReg());
        fields += " CCC_ANO_ULT_MOD = ?, ";
        values.add(this.getCccAnoUltMod());
        fields += " CCC_MES_ULT_MOD = ?, ";
        values.add(this.getCccMesUltMod());
        fields += " CCC_DIA_ULT_MOD = ?, ";
        values.add(this.getCccDiaUltMod());
        fields += " CCC_CVE_ST_CTLMES = ?, ";
        values.add(this.getCccCveStCtlmes());
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
        String sql = "INSERT INTO CTL_MESC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CCC_ANO";
        fieldValues += ", ?";
        values.add(this.getCccAno());

        fields += ", CCC_MES";
        fieldValues += ", ?";
        values.add(this.getCccMes());

        fields += ", CCC_MES_ABIERTO";
        fieldValues += ", ?";
        values.add(this.getCccMesAbierto());

        fields += ", CCC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCccAnoAltaReg());

        fields += ", CCC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCccMesAltaReg());

        fields += ", CCC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCccDiaAltaReg());

        fields += ", CCC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCccAnoUltMod());

        fields += ", CCC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCccMesUltMod());

        fields += ", CCC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCccDiaUltMod());

        fields += ", CCC_CVE_ST_CTLMES";
        fieldValues += ", ?";
        values.add(this.getCccCveStCtlmes());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTL_MESC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CCC_ANO = ?";
        values.add(this.getCccAno());
        conditions += " AND CCC_MES = ?";
        values.add(this.getCccMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        CtlMesc instance = (CtlMesc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCccAno().equals(instance.getCccAno()))
            equalObjects = false;
        if (equalObjects && !this.getCccMes().equals(instance.getCccMes()))
            equalObjects = false;
        if (equalObjects && !this.getCccMesAbierto().equals(instance.getCccMesAbierto()))
            equalObjects = false;
        if (equalObjects && !this.getCccAnoAltaReg().equals(instance.getCccAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCccMesAltaReg().equals(instance.getCccMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCccDiaAltaReg().equals(instance.getCccDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCccAnoUltMod().equals(instance.getCccAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCccMesUltMod().equals(instance.getCccMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCccDiaUltMod().equals(instance.getCccDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCccCveStCtlmes().equals(instance.getCccCveStCtlmes()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        CtlMesc result = new CtlMesc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCccAno((BigDecimal) objectData.getData("CCC_ANO"));
        result.setCccMes((BigDecimal) objectData.getData("CCC_MES"));
        result.setCccMesAbierto((BigDecimal) objectData.getData("CCC_MES_ABIERTO"));
        result.setCccAnoAltaReg((BigDecimal) objectData.getData("CCC_ANO_ALTA_REG"));
        result.setCccMesAltaReg((BigDecimal) objectData.getData("CCC_MES_ALTA_REG"));
        result.setCccDiaAltaReg((BigDecimal) objectData.getData("CCC_DIA_ALTA_REG"));
        result.setCccAnoUltMod((BigDecimal) objectData.getData("CCC_ANO_ULT_MOD"));
        result.setCccMesUltMod((BigDecimal) objectData.getData("CCC_MES_ULT_MOD"));
        result.setCccDiaUltMod((BigDecimal) objectData.getData("CCC_DIA_ULT_MOD"));
        result.setCccCveStCtlmes((String) objectData.getData("CCC_CVE_ST_CTLMES"));

        return result;

    }

}
