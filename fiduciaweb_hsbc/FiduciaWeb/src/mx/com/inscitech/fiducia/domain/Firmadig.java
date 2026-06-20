package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FIRMADIG_PK", columns = { "FRD_NOMBRE", "FRD_UBICACION" }, sequences = { "MANUAL" })
public class Firmadig extends DomainObject {

    String frdNombre = null;
    String frdUbicacion = null;
    BigDecimal frdMancomunada = null;
    BigDecimal frdIndividual = null;
    BigDecimal frdAutorizacion = null;

    public Firmadig() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrdNombre(String frdNombre) {
        this.frdNombre = frdNombre;
    }

    public String getFrdNombre() {
        return this.frdNombre;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrdUbicacion(String frdUbicacion) {
        this.frdUbicacion = frdUbicacion;
    }

    public String getFrdUbicacion() {
        return this.frdUbicacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFrdMancomunada(BigDecimal frdMancomunada) {
        this.frdMancomunada = frdMancomunada;
    }

    public BigDecimal getFrdMancomunada() {
        return this.frdMancomunada;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFrdIndividual(BigDecimal frdIndividual) {
        this.frdIndividual = frdIndividual;
    }

    public BigDecimal getFrdIndividual() {
        return this.frdIndividual;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setFrdAutorizacion(BigDecimal frdAutorizacion) {
        this.frdAutorizacion = frdAutorizacion;
    }

    public BigDecimal getFrdAutorizacion() {
        return this.frdAutorizacion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FIRMADIG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrdNombre() != null && "null".equals(this.getFrdNombre())) {
            conditions += " AND FRD_NOMBRE IS NULL";
        } else if (this.getFrdNombre() != null) {
            conditions += " AND FRD_NOMBRE = ?";
            values.add(this.getFrdNombre());
        }

        if (this.getFrdUbicacion() != null && "null".equals(this.getFrdUbicacion())) {
            conditions += " AND FRD_UBICACION IS NULL";
        } else if (this.getFrdUbicacion() != null) {
            conditions += " AND FRD_UBICACION = ?";
            values.add(this.getFrdUbicacion());
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
        String sql = "SELECT * FROM FIRMADIG ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrdNombre() != null && "null".equals(this.getFrdNombre())) {
            conditions += " AND FRD_NOMBRE IS NULL";
        } else if (this.getFrdNombre() != null) {
            conditions += " AND FRD_NOMBRE = ?";
            values.add(this.getFrdNombre());
        }

        if (this.getFrdUbicacion() != null && "null".equals(this.getFrdUbicacion())) {
            conditions += " AND FRD_UBICACION IS NULL";
        } else if (this.getFrdUbicacion() != null) {
            conditions += " AND FRD_UBICACION = ?";
            values.add(this.getFrdUbicacion());
        }

        if (this.getFrdMancomunada() != null && this.getFrdMancomunada().longValue() == -999) {
            conditions += " AND FRD_MANCOMUNADA IS NULL";
        } else if (this.getFrdMancomunada() != null) {
            conditions += " AND FRD_MANCOMUNADA = ?";
            values.add(this.getFrdMancomunada());
        }

        if (this.getFrdIndividual() != null && this.getFrdIndividual().longValue() == -999) {
            conditions += " AND FRD_INDIVIDUAL IS NULL";
        } else if (this.getFrdIndividual() != null) {
            conditions += " AND FRD_INDIVIDUAL = ?";
            values.add(this.getFrdIndividual());
        }

        if (this.getFrdAutorizacion() != null && this.getFrdAutorizacion().longValue() == -999) {
            conditions += " AND FRD_AUTORIZACION IS NULL";
        } else if (this.getFrdAutorizacion() != null) {
            conditions += " AND FRD_AUTORIZACION = ?";
            values.add(this.getFrdAutorizacion());
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
        String sql = "UPDATE FIRMADIG SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FRD_NOMBRE = ?";
        pkValues.add(this.getFrdNombre());
        conditions += " AND FRD_UBICACION = ?";
        pkValues.add(this.getFrdUbicacion());
        fields += " FRD_MANCOMUNADA = ?, ";
        values.add(this.getFrdMancomunada());
        fields += " FRD_INDIVIDUAL = ?, ";
        values.add(this.getFrdIndividual());
        fields += " FRD_AUTORIZACION = ?, ";
        values.add(this.getFrdAutorizacion());
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
        String sql = "INSERT INTO FIRMADIG ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FRD_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getFrdNombre());

        fields += ", FRD_UBICACION";
        fieldValues += ", ?";
        values.add(this.getFrdUbicacion());

        fields += ", FRD_MANCOMUNADA";
        fieldValues += ", ?";
        values.add(this.getFrdMancomunada());

        fields += ", FRD_INDIVIDUAL";
        fieldValues += ", ?";
        values.add(this.getFrdIndividual());

        fields += ", FRD_AUTORIZACION";
        fieldValues += ", ?";
        values.add(this.getFrdAutorizacion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FIRMADIG WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FRD_NOMBRE = ?";
        values.add(this.getFrdNombre());
        conditions += " AND FRD_UBICACION = ?";
        values.add(this.getFrdUbicacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Firmadig instance = (Firmadig) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFrdNombre().equals(instance.getFrdNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFrdUbicacion().equals(instance.getFrdUbicacion()))
            equalObjects = false;
        if (equalObjects && !this.getFrdMancomunada().equals(instance.getFrdMancomunada()))
            equalObjects = false;
        if (equalObjects && !this.getFrdIndividual().equals(instance.getFrdIndividual()))
            equalObjects = false;
        if (equalObjects && !this.getFrdAutorizacion().equals(instance.getFrdAutorizacion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Firmadig result = new Firmadig();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFrdNombre((String) objectData.getData("FRD_NOMBRE"));
        result.setFrdUbicacion((String) objectData.getData("FRD_UBICACION"));
        result.setFrdMancomunada((BigDecimal) objectData.getData("FRD_MANCOMUNADA"));
        result.setFrdIndividual((BigDecimal) objectData.getData("FRD_INDIVIDUAL"));
        result.setFrdAutorizacion((BigDecimal) objectData.getData("FRD_AUTORIZACION"));

        return result;

    }

}
