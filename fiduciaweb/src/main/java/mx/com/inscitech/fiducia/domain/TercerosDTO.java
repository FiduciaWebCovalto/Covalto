package mx.com.inscitech.fiducia.domain;

public class TercerosDTO {
    public String terNomTercero = null;
    public String terCveTipoPers = null;
    public Terceros id;

    public void setTerNomTercero(String terNomTercero) {
        this.terNomTercero = terNomTercero;
    }

    public String getTerNomTercero() {
        return terNomTercero;
    }

    public void setTerCveTipoPers(String terCveTipoPers) {
        this.terCveTipoPers = terCveTipoPers;
    }

    public String getTerCveTipoPers() {
        return terCveTipoPers;
    }

    public void setId(Terceros id) {
        this.id = id;
    }

    public Terceros getId() {
        return id;
    }
}
