package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "campo")
@XmlAccessorType(XmlAccessType.FIELD)
public class Campo {

    @XmlElement(name = "nombre", required = true)
    private String nombre = null;

    @XmlElement(name = "incluir-siempre", defaultValue = "false")
    private boolean incluirSiempre = false;

    @XmlElement(name = "valor-inicial", defaultValue = "0.00")
    private String valorInicial = null;

    @XmlElement(name = "value-from", defaultValue = "0.00")
    private String valueFrom = "115-130";

    private String valor = null;

    private int valueStartFrom = 115;
    private int valueLength = 130;

    public Campo() {
        super();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIncluirSiempre(boolean incluirSiempre) {
        this.incluirSiempre = incluirSiempre;
    }

    public boolean isIncluirSiempre() {
        return incluirSiempre;
    }

    public void setValorInicial(String valorInicial) {
        this.valorInicial = valorInicial;
    }

    public String getValorInicial() {
        return valorInicial;
    }

    public void setValueFrom(String valueFrom) {
        this.valueFrom = valueFrom;
        String[] tmpValue = null;
        if (valueFrom != null && valueFrom.indexOf("-") != -1) {
            tmpValue = valueFrom.split("-");
            valueStartFrom = Integer.parseInt(tmpValue[0]);
            valueLength = Integer.parseInt(tmpValue[1]);
        }
    }

    public String getValueFrom() {
        return valueFrom;
    }

    public void setValueStartFrom(int valueStartFrom) {
        this.valueStartFrom = valueStartFrom;
    }

    public int getValueStartFrom() {
        return valueStartFrom;
    }

    public void setValueLength(int valueLength) {
        this.valueLength = valueLength;
    }

    public int getValueLength() {
        return valueLength;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
