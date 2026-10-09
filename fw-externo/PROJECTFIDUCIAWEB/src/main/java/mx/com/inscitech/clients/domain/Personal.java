package mx.com.inscitech.clients.domain;



public class Personal {


    private Long perNumUsuario;

    private String perNomUsuario;
    @Override
    public String toString() {
        return  this.perNumUsuario+"-"+this.perNomUsuario;
    }  
    public Long getPerNumUsuario() {
        return perNumUsuario;
    }

    public void setPerNumUsuario(Long perNumUsuario) {
        this.perNumUsuario = perNumUsuario;
    }

    public String getPerNomUsuario() {
        return perNomUsuario;
    }

    public void setPerNomUsuario(String perNomUsuario) {
        this.perNomUsuario = perNomUsuario;
    }
}
