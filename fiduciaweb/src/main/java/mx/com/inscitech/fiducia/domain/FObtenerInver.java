package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_OBTENER_INVER_PK", columns = { "FOIN_NUM_INV" }, sequences = { "MAX" })
public class FObtenerInver extends DomainObject {

    BigDecimal foinNumInv = null;

    public FObtenerInver() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFoinNumInv(BigDecimal foinNumInv) {
        this.foinNumInv = foinNumInv;
    }

    public BigDecimal getFoinNumInv() {
        return this.foinNumInv;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_OBTENER_INVER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFoinNumInv() != null && this.getFoinNumInv().longValue() == -999) {
            conditions += " AND FOIN_NUM_INV IS NULL";
        } else if (this.getFoinNumInv() != null) {
            conditions += " AND FOIN_NUM_INV = ?";
            values.add(this.getFoinNumInv());
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
        String sql = "SELECT * FROM F_OBTENER_INVER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFoinNumInv() != null && this.getFoinNumInv().longValue() == -999) {
            conditions += " AND FOIN_NUM_INV IS NULL";
        } else if (this.getFoinNumInv() != null) {
            conditions += " AND FOIN_NUM_INV = ?";
            values.add(this.getFoinNumInv());
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
        String sql = "UPDATE F_OBTENER_INVER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOIN_NUM_INV = ?";
        pkValues.add(this.getFoinNumInv());
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
        String sql = "INSERT INTO F_OBTENER_INVER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOIN_NUM_INV";
        fieldValues += ", ?";
        values.add(this.getFoinNumInv());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_OBTENER_INVER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOIN_NUM_INV = ?";
        values.add(this.getFoinNumInv());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FObtenerInver instance = (FObtenerInver) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFoinNumInv().equals(instance.getFoinNumInv()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FObtenerInver result = new FObtenerInver();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFoinNumInv((BigDecimal) objectData.getData("FOIN_NUM_INV"));

        return result;

    }

}
