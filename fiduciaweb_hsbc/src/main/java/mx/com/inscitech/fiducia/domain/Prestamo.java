package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PRESTAMO_PK", columns = { "PFO_NUM_CONTRATO", "PFO_NUM_DEPTO", "PFO_NUM_PARTICIP" }, sequences = { "MANUAL" })
public class Prestamo extends DomainObject {

    BigDecimal pfoNumContrato = null;
    BigDecimal pfoNumDepto = null;
    BigDecimal pfoNumParticip = null;
    String pfoCveTipoPrest = null;
    String pfoRefPrestamo = null;
    BigDecimal pfoImpSolicitado = null;
    String pfoFecSolicitud = null;
    String pfoAutorizacion = null;
    BigDecimal pfoImpOtorgado = null;
    String pfoFecPrestamo = null;
    BigDecimal pfoPjeTasaInter = null;
    String pfoCvePerPago = null;
    BigDecimal pfoNumPagPrest = null;
    BigDecimal pfoImpIntereses = null;
    BigDecimal pfoImpAdeuCap = null;
    BigDecimal pfoImpAdeuInter = null;
    BigDecimal pfoNumPagRealiz = null;
    BigDecimal pfoMesAltaReg = null;
    BigDecimal pfoDiaAltaReg = null;
    BigDecimal pfoAnoUltMod = null;
    BigDecimal pfoMesUltMod = null;
    BigDecimal pfoDiaUltMod = null;
    String pfoCveStPrest = null;

    public Prestamo() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfoNumContrato(BigDecimal pfoNumContrato) {
        this.pfoNumContrato = pfoNumContrato;
    }

    public BigDecimal getPfoNumContrato() {
        return this.pfoNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setPfoNumDepto(BigDecimal pfoNumDepto) {
        this.pfoNumDepto = pfoNumDepto;
    }

    public BigDecimal getPfoNumDepto() {
        return this.pfoNumDepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setPfoNumParticip(BigDecimal pfoNumParticip) {
        this.pfoNumParticip = pfoNumParticip;
    }

    public BigDecimal getPfoNumParticip() {
        return this.pfoNumParticip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfoCveTipoPrest(String pfoCveTipoPrest) {
        this.pfoCveTipoPrest = pfoCveTipoPrest;
    }

    public String getPfoCveTipoPrest() {
        return this.pfoCveTipoPrest;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfoRefPrestamo(String pfoRefPrestamo) {
        this.pfoRefPrestamo = pfoRefPrestamo;
    }

    public String getPfoRefPrestamo() {
        return this.pfoRefPrestamo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPfoImpSolicitado(BigDecimal pfoImpSolicitado) {
        this.pfoImpSolicitado = pfoImpSolicitado;
    }

    public BigDecimal getPfoImpSolicitado() {
        return this.pfoImpSolicitado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfoFecSolicitud(String pfoFecSolicitud) {
        this.pfoFecSolicitud = pfoFecSolicitud;
    }

    public String getPfoFecSolicitud() {
        return this.pfoFecSolicitud;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfoAutorizacion(String pfoAutorizacion) {
        this.pfoAutorizacion = pfoAutorizacion;
    }

    public String getPfoAutorizacion() {
        return this.pfoAutorizacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPfoImpOtorgado(BigDecimal pfoImpOtorgado) {
        this.pfoImpOtorgado = pfoImpOtorgado;
    }

    public BigDecimal getPfoImpOtorgado() {
        return this.pfoImpOtorgado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfoFecPrestamo(String pfoFecPrestamo) {
        this.pfoFecPrestamo = pfoFecPrestamo;
    }

    public String getPfoFecPrestamo() {
        return this.pfoFecPrestamo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setPfoPjeTasaInter(BigDecimal pfoPjeTasaInter) {
        this.pfoPjeTasaInter = pfoPjeTasaInter;
    }

    public BigDecimal getPfoPjeTasaInter() {
        return this.pfoPjeTasaInter;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfoCvePerPago(String pfoCvePerPago) {
        this.pfoCvePerPago = pfoCvePerPago;
    }

    public String getPfoCvePerPago() {
        return this.pfoCvePerPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfoNumPagPrest(BigDecimal pfoNumPagPrest) {
        this.pfoNumPagPrest = pfoNumPagPrest;
    }

    public BigDecimal getPfoNumPagPrest() {
        return this.pfoNumPagPrest;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPfoImpIntereses(BigDecimal pfoImpIntereses) {
        this.pfoImpIntereses = pfoImpIntereses;
    }

    public BigDecimal getPfoImpIntereses() {
        return this.pfoImpIntereses;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPfoImpAdeuCap(BigDecimal pfoImpAdeuCap) {
        this.pfoImpAdeuCap = pfoImpAdeuCap;
    }

    public BigDecimal getPfoImpAdeuCap() {
        return this.pfoImpAdeuCap;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPfoImpAdeuInter(BigDecimal pfoImpAdeuInter) {
        this.pfoImpAdeuInter = pfoImpAdeuInter;
    }

    public BigDecimal getPfoImpAdeuInter() {
        return this.pfoImpAdeuInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPfoNumPagRealiz(BigDecimal pfoNumPagRealiz) {
        this.pfoNumPagRealiz = pfoNumPagRealiz;
    }

    public BigDecimal getPfoNumPagRealiz() {
        return this.pfoNumPagRealiz;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfoMesAltaReg(BigDecimal pfoMesAltaReg) {
        this.pfoMesAltaReg = pfoMesAltaReg;
    }

    public BigDecimal getPfoMesAltaReg() {
        return this.pfoMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfoDiaAltaReg(BigDecimal pfoDiaAltaReg) {
        this.pfoDiaAltaReg = pfoDiaAltaReg;
    }

    public BigDecimal getPfoDiaAltaReg() {
        return this.pfoDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPfoAnoUltMod(BigDecimal pfoAnoUltMod) {
        this.pfoAnoUltMod = pfoAnoUltMod;
    }

    public BigDecimal getPfoAnoUltMod() {
        return this.pfoAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfoMesUltMod(BigDecimal pfoMesUltMod) {
        this.pfoMesUltMod = pfoMesUltMod;
    }

    public BigDecimal getPfoMesUltMod() {
        return this.pfoMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPfoDiaUltMod(BigDecimal pfoDiaUltMod) {
        this.pfoDiaUltMod = pfoDiaUltMod;
    }

    public BigDecimal getPfoDiaUltMod() {
        return this.pfoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPfoCveStPrest(String pfoCveStPrest) {
        this.pfoCveStPrest = pfoCveStPrest;
    }

    public String getPfoCveStPrest() {
        return this.pfoCveStPrest;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PRESTAMO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPfoNumContrato() != null && this.getPfoNumContrato().longValue() == -999) {
            conditions += " AND PFO_NUM_CONTRATO IS NULL";
        } else if (this.getPfoNumContrato() != null) {
            conditions += " AND PFO_NUM_CONTRATO = ?";
            values.add(this.getPfoNumContrato());
        }

        if (this.getPfoNumDepto() != null && this.getPfoNumDepto().longValue() == -999) {
            conditions += " AND PFO_NUM_DEPTO IS NULL";
        } else if (this.getPfoNumDepto() != null) {
            conditions += " AND PFO_NUM_DEPTO = ?";
            values.add(this.getPfoNumDepto());
        }

        if (this.getPfoNumParticip() != null && this.getPfoNumParticip().longValue() == -999) {
            conditions += " AND PFO_NUM_PARTICIP IS NULL";
        } else if (this.getPfoNumParticip() != null) {
            conditions += " AND PFO_NUM_PARTICIP = ?";
            values.add(this.getPfoNumParticip());
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
        String sql = "SELECT * FROM PRESTAMO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPfoNumContrato() != null && this.getPfoNumContrato().longValue() == -999) {
            conditions += " AND PFO_NUM_CONTRATO IS NULL";
        } else if (this.getPfoNumContrato() != null) {
            conditions += " AND PFO_NUM_CONTRATO = ?";
            values.add(this.getPfoNumContrato());
        }

        if (this.getPfoNumDepto() != null && this.getPfoNumDepto().longValue() == -999) {
            conditions += " AND PFO_NUM_DEPTO IS NULL";
        } else if (this.getPfoNumDepto() != null) {
            conditions += " AND PFO_NUM_DEPTO = ?";
            values.add(this.getPfoNumDepto());
        }

        if (this.getPfoNumParticip() != null && this.getPfoNumParticip().longValue() == -999) {
            conditions += " AND PFO_NUM_PARTICIP IS NULL";
        } else if (this.getPfoNumParticip() != null) {
            conditions += " AND PFO_NUM_PARTICIP = ?";
            values.add(this.getPfoNumParticip());
        }

        if (this.getPfoCveTipoPrest() != null && "null".equals(this.getPfoCveTipoPrest())) {
            conditions += " AND PFO_CVE_TIPO_PREST IS NULL";
        } else if (this.getPfoCveTipoPrest() != null) {
            conditions += " AND PFO_CVE_TIPO_PREST = ?";
            values.add(this.getPfoCveTipoPrest());
        }

        if (this.getPfoRefPrestamo() != null && "null".equals(this.getPfoRefPrestamo())) {
            conditions += " AND PFO_REF_PRESTAMO IS NULL";
        } else if (this.getPfoRefPrestamo() != null) {
            conditions += " AND PFO_REF_PRESTAMO = ?";
            values.add(this.getPfoRefPrestamo());
        }

        if (this.getPfoImpSolicitado() != null && this.getPfoImpSolicitado().longValue() == -999) {
            conditions += " AND PFO_IMP_SOLICITADO IS NULL";
        } else if (this.getPfoImpSolicitado() != null) {
            conditions += " AND PFO_IMP_SOLICITADO = ?";
            values.add(this.getPfoImpSolicitado());
        }

        if (this.getPfoFecSolicitud() != null && "null".equals(this.getPfoFecSolicitud())) {
            conditions += " AND PFO_FEC_SOLICITUD IS NULL";
        } else if (this.getPfoFecSolicitud() != null) {
            conditions += " AND PFO_FEC_SOLICITUD = ?";
            values.add(this.getPfoFecSolicitud());
        }

        if (this.getPfoAutorizacion() != null && "null".equals(this.getPfoAutorizacion())) {
            conditions += " AND PFO_AUTORIZACION IS NULL";
        } else if (this.getPfoAutorizacion() != null) {
            conditions += " AND PFO_AUTORIZACION = ?";
            values.add(this.getPfoAutorizacion());
        }

        if (this.getPfoImpOtorgado() != null && this.getPfoImpOtorgado().longValue() == -999) {
            conditions += " AND PFO_IMP_OTORGADO IS NULL";
        } else if (this.getPfoImpOtorgado() != null) {
            conditions += " AND PFO_IMP_OTORGADO = ?";
            values.add(this.getPfoImpOtorgado());
        }

        if (this.getPfoFecPrestamo() != null && "null".equals(this.getPfoFecPrestamo())) {
            conditions += " AND PFO_FEC_PRESTAMO IS NULL";
        } else if (this.getPfoFecPrestamo() != null) {
            conditions += " AND PFO_FEC_PRESTAMO = ?";
            values.add(this.getPfoFecPrestamo());
        }

        if (this.getPfoPjeTasaInter() != null && this.getPfoPjeTasaInter().longValue() == -999) {
            conditions += " AND PFO_PJE_TASA_INTER IS NULL";
        } else if (this.getPfoPjeTasaInter() != null) {
            conditions += " AND PFO_PJE_TASA_INTER = ?";
            values.add(this.getPfoPjeTasaInter());
        }

        if (this.getPfoCvePerPago() != null && "null".equals(this.getPfoCvePerPago())) {
            conditions += " AND PFO_CVE_PER_PAGO IS NULL";
        } else if (this.getPfoCvePerPago() != null) {
            conditions += " AND PFO_CVE_PER_PAGO = ?";
            values.add(this.getPfoCvePerPago());
        }

        if (this.getPfoNumPagPrest() != null && this.getPfoNumPagPrest().longValue() == -999) {
            conditions += " AND PFO_NUM_PAG_PREST IS NULL";
        } else if (this.getPfoNumPagPrest() != null) {
            conditions += " AND PFO_NUM_PAG_PREST = ?";
            values.add(this.getPfoNumPagPrest());
        }

        if (this.getPfoImpIntereses() != null && this.getPfoImpIntereses().longValue() == -999) {
            conditions += " AND PFO_IMP_INTERESES IS NULL";
        } else if (this.getPfoImpIntereses() != null) {
            conditions += " AND PFO_IMP_INTERESES = ?";
            values.add(this.getPfoImpIntereses());
        }

        if (this.getPfoImpAdeuCap() != null && this.getPfoImpAdeuCap().longValue() == -999) {
            conditions += " AND PFO_IMP_ADEU_CAP IS NULL";
        } else if (this.getPfoImpAdeuCap() != null) {
            conditions += " AND PFO_IMP_ADEU_CAP = ?";
            values.add(this.getPfoImpAdeuCap());
        }

        if (this.getPfoImpAdeuInter() != null && this.getPfoImpAdeuInter().longValue() == -999) {
            conditions += " AND PFO_IMP_ADEU_INTER IS NULL";
        } else if (this.getPfoImpAdeuInter() != null) {
            conditions += " AND PFO_IMP_ADEU_INTER = ?";
            values.add(this.getPfoImpAdeuInter());
        }

        if (this.getPfoNumPagRealiz() != null && this.getPfoNumPagRealiz().longValue() == -999) {
            conditions += " AND PFO_NUM_PAG_REALIZ IS NULL";
        } else if (this.getPfoNumPagRealiz() != null) {
            conditions += " AND PFO_NUM_PAG_REALIZ = ?";
            values.add(this.getPfoNumPagRealiz());
        }

        if (this.getPfoMesAltaReg() != null && this.getPfoMesAltaReg().longValue() == -999) {
            conditions += " AND PFO_MES_ALTA_REG IS NULL";
        } else if (this.getPfoMesAltaReg() != null) {
            conditions += " AND PFO_MES_ALTA_REG = ?";
            values.add(this.getPfoMesAltaReg());
        }

        if (this.getPfoDiaAltaReg() != null && this.getPfoDiaAltaReg().longValue() == -999) {
            conditions += " AND PFO_DIA_ALTA_REG IS NULL";
        } else if (this.getPfoDiaAltaReg() != null) {
            conditions += " AND PFO_DIA_ALTA_REG = ?";
            values.add(this.getPfoDiaAltaReg());
        }

        if (this.getPfoAnoUltMod() != null && this.getPfoAnoUltMod().longValue() == -999) {
            conditions += " AND PFO_ANO_ULT_MOD IS NULL";
        } else if (this.getPfoAnoUltMod() != null) {
            conditions += " AND PFO_ANO_ULT_MOD = ?";
            values.add(this.getPfoAnoUltMod());
        }

        if (this.getPfoMesUltMod() != null && this.getPfoMesUltMod().longValue() == -999) {
            conditions += " AND PFO_MES_ULT_MOD IS NULL";
        } else if (this.getPfoMesUltMod() != null) {
            conditions += " AND PFO_MES_ULT_MOD = ?";
            values.add(this.getPfoMesUltMod());
        }

        if (this.getPfoDiaUltMod() != null && this.getPfoDiaUltMod().longValue() == -999) {
            conditions += " AND PFO_DIA_ULT_MOD IS NULL";
        } else if (this.getPfoDiaUltMod() != null) {
            conditions += " AND PFO_DIA_ULT_MOD = ?";
            values.add(this.getPfoDiaUltMod());
        }

        if (this.getPfoCveStPrest() != null && "null".equals(this.getPfoCveStPrest())) {
            conditions += " AND PFO_CVE_ST_PREST IS NULL";
        } else if (this.getPfoCveStPrest() != null) {
            conditions += " AND PFO_CVE_ST_PREST = ?";
            values.add(this.getPfoCveStPrest());
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
        String sql = "UPDATE PRESTAMO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PFO_NUM_CONTRATO = ?";
        pkValues.add(this.getPfoNumContrato());
        conditions += " AND PFO_NUM_DEPTO = ?";
        pkValues.add(this.getPfoNumDepto());
        conditions += " AND PFO_NUM_PARTICIP = ?";
        pkValues.add(this.getPfoNumParticip());
        fields += " PFO_CVE_TIPO_PREST = ?, ";
        values.add(this.getPfoCveTipoPrest());
        fields += " PFO_REF_PRESTAMO = ?, ";
        values.add(this.getPfoRefPrestamo());
        fields += " PFO_IMP_SOLICITADO = ?, ";
        values.add(this.getPfoImpSolicitado());
        fields += " PFO_FEC_SOLICITUD = ?, ";
        values.add(this.getPfoFecSolicitud());
        fields += " PFO_AUTORIZACION = ?, ";
        values.add(this.getPfoAutorizacion());
        fields += " PFO_IMP_OTORGADO = ?, ";
        values.add(this.getPfoImpOtorgado());
        fields += " PFO_FEC_PRESTAMO = ?, ";
        values.add(this.getPfoFecPrestamo());
        fields += " PFO_PJE_TASA_INTER = ?, ";
        values.add(this.getPfoPjeTasaInter());
        fields += " PFO_CVE_PER_PAGO = ?, ";
        values.add(this.getPfoCvePerPago());
        fields += " PFO_NUM_PAG_PREST = ?, ";
        values.add(this.getPfoNumPagPrest());
        fields += " PFO_IMP_INTERESES = ?, ";
        values.add(this.getPfoImpIntereses());
        fields += " PFO_IMP_ADEU_CAP = ?, ";
        values.add(this.getPfoImpAdeuCap());
        fields += " PFO_IMP_ADEU_INTER = ?, ";
        values.add(this.getPfoImpAdeuInter());
        fields += " PFO_NUM_PAG_REALIZ = ?, ";
        values.add(this.getPfoNumPagRealiz());
        fields += " PFO_MES_ALTA_REG = ?, ";
        values.add(this.getPfoMesAltaReg());
        fields += " PFO_DIA_ALTA_REG = ?, ";
        values.add(this.getPfoDiaAltaReg());
        fields += " PFO_ANO_ULT_MOD = ?, ";
        values.add(this.getPfoAnoUltMod());
        fields += " PFO_MES_ULT_MOD = ?, ";
        values.add(this.getPfoMesUltMod());
        fields += " PFO_DIA_ULT_MOD = ?, ";
        values.add(this.getPfoDiaUltMod());
        fields += " PFO_CVE_ST_PREST = ?, ";
        values.add(this.getPfoCveStPrest());
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
        String sql = "INSERT INTO PRESTAMO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PFO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPfoNumContrato());

        fields += ", PFO_NUM_DEPTO";
        fieldValues += ", ?";
        values.add(this.getPfoNumDepto());

        fields += ", PFO_NUM_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getPfoNumParticip());

        fields += ", PFO_CVE_TIPO_PREST";
        fieldValues += ", ?";
        values.add(this.getPfoCveTipoPrest());

        fields += ", PFO_REF_PRESTAMO";
        fieldValues += ", ?";
        values.add(this.getPfoRefPrestamo());

        fields += ", PFO_IMP_SOLICITADO";
        fieldValues += ", ?";
        values.add(this.getPfoImpSolicitado());

        fields += ", PFO_FEC_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getPfoFecSolicitud());

        fields += ", PFO_AUTORIZACION";
        fieldValues += ", ?";
        values.add(this.getPfoAutorizacion());

        fields += ", PFO_IMP_OTORGADO";
        fieldValues += ", ?";
        values.add(this.getPfoImpOtorgado());

        fields += ", PFO_FEC_PRESTAMO";
        fieldValues += ", ?";
        values.add(this.getPfoFecPrestamo());

        fields += ", PFO_PJE_TASA_INTER";
        fieldValues += ", ?";
        values.add(this.getPfoPjeTasaInter());

        fields += ", PFO_CVE_PER_PAGO";
        fieldValues += ", ?";
        values.add(this.getPfoCvePerPago());

        fields += ", PFO_NUM_PAG_PREST";
        fieldValues += ", ?";
        values.add(this.getPfoNumPagPrest());

        fields += ", PFO_IMP_INTERESES";
        fieldValues += ", ?";
        values.add(this.getPfoImpIntereses());

        fields += ", PFO_IMP_ADEU_CAP";
        fieldValues += ", ?";
        values.add(this.getPfoImpAdeuCap());

        fields += ", PFO_IMP_ADEU_INTER";
        fieldValues += ", ?";
        values.add(this.getPfoImpAdeuInter());

        fields += ", PFO_NUM_PAG_REALIZ";
        fieldValues += ", ?";
        values.add(this.getPfoNumPagRealiz());

        fields += ", PFO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPfoMesAltaReg());

        fields += ", PFO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPfoDiaAltaReg());

        fields += ", PFO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPfoAnoUltMod());

        fields += ", PFO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPfoMesUltMod());

        fields += ", PFO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPfoDiaUltMod());

        fields += ", PFO_CVE_ST_PREST";
        fieldValues += ", ?";
        values.add(this.getPfoCveStPrest());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PRESTAMO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PFO_NUM_CONTRATO = ?";
        values.add(this.getPfoNumContrato());
        conditions += " AND PFO_NUM_DEPTO = ?";
        values.add(this.getPfoNumDepto());
        conditions += " AND PFO_NUM_PARTICIP = ?";
        values.add(this.getPfoNumParticip());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Prestamo instance = (Prestamo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPfoNumContrato().equals(instance.getPfoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPfoNumDepto().equals(instance.getPfoNumDepto()))
            equalObjects = false;
        if (equalObjects && !this.getPfoNumParticip().equals(instance.getPfoNumParticip()))
            equalObjects = false;
        if (equalObjects && !this.getPfoCveTipoPrest().equals(instance.getPfoCveTipoPrest()))
            equalObjects = false;
        if (equalObjects && !this.getPfoRefPrestamo().equals(instance.getPfoRefPrestamo()))
            equalObjects = false;
        if (equalObjects && !this.getPfoImpSolicitado().equals(instance.getPfoImpSolicitado()))
            equalObjects = false;
        if (equalObjects && !this.getPfoFecSolicitud().equals(instance.getPfoFecSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getPfoAutorizacion().equals(instance.getPfoAutorizacion()))
            equalObjects = false;
        if (equalObjects && !this.getPfoImpOtorgado().equals(instance.getPfoImpOtorgado()))
            equalObjects = false;
        if (equalObjects && !this.getPfoFecPrestamo().equals(instance.getPfoFecPrestamo()))
            equalObjects = false;
        if (equalObjects && !this.getPfoPjeTasaInter().equals(instance.getPfoPjeTasaInter()))
            equalObjects = false;
        if (equalObjects && !this.getPfoCvePerPago().equals(instance.getPfoCvePerPago()))
            equalObjects = false;
        if (equalObjects && !this.getPfoNumPagPrest().equals(instance.getPfoNumPagPrest()))
            equalObjects = false;
        if (equalObjects && !this.getPfoImpIntereses().equals(instance.getPfoImpIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getPfoImpAdeuCap().equals(instance.getPfoImpAdeuCap()))
            equalObjects = false;
        if (equalObjects && !this.getPfoImpAdeuInter().equals(instance.getPfoImpAdeuInter()))
            equalObjects = false;
        if (equalObjects && !this.getPfoNumPagRealiz().equals(instance.getPfoNumPagRealiz()))
            equalObjects = false;
        if (equalObjects && !this.getPfoMesAltaReg().equals(instance.getPfoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPfoDiaAltaReg().equals(instance.getPfoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPfoAnoUltMod().equals(instance.getPfoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPfoMesUltMod().equals(instance.getPfoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPfoDiaUltMod().equals(instance.getPfoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPfoCveStPrest().equals(instance.getPfoCveStPrest()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Prestamo result = new Prestamo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPfoNumContrato((BigDecimal) objectData.getData("PFO_NUM_CONTRATO"));
        result.setPfoNumDepto((BigDecimal) objectData.getData("PFO_NUM_DEPTO"));
        result.setPfoNumParticip((BigDecimal) objectData.getData("PFO_NUM_PARTICIP"));
        result.setPfoCveTipoPrest((String) objectData.getData("PFO_CVE_TIPO_PREST"));
        result.setPfoRefPrestamo((String) objectData.getData("PFO_REF_PRESTAMO"));
        result.setPfoImpSolicitado((BigDecimal) objectData.getData("PFO_IMP_SOLICITADO"));
        result.setPfoFecSolicitud((String) objectData.getData("PFO_FEC_SOLICITUD"));
        result.setPfoAutorizacion((String) objectData.getData("PFO_AUTORIZACION"));
        result.setPfoImpOtorgado((BigDecimal) objectData.getData("PFO_IMP_OTORGADO"));
        result.setPfoFecPrestamo((String) objectData.getData("PFO_FEC_PRESTAMO"));
        result.setPfoPjeTasaInter((BigDecimal) objectData.getData("PFO_PJE_TASA_INTER"));
        result.setPfoCvePerPago((String) objectData.getData("PFO_CVE_PER_PAGO"));
        result.setPfoNumPagPrest((BigDecimal) objectData.getData("PFO_NUM_PAG_PREST"));
        result.setPfoImpIntereses((BigDecimal) objectData.getData("PFO_IMP_INTERESES"));
        result.setPfoImpAdeuCap((BigDecimal) objectData.getData("PFO_IMP_ADEU_CAP"));
        result.setPfoImpAdeuInter((BigDecimal) objectData.getData("PFO_IMP_ADEU_INTER"));
        result.setPfoNumPagRealiz((BigDecimal) objectData.getData("PFO_NUM_PAG_REALIZ"));
        result.setPfoMesAltaReg((BigDecimal) objectData.getData("PFO_MES_ALTA_REG"));
        result.setPfoDiaAltaReg((BigDecimal) objectData.getData("PFO_DIA_ALTA_REG"));
        result.setPfoAnoUltMod((BigDecimal) objectData.getData("PFO_ANO_ULT_MOD"));
        result.setPfoMesUltMod((BigDecimal) objectData.getData("PFO_MES_ULT_MOD"));
        result.setPfoDiaUltMod((BigDecimal) objectData.getData("PFO_DIA_ULT_MOD"));
        result.setPfoCveStPrest((String) objectData.getData("PFO_CVE_ST_PREST"));

        return result;

    }

}
