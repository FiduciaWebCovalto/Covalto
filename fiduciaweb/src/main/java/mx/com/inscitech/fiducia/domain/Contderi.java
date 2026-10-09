package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONTDERI_PK", columns = { "CCD_NUM_CONTRATO", "CCD_NUM_SUBCOMITE", "CCD_NUM_REUNION", "CCD_NUM_ACUERDO", "CCD_NUM_TERCERO", "CCD_ID_CTO_TERCE" },
            sequences = { "MANUAL" })
public class Contderi extends DomainObject {

    BigDecimal ccdNumContrato = null;
    BigDecimal ccdNumSubcomite = null;
    BigDecimal ccdNumReunion = null;
    BigDecimal ccdNumAcuerdo = null;
    BigDecimal ccdNumTercero = null;
    String ccdIdCtoTerce = null;
    String ccdCveTipoCto = null;
    String ccdObjetoCto = null;
    BigDecimal ccdImpContrato = null;
    BigDecimal ccdImpAnticipo = null;
    BigDecimal ccdImpAmpliacion = null;
    BigDecimal ccdPjeAnticipo = null;
    BigDecimal ccdPjeAmpliacion = null;
    BigDecimal ccdAnoInicio = null;
    BigDecimal ccdMesInicio = null;
    BigDecimal ccdDiaInicio = null;
    BigDecimal ccdAnoTerEspera = null;
    BigDecimal ccdMesTerEspera = null;
    BigDecimal ccdDiaTerEspera = null;
    BigDecimal ccdAnoTerReal = null;
    BigDecimal ccdMesTerReal = null;
    BigDecimal ccdDiaTerReal = null;
    BigDecimal ccdAnoAltaReg = null;
    BigDecimal ccdMesAltaReg = null;
    BigDecimal ccdDiaAltaReg = null;
    BigDecimal ccdAnoUltMod = null;
    BigDecimal ccdMesUltMod = null;
    BigDecimal ccdDiaUltMod = null;
    String ccdCveStContder = null;

    public Contderi() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcdNumContrato(BigDecimal ccdNumContrato) {
        this.ccdNumContrato = ccdNumContrato;
    }

    public BigDecimal getCcdNumContrato() {
        return this.ccdNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcdNumSubcomite(BigDecimal ccdNumSubcomite) {
        this.ccdNumSubcomite = ccdNumSubcomite;
    }

    public BigDecimal getCcdNumSubcomite() {
        return this.ccdNumSubcomite;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcdNumReunion(BigDecimal ccdNumReunion) {
        this.ccdNumReunion = ccdNumReunion;
    }

    public BigDecimal getCcdNumReunion() {
        return this.ccdNumReunion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcdNumAcuerdo(BigDecimal ccdNumAcuerdo) {
        this.ccdNumAcuerdo = ccdNumAcuerdo;
    }

    public BigDecimal getCcdNumAcuerdo() {
        return this.ccdNumAcuerdo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCcdNumTercero(BigDecimal ccdNumTercero) {
        this.ccdNumTercero = ccdNumTercero;
    }

    public BigDecimal getCcdNumTercero() {
        return this.ccdNumTercero;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcdIdCtoTerce(String ccdIdCtoTerce) {
        this.ccdIdCtoTerce = ccdIdCtoTerce;
    }

    public String getCcdIdCtoTerce() {
        return this.ccdIdCtoTerce;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcdCveTipoCto(String ccdCveTipoCto) {
        this.ccdCveTipoCto = ccdCveTipoCto;
    }

    public String getCcdCveTipoCto() {
        return this.ccdCveTipoCto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcdObjetoCto(String ccdObjetoCto) {
        this.ccdObjetoCto = ccdObjetoCto;
    }

    public String getCcdObjetoCto() {
        return this.ccdObjetoCto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCcdImpContrato(BigDecimal ccdImpContrato) {
        this.ccdImpContrato = ccdImpContrato;
    }

    public BigDecimal getCcdImpContrato() {
        return this.ccdImpContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCcdImpAnticipo(BigDecimal ccdImpAnticipo) {
        this.ccdImpAnticipo = ccdImpAnticipo;
    }

    public BigDecimal getCcdImpAnticipo() {
        return this.ccdImpAnticipo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCcdImpAmpliacion(BigDecimal ccdImpAmpliacion) {
        this.ccdImpAmpliacion = ccdImpAmpliacion;
    }

    public BigDecimal getCcdImpAmpliacion() {
        return this.ccdImpAmpliacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setCcdPjeAnticipo(BigDecimal ccdPjeAnticipo) {
        this.ccdPjeAnticipo = ccdPjeAnticipo;
    }

    public BigDecimal getCcdPjeAnticipo() {
        return this.ccdPjeAnticipo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setCcdPjeAmpliacion(BigDecimal ccdPjeAmpliacion) {
        this.ccdPjeAmpliacion = ccdPjeAmpliacion;
    }

    public BigDecimal getCcdPjeAmpliacion() {
        return this.ccdPjeAmpliacion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCcdAnoInicio(BigDecimal ccdAnoInicio) {
        this.ccdAnoInicio = ccdAnoInicio;
    }

    public BigDecimal getCcdAnoInicio() {
        return this.ccdAnoInicio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcdMesInicio(BigDecimal ccdMesInicio) {
        this.ccdMesInicio = ccdMesInicio;
    }

    public BigDecimal getCcdMesInicio() {
        return this.ccdMesInicio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcdDiaInicio(BigDecimal ccdDiaInicio) {
        this.ccdDiaInicio = ccdDiaInicio;
    }

    public BigDecimal getCcdDiaInicio() {
        return this.ccdDiaInicio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCcdAnoTerEspera(BigDecimal ccdAnoTerEspera) {
        this.ccdAnoTerEspera = ccdAnoTerEspera;
    }

    public BigDecimal getCcdAnoTerEspera() {
        return this.ccdAnoTerEspera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcdMesTerEspera(BigDecimal ccdMesTerEspera) {
        this.ccdMesTerEspera = ccdMesTerEspera;
    }

    public BigDecimal getCcdMesTerEspera() {
        return this.ccdMesTerEspera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcdDiaTerEspera(BigDecimal ccdDiaTerEspera) {
        this.ccdDiaTerEspera = ccdDiaTerEspera;
    }

    public BigDecimal getCcdDiaTerEspera() {
        return this.ccdDiaTerEspera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCcdAnoTerReal(BigDecimal ccdAnoTerReal) {
        this.ccdAnoTerReal = ccdAnoTerReal;
    }

    public BigDecimal getCcdAnoTerReal() {
        return this.ccdAnoTerReal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcdMesTerReal(BigDecimal ccdMesTerReal) {
        this.ccdMesTerReal = ccdMesTerReal;
    }

    public BigDecimal getCcdMesTerReal() {
        return this.ccdMesTerReal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcdDiaTerReal(BigDecimal ccdDiaTerReal) {
        this.ccdDiaTerReal = ccdDiaTerReal;
    }

    public BigDecimal getCcdDiaTerReal() {
        return this.ccdDiaTerReal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCcdAnoAltaReg(BigDecimal ccdAnoAltaReg) {
        this.ccdAnoAltaReg = ccdAnoAltaReg;
    }

    public BigDecimal getCcdAnoAltaReg() {
        return this.ccdAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcdMesAltaReg(BigDecimal ccdMesAltaReg) {
        this.ccdMesAltaReg = ccdMesAltaReg;
    }

    public BigDecimal getCcdMesAltaReg() {
        return this.ccdMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcdDiaAltaReg(BigDecimal ccdDiaAltaReg) {
        this.ccdDiaAltaReg = ccdDiaAltaReg;
    }

    public BigDecimal getCcdDiaAltaReg() {
        return this.ccdDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCcdAnoUltMod(BigDecimal ccdAnoUltMod) {
        this.ccdAnoUltMod = ccdAnoUltMod;
    }

    public BigDecimal getCcdAnoUltMod() {
        return this.ccdAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcdMesUltMod(BigDecimal ccdMesUltMod) {
        this.ccdMesUltMod = ccdMesUltMod;
    }

    public BigDecimal getCcdMesUltMod() {
        return this.ccdMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCcdDiaUltMod(BigDecimal ccdDiaUltMod) {
        this.ccdDiaUltMod = ccdDiaUltMod;
    }

    public BigDecimal getCcdDiaUltMod() {
        return this.ccdDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCcdCveStContder(String ccdCveStContder) {
        this.ccdCveStContder = ccdCveStContder;
    }

    public String getCcdCveStContder() {
        return this.ccdCveStContder;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONTDERI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCcdNumContrato() != null && this.getCcdNumContrato().longValue() == -999) {
            conditions += " AND CCD_NUM_CONTRATO IS NULL";
        } else if (this.getCcdNumContrato() != null) {
            conditions += " AND CCD_NUM_CONTRATO = ?";
            values.add(this.getCcdNumContrato());
        }

        if (this.getCcdNumSubcomite() != null && this.getCcdNumSubcomite().longValue() == -999) {
            conditions += " AND CCD_NUM_SUBCOMITE IS NULL";
        } else if (this.getCcdNumSubcomite() != null) {
            conditions += " AND CCD_NUM_SUBCOMITE = ?";
            values.add(this.getCcdNumSubcomite());
        }

        if (this.getCcdNumReunion() != null && this.getCcdNumReunion().longValue() == -999) {
            conditions += " AND CCD_NUM_REUNION IS NULL";
        } else if (this.getCcdNumReunion() != null) {
            conditions += " AND CCD_NUM_REUNION = ?";
            values.add(this.getCcdNumReunion());
        }

        if (this.getCcdNumAcuerdo() != null && this.getCcdNumAcuerdo().longValue() == -999) {
            conditions += " AND CCD_NUM_ACUERDO IS NULL";
        } else if (this.getCcdNumAcuerdo() != null) {
            conditions += " AND CCD_NUM_ACUERDO = ?";
            values.add(this.getCcdNumAcuerdo());
        }

        if (this.getCcdNumTercero() != null && this.getCcdNumTercero().longValue() == -999) {
            conditions += " AND CCD_NUM_TERCERO IS NULL";
        } else if (this.getCcdNumTercero() != null) {
            conditions += " AND CCD_NUM_TERCERO = ?";
            values.add(this.getCcdNumTercero());
        }

        if (this.getCcdIdCtoTerce() != null && "null".equals(this.getCcdIdCtoTerce())) {
            conditions += " AND CCD_ID_CTO_TERCE IS NULL";
        } else if (this.getCcdIdCtoTerce() != null) {
            conditions += " AND CCD_ID_CTO_TERCE = ?";
            values.add(this.getCcdIdCtoTerce());
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
        String sql = "SELECT * FROM CONTDERI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCcdNumContrato() != null && this.getCcdNumContrato().longValue() == -999) {
            conditions += " AND CCD_NUM_CONTRATO IS NULL";
        } else if (this.getCcdNumContrato() != null) {
            conditions += " AND CCD_NUM_CONTRATO = ?";
            values.add(this.getCcdNumContrato());
        }

        if (this.getCcdNumSubcomite() != null && this.getCcdNumSubcomite().longValue() == -999) {
            conditions += " AND CCD_NUM_SUBCOMITE IS NULL";
        } else if (this.getCcdNumSubcomite() != null) {
            conditions += " AND CCD_NUM_SUBCOMITE = ?";
            values.add(this.getCcdNumSubcomite());
        }

        if (this.getCcdNumReunion() != null && this.getCcdNumReunion().longValue() == -999) {
            conditions += " AND CCD_NUM_REUNION IS NULL";
        } else if (this.getCcdNumReunion() != null) {
            conditions += " AND CCD_NUM_REUNION = ?";
            values.add(this.getCcdNumReunion());
        }

        if (this.getCcdNumAcuerdo() != null && this.getCcdNumAcuerdo().longValue() == -999) {
            conditions += " AND CCD_NUM_ACUERDO IS NULL";
        } else if (this.getCcdNumAcuerdo() != null) {
            conditions += " AND CCD_NUM_ACUERDO = ?";
            values.add(this.getCcdNumAcuerdo());
        }

        if (this.getCcdNumTercero() != null && this.getCcdNumTercero().longValue() == -999) {
            conditions += " AND CCD_NUM_TERCERO IS NULL";
        } else if (this.getCcdNumTercero() != null) {
            conditions += " AND CCD_NUM_TERCERO = ?";
            values.add(this.getCcdNumTercero());
        }

        if (this.getCcdIdCtoTerce() != null && "null".equals(this.getCcdIdCtoTerce())) {
            conditions += " AND CCD_ID_CTO_TERCE IS NULL";
        } else if (this.getCcdIdCtoTerce() != null) {
            conditions += " AND CCD_ID_CTO_TERCE = ?";
            values.add(this.getCcdIdCtoTerce());
        }

        if (this.getCcdCveTipoCto() != null && "null".equals(this.getCcdCveTipoCto())) {
            conditions += " AND CCD_CVE_TIPO_CTO IS NULL";
        } else if (this.getCcdCveTipoCto() != null) {
            conditions += " AND CCD_CVE_TIPO_CTO = ?";
            values.add(this.getCcdCveTipoCto());
        }

        if (this.getCcdObjetoCto() != null && "null".equals(this.getCcdObjetoCto())) {
            conditions += " AND CCD_OBJETO_CTO IS NULL";
        } else if (this.getCcdObjetoCto() != null) {
            conditions += " AND CCD_OBJETO_CTO = ?";
            values.add(this.getCcdObjetoCto());
        }

        if (this.getCcdImpContrato() != null && this.getCcdImpContrato().longValue() == -999) {
            conditions += " AND CCD_IMP_CONTRATO IS NULL";
        } else if (this.getCcdImpContrato() != null) {
            conditions += " AND CCD_IMP_CONTRATO = ?";
            values.add(this.getCcdImpContrato());
        }

        if (this.getCcdImpAnticipo() != null && this.getCcdImpAnticipo().longValue() == -999) {
            conditions += " AND CCD_IMP_ANTICIPO IS NULL";
        } else if (this.getCcdImpAnticipo() != null) {
            conditions += " AND CCD_IMP_ANTICIPO = ?";
            values.add(this.getCcdImpAnticipo());
        }

        if (this.getCcdImpAmpliacion() != null && this.getCcdImpAmpliacion().longValue() == -999) {
            conditions += " AND CCD_IMP_AMPLIACION IS NULL";
        } else if (this.getCcdImpAmpliacion() != null) {
            conditions += " AND CCD_IMP_AMPLIACION = ?";
            values.add(this.getCcdImpAmpliacion());
        }

        if (this.getCcdPjeAnticipo() != null && this.getCcdPjeAnticipo().longValue() == -999) {
            conditions += " AND CCD_PJE_ANTICIPO IS NULL";
        } else if (this.getCcdPjeAnticipo() != null) {
            conditions += " AND CCD_PJE_ANTICIPO = ?";
            values.add(this.getCcdPjeAnticipo());
        }

        if (this.getCcdPjeAmpliacion() != null && this.getCcdPjeAmpliacion().longValue() == -999) {
            conditions += " AND CCD_PJE_AMPLIACION IS NULL";
        } else if (this.getCcdPjeAmpliacion() != null) {
            conditions += " AND CCD_PJE_AMPLIACION = ?";
            values.add(this.getCcdPjeAmpliacion());
        }

        if (this.getCcdAnoInicio() != null && this.getCcdAnoInicio().longValue() == -999) {
            conditions += " AND CCD_ANO_INICIO IS NULL";
        } else if (this.getCcdAnoInicio() != null) {
            conditions += " AND CCD_ANO_INICIO = ?";
            values.add(this.getCcdAnoInicio());
        }

        if (this.getCcdMesInicio() != null && this.getCcdMesInicio().longValue() == -999) {
            conditions += " AND CCD_MES_INICIO IS NULL";
        } else if (this.getCcdMesInicio() != null) {
            conditions += " AND CCD_MES_INICIO = ?";
            values.add(this.getCcdMesInicio());
        }

        if (this.getCcdDiaInicio() != null && this.getCcdDiaInicio().longValue() == -999) {
            conditions += " AND CCD_DIA_INICIO IS NULL";
        } else if (this.getCcdDiaInicio() != null) {
            conditions += " AND CCD_DIA_INICIO = ?";
            values.add(this.getCcdDiaInicio());
        }

        if (this.getCcdAnoTerEspera() != null && this.getCcdAnoTerEspera().longValue() == -999) {
            conditions += " AND CCD_ANO_TER_ESPERA IS NULL";
        } else if (this.getCcdAnoTerEspera() != null) {
            conditions += " AND CCD_ANO_TER_ESPERA = ?";
            values.add(this.getCcdAnoTerEspera());
        }

        if (this.getCcdMesTerEspera() != null && this.getCcdMesTerEspera().longValue() == -999) {
            conditions += " AND CCD_MES_TER_ESPERA IS NULL";
        } else if (this.getCcdMesTerEspera() != null) {
            conditions += " AND CCD_MES_TER_ESPERA = ?";
            values.add(this.getCcdMesTerEspera());
        }

        if (this.getCcdDiaTerEspera() != null && this.getCcdDiaTerEspera().longValue() == -999) {
            conditions += " AND CCD_DIA_TER_ESPERA IS NULL";
        } else if (this.getCcdDiaTerEspera() != null) {
            conditions += " AND CCD_DIA_TER_ESPERA = ?";
            values.add(this.getCcdDiaTerEspera());
        }

        if (this.getCcdAnoTerReal() != null && this.getCcdAnoTerReal().longValue() == -999) {
            conditions += " AND CCD_ANO_TER_REAL IS NULL";
        } else if (this.getCcdAnoTerReal() != null) {
            conditions += " AND CCD_ANO_TER_REAL = ?";
            values.add(this.getCcdAnoTerReal());
        }

        if (this.getCcdMesTerReal() != null && this.getCcdMesTerReal().longValue() == -999) {
            conditions += " AND CCD_MES_TER_REAL IS NULL";
        } else if (this.getCcdMesTerReal() != null) {
            conditions += " AND CCD_MES_TER_REAL = ?";
            values.add(this.getCcdMesTerReal());
        }

        if (this.getCcdDiaTerReal() != null && this.getCcdDiaTerReal().longValue() == -999) {
            conditions += " AND CCD_DIA_TER_REAL IS NULL";
        } else if (this.getCcdDiaTerReal() != null) {
            conditions += " AND CCD_DIA_TER_REAL = ?";
            values.add(this.getCcdDiaTerReal());
        }

        if (this.getCcdAnoAltaReg() != null && this.getCcdAnoAltaReg().longValue() == -999) {
            conditions += " AND CCD_ANO_ALTA_REG IS NULL";
        } else if (this.getCcdAnoAltaReg() != null) {
            conditions += " AND CCD_ANO_ALTA_REG = ?";
            values.add(this.getCcdAnoAltaReg());
        }

        if (this.getCcdMesAltaReg() != null && this.getCcdMesAltaReg().longValue() == -999) {
            conditions += " AND CCD_MES_ALTA_REG IS NULL";
        } else if (this.getCcdMesAltaReg() != null) {
            conditions += " AND CCD_MES_ALTA_REG = ?";
            values.add(this.getCcdMesAltaReg());
        }

        if (this.getCcdDiaAltaReg() != null && this.getCcdDiaAltaReg().longValue() == -999) {
            conditions += " AND CCD_DIA_ALTA_REG IS NULL";
        } else if (this.getCcdDiaAltaReg() != null) {
            conditions += " AND CCD_DIA_ALTA_REG = ?";
            values.add(this.getCcdDiaAltaReg());
        }

        if (this.getCcdAnoUltMod() != null && this.getCcdAnoUltMod().longValue() == -999) {
            conditions += " AND CCD_ANO_ULT_MOD IS NULL";
        } else if (this.getCcdAnoUltMod() != null) {
            conditions += " AND CCD_ANO_ULT_MOD = ?";
            values.add(this.getCcdAnoUltMod());
        }

        if (this.getCcdMesUltMod() != null && this.getCcdMesUltMod().longValue() == -999) {
            conditions += " AND CCD_MES_ULT_MOD IS NULL";
        } else if (this.getCcdMesUltMod() != null) {
            conditions += " AND CCD_MES_ULT_MOD = ?";
            values.add(this.getCcdMesUltMod());
        }

        if (this.getCcdDiaUltMod() != null && this.getCcdDiaUltMod().longValue() == -999) {
            conditions += " AND CCD_DIA_ULT_MOD IS NULL";
        } else if (this.getCcdDiaUltMod() != null) {
            conditions += " AND CCD_DIA_ULT_MOD = ?";
            values.add(this.getCcdDiaUltMod());
        }

        if (this.getCcdCveStContder() != null && "null".equals(this.getCcdCveStContder())) {
            conditions += " AND CCD_CVE_ST_CONTDER IS NULL";
        } else if (this.getCcdCveStContder() != null) {
            conditions += " AND CCD_CVE_ST_CONTDER = ?";
            values.add(this.getCcdCveStContder());
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
        String sql = "UPDATE CONTDERI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CCD_NUM_CONTRATO = ?";
        pkValues.add(this.getCcdNumContrato());
        conditions += " AND CCD_NUM_SUBCOMITE = ?";
        pkValues.add(this.getCcdNumSubcomite());
        conditions += " AND CCD_NUM_REUNION = ?";
        pkValues.add(this.getCcdNumReunion());
        conditions += " AND CCD_NUM_ACUERDO = ?";
        pkValues.add(this.getCcdNumAcuerdo());
        conditions += " AND CCD_NUM_TERCERO = ?";
        pkValues.add(this.getCcdNumTercero());
        conditions += " AND CCD_ID_CTO_TERCE = ?";
        pkValues.add(this.getCcdIdCtoTerce());
        fields += " CCD_CVE_TIPO_CTO = ?, ";
        values.add(this.getCcdCveTipoCto());
        fields += " CCD_OBJETO_CTO = ?, ";
        values.add(this.getCcdObjetoCto());
        fields += " CCD_IMP_CONTRATO = ?, ";
        values.add(this.getCcdImpContrato());
        fields += " CCD_IMP_ANTICIPO = ?, ";
        values.add(this.getCcdImpAnticipo());
        fields += " CCD_IMP_AMPLIACION = ?, ";
        values.add(this.getCcdImpAmpliacion());
        fields += " CCD_PJE_ANTICIPO = ?, ";
        values.add(this.getCcdPjeAnticipo());
        fields += " CCD_PJE_AMPLIACION = ?, ";
        values.add(this.getCcdPjeAmpliacion());
        fields += " CCD_ANO_INICIO = ?, ";
        values.add(this.getCcdAnoInicio());
        fields += " CCD_MES_INICIO = ?, ";
        values.add(this.getCcdMesInicio());
        fields += " CCD_DIA_INICIO = ?, ";
        values.add(this.getCcdDiaInicio());
        fields += " CCD_ANO_TER_ESPERA = ?, ";
        values.add(this.getCcdAnoTerEspera());
        fields += " CCD_MES_TER_ESPERA = ?, ";
        values.add(this.getCcdMesTerEspera());
        fields += " CCD_DIA_TER_ESPERA = ?, ";
        values.add(this.getCcdDiaTerEspera());
        fields += " CCD_ANO_TER_REAL = ?, ";
        values.add(this.getCcdAnoTerReal());
        fields += " CCD_MES_TER_REAL = ?, ";
        values.add(this.getCcdMesTerReal());
        fields += " CCD_DIA_TER_REAL = ?, ";
        values.add(this.getCcdDiaTerReal());
        fields += " CCD_ANO_ALTA_REG = ?, ";
        values.add(this.getCcdAnoAltaReg());
        fields += " CCD_MES_ALTA_REG = ?, ";
        values.add(this.getCcdMesAltaReg());
        fields += " CCD_DIA_ALTA_REG = ?, ";
        values.add(this.getCcdDiaAltaReg());
        fields += " CCD_ANO_ULT_MOD = ?, ";
        values.add(this.getCcdAnoUltMod());
        fields += " CCD_MES_ULT_MOD = ?, ";
        values.add(this.getCcdMesUltMod());
        fields += " CCD_DIA_ULT_MOD = ?, ";
        values.add(this.getCcdDiaUltMod());
        fields += " CCD_CVE_ST_CONTDER = ?, ";
        values.add(this.getCcdCveStContder());
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
        String sql = "INSERT INTO CONTDERI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CCD_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCcdNumContrato());

        fields += ", CCD_NUM_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getCcdNumSubcomite());

        fields += ", CCD_NUM_REUNION";
        fieldValues += ", ?";
        values.add(this.getCcdNumReunion());

        fields += ", CCD_NUM_ACUERDO";
        fieldValues += ", ?";
        values.add(this.getCcdNumAcuerdo());

        fields += ", CCD_NUM_TERCERO";
        fieldValues += ", ?";
        values.add(this.getCcdNumTercero());

        fields += ", CCD_ID_CTO_TERCE";
        fieldValues += ", ?";
        values.add(this.getCcdIdCtoTerce());

        fields += ", CCD_CVE_TIPO_CTO";
        fieldValues += ", ?";
        values.add(this.getCcdCveTipoCto());

        fields += ", CCD_OBJETO_CTO";
        fieldValues += ", ?";
        values.add(this.getCcdObjetoCto());

        fields += ", CCD_IMP_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCcdImpContrato());

        fields += ", CCD_IMP_ANTICIPO";
        fieldValues += ", ?";
        values.add(this.getCcdImpAnticipo());

        fields += ", CCD_IMP_AMPLIACION";
        fieldValues += ", ?";
        values.add(this.getCcdImpAmpliacion());

        fields += ", CCD_PJE_ANTICIPO";
        fieldValues += ", ?";
        values.add(this.getCcdPjeAnticipo());

        fields += ", CCD_PJE_AMPLIACION";
        fieldValues += ", ?";
        values.add(this.getCcdPjeAmpliacion());

        fields += ", CCD_ANO_INICIO";
        fieldValues += ", ?";
        values.add(this.getCcdAnoInicio());

        fields += ", CCD_MES_INICIO";
        fieldValues += ", ?";
        values.add(this.getCcdMesInicio());

        fields += ", CCD_DIA_INICIO";
        fieldValues += ", ?";
        values.add(this.getCcdDiaInicio());

        fields += ", CCD_ANO_TER_ESPERA";
        fieldValues += ", ?";
        values.add(this.getCcdAnoTerEspera());

        fields += ", CCD_MES_TER_ESPERA";
        fieldValues += ", ?";
        values.add(this.getCcdMesTerEspera());

        fields += ", CCD_DIA_TER_ESPERA";
        fieldValues += ", ?";
        values.add(this.getCcdDiaTerEspera());

        fields += ", CCD_ANO_TER_REAL";
        fieldValues += ", ?";
        values.add(this.getCcdAnoTerReal());

        fields += ", CCD_MES_TER_REAL";
        fieldValues += ", ?";
        values.add(this.getCcdMesTerReal());

        fields += ", CCD_DIA_TER_REAL";
        fieldValues += ", ?";
        values.add(this.getCcdDiaTerReal());

        fields += ", CCD_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCcdAnoAltaReg());

        fields += ", CCD_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCcdMesAltaReg());

        fields += ", CCD_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCcdDiaAltaReg());

        fields += ", CCD_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCcdAnoUltMod());

        fields += ", CCD_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCcdMesUltMod());

        fields += ", CCD_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCcdDiaUltMod());

        fields += ", CCD_CVE_ST_CONTDER";
        fieldValues += ", ?";
        values.add(this.getCcdCveStContder());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONTDERI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CCD_NUM_CONTRATO = ?";
        values.add(this.getCcdNumContrato());
        conditions += " AND CCD_NUM_SUBCOMITE = ?";
        values.add(this.getCcdNumSubcomite());
        conditions += " AND CCD_NUM_REUNION = ?";
        values.add(this.getCcdNumReunion());
        conditions += " AND CCD_NUM_ACUERDO = ?";
        values.add(this.getCcdNumAcuerdo());
        conditions += " AND CCD_NUM_TERCERO = ?";
        values.add(this.getCcdNumTercero());
        conditions += " AND CCD_ID_CTO_TERCE = ?";
        values.add(this.getCcdIdCtoTerce());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Contderi instance = (Contderi) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCcdNumContrato().equals(instance.getCcdNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCcdNumSubcomite().equals(instance.getCcdNumSubcomite()))
            equalObjects = false;
        if (equalObjects && !this.getCcdNumReunion().equals(instance.getCcdNumReunion()))
            equalObjects = false;
        if (equalObjects && !this.getCcdNumAcuerdo().equals(instance.getCcdNumAcuerdo()))
            equalObjects = false;
        if (equalObjects && !this.getCcdNumTercero().equals(instance.getCcdNumTercero()))
            equalObjects = false;
        if (equalObjects && !this.getCcdIdCtoTerce().equals(instance.getCcdIdCtoTerce()))
            equalObjects = false;
        if (equalObjects && !this.getCcdCveTipoCto().equals(instance.getCcdCveTipoCto()))
            equalObjects = false;
        if (equalObjects && !this.getCcdObjetoCto().equals(instance.getCcdObjetoCto()))
            equalObjects = false;
        if (equalObjects && !this.getCcdImpContrato().equals(instance.getCcdImpContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCcdImpAnticipo().equals(instance.getCcdImpAnticipo()))
            equalObjects = false;
        if (equalObjects && !this.getCcdImpAmpliacion().equals(instance.getCcdImpAmpliacion()))
            equalObjects = false;
        if (equalObjects && !this.getCcdPjeAnticipo().equals(instance.getCcdPjeAnticipo()))
            equalObjects = false;
        if (equalObjects && !this.getCcdPjeAmpliacion().equals(instance.getCcdPjeAmpliacion()))
            equalObjects = false;
        if (equalObjects && !this.getCcdAnoInicio().equals(instance.getCcdAnoInicio()))
            equalObjects = false;
        if (equalObjects && !this.getCcdMesInicio().equals(instance.getCcdMesInicio()))
            equalObjects = false;
        if (equalObjects && !this.getCcdDiaInicio().equals(instance.getCcdDiaInicio()))
            equalObjects = false;
        if (equalObjects && !this.getCcdAnoTerEspera().equals(instance.getCcdAnoTerEspera()))
            equalObjects = false;
        if (equalObjects && !this.getCcdMesTerEspera().equals(instance.getCcdMesTerEspera()))
            equalObjects = false;
        if (equalObjects && !this.getCcdDiaTerEspera().equals(instance.getCcdDiaTerEspera()))
            equalObjects = false;
        if (equalObjects && !this.getCcdAnoTerReal().equals(instance.getCcdAnoTerReal()))
            equalObjects = false;
        if (equalObjects && !this.getCcdMesTerReal().equals(instance.getCcdMesTerReal()))
            equalObjects = false;
        if (equalObjects && !this.getCcdDiaTerReal().equals(instance.getCcdDiaTerReal()))
            equalObjects = false;
        if (equalObjects && !this.getCcdAnoAltaReg().equals(instance.getCcdAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCcdMesAltaReg().equals(instance.getCcdMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCcdDiaAltaReg().equals(instance.getCcdDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCcdAnoUltMod().equals(instance.getCcdAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCcdMesUltMod().equals(instance.getCcdMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCcdDiaUltMod().equals(instance.getCcdDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCcdCveStContder().equals(instance.getCcdCveStContder()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Contderi result = new Contderi();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCcdNumContrato((BigDecimal) objectData.getData("CCD_NUM_CONTRATO"));
        result.setCcdNumSubcomite((BigDecimal) objectData.getData("CCD_NUM_SUBCOMITE"));
        result.setCcdNumReunion((BigDecimal) objectData.getData("CCD_NUM_REUNION"));
        result.setCcdNumAcuerdo((BigDecimal) objectData.getData("CCD_NUM_ACUERDO"));
        result.setCcdNumTercero((BigDecimal) objectData.getData("CCD_NUM_TERCERO"));
        result.setCcdIdCtoTerce((String) objectData.getData("CCD_ID_CTO_TERCE"));
        result.setCcdCveTipoCto((String) objectData.getData("CCD_CVE_TIPO_CTO"));
        result.setCcdObjetoCto((String) objectData.getData("CCD_OBJETO_CTO"));
        result.setCcdImpContrato((BigDecimal) objectData.getData("CCD_IMP_CONTRATO"));
        result.setCcdImpAnticipo((BigDecimal) objectData.getData("CCD_IMP_ANTICIPO"));
        result.setCcdImpAmpliacion((BigDecimal) objectData.getData("CCD_IMP_AMPLIACION"));
        result.setCcdPjeAnticipo((BigDecimal) objectData.getData("CCD_PJE_ANTICIPO"));
        result.setCcdPjeAmpliacion((BigDecimal) objectData.getData("CCD_PJE_AMPLIACION"));
        result.setCcdAnoInicio((BigDecimal) objectData.getData("CCD_ANO_INICIO"));
        result.setCcdMesInicio((BigDecimal) objectData.getData("CCD_MES_INICIO"));
        result.setCcdDiaInicio((BigDecimal) objectData.getData("CCD_DIA_INICIO"));
        result.setCcdAnoTerEspera((BigDecimal) objectData.getData("CCD_ANO_TER_ESPERA"));
        result.setCcdMesTerEspera((BigDecimal) objectData.getData("CCD_MES_TER_ESPERA"));
        result.setCcdDiaTerEspera((BigDecimal) objectData.getData("CCD_DIA_TER_ESPERA"));
        result.setCcdAnoTerReal((BigDecimal) objectData.getData("CCD_ANO_TER_REAL"));
        result.setCcdMesTerReal((BigDecimal) objectData.getData("CCD_MES_TER_REAL"));
        result.setCcdDiaTerReal((BigDecimal) objectData.getData("CCD_DIA_TER_REAL"));
        result.setCcdAnoAltaReg((BigDecimal) objectData.getData("CCD_ANO_ALTA_REG"));
        result.setCcdMesAltaReg((BigDecimal) objectData.getData("CCD_MES_ALTA_REG"));
        result.setCcdDiaAltaReg((BigDecimal) objectData.getData("CCD_DIA_ALTA_REG"));
        result.setCcdAnoUltMod((BigDecimal) objectData.getData("CCD_ANO_ULT_MOD"));
        result.setCcdMesUltMod((BigDecimal) objectData.getData("CCD_MES_ULT_MOD"));
        result.setCcdDiaUltMod((BigDecimal) objectData.getData("CCD_DIA_ULT_MOD"));
        result.setCcdCveStContder((String) objectData.getData("CCD_CVE_ST_CONTDER"));

        return result;

    }

}
