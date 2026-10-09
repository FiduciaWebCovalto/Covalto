package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_IMUPAGOS_PK", columns = { "FPAI_ID_FIDEICOMISO", "FPAI_ID_SUBCUENTA", "FPAI_ID_BIEN", "FPAI_ID_DEPTO", "FPAI_ID_PERIODO" },
            sequences = { "MANUAL" })
public class FImupagos extends DomainObject {

    BigDecimal fpaiIdFideicomiso = null;
    BigDecimal fpaiIdSubcuenta = null;
    String fpaiIdBien = null;
    String fpaiIdDepto = null;
    BigDecimal fpaiIdPeriodo = null;
    String fpaiFecPago = null;
    BigDecimal fpaiAbono = null;
    BigDecimal fpaiSaldo = null;

    public FImupagos() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaiIdFideicomiso(BigDecimal fpaiIdFideicomiso) {
        this.fpaiIdFideicomiso = fpaiIdFideicomiso;
    }

    public BigDecimal getFpaiIdFideicomiso() {
        return this.fpaiIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaiIdSubcuenta(BigDecimal fpaiIdSubcuenta) {
        this.fpaiIdSubcuenta = fpaiIdSubcuenta;
    }

    public BigDecimal getFpaiIdSubcuenta() {
        return this.fpaiIdSubcuenta;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFpaiIdBien(String fpaiIdBien) {
        this.fpaiIdBien = fpaiIdBien;
    }

    public String getFpaiIdBien() {
        return this.fpaiIdBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFpaiIdDepto(String fpaiIdDepto) {
        this.fpaiIdDepto = fpaiIdDepto;
    }

    public String getFpaiIdDepto() {
        return this.fpaiIdDepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFpaiIdPeriodo(BigDecimal fpaiIdPeriodo) {
        this.fpaiIdPeriodo = fpaiIdPeriodo;
    }

    public BigDecimal getFpaiIdPeriodo() {
        return this.fpaiIdPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFpaiFecPago(String fpaiFecPago) {
        this.fpaiFecPago = fpaiFecPago;
    }

    public String getFpaiFecPago() {
        return this.fpaiFecPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFpaiAbono(BigDecimal fpaiAbono) {
        this.fpaiAbono = fpaiAbono;
    }

    public BigDecimal getFpaiAbono() {
        return this.fpaiAbono;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFpaiSaldo(BigDecimal fpaiSaldo) {
        this.fpaiSaldo = fpaiSaldo;
    }

    public BigDecimal getFpaiSaldo() {
        return this.fpaiSaldo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_IMUPAGOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFpaiIdFideicomiso() != null && this.getFpaiIdFideicomiso().longValue() == -999) {
            conditions += " AND FPAI_ID_FIDEICOMISO IS NULL";
        } else if (this.getFpaiIdFideicomiso() != null) {
            conditions += " AND FPAI_ID_FIDEICOMISO = ?";
            values.add(this.getFpaiIdFideicomiso());
        }

        if (this.getFpaiIdSubcuenta() != null && this.getFpaiIdSubcuenta().longValue() == -999) {
            conditions += " AND FPAI_ID_SUBCUENTA IS NULL";
        } else if (this.getFpaiIdSubcuenta() != null) {
            conditions += " AND FPAI_ID_SUBCUENTA = ?";
            values.add(this.getFpaiIdSubcuenta());
        }

        if (this.getFpaiIdBien() != null && "null".equals(this.getFpaiIdBien())) {
            conditions += " AND FPAI_ID_BIEN IS NULL";
        } else if (this.getFpaiIdBien() != null) {
            conditions += " AND FPAI_ID_BIEN = ?";
            values.add(this.getFpaiIdBien());
        }

        if (this.getFpaiIdDepto() != null && "null".equals(this.getFpaiIdDepto())) {
            conditions += " AND FPAI_ID_DEPTO IS NULL";
        } else if (this.getFpaiIdDepto() != null) {
            conditions += " AND FPAI_ID_DEPTO = ?";
            values.add(this.getFpaiIdDepto());
        }

        if (this.getFpaiIdPeriodo() != null && this.getFpaiIdPeriodo().longValue() == -999) {
            conditions += " AND FPAI_ID_PERIODO IS NULL";
        } else if (this.getFpaiIdPeriodo() != null) {
            conditions += " AND FPAI_ID_PERIODO = ?";
            values.add(this.getFpaiIdPeriodo());
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
        String sql = "SELECT * FROM F_IMUPAGOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFpaiIdFideicomiso() != null && this.getFpaiIdFideicomiso().longValue() == -999) {
            conditions += " AND FPAI_ID_FIDEICOMISO IS NULL";
        } else if (this.getFpaiIdFideicomiso() != null) {
            conditions += " AND FPAI_ID_FIDEICOMISO = ?";
            values.add(this.getFpaiIdFideicomiso());
        }

        if (this.getFpaiIdSubcuenta() != null && this.getFpaiIdSubcuenta().longValue() == -999) {
            conditions += " AND FPAI_ID_SUBCUENTA IS NULL";
        } else if (this.getFpaiIdSubcuenta() != null) {
            conditions += " AND FPAI_ID_SUBCUENTA = ?";
            values.add(this.getFpaiIdSubcuenta());
        }

        if (this.getFpaiIdBien() != null && "null".equals(this.getFpaiIdBien())) {
            conditions += " AND FPAI_ID_BIEN IS NULL";
        } else if (this.getFpaiIdBien() != null) {
            conditions += " AND FPAI_ID_BIEN = ?";
            values.add(this.getFpaiIdBien());
        }

        if (this.getFpaiIdDepto() != null && "null".equals(this.getFpaiIdDepto())) {
            conditions += " AND FPAI_ID_DEPTO IS NULL";
        } else if (this.getFpaiIdDepto() != null) {
            conditions += " AND FPAI_ID_DEPTO = ?";
            values.add(this.getFpaiIdDepto());
        }

        if (this.getFpaiIdPeriodo() != null && this.getFpaiIdPeriodo().longValue() == -999) {
            conditions += " AND FPAI_ID_PERIODO IS NULL";
        } else if (this.getFpaiIdPeriodo() != null) {
            conditions += " AND FPAI_ID_PERIODO = ?";
            values.add(this.getFpaiIdPeriodo());
        }

        if (this.getFpaiFecPago() != null && "null".equals(this.getFpaiFecPago())) {
            conditions += " AND FPAI_FEC_PAGO IS NULL";
        } else if (this.getFpaiFecPago() != null) {
            conditions += " AND FPAI_FEC_PAGO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFpaiFecPago());
        }

        if (this.getFpaiAbono() != null && this.getFpaiAbono().longValue() == -999) {
            conditions += " AND FPAI_ABONO IS NULL";
        } else if (this.getFpaiAbono() != null) {
            conditions += " AND FPAI_ABONO = ?";
            values.add(this.getFpaiAbono());
        }

        if (this.getFpaiSaldo() != null && this.getFpaiSaldo().longValue() == -999) {
            conditions += " AND FPAI_SALDO IS NULL";
        } else if (this.getFpaiSaldo() != null) {
            conditions += " AND FPAI_SALDO = ?";
            values.add(this.getFpaiSaldo());
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
        String sql = "UPDATE F_IMUPAGOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FPAI_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFpaiIdFideicomiso());
        conditions += " AND FPAI_ID_SUBCUENTA = ?";
        pkValues.add(this.getFpaiIdSubcuenta());
        conditions += " AND FPAI_ID_BIEN = ?";
        pkValues.add(this.getFpaiIdBien());
        conditions += " AND FPAI_ID_DEPTO = ?";
        pkValues.add(this.getFpaiIdDepto());
        conditions += " AND FPAI_ID_PERIODO = ?";
        pkValues.add(this.getFpaiIdPeriodo());
        fields += " FPAI_FEC_PAGO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFpaiFecPago());
        fields += " FPAI_ABONO = ?, ";
        values.add(this.getFpaiAbono());
        fields += " FPAI_SALDO = ?, ";
        values.add(this.getFpaiSaldo());
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
        String sql = "INSERT INTO F_IMUPAGOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FPAI_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFpaiIdFideicomiso());

        fields += ", FPAI_ID_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFpaiIdSubcuenta());

        fields += ", FPAI_ID_BIEN";
        fieldValues += ", ?";
        values.add(this.getFpaiIdBien());

        fields += ", FPAI_ID_DEPTO";
        fieldValues += ", ?";
        values.add(this.getFpaiIdDepto());

        fields += ", FPAI_ID_PERIODO";
        fieldValues += ", ?";
        values.add(this.getFpaiIdPeriodo());

        fields += ", FPAI_FEC_PAGO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFpaiFecPago());

        fields += ", FPAI_ABONO";
        fieldValues += ", ?";
        values.add(this.getFpaiAbono());

        fields += ", FPAI_SALDO";
        fieldValues += ", ?";
        values.add(this.getFpaiSaldo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_IMUPAGOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FPAI_ID_FIDEICOMISO = ?";
        values.add(this.getFpaiIdFideicomiso());
        conditions += " AND FPAI_ID_SUBCUENTA = ?";
        values.add(this.getFpaiIdSubcuenta());
        conditions += " AND FPAI_ID_BIEN = ?";
        values.add(this.getFpaiIdBien());
        conditions += " AND FPAI_ID_DEPTO = ?";
        values.add(this.getFpaiIdDepto());
        conditions += " AND FPAI_ID_PERIODO = ?";
        values.add(this.getFpaiIdPeriodo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FImupagos instance = (FImupagos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFpaiIdFideicomiso().equals(instance.getFpaiIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFpaiIdSubcuenta().equals(instance.getFpaiIdSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFpaiIdBien().equals(instance.getFpaiIdBien()))
            equalObjects = false;
        if (equalObjects && !this.getFpaiIdDepto().equals(instance.getFpaiIdDepto()))
            equalObjects = false;
        if (equalObjects && !this.getFpaiIdPeriodo().equals(instance.getFpaiIdPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getFpaiFecPago().equals(instance.getFpaiFecPago()))
            equalObjects = false;
        if (equalObjects && !this.getFpaiAbono().equals(instance.getFpaiAbono()))
            equalObjects = false;
        if (equalObjects && !this.getFpaiSaldo().equals(instance.getFpaiSaldo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FImupagos result = new FImupagos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFpaiIdFideicomiso((BigDecimal) objectData.getData("FPAI_ID_FIDEICOMISO"));
        result.setFpaiIdSubcuenta((BigDecimal) objectData.getData("FPAI_ID_SUBCUENTA"));
        result.setFpaiIdBien((String) objectData.getData("FPAI_ID_BIEN"));
        result.setFpaiIdDepto((String) objectData.getData("FPAI_ID_DEPTO"));
        result.setFpaiIdPeriodo((BigDecimal) objectData.getData("FPAI_ID_PERIODO"));
        result.setFpaiFecPago((String) objectData.getData("FPAI_FEC_PAGO"));
        result.setFpaiAbono((BigDecimal) objectData.getData("FPAI_ABONO"));
        result.setFpaiSaldo((BigDecimal) objectData.getData("FPAI_SALDO"));

        return result;

    }

}
