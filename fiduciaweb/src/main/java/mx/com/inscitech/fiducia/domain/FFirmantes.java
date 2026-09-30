package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;

public class FFirmantes extends DomainObject {
    
    BigDecimal ffIdFideicomiso = null;
    BigDecimal ffNo = null;
    String frdsTipoCta = null;
    String ffNombre = null;
    String ffTitularidad = null;
    String ffTipoDeFirma = null;

    public FFirmantes() {
        super();
        this.pkColumns = 8;
    }

    public void setFfIdFideicomiso(BigDecimal ffIdFideicomiso) {
        this.ffIdFideicomiso = ffIdFideicomiso;
    }

    public void setFfNo(BigDecimal ffNo) {
        this.ffNo = ffNo;
    }

    public void setFrdsTipoCta(String frdsTipoCta) {
        this.frdsTipoCta = frdsTipoCta;
    }

    public void setFfNombre(String ffNombre) {
        this.ffNombre = ffNombre;
    }

    public void setFfTitularidad(String ffTitularidad) {
        this.ffTitularidad = ffTitularidad;
    }

    public void setFfTipoDeFirma(String ffTipoDeFirma) {
        this.ffTipoDeFirma = ffTipoDeFirma;
    }

    public BigDecimal getFfIdFideicomiso() {
        return this.ffIdFideicomiso;
    }

    public BigDecimal getFfNo() {
        return this.ffNo;
    }

    public String getFrdsTipoCta() {
        return this.frdsTipoCta;
    }

    public String getFfNombre() {
        return this.ffNombre;
    }

    public String getFfTitularidad() {
        return this.ffTitularidad;
    }

    public String getFfTipoDeFirma() {
        return this.ffTipoDeFirma;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_FIRMANTES ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getFfIdFideicomiso() != null && this.getFfIdFideicomiso().longValue() == -999) {
            conditions += " AND FF_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfIdFideicomiso() != null) {
            conditions += " AND FF_ID_FIDEICOMISO =?";
            values.add(this.getFfIdFideicomiso());
        }
        if (this.getFfNo() != null && this.getFfNo().longValue() == -999) {
            conditions += " AND FF_NO IS NULL";
        } else if (this.getFfNo() != null) {
            conditions += " AND FF_NO =?";
            values.add(this.getFfNo());
        }
        if (this.getFrdsTipoCta() != null && "null".equals(this.getFrdsTipoCta())) {
            conditions += " AND FRDS_TIPO_CTA IS NULL";
        } else if (this.getFrdsTipoCta() != null) {
            conditions += " AND FRDS_TIPO_CTA =?";
            values.add(this.getFrdsTipoCta());
        }
        if (this.getFfNombre() != null && "null".equals(this.getFfNombre())) {
            conditions += " AND FF_NOMBRE IS NULL";
        } else if (this.getFfNombre() != null) {
            conditions += " AND FF_NOMBRE =?";
            values.add(this.getFfNombre());
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
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_FIRMANTES ";
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

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE F_FIRMANTES SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        conditions += " AND FF_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFfIdFideicomiso());
        conditions += " AND FF_NO = ?";
        pkValues.add(this.getFfNo());
        conditions += " AND FRDS_TIPO_CTA = ?";
        pkValues.add(this.getFrdsTipoCta());
        conditions += " AND FF_NOMBRE = ?";
        pkValues.add(this.getFfNombre());
        fields += " FF_TITULARIDAD = ?, ";
        values.add(this.getFfTitularidad());
        fields += " FF_TIPO_DE_FIRMA = ?, ";
        values.add(this.getFfTipoDeFirma());
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
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO F_FIRMANTES ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FF_ID_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getFfIdFideicomiso());
        fields += ",FF_NO ";
        fieldValues += ", ?";
        values.add(this.getFfNo());
        fields += ",FRDS_TIPO_CTA ";
        fieldValues += ", ?";
        values.add(this.getFrdsTipoCta());
        fields += ",FF_NOMBRE ";
        fieldValues += ", ?";
        values.add(this.getFfNombre());
        fields += ",FF_TITULARIDAD ";
        fieldValues += ", ?";
        values.add(this.getFfTitularidad());
        fields += ",FF_TIPO_DE_FIRMA ";
        fieldValues += ", ?";
        values.add(this.getFfTipoDeFirma());
        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();
        sql += fields + " ) VALUES (" + fieldValues + ")";
        result.setSql(sql);
        result.setParameters(values.toArray());
        return result;
    }

    public DMLObject getDelete() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_FIRMANTES WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND FF_ID_FIDEICOMISO = ?";
        values.add(this.getFfIdFideicomiso());
        conditions += " AND FF_NO = ?";
        values.add(this.getFfNo());
        conditions += " AND FRDS_TIPO_CTA = ?";
        values.add(this.getFrdsTipoCta());
        conditions += " AND FF_NOMBRE = ?";
        values.add(this.getFfNombre());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FFirmantes instance = (FFirmantes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFfIdFideicomiso().equals(instance.getFfIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFfNo().equals(instance.getFfNo()))
            equalObjects = false;
        if (equalObjects && !this.getFrdsTipoCta().equals(instance.getFrdsTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getFfNombre().equals(instance.getFfNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFfTitularidad().equals(instance.getFfTitularidad()))
            equalObjects = false;
        if (equalObjects && !this.getFfTipoDeFirma().equals(instance.getFfTipoDeFirma()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FFirmantes result = new FFirmantes();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFfIdFideicomiso((BigDecimal) objectData.getData("FF_ID_FIDEICOMISO"));
        result.setFfNo((BigDecimal) objectData.getData("FF_NO"));
        result.setFrdsTipoCta((String) objectData.getData("FRDS_TIPO_CTA"));
        result.setFfNombre((String) objectData.getData("FF_NOMBRE"));
        result.setFfTitularidad((String) objectData.getData("FF_TITULARIDAD"));
        result.setFfTipoDeFirma((String) objectData.getData("FF_TIPO_DE_FIRMA"));
        return result;
    }
}
