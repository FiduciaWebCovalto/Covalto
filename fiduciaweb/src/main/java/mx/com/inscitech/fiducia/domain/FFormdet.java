package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_FORMDET_PK", columns = { "EFRD_ID_CLASIFIC", "EFRD_ID_FORMULA", "EFRD_ID_TERMINO" }, sequences = { "MANUAL" })
public class FFormdet extends DomainObject {

    BigDecimal efrdIdClasific = null;
    BigDecimal efrdIdFormula = null;
    BigDecimal efrdIdTermino = null;
    BigDecimal efrdNumElemento = null;
    String efrdNomTermino = null;
    BigDecimal efrdTipoDato = null;
    String efrdStFormdet = null;

    public FFormdet() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEfrdIdClasific(BigDecimal efrdIdClasific) {
        this.efrdIdClasific = efrdIdClasific;
    }

    public BigDecimal getEfrdIdClasific() {
        return this.efrdIdClasific;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfrdIdFormula(BigDecimal efrdIdFormula) {
        this.efrdIdFormula = efrdIdFormula;
    }

    public BigDecimal getEfrdIdFormula() {
        return this.efrdIdFormula;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfrdIdTermino(BigDecimal efrdIdTermino) {
        this.efrdIdTermino = efrdIdTermino;
    }

    public BigDecimal getEfrdIdTermino() {
        return this.efrdIdTermino;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfrdNumElemento(BigDecimal efrdNumElemento) {
        this.efrdNumElemento = efrdNumElemento;
    }

    public BigDecimal getEfrdNumElemento() {
        return this.efrdNumElemento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfrdNomTermino(String efrdNomTermino) {
        this.efrdNomTermino = efrdNomTermino;
    }

    public String getEfrdNomTermino() {
        return this.efrdNomTermino;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEfrdTipoDato(BigDecimal efrdTipoDato) {
        this.efrdTipoDato = efrdTipoDato;
    }

    public BigDecimal getEfrdTipoDato() {
        return this.efrdTipoDato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfrdStFormdet(String efrdStFormdet) {
        this.efrdStFormdet = efrdStFormdet;
    }

    public String getEfrdStFormdet() {
        return this.efrdStFormdet;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_FORMDET ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfrdIdClasific() != null && this.getEfrdIdClasific().longValue() == -999) {
            conditions += " AND EFRD_ID_CLASIFIC IS NULL";
        } else if (this.getEfrdIdClasific() != null) {
            conditions += " AND EFRD_ID_CLASIFIC = ?";
            values.add(this.getEfrdIdClasific());
        }

        if (this.getEfrdIdFormula() != null && this.getEfrdIdFormula().longValue() == -999) {
            conditions += " AND EFRD_ID_FORMULA IS NULL";
        } else if (this.getEfrdIdFormula() != null) {
            conditions += " AND EFRD_ID_FORMULA = ?";
            values.add(this.getEfrdIdFormula());
        }

        if (this.getEfrdIdTermino() != null && this.getEfrdIdTermino().longValue() == -999) {
            conditions += " AND EFRD_ID_TERMINO IS NULL";
        } else if (this.getEfrdIdTermino() != null) {
            conditions += " AND EFRD_ID_TERMINO = ?";
            values.add(this.getEfrdIdTermino());
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
        String sql = "SELECT * FROM F_FORMDET ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfrdIdClasific() != null && this.getEfrdIdClasific().longValue() == -999) {
            conditions += " AND EFRD_ID_CLASIFIC IS NULL";
        } else if (this.getEfrdIdClasific() != null) {
            conditions += " AND EFRD_ID_CLASIFIC = ?";
            values.add(this.getEfrdIdClasific());
        }

        if (this.getEfrdIdFormula() != null && this.getEfrdIdFormula().longValue() == -999) {
            conditions += " AND EFRD_ID_FORMULA IS NULL";
        } else if (this.getEfrdIdFormula() != null) {
            conditions += " AND EFRD_ID_FORMULA = ?";
            values.add(this.getEfrdIdFormula());
        }

        if (this.getEfrdIdTermino() != null && this.getEfrdIdTermino().longValue() == -999) {
            conditions += " AND EFRD_ID_TERMINO IS NULL";
        } else if (this.getEfrdIdTermino() != null) {
            conditions += " AND EFRD_ID_TERMINO = ?";
            values.add(this.getEfrdIdTermino());
        }

        if (this.getEfrdNumElemento() != null && this.getEfrdNumElemento().longValue() == -999) {
            conditions += " AND EFRD_NUM_ELEMENTO IS NULL";
        } else if (this.getEfrdNumElemento() != null) {
            conditions += " AND EFRD_NUM_ELEMENTO = ?";
            values.add(this.getEfrdNumElemento());
        }

        if (this.getEfrdNomTermino() != null && "null".equals(this.getEfrdNomTermino())) {
            conditions += " AND EFRD_NOM_TERMINO IS NULL";
        } else if (this.getEfrdNomTermino() != null) {
            conditions += " AND EFRD_NOM_TERMINO = ?";
            values.add(this.getEfrdNomTermino());
        }

        if (this.getEfrdTipoDato() != null && this.getEfrdTipoDato().longValue() == -999) {
            conditions += " AND EFRD_TIPO_DATO IS NULL";
        } else if (this.getEfrdTipoDato() != null) {
            conditions += " AND EFRD_TIPO_DATO = ?";
            values.add(this.getEfrdTipoDato());
        }

        if (this.getEfrdStFormdet() != null && "null".equals(this.getEfrdStFormdet())) {
            conditions += " AND EFRD_ST_FORMDET IS NULL";
        } else if (this.getEfrdStFormdet() != null) {
            conditions += " AND EFRD_ST_FORMDET = ?";
            values.add(this.getEfrdStFormdet());
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
        String sql = "UPDATE F_FORMDET SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EFRD_ID_CLASIFIC = ?";
        pkValues.add(this.getEfrdIdClasific());
        conditions += " AND EFRD_ID_FORMULA = ?";
        pkValues.add(this.getEfrdIdFormula());
        conditions += " AND EFRD_ID_TERMINO = ?";
        pkValues.add(this.getEfrdIdTermino());
        fields += " EFRD_NUM_ELEMENTO = ?, ";
        values.add(this.getEfrdNumElemento());
        fields += " EFRD_NOM_TERMINO = ?, ";
        values.add(this.getEfrdNomTermino());
        fields += " EFRD_TIPO_DATO = ?, ";
        values.add(this.getEfrdTipoDato());
        fields += " EFRD_ST_FORMDET = ?, ";
        values.add(this.getEfrdStFormdet());
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
        String sql = "INSERT INTO F_FORMDET ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EFRD_ID_CLASIFIC";
        fieldValues += ", ?";
        values.add(this.getEfrdIdClasific());

        fields += ", EFRD_ID_FORMULA";
        fieldValues += ", ?";
        values.add(this.getEfrdIdFormula());

        fields += ", EFRD_ID_TERMINO";
        fieldValues += ", ?";
        values.add(this.getEfrdIdTermino());

        fields += ", EFRD_NUM_ELEMENTO";
        fieldValues += ", ?";
        values.add(this.getEfrdNumElemento());

        fields += ", EFRD_NOM_TERMINO";
        fieldValues += ", ?";
        values.add(this.getEfrdNomTermino());

        fields += ", EFRD_TIPO_DATO";
        fieldValues += ", ?";
        values.add(this.getEfrdTipoDato());

        fields += ", EFRD_ST_FORMDET";
        fieldValues += ", ?";
        values.add(this.getEfrdStFormdet());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_FORMDET WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EFRD_ID_CLASIFIC = ?";
        values.add(this.getEfrdIdClasific());
        conditions += " AND EFRD_ID_FORMULA = ?";
        values.add(this.getEfrdIdFormula());
        conditions += " AND EFRD_ID_TERMINO = ?";
        values.add(this.getEfrdIdTermino());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FFormdet instance = (FFormdet) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEfrdIdClasific().equals(instance.getEfrdIdClasific()))
            equalObjects = false;
        if (equalObjects && !this.getEfrdIdFormula().equals(instance.getEfrdIdFormula()))
            equalObjects = false;
        if (equalObjects && !this.getEfrdIdTermino().equals(instance.getEfrdIdTermino()))
            equalObjects = false;
        if (equalObjects && !this.getEfrdNumElemento().equals(instance.getEfrdNumElemento()))
            equalObjects = false;
        if (equalObjects && !this.getEfrdNomTermino().equals(instance.getEfrdNomTermino()))
            equalObjects = false;
        if (equalObjects && !this.getEfrdTipoDato().equals(instance.getEfrdTipoDato()))
            equalObjects = false;
        if (equalObjects && !this.getEfrdStFormdet().equals(instance.getEfrdStFormdet()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FFormdet result = new FFormdet();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEfrdIdClasific((BigDecimal) objectData.getData("EFRD_ID_CLASIFIC"));
        result.setEfrdIdFormula((BigDecimal) objectData.getData("EFRD_ID_FORMULA"));
        result.setEfrdIdTermino((BigDecimal) objectData.getData("EFRD_ID_TERMINO"));
        result.setEfrdNumElemento((BigDecimal) objectData.getData("EFRD_NUM_ELEMENTO"));
        result.setEfrdNomTermino((String) objectData.getData("EFRD_NOM_TERMINO"));
        result.setEfrdTipoDato((BigDecimal) objectData.getData("EFRD_TIPO_DATO"));
        result.setEfrdStFormdet((String) objectData.getData("EFRD_ST_FORMDET"));

        return result;

    }

}
