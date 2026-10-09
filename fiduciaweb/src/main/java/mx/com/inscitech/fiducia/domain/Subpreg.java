package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SUBPREG_PK", columns = { "SPR_ID_PREGUNTA", "SPR_ID_SUBPREGUNTA" }, sequences = { "MANUAL" })
public class Subpreg extends DomainObject {

    BigDecimal sprIdPregunta = null;
    BigDecimal sprIdSubpregunta = null;
    String sprDescSubprgta = null;
    BigDecimal sprAnoAltaReg = null;
    BigDecimal sprMesAltaReg = null;
    BigDecimal sprDiaAltaReg = null;
    BigDecimal sprAnoUltMod = null;
    BigDecimal sprMesUltMod = null;
    BigDecimal sprDiaUltMod = null;

    public Subpreg() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSprIdPregunta(BigDecimal sprIdPregunta) {
        this.sprIdPregunta = sprIdPregunta;
    }

    public BigDecimal getSprIdPregunta() {
        return this.sprIdPregunta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSprIdSubpregunta(BigDecimal sprIdSubpregunta) {
        this.sprIdSubpregunta = sprIdSubpregunta;
    }

    public BigDecimal getSprIdSubpregunta() {
        return this.sprIdSubpregunta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSprDescSubprgta(String sprDescSubprgta) {
        this.sprDescSubprgta = sprDescSubprgta;
    }

    public String getSprDescSubprgta() {
        return this.sprDescSubprgta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSprAnoAltaReg(BigDecimal sprAnoAltaReg) {
        this.sprAnoAltaReg = sprAnoAltaReg;
    }

    public BigDecimal getSprAnoAltaReg() {
        return this.sprAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSprMesAltaReg(BigDecimal sprMesAltaReg) {
        this.sprMesAltaReg = sprMesAltaReg;
    }

    public BigDecimal getSprMesAltaReg() {
        return this.sprMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSprDiaAltaReg(BigDecimal sprDiaAltaReg) {
        this.sprDiaAltaReg = sprDiaAltaReg;
    }

    public BigDecimal getSprDiaAltaReg() {
        return this.sprDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSprAnoUltMod(BigDecimal sprAnoUltMod) {
        this.sprAnoUltMod = sprAnoUltMod;
    }

    public BigDecimal getSprAnoUltMod() {
        return this.sprAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSprMesUltMod(BigDecimal sprMesUltMod) {
        this.sprMesUltMod = sprMesUltMod;
    }

    public BigDecimal getSprMesUltMod() {
        return this.sprMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSprDiaUltMod(BigDecimal sprDiaUltMod) {
        this.sprDiaUltMod = sprDiaUltMod;
    }

    public BigDecimal getSprDiaUltMod() {
        return this.sprDiaUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SUBPREG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSprIdPregunta() != null && this.getSprIdPregunta().longValue() == -999) {
            conditions += " AND SPR_ID_PREGUNTA IS NULL";
        } else if (this.getSprIdPregunta() != null) {
            conditions += " AND SPR_ID_PREGUNTA = ?";
            values.add(this.getSprIdPregunta());
        }

        if (this.getSprIdSubpregunta() != null && this.getSprIdSubpregunta().longValue() == -999) {
            conditions += " AND SPR_ID_SUBPREGUNTA IS NULL";
        } else if (this.getSprIdSubpregunta() != null) {
            conditions += " AND SPR_ID_SUBPREGUNTA = ?";
            values.add(this.getSprIdSubpregunta());
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
        String sql = "SELECT * FROM SUBPREG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSprIdPregunta() != null && this.getSprIdPregunta().longValue() == -999) {
            conditions += " AND SPR_ID_PREGUNTA IS NULL";
        } else if (this.getSprIdPregunta() != null) {
            conditions += " AND SPR_ID_PREGUNTA = ?";
            values.add(this.getSprIdPregunta());
        }

        if (this.getSprIdSubpregunta() != null && this.getSprIdSubpregunta().longValue() == -999) {
            conditions += " AND SPR_ID_SUBPREGUNTA IS NULL";
        } else if (this.getSprIdSubpregunta() != null) {
            conditions += " AND SPR_ID_SUBPREGUNTA = ?";
            values.add(this.getSprIdSubpregunta());
        }

        if (this.getSprDescSubprgta() != null && "null".equals(this.getSprDescSubprgta())) {
            conditions += " AND SPR_DESC_SUBPRGTA IS NULL";
        } else if (this.getSprDescSubprgta() != null) {
            conditions += " AND SPR_DESC_SUBPRGTA = ?";
            values.add(this.getSprDescSubprgta());
        }

        if (this.getSprAnoAltaReg() != null && this.getSprAnoAltaReg().longValue() == -999) {
            conditions += " AND SPR_ANO_ALTA_REG IS NULL";
        } else if (this.getSprAnoAltaReg() != null) {
            conditions += " AND SPR_ANO_ALTA_REG = ?";
            values.add(this.getSprAnoAltaReg());
        }

        if (this.getSprMesAltaReg() != null && this.getSprMesAltaReg().longValue() == -999) {
            conditions += " AND SPR_MES_ALTA_REG IS NULL";
        } else if (this.getSprMesAltaReg() != null) {
            conditions += " AND SPR_MES_ALTA_REG = ?";
            values.add(this.getSprMesAltaReg());
        }

        if (this.getSprDiaAltaReg() != null && this.getSprDiaAltaReg().longValue() == -999) {
            conditions += " AND SPR_DIA_ALTA_REG IS NULL";
        } else if (this.getSprDiaAltaReg() != null) {
            conditions += " AND SPR_DIA_ALTA_REG = ?";
            values.add(this.getSprDiaAltaReg());
        }

        if (this.getSprAnoUltMod() != null && this.getSprAnoUltMod().longValue() == -999) {
            conditions += " AND SPR_ANO_ULT_MOD IS NULL";
        } else if (this.getSprAnoUltMod() != null) {
            conditions += " AND SPR_ANO_ULT_MOD = ?";
            values.add(this.getSprAnoUltMod());
        }

        if (this.getSprMesUltMod() != null && this.getSprMesUltMod().longValue() == -999) {
            conditions += " AND SPR_MES_ULT_MOD IS NULL";
        } else if (this.getSprMesUltMod() != null) {
            conditions += " AND SPR_MES_ULT_MOD = ?";
            values.add(this.getSprMesUltMod());
        }

        if (this.getSprDiaUltMod() != null && this.getSprDiaUltMod().longValue() == -999) {
            conditions += " AND SPR_DIA_ULT_MOD IS NULL";
        } else if (this.getSprDiaUltMod() != null) {
            conditions += " AND SPR_DIA_ULT_MOD = ?";
            values.add(this.getSprDiaUltMod());
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
        String sql = "UPDATE SUBPREG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SPR_ID_PREGUNTA = ?";
        pkValues.add(this.getSprIdPregunta());
        conditions += " AND SPR_ID_SUBPREGUNTA = ?";
        pkValues.add(this.getSprIdSubpregunta());
        fields += " SPR_DESC_SUBPRGTA = ?, ";
        values.add(this.getSprDescSubprgta());
        fields += " SPR_ANO_ALTA_REG = ?, ";
        values.add(this.getSprAnoAltaReg());
        fields += " SPR_MES_ALTA_REG = ?, ";
        values.add(this.getSprMesAltaReg());
        fields += " SPR_DIA_ALTA_REG = ?, ";
        values.add(this.getSprDiaAltaReg());
        fields += " SPR_ANO_ULT_MOD = ?, ";
        values.add(this.getSprAnoUltMod());
        fields += " SPR_MES_ULT_MOD = ?, ";
        values.add(this.getSprMesUltMod());
        fields += " SPR_DIA_ULT_MOD = ?, ";
        values.add(this.getSprDiaUltMod());
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
        String sql = "INSERT INTO SUBPREG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SPR_ID_PREGUNTA";
        fieldValues += ", ?";
        values.add(this.getSprIdPregunta());

        fields += ", SPR_ID_SUBPREGUNTA";
        fieldValues += ", ?";
        values.add(this.getSprIdSubpregunta());

        fields += ", SPR_DESC_SUBPRGTA";
        fieldValues += ", ?";
        values.add(this.getSprDescSubprgta());

        fields += ", SPR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSprAnoAltaReg());

        fields += ", SPR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSprMesAltaReg());

        fields += ", SPR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSprDiaAltaReg());

        fields += ", SPR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSprAnoUltMod());

        fields += ", SPR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSprMesUltMod());

        fields += ", SPR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSprDiaUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SUBPREG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SPR_ID_PREGUNTA = ?";
        values.add(this.getSprIdPregunta());
        conditions += " AND SPR_ID_SUBPREGUNTA = ?";
        values.add(this.getSprIdSubpregunta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Subpreg instance = (Subpreg) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSprIdPregunta().equals(instance.getSprIdPregunta()))
            equalObjects = false;
        if (equalObjects && !this.getSprIdSubpregunta().equals(instance.getSprIdSubpregunta()))
            equalObjects = false;
        if (equalObjects && !this.getSprDescSubprgta().equals(instance.getSprDescSubprgta()))
            equalObjects = false;
        if (equalObjects && !this.getSprAnoAltaReg().equals(instance.getSprAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSprMesAltaReg().equals(instance.getSprMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSprDiaAltaReg().equals(instance.getSprDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSprAnoUltMod().equals(instance.getSprAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSprMesUltMod().equals(instance.getSprMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSprDiaUltMod().equals(instance.getSprDiaUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Subpreg result = new Subpreg();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSprIdPregunta((BigDecimal) objectData.getData("SPR_ID_PREGUNTA"));
        result.setSprIdSubpregunta((BigDecimal) objectData.getData("SPR_ID_SUBPREGUNTA"));
        result.setSprDescSubprgta((String) objectData.getData("SPR_DESC_SUBPRGTA"));
        result.setSprAnoAltaReg((BigDecimal) objectData.getData("SPR_ANO_ALTA_REG"));
        result.setSprMesAltaReg((BigDecimal) objectData.getData("SPR_MES_ALTA_REG"));
        result.setSprDiaAltaReg((BigDecimal) objectData.getData("SPR_DIA_ALTA_REG"));
        result.setSprAnoUltMod((BigDecimal) objectData.getData("SPR_ANO_ULT_MOD"));
        result.setSprMesUltMod((BigDecimal) objectData.getData("SPR_MES_ULT_MOD"));
        result.setSprDiaUltMod((BigDecimal) objectData.getData("SPR_DIA_ULT_MOD"));

        return result;

    }

}
