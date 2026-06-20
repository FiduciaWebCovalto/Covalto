package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;

public class FEjecutivosDeContacto extends DomainObject {
    
    BigDecimal fedcIdFideicomiso = null;
    BigDecimal fedcNo = null;
    String frdsTipoCta = null;
    String fedcNombre = null;
    String fedcEMail = null;
    String fedcDomicilio = null;
    BigDecimal fedcTelefono1 = null;
    BigDecimal fedcExt = null;
    BigDecimal fedcTelefono2 = null;
    BigDecimal fedcExt2 = null;
    BigDecimal fedcTelefonoCelular = null;
    String fedcObservaciones = null;

    public FEjecutivosDeContacto() {
        super();
        this.pkColumns = 8;
    }

    public void setFedcIdFideicomiso(BigDecimal fedcIdFideicomiso) {
        this.fedcIdFideicomiso = fedcIdFideicomiso;
    }

    public void setFedcNo(BigDecimal fedcNo) {
        this.fedcNo = fedcNo;
    }

    public void setFrdsTipoCta(String frdsTipoCta) {
        this.frdsTipoCta = frdsTipoCta;
    }

    public void setFedcNombre(String fedcNombre) {
        this.fedcNombre = fedcNombre;
    }

    public void setFedcEMail(String fedcEMail) {
        this.fedcEMail = fedcEMail;
    }

    public void setFedcDomicilio(String fedcDomicilio) {
        this.fedcDomicilio = fedcDomicilio;
    }

    public void setFedcTelefono1(BigDecimal fedcTelefono1) {
        this.fedcTelefono1 = fedcTelefono1;
    }

    public void setFedcExt(BigDecimal fedcExt) {
        this.fedcExt = fedcExt;
    }

    public void setFedcTelefono2(BigDecimal fedcTelefono2) {
        this.fedcTelefono2 = fedcTelefono2;
    }

    public void setFedcExt2(BigDecimal fedcExt2) {
        this.fedcExt2 = fedcExt2;
    }

    public void setFedcTelefonoCelular(BigDecimal fedcTelefonoCelular) {
        this.fedcTelefonoCelular = fedcTelefonoCelular;
    }

    public void setFedcObservaciones(String fedcObservaciones) {
        this.fedcObservaciones = fedcObservaciones;
    }

    public BigDecimal getFedcIdFideicomiso() {
        return this.fedcIdFideicomiso;
    }

    public BigDecimal getFedcNo() {
        return this.fedcNo;
    }

    public String getFrdsTipoCta() {
        return this.frdsTipoCta;
    }

    public String getFedcNombre() {
        return this.fedcNombre;
    }

    public String getFedcEMail() {
        return this.fedcEMail;
    }

    public String getFedcDomicilio() {
        return this.fedcDomicilio;
    }

    public BigDecimal getFedcTelefono1() {
        return this.fedcTelefono1;
    }

    public BigDecimal getFedcExt() {
        return this.fedcExt;
    }

    public BigDecimal getFedcTelefono2() {
        return this.fedcTelefono2;
    }

    public BigDecimal getFedcExt2() {
        return this.fedcExt2;
    }

    public BigDecimal getFedcTelefonoCelular() {
        return this.fedcTelefonoCelular;
    }

    public String getFedcObservaciones() {
        return this.fedcObservaciones;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EJECUTIVOS_DE_CONTACTO ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getFedcIdFideicomiso() != null && this.getFedcIdFideicomiso().longValue() == -999) {
            conditions += " AND FEDC_ID_FIDEICOMISO IS NULL";
        } else if (this.getFedcIdFideicomiso() != null) {
            conditions += " AND FEDC_ID_FIDEICOMISO =?";
            values.add(this.getFedcIdFideicomiso());
        }
        if (this.getFedcNo() != null && this.getFedcNo().longValue() == -999) {
            conditions += " AND FEDC_NO IS NULL";
        } else if (this.getFedcNo() != null) {
            conditions += " AND FEDC_NO =?";
            values.add(this.getFedcNo());
        }
        if (this.getFrdsTipoCta() != null && "null".equals(this.getFrdsTipoCta())) {
            conditions += " AND FRDS_TIPO_CTA IS NULL";
        } else if (this.getFrdsTipoCta() != null) {
            conditions += " AND FRDS_TIPO_CTA =?";
            values.add(this.getFrdsTipoCta());
        }
        if (this.getFedcNombre() != null && "null".equals(this.getFedcNombre())) {
            conditions += " AND FEDC_NOMBRE IS NULL";
        } else if (this.getFedcNombre() != null) {
            conditions += " AND FEDC_NOMBRE =?";
            values.add(this.getFedcNombre());
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
        String sql = "SELECT * FROM F_EJECUTIVOS_DE_CONTACTO ";
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
        String sql = "UPDATE F_EJECUTIVOS_DE_CONTACTO SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        conditions += " AND FEDC_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFedcIdFideicomiso());
        conditions += " AND FEDC_NO = ?";
        pkValues.add(this.getFedcNo());
        conditions += " AND FRDS_TIPO_CTA = ?";
        pkValues.add(this.getFrdsTipoCta());
        conditions += " AND FEDC_NOMBRE = ?";
        pkValues.add(this.getFedcNombre());
        fields += " FEDC_E_MAIL = ?, ";
        values.add(this.getFedcEMail());
        fields += " FEDC_DOMICILIO = ?, ";
        values.add(this.getFedcDomicilio());
        fields += " FEDC_TELEFONO_1 = ?, ";
        values.add(this.getFedcTelefono1());
        fields += " FEDC_EXT = ?, ";
        values.add(this.getFedcExt());
        fields += " FEDC_TELEFONO_2 = ?, ";
        values.add(this.getFedcTelefono2());
        fields += " FEDC_EXT_2 = ?, ";
        values.add(this.getFedcExt2());
        fields += " FEDC_TELEFONO_CELULAR = ?, ";
        values.add(this.getFedcTelefonoCelular());
        fields += " FEDC_OBSERVACIONES = ?, ";
        values.add(this.getFedcObservaciones());
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
        String sql = "INSERT INTO F_EJECUTIVOS_DE_CONTACTO ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FEDC_ID_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getFedcIdFideicomiso());
        fields += ",FEDC_NO ";
        fieldValues += ", ?";
        values.add(this.getFedcNo());
        fields += ",FRDS_TIPO_CTA ";
        fieldValues += ", ?";
        values.add(this.getFrdsTipoCta());
        fields += ",FEDC_NOMBRE ";
        fieldValues += ", ?";
        values.add(this.getFedcNombre());
        fields += ",FEDC_E_MAIL ";
        fieldValues += ", ?";
        values.add(this.getFedcEMail());
        fields += ",FEDC_DOMICILIO ";
        fieldValues += ", ?";
        values.add(this.getFedcDomicilio());
        fields += ",FEDC_TELEFONO_1 ";
        fieldValues += ", ?";
        values.add(this.getFedcTelefono1());
        fields += ",FEDC_EXT ";
        fieldValues += ", ?";
        values.add(this.getFedcExt());
        fields += ",FEDC_TELEFONO_2 ";
        fieldValues += ", ?";
        values.add(this.getFedcTelefono2());
        fields += ",FEDC_EXT_2 ";
        fieldValues += ", ?";
        values.add(this.getFedcExt2());
        fields += ",FEDC_TELEFONO_CELULAR ";
        fieldValues += ", ?";
        values.add(this.getFedcTelefonoCelular());
        fields += ",FEDC_OBSERVACIONES ";
        fieldValues += ", ?";
        values.add(this.getFedcObservaciones());
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
        String sql = "DELETE FROM F_EJECUTIVOS_DE_CONTACTO WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND FEDC_ID_FIDEICOMISO = ?";
        values.add(this.getFedcIdFideicomiso());
        conditions += " AND FEDC_NO = ?";
        values.add(this.getFedcNo());
        conditions += " AND FRDS_TIPO_CTA = ?";
        values.add(this.getFrdsTipoCta());
        conditions += " AND FEDC_NOMBRE = ?";
        values.add(this.getFedcNombre());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEjecutivosDeContacto instance = (FEjecutivosDeContacto) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFedcIdFideicomiso().equals(instance.getFedcIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFedcNo().equals(instance.getFedcNo()))
            equalObjects = false;
        if (equalObjects && !this.getFrdsTipoCta().equals(instance.getFrdsTipoCta()))
            equalObjects = false;
        if (equalObjects && !this.getFedcNombre().equals(instance.getFedcNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFedcEMail().equals(instance.getFedcEMail()))
            equalObjects = false;
        if (equalObjects && !this.getFedcDomicilio().equals(instance.getFedcDomicilio()))
            equalObjects = false;
        if (equalObjects && !this.getFedcTelefono1().equals(instance.getFedcTelefono1()))
            equalObjects = false;
        if (equalObjects && !this.getFedcExt().equals(instance.getFedcExt()))
            equalObjects = false;
        if (equalObjects && !this.getFedcTelefono2().equals(instance.getFedcTelefono2()))
            equalObjects = false;
        if (equalObjects && !this.getFedcExt2().equals(instance.getFedcExt2()))
            equalObjects = false;
        if (equalObjects && !this.getFedcTelefonoCelular().equals(instance.getFedcTelefonoCelular()))
            equalObjects = false;
        if (equalObjects && !this.getFedcObservaciones().equals(instance.getFedcObservaciones()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEjecutivosDeContacto result = new FEjecutivosDeContacto();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFedcIdFideicomiso((BigDecimal) objectData.getData("FEDC_ID_FIDEICOMISO"));
        result.setFedcNo((BigDecimal) objectData.getData("FEDC_NO"));
        result.setFrdsTipoCta((String) objectData.getData("FRDS_TIPO_CTA"));
        result.setFedcNombre((String) objectData.getData("FEDC_NOMBRE"));
        result.setFedcEMail((String) objectData.getData("FEDC_E_MAIL"));
        result.setFedcDomicilio((String) objectData.getData("FEDC_DOMICILIO"));
        result.setFedcTelefono1((BigDecimal) objectData.getData("FEDC_TELEFONO_1"));
        result.setFedcExt((BigDecimal) objectData.getData("FEDC_EXT"));
        result.setFedcTelefono2((BigDecimal) objectData.getData("FEDC_TELEFONO_2"));
        result.setFedcExt2((BigDecimal) objectData.getData("FEDC_EXT_2"));
        result.setFedcTelefonoCelular((BigDecimal) objectData.getData("FEDC_TELEFONO_CELULAR"));
        result.setFedcObservaciones((String) objectData.getData("FEDC_OBSERVACIONES"));
        return result;
    }
}
