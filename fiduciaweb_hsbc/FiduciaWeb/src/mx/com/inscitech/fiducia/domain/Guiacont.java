package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "GUIACONT_PK", columns = { "GUI_NUM_SEC_ASIENT", "GUI_NUM_GUIA" }, sequences = { "MANUAL" })
public class Guiacont extends DomainObject {

    BigDecimal guiNumGuia = null;
    BigDecimal guiNumSecAsient = null;
    BigDecimal guiNumCtam = null;
    BigDecimal guiNumScta = null;
    BigDecimal guiNumSscta = null;
    BigDecimal guiNumSsscta = null;
    BigDecimal guiNumSssscta = null;
    BigDecimal guiNumSsssscta = null;
    BigDecimal guiNumAux1 = null;
    BigDecimal guiNumAux2 = null;
    BigDecimal guiNumAux3 = null;
    String guiCveAplicaDat = null;
    String guiCveCarAbo = null;
    String guiDescAsiento = null;
    BigDecimal guiAnoAltaReg = null;
    BigDecimal guiMesAltaReg = null;
    BigDecimal guiDiaAltaReg = null;
    BigDecimal guiAnoUltMod = null;
    BigDecimal guiMesUltMod = null;
    BigDecimal guiDiaUltMod = null;
    String guiCveStGuiacon = null;

    public Guiacont() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumGuia(BigDecimal guiNumGuia) {
        this.guiNumGuia = guiNumGuia;
    }

    public BigDecimal getGuiNumGuia() {
        return this.guiNumGuia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumSecAsient(BigDecimal guiNumSecAsient) {
        this.guiNumSecAsient = guiNumSecAsient;
    }

    public BigDecimal getGuiNumSecAsient() {
        return this.guiNumSecAsient;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumCtam(BigDecimal guiNumCtam) {
        this.guiNumCtam = guiNumCtam;
    }

    public BigDecimal getGuiNumCtam() {
        return this.guiNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumScta(BigDecimal guiNumScta) {
        this.guiNumScta = guiNumScta;
    }

    public BigDecimal getGuiNumScta() {
        return this.guiNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumSscta(BigDecimal guiNumSscta) {
        this.guiNumSscta = guiNumSscta;
    }

    public BigDecimal getGuiNumSscta() {
        return this.guiNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumSsscta(BigDecimal guiNumSsscta) {
        this.guiNumSsscta = guiNumSsscta;
    }

    public BigDecimal getGuiNumSsscta() {
        return this.guiNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumSssscta(BigDecimal guiNumSssscta) {
        this.guiNumSssscta = guiNumSssscta;
    }

    public BigDecimal getGuiNumSssscta() {
        return this.guiNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumSsssscta(BigDecimal guiNumSsssscta) {
        this.guiNumSsssscta = guiNumSsssscta;
    }

    public BigDecimal getGuiNumSsssscta() {
        return this.guiNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumAux1(BigDecimal guiNumAux1) {
        this.guiNumAux1 = guiNumAux1;
    }

    public BigDecimal getGuiNumAux1() {
        return this.guiNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumAux2(BigDecimal guiNumAux2) {
        this.guiNumAux2 = guiNumAux2;
    }

    public BigDecimal getGuiNumAux2() {
        return this.guiNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGuiNumAux3(BigDecimal guiNumAux3) {
        this.guiNumAux3 = guiNumAux3;
    }

    public BigDecimal getGuiNumAux3() {
        return this.guiNumAux3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGuiCveAplicaDat(String guiCveAplicaDat) {
        this.guiCveAplicaDat = guiCveAplicaDat;
    }

    public String getGuiCveAplicaDat() {
        return this.guiCveAplicaDat;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGuiCveCarAbo(String guiCveCarAbo) {
        this.guiCveCarAbo = guiCveCarAbo;
    }

    public String getGuiCveCarAbo() {
        return this.guiCveCarAbo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGuiDescAsiento(String guiDescAsiento) {
        this.guiDescAsiento = guiDescAsiento;
    }

    public String getGuiDescAsiento() {
        return this.guiDescAsiento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setGuiAnoAltaReg(BigDecimal guiAnoAltaReg) {
        this.guiAnoAltaReg = guiAnoAltaReg;
    }

    public BigDecimal getGuiAnoAltaReg() {
        return this.guiAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGuiMesAltaReg(BigDecimal guiMesAltaReg) {
        this.guiMesAltaReg = guiMesAltaReg;
    }

    public BigDecimal getGuiMesAltaReg() {
        return this.guiMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGuiDiaAltaReg(BigDecimal guiDiaAltaReg) {
        this.guiDiaAltaReg = guiDiaAltaReg;
    }

    public BigDecimal getGuiDiaAltaReg() {
        return this.guiDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setGuiAnoUltMod(BigDecimal guiAnoUltMod) {
        this.guiAnoUltMod = guiAnoUltMod;
    }

    public BigDecimal getGuiAnoUltMod() {
        return this.guiAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGuiMesUltMod(BigDecimal guiMesUltMod) {
        this.guiMesUltMod = guiMesUltMod;
    }

    public BigDecimal getGuiMesUltMod() {
        return this.guiMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGuiDiaUltMod(BigDecimal guiDiaUltMod) {
        this.guiDiaUltMod = guiDiaUltMod;
    }

    public BigDecimal getGuiDiaUltMod() {
        return this.guiDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGuiCveStGuiacon(String guiCveStGuiacon) {
        this.guiCveStGuiacon = guiCveStGuiacon;
    }

    public String getGuiCveStGuiacon() {
        return this.guiCveStGuiacon;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM GUIACONT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGuiNumGuia() != null && this.getGuiNumGuia().longValue() == -999) {
            conditions += " AND GUI_NUM_GUIA IS NULL";
        } else if (this.getGuiNumGuia() != null) {
            conditions += " AND GUI_NUM_GUIA = ?";
            values.add(this.getGuiNumGuia());
        }

        if (this.getGuiNumSecAsient() != null && this.getGuiNumSecAsient().longValue() == -999) {
            conditions += " AND GUI_NUM_SEC_ASIENT IS NULL";
        } else if (this.getGuiNumSecAsient() != null) {
            conditions += " AND GUI_NUM_SEC_ASIENT = ?";
            values.add(this.getGuiNumSecAsient());
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
        String sql = "SELECT * FROM GUIACONT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGuiNumGuia() != null && this.getGuiNumGuia().longValue() == -999) {
            conditions += " AND GUI_NUM_GUIA IS NULL";
        } else if (this.getGuiNumGuia() != null) {
            conditions += " AND GUI_NUM_GUIA = ?";
            values.add(this.getGuiNumGuia());
        }

        if (this.getGuiNumSecAsient() != null && this.getGuiNumSecAsient().longValue() == -999) {
            conditions += " AND GUI_NUM_SEC_ASIENT IS NULL";
        } else if (this.getGuiNumSecAsient() != null) {
            conditions += " AND GUI_NUM_SEC_ASIENT = ?";
            values.add(this.getGuiNumSecAsient());
        }

        if (this.getGuiNumCtam() != null && this.getGuiNumCtam().longValue() == -999) {
            conditions += " AND GUI_NUM_CTAM IS NULL";
        } else if (this.getGuiNumCtam() != null) {
            conditions += " AND GUI_NUM_CTAM = ?";
            values.add(this.getGuiNumCtam());
        }

        if (this.getGuiNumScta() != null && this.getGuiNumScta().longValue() == -999) {
            conditions += " AND GUI_NUM_SCTA IS NULL";
        } else if (this.getGuiNumScta() != null) {
            conditions += " AND GUI_NUM_SCTA = ?";
            values.add(this.getGuiNumScta());
        }

        if (this.getGuiNumSscta() != null && this.getGuiNumSscta().longValue() == -999) {
            conditions += " AND GUI_NUM_SSCTA IS NULL";
        } else if (this.getGuiNumSscta() != null) {
            conditions += " AND GUI_NUM_SSCTA = ?";
            values.add(this.getGuiNumSscta());
        }

        if (this.getGuiNumSsscta() != null && this.getGuiNumSsscta().longValue() == -999) {
            conditions += " AND GUI_NUM_SSSCTA IS NULL";
        } else if (this.getGuiNumSsscta() != null) {
            conditions += " AND GUI_NUM_SSSCTA = ?";
            values.add(this.getGuiNumSsscta());
        }

        if (this.getGuiNumSssscta() != null && this.getGuiNumSssscta().longValue() == -999) {
            conditions += " AND GUI_NUM_SSSSCTA IS NULL";
        } else if (this.getGuiNumSssscta() != null) {
            conditions += " AND GUI_NUM_SSSSCTA = ?";
            values.add(this.getGuiNumSssscta());
        }

        if (this.getGuiNumSsssscta() != null && this.getGuiNumSsssscta().longValue() == -999) {
            conditions += " AND GUI_NUM_SSSSSCTA IS NULL";
        } else if (this.getGuiNumSsssscta() != null) {
            conditions += " AND GUI_NUM_SSSSSCTA = ?";
            values.add(this.getGuiNumSsssscta());
        }

        if (this.getGuiNumAux1() != null && this.getGuiNumAux1().longValue() == -999) {
            conditions += " AND GUI_NUM_AUX1 IS NULL";
        } else if (this.getGuiNumAux1() != null) {
            conditions += " AND GUI_NUM_AUX1 = ?";
            values.add(this.getGuiNumAux1());
        }

        if (this.getGuiNumAux2() != null && this.getGuiNumAux2().longValue() == -999) {
            conditions += " AND GUI_NUM_AUX2 IS NULL";
        } else if (this.getGuiNumAux2() != null) {
            conditions += " AND GUI_NUM_AUX2 = ?";
            values.add(this.getGuiNumAux2());
        }

        if (this.getGuiNumAux3() != null && this.getGuiNumAux3().longValue() == -999) {
            conditions += " AND GUI_NUM_AUX3 IS NULL";
        } else if (this.getGuiNumAux3() != null) {
            conditions += " AND GUI_NUM_AUX3 = ?";
            values.add(this.getGuiNumAux3());
        }

        if (this.getGuiCveAplicaDat() != null && "null".equals(this.getGuiCveAplicaDat())) {
            conditions += " AND GUI_CVE_APLICA_DAT IS NULL";
        } else if (this.getGuiCveAplicaDat() != null) {
            conditions += " AND GUI_CVE_APLICA_DAT = ?";
            values.add(this.getGuiCveAplicaDat());
        }

        if (this.getGuiCveCarAbo() != null && "null".equals(this.getGuiCveCarAbo())) {
            conditions += " AND GUI_CVE_CAR_ABO IS NULL";
        } else if (this.getGuiCveCarAbo() != null) {
            conditions += " AND GUI_CVE_CAR_ABO = ?";
            values.add(this.getGuiCveCarAbo());
        }

        if (this.getGuiDescAsiento() != null && "null".equals(this.getGuiDescAsiento())) {
            conditions += " AND GUI_DESC_ASIENTO IS NULL";
        } else if (this.getGuiDescAsiento() != null) {
            conditions += " AND GUI_DESC_ASIENTO = ?";
            values.add(this.getGuiDescAsiento());
        }

        if (this.getGuiAnoAltaReg() != null && this.getGuiAnoAltaReg().longValue() == -999) {
            conditions += " AND GUI_ANO_ALTA_REG IS NULL";
        } else if (this.getGuiAnoAltaReg() != null) {
            conditions += " AND GUI_ANO_ALTA_REG = ?";
            values.add(this.getGuiAnoAltaReg());
        }

        if (this.getGuiMesAltaReg() != null && this.getGuiMesAltaReg().longValue() == -999) {
            conditions += " AND GUI_MES_ALTA_REG IS NULL";
        } else if (this.getGuiMesAltaReg() != null) {
            conditions += " AND GUI_MES_ALTA_REG = ?";
            values.add(this.getGuiMesAltaReg());
        }

        if (this.getGuiDiaAltaReg() != null && this.getGuiDiaAltaReg().longValue() == -999) {
            conditions += " AND GUI_DIA_ALTA_REG IS NULL";
        } else if (this.getGuiDiaAltaReg() != null) {
            conditions += " AND GUI_DIA_ALTA_REG = ?";
            values.add(this.getGuiDiaAltaReg());
        }

        if (this.getGuiAnoUltMod() != null && this.getGuiAnoUltMod().longValue() == -999) {
            conditions += " AND GUI_ANO_ULT_MOD IS NULL";
        } else if (this.getGuiAnoUltMod() != null) {
            conditions += " AND GUI_ANO_ULT_MOD = ?";
            values.add(this.getGuiAnoUltMod());
        }

        if (this.getGuiMesUltMod() != null && this.getGuiMesUltMod().longValue() == -999) {
            conditions += " AND GUI_MES_ULT_MOD IS NULL";
        } else if (this.getGuiMesUltMod() != null) {
            conditions += " AND GUI_MES_ULT_MOD = ?";
            values.add(this.getGuiMesUltMod());
        }

        if (this.getGuiDiaUltMod() != null && this.getGuiDiaUltMod().longValue() == -999) {
            conditions += " AND GUI_DIA_ULT_MOD IS NULL";
        } else if (this.getGuiDiaUltMod() != null) {
            conditions += " AND GUI_DIA_ULT_MOD = ?";
            values.add(this.getGuiDiaUltMod());
        }

        if (this.getGuiCveStGuiacon() != null && "null".equals(this.getGuiCveStGuiacon())) {
            conditions += " AND GUI_CVE_ST_GUIACON IS NULL";
        } else if (this.getGuiCveStGuiacon() != null) {
            conditions += " AND GUI_CVE_ST_GUIACON = ?";
            values.add(this.getGuiCveStGuiacon());
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
        String sql = "UPDATE GUIACONT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GUI_NUM_GUIA = ?";
        pkValues.add(this.getGuiNumGuia());
        conditions += " AND GUI_NUM_SEC_ASIENT = ?";
        pkValues.add(this.getGuiNumSecAsient());
        fields += " GUI_NUM_CTAM = ?, ";
        values.add(this.getGuiNumCtam());
        fields += " GUI_NUM_SCTA = ?, ";
        values.add(this.getGuiNumScta());
        fields += " GUI_NUM_SSCTA = ?, ";
        values.add(this.getGuiNumSscta());
        fields += " GUI_NUM_SSSCTA = ?, ";
        values.add(this.getGuiNumSsscta());
        fields += " GUI_NUM_SSSSCTA = ?, ";
        values.add(this.getGuiNumSssscta());
        fields += " GUI_NUM_SSSSSCTA = ?, ";
        values.add(this.getGuiNumSsssscta());
        fields += " GUI_NUM_AUX1 = ?, ";
        values.add(this.getGuiNumAux1());
        fields += " GUI_NUM_AUX2 = ?, ";
        values.add(this.getGuiNumAux2());
        fields += " GUI_NUM_AUX3 = ?, ";
        values.add(this.getGuiNumAux3());
        fields += " GUI_CVE_APLICA_DAT = ?, ";
        values.add(this.getGuiCveAplicaDat());
        fields += " GUI_CVE_CAR_ABO = ?, ";
        values.add(this.getGuiCveCarAbo());
        fields += " GUI_DESC_ASIENTO = ?, ";
        values.add(this.getGuiDescAsiento());
        fields += " GUI_ANO_ALTA_REG = ?, ";
        values.add(this.getGuiAnoAltaReg());
        fields += " GUI_MES_ALTA_REG = ?, ";
        values.add(this.getGuiMesAltaReg());
        fields += " GUI_DIA_ALTA_REG = ?, ";
        values.add(this.getGuiDiaAltaReg());
        fields += " GUI_ANO_ULT_MOD = ?, ";
        values.add(this.getGuiAnoUltMod());
        fields += " GUI_MES_ULT_MOD = ?, ";
        values.add(this.getGuiMesUltMod());
        fields += " GUI_DIA_ULT_MOD = ?, ";
        values.add(this.getGuiDiaUltMod());
        fields += " GUI_CVE_ST_GUIACON = ?, ";
        values.add(this.getGuiCveStGuiacon());
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
        String sql = "INSERT INTO GUIACONT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GUI_NUM_GUIA";
        fieldValues += ", ?";
        values.add(this.getGuiNumGuia());

        fields += ", GUI_NUM_SEC_ASIENT";
        fieldValues += ", ?";
        values.add(this.getGuiNumSecAsient());

        fields += ", GUI_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getGuiNumCtam());

        fields += ", GUI_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getGuiNumScta());

        fields += ", GUI_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getGuiNumSscta());

        fields += ", GUI_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getGuiNumSsscta());

        fields += ", GUI_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getGuiNumSssscta());

        fields += ", GUI_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getGuiNumSsssscta());

        fields += ", GUI_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getGuiNumAux1());

        fields += ", GUI_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getGuiNumAux2());

        fields += ", GUI_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getGuiNumAux3());

        fields += ", GUI_CVE_APLICA_DAT";
        fieldValues += ", ?";
        values.add(this.getGuiCveAplicaDat());

        fields += ", GUI_CVE_CAR_ABO";
        fieldValues += ", ?";
        values.add(this.getGuiCveCarAbo());

        fields += ", GUI_DESC_ASIENTO";
        fieldValues += ", ?";
        values.add(this.getGuiDescAsiento());

        fields += ", GUI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGuiAnoAltaReg());

        fields += ", GUI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGuiMesAltaReg());

        fields += ", GUI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getGuiDiaAltaReg());

        fields += ", GUI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGuiAnoUltMod());

        fields += ", GUI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGuiMesUltMod());

        fields += ", GUI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getGuiDiaUltMod());

        fields += ", GUI_CVE_ST_GUIACON";
        fieldValues += ", ?";
        values.add(this.getGuiCveStGuiacon());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM GUIACONT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GUI_NUM_GUIA = ?";
        values.add(this.getGuiNumGuia());
        conditions += " AND GUI_NUM_SEC_ASIENT = ?";
        values.add(this.getGuiNumSecAsient());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Guiacont instance = (Guiacont) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGuiNumGuia().equals(instance.getGuiNumGuia()))
            equalObjects = false;
        if (equalObjects && !this.getGuiNumSecAsient().equals(instance.getGuiNumSecAsient()))
            equalObjects = false;
        if (equalObjects && !this.getGuiNumCtam().equals(instance.getGuiNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getGuiNumScta().equals(instance.getGuiNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getGuiNumSscta().equals(instance.getGuiNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getGuiNumSsscta().equals(instance.getGuiNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getGuiNumSssscta().equals(instance.getGuiNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getGuiNumSsssscta().equals(instance.getGuiNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getGuiNumAux1().equals(instance.getGuiNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getGuiNumAux2().equals(instance.getGuiNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getGuiNumAux3().equals(instance.getGuiNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getGuiCveAplicaDat().equals(instance.getGuiCveAplicaDat()))
            equalObjects = false;
        if (equalObjects && !this.getGuiCveCarAbo().equals(instance.getGuiCveCarAbo()))
            equalObjects = false;
        if (equalObjects && !this.getGuiDescAsiento().equals(instance.getGuiDescAsiento()))
            equalObjects = false;
        if (equalObjects && !this.getGuiAnoAltaReg().equals(instance.getGuiAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGuiMesAltaReg().equals(instance.getGuiMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGuiDiaAltaReg().equals(instance.getGuiDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getGuiAnoUltMod().equals(instance.getGuiAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGuiMesUltMod().equals(instance.getGuiMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGuiDiaUltMod().equals(instance.getGuiDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getGuiCveStGuiacon().equals(instance.getGuiCveStGuiacon()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Guiacont result = new Guiacont();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGuiNumGuia((BigDecimal) objectData.getData("GUI_NUM_GUIA"));
        result.setGuiNumSecAsient((BigDecimal) objectData.getData("GUI_NUM_SEC_ASIENT"));
        result.setGuiNumCtam((BigDecimal) objectData.getData("GUI_NUM_CTAM"));
        result.setGuiNumScta((BigDecimal) objectData.getData("GUI_NUM_SCTA"));
        result.setGuiNumSscta((BigDecimal) objectData.getData("GUI_NUM_SSCTA"));
        result.setGuiNumSsscta((BigDecimal) objectData.getData("GUI_NUM_SSSCTA"));
        result.setGuiNumSssscta((BigDecimal) objectData.getData("GUI_NUM_SSSSCTA"));
        result.setGuiNumSsssscta((BigDecimal) objectData.getData("GUI_NUM_SSSSSCTA"));
        result.setGuiNumAux1((BigDecimal) objectData.getData("GUI_NUM_AUX1"));
        result.setGuiNumAux2((BigDecimal) objectData.getData("GUI_NUM_AUX2"));
        result.setGuiNumAux3((BigDecimal) objectData.getData("GUI_NUM_AUX3"));
        result.setGuiCveAplicaDat((String) objectData.getData("GUI_CVE_APLICA_DAT"));
        result.setGuiCveCarAbo((String) objectData.getData("GUI_CVE_CAR_ABO"));
        result.setGuiDescAsiento((String) objectData.getData("GUI_DESC_ASIENTO"));
        result.setGuiAnoAltaReg((BigDecimal) objectData.getData("GUI_ANO_ALTA_REG"));
        result.setGuiMesAltaReg((BigDecimal) objectData.getData("GUI_MES_ALTA_REG"));
        result.setGuiDiaAltaReg((BigDecimal) objectData.getData("GUI_DIA_ALTA_REG"));
        result.setGuiAnoUltMod((BigDecimal) objectData.getData("GUI_ANO_ULT_MOD"));
        result.setGuiMesUltMod((BigDecimal) objectData.getData("GUI_MES_ULT_MOD"));
        result.setGuiDiaUltMod((BigDecimal) objectData.getData("GUI_DIA_ULT_MOD"));
        result.setGuiCveStGuiacon((String) objectData.getData("GUI_CVE_ST_GUIACON"));

        return result;

    }

}
