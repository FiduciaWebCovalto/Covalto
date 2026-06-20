package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EVOL_PATRIS_PK", columns = { "PATI_ID_FIDEICOMISO", "PATI_ID_SECUENCIAL", "PATI_ID_FECHA", "PATI_ID_TIPO" }, sequences = { "MANUAL" })
public class FEvolPatri extends DomainObject {

    BigDecimal patiIdFideicomiso = null;
    BigDecimal patiIdSecuencial = null;
    String patiIdFecha = null;
    BigDecimal patiIdTipo = null;
    String patiConcepto = null;
    String patiCol1 = null;
    String patiCol2 = null;
    String patiCol3 = null;
    String patiCol4 = null;
    String patiNomFideicomiso = null;
    String patiCol5 = null;

    public FEvolPatri() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatiIdFideicomiso(BigDecimal patiIdFideicomiso) {
        this.patiIdFideicomiso = patiIdFideicomiso;
    }

    public BigDecimal getPatiIdFideicomiso() {
        return this.patiIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatiIdSecuencial(BigDecimal patiIdSecuencial) {
        this.patiIdSecuencial = patiIdSecuencial;
    }

    public BigDecimal getPatiIdSecuencial() {
        return this.patiIdSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setPatiIdFecha(String patiIdFecha) {
        this.patiIdFecha = patiIdFecha;
    }

    public String getPatiIdFecha() {
        return this.patiIdFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatiIdTipo(BigDecimal patiIdTipo) {
        this.patiIdTipo = patiIdTipo;
    }

    public BigDecimal getPatiIdTipo() {
        return this.patiIdTipo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatiConcepto(String patiConcepto) {
        this.patiConcepto = patiConcepto;
    }

    public String getPatiConcepto() {
        return this.patiConcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatiCol1(String patiCol1) {
        this.patiCol1 = patiCol1;
    }

    public String getPatiCol1() {
        return this.patiCol1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatiCol2(String patiCol2) {
        this.patiCol2 = patiCol2;
    }

    public String getPatiCol2() {
        return this.patiCol2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatiCol3(String patiCol3) {
        this.patiCol3 = patiCol3;
    }

    public String getPatiCol3() {
        return this.patiCol3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatiCol4(String patiCol4) {
        this.patiCol4 = patiCol4;
    }

    public String getPatiCol4() {
        return this.patiCol4;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatiNomFideicomiso(String patiNomFideicomiso) {
        this.patiNomFideicomiso = patiNomFideicomiso;
    }

    public String getPatiNomFideicomiso() {
        return this.patiNomFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatiCol5(String patiCol5) {
        this.patiCol5 = patiCol5;
    }

    public String getPatiCol5() {
        return this.patiCol5;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EVOL_PATRI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPatiIdFideicomiso() != null && this.getPatiIdFideicomiso().longValue() == -999) {
            conditions += " AND PATI_ID_FIDEICOMISO IS NULL";
        } else if (this.getPatiIdFideicomiso() != null) {
            conditions += " AND PATI_ID_FIDEICOMISO = ?";
            values.add(this.getPatiIdFideicomiso());
        }

        if (this.getPatiIdSecuencial() != null && this.getPatiIdSecuencial().longValue() == -999) {
            conditions += " AND PATI_ID_SECUENCIAL IS NULL";
        } else if (this.getPatiIdSecuencial() != null) {
            conditions += " AND PATI_ID_SECUENCIAL = ?";
            values.add(this.getPatiIdSecuencial());
        }

        if (this.getPatiIdFecha() != null && "null".equals(this.getPatiIdFecha())) {
            conditions += " AND PATI_ID_FECHA IS NULL";
        } else if (this.getPatiIdFecha() != null) {
            conditions += " AND PATI_ID_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getPatiIdFecha());
        }

        if (this.getPatiIdTipo() != null && this.getPatiIdTipo().longValue() == -999) {
            conditions += " AND PATI_ID_TIPO IS NULL";
        } else if (this.getPatiIdTipo() != null) {
            conditions += " AND PATI_ID_TIPO = ?";
            values.add(this.getPatiIdTipo());
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
        String sql = "SELECT * FROM F_EVOL_PATRI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPatiIdFideicomiso() != null && this.getPatiIdFideicomiso().longValue() == -999) {
            conditions += " AND PATI_ID_FIDEICOMISO IS NULL";
        } else if (this.getPatiIdFideicomiso() != null) {
            conditions += " AND PATI_ID_FIDEICOMISO = ?";
            values.add(this.getPatiIdFideicomiso());
        }

        if (this.getPatiIdSecuencial() != null && this.getPatiIdSecuencial().longValue() == -999) {
            conditions += " AND PATI_ID_SECUENCIAL IS NULL";
        } else if (this.getPatiIdSecuencial() != null) {
            conditions += " AND PATI_ID_SECUENCIAL = ?";
            values.add(this.getPatiIdSecuencial());
        }

        if (this.getPatiIdFecha() != null && "null".equals(this.getPatiIdFecha())) {
            conditions += " AND PATI_ID_FECHA IS NULL";
        } else if (this.getPatiIdFecha() != null) {
            conditions += " AND PATI_ID_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getPatiIdFecha());
        }

        if (this.getPatiIdTipo() != null && this.getPatiIdTipo().longValue() == -999) {
            conditions += " AND PATI_ID_TIPO IS NULL";
        } else if (this.getPatiIdTipo() != null) {
            conditions += " AND PATI_ID_TIPO = ?";
            values.add(this.getPatiIdTipo());
        }

        if (this.getPatiConcepto() != null && "null".equals(this.getPatiConcepto())) {
            conditions += " AND PATI_CONCEPTO IS NULL";
        } else if (this.getPatiConcepto() != null) {
            conditions += " AND PATI_CONCEPTO = ?";
            values.add(this.getPatiConcepto());
        }

        if (this.getPatiCol1() != null && "null".equals(this.getPatiCol1())) {
            conditions += " AND PATI_COL1 IS NULL";
        } else if (this.getPatiCol1() != null) {
            conditions += " AND PATI_COL1 = ?";
            values.add(this.getPatiCol1());
        }

        if (this.getPatiCol2() != null && "null".equals(this.getPatiCol2())) {
            conditions += " AND PATI_COL2 IS NULL";
        } else if (this.getPatiCol2() != null) {
            conditions += " AND PATI_COL2 = ?";
            values.add(this.getPatiCol2());
        }

        if (this.getPatiCol3() != null && "null".equals(this.getPatiCol3())) {
            conditions += " AND PATI_COL3 IS NULL";
        } else if (this.getPatiCol3() != null) {
            conditions += " AND PATI_COL3 = ?";
            values.add(this.getPatiCol3());
        }

        if (this.getPatiCol4() != null && "null".equals(this.getPatiCol4())) {
            conditions += " AND PATI_COL4 IS NULL";
        } else if (this.getPatiCol4() != null) {
            conditions += " AND PATI_COL4 = ?";
            values.add(this.getPatiCol4());
        }

        if (this.getPatiNomFideicomiso() != null && "null".equals(this.getPatiNomFideicomiso())) {
            conditions += " AND PATI_NOM_FIDEICOMISO IS NULL";
        } else if (this.getPatiNomFideicomiso() != null) {
            conditions += " AND PATI_NOM_FIDEICOMISO = ?";
            values.add(this.getPatiNomFideicomiso());
        }

        if (this.getPatiCol5() != null && "null".equals(this.getPatiCol5())) {
            conditions += " AND PATI_COL5 IS NULL";
        } else if (this.getPatiCol5() != null) {
            conditions += " AND PATI_COL5 = ?";
            values.add(this.getPatiCol5());
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
        String sql = "UPDATE F_EVOL_PATRI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PATI_ID_FIDEICOMISO = ?";
        pkValues.add(this.getPatiIdFideicomiso());
        conditions += " AND PATI_ID_SECUENCIAL = ?";
        pkValues.add(this.getPatiIdSecuencial());
        conditions += " AND PATI_ID_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getPatiIdFecha());
        conditions += " AND PATI_ID_TIPO = ?";
        pkValues.add(this.getPatiIdTipo());
        fields += " PATI_CONCEPTO = ?, ";
        values.add(this.getPatiConcepto());
        fields += " PATI_COL1 = ?, ";
        values.add(this.getPatiCol1());
        fields += " PATI_COL2 = ?, ";
        values.add(this.getPatiCol2());
        fields += " PATI_COL3 = ?, ";
        values.add(this.getPatiCol3());
        fields += " PATI_COL4 = ?, ";
        values.add(this.getPatiCol4());
        fields += " PATI_NOM_FIDEICOMISO = ?, ";
        values.add(this.getPatiNomFideicomiso());
        fields += " PATI_COL5 = ?, ";
        values.add(this.getPatiCol5());
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
        String sql = "INSERT INTO F_EVOL_PATRI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PATI_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getPatiIdFideicomiso());

        fields += ", PATI_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getPatiIdSecuencial());

        fields += ", PATI_ID_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getPatiIdFecha());

        fields += ", PATI_ID_TIPO";
        fieldValues += ", ?";
        values.add(this.getPatiIdTipo());

        fields += ", PATI_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getPatiConcepto());

        fields += ", PATI_COL1";
        fieldValues += ", ?";
        values.add(this.getPatiCol1());

        fields += ", PATI_COL2";
        fieldValues += ", ?";
        values.add(this.getPatiCol2());

        fields += ", PATI_COL3";
        fieldValues += ", ?";
        values.add(this.getPatiCol3());

        fields += ", PATI_COL4";
        fieldValues += ", ?";
        values.add(this.getPatiCol4());

        fields += ", PATI_NOM_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getPatiNomFideicomiso());

        fields += ", PATI_COL5";
        fieldValues += ", ?";
        values.add(this.getPatiCol5());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EVOL_PATRI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PATI_ID_FIDEICOMISO = ?";
        values.add(this.getPatiIdFideicomiso());
        conditions += " AND PATI_ID_SECUENCIAL = ?";
        values.add(this.getPatiIdSecuencial());
        conditions += " AND PATI_ID_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getPatiIdFecha());
        conditions += " AND PATI_ID_TIPO = ?";
        values.add(this.getPatiIdTipo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEvolPatri instance = (FEvolPatri) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPatiIdFideicomiso().equals(instance.getPatiIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getPatiIdSecuencial().equals(instance.getPatiIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getPatiIdFecha().equals(instance.getPatiIdFecha()))
            equalObjects = false;
        if (equalObjects && !this.getPatiIdTipo().equals(instance.getPatiIdTipo()))
            equalObjects = false;
        if (equalObjects && !this.getPatiConcepto().equals(instance.getPatiConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getPatiCol1().equals(instance.getPatiCol1()))
            equalObjects = false;
        if (equalObjects && !this.getPatiCol2().equals(instance.getPatiCol2()))
            equalObjects = false;
        if (equalObjects && !this.getPatiCol3().equals(instance.getPatiCol3()))
            equalObjects = false;
        if (equalObjects && !this.getPatiCol4().equals(instance.getPatiCol4()))
            equalObjects = false;
        if (equalObjects && !this.getPatiNomFideicomiso().equals(instance.getPatiNomFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getPatiCol5().equals(instance.getPatiCol5()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEvolPatri result = new FEvolPatri();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPatiIdFideicomiso((BigDecimal) objectData.getData("PATI_ID_FIDEICOMISO"));
        result.setPatiIdSecuencial((BigDecimal) objectData.getData("PATI_ID_SECUENCIAL"));
        result.setPatiIdFecha((String) objectData.getData("PATI_ID_FECHA"));
        result.setPatiIdTipo((BigDecimal) objectData.getData("PATI_ID_TIPO"));
        result.setPatiConcepto((String) objectData.getData("PATI_CONCEPTO"));
        result.setPatiCol1((String) objectData.getData("PATI_COL1"));
        result.setPatiCol2((String) objectData.getData("PATI_COL2"));
        result.setPatiCol3((String) objectData.getData("PATI_COL3"));
        result.setPatiCol4((String) objectData.getData("PATI_COL4"));
        result.setPatiNomFideicomiso((String) objectData.getData("PATI_NOM_FIDEICOMISO"));
        result.setPatiCol5((String) objectData.getData("PATI_COL5"));

        return result;

    }

}
