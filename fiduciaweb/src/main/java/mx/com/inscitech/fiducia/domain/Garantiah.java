package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "GARANTIAH_PK", columns = { "GRN_SUB_CONTRATO", "GRN_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Garantiah extends DomainObject {

    BigDecimal grnNumContrato = null;
    BigDecimal grnSubContrato = null;
    BigDecimal grnCveValores = null;
    BigDecimal grnCveOtros = null;
    BigDecimal grnCveInmuebles = null;
    BigDecimal grnCveMuebles = null;
    BigDecimal grnCveRevalua = null;
    BigDecimal grnCveNumerario = null;
    BigDecimal grnImpGaranti = null;
    BigDecimal grnImpGarantizad = null;
    BigDecimal grnImpUltValua = null;
    String grnCvePerValua = null;
    BigDecimal grnFecAnoInicio = null;
    BigDecimal grnFecDiaInicio = null;
    BigDecimal grnFecMesInicio = null;
    BigDecimal grnFecAnoFin = null;
    BigDecimal grnFecMesFin = null;
    BigDecimal grnFecDiaFin = null;
    String grnFecUltValua = null;
    Long grnTexGarantia = null;
    String grnTexComentario = null;
    String grnCveStatus = null;
    BigDecimal grnImpNumerario = null;
    String grnFechNumerario = null;

    public Garantiah() {
        super();
        this.pkColumns = 2;
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

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrnCveValores(BigDecimal grnCveValores) {
        this.grnCveValores = grnCveValores;
    }

    public BigDecimal getGrnCveValores() {
        return this.grnCveValores;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrnCveOtros(BigDecimal grnCveOtros) {
        this.grnCveOtros = grnCveOtros;
    }

    public BigDecimal getGrnCveOtros() {
        return this.grnCveOtros;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrnCveInmuebles(BigDecimal grnCveInmuebles) {
        this.grnCveInmuebles = grnCveInmuebles;
    }

    public BigDecimal getGrnCveInmuebles() {
        return this.grnCveInmuebles;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrnCveMuebles(BigDecimal grnCveMuebles) {
        this.grnCveMuebles = grnCveMuebles;
    }

    public BigDecimal getGrnCveMuebles() {
        return this.grnCveMuebles;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrnCveRevalua(BigDecimal grnCveRevalua) {
        this.grnCveRevalua = grnCveRevalua;
    }

    public BigDecimal getGrnCveRevalua() {
        return this.grnCveRevalua;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setGrnCveNumerario(BigDecimal grnCveNumerario) {
        this.grnCveNumerario = grnCveNumerario;
    }

    public BigDecimal getGrnCveNumerario() {
        return this.grnCveNumerario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGrnImpGaranti(BigDecimal grnImpGaranti) {
        this.grnImpGaranti = grnImpGaranti;
    }

    public BigDecimal getGrnImpGaranti() {
        return this.grnImpGaranti;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGrnImpGarantizad(BigDecimal grnImpGarantizad) {
        this.grnImpGarantizad = grnImpGarantizad;
    }

    public BigDecimal getGrnImpGarantizad() {
        return this.grnImpGarantizad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGrnImpUltValua(BigDecimal grnImpUltValua) {
        this.grnImpUltValua = grnImpUltValua;
    }

    public BigDecimal getGrnImpUltValua() {
        return this.grnImpUltValua;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnCvePerValua(String grnCvePerValua) {
        this.grnCvePerValua = grnCvePerValua;
    }

    public String getGrnCvePerValua() {
        return this.grnCvePerValua;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setGrnFecAnoInicio(BigDecimal grnFecAnoInicio) {
        this.grnFecAnoInicio = grnFecAnoInicio;
    }

    public BigDecimal getGrnFecAnoInicio() {
        return this.grnFecAnoInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGrnFecDiaInicio(BigDecimal grnFecDiaInicio) {
        this.grnFecDiaInicio = grnFecDiaInicio;
    }

    public BigDecimal getGrnFecDiaInicio() {
        return this.grnFecDiaInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGrnFecMesInicio(BigDecimal grnFecMesInicio) {
        this.grnFecMesInicio = grnFecMesInicio;
    }

    public BigDecimal getGrnFecMesInicio() {
        return this.grnFecMesInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setGrnFecAnoFin(BigDecimal grnFecAnoFin) {
        this.grnFecAnoFin = grnFecAnoFin;
    }

    public BigDecimal getGrnFecAnoFin() {
        return this.grnFecAnoFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGrnFecMesFin(BigDecimal grnFecMesFin) {
        this.grnFecMesFin = grnFecMesFin;
    }

    public BigDecimal getGrnFecMesFin() {
        return this.grnFecMesFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setGrnFecDiaFin(BigDecimal grnFecDiaFin) {
        this.grnFecDiaFin = grnFecDiaFin;
    }

    public BigDecimal getGrnFecDiaFin() {
        return this.grnFecDiaFin;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnFecUltValua(String grnFecUltValua) {
        this.grnFecUltValua = grnFecUltValua;
    }

    public String getGrnFecUltValua() {
        return this.grnFecUltValua;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setGrnTexGarantia(Long grnTexGarantia) {
        this.grnTexGarantia = grnTexGarantia;
    }

    public Long getGrnTexGarantia() {
        return this.grnTexGarantia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnTexComentario(String grnTexComentario) {
        this.grnTexComentario = grnTexComentario;
    }

    public String getGrnTexComentario() {
        return this.grnTexComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnCveStatus(String grnCveStatus) {
        this.grnCveStatus = grnCveStatus;
    }

    public String getGrnCveStatus() {
        return this.grnCveStatus;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setGrnImpNumerario(BigDecimal grnImpNumerario) {
        this.grnImpNumerario = grnImpNumerario;
    }

    public BigDecimal getGrnImpNumerario() {
        return this.grnImpNumerario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setGrnFechNumerario(String grnFechNumerario) {
        this.grnFechNumerario = grnFechNumerario;
    }

    public String getGrnFechNumerario() {
        return this.grnFechNumerario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM GARANTIAH ";

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
        String sql = "SELECT * FROM GARANTIAH ";

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

        if (this.getGrnCveValores() != null && this.getGrnCveValores().longValue() == -999) {
            conditions += " AND GRN_CVE_VALORES IS NULL";
        } else if (this.getGrnCveValores() != null) {
            conditions += " AND GRN_CVE_VALORES = ?";
            values.add(this.getGrnCveValores());
        }

        if (this.getGrnCveOtros() != null && this.getGrnCveOtros().longValue() == -999) {
            conditions += " AND GRN_CVE_OTROS IS NULL";
        } else if (this.getGrnCveOtros() != null) {
            conditions += " AND GRN_CVE_OTROS = ?";
            values.add(this.getGrnCveOtros());
        }

        if (this.getGrnCveInmuebles() != null && this.getGrnCveInmuebles().longValue() == -999) {
            conditions += " AND GRN_CVE_INMUEBLES IS NULL";
        } else if (this.getGrnCveInmuebles() != null) {
            conditions += " AND GRN_CVE_INMUEBLES = ?";
            values.add(this.getGrnCveInmuebles());
        }

        if (this.getGrnCveMuebles() != null && this.getGrnCveMuebles().longValue() == -999) {
            conditions += " AND GRN_CVE_MUEBLES IS NULL";
        } else if (this.getGrnCveMuebles() != null) {
            conditions += " AND GRN_CVE_MUEBLES = ?";
            values.add(this.getGrnCveMuebles());
        }

        if (this.getGrnCveRevalua() != null && this.getGrnCveRevalua().longValue() == -999) {
            conditions += " AND GRN_CVE_REVALUA IS NULL";
        } else if (this.getGrnCveRevalua() != null) {
            conditions += " AND GRN_CVE_REVALUA = ?";
            values.add(this.getGrnCveRevalua());
        }

        if (this.getGrnCveNumerario() != null && this.getGrnCveNumerario().longValue() == -999) {
            conditions += " AND GRN_CVE_NUMERARIO IS NULL";
        } else if (this.getGrnCveNumerario() != null) {
            conditions += " AND GRN_CVE_NUMERARIO = ?";
            values.add(this.getGrnCveNumerario());
        }

        if (this.getGrnImpGaranti() != null && this.getGrnImpGaranti().longValue() == -999) {
            conditions += " AND GRN_IMP_GARANTI IS NULL";
        } else if (this.getGrnImpGaranti() != null) {
            conditions += " AND GRN_IMP_GARANTI = ?";
            values.add(this.getGrnImpGaranti());
        }

        if (this.getGrnImpGarantizad() != null && this.getGrnImpGarantizad().longValue() == -999) {
            conditions += " AND GRN_IMP_GARANTIZAD IS NULL";
        } else if (this.getGrnImpGarantizad() != null) {
            conditions += " AND GRN_IMP_GARANTIZAD = ?";
            values.add(this.getGrnImpGarantizad());
        }

        if (this.getGrnImpUltValua() != null && this.getGrnImpUltValua().longValue() == -999) {
            conditions += " AND GRN_IMP_ULT_VALUA IS NULL";
        } else if (this.getGrnImpUltValua() != null) {
            conditions += " AND GRN_IMP_ULT_VALUA = ?";
            values.add(this.getGrnImpUltValua());
        }

        if (this.getGrnCvePerValua() != null && "null".equals(this.getGrnCvePerValua())) {
            conditions += " AND GRN_CVE_PER_VALUA IS NULL";
        } else if (this.getGrnCvePerValua() != null) {
            conditions += " AND GRN_CVE_PER_VALUA = ?";
            values.add(this.getGrnCvePerValua());
        }

        if (this.getGrnFecAnoInicio() != null && this.getGrnFecAnoInicio().longValue() == -999) {
            conditions += " AND GRN_FEC_ANO_INICIO IS NULL";
        } else if (this.getGrnFecAnoInicio() != null) {
            conditions += " AND GRN_FEC_ANO_INICIO = ?";
            values.add(this.getGrnFecAnoInicio());
        }

        if (this.getGrnFecDiaInicio() != null && this.getGrnFecDiaInicio().longValue() == -999) {
            conditions += " AND GRN_FEC_DIA_INICIO IS NULL";
        } else if (this.getGrnFecDiaInicio() != null) {
            conditions += " AND GRN_FEC_DIA_INICIO = ?";
            values.add(this.getGrnFecDiaInicio());
        }

        if (this.getGrnFecMesInicio() != null && this.getGrnFecMesInicio().longValue() == -999) {
            conditions += " AND GRN_FEC_MES_INICIO IS NULL";
        } else if (this.getGrnFecMesInicio() != null) {
            conditions += " AND GRN_FEC_MES_INICIO = ?";
            values.add(this.getGrnFecMesInicio());
        }

        if (this.getGrnFecAnoFin() != null && this.getGrnFecAnoFin().longValue() == -999) {
            conditions += " AND GRN_FEC_ANO_FIN IS NULL";
        } else if (this.getGrnFecAnoFin() != null) {
            conditions += " AND GRN_FEC_ANO_FIN = ?";
            values.add(this.getGrnFecAnoFin());
        }

        if (this.getGrnFecMesFin() != null && this.getGrnFecMesFin().longValue() == -999) {
            conditions += " AND GRN_FEC_MES_FIN IS NULL";
        } else if (this.getGrnFecMesFin() != null) {
            conditions += " AND GRN_FEC_MES_FIN = ?";
            values.add(this.getGrnFecMesFin());
        }

        if (this.getGrnFecDiaFin() != null && this.getGrnFecDiaFin().longValue() == -999) {
            conditions += " AND GRN_FEC_DIA_FIN IS NULL";
        } else if (this.getGrnFecDiaFin() != null) {
            conditions += " AND GRN_FEC_DIA_FIN = ?";
            values.add(this.getGrnFecDiaFin());
        }

        if (this.getGrnFecUltValua() != null && "null".equals(this.getGrnFecUltValua())) {
            conditions += " AND GRN_FEC_ULT_VALUA IS NULL";
        } else if (this.getGrnFecUltValua() != null) {
            conditions += " AND GRN_FEC_ULT_VALUA = ?";
            values.add(this.getGrnFecUltValua());
        }

        if (this.getGrnTexGarantia() != null && this.getGrnTexGarantia() == -999) {
            conditions += " AND GRN_TEX_GARANTIA IS NULL";
        } else if (this.getGrnTexGarantia() != null) {
            conditions += " AND GRN_TEX_GARANTIA = ?";
            values.add(this.getGrnTexGarantia());
        }

        if (this.getGrnTexComentario() != null && "null".equals(this.getGrnTexComentario())) {
            conditions += " AND GRN_TEX_COMENTARIO IS NULL";
        } else if (this.getGrnTexComentario() != null) {
            conditions += " AND GRN_TEX_COMENTARIO = ?";
            values.add(this.getGrnTexComentario());
        }

        if (this.getGrnCveStatus() != null && "null".equals(this.getGrnCveStatus())) {
            conditions += " AND GRN_CVE_STATUS IS NULL";
        } else if (this.getGrnCveStatus() != null) {
            conditions += " AND GRN_CVE_STATUS = ?";
            values.add(this.getGrnCveStatus());
        }

        if (this.getGrnImpNumerario() != null && this.getGrnImpNumerario().longValue() == -999) {
            conditions += " AND GRN_IMP_NUMERARIO IS NULL";
        } else if (this.getGrnImpNumerario() != null) {
            conditions += " AND GRN_IMP_NUMERARIO = ?";
            values.add(this.getGrnImpNumerario());
        }

        if (this.getGrnFechNumerario() != null && "null".equals(this.getGrnFechNumerario())) {
            conditions += " AND GRN_FECH_NUMERARIO IS NULL";
        } else if (this.getGrnFechNumerario() != null) {
            conditions += " AND GRN_FECH_NUMERARIO = ?";
            values.add(this.getGrnFechNumerario());
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
        String sql = "UPDATE GARANTIAH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND GRN_NUM_CONTRATO = ?";
        pkValues.add(this.getGrnNumContrato());
        conditions += " AND GRN_SUB_CONTRATO = ?";
        pkValues.add(this.getGrnSubContrato());
        fields += " GRN_CVE_VALORES = ?, ";
        values.add(this.getGrnCveValores());
        fields += " GRN_CVE_OTROS = ?, ";
        values.add(this.getGrnCveOtros());
        fields += " GRN_CVE_INMUEBLES = ?, ";
        values.add(this.getGrnCveInmuebles());
        fields += " GRN_CVE_MUEBLES = ?, ";
        values.add(this.getGrnCveMuebles());
        fields += " GRN_CVE_REVALUA = ?, ";
        values.add(this.getGrnCveRevalua());
        fields += " GRN_CVE_NUMERARIO = ?, ";
        values.add(this.getGrnCveNumerario());
        fields += " GRN_IMP_GARANTI = ?, ";
        values.add(this.getGrnImpGaranti());
        fields += " GRN_IMP_GARANTIZAD = ?, ";
        values.add(this.getGrnImpGarantizad());
        fields += " GRN_IMP_ULT_VALUA = ?, ";
        values.add(this.getGrnImpUltValua());
        fields += " GRN_CVE_PER_VALUA = ?, ";
        values.add(this.getGrnCvePerValua());
        fields += " GRN_FEC_ANO_INICIO = ?, ";
        values.add(this.getGrnFecAnoInicio());
        fields += " GRN_FEC_DIA_INICIO = ?, ";
        values.add(this.getGrnFecDiaInicio());
        fields += " GRN_FEC_MES_INICIO = ?, ";
        values.add(this.getGrnFecMesInicio());
        fields += " GRN_FEC_ANO_FIN = ?, ";
        values.add(this.getGrnFecAnoFin());
        fields += " GRN_FEC_MES_FIN = ?, ";
        values.add(this.getGrnFecMesFin());
        fields += " GRN_FEC_DIA_FIN = ?, ";
        values.add(this.getGrnFecDiaFin());
        fields += " GRN_FEC_ULT_VALUA = ?, ";
        values.add(this.getGrnFecUltValua());
        fields += " GRN_TEX_GARANTIA = ?, ";
        values.add(this.getGrnTexGarantia());
        fields += " GRN_TEX_COMENTARIO = ?, ";
        values.add(this.getGrnTexComentario());
        fields += " GRN_CVE_STATUS = ?, ";
        values.add(this.getGrnCveStatus());
        fields += " GRN_IMP_NUMERARIO = ?, ";
        values.add(this.getGrnImpNumerario());
        fields += " GRN_FECH_NUMERARIO = ?, ";
        values.add(this.getGrnFechNumerario());
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
        String sql = "INSERT INTO GARANTIAH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", GRN_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getGrnNumContrato());

        fields += ", GRN_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getGrnSubContrato());

        fields += ", GRN_CVE_VALORES";
        fieldValues += ", ?";
        values.add(this.getGrnCveValores());

        fields += ", GRN_CVE_OTROS";
        fieldValues += ", ?";
        values.add(this.getGrnCveOtros());

        fields += ", GRN_CVE_INMUEBLES";
        fieldValues += ", ?";
        values.add(this.getGrnCveInmuebles());

        fields += ", GRN_CVE_MUEBLES";
        fieldValues += ", ?";
        values.add(this.getGrnCveMuebles());

        fields += ", GRN_CVE_REVALUA";
        fieldValues += ", ?";
        values.add(this.getGrnCveRevalua());

        fields += ", GRN_CVE_NUMERARIO";
        fieldValues += ", ?";
        values.add(this.getGrnCveNumerario());

        fields += ", GRN_IMP_GARANTI";
        fieldValues += ", ?";
        values.add(this.getGrnImpGaranti());

        fields += ", GRN_IMP_GARANTIZAD";
        fieldValues += ", ?";
        values.add(this.getGrnImpGarantizad());

        fields += ", GRN_IMP_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrnImpUltValua());

        fields += ", GRN_CVE_PER_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrnCvePerValua());

        fields += ", GRN_FEC_ANO_INICIO";
        fieldValues += ", ?";
        values.add(this.getGrnFecAnoInicio());

        fields += ", GRN_FEC_DIA_INICIO";
        fieldValues += ", ?";
        values.add(this.getGrnFecDiaInicio());

        fields += ", GRN_FEC_MES_INICIO";
        fieldValues += ", ?";
        values.add(this.getGrnFecMesInicio());

        fields += ", GRN_FEC_ANO_FIN";
        fieldValues += ", ?";
        values.add(this.getGrnFecAnoFin());

        fields += ", GRN_FEC_MES_FIN";
        fieldValues += ", ?";
        values.add(this.getGrnFecMesFin());

        fields += ", GRN_FEC_DIA_FIN";
        fieldValues += ", ?";
        values.add(this.getGrnFecDiaFin());

        fields += ", GRN_FEC_ULT_VALUA";
        fieldValues += ", ?";
        values.add(this.getGrnFecUltValua());

        fields += ", GRN_TEX_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getGrnTexGarantia());

        fields += ", GRN_TEX_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getGrnTexComentario());

        fields += ", GRN_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getGrnCveStatus());

        fields += ", GRN_IMP_NUMERARIO";
        fieldValues += ", ?";
        values.add(this.getGrnImpNumerario());

        fields += ", GRN_FECH_NUMERARIO";
        fieldValues += ", ?";
        values.add(this.getGrnFechNumerario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM GARANTIAH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND GRN_NUM_CONTRATO = ?";
        values.add(this.getGrnNumContrato());
        conditions += " AND GRN_SUB_CONTRATO = ?";
        values.add(this.getGrnSubContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Garantiah instance = (Garantiah) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getGrnNumContrato().equals(instance.getGrnNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getGrnSubContrato().equals(instance.getGrnSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCveValores().equals(instance.getGrnCveValores()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCveOtros().equals(instance.getGrnCveOtros()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCveInmuebles().equals(instance.getGrnCveInmuebles()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCveMuebles().equals(instance.getGrnCveMuebles()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCveRevalua().equals(instance.getGrnCveRevalua()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCveNumerario().equals(instance.getGrnCveNumerario()))
            equalObjects = false;
        if (equalObjects && !this.getGrnImpGaranti().equals(instance.getGrnImpGaranti()))
            equalObjects = false;
        if (equalObjects && !this.getGrnImpGarantizad().equals(instance.getGrnImpGarantizad()))
            equalObjects = false;
        if (equalObjects && !this.getGrnImpUltValua().equals(instance.getGrnImpUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCvePerValua().equals(instance.getGrnCvePerValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrnFecAnoInicio().equals(instance.getGrnFecAnoInicio()))
            equalObjects = false;
        if (equalObjects && !this.getGrnFecDiaInicio().equals(instance.getGrnFecDiaInicio()))
            equalObjects = false;
        if (equalObjects && !this.getGrnFecMesInicio().equals(instance.getGrnFecMesInicio()))
            equalObjects = false;
        if (equalObjects && !this.getGrnFecAnoFin().equals(instance.getGrnFecAnoFin()))
            equalObjects = false;
        if (equalObjects && !this.getGrnFecMesFin().equals(instance.getGrnFecMesFin()))
            equalObjects = false;
        if (equalObjects && !this.getGrnFecDiaFin().equals(instance.getGrnFecDiaFin()))
            equalObjects = false;
        if (equalObjects && !this.getGrnFecUltValua().equals(instance.getGrnFecUltValua()))
            equalObjects = false;
        if (equalObjects && !this.getGrnTexGarantia().equals(instance.getGrnTexGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getGrnTexComentario().equals(instance.getGrnTexComentario()))
            equalObjects = false;
        if (equalObjects && !this.getGrnCveStatus().equals(instance.getGrnCveStatus()))
            equalObjects = false;
        if (equalObjects && !this.getGrnImpNumerario().equals(instance.getGrnImpNumerario()))
            equalObjects = false;
        if (equalObjects && !this.getGrnFechNumerario().equals(instance.getGrnFechNumerario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Garantiah result = new Garantiah();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setGrnNumContrato((BigDecimal) objectData.getData("GRN_NUM_CONTRATO"));
        result.setGrnSubContrato((BigDecimal) objectData.getData("GRN_SUB_CONTRATO"));
        result.setGrnCveValores((BigDecimal) objectData.getData("GRN_CVE_VALORES"));
        result.setGrnCveOtros((BigDecimal) objectData.getData("GRN_CVE_OTROS"));
        result.setGrnCveInmuebles((BigDecimal) objectData.getData("GRN_CVE_INMUEBLES"));
        result.setGrnCveMuebles((BigDecimal) objectData.getData("GRN_CVE_MUEBLES"));
        result.setGrnCveRevalua((BigDecimal) objectData.getData("GRN_CVE_REVALUA"));
        result.setGrnCveNumerario((BigDecimal) objectData.getData("GRN_CVE_NUMERARIO"));
        result.setGrnImpGaranti((BigDecimal) objectData.getData("GRN_IMP_GARANTI"));
        result.setGrnImpGarantizad((BigDecimal) objectData.getData("GRN_IMP_GARANTIZAD"));
        result.setGrnImpUltValua((BigDecimal) objectData.getData("GRN_IMP_ULT_VALUA"));
        result.setGrnCvePerValua((String) objectData.getData("GRN_CVE_PER_VALUA"));
        result.setGrnFecAnoInicio((BigDecimal) objectData.getData("GRN_FEC_ANO_INICIO"));
        result.setGrnFecDiaInicio((BigDecimal) objectData.getData("GRN_FEC_DIA_INICIO"));
        result.setGrnFecMesInicio((BigDecimal) objectData.getData("GRN_FEC_MES_INICIO"));
        result.setGrnFecAnoFin((BigDecimal) objectData.getData("GRN_FEC_ANO_FIN"));
        result.setGrnFecMesFin((BigDecimal) objectData.getData("GRN_FEC_MES_FIN"));
        result.setGrnFecDiaFin((BigDecimal) objectData.getData("GRN_FEC_DIA_FIN"));
        result.setGrnFecUltValua((String) objectData.getData("GRN_FEC_ULT_VALUA"));
        result.setGrnTexGarantia((Long) objectData.getData("GRN_TEX_GARANTIA"));
        result.setGrnTexComentario((String) objectData.getData("GRN_TEX_COMENTARIO"));
        result.setGrnCveStatus((String) objectData.getData("GRN_CVE_STATUS"));
        result.setGrnImpNumerario((BigDecimal) objectData.getData("GRN_IMP_NUMERARIO"));
        result.setGrnFechNumerario((String) objectData.getData("GRN_FECH_NUMERARIO"));

        return result;

    }

}
