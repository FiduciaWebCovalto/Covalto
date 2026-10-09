package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class CfeMEncabezadoRespFallida extends DomainObject {

    BigDecimal idoperacionCenI = null;
    BigDecimal idsistemaCenI = null;
    BigDecimal statusCenI = null;
    String errorCenS = null;
    String historiaCenS = null;
    String horaError = null;
    String errorOracle = null;

    public CfeMEncabezadoRespFallida() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 13, scale = 0, javaClass = BigDecimal.class)
    public void setIdoperacionCenI(BigDecimal idoperacionCenI) {
        this.idoperacionCenI = idoperacionCenI;
    }

    public BigDecimal getIdoperacionCenI() {
        return this.idoperacionCenI;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 0, javaClass = BigDecimal.class)
    public void setIdsistemaCenI(BigDecimal idsistemaCenI) {
        this.idsistemaCenI = idsistemaCenI;
    }

    public BigDecimal getIdsistemaCenI() {
        return this.idsistemaCenI;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 9, scale = 0, javaClass = BigDecimal.class)
    public void setStatusCenI(BigDecimal statusCenI) {
        this.statusCenI = statusCenI;
    }

    public BigDecimal getStatusCenI() {
        return this.statusCenI;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErrorCenS(String errorCenS) {
        this.errorCenS = errorCenS;
    }

    public String getErrorCenS() {
        return this.errorCenS;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setHistoriaCenS(String historiaCenS) {
        this.historiaCenS = historiaCenS;
    }

    public String getHistoriaCenS() {
        return this.historiaCenS;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setHoraError(String horaError) {
        this.horaError = horaError;
    }

    public String getHoraError() {
        return this.horaError;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErrorOracle(String errorOracle) {
        this.errorOracle = errorOracle;
    }

    public String getErrorOracle() {
        return this.errorOracle;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CFE_M_ENCABEZADO_RESP_FALLIDA ";

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
        String sql = "SELECT * FROM CFE_M_ENCABEZADO_RESP_FALLIDA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getIdoperacionCenI() != null && this.getIdoperacionCenI().longValue() == -999) {
            conditions += " AND IDOPERACION_CEN_I IS NULL";
        } else if (this.getIdoperacionCenI() != null) {
            conditions += " AND IDOPERACION_CEN_I = ?";
            values.add(this.getIdoperacionCenI());
        }

        if (this.getIdsistemaCenI() != null && this.getIdsistemaCenI().longValue() == -999) {
            conditions += " AND IDSISTEMA_CEN_I IS NULL";
        } else if (this.getIdsistemaCenI() != null) {
            conditions += " AND IDSISTEMA_CEN_I = ?";
            values.add(this.getIdsistemaCenI());
        }

        if (this.getStatusCenI() != null && this.getStatusCenI().longValue() == -999) {
            conditions += " AND STATUS_CEN_I IS NULL";
        } else if (this.getStatusCenI() != null) {
            conditions += " AND STATUS_CEN_I = ?";
            values.add(this.getStatusCenI());
        }

        if (this.getErrorCenS() != null && "null".equals(this.getErrorCenS())) {
            conditions += " AND ERROR_CEN_S IS NULL";
        } else if (this.getErrorCenS() != null) {
            conditions += " AND ERROR_CEN_S = ?";
            values.add(this.getErrorCenS());
        }

        if (this.getHistoriaCenS() != null && "null".equals(this.getHistoriaCenS())) {
            conditions += " AND HISTORIA_CEN_S IS NULL";
        } else if (this.getHistoriaCenS() != null) {
            conditions += " AND HISTORIA_CEN_S = ?";
            values.add(this.getHistoriaCenS());
        }

        if (this.getHoraError() != null && "null".equals(this.getHoraError())) {
            conditions += " AND HORA_ERROR IS NULL";
        } else if (this.getHoraError() != null) {
            conditions += " AND HORA_ERROR = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getHoraError());
        }

        if (this.getErrorOracle() != null && "null".equals(this.getErrorOracle())) {
            conditions += " AND ERROR_ORACLE IS NULL";
        } else if (this.getErrorOracle() != null) {
            conditions += " AND ERROR_ORACLE = ?";
            values.add(this.getErrorOracle());
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
        String sql = "UPDATE CFE_M_ENCABEZADO_RESP_FALLIDA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " IDOPERACION_CEN_I = ?, ";
        values.add(this.getIdoperacionCenI());
        fields += " IDSISTEMA_CEN_I = ?, ";
        values.add(this.getIdsistemaCenI());
        fields += " STATUS_CEN_I = ?, ";
        values.add(this.getStatusCenI());
        fields += " ERROR_CEN_S = ?, ";
        values.add(this.getErrorCenS());
        fields += " HISTORIA_CEN_S = ?, ";
        values.add(this.getHistoriaCenS());
        fields += " HORA_ERROR = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getHoraError());
        fields += " ERROR_ORACLE = ?, ";
        values.add(this.getErrorOracle());
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
        String sql = "INSERT INTO CFE_M_ENCABEZADO_RESP_FALLIDA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", IDOPERACION_CEN_I";
        fieldValues += ", ?";
        values.add(this.getIdoperacionCenI());

        fields += ", IDSISTEMA_CEN_I";
        fieldValues += ", ?";
        values.add(this.getIdsistemaCenI());

        fields += ", STATUS_CEN_I";
        fieldValues += ", ?";
        values.add(this.getStatusCenI());

        fields += ", ERROR_CEN_S";
        fieldValues += ", ?";
        values.add(this.getErrorCenS());

        fields += ", HISTORIA_CEN_S";
        fieldValues += ", ?";
        values.add(this.getHistoriaCenS());

        fields += ", HORA_ERROR";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getHoraError());

        fields += ", ERROR_ORACLE";
        fieldValues += ", ?";
        values.add(this.getErrorOracle());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CFE_M_ENCABEZADO_RESP_FALLIDA WHERE ";

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
        CfeMEncabezadoRespFallida instance = (CfeMEncabezadoRespFallida) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getIdoperacionCenI().equals(instance.getIdoperacionCenI()))
            equalObjects = false;
        if (equalObjects && !this.getIdsistemaCenI().equals(instance.getIdsistemaCenI()))
            equalObjects = false;
        if (equalObjects && !this.getStatusCenI().equals(instance.getStatusCenI()))
            equalObjects = false;
        if (equalObjects && !this.getErrorCenS().equals(instance.getErrorCenS()))
            equalObjects = false;
        if (equalObjects && !this.getHistoriaCenS().equals(instance.getHistoriaCenS()))
            equalObjects = false;
        if (equalObjects && !this.getHoraError().equals(instance.getHoraError()))
            equalObjects = false;
        if (equalObjects && !this.getErrorOracle().equals(instance.getErrorOracle()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        CfeMEncabezadoRespFallida result = new CfeMEncabezadoRespFallida();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setIdoperacionCenI((BigDecimal) objectData.getData("IDOPERACION_CEN_I"));
        result.setIdsistemaCenI((BigDecimal) objectData.getData("IDSISTEMA_CEN_I"));
        result.setStatusCenI((BigDecimal) objectData.getData("STATUS_CEN_I"));
        result.setErrorCenS((String) objectData.getData("ERROR_CEN_S"));
        result.setHistoriaCenS((String) objectData.getData("HISTORIA_CEN_S"));
        result.setHoraError((String) objectData.getData("HORA_ERROR"));
        result.setErrorOracle((String) objectData.getData("ERROR_ORACLE"));

        return result;

    }

}
