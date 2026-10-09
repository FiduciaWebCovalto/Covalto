package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "GARNBURS_PK", columns = { "GRN_NUM_CONTRATO", "GRN_SUB_CONTRATO", "GRN_NUM_NOBURSATIL" }, sequences = { "MANUAL" })
public class Garnburs extends DomainObject {

    BigDecimal grnNumContrato = null;
    BigDecimal grnSubContrato = null;
    BigDecimal grnNumNobursatil = null;
    String grnCveTipoGaran = null;
    String grnIdDocumento = null;
    BigDecimal grnImpDocumento = null;
    BigDecimal grnImpUltValua = null;
    String grnFecUltValua = null;
    String grnFecVencimDoc = null;
    Long grnTextoDescrip = null;
    String grnTexComentario = null;
    BigDecimal grnCveRevalua = null;
    String grnCvePerValua = null;
    String grnCveStNobursa = null;

    public Garnburs() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrnNumContrato(BigDecimal grnNumContrato) {
        this.grnNumContrato = grnNumContrato;
    }

    public BigDecimal getGrnNumContrato() {
        return this.grnNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrnSubContrato(BigDecimal grnSubContrato) {
        this.grnSubContrato = grnSubContrato;
    }

    public BigDecimal getGrnSubContrato() {
        return this.grnSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrnNumNobursatil(BigDecimal grnNumNobursatil) {
        this.grnNumNobursatil = grnNumNobursatil;
    }

    public BigDecimal getGrnNumNobursatil() {
        return this.grnNumNobursatil;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnCveTipoGaran(String grnCveTipoGaran) {
        this.grnCveTipoGaran = grnCveTipoGaran;
    }

    public String getGrnCveTipoGaran() {
        return this.grnCveTipoGaran;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnIdDocumento(String grnIdDocumento) {
        this.grnIdDocumento = grnIdDocumento;
    }

    public String getGrnIdDocumento() {
        return this.grnIdDocumento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGrnImpDocumento(BigDecimal grnImpDocumento) {
        this.grnImpDocumento = grnImpDocumento;
    }

    public BigDecimal getGrnImpDocumento() {
        return this.grnImpDocumento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGrnImpUltValua(BigDecimal grnImpUltValua) {
        this.grnImpUltValua = grnImpUltValua;
    }

    public BigDecimal getGrnImpUltValua() {
        return this.grnImpUltValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnFecUltValua(String grnFecUltValua) {
        this.grnFecUltValua = grnFecUltValua;
    }

    public String getGrnFecUltValua() {
        return this.grnFecUltValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnFecVencimDoc(String grnFecVencimDoc) {
        this.grnFecVencimDoc = grnFecVencimDoc;
    }

    public String getGrnFecVencimDoc() {
        return this.grnFecVencimDoc;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setGrnTextoDescrip(Long grnTextoDescrip) {
        this.grnTextoDescrip = grnTextoDescrip;
    }

    public Long getGrnTextoDescrip() {
        return this.grnTextoDescrip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnTexComentario(String grnTexComentario) {
        this.grnTexComentario = grnTexComentario;
    }

    public String getGrnTexComentario() {
        return this.grnTexComentario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGrnCveRevalua(BigDecimal grnCveRevalua) {
        this.grnCveRevalua = grnCveRevalua;
    }

    public BigDecimal getGrnCveRevalua() {
        return this.grnCveRevalua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnCvePerValua(String grnCvePerValua) {
        this.grnCvePerValua = grnCvePerValua;
    }

    public String getGrnCvePerValua() {
        return this.grnCvePerValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnCveStNobursa(String grnCveStNobursa) {
        this.grnCveStNobursa = grnCveStNobursa;
    }

    public String getGrnCveStNobursa() {
        return this.grnCveStNobursa;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM GARNBURS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGrnNumContrato() != null && this.getGrnNumContrato().longValue() == -999) {
            conditions += " AND GRN_NUM_CONTRATO IS NULL";
        } else if (this.getGrnNumContrato() != null) {
            conditions += " AND GRN_NUM_CONTRATO = ?";
            values.add(this.getGrnNumContrato());
        }

        if (this.getGrnSubContrato() != null && this.getGrnSubContrato().longValue() == -999) {
            conditions += " AND GRN_SUB_CONTRATO IS NULL";
        } else if (this.getGrnSubContrato() != null) {
            conditions += " AND GRN_SUB_CONTRATO = ?";
            values.add(this.getGrnSubContrato());
        }

        if (this.getGrnNumNobursatil() != null && this.getGrnNumNobursatil().longValue() == -999) {
            conditions += " AND GRN_NUM_NOBURSATIL IS NULL";
        } else if (this.getGrnNumNobursatil() != null) {
            conditions += " AND GRN_NUM_NOBURSATIL = ?";
            values.add(this.getGrnNumNobursatil());
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
        String sql = "SELECT * FROM GARNBURS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGrnNumContrato() != null && this.getGrnNumContrato().longValue() == -999) {
            conditions += " AND GRN_NUM_CONTRATO IS NULL";
        } else if (this.getGrnNumContrato() != null) {
            conditions += " AND GRN_NUM_CONTRATO = ?";
            values.add(this.getGrnNumContrato());
        }

        if (this.getGrnSubContrato() != null && this.getGrnSubContrato().longValue() == -999) {
            conditions += " AND GRN_SUB_CONTRATO IS NULL";
        } else if (this.getGrnSubContrato() != null) {
            conditions += " AND GRN_SUB_CONTRATO = ?";
            values.add(this.getGrnSubContrato());
        }

        if (this.getGrnNumNobursatil() != null && this.getGrnNumNobursatil().longValue() == -999) {
            conditions += " AND GRN_NUM_NOBURSATIL IS NULL";
        } else if (this.getGrnNumNobursatil() != null) {
            conditions += " AND GRN_NUM_NOBURSATIL = ?";
            values.add(this.getGrnNumNobursatil());
        }

        if (this.getGrnCveTipoGaran() != null && "null".equals(this.getGrnCveTipoGaran())) {
            conditions += " AND GRN_CVE_TIPO_GARAN IS NULL";
        } else if (this.getGrnCveTipoGaran() != null) {
            conditions += " AND GRN_CVE_TIPO_GARAN = ?";
            values.add(this.getGrnCveTipoGaran());
        }

        if (this.getGrnIdDocumento() != null && "null".equals(this.getGrnIdDocumento())) {
            conditions += " AND GRN_ID_DOCUMENTO IS NULL";
        } else if (this.getGrnIdDocumento() != null) {
            conditions += " AND GRN_ID_DOCUMENTO = ?";
            values.add(this.getGrnIdDocumento());
        }

        if (this.getGrnImpDocumento() != null && this.getGrnImpDocumento().longValue() == -999) {
            conditions += " AND GRN_IMP_DOCUMENTO IS NULL";
        } else if (this.getGrnImpDocumento() != null) {
            conditions += " AND GRN_IMP_DOCUMENTO = ?";
            values.add(this.getGrnImpDocumento());
        }

        if (this.getGrnImpUltValua() != null && this.getGrnImpUltValua().longValue() == -999) {
            conditions += " AND GRN_IMP_ULT_VALUA IS NULL";
        } else if (this.getGrnImpUltValua() != null) {
            conditions += " AND GRN_IMP_ULT_VALUA = ?";
            values.add(this.getGrnImpUltValua());
        }

        if (this.getGrnFecUltValua() != null && "null".equals(this.getGrnFecUltValua())) {
            conditions += " AND GRN_FEC_ULT_VALUA IS NULL";
        } else if (this.getGrnFecUltValua() != null) {
            conditions += " AND GRN_FEC_ULT_VALUA = ?";
            values.add(this.getGrnFecUltValua());
        }

        if (this.getGrnFecVencimDoc() != null && "null".equals(this.getGrnFecVencimDoc())) {
            conditions += " AND GRN_FEC_VENCIM_DOC IS NULL";
        } else if (this.getGrnFecVencimDoc() != null) {
            conditions += " AND GRN_FEC_VENCIM_DOC = ?";
            values.add(this.getGrnFecVencimDoc());
        }

        if (this.getGrnTextoDescrip() != null && this.getGrnTextoDescrip() == -999) {
            conditions += " AND GRN_TEXTO_DESCRIP IS NULL";
        } else if (this.getGrnTextoDescrip() != null) {
            conditions += " AND GRN_TEXTO_DESCRIP = ?";
            values.add(this.getGrnTextoDescrip());
        }

        if (this.getGrnTexComentario() != null && "null".equals(this.getGrnTexComentario())) {
            conditions += " AND GRN_TEX_COMENTARIO IS NULL";
        } else if (this.getGrnTexComentario() != null) {
            conditions += " AND GRN_TEX_COMENTARIO = ?";
            values.add(this.getGrnTexComentario());
        }

        if (this.getGrnCveRevalua() != null && this.getGrnCveRevalua().longValue() == -999) {
            conditions += " AND GRN_CVE_REVALUA IS NULL";
        } else if (this.getGrnCveRevalua() != null) {
            conditions += " AND GRN_CVE_REVALUA = ?";
            values.add(this.getGrnCveRevalua());
        }

        if (this.getGrnCvePerValua() != null && "null".equals(this.getGrnCvePerValua())) {
            conditions += " AND GRN_CVE_PER_VALUA IS NULL";
        } else if (this.getGrnCvePerValua() != null) {
            conditions += " AND GRN_CVE_PER_VALUA = ?";
            values.add(this.getGrnCvePerValua());
        }

        if (this.getGrnCveStNobursa() != null && "null".equals(this.getGrnCveStNobursa())) {
            conditions += " AND GRN_CVE_ST_NOBURSA IS NULL";
        } else if (this.getGrnCveStNobursa() != null) {
            conditions += " AND GRN_CVE_ST_NOBURSA = ?";
            values.add(this.getGrnCveStNobursa());
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
        String sql = "UPDATE GARNBURS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GRN_NUM_CONTRATO = ?";
        pkValues.add(this.getGrnNumContrato());
        conditions += " AND GRN_SUB_CONTRATO = ?";
        pkValues.add(this.getGrnSubContrato());
        conditions += " AND GRN_NUM_NOBURSATIL = ?";
        pkValues.add(this.getGrnNumNobursatil());
        fields += " GRN_CVE_TIPO_GARAN = ?, ";
        values.add(this.getGrnCveTipoGaran());
        fields += " GRN_ID_DOCUMENTO = ?, ";
        values.add(this.getGrnIdDocumento());
        fields += " GRN_IMP_DOCUMENTO = ?, ";
        values.add(this.getGrnImpDocumento());
        fields += " GRN_IMP_ULT_VALUA = ?, ";
        values.add(this.getGrnImpUltValua());
        fields += " GRN_FEC_ULT_VALUA = ?, ";
        values.add(this.getGrnFecUltValua());
        fields += " GRN_FEC_VENCIM_DOC = ?, ";
        values.add(this.getGrnFecVencimDoc());
        fields += " GRN_TEXTO_DESCRIP = ?, ";
        values.add(this.getGrnTextoDescrip());
        fields += " GRN_TEX_COMENTARIO = ?, ";
        values.add(this.getGrnTexComentario());
        fields += " GRN_CVE_REVALUA = ?, ";
        values.add(this.getGrnCveRevalua());
        fields += " GRN_CVE_PER_VALUA = ?, ";
        values.add(this.getGrnCvePerValua());
        fields += " GRN_CVE_ST_NOBURSA = ?, ";
        values.add(this.getGrnCveStNobursa());
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
        String sql = "INSERT INTO GARNBURS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GRN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getGrnNumContrato());

        fields += ", GRN_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getGrnSubContrato());

        fields += ", GRN_NUM_NOBURSATIL";
        fieldValues += ", ?";
        values.add(this.getGrnNumNobursatil());

        fields += ", GRN_CVE_TIPO_GARAN";
        fieldValues += ", ?";
        values.add(this.getGrnCveTipoGaran());

        fields += ", GRN_ID_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getGrnIdDocumento());

        fields += ", GRN_IMP_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getGrnImpDocumento());

        fields += ", GRN_IMP_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrnImpUltValua());

        fields += ", GRN_FEC_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrnFecUltValua());

        fields += ", GRN_FEC_VENCIM_DOC";
        fieldValues += ", ?";
        values.add(this.getGrnFecVencimDoc());

        fields += ", GRN_TEXTO_DESCRIP";
        fieldValues += ", ?";
        values.add(this.getGrnTextoDescrip());

        fields += ", GRN_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getGrnTexComentario());

        fields += ", GRN_CVE_REVALUA";
        fieldValues += ", ?";
        values.add(this.getGrnCveRevalua());

        fields += ", GRN_CVE_PER_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrnCvePerValua());

        fields += ", GRN_CVE_ST_NOBURSA";
        fieldValues += ", ?";
        values.add(this.getGrnCveStNobursa());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM GARNBURS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GRN_NUM_CONTRATO = ?";
        values.add(this.getGrnNumContrato());
        conditions += " AND GRN_SUB_CONTRATO = ?";
        values.add(this.getGrnSubContrato());
        conditions += " AND GRN_NUM_NOBURSATIL = ?";
        values.add(this.getGrnNumNobursatil());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Garnburs instance = (Garnburs) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGrnNumContrato().equals(instance.getGrnNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getGrnSubContrato().equals(instance.getGrnSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getGrnNumNobursatil().equals(instance.getGrnNumNobursatil()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCveTipoGaran().equals(instance.getGrnCveTipoGaran()))
            equalObjects = false;
        if (equalObjects && !this.getGrnIdDocumento().equals(instance.getGrnIdDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getGrnImpDocumento().equals(instance.getGrnImpDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getGrnImpUltValua().equals(instance.getGrnImpUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrnFecUltValua().equals(instance.getGrnFecUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrnFecVencimDoc().equals(instance.getGrnFecVencimDoc()))
            equalObjects = false;
        if (equalObjects && !this.getGrnTextoDescrip().equals(instance.getGrnTextoDescrip()))
            equalObjects = false;
        if (equalObjects && !this.getGrnTexComentario().equals(instance.getGrnTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCveRevalua().equals(instance.getGrnCveRevalua()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCvePerValua().equals(instance.getGrnCvePerValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCveStNobursa().equals(instance.getGrnCveStNobursa()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Garnburs result = new Garnburs();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGrnNumContrato((BigDecimal) objectData.getData("GRN_NUM_CONTRATO"));
        result.setGrnSubContrato((BigDecimal) objectData.getData("GRN_SUB_CONTRATO"));
        result.setGrnNumNobursatil((BigDecimal) objectData.getData("GRN_NUM_NOBURSATIL"));
        result.setGrnCveTipoGaran((String) objectData.getData("GRN_CVE_TIPO_GARAN"));
        result.setGrnIdDocumento((String) objectData.getData("GRN_ID_DOCUMENTO"));
        result.setGrnImpDocumento((BigDecimal) objectData.getData("GRN_IMP_DOCUMENTO"));
        result.setGrnImpUltValua((BigDecimal) objectData.getData("GRN_IMP_ULT_VALUA"));
        result.setGrnFecUltValua((String) objectData.getData("GRN_FEC_ULT_VALUA"));
        result.setGrnFecVencimDoc((String) objectData.getData("GRN_FEC_VENCIM_DOC"));
        result.setGrnTextoDescrip((Long) objectData.getData("GRN_TEXTO_DESCRIP"));
        result.setGrnTexComentario((String) objectData.getData("GRN_TEX_COMENTARIO"));
        result.setGrnCveRevalua((BigDecimal) objectData.getData("GRN_CVE_REVALUA"));
        result.setGrnCvePerValua((String) objectData.getData("GRN_CVE_PER_VALUA"));
        result.setGrnCveStNobursa((String) objectData.getData("GRN_CVE_ST_NOBURSA"));

        return result;

    }

}
