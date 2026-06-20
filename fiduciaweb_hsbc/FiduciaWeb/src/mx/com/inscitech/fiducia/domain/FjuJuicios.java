package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;

public class FjuJuicios extends DomainObject {
    String fjuJuicio = null;
    String fjuNo = null;
    String fjuFideicomiso = null;
    String fjuAno = null;
    String fjuMes = null;
    String fjuFolioRdcl = null;
    String fjuOrigNot = null;
    String fjuAgregPor = null;
    String fjuFsoConPoder = null;
    String fjuMaestro = null;
    String fjuCobranza = null;
    String fjuAdmonOPrestador = null;
    String fjuTipoDeFid = null;
    String fjuLtgNumero = null;
    String fjuCtlInt = null;
    String fjuEstatus = null;
    String fjuEstJuicioVigConcl = null;
    String fjuObservParaMesaDeCntrl = null;
    String fjuFechaConocimiento = null;
    String fjuAnoRecepcion = null;
    String fjuFechaDeInicio = null;
    String fjuFechaEmplaza = null;
    String fjuParte = null;
    String fjuNombreActDmtQuejoso = null;
    String fjuDmtTerceroDemandado = null;
    String fjuTipoDeExp = null;
    String fjuExpediente = null;
    String fjuFuero = null;
    String fjuJuzgado = null;
    String fjuTipoJuzgado = null;
    String fjuTipoJuicio = null;
    String fjuEstado = null;
    String fjuLocalidad = null;
    String fjuPrestReclamadas = null;
    String fjuCausales = null;
    String fjuRptProyectoMah1020 = null;
    String fjuEstatEdoProcJuicio = null;
    String fjuDfsaACargoDe = null;
    String fjuObservGrals = null;
    String fjuDescripUltAct = null;
    String fjuFechaUltAct = null;
    String fjuImpDemandadoMxn = null;
    String fjuImpDemandadoUsd = null;
    String fjuCalifDeRiesgo = null;
    String fjuComCalifDeRiesg = null;
    String fjuEstrategia = null;
    String fjuOutstandingLitigation = null;
    String fjuFechaInfoDelClt = null;
    BigDecimal fjuFolioWf = null;

    public FjuJuicios() {
        super();
        this.pkColumns = 8;
    }

    public void setFjuJuicio(String fjuJuicio) {
        this.fjuJuicio = fjuJuicio;
    }

    public void setFjuNo(String fjuNo) {
        this.fjuNo = fjuNo;
    }

    public void setFjuFideicomiso(String fjuFideicomiso) {
        this.fjuFideicomiso = fjuFideicomiso;
    }

    public void setFjuAno(String fjuAno) {
        this.fjuAno = fjuAno;
    }

    public void setFjuMes(String fjuMes) {
        this.fjuMes = fjuMes;
    }

    public void setFjuFolioRdcl(String fjuFolioRdcl) {
        this.fjuFolioRdcl = fjuFolioRdcl;
    }

    public void setFjuOrigNot(String fjuOrigNot) {
        this.fjuOrigNot = fjuOrigNot;
    }

    public void setFjuAgregPor(String fjuAgregPor) {
        this.fjuAgregPor = fjuAgregPor;
    }

    public void setFjuFsoConPoder(String fjuFsoConPoder) {
        this.fjuFsoConPoder = fjuFsoConPoder;
    }

    public void setFjuMaestro(String fjuMaestro) {
        this.fjuMaestro = fjuMaestro;
    }

    public void setFjuCobranza(String fjuCobranza) {
        this.fjuCobranza = fjuCobranza;
    }

    public void setFjuAdmonOPrestador(String fjuAdmonOPrestador) {
        this.fjuAdmonOPrestador = fjuAdmonOPrestador;
    }

    public void setFjuTipoDeFid(String fjuTipoDeFid) {
        this.fjuTipoDeFid = fjuTipoDeFid;
    }

    public void setFjuLtgNumero(String fjuLtgNumero) {
        this.fjuLtgNumero = fjuLtgNumero;
    }

    public void setFjuCtlInt(String fjuCtlInt) {
        this.fjuCtlInt = fjuCtlInt;
    }

    public void setFjuEstatus(String fjuEstatus) {
        this.fjuEstatus = fjuEstatus;
    }

    public void setFjuEstJuicioVigConcl(String fjuEstJuicioVigConcl) {
        this.fjuEstJuicioVigConcl = fjuEstJuicioVigConcl;
    }

    public void setFjuObservParaMesaDeCntrl(String fjuObservParaMesaDeCntrl) {
        this.fjuObservParaMesaDeCntrl = fjuObservParaMesaDeCntrl;
    }

    public void setFjuFechaConocimiento(String fjuFechaConocimiento) {
        this.fjuFechaConocimiento = fjuFechaConocimiento;
    }

    public void setFjuAnoRecepcion(String fjuAnoRecepcion) {
        this.fjuAnoRecepcion = fjuAnoRecepcion;
    }

    public void setFjuFechaDeInicio(String fjuFechaDeInicio) {
        this.fjuFechaDeInicio = fjuFechaDeInicio;
    }

    public void setFjuFechaEmplaza(String fjuFechaEmplaza) {
        this.fjuFechaEmplaza = fjuFechaEmplaza;
    }

    public void setFjuParte(String fjuParte) {
        this.fjuParte = fjuParte;
    }

    public void setFjuNombreActDmtQuejoso(String fjuNombreActDmtQuejoso) {
        this.fjuNombreActDmtQuejoso = fjuNombreActDmtQuejoso;
    }

    public void setFjuDmtTerceroDemandado(String fjuDmtTerceroDemandado) {
        this.fjuDmtTerceroDemandado = fjuDmtTerceroDemandado;
    }

    public void setFjuTipoDeExp(String fjuTipoDeExp) {
        this.fjuTipoDeExp = fjuTipoDeExp;
    }

    public void setFjuExpediente(String fjuExpediente) {
        this.fjuExpediente = fjuExpediente;
    }

    public void setFjuFuero(String fjuFuero) {
        this.fjuFuero = fjuFuero;
    }

    public void setFjuJuzgado(String fjuJuzgado) {
        this.fjuJuzgado = fjuJuzgado;
    }

    public void setFjuTipoJuzgado(String fjuTipoJuzgado) {
        this.fjuTipoJuzgado = fjuTipoJuzgado;
    }

    public void setFjuTipoJuicio(String fjuTipoJuicio) {
        this.fjuTipoJuicio = fjuTipoJuicio;
    }

    public void setFjuEstado(String fjuEstado) {
        this.fjuEstado = fjuEstado;
    }

    public void setFjuLocalidad(String fjuLocalidad) {
        this.fjuLocalidad = fjuLocalidad;
    }

    public void setFjuPrestReclamadas(String fjuPrestReclamadas) {
        this.fjuPrestReclamadas = fjuPrestReclamadas;
    }

    public void setFjuCausales(String fjuCausales) {
        this.fjuCausales = fjuCausales;
    }

    public void setFjuRptProyectoMah1020(String fjuRptProyectoMah1020) {
        this.fjuRptProyectoMah1020 = fjuRptProyectoMah1020;
    }

    public void setFjuEstatEdoProcJuicio(String fjuEstatEdoProcJuicio) {
        this.fjuEstatEdoProcJuicio = fjuEstatEdoProcJuicio;
    }

    public void setFjuDfsaACargoDe(String fjuDfsaACargoDe) {
        this.fjuDfsaACargoDe = fjuDfsaACargoDe;
    }

    public void setFjuObservGrals(String fjuObservGrals) {
        this.fjuObservGrals = fjuObservGrals;
    }

    public void setFjuDescripUltAct(String fjuDescripUltAct) {
        this.fjuDescripUltAct = fjuDescripUltAct;
    }

    public void setFjuFechaUltAct(String fjuFechaUltAct) {
        this.fjuFechaUltAct = fjuFechaUltAct;
    }

    public void setFjuImpDemandadoMxn(String fjuImpDemandadoMxn) {
        this.fjuImpDemandadoMxn = fjuImpDemandadoMxn;
    }

    public void setFjuImpDemandadoUsd(String fjuImpDemandadoUsd) {
        this.fjuImpDemandadoUsd = fjuImpDemandadoUsd;
    }

    public void setFjuCalifDeRiesgo(String fjuCalifDeRiesgo) {
        this.fjuCalifDeRiesgo = fjuCalifDeRiesgo;
    }

    public void setFjuComCalifDeRiesg(String fjuComCalifDeRiesg) {
        this.fjuComCalifDeRiesg = fjuComCalifDeRiesg;
    }

    public void setFjuEstrategia(String fjuEstrategia) {
        this.fjuEstrategia = fjuEstrategia;
    }

    public void setFjuOutstandingLitigation(String fjuOutstandingLitigation) {
        this.fjuOutstandingLitigation = fjuOutstandingLitigation;
    }

    public void setFjuFechaInfoDelClt(String fjuFechaInfoDelClt) {
        this.fjuFechaInfoDelClt = fjuFechaInfoDelClt;
    }

    public void setFjuFolioWf(BigDecimal fjuFolioWf) {
        this.fjuFolioWf = fjuFolioWf;
    }

    public String getFjuJuicio() {
        return this.fjuJuicio;
    }

    public String getFjuNo() {
        return this.fjuNo;
    }

    public String getFjuFideicomiso() {
        return this.fjuFideicomiso;
    }

    public String getFjuAno() {
        return this.fjuAno;
    }

    public String getFjuMes() {
        return this.fjuMes;
    }

    public String getFjuFolioRdcl() {
        return this.fjuFolioRdcl;
    }

    public String getFjuOrigNot() {
        return this.fjuOrigNot;
    }

    public String getFjuAgregPor() {
        return this.fjuAgregPor;
    }

    public String getFjuFsoConPoder() {
        return this.fjuFsoConPoder;
    }

    public String getFjuMaestro() {
        return this.fjuMaestro;
    }

    public String getFjuCobranza() {
        return this.fjuCobranza;
    }

    public String getFjuAdmonOPrestador() {
        return this.fjuAdmonOPrestador;
    }

    public String getFjuTipoDeFid() {
        return this.fjuTipoDeFid;
    }

    public String getFjuLtgNumero() {
        return this.fjuLtgNumero;
    }

    public String getFjuCtlInt() {
        return this.fjuCtlInt;
    }

    public String getFjuEstatus() {
        return this.fjuEstatus;
    }

    public String getFjuEstJuicioVigConcl() {
        return this.fjuEstJuicioVigConcl;
    }

    public String getFjuObservParaMesaDeCntrl() {
        return this.fjuObservParaMesaDeCntrl;
    }

    public String getFjuFechaConocimiento() {
        return this.fjuFechaConocimiento;
    }

    public String getFjuAnoRecepcion() {
        return this.fjuAnoRecepcion;
    }

    public String getFjuFechaDeInicio() {
        return this.fjuFechaDeInicio;
    }

    public String getFjuFechaEmplaza() {
        return this.fjuFechaEmplaza;
    }

    public String getFjuParte() {
        return this.fjuParte;
    }

    public String getFjuNombreActDmtQuejoso() {
        return this.fjuNombreActDmtQuejoso;
    }

    public String getFjuDmtTerceroDemandado() {
        return this.fjuDmtTerceroDemandado;
    }

    public String getFjuTipoDeExp() {
        return this.fjuTipoDeExp;
    }

    public String getFjuExpediente() {
        return this.fjuExpediente;
    }

    public String getFjuFuero() {
        return this.fjuFuero;
    }

    public String getFjuJuzgado() {
        return this.fjuJuzgado;
    }

    public String getFjuTipoJuzgado() {
        return this.fjuTipoJuzgado;
    }

    public String getFjuTipoJuicio() {
        return this.fjuTipoJuicio;
    }

    public String getFjuEstado() {
        return this.fjuEstado;
    }

    public String getFjuLocalidad() {
        return this.fjuLocalidad;
    }

    public String getFjuPrestReclamadas() {
        return this.fjuPrestReclamadas;
    }

    public String getFjuCausales() {
        return this.fjuCausales;
    }

    public String getFjuRptProyectoMah1020() {
        return this.fjuRptProyectoMah1020;
    }

    public String getFjuEstatEdoProcJuicio() {
        return this.fjuEstatEdoProcJuicio;
    }

    public String getFjuDfsaACargoDe() {
        return this.fjuDfsaACargoDe;
    }

    public String getFjuObservGrals() {
        return this.fjuObservGrals;
    }

    public String getFjuDescripUltAct() {
        return this.fjuDescripUltAct;
    }

    public String getFjuFechaUltAct() {
        return this.fjuFechaUltAct;
    }

    public String getFjuImpDemandadoMxn() {
        return this.fjuImpDemandadoMxn;
    }

    public String getFjuImpDemandadoUsd() {
        return this.fjuImpDemandadoUsd;
    }

    public String getFjuCalifDeRiesgo() {
        return this.fjuCalifDeRiesgo;
    }

    public String getFjuComCalifDeRiesg() {
        return this.fjuComCalifDeRiesg;
    }

    public String getFjuEstrategia() {
        return this.fjuEstrategia;
    }

    public String getFjuOutstandingLitigation() {
        return this.fjuOutstandingLitigation;
    }

    public String getFjuFechaInfoDelClt() {
        return this.fjuFechaInfoDelClt;
    }

    public BigDecimal getFjuFolioWf() {
        return this.fjuFolioWf;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM FJU_JUICIOS";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getFjuNo() != null && "null".equals(this.getFjuNo())) {
            conditions += " AND FJU_NO IS NULL";
        } else if (this.getFjuNo() != null) {
            conditions += " AND FJU_NO =?";
            values.add(this.getFjuNo());
        }
        if (this.getFjuFideicomiso() != null && "null".equals(this.getFjuFideicomiso())) {
            conditions += " AND FJU_FIDEICOMISO IS NULL";
        } else if (this.getFjuFideicomiso() != null) {
            conditions += " AND FJU_FIDEICOMISO =?";
            values.add(this.getFjuFideicomiso());
        }
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
        String sql = "SELECT * FROM FJU_JUICIOS ";
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
        String sql = "UPDATE FJU_JUICIOS SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        fields += " FJU_JUICIO = ?, ";
        values.add(this.getFjuJuicio());
        conditions += " AND FJU_NO = ?";
        pkValues.add(this.getFjuNo());
        conditions += " AND FJU_FIDEICOMISO = ?";
        pkValues.add(this.getFjuFideicomiso());
        fields += " FJU_ANO = ?, ";
        values.add(this.getFjuAno());
        fields += " FJU_MES = ?, ";
        values.add(this.getFjuMes());
        fields += " FJU_FOLIO_RDCL = ?, ";
        values.add(this.getFjuFolioRdcl());
        fields += " FJU_ORIG_NOT = ?, ";
        values.add(this.getFjuOrigNot());
        fields += " FJU_AGREG_POR = ?, ";
        values.add(this.getFjuAgregPor());
        fields += " FJU_FSO_CON_PODER = ?, ";
        values.add(this.getFjuFsoConPoder());
        fields += " FJU_MAESTRO = ?, ";
        values.add(this.getFjuMaestro());
        fields += " FJU_COBRANZA = ?, ";
        values.add(this.getFjuCobranza());
        fields += " FJU_ADMON_O_PRESTADOR = ?, ";
        values.add(this.getFjuAdmonOPrestador());
        fields += " FJU_TIPO_DE_FID = ?, ";
        values.add(this.getFjuTipoDeFid());
        fields += " FJU_LTG_NUMERO = ?, ";
        values.add(this.getFjuLtgNumero());
        fields += " FJU_CTL_INT = ?, ";
        values.add(this.getFjuCtlInt());
        fields += " FJU_ESTATUS = ?, ";
        values.add(this.getFjuEstatus());
        fields += " FJU_EST_JUICIO_VIG_CONCL = ?, ";
        values.add(this.getFjuEstJuicioVigConcl());
        fields += " FJU_OBSERV_PARA_MESA_DE_CNTRL = ?, ";
        values.add(this.getFjuObservParaMesaDeCntrl());
        fields += " FJU_FECHA_CONOCIMIENTO = ?, ";
        values.add(this.getFjuFechaConocimiento());
        fields += " FJU_ANO_RECEPCION = ?, ";
        values.add(this.getFjuAnoRecepcion());
        fields += " FJU_FECHA_DE_INICIO = ?, ";
        values.add(this.getFjuFechaDeInicio());
        fields += " FJU_FECHA_EMPLAZA = ?, ";
        values.add(this.getFjuFechaEmplaza());
        fields += " FJU_PARTE = ?, ";
        values.add(this.getFjuParte());
        fields += " FJU_NOMBRE_ACT_DMT_QUEJOSO = ?, ";
        values.add(this.getFjuNombreActDmtQuejoso());
        fields += " FJU_DMT_TERCERO_DEMANDADO = ?, ";
        values.add(this.getFjuDmtTerceroDemandado());
        fields += " FJU_TIPO_DE_EXP = ?, ";
        values.add(this.getFjuTipoDeExp());
        fields += " FJU_EXPEDIENTE = ?, ";
        values.add(this.getFjuExpediente());
        fields += " FJU_FUERO = ?, ";
        values.add(this.getFjuFuero());
        fields += " FJU_JUZGADO = ?, ";
        values.add(this.getFjuJuzgado());
        fields += " FJU_TIPO_JUZGADO = ?, ";
        values.add(this.getFjuTipoJuzgado());
        fields += " FJU_TIPO_JUICIO = ?, ";
        values.add(this.getFjuTipoJuicio());
        fields += " FJU_ESTADO = ?, ";
        values.add(this.getFjuEstado());
        fields += " FJU_LOCALIDAD = ?, ";
        values.add(this.getFjuLocalidad());
        fields += " FJU_PREST_RECLAMADAS = ?, ";
        values.add(this.getFjuPrestReclamadas());
        fields += " FJU_CAUSALES = ?, ";
        values.add(this.getFjuCausales());
        fields += " FJU_RPT_PROYECTO_MAH1020 = ?, ";
        values.add(this.getFjuRptProyectoMah1020());
        fields += " FJU_ESTAT_EDO_PROC_JUICIO = ?, ";
        values.add(this.getFjuEstatEdoProcJuicio());
        fields += " FJU_DFSA_A_CARGO_DE = ?, ";
        values.add(this.getFjuDfsaACargoDe());
        fields += " FJU_OBSERV_GRALS = ?, ";
        values.add(this.getFjuObservGrals());
        fields += " FJU_DESCRIP_ULT_ACT = ?, ";
        values.add(this.getFjuDescripUltAct());
        fields += " FJU_FECHA_ULT_ACT = ?, ";
        values.add(this.getFjuFechaUltAct());
        fields += " FJU_IMP_DEMANDADO_MXN = ?, ";
        values.add(this.getFjuImpDemandadoMxn());
        fields += " FJU_IMP_DEMANDADO_USD = ?, ";
        values.add(this.getFjuImpDemandadoUsd());
        fields += " FJU_CALIF_DE_RIESGO = ?, ";
        values.add(this.getFjuCalifDeRiesgo());
        fields += " FJU_COM_CALIF_DE_RIESG = ?, ";
        values.add(this.getFjuComCalifDeRiesg());
        fields += " FJU_ESTRATEGIA = ?, ";
        values.add(this.getFjuEstrategia());
        fields += " FJU_OUTSTANDING_LITIGATION = ?, ";
        values.add(this.getFjuOutstandingLitigation());
        fields += " FJU_FECHA_INFO_DEL_CLT = ?, ";
        values.add(this.getFjuFechaInfoDelClt());
        fields += " FJU_FOLIO_WF = ?, ";
        values.add(this.getFjuFolioWf());
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
        String sql = "INSERT INTO FJU_JUICIOS ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FJU_JUICIO ";
        fieldValues += ", ?";
        values.add(this.getFjuJuicio());
        fields += ",FJU_NO ";
        fieldValues += ", ?";
        values.add(this.getFjuNo());
        fields += ",FJU_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getFjuFideicomiso());
        fields += ",FJU_ANO ";
        fieldValues += ", ?";
        values.add(this.getFjuAno());
        fields += ",FJU_MES ";
        fieldValues += ", ?";
        values.add(this.getFjuMes());
        fields += ",FJU_FOLIO_RDCL ";
        fieldValues += ", ?";
        values.add(this.getFjuFolioRdcl());
        fields += ",FJU_ORIG_NOT ";
        fieldValues += ", ?";
        values.add(this.getFjuOrigNot());
        fields += ",FJU_AGREG_POR ";
        fieldValues += ", ?";
        values.add(this.getFjuAgregPor());
        fields += ",FJU_FSO_CON_PODER ";
        fieldValues += ", ?";
        values.add(this.getFjuFsoConPoder());
        fields += ",FJU_MAESTRO ";
        fieldValues += ", ?";
        values.add(this.getFjuMaestro());
        fields += ",FJU_COBRANZA ";
        fieldValues += ", ?";
        values.add(this.getFjuCobranza());
        fields += ",FJU_ADMON_O_PRESTADOR ";
        fieldValues += ", ?";
        values.add(this.getFjuAdmonOPrestador());
        fields += ",FJU_TIPO_DE_FID ";
        fieldValues += ", ?";
        values.add(this.getFjuTipoDeFid());
        fields += ",FJU_LTG_NUMERO ";
        fieldValues += ", ?";
        values.add(this.getFjuLtgNumero());
        fields += ",FJU_CTL_INT ";
        fieldValues += ", ?";
        values.add(this.getFjuCtlInt());
        fields += ",FJU_ESTATUS ";
        fieldValues += ", ?";
        values.add(this.getFjuEstatus());
        fields += ",FJU_EST_JUICIO_VIG_CONCL ";
        fieldValues += ", ?";
        values.add(this.getFjuEstJuicioVigConcl());
        fields += ",FJU_OBSERV_PARA_MESA_DE_CNTRL ";
        fieldValues += ", ?";
        values.add(this.getFjuObservParaMesaDeCntrl());
        fields += ",FJU_FECHA_CONOCIMIENTO ";
        fieldValues += ", ?";
        values.add(this.getFjuFechaConocimiento());
        fields += ",FJU_ANO_RECEPCION ";
        fieldValues += ", ?";
        values.add(this.getFjuAnoRecepcion());
        fields += ",FJU_FECHA_DE_INICIO ";
        fieldValues += ", ?";
        values.add(this.getFjuFechaDeInicio());
        fields += ",FJU_FECHA_EMPLAZA ";
        fieldValues += ", ?";
        values.add(this.getFjuFechaEmplaza());
        fields += ",FJU_PARTE ";
        fieldValues += ", ?";
        values.add(this.getFjuParte());
        fields += ",FJU_NOMBRE_ACT_DMT_QUEJOSO ";
        fieldValues += ", ?";
        values.add(this.getFjuNombreActDmtQuejoso());
        fields += ",FJU_DMT_TERCERO_DEMANDADO ";
        fieldValues += ", ?";
        values.add(this.getFjuDmtTerceroDemandado());
        fields += ",FJU_TIPO_DE_EXP ";
        fieldValues += ", ?";
        values.add(this.getFjuTipoDeExp());
        fields += ",FJU_EXPEDIENTE ";
        fieldValues += ", ?";
        values.add(this.getFjuExpediente());
        fields += ",FJU_FUERO ";
        fieldValues += ", ?";
        values.add(this.getFjuFuero());
        fields += ",FJU_JUZGADO ";
        fieldValues += ", ?";
        values.add(this.getFjuJuzgado());
        fields += ",FJU_TIPO_JUZGADO ";
        fieldValues += ", ?";
        values.add(this.getFjuTipoJuzgado());
        fields += ",FJU_TIPO_JUICIO ";
        fieldValues += ", ?";
        values.add(this.getFjuTipoJuicio());
        fields += ",FJU_ESTADO ";
        fieldValues += ", ?";
        values.add(this.getFjuEstado());
        fields += ",FJU_LOCALIDAD ";
        fieldValues += ", ?";
        values.add(this.getFjuLocalidad());
        fields += ",FJU_PREST_RECLAMADAS ";
        fieldValues += ", ?";
        values.add(this.getFjuPrestReclamadas());
        fields += ",FJU_CAUSALES ";
        fieldValues += ", ?";
        values.add(this.getFjuCausales());
        fields += ",FJU_RPT_PROYECTO_MAH1020 ";
        fieldValues += ", ?";
        values.add(this.getFjuRptProyectoMah1020());
        fields += ",FJU_ESTAT_EDO_PROC_JUICIO ";
        fieldValues += ", ?";
        values.add(this.getFjuEstatEdoProcJuicio());
        fields += ",FJU_DFSA_A_CARGO_DE ";
        fieldValues += ", ?";
        values.add(this.getFjuDfsaACargoDe());
        fields += ",FJU_OBSERV_GRALS ";
        fieldValues += ", ?";
        values.add(this.getFjuObservGrals());
        fields += ",FJU_DESCRIP_ULT_ACT ";
        fieldValues += ", ?";
        values.add(this.getFjuDescripUltAct());
        fields += ",FJU_FECHA_ULT_ACT ";
        fieldValues += ", ?";
        values.add(this.getFjuFechaUltAct());
        fields += ",FJU_IMP_DEMANDADO_MXN ";
        fieldValues += ", ?";
        values.add(this.getFjuImpDemandadoMxn());
        fields += ",FJU_IMP_DEMANDADO_USD ";
        fieldValues += ", ?";
        values.add(this.getFjuImpDemandadoUsd());
        fields += ",FJU_CALIF_DE_RIESGO ";
        fieldValues += ", ?";
        values.add(this.getFjuCalifDeRiesgo());
        fields += ",FJU_COM_CALIF_DE_RIESG ";
        fieldValues += ", ?";
        values.add(this.getFjuComCalifDeRiesg());
        fields += ",FJU_ESTRATEGIA ";
        fieldValues += ", ?";
        values.add(this.getFjuEstrategia());
        fields += ",FJU_OUTSTANDING_LITIGATION ";
        fieldValues += ", ?";
        values.add(this.getFjuOutstandingLitigation());
        fields += ",FJU_FECHA_INFO_DEL_CLT ";
        fieldValues += ", ?";
        values.add(this.getFjuFechaInfoDelClt());
        fields += ",FJU_FOLIO_WF ";
        fieldValues += ", ?";
        values.add(this.getFjuFolioWf());
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
        String sql = "DELETE FROM FJU_JUICIOS WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND FJU_NO = ?";
        values.add(this.getFjuNo());
        conditions += " AND FJU_FIDEICOMISO = ?";
        values.add(this.getFjuFideicomiso());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FjuJuicios instance = (FjuJuicios) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFjuJuicio().equals(instance.getFjuJuicio()))
            equalObjects = false;
        if (equalObjects && !this.getFjuNo().equals(instance.getFjuNo()))
            equalObjects = false;
        if (equalObjects && !this.getFjuFideicomiso().equals(instance.getFjuFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFjuAno().equals(instance.getFjuAno()))
            equalObjects = false;
        if (equalObjects && !this.getFjuMes().equals(instance.getFjuMes()))
            equalObjects = false;
        if (equalObjects && !this.getFjuFolioRdcl().equals(instance.getFjuFolioRdcl()))
            equalObjects = false;
        if (equalObjects && !this.getFjuOrigNot().equals(instance.getFjuOrigNot()))
            equalObjects = false;
        if (equalObjects && !this.getFjuAgregPor().equals(instance.getFjuAgregPor()))
            equalObjects = false;
        if (equalObjects && !this.getFjuFsoConPoder().equals(instance.getFjuFsoConPoder()))
            equalObjects = false;
        if (equalObjects && !this.getFjuMaestro().equals(instance.getFjuMaestro()))
            equalObjects = false;
        if (equalObjects && !this.getFjuCobranza().equals(instance.getFjuCobranza()))
            equalObjects = false;
        if (equalObjects && !this.getFjuAdmonOPrestador().equals(instance.getFjuAdmonOPrestador()))
            equalObjects = false;
        if (equalObjects && !this.getFjuTipoDeFid().equals(instance.getFjuTipoDeFid()))
            equalObjects = false;
        if (equalObjects && !this.getFjuLtgNumero().equals(instance.getFjuLtgNumero()))
            equalObjects = false;
        if (equalObjects && !this.getFjuCtlInt().equals(instance.getFjuCtlInt()))
            equalObjects = false;
        if (equalObjects && !this.getFjuEstatus().equals(instance.getFjuEstatus()))
            equalObjects = false;
        if (equalObjects && !this.getFjuEstJuicioVigConcl().equals(instance.getFjuEstJuicioVigConcl()))
            equalObjects = false;
        if (equalObjects && !this.getFjuObservParaMesaDeCntrl().equals(instance.getFjuObservParaMesaDeCntrl()))
            equalObjects = false;
        if (equalObjects && !this.getFjuFechaConocimiento().equals(instance.getFjuFechaConocimiento()))
            equalObjects = false;
        if (equalObjects && !this.getFjuAnoRecepcion().equals(instance.getFjuAnoRecepcion()))
            equalObjects = false;
        if (equalObjects && !this.getFjuFechaDeInicio().equals(instance.getFjuFechaDeInicio()))
            equalObjects = false;
        if (equalObjects && !this.getFjuFechaEmplaza().equals(instance.getFjuFechaEmplaza()))
            equalObjects = false;
        if (equalObjects && !this.getFjuParte().equals(instance.getFjuParte()))
            equalObjects = false;
        if (equalObjects && !this.getFjuNombreActDmtQuejoso().equals(instance.getFjuNombreActDmtQuejoso()))
            equalObjects = false;
        if (equalObjects && !this.getFjuDmtTerceroDemandado().equals(instance.getFjuDmtTerceroDemandado()))
            equalObjects = false;
        if (equalObjects && !this.getFjuTipoDeExp().equals(instance.getFjuTipoDeExp()))
            equalObjects = false;
        if (equalObjects && !this.getFjuExpediente().equals(instance.getFjuExpediente()))
            equalObjects = false;
        if (equalObjects && !this.getFjuFuero().equals(instance.getFjuFuero()))
            equalObjects = false;
        if (equalObjects && !this.getFjuJuzgado().equals(instance.getFjuJuzgado()))
            equalObjects = false;
        if (equalObjects && !this.getFjuTipoJuzgado().equals(instance.getFjuTipoJuzgado()))
            equalObjects = false;
        if (equalObjects && !this.getFjuTipoJuicio().equals(instance.getFjuTipoJuicio()))
            equalObjects = false;
        if (equalObjects && !this.getFjuEstado().equals(instance.getFjuEstado()))
            equalObjects = false;
        if (equalObjects && !this.getFjuLocalidad().equals(instance.getFjuLocalidad()))
            equalObjects = false;
        if (equalObjects && !this.getFjuPrestReclamadas().equals(instance.getFjuPrestReclamadas()))
            equalObjects = false;
        if (equalObjects && !this.getFjuCausales().equals(instance.getFjuCausales()))
            equalObjects = false;
        if (equalObjects && !this.getFjuRptProyectoMah1020().equals(instance.getFjuRptProyectoMah1020()))
            equalObjects = false;
        if (equalObjects && !this.getFjuEstatEdoProcJuicio().equals(instance.getFjuEstatEdoProcJuicio()))
            equalObjects = false;
        if (equalObjects && !this.getFjuDfsaACargoDe().equals(instance.getFjuDfsaACargoDe()))
            equalObjects = false;
        if (equalObjects && !this.getFjuObservGrals().equals(instance.getFjuObservGrals()))
            equalObjects = false;
        if (equalObjects && !this.getFjuDescripUltAct().equals(instance.getFjuDescripUltAct()))
            equalObjects = false;
        if (equalObjects && !this.getFjuFechaUltAct().equals(instance.getFjuFechaUltAct()))
            equalObjects = false;
        if (equalObjects && !this.getFjuImpDemandadoMxn().equals(instance.getFjuImpDemandadoMxn()))
            equalObjects = false;
        if (equalObjects && !this.getFjuImpDemandadoUsd().equals(instance.getFjuImpDemandadoUsd()))
            equalObjects = false;
        if (equalObjects && !this.getFjuCalifDeRiesgo().equals(instance.getFjuCalifDeRiesgo()))
            equalObjects = false;
        if (equalObjects && !this.getFjuComCalifDeRiesg().equals(instance.getFjuComCalifDeRiesg()))
            equalObjects = false;
        if (equalObjects && !this.getFjuEstrategia().equals(instance.getFjuEstrategia()))
            equalObjects = false;
        if (equalObjects && !this.getFjuOutstandingLitigation().equals(instance.getFjuOutstandingLitigation()))
            equalObjects = false;
        if (equalObjects && !this.getFjuFechaInfoDelClt().equals(instance.getFjuFechaInfoDelClt()))
            equalObjects = false;
        if (equalObjects && !this.getFjuFolioWf().equals(instance.getFjuFolioWf()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FjuJuicios result = new FjuJuicios();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFjuJuicio((String) objectData.getData("FJU_JUICIO"));
        result.setFjuNo((String) objectData.getData("FJU_NO"));
        result.setFjuFideicomiso((String) objectData.getData("FJU_FIDEICOMISO"));
        result.setFjuAno((String) objectData.getData("FJU_ANO"));
        result.setFjuMes((String) objectData.getData("FJU_MES"));
        result.setFjuFolioRdcl((String) objectData.getData("FJU_FOLIO_RDCL"));
        result.setFjuOrigNot((String) objectData.getData("FJU_ORIG_NOT"));
        result.setFjuAgregPor((String) objectData.getData("FJU_AGREG_POR"));
        result.setFjuFsoConPoder((String) objectData.getData("FJU_FSO_CON_PODER"));
        result.setFjuMaestro((String) objectData.getData("FJU_MAESTRO"));
        result.setFjuCobranza((String) objectData.getData("FJU_COBRANZA"));
        result.setFjuAdmonOPrestador((String) objectData.getData("FJU_ADMON_O_PRESTADOR"));
        result.setFjuTipoDeFid((String) objectData.getData("FJU_TIPO_DE_FID"));
        result.setFjuLtgNumero((String) objectData.getData("FJU_LTG_NUMERO"));
        result.setFjuCtlInt((String) objectData.getData("FJU_CTL_INT"));
        result.setFjuEstatus((String) objectData.getData("FJU_ESTATUS"));
        result.setFjuEstJuicioVigConcl((String) objectData.getData("FJU_EST_JUICIO_VIG_CONCL"));
        result.setFjuObservParaMesaDeCntrl((String) objectData.getData("FJU_OBSERV_PARA_MESA_DE_CNTRL"));
        result.setFjuFechaConocimiento((String) objectData.getData("FJU_FECHA_CONOCIMIENTO"));
        result.setFjuAnoRecepcion((String) objectData.getData("FJU_ANO_RECEPCION"));
        result.setFjuFechaDeInicio((String) objectData.getData("FJU_FECHA_DE_INICIO"));
        result.setFjuFechaEmplaza((String) objectData.getData("FJU_FECHA_EMPLAZA"));
        result.setFjuParte((String) objectData.getData("FJU_PARTE"));
        result.setFjuNombreActDmtQuejoso((String) objectData.getData("FJU_NOMBRE_ACT_DMT_QUEJOSO"));
        result.setFjuDmtTerceroDemandado((String) objectData.getData("FJU_DMT_TERCERO_DEMANDADO"));
        result.setFjuTipoDeExp((String) objectData.getData("FJU_TIPO_DE_EXP"));
        result.setFjuExpediente((String) objectData.getData("FJU_EXPEDIENTE"));
        result.setFjuFuero((String) objectData.getData("FJU_FUERO"));
        result.setFjuJuzgado((String) objectData.getData("FJU_JUZGADO"));
        result.setFjuTipoJuzgado((String) objectData.getData("FJU_TIPO_JUZGADO"));
        result.setFjuTipoJuicio((String) objectData.getData("FJU_TIPO_JUICIO"));
        result.setFjuEstado((String) objectData.getData("FJU_ESTADO"));
        result.setFjuLocalidad((String) objectData.getData("FJU_LOCALIDAD"));
        result.setFjuPrestReclamadas((String) objectData.getData("FJU_PREST_RECLAMADAS"));
        result.setFjuCausales((String) objectData.getData("FJU_CAUSALES"));
        result.setFjuRptProyectoMah1020((String) objectData.getData("FJU_RPT_PROYECTO_MAH1020"));
        result.setFjuEstatEdoProcJuicio((String) objectData.getData("FJU_ESTAT_EDO_PROC_JUICIO"));
        result.setFjuDfsaACargoDe((String) objectData.getData("FJU_DFSA_A_CARGO_DE"));
        result.setFjuObservGrals((String) objectData.getData("FJU_OBSERV_GRALS"));
        result.setFjuDescripUltAct((String) objectData.getData("FJU_DESCRIP_ULT_ACT"));
        result.setFjuFechaUltAct((String) objectData.getData("FJU_FECHA_ULT_ACT"));
        result.setFjuImpDemandadoMxn((String) objectData.getData("FJU_IMP_DEMANDADO_MXN"));
        result.setFjuImpDemandadoUsd((String) objectData.getData("FJU_IMP_DEMANDADO_USD"));
        result.setFjuCalifDeRiesgo((String) objectData.getData("FJU_CALIF_DE_RIESGO"));
        result.setFjuComCalifDeRiesg((String) objectData.getData("FJU_COM_CALIF_DE_RIESG"));
        result.setFjuEstrategia((String) objectData.getData("FJU_ESTRATEGIA"));
        result.setFjuOutstandingLitigation((String) objectData.getData("FJU_OUTSTANDING_LITIGATION"));
        result.setFjuFechaInfoDelClt((String) objectData.getData("FJU_FECHA_INFO_DEL_CLT"));
        result.setFjuFolioWf((BigDecimal) objectData.getData("FJU_FOLIO_WF"));
        return result;
    }
}
