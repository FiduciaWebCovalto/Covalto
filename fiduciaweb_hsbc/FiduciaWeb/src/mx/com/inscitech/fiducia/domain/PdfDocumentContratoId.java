package mx.com.inscitech.fiducia.domain;

public class PdfDocumentContratoId {
    private Long folio;
    private Long fiso;
    private Long persona;
    public void setFolio(Long folio) {
        this.folio = folio;
    }

    public Long getFolio() {
        return folio;
    }

    public void setPersona(Long persona) {
        this.persona = persona;
    }

    public Long getPersona() {
        return persona;
    }

    public void setFiso(Long fiso) {
        this.fiso = fiso;
    }

    public Long getFiso() {
        return fiso;
    }
}
