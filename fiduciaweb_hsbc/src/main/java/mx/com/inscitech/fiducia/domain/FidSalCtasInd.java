package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PK_SAL_CTAS_IND", columns = { "SAL_FECHA_OPERA", "SAL_CONTRATO", "SAL_CLAVE_INV" }, sequences = { "MANUAL" })
public class FidSalCtasInd extends DomainObject {

    String salFechaOpera = null;
    BigDecimal salContrato = null;
    String salClaveInv = null;
    BigDecimal salTasa = null;
    BigDecimal salSaldoInicial = null;
    BigDecimal salDepositos = null;
    BigDecimal salRetiros = null;
    BigDecimal salIntereses = null;
    BigDecimal salIsr = null;
    BigDecimal salSaldoParcial = null;

    public FidSalCtasInd() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setSalFechaOpera(String salFechaOpera) {
        this.salFechaOpera = salFechaOpera;
    }

    public String getSalFechaOpera() {
        return this.salFechaOpera;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalContrato(BigDecimal salContrato) {
        this.salContrato = salContrato;
    }

    public BigDecimal getSalContrato() {
        return this.salContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSalClaveInv(String salClaveInv) {
        this.salClaveInv = salClaveInv;
    }

    public String getSalClaveInv() {
        return this.salClaveInv;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 11, scale = 2, javaClass = BigDecimal.class)
    public void setSalTasa(BigDecimal salTasa) {
        this.salTasa = salTasa;
    }

    public BigDecimal getSalTasa() {
        return this.salTasa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 35, scale = 2, javaClass = BigDecimal.class)
    public void setSalSaldoInicial(BigDecimal salSaldoInicial) {
        this.salSaldoInicial = salSaldoInicial;
    }

    public BigDecimal getSalSaldoInicial() {
        return this.salSaldoInicial;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 35, scale = 2, javaClass = BigDecimal.class)
    public void setSalDepositos(BigDecimal salDepositos) {
        this.salDepositos = salDepositos;
    }

    public BigDecimal getSalDepositos() {
        return this.salDepositos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 35, scale = 2, javaClass = BigDecimal.class)
    public void setSalRetiros(BigDecimal salRetiros) {
        this.salRetiros = salRetiros;
    }

    public BigDecimal getSalRetiros() {
        return this.salRetiros;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 23, scale = 2, javaClass = BigDecimal.class)
    public void setSalIntereses(BigDecimal salIntereses) {
        this.salIntereses = salIntereses;
    }

    public BigDecimal getSalIntereses() {
        return this.salIntereses;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 23, scale = 2, javaClass = BigDecimal.class)
    public void setSalIsr(BigDecimal salIsr) {
        this.salIsr = salIsr;
    }

    public BigDecimal getSalIsr() {
        return this.salIsr;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 35, scale = 2, javaClass = BigDecimal.class)
    public void setSalSaldoParcial(BigDecimal salSaldoParcial) {
        this.salSaldoParcial = salSaldoParcial;
    }

    public BigDecimal getSalSaldoParcial() {
        return this.salSaldoParcial;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_SAL_CTAS_IND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSalFechaOpera() != null && "null".equals(this.getSalFechaOpera())) {
            conditions += " AND SAL_FECHA_OPERA IS NULL";
        } else if (this.getSalFechaOpera() != null) {
            conditions += " AND SAL_FECHA_OPERA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSalFechaOpera());
        }

        if (this.getSalContrato() != null && this.getSalContrato().longValue() == -999) {
            conditions += " AND SAL_CONTRATO IS NULL";
        } else if (this.getSalContrato() != null) {
            conditions += " AND SAL_CONTRATO = ?";
            values.add(this.getSalContrato());
        }

        if (this.getSalClaveInv() != null && "null".equals(this.getSalClaveInv())) {
            conditions += " AND SAL_CLAVE_INV IS NULL";
        } else if (this.getSalClaveInv() != null) {
            conditions += " AND SAL_CLAVE_INV = ?";
            values.add(this.getSalClaveInv());
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
        String sql = "SELECT * FROM FID_SAL_CTAS_IND ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSalFechaOpera() != null && "null".equals(this.getSalFechaOpera())) {
            conditions += " AND SAL_FECHA_OPERA IS NULL";
        } else if (this.getSalFechaOpera() != null) {
            conditions += " AND SAL_FECHA_OPERA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSalFechaOpera());
        }

        if (this.getSalContrato() != null && this.getSalContrato().longValue() == -999) {
            conditions += " AND SAL_CONTRATO IS NULL";
        } else if (this.getSalContrato() != null) {
            conditions += " AND SAL_CONTRATO = ?";
            values.add(this.getSalContrato());
        }

        if (this.getSalClaveInv() != null && "null".equals(this.getSalClaveInv())) {
            conditions += " AND SAL_CLAVE_INV IS NULL";
        } else if (this.getSalClaveInv() != null) {
            conditions += " AND SAL_CLAVE_INV = ?";
            values.add(this.getSalClaveInv());
        }

        if (this.getSalTasa() != null && this.getSalTasa().longValue() == -999) {
            conditions += " AND SAL_TASA IS NULL";
        } else if (this.getSalTasa() != null) {
            conditions += " AND SAL_TASA = ?";
            values.add(this.getSalTasa());
        }

        if (this.getSalSaldoInicial() != null && this.getSalSaldoInicial().longValue() == -999) {
            conditions += " AND SAL_SALDO_INICIAL IS NULL";
        } else if (this.getSalSaldoInicial() != null) {
            conditions += " AND SAL_SALDO_INICIAL = ?";
            values.add(this.getSalSaldoInicial());
        }

        if (this.getSalDepositos() != null && this.getSalDepositos().longValue() == -999) {
            conditions += " AND SAL_DEPOSITOS IS NULL";
        } else if (this.getSalDepositos() != null) {
            conditions += " AND SAL_DEPOSITOS = ?";
            values.add(this.getSalDepositos());
        }

        if (this.getSalRetiros() != null && this.getSalRetiros().longValue() == -999) {
            conditions += " AND SAL_RETIROS IS NULL";
        } else if (this.getSalRetiros() != null) {
            conditions += " AND SAL_RETIROS = ?";
            values.add(this.getSalRetiros());
        }

        if (this.getSalIntereses() != null && this.getSalIntereses().longValue() == -999) {
            conditions += " AND SAL_INTERESES IS NULL";
        } else if (this.getSalIntereses() != null) {
            conditions += " AND SAL_INTERESES = ?";
            values.add(this.getSalIntereses());
        }

        if (this.getSalIsr() != null && this.getSalIsr().longValue() == -999) {
            conditions += " AND SAL_ISR IS NULL";
        } else if (this.getSalIsr() != null) {
            conditions += " AND SAL_ISR = ?";
            values.add(this.getSalIsr());
        }

        if (this.getSalSaldoParcial() != null && this.getSalSaldoParcial().longValue() == -999) {
            conditions += " AND SAL_SALDO_PARCIAL IS NULL";
        } else if (this.getSalSaldoParcial() != null) {
            conditions += " AND SAL_SALDO_PARCIAL = ?";
            values.add(this.getSalSaldoParcial());
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
        String sql = "UPDATE FID_SAL_CTAS_IND SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SAL_FECHA_OPERA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getSalFechaOpera());
        conditions += " AND SAL_CONTRATO = ?";
        pkValues.add(this.getSalContrato());
        conditions += " AND SAL_CLAVE_INV = ?";
        pkValues.add(this.getSalClaveInv());
        fields += " SAL_TASA = ?, ";
        values.add(this.getSalTasa());
        fields += " SAL_SALDO_INICIAL = ?, ";
        values.add(this.getSalSaldoInicial());
        fields += " SAL_DEPOSITOS = ?, ";
        values.add(this.getSalDepositos());
        fields += " SAL_RETIROS = ?, ";
        values.add(this.getSalRetiros());
        fields += " SAL_INTERESES = ?, ";
        values.add(this.getSalIntereses());
        fields += " SAL_ISR = ?, ";
        values.add(this.getSalIsr());
        fields += " SAL_SALDO_PARCIAL = ?, ";
        values.add(this.getSalSaldoParcial());
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
        String sql = "INSERT INTO FID_SAL_CTAS_IND ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SAL_FECHA_OPERA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getSalFechaOpera());

        fields += ", SAL_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSalContrato());

        fields += ", SAL_CLAVE_INV";
        fieldValues += ", ?";
        values.add(this.getSalClaveInv());

        fields += ", SAL_TASA";
        fieldValues += ", ?";
        values.add(this.getSalTasa());

        fields += ", SAL_SALDO_INICIAL";
        fieldValues += ", ?";
        values.add(this.getSalSaldoInicial());

        fields += ", SAL_DEPOSITOS";
        fieldValues += ", ?";
        values.add(this.getSalDepositos());

        fields += ", SAL_RETIROS";
        fieldValues += ", ?";
        values.add(this.getSalRetiros());

        fields += ", SAL_INTERESES";
        fieldValues += ", ?";
        values.add(this.getSalIntereses());

        fields += ", SAL_ISR";
        fieldValues += ", ?";
        values.add(this.getSalIsr());

        fields += ", SAL_SALDO_PARCIAL";
        fieldValues += ", ?";
        values.add(this.getSalSaldoParcial());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FID_SAL_CTAS_IND WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SAL_FECHA_OPERA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getSalFechaOpera());
        conditions += " AND SAL_CONTRATO = ?";
        values.add(this.getSalContrato());
        conditions += " AND SAL_CLAVE_INV = ?";
        values.add(this.getSalClaveInv());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FidSalCtasInd instance = (FidSalCtasInd) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSalFechaOpera().equals(instance.getSalFechaOpera()))
            equalObjects = false;
        if (equalObjects && !this.getSalContrato().equals(instance.getSalContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSalClaveInv().equals(instance.getSalClaveInv()))
            equalObjects = false;
        if (equalObjects && !this.getSalTasa().equals(instance.getSalTasa()))
            equalObjects = false;
        if (equalObjects && !this.getSalSaldoInicial().equals(instance.getSalSaldoInicial()))
            equalObjects = false;
        if (equalObjects && !this.getSalDepositos().equals(instance.getSalDepositos()))
            equalObjects = false;
        if (equalObjects && !this.getSalRetiros().equals(instance.getSalRetiros()))
            equalObjects = false;
        if (equalObjects && !this.getSalIntereses().equals(instance.getSalIntereses()))
            equalObjects = false;
        if (equalObjects && !this.getSalIsr().equals(instance.getSalIsr()))
            equalObjects = false;
        if (equalObjects && !this.getSalSaldoParcial().equals(instance.getSalSaldoParcial()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FidSalCtasInd result = new FidSalCtasInd();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSalFechaOpera((String) objectData.getData("SAL_FECHA_OPERA"));
        result.setSalContrato((BigDecimal) objectData.getData("SAL_CONTRATO"));
        result.setSalClaveInv((String) objectData.getData("SAL_CLAVE_INV"));
        result.setSalTasa((BigDecimal) objectData.getData("SAL_TASA"));
        result.setSalSaldoInicial((BigDecimal) objectData.getData("SAL_SALDO_INICIAL"));
        result.setSalDepositos((BigDecimal) objectData.getData("SAL_DEPOSITOS"));
        result.setSalRetiros((BigDecimal) objectData.getData("SAL_RETIROS"));
        result.setSalIntereses((BigDecimal) objectData.getData("SAL_INTERESES"));
        result.setSalIsr((BigDecimal) objectData.getData("SAL_ISR"));
        result.setSalSaldoParcial((BigDecimal) objectData.getData("SAL_SALDO_PARCIAL"));

        return result;

    }

}
