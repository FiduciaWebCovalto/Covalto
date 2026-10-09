package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "POSICINT_PK", columns = { "POI_ENTIDAD_FIN", "POI_CONTRATO_INTER", "POI_CVE_TIPO_MERCA", "POI_NUM_INSTRUME", "POI_NUM_SEC_EMIS" },
            sequences = { "MANUAL" })
public class Posicint extends DomainObject {

    BigDecimal poiEntidadFin = null;
    BigDecimal poiContratoInter = null;
    BigDecimal poiCveTipoMerca = null;
    BigDecimal poiNumInstrume = null;
    BigDecimal poiNumSecEmis = null;
    String poiNomPizarra = null;
    String poiNumSerEmis = null;
    BigDecimal poiNumCuponVig = null;
    BigDecimal poiCveGarantia = null;
    BigDecimal poiPosicIniPer = null;
    BigDecimal poiVtasPosPer = null;
    BigDecimal poiCpasPosPer = null;
    BigDecimal poiPosicIniEjer = null;
    BigDecimal poiVtasPosEjer = null;
    BigDecimal poiCpasPosEjer = null;
    BigDecimal poiPosicActual = null;
    BigDecimal poiPosicComprom = null;
    BigDecimal poiCostoHistoric = null;
    BigDecimal poiAnoUltMovto = null;
    BigDecimal poiMesUltMovto = null;
    BigDecimal poiDiaUltMovto = null;
    BigDecimal poiAnoAltaReg = null;
    BigDecimal poiMesAltaReg = null;
    BigDecimal poiDiaAltaReg = null;
    BigDecimal poiAnoUltMod = null;
    BigDecimal poiMesUltMod = null;
    BigDecimal poiDiaUltMod = null;
    String poiCveStPosicin = null;

    public Posicint() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiEntidadFin(BigDecimal poiEntidadFin) {
        this.poiEntidadFin = poiEntidadFin;
    }

    public BigDecimal getPoiEntidadFin() {
        return this.poiEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiContratoInter(BigDecimal poiContratoInter) {
        this.poiContratoInter = poiContratoInter;
    }

    public BigDecimal getPoiContratoInter() {
        return this.poiContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiCveTipoMerca(BigDecimal poiCveTipoMerca) {
        this.poiCveTipoMerca = poiCveTipoMerca;
    }

    public BigDecimal getPoiCveTipoMerca() {
        return this.poiCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiNumInstrume(BigDecimal poiNumInstrume) {
        this.poiNumInstrume = poiNumInstrume;
    }

    public BigDecimal getPoiNumInstrume() {
        return this.poiNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiNumSecEmis(BigDecimal poiNumSecEmis) {
        this.poiNumSecEmis = poiNumSecEmis;
    }

    public BigDecimal getPoiNumSecEmis() {
        return this.poiNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPoiNomPizarra(String poiNomPizarra) {
        this.poiNomPizarra = poiNomPizarra;
    }

    public String getPoiNomPizarra() {
        return this.poiNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPoiNumSerEmis(String poiNumSerEmis) {
        this.poiNumSerEmis = poiNumSerEmis;
    }

    public String getPoiNumSerEmis() {
        return this.poiNumSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiNumCuponVig(BigDecimal poiNumCuponVig) {
        this.poiNumCuponVig = poiNumCuponVig;
    }

    public BigDecimal getPoiNumCuponVig() {
        return this.poiNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiCveGarantia(BigDecimal poiCveGarantia) {
        this.poiCveGarantia = poiCveGarantia;
    }

    public BigDecimal getPoiCveGarantia() {
        return this.poiCveGarantia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiPosicIniPer(BigDecimal poiPosicIniPer) {
        this.poiPosicIniPer = poiPosicIniPer;
    }

    public BigDecimal getPoiPosicIniPer() {
        return this.poiPosicIniPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiVtasPosPer(BigDecimal poiVtasPosPer) {
        this.poiVtasPosPer = poiVtasPosPer;
    }

    public BigDecimal getPoiVtasPosPer() {
        return this.poiVtasPosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiCpasPosPer(BigDecimal poiCpasPosPer) {
        this.poiCpasPosPer = poiCpasPosPer;
    }

    public BigDecimal getPoiCpasPosPer() {
        return this.poiCpasPosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiPosicIniEjer(BigDecimal poiPosicIniEjer) {
        this.poiPosicIniEjer = poiPosicIniEjer;
    }

    public BigDecimal getPoiPosicIniEjer() {
        return this.poiPosicIniEjer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiVtasPosEjer(BigDecimal poiVtasPosEjer) {
        this.poiVtasPosEjer = poiVtasPosEjer;
    }

    public BigDecimal getPoiVtasPosEjer() {
        return this.poiVtasPosEjer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiCpasPosEjer(BigDecimal poiCpasPosEjer) {
        this.poiCpasPosEjer = poiCpasPosEjer;
    }

    public BigDecimal getPoiCpasPosEjer() {
        return this.poiCpasPosEjer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiPosicActual(BigDecimal poiPosicActual) {
        this.poiPosicActual = poiPosicActual;
    }

    public BigDecimal getPoiPosicActual() {
        return this.poiPosicActual;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoiPosicComprom(BigDecimal poiPosicComprom) {
        this.poiPosicComprom = poiPosicComprom;
    }

    public BigDecimal getPoiPosicComprom() {
        return this.poiPosicComprom;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPoiCostoHistoric(BigDecimal poiCostoHistoric) {
        this.poiCostoHistoric = poiCostoHistoric;
    }

    public BigDecimal getPoiCostoHistoric() {
        return this.poiCostoHistoric;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPoiAnoUltMovto(BigDecimal poiAnoUltMovto) {
        this.poiAnoUltMovto = poiAnoUltMovto;
    }

    public BigDecimal getPoiAnoUltMovto() {
        return this.poiAnoUltMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPoiMesUltMovto(BigDecimal poiMesUltMovto) {
        this.poiMesUltMovto = poiMesUltMovto;
    }

    public BigDecimal getPoiMesUltMovto() {
        return this.poiMesUltMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPoiDiaUltMovto(BigDecimal poiDiaUltMovto) {
        this.poiDiaUltMovto = poiDiaUltMovto;
    }

    public BigDecimal getPoiDiaUltMovto() {
        return this.poiDiaUltMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPoiAnoAltaReg(BigDecimal poiAnoAltaReg) {
        this.poiAnoAltaReg = poiAnoAltaReg;
    }

    public BigDecimal getPoiAnoAltaReg() {
        return this.poiAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPoiMesAltaReg(BigDecimal poiMesAltaReg) {
        this.poiMesAltaReg = poiMesAltaReg;
    }

    public BigDecimal getPoiMesAltaReg() {
        return this.poiMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPoiDiaAltaReg(BigDecimal poiDiaAltaReg) {
        this.poiDiaAltaReg = poiDiaAltaReg;
    }

    public BigDecimal getPoiDiaAltaReg() {
        return this.poiDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPoiAnoUltMod(BigDecimal poiAnoUltMod) {
        this.poiAnoUltMod = poiAnoUltMod;
    }

    public BigDecimal getPoiAnoUltMod() {
        return this.poiAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPoiMesUltMod(BigDecimal poiMesUltMod) {
        this.poiMesUltMod = poiMesUltMod;
    }

    public BigDecimal getPoiMesUltMod() {
        return this.poiMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPoiDiaUltMod(BigDecimal poiDiaUltMod) {
        this.poiDiaUltMod = poiDiaUltMod;
    }

    public BigDecimal getPoiDiaUltMod() {
        return this.poiDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPoiCveStPosicin(String poiCveStPosicin) {
        this.poiCveStPosicin = poiCveStPosicin;
    }

    public String getPoiCveStPosicin() {
        return this.poiCveStPosicin;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM POSICINT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPoiEntidadFin() != null && this.getPoiEntidadFin().longValue() == -999) {
            conditions += " AND POI_ENTIDAD_FIN IS NULL";
        } else if (this.getPoiEntidadFin() != null) {
            conditions += " AND POI_ENTIDAD_FIN = ?";
            values.add(this.getPoiEntidadFin());
        }

        if (this.getPoiContratoInter() != null && this.getPoiContratoInter().longValue() == -999) {
            conditions += " AND POI_CONTRATO_INTER IS NULL";
        } else if (this.getPoiContratoInter() != null) {
            conditions += " AND POI_CONTRATO_INTER = ?";
            values.add(this.getPoiContratoInter());
        }

        if (this.getPoiCveTipoMerca() != null && this.getPoiCveTipoMerca().longValue() == -999) {
            conditions += " AND POI_CVE_TIPO_MERCA IS NULL";
        } else if (this.getPoiCveTipoMerca() != null) {
            conditions += " AND POI_CVE_TIPO_MERCA = ?";
            values.add(this.getPoiCveTipoMerca());
        }

        if (this.getPoiNumInstrume() != null && this.getPoiNumInstrume().longValue() == -999) {
            conditions += " AND POI_NUM_INSTRUME IS NULL";
        } else if (this.getPoiNumInstrume() != null) {
            conditions += " AND POI_NUM_INSTRUME = ?";
            values.add(this.getPoiNumInstrume());
        }

        if (this.getPoiNumSecEmis() != null && this.getPoiNumSecEmis().longValue() == -999) {
            conditions += " AND POI_NUM_SEC_EMIS IS NULL";
        } else if (this.getPoiNumSecEmis() != null) {
            conditions += " AND POI_NUM_SEC_EMIS = ?";
            values.add(this.getPoiNumSecEmis());
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
        String sql = "SELECT * FROM POSICINT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPoiEntidadFin() != null && this.getPoiEntidadFin().longValue() == -999) {
            conditions += " AND POI_ENTIDAD_FIN IS NULL";
        } else if (this.getPoiEntidadFin() != null) {
            conditions += " AND POI_ENTIDAD_FIN = ?";
            values.add(this.getPoiEntidadFin());
        }

        if (this.getPoiContratoInter() != null && this.getPoiContratoInter().longValue() == -999) {
            conditions += " AND POI_CONTRATO_INTER IS NULL";
        } else if (this.getPoiContratoInter() != null) {
            conditions += " AND POI_CONTRATO_INTER = ?";
            values.add(this.getPoiContratoInter());
        }

        if (this.getPoiCveTipoMerca() != null && this.getPoiCveTipoMerca().longValue() == -999) {
            conditions += " AND POI_CVE_TIPO_MERCA IS NULL";
        } else if (this.getPoiCveTipoMerca() != null) {
            conditions += " AND POI_CVE_TIPO_MERCA = ?";
            values.add(this.getPoiCveTipoMerca());
        }

        if (this.getPoiNumInstrume() != null && this.getPoiNumInstrume().longValue() == -999) {
            conditions += " AND POI_NUM_INSTRUME IS NULL";
        } else if (this.getPoiNumInstrume() != null) {
            conditions += " AND POI_NUM_INSTRUME = ?";
            values.add(this.getPoiNumInstrume());
        }

        if (this.getPoiNumSecEmis() != null && this.getPoiNumSecEmis().longValue() == -999) {
            conditions += " AND POI_NUM_SEC_EMIS IS NULL";
        } else if (this.getPoiNumSecEmis() != null) {
            conditions += " AND POI_NUM_SEC_EMIS = ?";
            values.add(this.getPoiNumSecEmis());
        }

        if (this.getPoiNomPizarra() != null && "null".equals(this.getPoiNomPizarra())) {
            conditions += " AND POI_NOM_PIZARRA IS NULL";
        } else if (this.getPoiNomPizarra() != null) {
            conditions += " AND POI_NOM_PIZARRA = ?";
            values.add(this.getPoiNomPizarra());
        }

        if (this.getPoiNumSerEmis() != null && "null".equals(this.getPoiNumSerEmis())) {
            conditions += " AND POI_NUM_SER_EMIS IS NULL";
        } else if (this.getPoiNumSerEmis() != null) {
            conditions += " AND POI_NUM_SER_EMIS = ?";
            values.add(this.getPoiNumSerEmis());
        }

        if (this.getPoiNumCuponVig() != null && this.getPoiNumCuponVig().longValue() == -999) {
            conditions += " AND POI_NUM_CUPON_VIG IS NULL";
        } else if (this.getPoiNumCuponVig() != null) {
            conditions += " AND POI_NUM_CUPON_VIG = ?";
            values.add(this.getPoiNumCuponVig());
        }

        if (this.getPoiCveGarantia() != null && this.getPoiCveGarantia().longValue() == -999) {
            conditions += " AND POI_CVE_GARANTIA IS NULL";
        } else if (this.getPoiCveGarantia() != null) {
            conditions += " AND POI_CVE_GARANTIA = ?";
            values.add(this.getPoiCveGarantia());
        }

        if (this.getPoiPosicIniPer() != null && this.getPoiPosicIniPer().longValue() == -999) {
            conditions += " AND POI_POSIC_INI_PER IS NULL";
        } else if (this.getPoiPosicIniPer() != null) {
            conditions += " AND POI_POSIC_INI_PER = ?";
            values.add(this.getPoiPosicIniPer());
        }

        if (this.getPoiVtasPosPer() != null && this.getPoiVtasPosPer().longValue() == -999) {
            conditions += " AND POI_VTAS_POS_PER IS NULL";
        } else if (this.getPoiVtasPosPer() != null) {
            conditions += " AND POI_VTAS_POS_PER = ?";
            values.add(this.getPoiVtasPosPer());
        }

        if (this.getPoiCpasPosPer() != null && this.getPoiCpasPosPer().longValue() == -999) {
            conditions += " AND POI_CPAS_POS_PER IS NULL";
        } else if (this.getPoiCpasPosPer() != null) {
            conditions += " AND POI_CPAS_POS_PER = ?";
            values.add(this.getPoiCpasPosPer());
        }

        if (this.getPoiPosicIniEjer() != null && this.getPoiPosicIniEjer().longValue() == -999) {
            conditions += " AND POI_POSIC_INI_EJER IS NULL";
        } else if (this.getPoiPosicIniEjer() != null) {
            conditions += " AND POI_POSIC_INI_EJER = ?";
            values.add(this.getPoiPosicIniEjer());
        }

        if (this.getPoiVtasPosEjer() != null && this.getPoiVtasPosEjer().longValue() == -999) {
            conditions += " AND POI_VTAS_POS_EJER IS NULL";
        } else if (this.getPoiVtasPosEjer() != null) {
            conditions += " AND POI_VTAS_POS_EJER = ?";
            values.add(this.getPoiVtasPosEjer());
        }

        if (this.getPoiCpasPosEjer() != null && this.getPoiCpasPosEjer().longValue() == -999) {
            conditions += " AND POI_CPAS_POS_EJER IS NULL";
        } else if (this.getPoiCpasPosEjer() != null) {
            conditions += " AND POI_CPAS_POS_EJER = ?";
            values.add(this.getPoiCpasPosEjer());
        }

        if (this.getPoiPosicActual() != null && this.getPoiPosicActual().longValue() == -999) {
            conditions += " AND POI_POSIC_ACTUAL IS NULL";
        } else if (this.getPoiPosicActual() != null) {
            conditions += " AND POI_POSIC_ACTUAL = ?";
            values.add(this.getPoiPosicActual());
        }

        if (this.getPoiPosicComprom() != null && this.getPoiPosicComprom().longValue() == -999) {
            conditions += " AND POI_POSIC_COMPROM IS NULL";
        } else if (this.getPoiPosicComprom() != null) {
            conditions += " AND POI_POSIC_COMPROM = ?";
            values.add(this.getPoiPosicComprom());
        }

        if (this.getPoiCostoHistoric() != null && this.getPoiCostoHistoric().longValue() == -999) {
            conditions += " AND POI_COSTO_HISTORIC IS NULL";
        } else if (this.getPoiCostoHistoric() != null) {
            conditions += " AND POI_COSTO_HISTORIC = ?";
            values.add(this.getPoiCostoHistoric());
        }

        if (this.getPoiAnoUltMovto() != null && this.getPoiAnoUltMovto().longValue() == -999) {
            conditions += " AND POI_ANO_ULT_MOVTO IS NULL";
        } else if (this.getPoiAnoUltMovto() != null) {
            conditions += " AND POI_ANO_ULT_MOVTO = ?";
            values.add(this.getPoiAnoUltMovto());
        }

        if (this.getPoiMesUltMovto() != null && this.getPoiMesUltMovto().longValue() == -999) {
            conditions += " AND POI_MES_ULT_MOVTO IS NULL";
        } else if (this.getPoiMesUltMovto() != null) {
            conditions += " AND POI_MES_ULT_MOVTO = ?";
            values.add(this.getPoiMesUltMovto());
        }

        if (this.getPoiDiaUltMovto() != null && this.getPoiDiaUltMovto().longValue() == -999) {
            conditions += " AND POI_DIA_ULT_MOVTO IS NULL";
        } else if (this.getPoiDiaUltMovto() != null) {
            conditions += " AND POI_DIA_ULT_MOVTO = ?";
            values.add(this.getPoiDiaUltMovto());
        }

        if (this.getPoiAnoAltaReg() != null && this.getPoiAnoAltaReg().longValue() == -999) {
            conditions += " AND POI_ANO_ALTA_REG IS NULL";
        } else if (this.getPoiAnoAltaReg() != null) {
            conditions += " AND POI_ANO_ALTA_REG = ?";
            values.add(this.getPoiAnoAltaReg());
        }

        if (this.getPoiMesAltaReg() != null && this.getPoiMesAltaReg().longValue() == -999) {
            conditions += " AND POI_MES_ALTA_REG IS NULL";
        } else if (this.getPoiMesAltaReg() != null) {
            conditions += " AND POI_MES_ALTA_REG = ?";
            values.add(this.getPoiMesAltaReg());
        }

        if (this.getPoiDiaAltaReg() != null && this.getPoiDiaAltaReg().longValue() == -999) {
            conditions += " AND POI_DIA_ALTA_REG IS NULL";
        } else if (this.getPoiDiaAltaReg() != null) {
            conditions += " AND POI_DIA_ALTA_REG = ?";
            values.add(this.getPoiDiaAltaReg());
        }

        if (this.getPoiAnoUltMod() != null && this.getPoiAnoUltMod().longValue() == -999) {
            conditions += " AND POI_ANO_ULT_MOD IS NULL";
        } else if (this.getPoiAnoUltMod() != null) {
            conditions += " AND POI_ANO_ULT_MOD = ?";
            values.add(this.getPoiAnoUltMod());
        }

        if (this.getPoiMesUltMod() != null && this.getPoiMesUltMod().longValue() == -999) {
            conditions += " AND POI_MES_ULT_MOD IS NULL";
        } else if (this.getPoiMesUltMod() != null) {
            conditions += " AND POI_MES_ULT_MOD = ?";
            values.add(this.getPoiMesUltMod());
        }

        if (this.getPoiDiaUltMod() != null && this.getPoiDiaUltMod().longValue() == -999) {
            conditions += " AND POI_DIA_ULT_MOD IS NULL";
        } else if (this.getPoiDiaUltMod() != null) {
            conditions += " AND POI_DIA_ULT_MOD = ?";
            values.add(this.getPoiDiaUltMod());
        }

        if (this.getPoiCveStPosicin() != null && "null".equals(this.getPoiCveStPosicin())) {
            conditions += " AND POI_CVE_ST_POSICIN IS NULL";
        } else if (this.getPoiCveStPosicin() != null) {
            conditions += " AND POI_CVE_ST_POSICIN = ?";
            values.add(this.getPoiCveStPosicin());
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
        String sql = "UPDATE POSICINT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND POI_ENTIDAD_FIN = ?";
        pkValues.add(this.getPoiEntidadFin());
        conditions += " AND POI_CONTRATO_INTER = ?";
        pkValues.add(this.getPoiContratoInter());
        conditions += " AND POI_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getPoiCveTipoMerca());
        conditions += " AND POI_NUM_INSTRUME = ?";
        pkValues.add(this.getPoiNumInstrume());
        conditions += " AND POI_NUM_SEC_EMIS = ?";
        pkValues.add(this.getPoiNumSecEmis());
        fields += " POI_NOM_PIZARRA = ?, ";
        values.add(this.getPoiNomPizarra());
        fields += " POI_NUM_SER_EMIS = ?, ";
        values.add(this.getPoiNumSerEmis());
        fields += " POI_NUM_CUPON_VIG = ?, ";
        values.add(this.getPoiNumCuponVig());
        fields += " POI_CVE_GARANTIA = ?, ";
        values.add(this.getPoiCveGarantia());
        fields += " POI_POSIC_INI_PER = ?, ";
        values.add(this.getPoiPosicIniPer());
        fields += " POI_VTAS_POS_PER = ?, ";
        values.add(this.getPoiVtasPosPer());
        fields += " POI_CPAS_POS_PER = ?, ";
        values.add(this.getPoiCpasPosPer());
        fields += " POI_POSIC_INI_EJER = ?, ";
        values.add(this.getPoiPosicIniEjer());
        fields += " POI_VTAS_POS_EJER = ?, ";
        values.add(this.getPoiVtasPosEjer());
        fields += " POI_CPAS_POS_EJER = ?, ";
        values.add(this.getPoiCpasPosEjer());
        fields += " POI_POSIC_ACTUAL = ?, ";
        values.add(this.getPoiPosicActual());
        fields += " POI_POSIC_COMPROM = ?, ";
        values.add(this.getPoiPosicComprom());
        fields += " POI_COSTO_HISTORIC = ?, ";
        values.add(this.getPoiCostoHistoric());
        fields += " POI_ANO_ULT_MOVTO = ?, ";
        values.add(this.getPoiAnoUltMovto());
        fields += " POI_MES_ULT_MOVTO = ?, ";
        values.add(this.getPoiMesUltMovto());
        fields += " POI_DIA_ULT_MOVTO = ?, ";
        values.add(this.getPoiDiaUltMovto());
        fields += " POI_ANO_ALTA_REG = ?, ";
        values.add(this.getPoiAnoAltaReg());
        fields += " POI_MES_ALTA_REG = ?, ";
        values.add(this.getPoiMesAltaReg());
        fields += " POI_DIA_ALTA_REG = ?, ";
        values.add(this.getPoiDiaAltaReg());
        fields += " POI_ANO_ULT_MOD = ?, ";
        values.add(this.getPoiAnoUltMod());
        fields += " POI_MES_ULT_MOD = ?, ";
        values.add(this.getPoiMesUltMod());
        fields += " POI_DIA_ULT_MOD = ?, ";
        values.add(this.getPoiDiaUltMod());
        fields += " POI_CVE_ST_POSICIN = ?, ";
        values.add(this.getPoiCveStPosicin());
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
        String sql = "INSERT INTO POSICINT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", POI_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getPoiEntidadFin());

        fields += ", POI_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getPoiContratoInter());

        fields += ", POI_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getPoiCveTipoMerca());

        fields += ", POI_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getPoiNumInstrume());

        fields += ", POI_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getPoiNumSecEmis());

        fields += ", POI_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getPoiNomPizarra());

        fields += ", POI_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getPoiNumSerEmis());

        fields += ", POI_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getPoiNumCuponVig());

        fields += ", POI_CVE_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getPoiCveGarantia());

        fields += ", POI_POSIC_INI_PER";
        fieldValues += ", ?";
        values.add(this.getPoiPosicIniPer());

        fields += ", POI_VTAS_POS_PER";
        fieldValues += ", ?";
        values.add(this.getPoiVtasPosPer());

        fields += ", POI_CPAS_POS_PER";
        fieldValues += ", ?";
        values.add(this.getPoiCpasPosPer());

        fields += ", POI_POSIC_INI_EJER";
        fieldValues += ", ?";
        values.add(this.getPoiPosicIniEjer());

        fields += ", POI_VTAS_POS_EJER";
        fieldValues += ", ?";
        values.add(this.getPoiVtasPosEjer());

        fields += ", POI_CPAS_POS_EJER";
        fieldValues += ", ?";
        values.add(this.getPoiCpasPosEjer());

        fields += ", POI_POSIC_ACTUAL";
        fieldValues += ", ?";
        values.add(this.getPoiPosicActual());

        fields += ", POI_POSIC_COMPROM";
        fieldValues += ", ?";
        values.add(this.getPoiPosicComprom());

        fields += ", POI_COSTO_HISTORIC";
        fieldValues += ", ?";
        values.add(this.getPoiCostoHistoric());

        fields += ", POI_ANO_ULT_MOVTO";
        fieldValues += ", ?";
        values.add(this.getPoiAnoUltMovto());

        fields += ", POI_MES_ULT_MOVTO";
        fieldValues += ", ?";
        values.add(this.getPoiMesUltMovto());

        fields += ", POI_DIA_ULT_MOVTO";
        fieldValues += ", ?";
        values.add(this.getPoiDiaUltMovto());

        fields += ", POI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPoiAnoAltaReg());

        fields += ", POI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPoiMesAltaReg());

        fields += ", POI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPoiDiaAltaReg());

        fields += ", POI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPoiAnoUltMod());

        fields += ", POI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPoiMesUltMod());

        fields += ", POI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPoiDiaUltMod());

        fields += ", POI_CVE_ST_POSICIN";
        fieldValues += ", ?";
        values.add(this.getPoiCveStPosicin());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM POSICINT WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND POI_ENTIDAD_FIN = ?";
        values.add(this.getPoiEntidadFin());
        conditions += " AND POI_CONTRATO_INTER = ?";
        values.add(this.getPoiContratoInter());
        conditions += " AND POI_CVE_TIPO_MERCA = ?";
        values.add(this.getPoiCveTipoMerca());
        conditions += " AND POI_NUM_INSTRUME = ?";
        values.add(this.getPoiNumInstrume());
        conditions += " AND POI_NUM_SEC_EMIS = ?";
        values.add(this.getPoiNumSecEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Posicint instance = (Posicint) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPoiEntidadFin().equals(instance.getPoiEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getPoiContratoInter().equals(instance.getPoiContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getPoiCveTipoMerca().equals(instance.getPoiCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getPoiNumInstrume().equals(instance.getPoiNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getPoiNumSecEmis().equals(instance.getPoiNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPoiNomPizarra().equals(instance.getPoiNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getPoiNumSerEmis().equals(instance.getPoiNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPoiNumCuponVig().equals(instance.getPoiNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getPoiCveGarantia().equals(instance.getPoiCveGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getPoiPosicIniPer().equals(instance.getPoiPosicIniPer()))
            equalObjects = false;
        if (equalObjects && !this.getPoiVtasPosPer().equals(instance.getPoiVtasPosPer()))
            equalObjects = false;
        if (equalObjects && !this.getPoiCpasPosPer().equals(instance.getPoiCpasPosPer()))
            equalObjects = false;
        if (equalObjects && !this.getPoiPosicIniEjer().equals(instance.getPoiPosicIniEjer()))
            equalObjects = false;
        if (equalObjects && !this.getPoiVtasPosEjer().equals(instance.getPoiVtasPosEjer()))
            equalObjects = false;
        if (equalObjects && !this.getPoiCpasPosEjer().equals(instance.getPoiCpasPosEjer()))
            equalObjects = false;
        if (equalObjects && !this.getPoiPosicActual().equals(instance.getPoiPosicActual()))
            equalObjects = false;
        if (equalObjects && !this.getPoiPosicComprom().equals(instance.getPoiPosicComprom()))
            equalObjects = false;
        if (equalObjects && !this.getPoiCostoHistoric().equals(instance.getPoiCostoHistoric()))
            equalObjects = false;
        if (equalObjects && !this.getPoiAnoUltMovto().equals(instance.getPoiAnoUltMovto()))
            equalObjects = false;
        if (equalObjects && !this.getPoiMesUltMovto().equals(instance.getPoiMesUltMovto()))
            equalObjects = false;
        if (equalObjects && !this.getPoiDiaUltMovto().equals(instance.getPoiDiaUltMovto()))
            equalObjects = false;
        if (equalObjects && !this.getPoiAnoAltaReg().equals(instance.getPoiAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPoiMesAltaReg().equals(instance.getPoiMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPoiDiaAltaReg().equals(instance.getPoiDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPoiAnoUltMod().equals(instance.getPoiAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPoiMesUltMod().equals(instance.getPoiMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPoiDiaUltMod().equals(instance.getPoiDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPoiCveStPosicin().equals(instance.getPoiCveStPosicin()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Posicint result = new Posicint();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPoiEntidadFin((BigDecimal) objectData.getData("POI_ENTIDAD_FIN"));
        result.setPoiContratoInter((BigDecimal) objectData.getData("POI_CONTRATO_INTER"));
        result.setPoiCveTipoMerca((BigDecimal) objectData.getData("POI_CVE_TIPO_MERCA"));
        result.setPoiNumInstrume((BigDecimal) objectData.getData("POI_NUM_INSTRUME"));
        result.setPoiNumSecEmis((BigDecimal) objectData.getData("POI_NUM_SEC_EMIS"));
        result.setPoiNomPizarra((String) objectData.getData("POI_NOM_PIZARRA"));
        result.setPoiNumSerEmis((String) objectData.getData("POI_NUM_SER_EMIS"));
        result.setPoiNumCuponVig((BigDecimal) objectData.getData("POI_NUM_CUPON_VIG"));
        result.setPoiCveGarantia((BigDecimal) objectData.getData("POI_CVE_GARANTIA"));
        result.setPoiPosicIniPer((BigDecimal) objectData.getData("POI_POSIC_INI_PER"));
        result.setPoiVtasPosPer((BigDecimal) objectData.getData("POI_VTAS_POS_PER"));
        result.setPoiCpasPosPer((BigDecimal) objectData.getData("POI_CPAS_POS_PER"));
        result.setPoiPosicIniEjer((BigDecimal) objectData.getData("POI_POSIC_INI_EJER"));
        result.setPoiVtasPosEjer((BigDecimal) objectData.getData("POI_VTAS_POS_EJER"));
        result.setPoiCpasPosEjer((BigDecimal) objectData.getData("POI_CPAS_POS_EJER"));
        result.setPoiPosicActual((BigDecimal) objectData.getData("POI_POSIC_ACTUAL"));
        result.setPoiPosicComprom((BigDecimal) objectData.getData("POI_POSIC_COMPROM"));
        result.setPoiCostoHistoric((BigDecimal) objectData.getData("POI_COSTO_HISTORIC"));
        result.setPoiAnoUltMovto((BigDecimal) objectData.getData("POI_ANO_ULT_MOVTO"));
        result.setPoiMesUltMovto((BigDecimal) objectData.getData("POI_MES_ULT_MOVTO"));
        result.setPoiDiaUltMovto((BigDecimal) objectData.getData("POI_DIA_ULT_MOVTO"));
        result.setPoiAnoAltaReg((BigDecimal) objectData.getData("POI_ANO_ALTA_REG"));
        result.setPoiMesAltaReg((BigDecimal) objectData.getData("POI_MES_ALTA_REG"));
        result.setPoiDiaAltaReg((BigDecimal) objectData.getData("POI_DIA_ALTA_REG"));
        result.setPoiAnoUltMod((BigDecimal) objectData.getData("POI_ANO_ULT_MOD"));
        result.setPoiMesUltMod((BigDecimal) objectData.getData("POI_MES_ULT_MOD"));
        result.setPoiDiaUltMod((BigDecimal) objectData.getData("POI_DIA_ULT_MOD"));
        result.setPoiCveStPosicin((String) objectData.getData("POI_CVE_ST_POSICIN"));

        return result;

    }

}
