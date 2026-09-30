package mx.com.inscitech.clients.domain;







import java.math.BigDecimal;
import java.time.OffsetDateTime;



public class FDeposito {

 
    private Long fdpoIdDeposito;

    
    private BigDecimal fdpoImporteDeposito;

    
    private OffsetDateTime fdepFecha;

    
    private BigDecimal fdpoCbaInstitucion;

    
    private BigDecimal fdepMoneda;

    
    private BigDecimal fdpoConceptoDep;

    
    private BigDecimal fcinIdCtoInversion;

    
    private String fdepDescripcion;

    
    private String fdepStatus;

    
    private BigDecimal ftpfIdTipoPer;


    public FDeposito(Long fdpoIdDeposito, BigDecimal fdpoImporteDeposito, OffsetDateTime fdepFecha,
                     BigDecimal fdpoCbaInstitucion, BigDecimal fdepMoneda, BigDecimal fdpoConceptoDep,
                     BigDecimal fcinIdCtoInversion, String fdepDescripcion, String fdepStatus, BigDecimal ftpfIdTipoPer,
                     BigDecimal ftpfIdPersona, BigDecimal ffidIdFideicomiso, BigDecimal fdpoTipoCambioProv,
                     BigDecimal fdpoTipoCambioFirme, BigDecimal fdpoCtaCheques, BigDecimal fdpoSubcta) {
        this.fdpoIdDeposito = fdpoIdDeposito;
        this.fdpoImporteDeposito = fdpoImporteDeposito;
        this.fdepFecha = fdepFecha;
        this.fdpoCbaInstitucion = fdpoCbaInstitucion;
        this.fdepMoneda = fdepMoneda;
        this.fdpoConceptoDep = fdpoConceptoDep;
        this.fcinIdCtoInversion = fcinIdCtoInversion;
        this.fdepDescripcion = fdepDescripcion;
        this.fdepStatus = fdepStatus;
        this.ftpfIdTipoPer = ftpfIdTipoPer;
        this.ftpfIdPersona = ftpfIdPersona;
        this.ffidIdFideicomiso = ffidIdFideicomiso;
        this.fdpoTipoCambioProv = fdpoTipoCambioProv;
        this.fdpoTipoCambioFirme = fdpoTipoCambioFirme;
        this.fdpoCtaCheques = fdpoCtaCheques;
        this.fdpoSubcta = fdpoSubcta;
    }
    private BigDecimal ftpfIdPersona;

    
    private BigDecimal ffidIdFideicomiso;

    
    private BigDecimal fdpoTipoCambioProv;

    
    private BigDecimal fdpoTipoCambioFirme;

    
    private BigDecimal fdpoCtaCheques;

    
    private BigDecimal fdpoSubcta;

    public Long getFdpoIdDeposito() {
        return fdpoIdDeposito;
    }

    public void setFdpoIdDeposito(final Long fdpoIdDeposito) {
        this.fdpoIdDeposito = fdpoIdDeposito;
    }

    public BigDecimal getFdpoImporteDeposito() {
        return fdpoImporteDeposito;
    }

    public void setFdpoImporteDeposito(final BigDecimal fdpoImporteDeposito) {
        this.fdpoImporteDeposito = fdpoImporteDeposito;
    }

    public OffsetDateTime getFdepFecha() {
        return fdepFecha;
    }

    public void setFdepFecha(final OffsetDateTime fdepFecha) {
        this.fdepFecha = fdepFecha;
    }

    public BigDecimal getFdpoCbaInstitucion() {
        return fdpoCbaInstitucion;
    }

    public void setFdpoCbaInstitucion(final BigDecimal fdpoCbaInstitucion) {
        this.fdpoCbaInstitucion = fdpoCbaInstitucion;
    }

    public BigDecimal getFdepMoneda() {
        return fdepMoneda;
    }

    public void setFdepMoneda(final BigDecimal fdepMoneda) {
        this.fdepMoneda = fdepMoneda;
    }

    public BigDecimal getFdpoConceptoDep() {
        return fdpoConceptoDep;
    }

    public void setFdpoConceptoDep(final BigDecimal fdpoConceptoDep) {
        this.fdpoConceptoDep = fdpoConceptoDep;
    }

    public BigDecimal getFcinIdCtoInversion() {
        return fcinIdCtoInversion;
    }

    public void setFcinIdCtoInversion(final BigDecimal fcinIdCtoInversion) {
        this.fcinIdCtoInversion = fcinIdCtoInversion;
    }

    public String getFdepDescripcion() {
        return fdepDescripcion;
    }

    public void setFdepDescripcion(final String fdepDescripcion) {
        this.fdepDescripcion = fdepDescripcion;
    }

    public String getFdepStatus() {
        return fdepStatus;
    }

    public void setFdepStatus(final String fdepStatus) {
        this.fdepStatus = fdepStatus;
    }

    public BigDecimal getFtpfIdTipoPer() {
        return ftpfIdTipoPer;
    }

    public void setFtpfIdTipoPer(final BigDecimal ftpfIdTipoPer) {
        this.ftpfIdTipoPer = ftpfIdTipoPer;
    }

    public BigDecimal getFtpfIdPersona() {
        return ftpfIdPersona;
    }

    public void setFtpfIdPersona(final BigDecimal ftpfIdPersona) {
        this.ftpfIdPersona = ftpfIdPersona;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return ffidIdFideicomiso;
    }

    public void setFfidIdFideicomiso(final BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFdpoTipoCambioProv() {
        return fdpoTipoCambioProv;
    }

    public void setFdpoTipoCambioProv(final BigDecimal fdpoTipoCambioProv) {
        this.fdpoTipoCambioProv = fdpoTipoCambioProv;
    }

    public BigDecimal getFdpoTipoCambioFirme() {
        return fdpoTipoCambioFirme;
    }

    public void setFdpoTipoCambioFirme(final BigDecimal fdpoTipoCambioFirme) {
        this.fdpoTipoCambioFirme = fdpoTipoCambioFirme;
    }

    public BigDecimal getFdpoCtaCheques() {
        return fdpoCtaCheques;
    }

    public void setFdpoCtaCheques(final BigDecimal fdpoCtaCheques) {
        this.fdpoCtaCheques = fdpoCtaCheques;
    }

    public BigDecimal getFdpoSubcta() {
        return fdpoSubcta;
    }

    public void setFdpoSubcta(final BigDecimal fdpoSubcta) {
        this.fdpoSubcta = fdpoSubcta;
    }

}
