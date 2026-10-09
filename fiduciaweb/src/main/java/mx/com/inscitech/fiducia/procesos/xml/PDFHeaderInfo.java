package mx.com.inscitech.fiducia.procesos.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pdf-header-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class PDFHeaderInfo {

    @XmlElement(name = "paragraph", required = true)
    private List<ParagraphInfo> paragraphInfo = null;

    public PDFHeaderInfo() {
        super();
    }

    public void setParagraphInfo(List<ParagraphInfo> paragraphInfo) {
        this.paragraphInfo = paragraphInfo;
    }

    public List<ParagraphInfo> getParagraphInfo() {
        return paragraphInfo;
    }

}
