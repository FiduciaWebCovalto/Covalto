package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CUENTAS_PK", columns = { "CBA_CVE_PERSON_FID", "CBA_NUM_SEC_CTA", "CBA_NUM_CONTRATO", "CBA_NUM_PERSON_FID" }, sequences = { "MANUAL" })
public class Cuentas extends DomainObject {

    BigDecimal cbaNumContrato = null;
    String cbaCvePersonFid = null;
    BigDecimal cbaNumPersonFid = null;
    BigDecimal cbaNumSecCta = null;
    String cbaCveTipoCta = null;
    BigDecimal cbaNumBanco = null;
    BigDecimal cbaNumPlaza = null;
    BigDecimal cbaNumSucursal = null;
    BigDecimal cbaNumCuenta = null;
    BigDecimal cbaCveAutCargos = null;
    BigDecimal cbaCveAutAbonos = null;
    BigDecimal cbaCveAutAmbos = null;
    BigDecimal cbaAnoAltaReg = null;
    BigDecimal cbaMesAltaReg = null;
    BigDecimal cbaDiaAltaReg = null;
    BigDecimal cbaAnoUltMod = null;
    BigDecimal cbaMesUltMod = null;
    BigDecimal cbaDiaUltMod = null;
    String cbaCveStCuenta = null;

    public Cuentas() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCbaNumContrato(BigDecimal cbaNumContrato) {
        this.cbaNumContrato = cbaNumContrato;
    }

    public BigDecimal getCbaNumContrato() {
        return this.cbaNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCbaCvePersonFid(String cbaCvePersonFid) {
        this.cbaCvePersonFid = cbaCvePersonFid;
    }

    public String getCbaCvePersonFid() {
        return this.cbaCvePersonFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCbaNumPersonFid(BigDecimal cbaNumPersonFid) {
        this.cbaNumPersonFid = cbaNumPersonFid;
    }

    public BigDecimal getCbaNumPersonFid() {
        return this.cbaNumPersonFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCbaNumSecCta(BigDecimal cbaNumSecCta) {
        this.cbaNumSecCta = cbaNumSecCta;
    }

    public BigDecimal getCbaNumSecCta() {
        return this.cbaNumSecCta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCbaCveTipoCta(String cbaCveTipoCta) {
        this.cbaCveTipoCta = cbaCveTipoCta;
    }

    public String getCbaCveTipoCta() {
        return this.cbaCveTipoCta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCbaNumBanco(BigDecimal cbaNumBanco) {
        this.cbaNumBanco = cbaNumBanco;
    }

    public BigDecimal getCbaNumBanco() {
        return this.cbaNumBanco;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setCbaNumPlaza(BigDecimal cbaNumPlaza) {
        this.cbaNumPlaza = cbaNumPlaza;
    }

    public BigDecimal getCbaNumPlaza() {
        return this.cbaNumPlaza;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCbaNumSucursal(BigDecimal cbaNumSucursal) {
        this.cbaNumSucursal = cbaNumSucursal;
    }

    public BigDecimal getCbaNumSucursal() {
        return this.cbaNumSucursal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setCbaNumCuenta(BigDecimal cbaNumCuenta) {
        this.cbaNumCuenta = cbaNumCuenta;
    }

    public BigDecimal getCbaNumCuenta() {
        return this.cbaNumCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCbaCveAutCargos(BigDecimal cbaCveAutCargos) {
        this.cbaCveAutCargos = cbaCveAutCargos;
    }

    public BigDecimal getCbaCveAutCargos() {
        return this.cbaCveAutCargos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCbaCveAutAbonos(BigDecimal cbaCveAutAbonos) {
        this.cbaCveAutAbonos = cbaCveAutAbonos;
    }

    public BigDecimal getCbaCveAutAbonos() {
        return this.cbaCveAutAbonos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCbaCveAutAmbos(BigDecimal cbaCveAutAmbos) {
        this.cbaCveAutAmbos = cbaCveAutAmbos;
    }

    public BigDecimal getCbaCveAutAmbos() {
        return this.cbaCveAutAmbos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCbaAnoAltaReg(BigDecimal cbaAnoAltaReg) {
        this.cbaAnoAltaReg = cbaAnoAltaReg;
    }

    public BigDecimal getCbaAnoAltaReg() {
        return this.cbaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCbaMesAltaReg(BigDecimal cbaMesAltaReg) {
        this.cbaMesAltaReg = cbaMesAltaReg;
    }

    public BigDecimal getCbaMesAltaReg() {
        return this.cbaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCbaDiaAltaReg(BigDecimal cbaDiaAltaReg) {
        this.cbaDiaAltaReg = cbaDiaAltaReg;
    }

    public BigDecimal getCbaDiaAltaReg() {
        return this.cbaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCbaAnoUltMod(BigDecimal cbaAnoUltMod) {
        this.cbaAnoUltMod = cbaAnoUltMod;
    }

    public BigDecimal getCbaAnoUltMod() {
        return this.cbaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCbaMesUltMod(BigDecimal cbaMesUltMod) {
        this.cbaMesUltMod = cbaMesUltMod;
    }

    public BigDecimal getCbaMesUltMod() {
        return this.cbaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCbaDiaUltMod(BigDecimal cbaDiaUltMod) {
        this.cbaDiaUltMod = cbaDiaUltMod;
    }

    public BigDecimal getCbaDiaUltMod() {
        return this.cbaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCbaCveStCuenta(String cbaCveStCuenta) {
        this.cbaCveStCuenta = cbaCveStCuenta;
    }

    public String getCbaCveStCuenta() {
        return this.cbaCveStCuenta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CUENTAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCbaNumContrato() != null && this.getCbaNumContrato().longValue() == -999) {
            conditions += " AND CBA_NUM_CONTRATO IS NULL";
        } else if (this.getCbaNumContrato() != null) {
            conditions += " AND CBA_NUM_CONTRATO = ?";
            values.add(this.getCbaNumContrato());
        }

        if (this.getCbaCvePersonFid() != null && "null".equals(this.getCbaCvePersonFid())) {
            conditions += " AND CBA_CVE_PERSON_FID IS NULL";
        } else if (this.getCbaCvePersonFid() != null) {
            conditions += " AND CBA_CVE_PERSON_FID = ?";
            values.add(this.getCbaCvePersonFid());
        }

        if (this.getCbaNumPersonFid() != null && this.getCbaNumPersonFid().longValue() == -999) {
            conditions += " AND CBA_NUM_PERSON_FID IS NULL";
        } else if (this.getCbaNumPersonFid() != null) {
            conditions += " AND CBA_NUM_PERSON_FID = ?";
            values.add(this.getCbaNumPersonFid());
        }

        if (this.getCbaNumSecCta() != null && this.getCbaNumSecCta().longValue() == -999) {
            conditions += " AND CBA_NUM_SEC_CTA IS NULL";
        } else if (this.getCbaNumSecCta() != null) {
            conditions += " AND CBA_NUM_SEC_CTA = ?";
            values.add(this.getCbaNumSecCta());
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
        String sql = "SELECT * FROM CUENTAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCbaNumContrato() != null && this.getCbaNumContrato().longValue() == -999) {
            conditions += " AND CBA_NUM_CONTRATO IS NULL";
        } else if (this.getCbaNumContrato() != null) {
            conditions += " AND CBA_NUM_CONTRATO = ?";
            values.add(this.getCbaNumContrato());
        }

        if (this.getCbaCvePersonFid() != null && "null".equals(this.getCbaCvePersonFid())) {
            conditions += " AND CBA_CVE_PERSON_FID IS NULL";
        } else if (this.getCbaCvePersonFid() != null) {
            conditions += " AND CBA_CVE_PERSON_FID = ?";
            values.add(this.getCbaCvePersonFid());
        }

        if (this.getCbaNumPersonFid() != null && this.getCbaNumPersonFid().longValue() == -999) {
            conditions += " AND CBA_NUM_PERSON_FID IS NULL";
        } else if (this.getCbaNumPersonFid() != null) {
            conditions += " AND CBA_NUM_PERSON_FID = ?";
            values.add(this.getCbaNumPersonFid());
        }

        if (this.getCbaNumSecCta() != null && this.getCbaNumSecCta().longValue() == -999) {
            conditions += " AND CBA_NUM_SEC_CTA IS NULL";
        } else if (this.getCbaNumSecCta() != null) {
            conditions += " AND CBA_NUM_SEC_CTA = ?";
            values.add(this.getCbaNumSecCta());
        }

        if (this.getCbaCveTipoCta() != null && "null".equals(this.getCbaCveTipoCta())) {
            conditions += " AND CBA_CVE_TIPO_CTA IS NULL";
        } else if (this.getCbaCveTipoCta() != null) {
            conditions += " AND CBA_CVE_TIPO_CTA = ?";
            values.add(this.getCbaCveTipoCta());
        }

        if (this.getCbaNumBanco() != null && this.getCbaNumBanco().longValue() == -999) {
            conditions += " AND CBA_NUM_BANCO IS NULL";
        } else if (this.getCbaNumBanco() != null) {
            conditions += " AND CBA_NUM_BANCO = ?";
            values.add(this.getCbaNumBanco());
        }

        if (this.getCbaNumPlaza() != null && this.getCbaNumPlaza().longValue() == -999) {
            conditions += " AND CBA_NUM_PLAZA IS NULL";
        } else if (this.getCbaNumPlaza() != null) {
            conditions += " AND CBA_NUM_PLAZA = ?";
            values.add(this.getCbaNumPlaza());
        }

        if (this.getCbaNumSucursal() != null && this.getCbaNumSucursal().longValue() == -999) {
            conditions += " AND CBA_NUM_SUCURSAL IS NULL";
        } else if (this.getCbaNumSucursal() != null) {
            conditions += " AND CBA_NUM_SUCURSAL = ?";
            values.add(this.getCbaNumSucursal());
        }

        if (this.getCbaNumCuenta() != null && this.getCbaNumCuenta().longValue() == -999) {
            conditions += " AND CBA_NUM_CUENTA IS NULL";
        } else if (this.getCbaNumCuenta() != null) {
            conditions += " AND CBA_NUM_CUENTA = ?";
            values.add(this.getCbaNumCuenta());
        }

        if (this.getCbaCveAutCargos() != null && this.getCbaCveAutCargos().longValue() == -999) {
            conditions += " AND CBA_CVE_AUT_CARGOS IS NULL";
        } else if (this.getCbaCveAutCargos() != null) {
            conditions += " AND CBA_CVE_AUT_CARGOS = ?";
            values.add(this.getCbaCveAutCargos());
        }

        if (this.getCbaCveAutAbonos() != null && this.getCbaCveAutAbonos().longValue() == -999) {
            conditions += " AND CBA_CVE_AUT_ABONOS IS NULL";
        } else if (this.getCbaCveAutAbonos() != null) {
            conditions += " AND CBA_CVE_AUT_ABONOS = ?";
            values.add(this.getCbaCveAutAbonos());
        }

        if (this.getCbaCveAutAmbos() != null && this.getCbaCveAutAmbos().longValue() == -999) {
            conditions += " AND CBA_CVE_AUT_AMBOS IS NULL";
        } else if (this.getCbaCveAutAmbos() != null) {
            conditions += " AND CBA_CVE_AUT_AMBOS = ?";
            values.add(this.getCbaCveAutAmbos());
        }

        if (this.getCbaAnoAltaReg() != null && this.getCbaAnoAltaReg().longValue() == -999) {
            conditions += " AND CBA_ANO_ALTA_REG IS NULL";
        } else if (this.getCbaAnoAltaReg() != null) {
            conditions += " AND CBA_ANO_ALTA_REG = ?";
            values.add(this.getCbaAnoAltaReg());
        }

        if (this.getCbaMesAltaReg() != null && this.getCbaMesAltaReg().longValue() == -999) {
            conditions += " AND CBA_MES_ALTA_REG IS NULL";
        } else if (this.getCbaMesAltaReg() != null) {
            conditions += " AND CBA_MES_ALTA_REG = ?";
            values.add(this.getCbaMesAltaReg());
        }

        if (this.getCbaDiaAltaReg() != null && this.getCbaDiaAltaReg().longValue() == -999) {
            conditions += " AND CBA_DIA_ALTA_REG IS NULL";
        } else if (this.getCbaDiaAltaReg() != null) {
            conditions += " AND CBA_DIA_ALTA_REG = ?";
            values.add(this.getCbaDiaAltaReg());
        }

        if (this.getCbaAnoUltMod() != null && this.getCbaAnoUltMod().longValue() == -999) {
            conditions += " AND CBA_ANO_ULT_MOD IS NULL";
        } else if (this.getCbaAnoUltMod() != null) {
            conditions += " AND CBA_ANO_ULT_MOD = ?";
            values.add(this.getCbaAnoUltMod());
        }

        if (this.getCbaMesUltMod() != null && this.getCbaMesUltMod().longValue() == -999) {
            conditions += " AND CBA_MES_ULT_MOD IS NULL";
        } else if (this.getCbaMesUltMod() != null) {
            conditions += " AND CBA_MES_ULT_MOD = ?";
            values.add(this.getCbaMesUltMod());
        }

        if (this.getCbaDiaUltMod() != null && this.getCbaDiaUltMod().longValue() == -999) {
            conditions += " AND CBA_DIA_ULT_MOD IS NULL";
        } else if (this.getCbaDiaUltMod() != null) {
            conditions += " AND CBA_DIA_ULT_MOD = ?";
            values.add(this.getCbaDiaUltMod());
        }

        if (this.getCbaCveStCuenta() != null && "null".equals(this.getCbaCveStCuenta())) {
            conditions += " AND CBA_CVE_ST_CUENTA IS NULL";
        } else if (this.getCbaCveStCuenta() != null) {
            conditions += " AND CBA_CVE_ST_CUENTA = ?";
            values.add(this.getCbaCveStCuenta());
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
        String sql = "UPDATE CUENTAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CBA_NUM_CONTRATO = ?";
        pkValues.add(this.getCbaNumContrato());
        conditions += " AND CBA_CVE_PERSON_FID = ?";
        pkValues.add(this.getCbaCvePersonFid());
        conditions += " AND CBA_NUM_PERSON_FID = ?";
        pkValues.add(this.getCbaNumPersonFid());
        conditions += " AND CBA_NUM_SEC_CTA = ?";
        pkValues.add(this.getCbaNumSecCta());
        fields += " CBA_CVE_TIPO_CTA = ?, ";
        values.add(this.getCbaCveTipoCta());
        fields += " CBA_NUM_BANCO = ?, ";
        values.add(this.getCbaNumBanco());
        fields += " CBA_NUM_PLAZA = ?, ";
        values.add(this.getCbaNumPlaza());
        fields += " CBA_NUM_SUCURSAL = ?, ";
        values.add(this.getCbaNumSucursal());
        fields += " CBA_NUM_CUENTA = ?, ";
        values.add(this.getCbaNumCuenta());
        fields += " CBA_CVE_AUT_CARGOS = ?, ";
        values.add(this.getCbaCveAutCargos());
        fields += " CBA_CVE_AUT_ABONOS = ?, ";
        values.add(this.getCbaCveAutAbonos());
        fields += " CBA_CVE_AUT_AMBOS = ?, ";
        values.add(this.getCbaCveAutAmbos());
        fields += " CBA_ANO_ALTA_REG = ?, ";
        values.add(this.getCbaAnoAltaReg());
        fields += " CBA_MES_ALTA_REG = ?, ";
        values.add(this.getCbaMesAltaReg());
        fields += " CBA_DIA_ALTA_REG = ?, ";
        values.add(this.getCbaDiaAltaReg());
        fields += " CBA_ANO_ULT_MOD = ?, ";
        values.add(this.getCbaAnoUltMod());
        fields += " CBA_MES_ULT_MOD = ?, ";
        values.add(this.getCbaMesUltMod());
        fields += " CBA_DIA_ULT_MOD = ?, ";
        values.add(this.getCbaDiaUltMod());
        fields += " CBA_CVE_ST_CUENTA = ?, ";
        values.add(this.getCbaCveStCuenta());
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
        String sql = "INSERT INTO CUENTAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CBA_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCbaNumContrato());

        fields += ", CBA_CVE_PERSON_FID";
        fieldValues += ", ?";
        values.add(this.getCbaCvePersonFid());

        fields += ", CBA_NUM_PERSON_FID";
        fieldValues += ", ?";
        values.add(this.getCbaNumPersonFid());

        fields += ", CBA_NUM_SEC_CTA";
        fieldValues += ", ?";
        values.add(this.getCbaNumSecCta());

        fields += ", CBA_CVE_TIPO_CTA";
        fieldValues += ", ?";
        values.add(this.getCbaCveTipoCta());

        fields += ", CBA_NUM_BANCO";
        fieldValues += ", ?";
        values.add(this.getCbaNumBanco());

        fields += ", CBA_NUM_PLAZA";
        fieldValues += ", ?";
        values.add(this.getCbaNumPlaza());

        fields += ", CBA_NUM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getCbaNumSucursal());

        fields += ", CBA_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getCbaNumCuenta());

        fields += ", CBA_CVE_AUT_CARGOS";
        fieldValues += ", ?";
        values.add(this.getCbaCveAutCargos());

        fields += ", CBA_CVE_AUT_ABONOS";
        fieldValues += ", ?";
        values.add(this.getCbaCveAutAbonos());

        fields += ", CBA_CVE_AUT_AMBOS";
        fieldValues += ", ?";
        values.add(this.getCbaCveAutAmbos());

        fields += ", CBA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCbaAnoAltaReg());

        fields += ", CBA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCbaMesAltaReg());

        fields += ", CBA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCbaDiaAltaReg());

        fields += ", CBA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCbaAnoUltMod());

        fields += ", CBA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCbaMesUltMod());

        fields += ", CBA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCbaDiaUltMod());

        fields += ", CBA_CVE_ST_CUENTA";
        fieldValues += ", ?";
        values.add(this.getCbaCveStCuenta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CUENTAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CBA_NUM_CONTRATO = ?";
        values.add(this.getCbaNumContrato());
        conditions += " AND CBA_CVE_PERSON_FID = ?";
        values.add(this.getCbaCvePersonFid());
        conditions += " AND CBA_NUM_PERSON_FID = ?";
        values.add(this.getCbaNumPersonFid());
        conditions += " AND CBA_NUM_SEC_CTA = ?";
        values.add(this.getCbaNumSecCta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cuentas instance = (Cuentas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCbaNumContrato().equals(instance.getCbaNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCbaCvePersonFid().equals(instance.getCbaCvePersonFid()))
            equalObjects = false;
        if (equalObjects && !this.getCbaNumPersonFid().equals(instance.getCbaNumPersonFid()))
            equalObjects = false;
        if (equalObjects && !this.getCbaNumSecCta().equals(instance.getCbaNumSecCta()))
            equalObjects = false;
        if (equalObjects && !this.getCbaCveTipoCta().equals(instance.getCbaCveTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getCbaNumBanco().equals(instance.getCbaNumBanco()))
            equalObjects = false;
        if (equalObjects && !this.getCbaNumPlaza().equals(instance.getCbaNumPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getCbaNumSucursal().equals(instance.getCbaNumSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getCbaNumCuenta().equals(instance.getCbaNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getCbaCveAutCargos().equals(instance.getCbaCveAutCargos()))
            equalObjects = false;
        if (equalObjects && !this.getCbaCveAutAbonos().equals(instance.getCbaCveAutAbonos()))
            equalObjects = false;
        if (equalObjects && !this.getCbaCveAutAmbos().equals(instance.getCbaCveAutAmbos()))
            equalObjects = false;
        if (equalObjects && !this.getCbaAnoAltaReg().equals(instance.getCbaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCbaMesAltaReg().equals(instance.getCbaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCbaDiaAltaReg().equals(instance.getCbaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCbaAnoUltMod().equals(instance.getCbaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCbaMesUltMod().equals(instance.getCbaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCbaDiaUltMod().equals(instance.getCbaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCbaCveStCuenta().equals(instance.getCbaCveStCuenta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cuentas result = new Cuentas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCbaNumContrato((BigDecimal) objectData.getData("CBA_NUM_CONTRATO"));
        result.setCbaCvePersonFid((String) objectData.getData("CBA_CVE_PERSON_FID"));
        result.setCbaNumPersonFid((BigDecimal) objectData.getData("CBA_NUM_PERSON_FID"));
        result.setCbaNumSecCta((BigDecimal) objectData.getData("CBA_NUM_SEC_CTA"));
        result.setCbaCveTipoCta((String) objectData.getData("CBA_CVE_TIPO_CTA"));
        result.setCbaNumBanco((BigDecimal) objectData.getData("CBA_NUM_BANCO"));
        result.setCbaNumPlaza((BigDecimal) objectData.getData("CBA_NUM_PLAZA"));
        result.setCbaNumSucursal((BigDecimal) objectData.getData("CBA_NUM_SUCURSAL"));
        result.setCbaNumCuenta((BigDecimal) objectData.getData("CBA_NUM_CUENTA"));
        result.setCbaCveAutCargos((BigDecimal) objectData.getData("CBA_CVE_AUT_CARGOS"));
        result.setCbaCveAutAbonos((BigDecimal) objectData.getData("CBA_CVE_AUT_ABONOS"));
        result.setCbaCveAutAmbos((BigDecimal) objectData.getData("CBA_CVE_AUT_AMBOS"));
        result.setCbaAnoAltaReg((BigDecimal) objectData.getData("CBA_ANO_ALTA_REG"));
        result.setCbaMesAltaReg((BigDecimal) objectData.getData("CBA_MES_ALTA_REG"));
        result.setCbaDiaAltaReg((BigDecimal) objectData.getData("CBA_DIA_ALTA_REG"));
        result.setCbaAnoUltMod((BigDecimal) objectData.getData("CBA_ANO_ULT_MOD"));
        result.setCbaMesUltMod((BigDecimal) objectData.getData("CBA_MES_ULT_MOD"));
        result.setCbaDiaUltMod((BigDecimal) objectData.getData("CBA_DIA_ULT_MOD"));
        result.setCbaCveStCuenta((String) objectData.getData("CBA_CVE_ST_CUENTA"));

        return result;

    }

}
