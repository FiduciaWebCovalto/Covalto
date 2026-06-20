package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_OPETRACK_PK", columns = { "TRA_ID_VENTANA", "TRA_ID_FOLIO", "TRA_NUM_FISO" }, sequences = { "MANUAL" })
public class FOpetrack extends DomainObject {

    BigDecimal traIdVentana = null;
    BigDecimal traIdFolio = null;
    BigDecimal traNumFiso = null;
    String traIdPizarra = null;
    String traIdSerie = null;
    BigDecimal traIdCupon = null;
    BigDecimal traCveOperacion = null;
    BigDecimal traNumIntermediario = null;
    BigDecimal traNumAcreditado = null;
    String traFecOpera = null;
    String traFecLiq = null;
    BigDecimal traHoraRecepcion = null;
    String traFecConfirmacion = null;
    BigDecimal traNumUnidadesSol = null;
    BigDecimal traNumUnidadesAsi = null;
    BigDecimal traNumCanastas = null;
    BigDecimal traNumTracs = null;
    BigDecimal traImpEfectivo = null;
    BigDecimal traImpComisiones = null;
    BigDecimal traCotizaCert = null;
    BigDecimal traCotizaTrack = null;
    String traCtaIndevalCas = null;
    String traCtaIndevalCas1 = null;
    String traCtaIndevalInt = null;
    String traCtaIndevalInt1 = null;
    String traStatus = null;
    String traComentario = null;
    BigDecimal traUsuarioCrea = null;
    BigDecimal traUsuarioAuto = null;

    public FOpetrack() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraIdVentana(BigDecimal traIdVentana) {
        this.traIdVentana = traIdVentana;
    }

    public BigDecimal getTraIdVentana() {
        return this.traIdVentana;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraIdFolio(BigDecimal traIdFolio) {
        this.traIdFolio = traIdFolio;
    }

    public BigDecimal getTraIdFolio() {
        return this.traIdFolio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumFiso(BigDecimal traNumFiso) {
        this.traNumFiso = traNumFiso;
    }

    public BigDecimal getTraNumFiso() {
        return this.traNumFiso;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraIdPizarra(String traIdPizarra) {
        this.traIdPizarra = traIdPizarra;
    }

    public String getTraIdPizarra() {
        return this.traIdPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraIdSerie(String traIdSerie) {
        this.traIdSerie = traIdSerie;
    }

    public String getTraIdSerie() {
        return this.traIdSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraIdCupon(BigDecimal traIdCupon) {
        this.traIdCupon = traIdCupon;
    }

    public BigDecimal getTraIdCupon() {
        return this.traIdCupon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraCveOperacion(BigDecimal traCveOperacion) {
        this.traCveOperacion = traCveOperacion;
    }

    public BigDecimal getTraCveOperacion() {
        return this.traCveOperacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumIntermediario(BigDecimal traNumIntermediario) {
        this.traNumIntermediario = traNumIntermediario;
    }

    public BigDecimal getTraNumIntermediario() {
        return this.traNumIntermediario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumAcreditado(BigDecimal traNumAcreditado) {
        this.traNumAcreditado = traNumAcreditado;
    }

    public BigDecimal getTraNumAcreditado() {
        return this.traNumAcreditado;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setTraFecOpera(String traFecOpera) {
        this.traFecOpera = traFecOpera;
    }

    public String getTraFecOpera() {
        return this.traFecOpera;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setTraFecLiq(String traFecLiq) {
        this.traFecLiq = traFecLiq;
    }

    public String getTraFecLiq() {
        return this.traFecLiq;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setTraHoraRecepcion(BigDecimal traHoraRecepcion) {
        this.traHoraRecepcion = traHoraRecepcion;
    }

    public BigDecimal getTraHoraRecepcion() {
        return this.traHoraRecepcion;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setTraFecConfirmacion(String traFecConfirmacion) {
        this.traFecConfirmacion = traFecConfirmacion;
    }

    public String getTraFecConfirmacion() {
        return this.traFecConfirmacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumUnidadesSol(BigDecimal traNumUnidadesSol) {
        this.traNumUnidadesSol = traNumUnidadesSol;
    }

    public BigDecimal getTraNumUnidadesSol() {
        return this.traNumUnidadesSol;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumUnidadesAsi(BigDecimal traNumUnidadesAsi) {
        this.traNumUnidadesAsi = traNumUnidadesAsi;
    }

    public BigDecimal getTraNumUnidadesAsi() {
        return this.traNumUnidadesAsi;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumCanastas(BigDecimal traNumCanastas) {
        this.traNumCanastas = traNumCanastas;
    }

    public BigDecimal getTraNumCanastas() {
        return this.traNumCanastas;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumTracs(BigDecimal traNumTracs) {
        this.traNumTracs = traNumTracs;
    }

    public BigDecimal getTraNumTracs() {
        return this.traNumTracs;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTraImpEfectivo(BigDecimal traImpEfectivo) {
        this.traImpEfectivo = traImpEfectivo;
    }

    public BigDecimal getTraImpEfectivo() {
        return this.traImpEfectivo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTraImpComisiones(BigDecimal traImpComisiones) {
        this.traImpComisiones = traImpComisiones;
    }

    public BigDecimal getTraImpComisiones() {
        return this.traImpComisiones;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setTraCotizaCert(BigDecimal traCotizaCert) {
        this.traCotizaCert = traCotizaCert;
    }

    public BigDecimal getTraCotizaCert() {
        return this.traCotizaCert;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 6, javaClass = BigDecimal.class)
    public void setTraCotizaTrack(BigDecimal traCotizaTrack) {
        this.traCotizaTrack = traCotizaTrack;
    }

    public BigDecimal getTraCotizaTrack() {
        return this.traCotizaTrack;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraCtaIndevalCas(String traCtaIndevalCas) {
        this.traCtaIndevalCas = traCtaIndevalCas;
    }

    public String getTraCtaIndevalCas() {
        return this.traCtaIndevalCas;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraCtaIndevalCas1(String traCtaIndevalCas1) {
        this.traCtaIndevalCas1 = traCtaIndevalCas1;
    }

    public String getTraCtaIndevalCas1() {
        return this.traCtaIndevalCas1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraCtaIndevalInt(String traCtaIndevalInt) {
        this.traCtaIndevalInt = traCtaIndevalInt;
    }

    public String getTraCtaIndevalInt() {
        return this.traCtaIndevalInt;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraCtaIndevalInt1(String traCtaIndevalInt1) {
        this.traCtaIndevalInt1 = traCtaIndevalInt1;
    }

    public String getTraCtaIndevalInt1() {
        return this.traCtaIndevalInt1;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraStatus(String traStatus) {
        this.traStatus = traStatus;
    }

    public String getTraStatus() {
        return this.traStatus;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraComentario(String traComentario) {
        this.traComentario = traComentario;
    }

    public String getTraComentario() {
        return this.traComentario;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setTraUsuarioCrea(BigDecimal traUsuarioCrea) {
        this.traUsuarioCrea = traUsuarioCrea;
    }

    public BigDecimal getTraUsuarioCrea() {
        return this.traUsuarioCrea;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 0, scale = 0, javaClass = BigDecimal.class)
    public void setTraUsuarioAuto(BigDecimal traUsuarioAuto) {
        this.traUsuarioAuto = traUsuarioAuto;
    }

    public BigDecimal getTraUsuarioAuto() {
        return this.traUsuarioAuto;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_OPETRACK ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTraIdVentana() != null && this.getTraIdVentana().longValue() == -999) {
            conditions += " AND TRA_ID_VENTANA IS NULL";
        } else if (this.getTraIdVentana() != null) {
            conditions += " AND TRA_ID_VENTANA = ?";
            values.add(this.getTraIdVentana());
        }

        if (this.getTraIdFolio() != null && this.getTraIdFolio().longValue() == -999) {
            conditions += " AND TRA_ID_FOLIO IS NULL";
        } else if (this.getTraIdFolio() != null) {
            conditions += " AND TRA_ID_FOLIO = ?";
            values.add(this.getTraIdFolio());
        }

        if (this.getTraNumFiso() != null && this.getTraNumFiso().longValue() == -999) {
            conditions += " AND TRA_NUM_FISO IS NULL";
        } else if (this.getTraNumFiso() != null) {
            conditions += " AND TRA_NUM_FISO = ?";
            values.add(this.getTraNumFiso());
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
        String sql = "SELECT * FROM F_OPETRACK ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTraIdVentana() != null && this.getTraIdVentana().longValue() == -999) {
            conditions += " AND TRA_ID_VENTANA IS NULL";
        } else if (this.getTraIdVentana() != null) {
            conditions += " AND TRA_ID_VENTANA = ?";
            values.add(this.getTraIdVentana());
        }

        if (this.getTraIdFolio() != null && this.getTraIdFolio().longValue() == -999) {
            conditions += " AND TRA_ID_FOLIO IS NULL";
        } else if (this.getTraIdFolio() != null) {
            conditions += " AND TRA_ID_FOLIO = ?";
            values.add(this.getTraIdFolio());
        }

        if (this.getTraNumFiso() != null && this.getTraNumFiso().longValue() == -999) {
            conditions += " AND TRA_NUM_FISO IS NULL";
        } else if (this.getTraNumFiso() != null) {
            conditions += " AND TRA_NUM_FISO = ?";
            values.add(this.getTraNumFiso());
        }

        if (this.getTraIdPizarra() != null && "null".equals(this.getTraIdPizarra())) {
            conditions += " AND TRA_ID_PIZARRA IS NULL";
        } else if (this.getTraIdPizarra() != null) {
            conditions += " AND TRA_ID_PIZARRA = ?";
            values.add(this.getTraIdPizarra());
        }

        if (this.getTraIdSerie() != null && "null".equals(this.getTraIdSerie())) {
            conditions += " AND TRA_ID_SERIE IS NULL";
        } else if (this.getTraIdSerie() != null) {
            conditions += " AND TRA_ID_SERIE = ?";
            values.add(this.getTraIdSerie());
        }

        if (this.getTraIdCupon() != null && this.getTraIdCupon().longValue() == -999) {
            conditions += " AND TRA_ID_CUPON IS NULL";
        } else if (this.getTraIdCupon() != null) {
            conditions += " AND TRA_ID_CUPON = ?";
            values.add(this.getTraIdCupon());
        }

        if (this.getTraCveOperacion() != null && this.getTraCveOperacion().longValue() == -999) {
            conditions += " AND TRA_CVE_OPERACION IS NULL";
        } else if (this.getTraCveOperacion() != null) {
            conditions += " AND TRA_CVE_OPERACION = ?";
            values.add(this.getTraCveOperacion());
        }

        if (this.getTraNumIntermediario() != null && this.getTraNumIntermediario().longValue() == -999) {
            conditions += " AND TRA_NUM_INTERMEDIARIO IS NULL";
        } else if (this.getTraNumIntermediario() != null) {
            conditions += " AND TRA_NUM_INTERMEDIARIO = ?";
            values.add(this.getTraNumIntermediario());
        }

        if (this.getTraNumAcreditado() != null && this.getTraNumAcreditado().longValue() == -999) {
            conditions += " AND TRA_NUM_ACREDITADO IS NULL";
        } else if (this.getTraNumAcreditado() != null) {
            conditions += " AND TRA_NUM_ACREDITADO = ?";
            values.add(this.getTraNumAcreditado());
        }

        if (this.getTraFecOpera() != null && "null".equals(this.getTraFecOpera())) {
            conditions += " AND TRA_FEC_OPERA IS NULL";
        } else if (this.getTraFecOpera() != null) {
            conditions += " AND TRA_FEC_OPERA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getTraFecOpera());
        }

        if (this.getTraFecLiq() != null && "null".equals(this.getTraFecLiq())) {
            conditions += " AND TRA_FEC_LIQ IS NULL";
        } else if (this.getTraFecLiq() != null) {
            conditions += " AND TRA_FEC_LIQ = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getTraFecLiq());
        }

        if (this.getTraHoraRecepcion() != null && this.getTraHoraRecepcion().longValue() == -999) {
            conditions += " AND TRA_HORA_RECEPCION IS NULL";
        } else if (this.getTraHoraRecepcion() != null) {
            conditions += " AND TRA_HORA_RECEPCION = ?";
            values.add(this.getTraHoraRecepcion());
        }

        if (this.getTraFecConfirmacion() != null && "null".equals(this.getTraFecConfirmacion())) {
            conditions += " AND TRA_FEC_CONFIRMACION IS NULL";
        } else if (this.getTraFecConfirmacion() != null) {
            conditions += " AND TRA_FEC_CONFIRMACION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getTraFecConfirmacion());
        }

        if (this.getTraNumUnidadesSol() != null && this.getTraNumUnidadesSol().longValue() == -999) {
            conditions += " AND TRA_NUM_UNIDADES_SOL IS NULL";
        } else if (this.getTraNumUnidadesSol() != null) {
            conditions += " AND TRA_NUM_UNIDADES_SOL = ?";
            values.add(this.getTraNumUnidadesSol());
        }

        if (this.getTraNumUnidadesAsi() != null && this.getTraNumUnidadesAsi().longValue() == -999) {
            conditions += " AND TRA_NUM_UNIDADES_ASI IS NULL";
        } else if (this.getTraNumUnidadesAsi() != null) {
            conditions += " AND TRA_NUM_UNIDADES_ASI = ?";
            values.add(this.getTraNumUnidadesAsi());
        }

        if (this.getTraNumCanastas() != null && this.getTraNumCanastas().longValue() == -999) {
            conditions += " AND TRA_NUM_CANASTAS IS NULL";
        } else if (this.getTraNumCanastas() != null) {
            conditions += " AND TRA_NUM_CANASTAS = ?";
            values.add(this.getTraNumCanastas());
        }

        if (this.getTraNumTracs() != null && this.getTraNumTracs().longValue() == -999) {
            conditions += " AND TRA_NUM_TRACS IS NULL";
        } else if (this.getTraNumTracs() != null) {
            conditions += " AND TRA_NUM_TRACS = ?";
            values.add(this.getTraNumTracs());
        }

        if (this.getTraImpEfectivo() != null && this.getTraImpEfectivo().longValue() == -999) {
            conditions += " AND TRA_IMP_EFECTIVO IS NULL";
        } else if (this.getTraImpEfectivo() != null) {
            conditions += " AND TRA_IMP_EFECTIVO = ?";
            values.add(this.getTraImpEfectivo());
        }

        if (this.getTraImpComisiones() != null && this.getTraImpComisiones().longValue() == -999) {
            conditions += " AND TRA_IMP_COMISIONES IS NULL";
        } else if (this.getTraImpComisiones() != null) {
            conditions += " AND TRA_IMP_COMISIONES = ?";
            values.add(this.getTraImpComisiones());
        }

        if (this.getTraCotizaCert() != null && this.getTraCotizaCert().longValue() == -999) {
            conditions += " AND TRA_COTIZA_CERT IS NULL";
        } else if (this.getTraCotizaCert() != null) {
            conditions += " AND TRA_COTIZA_CERT = ?";
            values.add(this.getTraCotizaCert());
        }

        if (this.getTraCotizaTrack() != null && this.getTraCotizaTrack().longValue() == -999) {
            conditions += " AND TRA_COTIZA_TRACK IS NULL";
        } else if (this.getTraCotizaTrack() != null) {
            conditions += " AND TRA_COTIZA_TRACK = ?";
            values.add(this.getTraCotizaTrack());
        }

        if (this.getTraCtaIndevalCas() != null && "null".equals(this.getTraCtaIndevalCas())) {
            conditions += " AND TRA_CTA_INDEVAL_CAS IS NULL";
        } else if (this.getTraCtaIndevalCas() != null) {
            conditions += " AND TRA_CTA_INDEVAL_CAS = ?";
            values.add(this.getTraCtaIndevalCas());
        }

        if (this.getTraCtaIndevalCas1() != null && "null".equals(this.getTraCtaIndevalCas1())) {
            conditions += " AND TRA_CTA_INDEVAL_CAS1 IS NULL";
        } else if (this.getTraCtaIndevalCas1() != null) {
            conditions += " AND TRA_CTA_INDEVAL_CAS1 = ?";
            values.add(this.getTraCtaIndevalCas1());
        }

        if (this.getTraCtaIndevalInt() != null && "null".equals(this.getTraCtaIndevalInt())) {
            conditions += " AND TRA_CTA_INDEVAL_INT IS NULL";
        } else if (this.getTraCtaIndevalInt() != null) {
            conditions += " AND TRA_CTA_INDEVAL_INT = ?";
            values.add(this.getTraCtaIndevalInt());
        }

        if (this.getTraCtaIndevalInt1() != null && "null".equals(this.getTraCtaIndevalInt1())) {
            conditions += " AND TRA_CTA_INDEVAL_INT1 IS NULL";
        } else if (this.getTraCtaIndevalInt1() != null) {
            conditions += " AND TRA_CTA_INDEVAL_INT1 = ?";
            values.add(this.getTraCtaIndevalInt1());
        }

        if (this.getTraStatus() != null && "null".equals(this.getTraStatus())) {
            conditions += " AND TRA_STATUS IS NULL";
        } else if (this.getTraStatus() != null) {
            conditions += " AND TRA_STATUS = ?";
            values.add(this.getTraStatus());
        }

        if (this.getTraComentario() != null && "null".equals(this.getTraComentario())) {
            conditions += " AND TRA_COMENTARIO IS NULL";
        } else if (this.getTraComentario() != null) {
            conditions += " AND TRA_COMENTARIO = ?";
            values.add(this.getTraComentario());
        }

        if (this.getTraUsuarioCrea() != null && this.getTraUsuarioCrea().longValue() == -999) {
            conditions += " AND TRA_USUARIO_CREA IS NULL";
        } else if (this.getTraUsuarioCrea() != null) {
            conditions += " AND TRA_USUARIO_CREA = ?";
            values.add(this.getTraUsuarioCrea());
        }

        if (this.getTraUsuarioAuto() != null && this.getTraUsuarioAuto().longValue() == -999) {
            conditions += " AND TRA_USUARIO_AUTO IS NULL";
        } else if (this.getTraUsuarioAuto() != null) {
            conditions += " AND TRA_USUARIO_AUTO = ?";
            values.add(this.getTraUsuarioAuto());
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
        String sql = "UPDATE F_OPETRACK SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TRA_ID_VENTANA = ?";
        pkValues.add(this.getTraIdVentana());
        conditions += " AND TRA_ID_FOLIO = ?";
        pkValues.add(this.getTraIdFolio());
        conditions += " AND TRA_NUM_FISO = ?";
        pkValues.add(this.getTraNumFiso());
        fields += " TRA_ID_PIZARRA = ?, ";
        values.add(this.getTraIdPizarra());
        fields += " TRA_ID_SERIE = ?, ";
        values.add(this.getTraIdSerie());
        fields += " TRA_ID_CUPON = ?, ";
        values.add(this.getTraIdCupon());
        fields += " TRA_CVE_OPERACION = ?, ";
        values.add(this.getTraCveOperacion());
        fields += " TRA_NUM_INTERMEDIARIO = ?, ";
        values.add(this.getTraNumIntermediario());
        fields += " TRA_NUM_ACREDITADO = ?, ";
        values.add(this.getTraNumAcreditado());
        fields += " TRA_FEC_OPERA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getTraFecOpera());
        fields += " TRA_FEC_LIQ = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getTraFecLiq());
        fields += " TRA_HORA_RECEPCION = ?, ";
        values.add(this.getTraHoraRecepcion());
        fields += " TRA_FEC_CONFIRMACION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getTraFecConfirmacion());
        fields += " TRA_NUM_UNIDADES_SOL = ?, ";
        values.add(this.getTraNumUnidadesSol());
        fields += " TRA_NUM_UNIDADES_ASI = ?, ";
        values.add(this.getTraNumUnidadesAsi());
        fields += " TRA_NUM_CANASTAS = ?, ";
        values.add(this.getTraNumCanastas());
        fields += " TRA_NUM_TRACS = ?, ";
        values.add(this.getTraNumTracs());
        fields += " TRA_IMP_EFECTIVO = ?, ";
        values.add(this.getTraImpEfectivo());
        fields += " TRA_IMP_COMISIONES = ?, ";
        values.add(this.getTraImpComisiones());
        fields += " TRA_COTIZA_CERT = ?, ";
        values.add(this.getTraCotizaCert());
        fields += " TRA_COTIZA_TRACK = ?, ";
        values.add(this.getTraCotizaTrack());
        fields += " TRA_CTA_INDEVAL_CAS = ?, ";
        values.add(this.getTraCtaIndevalCas());
        fields += " TRA_CTA_INDEVAL_CAS1 = ?, ";
        values.add(this.getTraCtaIndevalCas1());
        fields += " TRA_CTA_INDEVAL_INT = ?, ";
        values.add(this.getTraCtaIndevalInt());
        fields += " TRA_CTA_INDEVAL_INT1 = ?, ";
        values.add(this.getTraCtaIndevalInt1());
        fields += " TRA_STATUS = ?, ";
        values.add(this.getTraStatus());
        fields += " TRA_COMENTARIO = ?, ";
        values.add(this.getTraComentario());
        fields += " TRA_USUARIO_CREA = ?, ";
        values.add(this.getTraUsuarioCrea());
        fields += " TRA_USUARIO_AUTO = ?, ";
        values.add(this.getTraUsuarioAuto());
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
        String sql = "INSERT INTO F_OPETRACK ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TRA_ID_VENTANA";
        fieldValues += ", ?";
        values.add(this.getTraIdVentana());

        fields += ", TRA_ID_FOLIO";
        fieldValues += ", ?";
        values.add(this.getTraIdFolio());

        fields += ", TRA_NUM_FISO";
        fieldValues += ", ?";
        values.add(this.getTraNumFiso());

        fields += ", TRA_ID_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getTraIdPizarra());

        fields += ", TRA_ID_SERIE";
        fieldValues += ", ?";
        values.add(this.getTraIdSerie());

        fields += ", TRA_ID_CUPON";
        fieldValues += ", ?";
        values.add(this.getTraIdCupon());

        fields += ", TRA_CVE_OPERACION";
        fieldValues += ", ?";
        values.add(this.getTraCveOperacion());

        fields += ", TRA_NUM_INTERMEDIARIO";
        fieldValues += ", ?";
        values.add(this.getTraNumIntermediario());

        fields += ", TRA_NUM_ACREDITADO";
        fieldValues += ", ?";
        values.add(this.getTraNumAcreditado());

        fields += ", TRA_FEC_OPERA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getTraFecOpera());

        fields += ", TRA_FEC_LIQ";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getTraFecLiq());

        fields += ", TRA_HORA_RECEPCION";
        fieldValues += ", ?";
        values.add(this.getTraHoraRecepcion());

        fields += ", TRA_FEC_CONFIRMACION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getTraFecConfirmacion());

        fields += ", TRA_NUM_UNIDADES_SOL";
        fieldValues += ", ?";
        values.add(this.getTraNumUnidadesSol());

        fields += ", TRA_NUM_UNIDADES_ASI";
        fieldValues += ", ?";
        values.add(this.getTraNumUnidadesAsi());

        fields += ", TRA_NUM_CANASTAS";
        fieldValues += ", ?";
        values.add(this.getTraNumCanastas());

        fields += ", TRA_NUM_TRACS";
        fieldValues += ", ?";
        values.add(this.getTraNumTracs());

        fields += ", TRA_IMP_EFECTIVO";
        fieldValues += ", ?";
        values.add(this.getTraImpEfectivo());

        fields += ", TRA_IMP_COMISIONES";
        fieldValues += ", ?";
        values.add(this.getTraImpComisiones());

        fields += ", TRA_COTIZA_CERT";
        fieldValues += ", ?";
        values.add(this.getTraCotizaCert());

        fields += ", TRA_COTIZA_TRACK";
        fieldValues += ", ?";
        values.add(this.getTraCotizaTrack());

        fields += ", TRA_CTA_INDEVAL_CAS";
        fieldValues += ", ?";
        values.add(this.getTraCtaIndevalCas());

        fields += ", TRA_CTA_INDEVAL_CAS1";
        fieldValues += ", ?";
        values.add(this.getTraCtaIndevalCas1());

        fields += ", TRA_CTA_INDEVAL_INT";
        fieldValues += ", ?";
        values.add(this.getTraCtaIndevalInt());

        fields += ", TRA_CTA_INDEVAL_INT1";
        fieldValues += ", ?";
        values.add(this.getTraCtaIndevalInt1());

        fields += ", TRA_STATUS";
        fieldValues += ", ?";
        values.add(this.getTraStatus());

        fields += ", TRA_COMENTARIO";
        fieldValues += ", ?";
        values.add(this.getTraComentario());

        fields += ", TRA_USUARIO_CREA";
        fieldValues += ", ?";
        values.add(this.getTraUsuarioCrea());

        fields += ", TRA_USUARIO_AUTO";
        fieldValues += ", ?";
        values.add(this.getTraUsuarioAuto());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_OPETRACK WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TRA_ID_VENTANA = ?";
        values.add(this.getTraIdVentana());
        conditions += " AND TRA_ID_FOLIO = ?";
        values.add(this.getTraIdFolio());
        conditions += " AND TRA_NUM_FISO = ?";
        values.add(this.getTraNumFiso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FOpetrack instance = (FOpetrack) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTraIdVentana().equals(instance.getTraIdVentana()))
            equalObjects = false;
        if (equalObjects && !this.getTraIdFolio().equals(instance.getTraIdFolio()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumFiso().equals(instance.getTraNumFiso()))
            equalObjects = false;
        if (equalObjects && !this.getTraIdPizarra().equals(instance.getTraIdPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getTraIdSerie().equals(instance.getTraIdSerie()))
            equalObjects = false;
        if (equalObjects && !this.getTraIdCupon().equals(instance.getTraIdCupon()))
            equalObjects = false;
        if (equalObjects && !this.getTraCveOperacion().equals(instance.getTraCveOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumIntermediario().equals(instance.getTraNumIntermediario()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumAcreditado().equals(instance.getTraNumAcreditado()))
            equalObjects = false;
        if (equalObjects && !this.getTraFecOpera().equals(instance.getTraFecOpera()))
            equalObjects = false;
        if (equalObjects && !this.getTraFecLiq().equals(instance.getTraFecLiq()))
            equalObjects = false;
        if (equalObjects && !this.getTraHoraRecepcion().equals(instance.getTraHoraRecepcion()))
            equalObjects = false;
        if (equalObjects && !this.getTraFecConfirmacion().equals(instance.getTraFecConfirmacion()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumUnidadesSol().equals(instance.getTraNumUnidadesSol()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumUnidadesAsi().equals(instance.getTraNumUnidadesAsi()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumCanastas().equals(instance.getTraNumCanastas()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumTracs().equals(instance.getTraNumTracs()))
            equalObjects = false;
        if (equalObjects && !this.getTraImpEfectivo().equals(instance.getTraImpEfectivo()))
            equalObjects = false;
        if (equalObjects && !this.getTraImpComisiones().equals(instance.getTraImpComisiones()))
            equalObjects = false;
        if (equalObjects && !this.getTraCotizaCert().equals(instance.getTraCotizaCert()))
            equalObjects = false;
        if (equalObjects && !this.getTraCotizaTrack().equals(instance.getTraCotizaTrack()))
            equalObjects = false;
        if (equalObjects && !this.getTraCtaIndevalCas().equals(instance.getTraCtaIndevalCas()))
            equalObjects = false;
        if (equalObjects && !this.getTraCtaIndevalCas1().equals(instance.getTraCtaIndevalCas1()))
            equalObjects = false;
        if (equalObjects && !this.getTraCtaIndevalInt().equals(instance.getTraCtaIndevalInt()))
            equalObjects = false;
        if (equalObjects && !this.getTraCtaIndevalInt1().equals(instance.getTraCtaIndevalInt1()))
            equalObjects = false;
        if (equalObjects && !this.getTraStatus().equals(instance.getTraStatus()))
            equalObjects = false;
        if (equalObjects && !this.getTraComentario().equals(instance.getTraComentario()))
            equalObjects = false;
        if (equalObjects && !this.getTraUsuarioCrea().equals(instance.getTraUsuarioCrea()))
            equalObjects = false;
        if (equalObjects && !this.getTraUsuarioAuto().equals(instance.getTraUsuarioAuto()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FOpetrack result = new FOpetrack();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTraIdVentana((BigDecimal) objectData.getData("TRA_ID_VENTANA"));
        result.setTraIdFolio((BigDecimal) objectData.getData("TRA_ID_FOLIO"));
        result.setTraNumFiso((BigDecimal) objectData.getData("TRA_NUM_FISO"));
        result.setTraIdPizarra((String) objectData.getData("TRA_ID_PIZARRA"));
        result.setTraIdSerie((String) objectData.getData("TRA_ID_SERIE"));
        result.setTraIdCupon((BigDecimal) objectData.getData("TRA_ID_CUPON"));
        result.setTraCveOperacion((BigDecimal) objectData.getData("TRA_CVE_OPERACION"));
        result.setTraNumIntermediario((BigDecimal) objectData.getData("TRA_NUM_INTERMEDIARIO"));
        result.setTraNumAcreditado((BigDecimal) objectData.getData("TRA_NUM_ACREDITADO"));
        result.setTraFecOpera((String) objectData.getData("TRA_FEC_OPERA"));
        result.setTraFecLiq((String) objectData.getData("TRA_FEC_LIQ"));
        result.setTraHoraRecepcion((BigDecimal) objectData.getData("TRA_HORA_RECEPCION"));
        result.setTraFecConfirmacion((String) objectData.getData("TRA_FEC_CONFIRMACION"));
        result.setTraNumUnidadesSol((BigDecimal) objectData.getData("TRA_NUM_UNIDADES_SOL"));
        result.setTraNumUnidadesAsi((BigDecimal) objectData.getData("TRA_NUM_UNIDADES_ASI"));
        result.setTraNumCanastas((BigDecimal) objectData.getData("TRA_NUM_CANASTAS"));
        result.setTraNumTracs((BigDecimal) objectData.getData("TRA_NUM_TRACS"));
        result.setTraImpEfectivo((BigDecimal) objectData.getData("TRA_IMP_EFECTIVO"));
        result.setTraImpComisiones((BigDecimal) objectData.getData("TRA_IMP_COMISIONES"));
        result.setTraCotizaCert((BigDecimal) objectData.getData("TRA_COTIZA_CERT"));
        result.setTraCotizaTrack((BigDecimal) objectData.getData("TRA_COTIZA_TRACK"));
        result.setTraCtaIndevalCas((String) objectData.getData("TRA_CTA_INDEVAL_CAS"));
        result.setTraCtaIndevalCas1((String) objectData.getData("TRA_CTA_INDEVAL_CAS1"));
        result.setTraCtaIndevalInt((String) objectData.getData("TRA_CTA_INDEVAL_INT"));
        result.setTraCtaIndevalInt1((String) objectData.getData("TRA_CTA_INDEVAL_INT1"));
        result.setTraStatus((String) objectData.getData("TRA_STATUS"));
        result.setTraComentario((String) objectData.getData("TRA_COMENTARIO"));
        result.setTraUsuarioCrea((BigDecimal) objectData.getData("TRA_USUARIO_CREA"));
        result.setTraUsuarioAuto((BigDecimal) objectData.getData("TRA_USUARIO_AUTO"));

        return result;

    }

}
