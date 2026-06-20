package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CONCHEK_PK", columns = { "CONC_ID_PERSONA", "CONC_ID_FIDEICOMISO", "CONC_ID_TIPO", "CONC_ID_NUM_TIPO", "CONC_ID_CONCEPTO" },
            sequences = { "MANUAL" })
public class FConchek extends DomainObject {

    String concIdPersona = null;
    BigDecimal concIdFideicomiso = null;
    BigDecimal concIdTipo = null;
    BigDecimal concIdNumTipo = null;
    BigDecimal concIdConcepto = null;
    String concCompleto = null;
    String concEstatus = null;

    public FConchek() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setConcIdPersona(String concIdPersona) {
        this.concIdPersona = concIdPersona;
    }

    public String getConcIdPersona() {
        return this.concIdPersona;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConcIdFideicomiso(BigDecimal concIdFideicomiso) {
        this.concIdFideicomiso = concIdFideicomiso;
    }

    public BigDecimal getConcIdFideicomiso() {
        return this.concIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConcIdTipo(BigDecimal concIdTipo) {
        this.concIdTipo = concIdTipo;
    }

    public BigDecimal getConcIdTipo() {
        return this.concIdTipo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConcIdNumTipo(BigDecimal concIdNumTipo) {
        this.concIdNumTipo = concIdNumTipo;
    }

    public BigDecimal getConcIdNumTipo() {
        return this.concIdNumTipo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConcIdConcepto(BigDecimal concIdConcepto) {
        this.concIdConcepto = concIdConcepto;
    }

    public BigDecimal getConcIdConcepto() {
        return this.concIdConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConcCompleto(String concCompleto) {
        this.concCompleto = concCompleto;
    }

    public String getConcCompleto() {
        return this.concCompleto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConcEstatus(String concEstatus) {
        this.concEstatus = concEstatus;
    }

    public String getConcEstatus() {
        return this.concEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CONCHEK ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getConcIdPersona() != null && "null".equals(this.getConcIdPersona())) {
            conditions += " AND CONC_ID_PERSONA IS NULL";
        } else if (this.getConcIdPersona() != null) {
            conditions += " AND CONC_ID_PERSONA = ?";
            values.add(this.getConcIdPersona());
        }

        if (this.getConcIdFideicomiso() != null && this.getConcIdFideicomiso().longValue() == -999) {
            conditions += " AND CONC_ID_FIDEICOMISO IS NULL";
        } else if (this.getConcIdFideicomiso() != null) {
            conditions += " AND CONC_ID_FIDEICOMISO = ?";
            values.add(this.getConcIdFideicomiso());
        }

        if (this.getConcIdTipo() != null && this.getConcIdTipo().longValue() == -999) {
            conditions += " AND CONC_ID_TIPO IS NULL";
        } else if (this.getConcIdTipo() != null) {
            conditions += " AND CONC_ID_TIPO = ?";
            values.add(this.getConcIdTipo());
        }

        if (this.getConcIdNumTipo() != null && this.getConcIdNumTipo().longValue() == -999) {
            conditions += " AND CONC_ID_NUM_TIPO IS NULL";
        } else if (this.getConcIdNumTipo() != null) {
            conditions += " AND CONC_ID_NUM_TIPO = ?";
            values.add(this.getConcIdNumTipo());
        }

        if (this.getConcIdConcepto() != null && this.getConcIdConcepto().longValue() == -999) {
            conditions += " AND CONC_ID_CONCEPTO IS NULL";
        } else if (this.getConcIdConcepto() != null) {
            conditions += " AND CONC_ID_CONCEPTO = ?";
            values.add(this.getConcIdConcepto());
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
        String sql = "SELECT * FROM F_CONCHEK ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getConcIdPersona() != null && "null".equals(this.getConcIdPersona())) {
            conditions += " AND CONC_ID_PERSONA IS NULL";
        } else if (this.getConcIdPersona() != null) {
            conditions += " AND CONC_ID_PERSONA = ?";
            values.add(this.getConcIdPersona());
        }

        if (this.getConcIdFideicomiso() != null && this.getConcIdFideicomiso().longValue() == -999) {
            conditions += " AND CONC_ID_FIDEICOMISO IS NULL";
        } else if (this.getConcIdFideicomiso() != null) {
            conditions += " AND CONC_ID_FIDEICOMISO = ?";
            values.add(this.getConcIdFideicomiso());
        }

        if (this.getConcIdTipo() != null && this.getConcIdTipo().longValue() == -999) {
            conditions += " AND CONC_ID_TIPO IS NULL";
        } else if (this.getConcIdTipo() != null) {
            conditions += " AND CONC_ID_TIPO = ?";
            values.add(this.getConcIdTipo());
        }

        if (this.getConcIdNumTipo() != null && this.getConcIdNumTipo().longValue() == -999) {
            conditions += " AND CONC_ID_NUM_TIPO IS NULL";
        } else if (this.getConcIdNumTipo() != null) {
            conditions += " AND CONC_ID_NUM_TIPO = ?";
            values.add(this.getConcIdNumTipo());
        }

        if (this.getConcIdConcepto() != null && this.getConcIdConcepto().longValue() == -999) {
            conditions += " AND CONC_ID_CONCEPTO IS NULL";
        } else if (this.getConcIdConcepto() != null) {
            conditions += " AND CONC_ID_CONCEPTO = ?";
            values.add(this.getConcIdConcepto());
        }

        if (this.getConcCompleto() != null && "null".equals(this.getConcCompleto())) {
            conditions += " AND CONC_COMPLETO IS NULL";
        } else if (this.getConcCompleto() != null) {
            conditions += " AND CONC_COMPLETO = ?";
            values.add(this.getConcCompleto());
        }

        if (this.getConcEstatus() != null && "null".equals(this.getConcEstatus())) {
            conditions += " AND CONC_ESTATUS IS NULL";
        } else if (this.getConcEstatus() != null) {
            conditions += " AND CONC_ESTATUS = ?";
            values.add(this.getConcEstatus());
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
        String sql = "UPDATE F_CONCHEK SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CONC_ID_PERSONA = ?";
        pkValues.add(this.getConcIdPersona());
        conditions += " AND CONC_ID_FIDEICOMISO = ?";
        pkValues.add(this.getConcIdFideicomiso());
        conditions += " AND CONC_ID_TIPO = ?";
        pkValues.add(this.getConcIdTipo());
        conditions += " AND CONC_ID_NUM_TIPO = ?";
        pkValues.add(this.getConcIdNumTipo());
        conditions += " AND CONC_ID_CONCEPTO = ?";
        pkValues.add(this.getConcIdConcepto());
        fields += " CONC_COMPLETO = ?, ";
        values.add(this.getConcCompleto());
        fields += " CONC_ESTATUS = ?, ";
        values.add(this.getConcEstatus());
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
        String sql = "INSERT INTO F_CONCHEK ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CONC_ID_PERSONA";
        fieldValues += ", ?";
        values.add(this.getConcIdPersona());

        fields += ", CONC_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getConcIdFideicomiso());

        fields += ", CONC_ID_TIPO";
        fieldValues += ", ?";
        values.add(this.getConcIdTipo());

        fields += ", CONC_ID_NUM_TIPO";
        fieldValues += ", ?";
        values.add(this.getConcIdNumTipo());

        fields += ", CONC_ID_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getConcIdConcepto());

        fields += ", CONC_COMPLETO";
        fieldValues += ", ?";
        values.add(this.getConcCompleto());

        fields += ", CONC_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getConcEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CONCHEK WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CONC_ID_PERSONA = ?";
        values.add(this.getConcIdPersona());
        conditions += " AND CONC_ID_FIDEICOMISO = ?";
        values.add(this.getConcIdFideicomiso());
        conditions += " AND CONC_ID_TIPO = ?";
        values.add(this.getConcIdTipo());
        conditions += " AND CONC_ID_NUM_TIPO = ?";
        values.add(this.getConcIdNumTipo());
        conditions += " AND CONC_ID_CONCEPTO = ?";
        values.add(this.getConcIdConcepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FConchek instance = (FConchek) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getConcIdPersona().equals(instance.getConcIdPersona()))
            equalObjects = false;
        if (equalObjects && !this.getConcIdFideicomiso().equals(instance.getConcIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getConcIdTipo().equals(instance.getConcIdTipo()))
            equalObjects = false;
        if (equalObjects && !this.getConcIdNumTipo().equals(instance.getConcIdNumTipo()))
            equalObjects = false;
        if (equalObjects && !this.getConcIdConcepto().equals(instance.getConcIdConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getConcCompleto().equals(instance.getConcCompleto()))
            equalObjects = false;
        if (equalObjects && !this.getConcEstatus().equals(instance.getConcEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FConchek result = new FConchek();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setConcIdPersona((String) objectData.getData("CONC_ID_PERSONA"));
        result.setConcIdFideicomiso((BigDecimal) objectData.getData("CONC_ID_FIDEICOMISO"));
        result.setConcIdTipo((BigDecimal) objectData.getData("CONC_ID_TIPO"));
        result.setConcIdNumTipo((BigDecimal) objectData.getData("CONC_ID_NUM_TIPO"));
        result.setConcIdConcepto((BigDecimal) objectData.getData("CONC_ID_CONCEPTO"));
        result.setConcCompleto((String) objectData.getData("CONC_COMPLETO"));
        result.setConcEstatus((String) objectData.getData("CONC_ESTATUS"));

        return result;

    }

}
