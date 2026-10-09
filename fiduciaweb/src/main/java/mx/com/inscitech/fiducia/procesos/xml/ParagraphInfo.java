package mx.com.inscitech.fiducia.procesos.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "paragraph")
@XmlAccessorType(XmlAccessType.FIELD)
public class ParagraphInfo {

    @XmlElement(name = "fragment", required = true)
    private List<ParagraphFragment> fragments = null;

    public ParagraphInfo() {
        super();
    }

    public void setFragments(List<ParagraphFragment> fragments) {
        this.fragments = fragments;
    }

    public List<ParagraphFragment> getFragments() {
        return fragments;
    }

}
