package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ERROR_CLAVE_PK", columns = { "ERC_ID_ERR_CVE" }, sequences = { "MAX" })
public class ErrorClave extends DomainObject {

    BigDecimal ercIdErrCve = null;
    String ercNombreClave = null;

    public ErrorClave() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setErcIdErrCve(BigDecimal ercIdErrCve) {
        this.ercIdErrCve = ercIdErrCve;
    }

    public BigDecimal getErcIdErrCve() {
        return this.ercIdErrCve;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setErcNombreClave(String ercNombreClave) {
        this.ercNombreClave = ercNombreClave;
    }

    public String getErcNombreClave() {
        return this.ercNombreClave;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ERROR_CLAVE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getErcIdErrCve() != null && this.getErcIdErrCve().longValue() == -999) {
            conditions += " AND ERC_ID_ERR_CVE IS NULL";
        } else if (this.getErcIdErrCve() != null) {
            conditions += " AND ERC_ID_ERR_CVE = ?";
            values.add(this.getErcIdErrCve());
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
        String sql = "SELECT * FROM ERROR_CLAVE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getErcIdErrCve() != null && this.getErcIdErrCve().longValue() == -999) {
            conditions += " AND ERC_ID_ERR_CVE IS NULL";
        } else if (this.getErcIdErrCve() != null) {
            conditions += " AND ERC_ID_ERR_CVE = ?";
            values.add(this.getErcIdErrCve());
        }

        if (this.getErcNombreClave() != null && "null".equals(this.getErcNombreClave())) {
            conditions += " AND ERC_NOMBRE_CLAVE IS NULL";
        } else if (this.getErcNombreClave() != null) {
            conditions += " AND ERC_NOMBRE_CLAVE = ?";
            values.add(this.getErcNombreClave());
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
        String sql = "UPDATE ERROR_CLAVE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ERC_ID_ERR_CVE = ?";
        pkValues.add(this.getErcIdErrCve());
        fields += " ERC_NOMBRE_CLAVE = ?, ";
        values.add(this.getErcNombreClave());
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
        String sql = "INSERT INTO ERROR_CLAVE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ERC_ID_ERR_CVE";
        fieldValues += ", ?";
        values.add(this.getErcIdErrCve());

        fields += ", ERC_NOMBRE_CLAVE";
        fieldValues += ", ?";
        values.add(this.getErcNombreClave());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ERROR_CLAVE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ERC_ID_ERR_CVE = ?";
        values.add(this.getErcIdErrCve());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ErrorClave instance = (ErrorClave) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getErcIdErrCve().equals(instance.getErcIdErrCve()))
            equalObjects = false;
        if (equalObjects && !this.getErcNombreClave().equals(instance.getErcNombreClave()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ErrorClave result = new ErrorClave();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setErcIdErrCve((BigDecimal) objectData.getData("ERC_ID_ERR_CVE"));
        result.setErcNombreClave((String) objectData.getData("ERC_NOMBRE_CLAVE"));

        return result;

    }

}
