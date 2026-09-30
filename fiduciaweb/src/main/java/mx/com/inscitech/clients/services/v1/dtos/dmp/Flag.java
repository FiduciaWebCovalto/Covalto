package mx.com.inscitech.clients.services.v1.dtos.dmp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flag {
    
    @JsonProperty("PORTA_HSBC_CANCELACION")
    private String portaHsbcCancelacion;

    @JsonProperty("FECHAAPERTURARANGO")
    private String fechaAperturaRango;

    @JsonProperty("EMAIL")
    private String email;

    @JsonProperty("PORTA_HSBC_ALTA")
    private String portaHsbcAlta;

    @JsonProperty("REUSE")
    private String reuse;

    @JsonProperty("ACDO")
    private String acdo;

    @JsonProperty("AUTOCOTEJO")
    private String autocotejo;

    @JsonProperty("TEMPLATE_CONTRATO")
    private String templateContrato;

    @JsonProperty("SEGMENTS")
    private String segments;

    @JsonProperty("PORTA_OTROS_ALTA")
    private String portaOtrosAlta;

    @JsonProperty("CATMANDCLCLINE")
    private String catmandclcline;

    @JsonProperty("TEMPLATE")
    private String template;

    @JsonProperty("EXCLUSIONS")
    private String exclusions;

    @JsonProperty("FIRMA")
    private String firma;
    
    public Flag() {
        super();
    }

    public Flag(String portaHsbcCancelacion, String fechaAperturaRango, String email, String portaHsbcAlta, String reuse, String acdo, String autocotejo, String templateContrato,
                String segments, String portaOtrosAlta, String catmandclcline, String template, String exclusions, String firma) {
        this.portaHsbcCancelacion = portaHsbcCancelacion;
        this.fechaAperturaRango = fechaAperturaRango;
        this.email = email;
        this.portaHsbcAlta = portaHsbcAlta;
        this.reuse = reuse;
        this.acdo = acdo;
        this.autocotejo = autocotejo;
        this.templateContrato = templateContrato;
        this.segments = segments;
        this.portaOtrosAlta = portaOtrosAlta;
        this.catmandclcline = catmandclcline;
        this.template = template;
        this.exclusions = exclusions;
        this.firma = firma;
    }

    public void setPortaHsbcCancelacion(String portaHsbcCancelacion) {
        this.portaHsbcCancelacion = portaHsbcCancelacion;
    }

    public String getPortaHsbcCancelacion() {
        return portaHsbcCancelacion;
    }

    public void setFechaAperturaRango(String fechaAperturaRango) {
        this.fechaAperturaRango = fechaAperturaRango;
    }

    public String getFechaAperturaRango() {
        return fechaAperturaRango;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPortaHsbcAlta(String portaHsbcAlta) {
        this.portaHsbcAlta = portaHsbcAlta;
    }

    public String getPortaHsbcAlta() {
        return portaHsbcAlta;
    }

    public void setReuse(String reuse) {
        this.reuse = reuse;
    }

    public String getReuse() {
        return reuse;
    }

    public void setAcdo(String acdo) {
        this.acdo = acdo;
    }

    public String getAcdo() {
        return acdo;
    }

    public void setAutocotejo(String autocotejo) {
        this.autocotejo = autocotejo;
    }

    public String getAutocotejo() {
        return autocotejo;
    }

    public void setTemplateContrato(String templateContrato) {
        this.templateContrato = templateContrato;
    }

    public String getTemplateContrato() {
        return templateContrato;
    }

    public void setSegments(String segments) {
        this.segments = segments;
    }

    public String getSegments() {
        return segments;
    }

    public void setPortaOtrosAlta(String portaOtrosAlta) {
        this.portaOtrosAlta = portaOtrosAlta;
    }

    public String getPortaOtrosAlta() {
        return portaOtrosAlta;
    }

    public void setCatmandclcline(String catmandclcline) {
        this.catmandclcline = catmandclcline;
    }

    public String getCatmandclcline() {
        return catmandclcline;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTemplate() {
        return template;
    }

    public void setExclusions(String exclusions) {
        this.exclusions = exclusions;
    }

    public String getExclusions() {
        return exclusions;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }
}
