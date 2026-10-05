package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "field")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClientField {

    @XmlAttribute(name = "source", required = true)
    private String source = null;

    @XmlAttribute(name = "default", required = true)
    private String defaultValue = null;

    @XmlAttribute(name = "printable")
    private boolean printable = false;

    @XmlValue
    private String value = null;

    public ClientField() {
        super();
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setPrintable(boolean printable) {
        this.printable = printable;
    }

    public boolean isPrintable() {
        return printable;
    }

}
