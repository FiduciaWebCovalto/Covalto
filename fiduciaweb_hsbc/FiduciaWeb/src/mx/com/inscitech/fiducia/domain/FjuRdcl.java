package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;

public class FjuRdcl extends DomainObject {
    String frdIdFideicomiso = null;
    String frdTipo = null;
    String frdFolioRdcl = null;
    String frdRequiereRdcl = null;
    String frdSeguimientoRdcl = null;
    String frdRdc = null;
    String frdBase = null;
    String frdFolioSocadi = null;
    String frdFideicomiso = null;
    String frdRelevantes = null;
    String frdMesFolSocadi = null;
    String frdAnoFolSocadi = null;
    String frdClientMangrQueRecib = null;
    String frdMedioDeNotifDelCm = null;
    String frdMotivoDeLaRendicion = null;
    String frdFeDeEntregaARdcl = null;
    String frdTipoDeFormato = null;
    String frdDivision = null;
    String frdEstatus = null;
    String frdObservaciones = null;
    String frdRegistradoPor = null;
    String frdMaesto = null;
    String frdStatusFsoMto = null;
    String frdCobranza = null;
    String frdOrigen = null;
    String frdRdclAdmonDelegPto = null;
    String frdAdministradores = null;
    String frdEnvioFiduciario = null;
    String frdNotifDeOrigen = null;
    String frdFecDeRen = null;
    String frdMesRev = null;
    String frdAnoRev = null;
    String frdPerDeLaRend = null;
    String frdDetDeRend = null;
    String frdApodQueFmaRen = null;
    String frdPodDeLaRen = null;
    String frdComentarios = null;
    String frdDocuAnexa = null;
    String frdDocuFalPorRequerir = null;
    String frdFecDeReqAFidPorIncts = null;
    String frdFecDeComuACte = null;
    String frdFecRdcComp = null;
    String frdRendDeCtasOp = null;
    String frdRendDeCtasLeg = null;
    String frdRmnCartaInstDto = null;
    String frdInmueble = null;
    String frdFeCtaInstr = null;
    String frdQInstYFmaCtaIns = null;
    String frdEscritura = null;
    String frdFechaDeEscritura = null;
    String frdNotariaNo = null;
    String frdNotario = null;
    String frdEntidad = null;
    String frdTipoDePoder = null;
    String frdFacultades = null;
    String frdVigencia = null;
    String frdApoderados = null;
    String frdDomicilio = null;
    String frdImagenDelPoder = null;
    String frdNotasObv = null;
    String frdJuiEnBaseDeJuicios = null;
    String frdFideConJuicios = null;
    String frdNombreActorDteQjo = null;
    String frdDemandadoTroInt = null;
    String frdExpediente = null;
    String frdJuzgado = null;
    String frdTipoJuzgado = null;
    String frdTipoJuicio = null;
    String frdLocalidad = null;
    String frdEstado = null;
    String frdPrestReclamadas = null;
    String frdEdoProcJuicio = null;
    String frdDefACargoDe = null;
    String frdConstProc = null;
    String frdCtdaBaseDeJuicios = null;
    String frdFolioJuicios = null;
    BigDecimal frdFolioWf = null;
    String frdFechaUltimaRdc = null;
    String frdUltimaRdcRecib = null;
    String frdEstadusRdc = null;
    String frdComentariosLegales = null;
    String frdEdoFinancierosPend = null;
    String frdFechaUltimaOpinion = null;
    String frdFechaUltimaCartaresp = null;

    public FjuRdcl() {
        super();
        this.pkColumns = 8;
    }

    public void setFrdIdFideicomiso(String frdIdFideicomiso) {
        this.frdIdFideicomiso = frdIdFideicomiso;
    }

    public void setFrdTipo(String frdTipo) {
        this.frdTipo = frdTipo;
    }

    public void setFrdFolioRdcl(String frdFolioRdcl) {
        this.frdFolioRdcl = frdFolioRdcl;
    }

    public void setFrdRequiereRdcl(String frdRequiereRdcl) {
        this.frdRequiereRdcl = frdRequiereRdcl;
    }

    public void setFrdSeguimientoRdcl(String frdSeguimientoRdcl) {
        this.frdSeguimientoRdcl = frdSeguimientoRdcl;
    }

    public void setFrdRdc(String frdRdc) {
        this.frdRdc = frdRdc;
    }

    public void setFrdBase(String frdBase) {
        this.frdBase = frdBase;
    }

    public void setFrdFolioSocadi(String frdFolioSocadi) {
        this.frdFolioSocadi = frdFolioSocadi;
    }

    public void setFrdFideicomiso(String frdFideicomiso) {
        this.frdFideicomiso = frdFideicomiso;
    }

    public void setFrdRelevantes(String frdRelevantes) {
        this.frdRelevantes = frdRelevantes;
    }

    public void setFrdMesFolSocadi(String frdMesFolSocadi) {
        this.frdMesFolSocadi = frdMesFolSocadi;
    }

    public void setFrdAnoFolSocadi(String frdAnoFolSocadi) {
        this.frdAnoFolSocadi = frdAnoFolSocadi;
    }

    public void setFrdClientMangrQueRecib(String frdClientMangrQueRecib) {
        this.frdClientMangrQueRecib = frdClientMangrQueRecib;
    }

    public void setFrdMedioDeNotifDelCm(String frdMedioDeNotifDelCm) {
        this.frdMedioDeNotifDelCm = frdMedioDeNotifDelCm;
    }

    public void setFrdMotivoDeLaRendicion(String frdMotivoDeLaRendicion) {
        this.frdMotivoDeLaRendicion = frdMotivoDeLaRendicion;
    }

    public void setFrdFeDeEntregaARdcl(String frdFeDeEntregaARdcl) {
        this.frdFeDeEntregaARdcl = frdFeDeEntregaARdcl;
    }

    public void setFrdTipoDeFormato(String frdTipoDeFormato) {
        this.frdTipoDeFormato = frdTipoDeFormato;
    }

    public void setFrdDivision(String frdDivision) {
        this.frdDivision = frdDivision;
    }

    public void setFrdEstatus(String frdEstatus) {
        this.frdEstatus = frdEstatus;
    }

    public void setFrdObservaciones(String frdObservaciones) {
        this.frdObservaciones = frdObservaciones;
    }

    public void setFrdRegistradoPor(String frdRegistradoPor) {
        this.frdRegistradoPor = frdRegistradoPor;
    }

    public void setFrdMaesto(String frdMaesto) {
        this.frdMaesto = frdMaesto;
    }

    public void setFrdStatusFsoMto(String frdStatusFsoMto) {
        this.frdStatusFsoMto = frdStatusFsoMto;
    }

    public void setFrdCobranza(String frdCobranza) {
        this.frdCobranza = frdCobranza;
    }

    public void setFrdOrigen(String frdOrigen) {
        this.frdOrigen = frdOrigen;
    }

    public void setFrdRdclAdmonDelegPto(String frdRdclAdmonDelegPto) {
        this.frdRdclAdmonDelegPto = frdRdclAdmonDelegPto;
    }

    public void setFrdAdministradores(String frdAdministradores) {
        this.frdAdministradores = frdAdministradores;
    }

    public void setFrdEnvioFiduciario(String frdEnvioFiduciario) {
        this.frdEnvioFiduciario = frdEnvioFiduciario;
    }

    public void setFrdNotifDeOrigen(String frdNotifDeOrigen) {
        this.frdNotifDeOrigen = frdNotifDeOrigen;
    }

    public void setFrdFecDeRen(String frdFecDeRen) {
        this.frdFecDeRen = frdFecDeRen;
    }

    public void setFrdMesRev(String frdMesRev) {
        this.frdMesRev = frdMesRev;
    }

    public void setFrdAnoRev(String frdAnoRev) {
        this.frdAnoRev = frdAnoRev;
    }

    public void setFrdPerDeLaRend(String frdPerDeLaRend) {
        this.frdPerDeLaRend = frdPerDeLaRend;
    }

    public void setFrdDetDeRend(String frdDetDeRend) {
        this.frdDetDeRend = frdDetDeRend;
    }

    public void setFrdApodQueFmaRen(String frdApodQueFmaRen) {
        this.frdApodQueFmaRen = frdApodQueFmaRen;
    }

    public void setFrdPodDeLaRen(String frdPodDeLaRen) {
        this.frdPodDeLaRen = frdPodDeLaRen;
    }

    public void setFrdComentarios(String frdComentarios) {
        this.frdComentarios = frdComentarios;
    }

    public void setFrdDocuAnexa(String frdDocuAnexa) {
        this.frdDocuAnexa = frdDocuAnexa;
    }

    public void setFrdDocuFalPorRequerir(String frdDocuFalPorRequerir) {
        this.frdDocuFalPorRequerir = frdDocuFalPorRequerir;
    }

    public void setFrdFecDeReqAFidPorIncts(String frdFecDeReqAFidPorIncts) {
        this.frdFecDeReqAFidPorIncts = frdFecDeReqAFidPorIncts;
    }

    public void setFrdFecDeComuACte(String frdFecDeComuACte) {
        this.frdFecDeComuACte = frdFecDeComuACte;
    }

    public void setFrdFecRdcComp(String frdFecRdcComp) {
        this.frdFecRdcComp = frdFecRdcComp;
    }

    public void setFrdRendDeCtasOp(String frdRendDeCtasOp) {
        this.frdRendDeCtasOp = frdRendDeCtasOp;
    }

    public void setFrdRendDeCtasLeg(String frdRendDeCtasLeg) {
        this.frdRendDeCtasLeg = frdRendDeCtasLeg;
    }

    public void setFrdRmnCartaInstDto(String frdRmnCartaInstDto) {
        this.frdRmnCartaInstDto = frdRmnCartaInstDto;
    }

    public void setFrdInmueble(String frdInmueble) {
        this.frdInmueble = frdInmueble;
    }

    public void setFrdFeCtaInstr(String frdFeCtaInstr) {
        this.frdFeCtaInstr = frdFeCtaInstr;
    }

    public void setFrdQInstYFmaCtaIns(String frdQInstYFmaCtaIns) {
        this.frdQInstYFmaCtaIns = frdQInstYFmaCtaIns;
    }

    public void setFrdEscritura(String frdEscritura) {
        this.frdEscritura = frdEscritura;
    }

    public void setFrdFechaDeEscritura(String frdFechaDeEscritura) {
        this.frdFechaDeEscritura = frdFechaDeEscritura;
    }

    public void setFrdNotariaNo(String frdNotariaNo) {
        this.frdNotariaNo = frdNotariaNo;
    }

    public void setFrdNotario(String frdNotario) {
        this.frdNotario = frdNotario;
    }

    public void setFrdEntidad(String frdEntidad) {
        this.frdEntidad = frdEntidad;
    }

    public void setFrdTipoDePoder(String frdTipoDePoder) {
        this.frdTipoDePoder = frdTipoDePoder;
    }

    public void setFrdFacultades(String frdFacultades) {
        this.frdFacultades = frdFacultades;
    }

    public void setFrdVigencia(String frdVigencia) {
        this.frdVigencia = frdVigencia;
    }

    public void setFrdApoderados(String frdApoderados) {
        this.frdApoderados = frdApoderados;
    }

    public void setFrdDomicilio(String frdDomicilio) {
        this.frdDomicilio = frdDomicilio;
    }

    public void setFrdImagenDelPoder(String frdImagenDelPoder) {
        this.frdImagenDelPoder = frdImagenDelPoder;
    }

    public void setFrdNotasObv(String frdNotasObv) {
        this.frdNotasObv = frdNotasObv;
    }

    public void setFrdJuiEnBaseDeJuicios(String frdJuiEnBaseDeJuicios) {
        this.frdJuiEnBaseDeJuicios = frdJuiEnBaseDeJuicios;
    }

    public void setFrdFideConJuicios(String frdFideConJuicios) {
        this.frdFideConJuicios = frdFideConJuicios;
    }

    public void setFrdNombreActorDteQjo(String frdNombreActorDteQjo) {
        this.frdNombreActorDteQjo = frdNombreActorDteQjo;
    }

    public void setFrdDemandadoTroInt(String frdDemandadoTroInt) {
        this.frdDemandadoTroInt = frdDemandadoTroInt;
    }

    public void setFrdExpediente(String frdExpediente) {
        this.frdExpediente = frdExpediente;
    }

    public void setFrdJuzgado(String frdJuzgado) {
        this.frdJuzgado = frdJuzgado;
    }

    public void setFrdTipoJuzgado(String frdTipoJuzgado) {
        this.frdTipoJuzgado = frdTipoJuzgado;
    }

    public void setFrdTipoJuicio(String frdTipoJuicio) {
        this.frdTipoJuicio = frdTipoJuicio;
    }

    public void setFrdLocalidad(String frdLocalidad) {
        this.frdLocalidad = frdLocalidad;
    }

    public void setFrdEstado(String frdEstado) {
        this.frdEstado = frdEstado;
    }

    public void setFrdPrestReclamadas(String frdPrestReclamadas) {
        this.frdPrestReclamadas = frdPrestReclamadas;
    }

    public void setFrdEdoProcJuicio(String frdEdoProcJuicio) {
        this.frdEdoProcJuicio = frdEdoProcJuicio;
    }

    public void setFrdDefACargoDe(String frdDefACargoDe) {
        this.frdDefACargoDe = frdDefACargoDe;
    }

    public void setFrdConstProc(String frdConstProc) {
        this.frdConstProc = frdConstProc;
    }

    public void setFrdCtdaBaseDeJuicios(String frdCtdaBaseDeJuicios) {
        this.frdCtdaBaseDeJuicios = frdCtdaBaseDeJuicios;
    }

    public void setFrdFolioJuicios(String frdFolioJuicios) {
        this.frdFolioJuicios = frdFolioJuicios;
    }

    public void setFrdFolioWf(BigDecimal frdFolioWf) {
        this.frdFolioWf = frdFolioWf;
    }

    public void setFrdFechaUltimaRdc(String frdFechaUltimaRdc) {
        this.frdFechaUltimaRdc = frdFechaUltimaRdc;
    }

    public void setFrdUltimaRdcRecib(String frdUltimaRdcRecib) {
        this.frdUltimaRdcRecib = frdUltimaRdcRecib;
    }

    public void setFrdEstadusRdc(String frdEstadusRdc) {
        this.frdEstadusRdc = frdEstadusRdc;
    }

    public void setFrdComentariosLegales(String frdComentariosLegales) {
        this.frdComentariosLegales = frdComentariosLegales;
    }

    public void setFrdEdoFinancierosPend(String frdEdoFinancierosPend) {
        this.frdEdoFinancierosPend = frdEdoFinancierosPend;
    }

    public void setFrdFechaUltimaOpinion(String frdFechaUltimaOpinion) {
        this.frdFechaUltimaOpinion = frdFechaUltimaOpinion;
    }

    public void setFrdFechaUltimaCartaresp(String frdFechaUltimaCartaresp) {
        this.frdFechaUltimaCartaresp = frdFechaUltimaCartaresp;
    }

    public String getFrdIdFideicomiso() {
        return this.frdIdFideicomiso;
    }

    public String getFrdTipo() {
        return this.frdTipo;
    }

    public String getFrdFolioRdcl() {
        return this.frdFolioRdcl;
    }

    public String getFrdRequiereRdcl() {
        return this.frdRequiereRdcl;
    }

    public String getFrdSeguimientoRdcl() {
        return this.frdSeguimientoRdcl;
    }

    public String getFrdRdc() {
        return this.frdRdc;
    }

    public String getFrdBase() {
        return this.frdBase;
    }

    public String getFrdFolioSocadi() {
        return this.frdFolioSocadi;
    }

    public String getFrdFideicomiso() {
        return this.frdFideicomiso;
    }

    public String getFrdRelevantes() {
        return this.frdRelevantes;
    }

    public String getFrdMesFolSocadi() {
        return this.frdMesFolSocadi;
    }

    public String getFrdAnoFolSocadi() {
        return this.frdAnoFolSocadi;
    }

    public String getFrdClientMangrQueRecib() {
        return this.frdClientMangrQueRecib;
    }

    public String getFrdMedioDeNotifDelCm() {
        return this.frdMedioDeNotifDelCm;
    }

    public String getFrdMotivoDeLaRendicion() {
        return this.frdMotivoDeLaRendicion;
    }

    public String getFrdFeDeEntregaARdcl() {
        return this.frdFeDeEntregaARdcl;
    }

    public String getFrdTipoDeFormato() {
        return this.frdTipoDeFormato;
    }

    public String getFrdDivision() {
        return this.frdDivision;
    }

    public String getFrdEstatus() {
        return this.frdEstatus;
    }

    public String getFrdObservaciones() {
        return this.frdObservaciones;
    }

    public String getFrdRegistradoPor() {
        return this.frdRegistradoPor;
    }

    public String getFrdMaesto() {
        return this.frdMaesto;
    }

    public String getFrdStatusFsoMto() {
        return this.frdStatusFsoMto;
    }

    public String getFrdCobranza() {
        return this.frdCobranza;
    }

    public String getFrdOrigen() {
        return this.frdOrigen;
    }

    public String getFrdRdclAdmonDelegPto() {
        return this.frdRdclAdmonDelegPto;
    }

    public String getFrdAdministradores() {
        return this.frdAdministradores;
    }

    public String getFrdEnvioFiduciario() {
        return this.frdEnvioFiduciario;
    }

    public String getFrdNotifDeOrigen() {
        return this.frdNotifDeOrigen;
    }

    public String getFrdFecDeRen() {
        return this.frdFecDeRen;
    }

    public String getFrdMesRev() {
        return this.frdMesRev;
    }

    public String getFrdAnoRev() {
        return this.frdAnoRev;
    }

    public String getFrdPerDeLaRend() {
        return this.frdPerDeLaRend;
    }

    public String getFrdDetDeRend() {
        return this.frdDetDeRend;
    }

    public String getFrdApodQueFmaRen() {
        return this.frdApodQueFmaRen;
    }

    public String getFrdPodDeLaRen() {
        return this.frdPodDeLaRen;
    }

    public String getFrdComentarios() {
        return this.frdComentarios;
    }

    public String getFrdDocuAnexa() {
        return this.frdDocuAnexa;
    }

    public String getFrdDocuFalPorRequerir() {
        return this.frdDocuFalPorRequerir;
    }

    public String getFrdFecDeReqAFidPorIncts() {
        return this.frdFecDeReqAFidPorIncts;
    }

    public String getFrdFecDeComuACte() {
        return this.frdFecDeComuACte;
    }

    public String getFrdFecRdcComp() {
        return this.frdFecRdcComp;
    }

    public String getFrdRendDeCtasOp() {
        return this.frdRendDeCtasOp;
    }

    public String getFrdRendDeCtasLeg() {
        return this.frdRendDeCtasLeg;
    }

    public String getFrdRmnCartaInstDto() {
        return this.frdRmnCartaInstDto;
    }

    public String getFrdInmueble() {
        return this.frdInmueble;
    }

    public String getFrdFeCtaInstr() {
        return this.frdFeCtaInstr;
    }

    public String getFrdQInstYFmaCtaIns() {
        return this.frdQInstYFmaCtaIns;
    }

    public String getFrdEscritura() {
        return this.frdEscritura;
    }

    public String getFrdFechaDeEscritura() {
        return this.frdFechaDeEscritura;
    }

    public String getFrdNotariaNo() {
        return this.frdNotariaNo;
    }

    public String getFrdNotario() {
        return this.frdNotario;
    }

    public String getFrdEntidad() {
        return this.frdEntidad;
    }

    public String getFrdTipoDePoder() {
        return this.frdTipoDePoder;
    }

    public String getFrdFacultades() {
        return this.frdFacultades;
    }

    public String getFrdVigencia() {
        return this.frdVigencia;
    }

    public String getFrdApoderados() {
        return this.frdApoderados;
    }

    public String getFrdDomicilio() {
        return this.frdDomicilio;
    }

    public String getFrdImagenDelPoder() {
        return this.frdImagenDelPoder;
    }

    public String getFrdNotasObv() {
        return this.frdNotasObv;
    }

    public String getFrdJuiEnBaseDeJuicios() {
        return this.frdJuiEnBaseDeJuicios;
    }

    public String getFrdFideConJuicios() {
        return this.frdFideConJuicios;
    }

    public String getFrdNombreActorDteQjo() {
        return this.frdNombreActorDteQjo;
    }

    public String getFrdDemandadoTroInt() {
        return this.frdDemandadoTroInt;
    }

    public String getFrdExpediente() {
        return this.frdExpediente;
    }

    public String getFrdJuzgado() {
        return this.frdJuzgado;
    }

    public String getFrdTipoJuzgado() {
        return this.frdTipoJuzgado;
    }

    public String getFrdTipoJuicio() {
        return this.frdTipoJuicio;
    }

    public String getFrdLocalidad() {
        return this.frdLocalidad;
    }

    public String getFrdEstado() {
        return this.frdEstado;
    }

    public String getFrdPrestReclamadas() {
        return this.frdPrestReclamadas;
    }

    public String getFrdEdoProcJuicio() {
        return this.frdEdoProcJuicio;
    }

    public String getFrdDefACargoDe() {
        return this.frdDefACargoDe;
    }

    public String getFrdConstProc() {
        return this.frdConstProc;
    }

    public String getFrdCtdaBaseDeJuicios() {
        return this.frdCtdaBaseDeJuicios;
    }

    public String getFrdFolioJuicios() {
        return this.frdFolioJuicios;
    }

    public BigDecimal getFrdFolioWf() {
        return this.frdFolioWf;
    }

    public String getFrdFechaUltimaRdc() {
        return this.frdFechaUltimaRdc;
    }

    public String getFrdUltimaRdcRecib() {
        return this.frdUltimaRdcRecib;
    }

    public String getFrdEstadusRdc() {
        return this.frdEstadusRdc;
    }

    public String getFrdComentariosLegales() {
        return this.frdComentariosLegales;
    }

    public String getFrdEdoFinancierosPend() {
        return this.frdEdoFinancierosPend;
    }

    public String getFrdFechaUltimaOpinion() {
        return this.frdFechaUltimaOpinion;
    }

    public String getFrdFechaUltimaCartaresp() {
        return this.frdFechaUltimaCartaresp;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FJU_RDCL";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += " WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getSelect() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FJU_RDCL ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (!"".equals(conditions)) {
            conditions = conditions.substring(4).trim();
            sql += " WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }
        return result;
    }

    public DMLObject getUpdate() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "UPDATE FJU_RDCL SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        fields += " FRD_ID_FIDEICOMISO = ?, ";
        values.add(this.getFrdIdFideicomiso());
        fields += " FRD_TIPO = ?, ";
        values.add(this.getFrdTipo());
        fields += " FRD_FOLIO_RDCL = ?, ";
        values.add(this.getFrdFolioRdcl());
        fields += " FRD_REQUIERE_RDCL = ?, ";
        values.add(this.getFrdRequiereRdcl());
        fields += " FRD_SEGUIMIENTO_RDCL = ?, ";
        values.add(this.getFrdSeguimientoRdcl());
        fields += " FRD_RDC = ?, ";
        values.add(this.getFrdRdc());
        fields += " FRD_BASE = ?, ";
        values.add(this.getFrdBase());
        fields += " FRD_FOLIO_SOCADI = ?, ";
        values.add(this.getFrdFolioSocadi());
        fields += " FRD_FIDEICOMISO = ?, ";
        values.add(this.getFrdFideicomiso());
        fields += " FRD_RELEVANTES = ?, ";
        values.add(this.getFrdRelevantes());
        fields += " FRD_MES_FOL_SOCADI = ?, ";
        values.add(this.getFrdMesFolSocadi());
        fields += " FRD_ANO_FOL_SOCADI = ?, ";
        values.add(this.getFrdAnoFolSocadi());
        fields += " FRD_CLIENT_MANGR_QUE_RECIB = ?, ";
        values.add(this.getFrdClientMangrQueRecib());
        fields += " FRD_MEDIO_DE_NOTIF_DEL_CM = ?, ";
        values.add(this.getFrdMedioDeNotifDelCm());
        fields += " FRD_MOTIVO_DE_LA_RENDICION = ?, ";
        values.add(this.getFrdMotivoDeLaRendicion());
        fields += " FRD_FE_DE_ENTREGA_A_RDCL = ?, ";
        values.add(this.getFrdFeDeEntregaARdcl());
        fields += " FRD_TIPO_DE_FORMATO = ?, ";
        values.add(this.getFrdTipoDeFormato());
        fields += " FRD_DIVISION = ?, ";
        values.add(this.getFrdDivision());
        fields += " FRD_ESTATUS = ?, ";
        values.add(this.getFrdEstatus());
        fields += " FRD_OBSERVACIONES = ?, ";
        values.add(this.getFrdObservaciones());
        fields += " FRD_REGISTRADO_POR = ?, ";
        values.add(this.getFrdRegistradoPor());
        fields += " FRD_MAESTO = ?, ";
        values.add(this.getFrdMaesto());
        fields += " FRD_STATUS_FSO_MTO = ?, ";
        values.add(this.getFrdStatusFsoMto());
        fields += " FRD_COBRANZA = ?, ";
        values.add(this.getFrdCobranza());
        fields += " FRD_ORIGEN = ?, ";
        values.add(this.getFrdOrigen());
        fields += " FRD_RDCL_ADMON_DELEG_PTO = ?, ";
        values.add(this.getFrdRdclAdmonDelegPto());
        fields += " FRD_ADMINISTRADORES = ?, ";
        values.add(this.getFrdAdministradores());
        fields += " FRD_ENVIO_FIDUCIARIO = ?, ";
        values.add(this.getFrdEnvioFiduciario());
        fields += " FRD_NOTIF_DE_ORIGEN = ?, ";
        values.add(this.getFrdNotifDeOrigen());
        fields += " FRD_FEC_DE_REN = ?, ";
        values.add(this.getFrdFecDeRen());
        fields += " FRD_MES_REV = ?, ";
        values.add(this.getFrdMesRev());
        fields += " FRD_ANO_REV = ?, ";
        values.add(this.getFrdAnoRev());
        fields += " FRD_PER_DE_LA_REND = ?, ";
        values.add(this.getFrdPerDeLaRend());
        fields += " FRD_DET_DE_REND = ?, ";
        values.add(this.getFrdDetDeRend());
        fields += " FRD_APOD_QUE_FMA_REN = ?, ";
        values.add(this.getFrdApodQueFmaRen());
        fields += " FRD_POD_DE_LA_REN = ?, ";
        values.add(this.getFrdPodDeLaRen());
        fields += " FRD_COMENTARIOS = ?, ";
        values.add(this.getFrdComentarios());
        fields += " FRD_DOCU_ANEXA = ?, ";
        values.add(this.getFrdDocuAnexa());
        fields += " FRD_DOCU_FAL_POR_REQUERIR = ?, ";
        values.add(this.getFrdDocuFalPorRequerir());
        fields += " FRD_FEC_DE_REQ_A_FID_POR_INCTS = ?, ";
        values.add(this.getFrdFecDeReqAFidPorIncts());
        fields += " FRD_FEC_DE_COMU_A_CTE_ = ?, ";
        values.add(this.getFrdFecDeComuACte());
        fields += " FRD_FEC_RDC_COMP = ?, ";
        values.add(this.getFrdFecRdcComp());
        fields += " FRD_REND_DE_CTAS_OP = ?, ";
        values.add(this.getFrdRendDeCtasOp());
        fields += " FRD_REND_DE_CTAS_LEG = ?, ";
        values.add(this.getFrdRendDeCtasLeg());
        fields += " FRD_RMN_CARTA_INST_DTO = ?, ";
        values.add(this.getFrdRmnCartaInstDto());
        fields += " FRD_INMUEBLE = ?, ";
        values.add(this.getFrdInmueble());
        fields += " FRD_FE_CTA_INSTR = ?, ";
        values.add(this.getFrdFeCtaInstr());
        fields += " FRD_Q_INST_Y_FMA_CTA_INS = ?, ";
        values.add(this.getFrdQInstYFmaCtaIns());
        fields += " FRD_ESCRITURA = ?, ";
        values.add(this.getFrdEscritura());
        fields += " FRD_FECHA_DE_ESCRITURA = ?, ";
        values.add(this.getFrdFechaDeEscritura());
        fields += " FRD_NOTARIA_NO = ?, ";
        values.add(this.getFrdNotariaNo());
        fields += " FRD_NOTARIO = ?, ";
        values.add(this.getFrdNotario());
        fields += " FRD_ENTIDAD = ?, ";
        values.add(this.getFrdEntidad());
        fields += " FRD_TIPO_DE_PODER = ?, ";
        values.add(this.getFrdTipoDePoder());
        fields += " FRD_FACULTADES = ?, ";
        values.add(this.getFrdFacultades());
        fields += " FRD_VIGENCIA = ?, ";
        values.add(this.getFrdVigencia());
        fields += " FRD_APODERADOS = ?, ";
        values.add(this.getFrdApoderados());
        fields += " FRD_DOMICILIO = ?, ";
        values.add(this.getFrdDomicilio());
        fields += " FRD_IMAGEN_DEL_PODER = ?, ";
        values.add(this.getFrdImagenDelPoder());
        fields += " FRD_NOTAS_OBV = ?, ";
        values.add(this.getFrdNotasObv());
        fields += " FRD_JUI_EN_BASE_DE_JUICIOS = ?, ";
        values.add(this.getFrdJuiEnBaseDeJuicios());
        fields += " FRD_FIDE_CON_JUICIOS = ?, ";
        values.add(this.getFrdFideConJuicios());
        fields += " FRD_NOMBRE_ACTOR_DTE_QJO = ?, ";
        values.add(this.getFrdNombreActorDteQjo());
        fields += " FRD_DEMANDADO_TRO_INT = ?, ";
        values.add(this.getFrdDemandadoTroInt());
        fields += " FRD_EXPEDIENTE = ?, ";
        values.add(this.getFrdExpediente());
        fields += " FRD_JUZGADO = ?, ";
        values.add(this.getFrdJuzgado());
        fields += " FRD_TIPO_JUZGADO = ?, ";
        values.add(this.getFrdTipoJuzgado());
        fields += " FRD_TIPO_JUICIO = ?, ";
        values.add(this.getFrdTipoJuicio());
        fields += " FRD_LOCALIDAD = ?, ";
        values.add(this.getFrdLocalidad());
        fields += " FRD_ESTADO = ?, ";
        values.add(this.getFrdEstado());
        fields += " FRD_PREST_RECLAMADAS = ?, ";
        values.add(this.getFrdPrestReclamadas());
        fields += " FRD_EDO_PROC_JUICIO = ?, ";
        values.add(this.getFrdEdoProcJuicio());
        fields += " FRD_DEF_A_CARGO_DE = ?, ";
        values.add(this.getFrdDefACargoDe());
        fields += " FRD_CONST_PROC = ?, ";
        values.add(this.getFrdConstProc());
        fields += " FRD_CTDA_BASE_DE_JUICIOS = ?, ";
        values.add(this.getFrdCtdaBaseDeJuicios());
        fields += " FRD_FOLIO_JUICIOS = ?, ";
        values.add(this.getFrdFolioJuicios());
        fields += " FRD_FOLIO_WF = ?, ";
        values.add(this.getFrdFolioWf());
        fields += " FRD_FECHA_ULTIMA_RDC = ?, ";
        values.add(this.getFrdFechaUltimaRdc());
        fields += " FRD_ULTIMA_RDC_RECIB = ?, ";
        values.add(this.getFrdUltimaRdcRecib());
        fields += " FRD_ESTADUS_RDC = ?, ";
        values.add(this.getFrdEstadusRdc());
        fields += " FRD_COMENTARIOS_LEGALES = ?, ";
        values.add(this.getFrdComentariosLegales());
        fields += " FRD_EDO_FINANCIEROS_PEND = ?, ";
        values.add(this.getFrdEdoFinancierosPend());
        fields += " FRD_FECHA_ULTIMA_OPINION = ?, ";
        values.add(this.getFrdFechaUltimaOpinion());
        fields += " FRD_FECHA_ULTIMA_CARTARESP = ?, ";
        values.add(this.getFrdFechaUltimaCartaresp());
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
        String sql = "INSERT INTO FJU_RDCL ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FRD_ID_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getFrdIdFideicomiso());
        fields += ",FRD_TIPO ";
        fieldValues += ", ?";
        values.add(this.getFrdTipo());
        fields += ",FRD_FOLIO_RDCL ";
        fieldValues += ", ?";
        values.add(this.getFrdFolioRdcl());
        fields += ",FRD_REQUIERE_RDCL ";
        fieldValues += ", ?";
        values.add(this.getFrdRequiereRdcl());
        fields += ",FRD_SEGUIMIENTO_RDCL ";
        fieldValues += ", ?";
        values.add(this.getFrdSeguimientoRdcl());
        fields += ",FRD_RDC ";
        fieldValues += ", ?";
        values.add(this.getFrdRdc());
        fields += ",FRD_BASE ";
        fieldValues += ", ?";
        values.add(this.getFrdBase());
        fields += ",FRD_FOLIO_SOCADI ";
        fieldValues += ", ?";
        values.add(this.getFrdFolioSocadi());
        fields += ",FRD_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getFrdFideicomiso());
        fields += ",FRD_RELEVANTES ";
        fieldValues += ", ?";
        values.add(this.getFrdRelevantes());
        fields += ",FRD_MES_FOL_SOCADI ";
        fieldValues += ", ?";
        values.add(this.getFrdMesFolSocadi());
        fields += ",FRD_ANO_FOL_SOCADI ";
        fieldValues += ", ?";
        values.add(this.getFrdAnoFolSocadi());
        fields += ",FRD_CLIENT_MANGR_QUE_RECIB ";
        fieldValues += ", ?";
        values.add(this.getFrdClientMangrQueRecib());
        fields += ",FRD_MEDIO_DE_NOTIF_DEL_CM ";
        fieldValues += ", ?";
        values.add(this.getFrdMedioDeNotifDelCm());
        fields += ",FRD_MOTIVO_DE_LA_RENDICION ";
        fieldValues += ", ?";
        values.add(this.getFrdMotivoDeLaRendicion());
        fields += ",FRD_FE_DE_ENTREGA_A_RDCL ";
        fieldValues += ", ?";
        values.add(this.getFrdFeDeEntregaARdcl());
        fields += ",FRD_TIPO_DE_FORMATO ";
        fieldValues += ", ?";
        values.add(this.getFrdTipoDeFormato());
        fields += ",FRD_DIVISION ";
        fieldValues += ", ?";
        values.add(this.getFrdDivision());
        fields += ",FRD_ESTATUS ";
        fieldValues += ", ?";
        values.add(this.getFrdEstatus());
        fields += ",FRD_OBSERVACIONES ";
        fieldValues += ", ?";
        values.add(this.getFrdObservaciones());
        fields += ",FRD_REGISTRADO_POR ";
        fieldValues += ", ?";
        values.add(this.getFrdRegistradoPor());
        fields += ",FRD_MAESTO ";
        fieldValues += ", ?";
        values.add(this.getFrdMaesto());
        fields += ",FRD_STATUS_FSO_MTO ";
        fieldValues += ", ?";
        values.add(this.getFrdStatusFsoMto());
        fields += ",FRD_COBRANZA ";
        fieldValues += ", ?";
        values.add(this.getFrdCobranza());
        fields += ",FRD_ORIGEN ";
        fieldValues += ", ?";
        values.add(this.getFrdOrigen());
        fields += ",FRD_RDCL_ADMON_DELEG_PTO ";
        fieldValues += ", ?";
        values.add(this.getFrdRdclAdmonDelegPto());
        fields += ",FRD_ADMINISTRADORES ";
        fieldValues += ", ?";
        values.add(this.getFrdAdministradores());
        fields += ",FRD_ENVIO_FIDUCIARIO ";
        fieldValues += ", ?";
        values.add(this.getFrdEnvioFiduciario());
        fields += ",FRD_NOTIF_DE_ORIGEN ";
        fieldValues += ", ?";
        values.add(this.getFrdNotifDeOrigen());
        fields += ",FRD_FEC_DE_REN ";
        fieldValues += ", ?";
        values.add(this.getFrdFecDeRen());
        fields += ",FRD_MES_REV ";
        fieldValues += ", ?";
        values.add(this.getFrdMesRev());
        fields += ",FRD_ANO_REV ";
        fieldValues += ", ?";
        values.add(this.getFrdAnoRev());
        fields += ",FRD_PER_DE_LA_REND ";
        fieldValues += ", ?";
        values.add(this.getFrdPerDeLaRend());
        fields += ",FRD_DET_DE_REND ";
        fieldValues += ", ?";
        values.add(this.getFrdDetDeRend());
        fields += ",FRD_APOD_QUE_FMA_REN ";
        fieldValues += ", ?";
        values.add(this.getFrdApodQueFmaRen());
        fields += ",FRD_POD_DE_LA_REN ";
        fieldValues += ", ?";
        values.add(this.getFrdPodDeLaRen());
        fields += ",FRD_COMENTARIOS ";
        fieldValues += ", ?";
        values.add(this.getFrdComentarios());
        fields += ",FRD_DOCU_ANEXA ";
        fieldValues += ", ?";
        values.add(this.getFrdDocuAnexa());
        fields += ",FRD_DOCU_FAL_POR_REQUERIR ";
        fieldValues += ", ?";
        values.add(this.getFrdDocuFalPorRequerir());
        fields += ",FRD_FEC_DE_REQ_A_FID_POR_INCTS ";
        fieldValues += ", ?";
        values.add(this.getFrdFecDeReqAFidPorIncts());
        fields += ",FRD_FEC_DE_COMU_A_CTE_ ";
        fieldValues += ", ?";
        values.add(this.getFrdFecDeComuACte());
        fields += ",FRD_FEC_RDC_COMP ";
        fieldValues += ", ?";
        values.add(this.getFrdFecRdcComp());
        fields += ",FRD_REND_DE_CTAS_OP ";
        fieldValues += ", ?";
        values.add(this.getFrdRendDeCtasOp());
        fields += ",FRD_REND_DE_CTAS_LEG ";
        fieldValues += ", ?";
        values.add(this.getFrdRendDeCtasLeg());
        fields += ",FRD_RMN_CARTA_INST_DTO ";
        fieldValues += ", ?";
        values.add(this.getFrdRmnCartaInstDto());
        fields += ",FRD_INMUEBLE ";
        fieldValues += ", ?";
        values.add(this.getFrdInmueble());
        fields += ",FRD_FE_CTA_INSTR ";
        fieldValues += ", ?";
        values.add(this.getFrdFeCtaInstr());
        fields += ",FRD_Q_INST_Y_FMA_CTA_INS ";
        fieldValues += ", ?";
        values.add(this.getFrdQInstYFmaCtaIns());
        fields += ",FRD_ESCRITURA ";
        fieldValues += ", ?";
        values.add(this.getFrdEscritura());
        fields += ",FRD_FECHA_DE_ESCRITURA ";
        fieldValues += ", ?";
        values.add(this.getFrdFechaDeEscritura());
        fields += ",FRD_NOTARIA_NO ";
        fieldValues += ", ?";
        values.add(this.getFrdNotariaNo());
        fields += ",FRD_NOTARIO ";
        fieldValues += ", ?";
        values.add(this.getFrdNotario());
        fields += ",FRD_ENTIDAD ";
        fieldValues += ", ?";
        values.add(this.getFrdEntidad());
        fields += ",FRD_TIPO_DE_PODER ";
        fieldValues += ", ?";
        values.add(this.getFrdTipoDePoder());
        fields += ",FRD_FACULTADES ";
        fieldValues += ", ?";
        values.add(this.getFrdFacultades());
        fields += ",FRD_VIGENCIA ";
        fieldValues += ", ?";
        values.add(this.getFrdVigencia());
        fields += ",FRD_APODERADOS ";
        fieldValues += ", ?";
        values.add(this.getFrdApoderados());
        fields += ",FRD_DOMICILIO ";
        fieldValues += ", ?";
        values.add(this.getFrdDomicilio());
        fields += ",FRD_IMAGEN_DEL_PODER ";
        fieldValues += ", ?";
        values.add(this.getFrdImagenDelPoder());
        fields += ",FRD_NOTAS_OBV ";
        fieldValues += ", ?";
        values.add(this.getFrdNotasObv());
        fields += ",FRD_JUI_EN_BASE_DE_JUICIOS ";
        fieldValues += ", ?";
        values.add(this.getFrdJuiEnBaseDeJuicios());
        fields += ",FRD_FIDE_CON_JUICIOS ";
        fieldValues += ", ?";
        values.add(this.getFrdFideConJuicios());
        fields += ",FRD_NOMBRE_ACTOR_DTE_QJO ";
        fieldValues += ", ?";
        values.add(this.getFrdNombreActorDteQjo());
        fields += ",FRD_DEMANDADO_TRO_INT ";
        fieldValues += ", ?";
        values.add(this.getFrdDemandadoTroInt());
        fields += ",FRD_EXPEDIENTE ";
        fieldValues += ", ?";
        values.add(this.getFrdExpediente());
        fields += ",FRD_JUZGADO ";
        fieldValues += ", ?";
        values.add(this.getFrdJuzgado());
        fields += ",FRD_TIPO_JUZGADO ";
        fieldValues += ", ?";
        values.add(this.getFrdTipoJuzgado());
        fields += ",FRD_TIPO_JUICIO ";
        fieldValues += ", ?";
        values.add(this.getFrdTipoJuicio());
        fields += ",FRD_LOCALIDAD ";
        fieldValues += ", ?";
        values.add(this.getFrdLocalidad());
        fields += ",FRD_ESTADO ";
        fieldValues += ", ?";
        values.add(this.getFrdEstado());
        fields += ",FRD_PREST_RECLAMADAS ";
        fieldValues += ", ?";
        values.add(this.getFrdPrestReclamadas());
        fields += ",FRD_EDO_PROC_JUICIO ";
        fieldValues += ", ?";
        values.add(this.getFrdEdoProcJuicio());
        fields += ",FRD_DEF_A_CARGO_DE ";
        fieldValues += ", ?";
        values.add(this.getFrdDefACargoDe());
        fields += ",FRD_CONST_PROC ";
        fieldValues += ", ?";
        values.add(this.getFrdConstProc());
        fields += ",FRD_CTDA_BASE_DE_JUICIOS ";
        fieldValues += ", ?";
        values.add(this.getFrdCtdaBaseDeJuicios());
        fields += ",FRD_FOLIO_JUICIOS ";
        fieldValues += ", ?";
        values.add(this.getFrdFolioJuicios());
        fields += ",FRD_FOLIO_WF ";
        fieldValues += ", ?";
        values.add(this.getFrdFolioWf());
        fields += ",FRD_FECHA_ULTIMA_RDC ";
        fieldValues += ", ?";
        values.add(this.getFrdFechaUltimaRdc());
        fields += ",FRD_ULTIMA_RDC_RECIB ";
        fieldValues += ", ?";
        values.add(this.getFrdUltimaRdcRecib());
        fields += ",FRD_ESTADUS_RDC ";
        fieldValues += ", ?";
        values.add(this.getFrdEstadusRdc());
        fields += ",FRD_COMENTARIOS_LEGALES ";
        fieldValues += ", ?";
        values.add(this.getFrdComentariosLegales());
        fields += ",FRD_EDO_FINANCIEROS_PEND ";
        fieldValues += ", ?";
        values.add(this.getFrdEdoFinancierosPend());
        fields += ",FRD_FECHA_ULTIMA_OPINION ";
        fieldValues += ", ?";
        values.add(this.getFrdFechaUltimaOpinion());
        fields += ",FRD_FECHA_ULTIMA_CARTARESP ";
        fieldValues += ", ?";
        values.add(this.getFrdFechaUltimaCartaresp());
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
        String sql = "DELETE FROM FJU_RDCL WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FjuRdcl instance = (FjuRdcl) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFrdIdFideicomiso().equals(instance.getFrdIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFrdTipo().equals(instance.getFrdTipo()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFolioRdcl().equals(instance.getFrdFolioRdcl()))
            equalObjects = false;
        if (equalObjects && !this.getFrdRequiereRdcl().equals(instance.getFrdRequiereRdcl()))
            equalObjects = false;
        if (equalObjects && !this.getFrdSeguimientoRdcl().equals(instance.getFrdSeguimientoRdcl()))
            equalObjects = false;
        if (equalObjects && !this.getFrdRdc().equals(instance.getFrdRdc()))
            equalObjects = false;
        if (equalObjects && !this.getFrdBase().equals(instance.getFrdBase()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFolioSocadi().equals(instance.getFrdFolioSocadi()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFideicomiso().equals(instance.getFrdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFrdRelevantes().equals(instance.getFrdRelevantes()))
            equalObjects = false;
        if (equalObjects && !this.getFrdMesFolSocadi().equals(instance.getFrdMesFolSocadi()))
            equalObjects = false;
        if (equalObjects && !this.getFrdAnoFolSocadi().equals(instance.getFrdAnoFolSocadi()))
            equalObjects = false;
        if (equalObjects && !this.getFrdClientMangrQueRecib().equals(instance.getFrdClientMangrQueRecib()))
            equalObjects = false;
        if (equalObjects && !this.getFrdMedioDeNotifDelCm().equals(instance.getFrdMedioDeNotifDelCm()))
            equalObjects = false;
        if (equalObjects && !this.getFrdMotivoDeLaRendicion().equals(instance.getFrdMotivoDeLaRendicion()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFeDeEntregaARdcl().equals(instance.getFrdFeDeEntregaARdcl()))
            equalObjects = false;
        if (equalObjects && !this.getFrdTipoDeFormato().equals(instance.getFrdTipoDeFormato()))
            equalObjects = false;
        if (equalObjects && !this.getFrdDivision().equals(instance.getFrdDivision()))
            equalObjects = false;
        if (equalObjects && !this.getFrdEstatus().equals(instance.getFrdEstatus()))
            equalObjects = false;
        if (equalObjects && !this.getFrdObservaciones().equals(instance.getFrdObservaciones()))
            equalObjects = false;
        if (equalObjects && !this.getFrdRegistradoPor().equals(instance.getFrdRegistradoPor()))
            equalObjects = false;
        if (equalObjects && !this.getFrdMaesto().equals(instance.getFrdMaesto()))
            equalObjects = false;
        if (equalObjects && !this.getFrdStatusFsoMto().equals(instance.getFrdStatusFsoMto()))
            equalObjects = false;
        if (equalObjects && !this.getFrdCobranza().equals(instance.getFrdCobranza()))
            equalObjects = false;
        if (equalObjects && !this.getFrdOrigen().equals(instance.getFrdOrigen()))
            equalObjects = false;
        if (equalObjects && !this.getFrdRdclAdmonDelegPto().equals(instance.getFrdRdclAdmonDelegPto()))
            equalObjects = false;
        if (equalObjects && !this.getFrdAdministradores().equals(instance.getFrdAdministradores()))
            equalObjects = false;
        if (equalObjects && !this.getFrdEnvioFiduciario().equals(instance.getFrdEnvioFiduciario()))
            equalObjects = false;
        if (equalObjects && !this.getFrdNotifDeOrigen().equals(instance.getFrdNotifDeOrigen()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFecDeRen().equals(instance.getFrdFecDeRen()))
            equalObjects = false;
        if (equalObjects && !this.getFrdMesRev().equals(instance.getFrdMesRev()))
            equalObjects = false;
        if (equalObjects && !this.getFrdAnoRev().equals(instance.getFrdAnoRev()))
            equalObjects = false;
        if (equalObjects && !this.getFrdPerDeLaRend().equals(instance.getFrdPerDeLaRend()))
            equalObjects = false;
        if (equalObjects && !this.getFrdDetDeRend().equals(instance.getFrdDetDeRend()))
            equalObjects = false;
        if (equalObjects && !this.getFrdApodQueFmaRen().equals(instance.getFrdApodQueFmaRen()))
            equalObjects = false;
        if (equalObjects && !this.getFrdPodDeLaRen().equals(instance.getFrdPodDeLaRen()))
            equalObjects = false;
        if (equalObjects && !this.getFrdComentarios().equals(instance.getFrdComentarios()))
            equalObjects = false;
        if (equalObjects && !this.getFrdDocuAnexa().equals(instance.getFrdDocuAnexa()))
            equalObjects = false;
        if (equalObjects && !this.getFrdDocuFalPorRequerir().equals(instance.getFrdDocuFalPorRequerir()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFecDeReqAFidPorIncts().equals(instance.getFrdFecDeReqAFidPorIncts()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFecDeComuACte().equals(instance.getFrdFecDeComuACte()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFecRdcComp().equals(instance.getFrdFecRdcComp()))
            equalObjects = false;
        if (equalObjects && !this.getFrdRendDeCtasOp().equals(instance.getFrdRendDeCtasOp()))
            equalObjects = false;
        if (equalObjects && !this.getFrdRendDeCtasLeg().equals(instance.getFrdRendDeCtasLeg()))
            equalObjects = false;
        if (equalObjects && !this.getFrdRmnCartaInstDto().equals(instance.getFrdRmnCartaInstDto()))
            equalObjects = false;
        if (equalObjects && !this.getFrdInmueble().equals(instance.getFrdInmueble()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFeCtaInstr().equals(instance.getFrdFeCtaInstr()))
            equalObjects = false;
        if (equalObjects && !this.getFrdQInstYFmaCtaIns().equals(instance.getFrdQInstYFmaCtaIns()))
            equalObjects = false;
        if (equalObjects && !this.getFrdEscritura().equals(instance.getFrdEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFechaDeEscritura().equals(instance.getFrdFechaDeEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getFrdNotariaNo().equals(instance.getFrdNotariaNo()))
            equalObjects = false;
        if (equalObjects && !this.getFrdNotario().equals(instance.getFrdNotario()))
            equalObjects = false;
        if (equalObjects && !this.getFrdEntidad().equals(instance.getFrdEntidad()))
            equalObjects = false;
        if (equalObjects && !this.getFrdTipoDePoder().equals(instance.getFrdTipoDePoder()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFacultades().equals(instance.getFrdFacultades()))
            equalObjects = false;
        if (equalObjects && !this.getFrdVigencia().equals(instance.getFrdVigencia()))
            equalObjects = false;
        if (equalObjects && !this.getFrdApoderados().equals(instance.getFrdApoderados()))
            equalObjects = false;
        if (equalObjects && !this.getFrdDomicilio().equals(instance.getFrdDomicilio()))
            equalObjects = false;
        if (equalObjects && !this.getFrdImagenDelPoder().equals(instance.getFrdImagenDelPoder()))
            equalObjects = false;
        if (equalObjects && !this.getFrdNotasObv().equals(instance.getFrdNotasObv()))
            equalObjects = false;
        if (equalObjects && !this.getFrdJuiEnBaseDeJuicios().equals(instance.getFrdJuiEnBaseDeJuicios()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFideConJuicios().equals(instance.getFrdFideConJuicios()))
            equalObjects = false;
        if (equalObjects && !this.getFrdNombreActorDteQjo().equals(instance.getFrdNombreActorDteQjo()))
            equalObjects = false;
        if (equalObjects && !this.getFrdDemandadoTroInt().equals(instance.getFrdDemandadoTroInt()))
            equalObjects = false;
        if (equalObjects && !this.getFrdExpediente().equals(instance.getFrdExpediente()))
            equalObjects = false;
        if (equalObjects && !this.getFrdJuzgado().equals(instance.getFrdJuzgado()))
            equalObjects = false;
        if (equalObjects && !this.getFrdTipoJuzgado().equals(instance.getFrdTipoJuzgado()))
            equalObjects = false;
        if (equalObjects && !this.getFrdTipoJuicio().equals(instance.getFrdTipoJuicio()))
            equalObjects = false;
        if (equalObjects && !this.getFrdLocalidad().equals(instance.getFrdLocalidad()))
            equalObjects = false;
        if (equalObjects && !this.getFrdEstado().equals(instance.getFrdEstado()))
            equalObjects = false;
        if (equalObjects && !this.getFrdPrestReclamadas().equals(instance.getFrdPrestReclamadas()))
            equalObjects = false;
        if (equalObjects && !this.getFrdEdoProcJuicio().equals(instance.getFrdEdoProcJuicio()))
            equalObjects = false;
        if (equalObjects && !this.getFrdDefACargoDe().equals(instance.getFrdDefACargoDe()))
            equalObjects = false;
        if (equalObjects && !this.getFrdConstProc().equals(instance.getFrdConstProc()))
            equalObjects = false;
        if (equalObjects && !this.getFrdCtdaBaseDeJuicios().equals(instance.getFrdCtdaBaseDeJuicios()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFolioJuicios().equals(instance.getFrdFolioJuicios()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFolioWf().equals(instance.getFrdFolioWf()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFechaUltimaRdc().equals(instance.getFrdFechaUltimaRdc()))
            equalObjects = false;
        if (equalObjects && !this.getFrdUltimaRdcRecib().equals(instance.getFrdUltimaRdcRecib()))
            equalObjects = false;
        if (equalObjects && !this.getFrdEstadusRdc().equals(instance.getFrdEstadusRdc()))
            equalObjects = false;
        if (equalObjects && !this.getFrdComentariosLegales().equals(instance.getFrdComentariosLegales()))
            equalObjects = false;
        if (equalObjects && !this.getFrdEdoFinancierosPend().equals(instance.getFrdEdoFinancierosPend()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFechaUltimaOpinion().equals(instance.getFrdFechaUltimaOpinion()))
            equalObjects = false;
        if (equalObjects && !this.getFrdFechaUltimaCartaresp().equals(instance.getFrdFechaUltimaCartaresp()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FjuRdcl result = new FjuRdcl();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFrdIdFideicomiso((String) objectData.getData("FRD_ID_FIDEICOMISO"));
        result.setFrdTipo((String) objectData.getData("FRD_TIPO"));
        result.setFrdFolioRdcl((String) objectData.getData("FRD_FOLIO_RDCL"));
        result.setFrdRequiereRdcl((String) objectData.getData("FRD_REQUIERE_RDCL"));
        result.setFrdSeguimientoRdcl((String) objectData.getData("FRD_SEGUIMIENTO_RDCL"));
        result.setFrdRdc((String) objectData.getData("FRD_RDC"));
        result.setFrdBase((String) objectData.getData("FRD_BASE"));
        result.setFrdFolioSocadi((String) objectData.getData("FRD_FOLIO_SOCADI"));
        result.setFrdFideicomiso((String) objectData.getData("FRD_FIDEICOMISO"));
        result.setFrdRelevantes((String) objectData.getData("FRD_RELEVANTES"));
        result.setFrdMesFolSocadi((String) objectData.getData("FRD_MES_FOL_SOCADI"));
        result.setFrdAnoFolSocadi((String) objectData.getData("FRD_ANO_FOL_SOCADI"));
        result.setFrdClientMangrQueRecib((String) objectData.getData("FRD_CLIENT_MANGR_QUE_RECIB"));
        result.setFrdMedioDeNotifDelCm((String) objectData.getData("FRD_MEDIO_DE_NOTIF_DEL_CM"));
        result.setFrdMotivoDeLaRendicion((String) objectData.getData("FRD_MOTIVO_DE_LA_RENDICION"));
        result.setFrdFeDeEntregaARdcl((String) objectData.getData("FRD_FE_DE_ENTREGA_A_RDCL"));
        result.setFrdTipoDeFormato((String) objectData.getData("FRD_TIPO_DE_FORMATO"));
        result.setFrdDivision((String) objectData.getData("FRD_DIVISION"));
        result.setFrdEstatus((String) objectData.getData("FRD_ESTATUS"));
        result.setFrdObservaciones((String) objectData.getData("FRD_OBSERVACIONES"));
        result.setFrdRegistradoPor((String) objectData.getData("FRD_REGISTRADO_POR"));
        result.setFrdMaesto((String) objectData.getData("FRD_MAESTO"));
        result.setFrdStatusFsoMto((String) objectData.getData("FRD_STATUS_FSO_MTO"));
        result.setFrdCobranza((String) objectData.getData("FRD_COBRANZA"));
        result.setFrdOrigen((String) objectData.getData("FRD_ORIGEN"));
        result.setFrdRdclAdmonDelegPto((String) objectData.getData("FRD_RDCL_ADMON_DELEG_PTO"));
        result.setFrdAdministradores((String) objectData.getData("FRD_ADMINISTRADORES"));
        result.setFrdEnvioFiduciario((String) objectData.getData("FRD_ENVIO_FIDUCIARIO"));
        result.setFrdNotifDeOrigen((String) objectData.getData("FRD_NOTIF_DE_ORIGEN"));
        result.setFrdFecDeRen((String) objectData.getData("FRD_FEC_DE_REN"));
        result.setFrdMesRev((String) objectData.getData("FRD_MES_REV"));
        result.setFrdAnoRev((String) objectData.getData("FRD_ANO_REV"));
        result.setFrdPerDeLaRend((String) objectData.getData("FRD_PER_DE_LA_REND"));
        result.setFrdDetDeRend((String) objectData.getData("FRD_DET_DE_REND"));
        result.setFrdApodQueFmaRen((String) objectData.getData("FRD_APOD_QUE_FMA_REN"));
        result.setFrdPodDeLaRen((String) objectData.getData("FRD_POD_DE_LA_REN"));
        result.setFrdComentarios((String) objectData.getData("FRD_COMENTARIOS"));
        result.setFrdDocuAnexa((String) objectData.getData("FRD_DOCU_ANEXA"));
        result.setFrdDocuFalPorRequerir((String) objectData.getData("FRD_DOCU_FAL_POR_REQUERIR"));
        result.setFrdFecDeReqAFidPorIncts((String) objectData.getData("FRD_FEC_DE_REQ_A_FID_POR_INCTS"));
        result.setFrdFecDeComuACte((String) objectData.getData("FRD_FEC_DE_COMU_A_CTE_"));
        result.setFrdFecRdcComp((String) objectData.getData("FRD_FEC_RDC_COMP"));
        result.setFrdRendDeCtasOp((String) objectData.getData("FRD_REND_DE_CTAS_OP"));
        result.setFrdRendDeCtasLeg((String) objectData.getData("FRD_REND_DE_CTAS_LEG"));
        result.setFrdRmnCartaInstDto((String) objectData.getData("FRD_RMN_CARTA_INST_DTO"));
        result.setFrdInmueble((String) objectData.getData("FRD_INMUEBLE"));
        result.setFrdFeCtaInstr((String) objectData.getData("FRD_FE_CTA_INSTR"));
        result.setFrdQInstYFmaCtaIns((String) objectData.getData("FRD_Q_INST_Y_FMA_CTA_INS"));
        result.setFrdEscritura((String) objectData.getData("FRD_ESCRITURA"));
        result.setFrdFechaDeEscritura((String) objectData.getData("FRD_FECHA_DE_ESCRITURA"));
        result.setFrdNotariaNo((String) objectData.getData("FRD_NOTARIA_NO"));
        result.setFrdNotario((String) objectData.getData("FRD_NOTARIO"));
        result.setFrdEntidad((String) objectData.getData("FRD_ENTIDAD"));
        result.setFrdTipoDePoder((String) objectData.getData("FRD_TIPO_DE_PODER"));
        result.setFrdFacultades((String) objectData.getData("FRD_FACULTADES"));
        result.setFrdVigencia((String) objectData.getData("FRD_VIGENCIA"));
        result.setFrdApoderados((String) objectData.getData("FRD_APODERADOS"));
        result.setFrdDomicilio((String) objectData.getData("FRD_DOMICILIO"));
        result.setFrdImagenDelPoder((String) objectData.getData("FRD_IMAGEN_DEL_PODER"));
        result.setFrdNotasObv((String) objectData.getData("FRD_NOTAS_OBV"));
        result.setFrdJuiEnBaseDeJuicios((String) objectData.getData("FRD_JUI_EN_BASE_DE_JUICIOS"));
        result.setFrdFideConJuicios((String) objectData.getData("FRD_FIDE_CON_JUICIOS"));
        result.setFrdNombreActorDteQjo((String) objectData.getData("FRD_NOMBRE_ACTOR_DTE_QJO"));
        result.setFrdDemandadoTroInt((String) objectData.getData("FRD_DEMANDADO_TRO_INT"));
        result.setFrdExpediente((String) objectData.getData("FRD_EXPEDIENTE"));
        result.setFrdJuzgado((String) objectData.getData("FRD_JUZGADO"));
        result.setFrdTipoJuzgado((String) objectData.getData("FRD_TIPO_JUZGADO"));
        result.setFrdTipoJuicio((String) objectData.getData("FRD_TIPO_JUICIO"));
        result.setFrdLocalidad((String) objectData.getData("FRD_LOCALIDAD"));
        result.setFrdEstado((String) objectData.getData("FRD_ESTADO"));
        result.setFrdPrestReclamadas((String) objectData.getData("FRD_PREST_RECLAMADAS"));
        result.setFrdEdoProcJuicio((String) objectData.getData("FRD_EDO_PROC_JUICIO"));
        result.setFrdDefACargoDe((String) objectData.getData("FRD_DEF_A_CARGO_DE"));
        result.setFrdConstProc((String) objectData.getData("FRD_CONST_PROC"));
        result.setFrdCtdaBaseDeJuicios((String) objectData.getData("FRD_CTDA_BASE_DE_JUICIOS"));
        result.setFrdFolioJuicios((String) objectData.getData("FRD_FOLIO_JUICIOS"));
        result.setFrdFolioWf((BigDecimal) objectData.getData("FRD_FOLIO_WF"));
        result.setFrdFechaUltimaRdc((String) objectData.getData("FRD_FECHA_ULTIMA_RDC"));
        result.setFrdUltimaRdcRecib((String) objectData.getData("FRD_ULTIMA_RDC_RECIB"));
        result.setFrdEstadusRdc((String) objectData.getData("FRD_ESTADUS_RDC"));
        result.setFrdComentariosLegales((String) objectData.getData("FRD_COMENTARIOS_LEGALES"));
        result.setFrdEdoFinancierosPend((String) objectData.getData("FRD_EDO_FINANCIEROS_PEND"));
        result.setFrdFechaUltimaOpinion((String) objectData.getData("FRD_FECHA_ULTIMA_OPINION"));
        result.setFrdFechaUltimaCartaresp((String) objectData.getData("FRD_FECHA_ULTIMA_CARTARESP"));
        return result;
    }
}
