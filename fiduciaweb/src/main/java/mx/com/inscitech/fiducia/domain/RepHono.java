package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REP_HONO_PK", columns = { "RHO_NUM_CONTRATO", "RHO_NOM_CONTRATO", "RHO_ANO", "RHO_MES" }, sequences = { "MANUAL" })
public class RepHono extends DomainObject {

    BigDecimal rhoNumContrato = null;
    String rhoNomContrato = null;
    BigDecimal rhoAno = null;
    BigDecimal rhoMes = null;
    BigDecimal rhoDevMensual = null;
    BigDecimal rhoPagMensual = null;
    BigDecimal rhoTotMensual = null;
    BigDecimal rhoDevAcumulado = null;
    BigDecimal rhoPagAcumulado = null;
    BigDecimal rhoTotAcumulado = null;

    public RepHono() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRhoNumContrato(BigDecimal rhoNumContrato) {
        this.rhoNumContrato = rhoNumContrato;
    }

    public BigDecimal getRhoNumContrato() {
        return this.rhoNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRhoNomContrato(String rhoNomContrato) {
        this.rhoNomContrato = rhoNomContrato;
    }

    public String getRhoNomContrato() {
        return this.rhoNomContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRhoAno(BigDecimal rhoAno) {
        this.rhoAno = rhoAno;
    }

    public BigDecimal getRhoAno() {
        return this.rhoAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRhoMes(BigDecimal rhoMes) {
        this.rhoMes = rhoMes;
    }

    public BigDecimal getRhoMes() {
        return this.rhoMes;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRhoDevMensual(BigDecimal rhoDevMensual) {
        this.rhoDevMensual = rhoDevMensual;
    }

    public BigDecimal getRhoDevMensual() {
        return this.rhoDevMensual;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRhoPagMensual(BigDecimal rhoPagMensual) {
        this.rhoPagMensual = rhoPagMensual;
    }

    public BigDecimal getRhoPagMensual() {
        return this.rhoPagMensual;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRhoTotMensual(BigDecimal rhoTotMensual) {
        this.rhoTotMensual = rhoTotMensual;
    }

    public BigDecimal getRhoTotMensual() {
        return this.rhoTotMensual;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRhoDevAcumulado(BigDecimal rhoDevAcumulado) {
        this.rhoDevAcumulado = rhoDevAcumulado;
    }

    public BigDecimal getRhoDevAcumulado() {
        return this.rhoDevAcumulado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRhoPagAcumulado(BigDecimal rhoPagAcumulado) {
        this.rhoPagAcumulado = rhoPagAcumulado;
    }

    public BigDecimal getRhoPagAcumulado() {
        return this.rhoPagAcumulado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRhoTotAcumulado(BigDecimal rhoTotAcumulado) {
        this.rhoTotAcumulado = rhoTotAcumulado;
    }

    public BigDecimal getRhoTotAcumulado() {
        return this.rhoTotAcumulado;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REP_HONO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRhoNumContrato() != null && this.getRhoNumContrato().longValue() == -999) {
            conditions += " AND RHO_NUM_CONTRATO IS NULL";
        } else if (this.getRhoNumContrato() != null) {
            conditions += " AND RHO_NUM_CONTRATO = ?";
            values.add(this.getRhoNumContrato());
        }

        if (this.getRhoNomContrato() != null && "null".equals(this.getRhoNomContrato())) {
            conditions += " AND RHO_NOM_CONTRATO IS NULL";
        } else if (this.getRhoNomContrato() != null) {
            conditions += " AND RHO_NOM_CONTRATO = ?";
            values.add(this.getRhoNomContrato());
        }

        if (this.getRhoAno() != null && this.getRhoAno().longValue() == -999) {
            conditions += " AND RHO_ANO IS NULL";
        } else if (this.getRhoAno() != null) {
            conditions += " AND RHO_ANO = ?";
            values.add(this.getRhoAno());
        }

        if (this.getRhoMes() != null && this.getRhoMes().longValue() == -999) {
            conditions += " AND RHO_MES IS NULL";
        } else if (this.getRhoMes() != null) {
            conditions += " AND RHO_MES = ?";
            values.add(this.getRhoMes());
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
        String sql = "SELECT * FROM REP_HONO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRhoNumContrato() != null && this.getRhoNumContrato().longValue() == -999) {
            conditions += " AND RHO_NUM_CONTRATO IS NULL";
        } else if (this.getRhoNumContrato() != null) {
            conditions += " AND RHO_NUM_CONTRATO = ?";
            values.add(this.getRhoNumContrato());
        }

        if (this.getRhoNomContrato() != null && "null".equals(this.getRhoNomContrato())) {
            conditions += " AND RHO_NOM_CONTRATO IS NULL";
        } else if (this.getRhoNomContrato() != null) {
            conditions += " AND RHO_NOM_CONTRATO = ?";
            values.add(this.getRhoNomContrato());
        }

        if (this.getRhoAno() != null && this.getRhoAno().longValue() == -999) {
            conditions += " AND RHO_ANO IS NULL";
        } else if (this.getRhoAno() != null) {
            conditions += " AND RHO_ANO = ?";
            values.add(this.getRhoAno());
        }

        if (this.getRhoMes() != null && this.getRhoMes().longValue() == -999) {
            conditions += " AND RHO_MES IS NULL";
        } else if (this.getRhoMes() != null) {
            conditions += " AND RHO_MES = ?";
            values.add(this.getRhoMes());
        }

        if (this.getRhoDevMensual() != null && this.getRhoDevMensual().longValue() == -999) {
            conditions += " AND RHO_DEV_MENSUAL IS NULL";
        } else if (this.getRhoDevMensual() != null) {
            conditions += " AND RHO_DEV_MENSUAL = ?";
            values.add(this.getRhoDevMensual());
        }

        if (this.getRhoPagMensual() != null && this.getRhoPagMensual().longValue() == -999) {
            conditions += " AND RHO_PAG_MENSUAL IS NULL";
        } else if (this.getRhoPagMensual() != null) {
            conditions += " AND RHO_PAG_MENSUAL = ?";
            values.add(this.getRhoPagMensual());
        }

        if (this.getRhoTotMensual() != null && this.getRhoTotMensual().longValue() == -999) {
            conditions += " AND RHO_TOT_MENSUAL IS NULL";
        } else if (this.getRhoTotMensual() != null) {
            conditions += " AND RHO_TOT_MENSUAL = ?";
            values.add(this.getRhoTotMensual());
        }

        if (this.getRhoDevAcumulado() != null && this.getRhoDevAcumulado().longValue() == -999) {
            conditions += " AND RHO_DEV_ACUMULADO IS NULL";
        } else if (this.getRhoDevAcumulado() != null) {
            conditions += " AND RHO_DEV_ACUMULADO = ?";
            values.add(this.getRhoDevAcumulado());
        }

        if (this.getRhoPagAcumulado() != null && this.getRhoPagAcumulado().longValue() == -999) {
            conditions += " AND RHO_PAG_ACUMULADO IS NULL";
        } else if (this.getRhoPagAcumulado() != null) {
            conditions += " AND RHO_PAG_ACUMULADO = ?";
            values.add(this.getRhoPagAcumulado());
        }

        if (this.getRhoTotAcumulado() != null && this.getRhoTotAcumulado().longValue() == -999) {
            conditions += " AND RHO_TOT_ACUMULADO IS NULL";
        } else if (this.getRhoTotAcumulado() != null) {
            conditions += " AND RHO_TOT_ACUMULADO = ?";
            values.add(this.getRhoTotAcumulado());
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
        String sql = "UPDATE REP_HONO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RHO_NUM_CONTRATO = ?";
        pkValues.add(this.getRhoNumContrato());
        conditions += " AND RHO_NOM_CONTRATO = ?";
        pkValues.add(this.getRhoNomContrato());
        conditions += " AND RHO_ANO = ?";
        pkValues.add(this.getRhoAno());
        conditions += " AND RHO_MES = ?";
        pkValues.add(this.getRhoMes());
        fields += " RHO_DEV_MENSUAL = ?, ";
        values.add(this.getRhoDevMensual());
        fields += " RHO_PAG_MENSUAL = ?, ";
        values.add(this.getRhoPagMensual());
        fields += " RHO_TOT_MENSUAL = ?, ";
        values.add(this.getRhoTotMensual());
        fields += " RHO_DEV_ACUMULADO = ?, ";
        values.add(this.getRhoDevAcumulado());
        fields += " RHO_PAG_ACUMULADO = ?, ";
        values.add(this.getRhoPagAcumulado());
        fields += " RHO_TOT_ACUMULADO = ?, ";
        values.add(this.getRhoTotAcumulado());
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
        String sql = "INSERT INTO REP_HONO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RHO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRhoNumContrato());

        fields += ", RHO_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRhoNomContrato());

        fields += ", RHO_ANO";
        fieldValues += ", ?";
        values.add(this.getRhoAno());

        fields += ", RHO_MES";
        fieldValues += ", ?";
        values.add(this.getRhoMes());

        fields += ", RHO_DEV_MENSUAL";
        fieldValues += ", ?";
        values.add(this.getRhoDevMensual());

        fields += ", RHO_PAG_MENSUAL";
        fieldValues += ", ?";
        values.add(this.getRhoPagMensual());

        fields += ", RHO_TOT_MENSUAL";
        fieldValues += ", ?";
        values.add(this.getRhoTotMensual());

        fields += ", RHO_DEV_ACUMULADO";
        fieldValues += ", ?";
        values.add(this.getRhoDevAcumulado());

        fields += ", RHO_PAG_ACUMULADO";
        fieldValues += ", ?";
        values.add(this.getRhoPagAcumulado());

        fields += ", RHO_TOT_ACUMULADO";
        fieldValues += ", ?";
        values.add(this.getRhoTotAcumulado());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REP_HONO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RHO_NUM_CONTRATO = ?";
        values.add(this.getRhoNumContrato());
        conditions += " AND RHO_NOM_CONTRATO = ?";
        values.add(this.getRhoNomContrato());
        conditions += " AND RHO_ANO = ?";
        values.add(this.getRhoAno());
        conditions += " AND RHO_MES = ?";
        values.add(this.getRhoMes());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        RepHono instance = (RepHono) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRhoNumContrato().equals(instance.getRhoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRhoNomContrato().equals(instance.getRhoNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRhoAno().equals(instance.getRhoAno()))
            equalObjects = false;
        if (equalObjects && !this.getRhoMes().equals(instance.getRhoMes()))
            equalObjects = false;
        if (equalObjects && !this.getRhoDevMensual().equals(instance.getRhoDevMensual()))
            equalObjects = false;
        if (equalObjects && !this.getRhoPagMensual().equals(instance.getRhoPagMensual()))
            equalObjects = false;
        if (equalObjects && !this.getRhoTotMensual().equals(instance.getRhoTotMensual()))
            equalObjects = false;
        if (equalObjects && !this.getRhoDevAcumulado().equals(instance.getRhoDevAcumulado()))
            equalObjects = false;
        if (equalObjects && !this.getRhoPagAcumulado().equals(instance.getRhoPagAcumulado()))
            equalObjects = false;
        if (equalObjects && !this.getRhoTotAcumulado().equals(instance.getRhoTotAcumulado()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        RepHono result = new RepHono();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRhoNumContrato((BigDecimal) objectData.getData("RHO_NUM_CONTRATO"));
        result.setRhoNomContrato((String) objectData.getData("RHO_NOM_CONTRATO"));
        result.setRhoAno((BigDecimal) objectData.getData("RHO_ANO"));
        result.setRhoMes((BigDecimal) objectData.getData("RHO_MES"));
        result.setRhoDevMensual((BigDecimal) objectData.getData("RHO_DEV_MENSUAL"));
        result.setRhoPagMensual((BigDecimal) objectData.getData("RHO_PAG_MENSUAL"));
        result.setRhoTotMensual((BigDecimal) objectData.getData("RHO_TOT_MENSUAL"));
        result.setRhoDevAcumulado((BigDecimal) objectData.getData("RHO_DEV_ACUMULADO"));
        result.setRhoPagAcumulado((BigDecimal) objectData.getData("RHO_PAG_ACUMULADO"));
        result.setRhoTotAcumulado((BigDecimal) objectData.getData("RHO_TOT_ACUMULADO"));

        return result;

    }

}
