package mx.com.inscitech.clients.services.v1.dtos.peps;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

public class RequestCdd implements Serializable {

    @SuppressWarnings("compatibility:-8783094931169368512")
    private static final long serialVersionUID = -1611362707393513755L;

    private String actEspecifica = StringUtils.EMPTY;
    private String bussinessType = StringUtils.EMPTY;
    private String curp = StringUtils.EMPTY;
    private String customerType = StringUtils.EMPTY;
    private String cveOwner = StringUtils.EMPTY;
    private String dob = StringUtils.EMPTY;
    private String employmentRole = StringUtils.EMPTY;
    private String familyType = StringUtils.EMPTY;
    private String lastName = StringUtils.EMPTY;
    private String lineofBusiness = StringUtils.EMPTY;
    private String nacionality = StringUtils.EMPTY;
    private String name = StringUtils.EMPTY;

    @JsonProperty("nFolio")
    private String nFolio = StringUtils.EMPTY;

    private String ntb = StringUtils.EMPTY;
    private String numCis = StringUtils.EMPTY;
    private String paisResidencia = StringUtils.EMPTY;
    private String paisTransfAltoRiesgo = StringUtils.EMPTY;
    private String perfil = StringUtils.EMPTY;
    private String promotor = StringUtils.EMPTY;
    private String ram = StringUtils.EMPTY;
    private String relacion = StringUtils.EMPTY;
    private String requestSystem = StringUtils.EMPTY;
    private String rfc = StringUtils.EMPTY;
    private String source = StringUtils.EMPTY;
    private String statusCIS = StringUtils.EMPTY;
    private String sucursal = StringUtils.EMPTY;

    public RequestCdd() {
        super();
    }

    public RequestCdd(String actEspecifica, String bussinessType, String curp, String customerType, String cveOwner, String dob, String employmentRole, String familyType,
                      String lastName, String lineofBusiness, String nacionality, String name, String nFolio, String ntb, String numCis, String paisResidencia,
                      String paisTransfAltoRiesgo, String perfil, String promotor, String ram, String relacion, String requestSystem, String rfc, String source, String statusCIS,
                      String sucursal) {
        this.actEspecifica = actEspecifica;
        this.bussinessType = bussinessType;
        this.curp = curp;
        this.customerType = customerType;
        this.cveOwner = cveOwner;
        this.dob = dob;
        this.employmentRole = employmentRole;
        this.familyType = familyType;
        this.lastName = lastName;
        this.lineofBusiness = lineofBusiness;
        this.nacionality = nacionality;
        this.name = name;
        this.nFolio = nFolio;
        this.ntb = ntb;
        this.numCis = numCis;
        this.paisResidencia = paisResidencia;
        this.paisTransfAltoRiesgo = paisTransfAltoRiesgo;
        this.perfil = perfil;
        this.promotor = promotor;
        this.ram = ram;
        this.relacion = relacion;
        this.requestSystem = requestSystem;
        this.rfc = rfc;
        this.source = source;
        this.statusCIS = statusCIS;
        this.sucursal = sucursal;
    }

    public void setActEspecifica(String actEspecifica) {
        this.actEspecifica = actEspecifica;
    }

    public String getActEspecifica() {
        return actEspecifica;
    }

    public void setBussinessType(String bussinessType) {
        this.bussinessType = bussinessType;
    }

    public String getBussinessType() {
        return bussinessType;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCveOwner(String cveOwner) {
        this.cveOwner = cveOwner;
    }

    public String getCveOwner() {
        return cveOwner;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setEmploymentRole(String employmentRole) {
        this.employmentRole = employmentRole;
    }

    public String getEmploymentRole() {
        return employmentRole;
    }

    public void setFamilyType(String familyType) {
        this.familyType = familyType;
    }

    public String getFamilyType() {
        return familyType;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLineofBusiness(String lineofBusiness) {
        this.lineofBusiness = lineofBusiness;
    }

    public String getLineofBusiness() {
        return lineofBusiness;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNFolio(String nFolio) {
        this.nFolio = nFolio;
    }

    public String getNFolio() {
        return nFolio;
    }

    public void setNtb(String ntb) {
        this.ntb = ntb;
    }

    public String getNtb() {
        return ntb;
    }

    public void setNumCis(String numCis) {
        this.numCis = numCis;
    }

    public String getNumCis() {
        return numCis;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisTransfAltoRiesgo(String paisTransfAltoRiesgo) {
        this.paisTransfAltoRiesgo = paisTransfAltoRiesgo;
    }

    public String getPaisTransfAltoRiesgo() {
        return paisTransfAltoRiesgo;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPromotor(String promotor) {
        this.promotor = promotor;
    }

    public String getPromotor() {
        return promotor;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRam() {
        return ram;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRequestSystem(String requestSystem) {
        this.requestSystem = requestSystem;
    }

    public String getRequestSystem() {
        return requestSystem;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setStatusCIS(String statusCIS) {
        this.statusCIS = statusCIS;
    }

    public String getStatusCIS() {
        return statusCIS;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getSucursal() {
        return sucursal;
    }
}

