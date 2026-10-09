package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PRODUCTO_PK", columns = { "PRL_NUM_PRODUCTO" }, sequences = { "MAX" })
public class Producto extends DomainObject {

    BigDecimal prlNumProducto = null;
    BigDecimal prlNumProdEsta = null;
    String prlTipoNegocio = null;
    String prlClasifProd = null;
    String prlRamaProd = null;
    String prlNomProducto = null;
    BigDecimal prlCtamResult = null;
    BigDecimal prlSctaResult = null;
    BigDecimal prlSsctaResult = null;
    BigDecimal prlSssctaResult = null;
    BigDecimal prlNumCtamAcept = null;
    BigDecimal prlNumSctaAcept = null;
    BigDecimal prlSsctaAcept = null;
    BigDecimal prlSssctaAcept = null;
    BigDecimal prlCtamServic = null;
    BigDecimal prlSctaServic = null;
    BigDecimal prlSsctaServic = null;
    BigDecimal prlSssctaServic = null;
    BigDecimal prlCveSujeto30 = null;
    BigDecimal prlSujeArt28 = null;
    String prlTipoCliente = null;
    String prlCveTipoPers = null;
    String prlCvePriTitu = null;
    BigDecimal prlImpMinAper = null;
    BigDecimal prlImpHonAcep = null;
    BigDecimal prlImpHonManejo = null;
    BigDecimal prlNumMesResg = null;
    BigDecimal prlAnoAltaReg = null;
    BigDecimal prlMesAltaReg = null;
    BigDecimal prlDiaAltaReg = null;
    BigDecimal prlAnoUltMod = null;
    BigDecimal prlMesUltMod = null;
    BigDecimal prlDiaUltMod = null;
    String prlCveStProduct = null;
    String prlNomenclatura = null;

    public Producto() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlNumProducto(BigDecimal prlNumProducto) {
        this.prlNumProducto = prlNumProducto;
    }

    public BigDecimal getPrlNumProducto() {
        return this.prlNumProducto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlNumProdEsta(BigDecimal prlNumProdEsta) {
        this.prlNumProdEsta = prlNumProdEsta;
    }

    public BigDecimal getPrlNumProdEsta() {
        return this.prlNumProdEsta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrlTipoNegocio(String prlTipoNegocio) {
        this.prlTipoNegocio = prlTipoNegocio;
    }

    public String getPrlTipoNegocio() {
        return this.prlTipoNegocio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrlClasifProd(String prlClasifProd) {
        this.prlClasifProd = prlClasifProd;
    }

    public String getPrlClasifProd() {
        return this.prlClasifProd;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrlRamaProd(String prlRamaProd) {
        this.prlRamaProd = prlRamaProd;
    }

    public String getPrlRamaProd() {
        return this.prlRamaProd;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrlNomProducto(String prlNomProducto) {
        this.prlNomProducto = prlNomProducto;
    }

    public String getPrlNomProducto() {
        return this.prlNomProducto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlCtamResult(BigDecimal prlCtamResult) {
        this.prlCtamResult = prlCtamResult;
    }

    public BigDecimal getPrlCtamResult() {
        return this.prlCtamResult;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlSctaResult(BigDecimal prlSctaResult) {
        this.prlSctaResult = prlSctaResult;
    }

    public BigDecimal getPrlSctaResult() {
        return this.prlSctaResult;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlSsctaResult(BigDecimal prlSsctaResult) {
        this.prlSsctaResult = prlSsctaResult;
    }

    public BigDecimal getPrlSsctaResult() {
        return this.prlSsctaResult;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlSssctaResult(BigDecimal prlSssctaResult) {
        this.prlSssctaResult = prlSssctaResult;
    }

    public BigDecimal getPrlSssctaResult() {
        return this.prlSssctaResult;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlNumCtamAcept(BigDecimal prlNumCtamAcept) {
        this.prlNumCtamAcept = prlNumCtamAcept;
    }

    public BigDecimal getPrlNumCtamAcept() {
        return this.prlNumCtamAcept;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlNumSctaAcept(BigDecimal prlNumSctaAcept) {
        this.prlNumSctaAcept = prlNumSctaAcept;
    }

    public BigDecimal getPrlNumSctaAcept() {
        return this.prlNumSctaAcept;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlSsctaAcept(BigDecimal prlSsctaAcept) {
        this.prlSsctaAcept = prlSsctaAcept;
    }

    public BigDecimal getPrlSsctaAcept() {
        return this.prlSsctaAcept;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlSssctaAcept(BigDecimal prlSssctaAcept) {
        this.prlSssctaAcept = prlSssctaAcept;
    }

    public BigDecimal getPrlSssctaAcept() {
        return this.prlSssctaAcept;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlCtamServic(BigDecimal prlCtamServic) {
        this.prlCtamServic = prlCtamServic;
    }

    public BigDecimal getPrlCtamServic() {
        return this.prlCtamServic;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlSctaServic(BigDecimal prlSctaServic) {
        this.prlSctaServic = prlSctaServic;
    }

    public BigDecimal getPrlSctaServic() {
        return this.prlSctaServic;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlSsctaServic(BigDecimal prlSsctaServic) {
        this.prlSsctaServic = prlSsctaServic;
    }

    public BigDecimal getPrlSsctaServic() {
        return this.prlSsctaServic;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlSssctaServic(BigDecimal prlSssctaServic) {
        this.prlSssctaServic = prlSssctaServic;
    }

    public BigDecimal getPrlSssctaServic() {
        return this.prlSssctaServic;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlCveSujeto30(BigDecimal prlCveSujeto30) {
        this.prlCveSujeto30 = prlCveSujeto30;
    }

    public BigDecimal getPrlCveSujeto30() {
        return this.prlCveSujeto30;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPrlSujeArt28(BigDecimal prlSujeArt28) {
        this.prlSujeArt28 = prlSujeArt28;
    }

    public BigDecimal getPrlSujeArt28() {
        return this.prlSujeArt28;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrlTipoCliente(String prlTipoCliente) {
        this.prlTipoCliente = prlTipoCliente;
    }

    public String getPrlTipoCliente() {
        return this.prlTipoCliente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrlCveTipoPers(String prlCveTipoPers) {
        this.prlCveTipoPers = prlCveTipoPers;
    }

    public String getPrlCveTipoPers() {
        return this.prlCveTipoPers;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrlCvePriTitu(String prlCvePriTitu) {
        this.prlCvePriTitu = prlCvePriTitu;
    }

    public String getPrlCvePriTitu() {
        return this.prlCvePriTitu;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrlImpMinAper(BigDecimal prlImpMinAper) {
        this.prlImpMinAper = prlImpMinAper;
    }

    public BigDecimal getPrlImpMinAper() {
        return this.prlImpMinAper;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrlImpHonAcep(BigDecimal prlImpHonAcep) {
        this.prlImpHonAcep = prlImpHonAcep;
    }

    public BigDecimal getPrlImpHonAcep() {
        return this.prlImpHonAcep;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPrlImpHonManejo(BigDecimal prlImpHonManejo) {
        this.prlImpHonManejo = prlImpHonManejo;
    }

    public BigDecimal getPrlImpHonManejo() {
        return this.prlImpHonManejo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setPrlNumMesResg(BigDecimal prlNumMesResg) {
        this.prlNumMesResg = prlNumMesResg;
    }

    public BigDecimal getPrlNumMesResg() {
        return this.prlNumMesResg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPrlAnoAltaReg(BigDecimal prlAnoAltaReg) {
        this.prlAnoAltaReg = prlAnoAltaReg;
    }

    public BigDecimal getPrlAnoAltaReg() {
        return this.prlAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrlMesAltaReg(BigDecimal prlMesAltaReg) {
        this.prlMesAltaReg = prlMesAltaReg;
    }

    public BigDecimal getPrlMesAltaReg() {
        return this.prlMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrlDiaAltaReg(BigDecimal prlDiaAltaReg) {
        this.prlDiaAltaReg = prlDiaAltaReg;
    }

    public BigDecimal getPrlDiaAltaReg() {
        return this.prlDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPrlAnoUltMod(BigDecimal prlAnoUltMod) {
        this.prlAnoUltMod = prlAnoUltMod;
    }

    public BigDecimal getPrlAnoUltMod() {
        return this.prlAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrlMesUltMod(BigDecimal prlMesUltMod) {
        this.prlMesUltMod = prlMesUltMod;
    }

    public BigDecimal getPrlMesUltMod() {
        return this.prlMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPrlDiaUltMod(BigDecimal prlDiaUltMod) {
        this.prlDiaUltMod = prlDiaUltMod;
    }

    public BigDecimal getPrlDiaUltMod() {
        return this.prlDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrlCveStProduct(String prlCveStProduct) {
        this.prlCveStProduct = prlCveStProduct;
    }

    public String getPrlCveStProduct() {
        return this.prlCveStProduct;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPrlNomenclatura(String prlNomenclatura) {
        this.prlNomenclatura = prlNomenclatura;
    }

    public String getPrlNomenclatura() {
        return this.prlNomenclatura;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PRODUCTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPrlNumProducto() != null && this.getPrlNumProducto().longValue() == -999) {
            conditions += " AND PRL_NUM_PRODUCTO IS NULL";
        } else if (this.getPrlNumProducto() != null) {
            conditions += " AND PRL_NUM_PRODUCTO = ?";
            values.add(this.getPrlNumProducto());
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
        String sql = "SELECT * FROM PRODUCTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPrlNumProducto() != null && this.getPrlNumProducto().longValue() == -999) {
            conditions += " AND PRL_NUM_PRODUCTO IS NULL";
        } else if (this.getPrlNumProducto() != null) {
            conditions += " AND PRL_NUM_PRODUCTO = ?";
            values.add(this.getPrlNumProducto());
        }

        if (this.getPrlNumProdEsta() != null && this.getPrlNumProdEsta().longValue() == -999) {
            conditions += " AND PRL_NUM_PROD_ESTA IS NULL";
        } else if (this.getPrlNumProdEsta() != null) {
            conditions += " AND PRL_NUM_PROD_ESTA = ?";
            values.add(this.getPrlNumProdEsta());
        }

        if (this.getPrlTipoNegocio() != null && "null".equals(this.getPrlTipoNegocio())) {
            conditions += " AND PRL_TIPO_NEGOCIO IS NULL";
        } else if (this.getPrlTipoNegocio() != null) {
            conditions += " AND PRL_TIPO_NEGOCIO = ?";
            values.add(this.getPrlTipoNegocio());
        }

        if (this.getPrlClasifProd() != null && "null".equals(this.getPrlClasifProd())) {
            conditions += " AND PRL_CLASIF_PROD IS NULL";
        } else if (this.getPrlClasifProd() != null) {
            conditions += " AND PRL_CLASIF_PROD = ?";
            values.add(this.getPrlClasifProd());
        }

        if (this.getPrlRamaProd() != null && "null".equals(this.getPrlRamaProd())) {
            conditions += " AND PRL_RAMA_PROD IS NULL";
        } else if (this.getPrlRamaProd() != null) {
            conditions += " AND PRL_RAMA_PROD = ?";
            values.add(this.getPrlRamaProd());
        }

        if (this.getPrlNomProducto() != null && "null".equals(this.getPrlNomProducto())) {
            conditions += " AND PRL_NOM_PRODUCTO IS NULL";
        } else if (this.getPrlNomProducto() != null) {
            conditions += " AND PRL_NOM_PRODUCTO = ?";
            values.add(this.getPrlNomProducto());
        }

        if (this.getPrlCtamResult() != null && this.getPrlCtamResult().longValue() == -999) {
            conditions += " AND PRL_CTAM_RESULT IS NULL";
        } else if (this.getPrlCtamResult() != null) {
            conditions += " AND PRL_CTAM_RESULT = ?";
            values.add(this.getPrlCtamResult());
        }

        if (this.getPrlSctaResult() != null && this.getPrlSctaResult().longValue() == -999) {
            conditions += " AND PRL_SCTA_RESULT IS NULL";
        } else if (this.getPrlSctaResult() != null) {
            conditions += " AND PRL_SCTA_RESULT = ?";
            values.add(this.getPrlSctaResult());
        }

        if (this.getPrlSsctaResult() != null && this.getPrlSsctaResult().longValue() == -999) {
            conditions += " AND PRL_SSCTA_RESULT IS NULL";
        } else if (this.getPrlSsctaResult() != null) {
            conditions += " AND PRL_SSCTA_RESULT = ?";
            values.add(this.getPrlSsctaResult());
        }

        if (this.getPrlSssctaResult() != null && this.getPrlSssctaResult().longValue() == -999) {
            conditions += " AND PRL_SSSCTA_RESULT IS NULL";
        } else if (this.getPrlSssctaResult() != null) {
            conditions += " AND PRL_SSSCTA_RESULT = ?";
            values.add(this.getPrlSssctaResult());
        }

        if (this.getPrlNumCtamAcept() != null && this.getPrlNumCtamAcept().longValue() == -999) {
            conditions += " AND PRL_NUM_CTAM_ACEPT IS NULL";
        } else if (this.getPrlNumCtamAcept() != null) {
            conditions += " AND PRL_NUM_CTAM_ACEPT = ?";
            values.add(this.getPrlNumCtamAcept());
        }

        if (this.getPrlNumSctaAcept() != null && this.getPrlNumSctaAcept().longValue() == -999) {
            conditions += " AND PRL_NUM_SCTA_ACEPT IS NULL";
        } else if (this.getPrlNumSctaAcept() != null) {
            conditions += " AND PRL_NUM_SCTA_ACEPT = ?";
            values.add(this.getPrlNumSctaAcept());
        }

        if (this.getPrlSsctaAcept() != null && this.getPrlSsctaAcept().longValue() == -999) {
            conditions += " AND PRL_SSCTA_ACEPT IS NULL";
        } else if (this.getPrlSsctaAcept() != null) {
            conditions += " AND PRL_SSCTA_ACEPT = ?";
            values.add(this.getPrlSsctaAcept());
        }

        if (this.getPrlSssctaAcept() != null && this.getPrlSssctaAcept().longValue() == -999) {
            conditions += " AND PRL_SSSCTA_ACEPT IS NULL";
        } else if (this.getPrlSssctaAcept() != null) {
            conditions += " AND PRL_SSSCTA_ACEPT = ?";
            values.add(this.getPrlSssctaAcept());
        }

        if (this.getPrlCtamServic() != null && this.getPrlCtamServic().longValue() == -999) {
            conditions += " AND PRL_CTAM_SERVIC IS NULL";
        } else if (this.getPrlCtamServic() != null) {
            conditions += " AND PRL_CTAM_SERVIC = ?";
            values.add(this.getPrlCtamServic());
        }

        if (this.getPrlSctaServic() != null && this.getPrlSctaServic().longValue() == -999) {
            conditions += " AND PRL_SCTA_SERVIC IS NULL";
        } else if (this.getPrlSctaServic() != null) {
            conditions += " AND PRL_SCTA_SERVIC = ?";
            values.add(this.getPrlSctaServic());
        }

        if (this.getPrlSsctaServic() != null && this.getPrlSsctaServic().longValue() == -999) {
            conditions += " AND PRL_SSCTA_SERVIC IS NULL";
        } else if (this.getPrlSsctaServic() != null) {
            conditions += " AND PRL_SSCTA_SERVIC = ?";
            values.add(this.getPrlSsctaServic());
        }

        if (this.getPrlSssctaServic() != null && this.getPrlSssctaServic().longValue() == -999) {
            conditions += " AND PRL_SSSCTA_SERVIC IS NULL";
        } else if (this.getPrlSssctaServic() != null) {
            conditions += " AND PRL_SSSCTA_SERVIC = ?";
            values.add(this.getPrlSssctaServic());
        }

        if (this.getPrlCveSujeto30() != null && this.getPrlCveSujeto30().longValue() == -999) {
            conditions += " AND PRL_CVE_SUJETO_30 IS NULL";
        } else if (this.getPrlCveSujeto30() != null) {
            conditions += " AND PRL_CVE_SUJETO_30 = ?";
            values.add(this.getPrlCveSujeto30());
        }

        if (this.getPrlSujeArt28() != null && this.getPrlSujeArt28().longValue() == -999) {
            conditions += " AND PRL_SUJE_ART_28 IS NULL";
        } else if (this.getPrlSujeArt28() != null) {
            conditions += " AND PRL_SUJE_ART_28 = ?";
            values.add(this.getPrlSujeArt28());
        }

        if (this.getPrlTipoCliente() != null && "null".equals(this.getPrlTipoCliente())) {
            conditions += " AND PRL_TIPO_CLIENTE IS NULL";
        } else if (this.getPrlTipoCliente() != null) {
            conditions += " AND PRL_TIPO_CLIENTE = ?";
            values.add(this.getPrlTipoCliente());
        }

        if (this.getPrlCveTipoPers() != null && "null".equals(this.getPrlCveTipoPers())) {
            conditions += " AND PRL_CVE_TIPO_PERS IS NULL";
        } else if (this.getPrlCveTipoPers() != null) {
            conditions += " AND PRL_CVE_TIPO_PERS = ?";
            values.add(this.getPrlCveTipoPers());
        }

        if (this.getPrlCvePriTitu() != null && "null".equals(this.getPrlCvePriTitu())) {
            conditions += " AND PRL_CVE_PRI_TITU IS NULL";
        } else if (this.getPrlCvePriTitu() != null) {
            conditions += " AND PRL_CVE_PRI_TITU = ?";
            values.add(this.getPrlCvePriTitu());
        }

        if (this.getPrlImpMinAper() != null && this.getPrlImpMinAper().longValue() == -999) {
            conditions += " AND PRL_IMP_MIN_APER IS NULL";
        } else if (this.getPrlImpMinAper() != null) {
            conditions += " AND PRL_IMP_MIN_APER = ?";
            values.add(this.getPrlImpMinAper());
        }

        if (this.getPrlImpHonAcep() != null && this.getPrlImpHonAcep().longValue() == -999) {
            conditions += " AND PRL_IMP_HON_ACEP IS NULL";
        } else if (this.getPrlImpHonAcep() != null) {
            conditions += " AND PRL_IMP_HON_ACEP = ?";
            values.add(this.getPrlImpHonAcep());
        }

        if (this.getPrlImpHonManejo() != null && this.getPrlImpHonManejo().longValue() == -999) {
            conditions += " AND PRL_IMP_HON_MANEJO IS NULL";
        } else if (this.getPrlImpHonManejo() != null) {
            conditions += " AND PRL_IMP_HON_MANEJO = ?";
            values.add(this.getPrlImpHonManejo());
        }

        if (this.getPrlNumMesResg() != null && this.getPrlNumMesResg().longValue() == -999) {
            conditions += " AND PRL_NUM_MES_RESG IS NULL";
        } else if (this.getPrlNumMesResg() != null) {
            conditions += " AND PRL_NUM_MES_RESG = ?";
            values.add(this.getPrlNumMesResg());
        }

        if (this.getPrlAnoAltaReg() != null && this.getPrlAnoAltaReg().longValue() == -999) {
            conditions += " AND PRL_ANO_ALTA_REG IS NULL";
        } else if (this.getPrlAnoAltaReg() != null) {
            conditions += " AND PRL_ANO_ALTA_REG = ?";
            values.add(this.getPrlAnoAltaReg());
        }

        if (this.getPrlMesAltaReg() != null && this.getPrlMesAltaReg().longValue() == -999) {
            conditions += " AND PRL_MES_ALTA_REG IS NULL";
        } else if (this.getPrlMesAltaReg() != null) {
            conditions += " AND PRL_MES_ALTA_REG = ?";
            values.add(this.getPrlMesAltaReg());
        }

        if (this.getPrlDiaAltaReg() != null && this.getPrlDiaAltaReg().longValue() == -999) {
            conditions += " AND PRL_DIA_ALTA_REG IS NULL";
        } else if (this.getPrlDiaAltaReg() != null) {
            conditions += " AND PRL_DIA_ALTA_REG = ?";
            values.add(this.getPrlDiaAltaReg());
        }

        if (this.getPrlAnoUltMod() != null && this.getPrlAnoUltMod().longValue() == -999) {
            conditions += " AND PRL_ANO_ULT_MOD IS NULL";
        } else if (this.getPrlAnoUltMod() != null) {
            conditions += " AND PRL_ANO_ULT_MOD = ?";
            values.add(this.getPrlAnoUltMod());
        }

        if (this.getPrlMesUltMod() != null && this.getPrlMesUltMod().longValue() == -999) {
            conditions += " AND PRL_MES_ULT_MOD IS NULL";
        } else if (this.getPrlMesUltMod() != null) {
            conditions += " AND PRL_MES_ULT_MOD = ?";
            values.add(this.getPrlMesUltMod());
        }

        if (this.getPrlDiaUltMod() != null && this.getPrlDiaUltMod().longValue() == -999) {
            conditions += " AND PRL_DIA_ULT_MOD IS NULL";
        } else if (this.getPrlDiaUltMod() != null) {
            conditions += " AND PRL_DIA_ULT_MOD = ?";
            values.add(this.getPrlDiaUltMod());
        }

        if (this.getPrlCveStProduct() != null && "null".equals(this.getPrlCveStProduct())) {
            conditions += " AND PRL_CVE_ST_PRODUCT IS NULL";
        } else if (this.getPrlCveStProduct() != null) {
            conditions += " AND PRL_CVE_ST_PRODUCT = ?";
            values.add(this.getPrlCveStProduct());
        }

        if (this.getPrlNomenclatura() != null && "null".equals(this.getPrlNomenclatura())) {
            conditions += " AND PRL_NOMENCLATURA IS NULL";
        } else if (this.getPrlNomenclatura() != null) {
            conditions += " AND PRL_NOMENCLATURA = ?";
            values.add(this.getPrlNomenclatura());
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
        String sql = "UPDATE PRODUCTO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PRL_NUM_PRODUCTO = ?";
        pkValues.add(this.getPrlNumProducto());
        fields += " PRL_NUM_PROD_ESTA = ?, ";
        values.add(this.getPrlNumProdEsta());
        fields += " PRL_TIPO_NEGOCIO = ?, ";
        values.add(this.getPrlTipoNegocio());
        fields += " PRL_CLASIF_PROD = ?, ";
        values.add(this.getPrlClasifProd());
        fields += " PRL_RAMA_PROD = ?, ";
        values.add(this.getPrlRamaProd());
        fields += " PRL_NOM_PRODUCTO = ?, ";
        values.add(this.getPrlNomProducto());
        fields += " PRL_CTAM_RESULT = ?, ";
        values.add(this.getPrlCtamResult());
        fields += " PRL_SCTA_RESULT = ?, ";
        values.add(this.getPrlSctaResult());
        fields += " PRL_SSCTA_RESULT = ?, ";
        values.add(this.getPrlSsctaResult());
        fields += " PRL_SSSCTA_RESULT = ?, ";
        values.add(this.getPrlSssctaResult());
        fields += " PRL_NUM_CTAM_ACEPT = ?, ";
        values.add(this.getPrlNumCtamAcept());
        fields += " PRL_NUM_SCTA_ACEPT = ?, ";
        values.add(this.getPrlNumSctaAcept());
        fields += " PRL_SSCTA_ACEPT = ?, ";
        values.add(this.getPrlSsctaAcept());
        fields += " PRL_SSSCTA_ACEPT = ?, ";
        values.add(this.getPrlSssctaAcept());
        fields += " PRL_CTAM_SERVIC = ?, ";
        values.add(this.getPrlCtamServic());
        fields += " PRL_SCTA_SERVIC = ?, ";
        values.add(this.getPrlSctaServic());
        fields += " PRL_SSCTA_SERVIC = ?, ";
        values.add(this.getPrlSsctaServic());
        fields += " PRL_SSSCTA_SERVIC = ?, ";
        values.add(this.getPrlSssctaServic());
        fields += " PRL_CVE_SUJETO_30 = ?, ";
        values.add(this.getPrlCveSujeto30());
        fields += " PRL_SUJE_ART_28 = ?, ";
        values.add(this.getPrlSujeArt28());
        fields += " PRL_TIPO_CLIENTE = ?, ";
        values.add(this.getPrlTipoCliente());
        fields += " PRL_CVE_TIPO_PERS = ?, ";
        values.add(this.getPrlCveTipoPers());
        fields += " PRL_CVE_PRI_TITU = ?, ";
        values.add(this.getPrlCvePriTitu());
        fields += " PRL_IMP_MIN_APER = ?, ";
        values.add(this.getPrlImpMinAper());
        fields += " PRL_IMP_HON_ACEP = ?, ";
        values.add(this.getPrlImpHonAcep());
        fields += " PRL_IMP_HON_MANEJO = ?, ";
        values.add(this.getPrlImpHonManejo());
        fields += " PRL_NUM_MES_RESG = ?, ";
        values.add(this.getPrlNumMesResg());
        fields += " PRL_ANO_ALTA_REG = ?, ";
        values.add(this.getPrlAnoAltaReg());
        fields += " PRL_MES_ALTA_REG = ?, ";
        values.add(this.getPrlMesAltaReg());
        fields += " PRL_DIA_ALTA_REG = ?, ";
        values.add(this.getPrlDiaAltaReg());
        fields += " PRL_ANO_ULT_MOD = ?, ";
        values.add(this.getPrlAnoUltMod());
        fields += " PRL_MES_ULT_MOD = ?, ";
        values.add(this.getPrlMesUltMod());
        fields += " PRL_DIA_ULT_MOD = ?, ";
        values.add(this.getPrlDiaUltMod());
        fields += " PRL_CVE_ST_PRODUCT = ?, ";
        values.add(this.getPrlCveStProduct());
        fields += " PRL_NOMENCLATURA = ?, ";
        values.add(this.getPrlNomenclatura());
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
        String sql = "INSERT INTO PRODUCTO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PRL_NUM_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getPrlNumProducto());

        fields += ", PRL_NUM_PROD_ESTA";
        fieldValues += ", ?";
        values.add(this.getPrlNumProdEsta());

        fields += ", PRL_TIPO_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getPrlTipoNegocio());

        fields += ", PRL_CLASIF_PROD";
        fieldValues += ", ?";
        values.add(this.getPrlClasifProd());

        fields += ", PRL_RAMA_PROD";
        fieldValues += ", ?";
        values.add(this.getPrlRamaProd());

        fields += ", PRL_NOM_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getPrlNomProducto());

        fields += ", PRL_CTAM_RESULT";
        fieldValues += ", ?";
        values.add(this.getPrlCtamResult());

        fields += ", PRL_SCTA_RESULT";
        fieldValues += ", ?";
        values.add(this.getPrlSctaResult());

        fields += ", PRL_SSCTA_RESULT";
        fieldValues += ", ?";
        values.add(this.getPrlSsctaResult());

        fields += ", PRL_SSSCTA_RESULT";
        fieldValues += ", ?";
        values.add(this.getPrlSssctaResult());

        fields += ", PRL_NUM_CTAM_ACEPT";
        fieldValues += ", ?";
        values.add(this.getPrlNumCtamAcept());

        fields += ", PRL_NUM_SCTA_ACEPT";
        fieldValues += ", ?";
        values.add(this.getPrlNumSctaAcept());

        fields += ", PRL_SSCTA_ACEPT";
        fieldValues += ", ?";
        values.add(this.getPrlSsctaAcept());

        fields += ", PRL_SSSCTA_ACEPT";
        fieldValues += ", ?";
        values.add(this.getPrlSssctaAcept());

        fields += ", PRL_CTAM_SERVIC";
        fieldValues += ", ?";
        values.add(this.getPrlCtamServic());

        fields += ", PRL_SCTA_SERVIC";
        fieldValues += ", ?";
        values.add(this.getPrlSctaServic());

        fields += ", PRL_SSCTA_SERVIC";
        fieldValues += ", ?";
        values.add(this.getPrlSsctaServic());

        fields += ", PRL_SSSCTA_SERVIC";
        fieldValues += ", ?";
        values.add(this.getPrlSssctaServic());

        fields += ", PRL_CVE_SUJETO_30";
        fieldValues += ", ?";
        values.add(this.getPrlCveSujeto30());

        fields += ", PRL_SUJE_ART_28";
        fieldValues += ", ?";
        values.add(this.getPrlSujeArt28());

        fields += ", PRL_TIPO_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getPrlTipoCliente());

        fields += ", PRL_CVE_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getPrlCveTipoPers());

        fields += ", PRL_CVE_PRI_TITU";
        fieldValues += ", ?";
        values.add(this.getPrlCvePriTitu());

        fields += ", PRL_IMP_MIN_APER";
        fieldValues += ", ?";
        values.add(this.getPrlImpMinAper());

        fields += ", PRL_IMP_HON_ACEP";
        fieldValues += ", ?";
        values.add(this.getPrlImpHonAcep());

        fields += ", PRL_IMP_HON_MANEJO";
        fieldValues += ", ?";
        values.add(this.getPrlImpHonManejo());

        fields += ", PRL_NUM_MES_RESG";
        fieldValues += ", ?";
        values.add(this.getPrlNumMesResg());

        fields += ", PRL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPrlAnoAltaReg());

        fields += ", PRL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPrlMesAltaReg());

        fields += ", PRL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPrlDiaAltaReg());

        fields += ", PRL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPrlAnoUltMod());

        fields += ", PRL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPrlMesUltMod());

        fields += ", PRL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPrlDiaUltMod());

        fields += ", PRL_CVE_ST_PRODUCT";
        fieldValues += ", ?";
        values.add(this.getPrlCveStProduct());

        fields += ", PRL_NOMENCLATURA";
        fieldValues += ", ?";
        values.add(this.getPrlNomenclatura());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PRODUCTO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PRL_NUM_PRODUCTO = ?";
        values.add(this.getPrlNumProducto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Producto instance = (Producto) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPrlNumProducto().equals(instance.getPrlNumProducto()))
            equalObjects = false;
        if (equalObjects && !this.getPrlNumProdEsta().equals(instance.getPrlNumProdEsta()))
            equalObjects = false;
        if (equalObjects && !this.getPrlTipoNegocio().equals(instance.getPrlTipoNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getPrlClasifProd().equals(instance.getPrlClasifProd()))
            equalObjects = false;
        if (equalObjects && !this.getPrlRamaProd().equals(instance.getPrlRamaProd()))
            equalObjects = false;
        if (equalObjects && !this.getPrlNomProducto().equals(instance.getPrlNomProducto()))
            equalObjects = false;
        if (equalObjects && !this.getPrlCtamResult().equals(instance.getPrlCtamResult()))
            equalObjects = false;
        if (equalObjects && !this.getPrlSctaResult().equals(instance.getPrlSctaResult()))
            equalObjects = false;
        if (equalObjects && !this.getPrlSsctaResult().equals(instance.getPrlSsctaResult()))
            equalObjects = false;
        if (equalObjects && !this.getPrlSssctaResult().equals(instance.getPrlSssctaResult()))
            equalObjects = false;
        if (equalObjects && !this.getPrlNumCtamAcept().equals(instance.getPrlNumCtamAcept()))
            equalObjects = false;
        if (equalObjects && !this.getPrlNumSctaAcept().equals(instance.getPrlNumSctaAcept()))
            equalObjects = false;
        if (equalObjects && !this.getPrlSsctaAcept().equals(instance.getPrlSsctaAcept()))
            equalObjects = false;
        if (equalObjects && !this.getPrlSssctaAcept().equals(instance.getPrlSssctaAcept()))
            equalObjects = false;
        if (equalObjects && !this.getPrlCtamServic().equals(instance.getPrlCtamServic()))
            equalObjects = false;
        if (equalObjects && !this.getPrlSctaServic().equals(instance.getPrlSctaServic()))
            equalObjects = false;
        if (equalObjects && !this.getPrlSsctaServic().equals(instance.getPrlSsctaServic()))
            equalObjects = false;
        if (equalObjects && !this.getPrlSssctaServic().equals(instance.getPrlSssctaServic()))
            equalObjects = false;
        if (equalObjects && !this.getPrlCveSujeto30().equals(instance.getPrlCveSujeto30()))
            equalObjects = false;
        if (equalObjects && !this.getPrlSujeArt28().equals(instance.getPrlSujeArt28()))
            equalObjects = false;
        if (equalObjects && !this.getPrlTipoCliente().equals(instance.getPrlTipoCliente()))
            equalObjects = false;
        if (equalObjects && !this.getPrlCveTipoPers().equals(instance.getPrlCveTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getPrlCvePriTitu().equals(instance.getPrlCvePriTitu()))
            equalObjects = false;
        if (equalObjects && !this.getPrlImpMinAper().equals(instance.getPrlImpMinAper()))
            equalObjects = false;
        if (equalObjects && !this.getPrlImpHonAcep().equals(instance.getPrlImpHonAcep()))
            equalObjects = false;
        if (equalObjects && !this.getPrlImpHonManejo().equals(instance.getPrlImpHonManejo()))
            equalObjects = false;
        if (equalObjects && !this.getPrlNumMesResg().equals(instance.getPrlNumMesResg()))
            equalObjects = false;
        if (equalObjects && !this.getPrlAnoAltaReg().equals(instance.getPrlAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPrlMesAltaReg().equals(instance.getPrlMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPrlDiaAltaReg().equals(instance.getPrlDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPrlAnoUltMod().equals(instance.getPrlAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPrlMesUltMod().equals(instance.getPrlMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPrlDiaUltMod().equals(instance.getPrlDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPrlCveStProduct().equals(instance.getPrlCveStProduct()))
            equalObjects = false;
        if (equalObjects && !this.getPrlNomenclatura().equals(instance.getPrlNomenclatura()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Producto result = new Producto();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPrlNumProducto((BigDecimal) objectData.getData("PRL_NUM_PRODUCTO"));
        result.setPrlNumProdEsta((BigDecimal) objectData.getData("PRL_NUM_PROD_ESTA"));
        result.setPrlTipoNegocio((String) objectData.getData("PRL_TIPO_NEGOCIO"));
        result.setPrlClasifProd((String) objectData.getData("PRL_CLASIF_PROD"));
        result.setPrlRamaProd((String) objectData.getData("PRL_RAMA_PROD"));
        result.setPrlNomProducto((String) objectData.getData("PRL_NOM_PRODUCTO"));
        result.setPrlCtamResult((BigDecimal) objectData.getData("PRL_CTAM_RESULT"));
        result.setPrlSctaResult((BigDecimal) objectData.getData("PRL_SCTA_RESULT"));
        result.setPrlSsctaResult((BigDecimal) objectData.getData("PRL_SSCTA_RESULT"));
        result.setPrlSssctaResult((BigDecimal) objectData.getData("PRL_SSSCTA_RESULT"));
        result.setPrlNumCtamAcept((BigDecimal) objectData.getData("PRL_NUM_CTAM_ACEPT"));
        result.setPrlNumSctaAcept((BigDecimal) objectData.getData("PRL_NUM_SCTA_ACEPT"));
        result.setPrlSsctaAcept((BigDecimal) objectData.getData("PRL_SSCTA_ACEPT"));
        result.setPrlSssctaAcept((BigDecimal) objectData.getData("PRL_SSSCTA_ACEPT"));
        result.setPrlCtamServic((BigDecimal) objectData.getData("PRL_CTAM_SERVIC"));
        result.setPrlSctaServic((BigDecimal) objectData.getData("PRL_SCTA_SERVIC"));
        result.setPrlSsctaServic((BigDecimal) objectData.getData("PRL_SSCTA_SERVIC"));
        result.setPrlSssctaServic((BigDecimal) objectData.getData("PRL_SSSCTA_SERVIC"));
        result.setPrlCveSujeto30((BigDecimal) objectData.getData("PRL_CVE_SUJETO_30"));
        result.setPrlSujeArt28((BigDecimal) objectData.getData("PRL_SUJE_ART_28"));
        result.setPrlTipoCliente((String) objectData.getData("PRL_TIPO_CLIENTE"));
        result.setPrlCveTipoPers((String) objectData.getData("PRL_CVE_TIPO_PERS"));
        result.setPrlCvePriTitu((String) objectData.getData("PRL_CVE_PRI_TITU"));
        result.setPrlImpMinAper((BigDecimal) objectData.getData("PRL_IMP_MIN_APER"));
        result.setPrlImpHonAcep((BigDecimal) objectData.getData("PRL_IMP_HON_ACEP"));
        result.setPrlImpHonManejo((BigDecimal) objectData.getData("PRL_IMP_HON_MANEJO"));
        result.setPrlNumMesResg((BigDecimal) objectData.getData("PRL_NUM_MES_RESG"));
        result.setPrlAnoAltaReg((BigDecimal) objectData.getData("PRL_ANO_ALTA_REG"));
        result.setPrlMesAltaReg((BigDecimal) objectData.getData("PRL_MES_ALTA_REG"));
        result.setPrlDiaAltaReg((BigDecimal) objectData.getData("PRL_DIA_ALTA_REG"));
        result.setPrlAnoUltMod((BigDecimal) objectData.getData("PRL_ANO_ULT_MOD"));
        result.setPrlMesUltMod((BigDecimal) objectData.getData("PRL_MES_ULT_MOD"));
        result.setPrlDiaUltMod((BigDecimal) objectData.getData("PRL_DIA_ULT_MOD"));
        result.setPrlCveStProduct((String) objectData.getData("PRL_CVE_ST_PRODUCT"));
        result.setPrlNomenclatura((String) objectData.getData("PRL_NOMENCLATURA"));

        return result;

    }

}
