package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "PATRIMONIO_PK", columns = { "CTO_NUM_CONTRATO" }, sequences = { "MAX" })
public class Patrimonio extends DomainObject {

    BigDecimal ctoNumContrato = null;
    String ctoNomContrato = null;
    String ctoCveTipoNeg = null;
    String ctoCveClasProd = null;
    BigDecimal ctoNumNivel1 = null;
    BigDecimal ctoNumNivel2 = null;
    BigDecimal ctoNumNivel3 = null;
    BigDecimal ctoNumNivel4 = null;
    BigDecimal ctoNumNivel5 = null;
    String ctoNomActividad = null;
    String ctoTipoAdmon = null;
    BigDecimal salImpSaldoAct = null;

    public Patrimonio() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumContrato(BigDecimal ctoNumContrato) {
        this.ctoNumContrato = ctoNumContrato;
    }

    public BigDecimal getCtoNumContrato() {
        return this.ctoNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoNomContrato(String ctoNomContrato) {
        this.ctoNomContrato = ctoNomContrato;
    }

    public String getCtoNomContrato() {
        return this.ctoNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoCveTipoNeg(String ctoCveTipoNeg) {
        this.ctoCveTipoNeg = ctoCveTipoNeg;
    }

    public String getCtoCveTipoNeg() {
        return this.ctoCveTipoNeg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoCveClasProd(String ctoCveClasProd) {
        this.ctoCveClasProd = ctoCveClasProd;
    }

    public String getCtoCveClasProd() {
        return this.ctoCveClasProd;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNivel1(BigDecimal ctoNumNivel1) {
        this.ctoNumNivel1 = ctoNumNivel1;
    }

    public BigDecimal getCtoNumNivel1() {
        return this.ctoNumNivel1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNivel2(BigDecimal ctoNumNivel2) {
        this.ctoNumNivel2 = ctoNumNivel2;
    }

    public BigDecimal getCtoNumNivel2() {
        return this.ctoNumNivel2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNivel3(BigDecimal ctoNumNivel3) {
        this.ctoNumNivel3 = ctoNumNivel3;
    }

    public BigDecimal getCtoNumNivel3() {
        return this.ctoNumNivel3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNivel4(BigDecimal ctoNumNivel4) {
        this.ctoNumNivel4 = ctoNumNivel4;
    }

    public BigDecimal getCtoNumNivel4() {
        return this.ctoNumNivel4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNivel5(BigDecimal ctoNumNivel5) {
        this.ctoNumNivel5 = ctoNumNivel5;
    }

    public BigDecimal getCtoNumNivel5() {
        return this.ctoNumNivel5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoNomActividad(String ctoNomActividad) {
        this.ctoNomActividad = ctoNomActividad;
    }

    public String getCtoNomActividad() {
        return this.ctoNomActividad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoTipoAdmon(String ctoTipoAdmon) {
        this.ctoTipoAdmon = ctoTipoAdmon;
    }

    public String getCtoTipoAdmon() {
        return this.ctoTipoAdmon;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setSalImpSaldoAct(BigDecimal salImpSaldoAct) {
        this.salImpSaldoAct = salImpSaldoAct;
    }

    public BigDecimal getSalImpSaldoAct() {
        return this.salImpSaldoAct;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM PATRIMONIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtoNumContrato() != null && this.getCtoNumContrato().longValue() == -999) {
            conditions += " AND CTO_NUM_CONTRATO IS NULL";
        } else if (this.getCtoNumContrato() != null) {
            conditions += " AND CTO_NUM_CONTRATO = ?";
            values.add(this.getCtoNumContrato());
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
        String sql = "SELECT * FROM PATRIMONIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtoNumContrato() != null && this.getCtoNumContrato().longValue() == -999) {
            conditions += " AND CTO_NUM_CONTRATO IS NULL";
        } else if (this.getCtoNumContrato() != null) {
            conditions += " AND CTO_NUM_CONTRATO = ?";
            values.add(this.getCtoNumContrato());
        }

        if (this.getCtoNomContrato() != null && "null".equals(this.getCtoNomContrato())) {
            conditions += " AND CTO_NOM_CONTRATO IS NULL";
        } else if (this.getCtoNomContrato() != null) {
            conditions += " AND CTO_NOM_CONTRATO = ?";
            values.add(this.getCtoNomContrato());
        }

        if (this.getCtoCveTipoNeg() != null && "null".equals(this.getCtoCveTipoNeg())) {
            conditions += " AND CTO_CVE_TIPO_NEG IS NULL";
        } else if (this.getCtoCveTipoNeg() != null) {
            conditions += " AND CTO_CVE_TIPO_NEG = ?";
            values.add(this.getCtoCveTipoNeg());
        }

        if (this.getCtoCveClasProd() != null && "null".equals(this.getCtoCveClasProd())) {
            conditions += " AND CTO_CVE_CLAS_PROD IS NULL";
        } else if (this.getCtoCveClasProd() != null) {
            conditions += " AND CTO_CVE_CLAS_PROD = ?";
            values.add(this.getCtoCveClasProd());
        }

        if (this.getCtoNumNivel1() != null && this.getCtoNumNivel1().longValue() == -999) {
            conditions += " AND CTO_NUM_NIVEL1 IS NULL";
        } else if (this.getCtoNumNivel1() != null) {
            conditions += " AND CTO_NUM_NIVEL1 = ?";
            values.add(this.getCtoNumNivel1());
        }

        if (this.getCtoNumNivel2() != null && this.getCtoNumNivel2().longValue() == -999) {
            conditions += " AND CTO_NUM_NIVEL2 IS NULL";
        } else if (this.getCtoNumNivel2() != null) {
            conditions += " AND CTO_NUM_NIVEL2 = ?";
            values.add(this.getCtoNumNivel2());
        }

        if (this.getCtoNumNivel3() != null && this.getCtoNumNivel3().longValue() == -999) {
            conditions += " AND CTO_NUM_NIVEL3 IS NULL";
        } else if (this.getCtoNumNivel3() != null) {
            conditions += " AND CTO_NUM_NIVEL3 = ?";
            values.add(this.getCtoNumNivel3());
        }

        if (this.getCtoNumNivel4() != null && this.getCtoNumNivel4().longValue() == -999) {
            conditions += " AND CTO_NUM_NIVEL4 IS NULL";
        } else if (this.getCtoNumNivel4() != null) {
            conditions += " AND CTO_NUM_NIVEL4 = ?";
            values.add(this.getCtoNumNivel4());
        }

        if (this.getCtoNumNivel5() != null && this.getCtoNumNivel5().longValue() == -999) {
            conditions += " AND CTO_NUM_NIVEL5 IS NULL";
        } else if (this.getCtoNumNivel5() != null) {
            conditions += " AND CTO_NUM_NIVEL5 = ?";
            values.add(this.getCtoNumNivel5());
        }

        if (this.getCtoNomActividad() != null && "null".equals(this.getCtoNomActividad())) {
            conditions += " AND CTO_NOM_ACTIVIDAD IS NULL";
        } else if (this.getCtoNomActividad() != null) {
            conditions += " AND CTO_NOM_ACTIVIDAD = ?";
            values.add(this.getCtoNomActividad());
        }

        if (this.getCtoTipoAdmon() != null && "null".equals(this.getCtoTipoAdmon())) {
            conditions += " AND CTO_TIPO_ADMON IS NULL";
        } else if (this.getCtoTipoAdmon() != null) {
            conditions += " AND CTO_TIPO_ADMON = ?";
            values.add(this.getCtoTipoAdmon());
        }

        if (this.getSalImpSaldoAct() != null && this.getSalImpSaldoAct().longValue() == -999) {
            conditions += " AND SAL_IMP_SALDO_ACT IS NULL";
        } else if (this.getSalImpSaldoAct() != null) {
            conditions += " AND SAL_IMP_SALDO_ACT = ?";
            values.add(this.getSalImpSaldoAct());
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
        String sql = "UPDATE PATRIMONIO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CTO_NUM_CONTRATO = ?";
        pkValues.add(this.getCtoNumContrato());
        fields += " CTO_NOM_CONTRATO = ?, ";
        values.add(this.getCtoNomContrato());
        fields += " CTO_CVE_TIPO_NEG = ?, ";
        values.add(this.getCtoCveTipoNeg());
        fields += " CTO_CVE_CLAS_PROD = ?, ";
        values.add(this.getCtoCveClasProd());
        fields += " CTO_NUM_NIVEL1 = ?, ";
        values.add(this.getCtoNumNivel1());
        fields += " CTO_NUM_NIVEL2 = ?, ";
        values.add(this.getCtoNumNivel2());
        fields += " CTO_NUM_NIVEL3 = ?, ";
        values.add(this.getCtoNumNivel3());
        fields += " CTO_NUM_NIVEL4 = ?, ";
        values.add(this.getCtoNumNivel4());
        fields += " CTO_NUM_NIVEL5 = ?, ";
        values.add(this.getCtoNumNivel5());
        fields += " CTO_NOM_ACTIVIDAD = ?, ";
        values.add(this.getCtoNomActividad());
        fields += " CTO_TIPO_ADMON = ?, ";
        values.add(this.getCtoTipoAdmon());
        fields += " SAL_IMP_SALDO_ACT = ?, ";
        values.add(this.getSalImpSaldoAct());
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
        String sql = "INSERT INTO PATRIMONIO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtoNumContrato());

        fields += ", CTO_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtoNomContrato());

        fields += ", CTO_CVE_TIPO_NEG";
        fieldValues += ", ?";
        values.add(this.getCtoCveTipoNeg());

        fields += ", CTO_CVE_CLAS_PROD";
        fieldValues += ", ?";
        values.add(this.getCtoCveClasProd());

        fields += ", CTO_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel1());

        fields += ", CTO_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel2());

        fields += ", CTO_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel3());

        fields += ", CTO_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel4());

        fields += ", CTO_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel5());

        fields += ", CTO_NOM_ACTIVIDAD";
        fieldValues += ", ?";
        values.add(this.getCtoNomActividad());

        fields += ", CTO_TIPO_ADMON";
        fieldValues += ", ?";
        values.add(this.getCtoTipoAdmon());

        fields += ", SAL_IMP_SALDO_ACT";
        fieldValues += ", ?";
        values.add(this.getSalImpSaldoAct());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM PATRIMONIO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CTO_NUM_CONTRATO = ?";
        values.add(this.getCtoNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Patrimonio instance = (Patrimonio) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtoNumContrato().equals(instance.getCtoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNomContrato().equals(instance.getCtoNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveTipoNeg().equals(instance.getCtoCveTipoNeg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveClasProd().equals(instance.getCtoCveClasProd()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNivel1().equals(instance.getCtoNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNivel2().equals(instance.getCtoNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNivel3().equals(instance.getCtoNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNivel4().equals(instance.getCtoNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNivel5().equals(instance.getCtoNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNomActividad().equals(instance.getCtoNomActividad()))
            equalObjects = false;
        if (equalObjects && !this.getCtoTipoAdmon().equals(instance.getCtoTipoAdmon()))
            equalObjects = false;
        if (equalObjects && !this.getSalImpSaldoAct().equals(instance.getSalImpSaldoAct()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Patrimonio result = new Patrimonio();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCtoNumContrato((BigDecimal) objectData.getData("CTO_NUM_CONTRATO"));
        result.setCtoNomContrato((String) objectData.getData("CTO_NOM_CONTRATO"));
        result.setCtoCveTipoNeg((String) objectData.getData("CTO_CVE_TIPO_NEG"));
        result.setCtoCveClasProd((String) objectData.getData("CTO_CVE_CLAS_PROD"));
        result.setCtoNumNivel1((BigDecimal) objectData.getData("CTO_NUM_NIVEL1"));
        result.setCtoNumNivel2((BigDecimal) objectData.getData("CTO_NUM_NIVEL2"));
        result.setCtoNumNivel3((BigDecimal) objectData.getData("CTO_NUM_NIVEL3"));
        result.setCtoNumNivel4((BigDecimal) objectData.getData("CTO_NUM_NIVEL4"));
        result.setCtoNumNivel5((BigDecimal) objectData.getData("CTO_NUM_NIVEL5"));
        result.setCtoNomActividad((String) objectData.getData("CTO_NOM_ACTIVIDAD"));
        result.setCtoTipoAdmon((String) objectData.getData("CTO_TIPO_ADMON"));
        result.setSalImpSaldoAct((BigDecimal) objectData.getData("SAL_IMP_SALDO_ACT"));

        return result;

    }

}
