package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_LGARLIQ_PK", columns = { "GLIL_ID_FIDEICOMISO", "GLIL_ID_CREDITO", "GLIL_ID_TIPO_CREDITO", "GLIL_ID_DISPOSICION", "GLIL_ID_LIBERACION" },
            sequences = { "MANUAL" })
public class FLgarliq extends DomainObject {

    BigDecimal glilIdFideicomiso = null;
    String glilIdCredito = null;
    String glilIdTipoCredito = null;
    BigDecimal glilIdDisposicion = null;
    BigDecimal glilIdLiberacion = null;
    String glilFechaSolicitud = null;
    BigDecimal glilImpSolicitud = null;
    String glilFechaLiberacion = null;
    BigDecimal glilImpLiberado = null;
    BigDecimal glilNumBenLiberado = null;
    BigDecimal glilUsuarioLibera = null;
    String glilCveStatus = null;

    public FLgarliq() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlilIdFideicomiso(BigDecimal glilIdFideicomiso) {
        this.glilIdFideicomiso = glilIdFideicomiso;
    }

    public BigDecimal getGlilIdFideicomiso() {
        return this.glilIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlilIdCredito(String glilIdCredito) {
        this.glilIdCredito = glilIdCredito;
    }

    public String getGlilIdCredito() {
        return this.glilIdCredito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlilIdTipoCredito(String glilIdTipoCredito) {
        this.glilIdTipoCredito = glilIdTipoCredito;
    }

    public String getGlilIdTipoCredito() {
        return this.glilIdTipoCredito;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlilIdDisposicion(BigDecimal glilIdDisposicion) {
        this.glilIdDisposicion = glilIdDisposicion;
    }

    public BigDecimal getGlilIdDisposicion() {
        return this.glilIdDisposicion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlilIdLiberacion(BigDecimal glilIdLiberacion) {
        this.glilIdLiberacion = glilIdLiberacion;
    }

    public BigDecimal getGlilIdLiberacion() {
        return this.glilIdLiberacion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setGlilFechaSolicitud(String glilFechaSolicitud) {
        this.glilFechaSolicitud = glilFechaSolicitud;
    }

    public String getGlilFechaSolicitud() {
        return this.glilFechaSolicitud;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGlilImpSolicitud(BigDecimal glilImpSolicitud) {
        this.glilImpSolicitud = glilImpSolicitud;
    }

    public BigDecimal getGlilImpSolicitud() {
        return this.glilImpSolicitud;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setGlilFechaLiberacion(String glilFechaLiberacion) {
        this.glilFechaLiberacion = glilFechaLiberacion;
    }

    public String getGlilFechaLiberacion() {
        return this.glilFechaLiberacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGlilImpLiberado(BigDecimal glilImpLiberado) {
        this.glilImpLiberado = glilImpLiberado;
    }

    public BigDecimal getGlilImpLiberado() {
        return this.glilImpLiberado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlilNumBenLiberado(BigDecimal glilNumBenLiberado) {
        this.glilNumBenLiberado = glilNumBenLiberado;
    }

    public BigDecimal getGlilNumBenLiberado() {
        return this.glilNumBenLiberado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGlilUsuarioLibera(BigDecimal glilUsuarioLibera) {
        this.glilUsuarioLibera = glilUsuarioLibera;
    }

    public BigDecimal getGlilUsuarioLibera() {
        return this.glilUsuarioLibera;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGlilCveStatus(String glilCveStatus) {
        this.glilCveStatus = glilCveStatus;
    }

    public String getGlilCveStatus() {
        return this.glilCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_LGARLIQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGlilIdFideicomiso() != null && this.getGlilIdFideicomiso().longValue() == -999) {
            conditions += " AND GLIL_ID_FIDEICOMISO IS NULL";
        } else if (this.getGlilIdFideicomiso() != null) {
            conditions += " AND GLIL_ID_FIDEICOMISO = ?";
            values.add(this.getGlilIdFideicomiso());
        }

        if (this.getGlilIdCredito() != null && "null".equals(this.getGlilIdCredito())) {
            conditions += " AND GLIL_ID_CREDITO IS NULL";
        } else if (this.getGlilIdCredito() != null) {
            conditions += " AND GLIL_ID_CREDITO = ?";
            values.add(this.getGlilIdCredito());
        }

        if (this.getGlilIdTipoCredito() != null && "null".equals(this.getGlilIdTipoCredito())) {
            conditions += " AND GLIL_ID_TIPO_CREDITO IS NULL";
        } else if (this.getGlilIdTipoCredito() != null) {
            conditions += " AND GLIL_ID_TIPO_CREDITO = ?";
            values.add(this.getGlilIdTipoCredito());
        }

        if (this.getGlilIdDisposicion() != null && this.getGlilIdDisposicion().longValue() == -999) {
            conditions += " AND GLIL_ID_DISPOSICION IS NULL";
        } else if (this.getGlilIdDisposicion() != null) {
            conditions += " AND GLIL_ID_DISPOSICION = ?";
            values.add(this.getGlilIdDisposicion());
        }

        if (this.getGlilIdLiberacion() != null && this.getGlilIdLiberacion().longValue() == -999) {
            conditions += " AND GLIL_ID_LIBERACION IS NULL";
        } else if (this.getGlilIdLiberacion() != null) {
            conditions += " AND GLIL_ID_LIBERACION = ?";
            values.add(this.getGlilIdLiberacion());
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
        String sql = "SELECT * FROM F_LGARLIQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGlilIdFideicomiso() != null && this.getGlilIdFideicomiso().longValue() == -999) {
            conditions += " AND GLIL_ID_FIDEICOMISO IS NULL";
        } else if (this.getGlilIdFideicomiso() != null) {
            conditions += " AND GLIL_ID_FIDEICOMISO = ?";
            values.add(this.getGlilIdFideicomiso());
        }

        if (this.getGlilIdCredito() != null && "null".equals(this.getGlilIdCredito())) {
            conditions += " AND GLIL_ID_CREDITO IS NULL";
        } else if (this.getGlilIdCredito() != null) {
            conditions += " AND GLIL_ID_CREDITO = ?";
            values.add(this.getGlilIdCredito());
        }

        if (this.getGlilIdTipoCredito() != null && "null".equals(this.getGlilIdTipoCredito())) {
            conditions += " AND GLIL_ID_TIPO_CREDITO IS NULL";
        } else if (this.getGlilIdTipoCredito() != null) {
            conditions += " AND GLIL_ID_TIPO_CREDITO = ?";
            values.add(this.getGlilIdTipoCredito());
        }

        if (this.getGlilIdDisposicion() != null && this.getGlilIdDisposicion().longValue() == -999) {
            conditions += " AND GLIL_ID_DISPOSICION IS NULL";
        } else if (this.getGlilIdDisposicion() != null) {
            conditions += " AND GLIL_ID_DISPOSICION = ?";
            values.add(this.getGlilIdDisposicion());
        }

        if (this.getGlilIdLiberacion() != null && this.getGlilIdLiberacion().longValue() == -999) {
            conditions += " AND GLIL_ID_LIBERACION IS NULL";
        } else if (this.getGlilIdLiberacion() != null) {
            conditions += " AND GLIL_ID_LIBERACION = ?";
            values.add(this.getGlilIdLiberacion());
        }

        if (this.getGlilFechaSolicitud() != null && "null".equals(this.getGlilFechaSolicitud())) {
            conditions += " AND GLIL_FECHA_SOLICITUD IS NULL";
        } else if (this.getGlilFechaSolicitud() != null) {
            conditions += " AND GLIL_FECHA_SOLICITUD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getGlilFechaSolicitud());
        }

        if (this.getGlilImpSolicitud() != null && this.getGlilImpSolicitud().longValue() == -999) {
            conditions += " AND GLIL_IMP_SOLICITUD IS NULL";
        } else if (this.getGlilImpSolicitud() != null) {
            conditions += " AND GLIL_IMP_SOLICITUD = ?";
            values.add(this.getGlilImpSolicitud());
        }

        if (this.getGlilFechaLiberacion() != null && "null".equals(this.getGlilFechaLiberacion())) {
            conditions += " AND GLIL_FECHA_LIBERACION IS NULL";
        } else if (this.getGlilFechaLiberacion() != null) {
            conditions += " AND GLIL_FECHA_LIBERACION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getGlilFechaLiberacion());
        }

        if (this.getGlilImpLiberado() != null && this.getGlilImpLiberado().longValue() == -999) {
            conditions += " AND GLIL_IMP_LIBERADO IS NULL";
        } else if (this.getGlilImpLiberado() != null) {
            conditions += " AND GLIL_IMP_LIBERADO = ?";
            values.add(this.getGlilImpLiberado());
        }

        if (this.getGlilNumBenLiberado() != null && this.getGlilNumBenLiberado().longValue() == -999) {
            conditions += " AND GLIL_NUM_BEN_LIBERADO IS NULL";
        } else if (this.getGlilNumBenLiberado() != null) {
            conditions += " AND GLIL_NUM_BEN_LIBERADO = ?";
            values.add(this.getGlilNumBenLiberado());
        }

        if (this.getGlilUsuarioLibera() != null && this.getGlilUsuarioLibera().longValue() == -999) {
            conditions += " AND GLIL_USUARIO_LIBERA IS NULL";
        } else if (this.getGlilUsuarioLibera() != null) {
            conditions += " AND GLIL_USUARIO_LIBERA = ?";
            values.add(this.getGlilUsuarioLibera());
        }

        if (this.getGlilCveStatus() != null && "null".equals(this.getGlilCveStatus())) {
            conditions += " AND GLIL_CVE_STATUS IS NULL";
        } else if (this.getGlilCveStatus() != null) {
            conditions += " AND GLIL_CVE_STATUS = ?";
            values.add(this.getGlilCveStatus());
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
        String sql = "UPDATE F_LGARLIQ SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GLIL_ID_FIDEICOMISO = ?";
        pkValues.add(this.getGlilIdFideicomiso());
        conditions += " AND GLIL_ID_CREDITO = ?";
        pkValues.add(this.getGlilIdCredito());
        conditions += " AND GLIL_ID_TIPO_CREDITO = ?";
        pkValues.add(this.getGlilIdTipoCredito());
        conditions += " AND GLIL_ID_DISPOSICION = ?";
        pkValues.add(this.getGlilIdDisposicion());
        conditions += " AND GLIL_ID_LIBERACION = ?";
        pkValues.add(this.getGlilIdLiberacion());
        fields += " GLIL_FECHA_SOLICITUD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getGlilFechaSolicitud());
        fields += " GLIL_IMP_SOLICITUD = ?, ";
        values.add(this.getGlilImpSolicitud());
        fields += " GLIL_FECHA_LIBERACION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getGlilFechaLiberacion());
        fields += " GLIL_IMP_LIBERADO = ?, ";
        values.add(this.getGlilImpLiberado());
        fields += " GLIL_NUM_BEN_LIBERADO = ?, ";
        values.add(this.getGlilNumBenLiberado());
        fields += " GLIL_USUARIO_LIBERA = ?, ";
        values.add(this.getGlilUsuarioLibera());
        fields += " GLIL_CVE_STATUS = ?, ";
        values.add(this.getGlilCveStatus());
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
        String sql = "INSERT INTO F_LGARLIQ ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GLIL_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getGlilIdFideicomiso());

        fields += ", GLIL_ID_CREDITO";
        fieldValues += ", ?";
        values.add(this.getGlilIdCredito());

        fields += ", GLIL_ID_TIPO_CREDITO";
        fieldValues += ", ?";
        values.add(this.getGlilIdTipoCredito());

        fields += ", GLIL_ID_DISPOSICION";
        fieldValues += ", ?";
        values.add(this.getGlilIdDisposicion());

        fields += ", GLIL_ID_LIBERACION";
        fieldValues += ", ?";
        values.add(this.getGlilIdLiberacion());

        fields += ", GLIL_FECHA_SOLICITUD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getGlilFechaSolicitud());

        fields += ", GLIL_IMP_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getGlilImpSolicitud());

        fields += ", GLIL_FECHA_LIBERACION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getGlilFechaLiberacion());

        fields += ", GLIL_IMP_LIBERADO";
        fieldValues += ", ?";
        values.add(this.getGlilImpLiberado());

        fields += ", GLIL_NUM_BEN_LIBERADO";
        fieldValues += ", ?";
        values.add(this.getGlilNumBenLiberado());

        fields += ", GLIL_USUARIO_LIBERA";
        fieldValues += ", ?";
        values.add(this.getGlilUsuarioLibera());

        fields += ", GLIL_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getGlilCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_LGARLIQ WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GLIL_ID_FIDEICOMISO = ?";
        values.add(this.getGlilIdFideicomiso());
        conditions += " AND GLIL_ID_CREDITO = ?";
        values.add(this.getGlilIdCredito());
        conditions += " AND GLIL_ID_TIPO_CREDITO = ?";
        values.add(this.getGlilIdTipoCredito());
        conditions += " AND GLIL_ID_DISPOSICION = ?";
        values.add(this.getGlilIdDisposicion());
        conditions += " AND GLIL_ID_LIBERACION = ?";
        values.add(this.getGlilIdLiberacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FLgarliq instance = (FLgarliq) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGlilIdFideicomiso().equals(instance.getGlilIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getGlilIdCredito().equals(instance.getGlilIdCredito()))
            equalObjects = false;
        if (equalObjects && !this.getGlilIdTipoCredito().equals(instance.getGlilIdTipoCredito()))
            equalObjects = false;
        if (equalObjects && !this.getGlilIdDisposicion().equals(instance.getGlilIdDisposicion()))
            equalObjects = false;
        if (equalObjects && !this.getGlilIdLiberacion().equals(instance.getGlilIdLiberacion()))
            equalObjects = false;
        if (equalObjects && !this.getGlilFechaSolicitud().equals(instance.getGlilFechaSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getGlilImpSolicitud().equals(instance.getGlilImpSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getGlilFechaLiberacion().equals(instance.getGlilFechaLiberacion()))
            equalObjects = false;
        if (equalObjects && !this.getGlilImpLiberado().equals(instance.getGlilImpLiberado()))
            equalObjects = false;
        if (equalObjects && !this.getGlilNumBenLiberado().equals(instance.getGlilNumBenLiberado()))
            equalObjects = false;
        if (equalObjects && !this.getGlilUsuarioLibera().equals(instance.getGlilUsuarioLibera()))
            equalObjects = false;
        if (equalObjects && !this.getGlilCveStatus().equals(instance.getGlilCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FLgarliq result = new FLgarliq();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGlilIdFideicomiso((BigDecimal) objectData.getData("GLIL_ID_FIDEICOMISO"));
        result.setGlilIdCredito((String) objectData.getData("GLIL_ID_CREDITO"));
        result.setGlilIdTipoCredito((String) objectData.getData("GLIL_ID_TIPO_CREDITO"));
        result.setGlilIdDisposicion((BigDecimal) objectData.getData("GLIL_ID_DISPOSICION"));
        result.setGlilIdLiberacion((BigDecimal) objectData.getData("GLIL_ID_LIBERACION"));
        result.setGlilFechaSolicitud((String) objectData.getData("GLIL_FECHA_SOLICITUD"));
        result.setGlilImpSolicitud((BigDecimal) objectData.getData("GLIL_IMP_SOLICITUD"));
        result.setGlilFechaLiberacion((String) objectData.getData("GLIL_FECHA_LIBERACION"));
        result.setGlilImpLiberado((BigDecimal) objectData.getData("GLIL_IMP_LIBERADO"));
        result.setGlilNumBenLiberado((BigDecimal) objectData.getData("GLIL_NUM_BEN_LIBERADO"));
        result.setGlilUsuarioLibera((BigDecimal) objectData.getData("GLIL_USUARIO_LIBERA"));
        result.setGlilCveStatus((String) objectData.getData("GLIL_CVE_STATUS"));

        return result;

    }

}
