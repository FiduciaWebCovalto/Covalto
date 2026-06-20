package mx.com.inscitech.fiducia.domain;

public class VistaMov {
    public Long folio;
        public Long fiso;
        public String fecha;
        public String tipo;

    public void setFolio(Long folio) {
        this.folio = folio;
    }

    public Long getFolio() {
        return folio;
    }

    public void setFiso(Long fiso) {
        this.fiso = fiso;
    }

    public Long getFiso() {
        return fiso;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getImporte() {
        return importe;
    }
    public String importe;
}
