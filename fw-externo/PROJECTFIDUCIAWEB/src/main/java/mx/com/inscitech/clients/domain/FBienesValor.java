package mx.com.inscitech.clients.domain;




import java.math.BigDecimal;



public class FBienesValor {

    public FBienesValorDTO id;

    public FBienesValor(FBienesValorDTO id) {
        this.id = id;
    }

    public void setId(FBienesValorDTO id) {
        this.id = id;
    }

    public FBienesValorDTO getId() {
        return id;
    }
}
