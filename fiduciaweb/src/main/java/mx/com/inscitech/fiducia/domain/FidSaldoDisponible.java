package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FID_SALDO_DISPONIBLE_PK", columns = { "FSD_NO_FIDEICOMISO", "FSD_NO_CTO_INVERSION" }, sequences = { "MANUAL" })
public class FidSaldoDisponible extends DomainObject {

    BigDecimal fsdNoFideicomiso = null;
    BigDecimal fsdNoCtoInversion = null;
    String fsdFecha = null;
    BigDecimal fsdSaldoTas = null;
    BigDecimal fsdImpRetiros = null;
    BigDecimal fsdImpDepositos = null;
    BigDecimal fsdSaldoDisponible = null;

    public FidSaldoDisponible() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsdNoFideicomiso(BigDecimal fsdNoFideicomiso) {
        this.fsdNoFideicomiso = fsdNoFideicomiso;
    }

    public BigDecimal getFsdNoFideicomiso() {
        return this.fsdNoFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsdNoCtoInversion(BigDecimal fsdNoCtoInversion) {
        this.fsdNoCtoInversion = fsdNoCtoInversion;
    }

    public BigDecimal getFsdNoCtoInversion() {
        return this.fsdNoCtoInversion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFsdFecha(String fsdFecha) {
        this.fsdFecha = fsdFecha;
    }

    public String getFsdFecha() {
        return this.fsdFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFsdSaldoTas(BigDecimal fsdSaldoTas) {
        this.fsdSaldoTas = fsdSaldoTas;
    }

    public BigDecimal getFsdSaldoTas() {
        return this.fsdSaldoTas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFsdImpRetiros(BigDecimal fsdImpRetiros) {
        this.fsdImpRetiros = fsdImpRetiros;
    }

    public BigDecimal getFsdImpRetiros() {
        return this.fsdImpRetiros;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFsdImpDepositos(BigDecimal fsdImpDepositos) {
        this.fsdImpDepositos = fsdImpDepositos;
    }

    public BigDecimal getFsdImpDepositos() {
        return this.fsdImpDepositos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFsdSaldoDisponible(BigDecimal fsdSaldoDisponible) {
        this.fsdSaldoDisponible = fsdSaldoDisponible;
    }

    public BigDecimal getFsdSaldoDisponible() {
        return this.fsdSaldoDisponible;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FID_SALDO_DISPONIBLE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsdNoFideicomiso() != null && this.getFsdNoFideicomiso().longValue() == -999) {
            conditions += " AND FSD_NO_FIDEICOMISO IS NULL";
        } else if (this.getFsdNoFideicomiso() != null) {
            conditions += " AND FSD_NO_FIDEICOMISO = ?";
            values.add(this.getFsdNoFideicomiso());
        }

        if (this.getFsdNoCtoInversion() != null && this.getFsdNoCtoInversion().longValue() == -999) {
            conditions += " AND FSD_NO_CTO_INVERSION IS NULL";
        } else if (this.getFsdNoCtoInversion() != null) {
            conditions += " AND FSD_NO_CTO_INVERSION = ?";
            values.add(this.getFsdNoCtoInversion());
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
        String sql = "SELECT * FROM FID_SALDO_DISPONIBLE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsdNoFideicomiso() != null && this.getFsdNoFideicomiso().longValue() == -999) {
            conditions += " AND FSD_NO_FIDEICOMISO IS NULL";
        } else if (this.getFsdNoFideicomiso() != null) {
            conditions += " AND FSD_NO_FIDEICOMISO = ?";
            values.add(this.getFsdNoFideicomiso());
        }

        if (this.getFsdNoCtoInversion() != null && this.getFsdNoCtoInversion().longValue() == -999) {
            conditions += " AND FSD_NO_CTO_INVERSION IS NULL";
        } else if (this.getFsdNoCtoInversion() != null) {
            conditions += " AND FSD_NO_CTO_INVERSION = ?";
            values.add(this.getFsdNoCtoInversion());
        }

        if (this.getFsdFecha() != null && "null".equals(this.getFsdFecha())) {
            conditions += " AND FSD_FECHA IS NULL";
        } else if (this.getFsdFecha() != null) {
            conditions += " AND FSD_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFsdFecha());
        }

        if (this.getFsdSaldoTas() != null && this.getFsdSaldoTas().longValue() == -999) {
            conditions += " AND FSD_SALDO_TAS IS NULL";
        } else if (this.getFsdSaldoTas() != null) {
            conditions += " AND FSD_SALDO_TAS = ?";
            values.add(this.getFsdSaldoTas());
        }

        if (this.getFsdImpRetiros() != null && this.getFsdImpRetiros().longValue() == -999) {
            conditions += " AND FSD_IMP_RETIROS IS NULL";
        } else if (this.getFsdImpRetiros() != null) {
            conditions += " AND FSD_IMP_RETIROS = ?";
            values.add(this.getFsdImpRetiros());
        }

        if (this.getFsdImpDepositos() != null && this.getFsdImpDepositos().longValue() == -999) {
            conditions += " AND FSD_IMP_DEPOSITOS IS NULL";
        } else if (this.getFsdImpDepositos() != null) {
            conditions += " AND FSD_IMP_DEPOSITOS = ?";
            values.add(this.getFsdImpDepositos());
        }

        if (this.getFsdSaldoDisponible() != null && this.getFsdSaldoDisponible().longValue() == -999) {
            conditions += " AND FSD_SALDO_DISPONIBLE IS NULL";
        } else if (this.getFsdSaldoDisponible() != null) {
            conditions += " AND FSD_SALDO_DISPONIBLE = ?";
            values.add(this.getFsdSaldoDisponible());
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
        String sql = "UPDATE FID_SALDO_DISPONIBLE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FSD_NO_FIDEICOMISO = ?";
        pkValues.add(this.getFsdNoFideicomiso());
        conditions += " AND FSD_NO_CTO_INVERSION = ?";
        pkValues.add(this.getFsdNoCtoInversion());
        fields += " FSD_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFsdFecha());
        fields += " FSD_SALDO_TAS = ?, ";
        values.add(this.getFsdSaldoTas());
        fields += " FSD_IMP_RETIROS = ?, ";
        values.add(this.getFsdImpRetiros());
        fields += " FSD_IMP_DEPOSITOS = ?, ";
        values.add(this.getFsdImpDepositos());
        fields += " FSD_SALDO_DISPONIBLE = ?, ";
        values.add(this.getFsdSaldoDisponible());
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
        String sql = "INSERT INTO FID_SALDO_DISPONIBLE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FSD_NO_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFsdNoFideicomiso());

        fields += ", FSD_NO_CTO_INVERSION";
        fieldValues += ", ?";
        values.add(this.getFsdNoCtoInversion());

        fields += ", FSD_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFsdFecha());

        fields += ", FSD_SALDO_TAS";
        fieldValues += ", ?";
        values.add(this.getFsdSaldoTas());

        fields += ", FSD_IMP_RETIROS";
        fieldValues += ", ?";
        values.add(this.getFsdImpRetiros());

        fields += ", FSD_IMP_DEPOSITOS";
        fieldValues += ", ?";
        values.add(this.getFsdImpDepositos());

        fields += ", FSD_SALDO_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getFsdSaldoDisponible());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FID_SALDO_DISPONIBLE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FSD_NO_FIDEICOMISO = ?";
        values.add(this.getFsdNoFideicomiso());
        conditions += " AND FSD_NO_CTO_INVERSION = ?";
        values.add(this.getFsdNoCtoInversion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FidSaldoDisponible instance = (FidSaldoDisponible) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFsdNoFideicomiso().equals(instance.getFsdNoFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFsdNoCtoInversion().equals(instance.getFsdNoCtoInversion()))
            equalObjects = false;
        if (equalObjects && !this.getFsdFecha().equals(instance.getFsdFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFsdSaldoTas().equals(instance.getFsdSaldoTas()))
            equalObjects = false;
        if (equalObjects && !this.getFsdImpRetiros().equals(instance.getFsdImpRetiros()))
            equalObjects = false;
        if (equalObjects && !this.getFsdImpDepositos().equals(instance.getFsdImpDepositos()))
            equalObjects = false;
        if (equalObjects && !this.getFsdSaldoDisponible().equals(instance.getFsdSaldoDisponible()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FidSaldoDisponible result = new FidSaldoDisponible();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFsdNoFideicomiso((BigDecimal) objectData.getData("FSD_NO_FIDEICOMISO"));
        result.setFsdNoCtoInversion((BigDecimal) objectData.getData("FSD_NO_CTO_INVERSION"));
        result.setFsdFecha((String) objectData.getData("FSD_FECHA"));
        result.setFsdSaldoTas((BigDecimal) objectData.getData("FSD_SALDO_TAS"));
        result.setFsdImpRetiros((BigDecimal) objectData.getData("FSD_IMP_RETIROS"));
        result.setFsdImpDepositos((BigDecimal) objectData.getData("FSD_IMP_DEPOSITOS"));
        result.setFsdSaldoDisponible((BigDecimal) objectData.getData("FSD_SALDO_DISPONIBLE"));

        return result;

    }

}
