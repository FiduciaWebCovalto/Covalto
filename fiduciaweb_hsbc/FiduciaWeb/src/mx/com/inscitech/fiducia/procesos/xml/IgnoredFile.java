package mx.com.inscitech.fiducia.procesos.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ignore-files")
@XmlAccessorType(XmlAccessType.FIELD)
public class IgnoredFile {

    @XmlElement(name = "item", required = true)
    private List<GenericItem> ignoredFiles = null;

    public IgnoredFile() {
        super();
    }

    public void setIgnoredFiles(List<GenericItem> ignoredFiles) {
        this.ignoredFiles = ignoredFiles;
    }

    public List<GenericItem> getIgnoredFiles() {
        return ignoredFiles;
    }

}
