package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;

public class FRelacionDeServicios extends DomainObject {
    
    BigDecimal frdsIdFidei = null;
    BigDecimal frdsNo = null;
    String frdsTipoCta = null;
    String frdsServicio = null;
    String frdsContratoafiliacion = null;
    String frdsDetalle = null;

    public FRelacionDeServicios() {
        super();
        this.pkColumns = 8;
    }

    public void setFrdsIdFidei(BigDecimal frdsIdFidei) {
        this.frdsIdFidei = frdsIdFidei;
    }

    public void setFrdsNo(BigDecimal frdsNo) {
        this.frdsNo = frdsNo;
    }

    public void setFrdsTipoCta(String frdsTipoCta) {
        this.frdsTipoCta = frdsTipoCta;
    }

    public void setFrdsServicio(String frdsServicio) {
        this.frdsServicio = frdsServicio;
    }

    public void setFrdsContratoafiliacion(String frdsContratoafiliacion) {
        this.frdsContratoafiliacion = frdsContratoafiliacion;
    }

    public void setFrdsDetalle(String frdsDetalle) {
        this.frdsDetalle = frdsDetalle;
    }

    public BigDecimal getFrdsIdFidei() {
        return this.frdsIdFidei;
    }

    public BigDecimal getFrdsNo() {
        return this.frdsNo;
    }

    public String getFrdsTipoCta() {
        return this.frdsTipoCta;
    }

    public String getFrdsServicio() {
        return this.frdsServicio;
    }

    public String getFrdsContratoafiliacion() {
        return this.frdsContratoafiliacion;
    }

    public String getFrdsDetalle() {
        return this.frdsDetalle;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_RELACION_DE_SERVICIOS ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getFrdsIdFidei() != null && this.getFrdsIdFidei().longValue() == -999) {
            conditions += " AND FRDS_ID_FIDEI IS NULL";
        } else if (this.getFrdsIdFidei() != null) {
            conditions += " AND FRDS_ID_FIDEI =?";
            values.add(this.getFrdsIdFidei());
        }
        if (this.getFrdsNo() != null && this.getFrdsNo().longValue() == -999) {
            conditions += " AND FRDS_NO IS NULL";
        } else if (this.getFrdsNo() != null) {
            conditions += " AND FRDS_NO =?";
            values.add(this.getFrdsNo());
        }
        if (this.getFrdsTipoCta() != null && "null".equals(this.getFrdsTipoCta())) {
            conditions += " AND FRDS_TIPO_CTA IS NULL";
        } else if (this.getFrdsTipoCta() != null) {
            conditions += " AND FRDS_TIPO_CTA =?";
            values.add(this.getFrdsTipoCta());
        }
        if (this.getFrdsServicio() != null && "null".equals(this.getFrdsServicio())) {
            conditions += " AND FRDS_SERVICIO IS NULL";
        } else if (this.getFrdsServicio() != null) {
            conditions += " AND FRDS_SERVICIO =?";
            values.add(this.getFrdsServicio());
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
        String sql = "SELECT * FROM F_RELACION_DE_SERVICIOS ";
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
        String sql = "UPDATE F_RELACION_DE_SERVICIOS SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        conditions += " AND FRDS_ID_FIDEI = ?";
        pkValues.add(this.getFrdsIdFidei());
        conditions += " AND FRDS_NO = ?";
        pkValues.add(this.getFrdsNo());
        conditions += " AND FRDS_TIPO_CTA = ?";
        pkValues.add(this.getFrdsTipoCta());
        conditions += " AND FRDS_SERVICIO = ?";
        pkValues.add(this.getFrdsServicio());
        fields += " FRDS_CONTRATOAFILIACION = ?, ";
        values.add(this.getFrdsContratoafiliacion());
        fields += " FRDS_DETALLE = ?, ";
        values.add(this.getFrdsDetalle());
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
        String sql = "INSERT INTO F_RELACION_DE_SERVICIOS ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FRDS_ID_FIDEI ";
        fieldValues += ", ?";
        values.add(this.getFrdsIdFidei());
        fields += ",FRDS_NO ";
        fieldValues += ", ?";
        values.add(this.getFrdsNo());
        fields += ",FRDS_TIPO_CTA ";
        fieldValues += ", ?";
        values.add(this.getFrdsTipoCta());
        fields += ",FRDS_SERVICIO ";
        fieldValues += ", ?";
        values.add(this.getFrdsServicio());
        fields += ",FRDS_CONTRATOAFILIACION ";
        fieldValues += ", ?";
        values.add(this.getFrdsContratoafiliacion());
        fields += ",FRDS_DETALLE ";
        fieldValues += ", ?";
        values.add(this.getFrdsDetalle());
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
        String sql = "DELETE FROM F_RELACION_DE_SERVICIOS WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND FRDS_ID_FIDEI = ?";
        values.add(this.getFrdsIdFidei());
        conditions += " AND FRDS_NO = ?";
        values.add(this.getFrdsNo());
        conditions += " AND FRDS_TIPO_CTA = ?";
        values.add(this.getFrdsTipoCta());
        conditions += " AND FRDS_SERVICIO = ?";
        values.add(this.getFrdsServicio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FRelacionDeServicios instance = (FRelacionDeServicios) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFrdsIdFidei().equals(instance.getFrdsIdFidei()))
            equalObjects = false;
        if (equalObjects && !this.getFrdsNo().equals(instance.getFrdsNo()))
            equalObjects = false;
        if (equalObjects && !this.getFrdsTipoCta().equals(instance.getFrdsTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getFrdsServicio().equals(instance.getFrdsServicio()))
            equalObjects = false;
        if (equalObjects && !this.getFrdsContratoafiliacion().equals(instance.getFrdsContratoafiliacion()))
            equalObjects = false;
        if (equalObjects && !this.getFrdsDetalle().equals(instance.getFrdsDetalle()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FRelacionDeServicios result = new FRelacionDeServicios();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFrdsIdFidei((BigDecimal) objectData.getData("FRDS_ID_FIDEI"));
        result.setFrdsNo((BigDecimal) objectData.getData("FRDS_NO"));
        result.setFrdsTipoCta((String) objectData.getData("FRDS_TIPO_CTA"));
        result.setFrdsServicio((String) objectData.getData("FRDS_SERVICIO"));
        result.setFrdsContratoafiliacion((String) objectData.getData("FRDS_CONTRATOAFILIACION"));
        result.setFrdsDetalle((String) objectData.getData("FRDS_DETALLE"));
        return result;
    }
}
