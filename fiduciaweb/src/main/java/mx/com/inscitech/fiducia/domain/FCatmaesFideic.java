package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CATMAES_FIDEIC_PK", columns = { "FFID_ID_FIDEICOMISO", "FCMA_ID_PADRE", "FCMA_ID_SEC_CATMA" }, sequences = { "MANUAL" })
public class FCatmaesFideic extends DomainObject {

    BigDecimal fcmaIdPadre = null;
    BigDecimal fcmaIdSecCatma = null;
    BigDecimal ffidIdFideicomiso = null;

    public FCatmaesFideic() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcmaIdPadre(BigDecimal fcmaIdPadre) {
        this.fcmaIdPadre = fcmaIdPadre;
    }

    public BigDecimal getFcmaIdPadre() {
        return this.fcmaIdPadre;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcmaIdSecCatma(BigDecimal fcmaIdSecCatma) {
        this.fcmaIdSecCatma = fcmaIdSecCatma;
    }

    public BigDecimal getFcmaIdSecCatma() {
        return this.fcmaIdSecCatma;
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
        String sql = "SELECT * FROM F_CATMAES_FIDEIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcmaIdPadre() != null && this.getFcmaIdPadre().longValue() == -999) {
            conditions += " AND FCMA_ID_PADRE IS NULL";
        } else if (this.getFcmaIdPadre() != null) {
            conditions += " AND FCMA_ID_PADRE = ?";
            values.add(this.getFcmaIdPadre());
        }

        if (this.getFcmaIdSecCatma() != null && this.getFcmaIdSecCatma().longValue() == -999) {
            conditions += " AND FCMA_ID_SEC_CATMA IS NULL";
        } else if (this.getFcmaIdSecCatma() != null) {
            conditions += " AND FCMA_ID_SEC_CATMA = ?";
            values.add(this.getFcmaIdSecCatma());
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
        String sql = "SELECT * FROM F_CATMAES_FIDEIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcmaIdPadre() != null && this.getFcmaIdPadre().longValue() == -999) {
            conditions += " AND FCMA_ID_PADRE IS NULL";
        } else if (this.getFcmaIdPadre() != null) {
            conditions += " AND FCMA_ID_PADRE = ?";
            values.add(this.getFcmaIdPadre());
        }

        if (this.getFcmaIdSecCatma() != null && this.getFcmaIdSecCatma().longValue() == -999) {
            conditions += " AND FCMA_ID_SEC_CATMA IS NULL";
        } else if (this.getFcmaIdSecCatma() != null) {
            conditions += " AND FCMA_ID_SEC_CATMA = ?";
            values.add(this.getFcmaIdSecCatma());
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
        String sql = "UPDATE F_CATMAES_FIDEIC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCMA_ID_PADRE = ?";
        pkValues.add(this.getFcmaIdPadre());
        conditions += " AND FCMA_ID_SEC_CATMA = ?";
        pkValues.add(this.getFcmaIdSecCatma());
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
        String sql = "INSERT INTO F_CATMAES_FIDEIC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCMA_ID_PADRE";
        fieldValues += ", ?";
        values.add(this.getFcmaIdPadre());

        fields += ", FCMA_ID_SEC_CATMA";
        fieldValues += ", ?";
        values.add(this.getFcmaIdSecCatma());

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
        String sql = "DELETE FROM F_CATMAES_FIDEIC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCMA_ID_PADRE = ?";
        values.add(this.getFcmaIdPadre());
        conditions += " AND FCMA_ID_SEC_CATMA = ?";
        values.add(this.getFcmaIdSecCatma());
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
        FCatmaesFideic instance = (FCatmaesFideic) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcmaIdPadre().equals(instance.getFcmaIdPadre()))
            equalObjects = false;
        if (equalObjects && !this.getFcmaIdSecCatma().equals(instance.getFcmaIdSecCatma()))
            equalObjects = false;
        if (equalObjects && !this.getFfidIdFideicomiso().equals(instance.getFfidIdFideicomiso()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCatmaesFideic result = new FCatmaesFideic();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcmaIdPadre((BigDecimal) objectData.getData("FCMA_ID_PADRE"));
        result.setFcmaIdSecCatma((BigDecimal) objectData.getData("FCMA_ID_SEC_CATMA"));
        result.setFfidIdFideicomiso((BigDecimal) objectData.getData("FFID_ID_FIDEICOMISO"));

        return result;

    }

}
