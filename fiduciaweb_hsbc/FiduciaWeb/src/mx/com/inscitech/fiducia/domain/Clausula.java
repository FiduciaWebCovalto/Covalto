package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CLAUSULA_PK", columns = { "CLA_NUM_CLAUSULA", "CLA_CVE_TIPO_CLAU" }, sequences = { "MANUAL" })
public class Clausula extends DomainObject {

    BigDecimal claNumClausula = null;
    String claCveTipoClau = null;
    String claNomClausula = null;
    Long claDescClausula = null;
    BigDecimal claCveModifi = null;
    BigDecimal claAnoElabora = null;
    BigDecimal claMesElabora = null;
    BigDecimal claDiaElabora = null;
    BigDecimal claAnoAltaReg = null;
    BigDecimal claMesAltaReg = null;
    BigDecimal claDiaAltaReg = null;
    BigDecimal claAnoUltMod = null;
    BigDecimal claMesUltMod = null;
    BigDecimal claDiaUltMod = null;
    String claCveStClausul = null;

    public Clausula() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 38, scale = 0, javaClass = BigDecimal.class)
    public void setClaNumClausula(BigDecimal claNumClausula) {
        this.claNumClausula = claNumClausula;
    }

    public BigDecimal getClaNumClausula() {
        return this.claNumClausula;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setClaCveTipoClau(String claCveTipoClau) {
        this.claCveTipoClau = claCveTipoClau;
    }

    public String getClaCveTipoClau() {
        return this.claCveTipoClau;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setClaNomClausula(String claNomClausula) {
        this.claNomClausula = claNomClausula;
    }

    public String getClaNomClausula() {
        return this.claNomClausula;
    }

    @FieldInfo(nullable = false, dataType = "LONG", javaClass = Long.class)
    public void setClaDescClausula(Long claDescClausula) {
        this.claDescClausula = claDescClausula;
    }

    public Long getClaDescClausula() {
        return this.claDescClausula;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setClaCveModifi(BigDecimal claCveModifi) {
        this.claCveModifi = claCveModifi;
    }

    public BigDecimal getClaCveModifi() {
        return this.claCveModifi;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setClaAnoElabora(BigDecimal claAnoElabora) {
        this.claAnoElabora = claAnoElabora;
    }

    public BigDecimal getClaAnoElabora() {
        return this.claAnoElabora;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setClaMesElabora(BigDecimal claMesElabora) {
        this.claMesElabora = claMesElabora;
    }

    public BigDecimal getClaMesElabora() {
        return this.claMesElabora;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setClaDiaElabora(BigDecimal claDiaElabora) {
        this.claDiaElabora = claDiaElabora;
    }

    public BigDecimal getClaDiaElabora() {
        return this.claDiaElabora;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setClaAnoAltaReg(BigDecimal claAnoAltaReg) {
        this.claAnoAltaReg = claAnoAltaReg;
    }

    public BigDecimal getClaAnoAltaReg() {
        return this.claAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setClaMesAltaReg(BigDecimal claMesAltaReg) {
        this.claMesAltaReg = claMesAltaReg;
    }

    public BigDecimal getClaMesAltaReg() {
        return this.claMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setClaDiaAltaReg(BigDecimal claDiaAltaReg) {
        this.claDiaAltaReg = claDiaAltaReg;
    }

    public BigDecimal getClaDiaAltaReg() {
        return this.claDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setClaAnoUltMod(BigDecimal claAnoUltMod) {
        this.claAnoUltMod = claAnoUltMod;
    }

    public BigDecimal getClaAnoUltMod() {
        return this.claAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setClaMesUltMod(BigDecimal claMesUltMod) {
        this.claMesUltMod = claMesUltMod;
    }

    public BigDecimal getClaMesUltMod() {
        return this.claMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setClaDiaUltMod(BigDecimal claDiaUltMod) {
        this.claDiaUltMod = claDiaUltMod;
    }

    public BigDecimal getClaDiaUltMod() {
        return this.claDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setClaCveStClausul(String claCveStClausul) {
        this.claCveStClausul = claCveStClausul;
    }

    public String getClaCveStClausul() {
        return this.claCveStClausul;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CLAUSULA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getClaNumClausula() != null && this.getClaNumClausula().longValue() == -999) {
            conditions += " AND CLA_NUM_CLAUSULA IS NULL";
        } else if (this.getClaNumClausula() != null) {
            conditions += " AND CLA_NUM_CLAUSULA = ?";
            values.add(this.getClaNumClausula());
        }

        if (this.getClaCveTipoClau() != null && "null".equals(this.getClaCveTipoClau())) {
            conditions += " AND CLA_CVE_TIPO_CLAU IS NULL";
        } else if (this.getClaCveTipoClau() != null) {
            conditions += " AND CLA_CVE_TIPO_CLAU = ?";
            values.add(this.getClaCveTipoClau());
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
        String sql = "SELECT * FROM CLAUSULA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getClaNumClausula() != null && this.getClaNumClausula().longValue() == -999) {
            conditions += " AND CLA_NUM_CLAUSULA IS NULL";
        } else if (this.getClaNumClausula() != null) {
            conditions += " AND CLA_NUM_CLAUSULA = ?";
            values.add(this.getClaNumClausula());
        }

        if (this.getClaCveTipoClau() != null && "null".equals(this.getClaCveTipoClau())) {
            conditions += " AND CLA_CVE_TIPO_CLAU IS NULL";
        } else if (this.getClaCveTipoClau() != null) {
            conditions += " AND CLA_CVE_TIPO_CLAU = ?";
            values.add(this.getClaCveTipoClau());
        }

        if (this.getClaNomClausula() != null && "null".equals(this.getClaNomClausula())) {
            conditions += " AND CLA_NOM_CLAUSULA IS NULL";
        } else if (this.getClaNomClausula() != null) {
            conditions += " AND CLA_NOM_CLAUSULA = ?";
            values.add(this.getClaNomClausula());
        }

        if (this.getClaDescClausula() != null && this.getClaDescClausula() == -999) {
            conditions += " AND CLA_DESC_CLAUSULA IS NULL";
        } else if (this.getClaDescClausula() != null) {
            conditions += " AND CLA_DESC_CLAUSULA = ?";
            values.add(this.getClaDescClausula());
        }

        if (this.getClaCveModifi() != null && this.getClaCveModifi().longValue() == -999) {
            conditions += " AND CLA_CVE_MODIFI IS NULL";
        } else if (this.getClaCveModifi() != null) {
            conditions += " AND CLA_CVE_MODIFI = ?";
            values.add(this.getClaCveModifi());
        }

        if (this.getClaAnoElabora() != null && this.getClaAnoElabora().longValue() == -999) {
            conditions += " AND CLA_ANO_ELABORA IS NULL";
        } else if (this.getClaAnoElabora() != null) {
            conditions += " AND CLA_ANO_ELABORA = ?";
            values.add(this.getClaAnoElabora());
        }

        if (this.getClaMesElabora() != null && this.getClaMesElabora().longValue() == -999) {
            conditions += " AND CLA_MES_ELABORA IS NULL";
        } else if (this.getClaMesElabora() != null) {
            conditions += " AND CLA_MES_ELABORA = ?";
            values.add(this.getClaMesElabora());
        }

        if (this.getClaDiaElabora() != null && this.getClaDiaElabora().longValue() == -999) {
            conditions += " AND CLA_DIA_ELABORA IS NULL";
        } else if (this.getClaDiaElabora() != null) {
            conditions += " AND CLA_DIA_ELABORA = ?";
            values.add(this.getClaDiaElabora());
        }

        if (this.getClaAnoAltaReg() != null && this.getClaAnoAltaReg().longValue() == -999) {
            conditions += " AND CLA_ANO_ALTA_REG IS NULL";
        } else if (this.getClaAnoAltaReg() != null) {
            conditions += " AND CLA_ANO_ALTA_REG = ?";
            values.add(this.getClaAnoAltaReg());
        }

        if (this.getClaMesAltaReg() != null && this.getClaMesAltaReg().longValue() == -999) {
            conditions += " AND CLA_MES_ALTA_REG IS NULL";
        } else if (this.getClaMesAltaReg() != null) {
            conditions += " AND CLA_MES_ALTA_REG = ?";
            values.add(this.getClaMesAltaReg());
        }

        if (this.getClaDiaAltaReg() != null && this.getClaDiaAltaReg().longValue() == -999) {
            conditions += " AND CLA_DIA_ALTA_REG IS NULL";
        } else if (this.getClaDiaAltaReg() != null) {
            conditions += " AND CLA_DIA_ALTA_REG = ?";
            values.add(this.getClaDiaAltaReg());
        }

        if (this.getClaAnoUltMod() != null && this.getClaAnoUltMod().longValue() == -999) {
            conditions += " AND CLA_ANO_ULT_MOD IS NULL";
        } else if (this.getClaAnoUltMod() != null) {
            conditions += " AND CLA_ANO_ULT_MOD = ?";
            values.add(this.getClaAnoUltMod());
        }

        if (this.getClaMesUltMod() != null && this.getClaMesUltMod().longValue() == -999) {
            conditions += " AND CLA_MES_ULT_MOD IS NULL";
        } else if (this.getClaMesUltMod() != null) {
            conditions += " AND CLA_MES_ULT_MOD = ?";
            values.add(this.getClaMesUltMod());
        }

        if (this.getClaDiaUltMod() != null && this.getClaDiaUltMod().longValue() == -999) {
            conditions += " AND CLA_DIA_ULT_MOD IS NULL";
        } else if (this.getClaDiaUltMod() != null) {
            conditions += " AND CLA_DIA_ULT_MOD = ?";
            values.add(this.getClaDiaUltMod());
        }

        if (this.getClaCveStClausul() != null && "null".equals(this.getClaCveStClausul())) {
            conditions += " AND CLA_CVE_ST_CLAUSUL IS NULL";
        } else if (this.getClaCveStClausul() != null) {
            conditions += " AND CLA_CVE_ST_CLAUSUL = ?";
            values.add(this.getClaCveStClausul());
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
        String sql = "UPDATE CLAUSULA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CLA_NUM_CLAUSULA = ?";
        pkValues.add(this.getClaNumClausula());
        conditions += " AND CLA_CVE_TIPO_CLAU = ?";
        pkValues.add(this.getClaCveTipoClau());
        fields += " CLA_NOM_CLAUSULA = ?, ";
        values.add(this.getClaNomClausula());
        fields += " CLA_DESC_CLAUSULA = ?, ";
        values.add(this.getClaDescClausula());
        fields += " CLA_CVE_MODIFI = ?, ";
        values.add(this.getClaCveModifi());
        fields += " CLA_ANO_ELABORA = ?, ";
        values.add(this.getClaAnoElabora());
        fields += " CLA_MES_ELABORA = ?, ";
        values.add(this.getClaMesElabora());
        fields += " CLA_DIA_ELABORA = ?, ";
        values.add(this.getClaDiaElabora());
        fields += " CLA_ANO_ALTA_REG = ?, ";
        values.add(this.getClaAnoAltaReg());
        fields += " CLA_MES_ALTA_REG = ?, ";
        values.add(this.getClaMesAltaReg());
        fields += " CLA_DIA_ALTA_REG = ?, ";
        values.add(this.getClaDiaAltaReg());
        fields += " CLA_ANO_ULT_MOD = ?, ";
        values.add(this.getClaAnoUltMod());
        fields += " CLA_MES_ULT_MOD = ?, ";
        values.add(this.getClaMesUltMod());
        fields += " CLA_DIA_ULT_MOD = ?, ";
        values.add(this.getClaDiaUltMod());
        fields += " CLA_CVE_ST_CLAUSUL = ?, ";
        values.add(this.getClaCveStClausul());
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
        String sql = "INSERT INTO CLAUSULA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CLA_NUM_CLAUSULA";
        fieldValues += ", ?";
        values.add(this.getClaNumClausula());

        fields += ", CLA_CVE_TIPO_CLAU";
        fieldValues += ", ?";
        values.add(this.getClaCveTipoClau());

        fields += ", CLA_NOM_CLAUSULA";
        fieldValues += ", ?";
        values.add(this.getClaNomClausula());

        fields += ", CLA_DESC_CLAUSULA";
        fieldValues += ", ?";
        values.add(this.getClaDescClausula());

        fields += ", CLA_CVE_MODIFI";
        fieldValues += ", ?";
        values.add(this.getClaCveModifi());

        fields += ", CLA_ANO_ELABORA";
        fieldValues += ", ?";
        values.add(this.getClaAnoElabora());

        fields += ", CLA_MES_ELABORA";
        fieldValues += ", ?";
        values.add(this.getClaMesElabora());

        fields += ", CLA_DIA_ELABORA";
        fieldValues += ", ?";
        values.add(this.getClaDiaElabora());

        fields += ", CLA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getClaAnoAltaReg());

        fields += ", CLA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getClaMesAltaReg());

        fields += ", CLA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getClaDiaAltaReg());

        fields += ", CLA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getClaAnoUltMod());

        fields += ", CLA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getClaMesUltMod());

        fields += ", CLA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getClaDiaUltMod());

        fields += ", CLA_CVE_ST_CLAUSUL";
        fieldValues += ", ?";
        values.add(this.getClaCveStClausul());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CLAUSULA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CLA_NUM_CLAUSULA = ?";
        values.add(this.getClaNumClausula());
        conditions += " AND CLA_CVE_TIPO_CLAU = ?";
        values.add(this.getClaCveTipoClau());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Clausula instance = (Clausula) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getClaNumClausula().equals(instance.getClaNumClausula()))
            equalObjects = false;
        if (equalObjects && !this.getClaCveTipoClau().equals(instance.getClaCveTipoClau()))
            equalObjects = false;
        if (equalObjects && !this.getClaNomClausula().equals(instance.getClaNomClausula()))
            equalObjects = false;
        if (equalObjects && !this.getClaDescClausula().equals(instance.getClaDescClausula()))
            equalObjects = false;
        if (equalObjects && !this.getClaCveModifi().equals(instance.getClaCveModifi()))
            equalObjects = false;
        if (equalObjects && !this.getClaAnoElabora().equals(instance.getClaAnoElabora()))
            equalObjects = false;
        if (equalObjects && !this.getClaMesElabora().equals(instance.getClaMesElabora()))
            equalObjects = false;
        if (equalObjects && !this.getClaDiaElabora().equals(instance.getClaDiaElabora()))
            equalObjects = false;
        if (equalObjects && !this.getClaAnoAltaReg().equals(instance.getClaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getClaMesAltaReg().equals(instance.getClaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getClaDiaAltaReg().equals(instance.getClaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getClaAnoUltMod().equals(instance.getClaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getClaMesUltMod().equals(instance.getClaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getClaDiaUltMod().equals(instance.getClaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getClaCveStClausul().equals(instance.getClaCveStClausul()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Clausula result = new Clausula();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setClaNumClausula((BigDecimal) objectData.getData("CLA_NUM_CLAUSULA"));
        result.setClaCveTipoClau((String) objectData.getData("CLA_CVE_TIPO_CLAU"));
        result.setClaNomClausula((String) objectData.getData("CLA_NOM_CLAUSULA"));
        result.setClaDescClausula((Long) objectData.getData("CLA_DESC_CLAUSULA"));
        result.setClaCveModifi((BigDecimal) objectData.getData("CLA_CVE_MODIFI"));
        result.setClaAnoElabora((BigDecimal) objectData.getData("CLA_ANO_ELABORA"));
        result.setClaMesElabora((BigDecimal) objectData.getData("CLA_MES_ELABORA"));
        result.setClaDiaElabora((BigDecimal) objectData.getData("CLA_DIA_ELABORA"));
        result.setClaAnoAltaReg((BigDecimal) objectData.getData("CLA_ANO_ALTA_REG"));
        result.setClaMesAltaReg((BigDecimal) objectData.getData("CLA_MES_ALTA_REG"));
        result.setClaDiaAltaReg((BigDecimal) objectData.getData("CLA_DIA_ALTA_REG"));
        result.setClaAnoUltMod((BigDecimal) objectData.getData("CLA_ANO_ULT_MOD"));
        result.setClaMesUltMod((BigDecimal) objectData.getData("CLA_MES_ULT_MOD"));
        result.setClaDiaUltMod((BigDecimal) objectData.getData("CLA_DIA_ULT_MOD"));
        result.setClaCveStClausul((String) objectData.getData("CLA_CVE_ST_CLAUSUL"));

        return result;

    }

}
