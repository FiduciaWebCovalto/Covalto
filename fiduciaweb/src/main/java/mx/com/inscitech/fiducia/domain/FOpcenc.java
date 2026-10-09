package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_OPCENC_PK", columns = { "FOPC_ID_OPCION" }, sequences = { "MAX" })
public class FOpcenc extends DomainObject {

    BigDecimal fopcIdOpcion = null;
    String fopcDescripcion = null;

    public FOpcenc() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFopcIdOpcion(BigDecimal fopcIdOpcion) {
        this.fopcIdOpcion = fopcIdOpcion;
    }

    public BigDecimal getFopcIdOpcion() {
        return this.fopcIdOpcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFopcDescripcion(String fopcDescripcion) {
        this.fopcDescripcion = fopcDescripcion;
    }

    public String getFopcDescripcion() {
        return this.fopcDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_OPCENC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFopcIdOpcion() != null && this.getFopcIdOpcion().longValue() == -999) {
            conditions += " AND FOPC_ID_OPCION IS NULL";
        } else if (this.getFopcIdOpcion() != null) {
            conditions += " AND FOPC_ID_OPCION = ?";
            values.add(this.getFopcIdOpcion());
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
        String sql = "SELECT * FROM F_OPCENC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFopcIdOpcion() != null && this.getFopcIdOpcion().longValue() == -999) {
            conditions += " AND FOPC_ID_OPCION IS NULL";
        } else if (this.getFopcIdOpcion() != null) {
            conditions += " AND FOPC_ID_OPCION = ?";
            values.add(this.getFopcIdOpcion());
        }

        if (this.getFopcDescripcion() != null && "null".equals(this.getFopcDescripcion())) {
            conditions += " AND FOPC_DESCRIPCION IS NULL";
        } else if (this.getFopcDescripcion() != null) {
            conditions += " AND FOPC_DESCRIPCION = ?";
            values.add(this.getFopcDescripcion());
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
        String sql = "UPDATE F_OPCENC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOPC_ID_OPCION = ?";
        pkValues.add(this.getFopcIdOpcion());
        fields += " FOPC_DESCRIPCION = ?, ";
        values.add(this.getFopcDescripcion());
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
        String sql = "INSERT INTO F_OPCENC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOPC_ID_OPCION";
        fieldValues += ", ?";
        values.add(this.getFopcIdOpcion());

        fields += ", FOPC_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getFopcDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_OPCENC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOPC_ID_OPCION = ?";
        values.add(this.getFopcIdOpcion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FOpcenc instance = (FOpcenc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFopcIdOpcion().equals(instance.getFopcIdOpcion()))
            equalObjects = false;
        if (equalObjects && !this.getFopcDescripcion().equals(instance.getFopcDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FOpcenc result = new FOpcenc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFopcIdOpcion((BigDecimal) objectData.getData("FOPC_ID_OPCION"));
        result.setFopcDescripcion((String) objectData.getData("FOPC_DESCRIPCION"));

        return result;

    }

}
