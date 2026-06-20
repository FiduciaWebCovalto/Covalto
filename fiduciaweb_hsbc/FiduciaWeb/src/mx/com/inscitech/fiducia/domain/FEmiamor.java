package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;

@PrimaryKey(constraintName = "F_EMIAMOR_PK", columns = { "EEAM_ID_PROGRAMA", "EEAM_ID_FIDEICOMISO", "EEAM_ID_EMISION", "EEAM_ID_SEC_CALC", "EEAM_ID_SEC_AMOR" },
            sequences = { "MANUAL" })
public class FEmiamor extends DomainObject {

    BigDecimal eeamIdPrograma = null;
    BigDecimal eeamIdFideicomiso = null;
    BigDecimal eeamIdEmision = null;
    BigDecimal eeamIdSecCalc = null;
    BigDecimal eeamIdSecAmor = null;
    String eeamFecIniPeriodo = null;
    String eeamFecFinPeriodo = null;
    String eeamPeriodicidad = null;
    BigDecimal eeamImpAmortizacion = null;
    String eeamStEmiamor = null;

    public FEmiamor() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeamIdPrograma(BigDecimal eeamIdPrograma) {
        this.eeamIdPrograma = eeamIdPrograma;
    }

    public BigDecimal getEeamIdPrograma() {
        return this.eeamIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeamIdFideicomiso(BigDecimal eeamIdFideicomiso) {
        this.eeamIdFideicomiso = eeamIdFideicomiso;
    }

    public BigDecimal getEeamIdFideicomiso() {
        return this.eeamIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeamIdEmision(BigDecimal eeamIdEmision) {
        this.eeamIdEmision = eeamIdEmision;
    }

    public BigDecimal getEeamIdEmision() {
        return this.eeamIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeamIdSecCalc(BigDecimal eeamIdSecCalc) {
        this.eeamIdSecCalc = eeamIdSecCalc;
    }

    public BigDecimal getEeamIdSecCalc() {
        return this.eeamIdSecCalc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeamIdSecAmor(BigDecimal eeamIdSecAmor) {
        this.eeamIdSecAmor = eeamIdSecAmor;
    }

    public BigDecimal getEeamIdSecAmor() {
        return this.eeamIdSecAmor;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeamFecIniPeriodo(String eeamFecIniPeriodo) {
        this.eeamFecIniPeriodo = eeamFecIniPeriodo;
    }

    public String getEeamFecIniPeriodo() {
        return this.eeamFecIniPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeamFecFinPeriodo(String eeamFecFinPeriodo) {
        this.eeamFecFinPeriodo = eeamFecFinPeriodo;
    }

    public String getEeamFecFinPeriodo() {
        return this.eeamFecFinPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeamPeriodicidad(String eeamPeriodicidad) {
        this.eeamPeriodicidad = eeamPeriodicidad;
    }

    public String getEeamPeriodicidad() {
        return this.eeamPeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeamImpAmortizacion(BigDecimal eeamImpAmortizacion) {
        this.eeamImpAmortizacion = eeamImpAmortizacion;
    }

    public BigDecimal getEeamImpAmortizacion() {
        return this.eeamImpAmortizacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeamStEmiamor(String eeamStEmiamor) {
        this.eeamStEmiamor = eeamStEmiamor;
    }

    public String getEeamStEmiamor() {
        return this.eeamStEmiamor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIAMOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeamIdPrograma() != null && this.getEeamIdPrograma().longValue() == -999) {
            conditions += " AND EEAM_ID_PROGRAMA IS NULL";
        } else if (this.getEeamIdPrograma() != null) {
            conditions += " AND EEAM_ID_PROGRAMA = ?";
            values.add(this.getEeamIdPrograma());
        }

        if (this.getEeamIdFideicomiso() != null && this.getEeamIdFideicomiso().longValue() == -999) {
            conditions += " AND EEAM_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeamIdFideicomiso() != null) {
            conditions += " AND EEAM_ID_FIDEICOMISO = ?";
            values.add(this.getEeamIdFideicomiso());
        }

        if (this.getEeamIdEmision() != null && this.getEeamIdEmision().longValue() == -999) {
            conditions += " AND EEAM_ID_EMISION IS NULL";
        } else if (this.getEeamIdEmision() != null) {
            conditions += " AND EEAM_ID_EMISION = ?";
            values.add(this.getEeamIdEmision());
        }

        if (this.getEeamIdSecCalc() != null && this.getEeamIdSecCalc().longValue() == -999) {
            conditions += " AND EEAM_ID_SEC_CALC IS NULL";
        } else if (this.getEeamIdSecCalc() != null) {
            conditions += " AND EEAM_ID_SEC_CALC = ?";
            values.add(this.getEeamIdSecCalc());
        }

        if (this.getEeamIdSecAmor() != null && this.getEeamIdSecAmor().longValue() == -999) {
            conditions += " AND EEAM_ID_SEC_AMOR IS NULL";
        } else if (this.getEeamIdSecAmor() != null) {
            conditions += " AND EEAM_ID_SEC_AMOR = ?";
            values.add(this.getEeamIdSecAmor());
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
        String sql = "SELECT * FROM F_EMIAMOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeamIdPrograma() != null && this.getEeamIdPrograma().longValue() == -999) {
            conditions += " AND EEAM_ID_PROGRAMA IS NULL";
        } else if (this.getEeamIdPrograma() != null) {
            conditions += " AND EEAM_ID_PROGRAMA = ?";
            values.add(this.getEeamIdPrograma());
        }

        if (this.getEeamIdFideicomiso() != null && this.getEeamIdFideicomiso().longValue() == -999) {
            conditions += " AND EEAM_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeamIdFideicomiso() != null) {
            conditions += " AND EEAM_ID_FIDEICOMISO = ?";
            values.add(this.getEeamIdFideicomiso());
        }

        if (this.getEeamIdEmision() != null && this.getEeamIdEmision().longValue() == -999) {
            conditions += " AND EEAM_ID_EMISION IS NULL";
        } else if (this.getEeamIdEmision() != null) {
            conditions += " AND EEAM_ID_EMISION = ?";
            values.add(this.getEeamIdEmision());
        }

        if (this.getEeamIdSecCalc() != null && this.getEeamIdSecCalc().longValue() == -999) {
            conditions += " AND EEAM_ID_SEC_CALC IS NULL";
        } else if (this.getEeamIdSecCalc() != null) {
            conditions += " AND EEAM_ID_SEC_CALC = ?";
            values.add(this.getEeamIdSecCalc());
        }

        if (this.getEeamIdSecAmor() != null && this.getEeamIdSecAmor().longValue() == -999) {
            conditions += " AND EEAM_ID_SEC_AMOR IS NULL";
        } else if (this.getEeamIdSecAmor() != null) {
            conditions += " AND EEAM_ID_SEC_AMOR = ?";
            values.add(this.getEeamIdSecAmor());
        }

        if (this.getEeamFecIniPeriodo() != null && "null".equals(this.getEeamFecIniPeriodo())) {
            conditions += " AND EEAM_FEC_INI_PERIODO IS NULL";
        } else if (this.getEeamFecIniPeriodo() != null) {
            conditions += " AND EEAM_FEC_INI_PERIODO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeamFecIniPeriodo());
        }

        if (this.getEeamFecFinPeriodo() != null && "null".equals(this.getEeamFecFinPeriodo())) {
            conditions += " AND EEAM_FEC_FIN_PERIODO IS NULL";
        } else if (this.getEeamFecFinPeriodo() != null) {
            conditions += " AND EEAM_FEC_FIN_PERIODO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeamFecFinPeriodo());
        }

        if (this.getEeamPeriodicidad() != null && "null".equals(this.getEeamPeriodicidad())) {
            conditions += " AND EEAM_PERIODICIDAD IS NULL";
        } else if (this.getEeamPeriodicidad() != null) {
            conditions += " AND EEAM_PERIODICIDAD = ?";
            values.add(this.getEeamPeriodicidad());
        }

        if (this.getEeamImpAmortizacion() != null && this.getEeamImpAmortizacion().longValue() == -999) {
            conditions += " AND EEAM_IMP_AMORTIZACION IS NULL";
        } else if (this.getEeamImpAmortizacion() != null) {
            conditions += " AND EEAM_IMP_AMORTIZACION = ?";
            values.add(this.getEeamImpAmortizacion());
        }

        if (this.getEeamStEmiamor() != null && "null".equals(this.getEeamStEmiamor())) {
            conditions += " AND EEAM_ST_EMIAMOR IS NULL";
        } else if (this.getEeamStEmiamor() != null) {
            conditions += " AND EEAM_ST_EMIAMOR = ?";
            values.add(this.getEeamStEmiamor());
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
        String sql = "UPDATE F_EMIAMOR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEAM_ID_PROGRAMA = ?";
        pkValues.add(this.getEeamIdPrograma());
        conditions += " AND EEAM_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEeamIdFideicomiso());
        conditions += " AND EEAM_ID_EMISION = ?";
        pkValues.add(this.getEeamIdEmision());
        conditions += " AND EEAM_ID_SEC_CALC = ?";
        pkValues.add(this.getEeamIdSecCalc());
        conditions += " AND EEAM_ID_SEC_AMOR = ?";
        pkValues.add(this.getEeamIdSecAmor());
        fields += " EEAM_FEC_INI_PERIODO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeamFecIniPeriodo());
        fields += " EEAM_FEC_FIN_PERIODO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeamFecFinPeriodo());
        fields += " EEAM_PERIODICIDAD = ?, ";
        values.add(this.getEeamPeriodicidad());
        fields += " EEAM_IMP_AMORTIZACION = ?, ";
        values.add(this.getEeamImpAmortizacion());
        fields += " EEAM_ST_EMIAMOR = ?, ";
        values.add(this.getEeamStEmiamor());
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
        String sql = "INSERT INTO F_EMIAMOR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEAM_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEeamIdPrograma());

        fields += ", EEAM_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEeamIdFideicomiso());

        fields += ", EEAM_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEeamIdEmision());

        fields += ", EEAM_ID_SEC_CALC";
        fieldValues += ", ?";
        values.add(this.getEeamIdSecCalc());

        fields += ", EEAM_ID_SEC_AMOR";
        fieldValues += ", ?";
        values.add(this.getEeamIdSecAmor());

        fields += ", EEAM_FEC_INI_PERIODO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeamFecIniPeriodo());

        fields += ", EEAM_FEC_FIN_PERIODO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeamFecFinPeriodo());

        fields += ", EEAM_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getEeamPeriodicidad());

        fields += ", EEAM_IMP_AMORTIZACION";
        fieldValues += ", ?";
        values.add(this.getEeamImpAmortizacion());

        fields += ", EEAM_ST_EMIAMOR";
        fieldValues += ", ?";
        values.add(this.getEeamStEmiamor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIAMOR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEAM_ID_PROGRAMA = ?";
        values.add(this.getEeamIdPrograma());
        conditions += " AND EEAM_ID_FIDEICOMISO = ?";
        values.add(this.getEeamIdFideicomiso());
        conditions += " AND EEAM_ID_EMISION = ?";
        values.add(this.getEeamIdEmision());
        conditions += " AND EEAM_ID_SEC_CALC = ?";
        values.add(this.getEeamIdSecCalc());
        conditions += " AND EEAM_ID_SEC_AMOR = ?";
        values.add(this.getEeamIdSecAmor());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmiamor instance = (FEmiamor) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEeamIdPrograma().equals(instance.getEeamIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEeamIdFideicomiso().equals(instance.getEeamIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEeamIdEmision().equals(instance.getEeamIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeamIdSecCalc().equals(instance.getEeamIdSecCalc()))
            equalObjects = false;
        if (equalObjects && !this.getEeamIdSecAmor().equals(instance.getEeamIdSecAmor()))
            equalObjects = false;
        if (equalObjects && !this.getEeamFecIniPeriodo().equals(instance.getEeamFecIniPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEeamFecFinPeriodo().equals(instance.getEeamFecFinPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEeamPeriodicidad().equals(instance.getEeamPeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getEeamImpAmortizacion().equals(instance.getEeamImpAmortizacion()))
            equalObjects = false;
        if (equalObjects && !this.getEeamStEmiamor().equals(instance.getEeamStEmiamor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmiamor result = new FEmiamor();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEeamIdPrograma((BigDecimal) objectData.getData("EEAM_ID_PROGRAMA"));
        result.setEeamIdFideicomiso((BigDecimal) objectData.getData("EEAM_ID_FIDEICOMISO"));
        result.setEeamIdEmision((BigDecimal) objectData.getData("EEAM_ID_EMISION"));
        result.setEeamIdSecCalc((BigDecimal) objectData.getData("EEAM_ID_SEC_CALC"));
        result.setEeamIdSecAmor((BigDecimal) objectData.getData("EEAM_ID_SEC_AMOR"));
        result.setEeamFecIniPeriodo((String) objectData.getData("EEAM_FEC_INI_PERIODO"));
        result.setEeamFecFinPeriodo((String) objectData.getData("EEAM_FEC_FIN_PERIODO"));
        result.setEeamPeriodicidad((String) objectData.getData("EEAM_PERIODICIDAD"));
        result.setEeamImpAmortizacion((BigDecimal) objectData.getData("EEAM_IMP_AMORTIZACION"));
        result.setEeamStEmiamor((String) objectData.getData("EEAM_ST_EMIAMOR"));

        return result;

    }

}
