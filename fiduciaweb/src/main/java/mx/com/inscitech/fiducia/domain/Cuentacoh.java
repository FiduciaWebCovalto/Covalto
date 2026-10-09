package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class Cuentacoh extends DomainObject {

    BigDecimal cueNumCtam = null;
    BigDecimal cueNumScta = null;
    BigDecimal cueNumSscta = null;
    BigDecimal cueNumSsscta = null;
    BigDecimal cueNumSssscta = null;
    BigDecimal cueNumSsssscta = null;
    BigDecimal cueNumAux1 = null;
    BigDecimal cueNumAux2 = null;
    BigDecimal cueNumAux3 = null;
    String cueNomCta = null;
    BigDecimal cueCveAcreedora = null;
    BigDecimal cueCveDeudora = null;
    String cueCveMovtoCta = null;
    String cueCveAcumRubro = null;
    BigDecimal cueAnoAltaReg = null;
    BigDecimal cueMesAltaReg = null;
    BigDecimal cueDiaAltaReg = null;
    BigDecimal cueAnoUltMod = null;
    BigDecimal cueMesUltMod = null;
    BigDecimal cueDiaUltMod = null;
    String cueCveStCuenta = null;
    BigDecimal cueConciliacion = null;
    String cueTipoPersona = null;
    BigDecimal cueSat = null;

    public Cuentacoh() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueNumCtam(BigDecimal cueNumCtam) {
        this.cueNumCtam = cueNumCtam;
    }

    public BigDecimal getCueNumCtam() {
        return this.cueNumCtam;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueNumScta(BigDecimal cueNumScta) {
        this.cueNumScta = cueNumScta;
    }

    public BigDecimal getCueNumScta() {
        return this.cueNumScta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueNumSscta(BigDecimal cueNumSscta) {
        this.cueNumSscta = cueNumSscta;
    }

    public BigDecimal getCueNumSscta() {
        return this.cueNumSscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueNumSsscta(BigDecimal cueNumSsscta) {
        this.cueNumSsscta = cueNumSsscta;
    }

    public BigDecimal getCueNumSsscta() {
        return this.cueNumSsscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueNumSssscta(BigDecimal cueNumSssscta) {
        this.cueNumSssscta = cueNumSssscta;
    }

    public BigDecimal getCueNumSssscta() {
        return this.cueNumSssscta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueNumSsssscta(BigDecimal cueNumSsssscta) {
        this.cueNumSsssscta = cueNumSsssscta;
    }

    public BigDecimal getCueNumSsssscta() {
        return this.cueNumSsssscta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueNumAux1(BigDecimal cueNumAux1) {
        this.cueNumAux1 = cueNumAux1;
    }

    public BigDecimal getCueNumAux1() {
        return this.cueNumAux1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueNumAux2(BigDecimal cueNumAux2) {
        this.cueNumAux2 = cueNumAux2;
    }

    public BigDecimal getCueNumAux2() {
        return this.cueNumAux2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueNumAux3(BigDecimal cueNumAux3) {
        this.cueNumAux3 = cueNumAux3;
    }

    public BigDecimal getCueNumAux3() {
        return this.cueNumAux3;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCueNomCta(String cueNomCta) {
        this.cueNomCta = cueNomCta;
    }

    public String getCueNomCta() {
        return this.cueNomCta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueCveAcreedora(BigDecimal cueCveAcreedora) {
        this.cueCveAcreedora = cueCveAcreedora;
    }

    public BigDecimal getCueCveAcreedora() {
        return this.cueCveAcreedora;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCueCveDeudora(BigDecimal cueCveDeudora) {
        this.cueCveDeudora = cueCveDeudora;
    }

    public BigDecimal getCueCveDeudora() {
        return this.cueCveDeudora;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCueCveMovtoCta(String cueCveMovtoCta) {
        this.cueCveMovtoCta = cueCveMovtoCta;
    }

    public String getCueCveMovtoCta() {
        return this.cueCveMovtoCta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCueCveAcumRubro(String cueCveAcumRubro) {
        this.cueCveAcumRubro = cueCveAcumRubro;
    }

    public String getCueCveAcumRubro() {
        return this.cueCveAcumRubro;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCueAnoAltaReg(BigDecimal cueAnoAltaReg) {
        this.cueAnoAltaReg = cueAnoAltaReg;
    }

    public BigDecimal getCueAnoAltaReg() {
        return this.cueAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCueMesAltaReg(BigDecimal cueMesAltaReg) {
        this.cueMesAltaReg = cueMesAltaReg;
    }

    public BigDecimal getCueMesAltaReg() {
        return this.cueMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCueDiaAltaReg(BigDecimal cueDiaAltaReg) {
        this.cueDiaAltaReg = cueDiaAltaReg;
    }

    public BigDecimal getCueDiaAltaReg() {
        return this.cueDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCueAnoUltMod(BigDecimal cueAnoUltMod) {
        this.cueAnoUltMod = cueAnoUltMod;
    }

    public BigDecimal getCueAnoUltMod() {
        return this.cueAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCueMesUltMod(BigDecimal cueMesUltMod) {
        this.cueMesUltMod = cueMesUltMod;
    }

    public BigDecimal getCueMesUltMod() {
        return this.cueMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCueDiaUltMod(BigDecimal cueDiaUltMod) {
        this.cueDiaUltMod = cueDiaUltMod;
    }

    public BigDecimal getCueDiaUltMod() {
        return this.cueDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCueCveStCuenta(String cueCveStCuenta) {
        this.cueCveStCuenta = cueCveStCuenta;
    }

    public String getCueCveStCuenta() {
        return this.cueCveStCuenta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCueConciliacion(BigDecimal cueConciliacion) {
        this.cueConciliacion = cueConciliacion;
    }

    public BigDecimal getCueConciliacion() {
        return this.cueConciliacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCueTipoPersona(String cueTipoPersona) {
        this.cueTipoPersona = cueTipoPersona;
    }

    public String getCueTipoPersona() {
        return this.cueTipoPersona;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCueSat(BigDecimal cueSat) {
        this.cueSat = cueSat;
    }

    public BigDecimal getCueSat() {
        return this.cueSat;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CUENTACOH ";

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
        String sql = "SELECT * FROM CUENTACOH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCueNumCtam() != null && this.getCueNumCtam().longValue() == -999) {
            conditions += " AND CUE_NUM_CTAM IS NULL";
        } else if (this.getCueNumCtam() != null) {
            conditions += " AND CUE_NUM_CTAM = ?";
            values.add(this.getCueNumCtam());
        }

        if (this.getCueNumScta() != null && this.getCueNumScta().longValue() == -999) {
            conditions += " AND CUE_NUM_SCTA IS NULL";
        } else if (this.getCueNumScta() != null) {
            conditions += " AND CUE_NUM_SCTA = ?";
            values.add(this.getCueNumScta());
        }

        if (this.getCueNumSscta() != null && this.getCueNumSscta().longValue() == -999) {
            conditions += " AND CUE_NUM_SSCTA IS NULL";
        } else if (this.getCueNumSscta() != null) {
            conditions += " AND CUE_NUM_SSCTA = ?";
            values.add(this.getCueNumSscta());
        }

        if (this.getCueNumSsscta() != null && this.getCueNumSsscta().longValue() == -999) {
            conditions += " AND CUE_NUM_SSSCTA IS NULL";
        } else if (this.getCueNumSsscta() != null) {
            conditions += " AND CUE_NUM_SSSCTA = ?";
            values.add(this.getCueNumSsscta());
        }

        if (this.getCueNumSssscta() != null && this.getCueNumSssscta().longValue() == -999) {
            conditions += " AND CUE_NUM_SSSSCTA IS NULL";
        } else if (this.getCueNumSssscta() != null) {
            conditions += " AND CUE_NUM_SSSSCTA = ?";
            values.add(this.getCueNumSssscta());
        }

        if (this.getCueNumSsssscta() != null && this.getCueNumSsssscta().longValue() == -999) {
            conditions += " AND CUE_NUM_SSSSSCTA IS NULL";
        } else if (this.getCueNumSsssscta() != null) {
            conditions += " AND CUE_NUM_SSSSSCTA = ?";
            values.add(this.getCueNumSsssscta());
        }

        if (this.getCueNumAux1() != null && this.getCueNumAux1().longValue() == -999) {
            conditions += " AND CUE_NUM_AUX1 IS NULL";
        } else if (this.getCueNumAux1() != null) {
            conditions += " AND CUE_NUM_AUX1 = ?";
            values.add(this.getCueNumAux1());
        }

        if (this.getCueNumAux2() != null && this.getCueNumAux2().longValue() == -999) {
            conditions += " AND CUE_NUM_AUX2 IS NULL";
        } else if (this.getCueNumAux2() != null) {
            conditions += " AND CUE_NUM_AUX2 = ?";
            values.add(this.getCueNumAux2());
        }

        if (this.getCueNumAux3() != null && this.getCueNumAux3().longValue() == -999) {
            conditions += " AND CUE_NUM_AUX3 IS NULL";
        } else if (this.getCueNumAux3() != null) {
            conditions += " AND CUE_NUM_AUX3 = ?";
            values.add(this.getCueNumAux3());
        }

        if (this.getCueNomCta() != null && "null".equals(this.getCueNomCta())) {
            conditions += " AND CUE_NOM_CTA IS NULL";
        } else if (this.getCueNomCta() != null) {
            conditions += " AND CUE_NOM_CTA = ?";
            values.add(this.getCueNomCta());
        }

        if (this.getCueCveAcreedora() != null && this.getCueCveAcreedora().longValue() == -999) {
            conditions += " AND CUE_CVE_ACREEDORA IS NULL";
        } else if (this.getCueCveAcreedora() != null) {
            conditions += " AND CUE_CVE_ACREEDORA = ?";
            values.add(this.getCueCveAcreedora());
        }

        if (this.getCueCveDeudora() != null && this.getCueCveDeudora().longValue() == -999) {
            conditions += " AND CUE_CVE_DEUDORA IS NULL";
        } else if (this.getCueCveDeudora() != null) {
            conditions += " AND CUE_CVE_DEUDORA = ?";
            values.add(this.getCueCveDeudora());
        }

        if (this.getCueCveMovtoCta() != null && "null".equals(this.getCueCveMovtoCta())) {
            conditions += " AND CUE_CVE_MOVTO_CTA IS NULL";
        } else if (this.getCueCveMovtoCta() != null) {
            conditions += " AND CUE_CVE_MOVTO_CTA = ?";
            values.add(this.getCueCveMovtoCta());
        }

        if (this.getCueCveAcumRubro() != null && "null".equals(this.getCueCveAcumRubro())) {
            conditions += " AND CUE_CVE_ACUM_RUBRO IS NULL";
        } else if (this.getCueCveAcumRubro() != null) {
            conditions += " AND CUE_CVE_ACUM_RUBRO = ?";
            values.add(this.getCueCveAcumRubro());
        }

        if (this.getCueAnoAltaReg() != null && this.getCueAnoAltaReg().longValue() == -999) {
            conditions += " AND CUE_ANO_ALTA_REG IS NULL";
        } else if (this.getCueAnoAltaReg() != null) {
            conditions += " AND CUE_ANO_ALTA_REG = ?";
            values.add(this.getCueAnoAltaReg());
        }

        if (this.getCueMesAltaReg() != null && this.getCueMesAltaReg().longValue() == -999) {
            conditions += " AND CUE_MES_ALTA_REG IS NULL";
        } else if (this.getCueMesAltaReg() != null) {
            conditions += " AND CUE_MES_ALTA_REG = ?";
            values.add(this.getCueMesAltaReg());
        }

        if (this.getCueDiaAltaReg() != null && this.getCueDiaAltaReg().longValue() == -999) {
            conditions += " AND CUE_DIA_ALTA_REG IS NULL";
        } else if (this.getCueDiaAltaReg() != null) {
            conditions += " AND CUE_DIA_ALTA_REG = ?";
            values.add(this.getCueDiaAltaReg());
        }

        if (this.getCueAnoUltMod() != null && this.getCueAnoUltMod().longValue() == -999) {
            conditions += " AND CUE_ANO_ULT_MOD IS NULL";
        } else if (this.getCueAnoUltMod() != null) {
            conditions += " AND CUE_ANO_ULT_MOD = ?";
            values.add(this.getCueAnoUltMod());
        }

        if (this.getCueMesUltMod() != null && this.getCueMesUltMod().longValue() == -999) {
            conditions += " AND CUE_MES_ULT_MOD IS NULL";
        } else if (this.getCueMesUltMod() != null) {
            conditions += " AND CUE_MES_ULT_MOD = ?";
            values.add(this.getCueMesUltMod());
        }

        if (this.getCueDiaUltMod() != null && this.getCueDiaUltMod().longValue() == -999) {
            conditions += " AND CUE_DIA_ULT_MOD IS NULL";
        } else if (this.getCueDiaUltMod() != null) {
            conditions += " AND CUE_DIA_ULT_MOD = ?";
            values.add(this.getCueDiaUltMod());
        }

        if (this.getCueCveStCuenta() != null && "null".equals(this.getCueCveStCuenta())) {
            conditions += " AND CUE_CVE_ST_CUENTA IS NULL";
        } else if (this.getCueCveStCuenta() != null) {
            conditions += " AND CUE_CVE_ST_CUENTA = ?";
            values.add(this.getCueCveStCuenta());
        }

        if (this.getCueConciliacion() != null && this.getCueConciliacion().longValue() == -999) {
            conditions += " AND CUE_CONCILIACION IS NULL";
        } else if (this.getCueConciliacion() != null) {
            conditions += " AND CUE_CONCILIACION = ?";
            values.add(this.getCueConciliacion());
        }

        if (this.getCueTipoPersona() != null && "null".equals(this.getCueTipoPersona())) {
            conditions += " AND CUE_TIPO_PERSONA IS NULL";
        } else if (this.getCueTipoPersona() != null) {
            conditions += " AND CUE_TIPO_PERSONA = ?";
            values.add(this.getCueTipoPersona());
        }

        if (this.getCueSat() != null && this.getCueSat().longValue() == -999) {
            conditions += " AND CUE_SAT IS NULL";
        } else if (this.getCueSat() != null) {
            conditions += " AND CUE_SAT = ?";
            values.add(this.getCueSat());
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
        String sql = "UPDATE CUENTACOH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " CUE_NUM_CTAM = ?, ";
        values.add(this.getCueNumCtam());
        fields += " CUE_NUM_SCTA = ?, ";
        values.add(this.getCueNumScta());
        fields += " CUE_NUM_SSCTA = ?, ";
        values.add(this.getCueNumSscta());
        fields += " CUE_NUM_SSSCTA = ?, ";
        values.add(this.getCueNumSsscta());
        fields += " CUE_NUM_SSSSCTA = ?, ";
        values.add(this.getCueNumSssscta());
        fields += " CUE_NUM_SSSSSCTA = ?, ";
        values.add(this.getCueNumSsssscta());
        fields += " CUE_NUM_AUX1 = ?, ";
        values.add(this.getCueNumAux1());
        fields += " CUE_NUM_AUX2 = ?, ";
        values.add(this.getCueNumAux2());
        fields += " CUE_NUM_AUX3 = ?, ";
        values.add(this.getCueNumAux3());
        fields += " CUE_NOM_CTA = ?, ";
        values.add(this.getCueNomCta());
        fields += " CUE_CVE_ACREEDORA = ?, ";
        values.add(this.getCueCveAcreedora());
        fields += " CUE_CVE_DEUDORA = ?, ";
        values.add(this.getCueCveDeudora());
        fields += " CUE_CVE_MOVTO_CTA = ?, ";
        values.add(this.getCueCveMovtoCta());
        fields += " CUE_CVE_ACUM_RUBRO = ?, ";
        values.add(this.getCueCveAcumRubro());
        fields += " CUE_ANO_ALTA_REG = ?, ";
        values.add(this.getCueAnoAltaReg());
        fields += " CUE_MES_ALTA_REG = ?, ";
        values.add(this.getCueMesAltaReg());
        fields += " CUE_DIA_ALTA_REG = ?, ";
        values.add(this.getCueDiaAltaReg());
        fields += " CUE_ANO_ULT_MOD = ?, ";
        values.add(this.getCueAnoUltMod());
        fields += " CUE_MES_ULT_MOD = ?, ";
        values.add(this.getCueMesUltMod());
        fields += " CUE_DIA_ULT_MOD = ?, ";
        values.add(this.getCueDiaUltMod());
        fields += " CUE_CVE_ST_CUENTA = ?, ";
        values.add(this.getCueCveStCuenta());
        fields += " CUE_CONCILIACION = ?, ";
        values.add(this.getCueConciliacion());
        fields += " CUE_TIPO_PERSONA = ?, ";
        values.add(this.getCueTipoPersona());
        fields += " CUE_SAT = ?, ";
        values.add(this.getCueSat());
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
        String sql = "INSERT INTO CUENTACOH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CUE_NUM_CTAM";
        fieldValues += ", ?";
        values.add(this.getCueNumCtam());

        fields += ", CUE_NUM_SCTA";
        fieldValues += ", ?";
        values.add(this.getCueNumScta());

        fields += ", CUE_NUM_SSCTA";
        fieldValues += ", ?";
        values.add(this.getCueNumSscta());

        fields += ", CUE_NUM_SSSCTA";
        fieldValues += ", ?";
        values.add(this.getCueNumSsscta());

        fields += ", CUE_NUM_SSSSCTA";
        fieldValues += ", ?";
        values.add(this.getCueNumSssscta());

        fields += ", CUE_NUM_SSSSSCTA";
        fieldValues += ", ?";
        values.add(this.getCueNumSsssscta());

        fields += ", CUE_NUM_AUX1";
        fieldValues += ", ?";
        values.add(this.getCueNumAux1());

        fields += ", CUE_NUM_AUX2";
        fieldValues += ", ?";
        values.add(this.getCueNumAux2());

        fields += ", CUE_NUM_AUX3";
        fieldValues += ", ?";
        values.add(this.getCueNumAux3());

        fields += ", CUE_NOM_CTA";
        fieldValues += ", ?";
        values.add(this.getCueNomCta());

        fields += ", CUE_CVE_ACREEDORA";
        fieldValues += ", ?";
        values.add(this.getCueCveAcreedora());

        fields += ", CUE_CVE_DEUDORA";
        fieldValues += ", ?";
        values.add(this.getCueCveDeudora());

        fields += ", CUE_CVE_MOVTO_CTA";
        fieldValues += ", ?";
        values.add(this.getCueCveMovtoCta());

        fields += ", CUE_CVE_ACUM_RUBRO";
        fieldValues += ", ?";
        values.add(this.getCueCveAcumRubro());

        fields += ", CUE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCueAnoAltaReg());

        fields += ", CUE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCueMesAltaReg());

        fields += ", CUE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCueDiaAltaReg());

        fields += ", CUE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCueAnoUltMod());

        fields += ", CUE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCueMesUltMod());

        fields += ", CUE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCueDiaUltMod());

        fields += ", CUE_CVE_ST_CUENTA";
        fieldValues += ", ?";
        values.add(this.getCueCveStCuenta());

        fields += ", CUE_CONCILIACION";
        fieldValues += ", ?";
        values.add(this.getCueConciliacion());

        fields += ", CUE_TIPO_PERSONA";
        fieldValues += ", ?";
        values.add(this.getCueTipoPersona());

        fields += ", CUE_SAT";
        fieldValues += ", ?";
        values.add(this.getCueSat());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CUENTACOH WHERE ";

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
        Cuentacoh instance = (Cuentacoh) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCueNumCtam().equals(instance.getCueNumCtam()))
            equalObjects = false;
        if (equalObjects && !this.getCueNumScta().equals(instance.getCueNumScta()))
            equalObjects = false;
        if (equalObjects && !this.getCueNumSscta().equals(instance.getCueNumSscta()))
            equalObjects = false;
        if (equalObjects && !this.getCueNumSsscta().equals(instance.getCueNumSsscta()))
            equalObjects = false;
        if (equalObjects && !this.getCueNumSssscta().equals(instance.getCueNumSssscta()))
            equalObjects = false;
        if (equalObjects && !this.getCueNumSsssscta().equals(instance.getCueNumSsssscta()))
            equalObjects = false;
        if (equalObjects && !this.getCueNumAux1().equals(instance.getCueNumAux1()))
            equalObjects = false;
        if (equalObjects && !this.getCueNumAux2().equals(instance.getCueNumAux2()))
            equalObjects = false;
        if (equalObjects && !this.getCueNumAux3().equals(instance.getCueNumAux3()))
            equalObjects = false;
        if (equalObjects && !this.getCueNomCta().equals(instance.getCueNomCta()))
            equalObjects = false;
        if (equalObjects && !this.getCueCveAcreedora().equals(instance.getCueCveAcreedora()))
            equalObjects = false;
        if (equalObjects && !this.getCueCveDeudora().equals(instance.getCueCveDeudora()))
            equalObjects = false;
        if (equalObjects && !this.getCueCveMovtoCta().equals(instance.getCueCveMovtoCta()))
            equalObjects = false;
        if (equalObjects && !this.getCueCveAcumRubro().equals(instance.getCueCveAcumRubro()))
            equalObjects = false;
        if (equalObjects && !this.getCueAnoAltaReg().equals(instance.getCueAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCueMesAltaReg().equals(instance.getCueMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCueDiaAltaReg().equals(instance.getCueDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCueAnoUltMod().equals(instance.getCueAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCueMesUltMod().equals(instance.getCueMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCueDiaUltMod().equals(instance.getCueDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCueCveStCuenta().equals(instance.getCueCveStCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getCueConciliacion().equals(instance.getCueConciliacion()))
            equalObjects = false;
        if (equalObjects && !this.getCueTipoPersona().equals(instance.getCueTipoPersona()))
            equalObjects = false;
        if (equalObjects && !this.getCueSat().equals(instance.getCueSat()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Cuentacoh result = new Cuentacoh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCueNumCtam((BigDecimal) objectData.getData("CUE_NUM_CTAM"));
        result.setCueNumScta((BigDecimal) objectData.getData("CUE_NUM_SCTA"));
        result.setCueNumSscta((BigDecimal) objectData.getData("CUE_NUM_SSCTA"));
        result.setCueNumSsscta((BigDecimal) objectData.getData("CUE_NUM_SSSCTA"));
        result.setCueNumSssscta((BigDecimal) objectData.getData("CUE_NUM_SSSSCTA"));
        result.setCueNumSsssscta((BigDecimal) objectData.getData("CUE_NUM_SSSSSCTA"));
        result.setCueNumAux1((BigDecimal) objectData.getData("CUE_NUM_AUX1"));
        result.setCueNumAux2((BigDecimal) objectData.getData("CUE_NUM_AUX2"));
        result.setCueNumAux3((BigDecimal) objectData.getData("CUE_NUM_AUX3"));
        result.setCueNomCta((String) objectData.getData("CUE_NOM_CTA"));
        result.setCueCveAcreedora((BigDecimal) objectData.getData("CUE_CVE_ACREEDORA"));
        result.setCueCveDeudora((BigDecimal) objectData.getData("CUE_CVE_DEUDORA"));
        result.setCueCveMovtoCta((String) objectData.getData("CUE_CVE_MOVTO_CTA"));
        result.setCueCveAcumRubro((String) objectData.getData("CUE_CVE_ACUM_RUBRO"));
        result.setCueAnoAltaReg((BigDecimal) objectData.getData("CUE_ANO_ALTA_REG"));
        result.setCueMesAltaReg((BigDecimal) objectData.getData("CUE_MES_ALTA_REG"));
        result.setCueDiaAltaReg((BigDecimal) objectData.getData("CUE_DIA_ALTA_REG"));
        result.setCueAnoUltMod((BigDecimal) objectData.getData("CUE_ANO_ULT_MOD"));
        result.setCueMesUltMod((BigDecimal) objectData.getData("CUE_MES_ULT_MOD"));
        result.setCueDiaUltMod((BigDecimal) objectData.getData("CUE_DIA_ULT_MOD"));
        result.setCueCveStCuenta((String) objectData.getData("CUE_CVE_ST_CUENTA"));
        result.setCueConciliacion((BigDecimal) objectData.getData("CUE_CONCILIACION"));
        result.setCueTipoPersona((String) objectData.getData("CUE_TIPO_PERSONA"));
        result.setCueSat((BigDecimal) objectData.getData("CUE_SAT"));

        return result;

    }

}
