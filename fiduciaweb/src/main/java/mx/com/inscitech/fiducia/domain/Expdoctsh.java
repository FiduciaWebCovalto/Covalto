package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EXPDOCTSH_PK", columns = { "EXD_NUM_EXPEDIENTE", "EXD_ID_DOCUMENTO", "EXD_NUM_DOCUMENTO" }, sequences = { "MANUAL" })
public class Expdoctsh extends DomainObject {

    BigDecimal exdNumExpediente = null;
    BigDecimal exdNumDocumento = null;
    String exdIdDocumento = null;
    BigDecimal exdNumFolioInst = null;
    BigDecimal exdNumFolioFina = null;
    String exdTextComentar = null;
    BigDecimal exdAnoAltaReg = null;
    BigDecimal exdMesAltaReg = null;
    BigDecimal exdDiaAltaReg = null;
    BigDecimal exdAnoUltMod = null;
    BigDecimal exdMesUltMod = null;
    BigDecimal exdDiaUltMod = null;
    String exdCveStDocumen = null;

    public Expdoctsh() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExdNumExpediente(BigDecimal exdNumExpediente) {
        this.exdNumExpediente = exdNumExpediente;
    }

    public BigDecimal getExdNumExpediente() {
        return this.exdNumExpediente;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExdNumDocumento(BigDecimal exdNumDocumento) {
        this.exdNumDocumento = exdNumDocumento;
    }

    public BigDecimal getExdNumDocumento() {
        return this.exdNumDocumento;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExdIdDocumento(String exdIdDocumento) {
        this.exdIdDocumento = exdIdDocumento;
    }

    public String getExdIdDocumento() {
        return this.exdIdDocumento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExdNumFolioInst(BigDecimal exdNumFolioInst) {
        this.exdNumFolioInst = exdNumFolioInst;
    }

    public BigDecimal getExdNumFolioInst() {
        return this.exdNumFolioInst;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExdNumFolioFina(BigDecimal exdNumFolioFina) {
        this.exdNumFolioFina = exdNumFolioFina;
    }

    public BigDecimal getExdNumFolioFina() {
        return this.exdNumFolioFina;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExdTextComentar(String exdTextComentar) {
        this.exdTextComentar = exdTextComentar;
    }

    public String getExdTextComentar() {
        return this.exdTextComentar;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExdAnoAltaReg(BigDecimal exdAnoAltaReg) {
        this.exdAnoAltaReg = exdAnoAltaReg;
    }

    public BigDecimal getExdAnoAltaReg() {
        return this.exdAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExdMesAltaReg(BigDecimal exdMesAltaReg) {
        this.exdMesAltaReg = exdMesAltaReg;
    }

    public BigDecimal getExdMesAltaReg() {
        return this.exdMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExdDiaAltaReg(BigDecimal exdDiaAltaReg) {
        this.exdDiaAltaReg = exdDiaAltaReg;
    }

    public BigDecimal getExdDiaAltaReg() {
        return this.exdDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExdAnoUltMod(BigDecimal exdAnoUltMod) {
        this.exdAnoUltMod = exdAnoUltMod;
    }

    public BigDecimal getExdAnoUltMod() {
        return this.exdAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExdMesUltMod(BigDecimal exdMesUltMod) {
        this.exdMesUltMod = exdMesUltMod;
    }

    public BigDecimal getExdMesUltMod() {
        return this.exdMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExdDiaUltMod(BigDecimal exdDiaUltMod) {
        this.exdDiaUltMod = exdDiaUltMod;
    }

    public BigDecimal getExdDiaUltMod() {
        return this.exdDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExdCveStDocumen(String exdCveStDocumen) {
        this.exdCveStDocumen = exdCveStDocumen;
    }

    public String getExdCveStDocumen() {
        return this.exdCveStDocumen;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EXPDOCTSH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getExdNumExpediente() != null && this.getExdNumExpediente().longValue() == -999) {
            conditions += " AND EXD_NUM_EXPEDIENTE IS NULL";
        } else if (this.getExdNumExpediente() != null) {
            conditions += " AND EXD_NUM_EXPEDIENTE = ?";
            values.add(this.getExdNumExpediente());
        }

        if (this.getExdNumDocumento() != null && this.getExdNumDocumento().longValue() == -999) {
            conditions += " AND EXD_NUM_DOCUMENTO IS NULL";
        } else if (this.getExdNumDocumento() != null) {
            conditions += " AND EXD_NUM_DOCUMENTO = ?";
            values.add(this.getExdNumDocumento());
        }

        if (this.getExdIdDocumento() != null && "null".equals(this.getExdIdDocumento())) {
            conditions += " AND EXD_ID_DOCUMENTO IS NULL";
        } else if (this.getExdIdDocumento() != null) {
            conditions += " AND EXD_ID_DOCUMENTO = ?";
            values.add(this.getExdIdDocumento());
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
        String sql = "SELECT * FROM EXPDOCTSH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getExdNumExpediente() != null && this.getExdNumExpediente().longValue() == -999) {
            conditions += " AND EXD_NUM_EXPEDIENTE IS NULL";
        } else if (this.getExdNumExpediente() != null) {
            conditions += " AND EXD_NUM_EXPEDIENTE = ?";
            values.add(this.getExdNumExpediente());
        }

        if (this.getExdNumDocumento() != null && this.getExdNumDocumento().longValue() == -999) {
            conditions += " AND EXD_NUM_DOCUMENTO IS NULL";
        } else if (this.getExdNumDocumento() != null) {
            conditions += " AND EXD_NUM_DOCUMENTO = ?";
            values.add(this.getExdNumDocumento());
        }

        if (this.getExdIdDocumento() != null && "null".equals(this.getExdIdDocumento())) {
            conditions += " AND EXD_ID_DOCUMENTO IS NULL";
        } else if (this.getExdIdDocumento() != null) {
            conditions += " AND EXD_ID_DOCUMENTO = ?";
            values.add(this.getExdIdDocumento());
        }

        if (this.getExdNumFolioInst() != null && this.getExdNumFolioInst().longValue() == -999) {
            conditions += " AND EXD_NUM_FOLIO_INST IS NULL";
        } else if (this.getExdNumFolioInst() != null) {
            conditions += " AND EXD_NUM_FOLIO_INST = ?";
            values.add(this.getExdNumFolioInst());
        }

        if (this.getExdNumFolioFina() != null && this.getExdNumFolioFina().longValue() == -999) {
            conditions += " AND EXD_NUM_FOLIO_FINA IS NULL";
        } else if (this.getExdNumFolioFina() != null) {
            conditions += " AND EXD_NUM_FOLIO_FINA = ?";
            values.add(this.getExdNumFolioFina());
        }

        if (this.getExdTextComentar() != null && "null".equals(this.getExdTextComentar())) {
            conditions += " AND EXD_TEXT_COMENTAR IS NULL";
        } else if (this.getExdTextComentar() != null) {
            conditions += " AND EXD_TEXT_COMENTAR = ?";
            values.add(this.getExdTextComentar());
        }

        if (this.getExdAnoAltaReg() != null && this.getExdAnoAltaReg().longValue() == -999) {
            conditions += " AND EXD_ANO_ALTA_REG IS NULL";
        } else if (this.getExdAnoAltaReg() != null) {
            conditions += " AND EXD_ANO_ALTA_REG = ?";
            values.add(this.getExdAnoAltaReg());
        }

        if (this.getExdMesAltaReg() != null && this.getExdMesAltaReg().longValue() == -999) {
            conditions += " AND EXD_MES_ALTA_REG IS NULL";
        } else if (this.getExdMesAltaReg() != null) {
            conditions += " AND EXD_MES_ALTA_REG = ?";
            values.add(this.getExdMesAltaReg());
        }

        if (this.getExdDiaAltaReg() != null && this.getExdDiaAltaReg().longValue() == -999) {
            conditions += " AND EXD_DIA_ALTA_REG IS NULL";
        } else if (this.getExdDiaAltaReg() != null) {
            conditions += " AND EXD_DIA_ALTA_REG = ?";
            values.add(this.getExdDiaAltaReg());
        }

        if (this.getExdAnoUltMod() != null && this.getExdAnoUltMod().longValue() == -999) {
            conditions += " AND EXD_ANO_ULT_MOD IS NULL";
        } else if (this.getExdAnoUltMod() != null) {
            conditions += " AND EXD_ANO_ULT_MOD = ?";
            values.add(this.getExdAnoUltMod());
        }

        if (this.getExdMesUltMod() != null && this.getExdMesUltMod().longValue() == -999) {
            conditions += " AND EXD_MES_ULT_MOD IS NULL";
        } else if (this.getExdMesUltMod() != null) {
            conditions += " AND EXD_MES_ULT_MOD = ?";
            values.add(this.getExdMesUltMod());
        }

        if (this.getExdDiaUltMod() != null && this.getExdDiaUltMod().longValue() == -999) {
            conditions += " AND EXD_DIA_ULT_MOD IS NULL";
        } else if (this.getExdDiaUltMod() != null) {
            conditions += " AND EXD_DIA_ULT_MOD = ?";
            values.add(this.getExdDiaUltMod());
        }

        if (this.getExdCveStDocumen() != null && "null".equals(this.getExdCveStDocumen())) {
            conditions += " AND EXD_CVE_ST_DOCUMEN IS NULL";
        } else if (this.getExdCveStDocumen() != null) {
            conditions += " AND EXD_CVE_ST_DOCUMEN = ?";
            values.add(this.getExdCveStDocumen());
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
        String sql = "UPDATE EXPDOCTSH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EXD_NUM_EXPEDIENTE = ?";
        pkValues.add(this.getExdNumExpediente());
        conditions += " AND EXD_NUM_DOCUMENTO = ?";
        pkValues.add(this.getExdNumDocumento());
        conditions += " AND EXD_ID_DOCUMENTO = ?";
        pkValues.add(this.getExdIdDocumento());
        fields += " EXD_NUM_FOLIO_INST = ?, ";
        values.add(this.getExdNumFolioInst());
        fields += " EXD_NUM_FOLIO_FINA = ?, ";
        values.add(this.getExdNumFolioFina());
        fields += " EXD_TEXT_COMENTAR = ?, ";
        values.add(this.getExdTextComentar());
        fields += " EXD_ANO_ALTA_REG = ?, ";
        values.add(this.getExdAnoAltaReg());
        fields += " EXD_MES_ALTA_REG = ?, ";
        values.add(this.getExdMesAltaReg());
        fields += " EXD_DIA_ALTA_REG = ?, ";
        values.add(this.getExdDiaAltaReg());
        fields += " EXD_ANO_ULT_MOD = ?, ";
        values.add(this.getExdAnoUltMod());
        fields += " EXD_MES_ULT_MOD = ?, ";
        values.add(this.getExdMesUltMod());
        fields += " EXD_DIA_ULT_MOD = ?, ";
        values.add(this.getExdDiaUltMod());
        fields += " EXD_CVE_ST_DOCUMEN = ?, ";
        values.add(this.getExdCveStDocumen());
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
        String sql = "INSERT INTO EXPDOCTSH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EXD_NUM_EXPEDIENTE";
        fieldValues += ", ?";
        values.add(this.getExdNumExpediente());

        fields += ", EXD_NUM_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getExdNumDocumento());

        fields += ", EXD_ID_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getExdIdDocumento());

        fields += ", EXD_NUM_FOLIO_INST";
        fieldValues += ", ?";
        values.add(this.getExdNumFolioInst());

        fields += ", EXD_NUM_FOLIO_FINA";
        fieldValues += ", ?";
        values.add(this.getExdNumFolioFina());

        fields += ", EXD_TEXT_COMENTAR";
        fieldValues += ", ?";
        values.add(this.getExdTextComentar());

        fields += ", EXD_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExdAnoAltaReg());

        fields += ", EXD_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExdMesAltaReg());

        fields += ", EXD_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExdDiaAltaReg());

        fields += ", EXD_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExdAnoUltMod());

        fields += ", EXD_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExdMesUltMod());

        fields += ", EXD_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExdDiaUltMod());

        fields += ", EXD_CVE_ST_DOCUMEN";
        fieldValues += ", ?";
        values.add(this.getExdCveStDocumen());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EXPDOCTSH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EXD_NUM_EXPEDIENTE = ?";
        values.add(this.getExdNumExpediente());
        conditions += " AND EXD_NUM_DOCUMENTO = ?";
        values.add(this.getExdNumDocumento());
        conditions += " AND EXD_ID_DOCUMENTO = ?";
        values.add(this.getExdIdDocumento());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Expdoctsh instance = (Expdoctsh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getExdNumExpediente().equals(instance.getExdNumExpediente()))
            equalObjects = false;
        if (equalObjects && !this.getExdNumDocumento().equals(instance.getExdNumDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getExdIdDocumento().equals(instance.getExdIdDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getExdNumFolioInst().equals(instance.getExdNumFolioInst()))
            equalObjects = false;
        if (equalObjects && !this.getExdNumFolioFina().equals(instance.getExdNumFolioFina()))
            equalObjects = false;
        if (equalObjects && !this.getExdTextComentar().equals(instance.getExdTextComentar()))
            equalObjects = false;
        if (equalObjects && !this.getExdAnoAltaReg().equals(instance.getExdAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExdMesAltaReg().equals(instance.getExdMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExdDiaAltaReg().equals(instance.getExdDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExdAnoUltMod().equals(instance.getExdAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExdMesUltMod().equals(instance.getExdMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExdDiaUltMod().equals(instance.getExdDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExdCveStDocumen().equals(instance.getExdCveStDocumen()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Expdoctsh result = new Expdoctsh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setExdNumExpediente((BigDecimal) objectData.getData("EXD_NUM_EXPEDIENTE"));
        result.setExdNumDocumento((BigDecimal) objectData.getData("EXD_NUM_DOCUMENTO"));
        result.setExdIdDocumento((String) objectData.getData("EXD_ID_DOCUMENTO"));
        result.setExdNumFolioInst((BigDecimal) objectData.getData("EXD_NUM_FOLIO_INST"));
        result.setExdNumFolioFina((BigDecimal) objectData.getData("EXD_NUM_FOLIO_FINA"));
        result.setExdTextComentar((String) objectData.getData("EXD_TEXT_COMENTAR"));
        result.setExdAnoAltaReg((BigDecimal) objectData.getData("EXD_ANO_ALTA_REG"));
        result.setExdMesAltaReg((BigDecimal) objectData.getData("EXD_MES_ALTA_REG"));
        result.setExdDiaAltaReg((BigDecimal) objectData.getData("EXD_DIA_ALTA_REG"));
        result.setExdAnoUltMod((BigDecimal) objectData.getData("EXD_ANO_ULT_MOD"));
        result.setExdMesUltMod((BigDecimal) objectData.getData("EXD_MES_ULT_MOD"));
        result.setExdDiaUltMod((BigDecimal) objectData.getData("EXD_DIA_ULT_MOD"));
        result.setExdCveStDocumen((String) objectData.getData("EXD_CVE_ST_DOCUMEN"));

        return result;

    }

}
