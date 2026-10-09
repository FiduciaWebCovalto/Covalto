package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DETPREST_PK", columns = { "DPR_NUM_CONTRATO", "DPR_NUM_DEPTO", "DPR_NUM_PARTICIP" }, sequences = { "MANUAL" })
public class Detprest extends DomainObject {

    BigDecimal dprNumContrato = null;
    BigDecimal dprNumDepto = null;
    BigDecimal dprNumParticip = null;
    String dprCveTipPresta = null;
    String dprRefPrestamo = null;
    BigDecimal dprNumPerPresta = null;
    String dprFecPeriodo = null;
    BigDecimal dprImpPeriodo = null;
    String dprFecPrestamo = null;
    BigDecimal dprImpAmorCap = null;
    BigDecimal dprImpAmorInter = null;
    BigDecimal dprImpMoratorios = null;
    BigDecimal dprMesAltaReg = null;
    BigDecimal dprDiaAltaReg = null;
    BigDecimal dprAnoUltMod = null;
    BigDecimal dprMesUltMod = null;
    BigDecimal dprDiaUltMod = null;
    String dprCveStDetpres = null;

    public Detprest() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDprNumContrato(BigDecimal dprNumContrato) {
        this.dprNumContrato = dprNumContrato;
    }

    public BigDecimal getDprNumContrato() {
        return this.dprNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDprNumDepto(BigDecimal dprNumDepto) {
        this.dprNumDepto = dprNumDepto;
    }

    public BigDecimal getDprNumDepto() {
        return this.dprNumDepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDprNumParticip(BigDecimal dprNumParticip) {
        this.dprNumParticip = dprNumParticip;
    }

    public BigDecimal getDprNumParticip() {
        return this.dprNumParticip;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDprCveTipPresta(String dprCveTipPresta) {
        this.dprCveTipPresta = dprCveTipPresta;
    }

    public String getDprCveTipPresta() {
        return this.dprCveTipPresta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDprRefPrestamo(String dprRefPrestamo) {
        this.dprRefPrestamo = dprRefPrestamo;
    }

    public String getDprRefPrestamo() {
        return this.dprRefPrestamo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDprNumPerPresta(BigDecimal dprNumPerPresta) {
        this.dprNumPerPresta = dprNumPerPresta;
    }

    public BigDecimal getDprNumPerPresta() {
        return this.dprNumPerPresta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDprFecPeriodo(String dprFecPeriodo) {
        this.dprFecPeriodo = dprFecPeriodo;
    }

    public String getDprFecPeriodo() {
        return this.dprFecPeriodo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDprImpPeriodo(BigDecimal dprImpPeriodo) {
        this.dprImpPeriodo = dprImpPeriodo;
    }

    public BigDecimal getDprImpPeriodo() {
        return this.dprImpPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDprFecPrestamo(String dprFecPrestamo) {
        this.dprFecPrestamo = dprFecPrestamo;
    }

    public String getDprFecPrestamo() {
        return this.dprFecPrestamo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDprImpAmorCap(BigDecimal dprImpAmorCap) {
        this.dprImpAmorCap = dprImpAmorCap;
    }

    public BigDecimal getDprImpAmorCap() {
        return this.dprImpAmorCap;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDprImpAmorInter(BigDecimal dprImpAmorInter) {
        this.dprImpAmorInter = dprImpAmorInter;
    }

    public BigDecimal getDprImpAmorInter() {
        return this.dprImpAmorInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDprImpMoratorios(BigDecimal dprImpMoratorios) {
        this.dprImpMoratorios = dprImpMoratorios;
    }

    public BigDecimal getDprImpMoratorios() {
        return this.dprImpMoratorios;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDprMesAltaReg(BigDecimal dprMesAltaReg) {
        this.dprMesAltaReg = dprMesAltaReg;
    }

    public BigDecimal getDprMesAltaReg() {
        return this.dprMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDprDiaAltaReg(BigDecimal dprDiaAltaReg) {
        this.dprDiaAltaReg = dprDiaAltaReg;
    }

    public BigDecimal getDprDiaAltaReg() {
        return this.dprDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDprAnoUltMod(BigDecimal dprAnoUltMod) {
        this.dprAnoUltMod = dprAnoUltMod;
    }

    public BigDecimal getDprAnoUltMod() {
        return this.dprAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDprMesUltMod(BigDecimal dprMesUltMod) {
        this.dprMesUltMod = dprMesUltMod;
    }

    public BigDecimal getDprMesUltMod() {
        return this.dprMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDprDiaUltMod(BigDecimal dprDiaUltMod) {
        this.dprDiaUltMod = dprDiaUltMod;
    }

    public BigDecimal getDprDiaUltMod() {
        return this.dprDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDprCveStDetpres(String dprCveStDetpres) {
        this.dprCveStDetpres = dprCveStDetpres;
    }

    public String getDprCveStDetpres() {
        return this.dprCveStDetpres;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DETPREST ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDprNumContrato() != null && this.getDprNumContrato().longValue() == -999) {
            conditions += " AND DPR_NUM_CONTRATO IS NULL";
        } else if (this.getDprNumContrato() != null) {
            conditions += " AND DPR_NUM_CONTRATO = ?";
            values.add(this.getDprNumContrato());
        }

        if (this.getDprNumDepto() != null && this.getDprNumDepto().longValue() == -999) {
            conditions += " AND DPR_NUM_DEPTO IS NULL";
        } else if (this.getDprNumDepto() != null) {
            conditions += " AND DPR_NUM_DEPTO = ?";
            values.add(this.getDprNumDepto());
        }

        if (this.getDprNumParticip() != null && this.getDprNumParticip().longValue() == -999) {
            conditions += " AND DPR_NUM_PARTICIP IS NULL";
        } else if (this.getDprNumParticip() != null) {
            conditions += " AND DPR_NUM_PARTICIP = ?";
            values.add(this.getDprNumParticip());
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
        String sql = "SELECT * FROM DETPREST ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDprNumContrato() != null && this.getDprNumContrato().longValue() == -999) {
            conditions += " AND DPR_NUM_CONTRATO IS NULL";
        } else if (this.getDprNumContrato() != null) {
            conditions += " AND DPR_NUM_CONTRATO = ?";
            values.add(this.getDprNumContrato());
        }

        if (this.getDprNumDepto() != null && this.getDprNumDepto().longValue() == -999) {
            conditions += " AND DPR_NUM_DEPTO IS NULL";
        } else if (this.getDprNumDepto() != null) {
            conditions += " AND DPR_NUM_DEPTO = ?";
            values.add(this.getDprNumDepto());
        }

        if (this.getDprNumParticip() != null && this.getDprNumParticip().longValue() == -999) {
            conditions += " AND DPR_NUM_PARTICIP IS NULL";
        } else if (this.getDprNumParticip() != null) {
            conditions += " AND DPR_NUM_PARTICIP = ?";
            values.add(this.getDprNumParticip());
        }

        if (this.getDprCveTipPresta() != null && "null".equals(this.getDprCveTipPresta())) {
            conditions += " AND DPR_CVE_TIP_PRESTA IS NULL";
        } else if (this.getDprCveTipPresta() != null) {
            conditions += " AND DPR_CVE_TIP_PRESTA = ?";
            values.add(this.getDprCveTipPresta());
        }

        if (this.getDprRefPrestamo() != null && "null".equals(this.getDprRefPrestamo())) {
            conditions += " AND DPR_REF_PRESTAMO IS NULL";
        } else if (this.getDprRefPrestamo() != null) {
            conditions += " AND DPR_REF_PRESTAMO = ?";
            values.add(this.getDprRefPrestamo());
        }

        if (this.getDprNumPerPresta() != null && this.getDprNumPerPresta().longValue() == -999) {
            conditions += " AND DPR_NUM_PER_PRESTA IS NULL";
        } else if (this.getDprNumPerPresta() != null) {
            conditions += " AND DPR_NUM_PER_PRESTA = ?";
            values.add(this.getDprNumPerPresta());
        }

        if (this.getDprFecPeriodo() != null && "null".equals(this.getDprFecPeriodo())) {
            conditions += " AND DPR_FEC_PERIODO IS NULL";
        } else if (this.getDprFecPeriodo() != null) {
            conditions += " AND DPR_FEC_PERIODO = ?";
            values.add(this.getDprFecPeriodo());
        }

        if (this.getDprImpPeriodo() != null && this.getDprImpPeriodo().longValue() == -999) {
            conditions += " AND DPR_IMP_PERIODO IS NULL";
        } else if (this.getDprImpPeriodo() != null) {
            conditions += " AND DPR_IMP_PERIODO = ?";
            values.add(this.getDprImpPeriodo());
        }

        if (this.getDprFecPrestamo() != null && "null".equals(this.getDprFecPrestamo())) {
            conditions += " AND DPR_FEC_PRESTAMO IS NULL";
        } else if (this.getDprFecPrestamo() != null) {
            conditions += " AND DPR_FEC_PRESTAMO = ?";
            values.add(this.getDprFecPrestamo());
        }

        if (this.getDprImpAmorCap() != null && this.getDprImpAmorCap().longValue() == -999) {
            conditions += " AND DPR_IMP_AMOR_CAP IS NULL";
        } else if (this.getDprImpAmorCap() != null) {
            conditions += " AND DPR_IMP_AMOR_CAP = ?";
            values.add(this.getDprImpAmorCap());
        }

        if (this.getDprImpAmorInter() != null && this.getDprImpAmorInter().longValue() == -999) {
            conditions += " AND DPR_IMP_AMOR_INTER IS NULL";
        } else if (this.getDprImpAmorInter() != null) {
            conditions += " AND DPR_IMP_AMOR_INTER = ?";
            values.add(this.getDprImpAmorInter());
        }

        if (this.getDprImpMoratorios() != null && this.getDprImpMoratorios().longValue() == -999) {
            conditions += " AND DPR_IMP_MORATORIOS IS NULL";
        } else if (this.getDprImpMoratorios() != null) {
            conditions += " AND DPR_IMP_MORATORIOS = ?";
            values.add(this.getDprImpMoratorios());
        }

        if (this.getDprMesAltaReg() != null && this.getDprMesAltaReg().longValue() == -999) {
            conditions += " AND DPR_MES_ALTA_REG IS NULL";
        } else if (this.getDprMesAltaReg() != null) {
            conditions += " AND DPR_MES_ALTA_REG = ?";
            values.add(this.getDprMesAltaReg());
        }

        if (this.getDprDiaAltaReg() != null && this.getDprDiaAltaReg().longValue() == -999) {
            conditions += " AND DPR_DIA_ALTA_REG IS NULL";
        } else if (this.getDprDiaAltaReg() != null) {
            conditions += " AND DPR_DIA_ALTA_REG = ?";
            values.add(this.getDprDiaAltaReg());
        }

        if (this.getDprAnoUltMod() != null && this.getDprAnoUltMod().longValue() == -999) {
            conditions += " AND DPR_ANO_ULT_MOD IS NULL";
        } else if (this.getDprAnoUltMod() != null) {
            conditions += " AND DPR_ANO_ULT_MOD = ?";
            values.add(this.getDprAnoUltMod());
        }

        if (this.getDprMesUltMod() != null && this.getDprMesUltMod().longValue() == -999) {
            conditions += " AND DPR_MES_ULT_MOD IS NULL";
        } else if (this.getDprMesUltMod() != null) {
            conditions += " AND DPR_MES_ULT_MOD = ?";
            values.add(this.getDprMesUltMod());
        }

        if (this.getDprDiaUltMod() != null && this.getDprDiaUltMod().longValue() == -999) {
            conditions += " AND DPR_DIA_ULT_MOD IS NULL";
        } else if (this.getDprDiaUltMod() != null) {
            conditions += " AND DPR_DIA_ULT_MOD = ?";
            values.add(this.getDprDiaUltMod());
        }

        if (this.getDprCveStDetpres() != null && "null".equals(this.getDprCveStDetpres())) {
            conditions += " AND DPR_CVE_ST_DETPRES IS NULL";
        } else if (this.getDprCveStDetpres() != null) {
            conditions += " AND DPR_CVE_ST_DETPRES = ?";
            values.add(this.getDprCveStDetpres());
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
        String sql = "UPDATE DETPREST SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DPR_NUM_CONTRATO = ?";
        pkValues.add(this.getDprNumContrato());
        conditions += " AND DPR_NUM_DEPTO = ?";
        pkValues.add(this.getDprNumDepto());
        conditions += " AND DPR_NUM_PARTICIP = ?";
        pkValues.add(this.getDprNumParticip());
        fields += " DPR_CVE_TIP_PRESTA = ?, ";
        values.add(this.getDprCveTipPresta());
        fields += " DPR_REF_PRESTAMO = ?, ";
        values.add(this.getDprRefPrestamo());
        fields += " DPR_NUM_PER_PRESTA = ?, ";
        values.add(this.getDprNumPerPresta());
        fields += " DPR_FEC_PERIODO = ?, ";
        values.add(this.getDprFecPeriodo());
        fields += " DPR_IMP_PERIODO = ?, ";
        values.add(this.getDprImpPeriodo());
        fields += " DPR_FEC_PRESTAMO = ?, ";
        values.add(this.getDprFecPrestamo());
        fields += " DPR_IMP_AMOR_CAP = ?, ";
        values.add(this.getDprImpAmorCap());
        fields += " DPR_IMP_AMOR_INTER = ?, ";
        values.add(this.getDprImpAmorInter());
        fields += " DPR_IMP_MORATORIOS = ?, ";
        values.add(this.getDprImpMoratorios());
        fields += " DPR_MES_ALTA_REG = ?, ";
        values.add(this.getDprMesAltaReg());
        fields += " DPR_DIA_ALTA_REG = ?, ";
        values.add(this.getDprDiaAltaReg());
        fields += " DPR_ANO_ULT_MOD = ?, ";
        values.add(this.getDprAnoUltMod());
        fields += " DPR_MES_ULT_MOD = ?, ";
        values.add(this.getDprMesUltMod());
        fields += " DPR_DIA_ULT_MOD = ?, ";
        values.add(this.getDprDiaUltMod());
        fields += " DPR_CVE_ST_DETPRES = ?, ";
        values.add(this.getDprCveStDetpres());
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
        String sql = "INSERT INTO DETPREST ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DPR_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getDprNumContrato());

        fields += ", DPR_NUM_DEPTO";
        fieldValues += ", ?";
        values.add(this.getDprNumDepto());

        fields += ", DPR_NUM_PARTICIP";
        fieldValues += ", ?";
        values.add(this.getDprNumParticip());

        fields += ", DPR_CVE_TIP_PRESTA";
        fieldValues += ", ?";
        values.add(this.getDprCveTipPresta());

        fields += ", DPR_REF_PRESTAMO";
        fieldValues += ", ?";
        values.add(this.getDprRefPrestamo());

        fields += ", DPR_NUM_PER_PRESTA";
        fieldValues += ", ?";
        values.add(this.getDprNumPerPresta());

        fields += ", DPR_FEC_PERIODO";
        fieldValues += ", ?";
        values.add(this.getDprFecPeriodo());

        fields += ", DPR_IMP_PERIODO";
        fieldValues += ", ?";
        values.add(this.getDprImpPeriodo());

        fields += ", DPR_FEC_PRESTAMO";
        fieldValues += ", ?";
        values.add(this.getDprFecPrestamo());

        fields += ", DPR_IMP_AMOR_CAP";
        fieldValues += ", ?";
        values.add(this.getDprImpAmorCap());

        fields += ", DPR_IMP_AMOR_INTER";
        fieldValues += ", ?";
        values.add(this.getDprImpAmorInter());

        fields += ", DPR_IMP_MORATORIOS";
        fieldValues += ", ?";
        values.add(this.getDprImpMoratorios());

        fields += ", DPR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDprMesAltaReg());

        fields += ", DPR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDprDiaAltaReg());

        fields += ", DPR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDprAnoUltMod());

        fields += ", DPR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDprMesUltMod());

        fields += ", DPR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDprDiaUltMod());

        fields += ", DPR_CVE_ST_DETPRES";
        fieldValues += ", ?";
        values.add(this.getDprCveStDetpres());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DETPREST WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DPR_NUM_CONTRATO = ?";
        values.add(this.getDprNumContrato());
        conditions += " AND DPR_NUM_DEPTO = ?";
        values.add(this.getDprNumDepto());
        conditions += " AND DPR_NUM_PARTICIP = ?";
        values.add(this.getDprNumParticip());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Detprest instance = (Detprest) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDprNumContrato().equals(instance.getDprNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getDprNumDepto().equals(instance.getDprNumDepto()))
            equalObjects = false;
        if (equalObjects && !this.getDprNumParticip().equals(instance.getDprNumParticip()))
            equalObjects = false;
        if (equalObjects && !this.getDprCveTipPresta().equals(instance.getDprCveTipPresta()))
            equalObjects = false;
        if (equalObjects && !this.getDprRefPrestamo().equals(instance.getDprRefPrestamo()))
            equalObjects = false;
        if (equalObjects && !this.getDprNumPerPresta().equals(instance.getDprNumPerPresta()))
            equalObjects = false;
        if (equalObjects && !this.getDprFecPeriodo().equals(instance.getDprFecPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getDprImpPeriodo().equals(instance.getDprImpPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getDprFecPrestamo().equals(instance.getDprFecPrestamo()))
            equalObjects = false;
        if (equalObjects && !this.getDprImpAmorCap().equals(instance.getDprImpAmorCap()))
            equalObjects = false;
        if (equalObjects && !this.getDprImpAmorInter().equals(instance.getDprImpAmorInter()))
            equalObjects = false;
        if (equalObjects && !this.getDprImpMoratorios().equals(instance.getDprImpMoratorios()))
            equalObjects = false;
        if (equalObjects && !this.getDprMesAltaReg().equals(instance.getDprMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDprDiaAltaReg().equals(instance.getDprDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDprAnoUltMod().equals(instance.getDprAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDprMesUltMod().equals(instance.getDprMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDprDiaUltMod().equals(instance.getDprDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDprCveStDetpres().equals(instance.getDprCveStDetpres()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Detprest result = new Detprest();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDprNumContrato((BigDecimal) objectData.getData("DPR_NUM_CONTRATO"));
        result.setDprNumDepto((BigDecimal) objectData.getData("DPR_NUM_DEPTO"));
        result.setDprNumParticip((BigDecimal) objectData.getData("DPR_NUM_PARTICIP"));
        result.setDprCveTipPresta((String) objectData.getData("DPR_CVE_TIP_PRESTA"));
        result.setDprRefPrestamo((String) objectData.getData("DPR_REF_PRESTAMO"));
        result.setDprNumPerPresta((BigDecimal) objectData.getData("DPR_NUM_PER_PRESTA"));
        result.setDprFecPeriodo((String) objectData.getData("DPR_FEC_PERIODO"));
        result.setDprImpPeriodo((BigDecimal) objectData.getData("DPR_IMP_PERIODO"));
        result.setDprFecPrestamo((String) objectData.getData("DPR_FEC_PRESTAMO"));
        result.setDprImpAmorCap((BigDecimal) objectData.getData("DPR_IMP_AMOR_CAP"));
        result.setDprImpAmorInter((BigDecimal) objectData.getData("DPR_IMP_AMOR_INTER"));
        result.setDprImpMoratorios((BigDecimal) objectData.getData("DPR_IMP_MORATORIOS"));
        result.setDprMesAltaReg((BigDecimal) objectData.getData("DPR_MES_ALTA_REG"));
        result.setDprDiaAltaReg((BigDecimal) objectData.getData("DPR_DIA_ALTA_REG"));
        result.setDprAnoUltMod((BigDecimal) objectData.getData("DPR_ANO_ULT_MOD"));
        result.setDprMesUltMod((BigDecimal) objectData.getData("DPR_MES_ULT_MOD"));
        result.setDprDiaUltMod((BigDecimal) objectData.getData("DPR_DIA_ULT_MOD"));
        result.setDprCveStDetpres((String) objectData.getData("DPR_CVE_ST_DETPRES"));

        return result;

    }

}
