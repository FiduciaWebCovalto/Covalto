package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PRODUCTO_SERIE_PK", columns = { "FPS_ID_PROD_ESTA", "FPS_ID_PRODUCTO" }, sequences = { "MANUAL" })
public class FProductoSerie extends DomainObject {

    BigDecimal fpsIdProdEsta = null;
    BigDecimal fpsIdProducto = null;
    BigDecimal fpsNumSerie = null;
    String fpsCveStSerie = null;

    public FProductoSerie() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpsIdProdEsta(BigDecimal fpsIdProdEsta) {
        this.fpsIdProdEsta = fpsIdProdEsta;
    }

    public BigDecimal getFpsIdProdEsta() {
        return this.fpsIdProdEsta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpsIdProducto(BigDecimal fpsIdProducto) {
        this.fpsIdProducto = fpsIdProducto;
    }

    public BigDecimal getFpsIdProducto() {
        return this.fpsIdProducto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpsNumSerie(BigDecimal fpsNumSerie) {
        this.fpsNumSerie = fpsNumSerie;
    }

    public BigDecimal getFpsNumSerie() {
        return this.fpsNumSerie;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFpsCveStSerie(String fpsCveStSerie) {
        this.fpsCveStSerie = fpsCveStSerie;
    }

    public String getFpsCveStSerie() {
        return this.fpsCveStSerie;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PRODUCTO_SERIE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFpsIdProdEsta() != null && this.getFpsIdProdEsta().longValue() == -999) {
            conditions += " AND FPS_ID_PROD_ESTA IS NULL";
        } else if (this.getFpsIdProdEsta() != null) {
            conditions += " AND FPS_ID_PROD_ESTA = ?";
            values.add(this.getFpsIdProdEsta());
        }

        if (this.getFpsIdProducto() != null && this.getFpsIdProducto().longValue() == -999) {
            conditions += " AND FPS_ID_PRODUCTO IS NULL";
        } else if (this.getFpsIdProducto() != null) {
            conditions += " AND FPS_ID_PRODUCTO = ?";
            values.add(this.getFpsIdProducto());
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
        String sql = "SELECT * FROM F_PRODUCTO_SERIE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFpsIdProdEsta() != null && this.getFpsIdProdEsta().longValue() == -999) {
            conditions += " AND FPS_ID_PROD_ESTA IS NULL";
        } else if (this.getFpsIdProdEsta() != null) {
            conditions += " AND FPS_ID_PROD_ESTA = ?";
            values.add(this.getFpsIdProdEsta());
        }

        if (this.getFpsIdProducto() != null && this.getFpsIdProducto().longValue() == -999) {
            conditions += " AND FPS_ID_PRODUCTO IS NULL";
        } else if (this.getFpsIdProducto() != null) {
            conditions += " AND FPS_ID_PRODUCTO = ?";
            values.add(this.getFpsIdProducto());
        }

        if (this.getFpsNumSerie() != null && this.getFpsNumSerie().longValue() == -999) {
            conditions += " AND FPS_NUM_SERIE IS NULL";
        } else if (this.getFpsNumSerie() != null) {
            conditions += " AND FPS_NUM_SERIE = ?";
            values.add(this.getFpsNumSerie());
        }

        if (this.getFpsCveStSerie() != null && "null".equals(this.getFpsCveStSerie())) {
            conditions += " AND FPS_CVE_ST_SERIE IS NULL";
        } else if (this.getFpsCveStSerie() != null) {
            conditions += " AND FPS_CVE_ST_SERIE = ?";
            values.add(this.getFpsCveStSerie());
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
        String sql = "UPDATE F_PRODUCTO_SERIE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FPS_ID_PROD_ESTA = ?";
        pkValues.add(this.getFpsIdProdEsta());
        conditions += " AND FPS_ID_PRODUCTO = ?";
        pkValues.add(this.getFpsIdProducto());
        fields += " FPS_NUM_SERIE = ?, ";
        values.add(this.getFpsNumSerie());
        fields += " FPS_CVE_ST_SERIE = ?, ";
        values.add(this.getFpsCveStSerie());
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
        String sql = "INSERT INTO F_PRODUCTO_SERIE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPS_ID_PROD_ESTA";
        fieldValues += ", ?";
        values.add(this.getFpsIdProdEsta());

        fields += ", FPS_ID_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getFpsIdProducto());

        fields += ", FPS_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getFpsNumSerie());

        fields += ", FPS_CVE_ST_SERIE";
        fieldValues += ", ?";
        values.add(this.getFpsCveStSerie());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PRODUCTO_SERIE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FPS_ID_PROD_ESTA = ?";
        values.add(this.getFpsIdProdEsta());
        conditions += " AND FPS_ID_PRODUCTO = ?";
        values.add(this.getFpsIdProducto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FProductoSerie instance = (FProductoSerie) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFpsIdProdEsta().equals(instance.getFpsIdProdEsta()))
            equalObjects = false;
        if (equalObjects && !this.getFpsIdProducto().equals(instance.getFpsIdProducto()))
            equalObjects = false;
        if (equalObjects && !this.getFpsNumSerie().equals(instance.getFpsNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getFpsCveStSerie().equals(instance.getFpsCveStSerie()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FProductoSerie result = new FProductoSerie();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFpsIdProdEsta((BigDecimal) objectData.getData("FPS_ID_PROD_ESTA"));
        result.setFpsIdProducto((BigDecimal) objectData.getData("FPS_ID_PRODUCTO"));
        result.setFpsNumSerie((BigDecimal) objectData.getData("FPS_NUM_SERIE"));
        result.setFpsCveStSerie((String) objectData.getData("FPS_CVE_ST_SERIE"));

        return result;

    }

}
