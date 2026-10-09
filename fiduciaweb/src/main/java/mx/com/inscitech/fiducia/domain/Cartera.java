package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CARTERA_PK", columns = { "CAR_NUM_CONTRATO", "CAR_CVE_PERS_FID", "CAR_NUM_PERS_FID", "CAR_CVE_TIPO_HONO" }, sequences = { "MANUAL" })
public class Cartera extends DomainObject {

    public BigDecimal carNumContrato = null;
    public String carCvePersFid = null;
    public BigDecimal carNumPersFid = null;
    public String carCveTipoHono = null;
    public BigDecimal carImpHonor = null;
    BigDecimal carImpIvaHonor = null;
    BigDecimal carImpExtemp = null;
    public BigDecimal carImpHonor30 = null;
    BigDecimal carImpIvaHon30 = null;
    BigDecimal carImpExtem30 = null;
    public BigDecimal carImpHonor60 = null;
    BigDecimal carImpIvaHon60 = null;
    BigDecimal carImpExtem60 = null;
    public BigDecimal carImpHonor90 = null;
    BigDecimal carImpIvaHon90 = null;
    BigDecimal carImpExtem90 = null;
    BigDecimal carNumRegDet = null;
    BigDecimal carImpRegDet = null;
    BigDecimal carNumPagosMes = null;
    BigDecimal carImpPagosMes = null;
    BigDecimal carNumPagosFec = null;
    BigDecimal carImpPagosFec = null;
    String carCveCalifCart = null;
    BigDecimal carAnoAltaReg = null;
    BigDecimal carMesAltaReg = null;
    BigDecimal carDiaAltaReg = null;
    BigDecimal carAnoUltMod = null;
    BigDecimal carMesUltMod = null;
    BigDecimal carDiaUltMod = null;
    String carCveStCartera = null;
    BigDecimal carEjerAnoCurso = null;
    BigDecimal carEjerAnoAnte = null;

    public Cartera() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCarNumContrato(BigDecimal carNumContrato) {
        this.carNumContrato = carNumContrato;
    }

    public BigDecimal getCarNumContrato() {
        return this.carNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCarCvePersFid(String carCvePersFid) {
        this.carCvePersFid = carCvePersFid;
    }

    public String getCarCvePersFid() {
        return this.carCvePersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCarNumPersFid(BigDecimal carNumPersFid) {
        this.carNumPersFid = carNumPersFid;
    }

    public BigDecimal getCarNumPersFid() {
        return this.carNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCarCveTipoHono(String carCveTipoHono) {
        this.carCveTipoHono = carCveTipoHono;
    }

    public String getCarCveTipoHono() {
        return this.carCveTipoHono;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpHonor(BigDecimal carImpHonor) {
        this.carImpHonor = carImpHonor;
    }

    public BigDecimal getCarImpHonor() {
        return this.carImpHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpIvaHonor(BigDecimal carImpIvaHonor) {
        this.carImpIvaHonor = carImpIvaHonor;
    }

    public BigDecimal getCarImpIvaHonor() {
        return this.carImpIvaHonor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpExtemp(BigDecimal carImpExtemp) {
        this.carImpExtemp = carImpExtemp;
    }

    public BigDecimal getCarImpExtemp() {
        return this.carImpExtemp;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpHonor30(BigDecimal carImpHonor30) {
        this.carImpHonor30 = carImpHonor30;
    }

    public BigDecimal getCarImpHonor30() {
        return this.carImpHonor30;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpIvaHon30(BigDecimal carImpIvaHon30) {
        this.carImpIvaHon30 = carImpIvaHon30;
    }

    public BigDecimal getCarImpIvaHon30() {
        return this.carImpIvaHon30;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpExtem30(BigDecimal carImpExtem30) {
        this.carImpExtem30 = carImpExtem30;
    }

    public BigDecimal getCarImpExtem30() {
        return this.carImpExtem30;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpHonor60(BigDecimal carImpHonor60) {
        this.carImpHonor60 = carImpHonor60;
    }

    public BigDecimal getCarImpHonor60() {
        return this.carImpHonor60;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpIvaHon60(BigDecimal carImpIvaHon60) {
        this.carImpIvaHon60 = carImpIvaHon60;
    }

    public BigDecimal getCarImpIvaHon60() {
        return this.carImpIvaHon60;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpExtem60(BigDecimal carImpExtem60) {
        this.carImpExtem60 = carImpExtem60;
    }

    public BigDecimal getCarImpExtem60() {
        return this.carImpExtem60;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpHonor90(BigDecimal carImpHonor90) {
        this.carImpHonor90 = carImpHonor90;
    }

    public BigDecimal getCarImpHonor90() {
        return this.carImpHonor90;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpIvaHon90(BigDecimal carImpIvaHon90) {
        this.carImpIvaHon90 = carImpIvaHon90;
    }

    public BigDecimal getCarImpIvaHon90() {
        return this.carImpIvaHon90;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpExtem90(BigDecimal carImpExtem90) {
        this.carImpExtem90 = carImpExtem90;
    }

    public BigDecimal getCarImpExtem90() {
        return this.carImpExtem90;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCarNumRegDet(BigDecimal carNumRegDet) {
        this.carNumRegDet = carNumRegDet;
    }

    public BigDecimal getCarNumRegDet() {
        return this.carNumRegDet;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpRegDet(BigDecimal carImpRegDet) {
        this.carImpRegDet = carImpRegDet;
    }

    public BigDecimal getCarImpRegDet() {
        return this.carImpRegDet;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCarNumPagosMes(BigDecimal carNumPagosMes) {
        this.carNumPagosMes = carNumPagosMes;
    }

    public BigDecimal getCarNumPagosMes() {
        return this.carNumPagosMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpPagosMes(BigDecimal carImpPagosMes) {
        this.carImpPagosMes = carImpPagosMes;
    }

    public BigDecimal getCarImpPagosMes() {
        return this.carImpPagosMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCarNumPagosFec(BigDecimal carNumPagosFec) {
        this.carNumPagosFec = carNumPagosFec;
    }

    public BigDecimal getCarNumPagosFec() {
        return this.carNumPagosFec;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setCarImpPagosFec(BigDecimal carImpPagosFec) {
        this.carImpPagosFec = carImpPagosFec;
    }

    public BigDecimal getCarImpPagosFec() {
        return this.carImpPagosFec;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCarCveCalifCart(String carCveCalifCart) {
        this.carCveCalifCart = carCveCalifCart;
    }

    public String getCarCveCalifCart() {
        return this.carCveCalifCart;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCarAnoAltaReg(BigDecimal carAnoAltaReg) {
        this.carAnoAltaReg = carAnoAltaReg;
    }

    public BigDecimal getCarAnoAltaReg() {
        return this.carAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCarMesAltaReg(BigDecimal carMesAltaReg) {
        this.carMesAltaReg = carMesAltaReg;
    }

    public BigDecimal getCarMesAltaReg() {
        return this.carMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCarDiaAltaReg(BigDecimal carDiaAltaReg) {
        this.carDiaAltaReg = carDiaAltaReg;
    }

    public BigDecimal getCarDiaAltaReg() {
        return this.carDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCarAnoUltMod(BigDecimal carAnoUltMod) {
        this.carAnoUltMod = carAnoUltMod;
    }

    public BigDecimal getCarAnoUltMod() {
        return this.carAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCarMesUltMod(BigDecimal carMesUltMod) {
        this.carMesUltMod = carMesUltMod;
    }

    public BigDecimal getCarMesUltMod() {
        return this.carMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCarDiaUltMod(BigDecimal carDiaUltMod) {
        this.carDiaUltMod = carDiaUltMod;
    }

    public BigDecimal getCarDiaUltMod() {
        return this.carDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCarCveStCartera(String carCveStCartera) {
        this.carCveStCartera = carCveStCartera;
    }

    public String getCarCveStCartera() {
        return this.carCveStCartera;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setCarEjerAnoCurso(BigDecimal carEjerAnoCurso) {
        this.carEjerAnoCurso = carEjerAnoCurso;
    }

    public BigDecimal getCarEjerAnoCurso() {
        return this.carEjerAnoCurso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 2, javaClass = BigDecimal.class)
    public void setCarEjerAnoAnte(BigDecimal carEjerAnoAnte) {
        this.carEjerAnoAnte = carEjerAnoAnte;
    }

    public BigDecimal getCarEjerAnoAnte() {
        return this.carEjerAnoAnte;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CARTERA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCarNumContrato() != null && this.getCarNumContrato().longValue() == -999) {
            conditions += " AND CAR_NUM_CONTRATO IS NULL";
        } else if (this.getCarNumContrato() != null) {
            conditions += " AND CAR_NUM_CONTRATO = ?";
            values.add(this.getCarNumContrato());
        }

        if (this.getCarCvePersFid() != null && "null".equals(this.getCarCvePersFid())) {
            conditions += " AND CAR_CVE_PERS_FID IS NULL";
        } else if (this.getCarCvePersFid() != null) {
            conditions += " AND CAR_CVE_PERS_FID = ?";
            values.add(this.getCarCvePersFid());
        }

        if (this.getCarNumPersFid() != null && this.getCarNumPersFid().longValue() == -999) {
            conditions += " AND CAR_NUM_PERS_FID IS NULL";
        } else if (this.getCarNumPersFid() != null) {
            conditions += " AND CAR_NUM_PERS_FID = ?";
            values.add(this.getCarNumPersFid());
        }

        if (this.getCarCveTipoHono() != null && "null".equals(this.getCarCveTipoHono())) {
            conditions += " AND CAR_CVE_TIPO_HONO IS NULL";
        } else if (this.getCarCveTipoHono() != null) {
            conditions += " AND CAR_CVE_TIPO_HONO = ?";
            values.add(this.getCarCveTipoHono());
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
        String sql = "SELECT * FROM CARTERA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCarNumContrato() != null && this.getCarNumContrato().longValue() == -999) {
            conditions += " AND CAR_NUM_CONTRATO IS NULL";
        } else if (this.getCarNumContrato() != null) {
            conditions += " AND CAR_NUM_CONTRATO = ?";
            values.add(this.getCarNumContrato());
        }

        if (this.getCarCvePersFid() != null && "null".equals(this.getCarCvePersFid())) {
            conditions += " AND CAR_CVE_PERS_FID IS NULL";
        } else if (this.getCarCvePersFid() != null) {
            conditions += " AND CAR_CVE_PERS_FID = ?";
            values.add(this.getCarCvePersFid());
        }

        if (this.getCarNumPersFid() != null && this.getCarNumPersFid().longValue() == -999) {
            conditions += " AND CAR_NUM_PERS_FID IS NULL";
        } else if (this.getCarNumPersFid() != null) {
            conditions += " AND CAR_NUM_PERS_FID = ?";
            values.add(this.getCarNumPersFid());
        }

        if (this.getCarCveTipoHono() != null && "null".equals(this.getCarCveTipoHono())) {
            conditions += " AND CAR_CVE_TIPO_HONO IS NULL";
        } else if (this.getCarCveTipoHono() != null) {
            conditions += " AND CAR_CVE_TIPO_HONO = ?";
            values.add(this.getCarCveTipoHono());
        }

        if (this.getCarImpHonor() != null && this.getCarImpHonor().longValue() == -999) {
            conditions += " AND CAR_IMP_HONOR IS NULL";
        } else if (this.getCarImpHonor() != null) {
            conditions += " AND CAR_IMP_HONOR = ?";
            values.add(this.getCarImpHonor());
        }

        if (this.getCarImpIvaHonor() != null && this.getCarImpIvaHonor().longValue() == -999) {
            conditions += " AND CAR_IMP_IVA_HONOR IS NULL";
        } else if (this.getCarImpIvaHonor() != null) {
            conditions += " AND CAR_IMP_IVA_HONOR = ?";
            values.add(this.getCarImpIvaHonor());
        }

        if (this.getCarImpExtemp() != null && this.getCarImpExtemp().longValue() == -999) {
            conditions += " AND CAR_IMP_EXTEMP IS NULL";
        } else if (this.getCarImpExtemp() != null) {
            conditions += " AND CAR_IMP_EXTEMP = ?";
            values.add(this.getCarImpExtemp());
        }

        if (this.getCarImpHonor30() != null && this.getCarImpHonor30().longValue() == -999) {
            conditions += " AND CAR_IMP_HONOR_30 IS NULL";
        } else if (this.getCarImpHonor30() != null) {
            conditions += " AND CAR_IMP_HONOR_30 = ?";
            values.add(this.getCarImpHonor30());
        }

        if (this.getCarImpIvaHon30() != null && this.getCarImpIvaHon30().longValue() == -999) {
            conditions += " AND CAR_IMP_IVA_HON_30 IS NULL";
        } else if (this.getCarImpIvaHon30() != null) {
            conditions += " AND CAR_IMP_IVA_HON_30 = ?";
            values.add(this.getCarImpIvaHon30());
        }

        if (this.getCarImpExtem30() != null && this.getCarImpExtem30().longValue() == -999) {
            conditions += " AND CAR_IMP_EXTEM_30 IS NULL";
        } else if (this.getCarImpExtem30() != null) {
            conditions += " AND CAR_IMP_EXTEM_30 = ?";
            values.add(this.getCarImpExtem30());
        }

        if (this.getCarImpHonor60() != null && this.getCarImpHonor60().longValue() == -999) {
            conditions += " AND CAR_IMP_HONOR_60 IS NULL";
        } else if (this.getCarImpHonor60() != null) {
            conditions += " AND CAR_IMP_HONOR_60 = ?";
            values.add(this.getCarImpHonor60());
        }

        if (this.getCarImpIvaHon60() != null && this.getCarImpIvaHon60().longValue() == -999) {
            conditions += " AND CAR_IMP_IVA_HON_60 IS NULL";
        } else if (this.getCarImpIvaHon60() != null) {
            conditions += " AND CAR_IMP_IVA_HON_60 = ?";
            values.add(this.getCarImpIvaHon60());
        }

        if (this.getCarImpExtem60() != null && this.getCarImpExtem60().longValue() == -999) {
            conditions += " AND CAR_IMP_EXTEM_60 IS NULL";
        } else if (this.getCarImpExtem60() != null) {
            conditions += " AND CAR_IMP_EXTEM_60 = ?";
            values.add(this.getCarImpExtem60());
        }

        if (this.getCarImpHonor90() != null && this.getCarImpHonor90().longValue() == -999) {
            conditions += " AND CAR_IMP_HONOR_90 IS NULL";
        } else if (this.getCarImpHonor90() != null) {
            conditions += " AND CAR_IMP_HONOR_90 = ?";
            values.add(this.getCarImpHonor90());
        }

        if (this.getCarImpIvaHon90() != null && this.getCarImpIvaHon90().longValue() == -999) {
            conditions += " AND CAR_IMP_IVA_HON_90 IS NULL";
        } else if (this.getCarImpIvaHon90() != null) {
            conditions += " AND CAR_IMP_IVA_HON_90 = ?";
            values.add(this.getCarImpIvaHon90());
        }

        if (this.getCarImpExtem90() != null && this.getCarImpExtem90().longValue() == -999) {
            conditions += " AND CAR_IMP_EXTEM_90 IS NULL";
        } else if (this.getCarImpExtem90() != null) {
            conditions += " AND CAR_IMP_EXTEM_90 = ?";
            values.add(this.getCarImpExtem90());
        }

        if (this.getCarNumRegDet() != null && this.getCarNumRegDet().longValue() == -999) {
            conditions += " AND CAR_NUM_REG_DET IS NULL";
        } else if (this.getCarNumRegDet() != null) {
            conditions += " AND CAR_NUM_REG_DET = ?";
            values.add(this.getCarNumRegDet());
        }

        if (this.getCarImpRegDet() != null && this.getCarImpRegDet().longValue() == -999) {
            conditions += " AND CAR_IMP_REG_DET IS NULL";
        } else if (this.getCarImpRegDet() != null) {
            conditions += " AND CAR_IMP_REG_DET = ?";
            values.add(this.getCarImpRegDet());
        }

        if (this.getCarNumPagosMes() != null && this.getCarNumPagosMes().longValue() == -999) {
            conditions += " AND CAR_NUM_PAGOS_MES IS NULL";
        } else if (this.getCarNumPagosMes() != null) {
            conditions += " AND CAR_NUM_PAGOS_MES = ?";
            values.add(this.getCarNumPagosMes());
        }

        if (this.getCarImpPagosMes() != null && this.getCarImpPagosMes().longValue() == -999) {
            conditions += " AND CAR_IMP_PAGOS_MES IS NULL";
        } else if (this.getCarImpPagosMes() != null) {
            conditions += " AND CAR_IMP_PAGOS_MES = ?";
            values.add(this.getCarImpPagosMes());
        }

        if (this.getCarNumPagosFec() != null && this.getCarNumPagosFec().longValue() == -999) {
            conditions += " AND CAR_NUM_PAGOS_FEC IS NULL";
        } else if (this.getCarNumPagosFec() != null) {
            conditions += " AND CAR_NUM_PAGOS_FEC = ?";
            values.add(this.getCarNumPagosFec());
        }

        if (this.getCarImpPagosFec() != null && this.getCarImpPagosFec().longValue() == -999) {
            conditions += " AND CAR_IMP_PAGOS_FEC IS NULL";
        } else if (this.getCarImpPagosFec() != null) {
            conditions += " AND CAR_IMP_PAGOS_FEC = ?";
            values.add(this.getCarImpPagosFec());
        }

        if (this.getCarCveCalifCart() != null && "null".equals(this.getCarCveCalifCart())) {
            conditions += " AND CAR_CVE_CALIF_CART IS NULL";
        } else if (this.getCarCveCalifCart() != null) {
            conditions += " AND CAR_CVE_CALIF_CART = ?";
            values.add(this.getCarCveCalifCart());
        }

        if (this.getCarAnoAltaReg() != null && this.getCarAnoAltaReg().longValue() == -999) {
            conditions += " AND CAR_ANO_ALTA_REG IS NULL";
        } else if (this.getCarAnoAltaReg() != null) {
            conditions += " AND CAR_ANO_ALTA_REG = ?";
            values.add(this.getCarAnoAltaReg());
        }

        if (this.getCarMesAltaReg() != null && this.getCarMesAltaReg().longValue() == -999) {
            conditions += " AND CAR_MES_ALTA_REG IS NULL";
        } else if (this.getCarMesAltaReg() != null) {
            conditions += " AND CAR_MES_ALTA_REG = ?";
            values.add(this.getCarMesAltaReg());
        }

        if (this.getCarDiaAltaReg() != null && this.getCarDiaAltaReg().longValue() == -999) {
            conditions += " AND CAR_DIA_ALTA_REG IS NULL";
        } else if (this.getCarDiaAltaReg() != null) {
            conditions += " AND CAR_DIA_ALTA_REG = ?";
            values.add(this.getCarDiaAltaReg());
        }

        if (this.getCarAnoUltMod() != null && this.getCarAnoUltMod().longValue() == -999) {
            conditions += " AND CAR_ANO_ULT_MOD IS NULL";
        } else if (this.getCarAnoUltMod() != null) {
            conditions += " AND CAR_ANO_ULT_MOD = ?";
            values.add(this.getCarAnoUltMod());
        }

        if (this.getCarMesUltMod() != null && this.getCarMesUltMod().longValue() == -999) {
            conditions += " AND CAR_MES_ULT_MOD IS NULL";
        } else if (this.getCarMesUltMod() != null) {
            conditions += " AND CAR_MES_ULT_MOD = ?";
            values.add(this.getCarMesUltMod());
        }

        if (this.getCarDiaUltMod() != null && this.getCarDiaUltMod().longValue() == -999) {
            conditions += " AND CAR_DIA_ULT_MOD IS NULL";
        } else if (this.getCarDiaUltMod() != null) {
            conditions += " AND CAR_DIA_ULT_MOD = ?";
            values.add(this.getCarDiaUltMod());
        }

        if (this.getCarCveStCartera() != null && "null".equals(this.getCarCveStCartera())) {
            conditions += " AND CAR_CVE_ST_CARTERA IS NULL";
        } else if (this.getCarCveStCartera() != null) {
            conditions += " AND CAR_CVE_ST_CARTERA = ?";
            values.add(this.getCarCveStCartera());
        }

        if (this.getCarEjerAnoCurso() != null && this.getCarEjerAnoCurso().longValue() == -999) {
            conditions += " AND CAR_EJER_ANO_CURSO IS NULL";
        } else if (this.getCarEjerAnoCurso() != null) {
            conditions += " AND CAR_EJER_ANO_CURSO = ?";
            values.add(this.getCarEjerAnoCurso());
        }

        if (this.getCarEjerAnoAnte() != null && this.getCarEjerAnoAnte().longValue() == -999) {
            conditions += " AND CAR_EJER_ANO_ANTE IS NULL";
        } else if (this.getCarEjerAnoAnte() != null) {
            conditions += " AND CAR_EJER_ANO_ANTE = ?";
            values.add(this.getCarEjerAnoAnte());
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
        String sql = "UPDATE CARTERA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CAR_NUM_CONTRATO = ?";
        pkValues.add(this.getCarNumContrato());
        conditions += " AND CAR_CVE_PERS_FID = ?";
        pkValues.add(this.getCarCvePersFid());
        conditions += " AND CAR_NUM_PERS_FID = ?";
        pkValues.add(this.getCarNumPersFid());
        conditions += " AND CAR_CVE_TIPO_HONO = ?";
        pkValues.add(this.getCarCveTipoHono());
        fields += " CAR_IMP_HONOR = ?, ";
        values.add(this.getCarImpHonor());
        fields += " CAR_IMP_IVA_HONOR = ?, ";
        values.add(this.getCarImpIvaHonor());
        fields += " CAR_IMP_EXTEMP = ?, ";
        values.add(this.getCarImpExtemp());
        fields += " CAR_IMP_HONOR_30 = ?, ";
        values.add(this.getCarImpHonor30());
        fields += " CAR_IMP_IVA_HON_30 = ?, ";
        values.add(this.getCarImpIvaHon30());
        fields += " CAR_IMP_EXTEM_30 = ?, ";
        values.add(this.getCarImpExtem30());
        fields += " CAR_IMP_HONOR_60 = ?, ";
        values.add(this.getCarImpHonor60());
        fields += " CAR_IMP_IVA_HON_60 = ?, ";
        values.add(this.getCarImpIvaHon60());
        fields += " CAR_IMP_EXTEM_60 = ?, ";
        values.add(this.getCarImpExtem60());
        fields += " CAR_IMP_HONOR_90 = ?, ";
        values.add(this.getCarImpHonor90());
        fields += " CAR_IMP_IVA_HON_90 = ?, ";
        values.add(this.getCarImpIvaHon90());
        fields += " CAR_IMP_EXTEM_90 = ?, ";
        values.add(this.getCarImpExtem90());
        fields += " CAR_NUM_REG_DET = ?, ";
        values.add(this.getCarNumRegDet());
        fields += " CAR_IMP_REG_DET = ?, ";
        values.add(this.getCarImpRegDet());
        fields += " CAR_NUM_PAGOS_MES = ?, ";
        values.add(this.getCarNumPagosMes());
        fields += " CAR_IMP_PAGOS_MES = ?, ";
        values.add(this.getCarImpPagosMes());
        fields += " CAR_NUM_PAGOS_FEC = ?, ";
        values.add(this.getCarNumPagosFec());
        fields += " CAR_IMP_PAGOS_FEC = ?, ";
        values.add(this.getCarImpPagosFec());
        fields += " CAR_CVE_CALIF_CART = ?, ";
        values.add(this.getCarCveCalifCart());
        fields += " CAR_ANO_ALTA_REG = ?, ";
        values.add(this.getCarAnoAltaReg());
        fields += " CAR_MES_ALTA_REG = ?, ";
        values.add(this.getCarMesAltaReg());
        fields += " CAR_DIA_ALTA_REG = ?, ";
        values.add(this.getCarDiaAltaReg());
        fields += " CAR_ANO_ULT_MOD = ?, ";
        values.add(this.getCarAnoUltMod());
        fields += " CAR_MES_ULT_MOD = ?, ";
        values.add(this.getCarMesUltMod());
        fields += " CAR_DIA_ULT_MOD = ?, ";
        values.add(this.getCarDiaUltMod());
        fields += " CAR_CVE_ST_CARTERA = ?, ";
        values.add(this.getCarCveStCartera());
        fields += " CAR_EJER_ANO_CURSO = ?, ";
        values.add(this.getCarEjerAnoCurso());
        fields += " CAR_EJER_ANO_ANTE = ?, ";
        values.add(this.getCarEjerAnoAnte());
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
        String sql = "INSERT INTO CARTERA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CAR_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCarNumContrato());

        fields += ", CAR_CVE_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getCarCvePersFid());

        fields += ", CAR_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getCarNumPersFid());

        fields += ", CAR_CVE_TIPO_HONO";
        fieldValues += ", ?";
        values.add(this.getCarCveTipoHono());

        fields += ", CAR_IMP_HONOR";
        fieldValues += ", ?";
        values.add(this.getCarImpHonor());

        fields += ", CAR_IMP_IVA_HONOR";
        fieldValues += ", ?";
        values.add(this.getCarImpIvaHonor());

        fields += ", CAR_IMP_EXTEMP";
        fieldValues += ", ?";
        values.add(this.getCarImpExtemp());

        fields += ", CAR_IMP_HONOR_30";
        fieldValues += ", ?";
        values.add(this.getCarImpHonor30());

        fields += ", CAR_IMP_IVA_HON_30";
        fieldValues += ", ?";
        values.add(this.getCarImpIvaHon30());

        fields += ", CAR_IMP_EXTEM_30";
        fieldValues += ", ?";
        values.add(this.getCarImpExtem30());

        fields += ", CAR_IMP_HONOR_60";
        fieldValues += ", ?";
        values.add(this.getCarImpHonor60());

        fields += ", CAR_IMP_IVA_HON_60";
        fieldValues += ", ?";
        values.add(this.getCarImpIvaHon60());

        fields += ", CAR_IMP_EXTEM_60";
        fieldValues += ", ?";
        values.add(this.getCarImpExtem60());

        fields += ", CAR_IMP_HONOR_90";
        fieldValues += ", ?";
        values.add(this.getCarImpHonor90());

        fields += ", CAR_IMP_IVA_HON_90";
        fieldValues += ", ?";
        values.add(this.getCarImpIvaHon90());

        fields += ", CAR_IMP_EXTEM_90";
        fieldValues += ", ?";
        values.add(this.getCarImpExtem90());

        fields += ", CAR_NUM_REG_DET";
        fieldValues += ", ?";
        values.add(this.getCarNumRegDet());

        fields += ", CAR_IMP_REG_DET";
        fieldValues += ", ?";
        values.add(this.getCarImpRegDet());

        fields += ", CAR_NUM_PAGOS_MES";
        fieldValues += ", ?";
        values.add(this.getCarNumPagosMes());

        fields += ", CAR_IMP_PAGOS_MES";
        fieldValues += ", ?";
        values.add(this.getCarImpPagosMes());

        fields += ", CAR_NUM_PAGOS_FEC";
        fieldValues += ", ?";
        values.add(this.getCarNumPagosFec());

        fields += ", CAR_IMP_PAGOS_FEC";
        fieldValues += ", ?";
        values.add(this.getCarImpPagosFec());

        fields += ", CAR_CVE_CALIF_CART";
        fieldValues += ", ?";
        values.add(this.getCarCveCalifCart());

        fields += ", CAR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCarAnoAltaReg());

        fields += ", CAR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCarMesAltaReg());

        fields += ", CAR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCarDiaAltaReg());

        fields += ", CAR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCarAnoUltMod());

        fields += ", CAR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCarMesUltMod());

        fields += ", CAR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCarDiaUltMod());

        fields += ", CAR_CVE_ST_CARTERA";
        fieldValues += ", ?";
        values.add(this.getCarCveStCartera());

        fields += ", CAR_EJER_ANO_CURSO";
        fieldValues += ", ?";
        values.add(this.getCarEjerAnoCurso());

        fields += ", CAR_EJER_ANO_ANTE";
        fieldValues += ", ?";
        values.add(this.getCarEjerAnoAnte());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CARTERA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CAR_NUM_CONTRATO = ?";
        values.add(this.getCarNumContrato());
        conditions += " AND CAR_CVE_PERS_FID = ?";
        values.add(this.getCarCvePersFid());
        conditions += " AND CAR_NUM_PERS_FID = ?";
        values.add(this.getCarNumPersFid());
        conditions += " AND CAR_CVE_TIPO_HONO = ?";
        values.add(this.getCarCveTipoHono());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Cartera instance = (Cartera) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCarNumContrato().equals(instance.getCarNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCarCvePersFid().equals(instance.getCarCvePersFid()))
            equalObjects = false;
        if (equalObjects && !this.getCarNumPersFid().equals(instance.getCarNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getCarCveTipoHono().equals(instance.getCarCveTipoHono()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpHonor().equals(instance.getCarImpHonor()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpIvaHonor().equals(instance.getCarImpIvaHonor()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpExtemp().equals(instance.getCarImpExtemp()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpHonor30().equals(instance.getCarImpHonor30()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpIvaHon30().equals(instance.getCarImpIvaHon30()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpExtem30().equals(instance.getCarImpExtem30()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpHonor60().equals(instance.getCarImpHonor60()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpIvaHon60().equals(instance.getCarImpIvaHon60()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpExtem60().equals(instance.getCarImpExtem60()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpHonor90().equals(instance.getCarImpHonor90()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpIvaHon90().equals(instance.getCarImpIvaHon90()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpExtem90().equals(instance.getCarImpExtem90()))
            equalObjects = false;
        if (equalObjects && !this.getCarNumRegDet().equals(instance.getCarNumRegDet()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpRegDet().equals(instance.getCarImpRegDet()))
            equalObjects = false;
        if (equalObjects && !this.getCarNumPagosMes().equals(instance.getCarNumPagosMes()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpPagosMes().equals(instance.getCarImpPagosMes()))
            equalObjects = false;
        if (equalObjects && !this.getCarNumPagosFec().equals(instance.getCarNumPagosFec()))
            equalObjects = false;
        if (equalObjects && !this.getCarImpPagosFec().equals(instance.getCarImpPagosFec()))
            equalObjects = false;
        if (equalObjects && !this.getCarCveCalifCart().equals(instance.getCarCveCalifCart()))
            equalObjects = false;
        if (equalObjects && !this.getCarAnoAltaReg().equals(instance.getCarAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCarMesAltaReg().equals(instance.getCarMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCarDiaAltaReg().equals(instance.getCarDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCarAnoUltMod().equals(instance.getCarAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCarMesUltMod().equals(instance.getCarMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCarDiaUltMod().equals(instance.getCarDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCarCveStCartera().equals(instance.getCarCveStCartera()))
            equalObjects = false;
        if (equalObjects && !this.getCarEjerAnoCurso().equals(instance.getCarEjerAnoCurso()))
            equalObjects = false;
        if (equalObjects && !this.getCarEjerAnoAnte().equals(instance.getCarEjerAnoAnte()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cartera result = new Cartera();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCarNumContrato((BigDecimal) objectData.getData("CAR_NUM_CONTRATO"));
        result.setCarCvePersFid((String) objectData.getData("CAR_CVE_PERS_FID"));
        result.setCarNumPersFid((BigDecimal) objectData.getData("CAR_NUM_PERS_FID"));
        result.setCarCveTipoHono((String) objectData.getData("CAR_CVE_TIPO_HONO"));
        result.setCarImpHonor((BigDecimal) objectData.getData("CAR_IMP_HONOR"));
        result.setCarImpIvaHonor((BigDecimal) objectData.getData("CAR_IMP_IVA_HONOR"));
        result.setCarImpExtemp((BigDecimal) objectData.getData("CAR_IMP_EXTEMP"));
        result.setCarImpHonor30((BigDecimal) objectData.getData("CAR_IMP_HONOR_30"));
        result.setCarImpIvaHon30((BigDecimal) objectData.getData("CAR_IMP_IVA_HON_30"));
        result.setCarImpExtem30((BigDecimal) objectData.getData("CAR_IMP_EXTEM_30"));
        result.setCarImpHonor60((BigDecimal) objectData.getData("CAR_IMP_HONOR_60"));
        result.setCarImpIvaHon60((BigDecimal) objectData.getData("CAR_IMP_IVA_HON_60"));
        result.setCarImpExtem60((BigDecimal) objectData.getData("CAR_IMP_EXTEM_60"));
        result.setCarImpHonor90((BigDecimal) objectData.getData("CAR_IMP_HONOR_90"));
        result.setCarImpIvaHon90((BigDecimal) objectData.getData("CAR_IMP_IVA_HON_90"));
        result.setCarImpExtem90((BigDecimal) objectData.getData("CAR_IMP_EXTEM_90"));
        result.setCarNumRegDet((BigDecimal) objectData.getData("CAR_NUM_REG_DET"));
        result.setCarImpRegDet((BigDecimal) objectData.getData("CAR_IMP_REG_DET"));
        result.setCarNumPagosMes((BigDecimal) objectData.getData("CAR_NUM_PAGOS_MES"));
        result.setCarImpPagosMes((BigDecimal) objectData.getData("CAR_IMP_PAGOS_MES"));
        result.setCarNumPagosFec((BigDecimal) objectData.getData("CAR_NUM_PAGOS_FEC"));
        result.setCarImpPagosFec((BigDecimal) objectData.getData("CAR_IMP_PAGOS_FEC"));
        result.setCarCveCalifCart((String) objectData.getData("CAR_CVE_CALIF_CART"));
        result.setCarAnoAltaReg((BigDecimal) objectData.getData("CAR_ANO_ALTA_REG"));
        result.setCarMesAltaReg((BigDecimal) objectData.getData("CAR_MES_ALTA_REG"));
        result.setCarDiaAltaReg((BigDecimal) objectData.getData("CAR_DIA_ALTA_REG"));
        result.setCarAnoUltMod((BigDecimal) objectData.getData("CAR_ANO_ULT_MOD"));
        result.setCarMesUltMod((BigDecimal) objectData.getData("CAR_MES_ULT_MOD"));
        result.setCarDiaUltMod((BigDecimal) objectData.getData("CAR_DIA_ULT_MOD"));
        result.setCarCveStCartera((String) objectData.getData("CAR_CVE_ST_CARTERA"));
        result.setCarEjerAnoCurso((BigDecimal) objectData.getData("CAR_EJER_ANO_CURSO"));
        result.setCarEjerAnoAnte((BigDecimal) objectData.getData("CAR_EJER_ANO_ANTE"));

        return result;

    }

}
