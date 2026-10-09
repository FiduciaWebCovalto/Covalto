package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_BIENES_PK", columns = { "FBIF_ID_FIDEICOMISO", "FBIF_ID_SUB_CUENTA", "FBIF_ID_TIPO_BIEN", "FBIF_ID_CVE_BIEN", "FBIF_ID_BIEN" },
            sequences = { "MANUAL" })
public class FBienes extends DomainObject {

    BigDecimal fbifIdFideicomiso = null;
    BigDecimal fbifIdSubCuenta = null;
    BigDecimal fbifIdTipoBien = null;
    String fbifIdCveBien = null;
    String fbifIdBien = null;
    BigDecimal fbifImpBien = null;
    BigDecimal fbifImpUltValua = null;
    String fbifPerValuacion = null;
    String fbifDescBien = null;
    String fbifFecUltValua = null;
    String fbifFecInicio = null;
    String fbifFecFin = null;
    BigDecimal fbifMoneda = null;
    BigDecimal fbifImpMoneda = null;
    BigDecimal fbifTipoCambio = null;
    String fbifTexComentario = null;
    String fbifStBien = null;

    public FBienes() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFbifIdFideicomiso(BigDecimal fbifIdFideicomiso) {
        this.fbifIdFideicomiso = fbifIdFideicomiso;
    }

    public BigDecimal getFbifIdFideicomiso() {
        return this.fbifIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFbifIdSubCuenta(BigDecimal fbifIdSubCuenta) {
        this.fbifIdSubCuenta = fbifIdSubCuenta;
    }

    public BigDecimal getFbifIdSubCuenta() {
        return this.fbifIdSubCuenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFbifIdTipoBien(BigDecimal fbifIdTipoBien) {
        this.fbifIdTipoBien = fbifIdTipoBien;
    }

    public BigDecimal getFbifIdTipoBien() {
        return this.fbifIdTipoBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFbifIdCveBien(String fbifIdCveBien) {
        this.fbifIdCveBien = fbifIdCveBien;
    }

    public String getFbifIdCveBien() {
        return this.fbifIdCveBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFbifIdBien(String fbifIdBien) {
        this.fbifIdBien = fbifIdBien;
    }

    public String getFbifIdBien() {
        return this.fbifIdBien;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFbifImpBien(BigDecimal fbifImpBien) {
        this.fbifImpBien = fbifImpBien;
    }

    public BigDecimal getFbifImpBien() {
        return this.fbifImpBien;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFbifImpUltValua(BigDecimal fbifImpUltValua) {
        this.fbifImpUltValua = fbifImpUltValua;
    }

    public BigDecimal getFbifImpUltValua() {
        return this.fbifImpUltValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFbifPerValuacion(String fbifPerValuacion) {
        this.fbifPerValuacion = fbifPerValuacion;
    }

    public String getFbifPerValuacion() {
        return this.fbifPerValuacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFbifDescBien(String fbifDescBien) {
        this.fbifDescBien = fbifDescBien;
    }

    public String getFbifDescBien() {
        return this.fbifDescBien;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFbifFecUltValua(String fbifFecUltValua) {
        this.fbifFecUltValua = fbifFecUltValua;
    }

    public String getFbifFecUltValua() {
        return this.fbifFecUltValua;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFbifFecInicio(String fbifFecInicio) {
        this.fbifFecInicio = fbifFecInicio;
    }

    public String getFbifFecInicio() {
        return this.fbifFecInicio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFbifFecFin(String fbifFecFin) {
        this.fbifFecFin = fbifFecFin;
    }

    public String getFbifFecFin() {
        return this.fbifFecFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFbifMoneda(BigDecimal fbifMoneda) {
        this.fbifMoneda = fbifMoneda;
    }

    public BigDecimal getFbifMoneda() {
        return this.fbifMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFbifImpMoneda(BigDecimal fbifImpMoneda) {
        this.fbifImpMoneda = fbifImpMoneda;
    }

    public BigDecimal getFbifImpMoneda() {
        return this.fbifImpMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setFbifTipoCambio(BigDecimal fbifTipoCambio) {
        this.fbifTipoCambio = fbifTipoCambio;
    }

    public BigDecimal getFbifTipoCambio() {
        return this.fbifTipoCambio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFbifTexComentario(String fbifTexComentario) {
        this.fbifTexComentario = fbifTexComentario;
    }

    public String getFbifTexComentario() {
        return this.fbifTexComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFbifStBien(String fbifStBien) {
        this.fbifStBien = fbifStBien;
    }

    public String getFbifStBien() {
        return this.fbifStBien;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_BIENES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFbifIdFideicomiso() != null && this.getFbifIdFideicomiso().longValue() == -999) {
            conditions += " AND FBIF_ID_FIDEICOMISO IS NULL";
        } else if (this.getFbifIdFideicomiso() != null) {
            conditions += " AND FBIF_ID_FIDEICOMISO = ?";
            values.add(this.getFbifIdFideicomiso());
        }

        if (this.getFbifIdSubCuenta() != null && this.getFbifIdSubCuenta().longValue() == -999) {
            conditions += " AND FBIF_ID_SUB_CUENTA IS NULL";
        } else if (this.getFbifIdSubCuenta() != null) {
            conditions += " AND FBIF_ID_SUB_CUENTA = ?";
            values.add(this.getFbifIdSubCuenta());
        }

        if (this.getFbifIdTipoBien() != null && this.getFbifIdTipoBien().longValue() == -999) {
            conditions += " AND FBIF_ID_TIPO_BIEN IS NULL";
        } else if (this.getFbifIdTipoBien() != null) {
            conditions += " AND FBIF_ID_TIPO_BIEN = ?";
            values.add(this.getFbifIdTipoBien());
        }

        if (this.getFbifIdCveBien() != null && "null".equals(this.getFbifIdCveBien())) {
            conditions += " AND FBIF_ID_CVE_BIEN IS NULL";
        } else if (this.getFbifIdCveBien() != null) {
            conditions += " AND FBIF_ID_CVE_BIEN = ?";
            values.add(this.getFbifIdCveBien());
        }

        if (this.getFbifIdBien() != null && "null".equals(this.getFbifIdBien())) {
            conditions += " AND FBIF_ID_BIEN IS NULL";
        } else if (this.getFbifIdBien() != null) {
            conditions += " AND FBIF_ID_BIEN = ?";
            values.add(this.getFbifIdBien());
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
        String sql = "SELECT * FROM F_BIENES ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFbifIdFideicomiso() != null && this.getFbifIdFideicomiso().longValue() == -999) {
            conditions += " AND FBIF_ID_FIDEICOMISO IS NULL";
        } else if (this.getFbifIdFideicomiso() != null) {
            conditions += " AND FBIF_ID_FIDEICOMISO = ?";
            values.add(this.getFbifIdFideicomiso());
        }

        if (this.getFbifIdSubCuenta() != null && this.getFbifIdSubCuenta().longValue() == -999) {
            conditions += " AND FBIF_ID_SUB_CUENTA IS NULL";
        } else if (this.getFbifIdSubCuenta() != null) {
            conditions += " AND FBIF_ID_SUB_CUENTA = ?";
            values.add(this.getFbifIdSubCuenta());
        }

        if (this.getFbifIdTipoBien() != null && this.getFbifIdTipoBien().longValue() == -999) {
            conditions += " AND FBIF_ID_TIPO_BIEN IS NULL";
        } else if (this.getFbifIdTipoBien() != null) {
            conditions += " AND FBIF_ID_TIPO_BIEN = ?";
            values.add(this.getFbifIdTipoBien());
        }

        if (this.getFbifIdCveBien() != null && "null".equals(this.getFbifIdCveBien())) {
            conditions += " AND FBIF_ID_CVE_BIEN IS NULL";
        } else if (this.getFbifIdCveBien() != null) {
            conditions += " AND FBIF_ID_CVE_BIEN = ?";
            values.add(this.getFbifIdCveBien());
        }

        if (this.getFbifIdBien() != null && "null".equals(this.getFbifIdBien())) {
            conditions += " AND FBIF_ID_BIEN IS NULL";
        } else if (this.getFbifIdBien() != null) {
            conditions += " AND FBIF_ID_BIEN = ?";
            values.add(this.getFbifIdBien());
        }

        if (this.getFbifImpBien() != null && this.getFbifImpBien().longValue() == -999) {
            conditions += " AND FBIF_IMP_BIEN IS NULL";
        } else if (this.getFbifImpBien() != null) {
            conditions += " AND FBIF_IMP_BIEN = ?";
            values.add(this.getFbifImpBien());
        }

        if (this.getFbifImpUltValua() != null && this.getFbifImpUltValua().longValue() == -999) {
            conditions += " AND FBIF_IMP_ULT_VALUA IS NULL";
        } else if (this.getFbifImpUltValua() != null) {
            conditions += " AND FBIF_IMP_ULT_VALUA = ?";
            values.add(this.getFbifImpUltValua());
        }

        if (this.getFbifPerValuacion() != null && "null".equals(this.getFbifPerValuacion())) {
            conditions += " AND FBIF_PER_VALUACION IS NULL";
        } else if (this.getFbifPerValuacion() != null) {
            conditions += " AND FBIF_PER_VALUACION = ?";
            values.add(this.getFbifPerValuacion());
        }

        if (this.getFbifDescBien() != null && "null".equals(this.getFbifDescBien())) {
            conditions += " AND FBIF_DESC_BIEN IS NULL";
        } else if (this.getFbifDescBien() != null) {
            conditions += " AND FBIF_DESC_BIEN = ?";
            values.add(this.getFbifDescBien());
        }

        if (this.getFbifFecUltValua() != null && "null".equals(this.getFbifFecUltValua())) {
            conditions += " AND FBIF_FEC_ULT_VALUA IS NULL";
        } else if (this.getFbifFecUltValua() != null) {
            conditions += " AND FBIF_FEC_ULT_VALUA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFbifFecUltValua());
        }

        if (this.getFbifFecInicio() != null && "null".equals(this.getFbifFecInicio())) {
            conditions += " AND FBIF_FEC_INICIO IS NULL";
        } else if (this.getFbifFecInicio() != null) {
            conditions += " AND FBIF_FEC_INICIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFbifFecInicio());
        }

        if (this.getFbifFecFin() != null && "null".equals(this.getFbifFecFin())) {
            conditions += " AND FBIF_FEC_FIN IS NULL";
        } else if (this.getFbifFecFin() != null) {
            conditions += " AND FBIF_FEC_FIN = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFbifFecFin());
        }

        if (this.getFbifMoneda() != null && this.getFbifMoneda().longValue() == -999) {
            conditions += " AND FBIF_MONEDA IS NULL";
        } else if (this.getFbifMoneda() != null) {
            conditions += " AND FBIF_MONEDA = ?";
            values.add(this.getFbifMoneda());
        }

        if (this.getFbifImpMoneda() != null && this.getFbifImpMoneda().longValue() == -999) {
            conditions += " AND FBIF_IMP_MONEDA IS NULL";
        } else if (this.getFbifImpMoneda() != null) {
            conditions += " AND FBIF_IMP_MONEDA = ?";
            values.add(this.getFbifImpMoneda());
        }

        if (this.getFbifTipoCambio() != null && this.getFbifTipoCambio().longValue() == -999) {
            conditions += " AND FBIF_TIPO_CAMBIO IS NULL";
        } else if (this.getFbifTipoCambio() != null) {
            conditions += " AND FBIF_TIPO_CAMBIO = ?";
            values.add(this.getFbifTipoCambio());
        }

        if (this.getFbifTexComentario() != null && "null".equals(this.getFbifTexComentario())) {
            conditions += " AND FBIF_TEX_COMENTARIO IS NULL";
        } else if (this.getFbifTexComentario() != null) {
            conditions += " AND FBIF_TEX_COMENTARIO = ?";
            values.add(this.getFbifTexComentario());
        }

        if (this.getFbifStBien() != null && "null".equals(this.getFbifStBien())) {
            conditions += " AND FBIF_ST_BIEN IS NULL";
        } else if (this.getFbifStBien() != null) {
            conditions += " AND FBIF_ST_BIEN = ?";
            values.add(this.getFbifStBien());
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
        String sql = "UPDATE F_BIENES SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FBIF_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFbifIdFideicomiso());
        conditions += " AND FBIF_ID_SUB_CUENTA = ?";
        pkValues.add(this.getFbifIdSubCuenta());
        conditions += " AND FBIF_ID_TIPO_BIEN = ?";
        pkValues.add(this.getFbifIdTipoBien());
        conditions += " AND FBIF_ID_CVE_BIEN = ?";
        pkValues.add(this.getFbifIdCveBien());
        conditions += " AND FBIF_ID_BIEN = ?";
        pkValues.add(this.getFbifIdBien());
        fields += " FBIF_IMP_BIEN = ?, ";
        values.add(this.getFbifImpBien());
        fields += " FBIF_IMP_ULT_VALUA = ?, ";
        values.add(this.getFbifImpUltValua());
        fields += " FBIF_PER_VALUACION = ?, ";
        values.add(this.getFbifPerValuacion());
        fields += " FBIF_DESC_BIEN = ?, ";
        values.add(this.getFbifDescBien());
        fields += " FBIF_FEC_ULT_VALUA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFbifFecUltValua());
        fields += " FBIF_FEC_INICIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFbifFecInicio());
        fields += " FBIF_FEC_FIN = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFbifFecFin());
        fields += " FBIF_MONEDA = ?, ";
        values.add(this.getFbifMoneda());
        fields += " FBIF_IMP_MONEDA = ?, ";
        values.add(this.getFbifImpMoneda());
        fields += " FBIF_TIPO_CAMBIO = ?, ";
        values.add(this.getFbifTipoCambio());
        fields += " FBIF_TEX_COMENTARIO = ?, ";
        values.add(this.getFbifTexComentario());
        fields += " FBIF_ST_BIEN = ?, ";
        values.add(this.getFbifStBien());
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
        String sql = "INSERT INTO F_BIENES ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FBIF_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFbifIdFideicomiso());

        fields += ", FBIF_ID_SUB_CUENTA";
        fieldValues += ", ?";
        values.add(this.getFbifIdSubCuenta());

        fields += ", FBIF_ID_TIPO_BIEN";
        fieldValues += ", ?";
        values.add(this.getFbifIdTipoBien());

        fields += ", FBIF_ID_CVE_BIEN";
        fieldValues += ", ?";
        values.add(this.getFbifIdCveBien());

        fields += ", FBIF_ID_BIEN";
        fieldValues += ", ?";
        values.add(this.getFbifIdBien());

        fields += ", FBIF_IMP_BIEN";
        fieldValues += ", ?";
        values.add(this.getFbifImpBien());

        fields += ", FBIF_IMP_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getFbifImpUltValua());

        fields += ", FBIF_PER_VALUACION";
        fieldValues += ", ?";
        values.add(this.getFbifPerValuacion());

        fields += ", FBIF_DESC_BIEN";
        fieldValues += ", ?";
        values.add(this.getFbifDescBien());

        fields += ", FBIF_FEC_ULT_VALUA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFbifFecUltValua());

        fields += ", FBIF_FEC_INICIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFbifFecInicio());

        fields += ", FBIF_FEC_FIN";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFbifFecFin());

        fields += ", FBIF_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFbifMoneda());

        fields += ", FBIF_IMP_MONEDA";
        fieldValues += ", ?";
        values.add(this.getFbifImpMoneda());

        fields += ", FBIF_TIPO_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getFbifTipoCambio());

        fields += ", FBIF_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getFbifTexComentario());

        fields += ", FBIF_ST_BIEN";
        fieldValues += ", ?";
        values.add(this.getFbifStBien());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_BIENES WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FBIF_ID_FIDEICOMISO = ?";
        values.add(this.getFbifIdFideicomiso());
        conditions += " AND FBIF_ID_SUB_CUENTA = ?";
        values.add(this.getFbifIdSubCuenta());
        conditions += " AND FBIF_ID_TIPO_BIEN = ?";
        values.add(this.getFbifIdTipoBien());
        conditions += " AND FBIF_ID_CVE_BIEN = ?";
        values.add(this.getFbifIdCveBien());
        conditions += " AND FBIF_ID_BIEN = ?";
        values.add(this.getFbifIdBien());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FBienes instance = (FBienes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFbifIdFideicomiso().equals(instance.getFbifIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFbifIdSubCuenta().equals(instance.getFbifIdSubCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getFbifIdTipoBien().equals(instance.getFbifIdTipoBien()))
            equalObjects = false;
        if (equalObjects && !this.getFbifIdCveBien().equals(instance.getFbifIdCveBien()))
            equalObjects = false;
        if (equalObjects && !this.getFbifIdBien().equals(instance.getFbifIdBien()))
            equalObjects = false;
        if (equalObjects && !this.getFbifImpBien().equals(instance.getFbifImpBien()))
            equalObjects = false;
        if (equalObjects && !this.getFbifImpUltValua().equals(instance.getFbifImpUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getFbifPerValuacion().equals(instance.getFbifPerValuacion()))
            equalObjects = false;
        if (equalObjects && !this.getFbifDescBien().equals(instance.getFbifDescBien()))
            equalObjects = false;
        if (equalObjects && !this.getFbifFecUltValua().equals(instance.getFbifFecUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getFbifFecInicio().equals(instance.getFbifFecInicio()))
            equalObjects = false;
        if (equalObjects && !this.getFbifFecFin().equals(instance.getFbifFecFin()))
            equalObjects = false;
        if (equalObjects && !this.getFbifMoneda().equals(instance.getFbifMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFbifImpMoneda().equals(instance.getFbifImpMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getFbifTipoCambio().equals(instance.getFbifTipoCambio()))
            equalObjects = false;
        if (equalObjects && !this.getFbifTexComentario().equals(instance.getFbifTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getFbifStBien().equals(instance.getFbifStBien()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FBienes result = new FBienes();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFbifIdFideicomiso((BigDecimal) objectData.getData("FBIF_ID_FIDEICOMISO"));
        result.setFbifIdSubCuenta((BigDecimal) objectData.getData("FBIF_ID_SUB_CUENTA"));
        result.setFbifIdTipoBien((BigDecimal) objectData.getData("FBIF_ID_TIPO_BIEN"));
        result.setFbifIdCveBien((String) objectData.getData("FBIF_ID_CVE_BIEN"));
        result.setFbifIdBien((String) objectData.getData("FBIF_ID_BIEN"));
        result.setFbifImpBien((BigDecimal) objectData.getData("FBIF_IMP_BIEN"));
        result.setFbifImpUltValua((BigDecimal) objectData.getData("FBIF_IMP_ULT_VALUA"));
        result.setFbifPerValuacion((String) objectData.getData("FBIF_PER_VALUACION"));
        result.setFbifDescBien((String) objectData.getData("FBIF_DESC_BIEN"));
        result.setFbifFecUltValua((String) objectData.getData("FBIF_FEC_ULT_VALUA"));
        result.setFbifFecInicio((String) objectData.getData("FBIF_FEC_INICIO"));
        result.setFbifFecFin((String) objectData.getData("FBIF_FEC_FIN"));
        result.setFbifMoneda((BigDecimal) objectData.getData("FBIF_MONEDA"));
        result.setFbifImpMoneda((BigDecimal) objectData.getData("FBIF_IMP_MONEDA"));
        result.setFbifTipoCambio((BigDecimal) objectData.getData("FBIF_TIPO_CAMBIO"));
        result.setFbifTexComentario((String) objectData.getData("FBIF_TEX_COMENTARIO"));
        result.setFbifStBien((String) objectData.getData("FBIF_ST_BIEN"));

        return result;

    }

}
