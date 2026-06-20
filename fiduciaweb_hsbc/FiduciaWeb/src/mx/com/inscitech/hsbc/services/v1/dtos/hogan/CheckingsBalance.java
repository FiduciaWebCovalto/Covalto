package mx.com.inscitech.hsbc.services.v1.dtos.hogan;


public class CheckingsBalance {

    private String url = "http://localhost:8080/";
    private String path = "/v1/checkings-accounts/account-balance";
    private String companiaCliente = "20";
    private String cuenta = "4000000";
    private String producto = "0301011";
    
    public CheckingsBalance() {
        super();
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setCompaniaCliente(String companiaCliente) {
        this.companiaCliente = companiaCliente;
    }

    public String getCompaniaCliente() {
        return companiaCliente;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getProducto() {
        return producto;
    }
}
