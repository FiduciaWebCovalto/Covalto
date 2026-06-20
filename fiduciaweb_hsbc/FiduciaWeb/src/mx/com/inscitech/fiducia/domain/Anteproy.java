package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;

public class Anteproy extends DomainObject {
    
    String antFechaContrato = null;
    String antComentarios = null;
    String antFechaEscritura = null;
    BigDecimal antNumProspecto = null;
    String antFechaApertura = null;
    BigDecimal antNumPromotor = null;
    String antCveFormMan = null;
    String antCveTipoNeg = null;
    String antCveClasifPro = null;
    BigDecimal antNumProducto = null;
    BigDecimal antCveComite = null;
    BigDecimal antCveRevocable = null;
    BigDecimal antImpApertura = null;
    String antCveStProspec = null;
    String antDesGestion = null;
    String antFecGestion = null;
    String antPatrimonio = null;
    BigDecimal antNumAbogado = null;
    String antNomNegocio = null;
    String antCveSituacion = null;
    String antFecProConsti = null;
    String antNomActividad = null;
    String antTipoClient = null;
    String antTipoPublic = null;
    String antTipoContacto = null;
    String antNumEscritura = null;
    BigDecimal antNumNotario = null;
    String antTipoAdmon = null;
    BigDecimal antAnoConmod1 = null;
    BigDecimal antMesConmod1 = null;
    BigDecimal antDiaConmod1 = null;
    BigDecimal antAnoConmod2 = null;
    BigDecimal antMesConmod2 = null;
    BigDecimal antDiaConmod2 = null;
    BigDecimal antAnoConmod3 = null;
    BigDecimal antMesConmod3 = null;
    BigDecimal antDiaConmod3 = null;
    BigDecimal antNumContrato = null;
    String antSeguimiento = null;
    BigDecimal antTipoNegSat = null;
    String antMoneda = null;
    String antCveAreaInst = null;
    BigDecimal antArchivos = null;
    String antCveClasifSubPro = null;
    BigDecimal antNumAdmin = null;
    BigDecimal antUne = null;
    BigDecimal antOrigenRecursos = null;
    BigDecimal antDestinoRecursos = null;
    BigDecimal antIsntrumento = null;
    BigDecimal antServicioRelacionado = null;
    BigDecimal antKyc = null;
    String antProCliSpe = null;
    String antProCliMan = null;

    public Anteproy() {
        super();
        this.pkColumns = 8;
    }

    public void setAntFechaContrato(String antFechaContrato) {
        this.antFechaContrato = antFechaContrato;
    }

    public void setAntComentarios(String antComentarios) {
        this.antComentarios = antComentarios;
    }

    public void setAntFechaEscritura(String antFechaEscritura) {
        this.antFechaEscritura = antFechaEscritura;
    }

    public void setAntNumProspecto(BigDecimal antNumProspecto) {
        this.antNumProspecto = antNumProspecto;
    }

    public void setAntFechaApertura(String antFechaApertura) {
        this.antFechaApertura = antFechaApertura;
    }

    public void setAntNumPromotor(BigDecimal antNumPromotor) {
        this.antNumPromotor = antNumPromotor;
    }

    public void setAntCveFormMan(String antCveFormMan) {
        this.antCveFormMan = antCveFormMan;
    }

    public void setAntCveTipoNeg(String antCveTipoNeg) {
        this.antCveTipoNeg = antCveTipoNeg;
    }

    public void setAntCveClasifPro(String antCveClasifPro) {
        this.antCveClasifPro = antCveClasifPro;
    }

    public void setAntNumProducto(BigDecimal antNumProducto) {
        this.antNumProducto = antNumProducto;
    }

    public void setAntCveComite(BigDecimal antCveComite) {
        this.antCveComite = antCveComite;
    }

    public void setAntCveRevocable(BigDecimal antCveRevocable) {
        this.antCveRevocable = antCveRevocable;
    }

    public void setAntImpApertura(BigDecimal antImpApertura) {
        this.antImpApertura = antImpApertura;
    }

    public void setAntCveStProspec(String antCveStProspec) {
        this.antCveStProspec = antCveStProspec;
    }

    public void setAntDesGestion(String antDesGestion) {
        this.antDesGestion = antDesGestion;
    }

    public void setAntFecGestion(String antFecGestion) {
        this.antFecGestion = antFecGestion;
    }

    public void setAntPatrimonio(String antPatrimonio) {
        this.antPatrimonio = antPatrimonio;
    }

    public void setAntNumAbogado(BigDecimal antNumAbogado) {
        this.antNumAbogado = antNumAbogado;
    }

    public void setAntNomNegocio(String antNomNegocio) {
        this.antNomNegocio = antNomNegocio;
    }

    public void setAntCveSituacion(String antCveSituacion) {
        this.antCveSituacion = antCveSituacion;
    }

    public void setAntFecProConsti(String antFecProConsti) {
        this.antFecProConsti = antFecProConsti;
    }

    public void setAntNomActividad(String antNomActividad) {
        this.antNomActividad = antNomActividad;
    }

    public void setAntTipoClient(String antTipoClient) {
        this.antTipoClient = antTipoClient;
    }

    public void setAntTipoPublic(String antTipoPublic) {
        this.antTipoPublic = antTipoPublic;
    }

    public void setAntTipoContacto(String antTipoContacto) {
        this.antTipoContacto = antTipoContacto;
    }

    public void setAntNumEscritura(String antNumEscritura) {
        this.antNumEscritura = antNumEscritura;
    }

    public void setAntNumNotario(BigDecimal antNumNotario) {
        this.antNumNotario = antNumNotario;
    }

    public void setAntTipoAdmon(String antTipoAdmon) {
        this.antTipoAdmon = antTipoAdmon;
    }

    public void setAntAnoConmod1(BigDecimal antAnoConmod1) {
        this.antAnoConmod1 = antAnoConmod1;
    }

    public void setAntMesConmod1(BigDecimal antMesConmod1) {
        this.antMesConmod1 = antMesConmod1;
    }

    public void setAntDiaConmod1(BigDecimal antDiaConmod1) {
        this.antDiaConmod1 = antDiaConmod1;
    }

    public void setAntAnoConmod2(BigDecimal antAnoConmod2) {
        this.antAnoConmod2 = antAnoConmod2;
    }

    public void setAntMesConmod2(BigDecimal antMesConmod2) {
        this.antMesConmod2 = antMesConmod2;
    }

    public void setAntDiaConmod2(BigDecimal antDiaConmod2) {
        this.antDiaConmod2 = antDiaConmod2;
    }

    public void setAntAnoConmod3(BigDecimal antAnoConmod3) {
        this.antAnoConmod3 = antAnoConmod3;
    }

    public void setAntMesConmod3(BigDecimal antMesConmod3) {
        this.antMesConmod3 = antMesConmod3;
    }

    public void setAntDiaConmod3(BigDecimal antDiaConmod3) {
        this.antDiaConmod3 = antDiaConmod3;
    }

    public void setAntNumContrato(BigDecimal antNumContrato) {
        this.antNumContrato = antNumContrato;
    }

    public void setAntSeguimiento(String antSeguimiento) {
        this.antSeguimiento = antSeguimiento;
    }

    public void setAntTipoNegSat(BigDecimal antTipoNegSat) {
        this.antTipoNegSat = antTipoNegSat;
    }

    public void setAntMoneda(String antMoneda) {
        this.antMoneda = antMoneda;
    }

    public void setAntCveAreaInst(String antCveAreaInst) {
        this.antCveAreaInst = antCveAreaInst;
    }

    public void setAntArchivos(BigDecimal antArchivos) {
        this.antArchivos = antArchivos;
    }

    public void setAntCveClasifSubPro(String antCveClasifSubPro) {
        this.antCveClasifSubPro = antCveClasifSubPro;
    }

    public void setAntNumAdmin(BigDecimal antNumAdmin) {
        this.antNumAdmin = antNumAdmin;
    }

    public void setAntUne(BigDecimal antUne) {
        this.antUne = antUne;
    }

    public void setAntOrigenRecursos(BigDecimal antOrigenRecursos) {
        this.antOrigenRecursos = antOrigenRecursos;
    }

    public void setAntDestinoRecursos(BigDecimal antDestinoRecursos) {
        this.antDestinoRecursos = antDestinoRecursos;
    }

    public void setAntIsntrumento(BigDecimal antIsntrumento) {
        this.antIsntrumento = antIsntrumento;
    }

    public void setAntServicioRelacionado(BigDecimal antServicioRelacionado) {
        this.antServicioRelacionado = antServicioRelacionado;
    }

    public void setAntKyc(BigDecimal antKyc) {
        this.antKyc = antKyc;
    }

    public void setAntProCliSpe(String antProCliSpe) {
        this.antProCliSpe = antProCliSpe;
    }

    public void setAntProCliMan(String antProCliMan) {
        this.antProCliMan = antProCliMan;
    }

    public String getAntFechaContrato() {
        return this.antFechaContrato;
    }

    public String getAntComentarios() {
        return this.antComentarios;
    }

    public String getAntFechaEscritura() {
        return this.antFechaEscritura;
    }

    public BigDecimal getAntNumProspecto() {
        return this.antNumProspecto;
    }

    public String getAntFechaApertura() {
        return this.antFechaApertura;
    }

    public BigDecimal getAntNumPromotor() {
        return this.antNumPromotor;
    }

    public String getAntCveFormMan() {
        return this.antCveFormMan;
    }

    public String getAntCveTipoNeg() {
        return this.antCveTipoNeg;
    }

    public String getAntCveClasifPro() {
        return this.antCveClasifPro;
    }

    public BigDecimal getAntNumProducto() {
        return this.antNumProducto;
    }

    public BigDecimal getAntCveComite() {
        return this.antCveComite;
    }

    public BigDecimal getAntCveRevocable() {
        return this.antCveRevocable;
    }

    public BigDecimal getAntImpApertura() {
        return this.antImpApertura;
    }

    public String getAntCveStProspec() {
        return this.antCveStProspec;
    }

    public String getAntDesGestion() {
        return this.antDesGestion;
    }

    public String getAntFecGestion() {
        return this.antFecGestion;
    }

    public String getAntPatrimonio() {
        return this.antPatrimonio;
    }

    public BigDecimal getAntNumAbogado() {
        return this.antNumAbogado;
    }

    public String getAntNomNegocio() {
        return this.antNomNegocio;
    }

    public String getAntCveSituacion() {
        return this.antCveSituacion;
    }

    public String getAntFecProConsti() {
        return this.antFecProConsti;
    }

    public String getAntNomActividad() {
        return this.antNomActividad;
    }

    public String getAntTipoClient() {
        return this.antTipoClient;
    }

    public String getAntTipoPublic() {
        return this.antTipoPublic;
    }

    public String getAntTipoContacto() {
        return this.antTipoContacto;
    }

    public String getAntNumEscritura() {
        return this.antNumEscritura;
    }

    public BigDecimal getAntNumNotario() {
        return this.antNumNotario;
    }

    public String getAntTipoAdmon() {
        return this.antTipoAdmon;
    }

    public BigDecimal getAntAnoConmod1() {
        return this.antAnoConmod1;
    }

    public BigDecimal getAntMesConmod1() {
        return this.antMesConmod1;
    }

    public BigDecimal getAntDiaConmod1() {
        return this.antDiaConmod1;
    }

    public BigDecimal getAntAnoConmod2() {
        return this.antAnoConmod2;
    }

    public BigDecimal getAntMesConmod2() {
        return this.antMesConmod2;
    }

    public BigDecimal getAntDiaConmod2() {
        return this.antDiaConmod2;
    }

    public BigDecimal getAntAnoConmod3() {
        return this.antAnoConmod3;
    }

    public BigDecimal getAntMesConmod3() {
        return this.antMesConmod3;
    }

    public BigDecimal getAntDiaConmod3() {
        return this.antDiaConmod3;
    }

    public BigDecimal getAntNumContrato() {
        return this.antNumContrato;
    }

    public String getAntSeguimiento() {
        return this.antSeguimiento;
    }

    public BigDecimal getAntTipoNegSat() {
        return this.antTipoNegSat;
    }

    public String getAntMoneda() {
        return this.antMoneda;
    }

    public String getAntCveAreaInst() {
        return this.antCveAreaInst;
    }

    public BigDecimal getAntArchivos() {
        return this.antArchivos;
    }

    public String getAntCveClasifSubPro() {
        return this.antCveClasifSubPro;
    }

    public BigDecimal getAntNumAdmin() {
        return this.antNumAdmin;
    }

    public BigDecimal getAntUne() {
        return this.antUne;
    }

    public BigDecimal getAntOrigenRecursos() {
        return this.antOrigenRecursos;
    }

    public BigDecimal getAntDestinoRecursos() {
        return this.antDestinoRecursos;
    }

    public BigDecimal getAntIsntrumento() {
        return this.antIsntrumento;
    }

    public BigDecimal getAntServicioRelacionado() {
        return this.antServicioRelacionado;
    }

    public BigDecimal getAntKyc() {
        return this.antKyc;
    }

    public String getAntProCliSpe() {
        return this.antProCliSpe;
    }

    public String getAntProCliMan() {
        return this.antProCliMan;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM ANTEPROY ";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getAntNumProspecto() != null && this.getAntNumProspecto().longValue() == -999) {
            conditions += " AND ANT_NUM_PROSPECTO IS NULL";
        } else if (this.getAntNumProspecto() != null) {
            conditions += " AND ANT_NUM_PROSPECTO =?";
            values.add(this.getAntNumProspecto());
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
        String sql = "SELECT * FROM ANTEPROY ";
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
        String sql = "UPDATE ANTEPROY SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        fields += " ANT_FECHA_CONTRATO = ?, ";
        values.add(this.getAntFechaContrato());
        fields += " ANT_COMENTARIOS = ?, ";
        values.add(this.getAntComentarios());
        fields += " ANT_FECHA_ESCRITURA = ?, ";
        values.add(this.getAntFechaEscritura());
        conditions += " AND ANT_NUM_PROSPECTO = ?";
        pkValues.add(this.getAntNumProspecto());
        fields += " ANT_FECHA_APERTURA = ?, ";
        values.add(this.getAntFechaApertura());
        fields += " ANT_NUM_PROMOTOR = ?, ";
        values.add(this.getAntNumPromotor());
        fields += " ANT_CVE_FORM_MAN = ?, ";
        values.add(this.getAntCveFormMan());
        fields += " ANT_CVE_TIPO_NEG = ?, ";
        values.add(this.getAntCveTipoNeg());
        fields += " ANT_CVE_CLASIF_PRO = ?, ";
        values.add(this.getAntCveClasifPro());
        fields += " ANT_NUM_PRODUCTO = ?, ";
        values.add(this.getAntNumProducto());
        fields += " ANT_CVE_COMITE = ?, ";
        values.add(this.getAntCveComite());
        fields += " ANT_CVE_REVOCABLE = ?, ";
        values.add(this.getAntCveRevocable());
        fields += " ANT_IMP_APERTURA = ?, ";
        values.add(this.getAntImpApertura());
        fields += " ANT_CVE_ST_PROSPEC = ?, ";
        values.add(this.getAntCveStProspec());
        fields += " ANT_DES_GESTION = ?, ";
        values.add(this.getAntDesGestion());
        fields += " ANT_FEC_GESTION = ?, ";
        values.add(this.getAntFecGestion());
        fields += " ANT_PATRIMONIO = ?, ";
        values.add(this.getAntPatrimonio());
        fields += " ANT_NUM_ABOGADO = ?, ";
        values.add(this.getAntNumAbogado());
        fields += " ANT_NOM_NEGOCIO = ?, ";
        values.add(this.getAntNomNegocio());
        fields += " ANT_CVE_SITUACION = ?, ";
        values.add(this.getAntCveSituacion());
        fields += " ANT_FEC_PRO_CONSTI = ?, ";
        values.add(this.getAntFecProConsti());
        fields += " ANT_NOM_ACTIVIDAD = ?, ";
        values.add(this.getAntNomActividad());
        fields += " ANT_TIPO_CLIENT = ?, ";
        values.add(this.getAntTipoClient());
        fields += " ANT_TIPO_PUBLIC = ?, ";
        values.add(this.getAntTipoPublic());
        fields += " ANT_TIPO_CONTACTO = ?, ";
        values.add(this.getAntTipoContacto());
        fields += " ANT_NUM_ESCRITURA = ?, ";
        values.add(this.getAntNumEscritura());
        fields += " ANT_NUM_NOTARIO = ?, ";
        values.add(this.getAntNumNotario());
        fields += " ANT_TIPO_ADMON = ?, ";
        values.add(this.getAntTipoAdmon());
        fields += " ANT_ANO_CONMOD1 = ?, ";
        values.add(this.getAntAnoConmod1());
        fields += " ANT_MES_CONMOD1 = ?, ";
        values.add(this.getAntMesConmod1());
        fields += " ANT_DIA_CONMOD1 = ?, ";
        values.add(this.getAntDiaConmod1());
        fields += " ANT_ANO_CONMOD2 = ?, ";
        values.add(this.getAntAnoConmod2());
        fields += " ANT_MES_CONMOD2 = ?, ";
        values.add(this.getAntMesConmod2());
        fields += " ANT_DIA_CONMOD2 = ?, ";
        values.add(this.getAntDiaConmod2());
        fields += " ANT_ANO_CONMOD3 = ?, ";
        values.add(this.getAntAnoConmod3());
        fields += " ANT_MES_CONMOD3 = ?, ";
        values.add(this.getAntMesConmod3());
        fields += " ANT_DIA_CONMOD3 = ?, ";
        values.add(this.getAntDiaConmod3());
        fields += " ANT_NUM_CONTRATO = ?, ";
        values.add(this.getAntNumContrato());
        fields += " ANT_SEGUIMIENTO = ?, ";
        values.add(this.getAntSeguimiento());
        fields += " ANT_TIPO_NEG_SAT = ?, ";
        values.add(this.getAntTipoNegSat());
        fields += " ANT_MONEDA = ?, ";
        values.add(this.getAntMoneda());
        fields += " ANT_CVE_AREA_INST = ?, ";
        values.add(this.getAntCveAreaInst());
        fields += " ANT_ARCHIVOS = ?, ";
        values.add(this.getAntArchivos());
        fields += " ANT_CVE_CLASIF_SUB_PRO = ?, ";
        values.add(this.getAntCveClasifSubPro());
        fields += " ANT_NUM_ADMIN = ?, ";
        values.add(this.getAntNumAdmin());
        fields += " ANT_UNE = ?, ";
        values.add(this.getAntUne());
        fields += " ANT_ORIGEN_RECURSOS = ?, ";
        values.add(this.getAntOrigenRecursos());
        fields += " ANT_DESTINO_RECURSOS = ?, ";
        values.add(this.getAntDestinoRecursos());
        fields += " ANT_ISNTRUMENTO = ?, ";
        values.add(this.getAntIsntrumento());
        fields += " ANT_SERVICIO_RELACIONADO = ?, ";
        values.add(this.getAntServicioRelacionado());
        fields += " ANT_KYC = ?, ";
        values.add(this.getAntKyc());
        fields += " ANT_PRO_CLI_SPE = ?, ";
        values.add(this.getAntProCliSpe());
        fields += " ANT_PRO_CLI_MAN = ?, ";
        values.add(this.getAntProCliMan());
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
        String sql = "INSERT INTO ANTEPROY ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",ANT_FECHA_CONTRATO ";
        fieldValues += ", ?";
        values.add(this.getAntFechaContrato());
        fields += ",ANT_COMENTARIOS ";
        fieldValues += ", ?";
        values.add(this.getAntComentarios());
        fields += ",ANT_FECHA_ESCRITURA ";
        fieldValues += ", ?";
        values.add(this.getAntFechaEscritura());
        fields += ",ANT_NUM_PROSPECTO ";
        fieldValues += ", ?";
        values.add(this.getAntNumProspecto());
        fields += ",ANT_FECHA_APERTURA ";
        fieldValues += ", ?";
        values.add(this.getAntFechaApertura());
        fields += ",ANT_NUM_PROMOTOR ";
        fieldValues += ", ?";
        values.add(this.getAntNumPromotor());
        fields += ",ANT_CVE_FORM_MAN ";
        fieldValues += ", ?";
        values.add(this.getAntCveFormMan());
        fields += ",ANT_CVE_TIPO_NEG ";
        fieldValues += ", ?";
        values.add(this.getAntCveTipoNeg());
        fields += ",ANT_CVE_CLASIF_PRO ";
        fieldValues += ", ?";
        values.add(this.getAntCveClasifPro());
        fields += ",ANT_NUM_PRODUCTO ";
        fieldValues += ", ?";
        values.add(this.getAntNumProducto());
        fields += ",ANT_CVE_COMITE ";
        fieldValues += ", ?";
        values.add(this.getAntCveComite());
        fields += ",ANT_CVE_REVOCABLE ";
        fieldValues += ", ?";
        values.add(this.getAntCveRevocable());
        fields += ",ANT_IMP_APERTURA ";
        fieldValues += ", ?";
        values.add(this.getAntImpApertura());
        fields += ",ANT_CVE_ST_PROSPEC ";
        fieldValues += ", ?";
        values.add(this.getAntCveStProspec());
        fields += ",ANT_DES_GESTION ";
        fieldValues += ", ?";
        values.add(this.getAntDesGestion());
        fields += ",ANT_FEC_GESTION ";
        fieldValues += ", ?";
        values.add(this.getAntFecGestion());
        fields += ",ANT_PATRIMONIO ";
        fieldValues += ", ?";
        values.add(this.getAntPatrimonio());
        fields += ",ANT_NUM_ABOGADO ";
        fieldValues += ", ?";
        values.add(this.getAntNumAbogado());
        fields += ",ANT_NOM_NEGOCIO ";
        fieldValues += ", ?";
        values.add(this.getAntNomNegocio());
        fields += ",ANT_CVE_SITUACION ";
        fieldValues += ", ?";
        values.add(this.getAntCveSituacion());
        fields += ",ANT_FEC_PRO_CONSTI ";
        fieldValues += ", ?";
        values.add(this.getAntFecProConsti());
        fields += ",ANT_NOM_ACTIVIDAD ";
        fieldValues += ", ?";
        values.add(this.getAntNomActividad());
        fields += ",ANT_TIPO_CLIENT ";
        fieldValues += ", ?";
        values.add(this.getAntTipoClient());
        fields += ",ANT_TIPO_PUBLIC ";
        fieldValues += ", ?";
        values.add(this.getAntTipoPublic());
        fields += ",ANT_TIPO_CONTACTO ";
        fieldValues += ", ?";
        values.add(this.getAntTipoContacto());
        fields += ",ANT_NUM_ESCRITURA ";
        fieldValues += ", ?";
        values.add(this.getAntNumEscritura());
        fields += ",ANT_NUM_NOTARIO ";
        fieldValues += ", ?";
        values.add(this.getAntNumNotario());
        fields += ",ANT_TIPO_ADMON ";
        fieldValues += ", ?";
        values.add(this.getAntTipoAdmon());
        fields += ",ANT_ANO_CONMOD1 ";
        fieldValues += ", ?";
        values.add(this.getAntAnoConmod1());
        fields += ",ANT_MES_CONMOD1 ";
        fieldValues += ", ?";
        values.add(this.getAntMesConmod1());
        fields += ",ANT_DIA_CONMOD1 ";
        fieldValues += ", ?";
        values.add(this.getAntDiaConmod1());
        fields += ",ANT_ANO_CONMOD2 ";
        fieldValues += ", ?";
        values.add(this.getAntAnoConmod2());
        fields += ",ANT_MES_CONMOD2 ";
        fieldValues += ", ?";
        values.add(this.getAntMesConmod2());
        fields += ",ANT_DIA_CONMOD2 ";
        fieldValues += ", ?";
        values.add(this.getAntDiaConmod2());
        fields += ",ANT_ANO_CONMOD3 ";
        fieldValues += ", ?";
        values.add(this.getAntAnoConmod3());
        fields += ",ANT_MES_CONMOD3 ";
        fieldValues += ", ?";
        values.add(this.getAntMesConmod3());
        fields += ",ANT_DIA_CONMOD3 ";
        fieldValues += ", ?";
        values.add(this.getAntDiaConmod3());
        fields += ",ANT_NUM_CONTRATO ";
        fieldValues += ", ?";
        values.add(this.getAntNumContrato());
        fields += ",ANT_SEGUIMIENTO ";
        fieldValues += ", ?";
        values.add(this.getAntSeguimiento());
        fields += ",ANT_TIPO_NEG_SAT ";
        fieldValues += ", ?";
        values.add(this.getAntTipoNegSat());
        fields += ",ANT_MONEDA ";
        fieldValues += ", ?";
        values.add(this.getAntMoneda());
        fields += ",ANT_CVE_AREA_INST ";
        fieldValues += ", ?";
        values.add(this.getAntCveAreaInst());
        fields += ",ANT_ARCHIVOS ";
        fieldValues += ", ?";
        values.add(this.getAntArchivos());
        fields += ",ANT_CVE_CLASIF_SUB_PRO ";
        fieldValues += ", ?";
        values.add(this.getAntCveClasifSubPro());
        fields += ",ANT_NUM_ADMIN ";
        fieldValues += ", ?";
        values.add(this.getAntNumAdmin());
        fields += ",ANT_UNE ";
        fieldValues += ", ?";
        values.add(this.getAntUne());
        fields += ",ANT_ORIGEN_RECURSOS ";
        fieldValues += ", ?";
        values.add(this.getAntOrigenRecursos());
        fields += ",ANT_DESTINO_RECURSOS ";
        fieldValues += ", ?";
        values.add(this.getAntDestinoRecursos());
        fields += ",ANT_ISNTRUMENTO ";
        fieldValues += ", ?";
        values.add(this.getAntIsntrumento());
        fields += ",ANT_SERVICIO_RELACIONADO ";
        fieldValues += ", ?";
        values.add(this.getAntServicioRelacionado());
        fields += ",ANT_KYC ";
        fieldValues += ", ?";
        values.add(this.getAntKyc());
        fields += ",ANT_PRO_CLI_SPE ";
        fieldValues += ", ?";
        values.add(this.getAntProCliSpe());
        fields += ",ANT_PRO_CLI_MAN ";
        fieldValues += ", ?";
        values.add(this.getAntProCliMan());
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
        String sql = "DELETE FROM ANTEPROY WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND ANT_NUM_PROSPECTO = ?";
        values.add(this.getAntNumProspecto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Anteproy instance = (Anteproy) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getAntFechaContrato().equals(instance.getAntFechaContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAntComentarios().equals(instance.getAntComentarios()))
            equalObjects = false;
        if (equalObjects && !this.getAntFechaEscritura().equals(instance.getAntFechaEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumProspecto().equals(instance.getAntNumProspecto()))
            equalObjects = false;
        if (equalObjects && !this.getAntFechaApertura().equals(instance.getAntFechaApertura()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumPromotor().equals(instance.getAntNumPromotor()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveFormMan().equals(instance.getAntCveFormMan()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveTipoNeg().equals(instance.getAntCveTipoNeg()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveClasifPro().equals(instance.getAntCveClasifPro()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumProducto().equals(instance.getAntNumProducto()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveComite().equals(instance.getAntCveComite()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveRevocable().equals(instance.getAntCveRevocable()))
            equalObjects = false;
        if (equalObjects && !this.getAntImpApertura().equals(instance.getAntImpApertura()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveStProspec().equals(instance.getAntCveStProspec()))
            equalObjects = false;
        if (equalObjects && !this.getAntDesGestion().equals(instance.getAntDesGestion()))
            equalObjects = false;
        if (equalObjects && !this.getAntFecGestion().equals(instance.getAntFecGestion()))
            equalObjects = false;
        if (equalObjects && !this.getAntPatrimonio().equals(instance.getAntPatrimonio()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumAbogado().equals(instance.getAntNumAbogado()))
            equalObjects = false;
        if (equalObjects && !this.getAntNomNegocio().equals(instance.getAntNomNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveSituacion().equals(instance.getAntCveSituacion()))
            equalObjects = false;
        if (equalObjects && !this.getAntFecProConsti().equals(instance.getAntFecProConsti()))
            equalObjects = false;
        if (equalObjects && !this.getAntNomActividad().equals(instance.getAntNomActividad()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoClient().equals(instance.getAntTipoClient()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoPublic().equals(instance.getAntTipoPublic()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoContacto().equals(instance.getAntTipoContacto()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumEscritura().equals(instance.getAntNumEscritura()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumNotario().equals(instance.getAntNumNotario()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoAdmon().equals(instance.getAntTipoAdmon()))
            equalObjects = false;
        if (equalObjects && !this.getAntAnoConmod1().equals(instance.getAntAnoConmod1()))
            equalObjects = false;
        if (equalObjects && !this.getAntMesConmod1().equals(instance.getAntMesConmod1()))
            equalObjects = false;
        if (equalObjects && !this.getAntDiaConmod1().equals(instance.getAntDiaConmod1()))
            equalObjects = false;
        if (equalObjects && !this.getAntAnoConmod2().equals(instance.getAntAnoConmod2()))
            equalObjects = false;
        if (equalObjects && !this.getAntMesConmod2().equals(instance.getAntMesConmod2()))
            equalObjects = false;
        if (equalObjects && !this.getAntDiaConmod2().equals(instance.getAntDiaConmod2()))
            equalObjects = false;
        if (equalObjects && !this.getAntAnoConmod3().equals(instance.getAntAnoConmod3()))
            equalObjects = false;
        if (equalObjects && !this.getAntMesConmod3().equals(instance.getAntMesConmod3()))
            equalObjects = false;
        if (equalObjects && !this.getAntDiaConmod3().equals(instance.getAntDiaConmod3()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumContrato().equals(instance.getAntNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getAntSeguimiento().equals(instance.getAntSeguimiento()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoNegSat().equals(instance.getAntTipoNegSat()))
            equalObjects = false;
        if (equalObjects && !this.getAntMoneda().equals(instance.getAntMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveAreaInst().equals(instance.getAntCveAreaInst()))
            equalObjects = false;
        if (equalObjects && !this.getAntArchivos().equals(instance.getAntArchivos()))
            equalObjects = false;
        if (equalObjects && !this.getAntCveClasifSubPro().equals(instance.getAntCveClasifSubPro()))
            equalObjects = false;
        if (equalObjects && !this.getAntNumAdmin().equals(instance.getAntNumAdmin()))
            equalObjects = false;
        if (equalObjects && !this.getAntUne().equals(instance.getAntUne()))
            equalObjects = false;
        if (equalObjects && !this.getAntOrigenRecursos().equals(instance.getAntOrigenRecursos()))
            equalObjects = false;
        if (equalObjects && !this.getAntDestinoRecursos().equals(instance.getAntDestinoRecursos()))
            equalObjects = false;
        if (equalObjects && !this.getAntIsntrumento().equals(instance.getAntIsntrumento()))
            equalObjects = false;
        if (equalObjects && !this.getAntServicioRelacionado().equals(instance.getAntServicioRelacionado()))
            equalObjects = false;
        if (equalObjects && !this.getAntKyc().equals(instance.getAntKyc()))
            equalObjects = false;
        if (equalObjects && !this.getAntProCliSpe().equals(instance.getAntProCliSpe()))
            equalObjects = false;
        if (equalObjects && !this.getAntProCliMan().equals(instance.getAntProCliMan()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Anteproy result = new Anteproy();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setAntFechaContrato((String) objectData.getData("ANT_FECHA_CONTRATO"));
        result.setAntComentarios((String) objectData.getData("ANT_COMENTARIOS"));
        result.setAntFechaEscritura((String) objectData.getData("ANT_FECHA_ESCRITURA"));
        result.setAntNumProspecto((BigDecimal) objectData.getData("ANT_NUM_PROSPECTO"));
        result.setAntFechaApertura((String) objectData.getData("ANT_FECHA_APERTURA"));
        result.setAntNumPromotor((BigDecimal) objectData.getData("ANT_NUM_PROMOTOR"));
        result.setAntCveFormMan((String) objectData.getData("ANT_CVE_FORM_MAN"));
        result.setAntCveTipoNeg((String) objectData.getData("ANT_CVE_TIPO_NEG"));
        result.setAntCveClasifPro((String) objectData.getData("ANT_CVE_CLASIF_PRO"));
        result.setAntNumProducto((BigDecimal) objectData.getData("ANT_NUM_PRODUCTO"));
        result.setAntCveComite((BigDecimal) objectData.getData("ANT_CVE_COMITE"));
        result.setAntCveRevocable((BigDecimal) objectData.getData("ANT_CVE_REVOCABLE"));
        result.setAntImpApertura((BigDecimal) objectData.getData("ANT_IMP_APERTURA"));
        result.setAntCveStProspec((String) objectData.getData("ANT_CVE_ST_PROSPEC"));
        result.setAntDesGestion((String) objectData.getData("ANT_DES_GESTION"));
        result.setAntFecGestion((String) objectData.getData("ANT_FEC_GESTION"));
        result.setAntPatrimonio((String) objectData.getData("ANT_PATRIMONIO"));
        result.setAntNumAbogado((BigDecimal) objectData.getData("ANT_NUM_ABOGADO"));
        result.setAntNomNegocio((String) objectData.getData("ANT_NOM_NEGOCIO"));
        result.setAntCveSituacion((String) objectData.getData("ANT_CVE_SITUACION"));
        result.setAntFecProConsti((String) objectData.getData("ANT_FEC_PRO_CONSTI"));
        result.setAntNomActividad((String) objectData.getData("ANT_NOM_ACTIVIDAD"));
        result.setAntTipoClient((String) objectData.getData("ANT_TIPO_CLIENT"));
        result.setAntTipoPublic((String) objectData.getData("ANT_TIPO_PUBLIC"));
        result.setAntTipoContacto((String) objectData.getData("ANT_TIPO_CONTACTO"));
        result.setAntNumEscritura((String) objectData.getData("ANT_NUM_ESCRITURA"));
        result.setAntNumNotario((BigDecimal) objectData.getData("ANT_NUM_NOTARIO"));
        result.setAntTipoAdmon((String) objectData.getData("ANT_TIPO_ADMON"));
        result.setAntAnoConmod1((BigDecimal) objectData.getData("ANT_ANO_CONMOD1"));
        result.setAntMesConmod1((BigDecimal) objectData.getData("ANT_MES_CONMOD1"));
        result.setAntDiaConmod1((BigDecimal) objectData.getData("ANT_DIA_CONMOD1"));
        result.setAntAnoConmod2((BigDecimal) objectData.getData("ANT_ANO_CONMOD2"));
        result.setAntMesConmod2((BigDecimal) objectData.getData("ANT_MES_CONMOD2"));
        result.setAntDiaConmod2((BigDecimal) objectData.getData("ANT_DIA_CONMOD2"));
        result.setAntAnoConmod3((BigDecimal) objectData.getData("ANT_ANO_CONMOD3"));
        result.setAntMesConmod3((BigDecimal) objectData.getData("ANT_MES_CONMOD3"));
        result.setAntDiaConmod3((BigDecimal) objectData.getData("ANT_DIA_CONMOD3"));
        result.setAntNumContrato((BigDecimal) objectData.getData("ANT_NUM_CONTRATO"));
        result.setAntSeguimiento((String) objectData.getData("ANT_SEGUIMIENTO"));
        result.setAntTipoNegSat((BigDecimal) objectData.getData("ANT_TIPO_NEG_SAT"));
        result.setAntMoneda((String) objectData.getData("ANT_MONEDA"));
        result.setAntCveAreaInst((String) objectData.getData("ANT_CVE_AREA_INST"));
        result.setAntArchivos((BigDecimal) objectData.getData("ANT_ARCHIVOS"));
        result.setAntCveClasifSubPro((String) objectData.getData("ANT_CVE_CLASIF_SUB_PRO"));
        result.setAntNumAdmin((BigDecimal) objectData.getData("ANT_NUM_ADMIN"));
        result.setAntUne((BigDecimal) objectData.getData("ANT_UNE"));
        result.setAntOrigenRecursos((BigDecimal) objectData.getData("ANT_ORIGEN_RECURSOS"));
        result.setAntDestinoRecursos((BigDecimal) objectData.getData("ANT_DESTINO_RECURSOS"));
        result.setAntIsntrumento((BigDecimal) objectData.getData("ANT_ISNTRUMENTO"));
        result.setAntServicioRelacionado((BigDecimal) objectData.getData("ANT_SERVICIO_RELACIONADO"));
        result.setAntKyc((BigDecimal) objectData.getData("ANT_KYC"));
        result.setAntProCliSpe((String) objectData.getData("ANT_PRO_CLI_SPE"));
        result.setAntProCliMan((String) objectData.getData("ANT_PRO_CLI_MAN"));
        return result;
    }
}