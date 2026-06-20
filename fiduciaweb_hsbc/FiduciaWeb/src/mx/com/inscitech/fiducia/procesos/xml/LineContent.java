package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlType(name = "lineContent")
@XmlAccessorType(XmlAccessType.FIELD)
public class LineContent {

    @XmlValue
    private String value = null;

    public LineContent() {
        super();
    }

    public LineContent(String value) {
        super();
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
