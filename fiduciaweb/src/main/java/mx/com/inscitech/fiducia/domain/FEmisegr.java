package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMISEGR_PK", columns = { "EESE_ID_PROGRAMA", "EESE_ID_FIDEICOMISO", "EESE_ID_EMISION", "EESE_ID_SEC_CUPON" }, sequences = { "MANUAL" })
public class FEmisegr extends DomainObject {

    BigDecimal eeseIdPrograma = null;
    BigDecimal eeseIdFideicomiso = null;
    BigDecimal eeseIdEmision = null;
    BigDecimal eeseIdSecCupon = null;
    String eeseCveCupon = null;
    BigDecimal eeseNumSerie = null;
    BigDecimal eesePlazo = null;
    String eeseCvePeriodo = null;
    String eeseFecInicio = null;
    String eeseFecVencimiento = null;
    String eeseStEmisegr = null;

    public FEmisegr() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeseIdPrograma(BigDecimal eeseIdPrograma) {
        this.eeseIdPrograma = eeseIdPrograma;
    }

    public BigDecimal getEeseIdPrograma() {
        return this.eeseIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeseIdFideicomiso(BigDecimal eeseIdFideicomiso) {
        this.eeseIdFideicomiso = eeseIdFideicomiso;
    }

    public BigDecimal getEeseIdFideicomiso() {
        return this.eeseIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEeseIdEmision(BigDecimal eeseIdEmision) {
        this.eeseIdEmision = eeseIdEmision;
    }

    public BigDecimal getEeseIdEmision() {
        return this.eeseIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEeseIdSecCupon(BigDecimal eeseIdSecCupon) {
        this.eeseIdSecCupon = eeseIdSecCupon;
    }

    public BigDecimal getEeseIdSecCupon() {
        return this.eeseIdSecCupon;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeseCveCupon(String eeseCveCupon) {
        this.eeseCveCupon = eeseCveCupon;
    }

    public String getEeseCveCupon() {
        return this.eeseCveCupon;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEeseNumSerie(BigDecimal eeseNumSerie) {
        this.eeseNumSerie = eeseNumSerie;
    }

    public BigDecimal getEeseNumSerie() {
        return this.eeseNumSerie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEesePlazo(BigDecimal eesePlazo) {
        this.eesePlazo = eesePlazo;
    }

    public BigDecimal getEesePlazo() {
        return this.eesePlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeseCvePeriodo(String eeseCvePeriodo) {
        this.eeseCvePeriodo = eeseCvePeriodo;
    }

    public String getEeseCvePeriodo() {
        return this.eeseCvePeriodo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeseFecInicio(String eeseFecInicio) {
        this.eeseFecInicio = eeseFecInicio;
    }

    public String getEeseFecInicio() {
        return this.eeseFecInicio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEeseFecVencimiento(String eeseFecVencimiento) {
        this.eeseFecVencimiento = eeseFecVencimiento;
    }

    public String getEeseFecVencimiento() {
        return this.eeseFecVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEeseStEmisegr(String eeseStEmisegr) {
        this.eeseStEmisegr = eeseStEmisegr;
    }

    public String getEeseStEmisegr() {
        return this.eeseStEmisegr;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMISEGR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeseIdPrograma() != null && this.getEeseIdPrograma().longValue() == -999) {
            conditions += " AND EESE_ID_PROGRAMA IS NULL";
        } else if (this.getEeseIdPrograma() != null) {
            conditions += " AND EESE_ID_PROGRAMA = ?";
            values.add(this.getEeseIdPrograma());
        }

        if (this.getEeseIdFideicomiso() != null && this.getEeseIdFideicomiso().longValue() == -999) {
            conditions += " AND EESE_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeseIdFideicomiso() != null) {
            conditions += " AND EESE_ID_FIDEICOMISO = ?";
            values.add(this.getEeseIdFideicomiso());
        }

        if (this.getEeseIdEmision() != null && this.getEeseIdEmision().longValue() == -999) {
            conditions += " AND EESE_ID_EMISION IS NULL";
        } else if (this.getEeseIdEmision() != null) {
            conditions += " AND EESE_ID_EMISION = ?";
            values.add(this.getEeseIdEmision());
        }

        if (this.getEeseIdSecCupon() != null && this.getEeseIdSecCupon().longValue() == -999) {
            conditions += " AND EESE_ID_SEC_CUPON IS NULL";
        } else if (this.getEeseIdSecCupon() != null) {
            conditions += " AND EESE_ID_SEC_CUPON = ?";
            values.add(this.getEeseIdSecCupon());
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
        String sql = "SELECT * FROM F_EMISEGR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEeseIdPrograma() != null && this.getEeseIdPrograma().longValue() == -999) {
            conditions += " AND EESE_ID_PROGRAMA IS NULL";
        } else if (this.getEeseIdPrograma() != null) {
            conditions += " AND EESE_ID_PROGRAMA = ?";
            values.add(this.getEeseIdPrograma());
        }

        if (this.getEeseIdFideicomiso() != null && this.getEeseIdFideicomiso().longValue() == -999) {
            conditions += " AND EESE_ID_FIDEICOMISO IS NULL";
        } else if (this.getEeseIdFideicomiso() != null) {
            conditions += " AND EESE_ID_FIDEICOMISO = ?";
            values.add(this.getEeseIdFideicomiso());
        }

        if (this.getEeseIdEmision() != null && this.getEeseIdEmision().longValue() == -999) {
            conditions += " AND EESE_ID_EMISION IS NULL";
        } else if (this.getEeseIdEmision() != null) {
            conditions += " AND EESE_ID_EMISION = ?";
            values.add(this.getEeseIdEmision());
        }

        if (this.getEeseIdSecCupon() != null && this.getEeseIdSecCupon().longValue() == -999) {
            conditions += " AND EESE_ID_SEC_CUPON IS NULL";
        } else if (this.getEeseIdSecCupon() != null) {
            conditions += " AND EESE_ID_SEC_CUPON = ?";
            values.add(this.getEeseIdSecCupon());
        }

        if (this.getEeseCveCupon() != null && "null".equals(this.getEeseCveCupon())) {
            conditions += " AND EESE_CVE_CUPON IS NULL";
        } else if (this.getEeseCveCupon() != null) {
            conditions += " AND EESE_CVE_CUPON = ?";
            values.add(this.getEeseCveCupon());
        }

        if (this.getEeseNumSerie() != null && this.getEeseNumSerie().longValue() == -999) {
            conditions += " AND EESE_NUM_SERIE IS NULL";
        } else if (this.getEeseNumSerie() != null) {
            conditions += " AND EESE_NUM_SERIE = ?";
            values.add(this.getEeseNumSerie());
        }

        if (this.getEesePlazo() != null && this.getEesePlazo().longValue() == -999) {
            conditions += " AND EESE_PLAZO IS NULL";
        } else if (this.getEesePlazo() != null) {
            conditions += " AND EESE_PLAZO = ?";
            values.add(this.getEesePlazo());
        }

        if (this.getEeseCvePeriodo() != null && "null".equals(this.getEeseCvePeriodo())) {
            conditions += " AND EESE_CVE_PERIODO IS NULL";
        } else if (this.getEeseCvePeriodo() != null) {
            conditions += " AND EESE_CVE_PERIODO = ?";
            values.add(this.getEeseCvePeriodo());
        }

        if (this.getEeseFecInicio() != null && "null".equals(this.getEeseFecInicio())) {
            conditions += " AND EESE_FEC_INICIO IS NULL";
        } else if (this.getEeseFecInicio() != null) {
            conditions += " AND EESE_FEC_INICIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeseFecInicio());
        }

        if (this.getEeseFecVencimiento() != null && "null".equals(this.getEeseFecVencimiento())) {
            conditions += " AND EESE_FEC_VENCIMIENTO IS NULL";
        } else if (this.getEeseFecVencimiento() != null) {
            conditions += " AND EESE_FEC_VENCIMIENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEeseFecVencimiento());
        }

        if (this.getEeseStEmisegr() != null && "null".equals(this.getEeseStEmisegr())) {
            conditions += " AND EESE_ST_EMISEGR IS NULL";
        } else if (this.getEeseStEmisegr() != null) {
            conditions += " AND EESE_ST_EMISEGR = ?";
            values.add(this.getEeseStEmisegr());
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
        String sql = "UPDATE F_EMISEGR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EESE_ID_PROGRAMA = ?";
        pkValues.add(this.getEeseIdPrograma());
        conditions += " AND EESE_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEeseIdFideicomiso());
        conditions += " AND EESE_ID_EMISION = ?";
        pkValues.add(this.getEeseIdEmision());
        conditions += " AND EESE_ID_SEC_CUPON = ?";
        pkValues.add(this.getEeseIdSecCupon());
        fields += " EESE_CVE_CUPON = ?, ";
        values.add(this.getEeseCveCupon());
        fields += " EESE_NUM_SERIE = ?, ";
        values.add(this.getEeseNumSerie());
        fields += " EESE_PLAZO = ?, ";
        values.add(this.getEesePlazo());
        fields += " EESE_CVE_PERIODO = ?, ";
        values.add(this.getEeseCvePeriodo());
        fields += " EESE_FEC_INICIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeseFecInicio());
        fields += " EESE_FEC_VENCIMIENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEeseFecVencimiento());
        fields += " EESE_ST_EMISEGR = ?, ";
        values.add(this.getEeseStEmisegr());
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
        String sql = "INSERT INTO F_EMISEGR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EESE_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEeseIdPrograma());

        fields += ", EESE_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEeseIdFideicomiso());

        fields += ", EESE_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEeseIdEmision());

        fields += ", EESE_ID_SEC_CUPON";
        fieldValues += ", ?";
        values.add(this.getEeseIdSecCupon());

        fields += ", EESE_CVE_CUPON";
        fieldValues += ", ?";
        values.add(this.getEeseCveCupon());

        fields += ", EESE_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getEeseNumSerie());

        fields += ", EESE_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEesePlazo());

        fields += ", EESE_CVE_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEeseCvePeriodo());

        fields += ", EESE_FEC_INICIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeseFecInicio());

        fields += ", EESE_FEC_VENCIMIENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEeseFecVencimiento());

        fields += ", EESE_ST_EMISEGR";
        fieldValues += ", ?";
        values.add(this.getEeseStEmisegr());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMISEGR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EESE_ID_PROGRAMA = ?";
        values.add(this.getEeseIdPrograma());
        conditions += " AND EESE_ID_FIDEICOMISO = ?";
        values.add(this.getEeseIdFideicomiso());
        conditions += " AND EESE_ID_EMISION = ?";
        values.add(this.getEeseIdEmision());
        conditions += " AND EESE_ID_SEC_CUPON = ?";
        values.add(this.getEeseIdSecCupon());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmisegr instance = (FEmisegr) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEeseIdPrograma().equals(instance.getEeseIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEeseIdFideicomiso().equals(instance.getEeseIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEeseIdEmision().equals(instance.getEeseIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEeseIdSecCupon().equals(instance.getEeseIdSecCupon()))
            equalObjects = false;
        if (equalObjects && !this.getEeseCveCupon().equals(instance.getEeseCveCupon()))
            equalObjects = false;
        if (equalObjects && !this.getEeseNumSerie().equals(instance.getEeseNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEesePlazo().equals(instance.getEesePlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEeseCvePeriodo().equals(instance.getEeseCvePeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEeseFecInicio().equals(instance.getEeseFecInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEeseFecVencimiento().equals(instance.getEeseFecVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getEeseStEmisegr().equals(instance.getEeseStEmisegr()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmisegr result = new FEmisegr();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEeseIdPrograma((BigDecimal) objectData.getData("EESE_ID_PROGRAMA"));
        result.setEeseIdFideicomiso((BigDecimal) objectData.getData("EESE_ID_FIDEICOMISO"));
        result.setEeseIdEmision((BigDecimal) objectData.getData("EESE_ID_EMISION"));
        result.setEeseIdSecCupon((BigDecimal) objectData.getData("EESE_ID_SEC_CUPON"));
        result.setEeseCveCupon((String) objectData.getData("EESE_CVE_CUPON"));
        result.setEeseNumSerie((BigDecimal) objectData.getData("EESE_NUM_SERIE"));
        result.setEesePlazo((BigDecimal) objectData.getData("EESE_PLAZO"));
        result.setEeseCvePeriodo((String) objectData.getData("EESE_CVE_PERIODO"));
        result.setEeseFecInicio((String) objectData.getData("EESE_FEC_INICIO"));
        result.setEeseFecVencimiento((String) objectData.getData("EESE_FEC_VENCIMIENTO"));
        result.setEeseStEmisegr((String) objectData.getData("EESE_ST_EMISEGR"));

        return result;

    }

}
