package mx.com.inscitech.fiducia.domain;


import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_NIC_PK", columns = { "REPC_ID_NIC" }, sequences = { "MAX" })
public class FNic extends DomainObject {

    String repcIdNic = null;
    String repcStNic = null;

    public FNic() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepcIdNic(String repcIdNic) {
        this.repcIdNic = repcIdNic;
    }

    public String getRepcIdNic() {
        return this.repcIdNic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepcStNic(String repcStNic) {
        this.repcStNic = repcStNic;
    }

    public String getRepcStNic() {
        return this.repcStNic;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_NIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRepcIdNic() != null && "null".equals(this.getRepcIdNic())) {
            conditions += " AND REPC_ID_NIC IS NULL";
        } else if (this.getRepcIdNic() != null) {
            conditions += " AND REPC_ID_NIC = ?";
            values.add(this.getRepcIdNic());
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
        String sql = "SELECT * FROM F_NIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRepcIdNic() != null && "null".equals(this.getRepcIdNic())) {
            conditions += " AND REPC_ID_NIC IS NULL";
        } else if (this.getRepcIdNic() != null) {
            conditions += " AND REPC_ID_NIC = ?";
            values.add(this.getRepcIdNic());
        }

        if (this.getRepcStNic() != null && "null".equals(this.getRepcStNic())) {
            conditions += " AND REPC_ST_NIC IS NULL";
        } else if (this.getRepcStNic() != null) {
            conditions += " AND REPC_ST_NIC = ?";
            values.add(this.getRepcStNic());
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
        String sql = "UPDATE F_NIC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REPC_ID_NIC = ?";
        pkValues.add(this.getRepcIdNic());
        fields += " REPC_ST_NIC = ?, ";
        values.add(this.getRepcStNic());
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
        String sql = "INSERT INTO F_NIC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REPC_ID_NIC";
        fieldValues += ", ?";
        values.add(this.getRepcIdNic());

        fields += ", REPC_ST_NIC";
        fieldValues += ", ?";
        values.add(this.getRepcStNic());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_NIC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REPC_ID_NIC = ?";
        values.add(this.getRepcIdNic());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FNic instance = (FNic) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRepcIdNic().equals(instance.getRepcIdNic()))
            equalObjects = false;
        if (equalObjects && !this.getRepcStNic().equals(instance.getRepcStNic()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FNic result = new FNic();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRepcIdNic((String) objectData.getData("REPC_ID_NIC"));
        result.setRepcStNic((String) objectData.getData("REPC_ST_NIC"));

        return result;

    }

}
