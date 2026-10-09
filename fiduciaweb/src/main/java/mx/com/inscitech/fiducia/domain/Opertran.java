package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OPERTRAN_PK", columns = { "TRA_ANO_MOVTO", "TRA_MES_MOVTO", "TRA_DIA_MOVTO", "TRA_NUM_SEC_REG" }, sequences = { "MANUAL" })
public class Opertran extends DomainObject {

    BigDecimal traAnoMovto = null;
    BigDecimal traMesMovto = null;
    BigDecimal traDiaMovto = null;
    BigDecimal traNumSecReg = null;
    String traFecInicioPer = null;
    String traFecCorte = null;
    BigDecimal traTipoMovimient = null;
    BigDecimal traCveCobroPago = null;
    String traFormaNegocio = null;
    BigDecimal traNumContrato = null;
    BigDecimal traSubContrato = null;
    BigDecimal traEntidadFin = null;
    BigDecimal traContratoInter = null;
    String traNomPizarra = null;
    String traNumSerie = null;
    BigDecimal traNumCupon = null;
    BigDecimal traNumTitulos = null;
    BigDecimal traImpPrecio = null;
    BigDecimal traPjeTasa = null;
    BigDecimal traPjeStasa = null;
    BigDecimal traNumPlazo = null;
    BigDecimal traImpTitulos = null;
    BigDecimal traMoneda = null;
    String traNumFactura = null;
    String traTipoValor = null;
    BigDecimal traFolioOper = null;
    BigDecimal traNumOperacion = null;
    BigDecimal traAnoApli = null;
    BigDecimal traMesApli = null;
    BigDecimal traDiaApli = null;
    String traCveStTransfe = null;
    String traNomFile = null;
    String traTipoAdmon = null;
    String traTipoNegocio = null;
    String traSubCto = null;
    String traClasProducto = null;
    BigDecimal traLiquidez = null;
    BigDecimal traValorNominal = null;
    BigDecimal traRetencionIsr = null;
    BigDecimal traMercado = null;
    BigDecimal traInstrumento = null;
    BigDecimal traVector = null;
    BigDecimal traPrecioMerca = null;
    BigDecimal traMinusPlus = null;

    public Opertran() {
        super();
        this.pkColumns = 4;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTraAnoMovto(BigDecimal traAnoMovto) {
        this.traAnoMovto = traAnoMovto;
    }

    public BigDecimal getTraAnoMovto() {
        return this.traAnoMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraMesMovto(BigDecimal traMesMovto) {
        this.traMesMovto = traMesMovto;
    }

    public BigDecimal getTraMesMovto() {
        return this.traMesMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraDiaMovto(BigDecimal traDiaMovto) {
        this.traDiaMovto = traDiaMovto;
    }

    public BigDecimal getTraDiaMovto() {
        return this.traDiaMovto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumSecReg(BigDecimal traNumSecReg) {
        this.traNumSecReg = traNumSecReg;
    }

    public BigDecimal getTraNumSecReg() {
        return this.traNumSecReg;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraFecInicioPer(String traFecInicioPer) {
        this.traFecInicioPer = traFecInicioPer;
    }

    public String getTraFecInicioPer() {
        return this.traFecInicioPer;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraFecCorte(String traFecCorte) {
        this.traFecCorte = traFecCorte;
    }

    public String getTraFecCorte() {
        return this.traFecCorte;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setTraTipoMovimient(BigDecimal traTipoMovimient) {
        this.traTipoMovimient = traTipoMovimient;
    }

    public BigDecimal getTraTipoMovimient() {
        return this.traTipoMovimient;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 3, scale = 0, javaClass = BigDecimal.class)
    public void setTraCveCobroPago(BigDecimal traCveCobroPago) {
        this.traCveCobroPago = traCveCobroPago;
    }

    public BigDecimal getTraCveCobroPago() {
        return this.traCveCobroPago;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraFormaNegocio(String traFormaNegocio) {
        this.traFormaNegocio = traFormaNegocio;
    }

    public String getTraFormaNegocio() {
        return this.traFormaNegocio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumContrato(BigDecimal traNumContrato) {
        this.traNumContrato = traNumContrato;
    }

    public BigDecimal getTraNumContrato() {
        return this.traNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraSubContrato(BigDecimal traSubContrato) {
        this.traSubContrato = traSubContrato;
    }

    public BigDecimal getTraSubContrato() {
        return this.traSubContrato;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setTraEntidadFin(BigDecimal traEntidadFin) {
        this.traEntidadFin = traEntidadFin;
    }

    public BigDecimal getTraEntidadFin() {
        return this.traEntidadFin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraContratoInter(BigDecimal traContratoInter) {
        this.traContratoInter = traContratoInter;
    }

    public BigDecimal getTraContratoInter() {
        return this.traContratoInter;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraNomPizarra(String traNomPizarra) {
        this.traNomPizarra = traNomPizarra;
    }

    public String getTraNomPizarra() {
        return this.traNomPizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraNumSerie(String traNumSerie) {
        this.traNumSerie = traNumSerie;
    }

    public String getTraNumSerie() {
        return this.traNumSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 5, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumCupon(BigDecimal traNumCupon) {
        this.traNumCupon = traNumCupon;
    }

    public BigDecimal getTraNumCupon() {
        return this.traNumCupon;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumTitulos(BigDecimal traNumTitulos) {
        this.traNumTitulos = traNumTitulos;
    }

    public BigDecimal getTraNumTitulos() {
        return this.traNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 26, scale = 8, javaClass = BigDecimal.class)
    public void setTraImpPrecio(BigDecimal traImpPrecio) {
        this.traImpPrecio = traImpPrecio;
    }

    public BigDecimal getTraImpPrecio() {
        return this.traImpPrecio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setTraPjeTasa(BigDecimal traPjeTasa) {
        this.traPjeTasa = traPjeTasa;
    }

    public BigDecimal getTraPjeTasa() {
        return this.traPjeTasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setTraPjeStasa(BigDecimal traPjeStasa) {
        this.traPjeStasa = traPjeStasa;
    }

    public BigDecimal getTraPjeStasa() {
        return this.traPjeStasa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 6, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumPlazo(BigDecimal traNumPlazo) {
        this.traNumPlazo = traNumPlazo;
    }

    public BigDecimal getTraNumPlazo() {
        return this.traNumPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTraImpTitulos(BigDecimal traImpTitulos) {
        this.traImpTitulos = traImpTitulos;
    }

    public BigDecimal getTraImpTitulos() {
        return this.traImpTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraMoneda(BigDecimal traMoneda) {
        this.traMoneda = traMoneda;
    }

    public BigDecimal getTraMoneda() {
        return this.traMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraNumFactura(String traNumFactura) {
        this.traNumFactura = traNumFactura;
    }

    public String getTraNumFactura() {
        return this.traNumFactura;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraTipoValor(String traTipoValor) {
        this.traTipoValor = traTipoValor;
    }

    public String getTraTipoValor() {
        return this.traTipoValor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraFolioOper(BigDecimal traFolioOper) {
        this.traFolioOper = traFolioOper;
    }

    public BigDecimal getTraFolioOper() {
        return this.traFolioOper;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraNumOperacion(BigDecimal traNumOperacion) {
        this.traNumOperacion = traNumOperacion;
    }

    public BigDecimal getTraNumOperacion() {
        return this.traNumOperacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setTraAnoApli(BigDecimal traAnoApli) {
        this.traAnoApli = traAnoApli;
    }

    public BigDecimal getTraAnoApli() {
        return this.traAnoApli;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraMesApli(BigDecimal traMesApli) {
        this.traMesApli = traMesApli;
    }

    public BigDecimal getTraMesApli() {
        return this.traMesApli;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraDiaApli(BigDecimal traDiaApli) {
        this.traDiaApli = traDiaApli;
    }

    public BigDecimal getTraDiaApli() {
        return this.traDiaApli;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraCveStTransfe(String traCveStTransfe) {
        this.traCveStTransfe = traCveStTransfe;
    }

    public String getTraCveStTransfe() {
        return this.traCveStTransfe;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraNomFile(String traNomFile) {
        this.traNomFile = traNomFile;
    }

    public String getTraNomFile() {
        return this.traNomFile;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraTipoAdmon(String traTipoAdmon) {
        this.traTipoAdmon = traTipoAdmon;
    }

    public String getTraTipoAdmon() {
        return this.traTipoAdmon;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraTipoNegocio(String traTipoNegocio) {
        this.traTipoNegocio = traTipoNegocio;
    }

    public String getTraTipoNegocio() {
        return this.traTipoNegocio;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraSubCto(String traSubCto) {
        this.traSubCto = traSubCto;
    }

    public String getTraSubCto() {
        return this.traSubCto;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setTraClasProducto(String traClasProducto) {
        this.traClasProducto = traClasProducto;
    }

    public String getTraClasProducto() {
        return this.traClasProducto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraLiquidez(BigDecimal traLiquidez) {
        this.traLiquidez = traLiquidez;
    }

    public BigDecimal getTraLiquidez() {
        return this.traLiquidez;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setTraValorNominal(BigDecimal traValorNominal) {
        this.traValorNominal = traValorNominal;
    }

    public BigDecimal getTraValorNominal() {
        return this.traValorNominal;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setTraRetencionIsr(BigDecimal traRetencionIsr) {
        this.traRetencionIsr = traRetencionIsr;
    }

    public BigDecimal getTraRetencionIsr() {
        return this.traRetencionIsr;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraMercado(BigDecimal traMercado) {
        this.traMercado = traMercado;
    }

    public BigDecimal getTraMercado() {
        return this.traMercado;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setTraInstrumento(BigDecimal traInstrumento) {
        this.traInstrumento = traInstrumento;
    }

    public BigDecimal getTraInstrumento() {
        return this.traInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 8, javaClass = BigDecimal.class)
    public void setTraVector(BigDecimal traVector) {
        this.traVector = traVector;
    }

    public BigDecimal getTraVector() {
        return this.traVector;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 8, javaClass = BigDecimal.class)
    public void setTraPrecioMerca(BigDecimal traPrecioMerca) {
        this.traPrecioMerca = traPrecioMerca;
    }

    public BigDecimal getTraPrecioMerca() {
        return this.traPrecioMerca;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 8, javaClass = BigDecimal.class)
    public void setTraMinusPlus(BigDecimal traMinusPlus) {
        this.traMinusPlus = traMinusPlus;
    }

    public BigDecimal getTraMinusPlus() {
        return this.traMinusPlus;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OPERTRAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTraAnoMovto() != null && this.getTraAnoMovto().longValue() == -999) {
            conditions += " AND TRA_ANO_MOVTO IS NULL";
        } else if (this.getTraAnoMovto() != null) {
            conditions += " AND TRA_ANO_MOVTO = ?";
            values.add(this.getTraAnoMovto());
        }

        if (this.getTraMesMovto() != null && this.getTraMesMovto().longValue() == -999) {
            conditions += " AND TRA_MES_MOVTO IS NULL";
        } else if (this.getTraMesMovto() != null) {
            conditions += " AND TRA_MES_MOVTO = ?";
            values.add(this.getTraMesMovto());
        }

        if (this.getTraDiaMovto() != null && this.getTraDiaMovto().longValue() == -999) {
            conditions += " AND TRA_DIA_MOVTO IS NULL";
        } else if (this.getTraDiaMovto() != null) {
            conditions += " AND TRA_DIA_MOVTO = ?";
            values.add(this.getTraDiaMovto());
        }

        if (this.getTraNumSecReg() != null && this.getTraNumSecReg().longValue() == -999) {
            conditions += " AND TRA_NUM_SEC_REG IS NULL";
        } else if (this.getTraNumSecReg() != null) {
            conditions += " AND TRA_NUM_SEC_REG = ?";
            values.add(this.getTraNumSecReg());
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
        String sql = "SELECT * FROM OPERTRAN ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getTraAnoMovto() != null && this.getTraAnoMovto().longValue() == -999) {
            conditions += " AND TRA_ANO_MOVTO IS NULL";
        } else if (this.getTraAnoMovto() != null) {
            conditions += " AND TRA_ANO_MOVTO = ?";
            values.add(this.getTraAnoMovto());
        }

        if (this.getTraMesMovto() != null && this.getTraMesMovto().longValue() == -999) {
            conditions += " AND TRA_MES_MOVTO IS NULL";
        } else if (this.getTraMesMovto() != null) {
            conditions += " AND TRA_MES_MOVTO = ?";
            values.add(this.getTraMesMovto());
        }

        if (this.getTraDiaMovto() != null && this.getTraDiaMovto().longValue() == -999) {
            conditions += " AND TRA_DIA_MOVTO IS NULL";
        } else if (this.getTraDiaMovto() != null) {
            conditions += " AND TRA_DIA_MOVTO = ?";
            values.add(this.getTraDiaMovto());
        }

        if (this.getTraNumSecReg() != null && this.getTraNumSecReg().longValue() == -999) {
            conditions += " AND TRA_NUM_SEC_REG IS NULL";
        } else if (this.getTraNumSecReg() != null) {
            conditions += " AND TRA_NUM_SEC_REG = ?";
            values.add(this.getTraNumSecReg());
        }

        if (this.getTraFecInicioPer() != null && "null".equals(this.getTraFecInicioPer())) {
            conditions += " AND TRA_FEC_INICIO_PER IS NULL";
        } else if (this.getTraFecInicioPer() != null) {
            conditions += " AND TRA_FEC_INICIO_PER = ?";
            values.add(this.getTraFecInicioPer());
        }

        if (this.getTraFecCorte() != null && "null".equals(this.getTraFecCorte())) {
            conditions += " AND TRA_FEC_CORTE IS NULL";
        } else if (this.getTraFecCorte() != null) {
            conditions += " AND TRA_FEC_CORTE = ?";
            values.add(this.getTraFecCorte());
        }

        if (this.getTraTipoMovimient() != null && this.getTraTipoMovimient().longValue() == -999) {
            conditions += " AND TRA_TIPO_MOVIMIENT IS NULL";
        } else if (this.getTraTipoMovimient() != null) {
            conditions += " AND TRA_TIPO_MOVIMIENT = ?";
            values.add(this.getTraTipoMovimient());
        }

        if (this.getTraCveCobroPago() != null && this.getTraCveCobroPago().longValue() == -999) {
            conditions += " AND TRA_CVE_COBRO_PAGO IS NULL";
        } else if (this.getTraCveCobroPago() != null) {
            conditions += " AND TRA_CVE_COBRO_PAGO = ?";
            values.add(this.getTraCveCobroPago());
        }

        if (this.getTraFormaNegocio() != null && "null".equals(this.getTraFormaNegocio())) {
            conditions += " AND TRA_FORMA_NEGOCIO IS NULL";
        } else if (this.getTraFormaNegocio() != null) {
            conditions += " AND TRA_FORMA_NEGOCIO = ?";
            values.add(this.getTraFormaNegocio());
        }

        if (this.getTraNumContrato() != null && this.getTraNumContrato().longValue() == -999) {
            conditions += " AND TRA_NUM_CONTRATO IS NULL";
        } else if (this.getTraNumContrato() != null) {
            conditions += " AND TRA_NUM_CONTRATO = ?";
            values.add(this.getTraNumContrato());
        }

        if (this.getTraSubContrato() != null && this.getTraSubContrato().longValue() == -999) {
            conditions += " AND TRA_SUB_CONTRATO IS NULL";
        } else if (this.getTraSubContrato() != null) {
            conditions += " AND TRA_SUB_CONTRATO = ?";
            values.add(this.getTraSubContrato());
        }

        if (this.getTraEntidadFin() != null && this.getTraEntidadFin().longValue() == -999) {
            conditions += " AND TRA_ENTIDAD_FIN IS NULL";
        } else if (this.getTraEntidadFin() != null) {
            conditions += " AND TRA_ENTIDAD_FIN = ?";
            values.add(this.getTraEntidadFin());
        }

        if (this.getTraContratoInter() != null && this.getTraContratoInter().longValue() == -999) {
            conditions += " AND TRA_CONTRATO_INTER IS NULL";
        } else if (this.getTraContratoInter() != null) {
            conditions += " AND TRA_CONTRATO_INTER = ?";
            values.add(this.getTraContratoInter());
        }

        if (this.getTraNomPizarra() != null && "null".equals(this.getTraNomPizarra())) {
            conditions += " AND TRA_NOM_PIZARRA IS NULL";
        } else if (this.getTraNomPizarra() != null) {
            conditions += " AND TRA_NOM_PIZARRA = ?";
            values.add(this.getTraNomPizarra());
        }

        if (this.getTraNumSerie() != null && "null".equals(this.getTraNumSerie())) {
            conditions += " AND TRA_NUM_SERIE IS NULL";
        } else if (this.getTraNumSerie() != null) {
            conditions += " AND TRA_NUM_SERIE = ?";
            values.add(this.getTraNumSerie());
        }

        if (this.getTraNumCupon() != null && this.getTraNumCupon().longValue() == -999) {
            conditions += " AND TRA_NUM_CUPON IS NULL";
        } else if (this.getTraNumCupon() != null) {
            conditions += " AND TRA_NUM_CUPON = ?";
            values.add(this.getTraNumCupon());
        }

        if (this.getTraNumTitulos() != null && this.getTraNumTitulos().longValue() == -999) {
            conditions += " AND TRA_NUM_TITULOS IS NULL";
        } else if (this.getTraNumTitulos() != null) {
            conditions += " AND TRA_NUM_TITULOS = ?";
            values.add(this.getTraNumTitulos());
        }

        if (this.getTraImpPrecio() != null && this.getTraImpPrecio().longValue() == -999) {
            conditions += " AND TRA_IMP_PRECIO IS NULL";
        } else if (this.getTraImpPrecio() != null) {
            conditions += " AND TRA_IMP_PRECIO = ?";
            values.add(this.getTraImpPrecio());
        }

        if (this.getTraPjeTasa() != null && this.getTraPjeTasa().longValue() == -999) {
            conditions += " AND TRA_PJE_TASA IS NULL";
        } else if (this.getTraPjeTasa() != null) {
            conditions += " AND TRA_PJE_TASA = ?";
            values.add(this.getTraPjeTasa());
        }

        if (this.getTraPjeStasa() != null && this.getTraPjeStasa().longValue() == -999) {
            conditions += " AND TRA_PJE_STASA IS NULL";
        } else if (this.getTraPjeStasa() != null) {
            conditions += " AND TRA_PJE_STASA = ?";
            values.add(this.getTraPjeStasa());
        }

        if (this.getTraNumPlazo() != null && this.getTraNumPlazo().longValue() == -999) {
            conditions += " AND TRA_NUM_PLAZO IS NULL";
        } else if (this.getTraNumPlazo() != null) {
            conditions += " AND TRA_NUM_PLAZO = ?";
            values.add(this.getTraNumPlazo());
        }

        if (this.getTraImpTitulos() != null && this.getTraImpTitulos().longValue() == -999) {
            conditions += " AND TRA_IMP_TITULOS IS NULL";
        } else if (this.getTraImpTitulos() != null) {
            conditions += " AND TRA_IMP_TITULOS = ?";
            values.add(this.getTraImpTitulos());
        }

        if (this.getTraMoneda() != null && this.getTraMoneda().longValue() == -999) {
            conditions += " AND TRA_MONEDA IS NULL";
        } else if (this.getTraMoneda() != null) {
            conditions += " AND TRA_MONEDA = ?";
            values.add(this.getTraMoneda());
        }

        if (this.getTraNumFactura() != null && "null".equals(this.getTraNumFactura())) {
            conditions += " AND TRA_NUM_FACTURA IS NULL";
        } else if (this.getTraNumFactura() != null) {
            conditions += " AND TRA_NUM_FACTURA = ?";
            values.add(this.getTraNumFactura());
        }

        if (this.getTraTipoValor() != null && "null".equals(this.getTraTipoValor())) {
            conditions += " AND TRA_TIPO_VALOR IS NULL";
        } else if (this.getTraTipoValor() != null) {
            conditions += " AND TRA_TIPO_VALOR = ?";
            values.add(this.getTraTipoValor());
        }

        if (this.getTraFolioOper() != null && this.getTraFolioOper().longValue() == -999) {
            conditions += " AND TRA_FOLIO_OPER IS NULL";
        } else if (this.getTraFolioOper() != null) {
            conditions += " AND TRA_FOLIO_OPER = ?";
            values.add(this.getTraFolioOper());
        }

        if (this.getTraNumOperacion() != null && this.getTraNumOperacion().longValue() == -999) {
            conditions += " AND TRA_NUM_OPERACION IS NULL";
        } else if (this.getTraNumOperacion() != null) {
            conditions += " AND TRA_NUM_OPERACION = ?";
            values.add(this.getTraNumOperacion());
        }

        if (this.getTraAnoApli() != null && this.getTraAnoApli().longValue() == -999) {
            conditions += " AND TRA_ANO_APLI IS NULL";
        } else if (this.getTraAnoApli() != null) {
            conditions += " AND TRA_ANO_APLI = ?";
            values.add(this.getTraAnoApli());
        }

        if (this.getTraMesApli() != null && this.getTraMesApli().longValue() == -999) {
            conditions += " AND TRA_MES_APLI IS NULL";
        } else if (this.getTraMesApli() != null) {
            conditions += " AND TRA_MES_APLI = ?";
            values.add(this.getTraMesApli());
        }

        if (this.getTraDiaApli() != null && this.getTraDiaApli().longValue() == -999) {
            conditions += " AND TRA_DIA_APLI IS NULL";
        } else if (this.getTraDiaApli() != null) {
            conditions += " AND TRA_DIA_APLI = ?";
            values.add(this.getTraDiaApli());
        }

        if (this.getTraCveStTransfe() != null && "null".equals(this.getTraCveStTransfe())) {
            conditions += " AND TRA_CVE_ST_TRANSFE IS NULL";
        } else if (this.getTraCveStTransfe() != null) {
            conditions += " AND TRA_CVE_ST_TRANSFE = ?";
            values.add(this.getTraCveStTransfe());
        }

        if (this.getTraNomFile() != null && "null".equals(this.getTraNomFile())) {
            conditions += " AND TRA_NOM_FILE IS NULL";
        } else if (this.getTraNomFile() != null) {
            conditions += " AND TRA_NOM_FILE = ?";
            values.add(this.getTraNomFile());
        }

        if (this.getTraTipoAdmon() != null && "null".equals(this.getTraTipoAdmon())) {
            conditions += " AND TRA_TIPO_ADMON IS NULL";
        } else if (this.getTraTipoAdmon() != null) {
            conditions += " AND TRA_TIPO_ADMON = ?";
            values.add(this.getTraTipoAdmon());
        }

        if (this.getTraTipoNegocio() != null && "null".equals(this.getTraTipoNegocio())) {
            conditions += " AND TRA_TIPO_NEGOCIO IS NULL";
        } else if (this.getTraTipoNegocio() != null) {
            conditions += " AND TRA_TIPO_NEGOCIO = ?";
            values.add(this.getTraTipoNegocio());
        }

        if (this.getTraSubCto() != null && "null".equals(this.getTraSubCto())) {
            conditions += " AND TRA_SUB_CTO IS NULL";
        } else if (this.getTraSubCto() != null) {
            conditions += " AND TRA_SUB_CTO = ?";
            values.add(this.getTraSubCto());
        }

        if (this.getTraClasProducto() != null && "null".equals(this.getTraClasProducto())) {
            conditions += " AND TRA_CLAS_PRODUCTO IS NULL";
        } else if (this.getTraClasProducto() != null) {
            conditions += " AND TRA_CLAS_PRODUCTO = ?";
            values.add(this.getTraClasProducto());
        }

        if (this.getTraLiquidez() != null && this.getTraLiquidez().longValue() == -999) {
            conditions += " AND TRA_LIQUIDEZ IS NULL";
        } else if (this.getTraLiquidez() != null) {
            conditions += " AND TRA_LIQUIDEZ = ?";
            values.add(this.getTraLiquidez());
        }

        if (this.getTraValorNominal() != null && this.getTraValorNominal().longValue() == -999) {
            conditions += " AND TRA_VALOR_NOMINAL IS NULL";
        } else if (this.getTraValorNominal() != null) {
            conditions += " AND TRA_VALOR_NOMINAL = ?";
            values.add(this.getTraValorNominal());
        }

        if (this.getTraRetencionIsr() != null && this.getTraRetencionIsr().longValue() == -999) {
            conditions += " AND TRA_RETENCION_ISR IS NULL";
        } else if (this.getTraRetencionIsr() != null) {
            conditions += " AND TRA_RETENCION_ISR = ?";
            values.add(this.getTraRetencionIsr());
        }

        if (this.getTraMercado() != null && this.getTraMercado().longValue() == -999) {
            conditions += " AND TRA_MERCADO IS NULL";
        } else if (this.getTraMercado() != null) {
            conditions += " AND TRA_MERCADO = ?";
            values.add(this.getTraMercado());
        }

        if (this.getTraInstrumento() != null && this.getTraInstrumento().longValue() == -999) {
            conditions += " AND TRA_INSTRUMENTO IS NULL";
        } else if (this.getTraInstrumento() != null) {
            conditions += " AND TRA_INSTRUMENTO = ?";
            values.add(this.getTraInstrumento());
        }

        if (this.getTraVector() != null && this.getTraVector().longValue() == -999) {
            conditions += " AND TRA_VECTOR IS NULL";
        } else if (this.getTraVector() != null) {
            conditions += " AND TRA_VECTOR = ?";
            values.add(this.getTraVector());
        }

        if (this.getTraPrecioMerca() != null && this.getTraPrecioMerca().longValue() == -999) {
            conditions += " AND TRA_PRECIO_MERCA IS NULL";
        } else if (this.getTraPrecioMerca() != null) {
            conditions += " AND TRA_PRECIO_MERCA = ?";
            values.add(this.getTraPrecioMerca());
        }

        if (this.getTraMinusPlus() != null && this.getTraMinusPlus().longValue() == -999) {
            conditions += " AND TRA_MINUS_PLUS IS NULL";
        } else if (this.getTraMinusPlus() != null) {
            conditions += " AND TRA_MINUS_PLUS = ?";
            values.add(this.getTraMinusPlus());
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
        String sql = "UPDATE OPERTRAN SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND TRA_ANO_MOVTO = ?";
        pkValues.add(this.getTraAnoMovto());
        conditions += " AND TRA_MES_MOVTO = ?";
        pkValues.add(this.getTraMesMovto());
        conditions += " AND TRA_DIA_MOVTO = ?";
        pkValues.add(this.getTraDiaMovto());
        conditions += " AND TRA_NUM_SEC_REG = ?";
        pkValues.add(this.getTraNumSecReg());
        fields += " TRA_FEC_INICIO_PER = ?, ";
        values.add(this.getTraFecInicioPer());
        fields += " TRA_FEC_CORTE = ?, ";
        values.add(this.getTraFecCorte());
        fields += " TRA_TIPO_MOVIMIENT = ?, ";
        values.add(this.getTraTipoMovimient());
        fields += " TRA_CVE_COBRO_PAGO = ?, ";
        values.add(this.getTraCveCobroPago());
        fields += " TRA_FORMA_NEGOCIO = ?, ";
        values.add(this.getTraFormaNegocio());
        fields += " TRA_NUM_CONTRATO = ?, ";
        values.add(this.getTraNumContrato());
        fields += " TRA_SUB_CONTRATO = ?, ";
        values.add(this.getTraSubContrato());
        fields += " TRA_ENTIDAD_FIN = ?, ";
        values.add(this.getTraEntidadFin());
        fields += " TRA_CONTRATO_INTER = ?, ";
        values.add(this.getTraContratoInter());
        fields += " TRA_NOM_PIZARRA = ?, ";
        values.add(this.getTraNomPizarra());
        fields += " TRA_NUM_SERIE = ?, ";
        values.add(this.getTraNumSerie());
        fields += " TRA_NUM_CUPON = ?, ";
        values.add(this.getTraNumCupon());
        fields += " TRA_NUM_TITULOS = ?, ";
        values.add(this.getTraNumTitulos());
        fields += " TRA_IMP_PRECIO = ?, ";
        values.add(this.getTraImpPrecio());
        fields += " TRA_PJE_TASA = ?, ";
        values.add(this.getTraPjeTasa());
        fields += " TRA_PJE_STASA = ?, ";
        values.add(this.getTraPjeStasa());
        fields += " TRA_NUM_PLAZO = ?, ";
        values.add(this.getTraNumPlazo());
        fields += " TRA_IMP_TITULOS = ?, ";
        values.add(this.getTraImpTitulos());
        fields += " TRA_MONEDA = ?, ";
        values.add(this.getTraMoneda());
        fields += " TRA_NUM_FACTURA = ?, ";
        values.add(this.getTraNumFactura());
        fields += " TRA_TIPO_VALOR = ?, ";
        values.add(this.getTraTipoValor());
        fields += " TRA_FOLIO_OPER = ?, ";
        values.add(this.getTraFolioOper());
        fields += " TRA_NUM_OPERACION = ?, ";
        values.add(this.getTraNumOperacion());
        fields += " TRA_ANO_APLI = ?, ";
        values.add(this.getTraAnoApli());
        fields += " TRA_MES_APLI = ?, ";
        values.add(this.getTraMesApli());
        fields += " TRA_DIA_APLI = ?, ";
        values.add(this.getTraDiaApli());
        fields += " TRA_CVE_ST_TRANSFE = ?, ";
        values.add(this.getTraCveStTransfe());
        fields += " TRA_NOM_FILE = ?, ";
        values.add(this.getTraNomFile());
        fields += " TRA_TIPO_ADMON = ?, ";
        values.add(this.getTraTipoAdmon());
        fields += " TRA_TIPO_NEGOCIO = ?, ";
        values.add(this.getTraTipoNegocio());
        fields += " TRA_SUB_CTO = ?, ";
        values.add(this.getTraSubCto());
        fields += " TRA_CLAS_PRODUCTO = ?, ";
        values.add(this.getTraClasProducto());
        fields += " TRA_LIQUIDEZ = ?, ";
        values.add(this.getTraLiquidez());
        fields += " TRA_VALOR_NOMINAL = ?, ";
        values.add(this.getTraValorNominal());
        fields += " TRA_RETENCION_ISR = ?, ";
        values.add(this.getTraRetencionIsr());
        fields += " TRA_MERCADO = ?, ";
        values.add(this.getTraMercado());
        fields += " TRA_INSTRUMENTO = ?, ";
        values.add(this.getTraInstrumento());
        fields += " TRA_VECTOR = ?, ";
        values.add(this.getTraVector());
        fields += " TRA_PRECIO_MERCA = ?, ";
        values.add(this.getTraPrecioMerca());
        fields += " TRA_MINUS_PLUS = ?, ";
        values.add(this.getTraMinusPlus());
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
        String sql = "INSERT INTO OPERTRAN ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", TRA_ANO_MOVTO";
        fieldValues += ", ?";
        values.add(this.getTraAnoMovto());

        fields += ", TRA_MES_MOVTO";
        fieldValues += ", ?";
        values.add(this.getTraMesMovto());

        fields += ", TRA_DIA_MOVTO";
        fieldValues += ", ?";
        values.add(this.getTraDiaMovto());

        fields += ", TRA_NUM_SEC_REG";
        fieldValues += ", ?";
        values.add(this.getTraNumSecReg());

        fields += ", TRA_FEC_INICIO_PER";
        fieldValues += ", ?";
        values.add(this.getTraFecInicioPer());

        fields += ", TRA_FEC_CORTE";
        fieldValues += ", ?";
        values.add(this.getTraFecCorte());

        fields += ", TRA_TIPO_MOVIMIENT";
        fieldValues += ", ?";
        values.add(this.getTraTipoMovimient());

        fields += ", TRA_CVE_COBRO_PAGO";
        fieldValues += ", ?";
        values.add(this.getTraCveCobroPago());

        fields += ", TRA_FORMA_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getTraFormaNegocio());

        fields += ", TRA_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getTraNumContrato());

        fields += ", TRA_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getTraSubContrato());

        fields += ", TRA_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getTraEntidadFin());

        fields += ", TRA_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getTraContratoInter());

        fields += ", TRA_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getTraNomPizarra());

        fields += ", TRA_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getTraNumSerie());

        fields += ", TRA_NUM_CUPON";
        fieldValues += ", ?";
        values.add(this.getTraNumCupon());

        fields += ", TRA_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getTraNumTitulos());

        fields += ", TRA_IMP_PRECIO";
        fieldValues += ", ?";
        values.add(this.getTraImpPrecio());

        fields += ", TRA_PJE_TASA";
        fieldValues += ", ?";
        values.add(this.getTraPjeTasa());

        fields += ", TRA_PJE_STASA";
        fieldValues += ", ?";
        values.add(this.getTraPjeStasa());

        fields += ", TRA_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getTraNumPlazo());

        fields += ", TRA_IMP_TITULOS";
        fieldValues += ", ?";
        values.add(this.getTraImpTitulos());

        fields += ", TRA_MONEDA";
        fieldValues += ", ?";
        values.add(this.getTraMoneda());

        fields += ", TRA_NUM_FACTURA";
        fieldValues += ", ?";
        values.add(this.getTraNumFactura());

        fields += ", TRA_TIPO_VALOR";
        fieldValues += ", ?";
        values.add(this.getTraTipoValor());

        fields += ", TRA_FOLIO_OPER";
        fieldValues += ", ?";
        values.add(this.getTraFolioOper());

        fields += ", TRA_NUM_OPERACION";
        fieldValues += ", ?";
        values.add(this.getTraNumOperacion());

        fields += ", TRA_ANO_APLI";
        fieldValues += ", ?";
        values.add(this.getTraAnoApli());

        fields += ", TRA_MES_APLI";
        fieldValues += ", ?";
        values.add(this.getTraMesApli());

        fields += ", TRA_DIA_APLI";
        fieldValues += ", ?";
        values.add(this.getTraDiaApli());

        fields += ", TRA_CVE_ST_TRANSFE";
        fieldValues += ", ?";
        values.add(this.getTraCveStTransfe());

        fields += ", TRA_NOM_FILE";
        fieldValues += ", ?";
        values.add(this.getTraNomFile());

        fields += ", TRA_TIPO_ADMON";
        fieldValues += ", ?";
        values.add(this.getTraTipoAdmon());

        fields += ", TRA_TIPO_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getTraTipoNegocio());

        fields += ", TRA_SUB_CTO";
        fieldValues += ", ?";
        values.add(this.getTraSubCto());

        fields += ", TRA_CLAS_PRODUCTO";
        fieldValues += ", ?";
        values.add(this.getTraClasProducto());

        fields += ", TRA_LIQUIDEZ";
        fieldValues += ", ?";
        values.add(this.getTraLiquidez());

        fields += ", TRA_VALOR_NOMINAL";
        fieldValues += ", ?";
        values.add(this.getTraValorNominal());

        fields += ", TRA_RETENCION_ISR";
        fieldValues += ", ?";
        values.add(this.getTraRetencionIsr());

        fields += ", TRA_MERCADO";
        fieldValues += ", ?";
        values.add(this.getTraMercado());

        fields += ", TRA_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getTraInstrumento());

        fields += ", TRA_VECTOR";
        fieldValues += ", ?";
        values.add(this.getTraVector());

        fields += ", TRA_PRECIO_MERCA";
        fieldValues += ", ?";
        values.add(this.getTraPrecioMerca());

        fields += ", TRA_MINUS_PLUS";
        fieldValues += ", ?";
        values.add(this.getTraMinusPlus());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OPERTRAN WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND TRA_ANO_MOVTO = ?";
        values.add(this.getTraAnoMovto());
        conditions += " AND TRA_MES_MOVTO = ?";
        values.add(this.getTraMesMovto());
        conditions += " AND TRA_DIA_MOVTO = ?";
        values.add(this.getTraDiaMovto());
        conditions += " AND TRA_NUM_SEC_REG = ?";
        values.add(this.getTraNumSecReg());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Opertran instance = (Opertran) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getTraAnoMovto().equals(instance.getTraAnoMovto()))
            equalObjects = false;
        if (equalObjects && !this.getTraMesMovto().equals(instance.getTraMesMovto()))
            equalObjects = false;
        if (equalObjects && !this.getTraDiaMovto().equals(instance.getTraDiaMovto()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumSecReg().equals(instance.getTraNumSecReg()))
            equalObjects = false;
        if (equalObjects && !this.getTraFecInicioPer().equals(instance.getTraFecInicioPer()))
            equalObjects = false;
        if (equalObjects && !this.getTraFecCorte().equals(instance.getTraFecCorte()))
            equalObjects = false;
        if (equalObjects && !this.getTraTipoMovimient().equals(instance.getTraTipoMovimient()))
            equalObjects = false;
        if (equalObjects && !this.getTraCveCobroPago().equals(instance.getTraCveCobroPago()))
            equalObjects = false;
        if (equalObjects && !this.getTraFormaNegocio().equals(instance.getTraFormaNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumContrato().equals(instance.getTraNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getTraSubContrato().equals(instance.getTraSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getTraEntidadFin().equals(instance.getTraEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getTraContratoInter().equals(instance.getTraContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getTraNomPizarra().equals(instance.getTraNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumSerie().equals(instance.getTraNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumCupon().equals(instance.getTraNumCupon()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumTitulos().equals(instance.getTraNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getTraImpPrecio().equals(instance.getTraImpPrecio()))
            equalObjects = false;
        if (equalObjects && !this.getTraPjeTasa().equals(instance.getTraPjeTasa()))
            equalObjects = false;
        if (equalObjects && !this.getTraPjeStasa().equals(instance.getTraPjeStasa()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumPlazo().equals(instance.getTraNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getTraImpTitulos().equals(instance.getTraImpTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getTraMoneda().equals(instance.getTraMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumFactura().equals(instance.getTraNumFactura()))
            equalObjects = false;
        if (equalObjects && !this.getTraTipoValor().equals(instance.getTraTipoValor()))
            equalObjects = false;
        if (equalObjects && !this.getTraFolioOper().equals(instance.getTraFolioOper()))
            equalObjects = false;
        if (equalObjects && !this.getTraNumOperacion().equals(instance.getTraNumOperacion()))
            equalObjects = false;
        if (equalObjects && !this.getTraAnoApli().equals(instance.getTraAnoApli()))
            equalObjects = false;
        if (equalObjects && !this.getTraMesApli().equals(instance.getTraMesApli()))
            equalObjects = false;
        if (equalObjects && !this.getTraDiaApli().equals(instance.getTraDiaApli()))
            equalObjects = false;
        if (equalObjects && !this.getTraCveStTransfe().equals(instance.getTraCveStTransfe()))
            equalObjects = false;
        if (equalObjects && !this.getTraNomFile().equals(instance.getTraNomFile()))
            equalObjects = false;
        if (equalObjects && !this.getTraTipoAdmon().equals(instance.getTraTipoAdmon()))
            equalObjects = false;
        if (equalObjects && !this.getTraTipoNegocio().equals(instance.getTraTipoNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getTraSubCto().equals(instance.getTraSubCto()))
            equalObjects = false;
        if (equalObjects && !this.getTraClasProducto().equals(instance.getTraClasProducto()))
            equalObjects = false;
        if (equalObjects && !this.getTraLiquidez().equals(instance.getTraLiquidez()))
            equalObjects = false;
        if (equalObjects && !this.getTraValorNominal().equals(instance.getTraValorNominal()))
            equalObjects = false;
        if (equalObjects && !this.getTraRetencionIsr().equals(instance.getTraRetencionIsr()))
            equalObjects = false;
        if (equalObjects && !this.getTraMercado().equals(instance.getTraMercado()))
            equalObjects = false;
        if (equalObjects && !this.getTraInstrumento().equals(instance.getTraInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getTraVector().equals(instance.getTraVector()))
            equalObjects = false;
        if (equalObjects && !this.getTraPrecioMerca().equals(instance.getTraPrecioMerca()))
            equalObjects = false;
        if (equalObjects && !this.getTraMinusPlus().equals(instance.getTraMinusPlus()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Opertran result = new Opertran();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setTraAnoMovto((BigDecimal) objectData.getData("TRA_ANO_MOVTO"));
        result.setTraMesMovto((BigDecimal) objectData.getData("TRA_MES_MOVTO"));
        result.setTraDiaMovto((BigDecimal) objectData.getData("TRA_DIA_MOVTO"));
        result.setTraNumSecReg((BigDecimal) objectData.getData("TRA_NUM_SEC_REG"));
        result.setTraFecInicioPer((String) objectData.getData("TRA_FEC_INICIO_PER"));
        result.setTraFecCorte((String) objectData.getData("TRA_FEC_CORTE"));
        result.setTraTipoMovimient((BigDecimal) objectData.getData("TRA_TIPO_MOVIMIENT"));
        result.setTraCveCobroPago((BigDecimal) objectData.getData("TRA_CVE_COBRO_PAGO"));
        result.setTraFormaNegocio((String) objectData.getData("TRA_FORMA_NEGOCIO"));
        result.setTraNumContrato((BigDecimal) objectData.getData("TRA_NUM_CONTRATO"));
        result.setTraSubContrato((BigDecimal) objectData.getData("TRA_SUB_CONTRATO"));
        result.setTraEntidadFin((BigDecimal) objectData.getData("TRA_ENTIDAD_FIN"));
        result.setTraContratoInter((BigDecimal) objectData.getData("TRA_CONTRATO_INTER"));
        result.setTraNomPizarra((String) objectData.getData("TRA_NOM_PIZARRA"));
        result.setTraNumSerie((String) objectData.getData("TRA_NUM_SERIE"));
        result.setTraNumCupon((BigDecimal) objectData.getData("TRA_NUM_CUPON"));
        result.setTraNumTitulos((BigDecimal) objectData.getData("TRA_NUM_TITULOS"));
        result.setTraImpPrecio((BigDecimal) objectData.getData("TRA_IMP_PRECIO"));
        result.setTraPjeTasa((BigDecimal) objectData.getData("TRA_PJE_TASA"));
        result.setTraPjeStasa((BigDecimal) objectData.getData("TRA_PJE_STASA"));
        result.setTraNumPlazo((BigDecimal) objectData.getData("TRA_NUM_PLAZO"));
        result.setTraImpTitulos((BigDecimal) objectData.getData("TRA_IMP_TITULOS"));
        result.setTraMoneda((BigDecimal) objectData.getData("TRA_MONEDA"));
        result.setTraNumFactura((String) objectData.getData("TRA_NUM_FACTURA"));
        result.setTraTipoValor((String) objectData.getData("TRA_TIPO_VALOR"));
        result.setTraFolioOper((BigDecimal) objectData.getData("TRA_FOLIO_OPER"));
        result.setTraNumOperacion((BigDecimal) objectData.getData("TRA_NUM_OPERACION"));
        result.setTraAnoApli((BigDecimal) objectData.getData("TRA_ANO_APLI"));
        result.setTraMesApli((BigDecimal) objectData.getData("TRA_MES_APLI"));
        result.setTraDiaApli((BigDecimal) objectData.getData("TRA_DIA_APLI"));
        result.setTraCveStTransfe((String) objectData.getData("TRA_CVE_ST_TRANSFE"));
        result.setTraNomFile((String) objectData.getData("TRA_NOM_FILE"));
        result.setTraTipoAdmon((String) objectData.getData("TRA_TIPO_ADMON"));
        result.setTraTipoNegocio((String) objectData.getData("TRA_TIPO_NEGOCIO"));
        result.setTraSubCto((String) objectData.getData("TRA_SUB_CTO"));
        result.setTraClasProducto((String) objectData.getData("TRA_CLAS_PRODUCTO"));
        result.setTraLiquidez((BigDecimal) objectData.getData("TRA_LIQUIDEZ"));
        result.setTraValorNominal((BigDecimal) objectData.getData("TRA_VALOR_NOMINAL"));
        result.setTraRetencionIsr((BigDecimal) objectData.getData("TRA_RETENCION_ISR"));
        result.setTraMercado((BigDecimal) objectData.getData("TRA_MERCADO"));
        result.setTraInstrumento((BigDecimal) objectData.getData("TRA_INSTRUMENTO"));
        result.setTraVector((BigDecimal) objectData.getData("TRA_VECTOR"));
        result.setTraPrecioMerca((BigDecimal) objectData.getData("TRA_PRECIO_MERCA"));
        result.setTraMinusPlus((BigDecimal) objectData.getData("TRA_MINUS_PLUS"));

        return result;

    }

}
