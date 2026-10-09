package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISINMO_PK", columns = { "EIM_NUM_PROGRAMA", "EIM_NUM_EMISION" }, sequences = { "MANUAL" })
public class Emisinmo extends DomainObject {

    BigDecimal eimNumPrograma = null;
    BigDecimal eimNumEmision = null;
    BigDecimal eimDiasTrans = null;
    BigDecimal eimSaldosInsoluto = null;
    BigDecimal eimPjeMoratorios = null;
    BigDecimal eimImpMoratorios = null;
    BigDecimal eimAnoAltaReg = null;
    BigDecimal eimMesAltaReg = null;
    BigDecimal eimDiaAltaReg = null;
    BigDecimal eimAnoUltMod = null;
    BigDecimal eimMesUltMod = null;
    BigDecimal eimDiaUltMod = null;
    String eimCveStEmisinmo = null;

    public Emisinmo() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEimNumPrograma(BigDecimal eimNumPrograma) {
        this.eimNumPrograma = eimNumPrograma;
    }

    public BigDecimal getEimNumPrograma() {
        return this.eimNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEimNumEmision(BigDecimal eimNumEmision) {
        this.eimNumEmision = eimNumEmision;
    }

    public BigDecimal getEimNumEmision() {
        return this.eimNumEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEimDiasTrans(BigDecimal eimDiasTrans) {
        this.eimDiasTrans = eimDiasTrans;
    }

    public BigDecimal getEimDiasTrans() {
        return this.eimDiasTrans;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEimSaldosInsoluto(BigDecimal eimSaldosInsoluto) {
        this.eimSaldosInsoluto = eimSaldosInsoluto;
    }

    public BigDecimal getEimSaldosInsoluto() {
        return this.eimSaldosInsoluto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEimPjeMoratorios(BigDecimal eimPjeMoratorios) {
        this.eimPjeMoratorios = eimPjeMoratorios;
    }

    public BigDecimal getEimPjeMoratorios() {
        return this.eimPjeMoratorios;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEimImpMoratorios(BigDecimal eimImpMoratorios) {
        this.eimImpMoratorios = eimImpMoratorios;
    }

    public BigDecimal getEimImpMoratorios() {
        return this.eimImpMoratorios;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEimAnoAltaReg(BigDecimal eimAnoAltaReg) {
        this.eimAnoAltaReg = eimAnoAltaReg;
    }

    public BigDecimal getEimAnoAltaReg() {
        return this.eimAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEimMesAltaReg(BigDecimal eimMesAltaReg) {
        this.eimMesAltaReg = eimMesAltaReg;
    }

    public BigDecimal getEimMesAltaReg() {
        return this.eimMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEimDiaAltaReg(BigDecimal eimDiaAltaReg) {
        this.eimDiaAltaReg = eimDiaAltaReg;
    }

    public BigDecimal getEimDiaAltaReg() {
        return this.eimDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEimAnoUltMod(BigDecimal eimAnoUltMod) {
        this.eimAnoUltMod = eimAnoUltMod;
    }

    public BigDecimal getEimAnoUltMod() {
        return this.eimAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEimMesUltMod(BigDecimal eimMesUltMod) {
        this.eimMesUltMod = eimMesUltMod;
    }

    public BigDecimal getEimMesUltMod() {
        return this.eimMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEimDiaUltMod(BigDecimal eimDiaUltMod) {
        this.eimDiaUltMod = eimDiaUltMod;
    }

    public BigDecimal getEimDiaUltMod() {
        return this.eimDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEimCveStEmisinmo(String eimCveStEmisinmo) {
        this.eimCveStEmisinmo = eimCveStEmisinmo;
    }

    public String getEimCveStEmisinmo() {
        return this.eimCveStEmisinmo;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISINMO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEimNumPrograma() != null && this.getEimNumPrograma().longValue() == -999) {
            conditions += " AND EIM_NUM_PROGRAMA IS NULL";
        } else if (this.getEimNumPrograma() != null) {
            conditions += " AND EIM_NUM_PROGRAMA = ?";
            values.add(this.getEimNumPrograma());
        }

        if (this.getEimNumEmision() != null && this.getEimNumEmision().longValue() == -999) {
            conditions += " AND EIM_NUM_EMISION IS NULL";
        } else if (this.getEimNumEmision() != null) {
            conditions += " AND EIM_NUM_EMISION = ?";
            values.add(this.getEimNumEmision());
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
        String sql = "SELECT * FROM EMISINMO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEimNumPrograma() != null && this.getEimNumPrograma().longValue() == -999) {
            conditions += " AND EIM_NUM_PROGRAMA IS NULL";
        } else if (this.getEimNumPrograma() != null) {
            conditions += " AND EIM_NUM_PROGRAMA = ?";
            values.add(this.getEimNumPrograma());
        }

        if (this.getEimNumEmision() != null && this.getEimNumEmision().longValue() == -999) {
            conditions += " AND EIM_NUM_EMISION IS NULL";
        } else if (this.getEimNumEmision() != null) {
            conditions += " AND EIM_NUM_EMISION = ?";
            values.add(this.getEimNumEmision());
        }

        if (this.getEimDiasTrans() != null && this.getEimDiasTrans().longValue() == -999) {
            conditions += " AND EIM_DIAS_TRANS IS NULL";
        } else if (this.getEimDiasTrans() != null) {
            conditions += " AND EIM_DIAS_TRANS = ?";
            values.add(this.getEimDiasTrans());
        }

        if (this.getEimSaldosInsoluto() != null && this.getEimSaldosInsoluto().longValue() == -999) {
            conditions += " AND EIM_SALDOS_INSOLUTO IS NULL";
        } else if (this.getEimSaldosInsoluto() != null) {
            conditions += " AND EIM_SALDOS_INSOLUTO = ?";
            values.add(this.getEimSaldosInsoluto());
        }

        if (this.getEimPjeMoratorios() != null && this.getEimPjeMoratorios().longValue() == -999) {
            conditions += " AND EIM_PJE_MORATORIOS IS NULL";
        } else if (this.getEimPjeMoratorios() != null) {
            conditions += " AND EIM_PJE_MORATORIOS = ?";
            values.add(this.getEimPjeMoratorios());
        }

        if (this.getEimImpMoratorios() != null && this.getEimImpMoratorios().longValue() == -999) {
            conditions += " AND EIM_IMP_MORATORIOS IS NULL";
        } else if (this.getEimImpMoratorios() != null) {
            conditions += " AND EIM_IMP_MORATORIOS = ?";
            values.add(this.getEimImpMoratorios());
        }

        if (this.getEimAnoAltaReg() != null && this.getEimAnoAltaReg().longValue() == -999) {
            conditions += " AND EIM_ANO_ALTA_REG IS NULL";
        } else if (this.getEimAnoAltaReg() != null) {
            conditions += " AND EIM_ANO_ALTA_REG = ?";
            values.add(this.getEimAnoAltaReg());
        }

        if (this.getEimMesAltaReg() != null && this.getEimMesAltaReg().longValue() == -999) {
            conditions += " AND EIM_MES_ALTA_REG IS NULL";
        } else if (this.getEimMesAltaReg() != null) {
            conditions += " AND EIM_MES_ALTA_REG = ?";
            values.add(this.getEimMesAltaReg());
        }

        if (this.getEimDiaAltaReg() != null && this.getEimDiaAltaReg().longValue() == -999) {
            conditions += " AND EIM_DIA_ALTA_REG IS NULL";
        } else if (this.getEimDiaAltaReg() != null) {
            conditions += " AND EIM_DIA_ALTA_REG = ?";
            values.add(this.getEimDiaAltaReg());
        }

        if (this.getEimAnoUltMod() != null && this.getEimAnoUltMod().longValue() == -999) {
            conditions += " AND EIM_ANO_ULT_MOD IS NULL";
        } else if (this.getEimAnoUltMod() != null) {
            conditions += " AND EIM_ANO_ULT_MOD = ?";
            values.add(this.getEimAnoUltMod());
        }

        if (this.getEimMesUltMod() != null && this.getEimMesUltMod().longValue() == -999) {
            conditions += " AND EIM_MES_ULT_MOD IS NULL";
        } else if (this.getEimMesUltMod() != null) {
            conditions += " AND EIM_MES_ULT_MOD = ?";
            values.add(this.getEimMesUltMod());
        }

        if (this.getEimDiaUltMod() != null && this.getEimDiaUltMod().longValue() == -999) {
            conditions += " AND EIM_DIA_ULT_MOD IS NULL";
        } else if (this.getEimDiaUltMod() != null) {
            conditions += " AND EIM_DIA_ULT_MOD = ?";
            values.add(this.getEimDiaUltMod());
        }

        if (this.getEimCveStEmisinmo() != null && "null".equals(this.getEimCveStEmisinmo())) {
            conditions += " AND EIM_CVE_ST_EMISINMO IS NULL";
        } else if (this.getEimCveStEmisinmo() != null) {
            conditions += " AND EIM_CVE_ST_EMISINMO = ?";
            values.add(this.getEimCveStEmisinmo());
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
        String sql = "UPDATE EMISINMO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EIM_NUM_PROGRAMA = ?";
        pkValues.add(this.getEimNumPrograma());
        conditions += " AND EIM_NUM_EMISION = ?";
        pkValues.add(this.getEimNumEmision());
        fields += " EIM_DIAS_TRANS = ?, ";
        values.add(this.getEimDiasTrans());
        fields += " EIM_SALDOS_INSOLUTO = ?, ";
        values.add(this.getEimSaldosInsoluto());
        fields += " EIM_PJE_MORATORIOS = ?, ";
        values.add(this.getEimPjeMoratorios());
        fields += " EIM_IMP_MORATORIOS = ?, ";
        values.add(this.getEimImpMoratorios());
        fields += " EIM_ANO_ALTA_REG = ?, ";
        values.add(this.getEimAnoAltaReg());
        fields += " EIM_MES_ALTA_REG = ?, ";
        values.add(this.getEimMesAltaReg());
        fields += " EIM_DIA_ALTA_REG = ?, ";
        values.add(this.getEimDiaAltaReg());
        fields += " EIM_ANO_ULT_MOD = ?, ";
        values.add(this.getEimAnoUltMod());
        fields += " EIM_MES_ULT_MOD = ?, ";
        values.add(this.getEimMesUltMod());
        fields += " EIM_DIA_ULT_MOD = ?, ";
        values.add(this.getEimDiaUltMod());
        fields += " EIM_CVE_ST_EMISINMO = ?, ";
        values.add(this.getEimCveStEmisinmo());
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
        String sql = "INSERT INTO EMISINMO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EIM_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEimNumPrograma());

        fields += ", EIM_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEimNumEmision());

        fields += ", EIM_DIAS_TRANS";
        fieldValues += ", ?";
        values.add(this.getEimDiasTrans());

        fields += ", EIM_SALDOS_INSOLUTO";
        fieldValues += ", ?";
        values.add(this.getEimSaldosInsoluto());

        fields += ", EIM_PJE_MORATORIOS";
        fieldValues += ", ?";
        values.add(this.getEimPjeMoratorios());

        fields += ", EIM_IMP_MORATORIOS";
        fieldValues += ", ?";
        values.add(this.getEimImpMoratorios());

        fields += ", EIM_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEimAnoAltaReg());

        fields += ", EIM_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEimMesAltaReg());

        fields += ", EIM_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getEimDiaAltaReg());

        fields += ", EIM_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEimAnoUltMod());

        fields += ", EIM_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEimMesUltMod());

        fields += ", EIM_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getEimDiaUltMod());

        fields += ", EIM_CVE_ST_EMISINMO";
        fieldValues += ", ?";
        values.add(this.getEimCveStEmisinmo());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISINMO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EIM_NUM_PROGRAMA = ?";
        values.add(this.getEimNumPrograma());
        conditions += " AND EIM_NUM_EMISION = ?";
        values.add(this.getEimNumEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisinmo instance = (Emisinmo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEimNumPrograma().equals(instance.getEimNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEimNumEmision().equals(instance.getEimNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEimDiasTrans().equals(instance.getEimDiasTrans()))
            equalObjects = false;
        if (equalObjects && !this.getEimSaldosInsoluto().equals(instance.getEimSaldosInsoluto()))
            equalObjects = false;
        if (equalObjects && !this.getEimPjeMoratorios().equals(instance.getEimPjeMoratorios()))
            equalObjects = false;
        if (equalObjects && !this.getEimImpMoratorios().equals(instance.getEimImpMoratorios()))
            equalObjects = false;
        if (equalObjects && !this.getEimAnoAltaReg().equals(instance.getEimAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEimMesAltaReg().equals(instance.getEimMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEimDiaAltaReg().equals(instance.getEimDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getEimAnoUltMod().equals(instance.getEimAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEimMesUltMod().equals(instance.getEimMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEimDiaUltMod().equals(instance.getEimDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getEimCveStEmisinmo().equals(instance.getEimCveStEmisinmo()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisinmo result = new Emisinmo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEimNumPrograma((BigDecimal) objectData.getData("EIM_NUM_PROGRAMA"));
        result.setEimNumEmision((BigDecimal) objectData.getData("EIM_NUM_EMISION"));
        result.setEimDiasTrans((BigDecimal) objectData.getData("EIM_DIAS_TRANS"));
        result.setEimSaldosInsoluto((BigDecimal) objectData.getData("EIM_SALDOS_INSOLUTO"));
        result.setEimPjeMoratorios((BigDecimal) objectData.getData("EIM_PJE_MORATORIOS"));
        result.setEimImpMoratorios((BigDecimal) objectData.getData("EIM_IMP_MORATORIOS"));
        result.setEimAnoAltaReg((BigDecimal) objectData.getData("EIM_ANO_ALTA_REG"));
        result.setEimMesAltaReg((BigDecimal) objectData.getData("EIM_MES_ALTA_REG"));
        result.setEimDiaAltaReg((BigDecimal) objectData.getData("EIM_DIA_ALTA_REG"));
        result.setEimAnoUltMod((BigDecimal) objectData.getData("EIM_ANO_ULT_MOD"));
        result.setEimMesUltMod((BigDecimal) objectData.getData("EIM_MES_ULT_MOD"));
        result.setEimDiaUltMod((BigDecimal) objectData.getData("EIM_DIA_ULT_MOD"));
        result.setEimCveStEmisinmo((String) objectData.getData("EIM_CVE_ST_EMISINMO"));

        return result;

    }

}
