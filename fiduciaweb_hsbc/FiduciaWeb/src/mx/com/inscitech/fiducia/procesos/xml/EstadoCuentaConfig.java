package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "estados-cuenta")
@XmlAccessorType(XmlAccessType.FIELD)
public class EstadoCuentaConfig {

    @XmlElement(name = "clientesURL", defaultValue = "http://localhost:7101/Fiduciario/ClientesServiceSoap12HttpPort")
    private String clientesURL = null;

    @XmlElement(name = "input-file-path", defaultValue = "D:\\Temp\\Inscitech\\Actinver\\EDOCTA")
    private String inputFilePath = null;

    @XmlElement(name = "output-file-path", defaultValue = "D:\\Temp\\Inscitech\\Actinver\\EDOCTA")
    private String outputFilePath = null;

    @XmlElement(name = "character-set", defaultValue = "ISO-8859-1")
    private String characterSet = null;

    @XmlElement(name = "useSystemOut", defaultValue = "true")
    private boolean useSystemOut = true;

    @XmlElement(name = "log-level", defaultValue = "ERROR")
    private String logLevel = "ERROR";

    @XmlElement(name = "after-read", defaultValue = "DELETE")
    private String afterRead = "DELETE";

    @XmlElement(name = "processed-file-location")
    private String processedFileLocation = null;

    //@XmlElement(name="cadena-meses", defaultValue="|ENE|FEB|MAR|ABR|MAY|JUN|JUL|AGO|SEP|OCT|NOV|DIC|")
    //private String cadenaMeses = "|ENE|FEB|MAR|ABR|MAY|JUN|JUL|AGO|SEP|OCT|NOV|DIC|";

    @XmlElement(name = "identificador-cliente", defaultValue = "ACCOUNT NAME")
    private String identificadorCliente = "";

    @XmlElement(name = "identificador-no-cliente", defaultValue = "ACCOUNT NUMBER")
    private String identificadorNoCliente = "";

    @XmlElement(name = "identificador-seccion", defaultValue = "--------------   ")
    private String identificadorSeccion = "";

    @XmlElement(name = "output-prefix", defaultValue = "Estado_De_Cuenta_FW_")
    private String outputPrefix = "";

    @XmlElement(name = "output-ext", defaultValue = ".txt")
    private String outputExt = "";

    @XmlElement(name = "file-start", defaultValue = "INICIO")
    private String fileStart = "";

    @XmlElement(name = "file-end", defaultValue = "FIN")
    private String fileEnd = "";

    @XmlElement(name = "line-delimiter", defaultValue = "CR")
    private String lineDelimiter = "\n";

    @XmlElement(name = "client-start", defaultValue = "CLIENT")
    private String clientStart = "CLIENT";

    @XmlElement(name = "client-prefix", defaultValue = "CLIENT")
    private String clientPrefix = "\n";

    @XmlElement(name = "useClientFieldNames", defaultValue = "true")
    private boolean useClientFieldNames = true;

    @XmlElement(name = "saltar-lineas-cliente", defaultValue = "1")
    private int saltarLineas = 1;

    @XmlElement(name = "client-fields", required = true)
    private ClientFields clientFields = null;

    @XmlElement(name = "send-mail", defaultValue = "true")
    private boolean sendMail = true;

    @XmlElement(name = "mail-service")
    private MailServiceConfig mailService = null;

    @XmlElement(name = "secciones", required = true)
    private Secciones secciones = null;

    public EstadoCuentaConfig() {
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

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    public String getCharacterSet() {
        return characterSet;
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

    public void setIdentificadorCliente(String identificadorCliente) {
        this.identificadorCliente = identificadorCliente;
    }

    public String getIdentificadorCliente() {
        return identificadorCliente;
    }

    public void setIdentificadorSeccion(String identificadorSeccion) {
        this.identificadorSeccion = identificadorSeccion;
    }

    public String getIdentificadorSeccion() {
        return identificadorSeccion;
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

    public void setFileStart(String fileStart) {
        this.fileStart = fileStart;
    }

    public String getFileStart() {
        return fileStart;
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

    public void setSecciones(Secciones secciones) {
        this.secciones = secciones;
    }

    public Secciones getSecciones() {
        return secciones;
    }

    public void setFileEnd(String fileEnd) {
        this.fileEnd = fileEnd;
    }

    public String getFileEnd() {
        return fileEnd;
    }

    public void setClientStart(String clientStart) {
        this.clientStart = clientStart;
    }

    public String getClientStart() {
        return clientStart;
    }

    public void setClientPrefix(String clientPrefix) {
        this.clientPrefix = clientPrefix;
    }

    public String getClientPrefix() {
        return clientPrefix;
    }

    public void setAfterRead(String afterRead) {
        if (afterRead != null)
            afterRead = afterRead.toUpperCase();
        this.afterRead = afterRead;
    }

    public String getAfterRead() {
        if (afterRead != null)
            afterRead = afterRead.toUpperCase();
        return afterRead;
    }

    public void setProcessedFileLocation(String processedFileLocation) {
        this.processedFileLocation = processedFileLocation;
    }

    public String getProcessedFileLocation() {
        return processedFileLocation;
    }

    public void setIdentificadorNoCliente(String identificadorNoCliente) {
        this.identificadorNoCliente = identificadorNoCliente;
    }

    public String getIdentificadorNoCliente() {
        return identificadorNoCliente;
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
