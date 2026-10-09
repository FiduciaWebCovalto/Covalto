package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "GARVALOR_PK", columns = { "GRV_NUM_CONTRATO", "GRV_SUB_CONTRATO", "GRV_NUM_VALORES" }, sequences = { "MANUAL" })
public class Garvalor extends DomainObject {

    BigDecimal grvNumContrato = null;
    BigDecimal grvSubContrato = null;
    BigDecimal grvNumValores = null;
    String grvCveTipoGaran = null;
    String grvIdDocumento = null;
    BigDecimal grvImpLibros = null;
    BigDecimal grvImpMercado = null;
    String grvFecUltValua = null;
    String grvFecVencimDoc = null;
    Long grvTextoDescrip = null;
    String grvTexComentario = null;
    BigDecimal grvCveRevalua = null;
    String grvCvePerValua = null;
    String grvCveStValor = null;

    public Garvalor() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrvNumContrato(BigDecimal grvNumContrato) {
        this.grvNumContrato = grvNumContrato;
    }

    public BigDecimal getGrvNumContrato() {
        return this.grvNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrvSubContrato(BigDecimal grvSubContrato) {
        this.grvSubContrato = grvSubContrato;
    }

    public BigDecimal getGrvSubContrato() {
        return this.grvSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrvNumValores(BigDecimal grvNumValores) {
        this.grvNumValores = grvNumValores;
    }

    public BigDecimal getGrvNumValores() {
        return this.grvNumValores;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrvCveTipoGaran(String grvCveTipoGaran) {
        this.grvCveTipoGaran = grvCveTipoGaran;
    }

    public String getGrvCveTipoGaran() {
        return this.grvCveTipoGaran;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrvIdDocumento(String grvIdDocumento) {
        this.grvIdDocumento = grvIdDocumento;
    }

    public String getGrvIdDocumento() {
        return this.grvIdDocumento;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGrvImpLibros(BigDecimal grvImpLibros) {
        this.grvImpLibros = grvImpLibros;
    }

    public BigDecimal getGrvImpLibros() {
        return this.grvImpLibros;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGrvImpMercado(BigDecimal grvImpMercado) {
        this.grvImpMercado = grvImpMercado;
    }

    public BigDecimal getGrvImpMercado() {
        return this.grvImpMercado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrvFecUltValua(String grvFecUltValua) {
        this.grvFecUltValua = grvFecUltValua;
    }

    public String getGrvFecUltValua() {
        return this.grvFecUltValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrvFecVencimDoc(String grvFecVencimDoc) {
        this.grvFecVencimDoc = grvFecVencimDoc;
    }

    public String getGrvFecVencimDoc() {
        return this.grvFecVencimDoc;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setGrvTextoDescrip(Long grvTextoDescrip) {
        this.grvTextoDescrip = grvTextoDescrip;
    }

    public Long getGrvTextoDescrip() {
        return this.grvTextoDescrip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrvTexComentario(String grvTexComentario) {
        this.grvTexComentario = grvTexComentario;
    }

    public String getGrvTexComentario() {
        return this.grvTexComentario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGrvCveRevalua(BigDecimal grvCveRevalua) {
        this.grvCveRevalua = grvCveRevalua;
    }

    public BigDecimal getGrvCveRevalua() {
        return this.grvCveRevalua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrvCvePerValua(String grvCvePerValua) {
        this.grvCvePerValua = grvCvePerValua;
    }

    public String getGrvCvePerValua() {
        return this.grvCvePerValua;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrvCveStValor(String grvCveStValor) {
        this.grvCveStValor = grvCveStValor;
    }

    public String getGrvCveStValor() {
        return this.grvCveStValor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM GARVALOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGrvNumContrato() != null && this.getGrvNumContrato().longValue() == -999) {
            conditions += " AND GRV_NUM_CONTRATO IS NULL";
        } else if (this.getGrvNumContrato() != null) {
            conditions += " AND GRV_NUM_CONTRATO = ?";
            values.add(this.getGrvNumContrato());
        }

        if (this.getGrvSubContrato() != null && this.getGrvSubContrato().longValue() == -999) {
            conditions += " AND GRV_SUB_CONTRATO IS NULL";
        } else if (this.getGrvSubContrato() != null) {
            conditions += " AND GRV_SUB_CONTRATO = ?";
            values.add(this.getGrvSubContrato());
        }

        if (this.getGrvNumValores() != null && this.getGrvNumValores().longValue() == -999) {
            conditions += " AND GRV_NUM_VALORES IS NULL";
        } else if (this.getGrvNumValores() != null) {
            conditions += " AND GRV_NUM_VALORES = ?";
            values.add(this.getGrvNumValores());
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
        String sql = "SELECT * FROM GARVALOR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGrvNumContrato() != null && this.getGrvNumContrato().longValue() == -999) {
            conditions += " AND GRV_NUM_CONTRATO IS NULL";
        } else if (this.getGrvNumContrato() != null) {
            conditions += " AND GRV_NUM_CONTRATO = ?";
            values.add(this.getGrvNumContrato());
        }

        if (this.getGrvSubContrato() != null && this.getGrvSubContrato().longValue() == -999) {
            conditions += " AND GRV_SUB_CONTRATO IS NULL";
        } else if (this.getGrvSubContrato() != null) {
            conditions += " AND GRV_SUB_CONTRATO = ?";
            values.add(this.getGrvSubContrato());
        }

        if (this.getGrvNumValores() != null && this.getGrvNumValores().longValue() == -999) {
            conditions += " AND GRV_NUM_VALORES IS NULL";
        } else if (this.getGrvNumValores() != null) {
            conditions += " AND GRV_NUM_VALORES = ?";
            values.add(this.getGrvNumValores());
        }

        if (this.getGrvCveTipoGaran() != null && "null".equals(this.getGrvCveTipoGaran())) {
            conditions += " AND GRV_CVE_TIPO_GARAN IS NULL";
        } else if (this.getGrvCveTipoGaran() != null) {
            conditions += " AND GRV_CVE_TIPO_GARAN = ?";
            values.add(this.getGrvCveTipoGaran());
        }

        if (this.getGrvIdDocumento() != null && "null".equals(this.getGrvIdDocumento())) {
            conditions += " AND GRV_ID_DOCUMENTO IS NULL";
        } else if (this.getGrvIdDocumento() != null) {
            conditions += " AND GRV_ID_DOCUMENTO = ?";
            values.add(this.getGrvIdDocumento());
        }

        if (this.getGrvImpLibros() != null && this.getGrvImpLibros().longValue() == -999) {
            conditions += " AND GRV_IMP_LIBROS IS NULL";
        } else if (this.getGrvImpLibros() != null) {
            conditions += " AND GRV_IMP_LIBROS = ?";
            values.add(this.getGrvImpLibros());
        }

        if (this.getGrvImpMercado() != null && this.getGrvImpMercado().longValue() == -999) {
            conditions += " AND GRV_IMP_MERCADO IS NULL";
        } else if (this.getGrvImpMercado() != null) {
            conditions += " AND GRV_IMP_MERCADO = ?";
            values.add(this.getGrvImpMercado());
        }

        if (this.getGrvFecUltValua() != null && "null".equals(this.getGrvFecUltValua())) {
            conditions += " AND GRV_FEC_ULT_VALUA IS NULL";
        } else if (this.getGrvFecUltValua() != null) {
            conditions += " AND GRV_FEC_ULT_VALUA = ?";
            values.add(this.getGrvFecUltValua());
        }

        if (this.getGrvFecVencimDoc() != null && "null".equals(this.getGrvFecVencimDoc())) {
            conditions += " AND GRV_FEC_VENCIM_DOC IS NULL";
        } else if (this.getGrvFecVencimDoc() != null) {
            conditions += " AND GRV_FEC_VENCIM_DOC = ?";
            values.add(this.getGrvFecVencimDoc());
        }

        if (this.getGrvTextoDescrip() != null && this.getGrvTextoDescrip() == -999) {
            conditions += " AND GRV_TEXTO_DESCRIP IS NULL";
        } else if (this.getGrvTextoDescrip() != null) {
            conditions += " AND GRV_TEXTO_DESCRIP = ?";
            values.add(this.getGrvTextoDescrip());
        }

        if (this.getGrvTexComentario() != null && "null".equals(this.getGrvTexComentario())) {
            conditions += " AND GRV_TEX_COMENTARIO IS NULL";
        } else if (this.getGrvTexComentario() != null) {
            conditions += " AND GRV_TEX_COMENTARIO = ?";
            values.add(this.getGrvTexComentario());
        }

        if (this.getGrvCveRevalua() != null && this.getGrvCveRevalua().longValue() == -999) {
            conditions += " AND GRV_CVE_REVALUA IS NULL";
        } else if (this.getGrvCveRevalua() != null) {
            conditions += " AND GRV_CVE_REVALUA = ?";
            values.add(this.getGrvCveRevalua());
        }

        if (this.getGrvCvePerValua() != null && "null".equals(this.getGrvCvePerValua())) {
            conditions += " AND GRV_CVE_PER_VALUA IS NULL";
        } else if (this.getGrvCvePerValua() != null) {
            conditions += " AND GRV_CVE_PER_VALUA = ?";
            values.add(this.getGrvCvePerValua());
        }

        if (this.getGrvCveStValor() != null && "null".equals(this.getGrvCveStValor())) {
            conditions += " AND GRV_CVE_ST_VALOR IS NULL";
        } else if (this.getGrvCveStValor() != null) {
            conditions += " AND GRV_CVE_ST_VALOR = ?";
            values.add(this.getGrvCveStValor());
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
        String sql = "UPDATE GARVALOR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GRV_NUM_CONTRATO = ?";
        pkValues.add(this.getGrvNumContrato());
        conditions += " AND GRV_SUB_CONTRATO = ?";
        pkValues.add(this.getGrvSubContrato());
        conditions += " AND GRV_NUM_VALORES = ?";
        pkValues.add(this.getGrvNumValores());
        fields += " GRV_CVE_TIPO_GARAN = ?, ";
        values.add(this.getGrvCveTipoGaran());
        fields += " GRV_ID_DOCUMENTO = ?, ";
        values.add(this.getGrvIdDocumento());
        fields += " GRV_IMP_LIBROS = ?, ";
        values.add(this.getGrvImpLibros());
        fields += " GRV_IMP_MERCADO = ?, ";
        values.add(this.getGrvImpMercado());
        fields += " GRV_FEC_ULT_VALUA = ?, ";
        values.add(this.getGrvFecUltValua());
        fields += " GRV_FEC_VENCIM_DOC = ?, ";
        values.add(this.getGrvFecVencimDoc());
        fields += " GRV_TEXTO_DESCRIP = ?, ";
        values.add(this.getGrvTextoDescrip());
        fields += " GRV_TEX_COMENTARIO = ?, ";
        values.add(this.getGrvTexComentario());
        fields += " GRV_CVE_REVALUA = ?, ";
        values.add(this.getGrvCveRevalua());
        fields += " GRV_CVE_PER_VALUA = ?, ";
        values.add(this.getGrvCvePerValua());
        fields += " GRV_CVE_ST_VALOR = ?, ";
        values.add(this.getGrvCveStValor());
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
        String sql = "INSERT INTO GARVALOR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GRV_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getGrvNumContrato());

        fields += ", GRV_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getGrvSubContrato());

        fields += ", GRV_NUM_VALORES";
        fieldValues += ", ?";
        values.add(this.getGrvNumValores());

        fields += ", GRV_CVE_TIPO_GARAN";
        fieldValues += ", ?";
        values.add(this.getGrvCveTipoGaran());

        fields += ", GRV_ID_DOCUMENTO";
        fieldValues += ", ?";
        values.add(this.getGrvIdDocumento());

        fields += ", GRV_IMP_LIBROS";
        fieldValues += ", ?";
        values.add(this.getGrvImpLibros());

        fields += ", GRV_IMP_MERCADO";
        fieldValues += ", ?";
        values.add(this.getGrvImpMercado());

        fields += ", GRV_FEC_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrvFecUltValua());

        fields += ", GRV_FEC_VENCIM_DOC";
        fieldValues += ", ?";
        values.add(this.getGrvFecVencimDoc());

        fields += ", GRV_TEXTO_DESCRIP";
        fieldValues += ", ?";
        values.add(this.getGrvTextoDescrip());

        fields += ", GRV_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getGrvTexComentario());

        fields += ", GRV_CVE_REVALUA";
        fieldValues += ", ?";
        values.add(this.getGrvCveRevalua());

        fields += ", GRV_CVE_PER_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrvCvePerValua());

        fields += ", GRV_CVE_ST_VALOR";
        fieldValues += ", ?";
        values.add(this.getGrvCveStValor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM GARVALOR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GRV_NUM_CONTRATO = ?";
        values.add(this.getGrvNumContrato());
        conditions += " AND GRV_SUB_CONTRATO = ?";
        values.add(this.getGrvSubContrato());
        conditions += " AND GRV_NUM_VALORES = ?";
        values.add(this.getGrvNumValores());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Garvalor instance = (Garvalor) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGrvNumContrato().equals(instance.getGrvNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getGrvSubContrato().equals(instance.getGrvSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getGrvNumValores().equals(instance.getGrvNumValores()))
            equalObjects = false;
        if (equalObjects && !this.getGrvCveTipoGaran().equals(instance.getGrvCveTipoGaran()))
            equalObjects = false;
        if (equalObjects && !this.getGrvIdDocumento().equals(instance.getGrvIdDocumento()))
            equalObjects = false;
        if (equalObjects && !this.getGrvImpLibros().equals(instance.getGrvImpLibros()))
            equalObjects = false;
        if (equalObjects && !this.getGrvImpMercado().equals(instance.getGrvImpMercado()))
            equalObjects = false;
        if (equalObjects && !this.getGrvFecUltValua().equals(instance.getGrvFecUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrvFecVencimDoc().equals(instance.getGrvFecVencimDoc()))
            equalObjects = false;
        if (equalObjects && !this.getGrvTextoDescrip().equals(instance.getGrvTextoDescrip()))
            equalObjects = false;
        if (equalObjects && !this.getGrvTexComentario().equals(instance.getGrvTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getGrvCveRevalua().equals(instance.getGrvCveRevalua()))
            equalObjects = false;
        if (equalObjects && !this.getGrvCvePerValua().equals(instance.getGrvCvePerValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrvCveStValor().equals(instance.getGrvCveStValor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Garvalor result = new Garvalor();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGrvNumContrato((BigDecimal) objectData.getData("GRV_NUM_CONTRATO"));
        result.setGrvSubContrato((BigDecimal) objectData.getData("GRV_SUB_CONTRATO"));
        result.setGrvNumValores((BigDecimal) objectData.getData("GRV_NUM_VALORES"));
        result.setGrvCveTipoGaran((String) objectData.getData("GRV_CVE_TIPO_GARAN"));
        result.setGrvIdDocumento((String) objectData.getData("GRV_ID_DOCUMENTO"));
        result.setGrvImpLibros((BigDecimal) objectData.getData("GRV_IMP_LIBROS"));
        result.setGrvImpMercado((BigDecimal) objectData.getData("GRV_IMP_MERCADO"));
        result.setGrvFecUltValua((String) objectData.getData("GRV_FEC_ULT_VALUA"));
        result.setGrvFecVencimDoc((String) objectData.getData("GRV_FEC_VENCIM_DOC"));
        result.setGrvTextoDescrip((Long) objectData.getData("GRV_TEXTO_DESCRIP"));
        result.setGrvTexComentario((String) objectData.getData("GRV_TEX_COMENTARIO"));
        result.setGrvCveRevalua((BigDecimal) objectData.getData("GRV_CVE_REVALUA"));
        result.setGrvCvePerValua((String) objectData.getData("GRV_CVE_PER_VALUA"));
        result.setGrvCveStValor((String) objectData.getData("GRV_CVE_ST_VALOR"));

        return result;

    }

}
