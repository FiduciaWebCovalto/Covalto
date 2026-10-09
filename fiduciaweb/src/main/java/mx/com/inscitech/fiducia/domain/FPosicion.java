package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FPosicion extends DomainObject {

    BigDecimal posiSecuencial = null;
    String posiFideicomiso = null;
    String posiCol1 = null;
    String posiCol2 = null;
    String posiCol3 = null;
    String posiCol4 = null;
    String posiCol5 = null;
    String posiCol6 = null;
    String posiCol7 = null;
    String posiCol8 = null;

    public FPosicion() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosiSecuencial(BigDecimal posiSecuencial) {
        this.posiSecuencial = posiSecuencial;
    }

    public BigDecimal getPosiSecuencial() {
        return this.posiSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosiFideicomiso(String posiFideicomiso) {
        this.posiFideicomiso = posiFideicomiso;
    }

    public String getPosiFideicomiso() {
        return this.posiFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosiCol1(String posiCol1) {
        this.posiCol1 = posiCol1;
    }

    public String getPosiCol1() {
        return this.posiCol1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosiCol2(String posiCol2) {
        this.posiCol2 = posiCol2;
    }

    public String getPosiCol2() {
        return this.posiCol2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosiCol3(String posiCol3) {
        this.posiCol3 = posiCol3;
    }

    public String getPosiCol3() {
        return this.posiCol3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosiCol4(String posiCol4) {
        this.posiCol4 = posiCol4;
    }

    public String getPosiCol4() {
        return this.posiCol4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosiCol5(String posiCol5) {
        this.posiCol5 = posiCol5;
    }

    public String getPosiCol5() {
        return this.posiCol5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosiCol6(String posiCol6) {
        this.posiCol6 = posiCol6;
    }

    public String getPosiCol6() {
        return this.posiCol6;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosiCol7(String posiCol7) {
        this.posiCol7 = posiCol7;
    }

    public String getPosiCol7() {
        return this.posiCol7;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosiCol8(String posiCol8) {
        this.posiCol8 = posiCol8;
    }

    public String getPosiCol8() {
        return this.posiCol8;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_POSICION ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM F_POSICION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPosiSecuencial() != null && this.getPosiSecuencial().longValue() == -999) {
            conditions += " AND POSI_SECUENCIAL IS NULL";
        } else if (this.getPosiSecuencial() != null) {
            conditions += " AND POSI_SECUENCIAL = ?";
            values.add(this.getPosiSecuencial());
        }

        if (this.getPosiFideicomiso() != null && "null".equals(this.getPosiFideicomiso())) {
            conditions += " AND POSI_FIDEICOMISO IS NULL";
        } else if (this.getPosiFideicomiso() != null) {
            conditions += " AND POSI_FIDEICOMISO = ?";
            values.add(this.getPosiFideicomiso());
        }

        if (this.getPosiCol1() != null && "null".equals(this.getPosiCol1())) {
            conditions += " AND POSI_COL1 IS NULL";
        } else if (this.getPosiCol1() != null) {
            conditions += " AND POSI_COL1 = ?";
            values.add(this.getPosiCol1());
        }

        if (this.getPosiCol2() != null && "null".equals(this.getPosiCol2())) {
            conditions += " AND POSI_COL2 IS NULL";
        } else if (this.getPosiCol2() != null) {
            conditions += " AND POSI_COL2 = ?";
            values.add(this.getPosiCol2());
        }

        if (this.getPosiCol3() != null && "null".equals(this.getPosiCol3())) {
            conditions += " AND POSI_COL3 IS NULL";
        } else if (this.getPosiCol3() != null) {
            conditions += " AND POSI_COL3 = ?";
            values.add(this.getPosiCol3());
        }

        if (this.getPosiCol4() != null && "null".equals(this.getPosiCol4())) {
            conditions += " AND POSI_COL4 IS NULL";
        } else if (this.getPosiCol4() != null) {
            conditions += " AND POSI_COL4 = ?";
            values.add(this.getPosiCol4());
        }

        if (this.getPosiCol5() != null && "null".equals(this.getPosiCol5())) {
            conditions += " AND POSI_COL5 IS NULL";
        } else if (this.getPosiCol5() != null) {
            conditions += " AND POSI_COL5 = ?";
            values.add(this.getPosiCol5());
        }

        if (this.getPosiCol6() != null && "null".equals(this.getPosiCol6())) {
            conditions += " AND POSI_COL6 IS NULL";
        } else if (this.getPosiCol6() != null) {
            conditions += " AND POSI_COL6 = ?";
            values.add(this.getPosiCol6());
        }

        if (this.getPosiCol7() != null && "null".equals(this.getPosiCol7())) {
            conditions += " AND POSI_COL7 IS NULL";
        } else if (this.getPosiCol7() != null) {
            conditions += " AND POSI_COL7 = ?";
            values.add(this.getPosiCol7());
        }

        if (this.getPosiCol8() != null && "null".equals(this.getPosiCol8())) {
            conditions += " AND POSI_COL8 IS NULL";
        } else if (this.getPosiCol8() != null) {
            conditions += " AND POSI_COL8 = ?";
            values.add(this.getPosiCol8());
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
        String sql = "UPDATE F_POSICION SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " POSI_SECUENCIAL = ?, ";
        values.add(this.getPosiSecuencial());
        fields += " POSI_FIDEICOMISO = ?, ";
        values.add(this.getPosiFideicomiso());
        fields += " POSI_COL1 = ?, ";
        values.add(this.getPosiCol1());
        fields += " POSI_COL2 = ?, ";
        values.add(this.getPosiCol2());
        fields += " POSI_COL3 = ?, ";
        values.add(this.getPosiCol3());
        fields += " POSI_COL4 = ?, ";
        values.add(this.getPosiCol4());
        fields += " POSI_COL5 = ?, ";
        values.add(this.getPosiCol5());
        fields += " POSI_COL6 = ?, ";
        values.add(this.getPosiCol6());
        fields += " POSI_COL7 = ?, ";
        values.add(this.getPosiCol7());
        fields += " POSI_COL8 = ?, ";
        values.add(this.getPosiCol8());
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
        String sql = "INSERT INTO F_POSICION ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", POSI_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getPosiSecuencial());

        fields += ", POSI_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getPosiFideicomiso());

        fields += ", POSI_COL1";
        fieldValues += ", ?";
        values.add(this.getPosiCol1());

        fields += ", POSI_COL2";
        fieldValues += ", ?";
        values.add(this.getPosiCol2());

        fields += ", POSI_COL3";
        fieldValues += ", ?";
        values.add(this.getPosiCol3());

        fields += ", POSI_COL4";
        fieldValues += ", ?";
        values.add(this.getPosiCol4());

        fields += ", POSI_COL5";
        fieldValues += ", ?";
        values.add(this.getPosiCol5());

        fields += ", POSI_COL6";
        fieldValues += ", ?";
        values.add(this.getPosiCol6());

        fields += ", POSI_COL7";
        fieldValues += ", ?";
        values.add(this.getPosiCol7());

        fields += ", POSI_COL8";
        fieldValues += ", ?";
        values.add(this.getPosiCol8());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_POSICION WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FPosicion instance = (FPosicion) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPosiSecuencial().equals(instance.getPosiSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getPosiFideicomiso().equals(instance.getPosiFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getPosiCol1().equals(instance.getPosiCol1()))
            equalObjects = false;
        if (equalObjects && !this.getPosiCol2().equals(instance.getPosiCol2()))
            equalObjects = false;
        if (equalObjects && !this.getPosiCol3().equals(instance.getPosiCol3()))
            equalObjects = false;
        if (equalObjects && !this.getPosiCol4().equals(instance.getPosiCol4()))
            equalObjects = false;
        if (equalObjects && !this.getPosiCol5().equals(instance.getPosiCol5()))
            equalObjects = false;
        if (equalObjects && !this.getPosiCol6().equals(instance.getPosiCol6()))
            equalObjects = false;
        if (equalObjects && !this.getPosiCol7().equals(instance.getPosiCol7()))
            equalObjects = false;
        if (equalObjects && !this.getPosiCol8().equals(instance.getPosiCol8()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FPosicion result = new FPosicion();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPosiSecuencial((BigDecimal) objectData.getData("POSI_SECUENCIAL"));
        result.setPosiFideicomiso((String) objectData.getData("POSI_FIDEICOMISO"));
        result.setPosiCol1((String) objectData.getData("POSI_COL1"));
        result.setPosiCol2((String) objectData.getData("POSI_COL2"));
        result.setPosiCol3((String) objectData.getData("POSI_COL3"));
        result.setPosiCol4((String) objectData.getData("POSI_COL4"));
        result.setPosiCol5((String) objectData.getData("POSI_COL5"));
        result.setPosiCol6((String) objectData.getData("POSI_COL6"));
        result.setPosiCol7((String) objectData.getData("POSI_COL7"));
        result.setPosiCol8((String) objectData.getData("POSI_COL8"));

        return result;

    }

}
