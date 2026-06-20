package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PUNTOREV_PK", columns = { "FPUR_ID_PUNTOREV" }, sequences = { "MAX" })
public class FPuntorev extends DomainObject {

    BigDecimal fpurIdPuntorev = null;
    String fpurDescripcion = null;
    String fpurStatus = null;

    public FPuntorev() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpurIdPuntorev(BigDecimal fpurIdPuntorev) {
        this.fpurIdPuntorev = fpurIdPuntorev;
    }

    public BigDecimal getFpurIdPuntorev() {
        return this.fpurIdPuntorev;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFpurDescripcion(String fpurDescripcion) {
        this.fpurDescripcion = fpurDescripcion;
    }

    public String getFpurDescripcion() {
        return this.fpurDescripcion;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFpurStatus(String fpurStatus) {
        this.fpurStatus = fpurStatus;
    }

    public String getFpurStatus() {
        return this.fpurStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PUNTOREV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFpurIdPuntorev() != null && this.getFpurIdPuntorev().longValue() == -999) {
            conditions += " AND FPUR_ID_PUNTOREV IS NULL";
        } else if (this.getFpurIdPuntorev() != null) {
            conditions += " AND FPUR_ID_PUNTOREV = ?";
            values.add(this.getFpurIdPuntorev());
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
        String sql = "SELECT * FROM F_PUNTOREV ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFpurIdPuntorev() != null && this.getFpurIdPuntorev().longValue() == -999) {
            conditions += " AND FPUR_ID_PUNTOREV IS NULL";
        } else if (this.getFpurIdPuntorev() != null) {
            conditions += " AND FPUR_ID_PUNTOREV = ?";
            values.add(this.getFpurIdPuntorev());
        }

        if (this.getFpurDescripcion() != null && "null".equals(this.getFpurDescripcion())) {
            conditions += " AND FPUR_DESCRIPCION IS NULL";
        } else if (this.getFpurDescripcion() != null) {
            conditions += " AND FPUR_DESCRIPCION = ?";
            values.add(this.getFpurDescripcion());
        }

        if (this.getFpurStatus() != null && "null".equals(this.getFpurStatus())) {
            conditions += " AND FPUR_STATUS IS NULL";
        } else if (this.getFpurStatus() != null) {
            conditions += " AND FPUR_STATUS = ?";
            values.add(this.getFpurStatus());
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
        String sql = "UPDATE F_PUNTOREV SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FPUR_ID_PUNTOREV = ?";
        pkValues.add(this.getFpurIdPuntorev());
        fields += " FPUR_DESCRIPCION = ?, ";
        values.add(this.getFpurDescripcion());
        fields += " FPUR_STATUS = ?, ";
        values.add(this.getFpurStatus());
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
        String sql = "INSERT INTO F_PUNTOREV ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPUR_ID_PUNTOREV";
        fieldValues += ", ?";
        values.add(this.getFpurIdPuntorev());

        fields += ", FPUR_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getFpurDescripcion());

        fields += ", FPUR_STATUS";
        fieldValues += ", ?";
        values.add(this.getFpurStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PUNTOREV WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FPUR_ID_PUNTOREV = ?";
        values.add(this.getFpurIdPuntorev());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FPuntorev instance = (FPuntorev) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFpurIdPuntorev().equals(instance.getFpurIdPuntorev()))
            equalObjects = false;
        if (equalObjects && !this.getFpurDescripcion().equals(instance.getFpurDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getFpurStatus().equals(instance.getFpurStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FPuntorev result = new FPuntorev();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFpurIdPuntorev((BigDecimal) objectData.getData("FPUR_ID_PUNTOREV"));
        result.setFpurDescripcion((String) objectData.getData("FPUR_DESCRIPCION"));
        result.setFpurStatus((String) objectData.getData("FPUR_STATUS"));

        return result;

    }

}
