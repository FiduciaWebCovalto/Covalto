package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REP_EJECUTIVO_PK", columns = { "REP_NUM_CONTRATO" }, sequences = { "MAX" })
public class RepEjecutivo extends DomainObject {

    BigDecimal repNumContrato = null;
    String repNomContrato = null;
    String repRegNalInvEx = null;
    BigDecimal repAnoApertura = null;
    BigDecimal repMesApertura = null;
    BigDecimal repDiaApertura = null;
    String repRegShcp = null;
    String repRegGobdf = null;
    String repNomActividad = null;
    String repDescNivel = null;
    BigDecimal repImpSaldoAct = null;

    public RepEjecutivo() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumContrato(BigDecimal repNumContrato) {
        this.repNumContrato = repNumContrato;
    }

    public BigDecimal getRepNumContrato() {
        return this.repNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepNomContrato(String repNomContrato) {
        this.repNomContrato = repNomContrato;
    }

    public String getRepNomContrato() {
        return this.repNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepRegNalInvEx(String repRegNalInvEx) {
        this.repRegNalInvEx = repRegNalInvEx;
    }

    public String getRepRegNalInvEx() {
        return this.repRegNalInvEx;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRepAnoApertura(BigDecimal repAnoApertura) {
        this.repAnoApertura = repAnoApertura;
    }

    public BigDecimal getRepAnoApertura() {
        return this.repAnoApertura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRepMesApertura(BigDecimal repMesApertura) {
        this.repMesApertura = repMesApertura;
    }

    public BigDecimal getRepMesApertura() {
        return this.repMesApertura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRepDiaApertura(BigDecimal repDiaApertura) {
        this.repDiaApertura = repDiaApertura;
    }

    public BigDecimal getRepDiaApertura() {
        return this.repDiaApertura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepRegShcp(String repRegShcp) {
        this.repRegShcp = repRegShcp;
    }

    public String getRepRegShcp() {
        return this.repRegShcp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepRegGobdf(String repRegGobdf) {
        this.repRegGobdf = repRegGobdf;
    }

    public String getRepRegGobdf() {
        return this.repRegGobdf;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepNomActividad(String repNomActividad) {
        this.repNomActividad = repNomActividad;
    }

    public String getRepNomActividad() {
        return this.repNomActividad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepDescNivel(String repDescNivel) {
        this.repDescNivel = repDescNivel;
    }

    public String getRepDescNivel() {
        return this.repDescNivel;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRepImpSaldoAct(BigDecimal repImpSaldoAct) {
        this.repImpSaldoAct = repImpSaldoAct;
    }

    public BigDecimal getRepImpSaldoAct() {
        return this.repImpSaldoAct;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REP_EJECUTIVO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRepNumContrato() != null && this.getRepNumContrato().longValue() == -999) {
            conditions += " AND REP_NUM_CONTRATO IS NULL";
        } else if (this.getRepNumContrato() != null) {
            conditions += " AND REP_NUM_CONTRATO = ?";
            values.add(this.getRepNumContrato());
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
        String sql = "SELECT * FROM REP_EJECUTIVO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRepNumContrato() != null && this.getRepNumContrato().longValue() == -999) {
            conditions += " AND REP_NUM_CONTRATO IS NULL";
        } else if (this.getRepNumContrato() != null) {
            conditions += " AND REP_NUM_CONTRATO = ?";
            values.add(this.getRepNumContrato());
        }

        if (this.getRepNomContrato() != null && "null".equals(this.getRepNomContrato())) {
            conditions += " AND REP_NOM_CONTRATO IS NULL";
        } else if (this.getRepNomContrato() != null) {
            conditions += " AND REP_NOM_CONTRATO = ?";
            values.add(this.getRepNomContrato());
        }

        if (this.getRepRegNalInvEx() != null && "null".equals(this.getRepRegNalInvEx())) {
            conditions += " AND REP_REG_NAL_INV_EX IS NULL";
        } else if (this.getRepRegNalInvEx() != null) {
            conditions += " AND REP_REG_NAL_INV_EX = ?";
            values.add(this.getRepRegNalInvEx());
        }

        if (this.getRepAnoApertura() != null && this.getRepAnoApertura().longValue() == -999) {
            conditions += " AND REP_ANO_APERTURA IS NULL";
        } else if (this.getRepAnoApertura() != null) {
            conditions += " AND REP_ANO_APERTURA = ?";
            values.add(this.getRepAnoApertura());
        }

        if (this.getRepMesApertura() != null && this.getRepMesApertura().longValue() == -999) {
            conditions += " AND REP_MES_APERTURA IS NULL";
        } else if (this.getRepMesApertura() != null) {
            conditions += " AND REP_MES_APERTURA = ?";
            values.add(this.getRepMesApertura());
        }

        if (this.getRepDiaApertura() != null && this.getRepDiaApertura().longValue() == -999) {
            conditions += " AND REP_DIA_APERTURA IS NULL";
        } else if (this.getRepDiaApertura() != null) {
            conditions += " AND REP_DIA_APERTURA = ?";
            values.add(this.getRepDiaApertura());
        }

        if (this.getRepRegShcp() != null && "null".equals(this.getRepRegShcp())) {
            conditions += " AND REP_REG_SHCP IS NULL";
        } else if (this.getRepRegShcp() != null) {
            conditions += " AND REP_REG_SHCP = ?";
            values.add(this.getRepRegShcp());
        }

        if (this.getRepRegGobdf() != null && "null".equals(this.getRepRegGobdf())) {
            conditions += " AND REP_REG_GOBDF IS NULL";
        } else if (this.getRepRegGobdf() != null) {
            conditions += " AND REP_REG_GOBDF = ?";
            values.add(this.getRepRegGobdf());
        }

        if (this.getRepNomActividad() != null && "null".equals(this.getRepNomActividad())) {
            conditions += " AND REP_NOM_ACTIVIDAD IS NULL";
        } else if (this.getRepNomActividad() != null) {
            conditions += " AND REP_NOM_ACTIVIDAD = ?";
            values.add(this.getRepNomActividad());
        }

        if (this.getRepDescNivel() != null && "null".equals(this.getRepDescNivel())) {
            conditions += " AND REP_DESC_NIVEL IS NULL";
        } else if (this.getRepDescNivel() != null) {
            conditions += " AND REP_DESC_NIVEL = ?";
            values.add(this.getRepDescNivel());
        }

        if (this.getRepImpSaldoAct() != null && this.getRepImpSaldoAct().longValue() == -999) {
            conditions += " AND REP_IMP_SALDO_ACT IS NULL";
        } else if (this.getRepImpSaldoAct() != null) {
            conditions += " AND REP_IMP_SALDO_ACT = ?";
            values.add(this.getRepImpSaldoAct());
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
        String sql = "UPDATE REP_EJECUTIVO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REP_NUM_CONTRATO = ?";
        pkValues.add(this.getRepNumContrato());
        fields += " REP_NOM_CONTRATO = ?, ";
        values.add(this.getRepNomContrato());
        fields += " REP_REG_NAL_INV_EX = ?, ";
        values.add(this.getRepRegNalInvEx());
        fields += " REP_ANO_APERTURA = ?, ";
        values.add(this.getRepAnoApertura());
        fields += " REP_MES_APERTURA = ?, ";
        values.add(this.getRepMesApertura());
        fields += " REP_DIA_APERTURA = ?, ";
        values.add(this.getRepDiaApertura());
        fields += " REP_REG_SHCP = ?, ";
        values.add(this.getRepRegShcp());
        fields += " REP_REG_GOBDF = ?, ";
        values.add(this.getRepRegGobdf());
        fields += " REP_NOM_ACTIVIDAD = ?, ";
        values.add(this.getRepNomActividad());
        fields += " REP_DESC_NIVEL = ?, ";
        values.add(this.getRepDescNivel());
        fields += " REP_IMP_SALDO_ACT = ?, ";
        values.add(this.getRepImpSaldoAct());
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
        String sql = "INSERT INTO REP_EJECUTIVO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REP_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRepNumContrato());

        fields += ", REP_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRepNomContrato());

        fields += ", REP_REG_NAL_INV_EX";
        fieldValues += ", ?";
        values.add(this.getRepRegNalInvEx());

        fields += ", REP_ANO_APERTURA";
        fieldValues += ", ?";
        values.add(this.getRepAnoApertura());

        fields += ", REP_MES_APERTURA";
        fieldValues += ", ?";
        values.add(this.getRepMesApertura());

        fields += ", REP_DIA_APERTURA";
        fieldValues += ", ?";
        values.add(this.getRepDiaApertura());

        fields += ", REP_REG_SHCP";
        fieldValues += ", ?";
        values.add(this.getRepRegShcp());

        fields += ", REP_REG_GOBDF";
        fieldValues += ", ?";
        values.add(this.getRepRegGobdf());

        fields += ", REP_NOM_ACTIVIDAD";
        fieldValues += ", ?";
        values.add(this.getRepNomActividad());

        fields += ", REP_DESC_NIVEL";
        fieldValues += ", ?";
        values.add(this.getRepDescNivel());

        fields += ", REP_IMP_SALDO_ACT";
        fieldValues += ", ?";
        values.add(this.getRepImpSaldoAct());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REP_EJECUTIVO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REP_NUM_CONTRATO = ?";
        values.add(this.getRepNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        RepEjecutivo instance = (RepEjecutivo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRepNumContrato().equals(instance.getRepNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRepNomContrato().equals(instance.getRepNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRepRegNalInvEx().equals(instance.getRepRegNalInvEx()))
            equalObjects = false;
        if (equalObjects && !this.getRepAnoApertura().equals(instance.getRepAnoApertura()))
            equalObjects = false;
        if (equalObjects && !this.getRepMesApertura().equals(instance.getRepMesApertura()))
            equalObjects = false;
        if (equalObjects && !this.getRepDiaApertura().equals(instance.getRepDiaApertura()))
            equalObjects = false;
        if (equalObjects && !this.getRepRegShcp().equals(instance.getRepRegShcp()))
            equalObjects = false;
        if (equalObjects && !this.getRepRegGobdf().equals(instance.getRepRegGobdf()))
            equalObjects = false;
        if (equalObjects && !this.getRepNomActividad().equals(instance.getRepNomActividad()))
            equalObjects = false;
        if (equalObjects && !this.getRepDescNivel().equals(instance.getRepDescNivel()))
            equalObjects = false;
        if (equalObjects && !this.getRepImpSaldoAct().equals(instance.getRepImpSaldoAct()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        RepEjecutivo result = new RepEjecutivo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRepNumContrato((BigDecimal) objectData.getData("REP_NUM_CONTRATO"));
        result.setRepNomContrato((String) objectData.getData("REP_NOM_CONTRATO"));
        result.setRepRegNalInvEx((String) objectData.getData("REP_REG_NAL_INV_EX"));
        result.setRepAnoApertura((BigDecimal) objectData.getData("REP_ANO_APERTURA"));
        result.setRepMesApertura((BigDecimal) objectData.getData("REP_MES_APERTURA"));
        result.setRepDiaApertura((BigDecimal) objectData.getData("REP_DIA_APERTURA"));
        result.setRepRegShcp((String) objectData.getData("REP_REG_SHCP"));
        result.setRepRegGobdf((String) objectData.getData("REP_REG_GOBDF"));
        result.setRepNomActividad((String) objectData.getData("REP_NOM_ACTIVIDAD"));
        result.setRepDescNivel((String) objectData.getData("REP_DESC_NIVEL"));
        result.setRepImpSaldoAct((BigDecimal) objectData.getData("REP_IMP_SALDO_ACT"));

        return result;

    }

}
