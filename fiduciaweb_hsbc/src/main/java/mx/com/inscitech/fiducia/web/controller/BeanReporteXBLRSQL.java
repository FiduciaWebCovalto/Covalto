package mx.com.inscitech.fiducia.web.controller;

public class BeanReporteXBLRSQL {

    private String sheetName = "";
    private String sheetSQL = "";

    public BeanReporteXBLRSQL() {
        super();
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetSQL(String sheetSQL) {
        this.sheetSQL = sheetSQL;
    }

    public String getSheetSQL() {
        return sheetSQL;
    }
}
