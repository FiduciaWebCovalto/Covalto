package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ENTESCON_PK", columns = { "ENT_CVE_ST_ENTES", "ENT_NUM_CONTRATO", "ENT_NUM_ENTE_CONT" }, sequences = { "MANUAL" })
public class Entescon extends DomainObject {

    BigDecimal entNumContrato = null;
    String entNumEnteCont = null;
    String entCveStEntes = null;
    BigDecimal entTipoEnte = null;
    BigDecimal entNumTipo = null;

    public Entescon() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEntNumContrato(BigDecimal entNumContrato) {
        this.entNumContrato = entNumContrato;
    }

    public BigDecimal getEntNumContrato() {
        return this.entNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEntNumEnteCont(String entNumEnteCont) {
        this.entNumEnteCont = entNumEnteCont;
    }

    public String getEntNumEnteCont() {
        return this.entNumEnteCont;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEntCveStEntes(String entCveStEntes) {
        this.entCveStEntes = entCveStEntes;
    }

    public String getEntCveStEntes() {
        return this.entCveStEntes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEntTipoEnte(BigDecimal entTipoEnte) {
        this.entTipoEnte = entTipoEnte;
    }

    public BigDecimal getEntTipoEnte() {
        return this.entTipoEnte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setEntNumTipo(BigDecimal entNumTipo) {
        this.entNumTipo = entNumTipo;
    }

    public BigDecimal getEntNumTipo() {
        return this.entNumTipo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ENTESCON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEntNumContrato() != null && this.getEntNumContrato().longValue() == -999) {
            conditions += " AND ENT_NUM_CONTRATO IS NULL";
        } else if (this.getEntNumContrato() != null) {
            conditions += " AND ENT_NUM_CONTRATO = ?";
            values.add(this.getEntNumContrato());
        }

        if (this.getEntNumEnteCont() != null && "null".equals(this.getEntNumEnteCont())) {
            conditions += " AND ENT_NUM_ENTE_CONT IS NULL";
        } else if (this.getEntNumEnteCont() != null) {
            conditions += " AND ENT_NUM_ENTE_CONT = ?";
            values.add(this.getEntNumEnteCont());
        }

        if (this.getEntCveStEntes() != null && "null".equals(this.getEntCveStEntes())) {
            conditions += " AND ENT_CVE_ST_ENTES IS NULL";
        } else if (this.getEntCveStEntes() != null) {
            conditions += " AND ENT_CVE_ST_ENTES = ?";
            values.add(this.getEntCveStEntes());
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
        String sql = "SELECT * FROM ENTESCON ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEntNumContrato() != null && this.getEntNumContrato().longValue() == -999) {
            conditions += " AND ENT_NUM_CONTRATO IS NULL";
        } else if (this.getEntNumContrato() != null) {
            conditions += " AND ENT_NUM_CONTRATO = ?";
            values.add(this.getEntNumContrato());
        }

        if (this.getEntNumEnteCont() != null && "null".equals(this.getEntNumEnteCont())) {
            conditions += " AND ENT_NUM_ENTE_CONT IS NULL";
        } else if (this.getEntNumEnteCont() != null) {
            conditions += " AND ENT_NUM_ENTE_CONT = ?";
            values.add(this.getEntNumEnteCont());
        }

        if (this.getEntCveStEntes() != null && "null".equals(this.getEntCveStEntes())) {
            conditions += " AND ENT_CVE_ST_ENTES IS NULL";
        } else if (this.getEntCveStEntes() != null) {
            conditions += " AND ENT_CVE_ST_ENTES = ?";
            values.add(this.getEntCveStEntes());
        }

        if (this.getEntTipoEnte() != null && this.getEntTipoEnte().longValue() == -999) {
            conditions += " AND ENT_TIPO_ENTE IS NULL";
        } else if (this.getEntTipoEnte() != null) {
            conditions += " AND ENT_TIPO_ENTE = ?";
            values.add(this.getEntTipoEnte());
        }

        if (this.getEntNumTipo() != null && this.getEntNumTipo().longValue() == -999) {
            conditions += " AND ENT_NUM_TIPO IS NULL";
        } else if (this.getEntNumTipo() != null) {
            conditions += " AND ENT_NUM_TIPO = ?";
            values.add(this.getEntNumTipo());
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
        String sql = "UPDATE ENTESCON SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ENT_NUM_CONTRATO = ?";
        pkValues.add(this.getEntNumContrato());
        conditions += " AND ENT_NUM_ENTE_CONT = ?";
        pkValues.add(this.getEntNumEnteCont());
        conditions += " AND ENT_CVE_ST_ENTES = ?";
        pkValues.add(this.getEntCveStEntes());
        fields += " ENT_TIPO_ENTE = ?, ";
        values.add(this.getEntTipoEnte());
        fields += " ENT_NUM_TIPO = ?, ";
        values.add(this.getEntNumTipo());
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
        String sql = "INSERT INTO ENTESCON ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ENT_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getEntNumContrato());

        fields += ", ENT_NUM_ENTE_CONT";
        fieldValues += ", ?";
        values.add(this.getEntNumEnteCont());

        fields += ", ENT_CVE_ST_ENTES";
        fieldValues += ", ?";
        values.add(this.getEntCveStEntes());

        fields += ", ENT_TIPO_ENTE";
        fieldValues += ", ?";
        values.add(this.getEntTipoEnte());

        fields += ", ENT_NUM_TIPO";
        fieldValues += ", ?";
        values.add(this.getEntNumTipo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ENTESCON WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ENT_NUM_CONTRATO = ?";
        values.add(this.getEntNumContrato());
        conditions += " AND ENT_NUM_ENTE_CONT = ?";
        values.add(this.getEntNumEnteCont());
        conditions += " AND ENT_CVE_ST_ENTES = ?";
        values.add(this.getEntCveStEntes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Entescon instance = (Entescon) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEntNumContrato().equals(instance.getEntNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getEntNumEnteCont().equals(instance.getEntNumEnteCont()))
            equalObjects = false;
        if (equalObjects && !this.getEntCveStEntes().equals(instance.getEntCveStEntes()))
            equalObjects = false;
        if (equalObjects && !this.getEntTipoEnte().equals(instance.getEntTipoEnte()))
            equalObjects = false;
        if (equalObjects && !this.getEntNumTipo().equals(instance.getEntNumTipo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Entescon result = new Entescon();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEntNumContrato((BigDecimal) objectData.getData("ENT_NUM_CONTRATO"));
        result.setEntNumEnteCont((String) objectData.getData("ENT_NUM_ENTE_CONT"));
        result.setEntCveStEntes((String) objectData.getData("ENT_CVE_ST_ENTES"));
        result.setEntTipoEnte((BigDecimal) objectData.getData("ENT_TIPO_ENTE"));
        result.setEntNumTipo((BigDecimal) objectData.getData("ENT_NUM_TIPO"));

        return result;

    }

}
