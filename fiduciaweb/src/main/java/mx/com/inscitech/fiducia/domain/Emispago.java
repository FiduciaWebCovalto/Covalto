package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISPAGO_PK", columns = { "EPA_NUM_PROGRAMA", "EPA_NUM_EMISION" }, sequences = { "MANUAL" })
public class Emispago extends DomainObject {

    BigDecimal epaNumPrograma = null;
    BigDecimal epaNumEmision = null;
    String epaPeriodoPago = null;
    BigDecimal epaNumDiaPerPago = null;
    BigDecimal epaDiasAntesCalc = null;
    BigDecimal epaAnoPago = null;
    BigDecimal epaMesPago = null;
    BigDecimal epaDiaPago = null;
    BigDecimal epaMesesNaturales = null;
    BigDecimal epaMesesComerciales = null;
    String epaOtroPeriodo = null;
    BigDecimal epaDiasTranscurridos = null;
    BigDecimal epaDiasEfectivos = null;
    BigDecimal epaRevisables = null;
    BigDecimal epaRecorre = null;
    BigDecimal epaAjustaPeriodo = null;
    BigDecimal epaAjustaPeriodoSig = null;
    BigDecimal epaConfFechaPago = null;
    BigDecimal epaDiaFijo = null;
    BigDecimal epaNumDiaFijo = null;
    BigDecimal epaDiasPago = null;
    BigDecimal epaDiasCalend = null;
    BigDecimal epaDiasPerPago = null;
    BigDecimal epaCalculaSigPer = null;
    BigDecimal epaDiasInhPago = null;
    BigDecimal epaDiasInhCalc = null;
    BigDecimal epaAjustaPer1Per2 = null;
    BigDecimal epaAnoAltaReg = null;
    BigDecimal epaMesAltaReg = null;
    BigDecimal epaDiaAltaReg = null;
    BigDecimal epaAnoUltMod = null;
    BigDecimal epaMesUltMod = null;
    BigDecimal epaDiaUltMod = null;
    String epaCveStEmispago = null;

    public Emispago() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEpaNumPrograma(BigDecimal epaNumPrograma) {
        this.epaNumPrograma = epaNumPrograma;
    }

    public BigDecimal getEpaNumPrograma() {
        return this.epaNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEpaNumEmision(BigDecimal epaNumEmision) {
        this.epaNumEmision = epaNumEmision;
    }

    public BigDecimal getEpaNumEmision() {
        return this.epaNumEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpaPeriodoPago(String epaPeriodoPago) {
        this.epaPeriodoPago = epaPeriodoPago;
    }

    public String getEpaPeriodoPago() {
        return this.epaPeriodoPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEpaNumDiaPerPago(BigDecimal epaNumDiaPerPago) {
        this.epaNumDiaPerPago = epaNumDiaPerPago;
    }

    public BigDecimal getEpaNumDiaPerPago() {
        return this.epaNumDiaPerPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiasAntesCalc(BigDecimal epaDiasAntesCalc) {
        this.epaDiasAntesCalc = epaDiasAntesCalc;
    }

    public BigDecimal getEpaDiasAntesCalc() {
        return this.epaDiasAntesCalc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaAnoPago(BigDecimal epaAnoPago) {
        this.epaAnoPago = epaAnoPago;
    }

    public BigDecimal getEpaAnoPago() {
        return this.epaAnoPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpaMesPago(BigDecimal epaMesPago) {
        this.epaMesPago = epaMesPago;
    }

    public BigDecimal getEpaMesPago() {
        return this.epaMesPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiaPago(BigDecimal epaDiaPago) {
        this.epaDiaPago = epaDiaPago;
    }

    public BigDecimal getEpaDiaPago() {
        return this.epaDiaPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaMesesNaturales(BigDecimal epaMesesNaturales) {
        this.epaMesesNaturales = epaMesesNaturales;
    }

    public BigDecimal getEpaMesesNaturales() {
        return this.epaMesesNaturales;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaMesesComerciales(BigDecimal epaMesesComerciales) {
        this.epaMesesComerciales = epaMesesComerciales;
    }

    public BigDecimal getEpaMesesComerciales() {
        return this.epaMesesComerciales;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpaOtroPeriodo(String epaOtroPeriodo) {
        this.epaOtroPeriodo = epaOtroPeriodo;
    }

    public String getEpaOtroPeriodo() {
        return this.epaOtroPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiasTranscurridos(BigDecimal epaDiasTranscurridos) {
        this.epaDiasTranscurridos = epaDiasTranscurridos;
    }

    public BigDecimal getEpaDiasTranscurridos() {
        return this.epaDiasTranscurridos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiasEfectivos(BigDecimal epaDiasEfectivos) {
        this.epaDiasEfectivos = epaDiasEfectivos;
    }

    public BigDecimal getEpaDiasEfectivos() {
        return this.epaDiasEfectivos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaRevisables(BigDecimal epaRevisables) {
        this.epaRevisables = epaRevisables;
    }

    public BigDecimal getEpaRevisables() {
        return this.epaRevisables;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaRecorre(BigDecimal epaRecorre) {
        this.epaRecorre = epaRecorre;
    }

    public BigDecimal getEpaRecorre() {
        return this.epaRecorre;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaAjustaPeriodo(BigDecimal epaAjustaPeriodo) {
        this.epaAjustaPeriodo = epaAjustaPeriodo;
    }

    public BigDecimal getEpaAjustaPeriodo() {
        return this.epaAjustaPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaAjustaPeriodoSig(BigDecimal epaAjustaPeriodoSig) {
        this.epaAjustaPeriodoSig = epaAjustaPeriodoSig;
    }

    public BigDecimal getEpaAjustaPeriodoSig() {
        return this.epaAjustaPeriodoSig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaConfFechaPago(BigDecimal epaConfFechaPago) {
        this.epaConfFechaPago = epaConfFechaPago;
    }

    public BigDecimal getEpaConfFechaPago() {
        return this.epaConfFechaPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiaFijo(BigDecimal epaDiaFijo) {
        this.epaDiaFijo = epaDiaFijo;
    }

    public BigDecimal getEpaDiaFijo() {
        return this.epaDiaFijo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEpaNumDiaFijo(BigDecimal epaNumDiaFijo) {
        this.epaNumDiaFijo = epaNumDiaFijo;
    }

    public BigDecimal getEpaNumDiaFijo() {
        return this.epaNumDiaFijo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiasPago(BigDecimal epaDiasPago) {
        this.epaDiasPago = epaDiasPago;
    }

    public BigDecimal getEpaDiasPago() {
        return this.epaDiasPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiasCalend(BigDecimal epaDiasCalend) {
        this.epaDiasCalend = epaDiasCalend;
    }

    public BigDecimal getEpaDiasCalend() {
        return this.epaDiasCalend;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiasPerPago(BigDecimal epaDiasPerPago) {
        this.epaDiasPerPago = epaDiasPerPago;
    }

    public BigDecimal getEpaDiasPerPago() {
        return this.epaDiasPerPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaCalculaSigPer(BigDecimal epaCalculaSigPer) {
        this.epaCalculaSigPer = epaCalculaSigPer;
    }

    public BigDecimal getEpaCalculaSigPer() {
        return this.epaCalculaSigPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiasInhPago(BigDecimal epaDiasInhPago) {
        this.epaDiasInhPago = epaDiasInhPago;
    }

    public BigDecimal getEpaDiasInhPago() {
        return this.epaDiasInhPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiasInhCalc(BigDecimal epaDiasInhCalc) {
        this.epaDiasInhCalc = epaDiasInhCalc;
    }

    public BigDecimal getEpaDiasInhCalc() {
        return this.epaDiasInhCalc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaAjustaPer1Per2(BigDecimal epaAjustaPer1Per2) {
        this.epaAjustaPer1Per2 = epaAjustaPer1Per2;
    }

    public BigDecimal getEpaAjustaPer1Per2() {
        return this.epaAjustaPer1Per2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaAnoAltaReg(BigDecimal epaAnoAltaReg) {
        this.epaAnoAltaReg = epaAnoAltaReg;
    }

    public BigDecimal getEpaAnoAltaReg() {
        return this.epaAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpaMesAltaReg(BigDecimal epaMesAltaReg) {
        this.epaMesAltaReg = epaMesAltaReg;
    }

    public BigDecimal getEpaMesAltaReg() {
        return this.epaMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiaAltaReg(BigDecimal epaDiaAltaReg) {
        this.epaDiaAltaReg = epaDiaAltaReg;
    }

    public BigDecimal getEpaDiaAltaReg() {
        return this.epaDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEpaAnoUltMod(BigDecimal epaAnoUltMod) {
        this.epaAnoUltMod = epaAnoUltMod;
    }

    public BigDecimal getEpaAnoUltMod() {
        return this.epaAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpaMesUltMod(BigDecimal epaMesUltMod) {
        this.epaMesUltMod = epaMesUltMod;
    }

    public BigDecimal getEpaMesUltMod() {
        return this.epaMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEpaDiaUltMod(BigDecimal epaDiaUltMod) {
        this.epaDiaUltMod = epaDiaUltMod;
    }

    public BigDecimal getEpaDiaUltMod() {
        return this.epaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEpaCveStEmispago(String epaCveStEmispago) {
        this.epaCveStEmispago = epaCveStEmispago;
    }

    public String getEpaCveStEmispago() {
        return this.epaCveStEmispago;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISPAGO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEpaNumPrograma() != null && this.getEpaNumPrograma().longValue() == -999) {
            conditions += " AND EPA_NUM_PROGRAMA IS NULL";
        } else if (this.getEpaNumPrograma() != null) {
            conditions += " AND EPA_NUM_PROGRAMA = ?";
            values.add(this.getEpaNumPrograma());
        }

        if (this.getEpaNumEmision() != null && this.getEpaNumEmision().longValue() == -999) {
            conditions += " AND EPA_NUM_EMISION IS NULL";
        } else if (this.getEpaNumEmision() != null) {
            conditions += " AND EPA_NUM_EMISION = ?";
            values.add(this.getEpaNumEmision());
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
        String sql = "SELECT * FROM EMISPAGO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEpaNumPrograma() != null && this.getEpaNumPrograma().longValue() == -999) {
            conditions += " AND EPA_NUM_PROGRAMA IS NULL";
        } else if (this.getEpaNumPrograma() != null) {
            conditions += " AND EPA_NUM_PROGRAMA = ?";
            values.add(this.getEpaNumPrograma());
        }

        if (this.getEpaNumEmision() != null && this.getEpaNumEmision().longValue() == -999) {
            conditions += " AND EPA_NUM_EMISION IS NULL";
        } else if (this.getEpaNumEmision() != null) {
            conditions += " AND EPA_NUM_EMISION = ?";
            values.add(this.getEpaNumEmision());
        }

        if (this.getEpaPeriodoPago() != null && "null".equals(this.getEpaPeriodoPago())) {
            conditions += " AND EPA_PERIODO_PAGO IS NULL";
        } else if (this.getEpaPeriodoPago() != null) {
            conditions += " AND EPA_PERIODO_PAGO = ?";
            values.add(this.getEpaPeriodoPago());
        }

        if (this.getEpaNumDiaPerPago() != null && this.getEpaNumDiaPerPago().longValue() == -999) {
            conditions += " AND EPA_NUM_DIA_PER_PAGO IS NULL";
        } else if (this.getEpaNumDiaPerPago() != null) {
            conditions += " AND EPA_NUM_DIA_PER_PAGO = ?";
            values.add(this.getEpaNumDiaPerPago());
        }

        if (this.getEpaDiasAntesCalc() != null && this.getEpaDiasAntesCalc().longValue() == -999) {
            conditions += " AND EPA_DIAS_ANTES_CALC IS NULL";
        } else if (this.getEpaDiasAntesCalc() != null) {
            conditions += " AND EPA_DIAS_ANTES_CALC = ?";
            values.add(this.getEpaDiasAntesCalc());
        }

        if (this.getEpaAnoPago() != null && this.getEpaAnoPago().longValue() == -999) {
            conditions += " AND EPA_ANO_PAGO IS NULL";
        } else if (this.getEpaAnoPago() != null) {
            conditions += " AND EPA_ANO_PAGO = ?";
            values.add(this.getEpaAnoPago());
        }

        if (this.getEpaMesPago() != null && this.getEpaMesPago().longValue() == -999) {
            conditions += " AND EPA_MES_PAGO IS NULL";
        } else if (this.getEpaMesPago() != null) {
            conditions += " AND EPA_MES_PAGO = ?";
            values.add(this.getEpaMesPago());
        }

        if (this.getEpaDiaPago() != null && this.getEpaDiaPago().longValue() == -999) {
            conditions += " AND EPA_DIA_PAGO IS NULL";
        } else if (this.getEpaDiaPago() != null) {
            conditions += " AND EPA_DIA_PAGO = ?";
            values.add(this.getEpaDiaPago());
        }

        if (this.getEpaMesesNaturales() != null && this.getEpaMesesNaturales().longValue() == -999) {
            conditions += " AND EPA_MESES_NATURALES IS NULL";
        } else if (this.getEpaMesesNaturales() != null) {
            conditions += " AND EPA_MESES_NATURALES = ?";
            values.add(this.getEpaMesesNaturales());
        }

        if (this.getEpaMesesComerciales() != null && this.getEpaMesesComerciales().longValue() == -999) {
            conditions += " AND EPA_MESES_COMERCIALES IS NULL";
        } else if (this.getEpaMesesComerciales() != null) {
            conditions += " AND EPA_MESES_COMERCIALES = ?";
            values.add(this.getEpaMesesComerciales());
        }

        if (this.getEpaOtroPeriodo() != null && "null".equals(this.getEpaOtroPeriodo())) {
            conditions += " AND EPA_OTRO_PERIODO IS NULL";
        } else if (this.getEpaOtroPeriodo() != null) {
            conditions += " AND EPA_OTRO_PERIODO = ?";
            values.add(this.getEpaOtroPeriodo());
        }

        if (this.getEpaDiasTranscurridos() != null && this.getEpaDiasTranscurridos().longValue() == -999) {
            conditions += " AND EPA_DIAS_TRANSCURRIDOS IS NULL";
        } else if (this.getEpaDiasTranscurridos() != null) {
            conditions += " AND EPA_DIAS_TRANSCURRIDOS = ?";
            values.add(this.getEpaDiasTranscurridos());
        }

        if (this.getEpaDiasEfectivos() != null && this.getEpaDiasEfectivos().longValue() == -999) {
            conditions += " AND EPA_DIAS_EFECTIVOS IS NULL";
        } else if (this.getEpaDiasEfectivos() != null) {
            conditions += " AND EPA_DIAS_EFECTIVOS = ?";
            values.add(this.getEpaDiasEfectivos());
        }

        if (this.getEpaRevisables() != null && this.getEpaRevisables().longValue() == -999) {
            conditions += " AND EPA_REVISABLES IS NULL";
        } else if (this.getEpaRevisables() != null) {
            conditions += " AND EPA_REVISABLES = ?";
            values.add(this.getEpaRevisables());
        }

        if (this.getEpaRecorre() != null && this.getEpaRecorre().longValue() == -999) {
            conditions += " AND EPA_RECORRE IS NULL";
        } else if (this.getEpaRecorre() != null) {
            conditions += " AND EPA_RECORRE = ?";
            values.add(this.getEpaRecorre());
        }

        if (this.getEpaAjustaPeriodo() != null && this.getEpaAjustaPeriodo().longValue() == -999) {
            conditions += " AND EPA_AJUSTA_PERIODO IS NULL";
        } else if (this.getEpaAjustaPeriodo() != null) {
            conditions += " AND EPA_AJUSTA_PERIODO = ?";
            values.add(this.getEpaAjustaPeriodo());
        }

        if (this.getEpaAjustaPeriodoSig() != null && this.getEpaAjustaPeriodoSig().longValue() == -999) {
            conditions += " AND EPA_AJUSTA_PERIODO_SIG IS NULL";
        } else if (this.getEpaAjustaPeriodoSig() != null) {
            conditions += " AND EPA_AJUSTA_PERIODO_SIG = ?";
            values.add(this.getEpaAjustaPeriodoSig());
        }

        if (this.getEpaConfFechaPago() != null && this.getEpaConfFechaPago().longValue() == -999) {
            conditions += " AND EPA_CONF_FECHA_PAGO IS NULL";
        } else if (this.getEpaConfFechaPago() != null) {
            conditions += " AND EPA_CONF_FECHA_PAGO = ?";
            values.add(this.getEpaConfFechaPago());
        }

        if (this.getEpaDiaFijo() != null && this.getEpaDiaFijo().longValue() == -999) {
            conditions += " AND EPA_DIA_FIJO IS NULL";
        } else if (this.getEpaDiaFijo() != null) {
            conditions += " AND EPA_DIA_FIJO = ?";
            values.add(this.getEpaDiaFijo());
        }

        if (this.getEpaNumDiaFijo() != null && this.getEpaNumDiaFijo().longValue() == -999) {
            conditions += " AND EPA_NUM_DIA_FIJO IS NULL";
        } else if (this.getEpaNumDiaFijo() != null) {
            conditions += " AND EPA_NUM_DIA_FIJO = ?";
            values.add(this.getEpaNumDiaFijo());
        }

        if (this.getEpaDiasPago() != null && this.getEpaDiasPago().longValue() == -999) {
            conditions += " AND EPA_DIAS_PAGO IS NULL";
        } else if (this.getEpaDiasPago() != null) {
            conditions += " AND EPA_DIAS_PAGO = ?";
            values.add(this.getEpaDiasPago());
        }

        if (this.getEpaDiasCalend() != null && this.getEpaDiasCalend().longValue() == -999) {
            conditions += " AND EPA_DIAS_CALEND IS NULL";
        } else if (this.getEpaDiasCalend() != null) {
            conditions += " AND EPA_DIAS_CALEND = ?";
            values.add(this.getEpaDiasCalend());
        }

        if (this.getEpaDiasPerPago() != null && this.getEpaDiasPerPago().longValue() == -999) {
            conditions += " AND EPA_DIAS_PER_PAGO IS NULL";
        } else if (this.getEpaDiasPerPago() != null) {
            conditions += " AND EPA_DIAS_PER_PAGO = ?";
            values.add(this.getEpaDiasPerPago());
        }

        if (this.getEpaCalculaSigPer() != null && this.getEpaCalculaSigPer().longValue() == -999) {
            conditions += " AND EPA_CALCULA_SIG_PER IS NULL";
        } else if (this.getEpaCalculaSigPer() != null) {
            conditions += " AND EPA_CALCULA_SIG_PER = ?";
            values.add(this.getEpaCalculaSigPer());
        }

        if (this.getEpaDiasInhPago() != null && this.getEpaDiasInhPago().longValue() == -999) {
            conditions += " AND EPA_DIAS_INH_PAGO IS NULL";
        } else if (this.getEpaDiasInhPago() != null) {
            conditions += " AND EPA_DIAS_INH_PAGO = ?";
            values.add(this.getEpaDiasInhPago());
        }

        if (this.getEpaDiasInhCalc() != null && this.getEpaDiasInhCalc().longValue() == -999) {
            conditions += " AND EPA_DIAS_INH_CALC IS NULL";
        } else if (this.getEpaDiasInhCalc() != null) {
            conditions += " AND EPA_DIAS_INH_CALC = ?";
            values.add(this.getEpaDiasInhCalc());
        }

        if (this.getEpaAjustaPer1Per2() != null && this.getEpaAjustaPer1Per2().longValue() == -999) {
            conditions += " AND EPA_AJUSTA_PER1_PER2 IS NULL";
        } else if (this.getEpaAjustaPer1Per2() != null) {
            conditions += " AND EPA_AJUSTA_PER1_PER2 = ?";
            values.add(this.getEpaAjustaPer1Per2());
        }

        if (this.getEpaAnoAltaReg() != null && this.getEpaAnoAltaReg().longValue() == -999) {
            conditions += " AND EPA_ANO_ALTA_REG IS NULL";
        } else if (this.getEpaAnoAltaReg() != null) {
            conditions += " AND EPA_ANO_ALTA_REG = ?";
            values.add(this.getEpaAnoAltaReg());
        }

        if (this.getEpaMesAltaReg() != null && this.getEpaMesAltaReg().longValue() == -999) {
            conditions += " AND EPA_MES_ALTA_REG IS NULL";
        } else if (this.getEpaMesAltaReg() != null) {
            conditions += " AND EPA_MES_ALTA_REG = ?";
            values.add(this.getEpaMesAltaReg());
        }

        if (this.getEpaDiaAltaReg() != null && this.getEpaDiaAltaReg().longValue() == -999) {
            conditions += " AND EPA_DIA_ALTA_REG IS NULL";
        } else if (this.getEpaDiaAltaReg() != null) {
            conditions += " AND EPA_DIA_ALTA_REG = ?";
            values.add(this.getEpaDiaAltaReg());
        }

        if (this.getEpaAnoUltMod() != null && this.getEpaAnoUltMod().longValue() == -999) {
            conditions += " AND EPA_ANO_ULT_MOD IS NULL";
        } else if (this.getEpaAnoUltMod() != null) {
            conditions += " AND EPA_ANO_ULT_MOD = ?";
            values.add(this.getEpaAnoUltMod());
        }

        if (this.getEpaMesUltMod() != null && this.getEpaMesUltMod().longValue() == -999) {
            conditions += " AND EPA_MES_ULT_MOD IS NULL";
        } else if (this.getEpaMesUltMod() != null) {
            conditions += " AND EPA_MES_ULT_MOD = ?";
            values.add(this.getEpaMesUltMod());
        }

        if (this.getEpaDiaUltMod() != null && this.getEpaDiaUltMod().longValue() == -999) {
            conditions += " AND EPA_DIA_ULT_MOD IS NULL";
        } else if (this.getEpaDiaUltMod() != null) {
            conditions += " AND EPA_DIA_ULT_MOD = ?";
            values.add(this.getEpaDiaUltMod());
        }

        if (this.getEpaCveStEmispago() != null && "null".equals(this.getEpaCveStEmispago())) {
            conditions += " AND EPA_CVE_ST_EMISPAGO IS NULL";
        } else if (this.getEpaCveStEmispago() != null) {
            conditions += " AND EPA_CVE_ST_EMISPAGO = ?";
            values.add(this.getEpaCveStEmispago());
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
        String sql = "UPDATE EMISPAGO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EPA_NUM_PROGRAMA = ?";
        pkValues.add(this.getEpaNumPrograma());
        conditions += " AND EPA_NUM_EMISION = ?";
        pkValues.add(this.getEpaNumEmision());
        fields += " EPA_PERIODO_PAGO = ?, ";
        values.add(this.getEpaPeriodoPago());
        fields += " EPA_NUM_DIA_PER_PAGO = ?, ";
        values.add(this.getEpaNumDiaPerPago());
        fields += " EPA_DIAS_ANTES_CALC = ?, ";
        values.add(this.getEpaDiasAntesCalc());
        fields += " EPA_ANO_PAGO = ?, ";
        values.add(this.getEpaAnoPago());
        fields += " EPA_MES_PAGO = ?, ";
        values.add(this.getEpaMesPago());
        fields += " EPA_DIA_PAGO = ?, ";
        values.add(this.getEpaDiaPago());
        fields += " EPA_MESES_NATURALES = ?, ";
        values.add(this.getEpaMesesNaturales());
        fields += " EPA_MESES_COMERCIALES = ?, ";
        values.add(this.getEpaMesesComerciales());
        fields += " EPA_OTRO_PERIODO = ?, ";
        values.add(this.getEpaOtroPeriodo());
        fields += " EPA_DIAS_TRANSCURRIDOS = ?, ";
        values.add(this.getEpaDiasTranscurridos());
        fields += " EPA_DIAS_EFECTIVOS = ?, ";
        values.add(this.getEpaDiasEfectivos());
        fields += " EPA_REVISABLES = ?, ";
        values.add(this.getEpaRevisables());
        fields += " EPA_RECORRE = ?, ";
        values.add(this.getEpaRecorre());
        fields += " EPA_AJUSTA_PERIODO = ?, ";
        values.add(this.getEpaAjustaPeriodo());
        fields += " EPA_AJUSTA_PERIODO_SIG = ?, ";
        values.add(this.getEpaAjustaPeriodoSig());
        fields += " EPA_CONF_FECHA_PAGO = ?, ";
        values.add(this.getEpaConfFechaPago());
        fields += " EPA_DIA_FIJO = ?, ";
        values.add(this.getEpaDiaFijo());
        fields += " EPA_NUM_DIA_FIJO = ?, ";
        values.add(this.getEpaNumDiaFijo());
        fields += " EPA_DIAS_PAGO = ?, ";
        values.add(this.getEpaDiasPago());
        fields += " EPA_DIAS_CALEND = ?, ";
        values.add(this.getEpaDiasCalend());
        fields += " EPA_DIAS_PER_PAGO = ?, ";
        values.add(this.getEpaDiasPerPago());
        fields += " EPA_CALCULA_SIG_PER = ?, ";
        values.add(this.getEpaCalculaSigPer());
        fields += " EPA_DIAS_INH_PAGO = ?, ";
        values.add(this.getEpaDiasInhPago());
        fields += " EPA_DIAS_INH_CALC = ?, ";
        values.add(this.getEpaDiasInhCalc());
        fields += " EPA_AJUSTA_PER1_PER2 = ?, ";
        values.add(this.getEpaAjustaPer1Per2());
        fields += " EPA_ANO_ALTA_REG = ?, ";
        values.add(this.getEpaAnoAltaReg());
        fields += " EPA_MES_ALTA_REG = ?, ";
        values.add(this.getEpaMesAltaReg());
        fields += " EPA_DIA_ALTA_REG = ?, ";
        values.add(this.getEpaDiaAltaReg());
        fields += " EPA_ANO_ULT_MOD = ?, ";
        values.add(this.getEpaAnoUltMod());
        fields += " EPA_MES_ULT_MOD = ?, ";
        values.add(this.getEpaMesUltMod());
        fields += " EPA_DIA_ULT_MOD = ?, ";
        values.add(this.getEpaDiaUltMod());
        fields += " EPA_CVE_ST_EMISPAGO = ?, ";
        values.add(this.getEpaCveStEmispago());
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
        String sql = "INSERT INTO EMISPAGO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EPA_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEpaNumPrograma());

        fields += ", EPA_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEpaNumEmision());

        fields += ", EPA_PERIODO_PAGO";
        fieldValues += ", ?";
        values.add(this.getEpaPeriodoPago());

        fields += ", EPA_NUM_DIA_PER_PAGO";
        fieldValues += ", ?";
        values.add(this.getEpaNumDiaPerPago());

        fields += ", EPA_DIAS_ANTES_CALC";
        fieldValues += ", ?";
        values.add(this.getEpaDiasAntesCalc());

        fields += ", EPA_ANO_PAGO";
        fieldValues += ", ?";
        values.add(this.getEpaAnoPago());

        fields += ", EPA_MES_PAGO";
        fieldValues += ", ?";
        values.add(this.getEpaMesPago());

        fields += ", EPA_DIA_PAGO";
        fieldValues += ", ?";
        values.add(this.getEpaDiaPago());

        fields += ", EPA_MESES_NATURALES";
        fieldValues += ", ?";
        values.add(this.getEpaMesesNaturales());

        fields += ", EPA_MESES_COMERCIALES";
        fieldValues += ", ?";
        values.add(this.getEpaMesesComerciales());

        fields += ", EPA_OTRO_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEpaOtroPeriodo());

        fields += ", EPA_DIAS_TRANSCURRIDOS";
        fieldValues += ", ?";
        values.add(this.getEpaDiasTranscurridos());

        fields += ", EPA_DIAS_EFECTIVOS";
        fieldValues += ", ?";
        values.add(this.getEpaDiasEfectivos());

        fields += ", EPA_REVISABLES";
        fieldValues += ", ?";
        values.add(this.getEpaRevisables());

        fields += ", EPA_RECORRE";
        fieldValues += ", ?";
        values.add(this.getEpaRecorre());

        fields += ", EPA_AJUSTA_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEpaAjustaPeriodo());

        fields += ", EPA_AJUSTA_PERIODO_SIG";
        fieldValues += ", ?";
        values.add(this.getEpaAjustaPeriodoSig());

        fields += ", EPA_CONF_FECHA_PAGO";
        fieldValues += ", ?";
        values.add(this.getEpaConfFechaPago());

        fields += ", EPA_DIA_FIJO";
        fieldValues += ", ?";
        values.add(this.getEpaDiaFijo());

        fields += ", EPA_NUM_DIA_FIJO";
        fieldValues += ", ?";
        values.add(this.getEpaNumDiaFijo());

        fields += ", EPA_DIAS_PAGO";
        fieldValues += ", ?";
        values.add(this.getEpaDiasPago());

        fields += ", EPA_DIAS_CALEND";
        fieldValues += ", ?";
        values.add(this.getEpaDiasCalend());

        fields += ", EPA_DIAS_PER_PAGO";
        fieldValues += ", ?";
        values.add(this.getEpaDiasPerPago());

        fields += ", EPA_CALCULA_SIG_PER";
        fieldValues += ", ?";
        values.add(this.getEpaCalculaSigPer());

        fields += ", EPA_DIAS_INH_PAGO";
        fieldValues += ", ?";
        values.add(this.getEpaDiasInhPago());

        fields += ", EPA_DIAS_INH_CALC";
        fieldValues += ", ?";
        values.add(this.getEpaDiasInhCalc());

        fields += ", EPA_AJUSTA_PER1_PER2";
        fieldValues += ", ?";
        values.add(this.getEpaAjustaPer1Per2());

        fields += ", EPA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEpaAnoAltaReg());

        fields += ", EPA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEpaMesAltaReg());

        fields += ", EPA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEpaDiaAltaReg());

        fields += ", EPA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEpaAnoUltMod());

        fields += ", EPA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEpaMesUltMod());

        fields += ", EPA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEpaDiaUltMod());

        fields += ", EPA_CVE_ST_EMISPAGO";
        fieldValues += ", ?";
        values.add(this.getEpaCveStEmispago());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISPAGO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EPA_NUM_PROGRAMA = ?";
        values.add(this.getEpaNumPrograma());
        conditions += " AND EPA_NUM_EMISION = ?";
        values.add(this.getEpaNumEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emispago instance = (Emispago) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEpaNumPrograma().equals(instance.getEpaNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEpaNumEmision().equals(instance.getEpaNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEpaPeriodoPago().equals(instance.getEpaPeriodoPago()))
            equalObjects = false;
        if (equalObjects && !this.getEpaNumDiaPerPago().equals(instance.getEpaNumDiaPerPago()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiasAntesCalc().equals(instance.getEpaDiasAntesCalc()))
            equalObjects = false;
        if (equalObjects && !this.getEpaAnoPago().equals(instance.getEpaAnoPago()))
            equalObjects = false;
        if (equalObjects && !this.getEpaMesPago().equals(instance.getEpaMesPago()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiaPago().equals(instance.getEpaDiaPago()))
            equalObjects = false;
        if (equalObjects && !this.getEpaMesesNaturales().equals(instance.getEpaMesesNaturales()))
            equalObjects = false;
        if (equalObjects && !this.getEpaMesesComerciales().equals(instance.getEpaMesesComerciales()))
            equalObjects = false;
        if (equalObjects && !this.getEpaOtroPeriodo().equals(instance.getEpaOtroPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiasTranscurridos().equals(instance.getEpaDiasTranscurridos()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiasEfectivos().equals(instance.getEpaDiasEfectivos()))
            equalObjects = false;
        if (equalObjects && !this.getEpaRevisables().equals(instance.getEpaRevisables()))
            equalObjects = false;
        if (equalObjects && !this.getEpaRecorre().equals(instance.getEpaRecorre()))
            equalObjects = false;
        if (equalObjects && !this.getEpaAjustaPeriodo().equals(instance.getEpaAjustaPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEpaAjustaPeriodoSig().equals(instance.getEpaAjustaPeriodoSig()))
            equalObjects = false;
        if (equalObjects && !this.getEpaConfFechaPago().equals(instance.getEpaConfFechaPago()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiaFijo().equals(instance.getEpaDiaFijo()))
            equalObjects = false;
        if (equalObjects && !this.getEpaNumDiaFijo().equals(instance.getEpaNumDiaFijo()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiasPago().equals(instance.getEpaDiasPago()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiasCalend().equals(instance.getEpaDiasCalend()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiasPerPago().equals(instance.getEpaDiasPerPago()))
            equalObjects = false;
        if (equalObjects && !this.getEpaCalculaSigPer().equals(instance.getEpaCalculaSigPer()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiasInhPago().equals(instance.getEpaDiasInhPago()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiasInhCalc().equals(instance.getEpaDiasInhCalc()))
            equalObjects = false;
        if (equalObjects && !this.getEpaAjustaPer1Per2().equals(instance.getEpaAjustaPer1Per2()))
            equalObjects = false;
        if (equalObjects && !this.getEpaAnoAltaReg().equals(instance.getEpaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEpaMesAltaReg().equals(instance.getEpaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiaAltaReg().equals(instance.getEpaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEpaAnoUltMod().equals(instance.getEpaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEpaMesUltMod().equals(instance.getEpaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEpaDiaUltMod().equals(instance.getEpaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEpaCveStEmispago().equals(instance.getEpaCveStEmispago()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emispago result = new Emispago();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEpaNumPrograma((BigDecimal) objectData.getData("EPA_NUM_PROGRAMA"));
        result.setEpaNumEmision((BigDecimal) objectData.getData("EPA_NUM_EMISION"));
        result.setEpaPeriodoPago((String) objectData.getData("EPA_PERIODO_PAGO"));
        result.setEpaNumDiaPerPago((BigDecimal) objectData.getData("EPA_NUM_DIA_PER_PAGO"));
        result.setEpaDiasAntesCalc((BigDecimal) objectData.getData("EPA_DIAS_ANTES_CALC"));
        result.setEpaAnoPago((BigDecimal) objectData.getData("EPA_ANO_PAGO"));
        result.setEpaMesPago((BigDecimal) objectData.getData("EPA_MES_PAGO"));
        result.setEpaDiaPago((BigDecimal) objectData.getData("EPA_DIA_PAGO"));
        result.setEpaMesesNaturales((BigDecimal) objectData.getData("EPA_MESES_NATURALES"));
        result.setEpaMesesComerciales((BigDecimal) objectData.getData("EPA_MESES_COMERCIALES"));
        result.setEpaOtroPeriodo((String) objectData.getData("EPA_OTRO_PERIODO"));
        result.setEpaDiasTranscurridos((BigDecimal) objectData.getData("EPA_DIAS_TRANSCURRIDOS"));
        result.setEpaDiasEfectivos((BigDecimal) objectData.getData("EPA_DIAS_EFECTIVOS"));
        result.setEpaRevisables((BigDecimal) objectData.getData("EPA_REVISABLES"));
        result.setEpaRecorre((BigDecimal) objectData.getData("EPA_RECORRE"));
        result.setEpaAjustaPeriodo((BigDecimal) objectData.getData("EPA_AJUSTA_PERIODO"));
        result.setEpaAjustaPeriodoSig((BigDecimal) objectData.getData("EPA_AJUSTA_PERIODO_SIG"));
        result.setEpaConfFechaPago((BigDecimal) objectData.getData("EPA_CONF_FECHA_PAGO"));
        result.setEpaDiaFijo((BigDecimal) objectData.getData("EPA_DIA_FIJO"));
        result.setEpaNumDiaFijo((BigDecimal) objectData.getData("EPA_NUM_DIA_FIJO"));
        result.setEpaDiasPago((BigDecimal) objectData.getData("EPA_DIAS_PAGO"));
        result.setEpaDiasCalend((BigDecimal) objectData.getData("EPA_DIAS_CALEND"));
        result.setEpaDiasPerPago((BigDecimal) objectData.getData("EPA_DIAS_PER_PAGO"));
        result.setEpaCalculaSigPer((BigDecimal) objectData.getData("EPA_CALCULA_SIG_PER"));
        result.setEpaDiasInhPago((BigDecimal) objectData.getData("EPA_DIAS_INH_PAGO"));
        result.setEpaDiasInhCalc((BigDecimal) objectData.getData("EPA_DIAS_INH_CALC"));
        result.setEpaAjustaPer1Per2((BigDecimal) objectData.getData("EPA_AJUSTA_PER1_PER2"));
        result.setEpaAnoAltaReg((BigDecimal) objectData.getData("EPA_ANO_ALTA_REG"));
        result.setEpaMesAltaReg((BigDecimal) objectData.getData("EPA_MES_ALTA_REG"));
        result.setEpaDiaAltaReg((BigDecimal) objectData.getData("EPA_DIA_ALTA_REG"));
        result.setEpaAnoUltMod((BigDecimal) objectData.getData("EPA_ANO_ULT_MOD"));
        result.setEpaMesUltMod((BigDecimal) objectData.getData("EPA_MES_ULT_MOD"));
        result.setEpaDiaUltMod((BigDecimal) objectData.getData("EPA_DIA_ULT_MOD"));
        result.setEpaCveStEmispago((String) objectData.getData("EPA_CVE_ST_EMISPAGO"));

        return result;

    }

}
