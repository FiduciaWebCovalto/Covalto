package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARPATEX_PK", columns = { "PTX_NUM_FOLIO_INST", "PTX_SUB_CONTRATO", "PTX_SUB_PROGRAMA", "PTX_BENEFICIARIO", "PTX_NUM_CONTRATO", "PTX_NUM_TERCERO" },
            sequences = { "MANUAL" })
public class Parpatex extends DomainObject {

    BigDecimal ptxNumContrato = null;
    BigDecimal ptxNumTercero = null;
    BigDecimal ptxNumFolioInst = null;
    BigDecimal ptxSubContrato = null;
    BigDecimal ptxSubPrograma = null;
    BigDecimal ptxBeneficiario = null;
    BigDecimal ptxImpFijoPago = null;
    String ptxCvePerioPago = null;
    BigDecimal ptxNumPagos = null;
    BigDecimal ptxPagosEfect = null;
    BigDecimal ptxAnoIniPagEx = null;
    BigDecimal ptxMesIniPagEx = null;
    BigDecimal ptxDiaIniPagEx = null;
    BigDecimal ptxAnoFinPagEx = null;
    BigDecimal ptxMesFinPagEx = null;
    BigDecimal ptxDiaFinPagEx = null;
    BigDecimal ptxAnoProxPago = null;
    BigDecimal ptxMesProxPago = null;
    BigDecimal ptxDiaProxPago = null;
    BigDecimal ptxVecesSalMin = null;
    BigDecimal ptxAnoAltaReg = null;
    BigDecimal ptxMesAltaReg = null;
    BigDecimal ptxDiaAltaReg = null;
    BigDecimal ptxAnoUltMod = null;
    BigDecimal ptxMesUltMod = null;
    BigDecimal ptxDiaUltMod = null;
    String ptxCveStParpate = null;

    public Parpatex() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPtxNumContrato(BigDecimal ptxNumContrato) {
        this.ptxNumContrato = ptxNumContrato;
    }

    public BigDecimal getPtxNumContrato() {
        return this.ptxNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPtxNumTercero(BigDecimal ptxNumTercero) {
        this.ptxNumTercero = ptxNumTercero;
    }

    public BigDecimal getPtxNumTercero() {
        return this.ptxNumTercero;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPtxNumFolioInst(BigDecimal ptxNumFolioInst) {
        this.ptxNumFolioInst = ptxNumFolioInst;
    }

    public BigDecimal getPtxNumFolioInst() {
        return this.ptxNumFolioInst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPtxSubContrato(BigDecimal ptxSubContrato) {
        this.ptxSubContrato = ptxSubContrato;
    }

    public BigDecimal getPtxSubContrato() {
        return this.ptxSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPtxSubPrograma(BigDecimal ptxSubPrograma) {
        this.ptxSubPrograma = ptxSubPrograma;
    }

    public BigDecimal getPtxSubPrograma() {
        return this.ptxSubPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPtxBeneficiario(BigDecimal ptxBeneficiario) {
        this.ptxBeneficiario = ptxBeneficiario;
    }

    public BigDecimal getPtxBeneficiario() {
        return this.ptxBeneficiario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPtxImpFijoPago(BigDecimal ptxImpFijoPago) {
        this.ptxImpFijoPago = ptxImpFijoPago;
    }

    public BigDecimal getPtxImpFijoPago() {
        return this.ptxImpFijoPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPtxCvePerioPago(String ptxCvePerioPago) {
        this.ptxCvePerioPago = ptxCvePerioPago;
    }

    public String getPtxCvePerioPago() {
        return this.ptxCvePerioPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPtxNumPagos(BigDecimal ptxNumPagos) {
        this.ptxNumPagos = ptxNumPagos;
    }

    public BigDecimal getPtxNumPagos() {
        return this.ptxNumPagos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPtxPagosEfect(BigDecimal ptxPagosEfect) {
        this.ptxPagosEfect = ptxPagosEfect;
    }

    public BigDecimal getPtxPagosEfect() {
        return this.ptxPagosEfect;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPtxAnoIniPagEx(BigDecimal ptxAnoIniPagEx) {
        this.ptxAnoIniPagEx = ptxAnoIniPagEx;
    }

    public BigDecimal getPtxAnoIniPagEx() {
        return this.ptxAnoIniPagEx;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtxMesIniPagEx(BigDecimal ptxMesIniPagEx) {
        this.ptxMesIniPagEx = ptxMesIniPagEx;
    }

    public BigDecimal getPtxMesIniPagEx() {
        return this.ptxMesIniPagEx;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtxDiaIniPagEx(BigDecimal ptxDiaIniPagEx) {
        this.ptxDiaIniPagEx = ptxDiaIniPagEx;
    }

    public BigDecimal getPtxDiaIniPagEx() {
        return this.ptxDiaIniPagEx;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPtxAnoFinPagEx(BigDecimal ptxAnoFinPagEx) {
        this.ptxAnoFinPagEx = ptxAnoFinPagEx;
    }

    public BigDecimal getPtxAnoFinPagEx() {
        return this.ptxAnoFinPagEx;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtxMesFinPagEx(BigDecimal ptxMesFinPagEx) {
        this.ptxMesFinPagEx = ptxMesFinPagEx;
    }

    public BigDecimal getPtxMesFinPagEx() {
        return this.ptxMesFinPagEx;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtxDiaFinPagEx(BigDecimal ptxDiaFinPagEx) {
        this.ptxDiaFinPagEx = ptxDiaFinPagEx;
    }

    public BigDecimal getPtxDiaFinPagEx() {
        return this.ptxDiaFinPagEx;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPtxAnoProxPago(BigDecimal ptxAnoProxPago) {
        this.ptxAnoProxPago = ptxAnoProxPago;
    }

    public BigDecimal getPtxAnoProxPago() {
        return this.ptxAnoProxPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtxMesProxPago(BigDecimal ptxMesProxPago) {
        this.ptxMesProxPago = ptxMesProxPago;
    }

    public BigDecimal getPtxMesProxPago() {
        return this.ptxMesProxPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtxDiaProxPago(BigDecimal ptxDiaProxPago) {
        this.ptxDiaProxPago = ptxDiaProxPago;
    }

    public BigDecimal getPtxDiaProxPago() {
        return this.ptxDiaProxPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPtxVecesSalMin(BigDecimal ptxVecesSalMin) {
        this.ptxVecesSalMin = ptxVecesSalMin;
    }

    public BigDecimal getPtxVecesSalMin() {
        return this.ptxVecesSalMin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPtxAnoAltaReg(BigDecimal ptxAnoAltaReg) {
        this.ptxAnoAltaReg = ptxAnoAltaReg;
    }

    public BigDecimal getPtxAnoAltaReg() {
        return this.ptxAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtxMesAltaReg(BigDecimal ptxMesAltaReg) {
        this.ptxMesAltaReg = ptxMesAltaReg;
    }

    public BigDecimal getPtxMesAltaReg() {
        return this.ptxMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtxDiaAltaReg(BigDecimal ptxDiaAltaReg) {
        this.ptxDiaAltaReg = ptxDiaAltaReg;
    }

    public BigDecimal getPtxDiaAltaReg() {
        return this.ptxDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPtxAnoUltMod(BigDecimal ptxAnoUltMod) {
        this.ptxAnoUltMod = ptxAnoUltMod;
    }

    public BigDecimal getPtxAnoUltMod() {
        return this.ptxAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtxMesUltMod(BigDecimal ptxMesUltMod) {
        this.ptxMesUltMod = ptxMesUltMod;
    }

    public BigDecimal getPtxMesUltMod() {
        return this.ptxMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPtxDiaUltMod(BigDecimal ptxDiaUltMod) {
        this.ptxDiaUltMod = ptxDiaUltMod;
    }

    public BigDecimal getPtxDiaUltMod() {
        return this.ptxDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPtxCveStParpate(String ptxCveStParpate) {
        this.ptxCveStParpate = ptxCveStParpate;
    }

    public String getPtxCveStParpate() {
        return this.ptxCveStParpate;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARPATEX ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPtxNumContrato() != null && this.getPtxNumContrato().longValue() == -999) {
            conditions += " AND PTX_NUM_CONTRATO IS NULL";
        } else if (this.getPtxNumContrato() != null) {
            conditions += " AND PTX_NUM_CONTRATO = ?";
            values.add(this.getPtxNumContrato());
        }

        if (this.getPtxNumTercero() != null && this.getPtxNumTercero().longValue() == -999) {
            conditions += " AND PTX_NUM_TERCERO IS NULL";
        } else if (this.getPtxNumTercero() != null) {
            conditions += " AND PTX_NUM_TERCERO = ?";
            values.add(this.getPtxNumTercero());
        }

        if (this.getPtxNumFolioInst() != null && this.getPtxNumFolioInst().longValue() == -999) {
            conditions += " AND PTX_NUM_FOLIO_INST IS NULL";
        } else if (this.getPtxNumFolioInst() != null) {
            conditions += " AND PTX_NUM_FOLIO_INST = ?";
            values.add(this.getPtxNumFolioInst());
        }

        if (this.getPtxSubContrato() != null && this.getPtxSubContrato().longValue() == -999) {
            conditions += " AND PTX_SUB_CONTRATO IS NULL";
        } else if (this.getPtxSubContrato() != null) {
            conditions += " AND PTX_SUB_CONTRATO = ?";
            values.add(this.getPtxSubContrato());
        }

        if (this.getPtxSubPrograma() != null && this.getPtxSubPrograma().longValue() == -999) {
            conditions += " AND PTX_SUB_PROGRAMA IS NULL";
        } else if (this.getPtxSubPrograma() != null) {
            conditions += " AND PTX_SUB_PROGRAMA = ?";
            values.add(this.getPtxSubPrograma());
        }

        if (this.getPtxBeneficiario() != null && this.getPtxBeneficiario().longValue() == -999) {
            conditions += " AND PTX_BENEFICIARIO IS NULL";
        } else if (this.getPtxBeneficiario() != null) {
            conditions += " AND PTX_BENEFICIARIO = ?";
            values.add(this.getPtxBeneficiario());
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
        String sql = "SELECT * FROM PARPATEX ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPtxNumContrato() != null && this.getPtxNumContrato().longValue() == -999) {
            conditions += " AND PTX_NUM_CONTRATO IS NULL";
        } else if (this.getPtxNumContrato() != null) {
            conditions += " AND PTX_NUM_CONTRATO = ?";
            values.add(this.getPtxNumContrato());
        }

        if (this.getPtxNumTercero() != null && this.getPtxNumTercero().longValue() == -999) {
            conditions += " AND PTX_NUM_TERCERO IS NULL";
        } else if (this.getPtxNumTercero() != null) {
            conditions += " AND PTX_NUM_TERCERO = ?";
            values.add(this.getPtxNumTercero());
        }

        if (this.getPtxNumFolioInst() != null && this.getPtxNumFolioInst().longValue() == -999) {
            conditions += " AND PTX_NUM_FOLIO_INST IS NULL";
        } else if (this.getPtxNumFolioInst() != null) {
            conditions += " AND PTX_NUM_FOLIO_INST = ?";
            values.add(this.getPtxNumFolioInst());
        }

        if (this.getPtxSubContrato() != null && this.getPtxSubContrato().longValue() == -999) {
            conditions += " AND PTX_SUB_CONTRATO IS NULL";
        } else if (this.getPtxSubContrato() != null) {
            conditions += " AND PTX_SUB_CONTRATO = ?";
            values.add(this.getPtxSubContrato());
        }

        if (this.getPtxSubPrograma() != null && this.getPtxSubPrograma().longValue() == -999) {
            conditions += " AND PTX_SUB_PROGRAMA IS NULL";
        } else if (this.getPtxSubPrograma() != null) {
            conditions += " AND PTX_SUB_PROGRAMA = ?";
            values.add(this.getPtxSubPrograma());
        }

        if (this.getPtxBeneficiario() != null && this.getPtxBeneficiario().longValue() == -999) {
            conditions += " AND PTX_BENEFICIARIO IS NULL";
        } else if (this.getPtxBeneficiario() != null) {
            conditions += " AND PTX_BENEFICIARIO = ?";
            values.add(this.getPtxBeneficiario());
        }

        if (this.getPtxImpFijoPago() != null && this.getPtxImpFijoPago().longValue() == -999) {
            conditions += " AND PTX_IMP_FIJO_PAGO IS NULL";
        } else if (this.getPtxImpFijoPago() != null) {
            conditions += " AND PTX_IMP_FIJO_PAGO = ?";
            values.add(this.getPtxImpFijoPago());
        }

        if (this.getPtxCvePerioPago() != null && "null".equals(this.getPtxCvePerioPago())) {
            conditions += " AND PTX_CVE_PERIO_PAGO IS NULL";
        } else if (this.getPtxCvePerioPago() != null) {
            conditions += " AND PTX_CVE_PERIO_PAGO = ?";
            values.add(this.getPtxCvePerioPago());
        }

        if (this.getPtxNumPagos() != null && this.getPtxNumPagos().longValue() == -999) {
            conditions += " AND PTX_NUM_PAGOS IS NULL";
        } else if (this.getPtxNumPagos() != null) {
            conditions += " AND PTX_NUM_PAGOS = ?";
            values.add(this.getPtxNumPagos());
        }

        if (this.getPtxPagosEfect() != null && this.getPtxPagosEfect().longValue() == -999) {
            conditions += " AND PTX_PAGOS_EFECT IS NULL";
        } else if (this.getPtxPagosEfect() != null) {
            conditions += " AND PTX_PAGOS_EFECT = ?";
            values.add(this.getPtxPagosEfect());
        }

        if (this.getPtxAnoIniPagEx() != null && this.getPtxAnoIniPagEx().longValue() == -999) {
            conditions += " AND PTX_ANO_INI_PAG_EX IS NULL";
        } else if (this.getPtxAnoIniPagEx() != null) {
            conditions += " AND PTX_ANO_INI_PAG_EX = ?";
            values.add(this.getPtxAnoIniPagEx());
        }

        if (this.getPtxMesIniPagEx() != null && this.getPtxMesIniPagEx().longValue() == -999) {
            conditions += " AND PTX_MES_INI_PAG_EX IS NULL";
        } else if (this.getPtxMesIniPagEx() != null) {
            conditions += " AND PTX_MES_INI_PAG_EX = ?";
            values.add(this.getPtxMesIniPagEx());
        }

        if (this.getPtxDiaIniPagEx() != null && this.getPtxDiaIniPagEx().longValue() == -999) {
            conditions += " AND PTX_DIA_INI_PAG_EX IS NULL";
        } else if (this.getPtxDiaIniPagEx() != null) {
            conditions += " AND PTX_DIA_INI_PAG_EX = ?";
            values.add(this.getPtxDiaIniPagEx());
        }

        if (this.getPtxAnoFinPagEx() != null && this.getPtxAnoFinPagEx().longValue() == -999) {
            conditions += " AND PTX_ANO_FIN_PAG_EX IS NULL";
        } else if (this.getPtxAnoFinPagEx() != null) {
            conditions += " AND PTX_ANO_FIN_PAG_EX = ?";
            values.add(this.getPtxAnoFinPagEx());
        }

        if (this.getPtxMesFinPagEx() != null && this.getPtxMesFinPagEx().longValue() == -999) {
            conditions += " AND PTX_MES_FIN_PAG_EX IS NULL";
        } else if (this.getPtxMesFinPagEx() != null) {
            conditions += " AND PTX_MES_FIN_PAG_EX = ?";
            values.add(this.getPtxMesFinPagEx());
        }

        if (this.getPtxDiaFinPagEx() != null && this.getPtxDiaFinPagEx().longValue() == -999) {
            conditions += " AND PTX_DIA_FIN_PAG_EX IS NULL";
        } else if (this.getPtxDiaFinPagEx() != null) {
            conditions += " AND PTX_DIA_FIN_PAG_EX = ?";
            values.add(this.getPtxDiaFinPagEx());
        }

        if (this.getPtxAnoProxPago() != null && this.getPtxAnoProxPago().longValue() == -999) {
            conditions += " AND PTX_ANO_PROX_PAGO IS NULL";
        } else if (this.getPtxAnoProxPago() != null) {
            conditions += " AND PTX_ANO_PROX_PAGO = ?";
            values.add(this.getPtxAnoProxPago());
        }

        if (this.getPtxMesProxPago() != null && this.getPtxMesProxPago().longValue() == -999) {
            conditions += " AND PTX_MES_PROX_PAGO IS NULL";
        } else if (this.getPtxMesProxPago() != null) {
            conditions += " AND PTX_MES_PROX_PAGO = ?";
            values.add(this.getPtxMesProxPago());
        }

        if (this.getPtxDiaProxPago() != null && this.getPtxDiaProxPago().longValue() == -999) {
            conditions += " AND PTX_DIA_PROX_PAGO IS NULL";
        } else if (this.getPtxDiaProxPago() != null) {
            conditions += " AND PTX_DIA_PROX_PAGO = ?";
            values.add(this.getPtxDiaProxPago());
        }

        if (this.getPtxVecesSalMin() != null && this.getPtxVecesSalMin().longValue() == -999) {
            conditions += " AND PTX_VECES_SAL_MIN IS NULL";
        } else if (this.getPtxVecesSalMin() != null) {
            conditions += " AND PTX_VECES_SAL_MIN = ?";
            values.add(this.getPtxVecesSalMin());
        }

        if (this.getPtxAnoAltaReg() != null && this.getPtxAnoAltaReg().longValue() == -999) {
            conditions += " AND PTX_ANO_ALTA_REG IS NULL";
        } else if (this.getPtxAnoAltaReg() != null) {
            conditions += " AND PTX_ANO_ALTA_REG = ?";
            values.add(this.getPtxAnoAltaReg());
        }

        if (this.getPtxMesAltaReg() != null && this.getPtxMesAltaReg().longValue() == -999) {
            conditions += " AND PTX_MES_ALTA_REG IS NULL";
        } else if (this.getPtxMesAltaReg() != null) {
            conditions += " AND PTX_MES_ALTA_REG = ?";
            values.add(this.getPtxMesAltaReg());
        }

        if (this.getPtxDiaAltaReg() != null && this.getPtxDiaAltaReg().longValue() == -999) {
            conditions += " AND PTX_DIA_ALTA_REG IS NULL";
        } else if (this.getPtxDiaAltaReg() != null) {
            conditions += " AND PTX_DIA_ALTA_REG = ?";
            values.add(this.getPtxDiaAltaReg());
        }

        if (this.getPtxAnoUltMod() != null && this.getPtxAnoUltMod().longValue() == -999) {
            conditions += " AND PTX_ANO_ULT_MOD IS NULL";
        } else if (this.getPtxAnoUltMod() != null) {
            conditions += " AND PTX_ANO_ULT_MOD = ?";
            values.add(this.getPtxAnoUltMod());
        }

        if (this.getPtxMesUltMod() != null && this.getPtxMesUltMod().longValue() == -999) {
            conditions += " AND PTX_MES_ULT_MOD IS NULL";
        } else if (this.getPtxMesUltMod() != null) {
            conditions += " AND PTX_MES_ULT_MOD = ?";
            values.add(this.getPtxMesUltMod());
        }

        if (this.getPtxDiaUltMod() != null && this.getPtxDiaUltMod().longValue() == -999) {
            conditions += " AND PTX_DIA_ULT_MOD IS NULL";
        } else if (this.getPtxDiaUltMod() != null) {
            conditions += " AND PTX_DIA_ULT_MOD = ?";
            values.add(this.getPtxDiaUltMod());
        }

        if (this.getPtxCveStParpate() != null && "null".equals(this.getPtxCveStParpate())) {
            conditions += " AND PTX_CVE_ST_PARPATE IS NULL";
        } else if (this.getPtxCveStParpate() != null) {
            conditions += " AND PTX_CVE_ST_PARPATE = ?";
            values.add(this.getPtxCveStParpate());
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
        String sql = "UPDATE PARPATEX SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PTX_NUM_CONTRATO = ?";
        pkValues.add(this.getPtxNumContrato());
        conditions += " AND PTX_NUM_TERCERO = ?";
        pkValues.add(this.getPtxNumTercero());
        conditions += " AND PTX_NUM_FOLIO_INST = ?";
        pkValues.add(this.getPtxNumFolioInst());
        conditions += " AND PTX_SUB_CONTRATO = ?";
        pkValues.add(this.getPtxSubContrato());
        conditions += " AND PTX_SUB_PROGRAMA = ?";
        pkValues.add(this.getPtxSubPrograma());
        conditions += " AND PTX_BENEFICIARIO = ?";
        pkValues.add(this.getPtxBeneficiario());
        fields += " PTX_IMP_FIJO_PAGO = ?, ";
        values.add(this.getPtxImpFijoPago());
        fields += " PTX_CVE_PERIO_PAGO = ?, ";
        values.add(this.getPtxCvePerioPago());
        fields += " PTX_NUM_PAGOS = ?, ";
        values.add(this.getPtxNumPagos());
        fields += " PTX_PAGOS_EFECT = ?, ";
        values.add(this.getPtxPagosEfect());
        fields += " PTX_ANO_INI_PAG_EX = ?, ";
        values.add(this.getPtxAnoIniPagEx());
        fields += " PTX_MES_INI_PAG_EX = ?, ";
        values.add(this.getPtxMesIniPagEx());
        fields += " PTX_DIA_INI_PAG_EX = ?, ";
        values.add(this.getPtxDiaIniPagEx());
        fields += " PTX_ANO_FIN_PAG_EX = ?, ";
        values.add(this.getPtxAnoFinPagEx());
        fields += " PTX_MES_FIN_PAG_EX = ?, ";
        values.add(this.getPtxMesFinPagEx());
        fields += " PTX_DIA_FIN_PAG_EX = ?, ";
        values.add(this.getPtxDiaFinPagEx());
        fields += " PTX_ANO_PROX_PAGO = ?, ";
        values.add(this.getPtxAnoProxPago());
        fields += " PTX_MES_PROX_PAGO = ?, ";
        values.add(this.getPtxMesProxPago());
        fields += " PTX_DIA_PROX_PAGO = ?, ";
        values.add(this.getPtxDiaProxPago());
        fields += " PTX_VECES_SAL_MIN = ?, ";
        values.add(this.getPtxVecesSalMin());
        fields += " PTX_ANO_ALTA_REG = ?, ";
        values.add(this.getPtxAnoAltaReg());
        fields += " PTX_MES_ALTA_REG = ?, ";
        values.add(this.getPtxMesAltaReg());
        fields += " PTX_DIA_ALTA_REG = ?, ";
        values.add(this.getPtxDiaAltaReg());
        fields += " PTX_ANO_ULT_MOD = ?, ";
        values.add(this.getPtxAnoUltMod());
        fields += " PTX_MES_ULT_MOD = ?, ";
        values.add(this.getPtxMesUltMod());
        fields += " PTX_DIA_ULT_MOD = ?, ";
        values.add(this.getPtxDiaUltMod());
        fields += " PTX_CVE_ST_PARPATE = ?, ";
        values.add(this.getPtxCveStParpate());
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
        String sql = "INSERT INTO PARPATEX ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PTX_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPtxNumContrato());

        fields += ", PTX_NUM_TERCERO";
        fieldValues += ", ?";
        values.add(this.getPtxNumTercero());

        fields += ", PTX_NUM_FOLIO_INST";
        fieldValues += ", ?";
        values.add(this.getPtxNumFolioInst());

        fields += ", PTX_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPtxSubContrato());

        fields += ", PTX_SUB_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getPtxSubPrograma());

        fields += ", PTX_BENEFICIARIO";
        fieldValues += ", ?";
        values.add(this.getPtxBeneficiario());

        fields += ", PTX_IMP_FIJO_PAGO";
        fieldValues += ", ?";
        values.add(this.getPtxImpFijoPago());

        fields += ", PTX_CVE_PERIO_PAGO";
        fieldValues += ", ?";
        values.add(this.getPtxCvePerioPago());

        fields += ", PTX_NUM_PAGOS";
        fieldValues += ", ?";
        values.add(this.getPtxNumPagos());

        fields += ", PTX_PAGOS_EFECT";
        fieldValues += ", ?";
        values.add(this.getPtxPagosEfect());

        fields += ", PTX_ANO_INI_PAG_EX";
        fieldValues += ", ?";
        values.add(this.getPtxAnoIniPagEx());

        fields += ", PTX_MES_INI_PAG_EX";
        fieldValues += ", ?";
        values.add(this.getPtxMesIniPagEx());

        fields += ", PTX_DIA_INI_PAG_EX";
        fieldValues += ", ?";
        values.add(this.getPtxDiaIniPagEx());

        fields += ", PTX_ANO_FIN_PAG_EX";
        fieldValues += ", ?";
        values.add(this.getPtxAnoFinPagEx());

        fields += ", PTX_MES_FIN_PAG_EX";
        fieldValues += ", ?";
        values.add(this.getPtxMesFinPagEx());

        fields += ", PTX_DIA_FIN_PAG_EX";
        fieldValues += ", ?";
        values.add(this.getPtxDiaFinPagEx());

        fields += ", PTX_ANO_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPtxAnoProxPago());

        fields += ", PTX_MES_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPtxMesProxPago());

        fields += ", PTX_DIA_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPtxDiaProxPago());

        fields += ", PTX_VECES_SAL_MIN";
        fieldValues += ", ?";
        values.add(this.getPtxVecesSalMin());

        fields += ", PTX_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPtxAnoAltaReg());

        fields += ", PTX_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPtxMesAltaReg());

        fields += ", PTX_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPtxDiaAltaReg());

        fields += ", PTX_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPtxAnoUltMod());

        fields += ", PTX_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPtxMesUltMod());

        fields += ", PTX_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPtxDiaUltMod());

        fields += ", PTX_CVE_ST_PARPATE";
        fieldValues += ", ?";
        values.add(this.getPtxCveStParpate());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARPATEX WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PTX_NUM_CONTRATO = ?";
        values.add(this.getPtxNumContrato());
        conditions += " AND PTX_NUM_TERCERO = ?";
        values.add(this.getPtxNumTercero());
        conditions += " AND PTX_NUM_FOLIO_INST = ?";
        values.add(this.getPtxNumFolioInst());
        conditions += " AND PTX_SUB_CONTRATO = ?";
        values.add(this.getPtxSubContrato());
        conditions += " AND PTX_SUB_PROGRAMA = ?";
        values.add(this.getPtxSubPrograma());
        conditions += " AND PTX_BENEFICIARIO = ?";
        values.add(this.getPtxBeneficiario());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Parpatex instance = (Parpatex) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPtxNumContrato().equals(instance.getPtxNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPtxNumTercero().equals(instance.getPtxNumTercero()))
            equalObjects = false;
        if (equalObjects && !this.getPtxNumFolioInst().equals(instance.getPtxNumFolioInst()))
            equalObjects = false;
        if (equalObjects && !this.getPtxSubContrato().equals(instance.getPtxSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPtxSubPrograma().equals(instance.getPtxSubPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getPtxBeneficiario().equals(instance.getPtxBeneficiario()))
            equalObjects = false;
        if (equalObjects && !this.getPtxImpFijoPago().equals(instance.getPtxImpFijoPago()))
            equalObjects = false;
        if (equalObjects && !this.getPtxCvePerioPago().equals(instance.getPtxCvePerioPago()))
            equalObjects = false;
        if (equalObjects && !this.getPtxNumPagos().equals(instance.getPtxNumPagos()))
            equalObjects = false;
        if (equalObjects && !this.getPtxPagosEfect().equals(instance.getPtxPagosEfect()))
            equalObjects = false;
        if (equalObjects && !this.getPtxAnoIniPagEx().equals(instance.getPtxAnoIniPagEx()))
            equalObjects = false;
        if (equalObjects && !this.getPtxMesIniPagEx().equals(instance.getPtxMesIniPagEx()))
            equalObjects = false;
        if (equalObjects && !this.getPtxDiaIniPagEx().equals(instance.getPtxDiaIniPagEx()))
            equalObjects = false;
        if (equalObjects && !this.getPtxAnoFinPagEx().equals(instance.getPtxAnoFinPagEx()))
            equalObjects = false;
        if (equalObjects && !this.getPtxMesFinPagEx().equals(instance.getPtxMesFinPagEx()))
            equalObjects = false;
        if (equalObjects && !this.getPtxDiaFinPagEx().equals(instance.getPtxDiaFinPagEx()))
            equalObjects = false;
        if (equalObjects && !this.getPtxAnoProxPago().equals(instance.getPtxAnoProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPtxMesProxPago().equals(instance.getPtxMesProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPtxDiaProxPago().equals(instance.getPtxDiaProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPtxVecesSalMin().equals(instance.getPtxVecesSalMin()))
            equalObjects = false;
        if (equalObjects && !this.getPtxAnoAltaReg().equals(instance.getPtxAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPtxMesAltaReg().equals(instance.getPtxMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPtxDiaAltaReg().equals(instance.getPtxDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPtxAnoUltMod().equals(instance.getPtxAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPtxMesUltMod().equals(instance.getPtxMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPtxDiaUltMod().equals(instance.getPtxDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPtxCveStParpate().equals(instance.getPtxCveStParpate()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Parpatex result = new Parpatex();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPtxNumContrato((BigDecimal) objectData.getData("PTX_NUM_CONTRATO"));
        result.setPtxNumTercero((BigDecimal) objectData.getData("PTX_NUM_TERCERO"));
        result.setPtxNumFolioInst((BigDecimal) objectData.getData("PTX_NUM_FOLIO_INST"));
        result.setPtxSubContrato((BigDecimal) objectData.getData("PTX_SUB_CONTRATO"));
        result.setPtxSubPrograma((BigDecimal) objectData.getData("PTX_SUB_PROGRAMA"));
        result.setPtxBeneficiario((BigDecimal) objectData.getData("PTX_BENEFICIARIO"));
        result.setPtxImpFijoPago((BigDecimal) objectData.getData("PTX_IMP_FIJO_PAGO"));
        result.setPtxCvePerioPago((String) objectData.getData("PTX_CVE_PERIO_PAGO"));
        result.setPtxNumPagos((BigDecimal) objectData.getData("PTX_NUM_PAGOS"));
        result.setPtxPagosEfect((BigDecimal) objectData.getData("PTX_PAGOS_EFECT"));
        result.setPtxAnoIniPagEx((BigDecimal) objectData.getData("PTX_ANO_INI_PAG_EX"));
        result.setPtxMesIniPagEx((BigDecimal) objectData.getData("PTX_MES_INI_PAG_EX"));
        result.setPtxDiaIniPagEx((BigDecimal) objectData.getData("PTX_DIA_INI_PAG_EX"));
        result.setPtxAnoFinPagEx((BigDecimal) objectData.getData("PTX_ANO_FIN_PAG_EX"));
        result.setPtxMesFinPagEx((BigDecimal) objectData.getData("PTX_MES_FIN_PAG_EX"));
        result.setPtxDiaFinPagEx((BigDecimal) objectData.getData("PTX_DIA_FIN_PAG_EX"));
        result.setPtxAnoProxPago((BigDecimal) objectData.getData("PTX_ANO_PROX_PAGO"));
        result.setPtxMesProxPago((BigDecimal) objectData.getData("PTX_MES_PROX_PAGO"));
        result.setPtxDiaProxPago((BigDecimal) objectData.getData("PTX_DIA_PROX_PAGO"));
        result.setPtxVecesSalMin((BigDecimal) objectData.getData("PTX_VECES_SAL_MIN"));
        result.setPtxAnoAltaReg((BigDecimal) objectData.getData("PTX_ANO_ALTA_REG"));
        result.setPtxMesAltaReg((BigDecimal) objectData.getData("PTX_MES_ALTA_REG"));
        result.setPtxDiaAltaReg((BigDecimal) objectData.getData("PTX_DIA_ALTA_REG"));
        result.setPtxAnoUltMod((BigDecimal) objectData.getData("PTX_ANO_ULT_MOD"));
        result.setPtxMesUltMod((BigDecimal) objectData.getData("PTX_MES_ULT_MOD"));
        result.setPtxDiaUltMod((BigDecimal) objectData.getData("PTX_DIA_ULT_MOD"));
        result.setPtxCveStParpate((String) objectData.getData("PTX_CVE_ST_PARPATE"));

        return result;

    }

}
