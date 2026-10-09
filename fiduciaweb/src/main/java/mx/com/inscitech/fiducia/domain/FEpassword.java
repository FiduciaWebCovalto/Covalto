package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EPASSWORD_PK", columns = { "USU_NUM_USUARIO", "USU_FEC_ERROR" }, sequences = { "MANUAL" })
public class FEpassword extends DomainObject {

    BigDecimal usuNumUsuario = null;
    String usuFecError = null;
    BigDecimal usuNumError = null;

    public FEpassword() {
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

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setUsuFecError(String usuFecError) {
        this.usuFecError = usuFecError;
    }

    public String getUsuFecError() {
        return this.usuFecError;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setUsuNumError(BigDecimal usuNumError) {
        this.usuNumError = usuNumError;
    }

    public BigDecimal getUsuNumError() {
        return this.usuNumError;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EPASSWORD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
            conditions += " AND USU_NUM_USUARIO IS NULL";
        } else if (this.getUsuNumUsuario() != null) {
            conditions += " AND USU_NUM_USUARIO = ?";
            values.add(this.getUsuNumUsuario());
        }

        if (this.getUsuFecError() != null && "null".equals(this.getUsuFecError())) {
            conditions += " AND USU_FEC_ERROR IS NULL";
        } else if (this.getUsuFecError() != null) {
            conditions += " AND USU_FEC_ERROR = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getUsuFecError());
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
        String sql = "SELECT * FROM F_EPASSWORD ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getUsuNumUsuario() != null && this.getUsuNumUsuario().longValue() == -999) {
            conditions += " AND USU_NUM_USUARIO IS NULL";
        } else if (this.getUsuNumUsuario() != null) {
            conditions += " AND USU_NUM_USUARIO = ?";
            values.add(this.getUsuNumUsuario());
        }

        if (this.getUsuFecError() != null && "null".equals(this.getUsuFecError())) {
            conditions += " AND USU_FEC_ERROR IS NULL";
        } else if (this.getUsuFecError() != null) {
            conditions += " AND USU_FEC_ERROR = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getUsuFecError());
        }

        if (this.getUsuNumError() != null && this.getUsuNumError().longValue() == -999) {
            conditions += " AND USU_NUM_ERROR IS NULL";
        } else if (this.getUsuNumError() != null) {
            conditions += " AND USU_NUM_ERROR = ?";
            values.add(this.getUsuNumError());
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
        String sql = "UPDATE F_EPASSWORD SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND USU_NUM_USUARIO = ?";
        pkValues.add(this.getUsuNumUsuario());
        conditions += " AND USU_FEC_ERROR = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getUsuFecError());
        fields += " USU_NUM_ERROR = ?, ";
        values.add(this.getUsuNumError());
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
        String sql = "INSERT INTO F_EPASSWORD ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", USU_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getUsuNumUsuario());

        fields += ", USU_FEC_ERROR";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getUsuFecError());

        fields += ", USU_NUM_ERROR";
        fieldValues += ", ?";
        values.add(this.getUsuNumError());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EPASSWORD WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND USU_NUM_USUARIO = ?";
        values.add(this.getUsuNumUsuario());
        conditions += " AND USU_FEC_ERROR = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getUsuFecError());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEpassword instance = (FEpassword) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getUsuNumUsuario().equals(instance.getUsuNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getUsuFecError().equals(instance.getUsuFecError()))
            equalObjects = false;
        if (equalObjects && !this.getUsuNumError().equals(instance.getUsuNumError()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEpassword result = new FEpassword();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setUsuNumUsuario((BigDecimal) objectData.getData("USU_NUM_USUARIO"));
        result.setUsuFecError((String) objectData.getData("USU_FEC_ERROR"));
        result.setUsuNumError((BigDecimal) objectData.getData("USU_NUM_ERROR"));

        return result;

    }

}
