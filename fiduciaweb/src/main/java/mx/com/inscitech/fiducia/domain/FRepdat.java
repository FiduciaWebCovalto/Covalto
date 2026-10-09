package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class FRepdat extends DomainObject {

    BigDecimal fRepIdReporte = null;
    String eRepNombre = null;
    String eRepTitulo = null;
    String eRepTitulo1 = null;
    String eRepTitulo2 = null;
    String eRepPie1 = null;
    String eRepPie2 = null;

    public FRepdat() {
        super();
        this.pkColumns = 0;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFRepIdReporte(BigDecimal fRepIdReporte) {
        this.fRepIdReporte = fRepIdReporte;
    }

    public BigDecimal getFRepIdReporte() {
        return this.fRepIdReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setERepNombre(String eRepNombre) {
        this.eRepNombre = eRepNombre;
    }

    public String getERepNombre() {
        return this.eRepNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setERepTitulo(String eRepTitulo) {
        this.eRepTitulo = eRepTitulo;
    }

    public String getERepTitulo() {
        return this.eRepTitulo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setERepTitulo1(String eRepTitulo1) {
        this.eRepTitulo1 = eRepTitulo1;
    }

    public String getERepTitulo1() {
        return this.eRepTitulo1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setERepTitulo2(String eRepTitulo2) {
        this.eRepTitulo2 = eRepTitulo2;
    }

    public String getERepTitulo2() {
        return this.eRepTitulo2;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setERepPie1(String eRepPie1) {
        this.eRepPie1 = eRepPie1;
    }

    public String getERepPie1() {
        return this.eRepPie1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setERepPie2(String eRepPie2) {
        this.eRepPie2 = eRepPie2;
    }

    public String getERepPie2() {
        return this.eRepPie2;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_REPDAT ";

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
        String sql = "SELECT * FROM F_REPDAT ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFRepIdReporte() != null && this.getFRepIdReporte().longValue() == -999) {
            conditions += " AND F_REP_ID_REPORTE IS NULL";
        } else if (this.getFRepIdReporte() != null) {
            conditions += " AND F_REP_ID_REPORTE = ?";
            values.add(this.getFRepIdReporte());
        }

        if (this.getERepNombre() != null && "null".equals(this.getERepNombre())) {
            conditions += " AND E_REP_NOMBRE IS NULL";
        } else if (this.getERepNombre() != null) {
            conditions += " AND E_REP_NOMBRE = ?";
            values.add(this.getERepNombre());
        }

        if (this.getERepTitulo() != null && "null".equals(this.getERepTitulo())) {
            conditions += " AND E_REP_TITULO IS NULL";
        } else if (this.getERepTitulo() != null) {
            conditions += " AND E_REP_TITULO = ?";
            values.add(this.getERepTitulo());
        }

        if (this.getERepTitulo1() != null && "null".equals(this.getERepTitulo1())) {
            conditions += " AND E_REP_TITULO1 IS NULL";
        } else if (this.getERepTitulo1() != null) {
            conditions += " AND E_REP_TITULO1 = ?";
            values.add(this.getERepTitulo1());
        }

        if (this.getERepTitulo2() != null && "null".equals(this.getERepTitulo2())) {
            conditions += " AND E_REP_TITULO2 IS NULL";
        } else if (this.getERepTitulo2() != null) {
            conditions += " AND E_REP_TITULO2 = ?";
            values.add(this.getERepTitulo2());
        }

        if (this.getERepPie1() != null && "null".equals(this.getERepPie1())) {
            conditions += " AND E_REP_PIE1 IS NULL";
        } else if (this.getERepPie1() != null) {
            conditions += " AND E_REP_PIE1 = ?";
            values.add(this.getERepPie1());
        }

        if (this.getERepPie2() != null && "null".equals(this.getERepPie2())) {
            conditions += " AND E_REP_PIE2 IS NULL";
        } else if (this.getERepPie2() != null) {
            conditions += " AND E_REP_PIE2 = ?";
            values.add(this.getERepPie2());
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
        String sql = "UPDATE F_REPDAT SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        fields += " F_REP_ID_REPORTE = ?, ";
        values.add(this.getFRepIdReporte());
        fields += " E_REP_NOMBRE = ?, ";
        values.add(this.getERepNombre());
        fields += " E_REP_TITULO = ?, ";
        values.add(this.getERepTitulo());
        fields += " E_REP_TITULO1 = ?, ";
        values.add(this.getERepTitulo1());
        fields += " E_REP_TITULO2 = ?, ";
        values.add(this.getERepTitulo2());
        fields += " E_REP_PIE1 = ?, ";
        values.add(this.getERepPie1());
        fields += " E_REP_PIE2 = ?, ";
        values.add(this.getERepPie2());
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
        String sql = "INSERT INTO F_REPDAT ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", F_REP_ID_REPORTE";
        fieldValues += ", ?";
        values.add(this.getFRepIdReporte());

        fields += ", E_REP_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getERepNombre());

        fields += ", E_REP_TITULO";
        fieldValues += ", ?";
        values.add(this.getERepTitulo());

        fields += ", E_REP_TITULO1";
        fieldValues += ", ?";
        values.add(this.getERepTitulo1());

        fields += ", E_REP_TITULO2";
        fieldValues += ", ?";
        values.add(this.getERepTitulo2());

        fields += ", E_REP_PIE1";
        fieldValues += ", ?";
        values.add(this.getERepPie1());

        fields += ", E_REP_PIE2";
        fieldValues += ", ?";
        values.add(this.getERepPie2());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_REPDAT WHERE ";

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
        FRepdat instance = (FRepdat) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFRepIdReporte().equals(instance.getFRepIdReporte()))
            equalObjects = false;
        if (equalObjects && !this.getERepNombre().equals(instance.getERepNombre()))
            equalObjects = false;
        if (equalObjects && !this.getERepTitulo().equals(instance.getERepTitulo()))
            equalObjects = false;
        if (equalObjects && !this.getERepTitulo1().equals(instance.getERepTitulo1()))
            equalObjects = false;
        if (equalObjects && !this.getERepTitulo2().equals(instance.getERepTitulo2()))
            equalObjects = false;
        if (equalObjects && !this.getERepPie1().equals(instance.getERepPie1()))
            equalObjects = false;
        if (equalObjects && !this.getERepPie2().equals(instance.getERepPie2()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRepdat result = new FRepdat();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFRepIdReporte((BigDecimal) objectData.getData("F_REP_ID_REPORTE"));
        result.setERepNombre((String) objectData.getData("E_REP_NOMBRE"));
        result.setERepTitulo((String) objectData.getData("E_REP_TITULO"));
        result.setERepTitulo1((String) objectData.getData("E_REP_TITULO1"));
        result.setERepTitulo2((String) objectData.getData("E_REP_TITULO2"));
        result.setERepPie1((String) objectData.getData("E_REP_PIE1"));
        result.setERepPie2((String) objectData.getData("E_REP_PIE2"));

        return result;

    }

}
