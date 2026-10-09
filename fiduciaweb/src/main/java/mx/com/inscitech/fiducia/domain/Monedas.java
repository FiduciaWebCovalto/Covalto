package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "MONEDAS_PK", columns = { "MON_NOM_MONEDA", "MON_NUM_PAIS" }, sequences = { "MANUAL" })
public class Monedas extends DomainObject {

    BigDecimal monNumPais = null;
    String monNomMoneda = null;
    BigDecimal monAnoAltaReg = null;
    BigDecimal monMesAltaReg = null;
    BigDecimal monDiaAltaReg = null;
    BigDecimal monAnoUltMod = null;
    BigDecimal monMesUltMod = null;
    BigDecimal monDiaUltMod = null;
    String monCveStMoneda = null;
    String monSigla = "XXX";

    public Monedas() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMonNumPais(BigDecimal monNumPais) {
        this.monNumPais = monNumPais;
    }

    public BigDecimal getMonNumPais() {
        return this.monNumPais;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setMonNomMoneda(String monNomMoneda) {
        this.monNomMoneda = monNomMoneda;
    }

    public String getMonNomMoneda() {
        return this.monNomMoneda;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMonAnoAltaReg(BigDecimal monAnoAltaReg) {
        this.monAnoAltaReg = monAnoAltaReg;
    }

    public BigDecimal getMonAnoAltaReg() {
        return this.monAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMonMesAltaReg(BigDecimal monMesAltaReg) {
        this.monMesAltaReg = monMesAltaReg;
    }

    public BigDecimal getMonMesAltaReg() {
        return this.monMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMonDiaAltaReg(BigDecimal monDiaAltaReg) {
        this.monDiaAltaReg = monDiaAltaReg;
    }

    public BigDecimal getMonDiaAltaReg() {
        return this.monDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMonAnoUltMod(BigDecimal monAnoUltMod) {
        this.monAnoUltMod = monAnoUltMod;
    }

    public BigDecimal getMonAnoUltMod() {
        return this.monAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMonMesUltMod(BigDecimal monMesUltMod) {
        this.monMesUltMod = monMesUltMod;
    }

    public BigDecimal getMonMesUltMod() {
        return this.monMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMonDiaUltMod(BigDecimal monDiaUltMod) {
        this.monDiaUltMod = monDiaUltMod;
    }

    public BigDecimal getMonDiaUltMod() {
        return this.monDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMonCveStMoneda(String monCveStMoneda) {
        this.monCveStMoneda = monCveStMoneda;
    }

    public String getMonCveStMoneda() {
        return this.monCveStMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMonSigla(String monSigla) {
        this.monSigla = monSigla;
    }

    public String getMonSigla() {
        return this.monSigla;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM MONEDAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMonNumPais() != null && this.getMonNumPais().longValue() == -999) {
            conditions += " AND MON_NUM_PAIS IS NULL";
        } else if (this.getMonNumPais() != null) {
            conditions += " AND MON_NUM_PAIS = ?";
            values.add(this.getMonNumPais());
        }

        if (this.getMonNomMoneda() != null && "null".equals(this.getMonNomMoneda())) {
            conditions += " AND MON_NOM_MONEDA IS NULL";
        } else if (this.getMonNomMoneda() != null) {
            conditions += " AND MON_NOM_MONEDA = ?";
            values.add(this.getMonNomMoneda());
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
        String sql = "SELECT * FROM MONEDAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMonNumPais() != null && this.getMonNumPais().longValue() == -999) {
            conditions += " AND MON_NUM_PAIS IS NULL";
        } else if (this.getMonNumPais() != null) {
            conditions += " AND MON_NUM_PAIS = ?";
            values.add(this.getMonNumPais());
        }

        if (this.getMonNomMoneda() != null && "null".equals(this.getMonNomMoneda())) {
            conditions += " AND MON_NOM_MONEDA IS NULL";
        } else if (this.getMonNomMoneda() != null) {
            conditions += " AND MON_NOM_MONEDA = ?";
            values.add(this.getMonNomMoneda());
        }

        if (this.getMonAnoAltaReg() != null && this.getMonAnoAltaReg().longValue() == -999) {
            conditions += " AND MON_ANO_ALTA_REG IS NULL";
        } else if (this.getMonAnoAltaReg() != null) {
            conditions += " AND MON_ANO_ALTA_REG = ?";
            values.add(this.getMonAnoAltaReg());
        }

        if (this.getMonMesAltaReg() != null && this.getMonMesAltaReg().longValue() == -999) {
            conditions += " AND MON_MES_ALTA_REG IS NULL";
        } else if (this.getMonMesAltaReg() != null) {
            conditions += " AND MON_MES_ALTA_REG = ?";
            values.add(this.getMonMesAltaReg());
        }

        if (this.getMonDiaAltaReg() != null && this.getMonDiaAltaReg().longValue() == -999) {
            conditions += " AND MON_DIA_ALTA_REG IS NULL";
        } else if (this.getMonDiaAltaReg() != null) {
            conditions += " AND MON_DIA_ALTA_REG = ?";
            values.add(this.getMonDiaAltaReg());
        }

        if (this.getMonAnoUltMod() != null && this.getMonAnoUltMod().longValue() == -999) {
            conditions += " AND MON_ANO_ULT_MOD IS NULL";
        } else if (this.getMonAnoUltMod() != null) {
            conditions += " AND MON_ANO_ULT_MOD = ?";
            values.add(this.getMonAnoUltMod());
        }

        if (this.getMonMesUltMod() != null && this.getMonMesUltMod().longValue() == -999) {
            conditions += " AND MON_MES_ULT_MOD IS NULL";
        } else if (this.getMonMesUltMod() != null) {
            conditions += " AND MON_MES_ULT_MOD = ?";
            values.add(this.getMonMesUltMod());
        }

        if (this.getMonDiaUltMod() != null && this.getMonDiaUltMod().longValue() == -999) {
            conditions += " AND MON_DIA_ULT_MOD IS NULL";
        } else if (this.getMonDiaUltMod() != null) {
            conditions += " AND MON_DIA_ULT_MOD = ?";
            values.add(this.getMonDiaUltMod());
        }

        if (this.getMonCveStMoneda() != null && "null".equals(this.getMonCveStMoneda())) {
            conditions += " AND MON_CVE_ST_MONEDA IS NULL";
        } else if (this.getMonCveStMoneda() != null) {
            conditions += " AND MON_CVE_ST_MONEDA = ?";
            values.add(this.getMonCveStMoneda());
        }

        if (this.getMonSigla() != null && "null".equals(this.getMonSigla())) {
            conditions += " AND MON_SIGLA IS NULL";
        } else if (this.getMonSigla() != null) {
            conditions += " AND MON_SIGLA = ?";
            values.add(this.getMonSigla());
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
        String sql = "UPDATE MONEDAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND MON_NUM_PAIS = ?";
        pkValues.add(this.getMonNumPais());
        conditions += " AND MON_NOM_MONEDA = ?";
        pkValues.add(this.getMonNomMoneda());
        fields += " MON_ANO_ALTA_REG = ?, ";
        values.add(this.getMonAnoAltaReg());
        fields += " MON_MES_ALTA_REG = ?, ";
        values.add(this.getMonMesAltaReg());
        fields += " MON_DIA_ALTA_REG = ?, ";
        values.add(this.getMonDiaAltaReg());
        fields += " MON_ANO_ULT_MOD = ?, ";
        values.add(this.getMonAnoUltMod());
        fields += " MON_MES_ULT_MOD = ?, ";
        values.add(this.getMonMesUltMod());
        fields += " MON_DIA_ULT_MOD = ?, ";
        values.add(this.getMonDiaUltMod());
        fields += " MON_CVE_ST_MONEDA = ?, ";
        values.add(this.getMonCveStMoneda());
        fields += " MON_SIGLA = ?, ";
        values.add(this.getMonSigla());
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
        String sql = "INSERT INTO MONEDAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", MON_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getMonNumPais());

        fields += ", MON_NOM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getMonNomMoneda());

        fields += ", MON_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMonAnoAltaReg());

        fields += ", MON_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMonMesAltaReg());

        fields += ", MON_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMonDiaAltaReg());

        fields += ", MON_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMonAnoUltMod());

        fields += ", MON_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMonMesUltMod());

        fields += ", MON_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMonDiaUltMod());

        fields += ", MON_CVE_ST_MONEDA";
        fieldValues += ", ?";
        values.add(this.getMonCveStMoneda());

        fields += ", MON_SIGLA";
        fieldValues += ", ?";
        values.add(this.getMonSigla());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM MONEDAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND MON_NUM_PAIS = ?";
        values.add(this.getMonNumPais());
        conditions += " AND MON_NOM_MONEDA = ?";
        values.add(this.getMonNomMoneda());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Monedas instance = (Monedas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getMonNumPais().equals(instance.getMonNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getMonNomMoneda().equals(instance.getMonNomMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getMonAnoAltaReg().equals(instance.getMonAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMonMesAltaReg().equals(instance.getMonMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMonDiaAltaReg().equals(instance.getMonDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMonAnoUltMod().equals(instance.getMonAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMonMesUltMod().equals(instance.getMonMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMonDiaUltMod().equals(instance.getMonDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMonCveStMoneda().equals(instance.getMonCveStMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getMonSigla().equals(instance.getMonSigla()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Monedas result = new Monedas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setMonNumPais((BigDecimal) objectData.getData("MON_NUM_PAIS"));
        result.setMonNomMoneda((String) objectData.getData("MON_NOM_MONEDA"));
        result.setMonAnoAltaReg((BigDecimal) objectData.getData("MON_ANO_ALTA_REG"));
        result.setMonMesAltaReg((BigDecimal) objectData.getData("MON_MES_ALTA_REG"));
        result.setMonDiaAltaReg((BigDecimal) objectData.getData("MON_DIA_ALTA_REG"));
        result.setMonAnoUltMod((BigDecimal) objectData.getData("MON_ANO_ULT_MOD"));
        result.setMonMesUltMod((BigDecimal) objectData.getData("MON_MES_ULT_MOD"));
        result.setMonDiaUltMod((BigDecimal) objectData.getData("MON_DIA_ULT_MOD"));
        result.setMonCveStMoneda((String) objectData.getData("MON_CVE_ST_MONEDA"));
        result.setMonSigla((String) objectData.getData("MON_SIGLA"));

        return result;

    }

}
