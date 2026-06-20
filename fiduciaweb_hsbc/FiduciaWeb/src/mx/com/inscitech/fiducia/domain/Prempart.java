package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PREMPART_PK", columns = { "PRP_NUM_CONTRATO", "PRP_NUM_DEPTO", "PRP_NUM_PARTICIP", "PRP_NUM_SEC_CTA" }, sequences = { "MANUAL" })
public class Prempart extends DomainObject {

    BigDecimal prpNumContrato = null;
    BigDecimal prpNumDepto = null;
    BigDecimal prpNumParticip = null;
    BigDecimal prpNumSecCta = null;
    String prpCveTipoCta = null;
    BigDecimal prpNumBanco = null;
    BigDecimal prpNumSucursal = null;
    BigDecimal prpNumCuenta = null;
    BigDecimal prpCveAutCargos = null;
    BigDecimal prpCveAutAbonos = null;
    BigDecimal prpCveAutAmbos = null;
    BigDecimal prpAnoAltaReg = null;
    BigDecimal prpMesAltaReg = null;
    BigDecimal prpDiaAltaReg = null;
    BigDecimal prpAnoUltMod = null;
    BigDecimal prpMesUltMod = null;
    BigDecimal prpDiaUltMod = null;
    String prpCveStPrempar = null;

    public Prempart() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrpNumContrato(BigDecimal prpNumContrato) {
        this.prpNumContrato = prpNumContrato;
    }

    public BigDecimal getPrpNumContrato() {
        return this.prpNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrpNumDepto(BigDecimal prpNumDepto) {
        this.prpNumDepto = prpNumDepto;
    }

    public BigDecimal getPrpNumDepto() {
        return this.prpNumDepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrpNumParticip(BigDecimal prpNumParticip) {
        this.prpNumParticip = prpNumParticip;
    }

    public BigDecimal getPrpNumParticip() {
        return this.prpNumParticip;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrpNumSecCta(BigDecimal prpNumSecCta) {
        this.prpNumSecCta = prpNumSecCta;
    }

    public BigDecimal getPrpNumSecCta() {
        return this.prpNumSecCta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrpCveTipoCta(String prpCveTipoCta) {
        this.prpCveTipoCta = prpCveTipoCta;
    }

    public String getPrpCveTipoCta() {
        return this.prpCveTipoCta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrpNumBanco(BigDecimal prpNumBanco) {
        this.prpNumBanco = prpNumBanco;
    }

    public BigDecimal getPrpNumBanco() {
        return this.prpNumBanco;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrpNumSucursal(BigDecimal prpNumSucursal) {
        this.prpNumSucursal = prpNumSucursal;
    }

    public BigDecimal getPrpNumSucursal() {
        return this.prpNumSucursal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrpNumCuenta(BigDecimal prpNumCuenta) {
        this.prpNumCuenta = prpNumCuenta;
    }

    public BigDecimal getPrpNumCuenta() {
        return this.prpNumCuenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrpCveAutCargos(BigDecimal prpCveAutCargos) {
        this.prpCveAutCargos = prpCveAutCargos;
    }

    public BigDecimal getPrpCveAutCargos() {
        return this.prpCveAutCargos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrpCveAutAbonos(BigDecimal prpCveAutAbonos) {
        this.prpCveAutAbonos = prpCveAutAbonos;
    }

    public BigDecimal getPrpCveAutAbonos() {
        return this.prpCveAutAbonos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrpCveAutAmbos(BigDecimal prpCveAutAmbos) {
        this.prpCveAutAmbos = prpCveAutAmbos;
    }

    public BigDecimal getPrpCveAutAmbos() {
        return this.prpCveAutAmbos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPrpAnoAltaReg(BigDecimal prpAnoAltaReg) {
        this.prpAnoAltaReg = prpAnoAltaReg;
    }

    public BigDecimal getPrpAnoAltaReg() {
        return this.prpAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrpMesAltaReg(BigDecimal prpMesAltaReg) {
        this.prpMesAltaReg = prpMesAltaReg;
    }

    public BigDecimal getPrpMesAltaReg() {
        return this.prpMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrpDiaAltaReg(BigDecimal prpDiaAltaReg) {
        this.prpDiaAltaReg = prpDiaAltaReg;
    }

    public BigDecimal getPrpDiaAltaReg() {
        return this.prpDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPrpAnoUltMod(BigDecimal prpAnoUltMod) {
        this.prpAnoUltMod = prpAnoUltMod;
    }

    public BigDecimal getPrpAnoUltMod() {
        return this.prpAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrpMesUltMod(BigDecimal prpMesUltMod) {
        this.prpMesUltMod = prpMesUltMod;
    }

    public BigDecimal getPrpMesUltMod() {
        return this.prpMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrpDiaUltMod(BigDecimal prpDiaUltMod) {
        this.prpDiaUltMod = prpDiaUltMod;
    }

    public BigDecimal getPrpDiaUltMod() {
        return this.prpDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrpCveStPrempar(String prpCveStPrempar) {
        this.prpCveStPrempar = prpCveStPrempar;
    }

    public String getPrpCveStPrempar() {
        return this.prpCveStPrempar;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PREMPART ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPrpNumContrato() != null && this.getPrpNumContrato().longValue() == -999) {
            conditions += " AND PRP_NUM_CONTRATO IS NULL";
        } else if (this.getPrpNumContrato() != null) {
            conditions += " AND PRP_NUM_CONTRATO = ?";
            values.add(this.getPrpNumContrato());
        }

        if (this.getPrpNumDepto() != null && this.getPrpNumDepto().longValue() == -999) {
            conditions += " AND PRP_NUM_DEPTO IS NULL";
        } else if (this.getPrpNumDepto() != null) {
            conditions += " AND PRP_NUM_DEPTO = ?";
            values.add(this.getPrpNumDepto());
        }

        if (this.getPrpNumParticip() != null && this.getPrpNumParticip().longValue() == -999) {
            conditions += " AND PRP_NUM_PARTICIP IS NULL";
        } else if (this.getPrpNumParticip() != null) {
            conditions += " AND PRP_NUM_PARTICIP = ?";
            values.add(this.getPrpNumParticip());
        }

        if (this.getPrpNumSecCta() != null && this.getPrpNumSecCta().longValue() == -999) {
            conditions += " AND PRP_NUM_SEC_CTA IS NULL";
        } else if (this.getPrpNumSecCta() != null) {
            conditions += " AND PRP_NUM_SEC_CTA = ?";
            values.add(this.getPrpNumSecCta());
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
        String sql = "SELECT * FROM PREMPART ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPrpNumContrato() != null && this.getPrpNumContrato().longValue() == -999) {
            conditions += " AND PRP_NUM_CONTRATO IS NULL";
        } else if (this.getPrpNumContrato() != null) {
            conditions += " AND PRP_NUM_CONTRATO = ?";
            values.add(this.getPrpNumContrato());
        }

        if (this.getPrpNumDepto() != null && this.getPrpNumDepto().longValue() == -999) {
            conditions += " AND PRP_NUM_DEPTO IS NULL";
        } else if (this.getPrpNumDepto() != null) {
            conditions += " AND PRP_NUM_DEPTO = ?";
            values.add(this.getPrpNumDepto());
        }

        if (this.getPrpNumParticip() != null && this.getPrpNumParticip().longValue() == -999) {
            conditions += " AND PRP_NUM_PARTICIP IS NULL";
        } else if (this.getPrpNumParticip() != null) {
            conditions += " AND PRP_NUM_PARTICIP = ?";
            values.add(this.getPrpNumParticip());
        }

        if (this.getPrpNumSecCta() != null && this.getPrpNumSecCta().longValue() == -999) {
            conditions += " AND PRP_NUM_SEC_CTA IS NULL";
        } else if (this.getPrpNumSecCta() != null) {
            conditions += " AND PRP_NUM_SEC_CTA = ?";
            values.add(this.getPrpNumSecCta());
        }

        if (this.getPrpCveTipoCta() != null && "null".equals(this.getPrpCveTipoCta())) {
            conditions += " AND PRP_CVE_TIPO_CTA IS NULL";
        } else if (this.getPrpCveTipoCta() != null) {
            conditions += " AND PRP_CVE_TIPO_CTA = ?";
            values.add(this.getPrpCveTipoCta());
        }

        if (this.getPrpNumBanco() != null && this.getPrpNumBanco().longValue() == -999) {
            conditions += " AND PRP_NUM_BANCO IS NULL";
        } else if (this.getPrpNumBanco() != null) {
            conditions += " AND PRP_NUM_BANCO = ?";
            values.add(this.getPrpNumBanco());
        }

        if (this.getPrpNumSucursal() != null && this.getPrpNumSucursal().longValue() == -999) {
            conditions += " AND PRP_NUM_SUCURSAL IS NULL";
        } else if (this.getPrpNumSucursal() != null) {
            conditions += " AND PRP_NUM_SUCURSAL = ?";
            values.add(this.getPrpNumSucursal());
        }

        if (this.getPrpNumCuenta() != null && this.getPrpNumCuenta().longValue() == -999) {
            conditions += " AND PRP_NUM_CUENTA IS NULL";
        } else if (this.getPrpNumCuenta() != null) {
            conditions += " AND PRP_NUM_CUENTA = ?";
            values.add(this.getPrpNumCuenta());
        }

        if (this.getPrpCveAutCargos() != null && this.getPrpCveAutCargos().longValue() == -999) {
            conditions += " AND PRP_CVE_AUT_CARGOS IS NULL";
        } else if (this.getPrpCveAutCargos() != null) {
            conditions += " AND PRP_CVE_AUT_CARGOS = ?";
            values.add(this.getPrpCveAutCargos());
        }

        if (this.getPrpCveAutAbonos() != null && this.getPrpCveAutAbonos().longValue() == -999) {
            conditions += " AND PRP_CVE_AUT_ABONOS IS NULL";
        } else if (this.getPrpCveAutAbonos() != null) {
            conditions += " AND PRP_CVE_AUT_ABONOS = ?";
            values.add(this.getPrpCveAutAbonos());
        }

        if (this.getPrpCveAutAmbos() != null && this.getPrpCveAutAmbos().longValue() == -999) {
            conditions += " AND PRP_CVE_AUT_AMBOS IS NULL";
        } else if (this.getPrpCveAutAmbos() != null) {
            conditions += " AND PRP_CVE_AUT_AMBOS = ?";
            values.add(this.getPrpCveAutAmbos());
        }

        if (this.getPrpAnoAltaReg() != null && this.getPrpAnoAltaReg().longValue() == -999) {
            conditions += " AND PRP_ANO_ALTA_REG IS NULL";
        } else if (this.getPrpAnoAltaReg() != null) {
            conditions += " AND PRP_ANO_ALTA_REG = ?";
            values.add(this.getPrpAnoAltaReg());
        }

        if (this.getPrpMesAltaReg() != null && this.getPrpMesAltaReg().longValue() == -999) {
            conditions += " AND PRP_MES_ALTA_REG IS NULL";
        } else if (this.getPrpMesAltaReg() != null) {
            conditions += " AND PRP_MES_ALTA_REG = ?";
            values.add(this.getPrpMesAltaReg());
        }

        if (this.getPrpDiaAltaReg() != null && this.getPrpDiaAltaReg().longValue() == -999) {
            conditions += " AND PRP_DIA_ALTA_REG IS NULL";
        } else if (this.getPrpDiaAltaReg() != null) {
            conditions += " AND PRP_DIA_ALTA_REG = ?";
            values.add(this.getPrpDiaAltaReg());
        }

        if (this.getPrpAnoUltMod() != null && this.getPrpAnoUltMod().longValue() == -999) {
            conditions += " AND PRP_ANO_ULT_MOD IS NULL";
        } else if (this.getPrpAnoUltMod() != null) {
            conditions += " AND PRP_ANO_ULT_MOD = ?";
            values.add(this.getPrpAnoUltMod());
        }

        if (this.getPrpMesUltMod() != null && this.getPrpMesUltMod().longValue() == -999) {
            conditions += " AND PRP_MES_ULT_MOD IS NULL";
        } else if (this.getPrpMesUltMod() != null) {
            conditions += " AND PRP_MES_ULT_MOD = ?";
            values.add(this.getPrpMesUltMod());
        }

        if (this.getPrpDiaUltMod() != null && this.getPrpDiaUltMod().longValue() == -999) {
            conditions += " AND PRP_DIA_ULT_MOD IS NULL";
        } else if (this.getPrpDiaUltMod() != null) {
            conditions += " AND PRP_DIA_ULT_MOD = ?";
            values.add(this.getPrpDiaUltMod());
        }

        if (this.getPrpCveStPrempar() != null && "null".equals(this.getPrpCveStPrempar())) {
            conditions += " AND PRP_CVE_ST_PREMPAR IS NULL";
        } else if (this.getPrpCveStPrempar() != null) {
            conditions += " AND PRP_CVE_ST_PREMPAR = ?";
            values.add(this.getPrpCveStPrempar());
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
        String sql = "UPDATE PREMPART SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PRP_NUM_CONTRATO = ?";
        pkValues.add(this.getPrpNumContrato());
        conditions += " AND PRP_NUM_DEPTO = ?";
        pkValues.add(this.getPrpNumDepto());
        conditions += " AND PRP_NUM_PARTICIP = ?";
        pkValues.add(this.getPrpNumParticip());
        conditions += " AND PRP_NUM_SEC_CTA = ?";
        pkValues.add(this.getPrpNumSecCta());
        fields += " PRP_CVE_TIPO_CTA = ?, ";
        values.add(this.getPrpCveTipoCta());
        fields += " PRP_NUM_BANCO = ?, ";
        values.add(this.getPrpNumBanco());
        fields += " PRP_NUM_SUCURSAL = ?, ";
        values.add(this.getPrpNumSucursal());
        fields += " PRP_NUM_CUENTA = ?, ";
        values.add(this.getPrpNumCuenta());
        fields += " PRP_CVE_AUT_CARGOS = ?, ";
        values.add(this.getPrpCveAutCargos());
        fields += " PRP_CVE_AUT_ABONOS = ?, ";
        values.add(this.getPrpCveAutAbonos());
        fields += " PRP_CVE_AUT_AMBOS = ?, ";
        values.add(this.getPrpCveAutAmbos());
        fields += " PRP_ANO_ALTA_REG = ?, ";
        values.add(this.getPrpAnoAltaReg());
        fields += " PRP_MES_ALTA_REG = ?, ";
        values.add(this.getPrpMesAltaReg());
        fields += " PRP_DIA_ALTA_REG = ?, ";
        values.add(this.getPrpDiaAltaReg());
        fields += " PRP_ANO_ULT_MOD = ?, ";
        values.add(this.getPrpAnoUltMod());
        fields += " PRP_MES_ULT_MOD = ?, ";
        values.add(this.getPrpMesUltMod());
        fields += " PRP_DIA_ULT_MOD = ?, ";
        values.add(this.getPrpDiaUltMod());
        fields += " PRP_CVE_ST_PREMPAR = ?, ";
        values.add(this.getPrpCveStPrempar());
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
        String sql = "INSERT INTO PREMPART ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PRP_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPrpNumContrato());

        fields += ", PRP_NUM_DEPTO";
        fieldValues += ", ?";
        values.add(this.getPrpNumDepto());

        fields += ", PRP_NUM_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getPrpNumParticip());

        fields += ", PRP_NUM_SEC_CTA";
        fieldValues += ", ?";
        values.add(this.getPrpNumSecCta());

        fields += ", PRP_CVE_TIPO_CTA";
        fieldValues += ", ?";
        values.add(this.getPrpCveTipoCta());

        fields += ", PRP_NUM_BANCO";
        fieldValues += ", ?";
        values.add(this.getPrpNumBanco());

        fields += ", PRP_NUM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getPrpNumSucursal());

        fields += ", PRP_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getPrpNumCuenta());

        fields += ", PRP_CVE_AUT_CARGOS";
        fieldValues += ", ?";
        values.add(this.getPrpCveAutCargos());

        fields += ", PRP_CVE_AUT_ABONOS";
        fieldValues += ", ?";
        values.add(this.getPrpCveAutAbonos());

        fields += ", PRP_CVE_AUT_AMBOS";
        fieldValues += ", ?";
        values.add(this.getPrpCveAutAmbos());

        fields += ", PRP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPrpAnoAltaReg());

        fields += ", PRP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPrpMesAltaReg());

        fields += ", PRP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPrpDiaAltaReg());

        fields += ", PRP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPrpAnoUltMod());

        fields += ", PRP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPrpMesUltMod());

        fields += ", PRP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPrpDiaUltMod());

        fields += ", PRP_CVE_ST_PREMPAR";
        fieldValues += ", ?";
        values.add(this.getPrpCveStPrempar());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PREMPART WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PRP_NUM_CONTRATO = ?";
        values.add(this.getPrpNumContrato());
        conditions += " AND PRP_NUM_DEPTO = ?";
        values.add(this.getPrpNumDepto());
        conditions += " AND PRP_NUM_PARTICIP = ?";
        values.add(this.getPrpNumParticip());
        conditions += " AND PRP_NUM_SEC_CTA = ?";
        values.add(this.getPrpNumSecCta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Prempart instance = (Prempart) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPrpNumContrato().equals(instance.getPrpNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPrpNumDepto().equals(instance.getPrpNumDepto()))
            equalObjects = false;
        if (equalObjects && !this.getPrpNumParticip().equals(instance.getPrpNumParticip()))
            equalObjects = false;
        if (equalObjects && !this.getPrpNumSecCta().equals(instance.getPrpNumSecCta()))
            equalObjects = false;
        if (equalObjects && !this.getPrpCveTipoCta().equals(instance.getPrpCveTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getPrpNumBanco().equals(instance.getPrpNumBanco()))
            equalObjects = false;
        if (equalObjects && !this.getPrpNumSucursal().equals(instance.getPrpNumSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getPrpNumCuenta().equals(instance.getPrpNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getPrpCveAutCargos().equals(instance.getPrpCveAutCargos()))
            equalObjects = false;
        if (equalObjects && !this.getPrpCveAutAbonos().equals(instance.getPrpCveAutAbonos()))
            equalObjects = false;
        if (equalObjects && !this.getPrpCveAutAmbos().equals(instance.getPrpCveAutAmbos()))
            equalObjects = false;
        if (equalObjects && !this.getPrpAnoAltaReg().equals(instance.getPrpAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPrpMesAltaReg().equals(instance.getPrpMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPrpDiaAltaReg().equals(instance.getPrpDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPrpAnoUltMod().equals(instance.getPrpAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPrpMesUltMod().equals(instance.getPrpMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPrpDiaUltMod().equals(instance.getPrpDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPrpCveStPrempar().equals(instance.getPrpCveStPrempar()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Prempart result = new Prempart();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPrpNumContrato((BigDecimal) objectData.getData("PRP_NUM_CONTRATO"));
        result.setPrpNumDepto((BigDecimal) objectData.getData("PRP_NUM_DEPTO"));
        result.setPrpNumParticip((BigDecimal) objectData.getData("PRP_NUM_PARTICIP"));
        result.setPrpNumSecCta((BigDecimal) objectData.getData("PRP_NUM_SEC_CTA"));
        result.setPrpCveTipoCta((String) objectData.getData("PRP_CVE_TIPO_CTA"));
        result.setPrpNumBanco((BigDecimal) objectData.getData("PRP_NUM_BANCO"));
        result.setPrpNumSucursal((BigDecimal) objectData.getData("PRP_NUM_SUCURSAL"));
        result.setPrpNumCuenta((BigDecimal) objectData.getData("PRP_NUM_CUENTA"));
        result.setPrpCveAutCargos((BigDecimal) objectData.getData("PRP_CVE_AUT_CARGOS"));
        result.setPrpCveAutAbonos((BigDecimal) objectData.getData("PRP_CVE_AUT_ABONOS"));
        result.setPrpCveAutAmbos((BigDecimal) objectData.getData("PRP_CVE_AUT_AMBOS"));
        result.setPrpAnoAltaReg((BigDecimal) objectData.getData("PRP_ANO_ALTA_REG"));
        result.setPrpMesAltaReg((BigDecimal) objectData.getData("PRP_MES_ALTA_REG"));
        result.setPrpDiaAltaReg((BigDecimal) objectData.getData("PRP_DIA_ALTA_REG"));
        result.setPrpAnoUltMod((BigDecimal) objectData.getData("PRP_ANO_ULT_MOD"));
        result.setPrpMesUltMod((BigDecimal) objectData.getData("PRP_MES_ULT_MOD"));
        result.setPrpDiaUltMod((BigDecimal) objectData.getData("PRP_DIA_ULT_MOD"));
        result.setPrpCveStPrempar((String) objectData.getData("PRP_CVE_ST_PREMPAR"));

        return result;

    }

}
