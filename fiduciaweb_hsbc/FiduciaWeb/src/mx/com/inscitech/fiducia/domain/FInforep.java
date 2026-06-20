package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FInforep extends DomainObject {

    BigDecimal fInfIdReporte = null;
    BigDecimal fInfIdSecRep = null;
    BigDecimal fInfIdSec = null;
    String fInfRenglon = null;

    public FInforep() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFInfIdReporte(BigDecimal fInfIdReporte) {
        this.fInfIdReporte = fInfIdReporte;
    }

    public BigDecimal getFInfIdReporte() {
        return this.fInfIdReporte;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFInfIdSecRep(BigDecimal fInfIdSecRep) {
        this.fInfIdSecRep = fInfIdSecRep;
    }

    public BigDecimal getFInfIdSecRep() {
        return this.fInfIdSecRep;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFInfIdSec(BigDecimal fInfIdSec) {
        this.fInfIdSec = fInfIdSec;
    }

    public BigDecimal getFInfIdSec() {
        return this.fInfIdSec;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFInfRenglon(String fInfRenglon) {
        this.fInfRenglon = fInfRenglon;
    }

    public String getFInfRenglon() {
        return this.fInfRenglon;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_INFOREP ";

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
        String sql = "SELECT * FROM F_INFOREP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFInfIdReporte() != null && this.getFInfIdReporte().longValue() == -999) {
            conditions += " AND F_INF_ID_REPORTE IS NULL";
        } else if (this.getFInfIdReporte() != null) {
            conditions += " AND F_INF_ID_REPORTE = ?";
            values.add(this.getFInfIdReporte());
        }

        if (this.getFInfIdSecRep() != null && this.getFInfIdSecRep().longValue() == -999) {
            conditions += " AND F_INF_ID_SEC_REP IS NULL";
        } else if (this.getFInfIdSecRep() != null) {
            conditions += " AND F_INF_ID_SEC_REP = ?";
            values.add(this.getFInfIdSecRep());
        }

        if (this.getFInfIdSec() != null && this.getFInfIdSec().longValue() == -999) {
            conditions += " AND F_INF_ID_SEC IS NULL";
        } else if (this.getFInfIdSec() != null) {
            conditions += " AND F_INF_ID_SEC = ?";
            values.add(this.getFInfIdSec());
        }

        if (this.getFInfRenglon() != null && "null".equals(this.getFInfRenglon())) {
            conditions += " AND F_INF_RENGLON IS NULL";
        } else if (this.getFInfRenglon() != null) {
            conditions += " AND F_INF_RENGLON = ?";
            values.add(this.getFInfRenglon());
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
        String sql = "UPDATE F_INFOREP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " F_INF_ID_REPORTE = ?, ";
        values.add(this.getFInfIdReporte());
        fields += " F_INF_ID_SEC_REP = ?, ";
        values.add(this.getFInfIdSecRep());
        fields += " F_INF_ID_SEC = ?, ";
        values.add(this.getFInfIdSec());
        fields += " F_INF_RENGLON = ?, ";
        values.add(this.getFInfRenglon());
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
        String sql = "INSERT INTO F_INFOREP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", F_INF_ID_REPORTE";
        fieldValues += ", ?";
        values.add(this.getFInfIdReporte());

        fields += ", F_INF_ID_SEC_REP";
        fieldValues += ", ?";
        values.add(this.getFInfIdSecRep());

        fields += ", F_INF_ID_SEC";
        fieldValues += ", ?";
        values.add(this.getFInfIdSec());

        fields += ", F_INF_RENGLON";
        fieldValues += ", ?";
        values.add(this.getFInfRenglon());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_INFOREP WHERE ";

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
        FInforep instance = (FInforep) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFInfIdReporte().equals(instance.getFInfIdReporte()))
            equalObjects = false;
        if (equalObjects && !this.getFInfIdSecRep().equals(instance.getFInfIdSecRep()))
            equalObjects = false;
        if (equalObjects && !this.getFInfIdSec().equals(instance.getFInfIdSec()))
            equalObjects = false;
        if (equalObjects && !this.getFInfRenglon().equals(instance.getFInfRenglon()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FInforep result = new FInforep();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFInfIdReporte((BigDecimal) objectData.getData("F_INF_ID_REPORTE"));
        result.setFInfIdSecRep((BigDecimal) objectData.getData("F_INF_ID_SEC_REP"));
        result.setFInfIdSec((BigDecimal) objectData.getData("F_INF_ID_SEC"));
        result.setFInfRenglon((String) objectData.getData("F_INF_RENGLON"));

        return result;

    }

}
