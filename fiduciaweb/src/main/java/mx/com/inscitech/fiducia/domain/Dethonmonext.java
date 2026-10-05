package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DETHONMONEXT_PK", columns = { "DHM_FOLIO" }, sequences = { "MAX" })
public class Dethonmonext extends DomainObject {

    BigDecimal dhmFolio = null;
    BigDecimal dhmTipoCambio = null;
    BigDecimal dhmMoneda = null;

    public Dethonmonext() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setDhmFolio(BigDecimal dhmFolio) {
        this.dhmFolio = dhmFolio;
    }

    public BigDecimal getDhmFolio() {
        return this.dhmFolio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setDhmTipoCambio(BigDecimal dhmTipoCambio) {
        this.dhmTipoCambio = dhmTipoCambio;
    }

    public BigDecimal getDhmTipoCambio() {
        return this.dhmTipoCambio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setDhmMoneda(BigDecimal dhmMoneda) {
        this.dhmMoneda = dhmMoneda;
    }

    public BigDecimal getDhmMoneda() {
        return this.dhmMoneda;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DETHONMONEXT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDhmFolio() != null && this.getDhmFolio().longValue() == -999) {
            conditions += " AND DHM_FOLIO IS NULL";
        } else if (this.getDhmFolio() != null) {
            conditions += " AND DHM_FOLIO = ?";
            values.add(this.getDhmFolio());
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
        String sql = "SELECT * FROM DETHONMONEXT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDhmFolio() != null && this.getDhmFolio().longValue() == -999) {
            conditions += " AND DHM_FOLIO IS NULL";
        } else if (this.getDhmFolio() != null) {
            conditions += " AND DHM_FOLIO = ?";
            values.add(this.getDhmFolio());
        }

        if (this.getDhmTipoCambio() != null && this.getDhmTipoCambio().longValue() == -999) {
            conditions += " AND DHM_TIPO_CAMBIO IS NULL";
        } else if (this.getDhmTipoCambio() != null) {
            conditions += " AND DHM_TIPO_CAMBIO = ?";
            values.add(this.getDhmTipoCambio());
        }

        if (this.getDhmMoneda() != null && this.getDhmMoneda().longValue() == -999) {
            conditions += " AND DHM_MONEDA IS NULL";
        } else if (this.getDhmMoneda() != null) {
            conditions += " AND DHM_MONEDA = ?";
            values.add(this.getDhmMoneda());
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
        String sql = "UPDATE DETHONMONEXT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DHM_FOLIO = ?";
        pkValues.add(this.getDhmFolio());
        fields += " DHM_TIPO_CAMBIO = ?, ";
        values.add(this.getDhmTipoCambio());
        fields += " DHM_MONEDA = ?, ";
        values.add(this.getDhmMoneda());
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
        String sql = "INSERT INTO DETHONMONEXT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DHM_FOLIO";
        fieldValues += ", ?";
        values.add(this.getDhmFolio());

        fields += ", DHM_TIPO_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getDhmTipoCambio());

        fields += ", DHM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getDhmMoneda());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DETHONMONEXT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DHM_FOLIO = ?";
        values.add(this.getDhmFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Dethonmonext instance = (Dethonmonext) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDhmFolio().equals(instance.getDhmFolio()))
            equalObjects = false;
        if (equalObjects && !this.getDhmTipoCambio().equals(instance.getDhmTipoCambio()))
            equalObjects = false;
        if (equalObjects && !this.getDhmMoneda().equals(instance.getDhmMoneda()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Dethonmonext result = new Dethonmonext();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDhmFolio((BigDecimal) objectData.getData("DHM_FOLIO"));
        result.setDhmTipoCambio((BigDecimal) objectData.getData("DHM_TIPO_CAMBIO"));
        result.setDhmMoneda((BigDecimal) objectData.getData("DHM_MONEDA"));

        return result;

    }

}
