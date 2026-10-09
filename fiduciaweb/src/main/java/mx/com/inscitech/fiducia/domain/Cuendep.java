package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CUENDEP_PK", columns = { "CDP_CVE_CUENDEP" }, sequences = { "MAX" })
public class Cuendep extends DomainObject {

    BigDecimal cdpCveCuendep = null;
    BigDecimal cdpCveBanco = null;
    String cdpNumCuenta = null;
    String cdpPlaza = null;
    String cdpSucursal = null;
    String cdpTitular = null;
    String cdpRfc = null;
    String cdpEstatus = null;
    BigDecimal cdpTipoCuenta = null;

    public Cuendep() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCdpCveCuendep(BigDecimal cdpCveCuendep) {
        this.cdpCveCuendep = cdpCveCuendep;
    }

    public BigDecimal getCdpCveCuendep() {
        return this.cdpCveCuendep;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCdpCveBanco(BigDecimal cdpCveBanco) {
        this.cdpCveBanco = cdpCveBanco;
    }

    public BigDecimal getCdpCveBanco() {
        return this.cdpCveBanco;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCdpNumCuenta(String cdpNumCuenta) {
        this.cdpNumCuenta = cdpNumCuenta;
    }

    public String getCdpNumCuenta() {
        return this.cdpNumCuenta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCdpPlaza(String cdpPlaza) {
        this.cdpPlaza = cdpPlaza;
    }

    public String getCdpPlaza() {
        return this.cdpPlaza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCdpSucursal(String cdpSucursal) {
        this.cdpSucursal = cdpSucursal;
    }

    public String getCdpSucursal() {
        return this.cdpSucursal;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCdpTitular(String cdpTitular) {
        this.cdpTitular = cdpTitular;
    }

    public String getCdpTitular() {
        return this.cdpTitular;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCdpRfc(String cdpRfc) {
        this.cdpRfc = cdpRfc;
    }

    public String getCdpRfc() {
        return this.cdpRfc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCdpEstatus(String cdpEstatus) {
        this.cdpEstatus = cdpEstatus;
    }

    public String getCdpEstatus() {
        return this.cdpEstatus;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setCdpTipoCuenta(BigDecimal cdpTipoCuenta) {
        this.cdpTipoCuenta = cdpTipoCuenta;
    }

    public BigDecimal getCdpTipoCuenta() {
        return this.cdpTipoCuenta;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CUENDEP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCdpCveCuendep() != null && this.getCdpCveCuendep().longValue() == -999) {
            conditions += " AND CDP_CVE_CUENDEP IS NULL";
        } else if (this.getCdpCveCuendep() != null) {
            conditions += " AND CDP_CVE_CUENDEP = ?";
            values.add(this.getCdpCveCuendep());
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
        String sql = "SELECT * FROM CUENDEP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCdpCveCuendep() != null && this.getCdpCveCuendep().longValue() == -999) {
            conditions += " AND CDP_CVE_CUENDEP IS NULL";
        } else if (this.getCdpCveCuendep() != null) {
            conditions += " AND CDP_CVE_CUENDEP = ?";
            values.add(this.getCdpCveCuendep());
        }

        if (this.getCdpCveBanco() != null && this.getCdpCveBanco().longValue() == -999) {
            conditions += " AND CDP_CVE_BANCO IS NULL";
        } else if (this.getCdpCveBanco() != null) {
            conditions += " AND CDP_CVE_BANCO = ?";
            values.add(this.getCdpCveBanco());
        }

        if (this.getCdpNumCuenta() != null && "null".equals(this.getCdpNumCuenta())) {
            conditions += " AND CDP_NUM_CUENTA IS NULL";
        } else if (this.getCdpNumCuenta() != null) {
            conditions += " AND CDP_NUM_CUENTA = ?";
            values.add(this.getCdpNumCuenta());
        }

        if (this.getCdpPlaza() != null && "null".equals(this.getCdpPlaza())) {
            conditions += " AND CDP_PLAZA IS NULL";
        } else if (this.getCdpPlaza() != null) {
            conditions += " AND CDP_PLAZA = ?";
            values.add(this.getCdpPlaza());
        }

        if (this.getCdpSucursal() != null && "null".equals(this.getCdpSucursal())) {
            conditions += " AND CDP_SUCURSAL IS NULL";
        } else if (this.getCdpSucursal() != null) {
            conditions += " AND CDP_SUCURSAL = ?";
            values.add(this.getCdpSucursal());
        }

        if (this.getCdpTitular() != null && "null".equals(this.getCdpTitular())) {
            conditions += " AND CDP_TITULAR IS NULL";
        } else if (this.getCdpTitular() != null) {
            conditions += " AND CDP_TITULAR = ?";
            values.add(this.getCdpTitular());
        }

        if (this.getCdpRfc() != null && "null".equals(this.getCdpRfc())) {
            conditions += " AND CDP_RFC IS NULL";
        } else if (this.getCdpRfc() != null) {
            conditions += " AND CDP_RFC = ?";
            values.add(this.getCdpRfc());
        }

        if (this.getCdpEstatus() != null && "null".equals(this.getCdpEstatus())) {
            conditions += " AND CDP_ESTATUS IS NULL";
        } else if (this.getCdpEstatus() != null) {
            conditions += " AND CDP_ESTATUS = ?";
            values.add(this.getCdpEstatus());
        }

        if (this.getCdpTipoCuenta() != null && this.getCdpTipoCuenta().longValue() == -999) {
            conditions += " AND CDP_TIPO_CUENTA IS NULL";
        } else if (this.getCdpTipoCuenta() != null) {
            conditions += " AND CDP_TIPO_CUENTA = ?";
            values.add(this.getCdpTipoCuenta());
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
        String sql = "UPDATE CUENDEP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CDP_CVE_CUENDEP = ?";
        pkValues.add(this.getCdpCveCuendep());
        fields += " CDP_CVE_BANCO = ?, ";
        values.add(this.getCdpCveBanco());
        fields += " CDP_NUM_CUENTA = ?, ";
        values.add(this.getCdpNumCuenta());
        fields += " CDP_PLAZA = ?, ";
        values.add(this.getCdpPlaza());
        fields += " CDP_SUCURSAL = ?, ";
        values.add(this.getCdpSucursal());
        fields += " CDP_TITULAR = ?, ";
        values.add(this.getCdpTitular());
        fields += " CDP_RFC = ?, ";
        values.add(this.getCdpRfc());
        fields += " CDP_ESTATUS = ?, ";
        values.add(this.getCdpEstatus());
        fields += " CDP_TIPO_CUENTA = ?, ";
        values.add(this.getCdpTipoCuenta());
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
        String sql = "INSERT INTO CUENDEP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CDP_CVE_CUENDEP";
        fieldValues += ", ?";
        values.add(this.getCdpCveCuendep());

        fields += ", CDP_CVE_BANCO";
        fieldValues += ", ?";
        values.add(this.getCdpCveBanco());

        fields += ", CDP_NUM_CUENTA";
        fieldValues += ", ?";
        values.add(this.getCdpNumCuenta());

        fields += ", CDP_PLAZA";
        fieldValues += ", ?";
        values.add(this.getCdpPlaza());

        fields += ", CDP_SUCURSAL";
        fieldValues += ", ?";
        values.add(this.getCdpSucursal());

        fields += ", CDP_TITULAR";
        fieldValues += ", ?";
        values.add(this.getCdpTitular());

        fields += ", CDP_RFC";
        fieldValues += ", ?";
        values.add(this.getCdpRfc());

        fields += ", CDP_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getCdpEstatus());

        fields += ", CDP_TIPO_CUENTA";
        fieldValues += ", ?";
        values.add(this.getCdpTipoCuenta());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CUENDEP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CDP_CVE_CUENDEP = ?";
        values.add(this.getCdpCveCuendep());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cuendep instance = (Cuendep) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCdpCveCuendep().equals(instance.getCdpCveCuendep()))
            equalObjects = false;
        if (equalObjects && !this.getCdpCveBanco().equals(instance.getCdpCveBanco()))
            equalObjects = false;
        if (equalObjects && !this.getCdpNumCuenta().equals(instance.getCdpNumCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getCdpPlaza().equals(instance.getCdpPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getCdpSucursal().equals(instance.getCdpSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getCdpTitular().equals(instance.getCdpTitular()))
            equalObjects = false;
        if (equalObjects && !this.getCdpRfc().equals(instance.getCdpRfc()))
            equalObjects = false;
        if (equalObjects && !this.getCdpEstatus().equals(instance.getCdpEstatus()))
            equalObjects = false;
        if (equalObjects && !this.getCdpTipoCuenta().equals(instance.getCdpTipoCuenta()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cuendep result = new Cuendep();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCdpCveCuendep((BigDecimal) objectData.getData("CDP_CVE_CUENDEP"));
        result.setCdpCveBanco((BigDecimal) objectData.getData("CDP_CVE_BANCO"));
        result.setCdpNumCuenta((String) objectData.getData("CDP_NUM_CUENTA"));
        result.setCdpPlaza((String) objectData.getData("CDP_PLAZA"));
        result.setCdpSucursal((String) objectData.getData("CDP_SUCURSAL"));
        result.setCdpTitular((String) objectData.getData("CDP_TITULAR"));
        result.setCdpRfc((String) objectData.getData("CDP_RFC"));
        result.setCdpEstatus((String) objectData.getData("CDP_ESTATUS"));
        result.setCdpTipoCuenta((BigDecimal) objectData.getData("CDP_TIPO_CUENTA"));

        return result;

    }

}
