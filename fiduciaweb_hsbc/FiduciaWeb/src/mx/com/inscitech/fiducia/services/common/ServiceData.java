package mx.com.inscitech.fiducia.services.common;

import java.util.ArrayList;


public class ServiceData {

    private ArrayList<ServiceAttribute> atributos = null;

    public ServiceData() {
        super();
        atributos = new ArrayList<ServiceAttribute>();
    }

    public void addAttribute(ServiceAttribute attribute) {
        atributos.add(attribute);
    }

    public void setAtributos(ArrayList<ServiceAttribute> atributos) {
        this.atributos = atributos;
    }

    public ArrayList<ServiceAttribute> getAtributos() {
        return atributos;
    }

}
