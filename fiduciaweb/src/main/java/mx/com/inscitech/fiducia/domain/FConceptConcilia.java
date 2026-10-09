package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CONCEPT_CONCILIA_PK", columns = { "FCA_ID_CONCILIACION" }, sequences = { "MAX" })
public class FConceptConcilia extends DomainObject {

    BigDecimal fcaIdConciliacion = null;
    String fcaDescripcion = null;
    String fcaConcepto1 = null;
    String fcaQry1 = null;
    String fcaConcepto2 = null;
    String fcaQry2 = null;
    String fcaConcepto3 = null;
    String fcaQry3 = null;
    String fcaConcepto4 = null;
    String fcaQry4 = null;
    String fcaConcepto5 = null;
    String fcaQry5 = null;
    String fcaConcepto6 = null;
    String fcaQry6 = null;

    public FConceptConcilia() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcaIdConciliacion(BigDecimal fcaIdConciliacion) {
        this.fcaIdConciliacion = fcaIdConciliacion;
    }

    public BigDecimal getFcaIdConciliacion() {
        return this.fcaIdConciliacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaDescripcion(String fcaDescripcion) {
        this.fcaDescripcion = fcaDescripcion;
    }

    public String getFcaDescripcion() {
        return this.fcaDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaConcepto1(String fcaConcepto1) {
        this.fcaConcepto1 = fcaConcepto1;
    }

    public String getFcaConcepto1() {
        return this.fcaConcepto1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaQry1(String fcaQry1) {
        this.fcaQry1 = fcaQry1;
    }

    public String getFcaQry1() {
        return this.fcaQry1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaConcepto2(String fcaConcepto2) {
        this.fcaConcepto2 = fcaConcepto2;
    }

    public String getFcaConcepto2() {
        return this.fcaConcepto2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaQry2(String fcaQry2) {
        this.fcaQry2 = fcaQry2;
    }

    public String getFcaQry2() {
        return this.fcaQry2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaConcepto3(String fcaConcepto3) {
        this.fcaConcepto3 = fcaConcepto3;
    }

    public String getFcaConcepto3() {
        return this.fcaConcepto3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaQry3(String fcaQry3) {
        this.fcaQry3 = fcaQry3;
    }

    public String getFcaQry3() {
        return this.fcaQry3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaConcepto4(String fcaConcepto4) {
        this.fcaConcepto4 = fcaConcepto4;
    }

    public String getFcaConcepto4() {
        return this.fcaConcepto4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaQry4(String fcaQry4) {
        this.fcaQry4 = fcaQry4;
    }

    public String getFcaQry4() {
        return this.fcaQry4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaConcepto5(String fcaConcepto5) {
        this.fcaConcepto5 = fcaConcepto5;
    }

    public String getFcaConcepto5() {
        return this.fcaConcepto5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaQry5(String fcaQry5) {
        this.fcaQry5 = fcaQry5;
    }

    public String getFcaQry5() {
        return this.fcaQry5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaConcepto6(String fcaConcepto6) {
        this.fcaConcepto6 = fcaConcepto6;
    }

    public String getFcaConcepto6() {
        return this.fcaConcepto6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcaQry6(String fcaQry6) {
        this.fcaQry6 = fcaQry6;
    }

    public String getFcaQry6() {
        return this.fcaQry6;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CONCEPT_CONCILIA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcaIdConciliacion() != null && this.getFcaIdConciliacion().longValue() == -999) {
            conditions += " AND FCA_ID_CONCILIACION IS NULL";
        } else if (this.getFcaIdConciliacion() != null) {
            conditions += " AND FCA_ID_CONCILIACION = ?";
            values.add(this.getFcaIdConciliacion());
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
        String sql = "SELECT * FROM F_CONCEPT_CONCILIA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcaIdConciliacion() != null && this.getFcaIdConciliacion().longValue() == -999) {
            conditions += " AND FCA_ID_CONCILIACION IS NULL";
        } else if (this.getFcaIdConciliacion() != null) {
            conditions += " AND FCA_ID_CONCILIACION = ?";
            values.add(this.getFcaIdConciliacion());
        }

        if (this.getFcaDescripcion() != null && "null".equals(this.getFcaDescripcion())) {
            conditions += " AND FCA_DESCRIPCION IS NULL";
        } else if (this.getFcaDescripcion() != null) {
            conditions += " AND FCA_DESCRIPCION = ?";
            values.add(this.getFcaDescripcion());
        }

        if (this.getFcaConcepto1() != null && "null".equals(this.getFcaConcepto1())) {
            conditions += " AND FCA_CONCEPTO1 IS NULL";
        } else if (this.getFcaConcepto1() != null) {
            conditions += " AND FCA_CONCEPTO1 = ?";
            values.add(this.getFcaConcepto1());
        }

        if (this.getFcaQry1() != null && "null".equals(this.getFcaQry1())) {
            conditions += " AND FCA_QRY1 IS NULL";
        } else if (this.getFcaQry1() != null) {
            conditions += " AND FCA_QRY1 = ?";
            values.add(this.getFcaQry1());
        }

        if (this.getFcaConcepto2() != null && "null".equals(this.getFcaConcepto2())) {
            conditions += " AND FCA_CONCEPTO2 IS NULL";
        } else if (this.getFcaConcepto2() != null) {
            conditions += " AND FCA_CONCEPTO2 = ?";
            values.add(this.getFcaConcepto2());
        }

        if (this.getFcaQry2() != null && "null".equals(this.getFcaQry2())) {
            conditions += " AND FCA_QRY2 IS NULL";
        } else if (this.getFcaQry2() != null) {
            conditions += " AND FCA_QRY2 = ?";
            values.add(this.getFcaQry2());
        }

        if (this.getFcaConcepto3() != null && "null".equals(this.getFcaConcepto3())) {
            conditions += " AND FCA_CONCEPTO3 IS NULL";
        } else if (this.getFcaConcepto3() != null) {
            conditions += " AND FCA_CONCEPTO3 = ?";
            values.add(this.getFcaConcepto3());
        }

        if (this.getFcaQry3() != null && "null".equals(this.getFcaQry3())) {
            conditions += " AND FCA_QRY3 IS NULL";
        } else if (this.getFcaQry3() != null) {
            conditions += " AND FCA_QRY3 = ?";
            values.add(this.getFcaQry3());
        }

        if (this.getFcaConcepto4() != null && "null".equals(this.getFcaConcepto4())) {
            conditions += " AND FCA_CONCEPTO4 IS NULL";
        } else if (this.getFcaConcepto4() != null) {
            conditions += " AND FCA_CONCEPTO4 = ?";
            values.add(this.getFcaConcepto4());
        }

        if (this.getFcaQry4() != null && "null".equals(this.getFcaQry4())) {
            conditions += " AND FCA_QRY4 IS NULL";
        } else if (this.getFcaQry4() != null) {
            conditions += " AND FCA_QRY4 = ?";
            values.add(this.getFcaQry4());
        }

        if (this.getFcaConcepto5() != null && "null".equals(this.getFcaConcepto5())) {
            conditions += " AND FCA_CONCEPTO5 IS NULL";
        } else if (this.getFcaConcepto5() != null) {
            conditions += " AND FCA_CONCEPTO5 = ?";
            values.add(this.getFcaConcepto5());
        }

        if (this.getFcaQry5() != null && "null".equals(this.getFcaQry5())) {
            conditions += " AND FCA_QRY5 IS NULL";
        } else if (this.getFcaQry5() != null) {
            conditions += " AND FCA_QRY5 = ?";
            values.add(this.getFcaQry5());
        }

        if (this.getFcaConcepto6() != null && "null".equals(this.getFcaConcepto6())) {
            conditions += " AND FCA_CONCEPTO6 IS NULL";
        } else if (this.getFcaConcepto6() != null) {
            conditions += " AND FCA_CONCEPTO6 = ?";
            values.add(this.getFcaConcepto6());
        }

        if (this.getFcaQry6() != null && "null".equals(this.getFcaQry6())) {
            conditions += " AND FCA_QRY6 IS NULL";
        } else if (this.getFcaQry6() != null) {
            conditions += " AND FCA_QRY6 = ?";
            values.add(this.getFcaQry6());
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
        String sql = "UPDATE F_CONCEPT_CONCILIA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FCA_ID_CONCILIACION = ?";
        pkValues.add(this.getFcaIdConciliacion());
        fields += " FCA_DESCRIPCION = ?, ";
        values.add(this.getFcaDescripcion());
        fields += " FCA_CONCEPTO1 = ?, ";
        values.add(this.getFcaConcepto1());
        fields += " FCA_QRY1 = ?, ";
        values.add(this.getFcaQry1());
        fields += " FCA_CONCEPTO2 = ?, ";
        values.add(this.getFcaConcepto2());
        fields += " FCA_QRY2 = ?, ";
        values.add(this.getFcaQry2());
        fields += " FCA_CONCEPTO3 = ?, ";
        values.add(this.getFcaConcepto3());
        fields += " FCA_QRY3 = ?, ";
        values.add(this.getFcaQry3());
        fields += " FCA_CONCEPTO4 = ?, ";
        values.add(this.getFcaConcepto4());
        fields += " FCA_QRY4 = ?, ";
        values.add(this.getFcaQry4());
        fields += " FCA_CONCEPTO5 = ?, ";
        values.add(this.getFcaConcepto5());
        fields += " FCA_QRY5 = ?, ";
        values.add(this.getFcaQry5());
        fields += " FCA_CONCEPTO6 = ?, ";
        values.add(this.getFcaConcepto6());
        fields += " FCA_QRY6 = ?, ";
        values.add(this.getFcaQry6());
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
        String sql = "INSERT INTO F_CONCEPT_CONCILIA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCA_ID_CONCILIACION";
        fieldValues += ", ?";
        values.add(this.getFcaIdConciliacion());

        fields += ", FCA_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getFcaDescripcion());

        fields += ", FCA_CONCEPTO1";
        fieldValues += ", ?";
        values.add(this.getFcaConcepto1());

        fields += ", FCA_QRY1";
        fieldValues += ", ?";
        values.add(this.getFcaQry1());

        fields += ", FCA_CONCEPTO2";
        fieldValues += ", ?";
        values.add(this.getFcaConcepto2());

        fields += ", FCA_QRY2";
        fieldValues += ", ?";
        values.add(this.getFcaQry2());

        fields += ", FCA_CONCEPTO3";
        fieldValues += ", ?";
        values.add(this.getFcaConcepto3());

        fields += ", FCA_QRY3";
        fieldValues += ", ?";
        values.add(this.getFcaQry3());

        fields += ", FCA_CONCEPTO4";
        fieldValues += ", ?";
        values.add(this.getFcaConcepto4());

        fields += ", FCA_QRY4";
        fieldValues += ", ?";
        values.add(this.getFcaQry4());

        fields += ", FCA_CONCEPTO5";
        fieldValues += ", ?";
        values.add(this.getFcaConcepto5());

        fields += ", FCA_QRY5";
        fieldValues += ", ?";
        values.add(this.getFcaQry5());

        fields += ", FCA_CONCEPTO6";
        fieldValues += ", ?";
        values.add(this.getFcaConcepto6());

        fields += ", FCA_QRY6";
        fieldValues += ", ?";
        values.add(this.getFcaQry6());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CONCEPT_CONCILIA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCA_ID_CONCILIACION = ?";
        values.add(this.getFcaIdConciliacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FConceptConcilia instance = (FConceptConcilia) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcaIdConciliacion().equals(instance.getFcaIdConciliacion()))
            equalObjects = false;
        if (equalObjects && !this.getFcaDescripcion().equals(instance.getFcaDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getFcaConcepto1().equals(instance.getFcaConcepto1()))
            equalObjects = false;
        if (equalObjects && !this.getFcaQry1().equals(instance.getFcaQry1()))
            equalObjects = false;
        if (equalObjects && !this.getFcaConcepto2().equals(instance.getFcaConcepto2()))
            equalObjects = false;
        if (equalObjects && !this.getFcaQry2().equals(instance.getFcaQry2()))
            equalObjects = false;
        if (equalObjects && !this.getFcaConcepto3().equals(instance.getFcaConcepto3()))
            equalObjects = false;
        if (equalObjects && !this.getFcaQry3().equals(instance.getFcaQry3()))
            equalObjects = false;
        if (equalObjects && !this.getFcaConcepto4().equals(instance.getFcaConcepto4()))
            equalObjects = false;
        if (equalObjects && !this.getFcaQry4().equals(instance.getFcaQry4()))
            equalObjects = false;
        if (equalObjects && !this.getFcaConcepto5().equals(instance.getFcaConcepto5()))
            equalObjects = false;
        if (equalObjects && !this.getFcaQry5().equals(instance.getFcaQry5()))
            equalObjects = false;
        if (equalObjects && !this.getFcaConcepto6().equals(instance.getFcaConcepto6()))
            equalObjects = false;
        if (equalObjects && !this.getFcaQry6().equals(instance.getFcaQry6()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FConceptConcilia result = new FConceptConcilia();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcaIdConciliacion((BigDecimal) objectData.getData("FCA_ID_CONCILIACION"));
        result.setFcaDescripcion((String) objectData.getData("FCA_DESCRIPCION"));
        result.setFcaConcepto1((String) objectData.getData("FCA_CONCEPTO1"));
        result.setFcaQry1((String) objectData.getData("FCA_QRY1"));
        result.setFcaConcepto2((String) objectData.getData("FCA_CONCEPTO2"));
        result.setFcaQry2((String) objectData.getData("FCA_QRY2"));
        result.setFcaConcepto3((String) objectData.getData("FCA_CONCEPTO3"));
        result.setFcaQry3((String) objectData.getData("FCA_QRY3"));
        result.setFcaConcepto4((String) objectData.getData("FCA_CONCEPTO4"));
        result.setFcaQry4((String) objectData.getData("FCA_QRY4"));
        result.setFcaConcepto5((String) objectData.getData("FCA_CONCEPTO5"));
        result.setFcaQry5((String) objectData.getData("FCA_QRY5"));
        result.setFcaConcepto6((String) objectData.getData("FCA_CONCEPTO6"));
        result.setFcaQry6((String) objectData.getData("FCA_QRY6"));

        return result;

    }

}
