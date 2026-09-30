package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIFIRMA_PK", columns = { "EFIR_ID_PROGRAMA", "EFIR_ID_FIDEICOMISO", "EFIR_ID_EMISION", "EFIR_ID_SEC_CALC" }, sequences = { "MANUAL" })
public class FEmifirma extends DomainObject {

    BigDecimal efirIdPrograma = null;
    BigDecimal efirIdFideicomiso = null;
    BigDecimal efirIdEmision = null;
    BigDecimal efirIdSecCalc = null;
    String efirElaboro = null;
    String efirFirmaVobo = null;

    public FEmifirma() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfirIdPrograma(BigDecimal efirIdPrograma) {
        this.efirIdPrograma = efirIdPrograma;
    }

    public BigDecimal getEfirIdPrograma() {
        return this.efirIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfirIdFideicomiso(BigDecimal efirIdFideicomiso) {
        this.efirIdFideicomiso = efirIdFideicomiso;
    }

    public BigDecimal getEfirIdFideicomiso() {
        return this.efirIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfirIdEmision(BigDecimal efirIdEmision) {
        this.efirIdEmision = efirIdEmision;
    }

    public BigDecimal getEfirIdEmision() {
        return this.efirIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEfirIdSecCalc(BigDecimal efirIdSecCalc) {
        this.efirIdSecCalc = efirIdSecCalc;
    }

    public BigDecimal getEfirIdSecCalc() {
        return this.efirIdSecCalc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfirElaboro(String efirElaboro) {
        this.efirElaboro = efirElaboro;
    }

    public String getEfirElaboro() {
        return this.efirElaboro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEfirFirmaVobo(String efirFirmaVobo) {
        this.efirFirmaVobo = efirFirmaVobo;
    }

    public String getEfirFirmaVobo() {
        return this.efirFirmaVobo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIFIRMA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfirIdPrograma() != null && this.getEfirIdPrograma().longValue() == -999) {
            conditions += " AND EFIR_ID_PROGRAMA IS NULL";
        } else if (this.getEfirIdPrograma() != null) {
            conditions += " AND EFIR_ID_PROGRAMA = ?";
            values.add(this.getEfirIdPrograma());
        }

        if (this.getEfirIdFideicomiso() != null && this.getEfirIdFideicomiso().longValue() == -999) {
            conditions += " AND EFIR_ID_FIDEICOMISO IS NULL";
        } else if (this.getEfirIdFideicomiso() != null) {
            conditions += " AND EFIR_ID_FIDEICOMISO = ?";
            values.add(this.getEfirIdFideicomiso());
        }

        if (this.getEfirIdEmision() != null && this.getEfirIdEmision().longValue() == -999) {
            conditions += " AND EFIR_ID_EMISION IS NULL";
        } else if (this.getEfirIdEmision() != null) {
            conditions += " AND EFIR_ID_EMISION = ?";
            values.add(this.getEfirIdEmision());
        }

        if (this.getEfirIdSecCalc() != null && this.getEfirIdSecCalc().longValue() == -999) {
            conditions += " AND EFIR_ID_SEC_CALC IS NULL";
        } else if (this.getEfirIdSecCalc() != null) {
            conditions += " AND EFIR_ID_SEC_CALC = ?";
            values.add(this.getEfirIdSecCalc());
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
        String sql = "SELECT * FROM F_EMIFIRMA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEfirIdPrograma() != null && this.getEfirIdPrograma().longValue() == -999) {
            conditions += " AND EFIR_ID_PROGRAMA IS NULL";
        } else if (this.getEfirIdPrograma() != null) {
            conditions += " AND EFIR_ID_PROGRAMA = ?";
            values.add(this.getEfirIdPrograma());
        }

        if (this.getEfirIdFideicomiso() != null && this.getEfirIdFideicomiso().longValue() == -999) {
            conditions += " AND EFIR_ID_FIDEICOMISO IS NULL";
        } else if (this.getEfirIdFideicomiso() != null) {
            conditions += " AND EFIR_ID_FIDEICOMISO = ?";
            values.add(this.getEfirIdFideicomiso());
        }

        if (this.getEfirIdEmision() != null && this.getEfirIdEmision().longValue() == -999) {
            conditions += " AND EFIR_ID_EMISION IS NULL";
        } else if (this.getEfirIdEmision() != null) {
            conditions += " AND EFIR_ID_EMISION = ?";
            values.add(this.getEfirIdEmision());
        }

        if (this.getEfirIdSecCalc() != null && this.getEfirIdSecCalc().longValue() == -999) {
            conditions += " AND EFIR_ID_SEC_CALC IS NULL";
        } else if (this.getEfirIdSecCalc() != null) {
            conditions += " AND EFIR_ID_SEC_CALC = ?";
            values.add(this.getEfirIdSecCalc());
        }

        if (this.getEfirElaboro() != null && "null".equals(this.getEfirElaboro())) {
            conditions += " AND EFIR_ELABORO IS NULL";
        } else if (this.getEfirElaboro() != null) {
            conditions += " AND EFIR_ELABORO = ?";
            values.add(this.getEfirElaboro());
        }

        if (this.getEfirFirmaVobo() != null && "null".equals(this.getEfirFirmaVobo())) {
            conditions += " AND EFIR_FIRMA_VOBO IS NULL";
        } else if (this.getEfirFirmaVobo() != null) {
            conditions += " AND EFIR_FIRMA_VOBO = ?";
            values.add(this.getEfirFirmaVobo());
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
        String sql = "UPDATE F_EMIFIRMA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EFIR_ID_PROGRAMA = ?";
        pkValues.add(this.getEfirIdPrograma());
        conditions += " AND EFIR_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEfirIdFideicomiso());
        conditions += " AND EFIR_ID_EMISION = ?";
        pkValues.add(this.getEfirIdEmision());
        conditions += " AND EFIR_ID_SEC_CALC = ?";
        pkValues.add(this.getEfirIdSecCalc());
        fields += " EFIR_ELABORO = ?, ";
        values.add(this.getEfirElaboro());
        fields += " EFIR_FIRMA_VOBO = ?, ";
        values.add(this.getEfirFirmaVobo());
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
        String sql = "INSERT INTO F_EMIFIRMA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EFIR_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEfirIdPrograma());

        fields += ", EFIR_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEfirIdFideicomiso());

        fields += ", EFIR_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEfirIdEmision());

        fields += ", EFIR_ID_SEC_CALC";
        fieldValues += ", ?";
        values.add(this.getEfirIdSecCalc());

        fields += ", EFIR_ELABORO";
        fieldValues += ", ?";
        values.add(this.getEfirElaboro());

        fields += ", EFIR_FIRMA_VOBO";
        fieldValues += ", ?";
        values.add(this.getEfirFirmaVobo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIFIRMA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EFIR_ID_PROGRAMA = ?";
        values.add(this.getEfirIdPrograma());
        conditions += " AND EFIR_ID_FIDEICOMISO = ?";
        values.add(this.getEfirIdFideicomiso());
        conditions += " AND EFIR_ID_EMISION = ?";
        values.add(this.getEfirIdEmision());
        conditions += " AND EFIR_ID_SEC_CALC = ?";
        values.add(this.getEfirIdSecCalc());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmifirma instance = (FEmifirma) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEfirIdPrograma().equals(instance.getEfirIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEfirIdFideicomiso().equals(instance.getEfirIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEfirIdEmision().equals(instance.getEfirIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEfirIdSecCalc().equals(instance.getEfirIdSecCalc()))
            equalObjects = false;
        if (equalObjects && !this.getEfirElaboro().equals(instance.getEfirElaboro()))
            equalObjects = false;
        if (equalObjects && !this.getEfirFirmaVobo().equals(instance.getEfirFirmaVobo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmifirma result = new FEmifirma();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEfirIdPrograma((BigDecimal) objectData.getData("EFIR_ID_PROGRAMA"));
        result.setEfirIdFideicomiso((BigDecimal) objectData.getData("EFIR_ID_FIDEICOMISO"));
        result.setEfirIdEmision((BigDecimal) objectData.getData("EFIR_ID_EMISION"));
        result.setEfirIdSecCalc((BigDecimal) objectData.getData("EFIR_ID_SEC_CALC"));
        result.setEfirElaboro((String) objectData.getData("EFIR_ELABORO"));
        result.setEfirFirmaVobo((String) objectData.getData("EFIR_FIRMA_VOBO"));

        return result;

    }

}
