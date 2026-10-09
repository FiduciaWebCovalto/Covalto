package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_FIDEICO_CUEBAN_PK", columns = { "FFID_ID_FIDEICOMISO", "FCBA_CLABE_CBA" }, sequences = { "MANUAL" })
public class FFideicoCueban extends DomainObject {

    String fcbaClabeCba = null;
    String ffcbStatus = null;
    BigDecimal ffidIdFideicomiso = null;

    public FFideicoCueban() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcbaClabeCba(String fcbaClabeCba) {
        this.fcbaClabeCba = fcbaClabeCba;
    }

    public String getFcbaClabeCba() {
        return this.fcbaClabeCba;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFfcbStatus(String ffcbStatus) {
        this.ffcbStatus = ffcbStatus;
    }

    public String getFfcbStatus() {
        return this.ffcbStatus;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfidIdFideicomiso(BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return this.ffidIdFideicomiso;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_FIDEICO_CUEBAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcbaClabeCba() != null && "null".equals(this.getFcbaClabeCba())) {
            conditions += " AND FCBA_CLABE_CBA IS NULL";
        } else if (this.getFcbaClabeCba() != null) {
            conditions += " AND FCBA_CLABE_CBA = ?";
            values.add(this.getFcbaClabeCba());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
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
        String sql = "SELECT * FROM F_FIDEICO_CUEBAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcbaClabeCba() != null && "null".equals(this.getFcbaClabeCba())) {
            conditions += " AND FCBA_CLABE_CBA IS NULL";
        } else if (this.getFcbaClabeCba() != null) {
            conditions += " AND FCBA_CLABE_CBA = ?";
            values.add(this.getFcbaClabeCba());
        }

        if (this.getFfcbStatus() != null && "null".equals(this.getFfcbStatus())) {
            conditions += " AND FFCB_STATUS IS NULL";
        } else if (this.getFfcbStatus() != null) {
            conditions += " AND FFCB_STATUS = ?";
            values.add(this.getFfcbStatus());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
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
        String sql = "UPDATE F_FIDEICO_CUEBAN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCBA_CLABE_CBA = ?";
        pkValues.add(this.getFcbaClabeCba());
        fields += " FFCB_STATUS = ?, ";
        values.add(this.getFfcbStatus());
        conditions += " AND FFID_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFfidIdFideicomiso());
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
        String sql = "INSERT INTO F_FIDEICO_CUEBAN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCBA_CLABE_CBA";
        fieldValues += ", ?";
        values.add(this.getFcbaClabeCba());

        fields += ", FFCB_STATUS";
        fieldValues += ", ?";
        values.add(this.getFfcbStatus());

        fields += ", FFID_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFfidIdFideicomiso());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_FIDEICO_CUEBAN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCBA_CLABE_CBA = ?";
        values.add(this.getFcbaClabeCba());
        conditions += " AND FFID_ID_FIDEICOMISO = ?";
        values.add(this.getFfidIdFideicomiso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FFideicoCueban instance = (FFideicoCueban) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcbaClabeCba().equals(instance.getFcbaClabeCba()))
            equalObjects = false;
        if (equalObjects && !this.getFfcbStatus().equals(instance.getFfcbStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFfidIdFideicomiso().equals(instance.getFfidIdFideicomiso()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FFideicoCueban result = new FFideicoCueban();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcbaClabeCba((String) objectData.getData("FCBA_CLABE_CBA"));
        result.setFfcbStatus((String) objectData.getData("FFCB_STATUS"));
        result.setFfidIdFideicomiso((BigDecimal) objectData.getData("FFID_ID_FIDEICOMISO"));

        return result;

    }

}
