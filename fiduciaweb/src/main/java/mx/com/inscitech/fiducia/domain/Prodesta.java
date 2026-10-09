package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PRODESTA_PK", columns = { "PRO_NUM_PROD_ESTA" }, sequences = { "MAX" })
public class Prodesta extends DomainObject {

    BigDecimal proNumProdEsta = null;
    String proNomProdEsta = null;
    String proTipoNegocio = null;
    String proClasifProd = null;
    String proRamaProducto = null;
    BigDecimal proCtamResult = null;
    BigDecimal proSctaResult = null;
    BigDecimal proSsctaResult = null;
    BigDecimal proSssctaResult = null;
    BigDecimal proCtamAcept = null;
    BigDecimal proSctaAcept = null;
    BigDecimal proSsctaAcept = null;
    BigDecimal proSssctaAcept = null;
    BigDecimal proCtamServic = null;
    BigDecimal proSctaServic = null;
    BigDecimal proSsctaServic = null;
    BigDecimal proSssctaServic = null;
    BigDecimal proCveSujeto30 = null;
    BigDecimal proCveSujeto28 = null;
    String proCveTipClient = null;
    String proCveTipPers = null;
    String proCvePriTitu = null;
    BigDecimal proNumMesResg = null;
    BigDecimal proImpMinApert = null;
    BigDecimal proImpHonAcepta = null;
    BigDecimal proImpHonManejo = null;
    BigDecimal proAnoAltaReg = null;
    BigDecimal proMesAltaReg = null;
    BigDecimal proDiaAltaReg = null;
    BigDecimal proAnoUltMod = null;
    BigDecimal proMesUltMod = null;
    BigDecimal proDiaUltMod = null;
    String proCveStProdest = null;

    public Prodesta() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProNumProdEsta(BigDecimal proNumProdEsta) {
        this.proNumProdEsta = proNumProdEsta;
    }

    public BigDecimal getProNumProdEsta() {
        return this.proNumProdEsta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setProNomProdEsta(String proNomProdEsta) {
        this.proNomProdEsta = proNomProdEsta;
    }

    public String getProNomProdEsta() {
        return this.proNomProdEsta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setProTipoNegocio(String proTipoNegocio) {
        this.proTipoNegocio = proTipoNegocio;
    }

    public String getProTipoNegocio() {
        return this.proTipoNegocio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setProClasifProd(String proClasifProd) {
        this.proClasifProd = proClasifProd;
    }

    public String getProClasifProd() {
        return this.proClasifProd;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setProRamaProducto(String proRamaProducto) {
        this.proRamaProducto = proRamaProducto;
    }

    public String getProRamaProducto() {
        return this.proRamaProducto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProCtamResult(BigDecimal proCtamResult) {
        this.proCtamResult = proCtamResult;
    }

    public BigDecimal getProCtamResult() {
        return this.proCtamResult;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProSctaResult(BigDecimal proSctaResult) {
        this.proSctaResult = proSctaResult;
    }

    public BigDecimal getProSctaResult() {
        return this.proSctaResult;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProSsctaResult(BigDecimal proSsctaResult) {
        this.proSsctaResult = proSsctaResult;
    }

    public BigDecimal getProSsctaResult() {
        return this.proSsctaResult;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProSssctaResult(BigDecimal proSssctaResult) {
        this.proSssctaResult = proSssctaResult;
    }

    public BigDecimal getProSssctaResult() {
        return this.proSssctaResult;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProCtamAcept(BigDecimal proCtamAcept) {
        this.proCtamAcept = proCtamAcept;
    }

    public BigDecimal getProCtamAcept() {
        return this.proCtamAcept;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProSctaAcept(BigDecimal proSctaAcept) {
        this.proSctaAcept = proSctaAcept;
    }

    public BigDecimal getProSctaAcept() {
        return this.proSctaAcept;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProSsctaAcept(BigDecimal proSsctaAcept) {
        this.proSsctaAcept = proSsctaAcept;
    }

    public BigDecimal getProSsctaAcept() {
        return this.proSsctaAcept;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProSssctaAcept(BigDecimal proSssctaAcept) {
        this.proSssctaAcept = proSssctaAcept;
    }

    public BigDecimal getProSssctaAcept() {
        return this.proSssctaAcept;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProCtamServic(BigDecimal proCtamServic) {
        this.proCtamServic = proCtamServic;
    }

    public BigDecimal getProCtamServic() {
        return this.proCtamServic;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProSctaServic(BigDecimal proSctaServic) {
        this.proSctaServic = proSctaServic;
    }

    public BigDecimal getProSctaServic() {
        return this.proSctaServic;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProSsctaServic(BigDecimal proSsctaServic) {
        this.proSsctaServic = proSsctaServic;
    }

    public BigDecimal getProSsctaServic() {
        return this.proSsctaServic;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProSssctaServic(BigDecimal proSssctaServic) {
        this.proSssctaServic = proSssctaServic;
    }

    public BigDecimal getProSssctaServic() {
        return this.proSssctaServic;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProCveSujeto30(BigDecimal proCveSujeto30) {
        this.proCveSujeto30 = proCveSujeto30;
    }

    public BigDecimal getProCveSujeto30() {
        return this.proCveSujeto30;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setProCveSujeto28(BigDecimal proCveSujeto28) {
        this.proCveSujeto28 = proCveSujeto28;
    }

    public BigDecimal getProCveSujeto28() {
        return this.proCveSujeto28;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setProCveTipClient(String proCveTipClient) {
        this.proCveTipClient = proCveTipClient;
    }

    public String getProCveTipClient() {
        return this.proCveTipClient;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setProCveTipPers(String proCveTipPers) {
        this.proCveTipPers = proCveTipPers;
    }

    public String getProCveTipPers() {
        return this.proCveTipPers;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setProCvePriTitu(String proCvePriTitu) {
        this.proCvePriTitu = proCvePriTitu;
    }

    public String getProCvePriTitu() {
        return this.proCvePriTitu;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setProNumMesResg(BigDecimal proNumMesResg) {
        this.proNumMesResg = proNumMesResg;
    }

    public BigDecimal getProNumMesResg() {
        return this.proNumMesResg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setProImpMinApert(BigDecimal proImpMinApert) {
        this.proImpMinApert = proImpMinApert;
    }

    public BigDecimal getProImpMinApert() {
        return this.proImpMinApert;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setProImpHonAcepta(BigDecimal proImpHonAcepta) {
        this.proImpHonAcepta = proImpHonAcepta;
    }

    public BigDecimal getProImpHonAcepta() {
        return this.proImpHonAcepta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setProImpHonManejo(BigDecimal proImpHonManejo) {
        this.proImpHonManejo = proImpHonManejo;
    }

    public BigDecimal getProImpHonManejo() {
        return this.proImpHonManejo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setProAnoAltaReg(BigDecimal proAnoAltaReg) {
        this.proAnoAltaReg = proAnoAltaReg;
    }

    public BigDecimal getProAnoAltaReg() {
        return this.proAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setProMesAltaReg(BigDecimal proMesAltaReg) {
        this.proMesAltaReg = proMesAltaReg;
    }

    public BigDecimal getProMesAltaReg() {
        return this.proMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setProDiaAltaReg(BigDecimal proDiaAltaReg) {
        this.proDiaAltaReg = proDiaAltaReg;
    }

    public BigDecimal getProDiaAltaReg() {
        return this.proDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setProAnoUltMod(BigDecimal proAnoUltMod) {
        this.proAnoUltMod = proAnoUltMod;
    }

    public BigDecimal getProAnoUltMod() {
        return this.proAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setProMesUltMod(BigDecimal proMesUltMod) {
        this.proMesUltMod = proMesUltMod;
    }

    public BigDecimal getProMesUltMod() {
        return this.proMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setProDiaUltMod(BigDecimal proDiaUltMod) {
        this.proDiaUltMod = proDiaUltMod;
    }

    public BigDecimal getProDiaUltMod() {
        return this.proDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setProCveStProdest(String proCveStProdest) {
        this.proCveStProdest = proCveStProdest;
    }

    public String getProCveStProdest() {
        return this.proCveStProdest;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PRODESTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getProNumProdEsta() != null && this.getProNumProdEsta().longValue() == -999) {
            conditions += " AND PRO_NUM_PROD_ESTA IS NULL";
        } else if (this.getProNumProdEsta() != null) {
            conditions += " AND PRO_NUM_PROD_ESTA = ?";
            values.add(this.getProNumProdEsta());
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
        String sql = "SELECT * FROM PRODESTA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getProNumProdEsta() != null && this.getProNumProdEsta().longValue() == -999) {
            conditions += " AND PRO_NUM_PROD_ESTA IS NULL";
        } else if (this.getProNumProdEsta() != null) {
            conditions += " AND PRO_NUM_PROD_ESTA = ?";
            values.add(this.getProNumProdEsta());
        }

        if (this.getProNomProdEsta() != null && "null".equals(this.getProNomProdEsta())) {
            conditions += " AND PRO_NOM_PROD_ESTA IS NULL";
        } else if (this.getProNomProdEsta() != null) {
            conditions += " AND PRO_NOM_PROD_ESTA = ?";
            values.add(this.getProNomProdEsta());
        }

        if (this.getProTipoNegocio() != null && "null".equals(this.getProTipoNegocio())) {
            conditions += " AND PRO_TIPO_NEGOCIO IS NULL";
        } else if (this.getProTipoNegocio() != null) {
            conditions += " AND PRO_TIPO_NEGOCIO = ?";
            values.add(this.getProTipoNegocio());
        }

        if (this.getProClasifProd() != null && "null".equals(this.getProClasifProd())) {
            conditions += " AND PRO_CLASIF_PROD IS NULL";
        } else if (this.getProClasifProd() != null) {
            conditions += " AND PRO_CLASIF_PROD = ?";
            values.add(this.getProClasifProd());
        }

        if (this.getProRamaProducto() != null && "null".equals(this.getProRamaProducto())) {
            conditions += " AND PRO_RAMA_PRODUCTO IS NULL";
        } else if (this.getProRamaProducto() != null) {
            conditions += " AND PRO_RAMA_PRODUCTO = ?";
            values.add(this.getProRamaProducto());
        }

        if (this.getProCtamResult() != null && this.getProCtamResult().longValue() == -999) {
            conditions += " AND PRO_CTAM_RESULT IS NULL";
        } else if (this.getProCtamResult() != null) {
            conditions += " AND PRO_CTAM_RESULT = ?";
            values.add(this.getProCtamResult());
        }

        if (this.getProSctaResult() != null && this.getProSctaResult().longValue() == -999) {
            conditions += " AND PRO_SCTA_RESULT IS NULL";
        } else if (this.getProSctaResult() != null) {
            conditions += " AND PRO_SCTA_RESULT = ?";
            values.add(this.getProSctaResult());
        }

        if (this.getProSsctaResult() != null && this.getProSsctaResult().longValue() == -999) {
            conditions += " AND PRO_SSCTA_RESULT IS NULL";
        } else if (this.getProSsctaResult() != null) {
            conditions += " AND PRO_SSCTA_RESULT = ?";
            values.add(this.getProSsctaResult());
        }

        if (this.getProSssctaResult() != null && this.getProSssctaResult().longValue() == -999) {
            conditions += " AND PRO_SSSCTA_RESULT IS NULL";
        } else if (this.getProSssctaResult() != null) {
            conditions += " AND PRO_SSSCTA_RESULT = ?";
            values.add(this.getProSssctaResult());
        }

        if (this.getProCtamAcept() != null && this.getProCtamAcept().longValue() == -999) {
            conditions += " AND PRO_CTAM_ACEPT IS NULL";
        } else if (this.getProCtamAcept() != null) {
            conditions += " AND PRO_CTAM_ACEPT = ?";
            values.add(this.getProCtamAcept());
        }

        if (this.getProSctaAcept() != null && this.getProSctaAcept().longValue() == -999) {
            conditions += " AND PRO_SCTA_ACEPT IS NULL";
        } else if (this.getProSctaAcept() != null) {
            conditions += " AND PRO_SCTA_ACEPT = ?";
            values.add(this.getProSctaAcept());
        }

        if (this.getProSsctaAcept() != null && this.getProSsctaAcept().longValue() == -999) {
            conditions += " AND PRO_SSCTA_ACEPT IS NULL";
        } else if (this.getProSsctaAcept() != null) {
            conditions += " AND PRO_SSCTA_ACEPT = ?";
            values.add(this.getProSsctaAcept());
        }

        if (this.getProSssctaAcept() != null && this.getProSssctaAcept().longValue() == -999) {
            conditions += " AND PRO_SSSCTA_ACEPT IS NULL";
        } else if (this.getProSssctaAcept() != null) {
            conditions += " AND PRO_SSSCTA_ACEPT = ?";
            values.add(this.getProSssctaAcept());
        }

        if (this.getProCtamServic() != null && this.getProCtamServic().longValue() == -999) {
            conditions += " AND PRO_CTAM_SERVIC IS NULL";
        } else if (this.getProCtamServic() != null) {
            conditions += " AND PRO_CTAM_SERVIC = ?";
            values.add(this.getProCtamServic());
        }

        if (this.getProSctaServic() != null && this.getProSctaServic().longValue() == -999) {
            conditions += " AND PRO_SCTA_SERVIC IS NULL";
        } else if (this.getProSctaServic() != null) {
            conditions += " AND PRO_SCTA_SERVIC = ?";
            values.add(this.getProSctaServic());
        }

        if (this.getProSsctaServic() != null && this.getProSsctaServic().longValue() == -999) {
            conditions += " AND PRO_SSCTA_SERVIC IS NULL";
        } else if (this.getProSsctaServic() != null) {
            conditions += " AND PRO_SSCTA_SERVIC = ?";
            values.add(this.getProSsctaServic());
        }

        if (this.getProSssctaServic() != null && this.getProSssctaServic().longValue() == -999) {
            conditions += " AND PRO_SSSCTA_SERVIC IS NULL";
        } else if (this.getProSssctaServic() != null) {
            conditions += " AND PRO_SSSCTA_SERVIC = ?";
            values.add(this.getProSssctaServic());
        }

        if (this.getProCveSujeto30() != null && this.getProCveSujeto30().longValue() == -999) {
            conditions += " AND PRO_CVE_SUJETO_30 IS NULL";
        } else if (this.getProCveSujeto30() != null) {
            conditions += " AND PRO_CVE_SUJETO_30 = ?";
            values.add(this.getProCveSujeto30());
        }

        if (this.getProCveSujeto28() != null && this.getProCveSujeto28().longValue() == -999) {
            conditions += " AND PRO_CVE_SUJETO_28 IS NULL";
        } else if (this.getProCveSujeto28() != null) {
            conditions += " AND PRO_CVE_SUJETO_28 = ?";
            values.add(this.getProCveSujeto28());
        }

        if (this.getProCveTipClient() != null && "null".equals(this.getProCveTipClient())) {
            conditions += " AND PRO_CVE_TIP_CLIENT IS NULL";
        } else if (this.getProCveTipClient() != null) {
            conditions += " AND PRO_CVE_TIP_CLIENT = ?";
            values.add(this.getProCveTipClient());
        }

        if (this.getProCveTipPers() != null && "null".equals(this.getProCveTipPers())) {
            conditions += " AND PRO_CVE_TIP_PERS IS NULL";
        } else if (this.getProCveTipPers() != null) {
            conditions += " AND PRO_CVE_TIP_PERS = ?";
            values.add(this.getProCveTipPers());
        }

        if (this.getProCvePriTitu() != null && "null".equals(this.getProCvePriTitu())) {
            conditions += " AND PRO_CVE_PRI_TITU IS NULL";
        } else if (this.getProCvePriTitu() != null) {
            conditions += " AND PRO_CVE_PRI_TITU = ?";
            values.add(this.getProCvePriTitu());
        }

        if (this.getProNumMesResg() != null && this.getProNumMesResg().longValue() == -999) {
            conditions += " AND PRO_NUM_MES_RESG IS NULL";
        } else if (this.getProNumMesResg() != null) {
            conditions += " AND PRO_NUM_MES_RESG = ?";
            values.add(this.getProNumMesResg());
        }

        if (this.getProImpMinApert() != null && this.getProImpMinApert().longValue() == -999) {
            conditions += " AND PRO_IMP_MIN_APERT IS NULL";
        } else if (this.getProImpMinApert() != null) {
            conditions += " AND PRO_IMP_MIN_APERT = ?";
            values.add(this.getProImpMinApert());
        }

        if (this.getProImpHonAcepta() != null && this.getProImpHonAcepta().longValue() == -999) {
            conditions += " AND PRO_IMP_HON_ACEPTA IS NULL";
        } else if (this.getProImpHonAcepta() != null) {
            conditions += " AND PRO_IMP_HON_ACEPTA = ?";
            values.add(this.getProImpHonAcepta());
        }

        if (this.getProImpHonManejo() != null && this.getProImpHonManejo().longValue() == -999) {
            conditions += " AND PRO_IMP_HON_MANEJO IS NULL";
        } else if (this.getProImpHonManejo() != null) {
            conditions += " AND PRO_IMP_HON_MANEJO = ?";
            values.add(this.getProImpHonManejo());
        }

        if (this.getProAnoAltaReg() != null && this.getProAnoAltaReg().longValue() == -999) {
            conditions += " AND PRO_ANO_ALTA_REG IS NULL";
        } else if (this.getProAnoAltaReg() != null) {
            conditions += " AND PRO_ANO_ALTA_REG = ?";
            values.add(this.getProAnoAltaReg());
        }

        if (this.getProMesAltaReg() != null && this.getProMesAltaReg().longValue() == -999) {
            conditions += " AND PRO_MES_ALTA_REG IS NULL";
        } else if (this.getProMesAltaReg() != null) {
            conditions += " AND PRO_MES_ALTA_REG = ?";
            values.add(this.getProMesAltaReg());
        }

        if (this.getProDiaAltaReg() != null && this.getProDiaAltaReg().longValue() == -999) {
            conditions += " AND PRO_DIA_ALTA_REG IS NULL";
        } else if (this.getProDiaAltaReg() != null) {
            conditions += " AND PRO_DIA_ALTA_REG = ?";
            values.add(this.getProDiaAltaReg());
        }

        if (this.getProAnoUltMod() != null && this.getProAnoUltMod().longValue() == -999) {
            conditions += " AND PRO_ANO_ULT_MOD IS NULL";
        } else if (this.getProAnoUltMod() != null) {
            conditions += " AND PRO_ANO_ULT_MOD = ?";
            values.add(this.getProAnoUltMod());
        }

        if (this.getProMesUltMod() != null && this.getProMesUltMod().longValue() == -999) {
            conditions += " AND PRO_MES_ULT_MOD IS NULL";
        } else if (this.getProMesUltMod() != null) {
            conditions += " AND PRO_MES_ULT_MOD = ?";
            values.add(this.getProMesUltMod());
        }

        if (this.getProDiaUltMod() != null && this.getProDiaUltMod().longValue() == -999) {
            conditions += " AND PRO_DIA_ULT_MOD IS NULL";
        } else if (this.getProDiaUltMod() != null) {
            conditions += " AND PRO_DIA_ULT_MOD = ?";
            values.add(this.getProDiaUltMod());
        }

        if (this.getProCveStProdest() != null && "null".equals(this.getProCveStProdest())) {
            conditions += " AND PRO_CVE_ST_PRODEST IS NULL";
        } else if (this.getProCveStProdest() != null) {
            conditions += " AND PRO_CVE_ST_PRODEST = ?";
            values.add(this.getProCveStProdest());
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
        String sql = "UPDATE PRODESTA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PRO_NUM_PROD_ESTA = ?";
        pkValues.add(this.getProNumProdEsta());
        fields += " PRO_NOM_PROD_ESTA = ?, ";
        values.add(this.getProNomProdEsta());
        fields += " PRO_TIPO_NEGOCIO = ?, ";
        values.add(this.getProTipoNegocio());
        fields += " PRO_CLASIF_PROD = ?, ";
        values.add(this.getProClasifProd());
        fields += " PRO_RAMA_PRODUCTO = ?, ";
        values.add(this.getProRamaProducto());
        fields += " PRO_CTAM_RESULT = ?, ";
        values.add(this.getProCtamResult());
        fields += " PRO_SCTA_RESULT = ?, ";
        values.add(this.getProSctaResult());
        fields += " PRO_SSCTA_RESULT = ?, ";
        values.add(this.getProSsctaResult());
        fields += " PRO_SSSCTA_RESULT = ?, ";
        values.add(this.getProSssctaResult());
        fields += " PRO_CTAM_ACEPT = ?, ";
        values.add(this.getProCtamAcept());
        fields += " PRO_SCTA_ACEPT = ?, ";
        values.add(this.getProSctaAcept());
        fields += " PRO_SSCTA_ACEPT = ?, ";
        values.add(this.getProSsctaAcept());
        fields += " PRO_SSSCTA_ACEPT = ?, ";
        values.add(this.getProSssctaAcept());
        fields += " PRO_CTAM_SERVIC = ?, ";
        values.add(this.getProCtamServic());
        fields += " PRO_SCTA_SERVIC = ?, ";
        values.add(this.getProSctaServic());
        fields += " PRO_SSCTA_SERVIC = ?, ";
        values.add(this.getProSsctaServic());
        fields += " PRO_SSSCTA_SERVIC = ?, ";
        values.add(this.getProSssctaServic());
        fields += " PRO_CVE_SUJETO_30 = ?, ";
        values.add(this.getProCveSujeto30());
        fields += " PRO_CVE_SUJETO_28 = ?, ";
        values.add(this.getProCveSujeto28());
        fields += " PRO_CVE_TIP_CLIENT = ?, ";
        values.add(this.getProCveTipClient());
        fields += " PRO_CVE_TIP_PERS = ?, ";
        values.add(this.getProCveTipPers());
        fields += " PRO_CVE_PRI_TITU = ?, ";
        values.add(this.getProCvePriTitu());
        fields += " PRO_NUM_MES_RESG = ?, ";
        values.add(this.getProNumMesResg());
        fields += " PRO_IMP_MIN_APERT = ?, ";
        values.add(this.getProImpMinApert());
        fields += " PRO_IMP_HON_ACEPTA = ?, ";
        values.add(this.getProImpHonAcepta());
        fields += " PRO_IMP_HON_MANEJO = ?, ";
        values.add(this.getProImpHonManejo());
        fields += " PRO_ANO_ALTA_REG = ?, ";
        values.add(this.getProAnoAltaReg());
        fields += " PRO_MES_ALTA_REG = ?, ";
        values.add(this.getProMesAltaReg());
        fields += " PRO_DIA_ALTA_REG = ?, ";
        values.add(this.getProDiaAltaReg());
        fields += " PRO_ANO_ULT_MOD = ?, ";
        values.add(this.getProAnoUltMod());
        fields += " PRO_MES_ULT_MOD = ?, ";
        values.add(this.getProMesUltMod());
        fields += " PRO_DIA_ULT_MOD = ?, ";
        values.add(this.getProDiaUltMod());
        fields += " PRO_CVE_ST_PRODEST = ?, ";
        values.add(this.getProCveStProdest());
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
        String sql = "INSERT INTO PRODESTA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PRO_NUM_PROD_ESTA";
        fieldValues += ", ?";
        values.add(this.getProNumProdEsta());

        fields += ", PRO_NOM_PROD_ESTA";
        fieldValues += ", ?";
        values.add(this.getProNomProdEsta());

        fields += ", PRO_TIPO_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getProTipoNegocio());

        fields += ", PRO_CLASIF_PROD";
        fieldValues += ", ?";
        values.add(this.getProClasifProd());

        fields += ", PRO_RAMA_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getProRamaProducto());

        fields += ", PRO_CTAM_RESULT";
        fieldValues += ", ?";
        values.add(this.getProCtamResult());

        fields += ", PRO_SCTA_RESULT";
        fieldValues += ", ?";
        values.add(this.getProSctaResult());

        fields += ", PRO_SSCTA_RESULT";
        fieldValues += ", ?";
        values.add(this.getProSsctaResult());

        fields += ", PRO_SSSCTA_RESULT";
        fieldValues += ", ?";
        values.add(this.getProSssctaResult());

        fields += ", PRO_CTAM_ACEPT";
        fieldValues += ", ?";
        values.add(this.getProCtamAcept());

        fields += ", PRO_SCTA_ACEPT";
        fieldValues += ", ?";
        values.add(this.getProSctaAcept());

        fields += ", PRO_SSCTA_ACEPT";
        fieldValues += ", ?";
        values.add(this.getProSsctaAcept());

        fields += ", PRO_SSSCTA_ACEPT";
        fieldValues += ", ?";
        values.add(this.getProSssctaAcept());

        fields += ", PRO_CTAM_SERVIC";
        fieldValues += ", ?";
        values.add(this.getProCtamServic());

        fields += ", PRO_SCTA_SERVIC";
        fieldValues += ", ?";
        values.add(this.getProSctaServic());

        fields += ", PRO_SSCTA_SERVIC";
        fieldValues += ", ?";
        values.add(this.getProSsctaServic());

        fields += ", PRO_SSSCTA_SERVIC";
        fieldValues += ", ?";
        values.add(this.getProSssctaServic());

        fields += ", PRO_CVE_SUJETO_30";
        fieldValues += ", ?";
        values.add(this.getProCveSujeto30());

        fields += ", PRO_CVE_SUJETO_28";
        fieldValues += ", ?";
        values.add(this.getProCveSujeto28());

        fields += ", PRO_CVE_TIP_CLIENT";
        fieldValues += ", ?";
        values.add(this.getProCveTipClient());

        fields += ", PRO_CVE_TIP_PERS";
        fieldValues += ", ?";
        values.add(this.getProCveTipPers());

        fields += ", PRO_CVE_PRI_TITU";
        fieldValues += ", ?";
        values.add(this.getProCvePriTitu());

        fields += ", PRO_NUM_MES_RESG";
        fieldValues += ", ?";
        values.add(this.getProNumMesResg());

        fields += ", PRO_IMP_MIN_APERT";
        fieldValues += ", ?";
        values.add(this.getProImpMinApert());

        fields += ", PRO_IMP_HON_ACEPTA";
        fieldValues += ", ?";
        values.add(this.getProImpHonAcepta());

        fields += ", PRO_IMP_HON_MANEJO";
        fieldValues += ", ?";
        values.add(this.getProImpHonManejo());

        fields += ", PRO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getProAnoAltaReg());

        fields += ", PRO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getProMesAltaReg());

        fields += ", PRO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getProDiaAltaReg());

        fields += ", PRO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getProAnoUltMod());

        fields += ", PRO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getProMesUltMod());

        fields += ", PRO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getProDiaUltMod());

        fields += ", PRO_CVE_ST_PRODEST";
        fieldValues += ", ?";
        values.add(this.getProCveStProdest());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PRODESTA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PRO_NUM_PROD_ESTA = ?";
        values.add(this.getProNumProdEsta());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Prodesta instance = (Prodesta) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getProNumProdEsta().equals(instance.getProNumProdEsta()))
            equalObjects = false;
        if (equalObjects && !this.getProNomProdEsta().equals(instance.getProNomProdEsta()))
            equalObjects = false;
        if (equalObjects && !this.getProTipoNegocio().equals(instance.getProTipoNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getProClasifProd().equals(instance.getProClasifProd()))
            equalObjects = false;
        if (equalObjects && !this.getProRamaProducto().equals(instance.getProRamaProducto()))
            equalObjects = false;
        if (equalObjects && !this.getProCtamResult().equals(instance.getProCtamResult()))
            equalObjects = false;
        if (equalObjects && !this.getProSctaResult().equals(instance.getProSctaResult()))
            equalObjects = false;
        if (equalObjects && !this.getProSsctaResult().equals(instance.getProSsctaResult()))
            equalObjects = false;
        if (equalObjects && !this.getProSssctaResult().equals(instance.getProSssctaResult()))
            equalObjects = false;
        if (equalObjects && !this.getProCtamAcept().equals(instance.getProCtamAcept()))
            equalObjects = false;
        if (equalObjects && !this.getProSctaAcept().equals(instance.getProSctaAcept()))
            equalObjects = false;
        if (equalObjects && !this.getProSsctaAcept().equals(instance.getProSsctaAcept()))
            equalObjects = false;
        if (equalObjects && !this.getProSssctaAcept().equals(instance.getProSssctaAcept()))
            equalObjects = false;
        if (equalObjects && !this.getProCtamServic().equals(instance.getProCtamServic()))
            equalObjects = false;
        if (equalObjects && !this.getProSctaServic().equals(instance.getProSctaServic()))
            equalObjects = false;
        if (equalObjects && !this.getProSsctaServic().equals(instance.getProSsctaServic()))
            equalObjects = false;
        if (equalObjects && !this.getProSssctaServic().equals(instance.getProSssctaServic()))
            equalObjects = false;
        if (equalObjects && !this.getProCveSujeto30().equals(instance.getProCveSujeto30()))
            equalObjects = false;
        if (equalObjects && !this.getProCveSujeto28().equals(instance.getProCveSujeto28()))
            equalObjects = false;
        if (equalObjects && !this.getProCveTipClient().equals(instance.getProCveTipClient()))
            equalObjects = false;
        if (equalObjects && !this.getProCveTipPers().equals(instance.getProCveTipPers()))
            equalObjects = false;
        if (equalObjects && !this.getProCvePriTitu().equals(instance.getProCvePriTitu()))
            equalObjects = false;
        if (equalObjects && !this.getProNumMesResg().equals(instance.getProNumMesResg()))
            equalObjects = false;
        if (equalObjects && !this.getProImpMinApert().equals(instance.getProImpMinApert()))
            equalObjects = false;
        if (equalObjects && !this.getProImpHonAcepta().equals(instance.getProImpHonAcepta()))
            equalObjects = false;
        if (equalObjects && !this.getProImpHonManejo().equals(instance.getProImpHonManejo()))
            equalObjects = false;
        if (equalObjects && !this.getProAnoAltaReg().equals(instance.getProAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getProMesAltaReg().equals(instance.getProMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getProDiaAltaReg().equals(instance.getProDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getProAnoUltMod().equals(instance.getProAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getProMesUltMod().equals(instance.getProMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getProDiaUltMod().equals(instance.getProDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getProCveStProdest().equals(instance.getProCveStProdest()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Prodesta result = new Prodesta();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setProNumProdEsta((BigDecimal) objectData.getData("PRO_NUM_PROD_ESTA"));
        result.setProNomProdEsta((String) objectData.getData("PRO_NOM_PROD_ESTA"));
        result.setProTipoNegocio((String) objectData.getData("PRO_TIPO_NEGOCIO"));
        result.setProClasifProd((String) objectData.getData("PRO_CLASIF_PROD"));
        result.setProRamaProducto((String) objectData.getData("PRO_RAMA_PRODUCTO"));
        result.setProCtamResult((BigDecimal) objectData.getData("PRO_CTAM_RESULT"));
        result.setProSctaResult((BigDecimal) objectData.getData("PRO_SCTA_RESULT"));
        result.setProSsctaResult((BigDecimal) objectData.getData("PRO_SSCTA_RESULT"));
        result.setProSssctaResult((BigDecimal) objectData.getData("PRO_SSSCTA_RESULT"));
        result.setProCtamAcept((BigDecimal) objectData.getData("PRO_CTAM_ACEPT"));
        result.setProSctaAcept((BigDecimal) objectData.getData("PRO_SCTA_ACEPT"));
        result.setProSsctaAcept((BigDecimal) objectData.getData("PRO_SSCTA_ACEPT"));
        result.setProSssctaAcept((BigDecimal) objectData.getData("PRO_SSSCTA_ACEPT"));
        result.setProCtamServic((BigDecimal) objectData.getData("PRO_CTAM_SERVIC"));
        result.setProSctaServic((BigDecimal) objectData.getData("PRO_SCTA_SERVIC"));
        result.setProSsctaServic((BigDecimal) objectData.getData("PRO_SSCTA_SERVIC"));
        result.setProSssctaServic((BigDecimal) objectData.getData("PRO_SSSCTA_SERVIC"));
        result.setProCveSujeto30((BigDecimal) objectData.getData("PRO_CVE_SUJETO_30"));
        result.setProCveSujeto28((BigDecimal) objectData.getData("PRO_CVE_SUJETO_28"));
        result.setProCveTipClient((String) objectData.getData("PRO_CVE_TIP_CLIENT"));
        result.setProCveTipPers((String) objectData.getData("PRO_CVE_TIP_PERS"));
        result.setProCvePriTitu((String) objectData.getData("PRO_CVE_PRI_TITU"));
        result.setProNumMesResg((BigDecimal) objectData.getData("PRO_NUM_MES_RESG"));
        result.setProImpMinApert((BigDecimal) objectData.getData("PRO_IMP_MIN_APERT"));
        result.setProImpHonAcepta((BigDecimal) objectData.getData("PRO_IMP_HON_ACEPTA"));
        result.setProImpHonManejo((BigDecimal) objectData.getData("PRO_IMP_HON_MANEJO"));
        result.setProAnoAltaReg((BigDecimal) objectData.getData("PRO_ANO_ALTA_REG"));
        result.setProMesAltaReg((BigDecimal) objectData.getData("PRO_MES_ALTA_REG"));
        result.setProDiaAltaReg((BigDecimal) objectData.getData("PRO_DIA_ALTA_REG"));
        result.setProAnoUltMod((BigDecimal) objectData.getData("PRO_ANO_ULT_MOD"));
        result.setProMesUltMod((BigDecimal) objectData.getData("PRO_MES_ULT_MOD"));
        result.setProDiaUltMod((BigDecimal) objectData.getData("PRO_DIA_ULT_MOD"));
        result.setProCveStProdest((String) objectData.getData("PRO_CVE_ST_PRODEST"));

        return result;

    }

}
