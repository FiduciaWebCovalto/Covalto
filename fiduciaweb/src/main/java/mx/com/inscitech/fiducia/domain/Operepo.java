package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "OPEREPO_PK", columns = { "ORE_FOLIO_REPORTO" }, sequences = { "MAX" })
public class Operepo extends DomainObject {

    BigDecimal oreFolioReporto = null;
    BigDecimal oreEntidadFin = null;
    BigDecimal oreContratoInter = null;
    BigDecimal oreCveTipoMerca = null;
    BigDecimal oreNumInstrume = null;
    BigDecimal oreNumPlazo = null;
    BigDecimal oreImpReporto = null;
    BigDecimal oreTasaPactada = null;
    BigDecimal orePremioReporto = null;
    BigDecimal oreNumContratos = null;
    BigDecimal oreAnoVencim = null;
    BigDecimal oreMesVencim = null;
    BigDecimal oreDiaVencim = null;
    BigDecimal oreTasaCastigo = null;
    BigDecimal oreAnoVencimAnt = null;
    BigDecimal oreMesVencimAnt = null;
    BigDecimal oreDiaVencimAnt = null;
    BigDecimal oreAnoAltaReg = null;
    BigDecimal oreMesAltaReg = null;
    BigDecimal oreDiaAltaReg = null;
    BigDecimal oreAnoUltMod = null;
    BigDecimal oreMesUltMod = null;
    BigDecimal oreDiaUltMod = null;
    String oreCveStOperepo = null;
    BigDecimal oreNumMoneda = null;
    BigDecimal oreTipoCambio = null;

    public Operepo() {
        super();
        this.pkColumns = 1;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOreFolioReporto(BigDecimal oreFolioReporto) {
        this.oreFolioReporto = oreFolioReporto;
    }

    public BigDecimal getOreFolioReporto() {
        return this.oreFolioReporto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOreEntidadFin(BigDecimal oreEntidadFin) {
        this.oreEntidadFin = oreEntidadFin;
    }

    public BigDecimal getOreEntidadFin() {
        return this.oreEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOreContratoInter(BigDecimal oreContratoInter) {
        this.oreContratoInter = oreContratoInter;
    }

    public BigDecimal getOreContratoInter() {
        return this.oreContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOreCveTipoMerca(BigDecimal oreCveTipoMerca) {
        this.oreCveTipoMerca = oreCveTipoMerca;
    }

    public BigDecimal getOreCveTipoMerca() {
        return this.oreCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOreNumInstrume(BigDecimal oreNumInstrume) {
        this.oreNumInstrume = oreNumInstrume;
    }

    public BigDecimal getOreNumInstrume() {
        return this.oreNumInstrume;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOreNumPlazo(BigDecimal oreNumPlazo) {
        this.oreNumPlazo = oreNumPlazo;
    }

    public BigDecimal getOreNumPlazo() {
        return this.oreNumPlazo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setOreImpReporto(BigDecimal oreImpReporto) {
        this.oreImpReporto = oreImpReporto;
    }

    public BigDecimal getOreImpReporto() {
        return this.oreImpReporto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setOreTasaPactada(BigDecimal oreTasaPactada) {
        this.oreTasaPactada = oreTasaPactada;
    }

    public BigDecimal getOreTasaPactada() {
        return this.oreTasaPactada;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 2, javaClass = BigDecimal.class)
    public void setOrePremioReporto(BigDecimal orePremioReporto) {
        this.orePremioReporto = orePremioReporto;
    }

    public BigDecimal getOrePremioReporto() {
        return this.orePremioReporto;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOreNumContratos(BigDecimal oreNumContratos) {
        this.oreNumContratos = oreNumContratos;
    }

    public BigDecimal getOreNumContratos() {
        return this.oreNumContratos;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOreAnoVencim(BigDecimal oreAnoVencim) {
        this.oreAnoVencim = oreAnoVencim;
    }

    public BigDecimal getOreAnoVencim() {
        return this.oreAnoVencim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOreMesVencim(BigDecimal oreMesVencim) {
        this.oreMesVencim = oreMesVencim;
    }

    public BigDecimal getOreMesVencim() {
        return this.oreMesVencim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOreDiaVencim(BigDecimal oreDiaVencim) {
        this.oreDiaVencim = oreDiaVencim;
    }

    public BigDecimal getOreDiaVencim() {
        return this.oreDiaVencim;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setOreTasaCastigo(BigDecimal oreTasaCastigo) {
        this.oreTasaCastigo = oreTasaCastigo;
    }

    public BigDecimal getOreTasaCastigo() {
        return this.oreTasaCastigo;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOreAnoVencimAnt(BigDecimal oreAnoVencimAnt) {
        this.oreAnoVencimAnt = oreAnoVencimAnt;
    }

    public BigDecimal getOreAnoVencimAnt() {
        return this.oreAnoVencimAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOreMesVencimAnt(BigDecimal oreMesVencimAnt) {
        this.oreMesVencimAnt = oreMesVencimAnt;
    }

    public BigDecimal getOreMesVencimAnt() {
        return this.oreMesVencimAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOreDiaVencimAnt(BigDecimal oreDiaVencimAnt) {
        this.oreDiaVencimAnt = oreDiaVencimAnt;
    }

    public BigDecimal getOreDiaVencimAnt() {
        return this.oreDiaVencimAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOreAnoAltaReg(BigDecimal oreAnoAltaReg) {
        this.oreAnoAltaReg = oreAnoAltaReg;
    }

    public BigDecimal getOreAnoAltaReg() {
        return this.oreAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOreMesAltaReg(BigDecimal oreMesAltaReg) {
        this.oreMesAltaReg = oreMesAltaReg;
    }

    public BigDecimal getOreMesAltaReg() {
        return this.oreMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOreDiaAltaReg(BigDecimal oreDiaAltaReg) {
        this.oreDiaAltaReg = oreDiaAltaReg;
    }

    public BigDecimal getOreDiaAltaReg() {
        return this.oreDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setOreAnoUltMod(BigDecimal oreAnoUltMod) {
        this.oreAnoUltMod = oreAnoUltMod;
    }

    public BigDecimal getOreAnoUltMod() {
        return this.oreAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOreMesUltMod(BigDecimal oreMesUltMod) {
        this.oreMesUltMod = oreMesUltMod;
    }

    public BigDecimal getOreMesUltMod() {
        return this.oreMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setOreDiaUltMod(BigDecimal oreDiaUltMod) {
        this.oreDiaUltMod = oreDiaUltMod;
    }

    public BigDecimal getOreDiaUltMod() {
        return this.oreDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setOreCveStOperepo(String oreCveStOperepo) {
        this.oreCveStOperepo = oreCveStOperepo;
    }

    public String getOreCveStOperepo() {
        return this.oreCveStOperepo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setOreNumMoneda(BigDecimal oreNumMoneda) {
        this.oreNumMoneda = oreNumMoneda;
    }

    public BigDecimal getOreNumMoneda() {
        return this.oreNumMoneda;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 4, javaClass = BigDecimal.class)
    public void setOreTipoCambio(BigDecimal oreTipoCambio) {
        this.oreTipoCambio = oreTipoCambio;
    }

    public BigDecimal getOreTipoCambio() {
        return this.oreTipoCambio;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM OPEREPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOreFolioReporto() != null && this.getOreFolioReporto().longValue() == -999) {
            conditions += " AND ORE_FOLIO_REPORTO IS NULL";
        } else if (this.getOreFolioReporto() != null) {
            conditions += " AND ORE_FOLIO_REPORTO = ?";
            values.add(this.getOreFolioReporto());
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
        String sql = "SELECT * FROM OPEREPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getOreFolioReporto() != null && this.getOreFolioReporto().longValue() == -999) {
            conditions += " AND ORE_FOLIO_REPORTO IS NULL";
        } else if (this.getOreFolioReporto() != null) {
            conditions += " AND ORE_FOLIO_REPORTO = ?";
            values.add(this.getOreFolioReporto());
        }

        if (this.getOreEntidadFin() != null && this.getOreEntidadFin().longValue() == -999) {
            conditions += " AND ORE_ENTIDAD_FIN IS NULL";
        } else if (this.getOreEntidadFin() != null) {
            conditions += " AND ORE_ENTIDAD_FIN = ?";
            values.add(this.getOreEntidadFin());
        }

        if (this.getOreContratoInter() != null && this.getOreContratoInter().longValue() == -999) {
            conditions += " AND ORE_CONTRATO_INTER IS NULL";
        } else if (this.getOreContratoInter() != null) {
            conditions += " AND ORE_CONTRATO_INTER = ?";
            values.add(this.getOreContratoInter());
        }

        if (this.getOreCveTipoMerca() != null && this.getOreCveTipoMerca().longValue() == -999) {
            conditions += " AND ORE_CVE_TIPO_MERCA IS NULL";
        } else if (this.getOreCveTipoMerca() != null) {
            conditions += " AND ORE_CVE_TIPO_MERCA = ?";
            values.add(this.getOreCveTipoMerca());
        }

        if (this.getOreNumInstrume() != null && this.getOreNumInstrume().longValue() == -999) {
            conditions += " AND ORE_NUM_INSTRUME IS NULL";
        } else if (this.getOreNumInstrume() != null) {
            conditions += " AND ORE_NUM_INSTRUME = ?";
            values.add(this.getOreNumInstrume());
        }

        if (this.getOreNumPlazo() != null && this.getOreNumPlazo().longValue() == -999) {
            conditions += " AND ORE_NUM_PLAZO IS NULL";
        } else if (this.getOreNumPlazo() != null) {
            conditions += " AND ORE_NUM_PLAZO = ?";
            values.add(this.getOreNumPlazo());
        }

        if (this.getOreImpReporto() != null && this.getOreImpReporto().longValue() == -999) {
            conditions += " AND ORE_IMP_REPORTO IS NULL";
        } else if (this.getOreImpReporto() != null) {
            conditions += " AND ORE_IMP_REPORTO = ?";
            values.add(this.getOreImpReporto());
        }

        if (this.getOreTasaPactada() != null && this.getOreTasaPactada().longValue() == -999) {
            conditions += " AND ORE_TASA_PACTADA IS NULL";
        } else if (this.getOreTasaPactada() != null) {
            conditions += " AND ORE_TASA_PACTADA = ?";
            values.add(this.getOreTasaPactada());
        }

        if (this.getOrePremioReporto() != null && this.getOrePremioReporto().longValue() == -999) {
            conditions += " AND ORE_PREMIO_REPORTO IS NULL";
        } else if (this.getOrePremioReporto() != null) {
            conditions += " AND ORE_PREMIO_REPORTO = ?";
            values.add(this.getOrePremioReporto());
        }

        if (this.getOreNumContratos() != null && this.getOreNumContratos().longValue() == -999) {
            conditions += " AND ORE_NUM_CONTRATOS IS NULL";
        } else if (this.getOreNumContratos() != null) {
            conditions += " AND ORE_NUM_CONTRATOS = ?";
            values.add(this.getOreNumContratos());
        }

        if (this.getOreAnoVencim() != null && this.getOreAnoVencim().longValue() == -999) {
            conditions += " AND ORE_ANO_VENCIM IS NULL";
        } else if (this.getOreAnoVencim() != null) {
            conditions += " AND ORE_ANO_VENCIM = ?";
            values.add(this.getOreAnoVencim());
        }

        if (this.getOreMesVencim() != null && this.getOreMesVencim().longValue() == -999) {
            conditions += " AND ORE_MES_VENCIM IS NULL";
        } else if (this.getOreMesVencim() != null) {
            conditions += " AND ORE_MES_VENCIM = ?";
            values.add(this.getOreMesVencim());
        }

        if (this.getOreDiaVencim() != null && this.getOreDiaVencim().longValue() == -999) {
            conditions += " AND ORE_DIA_VENCIM IS NULL";
        } else if (this.getOreDiaVencim() != null) {
            conditions += " AND ORE_DIA_VENCIM = ?";
            values.add(this.getOreDiaVencim());
        }

        if (this.getOreTasaCastigo() != null && this.getOreTasaCastigo().longValue() == -999) {
            conditions += " AND ORE_TASA_CASTIGO IS NULL";
        } else if (this.getOreTasaCastigo() != null) {
            conditions += " AND ORE_TASA_CASTIGO = ?";
            values.add(this.getOreTasaCastigo());
        }

        if (this.getOreAnoVencimAnt() != null && this.getOreAnoVencimAnt().longValue() == -999) {
            conditions += " AND ORE_ANO_VENCIM_ANT IS NULL";
        } else if (this.getOreAnoVencimAnt() != null) {
            conditions += " AND ORE_ANO_VENCIM_ANT = ?";
            values.add(this.getOreAnoVencimAnt());
        }

        if (this.getOreMesVencimAnt() != null && this.getOreMesVencimAnt().longValue() == -999) {
            conditions += " AND ORE_MES_VENCIM_ANT IS NULL";
        } else if (this.getOreMesVencimAnt() != null) {
            conditions += " AND ORE_MES_VENCIM_ANT = ?";
            values.add(this.getOreMesVencimAnt());
        }

        if (this.getOreDiaVencimAnt() != null && this.getOreDiaVencimAnt().longValue() == -999) {
            conditions += " AND ORE_DIA_VENCIM_ANT IS NULL";
        } else if (this.getOreDiaVencimAnt() != null) {
            conditions += " AND ORE_DIA_VENCIM_ANT = ?";
            values.add(this.getOreDiaVencimAnt());
        }

        if (this.getOreAnoAltaReg() != null && this.getOreAnoAltaReg().longValue() == -999) {
            conditions += " AND ORE_ANO_ALTA_REG IS NULL";
        } else if (this.getOreAnoAltaReg() != null) {
            conditions += " AND ORE_ANO_ALTA_REG = ?";
            values.add(this.getOreAnoAltaReg());
        }

        if (this.getOreMesAltaReg() != null && this.getOreMesAltaReg().longValue() == -999) {
            conditions += " AND ORE_MES_ALTA_REG IS NULL";
        } else if (this.getOreMesAltaReg() != null) {
            conditions += " AND ORE_MES_ALTA_REG = ?";
            values.add(this.getOreMesAltaReg());
        }

        if (this.getOreDiaAltaReg() != null && this.getOreDiaAltaReg().longValue() == -999) {
            conditions += " AND ORE_DIA_ALTA_REG IS NULL";
        } else if (this.getOreDiaAltaReg() != null) {
            conditions += " AND ORE_DIA_ALTA_REG = ?";
            values.add(this.getOreDiaAltaReg());
        }

        if (this.getOreAnoUltMod() != null && this.getOreAnoUltMod().longValue() == -999) {
            conditions += " AND ORE_ANO_ULT_MOD IS NULL";
        } else if (this.getOreAnoUltMod() != null) {
            conditions += " AND ORE_ANO_ULT_MOD = ?";
            values.add(this.getOreAnoUltMod());
        }

        if (this.getOreMesUltMod() != null && this.getOreMesUltMod().longValue() == -999) {
            conditions += " AND ORE_MES_ULT_MOD IS NULL";
        } else if (this.getOreMesUltMod() != null) {
            conditions += " AND ORE_MES_ULT_MOD = ?";
            values.add(this.getOreMesUltMod());
        }

        if (this.getOreDiaUltMod() != null && this.getOreDiaUltMod().longValue() == -999) {
            conditions += " AND ORE_DIA_ULT_MOD IS NULL";
        } else if (this.getOreDiaUltMod() != null) {
            conditions += " AND ORE_DIA_ULT_MOD = ?";
            values.add(this.getOreDiaUltMod());
        }

        if (this.getOreCveStOperepo() != null && "null".equals(this.getOreCveStOperepo())) {
            conditions += " AND ORE_CVE_ST_OPEREPO IS NULL";
        } else if (this.getOreCveStOperepo() != null) {
            conditions += " AND ORE_CVE_ST_OPEREPO = ?";
            values.add(this.getOreCveStOperepo());
        }

        if (this.getOreNumMoneda() != null && this.getOreNumMoneda().longValue() == -999) {
            conditions += " AND ORE_NUM_MONEDA IS NULL";
        } else if (this.getOreNumMoneda() != null) {
            conditions += " AND ORE_NUM_MONEDA = ?";
            values.add(this.getOreNumMoneda());
        }

        if (this.getOreTipoCambio() != null && this.getOreTipoCambio().longValue() == -999) {
            conditions += " AND ORE_TIPO_CAMBIO IS NULL";
        } else if (this.getOreTipoCambio() != null) {
            conditions += " AND ORE_TIPO_CAMBIO = ?";
            values.add(this.getOreTipoCambio());
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
        String sql = "UPDATE OPEREPO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND ORE_FOLIO_REPORTO = ?";
        pkValues.add(this.getOreFolioReporto());
        fields += " ORE_ENTIDAD_FIN = ?, ";
        values.add(this.getOreEntidadFin());
        fields += " ORE_CONTRATO_INTER = ?, ";
        values.add(this.getOreContratoInter());
        fields += " ORE_CVE_TIPO_MERCA = ?, ";
        values.add(this.getOreCveTipoMerca());
        fields += " ORE_NUM_INSTRUME = ?, ";
        values.add(this.getOreNumInstrume());
        fields += " ORE_NUM_PLAZO = ?, ";
        values.add(this.getOreNumPlazo());
        fields += " ORE_IMP_REPORTO = ?, ";
        values.add(this.getOreImpReporto());
        fields += " ORE_TASA_PACTADA = ?, ";
        values.add(this.getOreTasaPactada());
        fields += " ORE_PREMIO_REPORTO = ?, ";
        values.add(this.getOrePremioReporto());
        fields += " ORE_NUM_CONTRATOS = ?, ";
        values.add(this.getOreNumContratos());
        fields += " ORE_ANO_VENCIM = ?, ";
        values.add(this.getOreAnoVencim());
        fields += " ORE_MES_VENCIM = ?, ";
        values.add(this.getOreMesVencim());
        fields += " ORE_DIA_VENCIM = ?, ";
        values.add(this.getOreDiaVencim());
        fields += " ORE_TASA_CASTIGO = ?, ";
        values.add(this.getOreTasaCastigo());
        fields += " ORE_ANO_VENCIM_ANT = ?, ";
        values.add(this.getOreAnoVencimAnt());
        fields += " ORE_MES_VENCIM_ANT = ?, ";
        values.add(this.getOreMesVencimAnt());
        fields += " ORE_DIA_VENCIM_ANT = ?, ";
        values.add(this.getOreDiaVencimAnt());
        fields += " ORE_ANO_ALTA_REG = ?, ";
        values.add(this.getOreAnoAltaReg());
        fields += " ORE_MES_ALTA_REG = ?, ";
        values.add(this.getOreMesAltaReg());
        fields += " ORE_DIA_ALTA_REG = ?, ";
        values.add(this.getOreDiaAltaReg());
        fields += " ORE_ANO_ULT_MOD = ?, ";
        values.add(this.getOreAnoUltMod());
        fields += " ORE_MES_ULT_MOD = ?, ";
        values.add(this.getOreMesUltMod());
        fields += " ORE_DIA_ULT_MOD = ?, ";
        values.add(this.getOreDiaUltMod());
        fields += " ORE_CVE_ST_OPEREPO = ?, ";
        values.add(this.getOreCveStOperepo());
        fields += " ORE_NUM_MONEDA = ?, ";
        values.add(this.getOreNumMoneda());
        fields += " ORE_TIPO_CAMBIO = ?, ";
        values.add(this.getOreTipoCambio());
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
        String sql = "INSERT INTO OPEREPO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", ORE_FOLIO_REPORTO";
        fieldValues += ", ?";
        values.add(this.getOreFolioReporto());

        fields += ", ORE_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getOreEntidadFin());

        fields += ", ORE_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getOreContratoInter());

        fields += ", ORE_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getOreCveTipoMerca());

        fields += ", ORE_NUM_INSTRUME";
        fieldValues += ", ?";
        values.add(this.getOreNumInstrume());

        fields += ", ORE_NUM_PLAZO";
        fieldValues += ", ?";
        values.add(this.getOreNumPlazo());

        fields += ", ORE_IMP_REPORTO";
        fieldValues += ", ?";
        values.add(this.getOreImpReporto());

        fields += ", ORE_TASA_PACTADA";
        fieldValues += ", ?";
        values.add(this.getOreTasaPactada());

        fields += ", ORE_PREMIO_REPORTO";
        fieldValues += ", ?";
        values.add(this.getOrePremioReporto());

        fields += ", ORE_NUM_CONTRATOS";
        fieldValues += ", ?";
        values.add(this.getOreNumContratos());

        fields += ", ORE_ANO_VENCIM";
        fieldValues += ", ?";
        values.add(this.getOreAnoVencim());

        fields += ", ORE_MES_VENCIM";
        fieldValues += ", ?";
        values.add(this.getOreMesVencim());

        fields += ", ORE_DIA_VENCIM";
        fieldValues += ", ?";
        values.add(this.getOreDiaVencim());

        fields += ", ORE_TASA_CASTIGO";
        fieldValues += ", ?";
        values.add(this.getOreTasaCastigo());

        fields += ", ORE_ANO_VENCIM_ANT";
        fieldValues += ", ?";
        values.add(this.getOreAnoVencimAnt());

        fields += ", ORE_MES_VENCIM_ANT";
        fieldValues += ", ?";
        values.add(this.getOreMesVencimAnt());

        fields += ", ORE_DIA_VENCIM_ANT";
        fieldValues += ", ?";
        values.add(this.getOreDiaVencimAnt());

        fields += ", ORE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOreAnoAltaReg());

        fields += ", ORE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOreMesAltaReg());

        fields += ", ORE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getOreDiaAltaReg());

        fields += ", ORE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOreAnoUltMod());

        fields += ", ORE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOreMesUltMod());

        fields += ", ORE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getOreDiaUltMod());

        fields += ", ORE_CVE_ST_OPEREPO";
        fieldValues += ", ?";
        values.add(this.getOreCveStOperepo());

        fields += ", ORE_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getOreNumMoneda());

        fields += ", ORE_TIPO_CAMBIO";
        fieldValues += ", ?";
        values.add(this.getOreTipoCambio());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM OPEREPO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND ORE_FOLIO_REPORTO = ?";
        values.add(this.getOreFolioReporto());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Operepo instance = (Operepo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getOreFolioReporto().equals(instance.getOreFolioReporto()))
            equalObjects = false;
        if (equalObjects && !this.getOreEntidadFin().equals(instance.getOreEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getOreContratoInter().equals(instance.getOreContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getOreCveTipoMerca().equals(instance.getOreCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getOreNumInstrume().equals(instance.getOreNumInstrume()))
            equalObjects = false;
        if (equalObjects && !this.getOreNumPlazo().equals(instance.getOreNumPlazo()))
            equalObjects = false;
        if (equalObjects && !this.getOreImpReporto().equals(instance.getOreImpReporto()))
            equalObjects = false;
        if (equalObjects && !this.getOreTasaPactada().equals(instance.getOreTasaPactada()))
            equalObjects = false;
        if (equalObjects && !this.getOrePremioReporto().equals(instance.getOrePremioReporto()))
            equalObjects = false;
        if (equalObjects && !this.getOreNumContratos().equals(instance.getOreNumContratos()))
            equalObjects = false;
        if (equalObjects && !this.getOreAnoVencim().equals(instance.getOreAnoVencim()))
            equalObjects = false;
        if (equalObjects && !this.getOreMesVencim().equals(instance.getOreMesVencim()))
            equalObjects = false;
        if (equalObjects && !this.getOreDiaVencim().equals(instance.getOreDiaVencim()))
            equalObjects = false;
        if (equalObjects && !this.getOreTasaCastigo().equals(instance.getOreTasaCastigo()))
            equalObjects = false;
        if (equalObjects && !this.getOreAnoVencimAnt().equals(instance.getOreAnoVencimAnt()))
            equalObjects = false;
        if (equalObjects && !this.getOreMesVencimAnt().equals(instance.getOreMesVencimAnt()))
            equalObjects = false;
        if (equalObjects && !this.getOreDiaVencimAnt().equals(instance.getOreDiaVencimAnt()))
            equalObjects = false;
        if (equalObjects && !this.getOreAnoAltaReg().equals(instance.getOreAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOreMesAltaReg().equals(instance.getOreMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOreDiaAltaReg().equals(instance.getOreDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getOreAnoUltMod().equals(instance.getOreAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOreMesUltMod().equals(instance.getOreMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOreDiaUltMod().equals(instance.getOreDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getOreCveStOperepo().equals(instance.getOreCveStOperepo()))
            equalObjects = false;
        if (equalObjects && !this.getOreNumMoneda().equals(instance.getOreNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getOreTipoCambio().equals(instance.getOreTipoCambio()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Operepo result = new Operepo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setOreFolioReporto((BigDecimal) objectData.getData("ORE_FOLIO_REPORTO"));
        result.setOreEntidadFin((BigDecimal) objectData.getData("ORE_ENTIDAD_FIN"));
        result.setOreContratoInter((BigDecimal) objectData.getData("ORE_CONTRATO_INTER"));
        result.setOreCveTipoMerca((BigDecimal) objectData.getData("ORE_CVE_TIPO_MERCA"));
        result.setOreNumInstrume((BigDecimal) objectData.getData("ORE_NUM_INSTRUME"));
        result.setOreNumPlazo((BigDecimal) objectData.getData("ORE_NUM_PLAZO"));
        result.setOreImpReporto((BigDecimal) objectData.getData("ORE_IMP_REPORTO"));
        result.setOreTasaPactada((BigDecimal) objectData.getData("ORE_TASA_PACTADA"));
        result.setOrePremioReporto((BigDecimal) objectData.getData("ORE_PREMIO_REPORTO"));
        result.setOreNumContratos((BigDecimal) objectData.getData("ORE_NUM_CONTRATOS"));
        result.setOreAnoVencim((BigDecimal) objectData.getData("ORE_ANO_VENCIM"));
        result.setOreMesVencim((BigDecimal) objectData.getData("ORE_MES_VENCIM"));
        result.setOreDiaVencim((BigDecimal) objectData.getData("ORE_DIA_VENCIM"));
        result.setOreTasaCastigo((BigDecimal) objectData.getData("ORE_TASA_CASTIGO"));
        result.setOreAnoVencimAnt((BigDecimal) objectData.getData("ORE_ANO_VENCIM_ANT"));
        result.setOreMesVencimAnt((BigDecimal) objectData.getData("ORE_MES_VENCIM_ANT"));
        result.setOreDiaVencimAnt((BigDecimal) objectData.getData("ORE_DIA_VENCIM_ANT"));
        result.setOreAnoAltaReg((BigDecimal) objectData.getData("ORE_ANO_ALTA_REG"));
        result.setOreMesAltaReg((BigDecimal) objectData.getData("ORE_MES_ALTA_REG"));
        result.setOreDiaAltaReg((BigDecimal) objectData.getData("ORE_DIA_ALTA_REG"));
        result.setOreAnoUltMod((BigDecimal) objectData.getData("ORE_ANO_ULT_MOD"));
        result.setOreMesUltMod((BigDecimal) objectData.getData("ORE_MES_ULT_MOD"));
        result.setOreDiaUltMod((BigDecimal) objectData.getData("ORE_DIA_ULT_MOD"));
        result.setOreCveStOperepo((String) objectData.getData("ORE_CVE_ST_OPEREPO"));
        result.setOreNumMoneda((BigDecimal) objectData.getData("ORE_NUM_MONEDA"));
        result.setOreTipoCambio((BigDecimal) objectData.getData("ORE_TIPO_CAMBIO"));

        return result;

    }

}
