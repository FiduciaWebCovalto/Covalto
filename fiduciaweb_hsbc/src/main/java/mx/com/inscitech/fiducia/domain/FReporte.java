package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "SYS_C0016928", columns = { "FRCO_ID_REPORTE" }, sequences = { "MAX" })
public class FReporte extends DomainObject {

    BigDecimal frcoIdReporte = null;
    String frcoNombreReporte = null;
    String frcoStatus = null;
    BigDecimal frcoNumColumnas = null;

    public FReporte() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFrcoIdReporte(BigDecimal frcoIdReporte) {
        this.frcoIdReporte = frcoIdReporte;
    }

    public BigDecimal getFrcoIdReporte() {
        return this.frcoIdReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrcoNombreReporte(String frcoNombreReporte) {
        this.frcoNombreReporte = frcoNombreReporte;
    }

    public String getFrcoNombreReporte() {
        return this.frcoNombreReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFrcoStatus(String frcoStatus) {
        this.frcoStatus = frcoStatus;
    }

    public String getFrcoStatus() {
        return this.frcoStatus;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFrcoNumColumnas(BigDecimal frcoNumColumnas) {
        this.frcoNumColumnas = frcoNumColumnas;
    }

    public BigDecimal getFrcoNumColumnas() {
        return this.frcoNumColumnas;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REPORTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrcoIdReporte() != null && this.getFrcoIdReporte().longValue() == -999) {
            conditions += " AND FRCO_ID_REPORTE IS NULL";
        } else if (this.getFrcoIdReporte() != null) {
            conditions += " AND FRCO_ID_REPORTE = ?";
            values.add(this.getFrcoIdReporte());
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
        String sql = "SELECT * FROM F_REPORTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFrcoIdReporte() != null && this.getFrcoIdReporte().longValue() == -999) {
            conditions += " AND FRCO_ID_REPORTE IS NULL";
        } else if (this.getFrcoIdReporte() != null) {
            conditions += " AND FRCO_ID_REPORTE = ?";
            values.add(this.getFrcoIdReporte());
        }

        if (this.getFrcoNombreReporte() != null && "null".equals(this.getFrcoNombreReporte())) {
            conditions += " AND FRCO_NOMBRE_REPORTE IS NULL";
        } else if (this.getFrcoNombreReporte() != null) {
            conditions += " AND FRCO_NOMBRE_REPORTE = ?";
            values.add(this.getFrcoNombreReporte());
        }

        if (this.getFrcoStatus() != null && "null".equals(this.getFrcoStatus())) {
            conditions += " AND FRCO_STATUS IS NULL";
        } else if (this.getFrcoStatus() != null) {
            conditions += " AND FRCO_STATUS = ?";
            values.add(this.getFrcoStatus());
        }

        if (this.getFrcoNumColumnas() != null && this.getFrcoNumColumnas().longValue() == -999) {
            conditions += " AND FRCO_NUM_COLUMNAS IS NULL";
        } else if (this.getFrcoNumColumnas() != null) {
            conditions += " AND FRCO_NUM_COLUMNAS = ?";
            values.add(this.getFrcoNumColumnas());
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
        String sql = "UPDATE F_REPORTE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FRCO_ID_REPORTE = ?";
        pkValues.add(this.getFrcoIdReporte());
        fields += " FRCO_NOMBRE_REPORTE = ?, ";
        values.add(this.getFrcoNombreReporte());
        fields += " FRCO_STATUS = ?, ";
        values.add(this.getFrcoStatus());
        fields += " FRCO_NUM_COLUMNAS = ?, ";
        values.add(this.getFrcoNumColumnas());
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
        String sql = "INSERT INTO F_REPORTE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FRCO_ID_REPORTE";
        fieldValues += ", ?";
        values.add(this.getFrcoIdReporte());

        fields += ", FRCO_NOMBRE_REPORTE";
        fieldValues += ", ?";
        values.add(this.getFrcoNombreReporte());

        fields += ", FRCO_STATUS";
        fieldValues += ", ?";
        values.add(this.getFrcoStatus());

        fields += ", FRCO_NUM_COLUMNAS";
        fieldValues += ", ?";
        values.add(this.getFrcoNumColumnas());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REPORTE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FRCO_ID_REPORTE = ?";
        values.add(this.getFrcoIdReporte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FReporte instance = (FReporte) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFrcoIdReporte().equals(instance.getFrcoIdReporte()))
            equalObjects = false;
        if (equalObjects && !this.getFrcoNombreReporte().equals(instance.getFrcoNombreReporte()))
            equalObjects = false;
        if (equalObjects && !this.getFrcoStatus().equals(instance.getFrcoStatus()))
            equalObjects = false;
        if (equalObjects && !this.getFrcoNumColumnas().equals(instance.getFrcoNumColumnas()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FReporte result = new FReporte();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFrcoIdReporte((BigDecimal) objectData.getData("FRCO_ID_REPORTE"));
        result.setFrcoNombreReporte((String) objectData.getData("FRCO_NOMBRE_REPORTE"));
        result.setFrcoStatus((String) objectData.getData("FRCO_STATUS"));
        result.setFrcoNumColumnas((BigDecimal) objectData.getData("FRCO_NUM_COLUMNAS"));

        return result;

    }

}
