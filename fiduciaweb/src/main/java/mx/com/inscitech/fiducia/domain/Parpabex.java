package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARPABEX_PK", columns = { "PBX_NUM_FOLIO_INST", "PBX_SUB_CONTRATO", "PBX_SUB_PROGRAMA", "PBX_NUM_CONTRATO", "PBX_BENEFICIARIO" },
            sequences = { "MANUAL" })
public class Parpabex extends DomainObject {

    BigDecimal pbxNumContrato = null;
    BigDecimal pbxBeneficiario = null;
    BigDecimal pbxNumFolioInst = null;
    BigDecimal pbxSubContrato = null;
    BigDecimal pbxSubPrograma = null;
    BigDecimal pbxImpFijoPago = null;
    String pbxCvePerPago = null;
    BigDecimal pbxNumPagos = null;
    BigDecimal pbxPagosEfect = null;
    BigDecimal pbxAnoIniPago = null;
    BigDecimal pbxMesIniPago = null;
    BigDecimal pbxDiaIniPago = null;
    BigDecimal pbxAnoFinPago = null;
    BigDecimal pbxMesFinPago = null;
    BigDecimal pbxDiaFinPago = null;
    BigDecimal pbxAnoProxPago = null;
    BigDecimal pbxMesProxPago = null;
    BigDecimal pbxDiaProxPago = null;
    BigDecimal pbxVecesSalMin = null;
    BigDecimal pbxAnoAltaReg = null;
    BigDecimal pbxMesAltaReg = null;
    BigDecimal pbxDiaAltaReg = null;
    BigDecimal pbxAnoUltMod = null;
    BigDecimal pbxMesUltMod = null;
    BigDecimal pbxDiaUltMod = null;
    String pbxCveStParpabe = null;

    public Parpabex() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbxNumContrato(BigDecimal pbxNumContrato) {
        this.pbxNumContrato = pbxNumContrato;
    }

    public BigDecimal getPbxNumContrato() {
        return this.pbxNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbxBeneficiario(BigDecimal pbxBeneficiario) {
        this.pbxBeneficiario = pbxBeneficiario;
    }

    public BigDecimal getPbxBeneficiario() {
        return this.pbxBeneficiario;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbxNumFolioInst(BigDecimal pbxNumFolioInst) {
        this.pbxNumFolioInst = pbxNumFolioInst;
    }

    public BigDecimal getPbxNumFolioInst() {
        return this.pbxNumFolioInst;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbxSubContrato(BigDecimal pbxSubContrato) {
        this.pbxSubContrato = pbxSubContrato;
    }

    public BigDecimal getPbxSubContrato() {
        return this.pbxSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbxSubPrograma(BigDecimal pbxSubPrograma) {
        this.pbxSubPrograma = pbxSubPrograma;
    }

    public BigDecimal getPbxSubPrograma() {
        return this.pbxSubPrograma;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPbxImpFijoPago(BigDecimal pbxImpFijoPago) {
        this.pbxImpFijoPago = pbxImpFijoPago;
    }

    public BigDecimal getPbxImpFijoPago() {
        return this.pbxImpFijoPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPbxCvePerPago(String pbxCvePerPago) {
        this.pbxCvePerPago = pbxCvePerPago;
    }

    public String getPbxCvePerPago() {
        return this.pbxCvePerPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbxNumPagos(BigDecimal pbxNumPagos) {
        this.pbxNumPagos = pbxNumPagos;
    }

    public BigDecimal getPbxNumPagos() {
        return this.pbxNumPagos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPbxPagosEfect(BigDecimal pbxPagosEfect) {
        this.pbxPagosEfect = pbxPagosEfect;
    }

    public BigDecimal getPbxPagosEfect() {
        return this.pbxPagosEfect;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbxAnoIniPago(BigDecimal pbxAnoIniPago) {
        this.pbxAnoIniPago = pbxAnoIniPago;
    }

    public BigDecimal getPbxAnoIniPago() {
        return this.pbxAnoIniPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbxMesIniPago(BigDecimal pbxMesIniPago) {
        this.pbxMesIniPago = pbxMesIniPago;
    }

    public BigDecimal getPbxMesIniPago() {
        return this.pbxMesIniPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbxDiaIniPago(BigDecimal pbxDiaIniPago) {
        this.pbxDiaIniPago = pbxDiaIniPago;
    }

    public BigDecimal getPbxDiaIniPago() {
        return this.pbxDiaIniPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbxAnoFinPago(BigDecimal pbxAnoFinPago) {
        this.pbxAnoFinPago = pbxAnoFinPago;
    }

    public BigDecimal getPbxAnoFinPago() {
        return this.pbxAnoFinPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbxMesFinPago(BigDecimal pbxMesFinPago) {
        this.pbxMesFinPago = pbxMesFinPago;
    }

    public BigDecimal getPbxMesFinPago() {
        return this.pbxMesFinPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbxDiaFinPago(BigDecimal pbxDiaFinPago) {
        this.pbxDiaFinPago = pbxDiaFinPago;
    }

    public BigDecimal getPbxDiaFinPago() {
        return this.pbxDiaFinPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbxAnoProxPago(BigDecimal pbxAnoProxPago) {
        this.pbxAnoProxPago = pbxAnoProxPago;
    }

    public BigDecimal getPbxAnoProxPago() {
        return this.pbxAnoProxPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbxMesProxPago(BigDecimal pbxMesProxPago) {
        this.pbxMesProxPago = pbxMesProxPago;
    }

    public BigDecimal getPbxMesProxPago() {
        return this.pbxMesProxPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbxDiaProxPago(BigDecimal pbxDiaProxPago) {
        this.pbxDiaProxPago = pbxDiaProxPago;
    }

    public BigDecimal getPbxDiaProxPago() {
        return this.pbxDiaProxPago;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPbxVecesSalMin(BigDecimal pbxVecesSalMin) {
        this.pbxVecesSalMin = pbxVecesSalMin;
    }

    public BigDecimal getPbxVecesSalMin() {
        return this.pbxVecesSalMin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbxAnoAltaReg(BigDecimal pbxAnoAltaReg) {
        this.pbxAnoAltaReg = pbxAnoAltaReg;
    }

    public BigDecimal getPbxAnoAltaReg() {
        return this.pbxAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbxMesAltaReg(BigDecimal pbxMesAltaReg) {
        this.pbxMesAltaReg = pbxMesAltaReg;
    }

    public BigDecimal getPbxMesAltaReg() {
        return this.pbxMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbxDiaAltaReg(BigDecimal pbxDiaAltaReg) {
        this.pbxDiaAltaReg = pbxDiaAltaReg;
    }

    public BigDecimal getPbxDiaAltaReg() {
        return this.pbxDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPbxAnoUltMod(BigDecimal pbxAnoUltMod) {
        this.pbxAnoUltMod = pbxAnoUltMod;
    }

    public BigDecimal getPbxAnoUltMod() {
        return this.pbxAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbxMesUltMod(BigDecimal pbxMesUltMod) {
        this.pbxMesUltMod = pbxMesUltMod;
    }

    public BigDecimal getPbxMesUltMod() {
        return this.pbxMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPbxDiaUltMod(BigDecimal pbxDiaUltMod) {
        this.pbxDiaUltMod = pbxDiaUltMod;
    }

    public BigDecimal getPbxDiaUltMod() {
        return this.pbxDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPbxCveStParpabe(String pbxCveStParpabe) {
        this.pbxCveStParpabe = pbxCveStParpabe;
    }

    public String getPbxCveStParpabe() {
        return this.pbxCveStParpabe;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARPABEX ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPbxNumContrato() != null && this.getPbxNumContrato().longValue() == -999) {
            conditions += " AND PBX_NUM_CONTRATO IS NULL";
        } else if (this.getPbxNumContrato() != null) {
            conditions += " AND PBX_NUM_CONTRATO = ?";
            values.add(this.getPbxNumContrato());
        }

        if (this.getPbxBeneficiario() != null && this.getPbxBeneficiario().longValue() == -999) {
            conditions += " AND PBX_BENEFICIARIO IS NULL";
        } else if (this.getPbxBeneficiario() != null) {
            conditions += " AND PBX_BENEFICIARIO = ?";
            values.add(this.getPbxBeneficiario());
        }

        if (this.getPbxNumFolioInst() != null && this.getPbxNumFolioInst().longValue() == -999) {
            conditions += " AND PBX_NUM_FOLIO_INST IS NULL";
        } else if (this.getPbxNumFolioInst() != null) {
            conditions += " AND PBX_NUM_FOLIO_INST = ?";
            values.add(this.getPbxNumFolioInst());
        }

        if (this.getPbxSubContrato() != null && this.getPbxSubContrato().longValue() == -999) {
            conditions += " AND PBX_SUB_CONTRATO IS NULL";
        } else if (this.getPbxSubContrato() != null) {
            conditions += " AND PBX_SUB_CONTRATO = ?";
            values.add(this.getPbxSubContrato());
        }

        if (this.getPbxSubPrograma() != null && this.getPbxSubPrograma().longValue() == -999) {
            conditions += " AND PBX_SUB_PROGRAMA IS NULL";
        } else if (this.getPbxSubPrograma() != null) {
            conditions += " AND PBX_SUB_PROGRAMA = ?";
            values.add(this.getPbxSubPrograma());
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
        String sql = "SELECT * FROM PARPABEX ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPbxNumContrato() != null && this.getPbxNumContrato().longValue() == -999) {
            conditions += " AND PBX_NUM_CONTRATO IS NULL";
        } else if (this.getPbxNumContrato() != null) {
            conditions += " AND PBX_NUM_CONTRATO = ?";
            values.add(this.getPbxNumContrato());
        }

        if (this.getPbxBeneficiario() != null && this.getPbxBeneficiario().longValue() == -999) {
            conditions += " AND PBX_BENEFICIARIO IS NULL";
        } else if (this.getPbxBeneficiario() != null) {
            conditions += " AND PBX_BENEFICIARIO = ?";
            values.add(this.getPbxBeneficiario());
        }

        if (this.getPbxNumFolioInst() != null && this.getPbxNumFolioInst().longValue() == -999) {
            conditions += " AND PBX_NUM_FOLIO_INST IS NULL";
        } else if (this.getPbxNumFolioInst() != null) {
            conditions += " AND PBX_NUM_FOLIO_INST = ?";
            values.add(this.getPbxNumFolioInst());
        }

        if (this.getPbxSubContrato() != null && this.getPbxSubContrato().longValue() == -999) {
            conditions += " AND PBX_SUB_CONTRATO IS NULL";
        } else if (this.getPbxSubContrato() != null) {
            conditions += " AND PBX_SUB_CONTRATO = ?";
            values.add(this.getPbxSubContrato());
        }

        if (this.getPbxSubPrograma() != null && this.getPbxSubPrograma().longValue() == -999) {
            conditions += " AND PBX_SUB_PROGRAMA IS NULL";
        } else if (this.getPbxSubPrograma() != null) {
            conditions += " AND PBX_SUB_PROGRAMA = ?";
            values.add(this.getPbxSubPrograma());
        }

        if (this.getPbxImpFijoPago() != null && this.getPbxImpFijoPago().longValue() == -999) {
            conditions += " AND PBX_IMP_FIJO_PAGO IS NULL";
        } else if (this.getPbxImpFijoPago() != null) {
            conditions += " AND PBX_IMP_FIJO_PAGO = ?";
            values.add(this.getPbxImpFijoPago());
        }

        if (this.getPbxCvePerPago() != null && "null".equals(this.getPbxCvePerPago())) {
            conditions += " AND PBX_CVE_PER_PAGO IS NULL";
        } else if (this.getPbxCvePerPago() != null) {
            conditions += " AND PBX_CVE_PER_PAGO = ?";
            values.add(this.getPbxCvePerPago());
        }

        if (this.getPbxNumPagos() != null && this.getPbxNumPagos().longValue() == -999) {
            conditions += " AND PBX_NUM_PAGOS IS NULL";
        } else if (this.getPbxNumPagos() != null) {
            conditions += " AND PBX_NUM_PAGOS = ?";
            values.add(this.getPbxNumPagos());
        }

        if (this.getPbxPagosEfect() != null && this.getPbxPagosEfect().longValue() == -999) {
            conditions += " AND PBX_PAGOS_EFECT IS NULL";
        } else if (this.getPbxPagosEfect() != null) {
            conditions += " AND PBX_PAGOS_EFECT = ?";
            values.add(this.getPbxPagosEfect());
        }

        if (this.getPbxAnoIniPago() != null && this.getPbxAnoIniPago().longValue() == -999) {
            conditions += " AND PBX_ANO_INI_PAGO IS NULL";
        } else if (this.getPbxAnoIniPago() != null) {
            conditions += " AND PBX_ANO_INI_PAGO = ?";
            values.add(this.getPbxAnoIniPago());
        }

        if (this.getPbxMesIniPago() != null && this.getPbxMesIniPago().longValue() == -999) {
            conditions += " AND PBX_MES_INI_PAGO IS NULL";
        } else if (this.getPbxMesIniPago() != null) {
            conditions += " AND PBX_MES_INI_PAGO = ?";
            values.add(this.getPbxMesIniPago());
        }

        if (this.getPbxDiaIniPago() != null && this.getPbxDiaIniPago().longValue() == -999) {
            conditions += " AND PBX_DIA_INI_PAGO IS NULL";
        } else if (this.getPbxDiaIniPago() != null) {
            conditions += " AND PBX_DIA_INI_PAGO = ?";
            values.add(this.getPbxDiaIniPago());
        }

        if (this.getPbxAnoFinPago() != null && this.getPbxAnoFinPago().longValue() == -999) {
            conditions += " AND PBX_ANO_FIN_PAGO IS NULL";
        } else if (this.getPbxAnoFinPago() != null) {
            conditions += " AND PBX_ANO_FIN_PAGO = ?";
            values.add(this.getPbxAnoFinPago());
        }

        if (this.getPbxMesFinPago() != null && this.getPbxMesFinPago().longValue() == -999) {
            conditions += " AND PBX_MES_FIN_PAGO IS NULL";
        } else if (this.getPbxMesFinPago() != null) {
            conditions += " AND PBX_MES_FIN_PAGO = ?";
            values.add(this.getPbxMesFinPago());
        }

        if (this.getPbxDiaFinPago() != null && this.getPbxDiaFinPago().longValue() == -999) {
            conditions += " AND PBX_DIA_FIN_PAGO IS NULL";
        } else if (this.getPbxDiaFinPago() != null) {
            conditions += " AND PBX_DIA_FIN_PAGO = ?";
            values.add(this.getPbxDiaFinPago());
        }

        if (this.getPbxAnoProxPago() != null && this.getPbxAnoProxPago().longValue() == -999) {
            conditions += " AND PBX_ANO_PROX_PAGO IS NULL";
        } else if (this.getPbxAnoProxPago() != null) {
            conditions += " AND PBX_ANO_PROX_PAGO = ?";
            values.add(this.getPbxAnoProxPago());
        }

        if (this.getPbxMesProxPago() != null && this.getPbxMesProxPago().longValue() == -999) {
            conditions += " AND PBX_MES_PROX_PAGO IS NULL";
        } else if (this.getPbxMesProxPago() != null) {
            conditions += " AND PBX_MES_PROX_PAGO = ?";
            values.add(this.getPbxMesProxPago());
        }

        if (this.getPbxDiaProxPago() != null && this.getPbxDiaProxPago().longValue() == -999) {
            conditions += " AND PBX_DIA_PROX_PAGO IS NULL";
        } else if (this.getPbxDiaProxPago() != null) {
            conditions += " AND PBX_DIA_PROX_PAGO = ?";
            values.add(this.getPbxDiaProxPago());
        }

        if (this.getPbxVecesSalMin() != null && this.getPbxVecesSalMin().longValue() == -999) {
            conditions += " AND PBX_VECES_SAL_MIN IS NULL";
        } else if (this.getPbxVecesSalMin() != null) {
            conditions += " AND PBX_VECES_SAL_MIN = ?";
            values.add(this.getPbxVecesSalMin());
        }

        if (this.getPbxAnoAltaReg() != null && this.getPbxAnoAltaReg().longValue() == -999) {
            conditions += " AND PBX_ANO_ALTA_REG IS NULL";
        } else if (this.getPbxAnoAltaReg() != null) {
            conditions += " AND PBX_ANO_ALTA_REG = ?";
            values.add(this.getPbxAnoAltaReg());
        }

        if (this.getPbxMesAltaReg() != null && this.getPbxMesAltaReg().longValue() == -999) {
            conditions += " AND PBX_MES_ALTA_REG IS NULL";
        } else if (this.getPbxMesAltaReg() != null) {
            conditions += " AND PBX_MES_ALTA_REG = ?";
            values.add(this.getPbxMesAltaReg());
        }

        if (this.getPbxDiaAltaReg() != null && this.getPbxDiaAltaReg().longValue() == -999) {
            conditions += " AND PBX_DIA_ALTA_REG IS NULL";
        } else if (this.getPbxDiaAltaReg() != null) {
            conditions += " AND PBX_DIA_ALTA_REG = ?";
            values.add(this.getPbxDiaAltaReg());
        }

        if (this.getPbxAnoUltMod() != null && this.getPbxAnoUltMod().longValue() == -999) {
            conditions += " AND PBX_ANO_ULT_MOD IS NULL";
        } else if (this.getPbxAnoUltMod() != null) {
            conditions += " AND PBX_ANO_ULT_MOD = ?";
            values.add(this.getPbxAnoUltMod());
        }

        if (this.getPbxMesUltMod() != null && this.getPbxMesUltMod().longValue() == -999) {
            conditions += " AND PBX_MES_ULT_MOD IS NULL";
        } else if (this.getPbxMesUltMod() != null) {
            conditions += " AND PBX_MES_ULT_MOD = ?";
            values.add(this.getPbxMesUltMod());
        }

        if (this.getPbxDiaUltMod() != null && this.getPbxDiaUltMod().longValue() == -999) {
            conditions += " AND PBX_DIA_ULT_MOD IS NULL";
        } else if (this.getPbxDiaUltMod() != null) {
            conditions += " AND PBX_DIA_ULT_MOD = ?";
            values.add(this.getPbxDiaUltMod());
        }

        if (this.getPbxCveStParpabe() != null && "null".equals(this.getPbxCveStParpabe())) {
            conditions += " AND PBX_CVE_ST_PARPABE IS NULL";
        } else if (this.getPbxCveStParpabe() != null) {
            conditions += " AND PBX_CVE_ST_PARPABE = ?";
            values.add(this.getPbxCveStParpabe());
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
        String sql = "UPDATE PARPABEX SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PBX_NUM_CONTRATO = ?";
        pkValues.add(this.getPbxNumContrato());
        conditions += " AND PBX_BENEFICIARIO = ?";
        pkValues.add(this.getPbxBeneficiario());
        conditions += " AND PBX_NUM_FOLIO_INST = ?";
        pkValues.add(this.getPbxNumFolioInst());
        conditions += " AND PBX_SUB_CONTRATO = ?";
        pkValues.add(this.getPbxSubContrato());
        conditions += " AND PBX_SUB_PROGRAMA = ?";
        pkValues.add(this.getPbxSubPrograma());
        fields += " PBX_IMP_FIJO_PAGO = ?, ";
        values.add(this.getPbxImpFijoPago());
        fields += " PBX_CVE_PER_PAGO = ?, ";
        values.add(this.getPbxCvePerPago());
        fields += " PBX_NUM_PAGOS = ?, ";
        values.add(this.getPbxNumPagos());
        fields += " PBX_PAGOS_EFECT = ?, ";
        values.add(this.getPbxPagosEfect());
        fields += " PBX_ANO_INI_PAGO = ?, ";
        values.add(this.getPbxAnoIniPago());
        fields += " PBX_MES_INI_PAGO = ?, ";
        values.add(this.getPbxMesIniPago());
        fields += " PBX_DIA_INI_PAGO = ?, ";
        values.add(this.getPbxDiaIniPago());
        fields += " PBX_ANO_FIN_PAGO = ?, ";
        values.add(this.getPbxAnoFinPago());
        fields += " PBX_MES_FIN_PAGO = ?, ";
        values.add(this.getPbxMesFinPago());
        fields += " PBX_DIA_FIN_PAGO = ?, ";
        values.add(this.getPbxDiaFinPago());
        fields += " PBX_ANO_PROX_PAGO = ?, ";
        values.add(this.getPbxAnoProxPago());
        fields += " PBX_MES_PROX_PAGO = ?, ";
        values.add(this.getPbxMesProxPago());
        fields += " PBX_DIA_PROX_PAGO = ?, ";
        values.add(this.getPbxDiaProxPago());
        fields += " PBX_VECES_SAL_MIN = ?, ";
        values.add(this.getPbxVecesSalMin());
        fields += " PBX_ANO_ALTA_REG = ?, ";
        values.add(this.getPbxAnoAltaReg());
        fields += " PBX_MES_ALTA_REG = ?, ";
        values.add(this.getPbxMesAltaReg());
        fields += " PBX_DIA_ALTA_REG = ?, ";
        values.add(this.getPbxDiaAltaReg());
        fields += " PBX_ANO_ULT_MOD = ?, ";
        values.add(this.getPbxAnoUltMod());
        fields += " PBX_MES_ULT_MOD = ?, ";
        values.add(this.getPbxMesUltMod());
        fields += " PBX_DIA_ULT_MOD = ?, ";
        values.add(this.getPbxDiaUltMod());
        fields += " PBX_CVE_ST_PARPABE = ?, ";
        values.add(this.getPbxCveStParpabe());
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
        String sql = "INSERT INTO PARPABEX ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PBX_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPbxNumContrato());

        fields += ", PBX_BENEFICIARIO";
        fieldValues += ", ?";
        values.add(this.getPbxBeneficiario());

        fields += ", PBX_NUM_FOLIO_INST";
        fieldValues += ", ?";
        values.add(this.getPbxNumFolioInst());

        fields += ", PBX_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPbxSubContrato());

        fields += ", PBX_SUB_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getPbxSubPrograma());

        fields += ", PBX_IMP_FIJO_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxImpFijoPago());

        fields += ", PBX_CVE_PER_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxCvePerPago());

        fields += ", PBX_NUM_PAGOS";
        fieldValues += ", ?";
        values.add(this.getPbxNumPagos());

        fields += ", PBX_PAGOS_EFECT";
        fieldValues += ", ?";
        values.add(this.getPbxPagosEfect());

        fields += ", PBX_ANO_INI_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxAnoIniPago());

        fields += ", PBX_MES_INI_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxMesIniPago());

        fields += ", PBX_DIA_INI_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxDiaIniPago());

        fields += ", PBX_ANO_FIN_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxAnoFinPago());

        fields += ", PBX_MES_FIN_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxMesFinPago());

        fields += ", PBX_DIA_FIN_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxDiaFinPago());

        fields += ", PBX_ANO_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxAnoProxPago());

        fields += ", PBX_MES_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxMesProxPago());

        fields += ", PBX_DIA_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPbxDiaProxPago());

        fields += ", PBX_VECES_SAL_MIN";
        fieldValues += ", ?";
        values.add(this.getPbxVecesSalMin());

        fields += ", PBX_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPbxAnoAltaReg());

        fields += ", PBX_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPbxMesAltaReg());

        fields += ", PBX_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPbxDiaAltaReg());

        fields += ", PBX_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPbxAnoUltMod());

        fields += ", PBX_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPbxMesUltMod());

        fields += ", PBX_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPbxDiaUltMod());

        fields += ", PBX_CVE_ST_PARPABE";
        fieldValues += ", ?";
        values.add(this.getPbxCveStParpabe());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARPABEX WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PBX_NUM_CONTRATO = ?";
        values.add(this.getPbxNumContrato());
        conditions += " AND PBX_BENEFICIARIO = ?";
        values.add(this.getPbxBeneficiario());
        conditions += " AND PBX_NUM_FOLIO_INST = ?";
        values.add(this.getPbxNumFolioInst());
        conditions += " AND PBX_SUB_CONTRATO = ?";
        values.add(this.getPbxSubContrato());
        conditions += " AND PBX_SUB_PROGRAMA = ?";
        values.add(this.getPbxSubPrograma());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Parpabex instance = (Parpabex) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPbxNumContrato().equals(instance.getPbxNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPbxBeneficiario().equals(instance.getPbxBeneficiario()))
            equalObjects = false;
        if (equalObjects && !this.getPbxNumFolioInst().equals(instance.getPbxNumFolioInst()))
            equalObjects = false;
        if (equalObjects && !this.getPbxSubContrato().equals(instance.getPbxSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPbxSubPrograma().equals(instance.getPbxSubPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getPbxImpFijoPago().equals(instance.getPbxImpFijoPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxCvePerPago().equals(instance.getPbxCvePerPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxNumPagos().equals(instance.getPbxNumPagos()))
            equalObjects = false;
        if (equalObjects && !this.getPbxPagosEfect().equals(instance.getPbxPagosEfect()))
            equalObjects = false;
        if (equalObjects && !this.getPbxAnoIniPago().equals(instance.getPbxAnoIniPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxMesIniPago().equals(instance.getPbxMesIniPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxDiaIniPago().equals(instance.getPbxDiaIniPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxAnoFinPago().equals(instance.getPbxAnoFinPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxMesFinPago().equals(instance.getPbxMesFinPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxDiaFinPago().equals(instance.getPbxDiaFinPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxAnoProxPago().equals(instance.getPbxAnoProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxMesProxPago().equals(instance.getPbxMesProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxDiaProxPago().equals(instance.getPbxDiaProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPbxVecesSalMin().equals(instance.getPbxVecesSalMin()))
            equalObjects = false;
        if (equalObjects && !this.getPbxAnoAltaReg().equals(instance.getPbxAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPbxMesAltaReg().equals(instance.getPbxMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPbxDiaAltaReg().equals(instance.getPbxDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPbxAnoUltMod().equals(instance.getPbxAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPbxMesUltMod().equals(instance.getPbxMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPbxDiaUltMod().equals(instance.getPbxDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPbxCveStParpabe().equals(instance.getPbxCveStParpabe()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Parpabex result = new Parpabex();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPbxNumContrato((BigDecimal) objectData.getData("PBX_NUM_CONTRATO"));
        result.setPbxBeneficiario((BigDecimal) objectData.getData("PBX_BENEFICIARIO"));
        result.setPbxNumFolioInst((BigDecimal) objectData.getData("PBX_NUM_FOLIO_INST"));
        result.setPbxSubContrato((BigDecimal) objectData.getData("PBX_SUB_CONTRATO"));
        result.setPbxSubPrograma((BigDecimal) objectData.getData("PBX_SUB_PROGRAMA"));
        result.setPbxImpFijoPago((BigDecimal) objectData.getData("PBX_IMP_FIJO_PAGO"));
        result.setPbxCvePerPago((String) objectData.getData("PBX_CVE_PER_PAGO"));
        result.setPbxNumPagos((BigDecimal) objectData.getData("PBX_NUM_PAGOS"));
        result.setPbxPagosEfect((BigDecimal) objectData.getData("PBX_PAGOS_EFECT"));
        result.setPbxAnoIniPago((BigDecimal) objectData.getData("PBX_ANO_INI_PAGO"));
        result.setPbxMesIniPago((BigDecimal) objectData.getData("PBX_MES_INI_PAGO"));
        result.setPbxDiaIniPago((BigDecimal) objectData.getData("PBX_DIA_INI_PAGO"));
        result.setPbxAnoFinPago((BigDecimal) objectData.getData("PBX_ANO_FIN_PAGO"));
        result.setPbxMesFinPago((BigDecimal) objectData.getData("PBX_MES_FIN_PAGO"));
        result.setPbxDiaFinPago((BigDecimal) objectData.getData("PBX_DIA_FIN_PAGO"));
        result.setPbxAnoProxPago((BigDecimal) objectData.getData("PBX_ANO_PROX_PAGO"));
        result.setPbxMesProxPago((BigDecimal) objectData.getData("PBX_MES_PROX_PAGO"));
        result.setPbxDiaProxPago((BigDecimal) objectData.getData("PBX_DIA_PROX_PAGO"));
        result.setPbxVecesSalMin((BigDecimal) objectData.getData("PBX_VECES_SAL_MIN"));
        result.setPbxAnoAltaReg((BigDecimal) objectData.getData("PBX_ANO_ALTA_REG"));
        result.setPbxMesAltaReg((BigDecimal) objectData.getData("PBX_MES_ALTA_REG"));
        result.setPbxDiaAltaReg((BigDecimal) objectData.getData("PBX_DIA_ALTA_REG"));
        result.setPbxAnoUltMod((BigDecimal) objectData.getData("PBX_ANO_ULT_MOD"));
        result.setPbxMesUltMod((BigDecimal) objectData.getData("PBX_MES_ULT_MOD"));
        result.setPbxDiaUltMod((BigDecimal) objectData.getData("PBX_DIA_ULT_MOD"));
        result.setPbxCveStParpabe((String) objectData.getData("PBX_CVE_ST_PARPABE"));

        return result;

    }

}
