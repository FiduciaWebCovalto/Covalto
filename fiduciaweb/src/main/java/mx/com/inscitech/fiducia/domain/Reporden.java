package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REPORDEN_PK",
            columns = { "REO_NUM_AUX1", "REO_NUM_CTAM", "REO_NUM_SCTA", "REO_NUM_SSCTA", "REO_NUM_SSSCTA", "REO_NUM_SSSSCTA", "REO_NUM_SSSSSCTA", "REO_NUM_AUX2", "REO_NUM_AUX3"
    }, sequences = { "MANUAL" })
public class Reporden extends DomainObject {

    BigDecimal reoNumCtam = null;
    BigDecimal reoNumScta = null;
    BigDecimal reoNumSscta = null;
    BigDecimal reoNumSsscta = null;
    BigDecimal reoNumSssscta = null;
    BigDecimal reoNumSsssscta = null;
    BigDecimal reoNumAux1 = null;
    BigDecimal reoNumAux2 = null;
    BigDecimal reoNumAux3 = null;
    BigDecimal reoSaldoIniPer = null;
    BigDecimal reoCargosPer = null;
    BigDecimal reoAbonosPer = null;
    BigDecimal reoImpSaldoAct = null;
    BigDecimal reoCveAcreedora = null;
    BigDecimal reoCveDeudora = null;
    BigDecimal reoNumcAux2 = null;
    BigDecimal reoNumcAux3 = null;
    String reoNomContrato = null;
    String reoNombre = null;
    String reoUsuario = null;

    public Reporden() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumCtam(BigDecimal reoNumCtam) {
        this.reoNumCtam = reoNumCtam;
    }

    public BigDecimal getReoNumCtam() {
        return this.reoNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumScta(BigDecimal reoNumScta) {
        this.reoNumScta = reoNumScta;
    }

    public BigDecimal getReoNumScta() {
        return this.reoNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumSscta(BigDecimal reoNumSscta) {
        this.reoNumSscta = reoNumSscta;
    }

    public BigDecimal getReoNumSscta() {
        return this.reoNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumSsscta(BigDecimal reoNumSsscta) {
        this.reoNumSsscta = reoNumSsscta;
    }

    public BigDecimal getReoNumSsscta() {
        return this.reoNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumSssscta(BigDecimal reoNumSssscta) {
        this.reoNumSssscta = reoNumSssscta;
    }

    public BigDecimal getReoNumSssscta() {
        return this.reoNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumSsssscta(BigDecimal reoNumSsssscta) {
        this.reoNumSsssscta = reoNumSsssscta;
    }

    public BigDecimal getReoNumSsssscta() {
        return this.reoNumSsssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumAux1(BigDecimal reoNumAux1) {
        this.reoNumAux1 = reoNumAux1;
    }

    public BigDecimal getReoNumAux1() {
        return this.reoNumAux1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumAux2(BigDecimal reoNumAux2) {
        this.reoNumAux2 = reoNumAux2;
    }

    public BigDecimal getReoNumAux2() {
        return this.reoNumAux2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumAux3(BigDecimal reoNumAux3) {
        this.reoNumAux3 = reoNumAux3;
    }

    public BigDecimal getReoNumAux3() {
        return this.reoNumAux3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setReoSaldoIniPer(BigDecimal reoSaldoIniPer) {
        this.reoSaldoIniPer = reoSaldoIniPer;
    }

    public BigDecimal getReoSaldoIniPer() {
        return this.reoSaldoIniPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setReoCargosPer(BigDecimal reoCargosPer) {
        this.reoCargosPer = reoCargosPer;
    }

    public BigDecimal getReoCargosPer() {
        return this.reoCargosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setReoAbonosPer(BigDecimal reoAbonosPer) {
        this.reoAbonosPer = reoAbonosPer;
    }

    public BigDecimal getReoAbonosPer() {
        return this.reoAbonosPer;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setReoImpSaldoAct(BigDecimal reoImpSaldoAct) {
        this.reoImpSaldoAct = reoImpSaldoAct;
    }

    public BigDecimal getReoImpSaldoAct() {
        return this.reoImpSaldoAct;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoCveAcreedora(BigDecimal reoCveAcreedora) {
        this.reoCveAcreedora = reoCveAcreedora;
    }

    public BigDecimal getReoCveAcreedora() {
        return this.reoCveAcreedora;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoCveDeudora(BigDecimal reoCveDeudora) {
        this.reoCveDeudora = reoCveDeudora;
    }

    public BigDecimal getReoCveDeudora() {
        return this.reoCveDeudora;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumcAux2(BigDecimal reoNumcAux2) {
        this.reoNumcAux2 = reoNumcAux2;
    }

    public BigDecimal getReoNumcAux2() {
        return this.reoNumcAux2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setReoNumcAux3(BigDecimal reoNumcAux3) {
        this.reoNumcAux3 = reoNumcAux3;
    }

    public BigDecimal getReoNumcAux3() {
        return this.reoNumcAux3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setReoNomContrato(String reoNomContrato) {
        this.reoNomContrato = reoNomContrato;
    }

    public String getReoNomContrato() {
        return this.reoNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setReoNombre(String reoNombre) {
        this.reoNombre = reoNombre;
    }

    public String getReoNombre() {
        return this.reoNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setReoUsuario(String reoUsuario) {
        this.reoUsuario = reoUsuario;
    }

    public String getReoUsuario() {
        return this.reoUsuario;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REPORDEN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getReoNumCtam() != null && this.getReoNumCtam().longValue() == -999) {
            conditions += " AND REO_NUM_CTAM IS NULL";
        } else if (this.getReoNumCtam() != null) {
            conditions += " AND REO_NUM_CTAM = ?";
            values.add(this.getReoNumCtam());
        }

        if (this.getReoNumScta() != null && this.getReoNumScta().longValue() == -999) {
            conditions += " AND REO_NUM_SCTA IS NULL";
        } else if (this.getReoNumScta() != null) {
            conditions += " AND REO_NUM_SCTA = ?";
            values.add(this.getReoNumScta());
        }

        if (this.getReoNumSscta() != null && this.getReoNumSscta().longValue() == -999) {
            conditions += " AND REO_NUM_SSCTA IS NULL";
        } else if (this.getReoNumSscta() != null) {
            conditions += " AND REO_NUM_SSCTA = ?";
            values.add(this.getReoNumSscta());
        }

        if (this.getReoNumSsscta() != null && this.getReoNumSsscta().longValue() == -999) {
            conditions += " AND REO_NUM_SSSCTA IS NULL";
        } else if (this.getReoNumSsscta() != null) {
            conditions += " AND REO_NUM_SSSCTA = ?";
            values.add(this.getReoNumSsscta());
        }

        if (this.getReoNumSssscta() != null && this.getReoNumSssscta().longValue() == -999) {
            conditions += " AND REO_NUM_SSSSCTA IS NULL";
        } else if (this.getReoNumSssscta() != null) {
            conditions += " AND REO_NUM_SSSSCTA = ?";
            values.add(this.getReoNumSssscta());
        }

        if (this.getReoNumSsssscta() != null && this.getReoNumSsssscta().longValue() == -999) {
            conditions += " AND REO_NUM_SSSSSCTA IS NULL";
        } else if (this.getReoNumSsssscta() != null) {
            conditions += " AND REO_NUM_SSSSSCTA = ?";
            values.add(this.getReoNumSsssscta());
        }

        if (this.getReoNumAux1() != null && this.getReoNumAux1().longValue() == -999) {
            conditions += " AND REO_NUM_AUX1 IS NULL";
        } else if (this.getReoNumAux1() != null) {
            conditions += " AND REO_NUM_AUX1 = ?";
            values.add(this.getReoNumAux1());
        }

        if (this.getReoNumAux2() != null && this.getReoNumAux2().longValue() == -999) {
            conditions += " AND REO_NUM_AUX2 IS NULL";
        } else if (this.getReoNumAux2() != null) {
            conditions += " AND REO_NUM_AUX2 = ?";
            values.add(this.getReoNumAux2());
        }

        if (this.getReoNumAux3() != null && this.getReoNumAux3().longValue() == -999) {
            conditions += " AND REO_NUM_AUX3 IS NULL";
        } else if (this.getReoNumAux3() != null) {
            conditions += " AND REO_NUM_AUX3 = ?";
            values.add(this.getReoNumAux3());
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
        String sql = "SELECT * FROM REPORDEN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getReoNumCtam() != null && this.getReoNumCtam().longValue() == -999) {
            conditions += " AND REO_NUM_CTAM IS NULL";
        } else if (this.getReoNumCtam() != null) {
            conditions += " AND REO_NUM_CTAM = ?";
            values.add(this.getReoNumCtam());
        }

        if (this.getReoNumScta() != null && this.getReoNumScta().longValue() == -999) {
            conditions += " AND REO_NUM_SCTA IS NULL";
        } else if (this.getReoNumScta() != null) {
            conditions += " AND REO_NUM_SCTA = ?";
            values.add(this.getReoNumScta());
        }

        if (this.getReoNumSscta() != null && this.getReoNumSscta().longValue() == -999) {
            conditions += " AND REO_NUM_SSCTA IS NULL";
        } else if (this.getReoNumSscta() != null) {
            conditions += " AND REO_NUM_SSCTA = ?";
            values.add(this.getReoNumSscta());
        }

        if (this.getReoNumSsscta() != null && this.getReoNumSsscta().longValue() == -999) {
            conditions += " AND REO_NUM_SSSCTA IS NULL";
        } else if (this.getReoNumSsscta() != null) {
            conditions += " AND REO_NUM_SSSCTA = ?";
            values.add(this.getReoNumSsscta());
        }

        if (this.getReoNumSssscta() != null && this.getReoNumSssscta().longValue() == -999) {
            conditions += " AND REO_NUM_SSSSCTA IS NULL";
        } else if (this.getReoNumSssscta() != null) {
            conditions += " AND REO_NUM_SSSSCTA = ?";
            values.add(this.getReoNumSssscta());
        }

        if (this.getReoNumSsssscta() != null && this.getReoNumSsssscta().longValue() == -999) {
            conditions += " AND REO_NUM_SSSSSCTA IS NULL";
        } else if (this.getReoNumSsssscta() != null) {
            conditions += " AND REO_NUM_SSSSSCTA = ?";
            values.add(this.getReoNumSsssscta());
        }

        if (this.getReoNumAux1() != null && this.getReoNumAux1().longValue() == -999) {
            conditions += " AND REO_NUM_AUX1 IS NULL";
        } else if (this.getReoNumAux1() != null) {
            conditions += " AND REO_NUM_AUX1 = ?";
            values.add(this.getReoNumAux1());
        }

        if (this.getReoNumAux2() != null && this.getReoNumAux2().longValue() == -999) {
            conditions += " AND REO_NUM_AUX2 IS NULL";
        } else if (this.getReoNumAux2() != null) {
            conditions += " AND REO_NUM_AUX2 = ?";
            values.add(this.getReoNumAux2());
        }

        if (this.getReoNumAux3() != null && this.getReoNumAux3().longValue() == -999) {
            conditions += " AND REO_NUM_AUX3 IS NULL";
        } else if (this.getReoNumAux3() != null) {
            conditions += " AND REO_NUM_AUX3 = ?";
            values.add(this.getReoNumAux3());
        }

        if (this.getReoSaldoIniPer() != null && this.getReoSaldoIniPer().longValue() == -999) {
            conditions += " AND REO_SALDO_INI_PER IS NULL";
        } else if (this.getReoSaldoIniPer() != null) {
            conditions += " AND REO_SALDO_INI_PER = ?";
            values.add(this.getReoSaldoIniPer());
        }

        if (this.getReoCargosPer() != null && this.getReoCargosPer().longValue() == -999) {
            conditions += " AND REO_CARGOS_PER IS NULL";
        } else if (this.getReoCargosPer() != null) {
            conditions += " AND REO_CARGOS_PER = ?";
            values.add(this.getReoCargosPer());
        }

        if (this.getReoAbonosPer() != null && this.getReoAbonosPer().longValue() == -999) {
            conditions += " AND REO_ABONOS_PER IS NULL";
        } else if (this.getReoAbonosPer() != null) {
            conditions += " AND REO_ABONOS_PER = ?";
            values.add(this.getReoAbonosPer());
        }

        if (this.getReoImpSaldoAct() != null && this.getReoImpSaldoAct().longValue() == -999) {
            conditions += " AND REO_IMP_SALDO_ACT IS NULL";
        } else if (this.getReoImpSaldoAct() != null) {
            conditions += " AND REO_IMP_SALDO_ACT = ?";
            values.add(this.getReoImpSaldoAct());
        }

        if (this.getReoCveAcreedora() != null && this.getReoCveAcreedora().longValue() == -999) {
            conditions += " AND REO_CVE_ACREEDORA IS NULL";
        } else if (this.getReoCveAcreedora() != null) {
            conditions += " AND REO_CVE_ACREEDORA = ?";
            values.add(this.getReoCveAcreedora());
        }

        if (this.getReoCveDeudora() != null && this.getReoCveDeudora().longValue() == -999) {
            conditions += " AND REO_CVE_DEUDORA IS NULL";
        } else if (this.getReoCveDeudora() != null) {
            conditions += " AND REO_CVE_DEUDORA = ?";
            values.add(this.getReoCveDeudora());
        }

        if (this.getReoNumcAux2() != null && this.getReoNumcAux2().longValue() == -999) {
            conditions += " AND REO_NUMC_AUX2 IS NULL";
        } else if (this.getReoNumcAux2() != null) {
            conditions += " AND REO_NUMC_AUX2 = ?";
            values.add(this.getReoNumcAux2());
        }

        if (this.getReoNumcAux3() != null && this.getReoNumcAux3().longValue() == -999) {
            conditions += " AND REO_NUMC_AUX3 IS NULL";
        } else if (this.getReoNumcAux3() != null) {
            conditions += " AND REO_NUMC_AUX3 = ?";
            values.add(this.getReoNumcAux3());
        }

        if (this.getReoNomContrato() != null && "null".equals(this.getReoNomContrato())) {
            conditions += " AND REO_NOM_CONTRATO IS NULL";
        } else if (this.getReoNomContrato() != null) {
            conditions += " AND REO_NOM_CONTRATO = ?";
            values.add(this.getReoNomContrato());
        }

        if (this.getReoNombre() != null && "null".equals(this.getReoNombre())) {
            conditions += " AND REO_NOMBRE IS NULL";
        } else if (this.getReoNombre() != null) {
            conditions += " AND REO_NOMBRE = ?";
            values.add(this.getReoNombre());
        }

        if (this.getReoUsuario() != null && "null".equals(this.getReoUsuario())) {
            conditions += " AND REO_USUARIO IS NULL";
        } else if (this.getReoUsuario() != null) {
            conditions += " AND REO_USUARIO = ?";
            values.add(this.getReoUsuario());
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
        String sql = "UPDATE REPORDEN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND REO_NUM_CTAM = ?";
        pkValues.add(this.getReoNumCtam());
        conditions += " AND REO_NUM_SCTA = ?";
        pkValues.add(this.getReoNumScta());
        conditions += " AND REO_NUM_SSCTA = ?";
        pkValues.add(this.getReoNumSscta());
        conditions += " AND REO_NUM_SSSCTA = ?";
        pkValues.add(this.getReoNumSsscta());
        conditions += " AND REO_NUM_SSSSCTA = ?";
        pkValues.add(this.getReoNumSssscta());
        conditions += " AND REO_NUM_SSSSSCTA = ?";
        pkValues.add(this.getReoNumSsssscta());
        conditions += " AND REO_NUM_AUX1 = ?";
        pkValues.add(this.getReoNumAux1());
        conditions += " AND REO_NUM_AUX2 = ?";
        pkValues.add(this.getReoNumAux2());
        conditions += " AND REO_NUM_AUX3 = ?";
        pkValues.add(this.getReoNumAux3());
        fields += " REO_SALDO_INI_PER = ?, ";
        values.add(this.getReoSaldoIniPer());
        fields += " REO_CARGOS_PER = ?, ";
        values.add(this.getReoCargosPer());
        fields += " REO_ABONOS_PER = ?, ";
        values.add(this.getReoAbonosPer());
        fields += " REO_IMP_SALDO_ACT = ?, ";
        values.add(this.getReoImpSaldoAct());
        fields += " REO_CVE_ACREEDORA = ?, ";
        values.add(this.getReoCveAcreedora());
        fields += " REO_CVE_DEUDORA = ?, ";
        values.add(this.getReoCveDeudora());
        fields += " REO_NUMC_AUX2 = ?, ";
        values.add(this.getReoNumcAux2());
        fields += " REO_NUMC_AUX3 = ?, ";
        values.add(this.getReoNumcAux3());
        fields += " REO_NOM_CONTRATO = ?, ";
        values.add(this.getReoNomContrato());
        fields += " REO_NOMBRE = ?, ";
        values.add(this.getReoNombre());
        fields += " REO_USUARIO = ?, ";
        values.add(this.getReoUsuario());
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
        String sql = "INSERT INTO REPORDEN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", REO_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getReoNumCtam());

        fields += ", REO_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getReoNumScta());

        fields += ", REO_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getReoNumSscta());

        fields += ", REO_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getReoNumSsscta());

        fields += ", REO_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getReoNumSssscta());

        fields += ", REO_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getReoNumSsssscta());

        fields += ", REO_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getReoNumAux1());

        fields += ", REO_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getReoNumAux2());

        fields += ", REO_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getReoNumAux3());

        fields += ", REO_SALDO_INI_PER";
        fieldValues += ", ?";
        values.add(this.getReoSaldoIniPer());

        fields += ", REO_CARGOS_PER";
        fieldValues += ", ?";
        values.add(this.getReoCargosPer());

        fields += ", REO_ABONOS_PER";
        fieldValues += ", ?";
        values.add(this.getReoAbonosPer());

        fields += ", REO_IMP_SALDO_ACT";
        fieldValues += ", ?";
        values.add(this.getReoImpSaldoAct());

        fields += ", REO_CVE_ACREEDORA";
        fieldValues += ", ?";
        values.add(this.getReoCveAcreedora());

        fields += ", REO_CVE_DEUDORA";
        fieldValues += ", ?";
        values.add(this.getReoCveDeudora());

        fields += ", REO_NUMC_AUX2";
        fieldValues += ", ?";
        values.add(this.getReoNumcAux2());

        fields += ", REO_NUMC_AUX3";
        fieldValues += ", ?";
        values.add(this.getReoNumcAux3());

        fields += ", REO_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getReoNomContrato());

        fields += ", REO_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getReoNombre());

        fields += ", REO_USUARIO";
        fieldValues += ", ?";
        values.add(this.getReoUsuario());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REPORDEN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND REO_NUM_CTAM = ?";
        values.add(this.getReoNumCtam());
        conditions += " AND REO_NUM_SCTA = ?";
        values.add(this.getReoNumScta());
        conditions += " AND REO_NUM_SSCTA = ?";
        values.add(this.getReoNumSscta());
        conditions += " AND REO_NUM_SSSCTA = ?";
        values.add(this.getReoNumSsscta());
        conditions += " AND REO_NUM_SSSSCTA = ?";
        values.add(this.getReoNumSssscta());
        conditions += " AND REO_NUM_SSSSSCTA = ?";
        values.add(this.getReoNumSsssscta());
        conditions += " AND REO_NUM_AUX1 = ?";
        values.add(this.getReoNumAux1());
        conditions += " AND REO_NUM_AUX2 = ?";
        values.add(this.getReoNumAux2());
        conditions += " AND REO_NUM_AUX3 = ?";
        values.add(this.getReoNumAux3());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Reporden instance = (Reporden) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getReoNumCtam().equals(instance.getReoNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getReoNumScta().equals(instance.getReoNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getReoNumSscta().equals(instance.getReoNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getReoNumSsscta().equals(instance.getReoNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getReoNumSssscta().equals(instance.getReoNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getReoNumSsssscta().equals(instance.getReoNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getReoNumAux1().equals(instance.getReoNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getReoNumAux2().equals(instance.getReoNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getReoNumAux3().equals(instance.getReoNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getReoSaldoIniPer().equals(instance.getReoSaldoIniPer()))
            equalObjects = false;
        if (equalObjects && !this.getReoCargosPer().equals(instance.getReoCargosPer()))
            equalObjects = false;
        if (equalObjects && !this.getReoAbonosPer().equals(instance.getReoAbonosPer()))
            equalObjects = false;
        if (equalObjects && !this.getReoImpSaldoAct().equals(instance.getReoImpSaldoAct()))
            equalObjects = false;
        if (equalObjects && !this.getReoCveAcreedora().equals(instance.getReoCveAcreedora()))
            equalObjects = false;
        if (equalObjects && !this.getReoCveDeudora().equals(instance.getReoCveDeudora()))
            equalObjects = false;
        if (equalObjects && !this.getReoNumcAux2().equals(instance.getReoNumcAux2()))
            equalObjects = false;
        if (equalObjects && !this.getReoNumcAux3().equals(instance.getReoNumcAux3()))
            equalObjects = false;
        if (equalObjects && !this.getReoNomContrato().equals(instance.getReoNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getReoNombre().equals(instance.getReoNombre()))
            equalObjects = false;
        if (equalObjects && !this.getReoUsuario().equals(instance.getReoUsuario()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Reporden result = new Reporden();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setReoNumCtam((BigDecimal) objectData.getData("REO_NUM_CTAM"));
        result.setReoNumScta((BigDecimal) objectData.getData("REO_NUM_SCTA"));
        result.setReoNumSscta((BigDecimal) objectData.getData("REO_NUM_SSCTA"));
        result.setReoNumSsscta((BigDecimal) objectData.getData("REO_NUM_SSSCTA"));
        result.setReoNumSssscta((BigDecimal) objectData.getData("REO_NUM_SSSSCTA"));
        result.setReoNumSsssscta((BigDecimal) objectData.getData("REO_NUM_SSSSSCTA"));
        result.setReoNumAux1((BigDecimal) objectData.getData("REO_NUM_AUX1"));
        result.setReoNumAux2((BigDecimal) objectData.getData("REO_NUM_AUX2"));
        result.setReoNumAux3((BigDecimal) objectData.getData("REO_NUM_AUX3"));
        result.setReoSaldoIniPer((BigDecimal) objectData.getData("REO_SALDO_INI_PER"));
        result.setReoCargosPer((BigDecimal) objectData.getData("REO_CARGOS_PER"));
        result.setReoAbonosPer((BigDecimal) objectData.getData("REO_ABONOS_PER"));
        result.setReoImpSaldoAct((BigDecimal) objectData.getData("REO_IMP_SALDO_ACT"));
        result.setReoCveAcreedora((BigDecimal) objectData.getData("REO_CVE_ACREEDORA"));
        result.setReoCveDeudora((BigDecimal) objectData.getData("REO_CVE_DEUDORA"));
        result.setReoNumcAux2((BigDecimal) objectData.getData("REO_NUMC_AUX2"));
        result.setReoNumcAux3((BigDecimal) objectData.getData("REO_NUMC_AUX3"));
        result.setReoNomContrato((String) objectData.getData("REO_NOM_CONTRATO"));
        result.setReoNombre((String) objectData.getData("REO_NOMBRE"));
        result.setReoUsuario((String) objectData.getData("REO_USUARIO"));

        return result;

    }

}
