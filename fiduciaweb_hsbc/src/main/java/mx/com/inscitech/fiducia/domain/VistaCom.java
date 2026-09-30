package mx.com.inscitech.fiducia.domain;

public class VistaCom {
    public Long fiso;
        public String nombre;
        public String finalidad;
        public String fecha;

    public void setFiso(Long fiso) {
        this.fiso = fiso;
    }

    public Long getFiso() {
        return fiso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFinalidad(String finalidad) {
        this.finalidad = finalidad;
    }

    public String getFinalidad() {
        return finalidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }
}
