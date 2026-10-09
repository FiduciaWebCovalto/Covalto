package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PARPATER_PK", columns = { "PTE_NUM_TERCERO", "PTE_NUM_CONTRATO" }, sequences = { "MANUAL" })
public class Parpater extends DomainObject {

    BigDecimal pteNumContrato = null;
    BigDecimal pteNumTercero = null;
    BigDecimal pteImpFijoPago = null;
    String pteCvePerPago = null;
    BigDecimal pteNumPagos = null;
    BigDecimal ptePagosEfect = null;
    BigDecimal pteAnoIniPago = null;
    BigDecimal pteMesIniPago = null;
    BigDecimal pteDiaIniPago = null;
    BigDecimal pteAnoFinPago = null;
    BigDecimal pteMesFinPago = null;
    BigDecimal pteDiaFinPago = null;
    BigDecimal pteAnoProxPago = null;
    BigDecimal pteMesProxPago = null;
    BigDecimal pteDiaProxPago = null;
    BigDecimal pteAnoAltaReg = null;
    BigDecimal pteMesAltaReg = null;
    BigDecimal pteDiaAltaReg = null;
    BigDecimal pteAnoUltMod = null;
    BigDecimal pteMesUltMod = null;
    BigDecimal pteDiaUltMod = null;
    String pteCveStParpate = null;
    BigDecimal pteSubContrato = null;
    BigDecimal pteSubPrograma = null;

    public Parpater() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPteNumContrato(BigDecimal pteNumContrato) {
        this.pteNumContrato = pteNumContrato;
    }

    public BigDecimal getPteNumContrato() {
        return this.pteNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPteNumTercero(BigDecimal pteNumTercero) {
        this.pteNumTercero = pteNumTercero;
    }

    public BigDecimal getPteNumTercero() {
        return this.pteNumTercero;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setPteImpFijoPago(BigDecimal pteImpFijoPago) {
        this.pteImpFijoPago = pteImpFijoPago;
    }

    public BigDecimal getPteImpFijoPago() {
        return this.pteImpFijoPago;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPteCvePerPago(String pteCvePerPago) {
        this.pteCvePerPago = pteCvePerPago;
    }

    public String getPteCvePerPago() {
        return this.pteCvePerPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPteNumPagos(BigDecimal pteNumPagos) {
        this.pteNumPagos = pteNumPagos;
    }

    public BigDecimal getPteNumPagos() {
        return this.pteNumPagos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPtePagosEfect(BigDecimal ptePagosEfect) {
        this.ptePagosEfect = ptePagosEfect;
    }

    public BigDecimal getPtePagosEfect() {
        return this.ptePagosEfect;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPteAnoIniPago(BigDecimal pteAnoIniPago) {
        this.pteAnoIniPago = pteAnoIniPago;
    }

    public BigDecimal getPteAnoIniPago() {
        return this.pteAnoIniPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPteMesIniPago(BigDecimal pteMesIniPago) {
        this.pteMesIniPago = pteMesIniPago;
    }

    public BigDecimal getPteMesIniPago() {
        return this.pteMesIniPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPteDiaIniPago(BigDecimal pteDiaIniPago) {
        this.pteDiaIniPago = pteDiaIniPago;
    }

    public BigDecimal getPteDiaIniPago() {
        return this.pteDiaIniPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPteAnoFinPago(BigDecimal pteAnoFinPago) {
        this.pteAnoFinPago = pteAnoFinPago;
    }

    public BigDecimal getPteAnoFinPago() {
        return this.pteAnoFinPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPteMesFinPago(BigDecimal pteMesFinPago) {
        this.pteMesFinPago = pteMesFinPago;
    }

    public BigDecimal getPteMesFinPago() {
        return this.pteMesFinPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPteDiaFinPago(BigDecimal pteDiaFinPago) {
        this.pteDiaFinPago = pteDiaFinPago;
    }

    public BigDecimal getPteDiaFinPago() {
        return this.pteDiaFinPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPteAnoProxPago(BigDecimal pteAnoProxPago) {
        this.pteAnoProxPago = pteAnoProxPago;
    }

    public BigDecimal getPteAnoProxPago() {
        return this.pteAnoProxPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPteMesProxPago(BigDecimal pteMesProxPago) {
        this.pteMesProxPago = pteMesProxPago;
    }

    public BigDecimal getPteMesProxPago() {
        return this.pteMesProxPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPteDiaProxPago(BigDecimal pteDiaProxPago) {
        this.pteDiaProxPago = pteDiaProxPago;
    }

    public BigDecimal getPteDiaProxPago() {
        return this.pteDiaProxPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPteAnoAltaReg(BigDecimal pteAnoAltaReg) {
        this.pteAnoAltaReg = pteAnoAltaReg;
    }

    public BigDecimal getPteAnoAltaReg() {
        return this.pteAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPteMesAltaReg(BigDecimal pteMesAltaReg) {
        this.pteMesAltaReg = pteMesAltaReg;
    }

    public BigDecimal getPteMesAltaReg() {
        return this.pteMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPteDiaAltaReg(BigDecimal pteDiaAltaReg) {
        this.pteDiaAltaReg = pteDiaAltaReg;
    }

    public BigDecimal getPteDiaAltaReg() {
        return this.pteDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setPteAnoUltMod(BigDecimal pteAnoUltMod) {
        this.pteAnoUltMod = pteAnoUltMod;
    }

    public BigDecimal getPteAnoUltMod() {
        return this.pteAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPteMesUltMod(BigDecimal pteMesUltMod) {
        this.pteMesUltMod = pteMesUltMod;
    }

    public BigDecimal getPteMesUltMod() {
        return this.pteMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setPteDiaUltMod(BigDecimal pteDiaUltMod) {
        this.pteDiaUltMod = pteDiaUltMod;
    }

    public BigDecimal getPteDiaUltMod() {
        return this.pteDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPteCveStParpate(String pteCveStParpate) {
        this.pteCveStParpate = pteCveStParpate;
    }

    public String getPteCveStParpate() {
        return this.pteCveStParpate;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPteSubContrato(BigDecimal pteSubContrato) {
        this.pteSubContrato = pteSubContrato;
    }

    public BigDecimal getPteSubContrato() {
        return this.pteSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPteSubPrograma(BigDecimal pteSubPrograma) {
        this.pteSubPrograma = pteSubPrograma;
    }

    public BigDecimal getPteSubPrograma() {
        return this.pteSubPrograma;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PARPATER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPteNumContrato() != null && this.getPteNumContrato().longValue() == -999) {
            conditions += " AND PTE_NUM_CONTRATO IS NULL";
        } else if (this.getPteNumContrato() != null) {
            conditions += " AND PTE_NUM_CONTRATO = ?";
            values.add(this.getPteNumContrato());
        }

        if (this.getPteNumTercero() != null && this.getPteNumTercero().longValue() == -999) {
            conditions += " AND PTE_NUM_TERCERO IS NULL";
        } else if (this.getPteNumTercero() != null) {
            conditions += " AND PTE_NUM_TERCERO = ?";
            values.add(this.getPteNumTercero());
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
        String sql = "SELECT * FROM PARPATER ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPteNumContrato() != null && this.getPteNumContrato().longValue() == -999) {
            conditions += " AND PTE_NUM_CONTRATO IS NULL";
        } else if (this.getPteNumContrato() != null) {
            conditions += " AND PTE_NUM_CONTRATO = ?";
            values.add(this.getPteNumContrato());
        }

        if (this.getPteNumTercero() != null && this.getPteNumTercero().longValue() == -999) {
            conditions += " AND PTE_NUM_TERCERO IS NULL";
        } else if (this.getPteNumTercero() != null) {
            conditions += " AND PTE_NUM_TERCERO = ?";
            values.add(this.getPteNumTercero());
        }

        if (this.getPteImpFijoPago() != null && this.getPteImpFijoPago().longValue() == -999) {
            conditions += " AND PTE_IMP_FIJO_PAGO IS NULL";
        } else if (this.getPteImpFijoPago() != null) {
            conditions += " AND PTE_IMP_FIJO_PAGO = ?";
            values.add(this.getPteImpFijoPago());
        }

        if (this.getPteCvePerPago() != null && "null".equals(this.getPteCvePerPago())) {
            conditions += " AND PTE_CVE_PER_PAGO IS NULL";
        } else if (this.getPteCvePerPago() != null) {
            conditions += " AND PTE_CVE_PER_PAGO = ?";
            values.add(this.getPteCvePerPago());
        }

        if (this.getPteNumPagos() != null && this.getPteNumPagos().longValue() == -999) {
            conditions += " AND PTE_NUM_PAGOS IS NULL";
        } else if (this.getPteNumPagos() != null) {
            conditions += " AND PTE_NUM_PAGOS = ?";
            values.add(this.getPteNumPagos());
        }

        if (this.getPtePagosEfect() != null && this.getPtePagosEfect().longValue() == -999) {
            conditions += " AND PTE_PAGOS_EFECT IS NULL";
        } else if (this.getPtePagosEfect() != null) {
            conditions += " AND PTE_PAGOS_EFECT = ?";
            values.add(this.getPtePagosEfect());
        }

        if (this.getPteAnoIniPago() != null && this.getPteAnoIniPago().longValue() == -999) {
            conditions += " AND PTE_ANO_INI_PAGO IS NULL";
        } else if (this.getPteAnoIniPago() != null) {
            conditions += " AND PTE_ANO_INI_PAGO = ?";
            values.add(this.getPteAnoIniPago());
        }

        if (this.getPteMesIniPago() != null && this.getPteMesIniPago().longValue() == -999) {
            conditions += " AND PTE_MES_INI_PAGO IS NULL";
        } else if (this.getPteMesIniPago() != null) {
            conditions += " AND PTE_MES_INI_PAGO = ?";
            values.add(this.getPteMesIniPago());
        }

        if (this.getPteDiaIniPago() != null && this.getPteDiaIniPago().longValue() == -999) {
            conditions += " AND PTE_DIA_INI_PAGO IS NULL";
        } else if (this.getPteDiaIniPago() != null) {
            conditions += " AND PTE_DIA_INI_PAGO = ?";
            values.add(this.getPteDiaIniPago());
        }

        if (this.getPteAnoFinPago() != null && this.getPteAnoFinPago().longValue() == -999) {
            conditions += " AND PTE_ANO_FIN_PAGO IS NULL";
        } else if (this.getPteAnoFinPago() != null) {
            conditions += " AND PTE_ANO_FIN_PAGO = ?";
            values.add(this.getPteAnoFinPago());
        }

        if (this.getPteMesFinPago() != null && this.getPteMesFinPago().longValue() == -999) {
            conditions += " AND PTE_MES_FIN_PAGO IS NULL";
        } else if (this.getPteMesFinPago() != null) {
            conditions += " AND PTE_MES_FIN_PAGO = ?";
            values.add(this.getPteMesFinPago());
        }

        if (this.getPteDiaFinPago() != null && this.getPteDiaFinPago().longValue() == -999) {
            conditions += " AND PTE_DIA_FIN_PAGO IS NULL";
        } else if (this.getPteDiaFinPago() != null) {
            conditions += " AND PTE_DIA_FIN_PAGO = ?";
            values.add(this.getPteDiaFinPago());
        }

        if (this.getPteAnoProxPago() != null && this.getPteAnoProxPago().longValue() == -999) {
            conditions += " AND PTE_ANO_PROX_PAGO IS NULL";
        } else if (this.getPteAnoProxPago() != null) {
            conditions += " AND PTE_ANO_PROX_PAGO = ?";
            values.add(this.getPteAnoProxPago());
        }

        if (this.getPteMesProxPago() != null && this.getPteMesProxPago().longValue() == -999) {
            conditions += " AND PTE_MES_PROX_PAGO IS NULL";
        } else if (this.getPteMesProxPago() != null) {
            conditions += " AND PTE_MES_PROX_PAGO = ?";
            values.add(this.getPteMesProxPago());
        }

        if (this.getPteDiaProxPago() != null && this.getPteDiaProxPago().longValue() == -999) {
            conditions += " AND PTE_DIA_PROX_PAGO IS NULL";
        } else if (this.getPteDiaProxPago() != null) {
            conditions += " AND PTE_DIA_PROX_PAGO = ?";
            values.add(this.getPteDiaProxPago());
        }

        if (this.getPteAnoAltaReg() != null && this.getPteAnoAltaReg().longValue() == -999) {
            conditions += " AND PTE_ANO_ALTA_REG IS NULL";
        } else if (this.getPteAnoAltaReg() != null) {
            conditions += " AND PTE_ANO_ALTA_REG = ?";
            values.add(this.getPteAnoAltaReg());
        }

        if (this.getPteMesAltaReg() != null && this.getPteMesAltaReg().longValue() == -999) {
            conditions += " AND PTE_MES_ALTA_REG IS NULL";
        } else if (this.getPteMesAltaReg() != null) {
            conditions += " AND PTE_MES_ALTA_REG = ?";
            values.add(this.getPteMesAltaReg());
        }

        if (this.getPteDiaAltaReg() != null && this.getPteDiaAltaReg().longValue() == -999) {
            conditions += " AND PTE_DIA_ALTA_REG IS NULL";
        } else if (this.getPteDiaAltaReg() != null) {
            conditions += " AND PTE_DIA_ALTA_REG = ?";
            values.add(this.getPteDiaAltaReg());
        }

        if (this.getPteAnoUltMod() != null && this.getPteAnoUltMod().longValue() == -999) {
            conditions += " AND PTE_ANO_ULT_MOD IS NULL";
        } else if (this.getPteAnoUltMod() != null) {
            conditions += " AND PTE_ANO_ULT_MOD = ?";
            values.add(this.getPteAnoUltMod());
        }

        if (this.getPteMesUltMod() != null && this.getPteMesUltMod().longValue() == -999) {
            conditions += " AND PTE_MES_ULT_MOD IS NULL";
        } else if (this.getPteMesUltMod() != null) {
            conditions += " AND PTE_MES_ULT_MOD = ?";
            values.add(this.getPteMesUltMod());
        }

        if (this.getPteDiaUltMod() != null && this.getPteDiaUltMod().longValue() == -999) {
            conditions += " AND PTE_DIA_ULT_MOD IS NULL";
        } else if (this.getPteDiaUltMod() != null) {
            conditions += " AND PTE_DIA_ULT_MOD = ?";
            values.add(this.getPteDiaUltMod());
        }

        if (this.getPteCveStParpate() != null && "null".equals(this.getPteCveStParpate())) {
            conditions += " AND PTE_CVE_ST_PARPATE IS NULL";
        } else if (this.getPteCveStParpate() != null) {
            conditions += " AND PTE_CVE_ST_PARPATE = ?";
            values.add(this.getPteCveStParpate());
        }

        if (this.getPteSubContrato() != null && this.getPteSubContrato().longValue() == -999) {
            conditions += " AND PTE_SUB_CONTRATO IS NULL";
        } else if (this.getPteSubContrato() != null) {
            conditions += " AND PTE_SUB_CONTRATO = ?";
            values.add(this.getPteSubContrato());
        }

        if (this.getPteSubPrograma() != null && this.getPteSubPrograma().longValue() == -999) {
            conditions += " AND PTE_SUB_PROGRAMA IS NULL";
        } else if (this.getPteSubPrograma() != null) {
            conditions += " AND PTE_SUB_PROGRAMA = ?";
            values.add(this.getPteSubPrograma());
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
        String sql = "UPDATE PARPATER SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PTE_NUM_CONTRATO = ?";
        pkValues.add(this.getPteNumContrato());
        conditions += " AND PTE_NUM_TERCERO = ?";
        pkValues.add(this.getPteNumTercero());
        fields += " PTE_IMP_FIJO_PAGO = ?, ";
        values.add(this.getPteImpFijoPago());
        fields += " PTE_CVE_PER_PAGO = ?, ";
        values.add(this.getPteCvePerPago());
        fields += " PTE_NUM_PAGOS = ?, ";
        values.add(this.getPteNumPagos());
        fields += " PTE_PAGOS_EFECT = ?, ";
        values.add(this.getPtePagosEfect());
        fields += " PTE_ANO_INI_PAGO = ?, ";
        values.add(this.getPteAnoIniPago());
        fields += " PTE_MES_INI_PAGO = ?, ";
        values.add(this.getPteMesIniPago());
        fields += " PTE_DIA_INI_PAGO = ?, ";
        values.add(this.getPteDiaIniPago());
        fields += " PTE_ANO_FIN_PAGO = ?, ";
        values.add(this.getPteAnoFinPago());
        fields += " PTE_MES_FIN_PAGO = ?, ";
        values.add(this.getPteMesFinPago());
        fields += " PTE_DIA_FIN_PAGO = ?, ";
        values.add(this.getPteDiaFinPago());
        fields += " PTE_ANO_PROX_PAGO = ?, ";
        values.add(this.getPteAnoProxPago());
        fields += " PTE_MES_PROX_PAGO = ?, ";
        values.add(this.getPteMesProxPago());
        fields += " PTE_DIA_PROX_PAGO = ?, ";
        values.add(this.getPteDiaProxPago());
        fields += " PTE_ANO_ALTA_REG = ?, ";
        values.add(this.getPteAnoAltaReg());
        fields += " PTE_MES_ALTA_REG = ?, ";
        values.add(this.getPteMesAltaReg());
        fields += " PTE_DIA_ALTA_REG = ?, ";
        values.add(this.getPteDiaAltaReg());
        fields += " PTE_ANO_ULT_MOD = ?, ";
        values.add(this.getPteAnoUltMod());
        fields += " PTE_MES_ULT_MOD = ?, ";
        values.add(this.getPteMesUltMod());
        fields += " PTE_DIA_ULT_MOD = ?, ";
        values.add(this.getPteDiaUltMod());
        fields += " PTE_CVE_ST_PARPATE = ?, ";
        values.add(this.getPteCveStParpate());
        fields += " PTE_SUB_CONTRATO = ?, ";
        values.add(this.getPteSubContrato());
        fields += " PTE_SUB_PROGRAMA = ?, ";
        values.add(this.getPteSubPrograma());
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
        String sql = "INSERT INTO PARPATER ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PTE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPteNumContrato());

        fields += ", PTE_NUM_TERCERO";
        fieldValues += ", ?";
        values.add(this.getPteNumTercero());

        fields += ", PTE_IMP_FIJO_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteImpFijoPago());

        fields += ", PTE_CVE_PER_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteCvePerPago());

        fields += ", PTE_NUM_PAGOS";
        fieldValues += ", ?";
        values.add(this.getPteNumPagos());

        fields += ", PTE_PAGOS_EFECT";
        fieldValues += ", ?";
        values.add(this.getPtePagosEfect());

        fields += ", PTE_ANO_INI_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteAnoIniPago());

        fields += ", PTE_MES_INI_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteMesIniPago());

        fields += ", PTE_DIA_INI_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteDiaIniPago());

        fields += ", PTE_ANO_FIN_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteAnoFinPago());

        fields += ", PTE_MES_FIN_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteMesFinPago());

        fields += ", PTE_DIA_FIN_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteDiaFinPago());

        fields += ", PTE_ANO_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteAnoProxPago());

        fields += ", PTE_MES_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteMesProxPago());

        fields += ", PTE_DIA_PROX_PAGO";
        fieldValues += ", ?";
        values.add(this.getPteDiaProxPago());

        fields += ", PTE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPteAnoAltaReg());

        fields += ", PTE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPteMesAltaReg());

        fields += ", PTE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getPteDiaAltaReg());

        fields += ", PTE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPteAnoUltMod());

        fields += ", PTE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPteMesUltMod());

        fields += ", PTE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getPteDiaUltMod());

        fields += ", PTE_CVE_ST_PARPATE";
        fieldValues += ", ?";
        values.add(this.getPteCveStParpate());

        fields += ", PTE_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getPteSubContrato());

        fields += ", PTE_SUB_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getPteSubPrograma());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PARPATER WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PTE_NUM_CONTRATO = ?";
        values.add(this.getPteNumContrato());
        conditions += " AND PTE_NUM_TERCERO = ?";
        values.add(this.getPteNumTercero());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Parpater instance = (Parpater) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPteNumContrato().equals(instance.getPteNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPteNumTercero().equals(instance.getPteNumTercero()))
            equalObjects = false;
        if (equalObjects && !this.getPteImpFijoPago().equals(instance.getPteImpFijoPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteCvePerPago().equals(instance.getPteCvePerPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteNumPagos().equals(instance.getPteNumPagos()))
            equalObjects = false;
        if (equalObjects && !this.getPtePagosEfect().equals(instance.getPtePagosEfect()))
            equalObjects = false;
        if (equalObjects && !this.getPteAnoIniPago().equals(instance.getPteAnoIniPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteMesIniPago().equals(instance.getPteMesIniPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteDiaIniPago().equals(instance.getPteDiaIniPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteAnoFinPago().equals(instance.getPteAnoFinPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteMesFinPago().equals(instance.getPteMesFinPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteDiaFinPago().equals(instance.getPteDiaFinPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteAnoProxPago().equals(instance.getPteAnoProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteMesProxPago().equals(instance.getPteMesProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteDiaProxPago().equals(instance.getPteDiaProxPago()))
            equalObjects = false;
        if (equalObjects && !this.getPteAnoAltaReg().equals(instance.getPteAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPteMesAltaReg().equals(instance.getPteMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPteDiaAltaReg().equals(instance.getPteDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getPteAnoUltMod().equals(instance.getPteAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPteMesUltMod().equals(instance.getPteMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPteDiaUltMod().equals(instance.getPteDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getPteCveStParpate().equals(instance.getPteCveStParpate()))
            equalObjects = false;
        if (equalObjects && !this.getPteSubContrato().equals(instance.getPteSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getPteSubPrograma().equals(instance.getPteSubPrograma()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Parpater result = new Parpater();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPteNumContrato((BigDecimal) objectData.getData("PTE_NUM_CONTRATO"));
        result.setPteNumTercero((BigDecimal) objectData.getData("PTE_NUM_TERCERO"));
        result.setPteImpFijoPago((BigDecimal) objectData.getData("PTE_IMP_FIJO_PAGO"));
        result.setPteCvePerPago((String) objectData.getData("PTE_CVE_PER_PAGO"));
        result.setPteNumPagos((BigDecimal) objectData.getData("PTE_NUM_PAGOS"));
        result.setPtePagosEfect((BigDecimal) objectData.getData("PTE_PAGOS_EFECT"));
        result.setPteAnoIniPago((BigDecimal) objectData.getData("PTE_ANO_INI_PAGO"));
        result.setPteMesIniPago((BigDecimal) objectData.getData("PTE_MES_INI_PAGO"));
        result.setPteDiaIniPago((BigDecimal) objectData.getData("PTE_DIA_INI_PAGO"));
        result.setPteAnoFinPago((BigDecimal) objectData.getData("PTE_ANO_FIN_PAGO"));
        result.setPteMesFinPago((BigDecimal) objectData.getData("PTE_MES_FIN_PAGO"));
        result.setPteDiaFinPago((BigDecimal) objectData.getData("PTE_DIA_FIN_PAGO"));
        result.setPteAnoProxPago((BigDecimal) objectData.getData("PTE_ANO_PROX_PAGO"));
        result.setPteMesProxPago((BigDecimal) objectData.getData("PTE_MES_PROX_PAGO"));
        result.setPteDiaProxPago((BigDecimal) objectData.getData("PTE_DIA_PROX_PAGO"));
        result.setPteAnoAltaReg((BigDecimal) objectData.getData("PTE_ANO_ALTA_REG"));
        result.setPteMesAltaReg((BigDecimal) objectData.getData("PTE_MES_ALTA_REG"));
        result.setPteDiaAltaReg((BigDecimal) objectData.getData("PTE_DIA_ALTA_REG"));
        result.setPteAnoUltMod((BigDecimal) objectData.getData("PTE_ANO_ULT_MOD"));
        result.setPteMesUltMod((BigDecimal) objectData.getData("PTE_MES_ULT_MOD"));
        result.setPteDiaUltMod((BigDecimal) objectData.getData("PTE_DIA_ULT_MOD"));
        result.setPteCveStParpate((String) objectData.getData("PTE_CVE_ST_PARPATE"));
        result.setPteSubContrato((BigDecimal) objectData.getData("PTE_SUB_CONTRATO"));
        result.setPteSubPrograma((BigDecimal) objectData.getData("PTE_SUB_PROGRAMA"));

        return result;

    }

}
