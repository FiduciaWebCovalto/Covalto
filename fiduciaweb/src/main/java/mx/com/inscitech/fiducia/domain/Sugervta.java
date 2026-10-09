package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SUGERVTA_PK",
            columns =
            { "SUV_ANO_SUGERENCIA", "SUV_MES_SUGERENCIA", "SUV_DIA_SUGERENCIA", "SUV_NUM_CORTE", "SUV_NUM_CONTRATO", "SUV_SUB_CONTRATO", "SUV_NUM_ENTID_FIN", "SUV_CONTRATO_INTER",
              "SUV_FOLIO_OPERA", "SUV_CVE_TIPO_MERCA", "SUV_NUM_INSTRUME", "SUV_NUM_SEC_EMIS"
    }, sequences = { "MANUAL" })
public class Sugervta extends DomainObject {

    BigDecimal suvAnoSugerencia = null;
    BigDecimal suvMesSugerencia = null;
    BigDecimal suvDiaSugerencia = null;
    BigDecimal suvNumCorte = null;
    BigDecimal suvNumContrato = null;
    BigDecimal suvSubContrato = null;
    BigDecimal suvNumEntidFin = null;
    BigDecimal suvContratoInter = null;
    BigDecimal suvFolioOpera = null;
    BigDecimal suvCveTipoMerca = null;
    BigDecimal suvNumInstrume = null;
    BigDecimal suvNumSecEmis = null;
    String suvNomPizarra = null;
    String suvSerieEmision = null;
    BigDecimal suvNumCuponVig = null;
    BigDecimal suvTitRequeridos = null;
    BigDecimal suvTitVendidos = null;
    BigDecimal suvNumTitDisp = null;
    BigDecimal suvImpTitVta = null;
    BigDecimal suvPrecioCierre = null;
    BigDecimal suvNumHoraCorte = null;
    BigDecimal suvMinutosCorte = null;
    String suvCveStSugervt = null;
    BigDecimal suvNumMoneda = null;
    String suvCveTipoOpera = null;

    public Sugervta() {
        super();
        this.pkColumns = 12;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSuvAnoSugerencia(BigDecimal suvAnoSugerencia) {
        this.suvAnoSugerencia = suvAnoSugerencia;
    }

    public BigDecimal getSuvAnoSugerencia() {
        return this.suvAnoSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSuvMesSugerencia(BigDecimal suvMesSugerencia) {
        this.suvMesSugerencia = suvMesSugerencia;
    }

    public BigDecimal getSuvMesSugerencia() {
        return this.suvMesSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSuvDiaSugerencia(BigDecimal suvDiaSugerencia) {
        this.suvDiaSugerencia = suvDiaSugerencia;
    }

    public BigDecimal getSuvDiaSugerencia() {
        return this.suvDiaSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvNumCorte(BigDecimal suvNumCorte) {
        this.suvNumCorte = suvNumCorte;
    }

    public BigDecimal getSuvNumCorte() {
        return this.suvNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvNumContrato(BigDecimal suvNumContrato) {
        this.suvNumContrato = suvNumContrato;
    }

    public BigDecimal getSuvNumContrato() {
        return this.suvNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvSubContrato(BigDecimal suvSubContrato) {
        this.suvSubContrato = suvSubContrato;
    }

    public BigDecimal getSuvSubContrato() {
        return this.suvSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvNumEntidFin(BigDecimal suvNumEntidFin) {
        this.suvNumEntidFin = suvNumEntidFin;
    }

    public BigDecimal getSuvNumEntidFin() {
        return this.suvNumEntidFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvContratoInter(BigDecimal suvContratoInter) {
        this.suvContratoInter = suvContratoInter;
    }

    public BigDecimal getSuvContratoInter() {
        return this.suvContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvFolioOpera(BigDecimal suvFolioOpera) {
        this.suvFolioOpera = suvFolioOpera;
    }

    public BigDecimal getSuvFolioOpera() {
        return this.suvFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvCveTipoMerca(BigDecimal suvCveTipoMerca) {
        this.suvCveTipoMerca = suvCveTipoMerca;
    }

    public BigDecimal getSuvCveTipoMerca() {
        return this.suvCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvNumInstrume(BigDecimal suvNumInstrume) {
        this.suvNumInstrume = suvNumInstrume;
    }

    public BigDecimal getSuvNumInstrume() {
        return this.suvNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvNumSecEmis(BigDecimal suvNumSecEmis) {
        this.suvNumSecEmis = suvNumSecEmis;
    }

    public BigDecimal getSuvNumSecEmis() {
        return this.suvNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSuvNomPizarra(String suvNomPizarra) {
        this.suvNomPizarra = suvNomPizarra;
    }

    public String getSuvNomPizarra() {
        return this.suvNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSuvSerieEmision(String suvSerieEmision) {
        this.suvSerieEmision = suvSerieEmision;
    }

    public String getSuvSerieEmision() {
        return this.suvSerieEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvNumCuponVig(BigDecimal suvNumCuponVig) {
        this.suvNumCuponVig = suvNumCuponVig;
    }

    public BigDecimal getSuvNumCuponVig() {
        return this.suvNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setSuvTitRequeridos(BigDecimal suvTitRequeridos) {
        this.suvTitRequeridos = suvTitRequeridos;
    }

    public BigDecimal getSuvTitRequeridos() {
        return this.suvTitRequeridos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setSuvTitVendidos(BigDecimal suvTitVendidos) {
        this.suvTitVendidos = suvTitVendidos;
    }

    public BigDecimal getSuvTitVendidos() {
        return this.suvTitVendidos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setSuvNumTitDisp(BigDecimal suvNumTitDisp) {
        this.suvNumTitDisp = suvNumTitDisp;
    }

    public BigDecimal getSuvNumTitDisp() {
        return this.suvNumTitDisp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSuvImpTitVta(BigDecimal suvImpTitVta) {
        this.suvImpTitVta = suvImpTitVta;
    }

    public BigDecimal getSuvImpTitVta() {
        return this.suvImpTitVta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 19, scale = 11, javaClass = BigDecimal.class)
    public void setSuvPrecioCierre(BigDecimal suvPrecioCierre) {
        this.suvPrecioCierre = suvPrecioCierre;
    }

    public BigDecimal getSuvPrecioCierre() {
        return this.suvPrecioCierre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSuvNumHoraCorte(BigDecimal suvNumHoraCorte) {
        this.suvNumHoraCorte = suvNumHoraCorte;
    }

    public BigDecimal getSuvNumHoraCorte() {
        return this.suvNumHoraCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvMinutosCorte(BigDecimal suvMinutosCorte) {
        this.suvMinutosCorte = suvMinutosCorte;
    }

    public BigDecimal getSuvMinutosCorte() {
        return this.suvMinutosCorte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSuvCveStSugervt(String suvCveStSugervt) {
        this.suvCveStSugervt = suvCveStSugervt;
    }

    public String getSuvCveStSugervt() {
        return this.suvCveStSugervt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSuvNumMoneda(BigDecimal suvNumMoneda) {
        this.suvNumMoneda = suvNumMoneda;
    }

    public BigDecimal getSuvNumMoneda() {
        return this.suvNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSuvCveTipoOpera(String suvCveTipoOpera) {
        this.suvCveTipoOpera = suvCveTipoOpera;
    }

    public String getSuvCveTipoOpera() {
        return this.suvCveTipoOpera;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SUGERVTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSuvAnoSugerencia() != null && this.getSuvAnoSugerencia().longValue() == -999) {
            conditions += " AND SUV_ANO_SUGERENCIA IS NULL";
        } else if (this.getSuvAnoSugerencia() != null) {
            conditions += " AND SUV_ANO_SUGERENCIA = ?";
            values.add(this.getSuvAnoSugerencia());
        }

        if (this.getSuvMesSugerencia() != null && this.getSuvMesSugerencia().longValue() == -999) {
            conditions += " AND SUV_MES_SUGERENCIA IS NULL";
        } else if (this.getSuvMesSugerencia() != null) {
            conditions += " AND SUV_MES_SUGERENCIA = ?";
            values.add(this.getSuvMesSugerencia());
        }

        if (this.getSuvDiaSugerencia() != null && this.getSuvDiaSugerencia().longValue() == -999) {
            conditions += " AND SUV_DIA_SUGERENCIA IS NULL";
        } else if (this.getSuvDiaSugerencia() != null) {
            conditions += " AND SUV_DIA_SUGERENCIA = ?";
            values.add(this.getSuvDiaSugerencia());
        }

        if (this.getSuvNumCorte() != null && this.getSuvNumCorte().longValue() == -999) {
            conditions += " AND SUV_NUM_CORTE IS NULL";
        } else if (this.getSuvNumCorte() != null) {
            conditions += " AND SUV_NUM_CORTE = ?";
            values.add(this.getSuvNumCorte());
        }

        if (this.getSuvNumContrato() != null && this.getSuvNumContrato().longValue() == -999) {
            conditions += " AND SUV_NUM_CONTRATO IS NULL";
        } else if (this.getSuvNumContrato() != null) {
            conditions += " AND SUV_NUM_CONTRATO = ?";
            values.add(this.getSuvNumContrato());
        }

        if (this.getSuvSubContrato() != null && this.getSuvSubContrato().longValue() == -999) {
            conditions += " AND SUV_SUB_CONTRATO IS NULL";
        } else if (this.getSuvSubContrato() != null) {
            conditions += " AND SUV_SUB_CONTRATO = ?";
            values.add(this.getSuvSubContrato());
        }

        if (this.getSuvNumEntidFin() != null && this.getSuvNumEntidFin().longValue() == -999) {
            conditions += " AND SUV_NUM_ENTID_FIN IS NULL";
        } else if (this.getSuvNumEntidFin() != null) {
            conditions += " AND SUV_NUM_ENTID_FIN = ?";
            values.add(this.getSuvNumEntidFin());
        }

        if (this.getSuvContratoInter() != null && this.getSuvContratoInter().longValue() == -999) {
            conditions += " AND SUV_CONTRATO_INTER IS NULL";
        } else if (this.getSuvContratoInter() != null) {
            conditions += " AND SUV_CONTRATO_INTER = ?";
            values.add(this.getSuvContratoInter());
        }

        if (this.getSuvFolioOpera() != null && this.getSuvFolioOpera().longValue() == -999) {
            conditions += " AND SUV_FOLIO_OPERA IS NULL";
        } else if (this.getSuvFolioOpera() != null) {
            conditions += " AND SUV_FOLIO_OPERA = ?";
            values.add(this.getSuvFolioOpera());
        }

        if (this.getSuvCveTipoMerca() != null && this.getSuvCveTipoMerca().longValue() == -999) {
            conditions += " AND SUV_CVE_TIPO_MERCA IS NULL";
        } else if (this.getSuvCveTipoMerca() != null) {
            conditions += " AND SUV_CVE_TIPO_MERCA = ?";
            values.add(this.getSuvCveTipoMerca());
        }

        if (this.getSuvNumInstrume() != null && this.getSuvNumInstrume().longValue() == -999) {
            conditions += " AND SUV_NUM_INSTRUME IS NULL";
        } else if (this.getSuvNumInstrume() != null) {
            conditions += " AND SUV_NUM_INSTRUME = ?";
            values.add(this.getSuvNumInstrume());
        }

        if (this.getSuvNumSecEmis() != null && this.getSuvNumSecEmis().longValue() == -999) {
            conditions += " AND SUV_NUM_SEC_EMIS IS NULL";
        } else if (this.getSuvNumSecEmis() != null) {
            conditions += " AND SUV_NUM_SEC_EMIS = ?";
            values.add(this.getSuvNumSecEmis());
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
        String sql = "SELECT * FROM SUGERVTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSuvAnoSugerencia() != null && this.getSuvAnoSugerencia().longValue() == -999) {
            conditions += " AND SUV_ANO_SUGERENCIA IS NULL";
        } else if (this.getSuvAnoSugerencia() != null) {
            conditions += " AND SUV_ANO_SUGERENCIA = ?";
            values.add(this.getSuvAnoSugerencia());
        }

        if (this.getSuvMesSugerencia() != null && this.getSuvMesSugerencia().longValue() == -999) {
            conditions += " AND SUV_MES_SUGERENCIA IS NULL";
        } else if (this.getSuvMesSugerencia() != null) {
            conditions += " AND SUV_MES_SUGERENCIA = ?";
            values.add(this.getSuvMesSugerencia());
        }

        if (this.getSuvDiaSugerencia() != null && this.getSuvDiaSugerencia().longValue() == -999) {
            conditions += " AND SUV_DIA_SUGERENCIA IS NULL";
        } else if (this.getSuvDiaSugerencia() != null) {
            conditions += " AND SUV_DIA_SUGERENCIA = ?";
            values.add(this.getSuvDiaSugerencia());
        }

        if (this.getSuvNumCorte() != null && this.getSuvNumCorte().longValue() == -999) {
            conditions += " AND SUV_NUM_CORTE IS NULL";
        } else if (this.getSuvNumCorte() != null) {
            conditions += " AND SUV_NUM_CORTE = ?";
            values.add(this.getSuvNumCorte());
        }

        if (this.getSuvNumContrato() != null && this.getSuvNumContrato().longValue() == -999) {
            conditions += " AND SUV_NUM_CONTRATO IS NULL";
        } else if (this.getSuvNumContrato() != null) {
            conditions += " AND SUV_NUM_CONTRATO = ?";
            values.add(this.getSuvNumContrato());
        }

        if (this.getSuvSubContrato() != null && this.getSuvSubContrato().longValue() == -999) {
            conditions += " AND SUV_SUB_CONTRATO IS NULL";
        } else if (this.getSuvSubContrato() != null) {
            conditions += " AND SUV_SUB_CONTRATO = ?";
            values.add(this.getSuvSubContrato());
        }

        if (this.getSuvNumEntidFin() != null && this.getSuvNumEntidFin().longValue() == -999) {
            conditions += " AND SUV_NUM_ENTID_FIN IS NULL";
        } else if (this.getSuvNumEntidFin() != null) {
            conditions += " AND SUV_NUM_ENTID_FIN = ?";
            values.add(this.getSuvNumEntidFin());
        }

        if (this.getSuvContratoInter() != null && this.getSuvContratoInter().longValue() == -999) {
            conditions += " AND SUV_CONTRATO_INTER IS NULL";
        } else if (this.getSuvContratoInter() != null) {
            conditions += " AND SUV_CONTRATO_INTER = ?";
            values.add(this.getSuvContratoInter());
        }

        if (this.getSuvFolioOpera() != null && this.getSuvFolioOpera().longValue() == -999) {
            conditions += " AND SUV_FOLIO_OPERA IS NULL";
        } else if (this.getSuvFolioOpera() != null) {
            conditions += " AND SUV_FOLIO_OPERA = ?";
            values.add(this.getSuvFolioOpera());
        }

        if (this.getSuvCveTipoMerca() != null && this.getSuvCveTipoMerca().longValue() == -999) {
            conditions += " AND SUV_CVE_TIPO_MERCA IS NULL";
        } else if (this.getSuvCveTipoMerca() != null) {
            conditions += " AND SUV_CVE_TIPO_MERCA = ?";
            values.add(this.getSuvCveTipoMerca());
        }

        if (this.getSuvNumInstrume() != null && this.getSuvNumInstrume().longValue() == -999) {
            conditions += " AND SUV_NUM_INSTRUME IS NULL";
        } else if (this.getSuvNumInstrume() != null) {
            conditions += " AND SUV_NUM_INSTRUME = ?";
            values.add(this.getSuvNumInstrume());
        }

        if (this.getSuvNumSecEmis() != null && this.getSuvNumSecEmis().longValue() == -999) {
            conditions += " AND SUV_NUM_SEC_EMIS IS NULL";
        } else if (this.getSuvNumSecEmis() != null) {
            conditions += " AND SUV_NUM_SEC_EMIS = ?";
            values.add(this.getSuvNumSecEmis());
        }

        if (this.getSuvNomPizarra() != null && "null".equals(this.getSuvNomPizarra())) {
            conditions += " AND SUV_NOM_PIZARRA IS NULL";
        } else if (this.getSuvNomPizarra() != null) {
            conditions += " AND SUV_NOM_PIZARRA = ?";
            values.add(this.getSuvNomPizarra());
        }

        if (this.getSuvSerieEmision() != null && "null".equals(this.getSuvSerieEmision())) {
            conditions += " AND SUV_SERIE_EMISION IS NULL";
        } else if (this.getSuvSerieEmision() != null) {
            conditions += " AND SUV_SERIE_EMISION = ?";
            values.add(this.getSuvSerieEmision());
        }

        if (this.getSuvNumCuponVig() != null && this.getSuvNumCuponVig().longValue() == -999) {
            conditions += " AND SUV_NUM_CUPON_VIG IS NULL";
        } else if (this.getSuvNumCuponVig() != null) {
            conditions += " AND SUV_NUM_CUPON_VIG = ?";
            values.add(this.getSuvNumCuponVig());
        }

        if (this.getSuvTitRequeridos() != null && this.getSuvTitRequeridos().longValue() == -999) {
            conditions += " AND SUV_TIT_REQUERIDOS IS NULL";
        } else if (this.getSuvTitRequeridos() != null) {
            conditions += " AND SUV_TIT_REQUERIDOS = ?";
            values.add(this.getSuvTitRequeridos());
        }

        if (this.getSuvTitVendidos() != null && this.getSuvTitVendidos().longValue() == -999) {
            conditions += " AND SUV_TIT_VENDIDOS IS NULL";
        } else if (this.getSuvTitVendidos() != null) {
            conditions += " AND SUV_TIT_VENDIDOS = ?";
            values.add(this.getSuvTitVendidos());
        }

        if (this.getSuvNumTitDisp() != null && this.getSuvNumTitDisp().longValue() == -999) {
            conditions += " AND SUV_NUM_TIT_DISP IS NULL";
        } else if (this.getSuvNumTitDisp() != null) {
            conditions += " AND SUV_NUM_TIT_DISP = ?";
            values.add(this.getSuvNumTitDisp());
        }

        if (this.getSuvImpTitVta() != null && this.getSuvImpTitVta().longValue() == -999) {
            conditions += " AND SUV_IMP_TIT_VTA IS NULL";
        } else if (this.getSuvImpTitVta() != null) {
            conditions += " AND SUV_IMP_TIT_VTA = ?";
            values.add(this.getSuvImpTitVta());
        }

        if (this.getSuvPrecioCierre() != null && this.getSuvPrecioCierre().longValue() == -999) {
            conditions += " AND SUV_PRECIO_CIERRE IS NULL";
        } else if (this.getSuvPrecioCierre() != null) {
            conditions += " AND SUV_PRECIO_CIERRE = ?";
            values.add(this.getSuvPrecioCierre());
        }

        if (this.getSuvNumHoraCorte() != null && this.getSuvNumHoraCorte().longValue() == -999) {
            conditions += " AND SUV_NUM_HORA_CORTE IS NULL";
        } else if (this.getSuvNumHoraCorte() != null) {
            conditions += " AND SUV_NUM_HORA_CORTE = ?";
            values.add(this.getSuvNumHoraCorte());
        }

        if (this.getSuvMinutosCorte() != null && this.getSuvMinutosCorte().longValue() == -999) {
            conditions += " AND SUV_MINUTOS_CORTE IS NULL";
        } else if (this.getSuvMinutosCorte() != null) {
            conditions += " AND SUV_MINUTOS_CORTE = ?";
            values.add(this.getSuvMinutosCorte());
        }

        if (this.getSuvCveStSugervt() != null && "null".equals(this.getSuvCveStSugervt())) {
            conditions += " AND SUV_CVE_ST_SUGERVT IS NULL";
        } else if (this.getSuvCveStSugervt() != null) {
            conditions += " AND SUV_CVE_ST_SUGERVT = ?";
            values.add(this.getSuvCveStSugervt());
        }

        if (this.getSuvNumMoneda() != null && this.getSuvNumMoneda().longValue() == -999) {
            conditions += " AND SUV_NUM_MONEDA IS NULL";
        } else if (this.getSuvNumMoneda() != null) {
            conditions += " AND SUV_NUM_MONEDA = ?";
            values.add(this.getSuvNumMoneda());
        }

        if (this.getSuvCveTipoOpera() != null && "null".equals(this.getSuvCveTipoOpera())) {
            conditions += " AND SUV_CVE_TIPO_OPERA IS NULL";
        } else if (this.getSuvCveTipoOpera() != null) {
            conditions += " AND SUV_CVE_TIPO_OPERA = ?";
            values.add(this.getSuvCveTipoOpera());
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
        String sql = "UPDATE SUGERVTA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SUV_ANO_SUGERENCIA = ?";
        pkValues.add(this.getSuvAnoSugerencia());
        conditions += " AND SUV_MES_SUGERENCIA = ?";
        pkValues.add(this.getSuvMesSugerencia());
        conditions += " AND SUV_DIA_SUGERENCIA = ?";
        pkValues.add(this.getSuvDiaSugerencia());
        conditions += " AND SUV_NUM_CORTE = ?";
        pkValues.add(this.getSuvNumCorte());
        conditions += " AND SUV_NUM_CONTRATO = ?";
        pkValues.add(this.getSuvNumContrato());
        conditions += " AND SUV_SUB_CONTRATO = ?";
        pkValues.add(this.getSuvSubContrato());
        conditions += " AND SUV_NUM_ENTID_FIN = ?";
        pkValues.add(this.getSuvNumEntidFin());
        conditions += " AND SUV_CONTRATO_INTER = ?";
        pkValues.add(this.getSuvContratoInter());
        conditions += " AND SUV_FOLIO_OPERA = ?";
        pkValues.add(this.getSuvFolioOpera());
        conditions += " AND SUV_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getSuvCveTipoMerca());
        conditions += " AND SUV_NUM_INSTRUME = ?";
        pkValues.add(this.getSuvNumInstrume());
        conditions += " AND SUV_NUM_SEC_EMIS = ?";
        pkValues.add(this.getSuvNumSecEmis());
        fields += " SUV_NOM_PIZARRA = ?, ";
        values.add(this.getSuvNomPizarra());
        fields += " SUV_SERIE_EMISION = ?, ";
        values.add(this.getSuvSerieEmision());
        fields += " SUV_NUM_CUPON_VIG = ?, ";
        values.add(this.getSuvNumCuponVig());
        fields += " SUV_TIT_REQUERIDOS = ?, ";
        values.add(this.getSuvTitRequeridos());
        fields += " SUV_TIT_VENDIDOS = ?, ";
        values.add(this.getSuvTitVendidos());
        fields += " SUV_NUM_TIT_DISP = ?, ";
        values.add(this.getSuvNumTitDisp());
        fields += " SUV_IMP_TIT_VTA = ?, ";
        values.add(this.getSuvImpTitVta());
        fields += " SUV_PRECIO_CIERRE = ?, ";
        values.add(this.getSuvPrecioCierre());
        fields += " SUV_NUM_HORA_CORTE = ?, ";
        values.add(this.getSuvNumHoraCorte());
        fields += " SUV_MINUTOS_CORTE = ?, ";
        values.add(this.getSuvMinutosCorte());
        fields += " SUV_CVE_ST_SUGERVT = ?, ";
        values.add(this.getSuvCveStSugervt());
        fields += " SUV_NUM_MONEDA = ?, ";
        values.add(this.getSuvNumMoneda());
        fields += " SUV_CVE_TIPO_OPERA = ?, ";
        values.add(this.getSuvCveTipoOpera());
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
        String sql = "INSERT INTO SUGERVTA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SUV_ANO_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getSuvAnoSugerencia());

        fields += ", SUV_MES_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getSuvMesSugerencia());

        fields += ", SUV_DIA_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getSuvDiaSugerencia());

        fields += ", SUV_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getSuvNumCorte());

        fields += ", SUV_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSuvNumContrato());

        fields += ", SUV_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSuvSubContrato());

        fields += ", SUV_NUM_ENTID_FIN";
        fieldValues += ", ?";
        values.add(this.getSuvNumEntidFin());

        fields += ", SUV_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getSuvContratoInter());

        fields += ", SUV_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getSuvFolioOpera());

        fields += ", SUV_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getSuvCveTipoMerca());

        fields += ", SUV_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getSuvNumInstrume());

        fields += ", SUV_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getSuvNumSecEmis());

        fields += ", SUV_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getSuvNomPizarra());

        fields += ", SUV_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getSuvSerieEmision());

        fields += ", SUV_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getSuvNumCuponVig());

        fields += ", SUV_TIT_REQUERIDOS";
        fieldValues += ", ?";
        values.add(this.getSuvTitRequeridos());

        fields += ", SUV_TIT_VENDIDOS";
        fieldValues += ", ?";
        values.add(this.getSuvTitVendidos());

        fields += ", SUV_NUM_TIT_DISP";
        fieldValues += ", ?";
        values.add(this.getSuvNumTitDisp());

        fields += ", SUV_IMP_TIT_VTA";
        fieldValues += ", ?";
        values.add(this.getSuvImpTitVta());

        fields += ", SUV_PRECIO_CIERRE";
        fieldValues += ", ?";
        values.add(this.getSuvPrecioCierre());

        fields += ", SUV_NUM_HORA_CORTE";
        fieldValues += ", ?";
        values.add(this.getSuvNumHoraCorte());

        fields += ", SUV_MINUTOS_CORTE";
        fieldValues += ", ?";
        values.add(this.getSuvMinutosCorte());

        fields += ", SUV_CVE_ST_SUGERVT";
        fieldValues += ", ?";
        values.add(this.getSuvCveStSugervt());

        fields += ", SUV_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getSuvNumMoneda());

        fields += ", SUV_CVE_TIPO_OPERA";
        fieldValues += ", ?";
        values.add(this.getSuvCveTipoOpera());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SUGERVTA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SUV_ANO_SUGERENCIA = ?";
        values.add(this.getSuvAnoSugerencia());
        conditions += " AND SUV_MES_SUGERENCIA = ?";
        values.add(this.getSuvMesSugerencia());
        conditions += " AND SUV_DIA_SUGERENCIA = ?";
        values.add(this.getSuvDiaSugerencia());
        conditions += " AND SUV_NUM_CORTE = ?";
        values.add(this.getSuvNumCorte());
        conditions += " AND SUV_NUM_CONTRATO = ?";
        values.add(this.getSuvNumContrato());
        conditions += " AND SUV_SUB_CONTRATO = ?";
        values.add(this.getSuvSubContrato());
        conditions += " AND SUV_NUM_ENTID_FIN = ?";
        values.add(this.getSuvNumEntidFin());
        conditions += " AND SUV_CONTRATO_INTER = ?";
        values.add(this.getSuvContratoInter());
        conditions += " AND SUV_FOLIO_OPERA = ?";
        values.add(this.getSuvFolioOpera());
        conditions += " AND SUV_CVE_TIPO_MERCA = ?";
        values.add(this.getSuvCveTipoMerca());
        conditions += " AND SUV_NUM_INSTRUME = ?";
        values.add(this.getSuvNumInstrume());
        conditions += " AND SUV_NUM_SEC_EMIS = ?";
        values.add(this.getSuvNumSecEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Sugervta instance = (Sugervta) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSuvAnoSugerencia().equals(instance.getSuvAnoSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getSuvMesSugerencia().equals(instance.getSuvMesSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getSuvDiaSugerencia().equals(instance.getSuvDiaSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNumCorte().equals(instance.getSuvNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNumContrato().equals(instance.getSuvNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSuvSubContrato().equals(instance.getSuvSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNumEntidFin().equals(instance.getSuvNumEntidFin()))
            equalObjects = false;
        if (equalObjects && !this.getSuvContratoInter().equals(instance.getSuvContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getSuvFolioOpera().equals(instance.getSuvFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getSuvCveTipoMerca().equals(instance.getSuvCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNumInstrume().equals(instance.getSuvNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNumSecEmis().equals(instance.getSuvNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNomPizarra().equals(instance.getSuvNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getSuvSerieEmision().equals(instance.getSuvSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNumCuponVig().equals(instance.getSuvNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getSuvTitRequeridos().equals(instance.getSuvTitRequeridos()))
            equalObjects = false;
        if (equalObjects && !this.getSuvTitVendidos().equals(instance.getSuvTitVendidos()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNumTitDisp().equals(instance.getSuvNumTitDisp()))
            equalObjects = false;
        if (equalObjects && !this.getSuvImpTitVta().equals(instance.getSuvImpTitVta()))
            equalObjects = false;
        if (equalObjects && !this.getSuvPrecioCierre().equals(instance.getSuvPrecioCierre()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNumHoraCorte().equals(instance.getSuvNumHoraCorte()))
            equalObjects = false;
        if (equalObjects && !this.getSuvMinutosCorte().equals(instance.getSuvMinutosCorte()))
            equalObjects = false;
        if (equalObjects && !this.getSuvCveStSugervt().equals(instance.getSuvCveStSugervt()))
            equalObjects = false;
        if (equalObjects && !this.getSuvNumMoneda().equals(instance.getSuvNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getSuvCveTipoOpera().equals(instance.getSuvCveTipoOpera()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Sugervta result = new Sugervta();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSuvAnoSugerencia((BigDecimal) objectData.getData("SUV_ANO_SUGERENCIA"));
        result.setSuvMesSugerencia((BigDecimal) objectData.getData("SUV_MES_SUGERENCIA"));
        result.setSuvDiaSugerencia((BigDecimal) objectData.getData("SUV_DIA_SUGERENCIA"));
        result.setSuvNumCorte((BigDecimal) objectData.getData("SUV_NUM_CORTE"));
        result.setSuvNumContrato((BigDecimal) objectData.getData("SUV_NUM_CONTRATO"));
        result.setSuvSubContrato((BigDecimal) objectData.getData("SUV_SUB_CONTRATO"));
        result.setSuvNumEntidFin((BigDecimal) objectData.getData("SUV_NUM_ENTID_FIN"));
        result.setSuvContratoInter((BigDecimal) objectData.getData("SUV_CONTRATO_INTER"));
        result.setSuvFolioOpera((BigDecimal) objectData.getData("SUV_FOLIO_OPERA"));
        result.setSuvCveTipoMerca((BigDecimal) objectData.getData("SUV_CVE_TIPO_MERCA"));
        result.setSuvNumInstrume((BigDecimal) objectData.getData("SUV_NUM_INSTRUME"));
        result.setSuvNumSecEmis((BigDecimal) objectData.getData("SUV_NUM_SEC_EMIS"));
        result.setSuvNomPizarra((String) objectData.getData("SUV_NOM_PIZARRA"));
        result.setSuvSerieEmision((String) objectData.getData("SUV_SERIE_EMISION"));
        result.setSuvNumCuponVig((BigDecimal) objectData.getData("SUV_NUM_CUPON_VIG"));
        result.setSuvTitRequeridos((BigDecimal) objectData.getData("SUV_TIT_REQUERIDOS"));
        result.setSuvTitVendidos((BigDecimal) objectData.getData("SUV_TIT_VENDIDOS"));
        result.setSuvNumTitDisp((BigDecimal) objectData.getData("SUV_NUM_TIT_DISP"));
        result.setSuvImpTitVta((BigDecimal) objectData.getData("SUV_IMP_TIT_VTA"));
        result.setSuvPrecioCierre((BigDecimal) objectData.getData("SUV_PRECIO_CIERRE"));
        result.setSuvNumHoraCorte((BigDecimal) objectData.getData("SUV_NUM_HORA_CORTE"));
        result.setSuvMinutosCorte((BigDecimal) objectData.getData("SUV_MINUTOS_CORTE"));
        result.setSuvCveStSugervt((String) objectData.getData("SUV_CVE_ST_SUGERVT"));
        result.setSuvNumMoneda((BigDecimal) objectData.getData("SUV_NUM_MONEDA"));
        result.setSuvCveTipoOpera((String) objectData.getData("SUV_CVE_TIPO_OPERA"));

        return result;

    }

}
