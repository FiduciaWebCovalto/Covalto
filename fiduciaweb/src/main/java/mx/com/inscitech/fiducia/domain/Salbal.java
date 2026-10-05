package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SALBAL_PK",
            columns = { "SAB_NUM_CTAM", "SAB_NUM_SCTA", "SAB_NUM_SSCTA", "SAB_NUM_SSSCTA", "SAB_NUM_SSSSCTA", "SAB_NUM_SSSSSCTA", "SAB_NUM_AUX1", "SAB_NUM_AUX2", "SAB_NUM_AUX3"
    }, sequences = { "MANUAL" })
public class Salbal extends DomainObject {

    BigDecimal sabNumCtam = null;
    BigDecimal sabNumScta = null;
    BigDecimal sabNumSscta = null;
    BigDecimal sabNumSsscta = null;
    BigDecimal sabNumSssscta = null;
    BigDecimal sabNumSsssscta = null;
    BigDecimal sabNumAux1 = null;
    BigDecimal sabNumAux2 = null;
    BigDecimal sabNumAux3 = null;
    BigDecimal sabSaldoIniPer = null;
    BigDecimal sabCargosPer = null;
    BigDecimal sabAbonosPer = null;
    BigDecimal sabImpSaldoAct = null;
    String sabDescripcion = null;

    public Salbal() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSabNumCtam(BigDecimal sabNumCtam) {
        this.sabNumCtam = sabNumCtam;
    }

    public BigDecimal getSabNumCtam() {
        return this.sabNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSabNumScta(BigDecimal sabNumScta) {
        this.sabNumScta = sabNumScta;
    }

    public BigDecimal getSabNumScta() {
        return this.sabNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSabNumSscta(BigDecimal sabNumSscta) {
        this.sabNumSscta = sabNumSscta;
    }

    public BigDecimal getSabNumSscta() {
        return this.sabNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSabNumSsscta(BigDecimal sabNumSsscta) {
        this.sabNumSsscta = sabNumSsscta;
    }

    public BigDecimal getSabNumSsscta() {
        return this.sabNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSabNumSssscta(BigDecimal sabNumSssscta) {
        this.sabNumSssscta = sabNumSssscta;
    }

    public BigDecimal getSabNumSssscta() {
        return this.sabNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSabNumSsssscta(BigDecimal sabNumSsssscta) {
        this.sabNumSsssscta = sabNumSsssscta;
    }

    public BigDecimal getSabNumSsssscta() {
        return this.sabNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSabNumAux1(BigDecimal sabNumAux1) {
        this.sabNumAux1 = sabNumAux1;
    }

    public BigDecimal getSabNumAux1() {
        return this.sabNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSabNumAux2(BigDecimal sabNumAux2) {
        this.sabNumAux2 = sabNumAux2;
    }

    public BigDecimal getSabNumAux2() {
        return this.sabNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSabNumAux3(BigDecimal sabNumAux3) {
        this.sabNumAux3 = sabNumAux3;
    }

    public BigDecimal getSabNumAux3() {
        return this.sabNumAux3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSabSaldoIniPer(BigDecimal sabSaldoIniPer) {
        this.sabSaldoIniPer = sabSaldoIniPer;
    }

    public BigDecimal getSabSaldoIniPer() {
        return this.sabSaldoIniPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSabCargosPer(BigDecimal sabCargosPer) {
        this.sabCargosPer = sabCargosPer;
    }

    public BigDecimal getSabCargosPer() {
        return this.sabCargosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSabAbonosPer(BigDecimal sabAbonosPer) {
        this.sabAbonosPer = sabAbonosPer;
    }

    public BigDecimal getSabAbonosPer() {
        return this.sabAbonosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSabImpSaldoAct(BigDecimal sabImpSaldoAct) {
        this.sabImpSaldoAct = sabImpSaldoAct;
    }

    public BigDecimal getSabImpSaldoAct() {
        return this.sabImpSaldoAct;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSabDescripcion(String sabDescripcion) {
        this.sabDescripcion = sabDescripcion;
    }

    public String getSabDescripcion() {
        return this.sabDescripcion;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SALBAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSabNumCtam() != null && this.getSabNumCtam().longValue() == -999) {
            conditions += " AND SAB_NUM_CTAM IS NULL";
        } else if (this.getSabNumCtam() != null) {
            conditions += " AND SAB_NUM_CTAM = ?";
            values.add(this.getSabNumCtam());
        }

        if (this.getSabNumScta() != null && this.getSabNumScta().longValue() == -999) {
            conditions += " AND SAB_NUM_SCTA IS NULL";
        } else if (this.getSabNumScta() != null) {
            conditions += " AND SAB_NUM_SCTA = ?";
            values.add(this.getSabNumScta());
        }

        if (this.getSabNumSscta() != null && this.getSabNumSscta().longValue() == -999) {
            conditions += " AND SAB_NUM_SSCTA IS NULL";
        } else if (this.getSabNumSscta() != null) {
            conditions += " AND SAB_NUM_SSCTA = ?";
            values.add(this.getSabNumSscta());
        }

        if (this.getSabNumSsscta() != null && this.getSabNumSsscta().longValue() == -999) {
            conditions += " AND SAB_NUM_SSSCTA IS NULL";
        } else if (this.getSabNumSsscta() != null) {
            conditions += " AND SAB_NUM_SSSCTA = ?";
            values.add(this.getSabNumSsscta());
        }

        if (this.getSabNumSssscta() != null && this.getSabNumSssscta().longValue() == -999) {
            conditions += " AND SAB_NUM_SSSSCTA IS NULL";
        } else if (this.getSabNumSssscta() != null) {
            conditions += " AND SAB_NUM_SSSSCTA = ?";
            values.add(this.getSabNumSssscta());
        }

        if (this.getSabNumSsssscta() != null && this.getSabNumSsssscta().longValue() == -999) {
            conditions += " AND SAB_NUM_SSSSSCTA IS NULL";
        } else if (this.getSabNumSsssscta() != null) {
            conditions += " AND SAB_NUM_SSSSSCTA = ?";
            values.add(this.getSabNumSsssscta());
        }

        if (this.getSabNumAux1() != null && this.getSabNumAux1().longValue() == -999) {
            conditions += " AND SAB_NUM_AUX1 IS NULL";
        } else if (this.getSabNumAux1() != null) {
            conditions += " AND SAB_NUM_AUX1 = ?";
            values.add(this.getSabNumAux1());
        }

        if (this.getSabNumAux2() != null && this.getSabNumAux2().longValue() == -999) {
            conditions += " AND SAB_NUM_AUX2 IS NULL";
        } else if (this.getSabNumAux2() != null) {
            conditions += " AND SAB_NUM_AUX2 = ?";
            values.add(this.getSabNumAux2());
        }

        if (this.getSabNumAux3() != null && this.getSabNumAux3().longValue() == -999) {
            conditions += " AND SAB_NUM_AUX3 IS NULL";
        } else if (this.getSabNumAux3() != null) {
            conditions += " AND SAB_NUM_AUX3 = ?";
            values.add(this.getSabNumAux3());
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
        String sql = "SELECT * FROM SALBAL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSabNumCtam() != null && this.getSabNumCtam().longValue() == -999) {
            conditions += " AND SAB_NUM_CTAM IS NULL";
        } else if (this.getSabNumCtam() != null) {
            conditions += " AND SAB_NUM_CTAM = ?";
            values.add(this.getSabNumCtam());
        }

        if (this.getSabNumScta() != null && this.getSabNumScta().longValue() == -999) {
            conditions += " AND SAB_NUM_SCTA IS NULL";
        } else if (this.getSabNumScta() != null) {
            conditions += " AND SAB_NUM_SCTA = ?";
            values.add(this.getSabNumScta());
        }

        if (this.getSabNumSscta() != null && this.getSabNumSscta().longValue() == -999) {
            conditions += " AND SAB_NUM_SSCTA IS NULL";
        } else if (this.getSabNumSscta() != null) {
            conditions += " AND SAB_NUM_SSCTA = ?";
            values.add(this.getSabNumSscta());
        }

        if (this.getSabNumSsscta() != null && this.getSabNumSsscta().longValue() == -999) {
            conditions += " AND SAB_NUM_SSSCTA IS NULL";
        } else if (this.getSabNumSsscta() != null) {
            conditions += " AND SAB_NUM_SSSCTA = ?";
            values.add(this.getSabNumSsscta());
        }

        if (this.getSabNumSssscta() != null && this.getSabNumSssscta().longValue() == -999) {
            conditions += " AND SAB_NUM_SSSSCTA IS NULL";
        } else if (this.getSabNumSssscta() != null) {
            conditions += " AND SAB_NUM_SSSSCTA = ?";
            values.add(this.getSabNumSssscta());
        }

        if (this.getSabNumSsssscta() != null && this.getSabNumSsssscta().longValue() == -999) {
            conditions += " AND SAB_NUM_SSSSSCTA IS NULL";
        } else if (this.getSabNumSsssscta() != null) {
            conditions += " AND SAB_NUM_SSSSSCTA = ?";
            values.add(this.getSabNumSsssscta());
        }

        if (this.getSabNumAux1() != null && this.getSabNumAux1().longValue() == -999) {
            conditions += " AND SAB_NUM_AUX1 IS NULL";
        } else if (this.getSabNumAux1() != null) {
            conditions += " AND SAB_NUM_AUX1 = ?";
            values.add(this.getSabNumAux1());
        }

        if (this.getSabNumAux2() != null && this.getSabNumAux2().longValue() == -999) {
            conditions += " AND SAB_NUM_AUX2 IS NULL";
        } else if (this.getSabNumAux2() != null) {
            conditions += " AND SAB_NUM_AUX2 = ?";
            values.add(this.getSabNumAux2());
        }

        if (this.getSabNumAux3() != null && this.getSabNumAux3().longValue() == -999) {
            conditions += " AND SAB_NUM_AUX3 IS NULL";
        } else if (this.getSabNumAux3() != null) {
            conditions += " AND SAB_NUM_AUX3 = ?";
            values.add(this.getSabNumAux3());
        }

        if (this.getSabSaldoIniPer() != null && this.getSabSaldoIniPer().longValue() == -999) {
            conditions += " AND SAB_SALDO_INI_PER IS NULL";
        } else if (this.getSabSaldoIniPer() != null) {
            conditions += " AND SAB_SALDO_INI_PER = ?";
            values.add(this.getSabSaldoIniPer());
        }

        if (this.getSabCargosPer() != null && this.getSabCargosPer().longValue() == -999) {
            conditions += " AND SAB_CARGOS_PER IS NULL";
        } else if (this.getSabCargosPer() != null) {
            conditions += " AND SAB_CARGOS_PER = ?";
            values.add(this.getSabCargosPer());
        }

        if (this.getSabAbonosPer() != null && this.getSabAbonosPer().longValue() == -999) {
            conditions += " AND SAB_ABONOS_PER IS NULL";
        } else if (this.getSabAbonosPer() != null) {
            conditions += " AND SAB_ABONOS_PER = ?";
            values.add(this.getSabAbonosPer());
        }

        if (this.getSabImpSaldoAct() != null && this.getSabImpSaldoAct().longValue() == -999) {
            conditions += " AND SAB_IMP_SALDO_ACT IS NULL";
        } else if (this.getSabImpSaldoAct() != null) {
            conditions += " AND SAB_IMP_SALDO_ACT = ?";
            values.add(this.getSabImpSaldoAct());
        }

        if (this.getSabDescripcion() != null && "null".equals(this.getSabDescripcion())) {
            conditions += " AND SAB_DESCRIPCION IS NULL";
        } else if (this.getSabDescripcion() != null) {
            conditions += " AND SAB_DESCRIPCION = ?";
            values.add(this.getSabDescripcion());
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
        String sql = "UPDATE SALBAL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SAB_NUM_CTAM = ?";
        pkValues.add(this.getSabNumCtam());
        conditions += " AND SAB_NUM_SCTA = ?";
        pkValues.add(this.getSabNumScta());
        conditions += " AND SAB_NUM_SSCTA = ?";
        pkValues.add(this.getSabNumSscta());
        conditions += " AND SAB_NUM_SSSCTA = ?";
        pkValues.add(this.getSabNumSsscta());
        conditions += " AND SAB_NUM_SSSSCTA = ?";
        pkValues.add(this.getSabNumSssscta());
        conditions += " AND SAB_NUM_SSSSSCTA = ?";
        pkValues.add(this.getSabNumSsssscta());
        conditions += " AND SAB_NUM_AUX1 = ?";
        pkValues.add(this.getSabNumAux1());
        conditions += " AND SAB_NUM_AUX2 = ?";
        pkValues.add(this.getSabNumAux2());
        conditions += " AND SAB_NUM_AUX3 = ?";
        pkValues.add(this.getSabNumAux3());
        fields += " SAB_SALDO_INI_PER = ?, ";
        values.add(this.getSabSaldoIniPer());
        fields += " SAB_CARGOS_PER = ?, ";
        values.add(this.getSabCargosPer());
        fields += " SAB_ABONOS_PER = ?, ";
        values.add(this.getSabAbonosPer());
        fields += " SAB_IMP_SALDO_ACT = ?, ";
        values.add(this.getSabImpSaldoAct());
        fields += " SAB_DESCRIPCION = ?, ";
        values.add(this.getSabDescripcion());
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
        String sql = "INSERT INTO SALBAL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SAB_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getSabNumCtam());

        fields += ", SAB_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getSabNumScta());

        fields += ", SAB_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getSabNumSscta());

        fields += ", SAB_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getSabNumSsscta());

        fields += ", SAB_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getSabNumSssscta());

        fields += ", SAB_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getSabNumSsssscta());

        fields += ", SAB_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getSabNumAux1());

        fields += ", SAB_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getSabNumAux2());

        fields += ", SAB_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getSabNumAux3());

        fields += ", SAB_SALDO_INI_PER";
        fieldValues += ", ?";
        values.add(this.getSabSaldoIniPer());

        fields += ", SAB_CARGOS_PER";
        fieldValues += ", ?";
        values.add(this.getSabCargosPer());

        fields += ", SAB_ABONOS_PER";
        fieldValues += ", ?";
        values.add(this.getSabAbonosPer());

        fields += ", SAB_IMP_SALDO_ACT";
        fieldValues += ", ?";
        values.add(this.getSabImpSaldoAct());

        fields += ", SAB_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getSabDescripcion());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SALBAL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SAB_NUM_CTAM = ?";
        values.add(this.getSabNumCtam());
        conditions += " AND SAB_NUM_SCTA = ?";
        values.add(this.getSabNumScta());
        conditions += " AND SAB_NUM_SSCTA = ?";
        values.add(this.getSabNumSscta());
        conditions += " AND SAB_NUM_SSSCTA = ?";
        values.add(this.getSabNumSsscta());
        conditions += " AND SAB_NUM_SSSSCTA = ?";
        values.add(this.getSabNumSssscta());
        conditions += " AND SAB_NUM_SSSSSCTA = ?";
        values.add(this.getSabNumSsssscta());
        conditions += " AND SAB_NUM_AUX1 = ?";
        values.add(this.getSabNumAux1());
        conditions += " AND SAB_NUM_AUX2 = ?";
        values.add(this.getSabNumAux2());
        conditions += " AND SAB_NUM_AUX3 = ?";
        values.add(this.getSabNumAux3());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Salbal instance = (Salbal) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSabNumCtam().equals(instance.getSabNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getSabNumScta().equals(instance.getSabNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getSabNumSscta().equals(instance.getSabNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getSabNumSsscta().equals(instance.getSabNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getSabNumSssscta().equals(instance.getSabNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getSabNumSsssscta().equals(instance.getSabNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getSabNumAux1().equals(instance.getSabNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getSabNumAux2().equals(instance.getSabNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getSabNumAux3().equals(instance.getSabNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getSabSaldoIniPer().equals(instance.getSabSaldoIniPer()))
            equalObjects = false;
        if (equalObjects && !this.getSabCargosPer().equals(instance.getSabCargosPer()))
            equalObjects = false;
        if (equalObjects && !this.getSabAbonosPer().equals(instance.getSabAbonosPer()))
            equalObjects = false;
        if (equalObjects && !this.getSabImpSaldoAct().equals(instance.getSabImpSaldoAct()))
            equalObjects = false;
        if (equalObjects && !this.getSabDescripcion().equals(instance.getSabDescripcion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Salbal result = new Salbal();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSabNumCtam((BigDecimal) objectData.getData("SAB_NUM_CTAM"));
        result.setSabNumScta((BigDecimal) objectData.getData("SAB_NUM_SCTA"));
        result.setSabNumSscta((BigDecimal) objectData.getData("SAB_NUM_SSCTA"));
        result.setSabNumSsscta((BigDecimal) objectData.getData("SAB_NUM_SSSCTA"));
        result.setSabNumSssscta((BigDecimal) objectData.getData("SAB_NUM_SSSSCTA"));
        result.setSabNumSsssscta((BigDecimal) objectData.getData("SAB_NUM_SSSSSCTA"));
        result.setSabNumAux1((BigDecimal) objectData.getData("SAB_NUM_AUX1"));
        result.setSabNumAux2((BigDecimal) objectData.getData("SAB_NUM_AUX2"));
        result.setSabNumAux3((BigDecimal) objectData.getData("SAB_NUM_AUX3"));
        result.setSabSaldoIniPer((BigDecimal) objectData.getData("SAB_SALDO_INI_PER"));
        result.setSabCargosPer((BigDecimal) objectData.getData("SAB_CARGOS_PER"));
        result.setSabAbonosPer((BigDecimal) objectData.getData("SAB_ABONOS_PER"));
        result.setSabImpSaldoAct((BigDecimal) objectData.getData("SAB_IMP_SALDO_ACT"));
        result.setSabDescripcion((String) objectData.getData("SAB_DESCRIPCION"));

        return result;

    }

}
