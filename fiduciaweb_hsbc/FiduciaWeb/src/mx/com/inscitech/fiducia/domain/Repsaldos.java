package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REPSALDOS_PK",
            columns = { "REP_NUM_AUX1", "REP_NUM_CTAM", "REP_NUM_SCTA", "REP_NUM_SSCTA", "REP_NUM_SSSCTA", "REP_NUM_SSSSCTA", "REP_NUM_SSSSSCTA", "REP_NUM_AUX2", "REP_NUM_AUX3"
    }, sequences = { "MANUAL" })
public class Repsaldos extends DomainObject {

    BigDecimal repNumCtam = null;
    BigDecimal repNumScta = null;
    BigDecimal repNumSscta = null;
    BigDecimal repNumSsscta = null;
    BigDecimal repNumSssscta = null;
    BigDecimal repNumSsssscta = null;
    BigDecimal repNumAux1 = null;
    BigDecimal repNumAux2 = null;
    BigDecimal repNumAux3 = null;
    BigDecimal repSaldoIniPer = null;
    BigDecimal repCargosPer = null;
    BigDecimal repAbonosPer = null;
    BigDecimal repImpSaldoAct = null;
    BigDecimal repCveAcreedora = null;
    BigDecimal repCveDeudora = null;
    BigDecimal repNumcAux2 = null;
    BigDecimal repNumcAux3 = null;
    String repNomContrato = null;
    String repNombre = null;

    public Repsaldos() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumCtam(BigDecimal repNumCtam) {
        this.repNumCtam = repNumCtam;
    }

    public BigDecimal getRepNumCtam() {
        return this.repNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumScta(BigDecimal repNumScta) {
        this.repNumScta = repNumScta;
    }

    public BigDecimal getRepNumScta() {
        return this.repNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumSscta(BigDecimal repNumSscta) {
        this.repNumSscta = repNumSscta;
    }

    public BigDecimal getRepNumSscta() {
        return this.repNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumSsscta(BigDecimal repNumSsscta) {
        this.repNumSsscta = repNumSsscta;
    }

    public BigDecimal getRepNumSsscta() {
        return this.repNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumSssscta(BigDecimal repNumSssscta) {
        this.repNumSssscta = repNumSssscta;
    }

    public BigDecimal getRepNumSssscta() {
        return this.repNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumSsssscta(BigDecimal repNumSsssscta) {
        this.repNumSsssscta = repNumSsssscta;
    }

    public BigDecimal getRepNumSsssscta() {
        return this.repNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumAux1(BigDecimal repNumAux1) {
        this.repNumAux1 = repNumAux1;
    }

    public BigDecimal getRepNumAux1() {
        return this.repNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumAux2(BigDecimal repNumAux2) {
        this.repNumAux2 = repNumAux2;
    }

    public BigDecimal getRepNumAux2() {
        return this.repNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumAux3(BigDecimal repNumAux3) {
        this.repNumAux3 = repNumAux3;
    }

    public BigDecimal getRepNumAux3() {
        return this.repNumAux3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRepSaldoIniPer(BigDecimal repSaldoIniPer) {
        this.repSaldoIniPer = repSaldoIniPer;
    }

    public BigDecimal getRepSaldoIniPer() {
        return this.repSaldoIniPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRepCargosPer(BigDecimal repCargosPer) {
        this.repCargosPer = repCargosPer;
    }

    public BigDecimal getRepCargosPer() {
        return this.repCargosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRepAbonosPer(BigDecimal repAbonosPer) {
        this.repAbonosPer = repAbonosPer;
    }

    public BigDecimal getRepAbonosPer() {
        return this.repAbonosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setRepImpSaldoAct(BigDecimal repImpSaldoAct) {
        this.repImpSaldoAct = repImpSaldoAct;
    }

    public BigDecimal getRepImpSaldoAct() {
        return this.repImpSaldoAct;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepCveAcreedora(BigDecimal repCveAcreedora) {
        this.repCveAcreedora = repCveAcreedora;
    }

    public BigDecimal getRepCveAcreedora() {
        return this.repCveAcreedora;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepCveDeudora(BigDecimal repCveDeudora) {
        this.repCveDeudora = repCveDeudora;
    }

    public BigDecimal getRepCveDeudora() {
        return this.repCveDeudora;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumcAux2(BigDecimal repNumcAux2) {
        this.repNumcAux2 = repNumcAux2;
    }

    public BigDecimal getRepNumcAux2() {
        return this.repNumcAux2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRepNumcAux3(BigDecimal repNumcAux3) {
        this.repNumcAux3 = repNumcAux3;
    }

    public BigDecimal getRepNumcAux3() {
        return this.repNumcAux3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepNomContrato(String repNomContrato) {
        this.repNomContrato = repNomContrato;
    }

    public String getRepNomContrato() {
        return this.repNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRepNombre(String repNombre) {
        this.repNombre = repNombre;
    }

    public String getRepNombre() {
        return this.repNombre;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REPSALDOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRepNumCtam() != null && this.getRepNumCtam().longValue() == -999) {
            conditions += " AND REP_NUM_CTAM IS NULL";
        } else if (this.getRepNumCtam() != null) {
            conditions += " AND REP_NUM_CTAM = ?";
            values.add(this.getRepNumCtam());
        }

        if (this.getRepNumScta() != null && this.getRepNumScta().longValue() == -999) {
            conditions += " AND REP_NUM_SCTA IS NULL";
        } else if (this.getRepNumScta() != null) {
            conditions += " AND REP_NUM_SCTA = ?";
            values.add(this.getRepNumScta());
        }

        if (this.getRepNumSscta() != null && this.getRepNumSscta().longValue() == -999) {
            conditions += " AND REP_NUM_SSCTA IS NULL";
        } else if (this.getRepNumSscta() != null) {
            conditions += " AND REP_NUM_SSCTA = ?";
            values.add(this.getRepNumSscta());
        }

        if (this.getRepNumSsscta() != null && this.getRepNumSsscta().longValue() == -999) {
            conditions += " AND REP_NUM_SSSCTA IS NULL";
        } else if (this.getRepNumSsscta() != null) {
            conditions += " AND REP_NUM_SSSCTA = ?";
            values.add(this.getRepNumSsscta());
        }

        if (this.getRepNumSssscta() != null && this.getRepNumSssscta().longValue() == -999) {
            conditions += " AND REP_NUM_SSSSCTA IS NULL";
        } else if (this.getRepNumSssscta() != null) {
            conditions += " AND REP_NUM_SSSSCTA = ?";
            values.add(this.getRepNumSssscta());
        }

        if (this.getRepNumSsssscta() != null && this.getRepNumSsssscta().longValue() == -999) {
            conditions += " AND REP_NUM_SSSSSCTA IS NULL";
        } else if (this.getRepNumSsssscta() != null) {
            conditions += " AND REP_NUM_SSSSSCTA = ?";
            values.add(this.getRepNumSsssscta());
        }

        if (this.getRepNumAux1() != null && this.getRepNumAux1().longValue() == -999) {
            conditions += " AND REP_NUM_AUX1 IS NULL";
        } else if (this.getRepNumAux1() != null) {
            conditions += " AND REP_NUM_AUX1 = ?";
            values.add(this.getRepNumAux1());
        }

        if (this.getRepNumAux2() != null && this.getRepNumAux2().longValue() == -999) {
            conditions += " AND REP_NUM_AUX2 IS NULL";
        } else if (this.getRepNumAux2() != null) {
            conditions += " AND REP_NUM_AUX2 = ?";
            values.add(this.getRepNumAux2());
        }

        if (this.getRepNumAux3() != null && this.getRepNumAux3().longValue() == -999) {
            conditions += " AND REP_NUM_AUX3 IS NULL";
        } else if (this.getRepNumAux3() != null) {
            conditions += " AND REP_NUM_AUX3 = ?";
            values.add(this.getRepNumAux3());
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
        String sql = "SELECT * FROM REPSALDOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRepNumCtam() != null && this.getRepNumCtam().longValue() == -999) {
            conditions += " AND REP_NUM_CTAM IS NULL";
        } else if (this.getRepNumCtam() != null) {
            conditions += " AND REP_NUM_CTAM = ?";
            values.add(this.getRepNumCtam());
        }

        if (this.getRepNumScta() != null && this.getRepNumScta().longValue() == -999) {
            conditions += " AND REP_NUM_SCTA IS NULL";
        } else if (this.getRepNumScta() != null) {
            conditions += " AND REP_NUM_SCTA = ?";
            values.add(this.getRepNumScta());
        }

        if (this.getRepNumSscta() != null && this.getRepNumSscta().longValue() == -999) {
            conditions += " AND REP_NUM_SSCTA IS NULL";
        } else if (this.getRepNumSscta() != null) {
            conditions += " AND REP_NUM_SSCTA = ?";
            values.add(this.getRepNumSscta());
        }

        if (this.getRepNumSsscta() != null && this.getRepNumSsscta().longValue() == -999) {
            conditions += " AND REP_NUM_SSSCTA IS NULL";
        } else if (this.getRepNumSsscta() != null) {
            conditions += " AND REP_NUM_SSSCTA = ?";
            values.add(this.getRepNumSsscta());
        }

        if (this.getRepNumSssscta() != null && this.getRepNumSssscta().longValue() == -999) {
            conditions += " AND REP_NUM_SSSSCTA IS NULL";
        } else if (this.getRepNumSssscta() != null) {
            conditions += " AND REP_NUM_SSSSCTA = ?";
            values.add(this.getRepNumSssscta());
        }

        if (this.getRepNumSsssscta() != null && this.getRepNumSsssscta().longValue() == -999) {
            conditions += " AND REP_NUM_SSSSSCTA IS NULL";
        } else if (this.getRepNumSsssscta() != null) {
            conditions += " AND REP_NUM_SSSSSCTA = ?";
            values.add(this.getRepNumSsssscta());
        }

        if (this.getRepNumAux1() != null && this.getRepNumAux1().longValue() == -999) {
            conditions += " AND REP_NUM_AUX1 IS NULL";
        } else if (this.getRepNumAux1() != null) {
            conditions += " AND REP_NUM_AUX1 = ?";
            values.add(this.getRepNumAux1());
        }

        if (this.getRepNumAux2() != null && this.getRepNumAux2().longValue() == -999) {
            conditions += " AND REP_NUM_AUX2 IS NULL";
        } else if (this.getRepNumAux2() != null) {
            conditions += " AND REP_NUM_AUX2 = ?";
            values.add(this.getRepNumAux2());
        }

        if (this.getRepNumAux3() != null && this.getRepNumAux3().longValue() == -999) {
            conditions += " AND REP_NUM_AUX3 IS NULL";
        } else if (this.getRepNumAux3() != null) {
            conditions += " AND REP_NUM_AUX3 = ?";
            values.add(this.getRepNumAux3());
        }

        if (this.getRepSaldoIniPer() != null && this.getRepSaldoIniPer().longValue() == -999) {
            conditions += " AND REP_SALDO_INI_PER IS NULL";
        } else if (this.getRepSaldoIniPer() != null) {
            conditions += " AND REP_SALDO_INI_PER = ?";
            values.add(this.getRepSaldoIniPer());
        }

        if (this.getRepCargosPer() != null && this.getRepCargosPer().longValue() == -999) {
            conditions += " AND REP_CARGOS_PER IS NULL";
        } else if (this.getRepCargosPer() != null) {
            conditions += " AND REP_CARGOS_PER = ?";
            values.add(this.getRepCargosPer());
        }

        if (this.getRepAbonosPer() != null && this.getRepAbonosPer().longValue() == -999) {
            conditions += " AND REP_ABONOS_PER IS NULL";
        } else if (this.getRepAbonosPer() != null) {
            conditions += " AND REP_ABONOS_PER = ?";
            values.add(this.getRepAbonosPer());
        }

        if (this.getRepImpSaldoAct() != null && this.getRepImpSaldoAct().longValue() == -999) {
            conditions += " AND REP_IMP_SALDO_ACT IS NULL";
        } else if (this.getRepImpSaldoAct() != null) {
            conditions += " AND REP_IMP_SALDO_ACT = ?";
            values.add(this.getRepImpSaldoAct());
        }

        if (this.getRepCveAcreedora() != null && this.getRepCveAcreedora().longValue() == -999) {
            conditions += " AND REP_CVE_ACREEDORA IS NULL";
        } else if (this.getRepCveAcreedora() != null) {
            conditions += " AND REP_CVE_ACREEDORA = ?";
            values.add(this.getRepCveAcreedora());
        }

        if (this.getRepCveDeudora() != null && this.getRepCveDeudora().longValue() == -999) {
            conditions += " AND REP_CVE_DEUDORA IS NULL";
        } else if (this.getRepCveDeudora() != null) {
            conditions += " AND REP_CVE_DEUDORA = ?";
            values.add(this.getRepCveDeudora());
        }

        if (this.getRepNumcAux2() != null && this.getRepNumcAux2().longValue() == -999) {
            conditions += " AND REP_NUMC_AUX2 IS NULL";
        } else if (this.getRepNumcAux2() != null) {
            conditions += " AND REP_NUMC_AUX2 = ?";
            values.add(this.getRepNumcAux2());
        }

        if (this.getRepNumcAux3() != null && this.getRepNumcAux3().longValue() == -999) {
            conditions += " AND REP_NUMC_AUX3 IS NULL";
        } else if (this.getRepNumcAux3() != null) {
            conditions += " AND REP_NUMC_AUX3 = ?";
            values.add(this.getRepNumcAux3());
        }

        if (this.getRepNomContrato() != null && "null".equals(this.getRepNomContrato())) {
            conditions += " AND REP_NOM_CONTRATO IS NULL";
        } else if (this.getRepNomContrato() != null) {
            conditions += " AND REP_NOM_CONTRATO = ?";
            values.add(this.getRepNomContrato());
        }

        if (this.getRepNombre() != null && "null".equals(this.getRepNombre())) {
            conditions += " AND REP_NOMBRE IS NULL";
        } else if (this.getRepNombre() != null) {
            conditions += " AND REP_NOMBRE = ?";
            values.add(this.getRepNombre());
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
        String sql = "UPDATE REPSALDOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REP_NUM_CTAM = ?";
        pkValues.add(this.getRepNumCtam());
        conditions += " AND REP_NUM_SCTA = ?";
        pkValues.add(this.getRepNumScta());
        conditions += " AND REP_NUM_SSCTA = ?";
        pkValues.add(this.getRepNumSscta());
        conditions += " AND REP_NUM_SSSCTA = ?";
        pkValues.add(this.getRepNumSsscta());
        conditions += " AND REP_NUM_SSSSCTA = ?";
        pkValues.add(this.getRepNumSssscta());
        conditions += " AND REP_NUM_SSSSSCTA = ?";
        pkValues.add(this.getRepNumSsssscta());
        conditions += " AND REP_NUM_AUX1 = ?";
        pkValues.add(this.getRepNumAux1());
        conditions += " AND REP_NUM_AUX2 = ?";
        pkValues.add(this.getRepNumAux2());
        conditions += " AND REP_NUM_AUX3 = ?";
        pkValues.add(this.getRepNumAux3());
        fields += " REP_SALDO_INI_PER = ?, ";
        values.add(this.getRepSaldoIniPer());
        fields += " REP_CARGOS_PER = ?, ";
        values.add(this.getRepCargosPer());
        fields += " REP_ABONOS_PER = ?, ";
        values.add(this.getRepAbonosPer());
        fields += " REP_IMP_SALDO_ACT = ?, ";
        values.add(this.getRepImpSaldoAct());
        fields += " REP_CVE_ACREEDORA = ?, ";
        values.add(this.getRepCveAcreedora());
        fields += " REP_CVE_DEUDORA = ?, ";
        values.add(this.getRepCveDeudora());
        fields += " REP_NUMC_AUX2 = ?, ";
        values.add(this.getRepNumcAux2());
        fields += " REP_NUMC_AUX3 = ?, ";
        values.add(this.getRepNumcAux3());
        fields += " REP_NOM_CONTRATO = ?, ";
        values.add(this.getRepNomContrato());
        fields += " REP_NOMBRE = ?, ";
        values.add(this.getRepNombre());
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
        String sql = "INSERT INTO REPSALDOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REP_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getRepNumCtam());

        fields += ", REP_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getRepNumScta());

        fields += ", REP_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getRepNumSscta());

        fields += ", REP_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getRepNumSsscta());

        fields += ", REP_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getRepNumSssscta());

        fields += ", REP_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getRepNumSsssscta());

        fields += ", REP_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getRepNumAux1());

        fields += ", REP_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getRepNumAux2());

        fields += ", REP_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getRepNumAux3());

        fields += ", REP_SALDO_INI_PER";
        fieldValues += ", ?";
        values.add(this.getRepSaldoIniPer());

        fields += ", REP_CARGOS_PER";
        fieldValues += ", ?";
        values.add(this.getRepCargosPer());

        fields += ", REP_ABONOS_PER";
        fieldValues += ", ?";
        values.add(this.getRepAbonosPer());

        fields += ", REP_IMP_SALDO_ACT";
        fieldValues += ", ?";
        values.add(this.getRepImpSaldoAct());

        fields += ", REP_CVE_ACREEDORA";
        fieldValues += ", ?";
        values.add(this.getRepCveAcreedora());

        fields += ", REP_CVE_DEUDORA";
        fieldValues += ", ?";
        values.add(this.getRepCveDeudora());

        fields += ", REP_NUMC_AUX2";
        fieldValues += ", ?";
        values.add(this.getRepNumcAux2());

        fields += ", REP_NUMC_AUX3";
        fieldValues += ", ?";
        values.add(this.getRepNumcAux3());

        fields += ", REP_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRepNomContrato());

        fields += ", REP_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getRepNombre());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REPSALDOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REP_NUM_CTAM = ?";
        values.add(this.getRepNumCtam());
        conditions += " AND REP_NUM_SCTA = ?";
        values.add(this.getRepNumScta());
        conditions += " AND REP_NUM_SSCTA = ?";
        values.add(this.getRepNumSscta());
        conditions += " AND REP_NUM_SSSCTA = ?";
        values.add(this.getRepNumSsscta());
        conditions += " AND REP_NUM_SSSSCTA = ?";
        values.add(this.getRepNumSssscta());
        conditions += " AND REP_NUM_SSSSSCTA = ?";
        values.add(this.getRepNumSsssscta());
        conditions += " AND REP_NUM_AUX1 = ?";
        values.add(this.getRepNumAux1());
        conditions += " AND REP_NUM_AUX2 = ?";
        values.add(this.getRepNumAux2());
        conditions += " AND REP_NUM_AUX3 = ?";
        values.add(this.getRepNumAux3());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Repsaldos instance = (Repsaldos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRepNumCtam().equals(instance.getRepNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getRepNumScta().equals(instance.getRepNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getRepNumSscta().equals(instance.getRepNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getRepNumSsscta().equals(instance.getRepNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getRepNumSssscta().equals(instance.getRepNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getRepNumSsssscta().equals(instance.getRepNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getRepNumAux1().equals(instance.getRepNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getRepNumAux2().equals(instance.getRepNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getRepNumAux3().equals(instance.getRepNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getRepSaldoIniPer().equals(instance.getRepSaldoIniPer()))
            equalObjects = false;
        if (equalObjects && !this.getRepCargosPer().equals(instance.getRepCargosPer()))
            equalObjects = false;
        if (equalObjects && !this.getRepAbonosPer().equals(instance.getRepAbonosPer()))
            equalObjects = false;
        if (equalObjects && !this.getRepImpSaldoAct().equals(instance.getRepImpSaldoAct()))
            equalObjects = false;
        if (equalObjects && !this.getRepCveAcreedora().equals(instance.getRepCveAcreedora()))
            equalObjects = false;
        if (equalObjects && !this.getRepCveDeudora().equals(instance.getRepCveDeudora()))
            equalObjects = false;
        if (equalObjects && !this.getRepNumcAux2().equals(instance.getRepNumcAux2()))
            equalObjects = false;
        if (equalObjects && !this.getRepNumcAux3().equals(instance.getRepNumcAux3()))
            equalObjects = false;
        if (equalObjects && !this.getRepNomContrato().equals(instance.getRepNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRepNombre().equals(instance.getRepNombre()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Repsaldos result = new Repsaldos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRepNumCtam((BigDecimal) objectData.getData("REP_NUM_CTAM"));
        result.setRepNumScta((BigDecimal) objectData.getData("REP_NUM_SCTA"));
        result.setRepNumSscta((BigDecimal) objectData.getData("REP_NUM_SSCTA"));
        result.setRepNumSsscta((BigDecimal) objectData.getData("REP_NUM_SSSCTA"));
        result.setRepNumSssscta((BigDecimal) objectData.getData("REP_NUM_SSSSCTA"));
        result.setRepNumSsssscta((BigDecimal) objectData.getData("REP_NUM_SSSSSCTA"));
        result.setRepNumAux1((BigDecimal) objectData.getData("REP_NUM_AUX1"));
        result.setRepNumAux2((BigDecimal) objectData.getData("REP_NUM_AUX2"));
        result.setRepNumAux3((BigDecimal) objectData.getData("REP_NUM_AUX3"));
        result.setRepSaldoIniPer((BigDecimal) objectData.getData("REP_SALDO_INI_PER"));
        result.setRepCargosPer((BigDecimal) objectData.getData("REP_CARGOS_PER"));
        result.setRepAbonosPer((BigDecimal) objectData.getData("REP_ABONOS_PER"));
        result.setRepImpSaldoAct((BigDecimal) objectData.getData("REP_IMP_SALDO_ACT"));
        result.setRepCveAcreedora((BigDecimal) objectData.getData("REP_CVE_ACREEDORA"));
        result.setRepCveDeudora((BigDecimal) objectData.getData("REP_CVE_DEUDORA"));
        result.setRepNumcAux2((BigDecimal) objectData.getData("REP_NUMC_AUX2"));
        result.setRepNumcAux3((BigDecimal) objectData.getData("REP_NUMC_AUX3"));
        result.setRepNomContrato((String) objectData.getData("REP_NOM_CONTRATO"));
        result.setRepNombre((String) objectData.getData("REP_NOMBRE"));

        return result;

    }

}
