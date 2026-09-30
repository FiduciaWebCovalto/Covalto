package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EMIS_CPO_PK", columns = { "CPO_SERIE", "CPO_ACTA_EMIS" }, sequences = { "MANUAL" })
public class EmisCpo extends DomainObject {

    String cpoSerie = null;
    BigDecimal cpoActaEmis = null;
    String cpoCaracEmision = null;
    String cpoNoRppc = null;
    String cpoCvePizarra = null;
    String cpoFechaCnbv = null;
    String cpoReferCnbv = null;
    String cpoFechaDgie = null;
    String cpoReferDgie = null;
    String cpoFechaBmv = null;
    String cpoReferBmv = null;
    String cpoFechaRnvi = null;
    String cpoReferRnvi = null;
    BigDecimal cpoImpIniEmis = null;
    String cpoFechaEmision = null;
    String cpoFechaColoc = null;
    String cpoFechaLiquid = null;
    BigDecimal cpoValorNomin = null;
    BigDecimal cpoCposEmit = null;
    String cpoDictTecnico = null;
    BigDecimal cpoClasAmort = null;
    BigDecimal cpoClasNoAmor = null;
    BigDecimal cpoClasVna = null;
    BigDecimal cpoClasVn = null;
    BigDecimal cpoClasPagoInt = null;
    BigDecimal cpoClasReval = null;
    BigDecimal cpoTasaInteres = null;
    BigDecimal cpoPlazoAmort = null;
    BigDecimal cpoAnoAltReg = null;
    BigDecimal cpoMesAltReg = null;
    BigDecimal cpoDiaAltReg = null;
    BigDecimal cpoAnoUltMod = null;
    BigDecimal cpoMesUltMod = null;
    BigDecimal cpoDiaUltMod = null;
    String cpoCveStCpo = null;
    BigDecimal cpoCuponCero = null;
    String cpoFechaEmis = null;
    BigDecimal cpoTitColoca = null;
    BigDecimal cpoTitTesor = null;

    public EmisCpo() {
        super();
        this.pkColumns = 2;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoSerie(String cpoSerie) {
        this.cpoSerie = cpoSerie;
    }

    public String getCpoSerie() {
        return this.cpoSerie;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpoActaEmis(BigDecimal cpoActaEmis) {
        this.cpoActaEmis = cpoActaEmis;
    }

    public BigDecimal getCpoActaEmis() {
        return this.cpoActaEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoCaracEmision(String cpoCaracEmision) {
        this.cpoCaracEmision = cpoCaracEmision;
    }

    public String getCpoCaracEmision() {
        return this.cpoCaracEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoNoRppc(String cpoNoRppc) {
        this.cpoNoRppc = cpoNoRppc;
    }

    public String getCpoNoRppc() {
        return this.cpoNoRppc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoCvePizarra(String cpoCvePizarra) {
        this.cpoCvePizarra = cpoCvePizarra;
    }

    public String getCpoCvePizarra() {
        return this.cpoCvePizarra;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoFechaCnbv(String cpoFechaCnbv) {
        this.cpoFechaCnbv = cpoFechaCnbv;
    }

    public String getCpoFechaCnbv() {
        return this.cpoFechaCnbv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoReferCnbv(String cpoReferCnbv) {
        this.cpoReferCnbv = cpoReferCnbv;
    }

    public String getCpoReferCnbv() {
        return this.cpoReferCnbv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoFechaDgie(String cpoFechaDgie) {
        this.cpoFechaDgie = cpoFechaDgie;
    }

    public String getCpoFechaDgie() {
        return this.cpoFechaDgie;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoReferDgie(String cpoReferDgie) {
        this.cpoReferDgie = cpoReferDgie;
    }

    public String getCpoReferDgie() {
        return this.cpoReferDgie;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoFechaBmv(String cpoFechaBmv) {
        this.cpoFechaBmv = cpoFechaBmv;
    }

    public String getCpoFechaBmv() {
        return this.cpoFechaBmv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoReferBmv(String cpoReferBmv) {
        this.cpoReferBmv = cpoReferBmv;
    }

    public String getCpoReferBmv() {
        return this.cpoReferBmv;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoFechaRnvi(String cpoFechaRnvi) {
        this.cpoFechaRnvi = cpoFechaRnvi;
    }

    public String getCpoFechaRnvi() {
        return this.cpoFechaRnvi;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoReferRnvi(String cpoReferRnvi) {
        this.cpoReferRnvi = cpoReferRnvi;
    }

    public String getCpoReferRnvi() {
        return this.cpoReferRnvi;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 6, javaClass = BigDecimal.class)
    public void setCpoImpIniEmis(BigDecimal cpoImpIniEmis) {
        this.cpoImpIniEmis = cpoImpIniEmis;
    }

    public BigDecimal getCpoImpIniEmis() {
        return this.cpoImpIniEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoFechaEmision(String cpoFechaEmision) {
        this.cpoFechaEmision = cpoFechaEmision;
    }

    public String getCpoFechaEmision() {
        return this.cpoFechaEmision;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoFechaColoc(String cpoFechaColoc) {
        this.cpoFechaColoc = cpoFechaColoc;
    }

    public String getCpoFechaColoc() {
        return this.cpoFechaColoc;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoFechaLiquid(String cpoFechaLiquid) {
        this.cpoFechaLiquid = cpoFechaLiquid;
    }

    public String getCpoFechaLiquid() {
        return this.cpoFechaLiquid;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 6, javaClass = BigDecimal.class)
    public void setCpoValorNomin(BigDecimal cpoValorNomin) {
        this.cpoValorNomin = cpoValorNomin;
    }

    public BigDecimal getCpoValorNomin() {
        return this.cpoValorNomin;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setCpoCposEmit(BigDecimal cpoCposEmit) {
        this.cpoCposEmit = cpoCposEmit;
    }

    public BigDecimal getCpoCposEmit() {
        return this.cpoCposEmit;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoDictTecnico(String cpoDictTecnico) {
        this.cpoDictTecnico = cpoDictTecnico;
    }

    public String getCpoDictTecnico() {
        return this.cpoDictTecnico;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCpoClasAmort(BigDecimal cpoClasAmort) {
        this.cpoClasAmort = cpoClasAmort;
    }

    public BigDecimal getCpoClasAmort() {
        return this.cpoClasAmort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCpoClasNoAmor(BigDecimal cpoClasNoAmor) {
        this.cpoClasNoAmor = cpoClasNoAmor;
    }

    public BigDecimal getCpoClasNoAmor() {
        return this.cpoClasNoAmor;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCpoClasVna(BigDecimal cpoClasVna) {
        this.cpoClasVna = cpoClasVna;
    }

    public BigDecimal getCpoClasVna() {
        return this.cpoClasVna;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCpoClasVn(BigDecimal cpoClasVn) {
        this.cpoClasVn = cpoClasVn;
    }

    public BigDecimal getCpoClasVn() {
        return this.cpoClasVn;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCpoClasPagoInt(BigDecimal cpoClasPagoInt) {
        this.cpoClasPagoInt = cpoClasPagoInt;
    }

    public BigDecimal getCpoClasPagoInt() {
        return this.cpoClasPagoInt;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCpoClasReval(BigDecimal cpoClasReval) {
        this.cpoClasReval = cpoClasReval;
    }

    public BigDecimal getCpoClasReval() {
        return this.cpoClasReval;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 22, scale = 6, javaClass = BigDecimal.class)
    public void setCpoTasaInteres(BigDecimal cpoTasaInteres) {
        this.cpoTasaInteres = cpoTasaInteres;
    }

    public BigDecimal getCpoTasaInteres() {
        return this.cpoTasaInteres;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpoPlazoAmort(BigDecimal cpoPlazoAmort) {
        this.cpoPlazoAmort = cpoPlazoAmort;
    }

    public BigDecimal getCpoPlazoAmort() {
        return this.cpoPlazoAmort;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCpoAnoAltReg(BigDecimal cpoAnoAltReg) {
        this.cpoAnoAltReg = cpoAnoAltReg;
    }

    public BigDecimal getCpoAnoAltReg() {
        return this.cpoAnoAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpoMesAltReg(BigDecimal cpoMesAltReg) {
        this.cpoMesAltReg = cpoMesAltReg;
    }

    public BigDecimal getCpoMesAltReg() {
        return this.cpoMesAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpoDiaAltReg(BigDecimal cpoDiaAltReg) {
        this.cpoDiaAltReg = cpoDiaAltReg;
    }

    public BigDecimal getCpoDiaAltReg() {
        return this.cpoDiaAltReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCpoAnoUltMod(BigDecimal cpoAnoUltMod) {
        this.cpoAnoUltMod = cpoAnoUltMod;
    }

    public BigDecimal getCpoAnoUltMod() {
        return this.cpoAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpoMesUltMod(BigDecimal cpoMesUltMod) {
        this.cpoMesUltMod = cpoMesUltMod;
    }

    public BigDecimal getCpoMesUltMod() {
        return this.cpoMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpoDiaUltMod(BigDecimal cpoDiaUltMod) {
        this.cpoDiaUltMod = cpoDiaUltMod;
    }

    public BigDecimal getCpoDiaUltMod() {
        return this.cpoDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoCveStCpo(String cpoCveStCpo) {
        this.cpoCveStCpo = cpoCveStCpo;
    }

    public String getCpoCveStCpo() {
        return this.cpoCveStCpo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 1, scale = 0, javaClass = BigDecimal.class)
    public void setCpoCuponCero(BigDecimal cpoCuponCero) {
        this.cpoCuponCero = cpoCuponCero;
    }

    public BigDecimal getCpoCuponCero() {
        return this.cpoCuponCero;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpoFechaEmis(String cpoFechaEmis) {
        this.cpoFechaEmis = cpoFechaEmis;
    }

    public String getCpoFechaEmis() {
        return this.cpoFechaEmis;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setCpoTitColoca(BigDecimal cpoTitColoca) {
        this.cpoTitColoca = cpoTitColoca;
    }

    public BigDecimal getCpoTitColoca() {
        return this.cpoTitColoca;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setCpoTitTesor(BigDecimal cpoTitTesor) {
        this.cpoTitTesor = cpoTitTesor;
    }

    public BigDecimal getCpoTitTesor() {
        return this.cpoTitTesor;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EMIS_CPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
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
        String sql = "SELECT * FROM EMIS_CPO ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpoSerie() != null && "null".equals(this.getCpoSerie())) {
            conditions += " AND CPO_SERIE IS NULL";
        } else if (this.getCpoSerie() != null) {
            conditions += " AND CPO_SERIE = ?";
            values.add(this.getCpoSerie());
        }

        if (this.getCpoActaEmis() != null && this.getCpoActaEmis().longValue() == -999) {
            conditions += " AND CPO_ACTA_EMIS IS NULL";
        } else if (this.getCpoActaEmis() != null) {
            conditions += " AND CPO_ACTA_EMIS = ?";
            values.add(this.getCpoActaEmis());
        }

        if (this.getCpoCaracEmision() != null && "null".equals(this.getCpoCaracEmision())) {
            conditions += " AND CPO_CARAC_EMISION IS NULL";
        } else if (this.getCpoCaracEmision() != null) {
            conditions += " AND CPO_CARAC_EMISION = ?";
            values.add(this.getCpoCaracEmision());
        }

        if (this.getCpoNoRppc() != null && "null".equals(this.getCpoNoRppc())) {
            conditions += " AND CPO_NO_RPPC IS NULL";
        } else if (this.getCpoNoRppc() != null) {
            conditions += " AND CPO_NO_RPPC = ?";
            values.add(this.getCpoNoRppc());
        }

        if (this.getCpoCvePizarra() != null && "null".equals(this.getCpoCvePizarra())) {
            conditions += " AND CPO_CVE_PIZARRA IS NULL";
        } else if (this.getCpoCvePizarra() != null) {
            conditions += " AND CPO_CVE_PIZARRA = ?";
            values.add(this.getCpoCvePizarra());
        }

        if (this.getCpoFechaCnbv() != null && "null".equals(this.getCpoFechaCnbv())) {
            conditions += " AND CPO_FECHA_CNBV IS NULL";
        } else if (this.getCpoFechaCnbv() != null) {
            conditions += " AND CPO_FECHA_CNBV = ?";
            values.add(this.getCpoFechaCnbv());
        }

        if (this.getCpoReferCnbv() != null && "null".equals(this.getCpoReferCnbv())) {
            conditions += " AND CPO_REFER_CNBV IS NULL";
        } else if (this.getCpoReferCnbv() != null) {
            conditions += " AND CPO_REFER_CNBV = ?";
            values.add(this.getCpoReferCnbv());
        }

        if (this.getCpoFechaDgie() != null && "null".equals(this.getCpoFechaDgie())) {
            conditions += " AND CPO_FECHA_DGIE IS NULL";
        } else if (this.getCpoFechaDgie() != null) {
            conditions += " AND CPO_FECHA_DGIE = ?";
            values.add(this.getCpoFechaDgie());
        }

        if (this.getCpoReferDgie() != null && "null".equals(this.getCpoReferDgie())) {
            conditions += " AND CPO_REFER_DGIE IS NULL";
        } else if (this.getCpoReferDgie() != null) {
            conditions += " AND CPO_REFER_DGIE = ?";
            values.add(this.getCpoReferDgie());
        }

        if (this.getCpoFechaBmv() != null && "null".equals(this.getCpoFechaBmv())) {
            conditions += " AND CPO_FECHA_BMV IS NULL";
        } else if (this.getCpoFechaBmv() != null) {
            conditions += " AND CPO_FECHA_BMV = ?";
            values.add(this.getCpoFechaBmv());
        }

        if (this.getCpoReferBmv() != null && "null".equals(this.getCpoReferBmv())) {
            conditions += " AND CPO_REFER_BMV IS NULL";
        } else if (this.getCpoReferBmv() != null) {
            conditions += " AND CPO_REFER_BMV = ?";
            values.add(this.getCpoReferBmv());
        }

        if (this.getCpoFechaRnvi() != null && "null".equals(this.getCpoFechaRnvi())) {
            conditions += " AND CPO_FECHA_RNVI IS NULL";
        } else if (this.getCpoFechaRnvi() != null) {
            conditions += " AND CPO_FECHA_RNVI = ?";
            values.add(this.getCpoFechaRnvi());
        }

        if (this.getCpoReferRnvi() != null && "null".equals(this.getCpoReferRnvi())) {
            conditions += " AND CPO_REFER_RNVI IS NULL";
        } else if (this.getCpoReferRnvi() != null) {
            conditions += " AND CPO_REFER_RNVI = ?";
            values.add(this.getCpoReferRnvi());
        }

        if (this.getCpoImpIniEmis() != null && this.getCpoImpIniEmis().longValue() == -999) {
            conditions += " AND CPO_IMP_INI_EMIS IS NULL";
        } else if (this.getCpoImpIniEmis() != null) {
            conditions += " AND CPO_IMP_INI_EMIS = ?";
            values.add(this.getCpoImpIniEmis());
        }

        if (this.getCpoFechaEmision() != null && "null".equals(this.getCpoFechaEmision())) {
            conditions += " AND CPO_FECHA_EMISION IS NULL";
        } else if (this.getCpoFechaEmision() != null) {
            conditions += " AND CPO_FECHA_EMISION = ?";
            values.add(this.getCpoFechaEmision());
        }

        if (this.getCpoFechaColoc() != null && "null".equals(this.getCpoFechaColoc())) {
            conditions += " AND CPO_FECHA_COLOC IS NULL";
        } else if (this.getCpoFechaColoc() != null) {
            conditions += " AND CPO_FECHA_COLOC = ?";
            values.add(this.getCpoFechaColoc());
        }

        if (this.getCpoFechaLiquid() != null && "null".equals(this.getCpoFechaLiquid())) {
            conditions += " AND CPO_FECHA_LIQUID IS NULL";
        } else if (this.getCpoFechaLiquid() != null) {
            conditions += " AND CPO_FECHA_LIQUID = ?";
            values.add(this.getCpoFechaLiquid());
        }

        if (this.getCpoValorNomin() != null && this.getCpoValorNomin().longValue() == -999) {
            conditions += " AND CPO_VALOR_NOMIN IS NULL";
        } else if (this.getCpoValorNomin() != null) {
            conditions += " AND CPO_VALOR_NOMIN = ?";
            values.add(this.getCpoValorNomin());
        }

        if (this.getCpoCposEmit() != null && this.getCpoCposEmit().longValue() == -999) {
            conditions += " AND CPO_CPOS_EMIT IS NULL";
        } else if (this.getCpoCposEmit() != null) {
            conditions += " AND CPO_CPOS_EMIT = ?";
            values.add(this.getCpoCposEmit());
        }

        if (this.getCpoDictTecnico() != null && "null".equals(this.getCpoDictTecnico())) {
            conditions += " AND CPO_DICT_TECNICO IS NULL";
        } else if (this.getCpoDictTecnico() != null) {
            conditions += " AND CPO_DICT_TECNICO = ?";
            values.add(this.getCpoDictTecnico());
        }

        if (this.getCpoClasAmort() != null && this.getCpoClasAmort().longValue() == -999) {
            conditions += " AND CPO_CLAS_AMORT IS NULL";
        } else if (this.getCpoClasAmort() != null) {
            conditions += " AND CPO_CLAS_AMORT = ?";
            values.add(this.getCpoClasAmort());
        }

        if (this.getCpoClasNoAmor() != null && this.getCpoClasNoAmor().longValue() == -999) {
            conditions += " AND CPO_CLAS_NO_AMOR IS NULL";
        } else if (this.getCpoClasNoAmor() != null) {
            conditions += " AND CPO_CLAS_NO_AMOR = ?";
            values.add(this.getCpoClasNoAmor());
        }

        if (this.getCpoClasVna() != null && this.getCpoClasVna().longValue() == -999) {
            conditions += " AND CPO_CLAS_VNA IS NULL";
        } else if (this.getCpoClasVna() != null) {
            conditions += " AND CPO_CLAS_VNA = ?";
            values.add(this.getCpoClasVna());
        }

        if (this.getCpoClasVn() != null && this.getCpoClasVn().longValue() == -999) {
            conditions += " AND CPO_CLAS_VN IS NULL";
        } else if (this.getCpoClasVn() != null) {
            conditions += " AND CPO_CLAS_VN = ?";
            values.add(this.getCpoClasVn());
        }

        if (this.getCpoClasPagoInt() != null && this.getCpoClasPagoInt().longValue() == -999) {
            conditions += " AND CPO_CLAS_PAGO_INT IS NULL";
        } else if (this.getCpoClasPagoInt() != null) {
            conditions += " AND CPO_CLAS_PAGO_INT = ?";
            values.add(this.getCpoClasPagoInt());
        }

        if (this.getCpoClasReval() != null && this.getCpoClasReval().longValue() == -999) {
            conditions += " AND CPO_CLAS_REVAL IS NULL";
        } else if (this.getCpoClasReval() != null) {
            conditions += " AND CPO_CLAS_REVAL = ?";
            values.add(this.getCpoClasReval());
        }

        if (this.getCpoTasaInteres() != null && this.getCpoTasaInteres().longValue() == -999) {
            conditions += " AND CPO_TASA_INTERES IS NULL";
        } else if (this.getCpoTasaInteres() != null) {
            conditions += " AND CPO_TASA_INTERES = ?";
            values.add(this.getCpoTasaInteres());
        }

        if (this.getCpoPlazoAmort() != null && this.getCpoPlazoAmort().longValue() == -999) {
            conditions += " AND CPO_PLAZO_AMORT IS NULL";
        } else if (this.getCpoPlazoAmort() != null) {
            conditions += " AND CPO_PLAZO_AMORT = ?";
            values.add(this.getCpoPlazoAmort());
        }

        if (this.getCpoAnoAltReg() != null && this.getCpoAnoAltReg().longValue() == -999) {
            conditions += " AND CPO_ANO_ALT_REG IS NULL";
        } else if (this.getCpoAnoAltReg() != null) {
            conditions += " AND CPO_ANO_ALT_REG = ?";
            values.add(this.getCpoAnoAltReg());
        }

        if (this.getCpoMesAltReg() != null && this.getCpoMesAltReg().longValue() == -999) {
            conditions += " AND CPO_MES_ALT_REG IS NULL";
        } else if (this.getCpoMesAltReg() != null) {
            conditions += " AND CPO_MES_ALT_REG = ?";
            values.add(this.getCpoMesAltReg());
        }

        if (this.getCpoDiaAltReg() != null && this.getCpoDiaAltReg().longValue() == -999) {
            conditions += " AND CPO_DIA_ALT_REG IS NULL";
        } else if (this.getCpoDiaAltReg() != null) {
            conditions += " AND CPO_DIA_ALT_REG = ?";
            values.add(this.getCpoDiaAltReg());
        }

        if (this.getCpoAnoUltMod() != null && this.getCpoAnoUltMod().longValue() == -999) {
            conditions += " AND CPO_ANO_ULT_MOD IS NULL";
        } else if (this.getCpoAnoUltMod() != null) {
            conditions += " AND CPO_ANO_ULT_MOD = ?";
            values.add(this.getCpoAnoUltMod());
        }

        if (this.getCpoMesUltMod() != null && this.getCpoMesUltMod().longValue() == -999) {
            conditions += " AND CPO_MES_ULT_MOD IS NULL";
        } else if (this.getCpoMesUltMod() != null) {
            conditions += " AND CPO_MES_ULT_MOD = ?";
            values.add(this.getCpoMesUltMod());
        }

        if (this.getCpoDiaUltMod() != null && this.getCpoDiaUltMod().longValue() == -999) {
            conditions += " AND CPO_DIA_ULT_MOD IS NULL";
        } else if (this.getCpoDiaUltMod() != null) {
            conditions += " AND CPO_DIA_ULT_MOD = ?";
            values.add(this.getCpoDiaUltMod());
        }

        if (this.getCpoCveStCpo() != null && "null".equals(this.getCpoCveStCpo())) {
            conditions += " AND CPO_CVE_ST_CPO IS NULL";
        } else if (this.getCpoCveStCpo() != null) {
            conditions += " AND CPO_CVE_ST_CPO = ?";
            values.add(this.getCpoCveStCpo());
        }

        if (this.getCpoCuponCero() != null && this.getCpoCuponCero().longValue() == -999) {
            conditions += " AND CPO_CUPON_CERO IS NULL";
        } else if (this.getCpoCuponCero() != null) {
            conditions += " AND CPO_CUPON_CERO = ?";
            values.add(this.getCpoCuponCero());
        }

        if (this.getCpoFechaEmis() != null && "null".equals(this.getCpoFechaEmis())) {
            conditions += " AND CPO_FECHA_EMIS IS NULL";
        } else if (this.getCpoFechaEmis() != null) {
            conditions += " AND CPO_FECHA_EMIS = ?";
            values.add(this.getCpoFechaEmis());
        }

        if (this.getCpoTitColoca() != null && this.getCpoTitColoca().longValue() == -999) {
            conditions += " AND CPO_TIT_COLOCA IS NULL";
        } else if (this.getCpoTitColoca() != null) {
            conditions += " AND CPO_TIT_COLOCA = ?";
            values.add(this.getCpoTitColoca());
        }

        if (this.getCpoTitTesor() != null && this.getCpoTitTesor().longValue() == -999) {
            conditions += " AND CPO_TIT_TESOR IS NULL";
        } else if (this.getCpoTitTesor() != null) {
            conditions += " AND CPO_TIT_TESOR = ?";
            values.add(this.getCpoTitTesor());
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
        String sql = "UPDATE EMIS_CPO SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPO_SERIE = ?";
        pkValues.add(this.getCpoSerie());
        conditions += " AND CPO_ACTA_EMIS = ?";
        pkValues.add(this.getCpoActaEmis());
        fields += " CPO_CARAC_EMISION = ?, ";
        values.add(this.getCpoCaracEmision());
        fields += " CPO_NO_RPPC = ?, ";
        values.add(this.getCpoNoRppc());
        fields += " CPO_CVE_PIZARRA = ?, ";
        values.add(this.getCpoCvePizarra());
        fields += " CPO_FECHA_CNBV = ?, ";
        values.add(this.getCpoFechaCnbv());
        fields += " CPO_REFER_CNBV = ?, ";
        values.add(this.getCpoReferCnbv());
        fields += " CPO_FECHA_DGIE = ?, ";
        values.add(this.getCpoFechaDgie());
        fields += " CPO_REFER_DGIE = ?, ";
        values.add(this.getCpoReferDgie());
        fields += " CPO_FECHA_BMV = ?, ";
        values.add(this.getCpoFechaBmv());
        fields += " CPO_REFER_BMV = ?, ";
        values.add(this.getCpoReferBmv());
        fields += " CPO_FECHA_RNVI = ?, ";
        values.add(this.getCpoFechaRnvi());
        fields += " CPO_REFER_RNVI = ?, ";
        values.add(this.getCpoReferRnvi());
        fields += " CPO_IMP_INI_EMIS = ?, ";
        values.add(this.getCpoImpIniEmis());
        fields += " CPO_FECHA_EMISION = ?, ";
        values.add(this.getCpoFechaEmision());
        fields += " CPO_FECHA_COLOC = ?, ";
        values.add(this.getCpoFechaColoc());
        fields += " CPO_FECHA_LIQUID = ?, ";
        values.add(this.getCpoFechaLiquid());
        fields += " CPO_VALOR_NOMIN = ?, ";
        values.add(this.getCpoValorNomin());
        fields += " CPO_CPOS_EMIT = ?, ";
        values.add(this.getCpoCposEmit());
        fields += " CPO_DICT_TECNICO = ?, ";
        values.add(this.getCpoDictTecnico());
        fields += " CPO_CLAS_AMORT = ?, ";
        values.add(this.getCpoClasAmort());
        fields += " CPO_CLAS_NO_AMOR = ?, ";
        values.add(this.getCpoClasNoAmor());
        fields += " CPO_CLAS_VNA = ?, ";
        values.add(this.getCpoClasVna());
        fields += " CPO_CLAS_VN = ?, ";
        values.add(this.getCpoClasVn());
        fields += " CPO_CLAS_PAGO_INT = ?, ";
        values.add(this.getCpoClasPagoInt());
        fields += " CPO_CLAS_REVAL = ?, ";
        values.add(this.getCpoClasReval());
        fields += " CPO_TASA_INTERES = ?, ";
        values.add(this.getCpoTasaInteres());
        fields += " CPO_PLAZO_AMORT = ?, ";
        values.add(this.getCpoPlazoAmort());
        fields += " CPO_ANO_ALT_REG = ?, ";
        values.add(this.getCpoAnoAltReg());
        fields += " CPO_MES_ALT_REG = ?, ";
        values.add(this.getCpoMesAltReg());
        fields += " CPO_DIA_ALT_REG = ?, ";
        values.add(this.getCpoDiaAltReg());
        fields += " CPO_ANO_ULT_MOD = ?, ";
        values.add(this.getCpoAnoUltMod());
        fields += " CPO_MES_ULT_MOD = ?, ";
        values.add(this.getCpoMesUltMod());
        fields += " CPO_DIA_ULT_MOD = ?, ";
        values.add(this.getCpoDiaUltMod());
        fields += " CPO_CVE_ST_CPO = ?, ";
        values.add(this.getCpoCveStCpo());
        fields += " CPO_CUPON_CERO = ?, ";
        values.add(this.getCpoCuponCero());
        fields += " CPO_FECHA_EMIS = ?, ";
        values.add(this.getCpoFechaEmis());
        fields += " CPO_TIT_COLOCA = ?, ";
        values.add(this.getCpoTitColoca());
        fields += " CPO_TIT_TESOR = ?, ";
        values.add(this.getCpoTitTesor());
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
        String sql = "INSERT INTO EMIS_CPO ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPO_SERIE";
        fieldValues += ", ?";
        values.add(this.getCpoSerie());

        fields += ", CPO_ACTA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoActaEmis());

        fields += ", CPO_CARAC_EMISION";
        fieldValues += ", ?";
        values.add(this.getCpoCaracEmision());

        fields += ", CPO_NO_RPPC";
        fieldValues += ", ?";
        values.add(this.getCpoNoRppc());

        fields += ", CPO_CVE_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCpoCvePizarra());

        fields += ", CPO_FECHA_CNBV";
        fieldValues += ", ?";
        values.add(this.getCpoFechaCnbv());

        fields += ", CPO_REFER_CNBV";
        fieldValues += ", ?";
        values.add(this.getCpoReferCnbv());

        fields += ", CPO_FECHA_DGIE";
        fieldValues += ", ?";
        values.add(this.getCpoFechaDgie());

        fields += ", CPO_REFER_DGIE";
        fieldValues += ", ?";
        values.add(this.getCpoReferDgie());

        fields += ", CPO_FECHA_BMV";
        fieldValues += ", ?";
        values.add(this.getCpoFechaBmv());

        fields += ", CPO_REFER_BMV";
        fieldValues += ", ?";
        values.add(this.getCpoReferBmv());

        fields += ", CPO_FECHA_RNVI";
        fieldValues += ", ?";
        values.add(this.getCpoFechaRnvi());

        fields += ", CPO_REFER_RNVI";
        fieldValues += ", ?";
        values.add(this.getCpoReferRnvi());

        fields += ", CPO_IMP_INI_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoImpIniEmis());

        fields += ", CPO_FECHA_EMISION";
        fieldValues += ", ?";
        values.add(this.getCpoFechaEmision());

        fields += ", CPO_FECHA_COLOC";
        fieldValues += ", ?";
        values.add(this.getCpoFechaColoc());

        fields += ", CPO_FECHA_LIQUID";
        fieldValues += ", ?";
        values.add(this.getCpoFechaLiquid());

        fields += ", CPO_VALOR_NOMIN";
        fieldValues += ", ?";
        values.add(this.getCpoValorNomin());

        fields += ", CPO_CPOS_EMIT";
        fieldValues += ", ?";
        values.add(this.getCpoCposEmit());

        fields += ", CPO_DICT_TECNICO";
        fieldValues += ", ?";
        values.add(this.getCpoDictTecnico());

        fields += ", CPO_CLAS_AMORT";
        fieldValues += ", ?";
        values.add(this.getCpoClasAmort());

        fields += ", CPO_CLAS_NO_AMOR";
        fieldValues += ", ?";
        values.add(this.getCpoClasNoAmor());

        fields += ", CPO_CLAS_VNA";
        fieldValues += ", ?";
        values.add(this.getCpoClasVna());

        fields += ", CPO_CLAS_VN";
        fieldValues += ", ?";
        values.add(this.getCpoClasVn());

        fields += ", CPO_CLAS_PAGO_INT";
        fieldValues += ", ?";
        values.add(this.getCpoClasPagoInt());

        fields += ", CPO_CLAS_REVAL";
        fieldValues += ", ?";
        values.add(this.getCpoClasReval());

        fields += ", CPO_TASA_INTERES";
        fieldValues += ", ?";
        values.add(this.getCpoTasaInteres());

        fields += ", CPO_PLAZO_AMORT";
        fieldValues += ", ?";
        values.add(this.getCpoPlazoAmort());

        fields += ", CPO_ANO_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getCpoAnoAltReg());

        fields += ", CPO_MES_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getCpoMesAltReg());

        fields += ", CPO_DIA_ALT_REG";
        fieldValues += ", ?";
        values.add(this.getCpoDiaAltReg());

        fields += ", CPO_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCpoAnoUltMod());

        fields += ", CPO_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCpoMesUltMod());

        fields += ", CPO_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCpoDiaUltMod());

        fields += ", CPO_CVE_ST_CPO";
        fieldValues += ", ?";
        values.add(this.getCpoCveStCpo());

        fields += ", CPO_CUPON_CERO";
        fieldValues += ", ?";
        values.add(this.getCpoCuponCero());

        fields += ", CPO_FECHA_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpoFechaEmis());

        fields += ", CPO_TIT_COLOCA";
        fieldValues += ", ?";
        values.add(this.getCpoTitColoca());

        fields += ", CPO_TIT_TESOR";
        fieldValues += ", ?";
        values.add(this.getCpoTitTesor());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EMIS_CPO WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPO_SERIE = ?";
        values.add(this.getCpoSerie());
        conditions += " AND CPO_ACTA_EMIS = ?";
        values.add(this.getCpoActaEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        EmisCpo instance = (EmisCpo) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCpoSerie().equals(instance.getCpoSerie()))
            equalObjects = false;
        if (equalObjects && !this.getCpoActaEmis().equals(instance.getCpoActaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCpoCaracEmision().equals(instance.getCpoCaracEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCpoNoRppc().equals(instance.getCpoNoRppc()))
            equalObjects = false;
        if (equalObjects && !this.getCpoCvePizarra().equals(instance.getCpoCvePizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCpoFechaCnbv().equals(instance.getCpoFechaCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getCpoReferCnbv().equals(instance.getCpoReferCnbv()))
            equalObjects = false;
        if (equalObjects && !this.getCpoFechaDgie().equals(instance.getCpoFechaDgie()))
            equalObjects = false;
        if (equalObjects && !this.getCpoReferDgie().equals(instance.getCpoReferDgie()))
            equalObjects = false;
        if (equalObjects && !this.getCpoFechaBmv().equals(instance.getCpoFechaBmv()))
            equalObjects = false;
        if (equalObjects && !this.getCpoReferBmv().equals(instance.getCpoReferBmv()))
            equalObjects = false;
        if (equalObjects && !this.getCpoFechaRnvi().equals(instance.getCpoFechaRnvi()))
            equalObjects = false;
        if (equalObjects && !this.getCpoReferRnvi().equals(instance.getCpoReferRnvi()))
            equalObjects = false;
        if (equalObjects && !this.getCpoImpIniEmis().equals(instance.getCpoImpIniEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCpoFechaEmision().equals(instance.getCpoFechaEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCpoFechaColoc().equals(instance.getCpoFechaColoc()))
            equalObjects = false;
        if (equalObjects && !this.getCpoFechaLiquid().equals(instance.getCpoFechaLiquid()))
            equalObjects = false;
        if (equalObjects && !this.getCpoValorNomin().equals(instance.getCpoValorNomin()))
            equalObjects = false;
        if (equalObjects && !this.getCpoCposEmit().equals(instance.getCpoCposEmit()))
            equalObjects = false;
        if (equalObjects && !this.getCpoDictTecnico().equals(instance.getCpoDictTecnico()))
            equalObjects = false;
        if (equalObjects && !this.getCpoClasAmort().equals(instance.getCpoClasAmort()))
            equalObjects = false;
        if (equalObjects && !this.getCpoClasNoAmor().equals(instance.getCpoClasNoAmor()))
            equalObjects = false;
        if (equalObjects && !this.getCpoClasVna().equals(instance.getCpoClasVna()))
            equalObjects = false;
        if (equalObjects && !this.getCpoClasVn().equals(instance.getCpoClasVn()))
            equalObjects = false;
        if (equalObjects && !this.getCpoClasPagoInt().equals(instance.getCpoClasPagoInt()))
            equalObjects = false;
        if (equalObjects && !this.getCpoClasReval().equals(instance.getCpoClasReval()))
            equalObjects = false;
        if (equalObjects && !this.getCpoTasaInteres().equals(instance.getCpoTasaInteres()))
            equalObjects = false;
        if (equalObjects && !this.getCpoPlazoAmort().equals(instance.getCpoPlazoAmort()))
            equalObjects = false;
        if (equalObjects && !this.getCpoAnoAltReg().equals(instance.getCpoAnoAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getCpoMesAltReg().equals(instance.getCpoMesAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getCpoDiaAltReg().equals(instance.getCpoDiaAltReg()))
            equalObjects = false;
        if (equalObjects && !this.getCpoAnoUltMod().equals(instance.getCpoAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCpoMesUltMod().equals(instance.getCpoMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCpoDiaUltMod().equals(instance.getCpoDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCpoCveStCpo().equals(instance.getCpoCveStCpo()))
            equalObjects = false;
        if (equalObjects && !this.getCpoCuponCero().equals(instance.getCpoCuponCero()))
            equalObjects = false;
        if (equalObjects && !this.getCpoFechaEmis().equals(instance.getCpoFechaEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCpoTitColoca().equals(instance.getCpoTitColoca()))
            equalObjects = false;
        if (equalObjects && !this.getCpoTitTesor().equals(instance.getCpoTitTesor()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        EmisCpo result = new EmisCpo();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCpoSerie((String) objectData.getData("CPO_SERIE"));
        result.setCpoActaEmis((BigDecimal) objectData.getData("CPO_ACTA_EMIS"));
        result.setCpoCaracEmision((String) objectData.getData("CPO_CARAC_EMISION"));
        result.setCpoNoRppc((String) objectData.getData("CPO_NO_RPPC"));
        result.setCpoCvePizarra((String) objectData.getData("CPO_CVE_PIZARRA"));
        result.setCpoFechaCnbv((String) objectData.getData("CPO_FECHA_CNBV"));
        result.setCpoReferCnbv((String) objectData.getData("CPO_REFER_CNBV"));
        result.setCpoFechaDgie((String) objectData.getData("CPO_FECHA_DGIE"));
        result.setCpoReferDgie((String) objectData.getData("CPO_REFER_DGIE"));
        result.setCpoFechaBmv((String) objectData.getData("CPO_FECHA_BMV"));
        result.setCpoReferBmv((String) objectData.getData("CPO_REFER_BMV"));
        result.setCpoFechaRnvi((String) objectData.getData("CPO_FECHA_RNVI"));
        result.setCpoReferRnvi((String) objectData.getData("CPO_REFER_RNVI"));
        result.setCpoImpIniEmis((BigDecimal) objectData.getData("CPO_IMP_INI_EMIS"));
        result.setCpoFechaEmision((String) objectData.getData("CPO_FECHA_EMISION"));
        result.setCpoFechaColoc((String) objectData.getData("CPO_FECHA_COLOC"));
        result.setCpoFechaLiquid((String) objectData.getData("CPO_FECHA_LIQUID"));
        result.setCpoValorNomin((BigDecimal) objectData.getData("CPO_VALOR_NOMIN"));
        result.setCpoCposEmit((BigDecimal) objectData.getData("CPO_CPOS_EMIT"));
        result.setCpoDictTecnico((String) objectData.getData("CPO_DICT_TECNICO"));
        result.setCpoClasAmort((BigDecimal) objectData.getData("CPO_CLAS_AMORT"));
        result.setCpoClasNoAmor((BigDecimal) objectData.getData("CPO_CLAS_NO_AMOR"));
        result.setCpoClasVna((BigDecimal) objectData.getData("CPO_CLAS_VNA"));
        result.setCpoClasVn((BigDecimal) objectData.getData("CPO_CLAS_VN"));
        result.setCpoClasPagoInt((BigDecimal) objectData.getData("CPO_CLAS_PAGO_INT"));
        result.setCpoClasReval((BigDecimal) objectData.getData("CPO_CLAS_REVAL"));
        result.setCpoTasaInteres((BigDecimal) objectData.getData("CPO_TASA_INTERES"));
        result.setCpoPlazoAmort((BigDecimal) objectData.getData("CPO_PLAZO_AMORT"));
        result.setCpoAnoAltReg((BigDecimal) objectData.getData("CPO_ANO_ALT_REG"));
        result.setCpoMesAltReg((BigDecimal) objectData.getData("CPO_MES_ALT_REG"));
        result.setCpoDiaAltReg((BigDecimal) objectData.getData("CPO_DIA_ALT_REG"));
        result.setCpoAnoUltMod((BigDecimal) objectData.getData("CPO_ANO_ULT_MOD"));
        result.setCpoMesUltMod((BigDecimal) objectData.getData("CPO_MES_ULT_MOD"));
        result.setCpoDiaUltMod((BigDecimal) objectData.getData("CPO_DIA_ULT_MOD"));
        result.setCpoCveStCpo((String) objectData.getData("CPO_CVE_ST_CPO"));
        result.setCpoCuponCero((BigDecimal) objectData.getData("CPO_CUPON_CERO"));
        result.setCpoFechaEmis((String) objectData.getData("CPO_FECHA_EMIS"));
        result.setCpoTitColoca((BigDecimal) objectData.getData("CPO_TIT_COLOCA"));
        result.setCpoTitTesor((BigDecimal) objectData.getData("CPO_TIT_TESOR"));

        return result;

    }

}
