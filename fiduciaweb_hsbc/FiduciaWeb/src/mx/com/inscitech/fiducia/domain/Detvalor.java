package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DETVALOR_PK", columns = { "DEV_FOLIO_OPERA", "DEV_NUM_OPERACION", "DEV_NUM_SEC_OPERA", "DEV_NUM_MODULO", "DEV_NUM_TRANSAC", "DEV_NUM_CORTE" },
            sequences = { "MANUAL" })
public class Detvalor extends DomainObject {

    BigDecimal devFolioOpera = null;
    BigDecimal devNumOperacion = null;
    BigDecimal devNumSecOpera = null;
    BigDecimal devNumModulo = null;
    BigDecimal devNumTransac = null;
    BigDecimal devNumCorte = null;
    BigDecimal devNumContrato = null;
    BigDecimal devSubContrato = null;
    BigDecimal devEntidadFin = null;
    BigDecimal devContratoInter = null;
    BigDecimal devCveTipoMerca = null;
    BigDecimal devNumInstrume = null;
    BigDecimal devNumSecEmis = null;
    String devNomPizarra = null;
    String devSerieEmision = null;
    BigDecimal devNumCuponVig = null;
    BigDecimal devImpPrecioTit = null;
    BigDecimal devNumTitulos = null;
    BigDecimal devNumImpTit = null;
    BigDecimal devImpTipCambio = null;
    BigDecimal devPjeTasaDesc = null;
    BigDecimal devTasaRendimien = null;
    BigDecimal devNumPlazo = null;
    BigDecimal devFolioOperPla = null;
    BigDecimal devNumImpPremio = null;
    String devCveTipoOpera = null;
    String devCveFormaNego = null;
    BigDecimal devAnoAltaReg = null;
    BigDecimal devMesAltaReg = null;
    BigDecimal devDiaAltaReg = null;
    BigDecimal devAnoUltMod = null;
    BigDecimal devMesUltMod = null;
    BigDecimal devDiaUltMod = null;
    String devCveStDetvalo = null;
    BigDecimal devImpIntereses = null;
    BigDecimal devImpIsr = null;
    String devCveTipoDere = null;
    BigDecimal devNumTitActual = null;
    String devCveFactor = null;
    BigDecimal devImpComision = null;
    BigDecimal devImpUtilidad = null;
    BigDecimal devImpPerdida = null;
    String devNomPizarraAn = null;
    String devSerieEmisAnt = null;
    BigDecimal devCuponVigAnt = null;
    BigDecimal devNumNoneda = null;
    BigDecimal devImpMoneda = null;
    BigDecimal devTipoCambio = null;

    public Detvalor() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevFolioOpera(BigDecimal devFolioOpera) {
        this.devFolioOpera = devFolioOpera;
    }

    public BigDecimal getDevFolioOpera() {
        return this.devFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumOperacion(BigDecimal devNumOperacion) {
        this.devNumOperacion = devNumOperacion;
    }

    public BigDecimal getDevNumOperacion() {
        return this.devNumOperacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumSecOpera(BigDecimal devNumSecOpera) {
        this.devNumSecOpera = devNumSecOpera;
    }

    public BigDecimal getDevNumSecOpera() {
        return this.devNumSecOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumModulo(BigDecimal devNumModulo) {
        this.devNumModulo = devNumModulo;
    }

    public BigDecimal getDevNumModulo() {
        return this.devNumModulo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumTransac(BigDecimal devNumTransac) {
        this.devNumTransac = devNumTransac;
    }

    public BigDecimal getDevNumTransac() {
        return this.devNumTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumCorte(BigDecimal devNumCorte) {
        this.devNumCorte = devNumCorte;
    }

    public BigDecimal getDevNumCorte() {
        return this.devNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumContrato(BigDecimal devNumContrato) {
        this.devNumContrato = devNumContrato;
    }

    public BigDecimal getDevNumContrato() {
        return this.devNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevSubContrato(BigDecimal devSubContrato) {
        this.devSubContrato = devSubContrato;
    }

    public BigDecimal getDevSubContrato() {
        return this.devSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevEntidadFin(BigDecimal devEntidadFin) {
        this.devEntidadFin = devEntidadFin;
    }

    public BigDecimal getDevEntidadFin() {
        return this.devEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevContratoInter(BigDecimal devContratoInter) {
        this.devContratoInter = devContratoInter;
    }

    public BigDecimal getDevContratoInter() {
        return this.devContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevCveTipoMerca(BigDecimal devCveTipoMerca) {
        this.devCveTipoMerca = devCveTipoMerca;
    }

    public BigDecimal getDevCveTipoMerca() {
        return this.devCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumInstrume(BigDecimal devNumInstrume) {
        this.devNumInstrume = devNumInstrume;
    }

    public BigDecimal getDevNumInstrume() {
        return this.devNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumSecEmis(BigDecimal devNumSecEmis) {
        this.devNumSecEmis = devNumSecEmis;
    }

    public BigDecimal getDevNumSecEmis() {
        return this.devNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDevNomPizarra(String devNomPizarra) {
        this.devNomPizarra = devNomPizarra;
    }

    public String getDevNomPizarra() {
        return this.devNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDevSerieEmision(String devSerieEmision) {
        this.devSerieEmision = devSerieEmision;
    }

    public String getDevSerieEmision() {
        return this.devSerieEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumCuponVig(BigDecimal devNumCuponVig) {
        this.devNumCuponVig = devNumCuponVig;
    }

    public BigDecimal getDevNumCuponVig() {
        return this.devNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 26, scale = 11, javaClass = BigDecimal.class)
    public void setDevImpPrecioTit(BigDecimal devImpPrecioTit) {
        this.devImpPrecioTit = devImpPrecioTit;
    }

    public BigDecimal getDevImpPrecioTit() {
        return this.devImpPrecioTit;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumTitulos(BigDecimal devNumTitulos) {
        this.devNumTitulos = devNumTitulos;
    }

    public BigDecimal getDevNumTitulos() {
        return this.devNumTitulos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDevNumImpTit(BigDecimal devNumImpTit) {
        this.devNumImpTit = devNumImpTit;
    }

    public BigDecimal getDevNumImpTit() {
        return this.devNumImpTit;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDevImpTipCambio(BigDecimal devImpTipCambio) {
        this.devImpTipCambio = devImpTipCambio;
    }

    public BigDecimal getDevImpTipCambio() {
        return this.devImpTipCambio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setDevPjeTasaDesc(BigDecimal devPjeTasaDesc) {
        this.devPjeTasaDesc = devPjeTasaDesc;
    }

    public BigDecimal getDevPjeTasaDesc() {
        return this.devPjeTasaDesc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setDevTasaRendimien(BigDecimal devTasaRendimien) {
        this.devTasaRendimien = devTasaRendimien;
    }

    public BigDecimal getDevTasaRendimien() {
        return this.devTasaRendimien;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumPlazo(BigDecimal devNumPlazo) {
        this.devNumPlazo = devNumPlazo;
    }

    public BigDecimal getDevNumPlazo() {
        return this.devNumPlazo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevFolioOperPla(BigDecimal devFolioOperPla) {
        this.devFolioOperPla = devFolioOperPla;
    }

    public BigDecimal getDevFolioOperPla() {
        return this.devFolioOperPla;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDevNumImpPremio(BigDecimal devNumImpPremio) {
        this.devNumImpPremio = devNumImpPremio;
    }

    public BigDecimal getDevNumImpPremio() {
        return this.devNumImpPremio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDevCveTipoOpera(String devCveTipoOpera) {
        this.devCveTipoOpera = devCveTipoOpera;
    }

    public String getDevCveTipoOpera() {
        return this.devCveTipoOpera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDevCveFormaNego(String devCveFormaNego) {
        this.devCveFormaNego = devCveFormaNego;
    }

    public String getDevCveFormaNego() {
        return this.devCveFormaNego;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDevAnoAltaReg(BigDecimal devAnoAltaReg) {
        this.devAnoAltaReg = devAnoAltaReg;
    }

    public BigDecimal getDevAnoAltaReg() {
        return this.devAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDevMesAltaReg(BigDecimal devMesAltaReg) {
        this.devMesAltaReg = devMesAltaReg;
    }

    public BigDecimal getDevMesAltaReg() {
        return this.devMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDevDiaAltaReg(BigDecimal devDiaAltaReg) {
        this.devDiaAltaReg = devDiaAltaReg;
    }

    public BigDecimal getDevDiaAltaReg() {
        return this.devDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDevAnoUltMod(BigDecimal devAnoUltMod) {
        this.devAnoUltMod = devAnoUltMod;
    }

    public BigDecimal getDevAnoUltMod() {
        return this.devAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDevMesUltMod(BigDecimal devMesUltMod) {
        this.devMesUltMod = devMesUltMod;
    }

    public BigDecimal getDevMesUltMod() {
        return this.devMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDevDiaUltMod(BigDecimal devDiaUltMod) {
        this.devDiaUltMod = devDiaUltMod;
    }

    public BigDecimal getDevDiaUltMod() {
        return this.devDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDevCveStDetvalo(String devCveStDetvalo) {
        this.devCveStDetvalo = devCveStDetvalo;
    }

    public String getDevCveStDetvalo() {
        return this.devCveStDetvalo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDevImpIntereses(BigDecimal devImpIntereses) {
        this.devImpIntereses = devImpIntereses;
    }

    public BigDecimal getDevImpIntereses() {
        return this.devImpIntereses;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDevImpIsr(BigDecimal devImpIsr) {
        this.devImpIsr = devImpIsr;
    }

    public BigDecimal getDevImpIsr() {
        return this.devImpIsr;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDevCveTipoDere(String devCveTipoDere) {
        this.devCveTipoDere = devCveTipoDere;
    }

    public String getDevCveTipoDere() {
        return this.devCveTipoDere;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumTitActual(BigDecimal devNumTitActual) {
        this.devNumTitActual = devNumTitActual;
    }

    public BigDecimal getDevNumTitActual() {
        return this.devNumTitActual;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDevCveFactor(String devCveFactor) {
        this.devCveFactor = devCveFactor;
    }

    public String getDevCveFactor() {
        return this.devCveFactor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDevImpComision(BigDecimal devImpComision) {
        this.devImpComision = devImpComision;
    }

    public BigDecimal getDevImpComision() {
        return this.devImpComision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDevImpUtilidad(BigDecimal devImpUtilidad) {
        this.devImpUtilidad = devImpUtilidad;
    }

    public BigDecimal getDevImpUtilidad() {
        return this.devImpUtilidad;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDevImpPerdida(BigDecimal devImpPerdida) {
        this.devImpPerdida = devImpPerdida;
    }

    public BigDecimal getDevImpPerdida() {
        return this.devImpPerdida;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDevNomPizarraAn(String devNomPizarraAn) {
        this.devNomPizarraAn = devNomPizarraAn;
    }

    public String getDevNomPizarraAn() {
        return this.devNomPizarraAn;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDevSerieEmisAnt(String devSerieEmisAnt) {
        this.devSerieEmisAnt = devSerieEmisAnt;
    }

    public String getDevSerieEmisAnt() {
        return this.devSerieEmisAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevCuponVigAnt(BigDecimal devCuponVigAnt) {
        this.devCuponVigAnt = devCuponVigAnt;
    }

    public BigDecimal getDevCuponVigAnt() {
        return this.devCuponVigAnt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDevNumNoneda(BigDecimal devNumNoneda) {
        this.devNumNoneda = devNumNoneda;
    }

    public BigDecimal getDevNumNoneda() {
        return this.devNumNoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDevImpMoneda(BigDecimal devImpMoneda) {
        this.devImpMoneda = devImpMoneda;
    }

    public BigDecimal getDevImpMoneda() {
        return this.devImpMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setDevTipoCambio(BigDecimal devTipoCambio) {
        this.devTipoCambio = devTipoCambio;
    }

    public BigDecimal getDevTipoCambio() {
        return this.devTipoCambio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DETVALOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDevFolioOpera() != null && this.getDevFolioOpera().longValue() == -999) {
            conditions += " AND DEV_FOLIO_OPERA IS NULL";
        } else if (this.getDevFolioOpera() != null) {
            conditions += " AND DEV_FOLIO_OPERA = ?";
            values.add(this.getDevFolioOpera());
        }

        if (this.getDevNumOperacion() != null && this.getDevNumOperacion().longValue() == -999) {
            conditions += " AND DEV_NUM_OPERACION IS NULL";
        } else if (this.getDevNumOperacion() != null) {
            conditions += " AND DEV_NUM_OPERACION = ?";
            values.add(this.getDevNumOperacion());
        }

        if (this.getDevNumSecOpera() != null && this.getDevNumSecOpera().longValue() == -999) {
            conditions += " AND DEV_NUM_SEC_OPERA IS NULL";
        } else if (this.getDevNumSecOpera() != null) {
            conditions += " AND DEV_NUM_SEC_OPERA = ?";
            values.add(this.getDevNumSecOpera());
        }

        if (this.getDevNumModulo() != null && this.getDevNumModulo().longValue() == -999) {
            conditions += " AND DEV_NUM_MODULO IS NULL";
        } else if (this.getDevNumModulo() != null) {
            conditions += " AND DEV_NUM_MODULO = ?";
            values.add(this.getDevNumModulo());
        }

        if (this.getDevNumTransac() != null && this.getDevNumTransac().longValue() == -999) {
            conditions += " AND DEV_NUM_TRANSAC IS NULL";
        } else if (this.getDevNumTransac() != null) {
            conditions += " AND DEV_NUM_TRANSAC = ?";
            values.add(this.getDevNumTransac());
        }

        if (this.getDevNumCorte() != null && this.getDevNumCorte().longValue() == -999) {
            conditions += " AND DEV_NUM_CORTE IS NULL";
        } else if (this.getDevNumCorte() != null) {
            conditions += " AND DEV_NUM_CORTE = ?";
            values.add(this.getDevNumCorte());
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
        String sql = "SELECT * FROM DETVALOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDevFolioOpera() != null && this.getDevFolioOpera().longValue() == -999) {
            conditions += " AND DEV_FOLIO_OPERA IS NULL";
        } else if (this.getDevFolioOpera() != null) {
            conditions += " AND DEV_FOLIO_OPERA = ?";
            values.add(this.getDevFolioOpera());
        }

        if (this.getDevNumOperacion() != null && this.getDevNumOperacion().longValue() == -999) {
            conditions += " AND DEV_NUM_OPERACION IS NULL";
        } else if (this.getDevNumOperacion() != null) {
            conditions += " AND DEV_NUM_OPERACION = ?";
            values.add(this.getDevNumOperacion());
        }

        if (this.getDevNumSecOpera() != null && this.getDevNumSecOpera().longValue() == -999) {
            conditions += " AND DEV_NUM_SEC_OPERA IS NULL";
        } else if (this.getDevNumSecOpera() != null) {
            conditions += " AND DEV_NUM_SEC_OPERA = ?";
            values.add(this.getDevNumSecOpera());
        }

        if (this.getDevNumModulo() != null && this.getDevNumModulo().longValue() == -999) {
            conditions += " AND DEV_NUM_MODULO IS NULL";
        } else if (this.getDevNumModulo() != null) {
            conditions += " AND DEV_NUM_MODULO = ?";
            values.add(this.getDevNumModulo());
        }

        if (this.getDevNumTransac() != null && this.getDevNumTransac().longValue() == -999) {
            conditions += " AND DEV_NUM_TRANSAC IS NULL";
        } else if (this.getDevNumTransac() != null) {
            conditions += " AND DEV_NUM_TRANSAC = ?";
            values.add(this.getDevNumTransac());
        }

        if (this.getDevNumCorte() != null && this.getDevNumCorte().longValue() == -999) {
            conditions += " AND DEV_NUM_CORTE IS NULL";
        } else if (this.getDevNumCorte() != null) {
            conditions += " AND DEV_NUM_CORTE = ?";
            values.add(this.getDevNumCorte());
        }

        if (this.getDevNumContrato() != null && this.getDevNumContrato().longValue() == -999) {
            conditions += " AND DEV_NUM_CONTRATO IS NULL";
        } else if (this.getDevNumContrato() != null) {
            conditions += " AND DEV_NUM_CONTRATO = ?";
            values.add(this.getDevNumContrato());
        }

        if (this.getDevSubContrato() != null && this.getDevSubContrato().longValue() == -999) {
            conditions += " AND DEV_SUB_CONTRATO IS NULL";
        } else if (this.getDevSubContrato() != null) {
            conditions += " AND DEV_SUB_CONTRATO = ?";
            values.add(this.getDevSubContrato());
        }

        if (this.getDevEntidadFin() != null && this.getDevEntidadFin().longValue() == -999) {
            conditions += " AND DEV_ENTIDAD_FIN IS NULL";
        } else if (this.getDevEntidadFin() != null) {
            conditions += " AND DEV_ENTIDAD_FIN = ?";
            values.add(this.getDevEntidadFin());
        }

        if (this.getDevContratoInter() != null && this.getDevContratoInter().longValue() == -999) {
            conditions += " AND DEV_CONTRATO_INTER IS NULL";
        } else if (this.getDevContratoInter() != null) {
            conditions += " AND DEV_CONTRATO_INTER = ?";
            values.add(this.getDevContratoInter());
        }

        if (this.getDevCveTipoMerca() != null && this.getDevCveTipoMerca().longValue() == -999) {
            conditions += " AND DEV_CVE_TIPO_MERCA IS NULL";
        } else if (this.getDevCveTipoMerca() != null) {
            conditions += " AND DEV_CVE_TIPO_MERCA = ?";
            values.add(this.getDevCveTipoMerca());
        }

        if (this.getDevNumInstrume() != null && this.getDevNumInstrume().longValue() == -999) {
            conditions += " AND DEV_NUM_INSTRUME IS NULL";
        } else if (this.getDevNumInstrume() != null) {
            conditions += " AND DEV_NUM_INSTRUME = ?";
            values.add(this.getDevNumInstrume());
        }

        if (this.getDevNumSecEmis() != null && this.getDevNumSecEmis().longValue() == -999) {
            conditions += " AND DEV_NUM_SEC_EMIS IS NULL";
        } else if (this.getDevNumSecEmis() != null) {
            conditions += " AND DEV_NUM_SEC_EMIS = ?";
            values.add(this.getDevNumSecEmis());
        }

        if (this.getDevNomPizarra() != null && "null".equals(this.getDevNomPizarra())) {
            conditions += " AND DEV_NOM_PIZARRA IS NULL";
        } else if (this.getDevNomPizarra() != null) {
            conditions += " AND DEV_NOM_PIZARRA = ?";
            values.add(this.getDevNomPizarra());
        }

        if (this.getDevSerieEmision() != null && "null".equals(this.getDevSerieEmision())) {
            conditions += " AND DEV_SERIE_EMISION IS NULL";
        } else if (this.getDevSerieEmision() != null) {
            conditions += " AND DEV_SERIE_EMISION = ?";
            values.add(this.getDevSerieEmision());
        }

        if (this.getDevNumCuponVig() != null && this.getDevNumCuponVig().longValue() == -999) {
            conditions += " AND DEV_NUM_CUPON_VIG IS NULL";
        } else if (this.getDevNumCuponVig() != null) {
            conditions += " AND DEV_NUM_CUPON_VIG = ?";
            values.add(this.getDevNumCuponVig());
        }

        if (this.getDevImpPrecioTit() != null && this.getDevImpPrecioTit().longValue() == -999) {
            conditions += " AND DEV_IMP_PRECIO_TIT IS NULL";
        } else if (this.getDevImpPrecioTit() != null) {
            conditions += " AND DEV_IMP_PRECIO_TIT = ?";
            values.add(this.getDevImpPrecioTit());
        }

        if (this.getDevNumTitulos() != null && this.getDevNumTitulos().longValue() == -999) {
            conditions += " AND DEV_NUM_TITULOS IS NULL";
        } else if (this.getDevNumTitulos() != null) {
            conditions += " AND DEV_NUM_TITULOS = ?";
            values.add(this.getDevNumTitulos());
        }

        if (this.getDevNumImpTit() != null && this.getDevNumImpTit().longValue() == -999) {
            conditions += " AND DEV_NUM_IMP_TIT IS NULL";
        } else if (this.getDevNumImpTit() != null) {
            conditions += " AND DEV_NUM_IMP_TIT = ?";
            values.add(this.getDevNumImpTit());
        }

        if (this.getDevImpTipCambio() != null && this.getDevImpTipCambio().longValue() == -999) {
            conditions += " AND DEV_IMP_TIP_CAMBIO IS NULL";
        } else if (this.getDevImpTipCambio() != null) {
            conditions += " AND DEV_IMP_TIP_CAMBIO = ?";
            values.add(this.getDevImpTipCambio());
        }

        if (this.getDevPjeTasaDesc() != null && this.getDevPjeTasaDesc().longValue() == -999) {
            conditions += " AND DEV_PJE_TASA_DESC IS NULL";
        } else if (this.getDevPjeTasaDesc() != null) {
            conditions += " AND DEV_PJE_TASA_DESC = ?";
            values.add(this.getDevPjeTasaDesc());
        }

        if (this.getDevTasaRendimien() != null && this.getDevTasaRendimien().longValue() == -999) {
            conditions += " AND DEV_TASA_RENDIMIEN IS NULL";
        } else if (this.getDevTasaRendimien() != null) {
            conditions += " AND DEV_TASA_RENDIMIEN = ?";
            values.add(this.getDevTasaRendimien());
        }

        if (this.getDevNumPlazo() != null && this.getDevNumPlazo().longValue() == -999) {
            conditions += " AND DEV_NUM_PLAZO IS NULL";
        } else if (this.getDevNumPlazo() != null) {
            conditions += " AND DEV_NUM_PLAZO = ?";
            values.add(this.getDevNumPlazo());
        }

        if (this.getDevFolioOperPla() != null && this.getDevFolioOperPla().longValue() == -999) {
            conditions += " AND DEV_FOLIO_OPER_PLA IS NULL";
        } else if (this.getDevFolioOperPla() != null) {
            conditions += " AND DEV_FOLIO_OPER_PLA = ?";
            values.add(this.getDevFolioOperPla());
        }

        if (this.getDevNumImpPremio() != null && this.getDevNumImpPremio().longValue() == -999) {
            conditions += " AND DEV_NUM_IMP_PREMIO IS NULL";
        } else if (this.getDevNumImpPremio() != null) {
            conditions += " AND DEV_NUM_IMP_PREMIO = ?";
            values.add(this.getDevNumImpPremio());
        }

        if (this.getDevCveTipoOpera() != null && "null".equals(this.getDevCveTipoOpera())) {
            conditions += " AND DEV_CVE_TIPO_OPERA IS NULL";
        } else if (this.getDevCveTipoOpera() != null) {
            conditions += " AND DEV_CVE_TIPO_OPERA = ?";
            values.add(this.getDevCveTipoOpera());
        }

        if (this.getDevCveFormaNego() != null && "null".equals(this.getDevCveFormaNego())) {
            conditions += " AND DEV_CVE_FORMA_NEGO IS NULL";
        } else if (this.getDevCveFormaNego() != null) {
            conditions += " AND DEV_CVE_FORMA_NEGO = ?";
            values.add(this.getDevCveFormaNego());
        }

        if (this.getDevAnoAltaReg() != null && this.getDevAnoAltaReg().longValue() == -999) {
            conditions += " AND DEV_ANO_ALTA_REG IS NULL";
        } else if (this.getDevAnoAltaReg() != null) {
            conditions += " AND DEV_ANO_ALTA_REG = ?";
            values.add(this.getDevAnoAltaReg());
        }

        if (this.getDevMesAltaReg() != null && this.getDevMesAltaReg().longValue() == -999) {
            conditions += " AND DEV_MES_ALTA_REG IS NULL";
        } else if (this.getDevMesAltaReg() != null) {
            conditions += " AND DEV_MES_ALTA_REG = ?";
            values.add(this.getDevMesAltaReg());
        }

        if (this.getDevDiaAltaReg() != null && this.getDevDiaAltaReg().longValue() == -999) {
            conditions += " AND DEV_DIA_ALTA_REG IS NULL";
        } else if (this.getDevDiaAltaReg() != null) {
            conditions += " AND DEV_DIA_ALTA_REG = ?";
            values.add(this.getDevDiaAltaReg());
        }

        if (this.getDevAnoUltMod() != null && this.getDevAnoUltMod().longValue() == -999) {
            conditions += " AND DEV_ANO_ULT_MOD IS NULL";
        } else if (this.getDevAnoUltMod() != null) {
            conditions += " AND DEV_ANO_ULT_MOD = ?";
            values.add(this.getDevAnoUltMod());
        }

        if (this.getDevMesUltMod() != null && this.getDevMesUltMod().longValue() == -999) {
            conditions += " AND DEV_MES_ULT_MOD IS NULL";
        } else if (this.getDevMesUltMod() != null) {
            conditions += " AND DEV_MES_ULT_MOD = ?";
            values.add(this.getDevMesUltMod());
        }

        if (this.getDevDiaUltMod() != null && this.getDevDiaUltMod().longValue() == -999) {
            conditions += " AND DEV_DIA_ULT_MOD IS NULL";
        } else if (this.getDevDiaUltMod() != null) {
            conditions += " AND DEV_DIA_ULT_MOD = ?";
            values.add(this.getDevDiaUltMod());
        }

        if (this.getDevCveStDetvalo() != null && "null".equals(this.getDevCveStDetvalo())) {
            conditions += " AND DEV_CVE_ST_DETVALO IS NULL";
        } else if (this.getDevCveStDetvalo() != null) {
            conditions += " AND DEV_CVE_ST_DETVALO = ?";
            values.add(this.getDevCveStDetvalo());
        }

        if (this.getDevImpIntereses() != null && this.getDevImpIntereses().longValue() == -999) {
            conditions += " AND DEV_IMP_INTERESES IS NULL";
        } else if (this.getDevImpIntereses() != null) {
            conditions += " AND DEV_IMP_INTERESES = ?";
            values.add(this.getDevImpIntereses());
        }

        if (this.getDevImpIsr() != null && this.getDevImpIsr().longValue() == -999) {
            conditions += " AND DEV_IMP_ISR IS NULL";
        } else if (this.getDevImpIsr() != null) {
            conditions += " AND DEV_IMP_ISR = ?";
            values.add(this.getDevImpIsr());
        }

        if (this.getDevCveTipoDere() != null && "null".equals(this.getDevCveTipoDere())) {
            conditions += " AND DEV_CVE_TIPO_DERE IS NULL";
        } else if (this.getDevCveTipoDere() != null) {
            conditions += " AND DEV_CVE_TIPO_DERE = ?";
            values.add(this.getDevCveTipoDere());
        }

        if (this.getDevNumTitActual() != null && this.getDevNumTitActual().longValue() == -999) {
            conditions += " AND DEV_NUM_TIT_ACTUAL IS NULL";
        } else if (this.getDevNumTitActual() != null) {
            conditions += " AND DEV_NUM_TIT_ACTUAL = ?";
            values.add(this.getDevNumTitActual());
        }

        if (this.getDevCveFactor() != null && "null".equals(this.getDevCveFactor())) {
            conditions += " AND DEV_CVE_FACTOR IS NULL";
        } else if (this.getDevCveFactor() != null) {
            conditions += " AND DEV_CVE_FACTOR = ?";
            values.add(this.getDevCveFactor());
        }

        if (this.getDevImpComision() != null && this.getDevImpComision().longValue() == -999) {
            conditions += " AND DEV_IMP_COMISION IS NULL";
        } else if (this.getDevImpComision() != null) {
            conditions += " AND DEV_IMP_COMISION = ?";
            values.add(this.getDevImpComision());
        }

        if (this.getDevImpUtilidad() != null && this.getDevImpUtilidad().longValue() == -999) {
            conditions += " AND DEV_IMP_UTILIDAD IS NULL";
        } else if (this.getDevImpUtilidad() != null) {
            conditions += " AND DEV_IMP_UTILIDAD = ?";
            values.add(this.getDevImpUtilidad());
        }

        if (this.getDevImpPerdida() != null && this.getDevImpPerdida().longValue() == -999) {
            conditions += " AND DEV_IMP_PERDIDA IS NULL";
        } else if (this.getDevImpPerdida() != null) {
            conditions += " AND DEV_IMP_PERDIDA = ?";
            values.add(this.getDevImpPerdida());
        }

        if (this.getDevNomPizarraAn() != null && "null".equals(this.getDevNomPizarraAn())) {
            conditions += " AND DEV_NOM_PIZARRA_AN IS NULL";
        } else if (this.getDevNomPizarraAn() != null) {
            conditions += " AND DEV_NOM_PIZARRA_AN = ?";
            values.add(this.getDevNomPizarraAn());
        }

        if (this.getDevSerieEmisAnt() != null && "null".equals(this.getDevSerieEmisAnt())) {
            conditions += " AND DEV_SERIE_EMIS_ANT IS NULL";
        } else if (this.getDevSerieEmisAnt() != null) {
            conditions += " AND DEV_SERIE_EMIS_ANT = ?";
            values.add(this.getDevSerieEmisAnt());
        }

        if (this.getDevCuponVigAnt() != null && this.getDevCuponVigAnt().longValue() == -999) {
            conditions += " AND DEV_CUPON_VIG_ANT IS NULL";
        } else if (this.getDevCuponVigAnt() != null) {
            conditions += " AND DEV_CUPON_VIG_ANT = ?";
            values.add(this.getDevCuponVigAnt());
        }

        if (this.getDevNumNoneda() != null && this.getDevNumNoneda().longValue() == -999) {
            conditions += " AND DEV_NUM_NONEDA IS NULL";
        } else if (this.getDevNumNoneda() != null) {
            conditions += " AND DEV_NUM_NONEDA = ?";
            values.add(this.getDevNumNoneda());
        }

        if (this.getDevImpMoneda() != null && this.getDevImpMoneda().longValue() == -999) {
            conditions += " AND DEV_IMP_MONEDA IS NULL";
        } else if (this.getDevImpMoneda() != null) {
            conditions += " AND DEV_IMP_MONEDA = ?";
            values.add(this.getDevImpMoneda());
        }

        if (this.getDevTipoCambio() != null && this.getDevTipoCambio().longValue() == -999) {
            conditions += " AND DEV_TIPO_CAMBIO IS NULL";
        } else if (this.getDevTipoCambio() != null) {
            conditions += " AND DEV_TIPO_CAMBIO = ?";
            values.add(this.getDevTipoCambio());
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
        String sql = "UPDATE DETVALOR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DEV_FOLIO_OPERA = ?";
        pkValues.add(this.getDevFolioOpera());
        conditions += " AND DEV_NUM_OPERACION = ?";
        pkValues.add(this.getDevNumOperacion());
        conditions += " AND DEV_NUM_SEC_OPERA = ?";
        pkValues.add(this.getDevNumSecOpera());
        conditions += " AND DEV_NUM_MODULO = ?";
        pkValues.add(this.getDevNumModulo());
        conditions += " AND DEV_NUM_TRANSAC = ?";
        pkValues.add(this.getDevNumTransac());
        conditions += " AND DEV_NUM_CORTE = ?";
        pkValues.add(this.getDevNumCorte());
        fields += " DEV_NUM_CONTRATO = ?, ";
        values.add(this.getDevNumContrato());
        fields += " DEV_SUB_CONTRATO = ?, ";
        values.add(this.getDevSubContrato());
        fields += " DEV_ENTIDAD_FIN = ?, ";
        values.add(this.getDevEntidadFin());
        fields += " DEV_CONTRATO_INTER = ?, ";
        values.add(this.getDevContratoInter());
        fields += " DEV_CVE_TIPO_MERCA = ?, ";
        values.add(this.getDevCveTipoMerca());
        fields += " DEV_NUM_INSTRUME = ?, ";
        values.add(this.getDevNumInstrume());
        fields += " DEV_NUM_SEC_EMIS = ?, ";
        values.add(this.getDevNumSecEmis());
        fields += " DEV_NOM_PIZARRA = ?, ";
        values.add(this.getDevNomPizarra());
        fields += " DEV_SERIE_EMISION = ?, ";
        values.add(this.getDevSerieEmision());
        fields += " DEV_NUM_CUPON_VIG = ?, ";
        values.add(this.getDevNumCuponVig());
        fields += " DEV_IMP_PRECIO_TIT = ?, ";
        values.add(this.getDevImpPrecioTit());
        fields += " DEV_NUM_TITULOS = ?, ";
        values.add(this.getDevNumTitulos());
        fields += " DEV_NUM_IMP_TIT = ?, ";
        values.add(this.getDevNumImpTit());
        fields += " DEV_IMP_TIP_CAMBIO = ?, ";
        values.add(this.getDevImpTipCambio());
        fields += " DEV_PJE_TASA_DESC = ?, ";
        values.add(this.getDevPjeTasaDesc());
        fields += " DEV_TASA_RENDIMIEN = ?, ";
        values.add(this.getDevTasaRendimien());
        fields += " DEV_NUM_PLAZO = ?, ";
        values.add(this.getDevNumPlazo());
        fields += " DEV_FOLIO_OPER_PLA = ?, ";
        values.add(this.getDevFolioOperPla());
        fields += " DEV_NUM_IMP_PREMIO = ?, ";
        values.add(this.getDevNumImpPremio());
        fields += " DEV_CVE_TIPO_OPERA = ?, ";
        values.add(this.getDevCveTipoOpera());
        fields += " DEV_CVE_FORMA_NEGO = ?, ";
        values.add(this.getDevCveFormaNego());
        fields += " DEV_ANO_ALTA_REG = ?, ";
        values.add(this.getDevAnoAltaReg());
        fields += " DEV_MES_ALTA_REG = ?, ";
        values.add(this.getDevMesAltaReg());
        fields += " DEV_DIA_ALTA_REG = ?, ";
        values.add(this.getDevDiaAltaReg());
        fields += " DEV_ANO_ULT_MOD = ?, ";
        values.add(this.getDevAnoUltMod());
        fields += " DEV_MES_ULT_MOD = ?, ";
        values.add(this.getDevMesUltMod());
        fields += " DEV_DIA_ULT_MOD = ?, ";
        values.add(this.getDevDiaUltMod());
        fields += " DEV_CVE_ST_DETVALO = ?, ";
        values.add(this.getDevCveStDetvalo());
        fields += " DEV_IMP_INTERESES = ?, ";
        values.add(this.getDevImpIntereses());
        fields += " DEV_IMP_ISR = ?, ";
        values.add(this.getDevImpIsr());
        fields += " DEV_CVE_TIPO_DERE = ?, ";
        values.add(this.getDevCveTipoDere());
        fields += " DEV_NUM_TIT_ACTUAL = ?, ";
        values.add(this.getDevNumTitActual());
        fields += " DEV_CVE_FACTOR = ?, ";
        values.add(this.getDevCveFactor());
        fields += " DEV_IMP_COMISION = ?, ";
        values.add(this.getDevImpComision());
        fields += " DEV_IMP_UTILIDAD = ?, ";
        values.add(this.getDevImpUtilidad());
        fields += " DEV_IMP_PERDIDA = ?, ";
        values.add(this.getDevImpPerdida());
        fields += " DEV_NOM_PIZARRA_AN = ?, ";
        values.add(this.getDevNomPizarraAn());
        fields += " DEV_SERIE_EMIS_ANT = ?, ";
        values.add(this.getDevSerieEmisAnt());
        fields += " DEV_CUPON_VIG_ANT = ?, ";
        values.add(this.getDevCuponVigAnt());
        fields += " DEV_NUM_NONEDA = ?, ";
        values.add(this.getDevNumNoneda());
        fields += " DEV_IMP_MONEDA = ?, ";
        values.add(this.getDevImpMoneda());
        fields += " DEV_TIPO_CAMBIO = ?, ";
        values.add(this.getDevTipoCambio());
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
        String sql = "INSERT INTO DETVALOR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DEV_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getDevFolioOpera());

        fields += ", DEV_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getDevNumOperacion());

        fields += ", DEV_NUM_SEC_OPERA";
        fieldValues += ", ?";
        values.add(this.getDevNumSecOpera());

        fields += ", DEV_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getDevNumModulo());

        fields += ", DEV_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getDevNumTransac());

        fields += ", DEV_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getDevNumCorte());

        fields += ", DEV_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDevNumContrato());

        fields += ", DEV_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDevSubContrato());

        fields += ", DEV_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getDevEntidadFin());

        fields += ", DEV_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getDevContratoInter());

        fields += ", DEV_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getDevCveTipoMerca());

        fields += ", DEV_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getDevNumInstrume());

        fields += ", DEV_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getDevNumSecEmis());

        fields += ", DEV_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getDevNomPizarra());

        fields += ", DEV_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getDevSerieEmision());

        fields += ", DEV_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getDevNumCuponVig());

        fields += ", DEV_IMP_PRECIO_TIT";
        fieldValues += ", ?";
        values.add(this.getDevImpPrecioTit());

        fields += ", DEV_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getDevNumTitulos());

        fields += ", DEV_NUM_IMP_TIT";
        fieldValues += ", ?";
        values.add(this.getDevNumImpTit());

        fields += ", DEV_IMP_TIP_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getDevImpTipCambio());

        fields += ", DEV_PJE_TASA_DESC";
        fieldValues += ", ?";
        values.add(this.getDevPjeTasaDesc());

        fields += ", DEV_TASA_RENDIMIEN";
        fieldValues += ", ?";
        values.add(this.getDevTasaRendimien());

        fields += ", DEV_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getDevNumPlazo());

        fields += ", DEV_FOLIO_OPER_PLA";
        fieldValues += ", ?";
        values.add(this.getDevFolioOperPla());

        fields += ", DEV_NUM_IMP_PREMIO";
        fieldValues += ", ?";
        values.add(this.getDevNumImpPremio());

        fields += ", DEV_CVE_TIPO_OPERA";
        fieldValues += ", ?";
        values.add(this.getDevCveTipoOpera());

        fields += ", DEV_CVE_FORMA_NEGO";
        fieldValues += ", ?";
        values.add(this.getDevCveFormaNego());

        fields += ", DEV_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDevAnoAltaReg());

        fields += ", DEV_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDevMesAltaReg());

        fields += ", DEV_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDevDiaAltaReg());

        fields += ", DEV_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDevAnoUltMod());

        fields += ", DEV_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDevMesUltMod());

        fields += ", DEV_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDevDiaUltMod());

        fields += ", DEV_CVE_ST_DETVALO";
        fieldValues += ", ?";
        values.add(this.getDevCveStDetvalo());

        fields += ", DEV_IMP_INTERESES";
        fieldValues += ", ?";
        values.add(this.getDevImpIntereses());

        fields += ", DEV_IMP_ISR";
        fieldValues += ", ?";
        values.add(this.getDevImpIsr());

        fields += ", DEV_CVE_TIPO_DERE";
        fieldValues += ", ?";
        values.add(this.getDevCveTipoDere());

        fields += ", DEV_NUM_TIT_ACTUAL";
        fieldValues += ", ?";
        values.add(this.getDevNumTitActual());

        fields += ", DEV_CVE_FACTOR";
        fieldValues += ", ?";
        values.add(this.getDevCveFactor());

        fields += ", DEV_IMP_COMISION";
        fieldValues += ", ?";
        values.add(this.getDevImpComision());

        fields += ", DEV_IMP_UTILIDAD";
        fieldValues += ", ?";
        values.add(this.getDevImpUtilidad());

        fields += ", DEV_IMP_PERDIDA";
        fieldValues += ", ?";
        values.add(this.getDevImpPerdida());

        fields += ", DEV_NOM_PIZARRA_AN";
        fieldValues += ", ?";
        values.add(this.getDevNomPizarraAn());

        fields += ", DEV_SERIE_EMIS_ANT";
        fieldValues += ", ?";
        values.add(this.getDevSerieEmisAnt());

        fields += ", DEV_CUPON_VIG_ANT";
        fieldValues += ", ?";
        values.add(this.getDevCuponVigAnt());

        fields += ", DEV_NUM_NONEDA";
        fieldValues += ", ?";
        values.add(this.getDevNumNoneda());

        fields += ", DEV_IMP_MONEDA";
        fieldValues += ", ?";
        values.add(this.getDevImpMoneda());

        fields += ", DEV_TIPO_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getDevTipoCambio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DETVALOR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DEV_FOLIO_OPERA = ?";
        values.add(this.getDevFolioOpera());
        conditions += " AND DEV_NUM_OPERACION = ?";
        values.add(this.getDevNumOperacion());
        conditions += " AND DEV_NUM_SEC_OPERA = ?";
        values.add(this.getDevNumSecOpera());
        conditions += " AND DEV_NUM_MODULO = ?";
        values.add(this.getDevNumModulo());
        conditions += " AND DEV_NUM_TRANSAC = ?";
        values.add(this.getDevNumTransac());
        conditions += " AND DEV_NUM_CORTE = ?";
        values.add(this.getDevNumCorte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Detvalor instance = (Detvalor) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDevFolioOpera().equals(instance.getDevFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumOperacion().equals(instance.getDevNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumSecOpera().equals(instance.getDevNumSecOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumModulo().equals(instance.getDevNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumTransac().equals(instance.getDevNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumCorte().equals(instance.getDevNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumContrato().equals(instance.getDevNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDevSubContrato().equals(instance.getDevSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDevEntidadFin().equals(instance.getDevEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getDevContratoInter().equals(instance.getDevContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getDevCveTipoMerca().equals(instance.getDevCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumInstrume().equals(instance.getDevNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumSecEmis().equals(instance.getDevNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getDevNomPizarra().equals(instance.getDevNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getDevSerieEmision().equals(instance.getDevSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumCuponVig().equals(instance.getDevNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getDevImpPrecioTit().equals(instance.getDevImpPrecioTit()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumTitulos().equals(instance.getDevNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumImpTit().equals(instance.getDevNumImpTit()))
            equalObjects = false;
        if (equalObjects && !this.getDevImpTipCambio().equals(instance.getDevImpTipCambio()))
            equalObjects = false;
        if (equalObjects && !this.getDevPjeTasaDesc().equals(instance.getDevPjeTasaDesc()))
            equalObjects = false;
        if (equalObjects && !this.getDevTasaRendimien().equals(instance.getDevTasaRendimien()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumPlazo().equals(instance.getDevNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getDevFolioOperPla().equals(instance.getDevFolioOperPla()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumImpPremio().equals(instance.getDevNumImpPremio()))
            equalObjects = false;
        if (equalObjects && !this.getDevCveTipoOpera().equals(instance.getDevCveTipoOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDevCveFormaNego().equals(instance.getDevCveFormaNego()))
            equalObjects = false;
        if (equalObjects && !this.getDevAnoAltaReg().equals(instance.getDevAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDevMesAltaReg().equals(instance.getDevMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDevDiaAltaReg().equals(instance.getDevDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDevAnoUltMod().equals(instance.getDevAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDevMesUltMod().equals(instance.getDevMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDevDiaUltMod().equals(instance.getDevDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDevCveStDetvalo().equals(instance.getDevCveStDetvalo()))
            equalObjects = false;
        if (equalObjects && !this.getDevImpIntereses().equals(instance.getDevImpIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getDevImpIsr().equals(instance.getDevImpIsr()))
            equalObjects = false;
        if (equalObjects && !this.getDevCveTipoDere().equals(instance.getDevCveTipoDere()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumTitActual().equals(instance.getDevNumTitActual()))
            equalObjects = false;
        if (equalObjects && !this.getDevCveFactor().equals(instance.getDevCveFactor()))
            equalObjects = false;
        if (equalObjects && !this.getDevImpComision().equals(instance.getDevImpComision()))
            equalObjects = false;
        if (equalObjects && !this.getDevImpUtilidad().equals(instance.getDevImpUtilidad()))
            equalObjects = false;
        if (equalObjects && !this.getDevImpPerdida().equals(instance.getDevImpPerdida()))
            equalObjects = false;
        if (equalObjects && !this.getDevNomPizarraAn().equals(instance.getDevNomPizarraAn()))
            equalObjects = false;
        if (equalObjects && !this.getDevSerieEmisAnt().equals(instance.getDevSerieEmisAnt()))
            equalObjects = false;
        if (equalObjects && !this.getDevCuponVigAnt().equals(instance.getDevCuponVigAnt()))
            equalObjects = false;
        if (equalObjects && !this.getDevNumNoneda().equals(instance.getDevNumNoneda()))
            equalObjects = false;
        if (equalObjects && !this.getDevImpMoneda().equals(instance.getDevImpMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getDevTipoCambio().equals(instance.getDevTipoCambio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Detvalor result = new Detvalor();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDevFolioOpera((BigDecimal) objectData.getData("DEV_FOLIO_OPERA"));
        result.setDevNumOperacion((BigDecimal) objectData.getData("DEV_NUM_OPERACION"));
        result.setDevNumSecOpera((BigDecimal) objectData.getData("DEV_NUM_SEC_OPERA"));
        result.setDevNumModulo((BigDecimal) objectData.getData("DEV_NUM_MODULO"));
        result.setDevNumTransac((BigDecimal) objectData.getData("DEV_NUM_TRANSAC"));
        result.setDevNumCorte((BigDecimal) objectData.getData("DEV_NUM_CORTE"));
        result.setDevNumContrato((BigDecimal) objectData.getData("DEV_NUM_CONTRATO"));
        result.setDevSubContrato((BigDecimal) objectData.getData("DEV_SUB_CONTRATO"));
        result.setDevEntidadFin((BigDecimal) objectData.getData("DEV_ENTIDAD_FIN"));
        result.setDevContratoInter((BigDecimal) objectData.getData("DEV_CONTRATO_INTER"));
        result.setDevCveTipoMerca((BigDecimal) objectData.getData("DEV_CVE_TIPO_MERCA"));
        result.setDevNumInstrume((BigDecimal) objectData.getData("DEV_NUM_INSTRUME"));
        result.setDevNumSecEmis((BigDecimal) objectData.getData("DEV_NUM_SEC_EMIS"));
        result.setDevNomPizarra((String) objectData.getData("DEV_NOM_PIZARRA"));
        result.setDevSerieEmision((String) objectData.getData("DEV_SERIE_EMISION"));
        result.setDevNumCuponVig((BigDecimal) objectData.getData("DEV_NUM_CUPON_VIG"));
        result.setDevImpPrecioTit((BigDecimal) objectData.getData("DEV_IMP_PRECIO_TIT"));
        result.setDevNumTitulos((BigDecimal) objectData.getData("DEV_NUM_TITULOS"));
        result.setDevNumImpTit((BigDecimal) objectData.getData("DEV_NUM_IMP_TIT"));
        result.setDevImpTipCambio((BigDecimal) objectData.getData("DEV_IMP_TIP_CAMBIO"));
        result.setDevPjeTasaDesc((BigDecimal) objectData.getData("DEV_PJE_TASA_DESC"));
        result.setDevTasaRendimien((BigDecimal) objectData.getData("DEV_TASA_RENDIMIEN"));
        result.setDevNumPlazo((BigDecimal) objectData.getData("DEV_NUM_PLAZO"));
        result.setDevFolioOperPla((BigDecimal) objectData.getData("DEV_FOLIO_OPER_PLA"));
        result.setDevNumImpPremio((BigDecimal) objectData.getData("DEV_NUM_IMP_PREMIO"));
        result.setDevCveTipoOpera((String) objectData.getData("DEV_CVE_TIPO_OPERA"));
        result.setDevCveFormaNego((String) objectData.getData("DEV_CVE_FORMA_NEGO"));
        result.setDevAnoAltaReg((BigDecimal) objectData.getData("DEV_ANO_ALTA_REG"));
        result.setDevMesAltaReg((BigDecimal) objectData.getData("DEV_MES_ALTA_REG"));
        result.setDevDiaAltaReg((BigDecimal) objectData.getData("DEV_DIA_ALTA_REG"));
        result.setDevAnoUltMod((BigDecimal) objectData.getData("DEV_ANO_ULT_MOD"));
        result.setDevMesUltMod((BigDecimal) objectData.getData("DEV_MES_ULT_MOD"));
        result.setDevDiaUltMod((BigDecimal) objectData.getData("DEV_DIA_ULT_MOD"));
        result.setDevCveStDetvalo((String) objectData.getData("DEV_CVE_ST_DETVALO"));
        result.setDevImpIntereses((BigDecimal) objectData.getData("DEV_IMP_INTERESES"));
        result.setDevImpIsr((BigDecimal) objectData.getData("DEV_IMP_ISR"));
        result.setDevCveTipoDere((String) objectData.getData("DEV_CVE_TIPO_DERE"));
        result.setDevNumTitActual((BigDecimal) objectData.getData("DEV_NUM_TIT_ACTUAL"));
        result.setDevCveFactor((String) objectData.getData("DEV_CVE_FACTOR"));
        result.setDevImpComision((BigDecimal) objectData.getData("DEV_IMP_COMISION"));
        result.setDevImpUtilidad((BigDecimal) objectData.getData("DEV_IMP_UTILIDAD"));
        result.setDevImpPerdida((BigDecimal) objectData.getData("DEV_IMP_PERDIDA"));
        result.setDevNomPizarraAn((String) objectData.getData("DEV_NOM_PIZARRA_AN"));
        result.setDevSerieEmisAnt((String) objectData.getData("DEV_SERIE_EMIS_ANT"));
        result.setDevCuponVigAnt((BigDecimal) objectData.getData("DEV_CUPON_VIG_ANT"));
        result.setDevNumNoneda((BigDecimal) objectData.getData("DEV_NUM_NONEDA"));
        result.setDevImpMoneda((BigDecimal) objectData.getData("DEV_IMP_MONEDA"));
        result.setDevTipoCambio((BigDecimal) objectData.getData("DEV_TIPO_CAMBIO"));

        return result;

    }

}
