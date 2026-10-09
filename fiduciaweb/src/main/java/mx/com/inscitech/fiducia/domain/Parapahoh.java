package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARAPAHOH_PK", columns = { "HON_NUM_CONTRATO", "HON_CVE_PERS_FID", "HON_NUM_PERS_FID" }, sequences = { "MANUAL" })
public class Parapahoh extends DomainObject {

    BigDecimal honNumContrato = null;
    String honCvePersFid = null;
    BigDecimal honNumPersFid = null;
    BigDecimal honCveCarCta = null;
    BigDecimal honCveEnvAviso = null;
    String honCveTipoCta = null;
    BigDecimal honNumBanco = null;
    BigDecimal honNumPlaza = null;
    BigDecimal honNumSucursal = null;
    BigDecimal honNumCuenta = null;
    BigDecimal honPjeFragComis = null;
    BigDecimal honAnoAltaReg = null;
    BigDecimal honMesAltaReg = null;
    BigDecimal honDiaAltaReg = null;
    BigDecimal honAnoUltMod = null;
    BigDecimal honMesUltMod = null;
    BigDecimal honDiaUltMod = null;
    String honCveStParahon = null;

    public Parapahoh() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHonNumContrato(BigDecimal honNumContrato) {
        this.honNumContrato = honNumContrato;
    }

    public BigDecimal getHonNumContrato() {
        return this.honNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setHonCvePersFid(String honCvePersFid) {
        this.honCvePersFid = honCvePersFid;
    }

    public String getHonCvePersFid() {
        return this.honCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHonNumPersFid(BigDecimal honNumPersFid) {
        this.honNumPersFid = honNumPersFid;
    }

    public BigDecimal getHonNumPersFid() {
        return this.honNumPersFid;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHonCveCarCta(BigDecimal honCveCarCta) {
        this.honCveCarCta = honCveCarCta;
    }

    public BigDecimal getHonCveCarCta() {
        return this.honCveCarCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHonCveEnvAviso(BigDecimal honCveEnvAviso) {
        this.honCveEnvAviso = honCveEnvAviso;
    }

    public BigDecimal getHonCveEnvAviso() {
        return this.honCveEnvAviso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setHonCveTipoCta(String honCveTipoCta) {
        this.honCveTipoCta = honCveTipoCta;
    }

    public String getHonCveTipoCta() {
        return this.honCveTipoCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHonNumBanco(BigDecimal honNumBanco) {
        this.honNumBanco = honNumBanco;
    }

    public BigDecimal getHonNumBanco() {
        return this.honNumBanco;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setHonNumPlaza(BigDecimal honNumPlaza) {
        this.honNumPlaza = honNumPlaza;
    }

    public BigDecimal getHonNumPlaza() {
        return this.honNumPlaza;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHonNumSucursal(BigDecimal honNumSucursal) {
        this.honNumSucursal = honNumSucursal;
    }

    public BigDecimal getHonNumSucursal() {
        return this.honNumSucursal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setHonNumCuenta(BigDecimal honNumCuenta) {
        this.honNumCuenta = honNumCuenta;
    }

    public BigDecimal getHonNumCuenta() {
        return this.honNumCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setHonPjeFragComis(BigDecimal honPjeFragComis) {
        this.honPjeFragComis = honPjeFragComis;
    }

    public BigDecimal getHonPjeFragComis() {
        return this.honPjeFragComis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setHonAnoAltaReg(BigDecimal honAnoAltaReg) {
        this.honAnoAltaReg = honAnoAltaReg;
    }

    public BigDecimal getHonAnoAltaReg() {
        return this.honAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setHonMesAltaReg(BigDecimal honMesAltaReg) {
        this.honMesAltaReg = honMesAltaReg;
    }

    public BigDecimal getHonMesAltaReg() {
        return this.honMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setHonDiaAltaReg(BigDecimal honDiaAltaReg) {
        this.honDiaAltaReg = honDiaAltaReg;
    }

    public BigDecimal getHonDiaAltaReg() {
        return this.honDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setHonAnoUltMod(BigDecimal honAnoUltMod) {
        this.honAnoUltMod = honAnoUltMod;
    }

    public BigDecimal getHonAnoUltMod() {
        return this.honAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setHonMesUltMod(BigDecimal honMesUltMod) {
        this.honMesUltMod = honMesUltMod;
    }

    public BigDecimal getHonMesUltMod() {
        return this.honMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setHonDiaUltMod(BigDecimal honDiaUltMod) {
        this.honDiaUltMod = honDiaUltMod;
    }

    public BigDecimal getHonDiaUltMod() {
        return this.honDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setHonCveStParahon(String honCveStParahon) {
        this.honCveStParahon = honCveStParahon;
    }

    public String getHonCveStParahon() {
        return this.honCveStParahon;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARAPAHOH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getHonNumContrato() != null && this.getHonNumContrato().longValue() == -999) {
            conditions += " AND HON_NUM_CONTRATO IS NULL";
        } else if (this.getHonNumContrato() != null) {
            conditions += " AND HON_NUM_CONTRATO = ?";
            values.add(this.getHonNumContrato());
        }

        if (this.getHonCvePersFid() != null && "null".equals(this.getHonCvePersFid())) {
            conditions += " AND HON_CVE_PERS_FID IS NULL";
        } else if (this.getHonCvePersFid() != null) {
            conditions += " AND HON_CVE_PERS_FID = ?";
            values.add(this.getHonCvePersFid());
        }

        if (this.getHonNumPersFid() != null && this.getHonNumPersFid().longValue() == -999) {
            conditions += " AND HON_NUM_PERS_FID IS NULL";
        } else if (this.getHonNumPersFid() != null) {
            conditions += " AND HON_NUM_PERS_FID = ?";
            values.add(this.getHonNumPersFid());
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
        String sql = "SELECT * FROM PARAPAHOH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getHonNumContrato() != null && this.getHonNumContrato().longValue() == -999) {
            conditions += " AND HON_NUM_CONTRATO IS NULL";
        } else if (this.getHonNumContrato() != null) {
            conditions += " AND HON_NUM_CONTRATO = ?";
            values.add(this.getHonNumContrato());
        }

        if (this.getHonCvePersFid() != null && "null".equals(this.getHonCvePersFid())) {
            conditions += " AND HON_CVE_PERS_FID IS NULL";
        } else if (this.getHonCvePersFid() != null) {
            conditions += " AND HON_CVE_PERS_FID = ?";
            values.add(this.getHonCvePersFid());
        }

        if (this.getHonNumPersFid() != null && this.getHonNumPersFid().longValue() == -999) {
            conditions += " AND HON_NUM_PERS_FID IS NULL";
        } else if (this.getHonNumPersFid() != null) {
            conditions += " AND HON_NUM_PERS_FID = ?";
            values.add(this.getHonNumPersFid());
        }

        if (this.getHonCveCarCta() != null && this.getHonCveCarCta().longValue() == -999) {
            conditions += " AND HON_CVE_CAR_CTA IS NULL";
        } else if (this.getHonCveCarCta() != null) {
            conditions += " AND HON_CVE_CAR_CTA = ?";
            values.add(this.getHonCveCarCta());
        }

        if (this.getHonCveEnvAviso() != null && this.getHonCveEnvAviso().longValue() == -999) {
            conditions += " AND HON_CVE_ENV_AVISO IS NULL";
        } else if (this.getHonCveEnvAviso() != null) {
            conditions += " AND HON_CVE_ENV_AVISO = ?";
            values.add(this.getHonCveEnvAviso());
        }

        if (this.getHonCveTipoCta() != null && "null".equals(this.getHonCveTipoCta())) {
            conditions += " AND HON_CVE_TIPO_CTA IS NULL";
        } else if (this.getHonCveTipoCta() != null) {
            conditions += " AND HON_CVE_TIPO_CTA = ?";
            values.add(this.getHonCveTipoCta());
        }

        if (this.getHonNumBanco() != null && this.getHonNumBanco().longValue() == -999) {
            conditions += " AND HON_NUM_BANCO IS NULL";
        } else if (this.getHonNumBanco() != null) {
            conditions += " AND HON_NUM_BANCO = ?";
            values.add(this.getHonNumBanco());
        }

        if (this.getHonNumPlaza() != null && this.getHonNumPlaza().longValue() == -999) {
            conditions += " AND HON_NUM_PLAZA IS NULL";
        } else if (this.getHonNumPlaza() != null) {
            conditions += " AND HON_NUM_PLAZA = ?";
            values.add(this.getHonNumPlaza());
        }

        if (this.getHonNumSucursal() != null && this.getHonNumSucursal().longValue() == -999) {
            conditions += " AND HON_NUM_SUCURSAL IS NULL";
        } else if (this.getHonNumSucursal() != null) {
            conditions += " AND HON_NUM_SUCURSAL = ?";
            values.add(this.getHonNumSucursal());
        }

        if (this.getHonNumCuenta() != null && this.getHonNumCuenta().longValue() == -999) {
            conditions += " AND HON_NUM_CUENTA IS NULL";
        } else if (this.getHonNumCuenta() != null) {
            conditions += " AND HON_NUM_CUENTA = ?";
            values.add(this.getHonNumCuenta());
        }

        if (this.getHonPjeFragComis() != null && this.getHonPjeFragComis().longValue() == -999) {
            conditions += " AND HON_PJE_FRAG_COMIS IS NULL";
        } else if (this.getHonPjeFragComis() != null) {
            conditions += " AND HON_PJE_FRAG_COMIS = ?";
            values.add(this.getHonPjeFragComis());
        }

        if (this.getHonAnoAltaReg() != null && this.getHonAnoAltaReg().longValue() == -999) {
            conditions += " AND HON_ANO_ALTA_REG IS NULL";
        } else if (this.getHonAnoAltaReg() != null) {
            conditions += " AND HON_ANO_ALTA_REG = ?";
            values.add(this.getHonAnoAltaReg());
        }

        if (this.getHonMesAltaReg() != null && this.getHonMesAltaReg().longValue() == -999) {
            conditions += " AND HON_MES_ALTA_REG IS NULL";
        } else if (this.getHonMesAltaReg() != null) {
            conditions += " AND HON_MES_ALTA_REG = ?";
            values.add(this.getHonMesAltaReg());
        }

        if (this.getHonDiaAltaReg() != null && this.getHonDiaAltaReg().longValue() == -999) {
            conditions += " AND HON_DIA_ALTA_REG IS NULL";
        } else if (this.getHonDiaAltaReg() != null) {
            conditions += " AND HON_DIA_ALTA_REG = ?";
            values.add(this.getHonDiaAltaReg());
        }

        if (this.getHonAnoUltMod() != null && this.getHonAnoUltMod().longValue() == -999) {
            conditions += " AND HON_ANO_ULT_MOD IS NULL";
        } else if (this.getHonAnoUltMod() != null) {
            conditions += " AND HON_ANO_ULT_MOD = ?";
            values.add(this.getHonAnoUltMod());
        }

        if (this.getHonMesUltMod() != null && this.getHonMesUltMod().longValue() == -999) {
            conditions += " AND HON_MES_ULT_MOD IS NULL";
        } else if (this.getHonMesUltMod() != null) {
            conditions += " AND HON_MES_ULT_MOD = ?";
            values.add(this.getHonMesUltMod());
        }

        if (this.getHonDiaUltMod() != null && this.getHonDiaUltMod().longValue() == -999) {
            conditions += " AND HON_DIA_ULT_MOD IS NULL";
        } else if (this.getHonDiaUltMod() != null) {
            conditions += " AND HON_DIA_ULT_MOD = ?";
            values.add(this.getHonDiaUltMod());
        }

        if (this.getHonCveStParahon() != null && "null".equals(this.getHonCveStParahon())) {
            conditions += " AND HON_CVE_ST_PARAHON IS NULL";
        } else if (this.getHonCveStParahon() != null) {
            conditions += " AND HON_CVE_ST_PARAHON = ?";
            values.add(this.getHonCveStParahon());
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
        String sql = "UPDATE PARAPAHOH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND HON_NUM_CONTRATO = ?";
        pkValues.add(this.getHonNumContrato());
        conditions += " AND HON_CVE_PERS_FID = ?";
        pkValues.add(this.getHonCvePersFid());
        conditions += " AND HON_NUM_PERS_FID = ?";
        pkValues.add(this.getHonNumPersFid());
        fields += " HON_CVE_CAR_CTA = ?, ";
        values.add(this.getHonCveCarCta());
        fields += " HON_CVE_ENV_AVISO = ?, ";
        values.add(this.getHonCveEnvAviso());
        fields += " HON_CVE_TIPO_CTA = ?, ";
        values.add(this.getHonCveTipoCta());
        fields += " HON_NUM_BANCO = ?, ";
        values.add(this.getHonNumBanco());
        fields += " HON_NUM_PLAZA = ?, ";
        values.add(this.getHonNumPlaza());
        fields += " HON_NUM_SUCURSAL = ?, ";
        values.add(this.getHonNumSucursal());
        fields += " HON_NUM_CUENTA = ?, ";
        values.add(this.getHonNumCuenta());
        fields += " HON_PJE_FRAG_COMIS = ?, ";
        values.add(this.getHonPjeFragComis());
        fields += " HON_ANO_ALTA_REG = ?, ";
        values.add(this.getHonAnoAltaReg());
        fields += " HON_MES_ALTA_REG = ?, ";
        values.add(this.getHonMesAltaReg());
        fields += " HON_DIA_ALTA_REG = ?, ";
        values.add(this.getHonDiaAltaReg());
        fields += " HON_ANO_ULT_MOD = ?, ";
        values.add(this.getHonAnoUltMod());
        fields += " HON_MES_ULT_MOD = ?, ";
        values.add(this.getHonMesUltMod());
        fields += " HON_DIA_ULT_MOD = ?, ";
        values.add(this.getHonDiaUltMod());
        fields += " HON_CVE_ST_PARAHON = ?, ";
        values.add(this.getHonCveStParahon());
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
        String sql = "INSERT INTO PARAPAHOH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", HON_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getHonNumContrato());

        fields += ", HON_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getHonCvePersFid());

        fields += ", HON_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getHonNumPersFid());

        fields += ", HON_CVE_CAR_CTA";
        fieldValues += ", ?";
        values.add(this.getHonCveCarCta());

        fields += ", HON_CVE_ENV_AVISO";
        fieldValues += ", ?";
        values.add(this.getHonCveEnvAviso());

        fields += ", HON_CVE_TIPO_CTA";
        fieldValues += ", ?";
        values.add(this.getHonCveTipoCta());

        fields += ", HON_NUM_BANCO";
        fieldValues += ", ?";
        values.add(this.getHonNumBanco());

        fields += ", HON_NUM_PLAZA";
        fieldValues += ", ?";
        values.add(this.getHonNumPlaza());

        fields += ", HON_NUM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getHonNumSucursal());

        fields += ", HON_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getHonNumCuenta());

        fields += ", HON_PJE_FRAG_COMIS";
        fieldValues += ", ?";
        values.add(this.getHonPjeFragComis());

        fields += ", HON_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getHonAnoAltaReg());

        fields += ", HON_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getHonMesAltaReg());

        fields += ", HON_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getHonDiaAltaReg());

        fields += ", HON_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getHonAnoUltMod());

        fields += ", HON_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getHonMesUltMod());

        fields += ", HON_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getHonDiaUltMod());

        fields += ", HON_CVE_ST_PARAHON";
        fieldValues += ", ?";
        values.add(this.getHonCveStParahon());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARAPAHOH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND HON_NUM_CONTRATO = ?";
        values.add(this.getHonNumContrato());
        conditions += " AND HON_CVE_PERS_FID = ?";
        values.add(this.getHonCvePersFid());
        conditions += " AND HON_NUM_PERS_FID = ?";
        values.add(this.getHonNumPersFid());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Parapahoh instance = (Parapahoh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getHonNumContrato().equals(instance.getHonNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getHonCvePersFid().equals(instance.getHonCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getHonNumPersFid().equals(instance.getHonNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getHonCveCarCta().equals(instance.getHonCveCarCta()))
            equalObjects = false;
        if (equalObjects && !this.getHonCveEnvAviso().equals(instance.getHonCveEnvAviso()))
            equalObjects = false;
        if (equalObjects && !this.getHonCveTipoCta().equals(instance.getHonCveTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getHonNumBanco().equals(instance.getHonNumBanco()))
            equalObjects = false;
        if (equalObjects && !this.getHonNumPlaza().equals(instance.getHonNumPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getHonNumSucursal().equals(instance.getHonNumSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getHonNumCuenta().equals(instance.getHonNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getHonPjeFragComis().equals(instance.getHonPjeFragComis()))
            equalObjects = false;
        if (equalObjects && !this.getHonAnoAltaReg().equals(instance.getHonAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getHonMesAltaReg().equals(instance.getHonMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getHonDiaAltaReg().equals(instance.getHonDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getHonAnoUltMod().equals(instance.getHonAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getHonMesUltMod().equals(instance.getHonMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getHonDiaUltMod().equals(instance.getHonDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getHonCveStParahon().equals(instance.getHonCveStParahon()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Parapahoh result = new Parapahoh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setHonNumContrato((BigDecimal) objectData.getData("HON_NUM_CONTRATO"));
        result.setHonCvePersFid((String) objectData.getData("HON_CVE_PERS_FID"));
        result.setHonNumPersFid((BigDecimal) objectData.getData("HON_NUM_PERS_FID"));
        result.setHonCveCarCta((BigDecimal) objectData.getData("HON_CVE_CAR_CTA"));
        result.setHonCveEnvAviso((BigDecimal) objectData.getData("HON_CVE_ENV_AVISO"));
        result.setHonCveTipoCta((String) objectData.getData("HON_CVE_TIPO_CTA"));
        result.setHonNumBanco((BigDecimal) objectData.getData("HON_NUM_BANCO"));
        result.setHonNumPlaza((BigDecimal) objectData.getData("HON_NUM_PLAZA"));
        result.setHonNumSucursal((BigDecimal) objectData.getData("HON_NUM_SUCURSAL"));
        result.setHonNumCuenta((BigDecimal) objectData.getData("HON_NUM_CUENTA"));
        result.setHonPjeFragComis((BigDecimal) objectData.getData("HON_PJE_FRAG_COMIS"));
        result.setHonAnoAltaReg((BigDecimal) objectData.getData("HON_ANO_ALTA_REG"));
        result.setHonMesAltaReg((BigDecimal) objectData.getData("HON_MES_ALTA_REG"));
        result.setHonDiaAltaReg((BigDecimal) objectData.getData("HON_DIA_ALTA_REG"));
        result.setHonAnoUltMod((BigDecimal) objectData.getData("HON_ANO_ULT_MOD"));
        result.setHonMesUltMod((BigDecimal) objectData.getData("HON_MES_ULT_MOD"));
        result.setHonDiaUltMod((BigDecimal) objectData.getData("HON_DIA_ULT_MOD"));
        result.setHonCveStParahon((String) objectData.getData("HON_CVE_ST_PARAHON"));

        return result;

    }

}
