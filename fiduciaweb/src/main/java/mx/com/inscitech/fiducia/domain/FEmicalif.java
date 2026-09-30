package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMICALIF_PK", columns = { "ECAL_ID_PROGRAMA", "ECAL_ID_FIDEICOMISO", "ECAL_ID_EMISION", "ECAL_ID_CALIFICACION" }, sequences = { "MANUAL" })
public class FEmicalif extends DomainObject {

    BigDecimal ecalIdPrograma = null;
    BigDecimal ecalIdFideicomiso = null;
    BigDecimal ecalIdEmision = null;
    BigDecimal ecalIdCalificacion = null;
    String ecalCalificadora = null;
    String ecalCalificacion = null;
    String ecalCalificacionMin = null;
    String ecalComentario = null;
    String ecalStEmicalif = null;

    public FEmicalif() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcalIdPrograma(BigDecimal ecalIdPrograma) {
        this.ecalIdPrograma = ecalIdPrograma;
    }

    public BigDecimal getEcalIdPrograma() {
        return this.ecalIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcalIdFideicomiso(BigDecimal ecalIdFideicomiso) {
        this.ecalIdFideicomiso = ecalIdFideicomiso;
    }

    public BigDecimal getEcalIdFideicomiso() {
        return this.ecalIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEcalIdEmision(BigDecimal ecalIdEmision) {
        this.ecalIdEmision = ecalIdEmision;
    }

    public BigDecimal getEcalIdEmision() {
        return this.ecalIdEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEcalIdCalificacion(BigDecimal ecalIdCalificacion) {
        this.ecalIdCalificacion = ecalIdCalificacion;
    }

    public BigDecimal getEcalIdCalificacion() {
        return this.ecalIdCalificacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcalCalificadora(String ecalCalificadora) {
        this.ecalCalificadora = ecalCalificadora;
    }

    public String getEcalCalificadora() {
        return this.ecalCalificadora;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcalCalificacion(String ecalCalificacion) {
        this.ecalCalificacion = ecalCalificacion;
    }

    public String getEcalCalificacion() {
        return this.ecalCalificacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcalCalificacionMin(String ecalCalificacionMin) {
        this.ecalCalificacionMin = ecalCalificacionMin;
    }

    public String getEcalCalificacionMin() {
        return this.ecalCalificacionMin;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcalComentario(String ecalComentario) {
        this.ecalComentario = ecalComentario;
    }

    public String getEcalComentario() {
        return this.ecalComentario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEcalStEmicalif(String ecalStEmicalif) {
        this.ecalStEmicalif = ecalStEmicalif;
    }

    public String getEcalStEmicalif() {
        return this.ecalStEmicalif;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMICALIF ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcalIdPrograma() != null && this.getEcalIdPrograma().longValue() == -999) {
            conditions += " AND ECAL_ID_PROGRAMA IS NULL";
        } else if (this.getEcalIdPrograma() != null) {
            conditions += " AND ECAL_ID_PROGRAMA = ?";
            values.add(this.getEcalIdPrograma());
        }

        if (this.getEcalIdFideicomiso() != null && this.getEcalIdFideicomiso().longValue() == -999) {
            conditions += " AND ECAL_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcalIdFideicomiso() != null) {
            conditions += " AND ECAL_ID_FIDEICOMISO = ?";
            values.add(this.getEcalIdFideicomiso());
        }

        if (this.getEcalIdEmision() != null && this.getEcalIdEmision().longValue() == -999) {
            conditions += " AND ECAL_ID_EMISION IS NULL";
        } else if (this.getEcalIdEmision() != null) {
            conditions += " AND ECAL_ID_EMISION = ?";
            values.add(this.getEcalIdEmision());
        }

        if (this.getEcalIdCalificacion() != null && this.getEcalIdCalificacion().longValue() == -999) {
            conditions += " AND ECAL_ID_CALIFICACION IS NULL";
        } else if (this.getEcalIdCalificacion() != null) {
            conditions += " AND ECAL_ID_CALIFICACION = ?";
            values.add(this.getEcalIdCalificacion());
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
        String sql = "SELECT * FROM F_EMICALIF ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEcalIdPrograma() != null && this.getEcalIdPrograma().longValue() == -999) {
            conditions += " AND ECAL_ID_PROGRAMA IS NULL";
        } else if (this.getEcalIdPrograma() != null) {
            conditions += " AND ECAL_ID_PROGRAMA = ?";
            values.add(this.getEcalIdPrograma());
        }

        if (this.getEcalIdFideicomiso() != null && this.getEcalIdFideicomiso().longValue() == -999) {
            conditions += " AND ECAL_ID_FIDEICOMISO IS NULL";
        } else if (this.getEcalIdFideicomiso() != null) {
            conditions += " AND ECAL_ID_FIDEICOMISO = ?";
            values.add(this.getEcalIdFideicomiso());
        }

        if (this.getEcalIdEmision() != null && this.getEcalIdEmision().longValue() == -999) {
            conditions += " AND ECAL_ID_EMISION IS NULL";
        } else if (this.getEcalIdEmision() != null) {
            conditions += " AND ECAL_ID_EMISION = ?";
            values.add(this.getEcalIdEmision());
        }

        if (this.getEcalIdCalificacion() != null && this.getEcalIdCalificacion().longValue() == -999) {
            conditions += " AND ECAL_ID_CALIFICACION IS NULL";
        } else if (this.getEcalIdCalificacion() != null) {
            conditions += " AND ECAL_ID_CALIFICACION = ?";
            values.add(this.getEcalIdCalificacion());
        }

        if (this.getEcalCalificadora() != null && "null".equals(this.getEcalCalificadora())) {
            conditions += " AND ECAL_CALIFICADORA IS NULL";
        } else if (this.getEcalCalificadora() != null) {
            conditions += " AND ECAL_CALIFICADORA = ?";
            values.add(this.getEcalCalificadora());
        }

        if (this.getEcalCalificacion() != null && "null".equals(this.getEcalCalificacion())) {
            conditions += " AND ECAL_CALIFICACION IS NULL";
        } else if (this.getEcalCalificacion() != null) {
            conditions += " AND ECAL_CALIFICACION = ?";
            values.add(this.getEcalCalificacion());
        }

        if (this.getEcalCalificacionMin() != null && "null".equals(this.getEcalCalificacionMin())) {
            conditions += " AND ECAL_CALIFICACION_MIN IS NULL";
        } else if (this.getEcalCalificacionMin() != null) {
            conditions += " AND ECAL_CALIFICACION_MIN = ?";
            values.add(this.getEcalCalificacionMin());
        }

        if (this.getEcalComentario() != null && "null".equals(this.getEcalComentario())) {
            conditions += " AND ECAL_COMENTARIO IS NULL";
        } else if (this.getEcalComentario() != null) {
            conditions += " AND ECAL_COMENTARIO = ?";
            values.add(this.getEcalComentario());
        }

        if (this.getEcalStEmicalif() != null && "null".equals(this.getEcalStEmicalif())) {
            conditions += " AND ECAL_ST_EMICALIF IS NULL";
        } else if (this.getEcalStEmicalif() != null) {
            conditions += " AND ECAL_ST_EMICALIF = ?";
            values.add(this.getEcalStEmicalif());
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
        String sql = "UPDATE F_EMICALIF SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ECAL_ID_PROGRAMA = ?";
        pkValues.add(this.getEcalIdPrograma());
        conditions += " AND ECAL_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEcalIdFideicomiso());
        conditions += " AND ECAL_ID_EMISION = ?";
        pkValues.add(this.getEcalIdEmision());
        conditions += " AND ECAL_ID_CALIFICACION = ?";
        pkValues.add(this.getEcalIdCalificacion());
        fields += " ECAL_CALIFICADORA = ?, ";
        values.add(this.getEcalCalificadora());
        fields += " ECAL_CALIFICACION = ?, ";
        values.add(this.getEcalCalificacion());
        fields += " ECAL_CALIFICACION_MIN = ?, ";
        values.add(this.getEcalCalificacionMin());
        fields += " ECAL_COMENTARIO = ?, ";
        values.add(this.getEcalComentario());
        fields += " ECAL_ST_EMICALIF = ?, ";
        values.add(this.getEcalStEmicalif());
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
        String sql = "INSERT INTO F_EMICALIF ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ECAL_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEcalIdPrograma());

        fields += ", ECAL_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEcalIdFideicomiso());

        fields += ", ECAL_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEcalIdEmision());

        fields += ", ECAL_ID_CALIFICACION";
        fieldValues += ", ?";
        values.add(this.getEcalIdCalificacion());

        fields += ", ECAL_CALIFICADORA";
        fieldValues += ", ?";
        values.add(this.getEcalCalificadora());

        fields += ", ECAL_CALIFICACION";
        fieldValues += ", ?";
        values.add(this.getEcalCalificacion());

        fields += ", ECAL_CALIFICACION_MIN";
        fieldValues += ", ?";
        values.add(this.getEcalCalificacionMin());

        fields += ", ECAL_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getEcalComentario());

        fields += ", ECAL_ST_EMICALIF";
        fieldValues += ", ?";
        values.add(this.getEcalStEmicalif());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMICALIF WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ECAL_ID_PROGRAMA = ?";
        values.add(this.getEcalIdPrograma());
        conditions += " AND ECAL_ID_FIDEICOMISO = ?";
        values.add(this.getEcalIdFideicomiso());
        conditions += " AND ECAL_ID_EMISION = ?";
        values.add(this.getEcalIdEmision());
        conditions += " AND ECAL_ID_CALIFICACION = ?";
        values.add(this.getEcalIdCalificacion());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmicalif instance = (FEmicalif) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEcalIdPrograma().equals(instance.getEcalIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEcalIdFideicomiso().equals(instance.getEcalIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEcalIdEmision().equals(instance.getEcalIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEcalIdCalificacion().equals(instance.getEcalIdCalificacion()))
            equalObjects = false;
        if (equalObjects && !this.getEcalCalificadora().equals(instance.getEcalCalificadora()))
            equalObjects = false;
        if (equalObjects && !this.getEcalCalificacion().equals(instance.getEcalCalificacion()))
            equalObjects = false;
        if (equalObjects && !this.getEcalCalificacionMin().equals(instance.getEcalCalificacionMin()))
            equalObjects = false;
        if (equalObjects && !this.getEcalComentario().equals(instance.getEcalComentario()))
            equalObjects = false;
        if (equalObjects && !this.getEcalStEmicalif().equals(instance.getEcalStEmicalif()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmicalif result = new FEmicalif();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEcalIdPrograma((BigDecimal) objectData.getData("ECAL_ID_PROGRAMA"));
        result.setEcalIdFideicomiso((BigDecimal) objectData.getData("ECAL_ID_FIDEICOMISO"));
        result.setEcalIdEmision((BigDecimal) objectData.getData("ECAL_ID_EMISION"));
        result.setEcalIdCalificacion((BigDecimal) objectData.getData("ECAL_ID_CALIFICACION"));
        result.setEcalCalificadora((String) objectData.getData("ECAL_CALIFICADORA"));
        result.setEcalCalificacion((String) objectData.getData("ECAL_CALIFICACION"));
        result.setEcalCalificacionMin((String) objectData.getData("ECAL_CALIFICACION_MIN"));
        result.setEcalComentario((String) objectData.getData("ECAL_COMENTARIO"));
        result.setEcalStEmicalif((String) objectData.getData("ECAL_ST_EMICALIF"));

        return result;

    }

}
