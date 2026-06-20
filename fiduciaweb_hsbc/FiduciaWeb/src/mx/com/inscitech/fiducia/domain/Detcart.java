package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DETCART_PK", columns = { "DEC_CVE_TIPO_HONO", "DEC_NUM_PERS_FID", "DEC_CVE_PERS_FID", "DEC_NUM_CONTRATO", "DEC_FEC_CALC_HONO", "DEC_NUM_SECUENCIAL" },
            sequences = { "MANUAL" })
public class Detcart extends DomainObject {

    public BigDecimal decNumContrato = null;
    public String decCvePersFid = null;
    public BigDecimal decNumPersFid = null;
    public String decCveTipoHono = null;
    public String decFecCalcHono = null;
    public BigDecimal decNumSecuencial = null;
    public BigDecimal decNumServicio = null;
    BigDecimal decNumTramite = null;
    public String decConceptoHono = null;
    BigDecimal decCvePerPagado = null;
    BigDecimal decAnoPerDel = null;
    BigDecimal decMesPerDel = null;
    BigDecimal decDiaPerDel = null;
    BigDecimal decAnoPerAl = null;
    BigDecimal decMesPerAl = null;
    BigDecimal decDiaPerAl = null;
    BigDecimal decImpRemHonor = null;
    BigDecimal decRemIvaHonor = null;
    BigDecimal decRemExtemp = null;
    public BigDecimal decImpOrigHonor = null;
    BigDecimal decOrigIvaHonor = null;
    BigDecimal decOrigExtemp = null;
    public BigDecimal decImpPagosEfe = null;
    BigDecimal decNumPagosEfe = null;
    BigDecimal decNumRecordat = null;
    BigDecimal decNumMoneda = null;
    String decCveCalifHono = null;
    public BigDecimal decFolioOpera = null;
    BigDecimal decAnoAltaReg = null;
    BigDecimal decMesAltaReg = null;
    BigDecimal decDiaAltaReg = null;
    BigDecimal decAnoUltMod = null;
    BigDecimal decMesUltMod = null;
    BigDecimal decDiaUltMod = null;
    String decCveStDetcart = null;
    String decNumReferencia = null;

    public Detcart() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDecNumContrato(BigDecimal decNumContrato) {
        this.decNumContrato = decNumContrato;
    }

    public BigDecimal getDecNumContrato() {
        return this.decNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDecCvePersFid(String decCvePersFid) {
        this.decCvePersFid = decCvePersFid;
    }

    public String getDecCvePersFid() {
        return this.decCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDecNumPersFid(BigDecimal decNumPersFid) {
        this.decNumPersFid = decNumPersFid;
    }

    public BigDecimal getDecNumPersFid() {
        return this.decNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDecCveTipoHono(String decCveTipoHono) {
        this.decCveTipoHono = decCveTipoHono;
    }

    public String getDecCveTipoHono() {
        return this.decCveTipoHono;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDecFecCalcHono(String decFecCalcHono) {
        this.decFecCalcHono = decFecCalcHono;
    }

    public String getDecFecCalcHono() {
        return this.decFecCalcHono;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDecNumSecuencial(BigDecimal decNumSecuencial) {
        this.decNumSecuencial = decNumSecuencial;
    }

    public BigDecimal getDecNumSecuencial() {
        return this.decNumSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDecNumServicio(BigDecimal decNumServicio) {
        this.decNumServicio = decNumServicio;
    }

    public BigDecimal getDecNumServicio() {
        return this.decNumServicio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDecNumTramite(BigDecimal decNumTramite) {
        this.decNumTramite = decNumTramite;
    }

    public BigDecimal getDecNumTramite() {
        return this.decNumTramite;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDecConceptoHono(String decConceptoHono) {
        this.decConceptoHono = decConceptoHono;
    }

    public String getDecConceptoHono() {
        return this.decConceptoHono;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDecCvePerPagado(BigDecimal decCvePerPagado) {
        this.decCvePerPagado = decCvePerPagado;
    }

    public BigDecimal getDecCvePerPagado() {
        return this.decCvePerPagado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDecAnoPerDel(BigDecimal decAnoPerDel) {
        this.decAnoPerDel = decAnoPerDel;
    }

    public BigDecimal getDecAnoPerDel() {
        return this.decAnoPerDel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDecMesPerDel(BigDecimal decMesPerDel) {
        this.decMesPerDel = decMesPerDel;
    }

    public BigDecimal getDecMesPerDel() {
        return this.decMesPerDel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDecDiaPerDel(BigDecimal decDiaPerDel) {
        this.decDiaPerDel = decDiaPerDel;
    }

    public BigDecimal getDecDiaPerDel() {
        return this.decDiaPerDel;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDecAnoPerAl(BigDecimal decAnoPerAl) {
        this.decAnoPerAl = decAnoPerAl;
    }

    public BigDecimal getDecAnoPerAl() {
        return this.decAnoPerAl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDecMesPerAl(BigDecimal decMesPerAl) {
        this.decMesPerAl = decMesPerAl;
    }

    public BigDecimal getDecMesPerAl() {
        return this.decMesPerAl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDecDiaPerAl(BigDecimal decDiaPerAl) {
        this.decDiaPerAl = decDiaPerAl;
    }

    public BigDecimal getDecDiaPerAl() {
        return this.decDiaPerAl;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDecImpRemHonor(BigDecimal decImpRemHonor) {
        this.decImpRemHonor = decImpRemHonor;
    }

    public BigDecimal getDecImpRemHonor() {
        return this.decImpRemHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDecRemIvaHonor(BigDecimal decRemIvaHonor) {
        this.decRemIvaHonor = decRemIvaHonor;
    }

    public BigDecimal getDecRemIvaHonor() {
        return this.decRemIvaHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDecRemExtemp(BigDecimal decRemExtemp) {
        this.decRemExtemp = decRemExtemp;
    }

    public BigDecimal getDecRemExtemp() {
        return this.decRemExtemp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDecImpOrigHonor(BigDecimal decImpOrigHonor) {
        this.decImpOrigHonor = decImpOrigHonor;
    }

    public BigDecimal getDecImpOrigHonor() {
        return this.decImpOrigHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDecOrigIvaHonor(BigDecimal decOrigIvaHonor) {
        this.decOrigIvaHonor = decOrigIvaHonor;
    }

    public BigDecimal getDecOrigIvaHonor() {
        return this.decOrigIvaHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDecOrigExtemp(BigDecimal decOrigExtemp) {
        this.decOrigExtemp = decOrigExtemp;
    }

    public BigDecimal getDecOrigExtemp() {
        return this.decOrigExtemp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setDecImpPagosEfe(BigDecimal decImpPagosEfe) {
        this.decImpPagosEfe = decImpPagosEfe;
    }

    public BigDecimal getDecImpPagosEfe() {
        return this.decImpPagosEfe;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDecNumPagosEfe(BigDecimal decNumPagosEfe) {
        this.decNumPagosEfe = decNumPagosEfe;
    }

    public BigDecimal getDecNumPagosEfe() {
        return this.decNumPagosEfe;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDecNumRecordat(BigDecimal decNumRecordat) {
        this.decNumRecordat = decNumRecordat;
    }

    public BigDecimal getDecNumRecordat() {
        return this.decNumRecordat;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDecNumMoneda(BigDecimal decNumMoneda) {
        this.decNumMoneda = decNumMoneda;
    }

    public BigDecimal getDecNumMoneda() {
        return this.decNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDecCveCalifHono(String decCveCalifHono) {
        this.decCveCalifHono = decCveCalifHono;
    }

    public String getDecCveCalifHono() {
        return this.decCveCalifHono;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDecFolioOpera(BigDecimal decFolioOpera) {
        this.decFolioOpera = decFolioOpera;
    }

    public BigDecimal getDecFolioOpera() {
        return this.decFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDecAnoAltaReg(BigDecimal decAnoAltaReg) {
        this.decAnoAltaReg = decAnoAltaReg;
    }

    public BigDecimal getDecAnoAltaReg() {
        return this.decAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDecMesAltaReg(BigDecimal decMesAltaReg) {
        this.decMesAltaReg = decMesAltaReg;
    }

    public BigDecimal getDecMesAltaReg() {
        return this.decMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDecDiaAltaReg(BigDecimal decDiaAltaReg) {
        this.decDiaAltaReg = decDiaAltaReg;
    }

    public BigDecimal getDecDiaAltaReg() {
        return this.decDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDecAnoUltMod(BigDecimal decAnoUltMod) {
        this.decAnoUltMod = decAnoUltMod;
    }

    public BigDecimal getDecAnoUltMod() {
        return this.decAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDecMesUltMod(BigDecimal decMesUltMod) {
        this.decMesUltMod = decMesUltMod;
    }

    public BigDecimal getDecMesUltMod() {
        return this.decMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDecDiaUltMod(BigDecimal decDiaUltMod) {
        this.decDiaUltMod = decDiaUltMod;
    }

    public BigDecimal getDecDiaUltMod() {
        return this.decDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDecCveStDetcart(String decCveStDetcart) {
        this.decCveStDetcart = decCveStDetcart;
    }

    public String getDecCveStDetcart() {
        return this.decCveStDetcart;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDecNumReferencia(String decNumReferencia) {
        this.decNumReferencia = decNumReferencia;
    }

    public String getDecNumReferencia() {
        return this.decNumReferencia;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DETCART ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDecNumContrato() != null && this.getDecNumContrato().longValue() == -999) {
            conditions += " AND DEC_NUM_CONTRATO IS NULL";
        } else if (this.getDecNumContrato() != null) {
            conditions += " AND DEC_NUM_CONTRATO = ?";
            values.add(this.getDecNumContrato());
        }

        if (this.getDecCvePersFid() != null && "null".equals(this.getDecCvePersFid())) {
            conditions += " AND DEC_CVE_PERS_FID IS NULL";
        } else if (this.getDecCvePersFid() != null) {
            conditions += " AND DEC_CVE_PERS_FID = ?";
            values.add(this.getDecCvePersFid());
        }

        if (this.getDecNumPersFid() != null && this.getDecNumPersFid().longValue() == -999) {
            conditions += " AND DEC_NUM_PERS_FID IS NULL";
        } else if (this.getDecNumPersFid() != null) {
            conditions += " AND DEC_NUM_PERS_FID = ?";
            values.add(this.getDecNumPersFid());
        }

        if (this.getDecCveTipoHono() != null && "null".equals(this.getDecCveTipoHono())) {
            conditions += " AND DEC_CVE_TIPO_HONO IS NULL";
        } else if (this.getDecCveTipoHono() != null) {
            conditions += " AND DEC_CVE_TIPO_HONO = ?";
            values.add(this.getDecCveTipoHono());
        }

        if (this.getDecFecCalcHono() != null && "null".equals(this.getDecFecCalcHono())) {
            conditions += " AND DEC_FEC_CALC_HONO IS NULL";
        } else if (this.getDecFecCalcHono() != null) {
            conditions += " AND DEC_FEC_CALC_HONO = ?";
            values.add(this.getDecFecCalcHono());
        }

        if (this.getDecNumSecuencial() != null && this.getDecNumSecuencial().longValue() == -999) {
            conditions += " AND DEC_NUM_SECUENCIAL IS NULL";
        } else if (this.getDecNumSecuencial() != null) {
            conditions += " AND DEC_NUM_SECUENCIAL = ?";
            values.add(this.getDecNumSecuencial());
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
        String sql = "SELECT * FROM DETCART ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDecNumContrato() != null && this.getDecNumContrato().longValue() == -999) {
            conditions += " AND DEC_NUM_CONTRATO IS NULL";
        } else if (this.getDecNumContrato() != null) {
            conditions += " AND DEC_NUM_CONTRATO = ?";
            values.add(this.getDecNumContrato());
        }

        if (this.getDecCvePersFid() != null && "null".equals(this.getDecCvePersFid())) {
            conditions += " AND DEC_CVE_PERS_FID IS NULL";
        } else if (this.getDecCvePersFid() != null) {
            conditions += " AND DEC_CVE_PERS_FID = ?";
            values.add(this.getDecCvePersFid());
        }

        if (this.getDecNumPersFid() != null && this.getDecNumPersFid().longValue() == -999) {
            conditions += " AND DEC_NUM_PERS_FID IS NULL";
        } else if (this.getDecNumPersFid() != null) {
            conditions += " AND DEC_NUM_PERS_FID = ?";
            values.add(this.getDecNumPersFid());
        }

        if (this.getDecCveTipoHono() != null && "null".equals(this.getDecCveTipoHono())) {
            conditions += " AND DEC_CVE_TIPO_HONO IS NULL";
        } else if (this.getDecCveTipoHono() != null) {
            conditions += " AND DEC_CVE_TIPO_HONO = ?";
            values.add(this.getDecCveTipoHono());
        }

        if (this.getDecFecCalcHono() != null && "null".equals(this.getDecFecCalcHono())) {
            conditions += " AND DEC_FEC_CALC_HONO IS NULL";
        } else if (this.getDecFecCalcHono() != null) {
            conditions += " AND DEC_FEC_CALC_HONO = ?";
            values.add(this.getDecFecCalcHono());
        }

        if (this.getDecNumSecuencial() != null && this.getDecNumSecuencial().longValue() == -999) {
            conditions += " AND DEC_NUM_SECUENCIAL IS NULL";
        } else if (this.getDecNumSecuencial() != null) {
            conditions += " AND DEC_NUM_SECUENCIAL = ?";
            values.add(this.getDecNumSecuencial());
        }

        if (this.getDecNumServicio() != null && this.getDecNumServicio().longValue() == -999) {
            conditions += " AND DEC_NUM_SERVICIO IS NULL";
        } else if (this.getDecNumServicio() != null) {
            conditions += " AND DEC_NUM_SERVICIO = ?";
            values.add(this.getDecNumServicio());
        }

        if (this.getDecNumTramite() != null && this.getDecNumTramite().longValue() == -999) {
            conditions += " AND DEC_NUM_TRAMITE IS NULL";
        } else if (this.getDecNumTramite() != null) {
            conditions += " AND DEC_NUM_TRAMITE = ?";
            values.add(this.getDecNumTramite());
        }

        if (this.getDecConceptoHono() != null && "null".equals(this.getDecConceptoHono())) {
            conditions += " AND DEC_CONCEPTO_HONO IS NULL";
        } else if (this.getDecConceptoHono() != null) {
            conditions += " AND DEC_CONCEPTO_HONO = ?";
            values.add(this.getDecConceptoHono());
        }

        if (this.getDecCvePerPagado() != null && this.getDecCvePerPagado().longValue() == -999) {
            conditions += " AND DEC_CVE_PER_PAGADO IS NULL";
        } else if (this.getDecCvePerPagado() != null) {
            conditions += " AND DEC_CVE_PER_PAGADO = ?";
            values.add(this.getDecCvePerPagado());
        }

        if (this.getDecAnoPerDel() != null && this.getDecAnoPerDel().longValue() == -999) {
            conditions += " AND DEC_ANO_PER_DEL IS NULL";
        } else if (this.getDecAnoPerDel() != null) {
            conditions += " AND DEC_ANO_PER_DEL = ?";
            values.add(this.getDecAnoPerDel());
        }

        if (this.getDecMesPerDel() != null && this.getDecMesPerDel().longValue() == -999) {
            conditions += " AND DEC_MES_PER_DEL IS NULL";
        } else if (this.getDecMesPerDel() != null) {
            conditions += " AND DEC_MES_PER_DEL = ?";
            values.add(this.getDecMesPerDel());
        }

        if (this.getDecDiaPerDel() != null && this.getDecDiaPerDel().longValue() == -999) {
            conditions += " AND DEC_DIA_PER_DEL IS NULL";
        } else if (this.getDecDiaPerDel() != null) {
            conditions += " AND DEC_DIA_PER_DEL = ?";
            values.add(this.getDecDiaPerDel());
        }

        if (this.getDecAnoPerAl() != null && this.getDecAnoPerAl().longValue() == -999) {
            conditions += " AND DEC_ANO_PER_AL IS NULL";
        } else if (this.getDecAnoPerAl() != null) {
            conditions += " AND DEC_ANO_PER_AL = ?";
            values.add(this.getDecAnoPerAl());
        }

        if (this.getDecMesPerAl() != null && this.getDecMesPerAl().longValue() == -999) {
            conditions += " AND DEC_MES_PER_AL IS NULL";
        } else if (this.getDecMesPerAl() != null) {
            conditions += " AND DEC_MES_PER_AL = ?";
            values.add(this.getDecMesPerAl());
        }

        if (this.getDecDiaPerAl() != null && this.getDecDiaPerAl().longValue() == -999) {
            conditions += " AND DEC_DIA_PER_AL IS NULL";
        } else if (this.getDecDiaPerAl() != null) {
            conditions += " AND DEC_DIA_PER_AL = ?";
            values.add(this.getDecDiaPerAl());
        }

        if (this.getDecImpRemHonor() != null && this.getDecImpRemHonor().longValue() == -999) {
            conditions += " AND DEC_IMP_REM_HONOR IS NULL";
        } else if (this.getDecImpRemHonor() != null) {
            conditions += " AND DEC_IMP_REM_HONOR = ?";
            values.add(this.getDecImpRemHonor());
        }

        if (this.getDecRemIvaHonor() != null && this.getDecRemIvaHonor().longValue() == -999) {
            conditions += " AND DEC_REM_IVA_HONOR IS NULL";
        } else if (this.getDecRemIvaHonor() != null) {
            conditions += " AND DEC_REM_IVA_HONOR = ?";
            values.add(this.getDecRemIvaHonor());
        }

        if (this.getDecRemExtemp() != null && this.getDecRemExtemp().longValue() == -999) {
            conditions += " AND DEC_REM_EXTEMP IS NULL";
        } else if (this.getDecRemExtemp() != null) {
            conditions += " AND DEC_REM_EXTEMP = ?";
            values.add(this.getDecRemExtemp());
        }

        if (this.getDecImpOrigHonor() != null && this.getDecImpOrigHonor().longValue() == -999) {
            conditions += " AND DEC_IMP_ORIG_HONOR IS NULL";
        } else if (this.getDecImpOrigHonor() != null) {
            conditions += " AND DEC_IMP_ORIG_HONOR = ?";
            values.add(this.getDecImpOrigHonor());
        }

        if (this.getDecOrigIvaHonor() != null && this.getDecOrigIvaHonor().longValue() == -999) {
            conditions += " AND DEC_ORIG_IVA_HONOR IS NULL";
        } else if (this.getDecOrigIvaHonor() != null) {
            conditions += " AND DEC_ORIG_IVA_HONOR = ?";
            values.add(this.getDecOrigIvaHonor());
        }

        if (this.getDecOrigExtemp() != null && this.getDecOrigExtemp().longValue() == -999) {
            conditions += " AND DEC_ORIG_EXTEMP IS NULL";
        } else if (this.getDecOrigExtemp() != null) {
            conditions += " AND DEC_ORIG_EXTEMP = ?";
            values.add(this.getDecOrigExtemp());
        }

        if (this.getDecImpPagosEfe() != null && this.getDecImpPagosEfe().longValue() == -999) {
            conditions += " AND DEC_IMP_PAGOS_EFE IS NULL";
        } else if (this.getDecImpPagosEfe() != null) {
            conditions += " AND DEC_IMP_PAGOS_EFE = ?";
            values.add(this.getDecImpPagosEfe());
        }

        if (this.getDecNumPagosEfe() != null && this.getDecNumPagosEfe().longValue() == -999) {
            conditions += " AND DEC_NUM_PAGOS_EFE IS NULL";
        } else if (this.getDecNumPagosEfe() != null) {
            conditions += " AND DEC_NUM_PAGOS_EFE = ?";
            values.add(this.getDecNumPagosEfe());
        }

        if (this.getDecNumRecordat() != null && this.getDecNumRecordat().longValue() == -999) {
            conditions += " AND DEC_NUM_RECORDAT IS NULL";
        } else if (this.getDecNumRecordat() != null) {
            conditions += " AND DEC_NUM_RECORDAT = ?";
            values.add(this.getDecNumRecordat());
        }

        if (this.getDecNumMoneda() != null && this.getDecNumMoneda().longValue() == -999) {
            conditions += " AND DEC_NUM_MONEDA IS NULL";
        } else if (this.getDecNumMoneda() != null) {
            conditions += " AND DEC_NUM_MONEDA = ?";
            values.add(this.getDecNumMoneda());
        }

        if (this.getDecCveCalifHono() != null && "null".equals(this.getDecCveCalifHono())) {
            conditions += " AND DEC_CVE_CALIF_HONO IS NULL";
        } else if (this.getDecCveCalifHono() != null) {
            conditions += " AND DEC_CVE_CALIF_HONO = ?";
            values.add(this.getDecCveCalifHono());
        }

        if (this.getDecFolioOpera() != null && this.getDecFolioOpera().longValue() == -999) {
            conditions += " AND DEC_FOLIO_OPERA IS NULL";
        } else if (this.getDecFolioOpera() != null) {
            conditions += " AND DEC_FOLIO_OPERA = ?";
            values.add(this.getDecFolioOpera());
        }

        if (this.getDecAnoAltaReg() != null && this.getDecAnoAltaReg().longValue() == -999) {
            conditions += " AND DEC_ANO_ALTA_REG IS NULL";
        } else if (this.getDecAnoAltaReg() != null) {
            conditions += " AND DEC_ANO_ALTA_REG = ?";
            values.add(this.getDecAnoAltaReg());
        }

        if (this.getDecMesAltaReg() != null && this.getDecMesAltaReg().longValue() == -999) {
            conditions += " AND DEC_MES_ALTA_REG IS NULL";
        } else if (this.getDecMesAltaReg() != null) {
            conditions += " AND DEC_MES_ALTA_REG = ?";
            values.add(this.getDecMesAltaReg());
        }

        if (this.getDecDiaAltaReg() != null && this.getDecDiaAltaReg().longValue() == -999) {
            conditions += " AND DEC_DIA_ALTA_REG IS NULL";
        } else if (this.getDecDiaAltaReg() != null) {
            conditions += " AND DEC_DIA_ALTA_REG = ?";
            values.add(this.getDecDiaAltaReg());
        }

        if (this.getDecAnoUltMod() != null && this.getDecAnoUltMod().longValue() == -999) {
            conditions += " AND DEC_ANO_ULT_MOD IS NULL";
        } else if (this.getDecAnoUltMod() != null) {
            conditions += " AND DEC_ANO_ULT_MOD = ?";
            values.add(this.getDecAnoUltMod());
        }

        if (this.getDecMesUltMod() != null && this.getDecMesUltMod().longValue() == -999) {
            conditions += " AND DEC_MES_ULT_MOD IS NULL";
        } else if (this.getDecMesUltMod() != null) {
            conditions += " AND DEC_MES_ULT_MOD = ?";
            values.add(this.getDecMesUltMod());
        }

        if (this.getDecDiaUltMod() != null && this.getDecDiaUltMod().longValue() == -999) {
            conditions += " AND DEC_DIA_ULT_MOD IS NULL";
        } else if (this.getDecDiaUltMod() != null) {
            conditions += " AND DEC_DIA_ULT_MOD = ?";
            values.add(this.getDecDiaUltMod());
        }

        if (this.getDecCveStDetcart() != null && "null".equals(this.getDecCveStDetcart())) {
            conditions += " AND DEC_CVE_ST_DETCART IS NULL";
        } else if (this.getDecCveStDetcart() != null) {
            conditions += " AND DEC_CVE_ST_DETCART = ?";
            values.add(this.getDecCveStDetcart());
        }

        if (this.getDecNumReferencia() != null && "null".equals(this.getDecNumReferencia())) {
            conditions += " AND DEC_NUM_REFERENCIA IS NULL";
        } else if (this.getDecNumReferencia() != null) {
            conditions += " AND DEC_NUM_REFERENCIA = ?";
            values.add(this.getDecNumReferencia());
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
        String sql = "UPDATE DETCART SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DEC_NUM_CONTRATO = ?";
        pkValues.add(this.getDecNumContrato());
        conditions += " AND DEC_CVE_PERS_FID = ?";
        pkValues.add(this.getDecCvePersFid());
        conditions += " AND DEC_NUM_PERS_FID = ?";
        pkValues.add(this.getDecNumPersFid());
        conditions += " AND DEC_CVE_TIPO_HONO = ?";
        pkValues.add(this.getDecCveTipoHono());
        conditions += " AND DEC_FEC_CALC_HONO = ?";
        pkValues.add(this.getDecFecCalcHono());
        conditions += " AND DEC_NUM_SECUENCIAL = ?";
        pkValues.add(this.getDecNumSecuencial());
        fields += " DEC_NUM_SERVICIO = ?, ";
        values.add(this.getDecNumServicio());
        fields += " DEC_NUM_TRAMITE = ?, ";
        values.add(this.getDecNumTramite());
        fields += " DEC_CONCEPTO_HONO = ?, ";
        values.add(this.getDecConceptoHono());
        fields += " DEC_CVE_PER_PAGADO = ?, ";
        values.add(this.getDecCvePerPagado());
        fields += " DEC_ANO_PER_DEL = ?, ";
        values.add(this.getDecAnoPerDel());
        fields += " DEC_MES_PER_DEL = ?, ";
        values.add(this.getDecMesPerDel());
        fields += " DEC_DIA_PER_DEL = ?, ";
        values.add(this.getDecDiaPerDel());
        fields += " DEC_ANO_PER_AL = ?, ";
        values.add(this.getDecAnoPerAl());
        fields += " DEC_MES_PER_AL = ?, ";
        values.add(this.getDecMesPerAl());
        fields += " DEC_DIA_PER_AL = ?, ";
        values.add(this.getDecDiaPerAl());
        fields += " DEC_IMP_REM_HONOR = ?, ";
        values.add(this.getDecImpRemHonor());
        fields += " DEC_REM_IVA_HONOR = ?, ";
        values.add(this.getDecRemIvaHonor());
        fields += " DEC_REM_EXTEMP = ?, ";
        values.add(this.getDecRemExtemp());
        fields += " DEC_IMP_ORIG_HONOR = ?, ";
        values.add(this.getDecImpOrigHonor());
        fields += " DEC_ORIG_IVA_HONOR = ?, ";
        values.add(this.getDecOrigIvaHonor());
        fields += " DEC_ORIG_EXTEMP = ?, ";
        values.add(this.getDecOrigExtemp());
        fields += " DEC_IMP_PAGOS_EFE = ?, ";
        values.add(this.getDecImpPagosEfe());
        fields += " DEC_NUM_PAGOS_EFE = ?, ";
        values.add(this.getDecNumPagosEfe());
        fields += " DEC_NUM_RECORDAT = ?, ";
        values.add(this.getDecNumRecordat());
        fields += " DEC_NUM_MONEDA = ?, ";
        values.add(this.getDecNumMoneda());
        fields += " DEC_CVE_CALIF_HONO = ?, ";
        values.add(this.getDecCveCalifHono());
        fields += " DEC_FOLIO_OPERA = ?, ";
        values.add(this.getDecFolioOpera());
        fields += " DEC_ANO_ALTA_REG = ?, ";
        values.add(this.getDecAnoAltaReg());
        fields += " DEC_MES_ALTA_REG = ?, ";
        values.add(this.getDecMesAltaReg());
        fields += " DEC_DIA_ALTA_REG = ?, ";
        values.add(this.getDecDiaAltaReg());
        fields += " DEC_ANO_ULT_MOD = ?, ";
        values.add(this.getDecAnoUltMod());
        fields += " DEC_MES_ULT_MOD = ?, ";
        values.add(this.getDecMesUltMod());
        fields += " DEC_DIA_ULT_MOD = ?, ";
        values.add(this.getDecDiaUltMod());
        fields += " DEC_CVE_ST_DETCART = ?, ";
        values.add(this.getDecCveStDetcart());
        fields += " DEC_NUM_REFERENCIA = ?, ";
        values.add(this.getDecNumReferencia());
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
        String sql = "INSERT INTO DETCART ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DEC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDecNumContrato());

        fields += ", DEC_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getDecCvePersFid());

        fields += ", DEC_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getDecNumPersFid());

        fields += ", DEC_CVE_TIPO_HONO";
        fieldValues += ", ?";
        values.add(this.getDecCveTipoHono());

        fields += ", DEC_FEC_CALC_HONO";
        fieldValues += ", ?";
        values.add(this.getDecFecCalcHono());

        fields += ", DEC_NUM_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getDecNumSecuencial());

        fields += ", DEC_NUM_SERVICIO";
        fieldValues += ", ?";
        values.add(this.getDecNumServicio());

        fields += ", DEC_NUM_TRAMITE";
        fieldValues += ", ?";
        values.add(this.getDecNumTramite());

        fields += ", DEC_CONCEPTO_HONO";
        fieldValues += ", ?";
        values.add(this.getDecConceptoHono());

        fields += ", DEC_CVE_PER_PAGADO";
        fieldValues += ", ?";
        values.add(this.getDecCvePerPagado());

        fields += ", DEC_ANO_PER_DEL";
        fieldValues += ", ?";
        values.add(this.getDecAnoPerDel());

        fields += ", DEC_MES_PER_DEL";
        fieldValues += ", ?";
        values.add(this.getDecMesPerDel());

        fields += ", DEC_DIA_PER_DEL";
        fieldValues += ", ?";
        values.add(this.getDecDiaPerDel());

        fields += ", DEC_ANO_PER_AL";
        fieldValues += ", ?";
        values.add(this.getDecAnoPerAl());

        fields += ", DEC_MES_PER_AL";
        fieldValues += ", ?";
        values.add(this.getDecMesPerAl());

        fields += ", DEC_DIA_PER_AL";
        fieldValues += ", ?";
        values.add(this.getDecDiaPerAl());

        fields += ", DEC_IMP_REM_HONOR";
        fieldValues += ", ?";
        values.add(this.getDecImpRemHonor());

        fields += ", DEC_REM_IVA_HONOR";
        fieldValues += ", ?";
        values.add(this.getDecRemIvaHonor());

        fields += ", DEC_REM_EXTEMP";
        fieldValues += ", ?";
        values.add(this.getDecRemExtemp());

        fields += ", DEC_IMP_ORIG_HONOR";
        fieldValues += ", ?";
        values.add(this.getDecImpOrigHonor());

        fields += ", DEC_ORIG_IVA_HONOR";
        fieldValues += ", ?";
        values.add(this.getDecOrigIvaHonor());

        fields += ", DEC_ORIG_EXTEMP";
        fieldValues += ", ?";
        values.add(this.getDecOrigExtemp());

        fields += ", DEC_IMP_PAGOS_EFE";
        fieldValues += ", ?";
        values.add(this.getDecImpPagosEfe());

        fields += ", DEC_NUM_PAGOS_EFE";
        fieldValues += ", ?";
        values.add(this.getDecNumPagosEfe());

        fields += ", DEC_NUM_RECORDAT";
        fieldValues += ", ?";
        values.add(this.getDecNumRecordat());

        fields += ", DEC_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getDecNumMoneda());

        fields += ", DEC_CVE_CALIF_HONO";
        fieldValues += ", ?";
        values.add(this.getDecCveCalifHono());

        fields += ", DEC_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getDecFolioOpera());

        fields += ", DEC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDecAnoAltaReg());

        fields += ", DEC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDecMesAltaReg());

        fields += ", DEC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDecDiaAltaReg());

        fields += ", DEC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDecAnoUltMod());

        fields += ", DEC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDecMesUltMod());

        fields += ", DEC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDecDiaUltMod());

        fields += ", DEC_CVE_ST_DETCART";
        fieldValues += ", ?";
        values.add(this.getDecCveStDetcart());

        fields += ", DEC_NUM_REFERENCIA";
        fieldValues += ", ?";
        values.add(this.getDecNumReferencia());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DETCART WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DEC_NUM_CONTRATO = ?";
        values.add(this.getDecNumContrato());
        conditions += " AND DEC_CVE_PERS_FID = ?";
        values.add(this.getDecCvePersFid());
        conditions += " AND DEC_NUM_PERS_FID = ?";
        values.add(this.getDecNumPersFid());
        conditions += " AND DEC_CVE_TIPO_HONO = ?";
        values.add(this.getDecCveTipoHono());
        conditions += " AND DEC_FEC_CALC_HONO = ?";
        values.add(this.getDecFecCalcHono());
        conditions += " AND DEC_NUM_SECUENCIAL = ?";
        values.add(this.getDecNumSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Detcart instance = (Detcart) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDecNumContrato().equals(instance.getDecNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDecCvePersFid().equals(instance.getDecCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getDecNumPersFid().equals(instance.getDecNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getDecCveTipoHono().equals(instance.getDecCveTipoHono()))
            equalObjects = false;
        if (equalObjects && !this.getDecFecCalcHono().equals(instance.getDecFecCalcHono()))
            equalObjects = false;
        if (equalObjects && !this.getDecNumSecuencial().equals(instance.getDecNumSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getDecNumServicio().equals(instance.getDecNumServicio()))
            equalObjects = false;
        if (equalObjects && !this.getDecNumTramite().equals(instance.getDecNumTramite()))
            equalObjects = false;
        if (equalObjects && !this.getDecConceptoHono().equals(instance.getDecConceptoHono()))
            equalObjects = false;
        if (equalObjects && !this.getDecCvePerPagado().equals(instance.getDecCvePerPagado()))
            equalObjects = false;
        if (equalObjects && !this.getDecAnoPerDel().equals(instance.getDecAnoPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getDecMesPerDel().equals(instance.getDecMesPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getDecDiaPerDel().equals(instance.getDecDiaPerDel()))
            equalObjects = false;
        if (equalObjects && !this.getDecAnoPerAl().equals(instance.getDecAnoPerAl()))
            equalObjects = false;
        if (equalObjects && !this.getDecMesPerAl().equals(instance.getDecMesPerAl()))
            equalObjects = false;
        if (equalObjects && !this.getDecDiaPerAl().equals(instance.getDecDiaPerAl()))
            equalObjects = false;
        if (equalObjects && !this.getDecImpRemHonor().equals(instance.getDecImpRemHonor()))
            equalObjects = false;
        if (equalObjects && !this.getDecRemIvaHonor().equals(instance.getDecRemIvaHonor()))
            equalObjects = false;
        if (equalObjects && !this.getDecRemExtemp().equals(instance.getDecRemExtemp()))
            equalObjects = false;
        if (equalObjects && !this.getDecImpOrigHonor().equals(instance.getDecImpOrigHonor()))
            equalObjects = false;
        if (equalObjects && !this.getDecOrigIvaHonor().equals(instance.getDecOrigIvaHonor()))
            equalObjects = false;
        if (equalObjects && !this.getDecOrigExtemp().equals(instance.getDecOrigExtemp()))
            equalObjects = false;
        if (equalObjects && !this.getDecImpPagosEfe().equals(instance.getDecImpPagosEfe()))
            equalObjects = false;
        if (equalObjects && !this.getDecNumPagosEfe().equals(instance.getDecNumPagosEfe()))
            equalObjects = false;
        if (equalObjects && !this.getDecNumRecordat().equals(instance.getDecNumRecordat()))
            equalObjects = false;
        if (equalObjects && !this.getDecNumMoneda().equals(instance.getDecNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getDecCveCalifHono().equals(instance.getDecCveCalifHono()))
            equalObjects = false;
        if (equalObjects && !this.getDecFolioOpera().equals(instance.getDecFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getDecAnoAltaReg().equals(instance.getDecAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDecMesAltaReg().equals(instance.getDecMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDecDiaAltaReg().equals(instance.getDecDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDecAnoUltMod().equals(instance.getDecAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDecMesUltMod().equals(instance.getDecMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDecDiaUltMod().equals(instance.getDecDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDecCveStDetcart().equals(instance.getDecCveStDetcart()))
            equalObjects = false;
        if (equalObjects && !this.getDecNumReferencia().equals(instance.getDecNumReferencia()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Detcart result = new Detcart();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDecNumContrato((BigDecimal) objectData.getData("DEC_NUM_CONTRATO"));
        result.setDecCvePersFid((String) objectData.getData("DEC_CVE_PERS_FID"));
        result.setDecNumPersFid((BigDecimal) objectData.getData("DEC_NUM_PERS_FID"));
        result.setDecCveTipoHono((String) objectData.getData("DEC_CVE_TIPO_HONO"));
        result.setDecFecCalcHono((String) objectData.getData("DEC_FEC_CALC_HONO"));
        result.setDecNumSecuencial((BigDecimal) objectData.getData("DEC_NUM_SECUENCIAL"));
        result.setDecNumServicio((BigDecimal) objectData.getData("DEC_NUM_SERVICIO"));
        result.setDecNumTramite((BigDecimal) objectData.getData("DEC_NUM_TRAMITE"));
        result.setDecConceptoHono((String) objectData.getData("DEC_CONCEPTO_HONO"));
        result.setDecCvePerPagado((BigDecimal) objectData.getData("DEC_CVE_PER_PAGADO"));
        result.setDecAnoPerDel((BigDecimal) objectData.getData("DEC_ANO_PER_DEL"));
        result.setDecMesPerDel((BigDecimal) objectData.getData("DEC_MES_PER_DEL"));
        result.setDecDiaPerDel((BigDecimal) objectData.getData("DEC_DIA_PER_DEL"));
        result.setDecAnoPerAl((BigDecimal) objectData.getData("DEC_ANO_PER_AL"));
        result.setDecMesPerAl((BigDecimal) objectData.getData("DEC_MES_PER_AL"));
        result.setDecDiaPerAl((BigDecimal) objectData.getData("DEC_DIA_PER_AL"));
        result.setDecImpRemHonor((BigDecimal) objectData.getData("DEC_IMP_REM_HONOR"));
        result.setDecRemIvaHonor((BigDecimal) objectData.getData("DEC_REM_IVA_HONOR"));
        result.setDecRemExtemp((BigDecimal) objectData.getData("DEC_REM_EXTEMP"));
        result.setDecImpOrigHonor((BigDecimal) objectData.getData("DEC_IMP_ORIG_HONOR"));
        result.setDecOrigIvaHonor((BigDecimal) objectData.getData("DEC_ORIG_IVA_HONOR"));
        result.setDecOrigExtemp((BigDecimal) objectData.getData("DEC_ORIG_EXTEMP"));
        result.setDecImpPagosEfe((BigDecimal) objectData.getData("DEC_IMP_PAGOS_EFE"));
        result.setDecNumPagosEfe((BigDecimal) objectData.getData("DEC_NUM_PAGOS_EFE"));
        result.setDecNumRecordat((BigDecimal) objectData.getData("DEC_NUM_RECORDAT"));
        result.setDecNumMoneda((BigDecimal) objectData.getData("DEC_NUM_MONEDA"));
        result.setDecCveCalifHono((String) objectData.getData("DEC_CVE_CALIF_HONO"));
        result.setDecFolioOpera((BigDecimal) objectData.getData("DEC_FOLIO_OPERA"));
        result.setDecAnoAltaReg((BigDecimal) objectData.getData("DEC_ANO_ALTA_REG"));
        result.setDecMesAltaReg((BigDecimal) objectData.getData("DEC_MES_ALTA_REG"));
        result.setDecDiaAltaReg((BigDecimal) objectData.getData("DEC_DIA_ALTA_REG"));
        result.setDecAnoUltMod((BigDecimal) objectData.getData("DEC_ANO_ULT_MOD"));
        result.setDecMesUltMod((BigDecimal) objectData.getData("DEC_MES_ULT_MOD"));
        result.setDecDiaUltMod((BigDecimal) objectData.getData("DEC_DIA_ULT_MOD"));
        result.setDecCveStDetcart((String) objectData.getData("DEC_CVE_ST_DETCART"));
        result.setDecNumReferencia((String) objectData.getData("DEC_NUM_REFERENCIA"));

        return result;

    }

}
