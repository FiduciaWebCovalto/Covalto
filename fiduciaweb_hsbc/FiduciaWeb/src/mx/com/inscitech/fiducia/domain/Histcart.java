package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "HISTCART_PK", columns = { "HIC_CVE_TIPO_HONO", "HIC_NUM_PERS_FID", "HIC_CVE_PERS_FID", "HIC_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Histcart extends DomainObject {

    BigDecimal hicNumContrato = null;
    String hicCvePersFid = null;
    BigDecimal hicNumPersFid = null;
    String hicCveTipoHono = null;
    BigDecimal hicImpHonor = null;
    BigDecimal hicImpIvaHonor = null;
    BigDecimal hicImpExtemp = null;
    BigDecimal hicImpHonor30 = null;
    BigDecimal hicImpIvaHon30 = null;
    BigDecimal hicImpExtem30 = null;
    BigDecimal hicImpHonor60 = null;
    BigDecimal hicImpIvaHon60 = null;
    BigDecimal hicImpExtem60 = null;
    BigDecimal hicImpHonor90 = null;
    BigDecimal hicImpIvaHon90 = null;
    BigDecimal hicImpExtem90 = null;
    BigDecimal hicNumRegDet = null;
    BigDecimal hicImpRegDet = null;
    BigDecimal hicNumPagosMes = null;
    BigDecimal hicImpPagosMes = null;
    BigDecimal hicNumPagosFec = null;
    BigDecimal hicImpPagosFec = null;
    String hicCveCalifCart = null;
    BigDecimal hicAnoAltaReg = null;
    BigDecimal hicMesAltaReg = null;
    BigDecimal hicDiaAltaReg = null;
    BigDecimal hicAnoUltMod = null;
    BigDecimal hicMesUltMod = null;
    BigDecimal hicDiaUltMod = null;
    String hicCveStCartera = null;

    public Histcart() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHicNumContrato(BigDecimal hicNumContrato) {
        this.hicNumContrato = hicNumContrato;
    }

    public BigDecimal getHicNumContrato() {
        return this.hicNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setHicCvePersFid(String hicCvePersFid) {
        this.hicCvePersFid = hicCvePersFid;
    }

    public String getHicCvePersFid() {
        return this.hicCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHicNumPersFid(BigDecimal hicNumPersFid) {
        this.hicNumPersFid = hicNumPersFid;
    }

    public BigDecimal getHicNumPersFid() {
        return this.hicNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setHicCveTipoHono(String hicCveTipoHono) {
        this.hicCveTipoHono = hicCveTipoHono;
    }

    public String getHicCveTipoHono() {
        return this.hicCveTipoHono;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpHonor(BigDecimal hicImpHonor) {
        this.hicImpHonor = hicImpHonor;
    }

    public BigDecimal getHicImpHonor() {
        return this.hicImpHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpIvaHonor(BigDecimal hicImpIvaHonor) {
        this.hicImpIvaHonor = hicImpIvaHonor;
    }

    public BigDecimal getHicImpIvaHonor() {
        return this.hicImpIvaHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpExtemp(BigDecimal hicImpExtemp) {
        this.hicImpExtemp = hicImpExtemp;
    }

    public BigDecimal getHicImpExtemp() {
        return this.hicImpExtemp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpHonor30(BigDecimal hicImpHonor30) {
        this.hicImpHonor30 = hicImpHonor30;
    }

    public BigDecimal getHicImpHonor30() {
        return this.hicImpHonor30;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpIvaHon30(BigDecimal hicImpIvaHon30) {
        this.hicImpIvaHon30 = hicImpIvaHon30;
    }

    public BigDecimal getHicImpIvaHon30() {
        return this.hicImpIvaHon30;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpExtem30(BigDecimal hicImpExtem30) {
        this.hicImpExtem30 = hicImpExtem30;
    }

    public BigDecimal getHicImpExtem30() {
        return this.hicImpExtem30;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpHonor60(BigDecimal hicImpHonor60) {
        this.hicImpHonor60 = hicImpHonor60;
    }

    public BigDecimal getHicImpHonor60() {
        return this.hicImpHonor60;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpIvaHon60(BigDecimal hicImpIvaHon60) {
        this.hicImpIvaHon60 = hicImpIvaHon60;
    }

    public BigDecimal getHicImpIvaHon60() {
        return this.hicImpIvaHon60;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpExtem60(BigDecimal hicImpExtem60) {
        this.hicImpExtem60 = hicImpExtem60;
    }

    public BigDecimal getHicImpExtem60() {
        return this.hicImpExtem60;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpHonor90(BigDecimal hicImpHonor90) {
        this.hicImpHonor90 = hicImpHonor90;
    }

    public BigDecimal getHicImpHonor90() {
        return this.hicImpHonor90;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpIvaHon90(BigDecimal hicImpIvaHon90) {
        this.hicImpIvaHon90 = hicImpIvaHon90;
    }

    public BigDecimal getHicImpIvaHon90() {
        return this.hicImpIvaHon90;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpExtem90(BigDecimal hicImpExtem90) {
        this.hicImpExtem90 = hicImpExtem90;
    }

    public BigDecimal getHicImpExtem90() {
        return this.hicImpExtem90;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHicNumRegDet(BigDecimal hicNumRegDet) {
        this.hicNumRegDet = hicNumRegDet;
    }

    public BigDecimal getHicNumRegDet() {
        return this.hicNumRegDet;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpRegDet(BigDecimal hicImpRegDet) {
        this.hicImpRegDet = hicImpRegDet;
    }

    public BigDecimal getHicImpRegDet() {
        return this.hicImpRegDet;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHicNumPagosMes(BigDecimal hicNumPagosMes) {
        this.hicNumPagosMes = hicNumPagosMes;
    }

    public BigDecimal getHicNumPagosMes() {
        return this.hicNumPagosMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpPagosMes(BigDecimal hicImpPagosMes) {
        this.hicImpPagosMes = hicImpPagosMes;
    }

    public BigDecimal getHicImpPagosMes() {
        return this.hicImpPagosMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHicNumPagosFec(BigDecimal hicNumPagosFec) {
        this.hicNumPagosFec = hicNumPagosFec;
    }

    public BigDecimal getHicNumPagosFec() {
        return this.hicNumPagosFec;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setHicImpPagosFec(BigDecimal hicImpPagosFec) {
        this.hicImpPagosFec = hicImpPagosFec;
    }

    public BigDecimal getHicImpPagosFec() {
        return this.hicImpPagosFec;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setHicCveCalifCart(String hicCveCalifCart) {
        this.hicCveCalifCart = hicCveCalifCart;
    }

    public String getHicCveCalifCart() {
        return this.hicCveCalifCart;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setHicAnoAltaReg(BigDecimal hicAnoAltaReg) {
        this.hicAnoAltaReg = hicAnoAltaReg;
    }

    public BigDecimal getHicAnoAltaReg() {
        return this.hicAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setHicMesAltaReg(BigDecimal hicMesAltaReg) {
        this.hicMesAltaReg = hicMesAltaReg;
    }

    public BigDecimal getHicMesAltaReg() {
        return this.hicMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setHicDiaAltaReg(BigDecimal hicDiaAltaReg) {
        this.hicDiaAltaReg = hicDiaAltaReg;
    }

    public BigDecimal getHicDiaAltaReg() {
        return this.hicDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setHicAnoUltMod(BigDecimal hicAnoUltMod) {
        this.hicAnoUltMod = hicAnoUltMod;
    }

    public BigDecimal getHicAnoUltMod() {
        return this.hicAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setHicMesUltMod(BigDecimal hicMesUltMod) {
        this.hicMesUltMod = hicMesUltMod;
    }

    public BigDecimal getHicMesUltMod() {
        return this.hicMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setHicDiaUltMod(BigDecimal hicDiaUltMod) {
        this.hicDiaUltMod = hicDiaUltMod;
    }

    public BigDecimal getHicDiaUltMod() {
        return this.hicDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setHicCveStCartera(String hicCveStCartera) {
        this.hicCveStCartera = hicCveStCartera;
    }

    public String getHicCveStCartera() {
        return this.hicCveStCartera;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM HISTCART ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getHicNumContrato() != null && this.getHicNumContrato().longValue() == -999) {
            conditions += " AND HIC_NUM_CONTRATO IS NULL";
        } else if (this.getHicNumContrato() != null) {
            conditions += " AND HIC_NUM_CONTRATO = ?";
            values.add(this.getHicNumContrato());
        }

        if (this.getHicCvePersFid() != null && "null".equals(this.getHicCvePersFid())) {
            conditions += " AND HIC_CVE_PERS_FID IS NULL";
        } else if (this.getHicCvePersFid() != null) {
            conditions += " AND HIC_CVE_PERS_FID = ?";
            values.add(this.getHicCvePersFid());
        }

        if (this.getHicNumPersFid() != null && this.getHicNumPersFid().longValue() == -999) {
            conditions += " AND HIC_NUM_PERS_FID IS NULL";
        } else if (this.getHicNumPersFid() != null) {
            conditions += " AND HIC_NUM_PERS_FID = ?";
            values.add(this.getHicNumPersFid());
        }

        if (this.getHicCveTipoHono() != null && "null".equals(this.getHicCveTipoHono())) {
            conditions += " AND HIC_CVE_TIPO_HONO IS NULL";
        } else if (this.getHicCveTipoHono() != null) {
            conditions += " AND HIC_CVE_TIPO_HONO = ?";
            values.add(this.getHicCveTipoHono());
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
        String sql = "SELECT * FROM HISTCART ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getHicNumContrato() != null && this.getHicNumContrato().longValue() == -999) {
            conditions += " AND HIC_NUM_CONTRATO IS NULL";
        } else if (this.getHicNumContrato() != null) {
            conditions += " AND HIC_NUM_CONTRATO = ?";
            values.add(this.getHicNumContrato());
        }

        if (this.getHicCvePersFid() != null && "null".equals(this.getHicCvePersFid())) {
            conditions += " AND HIC_CVE_PERS_FID IS NULL";
        } else if (this.getHicCvePersFid() != null) {
            conditions += " AND HIC_CVE_PERS_FID = ?";
            values.add(this.getHicCvePersFid());
        }

        if (this.getHicNumPersFid() != null && this.getHicNumPersFid().longValue() == -999) {
            conditions += " AND HIC_NUM_PERS_FID IS NULL";
        } else if (this.getHicNumPersFid() != null) {
            conditions += " AND HIC_NUM_PERS_FID = ?";
            values.add(this.getHicNumPersFid());
        }

        if (this.getHicCveTipoHono() != null && "null".equals(this.getHicCveTipoHono())) {
            conditions += " AND HIC_CVE_TIPO_HONO IS NULL";
        } else if (this.getHicCveTipoHono() != null) {
            conditions += " AND HIC_CVE_TIPO_HONO = ?";
            values.add(this.getHicCveTipoHono());
        }

        if (this.getHicImpHonor() != null && this.getHicImpHonor().longValue() == -999) {
            conditions += " AND HIC_IMP_HONOR IS NULL";
        } else if (this.getHicImpHonor() != null) {
            conditions += " AND HIC_IMP_HONOR = ?";
            values.add(this.getHicImpHonor());
        }

        if (this.getHicImpIvaHonor() != null && this.getHicImpIvaHonor().longValue() == -999) {
            conditions += " AND HIC_IMP_IVA_HONOR IS NULL";
        } else if (this.getHicImpIvaHonor() != null) {
            conditions += " AND HIC_IMP_IVA_HONOR = ?";
            values.add(this.getHicImpIvaHonor());
        }

        if (this.getHicImpExtemp() != null && this.getHicImpExtemp().longValue() == -999) {
            conditions += " AND HIC_IMP_EXTEMP IS NULL";
        } else if (this.getHicImpExtemp() != null) {
            conditions += " AND HIC_IMP_EXTEMP = ?";
            values.add(this.getHicImpExtemp());
        }

        if (this.getHicImpHonor30() != null && this.getHicImpHonor30().longValue() == -999) {
            conditions += " AND HIC_IMP_HONOR_30 IS NULL";
        } else if (this.getHicImpHonor30() != null) {
            conditions += " AND HIC_IMP_HONOR_30 = ?";
            values.add(this.getHicImpHonor30());
        }

        if (this.getHicImpIvaHon30() != null && this.getHicImpIvaHon30().longValue() == -999) {
            conditions += " AND HIC_IMP_IVA_HON_30 IS NULL";
        } else if (this.getHicImpIvaHon30() != null) {
            conditions += " AND HIC_IMP_IVA_HON_30 = ?";
            values.add(this.getHicImpIvaHon30());
        }

        if (this.getHicImpExtem30() != null && this.getHicImpExtem30().longValue() == -999) {
            conditions += " AND HIC_IMP_EXTEM_30 IS NULL";
        } else if (this.getHicImpExtem30() != null) {
            conditions += " AND HIC_IMP_EXTEM_30 = ?";
            values.add(this.getHicImpExtem30());
        }

        if (this.getHicImpHonor60() != null && this.getHicImpHonor60().longValue() == -999) {
            conditions += " AND HIC_IMP_HONOR_60 IS NULL";
        } else if (this.getHicImpHonor60() != null) {
            conditions += " AND HIC_IMP_HONOR_60 = ?";
            values.add(this.getHicImpHonor60());
        }

        if (this.getHicImpIvaHon60() != null && this.getHicImpIvaHon60().longValue() == -999) {
            conditions += " AND HIC_IMP_IVA_HON_60 IS NULL";
        } else if (this.getHicImpIvaHon60() != null) {
            conditions += " AND HIC_IMP_IVA_HON_60 = ?";
            values.add(this.getHicImpIvaHon60());
        }

        if (this.getHicImpExtem60() != null && this.getHicImpExtem60().longValue() == -999) {
            conditions += " AND HIC_IMP_EXTEM_60 IS NULL";
        } else if (this.getHicImpExtem60() != null) {
            conditions += " AND HIC_IMP_EXTEM_60 = ?";
            values.add(this.getHicImpExtem60());
        }

        if (this.getHicImpHonor90() != null && this.getHicImpHonor90().longValue() == -999) {
            conditions += " AND HIC_IMP_HONOR_90 IS NULL";
        } else if (this.getHicImpHonor90() != null) {
            conditions += " AND HIC_IMP_HONOR_90 = ?";
            values.add(this.getHicImpHonor90());
        }

        if (this.getHicImpIvaHon90() != null && this.getHicImpIvaHon90().longValue() == -999) {
            conditions += " AND HIC_IMP_IVA_HON_90 IS NULL";
        } else if (this.getHicImpIvaHon90() != null) {
            conditions += " AND HIC_IMP_IVA_HON_90 = ?";
            values.add(this.getHicImpIvaHon90());
        }

        if (this.getHicImpExtem90() != null && this.getHicImpExtem90().longValue() == -999) {
            conditions += " AND HIC_IMP_EXTEM_90 IS NULL";
        } else if (this.getHicImpExtem90() != null) {
            conditions += " AND HIC_IMP_EXTEM_90 = ?";
            values.add(this.getHicImpExtem90());
        }

        if (this.getHicNumRegDet() != null && this.getHicNumRegDet().longValue() == -999) {
            conditions += " AND HIC_NUM_REG_DET IS NULL";
        } else if (this.getHicNumRegDet() != null) {
            conditions += " AND HIC_NUM_REG_DET = ?";
            values.add(this.getHicNumRegDet());
        }

        if (this.getHicImpRegDet() != null && this.getHicImpRegDet().longValue() == -999) {
            conditions += " AND HIC_IMP_REG_DET IS NULL";
        } else if (this.getHicImpRegDet() != null) {
            conditions += " AND HIC_IMP_REG_DET = ?";
            values.add(this.getHicImpRegDet());
        }

        if (this.getHicNumPagosMes() != null && this.getHicNumPagosMes().longValue() == -999) {
            conditions += " AND HIC_NUM_PAGOS_MES IS NULL";
        } else if (this.getHicNumPagosMes() != null) {
            conditions += " AND HIC_NUM_PAGOS_MES = ?";
            values.add(this.getHicNumPagosMes());
        }

        if (this.getHicImpPagosMes() != null && this.getHicImpPagosMes().longValue() == -999) {
            conditions += " AND HIC_IMP_PAGOS_MES IS NULL";
        } else if (this.getHicImpPagosMes() != null) {
            conditions += " AND HIC_IMP_PAGOS_MES = ?";
            values.add(this.getHicImpPagosMes());
        }

        if (this.getHicNumPagosFec() != null && this.getHicNumPagosFec().longValue() == -999) {
            conditions += " AND HIC_NUM_PAGOS_FEC IS NULL";
        } else if (this.getHicNumPagosFec() != null) {
            conditions += " AND HIC_NUM_PAGOS_FEC = ?";
            values.add(this.getHicNumPagosFec());
        }

        if (this.getHicImpPagosFec() != null && this.getHicImpPagosFec().longValue() == -999) {
            conditions += " AND HIC_IMP_PAGOS_FEC IS NULL";
        } else if (this.getHicImpPagosFec() != null) {
            conditions += " AND HIC_IMP_PAGOS_FEC = ?";
            values.add(this.getHicImpPagosFec());
        }

        if (this.getHicCveCalifCart() != null && "null".equals(this.getHicCveCalifCart())) {
            conditions += " AND HIC_CVE_CALIF_CART IS NULL";
        } else if (this.getHicCveCalifCart() != null) {
            conditions += " AND HIC_CVE_CALIF_CART = ?";
            values.add(this.getHicCveCalifCart());
        }

        if (this.getHicAnoAltaReg() != null && this.getHicAnoAltaReg().longValue() == -999) {
            conditions += " AND HIC_ANO_ALTA_REG IS NULL";
        } else if (this.getHicAnoAltaReg() != null) {
            conditions += " AND HIC_ANO_ALTA_REG = ?";
            values.add(this.getHicAnoAltaReg());
        }

        if (this.getHicMesAltaReg() != null && this.getHicMesAltaReg().longValue() == -999) {
            conditions += " AND HIC_MES_ALTA_REG IS NULL";
        } else if (this.getHicMesAltaReg() != null) {
            conditions += " AND HIC_MES_ALTA_REG = ?";
            values.add(this.getHicMesAltaReg());
        }

        if (this.getHicDiaAltaReg() != null && this.getHicDiaAltaReg().longValue() == -999) {
            conditions += " AND HIC_DIA_ALTA_REG IS NULL";
        } else if (this.getHicDiaAltaReg() != null) {
            conditions += " AND HIC_DIA_ALTA_REG = ?";
            values.add(this.getHicDiaAltaReg());
        }

        if (this.getHicAnoUltMod() != null && this.getHicAnoUltMod().longValue() == -999) {
            conditions += " AND HIC_ANO_ULT_MOD IS NULL";
        } else if (this.getHicAnoUltMod() != null) {
            conditions += " AND HIC_ANO_ULT_MOD = ?";
            values.add(this.getHicAnoUltMod());
        }

        if (this.getHicMesUltMod() != null && this.getHicMesUltMod().longValue() == -999) {
            conditions += " AND HIC_MES_ULT_MOD IS NULL";
        } else if (this.getHicMesUltMod() != null) {
            conditions += " AND HIC_MES_ULT_MOD = ?";
            values.add(this.getHicMesUltMod());
        }

        if (this.getHicDiaUltMod() != null && this.getHicDiaUltMod().longValue() == -999) {
            conditions += " AND HIC_DIA_ULT_MOD IS NULL";
        } else if (this.getHicDiaUltMod() != null) {
            conditions += " AND HIC_DIA_ULT_MOD = ?";
            values.add(this.getHicDiaUltMod());
        }

        if (this.getHicCveStCartera() != null && "null".equals(this.getHicCveStCartera())) {
            conditions += " AND HIC_CVE_ST_CARTERA IS NULL";
        } else if (this.getHicCveStCartera() != null) {
            conditions += " AND HIC_CVE_ST_CARTERA = ?";
            values.add(this.getHicCveStCartera());
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
        String sql = "UPDATE HISTCART SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND HIC_NUM_CONTRATO = ?";
        pkValues.add(this.getHicNumContrato());
        conditions += " AND HIC_CVE_PERS_FID = ?";
        pkValues.add(this.getHicCvePersFid());
        conditions += " AND HIC_NUM_PERS_FID = ?";
        pkValues.add(this.getHicNumPersFid());
        conditions += " AND HIC_CVE_TIPO_HONO = ?";
        pkValues.add(this.getHicCveTipoHono());
        fields += " HIC_IMP_HONOR = ?, ";
        values.add(this.getHicImpHonor());
        fields += " HIC_IMP_IVA_HONOR = ?, ";
        values.add(this.getHicImpIvaHonor());
        fields += " HIC_IMP_EXTEMP = ?, ";
        values.add(this.getHicImpExtemp());
        fields += " HIC_IMP_HONOR_30 = ?, ";
        values.add(this.getHicImpHonor30());
        fields += " HIC_IMP_IVA_HON_30 = ?, ";
        values.add(this.getHicImpIvaHon30());
        fields += " HIC_IMP_EXTEM_30 = ?, ";
        values.add(this.getHicImpExtem30());
        fields += " HIC_IMP_HONOR_60 = ?, ";
        values.add(this.getHicImpHonor60());
        fields += " HIC_IMP_IVA_HON_60 = ?, ";
        values.add(this.getHicImpIvaHon60());
        fields += " HIC_IMP_EXTEM_60 = ?, ";
        values.add(this.getHicImpExtem60());
        fields += " HIC_IMP_HONOR_90 = ?, ";
        values.add(this.getHicImpHonor90());
        fields += " HIC_IMP_IVA_HON_90 = ?, ";
        values.add(this.getHicImpIvaHon90());
        fields += " HIC_IMP_EXTEM_90 = ?, ";
        values.add(this.getHicImpExtem90());
        fields += " HIC_NUM_REG_DET = ?, ";
        values.add(this.getHicNumRegDet());
        fields += " HIC_IMP_REG_DET = ?, ";
        values.add(this.getHicImpRegDet());
        fields += " HIC_NUM_PAGOS_MES = ?, ";
        values.add(this.getHicNumPagosMes());
        fields += " HIC_IMP_PAGOS_MES = ?, ";
        values.add(this.getHicImpPagosMes());
        fields += " HIC_NUM_PAGOS_FEC = ?, ";
        values.add(this.getHicNumPagosFec());
        fields += " HIC_IMP_PAGOS_FEC = ?, ";
        values.add(this.getHicImpPagosFec());
        fields += " HIC_CVE_CALIF_CART = ?, ";
        values.add(this.getHicCveCalifCart());
        fields += " HIC_ANO_ALTA_REG = ?, ";
        values.add(this.getHicAnoAltaReg());
        fields += " HIC_MES_ALTA_REG = ?, ";
        values.add(this.getHicMesAltaReg());
        fields += " HIC_DIA_ALTA_REG = ?, ";
        values.add(this.getHicDiaAltaReg());
        fields += " HIC_ANO_ULT_MOD = ?, ";
        values.add(this.getHicAnoUltMod());
        fields += " HIC_MES_ULT_MOD = ?, ";
        values.add(this.getHicMesUltMod());
        fields += " HIC_DIA_ULT_MOD = ?, ";
        values.add(this.getHicDiaUltMod());
        fields += " HIC_CVE_ST_CARTERA = ?, ";
        values.add(this.getHicCveStCartera());
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
        String sql = "INSERT INTO HISTCART ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", HIC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getHicNumContrato());

        fields += ", HIC_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getHicCvePersFid());

        fields += ", HIC_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getHicNumPersFid());

        fields += ", HIC_CVE_TIPO_HONO";
        fieldValues += ", ?";
        values.add(this.getHicCveTipoHono());

        fields += ", HIC_IMP_HONOR";
        fieldValues += ", ?";
        values.add(this.getHicImpHonor());

        fields += ", HIC_IMP_IVA_HONOR";
        fieldValues += ", ?";
        values.add(this.getHicImpIvaHonor());

        fields += ", HIC_IMP_EXTEMP";
        fieldValues += ", ?";
        values.add(this.getHicImpExtemp());

        fields += ", HIC_IMP_HONOR_30";
        fieldValues += ", ?";
        values.add(this.getHicImpHonor30());

        fields += ", HIC_IMP_IVA_HON_30";
        fieldValues += ", ?";
        values.add(this.getHicImpIvaHon30());

        fields += ", HIC_IMP_EXTEM_30";
        fieldValues += ", ?";
        values.add(this.getHicImpExtem30());

        fields += ", HIC_IMP_HONOR_60";
        fieldValues += ", ?";
        values.add(this.getHicImpHonor60());

        fields += ", HIC_IMP_IVA_HON_60";
        fieldValues += ", ?";
        values.add(this.getHicImpIvaHon60());

        fields += ", HIC_IMP_EXTEM_60";
        fieldValues += ", ?";
        values.add(this.getHicImpExtem60());

        fields += ", HIC_IMP_HONOR_90";
        fieldValues += ", ?";
        values.add(this.getHicImpHonor90());

        fields += ", HIC_IMP_IVA_HON_90";
        fieldValues += ", ?";
        values.add(this.getHicImpIvaHon90());

        fields += ", HIC_IMP_EXTEM_90";
        fieldValues += ", ?";
        values.add(this.getHicImpExtem90());

        fields += ", HIC_NUM_REG_DET";
        fieldValues += ", ?";
        values.add(this.getHicNumRegDet());

        fields += ", HIC_IMP_REG_DET";
        fieldValues += ", ?";
        values.add(this.getHicImpRegDet());

        fields += ", HIC_NUM_PAGOS_MES";
        fieldValues += ", ?";
        values.add(this.getHicNumPagosMes());

        fields += ", HIC_IMP_PAGOS_MES";
        fieldValues += ", ?";
        values.add(this.getHicImpPagosMes());

        fields += ", HIC_NUM_PAGOS_FEC";
        fieldValues += ", ?";
        values.add(this.getHicNumPagosFec());

        fields += ", HIC_IMP_PAGOS_FEC";
        fieldValues += ", ?";
        values.add(this.getHicImpPagosFec());

        fields += ", HIC_CVE_CALIF_CART";
        fieldValues += ", ?";
        values.add(this.getHicCveCalifCart());

        fields += ", HIC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getHicAnoAltaReg());

        fields += ", HIC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getHicMesAltaReg());

        fields += ", HIC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getHicDiaAltaReg());

        fields += ", HIC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getHicAnoUltMod());

        fields += ", HIC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getHicMesUltMod());

        fields += ", HIC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getHicDiaUltMod());

        fields += ", HIC_CVE_ST_CARTERA";
        fieldValues += ", ?";
        values.add(this.getHicCveStCartera());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM HISTCART WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND HIC_NUM_CONTRATO = ?";
        values.add(this.getHicNumContrato());
        conditions += " AND HIC_CVE_PERS_FID = ?";
        values.add(this.getHicCvePersFid());
        conditions += " AND HIC_NUM_PERS_FID = ?";
        values.add(this.getHicNumPersFid());
        conditions += " AND HIC_CVE_TIPO_HONO = ?";
        values.add(this.getHicCveTipoHono());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Histcart instance = (Histcart) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getHicNumContrato().equals(instance.getHicNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getHicCvePersFid().equals(instance.getHicCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getHicNumPersFid().equals(instance.getHicNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getHicCveTipoHono().equals(instance.getHicCveTipoHono()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpHonor().equals(instance.getHicImpHonor()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpIvaHonor().equals(instance.getHicImpIvaHonor()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpExtemp().equals(instance.getHicImpExtemp()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpHonor30().equals(instance.getHicImpHonor30()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpIvaHon30().equals(instance.getHicImpIvaHon30()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpExtem30().equals(instance.getHicImpExtem30()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpHonor60().equals(instance.getHicImpHonor60()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpIvaHon60().equals(instance.getHicImpIvaHon60()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpExtem60().equals(instance.getHicImpExtem60()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpHonor90().equals(instance.getHicImpHonor90()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpIvaHon90().equals(instance.getHicImpIvaHon90()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpExtem90().equals(instance.getHicImpExtem90()))
            equalObjects = false;
        if (equalObjects && !this.getHicNumRegDet().equals(instance.getHicNumRegDet()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpRegDet().equals(instance.getHicImpRegDet()))
            equalObjects = false;
        if (equalObjects && !this.getHicNumPagosMes().equals(instance.getHicNumPagosMes()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpPagosMes().equals(instance.getHicImpPagosMes()))
            equalObjects = false;
        if (equalObjects && !this.getHicNumPagosFec().equals(instance.getHicNumPagosFec()))
            equalObjects = false;
        if (equalObjects && !this.getHicImpPagosFec().equals(instance.getHicImpPagosFec()))
            equalObjects = false;
        if (equalObjects && !this.getHicCveCalifCart().equals(instance.getHicCveCalifCart()))
            equalObjects = false;
        if (equalObjects && !this.getHicAnoAltaReg().equals(instance.getHicAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getHicMesAltaReg().equals(instance.getHicMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getHicDiaAltaReg().equals(instance.getHicDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getHicAnoUltMod().equals(instance.getHicAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getHicMesUltMod().equals(instance.getHicMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getHicDiaUltMod().equals(instance.getHicDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getHicCveStCartera().equals(instance.getHicCveStCartera()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Histcart result = new Histcart();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setHicNumContrato((BigDecimal) objectData.getData("HIC_NUM_CONTRATO"));
        result.setHicCvePersFid((String) objectData.getData("HIC_CVE_PERS_FID"));
        result.setHicNumPersFid((BigDecimal) objectData.getData("HIC_NUM_PERS_FID"));
        result.setHicCveTipoHono((String) objectData.getData("HIC_CVE_TIPO_HONO"));
        result.setHicImpHonor((BigDecimal) objectData.getData("HIC_IMP_HONOR"));
        result.setHicImpIvaHonor((BigDecimal) objectData.getData("HIC_IMP_IVA_HONOR"));
        result.setHicImpExtemp((BigDecimal) objectData.getData("HIC_IMP_EXTEMP"));
        result.setHicImpHonor30((BigDecimal) objectData.getData("HIC_IMP_HONOR_30"));
        result.setHicImpIvaHon30((BigDecimal) objectData.getData("HIC_IMP_IVA_HON_30"));
        result.setHicImpExtem30((BigDecimal) objectData.getData("HIC_IMP_EXTEM_30"));
        result.setHicImpHonor60((BigDecimal) objectData.getData("HIC_IMP_HONOR_60"));
        result.setHicImpIvaHon60((BigDecimal) objectData.getData("HIC_IMP_IVA_HON_60"));
        result.setHicImpExtem60((BigDecimal) objectData.getData("HIC_IMP_EXTEM_60"));
        result.setHicImpHonor90((BigDecimal) objectData.getData("HIC_IMP_HONOR_90"));
        result.setHicImpIvaHon90((BigDecimal) objectData.getData("HIC_IMP_IVA_HON_90"));
        result.setHicImpExtem90((BigDecimal) objectData.getData("HIC_IMP_EXTEM_90"));
        result.setHicNumRegDet((BigDecimal) objectData.getData("HIC_NUM_REG_DET"));
        result.setHicImpRegDet((BigDecimal) objectData.getData("HIC_IMP_REG_DET"));
        result.setHicNumPagosMes((BigDecimal) objectData.getData("HIC_NUM_PAGOS_MES"));
        result.setHicImpPagosMes((BigDecimal) objectData.getData("HIC_IMP_PAGOS_MES"));
        result.setHicNumPagosFec((BigDecimal) objectData.getData("HIC_NUM_PAGOS_FEC"));
        result.setHicImpPagosFec((BigDecimal) objectData.getData("HIC_IMP_PAGOS_FEC"));
        result.setHicCveCalifCart((String) objectData.getData("HIC_CVE_CALIF_CART"));
        result.setHicAnoAltaReg((BigDecimal) objectData.getData("HIC_ANO_ALTA_REG"));
        result.setHicMesAltaReg((BigDecimal) objectData.getData("HIC_MES_ALTA_REG"));
        result.setHicDiaAltaReg((BigDecimal) objectData.getData("HIC_DIA_ALTA_REG"));
        result.setHicAnoUltMod((BigDecimal) objectData.getData("HIC_ANO_ULT_MOD"));
        result.setHicMesUltMod((BigDecimal) objectData.getData("HIC_MES_ULT_MOD"));
        result.setHicDiaUltMod((BigDecimal) objectData.getData("HIC_DIA_ULT_MOD"));
        result.setHicCveStCartera((String) objectData.getData("HIC_CVE_ST_CARTERA"));

        return result;

    }

}
