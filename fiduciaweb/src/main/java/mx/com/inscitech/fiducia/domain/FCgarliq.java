package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CGARLIQ_PK", columns = { "GLIC_ID_FIDEICOMISO", "GLIC_ID_CREDITO", "GLIC_ID_TIPO_CREDITO", "GLIC_ID_DISPOSICION", "GLIC_ID_CONSTANCIA" },
            sequences = { "MANUAL" })
public class FCgarliq extends DomainObject {

    BigDecimal glicIdFideicomiso = null;
    String glicIdCredito = null;
    String glicIdTipoCredito = null;
    BigDecimal glicIdDisposicion = null;
    BigDecimal glicIdConstancia = null;
    BigDecimal glicImpCredito = null;
    BigDecimal glicImpGarliq = null;
    String glicFechaVigencia = null;
    String glicFecImpreConst = null;
    BigDecimal glicUsuarioConst = null;
    String glicCveStatus = null;

    public FCgarliq() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlicIdFideicomiso(BigDecimal glicIdFideicomiso) {
        this.glicIdFideicomiso = glicIdFideicomiso;
    }

    public BigDecimal getGlicIdFideicomiso() {
        return this.glicIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlicIdCredito(String glicIdCredito) {
        this.glicIdCredito = glicIdCredito;
    }

    public String getGlicIdCredito() {
        return this.glicIdCredito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlicIdTipoCredito(String glicIdTipoCredito) {
        this.glicIdTipoCredito = glicIdTipoCredito;
    }

    public String getGlicIdTipoCredito() {
        return this.glicIdTipoCredito;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlicIdDisposicion(BigDecimal glicIdDisposicion) {
        this.glicIdDisposicion = glicIdDisposicion;
    }

    public BigDecimal getGlicIdDisposicion() {
        return this.glicIdDisposicion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlicIdConstancia(BigDecimal glicIdConstancia) {
        this.glicIdConstancia = glicIdConstancia;
    }

    public BigDecimal getGlicIdConstancia() {
        return this.glicIdConstancia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGlicImpCredito(BigDecimal glicImpCredito) {
        this.glicImpCredito = glicImpCredito;
    }

    public BigDecimal getGlicImpCredito() {
        return this.glicImpCredito;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGlicImpGarliq(BigDecimal glicImpGarliq) {
        this.glicImpGarliq = glicImpGarliq;
    }

    public BigDecimal getGlicImpGarliq() {
        return this.glicImpGarliq;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setGlicFechaVigencia(String glicFechaVigencia) {
        this.glicFechaVigencia = glicFechaVigencia;
    }

    public String getGlicFechaVigencia() {
        return this.glicFechaVigencia;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setGlicFecImpreConst(String glicFecImpreConst) {
        this.glicFecImpreConst = glicFecImpreConst;
    }

    public String getGlicFecImpreConst() {
        return this.glicFecImpreConst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlicUsuarioConst(BigDecimal glicUsuarioConst) {
        this.glicUsuarioConst = glicUsuarioConst;
    }

    public BigDecimal getGlicUsuarioConst() {
        return this.glicUsuarioConst;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlicCveStatus(String glicCveStatus) {
        this.glicCveStatus = glicCveStatus;
    }

    public String getGlicCveStatus() {
        return this.glicCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CGARLIQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGlicIdFideicomiso() != null && this.getGlicIdFideicomiso().longValue() == -999) {
            conditions += " AND GLIC_ID_FIDEICOMISO IS NULL";
        } else if (this.getGlicIdFideicomiso() != null) {
            conditions += " AND GLIC_ID_FIDEICOMISO = ?";
            values.add(this.getGlicIdFideicomiso());
        }

        if (this.getGlicIdCredito() != null && "null".equals(this.getGlicIdCredito())) {
            conditions += " AND GLIC_ID_CREDITO IS NULL";
        } else if (this.getGlicIdCredito() != null) {
            conditions += " AND GLIC_ID_CREDITO = ?";
            values.add(this.getGlicIdCredito());
        }

        if (this.getGlicIdTipoCredito() != null && "null".equals(this.getGlicIdTipoCredito())) {
            conditions += " AND GLIC_ID_TIPO_CREDITO IS NULL";
        } else if (this.getGlicIdTipoCredito() != null) {
            conditions += " AND GLIC_ID_TIPO_CREDITO = ?";
            values.add(this.getGlicIdTipoCredito());
        }

        if (this.getGlicIdDisposicion() != null && this.getGlicIdDisposicion().longValue() == -999) {
            conditions += " AND GLIC_ID_DISPOSICION IS NULL";
        } else if (this.getGlicIdDisposicion() != null) {
            conditions += " AND GLIC_ID_DISPOSICION = ?";
            values.add(this.getGlicIdDisposicion());
        }

        if (this.getGlicIdConstancia() != null && this.getGlicIdConstancia().longValue() == -999) {
            conditions += " AND GLIC_ID_CONSTANCIA IS NULL";
        } else if (this.getGlicIdConstancia() != null) {
            conditions += " AND GLIC_ID_CONSTANCIA = ?";
            values.add(this.getGlicIdConstancia());
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
        String sql = "SELECT * FROM F_CGARLIQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGlicIdFideicomiso() != null && this.getGlicIdFideicomiso().longValue() == -999) {
            conditions += " AND GLIC_ID_FIDEICOMISO IS NULL";
        } else if (this.getGlicIdFideicomiso() != null) {
            conditions += " AND GLIC_ID_FIDEICOMISO = ?";
            values.add(this.getGlicIdFideicomiso());
        }

        if (this.getGlicIdCredito() != null && "null".equals(this.getGlicIdCredito())) {
            conditions += " AND GLIC_ID_CREDITO IS NULL";
        } else if (this.getGlicIdCredito() != null) {
            conditions += " AND GLIC_ID_CREDITO = ?";
            values.add(this.getGlicIdCredito());
        }

        if (this.getGlicIdTipoCredito() != null && "null".equals(this.getGlicIdTipoCredito())) {
            conditions += " AND GLIC_ID_TIPO_CREDITO IS NULL";
        } else if (this.getGlicIdTipoCredito() != null) {
            conditions += " AND GLIC_ID_TIPO_CREDITO = ?";
            values.add(this.getGlicIdTipoCredito());
        }

        if (this.getGlicIdDisposicion() != null && this.getGlicIdDisposicion().longValue() == -999) {
            conditions += " AND GLIC_ID_DISPOSICION IS NULL";
        } else if (this.getGlicIdDisposicion() != null) {
            conditions += " AND GLIC_ID_DISPOSICION = ?";
            values.add(this.getGlicIdDisposicion());
        }

        if (this.getGlicIdConstancia() != null && this.getGlicIdConstancia().longValue() == -999) {
            conditions += " AND GLIC_ID_CONSTANCIA IS NULL";
        } else if (this.getGlicIdConstancia() != null) {
            conditions += " AND GLIC_ID_CONSTANCIA = ?";
            values.add(this.getGlicIdConstancia());
        }

        if (this.getGlicImpCredito() != null && this.getGlicImpCredito().longValue() == -999) {
            conditions += " AND GLIC_IMP_CREDITO IS NULL";
        } else if (this.getGlicImpCredito() != null) {
            conditions += " AND GLIC_IMP_CREDITO = ?";
            values.add(this.getGlicImpCredito());
        }

        if (this.getGlicImpGarliq() != null && this.getGlicImpGarliq().longValue() == -999) {
            conditions += " AND GLIC_IMP_GARLIQ IS NULL";
        } else if (this.getGlicImpGarliq() != null) {
            conditions += " AND GLIC_IMP_GARLIQ = ?";
            values.add(this.getGlicImpGarliq());
        }

        if (this.getGlicFechaVigencia() != null && "null".equals(this.getGlicFechaVigencia())) {
            conditions += " AND GLIC_FECHA_VIGENCIA IS NULL";
        } else if (this.getGlicFechaVigencia() != null) {
            conditions += " AND GLIC_FECHA_VIGENCIA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getGlicFechaVigencia());
        }

        if (this.getGlicFecImpreConst() != null && "null".equals(this.getGlicFecImpreConst())) {
            conditions += " AND GLIC_FEC_IMPRE_CONST IS NULL";
        } else if (this.getGlicFecImpreConst() != null) {
            conditions += " AND GLIC_FEC_IMPRE_CONST = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getGlicFecImpreConst());
        }

        if (this.getGlicUsuarioConst() != null && this.getGlicUsuarioConst().longValue() == -999) {
            conditions += " AND GLIC_USUARIO_CONST IS NULL";
        } else if (this.getGlicUsuarioConst() != null) {
            conditions += " AND GLIC_USUARIO_CONST = ?";
            values.add(this.getGlicUsuarioConst());
        }

        if (this.getGlicCveStatus() != null && "null".equals(this.getGlicCveStatus())) {
            conditions += " AND GLIC_CVE_STATUS IS NULL";
        } else if (this.getGlicCveStatus() != null) {
            conditions += " AND GLIC_CVE_STATUS = ?";
            values.add(this.getGlicCveStatus());
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
        String sql = "UPDATE F_CGARLIQ SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GLIC_ID_FIDEICOMISO = ?";
        pkValues.add(this.getGlicIdFideicomiso());
        conditions += " AND GLIC_ID_CREDITO = ?";
        pkValues.add(this.getGlicIdCredito());
        conditions += " AND GLIC_ID_TIPO_CREDITO = ?";
        pkValues.add(this.getGlicIdTipoCredito());
        conditions += " AND GLIC_ID_DISPOSICION = ?";
        pkValues.add(this.getGlicIdDisposicion());
        conditions += " AND GLIC_ID_CONSTANCIA = ?";
        pkValues.add(this.getGlicIdConstancia());
        fields += " GLIC_IMP_CREDITO = ?, ";
        values.add(this.getGlicImpCredito());
        fields += " GLIC_IMP_GARLIQ = ?, ";
        values.add(this.getGlicImpGarliq());
        fields += " GLIC_FECHA_VIGENCIA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getGlicFechaVigencia());
        fields += " GLIC_FEC_IMPRE_CONST = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getGlicFecImpreConst());
        fields += " GLIC_USUARIO_CONST = ?, ";
        values.add(this.getGlicUsuarioConst());
        fields += " GLIC_CVE_STATUS = ?, ";
        values.add(this.getGlicCveStatus());
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
        String sql = "INSERT INTO F_CGARLIQ ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GLIC_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getGlicIdFideicomiso());

        fields += ", GLIC_ID_CREDITO";
        fieldValues += ", ?";
        values.add(this.getGlicIdCredito());

        fields += ", GLIC_ID_TIPO_CREDITO";
        fieldValues += ", ?";
        values.add(this.getGlicIdTipoCredito());

        fields += ", GLIC_ID_DISPOSICION";
        fieldValues += ", ?";
        values.add(this.getGlicIdDisposicion());

        fields += ", GLIC_ID_CONSTANCIA";
        fieldValues += ", ?";
        values.add(this.getGlicIdConstancia());

        fields += ", GLIC_IMP_CREDITO";
        fieldValues += ", ?";
        values.add(this.getGlicImpCredito());

        fields += ", GLIC_IMP_GARLIQ";
        fieldValues += ", ?";
        values.add(this.getGlicImpGarliq());

        fields += ", GLIC_FECHA_VIGENCIA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getGlicFechaVigencia());

        fields += ", GLIC_FEC_IMPRE_CONST";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getGlicFecImpreConst());

        fields += ", GLIC_USUARIO_CONST";
        fieldValues += ", ?";
        values.add(this.getGlicUsuarioConst());

        fields += ", GLIC_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getGlicCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CGARLIQ WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GLIC_ID_FIDEICOMISO = ?";
        values.add(this.getGlicIdFideicomiso());
        conditions += " AND GLIC_ID_CREDITO = ?";
        values.add(this.getGlicIdCredito());
        conditions += " AND GLIC_ID_TIPO_CREDITO = ?";
        values.add(this.getGlicIdTipoCredito());
        conditions += " AND GLIC_ID_DISPOSICION = ?";
        values.add(this.getGlicIdDisposicion());
        conditions += " AND GLIC_ID_CONSTANCIA = ?";
        values.add(this.getGlicIdConstancia());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCgarliq instance = (FCgarliq) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGlicIdFideicomiso().equals(instance.getGlicIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getGlicIdCredito().equals(instance.getGlicIdCredito()))
            equalObjects = false;
        if (equalObjects && !this.getGlicIdTipoCredito().equals(instance.getGlicIdTipoCredito()))
            equalObjects = false;
        if (equalObjects && !this.getGlicIdDisposicion().equals(instance.getGlicIdDisposicion()))
            equalObjects = false;
        if (equalObjects && !this.getGlicIdConstancia().equals(instance.getGlicIdConstancia()))
            equalObjects = false;
        if (equalObjects && !this.getGlicImpCredito().equals(instance.getGlicImpCredito()))
            equalObjects = false;
        if (equalObjects && !this.getGlicImpGarliq().equals(instance.getGlicImpGarliq()))
            equalObjects = false;
        if (equalObjects && !this.getGlicFechaVigencia().equals(instance.getGlicFechaVigencia()))
            equalObjects = false;
        if (equalObjects && !this.getGlicFecImpreConst().equals(instance.getGlicFecImpreConst()))
            equalObjects = false;
        if (equalObjects && !this.getGlicUsuarioConst().equals(instance.getGlicUsuarioConst()))
            equalObjects = false;
        if (equalObjects && !this.getGlicCveStatus().equals(instance.getGlicCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCgarliq result = new FCgarliq();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGlicIdFideicomiso((BigDecimal) objectData.getData("GLIC_ID_FIDEICOMISO"));
        result.setGlicIdCredito((String) objectData.getData("GLIC_ID_CREDITO"));
        result.setGlicIdTipoCredito((String) objectData.getData("GLIC_ID_TIPO_CREDITO"));
        result.setGlicIdDisposicion((BigDecimal) objectData.getData("GLIC_ID_DISPOSICION"));
        result.setGlicIdConstancia((BigDecimal) objectData.getData("GLIC_ID_CONSTANCIA"));
        result.setGlicImpCredito((BigDecimal) objectData.getData("GLIC_IMP_CREDITO"));
        result.setGlicImpGarliq((BigDecimal) objectData.getData("GLIC_IMP_GARLIQ"));
        result.setGlicFechaVigencia((String) objectData.getData("GLIC_FECHA_VIGENCIA"));
        result.setGlicFecImpreConst((String) objectData.getData("GLIC_FEC_IMPRE_CONST"));
        result.setGlicUsuarioConst((BigDecimal) objectData.getData("GLIC_USUARIO_CONST"));
        result.setGlicCveStatus((String) objectData.getData("GLIC_CVE_STATUS"));

        return result;

    }

}
