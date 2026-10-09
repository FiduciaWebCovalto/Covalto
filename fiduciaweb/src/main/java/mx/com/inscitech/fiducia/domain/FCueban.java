package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CUEBAN_PK", columns = { "FCBA_CLABE_CBA", "FCBA_CLAS_TIPO", "FCBA_NUM_TIPO" }, sequences = { "MANUAL" })
public class FCueban extends DomainObject {

    BigDecimal fcbaNumeroCtaBan = null;
    BigDecimal fcbaBanco = null;
    String fcbaPlazaCba = null;
    String fcbaClabeCba = null;
    String fcbaRfc = null;
    String fcbaTitular = null;
    String fcbaStatus = null;
    BigDecimal fcbaClasTipo = null;
    BigDecimal fcbaNumTipo = null;
    BigDecimal fcbaSubCuenta = null;
    BigDecimal fcbaMoneda = null;

    public FCueban() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 0, javaClass = BigDecimal.class)
    public void setFcbaNumeroCtaBan(BigDecimal fcbaNumeroCtaBan) {
        this.fcbaNumeroCtaBan = fcbaNumeroCtaBan;
    }

    public BigDecimal getFcbaNumeroCtaBan() {
        return this.fcbaNumeroCtaBan;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcbaBanco(BigDecimal fcbaBanco) {
        this.fcbaBanco = fcbaBanco;
    }

    public BigDecimal getFcbaBanco() {
        return this.fcbaBanco;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcbaPlazaCba(String fcbaPlazaCba) {
        this.fcbaPlazaCba = fcbaPlazaCba;
    }

    public String getFcbaPlazaCba() {
        return this.fcbaPlazaCba;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcbaClabeCba(String fcbaClabeCba) {
        this.fcbaClabeCba = fcbaClabeCba;
    }

    public String getFcbaClabeCba() {
        return this.fcbaClabeCba;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcbaRfc(String fcbaRfc) {
        this.fcbaRfc = fcbaRfc;
    }

    public String getFcbaRfc() {
        return this.fcbaRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcbaTitular(String fcbaTitular) {
        this.fcbaTitular = fcbaTitular;
    }

    public String getFcbaTitular() {
        return this.fcbaTitular;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFcbaStatus(String fcbaStatus) {
        this.fcbaStatus = fcbaStatus;
    }

    public String getFcbaStatus() {
        return this.fcbaStatus;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcbaClasTipo(BigDecimal fcbaClasTipo) {
        this.fcbaClasTipo = fcbaClasTipo;
    }

    public BigDecimal getFcbaClasTipo() {
        return this.fcbaClasTipo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcbaNumTipo(BigDecimal fcbaNumTipo) {
        this.fcbaNumTipo = fcbaNumTipo;
    }

    public BigDecimal getFcbaNumTipo() {
        return this.fcbaNumTipo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 0, javaClass = BigDecimal.class)
    public void setFcbaSubCuenta(BigDecimal fcbaSubCuenta) {
        this.fcbaSubCuenta = fcbaSubCuenta;
    }

    public BigDecimal getFcbaSubCuenta() {
        return this.fcbaSubCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFcbaMoneda(BigDecimal fcbaMoneda) {
        this.fcbaMoneda = fcbaMoneda;
    }

    public BigDecimal getFcbaMoneda() {
        return this.fcbaMoneda;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CUEBAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcbaClabeCba() != null && "null".equals(this.getFcbaClabeCba())) {
            conditions += " AND FCBA_CLABE_CBA IS NULL";
        } else if (this.getFcbaClabeCba() != null) {
            conditions += " AND FCBA_CLABE_CBA = ?";
            values.add(this.getFcbaClabeCba());
        }

        if (this.getFcbaClasTipo() != null && this.getFcbaClasTipo().longValue() == -999) {
            conditions += " AND FCBA_CLAS_TIPO IS NULL";
        } else if (this.getFcbaClasTipo() != null) {
            conditions += " AND FCBA_CLAS_TIPO = ?";
            values.add(this.getFcbaClasTipo());
        }

        if (this.getFcbaNumTipo() != null && this.getFcbaNumTipo().longValue() == -999) {
            conditions += " AND FCBA_NUM_TIPO IS NULL";
        } else if (this.getFcbaNumTipo() != null) {
            conditions += " AND FCBA_NUM_TIPO = ?";
            values.add(this.getFcbaNumTipo());
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
        String sql = "SELECT * FROM F_CUEBAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFcbaNumeroCtaBan() != null && this.getFcbaNumeroCtaBan().longValue() == -999) {
            conditions += " AND FCBA_NUMERO_CTA_BAN IS NULL";
        } else if (this.getFcbaNumeroCtaBan() != null) {
            conditions += " AND FCBA_NUMERO_CTA_BAN = ?";
            values.add(this.getFcbaNumeroCtaBan());
        }

        if (this.getFcbaBanco() != null && this.getFcbaBanco().longValue() == -999) {
            conditions += " AND FCBA_BANCO IS NULL";
        } else if (this.getFcbaBanco() != null) {
            conditions += " AND FCBA_BANCO = ?";
            values.add(this.getFcbaBanco());
        }

        if (this.getFcbaPlazaCba() != null && "null".equals(this.getFcbaPlazaCba())) {
            conditions += " AND FCBA_PLAZA_CBA IS NULL";
        } else if (this.getFcbaPlazaCba() != null) {
            conditions += " AND FCBA_PLAZA_CBA = ?";
            values.add(this.getFcbaPlazaCba());
        }

        if (this.getFcbaClabeCba() != null && "null".equals(this.getFcbaClabeCba())) {
            conditions += " AND FCBA_CLABE_CBA IS NULL";
        } else if (this.getFcbaClabeCba() != null) {
            conditions += " AND FCBA_CLABE_CBA = ?";
            values.add(this.getFcbaClabeCba());
        }

        if (this.getFcbaRfc() != null && "null".equals(this.getFcbaRfc())) {
            conditions += " AND FCBA_RFC IS NULL";
        } else if (this.getFcbaRfc() != null) {
            conditions += " AND FCBA_RFC = ?";
            values.add(this.getFcbaRfc());
        }

        if (this.getFcbaTitular() != null && "null".equals(this.getFcbaTitular())) {
            conditions += " AND FCBA_TITULAR IS NULL";
        } else if (this.getFcbaTitular() != null) {
            conditions += " AND FCBA_TITULAR = ?";
            values.add(this.getFcbaTitular());
        }

        if (this.getFcbaStatus() != null && "null".equals(this.getFcbaStatus())) {
            conditions += " AND FCBA_STATUS IS NULL";
        } else if (this.getFcbaStatus() != null) {
            conditions += " AND FCBA_STATUS = ?";
            values.add(this.getFcbaStatus());
        }

        if (this.getFcbaClasTipo() != null && this.getFcbaClasTipo().longValue() == -999) {
            conditions += " AND FCBA_CLAS_TIPO IS NULL";
        } else if (this.getFcbaClasTipo() != null) {
            conditions += " AND FCBA_CLAS_TIPO = ?";
            values.add(this.getFcbaClasTipo());
        }

        if (this.getFcbaNumTipo() != null && this.getFcbaNumTipo().longValue() == -999) {
            conditions += " AND FCBA_NUM_TIPO IS NULL";
        } else if (this.getFcbaNumTipo() != null) {
            conditions += " AND FCBA_NUM_TIPO = ?";
            values.add(this.getFcbaNumTipo());
        }

        if (this.getFcbaSubCuenta() != null && this.getFcbaSubCuenta().longValue() == -999) {
            conditions += " AND FCBA_SUB_CUENTA IS NULL";
        } else if (this.getFcbaSubCuenta() != null) {
            conditions += " AND FCBA_SUB_CUENTA = ?";
            values.add(this.getFcbaSubCuenta());
        }

        if (this.getFcbaMoneda() != null && this.getFcbaMoneda().longValue() == -999) {
            conditions += " AND FCBA_MONEDA IS NULL";
        } else if (this.getFcbaMoneda() != null) {
            conditions += " AND FCBA_MONEDA = ?";
            values.add(this.getFcbaMoneda());
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
        String sql = "UPDATE F_CUEBAN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FCBA_NUMERO_CTA_BAN = ?, ";
        values.add(this.getFcbaNumeroCtaBan());
        fields += " FCBA_BANCO = ?, ";
        values.add(this.getFcbaBanco());
        fields += " FCBA_PLAZA_CBA = ?, ";
        values.add(this.getFcbaPlazaCba());
        conditions += " AND FCBA_CLABE_CBA = ?";
        pkValues.add(this.getFcbaClabeCba());
        fields += " FCBA_RFC = ?, ";
        values.add(this.getFcbaRfc());
        fields += " FCBA_TITULAR = ?, ";
        values.add(this.getFcbaTitular());
        fields += " FCBA_STATUS = ?, ";
        values.add(this.getFcbaStatus());
        conditions += " AND FCBA_CLAS_TIPO = ?";
        pkValues.add(this.getFcbaClasTipo());
        conditions += " AND FCBA_NUM_TIPO = ?";
        pkValues.add(this.getFcbaNumTipo());
        fields += " FCBA_SUB_CUENTA = ?, ";
        values.add(this.getFcbaSubCuenta());
        fields += " FCBA_MONEDA = ?, ";
        values.add(this.getFcbaMoneda());
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
        String sql = "INSERT INTO F_CUEBAN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FCBA_NUMERO_CTA_BAN";
        fieldValues += ", ?";
        values.add(this.getFcbaNumeroCtaBan());

        fields += ", FCBA_BANCO";
        fieldValues += ", ?";
        values.add(this.getFcbaBanco());

        fields += ", FCBA_PLAZA_CBA";
        fieldValues += ", ?";
        values.add(this.getFcbaPlazaCba());

        fields += ", FCBA_CLABE_CBA";
        fieldValues += ", ?";
        values.add(this.getFcbaClabeCba());

        fields += ", FCBA_RFC";
        fieldValues += ", ?";
        values.add(this.getFcbaRfc());

        fields += ", FCBA_TITULAR";
        fieldValues += ", ?";
        values.add(this.getFcbaTitular());

        fields += ", FCBA_STATUS";
        fieldValues += ", ?";
        values.add(this.getFcbaStatus());

        fields += ", FCBA_CLAS_TIPO";
        fieldValues += ", ?";
        values.add(this.getFcbaClasTipo());

        fields += ", FCBA_NUM_TIPO";
        fieldValues += ", ?";
        values.add(this.getFcbaNumTipo());

        fields += ", FCBA_SUB_CUENTA";
        fieldValues += ", ?";
        values.add(this.getFcbaSubCuenta());

        fields += ", FCBA_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFcbaMoneda());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CUEBAN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FCBA_CLABE_CBA = ?";
        values.add(this.getFcbaClabeCba());
        conditions += " AND FCBA_CLAS_TIPO = ?";
        values.add(this.getFcbaClasTipo());
        conditions += " AND FCBA_NUM_TIPO = ?";
        values.add(this.getFcbaNumTipo());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCueban instance = (FCueban) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFcbaNumeroCtaBan().equals(instance.getFcbaNumeroCtaBan()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaBanco().equals(instance.getFcbaBanco()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaPlazaCba().equals(instance.getFcbaPlazaCba()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaClabeCba().equals(instance.getFcbaClabeCba()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaRfc().equals(instance.getFcbaRfc()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaTitular().equals(instance.getFcbaTitular()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaStatus().equals(instance.getFcbaStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaClasTipo().equals(instance.getFcbaClasTipo()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaNumTipo().equals(instance.getFcbaNumTipo()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaSubCuenta().equals(instance.getFcbaSubCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFcbaMoneda().equals(instance.getFcbaMoneda()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCueban result = new FCueban();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFcbaNumeroCtaBan((BigDecimal) objectData.getData("FCBA_NUMERO_CTA_BAN"));
        result.setFcbaBanco((BigDecimal) objectData.getData("FCBA_BANCO"));
        result.setFcbaPlazaCba((String) objectData.getData("FCBA_PLAZA_CBA"));
        result.setFcbaClabeCba((String) objectData.getData("FCBA_CLABE_CBA"));
        result.setFcbaRfc((String) objectData.getData("FCBA_RFC"));
        result.setFcbaTitular((String) objectData.getData("FCBA_TITULAR"));
        result.setFcbaStatus((String) objectData.getData("FCBA_STATUS"));
        result.setFcbaClasTipo((BigDecimal) objectData.getData("FCBA_CLAS_TIPO"));
        result.setFcbaNumTipo((BigDecimal) objectData.getData("FCBA_NUM_TIPO"));
        result.setFcbaSubCuenta((BigDecimal) objectData.getData("FCBA_SUB_CUENTA"));
        result.setFcbaMoneda((BigDecimal) objectData.getData("FCBA_MONEDA"));

        return result;

    }

}
