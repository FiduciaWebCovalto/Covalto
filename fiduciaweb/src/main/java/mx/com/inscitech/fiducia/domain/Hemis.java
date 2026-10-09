package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "HEMIS_PK", columns = { "HIE_CVE_HIST" }, sequences = { "MAX" })
public class Hemis extends DomainObject {

    BigDecimal hieCveHist = null;
    BigDecimal cpoActaEmis = null;
    String cpoSerie = null;
    BigDecimal hieTitEmit = null;
    String hieFecEmis = null;
    BigDecimal hieTitColoca = null;
    String hieFecColoca = null;
    BigDecimal hieTitTesor = null;
    String hieFecLiquida = null;

    public Hemis() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setHieCveHist(BigDecimal hieCveHist) {
        this.hieCveHist = hieCveHist;
    }

    public BigDecimal getHieCveHist() {
        return this.hieCveHist;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpoActaEmis(BigDecimal cpoActaEmis) {
        this.cpoActaEmis = cpoActaEmis;
    }

    public BigDecimal getCpoActaEmis() {
        return this.cpoActaEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoSerie(String cpoSerie) {
        this.cpoSerie = cpoSerie;
    }

    public String getCpoSerie() {
        return this.cpoSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setHieTitEmit(BigDecimal hieTitEmit) {
        this.hieTitEmit = hieTitEmit;
    }

    public BigDecimal getHieTitEmit() {
        return this.hieTitEmit;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setHieFecEmis(String hieFecEmis) {
        this.hieFecEmis = hieFecEmis;
    }

    public String getHieFecEmis() {
        return this.hieFecEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setHieTitColoca(BigDecimal hieTitColoca) {
        this.hieTitColoca = hieTitColoca;
    }

    public BigDecimal getHieTitColoca() {
        return this.hieTitColoca;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setHieFecColoca(String hieFecColoca) {
        this.hieFecColoca = hieFecColoca;
    }

    public String getHieFecColoca() {
        return this.hieFecColoca;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setHieTitTesor(BigDecimal hieTitTesor) {
        this.hieTitTesor = hieTitTesor;
    }

    public BigDecimal getHieTitTesor() {
        return this.hieTitTesor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setHieFecLiquida(String hieFecLiquida) {
        this.hieFecLiquida = hieFecLiquida;
    }

    public String getHieFecLiquida() {
        return this.hieFecLiquida;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM HEMIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getHieCveHist() != null && this.getHieCveHist().longValue() == -999) {
            conditions += " AND HIE_CVE_HIST IS NULL";
        } else if (this.getHieCveHist() != null) {
            conditions += " AND HIE_CVE_HIST = ?";
            values.add(this.getHieCveHist());
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
        String sql = "SELECT * FROM HEMIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getHieCveHist() != null && this.getHieCveHist().longValue() == -999) {
            conditions += " AND HIE_CVE_HIST IS NULL";
        } else if (this.getHieCveHist() != null) {
            conditions += " AND HIE_CVE_HIST = ?";
            values.add(this.getHieCveHist());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
        }

        if (this.getHieTitEmit() != null && this.getHieTitEmit().longValue() == -999) {
            conditions += " AND HIE_TIT_EMIT IS NULL";
        } else if (this.getHieTitEmit() != null) {
            conditions += " AND HIE_TIT_EMIT = ?";
            values.add(this.getHieTitEmit());
        }

        if (this.getHieFecEmis() != null && "null".equals(this.getHieFecEmis())) {
            conditions += " AND HIE_FEC_EMIS IS NULL";
        } else if (this.getHieFecEmis() != null) {
            conditions += " AND HIE_FEC_EMIS = ?";
            values.add(this.getHieFecEmis());
        }

        if (this.getHieTitColoca() != null && this.getHieTitColoca().longValue() == -999) {
            conditions += " AND HIE_TIT_COLOCA IS NULL";
        } else if (this.getHieTitColoca() != null) {
            conditions += " AND HIE_TIT_COLOCA = ?";
            values.add(this.getHieTitColoca());
        }

        if (this.getHieFecColoca() != null && "null".equals(this.getHieFecColoca())) {
            conditions += " AND HIE_FEC_COLOCA IS NULL";
        } else if (this.getHieFecColoca() != null) {
            conditions += " AND HIE_FEC_COLOCA = ?";
            values.add(this.getHieFecColoca());
        }

        if (this.getHieTitTesor() != null && this.getHieTitTesor().longValue() == -999) {
            conditions += " AND HIE_TIT_TESOR IS NULL";
        } else if (this.getHieTitTesor() != null) {
            conditions += " AND HIE_TIT_TESOR = ?";
            values.add(this.getHieTitTesor());
        }

        if (this.getHieFecLiquida() != null && "null".equals(this.getHieFecLiquida())) {
            conditions += " AND HIE_FEC_LIQUIDA IS NULL";
        } else if (this.getHieFecLiquida() != null) {
            conditions += " AND HIE_FEC_LIQUIDA = ?";
            values.add(this.getHieFecLiquida());
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
        String sql = "UPDATE HEMIS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND HIE_CVE_HIST = ?";
        pkValues.add(this.getHieCveHist());
        fields += " CPO_ACTA_EMIS = ?, ";
        values.add(this.getCpoActaEmis());
        fields += " CPO_SERIE = ?, ";
        values.add(this.getCpoSerie());
        fields += " HIE_TIT_EMIT = ?, ";
        values.add(this.getHieTitEmit());
        fields += " HIE_FEC_EMIS = ?, ";
        values.add(this.getHieFecEmis());
        fields += " HIE_TIT_COLOCA = ?, ";
        values.add(this.getHieTitColoca());
        fields += " HIE_FEC_COLOCA = ?, ";
        values.add(this.getHieFecColoca());
        fields += " HIE_TIT_TESOR = ?, ";
        values.add(this.getHieTitTesor());
        fields += " HIE_FEC_LIQUIDA = ?, ";
        values.add(this.getHieFecLiquida());
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
        String sql = "INSERT INTO HEMIS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", HIE_CVE_HIST";
        fieldValues += ", ?";
        values.add(this.getHieCveHist());

        fields += ", CPO_ACTA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoActaEmis());

        fields += ", CPO_SERIE";
        fieldValues += ", ?";
        values.add(this.getCpoSerie());

        fields += ", HIE_TIT_EMIT";
        fieldValues += ", ?";
        values.add(this.getHieTitEmit());

        fields += ", HIE_FEC_EMIS";
        fieldValues += ", ?";
        values.add(this.getHieFecEmis());

        fields += ", HIE_TIT_COLOCA";
        fieldValues += ", ?";
        values.add(this.getHieTitColoca());

        fields += ", HIE_FEC_COLOCA";
        fieldValues += ", ?";
        values.add(this.getHieFecColoca());

        fields += ", HIE_TIT_TESOR";
        fieldValues += ", ?";
        values.add(this.getHieTitTesor());

        fields += ", HIE_FEC_LIQUIDA";
        fieldValues += ", ?";
        values.add(this.getHieFecLiquida());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM HEMIS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND HIE_CVE_HIST = ?";
        values.add(this.getHieCveHist());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Hemis instance = (Hemis) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getHieCveHist().equals(instance.getHieCveHist()))
            equalObjects = false;
        if (equalObjects && !this.getCpoActaEmis().equals(instance.getCpoActaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCpoSerie().equals(instance.getCpoSerie()))
            equalObjects = false;
        if (equalObjects && !this.getHieTitEmit().equals(instance.getHieTitEmit()))
            equalObjects = false;
        if (equalObjects && !this.getHieFecEmis().equals(instance.getHieFecEmis()))
            equalObjects = false;
        if (equalObjects && !this.getHieTitColoca().equals(instance.getHieTitColoca()))
            equalObjects = false;
        if (equalObjects && !this.getHieFecColoca().equals(instance.getHieFecColoca()))
            equalObjects = false;
        if (equalObjects && !this.getHieTitTesor().equals(instance.getHieTitTesor()))
            equalObjects = false;
        if (equalObjects && !this.getHieFecLiquida().equals(instance.getHieFecLiquida()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Hemis result = new Hemis();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setHieCveHist((BigDecimal) objectData.getData("HIE_CVE_HIST"));
        result.setCpoActaEmis((BigDecimal) objectData.getData("CPO_ACTA_EMIS"));
        result.setCpoSerie((String) objectData.getData("CPO_SERIE"));
        result.setHieTitEmit((BigDecimal) objectData.getData("HIE_TIT_EMIT"));
        result.setHieFecEmis((String) objectData.getData("HIE_FEC_EMIS"));
        result.setHieTitColoca((BigDecimal) objectData.getData("HIE_TIT_COLOCA"));
        result.setHieFecColoca((String) objectData.getData("HIE_FEC_COLOCA"));
        result.setHieTitTesor((BigDecimal) objectData.getData("HIE_TIT_TESOR"));
        result.setHieFecLiquida((String) objectData.getData("HIE_FEC_LIQUIDA"));

        return result;

    }

}
