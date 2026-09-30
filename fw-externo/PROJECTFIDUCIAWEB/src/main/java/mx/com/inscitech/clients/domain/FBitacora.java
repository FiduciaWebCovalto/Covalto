package mx.com.inscitech.clients.domain;




import java.math.BigDecimal;
import java.time.OffsetDateTime;



public class FBitacora {

    public FBitacoraDTO id;

    public FBitacora(FBitacoraDTO id, String fbitDescripcion) {
        this.id = id;
        this.fbitDescripcion = fbitDescripcion;
    }
    private String fbitDescripcion;

   

    public String getFbitDescripcion() {
        return fbitDescripcion;
    }

    public void setFbitDescripcion(final String fbitDescripcion) {
        this.fbitDescripcion = fbitDescripcion;
    }


    public void setId(FBitacoraDTO id) {
        this.id = id;
    }

    public FBitacoraDTO getId() {
        return id;
    }
}
