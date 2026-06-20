package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_AEMISTAS_PK", columns = { "APOS_NOM_PIZARRA", "APOS_NUM_SER_EMIS", "APOS_NUM_CUPON_VIG" }, sequences = { "MANUAL" })
public class FAemistas extends DomainObject {

    String aposNomPizarra = null;
    String aposNumSerEmis = null;
    BigDecimal aposNumCuponVig = null;
    String aposFecVencimiento = null;

    public FAemistas() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAposNomPizarra(String aposNomPizarra) {
        this.aposNomPizarra = aposNomPizarra;
    }

    public String getAposNomPizarra() {
        return this.aposNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAposNumSerEmis(String aposNumSerEmis) {
        this.aposNumSerEmis = aposNumSerEmis;
    }

    public String getAposNumSerEmis() {
        return this.aposNumSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAposNumCuponVig(BigDecimal aposNumCuponVig) {
        this.aposNumCuponVig = aposNumCuponVig;
    }

    public BigDecimal getAposNumCuponVig() {
        return this.aposNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAposFecVencimiento(String aposFecVencimiento) {
        this.aposFecVencimiento = aposFecVencimiento;
    }

    public String getAposFecVencimiento() {
        return this.aposFecVencimiento;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_AEMISTAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAposNomPizarra() != null && "null".equals(this.getAposNomPizarra())) {
            conditions += " AND APOS_NOM_PIZARRA IS NULL";
        } else if (this.getAposNomPizarra() != null) {
            conditions += " AND APOS_NOM_PIZARRA = ?";
            values.add(this.getAposNomPizarra());
        }

        if (this.getAposNumSerEmis() != null && "null".equals(this.getAposNumSerEmis())) {
            conditions += " AND APOS_NUM_SER_EMIS IS NULL";
        } else if (this.getAposNumSerEmis() != null) {
            conditions += " AND APOS_NUM_SER_EMIS = ?";
            values.add(this.getAposNumSerEmis());
        }

        if (this.getAposNumCuponVig() != null && this.getAposNumCuponVig().longValue() == -999) {
            conditions += " AND APOS_NUM_CUPON_VIG IS NULL";
        } else if (this.getAposNumCuponVig() != null) {
            conditions += " AND APOS_NUM_CUPON_VIG = ?";
            values.add(this.getAposNumCuponVig());
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
        String sql = "SELECT * FROM F_AEMISTAS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAposNomPizarra() != null && "null".equals(this.getAposNomPizarra())) {
            conditions += " AND APOS_NOM_PIZARRA IS NULL";
        } else if (this.getAposNomPizarra() != null) {
            conditions += " AND APOS_NOM_PIZARRA = ?";
            values.add(this.getAposNomPizarra());
        }

        if (this.getAposNumSerEmis() != null && "null".equals(this.getAposNumSerEmis())) {
            conditions += " AND APOS_NUM_SER_EMIS IS NULL";
        } else if (this.getAposNumSerEmis() != null) {
            conditions += " AND APOS_NUM_SER_EMIS = ?";
            values.add(this.getAposNumSerEmis());
        }

        if (this.getAposNumCuponVig() != null && this.getAposNumCuponVig().longValue() == -999) {
            conditions += " AND APOS_NUM_CUPON_VIG IS NULL";
        } else if (this.getAposNumCuponVig() != null) {
            conditions += " AND APOS_NUM_CUPON_VIG = ?";
            values.add(this.getAposNumCuponVig());
        }

        if (this.getAposFecVencimiento() != null && "null".equals(this.getAposFecVencimiento())) {
            conditions += " AND APOS_FEC_VENCIMIENTO IS NULL";
        } else if (this.getAposFecVencimiento() != null) {
            conditions += " AND APOS_FEC_VENCIMIENTO = ?";
            values.add(this.getAposFecVencimiento());
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
        String sql = "UPDATE F_AEMISTAS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND APOS_NOM_PIZARRA = ?";
        pkValues.add(this.getAposNomPizarra());
        conditions += " AND APOS_NUM_SER_EMIS = ?";
        pkValues.add(this.getAposNumSerEmis());
        conditions += " AND APOS_NUM_CUPON_VIG = ?";
        pkValues.add(this.getAposNumCuponVig());
        fields += " APOS_FEC_VENCIMIENTO = ?, ";
        values.add(this.getAposFecVencimiento());
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
        String sql = "INSERT INTO F_AEMISTAS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", APOS_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getAposNomPizarra());

        fields += ", APOS_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getAposNumSerEmis());

        fields += ", APOS_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getAposNumCuponVig());

        fields += ", APOS_FEC_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getAposFecVencimiento());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_AEMISTAS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND APOS_NOM_PIZARRA = ?";
        values.add(this.getAposNomPizarra());
        conditions += " AND APOS_NUM_SER_EMIS = ?";
        values.add(this.getAposNumSerEmis());
        conditions += " AND APOS_NUM_CUPON_VIG = ?";
        values.add(this.getAposNumCuponVig());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAemistas instance = (FAemistas) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAposNomPizarra().equals(instance.getAposNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getAposNumSerEmis().equals(instance.getAposNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getAposNumCuponVig().equals(instance.getAposNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getAposFecVencimiento().equals(instance.getAposFecVencimiento()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAemistas result = new FAemistas();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAposNomPizarra((String) objectData.getData("APOS_NOM_PIZARRA"));
        result.setAposNumSerEmis((String) objectData.getData("APOS_NUM_SER_EMIS"));
        result.setAposNumCuponVig((BigDecimal) objectData.getData("APOS_NUM_CUPON_VIG"));
        result.setAposFecVencimiento((String) objectData.getData("APOS_FEC_VENCIMIENTO"));

        return result;

    }

}
