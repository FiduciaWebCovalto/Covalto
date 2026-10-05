package mx.com.inscitech.clients.services.v1.dtos.dmp;


public class Information {

    private String account;
    private String acronymBl;
    private String porpuse;
    private Product product;

    public Information() {
        super();
    }

    public Information(String account, String acronymBl, String porpuse, Product product) {
        this.account = account;
        this.acronymBl = acronymBl;
        this.porpuse = porpuse;
        this.product = product;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAcronymBl(String acronymBl) {
        this.acronymBl = acronymBl;
    }

    public String getAcronymBl() {
        return acronymBl;
    }

    public void setPorpuse(String porpuse) {
        this.porpuse = porpuse;
    }

    public String getPorpuse() {
        return porpuse;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
