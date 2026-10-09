package mx.com.inscitech.fiducia.domain;


import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CIERRE_PK", columns = { "FCC_FECHA" }, sequences = { "MAX" })
public class FCierreConcilia extends DomainObject {

    String fccFecha = null;
    String fccCveStatus = null;

    public FCierreConcilia() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFccFecha(String fccFecha) {
        this.fccFecha = fccFecha;
    }

    public String getFccFecha() {
        return this.fccFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccCveStatus(String fccCveStatus) {
        this.fccCveStatus = fccCveStatus;
    }

    public String getFccCveStatus() {
        return this.fccCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CIERRE_CONCILIA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFccFecha() != null && "null".equals(this.getFccFecha())) {
            conditions += " AND FCC_FECHA IS NULL";
        } else if (this.getFccFecha() != null) {
            conditions += " AND FCC_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFccFecha());
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
        String sql = "SELECT * FROM F_CIERRE_CONCILIA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFccFecha() != null && "null".equals(this.getFccFecha())) {
            conditions += " AND FCC_FECHA IS NULL";
        } else if (this.getFccFecha() != null) {
            conditions += " AND FCC_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFccFecha());
        }

        if (this.getFccCveStatus() != null && "null".equals(this.getFccCveStatus())) {
            conditions += " AND FCC_CVE_STATUS IS NULL";
        } else if (this.getFccCveStatus() != null) {
            conditions += " AND FCC_CVE_STATUS = ?";
            values.add(this.getFccCveStatus());
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
        String sql = "UPDATE F_CIERRE_CONCILIA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCC_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getFccFecha());
        fields += " FCC_CVE_STATUS = ?, ";
        values.add(this.getFccCveStatus());
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
        String sql = "INSERT INTO F_CIERRE_CONCILIA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCC_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFccFecha());

        fields += ", FCC_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getFccCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CIERRE_CONCILIA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCC_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getFccFecha());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCierreConcilia instance = (FCierreConcilia) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFccFecha().equals(instance.getFccFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFccCveStatus().equals(instance.getFccCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCierreConcilia result = new FCierreConcilia();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFccFecha((String) objectData.getData("FCC_FECHA"));
        result.setFccCveStatus((String) objectData.getData("FCC_CVE_STATUS"));

        return result;

    }

}
