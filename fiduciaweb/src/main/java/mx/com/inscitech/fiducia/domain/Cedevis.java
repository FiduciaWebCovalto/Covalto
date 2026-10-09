package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CEDEVIS_PK", columns = { "CED_NUM_PROGRAMA", "CED_NUM_EMISION", "CED_NUM_CEDEVIS" }, sequences = { "MANUAL" })
public class Cedevis extends DomainObject {

    BigDecimal cedNumPrograma = null;
    BigDecimal cedNumEmision = null;
    BigDecimal cedNumCedevis = null;
    BigDecimal cedNumContrato = null;
    String cedNomEmisor = null;
    String cedCvePizarra = null;
    String cedNumSerie = null;
    BigDecimal cedAnoInicioPer = null;
    BigDecimal cedMesInicioPer = null;
    BigDecimal cedDiaInicioPer = null;
    BigDecimal cedAnoPagoPer = null;
    BigDecimal cedMesPagoPer = null;
    BigDecimal cedDiaPagoPer = null;
    BigDecimal cedPlazo = null;
    BigDecimal cedTipoMoneda = null;
    BigDecimal cedSaldoInicPer = null;
    BigDecimal cedTasaBruta = null;
    BigDecimal cedSaldoCaja = null;
    BigDecimal cedIntsDevengados = null;
    BigDecimal cedNumFinalCartera = null;
    BigDecimal cedSalFinalCartera = null;
    BigDecimal cedNumPeriodoPago = null;
    BigDecimal cedAnoAltaReg = null;
    BigDecimal cedMesAltaReg = null;
    BigDecimal cedDiaAltaReg = null;
    BigDecimal cedAnoUltMod = null;
    BigDecimal cedMesUltMod = null;
    BigDecimal cedDiaUltMod = null;
    String cedCveStCedevis = null;

    public Cedevis() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCedNumPrograma(BigDecimal cedNumPrograma) {
        this.cedNumPrograma = cedNumPrograma;
    }

    public BigDecimal getCedNumPrograma() {
        return this.cedNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCedNumEmision(BigDecimal cedNumEmision) {
        this.cedNumEmision = cedNumEmision;
    }

    public BigDecimal getCedNumEmision() {
        return this.cedNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCedNumCedevis(BigDecimal cedNumCedevis) {
        this.cedNumCedevis = cedNumCedevis;
    }

    public BigDecimal getCedNumCedevis() {
        return this.cedNumCedevis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCedNumContrato(BigDecimal cedNumContrato) {
        this.cedNumContrato = cedNumContrato;
    }

    public BigDecimal getCedNumContrato() {
        return this.cedNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCedNomEmisor(String cedNomEmisor) {
        this.cedNomEmisor = cedNomEmisor;
    }

    public String getCedNomEmisor() {
        return this.cedNomEmisor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCedCvePizarra(String cedCvePizarra) {
        this.cedCvePizarra = cedCvePizarra;
    }

    public String getCedCvePizarra() {
        return this.cedCvePizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCedNumSerie(String cedNumSerie) {
        this.cedNumSerie = cedNumSerie;
    }

    public String getCedNumSerie() {
        return this.cedNumSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCedAnoInicioPer(BigDecimal cedAnoInicioPer) {
        this.cedAnoInicioPer = cedAnoInicioPer;
    }

    public BigDecimal getCedAnoInicioPer() {
        return this.cedAnoInicioPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCedMesInicioPer(BigDecimal cedMesInicioPer) {
        this.cedMesInicioPer = cedMesInicioPer;
    }

    public BigDecimal getCedMesInicioPer() {
        return this.cedMesInicioPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCedDiaInicioPer(BigDecimal cedDiaInicioPer) {
        this.cedDiaInicioPer = cedDiaInicioPer;
    }

    public BigDecimal getCedDiaInicioPer() {
        return this.cedDiaInicioPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCedAnoPagoPer(BigDecimal cedAnoPagoPer) {
        this.cedAnoPagoPer = cedAnoPagoPer;
    }

    public BigDecimal getCedAnoPagoPer() {
        return this.cedAnoPagoPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCedMesPagoPer(BigDecimal cedMesPagoPer) {
        this.cedMesPagoPer = cedMesPagoPer;
    }

    public BigDecimal getCedMesPagoPer() {
        return this.cedMesPagoPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCedDiaPagoPer(BigDecimal cedDiaPagoPer) {
        this.cedDiaPagoPer = cedDiaPagoPer;
    }

    public BigDecimal getCedDiaPagoPer() {
        return this.cedDiaPagoPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCedPlazo(BigDecimal cedPlazo) {
        this.cedPlazo = cedPlazo;
    }

    public BigDecimal getCedPlazo() {
        return this.cedPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCedTipoMoneda(BigDecimal cedTipoMoneda) {
        this.cedTipoMoneda = cedTipoMoneda;
    }

    public BigDecimal getCedTipoMoneda() {
        return this.cedTipoMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCedSaldoInicPer(BigDecimal cedSaldoInicPer) {
        this.cedSaldoInicPer = cedSaldoInicPer;
    }

    public BigDecimal getCedSaldoInicPer() {
        return this.cedSaldoInicPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setCedTasaBruta(BigDecimal cedTasaBruta) {
        this.cedTasaBruta = cedTasaBruta;
    }

    public BigDecimal getCedTasaBruta() {
        return this.cedTasaBruta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCedSaldoCaja(BigDecimal cedSaldoCaja) {
        this.cedSaldoCaja = cedSaldoCaja;
    }

    public BigDecimal getCedSaldoCaja() {
        return this.cedSaldoCaja;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCedIntsDevengados(BigDecimal cedIntsDevengados) {
        this.cedIntsDevengados = cedIntsDevengados;
    }

    public BigDecimal getCedIntsDevengados() {
        return this.cedIntsDevengados;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCedNumFinalCartera(BigDecimal cedNumFinalCartera) {
        this.cedNumFinalCartera = cedNumFinalCartera;
    }

    public BigDecimal getCedNumFinalCartera() {
        return this.cedNumFinalCartera;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setCedSalFinalCartera(BigDecimal cedSalFinalCartera) {
        this.cedSalFinalCartera = cedSalFinalCartera;
    }

    public BigDecimal getCedSalFinalCartera() {
        return this.cedSalFinalCartera;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCedNumPeriodoPago(BigDecimal cedNumPeriodoPago) {
        this.cedNumPeriodoPago = cedNumPeriodoPago;
    }

    public BigDecimal getCedNumPeriodoPago() {
        return this.cedNumPeriodoPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCedAnoAltaReg(BigDecimal cedAnoAltaReg) {
        this.cedAnoAltaReg = cedAnoAltaReg;
    }

    public BigDecimal getCedAnoAltaReg() {
        return this.cedAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCedMesAltaReg(BigDecimal cedMesAltaReg) {
        this.cedMesAltaReg = cedMesAltaReg;
    }

    public BigDecimal getCedMesAltaReg() {
        return this.cedMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCedDiaAltaReg(BigDecimal cedDiaAltaReg) {
        this.cedDiaAltaReg = cedDiaAltaReg;
    }

    public BigDecimal getCedDiaAltaReg() {
        return this.cedDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCedAnoUltMod(BigDecimal cedAnoUltMod) {
        this.cedAnoUltMod = cedAnoUltMod;
    }

    public BigDecimal getCedAnoUltMod() {
        return this.cedAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCedMesUltMod(BigDecimal cedMesUltMod) {
        this.cedMesUltMod = cedMesUltMod;
    }

    public BigDecimal getCedMesUltMod() {
        return this.cedMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCedDiaUltMod(BigDecimal cedDiaUltMod) {
        this.cedDiaUltMod = cedDiaUltMod;
    }

    public BigDecimal getCedDiaUltMod() {
        return this.cedDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCedCveStCedevis(String cedCveStCedevis) {
        this.cedCveStCedevis = cedCveStCedevis;
    }

    public String getCedCveStCedevis() {
        return this.cedCveStCedevis;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CEDEVIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCedNumPrograma() != null && this.getCedNumPrograma().longValue() == -999) {
            conditions += " AND CED_NUM_PROGRAMA IS NULL";
        } else if (this.getCedNumPrograma() != null) {
            conditions += " AND CED_NUM_PROGRAMA = ?";
            values.add(this.getCedNumPrograma());
        }

        if (this.getCedNumEmision() != null && this.getCedNumEmision().longValue() == -999) {
            conditions += " AND CED_NUM_EMISION IS NULL";
        } else if (this.getCedNumEmision() != null) {
            conditions += " AND CED_NUM_EMISION = ?";
            values.add(this.getCedNumEmision());
        }

        if (this.getCedNumCedevis() != null && this.getCedNumCedevis().longValue() == -999) {
            conditions += " AND CED_NUM_CEDEVIS IS NULL";
        } else if (this.getCedNumCedevis() != null) {
            conditions += " AND CED_NUM_CEDEVIS = ?";
            values.add(this.getCedNumCedevis());
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
        String sql = "SELECT * FROM CEDEVIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCedNumPrograma() != null && this.getCedNumPrograma().longValue() == -999) {
            conditions += " AND CED_NUM_PROGRAMA IS NULL";
        } else if (this.getCedNumPrograma() != null) {
            conditions += " AND CED_NUM_PROGRAMA = ?";
            values.add(this.getCedNumPrograma());
        }

        if (this.getCedNumEmision() != null && this.getCedNumEmision().longValue() == -999) {
            conditions += " AND CED_NUM_EMISION IS NULL";
        } else if (this.getCedNumEmision() != null) {
            conditions += " AND CED_NUM_EMISION = ?";
            values.add(this.getCedNumEmision());
        }

        if (this.getCedNumCedevis() != null && this.getCedNumCedevis().longValue() == -999) {
            conditions += " AND CED_NUM_CEDEVIS IS NULL";
        } else if (this.getCedNumCedevis() != null) {
            conditions += " AND CED_NUM_CEDEVIS = ?";
            values.add(this.getCedNumCedevis());
        }

        if (this.getCedNumContrato() != null && this.getCedNumContrato().longValue() == -999) {
            conditions += " AND CED_NUM_CONTRATO IS NULL";
        } else if (this.getCedNumContrato() != null) {
            conditions += " AND CED_NUM_CONTRATO = ?";
            values.add(this.getCedNumContrato());
        }

        if (this.getCedNomEmisor() != null && "null".equals(this.getCedNomEmisor())) {
            conditions += " AND CED_NOM_EMISOR IS NULL";
        } else if (this.getCedNomEmisor() != null) {
            conditions += " AND CED_NOM_EMISOR = ?";
            values.add(this.getCedNomEmisor());
        }

        if (this.getCedCvePizarra() != null && "null".equals(this.getCedCvePizarra())) {
            conditions += " AND CED_CVE_PIZARRA IS NULL";
        } else if (this.getCedCvePizarra() != null) {
            conditions += " AND CED_CVE_PIZARRA = ?";
            values.add(this.getCedCvePizarra());
        }

        if (this.getCedNumSerie() != null && "null".equals(this.getCedNumSerie())) {
            conditions += " AND CED_NUM_SERIE IS NULL";
        } else if (this.getCedNumSerie() != null) {
            conditions += " AND CED_NUM_SERIE = ?";
            values.add(this.getCedNumSerie());
        }

        if (this.getCedAnoInicioPer() != null && this.getCedAnoInicioPer().longValue() == -999) {
            conditions += " AND CED_ANO_INICIO_PER IS NULL";
        } else if (this.getCedAnoInicioPer() != null) {
            conditions += " AND CED_ANO_INICIO_PER = ?";
            values.add(this.getCedAnoInicioPer());
        }

        if (this.getCedMesInicioPer() != null && this.getCedMesInicioPer().longValue() == -999) {
            conditions += " AND CED_MES_INICIO_PER IS NULL";
        } else if (this.getCedMesInicioPer() != null) {
            conditions += " AND CED_MES_INICIO_PER = ?";
            values.add(this.getCedMesInicioPer());
        }

        if (this.getCedDiaInicioPer() != null && this.getCedDiaInicioPer().longValue() == -999) {
            conditions += " AND CED_DIA_INICIO_PER IS NULL";
        } else if (this.getCedDiaInicioPer() != null) {
            conditions += " AND CED_DIA_INICIO_PER = ?";
            values.add(this.getCedDiaInicioPer());
        }

        if (this.getCedAnoPagoPer() != null && this.getCedAnoPagoPer().longValue() == -999) {
            conditions += " AND CED_ANO_PAGO_PER IS NULL";
        } else if (this.getCedAnoPagoPer() != null) {
            conditions += " AND CED_ANO_PAGO_PER = ?";
            values.add(this.getCedAnoPagoPer());
        }

        if (this.getCedMesPagoPer() != null && this.getCedMesPagoPer().longValue() == -999) {
            conditions += " AND CED_MES_PAGO_PER IS NULL";
        } else if (this.getCedMesPagoPer() != null) {
            conditions += " AND CED_MES_PAGO_PER = ?";
            values.add(this.getCedMesPagoPer());
        }

        if (this.getCedDiaPagoPer() != null && this.getCedDiaPagoPer().longValue() == -999) {
            conditions += " AND CED_DIA_PAGO_PER IS NULL";
        } else if (this.getCedDiaPagoPer() != null) {
            conditions += " AND CED_DIA_PAGO_PER = ?";
            values.add(this.getCedDiaPagoPer());
        }

        if (this.getCedPlazo() != null && this.getCedPlazo().longValue() == -999) {
            conditions += " AND CED_PLAZO IS NULL";
        } else if (this.getCedPlazo() != null) {
            conditions += " AND CED_PLAZO = ?";
            values.add(this.getCedPlazo());
        }

        if (this.getCedTipoMoneda() != null && this.getCedTipoMoneda().longValue() == -999) {
            conditions += " AND CED_TIPO_MONEDA IS NULL";
        } else if (this.getCedTipoMoneda() != null) {
            conditions += " AND CED_TIPO_MONEDA = ?";
            values.add(this.getCedTipoMoneda());
        }

        if (this.getCedSaldoInicPer() != null && this.getCedSaldoInicPer().longValue() == -999) {
            conditions += " AND CED_SALDO_INIC_PER IS NULL";
        } else if (this.getCedSaldoInicPer() != null) {
            conditions += " AND CED_SALDO_INIC_PER = ?";
            values.add(this.getCedSaldoInicPer());
        }

        if (this.getCedTasaBruta() != null && this.getCedTasaBruta().longValue() == -999) {
            conditions += " AND CED_TASA_BRUTA IS NULL";
        } else if (this.getCedTasaBruta() != null) {
            conditions += " AND CED_TASA_BRUTA = ?";
            values.add(this.getCedTasaBruta());
        }

        if (this.getCedSaldoCaja() != null && this.getCedSaldoCaja().longValue() == -999) {
            conditions += " AND CED_SALDO_CAJA IS NULL";
        } else if (this.getCedSaldoCaja() != null) {
            conditions += " AND CED_SALDO_CAJA = ?";
            values.add(this.getCedSaldoCaja());
        }

        if (this.getCedIntsDevengados() != null && this.getCedIntsDevengados().longValue() == -999) {
            conditions += " AND CED_INTS_DEVENGADOS IS NULL";
        } else if (this.getCedIntsDevengados() != null) {
            conditions += " AND CED_INTS_DEVENGADOS = ?";
            values.add(this.getCedIntsDevengados());
        }

        if (this.getCedNumFinalCartera() != null && this.getCedNumFinalCartera().longValue() == -999) {
            conditions += " AND CED_NUM_FINAL_CARTERA IS NULL";
        } else if (this.getCedNumFinalCartera() != null) {
            conditions += " AND CED_NUM_FINAL_CARTERA = ?";
            values.add(this.getCedNumFinalCartera());
        }

        if (this.getCedSalFinalCartera() != null && this.getCedSalFinalCartera().longValue() == -999) {
            conditions += " AND CED_SAL_FINAL_CARTERA IS NULL";
        } else if (this.getCedSalFinalCartera() != null) {
            conditions += " AND CED_SAL_FINAL_CARTERA = ?";
            values.add(this.getCedSalFinalCartera());
        }

        if (this.getCedNumPeriodoPago() != null && this.getCedNumPeriodoPago().longValue() == -999) {
            conditions += " AND CED_NUM_PERIODO_PAGO IS NULL";
        } else if (this.getCedNumPeriodoPago() != null) {
            conditions += " AND CED_NUM_PERIODO_PAGO = ?";
            values.add(this.getCedNumPeriodoPago());
        }

        if (this.getCedAnoAltaReg() != null && this.getCedAnoAltaReg().longValue() == -999) {
            conditions += " AND CED_ANO_ALTA_REG IS NULL";
        } else if (this.getCedAnoAltaReg() != null) {
            conditions += " AND CED_ANO_ALTA_REG = ?";
            values.add(this.getCedAnoAltaReg());
        }

        if (this.getCedMesAltaReg() != null && this.getCedMesAltaReg().longValue() == -999) {
            conditions += " AND CED_MES_ALTA_REG IS NULL";
        } else if (this.getCedMesAltaReg() != null) {
            conditions += " AND CED_MES_ALTA_REG = ?";
            values.add(this.getCedMesAltaReg());
        }

        if (this.getCedDiaAltaReg() != null && this.getCedDiaAltaReg().longValue() == -999) {
            conditions += " AND CED_DIA_ALTA_REG IS NULL";
        } else if (this.getCedDiaAltaReg() != null) {
            conditions += " AND CED_DIA_ALTA_REG = ?";
            values.add(this.getCedDiaAltaReg());
        }

        if (this.getCedAnoUltMod() != null && this.getCedAnoUltMod().longValue() == -999) {
            conditions += " AND CED_ANO_ULT_MOD IS NULL";
        } else if (this.getCedAnoUltMod() != null) {
            conditions += " AND CED_ANO_ULT_MOD = ?";
            values.add(this.getCedAnoUltMod());
        }

        if (this.getCedMesUltMod() != null && this.getCedMesUltMod().longValue() == -999) {
            conditions += " AND CED_MES_ULT_MOD IS NULL";
        } else if (this.getCedMesUltMod() != null) {
            conditions += " AND CED_MES_ULT_MOD = ?";
            values.add(this.getCedMesUltMod());
        }

        if (this.getCedDiaUltMod() != null && this.getCedDiaUltMod().longValue() == -999) {
            conditions += " AND CED_DIA_ULT_MOD IS NULL";
        } else if (this.getCedDiaUltMod() != null) {
            conditions += " AND CED_DIA_ULT_MOD = ?";
            values.add(this.getCedDiaUltMod());
        }

        if (this.getCedCveStCedevis() != null && "null".equals(this.getCedCveStCedevis())) {
            conditions += " AND CED_CVE_ST_CEDEVIS IS NULL";
        } else if (this.getCedCveStCedevis() != null) {
            conditions += " AND CED_CVE_ST_CEDEVIS = ?";
            values.add(this.getCedCveStCedevis());
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
        String sql = "UPDATE CEDEVIS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CED_NUM_PROGRAMA = ?";
        pkValues.add(this.getCedNumPrograma());
        conditions += " AND CED_NUM_EMISION = ?";
        pkValues.add(this.getCedNumEmision());
        conditions += " AND CED_NUM_CEDEVIS = ?";
        pkValues.add(this.getCedNumCedevis());
        fields += " CED_NUM_CONTRATO = ?, ";
        values.add(this.getCedNumContrato());
        fields += " CED_NOM_EMISOR = ?, ";
        values.add(this.getCedNomEmisor());
        fields += " CED_CVE_PIZARRA = ?, ";
        values.add(this.getCedCvePizarra());
        fields += " CED_NUM_SERIE = ?, ";
        values.add(this.getCedNumSerie());
        fields += " CED_ANO_INICIO_PER = ?, ";
        values.add(this.getCedAnoInicioPer());
        fields += " CED_MES_INICIO_PER = ?, ";
        values.add(this.getCedMesInicioPer());
        fields += " CED_DIA_INICIO_PER = ?, ";
        values.add(this.getCedDiaInicioPer());
        fields += " CED_ANO_PAGO_PER = ?, ";
        values.add(this.getCedAnoPagoPer());
        fields += " CED_MES_PAGO_PER = ?, ";
        values.add(this.getCedMesPagoPer());
        fields += " CED_DIA_PAGO_PER = ?, ";
        values.add(this.getCedDiaPagoPer());
        fields += " CED_PLAZO = ?, ";
        values.add(this.getCedPlazo());
        fields += " CED_TIPO_MONEDA = ?, ";
        values.add(this.getCedTipoMoneda());
        fields += " CED_SALDO_INIC_PER = ?, ";
        values.add(this.getCedSaldoInicPer());
        fields += " CED_TASA_BRUTA = ?, ";
        values.add(this.getCedTasaBruta());
        fields += " CED_SALDO_CAJA = ?, ";
        values.add(this.getCedSaldoCaja());
        fields += " CED_INTS_DEVENGADOS = ?, ";
        values.add(this.getCedIntsDevengados());
        fields += " CED_NUM_FINAL_CARTERA = ?, ";
        values.add(this.getCedNumFinalCartera());
        fields += " CED_SAL_FINAL_CARTERA = ?, ";
        values.add(this.getCedSalFinalCartera());
        fields += " CED_NUM_PERIODO_PAGO = ?, ";
        values.add(this.getCedNumPeriodoPago());
        fields += " CED_ANO_ALTA_REG = ?, ";
        values.add(this.getCedAnoAltaReg());
        fields += " CED_MES_ALTA_REG = ?, ";
        values.add(this.getCedMesAltaReg());
        fields += " CED_DIA_ALTA_REG = ?, ";
        values.add(this.getCedDiaAltaReg());
        fields += " CED_ANO_ULT_MOD = ?, ";
        values.add(this.getCedAnoUltMod());
        fields += " CED_MES_ULT_MOD = ?, ";
        values.add(this.getCedMesUltMod());
        fields += " CED_DIA_ULT_MOD = ?, ";
        values.add(this.getCedDiaUltMod());
        fields += " CED_CVE_ST_CEDEVIS = ?, ";
        values.add(this.getCedCveStCedevis());
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
        String sql = "INSERT INTO CEDEVIS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CED_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getCedNumPrograma());

        fields += ", CED_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getCedNumEmision());

        fields += ", CED_NUM_CEDEVIS";
        fieldValues += ", ?";
        values.add(this.getCedNumCedevis());

        fields += ", CED_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCedNumContrato());

        fields += ", CED_NOM_EMISOR";
        fieldValues += ", ?";
        values.add(this.getCedNomEmisor());

        fields += ", CED_CVE_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCedCvePizarra());

        fields += ", CED_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getCedNumSerie());

        fields += ", CED_ANO_INICIO_PER";
        fieldValues += ", ?";
        values.add(this.getCedAnoInicioPer());

        fields += ", CED_MES_INICIO_PER";
        fieldValues += ", ?";
        values.add(this.getCedMesInicioPer());

        fields += ", CED_DIA_INICIO_PER";
        fieldValues += ", ?";
        values.add(this.getCedDiaInicioPer());

        fields += ", CED_ANO_PAGO_PER";
        fieldValues += ", ?";
        values.add(this.getCedAnoPagoPer());

        fields += ", CED_MES_PAGO_PER";
        fieldValues += ", ?";
        values.add(this.getCedMesPagoPer());

        fields += ", CED_DIA_PAGO_PER";
        fieldValues += ", ?";
        values.add(this.getCedDiaPagoPer());

        fields += ", CED_PLAZO";
        fieldValues += ", ?";
        values.add(this.getCedPlazo());

        fields += ", CED_TIPO_MONEDA";
        fieldValues += ", ?";
        values.add(this.getCedTipoMoneda());

        fields += ", CED_SALDO_INIC_PER";
        fieldValues += ", ?";
        values.add(this.getCedSaldoInicPer());

        fields += ", CED_TASA_BRUTA";
        fieldValues += ", ?";
        values.add(this.getCedTasaBruta());

        fields += ", CED_SALDO_CAJA";
        fieldValues += ", ?";
        values.add(this.getCedSaldoCaja());

        fields += ", CED_INTS_DEVENGADOS";
        fieldValues += ", ?";
        values.add(this.getCedIntsDevengados());

        fields += ", CED_NUM_FINAL_CARTERA";
        fieldValues += ", ?";
        values.add(this.getCedNumFinalCartera());

        fields += ", CED_SAL_FINAL_CARTERA";
        fieldValues += ", ?";
        values.add(this.getCedSalFinalCartera());

        fields += ", CED_NUM_PERIODO_PAGO";
        fieldValues += ", ?";
        values.add(this.getCedNumPeriodoPago());

        fields += ", CED_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCedAnoAltaReg());

        fields += ", CED_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCedMesAltaReg());

        fields += ", CED_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCedDiaAltaReg());

        fields += ", CED_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCedAnoUltMod());

        fields += ", CED_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCedMesUltMod());

        fields += ", CED_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCedDiaUltMod());

        fields += ", CED_CVE_ST_CEDEVIS";
        fieldValues += ", ?";
        values.add(this.getCedCveStCedevis());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CEDEVIS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CED_NUM_PROGRAMA = ?";
        values.add(this.getCedNumPrograma());
        conditions += " AND CED_NUM_EMISION = ?";
        values.add(this.getCedNumEmision());
        conditions += " AND CED_NUM_CEDEVIS = ?";
        values.add(this.getCedNumCedevis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cedevis instance = (Cedevis) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCedNumPrograma().equals(instance.getCedNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getCedNumEmision().equals(instance.getCedNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCedNumCedevis().equals(instance.getCedNumCedevis()))
            equalObjects = false;
        if (equalObjects && !this.getCedNumContrato().equals(instance.getCedNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCedNomEmisor().equals(instance.getCedNomEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getCedCvePizarra().equals(instance.getCedCvePizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCedNumSerie().equals(instance.getCedNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getCedAnoInicioPer().equals(instance.getCedAnoInicioPer()))
            equalObjects = false;
        if (equalObjects && !this.getCedMesInicioPer().equals(instance.getCedMesInicioPer()))
            equalObjects = false;
        if (equalObjects && !this.getCedDiaInicioPer().equals(instance.getCedDiaInicioPer()))
            equalObjects = false;
        if (equalObjects && !this.getCedAnoPagoPer().equals(instance.getCedAnoPagoPer()))
            equalObjects = false;
        if (equalObjects && !this.getCedMesPagoPer().equals(instance.getCedMesPagoPer()))
            equalObjects = false;
        if (equalObjects && !this.getCedDiaPagoPer().equals(instance.getCedDiaPagoPer()))
            equalObjects = false;
        if (equalObjects && !this.getCedPlazo().equals(instance.getCedPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getCedTipoMoneda().equals(instance.getCedTipoMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getCedSaldoInicPer().equals(instance.getCedSaldoInicPer()))
            equalObjects = false;
        if (equalObjects && !this.getCedTasaBruta().equals(instance.getCedTasaBruta()))
            equalObjects = false;
        if (equalObjects && !this.getCedSaldoCaja().equals(instance.getCedSaldoCaja()))
            equalObjects = false;
        if (equalObjects && !this.getCedIntsDevengados().equals(instance.getCedIntsDevengados()))
            equalObjects = false;
        if (equalObjects && !this.getCedNumFinalCartera().equals(instance.getCedNumFinalCartera()))
            equalObjects = false;
        if (equalObjects && !this.getCedSalFinalCartera().equals(instance.getCedSalFinalCartera()))
            equalObjects = false;
        if (equalObjects && !this.getCedNumPeriodoPago().equals(instance.getCedNumPeriodoPago()))
            equalObjects = false;
        if (equalObjects && !this.getCedAnoAltaReg().equals(instance.getCedAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCedMesAltaReg().equals(instance.getCedMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCedDiaAltaReg().equals(instance.getCedDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCedAnoUltMod().equals(instance.getCedAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCedMesUltMod().equals(instance.getCedMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCedDiaUltMod().equals(instance.getCedDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCedCveStCedevis().equals(instance.getCedCveStCedevis()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cedevis result = new Cedevis();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCedNumPrograma((BigDecimal) objectData.getData("CED_NUM_PROGRAMA"));
        result.setCedNumEmision((BigDecimal) objectData.getData("CED_NUM_EMISION"));
        result.setCedNumCedevis((BigDecimal) objectData.getData("CED_NUM_CEDEVIS"));
        result.setCedNumContrato((BigDecimal) objectData.getData("CED_NUM_CONTRATO"));
        result.setCedNomEmisor((String) objectData.getData("CED_NOM_EMISOR"));
        result.setCedCvePizarra((String) objectData.getData("CED_CVE_PIZARRA"));
        result.setCedNumSerie((String) objectData.getData("CED_NUM_SERIE"));
        result.setCedAnoInicioPer((BigDecimal) objectData.getData("CED_ANO_INICIO_PER"));
        result.setCedMesInicioPer((BigDecimal) objectData.getData("CED_MES_INICIO_PER"));
        result.setCedDiaInicioPer((BigDecimal) objectData.getData("CED_DIA_INICIO_PER"));
        result.setCedAnoPagoPer((BigDecimal) objectData.getData("CED_ANO_PAGO_PER"));
        result.setCedMesPagoPer((BigDecimal) objectData.getData("CED_MES_PAGO_PER"));
        result.setCedDiaPagoPer((BigDecimal) objectData.getData("CED_DIA_PAGO_PER"));
        result.setCedPlazo((BigDecimal) objectData.getData("CED_PLAZO"));
        result.setCedTipoMoneda((BigDecimal) objectData.getData("CED_TIPO_MONEDA"));
        result.setCedSaldoInicPer((BigDecimal) objectData.getData("CED_SALDO_INIC_PER"));
        result.setCedTasaBruta((BigDecimal) objectData.getData("CED_TASA_BRUTA"));
        result.setCedSaldoCaja((BigDecimal) objectData.getData("CED_SALDO_CAJA"));
        result.setCedIntsDevengados((BigDecimal) objectData.getData("CED_INTS_DEVENGADOS"));
        result.setCedNumFinalCartera((BigDecimal) objectData.getData("CED_NUM_FINAL_CARTERA"));
        result.setCedSalFinalCartera((BigDecimal) objectData.getData("CED_SAL_FINAL_CARTERA"));
        result.setCedNumPeriodoPago((BigDecimal) objectData.getData("CED_NUM_PERIODO_PAGO"));
        result.setCedAnoAltaReg((BigDecimal) objectData.getData("CED_ANO_ALTA_REG"));
        result.setCedMesAltaReg((BigDecimal) objectData.getData("CED_MES_ALTA_REG"));
        result.setCedDiaAltaReg((BigDecimal) objectData.getData("CED_DIA_ALTA_REG"));
        result.setCedAnoUltMod((BigDecimal) objectData.getData("CED_ANO_ULT_MOD"));
        result.setCedMesUltMod((BigDecimal) objectData.getData("CED_MES_ULT_MOD"));
        result.setCedDiaUltMod((BigDecimal) objectData.getData("CED_DIA_ULT_MOD"));
        result.setCedCveStCedevis((String) objectData.getData("CED_CVE_ST_CEDEVIS"));

        return result;

    }

}
