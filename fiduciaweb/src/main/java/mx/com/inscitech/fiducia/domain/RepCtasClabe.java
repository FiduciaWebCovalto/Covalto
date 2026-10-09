package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REP_CTAS_CLABE_PK", columns = { "RCB_SECUENCIAL" }, sequences = { "MAX" })
public class RepCtasClabe extends DomainObject {

    BigDecimal rcbSecuencial = null;
    String rcbReporte = null;
    String rcbTitulo1aColumna = null;
    String rcbTitular = null;
    String rcbBanco = null;
    String rcbClabe = null;
    String rcbTituloUltColumna = null;
    String rcbVal1aColumna = null;
    String rcbValUltColumna = null;

    public RepCtasClabe() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRcbSecuencial(BigDecimal rcbSecuencial) {
        this.rcbSecuencial = rcbSecuencial;
    }

    public BigDecimal getRcbSecuencial() {
        return this.rcbSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcbReporte(String rcbReporte) {
        this.rcbReporte = rcbReporte;
    }

    public String getRcbReporte() {
        return this.rcbReporte;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcbTitulo1aColumna(String rcbTitulo1aColumna) {
        this.rcbTitulo1aColumna = rcbTitulo1aColumna;
    }

    public String getRcbTitulo1aColumna() {
        return this.rcbTitulo1aColumna;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcbTitular(String rcbTitular) {
        this.rcbTitular = rcbTitular;
    }

    public String getRcbTitular() {
        return this.rcbTitular;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcbBanco(String rcbBanco) {
        this.rcbBanco = rcbBanco;
    }

    public String getRcbBanco() {
        return this.rcbBanco;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcbClabe(String rcbClabe) {
        this.rcbClabe = rcbClabe;
    }

    public String getRcbClabe() {
        return this.rcbClabe;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcbTituloUltColumna(String rcbTituloUltColumna) {
        this.rcbTituloUltColumna = rcbTituloUltColumna;
    }

    public String getRcbTituloUltColumna() {
        return this.rcbTituloUltColumna;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcbVal1aColumna(String rcbVal1aColumna) {
        this.rcbVal1aColumna = rcbVal1aColumna;
    }

    public String getRcbVal1aColumna() {
        return this.rcbVal1aColumna;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRcbValUltColumna(String rcbValUltColumna) {
        this.rcbValUltColumna = rcbValUltColumna;
    }

    public String getRcbValUltColumna() {
        return this.rcbValUltColumna;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REP_CTAS_CLABE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRcbSecuencial() != null && this.getRcbSecuencial().longValue() == -999) {
            conditions += " AND RCB_SECUENCIAL IS NULL";
        } else if (this.getRcbSecuencial() != null) {
            conditions += " AND RCB_SECUENCIAL = ?";
            values.add(this.getRcbSecuencial());
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
        String sql = "SELECT * FROM REP_CTAS_CLABE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRcbSecuencial() != null && this.getRcbSecuencial().longValue() == -999) {
            conditions += " AND RCB_SECUENCIAL IS NULL";
        } else if (this.getRcbSecuencial() != null) {
            conditions += " AND RCB_SECUENCIAL = ?";
            values.add(this.getRcbSecuencial());
        }

        if (this.getRcbReporte() != null && "null".equals(this.getRcbReporte())) {
            conditions += " AND RCB_REPORTE IS NULL";
        } else if (this.getRcbReporte() != null) {
            conditions += " AND RCB_REPORTE = ?";
            values.add(this.getRcbReporte());
        }

        if (this.getRcbTitulo1aColumna() != null && "null".equals(this.getRcbTitulo1aColumna())) {
            conditions += " AND RCB_TITULO_1A_COLUMNA IS NULL";
        } else if (this.getRcbTitulo1aColumna() != null) {
            conditions += " AND RCB_TITULO_1A_COLUMNA = ?";
            values.add(this.getRcbTitulo1aColumna());
        }

        if (this.getRcbTitular() != null && "null".equals(this.getRcbTitular())) {
            conditions += " AND RCB_TITULAR IS NULL";
        } else if (this.getRcbTitular() != null) {
            conditions += " AND RCB_TITULAR = ?";
            values.add(this.getRcbTitular());
        }

        if (this.getRcbBanco() != null && "null".equals(this.getRcbBanco())) {
            conditions += " AND RCB_BANCO IS NULL";
        } else if (this.getRcbBanco() != null) {
            conditions += " AND RCB_BANCO = ?";
            values.add(this.getRcbBanco());
        }

        if (this.getRcbClabe() != null && "null".equals(this.getRcbClabe())) {
            conditions += " AND RCB_CLABE IS NULL";
        } else if (this.getRcbClabe() != null) {
            conditions += " AND RCB_CLABE = ?";
            values.add(this.getRcbClabe());
        }

        if (this.getRcbTituloUltColumna() != null && "null".equals(this.getRcbTituloUltColumna())) {
            conditions += " AND RCB_TITULO_ULT_COLUMNA IS NULL";
        } else if (this.getRcbTituloUltColumna() != null) {
            conditions += " AND RCB_TITULO_ULT_COLUMNA = ?";
            values.add(this.getRcbTituloUltColumna());
        }

        if (this.getRcbVal1aColumna() != null && "null".equals(this.getRcbVal1aColumna())) {
            conditions += " AND RCB_VAL_1A_COLUMNA IS NULL";
        } else if (this.getRcbVal1aColumna() != null) {
            conditions += " AND RCB_VAL_1A_COLUMNA = ?";
            values.add(this.getRcbVal1aColumna());
        }

        if (this.getRcbValUltColumna() != null && "null".equals(this.getRcbValUltColumna())) {
            conditions += " AND RCB_VAL_ULT_COLUMNA IS NULL";
        } else if (this.getRcbValUltColumna() != null) {
            conditions += " AND RCB_VAL_ULT_COLUMNA = ?";
            values.add(this.getRcbValUltColumna());
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
        String sql = "UPDATE REP_CTAS_CLABE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RCB_SECUENCIAL = ?";
        pkValues.add(this.getRcbSecuencial());
        fields += " RCB_REPORTE = ?, ";
        values.add(this.getRcbReporte());
        fields += " RCB_TITULO_1A_COLUMNA = ?, ";
        values.add(this.getRcbTitulo1aColumna());
        fields += " RCB_TITULAR = ?, ";
        values.add(this.getRcbTitular());
        fields += " RCB_BANCO = ?, ";
        values.add(this.getRcbBanco());
        fields += " RCB_CLABE = ?, ";
        values.add(this.getRcbClabe());
        fields += " RCB_TITULO_ULT_COLUMNA = ?, ";
        values.add(this.getRcbTituloUltColumna());
        fields += " RCB_VAL_1A_COLUMNA = ?, ";
        values.add(this.getRcbVal1aColumna());
        fields += " RCB_VAL_ULT_COLUMNA = ?, ";
        values.add(this.getRcbValUltColumna());
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
        String sql = "INSERT INTO REP_CTAS_CLABE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RCB_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getRcbSecuencial());

        fields += ", RCB_REPORTE";
        fieldValues += ", ?";
        values.add(this.getRcbReporte());

        fields += ", RCB_TITULO_1A_COLUMNA";
        fieldValues += ", ?";
        values.add(this.getRcbTitulo1aColumna());

        fields += ", RCB_TITULAR";
        fieldValues += ", ?";
        values.add(this.getRcbTitular());

        fields += ", RCB_BANCO";
        fieldValues += ", ?";
        values.add(this.getRcbBanco());

        fields += ", RCB_CLABE";
        fieldValues += ", ?";
        values.add(this.getRcbClabe());

        fields += ", RCB_TITULO_ULT_COLUMNA";
        fieldValues += ", ?";
        values.add(this.getRcbTituloUltColumna());

        fields += ", RCB_VAL_1A_COLUMNA";
        fieldValues += ", ?";
        values.add(this.getRcbVal1aColumna());

        fields += ", RCB_VAL_ULT_COLUMNA";
        fieldValues += ", ?";
        values.add(this.getRcbValUltColumna());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REP_CTAS_CLABE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RCB_SECUENCIAL = ?";
        values.add(this.getRcbSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        RepCtasClabe instance = (RepCtasClabe) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRcbSecuencial().equals(instance.getRcbSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getRcbReporte().equals(instance.getRcbReporte()))
            equalObjects = false;
        if (equalObjects && !this.getRcbTitulo1aColumna().equals(instance.getRcbTitulo1aColumna()))
            equalObjects = false;
        if (equalObjects && !this.getRcbTitular().equals(instance.getRcbTitular()))
            equalObjects = false;
        if (equalObjects && !this.getRcbBanco().equals(instance.getRcbBanco()))
            equalObjects = false;
        if (equalObjects && !this.getRcbClabe().equals(instance.getRcbClabe()))
            equalObjects = false;
        if (equalObjects && !this.getRcbTituloUltColumna().equals(instance.getRcbTituloUltColumna()))
            equalObjects = false;
        if (equalObjects && !this.getRcbVal1aColumna().equals(instance.getRcbVal1aColumna()))
            equalObjects = false;
        if (equalObjects && !this.getRcbValUltColumna().equals(instance.getRcbValUltColumna()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        RepCtasClabe result = new RepCtasClabe();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRcbSecuencial((BigDecimal) objectData.getData("RCB_SECUENCIAL"));
        result.setRcbReporte((String) objectData.getData("RCB_REPORTE"));
        result.setRcbTitulo1aColumna((String) objectData.getData("RCB_TITULO_1A_COLUMNA"));
        result.setRcbTitular((String) objectData.getData("RCB_TITULAR"));
        result.setRcbBanco((String) objectData.getData("RCB_BANCO"));
        result.setRcbClabe((String) objectData.getData("RCB_CLABE"));
        result.setRcbTituloUltColumna((String) objectData.getData("RCB_TITULO_ULT_COLUMNA"));
        result.setRcbVal1aColumna((String) objectData.getData("RCB_VAL_1A_COLUMNA"));
        result.setRcbValUltColumna((String) objectData.getData("RCB_VAL_ULT_COLUMNA"));

        return result;

    }

}
