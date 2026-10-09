package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PREGUNTA_PK", columns = { "PRE_ID_PREGUNTA" }, sequences = { "MAX" })
public class Pregunta extends DomainObject {

    BigDecimal preIdPregunta = null;
    String preDescPregunta = null;
    BigDecimal preAnoAltaReg = null;
    BigDecimal preMesAltaReg = null;
    BigDecimal preDiaAltaReg = null;
    BigDecimal preAnoUltMod = null;
    BigDecimal preMesUltMod = null;
    BigDecimal preDiaUltMod = null;

    public Pregunta() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPreIdPregunta(BigDecimal preIdPregunta) {
        this.preIdPregunta = preIdPregunta;
    }

    public BigDecimal getPreIdPregunta() {
        return this.preIdPregunta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPreDescPregunta(String preDescPregunta) {
        this.preDescPregunta = preDescPregunta;
    }

    public String getPreDescPregunta() {
        return this.preDescPregunta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPreAnoAltaReg(BigDecimal preAnoAltaReg) {
        this.preAnoAltaReg = preAnoAltaReg;
    }

    public BigDecimal getPreAnoAltaReg() {
        return this.preAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPreMesAltaReg(BigDecimal preMesAltaReg) {
        this.preMesAltaReg = preMesAltaReg;
    }

    public BigDecimal getPreMesAltaReg() {
        return this.preMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPreDiaAltaReg(BigDecimal preDiaAltaReg) {
        this.preDiaAltaReg = preDiaAltaReg;
    }

    public BigDecimal getPreDiaAltaReg() {
        return this.preDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPreAnoUltMod(BigDecimal preAnoUltMod) {
        this.preAnoUltMod = preAnoUltMod;
    }

    public BigDecimal getPreAnoUltMod() {
        return this.preAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPreMesUltMod(BigDecimal preMesUltMod) {
        this.preMesUltMod = preMesUltMod;
    }

    public BigDecimal getPreMesUltMod() {
        return this.preMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPreDiaUltMod(BigDecimal preDiaUltMod) {
        this.preDiaUltMod = preDiaUltMod;
    }

    public BigDecimal getPreDiaUltMod() {
        return this.preDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PREGUNTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPreIdPregunta() != null && this.getPreIdPregunta().longValue() == -999) {
            conditions += " AND PRE_ID_PREGUNTA IS NULL";
        } else if (this.getPreIdPregunta() != null) {
            conditions += " AND PRE_ID_PREGUNTA = ?";
            values.add(this.getPreIdPregunta());
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
        String sql = "SELECT * FROM PREGUNTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPreIdPregunta() != null && this.getPreIdPregunta().longValue() == -999) {
            conditions += " AND PRE_ID_PREGUNTA IS NULL";
        } else if (this.getPreIdPregunta() != null) {
            conditions += " AND PRE_ID_PREGUNTA = ?";
            values.add(this.getPreIdPregunta());
        }

        if (this.getPreDescPregunta() != null && "null".equals(this.getPreDescPregunta())) {
            conditions += " AND PRE_DESC_PREGUNTA IS NULL";
        } else if (this.getPreDescPregunta() != null) {
            conditions += " AND PRE_DESC_PREGUNTA = ?";
            values.add(this.getPreDescPregunta());
        }

        if (this.getPreAnoAltaReg() != null && this.getPreAnoAltaReg().longValue() == -999) {
            conditions += " AND PRE_ANO_ALTA_REG IS NULL";
        } else if (this.getPreAnoAltaReg() != null) {
            conditions += " AND PRE_ANO_ALTA_REG = ?";
            values.add(this.getPreAnoAltaReg());
        }

        if (this.getPreMesAltaReg() != null && this.getPreMesAltaReg().longValue() == -999) {
            conditions += " AND PRE_MES_ALTA_REG IS NULL";
        } else if (this.getPreMesAltaReg() != null) {
            conditions += " AND PRE_MES_ALTA_REG = ?";
            values.add(this.getPreMesAltaReg());
        }

        if (this.getPreDiaAltaReg() != null && this.getPreDiaAltaReg().longValue() == -999) {
            conditions += " AND PRE_DIA_ALTA_REG IS NULL";
        } else if (this.getPreDiaAltaReg() != null) {
            conditions += " AND PRE_DIA_ALTA_REG = ?";
            values.add(this.getPreDiaAltaReg());
        }

        if (this.getPreAnoUltMod() != null && this.getPreAnoUltMod().longValue() == -999) {
            conditions += " AND PRE_ANO_ULT_MOD IS NULL";
        } else if (this.getPreAnoUltMod() != null) {
            conditions += " AND PRE_ANO_ULT_MOD = ?";
            values.add(this.getPreAnoUltMod());
        }

        if (this.getPreMesUltMod() != null && this.getPreMesUltMod().longValue() == -999) {
            conditions += " AND PRE_MES_ULT_MOD IS NULL";
        } else if (this.getPreMesUltMod() != null) {
            conditions += " AND PRE_MES_ULT_MOD = ?";
            values.add(this.getPreMesUltMod());
        }

        if (this.getPreDiaUltMod() != null && this.getPreDiaUltMod().longValue() == -999) {
            conditions += " AND PRE_DIA_ULT_MOD IS NULL";
        } else if (this.getPreDiaUltMod() != null) {
            conditions += " AND PRE_DIA_ULT_MOD = ?";
            values.add(this.getPreDiaUltMod());
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
        String sql = "UPDATE PREGUNTA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PRE_ID_PREGUNTA = ?";
        pkValues.add(this.getPreIdPregunta());
        fields += " PRE_DESC_PREGUNTA = ?, ";
        values.add(this.getPreDescPregunta());
        fields += " PRE_ANO_ALTA_REG = ?, ";
        values.add(this.getPreAnoAltaReg());
        fields += " PRE_MES_ALTA_REG = ?, ";
        values.add(this.getPreMesAltaReg());
        fields += " PRE_DIA_ALTA_REG = ?, ";
        values.add(this.getPreDiaAltaReg());
        fields += " PRE_ANO_ULT_MOD = ?, ";
        values.add(this.getPreAnoUltMod());
        fields += " PRE_MES_ULT_MOD = ?, ";
        values.add(this.getPreMesUltMod());
        fields += " PRE_DIA_ULT_MOD = ?, ";
        values.add(this.getPreDiaUltMod());
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
        String sql = "INSERT INTO PREGUNTA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PRE_ID_PREGUNTA";
        fieldValues += ", ?";
        values.add(this.getPreIdPregunta());

        fields += ", PRE_DESC_PREGUNTA";
        fieldValues += ", ?";
        values.add(this.getPreDescPregunta());

        fields += ", PRE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPreAnoAltaReg());

        fields += ", PRE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPreMesAltaReg());

        fields += ", PRE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPreDiaAltaReg());

        fields += ", PRE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPreAnoUltMod());

        fields += ", PRE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPreMesUltMod());

        fields += ", PRE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPreDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PREGUNTA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PRE_ID_PREGUNTA = ?";
        values.add(this.getPreIdPregunta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Pregunta instance = (Pregunta) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPreIdPregunta().equals(instance.getPreIdPregunta()))
            equalObjects = false;
        if (equalObjects && !this.getPreDescPregunta().equals(instance.getPreDescPregunta()))
            equalObjects = false;
        if (equalObjects && !this.getPreAnoAltaReg().equals(instance.getPreAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPreMesAltaReg().equals(instance.getPreMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPreDiaAltaReg().equals(instance.getPreDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPreAnoUltMod().equals(instance.getPreAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPreMesUltMod().equals(instance.getPreMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPreDiaUltMod().equals(instance.getPreDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Pregunta result = new Pregunta();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPreIdPregunta((BigDecimal) objectData.getData("PRE_ID_PREGUNTA"));
        result.setPreDescPregunta((String) objectData.getData("PRE_DESC_PREGUNTA"));
        result.setPreAnoAltaReg((BigDecimal) objectData.getData("PRE_ANO_ALTA_REG"));
        result.setPreMesAltaReg((BigDecimal) objectData.getData("PRE_MES_ALTA_REG"));
        result.setPreDiaAltaReg((BigDecimal) objectData.getData("PRE_DIA_ALTA_REG"));
        result.setPreAnoUltMod((BigDecimal) objectData.getData("PRE_ANO_ULT_MOD"));
        result.setPreMesUltMod((BigDecimal) objectData.getData("PRE_MES_ULT_MOD"));
        result.setPreDiaUltMod((BigDecimal) objectData.getData("PRE_DIA_ULT_MOD"));

        return result;

    }

}
