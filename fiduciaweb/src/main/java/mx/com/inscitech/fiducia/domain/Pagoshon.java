package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PAGOSHON_PK",
            columns = { "PAG_CVE_TIPO_HONO", "PAG_NUM_PERS_FID", "PAG_CVE_PERS_FID", "PAG_NUM_CONTRATO", "PAG_FEC_CALC_HONO", "PAG_NUM_SECUENCIAL", "PAG_FEC_PAGO", "PAG_NUM_PAGO"
    }, sequences = { "MANUAL" })
public class Pagoshon extends DomainObject {

    BigDecimal pagNumContrato = null;
    String pagCvePersFid = null;
    BigDecimal pagNumPersFid = null;
    String pagCveTipoHono = null;
    String pagFecCalcHono = null;
    BigDecimal pagNumSecuencial = null;
    String pagFecPago = null;
    BigDecimal pagNumPago = null;
    BigDecimal pagNumServicio = null;
    BigDecimal pagNumTramite = null;
    BigDecimal pagImpPago = null;
    BigDecimal pagImpIvaHonor = null;
    BigDecimal pagImpExtemp = null;
    BigDecimal pagNumMoneda = null;
    String pagDoctoRef = null;
    String pagFecDoctoRef = null;
    BigDecimal pagAnoAltaReg = null;
    BigDecimal pagMesAltaReg = null;
    BigDecimal pagDiaAltaReg = null;
    BigDecimal pagAnoUltMod = null;
    BigDecimal pagMesUltMod = null;
    BigDecimal pagDiaUltMod = null;
    String pagCveStPagosho = null;
    BigDecimal pagFolioOpera = null;
    BigDecimal pagImpTotal = null;

    public Pagoshon() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPagNumContrato(BigDecimal pagNumContrato) {
        this.pagNumContrato = pagNumContrato;
    }

    public BigDecimal getPagNumContrato() {
        return this.pagNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPagCvePersFid(String pagCvePersFid) {
        this.pagCvePersFid = pagCvePersFid;
    }

    public String getPagCvePersFid() {
        return this.pagCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPagNumPersFid(BigDecimal pagNumPersFid) {
        this.pagNumPersFid = pagNumPersFid;
    }

    public BigDecimal getPagNumPersFid() {
        return this.pagNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPagCveTipoHono(String pagCveTipoHono) {
        this.pagCveTipoHono = pagCveTipoHono;
    }

    public String getPagCveTipoHono() {
        return this.pagCveTipoHono;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPagFecCalcHono(String pagFecCalcHono) {
        this.pagFecCalcHono = pagFecCalcHono;
    }

    public String getPagFecCalcHono() {
        return this.pagFecCalcHono;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPagNumSecuencial(BigDecimal pagNumSecuencial) {
        this.pagNumSecuencial = pagNumSecuencial;
    }

    public BigDecimal getPagNumSecuencial() {
        return this.pagNumSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPagFecPago(String pagFecPago) {
        this.pagFecPago = pagFecPago;
    }

    public String getPagFecPago() {
        return this.pagFecPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPagNumPago(BigDecimal pagNumPago) {
        this.pagNumPago = pagNumPago;
    }

    public BigDecimal getPagNumPago() {
        return this.pagNumPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPagNumServicio(BigDecimal pagNumServicio) {
        this.pagNumServicio = pagNumServicio;
    }

    public BigDecimal getPagNumServicio() {
        return this.pagNumServicio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPagNumTramite(BigDecimal pagNumTramite) {
        this.pagNumTramite = pagNumTramite;
    }

    public BigDecimal getPagNumTramite() {
        return this.pagNumTramite;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPagImpPago(BigDecimal pagImpPago) {
        this.pagImpPago = pagImpPago;
    }

    public BigDecimal getPagImpPago() {
        return this.pagImpPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPagImpIvaHonor(BigDecimal pagImpIvaHonor) {
        this.pagImpIvaHonor = pagImpIvaHonor;
    }

    public BigDecimal getPagImpIvaHonor() {
        return this.pagImpIvaHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPagImpExtemp(BigDecimal pagImpExtemp) {
        this.pagImpExtemp = pagImpExtemp;
    }

    public BigDecimal getPagImpExtemp() {
        return this.pagImpExtemp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPagNumMoneda(BigDecimal pagNumMoneda) {
        this.pagNumMoneda = pagNumMoneda;
    }

    public BigDecimal getPagNumMoneda() {
        return this.pagNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPagDoctoRef(String pagDoctoRef) {
        this.pagDoctoRef = pagDoctoRef;
    }

    public String getPagDoctoRef() {
        return this.pagDoctoRef;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPagFecDoctoRef(String pagFecDoctoRef) {
        this.pagFecDoctoRef = pagFecDoctoRef;
    }

    public String getPagFecDoctoRef() {
        return this.pagFecDoctoRef;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPagAnoAltaReg(BigDecimal pagAnoAltaReg) {
        this.pagAnoAltaReg = pagAnoAltaReg;
    }

    public BigDecimal getPagAnoAltaReg() {
        return this.pagAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPagMesAltaReg(BigDecimal pagMesAltaReg) {
        this.pagMesAltaReg = pagMesAltaReg;
    }

    public BigDecimal getPagMesAltaReg() {
        return this.pagMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPagDiaAltaReg(BigDecimal pagDiaAltaReg) {
        this.pagDiaAltaReg = pagDiaAltaReg;
    }

    public BigDecimal getPagDiaAltaReg() {
        return this.pagDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPagAnoUltMod(BigDecimal pagAnoUltMod) {
        this.pagAnoUltMod = pagAnoUltMod;
    }

    public BigDecimal getPagAnoUltMod() {
        return this.pagAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPagMesUltMod(BigDecimal pagMesUltMod) {
        this.pagMesUltMod = pagMesUltMod;
    }

    public BigDecimal getPagMesUltMod() {
        return this.pagMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPagDiaUltMod(BigDecimal pagDiaUltMod) {
        this.pagDiaUltMod = pagDiaUltMod;
    }

    public BigDecimal getPagDiaUltMod() {
        return this.pagDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPagCveStPagosho(String pagCveStPagosho) {
        this.pagCveStPagosho = pagCveStPagosho;
    }

    public String getPagCveStPagosho() {
        return this.pagCveStPagosho;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPagFolioOpera(BigDecimal pagFolioOpera) {
        this.pagFolioOpera = pagFolioOpera;
    }

    public BigDecimal getPagFolioOpera() {
        return this.pagFolioOpera;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPagImpTotal(BigDecimal pagImpTotal) {
        this.pagImpTotal = pagImpTotal;
    }

    public BigDecimal getPagImpTotal() {
        return this.pagImpTotal;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PAGOSHON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPagNumContrato() != null && this.getPagNumContrato().longValue() == -999) {
            conditions += " AND PAG_NUM_CONTRATO IS NULL";
        } else if (this.getPagNumContrato() != null) {
            conditions += " AND PAG_NUM_CONTRATO = ?";
            values.add(this.getPagNumContrato());
        }

        if (this.getPagCvePersFid() != null && "null".equals(this.getPagCvePersFid())) {
            conditions += " AND PAG_CVE_PERS_FID IS NULL";
        } else if (this.getPagCvePersFid() != null) {
            conditions += " AND PAG_CVE_PERS_FID = ?";
            values.add(this.getPagCvePersFid());
        }

        if (this.getPagNumPersFid() != null && this.getPagNumPersFid().longValue() == -999) {
            conditions += " AND PAG_NUM_PERS_FID IS NULL";
        } else if (this.getPagNumPersFid() != null) {
            conditions += " AND PAG_NUM_PERS_FID = ?";
            values.add(this.getPagNumPersFid());
        }

        if (this.getPagCveTipoHono() != null && "null".equals(this.getPagCveTipoHono())) {
            conditions += " AND PAG_CVE_TIPO_HONO IS NULL";
        } else if (this.getPagCveTipoHono() != null) {
            conditions += " AND PAG_CVE_TIPO_HONO = ?";
            values.add(this.getPagCveTipoHono());
        }

        if (this.getPagFecCalcHono() != null && "null".equals(this.getPagFecCalcHono())) {
            conditions += " AND PAG_FEC_CALC_HONO IS NULL";
        } else if (this.getPagFecCalcHono() != null) {
            conditions += " AND PAG_FEC_CALC_HONO = ?";
            values.add(this.getPagFecCalcHono());
        }

        if (this.getPagNumSecuencial() != null && this.getPagNumSecuencial().longValue() == -999) {
            conditions += " AND PAG_NUM_SECUENCIAL IS NULL";
        } else if (this.getPagNumSecuencial() != null) {
            conditions += " AND PAG_NUM_SECUENCIAL = ?";
            values.add(this.getPagNumSecuencial());
        }

        if (this.getPagFecPago() != null && "null".equals(this.getPagFecPago())) {
            conditions += " AND PAG_FEC_PAGO IS NULL";
        } else if (this.getPagFecPago() != null) {
            conditions += " AND PAG_FEC_PAGO = ?";
            values.add(this.getPagFecPago());
        }

        if (this.getPagNumPago() != null && this.getPagNumPago().longValue() == -999) {
            conditions += " AND PAG_NUM_PAGO IS NULL";
        } else if (this.getPagNumPago() != null) {
            conditions += " AND PAG_NUM_PAGO = ?";
            values.add(this.getPagNumPago());
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
        String sql = "SELECT * FROM PAGOSHON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPagNumContrato() != null && this.getPagNumContrato().longValue() == -999) {
            conditions += " AND PAG_NUM_CONTRATO IS NULL";
        } else if (this.getPagNumContrato() != null) {
            conditions += " AND PAG_NUM_CONTRATO = ?";
            values.add(this.getPagNumContrato());
        }

        if (this.getPagCvePersFid() != null && "null".equals(this.getPagCvePersFid())) {
            conditions += " AND PAG_CVE_PERS_FID IS NULL";
        } else if (this.getPagCvePersFid() != null) {
            conditions += " AND PAG_CVE_PERS_FID = ?";
            values.add(this.getPagCvePersFid());
        }

        if (this.getPagNumPersFid() != null && this.getPagNumPersFid().longValue() == -999) {
            conditions += " AND PAG_NUM_PERS_FID IS NULL";
        } else if (this.getPagNumPersFid() != null) {
            conditions += " AND PAG_NUM_PERS_FID = ?";
            values.add(this.getPagNumPersFid());
        }

        if (this.getPagCveTipoHono() != null && "null".equals(this.getPagCveTipoHono())) {
            conditions += " AND PAG_CVE_TIPO_HONO IS NULL";
        } else if (this.getPagCveTipoHono() != null) {
            conditions += " AND PAG_CVE_TIPO_HONO = ?";
            values.add(this.getPagCveTipoHono());
        }

        if (this.getPagFecCalcHono() != null && "null".equals(this.getPagFecCalcHono())) {
            conditions += " AND PAG_FEC_CALC_HONO IS NULL";
        } else if (this.getPagFecCalcHono() != null) {
            conditions += " AND PAG_FEC_CALC_HONO = ?";
            values.add(this.getPagFecCalcHono());
        }

        if (this.getPagNumSecuencial() != null && this.getPagNumSecuencial().longValue() == -999) {
            conditions += " AND PAG_NUM_SECUENCIAL IS NULL";
        } else if (this.getPagNumSecuencial() != null) {
            conditions += " AND PAG_NUM_SECUENCIAL = ?";
            values.add(this.getPagNumSecuencial());
        }

        if (this.getPagFecPago() != null && "null".equals(this.getPagFecPago())) {
            conditions += " AND PAG_FEC_PAGO IS NULL";
        } else if (this.getPagFecPago() != null) {
            conditions += " AND PAG_FEC_PAGO = ?";
            values.add(this.getPagFecPago());
        }

        if (this.getPagNumPago() != null && this.getPagNumPago().longValue() == -999) {
            conditions += " AND PAG_NUM_PAGO IS NULL";
        } else if (this.getPagNumPago() != null) {
            conditions += " AND PAG_NUM_PAGO = ?";
            values.add(this.getPagNumPago());
        }

        if (this.getPagNumServicio() != null && this.getPagNumServicio().longValue() == -999) {
            conditions += " AND PAG_NUM_SERVICIO IS NULL";
        } else if (this.getPagNumServicio() != null) {
            conditions += " AND PAG_NUM_SERVICIO = ?";
            values.add(this.getPagNumServicio());
        }

        if (this.getPagNumTramite() != null && this.getPagNumTramite().longValue() == -999) {
            conditions += " AND PAG_NUM_TRAMITE IS NULL";
        } else if (this.getPagNumTramite() != null) {
            conditions += " AND PAG_NUM_TRAMITE = ?";
            values.add(this.getPagNumTramite());
        }

        if (this.getPagImpPago() != null && this.getPagImpPago().longValue() == -999) {
            conditions += " AND PAG_IMP_PAGO IS NULL";
        } else if (this.getPagImpPago() != null) {
            conditions += " AND PAG_IMP_PAGO = ?";
            values.add(this.getPagImpPago());
        }

        if (this.getPagImpIvaHonor() != null && this.getPagImpIvaHonor().longValue() == -999) {
            conditions += " AND PAG_IMP_IVA_HONOR IS NULL";
        } else if (this.getPagImpIvaHonor() != null) {
            conditions += " AND PAG_IMP_IVA_HONOR = ?";
            values.add(this.getPagImpIvaHonor());
        }

        if (this.getPagImpExtemp() != null && this.getPagImpExtemp().longValue() == -999) {
            conditions += " AND PAG_IMP_EXTEMP IS NULL";
        } else if (this.getPagImpExtemp() != null) {
            conditions += " AND PAG_IMP_EXTEMP = ?";
            values.add(this.getPagImpExtemp());
        }

        if (this.getPagNumMoneda() != null && this.getPagNumMoneda().longValue() == -999) {
            conditions += " AND PAG_NUM_MONEDA IS NULL";
        } else if (this.getPagNumMoneda() != null) {
            conditions += " AND PAG_NUM_MONEDA = ?";
            values.add(this.getPagNumMoneda());
        }

        if (this.getPagDoctoRef() != null && "null".equals(this.getPagDoctoRef())) {
            conditions += " AND PAG_DOCTO_REF IS NULL";
        } else if (this.getPagDoctoRef() != null) {
            conditions += " AND PAG_DOCTO_REF = ?";
            values.add(this.getPagDoctoRef());
        }

        if (this.getPagFecDoctoRef() != null && "null".equals(this.getPagFecDoctoRef())) {
            conditions += " AND PAG_FEC_DOCTO_REF IS NULL";
        } else if (this.getPagFecDoctoRef() != null) {
            conditions += " AND PAG_FEC_DOCTO_REF = ?";
            values.add(this.getPagFecDoctoRef());
        }

        if (this.getPagAnoAltaReg() != null && this.getPagAnoAltaReg().longValue() == -999) {
            conditions += " AND PAG_ANO_ALTA_REG IS NULL";
        } else if (this.getPagAnoAltaReg() != null) {
            conditions += " AND PAG_ANO_ALTA_REG = ?";
            values.add(this.getPagAnoAltaReg());
        }

        if (this.getPagMesAltaReg() != null && this.getPagMesAltaReg().longValue() == -999) {
            conditions += " AND PAG_MES_ALTA_REG IS NULL";
        } else if (this.getPagMesAltaReg() != null) {
            conditions += " AND PAG_MES_ALTA_REG = ?";
            values.add(this.getPagMesAltaReg());
        }

        if (this.getPagDiaAltaReg() != null && this.getPagDiaAltaReg().longValue() == -999) {
            conditions += " AND PAG_DIA_ALTA_REG IS NULL";
        } else if (this.getPagDiaAltaReg() != null) {
            conditions += " AND PAG_DIA_ALTA_REG = ?";
            values.add(this.getPagDiaAltaReg());
        }

        if (this.getPagAnoUltMod() != null && this.getPagAnoUltMod().longValue() == -999) {
            conditions += " AND PAG_ANO_ULT_MOD IS NULL";
        } else if (this.getPagAnoUltMod() != null) {
            conditions += " AND PAG_ANO_ULT_MOD = ?";
            values.add(this.getPagAnoUltMod());
        }

        if (this.getPagMesUltMod() != null && this.getPagMesUltMod().longValue() == -999) {
            conditions += " AND PAG_MES_ULT_MOD IS NULL";
        } else if (this.getPagMesUltMod() != null) {
            conditions += " AND PAG_MES_ULT_MOD = ?";
            values.add(this.getPagMesUltMod());
        }

        if (this.getPagDiaUltMod() != null && this.getPagDiaUltMod().longValue() == -999) {
            conditions += " AND PAG_DIA_ULT_MOD IS NULL";
        } else if (this.getPagDiaUltMod() != null) {
            conditions += " AND PAG_DIA_ULT_MOD = ?";
            values.add(this.getPagDiaUltMod());
        }

        if (this.getPagCveStPagosho() != null && "null".equals(this.getPagCveStPagosho())) {
            conditions += " AND PAG_CVE_ST_PAGOSHO IS NULL";
        } else if (this.getPagCveStPagosho() != null) {
            conditions += " AND PAG_CVE_ST_PAGOSHO = ?";
            values.add(this.getPagCveStPagosho());
        }

        if (this.getPagFolioOpera() != null && this.getPagFolioOpera().longValue() == -999) {
            conditions += " AND PAG_FOLIO_OPERA IS NULL";
        } else if (this.getPagFolioOpera() != null) {
            conditions += " AND PAG_FOLIO_OPERA = ?";
            values.add(this.getPagFolioOpera());
        }

        if (this.getPagImpTotal() != null && this.getPagImpTotal().longValue() == -999) {
            conditions += " AND PAG_IMP_TOTAL IS NULL";
        } else if (this.getPagImpTotal() != null) {
            conditions += " AND PAG_IMP_TOTAL = ?";
            values.add(this.getPagImpTotal());
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
        String sql = "UPDATE PAGOSHON SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PAG_NUM_CONTRATO = ?";
        pkValues.add(this.getPagNumContrato());
        conditions += " AND PAG_CVE_PERS_FID = ?";
        pkValues.add(this.getPagCvePersFid());
        conditions += " AND PAG_NUM_PERS_FID = ?";
        pkValues.add(this.getPagNumPersFid());
        conditions += " AND PAG_CVE_TIPO_HONO = ?";
        pkValues.add(this.getPagCveTipoHono());
        conditions += " AND PAG_FEC_CALC_HONO = ?";
        pkValues.add(this.getPagFecCalcHono());
        conditions += " AND PAG_NUM_SECUENCIAL = ?";
        pkValues.add(this.getPagNumSecuencial());
        conditions += " AND PAG_FEC_PAGO = ?";
        pkValues.add(this.getPagFecPago());
        conditions += " AND PAG_NUM_PAGO = ?";
        pkValues.add(this.getPagNumPago());
        fields += " PAG_NUM_SERVICIO = ?, ";
        values.add(this.getPagNumServicio());
        fields += " PAG_NUM_TRAMITE = ?, ";
        values.add(this.getPagNumTramite());
        fields += " PAG_IMP_PAGO = ?, ";
        values.add(this.getPagImpPago());
        fields += " PAG_IMP_IVA_HONOR = ?, ";
        values.add(this.getPagImpIvaHonor());
        fields += " PAG_IMP_EXTEMP = ?, ";
        values.add(this.getPagImpExtemp());
        fields += " PAG_NUM_MONEDA = ?, ";
        values.add(this.getPagNumMoneda());
        fields += " PAG_DOCTO_REF = ?, ";
        values.add(this.getPagDoctoRef());
        fields += " PAG_FEC_DOCTO_REF = ?, ";
        values.add(this.getPagFecDoctoRef());
        fields += " PAG_ANO_ALTA_REG = ?, ";
        values.add(this.getPagAnoAltaReg());
        fields += " PAG_MES_ALTA_REG = ?, ";
        values.add(this.getPagMesAltaReg());
        fields += " PAG_DIA_ALTA_REG = ?, ";
        values.add(this.getPagDiaAltaReg());
        fields += " PAG_ANO_ULT_MOD = ?, ";
        values.add(this.getPagAnoUltMod());
        fields += " PAG_MES_ULT_MOD = ?, ";
        values.add(this.getPagMesUltMod());
        fields += " PAG_DIA_ULT_MOD = ?, ";
        values.add(this.getPagDiaUltMod());
        fields += " PAG_CVE_ST_PAGOSHO = ?, ";
        values.add(this.getPagCveStPagosho());
        fields += " PAG_FOLIO_OPERA = ?, ";
        values.add(this.getPagFolioOpera());
        fields += " PAG_IMP_TOTAL = ?, ";
        values.add(this.getPagImpTotal());
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
        String sql = "INSERT INTO PAGOSHON ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAG_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPagNumContrato());

        fields += ", PAG_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getPagCvePersFid());

        fields += ", PAG_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getPagNumPersFid());

        fields += ", PAG_CVE_TIPO_HONO";
        fieldValues += ", ?";
        values.add(this.getPagCveTipoHono());

        fields += ", PAG_FEC_CALC_HONO";
        fieldValues += ", ?";
        values.add(this.getPagFecCalcHono());

        fields += ", PAG_NUM_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getPagNumSecuencial());

        fields += ", PAG_FEC_PAGO";
        fieldValues += ", ?";
        values.add(this.getPagFecPago());

        fields += ", PAG_NUM_PAGO";
        fieldValues += ", ?";
        values.add(this.getPagNumPago());

        fields += ", PAG_NUM_SERVICIO";
        fieldValues += ", ?";
        values.add(this.getPagNumServicio());

        fields += ", PAG_NUM_TRAMITE";
        fieldValues += ", ?";
        values.add(this.getPagNumTramite());

        fields += ", PAG_IMP_PAGO";
        fieldValues += ", ?";
        values.add(this.getPagImpPago());

        fields += ", PAG_IMP_IVA_HONOR";
        fieldValues += ", ?";
        values.add(this.getPagImpIvaHonor());

        fields += ", PAG_IMP_EXTEMP";
        fieldValues += ", ?";
        values.add(this.getPagImpExtemp());

        fields += ", PAG_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getPagNumMoneda());

        fields += ", PAG_DOCTO_REF";
        fieldValues += ", ?";
        values.add(this.getPagDoctoRef());

        fields += ", PAG_FEC_DOCTO_REF";
        fieldValues += ", ?";
        values.add(this.getPagFecDoctoRef());

        fields += ", PAG_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPagAnoAltaReg());

        fields += ", PAG_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPagMesAltaReg());

        fields += ", PAG_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPagDiaAltaReg());

        fields += ", PAG_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPagAnoUltMod());

        fields += ", PAG_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPagMesUltMod());

        fields += ", PAG_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPagDiaUltMod());

        fields += ", PAG_CVE_ST_PAGOSHO";
        fieldValues += ", ?";
        values.add(this.getPagCveStPagosho());

        fields += ", PAG_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getPagFolioOpera());

        fields += ", PAG_IMP_TOTAL";
        fieldValues += ", ?";
        values.add(this.getPagImpTotal());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PAGOSHON WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PAG_NUM_CONTRATO = ?";
        values.add(this.getPagNumContrato());
        conditions += " AND PAG_CVE_PERS_FID = ?";
        values.add(this.getPagCvePersFid());
        conditions += " AND PAG_NUM_PERS_FID = ?";
        values.add(this.getPagNumPersFid());
        conditions += " AND PAG_CVE_TIPO_HONO = ?";
        values.add(this.getPagCveTipoHono());
        conditions += " AND PAG_FEC_CALC_HONO = ?";
        values.add(this.getPagFecCalcHono());
        conditions += " AND PAG_NUM_SECUENCIAL = ?";
        values.add(this.getPagNumSecuencial());
        conditions += " AND PAG_FEC_PAGO = ?";
        values.add(this.getPagFecPago());
        conditions += " AND PAG_NUM_PAGO = ?";
        values.add(this.getPagNumPago());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Pagoshon instance = (Pagoshon) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPagNumContrato().equals(instance.getPagNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPagCvePersFid().equals(instance.getPagCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getPagNumPersFid().equals(instance.getPagNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getPagCveTipoHono().equals(instance.getPagCveTipoHono()))
            equalObjects = false;
        if (equalObjects && !this.getPagFecCalcHono().equals(instance.getPagFecCalcHono()))
            equalObjects = false;
        if (equalObjects && !this.getPagNumSecuencial().equals(instance.getPagNumSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getPagFecPago().equals(instance.getPagFecPago()))
            equalObjects = false;
        if (equalObjects && !this.getPagNumPago().equals(instance.getPagNumPago()))
            equalObjects = false;
        if (equalObjects && !this.getPagNumServicio().equals(instance.getPagNumServicio()))
            equalObjects = false;
        if (equalObjects && !this.getPagNumTramite().equals(instance.getPagNumTramite()))
            equalObjects = false;
        if (equalObjects && !this.getPagImpPago().equals(instance.getPagImpPago()))
            equalObjects = false;
        if (equalObjects && !this.getPagImpIvaHonor().equals(instance.getPagImpIvaHonor()))
            equalObjects = false;
        if (equalObjects && !this.getPagImpExtemp().equals(instance.getPagImpExtemp()))
            equalObjects = false;
        if (equalObjects && !this.getPagNumMoneda().equals(instance.getPagNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getPagDoctoRef().equals(instance.getPagDoctoRef()))
            equalObjects = false;
        if (equalObjects && !this.getPagFecDoctoRef().equals(instance.getPagFecDoctoRef()))
            equalObjects = false;
        if (equalObjects && !this.getPagAnoAltaReg().equals(instance.getPagAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPagMesAltaReg().equals(instance.getPagMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPagDiaAltaReg().equals(instance.getPagDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPagAnoUltMod().equals(instance.getPagAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPagMesUltMod().equals(instance.getPagMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPagDiaUltMod().equals(instance.getPagDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPagCveStPagosho().equals(instance.getPagCveStPagosho()))
            equalObjects = false;
        if (equalObjects && !this.getPagFolioOpera().equals(instance.getPagFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getPagImpTotal().equals(instance.getPagImpTotal()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Pagoshon result = new Pagoshon();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPagNumContrato((BigDecimal) objectData.getData("PAG_NUM_CONTRATO"));
        result.setPagCvePersFid((String) objectData.getData("PAG_CVE_PERS_FID"));
        result.setPagNumPersFid((BigDecimal) objectData.getData("PAG_NUM_PERS_FID"));
        result.setPagCveTipoHono((String) objectData.getData("PAG_CVE_TIPO_HONO"));
        result.setPagFecCalcHono((String) objectData.getData("PAG_FEC_CALC_HONO"));
        result.setPagNumSecuencial((BigDecimal) objectData.getData("PAG_NUM_SECUENCIAL"));
        result.setPagFecPago((String) objectData.getData("PAG_FEC_PAGO"));
        result.setPagNumPago((BigDecimal) objectData.getData("PAG_NUM_PAGO"));
        result.setPagNumServicio((BigDecimal) objectData.getData("PAG_NUM_SERVICIO"));
        result.setPagNumTramite((BigDecimal) objectData.getData("PAG_NUM_TRAMITE"));
        result.setPagImpPago((BigDecimal) objectData.getData("PAG_IMP_PAGO"));
        result.setPagImpIvaHonor((BigDecimal) objectData.getData("PAG_IMP_IVA_HONOR"));
        result.setPagImpExtemp((BigDecimal) objectData.getData("PAG_IMP_EXTEMP"));
        result.setPagNumMoneda((BigDecimal) objectData.getData("PAG_NUM_MONEDA"));
        result.setPagDoctoRef((String) objectData.getData("PAG_DOCTO_REF"));
        result.setPagFecDoctoRef((String) objectData.getData("PAG_FEC_DOCTO_REF"));
        result.setPagAnoAltaReg((BigDecimal) objectData.getData("PAG_ANO_ALTA_REG"));
        result.setPagMesAltaReg((BigDecimal) objectData.getData("PAG_MES_ALTA_REG"));
        result.setPagDiaAltaReg((BigDecimal) objectData.getData("PAG_DIA_ALTA_REG"));
        result.setPagAnoUltMod((BigDecimal) objectData.getData("PAG_ANO_ULT_MOD"));
        result.setPagMesUltMod((BigDecimal) objectData.getData("PAG_MES_ULT_MOD"));
        result.setPagDiaUltMod((BigDecimal) objectData.getData("PAG_DIA_ULT_MOD"));
        result.setPagCveStPagosho((String) objectData.getData("PAG_CVE_ST_PAGOSHO"));
        result.setPagFolioOpera((BigDecimal) objectData.getData("PAG_FOLIO_OPERA"));
        result.setPagImpTotal((BigDecimal) objectData.getData("PAG_IMP_TOTAL"));

        return result;

    }

}
