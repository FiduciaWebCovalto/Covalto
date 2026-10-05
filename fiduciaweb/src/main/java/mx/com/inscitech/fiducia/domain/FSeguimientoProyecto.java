package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_SEGUIMIENTO_PROYECTO_PK", columns = { "FSP_NUM_PROSPECTO", "FSP_SEGUIMIENTO" }, sequences = { "MANUAL" })
public class FSeguimientoProyecto extends DomainObject {

    BigDecimal fspNumProspecto = null;
    String fspFecha = null;
    BigDecimal fspNumUsuario = null;
    String fspSeguimiento = null;

    public FSeguimientoProyecto() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFspNumProspecto(BigDecimal fspNumProspecto) {
        this.fspNumProspecto = fspNumProspecto;
    }

    public BigDecimal getFspNumProspecto() {
        return this.fspNumProspecto;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setFspFecha(String fspFecha) {
        this.fspFecha = fspFecha;
    }

    public String getFspFecha() {
        return this.fspFecha;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setFspNumUsuario(BigDecimal fspNumUsuario) {
        this.fspNumUsuario = fspNumUsuario;
    }

    public BigDecimal getFspNumUsuario() {
        return this.fspNumUsuario;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setFspSeguimiento(String fspSeguimiento) {
        this.fspSeguimiento = fspSeguimiento;
    }

    public String getFspSeguimiento() {
        return this.fspSeguimiento;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_SEGUIMIENTO_PROYECTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFspNumProspecto() != null && this.getFspNumProspecto().longValue() == -999) {
            conditions += " AND FSP_NUM_PROSPECTO IS NULL";
        } else if (this.getFspNumProspecto() != null) {
            conditions += " AND FSP_NUM_PROSPECTO = ?";
            values.add(this.getFspNumProspecto());
        }

        if (this.getFspSeguimiento() != null && "null".equals(this.getFspSeguimiento())) {
            conditions += " AND FSP_SEGUIMIENTO IS NULL";
        } else if (this.getFspSeguimiento() != null) {
            conditions += " AND FSP_SEGUIMIENTO = ?";
            values.add(this.getFspSeguimiento());
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
        String sql = "SELECT * FROM F_SEGUIMIENTO_PROYECTO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getFspNumProspecto() != null && this.getFspNumProspecto().longValue() == -999) {
            conditions += " AND FSP_NUM_PROSPECTO IS NULL";
        } else if (this.getFspNumProspecto() != null) {
            conditions += " AND FSP_NUM_PROSPECTO = ?";
            values.add(this.getFspNumProspecto());
        }

        if (this.getFspFecha() != null && "null".equals(this.getFspFecha())) {
            conditions += " AND FSP_FECHA IS NULL";
        } else if (this.getFspFecha() != null) {
            conditions += " AND FSP_FECHA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getFspFecha());
        }

        if (this.getFspNumUsuario() != null && this.getFspNumUsuario().longValue() == -999) {
            conditions += " AND FSP_NUM_USUARIO IS NULL";
        } else if (this.getFspNumUsuario() != null) {
            conditions += " AND FSP_NUM_USUARIO = ?";
            values.add(this.getFspNumUsuario());
        }

        if (this.getFspSeguimiento() != null && "null".equals(this.getFspSeguimiento())) {
            conditions += " AND FSP_SEGUIMIENTO IS NULL";
        } else if (this.getFspSeguimiento() != null) {
            conditions += " AND FSP_SEGUIMIENTO = ?";
            values.add(this.getFspSeguimiento());
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
        String sql = "UPDATE F_SEGUIMIENTO_PROYECTO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND FSP_NUM_PROSPECTO = ?";
        pkValues.add(this.getFspNumProspecto());
        fields += " FSP_FECHA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getFspFecha());
        fields += " FSP_NUM_USUARIO = ?, ";
        values.add(this.getFspNumUsuario());
        conditions += " AND FSP_SEGUIMIENTO = ?";
        pkValues.add(this.getFspSeguimiento());
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
        String sql = "INSERT INTO F_SEGUIMIENTO_PROYECTO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", FSP_NUM_PROSPECTO";
        fieldValues += ", ?";
        values.add(this.getFspNumProspecto());

        fields += ", FSP_FECHA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getFspFecha());

        fields += ", FSP_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getFspNumUsuario());

        fields += ", FSP_SEGUIMIENTO";
        fieldValues += ", ?";
        values.add(this.getFspSeguimiento());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_SEGUIMIENTO_PROYECTO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND FSP_NUM_PROSPECTO = ?";
        values.add(this.getFspNumProspecto());
        conditions += " AND FSP_SEGUIMIENTO = ?";
        values.add(this.getFspSeguimiento());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FSeguimientoProyecto instance = (FSeguimientoProyecto) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFspNumProspecto().equals(instance.getFspNumProspecto()))
            equalObjects = false;
        if (equalObjects && !this.getFspFecha().equals(instance.getFspFecha()))
            equalObjects = false;
        if (equalObjects && !this.getFspNumUsuario().equals(instance.getFspNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getFspSeguimiento().equals(instance.getFspSeguimiento()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FSeguimientoProyecto result = new FSeguimientoProyecto();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setFspNumProspecto((BigDecimal) objectData.getData("FSP_NUM_PROSPECTO"));
        result.setFspFecha((String) objectData.getData("FSP_FECHA"));
        result.setFspNumUsuario((BigDecimal) objectData.getData("FSP_NUM_USUARIO"));
        result.setFspSeguimiento((String) objectData.getData("FSP_SEGUIMIENTO"));

        return result;

    }

}
