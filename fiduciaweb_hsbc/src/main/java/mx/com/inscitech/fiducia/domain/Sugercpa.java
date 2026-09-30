package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SUGERCPA_PK",
            columns =
            { "SUC_ANO_SUGERENCIA", "SUC_MES_SUGERENCIA", "SUC_DIA_SUGERENCIA", "SUC_NUM_CORTE", "SUC_NUM_CONTRATO", "SUC_SUB_CONTRATO", "SUC_NUM_ENTID_FIN", "SUC_CONTRATO_INTER",
              "SUC_CVE_TIPO_MERCA", "SUC_NUM_INSTRUME", "SUC_NUM_SEC_EMIS", "SUC_NUM_FOLIO_OPER"
    }, sequences = { "MANUAL" })
public class Sugercpa extends DomainObject {

    BigDecimal sucAnoSugerencia = null;
    BigDecimal sucMesSugerencia = null;
    BigDecimal sucDiaSugerencia = null;
    BigDecimal sucNumCorte = null;
    BigDecimal sucNumContrato = null;
    BigDecimal sucSubContrato = null;
    BigDecimal sucNumEntidFin = null;
    BigDecimal sucContratoInter = null;
    BigDecimal sucCveTipoMerca = null;
    BigDecimal sucNumInstrume = null;
    BigDecimal sucNumSecEmis = null;
    BigDecimal sucNumPlazo = null;
    String sucNomPizarra = null;
    String sucSerieEmision = null;
    BigDecimal sucNumCuponVig = null;
    BigDecimal sucImpSugerCpa = null;
    BigDecimal sucImpAsignado = null;
    BigDecimal sucImpDisponible = null;
    String sucCveOrigEfect = null;
    String sucHoraCorte = null;
    String sucCveStSugercp = null;
    BigDecimal sucNumFolioOper = null;
    BigDecimal sucNumMoneda = null;
    String sucCveTipoOpera = null;

    public Sugercpa() {
        super();
        this.pkColumns = 12;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSucAnoSugerencia(BigDecimal sucAnoSugerencia) {
        this.sucAnoSugerencia = sucAnoSugerencia;
    }

    public BigDecimal getSucAnoSugerencia() {
        return this.sucAnoSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSucMesSugerencia(BigDecimal sucMesSugerencia) {
        this.sucMesSugerencia = sucMesSugerencia;
    }

    public BigDecimal getSucMesSugerencia() {
        return this.sucMesSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSucDiaSugerencia(BigDecimal sucDiaSugerencia) {
        this.sucDiaSugerencia = sucDiaSugerencia;
    }

    public BigDecimal getSucDiaSugerencia() {
        return this.sucDiaSugerencia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumCorte(BigDecimal sucNumCorte) {
        this.sucNumCorte = sucNumCorte;
    }

    public BigDecimal getSucNumCorte() {
        return this.sucNumCorte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumContrato(BigDecimal sucNumContrato) {
        this.sucNumContrato = sucNumContrato;
    }

    public BigDecimal getSucNumContrato() {
        return this.sucNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucSubContrato(BigDecimal sucSubContrato) {
        this.sucSubContrato = sucSubContrato;
    }

    public BigDecimal getSucSubContrato() {
        return this.sucSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumEntidFin(BigDecimal sucNumEntidFin) {
        this.sucNumEntidFin = sucNumEntidFin;
    }

    public BigDecimal getSucNumEntidFin() {
        return this.sucNumEntidFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucContratoInter(BigDecimal sucContratoInter) {
        this.sucContratoInter = sucContratoInter;
    }

    public BigDecimal getSucContratoInter() {
        return this.sucContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucCveTipoMerca(BigDecimal sucCveTipoMerca) {
        this.sucCveTipoMerca = sucCveTipoMerca;
    }

    public BigDecimal getSucCveTipoMerca() {
        return this.sucCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumInstrume(BigDecimal sucNumInstrume) {
        this.sucNumInstrume = sucNumInstrume;
    }

    public BigDecimal getSucNumInstrume() {
        return this.sucNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumSecEmis(BigDecimal sucNumSecEmis) {
        this.sucNumSecEmis = sucNumSecEmis;
    }

    public BigDecimal getSucNumSecEmis() {
        return this.sucNumSecEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumPlazo(BigDecimal sucNumPlazo) {
        this.sucNumPlazo = sucNumPlazo;
    }

    public BigDecimal getSucNumPlazo() {
        return this.sucNumPlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSucNomPizarra(String sucNomPizarra) {
        this.sucNomPizarra = sucNomPizarra;
    }

    public String getSucNomPizarra() {
        return this.sucNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSucSerieEmision(String sucSerieEmision) {
        this.sucSerieEmision = sucSerieEmision;
    }

    public String getSucSerieEmision() {
        return this.sucSerieEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumCuponVig(BigDecimal sucNumCuponVig) {
        this.sucNumCuponVig = sucNumCuponVig;
    }

    public BigDecimal getSucNumCuponVig() {
        return this.sucNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSucImpSugerCpa(BigDecimal sucImpSugerCpa) {
        this.sucImpSugerCpa = sucImpSugerCpa;
    }

    public BigDecimal getSucImpSugerCpa() {
        return this.sucImpSugerCpa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSucImpAsignado(BigDecimal sucImpAsignado) {
        this.sucImpAsignado = sucImpAsignado;
    }

    public BigDecimal getSucImpAsignado() {
        return this.sucImpAsignado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSucImpDisponible(BigDecimal sucImpDisponible) {
        this.sucImpDisponible = sucImpDisponible;
    }

    public BigDecimal getSucImpDisponible() {
        return this.sucImpDisponible;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSucCveOrigEfect(String sucCveOrigEfect) {
        this.sucCveOrigEfect = sucCveOrigEfect;
    }

    public String getSucCveOrigEfect() {
        return this.sucCveOrigEfect;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSucHoraCorte(String sucHoraCorte) {
        this.sucHoraCorte = sucHoraCorte;
    }

    public String getSucHoraCorte() {
        return this.sucHoraCorte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSucCveStSugercp(String sucCveStSugercp) {
        this.sucCveStSugercp = sucCveStSugercp;
    }

    public String getSucCveStSugercp() {
        return this.sucCveStSugercp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumFolioOper(BigDecimal sucNumFolioOper) {
        this.sucNumFolioOper = sucNumFolioOper;
    }

    public BigDecimal getSucNumFolioOper() {
        return this.sucNumFolioOper;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSucNumMoneda(BigDecimal sucNumMoneda) {
        this.sucNumMoneda = sucNumMoneda;
    }

    public BigDecimal getSucNumMoneda() {
        return this.sucNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSucCveTipoOpera(String sucCveTipoOpera) {
        this.sucCveTipoOpera = sucCveTipoOpera;
    }

    public String getSucCveTipoOpera() {
        return this.sucCveTipoOpera;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SUGERCPA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSucAnoSugerencia() != null && this.getSucAnoSugerencia().longValue() == -999) {
            conditions += " AND SUC_ANO_SUGERENCIA IS NULL";
        } else if (this.getSucAnoSugerencia() != null) {
            conditions += " AND SUC_ANO_SUGERENCIA = ?";
            values.add(this.getSucAnoSugerencia());
        }

        if (this.getSucMesSugerencia() != null && this.getSucMesSugerencia().longValue() == -999) {
            conditions += " AND SUC_MES_SUGERENCIA IS NULL";
        } else if (this.getSucMesSugerencia() != null) {
            conditions += " AND SUC_MES_SUGERENCIA = ?";
            values.add(this.getSucMesSugerencia());
        }

        if (this.getSucDiaSugerencia() != null && this.getSucDiaSugerencia().longValue() == -999) {
            conditions += " AND SUC_DIA_SUGERENCIA IS NULL";
        } else if (this.getSucDiaSugerencia() != null) {
            conditions += " AND SUC_DIA_SUGERENCIA = ?";
            values.add(this.getSucDiaSugerencia());
        }

        if (this.getSucNumCorte() != null && this.getSucNumCorte().longValue() == -999) {
            conditions += " AND SUC_NUM_CORTE IS NULL";
        } else if (this.getSucNumCorte() != null) {
            conditions += " AND SUC_NUM_CORTE = ?";
            values.add(this.getSucNumCorte());
        }

        if (this.getSucNumContrato() != null && this.getSucNumContrato().longValue() == -999) {
            conditions += " AND SUC_NUM_CONTRATO IS NULL";
        } else if (this.getSucNumContrato() != null) {
            conditions += " AND SUC_NUM_CONTRATO = ?";
            values.add(this.getSucNumContrato());
        }

        if (this.getSucSubContrato() != null && this.getSucSubContrato().longValue() == -999) {
            conditions += " AND SUC_SUB_CONTRATO IS NULL";
        } else if (this.getSucSubContrato() != null) {
            conditions += " AND SUC_SUB_CONTRATO = ?";
            values.add(this.getSucSubContrato());
        }

        if (this.getSucNumEntidFin() != null && this.getSucNumEntidFin().longValue() == -999) {
            conditions += " AND SUC_NUM_ENTID_FIN IS NULL";
        } else if (this.getSucNumEntidFin() != null) {
            conditions += " AND SUC_NUM_ENTID_FIN = ?";
            values.add(this.getSucNumEntidFin());
        }

        if (this.getSucContratoInter() != null && this.getSucContratoInter().longValue() == -999) {
            conditions += " AND SUC_CONTRATO_INTER IS NULL";
        } else if (this.getSucContratoInter() != null) {
            conditions += " AND SUC_CONTRATO_INTER = ?";
            values.add(this.getSucContratoInter());
        }

        if (this.getSucCveTipoMerca() != null && this.getSucCveTipoMerca().longValue() == -999) {
            conditions += " AND SUC_CVE_TIPO_MERCA IS NULL";
        } else if (this.getSucCveTipoMerca() != null) {
            conditions += " AND SUC_CVE_TIPO_MERCA = ?";
            values.add(this.getSucCveTipoMerca());
        }

        if (this.getSucNumInstrume() != null && this.getSucNumInstrume().longValue() == -999) {
            conditions += " AND SUC_NUM_INSTRUME IS NULL";
        } else if (this.getSucNumInstrume() != null) {
            conditions += " AND SUC_NUM_INSTRUME = ?";
            values.add(this.getSucNumInstrume());
        }

        if (this.getSucNumSecEmis() != null && this.getSucNumSecEmis().longValue() == -999) {
            conditions += " AND SUC_NUM_SEC_EMIS IS NULL";
        } else if (this.getSucNumSecEmis() != null) {
            conditions += " AND SUC_NUM_SEC_EMIS = ?";
            values.add(this.getSucNumSecEmis());
        }

        if (this.getSucNumFolioOper() != null && this.getSucNumFolioOper().longValue() == -999) {
            conditions += " AND SUC_NUM_FOLIO_OPER IS NULL";
        } else if (this.getSucNumFolioOper() != null) {
            conditions += " AND SUC_NUM_FOLIO_OPER = ?";
            values.add(this.getSucNumFolioOper());
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
        String sql = "SELECT * FROM SUGERCPA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSucAnoSugerencia() != null && this.getSucAnoSugerencia().longValue() == -999) {
            conditions += " AND SUC_ANO_SUGERENCIA IS NULL";
        } else if (this.getSucAnoSugerencia() != null) {
            conditions += " AND SUC_ANO_SUGERENCIA = ?";
            values.add(this.getSucAnoSugerencia());
        }

        if (this.getSucMesSugerencia() != null && this.getSucMesSugerencia().longValue() == -999) {
            conditions += " AND SUC_MES_SUGERENCIA IS NULL";
        } else if (this.getSucMesSugerencia() != null) {
            conditions += " AND SUC_MES_SUGERENCIA = ?";
            values.add(this.getSucMesSugerencia());
        }

        if (this.getSucDiaSugerencia() != null && this.getSucDiaSugerencia().longValue() == -999) {
            conditions += " AND SUC_DIA_SUGERENCIA IS NULL";
        } else if (this.getSucDiaSugerencia() != null) {
            conditions += " AND SUC_DIA_SUGERENCIA = ?";
            values.add(this.getSucDiaSugerencia());
        }

        if (this.getSucNumCorte() != null && this.getSucNumCorte().longValue() == -999) {
            conditions += " AND SUC_NUM_CORTE IS NULL";
        } else if (this.getSucNumCorte() != null) {
            conditions += " AND SUC_NUM_CORTE = ?";
            values.add(this.getSucNumCorte());
        }

        if (this.getSucNumContrato() != null && this.getSucNumContrato().longValue() == -999) {
            conditions += " AND SUC_NUM_CONTRATO IS NULL";
        } else if (this.getSucNumContrato() != null) {
            conditions += " AND SUC_NUM_CONTRATO = ?";
            values.add(this.getSucNumContrato());
        }

        if (this.getSucSubContrato() != null && this.getSucSubContrato().longValue() == -999) {
            conditions += " AND SUC_SUB_CONTRATO IS NULL";
        } else if (this.getSucSubContrato() != null) {
            conditions += " AND SUC_SUB_CONTRATO = ?";
            values.add(this.getSucSubContrato());
        }

        if (this.getSucNumEntidFin() != null && this.getSucNumEntidFin().longValue() == -999) {
            conditions += " AND SUC_NUM_ENTID_FIN IS NULL";
        } else if (this.getSucNumEntidFin() != null) {
            conditions += " AND SUC_NUM_ENTID_FIN = ?";
            values.add(this.getSucNumEntidFin());
        }

        if (this.getSucContratoInter() != null && this.getSucContratoInter().longValue() == -999) {
            conditions += " AND SUC_CONTRATO_INTER IS NULL";
        } else if (this.getSucContratoInter() != null) {
            conditions += " AND SUC_CONTRATO_INTER = ?";
            values.add(this.getSucContratoInter());
        }

        if (this.getSucCveTipoMerca() != null && this.getSucCveTipoMerca().longValue() == -999) {
            conditions += " AND SUC_CVE_TIPO_MERCA IS NULL";
        } else if (this.getSucCveTipoMerca() != null) {
            conditions += " AND SUC_CVE_TIPO_MERCA = ?";
            values.add(this.getSucCveTipoMerca());
        }

        if (this.getSucNumInstrume() != null && this.getSucNumInstrume().longValue() == -999) {
            conditions += " AND SUC_NUM_INSTRUME IS NULL";
        } else if (this.getSucNumInstrume() != null) {
            conditions += " AND SUC_NUM_INSTRUME = ?";
            values.add(this.getSucNumInstrume());
        }

        if (this.getSucNumSecEmis() != null && this.getSucNumSecEmis().longValue() == -999) {
            conditions += " AND SUC_NUM_SEC_EMIS IS NULL";
        } else if (this.getSucNumSecEmis() != null) {
            conditions += " AND SUC_NUM_SEC_EMIS = ?";
            values.add(this.getSucNumSecEmis());
        }

        if (this.getSucNumPlazo() != null && this.getSucNumPlazo().longValue() == -999) {
            conditions += " AND SUC_NUM_PLAZO IS NULL";
        } else if (this.getSucNumPlazo() != null) {
            conditions += " AND SUC_NUM_PLAZO = ?";
            values.add(this.getSucNumPlazo());
        }

        if (this.getSucNomPizarra() != null && "null".equals(this.getSucNomPizarra())) {
            conditions += " AND SUC_NOM_PIZARRA IS NULL";
        } else if (this.getSucNomPizarra() != null) {
            conditions += " AND SUC_NOM_PIZARRA = ?";
            values.add(this.getSucNomPizarra());
        }

        if (this.getSucSerieEmision() != null && "null".equals(this.getSucSerieEmision())) {
            conditions += " AND SUC_SERIE_EMISION IS NULL";
        } else if (this.getSucSerieEmision() != null) {
            conditions += " AND SUC_SERIE_EMISION = ?";
            values.add(this.getSucSerieEmision());
        }

        if (this.getSucNumCuponVig() != null && this.getSucNumCuponVig().longValue() == -999) {
            conditions += " AND SUC_NUM_CUPON_VIG IS NULL";
        } else if (this.getSucNumCuponVig() != null) {
            conditions += " AND SUC_NUM_CUPON_VIG = ?";
            values.add(this.getSucNumCuponVig());
        }

        if (this.getSucImpSugerCpa() != null && this.getSucImpSugerCpa().longValue() == -999) {
            conditions += " AND SUC_IMP_SUGER_CPA IS NULL";
        } else if (this.getSucImpSugerCpa() != null) {
            conditions += " AND SUC_IMP_SUGER_CPA = ?";
            values.add(this.getSucImpSugerCpa());
        }

        if (this.getSucImpAsignado() != null && this.getSucImpAsignado().longValue() == -999) {
            conditions += " AND SUC_IMP_ASIGNADO IS NULL";
        } else if (this.getSucImpAsignado() != null) {
            conditions += " AND SUC_IMP_ASIGNADO = ?";
            values.add(this.getSucImpAsignado());
        }

        if (this.getSucImpDisponible() != null && this.getSucImpDisponible().longValue() == -999) {
            conditions += " AND SUC_IMP_DISPONIBLE IS NULL";
        } else if (this.getSucImpDisponible() != null) {
            conditions += " AND SUC_IMP_DISPONIBLE = ?";
            values.add(this.getSucImpDisponible());
        }

        if (this.getSucCveOrigEfect() != null && "null".equals(this.getSucCveOrigEfect())) {
            conditions += " AND SUC_CVE_ORIG_EFECT IS NULL";
        } else if (this.getSucCveOrigEfect() != null) {
            conditions += " AND SUC_CVE_ORIG_EFECT = ?";
            values.add(this.getSucCveOrigEfect());
        }

        if (this.getSucHoraCorte() != null && "null".equals(this.getSucHoraCorte())) {
            conditions += " AND SUC_HORA_CORTE IS NULL";
        } else if (this.getSucHoraCorte() != null) {
            conditions += " AND SUC_HORA_CORTE = ?";
            values.add(this.getSucHoraCorte());
        }

        if (this.getSucCveStSugercp() != null && "null".equals(this.getSucCveStSugercp())) {
            conditions += " AND SUC_CVE_ST_SUGERCP IS NULL";
        } else if (this.getSucCveStSugercp() != null) {
            conditions += " AND SUC_CVE_ST_SUGERCP = ?";
            values.add(this.getSucCveStSugercp());
        }

        if (this.getSucNumFolioOper() != null && this.getSucNumFolioOper().longValue() == -999) {
            conditions += " AND SUC_NUM_FOLIO_OPER IS NULL";
        } else if (this.getSucNumFolioOper() != null) {
            conditions += " AND SUC_NUM_FOLIO_OPER = ?";
            values.add(this.getSucNumFolioOper());
        }

        if (this.getSucNumMoneda() != null && this.getSucNumMoneda().longValue() == -999) {
            conditions += " AND SUC_NUM_MONEDA IS NULL";
        } else if (this.getSucNumMoneda() != null) {
            conditions += " AND SUC_NUM_MONEDA = ?";
            values.add(this.getSucNumMoneda());
        }

        if (this.getSucCveTipoOpera() != null && "null".equals(this.getSucCveTipoOpera())) {
            conditions += " AND SUC_CVE_TIPO_OPERA IS NULL";
        } else if (this.getSucCveTipoOpera() != null) {
            conditions += " AND SUC_CVE_TIPO_OPERA = ?";
            values.add(this.getSucCveTipoOpera());
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
        String sql = "UPDATE SUGERCPA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SUC_ANO_SUGERENCIA = ?";
        pkValues.add(this.getSucAnoSugerencia());
        conditions += " AND SUC_MES_SUGERENCIA = ?";
        pkValues.add(this.getSucMesSugerencia());
        conditions += " AND SUC_DIA_SUGERENCIA = ?";
        pkValues.add(this.getSucDiaSugerencia());
        conditions += " AND SUC_NUM_CORTE = ?";
        pkValues.add(this.getSucNumCorte());
        conditions += " AND SUC_NUM_CONTRATO = ?";
        pkValues.add(this.getSucNumContrato());
        conditions += " AND SUC_SUB_CONTRATO = ?";
        pkValues.add(this.getSucSubContrato());
        conditions += " AND SUC_NUM_ENTID_FIN = ?";
        pkValues.add(this.getSucNumEntidFin());
        conditions += " AND SUC_CONTRATO_INTER = ?";
        pkValues.add(this.getSucContratoInter());
        conditions += " AND SUC_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getSucCveTipoMerca());
        conditions += " AND SUC_NUM_INSTRUME = ?";
        pkValues.add(this.getSucNumInstrume());
        conditions += " AND SUC_NUM_SEC_EMIS = ?";
        pkValues.add(this.getSucNumSecEmis());
        fields += " SUC_NUM_PLAZO = ?, ";
        values.add(this.getSucNumPlazo());
        fields += " SUC_NOM_PIZARRA = ?, ";
        values.add(this.getSucNomPizarra());
        fields += " SUC_SERIE_EMISION = ?, ";
        values.add(this.getSucSerieEmision());
        fields += " SUC_NUM_CUPON_VIG = ?, ";
        values.add(this.getSucNumCuponVig());
        fields += " SUC_IMP_SUGER_CPA = ?, ";
        values.add(this.getSucImpSugerCpa());
        fields += " SUC_IMP_ASIGNADO = ?, ";
        values.add(this.getSucImpAsignado());
        fields += " SUC_IMP_DISPONIBLE = ?, ";
        values.add(this.getSucImpDisponible());
        fields += " SUC_CVE_ORIG_EFECT = ?, ";
        values.add(this.getSucCveOrigEfect());
        fields += " SUC_HORA_CORTE = ?, ";
        values.add(this.getSucHoraCorte());
        fields += " SUC_CVE_ST_SUGERCP = ?, ";
        values.add(this.getSucCveStSugercp());
        conditions += " AND SUC_NUM_FOLIO_OPER = ?";
        pkValues.add(this.getSucNumFolioOper());
        fields += " SUC_NUM_MONEDA = ?, ";
        values.add(this.getSucNumMoneda());
        fields += " SUC_CVE_TIPO_OPERA = ?, ";
        values.add(this.getSucCveTipoOpera());
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
        String sql = "INSERT INTO SUGERCPA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SUC_ANO_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getSucAnoSugerencia());

        fields += ", SUC_MES_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getSucMesSugerencia());

        fields += ", SUC_DIA_SUGERENCIA";
        fieldValues += ", ?";
        values.add(this.getSucDiaSugerencia());

        fields += ", SUC_NUM_CORTE";
        fieldValues += ", ?";
        values.add(this.getSucNumCorte());

        fields += ", SUC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSucNumContrato());

        fields += ", SUC_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSucSubContrato());

        fields += ", SUC_NUM_ENTID_FIN";
        fieldValues += ", ?";
        values.add(this.getSucNumEntidFin());

        fields += ", SUC_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getSucContratoInter());

        fields += ", SUC_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getSucCveTipoMerca());

        fields += ", SUC_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getSucNumInstrume());

        fields += ", SUC_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getSucNumSecEmis());

        fields += ", SUC_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getSucNumPlazo());

        fields += ", SUC_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getSucNomPizarra());

        fields += ", SUC_SERIE_EMISION";
        fieldValues += ", ?";
        values.add(this.getSucSerieEmision());

        fields += ", SUC_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getSucNumCuponVig());

        fields += ", SUC_IMP_SUGER_CPA";
        fieldValues += ", ?";
        values.add(this.getSucImpSugerCpa());

        fields += ", SUC_IMP_ASIGNADO";
        fieldValues += ", ?";
        values.add(this.getSucImpAsignado());

        fields += ", SUC_IMP_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getSucImpDisponible());

        fields += ", SUC_CVE_ORIG_EFECT";
        fieldValues += ", ?";
        values.add(this.getSucCveOrigEfect());

        fields += ", SUC_HORA_CORTE";
        fieldValues += ", ?";
        values.add(this.getSucHoraCorte());

        fields += ", SUC_CVE_ST_SUGERCP";
        fieldValues += ", ?";
        values.add(this.getSucCveStSugercp());

        fields += ", SUC_NUM_FOLIO_OPER";
        fieldValues += ", ?";
        values.add(this.getSucNumFolioOper());

        fields += ", SUC_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getSucNumMoneda());

        fields += ", SUC_CVE_TIPO_OPERA";
        fieldValues += ", ?";
        values.add(this.getSucCveTipoOpera());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SUGERCPA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SUC_ANO_SUGERENCIA = ?";
        values.add(this.getSucAnoSugerencia());
        conditions += " AND SUC_MES_SUGERENCIA = ?";
        values.add(this.getSucMesSugerencia());
        conditions += " AND SUC_DIA_SUGERENCIA = ?";
        values.add(this.getSucDiaSugerencia());
        conditions += " AND SUC_NUM_CORTE = ?";
        values.add(this.getSucNumCorte());
        conditions += " AND SUC_NUM_CONTRATO = ?";
        values.add(this.getSucNumContrato());
        conditions += " AND SUC_SUB_CONTRATO = ?";
        values.add(this.getSucSubContrato());
        conditions += " AND SUC_NUM_ENTID_FIN = ?";
        values.add(this.getSucNumEntidFin());
        conditions += " AND SUC_CONTRATO_INTER = ?";
        values.add(this.getSucContratoInter());
        conditions += " AND SUC_CVE_TIPO_MERCA = ?";
        values.add(this.getSucCveTipoMerca());
        conditions += " AND SUC_NUM_INSTRUME = ?";
        values.add(this.getSucNumInstrume());
        conditions += " AND SUC_NUM_SEC_EMIS = ?";
        values.add(this.getSucNumSecEmis());
        conditions += " AND SUC_NUM_FOLIO_OPER = ?";
        values.add(this.getSucNumFolioOper());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Sugercpa instance = (Sugercpa) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSucAnoSugerencia().equals(instance.getSucAnoSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getSucMesSugerencia().equals(instance.getSucMesSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getSucDiaSugerencia().equals(instance.getSucDiaSugerencia()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumCorte().equals(instance.getSucNumCorte()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumContrato().equals(instance.getSucNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSucSubContrato().equals(instance.getSucSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumEntidFin().equals(instance.getSucNumEntidFin()))
            equalObjects = false;
        if (equalObjects && !this.getSucContratoInter().equals(instance.getSucContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getSucCveTipoMerca().equals(instance.getSucCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumInstrume().equals(instance.getSucNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumSecEmis().equals(instance.getSucNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumPlazo().equals(instance.getSucNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getSucNomPizarra().equals(instance.getSucNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getSucSerieEmision().equals(instance.getSucSerieEmision()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumCuponVig().equals(instance.getSucNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getSucImpSugerCpa().equals(instance.getSucImpSugerCpa()))
            equalObjects = false;
        if (equalObjects && !this.getSucImpAsignado().equals(instance.getSucImpAsignado()))
            equalObjects = false;
        if (equalObjects && !this.getSucImpDisponible().equals(instance.getSucImpDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getSucCveOrigEfect().equals(instance.getSucCveOrigEfect()))
            equalObjects = false;
        if (equalObjects && !this.getSucHoraCorte().equals(instance.getSucHoraCorte()))
            equalObjects = false;
        if (equalObjects && !this.getSucCveStSugercp().equals(instance.getSucCveStSugercp()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumFolioOper().equals(instance.getSucNumFolioOper()))
            equalObjects = false;
        if (equalObjects && !this.getSucNumMoneda().equals(instance.getSucNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getSucCveTipoOpera().equals(instance.getSucCveTipoOpera()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Sugercpa result = new Sugercpa();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSucAnoSugerencia((BigDecimal) objectData.getData("SUC_ANO_SUGERENCIA"));
        result.setSucMesSugerencia((BigDecimal) objectData.getData("SUC_MES_SUGERENCIA"));
        result.setSucDiaSugerencia((BigDecimal) objectData.getData("SUC_DIA_SUGERENCIA"));
        result.setSucNumCorte((BigDecimal) objectData.getData("SUC_NUM_CORTE"));
        result.setSucNumContrato((BigDecimal) objectData.getData("SUC_NUM_CONTRATO"));
        result.setSucSubContrato((BigDecimal) objectData.getData("SUC_SUB_CONTRATO"));
        result.setSucNumEntidFin((BigDecimal) objectData.getData("SUC_NUM_ENTID_FIN"));
        result.setSucContratoInter((BigDecimal) objectData.getData("SUC_CONTRATO_INTER"));
        result.setSucCveTipoMerca((BigDecimal) objectData.getData("SUC_CVE_TIPO_MERCA"));
        result.setSucNumInstrume((BigDecimal) objectData.getData("SUC_NUM_INSTRUME"));
        result.setSucNumSecEmis((BigDecimal) objectData.getData("SUC_NUM_SEC_EMIS"));
        result.setSucNumPlazo((BigDecimal) objectData.getData("SUC_NUM_PLAZO"));
        result.setSucNomPizarra((String) objectData.getData("SUC_NOM_PIZARRA"));
        result.setSucSerieEmision((String) objectData.getData("SUC_SERIE_EMISION"));
        result.setSucNumCuponVig((BigDecimal) objectData.getData("SUC_NUM_CUPON_VIG"));
        result.setSucImpSugerCpa((BigDecimal) objectData.getData("SUC_IMP_SUGER_CPA"));
        result.setSucImpAsignado((BigDecimal) objectData.getData("SUC_IMP_ASIGNADO"));
        result.setSucImpDisponible((BigDecimal) objectData.getData("SUC_IMP_DISPONIBLE"));
        result.setSucCveOrigEfect((String) objectData.getData("SUC_CVE_ORIG_EFECT"));
        result.setSucHoraCorte((String) objectData.getData("SUC_HORA_CORTE"));
        result.setSucCveStSugercp((String) objectData.getData("SUC_CVE_ST_SUGERCP"));
        result.setSucNumFolioOper((BigDecimal) objectData.getData("SUC_NUM_FOLIO_OPER"));
        result.setSucNumMoneda((BigDecimal) objectData.getData("SUC_NUM_MONEDA"));
        result.setSucCveTipoOpera((String) objectData.getData("SUC_CVE_TIPO_OPERA"));

        return result;

    }

}
