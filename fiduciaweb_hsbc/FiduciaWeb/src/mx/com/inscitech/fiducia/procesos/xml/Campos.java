package mx.com.inscitech.fiducia.procesos.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "campos-agrupar")
@XmlAccessorType(XmlAccessType.FIELD)
public class Campos {

    @XmlElement(name = "campo", required = true)
    private List<Campo> campos = null;

    public Campos() {
        super();
    }

    public void setCampos(List<Campo> campos) {
        this.campos = campos;
    }

    public List<Campo> getCampos() {
        return campos;
    }
}
