package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;

public class Contrato extends DomainObject {
    
    String ctoSubdirector = null;
    String ctoGrupo = null;
    BigDecimal ctoPenFiscales = null;
    BigDecimal ctoDocFaltante = null;
    String ctoRppFojas = null;
    String ctoRppLibro = null;
    String ctoRppSeccion = null;
    String ctoCis = null;
    String ctoNumAntLegacy = null;
    BigDecimal ctoCveComiteTec = null;
    BigDecimal ctoCveArt28 = null;
    BigDecimal ctoCveExclu30 = null;
    BigDecimal ctoCveMonExt = null;
    BigDecimal ctoCveRevocable = null;
    BigDecimal ctoCveRepProd = null;
    String ctoNumOficioExe = null;
    String ctoRegNalInvEx = null;
    BigDecimal ctoAnoApertura = null;
    BigDecimal ctoMesApertura = null;
    BigDecimal ctoDiaApertura = null;
    BigDecimal ctoAnoVencim = null;
    BigDecimal ctoMesVencim = null;
    BigDecimal ctoDiaVencim = null;
    BigDecimal ctoAnoAnivers = null;
    BigDecimal ctoMesAnivers = null;
    BigDecimal ctoDiaAnivers = null;
    BigDecimal ctoAnoCancela = null;
    BigDecimal ctoMesCancela = null;
    BigDecimal ctoDiaCancela = null;
    String ctoFecInscRnie = null;
    BigDecimal ctoAnoAltaReg = null;
    BigDecimal ctoMesAltaReg = null;
    BigDecimal ctoDiaAltaReg = null;
    BigDecimal ctoAnoUltMod = null;
    BigDecimal ctoMesUltMod = null;
    BigDecimal ctoDiaUltMod = null;
    String ctoCveStContrat = null;
    BigDecimal ctoCveSubcto = null;
    BigDecimal ctoNumNivel1 = null;
    BigDecimal ctoNumNivel2 = null;
    BigDecimal ctoNumNivel3 = null;
    BigDecimal ctoNumNivel4 = null;
    BigDecimal ctoNumNivel5 = null;
    String ctoRegShcp = null;
    BigDecimal ctoCveShcp = null;
    String ctoRegGobdf = null;
    BigDecimal ctoCveGobdf = null;
    BigDecimal ctoRama = null;
    BigDecimal ctoSubRama = null;
    String ctoNomActividad = null;
    String ctoTipoClient = null;
    String ctoTipoPublic = null;
    String ctoTipoContacto = null;
    String ctoNumEscritura = null;
    BigDecimal ctoNumNotario = null;
    String ctoTipoAdmon = null;
    BigDecimal ctoCveReqSors = null;
    String ctoNumExpSors = null;
    String ctoFecActShcp = null;
    String ctoFoseg = null;
    BigDecimal ctoEnvioMens = null;
    BigDecimal ctoFirmasMancomunadas = null;
    String ctoEstInterfid = null;
    String ctoTipoCont = null;
    BigDecimal ctoTipoFiso = null;
    BigDecimal ctoMoneda = null;
    String ctoCveAreaInst = null;
    String ctoEstatusFideicomiso = null;
    String ctoEstatusActividad = null;
    String ctoEstatusHogan = null;
    String ctoManejaMonExt = null;
    String ctoSubEstatusAct = null;
    String ctoRiskRating = null;
    String ctoTipoRemediacion = null;
    String ctoEstatusRemediacion = null;
    String ctoGrid = null;
    String ctoSubEstatusReme = null;
    String ctoFechaUltimaRev = null;
    String ctoFechaProxRev = null;
    BigDecimal ctoPendientesPredial = null;
    BigDecimal ctoEmbargo = null;
    String ctoClasificacionSat = null;
    String ctoGiin = null;
    String ctoRetencionesFisc = null;
    String ctoTin = null;
    String ctoExcento = null;
    String ctoClasFatca = null;
    BigDecimal ctoAutocerFatca = null;
    String ctoClasCrs = null;
    BigDecimal ctoAutocerCrc = null;
    BigDecimal ctoPendientesRendCuenta = null;
    BigDecimal ctoPendientesContables = null;
    BigDecimal ctoCsem = null;
    BigDecimal ctoHonorariosPend = null;
    String ctoRfcFideicomiso = null;
    String ctoPerHogan = null;
    String ctoFecConst = null;
    String ctoEmpresa = null;
    String ctoPromFid = null;
    String ctoRmLinNeg = null;
    String ctoPromCliSpe = null;
    String ctoCvePromCsHogan = null;
    String ctoPromCliMan = null;
    String ctoCvePromCmHogan = null;
    String ctoSucursal = null;
    String ctoLinNeg = null;
    BigDecimal ctoJuicios = null;
    String ctoObsJuicio = null;
    String ctoFecContrato = null;
    String ctoContPrivComen = null;
    String ctoEscPubFec = null;
    String ctoTipoEscritura = null;
    String ctoRppFecIns = null;
    String ctoRppLugReg = null;
    String ctoRppFolio = null;
    String ctoRppPartida = null;
    String ctoRppVolumen = null;
    BigDecimal ctoNumContrato = null;
    BigDecimal ctoNumCliente = null;
    BigDecimal ctoNumCtoEje = null;
    String ctoCveTipoNeg = null;
    String ctoCveClasProd = null;
    BigDecimal ctoNumProducto = null;
    String ctoNomContrato = null;
    String ctoCveFormaMan = null;
    String ctoCveTipoPer = null;
    String ctoCveRetencion = null;

    public Contrato() {
        super();
        this.pkColumns = 1;
    }

    public void setCtoSubdirector(String ctoSubdirector) {
        this.ctoSubdirector = ctoSubdirector;
    }

    public void setCtoGrupo(String ctoGrupo) {
        this.ctoGrupo = ctoGrupo;
    }

    public void setCtoPenFiscales(BigDecimal ctoPenFiscales) {
        this.ctoPenFiscales = ctoPenFiscales;
    }

    public void setCtoDocFaltante(BigDecimal ctoDocFaltante) {
        this.ctoDocFaltante = ctoDocFaltante;
    }

    public void setCtoRppFojas(String ctoRppFojas) {
        this.ctoRppFojas = ctoRppFojas;
    }

    public void setCtoRppLibro(String ctoRppLibro) {
        this.ctoRppLibro = ctoRppLibro;
    }

    public void setCtoRppSeccion(String ctoRppSeccion) {
        this.ctoRppSeccion = ctoRppSeccion;
    }

    public void setCtoCis(String ctoCis) {
        this.ctoCis = ctoCis;
    }

    public void setCtoNumAntLegacy(String ctoNumAntLegacy) {
        this.ctoNumAntLegacy = ctoNumAntLegacy;
    }

    public void setCtoCveComiteTec(BigDecimal ctoCveComiteTec) {
        this.ctoCveComiteTec = ctoCveComiteTec;
    }

    public void setCtoCveArt28(BigDecimal ctoCveArt28) {
        this.ctoCveArt28 = ctoCveArt28;
    }

    public void setCtoCveExclu30(BigDecimal ctoCveExclu30) {
        this.ctoCveExclu30 = ctoCveExclu30;
    }

    public void setCtoCveMonExt(BigDecimal ctoCveMonExt) {
        this.ctoCveMonExt = ctoCveMonExt;
    }

    public void setCtoCveRevocable(BigDecimal ctoCveRevocable) {
        this.ctoCveRevocable = ctoCveRevocable;
    }

    public void setCtoCveRepProd(BigDecimal ctoCveRepProd) {
        this.ctoCveRepProd = ctoCveRepProd;
    }

    public void setCtoNumOficioExe(String ctoNumOficioExe) {
        this.ctoNumOficioExe = ctoNumOficioExe;
    }

    public void setCtoRegNalInvEx(String ctoRegNalInvEx) {
        this.ctoRegNalInvEx = ctoRegNalInvEx;
    }

    public void setCtoAnoApertura(BigDecimal ctoAnoApertura) {
        this.ctoAnoApertura = ctoAnoApertura;
    }

    public void setCtoMesApertura(BigDecimal ctoMesApertura) {
        this.ctoMesApertura = ctoMesApertura;
    }

    public void setCtoDiaApertura(BigDecimal ctoDiaApertura) {
        this.ctoDiaApertura = ctoDiaApertura;
    }

    public void setCtoAnoVencim(BigDecimal ctoAnoVencim) {
        this.ctoAnoVencim = ctoAnoVencim;
    }

    public void setCtoMesVencim(BigDecimal ctoMesVencim) {
        this.ctoMesVencim = ctoMesVencim;
    }

    public void setCtoDiaVencim(BigDecimal ctoDiaVencim) {
        this.ctoDiaVencim = ctoDiaVencim;
    }

    public void setCtoAnoAnivers(BigDecimal ctoAnoAnivers) {
        this.ctoAnoAnivers = ctoAnoAnivers;
    }

    public void setCtoMesAnivers(BigDecimal ctoMesAnivers) {
        this.ctoMesAnivers = ctoMesAnivers;
    }

    public void setCtoDiaAnivers(BigDecimal ctoDiaAnivers) {
        this.ctoDiaAnivers = ctoDiaAnivers;
    }

    public void setCtoAnoCancela(BigDecimal ctoAnoCancela) {
        this.ctoAnoCancela = ctoAnoCancela;
    }

    public void setCtoMesCancela(BigDecimal ctoMesCancela) {
        this.ctoMesCancela = ctoMesCancela;
    }

    public void setCtoDiaCancela(BigDecimal ctoDiaCancela) {
        this.ctoDiaCancela = ctoDiaCancela;
    }

    public void setCtoFecInscRnie(String ctoFecInscRnie) {
        this.ctoFecInscRnie = ctoFecInscRnie;
    }

    public void setCtoAnoAltaReg(BigDecimal ctoAnoAltaReg) {
        this.ctoAnoAltaReg = ctoAnoAltaReg;
    }

    public void setCtoMesAltaReg(BigDecimal ctoMesAltaReg) {
        this.ctoMesAltaReg = ctoMesAltaReg;
    }

    public void setCtoDiaAltaReg(BigDecimal ctoDiaAltaReg) {
        this.ctoDiaAltaReg = ctoDiaAltaReg;
    }

    public void setCtoAnoUltMod(BigDecimal ctoAnoUltMod) {
        this.ctoAnoUltMod = ctoAnoUltMod;
    }

    public void setCtoMesUltMod(BigDecimal ctoMesUltMod) {
        this.ctoMesUltMod = ctoMesUltMod;
    }

    public void setCtoDiaUltMod(BigDecimal ctoDiaUltMod) {
        this.ctoDiaUltMod = ctoDiaUltMod;
    }

    public void setCtoCveStContrat(String ctoCveStContrat) {
        this.ctoCveStContrat = ctoCveStContrat;
    }

    public void setCtoCveSubcto(BigDecimal ctoCveSubcto) {
        this.ctoCveSubcto = ctoCveSubcto;
    }

    public void setCtoNumNivel1(BigDecimal ctoNumNivel1) {
        this.ctoNumNivel1 = ctoNumNivel1;
    }

    public void setCtoNumNivel2(BigDecimal ctoNumNivel2) {
        this.ctoNumNivel2 = ctoNumNivel2;
    }

    public void setCtoNumNivel3(BigDecimal ctoNumNivel3) {
        this.ctoNumNivel3 = ctoNumNivel3;
    }

    public void setCtoNumNivel4(BigDecimal ctoNumNivel4) {
        this.ctoNumNivel4 = ctoNumNivel4;
    }

    public void setCtoNumNivel5(BigDecimal ctoNumNivel5) {
        this.ctoNumNivel5 = ctoNumNivel5;
    }

    public void setCtoRegShcp(String ctoRegShcp) {
        this.ctoRegShcp = ctoRegShcp;
    }

    public void setCtoCveShcp(BigDecimal ctoCveShcp) {
        this.ctoCveShcp = ctoCveShcp;
    }

    public void setCtoRegGobdf(String ctoRegGobdf) {
        this.ctoRegGobdf = ctoRegGobdf;
    }

    public void setCtoCveGobdf(BigDecimal ctoCveGobdf) {
        this.ctoCveGobdf = ctoCveGobdf;
    }

    public void setCtoRama(BigDecimal ctoRama) {
        this.ctoRama = ctoRama;
    }

    public void setCtoSubRama(BigDecimal ctoSubRama) {
        this.ctoSubRama = ctoSubRama;
    }

    public void setCtoNomActividad(String ctoNomActividad) {
        this.ctoNomActividad = ctoNomActividad;
    }

    public void setCtoTipoClient(String ctoTipoClient) {
        this.ctoTipoClient = ctoTipoClient;
    }

    public void setCtoTipoPublic(String ctoTipoPublic) {
        this.ctoTipoPublic = ctoTipoPublic;
    }

    public void setCtoTipoContacto(String ctoTipoContacto) {
        this.ctoTipoContacto = ctoTipoContacto;
    }

    public void setCtoNumEscritura(String ctoNumEscritura) {
        this.ctoNumEscritura = ctoNumEscritura;
    }

    public void setCtoNumNotario(BigDecimal ctoNumNotario) {
        this.ctoNumNotario = ctoNumNotario;
    }

    public void setCtoTipoAdmon(String ctoTipoAdmon) {
        this.ctoTipoAdmon = ctoTipoAdmon;
    }

    public void setCtoCveReqSors(BigDecimal ctoCveReqSors) {
        this.ctoCveReqSors = ctoCveReqSors;
    }

    public void setCtoNumExpSors(String ctoNumExpSors) {
        this.ctoNumExpSors = ctoNumExpSors;
    }

    public void setCtoFecActShcp(String ctoFecActShcp) {
        this.ctoFecActShcp = ctoFecActShcp;
    }

    public void setCtoFoseg(String ctoFoseg) {
        this.ctoFoseg = ctoFoseg;
    }

    public void setCtoEnvioMens(BigDecimal ctoEnvioMens) {
        this.ctoEnvioMens = ctoEnvioMens;
    }

    public void setCtoFirmasMancomunadas(BigDecimal ctoFirmasMancomunadas) {
        this.ctoFirmasMancomunadas = ctoFirmasMancomunadas;
    }

    public void setCtoEstInterfid(String ctoEstInterfid) {
        this.ctoEstInterfid = ctoEstInterfid;
    }

    public void setCtoTipoCont(String ctoTipoCont) {
        this.ctoTipoCont = ctoTipoCont;
    }

    public void setCtoTipoFiso(BigDecimal ctoTipoFiso) {
        this.ctoTipoFiso = ctoTipoFiso;
    }

    public void setCtoMoneda(BigDecimal ctoMoneda) {
        this.ctoMoneda = ctoMoneda;
    }

    public void setCtoCveAreaInst(String ctoCveAreaInst) {
        this.ctoCveAreaInst = ctoCveAreaInst;
    }

    public void setCtoEstatusFideicomiso(String ctoEstatusFideicomiso) {
        this.ctoEstatusFideicomiso = ctoEstatusFideicomiso;
    }

    public void setCtoEstatusActividad(String ctoEstatusActividad) {
        this.ctoEstatusActividad = ctoEstatusActividad;
    }

    public void setCtoEstatusHogan(String ctoEstatusHogan) {
        this.ctoEstatusHogan = ctoEstatusHogan;
    }

    public void setCtoManejaMonExt(String ctoManejaMonExt) {
        this.ctoManejaMonExt = ctoManejaMonExt;
    }

    public void setCtoSubEstatusAct(String ctoSubEstatusAct) {
        this.ctoSubEstatusAct = ctoSubEstatusAct;
    }

    public void setCtoRiskRating(String ctoRiskRating) {
        this.ctoRiskRating = ctoRiskRating;
    }

    public void setCtoTipoRemediacion(String ctoTipoRemediacion) {
        this.ctoTipoRemediacion = ctoTipoRemediacion;
    }

    public void setCtoEstatusRemediacion(String ctoEstatusRemediacion) {
        this.ctoEstatusRemediacion = ctoEstatusRemediacion;
    }

    public void setCtoGrid(String ctoGrid) {
        this.ctoGrid = ctoGrid;
    }

    public void setCtoSubEstatusReme(String ctoSubEstatusReme) {
        this.ctoSubEstatusReme = ctoSubEstatusReme;
    }

    public void setCtoFechaUltimaRev(String ctoFechaUltimaRev) {
        this.ctoFechaUltimaRev = ctoFechaUltimaRev;
    }

    public void setCtoFechaProxRev(String ctoFechaProxRev) {
        this.ctoFechaProxRev = ctoFechaProxRev;
    }

    public void setCtoPendientesPredial(BigDecimal ctoPendientesPredial) {
        this.ctoPendientesPredial = ctoPendientesPredial;
    }

    public void setCtoEmbargo(BigDecimal ctoEmbargo) {
        this.ctoEmbargo = ctoEmbargo;
    }

    public void setCtoClasificacionSat(String ctoClasificacionSat) {
        this.ctoClasificacionSat = ctoClasificacionSat;
    }

    public void setCtoGiin(String ctoGiin) {
        this.ctoGiin = ctoGiin;
    }

    public void setCtoRetencionesFisc(String ctoRetencionesFisc) {
        this.ctoRetencionesFisc = ctoRetencionesFisc;
    }

    public void setCtoTin(String ctoTin) {
        this.ctoTin = ctoTin;
    }

    public void setCtoExcento(String ctoExcento) {
        this.ctoExcento = ctoExcento;
    }

    public void setCtoClasFatca(String ctoClasFatca) {
        this.ctoClasFatca = ctoClasFatca;
    }

    public void setCtoAutocerFatca(BigDecimal ctoAutocerFatca) {
        this.ctoAutocerFatca = ctoAutocerFatca;
    }

    public void setCtoClasCrs(String ctoClasCrs) {
        this.ctoClasCrs = ctoClasCrs;
    }

    public void setCtoAutocerCrc(BigDecimal ctoAutocerCrc) {
        this.ctoAutocerCrc = ctoAutocerCrc;
    }

    public void setCtoPendientesRendCuenta(BigDecimal ctoPendientesRendCuenta) {
        this.ctoPendientesRendCuenta = ctoPendientesRendCuenta;
    }

    public void setCtoPendientesContables(BigDecimal ctoPendientesContables) {
        this.ctoPendientesContables = ctoPendientesContables;
    }

    public void setCtoCsem(BigDecimal ctoCsem) {
        this.ctoCsem = ctoCsem;
    }

    public void setCtoHonorariosPend(BigDecimal ctoHonorariosPend) {
        this.ctoHonorariosPend = ctoHonorariosPend;
    }

    public void setCtoRfcFideicomiso(String ctoRfcFideicomiso) {
        this.ctoRfcFideicomiso = ctoRfcFideicomiso;
    }

    public void setCtoPerHogan(String ctoPerHogan) {
        this.ctoPerHogan = ctoPerHogan;
    }

    public void setCtoFecConst(String ctoFecConst) {
        this.ctoFecConst = ctoFecConst;
    }

    public void setCtoEmpresa(String ctoEmpresa) {
        this.ctoEmpresa = ctoEmpresa;
    }

    public void setCtoPromFid(String ctoPromFid) {
        this.ctoPromFid = ctoPromFid;
    }

    public void setCtoRmLinNeg(String ctoRmLinNeg) {
        this.ctoRmLinNeg = ctoRmLinNeg;
    }

    public void setCtoPromCliSpe(String ctoPromCliSpe) {
        this.ctoPromCliSpe = ctoPromCliSpe;
    }

    public void setCtoCvePromCsHogan(String ctoCvePromCsHogan) {
        this.ctoCvePromCsHogan = ctoCvePromCsHogan;
    }

    public void setCtoPromCliMan(String ctoPromCliMan) {
        this.ctoPromCliMan = ctoPromCliMan;
    }

    public void setCtoCvePromCmHogan(String ctoCvePromCmHogan) {
        this.ctoCvePromCmHogan = ctoCvePromCmHogan;
    }

    public void setCtoSucursal(String ctoSucursal) {
        this.ctoSucursal = ctoSucursal;
    }

    public void setCtoLinNeg(String ctoLinNeg) {
        this.ctoLinNeg = ctoLinNeg;
    }

    public void setCtoJuicios(BigDecimal ctoJuicios) {
        this.ctoJuicios = ctoJuicios;
    }

    public void setCtoObsJuicio(String ctoObsJuicio) {
        this.ctoObsJuicio = ctoObsJuicio;
    }

    public void setCtoFecContrato(String ctoFecContrato) {
        this.ctoFecContrato = ctoFecContrato;
    }

    public void setCtoContPrivComen(String ctoContPrivComen) {
        this.ctoContPrivComen = ctoContPrivComen;
    }

    public void setCtoEscPubFec(String ctoEscPubFec) {
        this.ctoEscPubFec = ctoEscPubFec;
    }

    public void setCtoTipoEscritura(String ctoTipoEscritura) {
        this.ctoTipoEscritura = ctoTipoEscritura;
    }

    public void setCtoRppFecIns(String ctoRppFecIns) {
        this.ctoRppFecIns = ctoRppFecIns;
    }

    public void setCtoRppLugReg(String ctoRppLugReg) {
        this.ctoRppLugReg = ctoRppLugReg;
    }

    public void setCtoRppFolio(String ctoRppFolio) {
        this.ctoRppFolio = ctoRppFolio;
    }

    public void setCtoRppPartida(String ctoRppPartida) {
        this.ctoRppPartida = ctoRppPartida;
    }

    public void setCtoRppVolumen(String ctoRppVolumen) {
        this.ctoRppVolumen = ctoRppVolumen;
    }

    public void setCtoNumContrato(BigDecimal ctoNumContrato) {
        this.ctoNumContrato = ctoNumContrato;
    }

    public void setCtoNumCliente(BigDecimal ctoNumCliente) {
        this.ctoNumCliente = ctoNumCliente;
    }

    public void setCtoNumCtoEje(BigDecimal ctoNumCtoEje) {
        this.ctoNumCtoEje = ctoNumCtoEje;
    }

    public void setCtoCveTipoNeg(String ctoCveTipoNeg) {
        this.ctoCveTipoNeg = ctoCveTipoNeg;
    }

    public void setCtoCveClasProd(String ctoCveClasProd) {
        this.ctoCveClasProd = ctoCveClasProd;
    }

    public void setCtoNumProducto(BigDecimal ctoNumProducto) {
        this.ctoNumProducto = ctoNumProducto;
    }

    public void setCtoNomContrato(String ctoNomContrato) {
        this.ctoNomContrato = ctoNomContrato;
    }

    public void setCtoCveFormaMan(String ctoCveFormaMan) {
        this.ctoCveFormaMan = ctoCveFormaMan;
    }

    public void setCtoCveTipoPer(String ctoCveTipoPer) {
        this.ctoCveTipoPer = ctoCveTipoPer;
    }

    public void setCtoCveRetencion(String ctoCveRetencion) {
        this.ctoCveRetencion = ctoCveRetencion;
    }

    public String getCtoSubdirector() {
        return this.ctoSubdirector;
    }

    public String getCtoGrupo() {
        return this.ctoGrupo;
    }

    public BigDecimal getCtoPenFiscales() {
        return this.ctoPenFiscales;
    }

    public BigDecimal getCtoDocFaltante() {
        return this.ctoDocFaltante;
    }

    public String getCtoRppFojas() {
        return this.ctoRppFojas;
    }

    public String getCtoRppLibro() {
        return this.ctoRppLibro;
    }

    public String getCtoRppSeccion() {
        return this.ctoRppSeccion;
    }

    public String getCtoCis() {
        return this.ctoCis;
    }

    public String getCtoNumAntLegacy() {
        return this.ctoNumAntLegacy;
    }

    public BigDecimal getCtoCveComiteTec() {
        return this.ctoCveComiteTec;
    }

    public BigDecimal getCtoCveArt28() {
        return this.ctoCveArt28;
    }

    public BigDecimal getCtoCveExclu30() {
        return this.ctoCveExclu30;
    }

    public BigDecimal getCtoCveMonExt() {
        return this.ctoCveMonExt;
    }

    public BigDecimal getCtoCveRevocable() {
        return this.ctoCveRevocable;
    }

    public BigDecimal getCtoCveRepProd() {
        return this.ctoCveRepProd;
    }

    public String getCtoNumOficioExe() {
        return this.ctoNumOficioExe;
    }

    public String getCtoRegNalInvEx() {
        return this.ctoRegNalInvEx;
    }

    public BigDecimal getCtoAnoApertura() {
        return this.ctoAnoApertura;
    }

    public BigDecimal getCtoMesApertura() {
        return this.ctoMesApertura;
    }

    public BigDecimal getCtoDiaApertura() {
        return this.ctoDiaApertura;
    }

    public BigDecimal getCtoAnoVencim() {
        return this.ctoAnoVencim;
    }

    public BigDecimal getCtoMesVencim() {
        return this.ctoMesVencim;
    }

    public BigDecimal getCtoDiaVencim() {
        return this.ctoDiaVencim;
    }

    public BigDecimal getCtoAnoAnivers() {
        return this.ctoAnoAnivers;
    }

    public BigDecimal getCtoMesAnivers() {
        return this.ctoMesAnivers;
    }

    public BigDecimal getCtoDiaAnivers() {
        return this.ctoDiaAnivers;
    }

    public BigDecimal getCtoAnoCancela() {
        return this.ctoAnoCancela;
    }

    public BigDecimal getCtoMesCancela() {
        return this.ctoMesCancela;
    }

    public BigDecimal getCtoDiaCancela() {
        return this.ctoDiaCancela;
    }

    public String getCtoFecInscRnie() {
        return this.ctoFecInscRnie;
    }

    public BigDecimal getCtoAnoAltaReg() {
        return this.ctoAnoAltaReg;
    }

    public BigDecimal getCtoMesAltaReg() {
        return this.ctoMesAltaReg;
    }

    public BigDecimal getCtoDiaAltaReg() {
        return this.ctoDiaAltaReg;
    }

    public BigDecimal getCtoAnoUltMod() {
        return this.ctoAnoUltMod;
    }

    public BigDecimal getCtoMesUltMod() {
        return this.ctoMesUltMod;
    }

    public BigDecimal getCtoDiaUltMod() {
        return this.ctoDiaUltMod;
    }

    public String getCtoCveStContrat() {
        return this.ctoCveStContrat;
    }

    public BigDecimal getCtoCveSubcto() {
        return this.ctoCveSubcto;
    }

    public BigDecimal getCtoNumNivel1() {
        return this.ctoNumNivel1;
    }

    public BigDecimal getCtoNumNivel2() {
        return this.ctoNumNivel2;
    }

    public BigDecimal getCtoNumNivel3() {
        return this.ctoNumNivel3;
    }

    public BigDecimal getCtoNumNivel4() {
        return this.ctoNumNivel4;
    }

    public BigDecimal getCtoNumNivel5() {
        return this.ctoNumNivel5;
    }

    public String getCtoRegShcp() {
        return this.ctoRegShcp;
    }

    public BigDecimal getCtoCveShcp() {
        return this.ctoCveShcp;
    }

    public String getCtoRegGobdf() {
        return this.ctoRegGobdf;
    }

    public BigDecimal getCtoCveGobdf() {
        return this.ctoCveGobdf;
    }

    public BigDecimal getCtoRama() {
        return this.ctoRama;
    }

    public BigDecimal getCtoSubRama() {
        return this.ctoSubRama;
    }

    public String getCtoNomActividad() {
        return this.ctoNomActividad;
    }

    public String getCtoTipoClient() {
        return this.ctoTipoClient;
    }

    public String getCtoTipoPublic() {
        return this.ctoTipoPublic;
    }

    public String getCtoTipoContacto() {
        return this.ctoTipoContacto;
    }

    public String getCtoNumEscritura() {
        return this.ctoNumEscritura;
    }

    public BigDecimal getCtoNumNotario() {
        return this.ctoNumNotario;
    }

    public String getCtoTipoAdmon() {
        return this.ctoTipoAdmon;
    }

    public BigDecimal getCtoCveReqSors() {
        return this.ctoCveReqSors;
    }

    public String getCtoNumExpSors() {
        return this.ctoNumExpSors;
    }

    public String getCtoFecActShcp() {
        return this.ctoFecActShcp;
    }

    public String getCtoFoseg() {
        return this.ctoFoseg;
    }

    public BigDecimal getCtoEnvioMens() {
        return this.ctoEnvioMens;
    }

    public BigDecimal getCtoFirmasMancomunadas() {
        return this.ctoFirmasMancomunadas;
    }

    public String getCtoEstInterfid() {
        return this.ctoEstInterfid;
    }

    public String getCtoTipoCont() {
        return this.ctoTipoCont;
    }

    public BigDecimal getCtoTipoFiso() {
        return this.ctoTipoFiso;
    }

    public BigDecimal getCtoMoneda() {
        return this.ctoMoneda;
    }

    public String getCtoCveAreaInst() {
        return this.ctoCveAreaInst;
    }

    public String getCtoEstatusFideicomiso() {
        return this.ctoEstatusFideicomiso;
    }

    public String getCtoEstatusActividad() {
        return this.ctoEstatusActividad;
    }

    public String getCtoEstatusHogan() {
        return this.ctoEstatusHogan;
    }

    public String getCtoManejaMonExt() {
        return this.ctoManejaMonExt;
    }

    public String getCtoSubEstatusAct() {
        return this.ctoSubEstatusAct;
    }

    public String getCtoRiskRating() {
        return this.ctoRiskRating;
    }

    public String getCtoTipoRemediacion() {
        return this.ctoTipoRemediacion;
    }

    public String getCtoEstatusRemediacion() {
        return this.ctoEstatusRemediacion;
    }

    public String getCtoGrid() {
        return this.ctoGrid;
    }

    public String getCtoSubEstatusReme() {
        return this.ctoSubEstatusReme;
    }

    public String getCtoFechaUltimaRev() {
        return this.ctoFechaUltimaRev;
    }

    public String getCtoFechaProxRev() {
        return this.ctoFechaProxRev;
    }

    public BigDecimal getCtoPendientesPredial() {
        return this.ctoPendientesPredial;
    }

    public BigDecimal getCtoEmbargo() {
        return this.ctoEmbargo;
    }

    public String getCtoClasificacionSat() {
        return this.ctoClasificacionSat;
    }

    public String getCtoGiin() {
        return this.ctoGiin;
    }

    public String getCtoRetencionesFisc() {
        return this.ctoRetencionesFisc;
    }

    public String getCtoTin() {
        return this.ctoTin;
    }

    public String getCtoExcento() {
        return this.ctoExcento;
    }

    public String getCtoClasFatca() {
        return this.ctoClasFatca;
    }

    public BigDecimal getCtoAutocerFatca() {
        return this.ctoAutocerFatca;
    }

    public String getCtoClasCrs() {
        return this.ctoClasCrs;
    }

    public BigDecimal getCtoAutocerCrc() {
        return this.ctoAutocerCrc;
    }

    public BigDecimal getCtoPendientesRendCuenta() {
        return this.ctoPendientesRendCuenta;
    }

    public BigDecimal getCtoPendientesContables() {
        return this.ctoPendientesContables;
    }

    public BigDecimal getCtoCsem() {
        return this.ctoCsem;
    }

    public BigDecimal getCtoHonorariosPend() {
        return this.ctoHonorariosPend;
    }

    public String getCtoRfcFideicomiso() {
        return this.ctoRfcFideicomiso;
    }

    public String getCtoPerHogan() {
        return this.ctoPerHogan;
    }

    public String getCtoFecConst() {
        return this.ctoFecConst;
    }

    public String getCtoEmpresa() {
        return this.ctoEmpresa;
    }

    public String getCtoPromFid() {
        return this.ctoPromFid;
    }

    public String getCtoRmLinNeg() {
        return this.ctoRmLinNeg;
    }

    public String getCtoPromCliSpe() {
        return this.ctoPromCliSpe;
    }

    public String getCtoCvePromCsHogan() {
        return this.ctoCvePromCsHogan;
    }

    public String getCtoPromCliMan() {
        return this.ctoPromCliMan;
    }

    public String getCtoCvePromCmHogan() {
        return this.ctoCvePromCmHogan;
    }

    public String getCtoSucursal() {
        return this.ctoSucursal;
    }

    public String getCtoLinNeg() {
        return this.ctoLinNeg;
    }

    public BigDecimal getCtoJuicios() {
        return this.ctoJuicios;
    }

    public String getCtoObsJuicio() {
        return this.ctoObsJuicio;
    }

    public String getCtoFecContrato() {
        return this.ctoFecContrato;
    }

    public String getCtoContPrivComen() {
        return this.ctoContPrivComen;
    }

    public String getCtoEscPubFec() {
        return this.ctoEscPubFec;
    }

    public String getCtoTipoEscritura() {
        return this.ctoTipoEscritura;
    }

    public String getCtoRppFecIns() {
        return this.ctoRppFecIns;
    }

    public String getCtoRppLugReg() {
        return this.ctoRppLugReg;
    }

    public String getCtoRppFolio() {
        return this.ctoRppFolio;
    }

    public String getCtoRppPartida() {
        return this.ctoRppPartida;
    }

    public String getCtoRppVolumen() {
        return this.ctoRppVolumen;
    }

    public BigDecimal getCtoNumContrato() {
        return this.ctoNumContrato;
    }

    public BigDecimal getCtoNumCliente() {
        return this.ctoNumCliente;
    }

    public BigDecimal getCtoNumCtoEje() {
        return this.ctoNumCtoEje;
    }

    public String getCtoCveTipoNeg() {
        return this.ctoCveTipoNeg;
    }

    public String getCtoCveClasProd() {
        return this.ctoCveClasProd;
    }

    public BigDecimal getCtoNumProducto() {
        return this.ctoNumProducto;
    }

    public String getCtoNomContrato() {
        return this.ctoNomContrato;
    }

    public String getCtoCveFormaMan() {
        return this.ctoCveFormaMan;
    }

    public String getCtoCveTipoPer() {
        return this.ctoCveTipoPer;
    }

    public String getCtoCveRetencion() {
        return this.ctoCveRetencion;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONTRATO ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getCtoNumContrato() != null && this.getCtoNumContrato().longValue() == -999) {
            conditions += " AND CTO_NUM_CONTRATO IS NULL";
        } else if (this.getCtoNumContrato() != null) {
            conditions += " AND CTO_NUM_CONTRATO =?";
            values.add(this.getCtoNumContrato());
        }
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getSelect() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONTRATO ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE CONTRATO SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        fields += " CTO_SUBDIRECTOR = ?, ";
        values.add(this.getCtoSubdirector());
        fields += " CTO_GRUPO = ?, ";
        values.add(this.getCtoGrupo());
        fields += " CTO_PEN_FISCALES = ?, ";
        values.add(this.getCtoPenFiscales());
        fields += " CTO_DOC_FALTANTE = ?, ";
        values.add(this.getCtoDocFaltante());
        fields += " CTO_RPP_FOJAS = ?, ";
        values.add(this.getCtoRppFojas());
        fields += " CTO_RPP_LIBRO = ?, ";
        values.add(this.getCtoRppLibro());
        fields += " CTO_RPP_SECCION = ?, ";
        values.add(this.getCtoRppSeccion());
        fields += " CTO_CIS = ?, ";
        values.add(this.getCtoCis());
        fields += " CTO_NUM_ANT_LEGACY = ?, ";
        values.add(this.getCtoNumAntLegacy());
        fields += " CTO_CVE_COMITE_TEC = ?, ";
        values.add(this.getCtoCveComiteTec());
        fields += " CTO_CVE_ART_28 = ?, ";
        values.add(this.getCtoCveArt28());
        fields += " CTO_CVE_EXCLU_30 = ?, ";
        values.add(this.getCtoCveExclu30());
        fields += " CTO_CVE_MON_EXT = ?, ";
        values.add(this.getCtoCveMonExt());
        fields += " CTO_CVE_REVOCABLE = ?, ";
        values.add(this.getCtoCveRevocable());
        fields += " CTO_CVE_REP_PROD = ?, ";
        values.add(this.getCtoCveRepProd());
        fields += " CTO_NUM_OFICIO_EXE = ?, ";
        values.add(this.getCtoNumOficioExe());
        fields += " CTO_REG_NAL_INV_EX = ?, ";
        values.add(this.getCtoRegNalInvEx());
        fields += " CTO_ANO_APERTURA = ?, ";
        values.add(this.getCtoAnoApertura());
        fields += " CTO_MES_APERTURA = ?, ";
        values.add(this.getCtoMesApertura());
        fields += " CTO_DIA_APERTURA = ?, ";
        values.add(this.getCtoDiaApertura());
        fields += " CTO_ANO_VENCIM = ?, ";
        values.add(this.getCtoAnoVencim());
        fields += " CTO_MES_VENCIM = ?, ";
        values.add(this.getCtoMesVencim());
        fields += " CTO_DIA_VENCIM = ?, ";
        values.add(this.getCtoDiaVencim());
        fields += " CTO_ANO_ANIVERS = ?, ";
        values.add(this.getCtoAnoAnivers());
        fields += " CTO_MES_ANIVERS = ?, ";
        values.add(this.getCtoMesAnivers());
        fields += " CTO_DIA_ANIVERS = ?, ";
        values.add(this.getCtoDiaAnivers());
        fields += " CTO_ANO_CANCELA = ?, ";
        values.add(this.getCtoAnoCancela());
        fields += " CTO_MES_CANCELA = ?, ";
        values.add(this.getCtoMesCancela());
        fields += " CTO_DIA_CANCELA = ?, ";
        values.add(this.getCtoDiaCancela());
        fields += " CTO_FEC_INSC_RNIE = ?, ";
        values.add(this.getCtoFecInscRnie());
        fields += " CTO_ANO_ALTA_REG = ?, ";
        values.add(this.getCtoAnoAltaReg());
        fields += " CTO_MES_ALTA_REG = ?, ";
        values.add(this.getCtoMesAltaReg());
        fields += " CTO_DIA_ALTA_REG = ?, ";
        values.add(this.getCtoDiaAltaReg());
        fields += " CTO_ANO_ULT_MOD = ?, ";
        values.add(this.getCtoAnoUltMod());
        fields += " CTO_MES_ULT_MOD = ?, ";
        values.add(this.getCtoMesUltMod());
        fields += " CTO_DIA_ULT_MOD = ?, ";
        values.add(this.getCtoDiaUltMod());
        fields += " CTO_CVE_ST_CONTRAT = ?, ";
        values.add(this.getCtoCveStContrat());
        fields += " CTO_CVE_SUBCTO = ?, ";
        values.add(this.getCtoCveSubcto());
        fields += " CTO_NUM_NIVEL1 = ?, ";
        values.add(this.getCtoNumNivel1());
        fields += " CTO_NUM_NIVEL2 = ?, ";
        values.add(this.getCtoNumNivel2());
        fields += " CTO_NUM_NIVEL3 = ?, ";
        values.add(this.getCtoNumNivel3());
        fields += " CTO_NUM_NIVEL4 = ?, ";
        values.add(this.getCtoNumNivel4());
        fields += " CTO_NUM_NIVEL5 = ?, ";
        values.add(this.getCtoNumNivel5());
        fields += " CTO_REG_SHCP = ?, ";
        values.add(this.getCtoRegShcp());
        fields += " CTO_CVE_SHCP = ?, ";
        values.add(this.getCtoCveShcp());
        fields += " CTO_REG_GOBDF = ?, ";
        values.add(this.getCtoRegGobdf());
        fields += " CTO_CVE_GOBDF = ?, ";
        values.add(this.getCtoCveGobdf());
        fields += " CTO_RAMA = ?, ";
        values.add(this.getCtoRama());
        fields += " CTO_SUB_RAMA = ?, ";
        values.add(this.getCtoSubRama());
        fields += " CTO_NOM_ACTIVIDAD = ?, ";
        values.add(this.getCtoNomActividad());
        fields += " CTO_TIPO_CLIENT = ?, ";
        values.add(this.getCtoTipoClient());
        fields += " CTO_TIPO_PUBLIC = ?, ";
        values.add(this.getCtoTipoPublic());
        fields += " CTO_TIPO_CONTACTO = ?, ";
        values.add(this.getCtoTipoContacto());
        fields += " CTO_NUM_ESCRITURA = ?, ";
        values.add(this.getCtoNumEscritura());
        fields += " CTO_NUM_NOTARIO = ?, ";
        values.add(this.getCtoNumNotario());
        fields += " CTO_TIPO_ADMON = ?, ";
        values.add(this.getCtoTipoAdmon());
        fields += " CTO_CVE_REQ_SORS = ?, ";
        values.add(this.getCtoCveReqSors());
        fields += " CTO_NUM_EXP_SORS = ?, ";
        values.add(this.getCtoNumExpSors());
        fields += " CTO_FEC_ACT_SHCP = ?, ";
        values.add(this.getCtoFecActShcp());
        fields += " CTO_FOSEG = ?, ";
        values.add(this.getCtoFoseg());
        fields += " CTO_ENVIO_MENS = ?, ";
        values.add(this.getCtoEnvioMens());
        fields += " CTO_FIRMAS_MANCOMUNADAS = ?, ";
        values.add(this.getCtoFirmasMancomunadas());
        fields += " CTO_EST_INTERFID = ?, ";
        values.add(this.getCtoEstInterfid());
        fields += " CTO_TIPO_CONT = ?, ";
        values.add(this.getCtoTipoCont());
        fields += " CTO_TIPO_FISO = ?, ";
        values.add(this.getCtoTipoFiso());
        fields += " CTO_MONEDA = ?, ";
        values.add(this.getCtoMoneda());
        fields += " CTO_CVE_AREA_INST = ?, ";
        values.add(this.getCtoCveAreaInst());
        fields += " CTO_ESTATUS_FIDEICOMISO = ?, ";
        values.add(this.getCtoEstatusFideicomiso());
        fields += " CTO_ESTATUS_ACTIVIDAD = ?, ";
        values.add(this.getCtoEstatusActividad());
        fields += " CTO_ESTATUS_HOGAN = ?, ";
        values.add(this.getCtoEstatusHogan());
        fields += " CTO_MANEJA_MON_EXT = ?, ";
        values.add(this.getCtoManejaMonExt());
        fields += " CTO_SUB_ESTATUS_ACT = ?, ";
        values.add(this.getCtoSubEstatusAct());
        fields += " CTO_RISK_RATING = ?, ";
        values.add(this.getCtoRiskRating());
        fields += " CTO_TIPO_REMEDIACION = ?, ";
        values.add(this.getCtoTipoRemediacion());
        fields += " CTO_ESTATUS_REMEDIACION = ?, ";
        values.add(this.getCtoEstatusRemediacion());
        fields += " CTO_GRID = ?, ";
        values.add(this.getCtoGrid());
        fields += " CTO_SUB_ESTATUS_REME = ?, ";
        values.add(this.getCtoSubEstatusReme());
        fields += " CTO_FECHA_ULTIMA_REV = ?, ";
        values.add(this.getCtoFechaUltimaRev());
        fields += " CTO_FECHA_PROX_REV = ?, ";
        values.add(this.getCtoFechaProxRev());
        fields += " CTO_PENDIENTES_PREDIAL = ?, ";
        values.add(this.getCtoPendientesPredial());
        fields += " CTO_EMBARGO = ?, ";
        values.add(this.getCtoEmbargo());
        fields += " CTO_CLASIFICACION_SAT = ?, ";
        values.add(this.getCtoClasificacionSat());
        fields += " CTO_GIIN = ?, ";
        values.add(this.getCtoGiin());
        fields += " CTO_RETENCIONES_FISC = ?, ";
        values.add(this.getCtoRetencionesFisc());
        fields += " CTO_TIN = ?, ";
        values.add(this.getCtoTin());
        fields += " CTO_EXCENTO = ?, ";
        values.add(this.getCtoExcento());
        fields += " CTO_CLAS_FATCA = ?, ";
        values.add(this.getCtoClasFatca());
        fields += " CTO_AUTOCER_FATCA = ?, ";
        values.add(this.getCtoAutocerFatca());
        fields += " CTO_CLAS_CRS = ?, ";
        values.add(this.getCtoClasCrs());
        fields += " CTO_AUTOCER_CRC = ?, ";
        values.add(this.getCtoAutocerCrc());
        fields += " CTO_PENDIENTES_REND_CUENTA = ?, ";
        values.add(this.getCtoPendientesRendCuenta());
        fields += " CTO_PENDIENTES_CONTABLES = ?, ";
        values.add(this.getCtoPendientesContables());
        fields += " CTO_CSEM = ?, ";
        values.add(this.getCtoCsem());
        fields += " CTO_HONORARIOS_PEND = ?, ";
        values.add(this.getCtoHonorariosPend());
        fields += " CTO_RFC_FIDEICOMISO = ?, ";
        values.add(this.getCtoRfcFideicomiso());
        fields += " CTO_PER_HOGAN = ?, ";
        values.add(this.getCtoPerHogan());
        fields += " CTO_FEC_CONST = ?, ";
        values.add(this.getCtoFecConst());
        fields += " CTO_EMPRESA = ?, ";
        values.add(this.getCtoEmpresa());
        fields += " CTO_PROM_FID = ?, ";
        values.add(this.getCtoPromFid());
        fields += " CTO_RM_LIN_NEG = ?, ";
        values.add(this.getCtoRmLinNeg());
        fields += " CTO_PROM_CLI_SPE = ?, ";
        values.add(this.getCtoPromCliSpe());
        fields += " CTO_CVE_PROM_CS_HOGAN = ?, ";
        values.add(this.getCtoCvePromCsHogan());
        fields += " CTO_PROM_CLI_MAN = ?, ";
        values.add(this.getCtoPromCliMan());
        fields += " CTO_CVE_PROM_CM_HOGAN = ?, ";
        values.add(this.getCtoCvePromCmHogan());
        fields += " CTO_SUCURSAL = ?, ";
        values.add(this.getCtoSucursal());
        fields += " CTO_LIN_NEG = ?, ";
        values.add(this.getCtoLinNeg());
        fields += " CTO_JUICIOS = ?, ";
        values.add(this.getCtoJuicios());
        fields += " CTO_OBS_JUICIO = ?, ";
        values.add(this.getCtoObsJuicio());
        fields += " CTO_FEC_CONTRATO = ?, ";
        values.add(this.getCtoFecContrato());
        fields += " CTO_CONT_PRIV_COMEN = ?, ";
        values.add(this.getCtoContPrivComen());
        fields += " CTO_ESC_PUB_FEC = ?, ";
        values.add(this.getCtoEscPubFec());
        fields += " CTO_TIPO_ESCRITURA = ?, ";
        values.add(this.getCtoTipoEscritura());
        fields += " CTO_RPP_FEC_INS = ?, ";
        values.add(this.getCtoRppFecIns());
        fields += " CTO_RPP_LUG_REG = ?, ";
        values.add(this.getCtoRppLugReg());
        fields += " CTO_RPP_FOLIO = ?, ";
        values.add(this.getCtoRppFolio());
        fields += " CTO_RPP_PARTIDA = ?, ";
        values.add(this.getCtoRppPartida());
        fields += " CTO_RPP_VOLUMEN = ?, ";
        values.add(this.getCtoRppVolumen());
        conditions += " AND CTO_NUM_CONTRATO = ?";
        pkValues.add(this.getCtoNumContrato());
        fields += " CTO_NUM_CLIENTE = ?, ";
        values.add(this.getCtoNumCliente());
        fields += " CTO_NUM_CTO_EJE = ?, ";
        values.add(this.getCtoNumCtoEje());
        fields += " CTO_CVE_TIPO_NEG = ?, ";
        values.add(this.getCtoCveTipoNeg());
        fields += " CTO_CVE_CLAS_PROD = ?, ";
        values.add(this.getCtoCveClasProd());
        fields += " CTO_NUM_PRODUCTO = ?, ";
        values.add(this.getCtoNumProducto());
        fields += " CTO_NOM_CONTRATO = ?, ";
        values.add(this.getCtoNomContrato());
        fields += " CTO_CVE_FORMA_MAN = ?, ";
        values.add(this.getCtoCveFormaMan());
        fields += " CTO_CVE_TIPO_PER = ?, ";
        values.add(this.getCtoCveTipoPer());
        fields += " CTO_CVE_RETENCION = ?, ";
        values.add(this.getCtoCveRetencion());
        for (int i = 0; i < pkValues.size(); i++) {
            values.add(pkValues.get(i));
        }
        ;
        fields = fields.substring(0, fields.length() - 2).trim();
        conditions = conditions.substring(4).trim();
        sql += fields + " WHERE " + conditions;
        result.setSql(sql);
        result.setParameters(values.toArray());
        return result;
    }

    public DMLObject getInsert() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO CONTRATO ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",CTO_SUBDIRECTOR ";
        fieldValues += ", ?";
        values.add(this.getCtoSubdirector());
        fields += ",CTO_GRUPO ";
        fieldValues += ", ?";
        values.add(this.getCtoGrupo());
        fields += ",CTO_PEN_FISCALES ";
        fieldValues += ", ?";
        values.add(this.getCtoPenFiscales());
        fields += ",CTO_DOC_FALTANTE ";
        fieldValues += ", ?";
        values.add(this.getCtoDocFaltante());
        fields += ",CTO_RPP_FOJAS ";
        fieldValues += ", ?";
        values.add(this.getCtoRppFojas());
        fields += ",CTO_RPP_LIBRO ";
        fieldValues += ", ?";
        values.add(this.getCtoRppLibro());
        fields += ",CTO_RPP_SECCION ";
        fieldValues += ", ?";
        values.add(this.getCtoRppSeccion());
        fields += ",CTO_CIS ";
        fieldValues += ", ?";
        values.add(this.getCtoCis());
        fields += ",CTO_NUM_ANT_LEGACY ";
        fieldValues += ", ?";
        values.add(this.getCtoNumAntLegacy());
        fields += ",CTO_CVE_COMITE_TEC ";
        fieldValues += ", ?";
        values.add(this.getCtoCveComiteTec());
        fields += ",CTO_CVE_ART_28 ";
        fieldValues += ", ?";
        values.add(this.getCtoCveArt28());
        fields += ",CTO_CVE_EXCLU_30 ";
        fieldValues += ", ?";
        values.add(this.getCtoCveExclu30());
        fields += ",CTO_CVE_MON_EXT ";
        fieldValues += ", ?";
        values.add(this.getCtoCveMonExt());
        fields += ",CTO_CVE_REVOCABLE ";
        fieldValues += ", ?";
        values.add(this.getCtoCveRevocable());
        fields += ",CTO_CVE_REP_PROD ";
        fieldValues += ", ?";
        values.add(this.getCtoCveRepProd());
        fields += ",CTO_NUM_OFICIO_EXE ";
        fieldValues += ", ?";
        values.add(this.getCtoNumOficioExe());
        fields += ",CTO_REG_NAL_INV_EX ";
        fieldValues += ", ?";
        values.add(this.getCtoRegNalInvEx());
        fields += ",CTO_ANO_APERTURA ";
        fieldValues += ", ?";
        values.add(this.getCtoAnoApertura());
        fields += ",CTO_MES_APERTURA ";
        fieldValues += ", ?";
        values.add(this.getCtoMesApertura());
        fields += ",CTO_DIA_APERTURA ";
        fieldValues += ", ?";
        values.add(this.getCtoDiaApertura());
        fields += ",CTO_ANO_VENCIM ";
        fieldValues += ", ?";
        values.add(this.getCtoAnoVencim());
        fields += ",CTO_MES_VENCIM ";
        fieldValues += ", ?";
        values.add(this.getCtoMesVencim());
        fields += ",CTO_DIA_VENCIM ";
        fieldValues += ", ?";
        values.add(this.getCtoDiaVencim());
        fields += ",CTO_ANO_ANIVERS ";
        fieldValues += ", ?";
        values.add(this.getCtoAnoAnivers());
        fields += ",CTO_MES_ANIVERS ";
        fieldValues += ", ?";
        values.add(this.getCtoMesAnivers());
        fields += ",CTO_DIA_ANIVERS ";
        fieldValues += ", ?";
        values.add(this.getCtoDiaAnivers());
        fields += ",CTO_ANO_CANCELA ";
        fieldValues += ", ?";
        values.add(this.getCtoAnoCancela());
        fields += ",CTO_MES_CANCELA ";
        fieldValues += ", ?";
        values.add(this.getCtoMesCancela());
        fields += ",CTO_DIA_CANCELA ";
        fieldValues += ", ?";
        values.add(this.getCtoDiaCancela());
        fields += ",CTO_FEC_INSC_RNIE ";
        fieldValues += ", ?";
        values.add(this.getCtoFecInscRnie());
        fields += ",CTO_ANO_ALTA_REG ";
        fieldValues += ", ?";
        values.add(this.getCtoAnoAltaReg());
        fields += ",CTO_MES_ALTA_REG ";
        fieldValues += ", ?";
        values.add(this.getCtoMesAltaReg());
        fields += ",CTO_DIA_ALTA_REG ";
        fieldValues += ", ?";
        values.add(this.getCtoDiaAltaReg());
        fields += ",CTO_ANO_ULT_MOD ";
        fieldValues += ", ?";
        values.add(this.getCtoAnoUltMod());
        fields += ",CTO_MES_ULT_MOD ";
        fieldValues += ", ?";
        values.add(this.getCtoMesUltMod());
        fields += ",CTO_DIA_ULT_MOD ";
        fieldValues += ", ?";
        values.add(this.getCtoDiaUltMod());
        fields += ",CTO_CVE_ST_CONTRAT ";
        fieldValues += ", ?";
        values.add(this.getCtoCveStContrat());
        fields += ",CTO_CVE_SUBCTO ";
        fieldValues += ", ?";
        values.add(this.getCtoCveSubcto());
        fields += ",CTO_NUM_NIVEL1 ";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel1());
        fields += ",CTO_NUM_NIVEL2 ";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel2());
        fields += ",CTO_NUM_NIVEL3 ";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel3());
        fields += ",CTO_NUM_NIVEL4 ";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel4());
        fields += ",CTO_NUM_NIVEL5 ";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel5());
        fields += ",CTO_REG_SHCP ";
        fieldValues += ", ?";
        values.add(this.getCtoRegShcp());
        fields += ",CTO_CVE_SHCP ";
        fieldValues += ", ?";
        values.add(this.getCtoCveShcp());
        fields += ",CTO_REG_GOBDF ";
        fieldValues += ", ?";
        values.add(this.getCtoRegGobdf());
        fields += ",CTO_CVE_GOBDF ";
        fieldValues += ", ?";
        values.add(this.getCtoCveGobdf());
        fields += ",CTO_RAMA ";
        fieldValues += ", ?";
        values.add(this.getCtoRama());
        fields += ",CTO_SUB_RAMA ";
        fieldValues += ", ?";
        values.add(this.getCtoSubRama());
        fields += ",CTO_NOM_ACTIVIDAD ";
        fieldValues += ", ?";
        values.add(this.getCtoNomActividad());
        fields += ",CTO_TIPO_CLIENT ";
        fieldValues += ", ?";
        values.add(this.getCtoTipoClient());
        fields += ",CTO_TIPO_PUBLIC ";
        fieldValues += ", ?";
        values.add(this.getCtoTipoPublic());
        fields += ",CTO_TIPO_CONTACTO ";
        fieldValues += ", ?";
        values.add(this.getCtoTipoContacto());
        fields += ",CTO_NUM_ESCRITURA ";
        fieldValues += ", ?";
        values.add(this.getCtoNumEscritura());
        fields += ",CTO_NUM_NOTARIO ";
        fieldValues += ", ?";
        values.add(this.getCtoNumNotario());
        fields += ",CTO_TIPO_ADMON ";
        fieldValues += ", ?";
        values.add(this.getCtoTipoAdmon());
        fields += ",CTO_CVE_REQ_SORS ";
        fieldValues += ", ?";
        values.add(this.getCtoCveReqSors());
        fields += ",CTO_NUM_EXP_SORS ";
        fieldValues += ", ?";
        values.add(this.getCtoNumExpSors());
        fields += ",CTO_FEC_ACT_SHCP ";
        fieldValues += ", ?";
        values.add(this.getCtoFecActShcp());
        fields += ",CTO_FOSEG ";
        fieldValues += ", ?";
        values.add(this.getCtoFoseg());
        fields += ",CTO_ENVIO_MENS ";
        fieldValues += ", ?";
        values.add(this.getCtoEnvioMens());
        fields += ",CTO_FIRMAS_MANCOMUNADAS ";
        fieldValues += ", ?";
        values.add(this.getCtoFirmasMancomunadas());
        fields += ",CTO_EST_INTERFID ";
        fieldValues += ", ?";
        values.add(this.getCtoEstInterfid());
        fields += ",CTO_TIPO_CONT ";
        fieldValues += ", ?";
        values.add(this.getCtoTipoCont());
        fields += ",CTO_TIPO_FISO ";
        fieldValues += ", ?";
        values.add(this.getCtoTipoFiso());
        fields += ",CTO_MONEDA ";
        fieldValues += ", ?";
        values.add(this.getCtoMoneda());
        fields += ",CTO_CVE_AREA_INST ";
        fieldValues += ", ?";
        values.add(this.getCtoCveAreaInst());
        fields += ",CTO_ESTATUS_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getCtoEstatusFideicomiso());
        fields += ",CTO_ESTATUS_ACTIVIDAD ";
        fieldValues += ", ?";
        values.add(this.getCtoEstatusActividad());
        fields += ",CTO_ESTATUS_HOGAN ";
        fieldValues += ", ?";
        values.add(this.getCtoEstatusHogan());
        fields += ",CTO_MANEJA_MON_EXT ";
        fieldValues += ", ?";
        values.add(this.getCtoManejaMonExt());
        fields += ",CTO_SUB_ESTATUS_ACT ";
        fieldValues += ", ?";
        values.add(this.getCtoSubEstatusAct());
        fields += ",CTO_RISK_RATING ";
        fieldValues += ", ?";
        values.add(this.getCtoRiskRating());
        fields += ",CTO_TIPO_REMEDIACION ";
        fieldValues += ", ?";
        values.add(this.getCtoTipoRemediacion());
        fields += ",CTO_ESTATUS_REMEDIACION ";
        fieldValues += ", ?";
        values.add(this.getCtoEstatusRemediacion());
        fields += ",CTO_GRID ";
        fieldValues += ", ?";
        values.add(this.getCtoGrid());
        fields += ",CTO_SUB_ESTATUS_REME ";
        fieldValues += ", ?";
        values.add(this.getCtoSubEstatusReme());
        fields += ",CTO_FECHA_ULTIMA_REV ";
        fieldValues += ", ?";
        values.add(this.getCtoFechaUltimaRev());
        fields += ",CTO_FECHA_PROX_REV ";
        fieldValues += ", ?";
        values.add(this.getCtoFechaProxRev());
        fields += ",CTO_PENDIENTES_PREDIAL ";
        fieldValues += ", ?";
        values.add(this.getCtoPendientesPredial());
        fields += ",CTO_EMBARGO ";
        fieldValues += ", ?";
        values.add(this.getCtoEmbargo());
        fields += ",CTO_CLASIFICACION_SAT ";
        fieldValues += ", ?";
        values.add(this.getCtoClasificacionSat());
        fields += ",CTO_GIIN ";
        fieldValues += ", ?";
        values.add(this.getCtoGiin());
        fields += ",CTO_RETENCIONES_FISC ";
        fieldValues += ", ?";
        values.add(this.getCtoRetencionesFisc());
        fields += ",CTO_TIN ";
        fieldValues += ", ?";
        values.add(this.getCtoTin());
        fields += ",CTO_EXCENTO ";
        fieldValues += ", ?";
        values.add(this.getCtoExcento());
        fields += ",CTO_CLAS_FATCA ";
        fieldValues += ", ?";
        values.add(this.getCtoClasFatca());
        fields += ",CTO_AUTOCER_FATCA ";
        fieldValues += ", ?";
        values.add(this.getCtoAutocerFatca());
        fields += ",CTO_CLAS_CRS ";
        fieldValues += ", ?";
        values.add(this.getCtoClasCrs());
        fields += ",CTO_AUTOCER_CRC ";
        fieldValues += ", ?";
        values.add(this.getCtoAutocerCrc());
        fields += ",CTO_PENDIENTES_REND_CUENTA ";
        fieldValues += ", ?";
        values.add(this.getCtoPendientesRendCuenta());
        fields += ",CTO_PENDIENTES_CONTABLES ";
        fieldValues += ", ?";
        values.add(this.getCtoPendientesContables());
        fields += ",CTO_CSEM ";
        fieldValues += ", ?";
        values.add(this.getCtoCsem());
        fields += ",CTO_HONORARIOS_PEND ";
        fieldValues += ", ?";
        values.add(this.getCtoHonorariosPend());
        fields += ",CTO_RFC_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getCtoRfcFideicomiso());
        fields += ",CTO_PER_HOGAN ";
        fieldValues += ", ?";
        values.add(this.getCtoPerHogan());
        fields += ",CTO_FEC_CONST ";
        fieldValues += ", ?";
        values.add(this.getCtoFecConst());
        fields += ",CTO_EMPRESA ";
        fieldValues += ", ?";
        values.add(this.getCtoEmpresa());
        fields += ",CTO_PROM_FID ";
        fieldValues += ", ?";
        values.add(this.getCtoPromFid());
        fields += ",CTO_RM_LIN_NEG ";
        fieldValues += ", ?";
        values.add(this.getCtoRmLinNeg());
        fields += ",CTO_PROM_CLI_SPE ";
        fieldValues += ", ?";
        values.add(this.getCtoPromCliSpe());
        fields += ",CTO_CVE_PROM_CS_HOGAN ";
        fieldValues += ", ?";
        values.add(this.getCtoCvePromCsHogan());
        fields += ",CTO_PROM_CLI_MAN ";
        fieldValues += ", ?";
        values.add(this.getCtoPromCliMan());
        fields += ",CTO_CVE_PROM_CM_HOGAN ";
        fieldValues += ", ?";
        values.add(this.getCtoCvePromCmHogan());
        fields += ",CTO_SUCURSAL ";
        fieldValues += ", ?";
        values.add(this.getCtoSucursal());
        fields += ",CTO_LIN_NEG ";
        fieldValues += ", ?";
        values.add(this.getCtoLinNeg());
        fields += ",CTO_JUICIOS ";
        fieldValues += ", ?";
        values.add(this.getCtoJuicios());
        fields += ",CTO_OBS_JUICIO ";
        fieldValues += ", ?";
        values.add(this.getCtoObsJuicio());
        fields += ",CTO_FEC_CONTRATO ";
        fieldValues += ", ?";
        values.add(this.getCtoFecContrato());
        fields += ",CTO_CONT_PRIV_COMEN ";
        fieldValues += ", ?";
        values.add(this.getCtoContPrivComen());
        fields += ",CTO_ESC_PUB_FEC ";
        fieldValues += ", ?";
        values.add(this.getCtoEscPubFec());
        fields += ",CTO_TIPO_ESCRITURA ";
        fieldValues += ", ?";
        values.add(this.getCtoTipoEscritura());
        fields += ",CTO_RPP_FEC_INS ";
        fieldValues += ", ?";
        values.add(this.getCtoRppFecIns());
        fields += ",CTO_RPP_LUG_REG ";
        fieldValues += ", ?";
        values.add(this.getCtoRppLugReg());
        fields += ",CTO_RPP_FOLIO ";
        fieldValues += ", ?";
        values.add(this.getCtoRppFolio());
        fields += ",CTO_RPP_PARTIDA ";
        fieldValues += ", ?";
        values.add(this.getCtoRppPartida());
        fields += ",CTO_RPP_VOLUMEN ";
        fieldValues += ", ?";
        values.add(this.getCtoRppVolumen());
        fields += ",CTO_NUM_CONTRATO ";
        fieldValues += ", ?";
        values.add(this.getCtoNumContrato());
        fields += ",CTO_NUM_CLIENTE ";
        fieldValues += ", ?";
        values.add(this.getCtoNumCliente());
        fields += ",CTO_NUM_CTO_EJE ";
        fieldValues += ", ?";
        values.add(this.getCtoNumCtoEje());
        fields += ",CTO_CVE_TIPO_NEG ";
        fieldValues += ", ?";
        values.add(this.getCtoCveTipoNeg());
        fields += ",CTO_CVE_CLAS_PROD ";
        fieldValues += ", ?";
        values.add(this.getCtoCveClasProd());
        fields += ",CTO_NUM_PRODUCTO ";
        fieldValues += ", ?";
        values.add(this.getCtoNumProducto());
        fields += ",CTO_NOM_CONTRATO ";
        fieldValues += ", ?";
        values.add(this.getCtoNomContrato());
        fields += ",CTO_CVE_FORMA_MAN ";
        fieldValues += ", ?";
        values.add(this.getCtoCveFormaMan());
        fields += ",CTO_CVE_TIPO_PER ";
        fieldValues += ", ?";
        values.add(this.getCtoCveTipoPer());
        fields += ",CTO_CVE_RETENCION ";
        fieldValues += ", ?";
        values.add(this.getCtoCveRetencion());
        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();
        sql += fields + " ) VALUES (" + fieldValues + ")";
        result.setSql(sql);
        result.setParameters(values.toArray());
        return result;
    }

    public DMLObject getDelete() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONTRATO WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND CTO_NUM_CONTRATO = ?";
        values.add(this.getCtoNumContrato());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Contrato instance = (Contrato) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCtoSubdirector().equals(instance.getCtoSubdirector()))
            equalObjects = false;
        if (equalObjects && !this.getCtoGrupo().equals(instance.getCtoGrupo()))
            equalObjects = false;
        if (equalObjects && !this.getCtoPenFiscales().equals(instance.getCtoPenFiscales()))
            equalObjects = false;
        if (equalObjects && !this.getCtoDocFaltante().equals(instance.getCtoDocFaltante()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRppFojas().equals(instance.getCtoRppFojas()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRppLibro().equals(instance.getCtoRppLibro()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRppSeccion().equals(instance.getCtoRppSeccion()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCis().equals(instance.getCtoCis()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumAntLegacy().equals(instance.getCtoNumAntLegacy()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveComiteTec().equals(instance.getCtoCveComiteTec()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveArt28().equals(instance.getCtoCveArt28()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveExclu30().equals(instance.getCtoCveExclu30()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveMonExt().equals(instance.getCtoCveMonExt()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveRevocable().equals(instance.getCtoCveRevocable()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveRepProd().equals(instance.getCtoCveRepProd()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumOficioExe().equals(instance.getCtoNumOficioExe()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRegNalInvEx().equals(instance.getCtoRegNalInvEx()))
            equalObjects = false;
        if (equalObjects && !this.getCtoAnoApertura().equals(instance.getCtoAnoApertura()))
            equalObjects = false;
        if (equalObjects && !this.getCtoMesApertura().equals(instance.getCtoMesApertura()))
            equalObjects = false;
        if (equalObjects && !this.getCtoDiaApertura().equals(instance.getCtoDiaApertura()))
            equalObjects = false;
        if (equalObjects && !this.getCtoAnoVencim().equals(instance.getCtoAnoVencim()))
            equalObjects = false;
        if (equalObjects && !this.getCtoMesVencim().equals(instance.getCtoMesVencim()))
            equalObjects = false;
        if (equalObjects && !this.getCtoDiaVencim().equals(instance.getCtoDiaVencim()))
            equalObjects = false;
        if (equalObjects && !this.getCtoAnoAnivers().equals(instance.getCtoAnoAnivers()))
            equalObjects = false;
        if (equalObjects && !this.getCtoMesAnivers().equals(instance.getCtoMesAnivers()))
            equalObjects = false;
        if (equalObjects && !this.getCtoDiaAnivers().equals(instance.getCtoDiaAnivers()))
            equalObjects = false;
        if (equalObjects && !this.getCtoAnoCancela().equals(instance.getCtoAnoCancela()))
            equalObjects = false;
        if (equalObjects && !this.getCtoMesCancela().equals(instance.getCtoMesCancela()))
            equalObjects = false;
        if (equalObjects && !this.getCtoDiaCancela().equals(instance.getCtoDiaCancela()))
            equalObjects = false;
        if (equalObjects && !this.getCtoFecInscRnie().equals(instance.getCtoFecInscRnie()))
            equalObjects = false;
        if (equalObjects && !this.getCtoAnoAltaReg().equals(instance.getCtoAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoMesAltaReg().equals(instance.getCtoMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoDiaAltaReg().equals(instance.getCtoDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoAnoUltMod().equals(instance.getCtoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtoMesUltMod().equals(instance.getCtoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtoDiaUltMod().equals(instance.getCtoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveStContrat().equals(instance.getCtoCveStContrat()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveSubcto().equals(instance.getCtoCveSubcto()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNivel1().equals(instance.getCtoNumNivel1()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNivel2().equals(instance.getCtoNumNivel2()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNivel3().equals(instance.getCtoNumNivel3()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNivel4().equals(instance.getCtoNumNivel4()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNivel5().equals(instance.getCtoNumNivel5()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRegShcp().equals(instance.getCtoRegShcp()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveShcp().equals(instance.getCtoCveShcp()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRegGobdf().equals(instance.getCtoRegGobdf()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveGobdf().equals(instance.getCtoCveGobdf()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRama().equals(instance.getCtoRama()))
            equalObjects = false;
        if (equalObjects && !this.getCtoSubRama().equals(instance.getCtoSubRama()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNomActividad().equals(instance.getCtoNomActividad()))
            equalObjects = false;
        if (equalObjects && !this.getCtoTipoClient().equals(instance.getCtoTipoClient()))
            equalObjects = false;
        if (equalObjects && !this.getCtoTipoPublic().equals(instance.getCtoTipoPublic()))
            equalObjects = false;
        if (equalObjects && !this.getCtoTipoContacto().equals(instance.getCtoTipoContacto()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumEscritura().equals(instance.getCtoNumEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumNotario().equals(instance.getCtoNumNotario()))
            equalObjects = false;
        if (equalObjects && !this.getCtoTipoAdmon().equals(instance.getCtoTipoAdmon()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveReqSors().equals(instance.getCtoCveReqSors()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumExpSors().equals(instance.getCtoNumExpSors()))
            equalObjects = false;
        if (equalObjects && !this.getCtoFecActShcp().equals(instance.getCtoFecActShcp()))
            equalObjects = false;
        if (equalObjects && !this.getCtoFoseg().equals(instance.getCtoFoseg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoEnvioMens().equals(instance.getCtoEnvioMens()))
            equalObjects = false;
        if (equalObjects && !this.getCtoFirmasMancomunadas().equals(instance.getCtoFirmasMancomunadas()))
            equalObjects = false;
        if (equalObjects && !this.getCtoEstInterfid().equals(instance.getCtoEstInterfid()))
            equalObjects = false;
        if (equalObjects && !this.getCtoTipoCont().equals(instance.getCtoTipoCont()))
            equalObjects = false;
        if (equalObjects && !this.getCtoTipoFiso().equals(instance.getCtoTipoFiso()))
            equalObjects = false;
        if (equalObjects && !this.getCtoMoneda().equals(instance.getCtoMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveAreaInst().equals(instance.getCtoCveAreaInst()))
            equalObjects = false;
        if (equalObjects && !this.getCtoEstatusFideicomiso().equals(instance.getCtoEstatusFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getCtoEstatusActividad().equals(instance.getCtoEstatusActividad()))
            equalObjects = false;
        if (equalObjects && !this.getCtoEstatusHogan().equals(instance.getCtoEstatusHogan()))
            equalObjects = false;
        if (equalObjects && !this.getCtoManejaMonExt().equals(instance.getCtoManejaMonExt()))
            equalObjects = false;
        if (equalObjects && !this.getCtoSubEstatusAct().equals(instance.getCtoSubEstatusAct()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRiskRating().equals(instance.getCtoRiskRating()))
            equalObjects = false;
        if (equalObjects && !this.getCtoTipoRemediacion().equals(instance.getCtoTipoRemediacion()))
            equalObjects = false;
        if (equalObjects && !this.getCtoEstatusRemediacion().equals(instance.getCtoEstatusRemediacion()))
            equalObjects = false;
        if (equalObjects && !this.getCtoGrid().equals(instance.getCtoGrid()))
            equalObjects = false;
        if (equalObjects && !this.getCtoSubEstatusReme().equals(instance.getCtoSubEstatusReme()))
            equalObjects = false;
        if (equalObjects && !this.getCtoFechaUltimaRev().equals(instance.getCtoFechaUltimaRev()))
            equalObjects = false;
        if (equalObjects && !this.getCtoFechaProxRev().equals(instance.getCtoFechaProxRev()))
            equalObjects = false;
        if (equalObjects && !this.getCtoPendientesPredial().equals(instance.getCtoPendientesPredial()))
            equalObjects = false;
        if (equalObjects && !this.getCtoEmbargo().equals(instance.getCtoEmbargo()))
            equalObjects = false;
        if (equalObjects && !this.getCtoClasificacionSat().equals(instance.getCtoClasificacionSat()))
            equalObjects = false;
        if (equalObjects && !this.getCtoGiin().equals(instance.getCtoGiin()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRetencionesFisc().equals(instance.getCtoRetencionesFisc()))
            equalObjects = false;
        if (equalObjects && !this.getCtoTin().equals(instance.getCtoTin()))
            equalObjects = false;
        if (equalObjects && !this.getCtoExcento().equals(instance.getCtoExcento()))
            equalObjects = false;
        if (equalObjects && !this.getCtoClasFatca().equals(instance.getCtoClasFatca()))
            equalObjects = false;
        if (equalObjects && !this.getCtoAutocerFatca().equals(instance.getCtoAutocerFatca()))
            equalObjects = false;
        if (equalObjects && !this.getCtoClasCrs().equals(instance.getCtoClasCrs()))
            equalObjects = false;
        if (equalObjects && !this.getCtoAutocerCrc().equals(instance.getCtoAutocerCrc()))
            equalObjects = false;
        if (equalObjects && !this.getCtoPendientesRendCuenta().equals(instance.getCtoPendientesRendCuenta()))
            equalObjects = false;
        if (equalObjects && !this.getCtoPendientesContables().equals(instance.getCtoPendientesContables()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCsem().equals(instance.getCtoCsem()))
            equalObjects = false;
        if (equalObjects && !this.getCtoHonorariosPend().equals(instance.getCtoHonorariosPend()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRfcFideicomiso().equals(instance.getCtoRfcFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getCtoPerHogan().equals(instance.getCtoPerHogan()))
            equalObjects = false;
        if (equalObjects && !this.getCtoFecConst().equals(instance.getCtoFecConst()))
            equalObjects = false;
        if (equalObjects && !this.getCtoEmpresa().equals(instance.getCtoEmpresa()))
            equalObjects = false;
        if (equalObjects && !this.getCtoPromFid().equals(instance.getCtoPromFid()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRmLinNeg().equals(instance.getCtoRmLinNeg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoPromCliSpe().equals(instance.getCtoPromCliSpe()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCvePromCsHogan().equals(instance.getCtoCvePromCsHogan()))
            equalObjects = false;
        if (equalObjects && !this.getCtoPromCliMan().equals(instance.getCtoPromCliMan()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCvePromCmHogan().equals(instance.getCtoCvePromCmHogan()))
            equalObjects = false;
        if (equalObjects && !this.getCtoSucursal().equals(instance.getCtoSucursal()))
            equalObjects = false;
        if (equalObjects && !this.getCtoLinNeg().equals(instance.getCtoLinNeg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoJuicios().equals(instance.getCtoJuicios()))
            equalObjects = false;
        if (equalObjects && !this.getCtoObsJuicio().equals(instance.getCtoObsJuicio()))
            equalObjects = false;
        if (equalObjects && !this.getCtoFecContrato().equals(instance.getCtoFecContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtoContPrivComen().equals(instance.getCtoContPrivComen()))
            equalObjects = false;
        if (equalObjects && !this.getCtoEscPubFec().equals(instance.getCtoEscPubFec()))
            equalObjects = false;
        if (equalObjects && !this.getCtoTipoEscritura().equals(instance.getCtoTipoEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRppFecIns().equals(instance.getCtoRppFecIns()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRppLugReg().equals(instance.getCtoRppLugReg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRppFolio().equals(instance.getCtoRppFolio()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRppPartida().equals(instance.getCtoRppPartida()))
            equalObjects = false;
        if (equalObjects && !this.getCtoRppVolumen().equals(instance.getCtoRppVolumen()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumContrato().equals(instance.getCtoNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumCliente().equals(instance.getCtoNumCliente()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumCtoEje().equals(instance.getCtoNumCtoEje()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveTipoNeg().equals(instance.getCtoCveTipoNeg()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveClasProd().equals(instance.getCtoCveClasProd()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNumProducto().equals(instance.getCtoNumProducto()))
            equalObjects = false;
        if (equalObjects && !this.getCtoNomContrato().equals(instance.getCtoNomContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveFormaMan().equals(instance.getCtoCveFormaMan()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveTipoPer().equals(instance.getCtoCveTipoPer()))
            equalObjects = false;
        if (equalObjects && !this.getCtoCveRetencion().equals(instance.getCtoCveRetencion()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Contrato result = new Contrato();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setCtoSubdirector((String) objectData.getData("CTO_SUBDIRECTOR"));
        result.setCtoGrupo((String) objectData.getData("CTO_GRUPO"));
        result.setCtoPenFiscales((BigDecimal) objectData.getData("CTO_PEN_FISCALES"));
        result.setCtoDocFaltante((BigDecimal) objectData.getData("CTO_DOC_FALTANTE"));
        result.setCtoRppFojas((String) objectData.getData("CTO_RPP_FOJAS"));
        result.setCtoRppLibro((String) objectData.getData("CTO_RPP_LIBRO"));
        result.setCtoRppSeccion((String) objectData.getData("CTO_RPP_SECCION"));
        result.setCtoCis((String) objectData.getData("CTO_CIS"));
        result.setCtoNumAntLegacy((String) objectData.getData("CTO_NUM_ANT_LEGACY"));
        result.setCtoCveComiteTec((BigDecimal) objectData.getData("CTO_CVE_COMITE_TEC"));
        result.setCtoCveArt28((BigDecimal) objectData.getData("CTO_CVE_ART_28"));
        result.setCtoCveExclu30((BigDecimal) objectData.getData("CTO_CVE_EXCLU_30"));
        result.setCtoCveMonExt((BigDecimal) objectData.getData("CTO_CVE_MON_EXT"));
        result.setCtoCveRevocable((BigDecimal) objectData.getData("CTO_CVE_REVOCABLE"));
        result.setCtoCveRepProd((BigDecimal) objectData.getData("CTO_CVE_REP_PROD"));
        result.setCtoNumOficioExe((String) objectData.getData("CTO_NUM_OFICIO_EXE"));
        result.setCtoRegNalInvEx((String) objectData.getData("CTO_REG_NAL_INV_EX"));
        result.setCtoAnoApertura((BigDecimal) objectData.getData("CTO_ANO_APERTURA"));
        result.setCtoMesApertura((BigDecimal) objectData.getData("CTO_MES_APERTURA"));
        result.setCtoDiaApertura((BigDecimal) objectData.getData("CTO_DIA_APERTURA"));
        result.setCtoAnoVencim((BigDecimal) objectData.getData("CTO_ANO_VENCIM"));
        result.setCtoMesVencim((BigDecimal) objectData.getData("CTO_MES_VENCIM"));
        result.setCtoDiaVencim((BigDecimal) objectData.getData("CTO_DIA_VENCIM"));
        result.setCtoAnoAnivers((BigDecimal) objectData.getData("CTO_ANO_ANIVERS"));
        result.setCtoMesAnivers((BigDecimal) objectData.getData("CTO_MES_ANIVERS"));
        result.setCtoDiaAnivers((BigDecimal) objectData.getData("CTO_DIA_ANIVERS"));
        result.setCtoAnoCancela((BigDecimal) objectData.getData("CTO_ANO_CANCELA"));
        result.setCtoMesCancela((BigDecimal) objectData.getData("CTO_MES_CANCELA"));
        result.setCtoDiaCancela((BigDecimal) objectData.getData("CTO_DIA_CANCELA"));
        result.setCtoFecInscRnie((String) objectData.getData("CTO_FEC_INSC_RNIE"));
        result.setCtoAnoAltaReg((BigDecimal) objectData.getData("CTO_ANO_ALTA_REG"));
        result.setCtoMesAltaReg((BigDecimal) objectData.getData("CTO_MES_ALTA_REG"));
        result.setCtoDiaAltaReg((BigDecimal) objectData.getData("CTO_DIA_ALTA_REG"));
        result.setCtoAnoUltMod((BigDecimal) objectData.getData("CTO_ANO_ULT_MOD"));
        result.setCtoMesUltMod((BigDecimal) objectData.getData("CTO_MES_ULT_MOD"));
        result.setCtoDiaUltMod((BigDecimal) objectData.getData("CTO_DIA_ULT_MOD"));
        result.setCtoCveStContrat((String) objectData.getData("CTO_CVE_ST_CONTRAT"));
        result.setCtoCveSubcto((BigDecimal) objectData.getData("CTO_CVE_SUBCTO"));
        result.setCtoNumNivel1((BigDecimal) objectData.getData("CTO_NUM_NIVEL1"));
        result.setCtoNumNivel2((BigDecimal) objectData.getData("CTO_NUM_NIVEL2"));
        result.setCtoNumNivel3((BigDecimal) objectData.getData("CTO_NUM_NIVEL3"));
        result.setCtoNumNivel4((BigDecimal) objectData.getData("CTO_NUM_NIVEL4"));
        result.setCtoNumNivel5((BigDecimal) objectData.getData("CTO_NUM_NIVEL5"));
        result.setCtoRegShcp((String) objectData.getData("CTO_REG_SHCP"));
        result.setCtoCveShcp((BigDecimal) objectData.getData("CTO_CVE_SHCP"));
        result.setCtoRegGobdf((String) objectData.getData("CTO_REG_GOBDF"));
        result.setCtoCveGobdf((BigDecimal) objectData.getData("CTO_CVE_GOBDF"));
        result.setCtoRama((BigDecimal) objectData.getData("CTO_RAMA"));
        result.setCtoSubRama((BigDecimal) objectData.getData("CTO_SUB_RAMA"));
        result.setCtoNomActividad((String) objectData.getData("CTO_NOM_ACTIVIDAD"));
        result.setCtoTipoClient((String) objectData.getData("CTO_TIPO_CLIENT"));
        result.setCtoTipoPublic((String) objectData.getData("CTO_TIPO_PUBLIC"));
        result.setCtoTipoContacto((String) objectData.getData("CTO_TIPO_CONTACTO"));
        result.setCtoNumEscritura((String) objectData.getData("CTO_NUM_ESCRITURA"));
        result.setCtoNumNotario((BigDecimal) objectData.getData("CTO_NUM_NOTARIO"));
        result.setCtoTipoAdmon((String) objectData.getData("CTO_TIPO_ADMON"));
        result.setCtoCveReqSors((BigDecimal) objectData.getData("CTO_CVE_REQ_SORS"));
        result.setCtoNumExpSors((String) objectData.getData("CTO_NUM_EXP_SORS"));
        result.setCtoFecActShcp((String) objectData.getData("CTO_FEC_ACT_SHCP"));
        result.setCtoFoseg((String) objectData.getData("CTO_FOSEG"));
        result.setCtoEnvioMens((BigDecimal) objectData.getData("CTO_ENVIO_MENS"));
        result.setCtoFirmasMancomunadas((BigDecimal) objectData.getData("CTO_FIRMAS_MANCOMUNADAS"));
        result.setCtoEstInterfid((String) objectData.getData("CTO_EST_INTERFID"));
        result.setCtoTipoCont((String) objectData.getData("CTO_TIPO_CONT"));
        result.setCtoTipoFiso((BigDecimal) objectData.getData("CTO_TIPO_FISO"));
        result.setCtoMoneda((BigDecimal) objectData.getData("CTO_MONEDA"));
        result.setCtoCveAreaInst((String) objectData.getData("CTO_CVE_AREA_INST"));
        result.setCtoEstatusFideicomiso((String) objectData.getData("CTO_ESTATUS_FIDEICOMISO"));
        result.setCtoEstatusActividad((String) objectData.getData("CTO_ESTATUS_ACTIVIDAD"));
        result.setCtoEstatusHogan((String) objectData.getData("CTO_ESTATUS_HOGAN"));
        result.setCtoManejaMonExt((String) objectData.getData("CTO_MANEJA_MON_EXT"));
        result.setCtoSubEstatusAct((String) objectData.getData("CTO_SUB_ESTATUS_ACT"));
        result.setCtoRiskRating((String) objectData.getData("CTO_RISK_RATING"));
        result.setCtoTipoRemediacion((String) objectData.getData("CTO_TIPO_REMEDIACION"));
        result.setCtoEstatusRemediacion((String) objectData.getData("CTO_ESTATUS_REMEDIACION"));
        result.setCtoGrid((String) objectData.getData("CTO_GRID"));
        result.setCtoSubEstatusReme((String) objectData.getData("CTO_SUB_ESTATUS_REME"));
        result.setCtoFechaUltimaRev((String) objectData.getData("CTO_FECHA_ULTIMA_REV"));
        result.setCtoFechaProxRev((String) objectData.getData("CTO_FECHA_PROX_REV"));
        result.setCtoPendientesPredial((BigDecimal) objectData.getData("CTO_PENDIENTES_PREDIAL"));
        result.setCtoEmbargo((BigDecimal) objectData.getData("CTO_EMBARGO"));
        result.setCtoClasificacionSat((String) objectData.getData("CTO_CLASIFICACION_SAT"));
        result.setCtoGiin((String) objectData.getData("CTO_GIIN"));
        result.setCtoRetencionesFisc((String) objectData.getData("CTO_RETENCIONES_FISC"));
        result.setCtoTin((String) objectData.getData("CTO_TIN"));
        result.setCtoExcento((String) objectData.getData("CTO_EXCENTO"));
        result.setCtoClasFatca((String) objectData.getData("CTO_CLAS_FATCA"));
        result.setCtoAutocerFatca((BigDecimal) objectData.getData("CTO_AUTOCER_FATCA"));
        result.setCtoClasCrs((String) objectData.getData("CTO_CLAS_CRS"));
        result.setCtoAutocerCrc((BigDecimal) objectData.getData("CTO_AUTOCER_CRC"));
        result.setCtoPendientesRendCuenta((BigDecimal) objectData.getData("CTO_PENDIENTES_REND_CUENTA"));
        result.setCtoPendientesContables((BigDecimal) objectData.getData("CTO_PENDIENTES_CONTABLES"));
        result.setCtoCsem((BigDecimal) objectData.getData("CTO_CSEM"));
        result.setCtoHonorariosPend((BigDecimal) objectData.getData("CTO_HONORARIOS_PEND"));
        result.setCtoRfcFideicomiso((String) objectData.getData("CTO_RFC_FIDEICOMISO"));
        result.setCtoPerHogan((String) objectData.getData("CTO_PER_HOGAN"));
        result.setCtoFecConst((String) objectData.getData("CTO_FEC_CONST"));
        result.setCtoEmpresa((String) objectData.getData("CTO_EMPRESA"));
        result.setCtoPromFid((String) objectData.getData("CTO_PROM_FID"));
        result.setCtoRmLinNeg((String) objectData.getData("CTO_RM_LIN_NEG"));
        result.setCtoPromCliSpe((String) objectData.getData("CTO_PROM_CLI_SPE"));
        result.setCtoCvePromCsHogan((String) objectData.getData("CTO_CVE_PROM_CS_HOGAN"));
        result.setCtoPromCliMan((String) objectData.getData("CTO_PROM_CLI_MAN"));
        result.setCtoCvePromCmHogan((String) objectData.getData("CTO_CVE_PROM_CM_HOGAN"));
        result.setCtoSucursal((String) objectData.getData("CTO_SUCURSAL"));
        result.setCtoLinNeg((String) objectData.getData("CTO_LIN_NEG"));
        result.setCtoJuicios((BigDecimal) objectData.getData("CTO_JUICIOS"));
        result.setCtoObsJuicio((String) objectData.getData("CTO_OBS_JUICIO"));
        result.setCtoFecContrato((String) objectData.getData("CTO_FEC_CONTRATO"));
        result.setCtoContPrivComen((String) objectData.getData("CTO_CONT_PRIV_COMEN"));
        result.setCtoEscPubFec((String) objectData.getData("CTO_ESC_PUB_FEC"));
        result.setCtoTipoEscritura((String) objectData.getData("CTO_TIPO_ESCRITURA"));
        result.setCtoRppFecIns((String) objectData.getData("CTO_RPP_FEC_INS"));
        result.setCtoRppLugReg((String) objectData.getData("CTO_RPP_LUG_REG"));
        result.setCtoRppFolio((String) objectData.getData("CTO_RPP_FOLIO"));
        result.setCtoRppPartida((String) objectData.getData("CTO_RPP_PARTIDA"));
        result.setCtoRppVolumen((String) objectData.getData("CTO_RPP_VOLUMEN"));
        result.setCtoNumContrato((BigDecimal) objectData.getData("CTO_NUM_CONTRATO"));
        result.setCtoNumCliente((BigDecimal) objectData.getData("CTO_NUM_CLIENTE"));
        result.setCtoNumCtoEje((BigDecimal) objectData.getData("CTO_NUM_CTO_EJE"));
        result.setCtoCveTipoNeg((String) objectData.getData("CTO_CVE_TIPO_NEG"));
        result.setCtoCveClasProd((String) objectData.getData("CTO_CVE_CLAS_PROD"));
        result.setCtoNumProducto((BigDecimal) objectData.getData("CTO_NUM_PRODUCTO"));
        result.setCtoNomContrato((String) objectData.getData("CTO_NOM_CONTRATO"));
        result.setCtoCveFormaMan((String) objectData.getData("CTO_CVE_FORMA_MAN"));
        result.setCtoCveTipoPer((String) objectData.getData("CTO_CVE_TIPO_PER"));
        result.setCtoCveRetencion((String) objectData.getData("CTO_CVE_RETENCION"));
        return result;
    }
}
