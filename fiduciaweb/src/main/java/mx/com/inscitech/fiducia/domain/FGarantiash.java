package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FGarantiash extends DomainObject {

    BigDecimal fgarIdFideicomiso = null;
    BigDecimal fgarIdSubcuenta = null;
    BigDecimal fgarCveGarantia = null;
    String fgarTexGarantia = null;
    String fgarTexComentario = null;
    BigDecimal fgarCveRevalua = null;
    BigDecimal fgarImpGarantia = null;
    BigDecimal fgarImpGarantizad = null;
    BigDecimal fgarPjePicnorado = null;
    BigDecimal fgarImpUltValua = null;
    String fgarCvePerValua = null;
    String fgarFecUltValua = null;
    String fgarFecInicio = null;
    String fgarFecFin = null;
    String fgarCveStatus = null;

    public FGarantiash() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFgarIdFideicomiso(BigDecimal fgarIdFideicomiso) {
        this.fgarIdFideicomiso = fgarIdFideicomiso;
    }

    public BigDecimal getFgarIdFideicomiso() {
        return this.fgarIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFgarIdSubcuenta(BigDecimal fgarIdSubcuenta) {
        this.fgarIdSubcuenta = fgarIdSubcuenta;
    }

    public BigDecimal getFgarIdSubcuenta() {
        return this.fgarIdSubcuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFgarCveGarantia(BigDecimal fgarCveGarantia) {
        this.fgarCveGarantia = fgarCveGarantia;
    }

    public BigDecimal getFgarCveGarantia() {
        return this.fgarCveGarantia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgarTexGarantia(String fgarTexGarantia) {
        this.fgarTexGarantia = fgarTexGarantia;
    }

    public String getFgarTexGarantia() {
        return this.fgarTexGarantia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgarTexComentario(String fgarTexComentario) {
        this.fgarTexComentario = fgarTexComentario;
    }

    public String getFgarTexComentario() {
        return this.fgarTexComentario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFgarCveRevalua(BigDecimal fgarCveRevalua) {
        this.fgarCveRevalua = fgarCveRevalua;
    }

    public BigDecimal getFgarCveRevalua() {
        return this.fgarCveRevalua;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFgarImpGarantia(BigDecimal fgarImpGarantia) {
        this.fgarImpGarantia = fgarImpGarantia;
    }

    public BigDecimal getFgarImpGarantia() {
        return this.fgarImpGarantia;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFgarImpGarantizad(BigDecimal fgarImpGarantizad) {
        this.fgarImpGarantizad = fgarImpGarantizad;
    }

    public BigDecimal getFgarImpGarantizad() {
        return this.fgarImpGarantizad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setFgarPjePicnorado(BigDecimal fgarPjePicnorado) {
        this.fgarPjePicnorado = fgarPjePicnorado;
    }

    public BigDecimal getFgarPjePicnorado() {
        return this.fgarPjePicnorado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFgarImpUltValua(BigDecimal fgarImpUltValua) {
        this.fgarImpUltValua = fgarImpUltValua;
    }

    public BigDecimal getFgarImpUltValua() {
        return this.fgarImpUltValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgarCvePerValua(String fgarCvePerValua) {
        this.fgarCvePerValua = fgarCvePerValua;
    }

    public String getFgarCvePerValua() {
        return this.fgarCvePerValua;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFgarFecUltValua(String fgarFecUltValua) {
        this.fgarFecUltValua = fgarFecUltValua;
    }

    public String getFgarFecUltValua() {
        return this.fgarFecUltValua;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFgarFecInicio(String fgarFecInicio) {
        this.fgarFecInicio = fgarFecInicio;
    }

    public String getFgarFecInicio() {
        return this.fgarFecInicio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFgarFecFin(String fgarFecFin) {
        this.fgarFecFin = fgarFecFin;
    }

    public String getFgarFecFin() {
        return this.fgarFecFin;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFgarCveStatus(String fgarCveStatus) {
        this.fgarCveStatus = fgarCveStatus;
    }

    public String getFgarCveStatus() {
        return this.fgarCveStatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_GARANTIASH ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM F_GARANTIASH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFgarIdFideicomiso() != null && this.getFgarIdFideicomiso().longValue() == -999) {
            conditions += " AND FGAR_ID_FIDEICOMISO IS NULL";
        } else if (this.getFgarIdFideicomiso() != null) {
            conditions += " AND FGAR_ID_FIDEICOMISO = ?";
            values.add(this.getFgarIdFideicomiso());
        }

        if (this.getFgarIdSubcuenta() != null && this.getFgarIdSubcuenta().longValue() == -999) {
            conditions += " AND FGAR_ID_SUBCUENTA IS NULL";
        } else if (this.getFgarIdSubcuenta() != null) {
            conditions += " AND FGAR_ID_SUBCUENTA = ?";
            values.add(this.getFgarIdSubcuenta());
        }

        if (this.getFgarCveGarantia() != null && this.getFgarCveGarantia().longValue() == -999) {
            conditions += " AND FGAR_CVE_GARANTIA IS NULL";
        } else if (this.getFgarCveGarantia() != null) {
            conditions += " AND FGAR_CVE_GARANTIA = ?";
            values.add(this.getFgarCveGarantia());
        }

        if (this.getFgarTexGarantia() != null && "null".equals(this.getFgarTexGarantia())) {
            conditions += " AND FGAR_TEX_GARANTIA IS NULL";
        } else if (this.getFgarTexGarantia() != null) {
            conditions += " AND FGAR_TEX_GARANTIA = ?";
            values.add(this.getFgarTexGarantia());
        }

        if (this.getFgarTexComentario() != null && "null".equals(this.getFgarTexComentario())) {
            conditions += " AND FGAR_TEX_COMENTARIO IS NULL";
        } else if (this.getFgarTexComentario() != null) {
            conditions += " AND FGAR_TEX_COMENTARIO = ?";
            values.add(this.getFgarTexComentario());
        }

        if (this.getFgarCveRevalua() != null && this.getFgarCveRevalua().longValue() == -999) {
            conditions += " AND FGAR_CVE_REVALUA IS NULL";
        } else if (this.getFgarCveRevalua() != null) {
            conditions += " AND FGAR_CVE_REVALUA = ?";
            values.add(this.getFgarCveRevalua());
        }

        if (this.getFgarImpGarantia() != null && this.getFgarImpGarantia().longValue() == -999) {
            conditions += " AND FGAR_IMP_GARANTIA IS NULL";
        } else if (this.getFgarImpGarantia() != null) {
            conditions += " AND FGAR_IMP_GARANTIA = ?";
            values.add(this.getFgarImpGarantia());
        }

        if (this.getFgarImpGarantizad() != null && this.getFgarImpGarantizad().longValue() == -999) {
            conditions += " AND FGAR_IMP_GARANTIZAD IS NULL";
        } else if (this.getFgarImpGarantizad() != null) {
            conditions += " AND FGAR_IMP_GARANTIZAD = ?";
            values.add(this.getFgarImpGarantizad());
        }

        if (this.getFgarPjePicnorado() != null && this.getFgarPjePicnorado().longValue() == -999) {
            conditions += " AND FGAR_PJE_PICNORADO IS NULL";
        } else if (this.getFgarPjePicnorado() != null) {
            conditions += " AND FGAR_PJE_PICNORADO = ?";
            values.add(this.getFgarPjePicnorado());
        }

        if (this.getFgarImpUltValua() != null && this.getFgarImpUltValua().longValue() == -999) {
            conditions += " AND FGAR_IMP_ULT_VALUA IS NULL";
        } else if (this.getFgarImpUltValua() != null) {
            conditions += " AND FGAR_IMP_ULT_VALUA = ?";
            values.add(this.getFgarImpUltValua());
        }

        if (this.getFgarCvePerValua() != null && "null".equals(this.getFgarCvePerValua())) {
            conditions += " AND FGAR_CVE_PER_VALUA IS NULL";
        } else if (this.getFgarCvePerValua() != null) {
            conditions += " AND FGAR_CVE_PER_VALUA = ?";
            values.add(this.getFgarCvePerValua());
        }

        if (this.getFgarFecUltValua() != null && "null".equals(this.getFgarFecUltValua())) {
            conditions += " AND FGAR_FEC_ULT_VALUA IS NULL";
        } else if (this.getFgarFecUltValua() != null) {
            conditions += " AND FGAR_FEC_ULT_VALUA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFgarFecUltValua());
        }

        if (this.getFgarFecInicio() != null && "null".equals(this.getFgarFecInicio())) {
            conditions += " AND FGAR_FEC_INICIO IS NULL";
        } else if (this.getFgarFecInicio() != null) {
            conditions += " AND FGAR_FEC_INICIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFgarFecInicio());
        }

        if (this.getFgarFecFin() != null && "null".equals(this.getFgarFecFin())) {
            conditions += " AND FGAR_FEC_FIN IS NULL";
        } else if (this.getFgarFecFin() != null) {
            conditions += " AND FGAR_FEC_FIN = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFgarFecFin());
        }

        if (this.getFgarCveStatus() != null && "null".equals(this.getFgarCveStatus())) {
            conditions += " AND FGAR_CVE_STATUS IS NULL";
        } else if (this.getFgarCveStatus() != null) {
            conditions += " AND FGAR_CVE_STATUS = ?";
            values.add(this.getFgarCveStatus());
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
        String sql = "UPDATE F_GARANTIASH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " FGAR_ID_FIDEICOMISO = ?, ";
        values.add(this.getFgarIdFideicomiso());
        fields += " FGAR_ID_SUBCUENTA = ?, ";
        values.add(this.getFgarIdSubcuenta());
        fields += " FGAR_CVE_GARANTIA = ?, ";
        values.add(this.getFgarCveGarantia());
        fields += " FGAR_TEX_GARANTIA = ?, ";
        values.add(this.getFgarTexGarantia());
        fields += " FGAR_TEX_COMENTARIO = ?, ";
        values.add(this.getFgarTexComentario());
        fields += " FGAR_CVE_REVALUA = ?, ";
        values.add(this.getFgarCveRevalua());
        fields += " FGAR_IMP_GARANTIA = ?, ";
        values.add(this.getFgarImpGarantia());
        fields += " FGAR_IMP_GARANTIZAD = ?, ";
        values.add(this.getFgarImpGarantizad());
        fields += " FGAR_PJE_PICNORADO = ?, ";
        values.add(this.getFgarPjePicnorado());
        fields += " FGAR_IMP_ULT_VALUA = ?, ";
        values.add(this.getFgarImpUltValua());
        fields += " FGAR_CVE_PER_VALUA = ?, ";
        values.add(this.getFgarCvePerValua());
        fields += " FGAR_FEC_ULT_VALUA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFgarFecUltValua());
        fields += " FGAR_FEC_INICIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFgarFecInicio());
        fields += " FGAR_FEC_FIN = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFgarFecFin());
        fields += " FGAR_CVE_STATUS = ?, ";
        values.add(this.getFgarCveStatus());
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
        String sql = "INSERT INTO F_GARANTIASH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FGAR_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFgarIdFideicomiso());

        fields += ", FGAR_ID_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getFgarIdSubcuenta());

        fields += ", FGAR_CVE_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFgarCveGarantia());

        fields += ", FGAR_TEX_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFgarTexGarantia());

        fields += ", FGAR_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFgarTexComentario());

        fields += ", FGAR_CVE_REVALUA";
        fieldValues += ", ?";
        values.add(this.getFgarCveRevalua());

        fields += ", FGAR_IMP_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getFgarImpGarantia());

        fields += ", FGAR_IMP_GARANTIZAD";
        fieldValues += ", ?";
        values.add(this.getFgarImpGarantizad());

        fields += ", FGAR_PJE_PICNORADO";
        fieldValues += ", ?";
        values.add(this.getFgarPjePicnorado());

        fields += ", FGAR_IMP_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getFgarImpUltValua());

        fields += ", FGAR_CVE_PER_VALUA";
        fieldValues += ", ?";
        values.add(this.getFgarCvePerValua());

        fields += ", FGAR_FEC_ULT_VALUA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFgarFecUltValua());

        fields += ", FGAR_FEC_INICIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFgarFecInicio());

        fields += ", FGAR_FEC_FIN";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFgarFecFin());

        fields += ", FGAR_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getFgarCveStatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_GARANTIASH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FGarantiash instance = (FGarantiash) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFgarIdFideicomiso().equals(instance.getFgarIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFgarIdSubcuenta().equals(instance.getFgarIdSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFgarCveGarantia().equals(instance.getFgarCveGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getFgarTexGarantia().equals(instance.getFgarTexGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getFgarTexComentario().equals(instance.getFgarTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFgarCveRevalua().equals(instance.getFgarCveRevalua()))
            equalObjects = false;
        if (equalObjects && !this.getFgarImpGarantia().equals(instance.getFgarImpGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getFgarImpGarantizad().equals(instance.getFgarImpGarantizad()))
            equalObjects = false;
        if (equalObjects && !this.getFgarPjePicnorado().equals(instance.getFgarPjePicnorado()))
            equalObjects = false;
        if (equalObjects && !this.getFgarImpUltValua().equals(instance.getFgarImpUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getFgarCvePerValua().equals(instance.getFgarCvePerValua()))
            equalObjects = false;
        if (equalObjects && !this.getFgarFecUltValua().equals(instance.getFgarFecUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getFgarFecInicio().equals(instance.getFgarFecInicio()))
            equalObjects = false;
        if (equalObjects && !this.getFgarFecFin().equals(instance.getFgarFecFin()))
            equalObjects = false;
        if (equalObjects && !this.getFgarCveStatus().equals(instance.getFgarCveStatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FGarantiash result = new FGarantiash();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFgarIdFideicomiso((BigDecimal) objectData.getData("FGAR_ID_FIDEICOMISO"));
        result.setFgarIdSubcuenta((BigDecimal) objectData.getData("FGAR_ID_SUBCUENTA"));
        result.setFgarCveGarantia((BigDecimal) objectData.getData("FGAR_CVE_GARANTIA"));
        result.setFgarTexGarantia((String) objectData.getData("FGAR_TEX_GARANTIA"));
        result.setFgarTexComentario((String) objectData.getData("FGAR_TEX_COMENTARIO"));
        result.setFgarCveRevalua((BigDecimal) objectData.getData("FGAR_CVE_REVALUA"));
        result.setFgarImpGarantia((BigDecimal) objectData.getData("FGAR_IMP_GARANTIA"));
        result.setFgarImpGarantizad((BigDecimal) objectData.getData("FGAR_IMP_GARANTIZAD"));
        result.setFgarPjePicnorado((BigDecimal) objectData.getData("FGAR_PJE_PICNORADO"));
        result.setFgarImpUltValua((BigDecimal) objectData.getData("FGAR_IMP_ULT_VALUA"));
        result.setFgarCvePerValua((String) objectData.getData("FGAR_CVE_PER_VALUA"));
        result.setFgarFecUltValua((String) objectData.getData("FGAR_FEC_ULT_VALUA"));
        result.setFgarFecInicio((String) objectData.getData("FGAR_FEC_INICIO"));
        result.setFgarFecFin((String) objectData.getData("FGAR_FEC_FIN"));
        result.setFgarCveStatus((String) objectData.getData("FGAR_CVE_STATUS"));

        return result;

    }

}
