package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CATFERA_PK", columns = { "EDFA_ID_PAIS", "EDFA_ID_MES", "EDFA_ID_DIA" }, sequences = { "MANUAL" })
public class FCatfera extends DomainObject {

    BigDecimal edfaIdPais = null;
    BigDecimal edfaIdMes = null;
    BigDecimal edfaIdDia = null;
    String edfaDescFecha = null;
    BigDecimal edfaTipoDia = null;
    String edfaRegla = null;
    BigDecimal edfaSemana = null;
    BigDecimal edfaDiaSemana = null;
    String edfaStDiasfera = null;

    public FCatfera() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEdfaIdPais(BigDecimal edfaIdPais) {
        this.edfaIdPais = edfaIdPais;
    }

    public BigDecimal getEdfaIdPais() {
        return this.edfaIdPais;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdfaIdMes(BigDecimal edfaIdMes) {
        this.edfaIdMes = edfaIdMes;
    }

    public BigDecimal getEdfaIdMes() {
        return this.edfaIdMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setEdfaIdDia(BigDecimal edfaIdDia) {
        this.edfaIdDia = edfaIdDia;
    }

    public BigDecimal getEdfaIdDia() {
        return this.edfaIdDia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdfaDescFecha(String edfaDescFecha) {
        this.edfaDescFecha = edfaDescFecha;
    }

    public String getEdfaDescFecha() {
        return this.edfaDescFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdfaTipoDia(BigDecimal edfaTipoDia) {
        this.edfaTipoDia = edfaTipoDia;
    }

    public BigDecimal getEdfaTipoDia() {
        return this.edfaTipoDia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdfaRegla(String edfaRegla) {
        this.edfaRegla = edfaRegla;
    }

    public String getEdfaRegla() {
        return this.edfaRegla;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdfaSemana(BigDecimal edfaSemana) {
        this.edfaSemana = edfaSemana;
    }

    public BigDecimal getEdfaSemana() {
        return this.edfaSemana;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEdfaDiaSemana(BigDecimal edfaDiaSemana) {
        this.edfaDiaSemana = edfaDiaSemana;
    }

    public BigDecimal getEdfaDiaSemana() {
        return this.edfaDiaSemana;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEdfaStDiasfera(String edfaStDiasfera) {
        this.edfaStDiasfera = edfaStDiasfera;
    }

    public String getEdfaStDiasfera() {
        return this.edfaStDiasfera;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CATFERA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdfaIdPais() != null && this.getEdfaIdPais().longValue() == -999) {
            conditions += " AND EDFA_ID_PAIS IS NULL";
        } else if (this.getEdfaIdPais() != null) {
            conditions += " AND EDFA_ID_PAIS = ?";
            values.add(this.getEdfaIdPais());
        }

        if (this.getEdfaIdMes() != null && this.getEdfaIdMes().longValue() == -999) {
            conditions += " AND EDFA_ID_MES IS NULL";
        } else if (this.getEdfaIdMes() != null) {
            conditions += " AND EDFA_ID_MES = ?";
            values.add(this.getEdfaIdMes());
        }

        if (this.getEdfaIdDia() != null && this.getEdfaIdDia().longValue() == -999) {
            conditions += " AND EDFA_ID_DIA IS NULL";
        } else if (this.getEdfaIdDia() != null) {
            conditions += " AND EDFA_ID_DIA = ?";
            values.add(this.getEdfaIdDia());
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
        String sql = "SELECT * FROM F_CATFERA ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEdfaIdPais() != null && this.getEdfaIdPais().longValue() == -999) {
            conditions += " AND EDFA_ID_PAIS IS NULL";
        } else if (this.getEdfaIdPais() != null) {
            conditions += " AND EDFA_ID_PAIS = ?";
            values.add(this.getEdfaIdPais());
        }

        if (this.getEdfaIdMes() != null && this.getEdfaIdMes().longValue() == -999) {
            conditions += " AND EDFA_ID_MES IS NULL";
        } else if (this.getEdfaIdMes() != null) {
            conditions += " AND EDFA_ID_MES = ?";
            values.add(this.getEdfaIdMes());
        }

        if (this.getEdfaIdDia() != null && this.getEdfaIdDia().longValue() == -999) {
            conditions += " AND EDFA_ID_DIA IS NULL";
        } else if (this.getEdfaIdDia() != null) {
            conditions += " AND EDFA_ID_DIA = ?";
            values.add(this.getEdfaIdDia());
        }

        if (this.getEdfaDescFecha() != null && "null".equals(this.getEdfaDescFecha())) {
            conditions += " AND EDFA_DESC_FECHA IS NULL";
        } else if (this.getEdfaDescFecha() != null) {
            conditions += " AND EDFA_DESC_FECHA = ?";
            values.add(this.getEdfaDescFecha());
        }

        if (this.getEdfaTipoDia() != null && this.getEdfaTipoDia().longValue() == -999) {
            conditions += " AND EDFA_TIPO_DIA IS NULL";
        } else if (this.getEdfaTipoDia() != null) {
            conditions += " AND EDFA_TIPO_DIA = ?";
            values.add(this.getEdfaTipoDia());
        }

        if (this.getEdfaRegla() != null && "null".equals(this.getEdfaRegla())) {
            conditions += " AND EDFA_REGLA IS NULL";
        } else if (this.getEdfaRegla() != null) {
            conditions += " AND EDFA_REGLA = ?";
            values.add(this.getEdfaRegla());
        }

        if (this.getEdfaSemana() != null && this.getEdfaSemana().longValue() == -999) {
            conditions += " AND EDFA_SEMANA IS NULL";
        } else if (this.getEdfaSemana() != null) {
            conditions += " AND EDFA_SEMANA = ?";
            values.add(this.getEdfaSemana());
        }

        if (this.getEdfaDiaSemana() != null && this.getEdfaDiaSemana().longValue() == -999) {
            conditions += " AND EDFA_DIA_SEMANA IS NULL";
        } else if (this.getEdfaDiaSemana() != null) {
            conditions += " AND EDFA_DIA_SEMANA = ?";
            values.add(this.getEdfaDiaSemana());
        }

        if (this.getEdfaStDiasfera() != null && "null".equals(this.getEdfaStDiasfera())) {
            conditions += " AND EDFA_ST_DIASFERA IS NULL";
        } else if (this.getEdfaStDiasfera() != null) {
            conditions += " AND EDFA_ST_DIASFERA = ?";
            values.add(this.getEdfaStDiasfera());
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
        String sql = "UPDATE F_CATFERA SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EDFA_ID_PAIS = ?";
        pkValues.add(this.getEdfaIdPais());
        conditions += " AND EDFA_ID_MES = ?";
        pkValues.add(this.getEdfaIdMes());
        conditions += " AND EDFA_ID_DIA = ?";
        pkValues.add(this.getEdfaIdDia());
        fields += " EDFA_DESC_FECHA = ?, ";
        values.add(this.getEdfaDescFecha());
        fields += " EDFA_TIPO_DIA = ?, ";
        values.add(this.getEdfaTipoDia());
        fields += " EDFA_REGLA = ?, ";
        values.add(this.getEdfaRegla());
        fields += " EDFA_SEMANA = ?, ";
        values.add(this.getEdfaSemana());
        fields += " EDFA_DIA_SEMANA = ?, ";
        values.add(this.getEdfaDiaSemana());
        fields += " EDFA_ST_DIASFERA = ?, ";
        values.add(this.getEdfaStDiasfera());
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
        String sql = "INSERT INTO F_CATFERA ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EDFA_ID_PAIS";
        fieldValues += ", ?";
        values.add(this.getEdfaIdPais());

        fields += ", EDFA_ID_MES";
        fieldValues += ", ?";
        values.add(this.getEdfaIdMes());

        fields += ", EDFA_ID_DIA";
        fieldValues += ", ?";
        values.add(this.getEdfaIdDia());

        fields += ", EDFA_DESC_FECHA";
        fieldValues += ", ?";
        values.add(this.getEdfaDescFecha());

        fields += ", EDFA_TIPO_DIA";
        fieldValues += ", ?";
        values.add(this.getEdfaTipoDia());

        fields += ", EDFA_REGLA";
        fieldValues += ", ?";
        values.add(this.getEdfaRegla());

        fields += ", EDFA_SEMANA";
        fieldValues += ", ?";
        values.add(this.getEdfaSemana());

        fields += ", EDFA_DIA_SEMANA";
        fieldValues += ", ?";
        values.add(this.getEdfaDiaSemana());

        fields += ", EDFA_ST_DIASFERA";
        fieldValues += ", ?";
        values.add(this.getEdfaStDiasfera());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CATFERA WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EDFA_ID_PAIS = ?";
        values.add(this.getEdfaIdPais());
        conditions += " AND EDFA_ID_MES = ?";
        values.add(this.getEdfaIdMes());
        conditions += " AND EDFA_ID_DIA = ?";
        values.add(this.getEdfaIdDia());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FCatfera instance = (FCatfera) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEdfaIdPais().equals(instance.getEdfaIdPais()))
            equalObjects = false;
        if (equalObjects && !this.getEdfaIdMes().equals(instance.getEdfaIdMes()))
            equalObjects = false;
        if (equalObjects && !this.getEdfaIdDia().equals(instance.getEdfaIdDia()))
            equalObjects = false;
        if (equalObjects && !this.getEdfaDescFecha().equals(instance.getEdfaDescFecha()))
            equalObjects = false;
        if (equalObjects && !this.getEdfaTipoDia().equals(instance.getEdfaTipoDia()))
            equalObjects = false;
        if (equalObjects && !this.getEdfaRegla().equals(instance.getEdfaRegla()))
            equalObjects = false;
        if (equalObjects && !this.getEdfaSemana().equals(instance.getEdfaSemana()))
            equalObjects = false;
        if (equalObjects && !this.getEdfaDiaSemana().equals(instance.getEdfaDiaSemana()))
            equalObjects = false;
        if (equalObjects && !this.getEdfaStDiasfera().equals(instance.getEdfaStDiasfera()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FCatfera result = new FCatfera();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEdfaIdPais((BigDecimal) objectData.getData("EDFA_ID_PAIS"));
        result.setEdfaIdMes((BigDecimal) objectData.getData("EDFA_ID_MES"));
        result.setEdfaIdDia((BigDecimal) objectData.getData("EDFA_ID_DIA"));
        result.setEdfaDescFecha((String) objectData.getData("EDFA_DESC_FECHA"));
        result.setEdfaTipoDia((BigDecimal) objectData.getData("EDFA_TIPO_DIA"));
        result.setEdfaRegla((String) objectData.getData("EDFA_REGLA"));
        result.setEdfaSemana((BigDecimal) objectData.getData("EDFA_SEMANA"));
        result.setEdfaDiaSemana((BigDecimal) objectData.getData("EDFA_DIA_SEMANA"));
        result.setEdfaStDiasfera((String) objectData.getData("EDFA_ST_DIASFERA"));

        return result;

    }

}
