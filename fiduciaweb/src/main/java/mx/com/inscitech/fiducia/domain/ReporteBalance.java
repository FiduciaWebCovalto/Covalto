package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REPORTE_BALANCE_PK", columns = { "RBA_TIPO_FISO", "RBA_TIPO_NEGOCIO", "RBA_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class ReporteBalance extends DomainObject {

    String rbaTipoFiso = null;
    String rbaTipoNegocio = null;
    BigDecimal rbaNumContrato = null;
    String rbaNomContrato = null;
    String rbaEncCreditos = null;
    String rbaEncValores = null;
    String rbaEncInmuebles = null;
    String rbaEncEfectivo = null;
    String rbaEncOtros = null;
    String rbaEncFieicomitentes = null;
    BigDecimal rbaImpCreditos = null;
    BigDecimal rbaImpValores = null;
    BigDecimal rbaImpInmuebles = null;
    BigDecimal rbaImpEfectivo = null;
    BigDecimal rbaImpOtros = null;
    BigDecimal rbaImpFideicomitentes = null;
    String rbaUsuario = null;

    public ReporteBalance() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbaTipoFiso(String rbaTipoFiso) {
        this.rbaTipoFiso = rbaTipoFiso;
    }

    public String getRbaTipoFiso() {
        return this.rbaTipoFiso;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbaTipoNegocio(String rbaTipoNegocio) {
        this.rbaTipoNegocio = rbaTipoNegocio;
    }

    public String getRbaTipoNegocio() {
        return this.rbaTipoNegocio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRbaNumContrato(BigDecimal rbaNumContrato) {
        this.rbaNumContrato = rbaNumContrato;
    }

    public BigDecimal getRbaNumContrato() {
        return this.rbaNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbaNomContrato(String rbaNomContrato) {
        this.rbaNomContrato = rbaNomContrato;
    }

    public String getRbaNomContrato() {
        return this.rbaNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbaEncCreditos(String rbaEncCreditos) {
        this.rbaEncCreditos = rbaEncCreditos;
    }

    public String getRbaEncCreditos() {
        return this.rbaEncCreditos;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbaEncValores(String rbaEncValores) {
        this.rbaEncValores = rbaEncValores;
    }

    public String getRbaEncValores() {
        return this.rbaEncValores;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbaEncInmuebles(String rbaEncInmuebles) {
        this.rbaEncInmuebles = rbaEncInmuebles;
    }

    public String getRbaEncInmuebles() {
        return this.rbaEncInmuebles;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbaEncEfectivo(String rbaEncEfectivo) {
        this.rbaEncEfectivo = rbaEncEfectivo;
    }

    public String getRbaEncEfectivo() {
        return this.rbaEncEfectivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbaEncOtros(String rbaEncOtros) {
        this.rbaEncOtros = rbaEncOtros;
    }

    public String getRbaEncOtros() {
        return this.rbaEncOtros;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbaEncFieicomitentes(String rbaEncFieicomitentes) {
        this.rbaEncFieicomitentes = rbaEncFieicomitentes;
    }

    public String getRbaEncFieicomitentes() {
        return this.rbaEncFieicomitentes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRbaImpCreditos(BigDecimal rbaImpCreditos) {
        this.rbaImpCreditos = rbaImpCreditos;
    }

    public BigDecimal getRbaImpCreditos() {
        return this.rbaImpCreditos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRbaImpValores(BigDecimal rbaImpValores) {
        this.rbaImpValores = rbaImpValores;
    }

    public BigDecimal getRbaImpValores() {
        return this.rbaImpValores;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRbaImpInmuebles(BigDecimal rbaImpInmuebles) {
        this.rbaImpInmuebles = rbaImpInmuebles;
    }

    public BigDecimal getRbaImpInmuebles() {
        return this.rbaImpInmuebles;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRbaImpEfectivo(BigDecimal rbaImpEfectivo) {
        this.rbaImpEfectivo = rbaImpEfectivo;
    }

    public BigDecimal getRbaImpEfectivo() {
        return this.rbaImpEfectivo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRbaImpOtros(BigDecimal rbaImpOtros) {
        this.rbaImpOtros = rbaImpOtros;
    }

    public BigDecimal getRbaImpOtros() {
        return this.rbaImpOtros;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRbaImpFideicomitentes(BigDecimal rbaImpFideicomitentes) {
        this.rbaImpFideicomitentes = rbaImpFideicomitentes;
    }

    public BigDecimal getRbaImpFideicomitentes() {
        return this.rbaImpFideicomitentes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRbaUsuario(String rbaUsuario) {
        this.rbaUsuario = rbaUsuario;
    }

    public String getRbaUsuario() {
        return this.rbaUsuario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REPORTE_BALANCE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRbaTipoFiso() != null && "null".equals(this.getRbaTipoFiso())) {
            conditions += " AND RBA_TIPO_FISO IS NULL";
        } else if (this.getRbaTipoFiso() != null) {
            conditions += " AND RBA_TIPO_FISO = ?";
            values.add(this.getRbaTipoFiso());
        }

        if (this.getRbaTipoNegocio() != null && "null".equals(this.getRbaTipoNegocio())) {
            conditions += " AND RBA_TIPO_NEGOCIO IS NULL";
        } else if (this.getRbaTipoNegocio() != null) {
            conditions += " AND RBA_TIPO_NEGOCIO = ?";
            values.add(this.getRbaTipoNegocio());
        }

        if (this.getRbaNumContrato() != null && this.getRbaNumContrato().longValue() == -999) {
            conditions += " AND RBA_NUM_CONTRATO IS NULL";
        } else if (this.getRbaNumContrato() != null) {
            conditions += " AND RBA_NUM_CONTRATO = ?";
            values.add(this.getRbaNumContrato());
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
        String sql = "SELECT * FROM REPORTE_BALANCE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRbaTipoFiso() != null && "null".equals(this.getRbaTipoFiso())) {
            conditions += " AND RBA_TIPO_FISO IS NULL";
        } else if (this.getRbaTipoFiso() != null) {
            conditions += " AND RBA_TIPO_FISO = ?";
            values.add(this.getRbaTipoFiso());
        }

        if (this.getRbaTipoNegocio() != null && "null".equals(this.getRbaTipoNegocio())) {
            conditions += " AND RBA_TIPO_NEGOCIO IS NULL";
        } else if (this.getRbaTipoNegocio() != null) {
            conditions += " AND RBA_TIPO_NEGOCIO = ?";
            values.add(this.getRbaTipoNegocio());
        }

        if (this.getRbaNumContrato() != null && this.getRbaNumContrato().longValue() == -999) {
            conditions += " AND RBA_NUM_CONTRATO IS NULL";
        } else if (this.getRbaNumContrato() != null) {
            conditions += " AND RBA_NUM_CONTRATO = ?";
            values.add(this.getRbaNumContrato());
        }

        if (this.getRbaNomContrato() != null && "null".equals(this.getRbaNomContrato())) {
            conditions += " AND RBA_NOM_CONTRATO IS NULL";
        } else if (this.getRbaNomContrato() != null) {
            conditions += " AND RBA_NOM_CONTRATO = ?";
            values.add(this.getRbaNomContrato());
        }

        if (this.getRbaEncCreditos() != null && "null".equals(this.getRbaEncCreditos())) {
            conditions += " AND RBA_ENC_CREDITOS IS NULL";
        } else if (this.getRbaEncCreditos() != null) {
            conditions += " AND RBA_ENC_CREDITOS = ?";
            values.add(this.getRbaEncCreditos());
        }

        if (this.getRbaEncValores() != null && "null".equals(this.getRbaEncValores())) {
            conditions += " AND RBA_ENC_VALORES IS NULL";
        } else if (this.getRbaEncValores() != null) {
            conditions += " AND RBA_ENC_VALORES = ?";
            values.add(this.getRbaEncValores());
        }

        if (this.getRbaEncInmuebles() != null && "null".equals(this.getRbaEncInmuebles())) {
            conditions += " AND RBA_ENC_INMUEBLES IS NULL";
        } else if (this.getRbaEncInmuebles() != null) {
            conditions += " AND RBA_ENC_INMUEBLES = ?";
            values.add(this.getRbaEncInmuebles());
        }

        if (this.getRbaEncEfectivo() != null && "null".equals(this.getRbaEncEfectivo())) {
            conditions += " AND RBA_ENC_EFECTIVO IS NULL";
        } else if (this.getRbaEncEfectivo() != null) {
            conditions += " AND RBA_ENC_EFECTIVO = ?";
            values.add(this.getRbaEncEfectivo());
        }

        if (this.getRbaEncOtros() != null && "null".equals(this.getRbaEncOtros())) {
            conditions += " AND RBA_ENC_OTROS IS NULL";
        } else if (this.getRbaEncOtros() != null) {
            conditions += " AND RBA_ENC_OTROS = ?";
            values.add(this.getRbaEncOtros());
        }

        if (this.getRbaEncFieicomitentes() != null && "null".equals(this.getRbaEncFieicomitentes())) {
            conditions += " AND RBA_ENC_FIEICOMITENTES IS NULL";
        } else if (this.getRbaEncFieicomitentes() != null) {
            conditions += " AND RBA_ENC_FIEICOMITENTES = ?";
            values.add(this.getRbaEncFieicomitentes());
        }

        if (this.getRbaImpCreditos() != null && this.getRbaImpCreditos().longValue() == -999) {
            conditions += " AND RBA_IMP_CREDITOS IS NULL";
        } else if (this.getRbaImpCreditos() != null) {
            conditions += " AND RBA_IMP_CREDITOS = ?";
            values.add(this.getRbaImpCreditos());
        }

        if (this.getRbaImpValores() != null && this.getRbaImpValores().longValue() == -999) {
            conditions += " AND RBA_IMP_VALORES IS NULL";
        } else if (this.getRbaImpValores() != null) {
            conditions += " AND RBA_IMP_VALORES = ?";
            values.add(this.getRbaImpValores());
        }

        if (this.getRbaImpInmuebles() != null && this.getRbaImpInmuebles().longValue() == -999) {
            conditions += " AND RBA_IMP_INMUEBLES IS NULL";
        } else if (this.getRbaImpInmuebles() != null) {
            conditions += " AND RBA_IMP_INMUEBLES = ?";
            values.add(this.getRbaImpInmuebles());
        }

        if (this.getRbaImpEfectivo() != null && this.getRbaImpEfectivo().longValue() == -999) {
            conditions += " AND RBA_IMP_EFECTIVO IS NULL";
        } else if (this.getRbaImpEfectivo() != null) {
            conditions += " AND RBA_IMP_EFECTIVO = ?";
            values.add(this.getRbaImpEfectivo());
        }

        if (this.getRbaImpOtros() != null && this.getRbaImpOtros().longValue() == -999) {
            conditions += " AND RBA_IMP_OTROS IS NULL";
        } else if (this.getRbaImpOtros() != null) {
            conditions += " AND RBA_IMP_OTROS = ?";
            values.add(this.getRbaImpOtros());
        }

        if (this.getRbaImpFideicomitentes() != null && this.getRbaImpFideicomitentes().longValue() == -999) {
            conditions += " AND RBA_IMP_FIDEICOMITENTES IS NULL";
        } else if (this.getRbaImpFideicomitentes() != null) {
            conditions += " AND RBA_IMP_FIDEICOMITENTES = ?";
            values.add(this.getRbaImpFideicomitentes());
        }

        if (this.getRbaUsuario() != null && "null".equals(this.getRbaUsuario())) {
            conditions += " AND RBA_USUARIO IS NULL";
        } else if (this.getRbaUsuario() != null) {
            conditions += " AND RBA_USUARIO = ?";
            values.add(this.getRbaUsuario());
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
        String sql = "UPDATE REPORTE_BALANCE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RBA_TIPO_FISO = ?";
        pkValues.add(this.getRbaTipoFiso());
        conditions += " AND RBA_TIPO_NEGOCIO = ?";
        pkValues.add(this.getRbaTipoNegocio());
        conditions += " AND RBA_NUM_CONTRATO = ?";
        pkValues.add(this.getRbaNumContrato());
        fields += " RBA_NOM_CONTRATO = ?, ";
        values.add(this.getRbaNomContrato());
        fields += " RBA_ENC_CREDITOS = ?, ";
        values.add(this.getRbaEncCreditos());
        fields += " RBA_ENC_VALORES = ?, ";
        values.add(this.getRbaEncValores());
        fields += " RBA_ENC_INMUEBLES = ?, ";
        values.add(this.getRbaEncInmuebles());
        fields += " RBA_ENC_EFECTIVO = ?, ";
        values.add(this.getRbaEncEfectivo());
        fields += " RBA_ENC_OTROS = ?, ";
        values.add(this.getRbaEncOtros());
        fields += " RBA_ENC_FIEICOMITENTES = ?, ";
        values.add(this.getRbaEncFieicomitentes());
        fields += " RBA_IMP_CREDITOS = ?, ";
        values.add(this.getRbaImpCreditos());
        fields += " RBA_IMP_VALORES = ?, ";
        values.add(this.getRbaImpValores());
        fields += " RBA_IMP_INMUEBLES = ?, ";
        values.add(this.getRbaImpInmuebles());
        fields += " RBA_IMP_EFECTIVO = ?, ";
        values.add(this.getRbaImpEfectivo());
        fields += " RBA_IMP_OTROS = ?, ";
        values.add(this.getRbaImpOtros());
        fields += " RBA_IMP_FIDEICOMITENTES = ?, ";
        values.add(this.getRbaImpFideicomitentes());
        fields += " RBA_USUARIO = ?, ";
        values.add(this.getRbaUsuario());
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
        String sql = "INSERT INTO REPORTE_BALANCE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RBA_TIPO_FISO";
        fieldValues += ", ?";
        values.add(this.getRbaTipoFiso());

        fields += ", RBA_TIPO_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getRbaTipoNegocio());

        fields += ", RBA_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRbaNumContrato());

        fields += ", RBA_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRbaNomContrato());

        fields += ", RBA_ENC_CREDITOS";
        fieldValues += ", ?";
        values.add(this.getRbaEncCreditos());

        fields += ", RBA_ENC_VALORES";
        fieldValues += ", ?";
        values.add(this.getRbaEncValores());

        fields += ", RBA_ENC_INMUEBLES";
        fieldValues += ", ?";
        values.add(this.getRbaEncInmuebles());

        fields += ", RBA_ENC_EFECTIVO";
        fieldValues += ", ?";
        values.add(this.getRbaEncEfectivo());

        fields += ", RBA_ENC_OTROS";
        fieldValues += ", ?";
        values.add(this.getRbaEncOtros());

        fields += ", RBA_ENC_FIEICOMITENTES";
        fieldValues += ", ?";
        values.add(this.getRbaEncFieicomitentes());

        fields += ", RBA_IMP_CREDITOS";
        fieldValues += ", ?";
        values.add(this.getRbaImpCreditos());

        fields += ", RBA_IMP_VALORES";
        fieldValues += ", ?";
        values.add(this.getRbaImpValores());

        fields += ", RBA_IMP_INMUEBLES";
        fieldValues += ", ?";
        values.add(this.getRbaImpInmuebles());

        fields += ", RBA_IMP_EFECTIVO";
        fieldValues += ", ?";
        values.add(this.getRbaImpEfectivo());

        fields += ", RBA_IMP_OTROS";
        fieldValues += ", ?";
        values.add(this.getRbaImpOtros());

        fields += ", RBA_IMP_FIDEICOMITENTES";
        fieldValues += ", ?";
        values.add(this.getRbaImpFideicomitentes());

        fields += ", RBA_USUARIO";
        fieldValues += ", ?";
        values.add(this.getRbaUsuario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REPORTE_BALANCE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RBA_TIPO_FISO = ?";
        values.add(this.getRbaTipoFiso());
        conditions += " AND RBA_TIPO_NEGOCIO = ?";
        values.add(this.getRbaTipoNegocio());
        conditions += " AND RBA_NUM_CONTRATO = ?";
        values.add(this.getRbaNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        ReporteBalance instance = (ReporteBalance) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRbaTipoFiso().equals(instance.getRbaTipoFiso()))
            equalObjects = false;
        if (equalObjects && !this.getRbaTipoNegocio().equals(instance.getRbaTipoNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getRbaNumContrato().equals(instance.getRbaNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRbaNomContrato().equals(instance.getRbaNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRbaEncCreditos().equals(instance.getRbaEncCreditos()))
            equalObjects = false;
        if (equalObjects && !this.getRbaEncValores().equals(instance.getRbaEncValores()))
            equalObjects = false;
        if (equalObjects && !this.getRbaEncInmuebles().equals(instance.getRbaEncInmuebles()))
            equalObjects = false;
        if (equalObjects && !this.getRbaEncEfectivo().equals(instance.getRbaEncEfectivo()))
            equalObjects = false;
        if (equalObjects && !this.getRbaEncOtros().equals(instance.getRbaEncOtros()))
            equalObjects = false;
        if (equalObjects && !this.getRbaEncFieicomitentes().equals(instance.getRbaEncFieicomitentes()))
            equalObjects = false;
        if (equalObjects && !this.getRbaImpCreditos().equals(instance.getRbaImpCreditos()))
            equalObjects = false;
        if (equalObjects && !this.getRbaImpValores().equals(instance.getRbaImpValores()))
            equalObjects = false;
        if (equalObjects && !this.getRbaImpInmuebles().equals(instance.getRbaImpInmuebles()))
            equalObjects = false;
        if (equalObjects && !this.getRbaImpEfectivo().equals(instance.getRbaImpEfectivo()))
            equalObjects = false;
        if (equalObjects && !this.getRbaImpOtros().equals(instance.getRbaImpOtros()))
            equalObjects = false;
        if (equalObjects && !this.getRbaImpFideicomitentes().equals(instance.getRbaImpFideicomitentes()))
            equalObjects = false;
        if (equalObjects && !this.getRbaUsuario().equals(instance.getRbaUsuario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        ReporteBalance result = new ReporteBalance();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRbaTipoFiso((String) objectData.getData("RBA_TIPO_FISO"));
        result.setRbaTipoNegocio((String) objectData.getData("RBA_TIPO_NEGOCIO"));
        result.setRbaNumContrato((BigDecimal) objectData.getData("RBA_NUM_CONTRATO"));
        result.setRbaNomContrato((String) objectData.getData("RBA_NOM_CONTRATO"));
        result.setRbaEncCreditos((String) objectData.getData("RBA_ENC_CREDITOS"));
        result.setRbaEncValores((String) objectData.getData("RBA_ENC_VALORES"));
        result.setRbaEncInmuebles((String) objectData.getData("RBA_ENC_INMUEBLES"));
        result.setRbaEncEfectivo((String) objectData.getData("RBA_ENC_EFECTIVO"));
        result.setRbaEncOtros((String) objectData.getData("RBA_ENC_OTROS"));
        result.setRbaEncFieicomitentes((String) objectData.getData("RBA_ENC_FIEICOMITENTES"));
        result.setRbaImpCreditos((BigDecimal) objectData.getData("RBA_IMP_CREDITOS"));
        result.setRbaImpValores((BigDecimal) objectData.getData("RBA_IMP_VALORES"));
        result.setRbaImpInmuebles((BigDecimal) objectData.getData("RBA_IMP_INMUEBLES"));
        result.setRbaImpEfectivo((BigDecimal) objectData.getData("RBA_IMP_EFECTIVO"));
        result.setRbaImpOtros((BigDecimal) objectData.getData("RBA_IMP_OTROS"));
        result.setRbaImpFideicomitentes((BigDecimal) objectData.getData("RBA_IMP_FIDEICOMITENTES"));
        result.setRbaUsuario((String) objectData.getData("RBA_USUARIO"));

        return result;

    }

}
