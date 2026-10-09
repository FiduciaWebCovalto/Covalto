package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DEPOSIT_PK", columns = { "DPO_FOLIO_RCP", "DPO_FOLIO_OPERA", "DPO_CVE_TIPO_DEP" }, sequences = { "MANUAL" })
public class Deposit extends DomainObject {

    BigDecimal dpoFolioRcp = null;
    BigDecimal dpoFolioOpera = null;
    BigDecimal dpoNumOperacion = null;
    BigDecimal dpoNumSecOpera = null;
    BigDecimal dpoNumModulo = null;
    BigDecimal dpoNumTransac = null;
    BigDecimal dpoNumContrato = null;
    BigDecimal dpoSubContrato = null;
    BigDecimal dpoSubPrograma = null;
    BigDecimal dpoNumPersFid = null;
    BigDecimal dpoFolioOperSis = null;
    BigDecimal dpoBenefXtercer = null;
    BigDecimal dpoCotizacion = null;
    String dpoNomPersFid = null;
    String dpoTipoPersFid = null;
    BigDecimal dpoCveTipoDep = null;
    BigDecimal dpoImpDeposito = null;
    BigDecimal dpoNumMoneda = null;
    BigDecimal dpoNumCheque = null;
    String dpoCveTipoCta = null;
    BigDecimal dpoNumBanco = null;
    String dpoNomBanco = null;
    BigDecimal dpoNumPlaza = null;
    String dpoNomPlaza = null;
    BigDecimal dpoNumPais = null;
    BigDecimal dpoCtaBanxico = null;
    String dpoDirAperCta = null;
    String dpoCodigoTrans = null;
    String dpoConcepto = null;
    BigDecimal dpoNumCuenta = null;
    String dpoFecha = null;
    String dpoNomInstitu = null;
    BigDecimal dpoNumRefe = null;
    BigDecimal dpoNumSucursal = null;
    String dpoNomSucursal = null;
    BigDecimal dpoNumIniciativa = null;
    BigDecimal dpoNumCtam = null;
    BigDecimal dpoNumScta = null;
    BigDecimal dpoNumSscta = null;
    BigDecimal dpoNumSsscta = null;
    BigDecimal dpoNumEnte = null;
    String dpoNomArea = null;
    BigDecimal dpoEntidadFin = null;
    BigDecimal dpoContratoInter = null;
    BigDecimal dpoPolitica = null;
    BigDecimal dpoAnoRcp = null;
    BigDecimal dpoMesRcp = null;
    BigDecimal dpoDiaRcp = null;
    BigDecimal dpoAnoAltaReg = null;
    BigDecimal dpoMesAltaReg = null;
    BigDecimal dpoDiaAltaReg = null;
    BigDecimal dpoAnoUltMod = null;
    BigDecimal dpoMesUltMod = null;
    BigDecimal dpoDiaUltMod = null;
    String dpoCveStDeposi = null;
    BigDecimal dpoConiva = null;
    BigDecimal dpoImpIva = null;
    BigDecimal dpoFolioAgend = null;
    BigDecimal dpoRubro = null;

    public Deposit() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoFolioRcp(BigDecimal dpoFolioRcp) {
        this.dpoFolioRcp = dpoFolioRcp;
    }

    public BigDecimal getDpoFolioRcp() {
        return this.dpoFolioRcp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoFolioOpera(BigDecimal dpoFolioOpera) {
        this.dpoFolioOpera = dpoFolioOpera;
    }

    public BigDecimal getDpoFolioOpera() {
        return this.dpoFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumOperacion(BigDecimal dpoNumOperacion) {
        this.dpoNumOperacion = dpoNumOperacion;
    }

    public BigDecimal getDpoNumOperacion() {
        return this.dpoNumOperacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumSecOpera(BigDecimal dpoNumSecOpera) {
        this.dpoNumSecOpera = dpoNumSecOpera;
    }

    public BigDecimal getDpoNumSecOpera() {
        return this.dpoNumSecOpera;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumModulo(BigDecimal dpoNumModulo) {
        this.dpoNumModulo = dpoNumModulo;
    }

    public BigDecimal getDpoNumModulo() {
        return this.dpoNumModulo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumTransac(BigDecimal dpoNumTransac) {
        this.dpoNumTransac = dpoNumTransac;
    }

    public BigDecimal getDpoNumTransac() {
        return this.dpoNumTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumContrato(BigDecimal dpoNumContrato) {
        this.dpoNumContrato = dpoNumContrato;
    }

    public BigDecimal getDpoNumContrato() {
        return this.dpoNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoSubContrato(BigDecimal dpoSubContrato) {
        this.dpoSubContrato = dpoSubContrato;
    }

    public BigDecimal getDpoSubContrato() {
        return this.dpoSubContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoSubPrograma(BigDecimal dpoSubPrograma) {
        this.dpoSubPrograma = dpoSubPrograma;
    }

    public BigDecimal getDpoSubPrograma() {
        return this.dpoSubPrograma;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumPersFid(BigDecimal dpoNumPersFid) {
        this.dpoNumPersFid = dpoNumPersFid;
    }

    public BigDecimal getDpoNumPersFid() {
        return this.dpoNumPersFid;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoFolioOperSis(BigDecimal dpoFolioOperSis) {
        this.dpoFolioOperSis = dpoFolioOperSis;
    }

    public BigDecimal getDpoFolioOperSis() {
        return this.dpoFolioOperSis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoBenefXtercer(BigDecimal dpoBenefXtercer) {
        this.dpoBenefXtercer = dpoBenefXtercer;
    }

    public BigDecimal getDpoBenefXtercer() {
        return this.dpoBenefXtercer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDpoCotizacion(BigDecimal dpoCotizacion) {
        this.dpoCotizacion = dpoCotizacion;
    }

    public BigDecimal getDpoCotizacion() {
        return this.dpoCotizacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoNomPersFid(String dpoNomPersFid) {
        this.dpoNomPersFid = dpoNomPersFid;
    }

    public String getDpoNomPersFid() {
        return this.dpoNomPersFid;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoTipoPersFid(String dpoTipoPersFid) {
        this.dpoTipoPersFid = dpoTipoPersFid;
    }

    public String getDpoTipoPersFid() {
        return this.dpoTipoPersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDpoCveTipoDep(BigDecimal dpoCveTipoDep) {
        this.dpoCveTipoDep = dpoCveTipoDep;
    }

    public BigDecimal getDpoCveTipoDep() {
        return this.dpoCveTipoDep;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDpoImpDeposito(BigDecimal dpoImpDeposito) {
        this.dpoImpDeposito = dpoImpDeposito;
    }

    public BigDecimal getDpoImpDeposito() {
        return this.dpoImpDeposito;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumMoneda(BigDecimal dpoNumMoneda) {
        this.dpoNumMoneda = dpoNumMoneda;
    }

    public BigDecimal getDpoNumMoneda() {
        return this.dpoNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumCheque(BigDecimal dpoNumCheque) {
        this.dpoNumCheque = dpoNumCheque;
    }

    public BigDecimal getDpoNumCheque() {
        return this.dpoNumCheque;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoCveTipoCta(String dpoCveTipoCta) {
        this.dpoCveTipoCta = dpoCveTipoCta;
    }

    public String getDpoCveTipoCta() {
        return this.dpoCveTipoCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumBanco(BigDecimal dpoNumBanco) {
        this.dpoNumBanco = dpoNumBanco;
    }

    public BigDecimal getDpoNumBanco() {
        return this.dpoNumBanco;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoNomBanco(String dpoNomBanco) {
        this.dpoNomBanco = dpoNomBanco;
    }

    public String getDpoNomBanco() {
        return this.dpoNomBanco;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumPlaza(BigDecimal dpoNumPlaza) {
        this.dpoNumPlaza = dpoNumPlaza;
    }

    public BigDecimal getDpoNumPlaza() {
        return this.dpoNumPlaza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoNomPlaza(String dpoNomPlaza) {
        this.dpoNomPlaza = dpoNomPlaza;
    }

    public String getDpoNomPlaza() {
        return this.dpoNomPlaza;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumPais(BigDecimal dpoNumPais) {
        this.dpoNumPais = dpoNumPais;
    }

    public BigDecimal getDpoNumPais() {
        return this.dpoNumPais;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setDpoCtaBanxico(BigDecimal dpoCtaBanxico) {
        this.dpoCtaBanxico = dpoCtaBanxico;
    }

    public BigDecimal getDpoCtaBanxico() {
        return this.dpoCtaBanxico;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoDirAperCta(String dpoDirAperCta) {
        this.dpoDirAperCta = dpoDirAperCta;
    }

    public String getDpoDirAperCta() {
        return this.dpoDirAperCta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoCodigoTrans(String dpoCodigoTrans) {
        this.dpoCodigoTrans = dpoCodigoTrans;
    }

    public String getDpoCodigoTrans() {
        return this.dpoCodigoTrans;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoConcepto(String dpoConcepto) {
        this.dpoConcepto = dpoConcepto;
    }

    public String getDpoConcepto() {
        return this.dpoConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 30, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumCuenta(BigDecimal dpoNumCuenta) {
        this.dpoNumCuenta = dpoNumCuenta;
    }

    public BigDecimal getDpoNumCuenta() {
        return this.dpoNumCuenta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoFecha(String dpoFecha) {
        this.dpoFecha = dpoFecha;
    }

    public String getDpoFecha() {
        return this.dpoFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoNomInstitu(String dpoNomInstitu) {
        this.dpoNomInstitu = dpoNomInstitu;
    }

    public String getDpoNomInstitu() {
        return this.dpoNomInstitu;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumRefe(BigDecimal dpoNumRefe) {
        this.dpoNumRefe = dpoNumRefe;
    }

    public BigDecimal getDpoNumRefe() {
        return this.dpoNumRefe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumSucursal(BigDecimal dpoNumSucursal) {
        this.dpoNumSucursal = dpoNumSucursal;
    }

    public BigDecimal getDpoNumSucursal() {
        return this.dpoNumSucursal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoNomSucursal(String dpoNomSucursal) {
        this.dpoNomSucursal = dpoNomSucursal;
    }

    public String getDpoNomSucursal() {
        return this.dpoNomSucursal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumIniciativa(BigDecimal dpoNumIniciativa) {
        this.dpoNumIniciativa = dpoNumIniciativa;
    }

    public BigDecimal getDpoNumIniciativa() {
        return this.dpoNumIniciativa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumCtam(BigDecimal dpoNumCtam) {
        this.dpoNumCtam = dpoNumCtam;
    }

    public BigDecimal getDpoNumCtam() {
        return this.dpoNumCtam;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumScta(BigDecimal dpoNumScta) {
        this.dpoNumScta = dpoNumScta;
    }

    public BigDecimal getDpoNumScta() {
        return this.dpoNumScta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumSscta(BigDecimal dpoNumSscta) {
        this.dpoNumSscta = dpoNumSscta;
    }

    public BigDecimal getDpoNumSscta() {
        return this.dpoNumSscta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumSsscta(BigDecimal dpoNumSsscta) {
        this.dpoNumSsscta = dpoNumSsscta;
    }

    public BigDecimal getDpoNumSsscta() {
        return this.dpoNumSsscta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoNumEnte(BigDecimal dpoNumEnte) {
        this.dpoNumEnte = dpoNumEnte;
    }

    public BigDecimal getDpoNumEnte() {
        return this.dpoNumEnte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoNomArea(String dpoNomArea) {
        this.dpoNomArea = dpoNomArea;
    }

    public String getDpoNomArea() {
        return this.dpoNomArea;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoEntidadFin(BigDecimal dpoEntidadFin) {
        this.dpoEntidadFin = dpoEntidadFin;
    }

    public BigDecimal getDpoEntidadFin() {
        return this.dpoEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setDpoContratoInter(BigDecimal dpoContratoInter) {
        this.dpoContratoInter = dpoContratoInter;
    }

    public BigDecimal getDpoContratoInter() {
        return this.dpoContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDpoPolitica(BigDecimal dpoPolitica) {
        this.dpoPolitica = dpoPolitica;
    }

    public BigDecimal getDpoPolitica() {
        return this.dpoPolitica;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDpoAnoRcp(BigDecimal dpoAnoRcp) {
        this.dpoAnoRcp = dpoAnoRcp;
    }

    public BigDecimal getDpoAnoRcp() {
        return this.dpoAnoRcp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDpoMesRcp(BigDecimal dpoMesRcp) {
        this.dpoMesRcp = dpoMesRcp;
    }

    public BigDecimal getDpoMesRcp() {
        return this.dpoMesRcp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDpoDiaRcp(BigDecimal dpoDiaRcp) {
        this.dpoDiaRcp = dpoDiaRcp;
    }

    public BigDecimal getDpoDiaRcp() {
        return this.dpoDiaRcp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDpoAnoAltaReg(BigDecimal dpoAnoAltaReg) {
        this.dpoAnoAltaReg = dpoAnoAltaReg;
    }

    public BigDecimal getDpoAnoAltaReg() {
        return this.dpoAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDpoMesAltaReg(BigDecimal dpoMesAltaReg) {
        this.dpoMesAltaReg = dpoMesAltaReg;
    }

    public BigDecimal getDpoMesAltaReg() {
        return this.dpoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDpoDiaAltaReg(BigDecimal dpoDiaAltaReg) {
        this.dpoDiaAltaReg = dpoDiaAltaReg;
    }

    public BigDecimal getDpoDiaAltaReg() {
        return this.dpoDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDpoAnoUltMod(BigDecimal dpoAnoUltMod) {
        this.dpoAnoUltMod = dpoAnoUltMod;
    }

    public BigDecimal getDpoAnoUltMod() {
        return this.dpoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDpoMesUltMod(BigDecimal dpoMesUltMod) {
        this.dpoMesUltMod = dpoMesUltMod;
    }

    public BigDecimal getDpoMesUltMod() {
        return this.dpoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDpoDiaUltMod(BigDecimal dpoDiaUltMod) {
        this.dpoDiaUltMod = dpoDiaUltMod;
    }

    public BigDecimal getDpoDiaUltMod() {
        return this.dpoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDpoCveStDeposi(String dpoCveStDeposi) {
        this.dpoCveStDeposi = dpoCveStDeposi;
    }

    public String getDpoCveStDeposi() {
        return this.dpoCveStDeposi;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDpoConiva(BigDecimal dpoConiva) {
        this.dpoConiva = dpoConiva;
    }

    public BigDecimal getDpoConiva() {
        return this.dpoConiva;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDpoImpIva(BigDecimal dpoImpIva) {
        this.dpoImpIva = dpoImpIva;
    }

    public BigDecimal getDpoImpIva() {
        return this.dpoImpIva;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoFolioAgend(BigDecimal dpoFolioAgend) {
        this.dpoFolioAgend = dpoFolioAgend;
    }

    public BigDecimal getDpoFolioAgend() {
        return this.dpoFolioAgend;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDpoRubro(BigDecimal dpoRubro) {
        this.dpoRubro = dpoRubro;
    }

    public BigDecimal getDpoRubro() {
        return this.dpoRubro;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DEPOSIT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDpoFolioRcp() != null && this.getDpoFolioRcp().longValue() == -999) {
            conditions += " AND DPO_FOLIO_RCP IS NULL";
        } else if (this.getDpoFolioRcp() != null) {
            conditions += " AND DPO_FOLIO_RCP = ?";
            values.add(this.getDpoFolioRcp());
        }

        if (this.getDpoFolioOpera() != null && this.getDpoFolioOpera().longValue() == -999) {
            conditions += " AND DPO_FOLIO_OPERA IS NULL";
        } else if (this.getDpoFolioOpera() != null) {
            conditions += " AND DPO_FOLIO_OPERA = ?";
            values.add(this.getDpoFolioOpera());
        }

        if (this.getDpoCveTipoDep() != null && this.getDpoCveTipoDep().longValue() == -999) {
            conditions += " AND DPO_CVE_TIPO_DEP IS NULL";
        } else if (this.getDpoCveTipoDep() != null) {
            conditions += " AND DPO_CVE_TIPO_DEP = ?";
            values.add(this.getDpoCveTipoDep());
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
        String sql = "SELECT * FROM DEPOSIT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDpoFolioRcp() != null && this.getDpoFolioRcp().longValue() == -999) {
            conditions += " AND DPO_FOLIO_RCP IS NULL";
        } else if (this.getDpoFolioRcp() != null) {
            conditions += " AND DPO_FOLIO_RCP = ?";
            values.add(this.getDpoFolioRcp());
        }

        if (this.getDpoFolioOpera() != null && this.getDpoFolioOpera().longValue() == -999) {
            conditions += " AND DPO_FOLIO_OPERA IS NULL";
        } else if (this.getDpoFolioOpera() != null) {
            conditions += " AND DPO_FOLIO_OPERA = ?";
            values.add(this.getDpoFolioOpera());
        }

        if (this.getDpoNumOperacion() != null && this.getDpoNumOperacion().longValue() == -999) {
            conditions += " AND DPO_NUM_OPERACION IS NULL";
        } else if (this.getDpoNumOperacion() != null) {
            conditions += " AND DPO_NUM_OPERACION = ?";
            values.add(this.getDpoNumOperacion());
        }

        if (this.getDpoNumSecOpera() != null && this.getDpoNumSecOpera().longValue() == -999) {
            conditions += " AND DPO_NUM_SEC_OPERA IS NULL";
        } else if (this.getDpoNumSecOpera() != null) {
            conditions += " AND DPO_NUM_SEC_OPERA = ?";
            values.add(this.getDpoNumSecOpera());
        }

        if (this.getDpoNumModulo() != null && this.getDpoNumModulo().longValue() == -999) {
            conditions += " AND DPO_NUM_MODULO IS NULL";
        } else if (this.getDpoNumModulo() != null) {
            conditions += " AND DPO_NUM_MODULO = ?";
            values.add(this.getDpoNumModulo());
        }

        if (this.getDpoNumTransac() != null && this.getDpoNumTransac().longValue() == -999) {
            conditions += " AND DPO_NUM_TRANSAC IS NULL";
        } else if (this.getDpoNumTransac() != null) {
            conditions += " AND DPO_NUM_TRANSAC = ?";
            values.add(this.getDpoNumTransac());
        }

        if (this.getDpoNumContrato() != null && this.getDpoNumContrato().longValue() == -999) {
            conditions += " AND DPO_NUM_CONTRATO IS NULL";
        } else if (this.getDpoNumContrato() != null) {
            conditions += " AND DPO_NUM_CONTRATO = ?";
            values.add(this.getDpoNumContrato());
        }

        if (this.getDpoSubContrato() != null && this.getDpoSubContrato().longValue() == -999) {
            conditions += " AND DPO_SUB_CONTRATO IS NULL";
        } else if (this.getDpoSubContrato() != null) {
            conditions += " AND DPO_SUB_CONTRATO = ?";
            values.add(this.getDpoSubContrato());
        }

        if (this.getDpoSubPrograma() != null && this.getDpoSubPrograma().longValue() == -999) {
            conditions += " AND DPO_SUB_PROGRAMA IS NULL";
        } else if (this.getDpoSubPrograma() != null) {
            conditions += " AND DPO_SUB_PROGRAMA = ?";
            values.add(this.getDpoSubPrograma());
        }

        if (this.getDpoNumPersFid() != null && this.getDpoNumPersFid().longValue() == -999) {
            conditions += " AND DPO_NUM_PERS_FID IS NULL";
        } else if (this.getDpoNumPersFid() != null) {
            conditions += " AND DPO_NUM_PERS_FID = ?";
            values.add(this.getDpoNumPersFid());
        }

        if (this.getDpoFolioOperSis() != null && this.getDpoFolioOperSis().longValue() == -999) {
            conditions += " AND DPO_FOLIO_OPER_SIS IS NULL";
        } else if (this.getDpoFolioOperSis() != null) {
            conditions += " AND DPO_FOLIO_OPER_SIS = ?";
            values.add(this.getDpoFolioOperSis());
        }

        if (this.getDpoBenefXtercer() != null && this.getDpoBenefXtercer().longValue() == -999) {
            conditions += " AND DPO_BENEF_XTERCER IS NULL";
        } else if (this.getDpoBenefXtercer() != null) {
            conditions += " AND DPO_BENEF_XTERCER = ?";
            values.add(this.getDpoBenefXtercer());
        }

        if (this.getDpoCotizacion() != null && this.getDpoCotizacion().longValue() == -999) {
            conditions += " AND DPO_COTIZACION IS NULL";
        } else if (this.getDpoCotizacion() != null) {
            conditions += " AND DPO_COTIZACION = ?";
            values.add(this.getDpoCotizacion());
        }

        if (this.getDpoNomPersFid() != null && "null".equals(this.getDpoNomPersFid())) {
            conditions += " AND DPO_NOM_PERS_FID IS NULL";
        } else if (this.getDpoNomPersFid() != null) {
            conditions += " AND DPO_NOM_PERS_FID = ?";
            values.add(this.getDpoNomPersFid());
        }

        if (this.getDpoTipoPersFid() != null && "null".equals(this.getDpoTipoPersFid())) {
            conditions += " AND DPO_TIPO_PERS_FID IS NULL";
        } else if (this.getDpoTipoPersFid() != null) {
            conditions += " AND DPO_TIPO_PERS_FID = ?";
            values.add(this.getDpoTipoPersFid());
        }

        if (this.getDpoCveTipoDep() != null && this.getDpoCveTipoDep().longValue() == -999) {
            conditions += " AND DPO_CVE_TIPO_DEP IS NULL";
        } else if (this.getDpoCveTipoDep() != null) {
            conditions += " AND DPO_CVE_TIPO_DEP = ?";
            values.add(this.getDpoCveTipoDep());
        }

        if (this.getDpoImpDeposito() != null && this.getDpoImpDeposito().longValue() == -999) {
            conditions += " AND DPO_IMP_DEPOSITO IS NULL";
        } else if (this.getDpoImpDeposito() != null) {
            conditions += " AND DPO_IMP_DEPOSITO = ?";
            values.add(this.getDpoImpDeposito());
        }

        if (this.getDpoNumMoneda() != null && this.getDpoNumMoneda().longValue() == -999) {
            conditions += " AND DPO_NUM_MONEDA IS NULL";
        } else if (this.getDpoNumMoneda() != null) {
            conditions += " AND DPO_NUM_MONEDA = ?";
            values.add(this.getDpoNumMoneda());
        }

        if (this.getDpoNumCheque() != null && this.getDpoNumCheque().longValue() == -999) {
            conditions += " AND DPO_NUM_CHEQUE IS NULL";
        } else if (this.getDpoNumCheque() != null) {
            conditions += " AND DPO_NUM_CHEQUE = ?";
            values.add(this.getDpoNumCheque());
        }

        if (this.getDpoCveTipoCta() != null && "null".equals(this.getDpoCveTipoCta())) {
            conditions += " AND DPO_CVE_TIPO_CTA IS NULL";
        } else if (this.getDpoCveTipoCta() != null) {
            conditions += " AND DPO_CVE_TIPO_CTA = ?";
            values.add(this.getDpoCveTipoCta());
        }

        if (this.getDpoNumBanco() != null && this.getDpoNumBanco().longValue() == -999) {
            conditions += " AND DPO_NUM_BANCO IS NULL";
        } else if (this.getDpoNumBanco() != null) {
            conditions += " AND DPO_NUM_BANCO = ?";
            values.add(this.getDpoNumBanco());
        }

        if (this.getDpoNomBanco() != null && "null".equals(this.getDpoNomBanco())) {
            conditions += " AND DPO_NOM_BANCO IS NULL";
        } else if (this.getDpoNomBanco() != null) {
            conditions += " AND DPO_NOM_BANCO = ?";
            values.add(this.getDpoNomBanco());
        }

        if (this.getDpoNumPlaza() != null && this.getDpoNumPlaza().longValue() == -999) {
            conditions += " AND DPO_NUM_PLAZA IS NULL";
        } else if (this.getDpoNumPlaza() != null) {
            conditions += " AND DPO_NUM_PLAZA = ?";
            values.add(this.getDpoNumPlaza());
        }

        if (this.getDpoNomPlaza() != null && "null".equals(this.getDpoNomPlaza())) {
            conditions += " AND DPO_NOM_PLAZA IS NULL";
        } else if (this.getDpoNomPlaza() != null) {
            conditions += " AND DPO_NOM_PLAZA = ?";
            values.add(this.getDpoNomPlaza());
        }

        if (this.getDpoNumPais() != null && this.getDpoNumPais().longValue() == -999) {
            conditions += " AND DPO_NUM_PAIS IS NULL";
        } else if (this.getDpoNumPais() != null) {
            conditions += " AND DPO_NUM_PAIS = ?";
            values.add(this.getDpoNumPais());
        }

        if (this.getDpoCtaBanxico() != null && this.getDpoCtaBanxico().longValue() == -999) {
            conditions += " AND DPO_CTA_BANXICO IS NULL";
        } else if (this.getDpoCtaBanxico() != null) {
            conditions += " AND DPO_CTA_BANXICO = ?";
            values.add(this.getDpoCtaBanxico());
        }

        if (this.getDpoDirAperCta() != null && "null".equals(this.getDpoDirAperCta())) {
            conditions += " AND DPO_DIR_APER_CTA IS NULL";
        } else if (this.getDpoDirAperCta() != null) {
            conditions += " AND DPO_DIR_APER_CTA = ?";
            values.add(this.getDpoDirAperCta());
        }

        if (this.getDpoCodigoTrans() != null && "null".equals(this.getDpoCodigoTrans())) {
            conditions += " AND DPO_CODIGO_TRANS IS NULL";
        } else if (this.getDpoCodigoTrans() != null) {
            conditions += " AND DPO_CODIGO_TRANS = ?";
            values.add(this.getDpoCodigoTrans());
        }

        if (this.getDpoConcepto() != null && "null".equals(this.getDpoConcepto())) {
            conditions += " AND DPO_CONCEPTO IS NULL";
        } else if (this.getDpoConcepto() != null) {
            conditions += " AND DPO_CONCEPTO = ?";
            values.add(this.getDpoConcepto());
        }

        if (this.getDpoNumCuenta() != null && this.getDpoNumCuenta().longValue() == -999) {
            conditions += " AND DPO_NUM_CUENTA IS NULL";
        } else if (this.getDpoNumCuenta() != null) {
            conditions += " AND DPO_NUM_CUENTA = ?";
            values.add(this.getDpoNumCuenta());
        }

        if (this.getDpoFecha() != null && "null".equals(this.getDpoFecha())) {
            conditions += " AND DPO_FECHA IS NULL";
        } else if (this.getDpoFecha() != null) {
            conditions += " AND DPO_FECHA = ?";
            values.add(this.getDpoFecha());
        }

        if (this.getDpoNomInstitu() != null && "null".equals(this.getDpoNomInstitu())) {
            conditions += " AND DPO_NOM_INSTITU IS NULL";
        } else if (this.getDpoNomInstitu() != null) {
            conditions += " AND DPO_NOM_INSTITU = ?";
            values.add(this.getDpoNomInstitu());
        }

        if (this.getDpoNumRefe() != null && this.getDpoNumRefe().longValue() == -999) {
            conditions += " AND DPO_NUM_REFE IS NULL";
        } else if (this.getDpoNumRefe() != null) {
            conditions += " AND DPO_NUM_REFE = ?";
            values.add(this.getDpoNumRefe());
        }

        if (this.getDpoNumSucursal() != null && this.getDpoNumSucursal().longValue() == -999) {
            conditions += " AND DPO_NUM_SUCURSAL IS NULL";
        } else if (this.getDpoNumSucursal() != null) {
            conditions += " AND DPO_NUM_SUCURSAL = ?";
            values.add(this.getDpoNumSucursal());
        }

        if (this.getDpoNomSucursal() != null && "null".equals(this.getDpoNomSucursal())) {
            conditions += " AND DPO_NOM_SUCURSAL IS NULL";
        } else if (this.getDpoNomSucursal() != null) {
            conditions += " AND DPO_NOM_SUCURSAL = ?";
            values.add(this.getDpoNomSucursal());
        }

        if (this.getDpoNumIniciativa() != null && this.getDpoNumIniciativa().longValue() == -999) {
            conditions += " AND DPO_NUM_INICIATIVA IS NULL";
        } else if (this.getDpoNumIniciativa() != null) {
            conditions += " AND DPO_NUM_INICIATIVA = ?";
            values.add(this.getDpoNumIniciativa());
        }

        if (this.getDpoNumCtam() != null && this.getDpoNumCtam().longValue() == -999) {
            conditions += " AND DPO_NUM_CTAM IS NULL";
        } else if (this.getDpoNumCtam() != null) {
            conditions += " AND DPO_NUM_CTAM = ?";
            values.add(this.getDpoNumCtam());
        }

        if (this.getDpoNumScta() != null && this.getDpoNumScta().longValue() == -999) {
            conditions += " AND DPO_NUM_SCTA IS NULL";
        } else if (this.getDpoNumScta() != null) {
            conditions += " AND DPO_NUM_SCTA = ?";
            values.add(this.getDpoNumScta());
        }

        if (this.getDpoNumSscta() != null && this.getDpoNumSscta().longValue() == -999) {
            conditions += " AND DPO_NUM_SSCTA IS NULL";
        } else if (this.getDpoNumSscta() != null) {
            conditions += " AND DPO_NUM_SSCTA = ?";
            values.add(this.getDpoNumSscta());
        }

        if (this.getDpoNumSsscta() != null && this.getDpoNumSsscta().longValue() == -999) {
            conditions += " AND DPO_NUM_SSSCTA IS NULL";
        } else if (this.getDpoNumSsscta() != null) {
            conditions += " AND DPO_NUM_SSSCTA = ?";
            values.add(this.getDpoNumSsscta());
        }

        if (this.getDpoNumEnte() != null && this.getDpoNumEnte().longValue() == -999) {
            conditions += " AND DPO_NUM_ENTE IS NULL";
        } else if (this.getDpoNumEnte() != null) {
            conditions += " AND DPO_NUM_ENTE = ?";
            values.add(this.getDpoNumEnte());
        }

        if (this.getDpoNomArea() != null && "null".equals(this.getDpoNomArea())) {
            conditions += " AND DPO_NOM_AREA IS NULL";
        } else if (this.getDpoNomArea() != null) {
            conditions += " AND DPO_NOM_AREA = ?";
            values.add(this.getDpoNomArea());
        }

        if (this.getDpoEntidadFin() != null && this.getDpoEntidadFin().longValue() == -999) {
            conditions += " AND DPO_ENTIDAD_FIN IS NULL";
        } else if (this.getDpoEntidadFin() != null) {
            conditions += " AND DPO_ENTIDAD_FIN = ?";
            values.add(this.getDpoEntidadFin());
        }

        if (this.getDpoContratoInter() != null && this.getDpoContratoInter().longValue() == -999) {
            conditions += " AND DPO_CONTRATO_INTER IS NULL";
        } else if (this.getDpoContratoInter() != null) {
            conditions += " AND DPO_CONTRATO_INTER = ?";
            values.add(this.getDpoContratoInter());
        }

        if (this.getDpoPolitica() != null && this.getDpoPolitica().longValue() == -999) {
            conditions += " AND DPO_POLITICA IS NULL";
        } else if (this.getDpoPolitica() != null) {
            conditions += " AND DPO_POLITICA = ?";
            values.add(this.getDpoPolitica());
        }

        if (this.getDpoAnoRcp() != null && this.getDpoAnoRcp().longValue() == -999) {
            conditions += " AND DPO_ANO_RCP IS NULL";
        } else if (this.getDpoAnoRcp() != null) {
            conditions += " AND DPO_ANO_RCP = ?";
            values.add(this.getDpoAnoRcp());
        }

        if (this.getDpoMesRcp() != null && this.getDpoMesRcp().longValue() == -999) {
            conditions += " AND DPO_MES_RCP IS NULL";
        } else if (this.getDpoMesRcp() != null) {
            conditions += " AND DPO_MES_RCP = ?";
            values.add(this.getDpoMesRcp());
        }

        if (this.getDpoDiaRcp() != null && this.getDpoDiaRcp().longValue() == -999) {
            conditions += " AND DPO_DIA_RCP IS NULL";
        } else if (this.getDpoDiaRcp() != null) {
            conditions += " AND DPO_DIA_RCP = ?";
            values.add(this.getDpoDiaRcp());
        }

        if (this.getDpoAnoAltaReg() != null && this.getDpoAnoAltaReg().longValue() == -999) {
            conditions += " AND DPO_ANO_ALTA_REG IS NULL";
        } else if (this.getDpoAnoAltaReg() != null) {
            conditions += " AND DPO_ANO_ALTA_REG = ?";
            values.add(this.getDpoAnoAltaReg());
        }

        if (this.getDpoMesAltaReg() != null && this.getDpoMesAltaReg().longValue() == -999) {
            conditions += " AND DPO_MES_ALTA_REG IS NULL";
        } else if (this.getDpoMesAltaReg() != null) {
            conditions += " AND DPO_MES_ALTA_REG = ?";
            values.add(this.getDpoMesAltaReg());
        }

        if (this.getDpoDiaAltaReg() != null && this.getDpoDiaAltaReg().longValue() == -999) {
            conditions += " AND DPO_DIA_ALTA_REG IS NULL";
        } else if (this.getDpoDiaAltaReg() != null) {
            conditions += " AND DPO_DIA_ALTA_REG = ?";
            values.add(this.getDpoDiaAltaReg());
        }

        if (this.getDpoAnoUltMod() != null && this.getDpoAnoUltMod().longValue() == -999) {
            conditions += " AND DPO_ANO_ULT_MOD IS NULL";
        } else if (this.getDpoAnoUltMod() != null) {
            conditions += " AND DPO_ANO_ULT_MOD = ?";
            values.add(this.getDpoAnoUltMod());
        }

        if (this.getDpoMesUltMod() != null && this.getDpoMesUltMod().longValue() == -999) {
            conditions += " AND DPO_MES_ULT_MOD IS NULL";
        } else if (this.getDpoMesUltMod() != null) {
            conditions += " AND DPO_MES_ULT_MOD = ?";
            values.add(this.getDpoMesUltMod());
        }

        if (this.getDpoDiaUltMod() != null && this.getDpoDiaUltMod().longValue() == -999) {
            conditions += " AND DPO_DIA_ULT_MOD IS NULL";
        } else if (this.getDpoDiaUltMod() != null) {
            conditions += " AND DPO_DIA_ULT_MOD = ?";
            values.add(this.getDpoDiaUltMod());
        }

        if (this.getDpoCveStDeposi() != null && "null".equals(this.getDpoCveStDeposi())) {
            conditions += " AND DPO_CVE_ST_DEPOSI IS NULL";
        } else if (this.getDpoCveStDeposi() != null) {
            conditions += " AND DPO_CVE_ST_DEPOSI = ?";
            values.add(this.getDpoCveStDeposi());
        }

        if (this.getDpoConiva() != null && this.getDpoConiva().longValue() == -999) {
            conditions += " AND DPO_CONIVA IS NULL";
        } else if (this.getDpoConiva() != null) {
            conditions += " AND DPO_CONIVA = ?";
            values.add(this.getDpoConiva());
        }

        if (this.getDpoImpIva() != null && this.getDpoImpIva().longValue() == -999) {
            conditions += " AND DPO_IMP_IVA IS NULL";
        } else if (this.getDpoImpIva() != null) {
            conditions += " AND DPO_IMP_IVA = ?";
            values.add(this.getDpoImpIva());
        }

        if (this.getDpoFolioAgend() != null && this.getDpoFolioAgend().longValue() == -999) {
            conditions += " AND DPO_FOLIO_AGEND IS NULL";
        } else if (this.getDpoFolioAgend() != null) {
            conditions += " AND DPO_FOLIO_AGEND = ?";
            values.add(this.getDpoFolioAgend());
        }

        if (this.getDpoRubro() != null && this.getDpoRubro().longValue() == -999) {
            conditions += " AND DPO_RUBRO IS NULL";
        } else if (this.getDpoRubro() != null) {
            conditions += " AND DPO_RUBRO = ?";
            values.add(this.getDpoRubro());
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
        String sql = "UPDATE DEPOSIT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DPO_FOLIO_RCP = ?";
        pkValues.add(this.getDpoFolioRcp());
        conditions += " AND DPO_FOLIO_OPERA = ?";
        pkValues.add(this.getDpoFolioOpera());
        fields += " DPO_NUM_OPERACION = ?, ";
        values.add(this.getDpoNumOperacion());
        fields += " DPO_NUM_SEC_OPERA = ?, ";
        values.add(this.getDpoNumSecOpera());
        fields += " DPO_NUM_MODULO = ?, ";
        values.add(this.getDpoNumModulo());
        fields += " DPO_NUM_TRANSAC = ?, ";
        values.add(this.getDpoNumTransac());
        fields += " DPO_NUM_CONTRATO = ?, ";
        values.add(this.getDpoNumContrato());
        fields += " DPO_SUB_CONTRATO = ?, ";
        values.add(this.getDpoSubContrato());
        fields += " DPO_SUB_PROGRAMA = ?, ";
        values.add(this.getDpoSubPrograma());
        fields += " DPO_NUM_PERS_FID = ?, ";
        values.add(this.getDpoNumPersFid());
        fields += " DPO_FOLIO_OPER_SIS = ?, ";
        values.add(this.getDpoFolioOperSis());
        fields += " DPO_BENEF_XTERCER = ?, ";
        values.add(this.getDpoBenefXtercer());
        fields += " DPO_COTIZACION = ?, ";
        values.add(this.getDpoCotizacion());
        fields += " DPO_NOM_PERS_FID = ?, ";
        values.add(this.getDpoNomPersFid());
        fields += " DPO_TIPO_PERS_FID = ?, ";
        values.add(this.getDpoTipoPersFid());
        conditions += " AND DPO_CVE_TIPO_DEP = ?";
        pkValues.add(this.getDpoCveTipoDep());
        fields += " DPO_IMP_DEPOSITO = ?, ";
        values.add(this.getDpoImpDeposito());
        fields += " DPO_NUM_MONEDA = ?, ";
        values.add(this.getDpoNumMoneda());
        fields += " DPO_NUM_CHEQUE = ?, ";
        values.add(this.getDpoNumCheque());
        fields += " DPO_CVE_TIPO_CTA = ?, ";
        values.add(this.getDpoCveTipoCta());
        fields += " DPO_NUM_BANCO = ?, ";
        values.add(this.getDpoNumBanco());
        fields += " DPO_NOM_BANCO = ?, ";
        values.add(this.getDpoNomBanco());
        fields += " DPO_NUM_PLAZA = ?, ";
        values.add(this.getDpoNumPlaza());
        fields += " DPO_NOM_PLAZA = ?, ";
        values.add(this.getDpoNomPlaza());
        fields += " DPO_NUM_PAIS = ?, ";
        values.add(this.getDpoNumPais());
        fields += " DPO_CTA_BANXICO = ?, ";
        values.add(this.getDpoCtaBanxico());
        fields += " DPO_DIR_APER_CTA = ?, ";
        values.add(this.getDpoDirAperCta());
        fields += " DPO_CODIGO_TRANS = ?, ";
        values.add(this.getDpoCodigoTrans());
        fields += " DPO_CONCEPTO = ?, ";
        values.add(this.getDpoConcepto());
        fields += " DPO_NUM_CUENTA = ?, ";
        values.add(this.getDpoNumCuenta());
        fields += " DPO_FECHA = ?, ";
        values.add(this.getDpoFecha());
        fields += " DPO_NOM_INSTITU = ?, ";
        values.add(this.getDpoNomInstitu());
        fields += " DPO_NUM_REFE = ?, ";
        values.add(this.getDpoNumRefe());
        fields += " DPO_NUM_SUCURSAL = ?, ";
        values.add(this.getDpoNumSucursal());
        fields += " DPO_NOM_SUCURSAL = ?, ";
        values.add(this.getDpoNomSucursal());
        fields += " DPO_NUM_INICIATIVA = ?, ";
        values.add(this.getDpoNumIniciativa());
        fields += " DPO_NUM_CTAM = ?, ";
        values.add(this.getDpoNumCtam());
        fields += " DPO_NUM_SCTA = ?, ";
        values.add(this.getDpoNumScta());
        fields += " DPO_NUM_SSCTA = ?, ";
        values.add(this.getDpoNumSscta());
        fields += " DPO_NUM_SSSCTA = ?, ";
        values.add(this.getDpoNumSsscta());
        fields += " DPO_NUM_ENTE = ?, ";
        values.add(this.getDpoNumEnte());
        fields += " DPO_NOM_AREA = ?, ";
        values.add(this.getDpoNomArea());
        fields += " DPO_ENTIDAD_FIN = ?, ";
        values.add(this.getDpoEntidadFin());
        fields += " DPO_CONTRATO_INTER = ?, ";
        values.add(this.getDpoContratoInter());
        fields += " DPO_POLITICA = ?, ";
        values.add(this.getDpoPolitica());
        fields += " DPO_ANO_RCP = ?, ";
        values.add(this.getDpoAnoRcp());
        fields += " DPO_MES_RCP = ?, ";
        values.add(this.getDpoMesRcp());
        fields += " DPO_DIA_RCP = ?, ";
        values.add(this.getDpoDiaRcp());
        fields += " DPO_ANO_ALTA_REG = ?, ";
        values.add(this.getDpoAnoAltaReg());
        fields += " DPO_MES_ALTA_REG = ?, ";
        values.add(this.getDpoMesAltaReg());
        fields += " DPO_DIA_ALTA_REG = ?, ";
        values.add(this.getDpoDiaAltaReg());
        fields += " DPO_ANO_ULT_MOD = ?, ";
        values.add(this.getDpoAnoUltMod());
        fields += " DPO_MES_ULT_MOD = ?, ";
        values.add(this.getDpoMesUltMod());
        fields += " DPO_DIA_ULT_MOD = ?, ";
        values.add(this.getDpoDiaUltMod());
        fields += " DPO_CVE_ST_DEPOSI = ?, ";
        values.add(this.getDpoCveStDeposi());
        fields += " DPO_CONIVA = ?, ";
        values.add(this.getDpoConiva());
        fields += " DPO_IMP_IVA = ?, ";
        values.add(this.getDpoImpIva());
        fields += " DPO_FOLIO_AGEND = ?, ";
        values.add(this.getDpoFolioAgend());
        fields += " DPO_RUBRO = ?, ";
        values.add(this.getDpoRubro());
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
        String sql = "INSERT INTO DEPOSIT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DPO_FOLIO_RCP";
        fieldValues += ", ?";
        values.add(this.getDpoFolioRcp());

        fields += ", DPO_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getDpoFolioOpera());

        fields += ", DPO_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getDpoNumOperacion());

        fields += ", DPO_NUM_SEC_OPERA";
        fieldValues += ", ?";
        values.add(this.getDpoNumSecOpera());

        fields += ", DPO_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getDpoNumModulo());

        fields += ", DPO_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getDpoNumTransac());

        fields += ", DPO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDpoNumContrato());

        fields += ", DPO_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDpoSubContrato());

        fields += ", DPO_SUB_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getDpoSubPrograma());

        fields += ", DPO_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getDpoNumPersFid());

        fields += ", DPO_FOLIO_OPER_SIS";
        fieldValues += ", ?";
        values.add(this.getDpoFolioOperSis());

        fields += ", DPO_BENEF_XTERCER";
        fieldValues += ", ?";
        values.add(this.getDpoBenefXtercer());

        fields += ", DPO_COTIZACION";
        fieldValues += ", ?";
        values.add(this.getDpoCotizacion());

        fields += ", DPO_NOM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getDpoNomPersFid());

        fields += ", DPO_TIPO_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getDpoTipoPersFid());

        fields += ", DPO_CVE_TIPO_DEP";
        fieldValues += ", ?";
        values.add(this.getDpoCveTipoDep());

        fields += ", DPO_IMP_DEPOSITO";
        fieldValues += ", ?";
        values.add(this.getDpoImpDeposito());

        fields += ", DPO_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getDpoNumMoneda());

        fields += ", DPO_NUM_CHEQUE";
        fieldValues += ", ?";
        values.add(this.getDpoNumCheque());

        fields += ", DPO_CVE_TIPO_CTA";
        fieldValues += ", ?";
        values.add(this.getDpoCveTipoCta());

        fields += ", DPO_NUM_BANCO";
        fieldValues += ", ?";
        values.add(this.getDpoNumBanco());

        fields += ", DPO_NOM_BANCO";
        fieldValues += ", ?";
        values.add(this.getDpoNomBanco());

        fields += ", DPO_NUM_PLAZA";
        fieldValues += ", ?";
        values.add(this.getDpoNumPlaza());

        fields += ", DPO_NOM_PLAZA";
        fieldValues += ", ?";
        values.add(this.getDpoNomPlaza());

        fields += ", DPO_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getDpoNumPais());

        fields += ", DPO_CTA_BANXICO";
        fieldValues += ", ?";
        values.add(this.getDpoCtaBanxico());

        fields += ", DPO_DIR_APER_CTA";
        fieldValues += ", ?";
        values.add(this.getDpoDirAperCta());

        fields += ", DPO_CODIGO_TRANS";
        fieldValues += ", ?";
        values.add(this.getDpoCodigoTrans());

        fields += ", DPO_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getDpoConcepto());

        fields += ", DPO_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getDpoNumCuenta());

        fields += ", DPO_FECHA";
        fieldValues += ", ?";
        values.add(this.getDpoFecha());

        fields += ", DPO_NOM_INSTITU";
        fieldValues += ", ?";
        values.add(this.getDpoNomInstitu());

        fields += ", DPO_NUM_REFE";
        fieldValues += ", ?";
        values.add(this.getDpoNumRefe());

        fields += ", DPO_NUM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getDpoNumSucursal());

        fields += ", DPO_NOM_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getDpoNomSucursal());

        fields += ", DPO_NUM_INICIATIVA";
        fieldValues += ", ?";
        values.add(this.getDpoNumIniciativa());

        fields += ", DPO_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getDpoNumCtam());

        fields += ", DPO_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getDpoNumScta());

        fields += ", DPO_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getDpoNumSscta());

        fields += ", DPO_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getDpoNumSsscta());

        fields += ", DPO_NUM_ENTE";
        fieldValues += ", ?";
        values.add(this.getDpoNumEnte());

        fields += ", DPO_NOM_AREA";
        fieldValues += ", ?";
        values.add(this.getDpoNomArea());

        fields += ", DPO_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getDpoEntidadFin());

        fields += ", DPO_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getDpoContratoInter());

        fields += ", DPO_POLITICA";
        fieldValues += ", ?";
        values.add(this.getDpoPolitica());

        fields += ", DPO_ANO_RCP";
        fieldValues += ", ?";
        values.add(this.getDpoAnoRcp());

        fields += ", DPO_MES_RCP";
        fieldValues += ", ?";
        values.add(this.getDpoMesRcp());

        fields += ", DPO_DIA_RCP";
        fieldValues += ", ?";
        values.add(this.getDpoDiaRcp());

        fields += ", DPO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDpoAnoAltaReg());

        fields += ", DPO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDpoMesAltaReg());

        fields += ", DPO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDpoDiaAltaReg());

        fields += ", DPO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDpoAnoUltMod());

        fields += ", DPO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDpoMesUltMod());

        fields += ", DPO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDpoDiaUltMod());

        fields += ", DPO_CVE_ST_DEPOSI";
        fieldValues += ", ?";
        values.add(this.getDpoCveStDeposi());

        fields += ", DPO_CONIVA";
        fieldValues += ", ?";
        values.add(this.getDpoConiva());

        fields += ", DPO_IMP_IVA";
        fieldValues += ", ?";
        values.add(this.getDpoImpIva());

        fields += ", DPO_FOLIO_AGEND";
        fieldValues += ", ?";
        values.add(this.getDpoFolioAgend());

        fields += ", DPO_RUBRO";
        fieldValues += ", ?";
        values.add(this.getDpoRubro());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DEPOSIT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DPO_FOLIO_RCP = ?";
        values.add(this.getDpoFolioRcp());
        conditions += " AND DPO_FOLIO_OPERA = ?";
        values.add(this.getDpoFolioOpera());
        conditions += " AND DPO_CVE_TIPO_DEP = ?";
        values.add(this.getDpoCveTipoDep());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Deposit instance = (Deposit) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDpoFolioRcp().equals(instance.getDpoFolioRcp()))
            equalObjects = false;
        if (equalObjects && !this.getDpoFolioOpera().equals(instance.getDpoFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumOperacion().equals(instance.getDpoNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumSecOpera().equals(instance.getDpoNumSecOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumModulo().equals(instance.getDpoNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumTransac().equals(instance.getDpoNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumContrato().equals(instance.getDpoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDpoSubContrato().equals(instance.getDpoSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDpoSubPrograma().equals(instance.getDpoSubPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumPersFid().equals(instance.getDpoNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getDpoFolioOperSis().equals(instance.getDpoFolioOperSis()))
            equalObjects = false;
        if (equalObjects && !this.getDpoBenefXtercer().equals(instance.getDpoBenefXtercer()))
            equalObjects = false;
        if (equalObjects && !this.getDpoCotizacion().equals(instance.getDpoCotizacion()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNomPersFid().equals(instance.getDpoNomPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getDpoTipoPersFid().equals(instance.getDpoTipoPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getDpoCveTipoDep().equals(instance.getDpoCveTipoDep()))
            equalObjects = false;
        if (equalObjects && !this.getDpoImpDeposito().equals(instance.getDpoImpDeposito()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumMoneda().equals(instance.getDpoNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumCheque().equals(instance.getDpoNumCheque()))
            equalObjects = false;
        if (equalObjects && !this.getDpoCveTipoCta().equals(instance.getDpoCveTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumBanco().equals(instance.getDpoNumBanco()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNomBanco().equals(instance.getDpoNomBanco()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumPlaza().equals(instance.getDpoNumPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNomPlaza().equals(instance.getDpoNomPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumPais().equals(instance.getDpoNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getDpoCtaBanxico().equals(instance.getDpoCtaBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getDpoDirAperCta().equals(instance.getDpoDirAperCta()))
            equalObjects = false;
        if (equalObjects && !this.getDpoCodigoTrans().equals(instance.getDpoCodigoTrans()))
            equalObjects = false;
        if (equalObjects && !this.getDpoConcepto().equals(instance.getDpoConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumCuenta().equals(instance.getDpoNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getDpoFecha().equals(instance.getDpoFecha()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNomInstitu().equals(instance.getDpoNomInstitu()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumRefe().equals(instance.getDpoNumRefe()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumSucursal().equals(instance.getDpoNumSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNomSucursal().equals(instance.getDpoNomSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumIniciativa().equals(instance.getDpoNumIniciativa()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumCtam().equals(instance.getDpoNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumScta().equals(instance.getDpoNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumSscta().equals(instance.getDpoNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumSsscta().equals(instance.getDpoNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNumEnte().equals(instance.getDpoNumEnte()))
            equalObjects = false;
        if (equalObjects && !this.getDpoNomArea().equals(instance.getDpoNomArea()))
            equalObjects = false;
        if (equalObjects && !this.getDpoEntidadFin().equals(instance.getDpoEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getDpoContratoInter().equals(instance.getDpoContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getDpoPolitica().equals(instance.getDpoPolitica()))
            equalObjects = false;
        if (equalObjects && !this.getDpoAnoRcp().equals(instance.getDpoAnoRcp()))
            equalObjects = false;
        if (equalObjects && !this.getDpoMesRcp().equals(instance.getDpoMesRcp()))
            equalObjects = false;
        if (equalObjects && !this.getDpoDiaRcp().equals(instance.getDpoDiaRcp()))
            equalObjects = false;
        if (equalObjects && !this.getDpoAnoAltaReg().equals(instance.getDpoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDpoMesAltaReg().equals(instance.getDpoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDpoDiaAltaReg().equals(instance.getDpoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDpoAnoUltMod().equals(instance.getDpoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDpoMesUltMod().equals(instance.getDpoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDpoDiaUltMod().equals(instance.getDpoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDpoCveStDeposi().equals(instance.getDpoCveStDeposi()))
            equalObjects = false;
        if (equalObjects && !this.getDpoConiva().equals(instance.getDpoConiva()))
            equalObjects = false;
        if (equalObjects && !this.getDpoImpIva().equals(instance.getDpoImpIva()))
            equalObjects = false;
        if (equalObjects && !this.getDpoFolioAgend().equals(instance.getDpoFolioAgend()))
            equalObjects = false;
        if (equalObjects && !this.getDpoRubro().equals(instance.getDpoRubro()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Deposit result = new Deposit();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDpoFolioRcp((BigDecimal) objectData.getData("DPO_FOLIO_RCP"));
        result.setDpoFolioOpera((BigDecimal) objectData.getData("DPO_FOLIO_OPERA"));
        result.setDpoNumOperacion((BigDecimal) objectData.getData("DPO_NUM_OPERACION"));
        result.setDpoNumSecOpera((BigDecimal) objectData.getData("DPO_NUM_SEC_OPERA"));
        result.setDpoNumModulo((BigDecimal) objectData.getData("DPO_NUM_MODULO"));
        result.setDpoNumTransac((BigDecimal) objectData.getData("DPO_NUM_TRANSAC"));
        result.setDpoNumContrato((BigDecimal) objectData.getData("DPO_NUM_CONTRATO"));
        result.setDpoSubContrato((BigDecimal) objectData.getData("DPO_SUB_CONTRATO"));
        result.setDpoSubPrograma((BigDecimal) objectData.getData("DPO_SUB_PROGRAMA"));
        result.setDpoNumPersFid((BigDecimal) objectData.getData("DPO_NUM_PERS_FID"));
        result.setDpoFolioOperSis((BigDecimal) objectData.getData("DPO_FOLIO_OPER_SIS"));
        result.setDpoBenefXtercer((BigDecimal) objectData.getData("DPO_BENEF_XTERCER"));
        result.setDpoCotizacion((BigDecimal) objectData.getData("DPO_COTIZACION"));
        result.setDpoNomPersFid((String) objectData.getData("DPO_NOM_PERS_FID"));
        result.setDpoTipoPersFid((String) objectData.getData("DPO_TIPO_PERS_FID"));
        result.setDpoCveTipoDep((BigDecimal) objectData.getData("DPO_CVE_TIPO_DEP"));
        result.setDpoImpDeposito((BigDecimal) objectData.getData("DPO_IMP_DEPOSITO"));
        result.setDpoNumMoneda((BigDecimal) objectData.getData("DPO_NUM_MONEDA"));
        result.setDpoNumCheque((BigDecimal) objectData.getData("DPO_NUM_CHEQUE"));
        result.setDpoCveTipoCta((String) objectData.getData("DPO_CVE_TIPO_CTA"));
        result.setDpoNumBanco((BigDecimal) objectData.getData("DPO_NUM_BANCO"));
        result.setDpoNomBanco((String) objectData.getData("DPO_NOM_BANCO"));
        result.setDpoNumPlaza((BigDecimal) objectData.getData("DPO_NUM_PLAZA"));
        result.setDpoNomPlaza((String) objectData.getData("DPO_NOM_PLAZA"));
        result.setDpoNumPais((BigDecimal) objectData.getData("DPO_NUM_PAIS"));
        result.setDpoCtaBanxico((BigDecimal) objectData.getData("DPO_CTA_BANXICO"));
        result.setDpoDirAperCta((String) objectData.getData("DPO_DIR_APER_CTA"));
        result.setDpoCodigoTrans((String) objectData.getData("DPO_CODIGO_TRANS"));
        result.setDpoConcepto((String) objectData.getData("DPO_CONCEPTO"));
        result.setDpoNumCuenta((BigDecimal) objectData.getData("DPO_NUM_CUENTA"));
        result.setDpoFecha((String) objectData.getData("DPO_FECHA"));
        result.setDpoNomInstitu((String) objectData.getData("DPO_NOM_INSTITU"));
        result.setDpoNumRefe((BigDecimal) objectData.getData("DPO_NUM_REFE"));
        result.setDpoNumSucursal((BigDecimal) objectData.getData("DPO_NUM_SUCURSAL"));
        result.setDpoNomSucursal((String) objectData.getData("DPO_NOM_SUCURSAL"));
        result.setDpoNumIniciativa((BigDecimal) objectData.getData("DPO_NUM_INICIATIVA"));
        result.setDpoNumCtam((BigDecimal) objectData.getData("DPO_NUM_CTAM"));
        result.setDpoNumScta((BigDecimal) objectData.getData("DPO_NUM_SCTA"));
        result.setDpoNumSscta((BigDecimal) objectData.getData("DPO_NUM_SSCTA"));
        result.setDpoNumSsscta((BigDecimal) objectData.getData("DPO_NUM_SSSCTA"));
        result.setDpoNumEnte((BigDecimal) objectData.getData("DPO_NUM_ENTE"));
        result.setDpoNomArea((String) objectData.getData("DPO_NOM_AREA"));
        result.setDpoEntidadFin((BigDecimal) objectData.getData("DPO_ENTIDAD_FIN"));
        result.setDpoContratoInter((BigDecimal) objectData.getData("DPO_CONTRATO_INTER"));
        result.setDpoPolitica((BigDecimal) objectData.getData("DPO_POLITICA"));
        result.setDpoAnoRcp((BigDecimal) objectData.getData("DPO_ANO_RCP"));
        result.setDpoMesRcp((BigDecimal) objectData.getData("DPO_MES_RCP"));
        result.setDpoDiaRcp((BigDecimal) objectData.getData("DPO_DIA_RCP"));
        result.setDpoAnoAltaReg((BigDecimal) objectData.getData("DPO_ANO_ALTA_REG"));
        result.setDpoMesAltaReg((BigDecimal) objectData.getData("DPO_MES_ALTA_REG"));
        result.setDpoDiaAltaReg((BigDecimal) objectData.getData("DPO_DIA_ALTA_REG"));
        result.setDpoAnoUltMod((BigDecimal) objectData.getData("DPO_ANO_ULT_MOD"));
        result.setDpoMesUltMod((BigDecimal) objectData.getData("DPO_MES_ULT_MOD"));
        result.setDpoDiaUltMod((BigDecimal) objectData.getData("DPO_DIA_ULT_MOD"));
        result.setDpoCveStDeposi((String) objectData.getData("DPO_CVE_ST_DEPOSI"));
        result.setDpoConiva((BigDecimal) objectData.getData("DPO_CONIVA"));
        result.setDpoImpIva((BigDecimal) objectData.getData("DPO_IMP_IVA"));
        result.setDpoFolioAgend((BigDecimal) objectData.getData("DPO_FOLIO_AGEND"));
        result.setDpoRubro((BigDecimal) objectData.getData("DPO_RUBRO"));

        return result;

    }

}
