package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EXPEDIEN_PK", columns = { "EXP_NUM_EXPEDIENTE", "EXP_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Expedien extends DomainObject {

    BigDecimal expNumExpediente = null;
    BigDecimal expNumContrato = null;
    BigDecimal expNumProspecto = null;
    BigDecimal expNumBoveda = null;
    BigDecimal expNumArchivero = null;
    BigDecimal expNumCajon = null;
    BigDecimal expAnoAltaReg = null;
    BigDecimal expMesAltaReg = null;
    BigDecimal expDiaAltaReg = null;
    BigDecimal expAnoUltMod = null;
    BigDecimal expMesUltMod = null;
    BigDecimal expDiaUltMod = null;
    String expCveStExpedie = null;

    public Expedien() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExpNumExpediente(BigDecimal expNumExpediente) {
        this.expNumExpediente = expNumExpediente;
    }

    public BigDecimal getExpNumExpediente() {
        return this.expNumExpediente;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExpNumContrato(BigDecimal expNumContrato) {
        this.expNumContrato = expNumContrato;
    }

    public BigDecimal getExpNumContrato() {
        return this.expNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExpNumProspecto(BigDecimal expNumProspecto) {
        this.expNumProspecto = expNumProspecto;
    }

    public BigDecimal getExpNumProspecto() {
        return this.expNumProspecto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExpNumBoveda(BigDecimal expNumBoveda) {
        this.expNumBoveda = expNumBoveda;
    }

    public BigDecimal getExpNumBoveda() {
        return this.expNumBoveda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExpNumArchivero(BigDecimal expNumArchivero) {
        this.expNumArchivero = expNumArchivero;
    }

    public BigDecimal getExpNumArchivero() {
        return this.expNumArchivero;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExpNumCajon(BigDecimal expNumCajon) {
        this.expNumCajon = expNumCajon;
    }

    public BigDecimal getExpNumCajon() {
        return this.expNumCajon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExpAnoAltaReg(BigDecimal expAnoAltaReg) {
        this.expAnoAltaReg = expAnoAltaReg;
    }

    public BigDecimal getExpAnoAltaReg() {
        return this.expAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExpMesAltaReg(BigDecimal expMesAltaReg) {
        this.expMesAltaReg = expMesAltaReg;
    }

    public BigDecimal getExpMesAltaReg() {
        return this.expMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExpDiaAltaReg(BigDecimal expDiaAltaReg) {
        this.expDiaAltaReg = expDiaAltaReg;
    }

    public BigDecimal getExpDiaAltaReg() {
        return this.expDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExpAnoUltMod(BigDecimal expAnoUltMod) {
        this.expAnoUltMod = expAnoUltMod;
    }

    public BigDecimal getExpAnoUltMod() {
        return this.expAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExpMesUltMod(BigDecimal expMesUltMod) {
        this.expMesUltMod = expMesUltMod;
    }

    public BigDecimal getExpMesUltMod() {
        return this.expMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExpDiaUltMod(BigDecimal expDiaUltMod) {
        this.expDiaUltMod = expDiaUltMod;
    }

    public BigDecimal getExpDiaUltMod() {
        return this.expDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExpCveStExpedie(String expCveStExpedie) {
        this.expCveStExpedie = expCveStExpedie;
    }

    public String getExpCveStExpedie() {
        return this.expCveStExpedie;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EXPEDIEN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getExpNumExpediente() != null && this.getExpNumExpediente().longValue() == -999) {
            conditions += " AND EXP_NUM_EXPEDIENTE IS NULL";
        } else if (this.getExpNumExpediente() != null) {
            conditions += " AND EXP_NUM_EXPEDIENTE = ?";
            values.add(this.getExpNumExpediente());
        }

        if (this.getExpNumContrato() != null && this.getExpNumContrato().longValue() == -999) {
            conditions += " AND EXP_NUM_CONTRATO IS NULL";
        } else if (this.getExpNumContrato() != null) {
            conditions += " AND EXP_NUM_CONTRATO = ?";
            values.add(this.getExpNumContrato());
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
        String sql = "SELECT * FROM EXPEDIEN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getExpNumExpediente() != null && this.getExpNumExpediente().longValue() == -999) {
            conditions += " AND EXP_NUM_EXPEDIENTE IS NULL";
        } else if (this.getExpNumExpediente() != null) {
            conditions += " AND EXP_NUM_EXPEDIENTE = ?";
            values.add(this.getExpNumExpediente());
        }

        if (this.getExpNumContrato() != null && this.getExpNumContrato().longValue() == -999) {
            conditions += " AND EXP_NUM_CONTRATO IS NULL";
        } else if (this.getExpNumContrato() != null) {
            conditions += " AND EXP_NUM_CONTRATO = ?";
            values.add(this.getExpNumContrato());
        }

        if (this.getExpNumProspecto() != null && this.getExpNumProspecto().longValue() == -999) {
            conditions += " AND EXP_NUM_PROSPECTO IS NULL";
        } else if (this.getExpNumProspecto() != null) {
            conditions += " AND EXP_NUM_PROSPECTO = ?";
            values.add(this.getExpNumProspecto());
        }

        if (this.getExpNumBoveda() != null && this.getExpNumBoveda().longValue() == -999) {
            conditions += " AND EXP_NUM_BOVEDA IS NULL";
        } else if (this.getExpNumBoveda() != null) {
            conditions += " AND EXP_NUM_BOVEDA = ?";
            values.add(this.getExpNumBoveda());
        }

        if (this.getExpNumArchivero() != null && this.getExpNumArchivero().longValue() == -999) {
            conditions += " AND EXP_NUM_ARCHIVERO IS NULL";
        } else if (this.getExpNumArchivero() != null) {
            conditions += " AND EXP_NUM_ARCHIVERO = ?";
            values.add(this.getExpNumArchivero());
        }

        if (this.getExpNumCajon() != null && this.getExpNumCajon().longValue() == -999) {
            conditions += " AND EXP_NUM_CAJON IS NULL";
        } else if (this.getExpNumCajon() != null) {
            conditions += " AND EXP_NUM_CAJON = ?";
            values.add(this.getExpNumCajon());
        }

        if (this.getExpAnoAltaReg() != null && this.getExpAnoAltaReg().longValue() == -999) {
            conditions += " AND EXP_ANO_ALTA_REG IS NULL";
        } else if (this.getExpAnoAltaReg() != null) {
            conditions += " AND EXP_ANO_ALTA_REG = ?";
            values.add(this.getExpAnoAltaReg());
        }

        if (this.getExpMesAltaReg() != null && this.getExpMesAltaReg().longValue() == -999) {
            conditions += " AND EXP_MES_ALTA_REG IS NULL";
        } else if (this.getExpMesAltaReg() != null) {
            conditions += " AND EXP_MES_ALTA_REG = ?";
            values.add(this.getExpMesAltaReg());
        }

        if (this.getExpDiaAltaReg() != null && this.getExpDiaAltaReg().longValue() == -999) {
            conditions += " AND EXP_DIA_ALTA_REG IS NULL";
        } else if (this.getExpDiaAltaReg() != null) {
            conditions += " AND EXP_DIA_ALTA_REG = ?";
            values.add(this.getExpDiaAltaReg());
        }

        if (this.getExpAnoUltMod() != null && this.getExpAnoUltMod().longValue() == -999) {
            conditions += " AND EXP_ANO_ULT_MOD IS NULL";
        } else if (this.getExpAnoUltMod() != null) {
            conditions += " AND EXP_ANO_ULT_MOD = ?";
            values.add(this.getExpAnoUltMod());
        }

        if (this.getExpMesUltMod() != null && this.getExpMesUltMod().longValue() == -999) {
            conditions += " AND EXP_MES_ULT_MOD IS NULL";
        } else if (this.getExpMesUltMod() != null) {
            conditions += " AND EXP_MES_ULT_MOD = ?";
            values.add(this.getExpMesUltMod());
        }

        if (this.getExpDiaUltMod() != null && this.getExpDiaUltMod().longValue() == -999) {
            conditions += " AND EXP_DIA_ULT_MOD IS NULL";
        } else if (this.getExpDiaUltMod() != null) {
            conditions += " AND EXP_DIA_ULT_MOD = ?";
            values.add(this.getExpDiaUltMod());
        }

        if (this.getExpCveStExpedie() != null && "null".equals(this.getExpCveStExpedie())) {
            conditions += " AND EXP_CVE_ST_EXPEDIE IS NULL";
        } else if (this.getExpCveStExpedie() != null) {
            conditions += " AND EXP_CVE_ST_EXPEDIE = ?";
            values.add(this.getExpCveStExpedie());
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
        String sql = "UPDATE EXPEDIEN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EXP_NUM_EXPEDIENTE = ?";
        pkValues.add(this.getExpNumExpediente());
        conditions += " AND EXP_NUM_CONTRATO = ?";
        pkValues.add(this.getExpNumContrato());
        fields += " EXP_NUM_PROSPECTO = ?, ";
        values.add(this.getExpNumProspecto());
        fields += " EXP_NUM_BOVEDA = ?, ";
        values.add(this.getExpNumBoveda());
        fields += " EXP_NUM_ARCHIVERO = ?, ";
        values.add(this.getExpNumArchivero());
        fields += " EXP_NUM_CAJON = ?, ";
        values.add(this.getExpNumCajon());
        fields += " EXP_ANO_ALTA_REG = ?, ";
        values.add(this.getExpAnoAltaReg());
        fields += " EXP_MES_ALTA_REG = ?, ";
        values.add(this.getExpMesAltaReg());
        fields += " EXP_DIA_ALTA_REG = ?, ";
        values.add(this.getExpDiaAltaReg());
        fields += " EXP_ANO_ULT_MOD = ?, ";
        values.add(this.getExpAnoUltMod());
        fields += " EXP_MES_ULT_MOD = ?, ";
        values.add(this.getExpMesUltMod());
        fields += " EXP_DIA_ULT_MOD = ?, ";
        values.add(this.getExpDiaUltMod());
        fields += " EXP_CVE_ST_EXPEDIE = ?, ";
        values.add(this.getExpCveStExpedie());
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
        String sql = "INSERT INTO EXPEDIEN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EXP_NUM_EXPEDIENTE";
        fieldValues += ", ?";
        values.add(this.getExpNumExpediente());

        fields += ", EXP_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getExpNumContrato());

        fields += ", EXP_NUM_PROSPECTO";
        fieldValues += ", ?";
        values.add(this.getExpNumProspecto());

        fields += ", EXP_NUM_BOVEDA";
        fieldValues += ", ?";
        values.add(this.getExpNumBoveda());

        fields += ", EXP_NUM_ARCHIVERO";
        fieldValues += ", ?";
        values.add(this.getExpNumArchivero());

        fields += ", EXP_NUM_CAJON";
        fieldValues += ", ?";
        values.add(this.getExpNumCajon());

        fields += ", EXP_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExpAnoAltaReg());

        fields += ", EXP_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExpMesAltaReg());

        fields += ", EXP_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExpDiaAltaReg());

        fields += ", EXP_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExpAnoUltMod());

        fields += ", EXP_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExpMesUltMod());

        fields += ", EXP_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExpDiaUltMod());

        fields += ", EXP_CVE_ST_EXPEDIE";
        fieldValues += ", ?";
        values.add(this.getExpCveStExpedie());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EXPEDIEN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EXP_NUM_EXPEDIENTE = ?";
        values.add(this.getExpNumExpediente());
        conditions += " AND EXP_NUM_CONTRATO = ?";
        values.add(this.getExpNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Expedien instance = (Expedien) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getExpNumExpediente().equals(instance.getExpNumExpediente()))
            equalObjects = false;
        if (equalObjects && !this.getExpNumContrato().equals(instance.getExpNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getExpNumProspecto().equals(instance.getExpNumProspecto()))
            equalObjects = false;
        if (equalObjects && !this.getExpNumBoveda().equals(instance.getExpNumBoveda()))
            equalObjects = false;
        if (equalObjects && !this.getExpNumArchivero().equals(instance.getExpNumArchivero()))
            equalObjects = false;
        if (equalObjects && !this.getExpNumCajon().equals(instance.getExpNumCajon()))
            equalObjects = false;
        if (equalObjects && !this.getExpAnoAltaReg().equals(instance.getExpAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExpMesAltaReg().equals(instance.getExpMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExpDiaAltaReg().equals(instance.getExpDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExpAnoUltMod().equals(instance.getExpAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExpMesUltMod().equals(instance.getExpMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExpDiaUltMod().equals(instance.getExpDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExpCveStExpedie().equals(instance.getExpCveStExpedie()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Expedien result = new Expedien();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setExpNumExpediente((BigDecimal) objectData.getData("EXP_NUM_EXPEDIENTE"));
        result.setExpNumContrato((BigDecimal) objectData.getData("EXP_NUM_CONTRATO"));
        result.setExpNumProspecto((BigDecimal) objectData.getData("EXP_NUM_PROSPECTO"));
        result.setExpNumBoveda((BigDecimal) objectData.getData("EXP_NUM_BOVEDA"));
        result.setExpNumArchivero((BigDecimal) objectData.getData("EXP_NUM_ARCHIVERO"));
        result.setExpNumCajon((BigDecimal) objectData.getData("EXP_NUM_CAJON"));
        result.setExpAnoAltaReg((BigDecimal) objectData.getData("EXP_ANO_ALTA_REG"));
        result.setExpMesAltaReg((BigDecimal) objectData.getData("EXP_MES_ALTA_REG"));
        result.setExpDiaAltaReg((BigDecimal) objectData.getData("EXP_DIA_ALTA_REG"));
        result.setExpAnoUltMod((BigDecimal) objectData.getData("EXP_ANO_ULT_MOD"));
        result.setExpMesUltMod((BigDecimal) objectData.getData("EXP_MES_ULT_MOD"));
        result.setExpDiaUltMod((BigDecimal) objectData.getData("EXP_DIA_ULT_MOD"));
        result.setExpCveStExpedie((String) objectData.getData("EXP_CVE_ST_EXPEDIE"));

        return result;

    }

}
