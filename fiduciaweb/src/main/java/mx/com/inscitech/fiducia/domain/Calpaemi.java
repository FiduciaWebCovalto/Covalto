package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "CALPAEMI_PK", columns = { "CEM_NOM_PIZARRA", "CEM_NUM_SER_EMIS", "CEM_NUM_CUPON_VIG", "CEM_ANO_LIQ_EMIS", "CEM_MES_LIQ_EMIS", "CEM_DIA_LIQ_EMIS" },
            sequences = { "MANUAL" })
public class Calpaemi extends DomainObject {

    String cemNomPizarra = null;
    String cemNumSerEmis = null;
    String cemNumCuponVig = null;
    BigDecimal cemAnoLiqEmis = null;
    BigDecimal cemMesLiqEmis = null;
    BigDecimal cemDiaLiqEmis = null;
    String cemClaveValor = null;
    BigDecimal cemCveTipoMerca = null;
    BigDecimal cemNumInstrum = null;
    BigDecimal cemPjeTasaPago = null;
    BigDecimal cemPjeTasaAjust = null;
    BigDecimal cemAnoLiqAnt = null;
    BigDecimal cemMesLiqAnt = null;
    BigDecimal cemDiaLiqAnt = null;
    BigDecimal cemAnoAltaReg = null;
    BigDecimal cemMesAltaReg = null;
    BigDecimal cemDiaAltaReg = null;
    BigDecimal cemAnoUltMod = null;
    BigDecimal cemMesUltMod = null;
    BigDecimal cemDiaUltMod = null;
    String cemCveStCalpaem = null;

    public Calpaemi() {
        super();
        this.pkColumns = 6;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCemNomPizarra(String cemNomPizarra) {
        this.cemNomPizarra = cemNomPizarra;
    }

    public String getCemNomPizarra() {
        return this.cemNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCemNumSerEmis(String cemNumSerEmis) {
        this.cemNumSerEmis = cemNumSerEmis;
    }

    public String getCemNumSerEmis() {
        return this.cemNumSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setCemNumCuponVig(String cemNumCuponVig) {
        this.cemNumCuponVig = cemNumCuponVig;
    }

    public String getCemNumCuponVig() {
        return this.cemNumCuponVig;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCemAnoLiqEmis(BigDecimal cemAnoLiqEmis) {
        this.cemAnoLiqEmis = cemAnoLiqEmis;
    }

    public BigDecimal getCemAnoLiqEmis() {
        return this.cemAnoLiqEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCemMesLiqEmis(BigDecimal cemMesLiqEmis) {
        this.cemMesLiqEmis = cemMesLiqEmis;
    }

    public BigDecimal getCemMesLiqEmis() {
        return this.cemMesLiqEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCemDiaLiqEmis(BigDecimal cemDiaLiqEmis) {
        this.cemDiaLiqEmis = cemDiaLiqEmis;
    }

    public BigDecimal getCemDiaLiqEmis() {
        return this.cemDiaLiqEmis;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCemClaveValor(String cemClaveValor) {
        this.cemClaveValor = cemClaveValor;
    }

    public String getCemClaveValor() {
        return this.cemClaveValor;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCemCveTipoMerca(BigDecimal cemCveTipoMerca) {
        this.cemCveTipoMerca = cemCveTipoMerca;
    }

    public BigDecimal getCemCveTipoMerca() {
        return this.cemCveTipoMerca;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setCemNumInstrum(BigDecimal cemNumInstrum) {
        this.cemNumInstrum = cemNumInstrum;
    }

    public BigDecimal getCemNumInstrum() {
        return this.cemNumInstrum;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setCemPjeTasaPago(BigDecimal cemPjeTasaPago) {
        this.cemPjeTasaPago = cemPjeTasaPago;
    }

    public BigDecimal getCemPjeTasaPago() {
        return this.cemPjeTasaPago;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 16, scale = 8, javaClass = BigDecimal.class)
    public void setCemPjeTasaAjust(BigDecimal cemPjeTasaAjust) {
        this.cemPjeTasaAjust = cemPjeTasaAjust;
    }

    public BigDecimal getCemPjeTasaAjust() {
        return this.cemPjeTasaAjust;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCemAnoLiqAnt(BigDecimal cemAnoLiqAnt) {
        this.cemAnoLiqAnt = cemAnoLiqAnt;
    }

    public BigDecimal getCemAnoLiqAnt() {
        return this.cemAnoLiqAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCemMesLiqAnt(BigDecimal cemMesLiqAnt) {
        this.cemMesLiqAnt = cemMesLiqAnt;
    }

    public BigDecimal getCemMesLiqAnt() {
        return this.cemMesLiqAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCemDiaLiqAnt(BigDecimal cemDiaLiqAnt) {
        this.cemDiaLiqAnt = cemDiaLiqAnt;
    }

    public BigDecimal getCemDiaLiqAnt() {
        return this.cemDiaLiqAnt;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCemAnoAltaReg(BigDecimal cemAnoAltaReg) {
        this.cemAnoAltaReg = cemAnoAltaReg;
    }

    public BigDecimal getCemAnoAltaReg() {
        return this.cemAnoAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCemMesAltaReg(BigDecimal cemMesAltaReg) {
        this.cemMesAltaReg = cemMesAltaReg;
    }

    public BigDecimal getCemMesAltaReg() {
        return this.cemMesAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCemDiaAltaReg(BigDecimal cemDiaAltaReg) {
        this.cemDiaAltaReg = cemDiaAltaReg;
    }

    public BigDecimal getCemDiaAltaReg() {
        return this.cemDiaAltaReg;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setCemAnoUltMod(BigDecimal cemAnoUltMod) {
        this.cemAnoUltMod = cemAnoUltMod;
    }

    public BigDecimal getCemAnoUltMod() {
        return this.cemAnoUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCemMesUltMod(BigDecimal cemMesUltMod) {
        this.cemMesUltMod = cemMesUltMod;
    }

    public BigDecimal getCemMesUltMod() {
        return this.cemMesUltMod;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setCemDiaUltMod(BigDecimal cemDiaUltMod) {
        this.cemDiaUltMod = cemDiaUltMod;
    }

    public BigDecimal getCemDiaUltMod() {
        return this.cemDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setCemCveStCalpaem(String cemCveStCalpaem) {
        this.cemCveStCalpaem = cemCveStCalpaem;
    }

    public String getCemCveStCalpaem() {
        return this.cemCveStCalpaem;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM CALPAEMI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCemNomPizarra() != null && "null".equals(this.getCemNomPizarra())) {
            conditions += " AND CEM_NOM_PIZARRA IS NULL";
        } else if (this.getCemNomPizarra() != null) {
            conditions += " AND CEM_NOM_PIZARRA = ?";
            values.add(this.getCemNomPizarra());
        }

        if (this.getCemNumSerEmis() != null && "null".equals(this.getCemNumSerEmis())) {
            conditions += " AND CEM_NUM_SER_EMIS IS NULL";
        } else if (this.getCemNumSerEmis() != null) {
            conditions += " AND CEM_NUM_SER_EMIS = ?";
            values.add(this.getCemNumSerEmis());
        }

        if (this.getCemNumCuponVig() != null && "null".equals(this.getCemNumCuponVig())) {
            conditions += " AND CEM_NUM_CUPON_VIG IS NULL";
        } else if (this.getCemNumCuponVig() != null) {
            conditions += " AND CEM_NUM_CUPON_VIG = ?";
            values.add(this.getCemNumCuponVig());
        }

        if (this.getCemAnoLiqEmis() != null && this.getCemAnoLiqEmis().longValue() == -999) {
            conditions += " AND CEM_ANO_LIQ_EMIS IS NULL";
        } else if (this.getCemAnoLiqEmis() != null) {
            conditions += " AND CEM_ANO_LIQ_EMIS = ?";
            values.add(this.getCemAnoLiqEmis());
        }

        if (this.getCemMesLiqEmis() != null && this.getCemMesLiqEmis().longValue() == -999) {
            conditions += " AND CEM_MES_LIQ_EMIS IS NULL";
        } else if (this.getCemMesLiqEmis() != null) {
            conditions += " AND CEM_MES_LIQ_EMIS = ?";
            values.add(this.getCemMesLiqEmis());
        }

        if (this.getCemDiaLiqEmis() != null && this.getCemDiaLiqEmis().longValue() == -999) {
            conditions += " AND CEM_DIA_LIQ_EMIS IS NULL";
        } else if (this.getCemDiaLiqEmis() != null) {
            conditions += " AND CEM_DIA_LIQ_EMIS = ?";
            values.add(this.getCemDiaLiqEmis());
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
        String sql = "SELECT * FROM CALPAEMI ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getCemNomPizarra() != null && "null".equals(this.getCemNomPizarra())) {
            conditions += " AND CEM_NOM_PIZARRA IS NULL";
        } else if (this.getCemNomPizarra() != null) {
            conditions += " AND CEM_NOM_PIZARRA = ?";
            values.add(this.getCemNomPizarra());
        }

        if (this.getCemNumSerEmis() != null && "null".equals(this.getCemNumSerEmis())) {
            conditions += " AND CEM_NUM_SER_EMIS IS NULL";
        } else if (this.getCemNumSerEmis() != null) {
            conditions += " AND CEM_NUM_SER_EMIS = ?";
            values.add(this.getCemNumSerEmis());
        }

        if (this.getCemNumCuponVig() != null && "null".equals(this.getCemNumCuponVig())) {
            conditions += " AND CEM_NUM_CUPON_VIG IS NULL";
        } else if (this.getCemNumCuponVig() != null) {
            conditions += " AND CEM_NUM_CUPON_VIG = ?";
            values.add(this.getCemNumCuponVig());
        }

        if (this.getCemAnoLiqEmis() != null && this.getCemAnoLiqEmis().longValue() == -999) {
            conditions += " AND CEM_ANO_LIQ_EMIS IS NULL";
        } else if (this.getCemAnoLiqEmis() != null) {
            conditions += " AND CEM_ANO_LIQ_EMIS = ?";
            values.add(this.getCemAnoLiqEmis());
        }

        if (this.getCemMesLiqEmis() != null && this.getCemMesLiqEmis().longValue() == -999) {
            conditions += " AND CEM_MES_LIQ_EMIS IS NULL";
        } else if (this.getCemMesLiqEmis() != null) {
            conditions += " AND CEM_MES_LIQ_EMIS = ?";
            values.add(this.getCemMesLiqEmis());
        }

        if (this.getCemDiaLiqEmis() != null && this.getCemDiaLiqEmis().longValue() == -999) {
            conditions += " AND CEM_DIA_LIQ_EMIS IS NULL";
        } else if (this.getCemDiaLiqEmis() != null) {
            conditions += " AND CEM_DIA_LIQ_EMIS = ?";
            values.add(this.getCemDiaLiqEmis());
        }

        if (this.getCemClaveValor() != null && "null".equals(this.getCemClaveValor())) {
            conditions += " AND CEM_CLAVE_VALOR IS NULL";
        } else if (this.getCemClaveValor() != null) {
            conditions += " AND CEM_CLAVE_VALOR = ?";
            values.add(this.getCemClaveValor());
        }

        if (this.getCemCveTipoMerca() != null && this.getCemCveTipoMerca().longValue() == -999) {
            conditions += " AND CEM_CVE_TIPO_MERCA IS NULL";
        } else if (this.getCemCveTipoMerca() != null) {
            conditions += " AND CEM_CVE_TIPO_MERCA = ?";
            values.add(this.getCemCveTipoMerca());
        }

        if (this.getCemNumInstrum() != null && this.getCemNumInstrum().longValue() == -999) {
            conditions += " AND CEM_NUM_INSTRUM IS NULL";
        } else if (this.getCemNumInstrum() != null) {
            conditions += " AND CEM_NUM_INSTRUM = ?";
            values.add(this.getCemNumInstrum());
        }

        if (this.getCemPjeTasaPago() != null && this.getCemPjeTasaPago().longValue() == -999) {
            conditions += " AND CEM_PJE_TASA_PAGO IS NULL";
        } else if (this.getCemPjeTasaPago() != null) {
            conditions += " AND CEM_PJE_TASA_PAGO = ?";
            values.add(this.getCemPjeTasaPago());
        }

        if (this.getCemPjeTasaAjust() != null && this.getCemPjeTasaAjust().longValue() == -999) {
            conditions += " AND CEM_PJE_TASA_AJUST IS NULL";
        } else if (this.getCemPjeTasaAjust() != null) {
            conditions += " AND CEM_PJE_TASA_AJUST = ?";
            values.add(this.getCemPjeTasaAjust());
        }

        if (this.getCemAnoLiqAnt() != null && this.getCemAnoLiqAnt().longValue() == -999) {
            conditions += " AND CEM_ANO_LIQ_ANT IS NULL";
        } else if (this.getCemAnoLiqAnt() != null) {
            conditions += " AND CEM_ANO_LIQ_ANT = ?";
            values.add(this.getCemAnoLiqAnt());
        }

        if (this.getCemMesLiqAnt() != null && this.getCemMesLiqAnt().longValue() == -999) {
            conditions += " AND CEM_MES_LIQ_ANT IS NULL";
        } else if (this.getCemMesLiqAnt() != null) {
            conditions += " AND CEM_MES_LIQ_ANT = ?";
            values.add(this.getCemMesLiqAnt());
        }

        if (this.getCemDiaLiqAnt() != null && this.getCemDiaLiqAnt().longValue() == -999) {
            conditions += " AND CEM_DIA_LIQ_ANT IS NULL";
        } else if (this.getCemDiaLiqAnt() != null) {
            conditions += " AND CEM_DIA_LIQ_ANT = ?";
            values.add(this.getCemDiaLiqAnt());
        }

        if (this.getCemAnoAltaReg() != null && this.getCemAnoAltaReg().longValue() == -999) {
            conditions += " AND CEM_ANO_ALTA_REG IS NULL";
        } else if (this.getCemAnoAltaReg() != null) {
            conditions += " AND CEM_ANO_ALTA_REG = ?";
            values.add(this.getCemAnoAltaReg());
        }

        if (this.getCemMesAltaReg() != null && this.getCemMesAltaReg().longValue() == -999) {
            conditions += " AND CEM_MES_ALTA_REG IS NULL";
        } else if (this.getCemMesAltaReg() != null) {
            conditions += " AND CEM_MES_ALTA_REG = ?";
            values.add(this.getCemMesAltaReg());
        }

        if (this.getCemDiaAltaReg() != null && this.getCemDiaAltaReg().longValue() == -999) {
            conditions += " AND CEM_DIA_ALTA_REG IS NULL";
        } else if (this.getCemDiaAltaReg() != null) {
            conditions += " AND CEM_DIA_ALTA_REG = ?";
            values.add(this.getCemDiaAltaReg());
        }

        if (this.getCemAnoUltMod() != null && this.getCemAnoUltMod().longValue() == -999) {
            conditions += " AND CEM_ANO_ULT_MOD IS NULL";
        } else if (this.getCemAnoUltMod() != null) {
            conditions += " AND CEM_ANO_ULT_MOD = ?";
            values.add(this.getCemAnoUltMod());
        }

        if (this.getCemMesUltMod() != null && this.getCemMesUltMod().longValue() == -999) {
            conditions += " AND CEM_MES_ULT_MOD IS NULL";
        } else if (this.getCemMesUltMod() != null) {
            conditions += " AND CEM_MES_ULT_MOD = ?";
            values.add(this.getCemMesUltMod());
        }

        if (this.getCemDiaUltMod() != null && this.getCemDiaUltMod().longValue() == -999) {
            conditions += " AND CEM_DIA_ULT_MOD IS NULL";
        } else if (this.getCemDiaUltMod() != null) {
            conditions += " AND CEM_DIA_ULT_MOD = ?";
            values.add(this.getCemDiaUltMod());
        }

        if (this.getCemCveStCalpaem() != null && "null".equals(this.getCemCveStCalpaem())) {
            conditions += " AND CEM_CVE_ST_CALPAEM IS NULL";
        } else if (this.getCemCveStCalpaem() != null) {
            conditions += " AND CEM_CVE_ST_CALPAEM = ?";
            values.add(this.getCemCveStCalpaem());
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
        String sql = "UPDATE CALPAEMI SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND CEM_NOM_PIZARRA = ?";
        pkValues.add(this.getCemNomPizarra());
        conditions += " AND CEM_NUM_SER_EMIS = ?";
        pkValues.add(this.getCemNumSerEmis());
        conditions += " AND CEM_NUM_CUPON_VIG = ?";
        pkValues.add(this.getCemNumCuponVig());
        conditions += " AND CEM_ANO_LIQ_EMIS = ?";
        pkValues.add(this.getCemAnoLiqEmis());
        conditions += " AND CEM_MES_LIQ_EMIS = ?";
        pkValues.add(this.getCemMesLiqEmis());
        conditions += " AND CEM_DIA_LIQ_EMIS = ?";
        pkValues.add(this.getCemDiaLiqEmis());
        fields += " CEM_CLAVE_VALOR = ?, ";
        values.add(this.getCemClaveValor());
        fields += " CEM_CVE_TIPO_MERCA = ?, ";
        values.add(this.getCemCveTipoMerca());
        fields += " CEM_NUM_INSTRUM = ?, ";
        values.add(this.getCemNumInstrum());
        fields += " CEM_PJE_TASA_PAGO = ?, ";
        values.add(this.getCemPjeTasaPago());
        fields += " CEM_PJE_TASA_AJUST = ?, ";
        values.add(this.getCemPjeTasaAjust());
        fields += " CEM_ANO_LIQ_ANT = ?, ";
        values.add(this.getCemAnoLiqAnt());
        fields += " CEM_MES_LIQ_ANT = ?, ";
        values.add(this.getCemMesLiqAnt());
        fields += " CEM_DIA_LIQ_ANT = ?, ";
        values.add(this.getCemDiaLiqAnt());
        fields += " CEM_ANO_ALTA_REG = ?, ";
        values.add(this.getCemAnoAltaReg());
        fields += " CEM_MES_ALTA_REG = ?, ";
        values.add(this.getCemMesAltaReg());
        fields += " CEM_DIA_ALTA_REG = ?, ";
        values.add(this.getCemDiaAltaReg());
        fields += " CEM_ANO_ULT_MOD = ?, ";
        values.add(this.getCemAnoUltMod());
        fields += " CEM_MES_ULT_MOD = ?, ";
        values.add(this.getCemMesUltMod());
        fields += " CEM_DIA_ULT_MOD = ?, ";
        values.add(this.getCemDiaUltMod());
        fields += " CEM_CVE_ST_CALPAEM = ?, ";
        values.add(this.getCemCveStCalpaem());
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
        String sql = "INSERT INTO CALPAEMI ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", CEM_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getCemNomPizarra());

        fields += ", CEM_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getCemNumSerEmis());

        fields += ", CEM_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getCemNumCuponVig());

        fields += ", CEM_ANO_LIQ_EMIS";
        fieldValues += ", ?";
        values.add(this.getCemAnoLiqEmis());

        fields += ", CEM_MES_LIQ_EMIS";
        fieldValues += ", ?";
        values.add(this.getCemMesLiqEmis());

        fields += ", CEM_DIA_LIQ_EMIS";
        fieldValues += ", ?";
        values.add(this.getCemDiaLiqEmis());

        fields += ", CEM_CLAVE_VALOR";
        fieldValues += ", ?";
        values.add(this.getCemClaveValor());

        fields += ", CEM_CVE_TIPO_MERCA";
        fieldValues += ", ?";
        values.add(this.getCemCveTipoMerca());

        fields += ", CEM_NUM_INSTRUM";
        fieldValues += ", ?";
        values.add(this.getCemNumInstrum());

        fields += ", CEM_PJE_TASA_PAGO";
        fieldValues += ", ?";
        values.add(this.getCemPjeTasaPago());

        fields += ", CEM_PJE_TASA_AJUST";
        fieldValues += ", ?";
        values.add(this.getCemPjeTasaAjust());

        fields += ", CEM_ANO_LIQ_ANT";
        fieldValues += ", ?";
        values.add(this.getCemAnoLiqAnt());

        fields += ", CEM_MES_LIQ_ANT";
        fieldValues += ", ?";
        values.add(this.getCemMesLiqAnt());

        fields += ", CEM_DIA_LIQ_ANT";
        fieldValues += ", ?";
        values.add(this.getCemDiaLiqAnt());

        fields += ", CEM_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCemAnoAltaReg());

        fields += ", CEM_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCemMesAltaReg());

        fields += ", CEM_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getCemDiaAltaReg());

        fields += ", CEM_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCemAnoUltMod());

        fields += ", CEM_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCemMesUltMod());

        fields += ", CEM_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getCemDiaUltMod());

        fields += ", CEM_CVE_ST_CALPAEM";
        fieldValues += ", ?";
        values.add(this.getCemCveStCalpaem());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM CALPAEMI WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND CEM_NOM_PIZARRA = ?";
        values.add(this.getCemNomPizarra());
        conditions += " AND CEM_NUM_SER_EMIS = ?";
        values.add(this.getCemNumSerEmis());
        conditions += " AND CEM_NUM_CUPON_VIG = ?";
        values.add(this.getCemNumCuponVig());
        conditions += " AND CEM_ANO_LIQ_EMIS = ?";
        values.add(this.getCemAnoLiqEmis());
        conditions += " AND CEM_MES_LIQ_EMIS = ?";
        values.add(this.getCemMesLiqEmis());
        conditions += " AND CEM_DIA_LIQ_EMIS = ?";
        values.add(this.getCemDiaLiqEmis());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Calpaemi instance = (Calpaemi) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getCemNomPizarra().equals(instance.getCemNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getCemNumSerEmis().equals(instance.getCemNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCemNumCuponVig().equals(instance.getCemNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getCemAnoLiqEmis().equals(instance.getCemAnoLiqEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCemMesLiqEmis().equals(instance.getCemMesLiqEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCemDiaLiqEmis().equals(instance.getCemDiaLiqEmis()))
            equalObjects = false;
        if (equalObjects && !this.getCemClaveValor().equals(instance.getCemClaveValor()))
            equalObjects = false;
        if (equalObjects && !this.getCemCveTipoMerca().equals(instance.getCemCveTipoMerca()))
            equalObjects = false;
        if (equalObjects && !this.getCemNumInstrum().equals(instance.getCemNumInstrum()))
            equalObjects = false;
        if (equalObjects && !this.getCemPjeTasaPago().equals(instance.getCemPjeTasaPago()))
            equalObjects = false;
        if (equalObjects && !this.getCemPjeTasaAjust().equals(instance.getCemPjeTasaAjust()))
            equalObjects = false;
        if (equalObjects && !this.getCemAnoLiqAnt().equals(instance.getCemAnoLiqAnt()))
            equalObjects = false;
        if (equalObjects && !this.getCemMesLiqAnt().equals(instance.getCemMesLiqAnt()))
            equalObjects = false;
        if (equalObjects && !this.getCemDiaLiqAnt().equals(instance.getCemDiaLiqAnt()))
            equalObjects = false;
        if (equalObjects && !this.getCemAnoAltaReg().equals(instance.getCemAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCemMesAltaReg().equals(instance.getCemMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCemDiaAltaReg().equals(instance.getCemDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getCemAnoUltMod().equals(instance.getCemAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCemMesUltMod().equals(instance.getCemMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCemDiaUltMod().equals(instance.getCemDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getCemCveStCalpaem().equals(instance.getCemCveStCalpaem()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Calpaemi result = new Calpaemi();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setCemNomPizarra((String) objectData.getData("CEM_NOM_PIZARRA"));
        result.setCemNumSerEmis((String) objectData.getData("CEM_NUM_SER_EMIS"));
        result.setCemNumCuponVig((String) objectData.getData("CEM_NUM_CUPON_VIG"));
        result.setCemAnoLiqEmis((BigDecimal) objectData.getData("CEM_ANO_LIQ_EMIS"));
        result.setCemMesLiqEmis((BigDecimal) objectData.getData("CEM_MES_LIQ_EMIS"));
        result.setCemDiaLiqEmis((BigDecimal) objectData.getData("CEM_DIA_LIQ_EMIS"));
        result.setCemClaveValor((String) objectData.getData("CEM_CLAVE_VALOR"));
        result.setCemCveTipoMerca((BigDecimal) objectData.getData("CEM_CVE_TIPO_MERCA"));
        result.setCemNumInstrum((BigDecimal) objectData.getData("CEM_NUM_INSTRUM"));
        result.setCemPjeTasaPago((BigDecimal) objectData.getData("CEM_PJE_TASA_PAGO"));
        result.setCemPjeTasaAjust((BigDecimal) objectData.getData("CEM_PJE_TASA_AJUST"));
        result.setCemAnoLiqAnt((BigDecimal) objectData.getData("CEM_ANO_LIQ_ANT"));
        result.setCemMesLiqAnt((BigDecimal) objectData.getData("CEM_MES_LIQ_ANT"));
        result.setCemDiaLiqAnt((BigDecimal) objectData.getData("CEM_DIA_LIQ_ANT"));
        result.setCemAnoAltaReg((BigDecimal) objectData.getData("CEM_ANO_ALTA_REG"));
        result.setCemMesAltaReg((BigDecimal) objectData.getData("CEM_MES_ALTA_REG"));
        result.setCemDiaAltaReg((BigDecimal) objectData.getData("CEM_DIA_ALTA_REG"));
        result.setCemAnoUltMod((BigDecimal) objectData.getData("CEM_ANO_ULT_MOD"));
        result.setCemMesUltMod((BigDecimal) objectData.getData("CEM_MES_ULT_MOD"));
        result.setCemDiaUltMod((BigDecimal) objectData.getData("CEM_DIA_ULT_MOD"));
        result.setCemCveStCalpaem((String) objectData.getData("CEM_CVE_ST_CALPAEM"));

        return result;

    }

}
