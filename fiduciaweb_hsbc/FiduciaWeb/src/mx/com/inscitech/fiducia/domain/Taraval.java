package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TARAVAL_PK", columns = { "TAR_TIPO_AVALUO", "TAR_TIPO_TARIFA", "TAR_SECUENCIAL" }, sequences = { "MANUAL" })
public class Taraval extends DomainObject {

    String tarTipoAvaluo = null;
    String tarTipoTarifa = null;
    BigDecimal tarSecuencial = null;
    BigDecimal tarRangoMin = null;
    BigDecimal tarRangoMax = null;
    BigDecimal tarArancel = null;
    BigDecimal tarTarifaMin = null;
    BigDecimal tarTarifaMax = null;
    BigDecimal tarAnoAltaReg = null;
    BigDecimal tarMesAltaReg = null;
    BigDecimal tarDiaAltaReg = null;
    BigDecimal tarAnoUltMod = null;
    BigDecimal tarMesUltMod = null;
    BigDecimal tarDiaUltMod = null;
    String tarCveStTaraval = null;

    public Taraval() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTarTipoAvaluo(String tarTipoAvaluo) {
        this.tarTipoAvaluo = tarTipoAvaluo;
    }

    public String getTarTipoAvaluo() {
        return this.tarTipoAvaluo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTarTipoTarifa(String tarTipoTarifa) {
        this.tarTipoTarifa = tarTipoTarifa;
    }

    public String getTarTipoTarifa() {
        return this.tarTipoTarifa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTarSecuencial(BigDecimal tarSecuencial) {
        this.tarSecuencial = tarSecuencial;
    }

    public BigDecimal getTarSecuencial() {
        return this.tarSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTarRangoMin(BigDecimal tarRangoMin) {
        this.tarRangoMin = tarRangoMin;
    }

    public BigDecimal getTarRangoMin() {
        return this.tarRangoMin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTarRangoMax(BigDecimal tarRangoMax) {
        this.tarRangoMax = tarRangoMax;
    }

    public BigDecimal getTarRangoMax() {
        return this.tarRangoMax;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setTarArancel(BigDecimal tarArancel) {
        this.tarArancel = tarArancel;
    }

    public BigDecimal getTarArancel() {
        return this.tarArancel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTarTarifaMin(BigDecimal tarTarifaMin) {
        this.tarTarifaMin = tarTarifaMin;
    }

    public BigDecimal getTarTarifaMin() {
        return this.tarTarifaMin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTarTarifaMax(BigDecimal tarTarifaMax) {
        this.tarTarifaMax = tarTarifaMax;
    }

    public BigDecimal getTarTarifaMax() {
        return this.tarTarifaMax;
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

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTarCveStTaraval(String tarCveStTaraval) {
        this.tarCveStTaraval = tarCveStTaraval;
    }

    public String getTarCveStTaraval() {
        return this.tarCveStTaraval;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TARAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTarTipoAvaluo() != null && "null".equals(this.getTarTipoAvaluo())) {
            conditions += " AND TAR_TIPO_AVALUO IS NULL";
        } else if (this.getTarTipoAvaluo() != null) {
            conditions += " AND TAR_TIPO_AVALUO = ?";
            values.add(this.getTarTipoAvaluo());
        }

        if (this.getTarTipoTarifa() != null && "null".equals(this.getTarTipoTarifa())) {
            conditions += " AND TAR_TIPO_TARIFA IS NULL";
        } else if (this.getTarTipoTarifa() != null) {
            conditions += " AND TAR_TIPO_TARIFA = ?";
            values.add(this.getTarTipoTarifa());
        }

        if (this.getTarSecuencial() != null && this.getTarSecuencial().longValue() == -999) {
            conditions += " AND TAR_SECUENCIAL IS NULL";
        } else if (this.getTarSecuencial() != null) {
            conditions += " AND TAR_SECUENCIAL = ?";
            values.add(this.getTarSecuencial());
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
        String sql = "SELECT * FROM TARAVAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTarTipoAvaluo() != null && "null".equals(this.getTarTipoAvaluo())) {
            conditions += " AND TAR_TIPO_AVALUO IS NULL";
        } else if (this.getTarTipoAvaluo() != null) {
            conditions += " AND TAR_TIPO_AVALUO = ?";
            values.add(this.getTarTipoAvaluo());
        }

        if (this.getTarTipoTarifa() != null && "null".equals(this.getTarTipoTarifa())) {
            conditions += " AND TAR_TIPO_TARIFA IS NULL";
        } else if (this.getTarTipoTarifa() != null) {
            conditions += " AND TAR_TIPO_TARIFA = ?";
            values.add(this.getTarTipoTarifa());
        }

        if (this.getTarSecuencial() != null && this.getTarSecuencial().longValue() == -999) {
            conditions += " AND TAR_SECUENCIAL IS NULL";
        } else if (this.getTarSecuencial() != null) {
            conditions += " AND TAR_SECUENCIAL = ?";
            values.add(this.getTarSecuencial());
        }

        if (this.getTarRangoMin() != null && this.getTarRangoMin().longValue() == -999) {
            conditions += " AND TAR_RANGO_MIN IS NULL";
        } else if (this.getTarRangoMin() != null) {
            conditions += " AND TAR_RANGO_MIN = ?";
            values.add(this.getTarRangoMin());
        }

        if (this.getTarRangoMax() != null && this.getTarRangoMax().longValue() == -999) {
            conditions += " AND TAR_RANGO_MAX IS NULL";
        } else if (this.getTarRangoMax() != null) {
            conditions += " AND TAR_RANGO_MAX = ?";
            values.add(this.getTarRangoMax());
        }

        if (this.getTarArancel() != null && this.getTarArancel().longValue() == -999) {
            conditions += " AND TAR_ARANCEL IS NULL";
        } else if (this.getTarArancel() != null) {
            conditions += " AND TAR_ARANCEL = ?";
            values.add(this.getTarArancel());
        }

        if (this.getTarTarifaMin() != null && this.getTarTarifaMin().longValue() == -999) {
            conditions += " AND TAR_TARIFA_MIN IS NULL";
        } else if (this.getTarTarifaMin() != null) {
            conditions += " AND TAR_TARIFA_MIN = ?";
            values.add(this.getTarTarifaMin());
        }

        if (this.getTarTarifaMax() != null && this.getTarTarifaMax().longValue() == -999) {
            conditions += " AND TAR_TARIFA_MAX IS NULL";
        } else if (this.getTarTarifaMax() != null) {
            conditions += " AND TAR_TARIFA_MAX = ?";
            values.add(this.getTarTarifaMax());
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

        if (this.getTarCveStTaraval() != null && "null".equals(this.getTarCveStTaraval())) {
            conditions += " AND TAR_CVE_ST_TARAVAL IS NULL";
        } else if (this.getTarCveStTaraval() != null) {
            conditions += " AND TAR_CVE_ST_TARAVAL = ?";
            values.add(this.getTarCveStTaraval());
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
        String sql = "UPDATE TARAVAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TAR_TIPO_AVALUO = ?";
        pkValues.add(this.getTarTipoAvaluo());
        conditions += " AND TAR_TIPO_TARIFA = ?";
        pkValues.add(this.getTarTipoTarifa());
        conditions += " AND TAR_SECUENCIAL = ?";
        pkValues.add(this.getTarSecuencial());
        fields += " TAR_RANGO_MIN = ?, ";
        values.add(this.getTarRangoMin());
        fields += " TAR_RANGO_MAX = ?, ";
        values.add(this.getTarRangoMax());
        fields += " TAR_ARANCEL = ?, ";
        values.add(this.getTarArancel());
        fields += " TAR_TARIFA_MIN = ?, ";
        values.add(this.getTarTarifaMin());
        fields += " TAR_TARIFA_MAX = ?, ";
        values.add(this.getTarTarifaMax());
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
        fields += " TAR_CVE_ST_TARAVAL = ?, ";
        values.add(this.getTarCveStTaraval());
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
        String sql = "INSERT INTO TARAVAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TAR_TIPO_AVALUO";
        fieldValues += ", ?";
        values.add(this.getTarTipoAvaluo());

        fields += ", TAR_TIPO_TARIFA";
        fieldValues += ", ?";
        values.add(this.getTarTipoTarifa());

        fields += ", TAR_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getTarSecuencial());

        fields += ", TAR_RANGO_MIN";
        fieldValues += ", ?";
        values.add(this.getTarRangoMin());

        fields += ", TAR_RANGO_MAX";
        fieldValues += ", ?";
        values.add(this.getTarRangoMax());

        fields += ", TAR_ARANCEL";
        fieldValues += ", ?";
        values.add(this.getTarArancel());

        fields += ", TAR_TARIFA_MIN";
        fieldValues += ", ?";
        values.add(this.getTarTarifaMin());

        fields += ", TAR_TARIFA_MAX";
        fieldValues += ", ?";
        values.add(this.getTarTarifaMax());

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

        fields += ", TAR_CVE_ST_TARAVAL";
        fieldValues += ", ?";
        values.add(this.getTarCveStTaraval());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TARAVAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TAR_TIPO_AVALUO = ?";
        values.add(this.getTarTipoAvaluo());
        conditions += " AND TAR_TIPO_TARIFA = ?";
        values.add(this.getTarTipoTarifa());
        conditions += " AND TAR_SECUENCIAL = ?";
        values.add(this.getTarSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Taraval instance = (Taraval) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTarTipoAvaluo().equals(instance.getTarTipoAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getTarTipoTarifa().equals(instance.getTarTipoTarifa()))
            equalObjects = false;
        if (equalObjects && !this.getTarSecuencial().equals(instance.getTarSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getTarRangoMin().equals(instance.getTarRangoMin()))
            equalObjects = false;
        if (equalObjects && !this.getTarRangoMax().equals(instance.getTarRangoMax()))
            equalObjects = false;
        if (equalObjects && !this.getTarArancel().equals(instance.getTarArancel()))
            equalObjects = false;
        if (equalObjects && !this.getTarTarifaMin().equals(instance.getTarTarifaMin()))
            equalObjects = false;
        if (equalObjects && !this.getTarTarifaMax().equals(instance.getTarTarifaMax()))
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
        if (equalObjects && !this.getTarCveStTaraval().equals(instance.getTarCveStTaraval()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Taraval result = new Taraval();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTarTipoAvaluo((String) objectData.getData("TAR_TIPO_AVALUO"));
        result.setTarTipoTarifa((String) objectData.getData("TAR_TIPO_TARIFA"));
        result.setTarSecuencial((BigDecimal) objectData.getData("TAR_SECUENCIAL"));
        result.setTarRangoMin((BigDecimal) objectData.getData("TAR_RANGO_MIN"));
        result.setTarRangoMax((BigDecimal) objectData.getData("TAR_RANGO_MAX"));
        result.setTarArancel((BigDecimal) objectData.getData("TAR_ARANCEL"));
        result.setTarTarifaMin((BigDecimal) objectData.getData("TAR_TARIFA_MIN"));
        result.setTarTarifaMax((BigDecimal) objectData.getData("TAR_TARIFA_MAX"));
        result.setTarAnoAltaReg((BigDecimal) objectData.getData("TAR_ANO_ALTA_REG"));
        result.setTarMesAltaReg((BigDecimal) objectData.getData("TAR_MES_ALTA_REG"));
        result.setTarDiaAltaReg((BigDecimal) objectData.getData("TAR_DIA_ALTA_REG"));
        result.setTarAnoUltMod((BigDecimal) objectData.getData("TAR_ANO_ULT_MOD"));
        result.setTarMesUltMod((BigDecimal) objectData.getData("TAR_MES_ULT_MOD"));
        result.setTarDiaUltMod((BigDecimal) objectData.getData("TAR_DIA_ULT_MOD"));
        result.setTarCveStTaraval((String) objectData.getData("TAR_CVE_ST_TARAVAL"));

        return result;

    }

}
