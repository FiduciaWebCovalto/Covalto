package mx.com.inscitech.clients.services.v1.dtos.dmp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MatrixResponse {

    @JsonProperty("codigo")
    private int code;
    
    @JsonProperty("mensaje")
    private String message;
    
    @JsonProperty("objectResponse")
    private List<ProductDescription> products;

    public MatrixResponse() {
        super();
    }

    public MatrixResponse(int code, String message, List<ProductDescription> products) {
        this.code = code;
        this.message = message;
        this.products = products;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setProducts(List<ProductDescription> products) {
        this.products = products;
    }

    public List<ProductDescription> getProducts() {
        return products;
    }
}
