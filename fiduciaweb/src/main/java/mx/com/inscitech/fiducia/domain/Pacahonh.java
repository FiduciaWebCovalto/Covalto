package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PACAHONH_PK", columns = { "PAC_NUM_CONTRATO" }, sequences = { "MAX" })
public class Pacahonh extends DomainObject {

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

    public Pacahonh() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacNumContrato(BigDecimal pacNumContrato) {
        this.pacNumContrato = pacNumContrato;
    }

    public BigDecimal getPacNumContrato() {
        return this.pacNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPacCveFormaCalc(String pacCveFormaCalc) {
        this.pacCveFormaCalc = pacCveFormaCalc;
    }

    public String getPacCveFormaCalc() {
        return this.pacCveFormaCalc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacCveImpFijo(BigDecimal pacCveImpFijo) {
        this.pacCveImpFijo = pacCveImpFijo;
    }

    public BigDecimal getPacCveImpFijo() {
        return this.pacCveImpFijo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacCvePjePacta(BigDecimal pacCvePjePacta) {
        this.pacCvePjePacta = pacCvePjePacta;
    }

    public BigDecimal getPacCvePjePacta() {
        return this.pacCvePjePacta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacCveExento(BigDecimal pacCveExento) {
        this.pacCveExento = pacCveExento;
    }

    public BigDecimal getPacCveExento() {
        return this.pacCveExento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacCveManMonEx(BigDecimal pacCveManMonEx) {
        this.pacCveManMonEx = pacCveManMonEx;
    }

    public BigDecimal getPacCveManMonEx() {
        return this.pacCveManMonEx;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacCveExtemp(BigDecimal pacCveExtemp) {
        this.pacCveExtemp = pacCveExtemp;
    }

    public BigDecimal getPacCveExtemp() {
        return this.pacCveExtemp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPacCvePeriodCob(String pacCvePeriodCob) {
        this.pacCvePeriodCob = pacCvePeriodCob;
    }

    public String getPacCvePeriodCob() {
        return this.pacCvePeriodCob;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPacCvePersCob(String pacCvePersCob) {
        this.pacCvePersCob = pacCvePersCob;
    }

    public String getPacCvePersCob() {
        return this.pacCvePersCob;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacCveTabCalc(BigDecimal pacCveTabCalc) {
        this.pacCveTabCalc = pacCveTabCalc;
    }

    public BigDecimal getPacCveTabCalc() {
        return this.pacCveTabCalc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacCvePjeMillar(BigDecimal pacCvePjeMillar) {
        this.pacCvePjeMillar = pacCvePjeMillar;
    }

    public BigDecimal getPacCvePjeMillar() {
        return this.pacCvePjeMillar;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPacDiaCalcClte(BigDecimal pacDiaCalcClte) {
        this.pacDiaCalcClte = pacDiaCalcClte;
    }

    public BigDecimal getPacDiaCalcClte() {
        return this.pacDiaCalcClte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPacAnoCalcHono(BigDecimal pacAnoCalcHono) {
        this.pacAnoCalcHono = pacAnoCalcHono;
    }

    public BigDecimal getPacAnoCalcHono() {
        return this.pacAnoCalcHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPacMesCalcHono(BigDecimal pacMesCalcHono) {
        this.pacMesCalcHono = pacMesCalcHono;
    }

    public BigDecimal getPacMesCalcHono() {
        return this.pacMesCalcHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPacDiaCalcHono(BigDecimal pacDiaCalcHono) {
        this.pacDiaCalcHono = pacDiaCalcHono;
    }

    public BigDecimal getPacDiaCalcHono() {
        return this.pacDiaCalcHono;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPacFecUltCalc(String pacFecUltCalc) {
        this.pacFecUltCalc = pacFecUltCalc;
    }

    public String getPacFecUltCalc() {
        return this.pacFecUltCalc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacDiasCalcHono(BigDecimal pacDiasCalcHono) {
        this.pacDiasCalcHono = pacDiasCalcHono;
    }

    public BigDecimal getPacDiasCalcHono() {
        return this.pacDiasCalcHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPacAnoUltRevis(BigDecimal pacAnoUltRevis) {
        this.pacAnoUltRevis = pacAnoUltRevis;
    }

    public BigDecimal getPacAnoUltRevis() {
        return this.pacAnoUltRevis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPacMesUltRevis(BigDecimal pacMesUltRevis) {
        this.pacMesUltRevis = pacMesUltRevis;
    }

    public BigDecimal getPacMesUltRevis() {
        return this.pacMesUltRevis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPacDiaUltRevis(BigDecimal pacDiaUltRevis) {
        this.pacDiaUltRevis = pacDiaUltRevis;
    }

    public BigDecimal getPacDiaUltRevis() {
        return this.pacDiaUltRevis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacNumMoneda(BigDecimal pacNumMoneda) {
        this.pacNumMoneda = pacNumMoneda;
    }

    public BigDecimal getPacNumMoneda() {
        return this.pacNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacNumTablaHono(BigDecimal pacNumTablaHono) {
        this.pacNumTablaHono = pacNumTablaHono;
    }

    public BigDecimal getPacNumTablaHono() {
        return this.pacNumTablaHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPacImpFijoHono(BigDecimal pacImpFijoHono) {
        this.pacImpFijoHono = pacImpFijoHono;
    }

    public BigDecimal getPacImpFijoHono() {
        return this.pacImpFijoHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPacImpMinHono(BigDecimal pacImpMinHono) {
        this.pacImpMinHono = pacImpMinHono;
    }

    public BigDecimal getPacImpMinHono() {
        return this.pacImpMinHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPacImpAdicHono(BigDecimal pacImpAdicHono) {
        this.pacImpAdicHono = pacImpAdicHono;
    }

    public BigDecimal getPacImpAdicHono() {
        return this.pacImpAdicHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 4, javaClass = BigDecimal.class)
    public void setPacPjePactaHono(BigDecimal pacPjePactaHono) {
        this.pacPjePactaHono = pacPjePactaHono;
    }

    public BigDecimal getPacPjePactaHono() {
        return this.pacPjePactaHono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 4, javaClass = BigDecimal.class)
    public void setPacPjeDesctoHon(BigDecimal pacPjeDesctoHon) {
        this.pacPjeDesctoHon = pacPjeDesctoHon;
    }

    public BigDecimal getPacPjeDesctoHon() {
        return this.pacPjeDesctoHon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 4, javaClass = BigDecimal.class)
    public void setPacPjeIncremHon(BigDecimal pacPjeIncremHon) {
        this.pacPjeIncremHon = pacPjeIncremHon;
    }

    public BigDecimal getPacPjeIncremHon() {
        return this.pacPjeIncremHon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 4, javaClass = BigDecimal.class)
    public void setPacPjeAjuAnual(BigDecimal pacPjeAjuAnual) {
        this.pacPjeAjuAnual = pacPjeAjuAnual;
    }

    public BigDecimal getPacPjeAjuAnual() {
        return this.pacPjeAjuAnual;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPacTexFundamento(String pacTexFundamento) {
        this.pacTexFundamento = pacTexFundamento;
    }

    public String getPacTexFundamento() {
        return this.pacTexFundamento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPacImpAceptacion(BigDecimal pacImpAceptacion) {
        this.pacImpAceptacion = pacImpAceptacion;
    }

    public BigDecimal getPacImpAceptacion() {
        return this.pacImpAceptacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPacImpMaximo(BigDecimal pacImpMaximo) {
        this.pacImpMaximo = pacImpMaximo;
    }

    public BigDecimal getPacImpMaximo() {
        return this.pacImpMaximo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPacAnoAltaReg(BigDecimal pacAnoAltaReg) {
        this.pacAnoAltaReg = pacAnoAltaReg;
    }

    public BigDecimal getPacAnoAltaReg() {
        return this.pacAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPacMesAltaReg(BigDecimal pacMesAltaReg) {
        this.pacMesAltaReg = pacMesAltaReg;
    }

    public BigDecimal getPacMesAltaReg() {
        return this.pacMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPacDiaAltaReg(BigDecimal pacDiaAltaReg) {
        this.pacDiaAltaReg = pacDiaAltaReg;
    }

    public BigDecimal getPacDiaAltaReg() {
        return this.pacDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPacAnoUltMod(BigDecimal pacAnoUltMod) {
        this.pacAnoUltMod = pacAnoUltMod;
    }

    public BigDecimal getPacAnoUltMod() {
        return this.pacAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPacMesUltMod(BigDecimal pacMesUltMod) {
        this.pacMesUltMod = pacMesUltMod;
    }

    public BigDecimal getPacMesUltMod() {
        return this.pacMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPacDiaUltMod(BigDecimal pacDiaUltMod) {
        this.pacDiaUltMod = pacDiaUltMod;
    }

    public BigDecimal getPacDiaUltMod() {
        return this.pacDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPacCveStPacahon(String pacCveStPacahon) {
        this.pacCveStPacahon = pacCveStPacahon;
    }

    public String getPacCveStPacahon() {
        return this.pacCveStPacahon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacCtoInver(BigDecimal pacCtoInver) {
        this.pacCtoInver = pacCtoInver;
    }

    public BigDecimal getPacCtoInver() {
        return this.pacCtoInver;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPacIntermed(BigDecimal pacIntermed) {
        this.pacIntermed = pacIntermed;
    }

    public BigDecimal getPacIntermed() {
        return this.pacIntermed;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PACAHONH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPacNumContrato() != null && this.getPacNumContrato().longValue() == -999) {
            conditions += " AND PAC_NUM_CONTRATO IS NULL";
        } else if (this.getPacNumContrato() != null) {
            conditions += " AND PAC_NUM_CONTRATO = ?";
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
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PACAHONH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPacNumContrato() != null && this.getPacNumContrato().longValue() == -999) {
            conditions += " AND PAC_NUM_CONTRATO IS NULL";
        } else if (this.getPacNumContrato() != null) {
            conditions += " AND PAC_NUM_CONTRATO = ?";
            values.add(this.getPacNumContrato());
        }

        if (this.getPacCveFormaCalc() != null && "null".equals(this.getPacCveFormaCalc())) {
            conditions += " AND PAC_CVE_FORMA_CALC IS NULL";
        } else if (this.getPacCveFormaCalc() != null) {
            conditions += " AND PAC_CVE_FORMA_CALC = ?";
            values.add(this.getPacCveFormaCalc());
        }

        if (this.getPacCveImpFijo() != null && this.getPacCveImpFijo().longValue() == -999) {
            conditions += " AND PAC_CVE_IMP_FIJO IS NULL";
        } else if (this.getPacCveImpFijo() != null) {
            conditions += " AND PAC_CVE_IMP_FIJO = ?";
            values.add(this.getPacCveImpFijo());
        }

        if (this.getPacCvePjePacta() != null && this.getPacCvePjePacta().longValue() == -999) {
            conditions += " AND PAC_CVE_PJE_PACTA IS NULL";
        } else if (this.getPacCvePjePacta() != null) {
            conditions += " AND PAC_CVE_PJE_PACTA = ?";
            values.add(this.getPacCvePjePacta());
        }

        if (this.getPacCveExento() != null && this.getPacCveExento().longValue() == -999) {
            conditions += " AND PAC_CVE_EXENTO IS NULL";
        } else if (this.getPacCveExento() != null) {
            conditions += " AND PAC_CVE_EXENTO = ?";
            values.add(this.getPacCveExento());
        }

        if (this.getPacCveManMonEx() != null && this.getPacCveManMonEx().longValue() == -999) {
            conditions += " AND PAC_CVE_MAN_MON_EX IS NULL";
        } else if (this.getPacCveManMonEx() != null) {
            conditions += " AND PAC_CVE_MAN_MON_EX = ?";
            values.add(this.getPacCveManMonEx());
        }

        if (this.getPacCveExtemp() != null && this.getPacCveExtemp().longValue() == -999) {
            conditions += " AND PAC_CVE_EXTEMP IS NULL";
        } else if (this.getPacCveExtemp() != null) {
            conditions += " AND PAC_CVE_EXTEMP = ?";
            values.add(this.getPacCveExtemp());
        }

        if (this.getPacCvePeriodCob() != null && "null".equals(this.getPacCvePeriodCob())) {
            conditions += " AND PAC_CVE_PERIOD_COB IS NULL";
        } else if (this.getPacCvePeriodCob() != null) {
            conditions += " AND PAC_CVE_PERIOD_COB = ?";
            values.add(this.getPacCvePeriodCob());
        }

        if (this.getPacCvePersCob() != null && "null".equals(this.getPacCvePersCob())) {
            conditions += " AND PAC_CVE_PERS_COB IS NULL";
        } else if (this.getPacCvePersCob() != null) {
            conditions += " AND PAC_CVE_PERS_COB = ?";
            values.add(this.getPacCvePersCob());
        }

        if (this.getPacCveTabCalc() != null && this.getPacCveTabCalc().longValue() == -999) {
            conditions += " AND PAC_CVE_TAB_CALC IS NULL";
        } else if (this.getPacCveTabCalc() != null) {
            conditions += " AND PAC_CVE_TAB_CALC = ?";
            values.add(this.getPacCveTabCalc());
        }

        if (this.getPacCvePjeMillar() != null && this.getPacCvePjeMillar().longValue() == -999) {
            conditions += " AND PAC_CVE_PJE_MILLAR IS NULL";
        } else if (this.getPacCvePjeMillar() != null) {
            conditions += " AND PAC_CVE_PJE_MILLAR = ?";
            values.add(this.getPacCvePjeMillar());
        }

        if (this.getPacDiaCalcClte() != null && this.getPacDiaCalcClte().longValue() == -999) {
            conditions += " AND PAC_DIA_CALC_CLTE IS NULL";
        } else if (this.getPacDiaCalcClte() != null) {
            conditions += " AND PAC_DIA_CALC_CLTE = ?";
            values.add(this.getPacDiaCalcClte());
        }

        if (this.getPacAnoCalcHono() != null && this.getPacAnoCalcHono().longValue() == -999) {
            conditions += " AND PAC_ANO_CALC_HONO IS NULL";
        } else if (this.getPacAnoCalcHono() != null) {
            conditions += " AND PAC_ANO_CALC_HONO = ?";
            values.add(this.getPacAnoCalcHono());
        }

        if (this.getPacMesCalcHono() != null && this.getPacMesCalcHono().longValue() == -999) {
            conditions += " AND PAC_MES_CALC_HONO IS NULL";
        } else if (this.getPacMesCalcHono() != null) {
            conditions += " AND PAC_MES_CALC_HONO = ?";
            values.add(this.getPacMesCalcHono());
        }

        if (this.getPacDiaCalcHono() != null && this.getPacDiaCalcHono().longValue() == -999) {
            conditions += " AND PAC_DIA_CALC_HONO IS NULL";
        } else if (this.getPacDiaCalcHono() != null) {
            conditions += " AND PAC_DIA_CALC_HONO = ?";
            values.add(this.getPacDiaCalcHono());
        }

        if (this.getPacFecUltCalc() != null && "null".equals(this.getPacFecUltCalc())) {
            conditions += " AND PAC_FEC_ULT_CALC IS NULL";
        } else if (this.getPacFecUltCalc() != null) {
            conditions += " AND PAC_FEC_ULT_CALC = ?";
            values.add(this.getPacFecUltCalc());
        }

        if (this.getPacDiasCalcHono() != null && this.getPacDiasCalcHono().longValue() == -999) {
            conditions += " AND PAC_DIAS_CALC_HONO IS NULL";
        } else if (this.getPacDiasCalcHono() != null) {
            conditions += " AND PAC_DIAS_CALC_HONO = ?";
            values.add(this.getPacDiasCalcHono());
        }

        if (this.getPacAnoUltRevis() != null && this.getPacAnoUltRevis().longValue() == -999) {
            conditions += " AND PAC_ANO_ULT_REVIS IS NULL";
        } else if (this.getPacAnoUltRevis() != null) {
            conditions += " AND PAC_ANO_ULT_REVIS = ?";
            values.add(this.getPacAnoUltRevis());
        }

        if (this.getPacMesUltRevis() != null && this.getPacMesUltRevis().longValue() == -999) {
            conditions += " AND PAC_MES_ULT_REVIS IS NULL";
        } else if (this.getPacMesUltRevis() != null) {
            conditions += " AND PAC_MES_ULT_REVIS = ?";
            values.add(this.getPacMesUltRevis());
        }

        if (this.getPacDiaUltRevis() != null && this.getPacDiaUltRevis().longValue() == -999) {
            conditions += " AND PAC_DIA_ULT_REVIS IS NULL";
        } else if (this.getPacDiaUltRevis() != null) {
            conditions += " AND PAC_DIA_ULT_REVIS = ?";
            values.add(this.getPacDiaUltRevis());
        }

        if (this.getPacNumMoneda() != null && this.getPacNumMoneda().longValue() == -999) {
            conditions += " AND PAC_NUM_MONEDA IS NULL";
        } else if (this.getPacNumMoneda() != null) {
            conditions += " AND PAC_NUM_MONEDA = ?";
            values.add(this.getPacNumMoneda());
        }

        if (this.getPacNumTablaHono() != null && this.getPacNumTablaHono().longValue() == -999) {
            conditions += " AND PAC_NUM_TABLA_HONO IS NULL";
        } else if (this.getPacNumTablaHono() != null) {
            conditions += " AND PAC_NUM_TABLA_HONO = ?";
            values.add(this.getPacNumTablaHono());
        }

        if (this.getPacImpFijoHono() != null && this.getPacImpFijoHono().longValue() == -999) {
            conditions += " AND PAC_IMP_FIJO_HONO IS NULL";
        } else if (this.getPacImpFijoHono() != null) {
            conditions += " AND PAC_IMP_FIJO_HONO = ?";
            values.add(this.getPacImpFijoHono());
        }

        if (this.getPacImpMinHono() != null && this.getPacImpMinHono().longValue() == -999) {
            conditions += " AND PAC_IMP_MIN_HONO IS NULL";
        } else if (this.getPacImpMinHono() != null) {
            conditions += " AND PAC_IMP_MIN_HONO = ?";
            values.add(this.getPacImpMinHono());
        }

        if (this.getPacImpAdicHono() != null && this.getPacImpAdicHono().longValue() == -999) {
            conditions += " AND PAC_IMP_ADIC_HONO IS NULL";
        } else if (this.getPacImpAdicHono() != null) {
            conditions += " AND PAC_IMP_ADIC_HONO = ?";
            values.add(this.getPacImpAdicHono());
        }

        if (this.getPacPjePactaHono() != null && this.getPacPjePactaHono().longValue() == -999) {
            conditions += " AND PAC_PJE_PACTA_HONO IS NULL";
        } else if (this.getPacPjePactaHono() != null) {
            conditions += " AND PAC_PJE_PACTA_HONO = ?";
            values.add(this.getPacPjePactaHono());
        }

        if (this.getPacPjeDesctoHon() != null && this.getPacPjeDesctoHon().longValue() == -999) {
            conditions += " AND PAC_PJE_DESCTO_HON IS NULL";
        } else if (this.getPacPjeDesctoHon() != null) {
            conditions += " AND PAC_PJE_DESCTO_HON = ?";
            values.add(this.getPacPjeDesctoHon());
        }

        if (this.getPacPjeIncremHon() != null && this.getPacPjeIncremHon().longValue() == -999) {
            conditions += " AND PAC_PJE_INCREM_HON IS NULL";
        } else if (this.getPacPjeIncremHon() != null) {
            conditions += " AND PAC_PJE_INCREM_HON = ?";
            values.add(this.getPacPjeIncremHon());
        }

        if (this.getPacPjeAjuAnual() != null && this.getPacPjeAjuAnual().longValue() == -999) {
            conditions += " AND PAC_PJE_AJU_ANUAL IS NULL";
        } else if (this.getPacPjeAjuAnual() != null) {
            conditions += " AND PAC_PJE_AJU_ANUAL = ?";
            values.add(this.getPacPjeAjuAnual());
        }

        if (this.getPacTexFundamento() != null && "null".equals(this.getPacTexFundamento())) {
            conditions += " AND PAC_TEX_FUNDAMENTO IS NULL";
        } else if (this.getPacTexFundamento() != null) {
            conditions += " AND PAC_TEX_FUNDAMENTO = ?";
            values.add(this.getPacTexFundamento());
        }

        if (this.getPacImpAceptacion() != null && this.getPacImpAceptacion().longValue() == -999) {
            conditions += " AND PAC_IMP_ACEPTACION IS NULL";
        } else if (this.getPacImpAceptacion() != null) {
            conditions += " AND PAC_IMP_ACEPTACION = ?";
            values.add(this.getPacImpAceptacion());
        }

        if (this.getPacImpMaximo() != null && this.getPacImpMaximo().longValue() == -999) {
            conditions += " AND PAC_IMP_MAXIMO IS NULL";
        } else if (this.getPacImpMaximo() != null) {
            conditions += " AND PAC_IMP_MAXIMO = ?";
            values.add(this.getPacImpMaximo());
        }

        if (this.getPacAnoAltaReg() != null && this.getPacAnoAltaReg().longValue() == -999) {
            conditions += " AND PAC_ANO_ALTA_REG IS NULL";
        } else if (this.getPacAnoAltaReg() != null) {
            conditions += " AND PAC_ANO_ALTA_REG = ?";
            values.add(this.getPacAnoAltaReg());
        }

        if (this.getPacMesAltaReg() != null && this.getPacMesAltaReg().longValue() == -999) {
            conditions += " AND PAC_MES_ALTA_REG IS NULL";
        } else if (this.getPacMesAltaReg() != null) {
            conditions += " AND PAC_MES_ALTA_REG = ?";
            values.add(this.getPacMesAltaReg());
        }

        if (this.getPacDiaAltaReg() != null && this.getPacDiaAltaReg().longValue() == -999) {
            conditions += " AND PAC_DIA_ALTA_REG IS NULL";
        } else if (this.getPacDiaAltaReg() != null) {
            conditions += " AND PAC_DIA_ALTA_REG = ?";
            values.add(this.getPacDiaAltaReg());
        }

        if (this.getPacAnoUltMod() != null && this.getPacAnoUltMod().longValue() == -999) {
            conditions += " AND PAC_ANO_ULT_MOD IS NULL";
        } else if (this.getPacAnoUltMod() != null) {
            conditions += " AND PAC_ANO_ULT_MOD = ?";
            values.add(this.getPacAnoUltMod());
        }

        if (this.getPacMesUltMod() != null && this.getPacMesUltMod().longValue() == -999) {
            conditions += " AND PAC_MES_ULT_MOD IS NULL";
        } else if (this.getPacMesUltMod() != null) {
            conditions += " AND PAC_MES_ULT_MOD = ?";
            values.add(this.getPacMesUltMod());
        }

        if (this.getPacDiaUltMod() != null && this.getPacDiaUltMod().longValue() == -999) {
            conditions += " AND PAC_DIA_ULT_MOD IS NULL";
        } else if (this.getPacDiaUltMod() != null) {
            conditions += " AND PAC_DIA_ULT_MOD = ?";
            values.add(this.getPacDiaUltMod());
        }

        if (this.getPacCveStPacahon() != null && "null".equals(this.getPacCveStPacahon())) {
            conditions += " AND PAC_CVE_ST_PACAHON IS NULL";
        } else if (this.getPacCveStPacahon() != null) {
            conditions += " AND PAC_CVE_ST_PACAHON = ?";
            values.add(this.getPacCveStPacahon());
        }

        if (this.getPacCtoInver() != null && this.getPacCtoInver().longValue() == -999) {
            conditions += " AND PAC_CTO_INVER IS NULL";
        } else if (this.getPacCtoInver() != null) {
            conditions += " AND PAC_CTO_INVER = ?";
            values.add(this.getPacCtoInver());
        }

        if (this.getPacIntermed() != null && this.getPacIntermed().longValue() == -999) {
            conditions += " AND PAC_INTERMED IS NULL";
        } else if (this.getPacIntermed() != null) {
            conditions += " AND PAC_INTERMED = ?";
            values.add(this.getPacIntermed());
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
        String sql = "UPDATE PACAHONH SET ";

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
        String sql = "INSERT INTO PACAHONH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPacNumContrato());

        fields += ", PAC_CVE_FORMA_CALC";
        fieldValues += ", ?";
        values.add(this.getPacCveFormaCalc());

        fields += ", PAC_CVE_IMP_FIJO";
        fieldValues += ", ?";
        values.add(this.getPacCveImpFijo());

        fields += ", PAC_CVE_PJE_PACTA";
        fieldValues += ", ?";
        values.add(this.getPacCvePjePacta());

        fields += ", PAC_CVE_EXENTO";
        fieldValues += ", ?";
        values.add(this.getPacCveExento());

        fields += ", PAC_CVE_MAN_MON_EX";
        fieldValues += ", ?";
        values.add(this.getPacCveManMonEx());

        fields += ", PAC_CVE_EXTEMP";
        fieldValues += ", ?";
        values.add(this.getPacCveExtemp());

        fields += ", PAC_CVE_PERIOD_COB";
        fieldValues += ", ?";
        values.add(this.getPacCvePeriodCob());

        fields += ", PAC_CVE_PERS_COB";
        fieldValues += ", ?";
        values.add(this.getPacCvePersCob());

        fields += ", PAC_CVE_TAB_CALC";
        fieldValues += ", ?";
        values.add(this.getPacCveTabCalc());

        fields += ", PAC_CVE_PJE_MILLAR";
        fieldValues += ", ?";
        values.add(this.getPacCvePjeMillar());

        fields += ", PAC_DIA_CALC_CLTE";
        fieldValues += ", ?";
        values.add(this.getPacDiaCalcClte());

        fields += ", PAC_ANO_CALC_HONO";
        fieldValues += ", ?";
        values.add(this.getPacAnoCalcHono());

        fields += ", PAC_MES_CALC_HONO";
        fieldValues += ", ?";
        values.add(this.getPacMesCalcHono());

        fields += ", PAC_DIA_CALC_HONO";
        fieldValues += ", ?";
        values.add(this.getPacDiaCalcHono());

        fields += ", PAC_FEC_ULT_CALC";
        fieldValues += ", ?";
        values.add(this.getPacFecUltCalc());

        fields += ", PAC_DIAS_CALC_HONO";
        fieldValues += ", ?";
        values.add(this.getPacDiasCalcHono());

        fields += ", PAC_ANO_ULT_REVIS";
        fieldValues += ", ?";
        values.add(this.getPacAnoUltRevis());

        fields += ", PAC_MES_ULT_REVIS";
        fieldValues += ", ?";
        values.add(this.getPacMesUltRevis());

        fields += ", PAC_DIA_ULT_REVIS";
        fieldValues += ", ?";
        values.add(this.getPacDiaUltRevis());

        fields += ", PAC_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getPacNumMoneda());

        fields += ", PAC_NUM_TABLA_HONO";
        fieldValues += ", ?";
        values.add(this.getPacNumTablaHono());

        fields += ", PAC_IMP_FIJO_HONO";
        fieldValues += ", ?";
        values.add(this.getPacImpFijoHono());

        fields += ", PAC_IMP_MIN_HONO";
        fieldValues += ", ?";
        values.add(this.getPacImpMinHono());

        fields += ", PAC_IMP_ADIC_HONO";
        fieldValues += ", ?";
        values.add(this.getPacImpAdicHono());

        fields += ", PAC_PJE_PACTA_HONO";
        fieldValues += ", ?";
        values.add(this.getPacPjePactaHono());

        fields += ", PAC_PJE_DESCTO_HON";
        fieldValues += ", ?";
        values.add(this.getPacPjeDesctoHon());

        fields += ", PAC_PJE_INCREM_HON";
        fieldValues += ", ?";
        values.add(this.getPacPjeIncremHon());

        fields += ", PAC_PJE_AJU_ANUAL";
        fieldValues += ", ?";
        values.add(this.getPacPjeAjuAnual());

        fields += ", PAC_TEX_FUNDAMENTO";
        fieldValues += ", ?";
        values.add(this.getPacTexFundamento());

        fields += ", PAC_IMP_ACEPTACION";
        fieldValues += ", ?";
        values.add(this.getPacImpAceptacion());

        fields += ", PAC_IMP_MAXIMO";
        fieldValues += ", ?";
        values.add(this.getPacImpMaximo());

        fields += ", PAC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPacAnoAltaReg());

        fields += ", PAC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPacMesAltaReg());

        fields += ", PAC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPacDiaAltaReg());

        fields += ", PAC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPacAnoUltMod());

        fields += ", PAC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPacMesUltMod());

        fields += ", PAC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPacDiaUltMod());

        fields += ", PAC_CVE_ST_PACAHON";
        fieldValues += ", ?";
        values.add(this.getPacCveStPacahon());

        fields += ", PAC_CTO_INVER";
        fieldValues += ", ?";
        values.add(this.getPacCtoInver());

        fields += ", PAC_INTERMED";
        fieldValues += ", ?";
        values.add(this.getPacIntermed());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PACAHONH WHERE ";

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
        Pacahonh instance = (Pacahonh) compareWith;
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
        return equalObjects;
    }

    public Object selectAsObject() {
        Pacahonh result = new Pacahonh();
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

        return result;

    }

}
