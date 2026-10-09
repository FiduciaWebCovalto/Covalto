package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REGPROPO_PK", columns = { "RPO_NUM_CONTRATO", "RPO_NUM_PERS_FID", "RPO_NUM_CONCEPTO" }, sequences = { "MANUAL" })
public class Regpropo extends DomainObject {

    BigDecimal rpoNumContrato = null;
    BigDecimal rpoNumPersFid = null;
    BigDecimal rpoNumConcepto = null;
    BigDecimal rpoNumFormula = null;
    String rpoOperador = null;
    String rpoProporcion = null;
    String rpoNomPropo = null;
    BigDecimal rpoAnoInicio = null;
    BigDecimal rpoMesInicio = null;
    BigDecimal rpoDiaInicio = null;
    BigDecimal rpoAnoVencimiento = null;
    BigDecimal rpoMesVencimiento = null;
    BigDecimal rpoDiaVencimiento = null;
    BigDecimal rpoAnoAltaReg = null;
    BigDecimal rpoMesAltaReg = null;
    BigDecimal rpoDiaAltaReg = null;
    BigDecimal rpoAnoUltMod = null;
    BigDecimal rpoMesUltMod = null;
    BigDecimal rpoDiaUltMod = null;
    String rpoCveStRegpropo = null;

    public Regpropo() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumContrato(BigDecimal rpoNumContrato) {
        this.rpoNumContrato = rpoNumContrato;
    }

    public BigDecimal getRpoNumContrato() {
        return this.rpoNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumPersFid(BigDecimal rpoNumPersFid) {
        this.rpoNumPersFid = rpoNumPersFid;
    }

    public BigDecimal getRpoNumPersFid() {
        return this.rpoNumPersFid;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumConcepto(BigDecimal rpoNumConcepto) {
        this.rpoNumConcepto = rpoNumConcepto;
    }

    public BigDecimal getRpoNumConcepto() {
        return this.rpoNumConcepto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpoNumFormula(BigDecimal rpoNumFormula) {
        this.rpoNumFormula = rpoNumFormula;
    }

    public BigDecimal getRpoNumFormula() {
        return this.rpoNumFormula;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpoOperador(String rpoOperador) {
        this.rpoOperador = rpoOperador;
    }

    public String getRpoOperador() {
        return this.rpoOperador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpoProporcion(String rpoProporcion) {
        this.rpoProporcion = rpoProporcion;
    }

    public String getRpoProporcion() {
        return this.rpoProporcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpoNomPropo(String rpoNomPropo) {
        this.rpoNomPropo = rpoNomPropo;
    }

    public String getRpoNomPropo() {
        return this.rpoNomPropo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpoAnoInicio(BigDecimal rpoAnoInicio) {
        this.rpoAnoInicio = rpoAnoInicio;
    }

    public BigDecimal getRpoAnoInicio() {
        return this.rpoAnoInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpoMesInicio(BigDecimal rpoMesInicio) {
        this.rpoMesInicio = rpoMesInicio;
    }

    public BigDecimal getRpoMesInicio() {
        return this.rpoMesInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpoDiaInicio(BigDecimal rpoDiaInicio) {
        this.rpoDiaInicio = rpoDiaInicio;
    }

    public BigDecimal getRpoDiaInicio() {
        return this.rpoDiaInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpoAnoVencimiento(BigDecimal rpoAnoVencimiento) {
        this.rpoAnoVencimiento = rpoAnoVencimiento;
    }

    public BigDecimal getRpoAnoVencimiento() {
        return this.rpoAnoVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpoMesVencimiento(BigDecimal rpoMesVencimiento) {
        this.rpoMesVencimiento = rpoMesVencimiento;
    }

    public BigDecimal getRpoMesVencimiento() {
        return this.rpoMesVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpoDiaVencimiento(BigDecimal rpoDiaVencimiento) {
        this.rpoDiaVencimiento = rpoDiaVencimiento;
    }

    public BigDecimal getRpoDiaVencimiento() {
        return this.rpoDiaVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpoAnoAltaReg(BigDecimal rpoAnoAltaReg) {
        this.rpoAnoAltaReg = rpoAnoAltaReg;
    }

    public BigDecimal getRpoAnoAltaReg() {
        return this.rpoAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpoMesAltaReg(BigDecimal rpoMesAltaReg) {
        this.rpoMesAltaReg = rpoMesAltaReg;
    }

    public BigDecimal getRpoMesAltaReg() {
        return this.rpoMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpoDiaAltaReg(BigDecimal rpoDiaAltaReg) {
        this.rpoDiaAltaReg = rpoDiaAltaReg;
    }

    public BigDecimal getRpoDiaAltaReg() {
        return this.rpoDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpoAnoUltMod(BigDecimal rpoAnoUltMod) {
        this.rpoAnoUltMod = rpoAnoUltMod;
    }

    public BigDecimal getRpoAnoUltMod() {
        return this.rpoAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpoMesUltMod(BigDecimal rpoMesUltMod) {
        this.rpoMesUltMod = rpoMesUltMod;
    }

    public BigDecimal getRpoMesUltMod() {
        return this.rpoMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpoDiaUltMod(BigDecimal rpoDiaUltMod) {
        this.rpoDiaUltMod = rpoDiaUltMod;
    }

    public BigDecimal getRpoDiaUltMod() {
        return this.rpoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpoCveStRegpropo(String rpoCveStRegpropo) {
        this.rpoCveStRegpropo = rpoCveStRegpropo;
    }

    public String getRpoCveStRegpropo() {
        return this.rpoCveStRegpropo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REGPROPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRpoNumContrato() != null && this.getRpoNumContrato().longValue() == -999) {
            conditions += " AND RPO_NUM_CONTRATO IS NULL";
        } else if (this.getRpoNumContrato() != null) {
            conditions += " AND RPO_NUM_CONTRATO = ?";
            values.add(this.getRpoNumContrato());
        }

        if (this.getRpoNumPersFid() != null && this.getRpoNumPersFid().longValue() == -999) {
            conditions += " AND RPO_NUM_PERS_FID IS NULL";
        } else if (this.getRpoNumPersFid() != null) {
            conditions += " AND RPO_NUM_PERS_FID = ?";
            values.add(this.getRpoNumPersFid());
        }

        if (this.getRpoNumConcepto() != null && this.getRpoNumConcepto().longValue() == -999) {
            conditions += " AND RPO_NUM_CONCEPTO IS NULL";
        } else if (this.getRpoNumConcepto() != null) {
            conditions += " AND RPO_NUM_CONCEPTO = ?";
            values.add(this.getRpoNumConcepto());
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
        String sql = "SELECT * FROM REGPROPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRpoNumContrato() != null && this.getRpoNumContrato().longValue() == -999) {
            conditions += " AND RPO_NUM_CONTRATO IS NULL";
        } else if (this.getRpoNumContrato() != null) {
            conditions += " AND RPO_NUM_CONTRATO = ?";
            values.add(this.getRpoNumContrato());
        }

        if (this.getRpoNumPersFid() != null && this.getRpoNumPersFid().longValue() == -999) {
            conditions += " AND RPO_NUM_PERS_FID IS NULL";
        } else if (this.getRpoNumPersFid() != null) {
            conditions += " AND RPO_NUM_PERS_FID = ?";
            values.add(this.getRpoNumPersFid());
        }

        if (this.getRpoNumConcepto() != null && this.getRpoNumConcepto().longValue() == -999) {
            conditions += " AND RPO_NUM_CONCEPTO IS NULL";
        } else if (this.getRpoNumConcepto() != null) {
            conditions += " AND RPO_NUM_CONCEPTO = ?";
            values.add(this.getRpoNumConcepto());
        }

        if (this.getRpoNumFormula() != null && this.getRpoNumFormula().longValue() == -999) {
            conditions += " AND RPO_NUM_FORMULA IS NULL";
        } else if (this.getRpoNumFormula() != null) {
            conditions += " AND RPO_NUM_FORMULA = ?";
            values.add(this.getRpoNumFormula());
        }

        if (this.getRpoOperador() != null && "null".equals(this.getRpoOperador())) {
            conditions += " AND RPO_OPERADOR IS NULL";
        } else if (this.getRpoOperador() != null) {
            conditions += " AND RPO_OPERADOR = ?";
            values.add(this.getRpoOperador());
        }

        if (this.getRpoProporcion() != null && "null".equals(this.getRpoProporcion())) {
            conditions += " AND RPO_PROPORCION IS NULL";
        } else if (this.getRpoProporcion() != null) {
            conditions += " AND RPO_PROPORCION = ?";
            values.add(this.getRpoProporcion());
        }

        if (this.getRpoNomPropo() != null && "null".equals(this.getRpoNomPropo())) {
            conditions += " AND RPO_NOM_PROPO IS NULL";
        } else if (this.getRpoNomPropo() != null) {
            conditions += " AND RPO_NOM_PROPO = ?";
            values.add(this.getRpoNomPropo());
        }

        if (this.getRpoAnoInicio() != null && this.getRpoAnoInicio().longValue() == -999) {
            conditions += " AND RPO_ANO_INICIO IS NULL";
        } else if (this.getRpoAnoInicio() != null) {
            conditions += " AND RPO_ANO_INICIO = ?";
            values.add(this.getRpoAnoInicio());
        }

        if (this.getRpoMesInicio() != null && this.getRpoMesInicio().longValue() == -999) {
            conditions += " AND RPO_MES_INICIO IS NULL";
        } else if (this.getRpoMesInicio() != null) {
            conditions += " AND RPO_MES_INICIO = ?";
            values.add(this.getRpoMesInicio());
        }

        if (this.getRpoDiaInicio() != null && this.getRpoDiaInicio().longValue() == -999) {
            conditions += " AND RPO_DIA_INICIO IS NULL";
        } else if (this.getRpoDiaInicio() != null) {
            conditions += " AND RPO_DIA_INICIO = ?";
            values.add(this.getRpoDiaInicio());
        }

        if (this.getRpoAnoVencimiento() != null && this.getRpoAnoVencimiento().longValue() == -999) {
            conditions += " AND RPO_ANO_VENCIMIENTO IS NULL";
        } else if (this.getRpoAnoVencimiento() != null) {
            conditions += " AND RPO_ANO_VENCIMIENTO = ?";
            values.add(this.getRpoAnoVencimiento());
        }

        if (this.getRpoMesVencimiento() != null && this.getRpoMesVencimiento().longValue() == -999) {
            conditions += " AND RPO_MES_VENCIMIENTO IS NULL";
        } else if (this.getRpoMesVencimiento() != null) {
            conditions += " AND RPO_MES_VENCIMIENTO = ?";
            values.add(this.getRpoMesVencimiento());
        }

        if (this.getRpoDiaVencimiento() != null && this.getRpoDiaVencimiento().longValue() == -999) {
            conditions += " AND RPO_DIA_VENCIMIENTO IS NULL";
        } else if (this.getRpoDiaVencimiento() != null) {
            conditions += " AND RPO_DIA_VENCIMIENTO = ?";
            values.add(this.getRpoDiaVencimiento());
        }

        if (this.getRpoAnoAltaReg() != null && this.getRpoAnoAltaReg().longValue() == -999) {
            conditions += " AND RPO_ANO_ALTA_REG IS NULL";
        } else if (this.getRpoAnoAltaReg() != null) {
            conditions += " AND RPO_ANO_ALTA_REG = ?";
            values.add(this.getRpoAnoAltaReg());
        }

        if (this.getRpoMesAltaReg() != null && this.getRpoMesAltaReg().longValue() == -999) {
            conditions += " AND RPO_MES_ALTA_REG IS NULL";
        } else if (this.getRpoMesAltaReg() != null) {
            conditions += " AND RPO_MES_ALTA_REG = ?";
            values.add(this.getRpoMesAltaReg());
        }

        if (this.getRpoDiaAltaReg() != null && this.getRpoDiaAltaReg().longValue() == -999) {
            conditions += " AND RPO_DIA_ALTA_REG IS NULL";
        } else if (this.getRpoDiaAltaReg() != null) {
            conditions += " AND RPO_DIA_ALTA_REG = ?";
            values.add(this.getRpoDiaAltaReg());
        }

        if (this.getRpoAnoUltMod() != null && this.getRpoAnoUltMod().longValue() == -999) {
            conditions += " AND RPO_ANO_ULT_MOD IS NULL";
        } else if (this.getRpoAnoUltMod() != null) {
            conditions += " AND RPO_ANO_ULT_MOD = ?";
            values.add(this.getRpoAnoUltMod());
        }

        if (this.getRpoMesUltMod() != null && this.getRpoMesUltMod().longValue() == -999) {
            conditions += " AND RPO_MES_ULT_MOD IS NULL";
        } else if (this.getRpoMesUltMod() != null) {
            conditions += " AND RPO_MES_ULT_MOD = ?";
            values.add(this.getRpoMesUltMod());
        }

        if (this.getRpoDiaUltMod() != null && this.getRpoDiaUltMod().longValue() == -999) {
            conditions += " AND RPO_DIA_ULT_MOD IS NULL";
        } else if (this.getRpoDiaUltMod() != null) {
            conditions += " AND RPO_DIA_ULT_MOD = ?";
            values.add(this.getRpoDiaUltMod());
        }

        if (this.getRpoCveStRegpropo() != null && "null".equals(this.getRpoCveStRegpropo())) {
            conditions += " AND RPO_CVE_ST_REGPROPO IS NULL";
        } else if (this.getRpoCveStRegpropo() != null) {
            conditions += " AND RPO_CVE_ST_REGPROPO = ?";
            values.add(this.getRpoCveStRegpropo());
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
        String sql = "UPDATE REGPROPO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RPO_NUM_CONTRATO = ?";
        pkValues.add(this.getRpoNumContrato());
        conditions += " AND RPO_NUM_PERS_FID = ?";
        pkValues.add(this.getRpoNumPersFid());
        conditions += " AND RPO_NUM_CONCEPTO = ?";
        pkValues.add(this.getRpoNumConcepto());
        fields += " RPO_NUM_FORMULA = ?, ";
        values.add(this.getRpoNumFormula());
        fields += " RPO_OPERADOR = ?, ";
        values.add(this.getRpoOperador());
        fields += " RPO_PROPORCION = ?, ";
        values.add(this.getRpoProporcion());
        fields += " RPO_NOM_PROPO = ?, ";
        values.add(this.getRpoNomPropo());
        fields += " RPO_ANO_INICIO = ?, ";
        values.add(this.getRpoAnoInicio());
        fields += " RPO_MES_INICIO = ?, ";
        values.add(this.getRpoMesInicio());
        fields += " RPO_DIA_INICIO = ?, ";
        values.add(this.getRpoDiaInicio());
        fields += " RPO_ANO_VENCIMIENTO = ?, ";
        values.add(this.getRpoAnoVencimiento());
        fields += " RPO_MES_VENCIMIENTO = ?, ";
        values.add(this.getRpoMesVencimiento());
        fields += " RPO_DIA_VENCIMIENTO = ?, ";
        values.add(this.getRpoDiaVencimiento());
        fields += " RPO_ANO_ALTA_REG = ?, ";
        values.add(this.getRpoAnoAltaReg());
        fields += " RPO_MES_ALTA_REG = ?, ";
        values.add(this.getRpoMesAltaReg());
        fields += " RPO_DIA_ALTA_REG = ?, ";
        values.add(this.getRpoDiaAltaReg());
        fields += " RPO_ANO_ULT_MOD = ?, ";
        values.add(this.getRpoAnoUltMod());
        fields += " RPO_MES_ULT_MOD = ?, ";
        values.add(this.getRpoMesUltMod());
        fields += " RPO_DIA_ULT_MOD = ?, ";
        values.add(this.getRpoDiaUltMod());
        fields += " RPO_CVE_ST_REGPROPO = ?, ";
        values.add(this.getRpoCveStRegpropo());
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
        String sql = "INSERT INTO REGPROPO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RPO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRpoNumContrato());

        fields += ", RPO_NUM_PERS_FID";
        fieldValues += ", ?";
        values.add(this.getRpoNumPersFid());

        fields += ", RPO_NUM_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getRpoNumConcepto());

        fields += ", RPO_NUM_FORMULA";
        fieldValues += ", ?";
        values.add(this.getRpoNumFormula());

        fields += ", RPO_OPERADOR";
        fieldValues += ", ?";
        values.add(this.getRpoOperador());

        fields += ", RPO_PROPORCION";
        fieldValues += ", ?";
        values.add(this.getRpoProporcion());

        fields += ", RPO_NOM_PROPO";
        fieldValues += ", ?";
        values.add(this.getRpoNomPropo());

        fields += ", RPO_ANO_INICIO";
        fieldValues += ", ?";
        values.add(this.getRpoAnoInicio());

        fields += ", RPO_MES_INICIO";
        fieldValues += ", ?";
        values.add(this.getRpoMesInicio());

        fields += ", RPO_DIA_INICIO";
        fieldValues += ", ?";
        values.add(this.getRpoDiaInicio());

        fields += ", RPO_ANO_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getRpoAnoVencimiento());

        fields += ", RPO_MES_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getRpoMesVencimiento());

        fields += ", RPO_DIA_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getRpoDiaVencimiento());

        fields += ", RPO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRpoAnoAltaReg());

        fields += ", RPO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRpoMesAltaReg());

        fields += ", RPO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRpoDiaAltaReg());

        fields += ", RPO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRpoAnoUltMod());

        fields += ", RPO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRpoMesUltMod());

        fields += ", RPO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRpoDiaUltMod());

        fields += ", RPO_CVE_ST_REGPROPO";
        fieldValues += ", ?";
        values.add(this.getRpoCveStRegpropo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REGPROPO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RPO_NUM_CONTRATO = ?";
        values.add(this.getRpoNumContrato());
        conditions += " AND RPO_NUM_PERS_FID = ?";
        values.add(this.getRpoNumPersFid());
        conditions += " AND RPO_NUM_CONCEPTO = ?";
        values.add(this.getRpoNumConcepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Regpropo instance = (Regpropo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRpoNumContrato().equals(instance.getRpoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumPersFid().equals(instance.getRpoNumPersFid()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumConcepto().equals(instance.getRpoNumConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNumFormula().equals(instance.getRpoNumFormula()))
            equalObjects = false;
        if (equalObjects && !this.getRpoOperador().equals(instance.getRpoOperador()))
            equalObjects = false;
        if (equalObjects && !this.getRpoProporcion().equals(instance.getRpoProporcion()))
            equalObjects = false;
        if (equalObjects && !this.getRpoNomPropo().equals(instance.getRpoNomPropo()))
            equalObjects = false;
        if (equalObjects && !this.getRpoAnoInicio().equals(instance.getRpoAnoInicio()))
            equalObjects = false;
        if (equalObjects && !this.getRpoMesInicio().equals(instance.getRpoMesInicio()))
            equalObjects = false;
        if (equalObjects && !this.getRpoDiaInicio().equals(instance.getRpoDiaInicio()))
            equalObjects = false;
        if (equalObjects && !this.getRpoAnoVencimiento().equals(instance.getRpoAnoVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getRpoMesVencimiento().equals(instance.getRpoMesVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getRpoDiaVencimiento().equals(instance.getRpoDiaVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getRpoAnoAltaReg().equals(instance.getRpoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRpoMesAltaReg().equals(instance.getRpoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRpoDiaAltaReg().equals(instance.getRpoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRpoAnoUltMod().equals(instance.getRpoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRpoMesUltMod().equals(instance.getRpoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRpoDiaUltMod().equals(instance.getRpoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRpoCveStRegpropo().equals(instance.getRpoCveStRegpropo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Regpropo result = new Regpropo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRpoNumContrato((BigDecimal) objectData.getData("RPO_NUM_CONTRATO"));
        result.setRpoNumPersFid((BigDecimal) objectData.getData("RPO_NUM_PERS_FID"));
        result.setRpoNumConcepto((BigDecimal) objectData.getData("RPO_NUM_CONCEPTO"));
        result.setRpoNumFormula((BigDecimal) objectData.getData("RPO_NUM_FORMULA"));
        result.setRpoOperador((String) objectData.getData("RPO_OPERADOR"));
        result.setRpoProporcion((String) objectData.getData("RPO_PROPORCION"));
        result.setRpoNomPropo((String) objectData.getData("RPO_NOM_PROPO"));
        result.setRpoAnoInicio((BigDecimal) objectData.getData("RPO_ANO_INICIO"));
        result.setRpoMesInicio((BigDecimal) objectData.getData("RPO_MES_INICIO"));
        result.setRpoDiaInicio((BigDecimal) objectData.getData("RPO_DIA_INICIO"));
        result.setRpoAnoVencimiento((BigDecimal) objectData.getData("RPO_ANO_VENCIMIENTO"));
        result.setRpoMesVencimiento((BigDecimal) objectData.getData("RPO_MES_VENCIMIENTO"));
        result.setRpoDiaVencimiento((BigDecimal) objectData.getData("RPO_DIA_VENCIMIENTO"));
        result.setRpoAnoAltaReg((BigDecimal) objectData.getData("RPO_ANO_ALTA_REG"));
        result.setRpoMesAltaReg((BigDecimal) objectData.getData("RPO_MES_ALTA_REG"));
        result.setRpoDiaAltaReg((BigDecimal) objectData.getData("RPO_DIA_ALTA_REG"));
        result.setRpoAnoUltMod((BigDecimal) objectData.getData("RPO_ANO_ULT_MOD"));
        result.setRpoMesUltMod((BigDecimal) objectData.getData("RPO_MES_ULT_MOD"));
        result.setRpoDiaUltMod((BigDecimal) objectData.getData("RPO_DIA_ULT_MOD"));
        result.setRpoCveStRegpropo((String) objectData.getData("RPO_CVE_ST_REGPROPO"));

        return result;

    }

}
