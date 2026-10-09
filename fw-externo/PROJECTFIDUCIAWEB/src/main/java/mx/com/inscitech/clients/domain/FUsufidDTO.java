package mx.com.inscitech.clients.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FUsufidDTO {
    @SerializedName("contrato")
    public List<FUsufid> contrato;
    public String fusuIdUsuario;
    public String fusuNombreUsuario;
    public String getFusuIdUsuario(){
            return fusuIdUsuario;
        }    


        public void setFusuIdUsuario(final String fusuIdusuario){
             this.fusuIdUsuario = fusuIdusuario;   
        }
        public String getFusuNombreUsuario() {
            return fusuNombreUsuario;
        }

        public void setFusuNombreUsuario(final String fusuNombreUsuario) {
            this.fusuNombreUsuario = fusuNombreUsuario;
        }    
    public List<FUsufid> getContrato() { return contrato; }
    public void setContrato(List<FUsufid> contrato) { this.contrato = contrato; }
}
