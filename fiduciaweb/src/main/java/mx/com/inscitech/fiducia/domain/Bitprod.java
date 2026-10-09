package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "BITPROD_PK", columns = { "BIP_CVE_FASE_PRODU", "BIP_DIA_EJECUCION", "BIP_ID_RUTINA", "BIP_MES_EJECUCION", "BIP_ANO_ULT_MOD" },
            sequences = { "MANUAL" })
public class Bitprod extends DomainObject {

    BigDecimal bipMesEjecucion = null;
    BigDecimal bipDiaEjecucion = null;
    String bipCveFaseProdu = null;
    String bipIdRutina = null;
    BigDecimal bipNumSecuencia = null;
    BigDecimal bipHrIniRutina = null;
    BigDecimal bipMiIniRutina = null;
    BigDecimal bipHrFinRutina = null;
    BigDecimal bipMinFinRutina = null;
    String bipComentarios = null;
    BigDecimal bipNumRegLeidos = null;
    BigDecimal bipRegAplicados = null;
    BigDecimal bipNumRegError = null;
    BigDecimal bipNumUsuario = null;
    String bipDetBitacora = null;
    BigDecimal bipAnoAltaReg = null;
    BigDecimal bipMesAltaReg = null;
    BigDecimal bipDiaAltaReg = null;
    BigDecimal bipAnoUltMod = null;
    BigDecimal bipMesUltMod = null;
    BigDecimal bipDiaUltMod = null;
    String bipCveStBitprod = null;

    public Bitprod() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBipMesEjecucion(BigDecimal bipMesEjecucion) {
        this.bipMesEjecucion = bipMesEjecucion;
    }

    public BigDecimal getBipMesEjecucion() {
        return this.bipMesEjecucion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBipDiaEjecucion(BigDecimal bipDiaEjecucion) {
        this.bipDiaEjecucion = bipDiaEjecucion;
    }

    public BigDecimal getBipDiaEjecucion() {
        return this.bipDiaEjecucion;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setBipCveFaseProdu(String bipCveFaseProdu) {
        this.bipCveFaseProdu = bipCveFaseProdu;
    }

    public String getBipCveFaseProdu() {
        return this.bipCveFaseProdu;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setBipIdRutina(String bipIdRutina) {
        this.bipIdRutina = bipIdRutina;
    }

    public String getBipIdRutina() {
        return this.bipIdRutina;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBipNumSecuencia(BigDecimal bipNumSecuencia) {
        this.bipNumSecuencia = bipNumSecuencia;
    }

    public BigDecimal getBipNumSecuencia() {
        return this.bipNumSecuencia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBipHrIniRutina(BigDecimal bipHrIniRutina) {
        this.bipHrIniRutina = bipHrIniRutina;
    }

    public BigDecimal getBipHrIniRutina() {
        return this.bipHrIniRutina;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBipMiIniRutina(BigDecimal bipMiIniRutina) {
        this.bipMiIniRutina = bipMiIniRutina;
    }

    public BigDecimal getBipMiIniRutina() {
        return this.bipMiIniRutina;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBipHrFinRutina(BigDecimal bipHrFinRutina) {
        this.bipHrFinRutina = bipHrFinRutina;
    }

    public BigDecimal getBipHrFinRutina() {
        return this.bipHrFinRutina;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBipMinFinRutina(BigDecimal bipMinFinRutina) {
        this.bipMinFinRutina = bipMinFinRutina;
    }

    public BigDecimal getBipMinFinRutina() {
        return this.bipMinFinRutina;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBipComentarios(String bipComentarios) {
        this.bipComentarios = bipComentarios;
    }

    public String getBipComentarios() {
        return this.bipComentarios;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBipNumRegLeidos(BigDecimal bipNumRegLeidos) {
        this.bipNumRegLeidos = bipNumRegLeidos;
    }

    public BigDecimal getBipNumRegLeidos() {
        return this.bipNumRegLeidos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBipRegAplicados(BigDecimal bipRegAplicados) {
        this.bipRegAplicados = bipRegAplicados;
    }

    public BigDecimal getBipRegAplicados() {
        return this.bipRegAplicados;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBipNumRegError(BigDecimal bipNumRegError) {
        this.bipNumRegError = bipNumRegError;
    }

    public BigDecimal getBipNumRegError() {
        return this.bipNumRegError;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setBipNumUsuario(BigDecimal bipNumUsuario) {
        this.bipNumUsuario = bipNumUsuario;
    }

    public BigDecimal getBipNumUsuario() {
        return this.bipNumUsuario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBipDetBitacora(String bipDetBitacora) {
        this.bipDetBitacora = bipDetBitacora;
    }

    public String getBipDetBitacora() {
        return this.bipDetBitacora;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBipAnoAltaReg(BigDecimal bipAnoAltaReg) {
        this.bipAnoAltaReg = bipAnoAltaReg;
    }

    public BigDecimal getBipAnoAltaReg() {
        return this.bipAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBipMesAltaReg(BigDecimal bipMesAltaReg) {
        this.bipMesAltaReg = bipMesAltaReg;
    }

    public BigDecimal getBipMesAltaReg() {
        return this.bipMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBipDiaAltaReg(BigDecimal bipDiaAltaReg) {
        this.bipDiaAltaReg = bipDiaAltaReg;
    }

    public BigDecimal getBipDiaAltaReg() {
        return this.bipDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setBipAnoUltMod(BigDecimal bipAnoUltMod) {
        this.bipAnoUltMod = bipAnoUltMod;
    }

    public BigDecimal getBipAnoUltMod() {
        return this.bipAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBipMesUltMod(BigDecimal bipMesUltMod) {
        this.bipMesUltMod = bipMesUltMod;
    }

    public BigDecimal getBipMesUltMod() {
        return this.bipMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setBipDiaUltMod(BigDecimal bipDiaUltMod) {
        this.bipDiaUltMod = bipDiaUltMod;
    }

    public BigDecimal getBipDiaUltMod() {
        return this.bipDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setBipCveStBitprod(String bipCveStBitprod) {
        this.bipCveStBitprod = bipCveStBitprod;
    }

    public String getBipCveStBitprod() {
        return this.bipCveStBitprod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM BITPROD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getBipMesEjecucion() != null && this.getBipMesEjecucion().longValue() == -999) {
            conditions += " AND BIP_MES_EJECUCION IS NULL";
        } else if (this.getBipMesEjecucion() != null) {
            conditions += " AND BIP_MES_EJECUCION = ?";
            values.add(this.getBipMesEjecucion());
        }

        if (this.getBipDiaEjecucion() != null && this.getBipDiaEjecucion().longValue() == -999) {
            conditions += " AND BIP_DIA_EJECUCION IS NULL";
        } else if (this.getBipDiaEjecucion() != null) {
            conditions += " AND BIP_DIA_EJECUCION = ?";
            values.add(this.getBipDiaEjecucion());
        }

        if (this.getBipCveFaseProdu() != null && "null".equals(this.getBipCveFaseProdu())) {
            conditions += " AND BIP_CVE_FASE_PRODU IS NULL";
        } else if (this.getBipCveFaseProdu() != null) {
            conditions += " AND BIP_CVE_FASE_PRODU = ?";
            values.add(this.getBipCveFaseProdu());
        }

        if (this.getBipIdRutina() != null && "null".equals(this.getBipIdRutina())) {
            conditions += " AND BIP_ID_RUTINA IS NULL";
        } else if (this.getBipIdRutina() != null) {
            conditions += " AND BIP_ID_RUTINA = ?";
            values.add(this.getBipIdRutina());
        }

        if (this.getBipAnoUltMod() != null && this.getBipAnoUltMod().longValue() == -999) {
            conditions += " AND BIP_ANO_ULT_MOD IS NULL";
        } else if (this.getBipAnoUltMod() != null) {
            conditions += " AND BIP_ANO_ULT_MOD = ?";
            values.add(this.getBipAnoUltMod());
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
        String sql = "SELECT * FROM BITPROD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getBipMesEjecucion() != null && this.getBipMesEjecucion().longValue() == -999) {
            conditions += " AND BIP_MES_EJECUCION IS NULL";
        } else if (this.getBipMesEjecucion() != null) {
            conditions += " AND BIP_MES_EJECUCION = ?";
            values.add(this.getBipMesEjecucion());
        }

        if (this.getBipDiaEjecucion() != null && this.getBipDiaEjecucion().longValue() == -999) {
            conditions += " AND BIP_DIA_EJECUCION IS NULL";
        } else if (this.getBipDiaEjecucion() != null) {
            conditions += " AND BIP_DIA_EJECUCION = ?";
            values.add(this.getBipDiaEjecucion());
        }

        if (this.getBipCveFaseProdu() != null && "null".equals(this.getBipCveFaseProdu())) {
            conditions += " AND BIP_CVE_FASE_PRODU IS NULL";
        } else if (this.getBipCveFaseProdu() != null) {
            conditions += " AND BIP_CVE_FASE_PRODU = ?";
            values.add(this.getBipCveFaseProdu());
        }

        if (this.getBipIdRutina() != null && "null".equals(this.getBipIdRutina())) {
            conditions += " AND BIP_ID_RUTINA IS NULL";
        } else if (this.getBipIdRutina() != null) {
            conditions += " AND BIP_ID_RUTINA = ?";
            values.add(this.getBipIdRutina());
        }

        if (this.getBipNumSecuencia() != null && this.getBipNumSecuencia().longValue() == -999) {
            conditions += " AND BIP_NUM_SECUENCIA IS NULL";
        } else if (this.getBipNumSecuencia() != null) {
            conditions += " AND BIP_NUM_SECUENCIA = ?";
            values.add(this.getBipNumSecuencia());
        }

        if (this.getBipHrIniRutina() != null && this.getBipHrIniRutina().longValue() == -999) {
            conditions += " AND BIP_HR_INI_RUTINA IS NULL";
        } else if (this.getBipHrIniRutina() != null) {
            conditions += " AND BIP_HR_INI_RUTINA = ?";
            values.add(this.getBipHrIniRutina());
        }

        if (this.getBipMiIniRutina() != null && this.getBipMiIniRutina().longValue() == -999) {
            conditions += " AND BIP_MI_INI_RUTINA IS NULL";
        } else if (this.getBipMiIniRutina() != null) {
            conditions += " AND BIP_MI_INI_RUTINA = ?";
            values.add(this.getBipMiIniRutina());
        }

        if (this.getBipHrFinRutina() != null && this.getBipHrFinRutina().longValue() == -999) {
            conditions += " AND BIP_HR_FIN_RUTINA IS NULL";
        } else if (this.getBipHrFinRutina() != null) {
            conditions += " AND BIP_HR_FIN_RUTINA = ?";
            values.add(this.getBipHrFinRutina());
        }

        if (this.getBipMinFinRutina() != null && this.getBipMinFinRutina().longValue() == -999) {
            conditions += " AND BIP_MIN_FIN_RUTINA IS NULL";
        } else if (this.getBipMinFinRutina() != null) {
            conditions += " AND BIP_MIN_FIN_RUTINA = ?";
            values.add(this.getBipMinFinRutina());
        }

        if (this.getBipComentarios() != null && "null".equals(this.getBipComentarios())) {
            conditions += " AND BIP_COMENTARIOS IS NULL";
        } else if (this.getBipComentarios() != null) {
            conditions += " AND BIP_COMENTARIOS = ?";
            values.add(this.getBipComentarios());
        }

        if (this.getBipNumRegLeidos() != null && this.getBipNumRegLeidos().longValue() == -999) {
            conditions += " AND BIP_NUM_REG_LEIDOS IS NULL";
        } else if (this.getBipNumRegLeidos() != null) {
            conditions += " AND BIP_NUM_REG_LEIDOS = ?";
            values.add(this.getBipNumRegLeidos());
        }

        if (this.getBipRegAplicados() != null && this.getBipRegAplicados().longValue() == -999) {
            conditions += " AND BIP_REG_APLICADOS IS NULL";
        } else if (this.getBipRegAplicados() != null) {
            conditions += " AND BIP_REG_APLICADOS = ?";
            values.add(this.getBipRegAplicados());
        }

        if (this.getBipNumRegError() != null && this.getBipNumRegError().longValue() == -999) {
            conditions += " AND BIP_NUM_REG_ERROR IS NULL";
        } else if (this.getBipNumRegError() != null) {
            conditions += " AND BIP_NUM_REG_ERROR = ?";
            values.add(this.getBipNumRegError());
        }

        if (this.getBipNumUsuario() != null && this.getBipNumUsuario().longValue() == -999) {
            conditions += " AND BIP_NUM_USUARIO IS NULL";
        } else if (this.getBipNumUsuario() != null) {
            conditions += " AND BIP_NUM_USUARIO = ?";
            values.add(this.getBipNumUsuario());
        }

        if (this.getBipDetBitacora() != null && "null".equals(this.getBipDetBitacora())) {
            conditions += " AND BIP_DET_BITACORA IS NULL";
        } else if (this.getBipDetBitacora() != null) {
            conditions += " AND BIP_DET_BITACORA = ?";
            values.add(this.getBipDetBitacora());
        }

        if (this.getBipAnoAltaReg() != null && this.getBipAnoAltaReg().longValue() == -999) {
            conditions += " AND BIP_ANO_ALTA_REG IS NULL";
        } else if (this.getBipAnoAltaReg() != null) {
            conditions += " AND BIP_ANO_ALTA_REG = ?";
            values.add(this.getBipAnoAltaReg());
        }

        if (this.getBipMesAltaReg() != null && this.getBipMesAltaReg().longValue() == -999) {
            conditions += " AND BIP_MES_ALTA_REG IS NULL";
        } else if (this.getBipMesAltaReg() != null) {
            conditions += " AND BIP_MES_ALTA_REG = ?";
            values.add(this.getBipMesAltaReg());
        }

        if (this.getBipDiaAltaReg() != null && this.getBipDiaAltaReg().longValue() == -999) {
            conditions += " AND BIP_DIA_ALTA_REG IS NULL";
        } else if (this.getBipDiaAltaReg() != null) {
            conditions += " AND BIP_DIA_ALTA_REG = ?";
            values.add(this.getBipDiaAltaReg());
        }

        if (this.getBipAnoUltMod() != null && this.getBipAnoUltMod().longValue() == -999) {
            conditions += " AND BIP_ANO_ULT_MOD IS NULL";
        } else if (this.getBipAnoUltMod() != null) {
            conditions += " AND BIP_ANO_ULT_MOD = ?";
            values.add(this.getBipAnoUltMod());
        }

        if (this.getBipMesUltMod() != null && this.getBipMesUltMod().longValue() == -999) {
            conditions += " AND BIP_MES_ULT_MOD IS NULL";
        } else if (this.getBipMesUltMod() != null) {
            conditions += " AND BIP_MES_ULT_MOD = ?";
            values.add(this.getBipMesUltMod());
        }

        if (this.getBipDiaUltMod() != null && this.getBipDiaUltMod().longValue() == -999) {
            conditions += " AND BIP_DIA_ULT_MOD IS NULL";
        } else if (this.getBipDiaUltMod() != null) {
            conditions += " AND BIP_DIA_ULT_MOD = ?";
            values.add(this.getBipDiaUltMod());
        }

        if (this.getBipCveStBitprod() != null && "null".equals(this.getBipCveStBitprod())) {
            conditions += " AND BIP_CVE_ST_BITPROD IS NULL";
        } else if (this.getBipCveStBitprod() != null) {
            conditions += " AND BIP_CVE_ST_BITPROD = ?";
            values.add(this.getBipCveStBitprod());
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
        String sql = "UPDATE BITPROD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND BIP_MES_EJECUCION = ?";
        pkValues.add(this.getBipMesEjecucion());
        conditions += " AND BIP_DIA_EJECUCION = ?";
        pkValues.add(this.getBipDiaEjecucion());
        conditions += " AND BIP_CVE_FASE_PRODU = ?";
        pkValues.add(this.getBipCveFaseProdu());
        conditions += " AND BIP_ID_RUTINA = ?";
        pkValues.add(this.getBipIdRutina());
        fields += " BIP_NUM_SECUENCIA = ?, ";
        values.add(this.getBipNumSecuencia());
        fields += " BIP_HR_INI_RUTINA = ?, ";
        values.add(this.getBipHrIniRutina());
        fields += " BIP_MI_INI_RUTINA = ?, ";
        values.add(this.getBipMiIniRutina());
        fields += " BIP_HR_FIN_RUTINA = ?, ";
        values.add(this.getBipHrFinRutina());
        fields += " BIP_MIN_FIN_RUTINA = ?, ";
        values.add(this.getBipMinFinRutina());
        fields += " BIP_COMENTARIOS = ?, ";
        values.add(this.getBipComentarios());
        fields += " BIP_NUM_REG_LEIDOS = ?, ";
        values.add(this.getBipNumRegLeidos());
        fields += " BIP_REG_APLICADOS = ?, ";
        values.add(this.getBipRegAplicados());
        fields += " BIP_NUM_REG_ERROR = ?, ";
        values.add(this.getBipNumRegError());
        fields += " BIP_NUM_USUARIO = ?, ";
        values.add(this.getBipNumUsuario());
        fields += " BIP_DET_BITACORA = ?, ";
        values.add(this.getBipDetBitacora());
        fields += " BIP_ANO_ALTA_REG = ?, ";
        values.add(this.getBipAnoAltaReg());
        fields += " BIP_MES_ALTA_REG = ?, ";
        values.add(this.getBipMesAltaReg());
        fields += " BIP_DIA_ALTA_REG = ?, ";
        values.add(this.getBipDiaAltaReg());
        conditions += " AND BIP_ANO_ULT_MOD = ?";
        pkValues.add(this.getBipAnoUltMod());
        fields += " BIP_MES_ULT_MOD = ?, ";
        values.add(this.getBipMesUltMod());
        fields += " BIP_DIA_ULT_MOD = ?, ";
        values.add(this.getBipDiaUltMod());
        fields += " BIP_CVE_ST_BITPROD = ?, ";
        values.add(this.getBipCveStBitprod());
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
        String sql = "INSERT INTO BITPROD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", BIP_MES_EJECUCION";
        fieldValues += ", ?";
        values.add(this.getBipMesEjecucion());

        fields += ", BIP_DIA_EJECUCION";
        fieldValues += ", ?";
        values.add(this.getBipDiaEjecucion());

        fields += ", BIP_CVE_FASE_PRODU";
        fieldValues += ", ?";
        values.add(this.getBipCveFaseProdu());

        fields += ", BIP_ID_RUTINA";
        fieldValues += ", ?";
        values.add(this.getBipIdRutina());

        fields += ", BIP_NUM_SECUENCIA";
        fieldValues += ", ?";
        values.add(this.getBipNumSecuencia());

        fields += ", BIP_HR_INI_RUTINA";
        fieldValues += ", ?";
        values.add(this.getBipHrIniRutina());

        fields += ", BIP_MI_INI_RUTINA";
        fieldValues += ", ?";
        values.add(this.getBipMiIniRutina());

        fields += ", BIP_HR_FIN_RUTINA";
        fieldValues += ", ?";
        values.add(this.getBipHrFinRutina());

        fields += ", BIP_MIN_FIN_RUTINA";
        fieldValues += ", ?";
        values.add(this.getBipMinFinRutina());

        fields += ", BIP_COMENTARIOS";
        fieldValues += ", ?";
        values.add(this.getBipComentarios());

        fields += ", BIP_NUM_REG_LEIDOS";
        fieldValues += ", ?";
        values.add(this.getBipNumRegLeidos());

        fields += ", BIP_REG_APLICADOS";
        fieldValues += ", ?";
        values.add(this.getBipRegAplicados());

        fields += ", BIP_NUM_REG_ERROR";
        fieldValues += ", ?";
        values.add(this.getBipNumRegError());

        fields += ", BIP_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getBipNumUsuario());

        fields += ", BIP_DET_BITACORA";
        fieldValues += ", ?";
        values.add(this.getBipDetBitacora());

        fields += ", BIP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBipAnoAltaReg());

        fields += ", BIP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBipMesAltaReg());

        fields += ", BIP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getBipDiaAltaReg());

        fields += ", BIP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBipAnoUltMod());

        fields += ", BIP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBipMesUltMod());

        fields += ", BIP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getBipDiaUltMod());

        fields += ", BIP_CVE_ST_BITPROD";
        fieldValues += ", ?";
        values.add(this.getBipCveStBitprod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM BITPROD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND BIP_MES_EJECUCION = ?";
        values.add(this.getBipMesEjecucion());
        conditions += " AND BIP_DIA_EJECUCION = ?";
        values.add(this.getBipDiaEjecucion());
        conditions += " AND BIP_CVE_FASE_PRODU = ?";
        values.add(this.getBipCveFaseProdu());
        conditions += " AND BIP_ID_RUTINA = ?";
        values.add(this.getBipIdRutina());
        conditions += " AND BIP_ANO_ULT_MOD = ?";
        values.add(this.getBipAnoUltMod());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Bitprod instance = (Bitprod) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getBipMesEjecucion().equals(instance.getBipMesEjecucion()))
            equalObjects = false;
        if (equalObjects && !this.getBipDiaEjecucion().equals(instance.getBipDiaEjecucion()))
            equalObjects = false;
        if (equalObjects && !this.getBipCveFaseProdu().equals(instance.getBipCveFaseProdu()))
            equalObjects = false;
        if (equalObjects && !this.getBipIdRutina().equals(instance.getBipIdRutina()))
            equalObjects = false;
        if (equalObjects && !this.getBipNumSecuencia().equals(instance.getBipNumSecuencia()))
            equalObjects = false;
        if (equalObjects && !this.getBipHrIniRutina().equals(instance.getBipHrIniRutina()))
            equalObjects = false;
        if (equalObjects && !this.getBipMiIniRutina().equals(instance.getBipMiIniRutina()))
            equalObjects = false;
        if (equalObjects && !this.getBipHrFinRutina().equals(instance.getBipHrFinRutina()))
            equalObjects = false;
        if (equalObjects && !this.getBipMinFinRutina().equals(instance.getBipMinFinRutina()))
            equalObjects = false;
        if (equalObjects && !this.getBipComentarios().equals(instance.getBipComentarios()))
            equalObjects = false;
        if (equalObjects && !this.getBipNumRegLeidos().equals(instance.getBipNumRegLeidos()))
            equalObjects = false;
        if (equalObjects && !this.getBipRegAplicados().equals(instance.getBipRegAplicados()))
            equalObjects = false;
        if (equalObjects && !this.getBipNumRegError().equals(instance.getBipNumRegError()))
            equalObjects = false;
        if (equalObjects && !this.getBipNumUsuario().equals(instance.getBipNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getBipDetBitacora().equals(instance.getBipDetBitacora()))
            equalObjects = false;
        if (equalObjects && !this.getBipAnoAltaReg().equals(instance.getBipAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBipMesAltaReg().equals(instance.getBipMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBipDiaAltaReg().equals(instance.getBipDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getBipAnoUltMod().equals(instance.getBipAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBipMesUltMod().equals(instance.getBipMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBipDiaUltMod().equals(instance.getBipDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getBipCveStBitprod().equals(instance.getBipCveStBitprod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Bitprod result = new Bitprod();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setBipMesEjecucion((BigDecimal) objectData.getData("BIP_MES_EJECUCION"));
        result.setBipDiaEjecucion((BigDecimal) objectData.getData("BIP_DIA_EJECUCION"));
        result.setBipCveFaseProdu((String) objectData.getData("BIP_CVE_FASE_PRODU"));
        result.setBipIdRutina((String) objectData.getData("BIP_ID_RUTINA"));
        result.setBipNumSecuencia((BigDecimal) objectData.getData("BIP_NUM_SECUENCIA"));
        result.setBipHrIniRutina((BigDecimal) objectData.getData("BIP_HR_INI_RUTINA"));
        result.setBipMiIniRutina((BigDecimal) objectData.getData("BIP_MI_INI_RUTINA"));
        result.setBipHrFinRutina((BigDecimal) objectData.getData("BIP_HR_FIN_RUTINA"));
        result.setBipMinFinRutina((BigDecimal) objectData.getData("BIP_MIN_FIN_RUTINA"));
        result.setBipComentarios((String) objectData.getData("BIP_COMENTARIOS"));
        result.setBipNumRegLeidos((BigDecimal) objectData.getData("BIP_NUM_REG_LEIDOS"));
        result.setBipRegAplicados((BigDecimal) objectData.getData("BIP_REG_APLICADOS"));
        result.setBipNumRegError((BigDecimal) objectData.getData("BIP_NUM_REG_ERROR"));
        result.setBipNumUsuario((BigDecimal) objectData.getData("BIP_NUM_USUARIO"));
        result.setBipDetBitacora((String) objectData.getData("BIP_DET_BITACORA"));
        result.setBipAnoAltaReg((BigDecimal) objectData.getData("BIP_ANO_ALTA_REG"));
        result.setBipMesAltaReg((BigDecimal) objectData.getData("BIP_MES_ALTA_REG"));
        result.setBipDiaAltaReg((BigDecimal) objectData.getData("BIP_DIA_ALTA_REG"));
        result.setBipAnoUltMod((BigDecimal) objectData.getData("BIP_ANO_ULT_MOD"));
        result.setBipMesUltMod((BigDecimal) objectData.getData("BIP_MES_ULT_MOD"));
        result.setBipDiaUltMod((BigDecimal) objectData.getData("BIP_DIA_ULT_MOD"));
        result.setBipCveStBitprod((String) objectData.getData("BIP_CVE_ST_BITPROD"));

        return result;

    }

}
