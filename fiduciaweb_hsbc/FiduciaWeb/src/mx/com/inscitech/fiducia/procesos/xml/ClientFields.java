package mx.com.inscitech.fiducia.procesos.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "client-fields")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClientFields {

    @XmlElement(name = "field", required = true)
    private List<ClientField> clientFields = null;

    public ClientFields() {
        super();
    }


    public void setClientFields(List<ClientField> clientFields) {
        this.clientFields = clientFields;
    }

    public List<ClientField> getClientFields() {
        return clientFields;
    }

}
