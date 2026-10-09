package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMISADIC_PK", columns = { "EEAD_ID_PROGRAMA", "EEAD_ID_FIDEICOMISO", "EEAD_ID_EMISION" }, sequences = { "MANUAL" })
public class FEmisadic extends DomainObject {

    BigDecimal eeadIdPrograma = null;
    BigDecimal eeadIdFideicomiso = null;
    BigDecimal eeadIdEmision = null;
    BigDecimal eeadAumentoVals = null;
    BigDecimal eeadAdicionCupon = null;
    BigDecimal eeadNumTitulos = null;
    BigDecimal eeadImpNominal = null;
    String eeadFecEmision = null;
    String eeadStEmisadic = null;

    public FEmisadic() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeadIdPrograma(BigDecimal eeadIdPrograma) {
        this.eeadIdPrograma = eeadIdPrograma;
    }

    public BigDecimal getEeadIdPrograma() {
        return this.eeadIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeadIdFideicomiso(BigDecimal eeadIdFideicomiso) {
        this.eeadIdFideicomiso = eeadIdFideicomiso;
    }

    public BigDecimal getEeadIdFideicomiso() {
        return this.eeadIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeadIdEmision(BigDecimal eeadIdEmision) {
        this.eeadIdEmision = eeadIdEmision;
    }

    public BigDecimal getEeadIdEmision() {
        return this.eeadIdEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeadAumentoVals(BigDecimal eeadAumentoVals) {
        this.eeadAumentoVals = eeadAumentoVals;
    }

    public BigDecimal getEeadAumentoVals() {
        return this.eeadAumentoVals;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeadAdicionCupon(BigDecimal eeadAdicionCupon) {
        this.eeadAdicionCupon = eeadAdicionCupon;
    }

    public BigDecimal getEeadAdicionCupon() {
        return this.eeadAdicionCupon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeadNumTitulos(BigDecimal eeadNumTitulos) {
        this.eeadNumTitulos = eeadNumTitulos;
    }

    public BigDecimal getEeadNumTitulos() {
        return this.eeadNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeadImpNominal(BigDecimal eeadImpNominal) {
        this.eeadImpNominal = eeadImpNominal;
    }

    public BigDecimal getEeadImpNominal() {
        return this.eeadImpNominal;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeadFecEmision(String eeadFecEmision) {
        this.eeadFecEmision = eeadFecEmision;
    }

    public String getEeadFecEmision() {
        return this.eeadFecEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeadStEmisadic(String eeadStEmisadic) {
        this.eeadStEmisadic = eeadStEmisadic;
    }

    public String getEeadStEmisadic() {
        return this.eeadStEmisadic;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMISADIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeadIdPrograma() != null && this.getEeadIdPrograma().longValue() == -999) {
            conditions += " AND EEAD_ID_PROGRAMA IS NULL";
        } else if (this.getEeadIdPrograma() != null) {
            conditions += " AND EEAD_ID_PROGRAMA = ?";
            values.add(this.getEeadIdPrograma());
        }

        if (this.getEeadIdFideicomiso() != null && this.getEeadIdFideicomiso().longValue() == -999) {
            conditions += " AND EEAD_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeadIdFideicomiso() != null) {
            conditions += " AND EEAD_ID_FIDEICOMISO = ?";
            values.add(this.getEeadIdFideicomiso());
        }

        if (this.getEeadIdEmision() != null && this.getEeadIdEmision().longValue() == -999) {
            conditions += " AND EEAD_ID_EMISION IS NULL";
        } else if (this.getEeadIdEmision() != null) {
            conditions += " AND EEAD_ID_EMISION = ?";
            values.add(this.getEeadIdEmision());
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
        String sql = "SELECT * FROM F_EMISADIC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeadIdPrograma() != null && this.getEeadIdPrograma().longValue() == -999) {
            conditions += " AND EEAD_ID_PROGRAMA IS NULL";
        } else if (this.getEeadIdPrograma() != null) {
            conditions += " AND EEAD_ID_PROGRAMA = ?";
            values.add(this.getEeadIdPrograma());
        }

        if (this.getEeadIdFideicomiso() != null && this.getEeadIdFideicomiso().longValue() == -999) {
            conditions += " AND EEAD_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeadIdFideicomiso() != null) {
            conditions += " AND EEAD_ID_FIDEICOMISO = ?";
            values.add(this.getEeadIdFideicomiso());
        }

        if (this.getEeadIdEmision() != null && this.getEeadIdEmision().longValue() == -999) {
            conditions += " AND EEAD_ID_EMISION IS NULL";
        } else if (this.getEeadIdEmision() != null) {
            conditions += " AND EEAD_ID_EMISION = ?";
            values.add(this.getEeadIdEmision());
        }

        if (this.getEeadAumentoVals() != null && this.getEeadAumentoVals().longValue() == -999) {
            conditions += " AND EEAD_AUMENTO_VALS IS NULL";
        } else if (this.getEeadAumentoVals() != null) {
            conditions += " AND EEAD_AUMENTO_VALS = ?";
            values.add(this.getEeadAumentoVals());
        }

        if (this.getEeadAdicionCupon() != null && this.getEeadAdicionCupon().longValue() == -999) {
            conditions += " AND EEAD_ADICION_CUPON IS NULL";
        } else if (this.getEeadAdicionCupon() != null) {
            conditions += " AND EEAD_ADICION_CUPON = ?";
            values.add(this.getEeadAdicionCupon());
        }

        if (this.getEeadNumTitulos() != null && this.getEeadNumTitulos().longValue() == -999) {
            conditions += " AND EEAD_NUM_TITULOS IS NULL";
        } else if (this.getEeadNumTitulos() != null) {
            conditions += " AND EEAD_NUM_TITULOS = ?";
            values.add(this.getEeadNumTitulos());
        }

        if (this.getEeadImpNominal() != null && this.getEeadImpNominal().longValue() == -999) {
            conditions += " AND EEAD_IMP_NOMINAL IS NULL";
        } else if (this.getEeadImpNominal() != null) {
            conditions += " AND EEAD_IMP_NOMINAL = ?";
            values.add(this.getEeadImpNominal());
        }

        if (this.getEeadFecEmision() != null && "null".equals(this.getEeadFecEmision())) {
            conditions += " AND EEAD_FEC_EMISION IS NULL";
        } else if (this.getEeadFecEmision() != null) {
            conditions += " AND EEAD_FEC_EMISION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeadFecEmision());
        }

        if (this.getEeadStEmisadic() != null && "null".equals(this.getEeadStEmisadic())) {
            conditions += " AND EEAD_ST_EMISADIC IS NULL";
        } else if (this.getEeadStEmisadic() != null) {
            conditions += " AND EEAD_ST_EMISADIC = ?";
            values.add(this.getEeadStEmisadic());
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
        String sql = "UPDATE F_EMISADIC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEAD_ID_PROGRAMA = ?";
        pkValues.add(this.getEeadIdPrograma());
        conditions += " AND EEAD_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEeadIdFideicomiso());
        conditions += " AND EEAD_ID_EMISION = ?";
        pkValues.add(this.getEeadIdEmision());
        fields += " EEAD_AUMENTO_VALS = ?, ";
        values.add(this.getEeadAumentoVals());
        fields += " EEAD_ADICION_CUPON = ?, ";
        values.add(this.getEeadAdicionCupon());
        fields += " EEAD_NUM_TITULOS = ?, ";
        values.add(this.getEeadNumTitulos());
        fields += " EEAD_IMP_NOMINAL = ?, ";
        values.add(this.getEeadImpNominal());
        fields += " EEAD_FEC_EMISION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeadFecEmision());
        fields += " EEAD_ST_EMISADIC = ?, ";
        values.add(this.getEeadStEmisadic());
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
        String sql = "INSERT INTO F_EMISADIC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEAD_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEeadIdPrograma());

        fields += ", EEAD_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEeadIdFideicomiso());

        fields += ", EEAD_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEeadIdEmision());

        fields += ", EEAD_AUMENTO_VALS";
        fieldValues += ", ?";
        values.add(this.getEeadAumentoVals());

        fields += ", EEAD_ADICION_CUPON";
        fieldValues += ", ?";
        values.add(this.getEeadAdicionCupon());

        fields += ", EEAD_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEeadNumTitulos());

        fields += ", EEAD_IMP_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getEeadImpNominal());

        fields += ", EEAD_FEC_EMISION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeadFecEmision());

        fields += ", EEAD_ST_EMISADIC";
        fieldValues += ", ?";
        values.add(this.getEeadStEmisadic());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMISADIC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEAD_ID_PROGRAMA = ?";
        values.add(this.getEeadIdPrograma());
        conditions += " AND EEAD_ID_FIDEICOMISO = ?";
        values.add(this.getEeadIdFideicomiso());
        conditions += " AND EEAD_ID_EMISION = ?";
        values.add(this.getEeadIdEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmisadic instance = (FEmisadic) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEeadIdPrograma().equals(instance.getEeadIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEeadIdFideicomiso().equals(instance.getEeadIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEeadIdEmision().equals(instance.getEeadIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeadAumentoVals().equals(instance.getEeadAumentoVals()))
            equalObjects = false;
        if (equalObjects && !this.getEeadAdicionCupon().equals(instance.getEeadAdicionCupon()))
            equalObjects = false;
        if (equalObjects && !this.getEeadNumTitulos().equals(instance.getEeadNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEeadImpNominal().equals(instance.getEeadImpNominal()))
            equalObjects = false;
        if (equalObjects && !this.getEeadFecEmision().equals(instance.getEeadFecEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeadStEmisadic().equals(instance.getEeadStEmisadic()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmisadic result = new FEmisadic();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEeadIdPrograma((BigDecimal) objectData.getData("EEAD_ID_PROGRAMA"));
        result.setEeadIdFideicomiso((BigDecimal) objectData.getData("EEAD_ID_FIDEICOMISO"));
        result.setEeadIdEmision((BigDecimal) objectData.getData("EEAD_ID_EMISION"));
        result.setEeadAumentoVals((BigDecimal) objectData.getData("EEAD_AUMENTO_VALS"));
        result.setEeadAdicionCupon((BigDecimal) objectData.getData("EEAD_ADICION_CUPON"));
        result.setEeadNumTitulos((BigDecimal) objectData.getData("EEAD_NUM_TITULOS"));
        result.setEeadImpNominal((BigDecimal) objectData.getData("EEAD_IMP_NOMINAL"));
        result.setEeadFecEmision((String) objectData.getData("EEAD_FEC_EMISION"));
        result.setEeadStEmisadic((String) objectData.getData("EEAD_ST_EMISADIC"));

        return result;

    }

}
