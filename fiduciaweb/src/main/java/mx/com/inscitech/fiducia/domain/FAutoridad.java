package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_AUTORIDAD_PK", columns = { "EAUT_ID_AUTORIDAD" }, sequences = { "MAX" })
public class FAutoridad extends DomainObject {

    BigDecimal eautIdAutoridad = null;
    String eautNomAutoridad = null;
    String eautNmoAutoridad = null;
    String eautDirAutoridad = null;
    String eautStAutoridad = null;

    public FAutoridad() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEautIdAutoridad(BigDecimal eautIdAutoridad) {
        this.eautIdAutoridad = eautIdAutoridad;
    }

    public BigDecimal getEautIdAutoridad() {
        return this.eautIdAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEautNomAutoridad(String eautNomAutoridad) {
        this.eautNomAutoridad = eautNomAutoridad;
    }

    public String getEautNomAutoridad() {
        return this.eautNomAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEautNmoAutoridad(String eautNmoAutoridad) {
        this.eautNmoAutoridad = eautNmoAutoridad;
    }

    public String getEautNmoAutoridad() {
        return this.eautNmoAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEautDirAutoridad(String eautDirAutoridad) {
        this.eautDirAutoridad = eautDirAutoridad;
    }

    public String getEautDirAutoridad() {
        return this.eautDirAutoridad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEautStAutoridad(String eautStAutoridad) {
        this.eautStAutoridad = eautStAutoridad;
    }

    public String getEautStAutoridad() {
        return this.eautStAutoridad;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_AUTORIDAD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEautIdAutoridad() != null && this.getEautIdAutoridad().longValue() == -999) {
            conditions += " AND EAUT_ID_AUTORIDAD IS NULL";
        } else if (this.getEautIdAutoridad() != null) {
            conditions += " AND EAUT_ID_AUTORIDAD = ?";
            values.add(this.getEautIdAutoridad());
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
        String sql = "SELECT * FROM F_AUTORIDAD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEautIdAutoridad() != null && this.getEautIdAutoridad().longValue() == -999) {
            conditions += " AND EAUT_ID_AUTORIDAD IS NULL";
        } else if (this.getEautIdAutoridad() != null) {
            conditions += " AND EAUT_ID_AUTORIDAD = ?";
            values.add(this.getEautIdAutoridad());
        }

        if (this.getEautNomAutoridad() != null && "null".equals(this.getEautNomAutoridad())) {
            conditions += " AND EAUT_NOM_AUTORIDAD IS NULL";
        } else if (this.getEautNomAutoridad() != null) {
            conditions += " AND EAUT_NOM_AUTORIDAD = ?";
            values.add(this.getEautNomAutoridad());
        }

        if (this.getEautNmoAutoridad() != null && "null".equals(this.getEautNmoAutoridad())) {
            conditions += " AND EAUT_NMO_AUTORIDAD IS NULL";
        } else if (this.getEautNmoAutoridad() != null) {
            conditions += " AND EAUT_NMO_AUTORIDAD = ?";
            values.add(this.getEautNmoAutoridad());
        }

        if (this.getEautDirAutoridad() != null && "null".equals(this.getEautDirAutoridad())) {
            conditions += " AND EAUT_DIR_AUTORIDAD IS NULL";
        } else if (this.getEautDirAutoridad() != null) {
            conditions += " AND EAUT_DIR_AUTORIDAD = ?";
            values.add(this.getEautDirAutoridad());
        }

        if (this.getEautStAutoridad() != null && "null".equals(this.getEautStAutoridad())) {
            conditions += " AND EAUT_ST_AUTORIDAD IS NULL";
        } else if (this.getEautStAutoridad() != null) {
            conditions += " AND EAUT_ST_AUTORIDAD = ?";
            values.add(this.getEautStAutoridad());
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
        String sql = "UPDATE F_AUTORIDAD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EAUT_ID_AUTORIDAD = ?";
        pkValues.add(this.getEautIdAutoridad());
        fields += " EAUT_NOM_AUTORIDAD = ?, ";
        values.add(this.getEautNomAutoridad());
        fields += " EAUT_NMO_AUTORIDAD = ?, ";
        values.add(this.getEautNmoAutoridad());
        fields += " EAUT_DIR_AUTORIDAD = ?, ";
        values.add(this.getEautDirAutoridad());
        fields += " EAUT_ST_AUTORIDAD = ?, ";
        values.add(this.getEautStAutoridad());
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
        String sql = "INSERT INTO F_AUTORIDAD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EAUT_ID_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getEautIdAutoridad());

        fields += ", EAUT_NOM_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getEautNomAutoridad());

        fields += ", EAUT_NMO_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getEautNmoAutoridad());

        fields += ", EAUT_DIR_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getEautDirAutoridad());

        fields += ", EAUT_ST_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getEautStAutoridad());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_AUTORIDAD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EAUT_ID_AUTORIDAD = ?";
        values.add(this.getEautIdAutoridad());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAutoridad instance = (FAutoridad) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEautIdAutoridad().equals(instance.getEautIdAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getEautNomAutoridad().equals(instance.getEautNomAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getEautNmoAutoridad().equals(instance.getEautNmoAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getEautDirAutoridad().equals(instance.getEautDirAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getEautStAutoridad().equals(instance.getEautStAutoridad()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAutoridad result = new FAutoridad();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEautIdAutoridad((BigDecimal) objectData.getData("EAUT_ID_AUTORIDAD"));
        result.setEautNomAutoridad((String) objectData.getData("EAUT_NOM_AUTORIDAD"));
        result.setEautNmoAutoridad((String) objectData.getData("EAUT_NMO_AUTORIDAD"));
        result.setEautDirAutoridad((String) objectData.getData("EAUT_DIR_AUTORIDAD"));
        result.setEautStAutoridad((String) objectData.getData("EAUT_ST_AUTORIDAD"));

        return result;

    }

}
