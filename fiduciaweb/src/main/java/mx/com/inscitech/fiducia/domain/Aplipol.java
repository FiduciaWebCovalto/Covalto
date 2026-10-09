package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "APLIPOL_PK", columns = { "APO_ANO", "APO_MES", "APO_DIA", "APO_TIPO_POLIZA" }, sequences = { "MANUAL" })
public class Aplipol extends DomainObject {

    BigDecimal apoAno = null;
    BigDecimal apoMes = null;
    BigDecimal apoDia = null;
    String apoTipoPoliza = null;

    public Aplipol() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setApoAno(BigDecimal apoAno) {
        this.apoAno = apoAno;
    }

    public BigDecimal getApoAno() {
        return this.apoAno;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApoMes(BigDecimal apoMes) {
        this.apoMes = apoMes;
    }

    public BigDecimal getApoMes() {
        return this.apoMes;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setApoDia(BigDecimal apoDia) {
        this.apoDia = apoDia;
    }

    public BigDecimal getApoDia() {
        return this.apoDia;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setApoTipoPoliza(String apoTipoPoliza) {
        this.apoTipoPoliza = apoTipoPoliza;
    }

    public String getApoTipoPoliza() {
        return this.apoTipoPoliza;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM APLIPOL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApoAno() != null && this.getApoAno().longValue() == -999) {
            conditions += " AND APO_ANO IS NULL";
        } else if (this.getApoAno() != null) {
            conditions += " AND APO_ANO = ?";
            values.add(this.getApoAno());
        }

        if (this.getApoMes() != null && this.getApoMes().longValue() == -999) {
            conditions += " AND APO_MES IS NULL";
        } else if (this.getApoMes() != null) {
            conditions += " AND APO_MES = ?";
            values.add(this.getApoMes());
        }

        if (this.getApoDia() != null && this.getApoDia().longValue() == -999) {
            conditions += " AND APO_DIA IS NULL";
        } else if (this.getApoDia() != null) {
            conditions += " AND APO_DIA = ?";
            values.add(this.getApoDia());
        }

        if (this.getApoTipoPoliza() != null && "null".equals(this.getApoTipoPoliza())) {
            conditions += " AND APO_TIPO_POLIZA IS NULL";
        } else if (this.getApoTipoPoliza() != null) {
            conditions += " AND APO_TIPO_POLIZA = ?";
            values.add(this.getApoTipoPoliza());
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
        String sql = "SELECT * FROM APLIPOL ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getApoAno() != null && this.getApoAno().longValue() == -999) {
            conditions += " AND APO_ANO IS NULL";
        } else if (this.getApoAno() != null) {
            conditions += " AND APO_ANO = ?";
            values.add(this.getApoAno());
        }

        if (this.getApoMes() != null && this.getApoMes().longValue() == -999) {
            conditions += " AND APO_MES IS NULL";
        } else if (this.getApoMes() != null) {
            conditions += " AND APO_MES = ?";
            values.add(this.getApoMes());
        }

        if (this.getApoDia() != null && this.getApoDia().longValue() == -999) {
            conditions += " AND APO_DIA IS NULL";
        } else if (this.getApoDia() != null) {
            conditions += " AND APO_DIA = ?";
            values.add(this.getApoDia());
        }

        if (this.getApoTipoPoliza() != null && "null".equals(this.getApoTipoPoliza())) {
            conditions += " AND APO_TIPO_POLIZA IS NULL";
        } else if (this.getApoTipoPoliza() != null) {
            conditions += " AND APO_TIPO_POLIZA = ?";
            values.add(this.getApoTipoPoliza());
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
        String sql = "UPDATE APLIPOL SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND APO_ANO = ?";
        pkValues.add(this.getApoAno());
        conditions += " AND APO_MES = ?";
        pkValues.add(this.getApoMes());
        conditions += " AND APO_DIA = ?";
        pkValues.add(this.getApoDia());
        conditions += " AND APO_TIPO_POLIZA = ?";
        pkValues.add(this.getApoTipoPoliza());
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
        String sql = "INSERT INTO APLIPOL ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", APO_ANO";
        fieldValues += ", ?";
        values.add(this.getApoAno());

        fields += ", APO_MES";
        fieldValues += ", ?";
        values.add(this.getApoMes());

        fields += ", APO_DIA";
        fieldValues += ", ?";
        values.add(this.getApoDia());

        fields += ", APO_TIPO_POLIZA";
        fieldValues += ", ?";
        values.add(this.getApoTipoPoliza());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM APLIPOL WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND APO_ANO = ?";
        values.add(this.getApoAno());
        conditions += " AND APO_MES = ?";
        values.add(this.getApoMes());
        conditions += " AND APO_DIA = ?";
        values.add(this.getApoDia());
        conditions += " AND APO_TIPO_POLIZA = ?";
        values.add(this.getApoTipoPoliza());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Aplipol instance = (Aplipol) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getApoAno().equals(instance.getApoAno()))
            equalObjects = false;
        if (equalObjects && !this.getApoMes().equals(instance.getApoMes()))
            equalObjects = false;
        if (equalObjects && !this.getApoDia().equals(instance.getApoDia()))
            equalObjects = false;
        if (equalObjects && !this.getApoTipoPoliza().equals(instance.getApoTipoPoliza()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Aplipol result = new Aplipol();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setApoAno((BigDecimal) objectData.getData("APO_ANO"));
        result.setApoMes((BigDecimal) objectData.getData("APO_MES"));
        result.setApoDia((BigDecimal) objectData.getData("APO_DIA"));
        result.setApoTipoPoliza((String) objectData.getData("APO_TIPO_POLIZA"));

        return result;

    }

}
