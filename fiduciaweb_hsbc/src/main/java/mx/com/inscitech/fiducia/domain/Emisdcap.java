package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISDCAP_PK", columns = { "EDC_NUM_PROGRAMA", "EDC_NUM_EMISION", "EDC_NUM_SEC_AMORTIZACION" }, sequences = { "MANUAL" })
public class Emisdcap extends DomainObject {

    BigDecimal edcNumPrograma = null;
    BigDecimal edcNumEmision = null;
    BigDecimal edcNumSecAmortizacion = null;
    BigDecimal edcPjeAmortizacion = null;
    BigDecimal edcImpAmortizacion = null;
    BigDecimal edcAnoAmort = null;
    BigDecimal edcMesAmort = null;
    BigDecimal edcDiaAmort = null;
    BigDecimal edcAnoAltaReg = null;
    BigDecimal edcMesAltaReg = null;
    BigDecimal edcDiaAltaReg = null;
    BigDecimal edcAnoUltMod = null;
    BigDecimal edcMesUltMod = null;
    BigDecimal edcDiaUltMod = null;
    String edcCveStEmisdcap = null;

    public Emisdcap() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdcNumPrograma(BigDecimal edcNumPrograma) {
        this.edcNumPrograma = edcNumPrograma;
    }

    public BigDecimal getEdcNumPrograma() {
        return this.edcNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdcNumEmision(BigDecimal edcNumEmision) {
        this.edcNumEmision = edcNumEmision;
    }

    public BigDecimal getEdcNumEmision() {
        return this.edcNumEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdcNumSecAmortizacion(BigDecimal edcNumSecAmortizacion) {
        this.edcNumSecAmortizacion = edcNumSecAmortizacion;
    }

    public BigDecimal getEdcNumSecAmortizacion() {
        return this.edcNumSecAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEdcPjeAmortizacion(BigDecimal edcPjeAmortizacion) {
        this.edcPjeAmortizacion = edcPjeAmortizacion;
    }

    public BigDecimal getEdcPjeAmortizacion() {
        return this.edcPjeAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEdcImpAmortizacion(BigDecimal edcImpAmortizacion) {
        this.edcImpAmortizacion = edcImpAmortizacion;
    }

    public BigDecimal getEdcImpAmortizacion() {
        return this.edcImpAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdcAnoAmort(BigDecimal edcAnoAmort) {
        this.edcAnoAmort = edcAnoAmort;
    }

    public BigDecimal getEdcAnoAmort() {
        return this.edcAnoAmort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdcMesAmort(BigDecimal edcMesAmort) {
        this.edcMesAmort = edcMesAmort;
    }

    public BigDecimal getEdcMesAmort() {
        return this.edcMesAmort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdcDiaAmort(BigDecimal edcDiaAmort) {
        this.edcDiaAmort = edcDiaAmort;
    }

    public BigDecimal getEdcDiaAmort() {
        return this.edcDiaAmort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdcAnoAltaReg(BigDecimal edcAnoAltaReg) {
        this.edcAnoAltaReg = edcAnoAltaReg;
    }

    public BigDecimal getEdcAnoAltaReg() {
        return this.edcAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdcMesAltaReg(BigDecimal edcMesAltaReg) {
        this.edcMesAltaReg = edcMesAltaReg;
    }

    public BigDecimal getEdcMesAltaReg() {
        return this.edcMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdcDiaAltaReg(BigDecimal edcDiaAltaReg) {
        this.edcDiaAltaReg = edcDiaAltaReg;
    }

    public BigDecimal getEdcDiaAltaReg() {
        return this.edcDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdcAnoUltMod(BigDecimal edcAnoUltMod) {
        this.edcAnoUltMod = edcAnoUltMod;
    }

    public BigDecimal getEdcAnoUltMod() {
        return this.edcAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdcMesUltMod(BigDecimal edcMesUltMod) {
        this.edcMesUltMod = edcMesUltMod;
    }

    public BigDecimal getEdcMesUltMod() {
        return this.edcMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdcDiaUltMod(BigDecimal edcDiaUltMod) {
        this.edcDiaUltMod = edcDiaUltMod;
    }

    public BigDecimal getEdcDiaUltMod() {
        return this.edcDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdcCveStEmisdcap(String edcCveStEmisdcap) {
        this.edcCveStEmisdcap = edcCveStEmisdcap;
    }

    public String getEdcCveStEmisdcap() {
        return this.edcCveStEmisdcap;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISDCAP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdcNumPrograma() != null && this.getEdcNumPrograma().longValue() == -999) {
            conditions += " AND EDC_NUM_PROGRAMA IS NULL";
        } else if (this.getEdcNumPrograma() != null) {
            conditions += " AND EDC_NUM_PROGRAMA = ?";
            values.add(this.getEdcNumPrograma());
        }

        if (this.getEdcNumEmision() != null && this.getEdcNumEmision().longValue() == -999) {
            conditions += " AND EDC_NUM_EMISION IS NULL";
        } else if (this.getEdcNumEmision() != null) {
            conditions += " AND EDC_NUM_EMISION = ?";
            values.add(this.getEdcNumEmision());
        }

        if (this.getEdcNumSecAmortizacion() != null && this.getEdcNumSecAmortizacion().longValue() == -999) {
            conditions += " AND EDC_NUM_SEC_AMORTIZACION IS NULL";
        } else if (this.getEdcNumSecAmortizacion() != null) {
            conditions += " AND EDC_NUM_SEC_AMORTIZACION = ?";
            values.add(this.getEdcNumSecAmortizacion());
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
        String sql = "SELECT * FROM EMISDCAP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdcNumPrograma() != null && this.getEdcNumPrograma().longValue() == -999) {
            conditions += " AND EDC_NUM_PROGRAMA IS NULL";
        } else if (this.getEdcNumPrograma() != null) {
            conditions += " AND EDC_NUM_PROGRAMA = ?";
            values.add(this.getEdcNumPrograma());
        }

        if (this.getEdcNumEmision() != null && this.getEdcNumEmision().longValue() == -999) {
            conditions += " AND EDC_NUM_EMISION IS NULL";
        } else if (this.getEdcNumEmision() != null) {
            conditions += " AND EDC_NUM_EMISION = ?";
            values.add(this.getEdcNumEmision());
        }

        if (this.getEdcNumSecAmortizacion() != null && this.getEdcNumSecAmortizacion().longValue() == -999) {
            conditions += " AND EDC_NUM_SEC_AMORTIZACION IS NULL";
        } else if (this.getEdcNumSecAmortizacion() != null) {
            conditions += " AND EDC_NUM_SEC_AMORTIZACION = ?";
            values.add(this.getEdcNumSecAmortizacion());
        }

        if (this.getEdcPjeAmortizacion() != null && this.getEdcPjeAmortizacion().longValue() == -999) {
            conditions += " AND EDC_PJE_AMORTIZACION IS NULL";
        } else if (this.getEdcPjeAmortizacion() != null) {
            conditions += " AND EDC_PJE_AMORTIZACION = ?";
            values.add(this.getEdcPjeAmortizacion());
        }

        if (this.getEdcImpAmortizacion() != null && this.getEdcImpAmortizacion().longValue() == -999) {
            conditions += " AND EDC_IMP_AMORTIZACION IS NULL";
        } else if (this.getEdcImpAmortizacion() != null) {
            conditions += " AND EDC_IMP_AMORTIZACION = ?";
            values.add(this.getEdcImpAmortizacion());
        }

        if (this.getEdcAnoAmort() != null && this.getEdcAnoAmort().longValue() == -999) {
            conditions += " AND EDC_ANO_AMORT IS NULL";
        } else if (this.getEdcAnoAmort() != null) {
            conditions += " AND EDC_ANO_AMORT = ?";
            values.add(this.getEdcAnoAmort());
        }

        if (this.getEdcMesAmort() != null && this.getEdcMesAmort().longValue() == -999) {
            conditions += " AND EDC_MES_AMORT IS NULL";
        } else if (this.getEdcMesAmort() != null) {
            conditions += " AND EDC_MES_AMORT = ?";
            values.add(this.getEdcMesAmort());
        }

        if (this.getEdcDiaAmort() != null && this.getEdcDiaAmort().longValue() == -999) {
            conditions += " AND EDC_DIA_AMORT IS NULL";
        } else if (this.getEdcDiaAmort() != null) {
            conditions += " AND EDC_DIA_AMORT = ?";
            values.add(this.getEdcDiaAmort());
        }

        if (this.getEdcAnoAltaReg() != null && this.getEdcAnoAltaReg().longValue() == -999) {
            conditions += " AND EDC_ANO_ALTA_REG IS NULL";
        } else if (this.getEdcAnoAltaReg() != null) {
            conditions += " AND EDC_ANO_ALTA_REG = ?";
            values.add(this.getEdcAnoAltaReg());
        }

        if (this.getEdcMesAltaReg() != null && this.getEdcMesAltaReg().longValue() == -999) {
            conditions += " AND EDC_MES_ALTA_REG IS NULL";
        } else if (this.getEdcMesAltaReg() != null) {
            conditions += " AND EDC_MES_ALTA_REG = ?";
            values.add(this.getEdcMesAltaReg());
        }

        if (this.getEdcDiaAltaReg() != null && this.getEdcDiaAltaReg().longValue() == -999) {
            conditions += " AND EDC_DIA_ALTA_REG IS NULL";
        } else if (this.getEdcDiaAltaReg() != null) {
            conditions += " AND EDC_DIA_ALTA_REG = ?";
            values.add(this.getEdcDiaAltaReg());
        }

        if (this.getEdcAnoUltMod() != null && this.getEdcAnoUltMod().longValue() == -999) {
            conditions += " AND EDC_ANO_ULT_MOD IS NULL";
        } else if (this.getEdcAnoUltMod() != null) {
            conditions += " AND EDC_ANO_ULT_MOD = ?";
            values.add(this.getEdcAnoUltMod());
        }

        if (this.getEdcMesUltMod() != null && this.getEdcMesUltMod().longValue() == -999) {
            conditions += " AND EDC_MES_ULT_MOD IS NULL";
        } else if (this.getEdcMesUltMod() != null) {
            conditions += " AND EDC_MES_ULT_MOD = ?";
            values.add(this.getEdcMesUltMod());
        }

        if (this.getEdcDiaUltMod() != null && this.getEdcDiaUltMod().longValue() == -999) {
            conditions += " AND EDC_DIA_ULT_MOD IS NULL";
        } else if (this.getEdcDiaUltMod() != null) {
            conditions += " AND EDC_DIA_ULT_MOD = ?";
            values.add(this.getEdcDiaUltMod());
        }

        if (this.getEdcCveStEmisdcap() != null && "null".equals(this.getEdcCveStEmisdcap())) {
            conditions += " AND EDC_CVE_ST_EMISDCAP IS NULL";
        } else if (this.getEdcCveStEmisdcap() != null) {
            conditions += " AND EDC_CVE_ST_EMISDCAP = ?";
            values.add(this.getEdcCveStEmisdcap());
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
        String sql = "UPDATE EMISDCAP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EDC_NUM_PROGRAMA = ?";
        pkValues.add(this.getEdcNumPrograma());
        conditions += " AND EDC_NUM_EMISION = ?";
        pkValues.add(this.getEdcNumEmision());
        conditions += " AND EDC_NUM_SEC_AMORTIZACION = ?";
        pkValues.add(this.getEdcNumSecAmortizacion());
        fields += " EDC_PJE_AMORTIZACION = ?, ";
        values.add(this.getEdcPjeAmortizacion());
        fields += " EDC_IMP_AMORTIZACION = ?, ";
        values.add(this.getEdcImpAmortizacion());
        fields += " EDC_ANO_AMORT = ?, ";
        values.add(this.getEdcAnoAmort());
        fields += " EDC_MES_AMORT = ?, ";
        values.add(this.getEdcMesAmort());
        fields += " EDC_DIA_AMORT = ?, ";
        values.add(this.getEdcDiaAmort());
        fields += " EDC_ANO_ALTA_REG = ?, ";
        values.add(this.getEdcAnoAltaReg());
        fields += " EDC_MES_ALTA_REG = ?, ";
        values.add(this.getEdcMesAltaReg());
        fields += " EDC_DIA_ALTA_REG = ?, ";
        values.add(this.getEdcDiaAltaReg());
        fields += " EDC_ANO_ULT_MOD = ?, ";
        values.add(this.getEdcAnoUltMod());
        fields += " EDC_MES_ULT_MOD = ?, ";
        values.add(this.getEdcMesUltMod());
        fields += " EDC_DIA_ULT_MOD = ?, ";
        values.add(this.getEdcDiaUltMod());
        fields += " EDC_CVE_ST_EMISDCAP = ?, ";
        values.add(this.getEdcCveStEmisdcap());
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
        String sql = "INSERT INTO EMISDCAP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EDC_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEdcNumPrograma());

        fields += ", EDC_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEdcNumEmision());

        fields += ", EDC_NUM_SEC_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEdcNumSecAmortizacion());

        fields += ", EDC_PJE_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEdcPjeAmortizacion());

        fields += ", EDC_IMP_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEdcImpAmortizacion());

        fields += ", EDC_ANO_AMORT";
        fieldValues += ", ?";
        values.add(this.getEdcAnoAmort());

        fields += ", EDC_MES_AMORT";
        fieldValues += ", ?";
        values.add(this.getEdcMesAmort());

        fields += ", EDC_DIA_AMORT";
        fieldValues += ", ?";
        values.add(this.getEdcDiaAmort());

        fields += ", EDC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdcAnoAltaReg());

        fields += ", EDC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdcMesAltaReg());

        fields += ", EDC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEdcDiaAltaReg());

        fields += ", EDC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdcAnoUltMod());

        fields += ", EDC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdcMesUltMod());

        fields += ", EDC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEdcDiaUltMod());

        fields += ", EDC_CVE_ST_EMISDCAP";
        fieldValues += ", ?";
        values.add(this.getEdcCveStEmisdcap());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISDCAP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EDC_NUM_PROGRAMA = ?";
        values.add(this.getEdcNumPrograma());
        conditions += " AND EDC_NUM_EMISION = ?";
        values.add(this.getEdcNumEmision());
        conditions += " AND EDC_NUM_SEC_AMORTIZACION = ?";
        values.add(this.getEdcNumSecAmortizacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisdcap instance = (Emisdcap) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEdcNumPrograma().equals(instance.getEdcNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEdcNumEmision().equals(instance.getEdcNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEdcNumSecAmortizacion().equals(instance.getEdcNumSecAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEdcPjeAmortizacion().equals(instance.getEdcPjeAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEdcImpAmortizacion().equals(instance.getEdcImpAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEdcAnoAmort().equals(instance.getEdcAnoAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEdcMesAmort().equals(instance.getEdcMesAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEdcDiaAmort().equals(instance.getEdcDiaAmort()))
            equalObjects = false;
        if (equalObjects && !this.getEdcAnoAltaReg().equals(instance.getEdcAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdcMesAltaReg().equals(instance.getEdcMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdcDiaAltaReg().equals(instance.getEdcDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEdcAnoUltMod().equals(instance.getEdcAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdcMesUltMod().equals(instance.getEdcMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdcDiaUltMod().equals(instance.getEdcDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEdcCveStEmisdcap().equals(instance.getEdcCveStEmisdcap()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisdcap result = new Emisdcap();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEdcNumPrograma((BigDecimal) objectData.getData("EDC_NUM_PROGRAMA"));
        result.setEdcNumEmision((BigDecimal) objectData.getData("EDC_NUM_EMISION"));
        result.setEdcNumSecAmortizacion((BigDecimal) objectData.getData("EDC_NUM_SEC_AMORTIZACION"));
        result.setEdcPjeAmortizacion((BigDecimal) objectData.getData("EDC_PJE_AMORTIZACION"));
        result.setEdcImpAmortizacion((BigDecimal) objectData.getData("EDC_IMP_AMORTIZACION"));
        result.setEdcAnoAmort((BigDecimal) objectData.getData("EDC_ANO_AMORT"));
        result.setEdcMesAmort((BigDecimal) objectData.getData("EDC_MES_AMORT"));
        result.setEdcDiaAmort((BigDecimal) objectData.getData("EDC_DIA_AMORT"));
        result.setEdcAnoAltaReg((BigDecimal) objectData.getData("EDC_ANO_ALTA_REG"));
        result.setEdcMesAltaReg((BigDecimal) objectData.getData("EDC_MES_ALTA_REG"));
        result.setEdcDiaAltaReg((BigDecimal) objectData.getData("EDC_DIA_ALTA_REG"));
        result.setEdcAnoUltMod((BigDecimal) objectData.getData("EDC_ANO_ULT_MOD"));
        result.setEdcMesUltMod((BigDecimal) objectData.getData("EDC_MES_ULT_MOD"));
        result.setEdcDiaUltMod((BigDecimal) objectData.getData("EDC_DIA_ULT_MOD"));
        result.setEdcCveStEmisdcap((String) objectData.getData("EDC_CVE_ST_EMISDCAP"));

        return result;

    }

}
