package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "POSEMI_PK", columns = { "CLA_DESCRIPCION", "CPO_SERIE", "CPO_ACTA_EMIS" }, sequences = { "MANUAL" })
public class Posemi extends DomainObject {

    BigDecimal cpoActaEmis = null;
    String cpoSerie = null;
    String claDescripcion = null;
    BigDecimal poePosAct = null;
    String poeFecAct = null;
    String poeFecha1 = null;
    BigDecimal poeTitColoc1 = null;
    BigDecimal poeUltHecho1 = null;
    String poeFecha2 = null;
    BigDecimal poeTitColoc2 = null;
    BigDecimal poeUltHecho2 = null;

    public Posemi() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpoActaEmis(BigDecimal cpoActaEmis) {
        this.cpoActaEmis = cpoActaEmis;
    }

    public BigDecimal getCpoActaEmis() {
        return this.cpoActaEmis;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoSerie(String cpoSerie) {
        this.cpoSerie = cpoSerie;
    }

    public String getCpoSerie() {
        return this.cpoSerie;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setClaDescripcion(String claDescripcion) {
        this.claDescripcion = claDescripcion;
    }

    public String getClaDescripcion() {
        return this.claDescripcion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoePosAct(BigDecimal poePosAct) {
        this.poePosAct = poePosAct;
    }

    public BigDecimal getPoePosAct() {
        return this.poePosAct;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPoeFecAct(String poeFecAct) {
        this.poeFecAct = poeFecAct;
    }

    public String getPoeFecAct() {
        return this.poeFecAct;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPoeFecha1(String poeFecha1) {
        this.poeFecha1 = poeFecha1;
    }

    public String getPoeFecha1() {
        return this.poeFecha1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoeTitColoc1(BigDecimal poeTitColoc1) {
        this.poeTitColoc1 = poeTitColoc1;
    }

    public BigDecimal getPoeTitColoc1() {
        return this.poeTitColoc1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoeUltHecho1(BigDecimal poeUltHecho1) {
        this.poeUltHecho1 = poeUltHecho1;
    }

    public BigDecimal getPoeUltHecho1() {
        return this.poeUltHecho1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPoeFecha2(String poeFecha2) {
        this.poeFecha2 = poeFecha2;
    }

    public String getPoeFecha2() {
        return this.poeFecha2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoeTitColoc2(BigDecimal poeTitColoc2) {
        this.poeTitColoc2 = poeTitColoc2;
    }

    public BigDecimal getPoeTitColoc2() {
        return this.poeTitColoc2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPoeUltHecho2(BigDecimal poeUltHecho2) {
        this.poeUltHecho2 = poeUltHecho2;
    }

    public BigDecimal getPoeUltHecho2() {
        return this.poeUltHecho2;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM POSEMI ";

        String conditions = "";
        ArrayList values = new ArrayList();

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

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
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
        String sql = "SELECT * FROM POSEMI ";

        String conditions = "";
        ArrayList values = new ArrayList();

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

        if (this.getClaDescripcion() != null && "null".equals(this.getClaDescripcion())) {
            conditions += " AND CLA_DESCRIPCION IS NULL";
        } else if (this.getClaDescripcion() != null) {
            conditions += " AND CLA_DESCRIPCION = ?";
            values.add(this.getClaDescripcion());
        }

        if (this.getPoePosAct() != null && this.getPoePosAct().longValue() == -999) {
            conditions += " AND POE_POS_ACT IS NULL";
        } else if (this.getPoePosAct() != null) {
            conditions += " AND POE_POS_ACT = ?";
            values.add(this.getPoePosAct());
        }

        if (this.getPoeFecAct() != null && "null".equals(this.getPoeFecAct())) {
            conditions += " AND POE_FEC_ACT IS NULL";
        } else if (this.getPoeFecAct() != null) {
            conditions += " AND POE_FEC_ACT = ?";
            values.add(this.getPoeFecAct());
        }

        if (this.getPoeFecha1() != null && "null".equals(this.getPoeFecha1())) {
            conditions += " AND POE_FECHA_1 IS NULL";
        } else if (this.getPoeFecha1() != null) {
            conditions += " AND POE_FECHA_1 = ?";
            values.add(this.getPoeFecha1());
        }

        if (this.getPoeTitColoc1() != null && this.getPoeTitColoc1().longValue() == -999) {
            conditions += " AND POE_TIT_COLOC_1 IS NULL";
        } else if (this.getPoeTitColoc1() != null) {
            conditions += " AND POE_TIT_COLOC_1 = ?";
            values.add(this.getPoeTitColoc1());
        }

        if (this.getPoeUltHecho1() != null && this.getPoeUltHecho1().longValue() == -999) {
            conditions += " AND POE_ULT_HECHO1 IS NULL";
        } else if (this.getPoeUltHecho1() != null) {
            conditions += " AND POE_ULT_HECHO1 = ?";
            values.add(this.getPoeUltHecho1());
        }

        if (this.getPoeFecha2() != null && "null".equals(this.getPoeFecha2())) {
            conditions += " AND POE_FECHA_2 IS NULL";
        } else if (this.getPoeFecha2() != null) {
            conditions += " AND POE_FECHA_2 = ?";
            values.add(this.getPoeFecha2());
        }

        if (this.getPoeTitColoc2() != null && this.getPoeTitColoc2().longValue() == -999) {
            conditions += " AND POE_TIT_COLOC_2 IS NULL";
        } else if (this.getPoeTitColoc2() != null) {
            conditions += " AND POE_TIT_COLOC_2 = ?";
            values.add(this.getPoeTitColoc2());
        }

        if (this.getPoeUltHecho2() != null && this.getPoeUltHecho2().longValue() == -999) {
            conditions += " AND POE_ULT_HECHO2 IS NULL";
        } else if (this.getPoeUltHecho2() != null) {
            conditions += " AND POE_ULT_HECHO2 = ?";
            values.add(this.getPoeUltHecho2());
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
        String sql = "UPDATE POSEMI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPO_ACTA_EMIS = ?";
        pkValues.add(this.getCpoActaEmis());
        conditions += " AND CPO_SERIE = ?";
        pkValues.add(this.getCpoSerie());
        conditions += " AND CLA_DESCRIPCION = ?";
        pkValues.add(this.getClaDescripcion());
        fields += " POE_POS_ACT = ?, ";
        values.add(this.getPoePosAct());
        fields += " POE_FEC_ACT = ?, ";
        values.add(this.getPoeFecAct());
        fields += " POE_FECHA_1 = ?, ";
        values.add(this.getPoeFecha1());
        fields += " POE_TIT_COLOC_1 = ?, ";
        values.add(this.getPoeTitColoc1());
        fields += " POE_ULT_HECHO1 = ?, ";
        values.add(this.getPoeUltHecho1());
        fields += " POE_FECHA_2 = ?, ";
        values.add(this.getPoeFecha2());
        fields += " POE_TIT_COLOC_2 = ?, ";
        values.add(this.getPoeTitColoc2());
        fields += " POE_ULT_HECHO2 = ?, ";
        values.add(this.getPoeUltHecho2());
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
        String sql = "INSERT INTO POSEMI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPO_ACTA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoActaEmis());

        fields += ", CPO_SERIE";
        fieldValues += ", ?";
        values.add(this.getCpoSerie());

        fields += ", CLA_DESCRIPCION";
        fieldValues += ", ?";
        values.add(this.getClaDescripcion());

        fields += ", POE_POS_ACT";
        fieldValues += ", ?";
        values.add(this.getPoePosAct());

        fields += ", POE_FEC_ACT";
        fieldValues += ", ?";
        values.add(this.getPoeFecAct());

        fields += ", POE_FECHA_1";
        fieldValues += ", ?";
        values.add(this.getPoeFecha1());

        fields += ", POE_TIT_COLOC_1";
        fieldValues += ", ?";
        values.add(this.getPoeTitColoc1());

        fields += ", POE_ULT_HECHO1";
        fieldValues += ", ?";
        values.add(this.getPoeUltHecho1());

        fields += ", POE_FECHA_2";
        fieldValues += ", ?";
        values.add(this.getPoeFecha2());

        fields += ", POE_TIT_COLOC_2";
        fieldValues += ", ?";
        values.add(this.getPoeTitColoc2());

        fields += ", POE_ULT_HECHO2";
        fieldValues += ", ?";
        values.add(this.getPoeUltHecho2());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM POSEMI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPO_ACTA_EMIS = ?";
        values.add(this.getCpoActaEmis());
        conditions += " AND CPO_SERIE = ?";
        values.add(this.getCpoSerie());
        conditions += " AND CLA_DESCRIPCION = ?";
        values.add(this.getClaDescripcion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Posemi instance = (Posemi) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCpoActaEmis().equals(instance.getCpoActaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCpoSerie().equals(instance.getCpoSerie()))
            equalObjects = false;
        if (equalObjects && !this.getClaDescripcion().equals(instance.getClaDescripcion()))
            equalObjects = false;
        if (equalObjects && !this.getPoePosAct().equals(instance.getPoePosAct()))
            equalObjects = false;
        if (equalObjects && !this.getPoeFecAct().equals(instance.getPoeFecAct()))
            equalObjects = false;
        if (equalObjects && !this.getPoeFecha1().equals(instance.getPoeFecha1()))
            equalObjects = false;
        if (equalObjects && !this.getPoeTitColoc1().equals(instance.getPoeTitColoc1()))
            equalObjects = false;
        if (equalObjects && !this.getPoeUltHecho1().equals(instance.getPoeUltHecho1()))
            equalObjects = false;
        if (equalObjects && !this.getPoeFecha2().equals(instance.getPoeFecha2()))
            equalObjects = false;
        if (equalObjects && !this.getPoeTitColoc2().equals(instance.getPoeTitColoc2()))
            equalObjects = false;
        if (equalObjects && !this.getPoeUltHecho2().equals(instance.getPoeUltHecho2()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Posemi result = new Posemi();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCpoActaEmis((BigDecimal) objectData.getData("CPO_ACTA_EMIS"));
        result.setCpoSerie((String) objectData.getData("CPO_SERIE"));
        result.setClaDescripcion((String) objectData.getData("CLA_DESCRIPCION"));
        result.setPoePosAct((BigDecimal) objectData.getData("POE_POS_ACT"));
        result.setPoeFecAct((String) objectData.getData("POE_FEC_ACT"));
        result.setPoeFecha1((String) objectData.getData("POE_FECHA_1"));
        result.setPoeTitColoc1((BigDecimal) objectData.getData("POE_TIT_COLOC_1"));
        result.setPoeUltHecho1((BigDecimal) objectData.getData("POE_ULT_HECHO1"));
        result.setPoeFecha2((String) objectData.getData("POE_FECHA_2"));
        result.setPoeTitColoc2((BigDecimal) objectData.getData("POE_TIT_COLOC_2"));
        result.setPoeUltHecho2((BigDecimal) objectData.getData("POE_ULT_HECHO2"));

        return result;

    }

}
