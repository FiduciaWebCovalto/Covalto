package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "AVISAUTO_PK", columns = { "AVA_NUM_PROGRAMA", "AVA_NUM_EMISION", "AVA_NUM_AUTORIDAD", "AVA_NUM_RESPONSABLE" }, sequences = { "MANUAL" })
public class Avisauto extends DomainObject {

    BigDecimal avaNumPrograma = null;
    BigDecimal avaNumEmision = null;
    BigDecimal avaNumAutoridad = null;
    BigDecimal avaNumResponsable = null;
    BigDecimal avaPublica = null;
    BigDecimal avaNumDiasAntes = null;
    BigDecimal avaDiasHabiles = null;
    BigDecimal avaIntereses = null;
    BigDecimal avaPerVenInts = null;
    BigDecimal avaTasas = null;
    BigDecimal avaPerVenTasas = null;
    BigDecimal avaCapitaliza = null;
    BigDecimal avaPerVenCapita = null;
    BigDecimal avaAmortiza = null;
    BigDecimal avaPerVenAmor = null;
    BigDecimal avaNominal = null;
    BigDecimal avaPerVenNom = null;
    BigDecimal avaTitulos = null;
    BigDecimal avaPerVenTitulos = null;
    BigDecimal avaAnoAltaReg = null;
    BigDecimal avaMesAltaReg = null;
    BigDecimal avaDiaAltaReg = null;
    BigDecimal avaAnoUltMod = null;
    BigDecimal avaMesUltMod = null;
    BigDecimal avaDiaUltMod = null;
    String avaCveStAvisauto = null;

    public Avisauto() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaNumPrograma(BigDecimal avaNumPrograma) {
        this.avaNumPrograma = avaNumPrograma;
    }

    public BigDecimal getAvaNumPrograma() {
        return this.avaNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaNumEmision(BigDecimal avaNumEmision) {
        this.avaNumEmision = avaNumEmision;
    }

    public BigDecimal getAvaNumEmision() {
        return this.avaNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaNumAutoridad(BigDecimal avaNumAutoridad) {
        this.avaNumAutoridad = avaNumAutoridad;
    }

    public BigDecimal getAvaNumAutoridad() {
        return this.avaNumAutoridad;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaNumResponsable(BigDecimal avaNumResponsable) {
        this.avaNumResponsable = avaNumResponsable;
    }

    public BigDecimal getAvaNumResponsable() {
        return this.avaNumResponsable;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAvaPublica(BigDecimal avaPublica) {
        this.avaPublica = avaPublica;
    }

    public BigDecimal getAvaPublica() {
        return this.avaPublica;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaNumDiasAntes(BigDecimal avaNumDiasAntes) {
        this.avaNumDiasAntes = avaNumDiasAntes;
    }

    public BigDecimal getAvaNumDiasAntes() {
        return this.avaNumDiasAntes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaDiasHabiles(BigDecimal avaDiasHabiles) {
        this.avaDiasHabiles = avaDiasHabiles;
    }

    public BigDecimal getAvaDiasHabiles() {
        return this.avaDiasHabiles;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaIntereses(BigDecimal avaIntereses) {
        this.avaIntereses = avaIntereses;
    }

    public BigDecimal getAvaIntereses() {
        return this.avaIntereses;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaPerVenInts(BigDecimal avaPerVenInts) {
        this.avaPerVenInts = avaPerVenInts;
    }

    public BigDecimal getAvaPerVenInts() {
        return this.avaPerVenInts;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaTasas(BigDecimal avaTasas) {
        this.avaTasas = avaTasas;
    }

    public BigDecimal getAvaTasas() {
        return this.avaTasas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaPerVenTasas(BigDecimal avaPerVenTasas) {
        this.avaPerVenTasas = avaPerVenTasas;
    }

    public BigDecimal getAvaPerVenTasas() {
        return this.avaPerVenTasas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaCapitaliza(BigDecimal avaCapitaliza) {
        this.avaCapitaliza = avaCapitaliza;
    }

    public BigDecimal getAvaCapitaliza() {
        return this.avaCapitaliza;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaPerVenCapita(BigDecimal avaPerVenCapita) {
        this.avaPerVenCapita = avaPerVenCapita;
    }

    public BigDecimal getAvaPerVenCapita() {
        return this.avaPerVenCapita;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaAmortiza(BigDecimal avaAmortiza) {
        this.avaAmortiza = avaAmortiza;
    }

    public BigDecimal getAvaAmortiza() {
        return this.avaAmortiza;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaPerVenAmor(BigDecimal avaPerVenAmor) {
        this.avaPerVenAmor = avaPerVenAmor;
    }

    public BigDecimal getAvaPerVenAmor() {
        return this.avaPerVenAmor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaNominal(BigDecimal avaNominal) {
        this.avaNominal = avaNominal;
    }

    public BigDecimal getAvaNominal() {
        return this.avaNominal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaPerVenNom(BigDecimal avaPerVenNom) {
        this.avaPerVenNom = avaPerVenNom;
    }

    public BigDecimal getAvaPerVenNom() {
        return this.avaPerVenNom;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaTitulos(BigDecimal avaTitulos) {
        this.avaTitulos = avaTitulos;
    }

    public BigDecimal getAvaTitulos() {
        return this.avaTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setAvaPerVenTitulos(BigDecimal avaPerVenTitulos) {
        this.avaPerVenTitulos = avaPerVenTitulos;
    }

    public BigDecimal getAvaPerVenTitulos() {
        return this.avaPerVenTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAvaAnoAltaReg(BigDecimal avaAnoAltaReg) {
        this.avaAnoAltaReg = avaAnoAltaReg;
    }

    public BigDecimal getAvaAnoAltaReg() {
        return this.avaAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAvaMesAltaReg(BigDecimal avaMesAltaReg) {
        this.avaMesAltaReg = avaMesAltaReg;
    }

    public BigDecimal getAvaMesAltaReg() {
        return this.avaMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAvaDiaAltaReg(BigDecimal avaDiaAltaReg) {
        this.avaDiaAltaReg = avaDiaAltaReg;
    }

    public BigDecimal getAvaDiaAltaReg() {
        return this.avaDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setAvaAnoUltMod(BigDecimal avaAnoUltMod) {
        this.avaAnoUltMod = avaAnoUltMod;
    }

    public BigDecimal getAvaAnoUltMod() {
        return this.avaAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAvaMesUltMod(BigDecimal avaMesUltMod) {
        this.avaMesUltMod = avaMesUltMod;
    }

    public BigDecimal getAvaMesUltMod() {
        return this.avaMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setAvaDiaUltMod(BigDecimal avaDiaUltMod) {
        this.avaDiaUltMod = avaDiaUltMod;
    }

    public BigDecimal getAvaDiaUltMod() {
        return this.avaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAvaCveStAvisauto(String avaCveStAvisauto) {
        this.avaCveStAvisauto = avaCveStAvisauto;
    }

    public String getAvaCveStAvisauto() {
        return this.avaCveStAvisauto;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM AVISAUTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAvaNumPrograma() != null && this.getAvaNumPrograma().longValue() == -999) {
            conditions += " AND AVA_NUM_PROGRAMA IS NULL";
        } else if (this.getAvaNumPrograma() != null) {
            conditions += " AND AVA_NUM_PROGRAMA = ?";
            values.add(this.getAvaNumPrograma());
        }

        if (this.getAvaNumEmision() != null && this.getAvaNumEmision().longValue() == -999) {
            conditions += " AND AVA_NUM_EMISION IS NULL";
        } else if (this.getAvaNumEmision() != null) {
            conditions += " AND AVA_NUM_EMISION = ?";
            values.add(this.getAvaNumEmision());
        }

        if (this.getAvaNumAutoridad() != null && this.getAvaNumAutoridad().longValue() == -999) {
            conditions += " AND AVA_NUM_AUTORIDAD IS NULL";
        } else if (this.getAvaNumAutoridad() != null) {
            conditions += " AND AVA_NUM_AUTORIDAD = ?";
            values.add(this.getAvaNumAutoridad());
        }

        if (this.getAvaNumResponsable() != null && this.getAvaNumResponsable().longValue() == -999) {
            conditions += " AND AVA_NUM_RESPONSABLE IS NULL";
        } else if (this.getAvaNumResponsable() != null) {
            conditions += " AND AVA_NUM_RESPONSABLE = ?";
            values.add(this.getAvaNumResponsable());
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
        String sql = "SELECT * FROM AVISAUTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAvaNumPrograma() != null && this.getAvaNumPrograma().longValue() == -999) {
            conditions += " AND AVA_NUM_PROGRAMA IS NULL";
        } else if (this.getAvaNumPrograma() != null) {
            conditions += " AND AVA_NUM_PROGRAMA = ?";
            values.add(this.getAvaNumPrograma());
        }

        if (this.getAvaNumEmision() != null && this.getAvaNumEmision().longValue() == -999) {
            conditions += " AND AVA_NUM_EMISION IS NULL";
        } else if (this.getAvaNumEmision() != null) {
            conditions += " AND AVA_NUM_EMISION = ?";
            values.add(this.getAvaNumEmision());
        }

        if (this.getAvaNumAutoridad() != null && this.getAvaNumAutoridad().longValue() == -999) {
            conditions += " AND AVA_NUM_AUTORIDAD IS NULL";
        } else if (this.getAvaNumAutoridad() != null) {
            conditions += " AND AVA_NUM_AUTORIDAD = ?";
            values.add(this.getAvaNumAutoridad());
        }

        if (this.getAvaNumResponsable() != null && this.getAvaNumResponsable().longValue() == -999) {
            conditions += " AND AVA_NUM_RESPONSABLE IS NULL";
        } else if (this.getAvaNumResponsable() != null) {
            conditions += " AND AVA_NUM_RESPONSABLE = ?";
            values.add(this.getAvaNumResponsable());
        }

        if (this.getAvaPublica() != null && this.getAvaPublica().longValue() == -999) {
            conditions += " AND AVA_PUBLICA IS NULL";
        } else if (this.getAvaPublica() != null) {
            conditions += " AND AVA_PUBLICA = ?";
            values.add(this.getAvaPublica());
        }

        if (this.getAvaNumDiasAntes() != null && this.getAvaNumDiasAntes().longValue() == -999) {
            conditions += " AND AVA_NUM_DIAS_ANTES IS NULL";
        } else if (this.getAvaNumDiasAntes() != null) {
            conditions += " AND AVA_NUM_DIAS_ANTES = ?";
            values.add(this.getAvaNumDiasAntes());
        }

        if (this.getAvaDiasHabiles() != null && this.getAvaDiasHabiles().longValue() == -999) {
            conditions += " AND AVA_DIAS_HABILES IS NULL";
        } else if (this.getAvaDiasHabiles() != null) {
            conditions += " AND AVA_DIAS_HABILES = ?";
            values.add(this.getAvaDiasHabiles());
        }

        if (this.getAvaIntereses() != null && this.getAvaIntereses().longValue() == -999) {
            conditions += " AND AVA_INTERESES IS NULL";
        } else if (this.getAvaIntereses() != null) {
            conditions += " AND AVA_INTERESES = ?";
            values.add(this.getAvaIntereses());
        }

        if (this.getAvaPerVenInts() != null && this.getAvaPerVenInts().longValue() == -999) {
            conditions += " AND AVA_PER_VEN_INTS IS NULL";
        } else if (this.getAvaPerVenInts() != null) {
            conditions += " AND AVA_PER_VEN_INTS = ?";
            values.add(this.getAvaPerVenInts());
        }

        if (this.getAvaTasas() != null && this.getAvaTasas().longValue() == -999) {
            conditions += " AND AVA_TASAS IS NULL";
        } else if (this.getAvaTasas() != null) {
            conditions += " AND AVA_TASAS = ?";
            values.add(this.getAvaTasas());
        }

        if (this.getAvaPerVenTasas() != null && this.getAvaPerVenTasas().longValue() == -999) {
            conditions += " AND AVA_PER_VEN_TASAS IS NULL";
        } else if (this.getAvaPerVenTasas() != null) {
            conditions += " AND AVA_PER_VEN_TASAS = ?";
            values.add(this.getAvaPerVenTasas());
        }

        if (this.getAvaCapitaliza() != null && this.getAvaCapitaliza().longValue() == -999) {
            conditions += " AND AVA_CAPITALIZA IS NULL";
        } else if (this.getAvaCapitaliza() != null) {
            conditions += " AND AVA_CAPITALIZA = ?";
            values.add(this.getAvaCapitaliza());
        }

        if (this.getAvaPerVenCapita() != null && this.getAvaPerVenCapita().longValue() == -999) {
            conditions += " AND AVA_PER_VEN_CAPITA IS NULL";
        } else if (this.getAvaPerVenCapita() != null) {
            conditions += " AND AVA_PER_VEN_CAPITA = ?";
            values.add(this.getAvaPerVenCapita());
        }

        if (this.getAvaAmortiza() != null && this.getAvaAmortiza().longValue() == -999) {
            conditions += " AND AVA_AMORTIZA IS NULL";
        } else if (this.getAvaAmortiza() != null) {
            conditions += " AND AVA_AMORTIZA = ?";
            values.add(this.getAvaAmortiza());
        }

        if (this.getAvaPerVenAmor() != null && this.getAvaPerVenAmor().longValue() == -999) {
            conditions += " AND AVA_PER_VEN_AMOR IS NULL";
        } else if (this.getAvaPerVenAmor() != null) {
            conditions += " AND AVA_PER_VEN_AMOR = ?";
            values.add(this.getAvaPerVenAmor());
        }

        if (this.getAvaNominal() != null && this.getAvaNominal().longValue() == -999) {
            conditions += " AND AVA_NOMINAL IS NULL";
        } else if (this.getAvaNominal() != null) {
            conditions += " AND AVA_NOMINAL = ?";
            values.add(this.getAvaNominal());
        }

        if (this.getAvaPerVenNom() != null && this.getAvaPerVenNom().longValue() == -999) {
            conditions += " AND AVA_PER_VEN_NOM IS NULL";
        } else if (this.getAvaPerVenNom() != null) {
            conditions += " AND AVA_PER_VEN_NOM = ?";
            values.add(this.getAvaPerVenNom());
        }

        if (this.getAvaTitulos() != null && this.getAvaTitulos().longValue() == -999) {
            conditions += " AND AVA_TITULOS IS NULL";
        } else if (this.getAvaTitulos() != null) {
            conditions += " AND AVA_TITULOS = ?";
            values.add(this.getAvaTitulos());
        }

        if (this.getAvaPerVenTitulos() != null && this.getAvaPerVenTitulos().longValue() == -999) {
            conditions += " AND AVA_PER_VEN_TITULOS IS NULL";
        } else if (this.getAvaPerVenTitulos() != null) {
            conditions += " AND AVA_PER_VEN_TITULOS = ?";
            values.add(this.getAvaPerVenTitulos());
        }

        if (this.getAvaAnoAltaReg() != null && this.getAvaAnoAltaReg().longValue() == -999) {
            conditions += " AND AVA_ANO_ALTA_REG IS NULL";
        } else if (this.getAvaAnoAltaReg() != null) {
            conditions += " AND AVA_ANO_ALTA_REG = ?";
            values.add(this.getAvaAnoAltaReg());
        }

        if (this.getAvaMesAltaReg() != null && this.getAvaMesAltaReg().longValue() == -999) {
            conditions += " AND AVA_MES_ALTA_REG IS NULL";
        } else if (this.getAvaMesAltaReg() != null) {
            conditions += " AND AVA_MES_ALTA_REG = ?";
            values.add(this.getAvaMesAltaReg());
        }

        if (this.getAvaDiaAltaReg() != null && this.getAvaDiaAltaReg().longValue() == -999) {
            conditions += " AND AVA_DIA_ALTA_REG IS NULL";
        } else if (this.getAvaDiaAltaReg() != null) {
            conditions += " AND AVA_DIA_ALTA_REG = ?";
            values.add(this.getAvaDiaAltaReg());
        }

        if (this.getAvaAnoUltMod() != null && this.getAvaAnoUltMod().longValue() == -999) {
            conditions += " AND AVA_ANO_ULT_MOD IS NULL";
        } else if (this.getAvaAnoUltMod() != null) {
            conditions += " AND AVA_ANO_ULT_MOD = ?";
            values.add(this.getAvaAnoUltMod());
        }

        if (this.getAvaMesUltMod() != null && this.getAvaMesUltMod().longValue() == -999) {
            conditions += " AND AVA_MES_ULT_MOD IS NULL";
        } else if (this.getAvaMesUltMod() != null) {
            conditions += " AND AVA_MES_ULT_MOD = ?";
            values.add(this.getAvaMesUltMod());
        }

        if (this.getAvaDiaUltMod() != null && this.getAvaDiaUltMod().longValue() == -999) {
            conditions += " AND AVA_DIA_ULT_MOD IS NULL";
        } else if (this.getAvaDiaUltMod() != null) {
            conditions += " AND AVA_DIA_ULT_MOD = ?";
            values.add(this.getAvaDiaUltMod());
        }

        if (this.getAvaCveStAvisauto() != null && "null".equals(this.getAvaCveStAvisauto())) {
            conditions += " AND AVA_CVE_ST_AVISAUTO IS NULL";
        } else if (this.getAvaCveStAvisauto() != null) {
            conditions += " AND AVA_CVE_ST_AVISAUTO = ?";
            values.add(this.getAvaCveStAvisauto());
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
        String sql = "UPDATE AVISAUTO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND AVA_NUM_PROGRAMA = ?";
        pkValues.add(this.getAvaNumPrograma());
        conditions += " AND AVA_NUM_EMISION = ?";
        pkValues.add(this.getAvaNumEmision());
        conditions += " AND AVA_NUM_AUTORIDAD = ?";
        pkValues.add(this.getAvaNumAutoridad());
        conditions += " AND AVA_NUM_RESPONSABLE = ?";
        pkValues.add(this.getAvaNumResponsable());
        fields += " AVA_PUBLICA = ?, ";
        values.add(this.getAvaPublica());
        fields += " AVA_NUM_DIAS_ANTES = ?, ";
        values.add(this.getAvaNumDiasAntes());
        fields += " AVA_DIAS_HABILES = ?, ";
        values.add(this.getAvaDiasHabiles());
        fields += " AVA_INTERESES = ?, ";
        values.add(this.getAvaIntereses());
        fields += " AVA_PER_VEN_INTS = ?, ";
        values.add(this.getAvaPerVenInts());
        fields += " AVA_TASAS = ?, ";
        values.add(this.getAvaTasas());
        fields += " AVA_PER_VEN_TASAS = ?, ";
        values.add(this.getAvaPerVenTasas());
        fields += " AVA_CAPITALIZA = ?, ";
        values.add(this.getAvaCapitaliza());
        fields += " AVA_PER_VEN_CAPITA = ?, ";
        values.add(this.getAvaPerVenCapita());
        fields += " AVA_AMORTIZA = ?, ";
        values.add(this.getAvaAmortiza());
        fields += " AVA_PER_VEN_AMOR = ?, ";
        values.add(this.getAvaPerVenAmor());
        fields += " AVA_NOMINAL = ?, ";
        values.add(this.getAvaNominal());
        fields += " AVA_PER_VEN_NOM = ?, ";
        values.add(this.getAvaPerVenNom());
        fields += " AVA_TITULOS = ?, ";
        values.add(this.getAvaTitulos());
        fields += " AVA_PER_VEN_TITULOS = ?, ";
        values.add(this.getAvaPerVenTitulos());
        fields += " AVA_ANO_ALTA_REG = ?, ";
        values.add(this.getAvaAnoAltaReg());
        fields += " AVA_MES_ALTA_REG = ?, ";
        values.add(this.getAvaMesAltaReg());
        fields += " AVA_DIA_ALTA_REG = ?, ";
        values.add(this.getAvaDiaAltaReg());
        fields += " AVA_ANO_ULT_MOD = ?, ";
        values.add(this.getAvaAnoUltMod());
        fields += " AVA_MES_ULT_MOD = ?, ";
        values.add(this.getAvaMesUltMod());
        fields += " AVA_DIA_ULT_MOD = ?, ";
        values.add(this.getAvaDiaUltMod());
        fields += " AVA_CVE_ST_AVISAUTO = ?, ";
        values.add(this.getAvaCveStAvisauto());
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
        String sql = "INSERT INTO AVISAUTO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", AVA_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getAvaNumPrograma());

        fields += ", AVA_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getAvaNumEmision());

        fields += ", AVA_NUM_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getAvaNumAutoridad());

        fields += ", AVA_NUM_RESPONSABLE";
        fieldValues += ", ?";
        values.add(this.getAvaNumResponsable());

        fields += ", AVA_PUBLICA";
        fieldValues += ", ?";
        values.add(this.getAvaPublica());

        fields += ", AVA_NUM_DIAS_ANTES";
        fieldValues += ", ?";
        values.add(this.getAvaNumDiasAntes());

        fields += ", AVA_DIAS_HABILES";
        fieldValues += ", ?";
        values.add(this.getAvaDiasHabiles());

        fields += ", AVA_INTERESES";
        fieldValues += ", ?";
        values.add(this.getAvaIntereses());

        fields += ", AVA_PER_VEN_INTS";
        fieldValues += ", ?";
        values.add(this.getAvaPerVenInts());

        fields += ", AVA_TASAS";
        fieldValues += ", ?";
        values.add(this.getAvaTasas());

        fields += ", AVA_PER_VEN_TASAS";
        fieldValues += ", ?";
        values.add(this.getAvaPerVenTasas());

        fields += ", AVA_CAPITALIZA";
        fieldValues += ", ?";
        values.add(this.getAvaCapitaliza());

        fields += ", AVA_PER_VEN_CAPITA";
        fieldValues += ", ?";
        values.add(this.getAvaPerVenCapita());

        fields += ", AVA_AMORTIZA";
        fieldValues += ", ?";
        values.add(this.getAvaAmortiza());

        fields += ", AVA_PER_VEN_AMOR";
        fieldValues += ", ?";
        values.add(this.getAvaPerVenAmor());

        fields += ", AVA_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getAvaNominal());

        fields += ", AVA_PER_VEN_NOM";
        fieldValues += ", ?";
        values.add(this.getAvaPerVenNom());

        fields += ", AVA_TITULOS";
        fieldValues += ", ?";
        values.add(this.getAvaTitulos());

        fields += ", AVA_PER_VEN_TITULOS";
        fieldValues += ", ?";
        values.add(this.getAvaPerVenTitulos());

        fields += ", AVA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAvaAnoAltaReg());

        fields += ", AVA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAvaMesAltaReg());

        fields += ", AVA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getAvaDiaAltaReg());

        fields += ", AVA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAvaAnoUltMod());

        fields += ", AVA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAvaMesUltMod());

        fields += ", AVA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getAvaDiaUltMod());

        fields += ", AVA_CVE_ST_AVISAUTO";
        fieldValues += ", ?";
        values.add(this.getAvaCveStAvisauto());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM AVISAUTO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND AVA_NUM_PROGRAMA = ?";
        values.add(this.getAvaNumPrograma());
        conditions += " AND AVA_NUM_EMISION = ?";
        values.add(this.getAvaNumEmision());
        conditions += " AND AVA_NUM_AUTORIDAD = ?";
        values.add(this.getAvaNumAutoridad());
        conditions += " AND AVA_NUM_RESPONSABLE = ?";
        values.add(this.getAvaNumResponsable());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Avisauto instance = (Avisauto) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAvaNumPrograma().equals(instance.getAvaNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getAvaNumEmision().equals(instance.getAvaNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getAvaNumAutoridad().equals(instance.getAvaNumAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getAvaNumResponsable().equals(instance.getAvaNumResponsable()))
            equalObjects = false;
        if (equalObjects && !this.getAvaPublica().equals(instance.getAvaPublica()))
            equalObjects = false;
        if (equalObjects && !this.getAvaNumDiasAntes().equals(instance.getAvaNumDiasAntes()))
            equalObjects = false;
        if (equalObjects && !this.getAvaDiasHabiles().equals(instance.getAvaDiasHabiles()))
            equalObjects = false;
        if (equalObjects && !this.getAvaIntereses().equals(instance.getAvaIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getAvaPerVenInts().equals(instance.getAvaPerVenInts()))
            equalObjects = false;
        if (equalObjects && !this.getAvaTasas().equals(instance.getAvaTasas()))
            equalObjects = false;
        if (equalObjects && !this.getAvaPerVenTasas().equals(instance.getAvaPerVenTasas()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCapitaliza().equals(instance.getAvaCapitaliza()))
            equalObjects = false;
        if (equalObjects && !this.getAvaPerVenCapita().equals(instance.getAvaPerVenCapita()))
            equalObjects = false;
        if (equalObjects && !this.getAvaAmortiza().equals(instance.getAvaAmortiza()))
            equalObjects = false;
        if (equalObjects && !this.getAvaPerVenAmor().equals(instance.getAvaPerVenAmor()))
            equalObjects = false;
        if (equalObjects && !this.getAvaNominal().equals(instance.getAvaNominal()))
            equalObjects = false;
        if (equalObjects && !this.getAvaPerVenNom().equals(instance.getAvaPerVenNom()))
            equalObjects = false;
        if (equalObjects && !this.getAvaTitulos().equals(instance.getAvaTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getAvaPerVenTitulos().equals(instance.getAvaPerVenTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getAvaAnoAltaReg().equals(instance.getAvaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAvaMesAltaReg().equals(instance.getAvaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAvaDiaAltaReg().equals(instance.getAvaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getAvaAnoUltMod().equals(instance.getAvaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAvaMesUltMod().equals(instance.getAvaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAvaDiaUltMod().equals(instance.getAvaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAvaCveStAvisauto().equals(instance.getAvaCveStAvisauto()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Avisauto result = new Avisauto();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAvaNumPrograma((BigDecimal) objectData.getData("AVA_NUM_PROGRAMA"));
        result.setAvaNumEmision((BigDecimal) objectData.getData("AVA_NUM_EMISION"));
        result.setAvaNumAutoridad((BigDecimal) objectData.getData("AVA_NUM_AUTORIDAD"));
        result.setAvaNumResponsable((BigDecimal) objectData.getData("AVA_NUM_RESPONSABLE"));
        result.setAvaPublica((BigDecimal) objectData.getData("AVA_PUBLICA"));
        result.setAvaNumDiasAntes((BigDecimal) objectData.getData("AVA_NUM_DIAS_ANTES"));
        result.setAvaDiasHabiles((BigDecimal) objectData.getData("AVA_DIAS_HABILES"));
        result.setAvaIntereses((BigDecimal) objectData.getData("AVA_INTERESES"));
        result.setAvaPerVenInts((BigDecimal) objectData.getData("AVA_PER_VEN_INTS"));
        result.setAvaTasas((BigDecimal) objectData.getData("AVA_TASAS"));
        result.setAvaPerVenTasas((BigDecimal) objectData.getData("AVA_PER_VEN_TASAS"));
        result.setAvaCapitaliza((BigDecimal) objectData.getData("AVA_CAPITALIZA"));
        result.setAvaPerVenCapita((BigDecimal) objectData.getData("AVA_PER_VEN_CAPITA"));
        result.setAvaAmortiza((BigDecimal) objectData.getData("AVA_AMORTIZA"));
        result.setAvaPerVenAmor((BigDecimal) objectData.getData("AVA_PER_VEN_AMOR"));
        result.setAvaNominal((BigDecimal) objectData.getData("AVA_NOMINAL"));
        result.setAvaPerVenNom((BigDecimal) objectData.getData("AVA_PER_VEN_NOM"));
        result.setAvaTitulos((BigDecimal) objectData.getData("AVA_TITULOS"));
        result.setAvaPerVenTitulos((BigDecimal) objectData.getData("AVA_PER_VEN_TITULOS"));
        result.setAvaAnoAltaReg((BigDecimal) objectData.getData("AVA_ANO_ALTA_REG"));
        result.setAvaMesAltaReg((BigDecimal) objectData.getData("AVA_MES_ALTA_REG"));
        result.setAvaDiaAltaReg((BigDecimal) objectData.getData("AVA_DIA_ALTA_REG"));
        result.setAvaAnoUltMod((BigDecimal) objectData.getData("AVA_ANO_ULT_MOD"));
        result.setAvaMesUltMod((BigDecimal) objectData.getData("AVA_MES_ULT_MOD"));
        result.setAvaDiaUltMod((BigDecimal) objectData.getData("AVA_DIA_ULT_MOD"));
        result.setAvaCveStAvisauto((String) objectData.getData("AVA_CVE_ST_AVISAUTO"));

        return result;

    }

}
