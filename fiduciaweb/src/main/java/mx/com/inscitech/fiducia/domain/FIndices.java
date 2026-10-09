package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_INDICES_PK", columns = { "EIND_ID_INDICE", "EIND_ID_SUBINDICE" }, sequences = { "MANUAL" })
public class FIndices extends DomainObject {

    BigDecimal eindIdIndice = null;
    BigDecimal eindIdSubindice = null;
    String eindDescripcion = null;
    String eindFormaEmp = null;
    String eindParam1 = null;
    String eindDesParam1 = null;
    String eindParam2 = null;
    String eindDesParam2 = null;
    String eindStIndices = null;

    public FIndices() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEindIdIndice(BigDecimal eindIdIndice) {
        this.eindIdIndice = eindIdIndice;
    }

    public BigDecimal getEindIdIndice() {
        return this.eindIdIndice;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEindIdSubindice(BigDecimal eindIdSubindice) {
        this.eindIdSubindice = eindIdSubindice;
    }

    public BigDecimal getEindIdSubindice() {
        return this.eindIdSubindice;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEindDescripcion(String eindDescripcion) {
        this.eindDescripcion = eindDescripcion;
    }

    public String getEindDescripcion() {
        return this.eindDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEindFormaEmp(String eindFormaEmp) {
        this.eindFormaEmp = eindFormaEmp;
    }

    public String getEindFormaEmp() {
        return this.eindFormaEmp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEindParam1(String eindParam1) {
        this.eindParam1 = eindParam1;
    }

    public String getEindParam1() {
        return this.eindParam1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEindDesParam1(String eindDesParam1) {
        this.eindDesParam1 = eindDesParam1;
    }

    public String getEindDesParam1() {
        return this.eindDesParam1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEindParam2(String eindParam2) {
        this.eindParam2 = eindParam2;
    }

    public String getEindParam2() {
        return this.eindParam2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEindDesParam2(String eindDesParam2) {
        this.eindDesParam2 = eindDesParam2;
    }

    public String getEindDesParam2() {
        return this.eindDesParam2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEindStIndices(String eindStIndices) {
        this.eindStIndices = eindStIndices;
    }

    public String getEindStIndices() {
        return this.eindStIndices;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_INDICES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEindIdIndice() != null && this.getEindIdIndice().longValue() == -999) {
            conditions += " AND EIND_ID_INDICE IS NULL";
        } else if (this.getEindIdIndice() != null) {
            conditions += " AND EIND_ID_INDICE = ?";
            values.add(this.getEindIdIndice());
        }

        if (this.getEindIdSubindice() != null && this.getEindIdSubindice().longValue() == -999) {
            conditions += " AND EIND_ID_SUBINDICE IS NULL";
        } else if (this.getEindIdSubindice() != null) {
            conditions += " AND EIND_ID_SUBINDICE = ?";
            values.add(this.getEindIdSubindice());
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
        String sql = "SELECT * FROM F_INDICES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEindIdIndice() != null && this.getEindIdIndice().longValue() == -999) {
            conditions += " AND EIND_ID_INDICE IS NULL";
        } else if (this.getEindIdIndice() != null) {
            conditions += " AND EIND_ID_INDICE = ?";
            values.add(this.getEindIdIndice());
        }

        if (this.getEindIdSubindice() != null && this.getEindIdSubindice().longValue() == -999) {
            conditions += " AND EIND_ID_SUBINDICE IS NULL";
        } else if (this.getEindIdSubindice() != null) {
            conditions += " AND EIND_ID_SUBINDICE = ?";
            values.add(this.getEindIdSubindice());
        }

        if (this.getEindDescripcion() != null && "null".equals(this.getEindDescripcion())) {
            conditions += " AND EIND_DESCRIPCION IS NULL";
        } else if (this.getEindDescripcion() != null) {
            conditions += " AND EIND_DESCRIPCION = ?";
            values.add(this.getEindDescripcion());
        }

        if (this.getEindFormaEmp() != null && "null".equals(this.getEindFormaEmp())) {
            conditions += " AND EIND_FORMA_EMP IS NULL";
        } else if (this.getEindFormaEmp() != null) {
            conditions += " AND EIND_FORMA_EMP = ?";
            values.add(this.getEindFormaEmp());
        }

        if (this.getEindParam1() != null && "null".equals(this.getEindParam1())) {
            conditions += " AND EIND_PARAM1 IS NULL";
        } else if (this.getEindParam1() != null) {
            conditions += " AND EIND_PARAM1 = ?";
            values.add(this.getEindParam1());
        }

        if (this.getEindDesParam1() != null && "null".equals(this.getEindDesParam1())) {
            conditions += " AND EIND_DES_PARAM1 IS NULL";
        } else if (this.getEindDesParam1() != null) {
            conditions += " AND EIND_DES_PARAM1 = ?";
            values.add(this.getEindDesParam1());
        }

        if (this.getEindParam2() != null && "null".equals(this.getEindParam2())) {
            conditions += " AND EIND_PARAM2 IS NULL";
        } else if (this.getEindParam2() != null) {
            conditions += " AND EIND_PARAM2 = ?";
            values.add(this.getEindParam2());
        }

        if (this.getEindDesParam2() != null && "null".equals(this.getEindDesParam2())) {
            conditions += " AND EIND_DES_PARAM2 IS NULL";
        } else if (this.getEindDesParam2() != null) {
            conditions += " AND EIND_DES_PARAM2 = ?";
            values.add(this.getEindDesParam2());
        }

        if (this.getEindStIndices() != null && "null".equals(this.getEindStIndices())) {
            conditions += " AND EIND_ST_INDICES IS NULL";
        } else if (this.getEindStIndices() != null) {
            conditions += " AND EIND_ST_INDICES = ?";
            values.add(this.getEindStIndices());
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
        String sql = "UPDATE F_INDICES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EIND_ID_INDICE = ?";
        pkValues.add(this.getEindIdIndice());
        conditions += " AND EIND_ID_SUBINDICE = ?";
        pkValues.add(this.getEindIdSubindice());
        fields += " EIND_DESCRIPCION = ?, ";
        values.add(this.getEindDescripcion());
        fields += " EIND_FORMA_EMP = ?, ";
        values.add(this.getEindFormaEmp());
        fields += " EIND_PARAM1 = ?, ";
        values.add(this.getEindParam1());
        fields += " EIND_DES_PARAM1 = ?, ";
        values.add(this.getEindDesParam1());
        fields += " EIND_PARAM2 = ?, ";
        values.add(this.getEindParam2());
        fields += " EIND_DES_PARAM2 = ?, ";
        values.add(this.getEindDesParam2());
        fields += " EIND_ST_INDICES = ?, ";
        values.add(this.getEindStIndices());
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
        String sql = "INSERT INTO F_INDICES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EIND_ID_INDICE";
        fieldValues += ", ?";
        values.add(this.getEindIdIndice());

        fields += ", EIND_ID_SUBINDICE";
        fieldValues += ", ?";
        values.add(this.getEindIdSubindice());

        fields += ", EIND_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getEindDescripcion());

        fields += ", EIND_FORMA_EMP";
        fieldValues += ", ?";
        values.add(this.getEindFormaEmp());

        fields += ", EIND_PARAM1";
        fieldValues += ", ?";
        values.add(this.getEindParam1());

        fields += ", EIND_DES_PARAM1";
        fieldValues += ", ?";
        values.add(this.getEindDesParam1());

        fields += ", EIND_PARAM2";
        fieldValues += ", ?";
        values.add(this.getEindParam2());

        fields += ", EIND_DES_PARAM2";
        fieldValues += ", ?";
        values.add(this.getEindDesParam2());

        fields += ", EIND_ST_INDICES";
        fieldValues += ", ?";
        values.add(this.getEindStIndices());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_INDICES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EIND_ID_INDICE = ?";
        values.add(this.getEindIdIndice());
        conditions += " AND EIND_ID_SUBINDICE = ?";
        values.add(this.getEindIdSubindice());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FIndices instance = (FIndices) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEindIdIndice().equals(instance.getEindIdIndice()))
            equalObjects = false;
        if (equalObjects && !this.getEindIdSubindice().equals(instance.getEindIdSubindice()))
            equalObjects = false;
        if (equalObjects && !this.getEindDescripcion().equals(instance.getEindDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getEindFormaEmp().equals(instance.getEindFormaEmp()))
            equalObjects = false;
        if (equalObjects && !this.getEindParam1().equals(instance.getEindParam1()))
            equalObjects = false;
        if (equalObjects && !this.getEindDesParam1().equals(instance.getEindDesParam1()))
            equalObjects = false;
        if (equalObjects && !this.getEindParam2().equals(instance.getEindParam2()))
            equalObjects = false;
        if (equalObjects && !this.getEindDesParam2().equals(instance.getEindDesParam2()))
            equalObjects = false;
        if (equalObjects && !this.getEindStIndices().equals(instance.getEindStIndices()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FIndices result = new FIndices();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEindIdIndice((BigDecimal) objectData.getData("EIND_ID_INDICE"));
        result.setEindIdSubindice((BigDecimal) objectData.getData("EIND_ID_SUBINDICE"));
        result.setEindDescripcion((String) objectData.getData("EIND_DESCRIPCION"));
        result.setEindFormaEmp((String) objectData.getData("EIND_FORMA_EMP"));
        result.setEindParam1((String) objectData.getData("EIND_PARAM1"));
        result.setEindDesParam1((String) objectData.getData("EIND_DES_PARAM1"));
        result.setEindParam2((String) objectData.getData("EIND_PARAM2"));
        result.setEindDesParam2((String) objectData.getData("EIND_DES_PARAM2"));
        result.setEindStIndices((String) objectData.getData("EIND_ST_INDICES"));

        return result;

    }

}
