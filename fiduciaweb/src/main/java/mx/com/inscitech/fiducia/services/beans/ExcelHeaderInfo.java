package mx.com.inscitech.fiducia.services.beans;

public class ExcelHeaderInfo {

    private String source = ""; //Nombre de la columna en el DataSet
    private String name = ""; //Nombre que se le pondra a la columna en el Excel

    public ExcelHeaderInfo(String source, String name) {
        this.source = source;
        this.name = name;
    }

    public String getSource() {
        return this.source;
    }

    public String getName() {
        return this.name;
    }
}
