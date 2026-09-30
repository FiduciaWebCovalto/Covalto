package mx.com.inscitech.fiducia.procesos.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "secciones")
@XmlAccessorType(XmlAccessType.FIELD)
public class Secciones {

    @XmlElement(name = "seccion", required = true)
    private List<Seccion> secciones = null;

    public Secciones() {
        super();
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }

    public List<Seccion> getSecciones() {
        return secciones;
    }

}
