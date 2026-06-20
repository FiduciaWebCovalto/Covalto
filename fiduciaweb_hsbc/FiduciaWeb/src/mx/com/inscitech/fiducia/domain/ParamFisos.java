package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARAM_FISOS_PK", columns = { "CTO_NUM_CONTRATO" }, sequences = { "MAX" })
public class ParamFisos extends DomainObject {

    BigDecimal ctoNumContrato = null;
    BigDecimal ctasIndividuales = null;
    BigDecimal pctoParticip = null;
    String escripcion = null;
    String status = null;
    String fecAlta = null;
    String fecUltMod = null;

    public ParamFisos() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumContrato(BigDecimal ctoNumContrato) {
        this.ctoNumContrato = ctoNumContrato;
    }

    public BigDecimal getCtoNumContrato() {
        return this.ctoNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCtasIndividuales(BigDecimal ctasIndividuales) {
        this.ctasIndividuales = ctasIndividuales;
    }

    public BigDecimal getCtasIndividuales() {
        return this.ctasIndividuales;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 8, scale = 4, javaClass = BigDecimal.class)
    public void setPctoParticip(BigDecimal pctoParticip) {
        this.pctoParticip = pctoParticip;
    }

    public BigDecimal getPctoParticip() {
        return this.pctoParticip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDescripcion(String escripcion) {
        this.escripcion = escripcion;
    }

    public String getDescripcion() {
        return this.escripcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEstatus(String status) {
        this.status = status;
    }

    public String getEstatus() {
        return this.status;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFecAlta(String fecAlta) {
        this.fecAlta = fecAlta;
    }

    public String getFecAlta() {
        return this.fecAlta;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFecUltMod(String fecUltMod) {
        this.fecUltMod = fecUltMod;
    }

    public String getFecUltMod() {
        return this.fecUltMod;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARAM_FISOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtoNumContrato() != null && this.getCtoNumContrato().longValue() == -999) {
            conditions += " AND CTO_NUM_CONTRATO IS NULL";
        } else if (this.getCtoNumContrato() != null) {
            conditions += " AND CTO_NUM_CONTRATO = ?";
            values.add(this.getCtoNumContrato());
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
        String sql = "SELECT * FROM PARAM_FISOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtoNumContrato() != null && this.getCtoNumContrato().longValue() == -999) {
            conditions += " AND CTO_NUM_CONTRATO IS NULL";
        } else if (this.getCtoNumContrato() != null) {
            conditions += " AND CTO_NUM_CONTRATO = ?";
            values.add(this.getCtoNumContrato());
        }

        if (this.getCtasIndividuales() != null && this.getCtasIndividuales().longValue() == -999) {
            conditions += " AND CTAS_INDIVIDUALES IS NULL";
        } else if (this.getCtasIndividuales() != null) {
            conditions += " AND CTAS_INDIVIDUALES = ?";
            values.add(this.getCtasIndividuales());
        }

        if (this.getPctoParticip() != null && this.getPctoParticip().longValue() == -999) {
            conditions += " AND PCTO_PARTICIP IS NULL";
        } else if (this.getPctoParticip() != null) {
            conditions += " AND PCTO_PARTICIP = ?";
            values.add(this.getPctoParticip());
        }

        if (this.getDescripcion() != null && "null".equals(this.getDescripcion())) {
            conditions += " AND DESCRIPCION IS NULL";
        } else if (this.getDescripcion() != null) {
            conditions += " AND DESCRIPCION = ?";
            values.add(this.getDescripcion());
        }

        if (this.getEstatus() != null && "null".equals(this.getEstatus())) {
            conditions += " AND ESTATUS IS NULL";
        } else if (this.getEstatus() != null) {
            conditions += " AND ESTATUS = ?";
            values.add(this.getEstatus());
        }

        if (this.getFecAlta() != null && "null".equals(this.getFecAlta())) {
            conditions += " AND FEC_ALTA IS NULL";
        } else if (this.getFecAlta() != null) {
            conditions += " AND FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFecAlta());
        }

        if (this.getFecUltMod() != null && "null".equals(this.getFecUltMod())) {
            conditions += " AND FEC_ULT_MOD IS NULL";
        } else if (this.getFecUltMod() != null) {
            conditions += " AND FEC_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFecUltMod());
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
        String sql = "UPDATE PARAM_FISOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTO_NUM_CONTRATO = ?";
        pkValues.add(this.getCtoNumContrato());
        fields += " CTAS_INDIVIDUALES = ?, ";
        values.add(this.getCtasIndividuales());
        fields += " PCTO_PARTICIP = ?, ";
        values.add(this.getPctoParticip());
        fields += " DESCRIPCION = ?, ";
        values.add(this.getDescripcion());
        fields += " ESTATUS = ?, ";
        values.add(this.getEstatus());
        fields += " FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFecAlta());
        fields += " FEC_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFecUltMod());
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
        String sql = "INSERT INTO PARAM_FISOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtoNumContrato());

        fields += ", CTAS_INDIVIDUALES";
        fieldValues += ", ?";
        values.add(this.getCtasIndividuales());

        fields += ", PCTO_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getPctoParticip());

        fields += ", DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getDescripcion());

        fields += ", ESTATUS";
        fieldValues += ", ?";
        values.add(this.getEstatus());

        fields += ", FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFecAlta());

        fields += ", FEC_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFecUltMod());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARAM_FISOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTO_NUM_CONTRATO = ?";
        values.add(this.getCtoNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ParamFisos instance = (ParamFisos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtoNumContrato().equals(instance.getCtoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtasIndividuales().equals(instance.getCtasIndividuales()))
            equalObjects = false;
        if (equalObjects && !this.getPctoParticip().equals(instance.getPctoParticip()))
            equalObjects = false;
        if (equalObjects && !this.getDescripcion().equals(instance.getDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getEstatus().equals(instance.getEstatus()))
            equalObjects = false;
        if (equalObjects && !this.getFecAlta().equals(instance.getFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getFecUltMod().equals(instance.getFecUltMod()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ParamFisos result = new ParamFisos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtoNumContrato((BigDecimal) objectData.getData("CTO_NUM_CONTRATO"));
        result.setCtasIndividuales((BigDecimal) objectData.getData("CTAS_INDIVIDUALES"));
        result.setPctoParticip((BigDecimal) objectData.getData("PCTO_PARTICIP"));
        result.setDescripcion((String) objectData.getData("DESCRIPCION"));
        result.setEstatus((String) objectData.getData("ESTATUS"));
        result.setFecAlta((String) objectData.getData("FEC_ALTA"));
        result.setFecUltMod((String) objectData.getData("FEC_ULT_MOD"));

        return result;

    }

}
