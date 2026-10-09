package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "VENTEMISMSA_PK",
            columns =
            { "VTE_NUM_PIZARRA", "VTE_NUM_SER_EMIS", "VTE_NUM_CUPON_VIG", "VTE_DIA_VENTA", "VTE_SEC_DIA_VTA", "VTE_FOLIO_OPER_CPA", "VTE_SUB_CONTRATO", "VTE_CONTRATO_INTER",
              "VTE_NUM_CONTRATO", "VTE_ENTIDAD_FIN"
    }, sequences = { "MANUAL" })
public class Ventemismsa extends DomainObject {

    BigDecimal vteNumContrato = null;
    BigDecimal vteSubContrato = null;
    BigDecimal vteEntidadFin = null;
    BigDecimal vteContratoInter = null;
    String vteNumPizarra = null;
    String vteNumSerEmis = null;
    BigDecimal vteNumCuponVig = null;
    String vteDiaVenta = null;
    BigDecimal vteSecDiaVta = null;
    BigDecimal vteFolioOperCpa = null;
    BigDecimal vteNumCustodio = null;
    BigDecimal vteNumMoneda = null;
    BigDecimal vteImpPrecEmis = null;
    BigDecimal vteImpPrecProA = null;
    BigDecimal vteImpVenta = null;
    BigDecimal vteNumTitVta = null;
    BigDecimal vteAnoAltaReg = null;
    BigDecimal vteMesAltaReg = null;
    BigDecimal vteDiaAltaReg = null;
    BigDecimal vteAnoUltMod = null;
    BigDecimal vteMesUltMod = null;
    BigDecimal vteDiaUltMod = null;
    String vteCveStVentem = null;

    public Ventemismsa() {
        super();
        this.pkColumns = 10;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVteNumContrato(BigDecimal vteNumContrato) {
        this.vteNumContrato = vteNumContrato;
    }

    public BigDecimal getVteNumContrato() {
        return this.vteNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVteSubContrato(BigDecimal vteSubContrato) {
        this.vteSubContrato = vteSubContrato;
    }

    public BigDecimal getVteSubContrato() {
        return this.vteSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVteEntidadFin(BigDecimal vteEntidadFin) {
        this.vteEntidadFin = vteEntidadFin;
    }

    public BigDecimal getVteEntidadFin() {
        return this.vteEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVteContratoInter(BigDecimal vteContratoInter) {
        this.vteContratoInter = vteContratoInter;
    }

    public BigDecimal getVteContratoInter() {
        return this.vteContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVteNumPizarra(String vteNumPizarra) {
        this.vteNumPizarra = vteNumPizarra;
    }

    public String getVteNumPizarra() {
        return this.vteNumPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVteNumSerEmis(String vteNumSerEmis) {
        this.vteNumSerEmis = vteNumSerEmis;
    }

    public String getVteNumSerEmis() {
        return this.vteNumSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVteNumCuponVig(BigDecimal vteNumCuponVig) {
        this.vteNumCuponVig = vteNumCuponVig;
    }

    public BigDecimal getVteNumCuponVig() {
        return this.vteNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setVteDiaVenta(String vteDiaVenta) {
        this.vteDiaVenta = vteDiaVenta;
    }

    public String getVteDiaVenta() {
        return this.vteDiaVenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setVteSecDiaVta(BigDecimal vteSecDiaVta) {
        this.vteSecDiaVta = vteSecDiaVta;
    }

    public BigDecimal getVteSecDiaVta() {
        return this.vteSecDiaVta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVteFolioOperCpa(BigDecimal vteFolioOperCpa) {
        this.vteFolioOperCpa = vteFolioOperCpa;
    }

    public BigDecimal getVteFolioOperCpa() {
        return this.vteFolioOperCpa;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVteNumCustodio(BigDecimal vteNumCustodio) {
        this.vteNumCustodio = vteNumCustodio;
    }

    public BigDecimal getVteNumCustodio() {
        return this.vteNumCustodio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setVteNumMoneda(BigDecimal vteNumMoneda) {
        this.vteNumMoneda = vteNumMoneda;
    }

    public BigDecimal getVteNumMoneda() {
        return this.vteNumMoneda;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setVteImpPrecEmis(BigDecimal vteImpPrecEmis) {
        this.vteImpPrecEmis = vteImpPrecEmis;
    }

    public BigDecimal getVteImpPrecEmis() {
        return this.vteImpPrecEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVteImpPrecProA(BigDecimal vteImpPrecProA) {
        this.vteImpPrecProA = vteImpPrecProA;
    }

    public BigDecimal getVteImpPrecProA() {
        return this.vteImpPrecProA;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setVteImpVenta(BigDecimal vteImpVenta) {
        this.vteImpVenta = vteImpVenta;
    }

    public BigDecimal getVteImpVenta() {
        return this.vteImpVenta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setVteNumTitVta(BigDecimal vteNumTitVta) {
        this.vteNumTitVta = vteNumTitVta;
    }

    public BigDecimal getVteNumTitVta() {
        return this.vteNumTitVta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setVteAnoAltaReg(BigDecimal vteAnoAltaReg) {
        this.vteAnoAltaReg = vteAnoAltaReg;
    }

    public BigDecimal getVteAnoAltaReg() {
        return this.vteAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVteMesAltaReg(BigDecimal vteMesAltaReg) {
        this.vteMesAltaReg = vteMesAltaReg;
    }

    public BigDecimal getVteMesAltaReg() {
        return this.vteMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVteDiaAltaReg(BigDecimal vteDiaAltaReg) {
        this.vteDiaAltaReg = vteDiaAltaReg;
    }

    public BigDecimal getVteDiaAltaReg() {
        return this.vteDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setVteAnoUltMod(BigDecimal vteAnoUltMod) {
        this.vteAnoUltMod = vteAnoUltMod;
    }

    public BigDecimal getVteAnoUltMod() {
        return this.vteAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVteMesUltMod(BigDecimal vteMesUltMod) {
        this.vteMesUltMod = vteMesUltMod;
    }

    public BigDecimal getVteMesUltMod() {
        return this.vteMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setVteDiaUltMod(BigDecimal vteDiaUltMod) {
        this.vteDiaUltMod = vteDiaUltMod;
    }

    public BigDecimal getVteDiaUltMod() {
        return this.vteDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setVteCveStVentem(String vteCveStVentem) {
        this.vteCveStVentem = vteCveStVentem;
    }

    public String getVteCveStVentem() {
        return this.vteCveStVentem;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM VENTEMISMSA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVteNumContrato() != null && this.getVteNumContrato().longValue() == -999) {
            conditions += " AND VTE_NUM_CONTRATO IS NULL";
        } else if (this.getVteNumContrato() != null) {
            conditions += " AND VTE_NUM_CONTRATO = ?";
            values.add(this.getVteNumContrato());
        }

        if (this.getVteSubContrato() != null && this.getVteSubContrato().longValue() == -999) {
            conditions += " AND VTE_SUB_CONTRATO IS NULL";
        } else if (this.getVteSubContrato() != null) {
            conditions += " AND VTE_SUB_CONTRATO = ?";
            values.add(this.getVteSubContrato());
        }

        if (this.getVteEntidadFin() != null && this.getVteEntidadFin().longValue() == -999) {
            conditions += " AND VTE_ENTIDAD_FIN IS NULL";
        } else if (this.getVteEntidadFin() != null) {
            conditions += " AND VTE_ENTIDAD_FIN = ?";
            values.add(this.getVteEntidadFin());
        }

        if (this.getVteContratoInter() != null && this.getVteContratoInter().longValue() == -999) {
            conditions += " AND VTE_CONTRATO_INTER IS NULL";
        } else if (this.getVteContratoInter() != null) {
            conditions += " AND VTE_CONTRATO_INTER = ?";
            values.add(this.getVteContratoInter());
        }

        if (this.getVteNumPizarra() != null && "null".equals(this.getVteNumPizarra())) {
            conditions += " AND VTE_NUM_PIZARRA IS NULL";
        } else if (this.getVteNumPizarra() != null) {
            conditions += " AND VTE_NUM_PIZARRA = ?";
            values.add(this.getVteNumPizarra());
        }

        if (this.getVteNumSerEmis() != null && "null".equals(this.getVteNumSerEmis())) {
            conditions += " AND VTE_NUM_SER_EMIS IS NULL";
        } else if (this.getVteNumSerEmis() != null) {
            conditions += " AND VTE_NUM_SER_EMIS = ?";
            values.add(this.getVteNumSerEmis());
        }

        if (this.getVteNumCuponVig() != null && this.getVteNumCuponVig().longValue() == -999) {
            conditions += " AND VTE_NUM_CUPON_VIG IS NULL";
        } else if (this.getVteNumCuponVig() != null) {
            conditions += " AND VTE_NUM_CUPON_VIG = ?";
            values.add(this.getVteNumCuponVig());
        }

        if (this.getVteDiaVenta() != null && "null".equals(this.getVteDiaVenta())) {
            conditions += " AND VTE_DIA_VENTA IS NULL";
        } else if (this.getVteDiaVenta() != null) {
            conditions += " AND VTE_DIA_VENTA = ?";
            values.add(this.getVteDiaVenta());
        }

        if (this.getVteSecDiaVta() != null && this.getVteSecDiaVta().longValue() == -999) {
            conditions += " AND VTE_SEC_DIA_VTA IS NULL";
        } else if (this.getVteSecDiaVta() != null) {
            conditions += " AND VTE_SEC_DIA_VTA = ?";
            values.add(this.getVteSecDiaVta());
        }

        if (this.getVteFolioOperCpa() != null && this.getVteFolioOperCpa().longValue() == -999) {
            conditions += " AND VTE_FOLIO_OPER_CPA IS NULL";
        } else if (this.getVteFolioOperCpa() != null) {
            conditions += " AND VTE_FOLIO_OPER_CPA = ?";
            values.add(this.getVteFolioOperCpa());
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
        String sql = "SELECT * FROM VENTEMISMSA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getVteNumContrato() != null && this.getVteNumContrato().longValue() == -999) {
            conditions += " AND VTE_NUM_CONTRATO IS NULL";
        } else if (this.getVteNumContrato() != null) {
            conditions += " AND VTE_NUM_CONTRATO = ?";
            values.add(this.getVteNumContrato());
        }

        if (this.getVteSubContrato() != null && this.getVteSubContrato().longValue() == -999) {
            conditions += " AND VTE_SUB_CONTRATO IS NULL";
        } else if (this.getVteSubContrato() != null) {
            conditions += " AND VTE_SUB_CONTRATO = ?";
            values.add(this.getVteSubContrato());
        }

        if (this.getVteEntidadFin() != null && this.getVteEntidadFin().longValue() == -999) {
            conditions += " AND VTE_ENTIDAD_FIN IS NULL";
        } else if (this.getVteEntidadFin() != null) {
            conditions += " AND VTE_ENTIDAD_FIN = ?";
            values.add(this.getVteEntidadFin());
        }

        if (this.getVteContratoInter() != null && this.getVteContratoInter().longValue() == -999) {
            conditions += " AND VTE_CONTRATO_INTER IS NULL";
        } else if (this.getVteContratoInter() != null) {
            conditions += " AND VTE_CONTRATO_INTER = ?";
            values.add(this.getVteContratoInter());
        }

        if (this.getVteNumPizarra() != null && "null".equals(this.getVteNumPizarra())) {
            conditions += " AND VTE_NUM_PIZARRA IS NULL";
        } else if (this.getVteNumPizarra() != null) {
            conditions += " AND VTE_NUM_PIZARRA = ?";
            values.add(this.getVteNumPizarra());
        }

        if (this.getVteNumSerEmis() != null && "null".equals(this.getVteNumSerEmis())) {
            conditions += " AND VTE_NUM_SER_EMIS IS NULL";
        } else if (this.getVteNumSerEmis() != null) {
            conditions += " AND VTE_NUM_SER_EMIS = ?";
            values.add(this.getVteNumSerEmis());
        }

        if (this.getVteNumCuponVig() != null && this.getVteNumCuponVig().longValue() == -999) {
            conditions += " AND VTE_NUM_CUPON_VIG IS NULL";
        } else if (this.getVteNumCuponVig() != null) {
            conditions += " AND VTE_NUM_CUPON_VIG = ?";
            values.add(this.getVteNumCuponVig());
        }

        if (this.getVteDiaVenta() != null && "null".equals(this.getVteDiaVenta())) {
            conditions += " AND VTE_DIA_VENTA IS NULL";
        } else if (this.getVteDiaVenta() != null) {
            conditions += " AND VTE_DIA_VENTA = ?";
            values.add(this.getVteDiaVenta());
        }

        if (this.getVteSecDiaVta() != null && this.getVteSecDiaVta().longValue() == -999) {
            conditions += " AND VTE_SEC_DIA_VTA IS NULL";
        } else if (this.getVteSecDiaVta() != null) {
            conditions += " AND VTE_SEC_DIA_VTA = ?";
            values.add(this.getVteSecDiaVta());
        }

        if (this.getVteFolioOperCpa() != null && this.getVteFolioOperCpa().longValue() == -999) {
            conditions += " AND VTE_FOLIO_OPER_CPA IS NULL";
        } else if (this.getVteFolioOperCpa() != null) {
            conditions += " AND VTE_FOLIO_OPER_CPA = ?";
            values.add(this.getVteFolioOperCpa());
        }

        if (this.getVteNumCustodio() != null && this.getVteNumCustodio().longValue() == -999) {
            conditions += " AND VTE_NUM_CUSTODIO IS NULL";
        } else if (this.getVteNumCustodio() != null) {
            conditions += " AND VTE_NUM_CUSTODIO = ?";
            values.add(this.getVteNumCustodio());
        }

        if (this.getVteNumMoneda() != null && this.getVteNumMoneda().longValue() == -999) {
            conditions += " AND VTE_NUM_MONEDA IS NULL";
        } else if (this.getVteNumMoneda() != null) {
            conditions += " AND VTE_NUM_MONEDA = ?";
            values.add(this.getVteNumMoneda());
        }

        if (this.getVteImpPrecEmis() != null && this.getVteImpPrecEmis().longValue() == -999) {
            conditions += " AND VTE_IMP_PREC_EMIS IS NULL";
        } else if (this.getVteImpPrecEmis() != null) {
            conditions += " AND VTE_IMP_PREC_EMIS = ?";
            values.add(this.getVteImpPrecEmis());
        }

        if (this.getVteImpPrecProA() != null && this.getVteImpPrecProA().longValue() == -999) {
            conditions += " AND VTE_IMP_PREC_PRO_A IS NULL";
        } else if (this.getVteImpPrecProA() != null) {
            conditions += " AND VTE_IMP_PREC_PRO_A = ?";
            values.add(this.getVteImpPrecProA());
        }

        if (this.getVteImpVenta() != null && this.getVteImpVenta().longValue() == -999) {
            conditions += " AND VTE_IMP_VENTA IS NULL";
        } else if (this.getVteImpVenta() != null) {
            conditions += " AND VTE_IMP_VENTA = ?";
            values.add(this.getVteImpVenta());
        }

        if (this.getVteNumTitVta() != null && this.getVteNumTitVta().longValue() == -999) {
            conditions += " AND VTE_NUM_TIT_VTA IS NULL";
        } else if (this.getVteNumTitVta() != null) {
            conditions += " AND VTE_NUM_TIT_VTA = ?";
            values.add(this.getVteNumTitVta());
        }

        if (this.getVteAnoAltaReg() != null && this.getVteAnoAltaReg().longValue() == -999) {
            conditions += " AND VTE_ANO_ALTA_REG IS NULL";
        } else if (this.getVteAnoAltaReg() != null) {
            conditions += " AND VTE_ANO_ALTA_REG = ?";
            values.add(this.getVteAnoAltaReg());
        }

        if (this.getVteMesAltaReg() != null && this.getVteMesAltaReg().longValue() == -999) {
            conditions += " AND VTE_MES_ALTA_REG IS NULL";
        } else if (this.getVteMesAltaReg() != null) {
            conditions += " AND VTE_MES_ALTA_REG = ?";
            values.add(this.getVteMesAltaReg());
        }

        if (this.getVteDiaAltaReg() != null && this.getVteDiaAltaReg().longValue() == -999) {
            conditions += " AND VTE_DIA_ALTA_REG IS NULL";
        } else if (this.getVteDiaAltaReg() != null) {
            conditions += " AND VTE_DIA_ALTA_REG = ?";
            values.add(this.getVteDiaAltaReg());
        }

        if (this.getVteAnoUltMod() != null && this.getVteAnoUltMod().longValue() == -999) {
            conditions += " AND VTE_ANO_ULT_MOD IS NULL";
        } else if (this.getVteAnoUltMod() != null) {
            conditions += " AND VTE_ANO_ULT_MOD = ?";
            values.add(this.getVteAnoUltMod());
        }

        if (this.getVteMesUltMod() != null && this.getVteMesUltMod().longValue() == -999) {
            conditions += " AND VTE_MES_ULT_MOD IS NULL";
        } else if (this.getVteMesUltMod() != null) {
            conditions += " AND VTE_MES_ULT_MOD = ?";
            values.add(this.getVteMesUltMod());
        }

        if (this.getVteDiaUltMod() != null && this.getVteDiaUltMod().longValue() == -999) {
            conditions += " AND VTE_DIA_ULT_MOD IS NULL";
        } else if (this.getVteDiaUltMod() != null) {
            conditions += " AND VTE_DIA_ULT_MOD = ?";
            values.add(this.getVteDiaUltMod());
        }

        if (this.getVteCveStVentem() != null && "null".equals(this.getVteCveStVentem())) {
            conditions += " AND VTE_CVE_ST_VENTEM IS NULL";
        } else if (this.getVteCveStVentem() != null) {
            conditions += " AND VTE_CVE_ST_VENTEM = ?";
            values.add(this.getVteCveStVentem());
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
        String sql = "UPDATE VENTEMISMSA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND VTE_NUM_CONTRATO = ?";
        pkValues.add(this.getVteNumContrato());
        conditions += " AND VTE_SUB_CONTRATO = ?";
        pkValues.add(this.getVteSubContrato());
        conditions += " AND VTE_ENTIDAD_FIN = ?";
        pkValues.add(this.getVteEntidadFin());
        conditions += " AND VTE_CONTRATO_INTER = ?";
        pkValues.add(this.getVteContratoInter());
        conditions += " AND VTE_NUM_PIZARRA = ?";
        pkValues.add(this.getVteNumPizarra());
        conditions += " AND VTE_NUM_SER_EMIS = ?";
        pkValues.add(this.getVteNumSerEmis());
        conditions += " AND VTE_NUM_CUPON_VIG = ?";
        pkValues.add(this.getVteNumCuponVig());
        conditions += " AND VTE_DIA_VENTA = ?";
        pkValues.add(this.getVteDiaVenta());
        conditions += " AND VTE_SEC_DIA_VTA = ?";
        pkValues.add(this.getVteSecDiaVta());
        conditions += " AND VTE_FOLIO_OPER_CPA = ?";
        pkValues.add(this.getVteFolioOperCpa());
        fields += " VTE_NUM_CUSTODIO = ?, ";
        values.add(this.getVteNumCustodio());
        fields += " VTE_NUM_MONEDA = ?, ";
        values.add(this.getVteNumMoneda());
        fields += " VTE_IMP_PREC_EMIS = ?, ";
        values.add(this.getVteImpPrecEmis());
        fields += " VTE_IMP_PREC_PRO_A = ?, ";
        values.add(this.getVteImpPrecProA());
        fields += " VTE_IMP_VENTA = ?, ";
        values.add(this.getVteImpVenta());
        fields += " VTE_NUM_TIT_VTA = ?, ";
        values.add(this.getVteNumTitVta());
        fields += " VTE_ANO_ALTA_REG = ?, ";
        values.add(this.getVteAnoAltaReg());
        fields += " VTE_MES_ALTA_REG = ?, ";
        values.add(this.getVteMesAltaReg());
        fields += " VTE_DIA_ALTA_REG = ?, ";
        values.add(this.getVteDiaAltaReg());
        fields += " VTE_ANO_ULT_MOD = ?, ";
        values.add(this.getVteAnoUltMod());
        fields += " VTE_MES_ULT_MOD = ?, ";
        values.add(this.getVteMesUltMod());
        fields += " VTE_DIA_ULT_MOD = ?, ";
        values.add(this.getVteDiaUltMod());
        fields += " VTE_CVE_ST_VENTEM = ?, ";
        values.add(this.getVteCveStVentem());
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
        String sql = "INSERT INTO VENTEMISMSA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", VTE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getVteNumContrato());

        fields += ", VTE_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getVteSubContrato());

        fields += ", VTE_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getVteEntidadFin());

        fields += ", VTE_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getVteContratoInter());

        fields += ", VTE_NUM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getVteNumPizarra());

        fields += ", VTE_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getVteNumSerEmis());

        fields += ", VTE_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getVteNumCuponVig());

        fields += ", VTE_DIA_VENTA";
        fieldValues += ", ?";
        values.add(this.getVteDiaVenta());

        fields += ", VTE_SEC_DIA_VTA";
        fieldValues += ", ?";
        values.add(this.getVteSecDiaVta());

        fields += ", VTE_FOLIO_OPER_CPA";
        fieldValues += ", ?";
        values.add(this.getVteFolioOperCpa());

        fields += ", VTE_NUM_CUSTODIO";
        fieldValues += ", ?";
        values.add(this.getVteNumCustodio());

        fields += ", VTE_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getVteNumMoneda());

        fields += ", VTE_IMP_PREC_EMIS";
        fieldValues += ", ?";
        values.add(this.getVteImpPrecEmis());

        fields += ", VTE_IMP_PREC_PRO_A";
        fieldValues += ", ?";
        values.add(this.getVteImpPrecProA());

        fields += ", VTE_IMP_VENTA";
        fieldValues += ", ?";
        values.add(this.getVteImpVenta());

        fields += ", VTE_NUM_TIT_VTA";
        fieldValues += ", ?";
        values.add(this.getVteNumTitVta());

        fields += ", VTE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVteAnoAltaReg());

        fields += ", VTE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVteMesAltaReg());

        fields += ", VTE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getVteDiaAltaReg());

        fields += ", VTE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVteAnoUltMod());

        fields += ", VTE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVteMesUltMod());

        fields += ", VTE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getVteDiaUltMod());

        fields += ", VTE_CVE_ST_VENTEM";
        fieldValues += ", ?";
        values.add(this.getVteCveStVentem());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM VENTEMISMSA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND VTE_NUM_CONTRATO = ?";
        values.add(this.getVteNumContrato());
        conditions += " AND VTE_SUB_CONTRATO = ?";
        values.add(this.getVteSubContrato());
        conditions += " AND VTE_ENTIDAD_FIN = ?";
        values.add(this.getVteEntidadFin());
        conditions += " AND VTE_CONTRATO_INTER = ?";
        values.add(this.getVteContratoInter());
        conditions += " AND VTE_NUM_PIZARRA = ?";
        values.add(this.getVteNumPizarra());
        conditions += " AND VTE_NUM_SER_EMIS = ?";
        values.add(this.getVteNumSerEmis());
        conditions += " AND VTE_NUM_CUPON_VIG = ?";
        values.add(this.getVteNumCuponVig());
        conditions += " AND VTE_DIA_VENTA = ?";
        values.add(this.getVteDiaVenta());
        conditions += " AND VTE_SEC_DIA_VTA = ?";
        values.add(this.getVteSecDiaVta());
        conditions += " AND VTE_FOLIO_OPER_CPA = ?";
        values.add(this.getVteFolioOperCpa());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ventemismsa instance = (Ventemismsa) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getVteNumContrato().equals(instance.getVteNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getVteSubContrato().equals(instance.getVteSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getVteEntidadFin().equals(instance.getVteEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getVteContratoInter().equals(instance.getVteContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getVteNumPizarra().equals(instance.getVteNumPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getVteNumSerEmis().equals(instance.getVteNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getVteNumCuponVig().equals(instance.getVteNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getVteDiaVenta().equals(instance.getVteDiaVenta()))
            equalObjects = false;
        if (equalObjects && !this.getVteSecDiaVta().equals(instance.getVteSecDiaVta()))
            equalObjects = false;
        if (equalObjects && !this.getVteFolioOperCpa().equals(instance.getVteFolioOperCpa()))
            equalObjects = false;
        if (equalObjects && !this.getVteNumCustodio().equals(instance.getVteNumCustodio()))
            equalObjects = false;
        if (equalObjects && !this.getVteNumMoneda().equals(instance.getVteNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getVteImpPrecEmis().equals(instance.getVteImpPrecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getVteImpPrecProA().equals(instance.getVteImpPrecProA()))
            equalObjects = false;
        if (equalObjects && !this.getVteImpVenta().equals(instance.getVteImpVenta()))
            equalObjects = false;
        if (equalObjects && !this.getVteNumTitVta().equals(instance.getVteNumTitVta()))
            equalObjects = false;
        if (equalObjects && !this.getVteAnoAltaReg().equals(instance.getVteAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVteMesAltaReg().equals(instance.getVteMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVteDiaAltaReg().equals(instance.getVteDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getVteAnoUltMod().equals(instance.getVteAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVteMesUltMod().equals(instance.getVteMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVteDiaUltMod().equals(instance.getVteDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getVteCveStVentem().equals(instance.getVteCveStVentem()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ventemismsa result = new Ventemismsa();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setVteNumContrato((BigDecimal) objectData.getData("VTE_NUM_CONTRATO"));
        result.setVteSubContrato((BigDecimal) objectData.getData("VTE_SUB_CONTRATO"));
        result.setVteEntidadFin((BigDecimal) objectData.getData("VTE_ENTIDAD_FIN"));
        result.setVteContratoInter((BigDecimal) objectData.getData("VTE_CONTRATO_INTER"));
        result.setVteNumPizarra((String) objectData.getData("VTE_NUM_PIZARRA"));
        result.setVteNumSerEmis((String) objectData.getData("VTE_NUM_SER_EMIS"));
        result.setVteNumCuponVig((BigDecimal) objectData.getData("VTE_NUM_CUPON_VIG"));
        result.setVteDiaVenta((String) objectData.getData("VTE_DIA_VENTA"));
        result.setVteSecDiaVta((BigDecimal) objectData.getData("VTE_SEC_DIA_VTA"));
        result.setVteFolioOperCpa((BigDecimal) objectData.getData("VTE_FOLIO_OPER_CPA"));
        result.setVteNumCustodio((BigDecimal) objectData.getData("VTE_NUM_CUSTODIO"));
        result.setVteNumMoneda((BigDecimal) objectData.getData("VTE_NUM_MONEDA"));
        result.setVteImpPrecEmis((BigDecimal) objectData.getData("VTE_IMP_PREC_EMIS"));
        result.setVteImpPrecProA((BigDecimal) objectData.getData("VTE_IMP_PREC_PRO_A"));
        result.setVteImpVenta((BigDecimal) objectData.getData("VTE_IMP_VENTA"));
        result.setVteNumTitVta((BigDecimal) objectData.getData("VTE_NUM_TIT_VTA"));
        result.setVteAnoAltaReg((BigDecimal) objectData.getData("VTE_ANO_ALTA_REG"));
        result.setVteMesAltaReg((BigDecimal) objectData.getData("VTE_MES_ALTA_REG"));
        result.setVteDiaAltaReg((BigDecimal) objectData.getData("VTE_DIA_ALTA_REG"));
        result.setVteAnoUltMod((BigDecimal) objectData.getData("VTE_ANO_ULT_MOD"));
        result.setVteMesUltMod((BigDecimal) objectData.getData("VTE_MES_ULT_MOD"));
        result.setVteDiaUltMod((BigDecimal) objectData.getData("VTE_DIA_ULT_MOD"));
        result.setVteCveStVentem((String) objectData.getData("VTE_CVE_ST_VENTEM"));

        return result;

    }

}
