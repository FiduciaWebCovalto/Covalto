package mx.com.inscitech.fiducia.common.beans;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

public class Company {

    private int number;
    private String name;
    private String area;
    private String adderss;
    private String authorizationName;
    private String signatureName;
    private String language;
    private String style;
    private String changedDate;
    private String key;

    public Company() {
        super();
    }

    public Company(DataRow companyData) {
        super();
        if (companyData == null)
            return;
        this.number = companyData.getInteger("EMP_NUM_EMPRESA");
        this.name = companyData.getString("EMP_NOM_EMPRESA");
        this.area = companyData.getString("EMP_NOM_AREA");
        this.adderss = companyData.getString("EMP_DIRECCION");
        this.authorizationName = companyData.getString("EMP_NOM_AUTORIZA");
        this.signatureName = companyData.getString("EMP_NOM_FIRMA");
        this.language = companyData.getString("EMP_IDIOMA");
        this.style = companyData.getString("EMP_ESTILO");
        this.changedDate = companyData.getString("EMP_FEC_CAMBIO");
        this.key = companyData.getString("EMP_LLAVE_EMPRESA");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAuthorizationName(String authorizationName) {
        this.authorizationName = authorizationName;
    }

    public String getAuthorizationName() {
        return authorizationName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public String getSignatureName() {
        return signatureName;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setChangedDate(String changedDate) {
        this.changedDate = changedDate;
    }

    public String getChangedDate() {
        return changedDate;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
