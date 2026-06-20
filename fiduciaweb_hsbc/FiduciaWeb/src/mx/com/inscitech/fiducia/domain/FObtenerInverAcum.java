package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_OBTENER_INVER_ACUM_PK", columns = { "FOIA_NUM_INV" }, sequences = { "MAX" })
public class FObtenerInverAcum extends DomainObject {

    BigDecimal foiaNumInv = null;

    public FObtenerInverAcum() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFoiaNumInv(BigDecimal foiaNumInv) {
        this.foiaNumInv = foiaNumInv;
    }

    public BigDecimal getFoiaNumInv() {
        return this.foiaNumInv;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_OBTENER_INVER_ACUM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFoiaNumInv() != null && this.getFoiaNumInv().longValue() == -999) {
            conditions += " AND FOIA_NUM_INV IS NULL";
        } else if (this.getFoiaNumInv() != null) {
            conditions += " AND FOIA_NUM_INV = ?";
            values.add(this.getFoiaNumInv());
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
        String sql = "SELECT * FROM F_OBTENER_INVER_ACUM ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFoiaNumInv() != null && this.getFoiaNumInv().longValue() == -999) {
            conditions += " AND FOIA_NUM_INV IS NULL";
        } else if (this.getFoiaNumInv() != null) {
            conditions += " AND FOIA_NUM_INV = ?";
            values.add(this.getFoiaNumInv());
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
        String sql = "UPDATE F_OBTENER_INVER_ACUM SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FOIA_NUM_INV = ?";
        pkValues.add(this.getFoiaNumInv());
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
        String sql = "INSERT INTO F_OBTENER_INVER_ACUM ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FOIA_NUM_INV";
        fieldValues += ", ?";
        values.add(this.getFoiaNumInv());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_OBTENER_INVER_ACUM WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FOIA_NUM_INV = ?";
        values.add(this.getFoiaNumInv());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FObtenerInverAcum instance = (FObtenerInverAcum) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFoiaNumInv().equals(instance.getFoiaNumInv()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FObtenerInverAcum result = new FObtenerInverAcum();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFoiaNumInv((BigDecimal) objectData.getData("FOIA_NUM_INV"));

        return result;

    }

}
