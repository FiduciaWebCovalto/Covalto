package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ING_NOP_PK", columns = { "ING_NUM_CONTRATO", "ING_IMP_ORIG_HONOR", "ING_COBRO_SINIVA", "ING_IMP_HONOR", "ING_IMP_PAGOS_MES" },
            sequences = { "MANUAL" })
public class IngNop extends DomainObject {

    BigDecimal ingNumContrato = null;
    BigDecimal ingImpOrigHonor = null;
    BigDecimal ingCobroSiniva = null;
    BigDecimal ingImpHonor = null;
    BigDecimal ingImpPagosMes = null;

    public IngNop() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setIngNumContrato(BigDecimal ingNumContrato) {
        this.ingNumContrato = ingNumContrato;
    }

    public BigDecimal getIngNumContrato() {
        return this.ingNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setIngImpOrigHonor(BigDecimal ingImpOrigHonor) {
        this.ingImpOrigHonor = ingImpOrigHonor;
    }

    public BigDecimal getIngImpOrigHonor() {
        return this.ingImpOrigHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setIngCobroSiniva(BigDecimal ingCobroSiniva) {
        this.ingCobroSiniva = ingCobroSiniva;
    }

    public BigDecimal getIngCobroSiniva() {
        return this.ingCobroSiniva;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setIngImpHonor(BigDecimal ingImpHonor) {
        this.ingImpHonor = ingImpHonor;
    }

    public BigDecimal getIngImpHonor() {
        return this.ingImpHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setIngImpPagosMes(BigDecimal ingImpPagosMes) {
        this.ingImpPagosMes = ingImpPagosMes;
    }

    public BigDecimal getIngImpPagosMes() {
        return this.ingImpPagosMes;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ING_NOP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIngNumContrato() != null && this.getIngNumContrato().longValue() == -999) {
            conditions += " AND ING_NUM_CONTRATO IS NULL";
        } else if (this.getIngNumContrato() != null) {
            conditions += " AND ING_NUM_CONTRATO = ?";
            values.add(this.getIngNumContrato());
        }

        if (this.getIngImpOrigHonor() != null && this.getIngImpOrigHonor().longValue() == -999) {
            conditions += " AND ING_IMP_ORIG_HONOR IS NULL";
        } else if (this.getIngImpOrigHonor() != null) {
            conditions += " AND ING_IMP_ORIG_HONOR = ?";
            values.add(this.getIngImpOrigHonor());
        }

        if (this.getIngCobroSiniva() != null && this.getIngCobroSiniva().longValue() == -999) {
            conditions += " AND ING_COBRO_SINIVA IS NULL";
        } else if (this.getIngCobroSiniva() != null) {
            conditions += " AND ING_COBRO_SINIVA = ?";
            values.add(this.getIngCobroSiniva());
        }

        if (this.getIngImpHonor() != null && this.getIngImpHonor().longValue() == -999) {
            conditions += " AND ING_IMP_HONOR IS NULL";
        } else if (this.getIngImpHonor() != null) {
            conditions += " AND ING_IMP_HONOR = ?";
            values.add(this.getIngImpHonor());
        }

        if (this.getIngImpPagosMes() != null && this.getIngImpPagosMes().longValue() == -999) {
            conditions += " AND ING_IMP_PAGOS_MES IS NULL";
        } else if (this.getIngImpPagosMes() != null) {
            conditions += " AND ING_IMP_PAGOS_MES = ?";
            values.add(this.getIngImpPagosMes());
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
        String sql = "SELECT * FROM ING_NOP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIngNumContrato() != null && this.getIngNumContrato().longValue() == -999) {
            conditions += " AND ING_NUM_CONTRATO IS NULL";
        } else if (this.getIngNumContrato() != null) {
            conditions += " AND ING_NUM_CONTRATO = ?";
            values.add(this.getIngNumContrato());
        }

        if (this.getIngImpOrigHonor() != null && this.getIngImpOrigHonor().longValue() == -999) {
            conditions += " AND ING_IMP_ORIG_HONOR IS NULL";
        } else if (this.getIngImpOrigHonor() != null) {
            conditions += " AND ING_IMP_ORIG_HONOR = ?";
            values.add(this.getIngImpOrigHonor());
        }

        if (this.getIngCobroSiniva() != null && this.getIngCobroSiniva().longValue() == -999) {
            conditions += " AND ING_COBRO_SINIVA IS NULL";
        } else if (this.getIngCobroSiniva() != null) {
            conditions += " AND ING_COBRO_SINIVA = ?";
            values.add(this.getIngCobroSiniva());
        }

        if (this.getIngImpHonor() != null && this.getIngImpHonor().longValue() == -999) {
            conditions += " AND ING_IMP_HONOR IS NULL";
        } else if (this.getIngImpHonor() != null) {
            conditions += " AND ING_IMP_HONOR = ?";
            values.add(this.getIngImpHonor());
        }

        if (this.getIngImpPagosMes() != null && this.getIngImpPagosMes().longValue() == -999) {
            conditions += " AND ING_IMP_PAGOS_MES IS NULL";
        } else if (this.getIngImpPagosMes() != null) {
            conditions += " AND ING_IMP_PAGOS_MES = ?";
            values.add(this.getIngImpPagosMes());
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
        String sql = "UPDATE ING_NOP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ING_NUM_CONTRATO = ?";
        pkValues.add(this.getIngNumContrato());
        conditions += " AND ING_IMP_ORIG_HONOR = ?";
        pkValues.add(this.getIngImpOrigHonor());
        conditions += " AND ING_COBRO_SINIVA = ?";
        pkValues.add(this.getIngCobroSiniva());
        conditions += " AND ING_IMP_HONOR = ?";
        pkValues.add(this.getIngImpHonor());
        conditions += " AND ING_IMP_PAGOS_MES = ?";
        pkValues.add(this.getIngImpPagosMes());
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
        String sql = "INSERT INTO ING_NOP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ING_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getIngNumContrato());

        fields += ", ING_IMP_ORIG_HONOR";
        fieldValues += ", ?";
        values.add(this.getIngImpOrigHonor());

        fields += ", ING_COBRO_SINIVA";
        fieldValues += ", ?";
        values.add(this.getIngCobroSiniva());

        fields += ", ING_IMP_HONOR";
        fieldValues += ", ?";
        values.add(this.getIngImpHonor());

        fields += ", ING_IMP_PAGOS_MES";
        fieldValues += ", ?";
        values.add(this.getIngImpPagosMes());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ING_NOP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ING_NUM_CONTRATO = ?";
        values.add(this.getIngNumContrato());
        conditions += " AND ING_IMP_ORIG_HONOR = ?";
        values.add(this.getIngImpOrigHonor());
        conditions += " AND ING_COBRO_SINIVA = ?";
        values.add(this.getIngCobroSiniva());
        conditions += " AND ING_IMP_HONOR = ?";
        values.add(this.getIngImpHonor());
        conditions += " AND ING_IMP_PAGOS_MES = ?";
        values.add(this.getIngImpPagosMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        IngNop instance = (IngNop) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIngNumContrato().equals(instance.getIngNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getIngImpOrigHonor().equals(instance.getIngImpOrigHonor()))
            equalObjects = false;
        if (equalObjects && !this.getIngCobroSiniva().equals(instance.getIngCobroSiniva()))
            equalObjects = false;
        if (equalObjects && !this.getIngImpHonor().equals(instance.getIngImpHonor()))
            equalObjects = false;
        if (equalObjects && !this.getIngImpPagosMes().equals(instance.getIngImpPagosMes()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        IngNop result = new IngNop();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIngNumContrato((BigDecimal) objectData.getData("ING_NUM_CONTRATO"));
        result.setIngImpOrigHonor((BigDecimal) objectData.getData("ING_IMP_ORIG_HONOR"));
        result.setIngCobroSiniva((BigDecimal) objectData.getData("ING_COBRO_SINIVA"));
        result.setIngImpHonor((BigDecimal) objectData.getData("ING_IMP_HONOR"));
        result.setIngImpPagosMes((BigDecimal) objectData.getData("ING_IMP_PAGOS_MES"));

        return result;

    }

}
