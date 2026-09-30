package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONOCEPQ_PK", columns = { "COP_PER_NUM_USUARI", "COP_PAQ_IDENTIFICAD" }, sequences = { "MANUAL" })
public class Conocepq extends DomainObject {

    BigDecimal copPaqIdentificad = null;
    BigDecimal copPerNumUsuari = null;
    BigDecimal copPjeHabla = null;

    public Conocepq() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCopPaqIdentificad(BigDecimal copPaqIdentificad) {
        this.copPaqIdentificad = copPaqIdentificad;
    }

    public BigDecimal getCopPaqIdentificad() {
        return this.copPaqIdentificad;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCopPerNumUsuari(BigDecimal copPerNumUsuari) {
        this.copPerNumUsuari = copPerNumUsuari;
    }

    public BigDecimal getCopPerNumUsuari() {
        return this.copPerNumUsuari;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCopPjeHabla(BigDecimal copPjeHabla) {
        this.copPjeHabla = copPjeHabla;
    }

    public BigDecimal getCopPjeHabla() {
        return this.copPjeHabla;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONOCEPQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCopPaqIdentificad() != null && this.getCopPaqIdentificad().longValue() == -999) {
            conditions += " AND COP_PAQ_IDENTIFICAD IS NULL";
        } else if (this.getCopPaqIdentificad() != null) {
            conditions += " AND COP_PAQ_IDENTIFICAD = ?";
            values.add(this.getCopPaqIdentificad());
        }

        if (this.getCopPerNumUsuari() != null && this.getCopPerNumUsuari().longValue() == -999) {
            conditions += " AND COP_PER_NUM_USUARI IS NULL";
        } else if (this.getCopPerNumUsuari() != null) {
            conditions += " AND COP_PER_NUM_USUARI = ?";
            values.add(this.getCopPerNumUsuari());
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
        String sql = "SELECT * FROM CONOCEPQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCopPaqIdentificad() != null && this.getCopPaqIdentificad().longValue() == -999) {
            conditions += " AND COP_PAQ_IDENTIFICAD IS NULL";
        } else if (this.getCopPaqIdentificad() != null) {
            conditions += " AND COP_PAQ_IDENTIFICAD = ?";
            values.add(this.getCopPaqIdentificad());
        }

        if (this.getCopPerNumUsuari() != null && this.getCopPerNumUsuari().longValue() == -999) {
            conditions += " AND COP_PER_NUM_USUARI IS NULL";
        } else if (this.getCopPerNumUsuari() != null) {
            conditions += " AND COP_PER_NUM_USUARI = ?";
            values.add(this.getCopPerNumUsuari());
        }

        if (this.getCopPjeHabla() != null && this.getCopPjeHabla().longValue() == -999) {
            conditions += " AND COP_PJE_HABLA IS NULL";
        } else if (this.getCopPjeHabla() != null) {
            conditions += " AND COP_PJE_HABLA = ?";
            values.add(this.getCopPjeHabla());
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
        String sql = "UPDATE CONOCEPQ SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND COP_PAQ_IDENTIFICAD = ?";
        pkValues.add(this.getCopPaqIdentificad());
        conditions += " AND COP_PER_NUM_USUARI = ?";
        pkValues.add(this.getCopPerNumUsuari());
        fields += " COP_PJE_HABLA = ?, ";
        values.add(this.getCopPjeHabla());
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
        String sql = "INSERT INTO CONOCEPQ ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", COP_PAQ_IDENTIFICAD";
        fieldValues += ", ?";
        values.add(this.getCopPaqIdentificad());

        fields += ", COP_PER_NUM_USUARI";
        fieldValues += ", ?";
        values.add(this.getCopPerNumUsuari());

        fields += ", COP_PJE_HABLA";
        fieldValues += ", ?";
        values.add(this.getCopPjeHabla());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONOCEPQ WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND COP_PAQ_IDENTIFICAD = ?";
        values.add(this.getCopPaqIdentificad());
        conditions += " AND COP_PER_NUM_USUARI = ?";
        values.add(this.getCopPerNumUsuari());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Conocepq instance = (Conocepq) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCopPaqIdentificad().equals(instance.getCopPaqIdentificad()))
            equalObjects = false;
        if (equalObjects && !this.getCopPerNumUsuari().equals(instance.getCopPerNumUsuari()))
            equalObjects = false;
        if (equalObjects && !this.getCopPjeHabla().equals(instance.getCopPjeHabla()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Conocepq result = new Conocepq();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCopPaqIdentificad((BigDecimal) objectData.getData("COP_PAQ_IDENTIFICAD"));
        result.setCopPerNumUsuari((BigDecimal) objectData.getData("COP_PER_NUM_USUARI"));
        result.setCopPjeHabla((BigDecimal) objectData.getData("COP_PJE_HABLA"));

        return result;

    }

}
