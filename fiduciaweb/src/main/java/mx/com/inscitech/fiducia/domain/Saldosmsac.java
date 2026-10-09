package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class Saldosmsac extends DomainObject {

    BigDecimal salNumCtam = null;
    BigDecimal salNumScta = null;
    BigDecimal salNumSscta = null;
    BigDecimal salNumSsscta = null;
    BigDecimal salNumSssscta = null;
    BigDecimal salNumSsssscta = null;
    BigDecimal salNumAux1 = null;
    BigDecimal salNumAux2 = null;
    BigDecimal salNumAux3 = null;
    BigDecimal salSaldoIniPer = null;
    BigDecimal salCargosPer = null;
    BigDecimal salAbonosPer = null;
    BigDecimal salImpIniEje = null;
    BigDecimal salImpCarEjer = null;
    BigDecimal salImpAboEjer = null;
    BigDecimal salImpSaldoAct = null;
    String salFecUltMovto = null;
    BigDecimal salMovtosCarPer = null;
    BigDecimal salMovtosAboPer = null;
    BigDecimal salMovtosCarEje = null;
    BigDecimal salMovtosAboEje = null;
    BigDecimal salAnoAltaReg = null;
    BigDecimal salMesAltaReg = null;
    BigDecimal salDiaAltaReg = null;
    BigDecimal salAnoUltMod = null;
    BigDecimal salMesUltMod = null;
    BigDecimal salDiaUltMod = null;
    String salCveStSaldo = null;

    public Saldosmsac() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumCtam(BigDecimal salNumCtam) {
        this.salNumCtam = salNumCtam;
    }

    public BigDecimal getSalNumCtam() {
        return this.salNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumScta(BigDecimal salNumScta) {
        this.salNumScta = salNumScta;
    }

    public BigDecimal getSalNumScta() {
        return this.salNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumSscta(BigDecimal salNumSscta) {
        this.salNumSscta = salNumSscta;
    }

    public BigDecimal getSalNumSscta() {
        return this.salNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumSsscta(BigDecimal salNumSsscta) {
        this.salNumSsscta = salNumSsscta;
    }

    public BigDecimal getSalNumSsscta() {
        return this.salNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumSssscta(BigDecimal salNumSssscta) {
        this.salNumSssscta = salNumSssscta;
    }

    public BigDecimal getSalNumSssscta() {
        return this.salNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumSsssscta(BigDecimal salNumSsssscta) {
        this.salNumSsssscta = salNumSsssscta;
    }

    public BigDecimal getSalNumSsssscta() {
        return this.salNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumAux1(BigDecimal salNumAux1) {
        this.salNumAux1 = salNumAux1;
    }

    public BigDecimal getSalNumAux1() {
        return this.salNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumAux2(BigDecimal salNumAux2) {
        this.salNumAux2 = salNumAux2;
    }

    public BigDecimal getSalNumAux2() {
        return this.salNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 11, scale = 0, javaClass = BigDecimal.class)
    public void setSalNumAux3(BigDecimal salNumAux3) {
        this.salNumAux3 = salNumAux3;
    }

    public BigDecimal getSalNumAux3() {
        return this.salNumAux3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSalSaldoIniPer(BigDecimal salSaldoIniPer) {
        this.salSaldoIniPer = salSaldoIniPer;
    }

    public BigDecimal getSalSaldoIniPer() {
        return this.salSaldoIniPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSalCargosPer(BigDecimal salCargosPer) {
        this.salCargosPer = salCargosPer;
    }

    public BigDecimal getSalCargosPer() {
        return this.salCargosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSalAbonosPer(BigDecimal salAbonosPer) {
        this.salAbonosPer = salAbonosPer;
    }

    public BigDecimal getSalAbonosPer() {
        return this.salAbonosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSalImpIniEje(BigDecimal salImpIniEje) {
        this.salImpIniEje = salImpIniEje;
    }

    public BigDecimal getSalImpIniEje() {
        return this.salImpIniEje;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSalImpCarEjer(BigDecimal salImpCarEjer) {
        this.salImpCarEjer = salImpCarEjer;
    }

    public BigDecimal getSalImpCarEjer() {
        return this.salImpCarEjer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSalImpAboEjer(BigDecimal salImpAboEjer) {
        this.salImpAboEjer = salImpAboEjer;
    }

    public BigDecimal getSalImpAboEjer() {
        return this.salImpAboEjer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSalImpSaldoAct(BigDecimal salImpSaldoAct) {
        this.salImpSaldoAct = salImpSaldoAct;
    }

    public BigDecimal getSalImpSaldoAct() {
        return this.salImpSaldoAct;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setSalFecUltMovto(String salFecUltMovto) {
        this.salFecUltMovto = salFecUltMovto;
    }

    public String getSalFecUltMovto() {
        return this.salFecUltMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalMovtosCarPer(BigDecimal salMovtosCarPer) {
        this.salMovtosCarPer = salMovtosCarPer;
    }

    public BigDecimal getSalMovtosCarPer() {
        return this.salMovtosCarPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalMovtosAboPer(BigDecimal salMovtosAboPer) {
        this.salMovtosAboPer = salMovtosAboPer;
    }

    public BigDecimal getSalMovtosAboPer() {
        return this.salMovtosAboPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalMovtosCarEje(BigDecimal salMovtosCarEje) {
        this.salMovtosCarEje = salMovtosCarEje;
    }

    public BigDecimal getSalMovtosCarEje() {
        return this.salMovtosCarEje;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setSalMovtosAboEje(BigDecimal salMovtosAboEje) {
        this.salMovtosAboEje = salMovtosAboEje;
    }

    public BigDecimal getSalMovtosAboEje() {
        return this.salMovtosAboEje;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSalAnoAltaReg(BigDecimal salAnoAltaReg) {
        this.salAnoAltaReg = salAnoAltaReg;
    }

    public BigDecimal getSalAnoAltaReg() {
        return this.salAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSalMesAltaReg(BigDecimal salMesAltaReg) {
        this.salMesAltaReg = salMesAltaReg;
    }

    public BigDecimal getSalMesAltaReg() {
        return this.salMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSalDiaAltaReg(BigDecimal salDiaAltaReg) {
        this.salDiaAltaReg = salDiaAltaReg;
    }

    public BigDecimal getSalDiaAltaReg() {
        return this.salDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setSalAnoUltMod(BigDecimal salAnoUltMod) {
        this.salAnoUltMod = salAnoUltMod;
    }

    public BigDecimal getSalAnoUltMod() {
        return this.salAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSalMesUltMod(BigDecimal salMesUltMod) {
        this.salMesUltMod = salMesUltMod;
    }

    public BigDecimal getSalMesUltMod() {
        return this.salMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setSalDiaUltMod(BigDecimal salDiaUltMod) {
        this.salDiaUltMod = salDiaUltMod;
    }

    public BigDecimal getSalDiaUltMod() {
        return this.salDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setSalCveStSaldo(String salCveStSaldo) {
        this.salCveStSaldo = salCveStSaldo;
    }

    public String getSalCveStSaldo() {
        return this.salCveStSaldo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM SALDOSMSAC ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM SALDOSMSAC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getSalNumCtam() != null && this.getSalNumCtam().longValue() == -999) {
            conditions += " AND SAL_NUM_CTAM IS NULL";
        } else if (this.getSalNumCtam() != null) {
            conditions += " AND SAL_NUM_CTAM = ?";
            values.add(this.getSalNumCtam());
        }

        if (this.getSalNumScta() != null && this.getSalNumScta().longValue() == -999) {
            conditions += " AND SAL_NUM_SCTA IS NULL";
        } else if (this.getSalNumScta() != null) {
            conditions += " AND SAL_NUM_SCTA = ?";
            values.add(this.getSalNumScta());
        }

        if (this.getSalNumSscta() != null && this.getSalNumSscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSCTA IS NULL";
        } else if (this.getSalNumSscta() != null) {
            conditions += " AND SAL_NUM_SSCTA = ?";
            values.add(this.getSalNumSscta());
        }

        if (this.getSalNumSsscta() != null && this.getSalNumSsscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSSCTA IS NULL";
        } else if (this.getSalNumSsscta() != null) {
            conditions += " AND SAL_NUM_SSSCTA = ?";
            values.add(this.getSalNumSsscta());
        }

        if (this.getSalNumSssscta() != null && this.getSalNumSssscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSSSCTA IS NULL";
        } else if (this.getSalNumSssscta() != null) {
            conditions += " AND SAL_NUM_SSSSCTA = ?";
            values.add(this.getSalNumSssscta());
        }

        if (this.getSalNumSsssscta() != null && this.getSalNumSsssscta().longValue() == -999) {
            conditions += " AND SAL_NUM_SSSSSCTA IS NULL";
        } else if (this.getSalNumSsssscta() != null) {
            conditions += " AND SAL_NUM_SSSSSCTA = ?";
            values.add(this.getSalNumSsssscta());
        }

        if (this.getSalNumAux1() != null && this.getSalNumAux1().longValue() == -999) {
            conditions += " AND SAL_NUM_AUX1 IS NULL";
        } else if (this.getSalNumAux1() != null) {
            conditions += " AND SAL_NUM_AUX1 = ?";
            values.add(this.getSalNumAux1());
        }

        if (this.getSalNumAux2() != null && this.getSalNumAux2().longValue() == -999) {
            conditions += " AND SAL_NUM_AUX2 IS NULL";
        } else if (this.getSalNumAux2() != null) {
            conditions += " AND SAL_NUM_AUX2 = ?";
            values.add(this.getSalNumAux2());
        }

        if (this.getSalNumAux3() != null && this.getSalNumAux3().longValue() == -999) {
            conditions += " AND SAL_NUM_AUX3 IS NULL";
        } else if (this.getSalNumAux3() != null) {
            conditions += " AND SAL_NUM_AUX3 = ?";
            values.add(this.getSalNumAux3());
        }

        if (this.getSalSaldoIniPer() != null && this.getSalSaldoIniPer().longValue() == -999) {
            conditions += " AND SAL_SALDO_INI_PER IS NULL";
        } else if (this.getSalSaldoIniPer() != null) {
            conditions += " AND SAL_SALDO_INI_PER = ?";
            values.add(this.getSalSaldoIniPer());
        }

        if (this.getSalCargosPer() != null && this.getSalCargosPer().longValue() == -999) {
            conditions += " AND SAL_CARGOS_PER IS NULL";
        } else if (this.getSalCargosPer() != null) {
            conditions += " AND SAL_CARGOS_PER = ?";
            values.add(this.getSalCargosPer());
        }

        if (this.getSalAbonosPer() != null && this.getSalAbonosPer().longValue() == -999) {
            conditions += " AND SAL_ABONOS_PER IS NULL";
        } else if (this.getSalAbonosPer() != null) {
            conditions += " AND SAL_ABONOS_PER = ?";
            values.add(this.getSalAbonosPer());
        }

        if (this.getSalImpIniEje() != null && this.getSalImpIniEje().longValue() == -999) {
            conditions += " AND SAL_IMP_INI_EJE IS NULL";
        } else if (this.getSalImpIniEje() != null) {
            conditions += " AND SAL_IMP_INI_EJE = ?";
            values.add(this.getSalImpIniEje());
        }

        if (this.getSalImpCarEjer() != null && this.getSalImpCarEjer().longValue() == -999) {
            conditions += " AND SAL_IMP_CAR_EJER IS NULL";
        } else if (this.getSalImpCarEjer() != null) {
            conditions += " AND SAL_IMP_CAR_EJER = ?";
            values.add(this.getSalImpCarEjer());
        }

        if (this.getSalImpAboEjer() != null && this.getSalImpAboEjer().longValue() == -999) {
            conditions += " AND SAL_IMP_ABO_EJER IS NULL";
        } else if (this.getSalImpAboEjer() != null) {
            conditions += " AND SAL_IMP_ABO_EJER = ?";
            values.add(this.getSalImpAboEjer());
        }

        if (this.getSalImpSaldoAct() != null && this.getSalImpSaldoAct().longValue() == -999) {
            conditions += " AND SAL_IMP_SALDO_ACT IS NULL";
        } else if (this.getSalImpSaldoAct() != null) {
            conditions += " AND SAL_IMP_SALDO_ACT = ?";
            values.add(this.getSalImpSaldoAct());
        }

        if (this.getSalFecUltMovto() != null && "null".equals(this.getSalFecUltMovto())) {
            conditions += " AND SAL_FEC_ULT_MOVTO IS NULL";
        } else if (this.getSalFecUltMovto() != null) {
            conditions += " AND SAL_FEC_ULT_MOVTO = ?";
            values.add(this.getSalFecUltMovto());
        }

        if (this.getSalMovtosCarPer() != null && this.getSalMovtosCarPer().longValue() == -999) {
            conditions += " AND SAL_MOVTOS_CAR_PER IS NULL";
        } else if (this.getSalMovtosCarPer() != null) {
            conditions += " AND SAL_MOVTOS_CAR_PER = ?";
            values.add(this.getSalMovtosCarPer());
        }

        if (this.getSalMovtosAboPer() != null && this.getSalMovtosAboPer().longValue() == -999) {
            conditions += " AND SAL_MOVTOS_ABO_PER IS NULL";
        } else if (this.getSalMovtosAboPer() != null) {
            conditions += " AND SAL_MOVTOS_ABO_PER = ?";
            values.add(this.getSalMovtosAboPer());
        }

        if (this.getSalMovtosCarEje() != null && this.getSalMovtosCarEje().longValue() == -999) {
            conditions += " AND SAL_MOVTOS_CAR_EJE IS NULL";
        } else if (this.getSalMovtosCarEje() != null) {
            conditions += " AND SAL_MOVTOS_CAR_EJE = ?";
            values.add(this.getSalMovtosCarEje());
        }

        if (this.getSalMovtosAboEje() != null && this.getSalMovtosAboEje().longValue() == -999) {
            conditions += " AND SAL_MOVTOS_ABO_EJE IS NULL";
        } else if (this.getSalMovtosAboEje() != null) {
            conditions += " AND SAL_MOVTOS_ABO_EJE = ?";
            values.add(this.getSalMovtosAboEje());
        }

        if (this.getSalAnoAltaReg() != null && this.getSalAnoAltaReg().longValue() == -999) {
            conditions += " AND SAL_ANO_ALTA_REG IS NULL";
        } else if (this.getSalAnoAltaReg() != null) {
            conditions += " AND SAL_ANO_ALTA_REG = ?";
            values.add(this.getSalAnoAltaReg());
        }

        if (this.getSalMesAltaReg() != null && this.getSalMesAltaReg().longValue() == -999) {
            conditions += " AND SAL_MES_ALTA_REG IS NULL";
        } else if (this.getSalMesAltaReg() != null) {
            conditions += " AND SAL_MES_ALTA_REG = ?";
            values.add(this.getSalMesAltaReg());
        }

        if (this.getSalDiaAltaReg() != null && this.getSalDiaAltaReg().longValue() == -999) {
            conditions += " AND SAL_DIA_ALTA_REG IS NULL";
        } else if (this.getSalDiaAltaReg() != null) {
            conditions += " AND SAL_DIA_ALTA_REG = ?";
            values.add(this.getSalDiaAltaReg());
        }

        if (this.getSalAnoUltMod() != null && this.getSalAnoUltMod().longValue() == -999) {
            conditions += " AND SAL_ANO_ULT_MOD IS NULL";
        } else if (this.getSalAnoUltMod() != null) {
            conditions += " AND SAL_ANO_ULT_MOD = ?";
            values.add(this.getSalAnoUltMod());
        }

        if (this.getSalMesUltMod() != null && this.getSalMesUltMod().longValue() == -999) {
            conditions += " AND SAL_MES_ULT_MOD IS NULL";
        } else if (this.getSalMesUltMod() != null) {
            conditions += " AND SAL_MES_ULT_MOD = ?";
            values.add(this.getSalMesUltMod());
        }

        if (this.getSalDiaUltMod() != null && this.getSalDiaUltMod().longValue() == -999) {
            conditions += " AND SAL_DIA_ULT_MOD IS NULL";
        } else if (this.getSalDiaUltMod() != null) {
            conditions += " AND SAL_DIA_ULT_MOD = ?";
            values.add(this.getSalDiaUltMod());
        }

        if (this.getSalCveStSaldo() != null && "null".equals(this.getSalCveStSaldo())) {
            conditions += " AND SAL_CVE_ST_SALDO IS NULL";
        } else if (this.getSalCveStSaldo() != null) {
            conditions += " AND SAL_CVE_ST_SALDO = ?";
            values.add(this.getSalCveStSaldo());
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
        String sql = "UPDATE SALDOSMSAC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " SAL_NUM_CTAM = ?, ";
        values.add(this.getSalNumCtam());
        fields += " SAL_NUM_SCTA = ?, ";
        values.add(this.getSalNumScta());
        fields += " SAL_NUM_SSCTA = ?, ";
        values.add(this.getSalNumSscta());
        fields += " SAL_NUM_SSSCTA = ?, ";
        values.add(this.getSalNumSsscta());
        fields += " SAL_NUM_SSSSCTA = ?, ";
        values.add(this.getSalNumSssscta());
        fields += " SAL_NUM_SSSSSCTA = ?, ";
        values.add(this.getSalNumSsssscta());
        fields += " SAL_NUM_AUX1 = ?, ";
        values.add(this.getSalNumAux1());
        fields += " SAL_NUM_AUX2 = ?, ";
        values.add(this.getSalNumAux2());
        fields += " SAL_NUM_AUX3 = ?, ";
        values.add(this.getSalNumAux3());
        fields += " SAL_SALDO_INI_PER = ?, ";
        values.add(this.getSalSaldoIniPer());
        fields += " SAL_CARGOS_PER = ?, ";
        values.add(this.getSalCargosPer());
        fields += " SAL_ABONOS_PER = ?, ";
        values.add(this.getSalAbonosPer());
        fields += " SAL_IMP_INI_EJE = ?, ";
        values.add(this.getSalImpIniEje());
        fields += " SAL_IMP_CAR_EJER = ?, ";
        values.add(this.getSalImpCarEjer());
        fields += " SAL_IMP_ABO_EJER = ?, ";
        values.add(this.getSalImpAboEjer());
        fields += " SAL_IMP_SALDO_ACT = ?, ";
        values.add(this.getSalImpSaldoAct());
        fields += " SAL_FEC_ULT_MOVTO = ?, ";
        values.add(this.getSalFecUltMovto());
        fields += " SAL_MOVTOS_CAR_PER = ?, ";
        values.add(this.getSalMovtosCarPer());
        fields += " SAL_MOVTOS_ABO_PER = ?, ";
        values.add(this.getSalMovtosAboPer());
        fields += " SAL_MOVTOS_CAR_EJE = ?, ";
        values.add(this.getSalMovtosCarEje());
        fields += " SAL_MOVTOS_ABO_EJE = ?, ";
        values.add(this.getSalMovtosAboEje());
        fields += " SAL_ANO_ALTA_REG = ?, ";
        values.add(this.getSalAnoAltaReg());
        fields += " SAL_MES_ALTA_REG = ?, ";
        values.add(this.getSalMesAltaReg());
        fields += " SAL_DIA_ALTA_REG = ?, ";
        values.add(this.getSalDiaAltaReg());
        fields += " SAL_ANO_ULT_MOD = ?, ";
        values.add(this.getSalAnoUltMod());
        fields += " SAL_MES_ULT_MOD = ?, ";
        values.add(this.getSalMesUltMod());
        fields += " SAL_DIA_ULT_MOD = ?, ";
        values.add(this.getSalDiaUltMod());
        fields += " SAL_CVE_ST_SALDO = ?, ";
        values.add(this.getSalCveStSaldo());
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
        String sql = "INSERT INTO SALDOSMSAC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", SAL_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getSalNumCtam());

        fields += ", SAL_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getSalNumScta());

        fields += ", SAL_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getSalNumSscta());

        fields += ", SAL_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getSalNumSsscta());

        fields += ", SAL_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getSalNumSssscta());

        fields += ", SAL_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getSalNumSsssscta());

        fields += ", SAL_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getSalNumAux1());

        fields += ", SAL_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getSalNumAux2());

        fields += ", SAL_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getSalNumAux3());

        fields += ", SAL_SALDO_INI_PER";
        fieldValues += ", ?";
        values.add(this.getSalSaldoIniPer());

        fields += ", SAL_CARGOS_PER";
        fieldValues += ", ?";
        values.add(this.getSalCargosPer());

        fields += ", SAL_ABONOS_PER";
        fieldValues += ", ?";
        values.add(this.getSalAbonosPer());

        fields += ", SAL_IMP_INI_EJE";
        fieldValues += ", ?";
        values.add(this.getSalImpIniEje());

        fields += ", SAL_IMP_CAR_EJER";
        fieldValues += ", ?";
        values.add(this.getSalImpCarEjer());

        fields += ", SAL_IMP_ABO_EJER";
        fieldValues += ", ?";
        values.add(this.getSalImpAboEjer());

        fields += ", SAL_IMP_SALDO_ACT";
        fieldValues += ", ?";
        values.add(this.getSalImpSaldoAct());

        fields += ", SAL_FEC_ULT_MOVTO";
        fieldValues += ", ?";
        values.add(this.getSalFecUltMovto());

        fields += ", SAL_MOVTOS_CAR_PER";
        fieldValues += ", ?";
        values.add(this.getSalMovtosCarPer());

        fields += ", SAL_MOVTOS_ABO_PER";
        fieldValues += ", ?";
        values.add(this.getSalMovtosAboPer());

        fields += ", SAL_MOVTOS_CAR_EJE";
        fieldValues += ", ?";
        values.add(this.getSalMovtosCarEje());

        fields += ", SAL_MOVTOS_ABO_EJE";
        fieldValues += ", ?";
        values.add(this.getSalMovtosAboEje());

        fields += ", SAL_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSalAnoAltaReg());

        fields += ", SAL_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSalMesAltaReg());

        fields += ", SAL_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getSalDiaAltaReg());

        fields += ", SAL_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSalAnoUltMod());

        fields += ", SAL_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSalMesUltMod());

        fields += ", SAL_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getSalDiaUltMod());

        fields += ", SAL_CVE_ST_SALDO";
        fieldValues += ", ?";
        values.add(this.getSalCveStSaldo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM SALDOSMSAC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Saldosmsac instance = (Saldosmsac) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getSalNumCtam().equals(instance.getSalNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumScta().equals(instance.getSalNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumSscta().equals(instance.getSalNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumSsscta().equals(instance.getSalNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumSssscta().equals(instance.getSalNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumSsssscta().equals(instance.getSalNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumAux1().equals(instance.getSalNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumAux2().equals(instance.getSalNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getSalNumAux3().equals(instance.getSalNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getSalSaldoIniPer().equals(instance.getSalSaldoIniPer()))
            equalObjects = false;
        if (equalObjects && !this.getSalCargosPer().equals(instance.getSalCargosPer()))
            equalObjects = false;
        if (equalObjects && !this.getSalAbonosPer().equals(instance.getSalAbonosPer()))
            equalObjects = false;
        if (equalObjects && !this.getSalImpIniEje().equals(instance.getSalImpIniEje()))
            equalObjects = false;
        if (equalObjects && !this.getSalImpCarEjer().equals(instance.getSalImpCarEjer()))
            equalObjects = false;
        if (equalObjects && !this.getSalImpAboEjer().equals(instance.getSalImpAboEjer()))
            equalObjects = false;
        if (equalObjects && !this.getSalImpSaldoAct().equals(instance.getSalImpSaldoAct()))
            equalObjects = false;
        if (equalObjects && !this.getSalFecUltMovto().equals(instance.getSalFecUltMovto()))
            equalObjects = false;
        if (equalObjects && !this.getSalMovtosCarPer().equals(instance.getSalMovtosCarPer()))
            equalObjects = false;
        if (equalObjects && !this.getSalMovtosAboPer().equals(instance.getSalMovtosAboPer()))
            equalObjects = false;
        if (equalObjects && !this.getSalMovtosCarEje().equals(instance.getSalMovtosCarEje()))
            equalObjects = false;
        if (equalObjects && !this.getSalMovtosAboEje().equals(instance.getSalMovtosAboEje()))
            equalObjects = false;
        if (equalObjects && !this.getSalAnoAltaReg().equals(instance.getSalAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSalMesAltaReg().equals(instance.getSalMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSalDiaAltaReg().equals(instance.getSalDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getSalAnoUltMod().equals(instance.getSalAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSalMesUltMod().equals(instance.getSalMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSalDiaUltMod().equals(instance.getSalDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getSalCveStSaldo().equals(instance.getSalCveStSaldo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Saldosmsac result = new Saldosmsac();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setSalNumCtam((BigDecimal) objectData.getData("SAL_NUM_CTAM"));
        result.setSalNumScta((BigDecimal) objectData.getData("SAL_NUM_SCTA"));
        result.setSalNumSscta((BigDecimal) objectData.getData("SAL_NUM_SSCTA"));
        result.setSalNumSsscta((BigDecimal) objectData.getData("SAL_NUM_SSSCTA"));
        result.setSalNumSssscta((BigDecimal) objectData.getData("SAL_NUM_SSSSCTA"));
        result.setSalNumSsssscta((BigDecimal) objectData.getData("SAL_NUM_SSSSSCTA"));
        result.setSalNumAux1((BigDecimal) objectData.getData("SAL_NUM_AUX1"));
        result.setSalNumAux2((BigDecimal) objectData.getData("SAL_NUM_AUX2"));
        result.setSalNumAux3((BigDecimal) objectData.getData("SAL_NUM_AUX3"));
        result.setSalSaldoIniPer((BigDecimal) objectData.getData("SAL_SALDO_INI_PER"));
        result.setSalCargosPer((BigDecimal) objectData.getData("SAL_CARGOS_PER"));
        result.setSalAbonosPer((BigDecimal) objectData.getData("SAL_ABONOS_PER"));
        result.setSalImpIniEje((BigDecimal) objectData.getData("SAL_IMP_INI_EJE"));
        result.setSalImpCarEjer((BigDecimal) objectData.getData("SAL_IMP_CAR_EJER"));
        result.setSalImpAboEjer((BigDecimal) objectData.getData("SAL_IMP_ABO_EJER"));
        result.setSalImpSaldoAct((BigDecimal) objectData.getData("SAL_IMP_SALDO_ACT"));
        result.setSalFecUltMovto((String) objectData.getData("SAL_FEC_ULT_MOVTO"));
        result.setSalMovtosCarPer((BigDecimal) objectData.getData("SAL_MOVTOS_CAR_PER"));
        result.setSalMovtosAboPer((BigDecimal) objectData.getData("SAL_MOVTOS_ABO_PER"));
        result.setSalMovtosCarEje((BigDecimal) objectData.getData("SAL_MOVTOS_CAR_EJE"));
        result.setSalMovtosAboEje((BigDecimal) objectData.getData("SAL_MOVTOS_ABO_EJE"));
        result.setSalAnoAltaReg((BigDecimal) objectData.getData("SAL_ANO_ALTA_REG"));
        result.setSalMesAltaReg((BigDecimal) objectData.getData("SAL_MES_ALTA_REG"));
        result.setSalDiaAltaReg((BigDecimal) objectData.getData("SAL_DIA_ALTA_REG"));
        result.setSalAnoUltMod((BigDecimal) objectData.getData("SAL_ANO_ULT_MOD"));
        result.setSalMesUltMod((BigDecimal) objectData.getData("SAL_MES_ULT_MOD"));
        result.setSalDiaUltMod((BigDecimal) objectData.getData("SAL_DIA_ULT_MOD"));
        result.setSalCveStSaldo((String) objectData.getData("SAL_CVE_ST_SALDO"));

        return result;

    }

}
