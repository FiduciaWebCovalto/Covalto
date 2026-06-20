package mx.com.inscitech.fiducia.domain;

public class PdfDocument {
    public Long folio;
    public String nombre;
    public String filePath;
    public String contentType;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFolio(Long folio) {
        this.folio = folio;
    }

    public Long getFolio() {
        return folio;
    }
    
    public PdfDocument(String nombre, String filePath) {
        this.nombre = nombre;
        this.filePath = filePath;
    }


    public PdfDocument(Long folio, String filePath) {
        this.folio = folio;
        this.filePath = filePath;
    }


    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }
}
