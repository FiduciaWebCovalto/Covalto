package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIADIC_PK", columns = { "EADI_ID_PROGRAMA", "EADI_ID_FIDEICOMISO", "EADI_ID_EMISION" }, sequences = { "MANUAL" })
public class FEmiadic extends DomainObject {

    BigDecimal eadiIdPrograma = null;
    BigDecimal eadiIdFideicomiso = null;
    BigDecimal eadiIdEmision = null;
    BigDecimal eadiAumentoVals = null;
    BigDecimal eadiAdicionCupon = null;
    BigDecimal eadiNumTitulos = null;
    BigDecimal eadiImpNominal = null;
    String eadiFecEmision = null;
    String eadiStEmiadic = null;

    public FEmiadic() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEadiIdPrograma(BigDecimal eadiIdPrograma) {
        this.eadiIdPrograma = eadiIdPrograma;
    }

    public BigDecimal getEadiIdPrograma() {
        return this.eadiIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEadiIdFideicomiso(BigDecimal eadiIdFideicomiso) {
        this.eadiIdFideicomiso = eadiIdFideicomiso;
    }

    public BigDecimal getEadiIdFideicomiso() {
        return this.eadiIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEadiIdEmision(BigDecimal eadiIdEmision) {
        this.eadiIdEmision = eadiIdEmision;
    }

    public BigDecimal getEadiIdEmision() {
        return this.eadiIdEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadiAumentoVals(BigDecimal eadiAumentoVals) {
        this.eadiAumentoVals = eadiAumentoVals;
    }

    public BigDecimal getEadiAumentoVals() {
        return this.eadiAumentoVals;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEadiAdicionCupon(BigDecimal eadiAdicionCupon) {
        this.eadiAdicionCupon = eadiAdicionCupon;
    }

    public BigDecimal getEadiAdicionCupon() {
        return this.eadiAdicionCupon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEadiNumTitulos(BigDecimal eadiNumTitulos) {
        this.eadiNumTitulos = eadiNumTitulos;
    }

    public BigDecimal getEadiNumTitulos() {
        return this.eadiNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEadiImpNominal(BigDecimal eadiImpNominal) {
        this.eadiImpNominal = eadiImpNominal;
    }

    public BigDecimal getEadiImpNominal() {
        return this.eadiImpNominal;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEadiFecEmision(String eadiFecEmision) {
        this.eadiFecEmision = eadiFecEmision;
    }

    public String getEadiFecEmision() {
        return this.eadiFecEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEadiStEmiadic(String eadiStEmiadic) {
        this.eadiStEmiadic = eadiStEmiadic;
    }

    public String getEadiStEmiadic() {
        return this.eadiStEmiadic;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIADIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEadiIdPrograma() != null && this.getEadiIdPrograma().longValue() == -999) {
            conditions += " AND EADI_ID_PROGRAMA IS NULL";
        } else if (this.getEadiIdPrograma() != null) {
            conditions += " AND EADI_ID_PROGRAMA = ?";
            values.add(this.getEadiIdPrograma());
        }

        if (this.getEadiIdFideicomiso() != null && this.getEadiIdFideicomiso().longValue() == -999) {
            conditions += " AND EADI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEadiIdFideicomiso() != null) {
            conditions += " AND EADI_ID_FIDEICOMISO = ?";
            values.add(this.getEadiIdFideicomiso());
        }

        if (this.getEadiIdEmision() != null && this.getEadiIdEmision().longValue() == -999) {
            conditions += " AND EADI_ID_EMISION IS NULL";
        } else if (this.getEadiIdEmision() != null) {
            conditions += " AND EADI_ID_EMISION = ?";
            values.add(this.getEadiIdEmision());
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
        String sql = "SELECT * FROM F_EMIADIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEadiIdPrograma() != null && this.getEadiIdPrograma().longValue() == -999) {
            conditions += " AND EADI_ID_PROGRAMA IS NULL";
        } else if (this.getEadiIdPrograma() != null) {
            conditions += " AND EADI_ID_PROGRAMA = ?";
            values.add(this.getEadiIdPrograma());
        }

        if (this.getEadiIdFideicomiso() != null && this.getEadiIdFideicomiso().longValue() == -999) {
            conditions += " AND EADI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEadiIdFideicomiso() != null) {
            conditions += " AND EADI_ID_FIDEICOMISO = ?";
            values.add(this.getEadiIdFideicomiso());
        }

        if (this.getEadiIdEmision() != null && this.getEadiIdEmision().longValue() == -999) {
            conditions += " AND EADI_ID_EMISION IS NULL";
        } else if (this.getEadiIdEmision() != null) {
            conditions += " AND EADI_ID_EMISION = ?";
            values.add(this.getEadiIdEmision());
        }

        if (this.getEadiAumentoVals() != null && this.getEadiAumentoVals().longValue() == -999) {
            conditions += " AND EADI_AUMENTO_VALS IS NULL";
        } else if (this.getEadiAumentoVals() != null) {
            conditions += " AND EADI_AUMENTO_VALS = ?";
            values.add(this.getEadiAumentoVals());
        }

        if (this.getEadiAdicionCupon() != null && this.getEadiAdicionCupon().longValue() == -999) {
            conditions += " AND EADI_ADICION_CUPON IS NULL";
        } else if (this.getEadiAdicionCupon() != null) {
            conditions += " AND EADI_ADICION_CUPON = ?";
            values.add(this.getEadiAdicionCupon());
        }

        if (this.getEadiNumTitulos() != null && this.getEadiNumTitulos().longValue() == -999) {
            conditions += " AND EADI_NUM_TITULOS IS NULL";
        } else if (this.getEadiNumTitulos() != null) {
            conditions += " AND EADI_NUM_TITULOS = ?";
            values.add(this.getEadiNumTitulos());
        }

        if (this.getEadiImpNominal() != null && this.getEadiImpNominal().longValue() == -999) {
            conditions += " AND EADI_IMP_NOMINAL IS NULL";
        } else if (this.getEadiImpNominal() != null) {
            conditions += " AND EADI_IMP_NOMINAL = ?";
            values.add(this.getEadiImpNominal());
        }

        if (this.getEadiFecEmision() != null && "null".equals(this.getEadiFecEmision())) {
            conditions += " AND EADI_FEC_EMISION IS NULL";
        } else if (this.getEadiFecEmision() != null) {
            conditions += " AND EADI_FEC_EMISION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEadiFecEmision());
        }

        if (this.getEadiStEmiadic() != null && "null".equals(this.getEadiStEmiadic())) {
            conditions += " AND EADI_ST_EMIADIC IS NULL";
        } else if (this.getEadiStEmiadic() != null) {
            conditions += " AND EADI_ST_EMIADIC = ?";
            values.add(this.getEadiStEmiadic());
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
        String sql = "UPDATE F_EMIADIC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EADI_ID_PROGRAMA = ?";
        pkValues.add(this.getEadiIdPrograma());
        conditions += " AND EADI_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEadiIdFideicomiso());
        conditions += " AND EADI_ID_EMISION = ?";
        pkValues.add(this.getEadiIdEmision());
        fields += " EADI_AUMENTO_VALS = ?, ";
        values.add(this.getEadiAumentoVals());
        fields += " EADI_ADICION_CUPON = ?, ";
        values.add(this.getEadiAdicionCupon());
        fields += " EADI_NUM_TITULOS = ?, ";
        values.add(this.getEadiNumTitulos());
        fields += " EADI_IMP_NOMINAL = ?, ";
        values.add(this.getEadiImpNominal());
        fields += " EADI_FEC_EMISION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEadiFecEmision());
        fields += " EADI_ST_EMIADIC = ?, ";
        values.add(this.getEadiStEmiadic());
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
        String sql = "INSERT INTO F_EMIADIC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EADI_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEadiIdPrograma());

        fields += ", EADI_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEadiIdFideicomiso());

        fields += ", EADI_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEadiIdEmision());

        fields += ", EADI_AUMENTO_VALS";
        fieldValues += ", ?";
        values.add(this.getEadiAumentoVals());

        fields += ", EADI_ADICION_CUPON";
        fieldValues += ", ?";
        values.add(this.getEadiAdicionCupon());

        fields += ", EADI_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEadiNumTitulos());

        fields += ", EADI_IMP_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getEadiImpNominal());

        fields += ", EADI_FEC_EMISION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEadiFecEmision());

        fields += ", EADI_ST_EMIADIC";
        fieldValues += ", ?";
        values.add(this.getEadiStEmiadic());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIADIC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EADI_ID_PROGRAMA = ?";
        values.add(this.getEadiIdPrograma());
        conditions += " AND EADI_ID_FIDEICOMISO = ?";
        values.add(this.getEadiIdFideicomiso());
        conditions += " AND EADI_ID_EMISION = ?";
        values.add(this.getEadiIdEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmiadic instance = (FEmiadic) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEadiIdPrograma().equals(instance.getEadiIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEadiIdFideicomiso().equals(instance.getEadiIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEadiIdEmision().equals(instance.getEadiIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEadiAumentoVals().equals(instance.getEadiAumentoVals()))
            equalObjects = false;
        if (equalObjects && !this.getEadiAdicionCupon().equals(instance.getEadiAdicionCupon()))
            equalObjects = false;
        if (equalObjects && !this.getEadiNumTitulos().equals(instance.getEadiNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEadiImpNominal().equals(instance.getEadiImpNominal()))
            equalObjects = false;
        if (equalObjects && !this.getEadiFecEmision().equals(instance.getEadiFecEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEadiStEmiadic().equals(instance.getEadiStEmiadic()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmiadic result = new FEmiadic();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEadiIdPrograma((BigDecimal) objectData.getData("EADI_ID_PROGRAMA"));
        result.setEadiIdFideicomiso((BigDecimal) objectData.getData("EADI_ID_FIDEICOMISO"));
        result.setEadiIdEmision((BigDecimal) objectData.getData("EADI_ID_EMISION"));
        result.setEadiAumentoVals((BigDecimal) objectData.getData("EADI_AUMENTO_VALS"));
        result.setEadiAdicionCupon((BigDecimal) objectData.getData("EADI_ADICION_CUPON"));
        result.setEadiNumTitulos((BigDecimal) objectData.getData("EADI_NUM_TITULOS"));
        result.setEadiImpNominal((BigDecimal) objectData.getData("EADI_IMP_NOMINAL"));
        result.setEadiFecEmision((String) objectData.getData("EADI_FEC_EMISION"));
        result.setEadiStEmiadic((String) objectData.getData("EADI_ST_EMIADIC"));

        return result;

    }

}
