package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_HPASSWORD_PK", columns = { "USU_NUM_USUARIO", "USU_SEC_PASSWORD" }, sequences = { "MANUAL" })
public class FHpassword extends DomainObject {

    BigDecimal usuNumUsuario = null;
    BigDecimal usuSecPassword = null;
    String usuPassword = null;
    String usuFecCambio = null;

    public FHpassword() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumUsuario(BigDecimal usuNumUsuario) {
        this.usuNumUsuario = usuNumUsuario;
    }

    public BigDecimal getUsuNumUsuario() {
        return this.usuNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuSecPassword(BigDecimal usuSecPassword) {
        this.usuSecPassword = usuSecPassword;
    }

    public BigDecimal getUsuSecPassword() {
        return this.usuSecPassword;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }

    public String getUsuPassword() {
        return this.usuPassword;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setUsuFecCambio(String usuFecCambio) {
        this.usuFecCambio = usuFecCambio;
    }

    public String getUsuFecCambio() {
        return this.usuFecCambio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_HPASSWORD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
            conditions += " AND USU_NUM_USUARIO IS NULL";
        } else if (this.getUsuNumUsuario() != null) {
            conditions += " AND USU_NUM_USUARIO = ?";
            values.add(this.getUsuNumUsuario());
        }

        if (this.getUsuSecPassword() != null && this.getUsuSecPassword().longValue() == -999) {
            conditions += " AND USU_SEC_PASSWORD IS NULL";
        } else if (this.getUsuSecPassword() != null) {
            conditions += " AND USU_SEC_PASSWORD = ?";
            values.add(this.getUsuSecPassword());
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
        String sql = "SELECT * FROM F_HPASSWORD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
            conditions += " AND USU_NUM_USUARIO IS NULL";
        } else if (this.getUsuNumUsuario() != null) {
            conditions += " AND USU_NUM_USUARIO = ?";
            values.add(this.getUsuNumUsuario());
        }

        if (this.getUsuSecPassword() != null && this.getUsuSecPassword().longValue() == -999) {
            conditions += " AND USU_SEC_PASSWORD IS NULL";
        } else if (this.getUsuSecPassword() != null) {
            conditions += " AND USU_SEC_PASSWORD = ?";
            values.add(this.getUsuSecPassword());
        }

        if (this.getUsuPassword() != null && "null".equals(this.getUsuPassword())) {
            conditions += " AND USU_PASSWORD IS NULL";
        } else if (this.getUsuPassword() != null) {
            conditions += " AND USU_PASSWORD = ?";
            values.add(this.getUsuPassword());
        }

        if (this.getUsuFecCambio() != null && "null".equals(this.getUsuFecCambio())) {
            conditions += " AND USU_FEC_CAMBIO IS NULL";
        } else if (this.getUsuFecCambio() != null) {
            conditions += " AND USU_FEC_CAMBIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getUsuFecCambio());
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
        String sql = "UPDATE F_HPASSWORD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND USU_NUM_USUARIO = ?";
        pkValues.add(this.getUsuNumUsuario());
        conditions += " AND USU_SEC_PASSWORD = ?";
        pkValues.add(this.getUsuSecPassword());
        fields += " USU_PASSWORD = ?, ";
        values.add(this.getUsuPassword());
        fields += " USU_FEC_CAMBIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getUsuFecCambio());
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
        String sql = "INSERT INTO F_HPASSWORD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", USU_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getUsuNumUsuario());

        fields += ", USU_SEC_PASSWORD";
        fieldValues += ", ?";
        values.add(this.getUsuSecPassword());

        fields += ", USU_PASSWORD";
        fieldValues += ", ?";
        values.add(this.getUsuPassword());

        fields += ", USU_FEC_CAMBIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getUsuFecCambio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_HPASSWORD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND USU_NUM_USUARIO = ?";
        values.add(this.getUsuNumUsuario());
        conditions += " AND USU_SEC_PASSWORD = ?";
        values.add(this.getUsuSecPassword());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FHpassword instance = (FHpassword) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getUsuNumUsuario().equals(instance.getUsuNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getUsuSecPassword().equals(instance.getUsuSecPassword()))
            equalObjects = false;
        if (equalObjects && !this.getUsuPassword().equals(instance.getUsuPassword()))
            equalObjects = false;
        if (equalObjects && !this.getUsuFecCambio().equals(instance.getUsuFecCambio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FHpassword result = new FHpassword();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setUsuNumUsuario((BigDecimal) objectData.getData("USU_NUM_USUARIO"));
        result.setUsuSecPassword((BigDecimal) objectData.getData("USU_SEC_PASSWORD"));
        result.setUsuPassword((String) objectData.getData("USU_PASSWORD"));
        result.setUsuFecCambio((String) objectData.getData("USU_FEC_CAMBIO"));

        return result;

    }

}
