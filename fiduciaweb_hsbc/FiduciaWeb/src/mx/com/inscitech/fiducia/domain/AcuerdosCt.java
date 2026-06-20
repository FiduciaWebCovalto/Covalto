package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ACUERDOS_CT_PK", columns = { "SES_NUM_CONTRATO", "SES_FECHA", "SES_TIPO", "ACU_ID" }, sequences = { "MANUAL" })
public class AcuerdosCt extends DomainObject {

    BigDecimal sesNumContrato = null;
    String sesFecha = null;
    String sesTipo = null;
    String acuId = null;
    String acuDescripcion = null;
    BigDecimal acuMontoAutorizado = null;
    BigDecimal acuMontoDisponible = null;
    BigDecimal acuMontoEjercido = null;
    String acuFechaAlta = null;
    String acuFechaUltMod = null;
    String acuStatus = null;

    public AcuerdosCt() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSesNumContrato(BigDecimal sesNumContrato) {
        this.sesNumContrato = sesNumContrato;
    }

    public BigDecimal getSesNumContrato() {
        return this.sesNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setSesFecha(String sesFecha) {
        this.sesFecha = sesFecha;
    }

    public String getSesFecha() {
        return this.sesFecha;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSesTipo(String sesTipo) {
        this.sesTipo = sesTipo;
    }

    public String getSesTipo() {
        return this.sesTipo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuId(String acuId) {
        this.acuId = acuId;
    }

    public String getAcuId() {
        return this.acuId;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuDescripcion(String acuDescripcion) {
        this.acuDescripcion = acuDescripcion;
    }

    public String getAcuDescripcion() {
        return this.acuDescripcion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setAcuMontoAutorizado(BigDecimal acuMontoAutorizado) {
        this.acuMontoAutorizado = acuMontoAutorizado;
    }

    public BigDecimal getAcuMontoAutorizado() {
        return this.acuMontoAutorizado;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setAcuMontoDisponible(BigDecimal acuMontoDisponible) {
        this.acuMontoDisponible = acuMontoDisponible;
    }

    public BigDecimal getAcuMontoDisponible() {
        return this.acuMontoDisponible;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setAcuMontoEjercido(BigDecimal acuMontoEjercido) {
        this.acuMontoEjercido = acuMontoEjercido;
    }

    public BigDecimal getAcuMontoEjercido() {
        return this.acuMontoEjercido;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setAcuFechaAlta(String acuFechaAlta) {
        this.acuFechaAlta = acuFechaAlta;
    }

    public String getAcuFechaAlta() {
        return this.acuFechaAlta;
    }

    @FieldInfo(nullable = false, dataType = "DATE", javaClass = String.class)
    public void setAcuFechaUltMod(String acuFechaUltMod) {
        this.acuFechaUltMod = acuFechaUltMod;
    }

    public String getAcuFechaUltMod() {
        return this.acuFechaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcuStatus(String acuStatus) {
        this.acuStatus = acuStatus;
    }

    public String getAcuStatus() {
        return this.acuStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ACUERDOS_CT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSesNumContrato() != null && this.getSesNumContrato().longValue() == -999) {
            conditions += " AND SES_NUM_CONTRATO IS NULL";
        } else if (this.getSesNumContrato() != null) {
            conditions += " AND SES_NUM_CONTRATO = ?";
            values.add(this.getSesNumContrato());
        }

        if (this.getSesFecha() != null && "null".equals(this.getSesFecha())) {
            conditions += " AND SES_FECHA IS NULL";
        } else if (this.getSesFecha() != null) {
            conditions += " AND SES_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSesFecha());
        }

        if (this.getSesTipo() != null && "null".equals(this.getSesTipo())) {
            conditions += " AND SES_TIPO IS NULL";
        } else if (this.getSesTipo() != null) {
            conditions += " AND SES_TIPO = ?";
            values.add(this.getSesTipo());
        }

        if (this.getAcuId() != null && "null".equals(this.getAcuId())) {
            conditions += " AND ACU_ID IS NULL";
        } else if (this.getAcuId() != null) {
            conditions += " AND ACU_ID = ?";
            values.add(this.getAcuId());
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
        String sql = "SELECT * FROM ACUERDOS_CT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSesNumContrato() != null && this.getSesNumContrato().longValue() == -999) {
            conditions += " AND SES_NUM_CONTRATO IS NULL";
        } else if (this.getSesNumContrato() != null) {
            conditions += " AND SES_NUM_CONTRATO = ?";
            values.add(this.getSesNumContrato());
        }

        if (this.getSesFecha() != null && "null".equals(this.getSesFecha())) {
            conditions += " AND SES_FECHA IS NULL";
        } else if (this.getSesFecha() != null) {
            conditions += " AND SES_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getSesFecha());
        }

        if (this.getSesTipo() != null && "null".equals(this.getSesTipo())) {
            conditions += " AND SES_TIPO IS NULL";
        } else if (this.getSesTipo() != null) {
            conditions += " AND SES_TIPO = ?";
            values.add(this.getSesTipo());
        }

        if (this.getAcuId() != null && "null".equals(this.getAcuId())) {
            conditions += " AND ACU_ID IS NULL";
        } else if (this.getAcuId() != null) {
            conditions += " AND ACU_ID = ?";
            values.add(this.getAcuId());
        }

        if (this.getAcuDescripcion() != null && "null".equals(this.getAcuDescripcion())) {
            conditions += " AND ACU_DESCRIPCION IS NULL";
        } else if (this.getAcuDescripcion() != null) {
            conditions += " AND ACU_DESCRIPCION = ?";
            values.add(this.getAcuDescripcion());
        }

        if (this.getAcuMontoAutorizado() != null && this.getAcuMontoAutorizado().longValue() == -999) {
            conditions += " AND ACU_MONTO_AUTORIZADO IS NULL";
        } else if (this.getAcuMontoAutorizado() != null) {
            conditions += " AND ACU_MONTO_AUTORIZADO = ?";
            values.add(this.getAcuMontoAutorizado());
        }

        if (this.getAcuMontoDisponible() != null && this.getAcuMontoDisponible().longValue() == -999) {
            conditions += " AND ACU_MONTO_DISPONIBLE IS NULL";
        } else if (this.getAcuMontoDisponible() != null) {
            conditions += " AND ACU_MONTO_DISPONIBLE = ?";
            values.add(this.getAcuMontoDisponible());
        }

        if (this.getAcuMontoEjercido() != null && this.getAcuMontoEjercido().longValue() == -999) {
            conditions += " AND ACU_MONTO_EJERCIDO IS NULL";
        } else if (this.getAcuMontoEjercido() != null) {
            conditions += " AND ACU_MONTO_EJERCIDO = ?";
            values.add(this.getAcuMontoEjercido());
        }

        if (this.getAcuFechaAlta() != null && "null".equals(this.getAcuFechaAlta())) {
            conditions += " AND ACU_FECHA_ALTA IS NULL";
        } else if (this.getAcuFechaAlta() != null) {
            conditions += " AND ACU_FECHA_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getAcuFechaAlta());
        }

        if (this.getAcuFechaUltMod() != null && "null".equals(this.getAcuFechaUltMod())) {
            conditions += " AND ACU_FECHA_ULT_MOD IS NULL";
        } else if (this.getAcuFechaUltMod() != null) {
            conditions += " AND ACU_FECHA_ULT_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getAcuFechaUltMod());
        }

        if (this.getAcuStatus() != null && "null".equals(this.getAcuStatus())) {
            conditions += " AND ACU_STATUS IS NULL";
        } else if (this.getAcuStatus() != null) {
            conditions += " AND ACU_STATUS = ?";
            values.add(this.getAcuStatus());
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
        String sql = "UPDATE ACUERDOS_CT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND SES_NUM_CONTRATO = ?";
        pkValues.add(this.getSesNumContrato());
        conditions += " AND SES_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        pkValues.add(this.getSesFecha());
        conditions += " AND SES_TIPO = ?";
        pkValues.add(this.getSesTipo());
        conditions += " AND ACU_ID = ?";
        pkValues.add(this.getAcuId());
        fields += " ACU_DESCRIPCION = ?, ";
        values.add(this.getAcuDescripcion());
        fields += " ACU_MONTO_AUTORIZADO = ?, ";
        values.add(this.getAcuMontoAutorizado());
        fields += " ACU_MONTO_DISPONIBLE = ?, ";
        values.add(this.getAcuMontoDisponible());
        fields += " ACU_MONTO_EJERCIDO = ?, ";
        values.add(this.getAcuMontoEjercido());
        fields += " ACU_FECHA_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getAcuFechaAlta());
        fields += " ACU_FECHA_ULT_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getAcuFechaUltMod());
        fields += " ACU_STATUS = ?, ";
        values.add(this.getAcuStatus());
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
        String sql = "INSERT INTO ACUERDOS_CT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SES_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getSesNumContrato());

        fields += ", SES_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getSesFecha());

        fields += ", SES_TIPO";
        fieldValues += ", ?";
        values.add(this.getSesTipo());

        fields += ", ACU_ID";
        fieldValues += ", ?";
        values.add(this.getAcuId());

        fields += ", ACU_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getAcuDescripcion());

        fields += ", ACU_MONTO_AUTORIZADO";
        fieldValues += ", ?";
        values.add(this.getAcuMontoAutorizado());

        fields += ", ACU_MONTO_DISPONIBLE";
        fieldValues += ", ?";
        values.add(this.getAcuMontoDisponible());

        fields += ", ACU_MONTO_EJERCIDO";
        fieldValues += ", ?";
        values.add(this.getAcuMontoEjercido());

        fields += ", ACU_FECHA_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getAcuFechaAlta());

        fields += ", ACU_FECHA_ULT_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getAcuFechaUltMod());

        fields += ", ACU_STATUS";
        fieldValues += ", ?";
        values.add(this.getAcuStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ACUERDOS_CT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND SES_NUM_CONTRATO = ?";
        values.add(this.getSesNumContrato());
        conditions += " AND SES_FECHA = TO_DATE(?, 'dd/MM/yyyy')";
        values.add(this.getSesFecha());
        conditions += " AND SES_TIPO = ?";
        values.add(this.getSesTipo());
        conditions += " AND ACU_ID = ?";
        values.add(this.getAcuId());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        AcuerdosCt instance = (AcuerdosCt) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSesNumContrato().equals(instance.getSesNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getSesFecha().equals(instance.getSesFecha()))
            equalObjects = false;
        if (equalObjects && !this.getSesTipo().equals(instance.getSesTipo()))
            equalObjects = false;
        if (equalObjects && !this.getAcuId().equals(instance.getAcuId()))
            equalObjects = false;
        if (equalObjects && !this.getAcuDescripcion().equals(instance.getAcuDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getAcuMontoAutorizado().equals(instance.getAcuMontoAutorizado()))
            equalObjects = false;
        if (equalObjects && !this.getAcuMontoDisponible().equals(instance.getAcuMontoDisponible()))
            equalObjects = false;
        if (equalObjects && !this.getAcuMontoEjercido().equals(instance.getAcuMontoEjercido()))
            equalObjects = false;
        if (equalObjects && !this.getAcuFechaAlta().equals(instance.getAcuFechaAlta()))
            equalObjects = false;
        if (equalObjects && !this.getAcuFechaUltMod().equals(instance.getAcuFechaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getAcuStatus().equals(instance.getAcuStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        AcuerdosCt result = new AcuerdosCt();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSesNumContrato((BigDecimal) objectData.getData("SES_NUM_CONTRATO"));
        result.setSesFecha((String) objectData.getData("SES_FECHA"));
        result.setSesTipo((String) objectData.getData("SES_TIPO"));
        result.setAcuId((String) objectData.getData("ACU_ID"));
        result.setAcuDescripcion((String) objectData.getData("ACU_DESCRIPCION"));
        result.setAcuMontoAutorizado((BigDecimal) objectData.getData("ACU_MONTO_AUTORIZADO"));
        result.setAcuMontoDisponible((BigDecimal) objectData.getData("ACU_MONTO_DISPONIBLE"));
        result.setAcuMontoEjercido((BigDecimal) objectData.getData("ACU_MONTO_EJERCIDO"));
        result.setAcuFechaAlta((String) objectData.getData("ACU_FECHA_ALTA"));
        result.setAcuFechaUltMod((String) objectData.getData("ACU_FECHA_ULT_MOD"));
        result.setAcuStatus((String) objectData.getData("ACU_STATUS"));

        return result;

    }

}
