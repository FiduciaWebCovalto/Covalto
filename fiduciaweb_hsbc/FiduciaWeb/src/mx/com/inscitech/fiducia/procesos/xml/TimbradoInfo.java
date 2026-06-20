package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "timbrado-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class TimbradoInfo {

    @XmlElement(name = "seccion-origen", required = true)
    private String seccionOrigen = null;

    @XmlElement(name = "banco-id", required = true)
    private String bancoID = null;

    @XmlElement(name = "field-separator", defaultValue = "|")
    private String fieldSeparator = "|";

    @XmlElement(name = "moneda", defaultValue = "MXN")
    private String moneda = "MXN";

    @XmlElement(name = "total-commisions-field", defaultValue = "TOTAL COMMISSIONS")
    private String totalCommisionsField = "TOTAL COMMISSIONS";

    @XmlElement(name = "total-amount-ops-field", defaultValue = "TOTAL AMOUNT OPS")
    private String totalAmountOpsField = "TOTAL AMOUNT OPS";

    @XmlElement(name = "tipo-cfd", defaultValue = "ECB")
    private String tipoCFD = "ECB";

    @XmlElement(name = "lugar-expedicion", defaultValue = "Mexico D.F.")
    private String lugarExpedicion = "Mexico D.F.";

    @XmlElement(name = "iva-field", defaultValue = "IVA")
    private String ivaField = "IVA";

    @XmlElement(name = "tasa-iva", defaultValue = "16")
    private String tasaIVA = "16";

    @XmlElement(name = "isr-field", defaultValue = "ISR")
    private String isrField = "ISR";

    @XmlElement(name = "periodo-base", defaultValue = "Ejercicio Fiscal")
    private String periodoBase = "Ejercicio Fiscal";

    @XmlElement(name = "periodo-fecha", defaultValue = "yyyy")
    private String periodoFecha = "yyyy";

    @XmlElement(name = "codigo-terminacion-factura", defaultValue = "99")
    private String codigoTerminacionFactura = "99";

    @XmlElement(name = "codigo-terminacion-archivo", defaultValue = "9999")
    private String codigoTerminacionArchivo = "9999";

    @XmlElement(name = "linea-trece-fija", defaultValue = "Movimiento ECB Fiscal|0.00|MXN|0.00|0.00|")
    private String lineaTreceFija = "9999";

    @XmlElement(name = "descripcion05", defaultValue = "Comisiones")
    private String descripcion05 = "Comisiones";

    @XmlElement(name = "motivo-descuento", defaultValue = "NA")
    private String motivoDescuento = "NA";

    @XmlElement(name = "tipoCambio", defaultValue = "1.00")
    private String tipoCambio = "1.00";

    @XmlElement(name = "forma-pago", defaultValue = "Pago en una sola exhibicion")
    private String formaPago = "Pago en una sola exhibicion";

    @XmlElement(name = "condiciones-pago", defaultValue = "NA")
    private String condicionesPago = "NA";

    @XmlElement(name = "metodo-pago", defaultValue = "Efectivo")
    private String metodoPago = "Efectivo";

    @XmlElement(name = "rfc-enajenante", defaultValue = "FSL140702F48")
    private String enajenanteRFC = "FSL140702F48";

    @XmlElement(name = "orden-datos-cliente", defaultValue = "RFC|NOMBRE|PAIS|CALLE|NOINTERIOR|NOEXTERIOR|COLONIA|LOCALIDAD|EMPTY|MUNICIPIO|ESTADO|CP|TELEFONO")
    private String ordenDatosCliente =
        "RFC|NOMBRE|PAIS(MEXICO)|CALLE|NOEXTERIOR( )|NOINTERIOR( )|COLONIA( )|LOCALIDAD( )|EMPTY|MUNICIPIO( )|ESTADO(DISTRITO FEDERAL)|CP|TELEFONO( )";

    public TimbradoInfo() {
        super();
    }

    public void setSeccionOrigen(String seccionOrigen) {
        this.seccionOrigen = seccionOrigen;
    }

    public String getSeccionOrigen() {
        return seccionOrigen;
    }

    public void setActinverID(String actinverID) {
        this.bancoID = actinverID;
    }

    public String getActinverID() {
        return bancoID;
    }

    public void setFieldSeparator(String fieldSeparator) {
        this.fieldSeparator = fieldSeparator;
    }

    public String getFieldSeparator() {
        return fieldSeparator;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setTotalCommisionsField(String totalCommisionsField) {
        this.totalCommisionsField = totalCommisionsField;
    }

    public String getTotalCommisionsField() {
        return totalCommisionsField;
    }

    public void setTotalAmountOpsField(String totalAmountOpsField) {
        this.totalAmountOpsField = totalAmountOpsField;
    }

    public String getTotalAmountOpsField() {
        return totalAmountOpsField;
    }

    public void setTipoCFD(String tipoCFD) {
        this.tipoCFD = tipoCFD;
    }

    public String getTipoCFD() {
        return tipoCFD;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setIvaField(String ivaField) {
        this.ivaField = ivaField;
    }

    public String getIvaField() {
        return ivaField;
    }

    public void setTasaIVA(String tasaIVA) {
        this.tasaIVA = tasaIVA;
    }

    public String getTasaIVA() {
        return tasaIVA;
    }

    public void setIsrField(String isrField) {
        this.isrField = isrField;
    }

    public String getIsrField() {
        return isrField;
    }

    public void setPeriodoBase(String periodoBase) {
        this.periodoBase = periodoBase;
    }

    public String getPeriodoBase() {
        return periodoBase;
    }

    public void setPeriodoFecha(String periodoFecha) {
        this.periodoFecha = periodoFecha;
    }

    public String getPeriodoFecha() {
        return periodoFecha;
    }

    public void setCodigoTerminacionFactura(String codigoTerminacionFactura) {
        this.codigoTerminacionFactura = codigoTerminacionFactura;
    }

    public String getCodigoTerminacionFactura() {
        return codigoTerminacionFactura;
    }

    public void setCodigoTerminacionArchivo(String codigoTerminacionArchivo) {
        this.codigoTerminacionArchivo = codigoTerminacionArchivo;
    }

    public String getCodigoTerminacionArchivo() {
        return codigoTerminacionArchivo;
    }

    public void setLineaTreceFija(String lineaTreceFija) {
        this.lineaTreceFija = lineaTreceFija;
    }

    public String getLineaTreceFija() {
        return lineaTreceFija;
    }

    public void setDescripcion05(String descripcion05) {
        this.descripcion05 = descripcion05;
    }

    public String getDescripcion05() {
        return descripcion05;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setCondicionesPago(String condicionesPago) {
        this.condicionesPago = condicionesPago;
    }

    public String getCondicionesPago() {
        return condicionesPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setEnajenanteRFC(String enajenanteRFC) {
        this.enajenanteRFC = enajenanteRFC;
    }

    public String getEnajenanteRFC() {
        return enajenanteRFC;
    }

    public void setOrdenDatosCliente(String ordenDatosCliente) {
        this.ordenDatosCliente = ordenDatosCliente;
    }

    public String getOrdenDatosCliente() {
        return ordenDatosCliente;
    }
}
