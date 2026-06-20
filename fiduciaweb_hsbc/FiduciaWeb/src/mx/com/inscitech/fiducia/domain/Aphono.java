package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;

@PrimaryKey(constraintName = "PACAHON_PK", columns = { "PAC_NUM_CONTRATO" }, sequences = { "MAX" })
public class Aphono extends DomainObject {
    
    BigDecimal pacNumContrato = null;
    String pacCveFormaCalc = null;
    BigDecimal pacCveImpFijo = null;
    BigDecimal pacCvePjePacta = null;
    BigDecimal pacCveExento = null;
    BigDecimal pacCveManMonEx = null;
    BigDecimal pacCveExtemp = null;
    String pacCvePeriodCob = null;
    String pacCvePersCob = null;
    BigDecimal pacCveTabCalc = null;
    BigDecimal pacCvePjeMillar = null;
    BigDecimal pacDiaCalcClte = null;
    BigDecimal pacAnoCalcHono = null;
    BigDecimal pacMesCalcHono = null;
    BigDecimal pacDiaCalcHono = null;
    String pacFecUltCalc = null;
    BigDecimal pacDiasCalcHono = null;
    BigDecimal pacAnoUltRevis = null;
    BigDecimal pacMesUltRevis = null;
    BigDecimal pacDiaUltRevis = null;
    BigDecimal pacNumMoneda = null;
    BigDecimal pacNumTablaHono = null;
    BigDecimal pacImpFijoHono = null;
    BigDecimal pacImpMinHono = null;
    BigDecimal pacImpAdicHono = null;
    BigDecimal pacPjePactaHono = null;
    BigDecimal pacPjeDesctoHon = null;
    BigDecimal pacPjeIncremHon = null;
    BigDecimal pacPjeAjuAnual = null;
    String pacTexFundamento = null;
    BigDecimal pacImpAceptacion = null;
    BigDecimal pacImpMaximo = null;
    BigDecimal pacAnoAltaReg = null;
    BigDecimal pacMesAltaReg = null;
    BigDecimal pacDiaAltaReg = null;
    BigDecimal pacAnoUltMod = null;
    BigDecimal pacMesUltMod = null;
    BigDecimal pacDiaUltMod = null;
    String pacCveStPacahon = null;
    BigDecimal pacCtoInver = null;
    BigDecimal pacIntermed = null;
    BigDecimal pacInpc = null;
    String pacPeriodoActInpc = null;
    BigDecimal pacCpi = null;
    BigDecimal pacDiez = null;
    BigDecimal pacUdi = null;
    BigDecimal pacSinAct = null;
    String pacImpFijoPerAct = null;
    String ahoCveEstado = null;
    String ahoNumOper = null;

    public Aphono() {
        super();
        this.pkColumns = 8;
    }

    public void setPacNumContrato(BigDecimal pacNumContrato) {
        this.pacNumContrato = pacNumContrato;
    }

    public void setPacCveFormaCalc(String pacCveFormaCalc) {
        this.pacCveFormaCalc = pacCveFormaCalc;
    }

    public void setPacCveImpFijo(BigDecimal pacCveImpFijo) {
        this.pacCveImpFijo = pacCveImpFijo;
    }

    public void setPacCvePjePacta(BigDecimal pacCvePjePacta) {
        this.pacCvePjePacta = pacCvePjePacta;
    }

    public void setPacCveExento(BigDecimal pacCveExento) {
        this.pacCveExento = pacCveExento;
    }

    public void setPacCveManMonEx(BigDecimal pacCveManMonEx) {
        this.pacCveManMonEx = pacCveManMonEx;
    }

    public void setPacCveExtemp(BigDecimal pacCveExtemp) {
        this.pacCveExtemp = pacCveExtemp;
    }

    public void setPacCvePeriodCob(String pacCvePeriodCob) {
        this.pacCvePeriodCob = pacCvePeriodCob;
    }

    public void setPacCvePersCob(String pacCvePersCob) {
        this.pacCvePersCob = pacCvePersCob;
    }

    public void setPacCveTabCalc(BigDecimal pacCveTabCalc) {
        this.pacCveTabCalc = pacCveTabCalc;
    }

    public void setPacCvePjeMillar(BigDecimal pacCvePjeMillar) {
        this.pacCvePjeMillar = pacCvePjeMillar;
    }

    public void setPacDiaCalcClte(BigDecimal pacDiaCalcClte) {
        this.pacDiaCalcClte = pacDiaCalcClte;
    }

    public void setPacAnoCalcHono(BigDecimal pacAnoCalcHono) {
        this.pacAnoCalcHono = pacAnoCalcHono;
    }

    public void setPacMesCalcHono(BigDecimal pacMesCalcHono) {
        this.pacMesCalcHono = pacMesCalcHono;
    }

    public void setPacDiaCalcHono(BigDecimal pacDiaCalcHono) {
        this.pacDiaCalcHono = pacDiaCalcHono;
    }

    public void setPacFecUltCalc(String pacFecUltCalc) {
        this.pacFecUltCalc = pacFecUltCalc;
    }

    public void setPacDiasCalcHono(BigDecimal pacDiasCalcHono) {
        this.pacDiasCalcHono = pacDiasCalcHono;
    }

    public void setPacAnoUltRevis(BigDecimal pacAnoUltRevis) {
        this.pacAnoUltRevis = pacAnoUltRevis;
    }

    public void setPacMesUltRevis(BigDecimal pacMesUltRevis) {
        this.pacMesUltRevis = pacMesUltRevis;
    }

    public void setPacDiaUltRevis(BigDecimal pacDiaUltRevis) {
        this.pacDiaUltRevis = pacDiaUltRevis;
    }

    public void setPacNumMoneda(BigDecimal pacNumMoneda) {
        this.pacNumMoneda = pacNumMoneda;
    }

    public void setPacNumTablaHono(BigDecimal pacNumTablaHono) {
        this.pacNumTablaHono = pacNumTablaHono;
    }

    public void setPacImpFijoHono(BigDecimal pacImpFijoHono) {
        this.pacImpFijoHono = pacImpFijoHono;
    }

    public void setPacImpMinHono(BigDecimal pacImpMinHono) {
        this.pacImpMinHono = pacImpMinHono;
    }

    public void setPacImpAdicHono(BigDecimal pacImpAdicHono) {
        this.pacImpAdicHono = pacImpAdicHono;
    }

    public void setPacPjePactaHono(BigDecimal pacPjePactaHono) {
        this.pacPjePactaHono = pacPjePactaHono;
    }

    public void setPacPjeDesctoHon(BigDecimal pacPjeDesctoHon) {
        this.pacPjeDesctoHon = pacPjeDesctoHon;
    }

    public void setPacPjeIncremHon(BigDecimal pacPjeIncremHon) {
        this.pacPjeIncremHon = pacPjeIncremHon;
    }

    public void setPacPjeAjuAnual(BigDecimal pacPjeAjuAnual) {
        this.pacPjeAjuAnual = pacPjeAjuAnual;
    }

    public void setPacTexFundamento(String pacTexFundamento) {
        this.pacTexFundamento = pacTexFundamento;
    }

    public void setPacImpAceptacion(BigDecimal pacImpAceptacion) {
        this.pacImpAceptacion = pacImpAceptacion;
    }

    public void setPacImpMaximo(BigDecimal pacImpMaximo) {
        this.pacImpMaximo = pacImpMaximo;
    }

    public void setPacAnoAltaReg(BigDecimal pacAnoAltaReg) {
        this.pacAnoAltaReg = pacAnoAltaReg;
    }

    public void setPacMesAltaReg(BigDecimal pacMesAltaReg) {
        this.pacMesAltaReg = pacMesAltaReg;
    }

    public void setPacDiaAltaReg(BigDecimal pacDiaAltaReg) {
        this.pacDiaAltaReg = pacDiaAltaReg;
    }

    public void setPacAnoUltMod(BigDecimal pacAnoUltMod) {
        this.pacAnoUltMod = pacAnoUltMod;
    }

    public void setPacMesUltMod(BigDecimal pacMesUltMod) {
        this.pacMesUltMod = pacMesUltMod;
    }

    public void setPacDiaUltMod(BigDecimal pacDiaUltMod) {
        this.pacDiaUltMod = pacDiaUltMod;
    }

    public void setPacCveStPacahon(String pacCveStPacahon) {
        this.pacCveStPacahon = pacCveStPacahon;
    }

    public void setPacCtoInver(BigDecimal pacCtoInver) {
        this.pacCtoInver = pacCtoInver;
    }

    public void setPacIntermed(BigDecimal pacIntermed) {
        this.pacIntermed = pacIntermed;
    }

    public void setPacInpc(BigDecimal pacInpc) {
        this.pacInpc = pacInpc;
    }

    public void setPacPeriodoActInpc(String pacPeriodoActInpc) {
        this.pacPeriodoActInpc = pacPeriodoActInpc;
    }

    public void setPacCpi(BigDecimal pacCpi) {
        this.pacCpi = pacCpi;
    }

    public void setPacDiez(BigDecimal pacDiez) {
        this.pacDiez = pacDiez;
    }

    public void setPacUdi(BigDecimal pacUdi) {
        this.pacUdi = pacUdi;
    }

    public void setPacSinAct(BigDecimal pacSinAct) {
        this.pacSinAct = pacSinAct;
    }

    public void setPacImpFijoPerAct(String pacImpFijoPerAct) {
        this.pacImpFijoPerAct = pacImpFijoPerAct;
    }

    public void setAhoCveEstado(String ahoCveEstado) {
        this.ahoCveEstado = ahoCveEstado;
    }

    public void setAhoNumOper(String ahoNumOper) {
        this.ahoNumOper = ahoNumOper;
    }

    public BigDecimal getPacNumContrato() {
        return this.pacNumContrato;
    }

    public String getPacCveFormaCalc() {
        return this.pacCveFormaCalc;
    }

    public BigDecimal getPacCveImpFijo() {
        return this.pacCveImpFijo;
    }

    public BigDecimal getPacCvePjePacta() {
        return this.pacCvePjePacta;
    }

    public BigDecimal getPacCveExento() {
        return this.pacCveExento;
    }

    public BigDecimal getPacCveManMonEx() {
        return this.pacCveManMonEx;
    }

    public BigDecimal getPacCveExtemp() {
        return this.pacCveExtemp;
    }

    public String getPacCvePeriodCob() {
        return this.pacCvePeriodCob;
    }

    public String getPacCvePersCob() {
        return this.pacCvePersCob;
    }

    public BigDecimal getPacCveTabCalc() {
        return this.pacCveTabCalc;
    }

    public BigDecimal getPacCvePjeMillar() {
        return this.pacCvePjeMillar;
    }

    public BigDecimal getPacDiaCalcClte() {
        return this.pacDiaCalcClte;
    }

    public BigDecimal getPacAnoCalcHono() {
        return this.pacAnoCalcHono;
    }

    public BigDecimal getPacMesCalcHono() {
        return this.pacMesCalcHono;
    }

    public BigDecimal getPacDiaCalcHono() {
        return this.pacDiaCalcHono;
    }

    public String getPacFecUltCalc() {
        return this.pacFecUltCalc;
    }

    public BigDecimal getPacDiasCalcHono() {
        return this.pacDiasCalcHono;
    }

    public BigDecimal getPacAnoUltRevis() {
        return this.pacAnoUltRevis;
    }

    public BigDecimal getPacMesUltRevis() {
        return this.pacMesUltRevis;
    }

    public BigDecimal getPacDiaUltRevis() {
        return this.pacDiaUltRevis;
    }

    public BigDecimal getPacNumMoneda() {
        return this.pacNumMoneda;
    }

    public BigDecimal getPacNumTablaHono() {
        return this.pacNumTablaHono;
    }

    public BigDecimal getPacImpFijoHono() {
        return this.pacImpFijoHono;
    }

    public BigDecimal getPacImpMinHono() {
        return this.pacImpMinHono;
    }

    public BigDecimal getPacImpAdicHono() {
        return this.pacImpAdicHono;
    }

    public BigDecimal getPacPjePactaHono() {
        return this.pacPjePactaHono;
    }

    public BigDecimal getPacPjeDesctoHon() {
        return this.pacPjeDesctoHon;
    }

    public BigDecimal getPacPjeIncremHon() {
        return this.pacPjeIncremHon;
    }

    public BigDecimal getPacPjeAjuAnual() {
        return this.pacPjeAjuAnual;
    }

    public String getPacTexFundamento() {
        return this.pacTexFundamento;
    }

    public BigDecimal getPacImpAceptacion() {
        return this.pacImpAceptacion;
    }

    public BigDecimal getPacImpMaximo() {
        return this.pacImpMaximo;
    }

    public BigDecimal getPacAnoAltaReg() {
        return this.pacAnoAltaReg;
    }

    public BigDecimal getPacMesAltaReg() {
        return this.pacMesAltaReg;
    }

    public BigDecimal getPacDiaAltaReg() {
        return this.pacDiaAltaReg;
    }

    public BigDecimal getPacAnoUltMod() {
        return this.pacAnoUltMod;
    }

    public BigDecimal getPacMesUltMod() {
        return this.pacMesUltMod;
    }

    public BigDecimal getPacDiaUltMod() {
        return this.pacDiaUltMod;
    }

    public String getPacCveStPacahon() {
        return this.pacCveStPacahon;
    }

    public BigDecimal getPacCtoInver() {
        return this.pacCtoInver;
    }

    public BigDecimal getPacIntermed() {
        return this.pacIntermed;
    }

    public BigDecimal getPacInpc() {
        return this.pacInpc;
    }

    public String getPacPeriodoActInpc() {
        return this.pacPeriodoActInpc;
    }

    public BigDecimal getPacCpi() {
        return this.pacCpi;
    }

    public BigDecimal getPacDiez() {
        return this.pacDiez;
    }

    public BigDecimal getPacUdi() {
        return this.pacUdi;
    }

    public BigDecimal getPacSinAct() {
        return this.pacSinAct;
    }

    public String getPacImpFijoPerAct() {
        return this.pacImpFijoPerAct;
    }

    public String getAhoCveEstado() {
        return this.ahoCveEstado;
    }

    public String getAhoNumOper() {
        return this.ahoNumOper;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM APHONO ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getPacNumContrato() != null && this.getPacNumContrato().longValue() == -999) {
            conditions += " AND PAC_NUM_CONTRATO IS NULL";
        } else if (this.getPacNumContrato() != null) {
            conditions += " AND PAC_NUM_CONTRATO =?";
            values.add(this.getPacNumContrato());
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
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM APHONO ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE APHONO SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        conditions += " AND PAC_NUM_CONTRATO = ?";
        pkValues.add(this.getPacNumContrato());
        fields += " PAC_CVE_FORMA_CALC = ?, ";
        values.add(this.getPacCveFormaCalc());
        fields += " PAC_CVE_IMP_FIJO = ?, ";
        values.add(this.getPacCveImpFijo());
        fields += " PAC_CVE_PJE_PACTA = ?, ";
        values.add(this.getPacCvePjePacta());
        fields += " PAC_CVE_EXENTO = ?, ";
        values.add(this.getPacCveExento());
        fields += " PAC_CVE_MAN_MON_EX = ?, ";
        values.add(this.getPacCveManMonEx());
        fields += " PAC_CVE_EXTEMP = ?, ";
        values.add(this.getPacCveExtemp());
        fields += " PAC_CVE_PERIOD_COB = ?, ";
        values.add(this.getPacCvePeriodCob());
        fields += " PAC_CVE_PERS_COB = ?, ";
        values.add(this.getPacCvePersCob());
        fields += " PAC_CVE_TAB_CALC = ?, ";
        values.add(this.getPacCveTabCalc());
        fields += " PAC_CVE_PJE_MILLAR = ?, ";
        values.add(this.getPacCvePjeMillar());
        fields += " PAC_DIA_CALC_CLTE = ?, ";
        values.add(this.getPacDiaCalcClte());
        fields += " PAC_ANO_CALC_HONO = ?, ";
        values.add(this.getPacAnoCalcHono());
        fields += " PAC_MES_CALC_HONO = ?, ";
        values.add(this.getPacMesCalcHono());
        fields += " PAC_DIA_CALC_HONO = ?, ";
        values.add(this.getPacDiaCalcHono());
        fields += " PAC_FEC_ULT_CALC = ?, ";
        values.add(this.getPacFecUltCalc());
        fields += " PAC_DIAS_CALC_HONO = ?, ";
        values.add(this.getPacDiasCalcHono());
        fields += " PAC_ANO_ULT_REVIS = ?, ";
        values.add(this.getPacAnoUltRevis());
        fields += " PAC_MES_ULT_REVIS = ?, ";
        values.add(this.getPacMesUltRevis());
        fields += " PAC_DIA_ULT_REVIS = ?, ";
        values.add(this.getPacDiaUltRevis());
        fields += " PAC_NUM_MONEDA = ?, ";
        values.add(this.getPacNumMoneda());
        fields += " PAC_NUM_TABLA_HONO = ?, ";
        values.add(this.getPacNumTablaHono());
        fields += " PAC_IMP_FIJO_HONO = ?, ";
        values.add(this.getPacImpFijoHono());
        fields += " PAC_IMP_MIN_HONO = ?, ";
        values.add(this.getPacImpMinHono());
        fields += " PAC_IMP_ADIC_HONO = ?, ";
        values.add(this.getPacImpAdicHono());
        fields += " PAC_PJE_PACTA_HONO = ?, ";
        values.add(this.getPacPjePactaHono());
        fields += " PAC_PJE_DESCTO_HON = ?, ";
        values.add(this.getPacPjeDesctoHon());
        fields += " PAC_PJE_INCREM_HON = ?, ";
        values.add(this.getPacPjeIncremHon());
        fields += " PAC_PJE_AJU_ANUAL = ?, ";
        values.add(this.getPacPjeAjuAnual());
        fields += " PAC_TEX_FUNDAMENTO = ?, ";
        values.add(this.getPacTexFundamento());
        fields += " PAC_IMP_ACEPTACION = ?, ";
        values.add(this.getPacImpAceptacion());
        fields += " PAC_IMP_MAXIMO = ?, ";
        values.add(this.getPacImpMaximo());
        fields += " PAC_ANO_ALTA_REG = ?, ";
        values.add(this.getPacAnoAltaReg());
        fields += " PAC_MES_ALTA_REG = ?, ";
        values.add(this.getPacMesAltaReg());
        fields += " PAC_DIA_ALTA_REG = ?, ";
        values.add(this.getPacDiaAltaReg());
        fields += " PAC_ANO_ULT_MOD = ?, ";
        values.add(this.getPacAnoUltMod());
        fields += " PAC_MES_ULT_MOD = ?, ";
        values.add(this.getPacMesUltMod());
        fields += " PAC_DIA_ULT_MOD = ?, ";
        values.add(this.getPacDiaUltMod());
        fields += " PAC_CVE_ST_PACAHON = ?, ";
        values.add(this.getPacCveStPacahon());
        fields += " PAC_CTO_INVER = ?, ";
        values.add(this.getPacCtoInver());
        fields += " PAC_INTERMED = ?, ";
        values.add(this.getPacIntermed());
        fields += " PAC_INPC = ?, ";
        values.add(this.getPacInpc());
        fields += " PAC_PERIODO_ACT_INPC = ?, ";
        values.add(this.getPacPeriodoActInpc());
        fields += " PAC_CPI = ?, ";
        values.add(this.getPacCpi());
        fields += " PAC_DIEZ = ?, ";
        values.add(this.getPacDiez());
        fields += " PAC_UDI = ?, ";
        values.add(this.getPacUdi());
        fields += " PAC_SIN_ACT = ?, ";
        values.add(this.getPacSinAct());
        fields += " PAC_IMP_FIJO_PER_ACT = ?, ";
        values.add(this.getPacImpFijoPerAct());
        fields += " AHO_CVE_ESTADO = ?, ";
        values.add(this.getAhoCveEstado());
        fields += " AHO_NUM_OPER = ?, ";
        values.add(this.getAhoNumOper());
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
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO APHONO ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",PAC_NUM_CONTRATO ";
        fieldValues += ", ?";
        values.add(this.getPacNumContrato());
        fields += ",PAC_CVE_FORMA_CALC ";
        fieldValues += ", ?";
        values.add(this.getPacCveFormaCalc());
        fields += ",PAC_CVE_IMP_FIJO ";
        fieldValues += ", ?";
        values.add(this.getPacCveImpFijo());
        fields += ",PAC_CVE_PJE_PACTA ";
        fieldValues += ", ?";
        values.add(this.getPacCvePjePacta());
        fields += ",PAC_CVE_EXENTO ";
        fieldValues += ", ?";
        values.add(this.getPacCveExento());
        fields += ",PAC_CVE_MAN_MON_EX ";
        fieldValues += ", ?";
        values.add(this.getPacCveManMonEx());
        fields += ",PAC_CVE_EXTEMP ";
        fieldValues += ", ?";
        values.add(this.getPacCveExtemp());
        fields += ",PAC_CVE_PERIOD_COB ";
        fieldValues += ", ?";
        values.add(this.getPacCvePeriodCob());
        fields += ",PAC_CVE_PERS_COB ";
        fieldValues += ", ?";
        values.add(this.getPacCvePersCob());
        fields += ",PAC_CVE_TAB_CALC ";
        fieldValues += ", ?";
        values.add(this.getPacCveTabCalc());
        fields += ",PAC_CVE_PJE_MILLAR ";
        fieldValues += ", ?";
        values.add(this.getPacCvePjeMillar());
        fields += ",PAC_DIA_CALC_CLTE ";
        fieldValues += ", ?";
        values.add(this.getPacDiaCalcClte());
        fields += ",PAC_ANO_CALC_HONO ";
        fieldValues += ", ?";
        values.add(this.getPacAnoCalcHono());
        fields += ",PAC_MES_CALC_HONO ";
        fieldValues += ", ?";
        values.add(this.getPacMesCalcHono());
        fields += ",PAC_DIA_CALC_HONO ";
        fieldValues += ", ?";
        values.add(this.getPacDiaCalcHono());
        fields += ",PAC_FEC_ULT_CALC ";
        fieldValues += ", ?";
        values.add(this.getPacFecUltCalc());
        fields += ",PAC_DIAS_CALC_HONO ";
        fieldValues += ", ?";
        values.add(this.getPacDiasCalcHono());
        fields += ",PAC_ANO_ULT_REVIS ";
        fieldValues += ", ?";
        values.add(this.getPacAnoUltRevis());
        fields += ",PAC_MES_ULT_REVIS ";
        fieldValues += ", ?";
        values.add(this.getPacMesUltRevis());
        fields += ",PAC_DIA_ULT_REVIS ";
        fieldValues += ", ?";
        values.add(this.getPacDiaUltRevis());
        fields += ",PAC_NUM_MONEDA ";
        fieldValues += ", ?";
        values.add(this.getPacNumMoneda());
        fields += ",PAC_NUM_TABLA_HONO ";
        fieldValues += ", ?";
        values.add(this.getPacNumTablaHono());
        fields += ",PAC_IMP_FIJO_HONO ";
        fieldValues += ", ?";
        values.add(this.getPacImpFijoHono());
        fields += ",PAC_IMP_MIN_HONO ";
        fieldValues += ", ?";
        values.add(this.getPacImpMinHono());
        fields += ",PAC_IMP_ADIC_HONO ";
        fieldValues += ", ?";
        values.add(this.getPacImpAdicHono());
        fields += ",PAC_PJE_PACTA_HONO ";
        fieldValues += ", ?";
        values.add(this.getPacPjePactaHono());
        fields += ",PAC_PJE_DESCTO_HON ";
        fieldValues += ", ?";
        values.add(this.getPacPjeDesctoHon());
        fields += ",PAC_PJE_INCREM_HON ";
        fieldValues += ", ?";
        values.add(this.getPacPjeIncremHon());
        fields += ",PAC_PJE_AJU_ANUAL ";
        fieldValues += ", ?";
        values.add(this.getPacPjeAjuAnual());
        fields += ",PAC_TEX_FUNDAMENTO ";
        fieldValues += ", ?";
        values.add(this.getPacTexFundamento());
        fields += ",PAC_IMP_ACEPTACION ";
        fieldValues += ", ?";
        values.add(this.getPacImpAceptacion());
        fields += ",PAC_IMP_MAXIMO ";
        fieldValues += ", ?";
        values.add(this.getPacImpMaximo());
        fields += ",PAC_ANO_ALTA_REG ";
        fieldValues += ", ?";
        values.add(this.getPacAnoAltaReg());
        fields += ",PAC_MES_ALTA_REG ";
        fieldValues += ", ?";
        values.add(this.getPacMesAltaReg());
        fields += ",PAC_DIA_ALTA_REG ";
        fieldValues += ", ?";
        values.add(this.getPacDiaAltaReg());
        fields += ",PAC_ANO_ULT_MOD ";
        fieldValues += ", ?";
        values.add(this.getPacAnoUltMod());
        fields += ",PAC_MES_ULT_MOD ";
        fieldValues += ", ?";
        values.add(this.getPacMesUltMod());
        fields += ",PAC_DIA_ULT_MOD ";
        fieldValues += ", ?";
        values.add(this.getPacDiaUltMod());
        fields += ",PAC_CVE_ST_PACAHON ";
        fieldValues += ", ?";
        values.add(this.getPacCveStPacahon());
        fields += ",PAC_CTO_INVER ";
        fieldValues += ", ?";
        values.add(this.getPacCtoInver());
        fields += ",PAC_INTERMED ";
        fieldValues += ", ?";
        values.add(this.getPacIntermed());
        fields += ",PAC_INPC ";
        fieldValues += ", ?";
        values.add(this.getPacInpc());
        fields += ",PAC_PERIODO_ACT_INPC ";
        fieldValues += ", ?";
        values.add(this.getPacPeriodoActInpc());
        fields += ",PAC_CPI ";
        fieldValues += ", ?";
        values.add(this.getPacCpi());
        fields += ",PAC_DIEZ ";
        fieldValues += ", ?";
        values.add(this.getPacDiez());
        fields += ",PAC_UDI ";
        fieldValues += ", ?";
        values.add(this.getPacUdi());
        fields += ",PAC_SIN_ACT ";
        fieldValues += ", ?";
        values.add(this.getPacSinAct());
        fields += ",PAC_IMP_FIJO_PER_ACT ";
        fieldValues += ", ?";
        values.add(this.getPacImpFijoPerAct());
        fields += ",AHO_CVE_ESTADO ";
        fieldValues += ", ?";
        values.add(this.getAhoCveEstado());
        fields += ",AHO_NUM_OPER ";
        fieldValues += ", ?";
        values.add(this.getAhoNumOper());
        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();
        sql += fields + " ) VALUES (" + fieldValues + ")";
        result.setSql(sql);
        result.setParameters(values.toArray());
        return result;
    }

    public DMLObject getDelete() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM APHONO WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND PAC_NUM_CONTRATO = ?";
        values.add(this.getPacNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Aphono instance = (Aphono) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPacNumContrato().equals(instance.getPacNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPacCveFormaCalc().equals(instance.getPacCveFormaCalc()))
            equalObjects = false;
        if (equalObjects && !this.getPacCveImpFijo().equals(instance.getPacCveImpFijo()))
            equalObjects = false;
        if (equalObjects && !this.getPacCvePjePacta().equals(instance.getPacCvePjePacta()))
            equalObjects = false;
        if (equalObjects && !this.getPacCveExento().equals(instance.getPacCveExento()))
            equalObjects = false;
        if (equalObjects && !this.getPacCveManMonEx().equals(instance.getPacCveManMonEx()))
            equalObjects = false;
        if (equalObjects && !this.getPacCveExtemp().equals(instance.getPacCveExtemp()))
            equalObjects = false;
        if (equalObjects && !this.getPacCvePeriodCob().equals(instance.getPacCvePeriodCob()))
            equalObjects = false;
        if (equalObjects && !this.getPacCvePersCob().equals(instance.getPacCvePersCob()))
            equalObjects = false;
        if (equalObjects && !this.getPacCveTabCalc().equals(instance.getPacCveTabCalc()))
            equalObjects = false;
        if (equalObjects && !this.getPacCvePjeMillar().equals(instance.getPacCvePjeMillar()))
            equalObjects = false;
        if (equalObjects && !this.getPacDiaCalcClte().equals(instance.getPacDiaCalcClte()))
            equalObjects = false;
        if (equalObjects && !this.getPacAnoCalcHono().equals(instance.getPacAnoCalcHono()))
            equalObjects = false;
        if (equalObjects && !this.getPacMesCalcHono().equals(instance.getPacMesCalcHono()))
            equalObjects = false;
        if (equalObjects && !this.getPacDiaCalcHono().equals(instance.getPacDiaCalcHono()))
            equalObjects = false;
        if (equalObjects && !this.getPacFecUltCalc().equals(instance.getPacFecUltCalc()))
            equalObjects = false;
        if (equalObjects && !this.getPacDiasCalcHono().equals(instance.getPacDiasCalcHono()))
            equalObjects = false;
        if (equalObjects && !this.getPacAnoUltRevis().equals(instance.getPacAnoUltRevis()))
            equalObjects = false;
        if (equalObjects && !this.getPacMesUltRevis().equals(instance.getPacMesUltRevis()))
            equalObjects = false;
        if (equalObjects && !this.getPacDiaUltRevis().equals(instance.getPacDiaUltRevis()))
            equalObjects = false;
        if (equalObjects && !this.getPacNumMoneda().equals(instance.getPacNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getPacNumTablaHono().equals(instance.getPacNumTablaHono()))
            equalObjects = false;
        if (equalObjects && !this.getPacImpFijoHono().equals(instance.getPacImpFijoHono()))
            equalObjects = false;
        if (equalObjects && !this.getPacImpMinHono().equals(instance.getPacImpMinHono()))
            equalObjects = false;
        if (equalObjects && !this.getPacImpAdicHono().equals(instance.getPacImpAdicHono()))
            equalObjects = false;
        if (equalObjects && !this.getPacPjePactaHono().equals(instance.getPacPjePactaHono()))
            equalObjects = false;
        if (equalObjects && !this.getPacPjeDesctoHon().equals(instance.getPacPjeDesctoHon()))
            equalObjects = false;
        if (equalObjects && !this.getPacPjeIncremHon().equals(instance.getPacPjeIncremHon()))
            equalObjects = false;
        if (equalObjects && !this.getPacPjeAjuAnual().equals(instance.getPacPjeAjuAnual()))
            equalObjects = false;
        if (equalObjects && !this.getPacTexFundamento().equals(instance.getPacTexFundamento()))
            equalObjects = false;
        if (equalObjects && !this.getPacImpAceptacion().equals(instance.getPacImpAceptacion()))
            equalObjects = false;
        if (equalObjects && !this.getPacImpMaximo().equals(instance.getPacImpMaximo()))
            equalObjects = false;
        if (equalObjects && !this.getPacAnoAltaReg().equals(instance.getPacAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPacMesAltaReg().equals(instance.getPacMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPacDiaAltaReg().equals(instance.getPacDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPacAnoUltMod().equals(instance.getPacAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPacMesUltMod().equals(instance.getPacMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPacDiaUltMod().equals(instance.getPacDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPacCveStPacahon().equals(instance.getPacCveStPacahon()))
            equalObjects = false;
        if (equalObjects && !this.getPacCtoInver().equals(instance.getPacCtoInver()))
            equalObjects = false;
        if (equalObjects && !this.getPacIntermed().equals(instance.getPacIntermed()))
            equalObjects = false;
        if (equalObjects && !this.getPacInpc().equals(instance.getPacInpc()))
            equalObjects = false;
        if (equalObjects && !this.getPacPeriodoActInpc().equals(instance.getPacPeriodoActInpc()))
            equalObjects = false;
        if (equalObjects && !this.getPacCpi().equals(instance.getPacCpi()))
            equalObjects = false;
        if (equalObjects && !this.getPacDiez().equals(instance.getPacDiez()))
            equalObjects = false;
        if (equalObjects && !this.getPacUdi().equals(instance.getPacUdi()))
            equalObjects = false;
        if (equalObjects && !this.getPacSinAct().equals(instance.getPacSinAct()))
            equalObjects = false;
        if (equalObjects && !this.getPacImpFijoPerAct().equals(instance.getPacImpFijoPerAct()))
            equalObjects = false;
        if (equalObjects && !this.getAhoCveEstado().equals(instance.getAhoCveEstado()))
            equalObjects = false;
        if (equalObjects && !this.getAhoNumOper().equals(instance.getAhoNumOper()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Aphono result = new Aphono();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setPacNumContrato((BigDecimal) objectData.getData("PAC_NUM_CONTRATO"));
        result.setPacCveFormaCalc((String) objectData.getData("PAC_CVE_FORMA_CALC"));
        result.setPacCveImpFijo((BigDecimal) objectData.getData("PAC_CVE_IMP_FIJO"));
        result.setPacCvePjePacta((BigDecimal) objectData.getData("PAC_CVE_PJE_PACTA"));
        result.setPacCveExento((BigDecimal) objectData.getData("PAC_CVE_EXENTO"));
        result.setPacCveManMonEx((BigDecimal) objectData.getData("PAC_CVE_MAN_MON_EX"));
        result.setPacCveExtemp((BigDecimal) objectData.getData("PAC_CVE_EXTEMP"));
        result.setPacCvePeriodCob((String) objectData.getData("PAC_CVE_PERIOD_COB"));
        result.setPacCvePersCob((String) objectData.getData("PAC_CVE_PERS_COB"));
        result.setPacCveTabCalc((BigDecimal) objectData.getData("PAC_CVE_TAB_CALC"));
        result.setPacCvePjeMillar((BigDecimal) objectData.getData("PAC_CVE_PJE_MILLAR"));
        result.setPacDiaCalcClte((BigDecimal) objectData.getData("PAC_DIA_CALC_CLTE"));
        result.setPacAnoCalcHono((BigDecimal) objectData.getData("PAC_ANO_CALC_HONO"));
        result.setPacMesCalcHono((BigDecimal) objectData.getData("PAC_MES_CALC_HONO"));
        result.setPacDiaCalcHono((BigDecimal) objectData.getData("PAC_DIA_CALC_HONO"));
        result.setPacFecUltCalc((String) objectData.getData("PAC_FEC_ULT_CALC"));
        result.setPacDiasCalcHono((BigDecimal) objectData.getData("PAC_DIAS_CALC_HONO"));
        result.setPacAnoUltRevis((BigDecimal) objectData.getData("PAC_ANO_ULT_REVIS"));
        result.setPacMesUltRevis((BigDecimal) objectData.getData("PAC_MES_ULT_REVIS"));
        result.setPacDiaUltRevis((BigDecimal) objectData.getData("PAC_DIA_ULT_REVIS"));
        result.setPacNumMoneda((BigDecimal) objectData.getData("PAC_NUM_MONEDA"));
        result.setPacNumTablaHono((BigDecimal) objectData.getData("PAC_NUM_TABLA_HONO"));
        result.setPacImpFijoHono((BigDecimal) objectData.getData("PAC_IMP_FIJO_HONO"));
        result.setPacImpMinHono((BigDecimal) objectData.getData("PAC_IMP_MIN_HONO"));
        result.setPacImpAdicHono((BigDecimal) objectData.getData("PAC_IMP_ADIC_HONO"));
        result.setPacPjePactaHono((BigDecimal) objectData.getData("PAC_PJE_PACTA_HONO"));
        result.setPacPjeDesctoHon((BigDecimal) objectData.getData("PAC_PJE_DESCTO_HON"));
        result.setPacPjeIncremHon((BigDecimal) objectData.getData("PAC_PJE_INCREM_HON"));
        result.setPacPjeAjuAnual((BigDecimal) objectData.getData("PAC_PJE_AJU_ANUAL"));
        result.setPacTexFundamento((String) objectData.getData("PAC_TEX_FUNDAMENTO"));
        result.setPacImpAceptacion((BigDecimal) objectData.getData("PAC_IMP_ACEPTACION"));
        result.setPacImpMaximo((BigDecimal) objectData.getData("PAC_IMP_MAXIMO"));
        result.setPacAnoAltaReg((BigDecimal) objectData.getData("PAC_ANO_ALTA_REG"));
        result.setPacMesAltaReg((BigDecimal) objectData.getData("PAC_MES_ALTA_REG"));
        result.setPacDiaAltaReg((BigDecimal) objectData.getData("PAC_DIA_ALTA_REG"));
        result.setPacAnoUltMod((BigDecimal) objectData.getData("PAC_ANO_ULT_MOD"));
        result.setPacMesUltMod((BigDecimal) objectData.getData("PAC_MES_ULT_MOD"));
        result.setPacDiaUltMod((BigDecimal) objectData.getData("PAC_DIA_ULT_MOD"));
        result.setPacCveStPacahon((String) objectData.getData("PAC_CVE_ST_PACAHON"));
        result.setPacCtoInver((BigDecimal) objectData.getData("PAC_CTO_INVER"));
        result.setPacIntermed((BigDecimal) objectData.getData("PAC_INTERMED"));
        result.setPacInpc((BigDecimal) objectData.getData("PAC_INPC"));
        result.setPacPeriodoActInpc((String) objectData.getData("PAC_PERIODO_ACT_INPC"));
        result.setPacCpi((BigDecimal) objectData.getData("PAC_CPI"));
        result.setPacDiez((BigDecimal) objectData.getData("PAC_DIEZ"));
        result.setPacUdi((BigDecimal) objectData.getData("PAC_UDI"));
        result.setPacSinAct((BigDecimal) objectData.getData("PAC_SIN_ACT"));
        result.setPacImpFijoPerAct((String) objectData.getData("PAC_IMP_FIJO_PER_ACT"));
        result.setAhoCveEstado((String) objectData.getData("AHO_CVE_ESTADO"));
        result.setAhoNumOper((String) objectData.getData("AHO_NUM_OPER"));
        return result;
    }
}
