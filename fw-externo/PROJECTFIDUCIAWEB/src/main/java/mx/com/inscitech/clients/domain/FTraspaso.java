package mx.com.inscitech.clients.domain;







import java.math.BigDecimal;
import java.time.OffsetDateTime;



public class FTraspaso {

    public FTraspaso(Long ftspIdTraspaso, BigDecimal ftspImporteTraspaso, BigDecimal fcinIdCtoInversionOrigen,
                     BigDecimal fcinIdCtoInversionDestino, BigDecimal ffidIdFideicomiso, String ftspStatus,
                     BigDecimal ftspTipoCambioProv, BigDecimal ftspTipoCambioFirme, OffsetDateTime ftspFecha, BigDecimal ftspSubctaOrigen,
                     BigDecimal ftspSubctaDestino, String ftspConcepto) {
        this.ftspIdTraspaso = ftspIdTraspaso;
        this.ftspImporteTraspaso = ftspImporteTraspaso;
        this.fcinIdCtoInversionOrigen = fcinIdCtoInversionOrigen;
        this.fcinIdCtoInversionDestino = fcinIdCtoInversionDestino;
        this.ftspStatus = ftspStatus;
        this.ffidIdFideicomiso = ffidIdFideicomiso;
        this.ftspTipoCambioProv = ftspTipoCambioProv;
        this.ftspTipoCambioFirme = ftspTipoCambioFirme;
        this.ftspFecha = ftspFecha;
        this.ftspSubctaDestino = ftspSubctaDestino;
        this.ftspSubctaOrigen = ftspSubctaOrigen;
        this.ftspConcepto = ftspConcepto;
    }

    private Long ftspIdTraspaso;

    
    private BigDecimal ftspImporteTraspaso;

    
    private BigDecimal fcinIdCtoInversionOrigen;

    
    private BigDecimal fcinIdCtoInversionDestino;

    private String ftspStatus;

    
    private BigDecimal ffidIdFideicomiso;

    
    private BigDecimal ftspTipoCambioProv;

    
    private BigDecimal ftspTipoCambioFirme;

    
    private OffsetDateTime ftspFecha;

    
    private BigDecimal ftspSubctaDestino;

    
    private BigDecimal ftspSubctaOrigen;

    private String ftspConcepto;

    public Long getFtspIdTraspaso() {
        return ftspIdTraspaso;
    }

    public void setFtspIdTraspaso(final Long ftspIdTraspaso) {
        this.ftspIdTraspaso = ftspIdTraspaso;
    }

    public BigDecimal getFtspImporteTraspaso() {
        return ftspImporteTraspaso;
    }

    public void setFtspImporteTraspaso(final BigDecimal ftspImporteTraspaso) {
        this.ftspImporteTraspaso = ftspImporteTraspaso;
    }

    public BigDecimal getFcinIdCtoInversionOrigen() {
        return fcinIdCtoInversionOrigen;
    }

    public void setFcinIdCtoInversionOrigen(final BigDecimal fcinIdCtoInversionOrigen) {
        this.fcinIdCtoInversionOrigen = fcinIdCtoInversionOrigen;
    }

    public BigDecimal getFcinIdCtoInversionDestino() {
        return fcinIdCtoInversionDestino;
    }

    public void setFcinIdCtoInversionDestino(final BigDecimal fcinIdCtoInversionDestino) {
        this.fcinIdCtoInversionDestino = fcinIdCtoInversionDestino;
    }

    public String getFtspStatus() {
        return ftspStatus;
    }

    public void setFtspStatus(final String ftspStatus) {
        this.ftspStatus = ftspStatus;
    }

    public BigDecimal getFfidIdFideicomiso() {
        return ffidIdFideicomiso;
    }

    public void setFfidIdFideicomiso(final BigDecimal ffidIdFideicomiso) {
        this.ffidIdFideicomiso = ffidIdFideicomiso;
    }

    public BigDecimal getFtspTipoCambioProv() {
        return ftspTipoCambioProv;
    }

    public void setFtspTipoCambioProv(final BigDecimal ftspTipoCambioProv) {
        this.ftspTipoCambioProv = ftspTipoCambioProv;
    }

    public BigDecimal getFtspTipoCambioFirme() {
        return ftspTipoCambioFirme;
    }

    public void setFtspTipoCambioFirme(final BigDecimal ftspTipoCambioFirme) {
        this.ftspTipoCambioFirme = ftspTipoCambioFirme;
    }

    public OffsetDateTime getFtspFecha() {
        return ftspFecha;
    }

    public void setFtspFecha(final OffsetDateTime ftspFecha) {
        this.ftspFecha = ftspFecha;
    }

    public BigDecimal getFtspSubctaDestino() {
        return ftspSubctaDestino;
    }

    public void setFtspSubctaDestino(final BigDecimal ftspSubctaDestino) {
        this.ftspSubctaDestino = ftspSubctaDestino;
    }

    public BigDecimal getFtspSubctaOrigen() {
        return ftspSubctaOrigen;
    }

    public void setFtspSubctaOrigen(final BigDecimal ftspSubctaOrigen) {
        this.ftspSubctaOrigen = ftspSubctaOrigen;
    }

    public String getFtspConcepto() {
        return ftspConcepto;
    }

    public void setFtspConcepto(final String ftspConcepto) {
        this.ftspConcepto = ftspConcepto;
    }

}
