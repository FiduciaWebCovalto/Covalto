package mx.com.inscitech.clients.domain;







import java.math.BigDecimal;



public class Folios {

    public Long id;

    
    public BigDecimal folTipoFolio;

    
    public BigDecimal folNumFolio;

    
    public String folCveStFolio;

    
    public BigDecimal folNumPrueba;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public BigDecimal getFolTipoFolio() {
        return folTipoFolio;
    }

    public void setFolTipoFolio(final BigDecimal folTipoFolio) {
        this.folTipoFolio = folTipoFolio;
    }

    public BigDecimal getFolNumFolio() {
        return folNumFolio;
    }

    public void setFolNumFolio(final BigDecimal folNumFolio) {
        this.folNumFolio = folNumFolio;
    }

    public String getFolCveStFolio() {
        return folCveStFolio;
    }

    public void setFolCveStFolio(final String folCveStFolio) {
        this.folCveStFolio = folCveStFolio;
    }

    public BigDecimal getFolNumPrueba() {
        return folNumPrueba;
    }

    public void setFolNumPrueba(final BigDecimal folNumPrueba) {
        this.folNumPrueba = folNumPrueba;
    }

}
