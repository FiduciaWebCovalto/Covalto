package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FSecFuturosAux extends DomainObject {

    BigDecimal fsfSecuencial = null;
    String fsfFecha = null;
    BigDecimal fsfCompra = null;
    BigDecimal fsfVenta = null;
    String fsfPizarra = null;
    BigDecimal fsfIpc = null;

    public FSecFuturosAux() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsfSecuencial(BigDecimal fsfSecuencial) {
        this.fsfSecuencial = fsfSecuencial;
    }

    public BigDecimal getFsfSecuencial() {
        return this.fsfSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFsfFecha(String fsfFecha) {
        this.fsfFecha = fsfFecha;
    }

    public String getFsfFecha() {
        return this.fsfFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsfCompra(BigDecimal fsfCompra) {
        this.fsfCompra = fsfCompra;
    }

    public BigDecimal getFsfCompra() {
        return this.fsfCompra;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsfVenta(BigDecimal fsfVenta) {
        this.fsfVenta = fsfVenta;
    }

    public BigDecimal getFsfVenta() {
        return this.fsfVenta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFsfPizarra(String fsfPizarra) {
        this.fsfPizarra = fsfPizarra;
    }

    public String getFsfPizarra() {
        return this.fsfPizarra;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setFsfIpc(BigDecimal fsfIpc) {
        this.fsfIpc = fsfIpc;
    }

    public BigDecimal getFsfIpc() {
        return this.fsfIpc;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_SEC_FUTUROS_AUX ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM F_SEC_FUTUROS_AUX ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsfSecuencial() != null && this.getFsfSecuencial().longValue() == -999) {
            conditions += " AND FSF_SECUENCIAL IS NULL";
        } else if (this.getFsfSecuencial() != null) {
            conditions += " AND FSF_SECUENCIAL = ?";
            values.add(this.getFsfSecuencial());
        }

        if (this.getFsfFecha() != null && "null".equals(this.getFsfFecha())) {
            conditions += " AND FSF_FECHA IS NULL";
        } else if (this.getFsfFecha() != null) {
            conditions += " AND FSF_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFsfFecha());
        }

        if (this.getFsfCompra() != null && this.getFsfCompra().longValue() == -999) {
            conditions += " AND FSF_COMPRA IS NULL";
        } else if (this.getFsfCompra() != null) {
            conditions += " AND FSF_COMPRA = ?";
            values.add(this.getFsfCompra());
        }

        if (this.getFsfVenta() != null && this.getFsfVenta().longValue() == -999) {
            conditions += " AND FSF_VENTA IS NULL";
        } else if (this.getFsfVenta() != null) {
            conditions += " AND FSF_VENTA = ?";
            values.add(this.getFsfVenta());
        }

        if (this.getFsfPizarra() != null && "null".equals(this.getFsfPizarra())) {
            conditions += " AND FSF_PIZARRA IS NULL";
        } else if (this.getFsfPizarra() != null) {
            conditions += " AND FSF_PIZARRA = ?";
            values.add(this.getFsfPizarra());
        }

        if (this.getFsfIpc() != null && this.getFsfIpc().longValue() == -999) {
            conditions += " AND FSF_IPC IS NULL";
        } else if (this.getFsfIpc() != null) {
            conditions += " AND FSF_IPC = ?";
            values.add(this.getFsfIpc());
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
        String sql = "UPDATE F_SEC_FUTUROS_AUX SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FSF_SECUENCIAL = ?, ";
        values.add(this.getFsfSecuencial());
        fields += " FSF_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFsfFecha());
        fields += " FSF_COMPRA = ?, ";
        values.add(this.getFsfCompra());
        fields += " FSF_VENTA = ?, ";
        values.add(this.getFsfVenta());
        fields += " FSF_PIZARRA = ?, ";
        values.add(this.getFsfPizarra());
        fields += " FSF_IPC = ?, ";
        values.add(this.getFsfIpc());
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
        String sql = "INSERT INTO F_SEC_FUTUROS_AUX ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FSF_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFsfSecuencial());

        fields += ", FSF_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFsfFecha());

        fields += ", FSF_COMPRA";
        fieldValues += ", ?";
        values.add(this.getFsfCompra());

        fields += ", FSF_VENTA";
        fieldValues += ", ?";
        values.add(this.getFsfVenta());

        fields += ", FSF_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getFsfPizarra());

        fields += ", FSF_IPC";
        fieldValues += ", ?";
        values.add(this.getFsfIpc());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_SEC_FUTUROS_AUX WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FSecFuturosAux instance = (FSecFuturosAux) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFsfSecuencial().equals(instance.getFsfSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFsfFecha().equals(instance.getFsfFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFsfCompra().equals(instance.getFsfCompra()))
            equalObjects = false;
        if (equalObjects && !this.getFsfVenta().equals(instance.getFsfVenta()))
            equalObjects = false;
        if (equalObjects && !this.getFsfPizarra().equals(instance.getFsfPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getFsfIpc().equals(instance.getFsfIpc()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FSecFuturosAux result = new FSecFuturosAux();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFsfSecuencial((BigDecimal) objectData.getData("FSF_SECUENCIAL"));
        result.setFsfFecha((String) objectData.getData("FSF_FECHA"));
        result.setFsfCompra((BigDecimal) objectData.getData("FSF_COMPRA"));
        result.setFsfVenta((BigDecimal) objectData.getData("FSF_VENTA"));
        result.setFsfPizarra((String) objectData.getData("FSF_PIZARRA"));
        result.setFsfIpc((BigDecimal) objectData.getData("FSF_IPC"));

        return result;

    }

}
