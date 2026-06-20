package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CTA_MATRIZ_PK",
            columns =
            { "CTAM_TIPO_NEGOCIO", "CTAM_CLASIF_PROD", "CTAM_CTA_CLIEN", "CTAM_SCTA_CLIEN", "CTAM_SSCTA_CLIEN", "CTAM_SSSCTA_CLIEN", "CTAM_SSSSCTA_CLIEN", "CTAM_SSSSSCTA_CLIEN"
    }, sequences = { "MANUAL" })
public class CtaMatriz extends DomainObject {

    BigDecimal ctamTipoNegocio = null;
    BigDecimal ctamClasifProd = null;
    BigDecimal ctamCtaClien = null;
    BigDecimal ctamSctaClien = null;
    BigDecimal ctamSsctaClien = null;
    BigDecimal ctamSssctaClien = null;
    BigDecimal ctamSsssctaClien = null;
    BigDecimal ctamSssssctaClien = null;
    BigDecimal ctamCtaOrden = null;
    BigDecimal ctamSctaOrden = null;
    BigDecimal ctamSsctaOrden = null;
    BigDecimal ctamSssctaOrden = null;
    BigDecimal ctamSsssctaOrden = null;
    BigDecimal ctamSssssctaOrden = null;
    BigDecimal ctamDetalle = null;
    BigDecimal ctamAnoAltaReg = null;
    BigDecimal ctamMesAltaReg = null;
    BigDecimal ctamDiaAltaReg = null;
    BigDecimal ctamAnoUltMod = null;
    BigDecimal ctamMesUltMod = null;
    BigDecimal ctamDiaUltMod = null;
    String ctamCveStCtamat = null;

    public CtaMatriz() {
        super();
        this.pkColumns = 8;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCtamTipoNegocio(BigDecimal ctamTipoNegocio) {
        this.ctamTipoNegocio = ctamTipoNegocio;
    }

    public BigDecimal getCtamTipoNegocio() {
        return this.ctamTipoNegocio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCtamClasifProd(BigDecimal ctamClasifProd) {
        this.ctamClasifProd = ctamClasifProd;
    }

    public BigDecimal getCtamClasifProd() {
        return this.ctamClasifProd;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtamCtaClien(BigDecimal ctamCtaClien) {
        this.ctamCtaClien = ctamCtaClien;
    }

    public BigDecimal getCtamCtaClien() {
        return this.ctamCtaClien;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtamSctaClien(BigDecimal ctamSctaClien) {
        this.ctamSctaClien = ctamSctaClien;
    }

    public BigDecimal getCtamSctaClien() {
        return this.ctamSctaClien;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtamSsctaClien(BigDecimal ctamSsctaClien) {
        this.ctamSsctaClien = ctamSsctaClien;
    }

    public BigDecimal getCtamSsctaClien() {
        return this.ctamSsctaClien;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtamSssctaClien(BigDecimal ctamSssctaClien) {
        this.ctamSssctaClien = ctamSssctaClien;
    }

    public BigDecimal getCtamSssctaClien() {
        return this.ctamSssctaClien;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtamSsssctaClien(BigDecimal ctamSsssctaClien) {
        this.ctamSsssctaClien = ctamSsssctaClien;
    }

    public BigDecimal getCtamSsssctaClien() {
        return this.ctamSsssctaClien;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtamSssssctaClien(BigDecimal ctamSssssctaClien) {
        this.ctamSssssctaClien = ctamSssssctaClien;
    }

    public BigDecimal getCtamSssssctaClien() {
        return this.ctamSssssctaClien;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtamCtaOrden(BigDecimal ctamCtaOrden) {
        this.ctamCtaOrden = ctamCtaOrden;
    }

    public BigDecimal getCtamCtaOrden() {
        return this.ctamCtaOrden;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtamSctaOrden(BigDecimal ctamSctaOrden) {
        this.ctamSctaOrden = ctamSctaOrden;
    }

    public BigDecimal getCtamSctaOrden() {
        return this.ctamSctaOrden;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtamSsctaOrden(BigDecimal ctamSsctaOrden) {
        this.ctamSsctaOrden = ctamSsctaOrden;
    }

    public BigDecimal getCtamSsctaOrden() {
        return this.ctamSsctaOrden;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtamSssctaOrden(BigDecimal ctamSssctaOrden) {
        this.ctamSssctaOrden = ctamSssctaOrden;
    }

    public BigDecimal getCtamSssctaOrden() {
        return this.ctamSssctaOrden;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtamSsssctaOrden(BigDecimal ctamSsssctaOrden) {
        this.ctamSsssctaOrden = ctamSsssctaOrden;
    }

    public BigDecimal getCtamSsssctaOrden() {
        return this.ctamSsssctaOrden;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtamSssssctaOrden(BigDecimal ctamSssssctaOrden) {
        this.ctamSssssctaOrden = ctamSssssctaOrden;
    }

    public BigDecimal getCtamSssssctaOrden() {
        return this.ctamSssssctaOrden;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCtamDetalle(BigDecimal ctamDetalle) {
        this.ctamDetalle = ctamDetalle;
    }

    public BigDecimal getCtamDetalle() {
        return this.ctamDetalle;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtamAnoAltaReg(BigDecimal ctamAnoAltaReg) {
        this.ctamAnoAltaReg = ctamAnoAltaReg;
    }

    public BigDecimal getCtamAnoAltaReg() {
        return this.ctamAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtamMesAltaReg(BigDecimal ctamMesAltaReg) {
        this.ctamMesAltaReg = ctamMesAltaReg;
    }

    public BigDecimal getCtamMesAltaReg() {
        return this.ctamMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtamDiaAltaReg(BigDecimal ctamDiaAltaReg) {
        this.ctamDiaAltaReg = ctamDiaAltaReg;
    }

    public BigDecimal getCtamDiaAltaReg() {
        return this.ctamDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtamAnoUltMod(BigDecimal ctamAnoUltMod) {
        this.ctamAnoUltMod = ctamAnoUltMod;
    }

    public BigDecimal getCtamAnoUltMod() {
        return this.ctamAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtamMesUltMod(BigDecimal ctamMesUltMod) {
        this.ctamMesUltMod = ctamMesUltMod;
    }

    public BigDecimal getCtamMesUltMod() {
        return this.ctamMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtamDiaUltMod(BigDecimal ctamDiaUltMod) {
        this.ctamDiaUltMod = ctamDiaUltMod;
    }

    public BigDecimal getCtamDiaUltMod() {
        return this.ctamDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtamCveStCtamat(String ctamCveStCtamat) {
        this.ctamCveStCtamat = ctamCveStCtamat;
    }

    public String getCtamCveStCtamat() {
        return this.ctamCveStCtamat;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CTA_MATRIZ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtamTipoNegocio() != null && this.getCtamTipoNegocio().longValue() == -999) {
            conditions += " AND CTAM_TIPO_NEGOCIO IS NULL";
        } else if (this.getCtamTipoNegocio() != null) {
            conditions += " AND CTAM_TIPO_NEGOCIO = ?";
            values.add(this.getCtamTipoNegocio());
        }

        if (this.getCtamClasifProd() != null && this.getCtamClasifProd().longValue() == -999) {
            conditions += " AND CTAM_CLASIF_PROD IS NULL";
        } else if (this.getCtamClasifProd() != null) {
            conditions += " AND CTAM_CLASIF_PROD = ?";
            values.add(this.getCtamClasifProd());
        }

        if (this.getCtamCtaClien() != null && this.getCtamCtaClien().longValue() == -999) {
            conditions += " AND CTAM_CTA_CLIEN IS NULL";
        } else if (this.getCtamCtaClien() != null) {
            conditions += " AND CTAM_CTA_CLIEN = ?";
            values.add(this.getCtamCtaClien());
        }

        if (this.getCtamSctaClien() != null && this.getCtamSctaClien().longValue() == -999) {
            conditions += " AND CTAM_SCTA_CLIEN IS NULL";
        } else if (this.getCtamSctaClien() != null) {
            conditions += " AND CTAM_SCTA_CLIEN = ?";
            values.add(this.getCtamSctaClien());
        }

        if (this.getCtamSsctaClien() != null && this.getCtamSsctaClien().longValue() == -999) {
            conditions += " AND CTAM_SSCTA_CLIEN IS NULL";
        } else if (this.getCtamSsctaClien() != null) {
            conditions += " AND CTAM_SSCTA_CLIEN = ?";
            values.add(this.getCtamSsctaClien());
        }

        if (this.getCtamSssctaClien() != null && this.getCtamSssctaClien().longValue() == -999) {
            conditions += " AND CTAM_SSSCTA_CLIEN IS NULL";
        } else if (this.getCtamSssctaClien() != null) {
            conditions += " AND CTAM_SSSCTA_CLIEN = ?";
            values.add(this.getCtamSssctaClien());
        }

        if (this.getCtamSsssctaClien() != null && this.getCtamSsssctaClien().longValue() == -999) {
            conditions += " AND CTAM_SSSSCTA_CLIEN IS NULL";
        } else if (this.getCtamSsssctaClien() != null) {
            conditions += " AND CTAM_SSSSCTA_CLIEN = ?";
            values.add(this.getCtamSsssctaClien());
        }

        if (this.getCtamSssssctaClien() != null && this.getCtamSssssctaClien().longValue() == -999) {
            conditions += " AND CTAM_SSSSSCTA_CLIEN IS NULL";
        } else if (this.getCtamSssssctaClien() != null) {
            conditions += " AND CTAM_SSSSSCTA_CLIEN = ?";
            values.add(this.getCtamSssssctaClien());
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
        String sql = "SELECT * FROM CTA_MATRIZ ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtamTipoNegocio() != null && this.getCtamTipoNegocio().longValue() == -999) {
            conditions += " AND CTAM_TIPO_NEGOCIO IS NULL";
        } else if (this.getCtamTipoNegocio() != null) {
            conditions += " AND CTAM_TIPO_NEGOCIO = ?";
            values.add(this.getCtamTipoNegocio());
        }

        if (this.getCtamClasifProd() != null && this.getCtamClasifProd().longValue() == -999) {
            conditions += " AND CTAM_CLASIF_PROD IS NULL";
        } else if (this.getCtamClasifProd() != null) {
            conditions += " AND CTAM_CLASIF_PROD = ?";
            values.add(this.getCtamClasifProd());
        }

        if (this.getCtamCtaClien() != null && this.getCtamCtaClien().longValue() == -999) {
            conditions += " AND CTAM_CTA_CLIEN IS NULL";
        } else if (this.getCtamCtaClien() != null) {
            conditions += " AND CTAM_CTA_CLIEN = ?";
            values.add(this.getCtamCtaClien());
        }

        if (this.getCtamSctaClien() != null && this.getCtamSctaClien().longValue() == -999) {
            conditions += " AND CTAM_SCTA_CLIEN IS NULL";
        } else if (this.getCtamSctaClien() != null) {
            conditions += " AND CTAM_SCTA_CLIEN = ?";
            values.add(this.getCtamSctaClien());
        }

        if (this.getCtamSsctaClien() != null && this.getCtamSsctaClien().longValue() == -999) {
            conditions += " AND CTAM_SSCTA_CLIEN IS NULL";
        } else if (this.getCtamSsctaClien() != null) {
            conditions += " AND CTAM_SSCTA_CLIEN = ?";
            values.add(this.getCtamSsctaClien());
        }

        if (this.getCtamSssctaClien() != null && this.getCtamSssctaClien().longValue() == -999) {
            conditions += " AND CTAM_SSSCTA_CLIEN IS NULL";
        } else if (this.getCtamSssctaClien() != null) {
            conditions += " AND CTAM_SSSCTA_CLIEN = ?";
            values.add(this.getCtamSssctaClien());
        }

        if (this.getCtamSsssctaClien() != null && this.getCtamSsssctaClien().longValue() == -999) {
            conditions += " AND CTAM_SSSSCTA_CLIEN IS NULL";
        } else if (this.getCtamSsssctaClien() != null) {
            conditions += " AND CTAM_SSSSCTA_CLIEN = ?";
            values.add(this.getCtamSsssctaClien());
        }

        if (this.getCtamSssssctaClien() != null && this.getCtamSssssctaClien().longValue() == -999) {
            conditions += " AND CTAM_SSSSSCTA_CLIEN IS NULL";
        } else if (this.getCtamSssssctaClien() != null) {
            conditions += " AND CTAM_SSSSSCTA_CLIEN = ?";
            values.add(this.getCtamSssssctaClien());
        }

        if (this.getCtamCtaOrden() != null && this.getCtamCtaOrden().longValue() == -999) {
            conditions += " AND CTAM_CTA_ORDEN IS NULL";
        } else if (this.getCtamCtaOrden() != null) {
            conditions += " AND CTAM_CTA_ORDEN = ?";
            values.add(this.getCtamCtaOrden());
        }

        if (this.getCtamSctaOrden() != null && this.getCtamSctaOrden().longValue() == -999) {
            conditions += " AND CTAM_SCTA_ORDEN IS NULL";
        } else if (this.getCtamSctaOrden() != null) {
            conditions += " AND CTAM_SCTA_ORDEN = ?";
            values.add(this.getCtamSctaOrden());
        }

        if (this.getCtamSsctaOrden() != null && this.getCtamSsctaOrden().longValue() == -999) {
            conditions += " AND CTAM_SSCTA_ORDEN IS NULL";
        } else if (this.getCtamSsctaOrden() != null) {
            conditions += " AND CTAM_SSCTA_ORDEN = ?";
            values.add(this.getCtamSsctaOrden());
        }

        if (this.getCtamSssctaOrden() != null && this.getCtamSssctaOrden().longValue() == -999) {
            conditions += " AND CTAM_SSSCTA_ORDEN IS NULL";
        } else if (this.getCtamSssctaOrden() != null) {
            conditions += " AND CTAM_SSSCTA_ORDEN = ?";
            values.add(this.getCtamSssctaOrden());
        }

        if (this.getCtamSsssctaOrden() != null && this.getCtamSsssctaOrden().longValue() == -999) {
            conditions += " AND CTAM_SSSSCTA_ORDEN IS NULL";
        } else if (this.getCtamSsssctaOrden() != null) {
            conditions += " AND CTAM_SSSSCTA_ORDEN = ?";
            values.add(this.getCtamSsssctaOrden());
        }

        if (this.getCtamSssssctaOrden() != null && this.getCtamSssssctaOrden().longValue() == -999) {
            conditions += " AND CTAM_SSSSSCTA_ORDEN IS NULL";
        } else if (this.getCtamSssssctaOrden() != null) {
            conditions += " AND CTAM_SSSSSCTA_ORDEN = ?";
            values.add(this.getCtamSssssctaOrden());
        }

        if (this.getCtamDetalle() != null && this.getCtamDetalle().longValue() == -999) {
            conditions += " AND CTAM_DETALLE IS NULL";
        } else if (this.getCtamDetalle() != null) {
            conditions += " AND CTAM_DETALLE = ?";
            values.add(this.getCtamDetalle());
        }

        if (this.getCtamAnoAltaReg() != null && this.getCtamAnoAltaReg().longValue() == -999) {
            conditions += " AND CTAM_ANO_ALTA_REG IS NULL";
        } else if (this.getCtamAnoAltaReg() != null) {
            conditions += " AND CTAM_ANO_ALTA_REG = ?";
            values.add(this.getCtamAnoAltaReg());
        }

        if (this.getCtamMesAltaReg() != null && this.getCtamMesAltaReg().longValue() == -999) {
            conditions += " AND CTAM_MES_ALTA_REG IS NULL";
        } else if (this.getCtamMesAltaReg() != null) {
            conditions += " AND CTAM_MES_ALTA_REG = ?";
            values.add(this.getCtamMesAltaReg());
        }

        if (this.getCtamDiaAltaReg() != null && this.getCtamDiaAltaReg().longValue() == -999) {
            conditions += " AND CTAM_DIA_ALTA_REG IS NULL";
        } else if (this.getCtamDiaAltaReg() != null) {
            conditions += " AND CTAM_DIA_ALTA_REG = ?";
            values.add(this.getCtamDiaAltaReg());
        }

        if (this.getCtamAnoUltMod() != null && this.getCtamAnoUltMod().longValue() == -999) {
            conditions += " AND CTAM_ANO_ULT_MOD IS NULL";
        } else if (this.getCtamAnoUltMod() != null) {
            conditions += " AND CTAM_ANO_ULT_MOD = ?";
            values.add(this.getCtamAnoUltMod());
        }

        if (this.getCtamMesUltMod() != null && this.getCtamMesUltMod().longValue() == -999) {
            conditions += " AND CTAM_MES_ULT_MOD IS NULL";
        } else if (this.getCtamMesUltMod() != null) {
            conditions += " AND CTAM_MES_ULT_MOD = ?";
            values.add(this.getCtamMesUltMod());
        }

        if (this.getCtamDiaUltMod() != null && this.getCtamDiaUltMod().longValue() == -999) {
            conditions += " AND CTAM_DIA_ULT_MOD IS NULL";
        } else if (this.getCtamDiaUltMod() != null) {
            conditions += " AND CTAM_DIA_ULT_MOD = ?";
            values.add(this.getCtamDiaUltMod());
        }

        if (this.getCtamCveStCtamat() != null && "null".equals(this.getCtamCveStCtamat())) {
            conditions += " AND CTAM_CVE_ST_CTAMAT IS NULL";
        } else if (this.getCtamCveStCtamat() != null) {
            conditions += " AND CTAM_CVE_ST_CTAMAT = ?";
            values.add(this.getCtamCveStCtamat());
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
        String sql = "UPDATE CTA_MATRIZ SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTAM_TIPO_NEGOCIO = ?";
        pkValues.add(this.getCtamTipoNegocio());
        conditions += " AND CTAM_CLASIF_PROD = ?";
        pkValues.add(this.getCtamClasifProd());
        conditions += " AND CTAM_CTA_CLIEN = ?";
        pkValues.add(this.getCtamCtaClien());
        conditions += " AND CTAM_SCTA_CLIEN = ?";
        pkValues.add(this.getCtamSctaClien());
        conditions += " AND CTAM_SSCTA_CLIEN = ?";
        pkValues.add(this.getCtamSsctaClien());
        conditions += " AND CTAM_SSSCTA_CLIEN = ?";
        pkValues.add(this.getCtamSssctaClien());
        conditions += " AND CTAM_SSSSCTA_CLIEN = ?";
        pkValues.add(this.getCtamSsssctaClien());
        conditions += " AND CTAM_SSSSSCTA_CLIEN = ?";
        pkValues.add(this.getCtamSssssctaClien());
        fields += " CTAM_CTA_ORDEN = ?, ";
        values.add(this.getCtamCtaOrden());
        fields += " CTAM_SCTA_ORDEN = ?, ";
        values.add(this.getCtamSctaOrden());
        fields += " CTAM_SSCTA_ORDEN = ?, ";
        values.add(this.getCtamSsctaOrden());
        fields += " CTAM_SSSCTA_ORDEN = ?, ";
        values.add(this.getCtamSssctaOrden());
        fields += " CTAM_SSSSCTA_ORDEN = ?, ";
        values.add(this.getCtamSsssctaOrden());
        fields += " CTAM_SSSSSCTA_ORDEN = ?, ";
        values.add(this.getCtamSssssctaOrden());
        fields += " CTAM_DETALLE = ?, ";
        values.add(this.getCtamDetalle());
        fields += " CTAM_ANO_ALTA_REG = ?, ";
        values.add(this.getCtamAnoAltaReg());
        fields += " CTAM_MES_ALTA_REG = ?, ";
        values.add(this.getCtamMesAltaReg());
        fields += " CTAM_DIA_ALTA_REG = ?, ";
        values.add(this.getCtamDiaAltaReg());
        fields += " CTAM_ANO_ULT_MOD = ?, ";
        values.add(this.getCtamAnoUltMod());
        fields += " CTAM_MES_ULT_MOD = ?, ";
        values.add(this.getCtamMesUltMod());
        fields += " CTAM_DIA_ULT_MOD = ?, ";
        values.add(this.getCtamDiaUltMod());
        fields += " CTAM_CVE_ST_CTAMAT = ?, ";
        values.add(this.getCtamCveStCtamat());
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
        String sql = "INSERT INTO CTA_MATRIZ ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTAM_TIPO_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getCtamTipoNegocio());

        fields += ", CTAM_CLASIF_PROD";
        fieldValues += ", ?";
        values.add(this.getCtamClasifProd());

        fields += ", CTAM_CTA_CLIEN";
        fieldValues += ", ?";
        values.add(this.getCtamCtaClien());

        fields += ", CTAM_SCTA_CLIEN";
        fieldValues += ", ?";
        values.add(this.getCtamSctaClien());

        fields += ", CTAM_SSCTA_CLIEN";
        fieldValues += ", ?";
        values.add(this.getCtamSsctaClien());

        fields += ", CTAM_SSSCTA_CLIEN";
        fieldValues += ", ?";
        values.add(this.getCtamSssctaClien());

        fields += ", CTAM_SSSSCTA_CLIEN";
        fieldValues += ", ?";
        values.add(this.getCtamSsssctaClien());

        fields += ", CTAM_SSSSSCTA_CLIEN";
        fieldValues += ", ?";
        values.add(this.getCtamSssssctaClien());

        fields += ", CTAM_CTA_ORDEN";
        fieldValues += ", ?";
        values.add(this.getCtamCtaOrden());

        fields += ", CTAM_SCTA_ORDEN";
        fieldValues += ", ?";
        values.add(this.getCtamSctaOrden());

        fields += ", CTAM_SSCTA_ORDEN";
        fieldValues += ", ?";
        values.add(this.getCtamSsctaOrden());

        fields += ", CTAM_SSSCTA_ORDEN";
        fieldValues += ", ?";
        values.add(this.getCtamSssctaOrden());

        fields += ", CTAM_SSSSCTA_ORDEN";
        fieldValues += ", ?";
        values.add(this.getCtamSsssctaOrden());

        fields += ", CTAM_SSSSSCTA_ORDEN";
        fieldValues += ", ?";
        values.add(this.getCtamSssssctaOrden());

        fields += ", CTAM_DETALLE";
        fieldValues += ", ?";
        values.add(this.getCtamDetalle());

        fields += ", CTAM_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtamAnoAltaReg());

        fields += ", CTAM_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtamMesAltaReg());

        fields += ", CTAM_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtamDiaAltaReg());

        fields += ", CTAM_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtamAnoUltMod());

        fields += ", CTAM_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtamMesUltMod());

        fields += ", CTAM_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtamDiaUltMod());

        fields += ", CTAM_CVE_ST_CTAMAT";
        fieldValues += ", ?";
        values.add(this.getCtamCveStCtamat());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CTA_MATRIZ WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTAM_TIPO_NEGOCIO = ?";
        values.add(this.getCtamTipoNegocio());
        conditions += " AND CTAM_CLASIF_PROD = ?";
        values.add(this.getCtamClasifProd());
        conditions += " AND CTAM_CTA_CLIEN = ?";
        values.add(this.getCtamCtaClien());
        conditions += " AND CTAM_SCTA_CLIEN = ?";
        values.add(this.getCtamSctaClien());
        conditions += " AND CTAM_SSCTA_CLIEN = ?";
        values.add(this.getCtamSsctaClien());
        conditions += " AND CTAM_SSSCTA_CLIEN = ?";
        values.add(this.getCtamSssctaClien());
        conditions += " AND CTAM_SSSSCTA_CLIEN = ?";
        values.add(this.getCtamSsssctaClien());
        conditions += " AND CTAM_SSSSSCTA_CLIEN = ?";
        values.add(this.getCtamSssssctaClien());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        CtaMatriz instance = (CtaMatriz) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtamTipoNegocio().equals(instance.getCtamTipoNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getCtamClasifProd().equals(instance.getCtamClasifProd()))
            equalObjects = false;
        if (equalObjects && !this.getCtamCtaClien().equals(instance.getCtamCtaClien()))
            equalObjects = false;
        if (equalObjects && !this.getCtamSctaClien().equals(instance.getCtamSctaClien()))
            equalObjects = false;
        if (equalObjects && !this.getCtamSsctaClien().equals(instance.getCtamSsctaClien()))
            equalObjects = false;
        if (equalObjects && !this.getCtamSssctaClien().equals(instance.getCtamSssctaClien()))
            equalObjects = false;
        if (equalObjects && !this.getCtamSsssctaClien().equals(instance.getCtamSsssctaClien()))
            equalObjects = false;
        if (equalObjects && !this.getCtamSssssctaClien().equals(instance.getCtamSssssctaClien()))
            equalObjects = false;
        if (equalObjects && !this.getCtamCtaOrden().equals(instance.getCtamCtaOrden()))
            equalObjects = false;
        if (equalObjects && !this.getCtamSctaOrden().equals(instance.getCtamSctaOrden()))
            equalObjects = false;
        if (equalObjects && !this.getCtamSsctaOrden().equals(instance.getCtamSsctaOrden()))
            equalObjects = false;
        if (equalObjects && !this.getCtamSssctaOrden().equals(instance.getCtamSssctaOrden()))
            equalObjects = false;
        if (equalObjects && !this.getCtamSsssctaOrden().equals(instance.getCtamSsssctaOrden()))
            equalObjects = false;
        if (equalObjects && !this.getCtamSssssctaOrden().equals(instance.getCtamSssssctaOrden()))
            equalObjects = false;
        if (equalObjects && !this.getCtamDetalle().equals(instance.getCtamDetalle()))
            equalObjects = false;
        if (equalObjects && !this.getCtamAnoAltaReg().equals(instance.getCtamAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtamMesAltaReg().equals(instance.getCtamMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtamDiaAltaReg().equals(instance.getCtamDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtamAnoUltMod().equals(instance.getCtamAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtamMesUltMod().equals(instance.getCtamMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtamDiaUltMod().equals(instance.getCtamDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtamCveStCtamat().equals(instance.getCtamCveStCtamat()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        CtaMatriz result = new CtaMatriz();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtamTipoNegocio((BigDecimal) objectData.getData("CTAM_TIPO_NEGOCIO"));
        result.setCtamClasifProd((BigDecimal) objectData.getData("CTAM_CLASIF_PROD"));
        result.setCtamCtaClien((BigDecimal) objectData.getData("CTAM_CTA_CLIEN"));
        result.setCtamSctaClien((BigDecimal) objectData.getData("CTAM_SCTA_CLIEN"));
        result.setCtamSsctaClien((BigDecimal) objectData.getData("CTAM_SSCTA_CLIEN"));
        result.setCtamSssctaClien((BigDecimal) objectData.getData("CTAM_SSSCTA_CLIEN"));
        result.setCtamSsssctaClien((BigDecimal) objectData.getData("CTAM_SSSSCTA_CLIEN"));
        result.setCtamSssssctaClien((BigDecimal) objectData.getData("CTAM_SSSSSCTA_CLIEN"));
        result.setCtamCtaOrden((BigDecimal) objectData.getData("CTAM_CTA_ORDEN"));
        result.setCtamSctaOrden((BigDecimal) objectData.getData("CTAM_SCTA_ORDEN"));
        result.setCtamSsctaOrden((BigDecimal) objectData.getData("CTAM_SSCTA_ORDEN"));
        result.setCtamSssctaOrden((BigDecimal) objectData.getData("CTAM_SSSCTA_ORDEN"));
        result.setCtamSsssctaOrden((BigDecimal) objectData.getData("CTAM_SSSSCTA_ORDEN"));
        result.setCtamSssssctaOrden((BigDecimal) objectData.getData("CTAM_SSSSSCTA_ORDEN"));
        result.setCtamDetalle((BigDecimal) objectData.getData("CTAM_DETALLE"));
        result.setCtamAnoAltaReg((BigDecimal) objectData.getData("CTAM_ANO_ALTA_REG"));
        result.setCtamMesAltaReg((BigDecimal) objectData.getData("CTAM_MES_ALTA_REG"));
        result.setCtamDiaAltaReg((BigDecimal) objectData.getData("CTAM_DIA_ALTA_REG"));
        result.setCtamAnoUltMod((BigDecimal) objectData.getData("CTAM_ANO_ULT_MOD"));
        result.setCtamMesUltMod((BigDecimal) objectData.getData("CTAM_MES_ULT_MOD"));
        result.setCtamDiaUltMod((BigDecimal) objectData.getData("CTAM_DIA_ULT_MOD"));
        result.setCtamCveStCtamat((String) objectData.getData("CTAM_CVE_ST_CTAMAT"));

        return result;

    }

}
