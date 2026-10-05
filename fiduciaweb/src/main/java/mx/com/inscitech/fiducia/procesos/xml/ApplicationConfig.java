package mx.com.inscitech.fiducia.procesos.xml;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "application-config")
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationConfig {

    @XmlElement(name = "version", defaultValue = "ND")
    private String version = "";

    @XmlElement(name = "emulate-service", defaultValue = "false")
    private boolean emulateService = false;

    @XmlElement(name = "path-delimiter", defaultValue = "/")
    private String pathDelimiter = "/";

    @XmlElement(name = "ignore-files")
    private IgnoredFile filesToIgnore = null;

    @XmlElement(name = "meses-info")
    private Meses mesesInfo = null;

    @XmlElement(name = "estados-cuenta")
    private EstadoCuentaConfig estadoCuentaCFG = null;

    @XmlElement(name = "confirmaciones")
    private Confirmaciones confirmacionesCFG = null;

    @XmlElement(name = "timbrado")
    private Timbrado timbradoCFG = null;

    private HashMap<String, String> mesesMap = null;

    @XmlElement(name = "envioEstadosDeCuenta")
    private EnvioEDOCuentaConfig envioEDOCFG = null;

    @XmlElement(name = "mail-service")
    private MailServiceConfig mailService = null;

    public ApplicationConfig() {
        super();
    }

    public void setEstadoCuentaCFG(EstadoCuentaConfig estadoCuentaCFG) {
        this.estadoCuentaCFG = estadoCuentaCFG;
    }

    public EstadoCuentaConfig getEstadoCuentaCFG() {
        return estadoCuentaCFG;
    }

    public void setConfirmacionesCFG(Confirmaciones confirmacionesCFG) {
        this.confirmacionesCFG = confirmacionesCFG;
    }

    public Confirmaciones getConfirmacionesCFG() {
        return confirmacionesCFG;
    }

    public void setEmulateService(boolean emulateService) {
        this.emulateService = emulateService;
    }

    public boolean isEmulateService() {
        return emulateService;
    }

    public void setTimbradoCFG(Timbrado timbradoCFG) {
        this.timbradoCFG = timbradoCFG;
    }

    public Timbrado getTimbradoCFG() {
        return timbradoCFG;
    }

    public void setPathDelimiter(String pathDelimiter) {
        this.pathDelimiter = pathDelimiter;
    }

    public String getPathDelimiter() {
        return pathDelimiter;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setMesesInfo(Meses mesesInfo) {
        this.mesesInfo = mesesInfo;
    }

    public Meses getMesesInfo() {
        return mesesInfo;
    }

    public void setMesesMap(HashMap<String, String> mesesMap) {
        this.mesesMap = mesesMap;
    }

    public HashMap<String, String> getMesesMap() {
        return mesesMap;
    }

    public void setFilesToIgnore(IgnoredFile filesToIgnore) {
        this.filesToIgnore = filesToIgnore;
    }

    public IgnoredFile getFilesToIgnore() {
        return filesToIgnore;
    }

    public void setMailService(MailServiceConfig mailService) {
        this.mailService = mailService;
    }

    public MailServiceConfig getMailService() {
        return mailService;
    }

    public void setEnvioEDOCFG(EnvioEDOCuentaConfig envioEDOCFG) {
        this.envioEDOCFG = envioEDOCFG;
    }

    public EnvioEDOCuentaConfig getEnvioEDOCFG() {
        return envioEDOCFG;
    }
}
