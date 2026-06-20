package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_AUTORIZA_INSTRUCC_PK", columns = { "F_AUI_ID_INSTRUCC", "F_AUI_ID_USUARIO", "F_AUI_SECUENCIAL" }, sequences = { "MANUAL" })
public class FAutorizaInstrucc extends DomainObject {

    BigDecimal fAuiIdInstrucc = null;
    BigDecimal fAuiSecuencial = null;
    String fAuiIdUsuario = null;

    public FAutorizaInstrucc() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFAuiIdInstrucc(BigDecimal fAuiIdInstrucc) {
        this.fAuiIdInstrucc = fAuiIdInstrucc;
    }

    public BigDecimal getFAuiIdInstrucc() {
        return this.fAuiIdInstrucc;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setFAuiSecuencial(BigDecimal fAuiSecuencial) {
        this.fAuiSecuencial = fAuiSecuencial;
    }

    public BigDecimal getFAuiSecuencial() {
        return this.fAuiSecuencial;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFAuiIdUsuario(String fAuiIdUsuario) {
        this.fAuiIdUsuario = fAuiIdUsuario;
    }

    public String getFAuiIdUsuario() {
        return this.fAuiIdUsuario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_AUTORIZA_INSTRUCC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFAuiIdInstrucc() != null && this.getFAuiIdInstrucc().longValue() == -999) {
            conditions += " AND F_AUI_ID_INSTRUCC IS NULL";
        } else if (this.getFAuiIdInstrucc() != null) {
            conditions += " AND F_AUI_ID_INSTRUCC = ?";
            values.add(this.getFAuiIdInstrucc());
        }

        if (this.getFAuiSecuencial() != null && this.getFAuiSecuencial().longValue() == -999) {
            conditions += " AND F_AUI_SECUENCIAL IS NULL";
        } else if (this.getFAuiSecuencial() != null) {
            conditions += " AND F_AUI_SECUENCIAL = ?";
            values.add(this.getFAuiSecuencial());
        }

        if (this.getFAuiIdUsuario() != null && "null".equals(this.getFAuiIdUsuario())) {
            conditions += " AND F_AUI_ID_USUARIO IS NULL";
        } else if (this.getFAuiIdUsuario() != null) {
            conditions += " AND F_AUI_ID_USUARIO = ?";
            values.add(this.getFAuiIdUsuario());
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
        String sql = "SELECT * FROM F_AUTORIZA_INSTRUCC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFAuiIdInstrucc() != null && this.getFAuiIdInstrucc().longValue() == -999) {
            conditions += " AND F_AUI_ID_INSTRUCC IS NULL";
        } else if (this.getFAuiIdInstrucc() != null) {
            conditions += " AND F_AUI_ID_INSTRUCC = ?";
            values.add(this.getFAuiIdInstrucc());
        }

        if (this.getFAuiSecuencial() != null && this.getFAuiSecuencial().longValue() == -999) {
            conditions += " AND F_AUI_SECUENCIAL IS NULL";
        } else if (this.getFAuiSecuencial() != null) {
            conditions += " AND F_AUI_SECUENCIAL = ?";
            values.add(this.getFAuiSecuencial());
        }

        if (this.getFAuiIdUsuario() != null && "null".equals(this.getFAuiIdUsuario())) {
            conditions += " AND F_AUI_ID_USUARIO IS NULL";
        } else if (this.getFAuiIdUsuario() != null) {
            conditions += " AND F_AUI_ID_USUARIO = ?";
            values.add(this.getFAuiIdUsuario());
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
        String sql = "UPDATE F_AUTORIZA_INSTRUCC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND F_AUI_ID_INSTRUCC = ?";
        pkValues.add(this.getFAuiIdInstrucc());
        conditions += " AND F_AUI_SECUENCIAL = ?";
        pkValues.add(this.getFAuiSecuencial());
        conditions += " AND F_AUI_ID_USUARIO = ?";
        pkValues.add(this.getFAuiIdUsuario());
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
        String sql = "INSERT INTO F_AUTORIZA_INSTRUCC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", F_AUI_ID_INSTRUCC";
        fieldValues += ", ?";
        values.add(this.getFAuiIdInstrucc());

        fields += ", F_AUI_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getFAuiSecuencial());

        fields += ", F_AUI_ID_USUARIO";
        fieldValues += ", ?";
        values.add(this.getFAuiIdUsuario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_AUTORIZA_INSTRUCC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND F_AUI_ID_INSTRUCC = ?";
        values.add(this.getFAuiIdInstrucc());
        conditions += " AND F_AUI_SECUENCIAL = ?";
        values.add(this.getFAuiSecuencial());
        conditions += " AND F_AUI_ID_USUARIO = ?";
        values.add(this.getFAuiIdUsuario());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAutorizaInstrucc instance = (FAutorizaInstrucc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFAuiIdInstrucc().equals(instance.getFAuiIdInstrucc()))
            equalObjects = false;
        if (equalObjects && !this.getFAuiSecuencial().equals(instance.getFAuiSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getFAuiIdUsuario().equals(instance.getFAuiIdUsuario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAutorizaInstrucc result = new FAutorizaInstrucc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFAuiIdInstrucc((BigDecimal) objectData.getData("F_AUI_ID_INSTRUCC"));
        result.setFAuiSecuencial((BigDecimal) objectData.getData("F_AUI_SECUENCIAL"));
        result.setFAuiIdUsuario((String) objectData.getData("F_AUI_ID_USUARIO"));

        return result;

    }

}
