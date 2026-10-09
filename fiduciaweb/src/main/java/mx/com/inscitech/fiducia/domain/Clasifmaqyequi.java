package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CLASIFMAQYEQUI_PK", columns = { "VRMC_TIPO_AVALUO", "VRMC_DESCRIPCION" }, sequences = { "MANUAL" })
public class Clasifmaqyequi extends DomainObject {

    String vrmcTipoAvaluo = null;
    String vrmcDescripcion = null;
    String vrmcFecAvaluo = null;
    BigDecimal vrmcReposiciNuev = null;
    BigDecimal vrmcNetoReposici = null;
    BigDecimal vrmcDemeritAnual = null;
    BigDecimal vrmcVidaUtilRem = null;
    BigDecimal vrmcVidaUtilTot = null;
    String vrmcObservaciones = null;
    BigDecimal vrmcAnoAltaReg = null;
    BigDecimal vrmcMesAltaReg = null;
    BigDecimal vrmcDiaAltaReg = null;
    BigDecimal vrmcAnoUltMod = null;
    BigDecimal vrmcMesUltMod = null;
    BigDecimal vrmcDiaUltMod = null;
    String vrmcCveStClasma = null;

    public Clasifmaqyequi() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmcTipoAvaluo(String vrmcTipoAvaluo) {
        this.vrmcTipoAvaluo = vrmcTipoAvaluo;
    }

    public String getVrmcTipoAvaluo() {
        return this.vrmcTipoAvaluo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmcDescripcion(String vrmcDescripcion) {
        this.vrmcDescripcion = vrmcDescripcion;
    }

    public String getVrmcDescripcion() {
        return this.vrmcDescripcion;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmcFecAvaluo(String vrmcFecAvaluo) {
        this.vrmcFecAvaluo = vrmcFecAvaluo;
    }

    public String getVrmcFecAvaluo() {
        return this.vrmcFecAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVrmcReposiciNuev(BigDecimal vrmcReposiciNuev) {
        this.vrmcReposiciNuev = vrmcReposiciNuev;
    }

    public BigDecimal getVrmcReposiciNuev() {
        return this.vrmcReposiciNuev;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVrmcNetoReposici(BigDecimal vrmcNetoReposici) {
        this.vrmcNetoReposici = vrmcNetoReposici;
    }

    public BigDecimal getVrmcNetoReposici() {
        return this.vrmcNetoReposici;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVrmcDemeritAnual(BigDecimal vrmcDemeritAnual) {
        this.vrmcDemeritAnual = vrmcDemeritAnual;
    }

    public BigDecimal getVrmcDemeritAnual() {
        return this.vrmcDemeritAnual;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVrmcVidaUtilRem(BigDecimal vrmcVidaUtilRem) {
        this.vrmcVidaUtilRem = vrmcVidaUtilRem;
    }

    public BigDecimal getVrmcVidaUtilRem() {
        return this.vrmcVidaUtilRem;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVrmcVidaUtilTot(BigDecimal vrmcVidaUtilTot) {
        this.vrmcVidaUtilTot = vrmcVidaUtilTot;
    }

    public BigDecimal getVrmcVidaUtilTot() {
        return this.vrmcVidaUtilTot;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmcObservaciones(String vrmcObservaciones) {
        this.vrmcObservaciones = vrmcObservaciones;
    }

    public String getVrmcObservaciones() {
        return this.vrmcObservaciones;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setVrmcAnoAltaReg(BigDecimal vrmcAnoAltaReg) {
        this.vrmcAnoAltaReg = vrmcAnoAltaReg;
    }

    public BigDecimal getVrmcAnoAltaReg() {
        return this.vrmcAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVrmcMesAltaReg(BigDecimal vrmcMesAltaReg) {
        this.vrmcMesAltaReg = vrmcMesAltaReg;
    }

    public BigDecimal getVrmcMesAltaReg() {
        return this.vrmcMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVrmcDiaAltaReg(BigDecimal vrmcDiaAltaReg) {
        this.vrmcDiaAltaReg = vrmcDiaAltaReg;
    }

    public BigDecimal getVrmcDiaAltaReg() {
        return this.vrmcDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setVrmcAnoUltMod(BigDecimal vrmcAnoUltMod) {
        this.vrmcAnoUltMod = vrmcAnoUltMod;
    }

    public BigDecimal getVrmcAnoUltMod() {
        return this.vrmcAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVrmcMesUltMod(BigDecimal vrmcMesUltMod) {
        this.vrmcMesUltMod = vrmcMesUltMod;
    }

    public BigDecimal getVrmcMesUltMod() {
        return this.vrmcMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVrmcDiaUltMod(BigDecimal vrmcDiaUltMod) {
        this.vrmcDiaUltMod = vrmcDiaUltMod;
    }

    public BigDecimal getVrmcDiaUltMod() {
        return this.vrmcDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVrmcCveStClasma(String vrmcCveStClasma) {
        this.vrmcCveStClasma = vrmcCveStClasma;
    }

    public String getVrmcCveStClasma() {
        return this.vrmcCveStClasma;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CLASIFMAQYEQUI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVrmcTipoAvaluo() != null && "null".equals(this.getVrmcTipoAvaluo())) {
            conditions += " AND VRMC_TIPO_AVALUO IS NULL";
        } else if (this.getVrmcTipoAvaluo() != null) {
            conditions += " AND VRMC_TIPO_AVALUO = ?";
            values.add(this.getVrmcTipoAvaluo());
        }

        if (this.getVrmcDescripcion() != null && "null".equals(this.getVrmcDescripcion())) {
            conditions += " AND VRMC_DESCRIPCION IS NULL";
        } else if (this.getVrmcDescripcion() != null) {
            conditions += " AND VRMC_DESCRIPCION = ?";
            values.add(this.getVrmcDescripcion());
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
        String sql = "SELECT * FROM CLASIFMAQYEQUI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVrmcTipoAvaluo() != null && "null".equals(this.getVrmcTipoAvaluo())) {
            conditions += " AND VRMC_TIPO_AVALUO IS NULL";
        } else if (this.getVrmcTipoAvaluo() != null) {
            conditions += " AND VRMC_TIPO_AVALUO = ?";
            values.add(this.getVrmcTipoAvaluo());
        }

        if (this.getVrmcDescripcion() != null && "null".equals(this.getVrmcDescripcion())) {
            conditions += " AND VRMC_DESCRIPCION IS NULL";
        } else if (this.getVrmcDescripcion() != null) {
            conditions += " AND VRMC_DESCRIPCION = ?";
            values.add(this.getVrmcDescripcion());
        }

        if (this.getVrmcFecAvaluo() != null && "null".equals(this.getVrmcFecAvaluo())) {
            conditions += " AND VRMC_FEC_AVALUO IS NULL";
        } else if (this.getVrmcFecAvaluo() != null) {
            conditions += " AND VRMC_FEC_AVALUO = ?";
            values.add(this.getVrmcFecAvaluo());
        }

        if (this.getVrmcReposiciNuev() != null && this.getVrmcReposiciNuev().longValue() == -999) {
            conditions += " AND VRMC_REPOSICI_NUEV IS NULL";
        } else if (this.getVrmcReposiciNuev() != null) {
            conditions += " AND VRMC_REPOSICI_NUEV = ?";
            values.add(this.getVrmcReposiciNuev());
        }

        if (this.getVrmcNetoReposici() != null && this.getVrmcNetoReposici().longValue() == -999) {
            conditions += " AND VRMC_NETO_REPOSICI IS NULL";
        } else if (this.getVrmcNetoReposici() != null) {
            conditions += " AND VRMC_NETO_REPOSICI = ?";
            values.add(this.getVrmcNetoReposici());
        }

        if (this.getVrmcDemeritAnual() != null && this.getVrmcDemeritAnual().longValue() == -999) {
            conditions += " AND VRMC_DEMERIT_ANUAL IS NULL";
        } else if (this.getVrmcDemeritAnual() != null) {
            conditions += " AND VRMC_DEMERIT_ANUAL = ?";
            values.add(this.getVrmcDemeritAnual());
        }

        if (this.getVrmcVidaUtilRem() != null && this.getVrmcVidaUtilRem().longValue() == -999) {
            conditions += " AND VRMC_VIDA_UTIL_REM IS NULL";
        } else if (this.getVrmcVidaUtilRem() != null) {
            conditions += " AND VRMC_VIDA_UTIL_REM = ?";
            values.add(this.getVrmcVidaUtilRem());
        }

        if (this.getVrmcVidaUtilTot() != null && this.getVrmcVidaUtilTot().longValue() == -999) {
            conditions += " AND VRMC_VIDA_UTIL_TOT IS NULL";
        } else if (this.getVrmcVidaUtilTot() != null) {
            conditions += " AND VRMC_VIDA_UTIL_TOT = ?";
            values.add(this.getVrmcVidaUtilTot());
        }

        if (this.getVrmcObservaciones() != null && "null".equals(this.getVrmcObservaciones())) {
            conditions += " AND VRMC_OBSERVACIONES IS NULL";
        } else if (this.getVrmcObservaciones() != null) {
            conditions += " AND VRMC_OBSERVACIONES = ?";
            values.add(this.getVrmcObservaciones());
        }

        if (this.getVrmcAnoAltaReg() != null && this.getVrmcAnoAltaReg().longValue() == -999) {
            conditions += " AND VRMC_ANO_ALTA_REG IS NULL";
        } else if (this.getVrmcAnoAltaReg() != null) {
            conditions += " AND VRMC_ANO_ALTA_REG = ?";
            values.add(this.getVrmcAnoAltaReg());
        }

        if (this.getVrmcMesAltaReg() != null && this.getVrmcMesAltaReg().longValue() == -999) {
            conditions += " AND VRMC_MES_ALTA_REG IS NULL";
        } else if (this.getVrmcMesAltaReg() != null) {
            conditions += " AND VRMC_MES_ALTA_REG = ?";
            values.add(this.getVrmcMesAltaReg());
        }

        if (this.getVrmcDiaAltaReg() != null && this.getVrmcDiaAltaReg().longValue() == -999) {
            conditions += " AND VRMC_DIA_ALTA_REG IS NULL";
        } else if (this.getVrmcDiaAltaReg() != null) {
            conditions += " AND VRMC_DIA_ALTA_REG = ?";
            values.add(this.getVrmcDiaAltaReg());
        }

        if (this.getVrmcAnoUltMod() != null && this.getVrmcAnoUltMod().longValue() == -999) {
            conditions += " AND VRMC_ANO_ULT_MOD IS NULL";
        } else if (this.getVrmcAnoUltMod() != null) {
            conditions += " AND VRMC_ANO_ULT_MOD = ?";
            values.add(this.getVrmcAnoUltMod());
        }

        if (this.getVrmcMesUltMod() != null && this.getVrmcMesUltMod().longValue() == -999) {
            conditions += " AND VRMC_MES_ULT_MOD IS NULL";
        } else if (this.getVrmcMesUltMod() != null) {
            conditions += " AND VRMC_MES_ULT_MOD = ?";
            values.add(this.getVrmcMesUltMod());
        }

        if (this.getVrmcDiaUltMod() != null && this.getVrmcDiaUltMod().longValue() == -999) {
            conditions += " AND VRMC_DIA_ULT_MOD IS NULL";
        } else if (this.getVrmcDiaUltMod() != null) {
            conditions += " AND VRMC_DIA_ULT_MOD = ?";
            values.add(this.getVrmcDiaUltMod());
        }

        if (this.getVrmcCveStClasma() != null && "null".equals(this.getVrmcCveStClasma())) {
            conditions += " AND VRMC_CVE_ST_CLASMA IS NULL";
        } else if (this.getVrmcCveStClasma() != null) {
            conditions += " AND VRMC_CVE_ST_CLASMA = ?";
            values.add(this.getVrmcCveStClasma());
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
        String sql = "UPDATE CLASIFMAQYEQUI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND VRMC_TIPO_AVALUO = ?";
        pkValues.add(this.getVrmcTipoAvaluo());
        conditions += " AND VRMC_DESCRIPCION = ?";
        pkValues.add(this.getVrmcDescripcion());
        fields += " VRMC_FEC_AVALUO = ?, ";
        values.add(this.getVrmcFecAvaluo());
        fields += " VRMC_REPOSICI_NUEV = ?, ";
        values.add(this.getVrmcReposiciNuev());
        fields += " VRMC_NETO_REPOSICI = ?, ";
        values.add(this.getVrmcNetoReposici());
        fields += " VRMC_DEMERIT_ANUAL = ?, ";
        values.add(this.getVrmcDemeritAnual());
        fields += " VRMC_VIDA_UTIL_REM = ?, ";
        values.add(this.getVrmcVidaUtilRem());
        fields += " VRMC_VIDA_UTIL_TOT = ?, ";
        values.add(this.getVrmcVidaUtilTot());
        fields += " VRMC_OBSERVACIONES = ?, ";
        values.add(this.getVrmcObservaciones());
        fields += " VRMC_ANO_ALTA_REG = ?, ";
        values.add(this.getVrmcAnoAltaReg());
        fields += " VRMC_MES_ALTA_REG = ?, ";
        values.add(this.getVrmcMesAltaReg());
        fields += " VRMC_DIA_ALTA_REG = ?, ";
        values.add(this.getVrmcDiaAltaReg());
        fields += " VRMC_ANO_ULT_MOD = ?, ";
        values.add(this.getVrmcAnoUltMod());
        fields += " VRMC_MES_ULT_MOD = ?, ";
        values.add(this.getVrmcMesUltMod());
        fields += " VRMC_DIA_ULT_MOD = ?, ";
        values.add(this.getVrmcDiaUltMod());
        fields += " VRMC_CVE_ST_CLASMA = ?, ";
        values.add(this.getVrmcCveStClasma());
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
        String sql = "INSERT INTO CLASIFMAQYEQUI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", VRMC_TIPO_AVALUO";
        fieldValues += ", ?";
        values.add(this.getVrmcTipoAvaluo());

        fields += ", VRMC_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getVrmcDescripcion());

        fields += ", VRMC_FEC_AVALUO";
        fieldValues += ", ?";
        values.add(this.getVrmcFecAvaluo());

        fields += ", VRMC_REPOSICI_NUEV";
        fieldValues += ", ?";
        values.add(this.getVrmcReposiciNuev());

        fields += ", VRMC_NETO_REPOSICI";
        fieldValues += ", ?";
        values.add(this.getVrmcNetoReposici());

        fields += ", VRMC_DEMERIT_ANUAL";
        fieldValues += ", ?";
        values.add(this.getVrmcDemeritAnual());

        fields += ", VRMC_VIDA_UTIL_REM";
        fieldValues += ", ?";
        values.add(this.getVrmcVidaUtilRem());

        fields += ", VRMC_VIDA_UTIL_TOT";
        fieldValues += ", ?";
        values.add(this.getVrmcVidaUtilTot());

        fields += ", VRMC_OBSERVACIONES";
        fieldValues += ", ?";
        values.add(this.getVrmcObservaciones());

        fields += ", VRMC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVrmcAnoAltaReg());

        fields += ", VRMC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVrmcMesAltaReg());

        fields += ", VRMC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVrmcDiaAltaReg());

        fields += ", VRMC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVrmcAnoUltMod());

        fields += ", VRMC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVrmcMesUltMod());

        fields += ", VRMC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVrmcDiaUltMod());

        fields += ", VRMC_CVE_ST_CLASMA";
        fieldValues += ", ?";
        values.add(this.getVrmcCveStClasma());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CLASIFMAQYEQUI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND VRMC_TIPO_AVALUO = ?";
        values.add(this.getVrmcTipoAvaluo());
        conditions += " AND VRMC_DESCRIPCION = ?";
        values.add(this.getVrmcDescripcion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Clasifmaqyequi instance = (Clasifmaqyequi) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getVrmcTipoAvaluo().equals(instance.getVrmcTipoAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcDescripcion().equals(instance.getVrmcDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcFecAvaluo().equals(instance.getVrmcFecAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcReposiciNuev().equals(instance.getVrmcReposiciNuev()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcNetoReposici().equals(instance.getVrmcNetoReposici()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcDemeritAnual().equals(instance.getVrmcDemeritAnual()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcVidaUtilRem().equals(instance.getVrmcVidaUtilRem()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcVidaUtilTot().equals(instance.getVrmcVidaUtilTot()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcObservaciones().equals(instance.getVrmcObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcAnoAltaReg().equals(instance.getVrmcAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcMesAltaReg().equals(instance.getVrmcMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcDiaAltaReg().equals(instance.getVrmcDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcAnoUltMod().equals(instance.getVrmcAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcMesUltMod().equals(instance.getVrmcMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcDiaUltMod().equals(instance.getVrmcDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVrmcCveStClasma().equals(instance.getVrmcCveStClasma()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Clasifmaqyequi result = new Clasifmaqyequi();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setVrmcTipoAvaluo((String) objectData.getData("VRMC_TIPO_AVALUO"));
        result.setVrmcDescripcion((String) objectData.getData("VRMC_DESCRIPCION"));
        result.setVrmcFecAvaluo((String) objectData.getData("VRMC_FEC_AVALUO"));
        result.setVrmcReposiciNuev((BigDecimal) objectData.getData("VRMC_REPOSICI_NUEV"));
        result.setVrmcNetoReposici((BigDecimal) objectData.getData("VRMC_NETO_REPOSICI"));
        result.setVrmcDemeritAnual((BigDecimal) objectData.getData("VRMC_DEMERIT_ANUAL"));
        result.setVrmcVidaUtilRem((BigDecimal) objectData.getData("VRMC_VIDA_UTIL_REM"));
        result.setVrmcVidaUtilTot((BigDecimal) objectData.getData("VRMC_VIDA_UTIL_TOT"));
        result.setVrmcObservaciones((String) objectData.getData("VRMC_OBSERVACIONES"));
        result.setVrmcAnoAltaReg((BigDecimal) objectData.getData("VRMC_ANO_ALTA_REG"));
        result.setVrmcMesAltaReg((BigDecimal) objectData.getData("VRMC_MES_ALTA_REG"));
        result.setVrmcDiaAltaReg((BigDecimal) objectData.getData("VRMC_DIA_ALTA_REG"));
        result.setVrmcAnoUltMod((BigDecimal) objectData.getData("VRMC_ANO_ULT_MOD"));
        result.setVrmcMesUltMod((BigDecimal) objectData.getData("VRMC_MES_ULT_MOD"));
        result.setVrmcDiaUltMod((BigDecimal) objectData.getData("VRMC_DIA_ULT_MOD"));
        result.setVrmcCveStClasma((String) objectData.getData("VRMC_CVE_ST_CLASMA"));

        return result;

    }

}
