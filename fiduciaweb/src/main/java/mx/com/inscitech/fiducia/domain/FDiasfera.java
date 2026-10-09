package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_DIASFERA_PK", columns = { "EDIA_ID_PAIS", "EDIA_ID_ANO", "EDIA_ID_MES", "EDIA_ID_DIA" }, sequences = { "MANUAL" })
public class FDiasfera extends DomainObject {

    BigDecimal ediaIdPais = null;
    BigDecimal ediaIdAno = null;
    BigDecimal ediaIdMes = null;
    BigDecimal ediaIdDia = null;
    String ediaDescFecha = null;
    String ediaStDiasfera = null;

    public FDiasfera() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdiaIdPais(BigDecimal ediaIdPais) {
        this.ediaIdPais = ediaIdPais;
    }

    public BigDecimal getEdiaIdPais() {
        return this.ediaIdPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdiaIdAno(BigDecimal ediaIdAno) {
        this.ediaIdAno = ediaIdAno;
    }

    public BigDecimal getEdiaIdAno() {
        return this.ediaIdAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiaIdMes(BigDecimal ediaIdMes) {
        this.ediaIdMes = ediaIdMes;
    }

    public BigDecimal getEdiaIdMes() {
        return this.ediaIdMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdiaIdDia(BigDecimal ediaIdDia) {
        this.ediaIdDia = ediaIdDia;
    }

    public BigDecimal getEdiaIdDia() {
        return this.ediaIdDia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdiaDescFecha(String ediaDescFecha) {
        this.ediaDescFecha = ediaDescFecha;
    }

    public String getEdiaDescFecha() {
        return this.ediaDescFecha;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdiaStDiasfera(String ediaStDiasfera) {
        this.ediaStDiasfera = ediaStDiasfera;
    }

    public String getEdiaStDiasfera() {
        return this.ediaStDiasfera;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_DIASFERA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdiaIdPais() != null && this.getEdiaIdPais().longValue() == -999) {
            conditions += " AND EDIA_ID_PAIS IS NULL";
        } else if (this.getEdiaIdPais() != null) {
            conditions += " AND EDIA_ID_PAIS = ?";
            values.add(this.getEdiaIdPais());
        }

        if (this.getEdiaIdAno() != null && this.getEdiaIdAno().longValue() == -999) {
            conditions += " AND EDIA_ID_ANO IS NULL";
        } else if (this.getEdiaIdAno() != null) {
            conditions += " AND EDIA_ID_ANO = ?";
            values.add(this.getEdiaIdAno());
        }

        if (this.getEdiaIdMes() != null && this.getEdiaIdMes().longValue() == -999) {
            conditions += " AND EDIA_ID_MES IS NULL";
        } else if (this.getEdiaIdMes() != null) {
            conditions += " AND EDIA_ID_MES = ?";
            values.add(this.getEdiaIdMes());
        }

        if (this.getEdiaIdDia() != null && this.getEdiaIdDia().longValue() == -999) {
            conditions += " AND EDIA_ID_DIA IS NULL";
        } else if (this.getEdiaIdDia() != null) {
            conditions += " AND EDIA_ID_DIA = ?";
            values.add(this.getEdiaIdDia());
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
        String sql = "SELECT * FROM F_DIASFERA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdiaIdPais() != null && this.getEdiaIdPais().longValue() == -999) {
            conditions += " AND EDIA_ID_PAIS IS NULL";
        } else if (this.getEdiaIdPais() != null) {
            conditions += " AND EDIA_ID_PAIS = ?";
            values.add(this.getEdiaIdPais());
        }

        if (this.getEdiaIdAno() != null && this.getEdiaIdAno().longValue() == -999) {
            conditions += " AND EDIA_ID_ANO IS NULL";
        } else if (this.getEdiaIdAno() != null) {
            conditions += " AND EDIA_ID_ANO = ?";
            values.add(this.getEdiaIdAno());
        }

        if (this.getEdiaIdMes() != null && this.getEdiaIdMes().longValue() == -999) {
            conditions += " AND EDIA_ID_MES IS NULL";
        } else if (this.getEdiaIdMes() != null) {
            conditions += " AND EDIA_ID_MES = ?";
            values.add(this.getEdiaIdMes());
        }

        if (this.getEdiaIdDia() != null && this.getEdiaIdDia().longValue() == -999) {
            conditions += " AND EDIA_ID_DIA IS NULL";
        } else if (this.getEdiaIdDia() != null) {
            conditions += " AND EDIA_ID_DIA = ?";
            values.add(this.getEdiaIdDia());
        }

        if (this.getEdiaDescFecha() != null && "null".equals(this.getEdiaDescFecha())) {
            conditions += " AND EDIA_DESC_FECHA IS NULL";
        } else if (this.getEdiaDescFecha() != null) {
            conditions += " AND EDIA_DESC_FECHA = ?";
            values.add(this.getEdiaDescFecha());
        }

        if (this.getEdiaStDiasfera() != null && "null".equals(this.getEdiaStDiasfera())) {
            conditions += " AND EDIA_ST_DIASFERA IS NULL";
        } else if (this.getEdiaStDiasfera() != null) {
            conditions += " AND EDIA_ST_DIASFERA = ?";
            values.add(this.getEdiaStDiasfera());
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
        String sql = "UPDATE F_DIASFERA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EDIA_ID_PAIS = ?";
        pkValues.add(this.getEdiaIdPais());
        conditions += " AND EDIA_ID_ANO = ?";
        pkValues.add(this.getEdiaIdAno());
        conditions += " AND EDIA_ID_MES = ?";
        pkValues.add(this.getEdiaIdMes());
        conditions += " AND EDIA_ID_DIA = ?";
        pkValues.add(this.getEdiaIdDia());
        fields += " EDIA_DESC_FECHA = ?, ";
        values.add(this.getEdiaDescFecha());
        fields += " EDIA_ST_DIASFERA = ?, ";
        values.add(this.getEdiaStDiasfera());
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
        String sql = "INSERT INTO F_DIASFERA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EDIA_ID_PAIS";
        fieldValues += ", ?";
        values.add(this.getEdiaIdPais());

        fields += ", EDIA_ID_ANO";
        fieldValues += ", ?";
        values.add(this.getEdiaIdAno());

        fields += ", EDIA_ID_MES";
        fieldValues += ", ?";
        values.add(this.getEdiaIdMes());

        fields += ", EDIA_ID_DIA";
        fieldValues += ", ?";
        values.add(this.getEdiaIdDia());

        fields += ", EDIA_DESC_FECHA";
        fieldValues += ", ?";
        values.add(this.getEdiaDescFecha());

        fields += ", EDIA_ST_DIASFERA";
        fieldValues += ", ?";
        values.add(this.getEdiaStDiasfera());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_DIASFERA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EDIA_ID_PAIS = ?";
        values.add(this.getEdiaIdPais());
        conditions += " AND EDIA_ID_ANO = ?";
        values.add(this.getEdiaIdAno());
        conditions += " AND EDIA_ID_MES = ?";
        values.add(this.getEdiaIdMes());
        conditions += " AND EDIA_ID_DIA = ?";
        values.add(this.getEdiaIdDia());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FDiasfera instance = (FDiasfera) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEdiaIdPais().equals(instance.getEdiaIdPais()))
            equalObjects = false;
        if (equalObjects && !this.getEdiaIdAno().equals(instance.getEdiaIdAno()))
            equalObjects = false;
        if (equalObjects && !this.getEdiaIdMes().equals(instance.getEdiaIdMes()))
            equalObjects = false;
        if (equalObjects && !this.getEdiaIdDia().equals(instance.getEdiaIdDia()))
            equalObjects = false;
        if (equalObjects && !this.getEdiaDescFecha().equals(instance.getEdiaDescFecha()))
            equalObjects = false;
        if (equalObjects && !this.getEdiaStDiasfera().equals(instance.getEdiaStDiasfera()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FDiasfera result = new FDiasfera();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEdiaIdPais((BigDecimal) objectData.getData("EDIA_ID_PAIS"));
        result.setEdiaIdAno((BigDecimal) objectData.getData("EDIA_ID_ANO"));
        result.setEdiaIdMes((BigDecimal) objectData.getData("EDIA_ID_MES"));
        result.setEdiaIdDia((BigDecimal) objectData.getData("EDIA_ID_DIA"));
        result.setEdiaDescFecha((String) objectData.getData("EDIA_DESC_FECHA"));
        result.setEdiaStDiasfera((String) objectData.getData("EDIA_ST_DIASFERA"));

        return result;

    }

}
