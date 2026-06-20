package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "BALEJE_PK",
            columns = { "EJE_NUM_AUX1", "EJE_NUM_CTAM", "EJE_NUM_SCTA", "EJE_NUM_SSCTA", "EJE_NUM_SSSCTA", "EJE_NUM_SSSSCTA", "EJE_NUM_SSSSSCTA", "EJE_NUM_AUX2", "EJE_NUM_AUX3"
    }, sequences = { "MANUAL" })
public class Baleje extends DomainObject {

    BigDecimal ejeNumCtam = null;
    BigDecimal ejeNumScta = null;
    BigDecimal ejeNumSscta = null;
    BigDecimal ejeNumSsscta = null;
    BigDecimal ejeNumSssscta = null;
    BigDecimal ejeNumSsssscta = null;
    BigDecimal ejeNumAux1 = null;
    BigDecimal ejeNumAux2 = null;
    BigDecimal ejeNumAux3 = null;
    BigDecimal ejeSaldoIniPer = null;
    BigDecimal ejeCargosPer = null;
    BigDecimal ejeAbonosPer = null;
    BigDecimal ejeImpSaldoAct = null;
    BigDecimal ejeCveAcreedora = null;
    BigDecimal ejeCveDeudora = null;
    BigDecimal ejeNumcAux2 = null;
    BigDecimal ejeNumcAux3 = null;
    String ejeNomContrato = null;
    String ejeNombre = null;

    public Baleje() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumCtam(BigDecimal ejeNumCtam) {
        this.ejeNumCtam = ejeNumCtam;
    }

    public BigDecimal getEjeNumCtam() {
        return this.ejeNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumScta(BigDecimal ejeNumScta) {
        this.ejeNumScta = ejeNumScta;
    }

    public BigDecimal getEjeNumScta() {
        return this.ejeNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumSscta(BigDecimal ejeNumSscta) {
        this.ejeNumSscta = ejeNumSscta;
    }

    public BigDecimal getEjeNumSscta() {
        return this.ejeNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumSsscta(BigDecimal ejeNumSsscta) {
        this.ejeNumSsscta = ejeNumSsscta;
    }

    public BigDecimal getEjeNumSsscta() {
        return this.ejeNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumSssscta(BigDecimal ejeNumSssscta) {
        this.ejeNumSssscta = ejeNumSssscta;
    }

    public BigDecimal getEjeNumSssscta() {
        return this.ejeNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumSsssscta(BigDecimal ejeNumSsssscta) {
        this.ejeNumSsssscta = ejeNumSsssscta;
    }

    public BigDecimal getEjeNumSsssscta() {
        return this.ejeNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumAux1(BigDecimal ejeNumAux1) {
        this.ejeNumAux1 = ejeNumAux1;
    }

    public BigDecimal getEjeNumAux1() {
        return this.ejeNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumAux2(BigDecimal ejeNumAux2) {
        this.ejeNumAux2 = ejeNumAux2;
    }

    public BigDecimal getEjeNumAux2() {
        return this.ejeNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumAux3(BigDecimal ejeNumAux3) {
        this.ejeNumAux3 = ejeNumAux3;
    }

    public BigDecimal getEjeNumAux3() {
        return this.ejeNumAux3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEjeSaldoIniPer(BigDecimal ejeSaldoIniPer) {
        this.ejeSaldoIniPer = ejeSaldoIniPer;
    }

    public BigDecimal getEjeSaldoIniPer() {
        return this.ejeSaldoIniPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEjeCargosPer(BigDecimal ejeCargosPer) {
        this.ejeCargosPer = ejeCargosPer;
    }

    public BigDecimal getEjeCargosPer() {
        return this.ejeCargosPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEjeAbonosPer(BigDecimal ejeAbonosPer) {
        this.ejeAbonosPer = ejeAbonosPer;
    }

    public BigDecimal getEjeAbonosPer() {
        return this.ejeAbonosPer;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setEjeImpSaldoAct(BigDecimal ejeImpSaldoAct) {
        this.ejeImpSaldoAct = ejeImpSaldoAct;
    }

    public BigDecimal getEjeImpSaldoAct() {
        return this.ejeImpSaldoAct;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeCveAcreedora(BigDecimal ejeCveAcreedora) {
        this.ejeCveAcreedora = ejeCveAcreedora;
    }

    public BigDecimal getEjeCveAcreedora() {
        return this.ejeCveAcreedora;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeCveDeudora(BigDecimal ejeCveDeudora) {
        this.ejeCveDeudora = ejeCveDeudora;
    }

    public BigDecimal getEjeCveDeudora() {
        return this.ejeCveDeudora;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumcAux2(BigDecimal ejeNumcAux2) {
        this.ejeNumcAux2 = ejeNumcAux2;
    }

    public BigDecimal getEjeNumcAux2() {
        return this.ejeNumcAux2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEjeNumcAux3(BigDecimal ejeNumcAux3) {
        this.ejeNumcAux3 = ejeNumcAux3;
    }

    public BigDecimal getEjeNumcAux3() {
        return this.ejeNumcAux3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNomContrato(String ejeNomContrato) {
        this.ejeNomContrato = ejeNomContrato;
    }

    public String getEjeNomContrato() {
        return this.ejeNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEjeNombre(String ejeNombre) {
        this.ejeNombre = ejeNombre;
    }

    public String getEjeNombre() {
        return this.ejeNombre;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM BALEJE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEjeNumCtam() != null && this.getEjeNumCtam().longValue() == -999) {
            conditions += " AND EJE_NUM_CTAM IS NULL";
        } else if (this.getEjeNumCtam() != null) {
            conditions += " AND EJE_NUM_CTAM = ?";
            values.add(this.getEjeNumCtam());
        }

        if (this.getEjeNumScta() != null && this.getEjeNumScta().longValue() == -999) {
            conditions += " AND EJE_NUM_SCTA IS NULL";
        } else if (this.getEjeNumScta() != null) {
            conditions += " AND EJE_NUM_SCTA = ?";
            values.add(this.getEjeNumScta());
        }

        if (this.getEjeNumSscta() != null && this.getEjeNumSscta().longValue() == -999) {
            conditions += " AND EJE_NUM_SSCTA IS NULL";
        } else if (this.getEjeNumSscta() != null) {
            conditions += " AND EJE_NUM_SSCTA = ?";
            values.add(this.getEjeNumSscta());
        }

        if (this.getEjeNumSsscta() != null && this.getEjeNumSsscta().longValue() == -999) {
            conditions += " AND EJE_NUM_SSSCTA IS NULL";
        } else if (this.getEjeNumSsscta() != null) {
            conditions += " AND EJE_NUM_SSSCTA = ?";
            values.add(this.getEjeNumSsscta());
        }

        if (this.getEjeNumSssscta() != null && this.getEjeNumSssscta().longValue() == -999) {
            conditions += " AND EJE_NUM_SSSSCTA IS NULL";
        } else if (this.getEjeNumSssscta() != null) {
            conditions += " AND EJE_NUM_SSSSCTA = ?";
            values.add(this.getEjeNumSssscta());
        }

        if (this.getEjeNumSsssscta() != null && this.getEjeNumSsssscta().longValue() == -999) {
            conditions += " AND EJE_NUM_SSSSSCTA IS NULL";
        } else if (this.getEjeNumSsssscta() != null) {
            conditions += " AND EJE_NUM_SSSSSCTA = ?";
            values.add(this.getEjeNumSsssscta());
        }

        if (this.getEjeNumAux1() != null && this.getEjeNumAux1().longValue() == -999) {
            conditions += " AND EJE_NUM_AUX1 IS NULL";
        } else if (this.getEjeNumAux1() != null) {
            conditions += " AND EJE_NUM_AUX1 = ?";
            values.add(this.getEjeNumAux1());
        }

        if (this.getEjeNumAux2() != null && this.getEjeNumAux2().longValue() == -999) {
            conditions += " AND EJE_NUM_AUX2 IS NULL";
        } else if (this.getEjeNumAux2() != null) {
            conditions += " AND EJE_NUM_AUX2 = ?";
            values.add(this.getEjeNumAux2());
        }

        if (this.getEjeNumAux3() != null && this.getEjeNumAux3().longValue() == -999) {
            conditions += " AND EJE_NUM_AUX3 IS NULL";
        } else if (this.getEjeNumAux3() != null) {
            conditions += " AND EJE_NUM_AUX3 = ?";
            values.add(this.getEjeNumAux3());
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
        String sql = "SELECT * FROM BALEJE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEjeNumCtam() != null && this.getEjeNumCtam().longValue() == -999) {
            conditions += " AND EJE_NUM_CTAM IS NULL";
        } else if (this.getEjeNumCtam() != null) {
            conditions += " AND EJE_NUM_CTAM = ?";
            values.add(this.getEjeNumCtam());
        }

        if (this.getEjeNumScta() != null && this.getEjeNumScta().longValue() == -999) {
            conditions += " AND EJE_NUM_SCTA IS NULL";
        } else if (this.getEjeNumScta() != null) {
            conditions += " AND EJE_NUM_SCTA = ?";
            values.add(this.getEjeNumScta());
        }

        if (this.getEjeNumSscta() != null && this.getEjeNumSscta().longValue() == -999) {
            conditions += " AND EJE_NUM_SSCTA IS NULL";
        } else if (this.getEjeNumSscta() != null) {
            conditions += " AND EJE_NUM_SSCTA = ?";
            values.add(this.getEjeNumSscta());
        }

        if (this.getEjeNumSsscta() != null && this.getEjeNumSsscta().longValue() == -999) {
            conditions += " AND EJE_NUM_SSSCTA IS NULL";
        } else if (this.getEjeNumSsscta() != null) {
            conditions += " AND EJE_NUM_SSSCTA = ?";
            values.add(this.getEjeNumSsscta());
        }

        if (this.getEjeNumSssscta() != null && this.getEjeNumSssscta().longValue() == -999) {
            conditions += " AND EJE_NUM_SSSSCTA IS NULL";
        } else if (this.getEjeNumSssscta() != null) {
            conditions += " AND EJE_NUM_SSSSCTA = ?";
            values.add(this.getEjeNumSssscta());
        }

        if (this.getEjeNumSsssscta() != null && this.getEjeNumSsssscta().longValue() == -999) {
            conditions += " AND EJE_NUM_SSSSSCTA IS NULL";
        } else if (this.getEjeNumSsssscta() != null) {
            conditions += " AND EJE_NUM_SSSSSCTA = ?";
            values.add(this.getEjeNumSsssscta());
        }

        if (this.getEjeNumAux1() != null && this.getEjeNumAux1().longValue() == -999) {
            conditions += " AND EJE_NUM_AUX1 IS NULL";
        } else if (this.getEjeNumAux1() != null) {
            conditions += " AND EJE_NUM_AUX1 = ?";
            values.add(this.getEjeNumAux1());
        }

        if (this.getEjeNumAux2() != null && this.getEjeNumAux2().longValue() == -999) {
            conditions += " AND EJE_NUM_AUX2 IS NULL";
        } else if (this.getEjeNumAux2() != null) {
            conditions += " AND EJE_NUM_AUX2 = ?";
            values.add(this.getEjeNumAux2());
        }

        if (this.getEjeNumAux3() != null && this.getEjeNumAux3().longValue() == -999) {
            conditions += " AND EJE_NUM_AUX3 IS NULL";
        } else if (this.getEjeNumAux3() != null) {
            conditions += " AND EJE_NUM_AUX3 = ?";
            values.add(this.getEjeNumAux3());
        }

        if (this.getEjeSaldoIniPer() != null && this.getEjeSaldoIniPer().longValue() == -999) {
            conditions += " AND EJE_SALDO_INI_PER IS NULL";
        } else if (this.getEjeSaldoIniPer() != null) {
            conditions += " AND EJE_SALDO_INI_PER = ?";
            values.add(this.getEjeSaldoIniPer());
        }

        if (this.getEjeCargosPer() != null && this.getEjeCargosPer().longValue() == -999) {
            conditions += " AND EJE_CARGOS_PER IS NULL";
        } else if (this.getEjeCargosPer() != null) {
            conditions += " AND EJE_CARGOS_PER = ?";
            values.add(this.getEjeCargosPer());
        }

        if (this.getEjeAbonosPer() != null && this.getEjeAbonosPer().longValue() == -999) {
            conditions += " AND EJE_ABONOS_PER IS NULL";
        } else if (this.getEjeAbonosPer() != null) {
            conditions += " AND EJE_ABONOS_PER = ?";
            values.add(this.getEjeAbonosPer());
        }

        if (this.getEjeImpSaldoAct() != null && this.getEjeImpSaldoAct().longValue() == -999) {
            conditions += " AND EJE_IMP_SALDO_ACT IS NULL";
        } else if (this.getEjeImpSaldoAct() != null) {
            conditions += " AND EJE_IMP_SALDO_ACT = ?";
            values.add(this.getEjeImpSaldoAct());
        }

        if (this.getEjeCveAcreedora() != null && this.getEjeCveAcreedora().longValue() == -999) {
            conditions += " AND EJE_CVE_ACREEDORA IS NULL";
        } else if (this.getEjeCveAcreedora() != null) {
            conditions += " AND EJE_CVE_ACREEDORA = ?";
            values.add(this.getEjeCveAcreedora());
        }

        if (this.getEjeCveDeudora() != null && this.getEjeCveDeudora().longValue() == -999) {
            conditions += " AND EJE_CVE_DEUDORA IS NULL";
        } else if (this.getEjeCveDeudora() != null) {
            conditions += " AND EJE_CVE_DEUDORA = ?";
            values.add(this.getEjeCveDeudora());
        }

        if (this.getEjeNumcAux2() != null && this.getEjeNumcAux2().longValue() == -999) {
            conditions += " AND EJE_NUMC_AUX2 IS NULL";
        } else if (this.getEjeNumcAux2() != null) {
            conditions += " AND EJE_NUMC_AUX2 = ?";
            values.add(this.getEjeNumcAux2());
        }

        if (this.getEjeNumcAux3() != null && this.getEjeNumcAux3().longValue() == -999) {
            conditions += " AND EJE_NUMC_AUX3 IS NULL";
        } else if (this.getEjeNumcAux3() != null) {
            conditions += " AND EJE_NUMC_AUX3 = ?";
            values.add(this.getEjeNumcAux3());
        }

        if (this.getEjeNomContrato() != null && "null".equals(this.getEjeNomContrato())) {
            conditions += " AND EJE_NOM_CONTRATO IS NULL";
        } else if (this.getEjeNomContrato() != null) {
            conditions += " AND EJE_NOM_CONTRATO = ?";
            values.add(this.getEjeNomContrato());
        }

        if (this.getEjeNombre() != null && "null".equals(this.getEjeNombre())) {
            conditions += " AND EJE_NOMBRE IS NULL";
        } else if (this.getEjeNombre() != null) {
            conditions += " AND EJE_NOMBRE = ?";
            values.add(this.getEjeNombre());
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
        String sql = "UPDATE BALEJE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EJE_NUM_CTAM = ?";
        pkValues.add(this.getEjeNumCtam());
        conditions += " AND EJE_NUM_SCTA = ?";
        pkValues.add(this.getEjeNumScta());
        conditions += " AND EJE_NUM_SSCTA = ?";
        pkValues.add(this.getEjeNumSscta());
        conditions += " AND EJE_NUM_SSSCTA = ?";
        pkValues.add(this.getEjeNumSsscta());
        conditions += " AND EJE_NUM_SSSSCTA = ?";
        pkValues.add(this.getEjeNumSssscta());
        conditions += " AND EJE_NUM_SSSSSCTA = ?";
        pkValues.add(this.getEjeNumSsssscta());
        conditions += " AND EJE_NUM_AUX1 = ?";
        pkValues.add(this.getEjeNumAux1());
        conditions += " AND EJE_NUM_AUX2 = ?";
        pkValues.add(this.getEjeNumAux2());
        conditions += " AND EJE_NUM_AUX3 = ?";
        pkValues.add(this.getEjeNumAux3());
        fields += " EJE_SALDO_INI_PER = ?, ";
        values.add(this.getEjeSaldoIniPer());
        fields += " EJE_CARGOS_PER = ?, ";
        values.add(this.getEjeCargosPer());
        fields += " EJE_ABONOS_PER = ?, ";
        values.add(this.getEjeAbonosPer());
        fields += " EJE_IMP_SALDO_ACT = ?, ";
        values.add(this.getEjeImpSaldoAct());
        fields += " EJE_CVE_ACREEDORA = ?, ";
        values.add(this.getEjeCveAcreedora());
        fields += " EJE_CVE_DEUDORA = ?, ";
        values.add(this.getEjeCveDeudora());
        fields += " EJE_NUMC_AUX2 = ?, ";
        values.add(this.getEjeNumcAux2());
        fields += " EJE_NUMC_AUX3 = ?, ";
        values.add(this.getEjeNumcAux3());
        fields += " EJE_NOM_CONTRATO = ?, ";
        values.add(this.getEjeNomContrato());
        fields += " EJE_NOMBRE = ?, ";
        values.add(this.getEjeNombre());
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
        String sql = "INSERT INTO BALEJE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EJE_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getEjeNumCtam());

        fields += ", EJE_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getEjeNumScta());

        fields += ", EJE_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getEjeNumSscta());

        fields += ", EJE_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getEjeNumSsscta());

        fields += ", EJE_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getEjeNumSssscta());

        fields += ", EJE_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getEjeNumSsssscta());

        fields += ", EJE_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getEjeNumAux1());

        fields += ", EJE_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getEjeNumAux2());

        fields += ", EJE_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getEjeNumAux3());

        fields += ", EJE_SALDO_INI_PER";
        fieldValues += ", ?";
        values.add(this.getEjeSaldoIniPer());

        fields += ", EJE_CARGOS_PER";
        fieldValues += ", ?";
        values.add(this.getEjeCargosPer());

        fields += ", EJE_ABONOS_PER";
        fieldValues += ", ?";
        values.add(this.getEjeAbonosPer());

        fields += ", EJE_IMP_SALDO_ACT";
        fieldValues += ", ?";
        values.add(this.getEjeImpSaldoAct());

        fields += ", EJE_CVE_ACREEDORA";
        fieldValues += ", ?";
        values.add(this.getEjeCveAcreedora());

        fields += ", EJE_CVE_DEUDORA";
        fieldValues += ", ?";
        values.add(this.getEjeCveDeudora());

        fields += ", EJE_NUMC_AUX2";
        fieldValues += ", ?";
        values.add(this.getEjeNumcAux2());

        fields += ", EJE_NUMC_AUX3";
        fieldValues += ", ?";
        values.add(this.getEjeNumcAux3());

        fields += ", EJE_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getEjeNomContrato());

        fields += ", EJE_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getEjeNombre());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM BALEJE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EJE_NUM_CTAM = ?";
        values.add(this.getEjeNumCtam());
        conditions += " AND EJE_NUM_SCTA = ?";
        values.add(this.getEjeNumScta());
        conditions += " AND EJE_NUM_SSCTA = ?";
        values.add(this.getEjeNumSscta());
        conditions += " AND EJE_NUM_SSSCTA = ?";
        values.add(this.getEjeNumSsscta());
        conditions += " AND EJE_NUM_SSSSCTA = ?";
        values.add(this.getEjeNumSssscta());
        conditions += " AND EJE_NUM_SSSSSCTA = ?";
        values.add(this.getEjeNumSsssscta());
        conditions += " AND EJE_NUM_AUX1 = ?";
        values.add(this.getEjeNumAux1());
        conditions += " AND EJE_NUM_AUX2 = ?";
        values.add(this.getEjeNumAux2());
        conditions += " AND EJE_NUM_AUX3 = ?";
        values.add(this.getEjeNumAux3());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Baleje instance = (Baleje) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEjeNumCtam().equals(instance.getEjeNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumScta().equals(instance.getEjeNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumSscta().equals(instance.getEjeNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumSsscta().equals(instance.getEjeNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumSssscta().equals(instance.getEjeNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumSsssscta().equals(instance.getEjeNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumAux1().equals(instance.getEjeNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumAux2().equals(instance.getEjeNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumAux3().equals(instance.getEjeNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getEjeSaldoIniPer().equals(instance.getEjeSaldoIniPer()))
            equalObjects = false;
        if (equalObjects && !this.getEjeCargosPer().equals(instance.getEjeCargosPer()))
            equalObjects = false;
        if (equalObjects && !this.getEjeAbonosPer().equals(instance.getEjeAbonosPer()))
            equalObjects = false;
        if (equalObjects && !this.getEjeImpSaldoAct().equals(instance.getEjeImpSaldoAct()))
            equalObjects = false;
        if (equalObjects && !this.getEjeCveAcreedora().equals(instance.getEjeCveAcreedora()))
            equalObjects = false;
        if (equalObjects && !this.getEjeCveDeudora().equals(instance.getEjeCveDeudora()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumcAux2().equals(instance.getEjeNumcAux2()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNumcAux3().equals(instance.getEjeNumcAux3()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNomContrato().equals(instance.getEjeNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getEjeNombre().equals(instance.getEjeNombre()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Baleje result = new Baleje();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEjeNumCtam((BigDecimal) objectData.getData("EJE_NUM_CTAM"));
        result.setEjeNumScta((BigDecimal) objectData.getData("EJE_NUM_SCTA"));
        result.setEjeNumSscta((BigDecimal) objectData.getData("EJE_NUM_SSCTA"));
        result.setEjeNumSsscta((BigDecimal) objectData.getData("EJE_NUM_SSSCTA"));
        result.setEjeNumSssscta((BigDecimal) objectData.getData("EJE_NUM_SSSSCTA"));
        result.setEjeNumSsssscta((BigDecimal) objectData.getData("EJE_NUM_SSSSSCTA"));
        result.setEjeNumAux1((BigDecimal) objectData.getData("EJE_NUM_AUX1"));
        result.setEjeNumAux2((BigDecimal) objectData.getData("EJE_NUM_AUX2"));
        result.setEjeNumAux3((BigDecimal) objectData.getData("EJE_NUM_AUX3"));
        result.setEjeSaldoIniPer((BigDecimal) objectData.getData("EJE_SALDO_INI_PER"));
        result.setEjeCargosPer((BigDecimal) objectData.getData("EJE_CARGOS_PER"));
        result.setEjeAbonosPer((BigDecimal) objectData.getData("EJE_ABONOS_PER"));
        result.setEjeImpSaldoAct((BigDecimal) objectData.getData("EJE_IMP_SALDO_ACT"));
        result.setEjeCveAcreedora((BigDecimal) objectData.getData("EJE_CVE_ACREEDORA"));
        result.setEjeCveDeudora((BigDecimal) objectData.getData("EJE_CVE_DEUDORA"));
        result.setEjeNumcAux2((BigDecimal) objectData.getData("EJE_NUMC_AUX2"));
        result.setEjeNumcAux3((BigDecimal) objectData.getData("EJE_NUMC_AUX3"));
        result.setEjeNomContrato((String) objectData.getData("EJE_NOM_CONTRATO"));
        result.setEjeNombre((String) objectData.getData("EJE_NOMBRE"));

        return result;

    }

}
