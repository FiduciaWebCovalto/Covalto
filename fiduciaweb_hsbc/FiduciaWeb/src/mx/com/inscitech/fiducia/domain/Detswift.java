package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DETSWIFT_PK", columns = { "DEL_FOLIO_OPERA" }, sequences = { "MAX" })
public class Detswift extends DomainObject {

    BigDecimal delFolioOpera = null;
    String swiBranch = null;
    String swiDomicilio = null;
    String swiNomPlaza = null;
    String swiClave = null;

    public Detswift() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDelFolioOpera(BigDecimal delFolioOpera) {
        this.delFolioOpera = delFolioOpera;
    }

    public BigDecimal getDelFolioOpera() {
        return this.delFolioOpera;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSwiBranch(String swiBranch) {
        this.swiBranch = swiBranch;
    }

    public String getSwiBranch() {
        return this.swiBranch;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSwiDomicilio(String swiDomicilio) {
        this.swiDomicilio = swiDomicilio;
    }

    public String getSwiDomicilio() {
        return this.swiDomicilio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSwiNomPlaza(String swiNomPlaza) {
        this.swiNomPlaza = swiNomPlaza;
    }

    public String getSwiNomPlaza() {
        return this.swiNomPlaza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSwiClave(String swiClave) {
        this.swiClave = swiClave;
    }

    public String getSwiClave() {
        return this.swiClave;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DETSWIFT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDelFolioOpera() != null && this.getDelFolioOpera().longValue() == -999) {
            conditions += " AND DEL_FOLIO_OPERA IS NULL";
        } else if (this.getDelFolioOpera() != null) {
            conditions += " AND DEL_FOLIO_OPERA = ?";
            values.add(this.getDelFolioOpera());
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
        String sql = "SELECT * FROM DETSWIFT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDelFolioOpera() != null && this.getDelFolioOpera().longValue() == -999) {
            conditions += " AND DEL_FOLIO_OPERA IS NULL";
        } else if (this.getDelFolioOpera() != null) {
            conditions += " AND DEL_FOLIO_OPERA = ?";
            values.add(this.getDelFolioOpera());
        }

        if (this.getSwiBranch() != null && "null".equals(this.getSwiBranch())) {
            conditions += " AND SWI_BRANCH IS NULL";
        } else if (this.getSwiBranch() != null) {
            conditions += " AND SWI_BRANCH = ?";
            values.add(this.getSwiBranch());
        }

        if (this.getSwiDomicilio() != null && "null".equals(this.getSwiDomicilio())) {
            conditions += " AND SWI_DOMICILIO IS NULL";
        } else if (this.getSwiDomicilio() != null) {
            conditions += " AND SWI_DOMICILIO = ?";
            values.add(this.getSwiDomicilio());
        }

        if (this.getSwiNomPlaza() != null && "null".equals(this.getSwiNomPlaza())) {
            conditions += " AND SWI_NOM_PLAZA IS NULL";
        } else if (this.getSwiNomPlaza() != null) {
            conditions += " AND SWI_NOM_PLAZA = ?";
            values.add(this.getSwiNomPlaza());
        }

        if (this.getSwiClave() != null && "null".equals(this.getSwiClave())) {
            conditions += " AND SWI_CLAVE IS NULL";
        } else if (this.getSwiClave() != null) {
            conditions += " AND SWI_CLAVE = ?";
            values.add(this.getSwiClave());
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
        String sql = "UPDATE DETSWIFT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DEL_FOLIO_OPERA = ?";
        pkValues.add(this.getDelFolioOpera());
        fields += " SWI_BRANCH = ?, ";
        values.add(this.getSwiBranch());
        fields += " SWI_DOMICILIO = ?, ";
        values.add(this.getSwiDomicilio());
        fields += " SWI_NOM_PLAZA = ?, ";
        values.add(this.getSwiNomPlaza());
        fields += " SWI_CLAVE = ?, ";
        values.add(this.getSwiClave());
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
        String sql = "INSERT INTO DETSWIFT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DEL_FOLIO_OPERA";
        fieldValues += ", ?";
        values.add(this.getDelFolioOpera());

        fields += ", SWI_BRANCH";
        fieldValues += ", ?";
        values.add(this.getSwiBranch());

        fields += ", SWI_DOMICILIO";
        fieldValues += ", ?";
        values.add(this.getSwiDomicilio());

        fields += ", SWI_NOM_PLAZA";
        fieldValues += ", ?";
        values.add(this.getSwiNomPlaza());

        fields += ", SWI_CLAVE";
        fieldValues += ", ?";
        values.add(this.getSwiClave());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DETSWIFT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DEL_FOLIO_OPERA = ?";
        values.add(this.getDelFolioOpera());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Detswift instance = (Detswift) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDelFolioOpera().equals(instance.getDelFolioOpera()))
            equalObjects = false;
        if (equalObjects && !this.getSwiBranch().equals(instance.getSwiBranch()))
            equalObjects = false;
        if (equalObjects && !this.getSwiDomicilio().equals(instance.getSwiDomicilio()))
            equalObjects = false;
        if (equalObjects && !this.getSwiNomPlaza().equals(instance.getSwiNomPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getSwiClave().equals(instance.getSwiClave()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Detswift result = new Detswift();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDelFolioOpera((BigDecimal) objectData.getData("DEL_FOLIO_OPERA"));
        result.setSwiBranch((String) objectData.getData("SWI_BRANCH"));
        result.setSwiDomicilio((String) objectData.getData("SWI_DOMICILIO"));
        result.setSwiNomPlaza((String) objectData.getData("SWI_NOM_PLAZA"));
        result.setSwiClave((String) objectData.getData("SWI_CLAVE"));

        return result;

    }

}
