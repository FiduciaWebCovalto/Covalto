package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIPAGO_PK", columns = { "EEPA_ID_PROGRAMA", "EEPA_ID_FIDEICOMISO", "EEPA_ID_EMISION" }, sequences = { "MANUAL" })
public class FEmipago extends DomainObject {

    BigDecimal eepaIdPrograma = null;
    BigDecimal eepaIdFideicomiso = null;
    BigDecimal eepaIdEmision = null;
    String eepaPeriodoPago = null;
    BigDecimal eepaNumDiaPerPago = null;
    BigDecimal eepaDiasAntesCalc = null;
    String eepaFecPago = null;
    BigDecimal eepaMesesNaturales = null;
    BigDecimal eepaMesesComerciales = null;
    String eepaOtroPeriodo = null;
    BigDecimal eepaDiasTranscurridos = null;
    BigDecimal eepaDiasEfectivos = null;
    BigDecimal eepaRevisables = null;
    BigDecimal eepaRecorre = null;
    BigDecimal eepaAjustaPeriodo = null;
    BigDecimal eepaAjustaPeriodoSig = null;
    BigDecimal eepaConfFechaPago = null;
    BigDecimal eepaDiaFijo = null;
    BigDecimal eepaNumDiaFijo = null;
    BigDecimal eepaDiasPago = null;
    BigDecimal eepaDiasCalend = null;
    BigDecimal eepaDiasPerPago = null;
    BigDecimal eepaCalculaSigPer = null;
    BigDecimal eepaDiasInhPago = null;
    BigDecimal eepaDiasInhCalc = null;
    BigDecimal eepaAjustaPer1Per2 = null;
    String eepaStEmipago = null;

    public FEmipago() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepaIdPrograma(BigDecimal eepaIdPrograma) {
        this.eepaIdPrograma = eepaIdPrograma;
    }

    public BigDecimal getEepaIdPrograma() {
        return this.eepaIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepaIdFideicomiso(BigDecimal eepaIdFideicomiso) {
        this.eepaIdFideicomiso = eepaIdFideicomiso;
    }

    public BigDecimal getEepaIdFideicomiso() {
        return this.eepaIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepaIdEmision(BigDecimal eepaIdEmision) {
        this.eepaIdEmision = eepaIdEmision;
    }

    public BigDecimal getEepaIdEmision() {
        return this.eepaIdEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEepaPeriodoPago(String eepaPeriodoPago) {
        this.eepaPeriodoPago = eepaPeriodoPago;
    }

    public String getEepaPeriodoPago() {
        return this.eepaPeriodoPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepaNumDiaPerPago(BigDecimal eepaNumDiaPerPago) {
        this.eepaNumDiaPerPago = eepaNumDiaPerPago;
    }

    public BigDecimal getEepaNumDiaPerPago() {
        return this.eepaNumDiaPerPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaDiasAntesCalc(BigDecimal eepaDiasAntesCalc) {
        this.eepaDiasAntesCalc = eepaDiasAntesCalc;
    }

    public BigDecimal getEepaDiasAntesCalc() {
        return this.eepaDiasAntesCalc;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEepaFecPago(String eepaFecPago) {
        this.eepaFecPago = eepaFecPago;
    }

    public String getEepaFecPago() {
        return this.eepaFecPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaMesesNaturales(BigDecimal eepaMesesNaturales) {
        this.eepaMesesNaturales = eepaMesesNaturales;
    }

    public BigDecimal getEepaMesesNaturales() {
        return this.eepaMesesNaturales;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaMesesComerciales(BigDecimal eepaMesesComerciales) {
        this.eepaMesesComerciales = eepaMesesComerciales;
    }

    public BigDecimal getEepaMesesComerciales() {
        return this.eepaMesesComerciales;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEepaOtroPeriodo(String eepaOtroPeriodo) {
        this.eepaOtroPeriodo = eepaOtroPeriodo;
    }

    public String getEepaOtroPeriodo() {
        return this.eepaOtroPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaDiasTranscurridos(BigDecimal eepaDiasTranscurridos) {
        this.eepaDiasTranscurridos = eepaDiasTranscurridos;
    }

    public BigDecimal getEepaDiasTranscurridos() {
        return this.eepaDiasTranscurridos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaDiasEfectivos(BigDecimal eepaDiasEfectivos) {
        this.eepaDiasEfectivos = eepaDiasEfectivos;
    }

    public BigDecimal getEepaDiasEfectivos() {
        return this.eepaDiasEfectivos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaRevisables(BigDecimal eepaRevisables) {
        this.eepaRevisables = eepaRevisables;
    }

    public BigDecimal getEepaRevisables() {
        return this.eepaRevisables;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaRecorre(BigDecimal eepaRecorre) {
        this.eepaRecorre = eepaRecorre;
    }

    public BigDecimal getEepaRecorre() {
        return this.eepaRecorre;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaAjustaPeriodo(BigDecimal eepaAjustaPeriodo) {
        this.eepaAjustaPeriodo = eepaAjustaPeriodo;
    }

    public BigDecimal getEepaAjustaPeriodo() {
        return this.eepaAjustaPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaAjustaPeriodoSig(BigDecimal eepaAjustaPeriodoSig) {
        this.eepaAjustaPeriodoSig = eepaAjustaPeriodoSig;
    }

    public BigDecimal getEepaAjustaPeriodoSig() {
        return this.eepaAjustaPeriodoSig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaConfFechaPago(BigDecimal eepaConfFechaPago) {
        this.eepaConfFechaPago = eepaConfFechaPago;
    }

    public BigDecimal getEepaConfFechaPago() {
        return this.eepaConfFechaPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaDiaFijo(BigDecimal eepaDiaFijo) {
        this.eepaDiaFijo = eepaDiaFijo;
    }

    public BigDecimal getEepaDiaFijo() {
        return this.eepaDiaFijo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEepaNumDiaFijo(BigDecimal eepaNumDiaFijo) {
        this.eepaNumDiaFijo = eepaNumDiaFijo;
    }

    public BigDecimal getEepaNumDiaFijo() {
        return this.eepaNumDiaFijo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaDiasPago(BigDecimal eepaDiasPago) {
        this.eepaDiasPago = eepaDiasPago;
    }

    public BigDecimal getEepaDiasPago() {
        return this.eepaDiasPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaDiasCalend(BigDecimal eepaDiasCalend) {
        this.eepaDiasCalend = eepaDiasCalend;
    }

    public BigDecimal getEepaDiasCalend() {
        return this.eepaDiasCalend;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaDiasPerPago(BigDecimal eepaDiasPerPago) {
        this.eepaDiasPerPago = eepaDiasPerPago;
    }

    public BigDecimal getEepaDiasPerPago() {
        return this.eepaDiasPerPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaCalculaSigPer(BigDecimal eepaCalculaSigPer) {
        this.eepaCalculaSigPer = eepaCalculaSigPer;
    }

    public BigDecimal getEepaCalculaSigPer() {
        return this.eepaCalculaSigPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaDiasInhPago(BigDecimal eepaDiasInhPago) {
        this.eepaDiasInhPago = eepaDiasInhPago;
    }

    public BigDecimal getEepaDiasInhPago() {
        return this.eepaDiasInhPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaDiasInhCalc(BigDecimal eepaDiasInhCalc) {
        this.eepaDiasInhCalc = eepaDiasInhCalc;
    }

    public BigDecimal getEepaDiasInhCalc() {
        return this.eepaDiasInhCalc;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEepaAjustaPer1Per2(BigDecimal eepaAjustaPer1Per2) {
        this.eepaAjustaPer1Per2 = eepaAjustaPer1Per2;
    }

    public BigDecimal getEepaAjustaPer1Per2() {
        return this.eepaAjustaPer1Per2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEepaStEmipago(String eepaStEmipago) {
        this.eepaStEmipago = eepaStEmipago;
    }

    public String getEepaStEmipago() {
        return this.eepaStEmipago;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIPAGO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEepaIdPrograma() != null && this.getEepaIdPrograma().longValue() == -999) {
            conditions += " AND EEPA_ID_PROGRAMA IS NULL";
        } else if (this.getEepaIdPrograma() != null) {
            conditions += " AND EEPA_ID_PROGRAMA = ?";
            values.add(this.getEepaIdPrograma());
        }

        if (this.getEepaIdFideicomiso() != null && this.getEepaIdFideicomiso().longValue() == -999) {
            conditions += " AND EEPA_ID_FIDEICOMISO IS NULL";
        } else if (this.getEepaIdFideicomiso() != null) {
            conditions += " AND EEPA_ID_FIDEICOMISO = ?";
            values.add(this.getEepaIdFideicomiso());
        }

        if (this.getEepaIdEmision() != null && this.getEepaIdEmision().longValue() == -999) {
            conditions += " AND EEPA_ID_EMISION IS NULL";
        } else if (this.getEepaIdEmision() != null) {
            conditions += " AND EEPA_ID_EMISION = ?";
            values.add(this.getEepaIdEmision());
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
        String sql = "SELECT * FROM F_EMIPAGO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEepaIdPrograma() != null && this.getEepaIdPrograma().longValue() == -999) {
            conditions += " AND EEPA_ID_PROGRAMA IS NULL";
        } else if (this.getEepaIdPrograma() != null) {
            conditions += " AND EEPA_ID_PROGRAMA = ?";
            values.add(this.getEepaIdPrograma());
        }

        if (this.getEepaIdFideicomiso() != null && this.getEepaIdFideicomiso().longValue() == -999) {
            conditions += " AND EEPA_ID_FIDEICOMISO IS NULL";
        } else if (this.getEepaIdFideicomiso() != null) {
            conditions += " AND EEPA_ID_FIDEICOMISO = ?";
            values.add(this.getEepaIdFideicomiso());
        }

        if (this.getEepaIdEmision() != null && this.getEepaIdEmision().longValue() == -999) {
            conditions += " AND EEPA_ID_EMISION IS NULL";
        } else if (this.getEepaIdEmision() != null) {
            conditions += " AND EEPA_ID_EMISION = ?";
            values.add(this.getEepaIdEmision());
        }

        if (this.getEepaPeriodoPago() != null && "null".equals(this.getEepaPeriodoPago())) {
            conditions += " AND EEPA_PERIODO_PAGO IS NULL";
        } else if (this.getEepaPeriodoPago() != null) {
            conditions += " AND EEPA_PERIODO_PAGO = ?";
            values.add(this.getEepaPeriodoPago());
        }

        if (this.getEepaNumDiaPerPago() != null && this.getEepaNumDiaPerPago().longValue() == -999) {
            conditions += " AND EEPA_NUM_DIA_PER_PAGO IS NULL";
        } else if (this.getEepaNumDiaPerPago() != null) {
            conditions += " AND EEPA_NUM_DIA_PER_PAGO = ?";
            values.add(this.getEepaNumDiaPerPago());
        }

        if (this.getEepaDiasAntesCalc() != null && this.getEepaDiasAntesCalc().longValue() == -999) {
            conditions += " AND EEPA_DIAS_ANTES_CALC IS NULL";
        } else if (this.getEepaDiasAntesCalc() != null) {
            conditions += " AND EEPA_DIAS_ANTES_CALC = ?";
            values.add(this.getEepaDiasAntesCalc());
        }

        if (this.getEepaFecPago() != null && "null".equals(this.getEepaFecPago())) {
            conditions += " AND EEPA_FEC_PAGO IS NULL";
        } else if (this.getEepaFecPago() != null) {
            conditions += " AND EEPA_FEC_PAGO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEepaFecPago());
        }

        if (this.getEepaMesesNaturales() != null && this.getEepaMesesNaturales().longValue() == -999) {
            conditions += " AND EEPA_MESES_NATURALES IS NULL";
        } else if (this.getEepaMesesNaturales() != null) {
            conditions += " AND EEPA_MESES_NATURALES = ?";
            values.add(this.getEepaMesesNaturales());
        }

        if (this.getEepaMesesComerciales() != null && this.getEepaMesesComerciales().longValue() == -999) {
            conditions += " AND EEPA_MESES_COMERCIALES IS NULL";
        } else if (this.getEepaMesesComerciales() != null) {
            conditions += " AND EEPA_MESES_COMERCIALES = ?";
            values.add(this.getEepaMesesComerciales());
        }

        if (this.getEepaOtroPeriodo() != null && "null".equals(this.getEepaOtroPeriodo())) {
            conditions += " AND EEPA_OTRO_PERIODO IS NULL";
        } else if (this.getEepaOtroPeriodo() != null) {
            conditions += " AND EEPA_OTRO_PERIODO = ?";
            values.add(this.getEepaOtroPeriodo());
        }

        if (this.getEepaDiasTranscurridos() != null && this.getEepaDiasTranscurridos().longValue() == -999) {
            conditions += " AND EEPA_DIAS_TRANSCURRIDOS IS NULL";
        } else if (this.getEepaDiasTranscurridos() != null) {
            conditions += " AND EEPA_DIAS_TRANSCURRIDOS = ?";
            values.add(this.getEepaDiasTranscurridos());
        }

        if (this.getEepaDiasEfectivos() != null && this.getEepaDiasEfectivos().longValue() == -999) {
            conditions += " AND EEPA_DIAS_EFECTIVOS IS NULL";
        } else if (this.getEepaDiasEfectivos() != null) {
            conditions += " AND EEPA_DIAS_EFECTIVOS = ?";
            values.add(this.getEepaDiasEfectivos());
        }

        if (this.getEepaRevisables() != null && this.getEepaRevisables().longValue() == -999) {
            conditions += " AND EEPA_REVISABLES IS NULL";
        } else if (this.getEepaRevisables() != null) {
            conditions += " AND EEPA_REVISABLES = ?";
            values.add(this.getEepaRevisables());
        }

        if (this.getEepaRecorre() != null && this.getEepaRecorre().longValue() == -999) {
            conditions += " AND EEPA_RECORRE IS NULL";
        } else if (this.getEepaRecorre() != null) {
            conditions += " AND EEPA_RECORRE = ?";
            values.add(this.getEepaRecorre());
        }

        if (this.getEepaAjustaPeriodo() != null && this.getEepaAjustaPeriodo().longValue() == -999) {
            conditions += " AND EEPA_AJUSTA_PERIODO IS NULL";
        } else if (this.getEepaAjustaPeriodo() != null) {
            conditions += " AND EEPA_AJUSTA_PERIODO = ?";
            values.add(this.getEepaAjustaPeriodo());
        }

        if (this.getEepaAjustaPeriodoSig() != null && this.getEepaAjustaPeriodoSig().longValue() == -999) {
            conditions += " AND EEPA_AJUSTA_PERIODO_SIG IS NULL";
        } else if (this.getEepaAjustaPeriodoSig() != null) {
            conditions += " AND EEPA_AJUSTA_PERIODO_SIG = ?";
            values.add(this.getEepaAjustaPeriodoSig());
        }

        if (this.getEepaConfFechaPago() != null && this.getEepaConfFechaPago().longValue() == -999) {
            conditions += " AND EEPA_CONF_FECHA_PAGO IS NULL";
        } else if (this.getEepaConfFechaPago() != null) {
            conditions += " AND EEPA_CONF_FECHA_PAGO = ?";
            values.add(this.getEepaConfFechaPago());
        }

        if (this.getEepaDiaFijo() != null && this.getEepaDiaFijo().longValue() == -999) {
            conditions += " AND EEPA_DIA_FIJO IS NULL";
        } else if (this.getEepaDiaFijo() != null) {
            conditions += " AND EEPA_DIA_FIJO = ?";
            values.add(this.getEepaDiaFijo());
        }

        if (this.getEepaNumDiaFijo() != null && this.getEepaNumDiaFijo().longValue() == -999) {
            conditions += " AND EEPA_NUM_DIA_FIJO IS NULL";
        } else if (this.getEepaNumDiaFijo() != null) {
            conditions += " AND EEPA_NUM_DIA_FIJO = ?";
            values.add(this.getEepaNumDiaFijo());
        }

        if (this.getEepaDiasPago() != null && this.getEepaDiasPago().longValue() == -999) {
            conditions += " AND EEPA_DIAS_PAGO IS NULL";
        } else if (this.getEepaDiasPago() != null) {
            conditions += " AND EEPA_DIAS_PAGO = ?";
            values.add(this.getEepaDiasPago());
        }

        if (this.getEepaDiasCalend() != null && this.getEepaDiasCalend().longValue() == -999) {
            conditions += " AND EEPA_DIAS_CALEND IS NULL";
        } else if (this.getEepaDiasCalend() != null) {
            conditions += " AND EEPA_DIAS_CALEND = ?";
            values.add(this.getEepaDiasCalend());
        }

        if (this.getEepaDiasPerPago() != null && this.getEepaDiasPerPago().longValue() == -999) {
            conditions += " AND EEPA_DIAS_PER_PAGO IS NULL";
        } else if (this.getEepaDiasPerPago() != null) {
            conditions += " AND EEPA_DIAS_PER_PAGO = ?";
            values.add(this.getEepaDiasPerPago());
        }

        if (this.getEepaCalculaSigPer() != null && this.getEepaCalculaSigPer().longValue() == -999) {
            conditions += " AND EEPA_CALCULA_SIG_PER IS NULL";
        } else if (this.getEepaCalculaSigPer() != null) {
            conditions += " AND EEPA_CALCULA_SIG_PER = ?";
            values.add(this.getEepaCalculaSigPer());
        }

        if (this.getEepaDiasInhPago() != null && this.getEepaDiasInhPago().longValue() == -999) {
            conditions += " AND EEPA_DIAS_INH_PAGO IS NULL";
        } else if (this.getEepaDiasInhPago() != null) {
            conditions += " AND EEPA_DIAS_INH_PAGO = ?";
            values.add(this.getEepaDiasInhPago());
        }

        if (this.getEepaDiasInhCalc() != null && this.getEepaDiasInhCalc().longValue() == -999) {
            conditions += " AND EEPA_DIAS_INH_CALC IS NULL";
        } else if (this.getEepaDiasInhCalc() != null) {
            conditions += " AND EEPA_DIAS_INH_CALC = ?";
            values.add(this.getEepaDiasInhCalc());
        }

        if (this.getEepaAjustaPer1Per2() != null && this.getEepaAjustaPer1Per2().longValue() == -999) {
            conditions += " AND EEPA_AJUSTA_PER1_PER2 IS NULL";
        } else if (this.getEepaAjustaPer1Per2() != null) {
            conditions += " AND EEPA_AJUSTA_PER1_PER2 = ?";
            values.add(this.getEepaAjustaPer1Per2());
        }

        if (this.getEepaStEmipago() != null && "null".equals(this.getEepaStEmipago())) {
            conditions += " AND EEPA_ST_EMIPAGO IS NULL";
        } else if (this.getEepaStEmipago() != null) {
            conditions += " AND EEPA_ST_EMIPAGO = ?";
            values.add(this.getEepaStEmipago());
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
        String sql = "UPDATE F_EMIPAGO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEPA_ID_PROGRAMA = ?";
        pkValues.add(this.getEepaIdPrograma());
        conditions += " AND EEPA_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEepaIdFideicomiso());
        conditions += " AND EEPA_ID_EMISION = ?";
        pkValues.add(this.getEepaIdEmision());
        fields += " EEPA_PERIODO_PAGO = ?, ";
        values.add(this.getEepaPeriodoPago());
        fields += " EEPA_NUM_DIA_PER_PAGO = ?, ";
        values.add(this.getEepaNumDiaPerPago());
        fields += " EEPA_DIAS_ANTES_CALC = ?, ";
        values.add(this.getEepaDiasAntesCalc());
        fields += " EEPA_FEC_PAGO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEepaFecPago());
        fields += " EEPA_MESES_NATURALES = ?, ";
        values.add(this.getEepaMesesNaturales());
        fields += " EEPA_MESES_COMERCIALES = ?, ";
        values.add(this.getEepaMesesComerciales());
        fields += " EEPA_OTRO_PERIODO = ?, ";
        values.add(this.getEepaOtroPeriodo());
        fields += " EEPA_DIAS_TRANSCURRIDOS = ?, ";
        values.add(this.getEepaDiasTranscurridos());
        fields += " EEPA_DIAS_EFECTIVOS = ?, ";
        values.add(this.getEepaDiasEfectivos());
        fields += " EEPA_REVISABLES = ?, ";
        values.add(this.getEepaRevisables());
        fields += " EEPA_RECORRE = ?, ";
        values.add(this.getEepaRecorre());
        fields += " EEPA_AJUSTA_PERIODO = ?, ";
        values.add(this.getEepaAjustaPeriodo());
        fields += " EEPA_AJUSTA_PERIODO_SIG = ?, ";
        values.add(this.getEepaAjustaPeriodoSig());
        fields += " EEPA_CONF_FECHA_PAGO = ?, ";
        values.add(this.getEepaConfFechaPago());
        fields += " EEPA_DIA_FIJO = ?, ";
        values.add(this.getEepaDiaFijo());
        fields += " EEPA_NUM_DIA_FIJO = ?, ";
        values.add(this.getEepaNumDiaFijo());
        fields += " EEPA_DIAS_PAGO = ?, ";
        values.add(this.getEepaDiasPago());
        fields += " EEPA_DIAS_CALEND = ?, ";
        values.add(this.getEepaDiasCalend());
        fields += " EEPA_DIAS_PER_PAGO = ?, ";
        values.add(this.getEepaDiasPerPago());
        fields += " EEPA_CALCULA_SIG_PER = ?, ";
        values.add(this.getEepaCalculaSigPer());
        fields += " EEPA_DIAS_INH_PAGO = ?, ";
        values.add(this.getEepaDiasInhPago());
        fields += " EEPA_DIAS_INH_CALC = ?, ";
        values.add(this.getEepaDiasInhCalc());
        fields += " EEPA_AJUSTA_PER1_PER2 = ?, ";
        values.add(this.getEepaAjustaPer1Per2());
        fields += " EEPA_ST_EMIPAGO = ?, ";
        values.add(this.getEepaStEmipago());
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
        String sql = "INSERT INTO F_EMIPAGO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEPA_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEepaIdPrograma());

        fields += ", EEPA_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEepaIdFideicomiso());

        fields += ", EEPA_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEepaIdEmision());

        fields += ", EEPA_PERIODO_PAGO";
        fieldValues += ", ?";
        values.add(this.getEepaPeriodoPago());

        fields += ", EEPA_NUM_DIA_PER_PAGO";
        fieldValues += ", ?";
        values.add(this.getEepaNumDiaPerPago());

        fields += ", EEPA_DIAS_ANTES_CALC";
        fieldValues += ", ?";
        values.add(this.getEepaDiasAntesCalc());

        fields += ", EEPA_FEC_PAGO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEepaFecPago());

        fields += ", EEPA_MESES_NATURALES";
        fieldValues += ", ?";
        values.add(this.getEepaMesesNaturales());

        fields += ", EEPA_MESES_COMERCIALES";
        fieldValues += ", ?";
        values.add(this.getEepaMesesComerciales());

        fields += ", EEPA_OTRO_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEepaOtroPeriodo());

        fields += ", EEPA_DIAS_TRANSCURRIDOS";
        fieldValues += ", ?";
        values.add(this.getEepaDiasTranscurridos());

        fields += ", EEPA_DIAS_EFECTIVOS";
        fieldValues += ", ?";
        values.add(this.getEepaDiasEfectivos());

        fields += ", EEPA_REVISABLES";
        fieldValues += ", ?";
        values.add(this.getEepaRevisables());

        fields += ", EEPA_RECORRE";
        fieldValues += ", ?";
        values.add(this.getEepaRecorre());

        fields += ", EEPA_AJUSTA_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEepaAjustaPeriodo());

        fields += ", EEPA_AJUSTA_PERIODO_SIG";
        fieldValues += ", ?";
        values.add(this.getEepaAjustaPeriodoSig());

        fields += ", EEPA_CONF_FECHA_PAGO";
        fieldValues += ", ?";
        values.add(this.getEepaConfFechaPago());

        fields += ", EEPA_DIA_FIJO";
        fieldValues += ", ?";
        values.add(this.getEepaDiaFijo());

        fields += ", EEPA_NUM_DIA_FIJO";
        fieldValues += ", ?";
        values.add(this.getEepaNumDiaFijo());

        fields += ", EEPA_DIAS_PAGO";
        fieldValues += ", ?";
        values.add(this.getEepaDiasPago());

        fields += ", EEPA_DIAS_CALEND";
        fieldValues += ", ?";
        values.add(this.getEepaDiasCalend());

        fields += ", EEPA_DIAS_PER_PAGO";
        fieldValues += ", ?";
        values.add(this.getEepaDiasPerPago());

        fields += ", EEPA_CALCULA_SIG_PER";
        fieldValues += ", ?";
        values.add(this.getEepaCalculaSigPer());

        fields += ", EEPA_DIAS_INH_PAGO";
        fieldValues += ", ?";
        values.add(this.getEepaDiasInhPago());

        fields += ", EEPA_DIAS_INH_CALC";
        fieldValues += ", ?";
        values.add(this.getEepaDiasInhCalc());

        fields += ", EEPA_AJUSTA_PER1_PER2";
        fieldValues += ", ?";
        values.add(this.getEepaAjustaPer1Per2());

        fields += ", EEPA_ST_EMIPAGO";
        fieldValues += ", ?";
        values.add(this.getEepaStEmipago());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIPAGO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEPA_ID_PROGRAMA = ?";
        values.add(this.getEepaIdPrograma());
        conditions += " AND EEPA_ID_FIDEICOMISO = ?";
        values.add(this.getEepaIdFideicomiso());
        conditions += " AND EEPA_ID_EMISION = ?";
        values.add(this.getEepaIdEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmipago instance = (FEmipago) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEepaIdPrograma().equals(instance.getEepaIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEepaIdFideicomiso().equals(instance.getEepaIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEepaIdEmision().equals(instance.getEepaIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEepaPeriodoPago().equals(instance.getEepaPeriodoPago()))
            equalObjects = false;
        if (equalObjects && !this.getEepaNumDiaPerPago().equals(instance.getEepaNumDiaPerPago()))
            equalObjects = false;
        if (equalObjects && !this.getEepaDiasAntesCalc().equals(instance.getEepaDiasAntesCalc()))
            equalObjects = false;
        if (equalObjects && !this.getEepaFecPago().equals(instance.getEepaFecPago()))
            equalObjects = false;
        if (equalObjects && !this.getEepaMesesNaturales().equals(instance.getEepaMesesNaturales()))
            equalObjects = false;
        if (equalObjects && !this.getEepaMesesComerciales().equals(instance.getEepaMesesComerciales()))
            equalObjects = false;
        if (equalObjects && !this.getEepaOtroPeriodo().equals(instance.getEepaOtroPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEepaDiasTranscurridos().equals(instance.getEepaDiasTranscurridos()))
            equalObjects = false;
        if (equalObjects && !this.getEepaDiasEfectivos().equals(instance.getEepaDiasEfectivos()))
            equalObjects = false;
        if (equalObjects && !this.getEepaRevisables().equals(instance.getEepaRevisables()))
            equalObjects = false;
        if (equalObjects && !this.getEepaRecorre().equals(instance.getEepaRecorre()))
            equalObjects = false;
        if (equalObjects && !this.getEepaAjustaPeriodo().equals(instance.getEepaAjustaPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEepaAjustaPeriodoSig().equals(instance.getEepaAjustaPeriodoSig()))
            equalObjects = false;
        if (equalObjects && !this.getEepaConfFechaPago().equals(instance.getEepaConfFechaPago()))
            equalObjects = false;
        if (equalObjects && !this.getEepaDiaFijo().equals(instance.getEepaDiaFijo()))
            equalObjects = false;
        if (equalObjects && !this.getEepaNumDiaFijo().equals(instance.getEepaNumDiaFijo()))
            equalObjects = false;
        if (equalObjects && !this.getEepaDiasPago().equals(instance.getEepaDiasPago()))
            equalObjects = false;
        if (equalObjects && !this.getEepaDiasCalend().equals(instance.getEepaDiasCalend()))
            equalObjects = false;
        if (equalObjects && !this.getEepaDiasPerPago().equals(instance.getEepaDiasPerPago()))
            equalObjects = false;
        if (equalObjects && !this.getEepaCalculaSigPer().equals(instance.getEepaCalculaSigPer()))
            equalObjects = false;
        if (equalObjects && !this.getEepaDiasInhPago().equals(instance.getEepaDiasInhPago()))
            equalObjects = false;
        if (equalObjects && !this.getEepaDiasInhCalc().equals(instance.getEepaDiasInhCalc()))
            equalObjects = false;
        if (equalObjects && !this.getEepaAjustaPer1Per2().equals(instance.getEepaAjustaPer1Per2()))
            equalObjects = false;
        if (equalObjects && !this.getEepaStEmipago().equals(instance.getEepaStEmipago()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmipago result = new FEmipago();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEepaIdPrograma((BigDecimal) objectData.getData("EEPA_ID_PROGRAMA"));
        result.setEepaIdFideicomiso((BigDecimal) objectData.getData("EEPA_ID_FIDEICOMISO"));
        result.setEepaIdEmision((BigDecimal) objectData.getData("EEPA_ID_EMISION"));
        result.setEepaPeriodoPago((String) objectData.getData("EEPA_PERIODO_PAGO"));
        result.setEepaNumDiaPerPago((BigDecimal) objectData.getData("EEPA_NUM_DIA_PER_PAGO"));
        result.setEepaDiasAntesCalc((BigDecimal) objectData.getData("EEPA_DIAS_ANTES_CALC"));
        result.setEepaFecPago((String) objectData.getData("EEPA_FEC_PAGO"));
        result.setEepaMesesNaturales((BigDecimal) objectData.getData("EEPA_MESES_NATURALES"));
        result.setEepaMesesComerciales((BigDecimal) objectData.getData("EEPA_MESES_COMERCIALES"));
        result.setEepaOtroPeriodo((String) objectData.getData("EEPA_OTRO_PERIODO"));
        result.setEepaDiasTranscurridos((BigDecimal) objectData.getData("EEPA_DIAS_TRANSCURRIDOS"));
        result.setEepaDiasEfectivos((BigDecimal) objectData.getData("EEPA_DIAS_EFECTIVOS"));
        result.setEepaRevisables((BigDecimal) objectData.getData("EEPA_REVISABLES"));
        result.setEepaRecorre((BigDecimal) objectData.getData("EEPA_RECORRE"));
        result.setEepaAjustaPeriodo((BigDecimal) objectData.getData("EEPA_AJUSTA_PERIODO"));
        result.setEepaAjustaPeriodoSig((BigDecimal) objectData.getData("EEPA_AJUSTA_PERIODO_SIG"));
        result.setEepaConfFechaPago((BigDecimal) objectData.getData("EEPA_CONF_FECHA_PAGO"));
        result.setEepaDiaFijo((BigDecimal) objectData.getData("EEPA_DIA_FIJO"));
        result.setEepaNumDiaFijo((BigDecimal) objectData.getData("EEPA_NUM_DIA_FIJO"));
        result.setEepaDiasPago((BigDecimal) objectData.getData("EEPA_DIAS_PAGO"));
        result.setEepaDiasCalend((BigDecimal) objectData.getData("EEPA_DIAS_CALEND"));
        result.setEepaDiasPerPago((BigDecimal) objectData.getData("EEPA_DIAS_PER_PAGO"));
        result.setEepaCalculaSigPer((BigDecimal) objectData.getData("EEPA_CALCULA_SIG_PER"));
        result.setEepaDiasInhPago((BigDecimal) objectData.getData("EEPA_DIAS_INH_PAGO"));
        result.setEepaDiasInhCalc((BigDecimal) objectData.getData("EEPA_DIAS_INH_CALC"));
        result.setEepaAjustaPer1Per2((BigDecimal) objectData.getData("EEPA_AJUSTA_PER1_PER2"));
        result.setEepaStEmipago((String) objectData.getData("EEPA_ST_EMIPAGO"));

        return result;

    }

}
