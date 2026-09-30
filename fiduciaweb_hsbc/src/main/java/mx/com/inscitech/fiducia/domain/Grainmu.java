package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "GRAINMU_PK", columns = { "GRI_SUB_CONTRATO", "GRI_NUM_INMUEBLE", "GRI_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Grainmu extends DomainObject {

    BigDecimal griNumContrato = null;
    BigDecimal griSubContrato = null;
    BigDecimal griNumInmueble = null;
    String griCveTipoInmu = null;
    String griNumEscritura = null;
    String griNumNotario = null;
    BigDecimal griImpInmueble = null;
    BigDecimal griImpUltValua = null;
    String griFecUltValua = null;
    Long griTextoDescrip = null;
    String griTexComentario = null;
    BigDecimal griCveRevalua = null;
    String griCvePerValua = null;
    String griCveStatus = null;

    public Grainmu() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGriNumContrato(BigDecimal griNumContrato) {
        this.griNumContrato = griNumContrato;
    }

    public BigDecimal getGriNumContrato() {
        return this.griNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGriSubContrato(BigDecimal griSubContrato) {
        this.griSubContrato = griSubContrato;
    }

    public BigDecimal getGriSubContrato() {
        return this.griSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGriNumInmueble(BigDecimal griNumInmueble) {
        this.griNumInmueble = griNumInmueble;
    }

    public BigDecimal getGriNumInmueble() {
        return this.griNumInmueble;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGriCveTipoInmu(String griCveTipoInmu) {
        this.griCveTipoInmu = griCveTipoInmu;
    }

    public String getGriCveTipoInmu() {
        return this.griCveTipoInmu;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGriNumEscritura(String griNumEscritura) {
        this.griNumEscritura = griNumEscritura;
    }

    public String getGriNumEscritura() {
        return this.griNumEscritura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGriNumNotario(String griNumNotario) {
        this.griNumNotario = griNumNotario;
    }

    public String getGriNumNotario() {
        return this.griNumNotario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGriImpInmueble(BigDecimal griImpInmueble) {
        this.griImpInmueble = griImpInmueble;
    }

    public BigDecimal getGriImpInmueble() {
        return this.griImpInmueble;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGriImpUltValua(BigDecimal griImpUltValua) {
        this.griImpUltValua = griImpUltValua;
    }

    public BigDecimal getGriImpUltValua() {
        return this.griImpUltValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGriFecUltValua(String griFecUltValua) {
        this.griFecUltValua = griFecUltValua;
    }

    public String getGriFecUltValua() {
        return this.griFecUltValua;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setGriTextoDescrip(Long griTextoDescrip) {
        this.griTextoDescrip = griTextoDescrip;
    }

    public Long getGriTextoDescrip() {
        return this.griTextoDescrip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGriTexComentario(String griTexComentario) {
        this.griTexComentario = griTexComentario;
    }

    public String getGriTexComentario() {
        return this.griTexComentario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGriCveRevalua(BigDecimal griCveRevalua) {
        this.griCveRevalua = griCveRevalua;
    }

    public BigDecimal getGriCveRevalua() {
        return this.griCveRevalua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGriCvePerValua(String griCvePerValua) {
        this.griCvePerValua = griCvePerValua;
    }

    public String getGriCvePerValua() {
        return this.griCvePerValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGriCveStatus(String griCveStatus) {
        this.griCveStatus = griCveStatus;
    }

    public String getGriCveStatus() {
        return this.griCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM GRAINMU ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGriNumContrato() != null && this.getGriNumContrato().longValue() == -999) {
            conditions += " AND GRI_NUM_CONTRATO IS NULL";
        } else if (this.getGriNumContrato() != null) {
            conditions += " AND GRI_NUM_CONTRATO = ?";
            values.add(this.getGriNumContrato());
        }

        if (this.getGriSubContrato() != null && this.getGriSubContrato().longValue() == -999) {
            conditions += " AND GRI_SUB_CONTRATO IS NULL";
        } else if (this.getGriSubContrato() != null) {
            conditions += " AND GRI_SUB_CONTRATO = ?";
            values.add(this.getGriSubContrato());
        }

        if (this.getGriNumInmueble() != null && this.getGriNumInmueble().longValue() == -999) {
            conditions += " AND GRI_NUM_INMUEBLE IS NULL";
        } else if (this.getGriNumInmueble() != null) {
            conditions += " AND GRI_NUM_INMUEBLE = ?";
            values.add(this.getGriNumInmueble());
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
        String sql = "SELECT * FROM GRAINMU ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getGriNumContrato() != null && this.getGriNumContrato().longValue() == -999) {
            conditions += " AND GRI_NUM_CONTRATO IS NULL";
        } else if (this.getGriNumContrato() != null) {
            conditions += " AND GRI_NUM_CONTRATO = ?";
            values.add(this.getGriNumContrato());
        }

        if (this.getGriSubContrato() != null && this.getGriSubContrato().longValue() == -999) {
            conditions += " AND GRI_SUB_CONTRATO IS NULL";
        } else if (this.getGriSubContrato() != null) {
            conditions += " AND GRI_SUB_CONTRATO = ?";
            values.add(this.getGriSubContrato());
        }

        if (this.getGriNumInmueble() != null && this.getGriNumInmueble().longValue() == -999) {
            conditions += " AND GRI_NUM_INMUEBLE IS NULL";
        } else if (this.getGriNumInmueble() != null) {
            conditions += " AND GRI_NUM_INMUEBLE = ?";
            values.add(this.getGriNumInmueble());
        }

        if (this.getGriCveTipoInmu() != null && "null".equals(this.getGriCveTipoInmu())) {
            conditions += " AND GRI_CVE_TIPO_INMU IS NULL";
        } else if (this.getGriCveTipoInmu() != null) {
            conditions += " AND GRI_CVE_TIPO_INMU = ?";
            values.add(this.getGriCveTipoInmu());
        }

        if (this.getGriNumEscritura() != null && "null".equals(this.getGriNumEscritura())) {
            conditions += " AND GRI_NUM_ESCRITURA IS NULL";
        } else if (this.getGriNumEscritura() != null) {
            conditions += " AND GRI_NUM_ESCRITURA = ?";
            values.add(this.getGriNumEscritura());
        }

        if (this.getGriNumNotario() != null && "null".equals(this.getGriNumNotario())) {
            conditions += " AND GRI_NUM_NOTARIO IS NULL";
        } else if (this.getGriNumNotario() != null) {
            conditions += " AND GRI_NUM_NOTARIO = ?";
            values.add(this.getGriNumNotario());
        }

        if (this.getGriImpInmueble() != null && this.getGriImpInmueble().longValue() == -999) {
            conditions += " AND GRI_IMP_INMUEBLE IS NULL";
        } else if (this.getGriImpInmueble() != null) {
            conditions += " AND GRI_IMP_INMUEBLE = ?";
            values.add(this.getGriImpInmueble());
        }

        if (this.getGriImpUltValua() != null && this.getGriImpUltValua().longValue() == -999) {
            conditions += " AND GRI_IMP_ULT_VALUA IS NULL";
        } else if (this.getGriImpUltValua() != null) {
            conditions += " AND GRI_IMP_ULT_VALUA = ?";
            values.add(this.getGriImpUltValua());
        }

        if (this.getGriFecUltValua() != null && "null".equals(this.getGriFecUltValua())) {
            conditions += " AND GRI_FEC_ULT_VALUA IS NULL";
        } else if (this.getGriFecUltValua() != null) {
            conditions += " AND GRI_FEC_ULT_VALUA = ?";
            values.add(this.getGriFecUltValua());
        }

        if (this.getGriTextoDescrip() != null && this.getGriTextoDescrip() == -999) {
            conditions += " AND GRI_TEXTO_DESCRIP IS NULL";
        } else if (this.getGriTextoDescrip() != null) {
            conditions += " AND GRI_TEXTO_DESCRIP = ?";
            values.add(this.getGriTextoDescrip());
        }

        if (this.getGriTexComentario() != null && "null".equals(this.getGriTexComentario())) {
            conditions += " AND GRI_TEX_COMENTARIO IS NULL";
        } else if (this.getGriTexComentario() != null) {
            conditions += " AND GRI_TEX_COMENTARIO = ?";
            values.add(this.getGriTexComentario());
        }

        if (this.getGriCveRevalua() != null && this.getGriCveRevalua().longValue() == -999) {
            conditions += " AND GRI_CVE_REVALUA IS NULL";
        } else if (this.getGriCveRevalua() != null) {
            conditions += " AND GRI_CVE_REVALUA = ?";
            values.add(this.getGriCveRevalua());
        }

        if (this.getGriCvePerValua() != null && "null".equals(this.getGriCvePerValua())) {
            conditions += " AND GRI_CVE_PER_VALUA IS NULL";
        } else if (this.getGriCvePerValua() != null) {
            conditions += " AND GRI_CVE_PER_VALUA = ?";
            values.add(this.getGriCvePerValua());
        }

        if (this.getGriCveStatus() != null && "null".equals(this.getGriCveStatus())) {
            conditions += " AND GRI_CVE_STATUS IS NULL";
        } else if (this.getGriCveStatus() != null) {
            conditions += " AND GRI_CVE_STATUS = ?";
            values.add(this.getGriCveStatus());
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
        String sql = "UPDATE GRAINMU SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GRI_NUM_CONTRATO = ?";
        pkValues.add(this.getGriNumContrato());
        conditions += " AND GRI_SUB_CONTRATO = ?";
        pkValues.add(this.getGriSubContrato());
        conditions += " AND GRI_NUM_INMUEBLE = ?";
        pkValues.add(this.getGriNumInmueble());
        fields += " GRI_CVE_TIPO_INMU = ?, ";
        values.add(this.getGriCveTipoInmu());
        fields += " GRI_NUM_ESCRITURA = ?, ";
        values.add(this.getGriNumEscritura());
        fields += " GRI_NUM_NOTARIO = ?, ";
        values.add(this.getGriNumNotario());
        fields += " GRI_IMP_INMUEBLE = ?, ";
        values.add(this.getGriImpInmueble());
        fields += " GRI_IMP_ULT_VALUA = ?, ";
        values.add(this.getGriImpUltValua());
        fields += " GRI_FEC_ULT_VALUA = ?, ";
        values.add(this.getGriFecUltValua());
        fields += " GRI_TEXTO_DESCRIP = ?, ";
        values.add(this.getGriTextoDescrip());
        fields += " GRI_TEX_COMENTARIO = ?, ";
        values.add(this.getGriTexComentario());
        fields += " GRI_CVE_REVALUA = ?, ";
        values.add(this.getGriCveRevalua());
        fields += " GRI_CVE_PER_VALUA = ?, ";
        values.add(this.getGriCvePerValua());
        fields += " GRI_CVE_STATUS = ?, ";
        values.add(this.getGriCveStatus());
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
        String sql = "INSERT INTO GRAINMU ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GRI_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getGriNumContrato());

        fields += ", GRI_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getGriSubContrato());

        fields += ", GRI_NUM_INMUEBLE";
        fieldValues += ", ?";
        values.add(this.getGriNumInmueble());

        fields += ", GRI_CVE_TIPO_INMU";
        fieldValues += ", ?";
        values.add(this.getGriCveTipoInmu());

        fields += ", GRI_NUM_ESCRITURA";
        fieldValues += ", ?";
        values.add(this.getGriNumEscritura());

        fields += ", GRI_NUM_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getGriNumNotario());

        fields += ", GRI_IMP_INMUEBLE";
        fieldValues += ", ?";
        values.add(this.getGriImpInmueble());

        fields += ", GRI_IMP_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getGriImpUltValua());

        fields += ", GRI_FEC_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getGriFecUltValua());

        fields += ", GRI_TEXTO_DESCRIP";
        fieldValues += ", ?";
        values.add(this.getGriTextoDescrip());

        fields += ", GRI_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getGriTexComentario());

        fields += ", GRI_CVE_REVALUA";
        fieldValues += ", ?";
        values.add(this.getGriCveRevalua());

        fields += ", GRI_CVE_PER_VALUA";
        fieldValues += ", ?";
        values.add(this.getGriCvePerValua());

        fields += ", GRI_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getGriCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM GRAINMU WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GRI_NUM_CONTRATO = ?";
        values.add(this.getGriNumContrato());
        conditions += " AND GRI_SUB_CONTRATO = ?";
        values.add(this.getGriSubContrato());
        conditions += " AND GRI_NUM_INMUEBLE = ?";
        values.add(this.getGriNumInmueble());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Grainmu instance = (Grainmu) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGriNumContrato().equals(instance.getGriNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getGriSubContrato().equals(instance.getGriSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getGriNumInmueble().equals(instance.getGriNumInmueble()))
            equalObjects = false;
        if (equalObjects && !this.getGriCveTipoInmu().equals(instance.getGriCveTipoInmu()))
            equalObjects = false;
        if (equalObjects && !this.getGriNumEscritura().equals(instance.getGriNumEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getGriNumNotario().equals(instance.getGriNumNotario()))
            equalObjects = false;
        if (equalObjects && !this.getGriImpInmueble().equals(instance.getGriImpInmueble()))
            equalObjects = false;
        if (equalObjects && !this.getGriImpUltValua().equals(instance.getGriImpUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getGriFecUltValua().equals(instance.getGriFecUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getGriTextoDescrip().equals(instance.getGriTextoDescrip()))
            equalObjects = false;
        if (equalObjects && !this.getGriTexComentario().equals(instance.getGriTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getGriCveRevalua().equals(instance.getGriCveRevalua()))
            equalObjects = false;
        if (equalObjects && !this.getGriCvePerValua().equals(instance.getGriCvePerValua()))
            equalObjects = false;
        if (equalObjects && !this.getGriCveStatus().equals(instance.getGriCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Grainmu result = new Grainmu();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGriNumContrato((BigDecimal) objectData.getData("GRI_NUM_CONTRATO"));
        result.setGriSubContrato((BigDecimal) objectData.getData("GRI_SUB_CONTRATO"));
        result.setGriNumInmueble((BigDecimal) objectData.getData("GRI_NUM_INMUEBLE"));
        result.setGriCveTipoInmu((String) objectData.getData("GRI_CVE_TIPO_INMU"));
        result.setGriNumEscritura((String) objectData.getData("GRI_NUM_ESCRITURA"));
        result.setGriNumNotario((String) objectData.getData("GRI_NUM_NOTARIO"));
        result.setGriImpInmueble((BigDecimal) objectData.getData("GRI_IMP_INMUEBLE"));
        result.setGriImpUltValua((BigDecimal) objectData.getData("GRI_IMP_ULT_VALUA"));
        result.setGriFecUltValua((String) objectData.getData("GRI_FEC_ULT_VALUA"));
        result.setGriTextoDescrip((Long) objectData.getData("GRI_TEXTO_DESCRIP"));
        result.setGriTexComentario((String) objectData.getData("GRI_TEX_COMENTARIO"));
        result.setGriCveRevalua((BigDecimal) objectData.getData("GRI_CVE_REVALUA"));
        result.setGriCvePerValua((String) objectData.getData("GRI_CVE_PER_VALUA"));
        result.setGriCveStatus((String) objectData.getData("GRI_CVE_STATUS"));

        return result;

    }

}
