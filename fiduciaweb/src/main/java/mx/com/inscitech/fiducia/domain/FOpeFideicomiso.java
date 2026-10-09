package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FOpeFideicomiso extends DomainObject {

    BigDecimal opfIdFideicomiso = null;
    String opfIdOperacion = null;
    String opfStatus = null;

    public FOpeFideicomiso() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOpfIdFideicomiso(BigDecimal opfIdFideicomiso) {
        this.opfIdFideicomiso = opfIdFideicomiso;
    }

    public BigDecimal getOpfIdFideicomiso() {
        return this.opfIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOpfIdOperacion(String opfIdOperacion) {
        this.opfIdOperacion = opfIdOperacion;
    }

    public String getOpfIdOperacion() {
        return this.opfIdOperacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOpfStatus(String opfStatus) {
        this.opfStatus = opfStatus;
    }

    public String getOpfStatus() {
        return this.opfStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_OPE_FIDEICOMISO ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM F_OPE_FIDEICOMISO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOpfIdFideicomiso() != null && this.getOpfIdFideicomiso().longValue() == -999) {
            conditions += " AND OPF_ID_FIDEICOMISO IS NULL";
        } else if (this.getOpfIdFideicomiso() != null) {
            conditions += " AND OPF_ID_FIDEICOMISO = ?";
            values.add(this.getOpfIdFideicomiso());
        }

        if (this.getOpfIdOperacion() != null && "null".equals(this.getOpfIdOperacion())) {
            conditions += " AND OPF_ID_OPERACION IS NULL";
        } else if (this.getOpfIdOperacion() != null) {
            conditions += " AND OPF_ID_OPERACION = ?";
            values.add(this.getOpfIdOperacion());
        }

        if (this.getOpfStatus() != null && "null".equals(this.getOpfStatus())) {
            conditions += " AND OPF_STATUS IS NULL";
        } else if (this.getOpfStatus() != null) {
            conditions += " AND OPF_STATUS = ?";
            values.add(this.getOpfStatus());
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
        String sql = "UPDATE F_OPE_FIDEICOMISO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " OPF_ID_FIDEICOMISO = ?, ";
        values.add(this.getOpfIdFideicomiso());
        fields += " OPF_ID_OPERACION = ?, ";
        values.add(this.getOpfIdOperacion());
        fields += " OPF_STATUS = ?, ";
        values.add(this.getOpfStatus());
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
        String sql = "INSERT INTO F_OPE_FIDEICOMISO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", OPF_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getOpfIdFideicomiso());

        fields += ", OPF_ID_OPERACION";
        fieldValues += ", ?";
        values.add(this.getOpfIdOperacion());

        fields += ", OPF_STATUS";
        fieldValues += ", ?";
        values.add(this.getOpfStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_OPE_FIDEICOMISO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FOpeFideicomiso instance = (FOpeFideicomiso) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getOpfIdFideicomiso().equals(instance.getOpfIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getOpfIdOperacion().equals(instance.getOpfIdOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getOpfStatus().equals(instance.getOpfStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FOpeFideicomiso result = new FOpeFideicomiso();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setOpfIdFideicomiso((BigDecimal) objectData.getData("OPF_ID_FIDEICOMISO"));
        result.setOpfIdOperacion((String) objectData.getData("OPF_ID_OPERACION"));
        result.setOpfStatus((String) objectData.getData("OPF_STATUS"));

        return result;

    }

}
