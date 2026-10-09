package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "FINALIDAH_PK", columns = { "FIN_NUM_CONTRATO", "FIN_CVE_TIPO_FINAL", "FIN_FOLIO_FINALIDA" }, sequences = { "MANUAL" })
public class Finalidah extends DomainObject {

    BigDecimal finNumContrato = null;
    BigDecimal finFolioFinalida = null;
    Long finTxtComentario = null;
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

    public Finalidah() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFinNumContrato(BigDecimal finNumContrato) {
        this.finNumContrato = finNumContrato;
    }

    public BigDecimal getFinNumContrato() {
        return this.finNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFinFolioFinalida(BigDecimal finFolioFinalida) {
        this.finFolioFinalida = finFolioFinalida;
    }

    public BigDecimal getFinFolioFinalida() {
        return this.finFolioFinalida;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setFinTxtComentario(Long finTxtComentario) {
        this.finTxtComentario = finTxtComentario;
    }

    public Long getFinTxtComentario() {
        return this.finTxtComentario;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFinCveTipoFinal(String finCveTipoFinal) {
        this.finCveTipoFinal = finCveTipoFinal;
    }

    public String getFinCveTipoFinal() {
        return this.finCveTipoFinal;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFinNumDictador(BigDecimal finNumDictador) {
        this.finNumDictador = finNumDictador;
    }

    public BigDecimal getFinNumDictador() {
        return this.finNumDictador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFinNomDictador(String finNomDictador) {
        this.finNomDictador = finNomDictador;
    }

    public String getFinNomDictador() {
        return this.finNomDictador;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFinAnoAltaReg(BigDecimal finAnoAltaReg) {
        this.finAnoAltaReg = finAnoAltaReg;
    }

    public BigDecimal getFinAnoAltaReg() {
        return this.finAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFinMesAltaReg(BigDecimal finMesAltaReg) {
        this.finMesAltaReg = finMesAltaReg;
    }

    public BigDecimal getFinMesAltaReg() {
        return this.finMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFinDiaAltaReg(BigDecimal finDiaAltaReg) {
        this.finDiaAltaReg = finDiaAltaReg;
    }

    public BigDecimal getFinDiaAltaReg() {
        return this.finDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setFinAnoUltMod(BigDecimal finAnoUltMod) {
        this.finAnoUltMod = finAnoUltMod;
    }

    public BigDecimal getFinAnoUltMod() {
        return this.finAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFinMesUltMod(BigDecimal finMesUltMod) {
        this.finMesUltMod = finMesUltMod;
    }

    public BigDecimal getFinMesUltMod() {
        return this.finMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setFinDiaUltMod(BigDecimal finDiaUltMod) {
        this.finDiaUltMod = finDiaUltMod;
    }

    public BigDecimal getFinDiaUltMod() {
        return this.finDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFinCveStFinalid(String finCveStFinalid) {
        this.finCveStFinalid = finCveStFinalid;
    }

    public String getFinCveStFinalid() {
        return this.finCveStFinalid;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FINALIDAH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFinNumContrato() != null && this.getFinNumContrato().longValue() == -999) {
            conditions += " AND FIN_NUM_CONTRATO IS NULL";
        } else if (this.getFinNumContrato() != null) {
            conditions += " AND FIN_NUM_CONTRATO = ?";
            values.add(this.getFinNumContrato());
        }

        if (this.getFinFolioFinalida() != null && this.getFinFolioFinalida().longValue() == -999) {
            conditions += " AND FIN_FOLIO_FINALIDA IS NULL";
        } else if (this.getFinFolioFinalida() != null) {
            conditions += " AND FIN_FOLIO_FINALIDA = ?";
            values.add(this.getFinFolioFinalida());
        }

        if (this.getFinCveTipoFinal() != null && "null".equals(this.getFinCveTipoFinal())) {
            conditions += " AND FIN_CVE_TIPO_FINAL IS NULL";
        } else if (this.getFinCveTipoFinal() != null) {
            conditions += " AND FIN_CVE_TIPO_FINAL = ?";
            values.add(this.getFinCveTipoFinal());
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
        String sql = "SELECT * FROM FINALIDAH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFinNumContrato() != null && this.getFinNumContrato().longValue() == -999) {
            conditions += " AND FIN_NUM_CONTRATO IS NULL";
        } else if (this.getFinNumContrato() != null) {
            conditions += " AND FIN_NUM_CONTRATO = ?";
            values.add(this.getFinNumContrato());
        }

        if (this.getFinFolioFinalida() != null && this.getFinFolioFinalida().longValue() == -999) {
            conditions += " AND FIN_FOLIO_FINALIDA IS NULL";
        } else if (this.getFinFolioFinalida() != null) {
            conditions += " AND FIN_FOLIO_FINALIDA = ?";
            values.add(this.getFinFolioFinalida());
        }

        if (this.getFinTxtComentario() != null && this.getFinTxtComentario() == -999) {
            conditions += " AND FIN_TXT_COMENTARIO IS NULL";
        } else if (this.getFinTxtComentario() != null) {
            conditions += " AND FIN_TXT_COMENTARIO = ?";
            values.add(this.getFinTxtComentario());
        }

        if (this.getFinCveTipoFinal() != null && "null".equals(this.getFinCveTipoFinal())) {
            conditions += " AND FIN_CVE_TIPO_FINAL IS NULL";
        } else if (this.getFinCveTipoFinal() != null) {
            conditions += " AND FIN_CVE_TIPO_FINAL = ?";
            values.add(this.getFinCveTipoFinal());
        }

        if (this.getFinNumDictador() != null && this.getFinNumDictador().longValue() == -999) {
            conditions += " AND FIN_NUM_DICTADOR IS NULL";
        } else if (this.getFinNumDictador() != null) {
            conditions += " AND FIN_NUM_DICTADOR = ?";
            values.add(this.getFinNumDictador());
        }

        if (this.getFinNomDictador() != null && "null".equals(this.getFinNomDictador())) {
            conditions += " AND FIN_NOM_DICTADOR IS NULL";
        } else if (this.getFinNomDictador() != null) {
            conditions += " AND FIN_NOM_DICTADOR = ?";
            values.add(this.getFinNomDictador());
        }

        if (this.getFinAnoAltaReg() != null && this.getFinAnoAltaReg().longValue() == -999) {
            conditions += " AND FIN_ANO_ALTA_REG IS NULL";
        } else if (this.getFinAnoAltaReg() != null) {
            conditions += " AND FIN_ANO_ALTA_REG = ?";
            values.add(this.getFinAnoAltaReg());
        }

        if (this.getFinMesAltaReg() != null && this.getFinMesAltaReg().longValue() == -999) {
            conditions += " AND FIN_MES_ALTA_REG IS NULL";
        } else if (this.getFinMesAltaReg() != null) {
            conditions += " AND FIN_MES_ALTA_REG = ?";
            values.add(this.getFinMesAltaReg());
        }

        if (this.getFinDiaAltaReg() != null && this.getFinDiaAltaReg().longValue() == -999) {
            conditions += " AND FIN_DIA_ALTA_REG IS NULL";
        } else if (this.getFinDiaAltaReg() != null) {
            conditions += " AND FIN_DIA_ALTA_REG = ?";
            values.add(this.getFinDiaAltaReg());
        }

        if (this.getFinAnoUltMod() != null && this.getFinAnoUltMod().longValue() == -999) {
            conditions += " AND FIN_ANO_ULT_MOD IS NULL";
        } else if (this.getFinAnoUltMod() != null) {
            conditions += " AND FIN_ANO_ULT_MOD = ?";
            values.add(this.getFinAnoUltMod());
        }

        if (this.getFinMesUltMod() != null && this.getFinMesUltMod().longValue() == -999) {
            conditions += " AND FIN_MES_ULT_MOD IS NULL";
        } else if (this.getFinMesUltMod() != null) {
            conditions += " AND FIN_MES_ULT_MOD = ?";
            values.add(this.getFinMesUltMod());
        }

        if (this.getFinDiaUltMod() != null && this.getFinDiaUltMod().longValue() == -999) {
            conditions += " AND FIN_DIA_ULT_MOD IS NULL";
        } else if (this.getFinDiaUltMod() != null) {
            conditions += " AND FIN_DIA_ULT_MOD = ?";
            values.add(this.getFinDiaUltMod());
        }

        if (this.getFinCveStFinalid() != null && "null".equals(this.getFinCveStFinalid())) {
            conditions += " AND FIN_CVE_ST_FINALID IS NULL";
        } else if (this.getFinCveStFinalid() != null) {
            conditions += " AND FIN_CVE_ST_FINALID = ?";
            values.add(this.getFinCveStFinalid());
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
        String sql = "UPDATE FINALIDAH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

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
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO FINALIDAH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FIN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getFinNumContrato());

        fields += ", FIN_FOLIO_FINALIDA";
        fieldValues += ", ?";
        values.add(this.getFinFolioFinalida());

        fields += ", FIN_TXT_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFinTxtComentario());

        fields += ", FIN_CVE_TIPO_FINAL";
        fieldValues += ", ?";
        values.add(this.getFinCveTipoFinal());

        fields += ", FIN_NUM_DICTADOR";
        fieldValues += ", ?";
        values.add(this.getFinNumDictador());

        fields += ", FIN_NOM_DICTADOR";
        fieldValues += ", ?";
        values.add(this.getFinNomDictador());

        fields += ", FIN_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFinAnoAltaReg());

        fields += ", FIN_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFinMesAltaReg());

        fields += ", FIN_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getFinDiaAltaReg());

        fields += ", FIN_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFinAnoUltMod());

        fields += ", FIN_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFinMesUltMod());

        fields += ", FIN_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getFinDiaUltMod());

        fields += ", FIN_CVE_ST_FINALID";
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
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM FINALIDAH WHERE ";

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
        Finalidah instance = (Finalidah) compareWith;
        boolean equalObjects = true;
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
        Finalidah result = new Finalidah();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFinNumContrato((BigDecimal) objectData.getData("FIN_NUM_CONTRATO"));
        result.setFinFolioFinalida((BigDecimal) objectData.getData("FIN_FOLIO_FINALIDA"));
        result.setFinTxtComentario((Long) objectData.getData("FIN_TXT_COMENTARIO"));
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
