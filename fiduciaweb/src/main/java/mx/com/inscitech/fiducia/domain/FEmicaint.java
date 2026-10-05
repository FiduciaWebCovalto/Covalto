package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMICAINT_PK", columns = { "EECI_ID_PROGRAMA", "EECI_ID_FIDEICOMISO", "EECI_ID_EMISION", "EECI_ID_CAP_INTE" }, sequences = { "MANUAL" })
public class FEmicaint extends DomainObject {

    BigDecimal eeciIdPrograma = null;
    BigDecimal eeciIdFideicomiso = null;
    BigDecimal eeciIdEmision = null;
    BigDecimal eeciIdCapInte = null;
    BigDecimal eeciPjeCapInte = null;
    BigDecimal eeciImpCapInte = null;
    String eeciFecCapInte = null;
    String eeciStEmicaint = null;

    public FEmicaint() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeciIdPrograma(BigDecimal eeciIdPrograma) {
        this.eeciIdPrograma = eeciIdPrograma;
    }

    public BigDecimal getEeciIdPrograma() {
        return this.eeciIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeciIdFideicomiso(BigDecimal eeciIdFideicomiso) {
        this.eeciIdFideicomiso = eeciIdFideicomiso;
    }

    public BigDecimal getEeciIdFideicomiso() {
        return this.eeciIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeciIdEmision(BigDecimal eeciIdEmision) {
        this.eeciIdEmision = eeciIdEmision;
    }

    public BigDecimal getEeciIdEmision() {
        return this.eeciIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeciIdCapInte(BigDecimal eeciIdCapInte) {
        this.eeciIdCapInte = eeciIdCapInte;
    }

    public BigDecimal getEeciIdCapInte() {
        return this.eeciIdCapInte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeciPjeCapInte(BigDecimal eeciPjeCapInte) {
        this.eeciPjeCapInte = eeciPjeCapInte;
    }

    public BigDecimal getEeciPjeCapInte() {
        return this.eeciPjeCapInte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeciImpCapInte(BigDecimal eeciImpCapInte) {
        this.eeciImpCapInte = eeciImpCapInte;
    }

    public BigDecimal getEeciImpCapInte() {
        return this.eeciImpCapInte;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeciFecCapInte(String eeciFecCapInte) {
        this.eeciFecCapInte = eeciFecCapInte;
    }

    public String getEeciFecCapInte() {
        return this.eeciFecCapInte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeciStEmicaint(String eeciStEmicaint) {
        this.eeciStEmicaint = eeciStEmicaint;
    }

    public String getEeciStEmicaint() {
        return this.eeciStEmicaint;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMICAINT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeciIdPrograma() != null && this.getEeciIdPrograma().longValue() == -999) {
            conditions += " AND EECI_ID_PROGRAMA IS NULL";
        } else if (this.getEeciIdPrograma() != null) {
            conditions += " AND EECI_ID_PROGRAMA = ?";
            values.add(this.getEeciIdPrograma());
        }

        if (this.getEeciIdFideicomiso() != null && this.getEeciIdFideicomiso().longValue() == -999) {
            conditions += " AND EECI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeciIdFideicomiso() != null) {
            conditions += " AND EECI_ID_FIDEICOMISO = ?";
            values.add(this.getEeciIdFideicomiso());
        }

        if (this.getEeciIdEmision() != null && this.getEeciIdEmision().longValue() == -999) {
            conditions += " AND EECI_ID_EMISION IS NULL";
        } else if (this.getEeciIdEmision() != null) {
            conditions += " AND EECI_ID_EMISION = ?";
            values.add(this.getEeciIdEmision());
        }

        if (this.getEeciIdCapInte() != null && this.getEeciIdCapInte().longValue() == -999) {
            conditions += " AND EECI_ID_CAP_INTE IS NULL";
        } else if (this.getEeciIdCapInte() != null) {
            conditions += " AND EECI_ID_CAP_INTE = ?";
            values.add(this.getEeciIdCapInte());
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
        String sql = "SELECT * FROM F_EMICAINT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeciIdPrograma() != null && this.getEeciIdPrograma().longValue() == -999) {
            conditions += " AND EECI_ID_PROGRAMA IS NULL";
        } else if (this.getEeciIdPrograma() != null) {
            conditions += " AND EECI_ID_PROGRAMA = ?";
            values.add(this.getEeciIdPrograma());
        }

        if (this.getEeciIdFideicomiso() != null && this.getEeciIdFideicomiso().longValue() == -999) {
            conditions += " AND EECI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeciIdFideicomiso() != null) {
            conditions += " AND EECI_ID_FIDEICOMISO = ?";
            values.add(this.getEeciIdFideicomiso());
        }

        if (this.getEeciIdEmision() != null && this.getEeciIdEmision().longValue() == -999) {
            conditions += " AND EECI_ID_EMISION IS NULL";
        } else if (this.getEeciIdEmision() != null) {
            conditions += " AND EECI_ID_EMISION = ?";
            values.add(this.getEeciIdEmision());
        }

        if (this.getEeciIdCapInte() != null && this.getEeciIdCapInte().longValue() == -999) {
            conditions += " AND EECI_ID_CAP_INTE IS NULL";
        } else if (this.getEeciIdCapInte() != null) {
            conditions += " AND EECI_ID_CAP_INTE = ?";
            values.add(this.getEeciIdCapInte());
        }

        if (this.getEeciPjeCapInte() != null && this.getEeciPjeCapInte().longValue() == -999) {
            conditions += " AND EECI_PJE_CAP_INTE IS NULL";
        } else if (this.getEeciPjeCapInte() != null) {
            conditions += " AND EECI_PJE_CAP_INTE = ?";
            values.add(this.getEeciPjeCapInte());
        }

        if (this.getEeciImpCapInte() != null && this.getEeciImpCapInte().longValue() == -999) {
            conditions += " AND EECI_IMP_CAP_INTE IS NULL";
        } else if (this.getEeciImpCapInte() != null) {
            conditions += " AND EECI_IMP_CAP_INTE = ?";
            values.add(this.getEeciImpCapInte());
        }

        if (this.getEeciFecCapInte() != null && "null".equals(this.getEeciFecCapInte())) {
            conditions += " AND EECI_FEC_CAP_INTE IS NULL";
        } else if (this.getEeciFecCapInte() != null) {
            conditions += " AND EECI_FEC_CAP_INTE = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeciFecCapInte());
        }

        if (this.getEeciStEmicaint() != null && "null".equals(this.getEeciStEmicaint())) {
            conditions += " AND EECI_ST_EMICAINT IS NULL";
        } else if (this.getEeciStEmicaint() != null) {
            conditions += " AND EECI_ST_EMICAINT = ?";
            values.add(this.getEeciStEmicaint());
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
        String sql = "UPDATE F_EMICAINT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EECI_ID_PROGRAMA = ?";
        pkValues.add(this.getEeciIdPrograma());
        conditions += " AND EECI_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEeciIdFideicomiso());
        conditions += " AND EECI_ID_EMISION = ?";
        pkValues.add(this.getEeciIdEmision());
        conditions += " AND EECI_ID_CAP_INTE = ?";
        pkValues.add(this.getEeciIdCapInte());
        fields += " EECI_PJE_CAP_INTE = ?, ";
        values.add(this.getEeciPjeCapInte());
        fields += " EECI_IMP_CAP_INTE = ?, ";
        values.add(this.getEeciImpCapInte());
        fields += " EECI_FEC_CAP_INTE = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeciFecCapInte());
        fields += " EECI_ST_EMICAINT = ?, ";
        values.add(this.getEeciStEmicaint());
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
        String sql = "INSERT INTO F_EMICAINT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EECI_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEeciIdPrograma());

        fields += ", EECI_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEeciIdFideicomiso());

        fields += ", EECI_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEeciIdEmision());

        fields += ", EECI_ID_CAP_INTE";
        fieldValues += ", ?";
        values.add(this.getEeciIdCapInte());

        fields += ", EECI_PJE_CAP_INTE";
        fieldValues += ", ?";
        values.add(this.getEeciPjeCapInte());

        fields += ", EECI_IMP_CAP_INTE";
        fieldValues += ", ?";
        values.add(this.getEeciImpCapInte());

        fields += ", EECI_FEC_CAP_INTE";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeciFecCapInte());

        fields += ", EECI_ST_EMICAINT";
        fieldValues += ", ?";
        values.add(this.getEeciStEmicaint());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMICAINT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EECI_ID_PROGRAMA = ?";
        values.add(this.getEeciIdPrograma());
        conditions += " AND EECI_ID_FIDEICOMISO = ?";
        values.add(this.getEeciIdFideicomiso());
        conditions += " AND EECI_ID_EMISION = ?";
        values.add(this.getEeciIdEmision());
        conditions += " AND EECI_ID_CAP_INTE = ?";
        values.add(this.getEeciIdCapInte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmicaint instance = (FEmicaint) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEeciIdPrograma().equals(instance.getEeciIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEeciIdFideicomiso().equals(instance.getEeciIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEeciIdEmision().equals(instance.getEeciIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeciIdCapInte().equals(instance.getEeciIdCapInte()))
            equalObjects = false;
        if (equalObjects && !this.getEeciPjeCapInte().equals(instance.getEeciPjeCapInte()))
            equalObjects = false;
        if (equalObjects && !this.getEeciImpCapInte().equals(instance.getEeciImpCapInte()))
            equalObjects = false;
        if (equalObjects && !this.getEeciFecCapInte().equals(instance.getEeciFecCapInte()))
            equalObjects = false;
        if (equalObjects && !this.getEeciStEmicaint().equals(instance.getEeciStEmicaint()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmicaint result = new FEmicaint();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEeciIdPrograma((BigDecimal) objectData.getData("EECI_ID_PROGRAMA"));
        result.setEeciIdFideicomiso((BigDecimal) objectData.getData("EECI_ID_FIDEICOMISO"));
        result.setEeciIdEmision((BigDecimal) objectData.getData("EECI_ID_EMISION"));
        result.setEeciIdCapInte((BigDecimal) objectData.getData("EECI_ID_CAP_INTE"));
        result.setEeciPjeCapInte((BigDecimal) objectData.getData("EECI_PJE_CAP_INTE"));
        result.setEeciImpCapInte((BigDecimal) objectData.getData("EECI_IMP_CAP_INTE"));
        result.setEeciFecCapInte((String) objectData.getData("EECI_FEC_CAP_INTE"));
        result.setEeciStEmicaint((String) objectData.getData("EECI_ST_EMICAINT"));

        return result;

    }

}
