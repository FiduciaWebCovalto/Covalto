package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FEmiFideicomiso extends DomainObject {

    BigDecimal femiNumFideicomiso = null;
    String femiNomFideicomiso = null;
    String femiPizarra = null;
    String femiSerie = null;
    BigDecimal femiCupon = null;

    public FEmiFideicomiso() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFemiNumFideicomiso(BigDecimal femiNumFideicomiso) {
        this.femiNumFideicomiso = femiNumFideicomiso;
    }

    public BigDecimal getFemiNumFideicomiso() {
        return this.femiNumFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFemiNomFideicomiso(String femiNomFideicomiso) {
        this.femiNomFideicomiso = femiNomFideicomiso;
    }

    public String getFemiNomFideicomiso() {
        return this.femiNomFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFemiPizarra(String femiPizarra) {
        this.femiPizarra = femiPizarra;
    }

    public String getFemiPizarra() {
        return this.femiPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFemiSerie(String femiSerie) {
        this.femiSerie = femiSerie;
    }

    public String getFemiSerie() {
        return this.femiSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFemiCupon(BigDecimal femiCupon) {
        this.femiCupon = femiCupon;
    }

    public BigDecimal getFemiCupon() {
        return this.femiCupon;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMI_FIDEICOMISO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFemiNumFideicomiso() != null && this.getFemiNumFideicomiso().longValue() == -999) {
            conditions += " AND FEMI_NUM_FIDEICOMISO IS NULL";
        } else if (this.getFemiNumFideicomiso() != null) {
            conditions += " AND FEMI_NUM_FIDEICOMISO = ?";
            values.add(this.getFemiNumFideicomiso());
        }

        if (this.getFemiNomFideicomiso() != null && "null".equals(this.getFemiNomFideicomiso())) {
            conditions += " AND FEMI_NOM_FIDEICOMISO IS NULL";
        } else if (this.getFemiNomFideicomiso() != null) {
            conditions += " AND FEMI_NOM_FIDEICOMISO = ?";
            values.add(this.getFemiNomFideicomiso());
        }

        if (this.getFemiPizarra() != null && "null".equals(this.getFemiPizarra())) {
            conditions += " AND FEMI_PIZARRA IS NULL";
        } else if (this.getFemiPizarra() != null) {
            conditions += " AND FEMI_PIZARRA = ?";
            values.add(this.getFemiPizarra());
        }

        if (this.getFemiSerie() != null && "null".equals(this.getFemiSerie())) {
            conditions += " AND FEMI_SERIE IS NULL";
        } else if (this.getFemiSerie() != null) {
            conditions += " AND FEMI_SERIE = ?";
            values.add(this.getFemiSerie());
        }

        if (this.getFemiCupon() != null && this.getFemiCupon().longValue() == -999) {
            conditions += " AND FEMI_CUPON IS NULL";
        } else if (this.getFemiCupon() != null) {
            conditions += " AND FEMI_CUPON = ?";
            values.add(this.getFemiCupon());
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
        String sql = "SELECT * FROM F_EMI_FIDEICOMISO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFemiNumFideicomiso() != null && this.getFemiNumFideicomiso().longValue() == -999) {
            conditions += " AND FEMI_NUM_FIDEICOMISO IS NULL";
        } else if (this.getFemiNumFideicomiso() != null) {
            conditions += " AND FEMI_NUM_FIDEICOMISO = ?";
            values.add(this.getFemiNumFideicomiso());
        }

        if (this.getFemiNomFideicomiso() != null && "null".equals(this.getFemiNomFideicomiso())) {
            conditions += " AND FEMI_NOM_FIDEICOMISO IS NULL";
        } else if (this.getFemiNomFideicomiso() != null) {
            conditions += " AND FEMI_NOM_FIDEICOMISO = ?";
            values.add(this.getFemiNomFideicomiso());
        }

        if (this.getFemiPizarra() != null && "null".equals(this.getFemiPizarra())) {
            conditions += " AND FEMI_PIZARRA IS NULL";
        } else if (this.getFemiPizarra() != null) {
            conditions += " AND FEMI_PIZARRA = ?";
            values.add(this.getFemiPizarra());
        }

        if (this.getFemiSerie() != null && "null".equals(this.getFemiSerie())) {
            conditions += " AND FEMI_SERIE IS NULL";
        } else if (this.getFemiSerie() != null) {
            conditions += " AND FEMI_SERIE = ?";
            values.add(this.getFemiSerie());
        }

        if (this.getFemiCupon() != null && this.getFemiCupon().longValue() == -999) {
            conditions += " AND FEMI_CUPON IS NULL";
        } else if (this.getFemiCupon() != null) {
            conditions += " AND FEMI_CUPON = ?";
            values.add(this.getFemiCupon());
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
        String sql = "UPDATE F_EMI_FIDEICOMISO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FEMI_NUM_FIDEICOMISO = ?";
        pkValues.add(this.getFemiNumFideicomiso());
        conditions += " AND FEMI_PIZARRA = ?";
        pkValues.add(this.getFemiPizarra());
        conditions += " AND FEMI_SERIE = ?";
        pkValues.add(this.getFemiSerie());
        conditions += " AND FEMI_CUPON = ?";
        pkValues.add(this.getFemiCupon());

        fields += " FEMI_NUM_FIDEICOMISO = ?, ";
        values.add(this.getFemiNumFideicomiso());
        fields += " FEMI_NOM_FIDEICOMISO = ?, ";
        values.add(this.getFemiNomFideicomiso());
        fields += " FEMI_PIZARRA = ?, ";
        values.add(this.getFemiPizarra());
        fields += " FEMI_SERIE = ?, ";
        values.add(this.getFemiSerie());
        fields += " FEMI_CUPON = ?, ";
        values.add(this.getFemiCupon());
        for (int i = 0; i < pkValues.size(); i++) {
            values.add(pkValues.get(i));
        }
        ;

        fields = fields.substring(0, fields.length() - 2).trim();
        conditions = conditions.substring(3).trim();
        sql += fields + " WHERE " + conditions;
        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getInsert() {
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO F_EMI_FIDEICOMISO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FEMI_NUM_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFemiNumFideicomiso());

        fields += ", FEMI_NOM_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFemiNomFideicomiso());

        fields += ", FEMI_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getFemiPizarra());

        fields += ", FEMI_SERIE";
        fieldValues += ", ?";
        values.add(this.getFemiSerie());

        fields += ", FEMI_CUPON";
        fieldValues += ", ?";
        values.add(this.getFemiCupon());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMI_FIDEICOMISO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FEMI_NUM_FIDEICOMISO = ?";
        values.add(this.getFemiNumFideicomiso());
        conditions += " AND FEMI_PIZARRA = ?";
        values.add(this.getFemiPizarra());
        conditions += " AND FEMI_SERIE = ?";
        values.add(this.getFemiSerie());
        conditions += " AND FEMI_CUPON = ?";
        values.add(this.getFemiCupon());
        conditions = conditions.substring(3).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmiFideicomiso instance = (FEmiFideicomiso) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFemiNumFideicomiso().equals(instance.getFemiNumFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFemiNomFideicomiso().equals(instance.getFemiNomFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFemiPizarra().equals(instance.getFemiPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getFemiSerie().equals(instance.getFemiSerie()))
            equalObjects = false;
        if (equalObjects && !this.getFemiCupon().equals(instance.getFemiCupon()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmiFideicomiso result = new FEmiFideicomiso();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFemiNumFideicomiso((BigDecimal) objectData.getData("FEMI_NUM_FIDEICOMISO"));
        result.setFemiNomFideicomiso((String) objectData.getData("FEMI_NOM_FIDEICOMISO"));
        result.setFemiPizarra((String) objectData.getData("FEMI_PIZARRA"));
        result.setFemiSerie((String) objectData.getData("FEMI_SERIE"));
        result.setFemiCupon((BigDecimal) objectData.getData("FEMI_CUPON"));

        return result;

    }

}
