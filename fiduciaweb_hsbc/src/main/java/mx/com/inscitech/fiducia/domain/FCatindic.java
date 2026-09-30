package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CATINDIC_PK", columns = { "ECIN_ID_INDICE" }, sequences = { "MAX" })
public class FCatindic extends DomainObject {

    BigDecimal ecinIdIndice = null;
    String ecinDescripcion = null;
    String ecinFormaEmp = null;
    String ecinStCatindic = null;

    public FCatindic() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcinIdIndice(BigDecimal ecinIdIndice) {
        this.ecinIdIndice = ecinIdIndice;
    }

    public BigDecimal getEcinIdIndice() {
        return this.ecinIdIndice;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcinDescripcion(String ecinDescripcion) {
        this.ecinDescripcion = ecinDescripcion;
    }

    public String getEcinDescripcion() {
        return this.ecinDescripcion;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcinFormaEmp(String ecinFormaEmp) {
        this.ecinFormaEmp = ecinFormaEmp;
    }

    public String getEcinFormaEmp() {
        return this.ecinFormaEmp;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcinStCatindic(String ecinStCatindic) {
        this.ecinStCatindic = ecinStCatindic;
    }

    public String getEcinStCatindic() {
        return this.ecinStCatindic;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CATINDIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcinIdIndice() != null && this.getEcinIdIndice().longValue() == -999) {
            conditions += " AND ECIN_ID_INDICE IS NULL";
        } else if (this.getEcinIdIndice() != null) {
            conditions += " AND ECIN_ID_INDICE = ?";
            values.add(this.getEcinIdIndice());
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
        String sql = "SELECT * FROM F_CATINDIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcinIdIndice() != null && this.getEcinIdIndice().longValue() == -999) {
            conditions += " AND ECIN_ID_INDICE IS NULL";
        } else if (this.getEcinIdIndice() != null) {
            conditions += " AND ECIN_ID_INDICE = ?";
            values.add(this.getEcinIdIndice());
        }

        if (this.getEcinDescripcion() != null && "null".equals(this.getEcinDescripcion())) {
            conditions += " AND ECIN_DESCRIPCION IS NULL";
        } else if (this.getEcinDescripcion() != null) {
            conditions += " AND ECIN_DESCRIPCION = ?";
            values.add(this.getEcinDescripcion());
        }

        if (this.getEcinFormaEmp() != null && "null".equals(this.getEcinFormaEmp())) {
            conditions += " AND ECIN_FORMA_EMP IS NULL";
        } else if (this.getEcinFormaEmp() != null) {
            conditions += " AND ECIN_FORMA_EMP = ?";
            values.add(this.getEcinFormaEmp());
        }

        if (this.getEcinStCatindic() != null && "null".equals(this.getEcinStCatindic())) {
            conditions += " AND ECIN_ST_CATINDIC IS NULL";
        } else if (this.getEcinStCatindic() != null) {
            conditions += " AND ECIN_ST_CATINDIC = ?";
            values.add(this.getEcinStCatindic());
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
        String sql = "UPDATE F_CATINDIC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ECIN_ID_INDICE = ?";
        pkValues.add(this.getEcinIdIndice());
        fields += " ECIN_DESCRIPCION = ?, ";
        values.add(this.getEcinDescripcion());
        fields += " ECIN_FORMA_EMP = ?, ";
        values.add(this.getEcinFormaEmp());
        fields += " ECIN_ST_CATINDIC = ?, ";
        values.add(this.getEcinStCatindic());
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
        String sql = "INSERT INTO F_CATINDIC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ECIN_ID_INDICE";
        fieldValues += ", ?";
        values.add(this.getEcinIdIndice());

        fields += ", ECIN_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getEcinDescripcion());

        fields += ", ECIN_FORMA_EMP";
        fieldValues += ", ?";
        values.add(this.getEcinFormaEmp());

        fields += ", ECIN_ST_CATINDIC";
        fieldValues += ", ?";
        values.add(this.getEcinStCatindic());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CATINDIC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ECIN_ID_INDICE = ?";
        values.add(this.getEcinIdIndice());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCatindic instance = (FCatindic) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEcinIdIndice().equals(instance.getEcinIdIndice()))
            equalObjects = false;
        if (equalObjects && !this.getEcinDescripcion().equals(instance.getEcinDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getEcinFormaEmp().equals(instance.getEcinFormaEmp()))
            equalObjects = false;
        if (equalObjects && !this.getEcinStCatindic().equals(instance.getEcinStCatindic()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCatindic result = new FCatindic();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEcinIdIndice((BigDecimal) objectData.getData("ECIN_ID_INDICE"));
        result.setEcinDescripcion((String) objectData.getData("ECIN_DESCRIPCION"));
        result.setEcinFormaEmp((String) objectData.getData("ECIN_FORMA_EMP"));
        result.setEcinStCatindic((String) objectData.getData("ECIN_ST_CATINDIC"));

        return result;

    }

}
