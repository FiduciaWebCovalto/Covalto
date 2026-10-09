package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "COMPEMIS_PK",
            columns =
            { "CPE_NOM_PIZARRA", "CPE_NUM_SERIE_EMIS", "CPE_NUM_CUPON_VIG", "CPE_DIA_COMPRA", "CPE_SEC_DIA_COMPRA", "CPE_SUB_CONTRATO", "CPE_CONTRATO_INTER", "CPE_NUM_CONTRATO",
              "CPE_ENTIDAD_FIN"
    }, sequences = { "MANUAL" })
public class Compemis extends DomainObject {

    BigDecimal cpeNumContrato = null;
    BigDecimal cpeSubContrato = null;
    BigDecimal cpeEntidadFin = null;
    BigDecimal cpeContratoInter = null;
    String cpeNomPizarra = null;
    String cpeNumSerieEmis = null;
    BigDecimal cpeNumCuponVig = null;
    String cpeDiaCompra = null;
    BigDecimal cpeSecDiaCompra = null;
    BigDecimal cpeNumCustodio = null;
    BigDecimal cpeNumMoneda = null;
    BigDecimal cpePrecioEmision = null;
    BigDecimal cpeImpCompra = null;
    BigDecimal cpeNumTitCompra = null;
    BigDecimal cpeTitDispComp = null;
    String cpeFolioCancela = null;
    BigDecimal cpeAnoAltaReg = null;
    BigDecimal cpeMesAltaReg = null;
    BigDecimal cpeDiaAltaReg = null;
    BigDecimal cpeAnoUltMod = null;
    BigDecimal cpeMesUltMod = null;
    BigDecimal cpeDiaUltMod = null;
    String cpeCveStCompemi = null;

    public Compemis() {
        super();
        this.pkColumns = 9;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpeNumContrato(BigDecimal cpeNumContrato) {
        this.cpeNumContrato = cpeNumContrato;
    }

    public BigDecimal getCpeNumContrato() {
        return this.cpeNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpeSubContrato(BigDecimal cpeSubContrato) {
        this.cpeSubContrato = cpeSubContrato;
    }

    public BigDecimal getCpeSubContrato() {
        return this.cpeSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpeEntidadFin(BigDecimal cpeEntidadFin) {
        this.cpeEntidadFin = cpeEntidadFin;
    }

    public BigDecimal getCpeEntidadFin() {
        return this.cpeEntidadFin;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpeContratoInter(BigDecimal cpeContratoInter) {
        this.cpeContratoInter = cpeContratoInter;
    }

    public BigDecimal getCpeContratoInter() {
        return this.cpeContratoInter;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpeNomPizarra(String cpeNomPizarra) {
        this.cpeNomPizarra = cpeNomPizarra;
    }

    public String getCpeNomPizarra() {
        return this.cpeNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpeNumSerieEmis(String cpeNumSerieEmis) {
        this.cpeNumSerieEmis = cpeNumSerieEmis;
    }

    public String getCpeNumSerieEmis() {
        return this.cpeNumSerieEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpeNumCuponVig(BigDecimal cpeNumCuponVig) {
        this.cpeNumCuponVig = cpeNumCuponVig;
    }

    public BigDecimal getCpeNumCuponVig() {
        return this.cpeNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpeDiaCompra(String cpeDiaCompra) {
        this.cpeDiaCompra = cpeDiaCompra;
    }

    public String getCpeDiaCompra() {
        return this.cpeDiaCompra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 20, scale = 0, javaClass = BigDecimal.class)
    public void setCpeSecDiaCompra(BigDecimal cpeSecDiaCompra) {
        this.cpeSecDiaCompra = cpeSecDiaCompra;
    }

    public BigDecimal getCpeSecDiaCompra() {
        return this.cpeSecDiaCompra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpeNumCustodio(BigDecimal cpeNumCustodio) {
        this.cpeNumCustodio = cpeNumCustodio;
    }

    public BigDecimal getCpeNumCustodio() {
        return this.cpeNumCustodio;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCpeNumMoneda(BigDecimal cpeNumMoneda) {
        this.cpeNumMoneda = cpeNumMoneda;
    }

    public BigDecimal getCpeNumMoneda() {
        return this.cpeNumMoneda;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 32, scale = 11, javaClass = BigDecimal.class)
    public void setCpePrecioEmision(BigDecimal cpePrecioEmision) {
        this.cpePrecioEmision = cpePrecioEmision;
    }

    public BigDecimal getCpePrecioEmision() {
        return this.cpePrecioEmision;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 23, scale = 2, javaClass = BigDecimal.class)
    public void setCpeImpCompra(BigDecimal cpeImpCompra) {
        this.cpeImpCompra = cpeImpCompra;
    }

    public BigDecimal getCpeImpCompra() {
        return this.cpeImpCompra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setCpeNumTitCompra(BigDecimal cpeNumTitCompra) {
        this.cpeNumTitCompra = cpeNumTitCompra;
    }

    public BigDecimal getCpeNumTitCompra() {
        return this.cpeNumTitCompra;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 0, javaClass = BigDecimal.class)
    public void setCpeTitDispComp(BigDecimal cpeTitDispComp) {
        this.cpeTitDispComp = cpeTitDispComp;
    }

    public BigDecimal getCpeTitDispComp() {
        return this.cpeTitDispComp;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpeFolioCancela(String cpeFolioCancela) {
        this.cpeFolioCancela = cpeFolioCancela;
    }

    public String getCpeFolioCancela() {
        return this.cpeFolioCancela;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCpeAnoAltaReg(BigDecimal cpeAnoAltaReg) {
        this.cpeAnoAltaReg = cpeAnoAltaReg;
    }

    public BigDecimal getCpeAnoAltaReg() {
        return this.cpeAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpeMesAltaReg(BigDecimal cpeMesAltaReg) {
        this.cpeMesAltaReg = cpeMesAltaReg;
    }

    public BigDecimal getCpeMesAltaReg() {
        return this.cpeMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpeDiaAltaReg(BigDecimal cpeDiaAltaReg) {
        this.cpeDiaAltaReg = cpeDiaAltaReg;
    }

    public BigDecimal getCpeDiaAltaReg() {
        return this.cpeDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCpeAnoUltMod(BigDecimal cpeAnoUltMod) {
        this.cpeAnoUltMod = cpeAnoUltMod;
    }

    public BigDecimal getCpeAnoUltMod() {
        return this.cpeAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpeMesUltMod(BigDecimal cpeMesUltMod) {
        this.cpeMesUltMod = cpeMesUltMod;
    }

    public BigDecimal getCpeMesUltMod() {
        return this.cpeMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCpeDiaUltMod(BigDecimal cpeDiaUltMod) {
        this.cpeDiaUltMod = cpeDiaUltMod;
    }

    public BigDecimal getCpeDiaUltMod() {
        return this.cpeDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCpeCveStCompemi(String cpeCveStCompemi) {
        this.cpeCveStCompemi = cpeCveStCompemi;
    }

    public String getCpeCveStCompemi() {
        return this.cpeCveStCompemi;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM COMPEMIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpeNumContrato() != null && this.getCpeNumContrato().longValue() == -999) {
            conditions += " AND CPE_NUM_CONTRATO IS NULL";
        } else if (this.getCpeNumContrato() != null) {
            conditions += " AND CPE_NUM_CONTRATO = ?";
            values.add(this.getCpeNumContrato());
        }

        if (this.getCpeSubContrato() != null && this.getCpeSubContrato().longValue() == -999) {
            conditions += " AND CPE_SUB_CONTRATO IS NULL";
        } else if (this.getCpeSubContrato() != null) {
            conditions += " AND CPE_SUB_CONTRATO = ?";
            values.add(this.getCpeSubContrato());
        }

        if (this.getCpeEntidadFin() != null && this.getCpeEntidadFin().longValue() == -999) {
            conditions += " AND CPE_ENTIDAD_FIN IS NULL";
        } else if (this.getCpeEntidadFin() != null) {
            conditions += " AND CPE_ENTIDAD_FIN = ?";
            values.add(this.getCpeEntidadFin());
        }

        if (this.getCpeContratoInter() != null && this.getCpeContratoInter().longValue() == -999) {
            conditions += " AND CPE_CONTRATO_INTER IS NULL";
        } else if (this.getCpeContratoInter() != null) {
            conditions += " AND CPE_CONTRATO_INTER = ?";
            values.add(this.getCpeContratoInter());
        }

        if (this.getCpeNomPizarra() != null && "null".equals(this.getCpeNomPizarra())) {
            conditions += " AND CPE_NOM_PIZARRA IS NULL";
        } else if (this.getCpeNomPizarra() != null) {
            conditions += " AND CPE_NOM_PIZARRA = ?";
            values.add(this.getCpeNomPizarra());
        }

        if (this.getCpeNumSerieEmis() != null && "null".equals(this.getCpeNumSerieEmis())) {
            conditions += " AND CPE_NUM_SERIE_EMIS IS NULL";
        } else if (this.getCpeNumSerieEmis() != null) {
            conditions += " AND CPE_NUM_SERIE_EMIS = ?";
            values.add(this.getCpeNumSerieEmis());
        }

        if (this.getCpeNumCuponVig() != null && this.getCpeNumCuponVig().longValue() == -999) {
            conditions += " AND CPE_NUM_CUPON_VIG IS NULL";
        } else if (this.getCpeNumCuponVig() != null) {
            conditions += " AND CPE_NUM_CUPON_VIG = ?";
            values.add(this.getCpeNumCuponVig());
        }

        if (this.getCpeDiaCompra() != null && "null".equals(this.getCpeDiaCompra())) {
            conditions += " AND CPE_DIA_COMPRA IS NULL";
        } else if (this.getCpeDiaCompra() != null) {
            conditions += " AND CPE_DIA_COMPRA = ?";
            values.add(this.getCpeDiaCompra());
        }

        if (this.getCpeSecDiaCompra() != null && this.getCpeSecDiaCompra().longValue() == -999) {
            conditions += " AND CPE_SEC_DIA_COMPRA IS NULL";
        } else if (this.getCpeSecDiaCompra() != null) {
            conditions += " AND CPE_SEC_DIA_COMPRA = ?";
            values.add(this.getCpeSecDiaCompra());
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
        String sql = "SELECT * FROM COMPEMIS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCpeNumContrato() != null && this.getCpeNumContrato().longValue() == -999) {
            conditions += " AND CPE_NUM_CONTRATO IS NULL";
        } else if (this.getCpeNumContrato() != null) {
            conditions += " AND CPE_NUM_CONTRATO = ?";
            values.add(this.getCpeNumContrato());
        }

        if (this.getCpeSubContrato() != null && this.getCpeSubContrato().longValue() == -999) {
            conditions += " AND CPE_SUB_CONTRATO IS NULL";
        } else if (this.getCpeSubContrato() != null) {
            conditions += " AND CPE_SUB_CONTRATO = ?";
            values.add(this.getCpeSubContrato());
        }

        if (this.getCpeEntidadFin() != null && this.getCpeEntidadFin().longValue() == -999) {
            conditions += " AND CPE_ENTIDAD_FIN IS NULL";
        } else if (this.getCpeEntidadFin() != null) {
            conditions += " AND CPE_ENTIDAD_FIN = ?";
            values.add(this.getCpeEntidadFin());
        }

        if (this.getCpeContratoInter() != null && this.getCpeContratoInter().longValue() == -999) {
            conditions += " AND CPE_CONTRATO_INTER IS NULL";
        } else if (this.getCpeContratoInter() != null) {
            conditions += " AND CPE_CONTRATO_INTER = ?";
            values.add(this.getCpeContratoInter());
        }

        if (this.getCpeNomPizarra() != null && "null".equals(this.getCpeNomPizarra())) {
            conditions += " AND CPE_NOM_PIZARRA IS NULL";
        } else if (this.getCpeNomPizarra() != null) {
            conditions += " AND CPE_NOM_PIZARRA = ?";
            values.add(this.getCpeNomPizarra());
        }

        if (this.getCpeNumSerieEmis() != null && "null".equals(this.getCpeNumSerieEmis())) {
            conditions += " AND CPE_NUM_SERIE_EMIS IS NULL";
        } else if (this.getCpeNumSerieEmis() != null) {
            conditions += " AND CPE_NUM_SERIE_EMIS = ?";
            values.add(this.getCpeNumSerieEmis());
        }

        if (this.getCpeNumCuponVig() != null && this.getCpeNumCuponVig().longValue() == -999) {
            conditions += " AND CPE_NUM_CUPON_VIG IS NULL";
        } else if (this.getCpeNumCuponVig() != null) {
            conditions += " AND CPE_NUM_CUPON_VIG = ?";
            values.add(this.getCpeNumCuponVig());
        }

        if (this.getCpeDiaCompra() != null && "null".equals(this.getCpeDiaCompra())) {
            conditions += " AND CPE_DIA_COMPRA IS NULL";
        } else if (this.getCpeDiaCompra() != null) {
            conditions += " AND CPE_DIA_COMPRA = ?";
            values.add(this.getCpeDiaCompra());
        }

        if (this.getCpeSecDiaCompra() != null && this.getCpeSecDiaCompra().longValue() == -999) {
            conditions += " AND CPE_SEC_DIA_COMPRA IS NULL";
        } else if (this.getCpeSecDiaCompra() != null) {
            conditions += " AND CPE_SEC_DIA_COMPRA = ?";
            values.add(this.getCpeSecDiaCompra());
        }

        if (this.getCpeNumCustodio() != null && this.getCpeNumCustodio().longValue() == -999) {
            conditions += " AND CPE_NUM_CUSTODIO IS NULL";
        } else if (this.getCpeNumCustodio() != null) {
            conditions += " AND CPE_NUM_CUSTODIO = ?";
            values.add(this.getCpeNumCustodio());
        }

        if (this.getCpeNumMoneda() != null && this.getCpeNumMoneda().longValue() == -999) {
            conditions += " AND CPE_NUM_MONEDA IS NULL";
        } else if (this.getCpeNumMoneda() != null) {
            conditions += " AND CPE_NUM_MONEDA = ?";
            values.add(this.getCpeNumMoneda());
        }

        if (this.getCpePrecioEmision() != null && this.getCpePrecioEmision().longValue() == -999) {
            conditions += " AND CPE_PRECIO_EMISION IS NULL";
        } else if (this.getCpePrecioEmision() != null) {
            conditions += " AND CPE_PRECIO_EMISION = ?";
            values.add(this.getCpePrecioEmision());
        }

        if (this.getCpeImpCompra() != null && this.getCpeImpCompra().longValue() == -999) {
            conditions += " AND CPE_IMP_COMPRA IS NULL";
        } else if (this.getCpeImpCompra() != null) {
            conditions += " AND CPE_IMP_COMPRA = ?";
            values.add(this.getCpeImpCompra());
        }

        if (this.getCpeNumTitCompra() != null && this.getCpeNumTitCompra().longValue() == -999) {
            conditions += " AND CPE_NUM_TIT_COMPRA IS NULL";
        } else if (this.getCpeNumTitCompra() != null) {
            conditions += " AND CPE_NUM_TIT_COMPRA = ?";
            values.add(this.getCpeNumTitCompra());
        }

        if (this.getCpeTitDispComp() != null && this.getCpeTitDispComp().longValue() == -999) {
            conditions += " AND CPE_TIT_DISP_COMP IS NULL";
        } else if (this.getCpeTitDispComp() != null) {
            conditions += " AND CPE_TIT_DISP_COMP = ?";
            values.add(this.getCpeTitDispComp());
        }

        if (this.getCpeFolioCancela() != null && "null".equals(this.getCpeFolioCancela())) {
            conditions += " AND CPE_FOLIO_CANCELA IS NULL";
        } else if (this.getCpeFolioCancela() != null) {
            conditions += " AND CPE_FOLIO_CANCELA = ?";
            values.add(this.getCpeFolioCancela());
        }

        if (this.getCpeAnoAltaReg() != null && this.getCpeAnoAltaReg().longValue() == -999) {
            conditions += " AND CPE_ANO_ALTA_REG IS NULL";
        } else if (this.getCpeAnoAltaReg() != null) {
            conditions += " AND CPE_ANO_ALTA_REG = ?";
            values.add(this.getCpeAnoAltaReg());
        }

        if (this.getCpeMesAltaReg() != null && this.getCpeMesAltaReg().longValue() == -999) {
            conditions += " AND CPE_MES_ALTA_REG IS NULL";
        } else if (this.getCpeMesAltaReg() != null) {
            conditions += " AND CPE_MES_ALTA_REG = ?";
            values.add(this.getCpeMesAltaReg());
        }

        if (this.getCpeDiaAltaReg() != null && this.getCpeDiaAltaReg().longValue() == -999) {
            conditions += " AND CPE_DIA_ALTA_REG IS NULL";
        } else if (this.getCpeDiaAltaReg() != null) {
            conditions += " AND CPE_DIA_ALTA_REG = ?";
            values.add(this.getCpeDiaAltaReg());
        }

        if (this.getCpeAnoUltMod() != null && this.getCpeAnoUltMod().longValue() == -999) {
            conditions += " AND CPE_ANO_ULT_MOD IS NULL";
        } else if (this.getCpeAnoUltMod() != null) {
            conditions += " AND CPE_ANO_ULT_MOD = ?";
            values.add(this.getCpeAnoUltMod());
        }

        if (this.getCpeMesUltMod() != null && this.getCpeMesUltMod().longValue() == -999) {
            conditions += " AND CPE_MES_ULT_MOD IS NULL";
        } else if (this.getCpeMesUltMod() != null) {
            conditions += " AND CPE_MES_ULT_MOD = ?";
            values.add(this.getCpeMesUltMod());
        }

        if (this.getCpeDiaUltMod() != null && this.getCpeDiaUltMod().longValue() == -999) {
            conditions += " AND CPE_DIA_ULT_MOD IS NULL";
        } else if (this.getCpeDiaUltMod() != null) {
            conditions += " AND CPE_DIA_ULT_MOD = ?";
            values.add(this.getCpeDiaUltMod());
        }

        if (this.getCpeCveStCompemi() != null && "null".equals(this.getCpeCveStCompemi())) {
            conditions += " AND CPE_CVE_ST_COMPEMI IS NULL";
        } else if (this.getCpeCveStCompemi() != null) {
            conditions += " AND CPE_CVE_ST_COMPEMI = ?";
            values.add(this.getCpeCveStCompemi());
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
        String sql = "UPDATE COMPEMIS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CPE_NUM_CONTRATO = ?";
        pkValues.add(this.getCpeNumContrato());
        conditions += " AND CPE_SUB_CONTRATO = ?";
        pkValues.add(this.getCpeSubContrato());
        conditions += " AND CPE_ENTIDAD_FIN = ?";
        pkValues.add(this.getCpeEntidadFin());
        conditions += " AND CPE_CONTRATO_INTER = ?";
        pkValues.add(this.getCpeContratoInter());
        conditions += " AND CPE_NOM_PIZARRA = ?";
        pkValues.add(this.getCpeNomPizarra());
        conditions += " AND CPE_NUM_SERIE_EMIS = ?";
        pkValues.add(this.getCpeNumSerieEmis());
        conditions += " AND CPE_NUM_CUPON_VIG = ?";
        pkValues.add(this.getCpeNumCuponVig());
        conditions += " AND CPE_DIA_COMPRA = ?";
        pkValues.add(this.getCpeDiaCompra());
        conditions += " AND CPE_SEC_DIA_COMPRA = ?";
        pkValues.add(this.getCpeSecDiaCompra());
        fields += " CPE_NUM_CUSTODIO = ?, ";
        values.add(this.getCpeNumCustodio());
        fields += " CPE_NUM_MONEDA = ?, ";
        values.add(this.getCpeNumMoneda());
        fields += " CPE_PRECIO_EMISION = ?, ";
        values.add(this.getCpePrecioEmision());
        fields += " CPE_IMP_COMPRA = ?, ";
        values.add(this.getCpeImpCompra());
        fields += " CPE_NUM_TIT_COMPRA = ?, ";
        values.add(this.getCpeNumTitCompra());
        fields += " CPE_TIT_DISP_COMP = ?, ";
        values.add(this.getCpeTitDispComp());
        fields += " CPE_FOLIO_CANCELA = ?, ";
        values.add(this.getCpeFolioCancela());
        fields += " CPE_ANO_ALTA_REG = ?, ";
        values.add(this.getCpeAnoAltaReg());
        fields += " CPE_MES_ALTA_REG = ?, ";
        values.add(this.getCpeMesAltaReg());
        fields += " CPE_DIA_ALTA_REG = ?, ";
        values.add(this.getCpeDiaAltaReg());
        fields += " CPE_ANO_ULT_MOD = ?, ";
        values.add(this.getCpeAnoUltMod());
        fields += " CPE_MES_ULT_MOD = ?, ";
        values.add(this.getCpeMesUltMod());
        fields += " CPE_DIA_ULT_MOD = ?, ";
        values.add(this.getCpeDiaUltMod());
        fields += " CPE_CVE_ST_COMPEMI = ?, ";
        values.add(this.getCpeCveStCompemi());
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
        String sql = "INSERT INTO COMPEMIS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CPE_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCpeNumContrato());

        fields += ", CPE_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getCpeSubContrato());

        fields += ", CPE_ENTIDAD_FIN";
        fieldValues += ", ?";
        values.add(this.getCpeEntidadFin());

        fields += ", CPE_CONTRATO_INTER";
        fieldValues += ", ?";
        values.add(this.getCpeContratoInter());

        fields += ", CPE_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCpeNomPizarra());

        fields += ", CPE_NUM_SERIE_EMIS";
        fieldValues += ", ?";
        values.add(this.getCpeNumSerieEmis());

        fields += ", CPE_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getCpeNumCuponVig());

        fields += ", CPE_DIA_COMPRA";
        fieldValues += ", ?";
        values.add(this.getCpeDiaCompra());

        fields += ", CPE_SEC_DIA_COMPRA";
        fieldValues += ", ?";
        values.add(this.getCpeSecDiaCompra());

        fields += ", CPE_NUM_CUSTODIO";
        fieldValues += ", ?";
        values.add(this.getCpeNumCustodio());

        fields += ", CPE_NUM_MONEDA";
        fieldValues += ", ?";
        values.add(this.getCpeNumMoneda());

        fields += ", CPE_PRECIO_EMISION";
        fieldValues += ", ?";
        values.add(this.getCpePrecioEmision());

        fields += ", CPE_IMP_COMPRA";
        fieldValues += ", ?";
        values.add(this.getCpeImpCompra());

        fields += ", CPE_NUM_TIT_COMPRA";
        fieldValues += ", ?";
        values.add(this.getCpeNumTitCompra());

        fields += ", CPE_TIT_DISP_COMP";
        fieldValues += ", ?";
        values.add(this.getCpeTitDispComp());

        fields += ", CPE_FOLIO_CANCELA";
        fieldValues += ", ?";
        values.add(this.getCpeFolioCancela());

        fields += ", CPE_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCpeAnoAltaReg());

        fields += ", CPE_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCpeMesAltaReg());

        fields += ", CPE_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCpeDiaAltaReg());

        fields += ", CPE_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCpeAnoUltMod());

        fields += ", CPE_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCpeMesUltMod());

        fields += ", CPE_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCpeDiaUltMod());

        fields += ", CPE_CVE_ST_COMPEMI";
        fieldValues += ", ?";
        values.add(this.getCpeCveStCompemi());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM COMPEMIS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CPE_NUM_CONTRATO = ?";
        values.add(this.getCpeNumContrato());
        conditions += " AND CPE_SUB_CONTRATO = ?";
        values.add(this.getCpeSubContrato());
        conditions += " AND CPE_ENTIDAD_FIN = ?";
        values.add(this.getCpeEntidadFin());
        conditions += " AND CPE_CONTRATO_INTER = ?";
        values.add(this.getCpeContratoInter());
        conditions += " AND CPE_NOM_PIZARRA = ?";
        values.add(this.getCpeNomPizarra());
        conditions += " AND CPE_NUM_SERIE_EMIS = ?";
        values.add(this.getCpeNumSerieEmis());
        conditions += " AND CPE_NUM_CUPON_VIG = ?";
        values.add(this.getCpeNumCuponVig());
        conditions += " AND CPE_DIA_COMPRA = ?";
        values.add(this.getCpeDiaCompra());
        conditions += " AND CPE_SEC_DIA_COMPRA = ?";
        values.add(this.getCpeSecDiaCompra());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Compemis instance = (Compemis) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCpeNumContrato().equals(instance.getCpeNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCpeSubContrato().equals(instance.getCpeSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getCpeEntidadFin().equals(instance.getCpeEntidadFin()))
            equalObjects = false;
        if (equalObjects && !this.getCpeContratoInter().equals(instance.getCpeContratoInter()))
            equalObjects = false;
        if (equalObjects && !this.getCpeNomPizarra().equals(instance.getCpeNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCpeNumSerieEmis().equals(instance.getCpeNumSerieEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCpeNumCuponVig().equals(instance.getCpeNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getCpeDiaCompra().equals(instance.getCpeDiaCompra()))
            equalObjects = false;
        if (equalObjects && !this.getCpeSecDiaCompra().equals(instance.getCpeSecDiaCompra()))
            equalObjects = false;
        if (equalObjects && !this.getCpeNumCustodio().equals(instance.getCpeNumCustodio()))
            equalObjects = false;
        if (equalObjects && !this.getCpeNumMoneda().equals(instance.getCpeNumMoneda()))
            equalObjects = false;
        if (equalObjects && !this.getCpePrecioEmision().equals(instance.getCpePrecioEmision()))
            equalObjects = false;
        if (equalObjects && !this.getCpeImpCompra().equals(instance.getCpeImpCompra()))
            equalObjects = false;
        if (equalObjects && !this.getCpeNumTitCompra().equals(instance.getCpeNumTitCompra()))
            equalObjects = false;
        if (equalObjects && !this.getCpeTitDispComp().equals(instance.getCpeTitDispComp()))
            equalObjects = false;
        if (equalObjects && !this.getCpeFolioCancela().equals(instance.getCpeFolioCancela()))
            equalObjects = false;
        if (equalObjects && !this.getCpeAnoAltaReg().equals(instance.getCpeAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCpeMesAltaReg().equals(instance.getCpeMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCpeDiaAltaReg().equals(instance.getCpeDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCpeAnoUltMod().equals(instance.getCpeAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCpeMesUltMod().equals(instance.getCpeMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCpeDiaUltMod().equals(instance.getCpeDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCpeCveStCompemi().equals(instance.getCpeCveStCompemi()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Compemis result = new Compemis();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCpeNumContrato((BigDecimal) objectData.getData("CPE_NUM_CONTRATO"));
        result.setCpeSubContrato((BigDecimal) objectData.getData("CPE_SUB_CONTRATO"));
        result.setCpeEntidadFin((BigDecimal) objectData.getData("CPE_ENTIDAD_FIN"));
        result.setCpeContratoInter((BigDecimal) objectData.getData("CPE_CONTRATO_INTER"));
        result.setCpeNomPizarra((String) objectData.getData("CPE_NOM_PIZARRA"));
        result.setCpeNumSerieEmis((String) objectData.getData("CPE_NUM_SERIE_EMIS"));
        result.setCpeNumCuponVig((BigDecimal) objectData.getData("CPE_NUM_CUPON_VIG"));
        result.setCpeDiaCompra((String) objectData.getData("CPE_DIA_COMPRA"));
        result.setCpeSecDiaCompra((BigDecimal) objectData.getData("CPE_SEC_DIA_COMPRA"));
        result.setCpeNumCustodio((BigDecimal) objectData.getData("CPE_NUM_CUSTODIO"));
        result.setCpeNumMoneda((BigDecimal) objectData.getData("CPE_NUM_MONEDA"));
        result.setCpePrecioEmision((BigDecimal) objectData.getData("CPE_PRECIO_EMISION"));
        result.setCpeImpCompra((BigDecimal) objectData.getData("CPE_IMP_COMPRA"));
        result.setCpeNumTitCompra((BigDecimal) objectData.getData("CPE_NUM_TIT_COMPRA"));
        result.setCpeTitDispComp((BigDecimal) objectData.getData("CPE_TIT_DISP_COMP"));
        result.setCpeFolioCancela((String) objectData.getData("CPE_FOLIO_CANCELA"));
        result.setCpeAnoAltaReg((BigDecimal) objectData.getData("CPE_ANO_ALTA_REG"));
        result.setCpeMesAltaReg((BigDecimal) objectData.getData("CPE_MES_ALTA_REG"));
        result.setCpeDiaAltaReg((BigDecimal) objectData.getData("CPE_DIA_ALTA_REG"));
        result.setCpeAnoUltMod((BigDecimal) objectData.getData("CPE_ANO_ULT_MOD"));
        result.setCpeMesUltMod((BigDecimal) objectData.getData("CPE_MES_ULT_MOD"));
        result.setCpeDiaUltMod((BigDecimal) objectData.getData("CPE_DIA_ULT_MOD"));
        result.setCpeCveStCompemi((String) objectData.getData("CPE_CVE_ST_COMPEMI"));

        return result;

    }

}
