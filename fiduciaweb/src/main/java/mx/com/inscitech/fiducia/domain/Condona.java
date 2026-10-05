package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONDONA_PK", columns = { "CDN_NUM_SECUENCIAL", "CDN_FEC_CALC_HONO", "CDN_CVE_TIPO_HONO", "CDN_NUM_PERS_FID", "CDN_CVE_PERS_FID", "CDN_NUM_CONTRATO" },
            sequences = { "MANUAL" })
public class Condona extends DomainObject {

    BigDecimal cdnNumContrato = null;
    String cdnCvePersFid = null;
    BigDecimal cdnNumPersFid = null;
    String cdnCveTipoHono = null;
    String cdnFecCalcHono = null;
    BigDecimal cdnNumSecuencial = null;
    BigDecimal cdnImpCondonHon = null;
    BigDecimal cdnImpCondonIva = null;
    BigDecimal cdnImpCondonExt = null;
    BigDecimal cdnUsuarioAut = null;
    BigDecimal cdnAnoAltaReg = null;
    BigDecimal cdnMesAltaReg = null;
    BigDecimal cdnDiaAltaReg = null;
    BigDecimal cdnAnoUltMod = null;
    BigDecimal cdnMesUltMod = null;
    BigDecimal cdnDiaUltMod = null;
    String cdnCveStCondona = null;

    public Condona() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCdnNumContrato(BigDecimal cdnNumContrato) {
        this.cdnNumContrato = cdnNumContrato;
    }

    public BigDecimal getCdnNumContrato() {
        return this.cdnNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCdnCvePersFid(String cdnCvePersFid) {
        this.cdnCvePersFid = cdnCvePersFid;
    }

    public String getCdnCvePersFid() {
        return this.cdnCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCdnNumPersFid(BigDecimal cdnNumPersFid) {
        this.cdnNumPersFid = cdnNumPersFid;
    }

    public BigDecimal getCdnNumPersFid() {
        return this.cdnNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCdnCveTipoHono(String cdnCveTipoHono) {
        this.cdnCveTipoHono = cdnCveTipoHono;
    }

    public String getCdnCveTipoHono() {
        return this.cdnCveTipoHono;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCdnFecCalcHono(String cdnFecCalcHono) {
        this.cdnFecCalcHono = cdnFecCalcHono;
    }

    public String getCdnFecCalcHono() {
        return this.cdnFecCalcHono;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCdnNumSecuencial(BigDecimal cdnNumSecuencial) {
        this.cdnNumSecuencial = cdnNumSecuencial;
    }

    public BigDecimal getCdnNumSecuencial() {
        return this.cdnNumSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCdnImpCondonHon(BigDecimal cdnImpCondonHon) {
        this.cdnImpCondonHon = cdnImpCondonHon;
    }

    public BigDecimal getCdnImpCondonHon() {
        return this.cdnImpCondonHon;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCdnImpCondonIva(BigDecimal cdnImpCondonIva) {
        this.cdnImpCondonIva = cdnImpCondonIva;
    }

    public BigDecimal getCdnImpCondonIva() {
        return this.cdnImpCondonIva;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCdnImpCondonExt(BigDecimal cdnImpCondonExt) {
        this.cdnImpCondonExt = cdnImpCondonExt;
    }

    public BigDecimal getCdnImpCondonExt() {
        return this.cdnImpCondonExt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCdnUsuarioAut(BigDecimal cdnUsuarioAut) {
        this.cdnUsuarioAut = cdnUsuarioAut;
    }

    public BigDecimal getCdnUsuarioAut() {
        return this.cdnUsuarioAut;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCdnAnoAltaReg(BigDecimal cdnAnoAltaReg) {
        this.cdnAnoAltaReg = cdnAnoAltaReg;
    }

    public BigDecimal getCdnAnoAltaReg() {
        return this.cdnAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCdnMesAltaReg(BigDecimal cdnMesAltaReg) {
        this.cdnMesAltaReg = cdnMesAltaReg;
    }

    public BigDecimal getCdnMesAltaReg() {
        return this.cdnMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCdnDiaAltaReg(BigDecimal cdnDiaAltaReg) {
        this.cdnDiaAltaReg = cdnDiaAltaReg;
    }

    public BigDecimal getCdnDiaAltaReg() {
        return this.cdnDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCdnAnoUltMod(BigDecimal cdnAnoUltMod) {
        this.cdnAnoUltMod = cdnAnoUltMod;
    }

    public BigDecimal getCdnAnoUltMod() {
        return this.cdnAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCdnMesUltMod(BigDecimal cdnMesUltMod) {
        this.cdnMesUltMod = cdnMesUltMod;
    }

    public BigDecimal getCdnMesUltMod() {
        return this.cdnMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCdnDiaUltMod(BigDecimal cdnDiaUltMod) {
        this.cdnDiaUltMod = cdnDiaUltMod;
    }

    public BigDecimal getCdnDiaUltMod() {
        return this.cdnDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCdnCveStCondona(String cdnCveStCondona) {
        this.cdnCveStCondona = cdnCveStCondona;
    }

    public String getCdnCveStCondona() {
        return this.cdnCveStCondona;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONDONA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCdnNumContrato() != null && this.getCdnNumContrato().longValue() == -999) {
            conditions += " AND CDN_NUM_CONTRATO IS NULL";
        } else if (this.getCdnNumContrato() != null) {
            conditions += " AND CDN_NUM_CONTRATO = ?";
            values.add(this.getCdnNumContrato());
        }

        if (this.getCdnCvePersFid() != null && "null".equals(this.getCdnCvePersFid())) {
            conditions += " AND CDN_CVE_PERS_FID IS NULL";
        } else if (this.getCdnCvePersFid() != null) {
            conditions += " AND CDN_CVE_PERS_FID = ?";
            values.add(this.getCdnCvePersFid());
        }

        if (this.getCdnNumPersFid() != null && this.getCdnNumPersFid().longValue() == -999) {
            conditions += " AND CDN_NUM_PERS_FID IS NULL";
        } else if (this.getCdnNumPersFid() != null) {
            conditions += " AND CDN_NUM_PERS_FID = ?";
            values.add(this.getCdnNumPersFid());
        }

        if (this.getCdnCveTipoHono() != null && "null".equals(this.getCdnCveTipoHono())) {
            conditions += " AND CDN_CVE_TIPO_HONO IS NULL";
        } else if (this.getCdnCveTipoHono() != null) {
            conditions += " AND CDN_CVE_TIPO_HONO = ?";
            values.add(this.getCdnCveTipoHono());
        }

        if (this.getCdnFecCalcHono() != null && "null".equals(this.getCdnFecCalcHono())) {
            conditions += " AND CDN_FEC_CALC_HONO IS NULL";
        } else if (this.getCdnFecCalcHono() != null) {
            conditions += " AND CDN_FEC_CALC_HONO = ?";
            values.add(this.getCdnFecCalcHono());
        }

        if (this.getCdnNumSecuencial() != null && this.getCdnNumSecuencial().longValue() == -999) {
            conditions += " AND CDN_NUM_SECUENCIAL IS NULL";
        } else if (this.getCdnNumSecuencial() != null) {
            conditions += " AND CDN_NUM_SECUENCIAL = ?";
            values.add(this.getCdnNumSecuencial());
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
        String sql = "SELECT * FROM CONDONA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCdnNumContrato() != null && this.getCdnNumContrato().longValue() == -999) {
            conditions += " AND CDN_NUM_CONTRATO IS NULL";
        } else if (this.getCdnNumContrato() != null) {
            conditions += " AND CDN_NUM_CONTRATO = ?";
            values.add(this.getCdnNumContrato());
        }

        if (this.getCdnCvePersFid() != null && "null".equals(this.getCdnCvePersFid())) {
            conditions += " AND CDN_CVE_PERS_FID IS NULL";
        } else if (this.getCdnCvePersFid() != null) {
            conditions += " AND CDN_CVE_PERS_FID = ?";
            values.add(this.getCdnCvePersFid());
        }

        if (this.getCdnNumPersFid() != null && this.getCdnNumPersFid().longValue() == -999) {
            conditions += " AND CDN_NUM_PERS_FID IS NULL";
        } else if (this.getCdnNumPersFid() != null) {
            conditions += " AND CDN_NUM_PERS_FID = ?";
            values.add(this.getCdnNumPersFid());
        }

        if (this.getCdnCveTipoHono() != null && "null".equals(this.getCdnCveTipoHono())) {
            conditions += " AND CDN_CVE_TIPO_HONO IS NULL";
        } else if (this.getCdnCveTipoHono() != null) {
            conditions += " AND CDN_CVE_TIPO_HONO = ?";
            values.add(this.getCdnCveTipoHono());
        }

        if (this.getCdnFecCalcHono() != null && "null".equals(this.getCdnFecCalcHono())) {
            conditions += " AND CDN_FEC_CALC_HONO IS NULL";
        } else if (this.getCdnFecCalcHono() != null) {
            conditions += " AND CDN_FEC_CALC_HONO = ?";
            values.add(this.getCdnFecCalcHono());
        }

        if (this.getCdnNumSecuencial() != null && this.getCdnNumSecuencial().longValue() == -999) {
            conditions += " AND CDN_NUM_SECUENCIAL IS NULL";
        } else if (this.getCdnNumSecuencial() != null) {
            conditions += " AND CDN_NUM_SECUENCIAL = ?";
            values.add(this.getCdnNumSecuencial());
        }

        if (this.getCdnImpCondonHon() != null && this.getCdnImpCondonHon().longValue() == -999) {
            conditions += " AND CDN_IMP_CONDON_HON IS NULL";
        } else if (this.getCdnImpCondonHon() != null) {
            conditions += " AND CDN_IMP_CONDON_HON = ?";
            values.add(this.getCdnImpCondonHon());
        }

        if (this.getCdnImpCondonIva() != null && this.getCdnImpCondonIva().longValue() == -999) {
            conditions += " AND CDN_IMP_CONDON_IVA IS NULL";
        } else if (this.getCdnImpCondonIva() != null) {
            conditions += " AND CDN_IMP_CONDON_IVA = ?";
            values.add(this.getCdnImpCondonIva());
        }

        if (this.getCdnImpCondonExt() != null && this.getCdnImpCondonExt().longValue() == -999) {
            conditions += " AND CDN_IMP_CONDON_EXT IS NULL";
        } else if (this.getCdnImpCondonExt() != null) {
            conditions += " AND CDN_IMP_CONDON_EXT = ?";
            values.add(this.getCdnImpCondonExt());
        }

        if (this.getCdnUsuarioAut() != null && this.getCdnUsuarioAut().longValue() == -999) {
            conditions += " AND CDN_USUARIO_AUT IS NULL";
        } else if (this.getCdnUsuarioAut() != null) {
            conditions += " AND CDN_USUARIO_AUT = ?";
            values.add(this.getCdnUsuarioAut());
        }

        if (this.getCdnAnoAltaReg() != null && this.getCdnAnoAltaReg().longValue() == -999) {
            conditions += " AND CDN_ANO_ALTA_REG IS NULL";
        } else if (this.getCdnAnoAltaReg() != null) {
            conditions += " AND CDN_ANO_ALTA_REG = ?";
            values.add(this.getCdnAnoAltaReg());
        }

        if (this.getCdnMesAltaReg() != null && this.getCdnMesAltaReg().longValue() == -999) {
            conditions += " AND CDN_MES_ALTA_REG IS NULL";
        } else if (this.getCdnMesAltaReg() != null) {
            conditions += " AND CDN_MES_ALTA_REG = ?";
            values.add(this.getCdnMesAltaReg());
        }

        if (this.getCdnDiaAltaReg() != null && this.getCdnDiaAltaReg().longValue() == -999) {
            conditions += " AND CDN_DIA_ALTA_REG IS NULL";
        } else if (this.getCdnDiaAltaReg() != null) {
            conditions += " AND CDN_DIA_ALTA_REG = ?";
            values.add(this.getCdnDiaAltaReg());
        }

        if (this.getCdnAnoUltMod() != null && this.getCdnAnoUltMod().longValue() == -999) {
            conditions += " AND CDN_ANO_ULT_MOD IS NULL";
        } else if (this.getCdnAnoUltMod() != null) {
            conditions += " AND CDN_ANO_ULT_MOD = ?";
            values.add(this.getCdnAnoUltMod());
        }

        if (this.getCdnMesUltMod() != null && this.getCdnMesUltMod().longValue() == -999) {
            conditions += " AND CDN_MES_ULT_MOD IS NULL";
        } else if (this.getCdnMesUltMod() != null) {
            conditions += " AND CDN_MES_ULT_MOD = ?";
            values.add(this.getCdnMesUltMod());
        }

        if (this.getCdnDiaUltMod() != null && this.getCdnDiaUltMod().longValue() == -999) {
            conditions += " AND CDN_DIA_ULT_MOD IS NULL";
        } else if (this.getCdnDiaUltMod() != null) {
            conditions += " AND CDN_DIA_ULT_MOD = ?";
            values.add(this.getCdnDiaUltMod());
        }

        if (this.getCdnCveStCondona() != null && "null".equals(this.getCdnCveStCondona())) {
            conditions += " AND CDN_CVE_ST_CONDONA IS NULL";
        } else if (this.getCdnCveStCondona() != null) {
            conditions += " AND CDN_CVE_ST_CONDONA = ?";
            values.add(this.getCdnCveStCondona());
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
        String sql = "UPDATE CONDONA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CDN_NUM_CONTRATO = ?";
        pkValues.add(this.getCdnNumContrato());
        conditions += " AND CDN_CVE_PERS_FID = ?";
        pkValues.add(this.getCdnCvePersFid());
        conditions += " AND CDN_NUM_PERS_FID = ?";
        pkValues.add(this.getCdnNumPersFid());
        conditions += " AND CDN_CVE_TIPO_HONO = ?";
        pkValues.add(this.getCdnCveTipoHono());
        conditions += " AND CDN_FEC_CALC_HONO = ?";
        pkValues.add(this.getCdnFecCalcHono());
        conditions += " AND CDN_NUM_SECUENCIAL = ?";
        pkValues.add(this.getCdnNumSecuencial());
        fields += " CDN_IMP_CONDON_HON = ?, ";
        values.add(this.getCdnImpCondonHon());
        fields += " CDN_IMP_CONDON_IVA = ?, ";
        values.add(this.getCdnImpCondonIva());
        fields += " CDN_IMP_CONDON_EXT = ?, ";
        values.add(this.getCdnImpCondonExt());
        fields += " CDN_USUARIO_AUT = ?, ";
        values.add(this.getCdnUsuarioAut());
        fields += " CDN_ANO_ALTA_REG = ?, ";
        values.add(this.getCdnAnoAltaReg());
        fields += " CDN_MES_ALTA_REG = ?, ";
        values.add(this.getCdnMesAltaReg());
        fields += " CDN_DIA_ALTA_REG = ?, ";
        values.add(this.getCdnDiaAltaReg());
        fields += " CDN_ANO_ULT_MOD = ?, ";
        values.add(this.getCdnAnoUltMod());
        fields += " CDN_MES_ULT_MOD = ?, ";
        values.add(this.getCdnMesUltMod());
        fields += " CDN_DIA_ULT_MOD = ?, ";
        values.add(this.getCdnDiaUltMod());
        fields += " CDN_CVE_ST_CONDONA = ?, ";
        values.add(this.getCdnCveStCondona());
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
        String sql = "INSERT INTO CONDONA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CDN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCdnNumContrato());

        fields += ", CDN_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getCdnCvePersFid());

        fields += ", CDN_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getCdnNumPersFid());

        fields += ", CDN_CVE_TIPO_HONO";
        fieldValues += ", ?";
        values.add(this.getCdnCveTipoHono());

        fields += ", CDN_FEC_CALC_HONO";
        fieldValues += ", ?";
        values.add(this.getCdnFecCalcHono());

        fields += ", CDN_NUM_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getCdnNumSecuencial());

        fields += ", CDN_IMP_CONDON_HON";
        fieldValues += ", ?";
        values.add(this.getCdnImpCondonHon());

        fields += ", CDN_IMP_CONDON_IVA";
        fieldValues += ", ?";
        values.add(this.getCdnImpCondonIva());

        fields += ", CDN_IMP_CONDON_EXT";
        fieldValues += ", ?";
        values.add(this.getCdnImpCondonExt());

        fields += ", CDN_USUARIO_AUT";
        fieldValues += ", ?";
        values.add(this.getCdnUsuarioAut());

        fields += ", CDN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCdnAnoAltaReg());

        fields += ", CDN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCdnMesAltaReg());

        fields += ", CDN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCdnDiaAltaReg());

        fields += ", CDN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCdnAnoUltMod());

        fields += ", CDN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCdnMesUltMod());

        fields += ", CDN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCdnDiaUltMod());

        fields += ", CDN_CVE_ST_CONDONA";
        fieldValues += ", ?";
        values.add(this.getCdnCveStCondona());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONDONA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CDN_NUM_CONTRATO = ?";
        values.add(this.getCdnNumContrato());
        conditions += " AND CDN_CVE_PERS_FID = ?";
        values.add(this.getCdnCvePersFid());
        conditions += " AND CDN_NUM_PERS_FID = ?";
        values.add(this.getCdnNumPersFid());
        conditions += " AND CDN_CVE_TIPO_HONO = ?";
        values.add(this.getCdnCveTipoHono());
        conditions += " AND CDN_FEC_CALC_HONO = ?";
        values.add(this.getCdnFecCalcHono());
        conditions += " AND CDN_NUM_SECUENCIAL = ?";
        values.add(this.getCdnNumSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Condona instance = (Condona) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCdnNumContrato().equals(instance.getCdnNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCdnCvePersFid().equals(instance.getCdnCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getCdnNumPersFid().equals(instance.getCdnNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getCdnCveTipoHono().equals(instance.getCdnCveTipoHono()))
            equalObjects = false;
        if (equalObjects && !this.getCdnFecCalcHono().equals(instance.getCdnFecCalcHono()))
            equalObjects = false;
        if (equalObjects && !this.getCdnNumSecuencial().equals(instance.getCdnNumSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getCdnImpCondonHon().equals(instance.getCdnImpCondonHon()))
            equalObjects = false;
        if (equalObjects && !this.getCdnImpCondonIva().equals(instance.getCdnImpCondonIva()))
            equalObjects = false;
        if (equalObjects && !this.getCdnImpCondonExt().equals(instance.getCdnImpCondonExt()))
            equalObjects = false;
        if (equalObjects && !this.getCdnUsuarioAut().equals(instance.getCdnUsuarioAut()))
            equalObjects = false;
        if (equalObjects && !this.getCdnAnoAltaReg().equals(instance.getCdnAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCdnMesAltaReg().equals(instance.getCdnMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCdnDiaAltaReg().equals(instance.getCdnDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCdnAnoUltMod().equals(instance.getCdnAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCdnMesUltMod().equals(instance.getCdnMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCdnDiaUltMod().equals(instance.getCdnDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCdnCveStCondona().equals(instance.getCdnCveStCondona()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Condona result = new Condona();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCdnNumContrato((BigDecimal) objectData.getData("CDN_NUM_CONTRATO"));
        result.setCdnCvePersFid((String) objectData.getData("CDN_CVE_PERS_FID"));
        result.setCdnNumPersFid((BigDecimal) objectData.getData("CDN_NUM_PERS_FID"));
        result.setCdnCveTipoHono((String) objectData.getData("CDN_CVE_TIPO_HONO"));
        result.setCdnFecCalcHono((String) objectData.getData("CDN_FEC_CALC_HONO"));
        result.setCdnNumSecuencial((BigDecimal) objectData.getData("CDN_NUM_SECUENCIAL"));
        result.setCdnImpCondonHon((BigDecimal) objectData.getData("CDN_IMP_CONDON_HON"));
        result.setCdnImpCondonIva((BigDecimal) objectData.getData("CDN_IMP_CONDON_IVA"));
        result.setCdnImpCondonExt((BigDecimal) objectData.getData("CDN_IMP_CONDON_EXT"));
        result.setCdnUsuarioAut((BigDecimal) objectData.getData("CDN_USUARIO_AUT"));
        result.setCdnAnoAltaReg((BigDecimal) objectData.getData("CDN_ANO_ALTA_REG"));
        result.setCdnMesAltaReg((BigDecimal) objectData.getData("CDN_MES_ALTA_REG"));
        result.setCdnDiaAltaReg((BigDecimal) objectData.getData("CDN_DIA_ALTA_REG"));
        result.setCdnAnoUltMod((BigDecimal) objectData.getData("CDN_ANO_ULT_MOD"));
        result.setCdnMesUltMod((BigDecimal) objectData.getData("CDN_MES_ULT_MOD"));
        result.setCdnDiaUltMod((BigDecimal) objectData.getData("CDN_DIA_ULT_MOD"));
        result.setCdnCveStCondona((String) objectData.getData("CDN_CVE_ST_CONDONA"));

        return result;

    }

}
