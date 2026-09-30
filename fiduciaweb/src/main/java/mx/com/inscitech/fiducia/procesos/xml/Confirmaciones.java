package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "confirmaciones")
@XmlAccessorType(XmlAccessType.FIELD)
public class Confirmaciones {

    @XmlElement(name = "clientesURL", defaultValue = "http://localhost:7101/Fiduciario/ClientesServiceSoap12HttpPort")
    private String clientesURL = null;

    @XmlElement(name = "input-file-path", defaultValue = "D:\\Temp\\Inscitech\\Actinver\\EDOCTA")
    private String inputFilePath = null;

    @XmlElement(name = "output-file-path", defaultValue = "D:\\Temp\\Inscitech\\Actinver\\EDOCTA")
    private String outputFilePath = null;

    @XmlElement(name = "useSystemOut", defaultValue = "true")
    private boolean useSystemOut = true;

    @XmlElement(name = "print-lines", defaultValue = "true")
    private boolean printLines = true;

    @XmlElement(name = "log-level", defaultValue = "ERROR")
    private String logLevel = "ERROR";

    @XmlElement(name = "after-read", defaultValue = "DELETE")
    private String afterRead = "DELETE";

    @XmlElement(name = "processed-file-location")
    private String processedFileLocation = null;

    @XmlElement(name = "identificador-cliente", defaultValue = "Client")
    private String identificadorCliente = "";

    @XmlElement(name = "output-prefix", defaultValue = "Confirmaciones_FW_")
    private String outputPrefix = "";

    @XmlElement(name = "output-ext", defaultValue = ".txt")
    private String outputExt = "";

    @XmlElement(name = "line-delimiter", defaultValue = "CR")
    private String lineDelimiter = "\n";

    @XmlElement(name = "send-mail", defaultValue = "true")
    private boolean sendMail = true;

    @XmlElement(name = "mail-service")
    private MailServiceConfig mailService = null;

    @XmlElement(name = "pdf-font-size", defaultValue = "6")
    private int fontSize = 6;

    @XmlElement(name = "saltar-lineas-cliente", defaultValue = "5")
    private int saltarLineas = 5;

    @XmlElement(name = "useClientFieldNames", defaultValue = "true")
    private boolean useClientFieldNames = true;

    @XmlElement(name = "client-fields", required = true)
    private ClientFields clientFields = null;

    @XmlElement(name = "pdf-header-info") //, required=true
    private PDFHeaderInfo headerInfo = null;

    public Confirmaciones() {
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

    public void setSendMail(boolean sendMail) {
        this.sendMail = sendMail;
    }

    public boolean isSendMail() {
        return sendMail;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setSaltarLineas(int saltarLineas) {
        this.saltarLineas = saltarLineas;
    }

    public int getSaltarLineas() {
        return saltarLineas;
    }

    public void setHeaderInfo(PDFHeaderInfo headerInfo) {
        this.headerInfo = headerInfo;
    }

    public PDFHeaderInfo getHeaderInfo() {
        return headerInfo;
    }

    public void setMailService(MailServiceConfig mailService) {
        this.mailService = mailService;
    }

    public MailServiceConfig getMailService() {
        return mailService;
    }

    public void setPrintLines(boolean printLines) {
        this.printLines = printLines;
    }

    public boolean isPrintLines() {
        return printLines;
    }
}
