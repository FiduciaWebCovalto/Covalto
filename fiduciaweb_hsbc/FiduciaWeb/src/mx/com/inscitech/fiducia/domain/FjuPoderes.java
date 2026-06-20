package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;


public class FjuPoderes extends DomainObject {
    String fpoIdFideicomiso = null;
    String fpoBase = null;
    String fpoEnSist = null;
    String fpoImagen = null;
    String fpoFsoCobranza = null;
    BigDecimal fpoIdFidei = null;
    String fpoFideiNombre = null;
    String fpoFideiVige = null;
    String fpoEsaPoderdante = null;
    String fpoReprs = null;
    String fpoNombre = null;
    String fpoApellidos = null;
    String fpoDomicilio = null;
    String fpoEscritura = null;
    String fpoFechaEscritura = null;
    String fpoTipo = null;
    String fpoCartaDeAcept = null;
    String fpoFechaCarta = null;
    String fpoFolioSocUltiRdcl = null;
    String fpoFeUltiRdcl = null;
    String fpoDescRdcl = null;
    String fpoVigPoder = null;
    String fpoFinPoder = null;
    String fpoEstatPoder = null;
    String fpoEstaRevocado = null;
    String fpoAlertaVenc = null;
    String fpoEscrituraRevoca = null;
    String fpoHistRevoca = null;
    String fpoNoDeNot = null;
    String fpoNotario = null;
    String fpoLocalidadNot = null;
    String fpoEstadoNot = null;
    String fpoPlaza = null;
    String fpoFacultad = null;
    String fpoAsuntoLim = null;
    String fpoTipoPoder = null;
    String fpoRendicionCts = null;
    String fpoFolioSolPoder = null;
    String fpoFolioOAgenda = null;
    String fpoNuConsecTest = null;
    String fpoNoTest = null;
    String fpoContacto = null;
    String fpoComentarios = null;
    BigDecimal fpoFolioWf = null;
    String fpoApoderado = null;
    String fpoPeriodicidad = null;

    public FjuPoderes() {
        super();
        this.pkColumns = 8;
    }

    public void setFpoIdFideicomiso(String fpoIdFideicomiso) {
        this.fpoIdFideicomiso = fpoIdFideicomiso;
    }

    public void setFpoBase(String fpoBase) {
        this.fpoBase = fpoBase;
    }

    public void setFpoEnSist(String fpoEnSist) {
        this.fpoEnSist = fpoEnSist;
    }

    public void setFpoImagen(String fpoImagen) {
        this.fpoImagen = fpoImagen;
    }

    public void setFpoFsoCobranza(String fpoFsoCobranza) {
        this.fpoFsoCobranza = fpoFsoCobranza;
    }

    public void setFpoIdFidei(BigDecimal fpoIdFidei) {
        this.fpoIdFidei = fpoIdFidei;
    }

    public void setFpoFideiNombre(String fpoFideiNombre) {
        this.fpoFideiNombre = fpoFideiNombre;
    }

    public void setFpoFideiVige(String fpoFideiVige) {
        this.fpoFideiVige = fpoFideiVige;
    }

    public void setFpoEsaPoderdante(String fpoEsaPoderdante) {
        this.fpoEsaPoderdante = fpoEsaPoderdante;
    }

    public void setFpoReprs(String fpoReprs) {
        this.fpoReprs = fpoReprs;
    }

    public void setFpoNombre(String fpoNombre) {
        this.fpoNombre = fpoNombre;
    }

    public void setFpoApellidos(String fpoApellidos) {
        this.fpoApellidos = fpoApellidos;
    }

    public void setFpoDomicilio(String fpoDomicilio) {
        this.fpoDomicilio = fpoDomicilio;
    }

    public void setFpoEscritura(String fpoEscritura) {
        this.fpoEscritura = fpoEscritura;
    }

    public void setFpoFechaEscritura(String fpoFechaEscritura) {
        this.fpoFechaEscritura = fpoFechaEscritura;
    }

    public void setFpoTipo(String fpoTipo) {
        this.fpoTipo = fpoTipo;
    }

    public void setFpoCartaDeAcept(String fpoCartaDeAcept) {
        this.fpoCartaDeAcept = fpoCartaDeAcept;
    }

    public void setFpoFechaCarta(String fpoFechaCarta) {
        this.fpoFechaCarta = fpoFechaCarta;
    }

    public void setFpoFolioSocUltiRdcl(String fpoFolioSocUltiRdcl) {
        this.fpoFolioSocUltiRdcl = fpoFolioSocUltiRdcl;
    }

    public void setFpoFeUltiRdcl(String fpoFeUltiRdcl) {
        this.fpoFeUltiRdcl = fpoFeUltiRdcl;
    }

    public void setFpoDescRdcl(String fpoDescRdcl) {
        this.fpoDescRdcl = fpoDescRdcl;
    }

    public void setFpoVigPoder(String fpoVigPoder) {
        this.fpoVigPoder = fpoVigPoder;
    }

    public void setFpoFinPoder(String fpoFinPoder) {
        this.fpoFinPoder = fpoFinPoder;
    }

    public void setFpoEstatPoder(String fpoEstatPoder) {
        this.fpoEstatPoder = fpoEstatPoder;
    }

    public void setFpoEstaRevocado(String fpoEstaRevocado) {
        this.fpoEstaRevocado = fpoEstaRevocado;
    }

    public void setFpoAlertaVenc(String fpoAlertaVenc) {
        this.fpoAlertaVenc = fpoAlertaVenc;
    }

    public void setFpoEscrituraRevoca(String fpoEscrituraRevoca) {
        this.fpoEscrituraRevoca = fpoEscrituraRevoca;
    }

    public void setFpoHistRevoca(String fpoHistRevoca) {
        this.fpoHistRevoca = fpoHistRevoca;
    }

    public void setFpoNoDeNot(String fpoNoDeNot) {
        this.fpoNoDeNot = fpoNoDeNot;
    }

    public void setFpoNotario(String fpoNotario) {
        this.fpoNotario = fpoNotario;
    }

    public void setFpoLocalidadNot(String fpoLocalidadNot) {
        this.fpoLocalidadNot = fpoLocalidadNot;
    }

    public void setFpoEstadoNot(String fpoEstadoNot) {
        this.fpoEstadoNot = fpoEstadoNot;
    }

    public void setFpoPlaza(String fpoPlaza) {
        this.fpoPlaza = fpoPlaza;
    }

    public void setFpoFacultad(String fpoFacultad) {
        this.fpoFacultad = fpoFacultad;
    }

    public void setFpoAsuntoLim(String fpoAsuntoLim) {
        this.fpoAsuntoLim = fpoAsuntoLim;
    }

    public void setFpoTipoPoder(String fpoTipoPoder) {
        this.fpoTipoPoder = fpoTipoPoder;
    }

    public void setFpoRendicionCts(String fpoRendicionCts) {
        this.fpoRendicionCts = fpoRendicionCts;
    }

    public void setFpoFolioSolPoder(String fpoFolioSolPoder) {
        this.fpoFolioSolPoder = fpoFolioSolPoder;
    }

    public void setFpoFolioOAgenda(String fpoFolioOAgenda) {
        this.fpoFolioOAgenda = fpoFolioOAgenda;
    }

    public void setFpoNuConsecTest(String fpoNuConsecTest) {
        this.fpoNuConsecTest = fpoNuConsecTest;
    }

    public void setFpoNoTest(String fpoNoTest) {
        this.fpoNoTest = fpoNoTest;
    }

    public void setFpoContacto(String fpoContacto) {
        this.fpoContacto = fpoContacto;
    }

    public void setFpoComentarios(String fpoComentarios) {
        this.fpoComentarios = fpoComentarios;
    }

    public void setFpoFolioWf(BigDecimal fpoFolioWf) {
        this.fpoFolioWf = fpoFolioWf;
    }

    public void setFpoApoderado(String fpoApoderado) {
        this.fpoApoderado = fpoApoderado;
    }

    public void setFpoPeriodicidad(String fpoPeriodicidad) {
        this.fpoPeriodicidad = fpoPeriodicidad;
    }

    public String getFpoIdFideicomiso() {
        return this.fpoIdFideicomiso;
    }

    public String getFpoBase() {
        return this.fpoBase;
    }

    public String getFpoEnSist() {
        return this.fpoEnSist;
    }

    public String getFpoImagen() {
        return this.fpoImagen;
    }

    public String getFpoFsoCobranza() {
        return this.fpoFsoCobranza;
    }

    public BigDecimal getFpoIdFidei() {
        return this.fpoIdFidei;
    }

    public String getFpoFideiNombre() {
        return this.fpoFideiNombre;
    }

    public String getFpoFideiVige() {
        return this.fpoFideiVige;
    }

    public String getFpoEsaPoderdante() {
        return this.fpoEsaPoderdante;
    }

    public String getFpoReprs() {
        return this.fpoReprs;
    }

    public String getFpoNombre() {
        return this.fpoNombre;
    }

    public String getFpoApellidos() {
        return this.fpoApellidos;
    }

    public String getFpoDomicilio() {
        return this.fpoDomicilio;
    }

    public String getFpoEscritura() {
        return this.fpoEscritura;
    }

    public String getFpoFechaEscritura() {
        return this.fpoFechaEscritura;
    }

    public String getFpoTipo() {
        return this.fpoTipo;
    }

    public String getFpoCartaDeAcept() {
        return this.fpoCartaDeAcept;
    }

    public String getFpoFechaCarta() {
        return this.fpoFechaCarta;
    }

    public String getFpoFolioSocUltiRdcl() {
        return this.fpoFolioSocUltiRdcl;
    }

    public String getFpoFeUltiRdcl() {
        return this.fpoFeUltiRdcl;
    }

    public String getFpoDescRdcl() {
        return this.fpoDescRdcl;
    }

    public String getFpoVigPoder() {
        return this.fpoVigPoder;
    }

    public String getFpoFinPoder() {
        return this.fpoFinPoder;
    }

    public String getFpoEstatPoder() {
        return this.fpoEstatPoder;
    }

    public String getFpoEstaRevocado() {
        return this.fpoEstaRevocado;
    }

    public String getFpoAlertaVenc() {
        return this.fpoAlertaVenc;
    }

    public String getFpoEscrituraRevoca() {
        return this.fpoEscrituraRevoca;
    }

    public String getFpoHistRevoca() {
        return this.fpoHistRevoca;
    }

    public String getFpoNoDeNot() {
        return this.fpoNoDeNot;
    }

    public String getFpoNotario() {
        return this.fpoNotario;
    }

    public String getFpoLocalidadNot() {
        return this.fpoLocalidadNot;
    }

    public String getFpoEstadoNot() {
        return this.fpoEstadoNot;
    }

    public String getFpoPlaza() {
        return this.fpoPlaza;
    }

    public String getFpoFacultad() {
        return this.fpoFacultad;
    }

    public String getFpoAsuntoLim() {
        return this.fpoAsuntoLim;
    }

    public String getFpoTipoPoder() {
        return this.fpoTipoPoder;
    }

    public String getFpoRendicionCts() {
        return this.fpoRendicionCts;
    }

    public String getFpoFolioSolPoder() {
        return this.fpoFolioSolPoder;
    }

    public String getFpoFolioOAgenda() {
        return this.fpoFolioOAgenda;
    }

    public String getFpoNuConsecTest() {
        return this.fpoNuConsecTest;
    }

    public String getFpoNoTest() {
        return this.fpoNoTest;
    }

    public String getFpoContacto() {
        return this.fpoContacto;
    }

    public String getFpoComentarios() {
        return this.fpoComentarios;
    }

    public BigDecimal getFpoFolioWf() {
        return this.fpoFolioWf;
    }

    public String getFpoApoderado() {
        return this.fpoApoderado;
    }

    public String getFpoPeriodicidad() {
        return this.fpoPeriodicidad;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FJU_PODERES";
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
        String sql = "SELECT * FROM FJU_PODERES ";
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
        String sql = "UPDATE FJU_PODERES SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        fields += " FPO_ID_FIDEICOMISO = ?, ";
        values.add(this.getFpoIdFideicomiso());
        fields += " FPO_BASE = ?, ";
        values.add(this.getFpoBase());
        fields += " FPO_EN_SIST = ?, ";
        values.add(this.getFpoEnSist());
        fields += " FPO_IMAGEN = ?, ";
        values.add(this.getFpoImagen());
        fields += " FPO_FSO_COBRANZA = ?, ";
        values.add(this.getFpoFsoCobranza());
        fields += " FPO_ID_FIDEI = ?, ";
        values.add(this.getFpoIdFidei());
        fields += " FPO_FIDEI_NOMBRE = ?, ";
        values.add(this.getFpoFideiNombre());
        fields += " FPO_FIDEI_VIGE = ?, ";
        values.add(this.getFpoFideiVige());
        fields += " FPO_ESA_PODERDANTE = ?, ";
        values.add(this.getFpoEsaPoderdante());
        fields += " FPO_REPRS = ?, ";
        values.add(this.getFpoReprs());
        fields += " FPO_NOMBRE = ?, ";
        values.add(this.getFpoNombre());
        fields += " FPO_APELLIDOS = ?, ";
        values.add(this.getFpoApellidos());
        fields += " FPO_DOMICILIO = ?, ";
        values.add(this.getFpoDomicilio());
        fields += " FPO_ESCRITURA = ?, ";
        values.add(this.getFpoEscritura());
        fields += " FPO_FECHA_ESCRITURA = ?, ";
        values.add(this.getFpoFechaEscritura());
        fields += " FPO_TIPO = ?, ";
        values.add(this.getFpoTipo());
        fields += " FPO_CARTA_DE_ACEPT = ?, ";
        values.add(this.getFpoCartaDeAcept());
        fields += " FPO_FECHA_CARTA = ?, ";
        values.add(this.getFpoFechaCarta());
        fields += " FPO_FOLIO_SOC_ULTI_RDCL = ?, ";
        values.add(this.getFpoFolioSocUltiRdcl());
        fields += " FPO_FE_ULTI_RDCL = ?, ";
        values.add(this.getFpoFeUltiRdcl());
        fields += " FPO_DESC_RDCL = ?, ";
        values.add(this.getFpoDescRdcl());
        fields += " FPO_VIG_PODER = ?, ";
        values.add(this.getFpoVigPoder());
        fields += " FPO_FIN_PODER = ?, ";
        values.add(this.getFpoFinPoder());
        fields += " FPO_ESTAT_PODER = ?, ";
        values.add(this.getFpoEstatPoder());
        fields += " FPO_ESTA_REVOCADO = ?, ";
        values.add(this.getFpoEstaRevocado());
        fields += " FPO_ALERTA_VENC = ?, ";
        values.add(this.getFpoAlertaVenc());
        fields += " FPO_ESCRITURA_REVOCA = ?, ";
        values.add(this.getFpoEscrituraRevoca());
        fields += " FPO_HIST_REVOCA = ?, ";
        values.add(this.getFpoHistRevoca());
        fields += " FPO_NO_DE_NOT = ?, ";
        values.add(this.getFpoNoDeNot());
        fields += " FPO_NOTARIO = ?, ";
        values.add(this.getFpoNotario());
        fields += " FPO_LOCALIDAD_NOT = ?, ";
        values.add(this.getFpoLocalidadNot());
        fields += " FPO_ESTADO_NOT = ?, ";
        values.add(this.getFpoEstadoNot());
        fields += " FPO_PLAZA = ?, ";
        values.add(this.getFpoPlaza());
        fields += " FPO_FACULTAD = ?, ";
        values.add(this.getFpoFacultad());
        fields += " FPO_ASUNTO_LIM = ?, ";
        values.add(this.getFpoAsuntoLim());
        fields += " FPO_TIPO_PODER = ?, ";
        values.add(this.getFpoTipoPoder());
        fields += " FPO_RENDICION_CTS = ?, ";
        values.add(this.getFpoRendicionCts());
        fields += " FPO_FOLIO_SOL_PODER = ?, ";
        values.add(this.getFpoFolioSolPoder());
        fields += " FPO_FOLIO_O_AGENDA = ?, ";
        values.add(this.getFpoFolioOAgenda());
        fields += " FPO_NU_CONSEC_TEST = ?, ";
        values.add(this.getFpoNuConsecTest());
        fields += " FPO_NO_TEST = ?, ";
        values.add(this.getFpoNoTest());
        fields += " FPO_CONTACTO = ?, ";
        values.add(this.getFpoContacto());
        fields += " FPO_COMENTARIOS = ?, ";
        values.add(this.getFpoComentarios());
        fields += " FPO_FOLIO_WF = ?, ";
        values.add(this.getFpoFolioWf());
        fields += " FPO_APODERADO = ?, ";
        values.add(this.getFpoApoderado());
        fields += " FPO_PERIODICIDAD = ?, ";
        values.add(this.getFpoPeriodicidad());
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
        String sql = "INSERT INTO FJU_PODERES ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FPO_ID_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getFpoIdFideicomiso());
        fields += ",FPO_BASE ";
        fieldValues += ", ?";
        values.add(this.getFpoBase());
        fields += ",FPO_EN_SIST ";
        fieldValues += ", ?";
        values.add(this.getFpoEnSist());
        fields += ",FPO_IMAGEN ";
        fieldValues += ", ?";
        values.add(this.getFpoImagen());
        fields += ",FPO_FSO_COBRANZA ";
        fieldValues += ", ?";
        values.add(this.getFpoFsoCobranza());
        fields += ",FPO_ID_FIDEI ";
        fieldValues += ", ?";
        values.add(this.getFpoIdFidei());
        fields += ",FPO_FIDEI_NOMBRE ";
        fieldValues += ", ?";
        values.add(this.getFpoFideiNombre());
        fields += ",FPO_FIDEI_VIGE ";
        fieldValues += ", ?";
        values.add(this.getFpoFideiVige());
        fields += ",FPO_ESA_PODERDANTE ";
        fieldValues += ", ?";
        values.add(this.getFpoEsaPoderdante());
        fields += ",FPO_REPRS ";
        fieldValues += ", ?";
        values.add(this.getFpoReprs());
        fields += ",FPO_NOMBRE ";
        fieldValues += ", ?";
        values.add(this.getFpoNombre());
        fields += ",FPO_APELLIDOS ";
        fieldValues += ", ?";
        values.add(this.getFpoApellidos());
        fields += ",FPO_DOMICILIO ";
        fieldValues += ", ?";
        values.add(this.getFpoDomicilio());
        fields += ",FPO_ESCRITURA ";
        fieldValues += ", ?";
        values.add(this.getFpoEscritura());
        fields += ",FPO_FECHA_ESCRITURA ";
        fieldValues += ", ?";
        values.add(this.getFpoFechaEscritura());
        fields += ",FPO_TIPO ";
        fieldValues += ", ?";
        values.add(this.getFpoTipo());
        fields += ",FPO_CARTA_DE_ACEPT ";
        fieldValues += ", ?";
        values.add(this.getFpoCartaDeAcept());
        fields += ",FPO_FECHA_CARTA ";
        fieldValues += ", ?";
        values.add(this.getFpoFechaCarta());
        fields += ",FPO_FOLIO_SOC_ULTI_RDCL ";
        fieldValues += ", ?";
        values.add(this.getFpoFolioSocUltiRdcl());
        fields += ",FPO_FE_ULTI_RDCL ";
        fieldValues += ", ?";
        values.add(this.getFpoFeUltiRdcl());
        fields += ",FPO_DESC_RDCL ";
        fieldValues += ", ?";
        values.add(this.getFpoDescRdcl());
        fields += ",FPO_VIG_PODER ";
        fieldValues += ", ?";
        values.add(this.getFpoVigPoder());
        fields += ",FPO_FIN_PODER ";
        fieldValues += ", ?";
        values.add(this.getFpoFinPoder());
        fields += ",FPO_ESTAT_PODER ";
        fieldValues += ", ?";
        values.add(this.getFpoEstatPoder());
        fields += ",FPO_ESTA_REVOCADO ";
        fieldValues += ", ?";
        values.add(this.getFpoEstaRevocado());
        fields += ",FPO_ALERTA_VENC ";
        fieldValues += ", ?";
        values.add(this.getFpoAlertaVenc());
        fields += ",FPO_ESCRITURA_REVOCA ";
        fieldValues += ", ?";
        values.add(this.getFpoEscrituraRevoca());
        fields += ",FPO_HIST_REVOCA ";
        fieldValues += ", ?";
        values.add(this.getFpoHistRevoca());
        fields += ",FPO_NO_DE_NOT ";
        fieldValues += ", ?";
        values.add(this.getFpoNoDeNot());
        fields += ",FPO_NOTARIO ";
        fieldValues += ", ?";
        values.add(this.getFpoNotario());
        fields += ",FPO_LOCALIDAD_NOT ";
        fieldValues += ", ?";
        values.add(this.getFpoLocalidadNot());
        fields += ",FPO_ESTADO_NOT ";
        fieldValues += ", ?";
        values.add(this.getFpoEstadoNot());
        fields += ",FPO_PLAZA ";
        fieldValues += ", ?";
        values.add(this.getFpoPlaza());
        fields += ",FPO_FACULTAD ";
        fieldValues += ", ?";
        values.add(this.getFpoFacultad());
        fields += ",FPO_ASUNTO_LIM ";
        fieldValues += ", ?";
        values.add(this.getFpoAsuntoLim());
        fields += ",FPO_TIPO_PODER ";
        fieldValues += ", ?";
        values.add(this.getFpoTipoPoder());
        fields += ",FPO_RENDICION_CTS ";
        fieldValues += ", ?";
        values.add(this.getFpoRendicionCts());
        fields += ",FPO_FOLIO_SOL_PODER ";
        fieldValues += ", ?";
        values.add(this.getFpoFolioSolPoder());
        fields += ",FPO_FOLIO_O_AGENDA ";
        fieldValues += ", ?";
        values.add(this.getFpoFolioOAgenda());
        fields += ",FPO_NU_CONSEC_TEST ";
        fieldValues += ", ?";
        values.add(this.getFpoNuConsecTest());
        fields += ",FPO_NO_TEST ";
        fieldValues += ", ?";
        values.add(this.getFpoNoTest());
        fields += ",FPO_CONTACTO ";
        fieldValues += ", ?";
        values.add(this.getFpoContacto());
        fields += ",FPO_COMENTARIOS ";
        fieldValues += ", ?";
        values.add(this.getFpoComentarios());
        fields += ",FPO_FOLIO_WF ";
        fieldValues += ", ?";
        values.add(this.getFpoFolioWf());
        fields += ",FPO_APODERADO ";
        fieldValues += ", ?";
        values.add(this.getFpoApoderado());
        fields += ",FPO_PERIODICIDAD ";
        fieldValues += ", ?";
        values.add(this.getFpoPeriodicidad());
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
        String sql = "DELETE FROM FJU_PODERES WHERE ";
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
        FjuPoderes instance = (FjuPoderes) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFpoIdFideicomiso().equals(instance.getFpoIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFpoBase().equals(instance.getFpoBase()))
            equalObjects = false;
        if (equalObjects && !this.getFpoEnSist().equals(instance.getFpoEnSist()))
            equalObjects = false;
        if (equalObjects && !this.getFpoImagen().equals(instance.getFpoImagen()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFsoCobranza().equals(instance.getFpoFsoCobranza()))
            equalObjects = false;
        if (equalObjects && !this.getFpoIdFidei().equals(instance.getFpoIdFidei()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFideiNombre().equals(instance.getFpoFideiNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFideiVige().equals(instance.getFpoFideiVige()))
            equalObjects = false;
        if (equalObjects && !this.getFpoEsaPoderdante().equals(instance.getFpoEsaPoderdante()))
            equalObjects = false;
        if (equalObjects && !this.getFpoReprs().equals(instance.getFpoReprs()))
            equalObjects = false;
        if (equalObjects && !this.getFpoNombre().equals(instance.getFpoNombre()))
            equalObjects = false;
        if (equalObjects && !this.getFpoApellidos().equals(instance.getFpoApellidos()))
            equalObjects = false;
        if (equalObjects && !this.getFpoDomicilio().equals(instance.getFpoDomicilio()))
            equalObjects = false;
        if (equalObjects && !this.getFpoEscritura().equals(instance.getFpoEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFechaEscritura().equals(instance.getFpoFechaEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getFpoTipo().equals(instance.getFpoTipo()))
            equalObjects = false;
        if (equalObjects && !this.getFpoCartaDeAcept().equals(instance.getFpoCartaDeAcept()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFechaCarta().equals(instance.getFpoFechaCarta()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFolioSocUltiRdcl().equals(instance.getFpoFolioSocUltiRdcl()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFeUltiRdcl().equals(instance.getFpoFeUltiRdcl()))
            equalObjects = false;
        if (equalObjects && !this.getFpoDescRdcl().equals(instance.getFpoDescRdcl()))
            equalObjects = false;
        if (equalObjects && !this.getFpoVigPoder().equals(instance.getFpoVigPoder()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFinPoder().equals(instance.getFpoFinPoder()))
            equalObjects = false;
        if (equalObjects && !this.getFpoEstatPoder().equals(instance.getFpoEstatPoder()))
            equalObjects = false;
        if (equalObjects && !this.getFpoEstaRevocado().equals(instance.getFpoEstaRevocado()))
            equalObjects = false;
        if (equalObjects && !this.getFpoAlertaVenc().equals(instance.getFpoAlertaVenc()))
            equalObjects = false;
        if (equalObjects && !this.getFpoEscrituraRevoca().equals(instance.getFpoEscrituraRevoca()))
            equalObjects = false;
        if (equalObjects && !this.getFpoHistRevoca().equals(instance.getFpoHistRevoca()))
            equalObjects = false;
        if (equalObjects && !this.getFpoNoDeNot().equals(instance.getFpoNoDeNot()))
            equalObjects = false;
        if (equalObjects && !this.getFpoNotario().equals(instance.getFpoNotario()))
            equalObjects = false;
        if (equalObjects && !this.getFpoLocalidadNot().equals(instance.getFpoLocalidadNot()))
            equalObjects = false;
        if (equalObjects && !this.getFpoEstadoNot().equals(instance.getFpoEstadoNot()))
            equalObjects = false;
        if (equalObjects && !this.getFpoPlaza().equals(instance.getFpoPlaza()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFacultad().equals(instance.getFpoFacultad()))
            equalObjects = false;
        if (equalObjects && !this.getFpoAsuntoLim().equals(instance.getFpoAsuntoLim()))
            equalObjects = false;
        if (equalObjects && !this.getFpoTipoPoder().equals(instance.getFpoTipoPoder()))
            equalObjects = false;
        if (equalObjects && !this.getFpoRendicionCts().equals(instance.getFpoRendicionCts()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFolioSolPoder().equals(instance.getFpoFolioSolPoder()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFolioOAgenda().equals(instance.getFpoFolioOAgenda()))
            equalObjects = false;
        if (equalObjects && !this.getFpoNuConsecTest().equals(instance.getFpoNuConsecTest()))
            equalObjects = false;
        if (equalObjects && !this.getFpoNoTest().equals(instance.getFpoNoTest()))
            equalObjects = false;
        if (equalObjects && !this.getFpoContacto().equals(instance.getFpoContacto()))
            equalObjects = false;
        if (equalObjects && !this.getFpoComentarios().equals(instance.getFpoComentarios()))
            equalObjects = false;
        if (equalObjects && !this.getFpoFolioWf().equals(instance.getFpoFolioWf()))
            equalObjects = false;
        if (equalObjects && !this.getFpoApoderado().equals(instance.getFpoApoderado()))
            equalObjects = false;
        if (equalObjects && !this.getFpoPeriodicidad().equals(instance.getFpoPeriodicidad()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FjuPoderes result = new FjuPoderes();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFpoIdFideicomiso((String) objectData.getData("FPO_ID_FIDEICOMISO"));
        result.setFpoBase((String) objectData.getData("FPO_BASE"));
        result.setFpoEnSist((String) objectData.getData("FPO_EN_SIST"));
        result.setFpoImagen((String) objectData.getData("FPO_IMAGEN"));
        result.setFpoFsoCobranza((String) objectData.getData("FPO_FSO_COBRANZA"));
        result.setFpoIdFidei((BigDecimal) objectData.getData("FPO_ID_FIDEI"));
        result.setFpoFideiNombre((String) objectData.getData("FPO_FIDEI_NOMBRE"));
        result.setFpoFideiVige((String) objectData.getData("FPO_FIDEI_VIGE"));
        result.setFpoEsaPoderdante((String) objectData.getData("FPO_ESA_PODERDANTE"));
        result.setFpoReprs((String) objectData.getData("FPO_REPRS"));
        result.setFpoNombre((String) objectData.getData("FPO_NOMBRE"));
        result.setFpoApellidos((String) objectData.getData("FPO_APELLIDOS"));
        result.setFpoDomicilio((String) objectData.getData("FPO_DOMICILIO"));
        result.setFpoEscritura((String) objectData.getData("FPO_ESCRITURA"));
        result.setFpoFechaEscritura((String) objectData.getData("FPO_FECHA_ESCRITURA"));
        result.setFpoTipo((String) objectData.getData("FPO_TIPO"));
        result.setFpoCartaDeAcept((String) objectData.getData("FPO_CARTA_DE_ACEPT"));
        result.setFpoFechaCarta((String) objectData.getData("FPO_FECHA_CARTA"));
        result.setFpoFolioSocUltiRdcl((String) objectData.getData("FPO_FOLIO_SOC_ULTI_RDCL"));
        result.setFpoFeUltiRdcl((String) objectData.getData("FPO_FE_ULTI_RDCL"));
        result.setFpoDescRdcl((String) objectData.getData("FPO_DESC_RDCL"));
        result.setFpoVigPoder((String) objectData.getData("FPO_VIG_PODER"));
        result.setFpoFinPoder((String) objectData.getData("FPO_FIN_PODER"));
        result.setFpoEstatPoder((String) objectData.getData("FPO_ESTAT_PODER"));
        result.setFpoEstaRevocado((String) objectData.getData("FPO_ESTA_REVOCADO"));
        result.setFpoAlertaVenc((String) objectData.getData("FPO_ALERTA_VENC"));
        result.setFpoEscrituraRevoca((String) objectData.getData("FPO_ESCRITURA_REVOCA"));
        result.setFpoHistRevoca((String) objectData.getData("FPO_HIST_REVOCA"));
        result.setFpoNoDeNot((String) objectData.getData("FPO_NO_DE_NOT"));
        result.setFpoNotario((String) objectData.getData("FPO_NOTARIO"));
        result.setFpoLocalidadNot((String) objectData.getData("FPO_LOCALIDAD_NOT"));
        result.setFpoEstadoNot((String) objectData.getData("FPO_ESTADO_NOT"));
        result.setFpoPlaza((String) objectData.getData("FPO_PLAZA"));
        result.setFpoFacultad((String) objectData.getData("FPO_FACULTAD"));
        result.setFpoAsuntoLim((String) objectData.getData("FPO_ASUNTO_LIM"));
        result.setFpoTipoPoder((String) objectData.getData("FPO_TIPO_PODER"));
        result.setFpoRendicionCts((String) objectData.getData("FPO_RENDICION_CTS"));
        result.setFpoFolioSolPoder((String) objectData.getData("FPO_FOLIO_SOL_PODER"));
        result.setFpoFolioOAgenda((String) objectData.getData("FPO_FOLIO_O_AGENDA"));
        result.setFpoNuConsecTest((String) objectData.getData("FPO_NU_CONSEC_TEST"));
        result.setFpoNoTest((String) objectData.getData("FPO_NO_TEST"));
        result.setFpoContacto((String) objectData.getData("FPO_CONTACTO"));
        result.setFpoComentarios((String) objectData.getData("FPO_COMENTARIOS"));
        result.setFpoFolioWf((BigDecimal) objectData.getData("FPO_FOLIO_WF"));
        result.setFpoApoderado((String) objectData.getData("FPO_APODERADO"));
        result.setFpoPeriodicidad((String) objectData.getData("FPO_PERIODICIDAD"));
        return result;
    }
}
