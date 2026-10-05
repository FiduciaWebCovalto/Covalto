package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARACALC_PK", columns = { "PCA_NUM_PROGRAMA", "PCA_NUM_EMISION", "PCA_TIPO_CALCULO", "PCA_ANO_CALC_PER", "PCA_MES_CALC_PER", "PCA_DIA_CALC_PER" },
            sequences = { "MANUAL" })
public class Paracalc extends DomainObject {

    BigDecimal pcaNumPrograma = null;
    BigDecimal pcaNumEmision = null;
    BigDecimal pcaTipoCalculo = null;
    BigDecimal pcaAnoCalcPer = null;
    BigDecimal pcaMesCalcPer = null;
    BigDecimal pcaDiaCalcPer = null;
    BigDecimal pcaNumPer = null;
    BigDecimal pcaNumFormula = null;
    BigDecimal pcaNumTitulos = null;
    BigDecimal pcaImpNomEmision = null;
    BigDecimal pcaNumMoneda = null;
    BigDecimal pcaPjeTasaFija = null;
    BigDecimal pcaPjeSobretasa = null;
    BigDecimal pcaPjeIsr = null;
    BigDecimal pcaPlazo = null;
    String pcaPeriodicidadMeses = null;
    BigDecimal pcaPeriodicidadDias = null;
    BigDecimal pcaHabiles = null;
    BigDecimal pcaAnteriores = null;
    BigDecimal pcaNumRegPeriodo = null;
    BigDecimal pcaNumRegAmort = null;
    BigDecimal pcaNumCalculos = null;
    BigDecimal pcaNumModifi = null;
    BigDecimal pcaAnoAltaReg = null;
    BigDecimal pcaMesAltaReg = null;
    BigDecimal pcaDiaAltaReg = null;
    BigDecimal pcaAnoUltMod = null;
    BigDecimal pcaMesUltMod = null;
    BigDecimal pcaDiaUltMod = null;
    String pcaCveStParacalc = null;

    public Paracalc() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPcaNumPrograma(BigDecimal pcaNumPrograma) {
        this.pcaNumPrograma = pcaNumPrograma;
    }

    public BigDecimal getPcaNumPrograma() {
        return this.pcaNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPcaNumEmision(BigDecimal pcaNumEmision) {
        this.pcaNumEmision = pcaNumEmision;
    }

    public BigDecimal getPcaNumEmision() {
        return this.pcaNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPcaTipoCalculo(BigDecimal pcaTipoCalculo) {
        this.pcaTipoCalculo = pcaTipoCalculo;
    }

    public BigDecimal getPcaTipoCalculo() {
        return this.pcaTipoCalculo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPcaAnoCalcPer(BigDecimal pcaAnoCalcPer) {
        this.pcaAnoCalcPer = pcaAnoCalcPer;
    }

    public BigDecimal getPcaAnoCalcPer() {
        return this.pcaAnoCalcPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPcaMesCalcPer(BigDecimal pcaMesCalcPer) {
        this.pcaMesCalcPer = pcaMesCalcPer;
    }

    public BigDecimal getPcaMesCalcPer() {
        return this.pcaMesCalcPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPcaDiaCalcPer(BigDecimal pcaDiaCalcPer) {
        this.pcaDiaCalcPer = pcaDiaCalcPer;
    }

    public BigDecimal getPcaDiaCalcPer() {
        return this.pcaDiaCalcPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPcaNumPer(BigDecimal pcaNumPer) {
        this.pcaNumPer = pcaNumPer;
    }

    public BigDecimal getPcaNumPer() {
        return this.pcaNumPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPcaNumFormula(BigDecimal pcaNumFormula) {
        this.pcaNumFormula = pcaNumFormula;
    }

    public BigDecimal getPcaNumFormula() {
        return this.pcaNumFormula;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setPcaNumTitulos(BigDecimal pcaNumTitulos) {
        this.pcaNumTitulos = pcaNumTitulos;
    }

    public BigDecimal getPcaNumTitulos() {
        return this.pcaNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setPcaImpNomEmision(BigDecimal pcaImpNomEmision) {
        this.pcaImpNomEmision = pcaImpNomEmision;
    }

    public BigDecimal getPcaImpNomEmision() {
        return this.pcaImpNomEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPcaNumMoneda(BigDecimal pcaNumMoneda) {
        this.pcaNumMoneda = pcaNumMoneda;
    }

    public BigDecimal getPcaNumMoneda() {
        return this.pcaNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setPcaPjeTasaFija(BigDecimal pcaPjeTasaFija) {
        this.pcaPjeTasaFija = pcaPjeTasaFija;
    }

    public BigDecimal getPcaPjeTasaFija() {
        return this.pcaPjeTasaFija;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 6, javaClass = BigDecimal.class)
    public void setPcaPjeSobretasa(BigDecimal pcaPjeSobretasa) {
        this.pcaPjeSobretasa = pcaPjeSobretasa;
    }

    public BigDecimal getPcaPjeSobretasa() {
        return this.pcaPjeSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 9, javaClass = BigDecimal.class)
    public void setPcaPjeIsr(BigDecimal pcaPjeIsr) {
        this.pcaPjeIsr = pcaPjeIsr;
    }

    public BigDecimal getPcaPjeIsr() {
        return this.pcaPjeIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPcaPlazo(BigDecimal pcaPlazo) {
        this.pcaPlazo = pcaPlazo;
    }

    public BigDecimal getPcaPlazo() {
        return this.pcaPlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPcaPeriodicidadMeses(String pcaPeriodicidadMeses) {
        this.pcaPeriodicidadMeses = pcaPeriodicidadMeses;
    }

    public String getPcaPeriodicidadMeses() {
        return this.pcaPeriodicidadMeses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPcaPeriodicidadDias(BigDecimal pcaPeriodicidadDias) {
        this.pcaPeriodicidadDias = pcaPeriodicidadDias;
    }

    public BigDecimal getPcaPeriodicidadDias() {
        return this.pcaPeriodicidadDias;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPcaHabiles(BigDecimal pcaHabiles) {
        this.pcaHabiles = pcaHabiles;
    }

    public BigDecimal getPcaHabiles() {
        return this.pcaHabiles;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPcaAnteriores(BigDecimal pcaAnteriores) {
        this.pcaAnteriores = pcaAnteriores;
    }

    public BigDecimal getPcaAnteriores() {
        return this.pcaAnteriores;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPcaNumRegPeriodo(BigDecimal pcaNumRegPeriodo) {
        this.pcaNumRegPeriodo = pcaNumRegPeriodo;
    }

    public BigDecimal getPcaNumRegPeriodo() {
        return this.pcaNumRegPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPcaNumRegAmort(BigDecimal pcaNumRegAmort) {
        this.pcaNumRegAmort = pcaNumRegAmort;
    }

    public BigDecimal getPcaNumRegAmort() {
        return this.pcaNumRegAmort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPcaNumCalculos(BigDecimal pcaNumCalculos) {
        this.pcaNumCalculos = pcaNumCalculos;
    }

    public BigDecimal getPcaNumCalculos() {
        return this.pcaNumCalculos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPcaNumModifi(BigDecimal pcaNumModifi) {
        this.pcaNumModifi = pcaNumModifi;
    }

    public BigDecimal getPcaNumModifi() {
        return this.pcaNumModifi;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPcaAnoAltaReg(BigDecimal pcaAnoAltaReg) {
        this.pcaAnoAltaReg = pcaAnoAltaReg;
    }

    public BigDecimal getPcaAnoAltaReg() {
        return this.pcaAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPcaMesAltaReg(BigDecimal pcaMesAltaReg) {
        this.pcaMesAltaReg = pcaMesAltaReg;
    }

    public BigDecimal getPcaMesAltaReg() {
        return this.pcaMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPcaDiaAltaReg(BigDecimal pcaDiaAltaReg) {
        this.pcaDiaAltaReg = pcaDiaAltaReg;
    }

    public BigDecimal getPcaDiaAltaReg() {
        return this.pcaDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPcaAnoUltMod(BigDecimal pcaAnoUltMod) {
        this.pcaAnoUltMod = pcaAnoUltMod;
    }

    public BigDecimal getPcaAnoUltMod() {
        return this.pcaAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPcaMesUltMod(BigDecimal pcaMesUltMod) {
        this.pcaMesUltMod = pcaMesUltMod;
    }

    public BigDecimal getPcaMesUltMod() {
        return this.pcaMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPcaDiaUltMod(BigDecimal pcaDiaUltMod) {
        this.pcaDiaUltMod = pcaDiaUltMod;
    }

    public BigDecimal getPcaDiaUltMod() {
        return this.pcaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPcaCveStParacalc(String pcaCveStParacalc) {
        this.pcaCveStParacalc = pcaCveStParacalc;
    }

    public String getPcaCveStParacalc() {
        return this.pcaCveStParacalc;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARACALC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPcaNumPrograma() != null && this.getPcaNumPrograma().longValue() == -999) {
            conditions += " AND PCA_NUM_PROGRAMA IS NULL";
        } else if (this.getPcaNumPrograma() != null) {
            conditions += " AND PCA_NUM_PROGRAMA = ?";
            values.add(this.getPcaNumPrograma());
        }

        if (this.getPcaNumEmision() != null && this.getPcaNumEmision().longValue() == -999) {
            conditions += " AND PCA_NUM_EMISION IS NULL";
        } else if (this.getPcaNumEmision() != null) {
            conditions += " AND PCA_NUM_EMISION = ?";
            values.add(this.getPcaNumEmision());
        }

        if (this.getPcaTipoCalculo() != null && this.getPcaTipoCalculo().longValue() == -999) {
            conditions += " AND PCA_TIPO_CALCULO IS NULL";
        } else if (this.getPcaTipoCalculo() != null) {
            conditions += " AND PCA_TIPO_CALCULO = ?";
            values.add(this.getPcaTipoCalculo());
        }

        if (this.getPcaAnoCalcPer() != null && this.getPcaAnoCalcPer().longValue() == -999) {
            conditions += " AND PCA_ANO_CALC_PER IS NULL";
        } else if (this.getPcaAnoCalcPer() != null) {
            conditions += " AND PCA_ANO_CALC_PER = ?";
            values.add(this.getPcaAnoCalcPer());
        }

        if (this.getPcaMesCalcPer() != null && this.getPcaMesCalcPer().longValue() == -999) {
            conditions += " AND PCA_MES_CALC_PER IS NULL";
        } else if (this.getPcaMesCalcPer() != null) {
            conditions += " AND PCA_MES_CALC_PER = ?";
            values.add(this.getPcaMesCalcPer());
        }

        if (this.getPcaDiaCalcPer() != null && this.getPcaDiaCalcPer().longValue() == -999) {
            conditions += " AND PCA_DIA_CALC_PER IS NULL";
        } else if (this.getPcaDiaCalcPer() != null) {
            conditions += " AND PCA_DIA_CALC_PER = ?";
            values.add(this.getPcaDiaCalcPer());
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
        String sql = "SELECT * FROM PARACALC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPcaNumPrograma() != null && this.getPcaNumPrograma().longValue() == -999) {
            conditions += " AND PCA_NUM_PROGRAMA IS NULL";
        } else if (this.getPcaNumPrograma() != null) {
            conditions += " AND PCA_NUM_PROGRAMA = ?";
            values.add(this.getPcaNumPrograma());
        }

        if (this.getPcaNumEmision() != null && this.getPcaNumEmision().longValue() == -999) {
            conditions += " AND PCA_NUM_EMISION IS NULL";
        } else if (this.getPcaNumEmision() != null) {
            conditions += " AND PCA_NUM_EMISION = ?";
            values.add(this.getPcaNumEmision());
        }

        if (this.getPcaTipoCalculo() != null && this.getPcaTipoCalculo().longValue() == -999) {
            conditions += " AND PCA_TIPO_CALCULO IS NULL";
        } else if (this.getPcaTipoCalculo() != null) {
            conditions += " AND PCA_TIPO_CALCULO = ?";
            values.add(this.getPcaTipoCalculo());
        }

        if (this.getPcaAnoCalcPer() != null && this.getPcaAnoCalcPer().longValue() == -999) {
            conditions += " AND PCA_ANO_CALC_PER IS NULL";
        } else if (this.getPcaAnoCalcPer() != null) {
            conditions += " AND PCA_ANO_CALC_PER = ?";
            values.add(this.getPcaAnoCalcPer());
        }

        if (this.getPcaMesCalcPer() != null && this.getPcaMesCalcPer().longValue() == -999) {
            conditions += " AND PCA_MES_CALC_PER IS NULL";
        } else if (this.getPcaMesCalcPer() != null) {
            conditions += " AND PCA_MES_CALC_PER = ?";
            values.add(this.getPcaMesCalcPer());
        }

        if (this.getPcaDiaCalcPer() != null && this.getPcaDiaCalcPer().longValue() == -999) {
            conditions += " AND PCA_DIA_CALC_PER IS NULL";
        } else if (this.getPcaDiaCalcPer() != null) {
            conditions += " AND PCA_DIA_CALC_PER = ?";
            values.add(this.getPcaDiaCalcPer());
        }

        if (this.getPcaNumPer() != null && this.getPcaNumPer().longValue() == -999) {
            conditions += " AND PCA_NUM_PER IS NULL";
        } else if (this.getPcaNumPer() != null) {
            conditions += " AND PCA_NUM_PER = ?";
            values.add(this.getPcaNumPer());
        }

        if (this.getPcaNumFormula() != null && this.getPcaNumFormula().longValue() == -999) {
            conditions += " AND PCA_NUM_FORMULA IS NULL";
        } else if (this.getPcaNumFormula() != null) {
            conditions += " AND PCA_NUM_FORMULA = ?";
            values.add(this.getPcaNumFormula());
        }

        if (this.getPcaNumTitulos() != null && this.getPcaNumTitulos().longValue() == -999) {
            conditions += " AND PCA_NUM_TITULOS IS NULL";
        } else if (this.getPcaNumTitulos() != null) {
            conditions += " AND PCA_NUM_TITULOS = ?";
            values.add(this.getPcaNumTitulos());
        }

        if (this.getPcaImpNomEmision() != null && this.getPcaImpNomEmision().longValue() == -999) {
            conditions += " AND PCA_IMP_NOM_EMISION IS NULL";
        } else if (this.getPcaImpNomEmision() != null) {
            conditions += " AND PCA_IMP_NOM_EMISION = ?";
            values.add(this.getPcaImpNomEmision());
        }

        if (this.getPcaNumMoneda() != null && this.getPcaNumMoneda().longValue() == -999) {
            conditions += " AND PCA_NUM_MONEDA IS NULL";
        } else if (this.getPcaNumMoneda() != null) {
            conditions += " AND PCA_NUM_MONEDA = ?";
            values.add(this.getPcaNumMoneda());
        }

        if (this.getPcaPjeTasaFija() != null && this.getPcaPjeTasaFija().longValue() == -999) {
            conditions += " AND PCA_PJE_TASA_FIJA IS NULL";
        } else if (this.getPcaPjeTasaFija() != null) {
            conditions += " AND PCA_PJE_TASA_FIJA = ?";
            values.add(this.getPcaPjeTasaFija());
        }

        if (this.getPcaPjeSobretasa() != null && this.getPcaPjeSobretasa().longValue() == -999) {
            conditions += " AND PCA_PJE_SOBRETASA IS NULL";
        } else if (this.getPcaPjeSobretasa() != null) {
            conditions += " AND PCA_PJE_SOBRETASA = ?";
            values.add(this.getPcaPjeSobretasa());
        }

        if (this.getPcaPjeIsr() != null && this.getPcaPjeIsr().longValue() == -999) {
            conditions += " AND PCA_PJE_ISR IS NULL";
        } else if (this.getPcaPjeIsr() != null) {
            conditions += " AND PCA_PJE_ISR = ?";
            values.add(this.getPcaPjeIsr());
        }

        if (this.getPcaPlazo() != null && this.getPcaPlazo().longValue() == -999) {
            conditions += " AND PCA_PLAZO IS NULL";
        } else if (this.getPcaPlazo() != null) {
            conditions += " AND PCA_PLAZO = ?";
            values.add(this.getPcaPlazo());
        }

        if (this.getPcaPeriodicidadMeses() != null && "null".equals(this.getPcaPeriodicidadMeses())) {
            conditions += " AND PCA_PERIODICIDAD_MESES IS NULL";
        } else if (this.getPcaPeriodicidadMeses() != null) {
            conditions += " AND PCA_PERIODICIDAD_MESES = ?";
            values.add(this.getPcaPeriodicidadMeses());
        }

        if (this.getPcaPeriodicidadDias() != null && this.getPcaPeriodicidadDias().longValue() == -999) {
            conditions += " AND PCA_PERIODICIDAD_DIAS IS NULL";
        } else if (this.getPcaPeriodicidadDias() != null) {
            conditions += " AND PCA_PERIODICIDAD_DIAS = ?";
            values.add(this.getPcaPeriodicidadDias());
        }

        if (this.getPcaHabiles() != null && this.getPcaHabiles().longValue() == -999) {
            conditions += " AND PCA_HABILES IS NULL";
        } else if (this.getPcaHabiles() != null) {
            conditions += " AND PCA_HABILES = ?";
            values.add(this.getPcaHabiles());
        }

        if (this.getPcaAnteriores() != null && this.getPcaAnteriores().longValue() == -999) {
            conditions += " AND PCA_ANTERIORES IS NULL";
        } else if (this.getPcaAnteriores() != null) {
            conditions += " AND PCA_ANTERIORES = ?";
            values.add(this.getPcaAnteriores());
        }

        if (this.getPcaNumRegPeriodo() != null && this.getPcaNumRegPeriodo().longValue() == -999) {
            conditions += " AND PCA_NUM_REG_PERIODO IS NULL";
        } else if (this.getPcaNumRegPeriodo() != null) {
            conditions += " AND PCA_NUM_REG_PERIODO = ?";
            values.add(this.getPcaNumRegPeriodo());
        }

        if (this.getPcaNumRegAmort() != null && this.getPcaNumRegAmort().longValue() == -999) {
            conditions += " AND PCA_NUM_REG_AMORT IS NULL";
        } else if (this.getPcaNumRegAmort() != null) {
            conditions += " AND PCA_NUM_REG_AMORT = ?";
            values.add(this.getPcaNumRegAmort());
        }

        if (this.getPcaNumCalculos() != null && this.getPcaNumCalculos().longValue() == -999) {
            conditions += " AND PCA_NUM_CALCULOS IS NULL";
        } else if (this.getPcaNumCalculos() != null) {
            conditions += " AND PCA_NUM_CALCULOS = ?";
            values.add(this.getPcaNumCalculos());
        }

        if (this.getPcaNumModifi() != null && this.getPcaNumModifi().longValue() == -999) {
            conditions += " AND PCA_NUM_MODIFI IS NULL";
        } else if (this.getPcaNumModifi() != null) {
            conditions += " AND PCA_NUM_MODIFI = ?";
            values.add(this.getPcaNumModifi());
        }

        if (this.getPcaAnoAltaReg() != null && this.getPcaAnoAltaReg().longValue() == -999) {
            conditions += " AND PCA_ANO_ALTA_REG IS NULL";
        } else if (this.getPcaAnoAltaReg() != null) {
            conditions += " AND PCA_ANO_ALTA_REG = ?";
            values.add(this.getPcaAnoAltaReg());
        }

        if (this.getPcaMesAltaReg() != null && this.getPcaMesAltaReg().longValue() == -999) {
            conditions += " AND PCA_MES_ALTA_REG IS NULL";
        } else if (this.getPcaMesAltaReg() != null) {
            conditions += " AND PCA_MES_ALTA_REG = ?";
            values.add(this.getPcaMesAltaReg());
        }

        if (this.getPcaDiaAltaReg() != null && this.getPcaDiaAltaReg().longValue() == -999) {
            conditions += " AND PCA_DIA_ALTA_REG IS NULL";
        } else if (this.getPcaDiaAltaReg() != null) {
            conditions += " AND PCA_DIA_ALTA_REG = ?";
            values.add(this.getPcaDiaAltaReg());
        }

        if (this.getPcaAnoUltMod() != null && this.getPcaAnoUltMod().longValue() == -999) {
            conditions += " AND PCA_ANO_ULT_MOD IS NULL";
        } else if (this.getPcaAnoUltMod() != null) {
            conditions += " AND PCA_ANO_ULT_MOD = ?";
            values.add(this.getPcaAnoUltMod());
        }

        if (this.getPcaMesUltMod() != null && this.getPcaMesUltMod().longValue() == -999) {
            conditions += " AND PCA_MES_ULT_MOD IS NULL";
        } else if (this.getPcaMesUltMod() != null) {
            conditions += " AND PCA_MES_ULT_MOD = ?";
            values.add(this.getPcaMesUltMod());
        }

        if (this.getPcaDiaUltMod() != null && this.getPcaDiaUltMod().longValue() == -999) {
            conditions += " AND PCA_DIA_ULT_MOD IS NULL";
        } else if (this.getPcaDiaUltMod() != null) {
            conditions += " AND PCA_DIA_ULT_MOD = ?";
            values.add(this.getPcaDiaUltMod());
        }

        if (this.getPcaCveStParacalc() != null && "null".equals(this.getPcaCveStParacalc())) {
            conditions += " AND PCA_CVE_ST_PARACALC IS NULL";
        } else if (this.getPcaCveStParacalc() != null) {
            conditions += " AND PCA_CVE_ST_PARACALC = ?";
            values.add(this.getPcaCveStParacalc());
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
        String sql = "UPDATE PARACALC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PCA_NUM_PROGRAMA = ?";
        pkValues.add(this.getPcaNumPrograma());
        conditions += " AND PCA_NUM_EMISION = ?";
        pkValues.add(this.getPcaNumEmision());
        conditions += " AND PCA_TIPO_CALCULO = ?";
        pkValues.add(this.getPcaTipoCalculo());
        conditions += " AND PCA_ANO_CALC_PER = ?";
        pkValues.add(this.getPcaAnoCalcPer());
        conditions += " AND PCA_MES_CALC_PER = ?";
        pkValues.add(this.getPcaMesCalcPer());
        conditions += " AND PCA_DIA_CALC_PER = ?";
        pkValues.add(this.getPcaDiaCalcPer());
        fields += " PCA_NUM_PER = ?, ";
        values.add(this.getPcaNumPer());
        fields += " PCA_NUM_FORMULA = ?, ";
        values.add(this.getPcaNumFormula());
        fields += " PCA_NUM_TITULOS = ?, ";
        values.add(this.getPcaNumTitulos());
        fields += " PCA_IMP_NOM_EMISION = ?, ";
        values.add(this.getPcaImpNomEmision());
        fields += " PCA_NUM_MONEDA = ?, ";
        values.add(this.getPcaNumMoneda());
        fields += " PCA_PJE_TASA_FIJA = ?, ";
        values.add(this.getPcaPjeTasaFija());
        fields += " PCA_PJE_SOBRETASA = ?, ";
        values.add(this.getPcaPjeSobretasa());
        fields += " PCA_PJE_ISR = ?, ";
        values.add(this.getPcaPjeIsr());
        fields += " PCA_PLAZO = ?, ";
        values.add(this.getPcaPlazo());
        fields += " PCA_PERIODICIDAD_MESES = ?, ";
        values.add(this.getPcaPeriodicidadMeses());
        fields += " PCA_PERIODICIDAD_DIAS = ?, ";
        values.add(this.getPcaPeriodicidadDias());
        fields += " PCA_HABILES = ?, ";
        values.add(this.getPcaHabiles());
        fields += " PCA_ANTERIORES = ?, ";
        values.add(this.getPcaAnteriores());
        fields += " PCA_NUM_REG_PERIODO = ?, ";
        values.add(this.getPcaNumRegPeriodo());
        fields += " PCA_NUM_REG_AMORT = ?, ";
        values.add(this.getPcaNumRegAmort());
        fields += " PCA_NUM_CALCULOS = ?, ";
        values.add(this.getPcaNumCalculos());
        fields += " PCA_NUM_MODIFI = ?, ";
        values.add(this.getPcaNumModifi());
        fields += " PCA_ANO_ALTA_REG = ?, ";
        values.add(this.getPcaAnoAltaReg());
        fields += " PCA_MES_ALTA_REG = ?, ";
        values.add(this.getPcaMesAltaReg());
        fields += " PCA_DIA_ALTA_REG = ?, ";
        values.add(this.getPcaDiaAltaReg());
        fields += " PCA_ANO_ULT_MOD = ?, ";
        values.add(this.getPcaAnoUltMod());
        fields += " PCA_MES_ULT_MOD = ?, ";
        values.add(this.getPcaMesUltMod());
        fields += " PCA_DIA_ULT_MOD = ?, ";
        values.add(this.getPcaDiaUltMod());
        fields += " PCA_CVE_ST_PARACALC = ?, ";
        values.add(this.getPcaCveStParacalc());
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
        String sql = "INSERT INTO PARACALC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PCA_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getPcaNumPrograma());

        fields += ", PCA_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getPcaNumEmision());

        fields += ", PCA_TIPO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getPcaTipoCalculo());

        fields += ", PCA_ANO_CALC_PER";
        fieldValues += ", ?";
        values.add(this.getPcaAnoCalcPer());

        fields += ", PCA_MES_CALC_PER";
        fieldValues += ", ?";
        values.add(this.getPcaMesCalcPer());

        fields += ", PCA_DIA_CALC_PER";
        fieldValues += ", ?";
        values.add(this.getPcaDiaCalcPer());

        fields += ", PCA_NUM_PER";
        fieldValues += ", ?";
        values.add(this.getPcaNumPer());

        fields += ", PCA_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getPcaNumFormula());

        fields += ", PCA_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getPcaNumTitulos());

        fields += ", PCA_IMP_NOM_EMISION";
        fieldValues += ", ?";
        values.add(this.getPcaImpNomEmision());

        fields += ", PCA_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getPcaNumMoneda());

        fields += ", PCA_PJE_TASA_FIJA";
        fieldValues += ", ?";
        values.add(this.getPcaPjeTasaFija());

        fields += ", PCA_PJE_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getPcaPjeSobretasa());

        fields += ", PCA_PJE_ISR";
        fieldValues += ", ?";
        values.add(this.getPcaPjeIsr());

        fields += ", PCA_PLAZO";
        fieldValues += ", ?";
        values.add(this.getPcaPlazo());

        fields += ", PCA_PERIODICIDAD_MESES";
        fieldValues += ", ?";
        values.add(this.getPcaPeriodicidadMeses());

        fields += ", PCA_PERIODICIDAD_DIAS";
        fieldValues += ", ?";
        values.add(this.getPcaPeriodicidadDias());

        fields += ", PCA_HABILES";
        fieldValues += ", ?";
        values.add(this.getPcaHabiles());

        fields += ", PCA_ANTERIORES";
        fieldValues += ", ?";
        values.add(this.getPcaAnteriores());

        fields += ", PCA_NUM_REG_PERIODO";
        fieldValues += ", ?";
        values.add(this.getPcaNumRegPeriodo());

        fields += ", PCA_NUM_REG_AMORT";
        fieldValues += ", ?";
        values.add(this.getPcaNumRegAmort());

        fields += ", PCA_NUM_CALCULOS";
        fieldValues += ", ?";
        values.add(this.getPcaNumCalculos());

        fields += ", PCA_NUM_MODIFI";
        fieldValues += ", ?";
        values.add(this.getPcaNumModifi());

        fields += ", PCA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPcaAnoAltaReg());

        fields += ", PCA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPcaMesAltaReg());

        fields += ", PCA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPcaDiaAltaReg());

        fields += ", PCA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPcaAnoUltMod());

        fields += ", PCA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPcaMesUltMod());

        fields += ", PCA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPcaDiaUltMod());

        fields += ", PCA_CVE_ST_PARACALC";
        fieldValues += ", ?";
        values.add(this.getPcaCveStParacalc());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARACALC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PCA_NUM_PROGRAMA = ?";
        values.add(this.getPcaNumPrograma());
        conditions += " AND PCA_NUM_EMISION = ?";
        values.add(this.getPcaNumEmision());
        conditions += " AND PCA_TIPO_CALCULO = ?";
        values.add(this.getPcaTipoCalculo());
        conditions += " AND PCA_ANO_CALC_PER = ?";
        values.add(this.getPcaAnoCalcPer());
        conditions += " AND PCA_MES_CALC_PER = ?";
        values.add(this.getPcaMesCalcPer());
        conditions += " AND PCA_DIA_CALC_PER = ?";
        values.add(this.getPcaDiaCalcPer());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Paracalc instance = (Paracalc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPcaNumPrograma().equals(instance.getPcaNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getPcaNumEmision().equals(instance.getPcaNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getPcaTipoCalculo().equals(instance.getPcaTipoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getPcaAnoCalcPer().equals(instance.getPcaAnoCalcPer()))
            equalObjects = false;
        if (equalObjects && !this.getPcaMesCalcPer().equals(instance.getPcaMesCalcPer()))
            equalObjects = false;
        if (equalObjects && !this.getPcaDiaCalcPer().equals(instance.getPcaDiaCalcPer()))
            equalObjects = false;
        if (equalObjects && !this.getPcaNumPer().equals(instance.getPcaNumPer()))
            equalObjects = false;
        if (equalObjects && !this.getPcaNumFormula().equals(instance.getPcaNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getPcaNumTitulos().equals(instance.getPcaNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getPcaImpNomEmision().equals(instance.getPcaImpNomEmision()))
            equalObjects = false;
        if (equalObjects && !this.getPcaNumMoneda().equals(instance.getPcaNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getPcaPjeTasaFija().equals(instance.getPcaPjeTasaFija()))
            equalObjects = false;
        if (equalObjects && !this.getPcaPjeSobretasa().equals(instance.getPcaPjeSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getPcaPjeIsr().equals(instance.getPcaPjeIsr()))
            equalObjects = false;
        if (equalObjects && !this.getPcaPlazo().equals(instance.getPcaPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getPcaPeriodicidadMeses().equals(instance.getPcaPeriodicidadMeses()))
            equalObjects = false;
        if (equalObjects && !this.getPcaPeriodicidadDias().equals(instance.getPcaPeriodicidadDias()))
            equalObjects = false;
        if (equalObjects && !this.getPcaHabiles().equals(instance.getPcaHabiles()))
            equalObjects = false;
        if (equalObjects && !this.getPcaAnteriores().equals(instance.getPcaAnteriores()))
            equalObjects = false;
        if (equalObjects && !this.getPcaNumRegPeriodo().equals(instance.getPcaNumRegPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getPcaNumRegAmort().equals(instance.getPcaNumRegAmort()))
            equalObjects = false;
        if (equalObjects && !this.getPcaNumCalculos().equals(instance.getPcaNumCalculos()))
            equalObjects = false;
        if (equalObjects && !this.getPcaNumModifi().equals(instance.getPcaNumModifi()))
            equalObjects = false;
        if (equalObjects && !this.getPcaAnoAltaReg().equals(instance.getPcaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPcaMesAltaReg().equals(instance.getPcaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPcaDiaAltaReg().equals(instance.getPcaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPcaAnoUltMod().equals(instance.getPcaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPcaMesUltMod().equals(instance.getPcaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPcaDiaUltMod().equals(instance.getPcaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPcaCveStParacalc().equals(instance.getPcaCveStParacalc()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Paracalc result = new Paracalc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPcaNumPrograma((BigDecimal) objectData.getData("PCA_NUM_PROGRAMA"));
        result.setPcaNumEmision((BigDecimal) objectData.getData("PCA_NUM_EMISION"));
        result.setPcaTipoCalculo((BigDecimal) objectData.getData("PCA_TIPO_CALCULO"));
        result.setPcaAnoCalcPer((BigDecimal) objectData.getData("PCA_ANO_CALC_PER"));
        result.setPcaMesCalcPer((BigDecimal) objectData.getData("PCA_MES_CALC_PER"));
        result.setPcaDiaCalcPer((BigDecimal) objectData.getData("PCA_DIA_CALC_PER"));
        result.setPcaNumPer((BigDecimal) objectData.getData("PCA_NUM_PER"));
        result.setPcaNumFormula((BigDecimal) objectData.getData("PCA_NUM_FORMULA"));
        result.setPcaNumTitulos((BigDecimal) objectData.getData("PCA_NUM_TITULOS"));
        result.setPcaImpNomEmision((BigDecimal) objectData.getData("PCA_IMP_NOM_EMISION"));
        result.setPcaNumMoneda((BigDecimal) objectData.getData("PCA_NUM_MONEDA"));
        result.setPcaPjeTasaFija((BigDecimal) objectData.getData("PCA_PJE_TASA_FIJA"));
        result.setPcaPjeSobretasa((BigDecimal) objectData.getData("PCA_PJE_SOBRETASA"));
        result.setPcaPjeIsr((BigDecimal) objectData.getData("PCA_PJE_ISR"));
        result.setPcaPlazo((BigDecimal) objectData.getData("PCA_PLAZO"));
        result.setPcaPeriodicidadMeses((String) objectData.getData("PCA_PERIODICIDAD_MESES"));
        result.setPcaPeriodicidadDias((BigDecimal) objectData.getData("PCA_PERIODICIDAD_DIAS"));
        result.setPcaHabiles((BigDecimal) objectData.getData("PCA_HABILES"));
        result.setPcaAnteriores((BigDecimal) objectData.getData("PCA_ANTERIORES"));
        result.setPcaNumRegPeriodo((BigDecimal) objectData.getData("PCA_NUM_REG_PERIODO"));
        result.setPcaNumRegAmort((BigDecimal) objectData.getData("PCA_NUM_REG_AMORT"));
        result.setPcaNumCalculos((BigDecimal) objectData.getData("PCA_NUM_CALCULOS"));
        result.setPcaNumModifi((BigDecimal) objectData.getData("PCA_NUM_MODIFI"));
        result.setPcaAnoAltaReg((BigDecimal) objectData.getData("PCA_ANO_ALTA_REG"));
        result.setPcaMesAltaReg((BigDecimal) objectData.getData("PCA_MES_ALTA_REG"));
        result.setPcaDiaAltaReg((BigDecimal) objectData.getData("PCA_DIA_ALTA_REG"));
        result.setPcaAnoUltMod((BigDecimal) objectData.getData("PCA_ANO_ULT_MOD"));
        result.setPcaMesUltMod((BigDecimal) objectData.getData("PCA_MES_ULT_MOD"));
        result.setPcaDiaUltMod((BigDecimal) objectData.getData("PCA_DIA_ULT_MOD"));
        result.setPcaCveStParacalc((String) objectData.getData("PCA_CVE_ST_PARACALC"));

        return result;

    }

}
