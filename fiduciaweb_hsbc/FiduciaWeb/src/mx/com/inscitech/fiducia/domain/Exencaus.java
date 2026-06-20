package mx.com.inscitech.fiducia.domain;

import java.math.BigDecimal;

import java.util.ArrayList;

import mx.com.inscitech.fiducia.domain.base.DomainObject;
import mx.com.inscitech.fiducia.domain.base.FieldInfo;
import mx.com.inscitech.fiducia.domain.base.PrimaryKey;
import mx.com.inscitech.fiducia.domain.base.Reference;
import mx.com.inscitech.fiducia.domain.base.DMLObject;

import mx.com.inscitech.fiducia.dml.vo.DataRow;

@PrimaryKey(constraintName = "EXENCAUS_PK", columns = { "EXC_NUM_CONTRATO", "EXC_SUB_CONTRATO", "EXC_NOM_PIZARRA", "EXC_NUM_SER_EMIS", "EXC_NUM_CUPON_VIG" },
            sequences = { "MANUAL" })
public class Exencaus extends DomainObject {

    BigDecimal excNumContrato = null;
    BigDecimal excSubContrato = null;
    String excNomPizarra = null;
    String excNumSerEmis = null;
    BigDecimal excNumCuponVig = null;
    BigDecimal excNumPosicion = null;
    BigDecimal excImpDividendo = null;
    BigDecimal excImpImpuesto = null;
    BigDecimal excImpComision = null;
    BigDecimal excImpLiquido = null;
    String excCausaExcento = null;
    BigDecimal excAnoCalculo = null;
    BigDecimal excMesCalculo = null;
    BigDecimal excDiaCalculo = null;
    BigDecimal excAnoAltaReg = null;
    BigDecimal excMesAltaReg = null;
    BigDecimal excDiaAltaReg = null;
    BigDecimal excAnoUltMod = null;
    BigDecimal excMesUltMod = null;
    BigDecimal excDiaUltMod = null;
    String excCveStCtobloq = null;
    String excCveStExencau = null;

    public Exencaus() {
        super();
        this.pkColumns = 5;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExcNumContrato(BigDecimal excNumContrato) {
        this.excNumContrato = excNumContrato;
    }

    public BigDecimal getExcNumContrato() {
        return this.excNumContrato;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExcSubContrato(BigDecimal excSubContrato) {
        this.excSubContrato = excSubContrato;
    }

    public BigDecimal getExcSubContrato() {
        return this.excSubContrato;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExcNomPizarra(String excNomPizarra) {
        this.excNomPizarra = excNomPizarra;
    }

    public String getExcNomPizarra() {
        return this.excNomPizarra;
    }

    @FieldInfo(nullable = false, dataType = "VARCHAR2", javaClass = String.class)
    public void setExcNumSerEmis(String excNumSerEmis) {
        this.excNumSerEmis = excNumSerEmis;
    }

    public String getExcNumSerEmis() {
        return this.excNumSerEmis;
    }

    @FieldInfo(nullable = false, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExcNumCuponVig(BigDecimal excNumCuponVig) {
        this.excNumCuponVig = excNumCuponVig;
    }

    public BigDecimal getExcNumCuponVig() {
        return this.excNumCuponVig;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExcNumPosicion(BigDecimal excNumPosicion) {
        this.excNumPosicion = excNumPosicion;
    }

    public BigDecimal getExcNumPosicion() {
        return this.excNumPosicion;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExcImpDividendo(BigDecimal excImpDividendo) {
        this.excImpDividendo = excImpDividendo;
    }

    public BigDecimal getExcImpDividendo() {
        return this.excImpDividendo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExcImpImpuesto(BigDecimal excImpImpuesto) {
        this.excImpImpuesto = excImpImpuesto;
    }

    public BigDecimal getExcImpImpuesto() {
        return this.excImpImpuesto;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExcImpComision(BigDecimal excImpComision) {
        this.excImpComision = excImpComision;
    }

    public BigDecimal getExcImpComision() {
        return this.excImpComision;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 10, scale = 0, javaClass = BigDecimal.class)
    public void setExcImpLiquido(BigDecimal excImpLiquido) {
        this.excImpLiquido = excImpLiquido;
    }

    public BigDecimal getExcImpLiquido() {
        return this.excImpLiquido;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExcCausaExcento(String excCausaExcento) {
        this.excCausaExcento = excCausaExcento;
    }

    public String getExcCausaExcento() {
        return this.excCausaExcento;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExcAnoCalculo(BigDecimal excAnoCalculo) {
        this.excAnoCalculo = excAnoCalculo;
    }

    public BigDecimal getExcAnoCalculo() {
        return this.excAnoCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExcMesCalculo(BigDecimal excMesCalculo) {
        this.excMesCalculo = excMesCalculo;
    }

    public BigDecimal getExcMesCalculo() {
        return this.excMesCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExcDiaCalculo(BigDecimal excDiaCalculo) {
        this.excDiaCalculo = excDiaCalculo;
    }

    public BigDecimal getExcDiaCalculo() {
        return this.excDiaCalculo;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExcAnoAltaReg(BigDecimal excAnoAltaReg) {
        this.excAnoAltaReg = excAnoAltaReg;
    }

    public BigDecimal getExcAnoAltaReg() {
        return this.excAnoAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExcMesAltaReg(BigDecimal excMesAltaReg) {
        this.excMesAltaReg = excMesAltaReg;
    }

    public BigDecimal getExcMesAltaReg() {
        return this.excMesAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExcDiaAltaReg(BigDecimal excDiaAltaReg) {
        this.excDiaAltaReg = excDiaAltaReg;
    }

    public BigDecimal getExcDiaAltaReg() {
        return this.excDiaAltaReg;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 4, scale = 0, javaClass = BigDecimal.class)
    public void setExcAnoUltMod(BigDecimal excAnoUltMod) {
        this.excAnoUltMod = excAnoUltMod;
    }

    public BigDecimal getExcAnoUltMod() {
        return this.excAnoUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExcMesUltMod(BigDecimal excMesUltMod) {
        this.excMesUltMod = excMesUltMod;
    }

    public BigDecimal getExcMesUltMod() {
        return this.excMesUltMod;
    }

    @FieldInfo(nullable = true, dataType = "NUMBER", precision = 2, scale = 0, javaClass = BigDecimal.class)
    public void setExcDiaUltMod(BigDecimal excDiaUltMod) {
        this.excDiaUltMod = excDiaUltMod;
    }

    public BigDecimal getExcDiaUltMod() {
        return this.excDiaUltMod;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExcCveStCtobloq(String excCveStCtobloq) {
        this.excCveStCtobloq = excCveStCtobloq;
    }

    public String getExcCveStCtobloq() {
        return this.excCveStCtobloq;
    }

    @FieldInfo(nullable = true, dataType = "VARCHAR2", javaClass = String.class)
    public void setExcCveStExencau(String excCveStExencau) {
        this.excCveStExencau = excCveStExencau;
    }

    public String getExcCveStExencau() {
        return this.excCveStExencau;
    }

    public DMLObject getSelectByPK() {
        DMLObject result = new DMLObject();
        String sql = "SELECT * FROM EXENCAUS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getExcNumContrato() != null && this.getExcNumContrato().longValue() == -999) {
            conditions += " AND EXC_NUM_CONTRATO IS NULL";
        } else if (this.getExcNumContrato() != null) {
            conditions += " AND EXC_NUM_CONTRATO = ?";
            values.add(this.getExcNumContrato());
        }

        if (this.getExcSubContrato() != null && this.getExcSubContrato().longValue() == -999) {
            conditions += " AND EXC_SUB_CONTRATO IS NULL";
        } else if (this.getExcSubContrato() != null) {
            conditions += " AND EXC_SUB_CONTRATO = ?";
            values.add(this.getExcSubContrato());
        }

        if (this.getExcNomPizarra() != null && "null".equals(this.getExcNomPizarra())) {
            conditions += " AND EXC_NOM_PIZARRA IS NULL";
        } else if (this.getExcNomPizarra() != null) {
            conditions += " AND EXC_NOM_PIZARRA = ?";
            values.add(this.getExcNomPizarra());
        }

        if (this.getExcNumSerEmis() != null && "null".equals(this.getExcNumSerEmis())) {
            conditions += " AND EXC_NUM_SER_EMIS IS NULL";
        } else if (this.getExcNumSerEmis() != null) {
            conditions += " AND EXC_NUM_SER_EMIS = ?";
            values.add(this.getExcNumSerEmis());
        }

        if (this.getExcNumCuponVig() != null && this.getExcNumCuponVig().longValue() == -999) {
            conditions += " AND EXC_NUM_CUPON_VIG IS NULL";
        } else if (this.getExcNumCuponVig() != null) {
            conditions += " AND EXC_NUM_CUPON_VIG = ?";
            values.add(this.getExcNumCuponVig());
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
        String sql = "SELECT * FROM EXENCAUS ";

        String conditions = "";
        ArrayList values = new ArrayList();

        if (this.getExcNumContrato() != null && this.getExcNumContrato().longValue() == -999) {
            conditions += " AND EXC_NUM_CONTRATO IS NULL";
        } else if (this.getExcNumContrato() != null) {
            conditions += " AND EXC_NUM_CONTRATO = ?";
            values.add(this.getExcNumContrato());
        }

        if (this.getExcSubContrato() != null && this.getExcSubContrato().longValue() == -999) {
            conditions += " AND EXC_SUB_CONTRATO IS NULL";
        } else if (this.getExcSubContrato() != null) {
            conditions += " AND EXC_SUB_CONTRATO = ?";
            values.add(this.getExcSubContrato());
        }

        if (this.getExcNomPizarra() != null && "null".equals(this.getExcNomPizarra())) {
            conditions += " AND EXC_NOM_PIZARRA IS NULL";
        } else if (this.getExcNomPizarra() != null) {
            conditions += " AND EXC_NOM_PIZARRA = ?";
            values.add(this.getExcNomPizarra());
        }

        if (this.getExcNumSerEmis() != null && "null".equals(this.getExcNumSerEmis())) {
            conditions += " AND EXC_NUM_SER_EMIS IS NULL";
        } else if (this.getExcNumSerEmis() != null) {
            conditions += " AND EXC_NUM_SER_EMIS = ?";
            values.add(this.getExcNumSerEmis());
        }

        if (this.getExcNumCuponVig() != null && this.getExcNumCuponVig().longValue() == -999) {
            conditions += " AND EXC_NUM_CUPON_VIG IS NULL";
        } else if (this.getExcNumCuponVig() != null) {
            conditions += " AND EXC_NUM_CUPON_VIG = ?";
            values.add(this.getExcNumCuponVig());
        }

        if (this.getExcNumPosicion() != null && this.getExcNumPosicion().longValue() == -999) {
            conditions += " AND EXC_NUM_POSICION IS NULL";
        } else if (this.getExcNumPosicion() != null) {
            conditions += " AND EXC_NUM_POSICION = ?";
            values.add(this.getExcNumPosicion());
        }

        if (this.getExcImpDividendo() != null && this.getExcImpDividendo().longValue() == -999) {
            conditions += " AND EXC_IMP_DIVIDENDO IS NULL";
        } else if (this.getExcImpDividendo() != null) {
            conditions += " AND EXC_IMP_DIVIDENDO = ?";
            values.add(this.getExcImpDividendo());
        }

        if (this.getExcImpImpuesto() != null && this.getExcImpImpuesto().longValue() == -999) {
            conditions += " AND EXC_IMP_IMPUESTO IS NULL";
        } else if (this.getExcImpImpuesto() != null) {
            conditions += " AND EXC_IMP_IMPUESTO = ?";
            values.add(this.getExcImpImpuesto());
        }

        if (this.getExcImpComision() != null && this.getExcImpComision().longValue() == -999) {
            conditions += " AND EXC_IMP_COMISION IS NULL";
        } else if (this.getExcImpComision() != null) {
            conditions += " AND EXC_IMP_COMISION = ?";
            values.add(this.getExcImpComision());
        }

        if (this.getExcImpLiquido() != null && this.getExcImpLiquido().longValue() == -999) {
            conditions += " AND EXC_IMP_LIQUIDO IS NULL";
        } else if (this.getExcImpLiquido() != null) {
            conditions += " AND EXC_IMP_LIQUIDO = ?";
            values.add(this.getExcImpLiquido());
        }

        if (this.getExcCausaExcento() != null && "null".equals(this.getExcCausaExcento())) {
            conditions += " AND EXC_CAUSA_EXCENTO IS NULL";
        } else if (this.getExcCausaExcento() != null) {
            conditions += " AND EXC_CAUSA_EXCENTO = ?";
            values.add(this.getExcCausaExcento());
        }

        if (this.getExcAnoCalculo() != null && this.getExcAnoCalculo().longValue() == -999) {
            conditions += " AND EXC_ANO_CALCULO IS NULL";
        } else if (this.getExcAnoCalculo() != null) {
            conditions += " AND EXC_ANO_CALCULO = ?";
            values.add(this.getExcAnoCalculo());
        }

        if (this.getExcMesCalculo() != null && this.getExcMesCalculo().longValue() == -999) {
            conditions += " AND EXC_MES_CALCULO IS NULL";
        } else if (this.getExcMesCalculo() != null) {
            conditions += " AND EXC_MES_CALCULO = ?";
            values.add(this.getExcMesCalculo());
        }

        if (this.getExcDiaCalculo() != null && this.getExcDiaCalculo().longValue() == -999) {
            conditions += " AND EXC_DIA_CALCULO IS NULL";
        } else if (this.getExcDiaCalculo() != null) {
            conditions += " AND EXC_DIA_CALCULO = ?";
            values.add(this.getExcDiaCalculo());
        }

        if (this.getExcAnoAltaReg() != null && this.getExcAnoAltaReg().longValue() == -999) {
            conditions += " AND EXC_ANO_ALTA_REG IS NULL";
        } else if (this.getExcAnoAltaReg() != null) {
            conditions += " AND EXC_ANO_ALTA_REG = ?";
            values.add(this.getExcAnoAltaReg());
        }

        if (this.getExcMesAltaReg() != null && this.getExcMesAltaReg().longValue() == -999) {
            conditions += " AND EXC_MES_ALTA_REG IS NULL";
        } else if (this.getExcMesAltaReg() != null) {
            conditions += " AND EXC_MES_ALTA_REG = ?";
            values.add(this.getExcMesAltaReg());
        }

        if (this.getExcDiaAltaReg() != null && this.getExcDiaAltaReg().longValue() == -999) {
            conditions += " AND EXC_DIA_ALTA_REG IS NULL";
        } else if (this.getExcDiaAltaReg() != null) {
            conditions += " AND EXC_DIA_ALTA_REG = ?";
            values.add(this.getExcDiaAltaReg());
        }

        if (this.getExcAnoUltMod() != null && this.getExcAnoUltMod().longValue() == -999) {
            conditions += " AND EXC_ANO_ULT_MOD IS NULL";
        } else if (this.getExcAnoUltMod() != null) {
            conditions += " AND EXC_ANO_ULT_MOD = ?";
            values.add(this.getExcAnoUltMod());
        }

        if (this.getExcMesUltMod() != null && this.getExcMesUltMod().longValue() == -999) {
            conditions += " AND EXC_MES_ULT_MOD IS NULL";
        } else if (this.getExcMesUltMod() != null) {
            conditions += " AND EXC_MES_ULT_MOD = ?";
            values.add(this.getExcMesUltMod());
        }

        if (this.getExcDiaUltMod() != null && this.getExcDiaUltMod().longValue() == -999) {
            conditions += " AND EXC_DIA_ULT_MOD IS NULL";
        } else if (this.getExcDiaUltMod() != null) {
            conditions += " AND EXC_DIA_ULT_MOD = ?";
            values.add(this.getExcDiaUltMod());
        }

        if (this.getExcCveStCtobloq() != null && "null".equals(this.getExcCveStCtobloq())) {
            conditions += " AND EXC_CVE_ST_CTOBLOQ IS NULL";
        } else if (this.getExcCveStCtobloq() != null) {
            conditions += " AND EXC_CVE_ST_CTOBLOQ = ?";
            values.add(this.getExcCveStCtobloq());
        }

        if (this.getExcCveStExencau() != null && "null".equals(this.getExcCveStExencau())) {
            conditions += " AND EXC_CVE_ST_EXENCAU IS NULL";
        } else if (this.getExcCveStExencau() != null) {
            conditions += " AND EXC_CVE_ST_EXENCAU = ?";
            values.add(this.getExcCveStExencau());
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
        String sql = "UPDATE EXENCAUS SET ";

        String fields = "";
        String conditions = "";
        ArrayList pkValues = new ArrayList();
        ArrayList values = new ArrayList();

        conditions += " AND EXC_NUM_CONTRATO = ?";
        pkValues.add(this.getExcNumContrato());
        conditions += " AND EXC_SUB_CONTRATO = ?";
        pkValues.add(this.getExcSubContrato());
        conditions += " AND EXC_NOM_PIZARRA = ?";
        pkValues.add(this.getExcNomPizarra());
        conditions += " AND EXC_NUM_SER_EMIS = ?";
        pkValues.add(this.getExcNumSerEmis());
        conditions += " AND EXC_NUM_CUPON_VIG = ?";
        pkValues.add(this.getExcNumCuponVig());
        fields += " EXC_NUM_POSICION = ?, ";
        values.add(this.getExcNumPosicion());
        fields += " EXC_IMP_DIVIDENDO = ?, ";
        values.add(this.getExcImpDividendo());
        fields += " EXC_IMP_IMPUESTO = ?, ";
        values.add(this.getExcImpImpuesto());
        fields += " EXC_IMP_COMISION = ?, ";
        values.add(this.getExcImpComision());
        fields += " EXC_IMP_LIQUIDO = ?, ";
        values.add(this.getExcImpLiquido());
        fields += " EXC_CAUSA_EXCENTO = ?, ";
        values.add(this.getExcCausaExcento());
        fields += " EXC_ANO_CALCULO = ?, ";
        values.add(this.getExcAnoCalculo());
        fields += " EXC_MES_CALCULO = ?, ";
        values.add(this.getExcMesCalculo());
        fields += " EXC_DIA_CALCULO = ?, ";
        values.add(this.getExcDiaCalculo());
        fields += " EXC_ANO_ALTA_REG = ?, ";
        values.add(this.getExcAnoAltaReg());
        fields += " EXC_MES_ALTA_REG = ?, ";
        values.add(this.getExcMesAltaReg());
        fields += " EXC_DIA_ALTA_REG = ?, ";
        values.add(this.getExcDiaAltaReg());
        fields += " EXC_ANO_ULT_MOD = ?, ";
        values.add(this.getExcAnoUltMod());
        fields += " EXC_MES_ULT_MOD = ?, ";
        values.add(this.getExcMesUltMod());
        fields += " EXC_DIA_ULT_MOD = ?, ";
        values.add(this.getExcDiaUltMod());
        fields += " EXC_CVE_ST_CTOBLOQ = ?, ";
        values.add(this.getExcCveStCtobloq());
        fields += " EXC_CVE_ST_EXENCAU = ?, ";
        values.add(this.getExcCveStExencau());
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
        String sql = "INSERT INTO EXENCAUS ( ";

        String fields = "";
        String fieldValues = "";
        ArrayList values = new ArrayList();

        fields += ", EXC_NUM_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getExcNumContrato());

        fields += ", EXC_SUB_CONTRATO";
        fieldValues += ", ?";
        values.add(this.getExcSubContrato());

        fields += ", EXC_NOM_PIZARRA";
        fieldValues += ", ?";
        values.add(this.getExcNomPizarra());

        fields += ", EXC_NUM_SER_EMIS";
        fieldValues += ", ?";
        values.add(this.getExcNumSerEmis());

        fields += ", EXC_NUM_CUPON_VIG";
        fieldValues += ", ?";
        values.add(this.getExcNumCuponVig());

        fields += ", EXC_NUM_POSICION";
        fieldValues += ", ?";
        values.add(this.getExcNumPosicion());

        fields += ", EXC_IMP_DIVIDENDO";
        fieldValues += ", ?";
        values.add(this.getExcImpDividendo());

        fields += ", EXC_IMP_IMPUESTO";
        fieldValues += ", ?";
        values.add(this.getExcImpImpuesto());

        fields += ", EXC_IMP_COMISION";
        fieldValues += ", ?";
        values.add(this.getExcImpComision());

        fields += ", EXC_IMP_LIQUIDO";
        fieldValues += ", ?";
        values.add(this.getExcImpLiquido());

        fields += ", EXC_CAUSA_EXCENTO";
        fieldValues += ", ?";
        values.add(this.getExcCausaExcento());

        fields += ", EXC_ANO_CALCULO";
        fieldValues += ", ?";
        values.add(this.getExcAnoCalculo());

        fields += ", EXC_MES_CALCULO";
        fieldValues += ", ?";
        values.add(this.getExcMesCalculo());

        fields += ", EXC_DIA_CALCULO";
        fieldValues += ", ?";
        values.add(this.getExcDiaCalculo());

        fields += ", EXC_ANO_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExcAnoAltaReg());

        fields += ", EXC_MES_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExcMesAltaReg());

        fields += ", EXC_DIA_ALTA_REG";
        fieldValues += ", ?";
        values.add(this.getExcDiaAltaReg());

        fields += ", EXC_ANO_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExcAnoUltMod());

        fields += ", EXC_MES_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExcMesUltMod());

        fields += ", EXC_DIA_ULT_MOD";
        fieldValues += ", ?";
        values.add(this.getExcDiaUltMod());

        fields += ", EXC_CVE_ST_CTOBLOQ";
        fieldValues += ", ?";
        values.add(this.getExcCveStCtobloq());

        fields += ", EXC_CVE_ST_EXENCAU";
        fieldValues += ", ?";
        values.add(this.getExcCveStExencau());

        fields = fields.substring(1).trim();
        fieldValues = fieldValues.substring(1).trim();

        sql += fields + " ) VALUES (" + fieldValues + ")";

        result.setSql(sql);
        result.setParameters(values.toArray());

        return result;
    }

    public DMLObject getDelete() {
        DMLObject result = new DMLObject();
        String sql = "DELETE FROM EXENCAUS WHERE ";

        String conditions = "";
        ArrayList values = new ArrayList();

        conditions += " AND EXC_NUM_CONTRATO = ?";
        values.add(this.getExcNumContrato());
        conditions += " AND EXC_SUB_CONTRATO = ?";
        values.add(this.getExcSubContrato());
        conditions += " AND EXC_NOM_PIZARRA = ?";
        values.add(this.getExcNomPizarra());
        conditions += " AND EXC_NUM_SER_EMIS = ?";
        values.add(this.getExcNumSerEmis());
        conditions += " AND EXC_NUM_CUPON_VIG = ?";
        values.add(this.getExcNumCuponVig());
        conditions = conditions.substring(4).trim();
        result.setSql(sql + conditions);
        result.setParameters(values.toArray());
        return result;

    }

    public boolean validate() {
        return true;
    }

    public boolean doCompare(Object compareWith) {
        Exencaus instance = (Exencaus) compareWith;
        boolean equalObjects = true;
        if (equalObjects && !this.getExcNumContrato().equals(instance.getExcNumContrato()))
            equalObjects = false;
        if (equalObjects && !this.getExcSubContrato().equals(instance.getExcSubContrato()))
            equalObjects = false;
        if (equalObjects && !this.getExcNomPizarra().equals(instance.getExcNomPizarra()))
            equalObjects = false;
        if (equalObjects && !this.getExcNumSerEmis().equals(instance.getExcNumSerEmis()))
            equalObjects = false;
        if (equalObjects && !this.getExcNumCuponVig().equals(instance.getExcNumCuponVig()))
            equalObjects = false;
        if (equalObjects && !this.getExcNumPosicion().equals(instance.getExcNumPosicion()))
            equalObjects = false;
        if (equalObjects && !this.getExcImpDividendo().equals(instance.getExcImpDividendo()))
            equalObjects = false;
        if (equalObjects && !this.getExcImpImpuesto().equals(instance.getExcImpImpuesto()))
            equalObjects = false;
        if (equalObjects && !this.getExcImpComision().equals(instance.getExcImpComision()))
            equalObjects = false;
        if (equalObjects && !this.getExcImpLiquido().equals(instance.getExcImpLiquido()))
            equalObjects = false;
        if (equalObjects && !this.getExcCausaExcento().equals(instance.getExcCausaExcento()))
            equalObjects = false;
        if (equalObjects && !this.getExcAnoCalculo().equals(instance.getExcAnoCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getExcMesCalculo().equals(instance.getExcMesCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getExcDiaCalculo().equals(instance.getExcDiaCalculo()))
            equalObjects = false;
        if (equalObjects && !this.getExcAnoAltaReg().equals(instance.getExcAnoAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExcMesAltaReg().equals(instance.getExcMesAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExcDiaAltaReg().equals(instance.getExcDiaAltaReg()))
            equalObjects = false;
        if (equalObjects && !this.getExcAnoUltMod().equals(instance.getExcAnoUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExcMesUltMod().equals(instance.getExcMesUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExcDiaUltMod().equals(instance.getExcDiaUltMod()))
            equalObjects = false;
        if (equalObjects && !this.getExcCveStCtobloq().equals(instance.getExcCveStCtobloq()))
            equalObjects = false;
        if (equalObjects && !this.getExcCveStExencau().equals(instance.getExcCveStExencau()))
            equalObjects = false;
        return equalObjects;
    }

    public Object selectAsObject() {
        Exencaus result = new Exencaus();
        DataRow objectData = null;
        objectData = selectAsDataRow();

        result.setExcNumContrato((BigDecimal) objectData.getData("EXC_NUM_CONTRATO"));
        result.setExcSubContrato((BigDecimal) objectData.getData("EXC_SUB_CONTRATO"));
        result.setExcNomPizarra((String) objectData.getData("EXC_NOM_PIZARRA"));
        result.setExcNumSerEmis((String) objectData.getData("EXC_NUM_SER_EMIS"));
        result.setExcNumCuponVig((BigDecimal) objectData.getData("EXC_NUM_CUPON_VIG"));
        result.setExcNumPosicion((BigDecimal) objectData.getData("EXC_NUM_POSICION"));
        result.setExcImpDividendo((BigDecimal) objectData.getData("EXC_IMP_DIVIDENDO"));
        result.setExcImpImpuesto((BigDecimal) objectData.getData("EXC_IMP_IMPUESTO"));
        result.setExcImpComision((BigDecimal) objectData.getData("EXC_IMP_COMISION"));
        result.setExcImpLiquido((BigDecimal) objectData.getData("EXC_IMP_LIQUIDO"));
        result.setExcCausaExcento((String) objectData.getData("EXC_CAUSA_EXCENTO"));
        result.setExcAnoCalculo((BigDecimal) objectData.getData("EXC_ANO_CALCULO"));
        result.setExcMesCalculo((BigDecimal) objectData.getData("EXC_MES_CALCULO"));
        result.setExcDiaCalculo((BigDecimal) objectData.getData("EXC_DIA_CALCULO"));
        result.setExcAnoAltaReg((BigDecimal) objectData.getData("EXC_ANO_ALTA_REG"));
        result.setExcMesAltaReg((BigDecimal) objectData.getData("EXC_MES_ALTA_REG"));
        result.setExcDiaAltaReg((BigDecimal) objectData.getData("EXC_DIA_ALTA_REG"));
        result.setExcAnoUltMod((BigDecimal) objectData.getData("EXC_ANO_ULT_MOD"));
        result.setExcMesUltMod((BigDecimal) objectData.getData("EXC_MES_ULT_MOD"));
        result.setExcDiaUltMod((BigDecimal) objectData.getData("EXC_DIA_ULT_MOD"));
        result.setExcCveStCtobloq((String) objectData.getData("EXC_CVE_ST_CTOBLOQ"));
        result.setExcCveStExencau((String) objectData.getData("EXC_CVE_ST_EXENCAU"));

        return result;

    }

}
