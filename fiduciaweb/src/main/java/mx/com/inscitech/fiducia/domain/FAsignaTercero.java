package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ASIGNA_TERCERO_PK", columns = { "FATE_NUM_TERCERO" }, sequences = { "MAX" })
public class FAsignaTercero extends DomainObject {

    BigDecimal fateNumTercero = null;
    String fateNomTercero = null;
    BigDecimal fateNumContrato = null;

    public FAsignaTercero() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFateNumTercero(BigDecimal fateNumTercero) {
        this.fateNumTercero = fateNumTercero;
    }

    public BigDecimal getFateNumTercero() {
        return this.fateNumTercero;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFateNomTercero(String fateNomTercero) {
        this.fateNomTercero = fateNomTercero;
    }

    public String getFateNomTercero() {
        return this.fateNomTercero;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFateNumContrato(BigDecimal fateNumContrato) {
        this.fateNumContrato = fateNumContrato;
    }

    public BigDecimal getFateNumContrato() {
        return this.fateNumContrato;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ASIGNA_TERCERO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFateNumTercero() != null && this.getFateNumTercero().longValue() == -999) {
            conditions += " AND FATE_NUM_TERCERO IS NULL";
        } else if (this.getFateNumTercero() != null) {
            conditions += " AND FATE_NUM_TERCERO = ?";
            values.add(this.getFateNumTercero());
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
        String sql = "SELECT * FROM F_ASIGNA_TERCERO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFateNumTercero() != null && this.getFateNumTercero().longValue() == -999) {
            conditions += " AND FATE_NUM_TERCERO IS NULL";
        } else if (this.getFateNumTercero() != null) {
            conditions += " AND FATE_NUM_TERCERO = ?";
            values.add(this.getFateNumTercero());
        }

        if (this.getFateNomTercero() != null && "null".equals(this.getFateNomTercero())) {
            conditions += " AND FATE_NOM_TERCERO IS NULL";
        } else if (this.getFateNomTercero() != null) {
            conditions += " AND FATE_NOM_TERCERO = ?";
            values.add(this.getFateNomTercero());
        }

        if (this.getFateNumContrato() != null && this.getFateNumContrato().longValue() == -999) {
            conditions += " AND FATE_NUM_CONTRATO IS NULL";
        } else if (this.getFateNumContrato() != null) {
            conditions += " AND FATE_NUM_CONTRATO = ?";
            values.add(this.getFateNumContrato());
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
        String sql = "UPDATE F_ASIGNA_TERCERO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FATE_NUM_TERCERO = ?";
        pkValues.add(this.getFateNumTercero());
        fields += " FATE_NOM_TERCERO = ?, ";
        values.add(this.getFateNomTercero());
        fields += " FATE_NUM_CONTRATO = ?, ";
        values.add(this.getFateNumContrato());
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
        String sql = "INSERT INTO F_ASIGNA_TERCERO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FATE_NUM_TERCERO";
        fieldValues += ", ?";
        values.add(this.getFateNumTercero());

        fields += ", FATE_NOM_TERCERO";
        fieldValues += ", ?";
        values.add(this.getFateNomTercero());

        fields += ", FATE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFateNumContrato());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ASIGNA_TERCERO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FATE_NUM_TERCERO = ?";
        values.add(this.getFateNumTercero());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAsignaTercero instance = (FAsignaTercero) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFateNumTercero().equals(instance.getFateNumTercero()))
            equalObjects = false;
        if (equalObjects && !this.getFateNomTercero().equals(instance.getFateNomTercero()))
            equalObjects = false;
        if (equalObjects && !this.getFateNumContrato().equals(instance.getFateNumContrato()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAsignaTercero result = new FAsignaTercero();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFateNumTercero((BigDecimal) objectData.getData("FATE_NUM_TERCERO"));
        result.setFateNomTercero((String) objectData.getData("FATE_NOM_TERCERO"));
        result.setFateNumContrato((BigDecimal) objectData.getData("FATE_NUM_CONTRATO"));

        return result;

    }

}
