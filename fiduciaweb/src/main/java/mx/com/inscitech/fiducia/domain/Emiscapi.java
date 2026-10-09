package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISCAPI_PK", columns = { "ECA_NUM_PROGRAMA", "ECA_NUM_EMISION" }, sequences = { "MANUAL" })
public class Emiscapi extends DomainObject {

    BigDecimal ecaNumPrograma = null;
    BigDecimal ecaNumEmision = null;
    BigDecimal ecaCapitalizacion = null;
    BigDecimal ecaPjeTasa = null;
    BigDecimal ecaImpCapitalizacion = null;
    String ecaCveAmortizacion = null;
    String ecaTipoAmortizacion = null;
    String ecaSerie = null;
    BigDecimal ecaAnoSerie = null;
    BigDecimal ecaMesSerie = null;
    BigDecimal ecaDiaSerie = null;
    BigDecimal ecaImpSerie = null;
    BigDecimal ecaAmortCon = null;
    BigDecimal ecaAnoAltaReg = null;
    BigDecimal ecaMesAltaReg = null;
    BigDecimal ecaDiaAltaReg = null;
    BigDecimal ecaAnoUltMod = null;
    BigDecimal ecaMesUltMod = null;
    BigDecimal ecaDiaUltMod = null;
    String ecaCveStEmiscapi = null;
    BigDecimal ecaAmortUlt = null;

    public Emiscapi() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcaNumPrograma(BigDecimal ecaNumPrograma) {
        this.ecaNumPrograma = ecaNumPrograma;
    }

    public BigDecimal getEcaNumPrograma() {
        return this.ecaNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcaNumEmision(BigDecimal ecaNumEmision) {
        this.ecaNumEmision = ecaNumEmision;
    }

    public BigDecimal getEcaNumEmision() {
        return this.ecaNumEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcaCapitalizacion(BigDecimal ecaCapitalizacion) {
        this.ecaCapitalizacion = ecaCapitalizacion;
    }

    public BigDecimal getEcaCapitalizacion() {
        return this.ecaCapitalizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 6, javaClass = BigDecimal.class)
    public void setEcaPjeTasa(BigDecimal ecaPjeTasa) {
        this.ecaPjeTasa = ecaPjeTasa;
    }

    public BigDecimal getEcaPjeTasa() {
        return this.ecaPjeTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEcaImpCapitalizacion(BigDecimal ecaImpCapitalizacion) {
        this.ecaImpCapitalizacion = ecaImpCapitalizacion;
    }

    public BigDecimal getEcaImpCapitalizacion() {
        return this.ecaImpCapitalizacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcaCveAmortizacion(String ecaCveAmortizacion) {
        this.ecaCveAmortizacion = ecaCveAmortizacion;
    }

    public String getEcaCveAmortizacion() {
        return this.ecaCveAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcaTipoAmortizacion(String ecaTipoAmortizacion) {
        this.ecaTipoAmortizacion = ecaTipoAmortizacion;
    }

    public String getEcaTipoAmortizacion() {
        return this.ecaTipoAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcaSerie(String ecaSerie) {
        this.ecaSerie = ecaSerie;
    }

    public String getEcaSerie() {
        return this.ecaSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEcaAnoSerie(BigDecimal ecaAnoSerie) {
        this.ecaAnoSerie = ecaAnoSerie;
    }

    public BigDecimal getEcaAnoSerie() {
        return this.ecaAnoSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEcaMesSerie(BigDecimal ecaMesSerie) {
        this.ecaMesSerie = ecaMesSerie;
    }

    public BigDecimal getEcaMesSerie() {
        return this.ecaMesSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEcaDiaSerie(BigDecimal ecaDiaSerie) {
        this.ecaDiaSerie = ecaDiaSerie;
    }

    public BigDecimal getEcaDiaSerie() {
        return this.ecaDiaSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEcaImpSerie(BigDecimal ecaImpSerie) {
        this.ecaImpSerie = ecaImpSerie;
    }

    public BigDecimal getEcaImpSerie() {
        return this.ecaImpSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setEcaAmortCon(BigDecimal ecaAmortCon) {
        this.ecaAmortCon = ecaAmortCon;
    }

    public BigDecimal getEcaAmortCon() {
        return this.ecaAmortCon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEcaAnoAltaReg(BigDecimal ecaAnoAltaReg) {
        this.ecaAnoAltaReg = ecaAnoAltaReg;
    }

    public BigDecimal getEcaAnoAltaReg() {
        return this.ecaAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEcaMesAltaReg(BigDecimal ecaMesAltaReg) {
        this.ecaMesAltaReg = ecaMesAltaReg;
    }

    public BigDecimal getEcaMesAltaReg() {
        return this.ecaMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEcaDiaAltaReg(BigDecimal ecaDiaAltaReg) {
        this.ecaDiaAltaReg = ecaDiaAltaReg;
    }

    public BigDecimal getEcaDiaAltaReg() {
        return this.ecaDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEcaAnoUltMod(BigDecimal ecaAnoUltMod) {
        this.ecaAnoUltMod = ecaAnoUltMod;
    }

    public BigDecimal getEcaAnoUltMod() {
        return this.ecaAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEcaMesUltMod(BigDecimal ecaMesUltMod) {
        this.ecaMesUltMod = ecaMesUltMod;
    }

    public BigDecimal getEcaMesUltMod() {
        return this.ecaMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEcaDiaUltMod(BigDecimal ecaDiaUltMod) {
        this.ecaDiaUltMod = ecaDiaUltMod;
    }

    public BigDecimal getEcaDiaUltMod() {
        return this.ecaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcaCveStEmiscapi(String ecaCveStEmiscapi) {
        this.ecaCveStEmiscapi = ecaCveStEmiscapi;
    }

    public String getEcaCveStEmiscapi() {
        return this.ecaCveStEmiscapi;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEcaAmortUlt(BigDecimal ecaAmortUlt) {
        this.ecaAmortUlt = ecaAmortUlt;
    }

    public BigDecimal getEcaAmortUlt() {
        return this.ecaAmortUlt;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISCAPI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcaNumPrograma() != null && this.getEcaNumPrograma().longValue() == -999) {
            conditions += " AND ECA_NUM_PROGRAMA IS NULL";
        } else if (this.getEcaNumPrograma() != null) {
            conditions += " AND ECA_NUM_PROGRAMA = ?";
            values.add(this.getEcaNumPrograma());
        }

        if (this.getEcaNumEmision() != null && this.getEcaNumEmision().longValue() == -999) {
            conditions += " AND ECA_NUM_EMISION IS NULL";
        } else if (this.getEcaNumEmision() != null) {
            conditions += " AND ECA_NUM_EMISION = ?";
            values.add(this.getEcaNumEmision());
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
        String sql = "SELECT * FROM EMISCAPI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcaNumPrograma() != null && this.getEcaNumPrograma().longValue() == -999) {
            conditions += " AND ECA_NUM_PROGRAMA IS NULL";
        } else if (this.getEcaNumPrograma() != null) {
            conditions += " AND ECA_NUM_PROGRAMA = ?";
            values.add(this.getEcaNumPrograma());
        }

        if (this.getEcaNumEmision() != null && this.getEcaNumEmision().longValue() == -999) {
            conditions += " AND ECA_NUM_EMISION IS NULL";
        } else if (this.getEcaNumEmision() != null) {
            conditions += " AND ECA_NUM_EMISION = ?";
            values.add(this.getEcaNumEmision());
        }

        if (this.getEcaCapitalizacion() != null && this.getEcaCapitalizacion().longValue() == -999) {
            conditions += " AND ECA_CAPITALIZACION IS NULL";
        } else if (this.getEcaCapitalizacion() != null) {
            conditions += " AND ECA_CAPITALIZACION = ?";
            values.add(this.getEcaCapitalizacion());
        }

        if (this.getEcaPjeTasa() != null && this.getEcaPjeTasa().longValue() == -999) {
            conditions += " AND ECA_PJE_TASA IS NULL";
        } else if (this.getEcaPjeTasa() != null) {
            conditions += " AND ECA_PJE_TASA = ?";
            values.add(this.getEcaPjeTasa());
        }

        if (this.getEcaImpCapitalizacion() != null && this.getEcaImpCapitalizacion().longValue() == -999) {
            conditions += " AND ECA_IMP_CAPITALIZACION IS NULL";
        } else if (this.getEcaImpCapitalizacion() != null) {
            conditions += " AND ECA_IMP_CAPITALIZACION = ?";
            values.add(this.getEcaImpCapitalizacion());
        }

        if (this.getEcaCveAmortizacion() != null && "null".equals(this.getEcaCveAmortizacion())) {
            conditions += " AND ECA_CVE_AMORTIZACION IS NULL";
        } else if (this.getEcaCveAmortizacion() != null) {
            conditions += " AND ECA_CVE_AMORTIZACION = ?";
            values.add(this.getEcaCveAmortizacion());
        }

        if (this.getEcaTipoAmortizacion() != null && "null".equals(this.getEcaTipoAmortizacion())) {
            conditions += " AND ECA_TIPO_AMORTIZACION IS NULL";
        } else if (this.getEcaTipoAmortizacion() != null) {
            conditions += " AND ECA_TIPO_AMORTIZACION = ?";
            values.add(this.getEcaTipoAmortizacion());
        }

        if (this.getEcaSerie() != null && "null".equals(this.getEcaSerie())) {
            conditions += " AND ECA_SERIE IS NULL";
        } else if (this.getEcaSerie() != null) {
            conditions += " AND ECA_SERIE = ?";
            values.add(this.getEcaSerie());
        }

        if (this.getEcaAnoSerie() != null && this.getEcaAnoSerie().longValue() == -999) {
            conditions += " AND ECA_ANO_SERIE IS NULL";
        } else if (this.getEcaAnoSerie() != null) {
            conditions += " AND ECA_ANO_SERIE = ?";
            values.add(this.getEcaAnoSerie());
        }

        if (this.getEcaMesSerie() != null && this.getEcaMesSerie().longValue() == -999) {
            conditions += " AND ECA_MES_SERIE IS NULL";
        } else if (this.getEcaMesSerie() != null) {
            conditions += " AND ECA_MES_SERIE = ?";
            values.add(this.getEcaMesSerie());
        }

        if (this.getEcaDiaSerie() != null && this.getEcaDiaSerie().longValue() == -999) {
            conditions += " AND ECA_DIA_SERIE IS NULL";
        } else if (this.getEcaDiaSerie() != null) {
            conditions += " AND ECA_DIA_SERIE = ?";
            values.add(this.getEcaDiaSerie());
        }

        if (this.getEcaImpSerie() != null && this.getEcaImpSerie().longValue() == -999) {
            conditions += " AND ECA_IMP_SERIE IS NULL";
        } else if (this.getEcaImpSerie() != null) {
            conditions += " AND ECA_IMP_SERIE = ?";
            values.add(this.getEcaImpSerie());
        }

        if (this.getEcaAmortCon() != null && this.getEcaAmortCon().longValue() == -999) {
            conditions += " AND ECA_AMORT_CON IS NULL";
        } else if (this.getEcaAmortCon() != null) {
            conditions += " AND ECA_AMORT_CON = ?";
            values.add(this.getEcaAmortCon());
        }

        if (this.getEcaAnoAltaReg() != null && this.getEcaAnoAltaReg().longValue() == -999) {
            conditions += " AND ECA_ANO_ALTA_REG IS NULL";
        } else if (this.getEcaAnoAltaReg() != null) {
            conditions += " AND ECA_ANO_ALTA_REG = ?";
            values.add(this.getEcaAnoAltaReg());
        }

        if (this.getEcaMesAltaReg() != null && this.getEcaMesAltaReg().longValue() == -999) {
            conditions += " AND ECA_MES_ALTA_REG IS NULL";
        } else if (this.getEcaMesAltaReg() != null) {
            conditions += " AND ECA_MES_ALTA_REG = ?";
            values.add(this.getEcaMesAltaReg());
        }

        if (this.getEcaDiaAltaReg() != null && this.getEcaDiaAltaReg().longValue() == -999) {
            conditions += " AND ECA_DIA_ALTA_REG IS NULL";
        } else if (this.getEcaDiaAltaReg() != null) {
            conditions += " AND ECA_DIA_ALTA_REG = ?";
            values.add(this.getEcaDiaAltaReg());
        }

        if (this.getEcaAnoUltMod() != null && this.getEcaAnoUltMod().longValue() == -999) {
            conditions += " AND ECA_ANO_ULT_MOD IS NULL";
        } else if (this.getEcaAnoUltMod() != null) {
            conditions += " AND ECA_ANO_ULT_MOD = ?";
            values.add(this.getEcaAnoUltMod());
        }

        if (this.getEcaMesUltMod() != null && this.getEcaMesUltMod().longValue() == -999) {
            conditions += " AND ECA_MES_ULT_MOD IS NULL";
        } else if (this.getEcaMesUltMod() != null) {
            conditions += " AND ECA_MES_ULT_MOD = ?";
            values.add(this.getEcaMesUltMod());
        }

        if (this.getEcaDiaUltMod() != null && this.getEcaDiaUltMod().longValue() == -999) {
            conditions += " AND ECA_DIA_ULT_MOD IS NULL";
        } else if (this.getEcaDiaUltMod() != null) {
            conditions += " AND ECA_DIA_ULT_MOD = ?";
            values.add(this.getEcaDiaUltMod());
        }

        if (this.getEcaCveStEmiscapi() != null && "null".equals(this.getEcaCveStEmiscapi())) {
            conditions += " AND ECA_CVE_ST_EMISCAPI IS NULL";
        } else if (this.getEcaCveStEmiscapi() != null) {
            conditions += " AND ECA_CVE_ST_EMISCAPI = ?";
            values.add(this.getEcaCveStEmiscapi());
        }

        if (this.getEcaAmortUlt() != null && this.getEcaAmortUlt().longValue() == -999) {
            conditions += " AND ECA_AMORT_ULT IS NULL";
        } else if (this.getEcaAmortUlt() != null) {
            conditions += " AND ECA_AMORT_ULT = ?";
            values.add(this.getEcaAmortUlt());
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
        String sql = "UPDATE EMISCAPI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ECA_NUM_PROGRAMA = ?";
        pkValues.add(this.getEcaNumPrograma());
        conditions += " AND ECA_NUM_EMISION = ?";
        pkValues.add(this.getEcaNumEmision());
        fields += " ECA_CAPITALIZACION = ?, ";
        values.add(this.getEcaCapitalizacion());
        fields += " ECA_PJE_TASA = ?, ";
        values.add(this.getEcaPjeTasa());
        fields += " ECA_IMP_CAPITALIZACION = ?, ";
        values.add(this.getEcaImpCapitalizacion());
        fields += " ECA_CVE_AMORTIZACION = ?, ";
        values.add(this.getEcaCveAmortizacion());
        fields += " ECA_TIPO_AMORTIZACION = ?, ";
        values.add(this.getEcaTipoAmortizacion());
        fields += " ECA_SERIE = ?, ";
        values.add(this.getEcaSerie());
        fields += " ECA_ANO_SERIE = ?, ";
        values.add(this.getEcaAnoSerie());
        fields += " ECA_MES_SERIE = ?, ";
        values.add(this.getEcaMesSerie());
        fields += " ECA_DIA_SERIE = ?, ";
        values.add(this.getEcaDiaSerie());
        fields += " ECA_IMP_SERIE = ?, ";
        values.add(this.getEcaImpSerie());
        fields += " ECA_AMORT_CON = ?, ";
        values.add(this.getEcaAmortCon());
        fields += " ECA_ANO_ALTA_REG = ?, ";
        values.add(this.getEcaAnoAltaReg());
        fields += " ECA_MES_ALTA_REG = ?, ";
        values.add(this.getEcaMesAltaReg());
        fields += " ECA_DIA_ALTA_REG = ?, ";
        values.add(this.getEcaDiaAltaReg());
        fields += " ECA_ANO_ULT_MOD = ?, ";
        values.add(this.getEcaAnoUltMod());
        fields += " ECA_MES_ULT_MOD = ?, ";
        values.add(this.getEcaMesUltMod());
        fields += " ECA_DIA_ULT_MOD = ?, ";
        values.add(this.getEcaDiaUltMod());
        fields += " ECA_CVE_ST_EMISCAPI = ?, ";
        values.add(this.getEcaCveStEmiscapi());
        fields += " ECA_AMORT_ULT = ?, ";
        values.add(this.getEcaAmortUlt());
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
        String sql = "INSERT INTO EMISCAPI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ECA_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEcaNumPrograma());

        fields += ", ECA_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEcaNumEmision());

        fields += ", ECA_CAPITALIZACION";
        fieldValues += ", ?";
        values.add(this.getEcaCapitalizacion());

        fields += ", ECA_PJE_TASA";
        fieldValues += ", ?";
        values.add(this.getEcaPjeTasa());

        fields += ", ECA_IMP_CAPITALIZACION";
        fieldValues += ", ?";
        values.add(this.getEcaImpCapitalizacion());

        fields += ", ECA_CVE_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEcaCveAmortizacion());

        fields += ", ECA_TIPO_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEcaTipoAmortizacion());

        fields += ", ECA_SERIE";
        fieldValues += ", ?";
        values.add(this.getEcaSerie());

        fields += ", ECA_ANO_SERIE";
        fieldValues += ", ?";
        values.add(this.getEcaAnoSerie());

        fields += ", ECA_MES_SERIE";
        fieldValues += ", ?";
        values.add(this.getEcaMesSerie());

        fields += ", ECA_DIA_SERIE";
        fieldValues += ", ?";
        values.add(this.getEcaDiaSerie());

        fields += ", ECA_IMP_SERIE";
        fieldValues += ", ?";
        values.add(this.getEcaImpSerie());

        fields += ", ECA_AMORT_CON";
        fieldValues += ", ?";
        values.add(this.getEcaAmortCon());

        fields += ", ECA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEcaAnoAltaReg());

        fields += ", ECA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEcaMesAltaReg());

        fields += ", ECA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEcaDiaAltaReg());

        fields += ", ECA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEcaAnoUltMod());

        fields += ", ECA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEcaMesUltMod());

        fields += ", ECA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEcaDiaUltMod());

        fields += ", ECA_CVE_ST_EMISCAPI";
        fieldValues += ", ?";
        values.add(this.getEcaCveStEmiscapi());

        fields += ", ECA_AMORT_ULT";
        fieldValues += ", ?";
        values.add(this.getEcaAmortUlt());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISCAPI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ECA_NUM_PROGRAMA = ?";
        values.add(this.getEcaNumPrograma());
        conditions += " AND ECA_NUM_EMISION = ?";
        values.add(this.getEcaNumEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emiscapi instance = (Emiscapi) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEcaNumPrograma().equals(instance.getEcaNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEcaNumEmision().equals(instance.getEcaNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEcaCapitalizacion().equals(instance.getEcaCapitalizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEcaPjeTasa().equals(instance.getEcaPjeTasa()))
            equalObjects = false;
        if (equalObjects && !this.getEcaImpCapitalizacion().equals(instance.getEcaImpCapitalizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEcaCveAmortizacion().equals(instance.getEcaCveAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEcaTipoAmortizacion().equals(instance.getEcaTipoAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEcaSerie().equals(instance.getEcaSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEcaAnoSerie().equals(instance.getEcaAnoSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEcaMesSerie().equals(instance.getEcaMesSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEcaDiaSerie().equals(instance.getEcaDiaSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEcaImpSerie().equals(instance.getEcaImpSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEcaAmortCon().equals(instance.getEcaAmortCon()))
            equalObjects = false;
        if (equalObjects && !this.getEcaAnoAltaReg().equals(instance.getEcaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEcaMesAltaReg().equals(instance.getEcaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEcaDiaAltaReg().equals(instance.getEcaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEcaAnoUltMod().equals(instance.getEcaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEcaMesUltMod().equals(instance.getEcaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEcaDiaUltMod().equals(instance.getEcaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEcaCveStEmiscapi().equals(instance.getEcaCveStEmiscapi()))
            equalObjects = false;
        if (equalObjects && !this.getEcaAmortUlt().equals(instance.getEcaAmortUlt()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emiscapi result = new Emiscapi();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEcaNumPrograma((BigDecimal) objectData.getData("ECA_NUM_PROGRAMA"));
        result.setEcaNumEmision((BigDecimal) objectData.getData("ECA_NUM_EMISION"));
        result.setEcaCapitalizacion((BigDecimal) objectData.getData("ECA_CAPITALIZACION"));
        result.setEcaPjeTasa((BigDecimal) objectData.getData("ECA_PJE_TASA"));
        result.setEcaImpCapitalizacion((BigDecimal) objectData.getData("ECA_IMP_CAPITALIZACION"));
        result.setEcaCveAmortizacion((String) objectData.getData("ECA_CVE_AMORTIZACION"));
        result.setEcaTipoAmortizacion((String) objectData.getData("ECA_TIPO_AMORTIZACION"));
        result.setEcaSerie((String) objectData.getData("ECA_SERIE"));
        result.setEcaAnoSerie((BigDecimal) objectData.getData("ECA_ANO_SERIE"));
        result.setEcaMesSerie((BigDecimal) objectData.getData("ECA_MES_SERIE"));
        result.setEcaDiaSerie((BigDecimal) objectData.getData("ECA_DIA_SERIE"));
        result.setEcaImpSerie((BigDecimal) objectData.getData("ECA_IMP_SERIE"));
        result.setEcaAmortCon((BigDecimal) objectData.getData("ECA_AMORT_CON"));
        result.setEcaAnoAltaReg((BigDecimal) objectData.getData("ECA_ANO_ALTA_REG"));
        result.setEcaMesAltaReg((BigDecimal) objectData.getData("ECA_MES_ALTA_REG"));
        result.setEcaDiaAltaReg((BigDecimal) objectData.getData("ECA_DIA_ALTA_REG"));
        result.setEcaAnoUltMod((BigDecimal) objectData.getData("ECA_ANO_ULT_MOD"));
        result.setEcaMesUltMod((BigDecimal) objectData.getData("ECA_MES_ULT_MOD"));
        result.setEcaDiaUltMod((BigDecimal) objectData.getData("ECA_DIA_ULT_MOD"));
        result.setEcaCveStEmiscapi((String) objectData.getData("ECA_CVE_ST_EMISCAPI"));
        result.setEcaAmortUlt((BigDecimal) objectData.getData("ECA_AMORT_ULT"));

        return result;

    }

}
