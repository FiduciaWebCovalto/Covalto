package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_DOCUMENTO_PK", columns = { "FDOC_ID_DOCUMENTO" }, sequences = { "MAX" })
public class FDocumento extends DomainObject {

    BigDecimal fdocIdDocumento = null;
    String fdocNombre = null;
    String fdocStatus = null;

    public FDocumento() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFdocIdDocumento(BigDecimal fdocIdDocumento) {
        this.fdocIdDocumento = fdocIdDocumento;
    }

    public BigDecimal getFdocIdDocumento() {
        return this.fdocIdDocumento;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdocNombre(String fdocNombre) {
        this.fdocNombre = fdocNombre;
    }

    public String getFdocNombre() {
        return this.fdocNombre;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFdocStatus(String fdocStatus) {
        this.fdocStatus = fdocStatus;
    }

    public String getFdocStatus() {
        return this.fdocStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_DOCUMENTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFdocIdDocumento() != null && this.getFdocIdDocumento().longValue() == -999) {
            conditions += " AND FDOC_ID_DOCUMENTO IS NULL";
        } else if (this.getFdocIdDocumento() != null) {
            conditions += " AND FDOC_ID_DOCUMENTO = ?";
            values.add(this.getFdocIdDocumento());
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
        String sql = "SELECT * FROM F_DOCUMENTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFdocIdDocumento() != null && this.getFdocIdDocumento().longValue() == -999) {
            conditions += " AND FDOC_ID_DOCUMENTO IS NULL";
        } else if (this.getFdocIdDocumento() != null) {
            conditions += " AND FDOC_ID_DOCUMENTO = ?";
            values.add(this.getFdocIdDocumento());
        }

        if (this.getFdocNombre() != null && "null".equals(this.getFdocNombre())) {
            conditions += " AND FDOC_NOMBRE IS NULL";
        } else if (this.getFdocNombre() != null) {
            conditions += " AND FDOC_NOMBRE = ?";
            values.add(this.getFdocNombre());
        }

        if (this.getFdocStatus() != null && "null".equals(this.getFdocStatus())) {
            conditions += " AND FDOC_STATUS IS NULL";
        } else if (this.getFdocStatus() != null) {
            conditions += " AND FDOC_STATUS = ?";
            values.add(this.getFdocStatus());
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
        String sql = "UPDATE F_DOCUMENTO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FDOC_ID_DOCUMENTO = ?";
        pkValues.add(this.getFdocIdDocumento());
        fields += " FDOC_NOMBRE = ?, ";
        values.add(this.getFdocNombre());
        fields += " FDOC_STATUS = ?, ";
        values.add(this.getFdocStatus());
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
        String sql = "INSERT INTO F_DOCUMENTO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FDOC_ID_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getFdocIdDocumento());

        fields += ", FDOC_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getFdocNombre());

        fields += ", FDOC_STATUS";
        fieldValues += ", ?";
        values.add(this.getFdocStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_DOCUMENTO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FDOC_ID_DOCUMENTO = ?";
        values.add(this.getFdocIdDocumento());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FDocumento instance = (FDocumento) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFdocIdDocumento().equals(instance.getFdocIdDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getFdocNombre().equals(instance.getFdocNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFdocStatus().equals(instance.getFdocStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FDocumento result = new FDocumento();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFdocIdDocumento((BigDecimal) objectData.getData("FDOC_ID_DOCUMENTO"));
        result.setFdocNombre((String) objectData.getData("FDOC_NOMBRE"));
        result.setFdocStatus((String) objectData.getData("FDOC_STATUS"));

        return result;

    }

}
