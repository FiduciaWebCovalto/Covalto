package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "GARMUEBL_PK", columns = { "GRM_SUB_CONTRATO", "GRM_NUM_BIE_MUEBLE", "GRM_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Garmuebl extends DomainObject {

    BigDecimal grmNumContrato = null;
    BigDecimal grmSubContrato = null;
    BigDecimal grmNumBieMueble = null;
    String grmCveTipoMueb = null;
    String grmIdMueble = null;
    BigDecimal grmImpValor = null;
    BigDecimal grmImpUltValua = null;
    String grmFecUltValua = null;
    Long grmTextoDescrip = null;
    String grmTexComentario = null;
    BigDecimal grmCveRevalua = null;
    String grmCvePerValua = null;
    String grmCveStMueble = null;

    public Garmuebl() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrmNumContrato(BigDecimal grmNumContrato) {
        this.grmNumContrato = grmNumContrato;
    }

    public BigDecimal getGrmNumContrato() {
        return this.grmNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrmSubContrato(BigDecimal grmSubContrato) {
        this.grmSubContrato = grmSubContrato;
    }

    public BigDecimal getGrmSubContrato() {
        return this.grmSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrmNumBieMueble(BigDecimal grmNumBieMueble) {
        this.grmNumBieMueble = grmNumBieMueble;
    }

    public BigDecimal getGrmNumBieMueble() {
        return this.grmNumBieMueble;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrmCveTipoMueb(String grmCveTipoMueb) {
        this.grmCveTipoMueb = grmCveTipoMueb;
    }

    public String getGrmCveTipoMueb() {
        return this.grmCveTipoMueb;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrmIdMueble(String grmIdMueble) {
        this.grmIdMueble = grmIdMueble;
    }

    public String getGrmIdMueble() {
        return this.grmIdMueble;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGrmImpValor(BigDecimal grmImpValor) {
        this.grmImpValor = grmImpValor;
    }

    public BigDecimal getGrmImpValor() {
        return this.grmImpValor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGrmImpUltValua(BigDecimal grmImpUltValua) {
        this.grmImpUltValua = grmImpUltValua;
    }

    public BigDecimal getGrmImpUltValua() {
        return this.grmImpUltValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrmFecUltValua(String grmFecUltValua) {
        this.grmFecUltValua = grmFecUltValua;
    }

    public String getGrmFecUltValua() {
        return this.grmFecUltValua;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setGrmTextoDescrip(Long grmTextoDescrip) {
        this.grmTextoDescrip = grmTextoDescrip;
    }

    public Long getGrmTextoDescrip() {
        return this.grmTextoDescrip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrmTexComentario(String grmTexComentario) {
        this.grmTexComentario = grmTexComentario;
    }

    public String getGrmTexComentario() {
        return this.grmTexComentario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGrmCveRevalua(BigDecimal grmCveRevalua) {
        this.grmCveRevalua = grmCveRevalua;
    }

    public BigDecimal getGrmCveRevalua() {
        return this.grmCveRevalua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrmCvePerValua(String grmCvePerValua) {
        this.grmCvePerValua = grmCvePerValua;
    }

    public String getGrmCvePerValua() {
        return this.grmCvePerValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrmCveStMueble(String grmCveStMueble) {
        this.grmCveStMueble = grmCveStMueble;
    }

    public String getGrmCveStMueble() {
        return this.grmCveStMueble;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM GARMUEBL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGrmNumContrato() != null && this.getGrmNumContrato().longValue() == -999) {
            conditions += " AND GRM_NUM_CONTRATO IS NULL";
        } else if (this.getGrmNumContrato() != null) {
            conditions += " AND GRM_NUM_CONTRATO = ?";
            values.add(this.getGrmNumContrato());
        }

        if (this.getGrmSubContrato() != null && this.getGrmSubContrato().longValue() == -999) {
            conditions += " AND GRM_SUB_CONTRATO IS NULL";
        } else if (this.getGrmSubContrato() != null) {
            conditions += " AND GRM_SUB_CONTRATO = ?";
            values.add(this.getGrmSubContrato());
        }

        if (this.getGrmNumBieMueble() != null && this.getGrmNumBieMueble().longValue() == -999) {
            conditions += " AND GRM_NUM_BIE_MUEBLE IS NULL";
        } else if (this.getGrmNumBieMueble() != null) {
            conditions += " AND GRM_NUM_BIE_MUEBLE = ?";
            values.add(this.getGrmNumBieMueble());
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
        String sql = "SELECT * FROM GARMUEBL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGrmNumContrato() != null && this.getGrmNumContrato().longValue() == -999) {
            conditions += " AND GRM_NUM_CONTRATO IS NULL";
        } else if (this.getGrmNumContrato() != null) {
            conditions += " AND GRM_NUM_CONTRATO = ?";
            values.add(this.getGrmNumContrato());
        }

        if (this.getGrmSubContrato() != null && this.getGrmSubContrato().longValue() == -999) {
            conditions += " AND GRM_SUB_CONTRATO IS NULL";
        } else if (this.getGrmSubContrato() != null) {
            conditions += " AND GRM_SUB_CONTRATO = ?";
            values.add(this.getGrmSubContrato());
        }

        if (this.getGrmNumBieMueble() != null && this.getGrmNumBieMueble().longValue() == -999) {
            conditions += " AND GRM_NUM_BIE_MUEBLE IS NULL";
        } else if (this.getGrmNumBieMueble() != null) {
            conditions += " AND GRM_NUM_BIE_MUEBLE = ?";
            values.add(this.getGrmNumBieMueble());
        }

        if (this.getGrmCveTipoMueb() != null && "null".equals(this.getGrmCveTipoMueb())) {
            conditions += " AND GRM_CVE_TIPO_MUEB IS NULL";
        } else if (this.getGrmCveTipoMueb() != null) {
            conditions += " AND GRM_CVE_TIPO_MUEB = ?";
            values.add(this.getGrmCveTipoMueb());
        }

        if (this.getGrmIdMueble() != null && "null".equals(this.getGrmIdMueble())) {
            conditions += " AND GRM_ID_MUEBLE IS NULL";
        } else if (this.getGrmIdMueble() != null) {
            conditions += " AND GRM_ID_MUEBLE = ?";
            values.add(this.getGrmIdMueble());
        }

        if (this.getGrmImpValor() != null && this.getGrmImpValor().longValue() == -999) {
            conditions += " AND GRM_IMP_VALOR IS NULL";
        } else if (this.getGrmImpValor() != null) {
            conditions += " AND GRM_IMP_VALOR = ?";
            values.add(this.getGrmImpValor());
        }

        if (this.getGrmImpUltValua() != null && this.getGrmImpUltValua().longValue() == -999) {
            conditions += " AND GRM_IMP_ULT_VALUA IS NULL";
        } else if (this.getGrmImpUltValua() != null) {
            conditions += " AND GRM_IMP_ULT_VALUA = ?";
            values.add(this.getGrmImpUltValua());
        }

        if (this.getGrmFecUltValua() != null && "null".equals(this.getGrmFecUltValua())) {
            conditions += " AND GRM_FEC_ULT_VALUA IS NULL";
        } else if (this.getGrmFecUltValua() != null) {
            conditions += " AND GRM_FEC_ULT_VALUA = ?";
            values.add(this.getGrmFecUltValua());
        }

        if (this.getGrmTextoDescrip() != null && this.getGrmTextoDescrip() == -999) {
            conditions += " AND GRM_TEXTO_DESCRIP IS NULL";
        } else if (this.getGrmTextoDescrip() != null) {
            conditions += " AND GRM_TEXTO_DESCRIP = ?";
            values.add(this.getGrmTextoDescrip());
        }

        if (this.getGrmTexComentario() != null && "null".equals(this.getGrmTexComentario())) {
            conditions += " AND GRM_TEX_COMENTARIO IS NULL";
        } else if (this.getGrmTexComentario() != null) {
            conditions += " AND GRM_TEX_COMENTARIO = ?";
            values.add(this.getGrmTexComentario());
        }

        if (this.getGrmCveRevalua() != null && this.getGrmCveRevalua().longValue() == -999) {
            conditions += " AND GRM_CVE_REVALUA IS NULL";
        } else if (this.getGrmCveRevalua() != null) {
            conditions += " AND GRM_CVE_REVALUA = ?";
            values.add(this.getGrmCveRevalua());
        }

        if (this.getGrmCvePerValua() != null && "null".equals(this.getGrmCvePerValua())) {
            conditions += " AND GRM_CVE_PER_VALUA IS NULL";
        } else if (this.getGrmCvePerValua() != null) {
            conditions += " AND GRM_CVE_PER_VALUA = ?";
            values.add(this.getGrmCvePerValua());
        }

        if (this.getGrmCveStMueble() != null && "null".equals(this.getGrmCveStMueble())) {
            conditions += " AND GRM_CVE_ST_MUEBLE IS NULL";
        } else if (this.getGrmCveStMueble() != null) {
            conditions += " AND GRM_CVE_ST_MUEBLE = ?";
            values.add(this.getGrmCveStMueble());
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
        String sql = "UPDATE GARMUEBL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GRM_NUM_CONTRATO = ?";
        pkValues.add(this.getGrmNumContrato());
        conditions += " AND GRM_SUB_CONTRATO = ?";
        pkValues.add(this.getGrmSubContrato());
        conditions += " AND GRM_NUM_BIE_MUEBLE = ?";
        pkValues.add(this.getGrmNumBieMueble());
        fields += " GRM_CVE_TIPO_MUEB = ?, ";
        values.add(this.getGrmCveTipoMueb());
        fields += " GRM_ID_MUEBLE = ?, ";
        values.add(this.getGrmIdMueble());
        fields += " GRM_IMP_VALOR = ?, ";
        values.add(this.getGrmImpValor());
        fields += " GRM_IMP_ULT_VALUA = ?, ";
        values.add(this.getGrmImpUltValua());
        fields += " GRM_FEC_ULT_VALUA = ?, ";
        values.add(this.getGrmFecUltValua());
        fields += " GRM_TEXTO_DESCRIP = ?, ";
        values.add(this.getGrmTextoDescrip());
        fields += " GRM_TEX_COMENTARIO = ?, ";
        values.add(this.getGrmTexComentario());
        fields += " GRM_CVE_REVALUA = ?, ";
        values.add(this.getGrmCveRevalua());
        fields += " GRM_CVE_PER_VALUA = ?, ";
        values.add(this.getGrmCvePerValua());
        fields += " GRM_CVE_ST_MUEBLE = ?, ";
        values.add(this.getGrmCveStMueble());
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
        String sql = "INSERT INTO GARMUEBL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GRM_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getGrmNumContrato());

        fields += ", GRM_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getGrmSubContrato());

        fields += ", GRM_NUM_BIE_MUEBLE";
        fieldValues += ", ?";
        values.add(this.getGrmNumBieMueble());

        fields += ", GRM_CVE_TIPO_MUEB";
        fieldValues += ", ?";
        values.add(this.getGrmCveTipoMueb());

        fields += ", GRM_ID_MUEBLE";
        fieldValues += ", ?";
        values.add(this.getGrmIdMueble());

        fields += ", GRM_IMP_VALOR";
        fieldValues += ", ?";
        values.add(this.getGrmImpValor());

        fields += ", GRM_IMP_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrmImpUltValua());

        fields += ", GRM_FEC_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrmFecUltValua());

        fields += ", GRM_TEXTO_DESCRIP";
        fieldValues += ", ?";
        values.add(this.getGrmTextoDescrip());

        fields += ", GRM_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getGrmTexComentario());

        fields += ", GRM_CVE_REVALUA";
        fieldValues += ", ?";
        values.add(this.getGrmCveRevalua());

        fields += ", GRM_CVE_PER_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrmCvePerValua());

        fields += ", GRM_CVE_ST_MUEBLE";
        fieldValues += ", ?";
        values.add(this.getGrmCveStMueble());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM GARMUEBL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GRM_NUM_CONTRATO = ?";
        values.add(this.getGrmNumContrato());
        conditions += " AND GRM_SUB_CONTRATO = ?";
        values.add(this.getGrmSubContrato());
        conditions += " AND GRM_NUM_BIE_MUEBLE = ?";
        values.add(this.getGrmNumBieMueble());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Garmuebl instance = (Garmuebl) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGrmNumContrato().equals(instance.getGrmNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getGrmSubContrato().equals(instance.getGrmSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getGrmNumBieMueble().equals(instance.getGrmNumBieMueble()))
            equalObjects = false;
        if (equalObjects && !this.getGrmCveTipoMueb().equals(instance.getGrmCveTipoMueb()))
            equalObjects = false;
        if (equalObjects && !this.getGrmIdMueble().equals(instance.getGrmIdMueble()))
            equalObjects = false;
        if (equalObjects && !this.getGrmImpValor().equals(instance.getGrmImpValor()))
            equalObjects = false;
        if (equalObjects && !this.getGrmImpUltValua().equals(instance.getGrmImpUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrmFecUltValua().equals(instance.getGrmFecUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrmTextoDescrip().equals(instance.getGrmTextoDescrip()))
            equalObjects = false;
        if (equalObjects && !this.getGrmTexComentario().equals(instance.getGrmTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getGrmCveRevalua().equals(instance.getGrmCveRevalua()))
            equalObjects = false;
        if (equalObjects && !this.getGrmCvePerValua().equals(instance.getGrmCvePerValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrmCveStMueble().equals(instance.getGrmCveStMueble()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Garmuebl result = new Garmuebl();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGrmNumContrato((BigDecimal) objectData.getData("GRM_NUM_CONTRATO"));
        result.setGrmSubContrato((BigDecimal) objectData.getData("GRM_SUB_CONTRATO"));
        result.setGrmNumBieMueble((BigDecimal) objectData.getData("GRM_NUM_BIE_MUEBLE"));
        result.setGrmCveTipoMueb((String) objectData.getData("GRM_CVE_TIPO_MUEB"));
        result.setGrmIdMueble((String) objectData.getData("GRM_ID_MUEBLE"));
        result.setGrmImpValor((BigDecimal) objectData.getData("GRM_IMP_VALOR"));
        result.setGrmImpUltValua((BigDecimal) objectData.getData("GRM_IMP_ULT_VALUA"));
        result.setGrmFecUltValua((String) objectData.getData("GRM_FEC_ULT_VALUA"));
        result.setGrmTextoDescrip((Long) objectData.getData("GRM_TEXTO_DESCRIP"));
        result.setGrmTexComentario((String) objectData.getData("GRM_TEX_COMENTARIO"));
        result.setGrmCveRevalua((BigDecimal) objectData.getData("GRM_CVE_REVALUA"));
        result.setGrmCvePerValua((String) objectData.getData("GRM_CVE_PER_VALUA"));
        result.setGrmCveStMueble((String) objectData.getData("GRM_CVE_ST_MUEBLE"));

        return result;

    }

}
