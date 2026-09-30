package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_DGARLIQ_PK", columns = { "GLIQ_ID_FIDEICOMISO", "GLIQ_ID_CREDITO", "GLIQ_ID_TIPO_CREDITO", "GLIQ_ID_DISPOSICION" }, sequences = { "MANUAL" })
public class FDgarliq extends DomainObject {

    BigDecimal gliqIdFideicomiso = null;
    String gliqIdCredito = null;
    String gliqIdTipoCredito = null;
    BigDecimal gliqIdDisposicion = null;
    String gliqFechaDisposicion = null;
    BigDecimal gliqImporteDisp = null;
    BigDecimal gliqGarLiquida = null;
    BigDecimal gliqNumBeneficiarios = null;
    String gliqAccionTomada = null;
    String gliqCveStatus = null;

    public FDgarliq() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGliqIdFideicomiso(BigDecimal gliqIdFideicomiso) {
        this.gliqIdFideicomiso = gliqIdFideicomiso;
    }

    public BigDecimal getGliqIdFideicomiso() {
        return this.gliqIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGliqIdCredito(String gliqIdCredito) {
        this.gliqIdCredito = gliqIdCredito;
    }

    public String getGliqIdCredito() {
        return this.gliqIdCredito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGliqIdTipoCredito(String gliqIdTipoCredito) {
        this.gliqIdTipoCredito = gliqIdTipoCredito;
    }

    public String getGliqIdTipoCredito() {
        return this.gliqIdTipoCredito;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGliqIdDisposicion(BigDecimal gliqIdDisposicion) {
        this.gliqIdDisposicion = gliqIdDisposicion;
    }

    public BigDecimal getGliqIdDisposicion() {
        return this.gliqIdDisposicion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setGliqFechaDisposicion(String gliqFechaDisposicion) {
        this.gliqFechaDisposicion = gliqFechaDisposicion;
    }

    public String getGliqFechaDisposicion() {
        return this.gliqFechaDisposicion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGliqImporteDisp(BigDecimal gliqImporteDisp) {
        this.gliqImporteDisp = gliqImporteDisp;
    }

    public BigDecimal getGliqImporteDisp() {
        return this.gliqImporteDisp;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGliqGarLiquida(BigDecimal gliqGarLiquida) {
        this.gliqGarLiquida = gliqGarLiquida;
    }

    public BigDecimal getGliqGarLiquida() {
        return this.gliqGarLiquida;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGliqNumBeneficiarios(BigDecimal gliqNumBeneficiarios) {
        this.gliqNumBeneficiarios = gliqNumBeneficiarios;
    }

    public BigDecimal getGliqNumBeneficiarios() {
        return this.gliqNumBeneficiarios;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGliqAccionTomada(String gliqAccionTomada) {
        this.gliqAccionTomada = gliqAccionTomada;
    }

    public String getGliqAccionTomada() {
        return this.gliqAccionTomada;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGliqCveStatus(String gliqCveStatus) {
        this.gliqCveStatus = gliqCveStatus;
    }

    public String getGliqCveStatus() {
        return this.gliqCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_DGARLIQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGliqIdFideicomiso() != null && this.getGliqIdFideicomiso().longValue() == -999) {
            conditions += " AND GLIQ_ID_FIDEICOMISO IS NULL";
        } else if (this.getGliqIdFideicomiso() != null) {
            conditions += " AND GLIQ_ID_FIDEICOMISO = ?";
            values.add(this.getGliqIdFideicomiso());
        }

        if (this.getGliqIdCredito() != null && "null".equals(this.getGliqIdCredito())) {
            conditions += " AND GLIQ_ID_CREDITO IS NULL";
        } else if (this.getGliqIdCredito() != null) {
            conditions += " AND GLIQ_ID_CREDITO = ?";
            values.add(this.getGliqIdCredito());
        }

        if (this.getGliqIdTipoCredito() != null && "null".equals(this.getGliqIdTipoCredito())) {
            conditions += " AND GLIQ_ID_TIPO_CREDITO IS NULL";
        } else if (this.getGliqIdTipoCredito() != null) {
            conditions += " AND GLIQ_ID_TIPO_CREDITO = ?";
            values.add(this.getGliqIdTipoCredito());
        }

        if (this.getGliqIdDisposicion() != null && this.getGliqIdDisposicion().longValue() == -999) {
            conditions += " AND GLIQ_ID_DISPOSICION IS NULL";
        } else if (this.getGliqIdDisposicion() != null) {
            conditions += " AND GLIQ_ID_DISPOSICION = ?";
            values.add(this.getGliqIdDisposicion());
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
        String sql = "SELECT * FROM F_DGARLIQ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGliqIdFideicomiso() != null && this.getGliqIdFideicomiso().longValue() == -999) {
            conditions += " AND GLIQ_ID_FIDEICOMISO IS NULL";
        } else if (this.getGliqIdFideicomiso() != null) {
            conditions += " AND GLIQ_ID_FIDEICOMISO = ?";
            values.add(this.getGliqIdFideicomiso());
        }

        if (this.getGliqIdCredito() != null && "null".equals(this.getGliqIdCredito())) {
            conditions += " AND GLIQ_ID_CREDITO IS NULL";
        } else if (this.getGliqIdCredito() != null) {
            conditions += " AND GLIQ_ID_CREDITO = ?";
            values.add(this.getGliqIdCredito());
        }

        if (this.getGliqIdTipoCredito() != null && "null".equals(this.getGliqIdTipoCredito())) {
            conditions += " AND GLIQ_ID_TIPO_CREDITO IS NULL";
        } else if (this.getGliqIdTipoCredito() != null) {
            conditions += " AND GLIQ_ID_TIPO_CREDITO = ?";
            values.add(this.getGliqIdTipoCredito());
        }

        if (this.getGliqIdDisposicion() != null && this.getGliqIdDisposicion().longValue() == -999) {
            conditions += " AND GLIQ_ID_DISPOSICION IS NULL";
        } else if (this.getGliqIdDisposicion() != null) {
            conditions += " AND GLIQ_ID_DISPOSICION = ?";
            values.add(this.getGliqIdDisposicion());
        }

        if (this.getGliqFechaDisposicion() != null && "null".equals(this.getGliqFechaDisposicion())) {
            conditions += " AND GLIQ_FECHA_DISPOSICION IS NULL";
        } else if (this.getGliqFechaDisposicion() != null) {
            conditions += " AND GLIQ_FECHA_DISPOSICION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getGliqFechaDisposicion());
        }

        if (this.getGliqImporteDisp() != null && this.getGliqImporteDisp().longValue() == -999) {
            conditions += " AND GLIQ_IMPORTE_DISP IS NULL";
        } else if (this.getGliqImporteDisp() != null) {
            conditions += " AND GLIQ_IMPORTE_DISP = ?";
            values.add(this.getGliqImporteDisp());
        }

        if (this.getGliqGarLiquida() != null && this.getGliqGarLiquida().longValue() == -999) {
            conditions += " AND GLIQ_GAR_LIQUIDA IS NULL";
        } else if (this.getGliqGarLiquida() != null) {
            conditions += " AND GLIQ_GAR_LIQUIDA = ?";
            values.add(this.getGliqGarLiquida());
        }

        if (this.getGliqNumBeneficiarios() != null && this.getGliqNumBeneficiarios().longValue() == -999) {
            conditions += " AND GLIQ_NUM_BENEFICIARIOS IS NULL";
        } else if (this.getGliqNumBeneficiarios() != null) {
            conditions += " AND GLIQ_NUM_BENEFICIARIOS = ?";
            values.add(this.getGliqNumBeneficiarios());
        }

        if (this.getGliqAccionTomada() != null && "null".equals(this.getGliqAccionTomada())) {
            conditions += " AND GLIQ_ACCION_TOMADA IS NULL";
        } else if (this.getGliqAccionTomada() != null) {
            conditions += " AND GLIQ_ACCION_TOMADA = ?";
            values.add(this.getGliqAccionTomada());
        }

        if (this.getGliqCveStatus() != null && "null".equals(this.getGliqCveStatus())) {
            conditions += " AND GLIQ_CVE_STATUS IS NULL";
        } else if (this.getGliqCveStatus() != null) {
            conditions += " AND GLIQ_CVE_STATUS = ?";
            values.add(this.getGliqCveStatus());
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
        String sql = "UPDATE F_DGARLIQ SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GLIQ_ID_FIDEICOMISO = ?";
        pkValues.add(this.getGliqIdFideicomiso());
        conditions += " AND GLIQ_ID_CREDITO = ?";
        pkValues.add(this.getGliqIdCredito());
        conditions += " AND GLIQ_ID_TIPO_CREDITO = ?";
        pkValues.add(this.getGliqIdTipoCredito());
        conditions += " AND GLIQ_ID_DISPOSICION = ?";
        pkValues.add(this.getGliqIdDisposicion());
        fields += " GLIQ_FECHA_DISPOSICION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getGliqFechaDisposicion());
        fields += " GLIQ_IMPORTE_DISP = ?, ";
        values.add(this.getGliqImporteDisp());
        fields += " GLIQ_GAR_LIQUIDA = ?, ";
        values.add(this.getGliqGarLiquida());
        fields += " GLIQ_NUM_BENEFICIARIOS = ?, ";
        values.add(this.getGliqNumBeneficiarios());
        fields += " GLIQ_ACCION_TOMADA = ?, ";
        values.add(this.getGliqAccionTomada());
        fields += " GLIQ_CVE_STATUS = ?, ";
        values.add(this.getGliqCveStatus());
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
        String sql = "INSERT INTO F_DGARLIQ ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GLIQ_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getGliqIdFideicomiso());

        fields += ", GLIQ_ID_CREDITO";
        fieldValues += ", ?";
        values.add(this.getGliqIdCredito());

        fields += ", GLIQ_ID_TIPO_CREDITO";
        fieldValues += ", ?";
        values.add(this.getGliqIdTipoCredito());

        fields += ", GLIQ_ID_DISPOSICION";
        fieldValues += ", ?";
        values.add(this.getGliqIdDisposicion());

        fields += ", GLIQ_FECHA_DISPOSICION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getGliqFechaDisposicion());

        fields += ", GLIQ_IMPORTE_DISP";
        fieldValues += ", ?";
        values.add(this.getGliqImporteDisp());

        fields += ", GLIQ_GAR_LIQUIDA";
        fieldValues += ", ?";
        values.add(this.getGliqGarLiquida());

        fields += ", GLIQ_NUM_BENEFICIARIOS";
        fieldValues += ", ?";
        values.add(this.getGliqNumBeneficiarios());

        fields += ", GLIQ_ACCION_TOMADA";
        fieldValues += ", ?";
        values.add(this.getGliqAccionTomada());

        fields += ", GLIQ_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getGliqCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_DGARLIQ WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GLIQ_ID_FIDEICOMISO = ?";
        values.add(this.getGliqIdFideicomiso());
        conditions += " AND GLIQ_ID_CREDITO = ?";
        values.add(this.getGliqIdCredito());
        conditions += " AND GLIQ_ID_TIPO_CREDITO = ?";
        values.add(this.getGliqIdTipoCredito());
        conditions += " AND GLIQ_ID_DISPOSICION = ?";
        values.add(this.getGliqIdDisposicion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FDgarliq instance = (FDgarliq) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGliqIdFideicomiso().equals(instance.getGliqIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getGliqIdCredito().equals(instance.getGliqIdCredito()))
            equalObjects = false;
        if (equalObjects && !this.getGliqIdTipoCredito().equals(instance.getGliqIdTipoCredito()))
            equalObjects = false;
        if (equalObjects && !this.getGliqIdDisposicion().equals(instance.getGliqIdDisposicion()))
            equalObjects = false;
        if (equalObjects && !this.getGliqFechaDisposicion().equals(instance.getGliqFechaDisposicion()))
            equalObjects = false;
        if (equalObjects && !this.getGliqImporteDisp().equals(instance.getGliqImporteDisp()))
            equalObjects = false;
        if (equalObjects && !this.getGliqGarLiquida().equals(instance.getGliqGarLiquida()))
            equalObjects = false;
        if (equalObjects && !this.getGliqNumBeneficiarios().equals(instance.getGliqNumBeneficiarios()))
            equalObjects = false;
        if (equalObjects && !this.getGliqAccionTomada().equals(instance.getGliqAccionTomada()))
            equalObjects = false;
        if (equalObjects && !this.getGliqCveStatus().equals(instance.getGliqCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FDgarliq result = new FDgarliq();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGliqIdFideicomiso((BigDecimal) objectData.getData("GLIQ_ID_FIDEICOMISO"));
        result.setGliqIdCredito((String) objectData.getData("GLIQ_ID_CREDITO"));
        result.setGliqIdTipoCredito((String) objectData.getData("GLIQ_ID_TIPO_CREDITO"));
        result.setGliqIdDisposicion((BigDecimal) objectData.getData("GLIQ_ID_DISPOSICION"));
        result.setGliqFechaDisposicion((String) objectData.getData("GLIQ_FECHA_DISPOSICION"));
        result.setGliqImporteDisp((BigDecimal) objectData.getData("GLIQ_IMPORTE_DISP"));
        result.setGliqGarLiquida((BigDecimal) objectData.getData("GLIQ_GAR_LIQUIDA"));
        result.setGliqNumBeneficiarios((BigDecimal) objectData.getData("GLIQ_NUM_BENEFICIARIOS"));
        result.setGliqAccionTomada((String) objectData.getData("GLIQ_ACCION_TOMADA"));
        result.setGliqCveStatus((String) objectData.getData("GLIQ_CVE_STATUS"));

        return result;

    }

}
