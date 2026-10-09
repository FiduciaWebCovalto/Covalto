package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FINALIDA_PK", columns = { "FIN_NUM_CONTRATO", "FIN_CVE_TIPO_FINAL", "FIN_FOLIO_FINALIDA" }, sequences = { "MANUAL" })

public class FinalidaAnteproy extends DomainObject {
    String finTxtUsuCap = null;
    BigDecimal finNumContrato = null;
    BigDecimal finFolioFinalida = null;
    String finTxtComentario = null;
    String finCveTipoFinal = null;
    BigDecimal finNumDictador = null;
    String finNomDictador = null;
    BigDecimal finAnoAltaReg = null;
    BigDecimal finMesAltaReg = null;
    BigDecimal finDiaAltaReg = null;
    BigDecimal finAnoUltMod = null;
    BigDecimal finMesUltMod = null;
    BigDecimal finDiaUltMod = null;
    String finCveStFinalid = null;

    public FinalidaAnteproy() {
        super();
        this.pkColumns = 8;
    }

    public void setFinTxtUsuCap(String finTxtUsuCap) {
        this.finTxtUsuCap = finTxtUsuCap;
    }

    public void setFinNumContrato(BigDecimal finNumContrato) {
        this.finNumContrato = finNumContrato;
    }

    public void setFinFolioFinalida(BigDecimal finFolioFinalida) {
        this.finFolioFinalida = finFolioFinalida;
    }

    public void setFinTxtComentario(String finTxtComentario) {
        this.finTxtComentario = finTxtComentario;
    }

    public void setFinCveTipoFinal(String finCveTipoFinal) {
        this.finCveTipoFinal = finCveTipoFinal;
    }

    public void setFinNumDictador(BigDecimal finNumDictador) {
        this.finNumDictador = finNumDictador;
    }

    public void setFinNomDictador(String finNomDictador) {
        this.finNomDictador = finNomDictador;
    }

    public void setFinAnoAltaReg(BigDecimal finAnoAltaReg) {
        this.finAnoAltaReg = finAnoAltaReg;
    }

    public void setFinMesAltaReg(BigDecimal finMesAltaReg) {
        this.finMesAltaReg = finMesAltaReg;
    }

    public void setFinDiaAltaReg(BigDecimal finDiaAltaReg) {
        this.finDiaAltaReg = finDiaAltaReg;
    }

    public void setFinAnoUltMod(BigDecimal finAnoUltMod) {
        this.finAnoUltMod = finAnoUltMod;
    }

    public void setFinMesUltMod(BigDecimal finMesUltMod) {
        this.finMesUltMod = finMesUltMod;
    }

    public void setFinDiaUltMod(BigDecimal finDiaUltMod) {
        this.finDiaUltMod = finDiaUltMod;
    }

    public void setFinCveStFinalid(String finCveStFinalid) {
        this.finCveStFinalid = finCveStFinalid;
    }

    public String getFinTxtUsuCap() {
        return this.finTxtUsuCap;
    }

    public BigDecimal getFinNumContrato() {
        return this.finNumContrato;
    }

    public BigDecimal getFinFolioFinalida() {
        return this.finFolioFinalida;
    }

    public String getFinTxtComentario() {
        return this.finTxtComentario;
    }

    public String getFinCveTipoFinal() {
        return this.finCveTipoFinal;
    }

    public BigDecimal getFinNumDictador() {
        return this.finNumDictador;
    }

    public String getFinNomDictador() {
        return this.finNomDictador;
    }

    public BigDecimal getFinAnoAltaReg() {
        return this.finAnoAltaReg;
    }

    public BigDecimal getFinMesAltaReg() {
        return this.finMesAltaReg;
    }

    public BigDecimal getFinDiaAltaReg() {
        return this.finDiaAltaReg;
    }

    public BigDecimal getFinAnoUltMod() {
        return this.finAnoUltMod;
    }

    public BigDecimal getFinMesUltMod() {
        return this.finMesUltMod;
    }

    public BigDecimal getFinDiaUltMod() {
        return this.finDiaUltMod;
    }

    public String getFinCveStFinalid() {
        return this.finCveStFinalid;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FINALIDA_ANTEPROY";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getFinNumContrato() != null && this.getFinNumContrato().longValue() == -999) {
            conditions += " AND FIN_NUM_CONTRATO IS NULL";
        } else if (this.getFinNumContrato() != null) {
            conditions += " AND FIN_NUM_CONTRATO =?";
            values.add(this.getFinNumContrato());
        }
        if (this.getFinFolioFinalida() != null && this.getFinFolioFinalida().longValue() == -999) {
            conditions += " AND FIN_FOLIO_FINALIDA IS NULL";
        } else if (this.getFinFolioFinalida() != null) {
            conditions += " AND FIN_FOLIO_FINALIDA =?";
            values.add(this.getFinFolioFinalida());
        }
        if (this.getFinCveTipoFinal() != null && "null".equals(this.getFinCveTipoFinal())) {
            conditions += " AND FIN_CVE_TIPO_FINAL IS NULL";
        } else if (this.getFinCveTipoFinal() != null) {
            conditions += " AND FIN_CVE_TIPO_FINAL =?";
            values.add(this.getFinCveTipoFinal());
        }
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += " WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getSelect() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FINALIDA_ANTEPROY ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += " WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE FINALIDA_ANTEPROY SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        fields += " FIN_TXT_USU_CAP = ?, ";
        values.add(this.getFinTxtUsuCap());
        conditions += " AND FIN_NUM_CONTRATO = ?";
        pkValues.add(this.getFinNumContrato());
        conditions += " AND FIN_FOLIO_FINALIDA = ?";
        pkValues.add(this.getFinFolioFinalida());
        fields += " FIN_TXT_COMENTARIO = ?, ";
        values.add(this.getFinTxtComentario());
        conditions += " AND FIN_CVE_TIPO_FINAL = ?";
        pkValues.add(this.getFinCveTipoFinal());
        fields += " FIN_NUM_DICTADOR = ?, ";
        values.add(this.getFinNumDictador());
        fields += " FIN_NOM_DICTADOR = ?, ";
        values.add(this.getFinNomDictador());
        fields += " FIN_ANO_ALTA_REG = ?, ";
        values.add(this.getFinAnoAltaReg());
        fields += " FIN_MES_ALTA_REG = ?, ";
        values.add(this.getFinMesAltaReg());
        fields += " FIN_DIA_ALTA_REG = ?, ";
        values.add(this.getFinDiaAltaReg());
        fields += " FIN_ANO_ULT_MOD = ?, ";
        values.add(this.getFinAnoUltMod());
        fields += " FIN_MES_ULT_MOD = ?, ";
        values.add(this.getFinMesUltMod());
        fields += " FIN_DIA_ULT_MOD = ?, ";
        values.add(this.getFinDiaUltMod());
        fields += " FIN_CVE_ST_FINALID = ?, ";
        values.add(this.getFinCveStFinalid());
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
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO FINALIDA_ANTEPROY ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FIN_TXT_USU_CAP ";
        fieldValues += ", ?";
        values.add(this.getFinTxtUsuCap());
        fields += ",FIN_NUM_CONTRATO ";
        fieldValues += ", ?";
        values.add(this.getFinNumContrato());
        fields += ",FIN_FOLIO_FINALIDA ";
        fieldValues += ", ?";
        values.add(this.getFinFolioFinalida());
        fields += ",FIN_TXT_COMENTARIO ";
        fieldValues += ", ?";
        values.add(this.getFinTxtComentario());
        fields += ",FIN_CVE_TIPO_FINAL ";
        fieldValues += ", ?";
        values.add(this.getFinCveTipoFinal());
        fields += ",FIN_NUM_DICTADOR ";
        fieldValues += ", ?";
        values.add(this.getFinNumDictador());
        fields += ",FIN_NOM_DICTADOR ";
        fieldValues += ", ?";
        values.add(this.getFinNomDictador());
        fields += ",FIN_ANO_ALTA_REG ";
        fieldValues += ", ?";
        values.add(this.getFinAnoAltaReg());
        fields += ",FIN_MES_ALTA_REG ";
        fieldValues += ", ?";
        values.add(this.getFinMesAltaReg());
        fields += ",FIN_DIA_ALTA_REG ";
        fieldValues += ", ?";
        values.add(this.getFinDiaAltaReg());
        fields += ",FIN_ANO_ULT_MOD ";
        fieldValues += ", ?";
        values.add(this.getFinAnoUltMod());
        fields += ",FIN_MES_ULT_MOD ";
        fieldValues += ", ?";
        values.add(this.getFinMesUltMod());
        fields += ",FIN_DIA_ULT_MOD ";
        fieldValues += ", ?";
        values.add(this.getFinDiaUltMod());
        fields += ",FIN_CVE_ST_FINALID ";
        fieldValues += ", ?";
        values.add(this.getFinCveStFinalid());
        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();
        sql += fields + " ) VALUES (" + fieldValues + ")";
        result.setSql(sql);
        result.setParameters(values.toArray());
        return result;
    }

    public DMLObject getDelete() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FINALIDA_ANTEPROY WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND FIN_NUM_CONTRATO = ?";
        values.add(this.getFinNumContrato());
        conditions += " AND FIN_FOLIO_FINALIDA = ?";
        values.add(this.getFinFolioFinalida());
        conditions += " AND FIN_CVE_TIPO_FINAL = ?";
        values.add(this.getFinCveTipoFinal());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Finalida instance = (Finalida) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFinTxtUsuCap().equals(instance.getFinTxtUsuCap()))
            equalObjects = false;
        if (equalObjects && !this.getFinNumContrato().equals(instance.getFinNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getFinFolioFinalida().equals(instance.getFinFolioFinalida()))
            equalObjects = false;
        if (equalObjects && !this.getFinTxtComentario().equals(instance.getFinTxtComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFinCveTipoFinal().equals(instance.getFinCveTipoFinal()))
            equalObjects = false;
        if (equalObjects && !this.getFinNumDictador().equals(instance.getFinNumDictador()))
            equalObjects = false;
        if (equalObjects && !this.getFinNomDictador().equals(instance.getFinNomDictador()))
            equalObjects = false;
        if (equalObjects && !this.getFinAnoAltaReg().equals(instance.getFinAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFinMesAltaReg().equals(instance.getFinMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFinDiaAltaReg().equals(instance.getFinDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getFinAnoUltMod().equals(instance.getFinAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFinMesUltMod().equals(instance.getFinMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFinDiaUltMod().equals(instance.getFinDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getFinCveStFinalid().equals(instance.getFinCveStFinalid()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Finalida result = new Finalida();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFinTxtUsuCap((String) objectData.getData("FIN_TXT_USU_CAP"));
        result.setFinNumContrato((BigDecimal) objectData.getData("FIN_NUM_CONTRATO"));
        result.setFinFolioFinalida((BigDecimal) objectData.getData("FIN_FOLIO_FINALIDA"));
        result.setFinTxtComentario((String) objectData.getData("FIN_TXT_COMENTARIO"));
        result.setFinCveTipoFinal((String) objectData.getData("FIN_CVE_TIPO_FINAL"));
        result.setFinNumDictador((BigDecimal) objectData.getData("FIN_NUM_DICTADOR"));
        result.setFinNomDictador((String) objectData.getData("FIN_NOM_DICTADOR"));
        result.setFinAnoAltaReg((BigDecimal) objectData.getData("FIN_ANO_ALTA_REG"));
        result.setFinMesAltaReg((BigDecimal) objectData.getData("FIN_MES_ALTA_REG"));
        result.setFinDiaAltaReg((BigDecimal) objectData.getData("FIN_DIA_ALTA_REG"));
        result.setFinAnoUltMod((BigDecimal) objectData.getData("FIN_ANO_ULT_MOD"));
        result.setFinMesUltMod((BigDecimal) objectData.getData("FIN_MES_ULT_MOD"));
        result.setFinDiaUltMod((BigDecimal) objectData.getData("FIN_DIA_ULT_MOD"));
        result.setFinCveStFinalid((String) objectData.getData("FIN_CVE_ST_FINALID"));
        return result;
    }
}
