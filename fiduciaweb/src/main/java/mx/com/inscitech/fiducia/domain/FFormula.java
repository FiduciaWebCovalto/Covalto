package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_FORMULA_PK", columns = { "EFRM_ID_CLASIFIC", "EFRM_ID_FORMULA" }, sequences = { "MANUAL" })
public class FFormula extends DomainObject {

    BigDecimal efrmIdClasific = null;
    BigDecimal efrmIdFormula = null;
    String efrmNomFormula = null;
    String efrmDescripcion = null;
    String efrmStFormula = null;

    public FFormula() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEfrmIdClasific(BigDecimal efrmIdClasific) {
        this.efrmIdClasific = efrmIdClasific;
    }

    public BigDecimal getEfrmIdClasific() {
        return this.efrmIdClasific;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfrmIdFormula(BigDecimal efrmIdFormula) {
        this.efrmIdFormula = efrmIdFormula;
    }

    public BigDecimal getEfrmIdFormula() {
        return this.efrmIdFormula;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfrmNomFormula(String efrmNomFormula) {
        this.efrmNomFormula = efrmNomFormula;
    }

    public String getEfrmNomFormula() {
        return this.efrmNomFormula;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfrmDescripcion(String efrmDescripcion) {
        this.efrmDescripcion = efrmDescripcion;
    }

    public String getEfrmDescripcion() {
        return this.efrmDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfrmStFormula(String efrmStFormula) {
        this.efrmStFormula = efrmStFormula;
    }

    public String getEfrmStFormula() {
        return this.efrmStFormula;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_FORMULA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfrmIdClasific() != null && this.getEfrmIdClasific().longValue() == -999) {
            conditions += " AND EFRM_ID_CLASIFIC IS NULL";
        } else if (this.getEfrmIdClasific() != null) {
            conditions += " AND EFRM_ID_CLASIFIC = ?";
            values.add(this.getEfrmIdClasific());
        }

        if (this.getEfrmIdFormula() != null && this.getEfrmIdFormula().longValue() == -999) {
            conditions += " AND EFRM_ID_FORMULA IS NULL";
        } else if (this.getEfrmIdFormula() != null) {
            conditions += " AND EFRM_ID_FORMULA = ?";
            values.add(this.getEfrmIdFormula());
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
        String sql = "SELECT * FROM F_FORMULA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfrmIdClasific() != null && this.getEfrmIdClasific().longValue() == -999) {
            conditions += " AND EFRM_ID_CLASIFIC IS NULL";
        } else if (this.getEfrmIdClasific() != null) {
            conditions += " AND EFRM_ID_CLASIFIC = ?";
            values.add(this.getEfrmIdClasific());
        }

        if (this.getEfrmIdFormula() != null && this.getEfrmIdFormula().longValue() == -999) {
            conditions += " AND EFRM_ID_FORMULA IS NULL";
        } else if (this.getEfrmIdFormula() != null) {
            conditions += " AND EFRM_ID_FORMULA = ?";
            values.add(this.getEfrmIdFormula());
        }

        if (this.getEfrmNomFormula() != null && "null".equals(this.getEfrmNomFormula())) {
            conditions += " AND EFRM_NOM_FORMULA IS NULL";
        } else if (this.getEfrmNomFormula() != null) {
            conditions += " AND EFRM_NOM_FORMULA = ?";
            values.add(this.getEfrmNomFormula());
        }

        if (this.getEfrmDescripcion() != null && "null".equals(this.getEfrmDescripcion())) {
            conditions += " AND EFRM_DESCRIPCION IS NULL";
        } else if (this.getEfrmDescripcion() != null) {
            conditions += " AND EFRM_DESCRIPCION = ?";
            values.add(this.getEfrmDescripcion());
        }

        if (this.getEfrmStFormula() != null && "null".equals(this.getEfrmStFormula())) {
            conditions += " AND EFRM_ST_FORMULA IS NULL";
        } else if (this.getEfrmStFormula() != null) {
            conditions += " AND EFRM_ST_FORMULA = ?";
            values.add(this.getEfrmStFormula());
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
        String sql = "UPDATE F_FORMULA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EFRM_ID_CLASIFIC = ?";
        pkValues.add(this.getEfrmIdClasific());
        conditions += " AND EFRM_ID_FORMULA = ?";
        pkValues.add(this.getEfrmIdFormula());
        fields += " EFRM_NOM_FORMULA = ?, ";
        values.add(this.getEfrmNomFormula());
        fields += " EFRM_DESCRIPCION = ?, ";
        values.add(this.getEfrmDescripcion());
        fields += " EFRM_ST_FORMULA = ?, ";
        values.add(this.getEfrmStFormula());
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
        String sql = "INSERT INTO F_FORMULA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EFRM_ID_CLASIFIC";
        fieldValues += ", ?";
        values.add(this.getEfrmIdClasific());

        fields += ", EFRM_ID_FORMULA";
        fieldValues += ", ?";
        values.add(this.getEfrmIdFormula());

        fields += ", EFRM_NOM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getEfrmNomFormula());

        fields += ", EFRM_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getEfrmDescripcion());

        fields += ", EFRM_ST_FORMULA";
        fieldValues += ", ?";
        values.add(this.getEfrmStFormula());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_FORMULA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EFRM_ID_CLASIFIC = ?";
        values.add(this.getEfrmIdClasific());
        conditions += " AND EFRM_ID_FORMULA = ?";
        values.add(this.getEfrmIdFormula());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FFormula instance = (FFormula) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEfrmIdClasific().equals(instance.getEfrmIdClasific()))
            equalObjects = false;
        if (equalObjects && !this.getEfrmIdFormula().equals(instance.getEfrmIdFormula()))
            equalObjects = false;
        if (equalObjects && !this.getEfrmNomFormula().equals(instance.getEfrmNomFormula()))
            equalObjects = false;
        if (equalObjects && !this.getEfrmDescripcion().equals(instance.getEfrmDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getEfrmStFormula().equals(instance.getEfrmStFormula()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FFormula result = new FFormula();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEfrmIdClasific((BigDecimal) objectData.getData("EFRM_ID_CLASIFIC"));
        result.setEfrmIdFormula((BigDecimal) objectData.getData("EFRM_ID_FORMULA"));
        result.setEfrmNomFormula((String) objectData.getData("EFRM_NOM_FORMULA"));
        result.setEfrmDescripcion((String) objectData.getData("EFRM_DESCRIPCION"));
        result.setEfrmStFormula((String) objectData.getData("EFRM_ST_FORMULA"));

        return result;

    }

}
