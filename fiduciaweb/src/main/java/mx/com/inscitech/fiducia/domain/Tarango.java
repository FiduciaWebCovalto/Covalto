package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TARANGO_PK", columns = { "TAR_NUM_RANGO_INF", "TAR_NUM_RANGO_SUP", "TAR_NUM_SERVICIO" }, sequences = { "MANUAL" })
public class Tarango extends DomainObject {

    BigDecimal tarNumServicio = null;
    BigDecimal tarNumRangoInf = null;
    BigDecimal tarNumRangoSup = null;
    BigDecimal tarTarifaRango = null;
    BigDecimal tarAnoAltaReg = null;
    BigDecimal tarMesAltaReg = null;
    BigDecimal tarDiaAltaReg = null;
    BigDecimal tarAnoUltMod = null;
    BigDecimal tarMesUltMod = null;
    BigDecimal tarDiaUltMod = null;
    String tarCveStTarango = null;

    public Tarango() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTarNumServicio(BigDecimal tarNumServicio) {
        this.tarNumServicio = tarNumServicio;
    }

    public BigDecimal getTarNumServicio() {
        return this.tarNumServicio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTarNumRangoInf(BigDecimal tarNumRangoInf) {
        this.tarNumRangoInf = tarNumRangoInf;
    }

    public BigDecimal getTarNumRangoInf() {
        return this.tarNumRangoInf;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTarNumRangoSup(BigDecimal tarNumRangoSup) {
        this.tarNumRangoSup = tarNumRangoSup;
    }

    public BigDecimal getTarNumRangoSup() {
        return this.tarNumRangoSup;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTarTarifaRango(BigDecimal tarTarifaRango) {
        this.tarTarifaRango = tarTarifaRango;
    }

    public BigDecimal getTarTarifaRango() {
        return this.tarTarifaRango;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTarAnoAltaReg(BigDecimal tarAnoAltaReg) {
        this.tarAnoAltaReg = tarAnoAltaReg;
    }

    public BigDecimal getTarAnoAltaReg() {
        return this.tarAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTarMesAltaReg(BigDecimal tarMesAltaReg) {
        this.tarMesAltaReg = tarMesAltaReg;
    }

    public BigDecimal getTarMesAltaReg() {
        return this.tarMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTarDiaAltaReg(BigDecimal tarDiaAltaReg) {
        this.tarDiaAltaReg = tarDiaAltaReg;
    }

    public BigDecimal getTarDiaAltaReg() {
        return this.tarDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTarAnoUltMod(BigDecimal tarAnoUltMod) {
        this.tarAnoUltMod = tarAnoUltMod;
    }

    public BigDecimal getTarAnoUltMod() {
        return this.tarAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTarMesUltMod(BigDecimal tarMesUltMod) {
        this.tarMesUltMod = tarMesUltMod;
    }

    public BigDecimal getTarMesUltMod() {
        return this.tarMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTarDiaUltMod(BigDecimal tarDiaUltMod) {
        this.tarDiaUltMod = tarDiaUltMod;
    }

    public BigDecimal getTarDiaUltMod() {
        return this.tarDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTarCveStTarango(String tarCveStTarango) {
        this.tarCveStTarango = tarCveStTarango;
    }

    public String getTarCveStTarango() {
        return this.tarCveStTarango;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TARANGO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTarNumServicio() != null && this.getTarNumServicio().longValue() == -999) {
            conditions += " AND TAR_NUM_SERVICIO IS NULL";
        } else if (this.getTarNumServicio() != null) {
            conditions += " AND TAR_NUM_SERVICIO = ?";
            values.add(this.getTarNumServicio());
        }

        if (this.getTarNumRangoInf() != null && this.getTarNumRangoInf().longValue() == -999) {
            conditions += " AND TAR_NUM_RANGO_INF IS NULL";
        } else if (this.getTarNumRangoInf() != null) {
            conditions += " AND TAR_NUM_RANGO_INF = ?";
            values.add(this.getTarNumRangoInf());
        }

        if (this.getTarNumRangoSup() != null && this.getTarNumRangoSup().longValue() == -999) {
            conditions += " AND TAR_NUM_RANGO_SUP IS NULL";
        } else if (this.getTarNumRangoSup() != null) {
            conditions += " AND TAR_NUM_RANGO_SUP = ?";
            values.add(this.getTarNumRangoSup());
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
        String sql = "SELECT * FROM TARANGO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTarNumServicio() != null && this.getTarNumServicio().longValue() == -999) {
            conditions += " AND TAR_NUM_SERVICIO IS NULL";
        } else if (this.getTarNumServicio() != null) {
            conditions += " AND TAR_NUM_SERVICIO = ?";
            values.add(this.getTarNumServicio());
        }

        if (this.getTarNumRangoInf() != null && this.getTarNumRangoInf().longValue() == -999) {
            conditions += " AND TAR_NUM_RANGO_INF IS NULL";
        } else if (this.getTarNumRangoInf() != null) {
            conditions += " AND TAR_NUM_RANGO_INF = ?";
            values.add(this.getTarNumRangoInf());
        }

        if (this.getTarNumRangoSup() != null && this.getTarNumRangoSup().longValue() == -999) {
            conditions += " AND TAR_NUM_RANGO_SUP IS NULL";
        } else if (this.getTarNumRangoSup() != null) {
            conditions += " AND TAR_NUM_RANGO_SUP = ?";
            values.add(this.getTarNumRangoSup());
        }

        if (this.getTarTarifaRango() != null && this.getTarTarifaRango().longValue() == -999) {
            conditions += " AND TAR_TARIFA_RANGO IS NULL";
        } else if (this.getTarTarifaRango() != null) {
            conditions += " AND TAR_TARIFA_RANGO = ?";
            values.add(this.getTarTarifaRango());
        }

        if (this.getTarAnoAltaReg() != null && this.getTarAnoAltaReg().longValue() == -999) {
            conditions += " AND TAR_ANO_ALTA_REG IS NULL";
        } else if (this.getTarAnoAltaReg() != null) {
            conditions += " AND TAR_ANO_ALTA_REG = ?";
            values.add(this.getTarAnoAltaReg());
        }

        if (this.getTarMesAltaReg() != null && this.getTarMesAltaReg().longValue() == -999) {
            conditions += " AND TAR_MES_ALTA_REG IS NULL";
        } else if (this.getTarMesAltaReg() != null) {
            conditions += " AND TAR_MES_ALTA_REG = ?";
            values.add(this.getTarMesAltaReg());
        }

        if (this.getTarDiaAltaReg() != null && this.getTarDiaAltaReg().longValue() == -999) {
            conditions += " AND TAR_DIA_ALTA_REG IS NULL";
        } else if (this.getTarDiaAltaReg() != null) {
            conditions += " AND TAR_DIA_ALTA_REG = ?";
            values.add(this.getTarDiaAltaReg());
        }

        if (this.getTarAnoUltMod() != null && this.getTarAnoUltMod().longValue() == -999) {
            conditions += " AND TAR_ANO_ULT_MOD IS NULL";
        } else if (this.getTarAnoUltMod() != null) {
            conditions += " AND TAR_ANO_ULT_MOD = ?";
            values.add(this.getTarAnoUltMod());
        }

        if (this.getTarMesUltMod() != null && this.getTarMesUltMod().longValue() == -999) {
            conditions += " AND TAR_MES_ULT_MOD IS NULL";
        } else if (this.getTarMesUltMod() != null) {
            conditions += " AND TAR_MES_ULT_MOD = ?";
            values.add(this.getTarMesUltMod());
        }

        if (this.getTarDiaUltMod() != null && this.getTarDiaUltMod().longValue() == -999) {
            conditions += " AND TAR_DIA_ULT_MOD IS NULL";
        } else if (this.getTarDiaUltMod() != null) {
            conditions += " AND TAR_DIA_ULT_MOD = ?";
            values.add(this.getTarDiaUltMod());
        }

        if (this.getTarCveStTarango() != null && "null".equals(this.getTarCveStTarango())) {
            conditions += " AND TAR_CVE_ST_TARANGO IS NULL";
        } else if (this.getTarCveStTarango() != null) {
            conditions += " AND TAR_CVE_ST_TARANGO = ?";
            values.add(this.getTarCveStTarango());
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
        String sql = "UPDATE TARANGO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TAR_NUM_SERVICIO = ?";
        pkValues.add(this.getTarNumServicio());
        conditions += " AND TAR_NUM_RANGO_INF = ?";
        pkValues.add(this.getTarNumRangoInf());
        conditions += " AND TAR_NUM_RANGO_SUP = ?";
        pkValues.add(this.getTarNumRangoSup());
        fields += " TAR_TARIFA_RANGO = ?, ";
        values.add(this.getTarTarifaRango());
        fields += " TAR_ANO_ALTA_REG = ?, ";
        values.add(this.getTarAnoAltaReg());
        fields += " TAR_MES_ALTA_REG = ?, ";
        values.add(this.getTarMesAltaReg());
        fields += " TAR_DIA_ALTA_REG = ?, ";
        values.add(this.getTarDiaAltaReg());
        fields += " TAR_ANO_ULT_MOD = ?, ";
        values.add(this.getTarAnoUltMod());
        fields += " TAR_MES_ULT_MOD = ?, ";
        values.add(this.getTarMesUltMod());
        fields += " TAR_DIA_ULT_MOD = ?, ";
        values.add(this.getTarDiaUltMod());
        fields += " TAR_CVE_ST_TARANGO = ?, ";
        values.add(this.getTarCveStTarango());
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
        String sql = "INSERT INTO TARANGO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TAR_NUM_SERVICIO";
        fieldValues += ", ?";
        values.add(this.getTarNumServicio());

        fields += ", TAR_NUM_RANGO_INF";
        fieldValues += ", ?";
        values.add(this.getTarNumRangoInf());

        fields += ", TAR_NUM_RANGO_SUP";
        fieldValues += ", ?";
        values.add(this.getTarNumRangoSup());

        fields += ", TAR_TARIFA_RANGO";
        fieldValues += ", ?";
        values.add(this.getTarTarifaRango());

        fields += ", TAR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTarAnoAltaReg());

        fields += ", TAR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTarMesAltaReg());

        fields += ", TAR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTarDiaAltaReg());

        fields += ", TAR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTarAnoUltMod());

        fields += ", TAR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTarMesUltMod());

        fields += ", TAR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTarDiaUltMod());

        fields += ", TAR_CVE_ST_TARANGO";
        fieldValues += ", ?";
        values.add(this.getTarCveStTarango());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TARANGO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TAR_NUM_SERVICIO = ?";
        values.add(this.getTarNumServicio());
        conditions += " AND TAR_NUM_RANGO_INF = ?";
        values.add(this.getTarNumRangoInf());
        conditions += " AND TAR_NUM_RANGO_SUP = ?";
        values.add(this.getTarNumRangoSup());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Tarango instance = (Tarango) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTarNumServicio().equals(instance.getTarNumServicio()))
            equalObjects = false;
        if (equalObjects && !this.getTarNumRangoInf().equals(instance.getTarNumRangoInf()))
            equalObjects = false;
        if (equalObjects && !this.getTarNumRangoSup().equals(instance.getTarNumRangoSup()))
            equalObjects = false;
        if (equalObjects && !this.getTarTarifaRango().equals(instance.getTarTarifaRango()))
            equalObjects = false;
        if (equalObjects && !this.getTarAnoAltaReg().equals(instance.getTarAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTarMesAltaReg().equals(instance.getTarMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTarDiaAltaReg().equals(instance.getTarDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTarAnoUltMod().equals(instance.getTarAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTarMesUltMod().equals(instance.getTarMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTarDiaUltMod().equals(instance.getTarDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTarCveStTarango().equals(instance.getTarCveStTarango()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Tarango result = new Tarango();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTarNumServicio((BigDecimal) objectData.getData("TAR_NUM_SERVICIO"));
        result.setTarNumRangoInf((BigDecimal) objectData.getData("TAR_NUM_RANGO_INF"));
        result.setTarNumRangoSup((BigDecimal) objectData.getData("TAR_NUM_RANGO_SUP"));
        result.setTarTarifaRango((BigDecimal) objectData.getData("TAR_TARIFA_RANGO"));
        result.setTarAnoAltaReg((BigDecimal) objectData.getData("TAR_ANO_ALTA_REG"));
        result.setTarMesAltaReg((BigDecimal) objectData.getData("TAR_MES_ALTA_REG"));
        result.setTarDiaAltaReg((BigDecimal) objectData.getData("TAR_DIA_ALTA_REG"));
        result.setTarAnoUltMod((BigDecimal) objectData.getData("TAR_ANO_ULT_MOD"));
        result.setTarMesUltMod((BigDecimal) objectData.getData("TAR_MES_ULT_MOD"));
        result.setTarDiaUltMod((BigDecimal) objectData.getData("TAR_DIA_ULT_MOD"));
        result.setTarCveStTarango((String) objectData.getData("TAR_CVE_ST_TARANGO"));

        return result;

    }

}
