package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONCEPTS_PK", columns = { "CPT_CONCEPTO" }, sequences = { "MAX" })
public class Concepts extends DomainObject {

    String cptConcepto = null;
    BigDecimal cptNumCtama = null;
    BigDecimal cptNumSctaa = null;
    BigDecimal cptNumSsctaa = null;
    BigDecimal cptNumSssctaa = null;
    BigDecimal cptNumSsssctaa = null;
    BigDecimal cptNumSssssctaa = null;
    BigDecimal cptClavea = null;
    BigDecimal cptNumCtamb = null;
    BigDecimal cptNumSctab = null;
    BigDecimal cptNumSsctab = null;
    BigDecimal cptNumSssctab = null;
    BigDecimal cptNumSsssctab = null;
    BigDecimal cptNumSssssctab = null;
    BigDecimal cptClaveb = null;
    BigDecimal cptNumEnte = null;
    String cptCveStConcep = null;

    public Concepts() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCptConcepto(String cptConcepto) {
        this.cptConcepto = cptConcepto;
    }

    public String getCptConcepto() {
        return this.cptConcepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumCtama(BigDecimal cptNumCtama) {
        this.cptNumCtama = cptNumCtama;
    }

    public BigDecimal getCptNumCtama() {
        return this.cptNumCtama;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumSctaa(BigDecimal cptNumSctaa) {
        this.cptNumSctaa = cptNumSctaa;
    }

    public BigDecimal getCptNumSctaa() {
        return this.cptNumSctaa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumSsctaa(BigDecimal cptNumSsctaa) {
        this.cptNumSsctaa = cptNumSsctaa;
    }

    public BigDecimal getCptNumSsctaa() {
        return this.cptNumSsctaa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumSssctaa(BigDecimal cptNumSssctaa) {
        this.cptNumSssctaa = cptNumSssctaa;
    }

    public BigDecimal getCptNumSssctaa() {
        return this.cptNumSssctaa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumSsssctaa(BigDecimal cptNumSsssctaa) {
        this.cptNumSsssctaa = cptNumSsssctaa;
    }

    public BigDecimal getCptNumSsssctaa() {
        return this.cptNumSsssctaa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumSssssctaa(BigDecimal cptNumSssssctaa) {
        this.cptNumSssssctaa = cptNumSssssctaa;
    }

    public BigDecimal getCptNumSssssctaa() {
        return this.cptNumSssssctaa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCptClavea(BigDecimal cptClavea) {
        this.cptClavea = cptClavea;
    }

    public BigDecimal getCptClavea() {
        return this.cptClavea;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumCtamb(BigDecimal cptNumCtamb) {
        this.cptNumCtamb = cptNumCtamb;
    }

    public BigDecimal getCptNumCtamb() {
        return this.cptNumCtamb;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumSctab(BigDecimal cptNumSctab) {
        this.cptNumSctab = cptNumSctab;
    }

    public BigDecimal getCptNumSctab() {
        return this.cptNumSctab;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumSsctab(BigDecimal cptNumSsctab) {
        this.cptNumSsctab = cptNumSsctab;
    }

    public BigDecimal getCptNumSsctab() {
        return this.cptNumSsctab;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumSssctab(BigDecimal cptNumSssctab) {
        this.cptNumSssctab = cptNumSssctab;
    }

    public BigDecimal getCptNumSssctab() {
        return this.cptNumSssctab;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumSsssctab(BigDecimal cptNumSsssctab) {
        this.cptNumSsssctab = cptNumSsssctab;
    }

    public BigDecimal getCptNumSsssctab() {
        return this.cptNumSsssctab;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumSssssctab(BigDecimal cptNumSssssctab) {
        this.cptNumSssssctab = cptNumSssssctab;
    }

    public BigDecimal getCptNumSssssctab() {
        return this.cptNumSssssctab;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCptClaveb(BigDecimal cptClaveb) {
        this.cptClaveb = cptClaveb;
    }

    public BigDecimal getCptClaveb() {
        return this.cptClaveb;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCptNumEnte(BigDecimal cptNumEnte) {
        this.cptNumEnte = cptNumEnte;
    }

    public BigDecimal getCptNumEnte() {
        return this.cptNumEnte;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCptCveStConcep(String cptCveStConcep) {
        this.cptCveStConcep = cptCveStConcep;
    }

    public String getCptCveStConcep() {
        return this.cptCveStConcep;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONCEPTS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCptConcepto() != null && "null".equals(this.getCptConcepto())) {
            conditions += " AND CPT_CONCEPTO IS NULL";
        } else if (this.getCptConcepto() != null) {
            conditions += " AND CPT_CONCEPTO = ?";
            values.add(this.getCptConcepto());
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
        String sql = "SELECT * FROM CONCEPTS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCptConcepto() != null && "null".equals(this.getCptConcepto())) {
            conditions += " AND CPT_CONCEPTO IS NULL";
        } else if (this.getCptConcepto() != null) {
            conditions += " AND CPT_CONCEPTO = ?";
            values.add(this.getCptConcepto());
        }

        if (this.getCptNumCtama() != null && this.getCptNumCtama().longValue() == -999) {
            conditions += " AND CPT_NUM_CTAMA IS NULL";
        } else if (this.getCptNumCtama() != null) {
            conditions += " AND CPT_NUM_CTAMA = ?";
            values.add(this.getCptNumCtama());
        }

        if (this.getCptNumSctaa() != null && this.getCptNumSctaa().longValue() == -999) {
            conditions += " AND CPT_NUM_SCTAA IS NULL";
        } else if (this.getCptNumSctaa() != null) {
            conditions += " AND CPT_NUM_SCTAA = ?";
            values.add(this.getCptNumSctaa());
        }

        if (this.getCptNumSsctaa() != null && this.getCptNumSsctaa().longValue() == -999) {
            conditions += " AND CPT_NUM_SSCTAA IS NULL";
        } else if (this.getCptNumSsctaa() != null) {
            conditions += " AND CPT_NUM_SSCTAA = ?";
            values.add(this.getCptNumSsctaa());
        }

        if (this.getCptNumSssctaa() != null && this.getCptNumSssctaa().longValue() == -999) {
            conditions += " AND CPT_NUM_SSSCTAA IS NULL";
        } else if (this.getCptNumSssctaa() != null) {
            conditions += " AND CPT_NUM_SSSCTAA = ?";
            values.add(this.getCptNumSssctaa());
        }

        if (this.getCptNumSsssctaa() != null && this.getCptNumSsssctaa().longValue() == -999) {
            conditions += " AND CPT_NUM_SSSSCTAA IS NULL";
        } else if (this.getCptNumSsssctaa() != null) {
            conditions += " AND CPT_NUM_SSSSCTAA = ?";
            values.add(this.getCptNumSsssctaa());
        }

        if (this.getCptNumSssssctaa() != null && this.getCptNumSssssctaa().longValue() == -999) {
            conditions += " AND CPT_NUM_SSSSSCTAA IS NULL";
        } else if (this.getCptNumSssssctaa() != null) {
            conditions += " AND CPT_NUM_SSSSSCTAA = ?";
            values.add(this.getCptNumSssssctaa());
        }

        if (this.getCptClavea() != null && this.getCptClavea().longValue() == -999) {
            conditions += " AND CPT_CLAVEA IS NULL";
        } else if (this.getCptClavea() != null) {
            conditions += " AND CPT_CLAVEA = ?";
            values.add(this.getCptClavea());
        }

        if (this.getCptNumCtamb() != null && this.getCptNumCtamb().longValue() == -999) {
            conditions += " AND CPT_NUM_CTAMB IS NULL";
        } else if (this.getCptNumCtamb() != null) {
            conditions += " AND CPT_NUM_CTAMB = ?";
            values.add(this.getCptNumCtamb());
        }

        if (this.getCptNumSctab() != null && this.getCptNumSctab().longValue() == -999) {
            conditions += " AND CPT_NUM_SCTAB IS NULL";
        } else if (this.getCptNumSctab() != null) {
            conditions += " AND CPT_NUM_SCTAB = ?";
            values.add(this.getCptNumSctab());
        }

        if (this.getCptNumSsctab() != null && this.getCptNumSsctab().longValue() == -999) {
            conditions += " AND CPT_NUM_SSCTAB IS NULL";
        } else if (this.getCptNumSsctab() != null) {
            conditions += " AND CPT_NUM_SSCTAB = ?";
            values.add(this.getCptNumSsctab());
        }

        if (this.getCptNumSssctab() != null && this.getCptNumSssctab().longValue() == -999) {
            conditions += " AND CPT_NUM_SSSCTAB IS NULL";
        } else if (this.getCptNumSssctab() != null) {
            conditions += " AND CPT_NUM_SSSCTAB = ?";
            values.add(this.getCptNumSssctab());
        }

        if (this.getCptNumSsssctab() != null && this.getCptNumSsssctab().longValue() == -999) {
            conditions += " AND CPT_NUM_SSSSCTAB IS NULL";
        } else if (this.getCptNumSsssctab() != null) {
            conditions += " AND CPT_NUM_SSSSCTAB = ?";
            values.add(this.getCptNumSsssctab());
        }

        if (this.getCptNumSssssctab() != null && this.getCptNumSssssctab().longValue() == -999) {
            conditions += " AND CPT_NUM_SSSSSCTAB IS NULL";
        } else if (this.getCptNumSssssctab() != null) {
            conditions += " AND CPT_NUM_SSSSSCTAB = ?";
            values.add(this.getCptNumSssssctab());
        }

        if (this.getCptClaveb() != null && this.getCptClaveb().longValue() == -999) {
            conditions += " AND CPT_CLAVEB IS NULL";
        } else if (this.getCptClaveb() != null) {
            conditions += " AND CPT_CLAVEB = ?";
            values.add(this.getCptClaveb());
        }

        if (this.getCptNumEnte() != null && this.getCptNumEnte().longValue() == -999) {
            conditions += " AND CPT_NUM_ENTE IS NULL";
        } else if (this.getCptNumEnte() != null) {
            conditions += " AND CPT_NUM_ENTE = ?";
            values.add(this.getCptNumEnte());
        }

        if (this.getCptCveStConcep() != null && "null".equals(this.getCptCveStConcep())) {
            conditions += " AND CPT_CVE_ST_CONCEP IS NULL";
        } else if (this.getCptCveStConcep() != null) {
            conditions += " AND CPT_CVE_ST_CONCEP = ?";
            values.add(this.getCptCveStConcep());
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
        String sql = "UPDATE CONCEPTS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPT_CONCEPTO = ?";
        pkValues.add(this.getCptConcepto());
        fields += " CPT_NUM_CTAMA = ?, ";
        values.add(this.getCptNumCtama());
        fields += " CPT_NUM_SCTAA = ?, ";
        values.add(this.getCptNumSctaa());
        fields += " CPT_NUM_SSCTAA = ?, ";
        values.add(this.getCptNumSsctaa());
        fields += " CPT_NUM_SSSCTAA = ?, ";
        values.add(this.getCptNumSssctaa());
        fields += " CPT_NUM_SSSSCTAA = ?, ";
        values.add(this.getCptNumSsssctaa());
        fields += " CPT_NUM_SSSSSCTAA = ?, ";
        values.add(this.getCptNumSssssctaa());
        fields += " CPT_CLAVEA = ?, ";
        values.add(this.getCptClavea());
        fields += " CPT_NUM_CTAMB = ?, ";
        values.add(this.getCptNumCtamb());
        fields += " CPT_NUM_SCTAB = ?, ";
        values.add(this.getCptNumSctab());
        fields += " CPT_NUM_SSCTAB = ?, ";
        values.add(this.getCptNumSsctab());
        fields += " CPT_NUM_SSSCTAB = ?, ";
        values.add(this.getCptNumSssctab());
        fields += " CPT_NUM_SSSSCTAB = ?, ";
        values.add(this.getCptNumSsssctab());
        fields += " CPT_NUM_SSSSSCTAB = ?, ";
        values.add(this.getCptNumSssssctab());
        fields += " CPT_CLAVEB = ?, ";
        values.add(this.getCptClaveb());
        fields += " CPT_NUM_ENTE = ?, ";
        values.add(this.getCptNumEnte());
        fields += " CPT_CVE_ST_CONCEP = ?, ";
        values.add(this.getCptCveStConcep());
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
        String sql = "INSERT INTO CONCEPTS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPT_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getCptConcepto());

        fields += ", CPT_NUM_CTAMA";
        fieldValues += ", ?";
        values.add(this.getCptNumCtama());

        fields += ", CPT_NUM_SCTAA";
        fieldValues += ", ?";
        values.add(this.getCptNumSctaa());

        fields += ", CPT_NUM_SSCTAA";
        fieldValues += ", ?";
        values.add(this.getCptNumSsctaa());

        fields += ", CPT_NUM_SSSCTAA";
        fieldValues += ", ?";
        values.add(this.getCptNumSssctaa());

        fields += ", CPT_NUM_SSSSCTAA";
        fieldValues += ", ?";
        values.add(this.getCptNumSsssctaa());

        fields += ", CPT_NUM_SSSSSCTAA";
        fieldValues += ", ?";
        values.add(this.getCptNumSssssctaa());

        fields += ", CPT_CLAVEA";
        fieldValues += ", ?";
        values.add(this.getCptClavea());

        fields += ", CPT_NUM_CTAMB";
        fieldValues += ", ?";
        values.add(this.getCptNumCtamb());

        fields += ", CPT_NUM_SCTAB";
        fieldValues += ", ?";
        values.add(this.getCptNumSctab());

        fields += ", CPT_NUM_SSCTAB";
        fieldValues += ", ?";
        values.add(this.getCptNumSsctab());

        fields += ", CPT_NUM_SSSCTAB";
        fieldValues += ", ?";
        values.add(this.getCptNumSssctab());

        fields += ", CPT_NUM_SSSSCTAB";
        fieldValues += ", ?";
        values.add(this.getCptNumSsssctab());

        fields += ", CPT_NUM_SSSSSCTAB";
        fieldValues += ", ?";
        values.add(this.getCptNumSssssctab());

        fields += ", CPT_CLAVEB";
        fieldValues += ", ?";
        values.add(this.getCptClaveb());

        fields += ", CPT_NUM_ENTE";
        fieldValues += ", ?";
        values.add(this.getCptNumEnte());

        fields += ", CPT_CVE_ST_CONCEP";
        fieldValues += ", ?";
        values.add(this.getCptCveStConcep());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONCEPTS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPT_CONCEPTO = ?";
        values.add(this.getCptConcepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Concepts instance = (Concepts) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCptConcepto().equals(instance.getCptConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumCtama().equals(instance.getCptNumCtama()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumSctaa().equals(instance.getCptNumSctaa()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumSsctaa().equals(instance.getCptNumSsctaa()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumSssctaa().equals(instance.getCptNumSssctaa()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumSsssctaa().equals(instance.getCptNumSsssctaa()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumSssssctaa().equals(instance.getCptNumSssssctaa()))
            equalObjects = false;
        if (equalObjects && !this.getCptClavea().equals(instance.getCptClavea()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumCtamb().equals(instance.getCptNumCtamb()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumSctab().equals(instance.getCptNumSctab()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumSsctab().equals(instance.getCptNumSsctab()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumSssctab().equals(instance.getCptNumSssctab()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumSsssctab().equals(instance.getCptNumSsssctab()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumSssssctab().equals(instance.getCptNumSssssctab()))
            equalObjects = false;
        if (equalObjects && !this.getCptClaveb().equals(instance.getCptClaveb()))
            equalObjects = false;
        if (equalObjects && !this.getCptNumEnte().equals(instance.getCptNumEnte()))
            equalObjects = false;
        if (equalObjects && !this.getCptCveStConcep().equals(instance.getCptCveStConcep()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Concepts result = new Concepts();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCptConcepto((String) objectData.getData("CPT_CONCEPTO"));
        result.setCptNumCtama((BigDecimal) objectData.getData("CPT_NUM_CTAMA"));
        result.setCptNumSctaa((BigDecimal) objectData.getData("CPT_NUM_SCTAA"));
        result.setCptNumSsctaa((BigDecimal) objectData.getData("CPT_NUM_SSCTAA"));
        result.setCptNumSssctaa((BigDecimal) objectData.getData("CPT_NUM_SSSCTAA"));
        result.setCptNumSsssctaa((BigDecimal) objectData.getData("CPT_NUM_SSSSCTAA"));
        result.setCptNumSssssctaa((BigDecimal) objectData.getData("CPT_NUM_SSSSSCTAA"));
        result.setCptClavea((BigDecimal) objectData.getData("CPT_CLAVEA"));
        result.setCptNumCtamb((BigDecimal) objectData.getData("CPT_NUM_CTAMB"));
        result.setCptNumSctab((BigDecimal) objectData.getData("CPT_NUM_SCTAB"));
        result.setCptNumSsctab((BigDecimal) objectData.getData("CPT_NUM_SSCTAB"));
        result.setCptNumSssctab((BigDecimal) objectData.getData("CPT_NUM_SSSCTAB"));
        result.setCptNumSsssctab((BigDecimal) objectData.getData("CPT_NUM_SSSSCTAB"));
        result.setCptNumSssssctab((BigDecimal) objectData.getData("CPT_NUM_SSSSSCTAB"));
        result.setCptClaveb((BigDecimal) objectData.getData("CPT_CLAVEB"));
        result.setCptNumEnte((BigDecimal) objectData.getData("CPT_NUM_ENTE"));
        result.setCptCveStConcep((String) objectData.getData("CPT_CVE_ST_CONCEP"));

        return result;

    }

}
