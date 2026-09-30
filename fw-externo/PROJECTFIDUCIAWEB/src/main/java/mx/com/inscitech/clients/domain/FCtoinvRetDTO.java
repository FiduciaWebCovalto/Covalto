package mx.com.inscitech.clients.domain;

public class FCtoinvRetDTO {
    private Long fcinIdCtoInversion;
    private Long fretIdRetiro;

    public void setFcinIdCtoInversion(Long fcinIdCtoInversion) {
        this.fcinIdCtoInversion = fcinIdCtoInversion;
    }

    public Long getFcinIdCtoInversion() {
        return fcinIdCtoInversion;
    }

    public void setFretIdRetiro(Long fretIdRetiro) {
        this.fretIdRetiro = fretIdRetiro;
    }

    public FCtoinvRetDTO(Long fcinIdCtoInversion, Long fretIdRetiro) {
        this.fcinIdCtoInversion = fcinIdCtoInversion;
        this.fretIdRetiro = fretIdRetiro;
    }

    public Long getFretIdRetiro() {
        return fretIdRetiro;
    }
}
