package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONREPORMSA_PK", columns = { "CRE_NUM_CONTRATO", "CRE_SUB_CONTRATO", "CRE_CONTRATO_INTER", "CRE_FOLIO_REPORTO", "CRE_ENTIDAD_FIN" },
            sequences = { "MANUAL" })
public class Conrepormsa extends DomainObject {

    BigDecimal creNumContrato = null;
    BigDecimal creSubContrato = null;
    BigDecimal creEntidadFin = null;
    BigDecimal creContratoInter = null;
    BigDecimal creFolioReporto = null;
    BigDecimal creNumPlazo = null;
    BigDecimal creCveTipoMerca = null;
    BigDecimal creNumInstrume = null;
    BigDecimal creImpReporto = null;
    BigDecimal crePjeTasaPacta = null;
    BigDecimal crePremioReporto = null;
    BigDecimal creAnoVencim = null;
    BigDecimal creMesVencim = null;
    BigDecimal creDiaVencim = null;
    BigDecimal creTasaCastigo = null;
    BigDecimal creAnoVencimAnt = null;
    BigDecimal creMesVencimAnt = null;
    BigDecimal creDiaVencimAnt = null;
    BigDecimal creAnoAltaReg = null;
    BigDecimal creMesAltaReg = null;
    BigDecimal creDiaAltaReg = null;
    BigDecimal creAnoUltMod = null;
    BigDecimal creMesUltMod = null;
    BigDecimal creDiaUltMod = null;
    String creCveStConrepo = null;
    String creNomCustodio = null;
    BigDecimal creNumMoneda = null;
    BigDecimal creTipoCambio = null;

    public Conrepormsa() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCreNumContrato(BigDecimal creNumContrato) {
        this.creNumContrato = creNumContrato;
    }

    public BigDecimal getCreNumContrato() {
        return this.creNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCreSubContrato(BigDecimal creSubContrato) {
        this.creSubContrato = creSubContrato;
    }

    public BigDecimal getCreSubContrato() {
        return this.creSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCreEntidadFin(BigDecimal creEntidadFin) {
        this.creEntidadFin = creEntidadFin;
    }

    public BigDecimal getCreEntidadFin() {
        return this.creEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCreContratoInter(BigDecimal creContratoInter) {
        this.creContratoInter = creContratoInter;
    }

    public BigDecimal getCreContratoInter() {
        return this.creContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCreFolioReporto(BigDecimal creFolioReporto) {
        this.creFolioReporto = creFolioReporto;
    }

    public BigDecimal getCreFolioReporto() {
        return this.creFolioReporto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCreNumPlazo(BigDecimal creNumPlazo) {
        this.creNumPlazo = creNumPlazo;
    }

    public BigDecimal getCreNumPlazo() {
        return this.creNumPlazo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCreCveTipoMerca(BigDecimal creCveTipoMerca) {
        this.creCveTipoMerca = creCveTipoMerca;
    }

    public BigDecimal getCreCveTipoMerca() {
        return this.creCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCreNumInstrume(BigDecimal creNumInstrume) {
        this.creNumInstrume = creNumInstrume;
    }

    public BigDecimal getCreNumInstrume() {
        return this.creNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCreImpReporto(BigDecimal creImpReporto) {
        this.creImpReporto = creImpReporto;
    }

    public BigDecimal getCreImpReporto() {
        return this.creImpReporto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setCrePjeTasaPacta(BigDecimal crePjeTasaPacta) {
        this.crePjeTasaPacta = crePjeTasaPacta;
    }

    public BigDecimal getCrePjeTasaPacta() {
        return this.crePjeTasaPacta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCrePremioReporto(BigDecimal crePremioReporto) {
        this.crePremioReporto = crePremioReporto;
    }

    public BigDecimal getCrePremioReporto() {
        return this.crePremioReporto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCreAnoVencim(BigDecimal creAnoVencim) {
        this.creAnoVencim = creAnoVencim;
    }

    public BigDecimal getCreAnoVencim() {
        return this.creAnoVencim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCreMesVencim(BigDecimal creMesVencim) {
        this.creMesVencim = creMesVencim;
    }

    public BigDecimal getCreMesVencim() {
        return this.creMesVencim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCreDiaVencim(BigDecimal creDiaVencim) {
        this.creDiaVencim = creDiaVencim;
    }

    public BigDecimal getCreDiaVencim() {
        return this.creDiaVencim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setCreTasaCastigo(BigDecimal creTasaCastigo) {
        this.creTasaCastigo = creTasaCastigo;
    }

    public BigDecimal getCreTasaCastigo() {
        return this.creTasaCastigo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCreAnoVencimAnt(BigDecimal creAnoVencimAnt) {
        this.creAnoVencimAnt = creAnoVencimAnt;
    }

    public BigDecimal getCreAnoVencimAnt() {
        return this.creAnoVencimAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCreMesVencimAnt(BigDecimal creMesVencimAnt) {
        this.creMesVencimAnt = creMesVencimAnt;
    }

    public BigDecimal getCreMesVencimAnt() {
        return this.creMesVencimAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCreDiaVencimAnt(BigDecimal creDiaVencimAnt) {
        this.creDiaVencimAnt = creDiaVencimAnt;
    }

    public BigDecimal getCreDiaVencimAnt() {
        return this.creDiaVencimAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCreAnoAltaReg(BigDecimal creAnoAltaReg) {
        this.creAnoAltaReg = creAnoAltaReg;
    }

    public BigDecimal getCreAnoAltaReg() {
        return this.creAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCreMesAltaReg(BigDecimal creMesAltaReg) {
        this.creMesAltaReg = creMesAltaReg;
    }

    public BigDecimal getCreMesAltaReg() {
        return this.creMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCreDiaAltaReg(BigDecimal creDiaAltaReg) {
        this.creDiaAltaReg = creDiaAltaReg;
    }

    public BigDecimal getCreDiaAltaReg() {
        return this.creDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCreAnoUltMod(BigDecimal creAnoUltMod) {
        this.creAnoUltMod = creAnoUltMod;
    }

    public BigDecimal getCreAnoUltMod() {
        return this.creAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCreMesUltMod(BigDecimal creMesUltMod) {
        this.creMesUltMod = creMesUltMod;
    }

    public BigDecimal getCreMesUltMod() {
        return this.creMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCreDiaUltMod(BigDecimal creDiaUltMod) {
        this.creDiaUltMod = creDiaUltMod;
    }

    public BigDecimal getCreDiaUltMod() {
        return this.creDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCreCveStConrepo(String creCveStConrepo) {
        this.creCveStConrepo = creCveStConrepo;
    }

    public String getCreCveStConrepo() {
        return this.creCveStConrepo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCreNomCustodio(String creNomCustodio) {
        this.creNomCustodio = creNomCustodio;
    }

    public String getCreNomCustodio() {
        return this.creNomCustodio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCreNumMoneda(BigDecimal creNumMoneda) {
        this.creNumMoneda = creNumMoneda;
    }

    public BigDecimal getCreNumMoneda() {
        return this.creNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setCreTipoCambio(BigDecimal creTipoCambio) {
        this.creTipoCambio = creTipoCambio;
    }

    public BigDecimal getCreTipoCambio() {
        return this.creTipoCambio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONREPORMSA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCreNumContrato() != null && this.getCreNumContrato().longValue() == -999) {
            conditions += " AND CRE_NUM_CONTRATO IS NULL";
        } else if (this.getCreNumContrato() != null) {
            conditions += " AND CRE_NUM_CONTRATO = ?";
            values.add(this.getCreNumContrato());
        }

        if (this.getCreSubContrato() != null && this.getCreSubContrato().longValue() == -999) {
            conditions += " AND CRE_SUB_CONTRATO IS NULL";
        } else if (this.getCreSubContrato() != null) {
            conditions += " AND CRE_SUB_CONTRATO = ?";
            values.add(this.getCreSubContrato());
        }

        if (this.getCreEntidadFin() != null && this.getCreEntidadFin().longValue() == -999) {
            conditions += " AND CRE_ENTIDAD_FIN IS NULL";
        } else if (this.getCreEntidadFin() != null) {
            conditions += " AND CRE_ENTIDAD_FIN = ?";
            values.add(this.getCreEntidadFin());
        }

        if (this.getCreContratoInter() != null && this.getCreContratoInter().longValue() == -999) {
            conditions += " AND CRE_CONTRATO_INTER IS NULL";
        } else if (this.getCreContratoInter() != null) {
            conditions += " AND CRE_CONTRATO_INTER = ?";
            values.add(this.getCreContratoInter());
        }

        if (this.getCreFolioReporto() != null && this.getCreFolioReporto().longValue() == -999) {
            conditions += " AND CRE_FOLIO_REPORTO IS NULL";
        } else if (this.getCreFolioReporto() != null) {
            conditions += " AND CRE_FOLIO_REPORTO = ?";
            values.add(this.getCreFolioReporto());
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
        String sql = "SELECT * FROM CONREPORMSA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCreNumContrato() != null && this.getCreNumContrato().longValue() == -999) {
            conditions += " AND CRE_NUM_CONTRATO IS NULL";
        } else if (this.getCreNumContrato() != null) {
            conditions += " AND CRE_NUM_CONTRATO = ?";
            values.add(this.getCreNumContrato());
        }

        if (this.getCreSubContrato() != null && this.getCreSubContrato().longValue() == -999) {
            conditions += " AND CRE_SUB_CONTRATO IS NULL";
        } else if (this.getCreSubContrato() != null) {
            conditions += " AND CRE_SUB_CONTRATO = ?";
            values.add(this.getCreSubContrato());
        }

        if (this.getCreEntidadFin() != null && this.getCreEntidadFin().longValue() == -999) {
            conditions += " AND CRE_ENTIDAD_FIN IS NULL";
        } else if (this.getCreEntidadFin() != null) {
            conditions += " AND CRE_ENTIDAD_FIN = ?";
            values.add(this.getCreEntidadFin());
        }

        if (this.getCreContratoInter() != null && this.getCreContratoInter().longValue() == -999) {
            conditions += " AND CRE_CONTRATO_INTER IS NULL";
        } else if (this.getCreContratoInter() != null) {
            conditions += " AND CRE_CONTRATO_INTER = ?";
            values.add(this.getCreContratoInter());
        }

        if (this.getCreFolioReporto() != null && this.getCreFolioReporto().longValue() == -999) {
            conditions += " AND CRE_FOLIO_REPORTO IS NULL";
        } else if (this.getCreFolioReporto() != null) {
            conditions += " AND CRE_FOLIO_REPORTO = ?";
            values.add(this.getCreFolioReporto());
        }

        if (this.getCreNumPlazo() != null && this.getCreNumPlazo().longValue() == -999) {
            conditions += " AND CRE_NUM_PLAZO IS NULL";
        } else if (this.getCreNumPlazo() != null) {
            conditions += " AND CRE_NUM_PLAZO = ?";
            values.add(this.getCreNumPlazo());
        }

        if (this.getCreCveTipoMerca() != null && this.getCreCveTipoMerca().longValue() == -999) {
            conditions += " AND CRE_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCreCveTipoMerca() != null) {
            conditions += " AND CRE_CVE_TIPO_MERCA = ?";
            values.add(this.getCreCveTipoMerca());
        }

        if (this.getCreNumInstrume() != null && this.getCreNumInstrume().longValue() == -999) {
            conditions += " AND CRE_NUM_INSTRUME IS NULL";
        } else if (this.getCreNumInstrume() != null) {
            conditions += " AND CRE_NUM_INSTRUME = ?";
            values.add(this.getCreNumInstrume());
        }

        if (this.getCreImpReporto() != null && this.getCreImpReporto().longValue() == -999) {
            conditions += " AND CRE_IMP_REPORTO IS NULL";
        } else if (this.getCreImpReporto() != null) {
            conditions += " AND CRE_IMP_REPORTO = ?";
            values.add(this.getCreImpReporto());
        }

        if (this.getCrePjeTasaPacta() != null && this.getCrePjeTasaPacta().longValue() == -999) {
            conditions += " AND CRE_PJE_TASA_PACTA IS NULL";
        } else if (this.getCrePjeTasaPacta() != null) {
            conditions += " AND CRE_PJE_TASA_PACTA = ?";
            values.add(this.getCrePjeTasaPacta());
        }

        if (this.getCrePremioReporto() != null && this.getCrePremioReporto().longValue() == -999) {
            conditions += " AND CRE_PREMIO_REPORTO IS NULL";
        } else if (this.getCrePremioReporto() != null) {
            conditions += " AND CRE_PREMIO_REPORTO = ?";
            values.add(this.getCrePremioReporto());
        }

        if (this.getCreAnoVencim() != null && this.getCreAnoVencim().longValue() == -999) {
            conditions += " AND CRE_ANO_VENCIM IS NULL";
        } else if (this.getCreAnoVencim() != null) {
            conditions += " AND CRE_ANO_VENCIM = ?";
            values.add(this.getCreAnoVencim());
        }

        if (this.getCreMesVencim() != null && this.getCreMesVencim().longValue() == -999) {
            conditions += " AND CRE_MES_VENCIM IS NULL";
        } else if (this.getCreMesVencim() != null) {
            conditions += " AND CRE_MES_VENCIM = ?";
            values.add(this.getCreMesVencim());
        }

        if (this.getCreDiaVencim() != null && this.getCreDiaVencim().longValue() == -999) {
            conditions += " AND CRE_DIA_VENCIM IS NULL";
        } else if (this.getCreDiaVencim() != null) {
            conditions += " AND CRE_DIA_VENCIM = ?";
            values.add(this.getCreDiaVencim());
        }

        if (this.getCreTasaCastigo() != null && this.getCreTasaCastigo().longValue() == -999) {
            conditions += " AND CRE_TASA_CASTIGO IS NULL";
        } else if (this.getCreTasaCastigo() != null) {
            conditions += " AND CRE_TASA_CASTIGO = ?";
            values.add(this.getCreTasaCastigo());
        }

        if (this.getCreAnoVencimAnt() != null && this.getCreAnoVencimAnt().longValue() == -999) {
            conditions += " AND CRE_ANO_VENCIM_ANT IS NULL";
        } else if (this.getCreAnoVencimAnt() != null) {
            conditions += " AND CRE_ANO_VENCIM_ANT = ?";
            values.add(this.getCreAnoVencimAnt());
        }

        if (this.getCreMesVencimAnt() != null && this.getCreMesVencimAnt().longValue() == -999) {
            conditions += " AND CRE_MES_VENCIM_ANT IS NULL";
        } else if (this.getCreMesVencimAnt() != null) {
            conditions += " AND CRE_MES_VENCIM_ANT = ?";
            values.add(this.getCreMesVencimAnt());
        }

        if (this.getCreDiaVencimAnt() != null && this.getCreDiaVencimAnt().longValue() == -999) {
            conditions += " AND CRE_DIA_VENCIM_ANT IS NULL";
        } else if (this.getCreDiaVencimAnt() != null) {
            conditions += " AND CRE_DIA_VENCIM_ANT = ?";
            values.add(this.getCreDiaVencimAnt());
        }

        if (this.getCreAnoAltaReg() != null && this.getCreAnoAltaReg().longValue() == -999) {
            conditions += " AND CRE_ANO_ALTA_REG IS NULL";
        } else if (this.getCreAnoAltaReg() != null) {
            conditions += " AND CRE_ANO_ALTA_REG = ?";
            values.add(this.getCreAnoAltaReg());
        }

        if (this.getCreMesAltaReg() != null && this.getCreMesAltaReg().longValue() == -999) {
            conditions += " AND CRE_MES_ALTA_REG IS NULL";
        } else if (this.getCreMesAltaReg() != null) {
            conditions += " AND CRE_MES_ALTA_REG = ?";
            values.add(this.getCreMesAltaReg());
        }

        if (this.getCreDiaAltaReg() != null && this.getCreDiaAltaReg().longValue() == -999) {
            conditions += " AND CRE_DIA_ALTA_REG IS NULL";
        } else if (this.getCreDiaAltaReg() != null) {
            conditions += " AND CRE_DIA_ALTA_REG = ?";
            values.add(this.getCreDiaAltaReg());
        }

        if (this.getCreAnoUltMod() != null && this.getCreAnoUltMod().longValue() == -999) {
            conditions += " AND CRE_ANO_ULT_MOD IS NULL";
        } else if (this.getCreAnoUltMod() != null) {
            conditions += " AND CRE_ANO_ULT_MOD = ?";
            values.add(this.getCreAnoUltMod());
        }

        if (this.getCreMesUltMod() != null && this.getCreMesUltMod().longValue() == -999) {
            conditions += " AND CRE_MES_ULT_MOD IS NULL";
        } else if (this.getCreMesUltMod() != null) {
            conditions += " AND CRE_MES_ULT_MOD = ?";
            values.add(this.getCreMesUltMod());
        }

        if (this.getCreDiaUltMod() != null && this.getCreDiaUltMod().longValue() == -999) {
            conditions += " AND CRE_DIA_ULT_MOD IS NULL";
        } else if (this.getCreDiaUltMod() != null) {
            conditions += " AND CRE_DIA_ULT_MOD = ?";
            values.add(this.getCreDiaUltMod());
        }

        if (this.getCreCveStConrepo() != null && "null".equals(this.getCreCveStConrepo())) {
            conditions += " AND CRE_CVE_ST_CONREPO IS NULL";
        } else if (this.getCreCveStConrepo() != null) {
            conditions += " AND CRE_CVE_ST_CONREPO = ?";
            values.add(this.getCreCveStConrepo());
        }

        if (this.getCreNomCustodio() != null && "null".equals(this.getCreNomCustodio())) {
            conditions += " AND CRE_NOM_CUSTODIO IS NULL";
        } else if (this.getCreNomCustodio() != null) {
            conditions += " AND CRE_NOM_CUSTODIO = ?";
            values.add(this.getCreNomCustodio());
        }

        if (this.getCreNumMoneda() != null && this.getCreNumMoneda().longValue() == -999) {
            conditions += " AND CRE_NUM_MONEDA IS NULL";
        } else if (this.getCreNumMoneda() != null) {
            conditions += " AND CRE_NUM_MONEDA = ?";
            values.add(this.getCreNumMoneda());
        }

        if (this.getCreTipoCambio() != null && this.getCreTipoCambio().longValue() == -999) {
            conditions += " AND CRE_TIPO_CAMBIO IS NULL";
        } else if (this.getCreTipoCambio() != null) {
            conditions += " AND CRE_TIPO_CAMBIO = ?";
            values.add(this.getCreTipoCambio());
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
        String sql = "UPDATE CONREPORMSA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CRE_NUM_CONTRATO = ?";
        pkValues.add(this.getCreNumContrato());
        conditions += " AND CRE_SUB_CONTRATO = ?";
        pkValues.add(this.getCreSubContrato());
        conditions += " AND CRE_ENTIDAD_FIN = ?";
        pkValues.add(this.getCreEntidadFin());
        conditions += " AND CRE_CONTRATO_INTER = ?";
        pkValues.add(this.getCreContratoInter());
        conditions += " AND CRE_FOLIO_REPORTO = ?";
        pkValues.add(this.getCreFolioReporto());
        fields += " CRE_NUM_PLAZO = ?, ";
        values.add(this.getCreNumPlazo());
        fields += " CRE_CVE_TIPO_MERCA = ?, ";
        values.add(this.getCreCveTipoMerca());
        fields += " CRE_NUM_INSTRUME = ?, ";
        values.add(this.getCreNumInstrume());
        fields += " CRE_IMP_REPORTO = ?, ";
        values.add(this.getCreImpReporto());
        fields += " CRE_PJE_TASA_PACTA = ?, ";
        values.add(this.getCrePjeTasaPacta());
        fields += " CRE_PREMIO_REPORTO = ?, ";
        values.add(this.getCrePremioReporto());
        fields += " CRE_ANO_VENCIM = ?, ";
        values.add(this.getCreAnoVencim());
        fields += " CRE_MES_VENCIM = ?, ";
        values.add(this.getCreMesVencim());
        fields += " CRE_DIA_VENCIM = ?, ";
        values.add(this.getCreDiaVencim());
        fields += " CRE_TASA_CASTIGO = ?, ";
        values.add(this.getCreTasaCastigo());
        fields += " CRE_ANO_VENCIM_ANT = ?, ";
        values.add(this.getCreAnoVencimAnt());
        fields += " CRE_MES_VENCIM_ANT = ?, ";
        values.add(this.getCreMesVencimAnt());
        fields += " CRE_DIA_VENCIM_ANT = ?, ";
        values.add(this.getCreDiaVencimAnt());
        fields += " CRE_ANO_ALTA_REG = ?, ";
        values.add(this.getCreAnoAltaReg());
        fields += " CRE_MES_ALTA_REG = ?, ";
        values.add(this.getCreMesAltaReg());
        fields += " CRE_DIA_ALTA_REG = ?, ";
        values.add(this.getCreDiaAltaReg());
        fields += " CRE_ANO_ULT_MOD = ?, ";
        values.add(this.getCreAnoUltMod());
        fields += " CRE_MES_ULT_MOD = ?, ";
        values.add(this.getCreMesUltMod());
        fields += " CRE_DIA_ULT_MOD = ?, ";
        values.add(this.getCreDiaUltMod());
        fields += " CRE_CVE_ST_CONREPO = ?, ";
        values.add(this.getCreCveStConrepo());
        fields += " CRE_NOM_CUSTODIO = ?, ";
        values.add(this.getCreNomCustodio());
        fields += " CRE_NUM_MONEDA = ?, ";
        values.add(this.getCreNumMoneda());
        fields += " CRE_TIPO_CAMBIO = ?, ";
        values.add(this.getCreTipoCambio());
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
        String sql = "INSERT INTO CONREPORMSA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CRE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCreNumContrato());

        fields += ", CRE_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCreSubContrato());

        fields += ", CRE_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getCreEntidadFin());

        fields += ", CRE_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getCreContratoInter());

        fields += ", CRE_FOLIO_REPORTO";
        fieldValues += ", ?";
        values.add(this.getCreFolioReporto());

        fields += ", CRE_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getCreNumPlazo());

        fields += ", CRE_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getCreCveTipoMerca());

        fields += ", CRE_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getCreNumInstrume());

        fields += ", CRE_IMP_REPORTO";
        fieldValues += ", ?";
        values.add(this.getCreImpReporto());

        fields += ", CRE_PJE_TASA_PACTA";
        fieldValues += ", ?";
        values.add(this.getCrePjeTasaPacta());

        fields += ", CRE_PREMIO_REPORTO";
        fieldValues += ", ?";
        values.add(this.getCrePremioReporto());

        fields += ", CRE_ANO_VENCIM";
        fieldValues += ", ?";
        values.add(this.getCreAnoVencim());

        fields += ", CRE_MES_VENCIM";
        fieldValues += ", ?";
        values.add(this.getCreMesVencim());

        fields += ", CRE_DIA_VENCIM";
        fieldValues += ", ?";
        values.add(this.getCreDiaVencim());

        fields += ", CRE_TASA_CASTIGO";
        fieldValues += ", ?";
        values.add(this.getCreTasaCastigo());

        fields += ", CRE_ANO_VENCIM_ANT";
        fieldValues += ", ?";
        values.add(this.getCreAnoVencimAnt());

        fields += ", CRE_MES_VENCIM_ANT";
        fieldValues += ", ?";
        values.add(this.getCreMesVencimAnt());

        fields += ", CRE_DIA_VENCIM_ANT";
        fieldValues += ", ?";
        values.add(this.getCreDiaVencimAnt());

        fields += ", CRE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCreAnoAltaReg());

        fields += ", CRE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCreMesAltaReg());

        fields += ", CRE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCreDiaAltaReg());

        fields += ", CRE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCreAnoUltMod());

        fields += ", CRE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCreMesUltMod());

        fields += ", CRE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCreDiaUltMod());

        fields += ", CRE_CVE_ST_CONREPO";
        fieldValues += ", ?";
        values.add(this.getCreCveStConrepo());

        fields += ", CRE_NOM_CUSTODIO";
        fieldValues += ", ?";
        values.add(this.getCreNomCustodio());

        fields += ", CRE_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getCreNumMoneda());

        fields += ", CRE_TIPO_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getCreTipoCambio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONREPORMSA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CRE_NUM_CONTRATO = ?";
        values.add(this.getCreNumContrato());
        conditions += " AND CRE_SUB_CONTRATO = ?";
        values.add(this.getCreSubContrato());
        conditions += " AND CRE_ENTIDAD_FIN = ?";
        values.add(this.getCreEntidadFin());
        conditions += " AND CRE_CONTRATO_INTER = ?";
        values.add(this.getCreContratoInter());
        conditions += " AND CRE_FOLIO_REPORTO = ?";
        values.add(this.getCreFolioReporto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Conrepormsa instance = (Conrepormsa) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCreNumContrato().equals(instance.getCreNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCreSubContrato().equals(instance.getCreSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCreEntidadFin().equals(instance.getCreEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getCreContratoInter().equals(instance.getCreContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getCreFolioReporto().equals(instance.getCreFolioReporto()))
            equalObjects = false;
        if (equalObjects && !this.getCreNumPlazo().equals(instance.getCreNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getCreCveTipoMerca().equals(instance.getCreCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getCreNumInstrume().equals(instance.getCreNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getCreImpReporto().equals(instance.getCreImpReporto()))
            equalObjects = false;
        if (equalObjects && !this.getCrePjeTasaPacta().equals(instance.getCrePjeTasaPacta()))
            equalObjects = false;
        if (equalObjects && !this.getCrePremioReporto().equals(instance.getCrePremioReporto()))
            equalObjects = false;
        if (equalObjects && !this.getCreAnoVencim().equals(instance.getCreAnoVencim()))
            equalObjects = false;
        if (equalObjects && !this.getCreMesVencim().equals(instance.getCreMesVencim()))
            equalObjects = false;
        if (equalObjects && !this.getCreDiaVencim().equals(instance.getCreDiaVencim()))
            equalObjects = false;
        if (equalObjects && !this.getCreTasaCastigo().equals(instance.getCreTasaCastigo()))
            equalObjects = false;
        if (equalObjects && !this.getCreAnoVencimAnt().equals(instance.getCreAnoVencimAnt()))
            equalObjects = false;
        if (equalObjects && !this.getCreMesVencimAnt().equals(instance.getCreMesVencimAnt()))
            equalObjects = false;
        if (equalObjects && !this.getCreDiaVencimAnt().equals(instance.getCreDiaVencimAnt()))
            equalObjects = false;
        if (equalObjects && !this.getCreAnoAltaReg().equals(instance.getCreAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCreMesAltaReg().equals(instance.getCreMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCreDiaAltaReg().equals(instance.getCreDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCreAnoUltMod().equals(instance.getCreAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCreMesUltMod().equals(instance.getCreMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCreDiaUltMod().equals(instance.getCreDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCreCveStConrepo().equals(instance.getCreCveStConrepo()))
            equalObjects = false;
        if (equalObjects && !this.getCreNomCustodio().equals(instance.getCreNomCustodio()))
            equalObjects = false;
        if (equalObjects && !this.getCreNumMoneda().equals(instance.getCreNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getCreTipoCambio().equals(instance.getCreTipoCambio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Conrepormsa result = new Conrepormsa();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCreNumContrato((BigDecimal) objectData.getData("CRE_NUM_CONTRATO"));
        result.setCreSubContrato((BigDecimal) objectData.getData("CRE_SUB_CONTRATO"));
        result.setCreEntidadFin((BigDecimal) objectData.getData("CRE_ENTIDAD_FIN"));
        result.setCreContratoInter((BigDecimal) objectData.getData("CRE_CONTRATO_INTER"));
        result.setCreFolioReporto((BigDecimal) objectData.getData("CRE_FOLIO_REPORTO"));
        result.setCreNumPlazo((BigDecimal) objectData.getData("CRE_NUM_PLAZO"));
        result.setCreCveTipoMerca((BigDecimal) objectData.getData("CRE_CVE_TIPO_MERCA"));
        result.setCreNumInstrume((BigDecimal) objectData.getData("CRE_NUM_INSTRUME"));
        result.setCreImpReporto((BigDecimal) objectData.getData("CRE_IMP_REPORTO"));
        result.setCrePjeTasaPacta((BigDecimal) objectData.getData("CRE_PJE_TASA_PACTA"));
        result.setCrePremioReporto((BigDecimal) objectData.getData("CRE_PREMIO_REPORTO"));
        result.setCreAnoVencim((BigDecimal) objectData.getData("CRE_ANO_VENCIM"));
        result.setCreMesVencim((BigDecimal) objectData.getData("CRE_MES_VENCIM"));
        result.setCreDiaVencim((BigDecimal) objectData.getData("CRE_DIA_VENCIM"));
        result.setCreTasaCastigo((BigDecimal) objectData.getData("CRE_TASA_CASTIGO"));
        result.setCreAnoVencimAnt((BigDecimal) objectData.getData("CRE_ANO_VENCIM_ANT"));
        result.setCreMesVencimAnt((BigDecimal) objectData.getData("CRE_MES_VENCIM_ANT"));
        result.setCreDiaVencimAnt((BigDecimal) objectData.getData("CRE_DIA_VENCIM_ANT"));
        result.setCreAnoAltaReg((BigDecimal) objectData.getData("CRE_ANO_ALTA_REG"));
        result.setCreMesAltaReg((BigDecimal) objectData.getData("CRE_MES_ALTA_REG"));
        result.setCreDiaAltaReg((BigDecimal) objectData.getData("CRE_DIA_ALTA_REG"));
        result.setCreAnoUltMod((BigDecimal) objectData.getData("CRE_ANO_ULT_MOD"));
        result.setCreMesUltMod((BigDecimal) objectData.getData("CRE_MES_ULT_MOD"));
        result.setCreDiaUltMod((BigDecimal) objectData.getData("CRE_DIA_ULT_MOD"));
        result.setCreCveStConrepo((String) objectData.getData("CRE_CVE_ST_CONREPO"));
        result.setCreNomCustodio((String) objectData.getData("CRE_NOM_CUSTODIO"));
        result.setCreNumMoneda((BigDecimal) objectData.getData("CRE_NUM_MONEDA"));
        result.setCreTipoCambio((BigDecimal) objectData.getData("CRE_TIPO_CAMBIO"));

        return result;

    }

}
