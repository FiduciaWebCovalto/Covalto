package mx.com.inscitech.fiducia.services.common;

public class ServiceAttribute {

    private String name = null;
    private String value = null;

    public ServiceAttribute() {
        super();
    }

    public ServiceAttribute(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
