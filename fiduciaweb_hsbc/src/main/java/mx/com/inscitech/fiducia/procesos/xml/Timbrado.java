package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "timbrado")
@XmlAccessorType(XmlAccessType.FIELD)
public class Timbrado {

    @XmlElement(name = "clientesURL", defaultValue = "http://localhost:7101/Fiduciario/ClientesServiceSoap12HttpPort")
    private String clientesURL = null;

    @XmlElement(name = "input-file-path", defaultValue = "D:\\Temp\\Inscitech\\Actinver\\EDOCTA")
    private String inputFilePath = null;

    @XmlElement(name = "output-file-path", defaultValue = "D:\\Temp\\Inscitech\\Actinver\\EDOCTA")
    private String outputFilePath = null;

    @XmlElement(name = "character-set", defaultValue = "UTF-8")
    private String characterSet = "UTF-8";

    @XmlElement(name = "useSystemOut", defaultValue = "true")
    private boolean useSystemOut = true;

    @XmlElement(name = "log-level", defaultValue = "ERROR")
    private String logLevel = "ERROR";

    @XmlElement(name = "after-read", defaultValue = "DELETE")
    private String afterRead = "DELETE";

    @XmlElement(name = "processed-file-location")
    private String processedFileLocation = null;

    //@XmlElement(name="cadena-meses")
    //private String cadenaMeses = null;

    @XmlElement(name = "identificador-cliente", defaultValue = "Client")
    private String identificadorCliente = "";

    @XmlElement(name = "identificador-seccion", defaultValue = "--------------   ")
    private String identificadorSeccion = "";

    @XmlElement(name = "saltar-lineas-cliente", defaultValue = "1")
    private int saltarLineas = 1;

    @XmlElement(name = "output-prefix", defaultValue = "Confirmaciones_FW_")
    private String outputPrefix = "";

    @XmlElement(name = "output-ext", defaultValue = ".txt")
    private String outputExt = "";

    @XmlElement(name = "line-delimiter", defaultValue = "CR")
    private String lineDelimiter = "\n";

    @XmlElement(name = "periodo", defaultValue = "AGOSTO 2014")
    private String periodo = null;

    @XmlElement(name = "useClientFieldNames", defaultValue = "true")
    private boolean useClientFieldNames = true;

    @XmlElement(name = "client-fields", required = true)
    private ClientFields clientFields = null;

    @XmlElement(name = "compra-text", defaultValue = "COMPRA")
    private String compraText = "COMPRA";

    @XmlElement(name = "venta-text", defaultValue = "VENTA")
    private String ventaText = "VENTA";

    @XmlElement(name = "timbrado-info", required = true)
    private TimbradoInfo timbradoInfo = null;

    @XmlElement(name = "send-mail", defaultValue = "true")
    private boolean sendMail = true;

    @XmlElement(name = "mail-service")
    private MailServiceConfig mailService = null;

    @XmlElement(name = "secciones-detalle", required = true)
    private Secciones secciones = null;

    @XmlElement(name = "campos-agrupar", required = true)
    private Campos campos = null;

    public Timbrado() {
        super();
    }

    public void setClientesURL(String clientesURL) {
        this.clientesURL = clientesURL;
    }

    public String getClientesURL() {
        return clientesURL;
    }

    public void setInputFilePath(String inputFilePath) {
        this.inputFilePath = inputFilePath;
    }

    public String getInputFilePath() {
        return inputFilePath;
    }

    public void setOutputFilePath(String outputFilePath) {
        this.outputFilePath = outputFilePath;
    }

    public String getOutputFilePath() {
        return outputFilePath;
    }

    public void setUseSystemOut(boolean useSystemOut) {
        this.useSystemOut = useSystemOut;
    }

    public boolean isUseSystemOut() {
        return useSystemOut;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setAfterRead(String afterRead) {
        this.afterRead = afterRead;
    }

    public String getAfterRead() {
        return afterRead;
    }

    public void setIdentificadorCliente(String identificadorCliente) {
        this.identificadorCliente = identificadorCliente;
    }

    public String getIdentificadorCliente() {
        return identificadorCliente;
    }

    public void setOutputPrefix(String outputPrefix) {
        this.outputPrefix = outputPrefix;
    }

    public String getOutputPrefix() {
        return outputPrefix;
    }

    public void setOutputExt(String outputExt) {
        this.outputExt = outputExt;
    }

    public String getOutputExt() {
        return outputExt;
    }

    public void setLineDelimiter(String lineDelimiter) {
        this.lineDelimiter = lineDelimiter;
    }

    public String getLineDelimiter() {
        return lineDelimiter;
    }

    public void setUseClientFieldNames(boolean useClientFieldNames) {
        this.useClientFieldNames = useClientFieldNames;
    }

    public boolean isUseClientFieldNames() {
        return useClientFieldNames;
    }

    public void setClientFields(ClientFields clientFields) {
        this.clientFields = clientFields;
    }

    public ClientFields getClientFields() {
        return clientFields;
    }

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    public String getCharacterSet() {
        return characterSet;
    }

    public void setTimbradoInfo(TimbradoInfo timbradoInfo) {
        this.timbradoInfo = timbradoInfo;
    }

    public TimbradoInfo getTimbradoInfo() {
        return timbradoInfo;
    }

    public void setProcessedFileLocation(String processedFileLocation) {
        this.processedFileLocation = processedFileLocation;
    }

    public String getProcessedFileLocation() {
        return processedFileLocation;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setSecciones(Secciones secciones) {
        this.secciones = secciones;
    }

    public Secciones getSecciones() {
        return secciones;
    }

    public void setCampos(Campos campos) {
        this.campos = campos;
    }

    public Campos getCampos() {
        return campos;
    }

    public void setCompraText(String compraText) {
        this.compraText = compraText;
    }

    public String getCompraText() {
        return compraText;
    }

    public void setVentaText(String ventaText) {
        this.ventaText = ventaText;
    }

    public String getVentaText() {
        return ventaText;
    }

    public void setIdentificadorSeccion(String identificadorSeccion) {
        this.identificadorSeccion = identificadorSeccion;
    }

    public String getIdentificadorSeccion() {
        return identificadorSeccion;
    }

    public void setSaltarLineas(int saltarLineas) {
        this.saltarLineas = saltarLineas;
    }

    public int getSaltarLineas() {
        return saltarLineas;
    }

    public void setSendMail(boolean sendMail) {
        this.sendMail = sendMail;
    }

    public boolean isSendMail() {
        return sendMail;
    }

    public void setMailService(MailServiceConfig mailService) {
        this.mailService = mailService;
    }

    public MailServiceConfig getMailService() {
        return mailService;
    }

}
