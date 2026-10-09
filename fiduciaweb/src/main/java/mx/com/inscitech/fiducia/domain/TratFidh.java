package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TRAT_FIDH_PK", columns = { "CRF_NUM_FIDEICOM", "TRF_CVE_TRATFISC" }, sequences = { "MANUAL" })
public class TratFidh extends DomainObject {

    BigDecimal crfNumFideicom = null;
    BigDecimal trfCveTratfisc = null;

    public TratFidh() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrfNumFideicom(BigDecimal crfNumFideicom) {
        this.crfNumFideicom = crfNumFideicom;
    }

    public BigDecimal getCrfNumFideicom() {
        return this.crfNumFideicom;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrfCveTratfisc(BigDecimal trfCveTratfisc) {
        this.trfCveTratfisc = trfCveTratfisc;
    }

    public BigDecimal getTrfCveTratfisc() {
        return this.trfCveTratfisc;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TRAT_FIDH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCrfNumFideicom() != null && this.getCrfNumFideicom().longValue() == -999) {
            conditions += " AND CRF_NUM_FIDEICOM IS NULL";
        } else if (this.getCrfNumFideicom() != null) {
            conditions += " AND CRF_NUM_FIDEICOM = ?";
            values.add(this.getCrfNumFideicom());
        }

        if (this.getTrfCveTratfisc() != null && this.getTrfCveTratfisc().longValue() == -999) {
            conditions += " AND TRF_CVE_TRATFISC IS NULL";
        } else if (this.getTrfCveTratfisc() != null) {
            conditions += " AND TRF_CVE_TRATFISC = ?";
            values.add(this.getTrfCveTratfisc());
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
        String sql = "SELECT * FROM TRAT_FIDH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCrfNumFideicom() != null && this.getCrfNumFideicom().longValue() == -999) {
            conditions += " AND CRF_NUM_FIDEICOM IS NULL";
        } else if (this.getCrfNumFideicom() != null) {
            conditions += " AND CRF_NUM_FIDEICOM = ?";
            values.add(this.getCrfNumFideicom());
        }

        if (this.getTrfCveTratfisc() != null && this.getTrfCveTratfisc().longValue() == -999) {
            conditions += " AND TRF_CVE_TRATFISC IS NULL";
        } else if (this.getTrfCveTratfisc() != null) {
            conditions += " AND TRF_CVE_TRATFISC = ?";
            values.add(this.getTrfCveTratfisc());
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
        String sql = "UPDATE TRAT_FIDH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CRF_NUM_FIDEICOM = ?";
        pkValues.add(this.getCrfNumFideicom());
        conditions += " AND TRF_CVE_TRATFISC = ?";
        pkValues.add(this.getTrfCveTratfisc());
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
        String sql = "INSERT INTO TRAT_FIDH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CRF_NUM_FIDEICOM";
        fieldValues += ", ?";
        values.add(this.getCrfNumFideicom());

        fields += ", TRF_CVE_TRATFISC";
        fieldValues += ", ?";
        values.add(this.getTrfCveTratfisc());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TRAT_FIDH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CRF_NUM_FIDEICOM = ?";
        values.add(this.getCrfNumFideicom());
        conditions += " AND TRF_CVE_TRATFISC = ?";
        values.add(this.getTrfCveTratfisc());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        TratFidh instance = (TratFidh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCrfNumFideicom().equals(instance.getCrfNumFideicom()))
            equalObjects = false;
        if (equalObjects && !this.getTrfCveTratfisc().equals(instance.getTrfCveTratfisc()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        TratFidh result = new TratFidh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCrfNumFideicom((BigDecimal) objectData.getData("CRF_NUM_FIDEICOM"));
        result.setTrfCveTratfisc((BigDecimal) objectData.getData("TRF_CVE_TRATFISC"));

        return result;

    }

}
