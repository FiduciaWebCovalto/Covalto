package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARPABENH_PK", columns = { "PBE_BENEFICIARIO", "PBE_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Parpabenh extends DomainObject {

    BigDecimal pbeNumContrato = null;
    BigDecimal pbeBeneficiario = null;
    BigDecimal pbePjeCapital = null;
    String pbeCvePerCap = null;
    BigDecimal pbeAnoPagoCap = null;
    BigDecimal pbeMesPagoCap = null;
    BigDecimal pbeDiaPagoCap = null;
    BigDecimal pbePjeLiqRendim = null;
    BigDecimal pbeAnoLiqRendim = null;
    BigDecimal pbeMesLiqRendim = null;
    BigDecimal pbeDiaLiqRendim = null;
    BigDecimal pbeImpFijoPago = null;
    String pbeCvePerPago = null;
    BigDecimal pbeNumPagos = null;
    BigDecimal pbePagosEfect = null;
    BigDecimal pbeAnoIniPago = null;
    BigDecimal pbeMesIniPago = null;
    BigDecimal pbeDiaIniPago = null;
    BigDecimal pbeAnoFinPago = null;
    BigDecimal pbeMesFinPago = null;
    BigDecimal pbeDiaFinPago = null;
    BigDecimal pbeAnoProxPago = null;
    BigDecimal pbeMesProxPago = null;
    BigDecimal pbeDiaProxPago = null;
    BigDecimal pbeVecesSalMin = null;
    BigDecimal pbeAnoAltaReg = null;
    BigDecimal pbeMesAltaReg = null;
    BigDecimal pbeDiaAltaReg = null;
    BigDecimal pbeAnoUltMod = null;
    BigDecimal pbeMesUltMod = null;
    BigDecimal pbeDiaUltMod = null;
    String pbeCveStParpabe = null;
    BigDecimal pbeSubContrato = null;
    BigDecimal pbeSubPrograma = null;

    public Parpabenh() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbeNumContrato(BigDecimal pbeNumContrato) {
        this.pbeNumContrato = pbeNumContrato;
    }

    public BigDecimal getPbeNumContrato() {
        return this.pbeNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbeBeneficiario(BigDecimal pbeBeneficiario) {
        this.pbeBeneficiario = pbeBeneficiario;
    }

    public BigDecimal getPbeBeneficiario() {
        return this.pbeBeneficiario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setPbePjeCapital(BigDecimal pbePjeCapital) {
        this.pbePjeCapital = pbePjeCapital;
    }

    public BigDecimal getPbePjeCapital() {
        return this.pbePjeCapital;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPbeCvePerCap(String pbeCvePerCap) {
        this.pbeCvePerCap = pbeCvePerCap;
    }

    public String getPbeCvePerCap() {
        return this.pbeCvePerCap;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbeAnoPagoCap(BigDecimal pbeAnoPagoCap) {
        this.pbeAnoPagoCap = pbeAnoPagoCap;
    }

    public BigDecimal getPbeAnoPagoCap() {
        return this.pbeAnoPagoCap;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeMesPagoCap(BigDecimal pbeMesPagoCap) {
        this.pbeMesPagoCap = pbeMesPagoCap;
    }

    public BigDecimal getPbeMesPagoCap() {
        return this.pbeMesPagoCap;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeDiaPagoCap(BigDecimal pbeDiaPagoCap) {
        this.pbeDiaPagoCap = pbeDiaPagoCap;
    }

    public BigDecimal getPbeDiaPagoCap() {
        return this.pbeDiaPagoCap;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setPbePjeLiqRendim(BigDecimal pbePjeLiqRendim) {
        this.pbePjeLiqRendim = pbePjeLiqRendim;
    }

    public BigDecimal getPbePjeLiqRendim() {
        return this.pbePjeLiqRendim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbeAnoLiqRendim(BigDecimal pbeAnoLiqRendim) {
        this.pbeAnoLiqRendim = pbeAnoLiqRendim;
    }

    public BigDecimal getPbeAnoLiqRendim() {
        return this.pbeAnoLiqRendim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeMesLiqRendim(BigDecimal pbeMesLiqRendim) {
        this.pbeMesLiqRendim = pbeMesLiqRendim;
    }

    public BigDecimal getPbeMesLiqRendim() {
        return this.pbeMesLiqRendim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeDiaLiqRendim(BigDecimal pbeDiaLiqRendim) {
        this.pbeDiaLiqRendim = pbeDiaLiqRendim;
    }

    public BigDecimal getPbeDiaLiqRendim() {
        return this.pbeDiaLiqRendim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPbeImpFijoPago(BigDecimal pbeImpFijoPago) {
        this.pbeImpFijoPago = pbeImpFijoPago;
    }

    public BigDecimal getPbeImpFijoPago() {
        return this.pbeImpFijoPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPbeCvePerPago(String pbeCvePerPago) {
        this.pbeCvePerPago = pbeCvePerPago;
    }

    public String getPbeCvePerPago() {
        return this.pbeCvePerPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbeNumPagos(BigDecimal pbeNumPagos) {
        this.pbeNumPagos = pbeNumPagos;
    }

    public BigDecimal getPbeNumPagos() {
        return this.pbeNumPagos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbePagosEfect(BigDecimal pbePagosEfect) {
        this.pbePagosEfect = pbePagosEfect;
    }

    public BigDecimal getPbePagosEfect() {
        return this.pbePagosEfect;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbeAnoIniPago(BigDecimal pbeAnoIniPago) {
        this.pbeAnoIniPago = pbeAnoIniPago;
    }

    public BigDecimal getPbeAnoIniPago() {
        return this.pbeAnoIniPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeMesIniPago(BigDecimal pbeMesIniPago) {
        this.pbeMesIniPago = pbeMesIniPago;
    }

    public BigDecimal getPbeMesIniPago() {
        return this.pbeMesIniPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeDiaIniPago(BigDecimal pbeDiaIniPago) {
        this.pbeDiaIniPago = pbeDiaIniPago;
    }

    public BigDecimal getPbeDiaIniPago() {
        return this.pbeDiaIniPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbeAnoFinPago(BigDecimal pbeAnoFinPago) {
        this.pbeAnoFinPago = pbeAnoFinPago;
    }

    public BigDecimal getPbeAnoFinPago() {
        return this.pbeAnoFinPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeMesFinPago(BigDecimal pbeMesFinPago) {
        this.pbeMesFinPago = pbeMesFinPago;
    }

    public BigDecimal getPbeMesFinPago() {
        return this.pbeMesFinPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeDiaFinPago(BigDecimal pbeDiaFinPago) {
        this.pbeDiaFinPago = pbeDiaFinPago;
    }

    public BigDecimal getPbeDiaFinPago() {
        return this.pbeDiaFinPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbeAnoProxPago(BigDecimal pbeAnoProxPago) {
        this.pbeAnoProxPago = pbeAnoProxPago;
    }

    public BigDecimal getPbeAnoProxPago() {
        return this.pbeAnoProxPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeMesProxPago(BigDecimal pbeMesProxPago) {
        this.pbeMesProxPago = pbeMesProxPago;
    }

    public BigDecimal getPbeMesProxPago() {
        return this.pbeMesProxPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeDiaProxPago(BigDecimal pbeDiaProxPago) {
        this.pbeDiaProxPago = pbeDiaProxPago;
    }

    public BigDecimal getPbeDiaProxPago() {
        return this.pbeDiaProxPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbeVecesSalMin(BigDecimal pbeVecesSalMin) {
        this.pbeVecesSalMin = pbeVecesSalMin;
    }

    public BigDecimal getPbeVecesSalMin() {
        return this.pbeVecesSalMin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbeAnoAltaReg(BigDecimal pbeAnoAltaReg) {
        this.pbeAnoAltaReg = pbeAnoAltaReg;
    }

    public BigDecimal getPbeAnoAltaReg() {
        return this.pbeAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeMesAltaReg(BigDecimal pbeMesAltaReg) {
        this.pbeMesAltaReg = pbeMesAltaReg;
    }

    public BigDecimal getPbeMesAltaReg() {
        return this.pbeMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeDiaAltaReg(BigDecimal pbeDiaAltaReg) {
        this.pbeDiaAltaReg = pbeDiaAltaReg;
    }

    public BigDecimal getPbeDiaAltaReg() {
        return this.pbeDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbeAnoUltMod(BigDecimal pbeAnoUltMod) {
        this.pbeAnoUltMod = pbeAnoUltMod;
    }

    public BigDecimal getPbeAnoUltMod() {
        return this.pbeAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeMesUltMod(BigDecimal pbeMesUltMod) {
        this.pbeMesUltMod = pbeMesUltMod;
    }

    public BigDecimal getPbeMesUltMod() {
        return this.pbeMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbeDiaUltMod(BigDecimal pbeDiaUltMod) {
        this.pbeDiaUltMod = pbeDiaUltMod;
    }

    public BigDecimal getPbeDiaUltMod() {
        return this.pbeDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPbeCveStParpabe(String pbeCveStParpabe) {
        this.pbeCveStParpabe = pbeCveStParpabe;
    }

    public String getPbeCveStParpabe() {
        return this.pbeCveStParpabe;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbeSubContrato(BigDecimal pbeSubContrato) {
        this.pbeSubContrato = pbeSubContrato;
    }

    public BigDecimal getPbeSubContrato() {
        return this.pbeSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbeSubPrograma(BigDecimal pbeSubPrograma) {
        this.pbeSubPrograma = pbeSubPrograma;
    }

    public BigDecimal getPbeSubPrograma() {
        return this.pbeSubPrograma;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARPABENH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPbeNumContrato() != null && this.getPbeNumContrato().longValue() == -999) {
            conditions += " AND PBE_NUM_CONTRATO IS NULL";
        } else if (this.getPbeNumContrato() != null) {
            conditions += " AND PBE_NUM_CONTRATO = ?";
            values.add(this.getPbeNumContrato());
        }

        if (this.getPbeBeneficiario() != null && this.getPbeBeneficiario().longValue() == -999) {
            conditions += " AND PBE_BENEFICIARIO IS NULL";
        } else if (this.getPbeBeneficiario() != null) {
            conditions += " AND PBE_BENEFICIARIO = ?";
            values.add(this.getPbeBeneficiario());
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
        String sql = "SELECT * FROM PARPABENH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPbeNumContrato() != null && this.getPbeNumContrato().longValue() == -999) {
            conditions += " AND PBE_NUM_CONTRATO IS NULL";
        } else if (this.getPbeNumContrato() != null) {
            conditions += " AND PBE_NUM_CONTRATO = ?";
            values.add(this.getPbeNumContrato());
        }

        if (this.getPbeBeneficiario() != null && this.getPbeBeneficiario().longValue() == -999) {
            conditions += " AND PBE_BENEFICIARIO IS NULL";
        } else if (this.getPbeBeneficiario() != null) {
            conditions += " AND PBE_BENEFICIARIO = ?";
            values.add(this.getPbeBeneficiario());
        }

        if (this.getPbePjeCapital() != null && this.getPbePjeCapital().longValue() == -999) {
            conditions += " AND PBE_PJE_CAPITAL IS NULL";
        } else if (this.getPbePjeCapital() != null) {
            conditions += " AND PBE_PJE_CAPITAL = ?";
            values.add(this.getPbePjeCapital());
        }

        if (this.getPbeCvePerCap() != null && "null".equals(this.getPbeCvePerCap())) {
            conditions += " AND PBE_CVE_PER_CAP IS NULL";
        } else if (this.getPbeCvePerCap() != null) {
            conditions += " AND PBE_CVE_PER_CAP = ?";
            values.add(this.getPbeCvePerCap());
        }

        if (this.getPbeAnoPagoCap() != null && this.getPbeAnoPagoCap().longValue() == -999) {
            conditions += " AND PBE_ANO_PAGO_CAP IS NULL";
        } else if (this.getPbeAnoPagoCap() != null) {
            conditions += " AND PBE_ANO_PAGO_CAP = ?";
            values.add(this.getPbeAnoPagoCap());
        }

        if (this.getPbeMesPagoCap() != null && this.getPbeMesPagoCap().longValue() == -999) {
            conditions += " AND PBE_MES_PAGO_CAP IS NULL";
        } else if (this.getPbeMesPagoCap() != null) {
            conditions += " AND PBE_MES_PAGO_CAP = ?";
            values.add(this.getPbeMesPagoCap());
        }

        if (this.getPbeDiaPagoCap() != null && this.getPbeDiaPagoCap().longValue() == -999) {
            conditions += " AND PBE_DIA_PAGO_CAP IS NULL";
        } else if (this.getPbeDiaPagoCap() != null) {
            conditions += " AND PBE_DIA_PAGO_CAP = ?";
            values.add(this.getPbeDiaPagoCap());
        }

        if (this.getPbePjeLiqRendim() != null && this.getPbePjeLiqRendim().longValue() == -999) {
            conditions += " AND PBE_PJE_LIQ_RENDIM IS NULL";
        } else if (this.getPbePjeLiqRendim() != null) {
            conditions += " AND PBE_PJE_LIQ_RENDIM = ?";
            values.add(this.getPbePjeLiqRendim());
        }

        if (this.getPbeAnoLiqRendim() != null && this.getPbeAnoLiqRendim().longValue() == -999) {
            conditions += " AND PBE_ANO_LIQ_RENDIM IS NULL";
        } else if (this.getPbeAnoLiqRendim() != null) {
            conditions += " AND PBE_ANO_LIQ_RENDIM = ?";
            values.add(this.getPbeAnoLiqRendim());
        }

        if (this.getPbeMesLiqRendim() != null && this.getPbeMesLiqRendim().longValue() == -999) {
            conditions += " AND PBE_MES_LIQ_RENDIM IS NULL";
        } else if (this.getPbeMesLiqRendim() != null) {
            conditions += " AND PBE_MES_LIQ_RENDIM = ?";
            values.add(this.getPbeMesLiqRendim());
        }

        if (this.getPbeDiaLiqRendim() != null && this.getPbeDiaLiqRendim().longValue() == -999) {
            conditions += " AND PBE_DIA_LIQ_RENDIM IS NULL";
        } else if (this.getPbeDiaLiqRendim() != null) {
            conditions += " AND PBE_DIA_LIQ_RENDIM = ?";
            values.add(this.getPbeDiaLiqRendim());
        }

        if (this.getPbeImpFijoPago() != null && this.getPbeImpFijoPago().longValue() == -999) {
            conditions += " AND PBE_IMP_FIJO_PAGO IS NULL";
        } else if (this.getPbeImpFijoPago() != null) {
            conditions += " AND PBE_IMP_FIJO_PAGO = ?";
            values.add(this.getPbeImpFijoPago());
        }

        if (this.getPbeCvePerPago() != null && "null".equals(this.getPbeCvePerPago())) {
            conditions += " AND PBE_CVE_PER_PAGO IS NULL";
        } else if (this.getPbeCvePerPago() != null) {
            conditions += " AND PBE_CVE_PER_PAGO = ?";
            values.add(this.getPbeCvePerPago());
        }

        if (this.getPbeNumPagos() != null && this.getPbeNumPagos().longValue() == -999) {
            conditions += " AND PBE_NUM_PAGOS IS NULL";
        } else if (this.getPbeNumPagos() != null) {
            conditions += " AND PBE_NUM_PAGOS = ?";
            values.add(this.getPbeNumPagos());
        }

        if (this.getPbePagosEfect() != null && this.getPbePagosEfect().longValue() == -999) {
            conditions += " AND PBE_PAGOS_EFECT IS NULL";
        } else if (this.getPbePagosEfect() != null) {
            conditions += " AND PBE_PAGOS_EFECT = ?";
            values.add(this.getPbePagosEfect());
        }

        if (this.getPbeAnoIniPago() != null && this.getPbeAnoIniPago().longValue() == -999) {
            conditions += " AND PBE_ANO_INI_PAGO IS NULL";
        } else if (this.getPbeAnoIniPago() != null) {
            conditions += " AND PBE_ANO_INI_PAGO = ?";
            values.add(this.getPbeAnoIniPago());
        }

        if (this.getPbeMesIniPago() != null && this.getPbeMesIniPago().longValue() == -999) {
            conditions += " AND PBE_MES_INI_PAGO IS NULL";
        } else if (this.getPbeMesIniPago() != null) {
            conditions += " AND PBE_MES_INI_PAGO = ?";
            values.add(this.getPbeMesIniPago());
        }

        if (this.getPbeDiaIniPago() != null && this.getPbeDiaIniPago().longValue() == -999) {
            conditions += " AND PBE_DIA_INI_PAGO IS NULL";
        } else if (this.getPbeDiaIniPago() != null) {
            conditions += " AND PBE_DIA_INI_PAGO = ?";
            values.add(this.getPbeDiaIniPago());
        }

        if (this.getPbeAnoFinPago() != null && this.getPbeAnoFinPago().longValue() == -999) {
            conditions += " AND PBE_ANO_FIN_PAGO IS NULL";
        } else if (this.getPbeAnoFinPago() != null) {
            conditions += " AND PBE_ANO_FIN_PAGO = ?";
            values.add(this.getPbeAnoFinPago());
        }

        if (this.getPbeMesFinPago() != null && this.getPbeMesFinPago().longValue() == -999) {
            conditions += " AND PBE_MES_FIN_PAGO IS NULL";
        } else if (this.getPbeMesFinPago() != null) {
            conditions += " AND PBE_MES_FIN_PAGO = ?";
            values.add(this.getPbeMesFinPago());
        }

        if (this.getPbeDiaFinPago() != null && this.getPbeDiaFinPago().longValue() == -999) {
            conditions += " AND PBE_DIA_FIN_PAGO IS NULL";
        } else if (this.getPbeDiaFinPago() != null) {
            conditions += " AND PBE_DIA_FIN_PAGO = ?";
            values.add(this.getPbeDiaFinPago());
        }

        if (this.getPbeAnoProxPago() != null && this.getPbeAnoProxPago().longValue() == -999) {
            conditions += " AND PBE_ANO_PROX_PAGO IS NULL";
        } else if (this.getPbeAnoProxPago() != null) {
            conditions += " AND PBE_ANO_PROX_PAGO = ?";
            values.add(this.getPbeAnoProxPago());
        }

        if (this.getPbeMesProxPago() != null && this.getPbeMesProxPago().longValue() == -999) {
            conditions += " AND PBE_MES_PROX_PAGO IS NULL";
        } else if (this.getPbeMesProxPago() != null) {
            conditions += " AND PBE_MES_PROX_PAGO = ?";
            values.add(this.getPbeMesProxPago());
        }

        if (this.getPbeDiaProxPago() != null && this.getPbeDiaProxPago().longValue() == -999) {
            conditions += " AND PBE_DIA_PROX_PAGO IS NULL";
        } else if (this.getPbeDiaProxPago() != null) {
            conditions += " AND PBE_DIA_PROX_PAGO = ?";
            values.add(this.getPbeDiaProxPago());
        }

        if (this.getPbeVecesSalMin() != null && this.getPbeVecesSalMin().longValue() == -999) {
            conditions += " AND PBE_VECES_SAL_MIN IS NULL";
        } else if (this.getPbeVecesSalMin() != null) {
            conditions += " AND PBE_VECES_SAL_MIN = ?";
            values.add(this.getPbeVecesSalMin());
        }

        if (this.getPbeAnoAltaReg() != null && this.getPbeAnoAltaReg().longValue() == -999) {
            conditions += " AND PBE_ANO_ALTA_REG IS NULL";
        } else if (this.getPbeAnoAltaReg() != null) {
            conditions += " AND PBE_ANO_ALTA_REG = ?";
            values.add(this.getPbeAnoAltaReg());
        }

        if (this.getPbeMesAltaReg() != null && this.getPbeMesAltaReg().longValue() == -999) {
            conditions += " AND PBE_MES_ALTA_REG IS NULL";
        } else if (this.getPbeMesAltaReg() != null) {
            conditions += " AND PBE_MES_ALTA_REG = ?";
            values.add(this.getPbeMesAltaReg());
        }

        if (this.getPbeDiaAltaReg() != null && this.getPbeDiaAltaReg().longValue() == -999) {
            conditions += " AND PBE_DIA_ALTA_REG IS NULL";
        } else if (this.getPbeDiaAltaReg() != null) {
            conditions += " AND PBE_DIA_ALTA_REG = ?";
            values.add(this.getPbeDiaAltaReg());
        }

        if (this.getPbeAnoUltMod() != null && this.getPbeAnoUltMod().longValue() == -999) {
            conditions += " AND PBE_ANO_ULT_MOD IS NULL";
        } else if (this.getPbeAnoUltMod() != null) {
            conditions += " AND PBE_ANO_ULT_MOD = ?";
            values.add(this.getPbeAnoUltMod());
        }

        if (this.getPbeMesUltMod() != null && this.getPbeMesUltMod().longValue() == -999) {
            conditions += " AND PBE_MES_ULT_MOD IS NULL";
        } else if (this.getPbeMesUltMod() != null) {
            conditions += " AND PBE_MES_ULT_MOD = ?";
            values.add(this.getPbeMesUltMod());
        }

        if (this.getPbeDiaUltMod() != null && this.getPbeDiaUltMod().longValue() == -999) {
            conditions += " AND PBE_DIA_ULT_MOD IS NULL";
        } else if (this.getPbeDiaUltMod() != null) {
            conditions += " AND PBE_DIA_ULT_MOD = ?";
            values.add(this.getPbeDiaUltMod());
        }

        if (this.getPbeCveStParpabe() != null && "null".equals(this.getPbeCveStParpabe())) {
            conditions += " AND PBE_CVE_ST_PARPABE IS NULL";
        } else if (this.getPbeCveStParpabe() != null) {
            conditions += " AND PBE_CVE_ST_PARPABE = ?";
            values.add(this.getPbeCveStParpabe());
        }

        if (this.getPbeSubContrato() != null && this.getPbeSubContrato().longValue() == -999) {
            conditions += " AND PBE_SUB_CONTRATO IS NULL";
        } else if (this.getPbeSubContrato() != null) {
            conditions += " AND PBE_SUB_CONTRATO = ?";
            values.add(this.getPbeSubContrato());
        }

        if (this.getPbeSubPrograma() != null && this.getPbeSubPrograma().longValue() == -999) {
            conditions += " AND PBE_SUB_PROGRAMA IS NULL";
        } else if (this.getPbeSubPrograma() != null) {
            conditions += " AND PBE_SUB_PROGRAMA = ?";
            values.add(this.getPbeSubPrograma());
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
        String sql = "UPDATE PARPABENH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PBE_NUM_CONTRATO = ?";
        pkValues.add(this.getPbeNumContrato());
        conditions += " AND PBE_BENEFICIARIO = ?";
        pkValues.add(this.getPbeBeneficiario());
        fields += " PBE_PJE_CAPITAL = ?, ";
        values.add(this.getPbePjeCapital());
        fields += " PBE_CVE_PER_CAP = ?, ";
        values.add(this.getPbeCvePerCap());
        fields += " PBE_ANO_PAGO_CAP = ?, ";
        values.add(this.getPbeAnoPagoCap());
        fields += " PBE_MES_PAGO_CAP = ?, ";
        values.add(this.getPbeMesPagoCap());
        fields += " PBE_DIA_PAGO_CAP = ?, ";
        values.add(this.getPbeDiaPagoCap());
        fields += " PBE_PJE_LIQ_RENDIM = ?, ";
        values.add(this.getPbePjeLiqRendim());
        fields += " PBE_ANO_LIQ_RENDIM = ?, ";
        values.add(this.getPbeAnoLiqRendim());
        fields += " PBE_MES_LIQ_RENDIM = ?, ";
        values.add(this.getPbeMesLiqRendim());
        fields += " PBE_DIA_LIQ_RENDIM = ?, ";
        values.add(this.getPbeDiaLiqRendim());
        fields += " PBE_IMP_FIJO_PAGO = ?, ";
        values.add(this.getPbeImpFijoPago());
        fields += " PBE_CVE_PER_PAGO = ?, ";
        values.add(this.getPbeCvePerPago());
        fields += " PBE_NUM_PAGOS = ?, ";
        values.add(this.getPbeNumPagos());
        fields += " PBE_PAGOS_EFECT = ?, ";
        values.add(this.getPbePagosEfect());
        fields += " PBE_ANO_INI_PAGO = ?, ";
        values.add(this.getPbeAnoIniPago());
        fields += " PBE_MES_INI_PAGO = ?, ";
        values.add(this.getPbeMesIniPago());
        fields += " PBE_DIA_INI_PAGO = ?, ";
        values.add(this.getPbeDiaIniPago());
        fields += " PBE_ANO_FIN_PAGO = ?, ";
        values.add(this.getPbeAnoFinPago());
        fields += " PBE_MES_FIN_PAGO = ?, ";
        values.add(this.getPbeMesFinPago());
        fields += " PBE_DIA_FIN_PAGO = ?, ";
        values.add(this.getPbeDiaFinPago());
        fields += " PBE_ANO_PROX_PAGO = ?, ";
        values.add(this.getPbeAnoProxPago());
        fields += " PBE_MES_PROX_PAGO = ?, ";
        values.add(this.getPbeMesProxPago());
        fields += " PBE_DIA_PROX_PAGO = ?, ";
        values.add(this.getPbeDiaProxPago());
        fields += " PBE_VECES_SAL_MIN = ?, ";
        values.add(this.getPbeVecesSalMin());
        fields += " PBE_ANO_ALTA_REG = ?, ";
        values.add(this.getPbeAnoAltaReg());
        fields += " PBE_MES_ALTA_REG = ?, ";
        values.add(this.getPbeMesAltaReg());
        fields += " PBE_DIA_ALTA_REG = ?, ";
        values.add(this.getPbeDiaAltaReg());
        fields += " PBE_ANO_ULT_MOD = ?, ";
        values.add(this.getPbeAnoUltMod());
        fields += " PBE_MES_ULT_MOD = ?, ";
        values.add(this.getPbeMesUltMod());
        fields += " PBE_DIA_ULT_MOD = ?, ";
        values.add(this.getPbeDiaUltMod());
        fields += " PBE_CVE_ST_PARPABE = ?, ";
        values.add(this.getPbeCveStParpabe());
        fields += " PBE_SUB_CONTRATO = ?, ";
        values.add(this.getPbeSubContrato());
        fields += " PBE_SUB_PROGRAMA = ?, ";
        values.add(this.getPbeSubPrograma());
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
        String sql = "INSERT INTO PARPABENH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PBE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPbeNumContrato());

        fields += ", PBE_BENEFICIARIO";
        fieldValues += ", ?";
        values.add(this.getPbeBeneficiario());

        fields += ", PBE_PJE_CAPITAL";
        fieldValues += ", ?";
        values.add(this.getPbePjeCapital());

        fields += ", PBE_CVE_PER_CAP";
        fieldValues += ", ?";
        values.add(this.getPbeCvePerCap());

        fields += ", PBE_ANO_PAGO_CAP";
        fieldValues += ", ?";
        values.add(this.getPbeAnoPagoCap());

        fields += ", PBE_MES_PAGO_CAP";
        fieldValues += ", ?";
        values.add(this.getPbeMesPagoCap());

        fields += ", PBE_DIA_PAGO_CAP";
        fieldValues += ", ?";
        values.add(this.getPbeDiaPagoCap());

        fields += ", PBE_PJE_LIQ_RENDIM";
        fieldValues += ", ?";
        values.add(this.getPbePjeLiqRendim());

        fields += ", PBE_ANO_LIQ_RENDIM";
        fieldValues += ", ?";
        values.add(this.getPbeAnoLiqRendim());

        fields += ", PBE_MES_LIQ_RENDIM";
        fieldValues += ", ?";
        values.add(this.getPbeMesLiqRendim());

        fields += ", PBE_DIA_LIQ_RENDIM";
        fieldValues += ", ?";
        values.add(this.getPbeDiaLiqRendim());

        fields += ", PBE_IMP_FIJO_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeImpFijoPago());

        fields += ", PBE_CVE_PER_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeCvePerPago());

        fields += ", PBE_NUM_PAGOS";
        fieldValues += ", ?";
        values.add(this.getPbeNumPagos());

        fields += ", PBE_PAGOS_EFECT";
        fieldValues += ", ?";
        values.add(this.getPbePagosEfect());

        fields += ", PBE_ANO_INI_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeAnoIniPago());

        fields += ", PBE_MES_INI_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeMesIniPago());

        fields += ", PBE_DIA_INI_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeDiaIniPago());

        fields += ", PBE_ANO_FIN_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeAnoFinPago());

        fields += ", PBE_MES_FIN_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeMesFinPago());

        fields += ", PBE_DIA_FIN_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeDiaFinPago());

        fields += ", PBE_ANO_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeAnoProxPago());

        fields += ", PBE_MES_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeMesProxPago());

        fields += ", PBE_DIA_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbeDiaProxPago());

        fields += ", PBE_VECES_SAL_MIN";
        fieldValues += ", ?";
        values.add(this.getPbeVecesSalMin());

        fields += ", PBE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPbeAnoAltaReg());

        fields += ", PBE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPbeMesAltaReg());

        fields += ", PBE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPbeDiaAltaReg());

        fields += ", PBE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPbeAnoUltMod());

        fields += ", PBE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPbeMesUltMod());

        fields += ", PBE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPbeDiaUltMod());

        fields += ", PBE_CVE_ST_PARPABE";
        fieldValues += ", ?";
        values.add(this.getPbeCveStParpabe());

        fields += ", PBE_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPbeSubContrato());

        fields += ", PBE_SUB_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getPbeSubPrograma());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARPABENH WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PBE_NUM_CONTRATO = ?";
        values.add(this.getPbeNumContrato());
        conditions += " AND PBE_BENEFICIARIO = ?";
        values.add(this.getPbeBeneficiario());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Parpabenh instance = (Parpabenh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPbeNumContrato().equals(instance.getPbeNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPbeBeneficiario().equals(instance.getPbeBeneficiario()))
            equalObjects = false;
        if (equalObjects && !this.getPbePjeCapital().equals(instance.getPbePjeCapital()))
            equalObjects = false;
        if (equalObjects && !this.getPbeCvePerCap().equals(instance.getPbeCvePerCap()))
            equalObjects = false;
        if (equalObjects && !this.getPbeAnoPagoCap().equals(instance.getPbeAnoPagoCap()))
            equalObjects = false;
        if (equalObjects && !this.getPbeMesPagoCap().equals(instance.getPbeMesPagoCap()))
            equalObjects = false;
        if (equalObjects && !this.getPbeDiaPagoCap().equals(instance.getPbeDiaPagoCap()))
            equalObjects = false;
        if (equalObjects && !this.getPbePjeLiqRendim().equals(instance.getPbePjeLiqRendim()))
            equalObjects = false;
        if (equalObjects && !this.getPbeAnoLiqRendim().equals(instance.getPbeAnoLiqRendim()))
            equalObjects = false;
        if (equalObjects && !this.getPbeMesLiqRendim().equals(instance.getPbeMesLiqRendim()))
            equalObjects = false;
        if (equalObjects && !this.getPbeDiaLiqRendim().equals(instance.getPbeDiaLiqRendim()))
            equalObjects = false;
        if (equalObjects && !this.getPbeImpFijoPago().equals(instance.getPbeImpFijoPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeCvePerPago().equals(instance.getPbeCvePerPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeNumPagos().equals(instance.getPbeNumPagos()))
            equalObjects = false;
        if (equalObjects && !this.getPbePagosEfect().equals(instance.getPbePagosEfect()))
            equalObjects = false;
        if (equalObjects && !this.getPbeAnoIniPago().equals(instance.getPbeAnoIniPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeMesIniPago().equals(instance.getPbeMesIniPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeDiaIniPago().equals(instance.getPbeDiaIniPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeAnoFinPago().equals(instance.getPbeAnoFinPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeMesFinPago().equals(instance.getPbeMesFinPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeDiaFinPago().equals(instance.getPbeDiaFinPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeAnoProxPago().equals(instance.getPbeAnoProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeMesProxPago().equals(instance.getPbeMesProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeDiaProxPago().equals(instance.getPbeDiaProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbeVecesSalMin().equals(instance.getPbeVecesSalMin()))
            equalObjects = false;
        if (equalObjects && !this.getPbeAnoAltaReg().equals(instance.getPbeAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPbeMesAltaReg().equals(instance.getPbeMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPbeDiaAltaReg().equals(instance.getPbeDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPbeAnoUltMod().equals(instance.getPbeAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPbeMesUltMod().equals(instance.getPbeMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPbeDiaUltMod().equals(instance.getPbeDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPbeCveStParpabe().equals(instance.getPbeCveStParpabe()))
            equalObjects = false;
        if (equalObjects && !this.getPbeSubContrato().equals(instance.getPbeSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPbeSubPrograma().equals(instance.getPbeSubPrograma()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Parpabenh result = new Parpabenh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPbeNumContrato((BigDecimal) objectData.getData("PBE_NUM_CONTRATO"));
        result.setPbeBeneficiario((BigDecimal) objectData.getData("PBE_BENEFICIARIO"));
        result.setPbePjeCapital((BigDecimal) objectData.getData("PBE_PJE_CAPITAL"));
        result.setPbeCvePerCap((String) objectData.getData("PBE_CVE_PER_CAP"));
        result.setPbeAnoPagoCap((BigDecimal) objectData.getData("PBE_ANO_PAGO_CAP"));
        result.setPbeMesPagoCap((BigDecimal) objectData.getData("PBE_MES_PAGO_CAP"));
        result.setPbeDiaPagoCap((BigDecimal) objectData.getData("PBE_DIA_PAGO_CAP"));
        result.setPbePjeLiqRendim((BigDecimal) objectData.getData("PBE_PJE_LIQ_RENDIM"));
        result.setPbeAnoLiqRendim((BigDecimal) objectData.getData("PBE_ANO_LIQ_RENDIM"));
        result.setPbeMesLiqRendim((BigDecimal) objectData.getData("PBE_MES_LIQ_RENDIM"));
        result.setPbeDiaLiqRendim((BigDecimal) objectData.getData("PBE_DIA_LIQ_RENDIM"));
        result.setPbeImpFijoPago((BigDecimal) objectData.getData("PBE_IMP_FIJO_PAGO"));
        result.setPbeCvePerPago((String) objectData.getData("PBE_CVE_PER_PAGO"));
        result.setPbeNumPagos((BigDecimal) objectData.getData("PBE_NUM_PAGOS"));
        result.setPbePagosEfect((BigDecimal) objectData.getData("PBE_PAGOS_EFECT"));
        result.setPbeAnoIniPago((BigDecimal) objectData.getData("PBE_ANO_INI_PAGO"));
        result.setPbeMesIniPago((BigDecimal) objectData.getData("PBE_MES_INI_PAGO"));
        result.setPbeDiaIniPago((BigDecimal) objectData.getData("PBE_DIA_INI_PAGO"));
        result.setPbeAnoFinPago((BigDecimal) objectData.getData("PBE_ANO_FIN_PAGO"));
        result.setPbeMesFinPago((BigDecimal) objectData.getData("PBE_MES_FIN_PAGO"));
        result.setPbeDiaFinPago((BigDecimal) objectData.getData("PBE_DIA_FIN_PAGO"));
        result.setPbeAnoProxPago((BigDecimal) objectData.getData("PBE_ANO_PROX_PAGO"));
        result.setPbeMesProxPago((BigDecimal) objectData.getData("PBE_MES_PROX_PAGO"));
        result.setPbeDiaProxPago((BigDecimal) objectData.getData("PBE_DIA_PROX_PAGO"));
        result.setPbeVecesSalMin((BigDecimal) objectData.getData("PBE_VECES_SAL_MIN"));
        result.setPbeAnoAltaReg((BigDecimal) objectData.getData("PBE_ANO_ALTA_REG"));
        result.setPbeMesAltaReg((BigDecimal) objectData.getData("PBE_MES_ALTA_REG"));
        result.setPbeDiaAltaReg((BigDecimal) objectData.getData("PBE_DIA_ALTA_REG"));
        result.setPbeAnoUltMod((BigDecimal) objectData.getData("PBE_ANO_ULT_MOD"));
        result.setPbeMesUltMod((BigDecimal) objectData.getData("PBE_MES_ULT_MOD"));
        result.setPbeDiaUltMod((BigDecimal) objectData.getData("PBE_DIA_ULT_MOD"));
        result.setPbeCveStParpabe((String) objectData.getData("PBE_CVE_ST_PARPABE"));
        result.setPbeSubContrato((BigDecimal) objectData.getData("PBE_SUB_CONTRATO"));
        result.setPbeSubPrograma((BigDecimal) objectData.getData("PBE_SUB_PROGRAMA"));

        return result;

    }

}
