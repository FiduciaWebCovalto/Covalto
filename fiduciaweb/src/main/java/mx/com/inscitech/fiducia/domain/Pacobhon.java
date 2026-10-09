package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PACOBHON_PK", columns = { "PCH_NUM_CONTRATO", "PCH_SUB_CONTRATO", "PCH_NUM_PERS_FID", "PCH_TIPO_PERS_FID" }, sequences = { "MANUAL" })
public class Pacobhon extends DomainObject {

    BigDecimal pchNumContrato = null;
    BigDecimal pchSubContrato = null;
    String pchTipoPersFid = null;
    BigDecimal pchNumPersFid = null;
    BigDecimal pchBenefXtercer = null;
    BigDecimal pchCveTipoLiq = null;
    BigDecimal pchNumMoneda = null;
    String pchCveTipoCta = null;
    BigDecimal pchNumBanco = null;
    BigDecimal pchNumPlaza = null;
    String pchNomPlaza = null;
    BigDecimal pchNumSucursal = null;
    BigDecimal pchNumCuenta = null;
    BigDecimal pchNumPais = null;
    BigDecimal pchNumCheque = null;
    BigDecimal pchCtaBanxico = null;
    String pchDirAperCta = null;
    String pchCodigoTrans = null;
    BigDecimal pchNumIniciativa = null;
    BigDecimal pchNumCtam = null;
    BigDecimal pchNumScta = null;
    BigDecimal pchNumSscta = null;
    BigDecimal pchNumSsscta = null;
    String pchNomArea = null;
    String pchConcepto = null;
    BigDecimal pchAnoAltaReg = null;
    BigDecimal pchMesAltaReg = null;
    BigDecimal pchDiaAltaReg = null;
    BigDecimal pchAnoUltMod = null;
    BigDecimal pchMesUltMod = null;
    BigDecimal pchDiaUltMod = null;
    String pchCveStPacobho = null;

    public Pacobhon() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumContrato(BigDecimal pchNumContrato) {
        this.pchNumContrato = pchNumContrato;
    }

    public BigDecimal getPchNumContrato() {
        return this.pchNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchSubContrato(BigDecimal pchSubContrato) {
        this.pchSubContrato = pchSubContrato;
    }

    public BigDecimal getPchSubContrato() {
        return this.pchSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPchTipoPersFid(String pchTipoPersFid) {
        this.pchTipoPersFid = pchTipoPersFid;
    }

    public String getPchTipoPersFid() {
        return this.pchTipoPersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumPersFid(BigDecimal pchNumPersFid) {
        this.pchNumPersFid = pchNumPersFid;
    }

    public BigDecimal getPchNumPersFid() {
        return this.pchNumPersFid;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchBenefXtercer(BigDecimal pchBenefXtercer) {
        this.pchBenefXtercer = pchBenefXtercer;
    }

    public BigDecimal getPchBenefXtercer() {
        return this.pchBenefXtercer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPchCveTipoLiq(BigDecimal pchCveTipoLiq) {
        this.pchCveTipoLiq = pchCveTipoLiq;
    }

    public BigDecimal getPchCveTipoLiq() {
        return this.pchCveTipoLiq;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumMoneda(BigDecimal pchNumMoneda) {
        this.pchNumMoneda = pchNumMoneda;
    }

    public BigDecimal getPchNumMoneda() {
        return this.pchNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPchCveTipoCta(String pchCveTipoCta) {
        this.pchCveTipoCta = pchCveTipoCta;
    }

    public String getPchCveTipoCta() {
        return this.pchCveTipoCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumBanco(BigDecimal pchNumBanco) {
        this.pchNumBanco = pchNumBanco;
    }

    public BigDecimal getPchNumBanco() {
        return this.pchNumBanco;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumPlaza(BigDecimal pchNumPlaza) {
        this.pchNumPlaza = pchNumPlaza;
    }

    public BigDecimal getPchNumPlaza() {
        return this.pchNumPlaza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPchNomPlaza(String pchNomPlaza) {
        this.pchNomPlaza = pchNomPlaza;
    }

    public String getPchNomPlaza() {
        return this.pchNomPlaza;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumSucursal(BigDecimal pchNumSucursal) {
        this.pchNumSucursal = pchNumSucursal;
    }

    public BigDecimal getPchNumSucursal() {
        return this.pchNumSucursal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumCuenta(BigDecimal pchNumCuenta) {
        this.pchNumCuenta = pchNumCuenta;
    }

    public BigDecimal getPchNumCuenta() {
        return this.pchNumCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumPais(BigDecimal pchNumPais) {
        this.pchNumPais = pchNumPais;
    }

    public BigDecimal getPchNumPais() {
        return this.pchNumPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumCheque(BigDecimal pchNumCheque) {
        this.pchNumCheque = pchNumCheque;
    }

    public BigDecimal getPchNumCheque() {
        return this.pchNumCheque;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setPchCtaBanxico(BigDecimal pchCtaBanxico) {
        this.pchCtaBanxico = pchCtaBanxico;
    }

    public BigDecimal getPchCtaBanxico() {
        return this.pchCtaBanxico;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPchDirAperCta(String pchDirAperCta) {
        this.pchDirAperCta = pchDirAperCta;
    }

    public String getPchDirAperCta() {
        return this.pchDirAperCta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPchCodigoTrans(String pchCodigoTrans) {
        this.pchCodigoTrans = pchCodigoTrans;
    }

    public String getPchCodigoTrans() {
        return this.pchCodigoTrans;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumIniciativa(BigDecimal pchNumIniciativa) {
        this.pchNumIniciativa = pchNumIniciativa;
    }

    public BigDecimal getPchNumIniciativa() {
        return this.pchNumIniciativa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumCtam(BigDecimal pchNumCtam) {
        this.pchNumCtam = pchNumCtam;
    }

    public BigDecimal getPchNumCtam() {
        return this.pchNumCtam;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumScta(BigDecimal pchNumScta) {
        this.pchNumScta = pchNumScta;
    }

    public BigDecimal getPchNumScta() {
        return this.pchNumScta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumSscta(BigDecimal pchNumSscta) {
        this.pchNumSscta = pchNumSscta;
    }

    public BigDecimal getPchNumSscta() {
        return this.pchNumSscta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPchNumSsscta(BigDecimal pchNumSsscta) {
        this.pchNumSsscta = pchNumSsscta;
    }

    public BigDecimal getPchNumSsscta() {
        return this.pchNumSsscta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPchNomArea(String pchNomArea) {
        this.pchNomArea = pchNomArea;
    }

    public String getPchNomArea() {
        return this.pchNomArea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPchConcepto(String pchConcepto) {
        this.pchConcepto = pchConcepto;
    }

    public String getPchConcepto() {
        return this.pchConcepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPchAnoAltaReg(BigDecimal pchAnoAltaReg) {
        this.pchAnoAltaReg = pchAnoAltaReg;
    }

    public BigDecimal getPchAnoAltaReg() {
        return this.pchAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPchMesAltaReg(BigDecimal pchMesAltaReg) {
        this.pchMesAltaReg = pchMesAltaReg;
    }

    public BigDecimal getPchMesAltaReg() {
        return this.pchMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPchDiaAltaReg(BigDecimal pchDiaAltaReg) {
        this.pchDiaAltaReg = pchDiaAltaReg;
    }

    public BigDecimal getPchDiaAltaReg() {
        return this.pchDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPchAnoUltMod(BigDecimal pchAnoUltMod) {
        this.pchAnoUltMod = pchAnoUltMod;
    }

    public BigDecimal getPchAnoUltMod() {
        return this.pchAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPchMesUltMod(BigDecimal pchMesUltMod) {
        this.pchMesUltMod = pchMesUltMod;
    }

    public BigDecimal getPchMesUltMod() {
        return this.pchMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPchDiaUltMod(BigDecimal pchDiaUltMod) {
        this.pchDiaUltMod = pchDiaUltMod;
    }

    public BigDecimal getPchDiaUltMod() {
        return this.pchDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPchCveStPacobho(String pchCveStPacobho) {
        this.pchCveStPacobho = pchCveStPacobho;
    }

    public String getPchCveStPacobho() {
        return this.pchCveStPacobho;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PACOBHON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPchNumContrato() != null && this.getPchNumContrato().longValue() == -999) {
            conditions += " AND PCH_NUM_CONTRATO IS NULL";
        } else if (this.getPchNumContrato() != null) {
            conditions += " AND PCH_NUM_CONTRATO = ?";
            values.add(this.getPchNumContrato());
        }

        if (this.getPchSubContrato() != null && this.getPchSubContrato().longValue() == -999) {
            conditions += " AND PCH_SUB_CONTRATO IS NULL";
        } else if (this.getPchSubContrato() != null) {
            conditions += " AND PCH_SUB_CONTRATO = ?";
            values.add(this.getPchSubContrato());
        }

        if (this.getPchTipoPersFid() != null && "null".equals(this.getPchTipoPersFid())) {
            conditions += " AND PCH_TIPO_PERS_FID IS NULL";
        } else if (this.getPchTipoPersFid() != null) {
            conditions += " AND PCH_TIPO_PERS_FID = ?";
            values.add(this.getPchTipoPersFid());
        }

        if (this.getPchNumPersFid() != null && this.getPchNumPersFid().longValue() == -999) {
            conditions += " AND PCH_NUM_PERS_FID IS NULL";
        } else if (this.getPchNumPersFid() != null) {
            conditions += " AND PCH_NUM_PERS_FID = ?";
            values.add(this.getPchNumPersFid());
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
        String sql = "SELECT * FROM PACOBHON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPchNumContrato() != null && this.getPchNumContrato().longValue() == -999) {
            conditions += " AND PCH_NUM_CONTRATO IS NULL";
        } else if (this.getPchNumContrato() != null) {
            conditions += " AND PCH_NUM_CONTRATO = ?";
            values.add(this.getPchNumContrato());
        }

        if (this.getPchSubContrato() != null && this.getPchSubContrato().longValue() == -999) {
            conditions += " AND PCH_SUB_CONTRATO IS NULL";
        } else if (this.getPchSubContrato() != null) {
            conditions += " AND PCH_SUB_CONTRATO = ?";
            values.add(this.getPchSubContrato());
        }

        if (this.getPchTipoPersFid() != null && "null".equals(this.getPchTipoPersFid())) {
            conditions += " AND PCH_TIPO_PERS_FID IS NULL";
        } else if (this.getPchTipoPersFid() != null) {
            conditions += " AND PCH_TIPO_PERS_FID = ?";
            values.add(this.getPchTipoPersFid());
        }

        if (this.getPchNumPersFid() != null && this.getPchNumPersFid().longValue() == -999) {
            conditions += " AND PCH_NUM_PERS_FID IS NULL";
        } else if (this.getPchNumPersFid() != null) {
            conditions += " AND PCH_NUM_PERS_FID = ?";
            values.add(this.getPchNumPersFid());
        }

        if (this.getPchBenefXtercer() != null && this.getPchBenefXtercer().longValue() == -999) {
            conditions += " AND PCH_BENEF_XTERCER IS NULL";
        } else if (this.getPchBenefXtercer() != null) {
            conditions += " AND PCH_BENEF_XTERCER = ?";
            values.add(this.getPchBenefXtercer());
        }

        if (this.getPchCveTipoLiq() != null && this.getPchCveTipoLiq().longValue() == -999) {
            conditions += " AND PCH_CVE_TIPO_LIQ IS NULL";
        } else if (this.getPchCveTipoLiq() != null) {
            conditions += " AND PCH_CVE_TIPO_LIQ = ?";
            values.add(this.getPchCveTipoLiq());
        }

        if (this.getPchNumMoneda() != null && this.getPchNumMoneda().longValue() == -999) {
            conditions += " AND PCH_NUM_MONEDA IS NULL";
        } else if (this.getPchNumMoneda() != null) {
            conditions += " AND PCH_NUM_MONEDA = ?";
            values.add(this.getPchNumMoneda());
        }

        if (this.getPchCveTipoCta() != null && "null".equals(this.getPchCveTipoCta())) {
            conditions += " AND PCH_CVE_TIPO_CTA IS NULL";
        } else if (this.getPchCveTipoCta() != null) {
            conditions += " AND PCH_CVE_TIPO_CTA = ?";
            values.add(this.getPchCveTipoCta());
        }

        if (this.getPchNumBanco() != null && this.getPchNumBanco().longValue() == -999) {
            conditions += " AND PCH_NUM_BANCO IS NULL";
        } else if (this.getPchNumBanco() != null) {
            conditions += " AND PCH_NUM_BANCO = ?";
            values.add(this.getPchNumBanco());
        }

        if (this.getPchNumPlaza() != null && this.getPchNumPlaza().longValue() == -999) {
            conditions += " AND PCH_NUM_PLAZA IS NULL";
        } else if (this.getPchNumPlaza() != null) {
            conditions += " AND PCH_NUM_PLAZA = ?";
            values.add(this.getPchNumPlaza());
        }

        if (this.getPchNomPlaza() != null && "null".equals(this.getPchNomPlaza())) {
            conditions += " AND PCH_NOM_PLAZA IS NULL";
        } else if (this.getPchNomPlaza() != null) {
            conditions += " AND PCH_NOM_PLAZA = ?";
            values.add(this.getPchNomPlaza());
        }

        if (this.getPchNumSucursal() != null && this.getPchNumSucursal().longValue() == -999) {
            conditions += " AND PCH_NUM_SUCURSAL IS NULL";
        } else if (this.getPchNumSucursal() != null) {
            conditions += " AND PCH_NUM_SUCURSAL = ?";
            values.add(this.getPchNumSucursal());
        }

        if (this.getPchNumCuenta() != null && this.getPchNumCuenta().longValue() == -999) {
            conditions += " AND PCH_NUM_CUENTA IS NULL";
        } else if (this.getPchNumCuenta() != null) {
            conditions += " AND PCH_NUM_CUENTA = ?";
            values.add(this.getPchNumCuenta());
        }

        if (this.getPchNumPais() != null && this.getPchNumPais().longValue() == -999) {
            conditions += " AND PCH_NUM_PAIS IS NULL";
        } else if (this.getPchNumPais() != null) {
            conditions += " AND PCH_NUM_PAIS = ?";
            values.add(this.getPchNumPais());
        }

        if (this.getPchNumCheque() != null && this.getPchNumCheque().longValue() == -999) {
            conditions += " AND PCH_NUM_CHEQUE IS NULL";
        } else if (this.getPchNumCheque() != null) {
            conditions += " AND PCH_NUM_CHEQUE = ?";
            values.add(this.getPchNumCheque());
        }

        if (this.getPchCtaBanxico() != null && this.getPchCtaBanxico().longValue() == -999) {
            conditions += " AND PCH_CTA_BANXICO IS NULL";
        } else if (this.getPchCtaBanxico() != null) {
            conditions += " AND PCH_CTA_BANXICO = ?";
            values.add(this.getPchCtaBanxico());
        }

        if (this.getPchDirAperCta() != null && "null".equals(this.getPchDirAperCta())) {
            conditions += " AND PCH_DIR_APER_CTA IS NULL";
        } else if (this.getPchDirAperCta() != null) {
            conditions += " AND PCH_DIR_APER_CTA = ?";
            values.add(this.getPchDirAperCta());
        }

        if (this.getPchCodigoTrans() != null && "null".equals(this.getPchCodigoTrans())) {
            conditions += " AND PCH_CODIGO_TRANS IS NULL";
        } else if (this.getPchCodigoTrans() != null) {
            conditions += " AND PCH_CODIGO_TRANS = ?";
            values.add(this.getPchCodigoTrans());
        }

        if (this.getPchNumIniciativa() != null && this.getPchNumIniciativa().longValue() == -999) {
            conditions += " AND PCH_NUM_INICIATIVA IS NULL";
        } else if (this.getPchNumIniciativa() != null) {
            conditions += " AND PCH_NUM_INICIATIVA = ?";
            values.add(this.getPchNumIniciativa());
        }

        if (this.getPchNumCtam() != null && this.getPchNumCtam().longValue() == -999) {
            conditions += " AND PCH_NUM_CTAM IS NULL";
        } else if (this.getPchNumCtam() != null) {
            conditions += " AND PCH_NUM_CTAM = ?";
            values.add(this.getPchNumCtam());
        }

        if (this.getPchNumScta() != null && this.getPchNumScta().longValue() == -999) {
            conditions += " AND PCH_NUM_SCTA IS NULL";
        } else if (this.getPchNumScta() != null) {
            conditions += " AND PCH_NUM_SCTA = ?";
            values.add(this.getPchNumScta());
        }

        if (this.getPchNumSscta() != null && this.getPchNumSscta().longValue() == -999) {
            conditions += " AND PCH_NUM_SSCTA IS NULL";
        } else if (this.getPchNumSscta() != null) {
            conditions += " AND PCH_NUM_SSCTA = ?";
            values.add(this.getPchNumSscta());
        }

        if (this.getPchNumSsscta() != null && this.getPchNumSsscta().longValue() == -999) {
            conditions += " AND PCH_NUM_SSSCTA IS NULL";
        } else if (this.getPchNumSsscta() != null) {
            conditions += " AND PCH_NUM_SSSCTA = ?";
            values.add(this.getPchNumSsscta());
        }

        if (this.getPchNomArea() != null && "null".equals(this.getPchNomArea())) {
            conditions += " AND PCH_NOM_AREA IS NULL";
        } else if (this.getPchNomArea() != null) {
            conditions += " AND PCH_NOM_AREA = ?";
            values.add(this.getPchNomArea());
        }

        if (this.getPchConcepto() != null && "null".equals(this.getPchConcepto())) {
            conditions += " AND PCH_CONCEPTO IS NULL";
        } else if (this.getPchConcepto() != null) {
            conditions += " AND PCH_CONCEPTO = ?";
            values.add(this.getPchConcepto());
        }

        if (this.getPchAnoAltaReg() != null && this.getPchAnoAltaReg().longValue() == -999) {
            conditions += " AND PCH_ANO_ALTA_REG IS NULL";
        } else if (this.getPchAnoAltaReg() != null) {
            conditions += " AND PCH_ANO_ALTA_REG = ?";
            values.add(this.getPchAnoAltaReg());
        }

        if (this.getPchMesAltaReg() != null && this.getPchMesAltaReg().longValue() == -999) {
            conditions += " AND PCH_MES_ALTA_REG IS NULL";
        } else if (this.getPchMesAltaReg() != null) {
            conditions += " AND PCH_MES_ALTA_REG = ?";
            values.add(this.getPchMesAltaReg());
        }

        if (this.getPchDiaAltaReg() != null && this.getPchDiaAltaReg().longValue() == -999) {
            conditions += " AND PCH_DIA_ALTA_REG IS NULL";
        } else if (this.getPchDiaAltaReg() != null) {
            conditions += " AND PCH_DIA_ALTA_REG = ?";
            values.add(this.getPchDiaAltaReg());
        }

        if (this.getPchAnoUltMod() != null && this.getPchAnoUltMod().longValue() == -999) {
            conditions += " AND PCH_ANO_ULT_MOD IS NULL";
        } else if (this.getPchAnoUltMod() != null) {
            conditions += " AND PCH_ANO_ULT_MOD = ?";
            values.add(this.getPchAnoUltMod());
        }

        if (this.getPchMesUltMod() != null && this.getPchMesUltMod().longValue() == -999) {
            conditions += " AND PCH_MES_ULT_MOD IS NULL";
        } else if (this.getPchMesUltMod() != null) {
            conditions += " AND PCH_MES_ULT_MOD = ?";
            values.add(this.getPchMesUltMod());
        }

        if (this.getPchDiaUltMod() != null && this.getPchDiaUltMod().longValue() == -999) {
            conditions += " AND PCH_DIA_ULT_MOD IS NULL";
        } else if (this.getPchDiaUltMod() != null) {
            conditions += " AND PCH_DIA_ULT_MOD = ?";
            values.add(this.getPchDiaUltMod());
        }

        if (this.getPchCveStPacobho() != null && "null".equals(this.getPchCveStPacobho())) {
            conditions += " AND PCH_CVE_ST_PACOBHO IS NULL";
        } else if (this.getPchCveStPacobho() != null) {
            conditions += " AND PCH_CVE_ST_PACOBHO = ?";
            values.add(this.getPchCveStPacobho());
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
        String sql = "UPDATE PACOBHON SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PCH_NUM_CONTRATO = ?";
        pkValues.add(this.getPchNumContrato());
        conditions += " AND PCH_SUB_CONTRATO = ?";
        pkValues.add(this.getPchSubContrato());
        conditions += " AND PCH_TIPO_PERS_FID = ?";
        pkValues.add(this.getPchTipoPersFid());
        conditions += " AND PCH_NUM_PERS_FID = ?";
        pkValues.add(this.getPchNumPersFid());
        fields += " PCH_BENEF_XTERCER = ?, ";
        values.add(this.getPchBenefXtercer());
        fields += " PCH_CVE_TIPO_LIQ = ?, ";
        values.add(this.getPchCveTipoLiq());
        fields += " PCH_NUM_MONEDA = ?, ";
        values.add(this.getPchNumMoneda());
        fields += " PCH_CVE_TIPO_CTA = ?, ";
        values.add(this.getPchCveTipoCta());
        fields += " PCH_NUM_BANCO = ?, ";
        values.add(this.getPchNumBanco());
        fields += " PCH_NUM_PLAZA = ?, ";
        values.add(this.getPchNumPlaza());
        fields += " PCH_NOM_PLAZA = ?, ";
        values.add(this.getPchNomPlaza());
        fields += " PCH_NUM_SUCURSAL = ?, ";
        values.add(this.getPchNumSucursal());
        fields += " PCH_NUM_CUENTA = ?, ";
        values.add(this.getPchNumCuenta());
        fields += " PCH_NUM_PAIS = ?, ";
        values.add(this.getPchNumPais());
        fields += " PCH_NUM_CHEQUE = ?, ";
        values.add(this.getPchNumCheque());
        fields += " PCH_CTA_BANXICO = ?, ";
        values.add(this.getPchCtaBanxico());
        fields += " PCH_DIR_APER_CTA = ?, ";
        values.add(this.getPchDirAperCta());
        fields += " PCH_CODIGO_TRANS = ?, ";
        values.add(this.getPchCodigoTrans());
        fields += " PCH_NUM_INICIATIVA = ?, ";
        values.add(this.getPchNumIniciativa());
        fields += " PCH_NUM_CTAM = ?, ";
        values.add(this.getPchNumCtam());
        fields += " PCH_NUM_SCTA = ?, ";
        values.add(this.getPchNumScta());
        fields += " PCH_NUM_SSCTA = ?, ";
        values.add(this.getPchNumSscta());
        fields += " PCH_NUM_SSSCTA = ?, ";
        values.add(this.getPchNumSsscta());
        fields += " PCH_NOM_AREA = ?, ";
        values.add(this.getPchNomArea());
        fields += " PCH_CONCEPTO = ?, ";
        values.add(this.getPchConcepto());
        fields += " PCH_ANO_ALTA_REG = ?, ";
        values.add(this.getPchAnoAltaReg());
        fields += " PCH_MES_ALTA_REG = ?, ";
        values.add(this.getPchMesAltaReg());
        fields += " PCH_DIA_ALTA_REG = ?, ";
        values.add(this.getPchDiaAltaReg());
        fields += " PCH_ANO_ULT_MOD = ?, ";
        values.add(this.getPchAnoUltMod());
        fields += " PCH_MES_ULT_MOD = ?, ";
        values.add(this.getPchMesUltMod());
        fields += " PCH_DIA_ULT_MOD = ?, ";
        values.add(this.getPchDiaUltMod());
        fields += " PCH_CVE_ST_PACOBHO = ?, ";
        values.add(this.getPchCveStPacobho());
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
        String sql = "INSERT INTO PACOBHON ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PCH_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPchNumContrato());

        fields += ", PCH_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPchSubContrato());

        fields += ", PCH_TIPO_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getPchTipoPersFid());

        fields += ", PCH_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getPchNumPersFid());

        fields += ", PCH_BENEF_XTERCER";
        fieldValues += ", ?";
        values.add(this.getPchBenefXtercer());

        fields += ", PCH_CVE_TIPO_LIQ";
        fieldValues += ", ?";
        values.add(this.getPchCveTipoLiq());

        fields += ", PCH_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getPchNumMoneda());

        fields += ", PCH_CVE_TIPO_CTA";
        fieldValues += ", ?";
        values.add(this.getPchCveTipoCta());

        fields += ", PCH_NUM_BANCO";
        fieldValues += ", ?";
        values.add(this.getPchNumBanco());

        fields += ", PCH_NUM_PLAZA";
        fieldValues += ", ?";
        values.add(this.getPchNumPlaza());

        fields += ", PCH_NOM_PLAZA";
        fieldValues += ", ?";
        values.add(this.getPchNomPlaza());

        fields += ", PCH_NUM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getPchNumSucursal());

        fields += ", PCH_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getPchNumCuenta());

        fields += ", PCH_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getPchNumPais());

        fields += ", PCH_NUM_CHEQUE";
        fieldValues += ", ?";
        values.add(this.getPchNumCheque());

        fields += ", PCH_CTA_BANXICO";
        fieldValues += ", ?";
        values.add(this.getPchCtaBanxico());

        fields += ", PCH_DIR_APER_CTA";
        fieldValues += ", ?";
        values.add(this.getPchDirAperCta());

        fields += ", PCH_CODIGO_TRANS";
        fieldValues += ", ?";
        values.add(this.getPchCodigoTrans());

        fields += ", PCH_NUM_INICIATIVA";
        fieldValues += ", ?";
        values.add(this.getPchNumIniciativa());

        fields += ", PCH_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getPchNumCtam());

        fields += ", PCH_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getPchNumScta());

        fields += ", PCH_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getPchNumSscta());

        fields += ", PCH_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getPchNumSsscta());

        fields += ", PCH_NOM_AREA";
        fieldValues += ", ?";
        values.add(this.getPchNomArea());

        fields += ", PCH_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getPchConcepto());

        fields += ", PCH_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPchAnoAltaReg());

        fields += ", PCH_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPchMesAltaReg());

        fields += ", PCH_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPchDiaAltaReg());

        fields += ", PCH_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPchAnoUltMod());

        fields += ", PCH_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPchMesUltMod());

        fields += ", PCH_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPchDiaUltMod());

        fields += ", PCH_CVE_ST_PACOBHO";
        fieldValues += ", ?";
        values.add(this.getPchCveStPacobho());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PACOBHON WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PCH_NUM_CONTRATO = ?";
        values.add(this.getPchNumContrato());
        conditions += " AND PCH_SUB_CONTRATO = ?";
        values.add(this.getPchSubContrato());
        conditions += " AND PCH_TIPO_PERS_FID = ?";
        values.add(this.getPchTipoPersFid());
        conditions += " AND PCH_NUM_PERS_FID = ?";
        values.add(this.getPchNumPersFid());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Pacobhon instance = (Pacobhon) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPchNumContrato().equals(instance.getPchNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPchSubContrato().equals(instance.getPchSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPchTipoPersFid().equals(instance.getPchTipoPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumPersFid().equals(instance.getPchNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getPchBenefXtercer().equals(instance.getPchBenefXtercer()))
            equalObjects = false;
        if (equalObjects && !this.getPchCveTipoLiq().equals(instance.getPchCveTipoLiq()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumMoneda().equals(instance.getPchNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getPchCveTipoCta().equals(instance.getPchCveTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumBanco().equals(instance.getPchNumBanco()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumPlaza().equals(instance.getPchNumPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getPchNomPlaza().equals(instance.getPchNomPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumSucursal().equals(instance.getPchNumSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumCuenta().equals(instance.getPchNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumPais().equals(instance.getPchNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumCheque().equals(instance.getPchNumCheque()))
            equalObjects = false;
        if (equalObjects && !this.getPchCtaBanxico().equals(instance.getPchCtaBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getPchDirAperCta().equals(instance.getPchDirAperCta()))
            equalObjects = false;
        if (equalObjects && !this.getPchCodigoTrans().equals(instance.getPchCodigoTrans()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumIniciativa().equals(instance.getPchNumIniciativa()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumCtam().equals(instance.getPchNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumScta().equals(instance.getPchNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumSscta().equals(instance.getPchNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getPchNumSsscta().equals(instance.getPchNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getPchNomArea().equals(instance.getPchNomArea()))
            equalObjects = false;
        if (equalObjects && !this.getPchConcepto().equals(instance.getPchConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getPchAnoAltaReg().equals(instance.getPchAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPchMesAltaReg().equals(instance.getPchMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPchDiaAltaReg().equals(instance.getPchDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPchAnoUltMod().equals(instance.getPchAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPchMesUltMod().equals(instance.getPchMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPchDiaUltMod().equals(instance.getPchDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPchCveStPacobho().equals(instance.getPchCveStPacobho()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Pacobhon result = new Pacobhon();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPchNumContrato((BigDecimal) objectData.getData("PCH_NUM_CONTRATO"));
        result.setPchSubContrato((BigDecimal) objectData.getData("PCH_SUB_CONTRATO"));
        result.setPchTipoPersFid((String) objectData.getData("PCH_TIPO_PERS_FID"));
        result.setPchNumPersFid((BigDecimal) objectData.getData("PCH_NUM_PERS_FID"));
        result.setPchBenefXtercer((BigDecimal) objectData.getData("PCH_BENEF_XTERCER"));
        result.setPchCveTipoLiq((BigDecimal) objectData.getData("PCH_CVE_TIPO_LIQ"));
        result.setPchNumMoneda((BigDecimal) objectData.getData("PCH_NUM_MONEDA"));
        result.setPchCveTipoCta((String) objectData.getData("PCH_CVE_TIPO_CTA"));
        result.setPchNumBanco((BigDecimal) objectData.getData("PCH_NUM_BANCO"));
        result.setPchNumPlaza((BigDecimal) objectData.getData("PCH_NUM_PLAZA"));
        result.setPchNomPlaza((String) objectData.getData("PCH_NOM_PLAZA"));
        result.setPchNumSucursal((BigDecimal) objectData.getData("PCH_NUM_SUCURSAL"));
        result.setPchNumCuenta((BigDecimal) objectData.getData("PCH_NUM_CUENTA"));
        result.setPchNumPais((BigDecimal) objectData.getData("PCH_NUM_PAIS"));
        result.setPchNumCheque((BigDecimal) objectData.getData("PCH_NUM_CHEQUE"));
        result.setPchCtaBanxico((BigDecimal) objectData.getData("PCH_CTA_BANXICO"));
        result.setPchDirAperCta((String) objectData.getData("PCH_DIR_APER_CTA"));
        result.setPchCodigoTrans((String) objectData.getData("PCH_CODIGO_TRANS"));
        result.setPchNumIniciativa((BigDecimal) objectData.getData("PCH_NUM_INICIATIVA"));
        result.setPchNumCtam((BigDecimal) objectData.getData("PCH_NUM_CTAM"));
        result.setPchNumScta((BigDecimal) objectData.getData("PCH_NUM_SCTA"));
        result.setPchNumSscta((BigDecimal) objectData.getData("PCH_NUM_SSCTA"));
        result.setPchNumSsscta((BigDecimal) objectData.getData("PCH_NUM_SSSCTA"));
        result.setPchNomArea((String) objectData.getData("PCH_NOM_AREA"));
        result.setPchConcepto((String) objectData.getData("PCH_CONCEPTO"));
        result.setPchAnoAltaReg((BigDecimal) objectData.getData("PCH_ANO_ALTA_REG"));
        result.setPchMesAltaReg((BigDecimal) objectData.getData("PCH_MES_ALTA_REG"));
        result.setPchDiaAltaReg((BigDecimal) objectData.getData("PCH_DIA_ALTA_REG"));
        result.setPchAnoUltMod((BigDecimal) objectData.getData("PCH_ANO_ULT_MOD"));
        result.setPchMesUltMod((BigDecimal) objectData.getData("PCH_MES_ULT_MOD"));
        result.setPchDiaUltMod((BigDecimal) objectData.getData("PCH_DIA_ULT_MOD"));
        result.setPchCveStPacobho((String) objectData.getData("PCH_CVE_ST_PACOBHO"));

        return result;

    }

}
