package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "TRANSACC_PK", columns = { "TRS_NUM_MODULO", "TRS_NUM_TRANSAC" }, sequences = { "MANUAL" })
public class Transacc extends DomainObject {

    BigDecimal trsNumModulo = null;
    BigDecimal trsNumTransac = null;
    String trsNomTransac = null;
    BigDecimal trsHrMaxEjec = null;
    BigDecimal trsMinMaxEjec = null;
    BigDecimal trsNumGuiaCont = null;
    BigDecimal trsModuloCancel = null;
    BigDecimal trsTransacCancel = null;
    String trsCveFuncionTr = null;
    BigDecimal trsCveImpEdocta = null;
    BigDecimal trsCostoTransac = null;
    BigDecimal trsAnoAltaReg = null;
    BigDecimal trsMesAltaReg = null;
    BigDecimal trsDiaAltaReg = null;
    BigDecimal trsAnoUltMod = null;
    BigDecimal trsMesUltMod = null;
    BigDecimal trsDiaUltMod = null;
    String trsCveStTransac = null;
    BigDecimal trsCveAcumAdcta = null;
    BigDecimal trsNumConcepto = null;

    public Transacc() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrsNumModulo(BigDecimal trsNumModulo) {
        this.trsNumModulo = trsNumModulo;
    }

    public BigDecimal getTrsNumModulo() {
        return this.trsNumModulo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrsNumTransac(BigDecimal trsNumTransac) {
        this.trsNumTransac = trsNumTransac;
    }

    public BigDecimal getTrsNumTransac() {
        return this.trsNumTransac;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrsNomTransac(String trsNomTransac) {
        this.trsNomTransac = trsNomTransac;
    }

    public String getTrsNomTransac() {
        return this.trsNomTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrsHrMaxEjec(BigDecimal trsHrMaxEjec) {
        this.trsHrMaxEjec = trsHrMaxEjec;
    }

    public BigDecimal getTrsHrMaxEjec() {
        return this.trsHrMaxEjec;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrsMinMaxEjec(BigDecimal trsMinMaxEjec) {
        this.trsMinMaxEjec = trsMinMaxEjec;
    }

    public BigDecimal getTrsMinMaxEjec() {
        return this.trsMinMaxEjec;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrsNumGuiaCont(BigDecimal trsNumGuiaCont) {
        this.trsNumGuiaCont = trsNumGuiaCont;
    }

    public BigDecimal getTrsNumGuiaCont() {
        return this.trsNumGuiaCont;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrsModuloCancel(BigDecimal trsModuloCancel) {
        this.trsModuloCancel = trsModuloCancel;
    }

    public BigDecimal getTrsModuloCancel() {
        return this.trsModuloCancel;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrsTransacCancel(BigDecimal trsTransacCancel) {
        this.trsTransacCancel = trsTransacCancel;
    }

    public BigDecimal getTrsTransacCancel() {
        return this.trsTransacCancel;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrsCveFuncionTr(String trsCveFuncionTr) {
        this.trsCveFuncionTr = trsCveFuncionTr;
    }

    public String getTrsCveFuncionTr() {
        return this.trsCveFuncionTr;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrsCveImpEdocta(BigDecimal trsCveImpEdocta) {
        this.trsCveImpEdocta = trsCveImpEdocta;
    }

    public BigDecimal getTrsCveImpEdocta() {
        return this.trsCveImpEdocta;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTrsCostoTransac(BigDecimal trsCostoTransac) {
        this.trsCostoTransac = trsCostoTransac;
    }

    public BigDecimal getTrsCostoTransac() {
        return this.trsCostoTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTrsAnoAltaReg(BigDecimal trsAnoAltaReg) {
        this.trsAnoAltaReg = trsAnoAltaReg;
    }

    public BigDecimal getTrsAnoAltaReg() {
        return this.trsAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTrsMesAltaReg(BigDecimal trsMesAltaReg) {
        this.trsMesAltaReg = trsMesAltaReg;
    }

    public BigDecimal getTrsMesAltaReg() {
        return this.trsMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTrsDiaAltaReg(BigDecimal trsDiaAltaReg) {
        this.trsDiaAltaReg = trsDiaAltaReg;
    }

    public BigDecimal getTrsDiaAltaReg() {
        return this.trsDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTrsAnoUltMod(BigDecimal trsAnoUltMod) {
        this.trsAnoUltMod = trsAnoUltMod;
    }

    public BigDecimal getTrsAnoUltMod() {
        return this.trsAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTrsMesUltMod(BigDecimal trsMesUltMod) {
        this.trsMesUltMod = trsMesUltMod;
    }

    public BigDecimal getTrsMesUltMod() {
        return this.trsMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTrsDiaUltMod(BigDecimal trsDiaUltMod) {
        this.trsDiaUltMod = trsDiaUltMod;
    }

    public BigDecimal getTrsDiaUltMod() {
        return this.trsDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTrsCveStTransac(String trsCveStTransac) {
        this.trsCveStTransac = trsCveStTransac;
    }

    public String getTrsCveStTransac() {
        return this.trsCveStTransac;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTrsCveAcumAdcta(BigDecimal trsCveAcumAdcta) {
        this.trsCveAcumAdcta = trsCveAcumAdcta;
    }

    public BigDecimal getTrsCveAcumAdcta() {
        return this.trsCveAcumAdcta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTrsNumConcepto(BigDecimal trsNumConcepto) {
        this.trsNumConcepto = trsNumConcepto;
    }

    public BigDecimal getTrsNumConcepto() {
        return this.trsNumConcepto;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM TRANSACC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTrsNumModulo() != null && this.getTrsNumModulo().longValue() == -999) {
            conditions += " AND TRS_NUM_MODULO IS NULL";
        } else if (this.getTrsNumModulo() != null) {
            conditions += " AND TRS_NUM_MODULO = ?";
            values.add(this.getTrsNumModulo());
        }

        if (this.getTrsNumTransac() != null && this.getTrsNumTransac().longValue() == -999) {
            conditions += " AND TRS_NUM_TRANSAC IS NULL";
        } else if (this.getTrsNumTransac() != null) {
            conditions += " AND TRS_NUM_TRANSAC = ?";
            values.add(this.getTrsNumTransac());
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
        String sql = "SELECT * FROM TRANSACC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTrsNumModulo() != null && this.getTrsNumModulo().longValue() == -999) {
            conditions += " AND TRS_NUM_MODULO IS NULL";
        } else if (this.getTrsNumModulo() != null) {
            conditions += " AND TRS_NUM_MODULO = ?";
            values.add(this.getTrsNumModulo());
        }

        if (this.getTrsNumTransac() != null && this.getTrsNumTransac().longValue() == -999) {
            conditions += " AND TRS_NUM_TRANSAC IS NULL";
        } else if (this.getTrsNumTransac() != null) {
            conditions += " AND TRS_NUM_TRANSAC = ?";
            values.add(this.getTrsNumTransac());
        }

        if (this.getTrsNomTransac() != null && "null".equals(this.getTrsNomTransac())) {
            conditions += " AND TRS_NOM_TRANSAC IS NULL";
        } else if (this.getTrsNomTransac() != null) {
            conditions += " AND TRS_NOM_TRANSAC = ?";
            values.add(this.getTrsNomTransac());
        }

        if (this.getTrsHrMaxEjec() != null && this.getTrsHrMaxEjec().longValue() == -999) {
            conditions += " AND TRS_HR_MAX_EJEC IS NULL";
        } else if (this.getTrsHrMaxEjec() != null) {
            conditions += " AND TRS_HR_MAX_EJEC = ?";
            values.add(this.getTrsHrMaxEjec());
        }

        if (this.getTrsMinMaxEjec() != null && this.getTrsMinMaxEjec().longValue() == -999) {
            conditions += " AND TRS_MIN_MAX_EJEC IS NULL";
        } else if (this.getTrsMinMaxEjec() != null) {
            conditions += " AND TRS_MIN_MAX_EJEC = ?";
            values.add(this.getTrsMinMaxEjec());
        }

        if (this.getTrsNumGuiaCont() != null && this.getTrsNumGuiaCont().longValue() == -999) {
            conditions += " AND TRS_NUM_GUIA_CONT IS NULL";
        } else if (this.getTrsNumGuiaCont() != null) {
            conditions += " AND TRS_NUM_GUIA_CONT = ?";
            values.add(this.getTrsNumGuiaCont());
        }

        if (this.getTrsModuloCancel() != null && this.getTrsModuloCancel().longValue() == -999) {
            conditions += " AND TRS_MODULO_CANCEL IS NULL";
        } else if (this.getTrsModuloCancel() != null) {
            conditions += " AND TRS_MODULO_CANCEL = ?";
            values.add(this.getTrsModuloCancel());
        }

        if (this.getTrsTransacCancel() != null && this.getTrsTransacCancel().longValue() == -999) {
            conditions += " AND TRS_TRANSAC_CANCEL IS NULL";
        } else if (this.getTrsTransacCancel() != null) {
            conditions += " AND TRS_TRANSAC_CANCEL = ?";
            values.add(this.getTrsTransacCancel());
        }

        if (this.getTrsCveFuncionTr() != null && "null".equals(this.getTrsCveFuncionTr())) {
            conditions += " AND TRS_CVE_FUNCION_TR IS NULL";
        } else if (this.getTrsCveFuncionTr() != null) {
            conditions += " AND TRS_CVE_FUNCION_TR = ?";
            values.add(this.getTrsCveFuncionTr());
        }

        if (this.getTrsCveImpEdocta() != null && this.getTrsCveImpEdocta().longValue() == -999) {
            conditions += " AND TRS_CVE_IMP_EDOCTA IS NULL";
        } else if (this.getTrsCveImpEdocta() != null) {
            conditions += " AND TRS_CVE_IMP_EDOCTA = ?";
            values.add(this.getTrsCveImpEdocta());
        }

        if (this.getTrsCostoTransac() != null && this.getTrsCostoTransac().longValue() == -999) {
            conditions += " AND TRS_COSTO_TRANSAC IS NULL";
        } else if (this.getTrsCostoTransac() != null) {
            conditions += " AND TRS_COSTO_TRANSAC = ?";
            values.add(this.getTrsCostoTransac());
        }

        if (this.getTrsAnoAltaReg() != null && this.getTrsAnoAltaReg().longValue() == -999) {
            conditions += " AND TRS_ANO_ALTA_REG IS NULL";
        } else if (this.getTrsAnoAltaReg() != null) {
            conditions += " AND TRS_ANO_ALTA_REG = ?";
            values.add(this.getTrsAnoAltaReg());
        }

        if (this.getTrsMesAltaReg() != null && this.getTrsMesAltaReg().longValue() == -999) {
            conditions += " AND TRS_MES_ALTA_REG IS NULL";
        } else if (this.getTrsMesAltaReg() != null) {
            conditions += " AND TRS_MES_ALTA_REG = ?";
            values.add(this.getTrsMesAltaReg());
        }

        if (this.getTrsDiaAltaReg() != null && this.getTrsDiaAltaReg().longValue() == -999) {
            conditions += " AND TRS_DIA_ALTA_REG IS NULL";
        } else if (this.getTrsDiaAltaReg() != null) {
            conditions += " AND TRS_DIA_ALTA_REG = ?";
            values.add(this.getTrsDiaAltaReg());
        }

        if (this.getTrsAnoUltMod() != null && this.getTrsAnoUltMod().longValue() == -999) {
            conditions += " AND TRS_ANO_ULT_MOD IS NULL";
        } else if (this.getTrsAnoUltMod() != null) {
            conditions += " AND TRS_ANO_ULT_MOD = ?";
            values.add(this.getTrsAnoUltMod());
        }

        if (this.getTrsMesUltMod() != null && this.getTrsMesUltMod().longValue() == -999) {
            conditions += " AND TRS_MES_ULT_MOD IS NULL";
        } else if (this.getTrsMesUltMod() != null) {
            conditions += " AND TRS_MES_ULT_MOD = ?";
            values.add(this.getTrsMesUltMod());
        }

        if (this.getTrsDiaUltMod() != null && this.getTrsDiaUltMod().longValue() == -999) {
            conditions += " AND TRS_DIA_ULT_MOD IS NULL";
        } else if (this.getTrsDiaUltMod() != null) {
            conditions += " AND TRS_DIA_ULT_MOD = ?";
            values.add(this.getTrsDiaUltMod());
        }

        if (this.getTrsCveStTransac() != null && "null".equals(this.getTrsCveStTransac())) {
            conditions += " AND TRS_CVE_ST_TRANSAC IS NULL";
        } else if (this.getTrsCveStTransac() != null) {
            conditions += " AND TRS_CVE_ST_TRANSAC = ?";
            values.add(this.getTrsCveStTransac());
        }

        if (this.getTrsCveAcumAdcta() != null && this.getTrsCveAcumAdcta().longValue() == -999) {
            conditions += " AND TRS_CVE_ACUM_ADCTA IS NULL";
        } else if (this.getTrsCveAcumAdcta() != null) {
            conditions += " AND TRS_CVE_ACUM_ADCTA = ?";
            values.add(this.getTrsCveAcumAdcta());
        }

        if (this.getTrsNumConcepto() != null && this.getTrsNumConcepto().longValue() == -999) {
            conditions += " AND TRS_NUM_CONCEPTO IS NULL";
        } else if (this.getTrsNumConcepto() != null) {
            conditions += " AND TRS_NUM_CONCEPTO = ?";
            values.add(this.getTrsNumConcepto());
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
        String sql = "UPDATE TRANSACC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TRS_NUM_MODULO = ?";
        pkValues.add(this.getTrsNumModulo());
        conditions += " AND TRS_NUM_TRANSAC = ?";
        pkValues.add(this.getTrsNumTransac());
        fields += " TRS_NOM_TRANSAC = ?, ";
        values.add(this.getTrsNomTransac());
        fields += " TRS_HR_MAX_EJEC = ?, ";
        values.add(this.getTrsHrMaxEjec());
        fields += " TRS_MIN_MAX_EJEC = ?, ";
        values.add(this.getTrsMinMaxEjec());
        fields += " TRS_NUM_GUIA_CONT = ?, ";
        values.add(this.getTrsNumGuiaCont());
        fields += " TRS_MODULO_CANCEL = ?, ";
        values.add(this.getTrsModuloCancel());
        fields += " TRS_TRANSAC_CANCEL = ?, ";
        values.add(this.getTrsTransacCancel());
        fields += " TRS_CVE_FUNCION_TR = ?, ";
        values.add(this.getTrsCveFuncionTr());
        fields += " TRS_CVE_IMP_EDOCTA = ?, ";
        values.add(this.getTrsCveImpEdocta());
        fields += " TRS_COSTO_TRANSAC = ?, ";
        values.add(this.getTrsCostoTransac());
        fields += " TRS_ANO_ALTA_REG = ?, ";
        values.add(this.getTrsAnoAltaReg());
        fields += " TRS_MES_ALTA_REG = ?, ";
        values.add(this.getTrsMesAltaReg());
        fields += " TRS_DIA_ALTA_REG = ?, ";
        values.add(this.getTrsDiaAltaReg());
        fields += " TRS_ANO_ULT_MOD = ?, ";
        values.add(this.getTrsAnoUltMod());
        fields += " TRS_MES_ULT_MOD = ?, ";
        values.add(this.getTrsMesUltMod());
        fields += " TRS_DIA_ULT_MOD = ?, ";
        values.add(this.getTrsDiaUltMod());
        fields += " TRS_CVE_ST_TRANSAC = ?, ";
        values.add(this.getTrsCveStTransac());
        fields += " TRS_CVE_ACUM_ADCTA = ?, ";
        values.add(this.getTrsCveAcumAdcta());
        fields += " TRS_NUM_CONCEPTO = ?, ";
        values.add(this.getTrsNumConcepto());
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
        String sql = "INSERT INTO TRANSACC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TRS_NUM_MODULO";
        fieldValues += ", ?";
        values.add(this.getTrsNumModulo());

        fields += ", TRS_NUM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getTrsNumTransac());

        fields += ", TRS_NOM_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getTrsNomTransac());

        fields += ", TRS_HR_MAX_EJEC";
        fieldValues += ", ?";
        values.add(this.getTrsHrMaxEjec());

        fields += ", TRS_MIN_MAX_EJEC";
        fieldValues += ", ?";
        values.add(this.getTrsMinMaxEjec());

        fields += ", TRS_NUM_GUIA_CONT";
        fieldValues += ", ?";
        values.add(this.getTrsNumGuiaCont());

        fields += ", TRS_MODULO_CANCEL";
        fieldValues += ", ?";
        values.add(this.getTrsModuloCancel());

        fields += ", TRS_TRANSAC_CANCEL";
        fieldValues += ", ?";
        values.add(this.getTrsTransacCancel());

        fields += ", TRS_CVE_FUNCION_TR";
        fieldValues += ", ?";
        values.add(this.getTrsCveFuncionTr());

        fields += ", TRS_CVE_IMP_EDOCTA";
        fieldValues += ", ?";
        values.add(this.getTrsCveImpEdocta());

        fields += ", TRS_COSTO_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getTrsCostoTransac());

        fields += ", TRS_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTrsAnoAltaReg());

        fields += ", TRS_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTrsMesAltaReg());

        fields += ", TRS_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getTrsDiaAltaReg());

        fields += ", TRS_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTrsAnoUltMod());

        fields += ", TRS_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTrsMesUltMod());

        fields += ", TRS_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getTrsDiaUltMod());

        fields += ", TRS_CVE_ST_TRANSAC";
        fieldValues += ", ?";
        values.add(this.getTrsCveStTransac());

        fields += ", TRS_CVE_ACUM_ADCTA";
        fieldValues += ", ?";
        values.add(this.getTrsCveAcumAdcta());

        fields += ", TRS_NUM_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getTrsNumConcepto());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM TRANSACC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TRS_NUM_MODULO = ?";
        values.add(this.getTrsNumModulo());
        conditions += " AND TRS_NUM_TRANSAC = ?";
        values.add(this.getTrsNumTransac());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Transacc instance = (Transacc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTrsNumModulo().equals(instance.getTrsNumModulo()))
            equalObjects = false;
        if (equalObjects && !this.getTrsNumTransac().equals(instance.getTrsNumTransac()))
            equalObjects = false;
        if (equalObjects && !this.getTrsNomTransac().equals(instance.getTrsNomTransac()))
            equalObjects = false;
        if (equalObjects && !this.getTrsHrMaxEjec().equals(instance.getTrsHrMaxEjec()))
            equalObjects = false;
        if (equalObjects && !this.getTrsMinMaxEjec().equals(instance.getTrsMinMaxEjec()))
            equalObjects = false;
        if (equalObjects && !this.getTrsNumGuiaCont().equals(instance.getTrsNumGuiaCont()))
            equalObjects = false;
        if (equalObjects && !this.getTrsModuloCancel().equals(instance.getTrsModuloCancel()))
            equalObjects = false;
        if (equalObjects && !this.getTrsTransacCancel().equals(instance.getTrsTransacCancel()))
            equalObjects = false;
        if (equalObjects && !this.getTrsCveFuncionTr().equals(instance.getTrsCveFuncionTr()))
            equalObjects = false;
        if (equalObjects && !this.getTrsCveImpEdocta().equals(instance.getTrsCveImpEdocta()))
            equalObjects = false;
        if (equalObjects && !this.getTrsCostoTransac().equals(instance.getTrsCostoTransac()))
            equalObjects = false;
        if (equalObjects && !this.getTrsAnoAltaReg().equals(instance.getTrsAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTrsMesAltaReg().equals(instance.getTrsMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTrsDiaAltaReg().equals(instance.getTrsDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getTrsAnoUltMod().equals(instance.getTrsAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTrsMesUltMod().equals(instance.getTrsMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTrsDiaUltMod().equals(instance.getTrsDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getTrsCveStTransac().equals(instance.getTrsCveStTransac()))
            equalObjects = false;
        if (equalObjects && !this.getTrsCveAcumAdcta().equals(instance.getTrsCveAcumAdcta()))
            equalObjects = false;
        if (equalObjects && !this.getTrsNumConcepto().equals(instance.getTrsNumConcepto()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Transacc result = new Transacc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTrsNumModulo((BigDecimal) objectData.getData("TRS_NUM_MODULO"));
        result.setTrsNumTransac((BigDecimal) objectData.getData("TRS_NUM_TRANSAC"));
        result.setTrsNomTransac((String) objectData.getData("TRS_NOM_TRANSAC"));
        result.setTrsHrMaxEjec((BigDecimal) objectData.getData("TRS_HR_MAX_EJEC"));
        result.setTrsMinMaxEjec((BigDecimal) objectData.getData("TRS_MIN_MAX_EJEC"));
        result.setTrsNumGuiaCont((BigDecimal) objectData.getData("TRS_NUM_GUIA_CONT"));
        result.setTrsModuloCancel((BigDecimal) objectData.getData("TRS_MODULO_CANCEL"));
        result.setTrsTransacCancel((BigDecimal) objectData.getData("TRS_TRANSAC_CANCEL"));
        result.setTrsCveFuncionTr((String) objectData.getData("TRS_CVE_FUNCION_TR"));
        result.setTrsCveImpEdocta((BigDecimal) objectData.getData("TRS_CVE_IMP_EDOCTA"));
        result.setTrsCostoTransac((BigDecimal) objectData.getData("TRS_COSTO_TRANSAC"));
        result.setTrsAnoAltaReg((BigDecimal) objectData.getData("TRS_ANO_ALTA_REG"));
        result.setTrsMesAltaReg((BigDecimal) objectData.getData("TRS_MES_ALTA_REG"));
        result.setTrsDiaAltaReg((BigDecimal) objectData.getData("TRS_DIA_ALTA_REG"));
        result.setTrsAnoUltMod((BigDecimal) objectData.getData("TRS_ANO_ULT_MOD"));
        result.setTrsMesUltMod((BigDecimal) objectData.getData("TRS_MES_ULT_MOD"));
        result.setTrsDiaUltMod((BigDecimal) objectData.getData("TRS_DIA_ULT_MOD"));
        result.setTrsCveStTransac((String) objectData.getData("TRS_CVE_ST_TRANSAC"));
        result.setTrsCveAcumAdcta((BigDecimal) objectData.getData("TRS_CVE_ACUM_ADCTA"));
        result.setTrsNumConcepto((BigDecimal) objectData.getData("TRS_NUM_CONCEPTO"));

        return result;

    }

}
