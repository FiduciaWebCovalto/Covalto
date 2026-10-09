package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "INSTRUCCH_PK", columns = { "INS_NUM_FOLIO_INST", "INS_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Instrucch extends DomainObject {

    BigDecimal insNumContrato = null;
    BigDecimal insNumFolioInst = null;
    BigDecimal insSubContrato = null;
    Long insTxtComentario = null;
    String insCveTipoInstr = null;
    BigDecimal insNumMiembro = null;
    String insNomMiembro = null;
    BigDecimal insAnoAltaReg = null;
    BigDecimal insMesAltaReg = null;
    BigDecimal insDiaAltaReg = null;
    BigDecimal insAnoUltMod = null;
    BigDecimal insMesUltMod = null;
    BigDecimal insDiaUltMod = null;
    String insCveStInstruc = null;
    String insCveStCont = null;
    String insFechaContable = null;

    public Instrucch() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsNumContrato(BigDecimal insNumContrato) {
        this.insNumContrato = insNumContrato;
    }

    public BigDecimal getInsNumContrato() {
        return this.insNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsNumFolioInst(BigDecimal insNumFolioInst) {
        this.insNumFolioInst = insNumFolioInst;
    }

    public BigDecimal getInsNumFolioInst() {
        return this.insNumFolioInst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsSubContrato(BigDecimal insSubContrato) {
        this.insSubContrato = insSubContrato;
    }

    public BigDecimal getInsSubContrato() {
        return this.insSubContrato;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setInsTxtComentario(Long insTxtComentario) {
        this.insTxtComentario = insTxtComentario;
    }

    public Long getInsTxtComentario() {
        return this.insTxtComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsCveTipoInstr(String insCveTipoInstr) {
        this.insCveTipoInstr = insCveTipoInstr;
    }

    public String getInsCveTipoInstr() {
        return this.insCveTipoInstr;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setInsNumMiembro(BigDecimal insNumMiembro) {
        this.insNumMiembro = insNumMiembro;
    }

    public BigDecimal getInsNumMiembro() {
        return this.insNumMiembro;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsNomMiembro(String insNomMiembro) {
        this.insNomMiembro = insNomMiembro;
    }

    public String getInsNomMiembro() {
        return this.insNomMiembro;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setInsAnoAltaReg(BigDecimal insAnoAltaReg) {
        this.insAnoAltaReg = insAnoAltaReg;
    }

    public BigDecimal getInsAnoAltaReg() {
        return this.insAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInsMesAltaReg(BigDecimal insMesAltaReg) {
        this.insMesAltaReg = insMesAltaReg;
    }

    public BigDecimal getInsMesAltaReg() {
        return this.insMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInsDiaAltaReg(BigDecimal insDiaAltaReg) {
        this.insDiaAltaReg = insDiaAltaReg;
    }

    public BigDecimal getInsDiaAltaReg() {
        return this.insDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setInsAnoUltMod(BigDecimal insAnoUltMod) {
        this.insAnoUltMod = insAnoUltMod;
    }

    public BigDecimal getInsAnoUltMod() {
        return this.insAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInsMesUltMod(BigDecimal insMesUltMod) {
        this.insMesUltMod = insMesUltMod;
    }

    public BigDecimal getInsMesUltMod() {
        return this.insMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setInsDiaUltMod(BigDecimal insDiaUltMod) {
        this.insDiaUltMod = insDiaUltMod;
    }

    public BigDecimal getInsDiaUltMod() {
        return this.insDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsCveStInstruc(String insCveStInstruc) {
        this.insCveStInstruc = insCveStInstruc;
    }

    public String getInsCveStInstruc() {
        return this.insCveStInstruc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setInsCveStCont(String insCveStCont) {
        this.insCveStCont = insCveStCont;
    }

    public String getInsCveStCont() {
        return this.insCveStCont;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setInsFechaContable(String insFechaContable) {
        this.insFechaContable = insFechaContable;
    }

    public String getInsFechaContable() {
        return this.insFechaContable;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM INSTRUCCH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getInsNumContrato() != null && this.getInsNumContrato().longValue() == -999) {
            conditions += " AND INS_NUM_CONTRATO IS NULL";
        } else if (this.getInsNumContrato() != null) {
            conditions += " AND INS_NUM_CONTRATO = ?";
            values.add(this.getInsNumContrato());
        }

        if (this.getInsNumFolioInst() != null && this.getInsNumFolioInst().longValue() == -999) {
            conditions += " AND INS_NUM_FOLIO_INST IS NULL";
        } else if (this.getInsNumFolioInst() != null) {
            conditions += " AND INS_NUM_FOLIO_INST = ?";
            values.add(this.getInsNumFolioInst());
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
        String sql = "SELECT * FROM INSTRUCCH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getInsNumContrato() != null && this.getInsNumContrato().longValue() == -999) {
            conditions += " AND INS_NUM_CONTRATO IS NULL";
        } else if (this.getInsNumContrato() != null) {
            conditions += " AND INS_NUM_CONTRATO = ?";
            values.add(this.getInsNumContrato());
        }

        if (this.getInsNumFolioInst() != null && this.getInsNumFolioInst().longValue() == -999) {
            conditions += " AND INS_NUM_FOLIO_INST IS NULL";
        } else if (this.getInsNumFolioInst() != null) {
            conditions += " AND INS_NUM_FOLIO_INST = ?";
            values.add(this.getInsNumFolioInst());
        }

        if (this.getInsSubContrato() != null && this.getInsSubContrato().longValue() == -999) {
            conditions += " AND INS_SUB_CONTRATO IS NULL";
        } else if (this.getInsSubContrato() != null) {
            conditions += " AND INS_SUB_CONTRATO = ?";
            values.add(this.getInsSubContrato());
        }

        if (this.getInsTxtComentario() != null && this.getInsTxtComentario() == -999) {
            conditions += " AND INS_TXT_COMENTARIO IS NULL";
        } else if (this.getInsTxtComentario() != null) {
            conditions += " AND INS_TXT_COMENTARIO = ?";
            values.add(this.getInsTxtComentario());
        }

        if (this.getInsCveTipoInstr() != null && "null".equals(this.getInsCveTipoInstr())) {
            conditions += " AND INS_CVE_TIPO_INSTR IS NULL";
        } else if (this.getInsCveTipoInstr() != null) {
            conditions += " AND INS_CVE_TIPO_INSTR = ?";
            values.add(this.getInsCveTipoInstr());
        }

        if (this.getInsNumMiembro() != null && this.getInsNumMiembro().longValue() == -999) {
            conditions += " AND INS_NUM_MIEMBRO IS NULL";
        } else if (this.getInsNumMiembro() != null) {
            conditions += " AND INS_NUM_MIEMBRO = ?";
            values.add(this.getInsNumMiembro());
        }

        if (this.getInsNomMiembro() != null && "null".equals(this.getInsNomMiembro())) {
            conditions += " AND INS_NOM_MIEMBRO IS NULL";
        } else if (this.getInsNomMiembro() != null) {
            conditions += " AND INS_NOM_MIEMBRO = ?";
            values.add(this.getInsNomMiembro());
        }

        if (this.getInsAnoAltaReg() != null && this.getInsAnoAltaReg().longValue() == -999) {
            conditions += " AND INS_ANO_ALTA_REG IS NULL";
        } else if (this.getInsAnoAltaReg() != null) {
            conditions += " AND INS_ANO_ALTA_REG = ?";
            values.add(this.getInsAnoAltaReg());
        }

        if (this.getInsMesAltaReg() != null && this.getInsMesAltaReg().longValue() == -999) {
            conditions += " AND INS_MES_ALTA_REG IS NULL";
        } else if (this.getInsMesAltaReg() != null) {
            conditions += " AND INS_MES_ALTA_REG = ?";
            values.add(this.getInsMesAltaReg());
        }

        if (this.getInsDiaAltaReg() != null && this.getInsDiaAltaReg().longValue() == -999) {
            conditions += " AND INS_DIA_ALTA_REG IS NULL";
        } else if (this.getInsDiaAltaReg() != null) {
            conditions += " AND INS_DIA_ALTA_REG = ?";
            values.add(this.getInsDiaAltaReg());
        }

        if (this.getInsAnoUltMod() != null && this.getInsAnoUltMod().longValue() == -999) {
            conditions += " AND INS_ANO_ULT_MOD IS NULL";
        } else if (this.getInsAnoUltMod() != null) {
            conditions += " AND INS_ANO_ULT_MOD = ?";
            values.add(this.getInsAnoUltMod());
        }

        if (this.getInsMesUltMod() != null && this.getInsMesUltMod().longValue() == -999) {
            conditions += " AND INS_MES_ULT_MOD IS NULL";
        } else if (this.getInsMesUltMod() != null) {
            conditions += " AND INS_MES_ULT_MOD = ?";
            values.add(this.getInsMesUltMod());
        }

        if (this.getInsDiaUltMod() != null && this.getInsDiaUltMod().longValue() == -999) {
            conditions += " AND INS_DIA_ULT_MOD IS NULL";
        } else if (this.getInsDiaUltMod() != null) {
            conditions += " AND INS_DIA_ULT_MOD = ?";
            values.add(this.getInsDiaUltMod());
        }

        if (this.getInsCveStInstruc() != null && "null".equals(this.getInsCveStInstruc())) {
            conditions += " AND INS_CVE_ST_INSTRUC IS NULL";
        } else if (this.getInsCveStInstruc() != null) {
            conditions += " AND INS_CVE_ST_INSTRUC = ?";
            values.add(this.getInsCveStInstruc());
        }

        if (this.getInsCveStCont() != null && "null".equals(this.getInsCveStCont())) {
            conditions += " AND INS_CVE_ST_CONT IS NULL";
        } else if (this.getInsCveStCont() != null) {
            conditions += " AND INS_CVE_ST_CONT = ?";
            values.add(this.getInsCveStCont());
        }

        if (this.getInsFechaContable() != null && "null".equals(this.getInsFechaContable())) {
            conditions += " AND INS_FECHA_CONTABLE IS NULL";
        } else if (this.getInsFechaContable() != null) {
            conditions += " AND INS_FECHA_CONTABLE = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getInsFechaContable());
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
        String sql = "UPDATE INSTRUCCH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND INS_NUM_CONTRATO = ?";
        pkValues.add(this.getInsNumContrato());
        conditions += " AND INS_NUM_FOLIO_INST = ?";
        pkValues.add(this.getInsNumFolioInst());
        fields += " INS_SUB_CONTRATO = ?, ";
        values.add(this.getInsSubContrato());
        fields += " INS_TXT_COMENTARIO = ?, ";
        values.add(this.getInsTxtComentario());
        fields += " INS_CVE_TIPO_INSTR = ?, ";
        values.add(this.getInsCveTipoInstr());
        fields += " INS_NUM_MIEMBRO = ?, ";
        values.add(this.getInsNumMiembro());
        fields += " INS_NOM_MIEMBRO = ?, ";
        values.add(this.getInsNomMiembro());
        fields += " INS_ANO_ALTA_REG = ?, ";
        values.add(this.getInsAnoAltaReg());
        fields += " INS_MES_ALTA_REG = ?, ";
        values.add(this.getInsMesAltaReg());
        fields += " INS_DIA_ALTA_REG = ?, ";
        values.add(this.getInsDiaAltaReg());
        fields += " INS_ANO_ULT_MOD = ?, ";
        values.add(this.getInsAnoUltMod());
        fields += " INS_MES_ULT_MOD = ?, ";
        values.add(this.getInsMesUltMod());
        fields += " INS_DIA_ULT_MOD = ?, ";
        values.add(this.getInsDiaUltMod());
        fields += " INS_CVE_ST_INSTRUC = ?, ";
        values.add(this.getInsCveStInstruc());
        fields += " INS_CVE_ST_CONT = ?, ";
        values.add(this.getInsCveStCont());
        fields += " INS_FECHA_CONTABLE = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getInsFechaContable());
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
        String sql = "INSERT INTO INSTRUCCH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", INS_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getInsNumContrato());

        fields += ", INS_NUM_FOLIO_INST";
        fieldValues += ", ?";
        values.add(this.getInsNumFolioInst());

        fields += ", INS_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getInsSubContrato());

        fields += ", INS_TXT_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getInsTxtComentario());

        fields += ", INS_CVE_TIPO_INSTR";
        fieldValues += ", ?";
        values.add(this.getInsCveTipoInstr());

        fields += ", INS_NUM_MIEMBRO";
        fieldValues += ", ?";
        values.add(this.getInsNumMiembro());

        fields += ", INS_NOM_MIEMBRO";
        fieldValues += ", ?";
        values.add(this.getInsNomMiembro());

        fields += ", INS_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getInsAnoAltaReg());

        fields += ", INS_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getInsMesAltaReg());

        fields += ", INS_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getInsDiaAltaReg());

        fields += ", INS_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getInsAnoUltMod());

        fields += ", INS_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getInsMesUltMod());

        fields += ", INS_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getInsDiaUltMod());

        fields += ", INS_CVE_ST_INSTRUC";
        fieldValues += ", ?";
        values.add(this.getInsCveStInstruc());

        fields += ", INS_CVE_ST_CONT";
        fieldValues += ", ?";
        values.add(this.getInsCveStCont());

        fields += ", INS_FECHA_CONTABLE";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getInsFechaContable());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM INSTRUCCH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND INS_NUM_CONTRATO = ?";
        values.add(this.getInsNumContrato());
        conditions += " AND INS_NUM_FOLIO_INST = ?";
        values.add(this.getInsNumFolioInst());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Instrucch instance = (Instrucch) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getInsNumContrato().equals(instance.getInsNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getInsNumFolioInst().equals(instance.getInsNumFolioInst()))
            equalObjects = false;
        if (equalObjects && !this.getInsSubContrato().equals(instance.getInsSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getInsTxtComentario().equals(instance.getInsTxtComentario()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveTipoInstr().equals(instance.getInsCveTipoInstr()))
            equalObjects = false;
        if (equalObjects && !this.getInsNumMiembro().equals(instance.getInsNumMiembro()))
            equalObjects = false;
        if (equalObjects && !this.getInsNomMiembro().equals(instance.getInsNomMiembro()))
            equalObjects = false;
        if (equalObjects && !this.getInsAnoAltaReg().equals(instance.getInsAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getInsMesAltaReg().equals(instance.getInsMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getInsDiaAltaReg().equals(instance.getInsDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getInsAnoUltMod().equals(instance.getInsAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getInsMesUltMod().equals(instance.getInsMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getInsDiaUltMod().equals(instance.getInsDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveStInstruc().equals(instance.getInsCveStInstruc()))
            equalObjects = false;
        if (equalObjects && !this.getInsCveStCont().equals(instance.getInsCveStCont()))
            equalObjects = false;
        if (equalObjects && !this.getInsFechaContable().equals(instance.getInsFechaContable()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Instrucch result = new Instrucch();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setInsNumContrato((BigDecimal) objectData.getData("INS_NUM_CONTRATO"));
        result.setInsNumFolioInst((BigDecimal) objectData.getData("INS_NUM_FOLIO_INST"));
        result.setInsSubContrato((BigDecimal) objectData.getData("INS_SUB_CONTRATO"));
        result.setInsTxtComentario((Long) objectData.getData("INS_TXT_COMENTARIO"));
        result.setInsCveTipoInstr((String) objectData.getData("INS_CVE_TIPO_INSTR"));
        result.setInsNumMiembro((BigDecimal) objectData.getData("INS_NUM_MIEMBRO"));
        result.setInsNomMiembro((String) objectData.getData("INS_NOM_MIEMBRO"));
        result.setInsAnoAltaReg((BigDecimal) objectData.getData("INS_ANO_ALTA_REG"));
        result.setInsMesAltaReg((BigDecimal) objectData.getData("INS_MES_ALTA_REG"));
        result.setInsDiaAltaReg((BigDecimal) objectData.getData("INS_DIA_ALTA_REG"));
        result.setInsAnoUltMod((BigDecimal) objectData.getData("INS_ANO_ULT_MOD"));
        result.setInsMesUltMod((BigDecimal) objectData.getData("INS_MES_ULT_MOD"));
        result.setInsDiaUltMod((BigDecimal) objectData.getData("INS_DIA_ULT_MOD"));
        result.setInsCveStInstruc((String) objectData.getData("INS_CVE_ST_INSTRUC"));
        result.setInsCveStCont((String) objectData.getData("INS_CVE_ST_CONT"));
        result.setInsFechaContable((String) objectData.getData("INS_FECHA_CONTABLE"));

        return result;

    }

}
