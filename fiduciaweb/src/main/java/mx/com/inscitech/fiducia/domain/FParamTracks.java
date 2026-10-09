package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_PARAM_TRACKS_PK", columns = { "PAT_ID_PIZARRA", "PAT_ID_SERIE", "PAT_ID_CUPON" }, sequences = { "MANUAL" })
public class FParamTracks extends DomainObject {

    String patIdPizarra = null;
    String patIdSerie = null;
    BigDecimal patIdCupon = null;
    BigDecimal patNumCertificados = null;
    BigDecimal patMaxCreaciones = null;
    BigDecimal patMaxCreacionesFin = null;
    BigDecimal patMaxRedenciones = null;
    BigDecimal patCovertura = null;
    BigDecimal patAmpliar = null;
    String patHoraFina = null;
    String patStatusDia = null;
    String patComentario = null;
    String patFecAlta = null;
    String patStatus = null;
    BigDecimal patAsignacionAutomatica = null;

    public FParamTracks() {
        super();
        this.pkColumns = 3;
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

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatNumCertificados(BigDecimal patNumCertificados) {
        this.patNumCertificados = patNumCertificados;
    }

    public BigDecimal getPatNumCertificados() {
        return this.patNumCertificados;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatMaxCreaciones(BigDecimal patMaxCreaciones) {
        this.patMaxCreaciones = patMaxCreaciones;
    }

    public BigDecimal getPatMaxCreaciones() {
        return this.patMaxCreaciones;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 2, javaClass = BigDecimal.class)
    public void setPatMaxCreacionesFin(BigDecimal patMaxCreacionesFin) {
        this.patMaxCreacionesFin = patMaxCreacionesFin;
    }

    public BigDecimal getPatMaxCreacionesFin() {
        return this.patMaxCreacionesFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatMaxRedenciones(BigDecimal patMaxRedenciones) {
        this.patMaxRedenciones = patMaxRedenciones;
    }

    public BigDecimal getPatMaxRedenciones() {
        return this.patMaxRedenciones;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatCovertura(BigDecimal patCovertura) {
        this.patCovertura = patCovertura;
    }

    public BigDecimal getPatCovertura() {
        return this.patCovertura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatAmpliar(BigDecimal patAmpliar) {
        this.patAmpliar = patAmpliar;
    }

    public BigDecimal getPatAmpliar() {
        return this.patAmpliar;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatHoraFina(String patHoraFina) {
        this.patHoraFina = patHoraFina;
    }

    public String getPatHoraFina() {
        return this.patHoraFina;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatStatusDia(String patStatusDia) {
        this.patStatusDia = patStatusDia;
    }

    public String getPatStatusDia() {
        return this.patStatusDia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatComentario(String patComentario) {
        this.patComentario = patComentario;
    }

    public String getPatComentario() {
        return this.patComentario;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setPatFecAlta(String patFecAlta) {
        this.patFecAlta = patFecAlta;
    }

    public String getPatFecAlta() {
        return this.patFecAlta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setPatStatus(String patStatus) {
        this.patStatus = patStatus;
    }

    public String getPatStatus() {
        return this.patStatus;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setPatAsignacionAutomatica(BigDecimal patAsignacionAutomatica) {
        this.patAsignacionAutomatica = patAsignacionAutomatica;
    }

    public BigDecimal getPatAsignacionAutomatica() {
        return this.patAsignacionAutomatica;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_PARAM_TRACKS ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        String sql = "SELECT * FROM F_PARAM_TRACKS ";

        String conditions = "";
        ArrayList values = new ArrayList();

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

        if (this.getPatNumCertificados() != null && this.getPatNumCertificados().longValue() == -999) {
            conditions += " AND PAT_NUM_CERTIFICADOS IS NULL";
        } else if (this.getPatNumCertificados() != null) {
            conditions += " AND PAT_NUM_CERTIFICADOS = ?";
            values.add(this.getPatNumCertificados());
        }

        if (this.getPatMaxCreaciones() != null && this.getPatMaxCreaciones().longValue() == -999) {
            conditions += " AND PAT_MAX_CREACIONES IS NULL";
        } else if (this.getPatMaxCreaciones() != null) {
            conditions += " AND PAT_MAX_CREACIONES = ?";
            values.add(this.getPatMaxCreaciones());
        }

        if (this.getPatMaxCreacionesFin() != null && this.getPatMaxCreacionesFin().longValue() == -999) {
            conditions += " AND PAT_MAX_CREACIONES_FIN IS NULL";
        } else if (this.getPatMaxCreacionesFin() != null) {
            conditions += " AND PAT_MAX_CREACIONES_FIN = ?";
            values.add(this.getPatMaxCreacionesFin());
        }

        if (this.getPatMaxRedenciones() != null && this.getPatMaxRedenciones().longValue() == -999) {
            conditions += " AND PAT_MAX_REDENCIONES IS NULL";
        } else if (this.getPatMaxRedenciones() != null) {
            conditions += " AND PAT_MAX_REDENCIONES = ?";
            values.add(this.getPatMaxRedenciones());
        }

        if (this.getPatCovertura() != null && this.getPatCovertura().longValue() == -999) {
            conditions += " AND PAT_COVERTURA IS NULL";
        } else if (this.getPatCovertura() != null) {
            conditions += " AND PAT_COVERTURA = ?";
            values.add(this.getPatCovertura());
        }

        if (this.getPatAmpliar() != null && this.getPatAmpliar().longValue() == -999) {
            conditions += " AND PAT_AMPLIAR IS NULL";
        } else if (this.getPatAmpliar() != null) {
            conditions += " AND PAT_AMPLIAR = ?";
            values.add(this.getPatAmpliar());
        }

        if (this.getPatHoraFina() != null && "null".equals(this.getPatHoraFina())) {
            conditions += " AND PAT_HORA_FINA IS NULL";
        } else if (this.getPatHoraFina() != null) {
            conditions += " AND PAT_HORA_FINA = ?";
            values.add(this.getPatHoraFina());
        }

        if (this.getPatStatusDia() != null && "null".equals(this.getPatStatusDia())) {
            conditions += " AND PAT_STATUS_DIA IS NULL";
        } else if (this.getPatStatusDia() != null) {
            conditions += " AND PAT_STATUS_DIA = ?";
            values.add(this.getPatStatusDia());
        }

        if (this.getPatComentario() != null && "null".equals(this.getPatComentario())) {
            conditions += " AND PAT_COMENTARIO IS NULL";
        } else if (this.getPatComentario() != null) {
            conditions += " AND PAT_COMENTARIO = ?";
            values.add(this.getPatComentario());
        }

        if (this.getPatFecAlta() != null && "null".equals(this.getPatFecAlta())) {
            conditions += " AND PAT_FEC_ALTA IS NULL";
        } else if (this.getPatFecAlta() != null) {
            conditions += " AND PAT_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getPatFecAlta());
        }

        if (this.getPatStatus() != null && "null".equals(this.getPatStatus())) {
            conditions += " AND PAT_STATUS IS NULL";
        } else if (this.getPatStatus() != null) {
            conditions += " AND PAT_STATUS = ?";
            values.add(this.getPatStatus());
        }

        if (this.getPatAsignacionAutomatica() != null && this.getPatAsignacionAutomatica().longValue() == -999) {
            conditions += " AND PAT_ASIGNACION_AUTOMATICA IS NULL";
        } else if (this.getPatAsignacionAutomatica() != null) {
            conditions += " AND PAT_ASIGNACION_AUTOMATICA = ?";
            values.add(this.getPatAsignacionAutomatica());
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
        String sql = "UPDATE F_PARAM_TRACKS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND PAT_ID_PIZARRA = ?";
        pkValues.add(this.getPatIdPizarra());
        conditions += " AND PAT_ID_SERIE = ?";
        pkValues.add(this.getPatIdSerie());
        conditions += " AND PAT_ID_CUPON = ?";
        pkValues.add(this.getPatIdCupon());
        fields += " PAT_NUM_CERTIFICADOS = ?, ";
        values.add(this.getPatNumCertificados());
        fields += " PAT_MAX_CREACIONES = ?, ";
        values.add(this.getPatMaxCreaciones());
        fields += " PAT_MAX_CREACIONES_FIN = ?, ";
        values.add(this.getPatMaxCreacionesFin());
        fields += " PAT_MAX_REDENCIONES = ?, ";
        values.add(this.getPatMaxRedenciones());
        fields += " PAT_COVERTURA = ?, ";
        values.add(this.getPatCovertura());
        fields += " PAT_AMPLIAR = ?, ";
        values.add(this.getPatAmpliar());
        fields += " PAT_HORA_FINA = ?, ";
        values.add(this.getPatHoraFina());
        fields += " PAT_STATUS_DIA = ?, ";
        values.add(this.getPatStatusDia());
        fields += " PAT_COMENTARIO = ?, ";
        values.add(this.getPatComentario());
        fields += " PAT_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getPatFecAlta());
        fields += " PAT_STATUS = ?, ";
        values.add(this.getPatStatus());
        fields += " PAT_ASIGNACION_AUTOMATICA = ?, ";
        values.add(this.getPatAsignacionAutomatica());
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
        String sql = "INSERT INTO F_PARAM_TRACKS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", PAT_ID_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getPatIdPizarra());

        fields += ", PAT_ID_SERIE";
        fieldValues += ", ?";
        values.add(this.getPatIdSerie());

        fields += ", PAT_ID_CUPON";
        fieldValues += ", ?";
        values.add(this.getPatIdCupon());

        fields += ", PAT_NUM_CERTIFICADOS";
        fieldValues += ", ?";
        values.add(this.getPatNumCertificados());

        fields += ", PAT_MAX_CREACIONES";
        fieldValues += ", ?";
        values.add(this.getPatMaxCreaciones());

        fields += ", PAT_MAX_CREACIONES_FIN";
        fieldValues += ", ?";
        values.add(this.getPatMaxCreacionesFin());

        fields += ", PAT_MAX_REDENCIONES";
        fieldValues += ", ?";
        values.add(this.getPatMaxRedenciones());

        fields += ", PAT_COVERTURA";
        fieldValues += ", ?";
        values.add(this.getPatCovertura());

        fields += ", PAT_AMPLIAR";
        fieldValues += ", ?";
        values.add(this.getPatAmpliar());

        fields += ", PAT_HORA_FINA";
        fieldValues += ", ?";
        values.add(this.getPatHoraFina());

        fields += ", PAT_STATUS_DIA";
        fieldValues += ", ?";
        values.add(this.getPatStatusDia());

        fields += ", PAT_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getPatComentario());

        fields += ", PAT_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getPatFecAlta());

        fields += ", PAT_STATUS";
        fieldValues += ", ?";
        values.add(this.getPatStatus());

        fields += ", PAT_ASIGNACION_AUTOMATICA";
        fieldValues += ", ?";
        values.add(this.getPatAsignacionAutomatica());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_PARAM_TRACKS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

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
        FParamTracks instance = (FParamTracks) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getPatIdPizarra().equals(instance.getPatIdPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getPatIdSerie().equals(instance.getPatIdSerie()))
            equalObjects = false;
        if (equalObjects && !this.getPatIdCupon().equals(instance.getPatIdCupon()))
            equalObjects = false;
        if (equalObjects && !this.getPatNumCertificados().equals(instance.getPatNumCertificados()))
            equalObjects = false;
        if (equalObjects && !this.getPatMaxCreaciones().equals(instance.getPatMaxCreaciones()))
            equalObjects = false;
        if (equalObjects && !this.getPatMaxCreacionesFin().equals(instance.getPatMaxCreacionesFin()))
            equalObjects = false;
        if (equalObjects && !this.getPatMaxRedenciones().equals(instance.getPatMaxRedenciones()))
            equalObjects = false;
        if (equalObjects && !this.getPatCovertura().equals(instance.getPatCovertura()))
            equalObjects = false;
        if (equalObjects && !this.getPatAmpliar().equals(instance.getPatAmpliar()))
            equalObjects = false;
        if (equalObjects && !this.getPatHoraFina().equals(instance.getPatHoraFina()))
            equalObjects = false;
        if (equalObjects && !this.getPatStatusDia().equals(instance.getPatStatusDia()))
            equalObjects = false;
        if (equalObjects && !this.getPatComentario().equals(instance.getPatComentario()))
            equalObjects = false;
        if (equalObjects && !this.getPatFecAlta().equals(instance.getPatFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getPatStatus().equals(instance.getPatStatus()))
            equalObjects = false;
        if (equalObjects && !this.getPatAsignacionAutomatica().equals(instance.getPatAsignacionAutomatica()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FParamTracks result = new FParamTracks();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setPatIdPizarra((String) objectData.getData("PAT_ID_PIZARRA"));
        result.setPatIdSerie((String) objectData.getData("PAT_ID_SERIE"));
        result.setPatIdCupon((BigDecimal) objectData.getData("PAT_ID_CUPON"));
        result.setPatNumCertificados((BigDecimal) objectData.getData("PAT_NUM_CERTIFICADOS"));
        result.setPatMaxCreaciones((BigDecimal) objectData.getData("PAT_MAX_CREACIONES"));
        result.setPatMaxCreacionesFin((BigDecimal) objectData.getData("PAT_MAX_CREACIONES_FIN"));
        result.setPatMaxRedenciones((BigDecimal) objectData.getData("PAT_MAX_REDENCIONES"));
        result.setPatCovertura((BigDecimal) objectData.getData("PAT_COVERTURA"));
        result.setPatAmpliar((BigDecimal) objectData.getData("PAT_AMPLIAR"));
        result.setPatHoraFina((String) objectData.getData("PAT_HORA_FINA"));
        result.setPatStatusDia((String) objectData.getData("PAT_STATUS_DIA"));
        result.setPatComentario((String) objectData.getData("PAT_COMENTARIO"));
        result.setPatFecAlta((String) objectData.getData("PAT_FEC_ALTA"));
        result.setPatStatus((String) objectData.getData("PAT_STATUS"));
        result.setPatAsignacionAutomatica((BigDecimal) objectData.getData("PAT_ASIGNACION_AUTOMATICA"));

        return result;

    }

}
