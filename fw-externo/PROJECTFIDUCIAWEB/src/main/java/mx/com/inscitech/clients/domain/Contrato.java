package mx.com.inscitech.clients.domain;








import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;


public class Contrato {

    public Long id;

    
    public BigDecimal ctoNumContrato;

    
    public BigDecimal ctoNumCliente;

    
    public BigDecimal ctoNumCtoEje;

    
    public String ctoCveTipoNeg;

    
    public String ctoCveClasProd;

    
    public BigDecimal ctoNumProducto;

    public String ctoNomContrato;

    
    public String ctoCveFormaMan;

    
    public String ctoCveTipoPer;

    
    public String ctoCveRetencion;

    
    public BigDecimal ctoCveComiteTec;

    
    public BigDecimal ctoCveArt28;

    
    public BigDecimal ctoCveExclu30;

    
    public BigDecimal ctoCveMonExt;

    
    public BigDecimal ctoCveRevocable;

    
    public BigDecimal ctoCveRepProd;

    
    public String ctoNumOficioExe;

    
    public String ctoRegNalInvEx;

    
    public BigDecimal ctoAnoApertura;

    
    public BigDecimal ctoMesApertura;

    
    public BigDecimal ctoDiaApertura;

    
    public BigDecimal ctoAnoVencim;

    
    public BigDecimal ctoMesVencim;

    
    public BigDecimal ctoDiaVencim;

    
    public BigDecimal ctoAnoAnivers;

    
    public BigDecimal ctoMesAnivers;

    
    public BigDecimal ctoDiaAnivers;

    
    public BigDecimal ctoAnoCancela;

    
    public BigDecimal ctoMesCancela;

    
    public BigDecimal ctoDiaCancela;

    
    public String ctoFecInscRnie;

    
    public BigDecimal ctoAnoAltaReg;

    
    public BigDecimal ctoMesAltaReg;

    
    public BigDecimal ctoDiaAltaReg;

    
    public BigDecimal ctoAnoUltMod;

    
    public BigDecimal ctoMesUltMod;

    
    public BigDecimal ctoDiaUltMod;

    
    public String ctoCveStContrat;

    
    public BigDecimal ctoCveSubcto;

    
    public BigDecimal ctoNumNivel1;

    
    public BigDecimal ctoNumNivel2;

    
    public BigDecimal ctoNumNivel3;

    
    public BigDecimal ctoNumNivel4;

    
    public BigDecimal ctoNumNivel5;

    
    public String ctoRegShcp;

    
    public BigDecimal ctoCveShcp;

    
    public String ctoRegGobdf;

    
    public BigDecimal ctoCveGobdf;

    
    public BigDecimal ctoSubRama;

    public String ctoNomActividad;

    
    public String ctoTipoClient;

    
    public String ctoTipoPublic;

    
    public String ctoTipoContacto;

    
    public String ctoNumEscritura;

    
    public BigDecimal ctoNumNotario;

    
    public String ctoTipoAdmon;

    
    public BigDecimal ctoCveReqSors;

    public String ctoNumExpSors;

    public String ctoFecActShcp;

    
    public Boolean ctoFoseg;

    
    public Boolean ctoEnvioMens;

    
    public Boolean ctoFirmasMancomunadas;

    public String ctoEstInterfid;

    
    public String ctoTipoCont;

    public BigDecimal ctoTipoFiso;

    
    public BigDecimal ctoMoneda;

    
    public String ctoCveAreaInst;

    
    public String ctoEstatusFideicomiso;

    
    public String ctoEstatusActividad;

    
    public String ctoEstatusHogan;

    
    public String ctoManejaMonExt;

    
    public String ctoSubEstatusAct;

    
    public String ctoRiskRating;

    
    public String ctoTipoRemediacion;

    
    public String ctoEstatusRemediacion;

    
    public String ctoGrid;

    
    public String ctoSubEstatusReme;

    
    public String ctoFechaUltimaRev;

    
    public String ctoFechaProxRev;

    
    public Boolean ctoPendientesPredial;

    
    public Boolean ctoEmbargo;

    
    public String ctoClasificacionSat;

    
    public String ctoGiin;

    
    public String ctoRetencionesFisc;

    
    public String ctoTin;

    
    public String ctoExcento;

    public String ctoClasFatca;

    
    public Boolean ctoAutocerFatca;

    public String ctoClasCrs;

    
    public Boolean ctoAutocerCrc;

    
    public Boolean ctoPendientesRendCuenta;

    
    public Boolean ctoPendientesContables;

    
    public Boolean ctoCsem;

    
    public Boolean ctoHonorariosPend;

    
    public String ctoRfcFideicomiso;

    
    public String ctoPerHogan;

    
    public String ctoFecConst;

    
    public String ctoEmpresa;

    
    public String ctoPromFid;

    
    public String ctoRmLinNeg;

    
    public String ctoPromCliSpe;

    
    public String ctoCvePromCsHogan;

    
    public String ctoPromCliMan;

    
    public String ctoCvePromCmHogan;

    
    public String ctoSucursal;

    
    public String ctoLinNeg;

    
    public Boolean ctoJuicios;

    
    public String ctoObsJuicio;

    
    public String ctoFecContrato;

    
    public String ctoContPrivComen;

    
    public String ctoEscPubFec;

    
    public String ctoTipoEscritura;

    
    public String ctoRppFecIns;

    
    public String ctoRppLugReg;

    
    public String ctoRppFolio;

    
    public String ctoRppPartida;

    
    public String ctoRppVolumen;

    
    public String ctoRppFojas;

    
    public String ctoRppLibro;

    
    public String ctoRppSeccion;

    public String ctoCis;

    public String ctoNumAntLegacy;

    
    public String ctoSubdirector;

    
    public String ctoGrupo;

    
    public Boolean ctoPenFiscales;

    
    public Boolean ctoDocFaltante;

    
    public Set<Benefici> benNumContratoBeneficis = new HashSet<>();

    
    public Set<Fideicom> fidNumContratoFideicoms = new HashSet<>();

    
    public Set<Posicion> posNumContratoPosicions = new HashSet<>();

    public Set<Terceros> terNumContratoTerceroses = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public BigDecimal getCtoNumContrato() {
        return ctoNumContrato;
    }

    public void setCtoNumContrato(final BigDecimal ctoNumContrato) {
        this.ctoNumContrato = ctoNumContrato;
    }

    public BigDecimal getCtoNumCliente() {
        return ctoNumCliente;
    }

    public void setCtoNumCliente(final BigDecimal ctoNumCliente) {
        this.ctoNumCliente = ctoNumCliente;
    }

    public BigDecimal getCtoNumCtoEje() {
        return ctoNumCtoEje;
    }

    public void setCtoNumCtoEje(final BigDecimal ctoNumCtoEje) {
        this.ctoNumCtoEje = ctoNumCtoEje;
    }

    public String getCtoCveTipoNeg() {
        return ctoCveTipoNeg;
    }

    public void setCtoCveTipoNeg(final String ctoCveTipoNeg) {
        this.ctoCveTipoNeg = ctoCveTipoNeg;
    }

    public String getCtoCveClasProd() {
        return ctoCveClasProd;
    }

    public void setCtoCveClasProd(final String ctoCveClasProd) {
        this.ctoCveClasProd = ctoCveClasProd;
    }

    public BigDecimal getCtoNumProducto() {
        return ctoNumProducto;
    }

    public void setCtoNumProducto(final BigDecimal ctoNumProducto) {
        this.ctoNumProducto = ctoNumProducto;
    }

    public String getCtoNomContrato() {
        return ctoNomContrato;
    }

    public void setCtoNomContrato(final String ctoNomContrato) {
        this.ctoNomContrato = ctoNomContrato;
    }

    public String getCtoCveFormaMan() {
        return ctoCveFormaMan;
    }

    public void setCtoCveFormaMan(final String ctoCveFormaMan) {
        this.ctoCveFormaMan = ctoCveFormaMan;
    }

    public String getCtoCveTipoPer() {
        return ctoCveTipoPer;
    }

    public void setCtoCveTipoPer(final String ctoCveTipoPer) {
        this.ctoCveTipoPer = ctoCveTipoPer;
    }

    public String getCtoCveRetencion() {
        return ctoCveRetencion;
    }

    public void setCtoCveRetencion(final String ctoCveRetencion) {
        this.ctoCveRetencion = ctoCveRetencion;
    }

    public BigDecimal getCtoCveComiteTec() {
        return ctoCveComiteTec;
    }

    public void setCtoCveComiteTec(final BigDecimal ctoCveComiteTec) {
        this.ctoCveComiteTec = ctoCveComiteTec;
    }

    public BigDecimal getCtoCveArt28() {
        return ctoCveArt28;
    }

    public void setCtoCveArt28(final BigDecimal ctoCveArt28) {
        this.ctoCveArt28 = ctoCveArt28;
    }

    public BigDecimal getCtoCveExclu30() {
        return ctoCveExclu30;
    }

    public void setCtoCveExclu30(final BigDecimal ctoCveExclu30) {
        this.ctoCveExclu30 = ctoCveExclu30;
    }

    public BigDecimal getCtoCveMonExt() {
        return ctoCveMonExt;
    }

    public void setCtoCveMonExt(final BigDecimal ctoCveMonExt) {
        this.ctoCveMonExt = ctoCveMonExt;
    }

    public BigDecimal getCtoCveRevocable() {
        return ctoCveRevocable;
    }

    public void setCtoCveRevocable(final BigDecimal ctoCveRevocable) {
        this.ctoCveRevocable = ctoCveRevocable;
    }

    public BigDecimal getCtoCveRepProd() {
        return ctoCveRepProd;
    }

    public void setCtoCveRepProd(final BigDecimal ctoCveRepProd) {
        this.ctoCveRepProd = ctoCveRepProd;
    }

    public String getCtoNumOficioExe() {
        return ctoNumOficioExe;
    }

    public void setCtoNumOficioExe(final String ctoNumOficioExe) {
        this.ctoNumOficioExe = ctoNumOficioExe;
    }

    public String getCtoRegNalInvEx() {
        return ctoRegNalInvEx;
    }

    public void setCtoRegNalInvEx(final String ctoRegNalInvEx) {
        this.ctoRegNalInvEx = ctoRegNalInvEx;
    }

    public BigDecimal getCtoAnoApertura() {
        return ctoAnoApertura;
    }

    public void setCtoAnoApertura(final BigDecimal ctoAnoApertura) {
        this.ctoAnoApertura = ctoAnoApertura;
    }

    public BigDecimal getCtoMesApertura() {
        return ctoMesApertura;
    }

    public void setCtoMesApertura(final BigDecimal ctoMesApertura) {
        this.ctoMesApertura = ctoMesApertura;
    }

    public BigDecimal getCtoDiaApertura() {
        return ctoDiaApertura;
    }

    public void setCtoDiaApertura(final BigDecimal ctoDiaApertura) {
        this.ctoDiaApertura = ctoDiaApertura;
    }

    public BigDecimal getCtoAnoVencim() {
        return ctoAnoVencim;
    }

    public void setCtoAnoVencim(final BigDecimal ctoAnoVencim) {
        this.ctoAnoVencim = ctoAnoVencim;
    }

    public BigDecimal getCtoMesVencim() {
        return ctoMesVencim;
    }

    public void setCtoMesVencim(final BigDecimal ctoMesVencim) {
        this.ctoMesVencim = ctoMesVencim;
    }

    public BigDecimal getCtoDiaVencim() {
        return ctoDiaVencim;
    }

    public void setCtoDiaVencim(final BigDecimal ctoDiaVencim) {
        this.ctoDiaVencim = ctoDiaVencim;
    }

    public BigDecimal getCtoAnoAnivers() {
        return ctoAnoAnivers;
    }

    public void setCtoAnoAnivers(final BigDecimal ctoAnoAnivers) {
        this.ctoAnoAnivers = ctoAnoAnivers;
    }

    public BigDecimal getCtoMesAnivers() {
        return ctoMesAnivers;
    }

    public void setCtoMesAnivers(final BigDecimal ctoMesAnivers) {
        this.ctoMesAnivers = ctoMesAnivers;
    }

    public BigDecimal getCtoDiaAnivers() {
        return ctoDiaAnivers;
    }

    public void setCtoDiaAnivers(final BigDecimal ctoDiaAnivers) {
        this.ctoDiaAnivers = ctoDiaAnivers;
    }

    public BigDecimal getCtoAnoCancela() {
        return ctoAnoCancela;
    }

    public void setCtoAnoCancela(final BigDecimal ctoAnoCancela) {
        this.ctoAnoCancela = ctoAnoCancela;
    }

    public BigDecimal getCtoMesCancela() {
        return ctoMesCancela;
    }

    public void setCtoMesCancela(final BigDecimal ctoMesCancela) {
        this.ctoMesCancela = ctoMesCancela;
    }

    public BigDecimal getCtoDiaCancela() {
        return ctoDiaCancela;
    }

    public void setCtoDiaCancela(final BigDecimal ctoDiaCancela) {
        this.ctoDiaCancela = ctoDiaCancela;
    }

    public String getCtoFecInscRnie() {
        return ctoFecInscRnie;
    }

    public void setCtoFecInscRnie(final String ctoFecInscRnie) {
        this.ctoFecInscRnie = ctoFecInscRnie;
    }

    public BigDecimal getCtoAnoAltaReg() {
        return ctoAnoAltaReg;
    }

    public void setCtoAnoAltaReg(final BigDecimal ctoAnoAltaReg) {
        this.ctoAnoAltaReg = ctoAnoAltaReg;
    }

    public BigDecimal getCtoMesAltaReg() {
        return ctoMesAltaReg;
    }

    public void setCtoMesAltaReg(final BigDecimal ctoMesAltaReg) {
        this.ctoMesAltaReg = ctoMesAltaReg;
    }

    public BigDecimal getCtoDiaAltaReg() {
        return ctoDiaAltaReg;
    }

    public void setCtoDiaAltaReg(final BigDecimal ctoDiaAltaReg) {
        this.ctoDiaAltaReg = ctoDiaAltaReg;
    }

    public BigDecimal getCtoAnoUltMod() {
        return ctoAnoUltMod;
    }

    public void setCtoAnoUltMod(final BigDecimal ctoAnoUltMod) {
        this.ctoAnoUltMod = ctoAnoUltMod;
    }

    public BigDecimal getCtoMesUltMod() {
        return ctoMesUltMod;
    }

    public void setCtoMesUltMod(final BigDecimal ctoMesUltMod) {
        this.ctoMesUltMod = ctoMesUltMod;
    }

    public BigDecimal getCtoDiaUltMod() {
        return ctoDiaUltMod;
    }

    public void setCtoDiaUltMod(final BigDecimal ctoDiaUltMod) {
        this.ctoDiaUltMod = ctoDiaUltMod;
    }

    public String getCtoCveStContrat() {
        return ctoCveStContrat;
    }

    public void setCtoCveStContrat(final String ctoCveStContrat) {
        this.ctoCveStContrat = ctoCveStContrat;
    }

    public BigDecimal getCtoCveSubcto() {
        return ctoCveSubcto;
    }

    public void setCtoCveSubcto(final BigDecimal ctoCveSubcto) {
        this.ctoCveSubcto = ctoCveSubcto;
    }

    public BigDecimal getCtoNumNivel1() {
        return ctoNumNivel1;
    }

    public void setCtoNumNivel1(final BigDecimal ctoNumNivel1) {
        this.ctoNumNivel1 = ctoNumNivel1;
    }

    public BigDecimal getCtoNumNivel2() {
        return ctoNumNivel2;
    }

    public void setCtoNumNivel2(final BigDecimal ctoNumNivel2) {
        this.ctoNumNivel2 = ctoNumNivel2;
    }

    public BigDecimal getCtoNumNivel3() {
        return ctoNumNivel3;
    }

    public void setCtoNumNivel3(final BigDecimal ctoNumNivel3) {
        this.ctoNumNivel3 = ctoNumNivel3;
    }

    public BigDecimal getCtoNumNivel4() {
        return ctoNumNivel4;
    }

    public void setCtoNumNivel4(final BigDecimal ctoNumNivel4) {
        this.ctoNumNivel4 = ctoNumNivel4;
    }

    public BigDecimal getCtoNumNivel5() {
        return ctoNumNivel5;
    }

    public void setCtoNumNivel5(final BigDecimal ctoNumNivel5) {
        this.ctoNumNivel5 = ctoNumNivel5;
    }

    public String getCtoRegShcp() {
        return ctoRegShcp;
    }

    public void setCtoRegShcp(final String ctoRegShcp) {
        this.ctoRegShcp = ctoRegShcp;
    }

    public BigDecimal getCtoCveShcp() {
        return ctoCveShcp;
    }

    public void setCtoCveShcp(final BigDecimal ctoCveShcp) {
        this.ctoCveShcp = ctoCveShcp;
    }

    public String getCtoRegGobdf() {
        return ctoRegGobdf;
    }

    public void setCtoRegGobdf(final String ctoRegGobdf) {
        this.ctoRegGobdf = ctoRegGobdf;
    }

    public BigDecimal getCtoCveGobdf() {
        return ctoCveGobdf;
    }

    public void setCtoCveGobdf(final BigDecimal ctoCveGobdf) {
        this.ctoCveGobdf = ctoCveGobdf;
    }

    public BigDecimal getCtoSubRama() {
        return ctoSubRama;
    }

    public void setCtoSubRama(final BigDecimal ctoSubRama) {
        this.ctoSubRama = ctoSubRama;
    }

    public String getCtoNomActividad() {
        return ctoNomActividad;
    }

    public void setCtoNomActividad(final String ctoNomActividad) {
        this.ctoNomActividad = ctoNomActividad;
    }

    public String getCtoTipoClient() {
        return ctoTipoClient;
    }

    public void setCtoTipoClient(final String ctoTipoClient) {
        this.ctoTipoClient = ctoTipoClient;
    }

    public String getCtoTipoPublic() {
        return ctoTipoPublic;
    }

    public void setCtoTipoPublic(final String ctoTipoPublic) {
        this.ctoTipoPublic = ctoTipoPublic;
    }

    public String getCtoTipoContacto() {
        return ctoTipoContacto;
    }

    public void setCtoTipoContacto(final String ctoTipoContacto) {
        this.ctoTipoContacto = ctoTipoContacto;
    }

    public String getCtoNumEscritura() {
        return ctoNumEscritura;
    }

    public void setCtoNumEscritura(final String ctoNumEscritura) {
        this.ctoNumEscritura = ctoNumEscritura;
    }

    public BigDecimal getCtoNumNotario() {
        return ctoNumNotario;
    }

    public void setCtoNumNotario(final BigDecimal ctoNumNotario) {
        this.ctoNumNotario = ctoNumNotario;
    }

    public String getCtoTipoAdmon() {
        return ctoTipoAdmon;
    }

    public void setCtoTipoAdmon(final String ctoTipoAdmon) {
        this.ctoTipoAdmon = ctoTipoAdmon;
    }

    public BigDecimal getCtoCveReqSors() {
        return ctoCveReqSors;
    }

    public void setCtoCveReqSors(final BigDecimal ctoCveReqSors) {
        this.ctoCveReqSors = ctoCveReqSors;
    }

    public String getCtoNumExpSors() {
        return ctoNumExpSors;
    }

    public void setCtoNumExpSors(final String ctoNumExpSors) {
        this.ctoNumExpSors = ctoNumExpSors;
    }

    public String getCtoFecActShcp() {
        return ctoFecActShcp;
    }

    public void setCtoFecActShcp(final String ctoFecActShcp) {
        this.ctoFecActShcp = ctoFecActShcp;
    }

    public Boolean getCtoFoseg() {
        return ctoFoseg;
    }

    public void setCtoFoseg(final Boolean ctoFoseg) {
        this.ctoFoseg = ctoFoseg;
    }

    public Boolean getCtoEnvioMens() {
        return ctoEnvioMens;
    }

    public void setCtoEnvioMens(final Boolean ctoEnvioMens) {
        this.ctoEnvioMens = ctoEnvioMens;
    }

    public Boolean getCtoFirmasMancomunadas() {
        return ctoFirmasMancomunadas;
    }

    public void setCtoFirmasMancomunadas(final Boolean ctoFirmasMancomunadas) {
        this.ctoFirmasMancomunadas = ctoFirmasMancomunadas;
    }

    public String getCtoEstInterfid() {
        return ctoEstInterfid;
    }

    public void setCtoEstInterfid(final String ctoEstInterfid) {
        this.ctoEstInterfid = ctoEstInterfid;
    }

    public String getCtoTipoCont() {
        return ctoTipoCont;
    }

    public void setCtoTipoCont(final String ctoTipoCont) {
        this.ctoTipoCont = ctoTipoCont;
    }

    public BigDecimal getCtoTipoFiso() {
        return ctoTipoFiso;
    }

    public void setCtoTipoFiso(final BigDecimal ctoTipoFiso) {
        this.ctoTipoFiso = ctoTipoFiso;
    }

    public BigDecimal getCtoMoneda() {
        return ctoMoneda;
    }

    public void setCtoMoneda(final BigDecimal ctoMoneda) {
        this.ctoMoneda = ctoMoneda;
    }

    public String getCtoCveAreaInst() {
        return ctoCveAreaInst;
    }

    public void setCtoCveAreaInst(final String ctoCveAreaInst) {
        this.ctoCveAreaInst = ctoCveAreaInst;
    }

    public String getCtoEstatusFideicomiso() {
        return ctoEstatusFideicomiso;
    }

    public void setCtoEstatusFideicomiso(final String ctoEstatusFideicomiso) {
        this.ctoEstatusFideicomiso = ctoEstatusFideicomiso;
    }

    public String getCtoEstatusActividad() {
        return ctoEstatusActividad;
    }

    public void setCtoEstatusActividad(final String ctoEstatusActividad) {
        this.ctoEstatusActividad = ctoEstatusActividad;
    }

    public String getCtoEstatusHogan() {
        return ctoEstatusHogan;
    }

    public void setCtoEstatusHogan(final String ctoEstatusHogan) {
        this.ctoEstatusHogan = ctoEstatusHogan;
    }

    public String getCtoManejaMonExt() {
        return ctoManejaMonExt;
    }

    public void setCtoManejaMonExt(final String ctoManejaMonExt) {
        this.ctoManejaMonExt = ctoManejaMonExt;
    }

    public String getCtoSubEstatusAct() {
        return ctoSubEstatusAct;
    }

    public void setCtoSubEstatusAct(final String ctoSubEstatusAct) {
        this.ctoSubEstatusAct = ctoSubEstatusAct;
    }

    public String getCtoRiskRating() {
        return ctoRiskRating;
    }

    public void setCtoRiskRating(final String ctoRiskRating) {
        this.ctoRiskRating = ctoRiskRating;
    }

    public String getCtoTipoRemediacion() {
        return ctoTipoRemediacion;
    }

    public void setCtoTipoRemediacion(final String ctoTipoRemediacion) {
        this.ctoTipoRemediacion = ctoTipoRemediacion;
    }

    public String getCtoEstatusRemediacion() {
        return ctoEstatusRemediacion;
    }

    public void setCtoEstatusRemediacion(final String ctoEstatusRemediacion) {
        this.ctoEstatusRemediacion = ctoEstatusRemediacion;
    }

    public String getCtoGrid() {
        return ctoGrid;
    }

    public void setCtoGrid(final String ctoGrid) {
        this.ctoGrid = ctoGrid;
    }

    public String getCtoSubEstatusReme() {
        return ctoSubEstatusReme;
    }

    public void setCtoSubEstatusReme(final String ctoSubEstatusReme) {
        this.ctoSubEstatusReme = ctoSubEstatusReme;
    }

    public String getCtoFechaUltimaRev() {
        return ctoFechaUltimaRev;
    }

    public void setCtoFechaUltimaRev(final String ctoFechaUltimaRev) {
        this.ctoFechaUltimaRev = ctoFechaUltimaRev;
    }

    public String getCtoFechaProxRev() {
        return ctoFechaProxRev;
    }

    public void setCtoFechaProxRev(final String ctoFechaProxRev) {
        this.ctoFechaProxRev = ctoFechaProxRev;
    }

    public Boolean getCtoPendientesPredial() {
        return ctoPendientesPredial;
    }

    public void setCtoPendientesPredial(final Boolean ctoPendientesPredial) {
        this.ctoPendientesPredial = ctoPendientesPredial;
    }

    public Boolean getCtoEmbargo() {
        return ctoEmbargo;
    }

    public void setCtoEmbargo(final Boolean ctoEmbargo) {
        this.ctoEmbargo = ctoEmbargo;
    }

    public String getCtoClasificacionSat() {
        return ctoClasificacionSat;
    }

    public void setCtoClasificacionSat(final String ctoClasificacionSat) {
        this.ctoClasificacionSat = ctoClasificacionSat;
    }

    public String getCtoGiin() {
        return ctoGiin;
    }

    public void setCtoGiin(final String ctoGiin) {
        this.ctoGiin = ctoGiin;
    }

    public String getCtoRetencionesFisc() {
        return ctoRetencionesFisc;
    }

    public void setCtoRetencionesFisc(final String ctoRetencionesFisc) {
        this.ctoRetencionesFisc = ctoRetencionesFisc;
    }

    public String getCtoTin() {
        return ctoTin;
    }

    public void setCtoTin(final String ctoTin) {
        this.ctoTin = ctoTin;
    }

    public String getCtoExcento() {
        return ctoExcento;
    }

    public void setCtoExcento(final String ctoExcento) {
        this.ctoExcento = ctoExcento;
    }

    public String getCtoClasFatca() {
        return ctoClasFatca;
    }

    public void setCtoClasFatca(final String ctoClasFatca) {
        this.ctoClasFatca = ctoClasFatca;
    }

    public Boolean getCtoAutocerFatca() {
        return ctoAutocerFatca;
    }

    public void setCtoAutocerFatca(final Boolean ctoAutocerFatca) {
        this.ctoAutocerFatca = ctoAutocerFatca;
    }

    public String getCtoClasCrs() {
        return ctoClasCrs;
    }

    public void setCtoClasCrs(final String ctoClasCrs) {
        this.ctoClasCrs = ctoClasCrs;
    }

    public Boolean getCtoAutocerCrc() {
        return ctoAutocerCrc;
    }

    public void setCtoAutocerCrc(final Boolean ctoAutocerCrc) {
        this.ctoAutocerCrc = ctoAutocerCrc;
    }

    public Boolean getCtoPendientesRendCuenta() {
        return ctoPendientesRendCuenta;
    }

    public void setCtoPendientesRendCuenta(final Boolean ctoPendientesRendCuenta) {
        this.ctoPendientesRendCuenta = ctoPendientesRendCuenta;
    }

    public Boolean getCtoPendientesContables() {
        return ctoPendientesContables;
    }

    public void setCtoPendientesContables(final Boolean ctoPendientesContables) {
        this.ctoPendientesContables = ctoPendientesContables;
    }

    public Boolean getCtoCsem() {
        return ctoCsem;
    }

    public void setCtoCsem(final Boolean ctoCsem) {
        this.ctoCsem = ctoCsem;
    }

    public Boolean getCtoHonorariosPend() {
        return ctoHonorariosPend;
    }

    public void setCtoHonorariosPend(final Boolean ctoHonorariosPend) {
        this.ctoHonorariosPend = ctoHonorariosPend;
    }

    public String getCtoRfcFideicomiso() {
        return ctoRfcFideicomiso;
    }

    public void setCtoRfcFideicomiso(final String ctoRfcFideicomiso) {
        this.ctoRfcFideicomiso = ctoRfcFideicomiso;
    }

    public String getCtoPerHogan() {
        return ctoPerHogan;
    }

    public void setCtoPerHogan(final String ctoPerHogan) {
        this.ctoPerHogan = ctoPerHogan;
    }

    public String getCtoFecConst() {
        return ctoFecConst;
    }

    public void setCtoFecConst(final String ctoFecConst) {
        this.ctoFecConst = ctoFecConst;
    }

    public String getCtoEmpresa() {
        return ctoEmpresa;
    }

    public void setCtoEmpresa(final String ctoEmpresa) {
        this.ctoEmpresa = ctoEmpresa;
    }

    public String getCtoPromFid() {
        return ctoPromFid;
    }

    public void setCtoPromFid(final String ctoPromFid) {
        this.ctoPromFid = ctoPromFid;
    }

    public String getCtoRmLinNeg() {
        return ctoRmLinNeg;
    }

    public void setCtoRmLinNeg(final String ctoRmLinNeg) {
        this.ctoRmLinNeg = ctoRmLinNeg;
    }

    public String getCtoPromCliSpe() {
        return ctoPromCliSpe;
    }

    public void setCtoPromCliSpe(final String ctoPromCliSpe) {
        this.ctoPromCliSpe = ctoPromCliSpe;
    }

    public String getCtoCvePromCsHogan() {
        return ctoCvePromCsHogan;
    }

    public void setCtoCvePromCsHogan(final String ctoCvePromCsHogan) {
        this.ctoCvePromCsHogan = ctoCvePromCsHogan;
    }

    public String getCtoPromCliMan() {
        return ctoPromCliMan;
    }

    public void setCtoPromCliMan(final String ctoPromCliMan) {
        this.ctoPromCliMan = ctoPromCliMan;
    }

    public String getCtoCvePromCmHogan() {
        return ctoCvePromCmHogan;
    }

    public void setCtoCvePromCmHogan(final String ctoCvePromCmHogan) {
        this.ctoCvePromCmHogan = ctoCvePromCmHogan;
    }

    public String getCtoSucursal() {
        return ctoSucursal;
    }

    public void setCtoSucursal(final String ctoSucursal) {
        this.ctoSucursal = ctoSucursal;
    }

    public String getCtoLinNeg() {
        return ctoLinNeg;
    }

    public void setCtoLinNeg(final String ctoLinNeg) {
        this.ctoLinNeg = ctoLinNeg;
    }

    public Boolean getCtoJuicios() {
        return ctoJuicios;
    }

    public void setCtoJuicios(final Boolean ctoJuicios) {
        this.ctoJuicios = ctoJuicios;
    }

    public String getCtoObsJuicio() {
        return ctoObsJuicio;
    }

    public void setCtoObsJuicio(final String ctoObsJuicio) {
        this.ctoObsJuicio = ctoObsJuicio;
    }

    public String getCtoFecContrato() {
        return ctoFecContrato;
    }

    public void setCtoFecContrato(final String ctoFecContrato) {
        this.ctoFecContrato = ctoFecContrato;
    }

    public String getCtoContPrivComen() {
        return ctoContPrivComen;
    }

    public void setCtoContPrivComen(final String ctoContPrivComen) {
        this.ctoContPrivComen = ctoContPrivComen;
    }

    public String getCtoEscPubFec() {
        return ctoEscPubFec;
    }

    public void setCtoEscPubFec(final String ctoEscPubFec) {
        this.ctoEscPubFec = ctoEscPubFec;
    }

    public String getCtoTipoEscritura() {
        return ctoTipoEscritura;
    }

    public void setCtoTipoEscritura(final String ctoTipoEscritura) {
        this.ctoTipoEscritura = ctoTipoEscritura;
    }

    public String getCtoRppFecIns() {
        return ctoRppFecIns;
    }

    public void setCtoRppFecIns(final String ctoRppFecIns) {
        this.ctoRppFecIns = ctoRppFecIns;
    }

    public String getCtoRppLugReg() {
        return ctoRppLugReg;
    }

    public void setCtoRppLugReg(final String ctoRppLugReg) {
        this.ctoRppLugReg = ctoRppLugReg;
    }

    public String getCtoRppFolio() {
        return ctoRppFolio;
    }

    public void setCtoRppFolio(final String ctoRppFolio) {
        this.ctoRppFolio = ctoRppFolio;
    }

    public String getCtoRppPartida() {
        return ctoRppPartida;
    }

    public void setCtoRppPartida(final String ctoRppPartida) {
        this.ctoRppPartida = ctoRppPartida;
    }

    public String getCtoRppVolumen() {
        return ctoRppVolumen;
    }

    public void setCtoRppVolumen(final String ctoRppVolumen) {
        this.ctoRppVolumen = ctoRppVolumen;
    }

    public String getCtoRppFojas() {
        return ctoRppFojas;
    }

    public void setCtoRppFojas(final String ctoRppFojas) {
        this.ctoRppFojas = ctoRppFojas;
    }

    public String getCtoRppLibro() {
        return ctoRppLibro;
    }

    public void setCtoRppLibro(final String ctoRppLibro) {
        this.ctoRppLibro = ctoRppLibro;
    }

    public String getCtoRppSeccion() {
        return ctoRppSeccion;
    }

    public void setCtoRppSeccion(final String ctoRppSeccion) {
        this.ctoRppSeccion = ctoRppSeccion;
    }

    public String getCtoCis() {
        return ctoCis;
    }

    public void setCtoCis(final String ctoCis) {
        this.ctoCis = ctoCis;
    }

    public String getCtoNumAntLegacy() {
        return ctoNumAntLegacy;
    }

    public void setCtoNumAntLegacy(final String ctoNumAntLegacy) {
        this.ctoNumAntLegacy = ctoNumAntLegacy;
    }

    public String getCtoSubdirector() {
        return ctoSubdirector;
    }

    public void setCtoSubdirector(final String ctoSubdirector) {
        this.ctoSubdirector = ctoSubdirector;
    }

    public String getCtoGrupo() {
        return ctoGrupo;
    }

    public void setCtoGrupo(final String ctoGrupo) {
        this.ctoGrupo = ctoGrupo;
    }

    public Boolean getCtoPenFiscales() {
        return ctoPenFiscales;
    }

    public void setCtoPenFiscales(final Boolean ctoPenFiscales) {
        this.ctoPenFiscales = ctoPenFiscales;
    }

    public Boolean getCtoDocFaltante() {
        return ctoDocFaltante;
    }

    public void setCtoDocFaltante(final Boolean ctoDocFaltante) {
        this.ctoDocFaltante = ctoDocFaltante;
    }

    public Set<Benefici> getBenNumContratoBeneficis() {
        return benNumContratoBeneficis;
    }

    public void setBenNumContratoBeneficis(final Set<Benefici> benNumContratoBeneficis) {
        this.benNumContratoBeneficis = benNumContratoBeneficis;
    }

    public Set<Fideicom> getFidNumContratoFideicoms() {
        return fidNumContratoFideicoms;
    }

    public void setFidNumContratoFideicoms(final Set<Fideicom> fidNumContratoFideicoms) {
        this.fidNumContratoFideicoms = fidNumContratoFideicoms;
    }

    public Set<Posicion> getPosNumContratoPosicions() {
        return posNumContratoPosicions;
    }

    public void setPosNumContratoPosicions(final Set<Posicion> posNumContratoPosicions) {
        this.posNumContratoPosicions = posNumContratoPosicions;
    }

    public Set<Terceros> getTerNumContratoTerceroses() {
        return terNumContratoTerceroses;
    }

    public void setTerNumContratoTerceroses(final Set<Terceros> terNumContratoTerceroses) {
        this.terNumContratoTerceroses = terNumContratoTerceroses;
    }
    
    @Override
    public String toString() {
        return  this.ctoNumContrato+"-"+this.ctoNomContrato;
    }

}
