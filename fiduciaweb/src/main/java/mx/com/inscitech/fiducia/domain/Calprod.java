package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CALPROD_PK", columns = { "CAL_NUM_SECUENCIA", "CAL_CVE_FASE_PROD", "CAL_ID_RUTINA" }, sequences = { "MANUAL" })
public class Calprod extends DomainObject {

    String calCveFaseProd = null;
    String calIdRutina = null;
    BigDecimal calNumSecuencia = null;
    BigDecimal calCveProcesado = null;
    BigDecimal calAnoAltaReg = null;
    BigDecimal calMesAltaReg = null;
    BigDecimal calDiaAltaReg = null;
    BigDecimal calAnoUltMod = null;
    BigDecimal calMesUltMod = null;
    BigDecimal calDiaUltMod = null;
    String calCveStCalprod = null;

    public Calprod() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalCveFaseProd(String calCveFaseProd) {
        this.calCveFaseProd = calCveFaseProd;
    }

    public String getCalCveFaseProd() {
        return this.calCveFaseProd;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalIdRutina(String calIdRutina) {
        this.calIdRutina = calIdRutina;
    }

    public String getCalIdRutina() {
        return this.calIdRutina;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCalNumSecuencia(BigDecimal calNumSecuencia) {
        this.calNumSecuencia = calNumSecuencia;
    }

    public BigDecimal getCalNumSecuencia() {
        return this.calNumSecuencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCalCveProcesado(BigDecimal calCveProcesado) {
        this.calCveProcesado = calCveProcesado;
    }

    public BigDecimal getCalCveProcesado() {
        return this.calCveProcesado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoAltaReg(BigDecimal calAnoAltaReg) {
        this.calAnoAltaReg = calAnoAltaReg;
    }

    public BigDecimal getCalAnoAltaReg() {
        return this.calAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesAltaReg(BigDecimal calMesAltaReg) {
        this.calMesAltaReg = calMesAltaReg;
    }

    public BigDecimal getCalMesAltaReg() {
        return this.calMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaAltaReg(BigDecimal calDiaAltaReg) {
        this.calDiaAltaReg = calDiaAltaReg;
    }

    public BigDecimal getCalDiaAltaReg() {
        return this.calDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCalAnoUltMod(BigDecimal calAnoUltMod) {
        this.calAnoUltMod = calAnoUltMod;
    }

    public BigDecimal getCalAnoUltMod() {
        return this.calAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalMesUltMod(BigDecimal calMesUltMod) {
        this.calMesUltMod = calMesUltMod;
    }

    public BigDecimal getCalMesUltMod() {
        return this.calMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCalDiaUltMod(BigDecimal calDiaUltMod) {
        this.calDiaUltMod = calDiaUltMod;
    }

    public BigDecimal getCalDiaUltMod() {
        return this.calDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCalCveStCalprod(String calCveStCalprod) {
        this.calCveStCalprod = calCveStCalprod;
    }

    public String getCalCveStCalprod() {
        return this.calCveStCalprod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CALPROD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCalCveFaseProd() != null && "null".equals(this.getCalCveFaseProd())) {
            conditions += " AND CAL_CVE_FASE_PROD IS NULL";
        } else if (this.getCalCveFaseProd() != null) {
            conditions += " AND CAL_CVE_FASE_PROD = ?";
            values.add(this.getCalCveFaseProd());
        }

        if (this.getCalIdRutina() != null && "null".equals(this.getCalIdRutina())) {
            conditions += " AND CAL_ID_RUTINA IS NULL";
        } else if (this.getCalIdRutina() != null) {
            conditions += " AND CAL_ID_RUTINA = ?";
            values.add(this.getCalIdRutina());
        }

        if (this.getCalNumSecuencia() != null && this.getCalNumSecuencia().longValue() == -999) {
            conditions += " AND CAL_NUM_SECUENCIA IS NULL";
        } else if (this.getCalNumSecuencia() != null) {
            conditions += " AND CAL_NUM_SECUENCIA = ?";
            values.add(this.getCalNumSecuencia());
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
        String sql = "SELECT * FROM CALPROD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCalCveFaseProd() != null && "null".equals(this.getCalCveFaseProd())) {
            conditions += " AND CAL_CVE_FASE_PROD IS NULL";
        } else if (this.getCalCveFaseProd() != null) {
            conditions += " AND CAL_CVE_FASE_PROD = ?";
            values.add(this.getCalCveFaseProd());
        }

        if (this.getCalIdRutina() != null && "null".equals(this.getCalIdRutina())) {
            conditions += " AND CAL_ID_RUTINA IS NULL";
        } else if (this.getCalIdRutina() != null) {
            conditions += " AND CAL_ID_RUTINA = ?";
            values.add(this.getCalIdRutina());
        }

        if (this.getCalNumSecuencia() != null && this.getCalNumSecuencia().longValue() == -999) {
            conditions += " AND CAL_NUM_SECUENCIA IS NULL";
        } else if (this.getCalNumSecuencia() != null) {
            conditions += " AND CAL_NUM_SECUENCIA = ?";
            values.add(this.getCalNumSecuencia());
        }

        if (this.getCalCveProcesado() != null && this.getCalCveProcesado().longValue() == -999) {
            conditions += " AND CAL_CVE_PROCESADO IS NULL";
        } else if (this.getCalCveProcesado() != null) {
            conditions += " AND CAL_CVE_PROCESADO = ?";
            values.add(this.getCalCveProcesado());
        }

        if (this.getCalAnoAltaReg() != null && this.getCalAnoAltaReg().longValue() == -999) {
            conditions += " AND CAL_ANO_ALTA_REG IS NULL";
        } else if (this.getCalAnoAltaReg() != null) {
            conditions += " AND CAL_ANO_ALTA_REG = ?";
            values.add(this.getCalAnoAltaReg());
        }

        if (this.getCalMesAltaReg() != null && this.getCalMesAltaReg().longValue() == -999) {
            conditions += " AND CAL_MES_ALTA_REG IS NULL";
        } else if (this.getCalMesAltaReg() != null) {
            conditions += " AND CAL_MES_ALTA_REG = ?";
            values.add(this.getCalMesAltaReg());
        }

        if (this.getCalDiaAltaReg() != null && this.getCalDiaAltaReg().longValue() == -999) {
            conditions += " AND CAL_DIA_ALTA_REG IS NULL";
        } else if (this.getCalDiaAltaReg() != null) {
            conditions += " AND CAL_DIA_ALTA_REG = ?";
            values.add(this.getCalDiaAltaReg());
        }

        if (this.getCalAnoUltMod() != null && this.getCalAnoUltMod().longValue() == -999) {
            conditions += " AND CAL_ANO_ULT_MOD IS NULL";
        } else if (this.getCalAnoUltMod() != null) {
            conditions += " AND CAL_ANO_ULT_MOD = ?";
            values.add(this.getCalAnoUltMod());
        }

        if (this.getCalMesUltMod() != null && this.getCalMesUltMod().longValue() == -999) {
            conditions += " AND CAL_MES_ULT_MOD IS NULL";
        } else if (this.getCalMesUltMod() != null) {
            conditions += " AND CAL_MES_ULT_MOD = ?";
            values.add(this.getCalMesUltMod());
        }

        if (this.getCalDiaUltMod() != null && this.getCalDiaUltMod().longValue() == -999) {
            conditions += " AND CAL_DIA_ULT_MOD IS NULL";
        } else if (this.getCalDiaUltMod() != null) {
            conditions += " AND CAL_DIA_ULT_MOD = ?";
            values.add(this.getCalDiaUltMod());
        }

        if (this.getCalCveStCalprod() != null && "null".equals(this.getCalCveStCalprod())) {
            conditions += " AND CAL_CVE_ST_CALPROD IS NULL";
        } else if (this.getCalCveStCalprod() != null) {
            conditions += " AND CAL_CVE_ST_CALPROD = ?";
            values.add(this.getCalCveStCalprod());
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
        String sql = "UPDATE CALPROD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CAL_CVE_FASE_PROD = ?";
        pkValues.add(this.getCalCveFaseProd());
        conditions += " AND CAL_ID_RUTINA = ?";
        pkValues.add(this.getCalIdRutina());
        conditions += " AND CAL_NUM_SECUENCIA = ?";
        pkValues.add(this.getCalNumSecuencia());
        fields += " CAL_CVE_PROCESADO = ?, ";
        values.add(this.getCalCveProcesado());
        fields += " CAL_ANO_ALTA_REG = ?, ";
        values.add(this.getCalAnoAltaReg());
        fields += " CAL_MES_ALTA_REG = ?, ";
        values.add(this.getCalMesAltaReg());
        fields += " CAL_DIA_ALTA_REG = ?, ";
        values.add(this.getCalDiaAltaReg());
        fields += " CAL_ANO_ULT_MOD = ?, ";
        values.add(this.getCalAnoUltMod());
        fields += " CAL_MES_ULT_MOD = ?, ";
        values.add(this.getCalMesUltMod());
        fields += " CAL_DIA_ULT_MOD = ?, ";
        values.add(this.getCalDiaUltMod());
        fields += " CAL_CVE_ST_CALPROD = ?, ";
        values.add(this.getCalCveStCalprod());
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
        String sql = "INSERT INTO CALPROD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CAL_CVE_FASE_PROD";
        fieldValues += ", ?";
        values.add(this.getCalCveFaseProd());

        fields += ", CAL_ID_RUTINA";
        fieldValues += ", ?";
        values.add(this.getCalIdRutina());

        fields += ", CAL_NUM_SECUENCIA";
        fieldValues += ", ?";
        values.add(this.getCalNumSecuencia());

        fields += ", CAL_CVE_PROCESADO";
        fieldValues += ", ?";
        values.add(this.getCalCveProcesado());

        fields += ", CAL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCalAnoAltaReg());

        fields += ", CAL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCalMesAltaReg());

        fields += ", CAL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCalDiaAltaReg());

        fields += ", CAL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCalAnoUltMod());

        fields += ", CAL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCalMesUltMod());

        fields += ", CAL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCalDiaUltMod());

        fields += ", CAL_CVE_ST_CALPROD";
        fieldValues += ", ?";
        values.add(this.getCalCveStCalprod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CALPROD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CAL_CVE_FASE_PROD = ?";
        values.add(this.getCalCveFaseProd());
        conditions += " AND CAL_ID_RUTINA = ?";
        values.add(this.getCalIdRutina());
        conditions += " AND CAL_NUM_SECUENCIA = ?";
        values.add(this.getCalNumSecuencia());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Calprod instance = (Calprod) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCalCveFaseProd().equals(instance.getCalCveFaseProd()))
            equalObjects = false;
        if (equalObjects && !this.getCalIdRutina().equals(instance.getCalIdRutina()))
            equalObjects = false;
        if (equalObjects && !this.getCalNumSecuencia().equals(instance.getCalNumSecuencia()))
            equalObjects = false;
        if (equalObjects && !this.getCalCveProcesado().equals(instance.getCalCveProcesado()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoAltaReg().equals(instance.getCalAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesAltaReg().equals(instance.getCalMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaAltaReg().equals(instance.getCalDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCalAnoUltMod().equals(instance.getCalAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCalMesUltMod().equals(instance.getCalMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCalDiaUltMod().equals(instance.getCalDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCalCveStCalprod().equals(instance.getCalCveStCalprod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Calprod result = new Calprod();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCalCveFaseProd((String) objectData.getData("CAL_CVE_FASE_PROD"));
        result.setCalIdRutina((String) objectData.getData("CAL_ID_RUTINA"));
        result.setCalNumSecuencia((BigDecimal) objectData.getData("CAL_NUM_SECUENCIA"));
        result.setCalCveProcesado((BigDecimal) objectData.getData("CAL_CVE_PROCESADO"));
        result.setCalAnoAltaReg((BigDecimal) objectData.getData("CAL_ANO_ALTA_REG"));
        result.setCalMesAltaReg((BigDecimal) objectData.getData("CAL_MES_ALTA_REG"));
        result.setCalDiaAltaReg((BigDecimal) objectData.getData("CAL_DIA_ALTA_REG"));
        result.setCalAnoUltMod((BigDecimal) objectData.getData("CAL_ANO_ULT_MOD"));
        result.setCalMesUltMod((BigDecimal) objectData.getData("CAL_MES_ULT_MOD"));
        result.setCalDiaUltMod((BigDecimal) objectData.getData("CAL_DIA_ULT_MOD"));
        result.setCalCveStCalprod((String) objectData.getData("CAL_CVE_ST_CALPROD"));

        return result;

    }

}
