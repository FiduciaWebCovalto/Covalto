package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_VENTANA_TRACKS_PK", columns = { "PAT_ID_VENTANA", "PAT_ID_PIZARRA", "PAT_ID_SERIE", "PAT_ID_CUPON" }, sequences = { "MANUAL" })
public class FVentanaTracks extends DomainObject {

    BigDecimal patIdVentana = null;
    String patIdPizarra = null;
    String patIdSerie = null;
    BigDecimal patIdCupon = null;
    String patHoraInicio = null;
    String patHoraFin = null;

    public FVentanaTracks() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatIdVentana(BigDecimal patIdVentana) {
        this.patIdVentana = patIdVentana;
    }

    public BigDecimal getPatIdVentana() {
        return this.patIdVentana;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatIdPizarra(String patIdPizarra) {
        this.patIdPizarra = patIdPizarra;
    }

    public String getPatIdPizarra() {
        return this.patIdPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatIdSerie(String patIdSerie) {
        this.patIdSerie = patIdSerie;
    }

    public String getPatIdSerie() {
        return this.patIdSerie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatIdCupon(BigDecimal patIdCupon) {
        this.patIdCupon = patIdCupon;
    }

    public BigDecimal getPatIdCupon() {
        return this.patIdCupon;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatHoraInicio(String patHoraInicio) {
        this.patHoraInicio = patHoraInicio;
    }

    public String getPatHoraInicio() {
        return this.patHoraInicio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatHoraFin(String patHoraFin) {
        this.patHoraFin = patHoraFin;
    }

    public String getPatHoraFin() {
        return this.patHoraFin;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_VENTANA_TRACKS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPatIdVentana() != null && this.getPatIdVentana().longValue() == -999) {
            conditions += " AND PAT_ID_VENTANA IS NULL";
        } else if (this.getPatIdVentana() != null) {
            conditions += " AND PAT_ID_VENTANA = ?";
            values.add(this.getPatIdVentana());
        }

        if (this.getPatIdPizarra() != null && "null".equals(this.getPatIdPizarra())) {
            conditions += " AND PAT_ID_PIZARRA IS NULL";
        } else if (this.getPatIdPizarra() != null) {
            conditions += " AND PAT_ID_PIZARRA = ?";
            values.add(this.getPatIdPizarra());
        }

        if (this.getPatIdSerie() != null && "null".equals(this.getPatIdSerie())) {
            conditions += " AND PAT_ID_SERIE IS NULL";
        } else if (this.getPatIdSerie() != null) {
            conditions += " AND PAT_ID_SERIE = ?";
            values.add(this.getPatIdSerie());
        }

        if (this.getPatIdCupon() != null && this.getPatIdCupon().longValue() == -999) {
            conditions += " AND PAT_ID_CUPON IS NULL";
        } else if (this.getPatIdCupon() != null) {
            conditions += " AND PAT_ID_CUPON = ?";
            values.add(this.getPatIdCupon());
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
        String sql = "SELECT * FROM F_VENTANA_TRACKS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getPatIdVentana() != null && this.getPatIdVentana().longValue() == -999) {
            conditions += " AND PAT_ID_VENTANA IS NULL";
        } else if (this.getPatIdVentana() != null) {
            conditions += " AND PAT_ID_VENTANA = ?";
            values.add(this.getPatIdVentana());
        }

        if (this.getPatIdPizarra() != null && "null".equals(this.getPatIdPizarra())) {
            conditions += " AND PAT_ID_PIZARRA IS NULL";
        } else if (this.getPatIdPizarra() != null) {
            conditions += " AND PAT_ID_PIZARRA = ?";
            values.add(this.getPatIdPizarra());
        }

        if (this.getPatIdSerie() != null && "null".equals(this.getPatIdSerie())) {
            conditions += " AND PAT_ID_SERIE IS NULL";
        } else if (this.getPatIdSerie() != null) {
            conditions += " AND PAT_ID_SERIE = ?";
            values.add(this.getPatIdSerie());
        }

        if (this.getPatIdCupon() != null && this.getPatIdCupon().longValue() == -999) {
            conditions += " AND PAT_ID_CUPON IS NULL";
        } else if (this.getPatIdCupon() != null) {
            conditions += " AND PAT_ID_CUPON = ?";
            values.add(this.getPatIdCupon());
        }

        if (this.getPatHoraInicio() != null && "null".equals(this.getPatHoraInicio())) {
            conditions += " AND PAT_HORA_INICIO IS NULL";
        } else if (this.getPatHoraInicio() != null) {
            conditions += " AND PAT_HORA_INICIO = ?";
            values.add(this.getPatHoraInicio());
        }

        if (this.getPatHoraFin() != null && "null".equals(this.getPatHoraFin())) {
            conditions += " AND PAT_HORA_FIN IS NULL";
        } else if (this.getPatHoraFin() != null) {
            conditions += " AND PAT_HORA_FIN = ?";
            values.add(this.getPatHoraFin());
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
        String sql = "UPDATE F_VENTANA_TRACKS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PAT_ID_VENTANA = ?";
        pkValues.add(this.getPatIdVentana());
        conditions += " AND PAT_ID_PIZARRA = ?";
        pkValues.add(this.getPatIdPizarra());
        conditions += " AND PAT_ID_SERIE = ?";
        pkValues.add(this.getPatIdSerie());
        conditions += " AND PAT_ID_CUPON = ?";
        pkValues.add(this.getPatIdCupon());
        fields += " PAT_HORA_INICIO = ?, ";
        values.add(this.getPatHoraInicio());
        fields += " PAT_HORA_FIN = ?, ";
        values.add(this.getPatHoraFin());
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
        String sql = "INSERT INTO F_VENTANA_TRACKS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAT_ID_VENTANA";
        fieldValues += ", ?";
        values.add(this.getPatIdVentana());

        fields += ", PAT_ID_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getPatIdPizarra());

        fields += ", PAT_ID_SERIE";
        fieldValues += ", ?";
        values.add(this.getPatIdSerie());

        fields += ", PAT_ID_CUPON";
        fieldValues += ", ?";
        values.add(this.getPatIdCupon());

        fields += ", PAT_HORA_INICIO";
        fieldValues += ", ?";
        values.add(this.getPatHoraInicio());

        fields += ", PAT_HORA_FIN";
        fieldValues += ", ?";
        values.add(this.getPatHoraFin());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_VENTANA_TRACKS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND PAT_ID_VENTANA = ?";
        values.add(this.getPatIdVentana());
        conditions += " AND PAT_ID_PIZARRA = ?";
        values.add(this.getPatIdPizarra());
        conditions += " AND PAT_ID_SERIE = ?";
        values.add(this.getPatIdSerie());
        conditions += " AND PAT_ID_CUPON = ?";
        values.add(this.getPatIdCupon());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FVentanaTracks instance = (FVentanaTracks) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPatIdVentana().equals(instance.getPatIdVentana()))
            equalObjects = false;
        if (equalObjects && !this.getPatIdPizarra().equals(instance.getPatIdPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getPatIdSerie().equals(instance.getPatIdSerie()))
            equalObjects = false;
        if (equalObjects && !this.getPatIdCupon().equals(instance.getPatIdCupon()))
            equalObjects = false;
        if (equalObjects && !this.getPatHoraInicio().equals(instance.getPatHoraInicio()))
            equalObjects = false;
        if (equalObjects && !this.getPatHoraFin().equals(instance.getPatHoraFin()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FVentanaTracks result = new FVentanaTracks();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPatIdVentana((BigDecimal) objectData.getData("PAT_ID_VENTANA"));
        result.setPatIdPizarra((String) objectData.getData("PAT_ID_PIZARRA"));
        result.setPatIdSerie((String) objectData.getData("PAT_ID_SERIE"));
        result.setPatIdCupon((BigDecimal) objectData.getData("PAT_ID_CUPON"));
        result.setPatHoraInicio((String) objectData.getData("PAT_HORA_INICIO"));
        result.setPatHoraFin((String) objectData.getData("PAT_HORA_FIN"));

        return result;

    }

}
