package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "NOMREGOP_PK", columns = { "NRO_NUM_CONTRATO", "NRO_TIPO_REGLA" }, sequences = { "MANUAL" })
public class Nomregop extends DomainObject {

    BigDecimal nroNumContrato = null;
    String nroTipoRegla = null;
    String nroNomRegla = null;
    String nroRespElab = null;
    String nroFechaEspElab = null;
    String nroFecElab = null;
    String nroRespRevision = null;
    String nroFecEspRev = null;
    String nroFecRevision = null;
    String nroRespAprob = null;
    String nroFecEspAprob = null;
    String nroFecAprob = null;
    BigDecimal nroAnoAltaReg = null;
    BigDecimal nroMesAltaReg = null;
    BigDecimal nroDiaAltaReg = null;
    BigDecimal nroAnoUltMod = null;
    BigDecimal nroMesUltMod = null;
    BigDecimal nroDiaUltMod = null;
    String nroCveStNomrego = null;

    public Nomregop() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setNroNumContrato(BigDecimal nroNumContrato) {
        this.nroNumContrato = nroNumContrato;
    }

    public BigDecimal getNroNumContrato() {
        return this.nroNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroTipoRegla(String nroTipoRegla) {
        this.nroTipoRegla = nroTipoRegla;
    }

    public String getNroTipoRegla() {
        return this.nroTipoRegla;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroNomRegla(String nroNomRegla) {
        this.nroNomRegla = nroNomRegla;
    }

    public String getNroNomRegla() {
        return this.nroNomRegla;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroRespElab(String nroRespElab) {
        this.nroRespElab = nroRespElab;
    }

    public String getNroRespElab() {
        return this.nroRespElab;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroFechaEspElab(String nroFechaEspElab) {
        this.nroFechaEspElab = nroFechaEspElab;
    }

    public String getNroFechaEspElab() {
        return this.nroFechaEspElab;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroFecElab(String nroFecElab) {
        this.nroFecElab = nroFecElab;
    }

    public String getNroFecElab() {
        return this.nroFecElab;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroRespRevision(String nroRespRevision) {
        this.nroRespRevision = nroRespRevision;
    }

    public String getNroRespRevision() {
        return this.nroRespRevision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroFecEspRev(String nroFecEspRev) {
        this.nroFecEspRev = nroFecEspRev;
    }

    public String getNroFecEspRev() {
        return this.nroFecEspRev;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroFecRevision(String nroFecRevision) {
        this.nroFecRevision = nroFecRevision;
    }

    public String getNroFecRevision() {
        return this.nroFecRevision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroRespAprob(String nroRespAprob) {
        this.nroRespAprob = nroRespAprob;
    }

    public String getNroRespAprob() {
        return this.nroRespAprob;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroFecEspAprob(String nroFecEspAprob) {
        this.nroFecEspAprob = nroFecEspAprob;
    }

    public String getNroFecEspAprob() {
        return this.nroFecEspAprob;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroFecAprob(String nroFecAprob) {
        this.nroFecAprob = nroFecAprob;
    }

    public String getNroFecAprob() {
        return this.nroFecAprob;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setNroAnoAltaReg(BigDecimal nroAnoAltaReg) {
        this.nroAnoAltaReg = nroAnoAltaReg;
    }

    public BigDecimal getNroAnoAltaReg() {
        return this.nroAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNroMesAltaReg(BigDecimal nroMesAltaReg) {
        this.nroMesAltaReg = nroMesAltaReg;
    }

    public BigDecimal getNroMesAltaReg() {
        return this.nroMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNroDiaAltaReg(BigDecimal nroDiaAltaReg) {
        this.nroDiaAltaReg = nroDiaAltaReg;
    }

    public BigDecimal getNroDiaAltaReg() {
        return this.nroDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setNroAnoUltMod(BigDecimal nroAnoUltMod) {
        this.nroAnoUltMod = nroAnoUltMod;
    }

    public BigDecimal getNroAnoUltMod() {
        return this.nroAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNroMesUltMod(BigDecimal nroMesUltMod) {
        this.nroMesUltMod = nroMesUltMod;
    }

    public BigDecimal getNroMesUltMod() {
        return this.nroMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setNroDiaUltMod(BigDecimal nroDiaUltMod) {
        this.nroDiaUltMod = nroDiaUltMod;
    }

    public BigDecimal getNroDiaUltMod() {
        return this.nroDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setNroCveStNomrego(String nroCveStNomrego) {
        this.nroCveStNomrego = nroCveStNomrego;
    }

    public String getNroCveStNomrego() {
        return this.nroCveStNomrego;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM NOMREGOP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getNroNumContrato() != null && this.getNroNumContrato().longValue() == -999) {
            conditions += " AND NRO_NUM_CONTRATO IS NULL";
        } else if (this.getNroNumContrato() != null) {
            conditions += " AND NRO_NUM_CONTRATO = ?";
            values.add(this.getNroNumContrato());
        }

        if (this.getNroTipoRegla() != null && "null".equals(this.getNroTipoRegla())) {
            conditions += " AND NRO_TIPO_REGLA IS NULL";
        } else if (this.getNroTipoRegla() != null) {
            conditions += " AND NRO_TIPO_REGLA = ?";
            values.add(this.getNroTipoRegla());
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
        String sql = "SELECT * FROM NOMREGOP ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getNroNumContrato() != null && this.getNroNumContrato().longValue() == -999) {
            conditions += " AND NRO_NUM_CONTRATO IS NULL";
        } else if (this.getNroNumContrato() != null) {
            conditions += " AND NRO_NUM_CONTRATO = ?";
            values.add(this.getNroNumContrato());
        }

        if (this.getNroTipoRegla() != null && "null".equals(this.getNroTipoRegla())) {
            conditions += " AND NRO_TIPO_REGLA IS NULL";
        } else if (this.getNroTipoRegla() != null) {
            conditions += " AND NRO_TIPO_REGLA = ?";
            values.add(this.getNroTipoRegla());
        }

        if (this.getNroNomRegla() != null && "null".equals(this.getNroNomRegla())) {
            conditions += " AND NRO_NOM_REGLA IS NULL";
        } else if (this.getNroNomRegla() != null) {
            conditions += " AND NRO_NOM_REGLA = ?";
            values.add(this.getNroNomRegla());
        }

        if (this.getNroRespElab() != null && "null".equals(this.getNroRespElab())) {
            conditions += " AND NRO_RESP_ELAB IS NULL";
        } else if (this.getNroRespElab() != null) {
            conditions += " AND NRO_RESP_ELAB = ?";
            values.add(this.getNroRespElab());
        }

        if (this.getNroFechaEspElab() != null && "null".equals(this.getNroFechaEspElab())) {
            conditions += " AND NRO_FECHA_ESP_ELAB IS NULL";
        } else if (this.getNroFechaEspElab() != null) {
            conditions += " AND NRO_FECHA_ESP_ELAB = ?";
            values.add(this.getNroFechaEspElab());
        }

        if (this.getNroFecElab() != null && "null".equals(this.getNroFecElab())) {
            conditions += " AND NRO_FEC_ELAB IS NULL";
        } else if (this.getNroFecElab() != null) {
            conditions += " AND NRO_FEC_ELAB = ?";
            values.add(this.getNroFecElab());
        }

        if (this.getNroRespRevision() != null && "null".equals(this.getNroRespRevision())) {
            conditions += " AND NRO_RESP_REVISION IS NULL";
        } else if (this.getNroRespRevision() != null) {
            conditions += " AND NRO_RESP_REVISION = ?";
            values.add(this.getNroRespRevision());
        }

        if (this.getNroFecEspRev() != null && "null".equals(this.getNroFecEspRev())) {
            conditions += " AND NRO_FEC_ESP_REV IS NULL";
        } else if (this.getNroFecEspRev() != null) {
            conditions += " AND NRO_FEC_ESP_REV = ?";
            values.add(this.getNroFecEspRev());
        }

        if (this.getNroFecRevision() != null && "null".equals(this.getNroFecRevision())) {
            conditions += " AND NRO_FEC_REVISION IS NULL";
        } else if (this.getNroFecRevision() != null) {
            conditions += " AND NRO_FEC_REVISION = ?";
            values.add(this.getNroFecRevision());
        }

        if (this.getNroRespAprob() != null && "null".equals(this.getNroRespAprob())) {
            conditions += " AND NRO_RESP_APROB IS NULL";
        } else if (this.getNroRespAprob() != null) {
            conditions += " AND NRO_RESP_APROB = ?";
            values.add(this.getNroRespAprob());
        }

        if (this.getNroFecEspAprob() != null && "null".equals(this.getNroFecEspAprob())) {
            conditions += " AND NRO_FEC_ESP_APROB IS NULL";
        } else if (this.getNroFecEspAprob() != null) {
            conditions += " AND NRO_FEC_ESP_APROB = ?";
            values.add(this.getNroFecEspAprob());
        }

        if (this.getNroFecAprob() != null && "null".equals(this.getNroFecAprob())) {
            conditions += " AND NRO_FEC_APROB IS NULL";
        } else if (this.getNroFecAprob() != null) {
            conditions += " AND NRO_FEC_APROB = ?";
            values.add(this.getNroFecAprob());
        }

        if (this.getNroAnoAltaReg() != null && this.getNroAnoAltaReg().longValue() == -999) {
            conditions += " AND NRO_ANO_ALTA_REG IS NULL";
        } else if (this.getNroAnoAltaReg() != null) {
            conditions += " AND NRO_ANO_ALTA_REG = ?";
            values.add(this.getNroAnoAltaReg());
        }

        if (this.getNroMesAltaReg() != null && this.getNroMesAltaReg().longValue() == -999) {
            conditions += " AND NRO_MES_ALTA_REG IS NULL";
        } else if (this.getNroMesAltaReg() != null) {
            conditions += " AND NRO_MES_ALTA_REG = ?";
            values.add(this.getNroMesAltaReg());
        }

        if (this.getNroDiaAltaReg() != null && this.getNroDiaAltaReg().longValue() == -999) {
            conditions += " AND NRO_DIA_ALTA_REG IS NULL";
        } else if (this.getNroDiaAltaReg() != null) {
            conditions += " AND NRO_DIA_ALTA_REG = ?";
            values.add(this.getNroDiaAltaReg());
        }

        if (this.getNroAnoUltMod() != null && this.getNroAnoUltMod().longValue() == -999) {
            conditions += " AND NRO_ANO_ULT_MOD IS NULL";
        } else if (this.getNroAnoUltMod() != null) {
            conditions += " AND NRO_ANO_ULT_MOD = ?";
            values.add(this.getNroAnoUltMod());
        }

        if (this.getNroMesUltMod() != null && this.getNroMesUltMod().longValue() == -999) {
            conditions += " AND NRO_MES_ULT_MOD IS NULL";
        } else if (this.getNroMesUltMod() != null) {
            conditions += " AND NRO_MES_ULT_MOD = ?";
            values.add(this.getNroMesUltMod());
        }

        if (this.getNroDiaUltMod() != null && this.getNroDiaUltMod().longValue() == -999) {
            conditions += " AND NRO_DIA_ULT_MOD IS NULL";
        } else if (this.getNroDiaUltMod() != null) {
            conditions += " AND NRO_DIA_ULT_MOD = ?";
            values.add(this.getNroDiaUltMod());
        }

        if (this.getNroCveStNomrego() != null && "null".equals(this.getNroCveStNomrego())) {
            conditions += " AND NRO_CVE_ST_NOMREGO IS NULL";
        } else if (this.getNroCveStNomrego() != null) {
            conditions += " AND NRO_CVE_ST_NOMREGO = ?";
            values.add(this.getNroCveStNomrego());
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
        String sql = "UPDATE NOMREGOP SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND NRO_NUM_CONTRATO = ?";
        pkValues.add(this.getNroNumContrato());
        conditions += " AND NRO_TIPO_REGLA = ?";
        pkValues.add(this.getNroTipoRegla());
        fields += " NRO_NOM_REGLA = ?, ";
        values.add(this.getNroNomRegla());
        fields += " NRO_RESP_ELAB = ?, ";
        values.add(this.getNroRespElab());
        fields += " NRO_FECHA_ESP_ELAB = ?, ";
        values.add(this.getNroFechaEspElab());
        fields += " NRO_FEC_ELAB = ?, ";
        values.add(this.getNroFecElab());
        fields += " NRO_RESP_REVISION = ?, ";
        values.add(this.getNroRespRevision());
        fields += " NRO_FEC_ESP_REV = ?, ";
        values.add(this.getNroFecEspRev());
        fields += " NRO_FEC_REVISION = ?, ";
        values.add(this.getNroFecRevision());
        fields += " NRO_RESP_APROB = ?, ";
        values.add(this.getNroRespAprob());
        fields += " NRO_FEC_ESP_APROB = ?, ";
        values.add(this.getNroFecEspAprob());
        fields += " NRO_FEC_APROB = ?, ";
        values.add(this.getNroFecAprob());
        fields += " NRO_ANO_ALTA_REG = ?, ";
        values.add(this.getNroAnoAltaReg());
        fields += " NRO_MES_ALTA_REG = ?, ";
        values.add(this.getNroMesAltaReg());
        fields += " NRO_DIA_ALTA_REG = ?, ";
        values.add(this.getNroDiaAltaReg());
        fields += " NRO_ANO_ULT_MOD = ?, ";
        values.add(this.getNroAnoUltMod());
        fields += " NRO_MES_ULT_MOD = ?, ";
        values.add(this.getNroMesUltMod());
        fields += " NRO_DIA_ULT_MOD = ?, ";
        values.add(this.getNroDiaUltMod());
        fields += " NRO_CVE_ST_NOMREGO = ?, ";
        values.add(this.getNroCveStNomrego());
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
        String sql = "INSERT INTO NOMREGOP ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", NRO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getNroNumContrato());

        fields += ", NRO_TIPO_REGLA";
        fieldValues += ", ?";
        values.add(this.getNroTipoRegla());

        fields += ", NRO_NOM_REGLA";
        fieldValues += ", ?";
        values.add(this.getNroNomRegla());

        fields += ", NRO_RESP_ELAB";
        fieldValues += ", ?";
        values.add(this.getNroRespElab());

        fields += ", NRO_FECHA_ESP_ELAB";
        fieldValues += ", ?";
        values.add(this.getNroFechaEspElab());

        fields += ", NRO_FEC_ELAB";
        fieldValues += ", ?";
        values.add(this.getNroFecElab());

        fields += ", NRO_RESP_REVISION";
        fieldValues += ", ?";
        values.add(this.getNroRespRevision());

        fields += ", NRO_FEC_ESP_REV";
        fieldValues += ", ?";
        values.add(this.getNroFecEspRev());

        fields += ", NRO_FEC_REVISION";
        fieldValues += ", ?";
        values.add(this.getNroFecRevision());

        fields += ", NRO_RESP_APROB";
        fieldValues += ", ?";
        values.add(this.getNroRespAprob());

        fields += ", NRO_FEC_ESP_APROB";
        fieldValues += ", ?";
        values.add(this.getNroFecEspAprob());

        fields += ", NRO_FEC_APROB";
        fieldValues += ", ?";
        values.add(this.getNroFecAprob());

        fields += ", NRO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNroAnoAltaReg());

        fields += ", NRO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNroMesAltaReg());

        fields += ", NRO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getNroDiaAltaReg());

        fields += ", NRO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNroAnoUltMod());

        fields += ", NRO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNroMesUltMod());

        fields += ", NRO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getNroDiaUltMod());

        fields += ", NRO_CVE_ST_NOMREGO";
        fieldValues += ", ?";
        values.add(this.getNroCveStNomrego());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM NOMREGOP WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND NRO_NUM_CONTRATO = ?";
        values.add(this.getNroNumContrato());
        conditions += " AND NRO_TIPO_REGLA = ?";
        values.add(this.getNroTipoRegla());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Nomregop instance = (Nomregop) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getNroNumContrato().equals(instance.getNroNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getNroTipoRegla().equals(instance.getNroTipoRegla()))
            equalObjects = false;
        if (equalObjects && !this.getNroNomRegla().equals(instance.getNroNomRegla()))
            equalObjects = false;
        if (equalObjects && !this.getNroRespElab().equals(instance.getNroRespElab()))
            equalObjects = false;
        if (equalObjects && !this.getNroFechaEspElab().equals(instance.getNroFechaEspElab()))
            equalObjects = false;
        if (equalObjects && !this.getNroFecElab().equals(instance.getNroFecElab()))
            equalObjects = false;
        if (equalObjects && !this.getNroRespRevision().equals(instance.getNroRespRevision()))
            equalObjects = false;
        if (equalObjects && !this.getNroFecEspRev().equals(instance.getNroFecEspRev()))
            equalObjects = false;
        if (equalObjects && !this.getNroFecRevision().equals(instance.getNroFecRevision()))
            equalObjects = false;
        if (equalObjects && !this.getNroRespAprob().equals(instance.getNroRespAprob()))
            equalObjects = false;
        if (equalObjects && !this.getNroFecEspAprob().equals(instance.getNroFecEspAprob()))
            equalObjects = false;
        if (equalObjects && !this.getNroFecAprob().equals(instance.getNroFecAprob()))
            equalObjects = false;
        if (equalObjects && !this.getNroAnoAltaReg().equals(instance.getNroAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNroMesAltaReg().equals(instance.getNroMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNroDiaAltaReg().equals(instance.getNroDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getNroAnoUltMod().equals(instance.getNroAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNroMesUltMod().equals(instance.getNroMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNroDiaUltMod().equals(instance.getNroDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getNroCveStNomrego().equals(instance.getNroCveStNomrego()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Nomregop result = new Nomregop();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setNroNumContrato((BigDecimal) objectData.getData("NRO_NUM_CONTRATO"));
        result.setNroTipoRegla((String) objectData.getData("NRO_TIPO_REGLA"));
        result.setNroNomRegla((String) objectData.getData("NRO_NOM_REGLA"));
        result.setNroRespElab((String) objectData.getData("NRO_RESP_ELAB"));
        result.setNroFechaEspElab((String) objectData.getData("NRO_FECHA_ESP_ELAB"));
        result.setNroFecElab((String) objectData.getData("NRO_FEC_ELAB"));
        result.setNroRespRevision((String) objectData.getData("NRO_RESP_REVISION"));
        result.setNroFecEspRev((String) objectData.getData("NRO_FEC_ESP_REV"));
        result.setNroFecRevision((String) objectData.getData("NRO_FEC_REVISION"));
        result.setNroRespAprob((String) objectData.getData("NRO_RESP_APROB"));
        result.setNroFecEspAprob((String) objectData.getData("NRO_FEC_ESP_APROB"));
        result.setNroFecAprob((String) objectData.getData("NRO_FEC_APROB"));
        result.setNroAnoAltaReg((BigDecimal) objectData.getData("NRO_ANO_ALTA_REG"));
        result.setNroMesAltaReg((BigDecimal) objectData.getData("NRO_MES_ALTA_REG"));
        result.setNroDiaAltaReg((BigDecimal) objectData.getData("NRO_DIA_ALTA_REG"));
        result.setNroAnoUltMod((BigDecimal) objectData.getData("NRO_ANO_ULT_MOD"));
        result.setNroMesUltMod((BigDecimal) objectData.getData("NRO_MES_ULT_MOD"));
        result.setNroDiaUltMod((BigDecimal) objectData.getData("NRO_DIA_ULT_MOD"));
        result.setNroCveStNomrego((String) objectData.getData("NRO_CVE_ST_NOMREGO"));

        return result;

    }

}
