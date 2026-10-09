package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_INTERNA_PREOCUPANTE_PK", columns = { "FIP_ID_FOLIO" }, sequences = { "MAX" })
public class FInternaPreocupante extends DomainObject {

    BigDecimal fipIdFolio = null;
    BigDecimal fipEjecutivo = null;
    String fipComentario = null;
    String fipCveStatus = null;

    public FInternaPreocupante() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFipIdFolio(BigDecimal fipIdFolio) {
        this.fipIdFolio = fipIdFolio;
    }

    public BigDecimal getFipIdFolio() {
        return this.fipIdFolio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFipEjecutivo(BigDecimal fipEjecutivo) {
        this.fipEjecutivo = fipEjecutivo;
    }

    public BigDecimal getFipEjecutivo() {
        return this.fipEjecutivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFipComentario(String fipComentario) {
        this.fipComentario = fipComentario;
    }

    public String getFipComentario() {
        return this.fipComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFipCveStatus(String fipCveStatus) {
        this.fipCveStatus = fipCveStatus;
    }

    public String getFipCveStatus() {
        return this.fipCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_INTERNA_PREOCUPANTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFipIdFolio() != null && this.getFipIdFolio().longValue() == -999) {
            conditions += " AND FIP_ID_FOLIO IS NULL";
        } else if (this.getFipIdFolio() != null) {
            conditions += " AND FIP_ID_FOLIO = ?";
            values.add(this.getFipIdFolio());
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
        String sql = "SELECT * FROM F_INTERNA_PREOCUPANTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFipIdFolio() != null && this.getFipIdFolio().longValue() == -999) {
            conditions += " AND FIP_ID_FOLIO IS NULL";
        } else if (this.getFipIdFolio() != null) {
            conditions += " AND FIP_ID_FOLIO = ?";
            values.add(this.getFipIdFolio());
        }

        if (this.getFipEjecutivo() != null && this.getFipEjecutivo().longValue() == -999) {
            conditions += " AND FIP_EJECUTIVO IS NULL";
        } else if (this.getFipEjecutivo() != null) {
            conditions += " AND FIP_EJECUTIVO = ?";
            values.add(this.getFipEjecutivo());
        }

        if (this.getFipComentario() != null && "null".equals(this.getFipComentario())) {
            conditions += " AND FIP_COMENTARIO IS NULL";
        } else if (this.getFipComentario() != null) {
            conditions += " AND FIP_COMENTARIO = ?";
            values.add(this.getFipComentario());
        }

        if (this.getFipCveStatus() != null && "null".equals(this.getFipCveStatus())) {
            conditions += " AND FIP_CVE_STATUS IS NULL";
        } else if (this.getFipCveStatus() != null) {
            conditions += " AND FIP_CVE_STATUS = ?";
            values.add(this.getFipCveStatus());
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
        String sql = "UPDATE F_INTERNA_PREOCUPANTE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FIP_ID_FOLIO = ?";
        pkValues.add(this.getFipIdFolio());
        fields += " FIP_EJECUTIVO = ?, ";
        values.add(this.getFipEjecutivo());
        fields += " FIP_COMENTARIO = ?, ";
        values.add(this.getFipComentario());
        fields += " FIP_CVE_STATUS = ?, ";
        values.add(this.getFipCveStatus());
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
        String sql = "INSERT INTO F_INTERNA_PREOCUPANTE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FIP_ID_FOLIO";
        fieldValues += ", ?";
        values.add(this.getFipIdFolio());

        fields += ", FIP_EJECUTIVO";
        fieldValues += ", ?";
        values.add(this.getFipEjecutivo());

        fields += ", FIP_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFipComentario());

        fields += ", FIP_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getFipCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_INTERNA_PREOCUPANTE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FIP_ID_FOLIO = ?";
        values.add(this.getFipIdFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FInternaPreocupante instance = (FInternaPreocupante) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFipIdFolio().equals(instance.getFipIdFolio()))
            equalObjects = false;
        if (equalObjects && !this.getFipEjecutivo().equals(instance.getFipEjecutivo()))
            equalObjects = false;
        if (equalObjects && !this.getFipComentario().equals(instance.getFipComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFipCveStatus().equals(instance.getFipCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FInternaPreocupante result = new FInternaPreocupante();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFipIdFolio((BigDecimal) objectData.getData("FIP_ID_FOLIO"));
        result.setFipEjecutivo((BigDecimal) objectData.getData("FIP_EJECUTIVO"));
        result.setFipComentario((String) objectData.getData("FIP_COMENTARIO"));
        result.setFipCveStatus((String) objectData.getData("FIP_CVE_STATUS"));

        return result;

    }

}
