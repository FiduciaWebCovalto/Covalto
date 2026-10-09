package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class GenericItem {

    @XmlValue
    private String value = null;

    @XmlAttribute(name = "type")
    private String type = null;

    @XmlAttribute(name = "dataType")
    private String dataType = null;

    public GenericItem() {
        super();
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataType() {
        return dataType;
    }

}
