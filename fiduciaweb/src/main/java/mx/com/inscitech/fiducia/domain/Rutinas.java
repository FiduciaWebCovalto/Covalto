package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "RUTINAS_PK", columns = { "RUT_ID_RUTINA" }, sequences = { "MAX" })
public class Rutinas extends DomainObject {

    String rutIdRutina = null;
    String rutNomRutina = null;
    String rutDescRutina = null;
    String rutCveAreaResp = null;
    String rutCveProceso = null;
    String rutCvePeriod = null;
    BigDecimal rutCveImpresion = null;
    String rutCvePapeleria = null;
    BigDecimal rutCveRespDatos = null;
    BigDecimal rutNumUsuario = null;
    BigDecimal rutCveBloqueo = null;
    String rutTextoBloqueo = null;
    String rutFecInicBloq = null;
    String rutFecFinBloq = null;
    BigDecimal rutAnoAltaReg = null;
    BigDecimal rutMesAltaReg = null;
    BigDecimal rutDiaAltaReg = null;
    BigDecimal rutAnoUltMod = null;
    BigDecimal rutMesUltMod = null;
    BigDecimal rutDiaUltMod = null;
    String rutCveStRutinas = null;

    public Rutinas() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutIdRutina(String rutIdRutina) {
        this.rutIdRutina = rutIdRutina;
    }

    public String getRutIdRutina() {
        return this.rutIdRutina;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutNomRutina(String rutNomRutina) {
        this.rutNomRutina = rutNomRutina;
    }

    public String getRutNomRutina() {
        return this.rutNomRutina;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutDescRutina(String rutDescRutina) {
        this.rutDescRutina = rutDescRutina;
    }

    public String getRutDescRutina() {
        return this.rutDescRutina;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutCveAreaResp(String rutCveAreaResp) {
        this.rutCveAreaResp = rutCveAreaResp;
    }

    public String getRutCveAreaResp() {
        return this.rutCveAreaResp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutCveProceso(String rutCveProceso) {
        this.rutCveProceso = rutCveProceso;
    }

    public String getRutCveProceso() {
        return this.rutCveProceso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutCvePeriod(String rutCvePeriod) {
        this.rutCvePeriod = rutCvePeriod;
    }

    public String getRutCvePeriod() {
        return this.rutCvePeriod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRutCveImpresion(BigDecimal rutCveImpresion) {
        this.rutCveImpresion = rutCveImpresion;
    }

    public BigDecimal getRutCveImpresion() {
        return this.rutCveImpresion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutCvePapeleria(String rutCvePapeleria) {
        this.rutCvePapeleria = rutCvePapeleria;
    }

    public String getRutCvePapeleria() {
        return this.rutCvePapeleria;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRutCveRespDatos(BigDecimal rutCveRespDatos) {
        this.rutCveRespDatos = rutCveRespDatos;
    }

    public BigDecimal getRutCveRespDatos() {
        return this.rutCveRespDatos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRutNumUsuario(BigDecimal rutNumUsuario) {
        this.rutNumUsuario = rutNumUsuario;
    }

    public BigDecimal getRutNumUsuario() {
        return this.rutNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRutCveBloqueo(BigDecimal rutCveBloqueo) {
        this.rutCveBloqueo = rutCveBloqueo;
    }

    public BigDecimal getRutCveBloqueo() {
        return this.rutCveBloqueo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutTextoBloqueo(String rutTextoBloqueo) {
        this.rutTextoBloqueo = rutTextoBloqueo;
    }

    public String getRutTextoBloqueo() {
        return this.rutTextoBloqueo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutFecInicBloq(String rutFecInicBloq) {
        this.rutFecInicBloq = rutFecInicBloq;
    }

    public String getRutFecInicBloq() {
        return this.rutFecInicBloq;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutFecFinBloq(String rutFecFinBloq) {
        this.rutFecFinBloq = rutFecFinBloq;
    }

    public String getRutFecFinBloq() {
        return this.rutFecFinBloq;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRutAnoAltaReg(BigDecimal rutAnoAltaReg) {
        this.rutAnoAltaReg = rutAnoAltaReg;
    }

    public BigDecimal getRutAnoAltaReg() {
        return this.rutAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRutMesAltaReg(BigDecimal rutMesAltaReg) {
        this.rutMesAltaReg = rutMesAltaReg;
    }

    public BigDecimal getRutMesAltaReg() {
        return this.rutMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRutDiaAltaReg(BigDecimal rutDiaAltaReg) {
        this.rutDiaAltaReg = rutDiaAltaReg;
    }

    public BigDecimal getRutDiaAltaReg() {
        return this.rutDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRutAnoUltMod(BigDecimal rutAnoUltMod) {
        this.rutAnoUltMod = rutAnoUltMod;
    }

    public BigDecimal getRutAnoUltMod() {
        return this.rutAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRutMesUltMod(BigDecimal rutMesUltMod) {
        this.rutMesUltMod = rutMesUltMod;
    }

    public BigDecimal getRutMesUltMod() {
        return this.rutMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRutDiaUltMod(BigDecimal rutDiaUltMod) {
        this.rutDiaUltMod = rutDiaUltMod;
    }

    public BigDecimal getRutDiaUltMod() {
        return this.rutDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRutCveStRutinas(String rutCveStRutinas) {
        this.rutCveStRutinas = rutCveStRutinas;
    }

    public String getRutCveStRutinas() {
        return this.rutCveStRutinas;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM RUTINAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRutIdRutina() != null && "null".equals(this.getRutIdRutina())) {
            conditions += " AND RUT_ID_RUTINA IS NULL";
        } else if (this.getRutIdRutina() != null) {
            conditions += " AND RUT_ID_RUTINA = ?";
            values.add(this.getRutIdRutina());
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
        String sql = "SELECT * FROM RUTINAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRutIdRutina() != null && "null".equals(this.getRutIdRutina())) {
            conditions += " AND RUT_ID_RUTINA IS NULL";
        } else if (this.getRutIdRutina() != null) {
            conditions += " AND RUT_ID_RUTINA = ?";
            values.add(this.getRutIdRutina());
        }

        if (this.getRutNomRutina() != null && "null".equals(this.getRutNomRutina())) {
            conditions += " AND RUT_NOM_RUTINA IS NULL";
        } else if (this.getRutNomRutina() != null) {
            conditions += " AND RUT_NOM_RUTINA = ?";
            values.add(this.getRutNomRutina());
        }

        if (this.getRutDescRutina() != null && "null".equals(this.getRutDescRutina())) {
            conditions += " AND RUT_DESC_RUTINA IS NULL";
        } else if (this.getRutDescRutina() != null) {
            conditions += " AND RUT_DESC_RUTINA = ?";
            values.add(this.getRutDescRutina());
        }

        if (this.getRutCveAreaResp() != null && "null".equals(this.getRutCveAreaResp())) {
            conditions += " AND RUT_CVE_AREA_RESP IS NULL";
        } else if (this.getRutCveAreaResp() != null) {
            conditions += " AND RUT_CVE_AREA_RESP = ?";
            values.add(this.getRutCveAreaResp());
        }

        if (this.getRutCveProceso() != null && "null".equals(this.getRutCveProceso())) {
            conditions += " AND RUT_CVE_PROCESO IS NULL";
        } else if (this.getRutCveProceso() != null) {
            conditions += " AND RUT_CVE_PROCESO = ?";
            values.add(this.getRutCveProceso());
        }

        if (this.getRutCvePeriod() != null && "null".equals(this.getRutCvePeriod())) {
            conditions += " AND RUT_CVE_PERIOD IS NULL";
        } else if (this.getRutCvePeriod() != null) {
            conditions += " AND RUT_CVE_PERIOD = ?";
            values.add(this.getRutCvePeriod());
        }

        if (this.getRutCveImpresion() != null && this.getRutCveImpresion().longValue() == -999) {
            conditions += " AND RUT_CVE_IMPRESION IS NULL";
        } else if (this.getRutCveImpresion() != null) {
            conditions += " AND RUT_CVE_IMPRESION = ?";
            values.add(this.getRutCveImpresion());
        }

        if (this.getRutCvePapeleria() != null && "null".equals(this.getRutCvePapeleria())) {
            conditions += " AND RUT_CVE_PAPELERIA IS NULL";
        } else if (this.getRutCvePapeleria() != null) {
            conditions += " AND RUT_CVE_PAPELERIA = ?";
            values.add(this.getRutCvePapeleria());
        }

        if (this.getRutCveRespDatos() != null && this.getRutCveRespDatos().longValue() == -999) {
            conditions += " AND RUT_CVE_RESP_DATOS IS NULL";
        } else if (this.getRutCveRespDatos() != null) {
            conditions += " AND RUT_CVE_RESP_DATOS = ?";
            values.add(this.getRutCveRespDatos());
        }

        if (this.getRutNumUsuario() != null && this.getRutNumUsuario().longValue() == -999) {
            conditions += " AND RUT_NUM_USUARIO IS NULL";
        } else if (this.getRutNumUsuario() != null) {
            conditions += " AND RUT_NUM_USUARIO = ?";
            values.add(this.getRutNumUsuario());
        }

        if (this.getRutCveBloqueo() != null && this.getRutCveBloqueo().longValue() == -999) {
            conditions += " AND RUT_CVE_BLOQUEO IS NULL";
        } else if (this.getRutCveBloqueo() != null) {
            conditions += " AND RUT_CVE_BLOQUEO = ?";
            values.add(this.getRutCveBloqueo());
        }

        if (this.getRutTextoBloqueo() != null && "null".equals(this.getRutTextoBloqueo())) {
            conditions += " AND RUT_TEXTO_BLOQUEO IS NULL";
        } else if (this.getRutTextoBloqueo() != null) {
            conditions += " AND RUT_TEXTO_BLOQUEO = ?";
            values.add(this.getRutTextoBloqueo());
        }

        if (this.getRutFecInicBloq() != null && "null".equals(this.getRutFecInicBloq())) {
            conditions += " AND RUT_FEC_INIC_BLOQ IS NULL";
        } else if (this.getRutFecInicBloq() != null) {
            conditions += " AND RUT_FEC_INIC_BLOQ = ?";
            values.add(this.getRutFecInicBloq());
        }

        if (this.getRutFecFinBloq() != null && "null".equals(this.getRutFecFinBloq())) {
            conditions += " AND RUT_FEC_FIN_BLOQ IS NULL";
        } else if (this.getRutFecFinBloq() != null) {
            conditions += " AND RUT_FEC_FIN_BLOQ = ?";
            values.add(this.getRutFecFinBloq());
        }

        if (this.getRutAnoAltaReg() != null && this.getRutAnoAltaReg().longValue() == -999) {
            conditions += " AND RUT_ANO_ALTA_REG IS NULL";
        } else if (this.getRutAnoAltaReg() != null) {
            conditions += " AND RUT_ANO_ALTA_REG = ?";
            values.add(this.getRutAnoAltaReg());
        }

        if (this.getRutMesAltaReg() != null && this.getRutMesAltaReg().longValue() == -999) {
            conditions += " AND RUT_MES_ALTA_REG IS NULL";
        } else if (this.getRutMesAltaReg() != null) {
            conditions += " AND RUT_MES_ALTA_REG = ?";
            values.add(this.getRutMesAltaReg());
        }

        if (this.getRutDiaAltaReg() != null && this.getRutDiaAltaReg().longValue() == -999) {
            conditions += " AND RUT_DIA_ALTA_REG IS NULL";
        } else if (this.getRutDiaAltaReg() != null) {
            conditions += " AND RUT_DIA_ALTA_REG = ?";
            values.add(this.getRutDiaAltaReg());
        }

        if (this.getRutAnoUltMod() != null && this.getRutAnoUltMod().longValue() == -999) {
            conditions += " AND RUT_ANO_ULT_MOD IS NULL";
        } else if (this.getRutAnoUltMod() != null) {
            conditions += " AND RUT_ANO_ULT_MOD = ?";
            values.add(this.getRutAnoUltMod());
        }

        if (this.getRutMesUltMod() != null && this.getRutMesUltMod().longValue() == -999) {
            conditions += " AND RUT_MES_ULT_MOD IS NULL";
        } else if (this.getRutMesUltMod() != null) {
            conditions += " AND RUT_MES_ULT_MOD = ?";
            values.add(this.getRutMesUltMod());
        }

        if (this.getRutDiaUltMod() != null && this.getRutDiaUltMod().longValue() == -999) {
            conditions += " AND RUT_DIA_ULT_MOD IS NULL";
        } else if (this.getRutDiaUltMod() != null) {
            conditions += " AND RUT_DIA_ULT_MOD = ?";
            values.add(this.getRutDiaUltMod());
        }

        if (this.getRutCveStRutinas() != null && "null".equals(this.getRutCveStRutinas())) {
            conditions += " AND RUT_CVE_ST_RUTINAS IS NULL";
        } else if (this.getRutCveStRutinas() != null) {
            conditions += " AND RUT_CVE_ST_RUTINAS = ?";
            values.add(this.getRutCveStRutinas());
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
        String sql = "UPDATE RUTINAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RUT_ID_RUTINA = ?";
        pkValues.add(this.getRutIdRutina());
        fields += " RUT_NOM_RUTINA = ?, ";
        values.add(this.getRutNomRutina());
        fields += " RUT_DESC_RUTINA = ?, ";
        values.add(this.getRutDescRutina());
        fields += " RUT_CVE_AREA_RESP = ?, ";
        values.add(this.getRutCveAreaResp());
        fields += " RUT_CVE_PROCESO = ?, ";
        values.add(this.getRutCveProceso());
        fields += " RUT_CVE_PERIOD = ?, ";
        values.add(this.getRutCvePeriod());
        fields += " RUT_CVE_IMPRESION = ?, ";
        values.add(this.getRutCveImpresion());
        fields += " RUT_CVE_PAPELERIA = ?, ";
        values.add(this.getRutCvePapeleria());
        fields += " RUT_CVE_RESP_DATOS = ?, ";
        values.add(this.getRutCveRespDatos());
        fields += " RUT_NUM_USUARIO = ?, ";
        values.add(this.getRutNumUsuario());
        fields += " RUT_CVE_BLOQUEO = ?, ";
        values.add(this.getRutCveBloqueo());
        fields += " RUT_TEXTO_BLOQUEO = ?, ";
        values.add(this.getRutTextoBloqueo());
        fields += " RUT_FEC_INIC_BLOQ = ?, ";
        values.add(this.getRutFecInicBloq());
        fields += " RUT_FEC_FIN_BLOQ = ?, ";
        values.add(this.getRutFecFinBloq());
        fields += " RUT_ANO_ALTA_REG = ?, ";
        values.add(this.getRutAnoAltaReg());
        fields += " RUT_MES_ALTA_REG = ?, ";
        values.add(this.getRutMesAltaReg());
        fields += " RUT_DIA_ALTA_REG = ?, ";
        values.add(this.getRutDiaAltaReg());
        fields += " RUT_ANO_ULT_MOD = ?, ";
        values.add(this.getRutAnoUltMod());
        fields += " RUT_MES_ULT_MOD = ?, ";
        values.add(this.getRutMesUltMod());
        fields += " RUT_DIA_ULT_MOD = ?, ";
        values.add(this.getRutDiaUltMod());
        fields += " RUT_CVE_ST_RUTINAS = ?, ";
        values.add(this.getRutCveStRutinas());
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
        String sql = "INSERT INTO RUTINAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RUT_ID_RUTINA";
        fieldValues += ", ?";
        values.add(this.getRutIdRutina());

        fields += ", RUT_NOM_RUTINA";
        fieldValues += ", ?";
        values.add(this.getRutNomRutina());

        fields += ", RUT_DESC_RUTINA";
        fieldValues += ", ?";
        values.add(this.getRutDescRutina());

        fields += ", RUT_CVE_AREA_RESP";
        fieldValues += ", ?";
        values.add(this.getRutCveAreaResp());

        fields += ", RUT_CVE_PROCESO";
        fieldValues += ", ?";
        values.add(this.getRutCveProceso());

        fields += ", RUT_CVE_PERIOD";
        fieldValues += ", ?";
        values.add(this.getRutCvePeriod());

        fields += ", RUT_CVE_IMPRESION";
        fieldValues += ", ?";
        values.add(this.getRutCveImpresion());

        fields += ", RUT_CVE_PAPELERIA";
        fieldValues += ", ?";
        values.add(this.getRutCvePapeleria());

        fields += ", RUT_CVE_RESP_DATOS";
        fieldValues += ", ?";
        values.add(this.getRutCveRespDatos());

        fields += ", RUT_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getRutNumUsuario());

        fields += ", RUT_CVE_BLOQUEO";
        fieldValues += ", ?";
        values.add(this.getRutCveBloqueo());

        fields += ", RUT_TEXTO_BLOQUEO";
        fieldValues += ", ?";
        values.add(this.getRutTextoBloqueo());

        fields += ", RUT_FEC_INIC_BLOQ";
        fieldValues += ", ?";
        values.add(this.getRutFecInicBloq());

        fields += ", RUT_FEC_FIN_BLOQ";
        fieldValues += ", ?";
        values.add(this.getRutFecFinBloq());

        fields += ", RUT_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRutAnoAltaReg());

        fields += ", RUT_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRutMesAltaReg());

        fields += ", RUT_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRutDiaAltaReg());

        fields += ", RUT_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRutAnoUltMod());

        fields += ", RUT_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRutMesUltMod());

        fields += ", RUT_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRutDiaUltMod());

        fields += ", RUT_CVE_ST_RUTINAS";
        fieldValues += ", ?";
        values.add(this.getRutCveStRutinas());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM RUTINAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RUT_ID_RUTINA = ?";
        values.add(this.getRutIdRutina());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Rutinas instance = (Rutinas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRutIdRutina().equals(instance.getRutIdRutina()))
            equalObjects = false;
        if (equalObjects && !this.getRutNomRutina().equals(instance.getRutNomRutina()))
            equalObjects = false;
        if (equalObjects && !this.getRutDescRutina().equals(instance.getRutDescRutina()))
            equalObjects = false;
        if (equalObjects && !this.getRutCveAreaResp().equals(instance.getRutCveAreaResp()))
            equalObjects = false;
        if (equalObjects && !this.getRutCveProceso().equals(instance.getRutCveProceso()))
            equalObjects = false;
        if (equalObjects && !this.getRutCvePeriod().equals(instance.getRutCvePeriod()))
            equalObjects = false;
        if (equalObjects && !this.getRutCveImpresion().equals(instance.getRutCveImpresion()))
            equalObjects = false;
        if (equalObjects && !this.getRutCvePapeleria().equals(instance.getRutCvePapeleria()))
            equalObjects = false;
        if (equalObjects && !this.getRutCveRespDatos().equals(instance.getRutCveRespDatos()))
            equalObjects = false;
        if (equalObjects && !this.getRutNumUsuario().equals(instance.getRutNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getRutCveBloqueo().equals(instance.getRutCveBloqueo()))
            equalObjects = false;
        if (equalObjects && !this.getRutTextoBloqueo().equals(instance.getRutTextoBloqueo()))
            equalObjects = false;
        if (equalObjects && !this.getRutFecInicBloq().equals(instance.getRutFecInicBloq()))
            equalObjects = false;
        if (equalObjects && !this.getRutFecFinBloq().equals(instance.getRutFecFinBloq()))
            equalObjects = false;
        if (equalObjects && !this.getRutAnoAltaReg().equals(instance.getRutAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRutMesAltaReg().equals(instance.getRutMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRutDiaAltaReg().equals(instance.getRutDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRutAnoUltMod().equals(instance.getRutAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRutMesUltMod().equals(instance.getRutMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRutDiaUltMod().equals(instance.getRutDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRutCveStRutinas().equals(instance.getRutCveStRutinas()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Rutinas result = new Rutinas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRutIdRutina((String) objectData.getData("RUT_ID_RUTINA"));
        result.setRutNomRutina((String) objectData.getData("RUT_NOM_RUTINA"));
        result.setRutDescRutina((String) objectData.getData("RUT_DESC_RUTINA"));
        result.setRutCveAreaResp((String) objectData.getData("RUT_CVE_AREA_RESP"));
        result.setRutCveProceso((String) objectData.getData("RUT_CVE_PROCESO"));
        result.setRutCvePeriod((String) objectData.getData("RUT_CVE_PERIOD"));
        result.setRutCveImpresion((BigDecimal) objectData.getData("RUT_CVE_IMPRESION"));
        result.setRutCvePapeleria((String) objectData.getData("RUT_CVE_PAPELERIA"));
        result.setRutCveRespDatos((BigDecimal) objectData.getData("RUT_CVE_RESP_DATOS"));
        result.setRutNumUsuario((BigDecimal) objectData.getData("RUT_NUM_USUARIO"));
        result.setRutCveBloqueo((BigDecimal) objectData.getData("RUT_CVE_BLOQUEO"));
        result.setRutTextoBloqueo((String) objectData.getData("RUT_TEXTO_BLOQUEO"));
        result.setRutFecInicBloq((String) objectData.getData("RUT_FEC_INIC_BLOQ"));
        result.setRutFecFinBloq((String) objectData.getData("RUT_FEC_FIN_BLOQ"));
        result.setRutAnoAltaReg((BigDecimal) objectData.getData("RUT_ANO_ALTA_REG"));
        result.setRutMesAltaReg((BigDecimal) objectData.getData("RUT_MES_ALTA_REG"));
        result.setRutDiaAltaReg((BigDecimal) objectData.getData("RUT_DIA_ALTA_REG"));
        result.setRutAnoUltMod((BigDecimal) objectData.getData("RUT_ANO_ULT_MOD"));
        result.setRutMesUltMod((BigDecimal) objectData.getData("RUT_MES_ULT_MOD"));
        result.setRutDiaUltMod((BigDecimal) objectData.getData("RUT_DIA_ULT_MOD"));
        result.setRutCveStRutinas((String) objectData.getData("RUT_CVE_ST_RUTINAS"));

        return result;

    }

}
