package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "APLIPUES_PK", columns = { "APL_NUM_PUESTO", "APL_ID_OPCION" }, sequences = { "MANUAL" })
public class Aplipues extends DomainObject {

    BigDecimal aplNumPuesto = null;
    BigDecimal aplIdOpcion = null;

    public Aplipues() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAplNumPuesto(BigDecimal aplNumPuesto) {
        this.aplNumPuesto = aplNumPuesto;
    }

    public BigDecimal getAplNumPuesto() {
        return this.aplNumPuesto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAplIdOpcion(BigDecimal aplIdOpcion) {
        this.aplIdOpcion = aplIdOpcion;
    }

    public BigDecimal getAplIdOpcion() {
        return this.aplIdOpcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM APLIPUES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAplNumPuesto() != null && this.getAplNumPuesto().longValue() == -999) {
            conditions += " AND APL_NUM_PUESTO IS NULL";
        } else if (this.getAplNumPuesto() != null) {
            conditions += " AND APL_NUM_PUESTO = ?";
            values.add(this.getAplNumPuesto());
        }

        if (this.getAplIdOpcion() != null && this.getAplIdOpcion().longValue() == -999) {
            conditions += " AND APL_ID_OPCION IS NULL";
        } else if (this.getAplIdOpcion() != null) {
            conditions += " AND APL_ID_OPCION = ?";
            values.add(this.getAplIdOpcion());
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
        String sql = "SELECT * FROM APLIPUES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAplNumPuesto() != null && this.getAplNumPuesto().longValue() == -999) {
            conditions += " AND APL_NUM_PUESTO IS NULL";
        } else if (this.getAplNumPuesto() != null) {
            conditions += " AND APL_NUM_PUESTO = ?";
            values.add(this.getAplNumPuesto());
        }

        if (this.getAplIdOpcion() != null && this.getAplIdOpcion().longValue() == -999) {
            conditions += " AND APL_ID_OPCION IS NULL";
        } else if (this.getAplIdOpcion() != null) {
            conditions += " AND APL_ID_OPCION = ?";
            values.add(this.getAplIdOpcion());
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
        String sql = "UPDATE APLIPUES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND APL_NUM_PUESTO = ?";
        pkValues.add(this.getAplNumPuesto());
        conditions += " AND APL_ID_OPCION = ?";
        pkValues.add(this.getAplIdOpcion());
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
        String sql = "INSERT INTO APLIPUES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", APL_NUM_PUESTO";
        fieldValues += ", ?";
        values.add(this.getAplNumPuesto());

        fields += ", APL_ID_OPCION";
        fieldValues += ", ?";
        values.add(this.getAplIdOpcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM APLIPUES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND APL_NUM_PUESTO = ?";
        values.add(this.getAplNumPuesto());
        conditions += " AND APL_ID_OPCION = ?";
        values.add(this.getAplIdOpcion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Aplipues instance = (Aplipues) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAplNumPuesto().equals(instance.getAplNumPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getAplIdOpcion().equals(instance.getAplIdOpcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Aplipues result = new Aplipues();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAplNumPuesto((BigDecimal) objectData.getData("APL_NUM_PUESTO"));
        result.setAplIdOpcion((BigDecimal) objectData.getData("APL_ID_OPCION"));

        return result;

    }

}
