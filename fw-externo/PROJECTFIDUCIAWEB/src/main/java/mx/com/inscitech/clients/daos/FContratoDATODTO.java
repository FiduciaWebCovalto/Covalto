package mx.com.inscitech.clients.daos;

public class FContratoDATODTO {
    public String fiso;
    public String usuario;
    public void setFiso(String fiso){this.fiso=fiso;}
    public String getFiso(){return this.fiso;}
    public void setUsuario(String fiso){this.usuario=usuario;}
    public String getUsuario(){return this.usuario;}
    
    @Override
    public String toString() {
        return  this.fiso+"-"+this.usuario;
    }
}
