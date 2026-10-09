package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OBL_FID_PK", columns = { "CRF_NUM_FIDEICOM", "OBF_CVE_OBLIGFISC", "OBL_TIPO_IMP" }, sequences = { "MANUAL" })
public class OblFid extends DomainObject {

    BigDecimal crfNumFideicom = null;
    String obfCveObligfisc = null;
    String oblTipoImp = null;

    public OblFid() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCrfNumFideicom(BigDecimal crfNumFideicom) {
        this.crfNumFideicom = crfNumFideicom;
    }

    public BigDecimal getCrfNumFideicom() {
        return this.crfNumFideicom;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setObfCveObligfisc(String obfCveObligfisc) {
        this.obfCveObligfisc = obfCveObligfisc;
    }

    public String getObfCveObligfisc() {
        return this.obfCveObligfisc;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOblTipoImp(String oblTipoImp) {
        this.oblTipoImp = oblTipoImp;
    }

    public String getOblTipoImp() {
        return this.oblTipoImp;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OBL_FID ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCrfNumFideicom() != null && this.getCrfNumFideicom().longValue() == -999) {
            conditions += " AND CRF_NUM_FIDEICOM IS NULL";
        } else if (this.getCrfNumFideicom() != null) {
            conditions += " AND CRF_NUM_FIDEICOM = ?";
            values.add(this.getCrfNumFideicom());
        }

        if (this.getObfCveObligfisc() != null && "null".equals(this.getObfCveObligfisc())) {
            conditions += " AND OBF_CVE_OBLIGFISC IS NULL";
        } else if (this.getObfCveObligfisc() != null) {
            conditions += " AND OBF_CVE_OBLIGFISC = ?";
            values.add(this.getObfCveObligfisc());
        }

        if (this.getOblTipoImp() != null && "null".equals(this.getOblTipoImp())) {
            conditions += " AND OBL_TIPO_IMP IS NULL";
        } else if (this.getOblTipoImp() != null) {
            conditions += " AND OBL_TIPO_IMP = ?";
            values.add(this.getOblTipoImp());
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
        String sql = "SELECT * FROM OBL_FID ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCrfNumFideicom() != null && this.getCrfNumFideicom().longValue() == -999) {
            conditions += " AND CRF_NUM_FIDEICOM IS NULL";
        } else if (this.getCrfNumFideicom() != null) {
            conditions += " AND CRF_NUM_FIDEICOM = ?";
            values.add(this.getCrfNumFideicom());
        }

        if (this.getObfCveObligfisc() != null && "null".equals(this.getObfCveObligfisc())) {
            conditions += " AND OBF_CVE_OBLIGFISC IS NULL";
        } else if (this.getObfCveObligfisc() != null) {
            conditions += " AND OBF_CVE_OBLIGFISC = ?";
            values.add(this.getObfCveObligfisc());
        }

        if (this.getOblTipoImp() != null && "null".equals(this.getOblTipoImp())) {
            conditions += " AND OBL_TIPO_IMP IS NULL";
        } else if (this.getOblTipoImp() != null) {
            conditions += " AND OBL_TIPO_IMP = ?";
            values.add(this.getOblTipoImp());
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
        String sql = "UPDATE OBL_FID SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CRF_NUM_FIDEICOM = ?";
        pkValues.add(this.getCrfNumFideicom());
        conditions += " AND OBF_CVE_OBLIGFISC = ?";
        pkValues.add(this.getObfCveObligfisc());
        conditions += " AND OBL_TIPO_IMP = ?";
        pkValues.add(this.getOblTipoImp());
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
        String sql = "INSERT INTO OBL_FID ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CRF_NUM_FIDEICOM";
        fieldValues += ", ?";
        values.add(this.getCrfNumFideicom());

        fields += ", OBF_CVE_OBLIGFISC";
        fieldValues += ", ?";
        values.add(this.getObfCveObligfisc());

        fields += ", OBL_TIPO_IMP";
        fieldValues += ", ?";
        values.add(this.getOblTipoImp());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OBL_FID WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CRF_NUM_FIDEICOM = ?";
        values.add(this.getCrfNumFideicom());
        conditions += " AND OBF_CVE_OBLIGFISC = ?";
        values.add(this.getObfCveObligfisc());
        conditions += " AND OBL_TIPO_IMP = ?";
        values.add(this.getOblTipoImp());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        OblFid instance = (OblFid) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCrfNumFideicom().equals(instance.getCrfNumFideicom()))
            equalObjects = false;
        if (equalObjects && !this.getObfCveObligfisc().equals(instance.getObfCveObligfisc()))
            equalObjects = false;
        if (equalObjects && !this.getOblTipoImp().equals(instance.getOblTipoImp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        OblFid result = new OblFid();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCrfNumFideicom((BigDecimal) objectData.getData("CRF_NUM_FIDEICOM"));
        result.setObfCveObligfisc((String) objectData.getData("OBF_CVE_OBLIGFISC"));
        result.setOblTipoImp((String) objectData.getData("OBL_TIPO_IMP"));

        return result;

    }

}
