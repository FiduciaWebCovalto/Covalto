package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FRetMasivos extends DomainObject {

    BigDecimal frmaIdRetiro = null;
    String frmaIdCta = null;
    BigDecimal frmaImporte = null;
    String frmaStatus = null;

    public FRetMasivos() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrmaIdRetiro(BigDecimal frmaIdRetiro) {
        this.frmaIdRetiro = frmaIdRetiro;
    }

    public BigDecimal getFrmaIdRetiro() {
        return this.frmaIdRetiro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrmaIdCta(String frmaIdCta) {
        this.frmaIdCta = frmaIdCta;
    }

    public String getFrmaIdCta() {
        return this.frmaIdCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setFrmaImporte(BigDecimal frmaImporte) {
        this.frmaImporte = frmaImporte;
    }

    public BigDecimal getFrmaImporte() {
        return this.frmaImporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrmaStatus(String frmaStatus) {
        this.frmaStatus = frmaStatus;
    }

    public String getFrmaStatus() {
        return this.frmaStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_RET_MASIVOS ";

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
        String sql = "SELECT * FROM F_RET_MASIVOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrmaIdRetiro() != null && this.getFrmaIdRetiro().longValue() == -999) {
            conditions += " AND FRMA_ID_RETIRO IS NULL";
        } else if (this.getFrmaIdRetiro() != null) {
            conditions += " AND FRMA_ID_RETIRO = ?";
            values.add(this.getFrmaIdRetiro());
        }

        if (this.getFrmaIdCta() != null && "null".equals(this.getFrmaIdCta())) {
            conditions += " AND FRMA_ID_CTA IS NULL";
        } else if (this.getFrmaIdCta() != null) {
            conditions += " AND FRMA_ID_CTA = ?";
            values.add(this.getFrmaIdCta());
        }

        if (this.getFrmaImporte() != null && this.getFrmaImporte().longValue() == -999) {
            conditions += " AND FRMA_IMPORTE IS NULL";
        } else if (this.getFrmaImporte() != null) {
            conditions += " AND FRMA_IMPORTE = ?";
            values.add(this.getFrmaImporte());
        }

        if (this.getFrmaStatus() != null && "null".equals(this.getFrmaStatus())) {
            conditions += " AND FRMA_STATUS IS NULL";
        } else if (this.getFrmaStatus() != null) {
            conditions += " AND FRMA_STATUS = ?";
            values.add(this.getFrmaStatus());
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
        String sql = "UPDATE F_RET_MASIVOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FRMA_ID_RETIRO = ?, ";
        values.add(this.getFrmaIdRetiro());
        fields += " FRMA_ID_CTA = ?, ";
        values.add(this.getFrmaIdCta());
        fields += " FRMA_IMPORTE = ?, ";
        values.add(this.getFrmaImporte());
        fields += " FRMA_STATUS = ?, ";
        values.add(this.getFrmaStatus());
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
        String sql = "INSERT INTO F_RET_MASIVOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FRMA_ID_RETIRO";
        fieldValues += ", ?";
        values.add(this.getFrmaIdRetiro());

        fields += ", FRMA_ID_CTA";
        fieldValues += ", ?";
        values.add(this.getFrmaIdCta());

        fields += ", FRMA_IMPORTE";
        fieldValues += ", ?";
        values.add(this.getFrmaImporte());

        fields += ", FRMA_STATUS";
        fieldValues += ", ?";
        values.add(this.getFrmaStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_RET_MASIVOS WHERE ";

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
        FRetMasivos instance = (FRetMasivos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFrmaIdRetiro().equals(instance.getFrmaIdRetiro()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaIdCta().equals(instance.getFrmaIdCta()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaImporte().equals(instance.getFrmaImporte()))
            equalObjects = false;
        if (equalObjects && !this.getFrmaStatus().equals(instance.getFrmaStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRetMasivos result = new FRetMasivos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFrmaIdRetiro((BigDecimal) objectData.getData("FRMA_ID_RETIRO"));
        result.setFrmaIdCta((String) objectData.getData("FRMA_ID_CTA"));
        result.setFrmaImporte((BigDecimal) objectData.getData("FRMA_IMPORTE"));
        result.setFrmaStatus((String) objectData.getData("FRMA_STATUS"));

        return result;

    }

}
