package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DOCUMENT_PK", columns = { "DOC_NUM_DOCUMENTO" }, sequences = { "MAX" })
public class Document extends DomainObject {

    BigDecimal docNumDocumento = null;
    String docNomDocumento = null;
    String docDescDocumento = null;
    String docCveTipoPers = null;
    String docCveTipoMigra = null;
    BigDecimal docAnoAltaReg = null;
    BigDecimal docMesAltaReg = null;
    BigDecimal docDiaAltaReg = null;
    BigDecimal docAnoUltMod = null;
    BigDecimal docMesUltMod = null;
    BigDecimal docDiaUltMod = null;
    String docCveStDocumen = null;

    public Document() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDocNumDocumento(BigDecimal docNumDocumento) {
        this.docNumDocumento = docNumDocumento;
    }

    public BigDecimal getDocNumDocumento() {
        return this.docNumDocumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDocNomDocumento(String docNomDocumento) {
        this.docNomDocumento = docNomDocumento;
    }

    public String getDocNomDocumento() {
        return this.docNomDocumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDocDescDocumento(String docDescDocumento) {
        this.docDescDocumento = docDescDocumento;
    }

    public String getDocDescDocumento() {
        return this.docDescDocumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDocCveTipoPers(String docCveTipoPers) {
        this.docCveTipoPers = docCveTipoPers;
    }

    public String getDocCveTipoPers() {
        return this.docCveTipoPers;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDocCveTipoMigra(String docCveTipoMigra) {
        this.docCveTipoMigra = docCveTipoMigra;
    }

    public String getDocCveTipoMigra() {
        return this.docCveTipoMigra;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDocAnoAltaReg(BigDecimal docAnoAltaReg) {
        this.docAnoAltaReg = docAnoAltaReg;
    }

    public BigDecimal getDocAnoAltaReg() {
        return this.docAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDocMesAltaReg(BigDecimal docMesAltaReg) {
        this.docMesAltaReg = docMesAltaReg;
    }

    public BigDecimal getDocMesAltaReg() {
        return this.docMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDocDiaAltaReg(BigDecimal docDiaAltaReg) {
        this.docDiaAltaReg = docDiaAltaReg;
    }

    public BigDecimal getDocDiaAltaReg() {
        return this.docDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDocAnoUltMod(BigDecimal docAnoUltMod) {
        this.docAnoUltMod = docAnoUltMod;
    }

    public BigDecimal getDocAnoUltMod() {
        return this.docAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDocMesUltMod(BigDecimal docMesUltMod) {
        this.docMesUltMod = docMesUltMod;
    }

    public BigDecimal getDocMesUltMod() {
        return this.docMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDocDiaUltMod(BigDecimal docDiaUltMod) {
        this.docDiaUltMod = docDiaUltMod;
    }

    public BigDecimal getDocDiaUltMod() {
        return this.docDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDocCveStDocumen(String docCveStDocumen) {
        this.docCveStDocumen = docCveStDocumen;
    }

    public String getDocCveStDocumen() {
        return this.docCveStDocumen;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DOCUMENT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDocNumDocumento() != null && this.getDocNumDocumento().longValue() == -999) {
            conditions += " AND DOC_NUM_DOCUMENTO IS NULL";
        } else if (this.getDocNumDocumento() != null) {
            conditions += " AND DOC_NUM_DOCUMENTO = ?";
            values.add(this.getDocNumDocumento());
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
        String sql = "SELECT * FROM DOCUMENT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDocNumDocumento() != null && this.getDocNumDocumento().longValue() == -999) {
            conditions += " AND DOC_NUM_DOCUMENTO IS NULL";
        } else if (this.getDocNumDocumento() != null) {
            conditions += " AND DOC_NUM_DOCUMENTO = ?";
            values.add(this.getDocNumDocumento());
        }

        if (this.getDocNomDocumento() != null && "null".equals(this.getDocNomDocumento())) {
            conditions += " AND DOC_NOM_DOCUMENTO IS NULL";
        } else if (this.getDocNomDocumento() != null) {
            conditions += " AND DOC_NOM_DOCUMENTO = ?";
            values.add(this.getDocNomDocumento());
        }

        if (this.getDocDescDocumento() != null && "null".equals(this.getDocDescDocumento())) {
            conditions += " AND DOC_DESC_DOCUMENTO IS NULL";
        } else if (this.getDocDescDocumento() != null) {
            conditions += " AND DOC_DESC_DOCUMENTO = ?";
            values.add(this.getDocDescDocumento());
        }

        if (this.getDocCveTipoPers() != null && "null".equals(this.getDocCveTipoPers())) {
            conditions += " AND DOC_CVE_TIPO_PERS IS NULL";
        } else if (this.getDocCveTipoPers() != null) {
            conditions += " AND DOC_CVE_TIPO_PERS = ?";
            values.add(this.getDocCveTipoPers());
        }

        if (this.getDocCveTipoMigra() != null && "null".equals(this.getDocCveTipoMigra())) {
            conditions += " AND DOC_CVE_TIPO_MIGRA IS NULL";
        } else if (this.getDocCveTipoMigra() != null) {
            conditions += " AND DOC_CVE_TIPO_MIGRA = ?";
            values.add(this.getDocCveTipoMigra());
        }

        if (this.getDocAnoAltaReg() != null && this.getDocAnoAltaReg().longValue() == -999) {
            conditions += " AND DOC_ANO_ALTA_REG IS NULL";
        } else if (this.getDocAnoAltaReg() != null) {
            conditions += " AND DOC_ANO_ALTA_REG = ?";
            values.add(this.getDocAnoAltaReg());
        }

        if (this.getDocMesAltaReg() != null && this.getDocMesAltaReg().longValue() == -999) {
            conditions += " AND DOC_MES_ALTA_REG IS NULL";
        } else if (this.getDocMesAltaReg() != null) {
            conditions += " AND DOC_MES_ALTA_REG = ?";
            values.add(this.getDocMesAltaReg());
        }

        if (this.getDocDiaAltaReg() != null && this.getDocDiaAltaReg().longValue() == -999) {
            conditions += " AND DOC_DIA_ALTA_REG IS NULL";
        } else if (this.getDocDiaAltaReg() != null) {
            conditions += " AND DOC_DIA_ALTA_REG = ?";
            values.add(this.getDocDiaAltaReg());
        }

        if (this.getDocAnoUltMod() != null && this.getDocAnoUltMod().longValue() == -999) {
            conditions += " AND DOC_ANO_ULT_MOD IS NULL";
        } else if (this.getDocAnoUltMod() != null) {
            conditions += " AND DOC_ANO_ULT_MOD = ?";
            values.add(this.getDocAnoUltMod());
        }

        if (this.getDocMesUltMod() != null && this.getDocMesUltMod().longValue() == -999) {
            conditions += " AND DOC_MES_ULT_MOD IS NULL";
        } else if (this.getDocMesUltMod() != null) {
            conditions += " AND DOC_MES_ULT_MOD = ?";
            values.add(this.getDocMesUltMod());
        }

        if (this.getDocDiaUltMod() != null && this.getDocDiaUltMod().longValue() == -999) {
            conditions += " AND DOC_DIA_ULT_MOD IS NULL";
        } else if (this.getDocDiaUltMod() != null) {
            conditions += " AND DOC_DIA_ULT_MOD = ?";
            values.add(this.getDocDiaUltMod());
        }

        if (this.getDocCveStDocumen() != null && "null".equals(this.getDocCveStDocumen())) {
            conditions += " AND DOC_CVE_ST_DOCUMEN IS NULL";
        } else if (this.getDocCveStDocumen() != null) {
            conditions += " AND DOC_CVE_ST_DOCUMEN = ?";
            values.add(this.getDocCveStDocumen());
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
        String sql = "UPDATE DOCUMENT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DOC_NUM_DOCUMENTO = ?";
        pkValues.add(this.getDocNumDocumento());
        fields += " DOC_NOM_DOCUMENTO = ?, ";
        values.add(this.getDocNomDocumento());
        fields += " DOC_DESC_DOCUMENTO = ?, ";
        values.add(this.getDocDescDocumento());
        fields += " DOC_CVE_TIPO_PERS = ?, ";
        values.add(this.getDocCveTipoPers());
        fields += " DOC_CVE_TIPO_MIGRA = ?, ";
        values.add(this.getDocCveTipoMigra());
        fields += " DOC_ANO_ALTA_REG = ?, ";
        values.add(this.getDocAnoAltaReg());
        fields += " DOC_MES_ALTA_REG = ?, ";
        values.add(this.getDocMesAltaReg());
        fields += " DOC_DIA_ALTA_REG = ?, ";
        values.add(this.getDocDiaAltaReg());
        fields += " DOC_ANO_ULT_MOD = ?, ";
        values.add(this.getDocAnoUltMod());
        fields += " DOC_MES_ULT_MOD = ?, ";
        values.add(this.getDocMesUltMod());
        fields += " DOC_DIA_ULT_MOD = ?, ";
        values.add(this.getDocDiaUltMod());
        fields += " DOC_CVE_ST_DOCUMEN = ?, ";
        values.add(this.getDocCveStDocumen());
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
        String sql = "INSERT INTO DOCUMENT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DOC_NUM_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getDocNumDocumento());

        fields += ", DOC_NOM_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getDocNomDocumento());

        fields += ", DOC_DESC_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getDocDescDocumento());

        fields += ", DOC_CVE_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getDocCveTipoPers());

        fields += ", DOC_CVE_TIPO_MIGRA";
        fieldValues += ", ?";
        values.add(this.getDocCveTipoMigra());

        fields += ", DOC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDocAnoAltaReg());

        fields += ", DOC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDocMesAltaReg());

        fields += ", DOC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDocDiaAltaReg());

        fields += ", DOC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDocAnoUltMod());

        fields += ", DOC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDocMesUltMod());

        fields += ", DOC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDocDiaUltMod());

        fields += ", DOC_CVE_ST_DOCUMEN";
        fieldValues += ", ?";
        values.add(this.getDocCveStDocumen());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DOCUMENT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DOC_NUM_DOCUMENTO = ?";
        values.add(this.getDocNumDocumento());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Document instance = (Document) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDocNumDocumento().equals(instance.getDocNumDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getDocNomDocumento().equals(instance.getDocNomDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getDocDescDocumento().equals(instance.getDocDescDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getDocCveTipoPers().equals(instance.getDocCveTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getDocCveTipoMigra().equals(instance.getDocCveTipoMigra()))
            equalObjects = false;
        if (equalObjects && !this.getDocAnoAltaReg().equals(instance.getDocAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDocMesAltaReg().equals(instance.getDocMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDocDiaAltaReg().equals(instance.getDocDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDocAnoUltMod().equals(instance.getDocAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDocMesUltMod().equals(instance.getDocMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDocDiaUltMod().equals(instance.getDocDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDocCveStDocumen().equals(instance.getDocCveStDocumen()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Document result = new Document();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDocNumDocumento((BigDecimal) objectData.getData("DOC_NUM_DOCUMENTO"));
        result.setDocNomDocumento((String) objectData.getData("DOC_NOM_DOCUMENTO"));
        result.setDocDescDocumento((String) objectData.getData("DOC_DESC_DOCUMENTO"));
        result.setDocCveTipoPers((String) objectData.getData("DOC_CVE_TIPO_PERS"));
        result.setDocCveTipoMigra((String) objectData.getData("DOC_CVE_TIPO_MIGRA"));
        result.setDocAnoAltaReg((BigDecimal) objectData.getData("DOC_ANO_ALTA_REG"));
        result.setDocMesAltaReg((BigDecimal) objectData.getData("DOC_MES_ALTA_REG"));
        result.setDocDiaAltaReg((BigDecimal) objectData.getData("DOC_DIA_ALTA_REG"));
        result.setDocAnoUltMod((BigDecimal) objectData.getData("DOC_ANO_ULT_MOD"));
        result.setDocMesUltMod((BigDecimal) objectData.getData("DOC_MES_ULT_MOD"));
        result.setDocDiaUltMod((BigDecimal) objectData.getData("DOC_DIA_ULT_MOD"));
        result.setDocCveStDocumen((String) objectData.getData("DOC_CVE_ST_DOCUMEN"));

        return result;

    }

}
