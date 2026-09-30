package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTASNAFIN_PK", columns = { "CTN_NUM_CONTRATO", "CTN_CUENTA" }, sequences = { "MANUAL" })
public class Ctasnafin extends DomainObject {

    BigDecimal ctnNumContrato = null;
    String ctnCuenta = null;

    public Ctasnafin() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtnNumContrato(BigDecimal ctnNumContrato) {
        this.ctnNumContrato = ctnNumContrato;
    }

    public BigDecimal getCtnNumContrato() {
        return this.ctnNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtnCuenta(String ctnCuenta) {
        this.ctnCuenta = ctnCuenta;
    }

    public String getCtnCuenta() {
        return this.ctnCuenta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTASNAFIN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtnNumContrato() != null && this.getCtnNumContrato().longValue() == -999) {
            conditions += " AND CTN_NUM_CONTRATO IS NULL";
        } else if (this.getCtnNumContrato() != null) {
            conditions += " AND CTN_NUM_CONTRATO = ?";
            values.add(this.getCtnNumContrato());
        }

        if (this.getCtnCuenta() != null && "null".equals(this.getCtnCuenta())) {
            conditions += " AND CTN_CUENTA IS NULL";
        } else if (this.getCtnCuenta() != null) {
            conditions += " AND CTN_CUENTA = ?";
            values.add(this.getCtnCuenta());
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
        String sql = "SELECT * FROM CTASNAFIN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtnNumContrato() != null && this.getCtnNumContrato().longValue() == -999) {
            conditions += " AND CTN_NUM_CONTRATO IS NULL";
        } else if (this.getCtnNumContrato() != null) {
            conditions += " AND CTN_NUM_CONTRATO = ?";
            values.add(this.getCtnNumContrato());
        }

        if (this.getCtnCuenta() != null && "null".equals(this.getCtnCuenta())) {
            conditions += " AND CTN_CUENTA IS NULL";
        } else if (this.getCtnCuenta() != null) {
            conditions += " AND CTN_CUENTA = ?";
            values.add(this.getCtnCuenta());
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
        String sql = "UPDATE CTASNAFIN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTN_NUM_CONTRATO = ?";
        pkValues.add(this.getCtnNumContrato());
        conditions += " AND CTN_CUENTA = ?";
        pkValues.add(this.getCtnCuenta());
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
        String sql = "INSERT INTO CTASNAFIN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtnNumContrato());

        fields += ", CTN_CUENTA";
        fieldValues += ", ?";
        values.add(this.getCtnCuenta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTASNAFIN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTN_NUM_CONTRATO = ?";
        values.add(this.getCtnNumContrato());
        conditions += " AND CTN_CUENTA = ?";
        values.add(this.getCtnCuenta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ctasnafin instance = (Ctasnafin) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtnNumContrato().equals(instance.getCtnNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtnCuenta().equals(instance.getCtnCuenta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ctasnafin result = new Ctasnafin();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtnNumContrato((BigDecimal) objectData.getData("CTN_NUM_CONTRATO"));
        result.setCtnCuenta((String) objectData.getData("CTN_CUENTA"));

        return result;

    }

}
