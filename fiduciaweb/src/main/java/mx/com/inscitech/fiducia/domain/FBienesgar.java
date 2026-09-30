package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.domain.base.DMLObject;
import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;

@PrimaryKey(constraintName = "F_BIENESGAR_PK",
            columns = { "FGRS_ID_FIDEICOMISO", "FGRS_ID_SUBCUENTA", "FORS_ID_GARANTIA" }, sequences = { "MANUAL" })

public class FBienesgar extends DomainObject {
    BigDecimal fgrsIdFideicomiso = null;
    BigDecimal fgrsIdSubcuenta = null;
    String forsIdGarantia = null;
    String forsCveTipoGarantia = null;
    String forsCveTipoBien = null;
    BigDecimal forsInmCsc = null;
    String forsInmSubmateria = null;
    String forsInmEstatus = null;
    String forsInmMoneda = null;
    BigDecimal forsInmImporte = null;
    String forsInmBeneficiario = null;
    String forsInmUniApodoInm = null;
    String forsInmCalleAv = null;
    String forsInmNumExtMza = null;
    String forsInmNumIntLt = null;
    String forsInmColonia = null;
    String forsInmPais = null;
    String forsInmEstado = null;
    String forsInmCiudad = null;
    String forsInmDelMun = null;
    BigDecimal forsInmCp = null;
    BigDecimal forsInmSuperficie = null;
    String forsInmSubTipo = null;
    BigDecimal forsInmFecValor = null;
    String forsInmClaveCatas = null;
    String forsInmCuentaPred = null;
    BigDecimal forsInmPenPredial = null;
    BigDecimal forsInmEmbargo = null;
    BigDecimal forsInmImpTotInm = null;
    BigDecimal forsMueCsc = null;
    String forsMueTipoDoc = null;
    String forsMueTipoCopia = null;
    String forsMueNumeroDoc = null;
    BigDecimal forsMueFechaExp = null;
    BigDecimal forsMueFechaVenc = null;
    String forsMueMoneda = null;
    BigDecimal forsMueValorDoc = null;
    String forsMueDescDoc = null;
    String forsMueQuienExpDocu = null;
    String forsMueFavExpDoc = null;
    String forsMueEndoso = null;
    BigDecimal forsMueFecEndoso = null;
    BigDecimal forsMueFecEntrada = null;
    BigDecimal forsMueFecSalida = null;
    String forsMueEstatus = null;
    BigDecimal forsMueImpTotMueb = null;
    BigDecimal forsDerCsc = null;
    String forsDerAdministrador = null;
    BigDecimal forsDerNoCedito = null;
    String forsDerNomAcredi = null;
    BigDecimal forsDerImporte = null;
    String forsDerMoneda = null;
    String forsDerEstatusCred = null;
    BigDecimal forsDerFecValor = null;
    String forsDerDirInmueble = null;
    String forsDerEstado = null;
    String forsDerEstatus = null;
    BigDecimal forsDerImpTotDer = null;

    public FBienesgar() {
        super();
        this.pkColumns = 8;
    }

    public void setFgrsIdFideicomiso(BigDecimal fgrsIdFideicomiso) {
        this.fgrsIdFideicomiso = fgrsIdFideicomiso;
    }

    public void setFgrsIdSubcuenta(BigDecimal fgrsIdSubcuenta) {
        this.fgrsIdSubcuenta = fgrsIdSubcuenta;
    }

    public void setForsIdGarantia(String forsIdGarantia) {
        this.forsIdGarantia = forsIdGarantia;
    }

    public void setForsCveTipoGarantia(String forsCveTipoGarantia) {
        this.forsCveTipoGarantia = forsCveTipoGarantia;
    }

    public void setForsCveTipoBien(String forsCveTipoBien) {
        this.forsCveTipoBien = forsCveTipoBien;
    }

    public void setForsInmCsc(BigDecimal forsInmCsc) {
        this.forsInmCsc = forsInmCsc;
    }

    public void setForsInmSubmateria(String forsInmSubmateria) {
        this.forsInmSubmateria = forsInmSubmateria;
    }

    public void setForsInmEstatus(String forsInmEstatus) {
        this.forsInmEstatus = forsInmEstatus;
    }

    public void setForsInmMoneda(String forsInmMoneda) {
        this.forsInmMoneda = forsInmMoneda;
    }

    public void setForsInmImporte(BigDecimal forsInmImporte) {
        this.forsInmImporte = forsInmImporte;
    }

    public void setForsInmBeneficiario(String forsInmBeneficiario) {
        this.forsInmBeneficiario = forsInmBeneficiario;
    }

    public void setForsInmUniApodoInm(String forsInmUniApodoInm) {
        this.forsInmUniApodoInm = forsInmUniApodoInm;
    }

    public void setForsInmCalleAv(String forsInmCalleAv) {
        this.forsInmCalleAv = forsInmCalleAv;
    }

    public void setForsInmNumExtMza(String forsInmNumExtMza) {
        this.forsInmNumExtMza = forsInmNumExtMza;
    }

    public void setForsInmNumIntLt(String forsInmNumIntLt) {
        this.forsInmNumIntLt = forsInmNumIntLt;
    }

    public void setForsInmColonia(String forsInmColonia) {
        this.forsInmColonia = forsInmColonia;
    }

    public void setForsInmPais(String forsInmPais) {
        this.forsInmPais = forsInmPais;
    }

    public void setForsInmEstado(String forsInmEstado) {
        this.forsInmEstado = forsInmEstado;
    }

    public void setForsInmCiudad(String forsInmCiudad) {
        this.forsInmCiudad = forsInmCiudad;
    }

    public void setForsInmDelMun(String forsInmDelMun) {
        this.forsInmDelMun = forsInmDelMun;
    }

    public void setForsInmCp(BigDecimal forsInmCp) {
        this.forsInmCp = forsInmCp;
    }

    public void setForsInmSuperficie(BigDecimal forsInmSuperficie) {
        this.forsInmSuperficie = forsInmSuperficie;
    }

    public void setForsInmSubTipo(String forsInmSubTipo) {
        this.forsInmSubTipo = forsInmSubTipo;
    }

    public void setForsInmFecValor(BigDecimal forsInmFecValor) {
        this.forsInmFecValor = forsInmFecValor;
    }

    public void setForsInmClaveCatas(String forsInmClaveCatas) {
        this.forsInmClaveCatas = forsInmClaveCatas;
    }

    public void setForsInmCuentaPred(String forsInmCuentaPred) {
        this.forsInmCuentaPred = forsInmCuentaPred;
    }

    public void setForsInmPenPredial(BigDecimal forsInmPenPredial) {
        this.forsInmPenPredial = forsInmPenPredial;
    }

    public void setForsInmEmbargo(BigDecimal forsInmEmbargo) {
        this.forsInmEmbargo = forsInmEmbargo;
    }

    public void setForsInmImpTotInm(BigDecimal forsInmImpTotInm) {
        this.forsInmImpTotInm = forsInmImpTotInm;
    }

    public void setForsMueCsc(BigDecimal forsMueCsc) {
        this.forsMueCsc = forsMueCsc;
    }

    public void setForsMueTipoDoc(String forsMueTipoDoc) {
        this.forsMueTipoDoc = forsMueTipoDoc;
    }

    public void setForsMueTipoCopia(String forsMueTipoCopia) {
        this.forsMueTipoCopia = forsMueTipoCopia;
    }

    public void setForsMueNumeroDoc(String forsMueNumeroDoc) {
        this.forsMueNumeroDoc = forsMueNumeroDoc;
    }

    public void setForsMueFechaExp(BigDecimal forsMueFechaExp) {
        this.forsMueFechaExp = forsMueFechaExp;
    }

    public void setForsMueFechaVenc(BigDecimal forsMueFechaVenc) {
        this.forsMueFechaVenc = forsMueFechaVenc;
    }

    public void setForsMueMoneda(String forsMueMoneda) {
        this.forsMueMoneda = forsMueMoneda;
    }

    public void setForsMueValorDoc(BigDecimal forsMueValorDoc) {
        this.forsMueValorDoc = forsMueValorDoc;
    }

    public void setForsMueDescDoc(String forsMueDescDoc) {
        this.forsMueDescDoc = forsMueDescDoc;
    }

    public void setForsMueQuienExpDocu(String forsMueQuienExpDocu) {
        this.forsMueQuienExpDocu = forsMueQuienExpDocu;
    }

    public void setForsMueFavExpDoc(String forsMueFavExpDoc) {
        this.forsMueFavExpDoc = forsMueFavExpDoc;
    }

    public void setForsMueEndoso(String forsMueEndoso) {
        this.forsMueEndoso = forsMueEndoso;
    }

    public void setForsMueFecEndoso(BigDecimal forsMueFecEndoso) {
        this.forsMueFecEndoso = forsMueFecEndoso;
    }

    public void setForsMueFecEntrada(BigDecimal forsMueFecEntrada) {
        this.forsMueFecEntrada = forsMueFecEntrada;
    }

    public void setForsMueFecSalida(BigDecimal forsMueFecSalida) {
        this.forsMueFecSalida = forsMueFecSalida;
    }

    public void setForsMueEstatus(String forsMueEstatus) {
        this.forsMueEstatus = forsMueEstatus;
    }

    public void setForsMueImpTotMueb(BigDecimal forsMueImpTotMueb) {
        this.forsMueImpTotMueb = forsMueImpTotMueb;
    }

    public void setForsDerCsc(BigDecimal forsDerCsc) {
        this.forsDerCsc = forsDerCsc;
    }

    public void setForsDerAdministrador(String forsDerAdministrador) {
        this.forsDerAdministrador = forsDerAdministrador;
    }

    public void setForsDerNoCedito(BigDecimal forsDerNoCedito) {
        this.forsDerNoCedito = forsDerNoCedito;
    }

    public void setForsDerNomAcredi(String forsDerNomAcredi) {
        this.forsDerNomAcredi = forsDerNomAcredi;
    }

    public void setForsDerImporte(BigDecimal forsDerImporte) {
        this.forsDerImporte = forsDerImporte;
    }

    public void setForsDerMoneda(String forsDerMoneda) {
        this.forsDerMoneda = forsDerMoneda;
    }

    public void setForsDerEstatusCred(String forsDerEstatusCred) {
        this.forsDerEstatusCred = forsDerEstatusCred;
    }

    public void setForsDerFecValor(BigDecimal forsDerFecValor) {
        this.forsDerFecValor = forsDerFecValor;
    }

    public void setForsDerDirInmueble(String forsDerDirInmueble) {
        this.forsDerDirInmueble = forsDerDirInmueble;
    }

    public void setForsDerEstado(String forsDerEstado) {
        this.forsDerEstado = forsDerEstado;
    }

    public void setForsDerEstatus(String forsDerEstatus) {
        this.forsDerEstatus = forsDerEstatus;
    }

    public void setForsDerImpTotDer(BigDecimal forsDerImpTotDer) {
        this.forsDerImpTotDer = forsDerImpTotDer;
    }

    public BigDecimal getFgrsIdFideicomiso() {
        return this.fgrsIdFideicomiso;
    }

    public BigDecimal getFgrsIdSubcuenta() {
        return this.fgrsIdSubcuenta;
    }

    public String getForsIdGarantia() {
        return this.forsIdGarantia;
    }

    public String getForsCveTipoGarantia() {
        return this.forsCveTipoGarantia;
    }

    public String getForsCveTipoBien() {
        return this.forsCveTipoBien;
    }

    public BigDecimal getForsInmCsc() {
        return this.forsInmCsc;
    }

    public String getForsInmSubmateria() {
        return this.forsInmSubmateria;
    }

    public String getForsInmEstatus() {
        return this.forsInmEstatus;
    }

    public String getForsInmMoneda() {
        return this.forsInmMoneda;
    }

    public BigDecimal getForsInmImporte() {
        return this.forsInmImporte;
    }

    public String getForsInmBeneficiario() {
        return this.forsInmBeneficiario;
    }

    public String getForsInmUniApodoInm() {
        return this.forsInmUniApodoInm;
    }

    public String getForsInmCalleAv() {
        return this.forsInmCalleAv;
    }

    public String getForsInmNumExtMza() {
        return this.forsInmNumExtMza;
    }

    public String getForsInmNumIntLt() {
        return this.forsInmNumIntLt;
    }

    public String getForsInmColonia() {
        return this.forsInmColonia;
    }

    public String getForsInmPais() {
        return this.forsInmPais;
    }

    public String getForsInmEstado() {
        return this.forsInmEstado;
    }

    public String getForsInmCiudad() {
        return this.forsInmCiudad;
    }

    public String getForsInmDelMun() {
        return this.forsInmDelMun;
    }

    public BigDecimal getForsInmCp() {
        return this.forsInmCp;
    }

    public BigDecimal getForsInmSuperficie() {
        return this.forsInmSuperficie;
    }

    public String getForsInmSubTipo() {
        return this.forsInmSubTipo;
    }

    public BigDecimal getForsInmFecValor() {
        return this.forsInmFecValor;
    }

    public String getForsInmClaveCatas() {
        return this.forsInmClaveCatas;
    }

    public String getForsInmCuentaPred() {
        return this.forsInmCuentaPred;
    }

    public BigDecimal getForsInmPenPredial() {
        return this.forsInmPenPredial;
    }

    public BigDecimal getForsInmEmbargo() {
        return this.forsInmEmbargo;
    }

    public BigDecimal getForsInmImpTotInm() {
        return this.forsInmImpTotInm;
    }

    public BigDecimal getForsMueCsc() {
        return this.forsMueCsc;
    }

    public String getForsMueTipoDoc() {
        return this.forsMueTipoDoc;
    }

    public String getForsMueTipoCopia() {
        return this.forsMueTipoCopia;
    }

    public String getForsMueNumeroDoc() {
        return this.forsMueNumeroDoc;
    }

    public BigDecimal getForsMueFechaExp() {
        return this.forsMueFechaExp;
    }

    public BigDecimal getForsMueFechaVenc() {
        return this.forsMueFechaVenc;
    }

    public String getForsMueMoneda() {
        return this.forsMueMoneda;
    }

    public BigDecimal getForsMueValorDoc() {
        return this.forsMueValorDoc;
    }

    public String getForsMueDescDoc() {
        return this.forsMueDescDoc;
    }

    public String getForsMueQuienExpDocu() {
        return this.forsMueQuienExpDocu;
    }

    public String getForsMueFavExpDoc() {
        return this.forsMueFavExpDoc;
    }

    public String getForsMueEndoso() {
        return this.forsMueEndoso;
    }

    public BigDecimal getForsMueFecEndoso() {
        return this.forsMueFecEndoso;
    }

    public BigDecimal getForsMueFecEntrada() {
        return this.forsMueFecEntrada;
    }

    public BigDecimal getForsMueFecSalida() {
        return this.forsMueFecSalida;
    }

    public String getForsMueEstatus() {
        return this.forsMueEstatus;
    }

    public BigDecimal getForsMueImpTotMueb() {
        return this.forsMueImpTotMueb;
    }

    public BigDecimal getForsDerCsc() {
        return this.forsDerCsc;
    }

    public String getForsDerAdministrador() {
        return this.forsDerAdministrador;
    }

    public BigDecimal getForsDerNoCedito() {
        return this.forsDerNoCedito;
    }

    public String getForsDerNomAcredi() {
        return this.forsDerNomAcredi;
    }

    public BigDecimal getForsDerImporte() {
        return this.forsDerImporte;
    }

    public String getForsDerMoneda() {
        return this.forsDerMoneda;
    }

    public String getForsDerEstatusCred() {
        return this.forsDerEstatusCred;
    }

    public BigDecimal getForsDerFecValor() {
        return this.forsDerFecValor;
    }

    public String getForsDerDirInmueble() {
        return this.forsDerDirInmueble;
    }

    public String getForsDerEstado() {
        return this.forsDerEstado;
    }

    public String getForsDerEstatus() {
        return this.forsDerEstatus;
    }

    public BigDecimal getForsDerImpTotDer() {
        return this.forsDerImpTotDer;
    }

    public DMLObject getSelectByPK() {
        if (!retrieveSQL)
            return null;
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_BIENESGAR";
        String conditions = "";
        ArrayList values = new ArrayList();
        if (this.getFgrsIdFideicomiso() != null && this.getFgrsIdFideicomiso().longValue() == -999) {
            conditions += " AND FGRS_ID_FIDEICOMISO IS NULL";
        } else if (this.getFgrsIdFideicomiso() != null) {
            conditions += " AND FGRS_ID_FIDEICOMISO =?";
            values.add(this.getFgrsIdFideicomiso());
        }
        if (this.getFgrsIdSubcuenta() != null && this.getFgrsIdSubcuenta().longValue() == -999) {
            conditions += " AND FGRS_ID_SUBCUENTA IS NULL";
        } else if (this.getFgrsIdSubcuenta() != null) {
            conditions += " AND FGRS_ID_SUBCUENTA =?";
            values.add(this.getFgrsIdSubcuenta());
        }
        if (this.getForsIdGarantia() != null) {
            conditions += " AND FORS_ID_GARANTIA IS NULL";
        } else if (this.getForsIdGarantia() != null) {
            conditions += " AND FORS_ID_GARANTIA =?";
            values.add(this.getForsIdGarantia());
        }
        if (this.getForsCveTipoGarantia() != null ) {
            conditions += " AND FORS_CVE_TIPO_GARANTIA IS NULL";
        } else if (this.getForsCveTipoGarantia() != null) {
            conditions += " AND FORS_CVE_TIPO_GARANTIA =?";
            values.add(this.getForsCveTipoGarantia());
        }
        if (this.getForsCveTipoBien() != null) {
            conditions += " AND FORS_CVE_TIPO_BIEN IS NULL";
        } else if (this.getForsCveTipoBien() != null) {
            conditions += " AND FORS_CVE_TIPO_BIEN =?";
            values.add(this.getForsCveTipoBien());
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
        String sql = "SELECT * FROM F_BIENESGAR ";
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
        String sql = "UPDATE F_BIENESGAR SET ";
        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();
        conditions += " AND FGRS_ID_FIDEICOMISO = ?";
        pkValues.add(this.getFgrsIdFideicomiso());
        conditions += " AND FGRS_ID_SUBCUENTA = ?";
        pkValues.add(this.getFgrsIdSubcuenta());
        conditions += " AND FORS_ID_GARANTIA = ?";
        pkValues.add(this.getForsIdGarantia());
        conditions += " AND FORS_CVE_TIPO_GARANTIA = ?";
        pkValues.add(this.getForsCveTipoGarantia());
        conditions += " AND FORS_CVE_TIPO_BIEN = ?";
        pkValues.add(this.getForsCveTipoBien());
        fields += " FORS_INM_CSC = ?, ";
        values.add(this.getForsInmCsc());
        fields += " FORS_INM_SUBMATERIA = ?, ";
        values.add(this.getForsInmSubmateria());
        fields += " FORS_INM_ESTATUS = ?, ";
        values.add(this.getForsInmEstatus());
        fields += " FORS_INM_MONEDA = ?, ";
        values.add(this.getForsInmMoneda());
        fields += " FORS_INM_IMPORTE = ?, ";
        values.add(this.getForsInmImporte());
        fields += " FORS_INM_BENEFICIARIO = ?, ";
        values.add(this.getForsInmBeneficiario());
        fields += " FORS_INM_UNI_APODO_INM = ?, ";
        values.add(this.getForsInmUniApodoInm());
        fields += " FORS_INM_CALLE_AV = ?, ";
        values.add(this.getForsInmCalleAv());
        fields += " FORS_INM_NUM_EXT_MZA = ?, ";
        values.add(this.getForsInmNumExtMza());
        fields += " FORS_INM_NUM_INT_LT = ?, ";
        values.add(this.getForsInmNumIntLt());
        fields += " FORS_INM_COLONIA = ?, ";
        values.add(this.getForsInmColonia());
        fields += " FORS_INM_PAIS = ?, ";
        values.add(this.getForsInmPais());
        fields += " FORS_INM_ESTADO = ?, ";
        values.add(this.getForsInmEstado());
        fields += " FORS_INM_CIUDAD = ?, ";
        values.add(this.getForsInmCiudad());
        fields += " FORS_INM_DEL_MUN = ?, ";
        values.add(this.getForsInmDelMun());
        fields += " FORS_INM_CP = ?, ";
        values.add(this.getForsInmCp());
        fields += " FORS_INM_SUPERFICIE = ?, ";
        values.add(this.getForsInmSuperficie());
        fields += " FORS_INM_SUB_TIPO = ?, ";
        values.add(this.getForsInmSubTipo());
        fields += " FORS_INM_FEC_VALOR = ?, ";
        values.add(this.getForsInmFecValor());
        fields += " FORS_INM_CLAVE_CATAS = ?, ";
        values.add(this.getForsInmClaveCatas());
        fields += " FORS_INM_CUENTA_PRED = ?, ";
        values.add(this.getForsInmCuentaPred());
        fields += " FORS_INM_PEN_PREDIAL = ?, ";
        values.add(this.getForsInmPenPredial());
        fields += " FORS_INM_EMBARGO = ?, ";
        values.add(this.getForsInmEmbargo());
        fields += " FORS_INM_IMP_TOT_INM = ?, ";
        values.add(this.getForsInmImpTotInm());
        fields += " FORS_MUE_CSC = ?, ";
        values.add(this.getForsMueCsc());
        fields += " FORS_MUE_TIPO_DOC = ?, ";
        values.add(this.getForsMueTipoDoc());
        fields += " FORS_MUE_TIPO_COPIA = ?, ";
        values.add(this.getForsMueTipoCopia());
        fields += " FORS_MUE_NUMERO_DOC = ?, ";
        values.add(this.getForsMueNumeroDoc());
        fields += " FORS_MUE_FECHA_EXP = ?, ";
        values.add(this.getForsMueFechaExp());
        fields += " FORS_MUE_FECHA_VENC = ?, ";
        values.add(this.getForsMueFechaVenc());
        fields += " FORS_MUE_MONEDA = ?, ";
        values.add(this.getForsMueMoneda());
        fields += " FORS_MUE_VALOR_DOC = ?, ";
        values.add(this.getForsMueValorDoc());
        fields += " FORS_MUE_DESC_DOC = ?, ";
        values.add(this.getForsMueDescDoc());
        fields += " FORS_MUE_QUIEN_EXP_DOCU = ?, ";
        values.add(this.getForsMueQuienExpDocu());
        fields += " FORS_MUE_FAV_EXP_DOC = ?, ";
        values.add(this.getForsMueFavExpDoc());
        fields += " FORS_MUE_ENDOSO = ?, ";
        values.add(this.getForsMueEndoso());
        fields += " FORS_MUE_FEC_ENDOSO = ?, ";
        values.add(this.getForsMueFecEndoso());
        fields += " FORS_MUE_FEC_ENTRADA = ?, ";
        values.add(this.getForsMueFecEntrada());
        fields += " FORS_MUE_FEC_SALIDA = ?, ";
        values.add(this.getForsMueFecSalida());
        fields += " FORS_MUE_ESTATUS = ?, ";
        values.add(this.getForsMueEstatus());
        fields += " FORS_MUE_IMP_TOT_MUEB = ?, ";
        values.add(this.getForsMueImpTotMueb());
        fields += " FORS_DER_CSC = ?, ";
        values.add(this.getForsDerCsc());
        fields += " FORS_DER_ADMINISTRADOR = ?, ";
        values.add(this.getForsDerAdministrador());
        fields += " FORS_DER_NO_CEDITO = ?, ";
        values.add(this.getForsDerNoCedito());
        fields += " FORS_DER_NOM_ACREDI = ?, ";
        values.add(this.getForsDerNomAcredi());
        fields += " FORS_DER_IMPORTE = ?, ";
        values.add(this.getForsDerImporte());
        fields += " FORS_DER_MONEDA = ?, ";
        values.add(this.getForsDerMoneda());
        fields += " FORS_DER_ESTATUS_CRED = ?, ";
        values.add(this.getForsDerEstatusCred());
        fields += " FORS_DER_FEC_VALOR = ?, ";
        values.add(this.getForsDerFecValor());
        fields += " FORS_DER_DIR_INMUEBLE = ?, ";
        values.add(this.getForsDerDirInmueble());
        fields += " FORS_DER_ESTADO = ?, ";
        values.add(this.getForsDerEstado());
        fields += " FORS_DER_ESTATUS = ?, ";
        values.add(this.getForsDerEstatus());
        fields += " FORS_DER_IMP_TOT_DER = ?, ";
        values.add(this.getForsDerImpTotDer());
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
        String sql = "INSERT INTO F_BIENESGAR ( ";
        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();
        fields += ",FGRS_ID_FIDEICOMISO ";
        fieldValues += ", ?";
        values.add(this.getFgrsIdFideicomiso());
        fields += ",FGRS_ID_SUBCUENTA ";
        fieldValues += ", ?";
        values.add(this.getFgrsIdSubcuenta());
        fields += ",FORS_ID_GARANTIA ";
        fieldValues += ", ?";
        values.add(this.getForsIdGarantia());
        fields += ",FORS_CVE_TIPO_GARANTIA ";
        fieldValues += ", ?";
        values.add(this.getForsCveTipoGarantia());
        fields += ",FORS_CVE_TIPO_BIEN ";
        fieldValues += ", ?";
        values.add(this.getForsCveTipoBien());
        fields += ",FORS_INM_CSC ";
        fieldValues += ", ?";
        values.add(this.getForsInmCsc());
        fields += ",FORS_INM_SUBMATERIA ";
        fieldValues += ", ?";
        values.add(this.getForsInmSubmateria());
        fields += ",FORS_INM_ESTATUS ";
        fieldValues += ", ?";
        values.add(this.getForsInmEstatus());
        fields += ",FORS_INM_MONEDA ";
        fieldValues += ", ?";
        values.add(this.getForsInmMoneda());
        fields += ",FORS_INM_IMPORTE ";
        fieldValues += ", ?";
        values.add(this.getForsInmImporte());
        fields += ",FORS_INM_BENEFICIARIO ";
        fieldValues += ", ?";
        values.add(this.getForsInmBeneficiario());
        fields += ",FORS_INM_UNI_APODO_INM ";
        fieldValues += ", ?";
        values.add(this.getForsInmUniApodoInm());
        fields += ",FORS_INM_CALLE_AV ";
        fieldValues += ", ?";
        values.add(this.getForsInmCalleAv());
        fields += ",FORS_INM_NUM_EXT_MZA ";
        fieldValues += ", ?";
        values.add(this.getForsInmNumExtMza());
        fields += ",FORS_INM_NUM_INT_LT ";
        fieldValues += ", ?";
        values.add(this.getForsInmNumIntLt());
        fields += ",FORS_INM_COLONIA ";
        fieldValues += ", ?";
        values.add(this.getForsInmColonia());
        fields += ",FORS_INM_PAIS ";
        fieldValues += ", ?";
        values.add(this.getForsInmPais());
        fields += ",FORS_INM_ESTADO ";
        fieldValues += ", ?";
        values.add(this.getForsInmEstado());
        fields += ",FORS_INM_CIUDAD ";
        fieldValues += ", ?";
        values.add(this.getForsInmCiudad());
        fields += ",FORS_INM_DEL_MUN ";
        fieldValues += ", ?";
        values.add(this.getForsInmDelMun());
        fields += ",FORS_INM_CP ";
        fieldValues += ", ?";
        values.add(this.getForsInmCp());
        fields += ",FORS_INM_SUPERFICIE ";
        fieldValues += ", ?";
        values.add(this.getForsInmSuperficie());
        fields += ",FORS_INM_SUB_TIPO ";
        fieldValues += ", ?";
        values.add(this.getForsInmSubTipo());
        fields += ",FORS_INM_FEC_VALOR ";
        fieldValues += ", ?";
        values.add(this.getForsInmFecValor());
        fields += ",FORS_INM_CLAVE_CATAS ";
        fieldValues += ", ?";
        values.add(this.getForsInmClaveCatas());
        fields += ",FORS_INM_CUENTA_PRED ";
        fieldValues += ", ?";
        values.add(this.getForsInmCuentaPred());
        fields += ",FORS_INM_PEN_PREDIAL ";
        fieldValues += ", ?";
        values.add(this.getForsInmPenPredial());
        fields += ",FORS_INM_EMBARGO ";
        fieldValues += ", ?";
        values.add(this.getForsInmEmbargo());
        fields += ",FORS_INM_IMP_TOT_INM ";
        fieldValues += ", ?";
        values.add(this.getForsInmImpTotInm());
        fields += ",FORS_MUE_CSC ";
        fieldValues += ", ?";
        values.add(this.getForsMueCsc());
        fields += ",FORS_MUE_TIPO_DOC ";
        fieldValues += ", ?";
        values.add(this.getForsMueTipoDoc());
        fields += ",FORS_MUE_TIPO_COPIA ";
        fieldValues += ", ?";
        values.add(this.getForsMueTipoCopia());
        fields += ",FORS_MUE_NUMERO_DOC ";
        fieldValues += ", ?";
        values.add(this.getForsMueNumeroDoc());
        fields += ",FORS_MUE_FECHA_EXP ";
        fieldValues += ", ?";
        values.add(this.getForsMueFechaExp());
        fields += ",FORS_MUE_FECHA_VENC ";
        fieldValues += ", ?";
        values.add(this.getForsMueFechaVenc());
        fields += ",FORS_MUE_MONEDA ";
        fieldValues += ", ?";
        values.add(this.getForsMueMoneda());
        fields += ",FORS_MUE_VALOR_DOC ";
        fieldValues += ", ?";
        values.add(this.getForsMueValorDoc());
        fields += ",FORS_MUE_DESC_DOC ";
        fieldValues += ", ?";
        values.add(this.getForsMueDescDoc());
        fields += ",FORS_MUE_QUIEN_EXP_DOCU ";
        fieldValues += ", ?";
        values.add(this.getForsMueQuienExpDocu());
        fields += ",FORS_MUE_FAV_EXP_DOC ";
        fieldValues += ", ?";
        values.add(this.getForsMueFavExpDoc());
        fields += ",FORS_MUE_ENDOSO ";
        fieldValues += ", ?";
        values.add(this.getForsMueEndoso());
        fields += ",FORS_MUE_FEC_ENDOSO ";
        fieldValues += ", ?";
        values.add(this.getForsMueFecEndoso());
        fields += ",FORS_MUE_FEC_ENTRADA ";
        fieldValues += ", ?";
        values.add(this.getForsMueFecEntrada());
        fields += ",FORS_MUE_FEC_SALIDA ";
        fieldValues += ", ?";
        values.add(this.getForsMueFecSalida());
        fields += ",FORS_MUE_ESTATUS ";
        fieldValues += ", ?";
        values.add(this.getForsMueEstatus());
        fields += ",FORS_MUE_IMP_TOT_MUEB ";
        fieldValues += ", ?";
        values.add(this.getForsMueImpTotMueb());
        fields += ",FORS_DER_CSC ";
        fieldValues += ", ?";
        values.add(this.getForsDerCsc());
        fields += ",FORS_DER_ADMINISTRADOR ";
        fieldValues += ", ?";
        values.add(this.getForsDerAdministrador());
        fields += ",FORS_DER_NO_CEDITO ";
        fieldValues += ", ?";
        values.add(this.getForsDerNoCedito());
        fields += ",FORS_DER_NOM_ACREDI ";
        fieldValues += ", ?";
        values.add(this.getForsDerNomAcredi());
        fields += ",FORS_DER_IMPORTE ";
        fieldValues += ", ?";
        values.add(this.getForsDerImporte());
        fields += ",FORS_DER_MONEDA ";
        fieldValues += ", ?";
        values.add(this.getForsDerMoneda());
        fields += ",FORS_DER_ESTATUS_CRED ";
        fieldValues += ", ?";
        values.add(this.getForsDerEstatusCred());
        fields += ",FORS_DER_FEC_VALOR ";
        fieldValues += ", ?";
        values.add(this.getForsDerFecValor());
        fields += ",FORS_DER_DIR_INMUEBLE ";
        fieldValues += ", ?";
        values.add(this.getForsDerDirInmueble());
        fields += ",FORS_DER_ESTADO ";
        fieldValues += ", ?";
        values.add(this.getForsDerEstado());
        fields += ",FORS_DER_ESTATUS ";
        fieldValues += ", ?";
        values.add(this.getForsDerEstatus());
        fields += ",FORS_DER_IMP_TOT_DER ";
        fieldValues += ", ?";
        values.add(this.getForsDerImpTotDer());
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
        String sql = "DELETE FROM F_BIENESGAR WHERE ";
        String conditions = "";
        ArrayList values = new ArrayList();
        conditions += " AND FGRS_ID_FIDEICOMISO = ?";
        values.add(this.getFgrsIdFideicomiso());
        conditions += " AND FGRS_ID_SUBCUENTA = ?";
        values.add(this.getFgrsIdSubcuenta());
        conditions += " AND FORS_ID_GARANTIA = ?";
        values.add(this.getForsIdGarantia());
        conditions += " AND FORS_CVE_TIPO_GARANTIA = ?";
        values.add(this.getForsCveTipoGarantia());
        conditions += " AND FORS_CVE_TIPO_BIEN = ?";
        values.add(this.getForsCveTipoBien());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;
    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FBienesgar instance = (FBienesgar) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getFgrsIdFideicomiso().equals(instance.getFgrsIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getFgrsIdSubcuenta().equals(instance.getFgrsIdSubcuenta()))
            equalObjects = false;
        if (equalObjects && !this.getForsIdGarantia().equals(instance.getForsIdGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getForsCveTipoGarantia().equals(instance.getForsCveTipoGarantia()))
            equalObjects = false;
        if (equalObjects && !this.getForsCveTipoBien().equals(instance.getForsCveTipoBien()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmCsc().equals(instance.getForsInmCsc()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmSubmateria().equals(instance.getForsInmSubmateria()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmEstatus().equals(instance.getForsInmEstatus()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmMoneda().equals(instance.getForsInmMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmImporte().equals(instance.getForsInmImporte()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmBeneficiario().equals(instance.getForsInmBeneficiario()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmUniApodoInm().equals(instance.getForsInmUniApodoInm()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmCalleAv().equals(instance.getForsInmCalleAv()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmNumExtMza().equals(instance.getForsInmNumExtMza()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmNumIntLt().equals(instance.getForsInmNumIntLt()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmColonia().equals(instance.getForsInmColonia()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmPais().equals(instance.getForsInmPais()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmEstado().equals(instance.getForsInmEstado()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmCiudad().equals(instance.getForsInmCiudad()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmDelMun().equals(instance.getForsInmDelMun()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmCp().equals(instance.getForsInmCp()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmSuperficie().equals(instance.getForsInmSuperficie()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmSubTipo().equals(instance.getForsInmSubTipo()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmFecValor().equals(instance.getForsInmFecValor()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmClaveCatas().equals(instance.getForsInmClaveCatas()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmCuentaPred().equals(instance.getForsInmCuentaPred()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmPenPredial().equals(instance.getForsInmPenPredial()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmEmbargo().equals(instance.getForsInmEmbargo()))
            equalObjects = false;
        if (equalObjects && !this.getForsInmImpTotInm().equals(instance.getForsInmImpTotInm()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueCsc().equals(instance.getForsMueCsc()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueTipoDoc().equals(instance.getForsMueTipoDoc()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueTipoCopia().equals(instance.getForsMueTipoCopia()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueNumeroDoc().equals(instance.getForsMueNumeroDoc()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueFechaExp().equals(instance.getForsMueFechaExp()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueFechaVenc().equals(instance.getForsMueFechaVenc()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueMoneda().equals(instance.getForsMueMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueValorDoc().equals(instance.getForsMueValorDoc()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueDescDoc().equals(instance.getForsMueDescDoc()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueQuienExpDocu().equals(instance.getForsMueQuienExpDocu()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueFavExpDoc().equals(instance.getForsMueFavExpDoc()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueEndoso().equals(instance.getForsMueEndoso()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueFecEndoso().equals(instance.getForsMueFecEndoso()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueFecEntrada().equals(instance.getForsMueFecEntrada()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueFecSalida().equals(instance.getForsMueFecSalida()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueEstatus().equals(instance.getForsMueEstatus()))
            equalObjects = false;
        if (equalObjects && !this.getForsMueImpTotMueb().equals(instance.getForsMueImpTotMueb()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerCsc().equals(instance.getForsDerCsc()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerAdministrador().equals(instance.getForsDerAdministrador()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerNoCedito().equals(instance.getForsDerNoCedito()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerNomAcredi().equals(instance.getForsDerNomAcredi()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerImporte().equals(instance.getForsDerImporte()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerMoneda().equals(instance.getForsDerMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerEstatusCred().equals(instance.getForsDerEstatusCred()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerFecValor().equals(instance.getForsDerFecValor()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerDirInmueble().equals(instance.getForsDerDirInmueble()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerEstado().equals(instance.getForsDerEstado()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerEstatus().equals(instance.getForsDerEstatus()))
            equalObjects = false;
        if (equalObjects && !this.getForsDerImpTotDer().equals(instance.getForsDerImpTotDer()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FBienesgar result = new FBienesgar();
        DataRow objectData = null;
        objectData = selectAsDataRow();
        result.setFgrsIdFideicomiso((BigDecimal) objectData.getData("FGRS_ID_FIDEICOMISO"));
        result.setFgrsIdSubcuenta((BigDecimal) objectData.getData("FGRS_ID_SUBCUENTA"));
        result.setForsIdGarantia((String) objectData.getData("FORS_ID_GARANTIA"));
        result.setForsCveTipoGarantia((String) objectData.getData("FORS_CVE_TIPO_GARANTIA"));
        result.setForsCveTipoBien((String) objectData.getData("FORS_CVE_TIPO_BIEN"));
        result.setForsInmCsc((BigDecimal) objectData.getData("FORS_INM_CSC"));
        result.setForsInmSubmateria((String) objectData.getData("FORS_INM_SUBMATERIA"));
        result.setForsInmEstatus((String) objectData.getData("FORS_INM_ESTATUS"));
        result.setForsInmMoneda((String) objectData.getData("FORS_INM_MONEDA"));
        result.setForsInmImporte((BigDecimal) objectData.getData("FORS_INM_IMPORTE"));
        result.setForsInmBeneficiario((String) objectData.getData("FORS_INM_BENEFICIARIO"));
        result.setForsInmUniApodoInm((String) objectData.getData("FORS_INM_UNI_APODO_INM"));
        result.setForsInmCalleAv((String) objectData.getData("FORS_INM_CALLE_AV"));
        result.setForsInmNumExtMza((String) objectData.getData("FORS_INM_NUM_EXT_MZA"));
        result.setForsInmNumIntLt((String) objectData.getData("FORS_INM_NUM_INT_LT"));
        result.setForsInmColonia((String) objectData.getData("FORS_INM_COLONIA"));
        result.setForsInmPais((String) objectData.getData("FORS_INM_PAIS"));
        result.setForsInmEstado((String) objectData.getData("FORS_INM_ESTADO"));
        result.setForsInmCiudad((String) objectData.getData("FORS_INM_CIUDAD"));
        result.setForsInmDelMun((String) objectData.getData("FORS_INM_DEL_MUN"));
        result.setForsInmCp((BigDecimal) objectData.getData("FORS_INM_CP"));
        result.setForsInmSuperficie((BigDecimal) objectData.getData("FORS_INM_SUPERFICIE"));
        result.setForsInmSubTipo((String) objectData.getData("FORS_INM_SUB_TIPO"));
        result.setForsInmFecValor((BigDecimal) objectData.getData("FORS_INM_FEC_VALOR"));
        result.setForsInmClaveCatas((String) objectData.getData("FORS_INM_CLAVE_CATAS"));
        result.setForsInmCuentaPred((String) objectData.getData("FORS_INM_CUENTA_PRED"));
        result.setForsInmPenPredial((BigDecimal) objectData.getData("FORS_INM_PEN_PREDIAL"));
        result.setForsInmEmbargo((BigDecimal) objectData.getData("FORS_INM_EMBARGO"));
        result.setForsInmImpTotInm((BigDecimal) objectData.getData("FORS_INM_IMP_TOT_INM"));
        result.setForsMueCsc((BigDecimal) objectData.getData("FORS_MUE_CSC"));
        result.setForsMueTipoDoc((String) objectData.getData("FORS_MUE_TIPO_DOC"));
        result.setForsMueTipoCopia((String) objectData.getData("FORS_MUE_TIPO_COPIA"));
        result.setForsMueNumeroDoc((String) objectData.getData("FORS_MUE_NUMERO_DOC"));
        result.setForsMueFechaExp((BigDecimal) objectData.getData("FORS_MUE_FECHA_EXP"));
        result.setForsMueFechaVenc((BigDecimal) objectData.getData("FORS_MUE_FECHA_VENC"));
        result.setForsMueMoneda((String) objectData.getData("FORS_MUE_MONEDA"));
        result.setForsMueValorDoc((BigDecimal) objectData.getData("FORS_MUE_VALOR_DOC"));
        result.setForsMueDescDoc((String) objectData.getData("FORS_MUE_DESC_DOC"));
        result.setForsMueQuienExpDocu((String) objectData.getData("FORS_MUE_QUIEN_EXP_DOCU"));
        result.setForsMueFavExpDoc((String) objectData.getData("FORS_MUE_FAV_EXP_DOC"));
        result.setForsMueEndoso((String) objectData.getData("FORS_MUE_ENDOSO"));
        result.setForsMueFecEndoso((BigDecimal) objectData.getData("FORS_MUE_FEC_ENDOSO"));
        result.setForsMueFecEntrada((BigDecimal) objectData.getData("FORS_MUE_FEC_ENTRADA"));
        result.setForsMueFecSalida((BigDecimal) objectData.getData("FORS_MUE_FEC_SALIDA"));
        result.setForsMueEstatus((String) objectData.getData("FORS_MUE_ESTATUS"));
        result.setForsMueImpTotMueb((BigDecimal) objectData.getData("FORS_MUE_IMP_TOT_MUEB"));
        result.setForsDerCsc((BigDecimal) objectData.getData("FORS_DER_CSC"));
        result.setForsDerAdministrador((String) objectData.getData("FORS_DER_ADMINISTRADOR"));
        result.setForsDerNoCedito((BigDecimal) objectData.getData("FORS_DER_NO_CEDITO"));
        result.setForsDerNomAcredi((String) objectData.getData("FORS_DER_NOM_ACREDI"));
        result.setForsDerImporte((BigDecimal) objectData.getData("FORS_DER_IMPORTE"));
        result.setForsDerMoneda((String) objectData.getData("FORS_DER_MONEDA"));
        result.setForsDerEstatusCred((String) objectData.getData("FORS_DER_ESTATUS_CRED"));
        result.setForsDerFecValor((BigDecimal) objectData.getData("FORS_DER_FEC_VALOR"));
        result.setForsDerDirInmueble((String) objectData.getData("FORS_DER_DIR_INMUEBLE"));
        result.setForsDerEstado((String) objectData.getData("FORS_DER_ESTADO"));
        result.setForsDerEstatus((String) objectData.getData("FORS_DER_ESTATUS"));
        result.setForsDerImpTotDer((BigDecimal) objectData.getData("FORS_DER_IMP_TOT_DER"));
        return result;
    }
}
