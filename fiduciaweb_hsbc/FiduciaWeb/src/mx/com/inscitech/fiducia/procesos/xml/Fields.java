package mx.com.inscitech.fiducia.procesos.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "fields")
@XmlAccessorType(XmlAccessType.FIELD)
public class Fields {

    @XmlElement(name = "field", nillable = false, required = true)
    private List<Field> fields = null;

    public Fields() {
        super();
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Field> getFields() {
        return fields;
    }

}
