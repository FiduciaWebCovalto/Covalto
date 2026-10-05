package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "mes")
@XmlAccessorType(XmlAccessType.FIELD)
public class MesInfo {

    @XmlAttribute(name = "id", required = true)
    private String id = null;

    @XmlAttribute(name = "nombreLargo")
    private String nombreLargo = null;

    @XmlValue
    private String mes = null;

    public MesInfo() {
        super();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setNombreLargo(String nombreLargo) {
        this.nombreLargo = nombreLargo;
    }

    public String getNombreLargo() {
        return nombreLargo;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

}
