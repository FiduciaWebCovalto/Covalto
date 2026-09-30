package mx.com.inscitech.fiducia.common.beans;

/**
 * Clase utilizada para almacenar la informacion de un catalogo
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class CatalogInfoBean {

    /**
     * Variable que contiene el nombre de la clase del catalogo.
     * Ej. mx.gob.nafin.fiduciario.Catalogo
     */
    private String claseCatalogo;

    /**
     * Variable que contiene la cadena JSON del catalogo a trabajar
     */
    private String catalogo;

    /**
     * Variable para almacenar el formato de fecha a usar con el catalogo. El formato por defecto es dd/MM/yyyy.
     */
    private String dateFormat = "dd/MM/yyyy";

    public CatalogInfoBean() {
    }


    public void setCatalogo(String catalogo) {
        this.catalogo = catalogo;
    }


    public String getCatalogo() {
        return catalogo;
    }


    public void setClaseCatalogo(String claseCatalogo) {
        this.claseCatalogo = claseCatalogo;
    }


    public String getClaseCatalogo() {
        return claseCatalogo;
    }


    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }


    public String getDateFormat() {
        return dateFormat;
    }
}
