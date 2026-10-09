package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PALIQUID_PK", columns = { "PAL_CVE_APLICA_DAT", "PAL_CVE_PERS_FID", "PAL_NUM_CONTRATO", "PAL_NUM_PERS_FID" }, sequences = { "MANUAL" })
public class Paliquid extends DomainObject {

    BigDecimal palNumContrato = null;
    String palCvePersFid = null;
    BigDecimal palNumPersFid = null;
    String palCveAplicaDat = null;
    BigDecimal palCveTipoLiq = null;
    BigDecimal palNumMoneda = null;
    String palCveTipoCta = null;
    BigDecimal palNumBanco = null;
    BigDecimal palNumPlaza = null;
    BigDecimal palNumSucursal = null;
    String palNomSucursal = null;
    String palNumCuenta = null;
    BigDecimal palNumPais = null;
    BigDecimal palCtaBanxico = null;
    String palDirAperCta = null;
    String palCodigoTrans = null;
    BigDecimal palNumIniciativa = null;
    BigDecimal palNumCtam = null;
    BigDecimal palNumScta = null;
    BigDecimal palNumSscta = null;
    BigDecimal palNumSsscta = null;
    String palNomArea = null;
    String palConcepto = null;
    BigDecimal palCuentasOrden = null;
    BigDecimal palAnoAltaReg = null;
    BigDecimal palMesAltaReg = null;
    BigDecimal palDiaAltaReg = null;
    BigDecimal palAnoUltMod = null;
    BigDecimal palMesUltMod = null;
    BigDecimal palDiaUltMod = null;
    String palCveStPaliqui = null;

    public Paliquid() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumContrato(BigDecimal palNumContrato) {
        this.palNumContrato = palNumContrato;
    }

    public BigDecimal getPalNumContrato() {
        return this.palNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPalCvePersFid(String palCvePersFid) {
        this.palCvePersFid = palCvePersFid;
    }

    public String getPalCvePersFid() {
        return this.palCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumPersFid(BigDecimal palNumPersFid) {
        this.palNumPersFid = palNumPersFid;
    }

    public BigDecimal getPalNumPersFid() {
        return this.palNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPalCveAplicaDat(String palCveAplicaDat) {
        this.palCveAplicaDat = palCveAplicaDat;
    }

    public String getPalCveAplicaDat() {
        return this.palCveAplicaDat;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPalCveTipoLiq(BigDecimal palCveTipoLiq) {
        this.palCveTipoLiq = palCveTipoLiq;
    }

    public BigDecimal getPalCveTipoLiq() {
        return this.palCveTipoLiq;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumMoneda(BigDecimal palNumMoneda) {
        this.palNumMoneda = palNumMoneda;
    }

    public BigDecimal getPalNumMoneda() {
        return this.palNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPalCveTipoCta(String palCveTipoCta) {
        this.palCveTipoCta = palCveTipoCta;
    }

    public String getPalCveTipoCta() {
        return this.palCveTipoCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumBanco(BigDecimal palNumBanco) {
        this.palNumBanco = palNumBanco;
    }

    public BigDecimal getPalNumBanco() {
        return this.palNumBanco;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumPlaza(BigDecimal palNumPlaza) {
        this.palNumPlaza = palNumPlaza;
    }

    public BigDecimal getPalNumPlaza() {
        return this.palNumPlaza;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumSucursal(BigDecimal palNumSucursal) {
        this.palNumSucursal = palNumSucursal;
    }

    public BigDecimal getPalNumSucursal() {
        return this.palNumSucursal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPalNomSucursal(String palNomSucursal) {
        this.palNomSucursal = palNomSucursal;
    }

    public String getPalNomSucursal() {
        return this.palNomSucursal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPalNumCuenta(String palNumCuenta) {
        this.palNumCuenta = palNumCuenta;
    }

    public String getPalNumCuenta() {
        return this.palNumCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumPais(BigDecimal palNumPais) {
        this.palNumPais = palNumPais;
    }

    public BigDecimal getPalNumPais() {
        return this.palNumPais;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setPalCtaBanxico(BigDecimal palCtaBanxico) {
        this.palCtaBanxico = palCtaBanxico;
    }

    public BigDecimal getPalCtaBanxico() {
        return this.palCtaBanxico;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPalDirAperCta(String palDirAperCta) {
        this.palDirAperCta = palDirAperCta;
    }

    public String getPalDirAperCta() {
        return this.palDirAperCta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPalCodigoTrans(String palCodigoTrans) {
        this.palCodigoTrans = palCodigoTrans;
    }

    public String getPalCodigoTrans() {
        return this.palCodigoTrans;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumIniciativa(BigDecimal palNumIniciativa) {
        this.palNumIniciativa = palNumIniciativa;
    }

    public BigDecimal getPalNumIniciativa() {
        return this.palNumIniciativa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumCtam(BigDecimal palNumCtam) {
        this.palNumCtam = palNumCtam;
    }

    public BigDecimal getPalNumCtam() {
        return this.palNumCtam;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumScta(BigDecimal palNumScta) {
        this.palNumScta = palNumScta;
    }

    public BigDecimal getPalNumScta() {
        return this.palNumScta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumSscta(BigDecimal palNumSscta) {
        this.palNumSscta = palNumSscta;
    }

    public BigDecimal getPalNumSscta() {
        return this.palNumSscta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPalNumSsscta(BigDecimal palNumSsscta) {
        this.palNumSsscta = palNumSsscta;
    }

    public BigDecimal getPalNumSsscta() {
        return this.palNumSsscta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPalNomArea(String palNomArea) {
        this.palNomArea = palNomArea;
    }

    public String getPalNomArea() {
        return this.palNomArea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPalConcepto(String palConcepto) {
        this.palConcepto = palConcepto;
    }

    public String getPalConcepto() {
        return this.palConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPalCuentasOrden(BigDecimal palCuentasOrden) {
        this.palCuentasOrden = palCuentasOrden;
    }

    public BigDecimal getPalCuentasOrden() {
        return this.palCuentasOrden;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPalAnoAltaReg(BigDecimal palAnoAltaReg) {
        this.palAnoAltaReg = palAnoAltaReg;
    }

    public BigDecimal getPalAnoAltaReg() {
        return this.palAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPalMesAltaReg(BigDecimal palMesAltaReg) {
        this.palMesAltaReg = palMesAltaReg;
    }

    public BigDecimal getPalMesAltaReg() {
        return this.palMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPalDiaAltaReg(BigDecimal palDiaAltaReg) {
        this.palDiaAltaReg = palDiaAltaReg;
    }

    public BigDecimal getPalDiaAltaReg() {
        return this.palDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPalAnoUltMod(BigDecimal palAnoUltMod) {
        this.palAnoUltMod = palAnoUltMod;
    }

    public BigDecimal getPalAnoUltMod() {
        return this.palAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPalMesUltMod(BigDecimal palMesUltMod) {
        this.palMesUltMod = palMesUltMod;
    }

    public BigDecimal getPalMesUltMod() {
        return this.palMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPalDiaUltMod(BigDecimal palDiaUltMod) {
        this.palDiaUltMod = palDiaUltMod;
    }

    public BigDecimal getPalDiaUltMod() {
        return this.palDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPalCveStPaliqui(String palCveStPaliqui) {
        this.palCveStPaliqui = palCveStPaliqui;
    }

    public String getPalCveStPaliqui() {
        return this.palCveStPaliqui;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PALIQUID ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPalNumContrato() != null && this.getPalNumContrato().longValue() == -999) {
            conditions += " AND PAL_NUM_CONTRATO IS NULL";
        } else if (this.getPalNumContrato() != null) {
            conditions += " AND PAL_NUM_CONTRATO = ?";
            values.add(this.getPalNumContrato());
        }

        if (this.getPalCvePersFid() != null && "null".equals(this.getPalCvePersFid())) {
            conditions += " AND PAL_CVE_PERS_FID IS NULL";
        } else if (this.getPalCvePersFid() != null) {
            conditions += " AND PAL_CVE_PERS_FID = ?";
            values.add(this.getPalCvePersFid());
        }

        if (this.getPalNumPersFid() != null && this.getPalNumPersFid().longValue() == -999) {
            conditions += " AND PAL_NUM_PERS_FID IS NULL";
        } else if (this.getPalNumPersFid() != null) {
            conditions += " AND PAL_NUM_PERS_FID = ?";
            values.add(this.getPalNumPersFid());
        }

        if (this.getPalCveAplicaDat() != null && "null".equals(this.getPalCveAplicaDat())) {
            conditions += " AND PAL_CVE_APLICA_DAT IS NULL";
        } else if (this.getPalCveAplicaDat() != null) {
            conditions += " AND PAL_CVE_APLICA_DAT = ?";
            values.add(this.getPalCveAplicaDat());
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
        String sql = "SELECT * FROM PALIQUID ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPalNumContrato() != null && this.getPalNumContrato().longValue() == -999) {
            conditions += " AND PAL_NUM_CONTRATO IS NULL";
        } else if (this.getPalNumContrato() != null) {
            conditions += " AND PAL_NUM_CONTRATO = ?";
            values.add(this.getPalNumContrato());
        }

        if (this.getPalCvePersFid() != null && "null".equals(this.getPalCvePersFid())) {
            conditions += " AND PAL_CVE_PERS_FID IS NULL";
        } else if (this.getPalCvePersFid() != null) {
            conditions += " AND PAL_CVE_PERS_FID = ?";
            values.add(this.getPalCvePersFid());
        }

        if (this.getPalNumPersFid() != null && this.getPalNumPersFid().longValue() == -999) {
            conditions += " AND PAL_NUM_PERS_FID IS NULL";
        } else if (this.getPalNumPersFid() != null) {
            conditions += " AND PAL_NUM_PERS_FID = ?";
            values.add(this.getPalNumPersFid());
        }

        if (this.getPalCveAplicaDat() != null && "null".equals(this.getPalCveAplicaDat())) {
            conditions += " AND PAL_CVE_APLICA_DAT IS NULL";
        } else if (this.getPalCveAplicaDat() != null) {
            conditions += " AND PAL_CVE_APLICA_DAT = ?";
            values.add(this.getPalCveAplicaDat());
        }

        if (this.getPalCveTipoLiq() != null && this.getPalCveTipoLiq().longValue() == -999) {
            conditions += " AND PAL_CVE_TIPO_LIQ IS NULL";
        } else if (this.getPalCveTipoLiq() != null) {
            conditions += " AND PAL_CVE_TIPO_LIQ = ?";
            values.add(this.getPalCveTipoLiq());
        }

        if (this.getPalNumMoneda() != null && this.getPalNumMoneda().longValue() == -999) {
            conditions += " AND PAL_NUM_MONEDA IS NULL";
        } else if (this.getPalNumMoneda() != null) {
            conditions += " AND PAL_NUM_MONEDA = ?";
            values.add(this.getPalNumMoneda());
        }

        if (this.getPalCveTipoCta() != null && "null".equals(this.getPalCveTipoCta())) {
            conditions += " AND PAL_CVE_TIPO_CTA IS NULL";
        } else if (this.getPalCveTipoCta() != null) {
            conditions += " AND PAL_CVE_TIPO_CTA = ?";
            values.add(this.getPalCveTipoCta());
        }

        if (this.getPalNumBanco() != null && this.getPalNumBanco().longValue() == -999) {
            conditions += " AND PAL_NUM_BANCO IS NULL";
        } else if (this.getPalNumBanco() != null) {
            conditions += " AND PAL_NUM_BANCO = ?";
            values.add(this.getPalNumBanco());
        }

        if (this.getPalNumPlaza() != null && this.getPalNumPlaza().longValue() == -999) {
            conditions += " AND PAL_NUM_PLAZA IS NULL";
        } else if (this.getPalNumPlaza() != null) {
            conditions += " AND PAL_NUM_PLAZA = ?";
            values.add(this.getPalNumPlaza());
        }

        if (this.getPalNumSucursal() != null && this.getPalNumSucursal().longValue() == -999) {
            conditions += " AND PAL_NUM_SUCURSAL IS NULL";
        } else if (this.getPalNumSucursal() != null) {
            conditions += " AND PAL_NUM_SUCURSAL = ?";
            values.add(this.getPalNumSucursal());
        }

        if (this.getPalNomSucursal() != null && "null".equals(this.getPalNomSucursal())) {
            conditions += " AND PAL_NOM_SUCURSAL IS NULL";
        } else if (this.getPalNomSucursal() != null) {
            conditions += " AND PAL_NOM_SUCURSAL = ?";
            values.add(this.getPalNomSucursal());
        }

        if (this.getPalNumCuenta() != null && "null".equals(this.getPalNumCuenta())) {
            conditions += " AND PAL_NUM_CUENTA IS NULL";
        } else if (this.getPalNumCuenta() != null) {
            conditions += " AND PAL_NUM_CUENTA = ?";
            values.add(this.getPalNumCuenta());
        }

        if (this.getPalNumPais() != null && this.getPalNumPais().longValue() == -999) {
            conditions += " AND PAL_NUM_PAIS IS NULL";
        } else if (this.getPalNumPais() != null) {
            conditions += " AND PAL_NUM_PAIS = ?";
            values.add(this.getPalNumPais());
        }

        if (this.getPalCtaBanxico() != null && this.getPalCtaBanxico().longValue() == -999) {
            conditions += " AND PAL_CTA_BANXICO IS NULL";
        } else if (this.getPalCtaBanxico() != null) {
            conditions += " AND PAL_CTA_BANXICO = ?";
            values.add(this.getPalCtaBanxico());
        }

        if (this.getPalDirAperCta() != null && "null".equals(this.getPalDirAperCta())) {
            conditions += " AND PAL_DIR_APER_CTA IS NULL";
        } else if (this.getPalDirAperCta() != null) {
            conditions += " AND PAL_DIR_APER_CTA = ?";
            values.add(this.getPalDirAperCta());
        }

        if (this.getPalCodigoTrans() != null && "null".equals(this.getPalCodigoTrans())) {
            conditions += " AND PAL_CODIGO_TRANS IS NULL";
        } else if (this.getPalCodigoTrans() != null) {
            conditions += " AND PAL_CODIGO_TRANS = ?";
            values.add(this.getPalCodigoTrans());
        }

        if (this.getPalNumIniciativa() != null && this.getPalNumIniciativa().longValue() == -999) {
            conditions += " AND PAL_NUM_INICIATIVA IS NULL";
        } else if (this.getPalNumIniciativa() != null) {
            conditions += " AND PAL_NUM_INICIATIVA = ?";
            values.add(this.getPalNumIniciativa());
        }

        if (this.getPalNumCtam() != null && this.getPalNumCtam().longValue() == -999) {
            conditions += " AND PAL_NUM_CTAM IS NULL";
        } else if (this.getPalNumCtam() != null) {
            conditions += " AND PAL_NUM_CTAM = ?";
            values.add(this.getPalNumCtam());
        }

        if (this.getPalNumScta() != null && this.getPalNumScta().longValue() == -999) {
            conditions += " AND PAL_NUM_SCTA IS NULL";
        } else if (this.getPalNumScta() != null) {
            conditions += " AND PAL_NUM_SCTA = ?";
            values.add(this.getPalNumScta());
        }

        if (this.getPalNumSscta() != null && this.getPalNumSscta().longValue() == -999) {
            conditions += " AND PAL_NUM_SSCTA IS NULL";
        } else if (this.getPalNumSscta() != null) {
            conditions += " AND PAL_NUM_SSCTA = ?";
            values.add(this.getPalNumSscta());
        }

        if (this.getPalNumSsscta() != null && this.getPalNumSsscta().longValue() == -999) {
            conditions += " AND PAL_NUM_SSSCTA IS NULL";
        } else if (this.getPalNumSsscta() != null) {
            conditions += " AND PAL_NUM_SSSCTA = ?";
            values.add(this.getPalNumSsscta());
        }

        if (this.getPalNomArea() != null && "null".equals(this.getPalNomArea())) {
            conditions += " AND PAL_NOM_AREA IS NULL";
        } else if (this.getPalNomArea() != null) {
            conditions += " AND PAL_NOM_AREA = ?";
            values.add(this.getPalNomArea());
        }

        if (this.getPalConcepto() != null && "null".equals(this.getPalConcepto())) {
            conditions += " AND PAL_CONCEPTO IS NULL";
        } else if (this.getPalConcepto() != null) {
            conditions += " AND PAL_CONCEPTO = ?";
            values.add(this.getPalConcepto());
        }

        if (this.getPalCuentasOrden() != null && this.getPalCuentasOrden().longValue() == -999) {
            conditions += " AND PAL_CUENTAS_ORDEN IS NULL";
        } else if (this.getPalCuentasOrden() != null) {
            conditions += " AND PAL_CUENTAS_ORDEN = ?";
            values.add(this.getPalCuentasOrden());
        }

        if (this.getPalAnoAltaReg() != null && this.getPalAnoAltaReg().longValue() == -999) {
            conditions += " AND PAL_ANO_ALTA_REG IS NULL";
        } else if (this.getPalAnoAltaReg() != null) {
            conditions += " AND PAL_ANO_ALTA_REG = ?";
            values.add(this.getPalAnoAltaReg());
        }

        if (this.getPalMesAltaReg() != null && this.getPalMesAltaReg().longValue() == -999) {
            conditions += " AND PAL_MES_ALTA_REG IS NULL";
        } else if (this.getPalMesAltaReg() != null) {
            conditions += " AND PAL_MES_ALTA_REG = ?";
            values.add(this.getPalMesAltaReg());
        }

        if (this.getPalDiaAltaReg() != null && this.getPalDiaAltaReg().longValue() == -999) {
            conditions += " AND PAL_DIA_ALTA_REG IS NULL";
        } else if (this.getPalDiaAltaReg() != null) {
            conditions += " AND PAL_DIA_ALTA_REG = ?";
            values.add(this.getPalDiaAltaReg());
        }

        if (this.getPalAnoUltMod() != null && this.getPalAnoUltMod().longValue() == -999) {
            conditions += " AND PAL_ANO_ULT_MOD IS NULL";
        } else if (this.getPalAnoUltMod() != null) {
            conditions += " AND PAL_ANO_ULT_MOD = ?";
            values.add(this.getPalAnoUltMod());
        }

        if (this.getPalMesUltMod() != null && this.getPalMesUltMod().longValue() == -999) {
            conditions += " AND PAL_MES_ULT_MOD IS NULL";
        } else if (this.getPalMesUltMod() != null) {
            conditions += " AND PAL_MES_ULT_MOD = ?";
            values.add(this.getPalMesUltMod());
        }

        if (this.getPalDiaUltMod() != null && this.getPalDiaUltMod().longValue() == -999) {
            conditions += " AND PAL_DIA_ULT_MOD IS NULL";
        } else if (this.getPalDiaUltMod() != null) {
            conditions += " AND PAL_DIA_ULT_MOD = ?";
            values.add(this.getPalDiaUltMod());
        }

        if (this.getPalCveStPaliqui() != null && "null".equals(this.getPalCveStPaliqui())) {
            conditions += " AND PAL_CVE_ST_PALIQUI IS NULL";
        } else if (this.getPalCveStPaliqui() != null) {
            conditions += " AND PAL_CVE_ST_PALIQUI = ?";
            values.add(this.getPalCveStPaliqui());
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
        String sql = "UPDATE PALIQUID SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PAL_NUM_CONTRATO = ?";
        pkValues.add(this.getPalNumContrato());
        conditions += " AND PAL_CVE_PERS_FID = ?";
        pkValues.add(this.getPalCvePersFid());
        conditions += " AND PAL_NUM_PERS_FID = ?";
        pkValues.add(this.getPalNumPersFid());
        conditions += " AND PAL_CVE_APLICA_DAT = ?";
        pkValues.add(this.getPalCveAplicaDat());
        fields += " PAL_CVE_TIPO_LIQ = ?, ";
        values.add(this.getPalCveTipoLiq());
        fields += " PAL_NUM_MONEDA = ?, ";
        values.add(this.getPalNumMoneda());
        fields += " PAL_CVE_TIPO_CTA = ?, ";
        values.add(this.getPalCveTipoCta());
        fields += " PAL_NUM_BANCO = ?, ";
        values.add(this.getPalNumBanco());
        fields += " PAL_NUM_PLAZA = ?, ";
        values.add(this.getPalNumPlaza());
        fields += " PAL_NUM_SUCURSAL = ?, ";
        values.add(this.getPalNumSucursal());
        fields += " PAL_NOM_SUCURSAL = ?, ";
        values.add(this.getPalNomSucursal());
        fields += " PAL_NUM_CUENTA = ?, ";
        values.add(this.getPalNumCuenta());
        fields += " PAL_NUM_PAIS = ?, ";
        values.add(this.getPalNumPais());
        fields += " PAL_CTA_BANXICO = ?, ";
        values.add(this.getPalCtaBanxico());
        fields += " PAL_DIR_APER_CTA = ?, ";
        values.add(this.getPalDirAperCta());
        fields += " PAL_CODIGO_TRANS = ?, ";
        values.add(this.getPalCodigoTrans());
        fields += " PAL_NUM_INICIATIVA = ?, ";
        values.add(this.getPalNumIniciativa());
        fields += " PAL_NUM_CTAM = ?, ";
        values.add(this.getPalNumCtam());
        fields += " PAL_NUM_SCTA = ?, ";
        values.add(this.getPalNumScta());
        fields += " PAL_NUM_SSCTA = ?, ";
        values.add(this.getPalNumSscta());
        fields += " PAL_NUM_SSSCTA = ?, ";
        values.add(this.getPalNumSsscta());
        fields += " PAL_NOM_AREA = ?, ";
        values.add(this.getPalNomArea());
        fields += " PAL_CONCEPTO = ?, ";
        values.add(this.getPalConcepto());
        fields += " PAL_CUENTAS_ORDEN = ?, ";
        values.add(this.getPalCuentasOrden());
        fields += " PAL_ANO_ALTA_REG = ?, ";
        values.add(this.getPalAnoAltaReg());
        fields += " PAL_MES_ALTA_REG = ?, ";
        values.add(this.getPalMesAltaReg());
        fields += " PAL_DIA_ALTA_REG = ?, ";
        values.add(this.getPalDiaAltaReg());
        fields += " PAL_ANO_ULT_MOD = ?, ";
        values.add(this.getPalAnoUltMod());
        fields += " PAL_MES_ULT_MOD = ?, ";
        values.add(this.getPalMesUltMod());
        fields += " PAL_DIA_ULT_MOD = ?, ";
        values.add(this.getPalDiaUltMod());
        fields += " PAL_CVE_ST_PALIQUI = ?, ";
        values.add(this.getPalCveStPaliqui());
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
        String sql = "INSERT INTO PALIQUID ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAL_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPalNumContrato());

        fields += ", PAL_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getPalCvePersFid());

        fields += ", PAL_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getPalNumPersFid());

        fields += ", PAL_CVE_APLICA_DAT";
        fieldValues += ", ?";
        values.add(this.getPalCveAplicaDat());

        fields += ", PAL_CVE_TIPO_LIQ";
        fieldValues += ", ?";
        values.add(this.getPalCveTipoLiq());

        fields += ", PAL_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getPalNumMoneda());

        fields += ", PAL_CVE_TIPO_CTA";
        fieldValues += ", ?";
        values.add(this.getPalCveTipoCta());

        fields += ", PAL_NUM_BANCO";
        fieldValues += ", ?";
        values.add(this.getPalNumBanco());

        fields += ", PAL_NUM_PLAZA";
        fieldValues += ", ?";
        values.add(this.getPalNumPlaza());

        fields += ", PAL_NUM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getPalNumSucursal());

        fields += ", PAL_NOM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getPalNomSucursal());

        fields += ", PAL_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getPalNumCuenta());

        fields += ", PAL_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getPalNumPais());

        fields += ", PAL_CTA_BANXICO";
        fieldValues += ", ?";
        values.add(this.getPalCtaBanxico());

        fields += ", PAL_DIR_APER_CTA";
        fieldValues += ", ?";
        values.add(this.getPalDirAperCta());

        fields += ", PAL_CODIGO_TRANS";
        fieldValues += ", ?";
        values.add(this.getPalCodigoTrans());

        fields += ", PAL_NUM_INICIATIVA";
        fieldValues += ", ?";
        values.add(this.getPalNumIniciativa());

        fields += ", PAL_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getPalNumCtam());

        fields += ", PAL_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getPalNumScta());

        fields += ", PAL_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getPalNumSscta());

        fields += ", PAL_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getPalNumSsscta());

        fields += ", PAL_NOM_AREA";
        fieldValues += ", ?";
        values.add(this.getPalNomArea());

        fields += ", PAL_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getPalConcepto());

        fields += ", PAL_CUENTAS_ORDEN";
        fieldValues += ", ?";
        values.add(this.getPalCuentasOrden());

        fields += ", PAL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPalAnoAltaReg());

        fields += ", PAL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPalMesAltaReg());

        fields += ", PAL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPalDiaAltaReg());

        fields += ", PAL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPalAnoUltMod());

        fields += ", PAL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPalMesUltMod());

        fields += ", PAL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPalDiaUltMod());

        fields += ", PAL_CVE_ST_PALIQUI";
        fieldValues += ", ?";
        values.add(this.getPalCveStPaliqui());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PALIQUID WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PAL_NUM_CONTRATO = ?";
        values.add(this.getPalNumContrato());
        conditions += " AND PAL_CVE_PERS_FID = ?";
        values.add(this.getPalCvePersFid());
        conditions += " AND PAL_NUM_PERS_FID = ?";
        values.add(this.getPalNumPersFid());
        conditions += " AND PAL_CVE_APLICA_DAT = ?";
        values.add(this.getPalCveAplicaDat());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Paliquid instance = (Paliquid) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPalNumContrato().equals(instance.getPalNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPalCvePersFid().equals(instance.getPalCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumPersFid().equals(instance.getPalNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getPalCveAplicaDat().equals(instance.getPalCveAplicaDat()))
            equalObjects = false;
        if (equalObjects && !this.getPalCveTipoLiq().equals(instance.getPalCveTipoLiq()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumMoneda().equals(instance.getPalNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getPalCveTipoCta().equals(instance.getPalCveTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumBanco().equals(instance.getPalNumBanco()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumPlaza().equals(instance.getPalNumPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumSucursal().equals(instance.getPalNumSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getPalNomSucursal().equals(instance.getPalNomSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumCuenta().equals(instance.getPalNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumPais().equals(instance.getPalNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getPalCtaBanxico().equals(instance.getPalCtaBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getPalDirAperCta().equals(instance.getPalDirAperCta()))
            equalObjects = false;
        if (equalObjects && !this.getPalCodigoTrans().equals(instance.getPalCodigoTrans()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumIniciativa().equals(instance.getPalNumIniciativa()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumCtam().equals(instance.getPalNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumScta().equals(instance.getPalNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumSscta().equals(instance.getPalNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getPalNumSsscta().equals(instance.getPalNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getPalNomArea().equals(instance.getPalNomArea()))
            equalObjects = false;
        if (equalObjects && !this.getPalConcepto().equals(instance.getPalConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getPalCuentasOrden().equals(instance.getPalCuentasOrden()))
            equalObjects = false;
        if (equalObjects && !this.getPalAnoAltaReg().equals(instance.getPalAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPalMesAltaReg().equals(instance.getPalMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPalDiaAltaReg().equals(instance.getPalDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPalAnoUltMod().equals(instance.getPalAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPalMesUltMod().equals(instance.getPalMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPalDiaUltMod().equals(instance.getPalDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPalCveStPaliqui().equals(instance.getPalCveStPaliqui()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Paliquid result = new Paliquid();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPalNumContrato((BigDecimal) objectData.getData("PAL_NUM_CONTRATO"));
        result.setPalCvePersFid((String) objectData.getData("PAL_CVE_PERS_FID"));
        result.setPalNumPersFid((BigDecimal) objectData.getData("PAL_NUM_PERS_FID"));
        result.setPalCveAplicaDat((String) objectData.getData("PAL_CVE_APLICA_DAT"));
        result.setPalCveTipoLiq((BigDecimal) objectData.getData("PAL_CVE_TIPO_LIQ"));
        result.setPalNumMoneda((BigDecimal) objectData.getData("PAL_NUM_MONEDA"));
        result.setPalCveTipoCta((String) objectData.getData("PAL_CVE_TIPO_CTA"));
        result.setPalNumBanco((BigDecimal) objectData.getData("PAL_NUM_BANCO"));
        result.setPalNumPlaza((BigDecimal) objectData.getData("PAL_NUM_PLAZA"));
        result.setPalNumSucursal((BigDecimal) objectData.getData("PAL_NUM_SUCURSAL"));
        result.setPalNomSucursal((String) objectData.getData("PAL_NOM_SUCURSAL"));
        result.setPalNumCuenta((String) objectData.getData("PAL_NUM_CUENTA"));
        result.setPalNumPais((BigDecimal) objectData.getData("PAL_NUM_PAIS"));
        result.setPalCtaBanxico((BigDecimal) objectData.getData("PAL_CTA_BANXICO"));
        result.setPalDirAperCta((String) objectData.getData("PAL_DIR_APER_CTA"));
        result.setPalCodigoTrans((String) objectData.getData("PAL_CODIGO_TRANS"));
        result.setPalNumIniciativa((BigDecimal) objectData.getData("PAL_NUM_INICIATIVA"));
        result.setPalNumCtam((BigDecimal) objectData.getData("PAL_NUM_CTAM"));
        result.setPalNumScta((BigDecimal) objectData.getData("PAL_NUM_SCTA"));
        result.setPalNumSscta((BigDecimal) objectData.getData("PAL_NUM_SSCTA"));
        result.setPalNumSsscta((BigDecimal) objectData.getData("PAL_NUM_SSSCTA"));
        result.setPalNomArea((String) objectData.getData("PAL_NOM_AREA"));
        result.setPalConcepto((String) objectData.getData("PAL_CONCEPTO"));
        result.setPalCuentasOrden((BigDecimal) objectData.getData("PAL_CUENTAS_ORDEN"));
        result.setPalAnoAltaReg((BigDecimal) objectData.getData("PAL_ANO_ALTA_REG"));
        result.setPalMesAltaReg((BigDecimal) objectData.getData("PAL_MES_ALTA_REG"));
        result.setPalDiaAltaReg((BigDecimal) objectData.getData("PAL_DIA_ALTA_REG"));
        result.setPalAnoUltMod((BigDecimal) objectData.getData("PAL_ANO_ULT_MOD"));
        result.setPalMesUltMod((BigDecimal) objectData.getData("PAL_MES_ULT_MOD"));
        result.setPalDiaUltMod((BigDecimal) objectData.getData("PAL_DIA_ULT_MOD"));
        result.setPalCveStPaliqui((String) objectData.getData("PAL_CVE_ST_PALIQUI"));

        return result;

    }

}
