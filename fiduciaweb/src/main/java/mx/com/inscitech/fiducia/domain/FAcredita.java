package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_ACREDITA_PK", columns = { "ACR_ID_INTERMEDIARIO" }, sequences = { "MAX" })
public class FAcredita extends DomainObject {

    BigDecimal acrIdIntermediario = null;
    BigDecimal acrRiesg0 = null;
    String acrDoctoRiesgo = null;
    String acrFecAceptacion = null;
    String acrUltMovto = null;
    BigDecimal acrNumCreaciones = null;
    BigDecimal acrNumRedenciones = null;
    BigDecimal acrNumAcreditados = null;
    String acrCtaIndevalInt = null;
    String acrCtaIndevalInt1 = null;
    String acrStatus = null;
    String acrComentario = null;

    public FAcredita() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcrIdIntermediario(BigDecimal acrIdIntermediario) {
        this.acrIdIntermediario = acrIdIntermediario;
    }

    public BigDecimal getAcrIdIntermediario() {
        return this.acrIdIntermediario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcrRiesg0(BigDecimal acrRiesg0) {
        this.acrRiesg0 = acrRiesg0;
    }

    public BigDecimal getAcrRiesg0() {
        return this.acrRiesg0;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcrDoctoRiesgo(String acrDoctoRiesgo) {
        this.acrDoctoRiesgo = acrDoctoRiesgo;
    }

    public String getAcrDoctoRiesgo() {
        return this.acrDoctoRiesgo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setAcrFecAceptacion(String acrFecAceptacion) {
        this.acrFecAceptacion = acrFecAceptacion;
    }

    public String getAcrFecAceptacion() {
        return this.acrFecAceptacion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setAcrUltMovto(String acrUltMovto) {
        this.acrUltMovto = acrUltMovto;
    }

    public String getAcrUltMovto() {
        return this.acrUltMovto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcrNumCreaciones(BigDecimal acrNumCreaciones) {
        this.acrNumCreaciones = acrNumCreaciones;
    }

    public BigDecimal getAcrNumCreaciones() {
        return this.acrNumCreaciones;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcrNumRedenciones(BigDecimal acrNumRedenciones) {
        this.acrNumRedenciones = acrNumRedenciones;
    }

    public BigDecimal getAcrNumRedenciones() {
        return this.acrNumRedenciones;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAcrNumAcreditados(BigDecimal acrNumAcreditados) {
        this.acrNumAcreditados = acrNumAcreditados;
    }

    public BigDecimal getAcrNumAcreditados() {
        return this.acrNumAcreditados;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcrCtaIndevalInt(String acrCtaIndevalInt) {
        this.acrCtaIndevalInt = acrCtaIndevalInt;
    }

    public String getAcrCtaIndevalInt() {
        return this.acrCtaIndevalInt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcrCtaIndevalInt1(String acrCtaIndevalInt1) {
        this.acrCtaIndevalInt1 = acrCtaIndevalInt1;
    }

    public String getAcrCtaIndevalInt1() {
        return this.acrCtaIndevalInt1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcrStatus(String acrStatus) {
        this.acrStatus = acrStatus;
    }

    public String getAcrStatus() {
        return this.acrStatus;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setAcrComentario(String acrComentario) {
        this.acrComentario = acrComentario;
    }

    public String getAcrComentario() {
        return this.acrComentario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_ACREDITA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAcrIdIntermediario() != null && this.getAcrIdIntermediario().longValue() == -999) {
            conditions += " AND ACR_ID_INTERMEDIARIO IS NULL";
        } else if (this.getAcrIdIntermediario() != null) {
            conditions += " AND ACR_ID_INTERMEDIARIO = ?";
            values.add(this.getAcrIdIntermediario());
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
        String sql = "SELECT * FROM F_ACREDITA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getAcrIdIntermediario() != null && this.getAcrIdIntermediario().longValue() == -999) {
            conditions += " AND ACR_ID_INTERMEDIARIO IS NULL";
        } else if (this.getAcrIdIntermediario() != null) {
            conditions += " AND ACR_ID_INTERMEDIARIO = ?";
            values.add(this.getAcrIdIntermediario());
        }

        if (this.getAcrRiesg0() != null && this.getAcrRiesg0().longValue() == -999) {
            conditions += " AND ACR_RIESG0 IS NULL";
        } else if (this.getAcrRiesg0() != null) {
            conditions += " AND ACR_RIESG0 = ?";
            values.add(this.getAcrRiesg0());
        }

        if (this.getAcrDoctoRiesgo() != null && "null".equals(this.getAcrDoctoRiesgo())) {
            conditions += " AND ACR_DOCTO_RIESGO IS NULL";
        } else if (this.getAcrDoctoRiesgo() != null) {
            conditions += " AND ACR_DOCTO_RIESGO = ?";
            values.add(this.getAcrDoctoRiesgo());
        }

        if (this.getAcrFecAceptacion() != null && "null".equals(this.getAcrFecAceptacion())) {
            conditions += " AND ACR_FEC_ACEPTACION IS NULL";
        } else if (this.getAcrFecAceptacion() != null) {
            conditions += " AND ACR_FEC_ACEPTACION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getAcrFecAceptacion());
        }

        if (this.getAcrUltMovto() != null && "null".equals(this.getAcrUltMovto())) {
            conditions += " AND ACR_ULT_MOVTO IS NULL";
        } else if (this.getAcrUltMovto() != null) {
            conditions += " AND ACR_ULT_MOVTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getAcrUltMovto());
        }

        if (this.getAcrNumCreaciones() != null && this.getAcrNumCreaciones().longValue() == -999) {
            conditions += " AND ACR_NUM_CREACIONES IS NULL";
        } else if (this.getAcrNumCreaciones() != null) {
            conditions += " AND ACR_NUM_CREACIONES = ?";
            values.add(this.getAcrNumCreaciones());
        }

        if (this.getAcrNumRedenciones() != null && this.getAcrNumRedenciones().longValue() == -999) {
            conditions += " AND ACR_NUM_REDENCIONES IS NULL";
        } else if (this.getAcrNumRedenciones() != null) {
            conditions += " AND ACR_NUM_REDENCIONES = ?";
            values.add(this.getAcrNumRedenciones());
        }

        if (this.getAcrNumAcreditados() != null && this.getAcrNumAcreditados().longValue() == -999) {
            conditions += " AND ACR_NUM_ACREDITADOS IS NULL";
        } else if (this.getAcrNumAcreditados() != null) {
            conditions += " AND ACR_NUM_ACREDITADOS = ?";
            values.add(this.getAcrNumAcreditados());
        }

        if (this.getAcrCtaIndevalInt() != null && "null".equals(this.getAcrCtaIndevalInt())) {
            conditions += " AND ACR_CTA_INDEVAL_INT IS NULL";
        } else if (this.getAcrCtaIndevalInt() != null) {
            conditions += " AND ACR_CTA_INDEVAL_INT = ?";
            values.add(this.getAcrCtaIndevalInt());
        }

        if (this.getAcrCtaIndevalInt1() != null && "null".equals(this.getAcrCtaIndevalInt1())) {
            conditions += " AND ACR_CTA_INDEVAL_INT1 IS NULL";
        } else if (this.getAcrCtaIndevalInt1() != null) {
            conditions += " AND ACR_CTA_INDEVAL_INT1 = ?";
            values.add(this.getAcrCtaIndevalInt1());
        }

        if (this.getAcrStatus() != null && "null".equals(this.getAcrStatus())) {
            conditions += " AND ACR_STATUS IS NULL";
        } else if (this.getAcrStatus() != null) {
            conditions += " AND ACR_STATUS = ?";
            values.add(this.getAcrStatus());
        }

        if (this.getAcrComentario() != null && "null".equals(this.getAcrComentario())) {
            conditions += " AND ACR_COMENTARIO IS NULL";
        } else if (this.getAcrComentario() != null) {
            conditions += " AND ACR_COMENTARIO = ?";
            values.add(this.getAcrComentario());
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
        String sql = "UPDATE F_ACREDITA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ACR_ID_INTERMEDIARIO = ?";
        pkValues.add(this.getAcrIdIntermediario());
        fields += " ACR_RIESG0 = ?, ";
        values.add(this.getAcrRiesg0());
        fields += " ACR_DOCTO_RIESGO = ?, ";
        values.add(this.getAcrDoctoRiesgo());
        fields += " ACR_FEC_ACEPTACION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getAcrFecAceptacion());
        fields += " ACR_ULT_MOVTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getAcrUltMovto());
        fields += " ACR_NUM_CREACIONES = ?, ";
        values.add(this.getAcrNumCreaciones());
        fields += " ACR_NUM_REDENCIONES = ?, ";
        values.add(this.getAcrNumRedenciones());
        fields += " ACR_NUM_ACREDITADOS = ?, ";
        values.add(this.getAcrNumAcreditados());
        fields += " ACR_CTA_INDEVAL_INT = ?, ";
        values.add(this.getAcrCtaIndevalInt());
        fields += " ACR_CTA_INDEVAL_INT1 = ?, ";
        values.add(this.getAcrCtaIndevalInt1());
        fields += " ACR_STATUS = ?, ";
        values.add(this.getAcrStatus());
        fields += " ACR_COMENTARIO = ?, ";
        values.add(this.getAcrComentario());
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
        String sql = "INSERT INTO F_ACREDITA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ACR_ID_INTERMEDIARIO";
        fieldValues += ", ?";
        values.add(this.getAcrIdIntermediario());

        fields += ", ACR_RIESG0";
        fieldValues += ", ?";
        values.add(this.getAcrRiesg0());

        fields += ", ACR_DOCTO_RIESGO";
        fieldValues += ", ?";
        values.add(this.getAcrDoctoRiesgo());

        fields += ", ACR_FEC_ACEPTACION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getAcrFecAceptacion());

        fields += ", ACR_ULT_MOVTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getAcrUltMovto());

        fields += ", ACR_NUM_CREACIONES";
        fieldValues += ", ?";
        values.add(this.getAcrNumCreaciones());

        fields += ", ACR_NUM_REDENCIONES";
        fieldValues += ", ?";
        values.add(this.getAcrNumRedenciones());

        fields += ", ACR_NUM_ACREDITADOS";
        fieldValues += ", ?";
        values.add(this.getAcrNumAcreditados());

        fields += ", ACR_CTA_INDEVAL_INT";
        fieldValues += ", ?";
        values.add(this.getAcrCtaIndevalInt());

        fields += ", ACR_CTA_INDEVAL_INT1";
        fieldValues += ", ?";
        values.add(this.getAcrCtaIndevalInt1());

        fields += ", ACR_STATUS";
        fieldValues += ", ?";
        values.add(this.getAcrStatus());

        fields += ", ACR_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getAcrComentario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_ACREDITA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ACR_ID_INTERMEDIARIO = ?";
        values.add(this.getAcrIdIntermediario());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAcredita instance = (FAcredita) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAcrIdIntermediario().equals(instance.getAcrIdIntermediario()))
            equalObjects = false;
        if (equalObjects && !this.getAcrRiesg0().equals(instance.getAcrRiesg0()))
            equalObjects = false;
        if (equalObjects && !this.getAcrDoctoRiesgo().equals(instance.getAcrDoctoRiesgo()))
            equalObjects = false;
        if (equalObjects && !this.getAcrFecAceptacion().equals(instance.getAcrFecAceptacion()))
            equalObjects = false;
        if (equalObjects && !this.getAcrUltMovto().equals(instance.getAcrUltMovto()))
            equalObjects = false;
        if (equalObjects && !this.getAcrNumCreaciones().equals(instance.getAcrNumCreaciones()))
            equalObjects = false;
        if (equalObjects && !this.getAcrNumRedenciones().equals(instance.getAcrNumRedenciones()))
            equalObjects = false;
        if (equalObjects && !this.getAcrNumAcreditados().equals(instance.getAcrNumAcreditados()))
            equalObjects = false;
        if (equalObjects && !this.getAcrCtaIndevalInt().equals(instance.getAcrCtaIndevalInt()))
            equalObjects = false;
        if (equalObjects && !this.getAcrCtaIndevalInt1().equals(instance.getAcrCtaIndevalInt1()))
            equalObjects = false;
        if (equalObjects && !this.getAcrStatus().equals(instance.getAcrStatus()))
            equalObjects = false;
        if (equalObjects && !this.getAcrComentario().equals(instance.getAcrComentario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAcredita result = new FAcredita();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setAcrIdIntermediario((BigDecimal) objectData.getData("ACR_ID_INTERMEDIARIO"));
        result.setAcrRiesg0((BigDecimal) objectData.getData("ACR_RIESG0"));
        result.setAcrDoctoRiesgo((String) objectData.getData("ACR_DOCTO_RIESGO"));
        result.setAcrFecAceptacion((String) objectData.getData("ACR_FEC_ACEPTACION"));
        result.setAcrUltMovto((String) objectData.getData("ACR_ULT_MOVTO"));
        result.setAcrNumCreaciones((BigDecimal) objectData.getData("ACR_NUM_CREACIONES"));
        result.setAcrNumRedenciones((BigDecimal) objectData.getData("ACR_NUM_REDENCIONES"));
        result.setAcrNumAcreditados((BigDecimal) objectData.getData("ACR_NUM_ACREDITADOS"));
        result.setAcrCtaIndevalInt((String) objectData.getData("ACR_CTA_INDEVAL_INT"));
        result.setAcrCtaIndevalInt1((String) objectData.getData("ACR_CTA_INDEVAL_INT1"));
        result.setAcrStatus((String) objectData.getData("ACR_STATUS"));
        result.setAcrComentario((String) objectData.getData("ACR_COMENTARIO"));

        return result;

    }

}
