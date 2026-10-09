package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMIPERIO_PK", columns = { "EPER_ID_PROGRAMA", "EPER_ID_FIDEICOMISO", "EPER_ID_EMISION", "EPER_ID_SECUENCIAL" }, sequences = { "MANUAL" })
public class FEmiperio extends DomainObject {

    BigDecimal eperIdPrograma = null;
    BigDecimal eperIdFideicomiso = null;
    BigDecimal eperIdEmision = null;
    BigDecimal eperIdSecuencial = null;
    String eperFecInicio = null;
    String eperFecVencimiento = null;
    String eperPeriodicidad = null;
    String eperComentario = null;
    String eperStFEmiperio = null;

    public FEmiperio() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEperIdPrograma(BigDecimal eperIdPrograma) {
        this.eperIdPrograma = eperIdPrograma;
    }

    public BigDecimal getEperIdPrograma() {
        return this.eperIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEperIdFideicomiso(BigDecimal eperIdFideicomiso) {
        this.eperIdFideicomiso = eperIdFideicomiso;
    }

    public BigDecimal getEperIdFideicomiso() {
        return this.eperIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEperIdEmision(BigDecimal eperIdEmision) {
        this.eperIdEmision = eperIdEmision;
    }

    public BigDecimal getEperIdEmision() {
        return this.eperIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEperIdSecuencial(BigDecimal eperIdSecuencial) {
        this.eperIdSecuencial = eperIdSecuencial;
    }

    public BigDecimal getEperIdSecuencial() {
        return this.eperIdSecuencial;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEperFecInicio(String eperFecInicio) {
        this.eperFecInicio = eperFecInicio;
    }

    public String getEperFecInicio() {
        return this.eperFecInicio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEperFecVencimiento(String eperFecVencimiento) {
        this.eperFecVencimiento = eperFecVencimiento;
    }

    public String getEperFecVencimiento() {
        return this.eperFecVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEperPeriodicidad(String eperPeriodicidad) {
        this.eperPeriodicidad = eperPeriodicidad;
    }

    public String getEperPeriodicidad() {
        return this.eperPeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEperComentario(String eperComentario) {
        this.eperComentario = eperComentario;
    }

    public String getEperComentario() {
        return this.eperComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEperStFEmiperio(String eperStFEmiperio) {
        this.eperStFEmiperio = eperStFEmiperio;
    }

    public String getEperStFEmiperio() {
        return this.eperStFEmiperio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMIPERIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEperIdPrograma() != null && this.getEperIdPrograma().longValue() == -999) {
            conditions += " AND EPER_ID_PROGRAMA IS NULL";
        } else if (this.getEperIdPrograma() != null) {
            conditions += " AND EPER_ID_PROGRAMA = ?";
            values.add(this.getEperIdPrograma());
        }

        if (this.getEperIdFideicomiso() != null && this.getEperIdFideicomiso().longValue() == -999) {
            conditions += " AND EPER_ID_FIDEICOMISO IS NULL";
        } else if (this.getEperIdFideicomiso() != null) {
            conditions += " AND EPER_ID_FIDEICOMISO = ?";
            values.add(this.getEperIdFideicomiso());
        }

        if (this.getEperIdEmision() != null && this.getEperIdEmision().longValue() == -999) {
            conditions += " AND EPER_ID_EMISION IS NULL";
        } else if (this.getEperIdEmision() != null) {
            conditions += " AND EPER_ID_EMISION = ?";
            values.add(this.getEperIdEmision());
        }

        if (this.getEperIdSecuencial() != null && this.getEperIdSecuencial().longValue() == -999) {
            conditions += " AND EPER_ID_SECUENCIAL IS NULL";
        } else if (this.getEperIdSecuencial() != null) {
            conditions += " AND EPER_ID_SECUENCIAL = ?";
            values.add(this.getEperIdSecuencial());
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
        String sql = "SELECT * FROM F_EMIPERIO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEperIdPrograma() != null && this.getEperIdPrograma().longValue() == -999) {
            conditions += " AND EPER_ID_PROGRAMA IS NULL";
        } else if (this.getEperIdPrograma() != null) {
            conditions += " AND EPER_ID_PROGRAMA = ?";
            values.add(this.getEperIdPrograma());
        }

        if (this.getEperIdFideicomiso() != null && this.getEperIdFideicomiso().longValue() == -999) {
            conditions += " AND EPER_ID_FIDEICOMISO IS NULL";
        } else if (this.getEperIdFideicomiso() != null) {
            conditions += " AND EPER_ID_FIDEICOMISO = ?";
            values.add(this.getEperIdFideicomiso());
        }

        if (this.getEperIdEmision() != null && this.getEperIdEmision().longValue() == -999) {
            conditions += " AND EPER_ID_EMISION IS NULL";
        } else if (this.getEperIdEmision() != null) {
            conditions += " AND EPER_ID_EMISION = ?";
            values.add(this.getEperIdEmision());
        }

        if (this.getEperIdSecuencial() != null && this.getEperIdSecuencial().longValue() == -999) {
            conditions += " AND EPER_ID_SECUENCIAL IS NULL";
        } else if (this.getEperIdSecuencial() != null) {
            conditions += " AND EPER_ID_SECUENCIAL = ?";
            values.add(this.getEperIdSecuencial());
        }

        if (this.getEperFecInicio() != null && "null".equals(this.getEperFecInicio())) {
            conditions += " AND EPER_FEC_INICIO IS NULL";
        } else if (this.getEperFecInicio() != null) {
            conditions += " AND EPER_FEC_INICIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEperFecInicio());
        }

        if (this.getEperFecVencimiento() != null && "null".equals(this.getEperFecVencimiento())) {
            conditions += " AND EPER_FEC_VENCIMIENTO IS NULL";
        } else if (this.getEperFecVencimiento() != null) {
            conditions += " AND EPER_FEC_VENCIMIENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEperFecVencimiento());
        }

        if (this.getEperPeriodicidad() != null && "null".equals(this.getEperPeriodicidad())) {
            conditions += " AND EPER_PERIODICIDAD IS NULL";
        } else if (this.getEperPeriodicidad() != null) {
            conditions += " AND EPER_PERIODICIDAD = ?";
            values.add(this.getEperPeriodicidad());
        }

        if (this.getEperComentario() != null && "null".equals(this.getEperComentario())) {
            conditions += " AND EPER_COMENTARIO IS NULL";
        } else if (this.getEperComentario() != null) {
            conditions += " AND EPER_COMENTARIO = ?";
            values.add(this.getEperComentario());
        }

        if (this.getEperStFEmiperio() != null && "null".equals(this.getEperStFEmiperio())) {
            conditions += " AND EPER_ST_F_EMIPERIO IS NULL";
        } else if (this.getEperStFEmiperio() != null) {
            conditions += " AND EPER_ST_F_EMIPERIO = ?";
            values.add(this.getEperStFEmiperio());
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
        String sql = "UPDATE F_EMIPERIO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EPER_ID_PROGRAMA = ?";
        pkValues.add(this.getEperIdPrograma());
        conditions += " AND EPER_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEperIdFideicomiso());
        conditions += " AND EPER_ID_EMISION = ?";
        pkValues.add(this.getEperIdEmision());
        conditions += " AND EPER_ID_SECUENCIAL = ?";
        pkValues.add(this.getEperIdSecuencial());
        fields += " EPER_FEC_INICIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEperFecInicio());
        fields += " EPER_FEC_VENCIMIENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEperFecVencimiento());
        fields += " EPER_PERIODICIDAD = ?, ";
        values.add(this.getEperPeriodicidad());
        fields += " EPER_COMENTARIO = ?, ";
        values.add(this.getEperComentario());
        fields += " EPER_ST_F_EMIPERIO = ?, ";
        values.add(this.getEperStFEmiperio());
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
        String sql = "INSERT INTO F_EMIPERIO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EPER_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEperIdPrograma());

        fields += ", EPER_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEperIdFideicomiso());

        fields += ", EPER_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEperIdEmision());

        fields += ", EPER_ID_SECUENCIAL";
        fieldValues += ", ?";
        values.add(this.getEperIdSecuencial());

        fields += ", EPER_FEC_INICIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEperFecInicio());

        fields += ", EPER_FEC_VENCIMIENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEperFecVencimiento());

        fields += ", EPER_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getEperPeriodicidad());

        fields += ", EPER_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getEperComentario());

        fields += ", EPER_ST_F_EMIPERIO";
        fieldValues += ", ?";
        values.add(this.getEperStFEmiperio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMIPERIO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EPER_ID_PROGRAMA = ?";
        values.add(this.getEperIdPrograma());
        conditions += " AND EPER_ID_FIDEICOMISO = ?";
        values.add(this.getEperIdFideicomiso());
        conditions += " AND EPER_ID_EMISION = ?";
        values.add(this.getEperIdEmision());
        conditions += " AND EPER_ID_SECUENCIAL = ?";
        values.add(this.getEperIdSecuencial());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmiperio instance = (FEmiperio) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEperIdPrograma().equals(instance.getEperIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEperIdFideicomiso().equals(instance.getEperIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEperIdEmision().equals(instance.getEperIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEperIdSecuencial().equals(instance.getEperIdSecuencial()))
            equalObjects = false;
        if (equalObjects && !this.getEperFecInicio().equals(instance.getEperFecInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEperFecVencimiento().equals(instance.getEperFecVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getEperPeriodicidad().equals(instance.getEperPeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getEperComentario().equals(instance.getEperComentario()))
            equalObjects = false;
        if (equalObjects && !this.getEperStFEmiperio().equals(instance.getEperStFEmiperio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmiperio result = new FEmiperio();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEperIdPrograma((BigDecimal) objectData.getData("EPER_ID_PROGRAMA"));
        result.setEperIdFideicomiso((BigDecimal) objectData.getData("EPER_ID_FIDEICOMISO"));
        result.setEperIdEmision((BigDecimal) objectData.getData("EPER_ID_EMISION"));
        result.setEperIdSecuencial((BigDecimal) objectData.getData("EPER_ID_SECUENCIAL"));
        result.setEperFecInicio((String) objectData.getData("EPER_FEC_INICIO"));
        result.setEperFecVencimiento((String) objectData.getData("EPER_FEC_VENCIMIENTO"));
        result.setEperPeriodicidad((String) objectData.getData("EPER_PERIODICIDAD"));
        result.setEperComentario((String) objectData.getData("EPER_COMENTARIO"));
        result.setEperStFEmiperio((String) objectData.getData("EPER_ST_F_EMIPERIO"));

        return result;

    }

}
