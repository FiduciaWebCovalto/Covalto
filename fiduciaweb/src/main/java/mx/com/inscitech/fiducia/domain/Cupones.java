package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CUPONES_PK", columns = { "CUP_CVE_CUPON", "CLA_DESCRIPCION", "CPO_SERIE", "CPO_ACTA_EMIS" }, sequences = { "MANUAL" })
public class Cupones extends DomainObject {

    String cpoSerie = null;
    BigDecimal cupCveCupon = null;
    BigDecimal cpoActaEmis = null;
    String claDescripcion = null;
    String cupFecIniPago = null;
    String cupFecFinPago = null;
    String cupFechaPago = null;
    String cupCveStCupon = null;

    public Cupones() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoSerie(String cpoSerie) {
        this.cpoSerie = cpoSerie;
    }

    public String getCpoSerie() {
        return this.cpoSerie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCupCveCupon(BigDecimal cupCveCupon) {
        this.cupCveCupon = cupCveCupon;
    }

    public BigDecimal getCupCveCupon() {
        return this.cupCveCupon;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpoActaEmis(BigDecimal cpoActaEmis) {
        this.cpoActaEmis = cpoActaEmis;
    }

    public BigDecimal getCpoActaEmis() {
        return this.cpoActaEmis;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setClaDescripcion(String claDescripcion) {
        this.claDescripcion = claDescripcion;
    }

    public String getClaDescripcion() {
        return this.claDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCupFecIniPago(String cupFecIniPago) {
        this.cupFecIniPago = cupFecIniPago;
    }

    public String getCupFecIniPago() {
        return this.cupFecIniPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCupFecFinPago(String cupFecFinPago) {
        this.cupFecFinPago = cupFecFinPago;
    }

    public String getCupFecFinPago() {
        return this.cupFecFinPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCupFechaPago(String cupFechaPago) {
        this.cupFechaPago = cupFechaPago;
    }

    public String getCupFechaPago() {
        return this.cupFechaPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCupCveStCupon(String cupCveStCupon) {
        this.cupCveStCupon = cupCveStCupon;
    }

    public String getCupCveStCupon() {
        return this.cupCveStCupon;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CUPONES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
        }

        if (this.getCupCveCupon() != null && this.getCupCveCupon().longValue() == -999) {
            conditions += " AND CUP_CVE_CUPON IS NULL";
        } else if (this.getCupCveCupon() != null) {
            conditions += " AND CUP_CVE_CUPON = ?";
            values.add(this.getCupCveCupon());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
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
        String sql = "SELECT * FROM CUPONES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
        }

        if (this.getCupCveCupon() != null && this.getCupCveCupon().longValue() == -999) {
            conditions += " AND CUP_CVE_CUPON IS NULL";
        } else if (this.getCupCveCupon() != null) {
            conditions += " AND CUP_CVE_CUPON = ?";
            values.add(this.getCupCveCupon());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
        }

        if (this.getCupFecIniPago() != null && "null".equals(this.getCupFecIniPago())) {
            conditions += " AND CUP_FEC_INI_PAGO IS NULL";
        } else if (this.getCupFecIniPago() != null) {
            conditions += " AND CUP_FEC_INI_PAGO = ?";
            values.add(this.getCupFecIniPago());
        }

        if (this.getCupFecFinPago() != null && "null".equals(this.getCupFecFinPago())) {
            conditions += " AND CUP_FEC_FIN_PAGO IS NULL";
        } else if (this.getCupFecFinPago() != null) {
            conditions += " AND CUP_FEC_FIN_PAGO = ?";
            values.add(this.getCupFecFinPago());
        }

        if (this.getCupFechaPago() != null && "null".equals(this.getCupFechaPago())) {
            conditions += " AND CUP_FECHA_PAGO IS NULL";
        } else if (this.getCupFechaPago() != null) {
            conditions += " AND CUP_FECHA_PAGO = ?";
            values.add(this.getCupFechaPago());
        }

        if (this.getCupCveStCupon() != null && "null".equals(this.getCupCveStCupon())) {
            conditions += " AND CUP_CVE_ST_CUPON IS NULL";
        } else if (this.getCupCveStCupon() != null) {
            conditions += " AND CUP_CVE_ST_CUPON = ?";
            values.add(this.getCupCveStCupon());
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
        String sql = "UPDATE CUPONES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPO_SERIE = ?";
        pkValues.add(this.getCpoSerie());
        conditions += " AND CUP_CVE_CUPON = ?";
        pkValues.add(this.getCupCveCupon());
        conditions += " AND CPO_ACTA_EMIS = ?";
        pkValues.add(this.getCpoActaEmis());
        conditions += " AND CLA_DESCRIPCION = ?";
        pkValues.add(this.getClaDescripcion());
        fields += " CUP_FEC_INI_PAGO = ?, ";
        values.add(this.getCupFecIniPago());
        fields += " CUP_FEC_FIN_PAGO = ?, ";
        values.add(this.getCupFecFinPago());
        fields += " CUP_FECHA_PAGO = ?, ";
        values.add(this.getCupFechaPago());
        fields += " CUP_CVE_ST_CUPON = ?, ";
        values.add(this.getCupCveStCupon());
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
        String sql = "INSERT INTO CUPONES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPO_SERIE";
        fieldValues += ", ?";
        values.add(this.getCpoSerie());

        fields += ", CUP_CVE_CUPON";
        fieldValues += ", ?";
        values.add(this.getCupCveCupon());

        fields += ", CPO_ACTA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoActaEmis());

        fields += ", CLA_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getClaDescripcion());

        fields += ", CUP_FEC_INI_PAGO";
        fieldValues += ", ?";
        values.add(this.getCupFecIniPago());

        fields += ", CUP_FEC_FIN_PAGO";
        fieldValues += ", ?";
        values.add(this.getCupFecFinPago());

        fields += ", CUP_FECHA_PAGO";
        fieldValues += ", ?";
        values.add(this.getCupFechaPago());

        fields += ", CUP_CVE_ST_CUPON";
        fieldValues += ", ?";
        values.add(this.getCupCveStCupon());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CUPONES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPO_SERIE = ?";
        values.add(this.getCpoSerie());
        conditions += " AND CUP_CVE_CUPON = ?";
        values.add(this.getCupCveCupon());
        conditions += " AND CPO_ACTA_EMIS = ?";
        values.add(this.getCpoActaEmis());
        conditions += " AND CLA_DESCRIPCION = ?";
        values.add(this.getClaDescripcion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cupones instance = (Cupones) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCpoSerie().equals(instance.getCpoSerie()))
            equalObjects = false;
        if (equalObjects && !this.getCupCveCupon().equals(instance.getCupCveCupon()))
            equalObjects = false;
        if (equalObjects && !this.getCpoActaEmis().equals(instance.getCpoActaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getClaDescripcion().equals(instance.getClaDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getCupFecIniPago().equals(instance.getCupFecIniPago()))
            equalObjects = false;
        if (equalObjects && !this.getCupFecFinPago().equals(instance.getCupFecFinPago()))
            equalObjects = false;
        if (equalObjects && !this.getCupFechaPago().equals(instance.getCupFechaPago()))
            equalObjects = false;
        if (equalObjects && !this.getCupCveStCupon().equals(instance.getCupCveStCupon()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cupones result = new Cupones();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCpoSerie((String) objectData.getData("CPO_SERIE"));
        result.setCupCveCupon((BigDecimal) objectData.getData("CUP_CVE_CUPON"));
        result.setCpoActaEmis((BigDecimal) objectData.getData("CPO_ACTA_EMIS"));
        result.setClaDescripcion((String) objectData.getData("CLA_DESCRIPCION"));
        result.setCupFecIniPago((String) objectData.getData("CUP_FEC_INI_PAGO"));
        result.setCupFecFinPago((String) objectData.getData("CUP_FEC_FIN_PAGO"));
        result.setCupFechaPago((String) objectData.getData("CUP_FECHA_PAGO"));
        result.setCupCveStCupon((String) objectData.getData("CUP_CVE_ST_CUPON"));

        return result;

    }

}
