package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CONCILIACION_PK", columns = { "FCC_FECHA", "FCC_ID_CONCILIACION" }, sequences = { "MANUAL" })
public class FConciliacion extends DomainObject {

    String fccFecha = null;
    BigDecimal fccIdConciliacion = null;
    String fccConcepto1 = null;
    String fccNumero1 = null;
    String fccConcepto2 = null;
    String fccNumero2 = null;
    String fccConcepto3 = null;
    String fccNumero3 = null;
    String fccConcepto4 = null;
    String fccNumero4 = null;
    String fccConcepto5 = null;
    String fccNumero5 = null;
    String fccConcepto6 = null;
    String fccNumero6 = null;

    public FConciliacion() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setFccFecha(String fccFecha) {
        this.fccFecha = fccFecha;
    }

    public String getFccFecha() {
        return this.fccFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFccIdConciliacion(BigDecimal fccIdConciliacion) {
        this.fccIdConciliacion = fccIdConciliacion;
    }

    public BigDecimal getFccIdConciliacion() {
        return this.fccIdConciliacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccConcepto1(String fccConcepto1) {
        this.fccConcepto1 = fccConcepto1;
    }

    public String getFccConcepto1() {
        return this.fccConcepto1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccNumero1(String fccNumero1) {
        this.fccNumero1 = fccNumero1;
    }

    public String getFccNumero1() {
        return this.fccNumero1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccConcepto2(String fccConcepto2) {
        this.fccConcepto2 = fccConcepto2;
    }

    public String getFccConcepto2() {
        return this.fccConcepto2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccNumero2(String fccNumero2) {
        this.fccNumero2 = fccNumero2;
    }

    public String getFccNumero2() {
        return this.fccNumero2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccConcepto3(String fccConcepto3) {
        this.fccConcepto3 = fccConcepto3;
    }

    public String getFccConcepto3() {
        return this.fccConcepto3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccNumero3(String fccNumero3) {
        this.fccNumero3 = fccNumero3;
    }

    public String getFccNumero3() {
        return this.fccNumero3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccConcepto4(String fccConcepto4) {
        this.fccConcepto4 = fccConcepto4;
    }

    public String getFccConcepto4() {
        return this.fccConcepto4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccNumero4(String fccNumero4) {
        this.fccNumero4 = fccNumero4;
    }

    public String getFccNumero4() {
        return this.fccNumero4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccConcepto5(String fccConcepto5) {
        this.fccConcepto5 = fccConcepto5;
    }

    public String getFccConcepto5() {
        return this.fccConcepto5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccNumero5(String fccNumero5) {
        this.fccNumero5 = fccNumero5;
    }

    public String getFccNumero5() {
        return this.fccNumero5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccConcepto6(String fccConcepto6) {
        this.fccConcepto6 = fccConcepto6;
    }

    public String getFccConcepto6() {
        return this.fccConcepto6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFccNumero6(String fccNumero6) {
        this.fccNumero6 = fccNumero6;
    }

    public String getFccNumero6() {
        return this.fccNumero6;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CONCILIACION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFccFecha() != null && "null".equals(this.getFccFecha())) {
            conditions += " AND FCC_FECHA IS NULL";
        } else if (this.getFccFecha() != null) {
            conditions += " AND FCC_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFccFecha());
        }

        if (this.getFccIdConciliacion() != null && this.getFccIdConciliacion().longValue() == -999) {
            conditions += " AND FCC_ID_CONCILIACION IS NULL";
        } else if (this.getFccIdConciliacion() != null) {
            conditions += " AND FCC_ID_CONCILIACION = ?";
            values.add(this.getFccIdConciliacion());
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
        String sql = "SELECT * FROM F_CONCILIACION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFccFecha() != null && "null".equals(this.getFccFecha())) {
            conditions += " AND FCC_FECHA IS NULL";
        } else if (this.getFccFecha() != null) {
            conditions += " AND FCC_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFccFecha());
        }

        if (this.getFccIdConciliacion() != null && this.getFccIdConciliacion().longValue() == -999) {
            conditions += " AND FCC_ID_CONCILIACION IS NULL";
        } else if (this.getFccIdConciliacion() != null) {
            conditions += " AND FCC_ID_CONCILIACION = ?";
            values.add(this.getFccIdConciliacion());
        }

        if (this.getFccConcepto1() != null && "null".equals(this.getFccConcepto1())) {
            conditions += " AND FCC_CONCEPTO1 IS NULL";
        } else if (this.getFccConcepto1() != null) {
            conditions += " AND FCC_CONCEPTO1 = ?";
            values.add(this.getFccConcepto1());
        }

        if (this.getFccNumero1() != null && "null".equals(this.getFccNumero1())) {
            conditions += " AND FCC_NUMERO1 IS NULL";
        } else if (this.getFccNumero1() != null) {
            conditions += " AND FCC_NUMERO1 = ?";
            values.add(this.getFccNumero1());
        }

        if (this.getFccConcepto2() != null && "null".equals(this.getFccConcepto2())) {
            conditions += " AND FCC_CONCEPTO2 IS NULL";
        } else if (this.getFccConcepto2() != null) {
            conditions += " AND FCC_CONCEPTO2 = ?";
            values.add(this.getFccConcepto2());
        }

        if (this.getFccNumero2() != null && "null".equals(this.getFccNumero2())) {
            conditions += " AND FCC_NUMERO2 IS NULL";
        } else if (this.getFccNumero2() != null) {
            conditions += " AND FCC_NUMERO2 = ?";
            values.add(this.getFccNumero2());
        }

        if (this.getFccConcepto3() != null && "null".equals(this.getFccConcepto3())) {
            conditions += " AND FCC_CONCEPTO3 IS NULL";
        } else if (this.getFccConcepto3() != null) {
            conditions += " AND FCC_CONCEPTO3 = ?";
            values.add(this.getFccConcepto3());
        }

        if (this.getFccNumero3() != null && "null".equals(this.getFccNumero3())) {
            conditions += " AND FCC_NUMERO3 IS NULL";
        } else if (this.getFccNumero3() != null) {
            conditions += " AND FCC_NUMERO3 = ?";
            values.add(this.getFccNumero3());
        }

        if (this.getFccConcepto4() != null && "null".equals(this.getFccConcepto4())) {
            conditions += " AND FCC_CONCEPTO4 IS NULL";
        } else if (this.getFccConcepto4() != null) {
            conditions += " AND FCC_CONCEPTO4 = ?";
            values.add(this.getFccConcepto4());
        }

        if (this.getFccNumero4() != null && "null".equals(this.getFccNumero4())) {
            conditions += " AND FCC_NUMERO4 IS NULL";
        } else if (this.getFccNumero4() != null) {
            conditions += " AND FCC_NUMERO4 = ?";
            values.add(this.getFccNumero4());
        }

        if (this.getFccConcepto5() != null && "null".equals(this.getFccConcepto5())) {
            conditions += " AND FCC_CONCEPTO5 IS NULL";
        } else if (this.getFccConcepto5() != null) {
            conditions += " AND FCC_CONCEPTO5 = ?";
            values.add(this.getFccConcepto5());
        }

        if (this.getFccNumero5() != null && "null".equals(this.getFccNumero5())) {
            conditions += " AND FCC_NUMERO5 IS NULL";
        } else if (this.getFccNumero5() != null) {
            conditions += " AND FCC_NUMERO5 = ?";
            values.add(this.getFccNumero5());
        }

        if (this.getFccConcepto6() != null && "null".equals(this.getFccConcepto6())) {
            conditions += " AND FCC_CONCEPTO6 IS NULL";
        } else if (this.getFccConcepto6() != null) {
            conditions += " AND FCC_CONCEPTO6 = ?";
            values.add(this.getFccConcepto6());
        }

        if (this.getFccNumero6() != null && "null".equals(this.getFccNumero6())) {
            conditions += " AND FCC_NUMERO6 IS NULL";
        } else if (this.getFccNumero6() != null) {
            conditions += " AND FCC_NUMERO6 = ?";
            values.add(this.getFccNumero6());
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
        String sql = "UPDATE F_CONCILIACION SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCC_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getFccFecha());
        conditions += " AND FCC_ID_CONCILIACION = ?";
        pkValues.add(this.getFccIdConciliacion());
        fields += " FCC_CONCEPTO1 = ?, ";
        values.add(this.getFccConcepto1());
        fields += " FCC_NUMERO1 = ?, ";
        values.add(this.getFccNumero1());
        fields += " FCC_CONCEPTO2 = ?, ";
        values.add(this.getFccConcepto2());
        fields += " FCC_NUMERO2 = ?, ";
        values.add(this.getFccNumero2());
        fields += " FCC_CONCEPTO3 = ?, ";
        values.add(this.getFccConcepto3());
        fields += " FCC_NUMERO3 = ?, ";
        values.add(this.getFccNumero3());
        fields += " FCC_CONCEPTO4 = ?, ";
        values.add(this.getFccConcepto4());
        fields += " FCC_NUMERO4 = ?, ";
        values.add(this.getFccNumero4());
        fields += " FCC_CONCEPTO5 = ?, ";
        values.add(this.getFccConcepto5());
        fields += " FCC_NUMERO5 = ?, ";
        values.add(this.getFccNumero5());
        fields += " FCC_CONCEPTO6 = ?, ";
        values.add(this.getFccConcepto6());
        fields += " FCC_NUMERO6 = ?, ";
        values.add(this.getFccNumero6());
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
        String sql = "INSERT INTO F_CONCILIACION ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCC_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFccFecha());

        fields += ", FCC_ID_CONCILIACION";
        fieldValues += ", ?";
        values.add(this.getFccIdConciliacion());

        fields += ", FCC_CONCEPTO1";
        fieldValues += ", ?";
        values.add(this.getFccConcepto1());

        fields += ", FCC_NUMERO1";
        fieldValues += ", ?";
        values.add(this.getFccNumero1());

        fields += ", FCC_CONCEPTO2";
        fieldValues += ", ?";
        values.add(this.getFccConcepto2());

        fields += ", FCC_NUMERO2";
        fieldValues += ", ?";
        values.add(this.getFccNumero2());

        fields += ", FCC_CONCEPTO3";
        fieldValues += ", ?";
        values.add(this.getFccConcepto3());

        fields += ", FCC_NUMERO3";
        fieldValues += ", ?";
        values.add(this.getFccNumero3());

        fields += ", FCC_CONCEPTO4";
        fieldValues += ", ?";
        values.add(this.getFccConcepto4());

        fields += ", FCC_NUMERO4";
        fieldValues += ", ?";
        values.add(this.getFccNumero4());

        fields += ", FCC_CONCEPTO5";
        fieldValues += ", ?";
        values.add(this.getFccConcepto5());

        fields += ", FCC_NUMERO5";
        fieldValues += ", ?";
        values.add(this.getFccNumero5());

        fields += ", FCC_CONCEPTO6";
        fieldValues += ", ?";
        values.add(this.getFccConcepto6());

        fields += ", FCC_NUMERO6";
        fieldValues += ", ?";
        values.add(this.getFccNumero6());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CONCILIACION WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCC_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getFccFecha());
        conditions += " AND FCC_ID_CONCILIACION = ?";
        values.add(this.getFccIdConciliacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FConciliacion instance = (FConciliacion) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFccFecha().equals(instance.getFccFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFccIdConciliacion().equals(instance.getFccIdConciliacion()))
            equalObjects = false;
        if (equalObjects && !this.getFccConcepto1().equals(instance.getFccConcepto1()))
            equalObjects = false;
        if (equalObjects && !this.getFccNumero1().equals(instance.getFccNumero1()))
            equalObjects = false;
        if (equalObjects && !this.getFccConcepto2().equals(instance.getFccConcepto2()))
            equalObjects = false;
        if (equalObjects && !this.getFccNumero2().equals(instance.getFccNumero2()))
            equalObjects = false;
        if (equalObjects && !this.getFccConcepto3().equals(instance.getFccConcepto3()))
            equalObjects = false;
        if (equalObjects && !this.getFccNumero3().equals(instance.getFccNumero3()))
            equalObjects = false;
        if (equalObjects && !this.getFccConcepto4().equals(instance.getFccConcepto4()))
            equalObjects = false;
        if (equalObjects && !this.getFccNumero4().equals(instance.getFccNumero4()))
            equalObjects = false;
        if (equalObjects && !this.getFccConcepto5().equals(instance.getFccConcepto5()))
            equalObjects = false;
        if (equalObjects && !this.getFccNumero5().equals(instance.getFccNumero5()))
            equalObjects = false;
        if (equalObjects && !this.getFccConcepto6().equals(instance.getFccConcepto6()))
            equalObjects = false;
        if (equalObjects && !this.getFccNumero6().equals(instance.getFccNumero6()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FConciliacion result = new FConciliacion();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFccFecha((String) objectData.getData("FCC_FECHA"));
        result.setFccIdConciliacion((BigDecimal) objectData.getData("FCC_ID_CONCILIACION"));
        result.setFccConcepto1((String) objectData.getData("FCC_CONCEPTO1"));
        result.setFccNumero1((String) objectData.getData("FCC_NUMERO1"));
        result.setFccConcepto2((String) objectData.getData("FCC_CONCEPTO2"));
        result.setFccNumero2((String) objectData.getData("FCC_NUMERO2"));
        result.setFccConcepto3((String) objectData.getData("FCC_CONCEPTO3"));
        result.setFccNumero3((String) objectData.getData("FCC_NUMERO3"));
        result.setFccConcepto4((String) objectData.getData("FCC_CONCEPTO4"));
        result.setFccNumero4((String) objectData.getData("FCC_NUMERO4"));
        result.setFccConcepto5((String) objectData.getData("FCC_CONCEPTO5"));
        result.setFccNumero5((String) objectData.getData("FCC_NUMERO5"));
        result.setFccConcepto6((String) objectData.getData("FCC_CONCEPTO6"));
        result.setFccNumero6((String) objectData.getData("FCC_NUMERO6"));

        return result;

    }

}
