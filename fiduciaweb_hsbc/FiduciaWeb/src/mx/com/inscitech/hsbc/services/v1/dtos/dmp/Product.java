package mx.com.inscitech.hsbc.services.v1.dtos.dmp;


public class Product {

    private String key;
    private String value;

    public Product() {
        super();
    }

    public Product(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
