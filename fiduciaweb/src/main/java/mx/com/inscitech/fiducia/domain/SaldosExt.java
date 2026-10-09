package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SALDOS_EXT_PK",
            columns = { "SAL_NUM_AUX1", "SAL_NUM_CTAM", "SAL_NUM_SCTA", "SAL_NUM_SSCTA", "SAL_NUM_SSSCTA", "SAL_NUM_SSSSCTA", "SAL_NUM_SSSSSCTA", "SAL_NUM_AUX2", "SAL_NUM_AUX3"
    }, sequences = { "MANUAL" })
public class SaldosExt extends DomainObject {

    BigDecimal salNumCtam = null;
    BigDecimal salNumScta = null;
    BigDecimal salNumSscta = null;
    BigDecimal salNumSsscta = null;
    BigDecimal salNumSssscta = null;
    BigDecimal salNumSsssscta = null;
    BigDecimal salNumAux1 = null;
    BigDecimal salNumAux2 = null;
    BigDecimal salNumAux3 = null;
    BigDecimal salSaldoIniPer = null;
    BigDecimal salCargosPer = null;
    BigDecimal salAbonosPer = null;
    BigDecimal salImpSaldoAct = null;
    String salFecha = null;
    BigDecimal salNumMoneda = null;
    BigDecimal salTipoCambio = null;

    public SaldosExt() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumCtam(BigDecimal salNumCtam) {
        this.salNumCtam = salNumCtam;
    }

    public BigDecimal getSalNumCtam() {
        return this.salNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumScta(BigDecimal salNumScta) {
        this.salNumScta = salNumScta;
    }

    public BigDecimal getSalNumScta() {
        return this.salNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumSscta(BigDecimal salNumSscta) {
        this.salNumSscta = salNumSscta;
    }

    public BigDecimal getSalNumSscta() {
        return this.salNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumSsscta(BigDecimal salNumSsscta) {
        this.salNumSsscta = salNumSsscta;
    }

    public BigDecimal getSalNumSsscta() {
        return this.salNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumSssscta(BigDecimal salNumSssscta) {
        this.salNumSssscta = salNumSssscta;
    }

    public BigDecimal getSalNumSssscta() {
        return this.salNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumSsssscta(BigDecimal salNumSsssscta) {
        this.salNumSsssscta = salNumSsssscta;
    }

    public BigDecimal getSalNumSsssscta() {
        return this.salNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumAux1(BigDecimal salNumAux1) {
        this.salNumAux1 = salNumAux1;
    }

    public BigDecimal getSalNumAux1() {
        return this.salNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumAux2(BigDecimal salNumAux2) {
        this.salNumAux2 = salNumAux2;
    }

    public BigDecimal getSalNumAux2() {
        return this.salNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumAux3(BigDecimal salNumAux3) {
        this.salNumAux3 = salNumAux3;
    }

    public BigDecimal getSalNumAux3() {
        return this.salNumAux3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setSalSaldoIniPer(BigDecimal salSaldoIniPer) {
        this.salSaldoIniPer = salSaldoIniPer;
    }

    public BigDecimal getSalSaldoIniPer() {
        return this.salSaldoIniPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setSalCargosPer(BigDecimal salCargosPer) {
        this.salCargosPer = salCargosPer;
    }

    public BigDecimal getSalCargosPer() {
        return this.salCargosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setSalAbonosPer(BigDecimal salAbonosPer) {
        this.salAbonosPer = salAbonosPer;
    }

    public BigDecimal getSalAbonosPer() {
        return this.salAbonosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 2, javaClass = BigDecimal.class)
    public void setSalImpSaldoAct(BigDecimal salImpSaldoAct) {
        this.salImpSaldoAct = salImpSaldoAct;
    }

    public BigDecimal getSalImpSaldoAct() {
        return this.salImpSaldoAct;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setSalFecha(String salFecha) {
        this.salFecha = salFecha;
    }

    public String getSalFecha() {
        return this.salFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumMoneda(BigDecimal salNumMoneda) {
        this.salNumMoneda = salNumMoneda;
    }

    public BigDecimal getSalNumMoneda() {
        return this.salNumMoneda;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 8, javaClass = BigDecimal.class)
    public void setSalTipoCambio(BigDecimal salTipoCambio) {
        this.salTipoCambio = salTipoCambio;
    }

    public BigDecimal getSalTipoCambio() {
        return this.salTipoCambio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SALDOS_EXT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSalNumCtam() != null && this.getSalNumCtam().longValue() == -999) {
            conditions += " AND SAL_NUM_CTAM IS NULL";
        } else if (this.getSalNumCtam() != null) {
            conditions += " AND SAL_NUM_CTAM = ?";
            values.add(this.getSalNumCtam());
        }

        if (this.getSalNumScta() != null && this.getSalNumScta().longValue() == -999) {
            conditions += " AND SAL_NUM_SCTA IS NULL";
        } else if (this.getSalNumScta() != null) {
            conditions += " AND SAL_NUM_SCTA = ?";
            values.add(this.getSalNumScta());
        }

        if (this.getSalNumSscta() != null && this.getSalNumSscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSCTA IS NULL";
        } else if (this.getSalNumSscta() != null) {
            conditions += " AND SAL_NUM_SSCTA = ?";
            values.add(this.getSalNumSscta());
        }

        if (this.getSalNumSsscta() != null && this.getSalNumSsscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSSCTA IS NULL";
        } else if (this.getSalNumSsscta() != null) {
            conditions += " AND SAL_NUM_SSSCTA = ?";
            values.add(this.getSalNumSsscta());
        }

        if (this.getSalNumSssscta() != null && this.getSalNumSssscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSSSCTA IS NULL";
        } else if (this.getSalNumSssscta() != null) {
            conditions += " AND SAL_NUM_SSSSCTA = ?";
            values.add(this.getSalNumSssscta());
        }

        if (this.getSalNumSsssscta() != null && this.getSalNumSsssscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSSSSCTA IS NULL";
        } else if (this.getSalNumSsssscta() != null) {
            conditions += " AND SAL_NUM_SSSSSCTA = ?";
            values.add(this.getSalNumSsssscta());
        }

        if (this.getSalNumAux1() != null && this.getSalNumAux1().longValue() == -999) {
            conditions += " AND SAL_NUM_AUX1 IS NULL";
        } else if (this.getSalNumAux1() != null) {
            conditions += " AND SAL_NUM_AUX1 = ?";
            values.add(this.getSalNumAux1());
        }

        if (this.getSalNumAux2() != null && this.getSalNumAux2().longValue() == -999) {
            conditions += " AND SAL_NUM_AUX2 IS NULL";
        } else if (this.getSalNumAux2() != null) {
            conditions += " AND SAL_NUM_AUX2 = ?";
            values.add(this.getSalNumAux2());
        }

        if (this.getSalNumAux3() != null && this.getSalNumAux3().longValue() == -999) {
            conditions += " AND SAL_NUM_AUX3 IS NULL";
        } else if (this.getSalNumAux3() != null) {
            conditions += " AND SAL_NUM_AUX3 = ?";
            values.add(this.getSalNumAux3());
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
        String sql = "SELECT * FROM SALDOS_EXT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSalNumCtam() != null && this.getSalNumCtam().longValue() == -999) {
            conditions += " AND SAL_NUM_CTAM IS NULL";
        } else if (this.getSalNumCtam() != null) {
            conditions += " AND SAL_NUM_CTAM = ?";
            values.add(this.getSalNumCtam());
        }

        if (this.getSalNumScta() != null && this.getSalNumScta().longValue() == -999) {
            conditions += " AND SAL_NUM_SCTA IS NULL";
        } else if (this.getSalNumScta() != null) {
            conditions += " AND SAL_NUM_SCTA = ?";
            values.add(this.getSalNumScta());
        }

        if (this.getSalNumSscta() != null && this.getSalNumSscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSCTA IS NULL";
        } else if (this.getSalNumSscta() != null) {
            conditions += " AND SAL_NUM_SSCTA = ?";
            values.add(this.getSalNumSscta());
        }

        if (this.getSalNumSsscta() != null && this.getSalNumSsscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSSCTA IS NULL";
        } else if (this.getSalNumSsscta() != null) {
            conditions += " AND SAL_NUM_SSSCTA = ?";
            values.add(this.getSalNumSsscta());
        }

        if (this.getSalNumSssscta() != null && this.getSalNumSssscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSSSCTA IS NULL";
        } else if (this.getSalNumSssscta() != null) {
            conditions += " AND SAL_NUM_SSSSCTA = ?";
            values.add(this.getSalNumSssscta());
        }

        if (this.getSalNumSsssscta() != null && this.getSalNumSsssscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSSSSCTA IS NULL";
        } else if (this.getSalNumSsssscta() != null) {
            conditions += " AND SAL_NUM_SSSSSCTA = ?";
            values.add(this.getSalNumSsssscta());
        }

        if (this.getSalNumAux1() != null && this.getSalNumAux1().longValue() == -999) {
            conditions += " AND SAL_NUM_AUX1 IS NULL";
        } else if (this.getSalNumAux1() != null) {
            conditions += " AND SAL_NUM_AUX1 = ?";
            values.add(this.getSalNumAux1());
        }

        if (this.getSalNumAux2() != null && this.getSalNumAux2().longValue() == -999) {
            conditions += " AND SAL_NUM_AUX2 IS NULL";
        } else if (this.getSalNumAux2() != null) {
            conditions += " AND SAL_NUM_AUX2 = ?";
            values.add(this.getSalNumAux2());
        }

        if (this.getSalNumAux3() != null && this.getSalNumAux3().longValue() == -999) {
            conditions += " AND SAL_NUM_AUX3 IS NULL";
        } else if (this.getSalNumAux3() != null) {
            conditions += " AND SAL_NUM_AUX3 = ?";
            values.add(this.getSalNumAux3());
        }

        if (this.getSalSaldoIniPer() != null && this.getSalSaldoIniPer().longValue() == -999) {
            conditions += " AND SAL_SALDO_INI_PER IS NULL";
        } else if (this.getSalSaldoIniPer() != null) {
            conditions += " AND SAL_SALDO_INI_PER = ?";
            values.add(this.getSalSaldoIniPer());
        }

        if (this.getSalCargosPer() != null && this.getSalCargosPer().longValue() == -999) {
            conditions += " AND SAL_CARGOS_PER IS NULL";
        } else if (this.getSalCargosPer() != null) {
            conditions += " AND SAL_CARGOS_PER = ?";
            values.add(this.getSalCargosPer());
        }

        if (this.getSalAbonosPer() != null && this.getSalAbonosPer().longValue() == -999) {
            conditions += " AND SAL_ABONOS_PER IS NULL";
        } else if (this.getSalAbonosPer() != null) {
            conditions += " AND SAL_ABONOS_PER = ?";
            values.add(this.getSalAbonosPer());
        }

        if (this.getSalImpSaldoAct() != null && this.getSalImpSaldoAct().longValue() == -999) {
            conditions += " AND SAL_IMP_SALDO_ACT IS NULL";
        } else if (this.getSalImpSaldoAct() != null) {
            conditions += " AND SAL_IMP_SALDO_ACT = ?";
            values.add(this.getSalImpSaldoAct());
        }

        if (this.getSalFecha() != null && "null".equals(this.getSalFecha())) {
            conditions += " AND SAL_FECHA IS NULL";
        } else if (this.getSalFecha() != null) {
            conditions += " AND SAL_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSalFecha());
        }

        if (this.getSalNumMoneda() != null && this.getSalNumMoneda().longValue() == -999) {
            conditions += " AND SAL_NUM_MONEDA IS NULL";
        } else if (this.getSalNumMoneda() != null) {
            conditions += " AND SAL_NUM_MONEDA = ?";
            values.add(this.getSalNumMoneda());
        }

        if (this.getSalTipoCambio() != null && this.getSalTipoCambio().longValue() == -999) {
            conditions += " AND SAL_TIPO_CAMBIO IS NULL";
        } else if (this.getSalTipoCambio() != null) {
            conditions += " AND SAL_TIPO_CAMBIO = ?";
            values.add(this.getSalTipoCambio());
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
        String sql = "UPDATE SALDOS_EXT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SAL_NUM_CTAM = ?";
        pkValues.add(this.getSalNumCtam());
        conditions += " AND SAL_NUM_SCTA = ?";
        pkValues.add(this.getSalNumScta());
        conditions += " AND SAL_NUM_SSCTA = ?";
        pkValues.add(this.getSalNumSscta());
        conditions += " AND SAL_NUM_SSSCTA = ?";
        pkValues.add(this.getSalNumSsscta());
        conditions += " AND SAL_NUM_SSSSCTA = ?";
        pkValues.add(this.getSalNumSssscta());
        conditions += " AND SAL_NUM_SSSSSCTA = ?";
        pkValues.add(this.getSalNumSsssscta());
        conditions += " AND SAL_NUM_AUX1 = ?";
        pkValues.add(this.getSalNumAux1());
        conditions += " AND SAL_NUM_AUX2 = ?";
        pkValues.add(this.getSalNumAux2());
        conditions += " AND SAL_NUM_AUX3 = ?";
        pkValues.add(this.getSalNumAux3());
        fields += " SAL_SALDO_INI_PER = ?, ";
        values.add(this.getSalSaldoIniPer());
        fields += " SAL_CARGOS_PER = ?, ";
        values.add(this.getSalCargosPer());
        fields += " SAL_ABONOS_PER = ?, ";
        values.add(this.getSalAbonosPer());
        fields += " SAL_IMP_SALDO_ACT = ?, ";
        values.add(this.getSalImpSaldoAct());
        fields += " SAL_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getSalFecha());
        fields += " SAL_NUM_MONEDA = ?, ";
        values.add(this.getSalNumMoneda());
        fields += " SAL_TIPO_CAMBIO = ?, ";
        values.add(this.getSalTipoCambio());
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
        String sql = "INSERT INTO SALDOS_EXT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SAL_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getSalNumCtam());

        fields += ", SAL_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getSalNumScta());

        fields += ", SAL_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getSalNumSscta());

        fields += ", SAL_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getSalNumSsscta());

        fields += ", SAL_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getSalNumSssscta());

        fields += ", SAL_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getSalNumSsssscta());

        fields += ", SAL_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getSalNumAux1());

        fields += ", SAL_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getSalNumAux2());

        fields += ", SAL_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getSalNumAux3());

        fields += ", SAL_SALDO_INI_PER";
        fieldValues += ", ?";
        values.add(this.getSalSaldoIniPer());

        fields += ", SAL_CARGOS_PER";
        fieldValues += ", ?";
        values.add(this.getSalCargosPer());

        fields += ", SAL_ABONOS_PER";
        fieldValues += ", ?";
        values.add(this.getSalAbonosPer());

        fields += ", SAL_IMP_SALDO_ACT";
        fieldValues += ", ?";
        values.add(this.getSalImpSaldoAct());

        fields += ", SAL_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getSalFecha());

        fields += ", SAL_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getSalNumMoneda());

        fields += ", SAL_TIPO_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getSalTipoCambio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SALDOS_EXT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SAL_NUM_CTAM = ?";
        values.add(this.getSalNumCtam());
        conditions += " AND SAL_NUM_SCTA = ?";
        values.add(this.getSalNumScta());
        conditions += " AND SAL_NUM_SSCTA = ?";
        values.add(this.getSalNumSscta());
        conditions += " AND SAL_NUM_SSSCTA = ?";
        values.add(this.getSalNumSsscta());
        conditions += " AND SAL_NUM_SSSSCTA = ?";
        values.add(this.getSalNumSssscta());
        conditions += " AND SAL_NUM_SSSSSCTA = ?";
        values.add(this.getSalNumSsssscta());
        conditions += " AND SAL_NUM_AUX1 = ?";
        values.add(this.getSalNumAux1());
        conditions += " AND SAL_NUM_AUX2 = ?";
        values.add(this.getSalNumAux2());
        conditions += " AND SAL_NUM_AUX3 = ?";
        values.add(this.getSalNumAux3());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        SaldosExt instance = (SaldosExt) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSalNumCtam().equals(instance.getSalNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumScta().equals(instance.getSalNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumSscta().equals(instance.getSalNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumSsscta().equals(instance.getSalNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumSssscta().equals(instance.getSalNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumSsssscta().equals(instance.getSalNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumAux1().equals(instance.getSalNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumAux2().equals(instance.getSalNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumAux3().equals(instance.getSalNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getSalSaldoIniPer().equals(instance.getSalSaldoIniPer()))
            equalObjects = false;
        if (equalObjects && !this.getSalCargosPer().equals(instance.getSalCargosPer()))
            equalObjects = false;
        if (equalObjects && !this.getSalAbonosPer().equals(instance.getSalAbonosPer()))
            equalObjects = false;
        if (equalObjects && !this.getSalImpSaldoAct().equals(instance.getSalImpSaldoAct()))
            equalObjects = false;
        if (equalObjects && !this.getSalFecha().equals(instance.getSalFecha()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumMoneda().equals(instance.getSalNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getSalTipoCambio().equals(instance.getSalTipoCambio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        SaldosExt result = new SaldosExt();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSalNumCtam((BigDecimal) objectData.getData("SAL_NUM_CTAM"));
        result.setSalNumScta((BigDecimal) objectData.getData("SAL_NUM_SCTA"));
        result.setSalNumSscta((BigDecimal) objectData.getData("SAL_NUM_SSCTA"));
        result.setSalNumSsscta((BigDecimal) objectData.getData("SAL_NUM_SSSCTA"));
        result.setSalNumSssscta((BigDecimal) objectData.getData("SAL_NUM_SSSSCTA"));
        result.setSalNumSsssscta((BigDecimal) objectData.getData("SAL_NUM_SSSSSCTA"));
        result.setSalNumAux1((BigDecimal) objectData.getData("SAL_NUM_AUX1"));
        result.setSalNumAux2((BigDecimal) objectData.getData("SAL_NUM_AUX2"));
        result.setSalNumAux3((BigDecimal) objectData.getData("SAL_NUM_AUX3"));
        result.setSalSaldoIniPer((BigDecimal) objectData.getData("SAL_SALDO_INI_PER"));
        result.setSalCargosPer((BigDecimal) objectData.getData("SAL_CARGOS_PER"));
        result.setSalAbonosPer((BigDecimal) objectData.getData("SAL_ABONOS_PER"));
        result.setSalImpSaldoAct((BigDecimal) objectData.getData("SAL_IMP_SALDO_ACT"));
        result.setSalFecha((String) objectData.getData("SAL_FECHA"));
        result.setSalNumMoneda((BigDecimal) objectData.getData("SAL_NUM_MONEDA"));
        result.setSalTipoCambio((BigDecimal) objectData.getData("SAL_TIPO_CAMBIO"));

        return result;

    }

}
