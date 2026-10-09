package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "DIASFERA_PK", columns = { "DFA_NUM_PAIS", "DFA_ANO_FECHA", "DFA_MES_FECHA", "DFA_DIA_FECHA" }, sequences = { "MANUAL" })
public class Diasfera extends DomainObject {

    BigDecimal dfaNumPais = null;
    BigDecimal dfaAnoFecha = null;
    BigDecimal dfaMesFecha = null;
    BigDecimal dfaDiaFecha = null;
    String dfaDescFecha = null;
    BigDecimal dfaNumTipoDia = null;
    String dfaCvePeriodo = null;
    String dfaCveDia = null;
    String dfaCveMes = null;
    String dfaPeriodicidad = null;
    BigDecimal dfaAnoAltaReg = null;
    BigDecimal dfaMesAltaReg = null;
    BigDecimal dfaDiaAltaReg = null;
    BigDecimal dfaAnoUltMod = null;
    BigDecimal dfaMesUltMod = null;
    BigDecimal dfaDiaUltMod = null;
    String dfaCveStDiasfera = null;

    public Diasfera() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setDfaNumPais(BigDecimal dfaNumPais) {
        this.dfaNumPais = dfaNumPais;
    }

    public BigDecimal getDfaNumPais() {
        return this.dfaNumPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDfaAnoFecha(BigDecimal dfaAnoFecha) {
        this.dfaAnoFecha = dfaAnoFecha;
    }

    public BigDecimal getDfaAnoFecha() {
        return this.dfaAnoFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfaMesFecha(BigDecimal dfaMesFecha) {
        this.dfaMesFecha = dfaMesFecha;
    }

    public BigDecimal getDfaMesFecha() {
        return this.dfaMesFecha;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfaDiaFecha(BigDecimal dfaDiaFecha) {
        this.dfaDiaFecha = dfaDiaFecha;
    }

    public BigDecimal getDfaDiaFecha() {
        return this.dfaDiaFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDfaDescFecha(String dfaDescFecha) {
        this.dfaDescFecha = dfaDescFecha;
    }

    public String getDfaDescFecha() {
        return this.dfaDescFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDfaNumTipoDia(BigDecimal dfaNumTipoDia) {
        this.dfaNumTipoDia = dfaNumTipoDia;
    }

    public BigDecimal getDfaNumTipoDia() {
        return this.dfaNumTipoDia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDfaCvePeriodo(String dfaCvePeriodo) {
        this.dfaCvePeriodo = dfaCvePeriodo;
    }

    public String getDfaCvePeriodo() {
        return this.dfaCvePeriodo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDfaCveDia(String dfaCveDia) {
        this.dfaCveDia = dfaCveDia;
    }

    public String getDfaCveDia() {
        return this.dfaCveDia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDfaCveMes(String dfaCveMes) {
        this.dfaCveMes = dfaCveMes;
    }

    public String getDfaCveMes() {
        return this.dfaCveMes;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDfaPeriodicidad(String dfaPeriodicidad) {
        this.dfaPeriodicidad = dfaPeriodicidad;
    }

    public String getDfaPeriodicidad() {
        return this.dfaPeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDfaAnoAltaReg(BigDecimal dfaAnoAltaReg) {
        this.dfaAnoAltaReg = dfaAnoAltaReg;
    }

    public BigDecimal getDfaAnoAltaReg() {
        return this.dfaAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfaMesAltaReg(BigDecimal dfaMesAltaReg) {
        this.dfaMesAltaReg = dfaMesAltaReg;
    }

    public BigDecimal getDfaMesAltaReg() {
        return this.dfaMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfaDiaAltaReg(BigDecimal dfaDiaAltaReg) {
        this.dfaDiaAltaReg = dfaDiaAltaReg;
    }

    public BigDecimal getDfaDiaAltaReg() {
        return this.dfaDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setDfaAnoUltMod(BigDecimal dfaAnoUltMod) {
        this.dfaAnoUltMod = dfaAnoUltMod;
    }

    public BigDecimal getDfaAnoUltMod() {
        return this.dfaAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfaMesUltMod(BigDecimal dfaMesUltMod) {
        this.dfaMesUltMod = dfaMesUltMod;
    }

    public BigDecimal getDfaMesUltMod() {
        return this.dfaMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setDfaDiaUltMod(BigDecimal dfaDiaUltMod) {
        this.dfaDiaUltMod = dfaDiaUltMod;
    }

    public BigDecimal getDfaDiaUltMod() {
        return this.dfaDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setDfaCveStDiasfera(String dfaCveStDiasfera) {
        this.dfaCveStDiasfera = dfaCveStDiasfera;
    }

    public String getDfaCveStDiasfera() {
        return this.dfaCveStDiasfera;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM DIASFERA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDfaNumPais() != null && this.getDfaNumPais().longValue() == -999) {
            conditions += " AND DFA_NUM_PAIS IS NULL";
        } else if (this.getDfaNumPais() != null) {
            conditions += " AND DFA_NUM_PAIS = ?";
            values.add(this.getDfaNumPais());
        }

        if (this.getDfaAnoFecha() != null && this.getDfaAnoFecha().longValue() == -999) {
            conditions += " AND DFA_ANO_FECHA IS NULL";
        } else if (this.getDfaAnoFecha() != null) {
            conditions += " AND DFA_ANO_FECHA = ?";
            values.add(this.getDfaAnoFecha());
        }

        if (this.getDfaMesFecha() != null && this.getDfaMesFecha().longValue() == -999) {
            conditions += " AND DFA_MES_FECHA IS NULL";
        } else if (this.getDfaMesFecha() != null) {
            conditions += " AND DFA_MES_FECHA = ?";
            values.add(this.getDfaMesFecha());
        }

        if (this.getDfaDiaFecha() != null && this.getDfaDiaFecha().longValue() == -999) {
            conditions += " AND DFA_DIA_FECHA IS NULL";
        } else if (this.getDfaDiaFecha() != null) {
            conditions += " AND DFA_DIA_FECHA = ?";
            values.add(this.getDfaDiaFecha());
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
        String sql = "SELECT * FROM DIASFERA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getDfaNumPais() != null && this.getDfaNumPais().longValue() == -999) {
            conditions += " AND DFA_NUM_PAIS IS NULL";
        } else if (this.getDfaNumPais() != null) {
            conditions += " AND DFA_NUM_PAIS = ?";
            values.add(this.getDfaNumPais());
        }

        if (this.getDfaAnoFecha() != null && this.getDfaAnoFecha().longValue() == -999) {
            conditions += " AND DFA_ANO_FECHA IS NULL";
        } else if (this.getDfaAnoFecha() != null) {
            conditions += " AND DFA_ANO_FECHA = ?";
            values.add(this.getDfaAnoFecha());
        }

        if (this.getDfaMesFecha() != null && this.getDfaMesFecha().longValue() == -999) {
            conditions += " AND DFA_MES_FECHA IS NULL";
        } else if (this.getDfaMesFecha() != null) {
            conditions += " AND DFA_MES_FECHA = ?";
            values.add(this.getDfaMesFecha());
        }

        if (this.getDfaDiaFecha() != null && this.getDfaDiaFecha().longValue() == -999) {
            conditions += " AND DFA_DIA_FECHA IS NULL";
        } else if (this.getDfaDiaFecha() != null) {
            conditions += " AND DFA_DIA_FECHA = ?";
            values.add(this.getDfaDiaFecha());
        }

        if (this.getDfaDescFecha() != null && "null".equals(this.getDfaDescFecha())) {
            conditions += " AND DFA_DESC_FECHA IS NULL";
        } else if (this.getDfaDescFecha() != null) {
            conditions += " AND DFA_DESC_FECHA = ?";
            values.add(this.getDfaDescFecha());
        }

        if (this.getDfaNumTipoDia() != null && this.getDfaNumTipoDia().longValue() == -999) {
            conditions += " AND DFA_NUM_TIPO_DIA IS NULL";
        } else if (this.getDfaNumTipoDia() != null) {
            conditions += " AND DFA_NUM_TIPO_DIA = ?";
            values.add(this.getDfaNumTipoDia());
        }

        if (this.getDfaCvePeriodo() != null && "null".equals(this.getDfaCvePeriodo())) {
            conditions += " AND DFA_CVE_PERIODO IS NULL";
        } else if (this.getDfaCvePeriodo() != null) {
            conditions += " AND DFA_CVE_PERIODO = ?";
            values.add(this.getDfaCvePeriodo());
        }

        if (this.getDfaCveDia() != null && "null".equals(this.getDfaCveDia())) {
            conditions += " AND DFA_CVE_DIA IS NULL";
        } else if (this.getDfaCveDia() != null) {
            conditions += " AND DFA_CVE_DIA = ?";
            values.add(this.getDfaCveDia());
        }

        if (this.getDfaCveMes() != null && "null".equals(this.getDfaCveMes())) {
            conditions += " AND DFA_CVE_MES IS NULL";
        } else if (this.getDfaCveMes() != null) {
            conditions += " AND DFA_CVE_MES = ?";
            values.add(this.getDfaCveMes());
        }

        if (this.getDfaPeriodicidad() != null && "null".equals(this.getDfaPeriodicidad())) {
            conditions += " AND DFA_PERIODICIDAD IS NULL";
        } else if (this.getDfaPeriodicidad() != null) {
            conditions += " AND DFA_PERIODICIDAD = ?";
            values.add(this.getDfaPeriodicidad());
        }

        if (this.getDfaAnoAltaReg() != null && this.getDfaAnoAltaReg().longValue() == -999) {
            conditions += " AND DFA_ANO_ALTA_REG IS NULL";
        } else if (this.getDfaAnoAltaReg() != null) {
            conditions += " AND DFA_ANO_ALTA_REG = ?";
            values.add(this.getDfaAnoAltaReg());
        }

        if (this.getDfaMesAltaReg() != null && this.getDfaMesAltaReg().longValue() == -999) {
            conditions += " AND DFA_MES_ALTA_REG IS NULL";
        } else if (this.getDfaMesAltaReg() != null) {
            conditions += " AND DFA_MES_ALTA_REG = ?";
            values.add(this.getDfaMesAltaReg());
        }

        if (this.getDfaDiaAltaReg() != null && this.getDfaDiaAltaReg().longValue() == -999) {
            conditions += " AND DFA_DIA_ALTA_REG IS NULL";
        } else if (this.getDfaDiaAltaReg() != null) {
            conditions += " AND DFA_DIA_ALTA_REG = ?";
            values.add(this.getDfaDiaAltaReg());
        }

        if (this.getDfaAnoUltMod() != null && this.getDfaAnoUltMod().longValue() == -999) {
            conditions += " AND DFA_ANO_ULT_MOD IS NULL";
        } else if (this.getDfaAnoUltMod() != null) {
            conditions += " AND DFA_ANO_ULT_MOD = ?";
            values.add(this.getDfaAnoUltMod());
        }

        if (this.getDfaMesUltMod() != null && this.getDfaMesUltMod().longValue() == -999) {
            conditions += " AND DFA_MES_ULT_MOD IS NULL";
        } else if (this.getDfaMesUltMod() != null) {
            conditions += " AND DFA_MES_ULT_MOD = ?";
            values.add(this.getDfaMesUltMod());
        }

        if (this.getDfaDiaUltMod() != null && this.getDfaDiaUltMod().longValue() == -999) {
            conditions += " AND DFA_DIA_ULT_MOD IS NULL";
        } else if (this.getDfaDiaUltMod() != null) {
            conditions += " AND DFA_DIA_ULT_MOD = ?";
            values.add(this.getDfaDiaUltMod());
        }

        if (this.getDfaCveStDiasfera() != null && "null".equals(this.getDfaCveStDiasfera())) {
            conditions += " AND DFA_CVE_ST_DIASFERA IS NULL";
        } else if (this.getDfaCveStDiasfera() != null) {
            conditions += " AND DFA_CVE_ST_DIASFERA = ?";
            values.add(this.getDfaCveStDiasfera());
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
        String sql = "UPDATE DIASFERA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND DFA_NUM_PAIS = ?";
        pkValues.add(this.getDfaNumPais());
        conditions += " AND DFA_ANO_FECHA = ?";
        pkValues.add(this.getDfaAnoFecha());
        conditions += " AND DFA_MES_FECHA = ?";
        pkValues.add(this.getDfaMesFecha());
        conditions += " AND DFA_DIA_FECHA = ?";
        pkValues.add(this.getDfaDiaFecha());
        fields += " DFA_DESC_FECHA = ?, ";
        values.add(this.getDfaDescFecha());
        fields += " DFA_NUM_TIPO_DIA = ?, ";
        values.add(this.getDfaNumTipoDia());
        fields += " DFA_CVE_PERIODO = ?, ";
        values.add(this.getDfaCvePeriodo());
        fields += " DFA_CVE_DIA = ?, ";
        values.add(this.getDfaCveDia());
        fields += " DFA_CVE_MES = ?, ";
        values.add(this.getDfaCveMes());
        fields += " DFA_PERIODICIDAD = ?, ";
        values.add(this.getDfaPeriodicidad());
        fields += " DFA_ANO_ALTA_REG = ?, ";
        values.add(this.getDfaAnoAltaReg());
        fields += " DFA_MES_ALTA_REG = ?, ";
        values.add(this.getDfaMesAltaReg());
        fields += " DFA_DIA_ALTA_REG = ?, ";
        values.add(this.getDfaDiaAltaReg());
        fields += " DFA_ANO_ULT_MOD = ?, ";
        values.add(this.getDfaAnoUltMod());
        fields += " DFA_MES_ULT_MOD = ?, ";
        values.add(this.getDfaMesUltMod());
        fields += " DFA_DIA_ULT_MOD = ?, ";
        values.add(this.getDfaDiaUltMod());
        fields += " DFA_CVE_ST_DIASFERA = ?, ";
        values.add(this.getDfaCveStDiasfera());
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
        String sql = "INSERT INTO DIASFERA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", DFA_NUM_PAIS";
        fieldValues += ", ?";
        values.add(this.getDfaNumPais());

        fields += ", DFA_ANO_FECHA";
        fieldValues += ", ?";
        values.add(this.getDfaAnoFecha());

        fields += ", DFA_MES_FECHA";
        fieldValues += ", ?";
        values.add(this.getDfaMesFecha());

        fields += ", DFA_DIA_FECHA";
        fieldValues += ", ?";
        values.add(this.getDfaDiaFecha());

        fields += ", DFA_DESC_FECHA";
        fieldValues += ", ?";
        values.add(this.getDfaDescFecha());

        fields += ", DFA_NUM_TIPO_DIA";
        fieldValues += ", ?";
        values.add(this.getDfaNumTipoDia());

        fields += ", DFA_CVE_PERIODO";
        fieldValues += ", ?";
        values.add(this.getDfaCvePeriodo());

        fields += ", DFA_CVE_DIA";
        fieldValues += ", ?";
        values.add(this.getDfaCveDia());

        fields += ", DFA_CVE_MES";
        fieldValues += ", ?";
        values.add(this.getDfaCveMes());

        fields += ", DFA_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getDfaPeriodicidad());

        fields += ", DFA_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDfaAnoAltaReg());

        fields += ", DFA_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDfaMesAltaReg());

        fields += ", DFA_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getDfaDiaAltaReg());

        fields += ", DFA_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDfaAnoUltMod());

        fields += ", DFA_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDfaMesUltMod());

        fields += ", DFA_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getDfaDiaUltMod());

        fields += ", DFA_CVE_ST_DIASFERA";
        fieldValues += ", ?";
        values.add(this.getDfaCveStDiasfera());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM DIASFERA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND DFA_NUM_PAIS = ?";
        values.add(this.getDfaNumPais());
        conditions += " AND DFA_ANO_FECHA = ?";
        values.add(this.getDfaAnoFecha());
        conditions += " AND DFA_MES_FECHA = ?";
        values.add(this.getDfaMesFecha());
        conditions += " AND DFA_DIA_FECHA = ?";
        values.add(this.getDfaDiaFecha());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Diasfera instance = (Diasfera) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getDfaNumPais().equals(instance.getDfaNumPais()))
            equalObjects = false;
        if (equalObjects && !this.getDfaAnoFecha().equals(instance.getDfaAnoFecha()))
            equalObjects = false;
        if (equalObjects && !this.getDfaMesFecha().equals(instance.getDfaMesFecha()))
            equalObjects = false;
        if (equalObjects && !this.getDfaDiaFecha().equals(instance.getDfaDiaFecha()))
            equalObjects = false;
        if (equalObjects && !this.getDfaDescFecha().equals(instance.getDfaDescFecha()))
            equalObjects = false;
        if (equalObjects && !this.getDfaNumTipoDia().equals(instance.getDfaNumTipoDia()))
            equalObjects = false;
        if (equalObjects && !this.getDfaCvePeriodo().equals(instance.getDfaCvePeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getDfaCveDia().equals(instance.getDfaCveDia()))
            equalObjects = false;
        if (equalObjects && !this.getDfaCveMes().equals(instance.getDfaCveMes()))
            equalObjects = false;
        if (equalObjects && !this.getDfaPeriodicidad().equals(instance.getDfaPeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getDfaAnoAltaReg().equals(instance.getDfaAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDfaMesAltaReg().equals(instance.getDfaMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDfaDiaAltaReg().equals(instance.getDfaDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getDfaAnoUltMod().equals(instance.getDfaAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDfaMesUltMod().equals(instance.getDfaMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDfaDiaUltMod().equals(instance.getDfaDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getDfaCveStDiasfera().equals(instance.getDfaCveStDiasfera()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Diasfera result = new Diasfera();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setDfaNumPais((BigDecimal) objectData.getData("DFA_NUM_PAIS"));
        result.setDfaAnoFecha((BigDecimal) objectData.getData("DFA_ANO_FECHA"));
        result.setDfaMesFecha((BigDecimal) objectData.getData("DFA_MES_FECHA"));
        result.setDfaDiaFecha((BigDecimal) objectData.getData("DFA_DIA_FECHA"));
        result.setDfaDescFecha((String) objectData.getData("DFA_DESC_FECHA"));
        result.setDfaNumTipoDia((BigDecimal) objectData.getData("DFA_NUM_TIPO_DIA"));
        result.setDfaCvePeriodo((String) objectData.getData("DFA_CVE_PERIODO"));
        result.setDfaCveDia((String) objectData.getData("DFA_CVE_DIA"));
        result.setDfaCveMes((String) objectData.getData("DFA_CVE_MES"));
        result.setDfaPeriodicidad((String) objectData.getData("DFA_PERIODICIDAD"));
        result.setDfaAnoAltaReg((BigDecimal) objectData.getData("DFA_ANO_ALTA_REG"));
        result.setDfaMesAltaReg((BigDecimal) objectData.getData("DFA_MES_ALTA_REG"));
        result.setDfaDiaAltaReg((BigDecimal) objectData.getData("DFA_DIA_ALTA_REG"));
        result.setDfaAnoUltMod((BigDecimal) objectData.getData("DFA_ANO_ULT_MOD"));
        result.setDfaMesUltMod((BigDecimal) objectData.getData("DFA_MES_ULT_MOD"));
        result.setDfaDiaUltMod((BigDecimal) objectData.getData("DFA_DIA_ULT_MOD"));
        result.setDfaCveStDiasfera((String) objectData.getData("DFA_CVE_ST_DIASFERA"));

        return result;

    }

}
