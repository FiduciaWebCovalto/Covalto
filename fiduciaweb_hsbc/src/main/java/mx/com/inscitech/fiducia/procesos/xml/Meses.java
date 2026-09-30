package mx.com.inscitech.fiducia.procesos.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "meses-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class Meses {

    @XmlElement(name = "mes", required = true)
    private List<MesInfo> meses = null;

    public Meses() {
        super();
    }

    public void setMeses(List<MesInfo> meses) {
        this.meses = meses;
    }

    public List<MesInfo> getMeses() {
        return meses;
    }

}
