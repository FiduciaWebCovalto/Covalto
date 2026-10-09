package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "F_EMISION_PK", columns = { "EEMI_ID_PROGRAMA", "EEMI_ID_FIDEICOMISO", "EEMI_ID_EMISION" }, sequences = { "MANUAL" })
public class FEmision extends DomainObject {

    BigDecimal eemiIdPrograma = null;
    BigDecimal eemiIdFideicomiso = null;
    BigDecimal eemiIdEmision = null;
    String eemiNomEmisor = null;
    String eemiCveInstrumento = null;
    String eemiCvePizarra = null;
    String eemiNumSerie = null;
    BigDecimal eemiImpEmision = null;
    BigDecimal eemiNumTitulos = null;
    BigDecimal eemiImpNomEmision = null;
    BigDecimal eemiNumMoneda = null;
    String eemiDestinoRecurso = null;
    BigDecimal eemiAnoPlazo = null;
    BigDecimal eemiDiasPlazo = null;
    String eemiFecInicio = null;
    String eemiFecVencimiento = null;
    String eemiRepComun = null;
    String eemiIntColocador = null;
    String eemiAutorizacionCnbv = null;
    String eemiFecCnbv = null;
    String eemiAutorizacionBanxico = null;
    String eemiFecBanxico = null;
    String eemiFecSerie = null;
    String eemiFecSubasta = null;
    String eemiFecOfrecimiento = null;
    String eemiFecEmision = null;
    String eemiFecBolsa = null;
    String eemiFecCruce = null;
    String eemiFecLiquidacion = null;
    String eemiTipoSubasta = null;
    String eemiActoConstitutivo = null;
    String eemiComiteTecnico = null;
    BigDecimal eemiRepoDist = null;
    String eemiFecAlta = null;
    String eemiFecMod = null;
    String eemiStEmision = null;
    String eemiTipoNegocio = null;

    public FEmision() {
        super();
        this.pkColumns = 3;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEemiIdPrograma(BigDecimal eemiIdPrograma) {
        this.eemiIdPrograma = eemiIdPrograma;
    }

    public BigDecimal getEemiIdPrograma() {
        return this.eemiIdPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEemiIdFideicomiso(BigDecimal eemiIdFideicomiso) {
        this.eemiIdFideicomiso = eemiIdFideicomiso;
    }

    public BigDecimal getEemiIdFideicomiso() {
        return this.eemiIdFideicomiso;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEemiIdEmision(BigDecimal eemiIdEmision) {
        this.eemiIdEmision = eemiIdEmision;
    }

    public BigDecimal getEemiIdEmision() {
        return this.eemiIdEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiNomEmisor(String eemiNomEmisor) {
        this.eemiNomEmisor = eemiNomEmisor;
    }

    public String getEemiNomEmisor() {
        return this.eemiNomEmisor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiCveInstrumento(String eemiCveInstrumento) {
        this.eemiCveInstrumento = eemiCveInstrumento;
    }

    public String getEemiCveInstrumento() {
        return this.eemiCveInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiCvePizarra(String eemiCvePizarra) {
        this.eemiCvePizarra = eemiCvePizarra;
    }

    public String getEemiCvePizarra() {
        return this.eemiCvePizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiNumSerie(String eemiNumSerie) {
        this.eemiNumSerie = eemiNumSerie;
    }

    public String getEemiNumSerie() {
        return this.eemiNumSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEemiImpEmision(BigDecimal eemiImpEmision) {
        this.eemiImpEmision = eemiImpEmision;
    }

    public BigDecimal getEemiImpEmision() {
        return this.eemiImpEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEemiNumTitulos(BigDecimal eemiNumTitulos) {
        this.eemiNumTitulos = eemiNumTitulos;
    }

    public BigDecimal getEemiNumTitulos() {
        return this.eemiNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setEemiImpNomEmision(BigDecimal eemiImpNomEmision) {
        this.eemiImpNomEmision = eemiImpNomEmision;
    }

    public BigDecimal getEemiImpNomEmision() {
        return this.eemiImpNomEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEemiNumMoneda(BigDecimal eemiNumMoneda) {
        this.eemiNumMoneda = eemiNumMoneda;
    }

    public BigDecimal getEemiNumMoneda() {
        return this.eemiNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiDestinoRecurso(String eemiDestinoRecurso) {
        this.eemiDestinoRecurso = eemiDestinoRecurso;
    }

    public String getEemiDestinoRecurso() {
        return this.eemiDestinoRecurso;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEemiAnoPlazo(BigDecimal eemiAnoPlazo) {
        this.eemiAnoPlazo = eemiAnoPlazo;
    }

    public BigDecimal getEemiAnoPlazo() {
        return this.eemiAnoPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setEemiDiasPlazo(BigDecimal eemiDiasPlazo) {
        this.eemiDiasPlazo = eemiDiasPlazo;
    }

    public BigDecimal getEemiDiasPlazo() {
        return this.eemiDiasPlazo;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecInicio(String eemiFecInicio) {
        this.eemiFecInicio = eemiFecInicio;
    }

    public String getEemiFecInicio() {
        return this.eemiFecInicio;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecVencimiento(String eemiFecVencimiento) {
        this.eemiFecVencimiento = eemiFecVencimiento;
    }

    public String getEemiFecVencimiento() {
        return this.eemiFecVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiRepComun(String eemiRepComun) {
        this.eemiRepComun = eemiRepComun;
    }

    public String getEemiRepComun() {
        return this.eemiRepComun;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiIntColocador(String eemiIntColocador) {
        this.eemiIntColocador = eemiIntColocador;
    }

    public String getEemiIntColocador() {
        return this.eemiIntColocador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiAutorizacionCnbv(String eemiAutorizacionCnbv) {
        this.eemiAutorizacionCnbv = eemiAutorizacionCnbv;
    }

    public String getEemiAutorizacionCnbv() {
        return this.eemiAutorizacionCnbv;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecCnbv(String eemiFecCnbv) {
        this.eemiFecCnbv = eemiFecCnbv;
    }

    public String getEemiFecCnbv() {
        return this.eemiFecCnbv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiAutorizacionBanxico(String eemiAutorizacionBanxico) {
        this.eemiAutorizacionBanxico = eemiAutorizacionBanxico;
    }

    public String getEemiAutorizacionBanxico() {
        return this.eemiAutorizacionBanxico;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecBanxico(String eemiFecBanxico) {
        this.eemiFecBanxico = eemiFecBanxico;
    }

    public String getEemiFecBanxico() {
        return this.eemiFecBanxico;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecSerie(String eemiFecSerie) {
        this.eemiFecSerie = eemiFecSerie;
    }

    public String getEemiFecSerie() {
        return this.eemiFecSerie;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecSubasta(String eemiFecSubasta) {
        this.eemiFecSubasta = eemiFecSubasta;
    }

    public String getEemiFecSubasta() {
        return this.eemiFecSubasta;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecOfrecimiento(String eemiFecOfrecimiento) {
        this.eemiFecOfrecimiento = eemiFecOfrecimiento;
    }

    public String getEemiFecOfrecimiento() {
        return this.eemiFecOfrecimiento;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecEmision(String eemiFecEmision) {
        this.eemiFecEmision = eemiFecEmision;
    }

    public String getEemiFecEmision() {
        return this.eemiFecEmision;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecBolsa(String eemiFecBolsa) {
        this.eemiFecBolsa = eemiFecBolsa;
    }

    public String getEemiFecBolsa() {
        return this.eemiFecBolsa;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecCruce(String eemiFecCruce) {
        this.eemiFecCruce = eemiFecCruce;
    }

    public String getEemiFecCruce() {
        return this.eemiFecCruce;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecLiquidacion(String eemiFecLiquidacion) {
        this.eemiFecLiquidacion = eemiFecLiquidacion;
    }

    public String getEemiFecLiquidacion() {
        return this.eemiFecLiquidacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiTipoSubasta(String eemiTipoSubasta) {
        this.eemiTipoSubasta = eemiTipoSubasta;
    }

    public String getEemiTipoSubasta() {
        return this.eemiTipoSubasta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiActoConstitutivo(String eemiActoConstitutivo) {
        this.eemiActoConstitutivo = eemiActoConstitutivo;
    }

    public String getEemiActoConstitutivo() {
        return this.eemiActoConstitutivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiComiteTecnico(String eemiComiteTecnico) {
        this.eemiComiteTecnico = eemiComiteTecnico;
    }

    public String getEemiComiteTecnico() {
        return this.eemiComiteTecnico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setEemiRepoDist(BigDecimal eemiRepoDist) {
        this.eemiRepoDist = eemiRepoDist;
    }

    public BigDecimal getEemiRepoDist() {
        return this.eemiRepoDist;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecAlta(String eemiFecAlta) {
        this.eemiFecAlta = eemiFecAlta;
    }

    public String getEemiFecAlta() {
        return this.eemiFecAlta;
    }

    @FieldInfo(nullable = true, dataType = "DATE", javaClass = String.class)
    public void setEemiFecMod(String eemiFecMod) {
        this.eemiFecMod = eemiFecMod;
    }

    public String getEemiFecMod() {
        return this.eemiFecMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiStEmision(String eemiStEmision) {
        this.eemiStEmision = eemiStEmision;
    }

    public String getEemiStEmision() {
        return this.eemiStEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setEemiTipoNegocio(String eemiTipoNegocio) {
        this.eemiTipoNegocio = eemiTipoNegocio;
    }

    public String getEemiTipoNegocio() {
        return this.eemiTipoNegocio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM F_EMISION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEemiIdPrograma() != null && this.getEemiIdPrograma().longValue() == -999) {
            conditions += " AND EEMI_ID_PROGRAMA IS NULL";
        } else if (this.getEemiIdPrograma() != null) {
            conditions += " AND EEMI_ID_PROGRAMA = ?";
            values.add(this.getEemiIdPrograma());
        }

        if (this.getEemiIdFideicomiso() != null && this.getEemiIdFideicomiso().longValue() == -999) {
            conditions += " AND EEMI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEemiIdFideicomiso() != null) {
            conditions += " AND EEMI_ID_FIDEICOMISO = ?";
            values.add(this.getEemiIdFideicomiso());
        }

        if (this.getEemiIdEmision() != null && this.getEemiIdEmision().longValue() == -999) {
            conditions += " AND EEMI_ID_EMISION IS NULL";
        } else if (this.getEemiIdEmision() != null) {
            conditions += " AND EEMI_ID_EMISION = ?";
            values.add(this.getEemiIdEmision());
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
        String sql = "SELECT * FROM F_EMISION ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getEemiIdPrograma() != null && this.getEemiIdPrograma().longValue() == -999) {
            conditions += " AND EEMI_ID_PROGRAMA IS NULL";
        } else if (this.getEemiIdPrograma() != null) {
            conditions += " AND EEMI_ID_PROGRAMA = ?";
            values.add(this.getEemiIdPrograma());
        }

        if (this.getEemiIdFideicomiso() != null && this.getEemiIdFideicomiso().longValue() == -999) {
            conditions += " AND EEMI_ID_FIDEICOMISO IS NULL";
        } else if (this.getEemiIdFideicomiso() != null) {
            conditions += " AND EEMI_ID_FIDEICOMISO = ?";
            values.add(this.getEemiIdFideicomiso());
        }

        if (this.getEemiIdEmision() != null && this.getEemiIdEmision().longValue() == -999) {
            conditions += " AND EEMI_ID_EMISION IS NULL";
        } else if (this.getEemiIdEmision() != null) {
            conditions += " AND EEMI_ID_EMISION = ?";
            values.add(this.getEemiIdEmision());
        }

        if (this.getEemiNomEmisor() != null && "null".equals(this.getEemiNomEmisor())) {
            conditions += " AND EEMI_NOM_EMISOR IS NULL";
        } else if (this.getEemiNomEmisor() != null) {
            conditions += " AND EEMI_NOM_EMISOR = ?";
            values.add(this.getEemiNomEmisor());
        }

        if (this.getEemiCveInstrumento() != null && "null".equals(this.getEemiCveInstrumento())) {
            conditions += " AND EEMI_CVE_INSTRUMENTO IS NULL";
        } else if (this.getEemiCveInstrumento() != null) {
            conditions += " AND EEMI_CVE_INSTRUMENTO = ?";
            values.add(this.getEemiCveInstrumento());
        }

        if (this.getEemiCvePizarra() != null && "null".equals(this.getEemiCvePizarra())) {
            conditions += " AND EEMI_CVE_PIZARRA IS NULL";
        } else if (this.getEemiCvePizarra() != null) {
            conditions += " AND EEMI_CVE_PIZARRA = ?";
            values.add(this.getEemiCvePizarra());
        }

        if (this.getEemiNumSerie() != null && "null".equals(this.getEemiNumSerie())) {
            conditions += " AND EEMI_NUM_SERIE IS NULL";
        } else if (this.getEemiNumSerie() != null) {
            conditions += " AND EEMI_NUM_SERIE = ?";
            values.add(this.getEemiNumSerie());
        }

        if (this.getEemiImpEmision() != null && this.getEemiImpEmision().longValue() == -999) {
            conditions += " AND EEMI_IMP_EMISION IS NULL";
        } else if (this.getEemiImpEmision() != null) {
            conditions += " AND EEMI_IMP_EMISION = ?";
            values.add(this.getEemiImpEmision());
        }

        if (this.getEemiNumTitulos() != null && this.getEemiNumTitulos().longValue() == -999) {
            conditions += " AND EEMI_NUM_TITULOS IS NULL";
        } else if (this.getEemiNumTitulos() != null) {
            conditions += " AND EEMI_NUM_TITULOS = ?";
            values.add(this.getEemiNumTitulos());
        }

        if (this.getEemiImpNomEmision() != null && this.getEemiImpNomEmision().longValue() == -999) {
            conditions += " AND EEMI_IMP_NOM_EMISION IS NULL";
        } else if (this.getEemiImpNomEmision() != null) {
            conditions += " AND EEMI_IMP_NOM_EMISION = ?";
            values.add(this.getEemiImpNomEmision());
        }

        if (this.getEemiNumMoneda() != null && this.getEemiNumMoneda().longValue() == -999) {
            conditions += " AND EEMI_NUM_MONEDA IS NULL";
        } else if (this.getEemiNumMoneda() != null) {
            conditions += " AND EEMI_NUM_MONEDA = ?";
            values.add(this.getEemiNumMoneda());
        }

        if (this.getEemiDestinoRecurso() != null && "null".equals(this.getEemiDestinoRecurso())) {
            conditions += " AND EEMI_DESTINO_RECURSO IS NULL";
        } else if (this.getEemiDestinoRecurso() != null) {
            conditions += " AND EEMI_DESTINO_RECURSO = ?";
            values.add(this.getEemiDestinoRecurso());
        }

        if (this.getEemiAnoPlazo() != null && this.getEemiAnoPlazo().longValue() == -999) {
            conditions += " AND EEMI_ANO_PLAZO IS NULL";
        } else if (this.getEemiAnoPlazo() != null) {
            conditions += " AND EEMI_ANO_PLAZO = ?";
            values.add(this.getEemiAnoPlazo());
        }

        if (this.getEemiDiasPlazo() != null && this.getEemiDiasPlazo().longValue() == -999) {
            conditions += " AND EEMI_DIAS_PLAZO IS NULL";
        } else if (this.getEemiDiasPlazo() != null) {
            conditions += " AND EEMI_DIAS_PLAZO = ?";
            values.add(this.getEemiDiasPlazo());
        }

        if (this.getEemiFecInicio() != null && "null".equals(this.getEemiFecInicio())) {
            conditions += " AND EEMI_FEC_INICIO IS NULL";
        } else if (this.getEemiFecInicio() != null) {
            conditions += " AND EEMI_FEC_INICIO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecInicio());
        }

        if (this.getEemiFecVencimiento() != null && "null".equals(this.getEemiFecVencimiento())) {
            conditions += " AND EEMI_FEC_VENCIMIENTO IS NULL";
        } else if (this.getEemiFecVencimiento() != null) {
            conditions += " AND EEMI_FEC_VENCIMIENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecVencimiento());
        }

        if (this.getEemiRepComun() != null && "null".equals(this.getEemiRepComun())) {
            conditions += " AND EEMI_REP_COMUN IS NULL";
        } else if (this.getEemiRepComun() != null) {
            conditions += " AND EEMI_REP_COMUN = ?";
            values.add(this.getEemiRepComun());
        }

        if (this.getEemiIntColocador() != null && "null".equals(this.getEemiIntColocador())) {
            conditions += " AND EEMI_INT_COLOCADOR IS NULL";
        } else if (this.getEemiIntColocador() != null) {
            conditions += " AND EEMI_INT_COLOCADOR = ?";
            values.add(this.getEemiIntColocador());
        }

        if (this.getEemiAutorizacionCnbv() != null && "null".equals(this.getEemiAutorizacionCnbv())) {
            conditions += " AND EEMI_AUTORIZACION_CNBV IS NULL";
        } else if (this.getEemiAutorizacionCnbv() != null) {
            conditions += " AND EEMI_AUTORIZACION_CNBV = ?";
            values.add(this.getEemiAutorizacionCnbv());
        }

        if (this.getEemiFecCnbv() != null && "null".equals(this.getEemiFecCnbv())) {
            conditions += " AND EEMI_FEC_CNBV IS NULL";
        } else if (this.getEemiFecCnbv() != null) {
            conditions += " AND EEMI_FEC_CNBV = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecCnbv());
        }

        if (this.getEemiAutorizacionBanxico() != null && "null".equals(this.getEemiAutorizacionBanxico())) {
            conditions += " AND EEMI_AUTORIZACION_BANXICO IS NULL";
        } else if (this.getEemiAutorizacionBanxico() != null) {
            conditions += " AND EEMI_AUTORIZACION_BANXICO = ?";
            values.add(this.getEemiAutorizacionBanxico());
        }

        if (this.getEemiFecBanxico() != null && "null".equals(this.getEemiFecBanxico())) {
            conditions += " AND EEMI_FEC_BANXICO IS NULL";
        } else if (this.getEemiFecBanxico() != null) {
            conditions += " AND EEMI_FEC_BANXICO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecBanxico());
        }

        if (this.getEemiFecSerie() != null && "null".equals(this.getEemiFecSerie())) {
            conditions += " AND EEMI_FEC_SERIE IS NULL";
        } else if (this.getEemiFecSerie() != null) {
            conditions += " AND EEMI_FEC_SERIE = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecSerie());
        }

        if (this.getEemiFecSubasta() != null && "null".equals(this.getEemiFecSubasta())) {
            conditions += " AND EEMI_FEC_SUBASTA IS NULL";
        } else if (this.getEemiFecSubasta() != null) {
            conditions += " AND EEMI_FEC_SUBASTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecSubasta());
        }

        if (this.getEemiFecOfrecimiento() != null && "null".equals(this.getEemiFecOfrecimiento())) {
            conditions += " AND EEMI_FEC_OFRECIMIENTO IS NULL";
        } else if (this.getEemiFecOfrecimiento() != null) {
            conditions += " AND EEMI_FEC_OFRECIMIENTO = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecOfrecimiento());
        }

        if (this.getEemiFecEmision() != null && "null".equals(this.getEemiFecEmision())) {
            conditions += " AND EEMI_FEC_EMISION IS NULL";
        } else if (this.getEemiFecEmision() != null) {
            conditions += " AND EEMI_FEC_EMISION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecEmision());
        }

        if (this.getEemiFecBolsa() != null && "null".equals(this.getEemiFecBolsa())) {
            conditions += " AND EEMI_FEC_BOLSA IS NULL";
        } else if (this.getEemiFecBolsa() != null) {
            conditions += " AND EEMI_FEC_BOLSA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecBolsa());
        }

        if (this.getEemiFecCruce() != null && "null".equals(this.getEemiFecCruce())) {
            conditions += " AND EEMI_FEC_CRUCE IS NULL";
        } else if (this.getEemiFecCruce() != null) {
            conditions += " AND EEMI_FEC_CRUCE = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecCruce());
        }

        if (this.getEemiFecLiquidacion() != null && "null".equals(this.getEemiFecLiquidacion())) {
            conditions += " AND EEMI_FEC_LIQUIDACION IS NULL";
        } else if (this.getEemiFecLiquidacion() != null) {
            conditions += " AND EEMI_FEC_LIQUIDACION = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecLiquidacion());
        }

        if (this.getEemiTipoSubasta() != null && "null".equals(this.getEemiTipoSubasta())) {
            conditions += " AND EEMI_TIPO_SUBASTA IS NULL";
        } else if (this.getEemiTipoSubasta() != null) {
            conditions += " AND EEMI_TIPO_SUBASTA = ?";
            values.add(this.getEemiTipoSubasta());
        }

        if (this.getEemiActoConstitutivo() != null && "null".equals(this.getEemiActoConstitutivo())) {
            conditions += " AND EEMI_ACTO_CONSTITUTIVO IS NULL";
        } else if (this.getEemiActoConstitutivo() != null) {
            conditions += " AND EEMI_ACTO_CONSTITUTIVO = ?";
            values.add(this.getEemiActoConstitutivo());
        }

        if (this.getEemiComiteTecnico() != null && "null".equals(this.getEemiComiteTecnico())) {
            conditions += " AND EEMI_COMITE_TECNICO IS NULL";
        } else if (this.getEemiComiteTecnico() != null) {
            conditions += " AND EEMI_COMITE_TECNICO = ?";
            values.add(this.getEemiComiteTecnico());
        }

        if (this.getEemiRepoDist() != null && this.getEemiRepoDist().longValue() == -999) {
            conditions += " AND EEMI_REPO_DIST IS NULL";
        } else if (this.getEemiRepoDist() != null) {
            conditions += " AND EEMI_REPO_DIST = ?";
            values.add(this.getEemiRepoDist());
        }

        if (this.getEemiFecAlta() != null && "null".equals(this.getEemiFecAlta())) {
            conditions += " AND EEMI_FEC_ALTA IS NULL";
        } else if (this.getEemiFecAlta() != null) {
            conditions += " AND EEMI_FEC_ALTA = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecAlta());
        }

        if (this.getEemiFecMod() != null && "null".equals(this.getEemiFecMod())) {
            conditions += " AND EEMI_FEC_MOD IS NULL";
        } else if (this.getEemiFecMod() != null) {
            conditions += " AND EEMI_FEC_MOD = TO_DATE(?,'dd/MM/yyyy')";
            values.add(this.getEemiFecMod());
        }

        if (this.getEemiStEmision() != null && "null".equals(this.getEemiStEmision())) {
            conditions += " AND EEMI_ST_EMISION IS NULL";
        } else if (this.getEemiStEmision() != null) {
            conditions += " AND EEMI_ST_EMISION = ?";
            values.add(this.getEemiStEmision());
        }

        if (this.getEemiTipoNegocio() != null && "null".equals(this.getEemiTipoNegocio())) {
            conditions += " AND EEMI_TIPO_NEGOCIO IS NULL";
        } else if (this.getEemiTipoNegocio() != null) {
            conditions += " AND EEMI_TIPO_NEGOCIO = ?";
            values.add(this.getEemiTipoNegocio());
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
        String sql = "UPDATE F_EMISION SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EEMI_ID_PROGRAMA = ?";
        pkValues.add(this.getEemiIdPrograma());
        conditions += " AND EEMI_ID_FIDEICOMISO = ?";
        pkValues.add(this.getEemiIdFideicomiso());
        conditions += " AND EEMI_ID_EMISION = ?";
        pkValues.add(this.getEemiIdEmision());
        fields += " EEMI_NOM_EMISOR = ?, ";
        values.add(this.getEemiNomEmisor());
        fields += " EEMI_CVE_INSTRUMENTO = ?, ";
        values.add(this.getEemiCveInstrumento());
        fields += " EEMI_CVE_PIZARRA = ?, ";
        values.add(this.getEemiCvePizarra());
        fields += " EEMI_NUM_SERIE = ?, ";
        values.add(this.getEemiNumSerie());
        fields += " EEMI_IMP_EMISION = ?, ";
        values.add(this.getEemiImpEmision());
        fields += " EEMI_NUM_TITULOS = ?, ";
        values.add(this.getEemiNumTitulos());
        fields += " EEMI_IMP_NOM_EMISION = ?, ";
        values.add(this.getEemiImpNomEmision());
        fields += " EEMI_NUM_MONEDA = ?, ";
        values.add(this.getEemiNumMoneda());
        fields += " EEMI_DESTINO_RECURSO = ?, ";
        values.add(this.getEemiDestinoRecurso());
        fields += " EEMI_ANO_PLAZO = ?, ";
        values.add(this.getEemiAnoPlazo());
        fields += " EEMI_DIAS_PLAZO = ?, ";
        values.add(this.getEemiDiasPlazo());
        fields += " EEMI_FEC_INICIO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecInicio());
        fields += " EEMI_FEC_VENCIMIENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecVencimiento());
        fields += " EEMI_REP_COMUN = ?, ";
        values.add(this.getEemiRepComun());
        fields += " EEMI_INT_COLOCADOR = ?, ";
        values.add(this.getEemiIntColocador());
        fields += " EEMI_AUTORIZACION_CNBV = ?, ";
        values.add(this.getEemiAutorizacionCnbv());
        fields += " EEMI_FEC_CNBV = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecCnbv());
        fields += " EEMI_AUTORIZACION_BANXICO = ?, ";
        values.add(this.getEemiAutorizacionBanxico());
        fields += " EEMI_FEC_BANXICO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecBanxico());
        fields += " EEMI_FEC_SERIE = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecSerie());
        fields += " EEMI_FEC_SUBASTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecSubasta());
        fields += " EEMI_FEC_OFRECIMIENTO = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecOfrecimiento());
        fields += " EEMI_FEC_EMISION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecEmision());
        fields += " EEMI_FEC_BOLSA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecBolsa());
        fields += " EEMI_FEC_CRUCE = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecCruce());
        fields += " EEMI_FEC_LIQUIDACION = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecLiquidacion());
        fields += " EEMI_TIPO_SUBASTA = ?, ";
        values.add(this.getEemiTipoSubasta());
        fields += " EEMI_ACTO_CONSTITUTIVO = ?, ";
        values.add(this.getEemiActoConstitutivo());
        fields += " EEMI_COMITE_TECNICO = ?, ";
        values.add(this.getEemiComiteTecnico());
        fields += " EEMI_REPO_DIST = ?, ";
        values.add(this.getEemiRepoDist());
        fields += " EEMI_FEC_ALTA = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecAlta());
        fields += " EEMI_FEC_MOD = TO_DATE(?, 'dd/MM/yyyy'), ";
        values.add(this.getEemiFecMod());
        fields += " EEMI_ST_EMISION = ?, ";
        values.add(this.getEemiStEmision());
        fields += " EEMI_TIPO_NEGOCIO = ?, ";
        values.add(this.getEemiTipoNegocio());
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
        String sql = "INSERT INTO F_EMISION ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EEMI_ID_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getEemiIdPrograma());

        fields += ", EEMI_ID_FIDEICOMISO";
        fieldValues += ", ?";
        values.add(this.getEemiIdFideicomiso());

        fields += ", EEMI_ID_EMISION";
        fieldValues += ", ?";
        values.add(this.getEemiIdEmision());

        fields += ", EEMI_NOM_EMISOR";
        fieldValues += ", ?";
        values.add(this.getEemiNomEmisor());

        fields += ", EEMI_CVE_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getEemiCveInstrumento());

        fields += ", EEMI_CVE_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getEemiCvePizarra());

        fields += ", EEMI_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getEemiNumSerie());

        fields += ", EEMI_IMP_EMISION";
        fieldValues += ", ?";
        values.add(this.getEemiImpEmision());

        fields += ", EEMI_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getEemiNumTitulos());

        fields += ", EEMI_IMP_NOM_EMISION";
        fieldValues += ", ?";
        values.add(this.getEemiImpNomEmision());

        fields += ", EEMI_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getEemiNumMoneda());

        fields += ", EEMI_DESTINO_RECURSO";
        fieldValues += ", ?";
        values.add(this.getEemiDestinoRecurso());

        fields += ", EEMI_ANO_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEemiAnoPlazo());

        fields += ", EEMI_DIAS_PLAZO";
        fieldValues += ", ?";
        values.add(this.getEemiDiasPlazo());

        fields += ", EEMI_FEC_INICIO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecInicio());

        fields += ", EEMI_FEC_VENCIMIENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecVencimiento());

        fields += ", EEMI_REP_COMUN";
        fieldValues += ", ?";
        values.add(this.getEemiRepComun());

        fields += ", EEMI_INT_COLOCADOR";
        fieldValues += ", ?";
        values.add(this.getEemiIntColocador());

        fields += ", EEMI_AUTORIZACION_CNBV";
        fieldValues += ", ?";
        values.add(this.getEemiAutorizacionCnbv());

        fields += ", EEMI_FEC_CNBV";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecCnbv());

        fields += ", EEMI_AUTORIZACION_BANXICO";
        fieldValues += ", ?";
        values.add(this.getEemiAutorizacionBanxico());

        fields += ", EEMI_FEC_BANXICO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecBanxico());

        fields += ", EEMI_FEC_SERIE";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecSerie());

        fields += ", EEMI_FEC_SUBASTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecSubasta());

        fields += ", EEMI_FEC_OFRECIMIENTO";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecOfrecimiento());

        fields += ", EEMI_FEC_EMISION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecEmision());

        fields += ", EEMI_FEC_BOLSA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecBolsa());

        fields += ", EEMI_FEC_CRUCE";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecCruce());

        fields += ", EEMI_FEC_LIQUIDACION";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecLiquidacion());

        fields += ", EEMI_TIPO_SUBASTA";
        fieldValues += ", ?";
        values.add(this.getEemiTipoSubasta());

        fields += ", EEMI_ACTO_CONSTITUTIVO";
        fieldValues += ", ?";
        values.add(this.getEemiActoConstitutivo());

        fields += ", EEMI_COMITE_TECNICO";
        fieldValues += ", ?";
        values.add(this.getEemiComiteTecnico());

        fields += ", EEMI_REPO_DIST";
        fieldValues += ", ?";
        values.add(this.getEemiRepoDist());

        fields += ", EEMI_FEC_ALTA";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecAlta());

        fields += ", EEMI_FEC_MOD";
        fieldValues += ", TO_DATE(?, 'dd/MM/yyyy') ";
        values.add(this.getEemiFecMod());

        fields += ", EEMI_ST_EMISION";
        fieldValues += ", ?";
        values.add(this.getEemiStEmision());

        fields += ", EEMI_TIPO_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getEemiTipoNegocio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM F_EMISION WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EEMI_ID_PROGRAMA = ?";
        values.add(this.getEemiIdPrograma());
        conditions += " AND EEMI_ID_FIDEICOMISO = ?";
        values.add(this.getEemiIdFideicomiso());
        conditions += " AND EEMI_ID_EMISION = ?";
        values.add(this.getEemiIdEmision());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        FEmision instance = (FEmision) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getEemiIdPrograma().equals(instance.getEemiIdPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getEemiIdFideicomiso().equals(instance.getEemiIdFideicomiso()))
            equalObjects = false;
        if (equalObjects && !this.getEemiIdEmision().equals(instance.getEemiIdEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEemiNomEmisor().equals(instance.getEemiNomEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getEemiCveInstrumento().equals(instance.getEemiCveInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getEemiCvePizarra().equals(instance.getEemiCvePizarra()))
            equalObjects = false;
        if (equalObjects && !this.getEemiNumSerie().equals(instance.getEemiNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEemiImpEmision().equals(instance.getEemiImpEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEemiNumTitulos().equals(instance.getEemiNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getEemiImpNomEmision().equals(instance.getEemiImpNomEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEemiNumMoneda().equals(instance.getEemiNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getEemiDestinoRecurso().equals(instance.getEemiDestinoRecurso()))
            equalObjects = false;
        if (equalObjects && !this.getEemiAnoPlazo().equals(instance.getEemiAnoPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEemiDiasPlazo().equals(instance.getEemiDiasPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecInicio().equals(instance.getEemiFecInicio()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecVencimiento().equals(instance.getEemiFecVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getEemiRepComun().equals(instance.getEemiRepComun()))
            equalObjects = false;
        if (equalObjects && !this.getEemiIntColocador().equals(instance.getEemiIntColocador()))
            equalObjects = false;
        if (equalObjects && !this.getEemiAutorizacionCnbv().equals(instance.getEemiAutorizacionCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecCnbv().equals(instance.getEemiFecCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getEemiAutorizacionBanxico().equals(instance.getEemiAutorizacionBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecBanxico().equals(instance.getEemiFecBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecSerie().equals(instance.getEemiFecSerie()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecSubasta().equals(instance.getEemiFecSubasta()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecOfrecimiento().equals(instance.getEemiFecOfrecimiento()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecEmision().equals(instance.getEemiFecEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecBolsa().equals(instance.getEemiFecBolsa()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecCruce().equals(instance.getEemiFecCruce()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecLiquidacion().equals(instance.getEemiFecLiquidacion()))
            equalObjects = false;
        if (equalObjects && !this.getEemiTipoSubasta().equals(instance.getEemiTipoSubasta()))
            equalObjects = false;
        if (equalObjects && !this.getEemiActoConstitutivo().equals(instance.getEemiActoConstitutivo()))
            equalObjects = false;
        if (equalObjects && !this.getEemiComiteTecnico().equals(instance.getEemiComiteTecnico()))
            equalObjects = false;
        if (equalObjects && !this.getEemiRepoDist().equals(instance.getEemiRepoDist()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecAlta().equals(instance.getEemiFecAlta()))
            equalObjects = false;
        if (equalObjects && !this.getEemiFecMod().equals(instance.getEemiFecMod()))
            equalObjects = false;
        if (equalObjects && !this.getEemiStEmision().equals(instance.getEemiStEmision()))
            equalObjects = false;
        if (equalObjects && !this.getEemiTipoNegocio().equals(instance.getEemiTipoNegocio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        FEmision result = new FEmision();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setEemiIdPrograma((BigDecimal) objectData.getData("EEMI_ID_PROGRAMA"));
        result.setEemiIdFideicomiso((BigDecimal) objectData.getData("EEMI_ID_FIDEICOMISO"));
        result.setEemiIdEmision((BigDecimal) objectData.getData("EEMI_ID_EMISION"));
        result.setEemiNomEmisor((String) objectData.getData("EEMI_NOM_EMISOR"));
        result.setEemiCveInstrumento((String) objectData.getData("EEMI_CVE_INSTRUMENTO"));
        result.setEemiCvePizarra((String) objectData.getData("EEMI_CVE_PIZARRA"));
        result.setEemiNumSerie((String) objectData.getData("EEMI_NUM_SERIE"));
        result.setEemiImpEmision((BigDecimal) objectData.getData("EEMI_IMP_EMISION"));
        result.setEemiNumTitulos((BigDecimal) objectData.getData("EEMI_NUM_TITULOS"));
        result.setEemiImpNomEmision((BigDecimal) objectData.getData("EEMI_IMP_NOM_EMISION"));
        result.setEemiNumMoneda((BigDecimal) objectData.getData("EEMI_NUM_MONEDA"));
        result.setEemiDestinoRecurso((String) objectData.getData("EEMI_DESTINO_RECURSO"));
        result.setEemiAnoPlazo((BigDecimal) objectData.getData("EEMI_ANO_PLAZO"));
        result.setEemiDiasPlazo((BigDecimal) objectData.getData("EEMI_DIAS_PLAZO"));
        result.setEemiFecInicio((String) objectData.getData("EEMI_FEC_INICIO"));
        result.setEemiFecVencimiento((String) objectData.getData("EEMI_FEC_VENCIMIENTO"));
        result.setEemiRepComun((String) objectData.getData("EEMI_REP_COMUN"));
        result.setEemiIntColocador((String) objectData.getData("EEMI_INT_COLOCADOR"));
        result.setEemiAutorizacionCnbv((String) objectData.getData("EEMI_AUTORIZACION_CNBV"));
        result.setEemiFecCnbv((String) objectData.getData("EEMI_FEC_CNBV"));
        result.setEemiAutorizacionBanxico((String) objectData.getData("EEMI_AUTORIZACION_BANXICO"));
        result.setEemiFecBanxico((String) objectData.getData("EEMI_FEC_BANXICO"));
        result.setEemiFecSerie((String) objectData.getData("EEMI_FEC_SERIE"));
        result.setEemiFecSubasta((String) objectData.getData("EEMI_FEC_SUBASTA"));
        result.setEemiFecOfrecimiento((String) objectData.getData("EEMI_FEC_OFRECIMIENTO"));
        result.setEemiFecEmision((String) objectData.getData("EEMI_FEC_EMISION"));
        result.setEemiFecBolsa((String) objectData.getData("EEMI_FEC_BOLSA"));
        result.setEemiFecCruce((String) objectData.getData("EEMI_FEC_CRUCE"));
        result.setEemiFecLiquidacion((String) objectData.getData("EEMI_FEC_LIQUIDACION"));
        result.setEemiTipoSubasta((String) objectData.getData("EEMI_TIPO_SUBASTA"));
        result.setEemiActoConstitutivo((String) objectData.getData("EEMI_ACTO_CONSTITUTIVO"));
        result.setEemiComiteTecnico((String) objectData.getData("EEMI_COMITE_TECNICO"));
        result.setEemiRepoDist((BigDecimal) objectData.getData("EEMI_REPO_DIST"));
        result.setEemiFecAlta((String) objectData.getData("EEMI_FEC_ALTA"));
        result.setEemiFecMod((String) objectData.getData("EEMI_FEC_MOD"));
        result.setEemiStEmision((String) objectData.getData("EEMI_ST_EMISION"));
        result.setEemiTipoNegocio((String) objectData.getData("EEMI_TIPO_NEGOCIO"));

        return result;

    }

}
