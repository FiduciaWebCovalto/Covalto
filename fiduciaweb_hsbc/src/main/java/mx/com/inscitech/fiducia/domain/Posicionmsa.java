package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "POSICIONMSA_PK",
            columns = { "POS_NUM_CONTRATO", "POS_SUB_CONTRATO", "POS_NUM_ENTID_FIN", "POS_CONTRATO_INTER", "POS_CVE_TIPO_MERCA", "POS_NUM_INSTRUME", "POS_NUM_SEC_EMIS"
    }, sequences = { "MANUAL" })
public class Posicionmsa extends DomainObject {

    BigDecimal posNumContrato = null;
    BigDecimal posSubContrato = null;
    BigDecimal posNumEntidFin = null;
    BigDecimal posContratoInter = null;
    BigDecimal posCveTipoMerca = null;
    BigDecimal posNumInstrume = null;
    BigDecimal posNumSecEmis = null;
    String posNomPizarra = null;
    String posNumSerEmis = null;
    BigDecimal posNumCuponVig = null;
    String posNomCustodio = null;
    BigDecimal posNumMoneda = null;
    BigDecimal posCveGarantia = null;
    BigDecimal posPosicIniPer = null;
    BigDecimal posVtasPosicPer = null;
    BigDecimal posCpasPosicPer = null;
    BigDecimal posPosicIniEjer = null;
    BigDecimal posVtasPosEjer = null;
    BigDecimal posCpasPosEjer = null;
    BigDecimal posPosicActual = null;
    BigDecimal posPosicComprom = null;
    BigDecimal posCostoHistoric = null;
    BigDecimal posAnoUltMovto = null;
    BigDecimal posMesUltMovto = null;
    BigDecimal posDiaUltMovto = null;
    BigDecimal posAnoAltaReg = null;
    BigDecimal posMesAltaReg = null;
    BigDecimal posDiaAltaReg = null;
    BigDecimal posAnoUltMod = null;
    BigDecimal posMesUltMod = null;
    BigDecimal posDiaUltMod = null;
    String posCveStPosicio = null;
    BigDecimal posMinusPlus = null;

    public Posicionmsa() {
        super();
        this.pkColumns = 7;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosNumContrato(BigDecimal posNumContrato) {
        this.posNumContrato = posNumContrato;
    }

    public BigDecimal getPosNumContrato() {
        return this.posNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosSubContrato(BigDecimal posSubContrato) {
        this.posSubContrato = posSubContrato;
    }

    public BigDecimal getPosSubContrato() {
        return this.posSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosNumEntidFin(BigDecimal posNumEntidFin) {
        this.posNumEntidFin = posNumEntidFin;
    }

    public BigDecimal getPosNumEntidFin() {
        return this.posNumEntidFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosContratoInter(BigDecimal posContratoInter) {
        this.posContratoInter = posContratoInter;
    }

    public BigDecimal getPosContratoInter() {
        return this.posContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosCveTipoMerca(BigDecimal posCveTipoMerca) {
        this.posCveTipoMerca = posCveTipoMerca;
    }

    public BigDecimal getPosCveTipoMerca() {
        return this.posCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosNumInstrume(BigDecimal posNumInstrume) {
        this.posNumInstrume = posNumInstrume;
    }

    public BigDecimal getPosNumInstrume() {
        return this.posNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosNumSecEmis(BigDecimal posNumSecEmis) {
        this.posNumSecEmis = posNumSecEmis;
    }

    public BigDecimal getPosNumSecEmis() {
        return this.posNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosNomPizarra(String posNomPizarra) {
        this.posNomPizarra = posNomPizarra;
    }

    public String getPosNomPizarra() {
        return this.posNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosNumSerEmis(String posNumSerEmis) {
        this.posNumSerEmis = posNumSerEmis;
    }

    public String getPosNumSerEmis() {
        return this.posNumSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosNumCuponVig(BigDecimal posNumCuponVig) {
        this.posNumCuponVig = posNumCuponVig;
    }

    public BigDecimal getPosNumCuponVig() {
        return this.posNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosNomCustodio(String posNomCustodio) {
        this.posNomCustodio = posNomCustodio;
    }

    public String getPosNomCustodio() {
        return this.posNomCustodio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosNumMoneda(BigDecimal posNumMoneda) {
        this.posNumMoneda = posNumMoneda;
    }

    public BigDecimal getPosNumMoneda() {
        return this.posNumMoneda;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPosCveGarantia(BigDecimal posCveGarantia) {
        this.posCveGarantia = posCveGarantia;
    }

    public BigDecimal getPosCveGarantia() {
        return this.posCveGarantia;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setPosPosicIniPer(BigDecimal posPosicIniPer) {
        this.posPosicIniPer = posPosicIniPer;
    }

    public BigDecimal getPosPosicIniPer() {
        return this.posPosicIniPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setPosVtasPosicPer(BigDecimal posVtasPosicPer) {
        this.posVtasPosicPer = posVtasPosicPer;
    }

    public BigDecimal getPosVtasPosicPer() {
        return this.posVtasPosicPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setPosCpasPosicPer(BigDecimal posCpasPosicPer) {
        this.posCpasPosicPer = posCpasPosicPer;
    }

    public BigDecimal getPosCpasPosicPer() {
        return this.posCpasPosicPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setPosPosicIniEjer(BigDecimal posPosicIniEjer) {
        this.posPosicIniEjer = posPosicIniEjer;
    }

    public BigDecimal getPosPosicIniEjer() {
        return this.posPosicIniEjer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setPosVtasPosEjer(BigDecimal posVtasPosEjer) {
        this.posVtasPosEjer = posVtasPosEjer;
    }

    public BigDecimal getPosVtasPosEjer() {
        return this.posVtasPosEjer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setPosCpasPosEjer(BigDecimal posCpasPosEjer) {
        this.posCpasPosEjer = posCpasPosEjer;
    }

    public BigDecimal getPosCpasPosEjer() {
        return this.posCpasPosEjer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setPosPosicActual(BigDecimal posPosicActual) {
        this.posPosicActual = posPosicActual;
    }

    public BigDecimal getPosPosicActual() {
        return this.posPosicActual;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setPosPosicComprom(BigDecimal posPosicComprom) {
        this.posPosicComprom = posPosicComprom;
    }

    public BigDecimal getPosPosicComprom() {
        return this.posPosicComprom;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPosCostoHistoric(BigDecimal posCostoHistoric) {
        this.posCostoHistoric = posCostoHistoric;
    }

    public BigDecimal getPosCostoHistoric() {
        return this.posCostoHistoric;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPosAnoUltMovto(BigDecimal posAnoUltMovto) {
        this.posAnoUltMovto = posAnoUltMovto;
    }

    public BigDecimal getPosAnoUltMovto() {
        return this.posAnoUltMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPosMesUltMovto(BigDecimal posMesUltMovto) {
        this.posMesUltMovto = posMesUltMovto;
    }

    public BigDecimal getPosMesUltMovto() {
        return this.posMesUltMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPosDiaUltMovto(BigDecimal posDiaUltMovto) {
        this.posDiaUltMovto = posDiaUltMovto;
    }

    public BigDecimal getPosDiaUltMovto() {
        return this.posDiaUltMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPosAnoAltaReg(BigDecimal posAnoAltaReg) {
        this.posAnoAltaReg = posAnoAltaReg;
    }

    public BigDecimal getPosAnoAltaReg() {
        return this.posAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPosMesAltaReg(BigDecimal posMesAltaReg) {
        this.posMesAltaReg = posMesAltaReg;
    }

    public BigDecimal getPosMesAltaReg() {
        return this.posMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPosDiaAltaReg(BigDecimal posDiaAltaReg) {
        this.posDiaAltaReg = posDiaAltaReg;
    }

    public BigDecimal getPosDiaAltaReg() {
        return this.posDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPosAnoUltMod(BigDecimal posAnoUltMod) {
        this.posAnoUltMod = posAnoUltMod;
    }

    public BigDecimal getPosAnoUltMod() {
        return this.posAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPosMesUltMod(BigDecimal posMesUltMod) {
        this.posMesUltMod = posMesUltMod;
    }

    public BigDecimal getPosMesUltMod() {
        return this.posMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPosDiaUltMod(BigDecimal posDiaUltMod) {
        this.posDiaUltMod = posDiaUltMod;
    }

    public BigDecimal getPosDiaUltMod() {
        return this.posDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPosCveStPosicio(String posCveStPosicio) {
        this.posCveStPosicio = posCveStPosicio;
    }

    public String getPosCveStPosicio() {
        return this.posCveStPosicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPosMinusPlus(BigDecimal posMinusPlus) {
        this.posMinusPlus = posMinusPlus;
    }

    public BigDecimal getPosMinusPlus() {
        return this.posMinusPlus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM POSICIONMSA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPosNumContrato() != null && this.getPosNumContrato().longValue() == -999) {
            conditions += " AND POS_NUM_CONTRATO IS NULL";
        } else if (this.getPosNumContrato() != null) {
            conditions += " AND POS_NUM_CONTRATO = ?";
            values.add(this.getPosNumContrato());
        }

        if (this.getPosSubContrato() != null && this.getPosSubContrato().longValue() == -999) {
            conditions += " AND POS_SUB_CONTRATO IS NULL";
        } else if (this.getPosSubContrato() != null) {
            conditions += " AND POS_SUB_CONTRATO = ?";
            values.add(this.getPosSubContrato());
        }

        if (this.getPosNumEntidFin() != null && this.getPosNumEntidFin().longValue() == -999) {
            conditions += " AND POS_NUM_ENTID_FIN IS NULL";
        } else if (this.getPosNumEntidFin() != null) {
            conditions += " AND POS_NUM_ENTID_FIN = ?";
            values.add(this.getPosNumEntidFin());
        }

        if (this.getPosContratoInter() != null && this.getPosContratoInter().longValue() == -999) {
            conditions += " AND POS_CONTRATO_INTER IS NULL";
        } else if (this.getPosContratoInter() != null) {
            conditions += " AND POS_CONTRATO_INTER = ?";
            values.add(this.getPosContratoInter());
        }

        if (this.getPosCveTipoMerca() != null && this.getPosCveTipoMerca().longValue() == -999) {
            conditions += " AND POS_CVE_TIPO_MERCA IS NULL";
        } else if (this.getPosCveTipoMerca() != null) {
            conditions += " AND POS_CVE_TIPO_MERCA = ?";
            values.add(this.getPosCveTipoMerca());
        }

        if (this.getPosNumInstrume() != null && this.getPosNumInstrume().longValue() == -999) {
            conditions += " AND POS_NUM_INSTRUME IS NULL";
        } else if (this.getPosNumInstrume() != null) {
            conditions += " AND POS_NUM_INSTRUME = ?";
            values.add(this.getPosNumInstrume());
        }

        if (this.getPosNumSecEmis() != null && this.getPosNumSecEmis().longValue() == -999) {
            conditions += " AND POS_NUM_SEC_EMIS IS NULL";
        } else if (this.getPosNumSecEmis() != null) {
            conditions += " AND POS_NUM_SEC_EMIS = ?";
            values.add(this.getPosNumSecEmis());
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
        String sql = "SELECT * FROM POSICIONMSA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPosNumContrato() != null && this.getPosNumContrato().longValue() == -999) {
            conditions += " AND POS_NUM_CONTRATO IS NULL";
        } else if (this.getPosNumContrato() != null) {
            conditions += " AND POS_NUM_CONTRATO = ?";
            values.add(this.getPosNumContrato());
        }

        if (this.getPosSubContrato() != null && this.getPosSubContrato().longValue() == -999) {
            conditions += " AND POS_SUB_CONTRATO IS NULL";
        } else if (this.getPosSubContrato() != null) {
            conditions += " AND POS_SUB_CONTRATO = ?";
            values.add(this.getPosSubContrato());
        }

        if (this.getPosNumEntidFin() != null && this.getPosNumEntidFin().longValue() == -999) {
            conditions += " AND POS_NUM_ENTID_FIN IS NULL";
        } else if (this.getPosNumEntidFin() != null) {
            conditions += " AND POS_NUM_ENTID_FIN = ?";
            values.add(this.getPosNumEntidFin());
        }

        if (this.getPosContratoInter() != null && this.getPosContratoInter().longValue() == -999) {
            conditions += " AND POS_CONTRATO_INTER IS NULL";
        } else if (this.getPosContratoInter() != null) {
            conditions += " AND POS_CONTRATO_INTER = ?";
            values.add(this.getPosContratoInter());
        }

        if (this.getPosCveTipoMerca() != null && this.getPosCveTipoMerca().longValue() == -999) {
            conditions += " AND POS_CVE_TIPO_MERCA IS NULL";
        } else if (this.getPosCveTipoMerca() != null) {
            conditions += " AND POS_CVE_TIPO_MERCA = ?";
            values.add(this.getPosCveTipoMerca());
        }

        if (this.getPosNumInstrume() != null && this.getPosNumInstrume().longValue() == -999) {
            conditions += " AND POS_NUM_INSTRUME IS NULL";
        } else if (this.getPosNumInstrume() != null) {
            conditions += " AND POS_NUM_INSTRUME = ?";
            values.add(this.getPosNumInstrume());
        }

        if (this.getPosNumSecEmis() != null && this.getPosNumSecEmis().longValue() == -999) {
            conditions += " AND POS_NUM_SEC_EMIS IS NULL";
        } else if (this.getPosNumSecEmis() != null) {
            conditions += " AND POS_NUM_SEC_EMIS = ?";
            values.add(this.getPosNumSecEmis());
        }

        if (this.getPosNomPizarra() != null && "null".equals(this.getPosNomPizarra())) {
            conditions += " AND POS_NOM_PIZARRA IS NULL";
        } else if (this.getPosNomPizarra() != null) {
            conditions += " AND POS_NOM_PIZARRA = ?";
            values.add(this.getPosNomPizarra());
        }

        if (this.getPosNumSerEmis() != null && "null".equals(this.getPosNumSerEmis())) {
            conditions += " AND POS_NUM_SER_EMIS IS NULL";
        } else if (this.getPosNumSerEmis() != null) {
            conditions += " AND POS_NUM_SER_EMIS = ?";
            values.add(this.getPosNumSerEmis());
        }

        if (this.getPosNumCuponVig() != null && this.getPosNumCuponVig().longValue() == -999) {
            conditions += " AND POS_NUM_CUPON_VIG IS NULL";
        } else if (this.getPosNumCuponVig() != null) {
            conditions += " AND POS_NUM_CUPON_VIG = ?";
            values.add(this.getPosNumCuponVig());
        }

        if (this.getPosNomCustodio() != null && "null".equals(this.getPosNomCustodio())) {
            conditions += " AND POS_NOM_CUSTODIO IS NULL";
        } else if (this.getPosNomCustodio() != null) {
            conditions += " AND POS_NOM_CUSTODIO = ?";
            values.add(this.getPosNomCustodio());
        }

        if (this.getPosNumMoneda() != null && this.getPosNumMoneda().longValue() == -999) {
            conditions += " AND POS_NUM_MONEDA IS NULL";
        } else if (this.getPosNumMoneda() != null) {
            conditions += " AND POS_NUM_MONEDA = ?";
            values.add(this.getPosNumMoneda());
        }

        if (this.getPosCveGarantia() != null && this.getPosCveGarantia().longValue() == -999) {
            conditions += " AND POS_CVE_GARANTIA IS NULL";
        } else if (this.getPosCveGarantia() != null) {
            conditions += " AND POS_CVE_GARANTIA = ?";
            values.add(this.getPosCveGarantia());
        }

        if (this.getPosPosicIniPer() != null && this.getPosPosicIniPer().longValue() == -999) {
            conditions += " AND POS_POSIC_INI_PER IS NULL";
        } else if (this.getPosPosicIniPer() != null) {
            conditions += " AND POS_POSIC_INI_PER = ?";
            values.add(this.getPosPosicIniPer());
        }

        if (this.getPosVtasPosicPer() != null && this.getPosVtasPosicPer().longValue() == -999) {
            conditions += " AND POS_VTAS_POSIC_PER IS NULL";
        } else if (this.getPosVtasPosicPer() != null) {
            conditions += " AND POS_VTAS_POSIC_PER = ?";
            values.add(this.getPosVtasPosicPer());
        }

        if (this.getPosCpasPosicPer() != null && this.getPosCpasPosicPer().longValue() == -999) {
            conditions += " AND POS_CPAS_POSIC_PER IS NULL";
        } else if (this.getPosCpasPosicPer() != null) {
            conditions += " AND POS_CPAS_POSIC_PER = ?";
            values.add(this.getPosCpasPosicPer());
        }

        if (this.getPosPosicIniEjer() != null && this.getPosPosicIniEjer().longValue() == -999) {
            conditions += " AND POS_POSIC_INI_EJER IS NULL";
        } else if (this.getPosPosicIniEjer() != null) {
            conditions += " AND POS_POSIC_INI_EJER = ?";
            values.add(this.getPosPosicIniEjer());
        }

        if (this.getPosVtasPosEjer() != null && this.getPosVtasPosEjer().longValue() == -999) {
            conditions += " AND POS_VTAS_POS_EJER IS NULL";
        } else if (this.getPosVtasPosEjer() != null) {
            conditions += " AND POS_VTAS_POS_EJER = ?";
            values.add(this.getPosVtasPosEjer());
        }

        if (this.getPosCpasPosEjer() != null && this.getPosCpasPosEjer().longValue() == -999) {
            conditions += " AND POS_CPAS_POS_EJER IS NULL";
        } else if (this.getPosCpasPosEjer() != null) {
            conditions += " AND POS_CPAS_POS_EJER = ?";
            values.add(this.getPosCpasPosEjer());
        }

        if (this.getPosPosicActual() != null && this.getPosPosicActual().longValue() == -999) {
            conditions += " AND POS_POSIC_ACTUAL IS NULL";
        } else if (this.getPosPosicActual() != null) {
            conditions += " AND POS_POSIC_ACTUAL = ?";
            values.add(this.getPosPosicActual());
        }

        if (this.getPosPosicComprom() != null && this.getPosPosicComprom().longValue() == -999) {
            conditions += " AND POS_POSIC_COMPROM IS NULL";
        } else if (this.getPosPosicComprom() != null) {
            conditions += " AND POS_POSIC_COMPROM = ?";
            values.add(this.getPosPosicComprom());
        }

        if (this.getPosCostoHistoric() != null && this.getPosCostoHistoric().longValue() == -999) {
            conditions += " AND POS_COSTO_HISTORIC IS NULL";
        } else if (this.getPosCostoHistoric() != null) {
            conditions += " AND POS_COSTO_HISTORIC = ?";
            values.add(this.getPosCostoHistoric());
        }

        if (this.getPosAnoUltMovto() != null && this.getPosAnoUltMovto().longValue() == -999) {
            conditions += " AND POS_ANO_ULT_MOVTO IS NULL";
        } else if (this.getPosAnoUltMovto() != null) {
            conditions += " AND POS_ANO_ULT_MOVTO = ?";
            values.add(this.getPosAnoUltMovto());
        }

        if (this.getPosMesUltMovto() != null && this.getPosMesUltMovto().longValue() == -999) {
            conditions += " AND POS_MES_ULT_MOVTO IS NULL";
        } else if (this.getPosMesUltMovto() != null) {
            conditions += " AND POS_MES_ULT_MOVTO = ?";
            values.add(this.getPosMesUltMovto());
        }

        if (this.getPosDiaUltMovto() != null && this.getPosDiaUltMovto().longValue() == -999) {
            conditions += " AND POS_DIA_ULT_MOVTO IS NULL";
        } else if (this.getPosDiaUltMovto() != null) {
            conditions += " AND POS_DIA_ULT_MOVTO = ?";
            values.add(this.getPosDiaUltMovto());
        }

        if (this.getPosAnoAltaReg() != null && this.getPosAnoAltaReg().longValue() == -999) {
            conditions += " AND POS_ANO_ALTA_REG IS NULL";
        } else if (this.getPosAnoAltaReg() != null) {
            conditions += " AND POS_ANO_ALTA_REG = ?";
            values.add(this.getPosAnoAltaReg());
        }

        if (this.getPosMesAltaReg() != null && this.getPosMesAltaReg().longValue() == -999) {
            conditions += " AND POS_MES_ALTA_REG IS NULL";
        } else if (this.getPosMesAltaReg() != null) {
            conditions += " AND POS_MES_ALTA_REG = ?";
            values.add(this.getPosMesAltaReg());
        }

        if (this.getPosDiaAltaReg() != null && this.getPosDiaAltaReg().longValue() == -999) {
            conditions += " AND POS_DIA_ALTA_REG IS NULL";
        } else if (this.getPosDiaAltaReg() != null) {
            conditions += " AND POS_DIA_ALTA_REG = ?";
            values.add(this.getPosDiaAltaReg());
        }

        if (this.getPosAnoUltMod() != null && this.getPosAnoUltMod().longValue() == -999) {
            conditions += " AND POS_ANO_ULT_MOD IS NULL";
        } else if (this.getPosAnoUltMod() != null) {
            conditions += " AND POS_ANO_ULT_MOD = ?";
            values.add(this.getPosAnoUltMod());
        }

        if (this.getPosMesUltMod() != null && this.getPosMesUltMod().longValue() == -999) {
            conditions += " AND POS_MES_ULT_MOD IS NULL";
        } else if (this.getPosMesUltMod() != null) {
            conditions += " AND POS_MES_ULT_MOD = ?";
            values.add(this.getPosMesUltMod());
        }

        if (this.getPosDiaUltMod() != null && this.getPosDiaUltMod().longValue() == -999) {
            conditions += " AND POS_DIA_ULT_MOD IS NULL";
        } else if (this.getPosDiaUltMod() != null) {
            conditions += " AND POS_DIA_ULT_MOD = ?";
            values.add(this.getPosDiaUltMod());
        }

        if (this.getPosCveStPosicio() != null && "null".equals(this.getPosCveStPosicio())) {
            conditions += " AND POS_CVE_ST_POSICIO IS NULL";
        } else if (this.getPosCveStPosicio() != null) {
            conditions += " AND POS_CVE_ST_POSICIO = ?";
            values.add(this.getPosCveStPosicio());
        }

        if (this.getPosMinusPlus() != null && this.getPosMinusPlus().longValue() == -999) {
            conditions += " AND POS_MINUS_PLUS IS NULL";
        } else if (this.getPosMinusPlus() != null) {
            conditions += " AND POS_MINUS_PLUS = ?";
            values.add(this.getPosMinusPlus());
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
        String sql = "UPDATE POSICIONMSA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND POS_NUM_CONTRATO = ?";
        pkValues.add(this.getPosNumContrato());
        conditions += " AND POS_SUB_CONTRATO = ?";
        pkValues.add(this.getPosSubContrato());
        conditions += " AND POS_NUM_ENTID_FIN = ?";
        pkValues.add(this.getPosNumEntidFin());
        conditions += " AND POS_CONTRATO_INTER = ?";
        pkValues.add(this.getPosContratoInter());
        conditions += " AND POS_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getPosCveTipoMerca());
        conditions += " AND POS_NUM_INSTRUME = ?";
        pkValues.add(this.getPosNumInstrume());
        conditions += " AND POS_NUM_SEC_EMIS = ?";
        pkValues.add(this.getPosNumSecEmis());
        fields += " POS_NOM_PIZARRA = ?, ";
        values.add(this.getPosNomPizarra());
        fields += " POS_NUM_SER_EMIS = ?, ";
        values.add(this.getPosNumSerEmis());
        fields += " POS_NUM_CUPON_VIG = ?, ";
        values.add(this.getPosNumCuponVig());
        fields += " POS_NOM_CUSTODIO = ?, ";
        values.add(this.getPosNomCustodio());
        fields += " POS_NUM_MONEDA = ?, ";
        values.add(this.getPosNumMoneda());
        fields += " POS_CVE_GARANTIA = ?, ";
        values.add(this.getPosCveGarantia());
        fields += " POS_POSIC_INI_PER = ?, ";
        values.add(this.getPosPosicIniPer());
        fields += " POS_VTAS_POSIC_PER = ?, ";
        values.add(this.getPosVtasPosicPer());
        fields += " POS_CPAS_POSIC_PER = ?, ";
        values.add(this.getPosCpasPosicPer());
        fields += " POS_POSIC_INI_EJER = ?, ";
        values.add(this.getPosPosicIniEjer());
        fields += " POS_VTAS_POS_EJER = ?, ";
        values.add(this.getPosVtasPosEjer());
        fields += " POS_CPAS_POS_EJER = ?, ";
        values.add(this.getPosCpasPosEjer());
        fields += " POS_POSIC_ACTUAL = ?, ";
        values.add(this.getPosPosicActual());
        fields += " POS_POSIC_COMPROM = ?, ";
        values.add(this.getPosPosicComprom());
        fields += " POS_COSTO_HISTORIC = ?, ";
        values.add(this.getPosCostoHistoric());
        fields += " POS_ANO_ULT_MOVTO = ?, ";
        values.add(this.getPosAnoUltMovto());
        fields += " POS_MES_ULT_MOVTO = ?, ";
        values.add(this.getPosMesUltMovto());
        fields += " POS_DIA_ULT_MOVTO = ?, ";
        values.add(this.getPosDiaUltMovto());
        fields += " POS_ANO_ALTA_REG = ?, ";
        values.add(this.getPosAnoAltaReg());
        fields += " POS_MES_ALTA_REG = ?, ";
        values.add(this.getPosMesAltaReg());
        fields += " POS_DIA_ALTA_REG = ?, ";
        values.add(this.getPosDiaAltaReg());
        fields += " POS_ANO_ULT_MOD = ?, ";
        values.add(this.getPosAnoUltMod());
        fields += " POS_MES_ULT_MOD = ?, ";
        values.add(this.getPosMesUltMod());
        fields += " POS_DIA_ULT_MOD = ?, ";
        values.add(this.getPosDiaUltMod());
        fields += " POS_CVE_ST_POSICIO = ?, ";
        values.add(this.getPosCveStPosicio());
        fields += " POS_MINUS_PLUS = ?, ";
        values.add(this.getPosMinusPlus());
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
        String sql = "INSERT INTO POSICIONMSA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", POS_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPosNumContrato());

        fields += ", POS_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPosSubContrato());

        fields += ", POS_NUM_ENTID_FIN";
        fieldValues += ", ?";
        values.add(this.getPosNumEntidFin());

        fields += ", POS_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getPosContratoInter());

        fields += ", POS_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getPosCveTipoMerca());

        fields += ", POS_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getPosNumInstrume());

        fields += ", POS_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getPosNumSecEmis());

        fields += ", POS_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getPosNomPizarra());

        fields += ", POS_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getPosNumSerEmis());

        fields += ", POS_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getPosNumCuponVig());

        fields += ", POS_NOM_CUSTODIO";
        fieldValues += ", ?";
        values.add(this.getPosNomCustodio());

        fields += ", POS_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getPosNumMoneda());

        fields += ", POS_CVE_GARANTIA";
        fieldValues += ", ?";
        values.add(this.getPosCveGarantia());

        fields += ", POS_POSIC_INI_PER";
        fieldValues += ", ?";
        values.add(this.getPosPosicIniPer());

        fields += ", POS_VTAS_POSIC_PER";
        fieldValues += ", ?";
        values.add(this.getPosVtasPosicPer());

        fields += ", POS_CPAS_POSIC_PER";
        fieldValues += ", ?";
        values.add(this.getPosCpasPosicPer());

        fields += ", POS_POSIC_INI_EJER";
        fieldValues += ", ?";
        values.add(this.getPosPosicIniEjer());

        fields += ", POS_VTAS_POS_EJER";
        fieldValues += ", ?";
        values.add(this.getPosVtasPosEjer());

        fields += ", POS_CPAS_POS_EJER";
        fieldValues += ", ?";
        values.add(this.getPosCpasPosEjer());

        fields += ", POS_POSIC_ACTUAL";
        fieldValues += ", ?";
        values.add(this.getPosPosicActual());

        fields += ", POS_POSIC_COMPROM";
        fieldValues += ", ?";
        values.add(this.getPosPosicComprom());

        fields += ", POS_COSTO_HISTORIC";
        fieldValues += ", ?";
        values.add(this.getPosCostoHistoric());

        fields += ", POS_ANO_ULT_MOVTO";
        fieldValues += ", ?";
        values.add(this.getPosAnoUltMovto());

        fields += ", POS_MES_ULT_MOVTO";
        fieldValues += ", ?";
        values.add(this.getPosMesUltMovto());

        fields += ", POS_DIA_ULT_MOVTO";
        fieldValues += ", ?";
        values.add(this.getPosDiaUltMovto());

        fields += ", POS_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPosAnoAltaReg());

        fields += ", POS_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPosMesAltaReg());

        fields += ", POS_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPosDiaAltaReg());

        fields += ", POS_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPosAnoUltMod());

        fields += ", POS_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPosMesUltMod());

        fields += ", POS_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPosDiaUltMod());

        fields += ", POS_CVE_ST_POSICIO";
        fieldValues += ", ?";
        values.add(this.getPosCveStPosicio());

        fields += ", POS_MINUS_PLUS";
        fieldValues += ", ?";
        values.add(this.getPosMinusPlus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM POSICIONMSA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND POS_NUM_CONTRATO = ?";
        values.add(this.getPosNumContrato());
        conditions += " AND POS_SUB_CONTRATO = ?";
        values.add(this.getPosSubContrato());
        conditions += " AND POS_NUM_ENTID_FIN = ?";
        values.add(this.getPosNumEntidFin());
        conditions += " AND POS_CONTRATO_INTER = ?";
        values.add(this.getPosContratoInter());
        conditions += " AND POS_CVE_TIPO_MERCA = ?";
        values.add(this.getPosCveTipoMerca());
        conditions += " AND POS_NUM_INSTRUME = ?";
        values.add(this.getPosNumInstrume());
        conditions += " AND POS_NUM_SEC_EMIS = ?";
        values.add(this.getPosNumSecEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Posicionmsa instance = (Posicionmsa) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPosNumContrato().equals(instance.getPosNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPosSubContrato().equals(instance.getPosSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPosNumEntidFin().equals(instance.getPosNumEntidFin()))
            equalObjects = false;
        if (equalObjects && !this.getPosContratoInter().equals(instance.getPosContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getPosCveTipoMerca().equals(instance.getPosCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getPosNumInstrume().equals(instance.getPosNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getPosNumSecEmis().equals(instance.getPosNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPosNomPizarra().equals(instance.getPosNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getPosNumSerEmis().equals(instance.getPosNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getPosNumCuponVig().equals(instance.getPosNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getPosNomCustodio().equals(instance.getPosNomCustodio()))
            equalObjects = false;
        if (equalObjects && !this.getPosNumMoneda().equals(instance.getPosNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getPosCveGarantia().equals(instance.getPosCveGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getPosPosicIniPer().equals(instance.getPosPosicIniPer()))
            equalObjects = false;
        if (equalObjects && !this.getPosVtasPosicPer().equals(instance.getPosVtasPosicPer()))
            equalObjects = false;
        if (equalObjects && !this.getPosCpasPosicPer().equals(instance.getPosCpasPosicPer()))
            equalObjects = false;
        if (equalObjects && !this.getPosPosicIniEjer().equals(instance.getPosPosicIniEjer()))
            equalObjects = false;
        if (equalObjects && !this.getPosVtasPosEjer().equals(instance.getPosVtasPosEjer()))
            equalObjects = false;
        if (equalObjects && !this.getPosCpasPosEjer().equals(instance.getPosCpasPosEjer()))
            equalObjects = false;
        if (equalObjects && !this.getPosPosicActual().equals(instance.getPosPosicActual()))
            equalObjects = false;
        if (equalObjects && !this.getPosPosicComprom().equals(instance.getPosPosicComprom()))
            equalObjects = false;
        if (equalObjects && !this.getPosCostoHistoric().equals(instance.getPosCostoHistoric()))
            equalObjects = false;
        if (equalObjects && !this.getPosAnoUltMovto().equals(instance.getPosAnoUltMovto()))
            equalObjects = false;
        if (equalObjects && !this.getPosMesUltMovto().equals(instance.getPosMesUltMovto()))
            equalObjects = false;
        if (equalObjects && !this.getPosDiaUltMovto().equals(instance.getPosDiaUltMovto()))
            equalObjects = false;
        if (equalObjects && !this.getPosAnoAltaReg().equals(instance.getPosAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPosMesAltaReg().equals(instance.getPosMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPosDiaAltaReg().equals(instance.getPosDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPosAnoUltMod().equals(instance.getPosAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPosMesUltMod().equals(instance.getPosMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPosDiaUltMod().equals(instance.getPosDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPosCveStPosicio().equals(instance.getPosCveStPosicio()))
            equalObjects = false;
        if (equalObjects && !this.getPosMinusPlus().equals(instance.getPosMinusPlus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Posicionmsa result = new Posicionmsa();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPosNumContrato((BigDecimal) objectData.getData("POS_NUM_CONTRATO"));
        result.setPosSubContrato((BigDecimal) objectData.getData("POS_SUB_CONTRATO"));
        result.setPosNumEntidFin((BigDecimal) objectData.getData("POS_NUM_ENTID_FIN"));
        result.setPosContratoInter((BigDecimal) objectData.getData("POS_CONTRATO_INTER"));
        result.setPosCveTipoMerca((BigDecimal) objectData.getData("POS_CVE_TIPO_MERCA"));
        result.setPosNumInstrume((BigDecimal) objectData.getData("POS_NUM_INSTRUME"));
        result.setPosNumSecEmis((BigDecimal) objectData.getData("POS_NUM_SEC_EMIS"));
        result.setPosNomPizarra((String) objectData.getData("POS_NOM_PIZARRA"));
        result.setPosNumSerEmis((String) objectData.getData("POS_NUM_SER_EMIS"));
        result.setPosNumCuponVig((BigDecimal) objectData.getData("POS_NUM_CUPON_VIG"));
        result.setPosNomCustodio((String) objectData.getData("POS_NOM_CUSTODIO"));
        result.setPosNumMoneda((BigDecimal) objectData.getData("POS_NUM_MONEDA"));
        result.setPosCveGarantia((BigDecimal) objectData.getData("POS_CVE_GARANTIA"));
        result.setPosPosicIniPer((BigDecimal) objectData.getData("POS_POSIC_INI_PER"));
        result.setPosVtasPosicPer((BigDecimal) objectData.getData("POS_VTAS_POSIC_PER"));
        result.setPosCpasPosicPer((BigDecimal) objectData.getData("POS_CPAS_POSIC_PER"));
        result.setPosPosicIniEjer((BigDecimal) objectData.getData("POS_POSIC_INI_EJER"));
        result.setPosVtasPosEjer((BigDecimal) objectData.getData("POS_VTAS_POS_EJER"));
        result.setPosCpasPosEjer((BigDecimal) objectData.getData("POS_CPAS_POS_EJER"));
        result.setPosPosicActual((BigDecimal) objectData.getData("POS_POSIC_ACTUAL"));
        result.setPosPosicComprom((BigDecimal) objectData.getData("POS_POSIC_COMPROM"));
        result.setPosCostoHistoric((BigDecimal) objectData.getData("POS_COSTO_HISTORIC"));
        result.setPosAnoUltMovto((BigDecimal) objectData.getData("POS_ANO_ULT_MOVTO"));
        result.setPosMesUltMovto((BigDecimal) objectData.getData("POS_MES_ULT_MOVTO"));
        result.setPosDiaUltMovto((BigDecimal) objectData.getData("POS_DIA_ULT_MOVTO"));
        result.setPosAnoAltaReg((BigDecimal) objectData.getData("POS_ANO_ALTA_REG"));
        result.setPosMesAltaReg((BigDecimal) objectData.getData("POS_MES_ALTA_REG"));
        result.setPosDiaAltaReg((BigDecimal) objectData.getData("POS_DIA_ALTA_REG"));
        result.setPosAnoUltMod((BigDecimal) objectData.getData("POS_ANO_ULT_MOD"));
        result.setPosMesUltMod((BigDecimal) objectData.getData("POS_MES_ULT_MOD"));
        result.setPosDiaUltMod((BigDecimal) objectData.getData("POS_DIA_ULT_MOD"));
        result.setPosCveStPosicio((String) objectData.getData("POS_CVE_ST_POSICIO"));
        result.setPosMinusPlus((BigDecimal) objectData.getData("POS_MINUS_PLUS"));

        return result;

    }

}
