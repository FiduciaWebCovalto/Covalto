package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "MINUTAS_PK", columns = { "MIN_NUM_CONTRATO", "MIN_NUM_SUBCOMITE", "MIN_NUM_REUNION" }, sequences = { "MANUAL" })
public class Minutas extends DomainObject {

    BigDecimal minNumContrato = null;
    BigDecimal minNumSubcomite = null;
    BigDecimal minNumReunion = null;
    String minDescMinuta = null;
    BigDecimal minAnoAltaReg = null;
    BigDecimal minMesAltaReg = null;
    BigDecimal minDiaAltaReg = null;
    BigDecimal minAnoUltMod = null;
    BigDecimal minMesUltMod = null;
    BigDecimal minDiaUltMod = null;
    String minCveStMinutas = null;

    public Minutas() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMinNumContrato(BigDecimal minNumContrato) {
        this.minNumContrato = minNumContrato;
    }

    public BigDecimal getMinNumContrato() {
        return this.minNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMinNumSubcomite(BigDecimal minNumSubcomite) {
        this.minNumSubcomite = minNumSubcomite;
    }

    public BigDecimal getMinNumSubcomite() {
        return this.minNumSubcomite;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMinNumReunion(BigDecimal minNumReunion) {
        this.minNumReunion = minNumReunion;
    }

    public BigDecimal getMinNumReunion() {
        return this.minNumReunion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMinDescMinuta(String minDescMinuta) {
        this.minDescMinuta = minDescMinuta;
    }

    public String getMinDescMinuta() {
        return this.minDescMinuta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMinAnoAltaReg(BigDecimal minAnoAltaReg) {
        this.minAnoAltaReg = minAnoAltaReg;
    }

    public BigDecimal getMinAnoAltaReg() {
        return this.minAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMinMesAltaReg(BigDecimal minMesAltaReg) {
        this.minMesAltaReg = minMesAltaReg;
    }

    public BigDecimal getMinMesAltaReg() {
        return this.minMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMinDiaAltaReg(BigDecimal minDiaAltaReg) {
        this.minDiaAltaReg = minDiaAltaReg;
    }

    public BigDecimal getMinDiaAltaReg() {
        return this.minDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setMinAnoUltMod(BigDecimal minAnoUltMod) {
        this.minAnoUltMod = minAnoUltMod;
    }

    public BigDecimal getMinAnoUltMod() {
        return this.minAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMinMesUltMod(BigDecimal minMesUltMod) {
        this.minMesUltMod = minMesUltMod;
    }

    public BigDecimal getMinMesUltMod() {
        return this.minMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setMinDiaUltMod(BigDecimal minDiaUltMod) {
        this.minDiaUltMod = minDiaUltMod;
    }

    public BigDecimal getMinDiaUltMod() {
        return this.minDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMinCveStMinutas(String minCveStMinutas) {
        this.minCveStMinutas = minCveStMinutas;
    }

    public String getMinCveStMinutas() {
        return this.minCveStMinutas;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM MINUTAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMinNumContrato() != null && this.getMinNumContrato().longValue() == -999) {
            conditions += " AND MIN_NUM_CONTRATO IS NULL";
        } else if (this.getMinNumContrato() != null) {
            conditions += " AND MIN_NUM_CONTRATO = ?";
            values.add(this.getMinNumContrato());
        }

        if (this.getMinNumSubcomite() != null && this.getMinNumSubcomite().longValue() == -999) {
            conditions += " AND MIN_NUM_SUBCOMITE IS NULL";
        } else if (this.getMinNumSubcomite() != null) {
            conditions += " AND MIN_NUM_SUBCOMITE = ?";
            values.add(this.getMinNumSubcomite());
        }

        if (this.getMinNumReunion() != null && this.getMinNumReunion().longValue() == -999) {
            conditions += " AND MIN_NUM_REUNION IS NULL";
        } else if (this.getMinNumReunion() != null) {
            conditions += " AND MIN_NUM_REUNION = ?";
            values.add(this.getMinNumReunion());
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
        String sql = "SELECT * FROM MINUTAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMinNumContrato() != null && this.getMinNumContrato().longValue() == -999) {
            conditions += " AND MIN_NUM_CONTRATO IS NULL";
        } else if (this.getMinNumContrato() != null) {
            conditions += " AND MIN_NUM_CONTRATO = ?";
            values.add(this.getMinNumContrato());
        }

        if (this.getMinNumSubcomite() != null && this.getMinNumSubcomite().longValue() == -999) {
            conditions += " AND MIN_NUM_SUBCOMITE IS NULL";
        } else if (this.getMinNumSubcomite() != null) {
            conditions += " AND MIN_NUM_SUBCOMITE = ?";
            values.add(this.getMinNumSubcomite());
        }

        if (this.getMinNumReunion() != null && this.getMinNumReunion().longValue() == -999) {
            conditions += " AND MIN_NUM_REUNION IS NULL";
        } else if (this.getMinNumReunion() != null) {
            conditions += " AND MIN_NUM_REUNION = ?";
            values.add(this.getMinNumReunion());
        }

        if (this.getMinDescMinuta() != null && "null".equals(this.getMinDescMinuta())) {
            conditions += " AND MIN_DESC_MINUTA IS NULL";
        } else if (this.getMinDescMinuta() != null) {
            conditions += " AND MIN_DESC_MINUTA = ?";
            values.add(this.getMinDescMinuta());
        }

        if (this.getMinAnoAltaReg() != null && this.getMinAnoAltaReg().longValue() == -999) {
            conditions += " AND MIN_ANO_ALTA_REG IS NULL";
        } else if (this.getMinAnoAltaReg() != null) {
            conditions += " AND MIN_ANO_ALTA_REG = ?";
            values.add(this.getMinAnoAltaReg());
        }

        if (this.getMinMesAltaReg() != null && this.getMinMesAltaReg().longValue() == -999) {
            conditions += " AND MIN_MES_ALTA_REG IS NULL";
        } else if (this.getMinMesAltaReg() != null) {
            conditions += " AND MIN_MES_ALTA_REG = ?";
            values.add(this.getMinMesAltaReg());
        }

        if (this.getMinDiaAltaReg() != null && this.getMinDiaAltaReg().longValue() == -999) {
            conditions += " AND MIN_DIA_ALTA_REG IS NULL";
        } else if (this.getMinDiaAltaReg() != null) {
            conditions += " AND MIN_DIA_ALTA_REG = ?";
            values.add(this.getMinDiaAltaReg());
        }

        if (this.getMinAnoUltMod() != null && this.getMinAnoUltMod().longValue() == -999) {
            conditions += " AND MIN_ANO_ULT_MOD IS NULL";
        } else if (this.getMinAnoUltMod() != null) {
            conditions += " AND MIN_ANO_ULT_MOD = ?";
            values.add(this.getMinAnoUltMod());
        }

        if (this.getMinMesUltMod() != null && this.getMinMesUltMod().longValue() == -999) {
            conditions += " AND MIN_MES_ULT_MOD IS NULL";
        } else if (this.getMinMesUltMod() != null) {
            conditions += " AND MIN_MES_ULT_MOD = ?";
            values.add(this.getMinMesUltMod());
        }

        if (this.getMinDiaUltMod() != null && this.getMinDiaUltMod().longValue() == -999) {
            conditions += " AND MIN_DIA_ULT_MOD IS NULL";
        } else if (this.getMinDiaUltMod() != null) {
            conditions += " AND MIN_DIA_ULT_MOD = ?";
            values.add(this.getMinDiaUltMod());
        }

        if (this.getMinCveStMinutas() != null && "null".equals(this.getMinCveStMinutas())) {
            conditions += " AND MIN_CVE_ST_MINUTAS IS NULL";
        } else if (this.getMinCveStMinutas() != null) {
            conditions += " AND MIN_CVE_ST_MINUTAS = ?";
            values.add(this.getMinCveStMinutas());
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
        String sql = "UPDATE MINUTAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND MIN_NUM_CONTRATO = ?";
        pkValues.add(this.getMinNumContrato());
        conditions += " AND MIN_NUM_SUBCOMITE = ?";
        pkValues.add(this.getMinNumSubcomite());
        conditions += " AND MIN_NUM_REUNION = ?";
        pkValues.add(this.getMinNumReunion());
        fields += " MIN_DESC_MINUTA = ?, ";
        values.add(this.getMinDescMinuta());
        fields += " MIN_ANO_ALTA_REG = ?, ";
        values.add(this.getMinAnoAltaReg());
        fields += " MIN_MES_ALTA_REG = ?, ";
        values.add(this.getMinMesAltaReg());
        fields += " MIN_DIA_ALTA_REG = ?, ";
        values.add(this.getMinDiaAltaReg());
        fields += " MIN_ANO_ULT_MOD = ?, ";
        values.add(this.getMinAnoUltMod());
        fields += " MIN_MES_ULT_MOD = ?, ";
        values.add(this.getMinMesUltMod());
        fields += " MIN_DIA_ULT_MOD = ?, ";
        values.add(this.getMinDiaUltMod());
        fields += " MIN_CVE_ST_MINUTAS = ?, ";
        values.add(this.getMinCveStMinutas());
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
        String sql = "INSERT INTO MINUTAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", MIN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getMinNumContrato());

        fields += ", MIN_NUM_SUBCOMITE";
        fieldValues += ", ?";
        values.add(this.getMinNumSubcomite());

        fields += ", MIN_NUM_REUNION";
        fieldValues += ", ?";
        values.add(this.getMinNumReunion());

        fields += ", MIN_DESC_MINUTA";
        fieldValues += ", ?";
        values.add(this.getMinDescMinuta());

        fields += ", MIN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMinAnoAltaReg());

        fields += ", MIN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMinMesAltaReg());

        fields += ", MIN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getMinDiaAltaReg());

        fields += ", MIN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMinAnoUltMod());

        fields += ", MIN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMinMesUltMod());

        fields += ", MIN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getMinDiaUltMod());

        fields += ", MIN_CVE_ST_MINUTAS";
        fieldValues += ", ?";
        values.add(this.getMinCveStMinutas());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM MINUTAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND MIN_NUM_CONTRATO = ?";
        values.add(this.getMinNumContrato());
        conditions += " AND MIN_NUM_SUBCOMITE = ?";
        values.add(this.getMinNumSubcomite());
        conditions += " AND MIN_NUM_REUNION = ?";
        values.add(this.getMinNumReunion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Minutas instance = (Minutas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getMinNumContrato().equals(instance.getMinNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getMinNumSubcomite().equals(instance.getMinNumSubcomite()))
            equalObjects = false;
        if (equalObjects && !this.getMinNumReunion().equals(instance.getMinNumReunion()))
            equalObjects = false;
        if (equalObjects && !this.getMinDescMinuta().equals(instance.getMinDescMinuta()))
            equalObjects = false;
        if (equalObjects && !this.getMinAnoAltaReg().equals(instance.getMinAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMinMesAltaReg().equals(instance.getMinMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMinDiaAltaReg().equals(instance.getMinDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getMinAnoUltMod().equals(instance.getMinAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMinMesUltMod().equals(instance.getMinMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMinDiaUltMod().equals(instance.getMinDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getMinCveStMinutas().equals(instance.getMinCveStMinutas()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Minutas result = new Minutas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setMinNumContrato((BigDecimal) objectData.getData("MIN_NUM_CONTRATO"));
        result.setMinNumSubcomite((BigDecimal) objectData.getData("MIN_NUM_SUBCOMITE"));
        result.setMinNumReunion((BigDecimal) objectData.getData("MIN_NUM_REUNION"));
        result.setMinDescMinuta((String) objectData.getData("MIN_DESC_MINUTA"));
        result.setMinAnoAltaReg((BigDecimal) objectData.getData("MIN_ANO_ALTA_REG"));
        result.setMinMesAltaReg((BigDecimal) objectData.getData("MIN_MES_ALTA_REG"));
        result.setMinDiaAltaReg((BigDecimal) objectData.getData("MIN_DIA_ALTA_REG"));
        result.setMinAnoUltMod((BigDecimal) objectData.getData("MIN_ANO_ULT_MOD"));
        result.setMinMesUltMod((BigDecimal) objectData.getData("MIN_MES_ULT_MOD"));
        result.setMinDiaUltMod((BigDecimal) objectData.getData("MIN_DIA_ULT_MOD"));
        result.setMinCveStMinutas((String) objectData.getData("MIN_CVE_ST_MINUTAS"));

        return result;

    }

}
