package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_SESION_COTE_PK", columns = { "FFID_ID_FIDEICOMISO", "FSCE_ID_SESION_COM_TEC" }, sequences = { "MANUAL" })
public class FSesionCote extends DomainObject {

    BigDecimal fsceIdSesionComTec = null;
    String fsceFechaSesion = null;
    String fsceTipo = null;
    String fsceTema = null;
    BigDecimal ffidIdFideicomiso = null;

    public FSesionCote() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFsceIdSesionComTec(BigDecimal fsceIdSesionComTec) {
        this.fsceIdSesionComTec = fsceIdSesionComTec;
    }

    public BigDecimal getFsceIdSesionComTec() {
        return this.fsceIdSesionComTec;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFsceFechaSesion(String fsceFechaSesion) {
        this.fsceFechaSesion = fsceFechaSesion;
    }

    public String getFsceFechaSesion() {
        return this.fsceFechaSesion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFsceTipo(String fsceTipo) {
        this.fsceTipo = fsceTipo;
    }

    public String getFsceTipo() {
        return this.fsceTipo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setFsceTema(String fsceTema) {
        this.fsceTema = fsceTema;
    }

    public String getFsceTema() {
        return this.fsceTema;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFfidIdFideicomiso(BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return this.ffidIdFideicomiso;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_SESION_COTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsceIdSesionComTec() != null && this.getFsceIdSesionComTec().longValue() == -999) {
            conditions += " AND FSCE_ID_SESION_COM_TEC IS NULL";
        } else if (this.getFsceIdSesionComTec() != null) {
            conditions += " AND FSCE_ID_SESION_COM_TEC = ?";
            values.add(this.getFsceIdSesionComTec());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
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
        String sql = "SELECT * FROM F_SESION_COTE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFsceIdSesionComTec() != null && this.getFsceIdSesionComTec().longValue() == -999) {
            conditions += " AND FSCE_ID_SESION_COM_TEC IS NULL";
        } else if (this.getFsceIdSesionComTec() != null) {
            conditions += " AND FSCE_ID_SESION_COM_TEC = ?";
            values.add(this.getFsceIdSesionComTec());
        }

        if (this.getFsceFechaSesion() != null && "null".equals(this.getFsceFechaSesion())) {
            conditions += " AND FSCE_FECHA_SESION IS NULL";
        } else if (this.getFsceFechaSesion() != null) {
            conditions += " AND FSCE_FECHA_SESION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFsceFechaSesion());
        }

        if (this.getFsceTipo() != null && "null".equals(this.getFsceTipo())) {
            conditions += " AND FSCE_TIPO IS NULL";
        } else if (this.getFsceTipo() != null) {
            conditions += " AND FSCE_TIPO = ?";
            values.add(this.getFsceTipo());
        }

        if (this.getFsceTema() != null && "null".equals(this.getFsceTema())) {
            conditions += " AND FSCE_TEMA IS NULL";
        } else if (this.getFsceTema() != null) {
            conditions += " AND FSCE_TEMA = ?";
            values.add(this.getFsceTema());
        }

        if (this.getFfidIdFideicomiso() != null && this.getFfidIdFideicomiso().longValue() == -999) {
            conditions += " AND FFID_ID_FIDEICOMISO IS NULL";
        } else if (this.getFfidIdFideicomiso() != null) {
            conditions += " AND FFID_ID_FIDEICOMISO = ?";
            values.add(this.getFfidIdFideicomiso());
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
        String sql = "UPDATE F_SESION_COTE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FSCE_ID_SESION_COM_TEC = ?";
        pkValues.add(this.getFsceIdSesionComTec());
        fields += " FSCE_FECHA_SESION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFsceFechaSesion());
        fields += " FSCE_TIPO = ?, ";
        values.add(this.getFsceTipo());
        fields += " FSCE_TEMA = ?, ";
        values.add(this.getFsceTema());
        conditions += " AND FFID_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFfidIdFideicomiso());
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
        String sql = "INSERT INTO F_SESION_COTE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FSCE_ID_SESION_COM_TEC";
        fieldValues += ", ?";
        values.add(this.getFsceIdSesionComTec());

        fields += ", FSCE_FECHA_SESION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFsceFechaSesion());

        fields += ", FSCE_TIPO";
        fieldValues += ", ?";
        values.add(this.getFsceTipo());

        fields += ", FSCE_TEMA";
        fieldValues += ", ?";
        values.add(this.getFsceTema());

        fields += ", FFID_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getFfidIdFideicomiso());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_SESION_COTE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FSCE_ID_SESION_COM_TEC = ?";
        values.add(this.getFsceIdSesionComTec());
        conditions += " AND FFID_ID_FIDEICOMISO = ?";
        values.add(this.getFfidIdFideicomiso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FSesionCote instance = (FSesionCote) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFsceIdSesionComTec().equals(instance.getFsceIdSesionComTec()))
            equalObjects = false;
        if (equalObjects && !this.getFsceFechaSesion().equals(instance.getFsceFechaSesion()))
            equalObjects = false;
        if (equalObjects && !this.getFsceTipo().equals(instance.getFsceTipo()))
            equalObjects = false;
        if (equalObjects && !this.getFsceTema().equals(instance.getFsceTema()))
            equalObjects = false;
        if (equalObjects && !this.getFfidIdFideicomiso().equals(instance.getFfidIdFideicomiso()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FSesionCote result = new FSesionCote();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFsceIdSesionComTec((BigDecimal) objectData.getData("FSCE_ID_SESION_COM_TEC"));
        result.setFsceFechaSesion((String) objectData.getData("FSCE_FECHA_SESION"));
        result.setFsceTipo((String) objectData.getData("FSCE_TIPO"));
        result.setFsceTema((String) objectData.getData("FSCE_TEMA"));
        result.setFfidIdFideicomiso((BigDecimal) objectData.getData("FFID_ID_FIDEICOMISO"));

        return result;

    }

}
