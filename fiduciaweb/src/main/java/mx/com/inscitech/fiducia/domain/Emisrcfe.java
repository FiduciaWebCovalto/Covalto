package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMISRCFE_PK", columns = { "ERF_NUM_PROGRAMA", "ERF_NUM_EMISION" }, sequences = { "MANUAL" })
public class Emisrcfe extends DomainObject {

    BigDecimal erfNumEmision = null;
    BigDecimal erfNumContrato = null;
    String erfNomEmisor = null;
    String erfCveInstrumento = null;
    String erfCvePizarra = null;
    String erfNumSerie = null;
    BigDecimal erfImpEmision = null;
    BigDecimal erfNumTitulos = null;
    BigDecimal erfImpNomEmision = null;
    BigDecimal erfNumMoneda = null;
    String erfDestinoRecurso = null;
    Long erfTextoExtra = null;
    BigDecimal erfAnoPlazo = null;
    BigDecimal erfDiasPlazo = null;
    BigDecimal erfAnoInicio = null;
    BigDecimal erfMesInicio = null;
    BigDecimal erfDiaInicio = null;
    BigDecimal erfAnoVencimiento = null;
    BigDecimal erfMesVencimiento = null;
    BigDecimal erfDiaVencimiento = null;
    String erfRepComun = null;
    String erfIntColocador = null;
    String erfAutorizacionCnbv = null;
    BigDecimal erfAnoCnbv = null;
    BigDecimal erfMesCnbv = null;
    BigDecimal erfDiaCnbv = null;
    String erfAutorizacionBanxico = null;
    BigDecimal erfAnoBanxico = null;
    BigDecimal erfMesBanxico = null;
    BigDecimal erfDiaBanxico = null;
    BigDecimal erfAnoSerie = null;
    BigDecimal erfMesSerie = null;
    BigDecimal erfDiaSerie = null;
    BigDecimal erfAnoSubasta = null;
    BigDecimal erfMesSubasta = null;
    BigDecimal erfDiaSubasta = null;
    BigDecimal erfAnoOfrecimiento = null;
    BigDecimal erfMesOfrecimiento = null;
    BigDecimal erfDiaOfrecimiento = null;
    BigDecimal erfAnoEmision = null;
    BigDecimal erfMesEmision = null;
    BigDecimal erfDiaEmision = null;
    BigDecimal erfAnoBolsa = null;
    BigDecimal erfMesBolsa = null;
    BigDecimal erfDiaBolsa = null;
    BigDecimal erfAnoCruce = null;
    BigDecimal erfMesCruce = null;
    BigDecimal erfDiaCruce = null;
    BigDecimal erfAnoLiquidacion = null;
    BigDecimal erfMesLiquidacion = null;
    BigDecimal erfDiaLiquidacion = null;
    String erfTipoSubasta = null;
    String erfActoConstitutivo = null;
    String erfComiteTecnico = null;
    BigDecimal erfRepoDist = null;
    BigDecimal erfAnoAltaReg = null;
    BigDecimal erfMesAltaReg = null;
    BigDecimal erfDiaAltaReg = null;
    BigDecimal erfAnoUltMod = null;
    BigDecimal erfMesUltMod = null;
    BigDecimal erfDiaUltMod = null;
    BigDecimal erfNumPrograma = null;
    String erfCveStEmisrcfe = null;

    public Emisrcfe() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setErfNumEmision(BigDecimal erfNumEmision) {
        this.erfNumEmision = erfNumEmision;
    }

    public BigDecimal getErfNumEmision() {
        return this.erfNumEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setErfNumContrato(BigDecimal erfNumContrato) {
        this.erfNumContrato = erfNumContrato;
    }

    public BigDecimal getErfNumContrato() {
        return this.erfNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfNomEmisor(String erfNomEmisor) {
        this.erfNomEmisor = erfNomEmisor;
    }

    public String getErfNomEmisor() {
        return this.erfNomEmisor;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfCveInstrumento(String erfCveInstrumento) {
        this.erfCveInstrumento = erfCveInstrumento;
    }

    public String getErfCveInstrumento() {
        return this.erfCveInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfCvePizarra(String erfCvePizarra) {
        this.erfCvePizarra = erfCvePizarra;
    }

    public String getErfCvePizarra() {
        return this.erfCvePizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfNumSerie(String erfNumSerie) {
        this.erfNumSerie = erfNumSerie;
    }

    public String getErfNumSerie() {
        return this.erfNumSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setErfImpEmision(BigDecimal erfImpEmision) {
        this.erfImpEmision = erfImpEmision;
    }

    public BigDecimal getErfImpEmision() {
        return this.erfImpEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setErfNumTitulos(BigDecimal erfNumTitulos) {
        this.erfNumTitulos = erfNumTitulos;
    }

    public BigDecimal getErfNumTitulos() {
        return this.erfNumTitulos;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setErfImpNomEmision(BigDecimal erfImpNomEmision) {
        this.erfImpNomEmision = erfImpNomEmision;
    }

    public BigDecimal getErfImpNomEmision() {
        return this.erfImpNomEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfNumMoneda(BigDecimal erfNumMoneda) {
        this.erfNumMoneda = erfNumMoneda;
    }

    public BigDecimal getErfNumMoneda() {
        return this.erfNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfDestinoRecurso(String erfDestinoRecurso) {
        this.erfDestinoRecurso = erfDestinoRecurso;
    }

    public String getErfDestinoRecurso() {
        return this.erfDestinoRecurso;
    }

    @FieldInfo(nullable = true, dataType = "LONG", javaClass = Long.class)
    public void setErfTextoExtra(Long erfTextoExtra) {
        this.erfTextoExtra = erfTextoExtra;
    }

    public Long getErfTextoExtra() {
        return this.erfTextoExtra;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoPlazo(BigDecimal erfAnoPlazo) {
        this.erfAnoPlazo = erfAnoPlazo;
    }

    public BigDecimal getErfAnoPlazo() {
        return this.erfAnoPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiasPlazo(BigDecimal erfDiasPlazo) {
        this.erfDiasPlazo = erfDiasPlazo;
    }

    public BigDecimal getErfDiasPlazo() {
        return this.erfDiasPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoInicio(BigDecimal erfAnoInicio) {
        this.erfAnoInicio = erfAnoInicio;
    }

    public BigDecimal getErfAnoInicio() {
        return this.erfAnoInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesInicio(BigDecimal erfMesInicio) {
        this.erfMesInicio = erfMesInicio;
    }

    public BigDecimal getErfMesInicio() {
        return this.erfMesInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaInicio(BigDecimal erfDiaInicio) {
        this.erfDiaInicio = erfDiaInicio;
    }

    public BigDecimal getErfDiaInicio() {
        return this.erfDiaInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoVencimiento(BigDecimal erfAnoVencimiento) {
        this.erfAnoVencimiento = erfAnoVencimiento;
    }

    public BigDecimal getErfAnoVencimiento() {
        return this.erfAnoVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesVencimiento(BigDecimal erfMesVencimiento) {
        this.erfMesVencimiento = erfMesVencimiento;
    }

    public BigDecimal getErfMesVencimiento() {
        return this.erfMesVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaVencimiento(BigDecimal erfDiaVencimiento) {
        this.erfDiaVencimiento = erfDiaVencimiento;
    }

    public BigDecimal getErfDiaVencimiento() {
        return this.erfDiaVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfRepComun(String erfRepComun) {
        this.erfRepComun = erfRepComun;
    }

    public String getErfRepComun() {
        return this.erfRepComun;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfIntColocador(String erfIntColocador) {
        this.erfIntColocador = erfIntColocador;
    }

    public String getErfIntColocador() {
        return this.erfIntColocador;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfAutorizacionCnbv(String erfAutorizacionCnbv) {
        this.erfAutorizacionCnbv = erfAutorizacionCnbv;
    }

    public String getErfAutorizacionCnbv() {
        return this.erfAutorizacionCnbv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoCnbv(BigDecimal erfAnoCnbv) {
        this.erfAnoCnbv = erfAnoCnbv;
    }

    public BigDecimal getErfAnoCnbv() {
        return this.erfAnoCnbv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesCnbv(BigDecimal erfMesCnbv) {
        this.erfMesCnbv = erfMesCnbv;
    }

    public BigDecimal getErfMesCnbv() {
        return this.erfMesCnbv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaCnbv(BigDecimal erfDiaCnbv) {
        this.erfDiaCnbv = erfDiaCnbv;
    }

    public BigDecimal getErfDiaCnbv() {
        return this.erfDiaCnbv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfAutorizacionBanxico(String erfAutorizacionBanxico) {
        this.erfAutorizacionBanxico = erfAutorizacionBanxico;
    }

    public String getErfAutorizacionBanxico() {
        return this.erfAutorizacionBanxico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoBanxico(BigDecimal erfAnoBanxico) {
        this.erfAnoBanxico = erfAnoBanxico;
    }

    public BigDecimal getErfAnoBanxico() {
        return this.erfAnoBanxico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesBanxico(BigDecimal erfMesBanxico) {
        this.erfMesBanxico = erfMesBanxico;
    }

    public BigDecimal getErfMesBanxico() {
        return this.erfMesBanxico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaBanxico(BigDecimal erfDiaBanxico) {
        this.erfDiaBanxico = erfDiaBanxico;
    }

    public BigDecimal getErfDiaBanxico() {
        return this.erfDiaBanxico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoSerie(BigDecimal erfAnoSerie) {
        this.erfAnoSerie = erfAnoSerie;
    }

    public BigDecimal getErfAnoSerie() {
        return this.erfAnoSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesSerie(BigDecimal erfMesSerie) {
        this.erfMesSerie = erfMesSerie;
    }

    public BigDecimal getErfMesSerie() {
        return this.erfMesSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaSerie(BigDecimal erfDiaSerie) {
        this.erfDiaSerie = erfDiaSerie;
    }

    public BigDecimal getErfDiaSerie() {
        return this.erfDiaSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoSubasta(BigDecimal erfAnoSubasta) {
        this.erfAnoSubasta = erfAnoSubasta;
    }

    public BigDecimal getErfAnoSubasta() {
        return this.erfAnoSubasta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesSubasta(BigDecimal erfMesSubasta) {
        this.erfMesSubasta = erfMesSubasta;
    }

    public BigDecimal getErfMesSubasta() {
        return this.erfMesSubasta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaSubasta(BigDecimal erfDiaSubasta) {
        this.erfDiaSubasta = erfDiaSubasta;
    }

    public BigDecimal getErfDiaSubasta() {
        return this.erfDiaSubasta;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoOfrecimiento(BigDecimal erfAnoOfrecimiento) {
        this.erfAnoOfrecimiento = erfAnoOfrecimiento;
    }

    public BigDecimal getErfAnoOfrecimiento() {
        return this.erfAnoOfrecimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesOfrecimiento(BigDecimal erfMesOfrecimiento) {
        this.erfMesOfrecimiento = erfMesOfrecimiento;
    }

    public BigDecimal getErfMesOfrecimiento() {
        return this.erfMesOfrecimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaOfrecimiento(BigDecimal erfDiaOfrecimiento) {
        this.erfDiaOfrecimiento = erfDiaOfrecimiento;
    }

    public BigDecimal getErfDiaOfrecimiento() {
        return this.erfDiaOfrecimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoEmision(BigDecimal erfAnoEmision) {
        this.erfAnoEmision = erfAnoEmision;
    }

    public BigDecimal getErfAnoEmision() {
        return this.erfAnoEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesEmision(BigDecimal erfMesEmision) {
        this.erfMesEmision = erfMesEmision;
    }

    public BigDecimal getErfMesEmision() {
        return this.erfMesEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaEmision(BigDecimal erfDiaEmision) {
        this.erfDiaEmision = erfDiaEmision;
    }

    public BigDecimal getErfDiaEmision() {
        return this.erfDiaEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoBolsa(BigDecimal erfAnoBolsa) {
        this.erfAnoBolsa = erfAnoBolsa;
    }

    public BigDecimal getErfAnoBolsa() {
        return this.erfAnoBolsa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesBolsa(BigDecimal erfMesBolsa) {
        this.erfMesBolsa = erfMesBolsa;
    }

    public BigDecimal getErfMesBolsa() {
        return this.erfMesBolsa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaBolsa(BigDecimal erfDiaBolsa) {
        this.erfDiaBolsa = erfDiaBolsa;
    }

    public BigDecimal getErfDiaBolsa() {
        return this.erfDiaBolsa;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoCruce(BigDecimal erfAnoCruce) {
        this.erfAnoCruce = erfAnoCruce;
    }

    public BigDecimal getErfAnoCruce() {
        return this.erfAnoCruce;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesCruce(BigDecimal erfMesCruce) {
        this.erfMesCruce = erfMesCruce;
    }

    public BigDecimal getErfMesCruce() {
        return this.erfMesCruce;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaCruce(BigDecimal erfDiaCruce) {
        this.erfDiaCruce = erfDiaCruce;
    }

    public BigDecimal getErfDiaCruce() {
        return this.erfDiaCruce;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoLiquidacion(BigDecimal erfAnoLiquidacion) {
        this.erfAnoLiquidacion = erfAnoLiquidacion;
    }

    public BigDecimal getErfAnoLiquidacion() {
        return this.erfAnoLiquidacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesLiquidacion(BigDecimal erfMesLiquidacion) {
        this.erfMesLiquidacion = erfMesLiquidacion;
    }

    public BigDecimal getErfMesLiquidacion() {
        return this.erfMesLiquidacion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaLiquidacion(BigDecimal erfDiaLiquidacion) {
        this.erfDiaLiquidacion = erfDiaLiquidacion;
    }

    public BigDecimal getErfDiaLiquidacion() {
        return this.erfDiaLiquidacion;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfTipoSubasta(String erfTipoSubasta) {
        this.erfTipoSubasta = erfTipoSubasta;
    }

    public String getErfTipoSubasta() {
        return this.erfTipoSubasta;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfActoConstitutivo(String erfActoConstitutivo) {
        this.erfActoConstitutivo = erfActoConstitutivo;
    }

    public String getErfActoConstitutivo() {
        return this.erfActoConstitutivo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfComiteTecnico(String erfComiteTecnico) {
        this.erfComiteTecnico = erfComiteTecnico;
    }

    public String getErfComiteTecnico() {
        return this.erfComiteTecnico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfRepoDist(BigDecimal erfRepoDist) {
        this.erfRepoDist = erfRepoDist;
    }

    public BigDecimal getErfRepoDist() {
        return this.erfRepoDist;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoAltaReg(BigDecimal erfAnoAltaReg) {
        this.erfAnoAltaReg = erfAnoAltaReg;
    }

    public BigDecimal getErfAnoAltaReg() {
        return this.erfAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesAltaReg(BigDecimal erfMesAltaReg) {
        this.erfMesAltaReg = erfMesAltaReg;
    }

    public BigDecimal getErfMesAltaReg() {
        return this.erfMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaAltaReg(BigDecimal erfDiaAltaReg) {
        this.erfDiaAltaReg = erfDiaAltaReg;
    }

    public BigDecimal getErfDiaAltaReg() {
        return this.erfDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setErfAnoUltMod(BigDecimal erfAnoUltMod) {
        this.erfAnoUltMod = erfAnoUltMod;
    }

    public BigDecimal getErfAnoUltMod() {
        return this.erfAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfMesUltMod(BigDecimal erfMesUltMod) {
        this.erfMesUltMod = erfMesUltMod;
    }

    public BigDecimal getErfMesUltMod() {
        return this.erfMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setErfDiaUltMod(BigDecimal erfDiaUltMod) {
        this.erfDiaUltMod = erfDiaUltMod;
    }

    public BigDecimal getErfDiaUltMod() {
        return this.erfDiaUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setErfNumPrograma(BigDecimal erfNumPrograma) {
        this.erfNumPrograma = erfNumPrograma;
    }

    public BigDecimal getErfNumPrograma() {
        return this.erfNumPrograma;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setErfCveStEmisrcfe(String erfCveStEmisrcfe) {
        this.erfCveStEmisrcfe = erfCveStEmisrcfe;
    }

    public String getErfCveStEmisrcfe() {
        return this.erfCveStEmisrcfe;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMISRCFE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getErfNumEmision() != null && this.getErfNumEmision().longValue() == -999) {
            conditions += " AND ERF_NUM_EMISION IS NULL";
        } else if (this.getErfNumEmision() != null) {
            conditions += " AND ERF_NUM_EMISION = ?";
            values.add(this.getErfNumEmision());
        }

        if (this.getErfNumPrograma() != null && this.getErfNumPrograma().longValue() == -999) {
            conditions += " AND ERF_NUM_PROGRAMA IS NULL";
        } else if (this.getErfNumPrograma() != null) {
            conditions += " AND ERF_NUM_PROGRAMA = ?";
            values.add(this.getErfNumPrograma());
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
        String sql = "SELECT * FROM EMISRCFE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getErfNumEmision() != null && this.getErfNumEmision().longValue() == -999) {
            conditions += " AND ERF_NUM_EMISION IS NULL";
        } else if (this.getErfNumEmision() != null) {
            conditions += " AND ERF_NUM_EMISION = ?";
            values.add(this.getErfNumEmision());
        }

        if (this.getErfNumContrato() != null && this.getErfNumContrato().longValue() == -999) {
            conditions += " AND ERF_NUM_CONTRATO IS NULL";
        } else if (this.getErfNumContrato() != null) {
            conditions += " AND ERF_NUM_CONTRATO = ?";
            values.add(this.getErfNumContrato());
        }

        if (this.getErfNomEmisor() != null && "null".equals(this.getErfNomEmisor())) {
            conditions += " AND ERF_NOM_EMISOR IS NULL";
        } else if (this.getErfNomEmisor() != null) {
            conditions += " AND ERF_NOM_EMISOR = ?";
            values.add(this.getErfNomEmisor());
        }

        if (this.getErfCveInstrumento() != null && "null".equals(this.getErfCveInstrumento())) {
            conditions += " AND ERF_CVE_INSTRUMENTO IS NULL";
        } else if (this.getErfCveInstrumento() != null) {
            conditions += " AND ERF_CVE_INSTRUMENTO = ?";
            values.add(this.getErfCveInstrumento());
        }

        if (this.getErfCvePizarra() != null && "null".equals(this.getErfCvePizarra())) {
            conditions += " AND ERF_CVE_PIZARRA IS NULL";
        } else if (this.getErfCvePizarra() != null) {
            conditions += " AND ERF_CVE_PIZARRA = ?";
            values.add(this.getErfCvePizarra());
        }

        if (this.getErfNumSerie() != null && "null".equals(this.getErfNumSerie())) {
            conditions += " AND ERF_NUM_SERIE IS NULL";
        } else if (this.getErfNumSerie() != null) {
            conditions += " AND ERF_NUM_SERIE = ?";
            values.add(this.getErfNumSerie());
        }

        if (this.getErfImpEmision() != null && this.getErfImpEmision().longValue() == -999) {
            conditions += " AND ERF_IMP_EMISION IS NULL";
        } else if (this.getErfImpEmision() != null) {
            conditions += " AND ERF_IMP_EMISION = ?";
            values.add(this.getErfImpEmision());
        }

        if (this.getErfNumTitulos() != null && this.getErfNumTitulos().longValue() == -999) {
            conditions += " AND ERF_NUM_TITULOS IS NULL";
        } else if (this.getErfNumTitulos() != null) {
            conditions += " AND ERF_NUM_TITULOS = ?";
            values.add(this.getErfNumTitulos());
        }

        if (this.getErfImpNomEmision() != null && this.getErfImpNomEmision().longValue() == -999) {
            conditions += " AND ERF_IMP_NOM_EMISION IS NULL";
        } else if (this.getErfImpNomEmision() != null) {
            conditions += " AND ERF_IMP_NOM_EMISION = ?";
            values.add(this.getErfImpNomEmision());
        }

        if (this.getErfNumMoneda() != null && this.getErfNumMoneda().longValue() == -999) {
            conditions += " AND ERF_NUM_MONEDA IS NULL";
        } else if (this.getErfNumMoneda() != null) {
            conditions += " AND ERF_NUM_MONEDA = ?";
            values.add(this.getErfNumMoneda());
        }

        if (this.getErfDestinoRecurso() != null && "null".equals(this.getErfDestinoRecurso())) {
            conditions += " AND ERF_DESTINO_RECURSO IS NULL";
        } else if (this.getErfDestinoRecurso() != null) {
            conditions += " AND ERF_DESTINO_RECURSO = ?";
            values.add(this.getErfDestinoRecurso());
        }

        if (this.getErfTextoExtra() != null && this.getErfTextoExtra() == -999) {
            conditions += " AND ERF_TEXTO_EXTRA IS NULL";
        } else if (this.getErfTextoExtra() != null) {
            conditions += " AND ERF_TEXTO_EXTRA = ?";
            values.add(this.getErfTextoExtra());
        }

        if (this.getErfAnoPlazo() != null && this.getErfAnoPlazo().longValue() == -999) {
            conditions += " AND ERF_ANO_PLAZO IS NULL";
        } else if (this.getErfAnoPlazo() != null) {
            conditions += " AND ERF_ANO_PLAZO = ?";
            values.add(this.getErfAnoPlazo());
        }

        if (this.getErfDiasPlazo() != null && this.getErfDiasPlazo().longValue() == -999) {
            conditions += " AND ERF_DIAS_PLAZO IS NULL";
        } else if (this.getErfDiasPlazo() != null) {
            conditions += " AND ERF_DIAS_PLAZO = ?";
            values.add(this.getErfDiasPlazo());
        }

        if (this.getErfAnoInicio() != null && this.getErfAnoInicio().longValue() == -999) {
            conditions += " AND ERF_ANO_INICIO IS NULL";
        } else if (this.getErfAnoInicio() != null) {
            conditions += " AND ERF_ANO_INICIO = ?";
            values.add(this.getErfAnoInicio());
        }

        if (this.getErfMesInicio() != null && this.getErfMesInicio().longValue() == -999) {
            conditions += " AND ERF_MES_INICIO IS NULL";
        } else if (this.getErfMesInicio() != null) {
            conditions += " AND ERF_MES_INICIO = ?";
            values.add(this.getErfMesInicio());
        }

        if (this.getErfDiaInicio() != null && this.getErfDiaInicio().longValue() == -999) {
            conditions += " AND ERF_DIA_INICIO IS NULL";
        } else if (this.getErfDiaInicio() != null) {
            conditions += " AND ERF_DIA_INICIO = ?";
            values.add(this.getErfDiaInicio());
        }

        if (this.getErfAnoVencimiento() != null && this.getErfAnoVencimiento().longValue() == -999) {
            conditions += " AND ERF_ANO_VENCIMIENTO IS NULL";
        } else if (this.getErfAnoVencimiento() != null) {
            conditions += " AND ERF_ANO_VENCIMIENTO = ?";
            values.add(this.getErfAnoVencimiento());
        }

        if (this.getErfMesVencimiento() != null && this.getErfMesVencimiento().longValue() == -999) {
            conditions += " AND ERF_MES_VENCIMIENTO IS NULL";
        } else if (this.getErfMesVencimiento() != null) {
            conditions += " AND ERF_MES_VENCIMIENTO = ?";
            values.add(this.getErfMesVencimiento());
        }

        if (this.getErfDiaVencimiento() != null && this.getErfDiaVencimiento().longValue() == -999) {
            conditions += " AND ERF_DIA_VENCIMIENTO IS NULL";
        } else if (this.getErfDiaVencimiento() != null) {
            conditions += " AND ERF_DIA_VENCIMIENTO = ?";
            values.add(this.getErfDiaVencimiento());
        }

        if (this.getErfRepComun() != null && "null".equals(this.getErfRepComun())) {
            conditions += " AND ERF_REP_COMUN IS NULL";
        } else if (this.getErfRepComun() != null) {
            conditions += " AND ERF_REP_COMUN = ?";
            values.add(this.getErfRepComun());
        }

        if (this.getErfIntColocador() != null && "null".equals(this.getErfIntColocador())) {
            conditions += " AND ERF_INT_COLOCADOR IS NULL";
        } else if (this.getErfIntColocador() != null) {
            conditions += " AND ERF_INT_COLOCADOR = ?";
            values.add(this.getErfIntColocador());
        }

        if (this.getErfAutorizacionCnbv() != null && "null".equals(this.getErfAutorizacionCnbv())) {
            conditions += " AND ERF_AUTORIZACION_CNBV IS NULL";
        } else if (this.getErfAutorizacionCnbv() != null) {
            conditions += " AND ERF_AUTORIZACION_CNBV = ?";
            values.add(this.getErfAutorizacionCnbv());
        }

        if (this.getErfAnoCnbv() != null && this.getErfAnoCnbv().longValue() == -999) {
            conditions += " AND ERF_ANO_CNBV IS NULL";
        } else if (this.getErfAnoCnbv() != null) {
            conditions += " AND ERF_ANO_CNBV = ?";
            values.add(this.getErfAnoCnbv());
        }

        if (this.getErfMesCnbv() != null && this.getErfMesCnbv().longValue() == -999) {
            conditions += " AND ERF_MES_CNBV IS NULL";
        } else if (this.getErfMesCnbv() != null) {
            conditions += " AND ERF_MES_CNBV = ?";
            values.add(this.getErfMesCnbv());
        }

        if (this.getErfDiaCnbv() != null && this.getErfDiaCnbv().longValue() == -999) {
            conditions += " AND ERF_DIA_CNBV IS NULL";
        } else if (this.getErfDiaCnbv() != null) {
            conditions += " AND ERF_DIA_CNBV = ?";
            values.add(this.getErfDiaCnbv());
        }

        if (this.getErfAutorizacionBanxico() != null && "null".equals(this.getErfAutorizacionBanxico())) {
            conditions += " AND ERF_AUTORIZACION_BANXICO IS NULL";
        } else if (this.getErfAutorizacionBanxico() != null) {
            conditions += " AND ERF_AUTORIZACION_BANXICO = ?";
            values.add(this.getErfAutorizacionBanxico());
        }

        if (this.getErfAnoBanxico() != null && this.getErfAnoBanxico().longValue() == -999) {
            conditions += " AND ERF_ANO_BANXICO IS NULL";
        } else if (this.getErfAnoBanxico() != null) {
            conditions += " AND ERF_ANO_BANXICO = ?";
            values.add(this.getErfAnoBanxico());
        }

        if (this.getErfMesBanxico() != null && this.getErfMesBanxico().longValue() == -999) {
            conditions += " AND ERF_MES_BANXICO IS NULL";
        } else if (this.getErfMesBanxico() != null) {
            conditions += " AND ERF_MES_BANXICO = ?";
            values.add(this.getErfMesBanxico());
        }

        if (this.getErfDiaBanxico() != null && this.getErfDiaBanxico().longValue() == -999) {
            conditions += " AND ERF_DIA_BANXICO IS NULL";
        } else if (this.getErfDiaBanxico() != null) {
            conditions += " AND ERF_DIA_BANXICO = ?";
            values.add(this.getErfDiaBanxico());
        }

        if (this.getErfAnoSerie() != null && this.getErfAnoSerie().longValue() == -999) {
            conditions += " AND ERF_ANO_SERIE IS NULL";
        } else if (this.getErfAnoSerie() != null) {
            conditions += " AND ERF_ANO_SERIE = ?";
            values.add(this.getErfAnoSerie());
        }

        if (this.getErfMesSerie() != null && this.getErfMesSerie().longValue() == -999) {
            conditions += " AND ERF_MES_SERIE IS NULL";
        } else if (this.getErfMesSerie() != null) {
            conditions += " AND ERF_MES_SERIE = ?";
            values.add(this.getErfMesSerie());
        }

        if (this.getErfDiaSerie() != null && this.getErfDiaSerie().longValue() == -999) {
            conditions += " AND ERF_DIA_SERIE IS NULL";
        } else if (this.getErfDiaSerie() != null) {
            conditions += " AND ERF_DIA_SERIE = ?";
            values.add(this.getErfDiaSerie());
        }

        if (this.getErfAnoSubasta() != null && this.getErfAnoSubasta().longValue() == -999) {
            conditions += " AND ERF_ANO_SUBASTA IS NULL";
        } else if (this.getErfAnoSubasta() != null) {
            conditions += " AND ERF_ANO_SUBASTA = ?";
            values.add(this.getErfAnoSubasta());
        }

        if (this.getErfMesSubasta() != null && this.getErfMesSubasta().longValue() == -999) {
            conditions += " AND ERF_MES_SUBASTA IS NULL";
        } else if (this.getErfMesSubasta() != null) {
            conditions += " AND ERF_MES_SUBASTA = ?";
            values.add(this.getErfMesSubasta());
        }

        if (this.getErfDiaSubasta() != null && this.getErfDiaSubasta().longValue() == -999) {
            conditions += " AND ERF_DIA_SUBASTA IS NULL";
        } else if (this.getErfDiaSubasta() != null) {
            conditions += " AND ERF_DIA_SUBASTA = ?";
            values.add(this.getErfDiaSubasta());
        }

        if (this.getErfAnoOfrecimiento() != null && this.getErfAnoOfrecimiento().longValue() == -999) {
            conditions += " AND ERF_ANO_OFRECIMIENTO IS NULL";
        } else if (this.getErfAnoOfrecimiento() != null) {
            conditions += " AND ERF_ANO_OFRECIMIENTO = ?";
            values.add(this.getErfAnoOfrecimiento());
        }

        if (this.getErfMesOfrecimiento() != null && this.getErfMesOfrecimiento().longValue() == -999) {
            conditions += " AND ERF_MES_OFRECIMIENTO IS NULL";
        } else if (this.getErfMesOfrecimiento() != null) {
            conditions += " AND ERF_MES_OFRECIMIENTO = ?";
            values.add(this.getErfMesOfrecimiento());
        }

        if (this.getErfDiaOfrecimiento() != null && this.getErfDiaOfrecimiento().longValue() == -999) {
            conditions += " AND ERF_DIA_OFRECIMIENTO IS NULL";
        } else if (this.getErfDiaOfrecimiento() != null) {
            conditions += " AND ERF_DIA_OFRECIMIENTO = ?";
            values.add(this.getErfDiaOfrecimiento());
        }

        if (this.getErfAnoEmision() != null && this.getErfAnoEmision().longValue() == -999) {
            conditions += " AND ERF_ANO_EMISION IS NULL";
        } else if (this.getErfAnoEmision() != null) {
            conditions += " AND ERF_ANO_EMISION = ?";
            values.add(this.getErfAnoEmision());
        }

        if (this.getErfMesEmision() != null && this.getErfMesEmision().longValue() == -999) {
            conditions += " AND ERF_MES_EMISION IS NULL";
        } else if (this.getErfMesEmision() != null) {
            conditions += " AND ERF_MES_EMISION = ?";
            values.add(this.getErfMesEmision());
        }

        if (this.getErfDiaEmision() != null && this.getErfDiaEmision().longValue() == -999) {
            conditions += " AND ERF_DIA_EMISION IS NULL";
        } else if (this.getErfDiaEmision() != null) {
            conditions += " AND ERF_DIA_EMISION = ?";
            values.add(this.getErfDiaEmision());
        }

        if (this.getErfAnoBolsa() != null && this.getErfAnoBolsa().longValue() == -999) {
            conditions += " AND ERF_ANO_BOLSA IS NULL";
        } else if (this.getErfAnoBolsa() != null) {
            conditions += " AND ERF_ANO_BOLSA = ?";
            values.add(this.getErfAnoBolsa());
        }

        if (this.getErfMesBolsa() != null && this.getErfMesBolsa().longValue() == -999) {
            conditions += " AND ERF_MES_BOLSA IS NULL";
        } else if (this.getErfMesBolsa() != null) {
            conditions += " AND ERF_MES_BOLSA = ?";
            values.add(this.getErfMesBolsa());
        }

        if (this.getErfDiaBolsa() != null && this.getErfDiaBolsa().longValue() == -999) {
            conditions += " AND ERF_DIA_BOLSA IS NULL";
        } else if (this.getErfDiaBolsa() != null) {
            conditions += " AND ERF_DIA_BOLSA = ?";
            values.add(this.getErfDiaBolsa());
        }

        if (this.getErfAnoCruce() != null && this.getErfAnoCruce().longValue() == -999) {
            conditions += " AND ERF_ANO_CRUCE IS NULL";
        } else if (this.getErfAnoCruce() != null) {
            conditions += " AND ERF_ANO_CRUCE = ?";
            values.add(this.getErfAnoCruce());
        }

        if (this.getErfMesCruce() != null && this.getErfMesCruce().longValue() == -999) {
            conditions += " AND ERF_MES_CRUCE IS NULL";
        } else if (this.getErfMesCruce() != null) {
            conditions += " AND ERF_MES_CRUCE = ?";
            values.add(this.getErfMesCruce());
        }

        if (this.getErfDiaCruce() != null && this.getErfDiaCruce().longValue() == -999) {
            conditions += " AND ERF_DIA_CRUCE IS NULL";
        } else if (this.getErfDiaCruce() != null) {
            conditions += " AND ERF_DIA_CRUCE = ?";
            values.add(this.getErfDiaCruce());
        }

        if (this.getErfAnoLiquidacion() != null && this.getErfAnoLiquidacion().longValue() == -999) {
            conditions += " AND ERF_ANO_LIQUIDACION IS NULL";
        } else if (this.getErfAnoLiquidacion() != null) {
            conditions += " AND ERF_ANO_LIQUIDACION = ?";
            values.add(this.getErfAnoLiquidacion());
        }

        if (this.getErfMesLiquidacion() != null && this.getErfMesLiquidacion().longValue() == -999) {
            conditions += " AND ERF_MES_LIQUIDACION IS NULL";
        } else if (this.getErfMesLiquidacion() != null) {
            conditions += " AND ERF_MES_LIQUIDACION = ?";
            values.add(this.getErfMesLiquidacion());
        }

        if (this.getErfDiaLiquidacion() != null && this.getErfDiaLiquidacion().longValue() == -999) {
            conditions += " AND ERF_DIA_LIQUIDACION IS NULL";
        } else if (this.getErfDiaLiquidacion() != null) {
            conditions += " AND ERF_DIA_LIQUIDACION = ?";
            values.add(this.getErfDiaLiquidacion());
        }

        if (this.getErfTipoSubasta() != null && "null".equals(this.getErfTipoSubasta())) {
            conditions += " AND ERF_TIPO_SUBASTA IS NULL";
        } else if (this.getErfTipoSubasta() != null) {
            conditions += " AND ERF_TIPO_SUBASTA = ?";
            values.add(this.getErfTipoSubasta());
        }

        if (this.getErfActoConstitutivo() != null && "null".equals(this.getErfActoConstitutivo())) {
            conditions += " AND ERF_ACTO_CONSTITUTIVO IS NULL";
        } else if (this.getErfActoConstitutivo() != null) {
            conditions += " AND ERF_ACTO_CONSTITUTIVO = ?";
            values.add(this.getErfActoConstitutivo());
        }

        if (this.getErfComiteTecnico() != null && "null".equals(this.getErfComiteTecnico())) {
            conditions += " AND ERF_COMITE_TECNICO IS NULL";
        } else if (this.getErfComiteTecnico() != null) {
            conditions += " AND ERF_COMITE_TECNICO = ?";
            values.add(this.getErfComiteTecnico());
        }

        if (this.getErfRepoDist() != null && this.getErfRepoDist().longValue() == -999) {
            conditions += " AND ERF_REPO_DIST IS NULL";
        } else if (this.getErfRepoDist() != null) {
            conditions += " AND ERF_REPO_DIST = ?";
            values.add(this.getErfRepoDist());
        }

        if (this.getErfAnoAltaReg() != null && this.getErfAnoAltaReg().longValue() == -999) {
            conditions += " AND ERF_ANO_ALTA_REG IS NULL";
        } else if (this.getErfAnoAltaReg() != null) {
            conditions += " AND ERF_ANO_ALTA_REG = ?";
            values.add(this.getErfAnoAltaReg());
        }

        if (this.getErfMesAltaReg() != null && this.getErfMesAltaReg().longValue() == -999) {
            conditions += " AND ERF_MES_ALTA_REG IS NULL";
        } else if (this.getErfMesAltaReg() != null) {
            conditions += " AND ERF_MES_ALTA_REG = ?";
            values.add(this.getErfMesAltaReg());
        }

        if (this.getErfDiaAltaReg() != null && this.getErfDiaAltaReg().longValue() == -999) {
            conditions += " AND ERF_DIA_ALTA_REG IS NULL";
        } else if (this.getErfDiaAltaReg() != null) {
            conditions += " AND ERF_DIA_ALTA_REG = ?";
            values.add(this.getErfDiaAltaReg());
        }

        if (this.getErfAnoUltMod() != null && this.getErfAnoUltMod().longValue() == -999) {
            conditions += " AND ERF_ANO_ULT_MOD IS NULL";
        } else if (this.getErfAnoUltMod() != null) {
            conditions += " AND ERF_ANO_ULT_MOD = ?";
            values.add(this.getErfAnoUltMod());
        }

        if (this.getErfMesUltMod() != null && this.getErfMesUltMod().longValue() == -999) {
            conditions += " AND ERF_MES_ULT_MOD IS NULL";
        } else if (this.getErfMesUltMod() != null) {
            conditions += " AND ERF_MES_ULT_MOD = ?";
            values.add(this.getErfMesUltMod());
        }

        if (this.getErfDiaUltMod() != null && this.getErfDiaUltMod().longValue() == -999) {
            conditions += " AND ERF_DIA_ULT_MOD IS NULL";
        } else if (this.getErfDiaUltMod() != null) {
            conditions += " AND ERF_DIA_ULT_MOD = ?";
            values.add(this.getErfDiaUltMod());
        }

        if (this.getErfNumPrograma() != null && this.getErfNumPrograma().longValue() == -999) {
            conditions += " AND ERF_NUM_PROGRAMA IS NULL";
        } else if (this.getErfNumPrograma() != null) {
            conditions += " AND ERF_NUM_PROGRAMA = ?";
            values.add(this.getErfNumPrograma());
        }

        if (this.getErfCveStEmisrcfe() != null && "null".equals(this.getErfCveStEmisrcfe())) {
            conditions += " AND ERF_CVE_ST_EMISRCFE IS NULL";
        } else if (this.getErfCveStEmisrcfe() != null) {
            conditions += " AND ERF_CVE_ST_EMISRCFE = ?";
            values.add(this.getErfCveStEmisrcfe());
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
        String sql = "UPDATE EMISRCFE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ERF_NUM_EMISION = ?";
        pkValues.add(this.getErfNumEmision());
        fields += " ERF_NUM_CONTRATO = ?, ";
        values.add(this.getErfNumContrato());
        fields += " ERF_NOM_EMISOR = ?, ";
        values.add(this.getErfNomEmisor());
        fields += " ERF_CVE_INSTRUMENTO = ?, ";
        values.add(this.getErfCveInstrumento());
        fields += " ERF_CVE_PIZARRA = ?, ";
        values.add(this.getErfCvePizarra());
        fields += " ERF_NUM_SERIE = ?, ";
        values.add(this.getErfNumSerie());
        fields += " ERF_IMP_EMISION = ?, ";
        values.add(this.getErfImpEmision());
        fields += " ERF_NUM_TITULOS = ?, ";
        values.add(this.getErfNumTitulos());
        fields += " ERF_IMP_NOM_EMISION = ?, ";
        values.add(this.getErfImpNomEmision());
        fields += " ERF_NUM_MONEDA = ?, ";
        values.add(this.getErfNumMoneda());
        fields += " ERF_DESTINO_RECURSO = ?, ";
        values.add(this.getErfDestinoRecurso());
        fields += " ERF_TEXTO_EXTRA = ?, ";
        values.add(this.getErfTextoExtra());
        fields += " ERF_ANO_PLAZO = ?, ";
        values.add(this.getErfAnoPlazo());
        fields += " ERF_DIAS_PLAZO = ?, ";
        values.add(this.getErfDiasPlazo());
        fields += " ERF_ANO_INICIO = ?, ";
        values.add(this.getErfAnoInicio());
        fields += " ERF_MES_INICIO = ?, ";
        values.add(this.getErfMesInicio());
        fields += " ERF_DIA_INICIO = ?, ";
        values.add(this.getErfDiaInicio());
        fields += " ERF_ANO_VENCIMIENTO = ?, ";
        values.add(this.getErfAnoVencimiento());
        fields += " ERF_MES_VENCIMIENTO = ?, ";
        values.add(this.getErfMesVencimiento());
        fields += " ERF_DIA_VENCIMIENTO = ?, ";
        values.add(this.getErfDiaVencimiento());
        fields += " ERF_REP_COMUN = ?, ";
        values.add(this.getErfRepComun());
        fields += " ERF_INT_COLOCADOR = ?, ";
        values.add(this.getErfIntColocador());
        fields += " ERF_AUTORIZACION_CNBV = ?, ";
        values.add(this.getErfAutorizacionCnbv());
        fields += " ERF_ANO_CNBV = ?, ";
        values.add(this.getErfAnoCnbv());
        fields += " ERF_MES_CNBV = ?, ";
        values.add(this.getErfMesCnbv());
        fields += " ERF_DIA_CNBV = ?, ";
        values.add(this.getErfDiaCnbv());
        fields += " ERF_AUTORIZACION_BANXICO = ?, ";
        values.add(this.getErfAutorizacionBanxico());
        fields += " ERF_ANO_BANXICO = ?, ";
        values.add(this.getErfAnoBanxico());
        fields += " ERF_MES_BANXICO = ?, ";
        values.add(this.getErfMesBanxico());
        fields += " ERF_DIA_BANXICO = ?, ";
        values.add(this.getErfDiaBanxico());
        fields += " ERF_ANO_SERIE = ?, ";
        values.add(this.getErfAnoSerie());
        fields += " ERF_MES_SERIE = ?, ";
        values.add(this.getErfMesSerie());
        fields += " ERF_DIA_SERIE = ?, ";
        values.add(this.getErfDiaSerie());
        fields += " ERF_ANO_SUBASTA = ?, ";
        values.add(this.getErfAnoSubasta());
        fields += " ERF_MES_SUBASTA = ?, ";
        values.add(this.getErfMesSubasta());
        fields += " ERF_DIA_SUBASTA = ?, ";
        values.add(this.getErfDiaSubasta());
        fields += " ERF_ANO_OFRECIMIENTO = ?, ";
        values.add(this.getErfAnoOfrecimiento());
        fields += " ERF_MES_OFRECIMIENTO = ?, ";
        values.add(this.getErfMesOfrecimiento());
        fields += " ERF_DIA_OFRECIMIENTO = ?, ";
        values.add(this.getErfDiaOfrecimiento());
        fields += " ERF_ANO_EMISION = ?, ";
        values.add(this.getErfAnoEmision());
        fields += " ERF_MES_EMISION = ?, ";
        values.add(this.getErfMesEmision());
        fields += " ERF_DIA_EMISION = ?, ";
        values.add(this.getErfDiaEmision());
        fields += " ERF_ANO_BOLSA = ?, ";
        values.add(this.getErfAnoBolsa());
        fields += " ERF_MES_BOLSA = ?, ";
        values.add(this.getErfMesBolsa());
        fields += " ERF_DIA_BOLSA = ?, ";
        values.add(this.getErfDiaBolsa());
        fields += " ERF_ANO_CRUCE = ?, ";
        values.add(this.getErfAnoCruce());
        fields += " ERF_MES_CRUCE = ?, ";
        values.add(this.getErfMesCruce());
        fields += " ERF_DIA_CRUCE = ?, ";
        values.add(this.getErfDiaCruce());
        fields += " ERF_ANO_LIQUIDACION = ?, ";
        values.add(this.getErfAnoLiquidacion());
        fields += " ERF_MES_LIQUIDACION = ?, ";
        values.add(this.getErfMesLiquidacion());
        fields += " ERF_DIA_LIQUIDACION = ?, ";
        values.add(this.getErfDiaLiquidacion());
        fields += " ERF_TIPO_SUBASTA = ?, ";
        values.add(this.getErfTipoSubasta());
        fields += " ERF_ACTO_CONSTITUTIVO = ?, ";
        values.add(this.getErfActoConstitutivo());
        fields += " ERF_COMITE_TECNICO = ?, ";
        values.add(this.getErfComiteTecnico());
        fields += " ERF_REPO_DIST = ?, ";
        values.add(this.getErfRepoDist());
        fields += " ERF_ANO_ALTA_REG = ?, ";
        values.add(this.getErfAnoAltaReg());
        fields += " ERF_MES_ALTA_REG = ?, ";
        values.add(this.getErfMesAltaReg());
        fields += " ERF_DIA_ALTA_REG = ?, ";
        values.add(this.getErfDiaAltaReg());
        fields += " ERF_ANO_ULT_MOD = ?, ";
        values.add(this.getErfAnoUltMod());
        fields += " ERF_MES_ULT_MOD = ?, ";
        values.add(this.getErfMesUltMod());
        fields += " ERF_DIA_ULT_MOD = ?, ";
        values.add(this.getErfDiaUltMod());
        conditions += " AND ERF_NUM_PROGRAMA = ?";
        pkValues.add(this.getErfNumPrograma());
        fields += " ERF_CVE_ST_EMISRCFE = ?, ";
        values.add(this.getErfCveStEmisrcfe());
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
        String sql = "INSERT INTO EMISRCFE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ERF_NUM_EMISION";
        fieldValues += ", ?";
        values.add(this.getErfNumEmision());

        fields += ", ERF_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getErfNumContrato());

        fields += ", ERF_NOM_EMISOR";
        fieldValues += ", ?";
        values.add(this.getErfNomEmisor());

        fields += ", ERF_CVE_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getErfCveInstrumento());

        fields += ", ERF_CVE_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getErfCvePizarra());

        fields += ", ERF_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getErfNumSerie());

        fields += ", ERF_IMP_EMISION";
        fieldValues += ", ?";
        values.add(this.getErfImpEmision());

        fields += ", ERF_NUM_TITULOS";
        fieldValues += ", ?";
        values.add(this.getErfNumTitulos());

        fields += ", ERF_IMP_NOM_EMISION";
        fieldValues += ", ?";
        values.add(this.getErfImpNomEmision());

        fields += ", ERF_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getErfNumMoneda());

        fields += ", ERF_DESTINO_RECURSO";
        fieldValues += ", ?";
        values.add(this.getErfDestinoRecurso());

        fields += ", ERF_TEXTO_EXTRA";
        fieldValues += ", ?";
        values.add(this.getErfTextoExtra());

        fields += ", ERF_ANO_PLAZO";
        fieldValues += ", ?";
        values.add(this.getErfAnoPlazo());

        fields += ", ERF_DIAS_PLAZO";
        fieldValues += ", ?";
        values.add(this.getErfDiasPlazo());

        fields += ", ERF_ANO_INICIO";
        fieldValues += ", ?";
        values.add(this.getErfAnoInicio());

        fields += ", ERF_MES_INICIO";
        fieldValues += ", ?";
        values.add(this.getErfMesInicio());

        fields += ", ERF_DIA_INICIO";
        fieldValues += ", ?";
        values.add(this.getErfDiaInicio());

        fields += ", ERF_ANO_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getErfAnoVencimiento());

        fields += ", ERF_MES_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getErfMesVencimiento());

        fields += ", ERF_DIA_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getErfDiaVencimiento());

        fields += ", ERF_REP_COMUN";
        fieldValues += ", ?";
        values.add(this.getErfRepComun());

        fields += ", ERF_INT_COLOCADOR";
        fieldValues += ", ?";
        values.add(this.getErfIntColocador());

        fields += ", ERF_AUTORIZACION_CNBV";
        fieldValues += ", ?";
        values.add(this.getErfAutorizacionCnbv());

        fields += ", ERF_ANO_CNBV";
        fieldValues += ", ?";
        values.add(this.getErfAnoCnbv());

        fields += ", ERF_MES_CNBV";
        fieldValues += ", ?";
        values.add(this.getErfMesCnbv());

        fields += ", ERF_DIA_CNBV";
        fieldValues += ", ?";
        values.add(this.getErfDiaCnbv());

        fields += ", ERF_AUTORIZACION_BANXICO";
        fieldValues += ", ?";
        values.add(this.getErfAutorizacionBanxico());

        fields += ", ERF_ANO_BANXICO";
        fieldValues += ", ?";
        values.add(this.getErfAnoBanxico());

        fields += ", ERF_MES_BANXICO";
        fieldValues += ", ?";
        values.add(this.getErfMesBanxico());

        fields += ", ERF_DIA_BANXICO";
        fieldValues += ", ?";
        values.add(this.getErfDiaBanxico());

        fields += ", ERF_ANO_SERIE";
        fieldValues += ", ?";
        values.add(this.getErfAnoSerie());

        fields += ", ERF_MES_SERIE";
        fieldValues += ", ?";
        values.add(this.getErfMesSerie());

        fields += ", ERF_DIA_SERIE";
        fieldValues += ", ?";
        values.add(this.getErfDiaSerie());

        fields += ", ERF_ANO_SUBASTA";
        fieldValues += ", ?";
        values.add(this.getErfAnoSubasta());

        fields += ", ERF_MES_SUBASTA";
        fieldValues += ", ?";
        values.add(this.getErfMesSubasta());

        fields += ", ERF_DIA_SUBASTA";
        fieldValues += ", ?";
        values.add(this.getErfDiaSubasta());

        fields += ", ERF_ANO_OFRECIMIENTO";
        fieldValues += ", ?";
        values.add(this.getErfAnoOfrecimiento());

        fields += ", ERF_MES_OFRECIMIENTO";
        fieldValues += ", ?";
        values.add(this.getErfMesOfrecimiento());

        fields += ", ERF_DIA_OFRECIMIENTO";
        fieldValues += ", ?";
        values.add(this.getErfDiaOfrecimiento());

        fields += ", ERF_ANO_EMISION";
        fieldValues += ", ?";
        values.add(this.getErfAnoEmision());

        fields += ", ERF_MES_EMISION";
        fieldValues += ", ?";
        values.add(this.getErfMesEmision());

        fields += ", ERF_DIA_EMISION";
        fieldValues += ", ?";
        values.add(this.getErfDiaEmision());

        fields += ", ERF_ANO_BOLSA";
        fieldValues += ", ?";
        values.add(this.getErfAnoBolsa());

        fields += ", ERF_MES_BOLSA";
        fieldValues += ", ?";
        values.add(this.getErfMesBolsa());

        fields += ", ERF_DIA_BOLSA";
        fieldValues += ", ?";
        values.add(this.getErfDiaBolsa());

        fields += ", ERF_ANO_CRUCE";
        fieldValues += ", ?";
        values.add(this.getErfAnoCruce());

        fields += ", ERF_MES_CRUCE";
        fieldValues += ", ?";
        values.add(this.getErfMesCruce());

        fields += ", ERF_DIA_CRUCE";
        fieldValues += ", ?";
        values.add(this.getErfDiaCruce());

        fields += ", ERF_ANO_LIQUIDACION";
        fieldValues += ", ?";
        values.add(this.getErfAnoLiquidacion());

        fields += ", ERF_MES_LIQUIDACION";
        fieldValues += ", ?";
        values.add(this.getErfMesLiquidacion());

        fields += ", ERF_DIA_LIQUIDACION";
        fieldValues += ", ?";
        values.add(this.getErfDiaLiquidacion());

        fields += ", ERF_TIPO_SUBASTA";
        fieldValues += ", ?";
        values.add(this.getErfTipoSubasta());

        fields += ", ERF_ACTO_CONSTITUTIVO";
        fieldValues += ", ?";
        values.add(this.getErfActoConstitutivo());

        fields += ", ERF_COMITE_TECNICO";
        fieldValues += ", ?";
        values.add(this.getErfComiteTecnico());

        fields += ", ERF_REPO_DIST";
        fieldValues += ", ?";
        values.add(this.getErfRepoDist());

        fields += ", ERF_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getErfAnoAltaReg());

        fields += ", ERF_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getErfMesAltaReg());

        fields += ", ERF_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getErfDiaAltaReg());

        fields += ", ERF_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getErfAnoUltMod());

        fields += ", ERF_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getErfMesUltMod());

        fields += ", ERF_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getErfDiaUltMod());

        fields += ", ERF_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getErfNumPrograma());

        fields += ", ERF_CVE_ST_EMISRCFE";
        fieldValues += ", ?";
        values.add(this.getErfCveStEmisrcfe());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMISRCFE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ERF_NUM_EMISION = ?";
        values.add(this.getErfNumEmision());
        conditions += " AND ERF_NUM_PROGRAMA = ?";
        values.add(this.getErfNumPrograma());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Emisrcfe instance = (Emisrcfe) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getErfNumEmision().equals(instance.getErfNumEmision()))
            equalObjects = false;
        if (equalObjects && !this.getErfNumContrato().equals(instance.getErfNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getErfNomEmisor().equals(instance.getErfNomEmisor()))
            equalObjects = false;
        if (equalObjects && !this.getErfCveInstrumento().equals(instance.getErfCveInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getErfCvePizarra().equals(instance.getErfCvePizarra()))
            equalObjects = false;
        if (equalObjects && !this.getErfNumSerie().equals(instance.getErfNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getErfImpEmision().equals(instance.getErfImpEmision()))
            equalObjects = false;
        if (equalObjects && !this.getErfNumTitulos().equals(instance.getErfNumTitulos()))
            equalObjects = false;
        if (equalObjects && !this.getErfImpNomEmision().equals(instance.getErfImpNomEmision()))
            equalObjects = false;
        if (equalObjects && !this.getErfNumMoneda().equals(instance.getErfNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getErfDestinoRecurso().equals(instance.getErfDestinoRecurso()))
            equalObjects = false;
        if (equalObjects && !this.getErfTextoExtra().equals(instance.getErfTextoExtra()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoPlazo().equals(instance.getErfAnoPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiasPlazo().equals(instance.getErfDiasPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoInicio().equals(instance.getErfAnoInicio()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesInicio().equals(instance.getErfMesInicio()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaInicio().equals(instance.getErfDiaInicio()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoVencimiento().equals(instance.getErfAnoVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesVencimiento().equals(instance.getErfMesVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaVencimiento().equals(instance.getErfDiaVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getErfRepComun().equals(instance.getErfRepComun()))
            equalObjects = false;
        if (equalObjects && !this.getErfIntColocador().equals(instance.getErfIntColocador()))
            equalObjects = false;
        if (equalObjects && !this.getErfAutorizacionCnbv().equals(instance.getErfAutorizacionCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoCnbv().equals(instance.getErfAnoCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesCnbv().equals(instance.getErfMesCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaCnbv().equals(instance.getErfDiaCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getErfAutorizacionBanxico().equals(instance.getErfAutorizacionBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoBanxico().equals(instance.getErfAnoBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesBanxico().equals(instance.getErfMesBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaBanxico().equals(instance.getErfDiaBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoSerie().equals(instance.getErfAnoSerie()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesSerie().equals(instance.getErfMesSerie()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaSerie().equals(instance.getErfDiaSerie()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoSubasta().equals(instance.getErfAnoSubasta()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesSubasta().equals(instance.getErfMesSubasta()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaSubasta().equals(instance.getErfDiaSubasta()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoOfrecimiento().equals(instance.getErfAnoOfrecimiento()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesOfrecimiento().equals(instance.getErfMesOfrecimiento()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaOfrecimiento().equals(instance.getErfDiaOfrecimiento()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoEmision().equals(instance.getErfAnoEmision()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesEmision().equals(instance.getErfMesEmision()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaEmision().equals(instance.getErfDiaEmision()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoBolsa().equals(instance.getErfAnoBolsa()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesBolsa().equals(instance.getErfMesBolsa()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaBolsa().equals(instance.getErfDiaBolsa()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoCruce().equals(instance.getErfAnoCruce()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesCruce().equals(instance.getErfMesCruce()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaCruce().equals(instance.getErfDiaCruce()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoLiquidacion().equals(instance.getErfAnoLiquidacion()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesLiquidacion().equals(instance.getErfMesLiquidacion()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaLiquidacion().equals(instance.getErfDiaLiquidacion()))
            equalObjects = false;
        if (equalObjects && !this.getErfTipoSubasta().equals(instance.getErfTipoSubasta()))
            equalObjects = false;
        if (equalObjects && !this.getErfActoConstitutivo().equals(instance.getErfActoConstitutivo()))
            equalObjects = false;
        if (equalObjects && !this.getErfComiteTecnico().equals(instance.getErfComiteTecnico()))
            equalObjects = false;
        if (equalObjects && !this.getErfRepoDist().equals(instance.getErfRepoDist()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoAltaReg().equals(instance.getErfAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesAltaReg().equals(instance.getErfMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaAltaReg().equals(instance.getErfDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getErfAnoUltMod().equals(instance.getErfAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getErfMesUltMod().equals(instance.getErfMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getErfDiaUltMod().equals(instance.getErfDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getErfNumPrograma().equals(instance.getErfNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getErfCveStEmisrcfe().equals(instance.getErfCveStEmisrcfe()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Emisrcfe result = new Emisrcfe();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setErfNumEmision((BigDecimal) objectData.getData("ERF_NUM_EMISION"));
        result.setErfNumContrato((BigDecimal) objectData.getData("ERF_NUM_CONTRATO"));
        result.setErfNomEmisor((String) objectData.getData("ERF_NOM_EMISOR"));
        result.setErfCveInstrumento((String) objectData.getData("ERF_CVE_INSTRUMENTO"));
        result.setErfCvePizarra((String) objectData.getData("ERF_CVE_PIZARRA"));
        result.setErfNumSerie((String) objectData.getData("ERF_NUM_SERIE"));
        result.setErfImpEmision((BigDecimal) objectData.getData("ERF_IMP_EMISION"));
        result.setErfNumTitulos((BigDecimal) objectData.getData("ERF_NUM_TITULOS"));
        result.setErfImpNomEmision((BigDecimal) objectData.getData("ERF_IMP_NOM_EMISION"));
        result.setErfNumMoneda((BigDecimal) objectData.getData("ERF_NUM_MONEDA"));
        result.setErfDestinoRecurso((String) objectData.getData("ERF_DESTINO_RECURSO"));
        result.setErfTextoExtra((Long) objectData.getData("ERF_TEXTO_EXTRA"));
        result.setErfAnoPlazo((BigDecimal) objectData.getData("ERF_ANO_PLAZO"));
        result.setErfDiasPlazo((BigDecimal) objectData.getData("ERF_DIAS_PLAZO"));
        result.setErfAnoInicio((BigDecimal) objectData.getData("ERF_ANO_INICIO"));
        result.setErfMesInicio((BigDecimal) objectData.getData("ERF_MES_INICIO"));
        result.setErfDiaInicio((BigDecimal) objectData.getData("ERF_DIA_INICIO"));
        result.setErfAnoVencimiento((BigDecimal) objectData.getData("ERF_ANO_VENCIMIENTO"));
        result.setErfMesVencimiento((BigDecimal) objectData.getData("ERF_MES_VENCIMIENTO"));
        result.setErfDiaVencimiento((BigDecimal) objectData.getData("ERF_DIA_VENCIMIENTO"));
        result.setErfRepComun((String) objectData.getData("ERF_REP_COMUN"));
        result.setErfIntColocador((String) objectData.getData("ERF_INT_COLOCADOR"));
        result.setErfAutorizacionCnbv((String) objectData.getData("ERF_AUTORIZACION_CNBV"));
        result.setErfAnoCnbv((BigDecimal) objectData.getData("ERF_ANO_CNBV"));
        result.setErfMesCnbv((BigDecimal) objectData.getData("ERF_MES_CNBV"));
        result.setErfDiaCnbv((BigDecimal) objectData.getData("ERF_DIA_CNBV"));
        result.setErfAutorizacionBanxico((String) objectData.getData("ERF_AUTORIZACION_BANXICO"));
        result.setErfAnoBanxico((BigDecimal) objectData.getData("ERF_ANO_BANXICO"));
        result.setErfMesBanxico((BigDecimal) objectData.getData("ERF_MES_BANXICO"));
        result.setErfDiaBanxico((BigDecimal) objectData.getData("ERF_DIA_BANXICO"));
        result.setErfAnoSerie((BigDecimal) objectData.getData("ERF_ANO_SERIE"));
        result.setErfMesSerie((BigDecimal) objectData.getData("ERF_MES_SERIE"));
        result.setErfDiaSerie((BigDecimal) objectData.getData("ERF_DIA_SERIE"));
        result.setErfAnoSubasta((BigDecimal) objectData.getData("ERF_ANO_SUBASTA"));
        result.setErfMesSubasta((BigDecimal) objectData.getData("ERF_MES_SUBASTA"));
        result.setErfDiaSubasta((BigDecimal) objectData.getData("ERF_DIA_SUBASTA"));
        result.setErfAnoOfrecimiento((BigDecimal) objectData.getData("ERF_ANO_OFRECIMIENTO"));
        result.setErfMesOfrecimiento((BigDecimal) objectData.getData("ERF_MES_OFRECIMIENTO"));
        result.setErfDiaOfrecimiento((BigDecimal) objectData.getData("ERF_DIA_OFRECIMIENTO"));
        result.setErfAnoEmision((BigDecimal) objectData.getData("ERF_ANO_EMISION"));
        result.setErfMesEmision((BigDecimal) objectData.getData("ERF_MES_EMISION"));
        result.setErfDiaEmision((BigDecimal) objectData.getData("ERF_DIA_EMISION"));
        result.setErfAnoBolsa((BigDecimal) objectData.getData("ERF_ANO_BOLSA"));
        result.setErfMesBolsa((BigDecimal) objectData.getData("ERF_MES_BOLSA"));
        result.setErfDiaBolsa((BigDecimal) objectData.getData("ERF_DIA_BOLSA"));
        result.setErfAnoCruce((BigDecimal) objectData.getData("ERF_ANO_CRUCE"));
        result.setErfMesCruce((BigDecimal) objectData.getData("ERF_MES_CRUCE"));
        result.setErfDiaCruce((BigDecimal) objectData.getData("ERF_DIA_CRUCE"));
        result.setErfAnoLiquidacion((BigDecimal) objectData.getData("ERF_ANO_LIQUIDACION"));
        result.setErfMesLiquidacion((BigDecimal) objectData.getData("ERF_MES_LIQUIDACION"));
        result.setErfDiaLiquidacion((BigDecimal) objectData.getData("ERF_DIA_LIQUIDACION"));
        result.setErfTipoSubasta((String) objectData.getData("ERF_TIPO_SUBASTA"));
        result.setErfActoConstitutivo((String) objectData.getData("ERF_ACTO_CONSTITUTIVO"));
        result.setErfComiteTecnico((String) objectData.getData("ERF_COMITE_TECNICO"));
        result.setErfRepoDist((BigDecimal) objectData.getData("ERF_REPO_DIST"));
        result.setErfAnoAltaReg((BigDecimal) objectData.getData("ERF_ANO_ALTA_REG"));
        result.setErfMesAltaReg((BigDecimal) objectData.getData("ERF_MES_ALTA_REG"));
        result.setErfDiaAltaReg((BigDecimal) objectData.getData("ERF_DIA_ALTA_REG"));
        result.setErfAnoUltMod((BigDecimal) objectData.getData("ERF_ANO_ULT_MOD"));
        result.setErfMesUltMod((BigDecimal) objectData.getData("ERF_MES_ULT_MOD"));
        result.setErfDiaUltMod((BigDecimal) objectData.getData("ERF_DIA_ULT_MOD"));
        result.setErfNumPrograma((BigDecimal) objectData.getData("ERF_NUM_PROGRAMA"));
        result.setErfCveStEmisrcfe((String) objectData.getData("ERF_CVE_ST_EMISRCFE"));

        return result;

    }

}
