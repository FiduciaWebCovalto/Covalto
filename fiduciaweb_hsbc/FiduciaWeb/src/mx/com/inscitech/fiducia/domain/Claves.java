package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CLAVES_PK", columns = { "CVE_NUM_CLAVE", "CVE_NUM_SEC_CLAVE" }, sequences = { "MANUAL" })
public class Claves extends DomainObject {

    BigDecimal cveNumClave = null;
    BigDecimal cveNumSecClave = null;
    String cveDescClave = null;
    BigDecimal cveLiminfClave = null;
    BigDecimal cveLimsupClave = null;
    String cveFormaEmpCve = null;
    BigDecimal cveAnoAltaReg = null;
    BigDecimal cveMesAltaReg = null;
    BigDecimal cveDiaAltaReg = null;
    BigDecimal cveAnoUltMod = null;
    BigDecimal cveMesUltMod = null;
    BigDecimal cveDiaUltMod = null;
    String cveCveStClave = null;
    String cveParam1 = null;
    String cveDescParam1 = null;
    String cveParam2 = null;
    String cveDescParam2 = null;
    String cveParam3 = null;
    String cveDescParam3 = null;

    public Claves() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCveNumClave(BigDecimal cveNumClave) {
        this.cveNumClave = cveNumClave;
    }

    public BigDecimal getCveNumClave() {
        return this.cveNumClave;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCveNumSecClave(BigDecimal cveNumSecClave) {
        this.cveNumSecClave = cveNumSecClave;
    }

    public BigDecimal getCveNumSecClave() {
        return this.cveNumSecClave;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCveDescClave(String cveDescClave) {
        this.cveDescClave = cveDescClave;
    }

    public String getCveDescClave() {
        return this.cveDescClave;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCveLiminfClave(BigDecimal cveLiminfClave) {
        this.cveLiminfClave = cveLiminfClave;
    }

    public BigDecimal getCveLiminfClave() {
        return this.cveLiminfClave;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 38, scale = 0, javaClass = BigDecimal.class)
    public void setCveLimsupClave(BigDecimal cveLimsupClave) {
        this.cveLimsupClave = cveLimsupClave;
    }

    public BigDecimal getCveLimsupClave() {
        return this.cveLimsupClave;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCveFormaEmpCve(String cveFormaEmpCve) {
        this.cveFormaEmpCve = cveFormaEmpCve;
    }

    public String getCveFormaEmpCve() {
        return this.cveFormaEmpCve;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCveAnoAltaReg(BigDecimal cveAnoAltaReg) {
        this.cveAnoAltaReg = cveAnoAltaReg;
    }

    public BigDecimal getCveAnoAltaReg() {
        return this.cveAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCveMesAltaReg(BigDecimal cveMesAltaReg) {
        this.cveMesAltaReg = cveMesAltaReg;
    }

    public BigDecimal getCveMesAltaReg() {
        return this.cveMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCveDiaAltaReg(BigDecimal cveDiaAltaReg) {
        this.cveDiaAltaReg = cveDiaAltaReg;
    }

    public BigDecimal getCveDiaAltaReg() {
        return this.cveDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCveAnoUltMod(BigDecimal cveAnoUltMod) {
        this.cveAnoUltMod = cveAnoUltMod;
    }

    public BigDecimal getCveAnoUltMod() {
        return this.cveAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCveMesUltMod(BigDecimal cveMesUltMod) {
        this.cveMesUltMod = cveMesUltMod;
    }

    public BigDecimal getCveMesUltMod() {
        return this.cveMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCveDiaUltMod(BigDecimal cveDiaUltMod) {
        this.cveDiaUltMod = cveDiaUltMod;
    }

    public BigDecimal getCveDiaUltMod() {
        return this.cveDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCveCveStClave(String cveCveStClave) {
        this.cveCveStClave = cveCveStClave;
    }

    public String getCveCveStClave() {
        return this.cveCveStClave;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCveParam1(String cveParam1) {
        this.cveParam1 = cveParam1;
    }

    public String getCveParam1() {
        return this.cveParam1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCveDescParam1(String cveDescParam1) {
        this.cveDescParam1 = cveDescParam1;
    }

    public String getCveDescParam1() {
        return this.cveDescParam1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCveParam2(String cveParam2) {
        this.cveParam2 = cveParam2;
    }

    public String getCveParam2() {
        return this.cveParam2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCveDescParam2(String cveDescParam2) {
        this.cveDescParam2 = cveDescParam2;
    }

    public String getCveDescParam2() {
        return this.cveDescParam2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCveParam3(String cveParam3) {
        this.cveParam3 = cveParam3;
    }

    public String getCveParam3() {
        return this.cveParam3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCveDescParam3(String cveDescParam3) {
        this.cveDescParam3 = cveDescParam3;
    }

    public String getCveDescParam3() {
        return this.cveDescParam3;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CLAVES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCveNumClave() != null && this.getCveNumClave().longValue() == -999) {
            conditions += " AND CVE_NUM_CLAVE IS NULL";
        } else if (this.getCveNumClave() != null) {
            conditions += " AND CVE_NUM_CLAVE = ?";
            values.add(this.getCveNumClave());
        }

        if (this.getCveNumSecClave() != null && this.getCveNumSecClave().longValue() == -999) {
            conditions += " AND CVE_NUM_SEC_CLAVE IS NULL";
        } else if (this.getCveNumSecClave() != null) {
            conditions += " AND CVE_NUM_SEC_CLAVE = ?";
            values.add(this.getCveNumSecClave());
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
        String sql = "SELECT * FROM CLAVES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCveNumClave() != null && this.getCveNumClave().longValue() == -999) {
            conditions += " AND CVE_NUM_CLAVE IS NULL";
        } else if (this.getCveNumClave() != null) {
            conditions += " AND CVE_NUM_CLAVE = ?";
            values.add(this.getCveNumClave());
        }

        if (this.getCveNumSecClave() != null && this.getCveNumSecClave().longValue() == -999) {
            conditions += " AND CVE_NUM_SEC_CLAVE IS NULL";
        } else if (this.getCveNumSecClave() != null) {
            conditions += " AND CVE_NUM_SEC_CLAVE = ?";
            values.add(this.getCveNumSecClave());
        }

        if (this.getCveDescClave() != null && "null".equals(this.getCveDescClave())) {
            conditions += " AND CVE_DESC_CLAVE IS NULL";
        } else if (this.getCveDescClave() != null) {
            conditions += " AND CVE_DESC_CLAVE = ?";
            values.add(this.getCveDescClave());
        }

        if (this.getCveLiminfClave() != null && this.getCveLiminfClave().longValue() == -999) {
            conditions += " AND CVE_LIMINF_CLAVE IS NULL";
        } else if (this.getCveLiminfClave() != null) {
            conditions += " AND CVE_LIMINF_CLAVE = ?";
            values.add(this.getCveLiminfClave());
        }

        if (this.getCveLimsupClave() != null && this.getCveLimsupClave().longValue() == -999) {
            conditions += " AND CVE_LIMSUP_CLAVE IS NULL";
        } else if (this.getCveLimsupClave() != null) {
            conditions += " AND CVE_LIMSUP_CLAVE = ?";
            values.add(this.getCveLimsupClave());
        }

        if (this.getCveFormaEmpCve() != null && "null".equals(this.getCveFormaEmpCve())) {
            conditions += " AND CVE_FORMA_EMP_CVE IS NULL";
        } else if (this.getCveFormaEmpCve() != null) {
            conditions += " AND CVE_FORMA_EMP_CVE = ?";
            values.add(this.getCveFormaEmpCve());
        }

        if (this.getCveAnoAltaReg() != null && this.getCveAnoAltaReg().longValue() == -999) {
            conditions += " AND CVE_ANO_ALTA_REG IS NULL";
        } else if (this.getCveAnoAltaReg() != null) {
            conditions += " AND CVE_ANO_ALTA_REG = ?";
            values.add(this.getCveAnoAltaReg());
        }

        if (this.getCveMesAltaReg() != null && this.getCveMesAltaReg().longValue() == -999) {
            conditions += " AND CVE_MES_ALTA_REG IS NULL";
        } else if (this.getCveMesAltaReg() != null) {
            conditions += " AND CVE_MES_ALTA_REG = ?";
            values.add(this.getCveMesAltaReg());
        }

        if (this.getCveDiaAltaReg() != null && this.getCveDiaAltaReg().longValue() == -999) {
            conditions += " AND CVE_DIA_ALTA_REG IS NULL";
        } else if (this.getCveDiaAltaReg() != null) {
            conditions += " AND CVE_DIA_ALTA_REG = ?";
            values.add(this.getCveDiaAltaReg());
        }

        if (this.getCveAnoUltMod() != null && this.getCveAnoUltMod().longValue() == -999) {
            conditions += " AND CVE_ANO_ULT_MOD IS NULL";
        } else if (this.getCveAnoUltMod() != null) {
            conditions += " AND CVE_ANO_ULT_MOD = ?";
            values.add(this.getCveAnoUltMod());
        }

        if (this.getCveMesUltMod() != null && this.getCveMesUltMod().longValue() == -999) {
            conditions += " AND CVE_MES_ULT_MOD IS NULL";
        } else if (this.getCveMesUltMod() != null) {
            conditions += " AND CVE_MES_ULT_MOD = ?";
            values.add(this.getCveMesUltMod());
        }

        if (this.getCveDiaUltMod() != null && this.getCveDiaUltMod().longValue() == -999) {
            conditions += " AND CVE_DIA_ULT_MOD IS NULL";
        } else if (this.getCveDiaUltMod() != null) {
            conditions += " AND CVE_DIA_ULT_MOD = ?";
            values.add(this.getCveDiaUltMod());
        }

        if (this.getCveCveStClave() != null && "null".equals(this.getCveCveStClave())) {
            conditions += " AND CVE_CVE_ST_CLAVE IS NULL";
        } else if (this.getCveCveStClave() != null) {
            conditions += " AND CVE_CVE_ST_CLAVE = ?";
            values.add(this.getCveCveStClave());
        }

        if (this.getCveParam1() != null && "null".equals(this.getCveParam1())) {
            conditions += " AND CVE_PARAM1 IS NULL";
        } else if (this.getCveParam1() != null) {
            conditions += " AND CVE_PARAM1 = ?";
            values.add(this.getCveParam1());
        }

        if (this.getCveDescParam1() != null && "null".equals(this.getCveDescParam1())) {
            conditions += " AND CVE_DESC_PARAM1 IS NULL";
        } else if (this.getCveDescParam1() != null) {
            conditions += " AND CVE_DESC_PARAM1 = ?";
            values.add(this.getCveDescParam1());
        }

        if (this.getCveParam2() != null && "null".equals(this.getCveParam2())) {
            conditions += " AND CVE_PARAM2 IS NULL";
        } else if (this.getCveParam2() != null) {
            conditions += " AND CVE_PARAM2 = ?";
            values.add(this.getCveParam2());
        }

        if (this.getCveDescParam2() != null && "null".equals(this.getCveDescParam2())) {
            conditions += " AND CVE_DESC_PARAM2 IS NULL";
        } else if (this.getCveDescParam2() != null) {
            conditions += " AND CVE_DESC_PARAM2 = ?";
            values.add(this.getCveDescParam2());
        }

        if (this.getCveParam3() != null && "null".equals(this.getCveParam3())) {
            conditions += " AND CVE_PARAM3 IS NULL";
        } else if (this.getCveParam3() != null) {
            conditions += " AND CVE_PARAM3 = ?";
            values.add(this.getCveParam3());
        }

        if (this.getCveDescParam3() != null && "null".equals(this.getCveDescParam3())) {
            conditions += " AND CVE_DESC_PARAM3 IS NULL";
        } else if (this.getCveDescParam3() != null) {
            conditions += " AND CVE_DESC_PARAM3 = ?";
            values.add(this.getCveDescParam3());
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
        String sql = "UPDATE CLAVES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CVE_NUM_CLAVE = ?";
        pkValues.add(this.getCveNumClave());
        conditions += " AND CVE_NUM_SEC_CLAVE = ?";
        pkValues.add(this.getCveNumSecClave());
        fields += " CVE_DESC_CLAVE = ?, ";
        values.add(this.getCveDescClave());
        fields += " CVE_LIMINF_CLAVE = ?, ";
        values.add(this.getCveLiminfClave());
        fields += " CVE_LIMSUP_CLAVE = ?, ";
        values.add(this.getCveLimsupClave());
        fields += " CVE_FORMA_EMP_CVE = ?, ";
        values.add(this.getCveFormaEmpCve());
        fields += " CVE_ANO_ALTA_REG = ?, ";
        values.add(this.getCveAnoAltaReg());
        fields += " CVE_MES_ALTA_REG = ?, ";
        values.add(this.getCveMesAltaReg());
        fields += " CVE_DIA_ALTA_REG = ?, ";
        values.add(this.getCveDiaAltaReg());
        fields += " CVE_ANO_ULT_MOD = ?, ";
        values.add(this.getCveAnoUltMod());
        fields += " CVE_MES_ULT_MOD = ?, ";
        values.add(this.getCveMesUltMod());
        fields += " CVE_DIA_ULT_MOD = ?, ";
        values.add(this.getCveDiaUltMod());
        fields += " CVE_CVE_ST_CLAVE = ?, ";
        values.add(this.getCveCveStClave());
        fields += " CVE_PARAM1 = ?, ";
        values.add(this.getCveParam1());
        fields += " CVE_DESC_PARAM1 = ?, ";
        values.add(this.getCveDescParam1());
        fields += " CVE_PARAM2 = ?, ";
        values.add(this.getCveParam2());
        fields += " CVE_DESC_PARAM2 = ?, ";
        values.add(this.getCveDescParam2());
        fields += " CVE_PARAM3 = ?, ";
        values.add(this.getCveParam3());
        fields += " CVE_DESC_PARAM3 = ?, ";
        values.add(this.getCveDescParam3());
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
        String sql = "INSERT INTO CLAVES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CVE_NUM_CLAVE";
        fieldValues += ", ?";
        values.add(this.getCveNumClave());

        fields += ", CVE_NUM_SEC_CLAVE";
        fieldValues += ", ?";
        values.add(this.getCveNumSecClave());

        fields += ", CVE_DESC_CLAVE";
        fieldValues += ", ?";
        values.add(this.getCveDescClave());

        fields += ", CVE_LIMINF_CLAVE";
        fieldValues += ", ?";
        values.add(this.getCveLiminfClave());

        fields += ", CVE_LIMSUP_CLAVE";
        fieldValues += ", ?";
        values.add(this.getCveLimsupClave());

        fields += ", CVE_FORMA_EMP_CVE";
        fieldValues += ", ?";
        values.add(this.getCveFormaEmpCve());

        fields += ", CVE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCveAnoAltaReg());

        fields += ", CVE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCveMesAltaReg());

        fields += ", CVE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCveDiaAltaReg());

        fields += ", CVE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCveAnoUltMod());

        fields += ", CVE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCveMesUltMod());

        fields += ", CVE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCveDiaUltMod());

        fields += ", CVE_CVE_ST_CLAVE";
        fieldValues += ", ?";
        values.add(this.getCveCveStClave());

        fields += ", CVE_PARAM1";
        fieldValues += ", ?";
        values.add(this.getCveParam1());

        fields += ", CVE_DESC_PARAM1";
        fieldValues += ", ?";
        values.add(this.getCveDescParam1());

        fields += ", CVE_PARAM2";
        fieldValues += ", ?";
        values.add(this.getCveParam2());

        fields += ", CVE_DESC_PARAM2";
        fieldValues += ", ?";
        values.add(this.getCveDescParam2());

        fields += ", CVE_PARAM3";
        fieldValues += ", ?";
        values.add(this.getCveParam3());

        fields += ", CVE_DESC_PARAM3";
        fieldValues += ", ?";
        values.add(this.getCveDescParam3());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CLAVES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CVE_NUM_CLAVE = ?";
        values.add(this.getCveNumClave());
        conditions += " AND CVE_NUM_SEC_CLAVE = ?";
        values.add(this.getCveNumSecClave());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Claves instance = (Claves) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCveNumClave().equals(instance.getCveNumClave()))
            equalObjects = false;
        if (equalObjects && !this.getCveNumSecClave().equals(instance.getCveNumSecClave()))
            equalObjects = false;
        if (equalObjects && !this.getCveDescClave().equals(instance.getCveDescClave()))
            equalObjects = false;
        if (equalObjects && !this.getCveLiminfClave().equals(instance.getCveLiminfClave()))
            equalObjects = false;
        if (equalObjects && !this.getCveLimsupClave().equals(instance.getCveLimsupClave()))
            equalObjects = false;
        if (equalObjects && !this.getCveFormaEmpCve().equals(instance.getCveFormaEmpCve()))
            equalObjects = false;
        if (equalObjects && !this.getCveAnoAltaReg().equals(instance.getCveAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCveMesAltaReg().equals(instance.getCveMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCveDiaAltaReg().equals(instance.getCveDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCveAnoUltMod().equals(instance.getCveAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCveMesUltMod().equals(instance.getCveMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCveDiaUltMod().equals(instance.getCveDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCveCveStClave().equals(instance.getCveCveStClave()))
            equalObjects = false;
        if (equalObjects && !this.getCveParam1().equals(instance.getCveParam1()))
            equalObjects = false;
        if (equalObjects && !this.getCveDescParam1().equals(instance.getCveDescParam1()))
            equalObjects = false;
        if (equalObjects && !this.getCveParam2().equals(instance.getCveParam2()))
            equalObjects = false;
        if (equalObjects && !this.getCveDescParam2().equals(instance.getCveDescParam2()))
            equalObjects = false;
        if (equalObjects && !this.getCveParam3().equals(instance.getCveParam3()))
            equalObjects = false;
        if (equalObjects && !this.getCveDescParam3().equals(instance.getCveDescParam3()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Claves result = new Claves();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCveNumClave((BigDecimal) objectData.getData("CVE_NUM_CLAVE"));
        result.setCveNumSecClave((BigDecimal) objectData.getData("CVE_NUM_SEC_CLAVE"));
        result.setCveDescClave((String) objectData.getData("CVE_DESC_CLAVE"));
        result.setCveLiminfClave((BigDecimal) objectData.getData("CVE_LIMINF_CLAVE"));
        result.setCveLimsupClave((BigDecimal) objectData.getData("CVE_LIMSUP_CLAVE"));
        result.setCveFormaEmpCve((String) objectData.getData("CVE_FORMA_EMP_CVE"));
        result.setCveAnoAltaReg((BigDecimal) objectData.getData("CVE_ANO_ALTA_REG"));
        result.setCveMesAltaReg((BigDecimal) objectData.getData("CVE_MES_ALTA_REG"));
        result.setCveDiaAltaReg((BigDecimal) objectData.getData("CVE_DIA_ALTA_REG"));
        result.setCveAnoUltMod((BigDecimal) objectData.getData("CVE_ANO_ULT_MOD"));
        result.setCveMesUltMod((BigDecimal) objectData.getData("CVE_MES_ULT_MOD"));
        result.setCveDiaUltMod((BigDecimal) objectData.getData("CVE_DIA_ULT_MOD"));
        result.setCveCveStClave((String) objectData.getData("CVE_CVE_ST_CLAVE"));
        result.setCveParam1((String) objectData.getData("CVE_PARAM1"));
        result.setCveDescParam1((String) objectData.getData("CVE_DESC_PARAM1"));
        result.setCveParam2((String) objectData.getData("CVE_PARAM2"));
        result.setCveDescParam2((String) objectData.getData("CVE_DESC_PARAM2"));
        result.setCveParam3((String) objectData.getData("CVE_PARAM3"));
        result.setCveDescParam3((String) objectData.getData("CVE_DESC_PARAM3"));

        return result;

    }

}
