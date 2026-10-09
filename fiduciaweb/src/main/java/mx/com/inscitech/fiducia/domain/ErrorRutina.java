package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ERROR_RUTINA_PK", columns = { "ERR_ID_ERROR" }, sequences = { "MAX" })
public class ErrorRutina extends DomainObject {

    BigDecimal errIdError = null;
    BigDecimal errFolioError = null;
    BigDecimal errTipoClave = null;
    String errModuloRutina = null;
    String errNombreRutina = null;
    String errOraError = null;
    String errOraDescrip = null;
    String errFecha = null;

    public ErrorRutina() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setErrIdError(BigDecimal errIdError) {
        this.errIdError = errIdError;
    }

    public BigDecimal getErrIdError() {
        return this.errIdError;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setErrFolioError(BigDecimal errFolioError) {
        this.errFolioError = errFolioError;
    }

    public BigDecimal getErrFolioError() {
        return this.errFolioError;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setErrTipoClave(BigDecimal errTipoClave) {
        this.errTipoClave = errTipoClave;
    }

    public BigDecimal getErrTipoClave() {
        return this.errTipoClave;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErrModuloRutina(String errModuloRutina) {
        this.errModuloRutina = errModuloRutina;
    }

    public String getErrModuloRutina() {
        return this.errModuloRutina;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErrNombreRutina(String errNombreRutina) {
        this.errNombreRutina = errNombreRutina;
    }

    public String getErrNombreRutina() {
        return this.errNombreRutina;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErrOraError(String errOraError) {
        this.errOraError = errOraError;
    }

    public String getErrOraError() {
        return this.errOraError;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErrOraDescrip(String errOraDescrip) {
        this.errOraDescrip = errOraDescrip;
    }

    public String getErrOraDescrip() {
        return this.errOraDescrip;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setErrFecha(String errFecha) {
        this.errFecha = errFecha;
    }

    public String getErrFecha() {
        return this.errFecha;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ERROR_RUTINA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getErrIdError() != null && this.getErrIdError().longValue() == -999) {
            conditions += " AND ERR_ID_ERROR IS NULL";
        } else if (this.getErrIdError() != null) {
            conditions += " AND ERR_ID_ERROR = ?";
            values.add(this.getErrIdError());
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
        String sql = "SELECT * FROM ERROR_RUTINA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getErrIdError() != null && this.getErrIdError().longValue() == -999) {
            conditions += " AND ERR_ID_ERROR IS NULL";
        } else if (this.getErrIdError() != null) {
            conditions += " AND ERR_ID_ERROR = ?";
            values.add(this.getErrIdError());
        }

        if (this.getErrFolioError() != null && this.getErrFolioError().longValue() == -999) {
            conditions += " AND ERR_FOLIO_ERROR IS NULL";
        } else if (this.getErrFolioError() != null) {
            conditions += " AND ERR_FOLIO_ERROR = ?";
            values.add(this.getErrFolioError());
        }

        if (this.getErrTipoClave() != null && this.getErrTipoClave().longValue() == -999) {
            conditions += " AND ERR_TIPO_CLAVE IS NULL";
        } else if (this.getErrTipoClave() != null) {
            conditions += " AND ERR_TIPO_CLAVE = ?";
            values.add(this.getErrTipoClave());
        }

        if (this.getErrModuloRutina() != null && "null".equals(this.getErrModuloRutina())) {
            conditions += " AND ERR_MODULO_RUTINA IS NULL";
        } else if (this.getErrModuloRutina() != null) {
            conditions += " AND ERR_MODULO_RUTINA = ?";
            values.add(this.getErrModuloRutina());
        }

        if (this.getErrNombreRutina() != null && "null".equals(this.getErrNombreRutina())) {
            conditions += " AND ERR_NOMBRE_RUTINA IS NULL";
        } else if (this.getErrNombreRutina() != null) {
            conditions += " AND ERR_NOMBRE_RUTINA = ?";
            values.add(this.getErrNombreRutina());
        }

        if (this.getErrOraError() != null && "null".equals(this.getErrOraError())) {
            conditions += " AND ERR_ORA_ERROR IS NULL";
        } else if (this.getErrOraError() != null) {
            conditions += " AND ERR_ORA_ERROR = ?";
            values.add(this.getErrOraError());
        }

        if (this.getErrOraDescrip() != null && "null".equals(this.getErrOraDescrip())) {
            conditions += " AND ERR_ORA_DESCRIP IS NULL";
        } else if (this.getErrOraDescrip() != null) {
            conditions += " AND ERR_ORA_DESCRIP = ?";
            values.add(this.getErrOraDescrip());
        }

        if (this.getErrFecha() != null && "null".equals(this.getErrFecha())) {
            conditions += " AND ERR_FECHA IS NULL";
        } else if (this.getErrFecha() != null) {
            conditions += " AND ERR_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getErrFecha());
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
        String sql = "UPDATE ERROR_RUTINA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ERR_ID_ERROR = ?";
        pkValues.add(this.getErrIdError());
        fields += " ERR_FOLIO_ERROR = ?, ";
        values.add(this.getErrFolioError());
        fields += " ERR_TIPO_CLAVE = ?, ";
        values.add(this.getErrTipoClave());
        fields += " ERR_MODULO_RUTINA = ?, ";
        values.add(this.getErrModuloRutina());
        fields += " ERR_NOMBRE_RUTINA = ?, ";
        values.add(this.getErrNombreRutina());
        fields += " ERR_ORA_ERROR = ?, ";
        values.add(this.getErrOraError());
        fields += " ERR_ORA_DESCRIP = ?, ";
        values.add(this.getErrOraDescrip());
        fields += " ERR_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getErrFecha());
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
        String sql = "INSERT INTO ERROR_RUTINA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ERR_ID_ERROR";
        fieldValues += ", ?";
        values.add(this.getErrIdError());

        fields += ", ERR_FOLIO_ERROR";
        fieldValues += ", ?";
        values.add(this.getErrFolioError());

        fields += ", ERR_TIPO_CLAVE";
        fieldValues += ", ?";
        values.add(this.getErrTipoClave());

        fields += ", ERR_MODULO_RUTINA";
        fieldValues += ", ?";
        values.add(this.getErrModuloRutina());

        fields += ", ERR_NOMBRE_RUTINA";
        fieldValues += ", ?";
        values.add(this.getErrNombreRutina());

        fields += ", ERR_ORA_ERROR";
        fieldValues += ", ?";
        values.add(this.getErrOraError());

        fields += ", ERR_ORA_DESCRIP";
        fieldValues += ", ?";
        values.add(this.getErrOraDescrip());

        fields += ", ERR_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getErrFecha());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ERROR_RUTINA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ERR_ID_ERROR = ?";
        values.add(this.getErrIdError());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ErrorRutina instance = (ErrorRutina) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getErrIdError().equals(instance.getErrIdError()))
            equalObjects = false;
        if (equalObjects && !this.getErrFolioError().equals(instance.getErrFolioError()))
            equalObjects = false;
        if (equalObjects && !this.getErrTipoClave().equals(instance.getErrTipoClave()))
            equalObjects = false;
        if (equalObjects && !this.getErrModuloRutina().equals(instance.getErrModuloRutina()))
            equalObjects = false;
        if (equalObjects && !this.getErrNombreRutina().equals(instance.getErrNombreRutina()))
            equalObjects = false;
        if (equalObjects && !this.getErrOraError().equals(instance.getErrOraError()))
            equalObjects = false;
        if (equalObjects && !this.getErrOraDescrip().equals(instance.getErrOraDescrip()))
            equalObjects = false;
        if (equalObjects && !this.getErrFecha().equals(instance.getErrFecha()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ErrorRutina result = new ErrorRutina();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setErrIdError((BigDecimal) objectData.getData("ERR_ID_ERROR"));
        result.setErrFolioError((BigDecimal) objectData.getData("ERR_FOLIO_ERROR"));
        result.setErrTipoClave((BigDecimal) objectData.getData("ERR_TIPO_CLAVE"));
        result.setErrModuloRutina((String) objectData.getData("ERR_MODULO_RUTINA"));
        result.setErrNombreRutina((String) objectData.getData("ERR_NOMBRE_RUTINA"));
        result.setErrOraError((String) objectData.getData("ERR_ORA_ERROR"));
        result.setErrOraDescrip((String) objectData.getData("ERR_ORA_DESCRIP"));
        result.setErrFecha((String) objectData.getData("ERR_FECHA"));

        return result;

    }

}
