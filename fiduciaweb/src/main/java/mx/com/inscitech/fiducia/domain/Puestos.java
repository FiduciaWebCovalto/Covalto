package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PUESTOS_PK", columns = { "PUE_NUM_PUESTO" }, sequences = { "MAX" })
public class Puestos extends DomainObject {

    BigDecimal pueNumPuesto = null;
    String pueNomPuesto = null;

    public Puestos() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPueNumPuesto(BigDecimal pueNumPuesto) {
        this.pueNumPuesto = pueNumPuesto;
    }

    public BigDecimal getPueNumPuesto() {
        return this.pueNumPuesto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPueNomPuesto(String pueNomPuesto) {
        this.pueNomPuesto = pueNomPuesto;
    }

    public String getPueNomPuesto() {
        return this.pueNomPuesto;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PUESTOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPueNumPuesto() != null && this.getPueNumPuesto().longValue() == -999) {
            conditions += " AND PUE_NUM_PUESTO IS NULL";
        } else if (this.getPueNumPuesto() != null) {
            conditions += " AND PUE_NUM_PUESTO = ?";
            values.add(this.getPueNumPuesto());
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
        String sql = "SELECT * FROM PUESTOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPueNumPuesto() != null && this.getPueNumPuesto().longValue() == -999) {
            conditions += " AND PUE_NUM_PUESTO IS NULL";
        } else if (this.getPueNumPuesto() != null) {
            conditions += " AND PUE_NUM_PUESTO = ?";
            values.add(this.getPueNumPuesto());
        }

        if (this.getPueNomPuesto() != null && "null".equals(this.getPueNomPuesto())) {
            conditions += " AND PUE_NOM_PUESTO IS NULL";
        } else if (this.getPueNomPuesto() != null) {
            conditions += " AND PUE_NOM_PUESTO = ?";
            values.add(this.getPueNomPuesto());
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
        String sql = "UPDATE PUESTOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PUE_NUM_PUESTO = ?";
        pkValues.add(this.getPueNumPuesto());
        fields += " PUE_NOM_PUESTO = ?, ";
        values.add(this.getPueNomPuesto());
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
        String sql = "INSERT INTO PUESTOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PUE_NUM_PUESTO";
        fieldValues += ", ?";
        values.add(this.getPueNumPuesto());

        fields += ", PUE_NOM_PUESTO";
        fieldValues += ", ?";
        values.add(this.getPueNomPuesto());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PUESTOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PUE_NUM_PUESTO = ?";
        values.add(this.getPueNumPuesto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Puestos instance = (Puestos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPueNumPuesto().equals(instance.getPueNumPuesto()))
            equalObjects = false;
        if (equalObjects && !this.getPueNomPuesto().equals(instance.getPueNomPuesto()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Puestos result = new Puestos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPueNumPuesto((BigDecimal) objectData.getData("PUE_NUM_PUESTO"));
        result.setPueNomPuesto((String) objectData.getData("PUE_NOM_PUESTO"));

        return result;

    }

}
