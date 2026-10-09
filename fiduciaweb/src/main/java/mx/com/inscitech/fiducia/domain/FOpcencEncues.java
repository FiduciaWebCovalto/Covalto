package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_OPCENC_ENCUES_PK", columns = { "FOPC_ID_OPCION", "FENC_ID_ENCUESTA" }, sequences = { "MANUAL" })
public class FOpcencEncues extends DomainObject {

    BigDecimal fopcIdOpcion = null;
    BigDecimal fencIdEncuesta = null;

    public FOpcencEncues() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFopcIdOpcion(BigDecimal fopcIdOpcion) {
        this.fopcIdOpcion = fopcIdOpcion;
    }

    public BigDecimal getFopcIdOpcion() {
        return this.fopcIdOpcion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFencIdEncuesta(BigDecimal fencIdEncuesta) {
        this.fencIdEncuesta = fencIdEncuesta;
    }

    public BigDecimal getFencIdEncuesta() {
        return this.fencIdEncuesta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_OPCENC_ENCUES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFopcIdOpcion() != null && this.getFopcIdOpcion().longValue() == -999) {
            conditions += " AND FOPC_ID_OPCION IS NULL";
        } else if (this.getFopcIdOpcion() != null) {
            conditions += " AND FOPC_ID_OPCION = ?";
            values.add(this.getFopcIdOpcion());
        }

        if (this.getFencIdEncuesta() != null && this.getFencIdEncuesta().longValue() == -999) {
            conditions += " AND FENC_ID_ENCUESTA IS NULL";
        } else if (this.getFencIdEncuesta() != null) {
            conditions += " AND FENC_ID_ENCUESTA = ?";
            values.add(this.getFencIdEncuesta());
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
        String sql = "SELECT * FROM F_OPCENC_ENCUES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFopcIdOpcion() != null && this.getFopcIdOpcion().longValue() == -999) {
            conditions += " AND FOPC_ID_OPCION IS NULL";
        } else if (this.getFopcIdOpcion() != null) {
            conditions += " AND FOPC_ID_OPCION = ?";
            values.add(this.getFopcIdOpcion());
        }

        if (this.getFencIdEncuesta() != null && this.getFencIdEncuesta().longValue() == -999) {
            conditions += " AND FENC_ID_ENCUESTA IS NULL";
        } else if (this.getFencIdEncuesta() != null) {
            conditions += " AND FENC_ID_ENCUESTA = ?";
            values.add(this.getFencIdEncuesta());
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
        String sql = "UPDATE F_OPCENC_ENCUES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOPC_ID_OPCION = ?";
        pkValues.add(this.getFopcIdOpcion());
        conditions += " AND FENC_ID_ENCUESTA = ?";
        pkValues.add(this.getFencIdEncuesta());
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
        String sql = "INSERT INTO F_OPCENC_ENCUES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOPC_ID_OPCION";
        fieldValues += ", ?";
        values.add(this.getFopcIdOpcion());

        fields += ", FENC_ID_ENCUESTA";
        fieldValues += ", ?";
        values.add(this.getFencIdEncuesta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_OPCENC_ENCUES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOPC_ID_OPCION = ?";
        values.add(this.getFopcIdOpcion());
        conditions += " AND FENC_ID_ENCUESTA = ?";
        values.add(this.getFencIdEncuesta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FOpcencEncues instance = (FOpcencEncues) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFopcIdOpcion().equals(instance.getFopcIdOpcion()))
            equalObjects = false;
        if (equalObjects && !this.getFencIdEncuesta().equals(instance.getFencIdEncuesta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FOpcencEncues result = new FOpcencEncues();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFopcIdOpcion((BigDecimal) objectData.getData("FOPC_ID_OPCION"));
        result.setFencIdEncuesta((BigDecimal) objectData.getData("FENC_ID_ENCUESTA"));

        return result;

    }

}
