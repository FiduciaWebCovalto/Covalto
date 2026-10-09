package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTOASIG_PK", columns = { "CTO_ULT_CTO" }, sequences = { "MAX" })
public class Ctoasig extends DomainObject {

    BigDecimal ctoUltCto = null;

    public Ctoasig() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoUltCto(BigDecimal ctoUltCto) {
        this.ctoUltCto = ctoUltCto;
    }

    public BigDecimal getCtoUltCto() {
        return this.ctoUltCto;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTOASIG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtoUltCto() != null && this.getCtoUltCto().longValue() == -999) {
            conditions += " AND CTO_ULT_CTO IS NULL";
        } else if (this.getCtoUltCto() != null) {
            conditions += " AND CTO_ULT_CTO = ?";
            values.add(this.getCtoUltCto());
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
        String sql = "SELECT * FROM CTOASIG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtoUltCto() != null && this.getCtoUltCto().longValue() == -999) {
            conditions += " AND CTO_ULT_CTO IS NULL";
        } else if (this.getCtoUltCto() != null) {
            conditions += " AND CTO_ULT_CTO = ?";
            values.add(this.getCtoUltCto());
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
        String sql = "UPDATE CTOASIG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTO_ULT_CTO = ?";
        pkValues.add(this.getCtoUltCto());
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
        String sql = "INSERT INTO CTOASIG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTO_ULT_CTO";
        fieldValues += ", ?";
        values.add(this.getCtoUltCto());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTOASIG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTO_ULT_CTO = ?";
        values.add(this.getCtoUltCto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ctoasig instance = (Ctoasig) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtoUltCto().equals(instance.getCtoUltCto()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ctoasig result = new Ctoasig();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtoUltCto((BigDecimal) objectData.getData("CTO_ULT_CTO"));

        return result;

    }

}
