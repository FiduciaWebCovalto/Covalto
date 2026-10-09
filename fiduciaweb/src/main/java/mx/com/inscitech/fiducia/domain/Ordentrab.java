package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "ORDENTRAB_PK", columns = { "OTR_OTPRINC", "OTR_TURNO", "OTR_NUM_SOLICITUD" }, sequences = { "MANUAL" })
public class Ordentrab extends DomainObject {

    String otrOtprinc = null;
    String otrTurno = null;
    String otrNumSolicitud = null;
    BigDecimal otrNumGco = null;
    String otrConsecAnual = null;
    BigDecimal otrIdCliente = null;
    String otrNomPropie = null;
    String otrObservacion = null;
    String otrPromovidoPor = null;
    String otrFecRecepcion = null;
    String otrFecAvaluo = null;
    String otrFecVigencia = null;
    String otrCveMultiple = null;
    String otrObjetoSolic = null;
    String otrTipoAvaluo = null;
    String otrTipoProposito = null;
    String otrTipoServicio = null;
    String otrTipoBien = null;
    String otrClasifBien = null;
    String otrCalle = null;
    String otrNumero = null;
    String otrLote = null;
    String otrManzana = null;
    String otrCp = null;
    String otrColonia = null;
    String otrPoblacion = null;
    String otrEstado = null;
    String otrOtraRefer = null;
    String otrEntreCalle = null;
    String otrYCalle = null;
    String otrCadenamiento = null;
    String otrMotivoCancel = null;
    String otrFechaCancel = null;
    String otrNomCancela = null;
    String otrNomRevision = null;
    String otrFecRevision = null;
    String otrNomFormaliza = null;
    String otrFecFormaliza = null;
    String otrNomCertifica = null;
    String otrFecCertifica = null;
    BigDecimal otrAnoAltaReg = null;
    BigDecimal otrMesAltaReg = null;
    BigDecimal otrDiaAltaReg = null;
    BigDecimal otrAnoUltMod = null;
    BigDecimal otrMesUltMod = null;
    BigDecimal otrDiaUltMod = null;
    String otrCveStAvaluo = null;
    String otrDescBien = null;

    public Ordentrab() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrOtprinc(String otrOtprinc) {
        this.otrOtprinc = otrOtprinc;
    }

    public String getOtrOtprinc() {
        return this.otrOtprinc;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrTurno(String otrTurno) {
        this.otrTurno = otrTurno;
    }

    public String getOtrTurno() {
        return this.otrTurno;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrNumSolicitud(String otrNumSolicitud) {
        this.otrNumSolicitud = otrNumSolicitud;
    }

    public String getOtrNumSolicitud() {
        return this.otrNumSolicitud;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 7, scale = 0, javaClass = BigDecimal.class)
    public void setOtrNumGco(BigDecimal otrNumGco) {
        this.otrNumGco = otrNumGco;
    }

    public BigDecimal getOtrNumGco() {
        return this.otrNumGco;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrConsecAnual(String otrConsecAnual) {
        this.otrConsecAnual = otrConsecAnual;
    }

    public String getOtrConsecAnual() {
        return this.otrConsecAnual;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOtrIdCliente(BigDecimal otrIdCliente) {
        this.otrIdCliente = otrIdCliente;
    }

    public BigDecimal getOtrIdCliente() {
        return this.otrIdCliente;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrNomPropie(String otrNomPropie) {
        this.otrNomPropie = otrNomPropie;
    }

    public String getOtrNomPropie() {
        return this.otrNomPropie;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrObservacion(String otrObservacion) {
        this.otrObservacion = otrObservacion;
    }

    public String getOtrObservacion() {
        return this.otrObservacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrPromovidoPor(String otrPromovidoPor) {
        this.otrPromovidoPor = otrPromovidoPor;
    }

    public String getOtrPromovidoPor() {
        return this.otrPromovidoPor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrFecRecepcion(String otrFecRecepcion) {
        this.otrFecRecepcion = otrFecRecepcion;
    }

    public String getOtrFecRecepcion() {
        return this.otrFecRecepcion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrFecAvaluo(String otrFecAvaluo) {
        this.otrFecAvaluo = otrFecAvaluo;
    }

    public String getOtrFecAvaluo() {
        return this.otrFecAvaluo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrFecVigencia(String otrFecVigencia) {
        this.otrFecVigencia = otrFecVigencia;
    }

    public String getOtrFecVigencia() {
        return this.otrFecVigencia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrCveMultiple(String otrCveMultiple) {
        this.otrCveMultiple = otrCveMultiple;
    }

    public String getOtrCveMultiple() {
        return this.otrCveMultiple;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrObjetoSolic(String otrObjetoSolic) {
        this.otrObjetoSolic = otrObjetoSolic;
    }

    public String getOtrObjetoSolic() {
        return this.otrObjetoSolic;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrTipoAvaluo(String otrTipoAvaluo) {
        this.otrTipoAvaluo = otrTipoAvaluo;
    }

    public String getOtrTipoAvaluo() {
        return this.otrTipoAvaluo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrTipoProposito(String otrTipoProposito) {
        this.otrTipoProposito = otrTipoProposito;
    }

    public String getOtrTipoProposito() {
        return this.otrTipoProposito;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrTipoServicio(String otrTipoServicio) {
        this.otrTipoServicio = otrTipoServicio;
    }

    public String getOtrTipoServicio() {
        return this.otrTipoServicio;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrTipoBien(String otrTipoBien) {
        this.otrTipoBien = otrTipoBien;
    }

    public String getOtrTipoBien() {
        return this.otrTipoBien;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrClasifBien(String otrClasifBien) {
        this.otrClasifBien = otrClasifBien;
    }

    public String getOtrClasifBien() {
        return this.otrClasifBien;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrCalle(String otrCalle) {
        this.otrCalle = otrCalle;
    }

    public String getOtrCalle() {
        return this.otrCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrNumero(String otrNumero) {
        this.otrNumero = otrNumero;
    }

    public String getOtrNumero() {
        return this.otrNumero;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrLote(String otrLote) {
        this.otrLote = otrLote;
    }

    public String getOtrLote() {
        return this.otrLote;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrManzana(String otrManzana) {
        this.otrManzana = otrManzana;
    }

    public String getOtrManzana() {
        return this.otrManzana;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrCp(String otrCp) {
        this.otrCp = otrCp;
    }

    public String getOtrCp() {
        return this.otrCp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrColonia(String otrColonia) {
        this.otrColonia = otrColonia;
    }

    public String getOtrColonia() {
        return this.otrColonia;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrPoblacion(String otrPoblacion) {
        this.otrPoblacion = otrPoblacion;
    }

    public String getOtrPoblacion() {
        return this.otrPoblacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrEstado(String otrEstado) {
        this.otrEstado = otrEstado;
    }

    public String getOtrEstado() {
        return this.otrEstado;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrOtraRefer(String otrOtraRefer) {
        this.otrOtraRefer = otrOtraRefer;
    }

    public String getOtrOtraRefer() {
        return this.otrOtraRefer;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrEntreCalle(String otrEntreCalle) {
        this.otrEntreCalle = otrEntreCalle;
    }

    public String getOtrEntreCalle() {
        return this.otrEntreCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrYCalle(String otrYCalle) {
        this.otrYCalle = otrYCalle;
    }

    public String getOtrYCalle() {
        return this.otrYCalle;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrCadenamiento(String otrCadenamiento) {
        this.otrCadenamiento = otrCadenamiento;
    }

    public String getOtrCadenamiento() {
        return this.otrCadenamiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrMotivoCancel(String otrMotivoCancel) {
        this.otrMotivoCancel = otrMotivoCancel;
    }

    public String getOtrMotivoCancel() {
        return this.otrMotivoCancel;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrFechaCancel(String otrFechaCancel) {
        this.otrFechaCancel = otrFechaCancel;
    }

    public String getOtrFechaCancel() {
        return this.otrFechaCancel;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrNomCancela(String otrNomCancela) {
        this.otrNomCancela = otrNomCancela;
    }

    public String getOtrNomCancela() {
        return this.otrNomCancela;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrNomRevision(String otrNomRevision) {
        this.otrNomRevision = otrNomRevision;
    }

    public String getOtrNomRevision() {
        return this.otrNomRevision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrFecRevision(String otrFecRevision) {
        this.otrFecRevision = otrFecRevision;
    }

    public String getOtrFecRevision() {
        return this.otrFecRevision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrNomFormaliza(String otrNomFormaliza) {
        this.otrNomFormaliza = otrNomFormaliza;
    }

    public String getOtrNomFormaliza() {
        return this.otrNomFormaliza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrFecFormaliza(String otrFecFormaliza) {
        this.otrFecFormaliza = otrFecFormaliza;
    }

    public String getOtrFecFormaliza() {
        return this.otrFecFormaliza;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrNomCertifica(String otrNomCertifica) {
        this.otrNomCertifica = otrNomCertifica;
    }

    public String getOtrNomCertifica() {
        return this.otrNomCertifica;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrFecCertifica(String otrFecCertifica) {
        this.otrFecCertifica = otrFecCertifica;
    }

    public String getOtrFecCertifica() {
        return this.otrFecCertifica;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOtrAnoAltaReg(BigDecimal otrAnoAltaReg) {
        this.otrAnoAltaReg = otrAnoAltaReg;
    }

    public BigDecimal getOtrAnoAltaReg() {
        return this.otrAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtrMesAltaReg(BigDecimal otrMesAltaReg) {
        this.otrMesAltaReg = otrMesAltaReg;
    }

    public BigDecimal getOtrMesAltaReg() {
        return this.otrMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtrDiaAltaReg(BigDecimal otrDiaAltaReg) {
        this.otrDiaAltaReg = otrDiaAltaReg;
    }

    public BigDecimal getOtrDiaAltaReg() {
        return this.otrDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOtrAnoUltMod(BigDecimal otrAnoUltMod) {
        this.otrAnoUltMod = otrAnoUltMod;
    }

    public BigDecimal getOtrAnoUltMod() {
        return this.otrAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtrMesUltMod(BigDecimal otrMesUltMod) {
        this.otrMesUltMod = otrMesUltMod;
    }

    public BigDecimal getOtrMesUltMod() {
        return this.otrMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOtrDiaUltMod(BigDecimal otrDiaUltMod) {
        this.otrDiaUltMod = otrDiaUltMod;
    }

    public BigDecimal getOtrDiaUltMod() {
        return this.otrDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrCveStAvaluo(String otrCveStAvaluo) {
        this.otrCveStAvaluo = otrCveStAvaluo;
    }

    public String getOtrCveStAvaluo() {
        return this.otrCveStAvaluo;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setOtrDescBien(String otrDescBien) {
        this.otrDescBien = otrDescBien;
    }

    public String getOtrDescBien() {
        return this.otrDescBien;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ORDENTRAB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOtrOtprinc() != null && "null".equals(this.getOtrOtprinc())) {
            conditions += " AND OTR_OTPRINC IS NULL";
        } else if (this.getOtrOtprinc() != null) {
            conditions += " AND OTR_OTPRINC = ?";
            values.add(this.getOtrOtprinc());
        }

        if (this.getOtrTurno() != null && "null".equals(this.getOtrTurno())) {
            conditions += " AND OTR_TURNO IS NULL";
        } else if (this.getOtrTurno() != null) {
            conditions += " AND OTR_TURNO = ?";
            values.add(this.getOtrTurno());
        }

        if (this.getOtrNumSolicitud() != null && "null".equals(this.getOtrNumSolicitud())) {
            conditions += " AND OTR_NUM_SOLICITUD IS NULL";
        } else if (this.getOtrNumSolicitud() != null) {
            conditions += " AND OTR_NUM_SOLICITUD = ?";
            values.add(this.getOtrNumSolicitud());
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
        String sql = "SELECT * FROM ORDENTRAB ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOtrOtprinc() != null && "null".equals(this.getOtrOtprinc())) {
            conditions += " AND OTR_OTPRINC IS NULL";
        } else if (this.getOtrOtprinc() != null) {
            conditions += " AND OTR_OTPRINC = ?";
            values.add(this.getOtrOtprinc());
        }

        if (this.getOtrTurno() != null && "null".equals(this.getOtrTurno())) {
            conditions += " AND OTR_TURNO IS NULL";
        } else if (this.getOtrTurno() != null) {
            conditions += " AND OTR_TURNO = ?";
            values.add(this.getOtrTurno());
        }

        if (this.getOtrNumSolicitud() != null && "null".equals(this.getOtrNumSolicitud())) {
            conditions += " AND OTR_NUM_SOLICITUD IS NULL";
        } else if (this.getOtrNumSolicitud() != null) {
            conditions += " AND OTR_NUM_SOLICITUD = ?";
            values.add(this.getOtrNumSolicitud());
        }

        if (this.getOtrNumGco() != null && this.getOtrNumGco().longValue() == -999) {
            conditions += " AND OTR_NUM_GCO IS NULL";
        } else if (this.getOtrNumGco() != null) {
            conditions += " AND OTR_NUM_GCO = ?";
            values.add(this.getOtrNumGco());
        }

        if (this.getOtrConsecAnual() != null && "null".equals(this.getOtrConsecAnual())) {
            conditions += " AND OTR_CONSEC_ANUAL IS NULL";
        } else if (this.getOtrConsecAnual() != null) {
            conditions += " AND OTR_CONSEC_ANUAL = ?";
            values.add(this.getOtrConsecAnual());
        }

        if (this.getOtrIdCliente() != null && this.getOtrIdCliente().longValue() == -999) {
            conditions += " AND OTR_ID_CLIENTE IS NULL";
        } else if (this.getOtrIdCliente() != null) {
            conditions += " AND OTR_ID_CLIENTE = ?";
            values.add(this.getOtrIdCliente());
        }

        if (this.getOtrNomPropie() != null && "null".equals(this.getOtrNomPropie())) {
            conditions += " AND OTR_NOM_PROPIE IS NULL";
        } else if (this.getOtrNomPropie() != null) {
            conditions += " AND OTR_NOM_PROPIE = ?";
            values.add(this.getOtrNomPropie());
        }

        if (this.getOtrObservacion() != null && "null".equals(this.getOtrObservacion())) {
            conditions += " AND OTR_OBSERVACION IS NULL";
        } else if (this.getOtrObservacion() != null) {
            conditions += " AND OTR_OBSERVACION = ?";
            values.add(this.getOtrObservacion());
        }

        if (this.getOtrPromovidoPor() != null && "null".equals(this.getOtrPromovidoPor())) {
            conditions += " AND OTR_PROMOVIDO_POR IS NULL";
        } else if (this.getOtrPromovidoPor() != null) {
            conditions += " AND OTR_PROMOVIDO_POR = ?";
            values.add(this.getOtrPromovidoPor());
        }

        if (this.getOtrFecRecepcion() != null && "null".equals(this.getOtrFecRecepcion())) {
            conditions += " AND OTR_FEC_RECEPCION IS NULL";
        } else if (this.getOtrFecRecepcion() != null) {
            conditions += " AND OTR_FEC_RECEPCION = ?";
            values.add(this.getOtrFecRecepcion());
        }

        if (this.getOtrFecAvaluo() != null && "null".equals(this.getOtrFecAvaluo())) {
            conditions += " AND OTR_FEC_AVALUO IS NULL";
        } else if (this.getOtrFecAvaluo() != null) {
            conditions += " AND OTR_FEC_AVALUO = ?";
            values.add(this.getOtrFecAvaluo());
        }

        if (this.getOtrFecVigencia() != null && "null".equals(this.getOtrFecVigencia())) {
            conditions += " AND OTR_FEC_VIGENCIA IS NULL";
        } else if (this.getOtrFecVigencia() != null) {
            conditions += " AND OTR_FEC_VIGENCIA = ?";
            values.add(this.getOtrFecVigencia());
        }

        if (this.getOtrCveMultiple() != null && "null".equals(this.getOtrCveMultiple())) {
            conditions += " AND OTR_CVE_MULTIPLE IS NULL";
        } else if (this.getOtrCveMultiple() != null) {
            conditions += " AND OTR_CVE_MULTIPLE = ?";
            values.add(this.getOtrCveMultiple());
        }

        if (this.getOtrObjetoSolic() != null && "null".equals(this.getOtrObjetoSolic())) {
            conditions += " AND OTR_OBJETO_SOLIC IS NULL";
        } else if (this.getOtrObjetoSolic() != null) {
            conditions += " AND OTR_OBJETO_SOLIC = ?";
            values.add(this.getOtrObjetoSolic());
        }

        if (this.getOtrTipoAvaluo() != null && "null".equals(this.getOtrTipoAvaluo())) {
            conditions += " AND OTR_TIPO_AVALUO IS NULL";
        } else if (this.getOtrTipoAvaluo() != null) {
            conditions += " AND OTR_TIPO_AVALUO = ?";
            values.add(this.getOtrTipoAvaluo());
        }

        if (this.getOtrTipoProposito() != null && "null".equals(this.getOtrTipoProposito())) {
            conditions += " AND OTR_TIPO_PROPOSITO IS NULL";
        } else if (this.getOtrTipoProposito() != null) {
            conditions += " AND OTR_TIPO_PROPOSITO = ?";
            values.add(this.getOtrTipoProposito());
        }

        if (this.getOtrTipoServicio() != null && "null".equals(this.getOtrTipoServicio())) {
            conditions += " AND OTR_TIPO_SERVICIO IS NULL";
        } else if (this.getOtrTipoServicio() != null) {
            conditions += " AND OTR_TIPO_SERVICIO = ?";
            values.add(this.getOtrTipoServicio());
        }

        if (this.getOtrTipoBien() != null && "null".equals(this.getOtrTipoBien())) {
            conditions += " AND OTR_TIPO_BIEN IS NULL";
        } else if (this.getOtrTipoBien() != null) {
            conditions += " AND OTR_TIPO_BIEN = ?";
            values.add(this.getOtrTipoBien());
        }

        if (this.getOtrClasifBien() != null && "null".equals(this.getOtrClasifBien())) {
            conditions += " AND OTR_CLASIF_BIEN IS NULL";
        } else if (this.getOtrClasifBien() != null) {
            conditions += " AND OTR_CLASIF_BIEN = ?";
            values.add(this.getOtrClasifBien());
        }

        if (this.getOtrCalle() != null && "null".equals(this.getOtrCalle())) {
            conditions += " AND OTR_CALLE IS NULL";
        } else if (this.getOtrCalle() != null) {
            conditions += " AND OTR_CALLE = ?";
            values.add(this.getOtrCalle());
        }

        if (this.getOtrNumero() != null && "null".equals(this.getOtrNumero())) {
            conditions += " AND OTR_NUMERO IS NULL";
        } else if (this.getOtrNumero() != null) {
            conditions += " AND OTR_NUMERO = ?";
            values.add(this.getOtrNumero());
        }

        if (this.getOtrLote() != null && "null".equals(this.getOtrLote())) {
            conditions += " AND OTR_LOTE IS NULL";
        } else if (this.getOtrLote() != null) {
            conditions += " AND OTR_LOTE = ?";
            values.add(this.getOtrLote());
        }

        if (this.getOtrManzana() != null && "null".equals(this.getOtrManzana())) {
            conditions += " AND OTR_MANZANA IS NULL";
        } else if (this.getOtrManzana() != null) {
            conditions += " AND OTR_MANZANA = ?";
            values.add(this.getOtrManzana());
        }

        if (this.getOtrCp() != null && "null".equals(this.getOtrCp())) {
            conditions += " AND OTR_CP IS NULL";
        } else if (this.getOtrCp() != null) {
            conditions += " AND OTR_CP = ?";
            values.add(this.getOtrCp());
        }

        if (this.getOtrColonia() != null && "null".equals(this.getOtrColonia())) {
            conditions += " AND OTR_COLONIA IS NULL";
        } else if (this.getOtrColonia() != null) {
            conditions += " AND OTR_COLONIA = ?";
            values.add(this.getOtrColonia());
        }

        if (this.getOtrPoblacion() != null && "null".equals(this.getOtrPoblacion())) {
            conditions += " AND OTR_POBLACION IS NULL";
        } else if (this.getOtrPoblacion() != null) {
            conditions += " AND OTR_POBLACION = ?";
            values.add(this.getOtrPoblacion());
        }

        if (this.getOtrEstado() != null && "null".equals(this.getOtrEstado())) {
            conditions += " AND OTR_ESTADO IS NULL";
        } else if (this.getOtrEstado() != null) {
            conditions += " AND OTR_ESTADO = ?";
            values.add(this.getOtrEstado());
        }

        if (this.getOtrOtraRefer() != null && "null".equals(this.getOtrOtraRefer())) {
            conditions += " AND OTR_OTRA_REFER IS NULL";
        } else if (this.getOtrOtraRefer() != null) {
            conditions += " AND OTR_OTRA_REFER = ?";
            values.add(this.getOtrOtraRefer());
        }

        if (this.getOtrEntreCalle() != null && "null".equals(this.getOtrEntreCalle())) {
            conditions += " AND OTR_ENTRE_CALLE IS NULL";
        } else if (this.getOtrEntreCalle() != null) {
            conditions += " AND OTR_ENTRE_CALLE = ?";
            values.add(this.getOtrEntreCalle());
        }

        if (this.getOtrYCalle() != null && "null".equals(this.getOtrYCalle())) {
            conditions += " AND OTR_Y_CALLE IS NULL";
        } else if (this.getOtrYCalle() != null) {
            conditions += " AND OTR_Y_CALLE = ?";
            values.add(this.getOtrYCalle());
        }

        if (this.getOtrCadenamiento() != null && "null".equals(this.getOtrCadenamiento())) {
            conditions += " AND OTR_CADENAMIENTO IS NULL";
        } else if (this.getOtrCadenamiento() != null) {
            conditions += " AND OTR_CADENAMIENTO = ?";
            values.add(this.getOtrCadenamiento());
        }

        if (this.getOtrMotivoCancel() != null && "null".equals(this.getOtrMotivoCancel())) {
            conditions += " AND OTR_MOTIVO_CANCEL IS NULL";
        } else if (this.getOtrMotivoCancel() != null) {
            conditions += " AND OTR_MOTIVO_CANCEL = ?";
            values.add(this.getOtrMotivoCancel());
        }

        if (this.getOtrFechaCancel() != null && "null".equals(this.getOtrFechaCancel())) {
            conditions += " AND OTR_FECHA_CANCEL IS NULL";
        } else if (this.getOtrFechaCancel() != null) {
            conditions += " AND OTR_FECHA_CANCEL = ?";
            values.add(this.getOtrFechaCancel());
        }

        if (this.getOtrNomCancela() != null && "null".equals(this.getOtrNomCancela())) {
            conditions += " AND OTR_NOM_CANCELA IS NULL";
        } else if (this.getOtrNomCancela() != null) {
            conditions += " AND OTR_NOM_CANCELA = ?";
            values.add(this.getOtrNomCancela());
        }

        if (this.getOtrNomRevision() != null && "null".equals(this.getOtrNomRevision())) {
            conditions += " AND OTR_NOM_REVISION IS NULL";
        } else if (this.getOtrNomRevision() != null) {
            conditions += " AND OTR_NOM_REVISION = ?";
            values.add(this.getOtrNomRevision());
        }

        if (this.getOtrFecRevision() != null && "null".equals(this.getOtrFecRevision())) {
            conditions += " AND OTR_FEC_REVISION IS NULL";
        } else if (this.getOtrFecRevision() != null) {
            conditions += " AND OTR_FEC_REVISION = ?";
            values.add(this.getOtrFecRevision());
        }

        if (this.getOtrNomFormaliza() != null && "null".equals(this.getOtrNomFormaliza())) {
            conditions += " AND OTR_NOM_FORMALIZA IS NULL";
        } else if (this.getOtrNomFormaliza() != null) {
            conditions += " AND OTR_NOM_FORMALIZA = ?";
            values.add(this.getOtrNomFormaliza());
        }

        if (this.getOtrFecFormaliza() != null && "null".equals(this.getOtrFecFormaliza())) {
            conditions += " AND OTR_FEC_FORMALIZA IS NULL";
        } else if (this.getOtrFecFormaliza() != null) {
            conditions += " AND OTR_FEC_FORMALIZA = ?";
            values.add(this.getOtrFecFormaliza());
        }

        if (this.getOtrNomCertifica() != null && "null".equals(this.getOtrNomCertifica())) {
            conditions += " AND OTR_NOM_CERTIFICA IS NULL";
        } else if (this.getOtrNomCertifica() != null) {
            conditions += " AND OTR_NOM_CERTIFICA = ?";
            values.add(this.getOtrNomCertifica());
        }

        if (this.getOtrFecCertifica() != null && "null".equals(this.getOtrFecCertifica())) {
            conditions += " AND OTR_FEC_CERTIFICA IS NULL";
        } else if (this.getOtrFecCertifica() != null) {
            conditions += " AND OTR_FEC_CERTIFICA = ?";
            values.add(this.getOtrFecCertifica());
        }

        if (this.getOtrAnoAltaReg() != null && this.getOtrAnoAltaReg().longValue() == -999) {
            conditions += " AND OTR_ANO_ALTA_REG IS NULL";
        } else if (this.getOtrAnoAltaReg() != null) {
            conditions += " AND OTR_ANO_ALTA_REG = ?";
            values.add(this.getOtrAnoAltaReg());
        }

        if (this.getOtrMesAltaReg() != null && this.getOtrMesAltaReg().longValue() == -999) {
            conditions += " AND OTR_MES_ALTA_REG IS NULL";
        } else if (this.getOtrMesAltaReg() != null) {
            conditions += " AND OTR_MES_ALTA_REG = ?";
            values.add(this.getOtrMesAltaReg());
        }

        if (this.getOtrDiaAltaReg() != null && this.getOtrDiaAltaReg().longValue() == -999) {
            conditions += " AND OTR_DIA_ALTA_REG IS NULL";
        } else if (this.getOtrDiaAltaReg() != null) {
            conditions += " AND OTR_DIA_ALTA_REG = ?";
            values.add(this.getOtrDiaAltaReg());
        }

        if (this.getOtrAnoUltMod() != null && this.getOtrAnoUltMod().longValue() == -999) {
            conditions += " AND OTR_ANO_ULT_MOD IS NULL";
        } else if (this.getOtrAnoUltMod() != null) {
            conditions += " AND OTR_ANO_ULT_MOD = ?";
            values.add(this.getOtrAnoUltMod());
        }

        if (this.getOtrMesUltMod() != null && this.getOtrMesUltMod().longValue() == -999) {
            conditions += " AND OTR_MES_ULT_MOD IS NULL";
        } else if (this.getOtrMesUltMod() != null) {
            conditions += " AND OTR_MES_ULT_MOD = ?";
            values.add(this.getOtrMesUltMod());
        }

        if (this.getOtrDiaUltMod() != null && this.getOtrDiaUltMod().longValue() == -999) {
            conditions += " AND OTR_DIA_ULT_MOD IS NULL";
        } else if (this.getOtrDiaUltMod() != null) {
            conditions += " AND OTR_DIA_ULT_MOD = ?";
            values.add(this.getOtrDiaUltMod());
        }

        if (this.getOtrCveStAvaluo() != null && "null".equals(this.getOtrCveStAvaluo())) {
            conditions += " AND OTR_CVE_ST_AVALUO IS NULL";
        } else if (this.getOtrCveStAvaluo() != null) {
            conditions += " AND OTR_CVE_ST_AVALUO = ?";
            values.add(this.getOtrCveStAvaluo());
        }

        if (this.getOtrDescBien() != null && "null".equals(this.getOtrDescBien())) {
            conditions += " AND OTR_DESC_BIEN IS NULL";
        } else if (this.getOtrDescBien() != null) {
            conditions += " AND OTR_DESC_BIEN = ?";
            values.add(this.getOtrDescBien());
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
        String sql = "UPDATE ORDENTRAB SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND OTR_OTPRINC = ?";
        pkValues.add(this.getOtrOtprinc());
        conditions += " AND OTR_TURNO = ?";
        pkValues.add(this.getOtrTurno());
        conditions += " AND OTR_NUM_SOLICITUD = ?";
        pkValues.add(this.getOtrNumSolicitud());
        fields += " OTR_NUM_GCO = ?, ";
        values.add(this.getOtrNumGco());
        fields += " OTR_CONSEC_ANUAL = ?, ";
        values.add(this.getOtrConsecAnual());
        fields += " OTR_ID_CLIENTE = ?, ";
        values.add(this.getOtrIdCliente());
        fields += " OTR_NOM_PROPIE = ?, ";
        values.add(this.getOtrNomPropie());
        fields += " OTR_OBSERVACION = ?, ";
        values.add(this.getOtrObservacion());
        fields += " OTR_PROMOVIDO_POR = ?, ";
        values.add(this.getOtrPromovidoPor());
        fields += " OTR_FEC_RECEPCION = ?, ";
        values.add(this.getOtrFecRecepcion());
        fields += " OTR_FEC_AVALUO = ?, ";
        values.add(this.getOtrFecAvaluo());
        fields += " OTR_FEC_VIGENCIA = ?, ";
        values.add(this.getOtrFecVigencia());
        fields += " OTR_CVE_MULTIPLE = ?, ";
        values.add(this.getOtrCveMultiple());
        fields += " OTR_OBJETO_SOLIC = ?, ";
        values.add(this.getOtrObjetoSolic());
        fields += " OTR_TIPO_AVALUO = ?, ";
        values.add(this.getOtrTipoAvaluo());
        fields += " OTR_TIPO_PROPOSITO = ?, ";
        values.add(this.getOtrTipoProposito());
        fields += " OTR_TIPO_SERVICIO = ?, ";
        values.add(this.getOtrTipoServicio());
        fields += " OTR_TIPO_BIEN = ?, ";
        values.add(this.getOtrTipoBien());
        fields += " OTR_CLASIF_BIEN = ?, ";
        values.add(this.getOtrClasifBien());
        fields += " OTR_CALLE = ?, ";
        values.add(this.getOtrCalle());
        fields += " OTR_NUMERO = ?, ";
        values.add(this.getOtrNumero());
        fields += " OTR_LOTE = ?, ";
        values.add(this.getOtrLote());
        fields += " OTR_MANZANA = ?, ";
        values.add(this.getOtrManzana());
        fields += " OTR_CP = ?, ";
        values.add(this.getOtrCp());
        fields += " OTR_COLONIA = ?, ";
        values.add(this.getOtrColonia());
        fields += " OTR_POBLACION = ?, ";
        values.add(this.getOtrPoblacion());
        fields += " OTR_ESTADO = ?, ";
        values.add(this.getOtrEstado());
        fields += " OTR_OTRA_REFER = ?, ";
        values.add(this.getOtrOtraRefer());
        fields += " OTR_ENTRE_CALLE = ?, ";
        values.add(this.getOtrEntreCalle());
        fields += " OTR_Y_CALLE = ?, ";
        values.add(this.getOtrYCalle());
        fields += " OTR_CADENAMIENTO = ?, ";
        values.add(this.getOtrCadenamiento());
        fields += " OTR_MOTIVO_CANCEL = ?, ";
        values.add(this.getOtrMotivoCancel());
        fields += " OTR_FECHA_CANCEL = ?, ";
        values.add(this.getOtrFechaCancel());
        fields += " OTR_NOM_CANCELA = ?, ";
        values.add(this.getOtrNomCancela());
        fields += " OTR_NOM_REVISION = ?, ";
        values.add(this.getOtrNomRevision());
        fields += " OTR_FEC_REVISION = ?, ";
        values.add(this.getOtrFecRevision());
        fields += " OTR_NOM_FORMALIZA = ?, ";
        values.add(this.getOtrNomFormaliza());
        fields += " OTR_FEC_FORMALIZA = ?, ";
        values.add(this.getOtrFecFormaliza());
        fields += " OTR_NOM_CERTIFICA = ?, ";
        values.add(this.getOtrNomCertifica());
        fields += " OTR_FEC_CERTIFICA = ?, ";
        values.add(this.getOtrFecCertifica());
        fields += " OTR_ANO_ALTA_REG = ?, ";
        values.add(this.getOtrAnoAltaReg());
        fields += " OTR_MES_ALTA_REG = ?, ";
        values.add(this.getOtrMesAltaReg());
        fields += " OTR_DIA_ALTA_REG = ?, ";
        values.add(this.getOtrDiaAltaReg());
        fields += " OTR_ANO_ULT_MOD = ?, ";
        values.add(this.getOtrAnoUltMod());
        fields += " OTR_MES_ULT_MOD = ?, ";
        values.add(this.getOtrMesUltMod());
        fields += " OTR_DIA_ULT_MOD = ?, ";
        values.add(this.getOtrDiaUltMod());
        fields += " OTR_CVE_ST_AVALUO = ?, ";
        values.add(this.getOtrCveStAvaluo());
        fields += " OTR_DESC_BIEN = ?, ";
        values.add(this.getOtrDescBien());
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
        String sql = "INSERT INTO ORDENTRAB ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", OTR_OTPRINC";
        fieldValues += ", ?";
        values.add(this.getOtrOtprinc());

        fields += ", OTR_TURNO";
        fieldValues += ", ?";
        values.add(this.getOtrTurno());

        fields += ", OTR_NUM_SOLICITUD";
        fieldValues += ", ?";
        values.add(this.getOtrNumSolicitud());

        fields += ", OTR_NUM_GCO";
        fieldValues += ", ?";
        values.add(this.getOtrNumGco());

        fields += ", OTR_CONSEC_ANUAL";
        fieldValues += ", ?";
        values.add(this.getOtrConsecAnual());

        fields += ", OTR_ID_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getOtrIdCliente());

        fields += ", OTR_NOM_PROPIE";
        fieldValues += ", ?";
        values.add(this.getOtrNomPropie());

        fields += ", OTR_OBSERVACION";
        fieldValues += ", ?";
        values.add(this.getOtrObservacion());

        fields += ", OTR_PROMOVIDO_POR";
        fieldValues += ", ?";
        values.add(this.getOtrPromovidoPor());

        fields += ", OTR_FEC_RECEPCION";
        fieldValues += ", ?";
        values.add(this.getOtrFecRecepcion());

        fields += ", OTR_FEC_AVALUO";
        fieldValues += ", ?";
        values.add(this.getOtrFecAvaluo());

        fields += ", OTR_FEC_VIGENCIA";
        fieldValues += ", ?";
        values.add(this.getOtrFecVigencia());

        fields += ", OTR_CVE_MULTIPLE";
        fieldValues += ", ?";
        values.add(this.getOtrCveMultiple());

        fields += ", OTR_OBJETO_SOLIC";
        fieldValues += ", ?";
        values.add(this.getOtrObjetoSolic());

        fields += ", OTR_TIPO_AVALUO";
        fieldValues += ", ?";
        values.add(this.getOtrTipoAvaluo());

        fields += ", OTR_TIPO_PROPOSITO";
        fieldValues += ", ?";
        values.add(this.getOtrTipoProposito());

        fields += ", OTR_TIPO_SERVICIO";
        fieldValues += ", ?";
        values.add(this.getOtrTipoServicio());

        fields += ", OTR_TIPO_BIEN";
        fieldValues += ", ?";
        values.add(this.getOtrTipoBien());

        fields += ", OTR_CLASIF_BIEN";
        fieldValues += ", ?";
        values.add(this.getOtrClasifBien());

        fields += ", OTR_CALLE";
        fieldValues += ", ?";
        values.add(this.getOtrCalle());

        fields += ", OTR_NUMERO";
        fieldValues += ", ?";
        values.add(this.getOtrNumero());

        fields += ", OTR_LOTE";
        fieldValues += ", ?";
        values.add(this.getOtrLote());

        fields += ", OTR_MANZANA";
        fieldValues += ", ?";
        values.add(this.getOtrManzana());

        fields += ", OTR_CP";
        fieldValues += ", ?";
        values.add(this.getOtrCp());

        fields += ", OTR_COLONIA";
        fieldValues += ", ?";
        values.add(this.getOtrColonia());

        fields += ", OTR_POBLACION";
        fieldValues += ", ?";
        values.add(this.getOtrPoblacion());

        fields += ", OTR_ESTADO";
        fieldValues += ", ?";
        values.add(this.getOtrEstado());

        fields += ", OTR_OTRA_REFER";
        fieldValues += ", ?";
        values.add(this.getOtrOtraRefer());

        fields += ", OTR_ENTRE_CALLE";
        fieldValues += ", ?";
        values.add(this.getOtrEntreCalle());

        fields += ", OTR_Y_CALLE";
        fieldValues += ", ?";
        values.add(this.getOtrYCalle());

        fields += ", OTR_CADENAMIENTO";
        fieldValues += ", ?";
        values.add(this.getOtrCadenamiento());

        fields += ", OTR_MOTIVO_CANCEL";
        fieldValues += ", ?";
        values.add(this.getOtrMotivoCancel());

        fields += ", OTR_FECHA_CANCEL";
        fieldValues += ", ?";
        values.add(this.getOtrFechaCancel());

        fields += ", OTR_NOM_CANCELA";
        fieldValues += ", ?";
        values.add(this.getOtrNomCancela());

        fields += ", OTR_NOM_REVISION";
        fieldValues += ", ?";
        values.add(this.getOtrNomRevision());

        fields += ", OTR_FEC_REVISION";
        fieldValues += ", ?";
        values.add(this.getOtrFecRevision());

        fields += ", OTR_NOM_FORMALIZA";
        fieldValues += ", ?";
        values.add(this.getOtrNomFormaliza());

        fields += ", OTR_FEC_FORMALIZA";
        fieldValues += ", ?";
        values.add(this.getOtrFecFormaliza());

        fields += ", OTR_NOM_CERTIFICA";
        fieldValues += ", ?";
        values.add(this.getOtrNomCertifica());

        fields += ", OTR_FEC_CERTIFICA";
        fieldValues += ", ?";
        values.add(this.getOtrFecCertifica());

        fields += ", OTR_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOtrAnoAltaReg());

        fields += ", OTR_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOtrMesAltaReg());

        fields += ", OTR_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOtrDiaAltaReg());

        fields += ", OTR_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOtrAnoUltMod());

        fields += ", OTR_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOtrMesUltMod());

        fields += ", OTR_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOtrDiaUltMod());

        fields += ", OTR_CVE_ST_AVALUO";
        fieldValues += ", ?";
        values.add(this.getOtrCveStAvaluo());

        fields += ", OTR_DESC_BIEN";
        fieldValues += ", ?";
        values.add(this.getOtrDescBien());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM ORDENTRAB WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND OTR_OTPRINC = ?";
        values.add(this.getOtrOtprinc());
        conditions += " AND OTR_TURNO = ?";
        values.add(this.getOtrTurno());
        conditions += " AND OTR_NUM_SOLICITUD = ?";
        values.add(this.getOtrNumSolicitud());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Ordentrab instance = (Ordentrab) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getOtrOtprinc().equals(instance.getOtrOtprinc()))
            equalObjects = false;
        if (equalObjects && !this.getOtrTurno().equals(instance.getOtrTurno()))
            equalObjects = false;
        if (equalObjects && !this.getOtrNumSolicitud().equals(instance.getOtrNumSolicitud()))
            equalObjects = false;
        if (equalObjects && !this.getOtrNumGco().equals(instance.getOtrNumGco()))
            equalObjects = false;
        if (equalObjects && !this.getOtrConsecAnual().equals(instance.getOtrConsecAnual()))
            equalObjects = false;
        if (equalObjects && !this.getOtrIdCliente().equals(instance.getOtrIdCliente()))
            equalObjects = false;
        if (equalObjects && !this.getOtrNomPropie().equals(instance.getOtrNomPropie()))
            equalObjects = false;
        if (equalObjects && !this.getOtrObservacion().equals(instance.getOtrObservacion()))
            equalObjects = false;
        if (equalObjects && !this.getOtrPromovidoPor().equals(instance.getOtrPromovidoPor()))
            equalObjects = false;
        if (equalObjects && !this.getOtrFecRecepcion().equals(instance.getOtrFecRecepcion()))
            equalObjects = false;
        if (equalObjects && !this.getOtrFecAvaluo().equals(instance.getOtrFecAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getOtrFecVigencia().equals(instance.getOtrFecVigencia()))
            equalObjects = false;
        if (equalObjects && !this.getOtrCveMultiple().equals(instance.getOtrCveMultiple()))
            equalObjects = false;
        if (equalObjects && !this.getOtrObjetoSolic().equals(instance.getOtrObjetoSolic()))
            equalObjects = false;
        if (equalObjects && !this.getOtrTipoAvaluo().equals(instance.getOtrTipoAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getOtrTipoProposito().equals(instance.getOtrTipoProposito()))
            equalObjects = false;
        if (equalObjects && !this.getOtrTipoServicio().equals(instance.getOtrTipoServicio()))
            equalObjects = false;
        if (equalObjects && !this.getOtrTipoBien().equals(instance.getOtrTipoBien()))
            equalObjects = false;
        if (equalObjects && !this.getOtrClasifBien().equals(instance.getOtrClasifBien()))
            equalObjects = false;
        if (equalObjects && !this.getOtrCalle().equals(instance.getOtrCalle()))
            equalObjects = false;
        if (equalObjects && !this.getOtrNumero().equals(instance.getOtrNumero()))
            equalObjects = false;
        if (equalObjects && !this.getOtrLote().equals(instance.getOtrLote()))
            equalObjects = false;
        if (equalObjects && !this.getOtrManzana().equals(instance.getOtrManzana()))
            equalObjects = false;
        if (equalObjects && !this.getOtrCp().equals(instance.getOtrCp()))
            equalObjects = false;
        if (equalObjects && !this.getOtrColonia().equals(instance.getOtrColonia()))
            equalObjects = false;
        if (equalObjects && !this.getOtrPoblacion().equals(instance.getOtrPoblacion()))
            equalObjects = false;
        if (equalObjects && !this.getOtrEstado().equals(instance.getOtrEstado()))
            equalObjects = false;
        if (equalObjects && !this.getOtrOtraRefer().equals(instance.getOtrOtraRefer()))
            equalObjects = false;
        if (equalObjects && !this.getOtrEntreCalle().equals(instance.getOtrEntreCalle()))
            equalObjects = false;
        if (equalObjects && !this.getOtrYCalle().equals(instance.getOtrYCalle()))
            equalObjects = false;
        if (equalObjects && !this.getOtrCadenamiento().equals(instance.getOtrCadenamiento()))
            equalObjects = false;
        if (equalObjects && !this.getOtrMotivoCancel().equals(instance.getOtrMotivoCancel()))
            equalObjects = false;
        if (equalObjects && !this.getOtrFechaCancel().equals(instance.getOtrFechaCancel()))
            equalObjects = false;
        if (equalObjects && !this.getOtrNomCancela().equals(instance.getOtrNomCancela()))
            equalObjects = false;
        if (equalObjects && !this.getOtrNomRevision().equals(instance.getOtrNomRevision()))
            equalObjects = false;
        if (equalObjects && !this.getOtrFecRevision().equals(instance.getOtrFecRevision()))
            equalObjects = false;
        if (equalObjects && !this.getOtrNomFormaliza().equals(instance.getOtrNomFormaliza()))
            equalObjects = false;
        if (equalObjects && !this.getOtrFecFormaliza().equals(instance.getOtrFecFormaliza()))
            equalObjects = false;
        if (equalObjects && !this.getOtrNomCertifica().equals(instance.getOtrNomCertifica()))
            equalObjects = false;
        if (equalObjects && !this.getOtrFecCertifica().equals(instance.getOtrFecCertifica()))
            equalObjects = false;
        if (equalObjects && !this.getOtrAnoAltaReg().equals(instance.getOtrAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOtrMesAltaReg().equals(instance.getOtrMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOtrDiaAltaReg().equals(instance.getOtrDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOtrAnoUltMod().equals(instance.getOtrAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOtrMesUltMod().equals(instance.getOtrMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOtrDiaUltMod().equals(instance.getOtrDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOtrCveStAvaluo().equals(instance.getOtrCveStAvaluo()))
            equalObjects = false;
        if (equalObjects && !this.getOtrDescBien().equals(instance.getOtrDescBien()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Ordentrab result = new Ordentrab();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setOtrOtprinc((String) objectData.getData("OTR_OTPRINC"));
        result.setOtrTurno((String) objectData.getData("OTR_TURNO"));
        result.setOtrNumSolicitud((String) objectData.getData("OTR_NUM_SOLICITUD"));
        result.setOtrNumGco((BigDecimal) objectData.getData("OTR_NUM_GCO"));
        result.setOtrConsecAnual((String) objectData.getData("OTR_CONSEC_ANUAL"));
        result.setOtrIdCliente((BigDecimal) objectData.getData("OTR_ID_CLIENTE"));
        result.setOtrNomPropie((String) objectData.getData("OTR_NOM_PROPIE"));
        result.setOtrObservacion((String) objectData.getData("OTR_OBSERVACION"));
        result.setOtrPromovidoPor((String) objectData.getData("OTR_PROMOVIDO_POR"));
        result.setOtrFecRecepcion((String) objectData.getData("OTR_FEC_RECEPCION"));
        result.setOtrFecAvaluo((String) objectData.getData("OTR_FEC_AVALUO"));
        result.setOtrFecVigencia((String) objectData.getData("OTR_FEC_VIGENCIA"));
        result.setOtrCveMultiple((String) objectData.getData("OTR_CVE_MULTIPLE"));
        result.setOtrObjetoSolic((String) objectData.getData("OTR_OBJETO_SOLIC"));
        result.setOtrTipoAvaluo((String) objectData.getData("OTR_TIPO_AVALUO"));
        result.setOtrTipoProposito((String) objectData.getData("OTR_TIPO_PROPOSITO"));
        result.setOtrTipoServicio((String) objectData.getData("OTR_TIPO_SERVICIO"));
        result.setOtrTipoBien((String) objectData.getData("OTR_TIPO_BIEN"));
        result.setOtrClasifBien((String) objectData.getData("OTR_CLASIF_BIEN"));
        result.setOtrCalle((String) objectData.getData("OTR_CALLE"));
        result.setOtrNumero((String) objectData.getData("OTR_NUMERO"));
        result.setOtrLote((String) objectData.getData("OTR_LOTE"));
        result.setOtrManzana((String) objectData.getData("OTR_MANZANA"));
        result.setOtrCp((String) objectData.getData("OTR_CP"));
        result.setOtrColonia((String) objectData.getData("OTR_COLONIA"));
        result.setOtrPoblacion((String) objectData.getData("OTR_POBLACION"));
        result.setOtrEstado((String) objectData.getData("OTR_ESTADO"));
        result.setOtrOtraRefer((String) objectData.getData("OTR_OTRA_REFER"));
        result.setOtrEntreCalle((String) objectData.getData("OTR_ENTRE_CALLE"));
        result.setOtrYCalle((String) objectData.getData("OTR_Y_CALLE"));
        result.setOtrCadenamiento((String) objectData.getData("OTR_CADENAMIENTO"));
        result.setOtrMotivoCancel((String) objectData.getData("OTR_MOTIVO_CANCEL"));
        result.setOtrFechaCancel((String) objectData.getData("OTR_FECHA_CANCEL"));
        result.setOtrNomCancela((String) objectData.getData("OTR_NOM_CANCELA"));
        result.setOtrNomRevision((String) objectData.getData("OTR_NOM_REVISION"));
        result.setOtrFecRevision((String) objectData.getData("OTR_FEC_REVISION"));
        result.setOtrNomFormaliza((String) objectData.getData("OTR_NOM_FORMALIZA"));
        result.setOtrFecFormaliza((String) objectData.getData("OTR_FEC_FORMALIZA"));
        result.setOtrNomCertifica((String) objectData.getData("OTR_NOM_CERTIFICA"));
        result.setOtrFecCertifica((String) objectData.getData("OTR_FEC_CERTIFICA"));
        result.setOtrAnoAltaReg((BigDecimal) objectData.getData("OTR_ANO_ALTA_REG"));
        result.setOtrMesAltaReg((BigDecimal) objectData.getData("OTR_MES_ALTA_REG"));
        result.setOtrDiaAltaReg((BigDecimal) objectData.getData("OTR_DIA_ALTA_REG"));
        result.setOtrAnoUltMod((BigDecimal) objectData.getData("OTR_ANO_ULT_MOD"));
        result.setOtrMesUltMod((BigDecimal) objectData.getData("OTR_MES_ULT_MOD"));
        result.setOtrDiaUltMod((BigDecimal) objectData.getData("OTR_DIA_ULT_MOD"));
        result.setOtrCveStAvaluo((String) objectData.getData("OTR_CVE_ST_AVALUO"));
        result.setOtrDescBien((String) objectData.getData("OTR_DESC_BIEN"));

        return result;

    }

}
