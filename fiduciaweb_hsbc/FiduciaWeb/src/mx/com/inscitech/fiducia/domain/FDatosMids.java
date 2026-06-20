package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_DATOS_MIDS_PK", columns = { "MIND_ID_PERSONA", "MIND_ID_FIDEICOMISO", "MIND_ID_TIPO", "MIND_ID_NUM_TIPO", "MIND_ID_CONCEPTO" },
            sequences = { "MANUAL" })
public class FDatosMids extends DomainObject {

    String mindIdPersona = null;
    BigDecimal mindIdFideicomiso = null;
    BigDecimal mindIdTipo = null;
    BigDecimal mindIdNumTipo = null;
    BigDecimal mindIdConcepto = null;
    String mindValor = null;

    public FDatosMids() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setMindIdPersona(String mindIdPersona) {
        this.mindIdPersona = mindIdPersona;
    }

    public String getMindIdPersona() {
        return this.mindIdPersona;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMindIdFideicomiso(BigDecimal mindIdFideicomiso) {
        this.mindIdFideicomiso = mindIdFideicomiso;
    }

    public BigDecimal getMindIdFideicomiso() {
        return this.mindIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMindIdTipo(BigDecimal mindIdTipo) {
        this.mindIdTipo = mindIdTipo;
    }

    public BigDecimal getMindIdTipo() {
        return this.mindIdTipo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMindIdNumTipo(BigDecimal mindIdNumTipo) {
        this.mindIdNumTipo = mindIdNumTipo;
    }

    public BigDecimal getMindIdNumTipo() {
        return this.mindIdNumTipo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setMindIdConcepto(BigDecimal mindIdConcepto) {
        this.mindIdConcepto = mindIdConcepto;
    }

    public BigDecimal getMindIdConcepto() {
        return this.mindIdConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setMindValor(String mindValor) {
        this.mindValor = mindValor;
    }

    public String getMindValor() {
        return this.mindValor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_DATOS_MIDS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMindIdPersona() != null && "null".equals(this.getMindIdPersona())) {
            conditions += " AND MIND_ID_PERSONA IS NULL";
        } else if (this.getMindIdPersona() != null) {
            conditions += " AND MIND_ID_PERSONA = ?";
            values.add(this.getMindIdPersona());
        }

        if (this.getMindIdFideicomiso() != null && this.getMindIdFideicomiso().longValue() == -999) {
            conditions += " AND MIND_ID_FIDEICOMISO IS NULL";
        } else if (this.getMindIdFideicomiso() != null) {
            conditions += " AND MIND_ID_FIDEICOMISO = ?";
            values.add(this.getMindIdFideicomiso());
        }

        if (this.getMindIdTipo() != null && this.getMindIdTipo().longValue() == -999) {
            conditions += " AND MIND_ID_TIPO IS NULL";
        } else if (this.getMindIdTipo() != null) {
            conditions += " AND MIND_ID_TIPO = ?";
            values.add(this.getMindIdTipo());
        }

        if (this.getMindIdNumTipo() != null && this.getMindIdNumTipo().longValue() == -999) {
            conditions += " AND MIND_ID_NUM_TIPO IS NULL";
        } else if (this.getMindIdNumTipo() != null) {
            conditions += " AND MIND_ID_NUM_TIPO = ?";
            values.add(this.getMindIdNumTipo());
        }

        if (this.getMindIdConcepto() != null && this.getMindIdConcepto().longValue() == -999) {
            conditions += " AND MIND_ID_CONCEPTO IS NULL";
        } else if (this.getMindIdConcepto() != null) {
            conditions += " AND MIND_ID_CONCEPTO = ?";
            values.add(this.getMindIdConcepto());
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
        String sql = "SELECT * FROM F_DATOS_MIDS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getMindIdPersona() != null && "null".equals(this.getMindIdPersona())) {
            conditions += " AND MIND_ID_PERSONA IS NULL";
        } else if (this.getMindIdPersona() != null) {
            conditions += " AND MIND_ID_PERSONA = ?";
            values.add(this.getMindIdPersona());
        }

        if (this.getMindIdFideicomiso() != null && this.getMindIdFideicomiso().longValue() == -999) {
            conditions += " AND MIND_ID_FIDEICOMISO IS NULL";
        } else if (this.getMindIdFideicomiso() != null) {
            conditions += " AND MIND_ID_FIDEICOMISO = ?";
            values.add(this.getMindIdFideicomiso());
        }

        if (this.getMindIdTipo() != null && this.getMindIdTipo().longValue() == -999) {
            conditions += " AND MIND_ID_TIPO IS NULL";
        } else if (this.getMindIdTipo() != null) {
            conditions += " AND MIND_ID_TIPO = ?";
            values.add(this.getMindIdTipo());
        }

        if (this.getMindIdNumTipo() != null && this.getMindIdNumTipo().longValue() == -999) {
            conditions += " AND MIND_ID_NUM_TIPO IS NULL";
        } else if (this.getMindIdNumTipo() != null) {
            conditions += " AND MIND_ID_NUM_TIPO = ?";
            values.add(this.getMindIdNumTipo());
        }

        if (this.getMindIdConcepto() != null && this.getMindIdConcepto().longValue() == -999) {
            conditions += " AND MIND_ID_CONCEPTO IS NULL";
        } else if (this.getMindIdConcepto() != null) {
            conditions += " AND MIND_ID_CONCEPTO = ?";
            values.add(this.getMindIdConcepto());
        }

        if (this.getMindValor() != null && "null".equals(this.getMindValor())) {
            conditions += " AND MIND_VALOR IS NULL";
        } else if (this.getMindValor() != null) {
            conditions += " AND MIND_VALOR = ?";
            values.add(this.getMindValor());
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
        String sql = "UPDATE F_DATOS_MIDS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND MIND_ID_PERSONA = ?";
        pkValues.add(this.getMindIdPersona());
        conditions += " AND MIND_ID_FIDEICOMISO = ?";
        pkValues.add(this.getMindIdFideicomiso());
        conditions += " AND MIND_ID_TIPO = ?";
        pkValues.add(this.getMindIdTipo());
        conditions += " AND MIND_ID_NUM_TIPO = ?";
        pkValues.add(this.getMindIdNumTipo());
        conditions += " AND MIND_ID_CONCEPTO = ?";
        pkValues.add(this.getMindIdConcepto());
        fields += " MIND_VALOR = ?, ";
        values.add(this.getMindValor());
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
        String sql = "INSERT INTO F_DATOS_MIDS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", MIND_ID_PERSONA";
        fieldValues += ", ?";
        values.add(this.getMindIdPersona());

        fields += ", MIND_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getMindIdFideicomiso());

        fields += ", MIND_ID_TIPO";
        fieldValues += ", ?";
        values.add(this.getMindIdTipo());

        fields += ", MIND_ID_NUM_TIPO";
        fieldValues += ", ?";
        values.add(this.getMindIdNumTipo());

        fields += ", MIND_ID_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getMindIdConcepto());

        fields += ", MIND_VALOR";
        fieldValues += ", ?";
        values.add(this.getMindValor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_DATOS_MIDS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND MIND_ID_PERSONA = ?";
        values.add(this.getMindIdPersona());
        conditions += " AND MIND_ID_FIDEICOMISO = ?";
        values.add(this.getMindIdFideicomiso());
        conditions += " AND MIND_ID_TIPO = ?";
        values.add(this.getMindIdTipo());
        conditions += " AND MIND_ID_NUM_TIPO = ?";
        values.add(this.getMindIdNumTipo());
        conditions += " AND MIND_ID_CONCEPTO = ?";
        values.add(this.getMindIdConcepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FDatosMids instance = (FDatosMids) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getMindIdPersona().equals(instance.getMindIdPersona()))
            equalObjects = false;
        if (equalObjects && !this.getMindIdFideicomiso().equals(instance.getMindIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getMindIdTipo().equals(instance.getMindIdTipo()))
            equalObjects = false;
        if (equalObjects && !this.getMindIdNumTipo().equals(instance.getMindIdNumTipo()))
            equalObjects = false;
        if (equalObjects && !this.getMindIdConcepto().equals(instance.getMindIdConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getMindValor().equals(instance.getMindValor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FDatosMids result = new FDatosMids();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setMindIdPersona((String) objectData.getData("MIND_ID_PERSONA"));
        result.setMindIdFideicomiso((BigDecimal) objectData.getData("MIND_ID_FIDEICOMISO"));
        result.setMindIdTipo((BigDecimal) objectData.getData("MIND_ID_TIPO"));
        result.setMindIdNumTipo((BigDecimal) objectData.getData("MIND_ID_NUM_TIPO"));
        result.setMindIdConcepto((BigDecimal) objectData.getData("MIND_ID_CONCEPTO"));
        result.setMindValor((String) objectData.getData("MIND_VALOR"));

        return result;

    }

}
