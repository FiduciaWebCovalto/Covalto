package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "REPCFIDE_PK", columns = { "RPF_NUM_PROGRAMA" }, sequences = { "MAX" })
public class Repcfide extends DomainObject {

    BigDecimal rpfNumPrograma = null;
    BigDecimal rpfTipoNegocio = null;
    String rpfNomPrograma = null;
    BigDecimal rpfNumContrato = null;
    String rpfCveInstrumento = null;
    String rpfModalidadEmision = null;
    BigDecimal rpfImpPrograma = null;
    BigDecimal rpfNumMoneda = null;
    BigDecimal rpfAnoPlazo = null;
    BigDecimal rpfDiasPlazo = null;
    String rpfNumSerie = null;
    BigDecimal rpfImpSerie = null;
    String rpfAutorizacionCnbv = null;
    BigDecimal rpfAnoCnbv = null;
    BigDecimal rpfMesCnbv = null;
    BigDecimal rpfDiaCnbv = null;
    String rpfAutorizacionBanxico = null;
    BigDecimal rpfAnoBanxico = null;
    BigDecimal rpfMesBanxico = null;
    BigDecimal rpfDiaBanxico = null;
    BigDecimal rpfAnoInicio = null;
    BigDecimal rpfMesInicio = null;
    BigDecimal rpfDiaInicio = null;
    BigDecimal rpfAnoVencimiento = null;
    BigDecimal rpfMesVencimiento = null;
    BigDecimal rpfDiaVencimiento = null;
    BigDecimal rpfAnoAltaReg = null;
    BigDecimal rpfMesAltaReg = null;
    BigDecimal rpfDiaAltaReg = null;
    BigDecimal rpfAnoUltMod = null;
    BigDecimal rpfMesUltMod = null;
    BigDecimal rpfDiaUltMod = null;
    String rpfCveStRepcfide = null;
    String rpfAutorizacionRegval = null;

    public Repcfide() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpfNumPrograma(BigDecimal rpfNumPrograma) {
        this.rpfNumPrograma = rpfNumPrograma;
    }

    public BigDecimal getRpfNumPrograma() {
        return this.rpfNumPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpfTipoNegocio(BigDecimal rpfTipoNegocio) {
        this.rpfTipoNegocio = rpfTipoNegocio;
    }

    public BigDecimal getRpfTipoNegocio() {
        return this.rpfTipoNegocio;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpfNomPrograma(String rpfNomPrograma) {
        this.rpfNomPrograma = rpfNomPrograma;
    }

    public String getRpfNomPrograma() {
        return this.rpfNomPrograma;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setRpfNumContrato(BigDecimal rpfNumContrato) {
        this.rpfNumContrato = rpfNumContrato;
    }

    public BigDecimal getRpfNumContrato() {
        return this.rpfNumContrato;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpfCveInstrumento(String rpfCveInstrumento) {
        this.rpfCveInstrumento = rpfCveInstrumento;
    }

    public String getRpfCveInstrumento() {
        return this.rpfCveInstrumento;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpfModalidadEmision(String rpfModalidadEmision) {
        this.rpfModalidadEmision = rpfModalidadEmision;
    }

    public String getRpfModalidadEmision() {
        return this.rpfModalidadEmision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRpfImpPrograma(BigDecimal rpfImpPrograma) {
        this.rpfImpPrograma = rpfImpPrograma;
    }

    public BigDecimal getRpfImpPrograma() {
        return this.rpfImpPrograma;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpfNumMoneda(BigDecimal rpfNumMoneda) {
        this.rpfNumMoneda = rpfNumMoneda;
    }

    public BigDecimal getRpfNumMoneda() {
        return this.rpfNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpfAnoPlazo(BigDecimal rpfAnoPlazo) {
        this.rpfAnoPlazo = rpfAnoPlazo;
    }

    public BigDecimal getRpfAnoPlazo() {
        return this.rpfAnoPlazo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 8, scale = 0, javaClass = BigDecimal.class)
    public void setRpfDiasPlazo(BigDecimal rpfDiasPlazo) {
        this.rpfDiasPlazo = rpfDiasPlazo;
    }

    public BigDecimal getRpfDiasPlazo() {
        return this.rpfDiasPlazo;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpfNumSerie(String rpfNumSerie) {
        this.rpfNumSerie = rpfNumSerie;
    }

    public String getRpfNumSerie() {
        return this.rpfNumSerie;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 18, scale = 2, javaClass = BigDecimal.class)
    public void setRpfImpSerie(BigDecimal rpfImpSerie) {
        this.rpfImpSerie = rpfImpSerie;
    }

    public BigDecimal getRpfImpSerie() {
        return this.rpfImpSerie;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpfAutorizacionCnbv(String rpfAutorizacionCnbv) {
        this.rpfAutorizacionCnbv = rpfAutorizacionCnbv;
    }

    public String getRpfAutorizacionCnbv() {
        return this.rpfAutorizacionCnbv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpfAnoCnbv(BigDecimal rpfAnoCnbv) {
        this.rpfAnoCnbv = rpfAnoCnbv;
    }

    public BigDecimal getRpfAnoCnbv() {
        return this.rpfAnoCnbv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfMesCnbv(BigDecimal rpfMesCnbv) {
        this.rpfMesCnbv = rpfMesCnbv;
    }

    public BigDecimal getRpfMesCnbv() {
        return this.rpfMesCnbv;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfDiaCnbv(BigDecimal rpfDiaCnbv) {
        this.rpfDiaCnbv = rpfDiaCnbv;
    }

    public BigDecimal getRpfDiaCnbv() {
        return this.rpfDiaCnbv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpfAutorizacionBanxico(String rpfAutorizacionBanxico) {
        this.rpfAutorizacionBanxico = rpfAutorizacionBanxico;
    }

    public String getRpfAutorizacionBanxico() {
        return this.rpfAutorizacionBanxico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpfAnoBanxico(BigDecimal rpfAnoBanxico) {
        this.rpfAnoBanxico = rpfAnoBanxico;
    }

    public BigDecimal getRpfAnoBanxico() {
        return this.rpfAnoBanxico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfMesBanxico(BigDecimal rpfMesBanxico) {
        this.rpfMesBanxico = rpfMesBanxico;
    }

    public BigDecimal getRpfMesBanxico() {
        return this.rpfMesBanxico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfDiaBanxico(BigDecimal rpfDiaBanxico) {
        this.rpfDiaBanxico = rpfDiaBanxico;
    }

    public BigDecimal getRpfDiaBanxico() {
        return this.rpfDiaBanxico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpfAnoInicio(BigDecimal rpfAnoInicio) {
        this.rpfAnoInicio = rpfAnoInicio;
    }

    public BigDecimal getRpfAnoInicio() {
        return this.rpfAnoInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfMesInicio(BigDecimal rpfMesInicio) {
        this.rpfMesInicio = rpfMesInicio;
    }

    public BigDecimal getRpfMesInicio() {
        return this.rpfMesInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfDiaInicio(BigDecimal rpfDiaInicio) {
        this.rpfDiaInicio = rpfDiaInicio;
    }

    public BigDecimal getRpfDiaInicio() {
        return this.rpfDiaInicio;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpfAnoVencimiento(BigDecimal rpfAnoVencimiento) {
        this.rpfAnoVencimiento = rpfAnoVencimiento;
    }

    public BigDecimal getRpfAnoVencimiento() {
        return this.rpfAnoVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfMesVencimiento(BigDecimal rpfMesVencimiento) {
        this.rpfMesVencimiento = rpfMesVencimiento;
    }

    public BigDecimal getRpfMesVencimiento() {
        return this.rpfMesVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfDiaVencimiento(BigDecimal rpfDiaVencimiento) {
        this.rpfDiaVencimiento = rpfDiaVencimiento;
    }

    public BigDecimal getRpfDiaVencimiento() {
        return this.rpfDiaVencimiento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpfAnoAltaReg(BigDecimal rpfAnoAltaReg) {
        this.rpfAnoAltaReg = rpfAnoAltaReg;
    }

    public BigDecimal getRpfAnoAltaReg() {
        return this.rpfAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfMesAltaReg(BigDecimal rpfMesAltaReg) {
        this.rpfMesAltaReg = rpfMesAltaReg;
    }

    public BigDecimal getRpfMesAltaReg() {
        return this.rpfMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfDiaAltaReg(BigDecimal rpfDiaAltaReg) {
        this.rpfDiaAltaReg = rpfDiaAltaReg;
    }

    public BigDecimal getRpfDiaAltaReg() {
        return this.rpfDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setRpfAnoUltMod(BigDecimal rpfAnoUltMod) {
        this.rpfAnoUltMod = rpfAnoUltMod;
    }

    public BigDecimal getRpfAnoUltMod() {
        return this.rpfAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfMesUltMod(BigDecimal rpfMesUltMod) {
        this.rpfMesUltMod = rpfMesUltMod;
    }

    public BigDecimal getRpfMesUltMod() {
        return this.rpfMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setRpfDiaUltMod(BigDecimal rpfDiaUltMod) {
        this.rpfDiaUltMod = rpfDiaUltMod;
    }

    public BigDecimal getRpfDiaUltMod() {
        return this.rpfDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpfCveStRepcfide(String rpfCveStRepcfide) {
        this.rpfCveStRepcfide = rpfCveStRepcfide;
    }

    public String getRpfCveStRepcfide() {
        return this.rpfCveStRepcfide;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setRpfAutorizacionRegval(String rpfAutorizacionRegval) {
        this.rpfAutorizacionRegval = rpfAutorizacionRegval;
    }

    public String getRpfAutorizacionRegval() {
        return this.rpfAutorizacionRegval;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM REPCFIDE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRpfNumPrograma() != null && this.getRpfNumPrograma().longValue() == -999) {
            conditions += " AND RPF_NUM_PROGRAMA IS NULL";
        } else if (this.getRpfNumPrograma() != null) {
            conditions += " AND RPF_NUM_PROGRAMA = ?";
            values.add(this.getRpfNumPrograma());
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
        String sql = "SELECT * FROM REPCFIDE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getRpfNumPrograma() != null && this.getRpfNumPrograma().longValue() == -999) {
            conditions += " AND RPF_NUM_PROGRAMA IS NULL";
        } else if (this.getRpfNumPrograma() != null) {
            conditions += " AND RPF_NUM_PROGRAMA = ?";
            values.add(this.getRpfNumPrograma());
        }

        if (this.getRpfTipoNegocio() != null && this.getRpfTipoNegocio().longValue() == -999) {
            conditions += " AND RPF_TIPO_NEGOCIO IS NULL";
        } else if (this.getRpfTipoNegocio() != null) {
            conditions += " AND RPF_TIPO_NEGOCIO = ?";
            values.add(this.getRpfTipoNegocio());
        }

        if (this.getRpfNomPrograma() != null && "null".equals(this.getRpfNomPrograma())) {
            conditions += " AND RPF_NOM_PROGRAMA IS NULL";
        } else if (this.getRpfNomPrograma() != null) {
            conditions += " AND RPF_NOM_PROGRAMA = ?";
            values.add(this.getRpfNomPrograma());
        }

        if (this.getRpfNumContrato() != null && this.getRpfNumContrato().longValue() == -999) {
            conditions += " AND RPF_NUM_CONTRATO IS NULL";
        } else if (this.getRpfNumContrato() != null) {
            conditions += " AND RPF_NUM_CONTRATO = ?";
            values.add(this.getRpfNumContrato());
        }

        if (this.getRpfCveInstrumento() != null && "null".equals(this.getRpfCveInstrumento())) {
            conditions += " AND RPF_CVE_INSTRUMENTO IS NULL";
        } else if (this.getRpfCveInstrumento() != null) {
            conditions += " AND RPF_CVE_INSTRUMENTO = ?";
            values.add(this.getRpfCveInstrumento());
        }

        if (this.getRpfModalidadEmision() != null && "null".equals(this.getRpfModalidadEmision())) {
            conditions += " AND RPF_MODALIDAD_EMISION IS NULL";
        } else if (this.getRpfModalidadEmision() != null) {
            conditions += " AND RPF_MODALIDAD_EMISION = ?";
            values.add(this.getRpfModalidadEmision());
        }

        if (this.getRpfImpPrograma() != null && this.getRpfImpPrograma().longValue() == -999) {
            conditions += " AND RPF_IMP_PROGRAMA IS NULL";
        } else if (this.getRpfImpPrograma() != null) {
            conditions += " AND RPF_IMP_PROGRAMA = ?";
            values.add(this.getRpfImpPrograma());
        }

        if (this.getRpfNumMoneda() != null && this.getRpfNumMoneda().longValue() == -999) {
            conditions += " AND RPF_NUM_MONEDA IS NULL";
        } else if (this.getRpfNumMoneda() != null) {
            conditions += " AND RPF_NUM_MONEDA = ?";
            values.add(this.getRpfNumMoneda());
        }

        if (this.getRpfAnoPlazo() != null && this.getRpfAnoPlazo().longValue() == -999) {
            conditions += " AND RPF_ANO_PLAZO IS NULL";
        } else if (this.getRpfAnoPlazo() != null) {
            conditions += " AND RPF_ANO_PLAZO = ?";
            values.add(this.getRpfAnoPlazo());
        }

        if (this.getRpfDiasPlazo() != null && this.getRpfDiasPlazo().longValue() == -999) {
            conditions += " AND RPF_DIAS_PLAZO IS NULL";
        } else if (this.getRpfDiasPlazo() != null) {
            conditions += " AND RPF_DIAS_PLAZO = ?";
            values.add(this.getRpfDiasPlazo());
        }

        if (this.getRpfNumSerie() != null && "null".equals(this.getRpfNumSerie())) {
            conditions += " AND RPF_NUM_SERIE IS NULL";
        } else if (this.getRpfNumSerie() != null) {
            conditions += " AND RPF_NUM_SERIE = ?";
            values.add(this.getRpfNumSerie());
        }

        if (this.getRpfImpSerie() != null && this.getRpfImpSerie().longValue() == -999) {
            conditions += " AND RPF_IMP_SERIE IS NULL";
        } else if (this.getRpfImpSerie() != null) {
            conditions += " AND RPF_IMP_SERIE = ?";
            values.add(this.getRpfImpSerie());
        }

        if (this.getRpfAutorizacionCnbv() != null && "null".equals(this.getRpfAutorizacionCnbv())) {
            conditions += " AND RPF_AUTORIZACION_CNBV IS NULL";
        } else if (this.getRpfAutorizacionCnbv() != null) {
            conditions += " AND RPF_AUTORIZACION_CNBV = ?";
            values.add(this.getRpfAutorizacionCnbv());
        }

        if (this.getRpfAnoCnbv() != null && this.getRpfAnoCnbv().longValue() == -999) {
            conditions += " AND RPF_ANO_CNBV IS NULL";
        } else if (this.getRpfAnoCnbv() != null) {
            conditions += " AND RPF_ANO_CNBV = ?";
            values.add(this.getRpfAnoCnbv());
        }

        if (this.getRpfMesCnbv() != null && this.getRpfMesCnbv().longValue() == -999) {
            conditions += " AND RPF_MES_CNBV IS NULL";
        } else if (this.getRpfMesCnbv() != null) {
            conditions += " AND RPF_MES_CNBV = ?";
            values.add(this.getRpfMesCnbv());
        }

        if (this.getRpfDiaCnbv() != null && this.getRpfDiaCnbv().longValue() == -999) {
            conditions += " AND RPF_DIA_CNBV IS NULL";
        } else if (this.getRpfDiaCnbv() != null) {
            conditions += " AND RPF_DIA_CNBV = ?";
            values.add(this.getRpfDiaCnbv());
        }

        if (this.getRpfAutorizacionBanxico() != null && "null".equals(this.getRpfAutorizacionBanxico())) {
            conditions += " AND RPF_AUTORIZACION_BANXICO IS NULL";
        } else if (this.getRpfAutorizacionBanxico() != null) {
            conditions += " AND RPF_AUTORIZACION_BANXICO = ?";
            values.add(this.getRpfAutorizacionBanxico());
        }

        if (this.getRpfAnoBanxico() != null && this.getRpfAnoBanxico().longValue() == -999) {
            conditions += " AND RPF_ANO_BANXICO IS NULL";
        } else if (this.getRpfAnoBanxico() != null) {
            conditions += " AND RPF_ANO_BANXICO = ?";
            values.add(this.getRpfAnoBanxico());
        }

        if (this.getRpfMesBanxico() != null && this.getRpfMesBanxico().longValue() == -999) {
            conditions += " AND RPF_MES_BANXICO IS NULL";
        } else if (this.getRpfMesBanxico() != null) {
            conditions += " AND RPF_MES_BANXICO = ?";
            values.add(this.getRpfMesBanxico());
        }

        if (this.getRpfDiaBanxico() != null && this.getRpfDiaBanxico().longValue() == -999) {
            conditions += " AND RPF_DIA_BANXICO IS NULL";
        } else if (this.getRpfDiaBanxico() != null) {
            conditions += " AND RPF_DIA_BANXICO = ?";
            values.add(this.getRpfDiaBanxico());
        }

        if (this.getRpfAnoInicio() != null && this.getRpfAnoInicio().longValue() == -999) {
            conditions += " AND RPF_ANO_INICIO IS NULL";
        } else if (this.getRpfAnoInicio() != null) {
            conditions += " AND RPF_ANO_INICIO = ?";
            values.add(this.getRpfAnoInicio());
        }

        if (this.getRpfMesInicio() != null && this.getRpfMesInicio().longValue() == -999) {
            conditions += " AND RPF_MES_INICIO IS NULL";
        } else if (this.getRpfMesInicio() != null) {
            conditions += " AND RPF_MES_INICIO = ?";
            values.add(this.getRpfMesInicio());
        }

        if (this.getRpfDiaInicio() != null && this.getRpfDiaInicio().longValue() == -999) {
            conditions += " AND RPF_DIA_INICIO IS NULL";
        } else if (this.getRpfDiaInicio() != null) {
            conditions += " AND RPF_DIA_INICIO = ?";
            values.add(this.getRpfDiaInicio());
        }

        if (this.getRpfAnoVencimiento() != null && this.getRpfAnoVencimiento().longValue() == -999) {
            conditions += " AND RPF_ANO_VENCIMIENTO IS NULL";
        } else if (this.getRpfAnoVencimiento() != null) {
            conditions += " AND RPF_ANO_VENCIMIENTO = ?";
            values.add(this.getRpfAnoVencimiento());
        }

        if (this.getRpfMesVencimiento() != null && this.getRpfMesVencimiento().longValue() == -999) {
            conditions += " AND RPF_MES_VENCIMIENTO IS NULL";
        } else if (this.getRpfMesVencimiento() != null) {
            conditions += " AND RPF_MES_VENCIMIENTO = ?";
            values.add(this.getRpfMesVencimiento());
        }

        if (this.getRpfDiaVencimiento() != null && this.getRpfDiaVencimiento().longValue() == -999) {
            conditions += " AND RPF_DIA_VENCIMIENTO IS NULL";
        } else if (this.getRpfDiaVencimiento() != null) {
            conditions += " AND RPF_DIA_VENCIMIENTO = ?";
            values.add(this.getRpfDiaVencimiento());
        }

        if (this.getRpfAnoAltaReg() != null && this.getRpfAnoAltaReg().longValue() == -999) {
            conditions += " AND RPF_ANO_ALTA_REG IS NULL";
        } else if (this.getRpfAnoAltaReg() != null) {
            conditions += " AND RPF_ANO_ALTA_REG = ?";
            values.add(this.getRpfAnoAltaReg());
        }

        if (this.getRpfMesAltaReg() != null && this.getRpfMesAltaReg().longValue() == -999) {
            conditions += " AND RPF_MES_ALTA_REG IS NULL";
        } else if (this.getRpfMesAltaReg() != null) {
            conditions += " AND RPF_MES_ALTA_REG = ?";
            values.add(this.getRpfMesAltaReg());
        }

        if (this.getRpfDiaAltaReg() != null && this.getRpfDiaAltaReg().longValue() == -999) {
            conditions += " AND RPF_DIA_ALTA_REG IS NULL";
        } else if (this.getRpfDiaAltaReg() != null) {
            conditions += " AND RPF_DIA_ALTA_REG = ?";
            values.add(this.getRpfDiaAltaReg());
        }

        if (this.getRpfAnoUltMod() != null && this.getRpfAnoUltMod().longValue() == -999) {
            conditions += " AND RPF_ANO_ULT_MOD IS NULL";
        } else if (this.getRpfAnoUltMod() != null) {
            conditions += " AND RPF_ANO_ULT_MOD = ?";
            values.add(this.getRpfAnoUltMod());
        }

        if (this.getRpfMesUltMod() != null && this.getRpfMesUltMod().longValue() == -999) {
            conditions += " AND RPF_MES_ULT_MOD IS NULL";
        } else if (this.getRpfMesUltMod() != null) {
            conditions += " AND RPF_MES_ULT_MOD = ?";
            values.add(this.getRpfMesUltMod());
        }

        if (this.getRpfDiaUltMod() != null && this.getRpfDiaUltMod().longValue() == -999) {
            conditions += " AND RPF_DIA_ULT_MOD IS NULL";
        } else if (this.getRpfDiaUltMod() != null) {
            conditions += " AND RPF_DIA_ULT_MOD = ?";
            values.add(this.getRpfDiaUltMod());
        }

        if (this.getRpfCveStRepcfide() != null && "null".equals(this.getRpfCveStRepcfide())) {
            conditions += " AND RPF_CVE_ST_REPCFIDE IS NULL";
        } else if (this.getRpfCveStRepcfide() != null) {
            conditions += " AND RPF_CVE_ST_REPCFIDE = ?";
            values.add(this.getRpfCveStRepcfide());
        }

        if (this.getRpfAutorizacionRegval() != null && "null".equals(this.getRpfAutorizacionRegval())) {
            conditions += " AND RPF_AUTORIZACION_REGVAL IS NULL";
        } else if (this.getRpfAutorizacionRegval() != null) {
            conditions += " AND RPF_AUTORIZACION_REGVAL = ?";
            values.add(this.getRpfAutorizacionRegval());
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
        String sql = "UPDATE REPCFIDE SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND RPF_NUM_PROGRAMA = ?";
        pkValues.add(this.getRpfNumPrograma());
        fields += " RPF_TIPO_NEGOCIO = ?, ";
        values.add(this.getRpfTipoNegocio());
        fields += " RPF_NOM_PROGRAMA = ?, ";
        values.add(this.getRpfNomPrograma());
        fields += " RPF_NUM_CONTRATO = ?, ";
        values.add(this.getRpfNumContrato());
        fields += " RPF_CVE_INSTRUMENTO = ?, ";
        values.add(this.getRpfCveInstrumento());
        fields += " RPF_MODALIDAD_EMISION = ?, ";
        values.add(this.getRpfModalidadEmision());
        fields += " RPF_IMP_PROGRAMA = ?, ";
        values.add(this.getRpfImpPrograma());
        fields += " RPF_NUM_MONEDA = ?, ";
        values.add(this.getRpfNumMoneda());
        fields += " RPF_ANO_PLAZO = ?, ";
        values.add(this.getRpfAnoPlazo());
        fields += " RPF_DIAS_PLAZO = ?, ";
        values.add(this.getRpfDiasPlazo());
        fields += " RPF_NUM_SERIE = ?, ";
        values.add(this.getRpfNumSerie());
        fields += " RPF_IMP_SERIE = ?, ";
        values.add(this.getRpfImpSerie());
        fields += " RPF_AUTORIZACION_CNBV = ?, ";
        values.add(this.getRpfAutorizacionCnbv());
        fields += " RPF_ANO_CNBV = ?, ";
        values.add(this.getRpfAnoCnbv());
        fields += " RPF_MES_CNBV = ?, ";
        values.add(this.getRpfMesCnbv());
        fields += " RPF_DIA_CNBV = ?, ";
        values.add(this.getRpfDiaCnbv());
        fields += " RPF_AUTORIZACION_BANXICO = ?, ";
        values.add(this.getRpfAutorizacionBanxico());
        fields += " RPF_ANO_BANXICO = ?, ";
        values.add(this.getRpfAnoBanxico());
        fields += " RPF_MES_BANXICO = ?, ";
        values.add(this.getRpfMesBanxico());
        fields += " RPF_DIA_BANXICO = ?, ";
        values.add(this.getRpfDiaBanxico());
        fields += " RPF_ANO_INICIO = ?, ";
        values.add(this.getRpfAnoInicio());
        fields += " RPF_MES_INICIO = ?, ";
        values.add(this.getRpfMesInicio());
        fields += " RPF_DIA_INICIO = ?, ";
        values.add(this.getRpfDiaInicio());
        fields += " RPF_ANO_VENCIMIENTO = ?, ";
        values.add(this.getRpfAnoVencimiento());
        fields += " RPF_MES_VENCIMIENTO = ?, ";
        values.add(this.getRpfMesVencimiento());
        fields += " RPF_DIA_VENCIMIENTO = ?, ";
        values.add(this.getRpfDiaVencimiento());
        fields += " RPF_ANO_ALTA_REG = ?, ";
        values.add(this.getRpfAnoAltaReg());
        fields += " RPF_MES_ALTA_REG = ?, ";
        values.add(this.getRpfMesAltaReg());
        fields += " RPF_DIA_ALTA_REG = ?, ";
        values.add(this.getRpfDiaAltaReg());
        fields += " RPF_ANO_ULT_MOD = ?, ";
        values.add(this.getRpfAnoUltMod());
        fields += " RPF_MES_ULT_MOD = ?, ";
        values.add(this.getRpfMesUltMod());
        fields += " RPF_DIA_ULT_MOD = ?, ";
        values.add(this.getRpfDiaUltMod());
        fields += " RPF_CVE_ST_REPCFIDE = ?, ";
        values.add(this.getRpfCveStRepcfide());
        fields += " RPF_AUTORIZACION_REGVAL = ?, ";
        values.add(this.getRpfAutorizacionRegval());
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
        String sql = "INSERT INTO REPCFIDE ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", RPF_NUM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getRpfNumPrograma());

        fields += ", RPF_TIPO_NEGOCIO";
        fieldValues += ", ?";
        values.add(this.getRpfTipoNegocio());

        fields += ", RPF_NOM_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getRpfNomPrograma());

        fields += ", RPF_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getRpfNumContrato());

        fields += ", RPF_CVE_INSTRUMENTO";
        fieldValues += ", ?";
        values.add(this.getRpfCveInstrumento());

        fields += ", RPF_MODALIDAD_EMISION";
        fieldValues += ", ?";
        values.add(this.getRpfModalidadEmision());

        fields += ", RPF_IMP_PROGRAMA";
        fieldValues += ", ?";
        values.add(this.getRpfImpPrograma());

        fields += ", RPF_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getRpfNumMoneda());

        fields += ", RPF_ANO_PLAZO";
        fieldValues += ", ?";
        values.add(this.getRpfAnoPlazo());

        fields += ", RPF_DIAS_PLAZO";
        fieldValues += ", ?";
        values.add(this.getRpfDiasPlazo());

        fields += ", RPF_NUM_SERIE";
        fieldValues += ", ?";
        values.add(this.getRpfNumSerie());

        fields += ", RPF_IMP_SERIE";
        fieldValues += ", ?";
        values.add(this.getRpfImpSerie());

        fields += ", RPF_AUTORIZACION_CNBV";
        fieldValues += ", ?";
        values.add(this.getRpfAutorizacionCnbv());

        fields += ", RPF_ANO_CNBV";
        fieldValues += ", ?";
        values.add(this.getRpfAnoCnbv());

        fields += ", RPF_MES_CNBV";
        fieldValues += ", ?";
        values.add(this.getRpfMesCnbv());

        fields += ", RPF_DIA_CNBV";
        fieldValues += ", ?";
        values.add(this.getRpfDiaCnbv());

        fields += ", RPF_AUTORIZACION_BANXICO";
        fieldValues += ", ?";
        values.add(this.getRpfAutorizacionBanxico());

        fields += ", RPF_ANO_BANXICO";
        fieldValues += ", ?";
        values.add(this.getRpfAnoBanxico());

        fields += ", RPF_MES_BANXICO";
        fieldValues += ", ?";
        values.add(this.getRpfMesBanxico());

        fields += ", RPF_DIA_BANXICO";
        fieldValues += ", ?";
        values.add(this.getRpfDiaBanxico());

        fields += ", RPF_ANO_INICIO";
        fieldValues += ", ?";
        values.add(this.getRpfAnoInicio());

        fields += ", RPF_MES_INICIO";
        fieldValues += ", ?";
        values.add(this.getRpfMesInicio());

        fields += ", RPF_DIA_INICIO";
        fieldValues += ", ?";
        values.add(this.getRpfDiaInicio());

        fields += ", RPF_ANO_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getRpfAnoVencimiento());

        fields += ", RPF_MES_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getRpfMesVencimiento());

        fields += ", RPF_DIA_VENCIMIENTO";
        fieldValues += ", ?";
        values.add(this.getRpfDiaVencimiento());

        fields += ", RPF_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRpfAnoAltaReg());

        fields += ", RPF_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRpfMesAltaReg());

        fields += ", RPF_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getRpfDiaAltaReg());

        fields += ", RPF_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRpfAnoUltMod());

        fields += ", RPF_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRpfMesUltMod());

        fields += ", RPF_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getRpfDiaUltMod());

        fields += ", RPF_CVE_ST_REPCFIDE";
        fieldValues += ", ?";
        values.add(this.getRpfCveStRepcfide());

        fields += ", RPF_AUTORIZACION_REGVAL";
        fieldValues += ", ?";
        values.add(this.getRpfAutorizacionRegval());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM REPCFIDE WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND RPF_NUM_PROGRAMA = ?";
        values.add(this.getRpfNumPrograma());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Repcfide instance = (Repcfide) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getRpfNumPrograma().equals(instance.getRpfNumPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getRpfTipoNegocio().equals(instance.getRpfTipoNegocio()))
            equalObjects = false;
        if (equalObjects && !this.getRpfNomPrograma().equals(instance.getRpfNomPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getRpfNumContrato().equals(instance.getRpfNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getRpfCveInstrumento().equals(instance.getRpfCveInstrumento()))
            equalObjects = false;
        if (equalObjects && !this.getRpfModalidadEmision().equals(instance.getRpfModalidadEmision()))
            equalObjects = false;
        if (equalObjects && !this.getRpfImpPrograma().equals(instance.getRpfImpPrograma()))
            equalObjects = false;
        if (equalObjects && !this.getRpfNumMoneda().equals(instance.getRpfNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getRpfAnoPlazo().equals(instance.getRpfAnoPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getRpfDiasPlazo().equals(instance.getRpfDiasPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getRpfNumSerie().equals(instance.getRpfNumSerie()))
            equalObjects = false;
        if (equalObjects && !this.getRpfImpSerie().equals(instance.getRpfImpSerie()))
            equalObjects = false;
        if (equalObjects && !this.getRpfAutorizacionCnbv().equals(instance.getRpfAutorizacionCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getRpfAnoCnbv().equals(instance.getRpfAnoCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getRpfMesCnbv().equals(instance.getRpfMesCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getRpfDiaCnbv().equals(instance.getRpfDiaCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getRpfAutorizacionBanxico().equals(instance.getRpfAutorizacionBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getRpfAnoBanxico().equals(instance.getRpfAnoBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getRpfMesBanxico().equals(instance.getRpfMesBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getRpfDiaBanxico().equals(instance.getRpfDiaBanxico()))
            equalObjects = false;
        if (equalObjects && !this.getRpfAnoInicio().equals(instance.getRpfAnoInicio()))
            equalObjects = false;
        if (equalObjects && !this.getRpfMesInicio().equals(instance.getRpfMesInicio()))
            equalObjects = false;
        if (equalObjects && !this.getRpfDiaInicio().equals(instance.getRpfDiaInicio()))
            equalObjects = false;
        if (equalObjects && !this.getRpfAnoVencimiento().equals(instance.getRpfAnoVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getRpfMesVencimiento().equals(instance.getRpfMesVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getRpfDiaVencimiento().equals(instance.getRpfDiaVencimiento()))
            equalObjects = false;
        if (equalObjects && !this.getRpfAnoAltaReg().equals(instance.getRpfAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRpfMesAltaReg().equals(instance.getRpfMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRpfDiaAltaReg().equals(instance.getRpfDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getRpfAnoUltMod().equals(instance.getRpfAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRpfMesUltMod().equals(instance.getRpfMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRpfDiaUltMod().equals(instance.getRpfDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getRpfCveStRepcfide().equals(instance.getRpfCveStRepcfide()))
            equalObjects = false;
        if (equalObjects && !this.getRpfAutorizacionRegval().equals(instance.getRpfAutorizacionRegval()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Repcfide result = new Repcfide();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setRpfNumPrograma((BigDecimal) objectData.getData("RPF_NUM_PROGRAMA"));
        result.setRpfTipoNegocio((BigDecimal) objectData.getData("RPF_TIPO_NEGOCIO"));
        result.setRpfNomPrograma((String) objectData.getData("RPF_NOM_PROGRAMA"));
        result.setRpfNumContrato((BigDecimal) objectData.getData("RPF_NUM_CONTRATO"));
        result.setRpfCveInstrumento((String) objectData.getData("RPF_CVE_INSTRUMENTO"));
        result.setRpfModalidadEmision((String) objectData.getData("RPF_MODALIDAD_EMISION"));
        result.setRpfImpPrograma((BigDecimal) objectData.getData("RPF_IMP_PROGRAMA"));
        result.setRpfNumMoneda((BigDecimal) objectData.getData("RPF_NUM_MONEDA"));
        result.setRpfAnoPlazo((BigDecimal) objectData.getData("RPF_ANO_PLAZO"));
        result.setRpfDiasPlazo((BigDecimal) objectData.getData("RPF_DIAS_PLAZO"));
        result.setRpfNumSerie((String) objectData.getData("RPF_NUM_SERIE"));
        result.setRpfImpSerie((BigDecimal) objectData.getData("RPF_IMP_SERIE"));
        result.setRpfAutorizacionCnbv((String) objectData.getData("RPF_AUTORIZACION_CNBV"));
        result.setRpfAnoCnbv((BigDecimal) objectData.getData("RPF_ANO_CNBV"));
        result.setRpfMesCnbv((BigDecimal) objectData.getData("RPF_MES_CNBV"));
        result.setRpfDiaCnbv((BigDecimal) objectData.getData("RPF_DIA_CNBV"));
        result.setRpfAutorizacionBanxico((String) objectData.getData("RPF_AUTORIZACION_BANXICO"));
        result.setRpfAnoBanxico((BigDecimal) objectData.getData("RPF_ANO_BANXICO"));
        result.setRpfMesBanxico((BigDecimal) objectData.getData("RPF_MES_BANXICO"));
        result.setRpfDiaBanxico((BigDecimal) objectData.getData("RPF_DIA_BANXICO"));
        result.setRpfAnoInicio((BigDecimal) objectData.getData("RPF_ANO_INICIO"));
        result.setRpfMesInicio((BigDecimal) objectData.getData("RPF_MES_INICIO"));
        result.setRpfDiaInicio((BigDecimal) objectData.getData("RPF_DIA_INICIO"));
        result.setRpfAnoVencimiento((BigDecimal) objectData.getData("RPF_ANO_VENCIMIENTO"));
        result.setRpfMesVencimiento((BigDecimal) objectData.getData("RPF_MES_VENCIMIENTO"));
        result.setRpfDiaVencimiento((BigDecimal) objectData.getData("RPF_DIA_VENCIMIENTO"));
        result.setRpfAnoAltaReg((BigDecimal) objectData.getData("RPF_ANO_ALTA_REG"));
        result.setRpfMesAltaReg((BigDecimal) objectData.getData("RPF_MES_ALTA_REG"));
        result.setRpfDiaAltaReg((BigDecimal) objectData.getData("RPF_DIA_ALTA_REG"));
        result.setRpfAnoUltMod((BigDecimal) objectData.getData("RPF_ANO_ULT_MOD"));
        result.setRpfMesUltMod((BigDecimal) objectData.getData("RPF_MES_ULT_MOD"));
        result.setRpfDiaUltMod((BigDecimal) objectData.getData("RPF_DIA_ULT_MOD"));
        result.setRpfCveStRepcfide((String) objectData.getData("RPF_CVE_ST_REPCFIDE"));
        result.setRpfAutorizacionRegval((String) objectData.getData("RPF_AUTORIZACION_REGVAL"));

        return result;

    }

}
