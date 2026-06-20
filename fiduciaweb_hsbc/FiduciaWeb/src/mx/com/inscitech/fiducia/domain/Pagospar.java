package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PAGOSPAR_PK", columns = { "PPA_NUM_CONTRATO", "PPA_NUM_DEPTO", "PPA_NUM_PARTICIP" }, sequences = { "MANUAL" })
public class Pagospar extends DomainObject {

    BigDecimal ppaNumContrato = null;
    BigDecimal ppaNumDepto = null;
    BigDecimal ppaNumParticip = null;
    String ppaFechaPago = null;
    BigDecimal ppaImpAportPart = null;
    BigDecimal ppaImpInterPart = null;
    BigDecimal ppaImpAportEmp = null;
    BigDecimal ppaImpInterEmp = null;
    BigDecimal ppaNumBanco = null;
    BigDecimal ppaNumSucursal = null;
    String ppaCveTipoCta = null;
    BigDecimal ppaNumCuenta = null;
    BigDecimal ppaNumCheque = null;
    BigDecimal ppaImpCheque = null;
    BigDecimal ppaAnoAltaReg = null;
    BigDecimal ppaMesAltaReg = null;
    BigDecimal ppaDiaAltaReg = null;
    BigDecimal ppaAnoUltMod = null;
    BigDecimal ppaMesUltMod = null;
    BigDecimal ppaDiaUltMod = null;
    String ppaCveStPgospar = null;

    public Pagospar() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPpaNumContrato(BigDecimal ppaNumContrato) {
        this.ppaNumContrato = ppaNumContrato;
    }

    public BigDecimal getPpaNumContrato() {
        return this.ppaNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPpaNumDepto(BigDecimal ppaNumDepto) {
        this.ppaNumDepto = ppaNumDepto;
    }

    public BigDecimal getPpaNumDepto() {
        return this.ppaNumDepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPpaNumParticip(BigDecimal ppaNumParticip) {
        this.ppaNumParticip = ppaNumParticip;
    }

    public BigDecimal getPpaNumParticip() {
        return this.ppaNumParticip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPpaFechaPago(String ppaFechaPago) {
        this.ppaFechaPago = ppaFechaPago;
    }

    public String getPpaFechaPago() {
        return this.ppaFechaPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPpaImpAportPart(BigDecimal ppaImpAportPart) {
        this.ppaImpAportPart = ppaImpAportPart;
    }

    public BigDecimal getPpaImpAportPart() {
        return this.ppaImpAportPart;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPpaImpInterPart(BigDecimal ppaImpInterPart) {
        this.ppaImpInterPart = ppaImpInterPart;
    }

    public BigDecimal getPpaImpInterPart() {
        return this.ppaImpInterPart;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPpaImpAportEmp(BigDecimal ppaImpAportEmp) {
        this.ppaImpAportEmp = ppaImpAportEmp;
    }

    public BigDecimal getPpaImpAportEmp() {
        return this.ppaImpAportEmp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPpaImpInterEmp(BigDecimal ppaImpInterEmp) {
        this.ppaImpInterEmp = ppaImpInterEmp;
    }

    public BigDecimal getPpaImpInterEmp() {
        return this.ppaImpInterEmp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPpaNumBanco(BigDecimal ppaNumBanco) {
        this.ppaNumBanco = ppaNumBanco;
    }

    public BigDecimal getPpaNumBanco() {
        return this.ppaNumBanco;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPpaNumSucursal(BigDecimal ppaNumSucursal) {
        this.ppaNumSucursal = ppaNumSucursal;
    }

    public BigDecimal getPpaNumSucursal() {
        return this.ppaNumSucursal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPpaCveTipoCta(String ppaCveTipoCta) {
        this.ppaCveTipoCta = ppaCveTipoCta;
    }

    public String getPpaCveTipoCta() {
        return this.ppaCveTipoCta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPpaNumCuenta(BigDecimal ppaNumCuenta) {
        this.ppaNumCuenta = ppaNumCuenta;
    }

    public BigDecimal getPpaNumCuenta() {
        return this.ppaNumCuenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPpaNumCheque(BigDecimal ppaNumCheque) {
        this.ppaNumCheque = ppaNumCheque;
    }

    public BigDecimal getPpaNumCheque() {
        return this.ppaNumCheque;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPpaImpCheque(BigDecimal ppaImpCheque) {
        this.ppaImpCheque = ppaImpCheque;
    }

    public BigDecimal getPpaImpCheque() {
        return this.ppaImpCheque;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPpaAnoAltaReg(BigDecimal ppaAnoAltaReg) {
        this.ppaAnoAltaReg = ppaAnoAltaReg;
    }

    public BigDecimal getPpaAnoAltaReg() {
        return this.ppaAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPpaMesAltaReg(BigDecimal ppaMesAltaReg) {
        this.ppaMesAltaReg = ppaMesAltaReg;
    }

    public BigDecimal getPpaMesAltaReg() {
        return this.ppaMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPpaDiaAltaReg(BigDecimal ppaDiaAltaReg) {
        this.ppaDiaAltaReg = ppaDiaAltaReg;
    }

    public BigDecimal getPpaDiaAltaReg() {
        return this.ppaDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPpaAnoUltMod(BigDecimal ppaAnoUltMod) {
        this.ppaAnoUltMod = ppaAnoUltMod;
    }

    public BigDecimal getPpaAnoUltMod() {
        return this.ppaAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPpaMesUltMod(BigDecimal ppaMesUltMod) {
        this.ppaMesUltMod = ppaMesUltMod;
    }

    public BigDecimal getPpaMesUltMod() {
        return this.ppaMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPpaDiaUltMod(BigDecimal ppaDiaUltMod) {
        this.ppaDiaUltMod = ppaDiaUltMod;
    }

    public BigDecimal getPpaDiaUltMod() {
        return this.ppaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPpaCveStPgospar(String ppaCveStPgospar) {
        this.ppaCveStPgospar = ppaCveStPgospar;
    }

    public String getPpaCveStPgospar() {
        return this.ppaCveStPgospar;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PAGOSPAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPpaNumContrato() != null && this.getPpaNumContrato().longValue() == -999) {
            conditions += " AND PPA_NUM_CONTRATO IS NULL";
        } else if (this.getPpaNumContrato() != null) {
            conditions += " AND PPA_NUM_CONTRATO = ?";
            values.add(this.getPpaNumContrato());
        }

        if (this.getPpaNumDepto() != null && this.getPpaNumDepto().longValue() == -999) {
            conditions += " AND PPA_NUM_DEPTO IS NULL";
        } else if (this.getPpaNumDepto() != null) {
            conditions += " AND PPA_NUM_DEPTO = ?";
            values.add(this.getPpaNumDepto());
        }

        if (this.getPpaNumParticip() != null && this.getPpaNumParticip().longValue() == -999) {
            conditions += " AND PPA_NUM_PARTICIP IS NULL";
        } else if (this.getPpaNumParticip() != null) {
            conditions += " AND PPA_NUM_PARTICIP = ?";
            values.add(this.getPpaNumParticip());
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
        String sql = "SELECT * FROM PAGOSPAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPpaNumContrato() != null && this.getPpaNumContrato().longValue() == -999) {
            conditions += " AND PPA_NUM_CONTRATO IS NULL";
        } else if (this.getPpaNumContrato() != null) {
            conditions += " AND PPA_NUM_CONTRATO = ?";
            values.add(this.getPpaNumContrato());
        }

        if (this.getPpaNumDepto() != null && this.getPpaNumDepto().longValue() == -999) {
            conditions += " AND PPA_NUM_DEPTO IS NULL";
        } else if (this.getPpaNumDepto() != null) {
            conditions += " AND PPA_NUM_DEPTO = ?";
            values.add(this.getPpaNumDepto());
        }

        if (this.getPpaNumParticip() != null && this.getPpaNumParticip().longValue() == -999) {
            conditions += " AND PPA_NUM_PARTICIP IS NULL";
        } else if (this.getPpaNumParticip() != null) {
            conditions += " AND PPA_NUM_PARTICIP = ?";
            values.add(this.getPpaNumParticip());
        }

        if (this.getPpaFechaPago() != null && "null".equals(this.getPpaFechaPago())) {
            conditions += " AND PPA_FECHA_PAGO IS NULL";
        } else if (this.getPpaFechaPago() != null) {
            conditions += " AND PPA_FECHA_PAGO = ?";
            values.add(this.getPpaFechaPago());
        }

        if (this.getPpaImpAportPart() != null && this.getPpaImpAportPart().longValue() == -999) {
            conditions += " AND PPA_IMP_APORT_PART IS NULL";
        } else if (this.getPpaImpAportPart() != null) {
            conditions += " AND PPA_IMP_APORT_PART = ?";
            values.add(this.getPpaImpAportPart());
        }

        if (this.getPpaImpInterPart() != null && this.getPpaImpInterPart().longValue() == -999) {
            conditions += " AND PPA_IMP_INTER_PART IS NULL";
        } else if (this.getPpaImpInterPart() != null) {
            conditions += " AND PPA_IMP_INTER_PART = ?";
            values.add(this.getPpaImpInterPart());
        }

        if (this.getPpaImpAportEmp() != null && this.getPpaImpAportEmp().longValue() == -999) {
            conditions += " AND PPA_IMP_APORT_EMP IS NULL";
        } else if (this.getPpaImpAportEmp() != null) {
            conditions += " AND PPA_IMP_APORT_EMP = ?";
            values.add(this.getPpaImpAportEmp());
        }

        if (this.getPpaImpInterEmp() != null && this.getPpaImpInterEmp().longValue() == -999) {
            conditions += " AND PPA_IMP_INTER_EMP IS NULL";
        } else if (this.getPpaImpInterEmp() != null) {
            conditions += " AND PPA_IMP_INTER_EMP = ?";
            values.add(this.getPpaImpInterEmp());
        }

        if (this.getPpaNumBanco() != null && this.getPpaNumBanco().longValue() == -999) {
            conditions += " AND PPA_NUM_BANCO IS NULL";
        } else if (this.getPpaNumBanco() != null) {
            conditions += " AND PPA_NUM_BANCO = ?";
            values.add(this.getPpaNumBanco());
        }

        if (this.getPpaNumSucursal() != null && this.getPpaNumSucursal().longValue() == -999) {
            conditions += " AND PPA_NUM_SUCURSAL IS NULL";
        } else if (this.getPpaNumSucursal() != null) {
            conditions += " AND PPA_NUM_SUCURSAL = ?";
            values.add(this.getPpaNumSucursal());
        }

        if (this.getPpaCveTipoCta() != null && "null".equals(this.getPpaCveTipoCta())) {
            conditions += " AND PPA_CVE_TIPO_CTA IS NULL";
        } else if (this.getPpaCveTipoCta() != null) {
            conditions += " AND PPA_CVE_TIPO_CTA = ?";
            values.add(this.getPpaCveTipoCta());
        }

        if (this.getPpaNumCuenta() != null && this.getPpaNumCuenta().longValue() == -999) {
            conditions += " AND PPA_NUM_CUENTA IS NULL";
        } else if (this.getPpaNumCuenta() != null) {
            conditions += " AND PPA_NUM_CUENTA = ?";
            values.add(this.getPpaNumCuenta());
        }

        if (this.getPpaNumCheque() != null && this.getPpaNumCheque().longValue() == -999) {
            conditions += " AND PPA_NUM_CHEQUE IS NULL";
        } else if (this.getPpaNumCheque() != null) {
            conditions += " AND PPA_NUM_CHEQUE = ?";
            values.add(this.getPpaNumCheque());
        }

        if (this.getPpaImpCheque() != null && this.getPpaImpCheque().longValue() == -999) {
            conditions += " AND PPA_IMP_CHEQUE IS NULL";
        } else if (this.getPpaImpCheque() != null) {
            conditions += " AND PPA_IMP_CHEQUE = ?";
            values.add(this.getPpaImpCheque());
        }

        if (this.getPpaAnoAltaReg() != null && this.getPpaAnoAltaReg().longValue() == -999) {
            conditions += " AND PPA_ANO_ALTA_REG IS NULL";
        } else if (this.getPpaAnoAltaReg() != null) {
            conditions += " AND PPA_ANO_ALTA_REG = ?";
            values.add(this.getPpaAnoAltaReg());
        }

        if (this.getPpaMesAltaReg() != null && this.getPpaMesAltaReg().longValue() == -999) {
            conditions += " AND PPA_MES_ALTA_REG IS NULL";
        } else if (this.getPpaMesAltaReg() != null) {
            conditions += " AND PPA_MES_ALTA_REG = ?";
            values.add(this.getPpaMesAltaReg());
        }

        if (this.getPpaDiaAltaReg() != null && this.getPpaDiaAltaReg().longValue() == -999) {
            conditions += " AND PPA_DIA_ALTA_REG IS NULL";
        } else if (this.getPpaDiaAltaReg() != null) {
            conditions += " AND PPA_DIA_ALTA_REG = ?";
            values.add(this.getPpaDiaAltaReg());
        }

        if (this.getPpaAnoUltMod() != null && this.getPpaAnoUltMod().longValue() == -999) {
            conditions += " AND PPA_ANO_ULT_MOD IS NULL";
        } else if (this.getPpaAnoUltMod() != null) {
            conditions += " AND PPA_ANO_ULT_MOD = ?";
            values.add(this.getPpaAnoUltMod());
        }

        if (this.getPpaMesUltMod() != null && this.getPpaMesUltMod().longValue() == -999) {
            conditions += " AND PPA_MES_ULT_MOD IS NULL";
        } else if (this.getPpaMesUltMod() != null) {
            conditions += " AND PPA_MES_ULT_MOD = ?";
            values.add(this.getPpaMesUltMod());
        }

        if (this.getPpaDiaUltMod() != null && this.getPpaDiaUltMod().longValue() == -999) {
            conditions += " AND PPA_DIA_ULT_MOD IS NULL";
        } else if (this.getPpaDiaUltMod() != null) {
            conditions += " AND PPA_DIA_ULT_MOD = ?";
            values.add(this.getPpaDiaUltMod());
        }

        if (this.getPpaCveStPgospar() != null && "null".equals(this.getPpaCveStPgospar())) {
            conditions += " AND PPA_CVE_ST_PGOSPAR IS NULL";
        } else if (this.getPpaCveStPgospar() != null) {
            conditions += " AND PPA_CVE_ST_PGOSPAR = ?";
            values.add(this.getPpaCveStPgospar());
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
        String sql = "UPDATE PAGOSPAR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PPA_NUM_CONTRATO = ?";
        pkValues.add(this.getPpaNumContrato());
        conditions += " AND PPA_NUM_DEPTO = ?";
        pkValues.add(this.getPpaNumDepto());
        conditions += " AND PPA_NUM_PARTICIP = ?";
        pkValues.add(this.getPpaNumParticip());
        fields += " PPA_FECHA_PAGO = ?, ";
        values.add(this.getPpaFechaPago());
        fields += " PPA_IMP_APORT_PART = ?, ";
        values.add(this.getPpaImpAportPart());
        fields += " PPA_IMP_INTER_PART = ?, ";
        values.add(this.getPpaImpInterPart());
        fields += " PPA_IMP_APORT_EMP = ?, ";
        values.add(this.getPpaImpAportEmp());
        fields += " PPA_IMP_INTER_EMP = ?, ";
        values.add(this.getPpaImpInterEmp());
        fields += " PPA_NUM_BANCO = ?, ";
        values.add(this.getPpaNumBanco());
        fields += " PPA_NUM_SUCURSAL = ?, ";
        values.add(this.getPpaNumSucursal());
        fields += " PPA_CVE_TIPO_CTA = ?, ";
        values.add(this.getPpaCveTipoCta());
        fields += " PPA_NUM_CUENTA = ?, ";
        values.add(this.getPpaNumCuenta());
        fields += " PPA_NUM_CHEQUE = ?, ";
        values.add(this.getPpaNumCheque());
        fields += " PPA_IMP_CHEQUE = ?, ";
        values.add(this.getPpaImpCheque());
        fields += " PPA_ANO_ALTA_REG = ?, ";
        values.add(this.getPpaAnoAltaReg());
        fields += " PPA_MES_ALTA_REG = ?, ";
        values.add(this.getPpaMesAltaReg());
        fields += " PPA_DIA_ALTA_REG = ?, ";
        values.add(this.getPpaDiaAltaReg());
        fields += " PPA_ANO_ULT_MOD = ?, ";
        values.add(this.getPpaAnoUltMod());
        fields += " PPA_MES_ULT_MOD = ?, ";
        values.add(this.getPpaMesUltMod());
        fields += " PPA_DIA_ULT_MOD = ?, ";
        values.add(this.getPpaDiaUltMod());
        fields += " PPA_CVE_ST_PGOSPAR = ?, ";
        values.add(this.getPpaCveStPgospar());
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
        String sql = "INSERT INTO PAGOSPAR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PPA_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPpaNumContrato());

        fields += ", PPA_NUM_DEPTO";
        fieldValues += ", ?";
        values.add(this.getPpaNumDepto());

        fields += ", PPA_NUM_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getPpaNumParticip());

        fields += ", PPA_FECHA_PAGO";
        fieldValues += ", ?";
        values.add(this.getPpaFechaPago());

        fields += ", PPA_IMP_APORT_PART";
        fieldValues += ", ?";
        values.add(this.getPpaImpAportPart());

        fields += ", PPA_IMP_INTER_PART";
        fieldValues += ", ?";
        values.add(this.getPpaImpInterPart());

        fields += ", PPA_IMP_APORT_EMP";
        fieldValues += ", ?";
        values.add(this.getPpaImpAportEmp());

        fields += ", PPA_IMP_INTER_EMP";
        fieldValues += ", ?";
        values.add(this.getPpaImpInterEmp());

        fields += ", PPA_NUM_BANCO";
        fieldValues += ", ?";
        values.add(this.getPpaNumBanco());

        fields += ", PPA_NUM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getPpaNumSucursal());

        fields += ", PPA_CVE_TIPO_CTA";
        fieldValues += ", ?";
        values.add(this.getPpaCveTipoCta());

        fields += ", PPA_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getPpaNumCuenta());

        fields += ", PPA_NUM_CHEQUE";
        fieldValues += ", ?";
        values.add(this.getPpaNumCheque());

        fields += ", PPA_IMP_CHEQUE";
        fieldValues += ", ?";
        values.add(this.getPpaImpCheque());

        fields += ", PPA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPpaAnoAltaReg());

        fields += ", PPA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPpaMesAltaReg());

        fields += ", PPA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPpaDiaAltaReg());

        fields += ", PPA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPpaAnoUltMod());

        fields += ", PPA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPpaMesUltMod());

        fields += ", PPA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPpaDiaUltMod());

        fields += ", PPA_CVE_ST_PGOSPAR";
        fieldValues += ", ?";
        values.add(this.getPpaCveStPgospar());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PAGOSPAR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PPA_NUM_CONTRATO = ?";
        values.add(this.getPpaNumContrato());
        conditions += " AND PPA_NUM_DEPTO = ?";
        values.add(this.getPpaNumDepto());
        conditions += " AND PPA_NUM_PARTICIP = ?";
        values.add(this.getPpaNumParticip());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Pagospar instance = (Pagospar) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPpaNumContrato().equals(instance.getPpaNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPpaNumDepto().equals(instance.getPpaNumDepto()))
            equalObjects = false;
        if (equalObjects && !this.getPpaNumParticip().equals(instance.getPpaNumParticip()))
            equalObjects = false;
        if (equalObjects && !this.getPpaFechaPago().equals(instance.getPpaFechaPago()))
            equalObjects = false;
        if (equalObjects && !this.getPpaImpAportPart().equals(instance.getPpaImpAportPart()))
            equalObjects = false;
        if (equalObjects && !this.getPpaImpInterPart().equals(instance.getPpaImpInterPart()))
            equalObjects = false;
        if (equalObjects && !this.getPpaImpAportEmp().equals(instance.getPpaImpAportEmp()))
            equalObjects = false;
        if (equalObjects && !this.getPpaImpInterEmp().equals(instance.getPpaImpInterEmp()))
            equalObjects = false;
        if (equalObjects && !this.getPpaNumBanco().equals(instance.getPpaNumBanco()))
            equalObjects = false;
        if (equalObjects && !this.getPpaNumSucursal().equals(instance.getPpaNumSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getPpaCveTipoCta().equals(instance.getPpaCveTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getPpaNumCuenta().equals(instance.getPpaNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getPpaNumCheque().equals(instance.getPpaNumCheque()))
            equalObjects = false;
        if (equalObjects && !this.getPpaImpCheque().equals(instance.getPpaImpCheque()))
            equalObjects = false;
        if (equalObjects && !this.getPpaAnoAltaReg().equals(instance.getPpaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPpaMesAltaReg().equals(instance.getPpaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPpaDiaAltaReg().equals(instance.getPpaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPpaAnoUltMod().equals(instance.getPpaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPpaMesUltMod().equals(instance.getPpaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPpaDiaUltMod().equals(instance.getPpaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPpaCveStPgospar().equals(instance.getPpaCveStPgospar()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Pagospar result = new Pagospar();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPpaNumContrato((BigDecimal) objectData.getData("PPA_NUM_CONTRATO"));
        result.setPpaNumDepto((BigDecimal) objectData.getData("PPA_NUM_DEPTO"));
        result.setPpaNumParticip((BigDecimal) objectData.getData("PPA_NUM_PARTICIP"));
        result.setPpaFechaPago((String) objectData.getData("PPA_FECHA_PAGO"));
        result.setPpaImpAportPart((BigDecimal) objectData.getData("PPA_IMP_APORT_PART"));
        result.setPpaImpInterPart((BigDecimal) objectData.getData("PPA_IMP_INTER_PART"));
        result.setPpaImpAportEmp((BigDecimal) objectData.getData("PPA_IMP_APORT_EMP"));
        result.setPpaImpInterEmp((BigDecimal) objectData.getData("PPA_IMP_INTER_EMP"));
        result.setPpaNumBanco((BigDecimal) objectData.getData("PPA_NUM_BANCO"));
        result.setPpaNumSucursal((BigDecimal) objectData.getData("PPA_NUM_SUCURSAL"));
        result.setPpaCveTipoCta((String) objectData.getData("PPA_CVE_TIPO_CTA"));
        result.setPpaNumCuenta((BigDecimal) objectData.getData("PPA_NUM_CUENTA"));
        result.setPpaNumCheque((BigDecimal) objectData.getData("PPA_NUM_CHEQUE"));
        result.setPpaImpCheque((BigDecimal) objectData.getData("PPA_IMP_CHEQUE"));
        result.setPpaAnoAltaReg((BigDecimal) objectData.getData("PPA_ANO_ALTA_REG"));
        result.setPpaMesAltaReg((BigDecimal) objectData.getData("PPA_MES_ALTA_REG"));
        result.setPpaDiaAltaReg((BigDecimal) objectData.getData("PPA_DIA_ALTA_REG"));
        result.setPpaAnoUltMod((BigDecimal) objectData.getData("PPA_ANO_ULT_MOD"));
        result.setPpaMesUltMod((BigDecimal) objectData.getData("PPA_MES_ULT_MOD"));
        result.setPpaDiaUltMod((BigDecimal) objectData.getData("PPA_DIA_ULT_MOD"));
        result.setPpaCveStPgospar((String) objectData.getData("PPA_CVE_ST_PGOSPAR"));

        return result;

    }

}
