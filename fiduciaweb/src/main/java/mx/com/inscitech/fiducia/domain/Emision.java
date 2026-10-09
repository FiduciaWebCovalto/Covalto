package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISION_PK", columns = { "EMI_NUM_SEC_EMIS", "EMI_CVE_TIPO_MERCA", "EMI_NUM_INSTRUME" }, sequences = { "MANUAL" })
public class Emision extends DomainObject {

    BigDecimal emiCveTipoMerca = null;
    BigDecimal emiNumInstrume = null;
    BigDecimal emiNumSecEmis = null;
    BigDecimal emiNumEmisor = null;
    String emiIdEmisionCnb = null;
    String emiClaveValor = null;
    String emiNomPizarra = null;
    String emiNumSerEmis = null;
    BigDecimal emiNumCuponVig = null;
    String emiCvePerPagEm = null;
    BigDecimal emiNumMoneda = null;
    BigDecimal emiAnoEmision = null;
    BigDecimal emiMesEmision = null;
    BigDecimal emiDiaEmision = null;
    BigDecimal emiAnoLiqEmis = null;
    BigDecimal emiMesLiqEmis = null;
    BigDecimal emiDiaLiqEmis = null;
    BigDecimal emiValorNominal = null;
    String emiDescEmision = null;
    BigDecimal emiTasaAnualEm = null;
    BigDecimal emiTasaAltaImpu = null;
    BigDecimal emiTasaBajaImpu = null;
    BigDecimal emiPjeSobretasa = null;
    String emiCveTipoPers = null;
    String emiCvePersAdq = null;
    BigDecimal emiAnoVencEmis = null;
    BigDecimal emiMesVencEmis = null;
    BigDecimal emiDiaVencEmis = null;
    BigDecimal emiTasaFactorAj = null;
    BigDecimal emiCantMinLote = null;
    String emiCveAgenCalif = null;
    String emiCveCalifEmis = null;
    String emiCveBursaEmis = null;
    BigDecimal emiAnoAltaReg = null;
    BigDecimal emiMesAltaReg = null;
    BigDecimal emiDiaAltaReg = null;
    BigDecimal emiAnoUltMod = null;
    BigDecimal emiMesUltMod = null;
    BigDecimal emiDiaUltMod = null;
    String emiCveStEmision = null;
    String emiFecUltPagIn = null;

    public Emision() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmiCveTipoMerca(BigDecimal emiCveTipoMerca) {
        this.emiCveTipoMerca = emiCveTipoMerca;
    }

    public BigDecimal getEmiCveTipoMerca() {
        return this.emiCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmiNumInstrume(BigDecimal emiNumInstrume) {
        this.emiNumInstrume = emiNumInstrume;
    }

    public BigDecimal getEmiNumInstrume() {
        return this.emiNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmiNumSecEmis(BigDecimal emiNumSecEmis) {
        this.emiNumSecEmis = emiNumSecEmis;
    }

    public BigDecimal getEmiNumSecEmis() {
        return this.emiNumSecEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmiNumEmisor(BigDecimal emiNumEmisor) {
        this.emiNumEmisor = emiNumEmisor;
    }

    public BigDecimal getEmiNumEmisor() {
        return this.emiNumEmisor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiIdEmisionCnb(String emiIdEmisionCnb) {
        this.emiIdEmisionCnb = emiIdEmisionCnb;
    }

    public String getEmiIdEmisionCnb() {
        return this.emiIdEmisionCnb;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiClaveValor(String emiClaveValor) {
        this.emiClaveValor = emiClaveValor;
    }

    public String getEmiClaveValor() {
        return this.emiClaveValor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiNomPizarra(String emiNomPizarra) {
        this.emiNomPizarra = emiNomPizarra;
    }

    public String getEmiNomPizarra() {
        return this.emiNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiNumSerEmis(String emiNumSerEmis) {
        this.emiNumSerEmis = emiNumSerEmis;
    }

    public String getEmiNumSerEmis() {
        return this.emiNumSerEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmiNumCuponVig(BigDecimal emiNumCuponVig) {
        this.emiNumCuponVig = emiNumCuponVig;
    }

    public BigDecimal getEmiNumCuponVig() {
        return this.emiNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiCvePerPagEm(String emiCvePerPagEm) {
        this.emiCvePerPagEm = emiCvePerPagEm;
    }

    public String getEmiCvePerPagEm() {
        return this.emiCvePerPagEm;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmiNumMoneda(BigDecimal emiNumMoneda) {
        this.emiNumMoneda = emiNumMoneda;
    }

    public BigDecimal getEmiNumMoneda() {
        return this.emiNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmiAnoEmision(BigDecimal emiAnoEmision) {
        this.emiAnoEmision = emiAnoEmision;
    }

    public BigDecimal getEmiAnoEmision() {
        return this.emiAnoEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmiMesEmision(BigDecimal emiMesEmision) {
        this.emiMesEmision = emiMesEmision;
    }

    public BigDecimal getEmiMesEmision() {
        return this.emiMesEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmiDiaEmision(BigDecimal emiDiaEmision) {
        this.emiDiaEmision = emiDiaEmision;
    }

    public BigDecimal getEmiDiaEmision() {
        return this.emiDiaEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmiAnoLiqEmis(BigDecimal emiAnoLiqEmis) {
        this.emiAnoLiqEmis = emiAnoLiqEmis;
    }

    public BigDecimal getEmiAnoLiqEmis() {
        return this.emiAnoLiqEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmiMesLiqEmis(BigDecimal emiMesLiqEmis) {
        this.emiMesLiqEmis = emiMesLiqEmis;
    }

    public BigDecimal getEmiMesLiqEmis() {
        return this.emiMesLiqEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmiDiaLiqEmis(BigDecimal emiDiaLiqEmis) {
        this.emiDiaLiqEmis = emiDiaLiqEmis;
    }

    public BigDecimal getEmiDiaLiqEmis() {
        return this.emiDiaLiqEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setEmiValorNominal(BigDecimal emiValorNominal) {
        this.emiValorNominal = emiValorNominal;
    }

    public BigDecimal getEmiValorNominal() {
        return this.emiValorNominal;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiDescEmision(String emiDescEmision) {
        this.emiDescEmision = emiDescEmision;
    }

    public String getEmiDescEmision() {
        return this.emiDescEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setEmiTasaAnualEm(BigDecimal emiTasaAnualEm) {
        this.emiTasaAnualEm = emiTasaAnualEm;
    }

    public BigDecimal getEmiTasaAnualEm() {
        return this.emiTasaAnualEm;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setEmiTasaAltaImpu(BigDecimal emiTasaAltaImpu) {
        this.emiTasaAltaImpu = emiTasaAltaImpu;
    }

    public BigDecimal getEmiTasaAltaImpu() {
        return this.emiTasaAltaImpu;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setEmiTasaBajaImpu(BigDecimal emiTasaBajaImpu) {
        this.emiTasaBajaImpu = emiTasaBajaImpu;
    }

    public BigDecimal getEmiTasaBajaImpu() {
        return this.emiTasaBajaImpu;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setEmiPjeSobretasa(BigDecimal emiPjeSobretasa) {
        this.emiPjeSobretasa = emiPjeSobretasa;
    }

    public BigDecimal getEmiPjeSobretasa() {
        return this.emiPjeSobretasa;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiCveTipoPers(String emiCveTipoPers) {
        this.emiCveTipoPers = emiCveTipoPers;
    }

    public String getEmiCveTipoPers() {
        return this.emiCveTipoPers;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiCvePersAdq(String emiCvePersAdq) {
        this.emiCvePersAdq = emiCvePersAdq;
    }

    public String getEmiCvePersAdq() {
        return this.emiCvePersAdq;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmiAnoVencEmis(BigDecimal emiAnoVencEmis) {
        this.emiAnoVencEmis = emiAnoVencEmis;
    }

    public BigDecimal getEmiAnoVencEmis() {
        return this.emiAnoVencEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmiMesVencEmis(BigDecimal emiMesVencEmis) {
        this.emiMesVencEmis = emiMesVencEmis;
    }

    public BigDecimal getEmiMesVencEmis() {
        return this.emiMesVencEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmiDiaVencEmis(BigDecimal emiDiaVencEmis) {
        this.emiDiaVencEmis = emiDiaVencEmis;
    }

    public BigDecimal getEmiDiaVencEmis() {
        return this.emiDiaVencEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setEmiTasaFactorAj(BigDecimal emiTasaFactorAj) {
        this.emiTasaFactorAj = emiTasaFactorAj;
    }

    public BigDecimal getEmiTasaFactorAj() {
        return this.emiTasaFactorAj;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEmiCantMinLote(BigDecimal emiCantMinLote) {
        this.emiCantMinLote = emiCantMinLote;
    }

    public BigDecimal getEmiCantMinLote() {
        return this.emiCantMinLote;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiCveAgenCalif(String emiCveAgenCalif) {
        this.emiCveAgenCalif = emiCveAgenCalif;
    }

    public String getEmiCveAgenCalif() {
        return this.emiCveAgenCalif;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiCveCalifEmis(String emiCveCalifEmis) {
        this.emiCveCalifEmis = emiCveCalifEmis;
    }

    public String getEmiCveCalifEmis() {
        return this.emiCveCalifEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiCveBursaEmis(String emiCveBursaEmis) {
        this.emiCveBursaEmis = emiCveBursaEmis;
    }

    public String getEmiCveBursaEmis() {
        return this.emiCveBursaEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmiAnoAltaReg(BigDecimal emiAnoAltaReg) {
        this.emiAnoAltaReg = emiAnoAltaReg;
    }

    public BigDecimal getEmiAnoAltaReg() {
        return this.emiAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmiMesAltaReg(BigDecimal emiMesAltaReg) {
        this.emiMesAltaReg = emiMesAltaReg;
    }

    public BigDecimal getEmiMesAltaReg() {
        return this.emiMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmiDiaAltaReg(BigDecimal emiDiaAltaReg) {
        this.emiDiaAltaReg = emiDiaAltaReg;
    }

    public BigDecimal getEmiDiaAltaReg() {
        return this.emiDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEmiAnoUltMod(BigDecimal emiAnoUltMod) {
        this.emiAnoUltMod = emiAnoUltMod;
    }

    public BigDecimal getEmiAnoUltMod() {
        return this.emiAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmiMesUltMod(BigDecimal emiMesUltMod) {
        this.emiMesUltMod = emiMesUltMod;
    }

    public BigDecimal getEmiMesUltMod() {
        return this.emiMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEmiDiaUltMod(BigDecimal emiDiaUltMod) {
        this.emiDiaUltMod = emiDiaUltMod;
    }

    public BigDecimal getEmiDiaUltMod() {
        return this.emiDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiCveStEmision(String emiCveStEmision) {
        this.emiCveStEmision = emiCveStEmision;
    }

    public String getEmiCveStEmision() {
        return this.emiCveStEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEmiFecUltPagIn(String emiFecUltPagIn) {
        this.emiFecUltPagIn = emiFecUltPagIn;
    }

    public String getEmiFecUltPagIn() {
        return this.emiFecUltPagIn;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEmiCveTipoMerca() != null && this.getEmiCveTipoMerca().longValue() == -999) {
            conditions += " AND EMI_CVE_TIPO_MERCA IS NULL";
        } else if (this.getEmiCveTipoMerca() != null) {
            conditions += " AND EMI_CVE_TIPO_MERCA = ?";
            values.add(this.getEmiCveTipoMerca());
        }

        if (this.getEmiNumInstrume() != null && this.getEmiNumInstrume().longValue() == -999) {
            conditions += " AND EMI_NUM_INSTRUME IS NULL";
        } else if (this.getEmiNumInstrume() != null) {
            conditions += " AND EMI_NUM_INSTRUME = ?";
            values.add(this.getEmiNumInstrume());
        }

        if (this.getEmiNumSecEmis() != null && this.getEmiNumSecEmis().longValue() == -999) {
            conditions += " AND EMI_NUM_SEC_EMIS IS NULL";
        } else if (this.getEmiNumSecEmis() != null) {
            conditions += " AND EMI_NUM_SEC_EMIS = ?";
            values.add(this.getEmiNumSecEmis());
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
        String sql = "SELECT * FROM EMISION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEmiCveTipoMerca() != null && this.getEmiCveTipoMerca().longValue() == -999) {
            conditions += " AND EMI_CVE_TIPO_MERCA IS NULL";
        } else if (this.getEmiCveTipoMerca() != null) {
            conditions += " AND EMI_CVE_TIPO_MERCA = ?";
            values.add(this.getEmiCveTipoMerca());
        }

        if (this.getEmiNumInstrume() != null && this.getEmiNumInstrume().longValue() == -999) {
            conditions += " AND EMI_NUM_INSTRUME IS NULL";
        } else if (this.getEmiNumInstrume() != null) {
            conditions += " AND EMI_NUM_INSTRUME = ?";
            values.add(this.getEmiNumInstrume());
        }

        if (this.getEmiNumSecEmis() != null && this.getEmiNumSecEmis().longValue() == -999) {
            conditions += " AND EMI_NUM_SEC_EMIS IS NULL";
        } else if (this.getEmiNumSecEmis() != null) {
            conditions += " AND EMI_NUM_SEC_EMIS = ?";
            values.add(this.getEmiNumSecEmis());
        }

        if (this.getEmiNumEmisor() != null && this.getEmiNumEmisor().longValue() == -999) {
            conditions += " AND EMI_NUM_EMISOR IS NULL";
        } else if (this.getEmiNumEmisor() != null) {
            conditions += " AND EMI_NUM_EMISOR = ?";
            values.add(this.getEmiNumEmisor());
        }

        if (this.getEmiIdEmisionCnb() != null && "null".equals(this.getEmiIdEmisionCnb())) {
            conditions += " AND EMI_ID_EMISION_CNB IS NULL";
        } else if (this.getEmiIdEmisionCnb() != null) {
            conditions += " AND EMI_ID_EMISION_CNB = ?";
            values.add(this.getEmiIdEmisionCnb());
        }

        if (this.getEmiClaveValor() != null && "null".equals(this.getEmiClaveValor())) {
            conditions += " AND EMI_CLAVE_VALOR IS NULL";
        } else if (this.getEmiClaveValor() != null) {
            conditions += " AND EMI_CLAVE_VALOR = ?";
            values.add(this.getEmiClaveValor());
        }

        if (this.getEmiNomPizarra() != null && "null".equals(this.getEmiNomPizarra())) {
            conditions += " AND EMI_NOM_PIZARRA IS NULL";
        } else if (this.getEmiNomPizarra() != null) {
            conditions += " AND EMI_NOM_PIZARRA = ?";
            values.add(this.getEmiNomPizarra());
        }

        if (this.getEmiNumSerEmis() != null && "null".equals(this.getEmiNumSerEmis())) {
            conditions += " AND EMI_NUM_SER_EMIS IS NULL";
        } else if (this.getEmiNumSerEmis() != null) {
            conditions += " AND EMI_NUM_SER_EMIS = ?";
            values.add(this.getEmiNumSerEmis());
        }

        if (this.getEmiNumCuponVig() != null && this.getEmiNumCuponVig().longValue() == -999) {
            conditions += " AND EMI_NUM_CUPON_VIG IS NULL";
        } else if (this.getEmiNumCuponVig() != null) {
            conditions += " AND EMI_NUM_CUPON_VIG = ?";
            values.add(this.getEmiNumCuponVig());
        }

        if (this.getEmiCvePerPagEm() != null && "null".equals(this.getEmiCvePerPagEm())) {
            conditions += " AND EMI_CVE_PER_PAG_EM IS NULL";
        } else if (this.getEmiCvePerPagEm() != null) {
            conditions += " AND EMI_CVE_PER_PAG_EM = ?";
            values.add(this.getEmiCvePerPagEm());
        }

        if (this.getEmiNumMoneda() != null && this.getEmiNumMoneda().longValue() == -999) {
            conditions += " AND EMI_NUM_MONEDA IS NULL";
        } else if (this.getEmiNumMoneda() != null) {
            conditions += " AND EMI_NUM_MONEDA = ?";
            values.add(this.getEmiNumMoneda());
        }

        if (this.getEmiAnoEmision() != null && this.getEmiAnoEmision().longValue() == -999) {
            conditions += " AND EMI_ANO_EMISION IS NULL";
        } else if (this.getEmiAnoEmision() != null) {
            conditions += " AND EMI_ANO_EMISION = ?";
            values.add(this.getEmiAnoEmision());
        }

        if (this.getEmiMesEmision() != null && this.getEmiMesEmision().longValue() == -999) {
            conditions += " AND EMI_MES_EMISION IS NULL";
        } else if (this.getEmiMesEmision() != null) {
            conditions += " AND EMI_MES_EMISION = ?";
            values.add(this.getEmiMesEmision());
        }

        if (this.getEmiDiaEmision() != null && this.getEmiDiaEmision().longValue() == -999) {
            conditions += " AND EMI_DIA_EMISION IS NULL";
        } else if (this.getEmiDiaEmision() != null) {
            conditions += " AND EMI_DIA_EMISION = ?";
            values.add(this.getEmiDiaEmision());
        }

        if (this.getEmiAnoLiqEmis() != null && this.getEmiAnoLiqEmis().longValue() == -999) {
            conditions += " AND EMI_ANO_LIQ_EMIS IS NULL";
        } else if (this.getEmiAnoLiqEmis() != null) {
            conditions += " AND EMI_ANO_LIQ_EMIS = ?";
            values.add(this.getEmiAnoLiqEmis());
        }

        if (this.getEmiMesLiqEmis() != null && this.getEmiMesLiqEmis().longValue() == -999) {
            conditions += " AND EMI_MES_LIQ_EMIS IS NULL";
        } else if (this.getEmiMesLiqEmis() != null) {
            conditions += " AND EMI_MES_LIQ_EMIS = ?";
            values.add(this.getEmiMesLiqEmis());
        }

        if (this.getEmiDiaLiqEmis() != null && this.getEmiDiaLiqEmis().longValue() == -999) {
            conditions += " AND EMI_DIA_LIQ_EMIS IS NULL";
        } else if (this.getEmiDiaLiqEmis() != null) {
            conditions += " AND EMI_DIA_LIQ_EMIS = ?";
            values.add(this.getEmiDiaLiqEmis());
        }

        if (this.getEmiValorNominal() != null && this.getEmiValorNominal().longValue() == -999) {
            conditions += " AND EMI_VALOR_NOMINAL IS NULL";
        } else if (this.getEmiValorNominal() != null) {
            conditions += " AND EMI_VALOR_NOMINAL = ?";
            values.add(this.getEmiValorNominal());
        }

        if (this.getEmiDescEmision() != null && "null".equals(this.getEmiDescEmision())) {
            conditions += " AND EMI_DESC_EMISION IS NULL";
        } else if (this.getEmiDescEmision() != null) {
            conditions += " AND EMI_DESC_EMISION = ?";
            values.add(this.getEmiDescEmision());
        }

        if (this.getEmiTasaAnualEm() != null && this.getEmiTasaAnualEm().longValue() == -999) {
            conditions += " AND EMI_TASA_ANUAL_EM IS NULL";
        } else if (this.getEmiTasaAnualEm() != null) {
            conditions += " AND EMI_TASA_ANUAL_EM = ?";
            values.add(this.getEmiTasaAnualEm());
        }

        if (this.getEmiTasaAltaImpu() != null && this.getEmiTasaAltaImpu().longValue() == -999) {
            conditions += " AND EMI_TASA_ALTA_IMPU IS NULL";
        } else if (this.getEmiTasaAltaImpu() != null) {
            conditions += " AND EMI_TASA_ALTA_IMPU = ?";
            values.add(this.getEmiTasaAltaImpu());
        }

        if (this.getEmiTasaBajaImpu() != null && this.getEmiTasaBajaImpu().longValue() == -999) {
            conditions += " AND EMI_TASA_BAJA_IMPU IS NULL";
        } else if (this.getEmiTasaBajaImpu() != null) {
            conditions += " AND EMI_TASA_BAJA_IMPU = ?";
            values.add(this.getEmiTasaBajaImpu());
        }

        if (this.getEmiPjeSobretasa() != null && this.getEmiPjeSobretasa().longValue() == -999) {
            conditions += " AND EMI_PJE_SOBRETASA IS NULL";
        } else if (this.getEmiPjeSobretasa() != null) {
            conditions += " AND EMI_PJE_SOBRETASA = ?";
            values.add(this.getEmiPjeSobretasa());
        }

        if (this.getEmiCveTipoPers() != null && "null".equals(this.getEmiCveTipoPers())) {
            conditions += " AND EMI_CVE_TIPO_PERS IS NULL";
        } else if (this.getEmiCveTipoPers() != null) {
            conditions += " AND EMI_CVE_TIPO_PERS = ?";
            values.add(this.getEmiCveTipoPers());
        }

        if (this.getEmiCvePersAdq() != null && "null".equals(this.getEmiCvePersAdq())) {
            conditions += " AND EMI_CVE_PERS_ADQ IS NULL";
        } else if (this.getEmiCvePersAdq() != null) {
            conditions += " AND EMI_CVE_PERS_ADQ = ?";
            values.add(this.getEmiCvePersAdq());
        }

        if (this.getEmiAnoVencEmis() != null && this.getEmiAnoVencEmis().longValue() == -999) {
            conditions += " AND EMI_ANO_VENC_EMIS IS NULL";
        } else if (this.getEmiAnoVencEmis() != null) {
            conditions += " AND EMI_ANO_VENC_EMIS = ?";
            values.add(this.getEmiAnoVencEmis());
        }

        if (this.getEmiMesVencEmis() != null && this.getEmiMesVencEmis().longValue() == -999) {
            conditions += " AND EMI_MES_VENC_EMIS IS NULL";
        } else if (this.getEmiMesVencEmis() != null) {
            conditions += " AND EMI_MES_VENC_EMIS = ?";
            values.add(this.getEmiMesVencEmis());
        }

        if (this.getEmiDiaVencEmis() != null && this.getEmiDiaVencEmis().longValue() == -999) {
            conditions += " AND EMI_DIA_VENC_EMIS IS NULL";
        } else if (this.getEmiDiaVencEmis() != null) {
            conditions += " AND EMI_DIA_VENC_EMIS = ?";
            values.add(this.getEmiDiaVencEmis());
        }

        if (this.getEmiTasaFactorAj() != null && this.getEmiTasaFactorAj().longValue() == -999) {
            conditions += " AND EMI_TASA_FACTOR_AJ IS NULL";
        } else if (this.getEmiTasaFactorAj() != null) {
            conditions += " AND EMI_TASA_FACTOR_AJ = ?";
            values.add(this.getEmiTasaFactorAj());
        }

        if (this.getEmiCantMinLote() != null && this.getEmiCantMinLote().longValue() == -999) {
            conditions += " AND EMI_CANT_MIN_LOTE IS NULL";
        } else if (this.getEmiCantMinLote() != null) {
            conditions += " AND EMI_CANT_MIN_LOTE = ?";
            values.add(this.getEmiCantMinLote());
        }

        if (this.getEmiCveAgenCalif() != null && "null".equals(this.getEmiCveAgenCalif())) {
            conditions += " AND EMI_CVE_AGEN_CALIF IS NULL";
        } else if (this.getEmiCveAgenCalif() != null) {
            conditions += " AND EMI_CVE_AGEN_CALIF = ?";
            values.add(this.getEmiCveAgenCalif());
        }

        if (this.getEmiCveCalifEmis() != null && "null".equals(this.getEmiCveCalifEmis())) {
            conditions += " AND EMI_CVE_CALIF_EMIS IS NULL";
        } else if (this.getEmiCveCalifEmis() != null) {
            conditions += " AND EMI_CVE_CALIF_EMIS = ?";
            values.add(this.getEmiCveCalifEmis());
        }

        if (this.getEmiCveBursaEmis() != null && "null".equals(this.getEmiCveBursaEmis())) {
            conditions += " AND EMI_CVE_BURSA_EMIS IS NULL";
        } else if (this.getEmiCveBursaEmis() != null) {
            conditions += " AND EMI_CVE_BURSA_EMIS = ?";
            values.add(this.getEmiCveBursaEmis());
        }

        if (this.getEmiAnoAltaReg() != null && this.getEmiAnoAltaReg().longValue() == -999) {
            conditions += " AND EMI_ANO_ALTA_REG IS NULL";
        } else if (this.getEmiAnoAltaReg() != null) {
            conditions += " AND EMI_ANO_ALTA_REG = ?";
            values.add(this.getEmiAnoAltaReg());
        }

        if (this.getEmiMesAltaReg() != null && this.getEmiMesAltaReg().longValue() == -999) {
            conditions += " AND EMI_MES_ALTA_REG IS NULL";
        } else if (this.getEmiMesAltaReg() != null) {
            conditions += " AND EMI_MES_ALTA_REG = ?";
            values.add(this.getEmiMesAltaReg());
        }

        if (this.getEmiDiaAltaReg() != null && this.getEmiDiaAltaReg().longValue() == -999) {
            conditions += " AND EMI_DIA_ALTA_REG IS NULL";
        } else if (this.getEmiDiaAltaReg() != null) {
            conditions += " AND EMI_DIA_ALTA_REG = ?";
            values.add(this.getEmiDiaAltaReg());
        }

        if (this.getEmiAnoUltMod() != null && this.getEmiAnoUltMod().longValue() == -999) {
            conditions += " AND EMI_ANO_ULT_MOD IS NULL";
        } else if (this.getEmiAnoUltMod() != null) {
            conditions += " AND EMI_ANO_ULT_MOD = ?";
            values.add(this.getEmiAnoUltMod());
        }

        if (this.getEmiMesUltMod() != null && this.getEmiMesUltMod().longValue() == -999) {
            conditions += " AND EMI_MES_ULT_MOD IS NULL";
        } else if (this.getEmiMesUltMod() != null) {
            conditions += " AND EMI_MES_ULT_MOD = ?";
            values.add(this.getEmiMesUltMod());
        }

        if (this.getEmiDiaUltMod() != null && this.getEmiDiaUltMod().longValue() == -999) {
            conditions += " AND EMI_DIA_ULT_MOD IS NULL";
        } else if (this.getEmiDiaUltMod() != null) {
            conditions += " AND EMI_DIA_ULT_MOD = ?";
            values.add(this.getEmiDiaUltMod());
        }

        if (this.getEmiCveStEmision() != null && "null".equals(this.getEmiCveStEmision())) {
            conditions += " AND EMI_CVE_ST_EMISION IS NULL";
        } else if (this.getEmiCveStEmision() != null) {
            conditions += " AND EMI_CVE_ST_EMISION = ?";
            values.add(this.getEmiCveStEmision());
        }

        if (this.getEmiFecUltPagIn() != null && "null".equals(this.getEmiFecUltPagIn())) {
            conditions += " AND EMI_FEC_ULT_PAG_IN IS NULL";
        } else if (this.getEmiFecUltPagIn() != null) {
            conditions += " AND EMI_FEC_ULT_PAG_IN = ?";
            values.add(this.getEmiFecUltPagIn());
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
        String sql = "UPDATE EMISION SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EMI_CVE_TIPO_MERCA = ?";
        pkValues.add(this.getEmiCveTipoMerca());
        conditions += " AND EMI_NUM_INSTRUME = ?";
        pkValues.add(this.getEmiNumInstrume());
        conditions += " AND EMI_NUM_SEC_EMIS = ?";
        pkValues.add(this.getEmiNumSecEmis());
        fields += " EMI_NUM_EMISOR = ?, ";
        values.add(this.getEmiNumEmisor());
        fields += " EMI_ID_EMISION_CNB = ?, ";
        values.add(this.getEmiIdEmisionCnb());
        fields += " EMI_CLAVE_VALOR = ?, ";
        values.add(this.getEmiClaveValor());
        fields += " EMI_NOM_PIZARRA = ?, ";
        values.add(this.getEmiNomPizarra());
        fields += " EMI_NUM_SER_EMIS = ?, ";
        values.add(this.getEmiNumSerEmis());
        fields += " EMI_NUM_CUPON_VIG = ?, ";
        values.add(this.getEmiNumCuponVig());
        fields += " EMI_CVE_PER_PAG_EM = ?, ";
        values.add(this.getEmiCvePerPagEm());
        fields += " EMI_NUM_MONEDA = ?, ";
        values.add(this.getEmiNumMoneda());
        fields += " EMI_ANO_EMISION = ?, ";
        values.add(this.getEmiAnoEmision());
        fields += " EMI_MES_EMISION = ?, ";
        values.add(this.getEmiMesEmision());
        fields += " EMI_DIA_EMISION = ?, ";
        values.add(this.getEmiDiaEmision());
        fields += " EMI_ANO_LIQ_EMIS = ?, ";
        values.add(this.getEmiAnoLiqEmis());
        fields += " EMI_MES_LIQ_EMIS = ?, ";
        values.add(this.getEmiMesLiqEmis());
        fields += " EMI_DIA_LIQ_EMIS = ?, ";
        values.add(this.getEmiDiaLiqEmis());
        fields += " EMI_VALOR_NOMINAL = ?, ";
        values.add(this.getEmiValorNominal());
        fields += " EMI_DESC_EMISION = ?, ";
        values.add(this.getEmiDescEmision());
        fields += " EMI_TASA_ANUAL_EM = ?, ";
        values.add(this.getEmiTasaAnualEm());
        fields += " EMI_TASA_ALTA_IMPU = ?, ";
        values.add(this.getEmiTasaAltaImpu());
        fields += " EMI_TASA_BAJA_IMPU = ?, ";
        values.add(this.getEmiTasaBajaImpu());
        fields += " EMI_PJE_SOBRETASA = ?, ";
        values.add(this.getEmiPjeSobretasa());
        fields += " EMI_CVE_TIPO_PERS = ?, ";
        values.add(this.getEmiCveTipoPers());
        fields += " EMI_CVE_PERS_ADQ = ?, ";
        values.add(this.getEmiCvePersAdq());
        fields += " EMI_ANO_VENC_EMIS = ?, ";
        values.add(this.getEmiAnoVencEmis());
        fields += " EMI_MES_VENC_EMIS = ?, ";
        values.add(this.getEmiMesVencEmis());
        fields += " EMI_DIA_VENC_EMIS = ?, ";
        values.add(this.getEmiDiaVencEmis());
        fields += " EMI_TASA_FACTOR_AJ = ?, ";
        values.add(this.getEmiTasaFactorAj());
        fields += " EMI_CANT_MIN_LOTE = ?, ";
        values.add(this.getEmiCantMinLote());
        fields += " EMI_CVE_AGEN_CALIF = ?, ";
        values.add(this.getEmiCveAgenCalif());
        fields += " EMI_CVE_CALIF_EMIS = ?, ";
        values.add(this.getEmiCveCalifEmis());
        fields += " EMI_CVE_BURSA_EMIS = ?, ";
        values.add(this.getEmiCveBursaEmis());
        fields += " EMI_ANO_ALTA_REG = ?, ";
        values.add(this.getEmiAnoAltaReg());
        fields += " EMI_MES_ALTA_REG = ?, ";
        values.add(this.getEmiMesAltaReg());
        fields += " EMI_DIA_ALTA_REG = ?, ";
        values.add(this.getEmiDiaAltaReg());
        fields += " EMI_ANO_ULT_MOD = ?, ";
        values.add(this.getEmiAnoUltMod());
        fields += " EMI_MES_ULT_MOD = ?, ";
        values.add(this.getEmiMesUltMod());
        fields += " EMI_DIA_ULT_MOD = ?, ";
        values.add(this.getEmiDiaUltMod());
        fields += " EMI_CVE_ST_EMISION = ?, ";
        values.add(this.getEmiCveStEmision());
        fields += " EMI_FEC_ULT_PAG_IN = ?, ";
        values.add(this.getEmiFecUltPagIn());
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
        String sql = "INSERT INTO EMISION ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EMI_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getEmiCveTipoMerca());

        fields += ", EMI_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getEmiNumInstrume());

        fields += ", EMI_NUM_SEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmiNumSecEmis());

        fields += ", EMI_NUM_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEmiNumEmisor());

        fields += ", EMI_ID_EMISION_CNB";
        fieldValues += ", ?";
        values.add(this.getEmiIdEmisionCnb());

        fields += ", EMI_CLAVE_VALOR";
        fieldValues += ", ?";
        values.add(this.getEmiClaveValor());

        fields += ", EMI_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getEmiNomPizarra());

        fields += ", EMI_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmiNumSerEmis());

        fields += ", EMI_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getEmiNumCuponVig());

        fields += ", EMI_CVE_PER_PAG_EM";
        fieldValues += ", ?";
        values.add(this.getEmiCvePerPagEm());

        fields += ", EMI_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getEmiNumMoneda());

        fields += ", EMI_ANO_EMISION";
        fieldValues += ", ?";
        values.add(this.getEmiAnoEmision());

        fields += ", EMI_MES_EMISION";
        fieldValues += ", ?";
        values.add(this.getEmiMesEmision());

        fields += ", EMI_DIA_EMISION";
        fieldValues += ", ?";
        values.add(this.getEmiDiaEmision());

        fields += ", EMI_ANO_LIQ_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmiAnoLiqEmis());

        fields += ", EMI_MES_LIQ_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmiMesLiqEmis());

        fields += ", EMI_DIA_LIQ_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmiDiaLiqEmis());

        fields += ", EMI_VALOR_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getEmiValorNominal());

        fields += ", EMI_DESC_EMISION";
        fieldValues += ", ?";
        values.add(this.getEmiDescEmision());

        fields += ", EMI_TASA_ANUAL_EM";
        fieldValues += ", ?";
        values.add(this.getEmiTasaAnualEm());

        fields += ", EMI_TASA_ALTA_IMPU";
        fieldValues += ", ?";
        values.add(this.getEmiTasaAltaImpu());

        fields += ", EMI_TASA_BAJA_IMPU";
        fieldValues += ", ?";
        values.add(this.getEmiTasaBajaImpu());

        fields += ", EMI_PJE_SOBRETASA";
        fieldValues += ", ?";
        values.add(this.getEmiPjeSobretasa());

        fields += ", EMI_CVE_TIPO_PERS";
        fieldValues += ", ?";
        values.add(this.getEmiCveTipoPers());

        fields += ", EMI_CVE_PERS_ADQ";
        fieldValues += ", ?";
        values.add(this.getEmiCvePersAdq());

        fields += ", EMI_ANO_VENC_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmiAnoVencEmis());

        fields += ", EMI_MES_VENC_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmiMesVencEmis());

        fields += ", EMI_DIA_VENC_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmiDiaVencEmis());

        fields += ", EMI_TASA_FACTOR_AJ";
        fieldValues += ", ?";
        values.add(this.getEmiTasaFactorAj());

        fields += ", EMI_CANT_MIN_LOTE";
        fieldValues += ", ?";
        values.add(this.getEmiCantMinLote());

        fields += ", EMI_CVE_AGEN_CALIF";
        fieldValues += ", ?";
        values.add(this.getEmiCveAgenCalif());

        fields += ", EMI_CVE_CALIF_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmiCveCalifEmis());

        fields += ", EMI_CVE_BURSA_EMIS";
        fieldValues += ", ?";
        values.add(this.getEmiCveBursaEmis());

        fields += ", EMI_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmiAnoAltaReg());

        fields += ", EMI_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmiMesAltaReg());

        fields += ", EMI_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEmiDiaAltaReg());

        fields += ", EMI_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmiAnoUltMod());

        fields += ", EMI_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmiMesUltMod());

        fields += ", EMI_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEmiDiaUltMod());

        fields += ", EMI_CVE_ST_EMISION";
        fieldValues += ", ?";
        values.add(this.getEmiCveStEmision());

        fields += ", EMI_FEC_ULT_PAG_IN";
        fieldValues += ", ?";
        values.add(this.getEmiFecUltPagIn());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISION WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EMI_CVE_TIPO_MERCA = ?";
        values.add(this.getEmiCveTipoMerca());
        conditions += " AND EMI_NUM_INSTRUME = ?";
        values.add(this.getEmiNumInstrume());
        conditions += " AND EMI_NUM_SEC_EMIS = ?";
        values.add(this.getEmiNumSecEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emision instance = (Emision) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEmiCveTipoMerca().equals(instance.getEmiCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getEmiNumInstrume().equals(instance.getEmiNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getEmiNumSecEmis().equals(instance.getEmiNumSecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmiNumEmisor().equals(instance.getEmiNumEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getEmiIdEmisionCnb().equals(instance.getEmiIdEmisionCnb()))
            equalObjects = false;
        if (equalObjects && !this.getEmiClaveValor().equals(instance.getEmiClaveValor()))
            equalObjects = false;
        if (equalObjects && !this.getEmiNomPizarra().equals(instance.getEmiNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getEmiNumSerEmis().equals(instance.getEmiNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmiNumCuponVig().equals(instance.getEmiNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getEmiCvePerPagEm().equals(instance.getEmiCvePerPagEm()))
            equalObjects = false;
        if (equalObjects && !this.getEmiNumMoneda().equals(instance.getEmiNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getEmiAnoEmision().equals(instance.getEmiAnoEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEmiMesEmision().equals(instance.getEmiMesEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEmiDiaEmision().equals(instance.getEmiDiaEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEmiAnoLiqEmis().equals(instance.getEmiAnoLiqEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmiMesLiqEmis().equals(instance.getEmiMesLiqEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmiDiaLiqEmis().equals(instance.getEmiDiaLiqEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmiValorNominal().equals(instance.getEmiValorNominal()))
            equalObjects = false;
        if (equalObjects && !this.getEmiDescEmision().equals(instance.getEmiDescEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEmiTasaAnualEm().equals(instance.getEmiTasaAnualEm()))
            equalObjects = false;
        if (equalObjects && !this.getEmiTasaAltaImpu().equals(instance.getEmiTasaAltaImpu()))
            equalObjects = false;
        if (equalObjects && !this.getEmiTasaBajaImpu().equals(instance.getEmiTasaBajaImpu()))
            equalObjects = false;
        if (equalObjects && !this.getEmiPjeSobretasa().equals(instance.getEmiPjeSobretasa()))
            equalObjects = false;
        if (equalObjects && !this.getEmiCveTipoPers().equals(instance.getEmiCveTipoPers()))
            equalObjects = false;
        if (equalObjects && !this.getEmiCvePersAdq().equals(instance.getEmiCvePersAdq()))
            equalObjects = false;
        if (equalObjects && !this.getEmiAnoVencEmis().equals(instance.getEmiAnoVencEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmiMesVencEmis().equals(instance.getEmiMesVencEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmiDiaVencEmis().equals(instance.getEmiDiaVencEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmiTasaFactorAj().equals(instance.getEmiTasaFactorAj()))
            equalObjects = false;
        if (equalObjects && !this.getEmiCantMinLote().equals(instance.getEmiCantMinLote()))
            equalObjects = false;
        if (equalObjects && !this.getEmiCveAgenCalif().equals(instance.getEmiCveAgenCalif()))
            equalObjects = false;
        if (equalObjects && !this.getEmiCveCalifEmis().equals(instance.getEmiCveCalifEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmiCveBursaEmis().equals(instance.getEmiCveBursaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getEmiAnoAltaReg().equals(instance.getEmiAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmiMesAltaReg().equals(instance.getEmiMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmiDiaAltaReg().equals(instance.getEmiDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEmiAnoUltMod().equals(instance.getEmiAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmiMesUltMod().equals(instance.getEmiMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmiDiaUltMod().equals(instance.getEmiDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEmiCveStEmision().equals(instance.getEmiCveStEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEmiFecUltPagIn().equals(instance.getEmiFecUltPagIn()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emision result = new Emision();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEmiCveTipoMerca((BigDecimal) objectData.getData("EMI_CVE_TIPO_MERCA"));
        result.setEmiNumInstrume((BigDecimal) objectData.getData("EMI_NUM_INSTRUME"));
        result.setEmiNumSecEmis((BigDecimal) objectData.getData("EMI_NUM_SEC_EMIS"));
        result.setEmiNumEmisor((BigDecimal) objectData.getData("EMI_NUM_EMISOR"));
        result.setEmiIdEmisionCnb((String) objectData.getData("EMI_ID_EMISION_CNB"));
        result.setEmiClaveValor((String) objectData.getData("EMI_CLAVE_VALOR"));
        result.setEmiNomPizarra((String) objectData.getData("EMI_NOM_PIZARRA"));
        result.setEmiNumSerEmis((String) objectData.getData("EMI_NUM_SER_EMIS"));
        result.setEmiNumCuponVig((BigDecimal) objectData.getData("EMI_NUM_CUPON_VIG"));
        result.setEmiCvePerPagEm((String) objectData.getData("EMI_CVE_PER_PAG_EM"));
        result.setEmiNumMoneda((BigDecimal) objectData.getData("EMI_NUM_MONEDA"));
        result.setEmiAnoEmision((BigDecimal) objectData.getData("EMI_ANO_EMISION"));
        result.setEmiMesEmision((BigDecimal) objectData.getData("EMI_MES_EMISION"));
        result.setEmiDiaEmision((BigDecimal) objectData.getData("EMI_DIA_EMISION"));
        result.setEmiAnoLiqEmis((BigDecimal) objectData.getData("EMI_ANO_LIQ_EMIS"));
        result.setEmiMesLiqEmis((BigDecimal) objectData.getData("EMI_MES_LIQ_EMIS"));
        result.setEmiDiaLiqEmis((BigDecimal) objectData.getData("EMI_DIA_LIQ_EMIS"));
        result.setEmiValorNominal((BigDecimal) objectData.getData("EMI_VALOR_NOMINAL"));
        result.setEmiDescEmision((String) objectData.getData("EMI_DESC_EMISION"));
        result.setEmiTasaAnualEm((BigDecimal) objectData.getData("EMI_TASA_ANUAL_EM"));
        result.setEmiTasaAltaImpu((BigDecimal) objectData.getData("EMI_TASA_ALTA_IMPU"));
        result.setEmiTasaBajaImpu((BigDecimal) objectData.getData("EMI_TASA_BAJA_IMPU"));
        result.setEmiPjeSobretasa((BigDecimal) objectData.getData("EMI_PJE_SOBRETASA"));
        result.setEmiCveTipoPers((String) objectData.getData("EMI_CVE_TIPO_PERS"));
        result.setEmiCvePersAdq((String) objectData.getData("EMI_CVE_PERS_ADQ"));
        result.setEmiAnoVencEmis((BigDecimal) objectData.getData("EMI_ANO_VENC_EMIS"));
        result.setEmiMesVencEmis((BigDecimal) objectData.getData("EMI_MES_VENC_EMIS"));
        result.setEmiDiaVencEmis((BigDecimal) objectData.getData("EMI_DIA_VENC_EMIS"));
        result.setEmiTasaFactorAj((BigDecimal) objectData.getData("EMI_TASA_FACTOR_AJ"));
        result.setEmiCantMinLote((BigDecimal) objectData.getData("EMI_CANT_MIN_LOTE"));
        result.setEmiCveAgenCalif((String) objectData.getData("EMI_CVE_AGEN_CALIF"));
        result.setEmiCveCalifEmis((String) objectData.getData("EMI_CVE_CALIF_EMIS"));
        result.setEmiCveBursaEmis((String) objectData.getData("EMI_CVE_BURSA_EMIS"));
        result.setEmiAnoAltaReg((BigDecimal) objectData.getData("EMI_ANO_ALTA_REG"));
        result.setEmiMesAltaReg((BigDecimal) objectData.getData("EMI_MES_ALTA_REG"));
        result.setEmiDiaAltaReg((BigDecimal) objectData.getData("EMI_DIA_ALTA_REG"));
        result.setEmiAnoUltMod((BigDecimal) objectData.getData("EMI_ANO_ULT_MOD"));
        result.setEmiMesUltMod((BigDecimal) objectData.getData("EMI_MES_ULT_MOD"));
        result.setEmiDiaUltMod((BigDecimal) objectData.getData("EMI_DIA_ULT_MOD"));
        result.setEmiCveStEmision((String) objectData.getData("EMI_CVE_ST_EMISION"));
        result.setEmiFecUltPagIn((String) objectData.getData("EMI_FEC_ULT_PAG_IN"));

        return result;

    }

}
