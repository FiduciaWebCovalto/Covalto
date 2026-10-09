package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_SUBCUENTA_PK", columns = { "FSCT_ID_FIDEICOMISO", "FSCT_ID_SUB_CUENTA" }, sequences = { "MANUAL" })
public class FSubcuenta extends DomainObject {

    BigDecimal fsctIdFideicomiso = null;
    BigDecimal fsctIdSubCuenta = null;
    String fsctNombreSubCuenta = null;
    String fsctStatus = null;

    public FSubcuenta() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsctIdFideicomiso(BigDecimal fsctIdFideicomiso) {
        this.fsctIdFideicomiso = fsctIdFideicomiso;
    }

    public BigDecimal getFsctIdFideicomiso() {
        return this.fsctIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsctIdSubCuenta(BigDecimal fsctIdSubCuenta) {
        this.fsctIdSubCuenta = fsctIdSubCuenta;
    }

    public BigDecimal getFsctIdSubCuenta() {
        return this.fsctIdSubCuenta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFsctNombreSubCuenta(String fsctNombreSubCuenta) {
        this.fsctNombreSubCuenta = fsctNombreSubCuenta;
    }

    public String getFsctNombreSubCuenta() {
        return this.fsctNombreSubCuenta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFsctStatus(String fsctStatus) {
        this.fsctStatus = fsctStatus;
    }

    public String getFsctStatus() {
        return this.fsctStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_SUBCUENTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsctIdFideicomiso() != null && this.getFsctIdFideicomiso().longValue() == -999) {
            conditions += " AND FSCT_ID_FIDEICOMISO IS NULL";
        } else if (this.getFsctIdFideicomiso() != null) {
            conditions += " AND FSCT_ID_FIDEICOMISO = ?";
            values.add(this.getFsctIdFideicomiso());
        }

        if (this.getFsctIdSubCuenta() != null && this.getFsctIdSubCuenta().longValue() == -999) {
            conditions += " AND FSCT_ID_SUB_CUENTA IS NULL";
        } else if (this.getFsctIdSubCuenta() != null) {
            conditions += " AND FSCT_ID_SUB_CUENTA = ?";
            values.add(this.getFsctIdSubCuenta());
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
        String sql = "SELECT * FROM F_SUBCUENTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsctIdFideicomiso() != null && this.getFsctIdFideicomiso().longValue() == -999) {
            conditions += " AND FSCT_ID_FIDEICOMISO IS NULL";
        } else if (this.getFsctIdFideicomiso() != null) {
            conditions += " AND FSCT_ID_FIDEICOMISO = ?";
            values.add(this.getFsctIdFideicomiso());
        }

        if (this.getFsctIdSubCuenta() != null && this.getFsctIdSubCuenta().longValue() == -999) {
            conditions += " AND FSCT_ID_SUB_CUENTA IS NULL";
        } else if (this.getFsctIdSubCuenta() != null) {
            conditions += " AND FSCT_ID_SUB_CUENTA = ?";
            values.add(this.getFsctIdSubCuenta());
        }

        if (this.getFsctNombreSubCuenta() != null && "null".equals(this.getFsctNombreSubCuenta())) {
            conditions += " AND FSCT_NOMBRE_SUB_CUENTA IS NULL";
        } else if (this.getFsctNombreSubCuenta() != null) {
            conditions += " AND FSCT_NOMBRE_SUB_CUENTA = ?";
            values.add(this.getFsctNombreSubCuenta());
        }

        if (this.getFsctStatus() != null && "null".equals(this.getFsctStatus())) {
            conditions += " AND FSCT_STATUS IS NULL";
        } else if (this.getFsctStatus() != null) {
            conditions += " AND FSCT_STATUS = ?";
            values.add(this.getFsctStatus());
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
        String sql = "UPDATE F_SUBCUENTA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FSCT_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFsctIdFideicomiso());
        conditions += " AND FSCT_ID_SUB_CUENTA = ?";
        pkValues.add(this.getFsctIdSubCuenta());
        fields += " FSCT_NOMBRE_SUB_CUENTA = ?, ";
        values.add(this.getFsctNombreSubCuenta());
        fields += " FSCT_STATUS = ?, ";
        values.add(this.getFsctStatus());
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
        String sql = "INSERT INTO F_SUBCUENTA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FSCT_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFsctIdFideicomiso());

        fields += ", FSCT_ID_SUB_CUENTA";
        fieldValues += ", ?";
        values.add(this.getFsctIdSubCuenta());

        fields += ", FSCT_NOMBRE_SUB_CUENTA";
        fieldValues += ", ?";
        values.add(this.getFsctNombreSubCuenta());

        fields += ", FSCT_STATUS";
        fieldValues += ", ?";
        values.add(this.getFsctStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_SUBCUENTA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FSCT_ID_FIDEICOMISO = ?";
        values.add(this.getFsctIdFideicomiso());
        conditions += " AND FSCT_ID_SUB_CUENTA = ?";
        values.add(this.getFsctIdSubCuenta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FSubcuenta instance = (FSubcuenta) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFsctIdFideicomiso().equals(instance.getFsctIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFsctIdSubCuenta().equals(instance.getFsctIdSubCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFsctNombreSubCuenta().equals(instance.getFsctNombreSubCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFsctStatus().equals(instance.getFsctStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FSubcuenta result = new FSubcuenta();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFsctIdFideicomiso((BigDecimal) objectData.getData("FSCT_ID_FIDEICOMISO"));
        result.setFsctIdSubCuenta((BigDecimal) objectData.getData("FSCT_ID_SUB_CUENTA"));
        result.setFsctNombreSubCuenta((String) objectData.getData("FSCT_NOMBRE_SUB_CUENTA"));
        result.setFsctStatus((String) objectData.getData("FSCT_STATUS"));

        return result;

    }

}
