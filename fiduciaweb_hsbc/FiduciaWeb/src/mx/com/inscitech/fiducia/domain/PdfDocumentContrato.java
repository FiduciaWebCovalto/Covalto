package mx.com.inscitech.fiducia.domain;

public class PdfDocumentContrato {
    public PdfDocumentContratoId id;
    public String filePath;
    public String contentType;
    public String nombre;

    public void setId(PdfDocumentContratoId id) {
        this.id = id;
    }

    public PdfDocumentContratoId getId() {
        return id;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
