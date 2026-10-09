package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_LAYODCARD_PK", columns = { "LADD_ID_LAYOD", "LADD_ID_SECUENCIAL" }, sequences = { "MANUAL" })
public class FLayodcard extends DomainObject {

    BigDecimal laddIdLayod = null;
    BigDecimal laddIdSecuencial = null;
    String laddNumCampo = null;
    BigDecimal laddMaxLong = null;
    BigDecimal laddTipo = null;
    String laddDefault = null;
    String laddEstatus = null;

    public FLayodcard() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLaddIdLayod(BigDecimal laddIdLayod) {
        this.laddIdLayod = laddIdLayod;
    }

    public BigDecimal getLaddIdLayod() {
        return this.laddIdLayod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLaddIdSecuencial(BigDecimal laddIdSecuencial) {
        this.laddIdSecuencial = laddIdSecuencial;
    }

    public BigDecimal getLaddIdSecuencial() {
        return this.laddIdSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setLaddNumCampo(String laddNumCampo) {
        this.laddNumCampo = laddNumCampo;
    }

    public String getLaddNumCampo() {
        return this.laddNumCampo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLaddMaxLong(BigDecimal laddMaxLong) {
        this.laddMaxLong = laddMaxLong;
    }

    public BigDecimal getLaddMaxLong() {
        return this.laddMaxLong;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setLaddTipo(BigDecimal laddTipo) {
        this.laddTipo = laddTipo;
    }

    public BigDecimal getLaddTipo() {
        return this.laddTipo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setLaddDefault(String laddDefault) {
        this.laddDefault = laddDefault;
    }

    public String getLaddDefault() {
        return this.laddDefault;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setLaddEstatus(String laddEstatus) {
        this.laddEstatus = laddEstatus;
    }

    public String getLaddEstatus() {
        return this.laddEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_LAYODCARD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getLaddIdLayod() != null && this.getLaddIdLayod().longValue() == -999) {
            conditions += " AND LADD_ID_LAYOD IS NULL";
        } else if (this.getLaddIdLayod() != null) {
            conditions += " AND LADD_ID_LAYOD = ?";
            values.add(this.getLaddIdLayod());
        }

        if (this.getLaddIdSecuencial() != null && this.getLaddIdSecuencial().longValue() == -999) {
            conditions += " AND LADD_ID_SECUENCIAL IS NULL";
        } else if (this.getLaddIdSecuencial() != null) {
            conditions += " AND LADD_ID_SECUENCIAL = ?";
            values.add(this.getLaddIdSecuencial());
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
        String sql = "SELECT * FROM F_LAYODCARD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getLaddIdLayod() != null && this.getLaddIdLayod().longValue() == -999) {
            conditions += " AND LADD_ID_LAYOD IS NULL";
        } else if (this.getLaddIdLayod() != null) {
            conditions += " AND LADD_ID_LAYOD = ?";
            values.add(this.getLaddIdLayod());
        }

        if (this.getLaddIdSecuencial() != null && this.getLaddIdSecuencial().longValue() == -999) {
            conditions += " AND LADD_ID_SECUENCIAL IS NULL";
        } else if (this.getLaddIdSecuencial() != null) {
            conditions += " AND LADD_ID_SECUENCIAL = ?";
            values.add(this.getLaddIdSecuencial());
        }

        if (this.getLaddNumCampo() != null && "null".equals(this.getLaddNumCampo())) {
            conditions += " AND LADD_NUM_CAMPO IS NULL";
        } else if (this.getLaddNumCampo() != null) {
            conditions += " AND LADD_NUM_CAMPO = ?";
            values.add(this.getLaddNumCampo());
        }

        if (this.getLaddMaxLong() != null && this.getLaddMaxLong().longValue() == -999) {
            conditions += " AND LADD_MAX_LONG IS NULL";
        } else if (this.getLaddMaxLong() != null) {
            conditions += " AND LADD_MAX_LONG = ?";
            values.add(this.getLaddMaxLong());
        }

        if (this.getLaddTipo() != null && this.getLaddTipo().longValue() == -999) {
            conditions += " AND LADD_TIPO IS NULL";
        } else if (this.getLaddTipo() != null) {
            conditions += " AND LADD_TIPO = ?";
            values.add(this.getLaddTipo());
        }

        if (this.getLaddDefault() != null && "null".equals(this.getLaddDefault())) {
            conditions += " AND LADD_DEFAULT IS NULL";
        } else if (this.getLaddDefault() != null) {
            conditions += " AND LADD_DEFAULT = ?";
            values.add(this.getLaddDefault());
        }

        if (this.getLaddEstatus() != null && "null".equals(this.getLaddEstatus())) {
            conditions += " AND LADD_ESTATUS IS NULL";
        } else if (this.getLaddEstatus() != null) {
            conditions += " AND LADD_ESTATUS = ?";
            values.add(this.getLaddEstatus());
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
        String sql = "UPDATE F_LAYODCARD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND LADD_ID_LAYOD = ?";
        pkValues.add(this.getLaddIdLayod());
        conditions += " AND LADD_ID_SECUENCIAL = ?";
        pkValues.add(this.getLaddIdSecuencial());
        fields += " LADD_NUM_CAMPO = ?, ";
        values.add(this.getLaddNumCampo());
        fields += " LADD_MAX_LONG = ?, ";
        values.add(this.getLaddMaxLong());
        fields += " LADD_TIPO = ?, ";
        values.add(this.getLaddTipo());
        fields += " LADD_DEFAULT = ?, ";
        values.add(this.getLaddDefault());
        fields += " LADD_ESTATUS = ?, ";
        values.add(this.getLaddEstatus());
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
        String sql = "INSERT INTO F_LAYODCARD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", LADD_ID_LAYOD";
        fieldValues += ", ?";
        values.add(this.getLaddIdLayod());

        fields += ", LADD_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getLaddIdSecuencial());

        fields += ", LADD_NUM_CAMPO";
        fieldValues += ", ?";
        values.add(this.getLaddNumCampo());

        fields += ", LADD_MAX_LONG";
        fieldValues += ", ?";
        values.add(this.getLaddMaxLong());

        fields += ", LADD_TIPO";
        fieldValues += ", ?";
        values.add(this.getLaddTipo());

        fields += ", LADD_DEFAULT";
        fieldValues += ", ?";
        values.add(this.getLaddDefault());

        fields += ", LADD_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getLaddEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_LAYODCARD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND LADD_ID_LAYOD = ?";
        values.add(this.getLaddIdLayod());
        conditions += " AND LADD_ID_SECUENCIAL = ?";
        values.add(this.getLaddIdSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FLayodcard instance = (FLayodcard) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getLaddIdLayod().equals(instance.getLaddIdLayod()))
            equalObjects = false;
        if (equalObjects && !this.getLaddIdSecuencial().equals(instance.getLaddIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getLaddNumCampo().equals(instance.getLaddNumCampo()))
            equalObjects = false;
        if (equalObjects && !this.getLaddMaxLong().equals(instance.getLaddMaxLong()))
            equalObjects = false;
        if (equalObjects && !this.getLaddTipo().equals(instance.getLaddTipo()))
            equalObjects = false;
        if (equalObjects && !this.getLaddDefault().equals(instance.getLaddDefault()))
            equalObjects = false;
        if (equalObjects && !this.getLaddEstatus().equals(instance.getLaddEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FLayodcard result = new FLayodcard();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setLaddIdLayod((BigDecimal) objectData.getData("LADD_ID_LAYOD"));
        result.setLaddIdSecuencial((BigDecimal) objectData.getData("LADD_ID_SECUENCIAL"));
        result.setLaddNumCampo((String) objectData.getData("LADD_NUM_CAMPO"));
        result.setLaddMaxLong((BigDecimal) objectData.getData("LADD_MAX_LONG"));
        result.setLaddTipo((BigDecimal) objectData.getData("LADD_TIPO"));
        result.setLaddDefault((String) objectData.getData("LADD_DEFAULT"));
        result.setLaddEstatus((String) objectData.getData("LADD_ESTATUS"));

        return result;

    }

}
