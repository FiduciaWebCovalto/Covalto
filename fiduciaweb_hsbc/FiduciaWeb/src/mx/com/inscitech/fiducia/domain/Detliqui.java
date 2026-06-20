package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DETLIQUI_PK", columns = { "DEL_FOLIO_OPERA" }, sequences = { "MAX" })
public class Detliqui extends DomainObject {

    BigDecimal delFolioOpera = null;
    BigDecimal delNumOperacion = null;
    BigDecimal delNumSecOpera = null;
    BigDecimal delNumModulo = null;
    BigDecimal delNumTransac = null;
    BigDecimal delNumContrato = null;
    BigDecimal delSubContrato = null;
    BigDecimal delSubPrograma = null;
    BigDecimal delNumPersFid = null;
    String delNomPersFid = null;
    String delTipoPersFid = null;
    BigDecimal delFolioOperSis = null;
    BigDecimal delBenefXtercer = null;
    BigDecimal delImpLiquidar = null;
    BigDecimal delParidad = null;
    BigDecimal delCveTipoLiq = null;
    BigDecimal delNumMoneda = null;
    String delCveTipoCta = null;
    BigDecimal delNumBanco = null;
    String delNomBanco = null;
    BigDecimal delNumPlaza = null;
    String delNomPlaza = null;
    BigDecimal delNumSucursal = null;
    String delNumCuenta = null;
    BigDecimal delNumPais = null;
    BigDecimal delNumCheque = null;
    String delCtaBanxico = null;
    String delDirAperCta = null;
    String delCodigoTrans = null;
    BigDecimal delNumIniciativa = null;
    BigDecimal delNumCtam = null;
    BigDecimal delNumScta = null;
    BigDecimal delNumSscta = null;
    BigDecimal delNumSsscta = null;
    String delNomArea = null;
    String delConcepto = null;
    BigDecimal delAnoAltaReg = null;
    BigDecimal delMesAltaReg = null;
    BigDecimal delDiaAltaReg = null;
    BigDecimal delAnoUltMod = null;
    BigDecimal delMesUltMod = null;
    BigDecimal delDiaUltMod = null;
    String delCveStDetliqu = null;
    BigDecimal delRubro = null;
    BigDecimal delEntidadFin = null;
    BigDecimal delContratoInter = null;

    public Detliqui() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelFolioOpera(BigDecimal delFolioOpera) {
        this.delFolioOpera = delFolioOpera;
    }

    public BigDecimal getDelFolioOpera() {
        return this.delFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumOperacion(BigDecimal delNumOperacion) {
        this.delNumOperacion = delNumOperacion;
    }

    public BigDecimal getDelNumOperacion() {
        return this.delNumOperacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumSecOpera(BigDecimal delNumSecOpera) {
        this.delNumSecOpera = delNumSecOpera;
    }

    public BigDecimal getDelNumSecOpera() {
        return this.delNumSecOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumModulo(BigDecimal delNumModulo) {
        this.delNumModulo = delNumModulo;
    }

    public BigDecimal getDelNumModulo() {
        return this.delNumModulo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumTransac(BigDecimal delNumTransac) {
        this.delNumTransac = delNumTransac;
    }

    public BigDecimal getDelNumTransac() {
        return this.delNumTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumContrato(BigDecimal delNumContrato) {
        this.delNumContrato = delNumContrato;
    }

    public BigDecimal getDelNumContrato() {
        return this.delNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelSubContrato(BigDecimal delSubContrato) {
        this.delSubContrato = delSubContrato;
    }

    public BigDecimal getDelSubContrato() {
        return this.delSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelSubPrograma(BigDecimal delSubPrograma) {
        this.delSubPrograma = delSubPrograma;
    }

    public BigDecimal getDelSubPrograma() {
        return this.delSubPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumPersFid(BigDecimal delNumPersFid) {
        this.delNumPersFid = delNumPersFid;
    }

    public BigDecimal getDelNumPersFid() {
        return this.delNumPersFid;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelNomPersFid(String delNomPersFid) {
        this.delNomPersFid = delNomPersFid;
    }

    public String getDelNomPersFid() {
        return this.delNomPersFid;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelTipoPersFid(String delTipoPersFid) {
        this.delTipoPersFid = delTipoPersFid;
    }

    public String getDelTipoPersFid() {
        return this.delTipoPersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelFolioOperSis(BigDecimal delFolioOperSis) {
        this.delFolioOperSis = delFolioOperSis;
    }

    public BigDecimal getDelFolioOperSis() {
        return this.delFolioOperSis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelBenefXtercer(BigDecimal delBenefXtercer) {
        this.delBenefXtercer = delBenefXtercer;
    }

    public BigDecimal getDelBenefXtercer() {
        return this.delBenefXtercer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDelImpLiquidar(BigDecimal delImpLiquidar) {
        this.delImpLiquidar = delImpLiquidar;
    }

    public BigDecimal getDelImpLiquidar() {
        return this.delImpLiquidar;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDelParidad(BigDecimal delParidad) {
        this.delParidad = delParidad;
    }

    public BigDecimal getDelParidad() {
        return this.delParidad;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDelCveTipoLiq(BigDecimal delCveTipoLiq) {
        this.delCveTipoLiq = delCveTipoLiq;
    }

    public BigDecimal getDelCveTipoLiq() {
        return this.delCveTipoLiq;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumMoneda(BigDecimal delNumMoneda) {
        this.delNumMoneda = delNumMoneda;
    }

    public BigDecimal getDelNumMoneda() {
        return this.delNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelCveTipoCta(String delCveTipoCta) {
        this.delCveTipoCta = delCveTipoCta;
    }

    public String getDelCveTipoCta() {
        return this.delCveTipoCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumBanco(BigDecimal delNumBanco) {
        this.delNumBanco = delNumBanco;
    }

    public BigDecimal getDelNumBanco() {
        return this.delNumBanco;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelNomBanco(String delNomBanco) {
        this.delNomBanco = delNomBanco;
    }

    public String getDelNomBanco() {
        return this.delNomBanco;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumPlaza(BigDecimal delNumPlaza) {
        this.delNumPlaza = delNumPlaza;
    }

    public BigDecimal getDelNumPlaza() {
        return this.delNumPlaza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelNomPlaza(String delNomPlaza) {
        this.delNomPlaza = delNomPlaza;
    }

    public String getDelNomPlaza() {
        return this.delNomPlaza;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumSucursal(BigDecimal delNumSucursal) {
        this.delNumSucursal = delNumSucursal;
    }

    public BigDecimal getDelNumSucursal() {
        return this.delNumSucursal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelNumCuenta(String delNumCuenta) {
        this.delNumCuenta = delNumCuenta;
    }

    public String getDelNumCuenta() {
        return this.delNumCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumPais(BigDecimal delNumPais) {
        this.delNumPais = delNumPais;
    }

    public BigDecimal getDelNumPais() {
        return this.delNumPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumCheque(BigDecimal delNumCheque) {
        this.delNumCheque = delNumCheque;
    }

    public BigDecimal getDelNumCheque() {
        return this.delNumCheque;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelCtaBanxico(String delCtaBanxico) {
        this.delCtaBanxico = delCtaBanxico;
    }

    public String getDelCtaBanxico() {
        return this.delCtaBanxico;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelDirAperCta(String delDirAperCta) {
        this.delDirAperCta = delDirAperCta;
    }

    public String getDelDirAperCta() {
        return this.delDirAperCta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelCodigoTrans(String delCodigoTrans) {
        this.delCodigoTrans = delCodigoTrans;
    }

    public String getDelCodigoTrans() {
        return this.delCodigoTrans;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumIniciativa(BigDecimal delNumIniciativa) {
        this.delNumIniciativa = delNumIniciativa;
    }

    public BigDecimal getDelNumIniciativa() {
        return this.delNumIniciativa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumCtam(BigDecimal delNumCtam) {
        this.delNumCtam = delNumCtam;
    }

    public BigDecimal getDelNumCtam() {
        return this.delNumCtam;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumScta(BigDecimal delNumScta) {
        this.delNumScta = delNumScta;
    }

    public BigDecimal getDelNumScta() {
        return this.delNumScta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumSscta(BigDecimal delNumSscta) {
        this.delNumSscta = delNumSscta;
    }

    public BigDecimal getDelNumSscta() {
        return this.delNumSscta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelNumSsscta(BigDecimal delNumSsscta) {
        this.delNumSsscta = delNumSsscta;
    }

    public BigDecimal getDelNumSsscta() {
        return this.delNumSsscta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelNomArea(String delNomArea) {
        this.delNomArea = delNomArea;
    }

    public String getDelNomArea() {
        return this.delNomArea;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelConcepto(String delConcepto) {
        this.delConcepto = delConcepto;
    }

    public String getDelConcepto() {
        return this.delConcepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDelAnoAltaReg(BigDecimal delAnoAltaReg) {
        this.delAnoAltaReg = delAnoAltaReg;
    }

    public BigDecimal getDelAnoAltaReg() {
        return this.delAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDelMesAltaReg(BigDecimal delMesAltaReg) {
        this.delMesAltaReg = delMesAltaReg;
    }

    public BigDecimal getDelMesAltaReg() {
        return this.delMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDelDiaAltaReg(BigDecimal delDiaAltaReg) {
        this.delDiaAltaReg = delDiaAltaReg;
    }

    public BigDecimal getDelDiaAltaReg() {
        return this.delDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDelAnoUltMod(BigDecimal delAnoUltMod) {
        this.delAnoUltMod = delAnoUltMod;
    }

    public BigDecimal getDelAnoUltMod() {
        return this.delAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDelMesUltMod(BigDecimal delMesUltMod) {
        this.delMesUltMod = delMesUltMod;
    }

    public BigDecimal getDelMesUltMod() {
        return this.delMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDelDiaUltMod(BigDecimal delDiaUltMod) {
        this.delDiaUltMod = delDiaUltMod;
    }

    public BigDecimal getDelDiaUltMod() {
        return this.delDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDelCveStDetliqu(String delCveStDetliqu) {
        this.delCveStDetliqu = delCveStDetliqu;
    }

    public String getDelCveStDetliqu() {
        return this.delCveStDetliqu;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelRubro(BigDecimal delRubro) {
        this.delRubro = delRubro;
    }

    public BigDecimal getDelRubro() {
        return this.delRubro;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelEntidadFin(BigDecimal delEntidadFin) {
        this.delEntidadFin = delEntidadFin;
    }

    public BigDecimal getDelEntidadFin() {
        return this.delEntidadFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setDelContratoInter(BigDecimal delContratoInter) {
        this.delContratoInter = delContratoInter;
    }

    public BigDecimal getDelContratoInter() {
        return this.delContratoInter;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DETLIQUI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDelFolioOpera() != null && this.getDelFolioOpera().longValue() == -999) {
            conditions += " AND DEL_FOLIO_OPERA IS NULL";
        } else if (this.getDelFolioOpera() != null) {
            conditions += " AND DEL_FOLIO_OPERA = ?";
            values.add(this.getDelFolioOpera());
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
        String sql = "SELECT * FROM DETLIQUI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDelFolioOpera() != null && this.getDelFolioOpera().longValue() == -999) {
            conditions += " AND DEL_FOLIO_OPERA IS NULL";
        } else if (this.getDelFolioOpera() != null) {
            conditions += " AND DEL_FOLIO_OPERA = ?";
            values.add(this.getDelFolioOpera());
        }

        if (this.getDelNumOperacion() != null && this.getDelNumOperacion().longValue() == -999) {
            conditions += " AND DEL_NUM_OPERACION IS NULL";
        } else if (this.getDelNumOperacion() != null) {
            conditions += " AND DEL_NUM_OPERACION = ?";
            values.add(this.getDelNumOperacion());
        }

        if (this.getDelNumSecOpera() != null && this.getDelNumSecOpera().longValue() == -999) {
            conditions += " AND DEL_NUM_SEC_OPERA IS NULL";
        } else if (this.getDelNumSecOpera() != null) {
            conditions += " AND DEL_NUM_SEC_OPERA = ?";
            values.add(this.getDelNumSecOpera());
        }

        if (this.getDelNumModulo() != null && this.getDelNumModulo().longValue() == -999) {
            conditions += " AND DEL_NUM_MODULO IS NULL";
        } else if (this.getDelNumModulo() != null) {
            conditions += " AND DEL_NUM_MODULO = ?";
            values.add(this.getDelNumModulo());
        }

        if (this.getDelNumTransac() != null && this.getDelNumTransac().longValue() == -999) {
            conditions += " AND DEL_NUM_TRANSAC IS NULL";
        } else if (this.getDelNumTransac() != null) {
            conditions += " AND DEL_NUM_TRANSAC = ?";
            values.add(this.getDelNumTransac());
        }

        if (this.getDelNumContrato() != null && this.getDelNumContrato().longValue() == -999) {
            conditions += " AND DEL_NUM_CONTRATO IS NULL";
        } else if (this.getDelNumContrato() != null) {
            conditions += " AND DEL_NUM_CONTRATO = ?";
            values.add(this.getDelNumContrato());
        }

        if (this.getDelSubContrato() != null && this.getDelSubContrato().longValue() == -999) {
            conditions += " AND DEL_SUB_CONTRATO IS NULL";
        } else if (this.getDelSubContrato() != null) {
            conditions += " AND DEL_SUB_CONTRATO = ?";
            values.add(this.getDelSubContrato());
        }

        if (this.getDelSubPrograma() != null && this.getDelSubPrograma().longValue() == -999) {
            conditions += " AND DEL_SUB_PROGRAMA IS NULL";
        } else if (this.getDelSubPrograma() != null) {
            conditions += " AND DEL_SUB_PROGRAMA = ?";
            values.add(this.getDelSubPrograma());
        }

        if (this.getDelNumPersFid() != null && this.getDelNumPersFid().longValue() == -999) {
            conditions += " AND DEL_NUM_PERS_FID IS NULL";
        } else if (this.getDelNumPersFid() != null) {
            conditions += " AND DEL_NUM_PERS_FID = ?";
            values.add(this.getDelNumPersFid());
        }

        if (this.getDelNomPersFid() != null && "null".equals(this.getDelNomPersFid())) {
            conditions += " AND DEL_NOM_PERS_FID IS NULL";
        } else if (this.getDelNomPersFid() != null) {
            conditions += " AND DEL_NOM_PERS_FID = ?";
            values.add(this.getDelNomPersFid());
        }

        if (this.getDelTipoPersFid() != null && "null".equals(this.getDelTipoPersFid())) {
            conditions += " AND DEL_TIPO_PERS_FID IS NULL";
        } else if (this.getDelTipoPersFid() != null) {
            conditions += " AND DEL_TIPO_PERS_FID = ?";
            values.add(this.getDelTipoPersFid());
        }

        if (this.getDelFolioOperSis() != null && this.getDelFolioOperSis().longValue() == -999) {
            conditions += " AND DEL_FOLIO_OPER_SIS IS NULL";
        } else if (this.getDelFolioOperSis() != null) {
            conditions += " AND DEL_FOLIO_OPER_SIS = ?";
            values.add(this.getDelFolioOperSis());
        }

        if (this.getDelBenefXtercer() != null && this.getDelBenefXtercer().longValue() == -999) {
            conditions += " AND DEL_BENEF_XTERCER IS NULL";
        } else if (this.getDelBenefXtercer() != null) {
            conditions += " AND DEL_BENEF_XTERCER = ?";
            values.add(this.getDelBenefXtercer());
        }

        if (this.getDelImpLiquidar() != null && this.getDelImpLiquidar().longValue() == -999) {
            conditions += " AND DEL_IMP_LIQUIDAR IS NULL";
        } else if (this.getDelImpLiquidar() != null) {
            conditions += " AND DEL_IMP_LIQUIDAR = ?";
            values.add(this.getDelImpLiquidar());
        }

        if (this.getDelParidad() != null && this.getDelParidad().longValue() == -999) {
            conditions += " AND DEL_PARIDAD IS NULL";
        } else if (this.getDelParidad() != null) {
            conditions += " AND DEL_PARIDAD = ?";
            values.add(this.getDelParidad());
        }

        if (this.getDelCveTipoLiq() != null && this.getDelCveTipoLiq().longValue() == -999) {
            conditions += " AND DEL_CVE_TIPO_LIQ IS NULL";
        } else if (this.getDelCveTipoLiq() != null) {
            conditions += " AND DEL_CVE_TIPO_LIQ = ?";
            values.add(this.getDelCveTipoLiq());
        }

        if (this.getDelNumMoneda() != null && this.getDelNumMoneda().longValue() == -999) {
            conditions += " AND DEL_NUM_MONEDA IS NULL";
        } else if (this.getDelNumMoneda() != null) {
            conditions += " AND DEL_NUM_MONEDA = ?";
            values.add(this.getDelNumMoneda());
        }

        if (this.getDelCveTipoCta() != null && "null".equals(this.getDelCveTipoCta())) {
            conditions += " AND DEL_CVE_TIPO_CTA IS NULL";
        } else if (this.getDelCveTipoCta() != null) {
            conditions += " AND DEL_CVE_TIPO_CTA = ?";
            values.add(this.getDelCveTipoCta());
        }

        if (this.getDelNumBanco() != null && this.getDelNumBanco().longValue() == -999) {
            conditions += " AND DEL_NUM_BANCO IS NULL";
        } else if (this.getDelNumBanco() != null) {
            conditions += " AND DEL_NUM_BANCO = ?";
            values.add(this.getDelNumBanco());
        }

        if (this.getDelNomBanco() != null && "null".equals(this.getDelNomBanco())) {
            conditions += " AND DEL_NOM_BANCO IS NULL";
        } else if (this.getDelNomBanco() != null) {
            conditions += " AND DEL_NOM_BANCO = ?";
            values.add(this.getDelNomBanco());
        }

        if (this.getDelNumPlaza() != null && this.getDelNumPlaza().longValue() == -999) {
            conditions += " AND DEL_NUM_PLAZA IS NULL";
        } else if (this.getDelNumPlaza() != null) {
            conditions += " AND DEL_NUM_PLAZA = ?";
            values.add(this.getDelNumPlaza());
        }

        if (this.getDelNomPlaza() != null && "null".equals(this.getDelNomPlaza())) {
            conditions += " AND DEL_NOM_PLAZA IS NULL";
        } else if (this.getDelNomPlaza() != null) {
            conditions += " AND DEL_NOM_PLAZA = ?";
            values.add(this.getDelNomPlaza());
        }

        if (this.getDelNumSucursal() != null && this.getDelNumSucursal().longValue() == -999) {
            conditions += " AND DEL_NUM_SUCURSAL IS NULL";
        } else if (this.getDelNumSucursal() != null) {
            conditions += " AND DEL_NUM_SUCURSAL = ?";
            values.add(this.getDelNumSucursal());
        }

        if (this.getDelNumCuenta() != null && "null".equals(this.getDelNumCuenta())) {
            conditions += " AND DEL_NUM_CUENTA IS NULL";
        } else if (this.getDelNumCuenta() != null) {
            conditions += " AND DEL_NUM_CUENTA = ?";
            values.add(this.getDelNumCuenta());
        }

        if (this.getDelNumPais() != null && this.getDelNumPais().longValue() == -999) {
            conditions += " AND DEL_NUM_PAIS IS NULL";
        } else if (this.getDelNumPais() != null) {
            conditions += " AND DEL_NUM_PAIS = ?";
            values.add(this.getDelNumPais());
        }

        if (this.getDelNumCheque() != null && this.getDelNumCheque().longValue() == -999) {
            conditions += " AND DEL_NUM_CHEQUE IS NULL";
        } else if (this.getDelNumCheque() != null) {
            conditions += " AND DEL_NUM_CHEQUE = ?";
            values.add(this.getDelNumCheque());
        }

        if (this.getDelCtaBanxico() != null && "null".equals(this.getDelCtaBanxico())) {
            conditions += " AND DEL_CTA_BANXICO IS NULL";
        } else if (this.getDelCtaBanxico() != null) {
            conditions += " AND DEL_CTA_BANXICO = ?";
            values.add(this.getDelCtaBanxico());
        }

        if (this.getDelDirAperCta() != null && "null".equals(this.getDelDirAperCta())) {
            conditions += " AND DEL_DIR_APER_CTA IS NULL";
        } else if (this.getDelDirAperCta() != null) {
            conditions += " AND DEL_DIR_APER_CTA = ?";
            values.add(this.getDelDirAperCta());
        }

        if (this.getDelCodigoTrans() != null && "null".equals(this.getDelCodigoTrans())) {
            conditions += " AND DEL_CODIGO_TRANS IS NULL";
        } else if (this.getDelCodigoTrans() != null) {
            conditions += " AND DEL_CODIGO_TRANS = ?";
            values.add(this.getDelCodigoTrans());
        }

        if (this.getDelNumIniciativa() != null && this.getDelNumIniciativa().longValue() == -999) {
            conditions += " AND DEL_NUM_INICIATIVA IS NULL";
        } else if (this.getDelNumIniciativa() != null) {
            conditions += " AND DEL_NUM_INICIATIVA = ?";
            values.add(this.getDelNumIniciativa());
        }

        if (this.getDelNumCtam() != null && this.getDelNumCtam().longValue() == -999) {
            conditions += " AND DEL_NUM_CTAM IS NULL";
        } else if (this.getDelNumCtam() != null) {
            conditions += " AND DEL_NUM_CTAM = ?";
            values.add(this.getDelNumCtam());
        }

        if (this.getDelNumScta() != null && this.getDelNumScta().longValue() == -999) {
            conditions += " AND DEL_NUM_SCTA IS NULL";
        } else if (this.getDelNumScta() != null) {
            conditions += " AND DEL_NUM_SCTA = ?";
            values.add(this.getDelNumScta());
        }

        if (this.getDelNumSscta() != null && this.getDelNumSscta().longValue() == -999) {
            conditions += " AND DEL_NUM_SSCTA IS NULL";
        } else if (this.getDelNumSscta() != null) {
            conditions += " AND DEL_NUM_SSCTA = ?";
            values.add(this.getDelNumSscta());
        }

        if (this.getDelNumSsscta() != null && this.getDelNumSsscta().longValue() == -999) {
            conditions += " AND DEL_NUM_SSSCTA IS NULL";
        } else if (this.getDelNumSsscta() != null) {
            conditions += " AND DEL_NUM_SSSCTA = ?";
            values.add(this.getDelNumSsscta());
        }

        if (this.getDelNomArea() != null && "null".equals(this.getDelNomArea())) {
            conditions += " AND DEL_NOM_AREA IS NULL";
        } else if (this.getDelNomArea() != null) {
            conditions += " AND DEL_NOM_AREA = ?";
            values.add(this.getDelNomArea());
        }

        if (this.getDelConcepto() != null && "null".equals(this.getDelConcepto())) {
            conditions += " AND DEL_CONCEPTO IS NULL";
        } else if (this.getDelConcepto() != null) {
            conditions += " AND DEL_CONCEPTO = ?";
            values.add(this.getDelConcepto());
        }

        if (this.getDelAnoAltaReg() != null && this.getDelAnoAltaReg().longValue() == -999) {
            conditions += " AND DEL_ANO_ALTA_REG IS NULL";
        } else if (this.getDelAnoAltaReg() != null) {
            conditions += " AND DEL_ANO_ALTA_REG = ?";
            values.add(this.getDelAnoAltaReg());
        }

        if (this.getDelMesAltaReg() != null && this.getDelMesAltaReg().longValue() == -999) {
            conditions += " AND DEL_MES_ALTA_REG IS NULL";
        } else if (this.getDelMesAltaReg() != null) {
            conditions += " AND DEL_MES_ALTA_REG = ?";
            values.add(this.getDelMesAltaReg());
        }

        if (this.getDelDiaAltaReg() != null && this.getDelDiaAltaReg().longValue() == -999) {
            conditions += " AND DEL_DIA_ALTA_REG IS NULL";
        } else if (this.getDelDiaAltaReg() != null) {
            conditions += " AND DEL_DIA_ALTA_REG = ?";
            values.add(this.getDelDiaAltaReg());
        }

        if (this.getDelAnoUltMod() != null && this.getDelAnoUltMod().longValue() == -999) {
            conditions += " AND DEL_ANO_ULT_MOD IS NULL";
        } else if (this.getDelAnoUltMod() != null) {
            conditions += " AND DEL_ANO_ULT_MOD = ?";
            values.add(this.getDelAnoUltMod());
        }

        if (this.getDelMesUltMod() != null && this.getDelMesUltMod().longValue() == -999) {
            conditions += " AND DEL_MES_ULT_MOD IS NULL";
        } else if (this.getDelMesUltMod() != null) {
            conditions += " AND DEL_MES_ULT_MOD = ?";
            values.add(this.getDelMesUltMod());
        }

        if (this.getDelDiaUltMod() != null && this.getDelDiaUltMod().longValue() == -999) {
            conditions += " AND DEL_DIA_ULT_MOD IS NULL";
        } else if (this.getDelDiaUltMod() != null) {
            conditions += " AND DEL_DIA_ULT_MOD = ?";
            values.add(this.getDelDiaUltMod());
        }

        if (this.getDelCveStDetliqu() != null && "null".equals(this.getDelCveStDetliqu())) {
            conditions += " AND DEL_CVE_ST_DETLIQU IS NULL";
        } else if (this.getDelCveStDetliqu() != null) {
            conditions += " AND DEL_CVE_ST_DETLIQU = ?";
            values.add(this.getDelCveStDetliqu());
        }

        if (this.getDelRubro() != null && this.getDelRubro().longValue() == -999) {
            conditions += " AND DEL_RUBRO IS NULL";
        } else if (this.getDelRubro() != null) {
            conditions += " AND DEL_RUBRO = ?";
            values.add(this.getDelRubro());
        }

        if (this.getDelEntidadFin() != null && this.getDelEntidadFin().longValue() == -999) {
            conditions += " AND DEL_ENTIDAD_FIN IS NULL";
        } else if (this.getDelEntidadFin() != null) {
            conditions += " AND DEL_ENTIDAD_FIN = ?";
            values.add(this.getDelEntidadFin());
        }

        if (this.getDelContratoInter() != null && this.getDelContratoInter().longValue() == -999) {
            conditions += " AND DEL_CONTRATO_INTER IS NULL";
        } else if (this.getDelContratoInter() != null) {
            conditions += " AND DEL_CONTRATO_INTER = ?";
            values.add(this.getDelContratoInter());
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
        String sql = "UPDATE DETLIQUI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DEL_FOLIO_OPERA = ?";
        pkValues.add(this.getDelFolioOpera());
        fields += " DEL_NUM_OPERACION = ?, ";
        values.add(this.getDelNumOperacion());
        fields += " DEL_NUM_SEC_OPERA = ?, ";
        values.add(this.getDelNumSecOpera());
        fields += " DEL_NUM_MODULO = ?, ";
        values.add(this.getDelNumModulo());
        fields += " DEL_NUM_TRANSAC = ?, ";
        values.add(this.getDelNumTransac());
        fields += " DEL_NUM_CONTRATO = ?, ";
        values.add(this.getDelNumContrato());
        fields += " DEL_SUB_CONTRATO = ?, ";
        values.add(this.getDelSubContrato());
        fields += " DEL_SUB_PROGRAMA = ?, ";
        values.add(this.getDelSubPrograma());
        fields += " DEL_NUM_PERS_FID = ?, ";
        values.add(this.getDelNumPersFid());
        fields += " DEL_NOM_PERS_FID = ?, ";
        values.add(this.getDelNomPersFid());
        fields += " DEL_TIPO_PERS_FID = ?, ";
        values.add(this.getDelTipoPersFid());
        fields += " DEL_FOLIO_OPER_SIS = ?, ";
        values.add(this.getDelFolioOperSis());
        fields += " DEL_BENEF_XTERCER = ?, ";
        values.add(this.getDelBenefXtercer());
        fields += " DEL_IMP_LIQUIDAR = ?, ";
        values.add(this.getDelImpLiquidar());
        fields += " DEL_PARIDAD = ?, ";
        values.add(this.getDelParidad());
        fields += " DEL_CVE_TIPO_LIQ = ?, ";
        values.add(this.getDelCveTipoLiq());
        fields += " DEL_NUM_MONEDA = ?, ";
        values.add(this.getDelNumMoneda());
        fields += " DEL_CVE_TIPO_CTA = ?, ";
        values.add(this.getDelCveTipoCta());
        fields += " DEL_NUM_BANCO = ?, ";
        values.add(this.getDelNumBanco());
        fields += " DEL_NOM_BANCO = ?, ";
        values.add(this.getDelNomBanco());
        fields += " DEL_NUM_PLAZA = ?, ";
        values.add(this.getDelNumPlaza());
        fields += " DEL_NOM_PLAZA = ?, ";
        values.add(this.getDelNomPlaza());
        fields += " DEL_NUM_SUCURSAL = ?, ";
        values.add(this.getDelNumSucursal());
        fields += " DEL_NUM_CUENTA = ?, ";
        values.add(this.getDelNumCuenta());
        fields += " DEL_NUM_PAIS = ?, ";
        values.add(this.getDelNumPais());
        fields += " DEL_NUM_CHEQUE = ?, ";
        values.add(this.getDelNumCheque());
        fields += " DEL_CTA_BANXICO = ?, ";
        values.add(this.getDelCtaBanxico());
        fields += " DEL_DIR_APER_CTA = ?, ";
        values.add(this.getDelDirAperCta());
        fields += " DEL_CODIGO_TRANS = ?, ";
        values.add(this.getDelCodigoTrans());
        fields += " DEL_NUM_INICIATIVA = ?, ";
        values.add(this.getDelNumIniciativa());
        fields += " DEL_NUM_CTAM = ?, ";
        values.add(this.getDelNumCtam());
        fields += " DEL_NUM_SCTA = ?, ";
        values.add(this.getDelNumScta());
        fields += " DEL_NUM_SSCTA = ?, ";
        values.add(this.getDelNumSscta());
        fields += " DEL_NUM_SSSCTA = ?, ";
        values.add(this.getDelNumSsscta());
        fields += " DEL_NOM_AREA = ?, ";
        values.add(this.getDelNomArea());
        fields += " DEL_CONCEPTO = ?, ";
        values.add(this.getDelConcepto());
        fields += " DEL_ANO_ALTA_REG = ?, ";
        values.add(this.getDelAnoAltaReg());
        fields += " DEL_MES_ALTA_REG = ?, ";
        values.add(this.getDelMesAltaReg());
        fields += " DEL_DIA_ALTA_REG = ?, ";
        values.add(this.getDelDiaAltaReg());
        fields += " DEL_ANO_ULT_MOD = ?, ";
        values.add(this.getDelAnoUltMod());
        fields += " DEL_MES_ULT_MOD = ?, ";
        values.add(this.getDelMesUltMod());
        fields += " DEL_DIA_ULT_MOD = ?, ";
        values.add(this.getDelDiaUltMod());
        fields += " DEL_CVE_ST_DETLIQU = ?, ";
        values.add(this.getDelCveStDetliqu());
        fields += " DEL_RUBRO = ?, ";
        values.add(this.getDelRubro());
        fields += " DEL_ENTIDAD_FIN = ?, ";
        values.add(this.getDelEntidadFin());
        fields += " DEL_CONTRATO_INTER = ?, ";
        values.add(this.getDelContratoInter());
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
        String sql = "INSERT INTO DETLIQUI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DEL_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getDelFolioOpera());

        fields += ", DEL_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getDelNumOperacion());

        fields += ", DEL_NUM_SEC_OPERA";
        fieldValues += ", ?";
        values.add(this.getDelNumSecOpera());

        fields += ", DEL_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getDelNumModulo());

        fields += ", DEL_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getDelNumTransac());

        fields += ", DEL_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDelNumContrato());

        fields += ", DEL_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDelSubContrato());

        fields += ", DEL_SUB_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getDelSubPrograma());

        fields += ", DEL_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getDelNumPersFid());

        fields += ", DEL_NOM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getDelNomPersFid());

        fields += ", DEL_TIPO_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getDelTipoPersFid());

        fields += ", DEL_FOLIO_OPER_SIS";
        fieldValues += ", ?";
        values.add(this.getDelFolioOperSis());

        fields += ", DEL_BENEF_XTERCER";
        fieldValues += ", ?";
        values.add(this.getDelBenefXtercer());

        fields += ", DEL_IMP_LIQUIDAR";
        fieldValues += ", ?";
        values.add(this.getDelImpLiquidar());

        fields += ", DEL_PARIDAD";
        fieldValues += ", ?";
        values.add(this.getDelParidad());

        fields += ", DEL_CVE_TIPO_LIQ";
        fieldValues += ", ?";
        values.add(this.getDelCveTipoLiq());

        fields += ", DEL_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getDelNumMoneda());

        fields += ", DEL_CVE_TIPO_CTA";
        fieldValues += ", ?";
        values.add(this.getDelCveTipoCta());

        fields += ", DEL_NUM_BANCO";
        fieldValues += ", ?";
        values.add(this.getDelNumBanco());

        fields += ", DEL_NOM_BANCO";
        fieldValues += ", ?";
        values.add(this.getDelNomBanco());

        fields += ", DEL_NUM_PLAZA";
        fieldValues += ", ?";
        values.add(this.getDelNumPlaza());

        fields += ", DEL_NOM_PLAZA";
        fieldValues += ", ?";
        values.add(this.getDelNomPlaza());

        fields += ", DEL_NUM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getDelNumSucursal());

        fields += ", DEL_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getDelNumCuenta());

        fields += ", DEL_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getDelNumPais());

        fields += ", DEL_NUM_CHEQUE";
        fieldValues += ", ?";
        values.add(this.getDelNumCheque());

        fields += ", DEL_CTA_BANXICO";
        fieldValues += ", ?";
        values.add(this.getDelCtaBanxico());

        fields += ", DEL_DIR_APER_CTA";
        fieldValues += ", ?";
        values.add(this.getDelDirAperCta());

        fields += ", DEL_CODIGO_TRANS";
        fieldValues += ", ?";
        values.add(this.getDelCodigoTrans());

        fields += ", DEL_NUM_INICIATIVA";
        fieldValues += ", ?";
        values.add(this.getDelNumIniciativa());

        fields += ", DEL_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getDelNumCtam());

        fields += ", DEL_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getDelNumScta());

        fields += ", DEL_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getDelNumSscta());

        fields += ", DEL_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getDelNumSsscta());

        fields += ", DEL_NOM_AREA";
        fieldValues += ", ?";
        values.add(this.getDelNomArea());

        fields += ", DEL_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getDelConcepto());

        fields += ", DEL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDelAnoAltaReg());

        fields += ", DEL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDelMesAltaReg());

        fields += ", DEL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDelDiaAltaReg());

        fields += ", DEL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDelAnoUltMod());

        fields += ", DEL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDelMesUltMod());

        fields += ", DEL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDelDiaUltMod());

        fields += ", DEL_CVE_ST_DETLIQU";
        fieldValues += ", ?";
        values.add(this.getDelCveStDetliqu());

        fields += ", DEL_RUBRO";
        fieldValues += ", ?";
        values.add(this.getDelRubro());

        fields += ", DEL_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getDelEntidadFin());

        fields += ", DEL_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getDelContratoInter());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DETLIQUI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DEL_FOLIO_OPERA = ?";
        values.add(this.getDelFolioOpera());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Detliqui instance = (Detliqui) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDelFolioOpera().equals(instance.getDelFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumOperacion().equals(instance.getDelNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumSecOpera().equals(instance.getDelNumSecOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumModulo().equals(instance.getDelNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumTransac().equals(instance.getDelNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumContrato().equals(instance.getDelNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDelSubContrato().equals(instance.getDelSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDelSubPrograma().equals(instance.getDelSubPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumPersFid().equals(instance.getDelNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getDelNomPersFid().equals(instance.getDelNomPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getDelTipoPersFid().equals(instance.getDelTipoPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getDelFolioOperSis().equals(instance.getDelFolioOperSis()))
            equalObjects = false;
        if (equalObjects && !this.getDelBenefXtercer().equals(instance.getDelBenefXtercer()))
            equalObjects = false;
        if (equalObjects && !this.getDelImpLiquidar().equals(instance.getDelImpLiquidar()))
            equalObjects = false;
        if (equalObjects && !this.getDelParidad().equals(instance.getDelParidad()))
            equalObjects = false;
        if (equalObjects && !this.getDelCveTipoLiq().equals(instance.getDelCveTipoLiq()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumMoneda().equals(instance.getDelNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getDelCveTipoCta().equals(instance.getDelCveTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumBanco().equals(instance.getDelNumBanco()))
            equalObjects = false;
        if (equalObjects && !this.getDelNomBanco().equals(instance.getDelNomBanco()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumPlaza().equals(instance.getDelNumPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getDelNomPlaza().equals(instance.getDelNomPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumSucursal().equals(instance.getDelNumSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumCuenta().equals(instance.getDelNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumPais().equals(instance.getDelNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumCheque().equals(instance.getDelNumCheque()))
            equalObjects = false;
        if (equalObjects && !this.getDelCtaBanxico().equals(instance.getDelCtaBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getDelDirAperCta().equals(instance.getDelDirAperCta()))
            equalObjects = false;
        if (equalObjects && !this.getDelCodigoTrans().equals(instance.getDelCodigoTrans()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumIniciativa().equals(instance.getDelNumIniciativa()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumCtam().equals(instance.getDelNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumScta().equals(instance.getDelNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumSscta().equals(instance.getDelNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getDelNumSsscta().equals(instance.getDelNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getDelNomArea().equals(instance.getDelNomArea()))
            equalObjects = false;
        if (equalObjects && !this.getDelConcepto().equals(instance.getDelConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getDelAnoAltaReg().equals(instance.getDelAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDelMesAltaReg().equals(instance.getDelMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDelDiaAltaReg().equals(instance.getDelDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDelAnoUltMod().equals(instance.getDelAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDelMesUltMod().equals(instance.getDelMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDelDiaUltMod().equals(instance.getDelDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDelCveStDetliqu().equals(instance.getDelCveStDetliqu()))
            equalObjects = false;
        if (equalObjects && !this.getDelRubro().equals(instance.getDelRubro()))
            equalObjects = false;
        if (equalObjects && !this.getDelEntidadFin().equals(instance.getDelEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getDelContratoInter().equals(instance.getDelContratoInter()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Detliqui result = new Detliqui();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDelFolioOpera((BigDecimal) objectData.getData("DEL_FOLIO_OPERA"));
        result.setDelNumOperacion((BigDecimal) objectData.getData("DEL_NUM_OPERACION"));
        result.setDelNumSecOpera((BigDecimal) objectData.getData("DEL_NUM_SEC_OPERA"));
        result.setDelNumModulo((BigDecimal) objectData.getData("DEL_NUM_MODULO"));
        result.setDelNumTransac((BigDecimal) objectData.getData("DEL_NUM_TRANSAC"));
        result.setDelNumContrato((BigDecimal) objectData.getData("DEL_NUM_CONTRATO"));
        result.setDelSubContrato((BigDecimal) objectData.getData("DEL_SUB_CONTRATO"));
        result.setDelSubPrograma((BigDecimal) objectData.getData("DEL_SUB_PROGRAMA"));
        result.setDelNumPersFid((BigDecimal) objectData.getData("DEL_NUM_PERS_FID"));
        result.setDelNomPersFid((String) objectData.getData("DEL_NOM_PERS_FID"));
        result.setDelTipoPersFid((String) objectData.getData("DEL_TIPO_PERS_FID"));
        result.setDelFolioOperSis((BigDecimal) objectData.getData("DEL_FOLIO_OPER_SIS"));
        result.setDelBenefXtercer((BigDecimal) objectData.getData("DEL_BENEF_XTERCER"));
        result.setDelImpLiquidar((BigDecimal) objectData.getData("DEL_IMP_LIQUIDAR"));
        result.setDelParidad((BigDecimal) objectData.getData("DEL_PARIDAD"));
        result.setDelCveTipoLiq((BigDecimal) objectData.getData("DEL_CVE_TIPO_LIQ"));
        result.setDelNumMoneda((BigDecimal) objectData.getData("DEL_NUM_MONEDA"));
        result.setDelCveTipoCta((String) objectData.getData("DEL_CVE_TIPO_CTA"));
        result.setDelNumBanco((BigDecimal) objectData.getData("DEL_NUM_BANCO"));
        result.setDelNomBanco((String) objectData.getData("DEL_NOM_BANCO"));
        result.setDelNumPlaza((BigDecimal) objectData.getData("DEL_NUM_PLAZA"));
        result.setDelNomPlaza((String) objectData.getData("DEL_NOM_PLAZA"));
        result.setDelNumSucursal((BigDecimal) objectData.getData("DEL_NUM_SUCURSAL"));
        result.setDelNumCuenta((String) objectData.getData("DEL_NUM_CUENTA"));
        result.setDelNumPais((BigDecimal) objectData.getData("DEL_NUM_PAIS"));
        result.setDelNumCheque((BigDecimal) objectData.getData("DEL_NUM_CHEQUE"));
        result.setDelCtaBanxico((String) objectData.getData("DEL_CTA_BANXICO"));
        result.setDelDirAperCta((String) objectData.getData("DEL_DIR_APER_CTA"));
        result.setDelCodigoTrans((String) objectData.getData("DEL_CODIGO_TRANS"));
        result.setDelNumIniciativa((BigDecimal) objectData.getData("DEL_NUM_INICIATIVA"));
        result.setDelNumCtam((BigDecimal) objectData.getData("DEL_NUM_CTAM"));
        result.setDelNumScta((BigDecimal) objectData.getData("DEL_NUM_SCTA"));
        result.setDelNumSscta((BigDecimal) objectData.getData("DEL_NUM_SSCTA"));
        result.setDelNumSsscta((BigDecimal) objectData.getData("DEL_NUM_SSSCTA"));
        result.setDelNomArea((String) objectData.getData("DEL_NOM_AREA"));
        result.setDelConcepto((String) objectData.getData("DEL_CONCEPTO"));
        result.setDelAnoAltaReg((BigDecimal) objectData.getData("DEL_ANO_ALTA_REG"));
        result.setDelMesAltaReg((BigDecimal) objectData.getData("DEL_MES_ALTA_REG"));
        result.setDelDiaAltaReg((BigDecimal) objectData.getData("DEL_DIA_ALTA_REG"));
        result.setDelAnoUltMod((BigDecimal) objectData.getData("DEL_ANO_ULT_MOD"));
        result.setDelMesUltMod((BigDecimal) objectData.getData("DEL_MES_ULT_MOD"));
        result.setDelDiaUltMod((BigDecimal) objectData.getData("DEL_DIA_ULT_MOD"));
        result.setDelCveStDetliqu((String) objectData.getData("DEL_CVE_ST_DETLIQU"));
        result.setDelRubro((BigDecimal) objectData.getData("DEL_RUBRO"));
        result.setDelEntidadFin((BigDecimal) objectData.getData("DEL_ENTIDAD_FIN"));
        result.setDelContratoInter((BigDecimal) objectData.getData("DEL_CONTRATO_INTER"));

        return result;

    }

}
