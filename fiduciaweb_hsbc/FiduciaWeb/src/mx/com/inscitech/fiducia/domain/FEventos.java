package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EVENTOS_PK", columns = { "EAGE_ID_FOLIO" }, sequences = { "MAX" })
public class FEventos extends DomainObject {

    BigDecimal eageIdFolio = null;
    String eageCveTipo = null;
    BigDecimal eageFideicomiso = null;
    BigDecimal eageSubcuenta = null;
    String eageFecEvento = null;
    String eageDesEvento = null;
    String eageTextEvento = null;
    String eageAccionTomada = null;
    BigDecimal eageProgamable = null;
    String eagePeriodicidad = null;
    BigDecimal eageNumEventos = null;
    BigDecimal eageNumUsuario = null;
    String eageCveStatus = null;
    BigDecimal eageNumUsuario2 = null;
    BigDecimal eageNumUsuario3 = null;
    BigDecimal eageNumUsuario4 = null;
    BigDecimal eageNumUsuario5 = null;
    String eageFecModificacion = null;
    BigDecimal eageUsuModificacion = null;
    BigDecimal eagePrograma = null;
    BigDecimal eageEmision = null;
    BigDecimal eageSecEmision = null;
    String eageCveFeriado = null;
    BigDecimal eageFolioPadre = null;
    String eageFecFinEvento = null;
    BigDecimal eageDiaHabil = null;
    BigDecimal eagePeriodoEspecial = null;
    BigDecimal eageDiaOrdinario = null;
    String eageCveDiaHabnat = null;

    public FEventos() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageIdFolio(BigDecimal eageIdFolio) {
        this.eageIdFolio = eageIdFolio;
    }

    public BigDecimal getEageIdFolio() {
        return this.eageIdFolio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEageCveTipo(String eageCveTipo) {
        this.eageCveTipo = eageCveTipo;
    }

    public String getEageCveTipo() {
        return this.eageCveTipo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageFideicomiso(BigDecimal eageFideicomiso) {
        this.eageFideicomiso = eageFideicomiso;
    }

    public BigDecimal getEageFideicomiso() {
        return this.eageFideicomiso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageSubcuenta(BigDecimal eageSubcuenta) {
        this.eageSubcuenta = eageSubcuenta;
    }

    public BigDecimal getEageSubcuenta() {
        return this.eageSubcuenta;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEageFecEvento(String eageFecEvento) {
        this.eageFecEvento = eageFecEvento;
    }

    public String getEageFecEvento() {
        return this.eageFecEvento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEageDesEvento(String eageDesEvento) {
        this.eageDesEvento = eageDesEvento;
    }

    public String getEageDesEvento() {
        return this.eageDesEvento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEageTextEvento(String eageTextEvento) {
        this.eageTextEvento = eageTextEvento;
    }

    public String getEageTextEvento() {
        return this.eageTextEvento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEageAccionTomada(String eageAccionTomada) {
        this.eageAccionTomada = eageAccionTomada;
    }

    public String getEageAccionTomada() {
        return this.eageAccionTomada;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageProgamable(BigDecimal eageProgamable) {
        this.eageProgamable = eageProgamable;
    }

    public BigDecimal getEageProgamable() {
        return this.eageProgamable;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEagePeriodicidad(String eagePeriodicidad) {
        this.eagePeriodicidad = eagePeriodicidad;
    }

    public String getEagePeriodicidad() {
        return this.eagePeriodicidad;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageNumEventos(BigDecimal eageNumEventos) {
        this.eageNumEventos = eageNumEventos;
    }

    public BigDecimal getEageNumEventos() {
        return this.eageNumEventos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageNumUsuario(BigDecimal eageNumUsuario) {
        this.eageNumUsuario = eageNumUsuario;
    }

    public BigDecimal getEageNumUsuario() {
        return this.eageNumUsuario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEageCveStatus(String eageCveStatus) {
        this.eageCveStatus = eageCveStatus;
    }

    public String getEageCveStatus() {
        return this.eageCveStatus;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageNumUsuario2(BigDecimal eageNumUsuario2) {
        this.eageNumUsuario2 = eageNumUsuario2;
    }

    public BigDecimal getEageNumUsuario2() {
        return this.eageNumUsuario2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageNumUsuario3(BigDecimal eageNumUsuario3) {
        this.eageNumUsuario3 = eageNumUsuario3;
    }

    public BigDecimal getEageNumUsuario3() {
        return this.eageNumUsuario3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageNumUsuario4(BigDecimal eageNumUsuario4) {
        this.eageNumUsuario4 = eageNumUsuario4;
    }

    public BigDecimal getEageNumUsuario4() {
        return this.eageNumUsuario4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageNumUsuario5(BigDecimal eageNumUsuario5) {
        this.eageNumUsuario5 = eageNumUsuario5;
    }

    public BigDecimal getEageNumUsuario5() {
        return this.eageNumUsuario5;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEageFecModificacion(String eageFecModificacion) {
        this.eageFecModificacion = eageFecModificacion;
    }

    public String getEageFecModificacion() {
        return this.eageFecModificacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageUsuModificacion(BigDecimal eageUsuModificacion) {
        this.eageUsuModificacion = eageUsuModificacion;
    }

    public BigDecimal getEageUsuModificacion() {
        return this.eageUsuModificacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEagePrograma(BigDecimal eagePrograma) {
        this.eagePrograma = eagePrograma;
    }

    public BigDecimal getEagePrograma() {
        return this.eagePrograma;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageEmision(BigDecimal eageEmision) {
        this.eageEmision = eageEmision;
    }

    public BigDecimal getEageEmision() {
        return this.eageEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageSecEmision(BigDecimal eageSecEmision) {
        this.eageSecEmision = eageSecEmision;
    }

    public BigDecimal getEageSecEmision() {
        return this.eageSecEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEageCveFeriado(String eageCveFeriado) {
        this.eageCveFeriado = eageCveFeriado;
    }

    public String getEageCveFeriado() {
        return this.eageCveFeriado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageFolioPadre(BigDecimal eageFolioPadre) {
        this.eageFolioPadre = eageFolioPadre;
    }

    public BigDecimal getEageFolioPadre() {
        return this.eageFolioPadre;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEageFecFinEvento(String eageFecFinEvento) {
        this.eageFecFinEvento = eageFecFinEvento;
    }

    public String getEageFecFinEvento() {
        return this.eageFecFinEvento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageDiaHabil(BigDecimal eageDiaHabil) {
        this.eageDiaHabil = eageDiaHabil;
    }

    public BigDecimal getEageDiaHabil() {
        return this.eageDiaHabil;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEagePeriodoEspecial(BigDecimal eagePeriodoEspecial) {
        this.eagePeriodoEspecial = eagePeriodoEspecial;
    }

    public BigDecimal getEagePeriodoEspecial() {
        return this.eagePeriodoEspecial;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEageDiaOrdinario(BigDecimal eageDiaOrdinario) {
        this.eageDiaOrdinario = eageDiaOrdinario;
    }

    public BigDecimal getEageDiaOrdinario() {
        return this.eageDiaOrdinario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEageCveDiaHabnat(String eageCveDiaHabnat) {
        this.eageCveDiaHabnat = eageCveDiaHabnat;
    }

    public String getEageCveDiaHabnat() {
        return this.eageCveDiaHabnat;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EVENTOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEageIdFolio() != null && this.getEageIdFolio().longValue() == -999) {
            conditions += " AND EAGE_ID_FOLIO IS NULL";
        } else if (this.getEageIdFolio() != null) {
            conditions += " AND EAGE_ID_FOLIO = ?";
            values.add(this.getEageIdFolio());
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
        String sql = "SELECT * FROM F_EVENTOS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEageIdFolio() != null && this.getEageIdFolio().longValue() == -999) {
            conditions += " AND EAGE_ID_FOLIO IS NULL";
        } else if (this.getEageIdFolio() != null) {
            conditions += " AND EAGE_ID_FOLIO = ?";
            values.add(this.getEageIdFolio());
        }

        if (this.getEageCveTipo() != null && "null".equals(this.getEageCveTipo())) {
            conditions += " AND EAGE_CVE_TIPO IS NULL";
        } else if (this.getEageCveTipo() != null) {
            conditions += " AND EAGE_CVE_TIPO = ?";
            values.add(this.getEageCveTipo());
        }

        if (this.getEageFideicomiso() != null && this.getEageFideicomiso().longValue() == -999) {
            conditions += " AND EAGE_FIDEICOMISO IS NULL";
        } else if (this.getEageFideicomiso() != null) {
            conditions += " AND EAGE_FIDEICOMISO = ?";
            values.add(this.getEageFideicomiso());
        }

        if (this.getEageSubcuenta() != null && this.getEageSubcuenta().longValue() == -999) {
            conditions += " AND EAGE_SUBCUENTA IS NULL";
        } else if (this.getEageSubcuenta() != null) {
            conditions += " AND EAGE_SUBCUENTA = ?";
            values.add(this.getEageSubcuenta());
        }

        if (this.getEageFecEvento() != null && "null".equals(this.getEageFecEvento())) {
            conditions += " AND EAGE_FEC_EVENTO IS NULL";
        } else if (this.getEageFecEvento() != null) {
            conditions += " AND EAGE_FEC_EVENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEageFecEvento());
        }

        if (this.getEageDesEvento() != null && "null".equals(this.getEageDesEvento())) {
            conditions += " AND EAGE_DES_EVENTO IS NULL";
        } else if (this.getEageDesEvento() != null) {
            conditions += " AND EAGE_DES_EVENTO = ?";
            values.add(this.getEageDesEvento());
        }

        if (this.getEageTextEvento() != null && "null".equals(this.getEageTextEvento())) {
            conditions += " AND EAGE_TEXT_EVENTO IS NULL";
        } else if (this.getEageTextEvento() != null) {
            conditions += " AND EAGE_TEXT_EVENTO = ?";
            values.add(this.getEageTextEvento());
        }

        if (this.getEageAccionTomada() != null && "null".equals(this.getEageAccionTomada())) {
            conditions += " AND EAGE_ACCION_TOMADA IS NULL";
        } else if (this.getEageAccionTomada() != null) {
            conditions += " AND EAGE_ACCION_TOMADA = ?";
            values.add(this.getEageAccionTomada());
        }

        if (this.getEageProgamable() != null && this.getEageProgamable().longValue() == -999) {
            conditions += " AND EAGE_PROGAMABLE IS NULL";
        } else if (this.getEageProgamable() != null) {
            conditions += " AND EAGE_PROGAMABLE = ?";
            values.add(this.getEageProgamable());
        }

        if (this.getEagePeriodicidad() != null && "null".equals(this.getEagePeriodicidad())) {
            conditions += " AND EAGE_PERIODICIDAD IS NULL";
        } else if (this.getEagePeriodicidad() != null) {
            conditions += " AND EAGE_PERIODICIDAD = ?";
            values.add(this.getEagePeriodicidad());
        }

        if (this.getEageNumEventos() != null && this.getEageNumEventos().longValue() == -999) {
            conditions += " AND EAGE_NUM_EVENTOS IS NULL";
        } else if (this.getEageNumEventos() != null) {
            conditions += " AND EAGE_NUM_EVENTOS = ?";
            values.add(this.getEageNumEventos());
        }

        if (this.getEageNumUsuario() != null && this.getEageNumUsuario().longValue() == -999) {
            conditions += " AND EAGE_NUM_USUARIO IS NULL";
        } else if (this.getEageNumUsuario() != null) {
            conditions += " AND EAGE_NUM_USUARIO = ?";
            values.add(this.getEageNumUsuario());
        }

        if (this.getEageCveStatus() != null && "null".equals(this.getEageCveStatus())) {
            conditions += " AND EAGE_CVE_STATUS IS NULL";
        } else if (this.getEageCveStatus() != null) {
            conditions += " AND EAGE_CVE_STATUS = ?";
            values.add(this.getEageCveStatus());
        }

        if (this.getEageNumUsuario2() != null && this.getEageNumUsuario2().longValue() == -999) {
            conditions += " AND EAGE_NUM_USUARIO2 IS NULL";
        } else if (this.getEageNumUsuario2() != null) {
            conditions += " AND EAGE_NUM_USUARIO2 = ?";
            values.add(this.getEageNumUsuario2());
        }

        if (this.getEageNumUsuario3() != null && this.getEageNumUsuario3().longValue() == -999) {
            conditions += " AND EAGE_NUM_USUARIO3 IS NULL";
        } else if (this.getEageNumUsuario3() != null) {
            conditions += " AND EAGE_NUM_USUARIO3 = ?";
            values.add(this.getEageNumUsuario3());
        }

        if (this.getEageNumUsuario4() != null && this.getEageNumUsuario4().longValue() == -999) {
            conditions += " AND EAGE_NUM_USUARIO4 IS NULL";
        } else if (this.getEageNumUsuario4() != null) {
            conditions += " AND EAGE_NUM_USUARIO4 = ?";
            values.add(this.getEageNumUsuario4());
        }

        if (this.getEageNumUsuario5() != null && this.getEageNumUsuario5().longValue() == -999) {
            conditions += " AND EAGE_NUM_USUARIO5 IS NULL";
        } else if (this.getEageNumUsuario5() != null) {
            conditions += " AND EAGE_NUM_USUARIO5 = ?";
            values.add(this.getEageNumUsuario5());
        }

        if (this.getEageFecModificacion() != null && "null".equals(this.getEageFecModificacion())) {
            conditions += " AND EAGE_FEC_MODIFICACION IS NULL";
        } else if (this.getEageFecModificacion() != null) {
            conditions += " AND EAGE_FEC_MODIFICACION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEageFecModificacion());
        }

        if (this.getEageUsuModificacion() != null && this.getEageUsuModificacion().longValue() == -999) {
            conditions += " AND EAGE_USU_MODIFICACION IS NULL";
        } else if (this.getEageUsuModificacion() != null) {
            conditions += " AND EAGE_USU_MODIFICACION = ?";
            values.add(this.getEageUsuModificacion());
        }

        if (this.getEagePrograma() != null && this.getEagePrograma().longValue() == -999) {
            conditions += " AND EAGE_PROGRAMA IS NULL";
        } else if (this.getEagePrograma() != null) {
            conditions += " AND EAGE_PROGRAMA = ?";
            values.add(this.getEagePrograma());
        }

        if (this.getEageEmision() != null && this.getEageEmision().longValue() == -999) {
            conditions += " AND EAGE_EMISION IS NULL";
        } else if (this.getEageEmision() != null) {
            conditions += " AND EAGE_EMISION = ?";
            values.add(this.getEageEmision());
        }

        if (this.getEageSecEmision() != null && this.getEageSecEmision().longValue() == -999) {
            conditions += " AND EAGE_SEC_EMISION IS NULL";
        } else if (this.getEageSecEmision() != null) {
            conditions += " AND EAGE_SEC_EMISION = ?";
            values.add(this.getEageSecEmision());
        }

        if (this.getEageCveFeriado() != null && "null".equals(this.getEageCveFeriado())) {
            conditions += " AND EAGE_CVE_FERIADO IS NULL";
        } else if (this.getEageCveFeriado() != null) {
            conditions += " AND EAGE_CVE_FERIADO = ?";
            values.add(this.getEageCveFeriado());
        }

        if (this.getEageFolioPadre() != null && this.getEageFolioPadre().longValue() == -999) {
            conditions += " AND EAGE_FOLIO_PADRE IS NULL";
        } else if (this.getEageFolioPadre() != null) {
            conditions += " AND EAGE_FOLIO_PADRE = ?";
            values.add(this.getEageFolioPadre());
        }

        if (this.getEageFecFinEvento() != null && "null".equals(this.getEageFecFinEvento())) {
            conditions += " AND EAGE_FEC_FIN_EVENTO IS NULL";
        } else if (this.getEageFecFinEvento() != null) {
            conditions += " AND EAGE_FEC_FIN_EVENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEageFecFinEvento());
        }

        if (this.getEageDiaHabil() != null && this.getEageDiaHabil().longValue() == -999) {
            conditions += " AND EAGE_DIA_HABIL IS NULL";
        } else if (this.getEageDiaHabil() != null) {
            conditions += " AND EAGE_DIA_HABIL = ?";
            values.add(this.getEageDiaHabil());
        }

        if (this.getEagePeriodoEspecial() != null && this.getEagePeriodoEspecial().longValue() == -999) {
            conditions += " AND EAGE_PERIODO_ESPECIAL IS NULL";
        } else if (this.getEagePeriodoEspecial() != null) {
            conditions += " AND EAGE_PERIODO_ESPECIAL = ?";
            values.add(this.getEagePeriodoEspecial());
        }

        if (this.getEageDiaOrdinario() != null && this.getEageDiaOrdinario().longValue() == -999) {
            conditions += " AND EAGE_DIA_ORDINARIO IS NULL";
        } else if (this.getEageDiaOrdinario() != null) {
            conditions += " AND EAGE_DIA_ORDINARIO = ?";
            values.add(this.getEageDiaOrdinario());
        }

        if (this.getEageCveDiaHabnat() != null && "null".equals(this.getEageCveDiaHabnat())) {
            conditions += " AND EAGE_CVE_DIA_HABNAT IS NULL";
        } else if (this.getEageCveDiaHabnat() != null) {
            conditions += " AND EAGE_CVE_DIA_HABNAT = ?";
            values.add(this.getEageCveDiaHabnat());
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
        String sql = "UPDATE F_EVENTOS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EAGE_ID_FOLIO = ?";
        pkValues.add(this.getEageIdFolio());
        fields += " EAGE_CVE_TIPO = ?, ";
        values.add(this.getEageCveTipo());
        fields += " EAGE_FIDEICOMISO = ?, ";
        values.add(this.getEageFideicomiso());
        fields += " EAGE_SUBCUENTA = ?, ";
        values.add(this.getEageSubcuenta());
        fields += " EAGE_FEC_EVENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEageFecEvento());
        fields += " EAGE_DES_EVENTO = ?, ";
        values.add(this.getEageDesEvento());
        fields += " EAGE_TEXT_EVENTO = ?, ";
        values.add(this.getEageTextEvento());
        fields += " EAGE_ACCION_TOMADA = ?, ";
        values.add(this.getEageAccionTomada());
        fields += " EAGE_PROGAMABLE = ?, ";
        values.add(this.getEageProgamable());
        fields += " EAGE_PERIODICIDAD = ?, ";
        values.add(this.getEagePeriodicidad());
        fields += " EAGE_NUM_EVENTOS = ?, ";
        values.add(this.getEageNumEventos());
        fields += " EAGE_NUM_USUARIO = ?, ";
        values.add(this.getEageNumUsuario());
        fields += " EAGE_CVE_STATUS = ?, ";
        values.add(this.getEageCveStatus());
        fields += " EAGE_NUM_USUARIO2 = ?, ";
        values.add(this.getEageNumUsuario2());
        fields += " EAGE_NUM_USUARIO3 = ?, ";
        values.add(this.getEageNumUsuario3());
        fields += " EAGE_NUM_USUARIO4 = ?, ";
        values.add(this.getEageNumUsuario4());
        fields += " EAGE_NUM_USUARIO5 = ?, ";
        values.add(this.getEageNumUsuario5());
        fields += " EAGE_FEC_MODIFICACION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEageFecModificacion());
        fields += " EAGE_USU_MODIFICACION = ?, ";
        values.add(this.getEageUsuModificacion());
        fields += " EAGE_PROGRAMA = ?, ";
        values.add(this.getEagePrograma());
        fields += " EAGE_EMISION = ?, ";
        values.add(this.getEageEmision());
        fields += " EAGE_SEC_EMISION = ?, ";
        values.add(this.getEageSecEmision());
        fields += " EAGE_CVE_FERIADO = ?, ";
        values.add(this.getEageCveFeriado());
        fields += " EAGE_FOLIO_PADRE = ?, ";
        values.add(this.getEageFolioPadre());
        fields += " EAGE_FEC_FIN_EVENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEageFecFinEvento());
        fields += " EAGE_DIA_HABIL = ?, ";
        values.add(this.getEageDiaHabil());
        fields += " EAGE_PERIODO_ESPECIAL = ?, ";
        values.add(this.getEagePeriodoEspecial());
        fields += " EAGE_DIA_ORDINARIO = ?, ";
        values.add(this.getEageDiaOrdinario());
        fields += " EAGE_CVE_DIA_HABNAT = ?, ";
        values.add(this.getEageCveDiaHabnat());
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
        String sql = "INSERT INTO F_EVENTOS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EAGE_ID_FOLIO";
        fieldValues += ", ?";
        values.add(this.getEageIdFolio());

        fields += ", EAGE_CVE_TIPO";
        fieldValues += ", ?";
        values.add(this.getEageCveTipo());

        fields += ", EAGE_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEageFideicomiso());

        fields += ", EAGE_SUBCUENTA";
        fieldValues += ", ?";
        values.add(this.getEageSubcuenta());

        fields += ", EAGE_FEC_EVENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEageFecEvento());

        fields += ", EAGE_DES_EVENTO";
        fieldValues += ", ?";
        values.add(this.getEageDesEvento());

        fields += ", EAGE_TEXT_EVENTO";
        fieldValues += ", ?";
        values.add(this.getEageTextEvento());

        fields += ", EAGE_ACCION_TOMADA";
        fieldValues += ", ?";
        values.add(this.getEageAccionTomada());

        fields += ", EAGE_PROGAMABLE";
        fieldValues += ", ?";
        values.add(this.getEageProgamable());

        fields += ", EAGE_PERIODICIDAD";
        fieldValues += ", ?";
        values.add(this.getEagePeriodicidad());

        fields += ", EAGE_NUM_EVENTOS";
        fieldValues += ", ?";
        values.add(this.getEageNumEventos());

        fields += ", EAGE_NUM_USUARIO";
        fieldValues += ", ?";
        values.add(this.getEageNumUsuario());

        fields += ", EAGE_CVE_STATUS";
        fieldValues += ", ?";
        values.add(this.getEageCveStatus());

        fields += ", EAGE_NUM_USUARIO2";
        fieldValues += ", ?";
        values.add(this.getEageNumUsuario2());

        fields += ", EAGE_NUM_USUARIO3";
        fieldValues += ", ?";
        values.add(this.getEageNumUsuario3());

        fields += ", EAGE_NUM_USUARIO4";
        fieldValues += ", ?";
        values.add(this.getEageNumUsuario4());

        fields += ", EAGE_NUM_USUARIO5";
        fieldValues += ", ?";
        values.add(this.getEageNumUsuario5());

        fields += ", EAGE_FEC_MODIFICACION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEageFecModificacion());

        fields += ", EAGE_USU_MODIFICACION";
        fieldValues += ", ?";
        values.add(this.getEageUsuModificacion());

        fields += ", EAGE_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEagePrograma());

        fields += ", EAGE_EMISION";
        fieldValues += ", ?";
        values.add(this.getEageEmision());

        fields += ", EAGE_SEC_EMISION";
        fieldValues += ", ?";
        values.add(this.getEageSecEmision());

        fields += ", EAGE_CVE_FERIADO";
        fieldValues += ", ?";
        values.add(this.getEageCveFeriado());

        fields += ", EAGE_FOLIO_PADRE";
        fieldValues += ", ?";
        values.add(this.getEageFolioPadre());

        fields += ", EAGE_FEC_FIN_EVENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEageFecFinEvento());

        fields += ", EAGE_DIA_HABIL";
        fieldValues += ", ?";
        values.add(this.getEageDiaHabil());

        fields += ", EAGE_PERIODO_ESPECIAL";
        fieldValues += ", ?";
        values.add(this.getEagePeriodoEspecial());

        fields += ", EAGE_DIA_ORDINARIO";
        fieldValues += ", ?";
        values.add(this.getEageDiaOrdinario());

        fields += ", EAGE_CVE_DIA_HABNAT";
        fieldValues += ", ?";
        values.add(this.getEageCveDiaHabnat());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EVENTOS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EAGE_ID_FOLIO = ?";
        values.add(this.getEageIdFolio());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEventos instance = (FEventos) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEageIdFolio().equals(instance.getEageIdFolio()))
            equalObjects = false;
        if (equalObjects && !this.getEageCveTipo().equals(instance.getEageCveTipo()))
            equalObjects = false;
        if (equalObjects && !this.getEageFideicomiso().equals(instance.getEageFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEageSubcuenta().equals(instance.getEageSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getEageFecEvento().equals(instance.getEageFecEvento()))
            equalObjects = false;
        if (equalObjects && !this.getEageDesEvento().equals(instance.getEageDesEvento()))
            equalObjects = false;
        if (equalObjects && !this.getEageTextEvento().equals(instance.getEageTextEvento()))
            equalObjects = false;
        if (equalObjects && !this.getEageAccionTomada().equals(instance.getEageAccionTomada()))
            equalObjects = false;
        if (equalObjects && !this.getEageProgamable().equals(instance.getEageProgamable()))
            equalObjects = false;
        if (equalObjects && !this.getEagePeriodicidad().equals(instance.getEagePeriodicidad()))
            equalObjects = false;
        if (equalObjects && !this.getEageNumEventos().equals(instance.getEageNumEventos()))
            equalObjects = false;
        if (equalObjects && !this.getEageNumUsuario().equals(instance.getEageNumUsuario()))
            equalObjects = false;
        if (equalObjects && !this.getEageCveStatus().equals(instance.getEageCveStatus()))
            equalObjects = false;
        if (equalObjects && !this.getEageNumUsuario2().equals(instance.getEageNumUsuario2()))
            equalObjects = false;
        if (equalObjects && !this.getEageNumUsuario3().equals(instance.getEageNumUsuario3()))
            equalObjects = false;
        if (equalObjects && !this.getEageNumUsuario4().equals(instance.getEageNumUsuario4()))
            equalObjects = false;
        if (equalObjects && !this.getEageNumUsuario5().equals(instance.getEageNumUsuario5()))
            equalObjects = false;
        if (equalObjects && !this.getEageFecModificacion().equals(instance.getEageFecModificacion()))
            equalObjects = false;
        if (equalObjects && !this.getEageUsuModificacion().equals(instance.getEageUsuModificacion()))
            equalObjects = false;
        if (equalObjects && !this.getEagePrograma().equals(instance.getEagePrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEageEmision().equals(instance.getEageEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEageSecEmision().equals(instance.getEageSecEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEageCveFeriado().equals(instance.getEageCveFeriado()))
            equalObjects = false;
        if (equalObjects && !this.getEageFolioPadre().equals(instance.getEageFolioPadre()))
            equalObjects = false;
        if (equalObjects && !this.getEageFecFinEvento().equals(instance.getEageFecFinEvento()))
            equalObjects = false;
        if (equalObjects && !this.getEageDiaHabil().equals(instance.getEageDiaHabil()))
            equalObjects = false;
        if (equalObjects && !this.getEagePeriodoEspecial().equals(instance.getEagePeriodoEspecial()))
            equalObjects = false;
        if (equalObjects && !this.getEageDiaOrdinario().equals(instance.getEageDiaOrdinario()))
            equalObjects = false;
        if (equalObjects && !this.getEageCveDiaHabnat().equals(instance.getEageCveDiaHabnat()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEventos result = new FEventos();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEageIdFolio((BigDecimal) objectData.getData("EAGE_ID_FOLIO"));
        result.setEageCveTipo((String) objectData.getData("EAGE_CVE_TIPO"));
        result.setEageFideicomiso((BigDecimal) objectData.getData("EAGE_FIDEICOMISO"));
        result.setEageSubcuenta((BigDecimal) objectData.getData("EAGE_SUBCUENTA"));
        result.setEageFecEvento((String) objectData.getData("EAGE_FEC_EVENTO"));
        result.setEageDesEvento((String) objectData.getData("EAGE_DES_EVENTO"));
        result.setEageTextEvento((String) objectData.getData("EAGE_TEXT_EVENTO"));
        result.setEageAccionTomada((String) objectData.getData("EAGE_ACCION_TOMADA"));
        result.setEageProgamable((BigDecimal) objectData.getData("EAGE_PROGAMABLE"));
        result.setEagePeriodicidad((String) objectData.getData("EAGE_PERIODICIDAD"));
        result.setEageNumEventos((BigDecimal) objectData.getData("EAGE_NUM_EVENTOS"));
        result.setEageNumUsuario((BigDecimal) objectData.getData("EAGE_NUM_USUARIO"));
        result.setEageCveStatus((String) objectData.getData("EAGE_CVE_STATUS"));
        result.setEageNumUsuario2((BigDecimal) objectData.getData("EAGE_NUM_USUARIO2"));
        result.setEageNumUsuario3((BigDecimal) objectData.getData("EAGE_NUM_USUARIO3"));
        result.setEageNumUsuario4((BigDecimal) objectData.getData("EAGE_NUM_USUARIO4"));
        result.setEageNumUsuario5((BigDecimal) objectData.getData("EAGE_NUM_USUARIO5"));
        result.setEageFecModificacion((String) objectData.getData("EAGE_FEC_MODIFICACION"));
        result.setEageUsuModificacion((BigDecimal) objectData.getData("EAGE_USU_MODIFICACION"));
        result.setEagePrograma((BigDecimal) objectData.getData("EAGE_PROGRAMA"));
        result.setEageEmision((BigDecimal) objectData.getData("EAGE_EMISION"));
        result.setEageSecEmision((BigDecimal) objectData.getData("EAGE_SEC_EMISION"));
        result.setEageCveFeriado((String) objectData.getData("EAGE_CVE_FERIADO"));
        result.setEageFolioPadre((BigDecimal) objectData.getData("EAGE_FOLIO_PADRE"));
        result.setEageFecFinEvento((String) objectData.getData("EAGE_FEC_FIN_EVENTO"));
        result.setEageDiaHabil((BigDecimal) objectData.getData("EAGE_DIA_HABIL"));
        result.setEagePeriodoEspecial((BigDecimal) objectData.getData("EAGE_PERIODO_ESPECIAL"));
        result.setEageDiaOrdinario((BigDecimal) objectData.getData("EAGE_DIA_ORDINARIO"));
        result.setEageCveDiaHabnat((String) objectData.getData("EAGE_CVE_DIA_HABNAT"));

        return result;

    }

}
