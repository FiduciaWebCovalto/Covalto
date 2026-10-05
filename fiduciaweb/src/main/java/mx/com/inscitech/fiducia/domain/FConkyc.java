package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_CONKYC_PK", columns = { "CONP_ID_PERSONA", "CONP_ID_CONCEPTO", "CONP_ID_SCONCEPTO", "CONP_ID_SSCONCEPTO" }, sequences = { "MANUAL" })
public class FConkyc extends DomainObject {

    String conpIdPersona = null;
    BigDecimal conpIdConcepto = null;
    BigDecimal conpIdSconcepto = null;
    BigDecimal conpIdSsconcepto = null;
    String conpNombre = null;
    String conpComentario = null;
    BigDecimal conpRenovar = null;
    String conpPeriodicidad = null;
    BigDecimal conpObligatorio = null;
    String conpTipoDato = null;
    BigDecimal conpBase = null;
    BigDecimal conpClave = null;
    String conpTabla = null;
    String conpEnviar = null;
    BigDecimal conpSecuencia = null;
    String conpEstatus = null;

    public FConkyc() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setConpIdPersona(String conpIdPersona) {
        this.conpIdPersona = conpIdPersona;
    }

    public String getConpIdPersona() {
        return this.conpIdPersona;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConpIdConcepto(BigDecimal conpIdConcepto) {
        this.conpIdConcepto = conpIdConcepto;
    }

    public BigDecimal getConpIdConcepto() {
        return this.conpIdConcepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConpIdSconcepto(BigDecimal conpIdSconcepto) {
        this.conpIdSconcepto = conpIdSconcepto;
    }

    public BigDecimal getConpIdSconcepto() {
        return this.conpIdSconcepto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConpIdSsconcepto(BigDecimal conpIdSsconcepto) {
        this.conpIdSsconcepto = conpIdSsconcepto;
    }

    public BigDecimal getConpIdSsconcepto() {
        return this.conpIdSsconcepto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConpNombre(String conpNombre) {
        this.conpNombre = conpNombre;
    }

    public String getConpNombre() {
        return this.conpNombre;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConpComentario(String conpComentario) {
        this.conpComentario = conpComentario;
    }

    public String getConpComentario() {
        return this.conpComentario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConpRenovar(BigDecimal conpRenovar) {
        this.conpRenovar = conpRenovar;
    }

    public BigDecimal getConpRenovar() {
        return this.conpRenovar;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConpPeriodicidad(String conpPeriodicidad) {
        this.conpPeriodicidad = conpPeriodicidad;
    }

    public String getConpPeriodicidad() {
        return this.conpPeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConpObligatorio(BigDecimal conpObligatorio) {
        this.conpObligatorio = conpObligatorio;
    }

    public BigDecimal getConpObligatorio() {
        return this.conpObligatorio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConpTipoDato(String conpTipoDato) {
        this.conpTipoDato = conpTipoDato;
    }

    public String getConpTipoDato() {
        return this.conpTipoDato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConpBase(BigDecimal conpBase) {
        this.conpBase = conpBase;
    }

    public BigDecimal getConpBase() {
        return this.conpBase;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConpClave(BigDecimal conpClave) {
        this.conpClave = conpClave;
    }

    public BigDecimal getConpClave() {
        return this.conpClave;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConpTabla(String conpTabla) {
        this.conpTabla = conpTabla;
    }

    public String getConpTabla() {
        return this.conpTabla;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConpEnviar(String conpEnviar) {
        this.conpEnviar = conpEnviar;
    }

    public String getConpEnviar() {
        return this.conpEnviar;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setConpSecuencia(BigDecimal conpSecuencia) {
        this.conpSecuencia = conpSecuencia;
    }

    public BigDecimal getConpSecuencia() {
        return this.conpSecuencia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setConpEstatus(String conpEstatus) {
        this.conpEstatus = conpEstatus;
    }

    public String getConpEstatus() {
        return this.conpEstatus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_CONKYC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getConpIdPersona() != null && "null".equals(this.getConpIdPersona())) {
            conditions += " AND CONP_ID_PERSONA IS NULL";
        } else if (this.getConpIdPersona() != null) {
            conditions += " AND CONP_ID_PERSONA = ?";
            values.add(this.getConpIdPersona());
        }

        if (this.getConpIdConcepto() != null && this.getConpIdConcepto().longValue() == -999) {
            conditions += " AND CONP_ID_CONCEPTO IS NULL";
        } else if (this.getConpIdConcepto() != null) {
            conditions += " AND CONP_ID_CONCEPTO = ?";
            values.add(this.getConpIdConcepto());
        }

        if (this.getConpIdSconcepto() != null && this.getConpIdSconcepto().longValue() == -999) {
            conditions += " AND CONP_ID_SCONCEPTO IS NULL";
        } else if (this.getConpIdSconcepto() != null) {
            conditions += " AND CONP_ID_SCONCEPTO = ?";
            values.add(this.getConpIdSconcepto());
        }

        if (this.getConpIdSsconcepto() != null && this.getConpIdSsconcepto().longValue() == -999) {
            conditions += " AND CONP_ID_SSCONCEPTO IS NULL";
        } else if (this.getConpIdSsconcepto() != null) {
            conditions += " AND CONP_ID_SSCONCEPTO = ?";
            values.add(this.getConpIdSsconcepto());
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
        String sql = "SELECT * FROM F_CONKYC ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getConpIdPersona() != null && "null".equals(this.getConpIdPersona())) {
            conditions += " AND CONP_ID_PERSONA IS NULL";
        } else if (this.getConpIdPersona() != null) {
            conditions += " AND CONP_ID_PERSONA = ?";
            values.add(this.getConpIdPersona());
        }

        if (this.getConpIdConcepto() != null && this.getConpIdConcepto().longValue() == -999) {
            conditions += " AND CONP_ID_CONCEPTO IS NULL";
        } else if (this.getConpIdConcepto() != null) {
            conditions += " AND CONP_ID_CONCEPTO = ?";
            values.add(this.getConpIdConcepto());
        }

        if (this.getConpIdSconcepto() != null && this.getConpIdSconcepto().longValue() == -999) {
            conditions += " AND CONP_ID_SCONCEPTO IS NULL";
        } else if (this.getConpIdSconcepto() != null) {
            conditions += " AND CONP_ID_SCONCEPTO = ?";
            values.add(this.getConpIdSconcepto());
        }

        if (this.getConpIdSsconcepto() != null && this.getConpIdSsconcepto().longValue() == -999) {
            conditions += " AND CONP_ID_SSCONCEPTO IS NULL";
        } else if (this.getConpIdSsconcepto() != null) {
            conditions += " AND CONP_ID_SSCONCEPTO = ?";
            values.add(this.getConpIdSsconcepto());
        }

        if (this.getConpNombre() != null && "null".equals(this.getConpNombre())) {
            conditions += " AND CONP_NOMBRE IS NULL";
        } else if (this.getConpNombre() != null) {
            conditions += " AND CONP_NOMBRE = ?";
            values.add(this.getConpNombre());
        }

        if (this.getConpComentario() != null && "null".equals(this.getConpComentario())) {
            conditions += " AND CONP_COMENTARIO IS NULL";
        } else if (this.getConpComentario() != null) {
            conditions += " AND CONP_COMENTARIO = ?";
            values.add(this.getConpComentario());
        }

        if (this.getConpRenovar() != null && this.getConpRenovar().longValue() == -999) {
            conditions += " AND CONP_RENOVAR IS NULL";
        } else if (this.getConpRenovar() != null) {
            conditions += " AND CONP_RENOVAR = ?";
            values.add(this.getConpRenovar());
        }

        if (this.getConpPeriodicidad() != null && "null".equals(this.getConpPeriodicidad())) {
            conditions += " AND CONP_PERIODICIDAD IS NULL";
        } else if (this.getConpPeriodicidad() != null) {
            conditions += " AND CONP_PERIODICIDAD = ?";
            values.add(this.getConpPeriodicidad());
        }

        if (this.getConpObligatorio() != null && this.getConpObligatorio().longValue() == -999) {
            conditions += " AND CONP_OBLIGATORIO IS NULL";
        } else if (this.getConpObligatorio() != null) {
            conditions += " AND CONP_OBLIGATORIO = ?";
            values.add(this.getConpObligatorio());
        }

        if (this.getConpTipoDato() != null && "null".equals(this.getConpTipoDato())) {
            conditions += " AND CONP_TIPO_DATO IS NULL";
        } else if (this.getConpTipoDato() != null) {
            conditions += " AND CONP_TIPO_DATO = ?";
            values.add(this.getConpTipoDato());
        }

        if (this.getConpBase() != null && this.getConpBase().longValue() == -999) {
            conditions += " AND CONP_BASE IS NULL";
        } else if (this.getConpBase() != null) {
            conditions += " AND CONP_BASE = ?";
            values.add(this.getConpBase());
        }

        if (this.getConpClave() != null && this.getConpClave().longValue() == -999) {
            conditions += " AND CONP_CLAVE IS NULL";
        } else if (this.getConpClave() != null) {
            conditions += " AND CONP_CLAVE = ?";
            values.add(this.getConpClave());
        }

        if (this.getConpTabla() != null && "null".equals(this.getConpTabla())) {
            conditions += " AND CONP_TABLA IS NULL";
        } else if (this.getConpTabla() != null) {
            conditions += " AND CONP_TABLA = ?";
            values.add(this.getConpTabla());
        }

        if (this.getConpEnviar() != null && "null".equals(this.getConpEnviar())) {
            conditions += " AND CONP_ENVIAR IS NULL";
        } else if (this.getConpEnviar() != null) {
            conditions += " AND CONP_ENVIAR = ?";
            values.add(this.getConpEnviar());
        }

        if (this.getConpSecuencia() != null && this.getConpSecuencia().longValue() == -999) {
            conditions += " AND CONP_SECUENCIA IS NULL";
        } else if (this.getConpSecuencia() != null) {
            conditions += " AND CONP_SECUENCIA = ?";
            values.add(this.getConpSecuencia());
        }

        if (this.getConpEstatus() != null && "null".equals(this.getConpEstatus())) {
            conditions += " AND CONP_ESTATUS IS NULL";
        } else if (this.getConpEstatus() != null) {
            conditions += " AND CONP_ESTATUS = ?";
            values.add(this.getConpEstatus());
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
        String sql = "UPDATE F_CONKYC SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CONP_ID_PERSONA = ?";
        pkValues.add(this.getConpIdPersona());
        conditions += " AND CONP_ID_CONCEPTO = ?";
        pkValues.add(this.getConpIdConcepto());
        conditions += " AND CONP_ID_SCONCEPTO = ?";
        pkValues.add(this.getConpIdSconcepto());
        conditions += " AND CONP_ID_SSCONCEPTO = ?";
        pkValues.add(this.getConpIdSsconcepto());
        fields += " CONP_NOMBRE = ?, ";
        values.add(this.getConpNombre());
        fields += " CONP_COMENTARIO = ?, ";
        values.add(this.getConpComentario());
        fields += " CONP_RENOVAR = ?, ";
        values.add(this.getConpRenovar());
        fields += " CONP_PERIODICIDAD = ?, ";
        values.add(this.getConpPeriodicidad());
        fields += " CONP_OBLIGATORIO = ?, ";
        values.add(this.getConpObligatorio());
        fields += " CONP_TIPO_DATO = ?, ";
        values.add(this.getConpTipoDato());
        fields += " CONP_BASE = ?, ";
        values.add(this.getConpBase());
        fields += " CONP_CLAVE = ?, ";
        values.add(this.getConpClave());
        fields += " CONP_TABLA = ?, ";
        values.add(this.getConpTabla());
        fields += " CONP_ENVIAR = ?, ";
        values.add(this.getConpEnviar());
        fields += " CONP_SECUENCIA = ?, ";
        values.add(this.getConpSecuencia());
        fields += " CONP_ESTATUS = ?, ";
        values.add(this.getConpEstatus());
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
        String sql = "INSERT INTO F_CONKYC ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CONP_ID_PERSONA";
        fieldValues += ", ?";
        values.add(this.getConpIdPersona());

        fields += ", CONP_ID_CONCEPTO";
        fieldValues += ", ?";
        values.add(this.getConpIdConcepto());

        fields += ", CONP_ID_SCONCEPTO";
        fieldValues += ", ?";
        values.add(this.getConpIdSconcepto());

        fields += ", CONP_ID_SSCONCEPTO";
        fieldValues += ", ?";
        values.add(this.getConpIdSsconcepto());

        fields += ", CONP_NOMBRE";
        fieldValues += ", ?";
        values.add(this.getConpNombre());

        fields += ", CONP_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getConpComentario());

        fields += ", CONP_RENOVAR";
        fieldValues += ", ?";
        values.add(this.getConpRenovar());

        fields += ", CONP_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getConpPeriodicidad());

        fields += ", CONP_OBLIGATORIO";
        fieldValues += ", ?";
        values.add(this.getConpObligatorio());

        fields += ", CONP_TIPO_DATO";
        fieldValues += ", ?";
        values.add(this.getConpTipoDato());

        fields += ", CONP_BASE";
        fieldValues += ", ?";
        values.add(this.getConpBase());

        fields += ", CONP_CLAVE";
        fieldValues += ", ?";
        values.add(this.getConpClave());

        fields += ", CONP_TABLA";
        fieldValues += ", ?";
        values.add(this.getConpTabla());

        fields += ", CONP_ENVIAR";
        fieldValues += ", ?";
        values.add(this.getConpEnviar());

        fields += ", CONP_SECUENCIA";
        fieldValues += ", ?";
        values.add(this.getConpSecuencia());

        fields += ", CONP_ESTATUS";
        fieldValues += ", ?";
        values.add(this.getConpEstatus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_CONKYC WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CONP_ID_PERSONA = ?";
        values.add(this.getConpIdPersona());
        conditions += " AND CONP_ID_CONCEPTO = ?";
        values.add(this.getConpIdConcepto());
        conditions += " AND CONP_ID_SCONCEPTO = ?";
        values.add(this.getConpIdSconcepto());
        conditions += " AND CONP_ID_SSCONCEPTO = ?";
        values.add(this.getConpIdSsconcepto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FConkyc instance = (FConkyc) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getConpIdPersona().equals(instance.getConpIdPersona()))
            equalObjects = false;
        if (equalObjects && !this.getConpIdConcepto().equals(instance.getConpIdConcepto()))
            equalObjects = false;
        if (equalObjects && !this.getConpIdSconcepto().equals(instance.getConpIdSconcepto()))
            equalObjects = false;
        if (equalObjects && !this.getConpIdSsconcepto().equals(instance.getConpIdSsconcepto()))
            equalObjects = false;
        if (equalObjects && !this.getConpNombre().equals(instance.getConpNombre()))
            equalObjects = false;
        if (equalObjects && !this.getConpComentario().equals(instance.getConpComentario()))
            equalObjects = false;
        if (equalObjects && !this.getConpRenovar().equals(instance.getConpRenovar()))
            equalObjects = false;
        if (equalObjects && !this.getConpPeriodicidad().equals(instance.getConpPeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getConpObligatorio().equals(instance.getConpObligatorio()))
            equalObjects = false;
        if (equalObjects && !this.getConpTipoDato().equals(instance.getConpTipoDato()))
            equalObjects = false;
        if (equalObjects && !this.getConpBase().equals(instance.getConpBase()))
            equalObjects = false;
        if (equalObjects && !this.getConpClave().equals(instance.getConpClave()))
            equalObjects = false;
        if (equalObjects && !this.getConpTabla().equals(instance.getConpTabla()))
            equalObjects = false;
        if (equalObjects && !this.getConpEnviar().equals(instance.getConpEnviar()))
            equalObjects = false;
        if (equalObjects && !this.getConpSecuencia().equals(instance.getConpSecuencia()))
            equalObjects = false;
        if (equalObjects && !this.getConpEstatus().equals(instance.getConpEstatus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FConkyc result = new FConkyc();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setConpIdPersona((String) objectData.getData("CONP_ID_PERSONA"));
        result.setConpIdConcepto((BigDecimal) objectData.getData("CONP_ID_CONCEPTO"));
        result.setConpIdSconcepto((BigDecimal) objectData.getData("CONP_ID_SCONCEPTO"));
        result.setConpIdSsconcepto((BigDecimal) objectData.getData("CONP_ID_SSCONCEPTO"));
        result.setConpNombre((String) objectData.getData("CONP_NOMBRE"));
        result.setConpComentario((String) objectData.getData("CONP_COMENTARIO"));
        result.setConpRenovar((BigDecimal) objectData.getData("CONP_RENOVAR"));
        result.setConpPeriodicidad((String) objectData.getData("CONP_PERIODICIDAD"));
        result.setConpObligatorio((BigDecimal) objectData.getData("CONP_OBLIGATORIO"));
        result.setConpTipoDato((String) objectData.getData("CONP_TIPO_DATO"));
        result.setConpBase((BigDecimal) objectData.getData("CONP_BASE"));
        result.setConpClave((BigDecimal) objectData.getData("CONP_CLAVE"));
        result.setConpTabla((String) objectData.getData("CONP_TABLA"));
        result.setConpEnviar((String) objectData.getData("CONP_ENVIAR"));
        result.setConpSecuencia((BigDecimal) objectData.getData("CONP_SECUENCIA"));
        result.setConpEstatus((String) objectData.getData("CONP_ESTATUS"));

        return result;

    }

}
