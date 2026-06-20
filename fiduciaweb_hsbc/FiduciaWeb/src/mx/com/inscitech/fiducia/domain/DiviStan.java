package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DIVI_STAN_PK", columns = { "DVS_NUM_MONEDA", "DVS_CVE_NAFIN" }, sequences = { "MANUAL" })
public class DiviStan extends DomainObject {

    BigDecimal dvsNumMoneda = null;
    String dvsCveNafin = null;

    public DiviStan() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDvsNumMoneda(BigDecimal dvsNumMoneda) {
        this.dvsNumMoneda = dvsNumMoneda;
    }

    public BigDecimal getDvsNumMoneda() {
        return this.dvsNumMoneda;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setDvsCveNafin(String dvsCveNafin) {
        this.dvsCveNafin = dvsCveNafin;
    }

    public String getDvsCveNafin() {
        return this.dvsCveNafin;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DIVI_STAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDvsNumMoneda() != null && this.getDvsNumMoneda().longValue() == -999) {
            conditions += " AND DVS_NUM_MONEDA IS NULL";
        } else if (this.getDvsNumMoneda() != null) {
            conditions += " AND DVS_NUM_MONEDA = ?";
            values.add(this.getDvsNumMoneda());
        }

        if (this.getDvsCveNafin() != null && "null".equals(this.getDvsCveNafin())) {
            conditions += " AND DVS_CVE_NAFIN IS NULL";
        } else if (this.getDvsCveNafin() != null) {
            conditions += " AND DVS_CVE_NAFIN = ?";
            values.add(this.getDvsCveNafin());
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
        String sql = "SELECT * FROM DIVI_STAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDvsNumMoneda() != null && this.getDvsNumMoneda().longValue() == -999) {
            conditions += " AND DVS_NUM_MONEDA IS NULL";
        } else if (this.getDvsNumMoneda() != null) {
            conditions += " AND DVS_NUM_MONEDA = ?";
            values.add(this.getDvsNumMoneda());
        }

        if (this.getDvsCveNafin() != null && "null".equals(this.getDvsCveNafin())) {
            conditions += " AND DVS_CVE_NAFIN IS NULL";
        } else if (this.getDvsCveNafin() != null) {
            conditions += " AND DVS_CVE_NAFIN = ?";
            values.add(this.getDvsCveNafin());
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
        String sql = "UPDATE DIVI_STAN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DVS_NUM_MONEDA = ?";
        pkValues.add(this.getDvsNumMoneda());
        conditions += " AND DVS_CVE_NAFIN = ?";
        pkValues.add(this.getDvsCveNafin());
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
        String sql = "INSERT INTO DIVI_STAN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DVS_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getDvsNumMoneda());

        fields += ", DVS_CVE_NAFIN";
        fieldValues += ", ?";
        values.add(this.getDvsCveNafin());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DIVI_STAN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DVS_NUM_MONEDA = ?";
        values.add(this.getDvsNumMoneda());
        conditions += " AND DVS_CVE_NAFIN = ?";
        values.add(this.getDvsCveNafin());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        DiviStan instance = (DiviStan) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDvsNumMoneda().equals(instance.getDvsNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getDvsCveNafin().equals(instance.getDvsCveNafin()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        DiviStan result = new DiviStan();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDvsNumMoneda((BigDecimal) objectData.getData("DVS_NUM_MONEDA"));
        result.setDvsCveNafin((String) objectData.getData("DVS_CVE_NAFIN"));

        return result;

    }

}
