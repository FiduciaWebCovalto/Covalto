package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CONTRATOH_PK", columns = { "CTO_NUM_CONTRATO" }, sequences = { "MAX" })
public class Contratoh extends DomainObject {

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
    String ctoTipoCont = null;
    String ctoEstInterfid = null;
    BigDecimal antTipoNegSat = null;

    public Contratoh() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumContrato(BigDecimal ctoNumContrato) {
        this.ctoNumContrato = ctoNumContrato;
    }

    public BigDecimal getCtoNumContrato() {
        return this.ctoNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumCliente(BigDecimal ctoNumCliente) {
        this.ctoNumCliente = ctoNumCliente;
    }

    public BigDecimal getCtoNumCliente() {
        return this.ctoNumCliente;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumCtoEje(BigDecimal ctoNumCtoEje) {
        this.ctoNumCtoEje = ctoNumCtoEje;
    }

    public BigDecimal getCtoNumCtoEje() {
        return this.ctoNumCtoEje;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoCveTipoNeg(String ctoCveTipoNeg) {
        this.ctoCveTipoNeg = ctoCveTipoNeg;
    }

    public String getCtoCveTipoNeg() {
        return this.ctoCveTipoNeg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoCveClasProd(String ctoCveClasProd) {
        this.ctoCveClasProd = ctoCveClasProd;
    }

    public String getCtoCveClasProd() {
        return this.ctoCveClasProd;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumProducto(BigDecimal ctoNumProducto) {
        this.ctoNumProducto = ctoNumProducto;
    }

    public BigDecimal getCtoNumProducto() {
        return this.ctoNumProducto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoNomContrato(String ctoNomContrato) {
        this.ctoNomContrato = ctoNomContrato;
    }

    public String getCtoNomContrato() {
        return this.ctoNomContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoCveFormaMan(String ctoCveFormaMan) {
        this.ctoCveFormaMan = ctoCveFormaMan;
    }

    public String getCtoCveFormaMan() {
        return this.ctoCveFormaMan;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoCveTipoPer(String ctoCveTipoPer) {
        this.ctoCveTipoPer = ctoCveTipoPer;
    }

    public String getCtoCveTipoPer() {
        return this.ctoCveTipoPer;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoCveRetencion(String ctoCveRetencion) {
        this.ctoCveRetencion = ctoCveRetencion;
    }

    public String getCtoCveRetencion() {
        return this.ctoCveRetencion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoCveComiteTec(BigDecimal ctoCveComiteTec) {
        this.ctoCveComiteTec = ctoCveComiteTec;
    }

    public BigDecimal getCtoCveComiteTec() {
        return this.ctoCveComiteTec;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoCveArt28(BigDecimal ctoCveArt28) {
        this.ctoCveArt28 = ctoCveArt28;
    }

    public BigDecimal getCtoCveArt28() {
        return this.ctoCveArt28;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoCveExclu30(BigDecimal ctoCveExclu30) {
        this.ctoCveExclu30 = ctoCveExclu30;
    }

    public BigDecimal getCtoCveExclu30() {
        return this.ctoCveExclu30;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoCveMonExt(BigDecimal ctoCveMonExt) {
        this.ctoCveMonExt = ctoCveMonExt;
    }

    public BigDecimal getCtoCveMonExt() {
        return this.ctoCveMonExt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoCveRevocable(BigDecimal ctoCveRevocable) {
        this.ctoCveRevocable = ctoCveRevocable;
    }

    public BigDecimal getCtoCveRevocable() {
        return this.ctoCveRevocable;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoCveRepProd(BigDecimal ctoCveRepProd) {
        this.ctoCveRepProd = ctoCveRepProd;
    }

    public BigDecimal getCtoCveRepProd() {
        return this.ctoCveRepProd;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoNumOficioExe(String ctoNumOficioExe) {
        this.ctoNumOficioExe = ctoNumOficioExe;
    }

    public String getCtoNumOficioExe() {
        return this.ctoNumOficioExe;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoRegNalInvEx(String ctoRegNalInvEx) {
        this.ctoRegNalInvEx = ctoRegNalInvEx;
    }

    public String getCtoRegNalInvEx() {
        return this.ctoRegNalInvEx;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoAnoApertura(BigDecimal ctoAnoApertura) {
        this.ctoAnoApertura = ctoAnoApertura;
    }

    public BigDecimal getCtoAnoApertura() {
        return this.ctoAnoApertura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoMesApertura(BigDecimal ctoMesApertura) {
        this.ctoMesApertura = ctoMesApertura;
    }

    public BigDecimal getCtoMesApertura() {
        return this.ctoMesApertura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoDiaApertura(BigDecimal ctoDiaApertura) {
        this.ctoDiaApertura = ctoDiaApertura;
    }

    public BigDecimal getCtoDiaApertura() {
        return this.ctoDiaApertura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoAnoVencim(BigDecimal ctoAnoVencim) {
        this.ctoAnoVencim = ctoAnoVencim;
    }

    public BigDecimal getCtoAnoVencim() {
        return this.ctoAnoVencim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoMesVencim(BigDecimal ctoMesVencim) {
        this.ctoMesVencim = ctoMesVencim;
    }

    public BigDecimal getCtoMesVencim() {
        return this.ctoMesVencim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoDiaVencim(BigDecimal ctoDiaVencim) {
        this.ctoDiaVencim = ctoDiaVencim;
    }

    public BigDecimal getCtoDiaVencim() {
        return this.ctoDiaVencim;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoAnoAnivers(BigDecimal ctoAnoAnivers) {
        this.ctoAnoAnivers = ctoAnoAnivers;
    }

    public BigDecimal getCtoAnoAnivers() {
        return this.ctoAnoAnivers;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoMesAnivers(BigDecimal ctoMesAnivers) {
        this.ctoMesAnivers = ctoMesAnivers;
    }

    public BigDecimal getCtoMesAnivers() {
        return this.ctoMesAnivers;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoDiaAnivers(BigDecimal ctoDiaAnivers) {
        this.ctoDiaAnivers = ctoDiaAnivers;
    }

    public BigDecimal getCtoDiaAnivers() {
        return this.ctoDiaAnivers;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoAnoCancela(BigDecimal ctoAnoCancela) {
        this.ctoAnoCancela = ctoAnoCancela;
    }

    public BigDecimal getCtoAnoCancela() {
        return this.ctoAnoCancela;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoMesCancela(BigDecimal ctoMesCancela) {
        this.ctoMesCancela = ctoMesCancela;
    }

    public BigDecimal getCtoMesCancela() {
        return this.ctoMesCancela;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoDiaCancela(BigDecimal ctoDiaCancela) {
        this.ctoDiaCancela = ctoDiaCancela;
    }

    public BigDecimal getCtoDiaCancela() {
        return this.ctoDiaCancela;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoFecInscRnie(String ctoFecInscRnie) {
        this.ctoFecInscRnie = ctoFecInscRnie;
    }

    public String getCtoFecInscRnie() {
        return this.ctoFecInscRnie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoAnoAltaReg(BigDecimal ctoAnoAltaReg) {
        this.ctoAnoAltaReg = ctoAnoAltaReg;
    }

    public BigDecimal getCtoAnoAltaReg() {
        return this.ctoAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoMesAltaReg(BigDecimal ctoMesAltaReg) {
        this.ctoMesAltaReg = ctoMesAltaReg;
    }

    public BigDecimal getCtoMesAltaReg() {
        return this.ctoMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoDiaAltaReg(BigDecimal ctoDiaAltaReg) {
        this.ctoDiaAltaReg = ctoDiaAltaReg;
    }

    public BigDecimal getCtoDiaAltaReg() {
        return this.ctoDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoAnoUltMod(BigDecimal ctoAnoUltMod) {
        this.ctoAnoUltMod = ctoAnoUltMod;
    }

    public BigDecimal getCtoAnoUltMod() {
        return this.ctoAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoMesUltMod(BigDecimal ctoMesUltMod) {
        this.ctoMesUltMod = ctoMesUltMod;
    }

    public BigDecimal getCtoMesUltMod() {
        return this.ctoMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoDiaUltMod(BigDecimal ctoDiaUltMod) {
        this.ctoDiaUltMod = ctoDiaUltMod;
    }

    public BigDecimal getCtoDiaUltMod() {
        return this.ctoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoCveStContrat(String ctoCveStContrat) {
        this.ctoCveStContrat = ctoCveStContrat;
    }

    public String getCtoCveStContrat() {
        return this.ctoCveStContrat;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCtoCveSubcto(BigDecimal ctoCveSubcto) {
        this.ctoCveSubcto = ctoCveSubcto;
    }

    public BigDecimal getCtoCveSubcto() {
        return this.ctoCveSubcto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNivel1(BigDecimal ctoNumNivel1) {
        this.ctoNumNivel1 = ctoNumNivel1;
    }

    public BigDecimal getCtoNumNivel1() {
        return this.ctoNumNivel1;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNivel2(BigDecimal ctoNumNivel2) {
        this.ctoNumNivel2 = ctoNumNivel2;
    }

    public BigDecimal getCtoNumNivel2() {
        return this.ctoNumNivel2;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNivel3(BigDecimal ctoNumNivel3) {
        this.ctoNumNivel3 = ctoNumNivel3;
    }

    public BigDecimal getCtoNumNivel3() {
        return this.ctoNumNivel3;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNivel4(BigDecimal ctoNumNivel4) {
        this.ctoNumNivel4 = ctoNumNivel4;
    }

    public BigDecimal getCtoNumNivel4() {
        return this.ctoNumNivel4;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNivel5(BigDecimal ctoNumNivel5) {
        this.ctoNumNivel5 = ctoNumNivel5;
    }

    public BigDecimal getCtoNumNivel5() {
        return this.ctoNumNivel5;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoRegShcp(String ctoRegShcp) {
        this.ctoRegShcp = ctoRegShcp;
    }

    public String getCtoRegShcp() {
        return this.ctoRegShcp;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoCveShcp(BigDecimal ctoCveShcp) {
        this.ctoCveShcp = ctoCveShcp;
    }

    public BigDecimal getCtoCveShcp() {
        return this.ctoCveShcp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoRegGobdf(String ctoRegGobdf) {
        this.ctoRegGobdf = ctoRegGobdf;
    }

    public String getCtoRegGobdf() {
        return this.ctoRegGobdf;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCtoCveGobdf(BigDecimal ctoCveGobdf) {
        this.ctoCveGobdf = ctoCveGobdf;
    }

    public BigDecimal getCtoCveGobdf() {
        return this.ctoCveGobdf;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoRama(BigDecimal ctoRama) {
        this.ctoRama = ctoRama;
    }

    public BigDecimal getCtoRama() {
        return this.ctoRama;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoSubRama(BigDecimal ctoSubRama) {
        this.ctoSubRama = ctoSubRama;
    }

    public BigDecimal getCtoSubRama() {
        return this.ctoSubRama;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoNomActividad(String ctoNomActividad) {
        this.ctoNomActividad = ctoNomActividad;
    }

    public String getCtoNomActividad() {
        return this.ctoNomActividad;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoTipoClient(String ctoTipoClient) {
        this.ctoTipoClient = ctoTipoClient;
    }

    public String getCtoTipoClient() {
        return this.ctoTipoClient;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoTipoPublic(String ctoTipoPublic) {
        this.ctoTipoPublic = ctoTipoPublic;
    }

    public String getCtoTipoPublic() {
        return this.ctoTipoPublic;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoTipoContacto(String ctoTipoContacto) {
        this.ctoTipoContacto = ctoTipoContacto;
    }

    public String getCtoTipoContacto() {
        return this.ctoTipoContacto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoNumEscritura(String ctoNumEscritura) {
        this.ctoNumEscritura = ctoNumEscritura;
    }

    public String getCtoNumEscritura() {
        return this.ctoNumEscritura;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoNumNotario(BigDecimal ctoNumNotario) {
        this.ctoNumNotario = ctoNumNotario;
    }

    public BigDecimal getCtoNumNotario() {
        return this.ctoNumNotario;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoTipoAdmon(String ctoTipoAdmon) {
        this.ctoTipoAdmon = ctoTipoAdmon;
    }

    public String getCtoTipoAdmon() {
        return this.ctoTipoAdmon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCtoCveReqSors(BigDecimal ctoCveReqSors) {
        this.ctoCveReqSors = ctoCveReqSors;
    }

    public BigDecimal getCtoCveReqSors() {
        return this.ctoCveReqSors;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoNumExpSors(String ctoNumExpSors) {
        this.ctoNumExpSors = ctoNumExpSors;
    }

    public String getCtoNumExpSors() {
        return this.ctoNumExpSors;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoFecActShcp(String ctoFecActShcp) {
        this.ctoFecActShcp = ctoFecActShcp;
    }

    public String getCtoFecActShcp() {
        return this.ctoFecActShcp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCtoTipoCont(String ctoTipoCont) {
        this.ctoTipoCont = ctoTipoCont;
    }

    public String getCtoTipoCont() {
        return this.ctoTipoCont;
    }

    @FieldInfo(nullable = true, dataType = "CHAR", javaClass = String.class)
    public void setCtoEstInterfid(String ctoEstInterfid) {
        this.ctoEstInterfid = ctoEstInterfid;
    }

    public String getCtoEstInterfid() {
        return this.ctoEstInterfid;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setAntTipoNegSat(BigDecimal antTipoNegSat) {
        this.antTipoNegSat = antTipoNegSat;
    }

    public BigDecimal getAntTipoNegSat() {
        return this.antTipoNegSat;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONTRATOH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtoNumContrato() != null && this.getCtoNumContrato().longValue() == -999) {
            conditions += " AND CTO_NUM_CONTRATO IS NULL";
        } else if (this.getCtoNumContrato() != null) {
            conditions += " AND CTO_NUM_CONTRATO = ?";
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
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CONTRATOH ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCtoNumContrato() != null && this.getCtoNumContrato().longValue() == -999) {
            conditions += " AND CTO_NUM_CONTRATO IS NULL";
        } else if (this.getCtoNumContrato() != null) {
            conditions += " AND CTO_NUM_CONTRATO = ?";
            values.add(this.getCtoNumContrato());
        }

        if (this.getCtoNumCliente() != null && this.getCtoNumCliente().longValue() == -999) {
            conditions += " AND CTO_NUM_CLIENTE IS NULL";
        } else if (this.getCtoNumCliente() != null) {
            conditions += " AND CTO_NUM_CLIENTE = ?";
            values.add(this.getCtoNumCliente());
        }

        if (this.getCtoNumCtoEje() != null && this.getCtoNumCtoEje().longValue() == -999) {
            conditions += " AND CTO_NUM_CTO_EJE IS NULL";
        } else if (this.getCtoNumCtoEje() != null) {
            conditions += " AND CTO_NUM_CTO_EJE = ?";
            values.add(this.getCtoNumCtoEje());
        }

        if (this.getCtoCveTipoNeg() != null && "null".equals(this.getCtoCveTipoNeg())) {
            conditions += " AND CTO_CVE_TIPO_NEG IS NULL";
        } else if (this.getCtoCveTipoNeg() != null) {
            conditions += " AND CTO_CVE_TIPO_NEG = ?";
            values.add(this.getCtoCveTipoNeg());
        }

        if (this.getCtoCveClasProd() != null && "null".equals(this.getCtoCveClasProd())) {
            conditions += " AND CTO_CVE_CLAS_PROD IS NULL";
        } else if (this.getCtoCveClasProd() != null) {
            conditions += " AND CTO_CVE_CLAS_PROD = ?";
            values.add(this.getCtoCveClasProd());
        }

        if (this.getCtoNumProducto() != null && this.getCtoNumProducto().longValue() == -999) {
            conditions += " AND CTO_NUM_PRODUCTO IS NULL";
        } else if (this.getCtoNumProducto() != null) {
            conditions += " AND CTO_NUM_PRODUCTO = ?";
            values.add(this.getCtoNumProducto());
        }

        if (this.getCtoNomContrato() != null && "null".equals(this.getCtoNomContrato())) {
            conditions += " AND CTO_NOM_CONTRATO IS NULL";
        } else if (this.getCtoNomContrato() != null) {
            conditions += " AND CTO_NOM_CONTRATO = ?";
            values.add(this.getCtoNomContrato());
        }

        if (this.getCtoCveFormaMan() != null && "null".equals(this.getCtoCveFormaMan())) {
            conditions += " AND CTO_CVE_FORMA_MAN IS NULL";
        } else if (this.getCtoCveFormaMan() != null) {
            conditions += " AND CTO_CVE_FORMA_MAN = ?";
            values.add(this.getCtoCveFormaMan());
        }

        if (this.getCtoCveTipoPer() != null && "null".equals(this.getCtoCveTipoPer())) {
            conditions += " AND CTO_CVE_TIPO_PER IS NULL";
        } else if (this.getCtoCveTipoPer() != null) {
            conditions += " AND CTO_CVE_TIPO_PER = ?";
            values.add(this.getCtoCveTipoPer());
        }

        if (this.getCtoCveRetencion() != null && "null".equals(this.getCtoCveRetencion())) {
            conditions += " AND CTO_CVE_RETENCION IS NULL";
        } else if (this.getCtoCveRetencion() != null) {
            conditions += " AND CTO_CVE_RETENCION = ?";
            values.add(this.getCtoCveRetencion());
        }

        if (this.getCtoCveComiteTec() != null && this.getCtoCveComiteTec().longValue() == -999) {
            conditions += " AND CTO_CVE_COMITE_TEC IS NULL";
        } else if (this.getCtoCveComiteTec() != null) {
            conditions += " AND CTO_CVE_COMITE_TEC = ?";
            values.add(this.getCtoCveComiteTec());
        }

        if (this.getCtoCveArt28() != null && this.getCtoCveArt28().longValue() == -999) {
            conditions += " AND CTO_CVE_ART_28 IS NULL";
        } else if (this.getCtoCveArt28() != null) {
            conditions += " AND CTO_CVE_ART_28 = ?";
            values.add(this.getCtoCveArt28());
        }

        if (this.getCtoCveExclu30() != null && this.getCtoCveExclu30().longValue() == -999) {
            conditions += " AND CTO_CVE_EXCLU_30 IS NULL";
        } else if (this.getCtoCveExclu30() != null) {
            conditions += " AND CTO_CVE_EXCLU_30 = ?";
            values.add(this.getCtoCveExclu30());
        }

        if (this.getCtoCveMonExt() != null && this.getCtoCveMonExt().longValue() == -999) {
            conditions += " AND CTO_CVE_MON_EXT IS NULL";
        } else if (this.getCtoCveMonExt() != null) {
            conditions += " AND CTO_CVE_MON_EXT = ?";
            values.add(this.getCtoCveMonExt());
        }

        if (this.getCtoCveRevocable() != null && this.getCtoCveRevocable().longValue() == -999) {
            conditions += " AND CTO_CVE_REVOCABLE IS NULL";
        } else if (this.getCtoCveRevocable() != null) {
            conditions += " AND CTO_CVE_REVOCABLE = ?";
            values.add(this.getCtoCveRevocable());
        }

        if (this.getCtoCveRepProd() != null && this.getCtoCveRepProd().longValue() == -999) {
            conditions += " AND CTO_CVE_REP_PROD IS NULL";
        } else if (this.getCtoCveRepProd() != null) {
            conditions += " AND CTO_CVE_REP_PROD = ?";
            values.add(this.getCtoCveRepProd());
        }

        if (this.getCtoNumOficioExe() != null && "null".equals(this.getCtoNumOficioExe())) {
            conditions += " AND CTO_NUM_OFICIO_EXE IS NULL";
        } else if (this.getCtoNumOficioExe() != null) {
            conditions += " AND CTO_NUM_OFICIO_EXE = ?";
            values.add(this.getCtoNumOficioExe());
        }

        if (this.getCtoRegNalInvEx() != null && "null".equals(this.getCtoRegNalInvEx())) {
            conditions += " AND CTO_REG_NAL_INV_EX IS NULL";
        } else if (this.getCtoRegNalInvEx() != null) {
            conditions += " AND CTO_REG_NAL_INV_EX = ?";
            values.add(this.getCtoRegNalInvEx());
        }

        if (this.getCtoAnoApertura() != null && this.getCtoAnoApertura().longValue() == -999) {
            conditions += " AND CTO_ANO_APERTURA IS NULL";
        } else if (this.getCtoAnoApertura() != null) {
            conditions += " AND CTO_ANO_APERTURA = ?";
            values.add(this.getCtoAnoApertura());
        }

        if (this.getCtoMesApertura() != null && this.getCtoMesApertura().longValue() == -999) {
            conditions += " AND CTO_MES_APERTURA IS NULL";
        } else if (this.getCtoMesApertura() != null) {
            conditions += " AND CTO_MES_APERTURA = ?";
            values.add(this.getCtoMesApertura());
        }

        if (this.getCtoDiaApertura() != null && this.getCtoDiaApertura().longValue() == -999) {
            conditions += " AND CTO_DIA_APERTURA IS NULL";
        } else if (this.getCtoDiaApertura() != null) {
            conditions += " AND CTO_DIA_APERTURA = ?";
            values.add(this.getCtoDiaApertura());
        }

        if (this.getCtoAnoVencim() != null && this.getCtoAnoVencim().longValue() == -999) {
            conditions += " AND CTO_ANO_VENCIM IS NULL";
        } else if (this.getCtoAnoVencim() != null) {
            conditions += " AND CTO_ANO_VENCIM = ?";
            values.add(this.getCtoAnoVencim());
        }

        if (this.getCtoMesVencim() != null && this.getCtoMesVencim().longValue() == -999) {
            conditions += " AND CTO_MES_VENCIM IS NULL";
        } else if (this.getCtoMesVencim() != null) {
            conditions += " AND CTO_MES_VENCIM = ?";
            values.add(this.getCtoMesVencim());
        }

        if (this.getCtoDiaVencim() != null && this.getCtoDiaVencim().longValue() == -999) {
            conditions += " AND CTO_DIA_VENCIM IS NULL";
        } else if (this.getCtoDiaVencim() != null) {
            conditions += " AND CTO_DIA_VENCIM = ?";
            values.add(this.getCtoDiaVencim());
        }

        if (this.getCtoAnoAnivers() != null && this.getCtoAnoAnivers().longValue() == -999) {
            conditions += " AND CTO_ANO_ANIVERS IS NULL";
        } else if (this.getCtoAnoAnivers() != null) {
            conditions += " AND CTO_ANO_ANIVERS = ?";
            values.add(this.getCtoAnoAnivers());
        }

        if (this.getCtoMesAnivers() != null && this.getCtoMesAnivers().longValue() == -999) {
            conditions += " AND CTO_MES_ANIVERS IS NULL";
        } else if (this.getCtoMesAnivers() != null) {
            conditions += " AND CTO_MES_ANIVERS = ?";
            values.add(this.getCtoMesAnivers());
        }

        if (this.getCtoDiaAnivers() != null && this.getCtoDiaAnivers().longValue() == -999) {
            conditions += " AND CTO_DIA_ANIVERS IS NULL";
        } else if (this.getCtoDiaAnivers() != null) {
            conditions += " AND CTO_DIA_ANIVERS = ?";
            values.add(this.getCtoDiaAnivers());
        }

        if (this.getCtoAnoCancela() != null && this.getCtoAnoCancela().longValue() == -999) {
            conditions += " AND CTO_ANO_CANCELA IS NULL";
        } else if (this.getCtoAnoCancela() != null) {
            conditions += " AND CTO_ANO_CANCELA = ?";
            values.add(this.getCtoAnoCancela());
        }

        if (this.getCtoMesCancela() != null && this.getCtoMesCancela().longValue() == -999) {
            conditions += " AND CTO_MES_CANCELA IS NULL";
        } else if (this.getCtoMesCancela() != null) {
            conditions += " AND CTO_MES_CANCELA = ?";
            values.add(this.getCtoMesCancela());
        }

        if (this.getCtoDiaCancela() != null && this.getCtoDiaCancela().longValue() == -999) {
            conditions += " AND CTO_DIA_CANCELA IS NULL";
        } else if (this.getCtoDiaCancela() != null) {
            conditions += " AND CTO_DIA_CANCELA = ?";
            values.add(this.getCtoDiaCancela());
        }

        if (this.getCtoFecInscRnie() != null && "null".equals(this.getCtoFecInscRnie())) {
            conditions += " AND CTO_FEC_INSC_RNIE IS NULL";
        } else if (this.getCtoFecInscRnie() != null) {
            conditions += " AND CTO_FEC_INSC_RNIE = ?";
            values.add(this.getCtoFecInscRnie());
        }

        if (this.getCtoAnoAltaReg() != null && this.getCtoAnoAltaReg().longValue() == -999) {
            conditions += " AND CTO_ANO_ALTA_REG IS NULL";
        } else if (this.getCtoAnoAltaReg() != null) {
            conditions += " AND CTO_ANO_ALTA_REG = ?";
            values.add(this.getCtoAnoAltaReg());
        }

        if (this.getCtoMesAltaReg() != null && this.getCtoMesAltaReg().longValue() == -999) {
            conditions += " AND CTO_MES_ALTA_REG IS NULL";
        } else if (this.getCtoMesAltaReg() != null) {
            conditions += " AND CTO_MES_ALTA_REG = ?";
            values.add(this.getCtoMesAltaReg());
        }

        if (this.getCtoDiaAltaReg() != null && this.getCtoDiaAltaReg().longValue() == -999) {
            conditions += " AND CTO_DIA_ALTA_REG IS NULL";
        } else if (this.getCtoDiaAltaReg() != null) {
            conditions += " AND CTO_DIA_ALTA_REG = ?";
            values.add(this.getCtoDiaAltaReg());
        }

        if (this.getCtoAnoUltMod() != null && this.getCtoAnoUltMod().longValue() == -999) {
            conditions += " AND CTO_ANO_ULT_MOD IS NULL";
        } else if (this.getCtoAnoUltMod() != null) {
            conditions += " AND CTO_ANO_ULT_MOD = ?";
            values.add(this.getCtoAnoUltMod());
        }

        if (this.getCtoMesUltMod() != null && this.getCtoMesUltMod().longValue() == -999) {
            conditions += " AND CTO_MES_ULT_MOD IS NULL";
        } else if (this.getCtoMesUltMod() != null) {
            conditions += " AND CTO_MES_ULT_MOD = ?";
            values.add(this.getCtoMesUltMod());
        }

        if (this.getCtoDiaUltMod() != null && this.getCtoDiaUltMod().longValue() == -999) {
            conditions += " AND CTO_DIA_ULT_MOD IS NULL";
        } else if (this.getCtoDiaUltMod() != null) {
            conditions += " AND CTO_DIA_ULT_MOD = ?";
            values.add(this.getCtoDiaUltMod());
        }

        if (this.getCtoCveStContrat() != null && "null".equals(this.getCtoCveStContrat())) {
            conditions += " AND CTO_CVE_ST_CONTRAT IS NULL";
        } else if (this.getCtoCveStContrat() != null) {
            conditions += " AND CTO_CVE_ST_CONTRAT = ?";
            values.add(this.getCtoCveStContrat());
        }

        if (this.getCtoCveSubcto() != null && this.getCtoCveSubcto().longValue() == -999) {
            conditions += " AND CTO_CVE_SUBCTO IS NULL";
        } else if (this.getCtoCveSubcto() != null) {
            conditions += " AND CTO_CVE_SUBCTO = ?";
            values.add(this.getCtoCveSubcto());
        }

        if (this.getCtoNumNivel1() != null && this.getCtoNumNivel1().longValue() == -999) {
            conditions += " AND CTO_NUM_NIVEL1 IS NULL";
        } else if (this.getCtoNumNivel1() != null) {
            conditions += " AND CTO_NUM_NIVEL1 = ?";
            values.add(this.getCtoNumNivel1());
        }

        if (this.getCtoNumNivel2() != null && this.getCtoNumNivel2().longValue() == -999) {
            conditions += " AND CTO_NUM_NIVEL2 IS NULL";
        } else if (this.getCtoNumNivel2() != null) {
            conditions += " AND CTO_NUM_NIVEL2 = ?";
            values.add(this.getCtoNumNivel2());
        }

        if (this.getCtoNumNivel3() != null && this.getCtoNumNivel3().longValue() == -999) {
            conditions += " AND CTO_NUM_NIVEL3 IS NULL";
        } else if (this.getCtoNumNivel3() != null) {
            conditions += " AND CTO_NUM_NIVEL3 = ?";
            values.add(this.getCtoNumNivel3());
        }

        if (this.getCtoNumNivel4() != null && this.getCtoNumNivel4().longValue() == -999) {
            conditions += " AND CTO_NUM_NIVEL4 IS NULL";
        } else if (this.getCtoNumNivel4() != null) {
            conditions += " AND CTO_NUM_NIVEL4 = ?";
            values.add(this.getCtoNumNivel4());
        }

        if (this.getCtoNumNivel5() != null && this.getCtoNumNivel5().longValue() == -999) {
            conditions += " AND CTO_NUM_NIVEL5 IS NULL";
        } else if (this.getCtoNumNivel5() != null) {
            conditions += " AND CTO_NUM_NIVEL5 = ?";
            values.add(this.getCtoNumNivel5());
        }

        if (this.getCtoRegShcp() != null && "null".equals(this.getCtoRegShcp())) {
            conditions += " AND CTO_REG_SHCP IS NULL";
        } else if (this.getCtoRegShcp() != null) {
            conditions += " AND CTO_REG_SHCP = ?";
            values.add(this.getCtoRegShcp());
        }

        if (this.getCtoCveShcp() != null && this.getCtoCveShcp().longValue() == -999) {
            conditions += " AND CTO_CVE_SHCP IS NULL";
        } else if (this.getCtoCveShcp() != null) {
            conditions += " AND CTO_CVE_SHCP = ?";
            values.add(this.getCtoCveShcp());
        }

        if (this.getCtoRegGobdf() != null && "null".equals(this.getCtoRegGobdf())) {
            conditions += " AND CTO_REG_GOBDF IS NULL";
        } else if (this.getCtoRegGobdf() != null) {
            conditions += " AND CTO_REG_GOBDF = ?";
            values.add(this.getCtoRegGobdf());
        }

        if (this.getCtoCveGobdf() != null && this.getCtoCveGobdf().longValue() == -999) {
            conditions += " AND CTO_CVE_GOBDF IS NULL";
        } else if (this.getCtoCveGobdf() != null) {
            conditions += " AND CTO_CVE_GOBDF = ?";
            values.add(this.getCtoCveGobdf());
        }

        if (this.getCtoRama() != null && this.getCtoRama().longValue() == -999) {
            conditions += " AND CTO_RAMA IS NULL";
        } else if (this.getCtoRama() != null) {
            conditions += " AND CTO_RAMA = ?";
            values.add(this.getCtoRama());
        }

        if (this.getCtoSubRama() != null && this.getCtoSubRama().longValue() == -999) {
            conditions += " AND CTO_SUB_RAMA IS NULL";
        } else if (this.getCtoSubRama() != null) {
            conditions += " AND CTO_SUB_RAMA = ?";
            values.add(this.getCtoSubRama());
        }

        if (this.getCtoNomActividad() != null && "null".equals(this.getCtoNomActividad())) {
            conditions += " AND CTO_NOM_ACTIVIDAD IS NULL";
        } else if (this.getCtoNomActividad() != null) {
            conditions += " AND CTO_NOM_ACTIVIDAD = ?";
            values.add(this.getCtoNomActividad());
        }

        if (this.getCtoTipoClient() != null && "null".equals(this.getCtoTipoClient())) {
            conditions += " AND CTO_TIPO_CLIENT IS NULL";
        } else if (this.getCtoTipoClient() != null) {
            conditions += " AND CTO_TIPO_CLIENT = ?";
            values.add(this.getCtoTipoClient());
        }

        if (this.getCtoTipoPublic() != null && "null".equals(this.getCtoTipoPublic())) {
            conditions += " AND CTO_TIPO_PUBLIC IS NULL";
        } else if (this.getCtoTipoPublic() != null) {
            conditions += " AND CTO_TIPO_PUBLIC = ?";
            values.add(this.getCtoTipoPublic());
        }

        if (this.getCtoTipoContacto() != null && "null".equals(this.getCtoTipoContacto())) {
            conditions += " AND CTO_TIPO_CONTACTO IS NULL";
        } else if (this.getCtoTipoContacto() != null) {
            conditions += " AND CTO_TIPO_CONTACTO = ?";
            values.add(this.getCtoTipoContacto());
        }

        if (this.getCtoNumEscritura() != null && "null".equals(this.getCtoNumEscritura())) {
            conditions += " AND CTO_NUM_ESCRITURA IS NULL";
        } else if (this.getCtoNumEscritura() != null) {
            conditions += " AND CTO_NUM_ESCRITURA = ?";
            values.add(this.getCtoNumEscritura());
        }

        if (this.getCtoNumNotario() != null && this.getCtoNumNotario().longValue() == -999) {
            conditions += " AND CTO_NUM_NOTARIO IS NULL";
        } else if (this.getCtoNumNotario() != null) {
            conditions += " AND CTO_NUM_NOTARIO = ?";
            values.add(this.getCtoNumNotario());
        }

        if (this.getCtoTipoAdmon() != null && "null".equals(this.getCtoTipoAdmon())) {
            conditions += " AND CTO_TIPO_ADMON IS NULL";
        } else if (this.getCtoTipoAdmon() != null) {
            conditions += " AND CTO_TIPO_ADMON = ?";
            values.add(this.getCtoTipoAdmon());
        }

        if (this.getCtoCveReqSors() != null && this.getCtoCveReqSors().longValue() == -999) {
            conditions += " AND CTO_CVE_REQ_SORS IS NULL";
        } else if (this.getCtoCveReqSors() != null) {
            conditions += " AND CTO_CVE_REQ_SORS = ?";
            values.add(this.getCtoCveReqSors());
        }

        if (this.getCtoNumExpSors() != null && "null".equals(this.getCtoNumExpSors())) {
            conditions += " AND CTO_NUM_EXP_SORS IS NULL";
        } else if (this.getCtoNumExpSors() != null) {
            conditions += " AND CTO_NUM_EXP_SORS = ?";
            values.add(this.getCtoNumExpSors());
        }

        if (this.getCtoFecActShcp() != null && "null".equals(this.getCtoFecActShcp())) {
            conditions += " AND CTO_FEC_ACT_SHCP IS NULL";
        } else if (this.getCtoFecActShcp() != null) {
            conditions += " AND CTO_FEC_ACT_SHCP = ?";
            values.add(this.getCtoFecActShcp());
        }

        if (this.getCtoTipoCont() != null && "null".equals(this.getCtoTipoCont())) {
            conditions += " AND CTO_TIPO_CONT IS NULL";
        } else if (this.getCtoTipoCont() != null) {
            conditions += " AND CTO_TIPO_CONT = ?";
            values.add(this.getCtoTipoCont());
        }

        if (this.getCtoEstInterfid() != null && "null".equals(this.getCtoEstInterfid())) {
            conditions += " AND CTO_EST_INTERFID IS NULL";
        } else if (this.getCtoEstInterfid() != null) {
            conditions += " AND CTO_EST_INTERFID = ?";
            values.add(this.getCtoEstInterfid());
        }

        if (this.getAntTipoNegSat() != null && this.getAntTipoNegSat().longValue() == -999) {
            conditions += " AND ANT_TIPO_NEG_SAT IS NULL";
        } else if (this.getAntTipoNegSat() != null) {
            conditions += " AND ANT_TIPO_NEG_SAT = ?";
            values.add(this.getAntTipoNegSat());
        }

        if (!"".equals(conditions)) {

            conditions = conditions.substring(4).trim();
            sql += "WHERE " + conditions;
            result.setSql(sql);
            result.setParameters(values.toArray());
        }

        return result;

    }

    public DMLObject getUpdate() {
        DMLObject result = new DMLObject();
        String sql = "UPDATE CONTRATOH SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

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
        fields += " CTO_TIPO_CONT = ?, ";
        values.add(this.getCtoTipoCont());
        fields += " CTO_EST_INTERFID = ?, ";
        values.add(this.getCtoEstInterfid());
        fields += " ANT_TIPO_NEG_SAT = ?, ";
        values.add(this.getAntTipoNegSat());
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
        DMLObject result = new DMLObject();
        String sql = "INSERT INTO CONTRATOH ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CTO_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtoNumContrato());

        fields += ", CTO_NUM_CLIENTE";
        fieldValues += ", ?";
        values.add(this.getCtoNumCliente());

        fields += ", CTO_NUM_CTO_EJE";
        fieldValues += ", ?";
        values.add(this.getCtoNumCtoEje());

        fields += ", CTO_CVE_TIPO_NEG";
        fieldValues += ", ?";
        values.add(this.getCtoCveTipoNeg());

        fields += ", CTO_CVE_CLAS_PROD";
        fieldValues += ", ?";
        values.add(this.getCtoCveClasProd());

        fields += ", CTO_NUM_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getCtoNumProducto());

        fields += ", CTO_NOM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCtoNomContrato());

        fields += ", CTO_CVE_FORMA_MAN";
        fieldValues += ", ?";
        values.add(this.getCtoCveFormaMan());

        fields += ", CTO_CVE_TIPO_PER";
        fieldValues += ", ?";
        values.add(this.getCtoCveTipoPer());

        fields += ", CTO_CVE_RETENCION";
        fieldValues += ", ?";
        values.add(this.getCtoCveRetencion());

        fields += ", CTO_CVE_COMITE_TEC";
        fieldValues += ", ?";
        values.add(this.getCtoCveComiteTec());

        fields += ", CTO_CVE_ART_28";
        fieldValues += ", ?";
        values.add(this.getCtoCveArt28());

        fields += ", CTO_CVE_EXCLU_30";
        fieldValues += ", ?";
        values.add(this.getCtoCveExclu30());

        fields += ", CTO_CVE_MON_EXT";
        fieldValues += ", ?";
        values.add(this.getCtoCveMonExt());

        fields += ", CTO_CVE_REVOCABLE";
        fieldValues += ", ?";
        values.add(this.getCtoCveRevocable());

        fields += ", CTO_CVE_REP_PROD";
        fieldValues += ", ?";
        values.add(this.getCtoCveRepProd());

        fields += ", CTO_NUM_OFICIO_EXE";
        fieldValues += ", ?";
        values.add(this.getCtoNumOficioExe());

        fields += ", CTO_REG_NAL_INV_EX";
        fieldValues += ", ?";
        values.add(this.getCtoRegNalInvEx());

        fields += ", CTO_ANO_APERTURA";
        fieldValues += ", ?";
        values.add(this.getCtoAnoApertura());

        fields += ", CTO_MES_APERTURA";
        fieldValues += ", ?";
        values.add(this.getCtoMesApertura());

        fields += ", CTO_DIA_APERTURA";
        fieldValues += ", ?";
        values.add(this.getCtoDiaApertura());

        fields += ", CTO_ANO_VENCIM";
        fieldValues += ", ?";
        values.add(this.getCtoAnoVencim());

        fields += ", CTO_MES_VENCIM";
        fieldValues += ", ?";
        values.add(this.getCtoMesVencim());

        fields += ", CTO_DIA_VENCIM";
        fieldValues += ", ?";
        values.add(this.getCtoDiaVencim());

        fields += ", CTO_ANO_ANIVERS";
        fieldValues += ", ?";
        values.add(this.getCtoAnoAnivers());

        fields += ", CTO_MES_ANIVERS";
        fieldValues += ", ?";
        values.add(this.getCtoMesAnivers());

        fields += ", CTO_DIA_ANIVERS";
        fieldValues += ", ?";
        values.add(this.getCtoDiaAnivers());

        fields += ", CTO_ANO_CANCELA";
        fieldValues += ", ?";
        values.add(this.getCtoAnoCancela());

        fields += ", CTO_MES_CANCELA";
        fieldValues += ", ?";
        values.add(this.getCtoMesCancela());

        fields += ", CTO_DIA_CANCELA";
        fieldValues += ", ?";
        values.add(this.getCtoDiaCancela());

        fields += ", CTO_FEC_INSC_RNIE";
        fieldValues += ", ?";
        values.add(this.getCtoFecInscRnie());

        fields += ", CTO_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtoAnoAltaReg());

        fields += ", CTO_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtoMesAltaReg());

        fields += ", CTO_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCtoDiaAltaReg());

        fields += ", CTO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtoAnoUltMod());

        fields += ", CTO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtoMesUltMod());

        fields += ", CTO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCtoDiaUltMod());

        fields += ", CTO_CVE_ST_CONTRAT";
        fieldValues += ", ?";
        values.add(this.getCtoCveStContrat());

        fields += ", CTO_CVE_SUBCTO";
        fieldValues += ", ?";
        values.add(this.getCtoCveSubcto());

        fields += ", CTO_NUM_NIVEL1";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel1());

        fields += ", CTO_NUM_NIVEL2";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel2());

        fields += ", CTO_NUM_NIVEL3";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel3());

        fields += ", CTO_NUM_NIVEL4";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel4());

        fields += ", CTO_NUM_NIVEL5";
        fieldValues += ", ?";
        values.add(this.getCtoNumNivel5());

        fields += ", CTO_REG_SHCP";
        fieldValues += ", ?";
        values.add(this.getCtoRegShcp());

        fields += ", CTO_CVE_SHCP";
        fieldValues += ", ?";
        values.add(this.getCtoCveShcp());

        fields += ", CTO_REG_GOBDF";
        fieldValues += ", ?";
        values.add(this.getCtoRegGobdf());

        fields += ", CTO_CVE_GOBDF";
        fieldValues += ", ?";
        values.add(this.getCtoCveGobdf());

        fields += ", CTO_RAMA";
        fieldValues += ", ?";
        values.add(this.getCtoRama());

        fields += ", CTO_SUB_RAMA";
        fieldValues += ", ?";
        values.add(this.getCtoSubRama());

        fields += ", CTO_NOM_ACTIVIDAD";
        fieldValues += ", ?";
        values.add(this.getCtoNomActividad());

        fields += ", CTO_TIPO_CLIENT";
        fieldValues += ", ?";
        values.add(this.getCtoTipoClient());

        fields += ", CTO_TIPO_PUBLIC";
        fieldValues += ", ?";
        values.add(this.getCtoTipoPublic());

        fields += ", CTO_TIPO_CONTACTO";
        fieldValues += ", ?";
        values.add(this.getCtoTipoContacto());

        fields += ", CTO_NUM_ESCRITURA";
        fieldValues += ", ?";
        values.add(this.getCtoNumEscritura());

        fields += ", CTO_NUM_NOTARIO";
        fieldValues += ", ?";
        values.add(this.getCtoNumNotario());

        fields += ", CTO_TIPO_ADMON";
        fieldValues += ", ?";
        values.add(this.getCtoTipoAdmon());

        fields += ", CTO_CVE_REQ_SORS";
        fieldValues += ", ?";
        values.add(this.getCtoCveReqSors());

        fields += ", CTO_NUM_EXP_SORS";
        fieldValues += ", ?";
        values.add(this.getCtoNumExpSors());

        fields += ", CTO_FEC_ACT_SHCP";
        fieldValues += ", ?";
        values.add(this.getCtoFecActShcp());

        fields += ", CTO_TIPO_CONT";
        fieldValues += ", ?";
        values.add(this.getCtoTipoCont());

        fields += ", CTO_EST_INTERFID";
        fieldValues += ", ?";
        values.add(this.getCtoEstInterfid());

        fields += ", ANT_TIPO_NEG_SAT";
        fieldValues += ", ?";
        values.add(this.getAntTipoNegSat());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CONTRATOH WHERE ";

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
        Contratoh instance = (Contratoh) compareWith;
        boolean equalObjects = true;
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
        if (equalObjects && !this.getCtoTipoCont().equals(instance.getCtoTipoCont()))
            equalObjects = false;
        if (equalObjects && !this.getCtoEstInterfid().equals(instance.getCtoEstInterfid()))
            equalObjects = false;
        if (equalObjects && !this.getAntTipoNegSat().equals(instance.getAntTipoNegSat()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Contratoh result = new Contratoh();
        DataRow objectData = null;
        objectData = selectAsDataRow();

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
        result.setCtoTipoCont((String) objectData.getData("CTO_TIPO_CONT"));
        result.setCtoEstInterfid((String) objectData.getData("CTO_EST_INTERFID"));
        result.setAntTipoNegSat((BigDecimal) objectData.getData("ANT_TIPO_NEG_SAT"));

        return result;

    }

}
