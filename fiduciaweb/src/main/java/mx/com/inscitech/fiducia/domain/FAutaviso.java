package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_AUTAVISO_PK",
            columns = { "EAAV_ID_PROGRAMA", "EAAV_ID_EMISION", "EAAV_ID_AUTORIDAD", "EAAV_ID_RESPONSABLE", "EAAV_ID_DIAS_ANTES", "EAAV_ID_TIPO_AVISO" }, sequences = { "MANUAL" })
public class FAutaviso extends DomainObject {

    BigDecimal eaavIdPrograma = null;
    BigDecimal eaavIdFideicomiso = null;
    BigDecimal eaavIdEmision = null;
    BigDecimal eaavIdAutoridad = null;
    BigDecimal eaavIdResponsable = null;
    BigDecimal eaavIdDiasAntes = null;
    String eaavIdTipoAviso = null;
    BigDecimal eaavNuevoPeriodo = null;
    BigDecimal eaavPublica = null;
    BigDecimal eaavDiasHabiles = null;
    String eaavComentario = null;
    String eaavStAutaviso = null;

    public FAutaviso() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEaavIdPrograma(BigDecimal eaavIdPrograma) {
        this.eaavIdPrograma = eaavIdPrograma;
    }

    public BigDecimal getEaavIdPrograma() {
        return this.eaavIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEaavIdFideicomiso(BigDecimal eaavIdFideicomiso) {
        this.eaavIdFideicomiso = eaavIdFideicomiso;
    }

    public BigDecimal getEaavIdFideicomiso() {
        return this.eaavIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEaavIdEmision(BigDecimal eaavIdEmision) {
        this.eaavIdEmision = eaavIdEmision;
    }

    public BigDecimal getEaavIdEmision() {
        return this.eaavIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEaavIdAutoridad(BigDecimal eaavIdAutoridad) {
        this.eaavIdAutoridad = eaavIdAutoridad;
    }

    public BigDecimal getEaavIdAutoridad() {
        return this.eaavIdAutoridad;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEaavIdResponsable(BigDecimal eaavIdResponsable) {
        this.eaavIdResponsable = eaavIdResponsable;
    }

    public BigDecimal getEaavIdResponsable() {
        return this.eaavIdResponsable;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setEaavIdDiasAntes(BigDecimal eaavIdDiasAntes) {
        this.eaavIdDiasAntes = eaavIdDiasAntes;
    }

    public BigDecimal getEaavIdDiasAntes() {
        return this.eaavIdDiasAntes;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaavIdTipoAviso(String eaavIdTipoAviso) {
        this.eaavIdTipoAviso = eaavIdTipoAviso;
    }

    public String getEaavIdTipoAviso() {
        return this.eaavIdTipoAviso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setEaavNuevoPeriodo(BigDecimal eaavNuevoPeriodo) {
        this.eaavNuevoPeriodo = eaavNuevoPeriodo;
    }

    public BigDecimal getEaavNuevoPeriodo() {
        return this.eaavNuevoPeriodo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEaavPublica(BigDecimal eaavPublica) {
        this.eaavPublica = eaavPublica;
    }

    public BigDecimal getEaavPublica() {
        return this.eaavPublica;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setEaavDiasHabiles(BigDecimal eaavDiasHabiles) {
        this.eaavDiasHabiles = eaavDiasHabiles;
    }

    public BigDecimal getEaavDiasHabiles() {
        return this.eaavDiasHabiles;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaavComentario(String eaavComentario) {
        this.eaavComentario = eaavComentario;
    }

    public String getEaavComentario() {
        return this.eaavComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEaavStAutaviso(String eaavStAutaviso) {
        this.eaavStAutaviso = eaavStAutaviso;
    }

    public String getEaavStAutaviso() {
        return this.eaavStAutaviso;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_AUTAVISO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEaavIdPrograma() != null && this.getEaavIdPrograma().longValue() == -999) {
            conditions += " AND EAAV_ID_PROGRAMA IS NULL";
        } else if (this.getEaavIdPrograma() != null) {
            conditions += " AND EAAV_ID_PROGRAMA = ?";
            values.add(this.getEaavIdPrograma());
        }

        if (this.getEaavIdEmision() != null && this.getEaavIdEmision().longValue() == -999) {
            conditions += " AND EAAV_ID_EMISION IS NULL";
        } else if (this.getEaavIdEmision() != null) {
            conditions += " AND EAAV_ID_EMISION = ?";
            values.add(this.getEaavIdEmision());
        }

        if (this.getEaavIdAutoridad() != null && this.getEaavIdAutoridad().longValue() == -999) {
            conditions += " AND EAAV_ID_AUTORIDAD IS NULL";
        } else if (this.getEaavIdAutoridad() != null) {
            conditions += " AND EAAV_ID_AUTORIDAD = ?";
            values.add(this.getEaavIdAutoridad());
        }

        if (this.getEaavIdResponsable() != null && this.getEaavIdResponsable().longValue() == -999) {
            conditions += " AND EAAV_ID_RESPONSABLE IS NULL";
        } else if (this.getEaavIdResponsable() != null) {
            conditions += " AND EAAV_ID_RESPONSABLE = ?";
            values.add(this.getEaavIdResponsable());
        }

        if (this.getEaavIdDiasAntes() != null && this.getEaavIdDiasAntes().longValue() == -999) {
            conditions += " AND EAAV_ID_DIAS_ANTES IS NULL";
        } else if (this.getEaavIdDiasAntes() != null) {
            conditions += " AND EAAV_ID_DIAS_ANTES = ?";
            values.add(this.getEaavIdDiasAntes());
        }

        if (this.getEaavIdTipoAviso() != null && "null".equals(this.getEaavIdTipoAviso())) {
            conditions += " AND EAAV_ID_TIPO_AVISO IS NULL";
        } else if (this.getEaavIdTipoAviso() != null) {
            conditions += " AND EAAV_ID_TIPO_AVISO = ?";
            values.add(this.getEaavIdTipoAviso());
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
        String sql = "SELECT * FROM F_AUTAVISO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEaavIdPrograma() != null && this.getEaavIdPrograma().longValue() == -999) {
            conditions += " AND EAAV_ID_PROGRAMA IS NULL";
        } else if (this.getEaavIdPrograma() != null) {
            conditions += " AND EAAV_ID_PROGRAMA = ?";
            values.add(this.getEaavIdPrograma());
        }

        if (this.getEaavIdFideicomiso() != null && this.getEaavIdFideicomiso().longValue() == -999) {
            conditions += " AND EAAV_ID_FIDEICOMISO IS NULL";
        } else if (this.getEaavIdFideicomiso() != null) {
            conditions += " AND EAAV_ID_FIDEICOMISO = ?";
            values.add(this.getEaavIdFideicomiso());
        }

        if (this.getEaavIdEmision() != null && this.getEaavIdEmision().longValue() == -999) {
            conditions += " AND EAAV_ID_EMISION IS NULL";
        } else if (this.getEaavIdEmision() != null) {
            conditions += " AND EAAV_ID_EMISION = ?";
            values.add(this.getEaavIdEmision());
        }

        if (this.getEaavIdAutoridad() != null && this.getEaavIdAutoridad().longValue() == -999) {
            conditions += " AND EAAV_ID_AUTORIDAD IS NULL";
        } else if (this.getEaavIdAutoridad() != null) {
            conditions += " AND EAAV_ID_AUTORIDAD = ?";
            values.add(this.getEaavIdAutoridad());
        }

        if (this.getEaavIdResponsable() != null && this.getEaavIdResponsable().longValue() == -999) {
            conditions += " AND EAAV_ID_RESPONSABLE IS NULL";
        } else if (this.getEaavIdResponsable() != null) {
            conditions += " AND EAAV_ID_RESPONSABLE = ?";
            values.add(this.getEaavIdResponsable());
        }

        if (this.getEaavIdDiasAntes() != null && this.getEaavIdDiasAntes().longValue() == -999) {
            conditions += " AND EAAV_ID_DIAS_ANTES IS NULL";
        } else if (this.getEaavIdDiasAntes() != null) {
            conditions += " AND EAAV_ID_DIAS_ANTES = ?";
            values.add(this.getEaavIdDiasAntes());
        }

        if (this.getEaavIdTipoAviso() != null && "null".equals(this.getEaavIdTipoAviso())) {
            conditions += " AND EAAV_ID_TIPO_AVISO IS NULL";
        } else if (this.getEaavIdTipoAviso() != null) {
            conditions += " AND EAAV_ID_TIPO_AVISO = ?";
            values.add(this.getEaavIdTipoAviso());
        }

        if (this.getEaavNuevoPeriodo() != null && this.getEaavNuevoPeriodo().longValue() == -999) {
            conditions += " AND EAAV_NUEVO_PERIODO IS NULL";
        } else if (this.getEaavNuevoPeriodo() != null) {
            conditions += " AND EAAV_NUEVO_PERIODO = ?";
            values.add(this.getEaavNuevoPeriodo());
        }

        if (this.getEaavPublica() != null && this.getEaavPublica().longValue() == -999) {
            conditions += " AND EAAV_PUBLICA IS NULL";
        } else if (this.getEaavPublica() != null) {
            conditions += " AND EAAV_PUBLICA = ?";
            values.add(this.getEaavPublica());
        }

        if (this.getEaavDiasHabiles() != null && this.getEaavDiasHabiles().longValue() == -999) {
            conditions += " AND EAAV_DIAS_HABILES IS NULL";
        } else if (this.getEaavDiasHabiles() != null) {
            conditions += " AND EAAV_DIAS_HABILES = ?";
            values.add(this.getEaavDiasHabiles());
        }

        if (this.getEaavComentario() != null && "null".equals(this.getEaavComentario())) {
            conditions += " AND EAAV_COMENTARIO IS NULL";
        } else if (this.getEaavComentario() != null) {
            conditions += " AND EAAV_COMENTARIO = ?";
            values.add(this.getEaavComentario());
        }

        if (this.getEaavStAutaviso() != null && "null".equals(this.getEaavStAutaviso())) {
            conditions += " AND EAAV_ST_AUTAVISO IS NULL";
        } else if (this.getEaavStAutaviso() != null) {
            conditions += " AND EAAV_ST_AUTAVISO = ?";
            values.add(this.getEaavStAutaviso());
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
        String sql = "UPDATE F_AUTAVISO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EAAV_ID_PROGRAMA = ?";
        pkValues.add(this.getEaavIdPrograma());
        fields += " EAAV_ID_FIDEICOMISO = ?, ";
        values.add(this.getEaavIdFideicomiso());
        conditions += " AND EAAV_ID_EMISION = ?";
        pkValues.add(this.getEaavIdEmision());
        conditions += " AND EAAV_ID_AUTORIDAD = ?";
        pkValues.add(this.getEaavIdAutoridad());
        conditions += " AND EAAV_ID_RESPONSABLE = ?";
        pkValues.add(this.getEaavIdResponsable());
        conditions += " AND EAAV_ID_DIAS_ANTES = ?";
        pkValues.add(this.getEaavIdDiasAntes());
        conditions += " AND EAAV_ID_TIPO_AVISO = ?";
        pkValues.add(this.getEaavIdTipoAviso());
        fields += " EAAV_NUEVO_PERIODO = ?, ";
        values.add(this.getEaavNuevoPeriodo());
        fields += " EAAV_PUBLICA = ?, ";
        values.add(this.getEaavPublica());
        fields += " EAAV_DIAS_HABILES = ?, ";
        values.add(this.getEaavDiasHabiles());
        fields += " EAAV_COMENTARIO = ?, ";
        values.add(this.getEaavComentario());
        fields += " EAAV_ST_AUTAVISO = ?, ";
        values.add(this.getEaavStAutaviso());
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
        String sql = "INSERT INTO F_AUTAVISO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EAAV_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEaavIdPrograma());

        fields += ", EAAV_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEaavIdFideicomiso());

        fields += ", EAAV_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEaavIdEmision());

        fields += ", EAAV_ID_AUTORIDAD";
        fieldValues += ", ?";
        values.add(this.getEaavIdAutoridad());

        fields += ", EAAV_ID_RESPONSABLE";
        fieldValues += ", ?";
        values.add(this.getEaavIdResponsable());

        fields += ", EAAV_ID_DIAS_ANTES";
        fieldValues += ", ?";
        values.add(this.getEaavIdDiasAntes());

        fields += ", EAAV_ID_TIPO_AVISO";
        fieldValues += ", ?";
        values.add(this.getEaavIdTipoAviso());

        fields += ", EAAV_NUEVO_PERIODO";
        fieldValues += ", ?";
        values.add(this.getEaavNuevoPeriodo());

        fields += ", EAAV_PUBLICA";
        fieldValues += ", ?";
        values.add(this.getEaavPublica());

        fields += ", EAAV_DIAS_HABILES";
        fieldValues += ", ?";
        values.add(this.getEaavDiasHabiles());

        fields += ", EAAV_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getEaavComentario());

        fields += ", EAAV_ST_AUTAVISO";
        fieldValues += ", ?";
        values.add(this.getEaavStAutaviso());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_AUTAVISO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EAAV_ID_PROGRAMA = ?";
        values.add(this.getEaavIdPrograma());
        conditions += " AND EAAV_ID_EMISION = ?";
        values.add(this.getEaavIdEmision());
        conditions += " AND EAAV_ID_AUTORIDAD = ?";
        values.add(this.getEaavIdAutoridad());
        conditions += " AND EAAV_ID_RESPONSABLE = ?";
        values.add(this.getEaavIdResponsable());
        conditions += " AND EAAV_ID_DIAS_ANTES = ?";
        values.add(this.getEaavIdDiasAntes());
        conditions += " AND EAAV_ID_TIPO_AVISO = ?";
        values.add(this.getEaavIdTipoAviso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FAutaviso instance = (FAutaviso) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEaavIdPrograma().equals(instance.getEaavIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEaavIdFideicomiso().equals(instance.getEaavIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEaavIdEmision().equals(instance.getEaavIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEaavIdAutoridad().equals(instance.getEaavIdAutoridad()))
            equalObjects = false;
        if (equalObjects && !this.getEaavIdResponsable().equals(instance.getEaavIdResponsable()))
            equalObjects = false;
        if (equalObjects && !this.getEaavIdDiasAntes().equals(instance.getEaavIdDiasAntes()))
            equalObjects = false;
        if (equalObjects && !this.getEaavIdTipoAviso().equals(instance.getEaavIdTipoAviso()))
            equalObjects = false;
        if (equalObjects && !this.getEaavNuevoPeriodo().equals(instance.getEaavNuevoPeriodo()))
            equalObjects = false;
        if (equalObjects && !this.getEaavPublica().equals(instance.getEaavPublica()))
            equalObjects = false;
        if (equalObjects && !this.getEaavDiasHabiles().equals(instance.getEaavDiasHabiles()))
            equalObjects = false;
        if (equalObjects && !this.getEaavComentario().equals(instance.getEaavComentario()))
            equalObjects = false;
        if (equalObjects && !this.getEaavStAutaviso().equals(instance.getEaavStAutaviso()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FAutaviso result = new FAutaviso();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEaavIdPrograma((BigDecimal) objectData.getData("EAAV_ID_PROGRAMA"));
        result.setEaavIdFideicomiso((BigDecimal) objectData.getData("EAAV_ID_FIDEICOMISO"));
        result.setEaavIdEmision((BigDecimal) objectData.getData("EAAV_ID_EMISION"));
        result.setEaavIdAutoridad((BigDecimal) objectData.getData("EAAV_ID_AUTORIDAD"));
        result.setEaavIdResponsable((BigDecimal) objectData.getData("EAAV_ID_RESPONSABLE"));
        result.setEaavIdDiasAntes((BigDecimal) objectData.getData("EAAV_ID_DIAS_ANTES"));
        result.setEaavIdTipoAviso((String) objectData.getData("EAAV_ID_TIPO_AVISO"));
        result.setEaavNuevoPeriodo((BigDecimal) objectData.getData("EAAV_NUEVO_PERIODO"));
        result.setEaavPublica((BigDecimal) objectData.getData("EAAV_PUBLICA"));
        result.setEaavDiasHabiles((BigDecimal) objectData.getData("EAAV_DIAS_HABILES"));
        result.setEaavComentario((String) objectData.getData("EAAV_COMENTARIO"));
        result.setEaavStAutaviso((String) objectData.getData("EAAV_ST_AUTAVISO"));

        return result;

    }

}
