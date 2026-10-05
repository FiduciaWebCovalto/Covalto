package mx.com.inscitech.clients.services.v1.dtos.spei;

import mx.com.inscitech.clients.services.v1.dtos.MQMessage;
import mx.com.inscitech.clients.services.v1.dtos.MQMessageData;
import mx.com.inscitech.clients.services.v1.dtos.ValidationData;

public class SPEIMessage extends MQMessageData implements MQMessage {

    @ValidationData
    private String codigoRetorno = "00";

    @ValidationData
    private String codigoError = "000";

    @ValidationData
    private String numConfirmacion = "0";

    @ValidationData
    private String leyenda;

    @ValidationData
    private String sentido = "E"; //ENUM

    @ValidationData
    private String origen; //ENUM

    @ValidationData
    private String numTransaccion = "210";

    @ValidationData
    private String fechaEquipo;

    @ValidationData
    private String horaEquipo;

    @ValidationData
    private String fechaMensaje;

    @ValidationData
    private String horasMensaje;

    @ValidationData
    private String fechaOperacion;

    @ValidationData
    private String folioServidor = "0";

    @ValidationData
    private String tipoPago; //???

    @ValidationData
    private String prioridad = "0"; //ENUM

    @ValidationData
    private String topologia = "V"; //ENUM

    @ValidationData
    private String bancoBeneficiario; //CAT

    @ValidationData
    private DatosCuenta ordenante;

    @ValidationData
    private DatosCuenta beneficiario;

    @ValidationData
    private String conceptoPago;

    @ValidationData
    private String impuestoIVA;

    @ValidationData
    private String referenciaNumerica;

    @ValidationData
    private String referenciaCobranza;

    @ValidationData
    private String claveRastreo; //???

    @ValidationData
    private String importe;

    @ValidationData
    private String conceptoPagoExt;

    @ValidationData
    private String clavePago;

    @ValidationData
    private DatosCuenta vostro;

    @ValidationData
    private String tipoOperacion; //Catalogo adjunto?

    @ValidationData
    private String claveDevolucion = "00";

    @ValidationData
    private String referenciaOrigen;

    @ValidationData
    private String contrato;

    @ValidationData
    private String referenciaCliente;

    @ValidationData
    private String usuario;

    @ValidationData
    private String leyendaEdoCta;

    @ValidationData
    private String speiXID;
    
    @Override
    public String getRequestMessage() {
        StringBuffer sb = new StringBuffer();
        
        sb.append(getFormattedField(this.codigoRetorno, 2, "0"));
        sb.append(getFormattedField(this.codigoError, 3, "0"));
        sb.append(getFormattedField(this.numConfirmacion, 1, "0"));
        sb.append(getFormattedField(this.leyenda, 50, " "));
        sb.append(getFormattedField(this.sentido, 1, "0"));
        sb.append(getFormattedField(this.origen, 8, "0"));
        sb.append(getFormattedField(this.numTransaccion, 3, "0"));
        sb.append(getFormattedField(this.fechaEquipo, 8, "0"));
        sb.append(getFormattedField(this.horaEquipo, 6, "0"));
        sb.append(getFormattedField(this.fechaMensaje, 8, "0"));
        sb.append(getFormattedField(this.horasMensaje, 6, "0"));
        sb.append(getFormattedField(this.fechaOperacion, 8, "0"));
        sb.append(getFormattedField(this.folioServidor, 10, "0"));
        sb.append(getFormattedField(this.tipoPago, 2, "0"));
        sb.append(getFormattedField(this.prioridad, 1, "0"));
        sb.append(getFormattedField(this.topologia, 1, "0"));
        sb.append(getFormattedField(this.bancoBeneficiario, 5, "0"));
        sb.append(this.ordenante.getRequestMessage());
        sb.append(this.beneficiario.getRequestMessage());
        sb.append(getFormattedField(this.conceptoPago, 40, "0"));
        sb.append(getFormattedField(this.impuestoIVA, 18, "0"));
        sb.append(getFormattedField(this.referenciaNumerica, 7, "0"));
        sb.append(getFormattedField(this.referenciaCobranza, 40, "0"));
        sb.append(getFormattedField(this.claveRastreo, 30, "0"));
        sb.append(getFormattedField(this.importe, 18, "0"));
        sb.append(getFormattedField(this.conceptoPagoExt, 210, "0"));
        sb.append(getFormattedField(this.clavePago, 10, "0"));
        sb.append(this.vostro.getRequestMessage());
        sb.append(getFormattedField(this.tipoOperacion, 2, "0"));
        sb.append(getFormattedField(this.claveDevolucion, 2, "0"));
        sb.append(getFormattedField(this.referenciaOrigen, 30, "0"));
        sb.append(getFormattedField(this.contrato, 20, "0"));
        sb.append(getFormattedField(this.referenciaCliente, 30, "0"));
        sb.append(getFormattedField(this.usuario, 12, "0"));
        sb.append(getFormattedField(this.leyendaEdoCta, 40, "0"));
        sb.append(getFormattedField(this.speiXID, 10, "0"));
        
        return sb.toString();
    }
    
    @Override
    public String getResponseMessage() {
        return "";
    }

    public void setFolioServidor(String folioServidor) {
        this.folioServidor = folioServidor;
    }

    public String getFolioServidorCtl() {
        return this.folioServidor;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setNumConfirmacion(String numConfirmacion) {
        this.numConfirmacion = numConfirmacion;
    }

    public String getNumConfirmacion() {
        return numConfirmacion;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }

    public String getSentido() {
        return sentido;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }

    public void setFechaEquipo(String fechaEquipo) {
        this.fechaEquipo = fechaEquipo;
    }

    public String getFechaEquipo() {
        return fechaEquipo;
    }

    public void setHoraEquipo(String horaEquipo) {
        this.horaEquipo = horaEquipo;
    }

    public String getHoraEquipo() {
        return horaEquipo;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setHorasMensaje(String horasMensaje) {
        this.horasMensaje = horasMensaje;
    }

    public String getHorasMensaje() {
        return horasMensaje;
    }

    public void setFechaOperacion(String fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getFechaOperacion() {
        return fechaOperacion;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setTopologia(String topologia) {
        this.topologia = topologia;
    }

    public String getTopologia() {
        return topologia;
    }

    public void setBancoBeneficiario(String bancoBeneficiario) {
        this.bancoBeneficiario = bancoBeneficiario;
    }

    public String getBancoBeneficiario() {
        return bancoBeneficiario;
    }

    public void setOrdenante(DatosCuenta ordenante) {
        this.ordenante = ordenante;
    }

    public DatosCuenta getOrdenante() {
        return ordenante;
    }

    public void setBeneficiario(DatosCuenta beneficiario) {
        this.beneficiario = beneficiario;
    }

    public DatosCuenta getBeneficiario() {
        return beneficiario;
    }

    public void setConceptoPago(String conceptoPago) {
        this.conceptoPago = conceptoPago;
    }

    public String getConceptoPago() {
        return conceptoPago;
    }

    public void setImpuestoIVA(String impuestoIVA) {
        this.impuestoIVA = impuestoIVA;
    }

    public String getImpuestoIVA() {
        return impuestoIVA;
    }

    public void setReferenciaNumerica(String referenciaNumerica) {
        this.referenciaNumerica = referenciaNumerica;
    }

    public String getReferenciaNumerica() {
        return referenciaNumerica;
    }

    public void setReferenciaCobranza(String referenciaCobranza) {
        this.referenciaCobranza = referenciaCobranza;
    }

    public String getReferenciaCobranza() {
        return referenciaCobranza;
    }

    public void setClaveRastreo(String claveRastreo) {
        this.claveRastreo = claveRastreo;
    }

    public String getClaveRastreo() {
        return claveRastreo;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getImporte() {
        return importe;
    }

    public void setConceptoPagoExt(String conceptoPagoExt) {
        this.conceptoPagoExt = conceptoPagoExt;
    }

    public String getConceptoPagoExt() {
        return conceptoPagoExt;
    }

    public void setClavePago(String clavePago) {
        this.clavePago = clavePago;
    }

    public String getClavePago() {
        return clavePago;
    }

    public void setVostro(DatosCuenta vostro) {
        this.vostro = vostro;
    }

    public DatosCuenta getVostro() {
        return vostro;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setClaveDevolucion(String claveDevolucion) {
        this.claveDevolucion = claveDevolucion;
    }

    public String getClaveDevolucion() {
        return claveDevolucion;
    }

    public void setReferenciaOrigen(String referenciaOrigen) {
        this.referenciaOrigen = referenciaOrigen;
    }

    public String getReferenciaOrigen() {
        return referenciaOrigen;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getContrato() {
        return contrato;
    }

    public void setReferenciaCliente(String referenciaCliente) {
        this.referenciaCliente = referenciaCliente;
    }

    public String getReferenciaCliente() {
        return referenciaCliente;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setLeyendaEdoCta(String leyendaEdoCta) {
        this.leyendaEdoCta = leyendaEdoCta;
    }

    public String getLeyendaEdoCta() {
        return leyendaEdoCta;
    }

    public void setSpeiXID(String speiXID) {
        this.speiXID = speiXID;
    }

    public String getSpeiXID() {
        return speiXID;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SPEIMessage)) {
            return false;
        }
        final SPEIMessage other = (SPEIMessage) object;
        if (!(codigoRetorno == null ? other.codigoRetorno == null : codigoRetorno.equals(other.codigoRetorno))) {
            return false;
        }
        if (!(codigoError == null ? other.codigoError == null : codigoError.equals(other.codigoError))) {
            return false;
        }
        if (!(numConfirmacion == null ? other.numConfirmacion == null : numConfirmacion.equals(other.numConfirmacion))) {
            return false;
        }
        if (!(leyenda == null ? other.leyenda == null : leyenda.equals(other.leyenda))) {
            return false;
        }
        if (!(sentido == null ? other.sentido == null : sentido.equals(other.sentido))) {
            return false;
        }
        if (!(origen == null ? other.origen == null : origen.equals(other.origen))) {
            return false;
        }
        if (!(numTransaccion == null ? other.numTransaccion == null : numTransaccion.equals(other.numTransaccion))) {
            return false;
        }
        if (!(fechaEquipo == null ? other.fechaEquipo == null : fechaEquipo.equals(other.fechaEquipo))) {
            return false;
        }
        if (!(horaEquipo == null ? other.horaEquipo == null : horaEquipo.equals(other.horaEquipo))) {
            return false;
        }
        if (!(fechaMensaje == null ? other.fechaMensaje == null : fechaMensaje.equals(other.fechaMensaje))) {
            return false;
        }
        if (!(horasMensaje == null ? other.horasMensaje == null : horasMensaje.equals(other.horasMensaje))) {
            return false;
        }
        if (!(fechaOperacion == null ? other.fechaOperacion == null : fechaOperacion.equals(other.fechaOperacion))) {
            return false;
        }
        if (!(tipoPago == null ? other.tipoPago == null : tipoPago.equals(other.tipoPago))) {
            return false;
        }
        if (!(prioridad == null ? other.prioridad == null : prioridad.equals(other.prioridad))) {
            return false;
        }
        if (!(topologia == null ? other.topologia == null : topologia.equals(other.topologia))) {
            return false;
        }
        if (!(bancoBeneficiario == null ? other.bancoBeneficiario == null : bancoBeneficiario.equals(other.bancoBeneficiario))) {
            return false;
        }
        if (!(ordenante == null ? other.ordenante == null : ordenante.equals(other.ordenante))) {
            return false;
        }
        if (!(beneficiario == null ? other.beneficiario == null : beneficiario.equals(other.beneficiario))) {
            return false;
        }
        if (!(conceptoPago == null ? other.conceptoPago == null : conceptoPago.equals(other.conceptoPago))) {
            return false;
        }
        if (!(impuestoIVA == null ? other.impuestoIVA == null : impuestoIVA.equals(other.impuestoIVA))) {
            return false;
        }
        if (!(referenciaNumerica == null ? other.referenciaNumerica == null : referenciaNumerica.equals(other.referenciaNumerica))) {
            return false;
        }
        if (!(referenciaCobranza == null ? other.referenciaCobranza == null : referenciaCobranza.equals(other.referenciaCobranza))) {
            return false;
        }
        if (!(claveRastreo == null ? other.claveRastreo == null : claveRastreo.equals(other.claveRastreo))) {
            return false;
        }
        if (!(importe == null ? other.importe == null : importe.equals(other.importe))) {
            return false;
        }
        if (!(conceptoPagoExt == null ? other.conceptoPagoExt == null : conceptoPagoExt.equals(other.conceptoPagoExt))) {
            return false;
        }
        if (!(clavePago == null ? other.clavePago == null : clavePago.equals(other.clavePago))) {
            return false;
        }
        if (!(vostro == null ? other.vostro == null : vostro.equals(other.vostro))) {
            return false;
        }
        if (!(tipoOperacion == null ? other.tipoOperacion == null : tipoOperacion.equals(other.tipoOperacion))) {
            return false;
        }
        if (!(claveDevolucion == null ? other.claveDevolucion == null : claveDevolucion.equals(other.claveDevolucion))) {
            return false;
        }
        if (!(referenciaOrigen == null ? other.referenciaOrigen == null : referenciaOrigen.equals(other.referenciaOrigen))) {
            return false;
        }
        if (!(contrato == null ? other.contrato == null : contrato.equals(other.contrato))) {
            return false;
        }
        if (!(referenciaCliente == null ? other.referenciaCliente == null : referenciaCliente.equals(other.referenciaCliente))) {
            return false;
        }
        if (!(usuario == null ? other.usuario == null : usuario.equals(other.usuario))) {
            return false;
        }
        if (!(leyendaEdoCta == null ? other.leyendaEdoCta == null : leyendaEdoCta.equals(other.leyendaEdoCta))) {
            return false;
        }
        if (!(speiXID == null ? other.speiXID == null : speiXID.equals(other.speiXID))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((codigoRetorno == null) ? 0 : codigoRetorno.hashCode());
        result = PRIME * result + ((codigoError == null) ? 0 : codigoError.hashCode());
        result = PRIME * result + ((numConfirmacion == null) ? 0 : numConfirmacion.hashCode());
        result = PRIME * result + ((leyenda == null) ? 0 : leyenda.hashCode());
        result = PRIME * result + ((sentido == null) ? 0 : sentido.hashCode());
        result = PRIME * result + ((origen == null) ? 0 : origen.hashCode());
        result = PRIME * result + ((numTransaccion == null) ? 0 : numTransaccion.hashCode());
        result = PRIME * result + ((fechaEquipo == null) ? 0 : fechaEquipo.hashCode());
        result = PRIME * result + ((horaEquipo == null) ? 0 : horaEquipo.hashCode());
        result = PRIME * result + ((fechaMensaje == null) ? 0 : fechaMensaje.hashCode());
        result = PRIME * result + ((horasMensaje == null) ? 0 : horasMensaje.hashCode());
        result = PRIME * result + ((fechaOperacion == null) ? 0 : fechaOperacion.hashCode());
        result = PRIME * result + ((tipoPago == null) ? 0 : tipoPago.hashCode());
        result = PRIME * result + ((prioridad == null) ? 0 : prioridad.hashCode());
        result = PRIME * result + ((topologia == null) ? 0 : topologia.hashCode());
        result = PRIME * result + ((bancoBeneficiario == null) ? 0 : bancoBeneficiario.hashCode());
        result = PRIME * result + ((ordenante == null) ? 0 : ordenante.hashCode());
        result = PRIME * result + ((beneficiario == null) ? 0 : beneficiario.hashCode());
        result = PRIME * result + ((conceptoPago == null) ? 0 : conceptoPago.hashCode());
        result = PRIME * result + ((impuestoIVA == null) ? 0 : impuestoIVA.hashCode());
        result = PRIME * result + ((referenciaNumerica == null) ? 0 : referenciaNumerica.hashCode());
        result = PRIME * result + ((referenciaCobranza == null) ? 0 : referenciaCobranza.hashCode());
        result = PRIME * result + ((claveRastreo == null) ? 0 : claveRastreo.hashCode());
        result = PRIME * result + ((importe == null) ? 0 : importe.hashCode());
        result = PRIME * result + ((conceptoPagoExt == null) ? 0 : conceptoPagoExt.hashCode());
        result = PRIME * result + ((clavePago == null) ? 0 : clavePago.hashCode());
        result = PRIME * result + ((vostro == null) ? 0 : vostro.hashCode());
        result = PRIME * result + ((tipoOperacion == null) ? 0 : tipoOperacion.hashCode());
        result = PRIME * result + ((claveDevolucion == null) ? 0 : claveDevolucion.hashCode());
        result = PRIME * result + ((referenciaOrigen == null) ? 0 : referenciaOrigen.hashCode());
        result = PRIME * result + ((contrato == null) ? 0 : contrato.hashCode());
        result = PRIME * result + ((referenciaCliente == null) ? 0 : referenciaCliente.hashCode());
        result = PRIME * result + ((usuario == null) ? 0 : usuario.hashCode());
        result = PRIME * result + ((leyendaEdoCta == null) ? 0 : leyendaEdoCta.hashCode());
        result = PRIME * result + ((speiXID == null) ? 0 : speiXID.hashCode());
        return result;
    }
}
