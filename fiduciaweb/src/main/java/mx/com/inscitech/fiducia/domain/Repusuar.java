package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REPUSUAR_PK", columns = { "REU_NUM_USUARIO", "REU_NUM_REPORTE" }, sequences = { "MANUAL" })
public class Repusuar extends DomainObject {

    BigDecimal reuNumUsuario = null;
    BigDecimal reuNumReporte = null;
    String reuNomUsuario = null;
    String reuCvePerEnvif = null;
    BigDecimal reuCveImpresion = null;
    BigDecimal reuImpAcuRepor = null;
    BigDecimal reuAnoPrxEmis = null;
    BigDecimal reuMesPrxEmis = null;
    BigDecimal reuDiaPrxEmis = null;
    BigDecimal reuAnoAltaReg = null;
    BigDecimal reuMesAltaReg = null;
    BigDecimal reuDiaAltReg = null;
    BigDecimal reuAnoUltMod = null;
    BigDecimal reuMesUltMod = null;
    BigDecimal reuDiaUltMod = null;
    String reuCveStRepusua = null;

    public Repusuar() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setReuNumUsuario(BigDecimal reuNumUsuario) {
        this.reuNumUsuario = reuNumUsuario;
    }

    public BigDecimal getReuNumUsuario() {
        return this.reuNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setReuNumReporte(BigDecimal reuNumReporte) {
        this.reuNumReporte = reuNumReporte;
    }

    public BigDecimal getReuNumReporte() {
        return this.reuNumReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setReuNomUsuario(String reuNomUsuario) {
        this.reuNomUsuario = reuNomUsuario;
    }

    public String getReuNomUsuario() {
        return this.reuNomUsuario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setReuCvePerEnvif(String reuCvePerEnvif) {
        this.reuCvePerEnvif = reuCvePerEnvif;
    }

    public String getReuCvePerEnvif() {
        return this.reuCvePerEnvif;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setReuCveImpresion(BigDecimal reuCveImpresion) {
        this.reuCveImpresion = reuCveImpresion;
    }

    public BigDecimal getReuCveImpresion() {
        return this.reuCveImpresion;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setReuImpAcuRepor(BigDecimal reuImpAcuRepor) {
        this.reuImpAcuRepor = reuImpAcuRepor;
    }

    public BigDecimal getReuImpAcuRepor() {
        return this.reuImpAcuRepor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setReuAnoPrxEmis(BigDecimal reuAnoPrxEmis) {
        this.reuAnoPrxEmis = reuAnoPrxEmis;
    }

    public BigDecimal getReuAnoPrxEmis() {
        return this.reuAnoPrxEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setReuMesPrxEmis(BigDecimal reuMesPrxEmis) {
        this.reuMesPrxEmis = reuMesPrxEmis;
    }

    public BigDecimal getReuMesPrxEmis() {
        return this.reuMesPrxEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setReuDiaPrxEmis(BigDecimal reuDiaPrxEmis) {
        this.reuDiaPrxEmis = reuDiaPrxEmis;
    }

    public BigDecimal getReuDiaPrxEmis() {
        return this.reuDiaPrxEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setReuAnoAltaReg(BigDecimal reuAnoAltaReg) {
        this.reuAnoAltaReg = reuAnoAltaReg;
    }

    public BigDecimal getReuAnoAltaReg() {
        return this.reuAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setReuMesAltaReg(BigDecimal reuMesAltaReg) {
        this.reuMesAltaReg = reuMesAltaReg;
    }

    public BigDecimal getReuMesAltaReg() {
        return this.reuMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setReuDiaAltReg(BigDecimal reuDiaAltReg) {
        this.reuDiaAltReg = reuDiaAltReg;
    }

    public BigDecimal getReuDiaAltReg() {
        return this.reuDiaAltReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setReuAnoUltMod(BigDecimal reuAnoUltMod) {
        this.reuAnoUltMod = reuAnoUltMod;
    }

    public BigDecimal getReuAnoUltMod() {
        return this.reuAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setReuMesUltMod(BigDecimal reuMesUltMod) {
        this.reuMesUltMod = reuMesUltMod;
    }

    public BigDecimal getReuMesUltMod() {
        return this.reuMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setReuDiaUltMod(BigDecimal reuDiaUltMod) {
        this.reuDiaUltMod = reuDiaUltMod;
    }

    public BigDecimal getReuDiaUltMod() {
        return this.reuDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setReuCveStRepusua(String reuCveStRepusua) {
        this.reuCveStRepusua = reuCveStRepusua;
    }

    public String getReuCveStRepusua() {
        return this.reuCveStRepusua;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REPUSUAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getReuNumUsuario() != null && this.getReuNumUsuario().longValue() == -999) {
            conditions += " AND REU_NUM_USUARIO IS NULL";
        } else if (this.getReuNumUsuario() != null) {
            conditions += " AND REU_NUM_USUARIO = ?";
            values.add(this.getReuNumUsuario());
        }

        if (this.getReuNumReporte() != null && this.getReuNumReporte().longValue() == -999) {
            conditions += " AND REU_NUM_REPORTE IS NULL";
        } else if (this.getReuNumReporte() != null) {
            conditions += " AND REU_NUM_REPORTE = ?";
            values.add(this.getReuNumReporte());
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
        String sql = "SELECT * FROM REPUSUAR ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getReuNumUsuario() != null && this.getReuNumUsuario().longValue() == -999) {
            conditions += " AND REU_NUM_USUARIO IS NULL";
        } else if (this.getReuNumUsuario() != null) {
            conditions += " AND REU_NUM_USUARIO = ?";
            values.add(this.getReuNumUsuario());
        }

        if (this.getReuNumReporte() != null && this.getReuNumReporte().longValue() == -999) {
            conditions += " AND REU_NUM_REPORTE IS NULL";
        } else if (this.getReuNumReporte() != null) {
            conditions += " AND REU_NUM_REPORTE = ?";
            values.add(this.getReuNumReporte());
        }

        if (this.getReuNomUsuario() != null && "null".equals(this.getReuNomUsuario())) {
            conditions += " AND REU_NOM_USUARIO IS NULL";
        } else if (this.getReuNomUsuario() != null) {
            conditions += " AND REU_NOM_USUARIO = ?";
            values.add(this.getReuNomUsuario());
        }

        if (this.getReuCvePerEnvif() != null && "null".equals(this.getReuCvePerEnvif())) {
            conditions += " AND REU_CVE_PER_ENVIF IS NULL";
        } else if (this.getReuCvePerEnvif() != null) {
            conditions += " AND REU_CVE_PER_ENVIF = ?";
            values.add(this.getReuCvePerEnvif());
        }

        if (this.getReuCveImpresion() != null && this.getReuCveImpresion().longValue() == -999) {
            conditions += " AND REU_CVE_IMPRESION IS NULL";
        } else if (this.getReuCveImpresion() != null) {
            conditions += " AND REU_CVE_IMPRESION = ?";
            values.add(this.getReuCveImpresion());
        }

        if (this.getReuImpAcuRepor() != null && this.getReuImpAcuRepor().longValue() == -999) {
            conditions += " AND REU_IMP_ACU_REPOR IS NULL";
        } else if (this.getReuImpAcuRepor() != null) {
            conditions += " AND REU_IMP_ACU_REPOR = ?";
            values.add(this.getReuImpAcuRepor());
        }

        if (this.getReuAnoPrxEmis() != null && this.getReuAnoPrxEmis().longValue() == -999) {
            conditions += " AND REU_ANO_PRX_EMIS IS NULL";
        } else if (this.getReuAnoPrxEmis() != null) {
            conditions += " AND REU_ANO_PRX_EMIS = ?";
            values.add(this.getReuAnoPrxEmis());
        }

        if (this.getReuMesPrxEmis() != null && this.getReuMesPrxEmis().longValue() == -999) {
            conditions += " AND REU_MES_PRX_EMIS IS NULL";
        } else if (this.getReuMesPrxEmis() != null) {
            conditions += " AND REU_MES_PRX_EMIS = ?";
            values.add(this.getReuMesPrxEmis());
        }

        if (this.getReuDiaPrxEmis() != null && this.getReuDiaPrxEmis().longValue() == -999) {
            conditions += " AND REU_DIA_PRX_EMIS IS NULL";
        } else if (this.getReuDiaPrxEmis() != null) {
            conditions += " AND REU_DIA_PRX_EMIS = ?";
            values.add(this.getReuDiaPrxEmis());
        }

        if (this.getReuAnoAltaReg() != null && this.getReuAnoAltaReg().longValue() == -999) {
            conditions += " AND REU_ANO_ALTA_REG IS NULL";
        } else if (this.getReuAnoAltaReg() != null) {
            conditions += " AND REU_ANO_ALTA_REG = ?";
            values.add(this.getReuAnoAltaReg());
        }

        if (this.getReuMesAltaReg() != null && this.getReuMesAltaReg().longValue() == -999) {
            conditions += " AND REU_MES_ALTA_REG IS NULL";
        } else if (this.getReuMesAltaReg() != null) {
            conditions += " AND REU_MES_ALTA_REG = ?";
            values.add(this.getReuMesAltaReg());
        }

        if (this.getReuDiaAltReg() != null && this.getReuDiaAltReg().longValue() == -999) {
            conditions += " AND REU_DIA_ALT_REG IS NULL";
        } else if (this.getReuDiaAltReg() != null) {
            conditions += " AND REU_DIA_ALT_REG = ?";
            values.add(this.getReuDiaAltReg());
        }

        if (this.getReuAnoUltMod() != null && this.getReuAnoUltMod().longValue() == -999) {
            conditions += " AND REU_ANO_ULT_MOD IS NULL";
        } else if (this.getReuAnoUltMod() != null) {
            conditions += " AND REU_ANO_ULT_MOD = ?";
            values.add(this.getReuAnoUltMod());
        }

        if (this.getReuMesUltMod() != null && this.getReuMesUltMod().longValue() == -999) {
            conditions += " AND REU_MES_ULT_MOD IS NULL";
        } else if (this.getReuMesUltMod() != null) {
            conditions += " AND REU_MES_ULT_MOD = ?";
            values.add(this.getReuMesUltMod());
        }

        if (this.getReuDiaUltMod() != null && this.getReuDiaUltMod().longValue() == -999) {
            conditions += " AND REU_DIA_ULT_MOD IS NULL";
        } else if (this.getReuDiaUltMod() != null) {
            conditions += " AND REU_DIA_ULT_MOD = ?";
            values.add(this.getReuDiaUltMod());
        }

        if (this.getReuCveStRepusua() != null && "null".equals(this.getReuCveStRepusua())) {
            conditions += " AND REU_CVE_ST_REPUSUA IS NULL";
        } else if (this.getReuCveStRepusua() != null) {
            conditions += " AND REU_CVE_ST_REPUSUA = ?";
            values.add(this.getReuCveStRepusua());
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
        String sql = "UPDATE REPUSUAR SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REU_NUM_USUARIO = ?";
        pkValues.add(this.getReuNumUsuario());
        conditions += " AND REU_NUM_REPORTE = ?";
        pkValues.add(this.getReuNumReporte());
        fields += " REU_NOM_USUARIO = ?, ";
        values.add(this.getReuNomUsuario());
        fields += " REU_CVE_PER_ENVIF = ?, ";
        values.add(this.getReuCvePerEnvif());
        fields += " REU_CVE_IMPRESION = ?, ";
        values.add(this.getReuCveImpresion());
        fields += " REU_IMP_ACU_REPOR = ?, ";
        values.add(this.getReuImpAcuRepor());
        fields += " REU_ANO_PRX_EMIS = ?, ";
        values.add(this.getReuAnoPrxEmis());
        fields += " REU_MES_PRX_EMIS = ?, ";
        values.add(this.getReuMesPrxEmis());
        fields += " REU_DIA_PRX_EMIS = ?, ";
        values.add(this.getReuDiaPrxEmis());
        fields += " REU_ANO_ALTA_REG = ?, ";
        values.add(this.getReuAnoAltaReg());
        fields += " REU_MES_ALTA_REG = ?, ";
        values.add(this.getReuMesAltaReg());
        fields += " REU_DIA_ALT_REG = ?, ";
        values.add(this.getReuDiaAltReg());
        fields += " REU_ANO_ULT_MOD = ?, ";
        values.add(this.getReuAnoUltMod());
        fields += " REU_MES_ULT_MOD = ?, ";
        values.add(this.getReuMesUltMod());
        fields += " REU_DIA_ULT_MOD = ?, ";
        values.add(this.getReuDiaUltMod());
        fields += " REU_CVE_ST_REPUSUA = ?, ";
        values.add(this.getReuCveStRepusua());
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
        String sql = "INSERT INTO REPUSUAR ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REU_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getReuNumUsuario());

        fields += ", REU_NUM_REPORTE";
        fieldValues += ", ?";
        values.add(this.getReuNumReporte());

        fields += ", REU_NOM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getReuNomUsuario());

        fields += ", REU_CVE_PER_ENVIF";
        fieldValues += ", ?";
        values.add(this.getReuCvePerEnvif());

        fields += ", REU_CVE_IMPRESION";
        fieldValues += ", ?";
        values.add(this.getReuCveImpresion());

        fields += ", REU_IMP_ACU_REPOR";
        fieldValues += ", ?";
        values.add(this.getReuImpAcuRepor());

        fields += ", REU_ANO_PRX_EMIS";
        fieldValues += ", ?";
        values.add(this.getReuAnoPrxEmis());

        fields += ", REU_MES_PRX_EMIS";
        fieldValues += ", ?";
        values.add(this.getReuMesPrxEmis());

        fields += ", REU_DIA_PRX_EMIS";
        fieldValues += ", ?";
        values.add(this.getReuDiaPrxEmis());

        fields += ", REU_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getReuAnoAltaReg());

        fields += ", REU_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getReuMesAltaReg());

        fields += ", REU_DIA_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getReuDiaAltReg());

        fields += ", REU_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getReuAnoUltMod());

        fields += ", REU_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getReuMesUltMod());

        fields += ", REU_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getReuDiaUltMod());

        fields += ", REU_CVE_ST_REPUSUA";
        fieldValues += ", ?";
        values.add(this.getReuCveStRepusua());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REPUSUAR WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REU_NUM_USUARIO = ?";
        values.add(this.getReuNumUsuario());
        conditions += " AND REU_NUM_REPORTE = ?";
        values.add(this.getReuNumReporte());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Repusuar instance = (Repusuar) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getReuNumUsuario().equals(instance.getReuNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getReuNumReporte().equals(instance.getReuNumReporte()))
            equalObjects = false;
        if (equalObjects && !this.getReuNomUsuario().equals(instance.getReuNomUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getReuCvePerEnvif().equals(instance.getReuCvePerEnvif()))
            equalObjects = false;
        if (equalObjects && !this.getReuCveImpresion().equals(instance.getReuCveImpresion()))
            equalObjects = false;
        if (equalObjects && !this.getReuImpAcuRepor().equals(instance.getReuImpAcuRepor()))
            equalObjects = false;
        if (equalObjects && !this.getReuAnoPrxEmis().equals(instance.getReuAnoPrxEmis()))
            equalObjects = false;
        if (equalObjects && !this.getReuMesPrxEmis().equals(instance.getReuMesPrxEmis()))
            equalObjects = false;
        if (equalObjects && !this.getReuDiaPrxEmis().equals(instance.getReuDiaPrxEmis()))
            equalObjects = false;
        if (equalObjects && !this.getReuAnoAltaReg().equals(instance.getReuAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getReuMesAltaReg().equals(instance.getReuMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getReuDiaAltReg().equals(instance.getReuDiaAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getReuAnoUltMod().equals(instance.getReuAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getReuMesUltMod().equals(instance.getReuMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getReuDiaUltMod().equals(instance.getReuDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getReuCveStRepusua().equals(instance.getReuCveStRepusua()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Repusuar result = new Repusuar();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setReuNumUsuario((BigDecimal) objectData.getData("REU_NUM_USUARIO"));
        result.setReuNumReporte((BigDecimal) objectData.getData("REU_NUM_REPORTE"));
        result.setReuNomUsuario((String) objectData.getData("REU_NOM_USUARIO"));
        result.setReuCvePerEnvif((String) objectData.getData("REU_CVE_PER_ENVIF"));
        result.setReuCveImpresion((BigDecimal) objectData.getData("REU_CVE_IMPRESION"));
        result.setReuImpAcuRepor((BigDecimal) objectData.getData("REU_IMP_ACU_REPOR"));
        result.setReuAnoPrxEmis((BigDecimal) objectData.getData("REU_ANO_PRX_EMIS"));
        result.setReuMesPrxEmis((BigDecimal) objectData.getData("REU_MES_PRX_EMIS"));
        result.setReuDiaPrxEmis((BigDecimal) objectData.getData("REU_DIA_PRX_EMIS"));
        result.setReuAnoAltaReg((BigDecimal) objectData.getData("REU_ANO_ALTA_REG"));
        result.setReuMesAltaReg((BigDecimal) objectData.getData("REU_MES_ALTA_REG"));
        result.setReuDiaAltReg((BigDecimal) objectData.getData("REU_DIA_ALT_REG"));
        result.setReuAnoUltMod((BigDecimal) objectData.getData("REU_ANO_ULT_MOD"));
        result.setReuMesUltMod((BigDecimal) objectData.getData("REU_MES_ULT_MOD"));
        result.setReuDiaUltMod((BigDecimal) objectData.getData("REU_DIA_ULT_MOD"));
        result.setReuCveStRepusua((String) objectData.getData("REU_CVE_ST_REPUSUA"));

        return result;

    }

}
