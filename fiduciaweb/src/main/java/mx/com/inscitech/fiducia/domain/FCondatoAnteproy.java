package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CONDATO_ANTEPROY_PK",
            columns = { "COND_ID_PERSONA", "COND_ID_ANTEPROY", "COND_ID_TIPO", "COND_ID_NUM_TIPO", "COND_ID_CONCEPTO", "COND_ID_SCONCEPTO", "COND_ID_SSCONCEPTO"
    }, sequences = { "MANUAL" })
public class FCondatoAnteproy extends DomainObject {

    String condIdPersona = null;
    BigDecimal condIdAnteproy = null;
    BigDecimal condIdTipo = null;
    BigDecimal condIdNumTipo = null;
    BigDecimal condIdConcepto = null;
    BigDecimal condIdSconcepto = null;
    BigDecimal condIdSsconcepto = null;
    String condValor = null;
    BigDecimal condExisteDoc = null;
    String condUnicacion = null;
    String condEstatus = null;

    public FCondatoAnteproy() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCondIdPersona(String condIdPersona) {
        this.condIdPersona = condIdPersona;
    }

    public String getCondIdPersona() {
        return this.condIdPersona;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCondIdAnteproy(BigDecimal condIdAnteproy) {
        this.condIdAnteproy = condIdAnteproy;
    }

    public BigDecimal getCondIdAnteproy() {
        return this.condIdAnteproy;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCondIdTipo(BigDecimal condIdTipo) {
        this.condIdTipo = condIdTipo;
    }

    public BigDecimal getCondIdTipo() {
        return this.condIdTipo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCondIdNumTipo(BigDecimal condIdNumTipo) {
        this.condIdNumTipo = condIdNumTipo;
    }

    public BigDecimal getCondIdNumTipo() {
        return this.condIdNumTipo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCondIdConcepto(BigDecimal condIdConcepto) {
        this.condIdConcepto = condIdConcepto;
    }

    public BigDecimal getCondIdConcepto() {
        return this.condIdConcepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCondIdSconcepto(BigDecimal condIdSconcepto) {
        this.condIdSconcepto = condIdSconcepto;
    }

    public BigDecimal getCondIdSconcepto() {
        return this.condIdSconcepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCondIdSsconcepto(BigDecimal condIdSsconcepto) {
        this.condIdSsconcepto = condIdSsconcepto;
    }

    public BigDecimal getCondIdSsconcepto() {
        return this.condIdSsconcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCondValor(String condValor) {
        this.condValor = condValor;
    }

    public String getCondValor() {
        return this.condValor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCondExisteDoc(BigDecimal condExisteDoc) {
        this.condExisteDoc = condExisteDoc;
    }

    public BigDecimal getCondExisteDoc() {
        return this.condExisteDoc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCondUnicacion(String condUnicacion) {
        this.condUnicacion = condUnicacion;
    }

    public String getCondUnicacion() {
        return this.condUnicacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCondEstatus(String condEstatus) {
        this.condEstatus = condEstatus;
    }

    public String getCondEstatus() {
        return this.condEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CONDATO_ANTEPROY ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCondIdPersona() != null && "null".equals(this.getCondIdPersona())) {
            conditions += " AND COND_ID_PERSONA IS NULL";
        } else if (this.getCondIdPersona() != null) {
            conditions += " AND COND_ID_PERSONA = ?";
            values.add(this.getCondIdPersona());
        }

        if (this.getCondIdAnteproy() != null && this.getCondIdAnteproy().longValue() == -999) {
            conditions += " AND COND_ID_ANTEPROY IS NULL";
        } else if (this.getCondIdAnteproy() != null) {
            conditions += " AND COND_ID_ANTEPROY = ?";
            values.add(this.getCondIdAnteproy());
        }

        if (this.getCondIdTipo() != null && this.getCondIdTipo().longValue() == -999) {
            conditions += " AND COND_ID_TIPO IS NULL";
        } else if (this.getCondIdTipo() != null) {
            conditions += " AND COND_ID_TIPO = ?";
            values.add(this.getCondIdTipo());
        }

        if (this.getCondIdNumTipo() != null && this.getCondIdNumTipo().longValue() == -999) {
            conditions += " AND COND_ID_NUM_TIPO IS NULL";
        } else if (this.getCondIdNumTipo() != null) {
            conditions += " AND COND_ID_NUM_TIPO = ?";
            values.add(this.getCondIdNumTipo());
        }

        if (this.getCondIdConcepto() != null && this.getCondIdConcepto().longValue() == -999) {
            conditions += " AND COND_ID_CONCEPTO IS NULL";
        } else if (this.getCondIdConcepto() != null) {
            conditions += " AND COND_ID_CONCEPTO = ?";
            values.add(this.getCondIdConcepto());
        }

        if (this.getCondIdSconcepto() != null && this.getCondIdSconcepto().longValue() == -999) {
            conditions += " AND COND_ID_SCONCEPTO IS NULL";
        } else if (this.getCondIdSconcepto() != null) {
            conditions += " AND COND_ID_SCONCEPTO = ?";
            values.add(this.getCondIdSconcepto());
        }

        if (this.getCondIdSsconcepto() != null && this.getCondIdSsconcepto().longValue() == -999) {
            conditions += " AND COND_ID_SSCONCEPTO IS NULL";
        } else if (this.getCondIdSsconcepto() != null) {
            conditions += " AND COND_ID_SSCONCEPTO = ?";
            values.add(this.getCondIdSsconcepto());
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
        String sql = "SELECT * FROM F_CONDATO_ANTEPROY ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCondIdPersona() != null && "null".equals(this.getCondIdPersona())) {
            conditions += " AND COND_ID_PERSONA IS NULL";
        } else if (this.getCondIdPersona() != null) {
            conditions += " AND COND_ID_PERSONA = ?";
            values.add(this.getCondIdPersona());
        }

        if (this.getCondIdAnteproy() != null && this.getCondIdAnteproy().longValue() == -999) {
            conditions += " AND COND_ID_ANTEPROY IS NULL";
        } else if (this.getCondIdAnteproy() != null) {
            conditions += " AND COND_ID_ANTEPROY = ?";
            values.add(this.getCondIdAnteproy());
        }

        if (this.getCondIdTipo() != null && this.getCondIdTipo().longValue() == -999) {
            conditions += " AND COND_ID_TIPO IS NULL";
        } else if (this.getCondIdTipo() != null) {
            conditions += " AND COND_ID_TIPO = ?";
            values.add(this.getCondIdTipo());
        }

        if (this.getCondIdNumTipo() != null && this.getCondIdNumTipo().longValue() == -999) {
            conditions += " AND COND_ID_NUM_TIPO IS NULL";
        } else if (this.getCondIdNumTipo() != null) {
            conditions += " AND COND_ID_NUM_TIPO = ?";
            values.add(this.getCondIdNumTipo());
        }

        if (this.getCondIdConcepto() != null && this.getCondIdConcepto().longValue() == -999) {
            conditions += " AND COND_ID_CONCEPTO IS NULL";
        } else if (this.getCondIdConcepto() != null) {
            conditions += " AND COND_ID_CONCEPTO = ?";
            values.add(this.getCondIdConcepto());
        }

        if (this.getCondIdSconcepto() != null && this.getCondIdSconcepto().longValue() == -999) {
            conditions += " AND COND_ID_SCONCEPTO IS NULL";
        } else if (this.getCondIdSconcepto() != null) {
            conditions += " AND COND_ID_SCONCEPTO = ?";
            values.add(this.getCondIdSconcepto());
        }

        if (this.getCondIdSsconcepto() != null && this.getCondIdSsconcepto().longValue() == -999) {
            conditions += " AND COND_ID_SSCONCEPTO IS NULL";
        } else if (this.getCondIdSsconcepto() != null) {
            conditions += " AND COND_ID_SSCONCEPTO = ?";
            values.add(this.getCondIdSsconcepto());
        }

        if (this.getCondValor() != null && "null".equals(this.getCondValor())) {
            conditions += " AND COND_VALOR IS NULL";
        } else if (this.getCondValor() != null) {
            conditions += " AND COND_VALOR = ?";
            values.add(this.getCondValor());
        }

        if (this.getCondExisteDoc() != null && this.getCondExisteDoc().longValue() == -999) {
            conditions += " AND COND_EXISTE_DOC IS NULL";
        } else if (this.getCondExisteDoc() != null) {
            conditions += " AND COND_EXISTE_DOC = ?";
            values.add(this.getCondExisteDoc());
        }

        if (this.getCondUnicacion() != null && "null".equals(this.getCondUnicacion())) {
            conditions += " AND COND_UNICACION IS NULL";
        } else if (this.getCondUnicacion() != null) {
            conditions += " AND COND_UNICACION = ?";
            values.add(this.getCondUnicacion());
        }

        if (this.getCondEstatus() != null && "null".equals(this.getCondEstatus())) {
            conditions += " AND COND_ESTATUS IS NULL";
        } else if (this.getCondEstatus() != null) {
            conditions += " AND COND_ESTATUS = ?";
            values.add(this.getCondEstatus());
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
        String sql = "UPDATE F_CONDATO_ANTEPROY SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND COND_ID_PERSONA = ?";
        pkValues.add(this.getCondIdPersona());
        conditions += " AND COND_ID_ANTEPROY = ?";
        pkValues.add(this.getCondIdAnteproy());
        conditions += " AND COND_ID_TIPO = ?";
        pkValues.add(this.getCondIdTipo());
        conditions += " AND COND_ID_NUM_TIPO = ?";
        pkValues.add(this.getCondIdNumTipo());
        conditions += " AND COND_ID_CONCEPTO = ?";
        pkValues.add(this.getCondIdConcepto());
        conditions += " AND COND_ID_SCONCEPTO = ?";
        pkValues.add(this.getCondIdSconcepto());
        conditions += " AND COND_ID_SSCONCEPTO = ?";
        pkValues.add(this.getCondIdSsconcepto());
        fields += " COND_VALOR = ?, ";
        values.add(this.getCondValor());
        fields += " COND_EXISTE_DOC = ?, ";
        values.add(this.getCondExisteDoc());
        fields += " COND_UNICACION = ?, ";
        values.add(this.getCondUnicacion());
        fields += " COND_ESTATUS = ?, ";
        values.add(this.getCondEstatus());
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
        String sql = "INSERT INTO F_CONDATO_ANTEPROY ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", COND_ID_PERSONA";
        fieldValues += ", ?";
        values.add(this.getCondIdPersona());

        fields += ", COND_ID_ANTEPROY";
        fieldValues += ", ?";
        values.add(this.getCondIdAnteproy());

        fields += ", COND_ID_TIPO";
        fieldValues += ", ?";
        values.add(this.getCondIdTipo());

        fields += ", COND_ID_NUM_TIPO";
        fieldValues += ", ?";
        values.add(this.getCondIdNumTipo());

        fields += ", COND_ID_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getCondIdConcepto());

        fields += ", COND_ID_SCONCEPTO";
        fieldValues += ", ?";
        values.add(this.getCondIdSconcepto());

        fields += ", COND_ID_SSCONCEPTO";
        fieldValues += ", ?";
        values.add(this.getCondIdSsconcepto());

        fields += ", COND_VALOR";
        fieldValues += ", ?";
        values.add(this.getCondValor());

        fields += ", COND_EXISTE_DOC";
        fieldValues += ", ?";
        values.add(this.getCondExisteDoc());

        fields += ", COND_UNICACION";
        fieldValues += ", ?";
        values.add(this.getCondUnicacion());

        fields += ", COND_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getCondEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CONDATO_ANTEPROY WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND COND_ID_PERSONA = ?";
        values.add(this.getCondIdPersona());
        conditions += " AND COND_ID_ANTEPROY = ?";
        values.add(this.getCondIdAnteproy());
        conditions += " AND COND_ID_TIPO = ?";
        values.add(this.getCondIdTipo());
        conditions += " AND COND_ID_NUM_TIPO = ?";
        values.add(this.getCondIdNumTipo());
        conditions += " AND COND_ID_CONCEPTO = ?";
        values.add(this.getCondIdConcepto());
        conditions += " AND COND_ID_SCONCEPTO = ?";
        values.add(this.getCondIdSconcepto());
        conditions += " AND COND_ID_SSCONCEPTO = ?";
        values.add(this.getCondIdSsconcepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCondatoAnteproy instance = (FCondatoAnteproy) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCondIdPersona().equals(instance.getCondIdPersona()))
            equalObjects = false;
        if (equalObjects && !this.getCondIdAnteproy().equals(instance.getCondIdAnteproy()))
            equalObjects = false;
        if (equalObjects && !this.getCondIdTipo().equals(instance.getCondIdTipo()))
            equalObjects = false;
        if (equalObjects && !this.getCondIdNumTipo().equals(instance.getCondIdNumTipo()))
            equalObjects = false;
        if (equalObjects && !this.getCondIdConcepto().equals(instance.getCondIdConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getCondIdSconcepto().equals(instance.getCondIdSconcepto()))
            equalObjects = false;
        if (equalObjects && !this.getCondIdSsconcepto().equals(instance.getCondIdSsconcepto()))
            equalObjects = false;
        if (equalObjects && !this.getCondValor().equals(instance.getCondValor()))
            equalObjects = false;
        if (equalObjects && !this.getCondExisteDoc().equals(instance.getCondExisteDoc()))
            equalObjects = false;
        if (equalObjects && !this.getCondUnicacion().equals(instance.getCondUnicacion()))
            equalObjects = false;
        if (equalObjects && !this.getCondEstatus().equals(instance.getCondEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCondatoAnteproy result = new FCondatoAnteproy();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCondIdPersona((String) objectData.getData("COND_ID_PERSONA"));
        result.setCondIdAnteproy((BigDecimal) objectData.getData("COND_ID_ANTEPROY"));
        result.setCondIdTipo((BigDecimal) objectData.getData("COND_ID_TIPO"));
        result.setCondIdNumTipo((BigDecimal) objectData.getData("COND_ID_NUM_TIPO"));
        result.setCondIdConcepto((BigDecimal) objectData.getData("COND_ID_CONCEPTO"));
        result.setCondIdSconcepto((BigDecimal) objectData.getData("COND_ID_SCONCEPTO"));
        result.setCondIdSsconcepto((BigDecimal) objectData.getData("COND_ID_SSCONCEPTO"));
        result.setCondValor((String) objectData.getData("COND_VALOR"));
        result.setCondExisteDoc((BigDecimal) objectData.getData("COND_EXISTE_DOC"));
        result.setCondUnicacion((String) objectData.getData("COND_UNICACION"));
        result.setCondEstatus((String) objectData.getData("COND_ESTATUS"));

        return result;

    }

}
